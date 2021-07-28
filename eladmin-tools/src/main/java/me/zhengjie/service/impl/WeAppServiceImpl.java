/*
 *  Copyright 2019-2020 Zheng Jie
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *  http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */
package me.zhengjie.service.impl;

import com.alibaba.fastjson.JSONObject;
import lombok.RequiredArgsConstructor;
import me.zhengjie.domain.WeAppBanner;
import me.zhengjie.domain.WeAppConfig;
import me.zhengjie.domain.vo.KeyValueVo;
import me.zhengjie.repository.WeAppBannerRepository;
import me.zhengjie.repository.WeAppRepository;
import me.zhengjie.service.WeAppService;
import me.zhengjie.service.dto.WeAppBannerDto;
import me.zhengjie.service.dto.WeAppConfigDto;
import me.zhengjie.service.mapstruct.WeAppBannerMapper;
import me.zhengjie.service.mapstruct.WeAppConfigMapper;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import java.util.*;
import java.util.stream.Collectors;

/**
 * 小程序接口实现类
 */
@Service
@RequiredArgsConstructor
@CacheConfig(cacheNames = "weApp")
public class WeAppServiceImpl implements WeAppService {

    private final WeAppRepository weAppRepository;
    private final WeAppBannerRepository bannerRepository;
    private final WeAppConfigMapper configMapper;
    private final WeAppBannerMapper bannerMapper;

    @Override
    @Cacheable(key = "'config'")
    public WeAppConfig find() {
        Optional<WeAppConfig> weAppConfig = weAppRepository.findById("Init");
        return weAppConfig.orElseGet(WeAppConfig::new);
    }

    @Override
    @Cacheable(key = "'appConfig'")
    public Map getConfig(String keys) {

        String[] split = keys.split(",");
        Set<String> keysSet = new HashSet<>(Arrays.asList(split));
        LinkedHashSet<WeAppConfig> result = weAppRepository.findConfigById(keysSet);
        List<WeAppConfigDto> mapResult = result.stream().map(configMapper::toDto).collect(Collectors.toList());

        ArrayList dataList = new ArrayList();
	    for (WeAppConfigDto weAppConfigDto : mapResult) {
		    KeyValueVo vo = new KeyValueVo();
		    vo.setKey(weAppConfigDto.getConfigId());
		    vo.setValue(weAppConfigDto.getConfigName());
		    vo.setRemark(weAppConfigDto.getConfigDesc());
		    vo.setUpdateTime(weAppConfigDto.getUpdateTime());
		    dataList.add(vo);
	    }
        HashMap retMap = new HashMap();
        retMap.put("code", 0);
        retMap.put("data",dataList);
        return retMap;
    }

	@Override
	public Map getBanner(String type) {
		LinkedHashSet<WeAppBanner> banner = bannerRepository.getBannerByType(type);
		HashMap retMap = new HashMap();
		retMap.put("code", 0);
		List<WeAppBannerDto> collect = banner.stream().map(bannerMapper::toDto).collect(Collectors.toList());
		retMap.put("data",collect);

		if (collect.size() == 0) {
			retMap.put("code", -1);
		}
		return retMap;
	}

}

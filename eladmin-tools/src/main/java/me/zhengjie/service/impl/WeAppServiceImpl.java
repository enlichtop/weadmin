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
import me.zhengjie.domain.WeAppConfig;
import me.zhengjie.domain.vo.KeyValueVo;
import me.zhengjie.repository.WeAppRepository;
import me.zhengjie.service.WeAppService;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import java.util.*;

/**
 * 小程序接口实现类
 */
@Service
@RequiredArgsConstructor
@CacheConfig(cacheNames = "weApp")
public class WeAppServiceImpl implements WeAppService {

    private final WeAppRepository weAppRepository;

    @Override
    @Cacheable(key = "'config'")
    public WeAppConfig find() {
        Optional<WeAppConfig> weAppConfig = weAppRepository.findById("Init");
        return weAppConfig.orElseGet(WeAppConfig::new);
    }

    @Override
    @Cacheable(key = "'appConfig'")
    public Map getConfig(Object obj) {

        HashMap<String, Object> dataMap = new HashMap();
        dataMap.put("appName", "梁山一点通");
        ArrayList dataList = new ArrayList();
        Set<String> set = dataMap.keySet();
        for (String key : set) {
            KeyValueVo vo = new KeyValueVo();
            vo.setKey(key);
            vo.setValue(dataMap.get(key));
            dataList.add(vo);
        }

        HashMap retMap = new HashMap();
        retMap.put("code", 0);
        retMap.put("data",dataList);
        return retMap;
    }

}

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

import lombok.RequiredArgsConstructor;
import me.zhengjie.domain.*;
import me.zhengjie.domain.vo.KeyValueVo;
import me.zhengjie.repository.*;
import me.zhengjie.service.WeAppService;
import me.zhengjie.service.dto.*;
import me.zhengjie.service.mapstruct.*;
import me.zhengjie.utils.StringUtils;
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

    private final WeAppConfigRepository weAppConfigRepository;
    private final WeAppBannerRepository bannerRepository;
    private final WeAppCategoryRepository categoryRepository;
    private final WeAppGoodsRepository goodsRepository;
    private final WeAppCouponsRepository couponsRepository;
    private final WeAppNoticeRepository noticeRepository;
    private final WeAppSkuListRepository skuListRepository;

    private final WeAppConfigMapper configMapper;
    private final WeAppBannerMapper bannerMapper;
    private final WeAppCategoryMapper categoryMapper;
    private final WeAppGoodsMapper goodsMapper;
    private final WeAppCouponsMapper couponsMapper;
    private final WeAppNoticeMapper noticeMapper;
    private final WeAppSkuListMapper skuListMapper;

    @Override
    @Cacheable(key = "'config'")
    public WeAppConfig find() {
        Optional<WeAppConfig> weAppConfig = weAppConfigRepository.findById("Init");
        return weAppConfig.orElseGet(WeAppConfig::new);
    }

    @Override
    @Cacheable(key = "'appConfig'")
    public Map getConfig(String keys) {

        String[] split = keys.split(",");
        Set<String> keysSet = new HashSet<>(Arrays.asList(split));
        LinkedHashSet<WeAppConfig> result = weAppConfigRepository.findConfigById(keysSet);
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
			retMap.put("code", 0);
		}
		return retMap;
	}

	@Override
	public Map getAllCategory() {
		LinkedHashSet<WeAppCategory> allCategory = categoryRepository.getAllCategory();
		HashMap retMap = new HashMap();
		retMap.put("code", 0);
		List<WeAppCategoryDto> collect =
				allCategory.stream().map(categoryMapper::toDto).collect(Collectors.toList());
		retMap.put("data",collect);

		if (collect.size() == 0) {
			retMap.put("code", -1);
		}

		retMap.put("message", "success");
		return retMap;
	}

	@Override
	public Map getGoods(Map<String, String> goodsType) {
		LinkedHashSet<WeAppGoods> goods = null;
    	if ("1".equalsIgnoreCase(goodsType.get("recommendStatus"))) {
		    goods = goodsRepository.getRecomGoods();
	    } else {
			String page = goodsType.get("page");
			if (StringUtils.isEmpty(page)) {
				page = "1";
			}
			String pageSize = goodsType.get("pageSize");
			if (StringUtils.isEmpty(pageSize)) {
				pageSize = "1";
			}
			goods = goodsRepository.getRecomGoodsPage(page, pageSize);
	    }
		HashMap retMap = new HashMap();
		retMap.put("code", 0);
		List<WeAppGoodsDto> collect =
				goods.stream().map(goodsMapper::toDto).collect(Collectors.toList());
		retMap.put("data",collect);

		if (collect.size() == 0) {
			retMap.put("code", -1);
		}

		retMap.put("message", "success");
		return retMap;
	}

	@Override
	public Map getCoupons() {
		LinkedHashSet<WeAppCoupons> coupons = couponsRepository.getCoupons();
		HashMap retMap = new HashMap();
		retMap.put("code", 0);
		List<WeAppCouponsDto> collect =
				coupons.stream().map(couponsMapper::toDto).collect(Collectors.toList());
		retMap.put("data",collect);

		if (collect.size() == 0) {
			retMap.put("code", -1);
		}

		retMap.put("message", "success");
		return retMap;
	}

	@Override
	public Map getNotice() {
		LinkedHashSet<WeAppNotice> coupons = noticeRepository.getNotice();
		HashMap retMap = new HashMap();
		retMap.put("code", 0);
		List<WeAppNoticeDto> collect =
				coupons.stream().map(noticeMapper::toDto).collect(Collectors.toList());
		HashMap retData = new HashMap();
		retData.put("dataList", collect);
		retData.put("totalRow", collect.size());
		retData.put("totalPage", collect.size());
		retMap.put("data",retData);

		if (collect.size() == 0) {
			retMap.put("code", -1);
		}

		retMap.put("message", "success");
		return retMap;
	}

	@Override
	public Map getGoodsDetail(String goodsId) throws Exception {
		LinkedHashSet<WeAppGoods> goods = goodsRepository.getGoodsById(goodsId);
		HashMap retMap = new HashMap();
		retMap.put("code", 0);
		List<WeAppGoodsDto> collect =
				goods.stream().map(goodsMapper::toDto).collect(Collectors.toList());
		if (collect.size() == 0) {
			throw new Exception();
		}

		LinkedHashSet<WeAppCategory> cate = categoryRepository.getCateById(collect.get(0).getCategoryId());
		List<WeAppCategoryDto> cateCollect =
				cate.stream().map(categoryMapper::toDto).collect(Collectors.toList());

		HashMap retData = new HashMap();
		retData.put("basicInfo", collect.get(0));
		retData.put("category", cateCollect.get(0));
		retData.put("content", "<p><img src=\"http://enlich.top:8009/img/f001.jpg\" alt=\"WiFi打印机\" />" +
				"<img src=\"http://enlich.top:8009/img/f002.jpg\"" +
				" alt=\"WiFi打印机优点\" /><img src=\"http://enlich.top:8009/img/f003.jpg\" " +
				"alt=\"飞鹅打印机5大优势。优势一：智能自动接单，自动打印服务\" />" +
				"<img src=\"http://enlich.top:8009/img/f004.jpg\" " +
				"alt=\"优势二：无需手机、电脑、驱动，简单便利。优势三：稳定云服务器，技术团体监控\" />" +
				"<img src=\"http://enlich.top:8009/img/f005.jpg\" " +
				"alt=\"优势四：支持多种开发语言，技术对接。优势五：云打印不受地理位置与距离影响\" />" +
				"<img src=\"\" " +
				"alt=\"产品细节特色：简单明了按钮与指示灯\" />" +
				"<img src=\"\" " +
				"alt=\"WiFi背面图操作说明\" />" +
				"<img src=\"\" " +
				"alt=\"高效｜环保热敏打印头\" />" +
				"<img src=\"\" " +
				"alt=\"简洁｜便利易装纸设计\" />" +
				"<img src=\"\" " +
				"alt=\"安全｜自动多种切纸款式\" />" +
				"<img src=\"\" " +
				"alt=\"产品实拍\" /></p>");
		retData.put("extJson", "");
		retData.put("logistics", "");
		retData.put("pics", "");
		retData.put("pics2", "");

		HashMap<String, Object> proHashMap1 = new HashMap<>();
		proHashMap1.put("name", "4G");
		HashMap<String, Object> proHashMap2 = new HashMap<>();
		proHashMap2.put("name", "5G");
		ArrayList faList1 = new ArrayList();
		faList1.add(proHashMap1);
		faList1.add(proHashMap2);
		HashMap<String, Object> faMap1 = new HashMap<>();
		faMap1.put("childsCurGoods", faList1);
		faMap1.put("name", "网络类型");

		ArrayList proRetList = new ArrayList();
		proRetList.add(faMap1);
		retData.put("properties", proRetList);

		LinkedHashSet<WeAppSkuList> skuList = skuListRepository.getSkuList(goodsId);
		retData.put("skuList", skuList);
		retMap.put("data",retData);

		if (collect.size() == 0) {
			retMap.put("code", -1);
		}

		retMap.put("message", "success");
		return retMap;
	}



	@Override
	public Map getSkuList(String goodsId) {
		return null;
	}

}

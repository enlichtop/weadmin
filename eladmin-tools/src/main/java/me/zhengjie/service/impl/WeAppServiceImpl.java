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

import com.alibaba.druid.util.StringUtils;
import com.alibaba.fastjson.JSON;
import lombok.RequiredArgsConstructor;
import me.zhengjie.domain.*;
import me.zhengjie.domain.vo.KeyValueVo;
import me.zhengjie.repository.*;
import me.zhengjie.service.WeAppService;
import me.zhengjie.service.dto.*;
import me.zhengjie.service.mapstruct.*;
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
            int page = 0;
            if (goodsType.get("page") != null) {
                page = Integer.parseInt(goodsType.get("page")) - 1;
            }
            int pageSize = 10;
            if (goodsType.get("pageSize") != null) {
                pageSize = Integer.parseInt(goodsType.get("pageSize"));
            }
            String categoryId = goodsType.get("categoryId");
            if (!StringUtils.isEmpty(categoryId)) {
                goods = goodsRepository.getGoodsPageAndCate(page * pageSize, pageSize, categoryId);
            } else {
                goods = goodsRepository.getRecomGoodsPage(page * pageSize, pageSize);
            }
        }
        HashMap retMap = new HashMap();
        retMap.put("code", 0);
        List<WeAppGoodsDto> collect =
                goods.stream().map(goodsMapper::toDto).collect(Collectors.toList());
        retMap.put("data",collect);

        retMap.put("message", "success");
        if (collect.size() == 0) {
            retMap.put("code", 700);
            retMap.put("message", "暂无数据");
        }

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
        LinkedHashSet<WeAppGoods> goods = goodsRepository.getGoodsDetailsById(goodsId);
        HashMap retMap = new HashMap();
        retMap.put("code", 0);
        List<WeAppGoodsDto> goodsDtos =
                goods.stream().map(goodsMapper::toDto).collect(Collectors.toList());
        if (goodsDtos.size() == 0) {
            throw new Exception();
        }

        LinkedHashSet<WeAppCategory> cate = categoryRepository.getCateById(goodsDtos.get(0).getCategoryId());
        List<WeAppCategoryDto> cateCollect =
                cate.stream().map(categoryMapper::toDto).collect(Collectors.toList());

        HashMap retData = new HashMap();
        retData.put("basicInfo", goodsDtos.get(0));
        retData.put("category", cateCollect.get(0));
        retData.put("content", goodsDtos.get(0).getGoodsDetailObj().getContentDetails());
        retData.put("extJson", "");
        retData.put("logistics", "");
        retData.put("pics", "");
        retData.put("pics2", "");

/*        HashMap<String, Object> proHashMap1 = new HashMap<>();
        proHashMap1.put("name", "1瓶(500ml)");
        HashMap<String, Object> proHashMap2 = new HashMap<>();
        proHashMap2.put("name", "1箱(6 * 500l)");
        ArrayList faList1 = new ArrayList();
        faList1.add(proHashMap1);
        faList1.add(proHashMap2);
        HashMap<String, Object> faMap1 = new HashMap<>();
        faMap1.put("childsCurGoods", faList1);
        faMap1.put("name", "规格");

        ArrayList proRetList = new ArrayList();
        proRetList.add(faMap1);
        retData.put("properties", proRetList);*/
        retData.put("properties",
                JSON.parse(goodsDtos.get(0).getGoodsDetailObj().getGoodsProperties()));
        LinkedHashSet<WeAppSkuList> skuList = skuListRepository.getSkuList(goodsId);
        retData.put("skuList", skuList);
        retMap.put("data",retData);

        if (goodsDtos.size() == 0) {
            retMap.put("code", -1);
        }

        retMap.put("message", "success");
        return retMap;
    }

    @Override
    public Map getGoodsAddition(String goodsId) {
        HashMap<String, Object> retMap = new HashMap<>();
        retMap.put("code", 0);
        ArrayList<HashMap> retList = new ArrayList<>();
        HashMap<String, Object> infoMap = new HashMap<>();
        infoMap.put("id", 41);
        infoMap.put("name", "规格");
        infoMap.put("price", 1);
        infoMap.put("pid", 1);
        HashMap<String, Object> subInfo = new HashMap<>();
        subInfo.put("id", 41);
        subInfo.put("name", "自己对接");
        subInfo.put("pid", 411);
        subInfo.put("price", 22);
        ArrayList list= new ArrayList();
        list.add(subInfo);
        infoMap.put("items", list);
        retList.add(infoMap);
        retMap.put("data", retList);
        retMap.put("msg", "success");
        return retMap;
    }


    @Override
    public Map getSkuList(String goodsId) {
        return null;
    }

    @Override
    public Map getNoticeDetail() {


        HashMap<String, Object> retMap = new HashMap<>();

        HashMap<String, String> dataMap = new HashMap<>();
        dataMap.put("content", "<h1>中国人民政治协商会议第十届梁山县委员会第五次会议开幕</h1>" +
                "<img src=\"http://www.liangshan.gov.cn/picture/-1/e4c0e08d6d4e4c94b6ceaab716fec6ca.png\">" +
                "<h3>&nbsp;&nbsp;&nbsp;&nbsp;2月3日上午9:00时，中国人民政治协商会议第十届梁山县委员会第五次会议在梁山会堂隆重开幕。</br>\n" +
                "&nbsp;&nbsp;&nbsp;&nbsp;县领导贾治阜、杨力新、秦延信、楚宪海、刘勇、李文凯、周菊兰、窦令胜、刘征、王学灵、刘超波、梁开平、" +
                "于安玲、孔祥华，县政协秘书长宋秀梅在主席台前排就座。在主席台就座的还有县法院院长李士强、" +
                "县人民检察院检察长周文军，往届部分县政协主席、副主席、秘书长，驻梁省、市政协委员、" +
                "县政协特邀文史研究员、县直有关部门单位负责人应邀出席大会。</br>\n" +
                "&nbsp;&nbsp;&nbsp;&nbsp;县政协党组副书记刘超波主持开幕式。</br>\n" +
                "&nbsp;&nbsp;&nbsp;&nbsp;县委书记贾治阜代表县委向大会致以热烈的祝贺并讲话。</br>\n" +
                "&nbsp;&nbsp;&nbsp;&nbsp;县政协主席楚宪海向大会作中国人民政治协商会议第十届梁山县委员会常务委员会工作报告。</br>\n" +
                "&nbsp;&nbsp;&nbsp;&nbsp;县政协副主席孔祥华作中国人民政治协商会议第十届梁山县委员会常务委员会关于四次会议以来提案工作情况的报告。 </h3>");
        dataMap.put("title", "中国人民政治协商会议第十届梁山县委员会第五次会议开幕");
        retMap.put("data", dataMap);
        retMap.put("code", 0);
        return retMap;
    }

}

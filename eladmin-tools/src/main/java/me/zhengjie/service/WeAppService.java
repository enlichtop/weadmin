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
package me.zhengjie.service;

import me.zhengjie.domain.AlipayConfig;
import me.zhengjie.domain.WeAppConfig;
import me.zhengjie.domain.vo.TradeVo;
import org.springframework.data.jpa.repository.Query;

import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * 小程序接口类
 */
public interface WeAppService {

    /**
     * 查询配置
     * @return WeAppConfig
     */
    WeAppConfig find();

    /**
     * 查询配置
     */
    Map getConfig(String keys);

    /**
     * 查询轮播图
     */
    Map getBanner(String type);

    /**
     * 查询所有目录
     */
    Map getAllCategory();

    /**
     * 查询商品
     */
    Map getGoods(Map<String, String> goodsType);

    /**
     * 获取优惠券
     */
    Map getCoupons();

    /**
     * 获取注意
     */
    Map getNotice();

    /**
     * 获取商品详情
     * @param goodsId
     * @return
     */
    Map getGoodsDetail(String goodsId) throws Exception;

    /**
     * 获取商品附加信息
     * @param goodsId
     * @return
     */
    Map getGoodsAddition(String goodsId);

    /**
     * 获取商品类型
     */
    Map getSkuList(String goodsId);

    /**
     * 获取注意详情
     * @return
     */
    Map getNoticeDetail();
}

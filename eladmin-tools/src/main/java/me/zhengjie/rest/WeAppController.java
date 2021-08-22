package me.zhengjie.rest;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import me.zhengjie.annotation.AnonymousAccess;
import me.zhengjie.domain.WeAppConfig;
import me.zhengjie.service.WeAppService;
import me.zhengjie.utils.WeAppUtils;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import springfox.documentation.annotations.ApiIgnore;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @ClassName WeAppController
 * @Description 小程序api接口类
 * @Author lichen
 * @Date 2021/7/25 18:37
 * @Version 1.0
 **/

@Slf4j
@RestController
@RequiredArgsConstructor
@RequestMapping("/api/weApp")
@Api(tags = "小程序控制层")
public class WeAppController {


	private final WeAppUtils weAppUtils;
	private final WeAppService weAppService;

	@ApiIgnore
	@RequestMapping("/queryConfig")
	@AnonymousAccess
	@ApiOperation("小程序获取配置信息")
	public ResponseEntity<WeAppConfig> queryConfig() {
		return new ResponseEntity<>(weAppService.find(), HttpStatus.OK);
	}


	/**
	 * 批量查询小程序配置
	 * @param request
	 * @param response
	 * @return
	 */
	@ApiIgnore
	@RequestMapping("/getConfig")
	@AnonymousAccess
	@ApiOperation("小程序获取配置信息")
	public ResponseEntity<Map> getConfig(HttpServletRequest request, HttpServletResponse response) {
		String keys = request.getParameter("keys");
		return new ResponseEntity<>(weAppService.getConfig(keys), HttpStatus.OK);
	}

	/**
	 * 获取轮播图
	 * @param request
	 * @param response
	 * @return
	 */
	@ApiIgnore
	@RequestMapping("/banner/list")
	@AnonymousAccess
	@ApiOperation("轮播图获取")
	public ResponseEntity<Map> getBanner(HttpServletRequest request, HttpServletResponse response) {
		String type = request.getParameter("type");
		return new ResponseEntity<>(weAppService.getBanner(type), HttpStatus.OK);
	}


	/**
	 * 获取目录
	 * @return
	 */
	@ApiIgnore
	@RequestMapping("/shop/goods/category/all")
	@AnonymousAccess
	@ApiOperation("获取目录")
	public ResponseEntity<Map> getAllCategory() {
		return new ResponseEntity<>(weAppService.getAllCategory(), HttpStatus.OK);
	}

	/**
	 * 获取推荐商品
	 * @return
	 */
	@ApiIgnore
	@RequestMapping("/shop/goods/list")
	@AnonymousAccess
	@ApiOperation("获取商品")
	public ResponseEntity<Map> getGoods(HttpServletRequest request, HttpServletResponse response) {
		HashMap<String, String> param = new HashMap<>();
		param.put("recommendStatus", request.getParameter("recommendStatus"));
		param.put("categoryId", request.getParameter("categoryId"));
		param.put("page", request.getParameter("page"));
		param.put("pageSize", request.getParameter("pageSize"));
		return new ResponseEntity<>(weAppService.getGoods(param), HttpStatus.OK);
	}


	/**
	 * 获取优惠券
	 * @return
	 */
	@ApiIgnore
	@RequestMapping("/discounts/coupons")
	@AnonymousAccess
	@ApiOperation("获取优惠券")
	public ResponseEntity<Map> getCoupons() {
		return new ResponseEntity<>(weAppService.getCoupons(), HttpStatus.OK);
	}

	/**
	 * 获取优惠券
	 * @return
	 */
	@ApiIgnore
	@RequestMapping("/notice/list")
	@AnonymousAccess
	@ApiOperation("获取注意")
	public ResponseEntity<Map> getNotice() {
		return new ResponseEntity<>(weAppService.getNotice(), HttpStatus.OK);
	}

	/**
	 * 获取商品详情
	 * @return
	 */
	@ApiIgnore
	@RequestMapping("/shop/goods/detail")
	@AnonymousAccess
	@ApiOperation("获取商品详情")
	public ResponseEntity<Map> getNotice(HttpServletRequest request, HttpServletResponse response) throws Exception {
		String goodsId = request.getParameter("id");
		return new ResponseEntity<>(weAppService.getGoodsDetail(goodsId), HttpStatus.OK);
	}
}

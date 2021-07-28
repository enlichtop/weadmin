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
@Api(tags = "工具：支付宝管理")
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

	@ApiIgnore
	@RequestMapping("/getConfig")
	@AnonymousAccess
	@ApiOperation("小程序获取配置信息")
	public ResponseEntity<Map> getConfig(HttpServletRequest request, HttpServletResponse response) {
		String keys = request.getParameter("keys");
		return new ResponseEntity<>(weAppService.getConfig(keys), HttpStatus.OK);
	}

}
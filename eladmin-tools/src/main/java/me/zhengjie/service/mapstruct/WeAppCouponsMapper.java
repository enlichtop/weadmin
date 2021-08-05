package me.zhengjie.service.mapstruct;

import me.zhengjie.base.BaseMapper;
import me.zhengjie.domain.WeAppCoupons;
import me.zhengjie.service.dto.WeAppCouponsDto;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

/**
 * @ClassName WeAppCouponsDto
 * @Description TODO
 * @Author lichen
 * @Date 2021/8/3 21:53
 * @Version 1.0
 **/
@Mapper(componentModel = "spring",unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface WeAppCouponsMapper extends BaseMapper<WeAppCouponsDto, WeAppCoupons> {
}

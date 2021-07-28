package me.zhengjie.service.mapstruct;

import me.zhengjie.base.BaseMapper;
import me.zhengjie.domain.WeAppBanner;
import me.zhengjie.service.dto.WeAppBannerDto;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

/**
 * @InterfaceName WeAppBannerMapper
 * @Description TODO
 * @Author lichen
 * @Date 2021/7/28 22:59
 * @Version 1.0
 **/
@Mapper(componentModel = "spring",unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface WeAppBannerMapper extends BaseMapper<WeAppBannerDto, WeAppBanner> {

}

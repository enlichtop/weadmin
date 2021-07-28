package me.zhengjie.service.mapstruct;

import me.zhengjie.base.BaseMapper;
import me.zhengjie.domain.WeAppConfig;
import me.zhengjie.service.dto.WeAppConfigDto;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

/**
 * @InterfaceName WeAppConfigMapper
 * @Description TODO
 * @Author lichen
 * @Date 2021/7/28 21:56
 * @Version 1.0
 **/
@Mapper(componentModel = "spring",unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface WeAppConfigMapper extends BaseMapper<WeAppConfigDto, WeAppConfig> {

}

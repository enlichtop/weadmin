package me.zhengjie.service.mapstruct;

import me.zhengjie.base.BaseMapper;
import me.zhengjie.domain.WeAppCategory;
import me.zhengjie.service.dto.WeAppCategoryDto;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

/**
 * @InterfaceName WeAppCategoryMapper
 * @Description TODO
 * @Author lichen
 * @Date 2021/7/30 21:58
 * @Version 1.0
 **/
@Mapper(componentModel = "spring",unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface WeAppCategoryMapper extends BaseMapper<WeAppCategoryDto, WeAppCategory> {

}

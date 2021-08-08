package me.zhengjie.service.mapstruct;

import me.zhengjie.base.BaseMapper;
import me.zhengjie.domain.WeAppSkuList;
import me.zhengjie.service.dto.WeAppSkuListDto;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

/**
 * @InterfaceName WeAppSkuListMapper
 * @Description TODO
 * @Author lichen
 * @Date 2021/8/7 0:16
 * @Version 1.0
 **/
@Mapper(componentModel = "spring",unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface WeAppSkuListMapper extends BaseMapper<WeAppSkuListDto, WeAppSkuList> {

}

package me.zhengjie.service.mapstruct;

import me.zhengjie.base.BaseMapper;
import me.zhengjie.domain.WeAppGoods;
import me.zhengjie.service.dto.WeAppGoodsDto;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

/**
 * @InterfaceName WeAppGoodsMapper
 * @Description TODO
 * @Author lichen
 * @Date 2021/8/2 22:37
 * @Version 1.0
 **/
@Mapper(componentModel = "spring",unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface WeAppGoodsMapper extends BaseMapper<WeAppGoodsDto, WeAppGoods> {

}

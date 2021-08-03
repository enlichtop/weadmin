package me.zhengjie.repository;

import me.zhengjie.domain.WeAppGoods;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.LinkedHashSet;

/**
 * @InterfaceName WeAppGoodsRepository
 * @Description 商品仓库接口类
 * @Author lichen
 * @Date 2021/8/2 22:22
 * @Version 1.0
 **/
public interface WeAppGoodsRepository extends JpaRepository<WeAppGoods,String> {

	/**
	 * 查询推荐商品
	 */
	@Query(value = "SELECT m.* FROM weapp_goods m WHERE " +
			"RECOMMENDSTATUS = 1",nativeQuery = true)
	LinkedHashSet<WeAppGoods> getRecomGoods();
}

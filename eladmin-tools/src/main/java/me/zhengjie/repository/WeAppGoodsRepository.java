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

	/**
	 * 根据id查商品
	 */
	@Query(value = "SELECT m.* FROM weapp_goods m WHERE " +
			"ID = ?1",nativeQuery = true)
	LinkedHashSet<WeAppGoods> getGoodsById(String goodsId);

	/**
	 * 根据id查商品详情
	 */
	@Query(value = "SELECT m.*, n.* FROM weapp_goods m, weapp_goods_detail n WHERE " +
			"m.ID = ?1 AND m.id = n.id",nativeQuery = true)
	LinkedHashSet<WeAppGoods> getGoodsDetailsById(String goodsId);

	/**
	 * 根据页码查商品
	 */
	@Query(value = "SELECT m.* FROM weapp_goods m LIMIT ?1, ?2",nativeQuery = true)
	LinkedHashSet<WeAppGoods> getRecomGoodsPage(int page, int pageSize);

	/**
	 * 根据页码+目录id
	 * @param i
	 * @param pageSize
	 * @param categoryId
	 * @return
	 */
	@Query(value = "SELECT m.* FROM weapp_goods m where categoryId = ?3 LIMIT ?1, ?2",nativeQuery = true)
	LinkedHashSet<WeAppGoods> getGoodsPageAndCate(int i, int pageSize, String categoryId);
}

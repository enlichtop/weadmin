package me.zhengjie.repository;

import me.zhengjie.domain.WeAppSkuList;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.LinkedHashSet;

/**
 * @ClassName WeAppSkuListRepository
 * @Description TODO
 * @Author lichen
 * @Date 2021/8/7 0:02
 * @Version 1.0
 **/
public interface WeAppSkuListRepository extends JpaRepository<WeAppSkuList,String> {
	/**
	 * 查询类型
	 */
	@Query(value = "SELECT m.* FROM weapp_skulist m where m.goodsid = ?1",nativeQuery = true)
	LinkedHashSet<WeAppSkuList> getSkuList(String goodsId);
}

package me.zhengjie.repository;

import me.zhengjie.domain.WeAppCategory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.LinkedHashSet;

/**
 * @ClassName WeAppCategoryRepository
 * @Description TODO
 * @Author lichen
 * @Date 2021/7/30 22:10
 * @Version 1.0
 **/
public interface WeAppCategoryRepository extends JpaRepository<WeAppCategory,String> {

	/**
	 * 查询目录
	 */
	@Query(value = "SELECT m.* FROM weapp_category m ", nativeQuery = true)
	LinkedHashSet<WeAppCategory> getAllCategory();
}

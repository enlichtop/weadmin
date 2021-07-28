package me.zhengjie.repository;

import me.zhengjie.domain.WeAppBanner;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.LinkedHashSet;

/**
 * @InterfaceName WeAppBannerRepository
 * @Description TODO
 * @Author lichen
 * @Date 2021/7/29 0:07
 * @Version 1.0
 **/
public interface WeAppBannerRepository  extends JpaRepository<WeAppBanner ,String> {

	/**
	 * 查询轮播图
	 */
	@Query(value = "SELECT m.* FROM weapp_banner m WHERE " +
			"m.type = ?1", nativeQuery = true)
	LinkedHashSet<WeAppBanner> getBannerByType(String type);
}

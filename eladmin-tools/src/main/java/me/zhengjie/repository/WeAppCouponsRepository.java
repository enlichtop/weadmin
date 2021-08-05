package me.zhengjie.repository;

import me.zhengjie.domain.WeAppCoupons;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.LinkedHashSet;

/**
 * @InterfaceName WeAppCouponsRepository
 * @Description 红包仓库接口类
 * @Author lichen
 * @Date 2021/8/3 21:55
 * @Version 1.0
 **/
public interface WeAppCouponsRepository extends JpaRepository<WeAppCoupons,String> {

	/**
	 * 查询优惠券
	 */
	@Query(value = "SELECT m.* FROM WEPAPP_COUPONS m ",nativeQuery = true)
	LinkedHashSet<WeAppCoupons> getCoupons();
}

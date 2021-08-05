package me.zhengjie.repository;

import me.zhengjie.domain.WeAppNotice;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.LinkedHashSet;

/**
 * @InterfaceName WeAppCouponsRepository
 * @Description "注意信息"仓库接口类
 * @Author lichen
 * @Date 2021/8/3 21:55
 * @Version 1.0
 **/
public interface WeAppNoticeRepository extends JpaRepository<WeAppNotice,String> {

	/**
	 * 查询注意
	 */
	@Query(value = "SELECT m.* FROM weapp_notice m ",nativeQuery = true)
	LinkedHashSet<WeAppNotice> getNotice();
}

package com.xin.mall.coupon.dao;

import com.xin.mall.coupon.entity.CouponEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 优惠券信息
 * 
 * @author xinwb
 * @email endless_2010@126.com
 * @date 2022-02-08 11:20:14
 */
@Mapper
public interface CouponDao extends BaseMapper<CouponEntity> {
	
}

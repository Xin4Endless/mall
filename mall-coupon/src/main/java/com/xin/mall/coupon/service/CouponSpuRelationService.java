package com.xin.mall.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.xin.common.utils.PageUtils;
import com.xin.mall.coupon.entity.CouponSpuRelationEntity;

import java.util.Map;

/**
 * 优惠券与产品关联
 *
 * @author xinwb
 * @email endless_2010@126.com
 * @date 2022-02-08 11:20:14
 */
public interface CouponSpuRelationService extends IService<CouponSpuRelationEntity> {

    PageUtils queryPage(Map<String, Object> params);
}


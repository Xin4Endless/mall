package com.xin.mall.order.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.xin.common.utils.PageUtils;
import com.xin.mall.order.entity.OrderEntity;

import java.util.Map;

/**
 * 订单
 *
 * @author xinwb
 * @email endless_2010@126.com
 * @date 2022-02-08 11:55:08
 */
public interface OrderService extends IService<OrderEntity> {

    PageUtils queryPage(Map<String, Object> params);
}


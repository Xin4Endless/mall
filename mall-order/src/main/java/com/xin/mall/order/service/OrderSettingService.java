package com.xin.mall.order.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.xin.common.utils.PageUtils;
import com.xin.mall.order.entity.OrderSettingEntity;

import java.util.Map;

/**
 * 订单配置信息
 *
 * @author xinwb
 * @email endless_2010@126.com
 * @date 2022-02-08 11:55:07
 */
public interface OrderSettingService extends IService<OrderSettingEntity> {

    PageUtils queryPage(Map<String, Object> params);
}


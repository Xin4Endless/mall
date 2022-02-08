package com.xin.mall.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.xin.common.utils.PageUtils;
import com.xin.mall.coupon.entity.SeckillSessionEntity;

import java.util.Map;

/**
 * 秒杀活动场次
 *
 * @author xinwb
 * @email endless_2010@126.com
 * @date 2022-02-08 11:20:13
 */
public interface SeckillSessionService extends IService<SeckillSessionEntity> {

    PageUtils queryPage(Map<String, Object> params);
}


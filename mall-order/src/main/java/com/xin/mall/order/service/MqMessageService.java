package com.xin.mall.order.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.xin.common.utils.PageUtils;
import com.xin.mall.order.entity.MqMessageEntity;

import java.util.Map;

/**
 * 
 *
 * @author xinwb
 * @email endless_2010@126.com
 * @date 2022-02-08 11:55:08
 */
public interface MqMessageService extends IService<MqMessageEntity> {

    PageUtils queryPage(Map<String, Object> params);
}


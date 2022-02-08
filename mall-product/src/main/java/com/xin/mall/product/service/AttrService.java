package com.xin.mall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.xin.common.utils.PageUtils;
import com.xin.mall.product.entity.AttrEntity;

import java.util.Map;

/**
 * 商品属性
 *
 * @author xinwb
 * @email endless_2010@126.com
 * @date 2022-02-08 12:01:42
 */
public interface AttrService extends IService<AttrEntity> {

    PageUtils queryPage(Map<String, Object> params);
}


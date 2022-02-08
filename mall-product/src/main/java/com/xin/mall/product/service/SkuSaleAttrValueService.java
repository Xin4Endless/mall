package com.xin.mall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.xin.common.utils.PageUtils;
import com.xin.mall.product.entity.SkuSaleAttrValueEntity;

import java.util.Map;

/**
 * sku销售属性&值
 *
 * @author xinwb
 * @email endless_2010@126.com
 * @date 2022-02-08 12:01:41
 */
public interface SkuSaleAttrValueService extends IService<SkuSaleAttrValueEntity> {

    PageUtils queryPage(Map<String, Object> params);
}


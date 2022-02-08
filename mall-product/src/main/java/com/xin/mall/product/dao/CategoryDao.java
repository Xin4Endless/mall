package com.xin.mall.product.dao;

import com.xin.mall.product.entity.CategoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品三级分类
 * 
 * @author xinwb
 * @email endless_2010@126.com
 * @date 2022-02-08 12:01:41
 */
@Mapper
public interface CategoryDao extends BaseMapper<CategoryEntity> {
	
}

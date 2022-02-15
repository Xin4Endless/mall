package com.xin.mall.product.service.impl;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.xin.common.utils.PageUtils;
import com.xin.common.utils.Query;

import com.xin.mall.product.dao.CategoryDao;
import com.xin.mall.product.entity.CategoryEntity;
import com.xin.mall.product.service.CategoryService;


@Service("categoryService")
public class CategoryServiceImpl extends ServiceImpl<CategoryDao, CategoryEntity> implements CategoryService {

    @Autowired
    private CategoryService categoryService;

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<CategoryEntity> page = this.page(
                new Query<CategoryEntity>().getPage(params),
                new QueryWrapper<CategoryEntity>()
        );

        return new PageUtils(page);
    }

    @Override
    public List<CategoryEntity> listWithTree() {

        List<CategoryEntity> list = categoryService.list(null);

        List<CategoryEntity> level1Menus = list.stream().filter(CategoryEntity ->
                CategoryEntity.getParentCid() == 0
        ).map((menu -> {
            menu.setChildren(getChildrens(menu,list));
            return menu;
        })).sorted((menu1,menu2) -> {
            return (menu1.getSort() == null ? 0 : menu1.getSort()) - (menu2.getSort() == null ? 0 : menu2.getSort());
        }).collect(Collectors.toList());

        return level1Menus;
    }

    @Override
    public void removeCategoryByIds(List<Long> asList) {
        //TODO 未实现业务逻辑，判断是否应该删除
        baseMapper.deleteBatchIds(asList);
    }

    private List<CategoryEntity> getChildrens(CategoryEntity root,List<CategoryEntity> allList){

        List<CategoryEntity> childrenList = allList.stream().filter(CategoryEntity -> {
            return CategoryEntity.getParentCid().equals(root.getCatId());
        }).map(CategoryEntity -> {
            CategoryEntity.setChildren(getChildrens(CategoryEntity,allList));
            return CategoryEntity;
        }).sorted((menu1,menu2) -> {
            return (menu1.getSort() == null ? 0 : menu1.getSort()) - (menu2.getSort() == null ? 0 : menu2.getSort());
        }).collect(Collectors.toList());

        return childrenList;
    }

}
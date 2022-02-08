package com.xin.mall.ware.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.xin.common.utils.PageUtils;
import com.xin.common.utils.Query;

import com.xin.mall.ware.dao.WmsWareOrderTaskDao;
import com.xin.mall.ware.entity.WmsWareOrderTaskEntity;
import com.xin.mall.ware.service.WmsWareOrderTaskService;


@Service("wmsWareOrderTaskService")
public class WmsWareOrderTaskServiceImpl extends ServiceImpl<WmsWareOrderTaskDao, WmsWareOrderTaskEntity> implements WmsWareOrderTaskService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<WmsWareOrderTaskEntity> page = this.page(
                new Query<WmsWareOrderTaskEntity>().getPage(params),
                new QueryWrapper<WmsWareOrderTaskEntity>()
        );

        return new PageUtils(page);
    }

}
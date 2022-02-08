package com.xin.mall.ware.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.xin.common.utils.PageUtils;
import com.xin.mall.ware.entity.UndoLogEntity;

import java.util.Map;

/**
 * 
 *
 * @author xinwb
 * @email endless_2010@126.com
 * @date 2022-02-08 12:03:08
 */
public interface UndoLogService extends IService<UndoLogEntity> {

    PageUtils queryPage(Map<String, Object> params);
}


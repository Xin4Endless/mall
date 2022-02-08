package com.xin.mall.member.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.xin.common.utils.PageUtils;
import com.xin.mall.member.entity.UndoLogEntity;

import java.util.Map;

/**
 * 
 *
 * @author xinwb
 * @email endless_2010@126.com
 * @date 2022-02-08 11:59:44
 */
public interface UndoLogService extends IService<UndoLogEntity> {

    PageUtils queryPage(Map<String, Object> params);
}


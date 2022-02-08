package com.xin.mall.member.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.xin.common.utils.PageUtils;
import com.xin.mall.member.entity.MemberCollectSubjectEntity;

import java.util.Map;

/**
 * 会员收藏的专题活动
 *
 * @author xinwb
 * @email endless_2010@126.com
 * @date 2022-02-08 11:59:44
 */
public interface MemberCollectSubjectService extends IService<MemberCollectSubjectEntity> {

    PageUtils queryPage(Map<String, Object> params);
}


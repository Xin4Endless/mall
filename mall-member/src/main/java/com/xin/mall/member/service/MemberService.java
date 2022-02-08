package com.xin.mall.member.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.xin.common.utils.PageUtils;
import com.xin.mall.member.entity.MemberEntity;

import java.util.Map;

/**
 * 会员
 *
 * @author xinwb
 * @email endless_2010@126.com
 * @date 2022-02-08 11:59:45
 */
public interface MemberService extends IService<MemberEntity> {

    PageUtils queryPage(Map<String, Object> params);
}


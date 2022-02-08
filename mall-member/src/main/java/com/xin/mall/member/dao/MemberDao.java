package com.xin.mall.member.dao;

import com.xin.mall.member.entity.MemberEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员
 * 
 * @author xinwb
 * @email endless_2010@126.com
 * @date 2022-02-08 11:59:45
 */
@Mapper
public interface MemberDao extends BaseMapper<MemberEntity> {
	
}

package com.blackpanda.icemall.member.dao;

import com.blackpanda.icemall.member.entity.MemberEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员
 * 
 * @author BlackPanda
 * @email black_panda@qq.com
 * @date 2020-12-25 09:48:35
 */
@Mapper
public interface MemberDao extends BaseMapper<MemberEntity> {
	
}

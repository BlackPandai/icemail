package com.blackpanda.icemall.member.dao;

import com.blackpanda.icemall.member.entity.GrowthChangeHistoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 成长值变化历史记录
 * 
 * @author BlackPanda
 * @email black_panda@qq.com
 * @date 2020-12-25 09:48:35
 */
@Mapper
public interface GrowthChangeHistoryDao extends BaseMapper<GrowthChangeHistoryEntity> {
	
}

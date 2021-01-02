package com.blackpanda.icemall.product.dao;

import com.blackpanda.icemall.product.entity.CommentReplayEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品评价回复关系
 * 
 * @author BlackPanda
 * @email black_panda@qq.com
 * @date 2020-12-25 09:25:42
 */
@Mapper
public interface CommentReplayDao extends BaseMapper<CommentReplayEntity> {
	
}

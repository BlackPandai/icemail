package com.blackpanda.icemall.order.dao;

import com.blackpanda.icemall.order.entity.OrderOperateHistoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单操作历史记录
 * 
 * @author BlackPanda
 * @email black_panda@qq.com
 * @date 2020-12-25 09:46:23
 */
@Mapper
public interface OrderOperateHistoryDao extends BaseMapper<OrderOperateHistoryEntity> {
	
}

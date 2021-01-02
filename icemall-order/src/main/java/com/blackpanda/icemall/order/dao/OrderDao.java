package com.blackpanda.icemall.order.dao;

import com.blackpanda.icemall.order.entity.OrderEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单
 * 
 * @author BlackPanda
 * @email black_panda@qq.com
 * @date 2020-12-25 09:46:23
 */
@Mapper
public interface OrderDao extends BaseMapper<OrderEntity> {
	
}

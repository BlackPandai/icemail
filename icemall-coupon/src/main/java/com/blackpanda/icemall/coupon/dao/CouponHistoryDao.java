package com.blackpanda.icemall.coupon.dao;

import com.blackpanda.icemall.coupon.entity.CouponHistoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 优惠券领取历史记录
 * 
 * @author BlackPanda
 * @email black_panda@qq.com
 * @date 2020-12-25 10:13:50
 */
@Mapper
public interface CouponHistoryDao extends BaseMapper<CouponHistoryEntity> {
	
}

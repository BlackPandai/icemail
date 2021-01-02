package com.blackpanda.icemall.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.blackpanda.common.utils.PageUtils;
import com.blackpanda.icemall.coupon.entity.CouponSpuCategoryRelationEntity;

import java.util.Map;

/**
 * 优惠券分类关联
 *
 * @author BlackPanda
 * @email black_panda@qq.com
 * @date 2020-12-25 10:13:50
 */
public interface CouponSpuCategoryRelationService extends IService<CouponSpuCategoryRelationEntity> {

    PageUtils queryPage(Map<String, Object> params);
}


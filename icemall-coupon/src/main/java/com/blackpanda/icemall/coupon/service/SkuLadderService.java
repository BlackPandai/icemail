package com.blackpanda.icemall.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.blackpanda.common.utils.PageUtils;
import com.blackpanda.icemall.coupon.entity.SkuLadderEntity;

import java.util.Map;

/**
 * 商品阶梯价格
 *
 * @author BlackPanda
 * @email black_panda@qq.com
 * @date 2020-12-25 10:13:50
 */
public interface SkuLadderService extends IService<SkuLadderEntity> {

    PageUtils queryPage(Map<String, Object> params);
}


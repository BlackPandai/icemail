package com.blackpanda.icemall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.blackpanda.common.utils.PageUtils;
import com.blackpanda.icemall.product.entity.SpuCommentEntity;

import java.util.Map;

/**
 * 商品评价
 *
 * @author BlackPanda
 * @email black_panda@qq.com
 * @date 2020-12-25 09:25:42
 */
public interface SpuCommentService extends IService<SpuCommentEntity> {

    PageUtils queryPage(Map<String, Object> params);
}


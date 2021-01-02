package com.blackpanda.icemall.ware.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.blackpanda.common.utils.PageUtils;
import com.blackpanda.icemall.ware.entity.PurchaseDetailEntity;

import java.util.Map;

/**
 * 
 *
 * @author BlackPanda
 * @email black_panda@qq.com
 * @date 2020-12-25 09:50:49
 */
public interface PurchaseDetailService extends IService<PurchaseDetailEntity> {

    PageUtils queryPage(Map<String, Object> params);
}


package com.blackpanda.icemall.ware.dao;

import com.blackpanda.icemall.ware.entity.WareSkuEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品库存
 * 
 * @author BlackPanda
 * @email black_panda@qq.com
 * @date 2020-12-25 09:50:49
 */
@Mapper
public interface WareSkuDao extends BaseMapper<WareSkuEntity> {
	
}

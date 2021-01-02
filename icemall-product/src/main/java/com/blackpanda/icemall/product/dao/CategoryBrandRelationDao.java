package com.blackpanda.icemall.product.dao;

import com.blackpanda.icemall.product.entity.CategoryBrandRelationEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 品牌分类关联
 * 
 * @author BlackPanda
 * @email black_panda@qq.com
 * @date 2020-12-25 09:25:42
 */
@Mapper
public interface CategoryBrandRelationDao extends BaseMapper<CategoryBrandRelationEntity> {
	
}

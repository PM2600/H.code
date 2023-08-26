package com.cy.store.mapper;

import com.cy.store.vo.VeVO;

public interface VePhotoMapper {
    /**
     * 根据商品id查询农商品溯源信息
     * @param id 商品id
     * @return 匹配的商品详情，如果没有匹配的数据则返回null
     */
    VeVO showVeById(Integer id);
}
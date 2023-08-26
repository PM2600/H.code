package com.cy.store.service;

import com.cy.store.entity.Livestock;
import com.cy.store.entity.Pro;
import com.cy.store.entity.Product;
import com.cy.store.entity.Vegetable;

import java.util.List;

/** 处理商品数据的业务层接口 */
public interface IProductService {

    /**
     * 搜索框搜索
     * @param tit
     * @return
     */
    List<Pro> findByName(String tit);

    /**
     * 根据商品id查询商品
     * @param id 商品id
     * @return 匹配的商品，如果没有匹配的数据则返回null
     */
    Product findById(Integer id);


    /**
     * 上传牲畜图片
     * @param id 牲畜id
     * @param lstr_1 图片路径
     */
    //void UploadLivestockImages1(Integer id, String lstr_1);

}

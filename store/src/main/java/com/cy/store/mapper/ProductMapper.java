package com.cy.store.mapper;

import com.cy.store.entity.*;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/** 处理商品数据的持久层接口 */
public interface ProductMapper {

    /**
     * 搜索框搜索商品
     * @param tit 输入商品名字
     * @return
     */
    List<Pro> findByName(String tit);

    /**
     * 根据商品id查询商品详情
     * @param id 商品id
     * @return 匹配的商品详情，如果没有匹配的数据则返回null
     */
    Product findById(Integer id);

    /**
     * 更新商品状态
     * @param id 商品id
     * @return
     */
    Integer updateStatus(Integer id, Integer status);
}

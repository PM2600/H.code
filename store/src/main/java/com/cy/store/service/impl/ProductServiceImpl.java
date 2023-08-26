package com.cy.store.service.impl;

import com.cy.store.entity.Livestock;
import com.cy.store.entity.Pro;
import com.cy.store.entity.Product;
import com.cy.store.entity.Vegetable;
import com.cy.store.mapper.ProductMapper;
import com.cy.store.mapper.UserMapper;
import com.cy.store.service.IProductService;
import com.cy.store.service.ex.InsertException;
import com.cy.store.service.ex.ProductNotFoundException;
import com.cy.store.service.ex.UpdateException;
import com.cy.store.service.ex.UserNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/** 处理商品数据的业务层实现类 */
@Service
public class ProductServiceImpl implements IProductService {
    @Autowired
    private ProductMapper productMapper;

    @Override
    public List<Pro> findByName(String tit) {
        List<Pro> list = productMapper.findByName(tit);
        return list;
    }

    @Override
    public Product findById(Integer id) {
        // 根据参数id调用私有方法执行查询，获取商品数据
        Product product = productMapper.findById(id);
        // 判断查询结果是否为null
        if (product == null) {
            // 是：抛出ProductNotFoundException
            throw new ProductNotFoundException("尝试访问的商品数据不存在");
        }
        // 将查询结果中的部分属性设置为null
        //product.setPriority(null);
        product.setCreatedUser(null);
        product.setCreatedTime(null);
        product.setModifiedUser(null);
        product.setModifiedTime(null);
        // 返回查询结果
        return product;
    }


}
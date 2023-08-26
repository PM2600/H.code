package com.cy.store.service;

import com.cy.store.vo.VeVO;

public interface IVePhotoService {
    /**
     * 查询农产品溯源信息
     * @param id
     * @return
     */
    VeVO showVeById(Integer id);
}
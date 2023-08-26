package com.cy.store.service;

import com.cy.store.entity.*;

import java.util.Date;
import java.util.List;

public interface IAdminService {

    /**
     * 显示所有商品
     * @return
     */
    List<Product> findPro();

    /**
     * 显示所有用户
     * @return
     */
    List<User> findUser();

    /**
     * 管理员登录
     * @param username
     * @return
     */
    Admin login(String username, String password);

    /**
     * 上传商品图片
     * @param id
     * @param image1
     */
    void updatePhoto1(Integer id, String image1);
    void updatePhoto2(Integer id, String image2);
    void updatePhoto3(Integer id, String image3);
    void updatePhoto4(Integer id, String image4);
    void updatePhoto5(Integer id, String image5);

    /**
     * 插入商品
     * @param pro 商品
     */
    void addt_product(Product pro);

    /**
     * 插入农产品详细信息
     * @param vege
     */
    void ve_Insert(Vegetable vege);

    /**
     * 插入牧产品详细信息
     * @param live
     */
    void lv_Insert(Livestock live);

    /**
     * 删除商品
     * @param id 商品id
     */
    void t_proDelete(Integer id);

    /**
     * 上传蔬菜图片
     * @param id 蔬菜id
     * @param str_1 图片在数据库中路径
     */
    void UploadVegetableImages1(Integer id, String str_1);
    void UploadVegetableImages2(Integer id, String str_2);
    void UploadVegetableImages3(Integer id, String str_3);
    void UploadVegetableImages4(Integer id, String str_4);
    void UploadVegetableImages5(Integer id, String str_5);
    void UploadVegetableImages6(Integer id, String str_6);
    void UploadVegetableImages7(Integer id, String str_7);
    void UploadVegetableImages8(Integer id, String str_8);

    /**
     * 添加牲畜照片
     * @param id
     * @param lstr_1
     * @return
     */
    void updateLivestockPhoto1(Integer id, String lstr_1);
    void updateLivestockPhoto2(Integer id, String lstr_2);
    void updateLivestockPhoto3(Integer id, String lstr_3);
    void updateLivestockPhoto4(Integer id, String lstr_4);
    void updateLivestockPhoto5(Integer id, String lstr_5);
    void updateLivestockPhoto6(Integer id, String lstr_6);
    void updateLivestockPhoto7(Integer id, String lstr_7);
    void updateLivestockPhoto8(Integer id, String lstr_8);
    void updateLivestockPhoto9(Integer id, String lstr_9);
    void updateLivestockPhoto10(Integer id, String lstr_10);
    void updateLivestockPhoto11(Integer id, String lstr_11);
    void updateLivestockPhoto12(Integer id, String lstr_12);
    void updateLivestockPhoto13(Integer id, String lstr_13);
    void updateLivestockPhoto14(Integer id, String lstr_14);
    void updateLivestockPhoto15(Integer id, String lstr_15);
    void updateLivestockPhoto16(Integer id, String lstr_16);
    void updateLivestockPhoto17(Integer id, String lstr_17);
    void updateLivestockPhoto18(Integer id, String lstr_18);
    void updateLivestockPhoto19(Integer id, String lstr_19);
    void updateLivestockPhoto20(Integer id, String lstr_20);
    void updateLivestockPhoto21(Integer id, String lstr_21);
    void updateLivestockPhoto22(Integer id, String lstr_22);
    void updateLivestockPhoto23(Integer id, String lstr_23);
    void updateLivestockPhoto24(Integer id, String lstr_24);
    void updateSlaughter_ph(Integer id, String slaughter_ph);

    /**
     * 上传证书图片
     * @param id
     * @param certImag
     */
    void UploadCertImages(Integer id, String certImag);

    /**
     * 删除用户
     * @param id
     */
    void userDelete(Integer id);
}

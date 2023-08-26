package com.cy.store.mapper;

import com.cy.store.entity.*;

import java.net.Inet4Address;
import java.util.Date;
import java.util.List;

public interface AdminMapper {

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
     * 查询管理员
     * @param username 用户名
     * @return
     */
    Admin findAdByUsername(String username);

    /**
     * 上传商品图片
     * @param id
     * @param image1
     * @return
     */
    Integer updatePhoto1(Integer id, String image1);
    Integer updatePhoto2(Integer id, String image2);
    Integer updatePhoto3(Integer id, String image3);
    Integer updatePhoto4(Integer id, String image4);
    Integer updatePhoto5(Integer id, String image5);

    /**
     * 插入商品
     * @param pro
     * @return 影响的行数
     */
    Integer t_proInsert(Product pro);

    /**
     * 插入商品时插入农产品溯源表的id
     * @param
     * @return
     */
    Integer t_proInsertveId(VePhoto vp);

    /**
     * 插入商品时插入牧产品溯源表的id
     * @param
     * @return
     */
    Integer t_proInsertlvId(LvPhoto lp);

    /**
     * 插入农产品具体信息
     * @param vege
     * @return 影响的行数
     */
    Integer ve_Insert(Vegetable vege);

    /**
     * 插入牧产品具体信息
     * @param live
     * @return 影响的行数
     */
    Integer lv_Insert(Livestock live);

    /**
     * 管理员删除商品信息
     * @param id
     */
    void t_proDelete(Integer id);

    void vegeDelete(Integer id);
    void vegePhDelete(Integer id);


    void liveDelete(Integer id);
    void livePhDelete(Integer id);


    /**
     * 添加蔬菜照片
     * @param id 蔬菜id
     * @param str_1 蔬菜数据库中路径
     * @return 行数
     */
    Integer updateVegetablePhoto1(Integer id, String str_1);
    Integer updateVegetablePhoto2(Integer id, String str_2);
    Integer updateVegetablePhoto3(Integer id, String str_3);
    Integer updateVegetablePhoto4(Integer id, String str_4);
    Integer updateVegetablePhoto5(Integer id, String str_5);
    Integer updateVegetablePhoto6(Integer id, String str_6);
    Integer updateVegetablePhoto7(Integer id, String str_7);
    Integer updateVegetablePhoto8(Integer id, String str_8);

    /**
     * 添加农产品时间
     * @param id 农产品id
     * @param time 时间
     * @return
     */
    Integer updateVeTime1(Integer id, Date time);
    Integer updateVeTime2(Integer id, Date time);
    Integer updateVeTime3(Integer id, Date time);
    Integer updateVeTime4(Integer id, Date time);
    Integer updateVeTime5(Integer id, Date time);
    Integer updateVeTime6(Integer id, Date time);
    Integer updateVeTime7(Integer id, Date time);
    Integer updateVeTime8(Integer id, Date time);
    Integer updateVeTimeHa(Integer id, Date time);

    /**
     * 添加牲畜照片
     * @param id
     * @param lstr_1
     * @return
     */
    Integer updateLivestockPhoto1(Integer id, String lstr_1);
    Integer updateLivestockPhoto2(Integer id, String lstr_2);
    Integer updateLivestockPhoto3(Integer id, String lstr_3);
    Integer updateLivestockPhoto4(Integer id, String lstr_4);
    Integer updateLivestockPhoto5(Integer id, String lstr_5);
    Integer updateLivestockPhoto6(Integer id, String lstr_6);
    Integer updateLivestockPhoto7(Integer id, String lstr_7);
    Integer updateLivestockPhoto8(Integer id, String lstr_8);
    Integer updateLivestockPhoto9(Integer id, String lstr_9);
    Integer updateLivestockPhoto10(Integer id, String lstr_10);
    Integer updateLivestockPhoto11(Integer id, String lstr_11);
    Integer updateLivestockPhoto12(Integer id, String lstr_12);
    Integer updateLivestockPhoto13(Integer id, String lstr_13);
    Integer updateLivestockPhoto14(Integer id, String lstr_14);
    Integer updateLivestockPhoto15(Integer id, String lstr_15);
    Integer updateLivestockPhoto16(Integer id, String lstr_16);
    Integer updateLivestockPhoto17(Integer id, String lstr_17);
    Integer updateLivestockPhoto18(Integer id, String lstr_18);
    Integer updateLivestockPhoto19(Integer id, String lstr_19);
    Integer updateLivestockPhoto20(Integer id, String lstr_20);
    Integer updateLivestockPhoto21(Integer id, String lstr_21);
    Integer updateLivestockPhoto22(Integer id, String lstr_22);
    Integer updateLivestockPhoto23(Integer id, String lstr_23);
    Integer updateLivestockPhoto24(Integer id, String lstr_24);
    Integer updateSlaughter_ph(Integer id, String slaughter_ph);

    /**
     * 添加牲畜时间
     * @param id
     * @param time
     * @return
     */
    Integer updateLvTime1(Integer id, Date time);
    Integer updateLvTime2(Integer id, Date time);
    Integer updateLvTime3(Integer id, Date time);
    Integer updateLvTime4(Integer id, Date time);
    Integer updateLvTime5(Integer id, Date time);
    Integer updateLvTime6(Integer id, Date time);
    Integer updateLvTime7(Integer id, Date time);
    Integer updateLvTime8(Integer id, Date time);
    Integer updateLvTime9(Integer id, Date time);
    Integer updateLvTime10(Integer id, Date time);
    Integer updateLvTime11(Integer id, Date time);
    Integer updateLvTime12(Integer id, Date time);
    Integer updateLvTime13(Integer id, Date time);
    Integer updateLvTime14(Integer id, Date time);
    Integer updateLvTime15(Integer id, Date time);
    Integer updateLvTime16(Integer id, Date time);
    Integer updateLvTime17(Integer id, Date time);
    Integer updateLvTime18(Integer id, Date time);
    Integer updateLvTime19(Integer id, Date time);
    Integer updateLvTime20(Integer id, Date time);
    Integer updateLvTime21(Integer id, Date time);
    Integer updateLvTime22(Integer id, Date time);
    Integer updateLvTime23(Integer id, Date time);
    Integer updateLvTime24(Integer id, Date time);
    Integer updateslTime(Integer id, Date time);

    Integer updateslName(Integer id, String name);

    /**
     * 添加证书照片
     * @param id
     * @param certImag
     * @return
     */
    Integer updateCertPhoto(Integer id, String certImag);

    /**
     * 删除用户信息
     * @param id
     * @return
     */
    Integer userDelete(Integer id, Integer status);
}
package com.cy.store.service.impl;

import com.cy.store.entity.*;
import com.cy.store.mapper.AdminMapper;
import com.cy.store.mapper.CartMapper;
import com.cy.store.mapper.ProductMapper;
import com.cy.store.service.IAdminService;
import com.cy.store.service.ex.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
import java.util.logging.Level;

@Service
public class AdminServiceImpl implements IAdminService {
    @Autowired
    private AdminMapper adminMapper;
    @Autowired
    private ProductMapper productMapper;
    @Autowired
    private CartMapper cartMapper;

    @Override
    public List<Product> findPro() {
        return adminMapper.findPro();
    }

    @Override
    public List<User> findUser() {
        return adminMapper.findUser();
    }

    @Override
    public Admin login(String username, String password) {
        // 调用userMapper的findByUsername()方法，根据参数username查询用户数据
        Admin result = adminMapper.findAdByUsername(username);
        // 判断查询结果是否为null
        if (result == null) {
            // 是：抛出UserNotFoundException异常
            throw new UserNotFoundException("用户数据不存在的错误");
        }

        if (!result.getPassword().equals(password)) {
            // 是：抛出PasswordNotMatchException异常
            throw new PasswordNotMatchException("密码验证失败的错误");
        }
        return result;
    }

    @Override
    public void updatePhoto1(Integer id, String image1) {
        Integer row = adminMapper.updatePhoto1(id, image1);
        if(row != 1){
            throw new UpdateException("上传商品图片产生未知异常");
        }
    }
    @Override
    public void updatePhoto2(Integer id, String image2) {
        Integer row = adminMapper.updatePhoto2(id, image2);
        if(row != 1){
            throw new UpdateException("上传商品图片产生未知异常");
        }
    }
    @Override
    public void updatePhoto3(Integer id, String image3) {
        Integer row = adminMapper.updatePhoto3(id, image3);
        if(row != 1){
            throw new UpdateException("上传商品图片产生未知异常");
        }
    }
    @Override
    public void updatePhoto4(Integer id, String image4) {
        Integer row = adminMapper.updatePhoto4(id, image4);
        if(row != 1){
            throw new UpdateException("上产商品图片产生未知异常");
        }
    }
    @Override
    public void updatePhoto5(Integer id, String image5) {
        Integer row = adminMapper.updatePhoto5(id, image5);
        if(row != 1){
            throw new UpdateException("上传商品图片产生未知异常");
        }
    }


    @Override
    public void addt_product(Product pro) {
        Product result = productMapper.findById(pro.getId());
        if(result == null){
            Integer row1 = adminMapper.t_proInsert(pro);
            Integer row2 = 0;
            if(pro.getCategoryId() == 1){
                VePhoto vp = new VePhoto();
                vp.setId(pro.getId());
                row2 = adminMapper.t_proInsertveId(vp);
            }else{
                LvPhoto lp = new LvPhoto();
                lp.setId(pro.getId());
                row2 = adminMapper.t_proInsertlvId(lp);
            }

            if (row1 != 1 || row2 != 1) {
                throw new InsertException("录入商品数据时出现未知错误");
            }
        }else {
            System.out.println("商城中已经存在该商品！");
        }
    }

    @Override
    public void ve_Insert(Vegetable vege) {
        Integer row = adminMapper.ve_Insert(vege);
        if(row != 1){
            throw new InsertException("录入农产品数据时出现未知错误");
        }
    }

    @Override
    public void lv_Insert(Livestock live) {
        Integer row = adminMapper.lv_Insert(live);
        if(row != 1){
            throw new InsertException("录入牧产品数据时出现未知错误");
        }
    }

    @Override
    public void t_proDelete(Integer id) {
        Product product = productMapper.findById(id);
        if(product == null){
            System.out.println("商品不存在");
        }else{
            adminMapper.t_proDelete(id);
            Integer[] ids = {id};
            cartMapper.deleteVOByCids(ids);
            if(product.getCategoryId() == 1){
                adminMapper.vegeDelete(id);
                adminMapper.vegePhDelete(id);
            }else{
                adminMapper.liveDelete(id);
                adminMapper.livePhDelete(id);
            }
        }
    }

    @Override
    public void UploadVegetableImages1(Integer id, String str_1) {
        Integer row = adminMapper.updateVegetablePhoto1(id, str_1);
        Date now = new Date();
        adminMapper.updateVeTime1(id, now);
        if(row != 1){
            throw new UpdateException("更新蔬菜图片产生未知异常");
        }
    }
    @Override
    public void UploadVegetableImages2(Integer id, String str_2) {
        Integer row = adminMapper.updateVegetablePhoto2(id, str_2);
        Date now = new Date();
        adminMapper.updateVeTime2(id, now);
        if(row != 1){
            throw new UpdateException("更新蔬菜图片产生未知异常");
        }
    }
    @Override
    public void UploadVegetableImages3(Integer id, String str_3) {
        Integer row = adminMapper.updateVegetablePhoto3(id, str_3);
        Date now = new Date();
        adminMapper.updateVeTime3(id, now);
        if(row != 1){
            throw new UpdateException("更新蔬菜图片产生未知异常");
        }
    }
    @Override
    public void UploadVegetableImages4(Integer id, String str_4) {
        Integer row = adminMapper.updateVegetablePhoto4(id, str_4);
        Date now = new Date();
        adminMapper.updateVeTime4(id, now);
        if(row != 1){
            throw new UpdateException("更新蔬菜图片产生未知异常");
        }
    }
    @Override
    public void UploadVegetableImages5(Integer id, String str_5) {
        Integer row = adminMapper.updateVegetablePhoto5(id, str_5);
        Date now = new Date();
        adminMapper.updateVeTime5(id, now);
        if(row != 1){
            throw new UpdateException("更新蔬菜图片产生未知异常");
        }
    }
    @Override
    public void UploadVegetableImages6(Integer id, String str_6) {
        Integer row = adminMapper.updateVegetablePhoto6(id, str_6);
        Date now = new Date();
        adminMapper.updateVeTime6(id, now);
        if(row != 1){
            throw new UpdateException("更新蔬菜图片产生未知异常");
        }
    }
    @Override
    public void UploadVegetableImages7(Integer id, String str_7) {
        Integer row = adminMapper.updateVegetablePhoto7(id, str_7);
        Date now = new Date();
        adminMapper.updateVeTime7(id, now);
        if(row != 1){
            throw new UpdateException("更新蔬菜图片产生未知异常");
        }
    }
    @Override
    public void UploadVegetableImages8(Integer id, String str_8) {
        Integer row = adminMapper.updateVegetablePhoto8(id, str_8);
        Date now = new Date();
        adminMapper.updateVeTime8(id, now);
        adminMapper.updateVeTimeHa(id, now);
        if(row != 1){
            throw new UpdateException("更新蔬菜图片产生未知异常");
        }
    }

    @Override
    public void updateLivestockPhoto1(Integer id, String lstr_1) {
        Integer row = adminMapper.updateLivestockPhoto1(id, lstr_1);
        if(row != 1){
            throw new UpdateException("上传牲畜图片产生未知异常");
        }
    }
    @Override
    public void updateLivestockPhoto2(Integer id, String lstr_2) {
        Integer row = adminMapper.updateLivestockPhoto2(id, lstr_2);
        if(row != 1){
            throw new UpdateException("上传牲畜图片产生未知异常");
        }
    }

    @Override
    public void updateLivestockPhoto3(Integer id, String lstr_3) {
        Integer row = adminMapper.updateLivestockPhoto3(id, lstr_3);
        if(row != 1){
            throw new UpdateException("上传牲畜图片产生未知异常");
        }
    }

    @Override
    public void updateLivestockPhoto4(Integer id, String lstr_4) {
        Integer row = adminMapper.updateLivestockPhoto4(id, lstr_4);
        if(row != 1){
            throw new UpdateException("上传牲畜图片产生未知异常");
        }
    }

    @Override
    public void updateLivestockPhoto5(Integer id, String lstr_5) {
        Integer row = adminMapper.updateLivestockPhoto5(id, lstr_5);
        if(row != 1){
            throw new UpdateException("上传牲畜图片产生未知异常");
        }
    }

    @Override
    public void updateLivestockPhoto6(Integer id, String lstr_6) {
        Integer row = adminMapper.updateLivestockPhoto6(id, lstr_6);
        if(row != 1){
            throw new UpdateException("上传牲畜图片产生未知异常");
        }
    }

    @Override
    public void updateLivestockPhoto7(Integer id, String lstr_7) {
        Integer row = adminMapper.updateLivestockPhoto7(id, lstr_7);
        if(row != 1){
            throw new UpdateException("上传牲畜图片产生未知异常");
        }
    }

    @Override
    public void updateLivestockPhoto8(Integer id, String lstr_8) {
        Integer row = adminMapper.updateLivestockPhoto8(id, lstr_8);
        if(row != 1){
            throw new UpdateException("上传牲畜图片产生未知异常");
        }
    }

    @Override
    public void updateLivestockPhoto9(Integer id, String lstr_9) {
        Integer row = adminMapper.updateLivestockPhoto9(id, lstr_9);
        if(row != 1){
            throw new UpdateException("上传牲畜图片产生未知异常");
        }
    }

    @Override
    public void updateLivestockPhoto10(Integer id, String lstr_10) {
        Integer row = adminMapper.updateLivestockPhoto10(id, lstr_10);
        if(row != 1){
            throw new UpdateException("上传牲畜图片产生未知异常");
        }
    }

    @Override
    public void updateLivestockPhoto11(Integer id, String lstr_11) {
        Integer row = adminMapper.updateLivestockPhoto11(id, lstr_11);
        if(row != 1){
            throw new UpdateException("上传牲畜图片产生未知异常");
        }
    }

    @Override
    public void updateLivestockPhoto12(Integer id, String lstr_12) {
        Integer row = adminMapper.updateLivestockPhoto12(id, lstr_12);
        if(row != 1){
            throw new UpdateException("上传牲畜图片产生未知异常");
        }
    }

    @Override
    public void updateLivestockPhoto13(Integer id, String lstr_13) {
        Integer row = adminMapper.updateLivestockPhoto13(id, lstr_13);
        if(row != 1){
            throw new UpdateException("上传牲畜图片产生未知异常");
        }
    }

    @Override
    public void updateLivestockPhoto14(Integer id, String lstr_14) {
        Integer row = adminMapper.updateLivestockPhoto14(id, lstr_14);
        if(row != 1){
            throw new UpdateException("上传牲畜图片产生未知异常");
        }
    }

    @Override
    public void updateLivestockPhoto15(Integer id, String lstr_15) {
        Integer row = adminMapper.updateLivestockPhoto15(id, lstr_15);
        if(row != 1){
            throw new UpdateException("上传牲畜图片产生未知异常");
        }
    }

    @Override
    public void updateLivestockPhoto16(Integer id, String lstr_16) {
        Integer row = adminMapper.updateLivestockPhoto16(id, lstr_16);
        if(row != 1){
            throw new UpdateException("上传牲畜图片产生未知异常");
        }
    }

    @Override
    public void updateLivestockPhoto17(Integer id, String lstr_17) {
        Integer row = adminMapper.updateLivestockPhoto17(id, lstr_17);
        if(row != 1){
            throw new UpdateException("上传牲畜图片产生未知异常");
        }
    }

    @Override
    public void updateLivestockPhoto18(Integer id, String lstr_18) {
        Integer row = adminMapper.updateLivestockPhoto18(id, lstr_18);
        if(row != 1){
            throw new UpdateException("上传牲畜图片产生未知异常");
        }
    }

    @Override
    public void updateLivestockPhoto19(Integer id, String lstr_19) {
        Integer row = adminMapper.updateLivestockPhoto19(id, lstr_19);
        if(row != 1){
            throw new UpdateException("上传牲畜图片产生未知异常");
        }
    }

    @Override
    public void updateLivestockPhoto20(Integer id, String lstr_20) {
        Integer row = adminMapper.updateLivestockPhoto20(id, lstr_20);
        if(row != 1){
            throw new UpdateException("上传牲畜图片产生未知异常");
        }
    }

    @Override
    public void updateLivestockPhoto21(Integer id, String lstr_21) {
        Integer row = adminMapper.updateLivestockPhoto21(id, lstr_21);
        if(row != 1){
            throw new UpdateException("上传牲畜图片产生未知异常");
        }
    }

    @Override
    public void updateLivestockPhoto22(Integer id, String lstr_22) {
        Integer row = adminMapper.updateLivestockPhoto22(id, lstr_22);
        if(row != 1){
            throw new UpdateException("上传牲畜图片产生未知异常");
        }
    }

    @Override
    public void updateLivestockPhoto23(Integer id, String lstr_23) {
        Integer row = adminMapper.updateLivestockPhoto23(id, lstr_23);
        if(row != 1){
            throw new UpdateException("上传牲畜图片产生未知异常");
        }
    }

    @Override
    public void updateLivestockPhoto24(Integer id, String lstr_24) {
        Integer row = adminMapper.updateLivestockPhoto24(id, lstr_24);
        if(row != 1){
            throw new UpdateException("上传牲畜图片产生未知异常");
        }
    }

    @Override
    public void updateSlaughter_ph(Integer id, String slaughter_ph) {
        Integer row = adminMapper.updateSlaughter_ph(id, slaughter_ph);
        if(row != 1){
            throw new UpdateException("上传牲畜图片产生未知异常");
        }
    }


    @Override
    public void UploadCertImages(Integer id, String certImag){
        Integer row = adminMapper.updateCertPhoto(id, certImag);
        if(row != 1){
            throw new UpdateException("上传证书图片产生未知异常");
        }
    }

    @Override
    public void userDelete(Integer id) {
        Integer status = 1;
        Integer row = adminMapper.userDelete(id, status);
        if(row != 1){
            throw new DeleteException("删除用户信息产生未知异常");
        }
    }
}

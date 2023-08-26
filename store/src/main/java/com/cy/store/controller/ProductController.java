package com.cy.store.controller;

import com.cy.store.controller.ex.*;
import com.cy.store.entity.*;
import com.cy.store.mapper.AdminMapper;
import com.cy.store.mapper.UserMapper;
import com.cy.store.service.IProductService;
import com.cy.store.service.IUserService;
import com.cy.store.service.IVePhotoService;
import com.cy.store.util.JsonResult;
import com.cy.store.vo.CartVO;
import com.cy.store.vo.VeVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.system.ApplicationHome;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;
import sun.rmi.runtime.Log;

import javax.servlet.http.HttpSession;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("products")
public class ProductController extends BaseController {
    @Autowired
    private IProductService productService;
    @Autowired
    private IVePhotoService vePhotoService;

    @Autowired
    private AdminMapper adminMapper;;

    @GetMapping("search")
    public JsonResult<List<Pro>> getVOByUid(HttpSession session, String tit) {
        List<Pro> data = productService.findByName(tit);
        // 返回成功与数据
        return new JsonResult<List<Pro>>(OK, data);
    }

    @GetMapping("details")
    public JsonResult<Product> getById(Integer id) {
        // 调用业务对象执行获取数据
        Product data = productService.findById(id);
        // 返回成功和数据
        return new JsonResult<Product>(OK, data);
    }

    //溯源农产品
    @GetMapping("showvedetails")
    public JsonResult<VeVO> showVeById(Integer id) {
        // 调用业务对象执行获取数据
        VeVO data = vePhotoService.showVeById(id);
        // 返回成功和数据
        return new JsonResult<VeVO>(OK, data);
    }

}
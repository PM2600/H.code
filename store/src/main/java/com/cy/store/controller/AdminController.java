package com.cy.store.controller;

import com.cy.store.controller.ex.*;
import com.cy.store.entity.*;
import com.cy.store.mapper.AdminMapper;
import com.cy.store.service.IAdminService;
import com.cy.store.service.impl.AdminServiceImpl;
import com.cy.store.util.JsonResult;
import com.cy.store.vo.CartVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.system.ApplicationHome;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpSession;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("admin")
public class AdminController extends BaseController{
    @Autowired
    private IAdminService adminService;
    @Autowired
    private AdminMapper adminMapper;

    @GetMapping("/allpro")
    public JsonResult<List<Product>> findPro(){
        List<Product> data = adminService.findPro();
        // 返回成功与数据
        return new JsonResult<List<Product>>(OK, data);
    }

    @GetMapping("/alluser")
    public JsonResult<List<User>> findUser(){
        List<User> data = adminService.findUser();
        // 返回成功与数据
        return new JsonResult<List<User>>(OK, data);
    }

    @RequestMapping("login")
    public JsonResult<Admin> login(String username, String password, HttpSession session) {
        // 调用业务对象的方法执行登录，并获取返回值
        Admin data = adminService.login(username, password);
        //登录成功后，将uid和username存入到HttpSession中
        session.setAttribute("uid", data.getUid());
        session.setAttribute("username", data.getUsername());
        // 将以上返回值和状态码OK封装到响应结果中并返回
        return new JsonResult<Admin>(OK, data);
    }

    /** 商品图片文件大小的上限值(10MB) */
    public static final int PHOTO_MAX_SIZE = 10 * 1024 * 1024;
    /** 允许上传的商品图片的文件类型 */
    public static final List<String> PHOTO_TYPES = new ArrayList<String>();

    /** 初始化允许上传的图片的文件类型 */
    static {
        PHOTO_TYPES.add("image/jpeg");
        PHOTO_TYPES.add("image/png");
        PHOTO_TYPES.add("image/bmp");
        PHOTO_TYPES.add("image/gif");
    }

    @RequestMapping("up_Im1")
    public JsonResult<String> upIm1(Integer id, HttpSession session, MultipartFile file){
        if(file.isEmpty()){
            throw new FileEmptyException("文件为空");
        }
        if(file.getSize() > PHOTO_MAX_SIZE){
            throw new FileSizeException("文件超出限制");
        }
        String contentType = file.getContentType();
        // boolean contains(Object o)：当前列表若包含某元素，返回结果为true；若不包含该元素，返回结果为false
        if (!PHOTO_TYPES.contains(contentType)) {
            throw new FileTypeException("文件类型不支持");
        }

        String parent = session.getServletContext().getRealPath("/psource");
        File dir = new File(parent);
        if (!dir.exists()) {
            dir.mkdirs();
        }

        String suffix = "";
        String originalFilename = file.getOriginalFilename();
        int beginIndex = originalFilename.lastIndexOf(".");
        if (beginIndex > 0) {
            suffix = originalFilename.substring(beginIndex);
        }
        String filename = UUID.randomUUID().toString() + suffix;

        File dest = new File(dir, filename);
        try {
            file.transferTo(dest);
        } catch (IllegalStateException e) {
            // 抛出异常
            throw new FileStateException("文件状态异常，可能文件已被移动或删除");
        } catch (IOException e) {
            // 抛出异常
            throw new FileUploadIOException("上传文件时读写错误，请稍后重新尝试");
        }
        String Image = "/psource/" + filename;
        adminService.updatePhoto1(id, Image);
        return new JsonResult<String>(OK, Image);
    }
    @RequestMapping("up_Im2")
    public JsonResult<String> upIm2(Integer id, HttpSession session, MultipartFile file){
        if(file.isEmpty()){
            throw new FileEmptyException("文件为空");
        }
        if(file.getSize() > PHOTO_MAX_SIZE){
            throw new FileSizeException("文件超出限制");
        }
        String contentType = file.getContentType();
        // boolean contains(Object o)：当前列表若包含某元素，返回结果为true；若不包含该元素，返回结果为false
        if (!PHOTO_TYPES.contains(contentType)) {
            throw new FileTypeException("文件类型不支持");
        }

        String parent = session.getServletContext().getRealPath("/psource");
        File dir = new File(parent);
        if (!dir.exists()) {
            dir.mkdirs();
        }

        String suffix = "";
        String originalFilename = file.getOriginalFilename();
        int beginIndex = originalFilename.lastIndexOf(".");
        if (beginIndex > 0) {
            suffix = originalFilename.substring(beginIndex);
        }
        String filename = UUID.randomUUID().toString() + suffix;

        File dest = new File(dir, filename);
        try {
            file.transferTo(dest);
        } catch (IllegalStateException e) {
            // 抛出异常
            throw new FileStateException("文件状态异常，可能文件已被移动或删除");
        } catch (IOException e) {
            // 抛出异常
            throw new FileUploadIOException("上传文件时读写错误，请稍后重新尝试");
        }

        String Image = "/psource/" + filename;
        adminService.updatePhoto2(id, Image);
        return new JsonResult<String>(OK, Image);
    }
    @RequestMapping("up_Im3")
    public JsonResult<String> upIm3(Integer id, HttpSession session, MultipartFile file){
        if(file.isEmpty()){
            throw new FileEmptyException("文件为空");
        }
        if(file.getSize() > PHOTO_MAX_SIZE){
            throw new FileSizeException("文件超出限制");
        }
        String contentType = file.getContentType();
        // boolean contains(Object o)：当前列表若包含某元素，返回结果为true；若不包含该元素，返回结果为false
        if (!PHOTO_TYPES.contains(contentType)) {
            throw new FileTypeException("文件类型不支持");
        }

        String parent = session.getServletContext().getRealPath("/psource");
        File dir = new File(parent);
        if (!dir.exists()) {
            dir.mkdirs();
        }

        String suffix = "";
        String originalFilename = file.getOriginalFilename();
        int beginIndex = originalFilename.lastIndexOf(".");
        if (beginIndex > 0) {
            suffix = originalFilename.substring(beginIndex);
        }
        String filename = UUID.randomUUID().toString() + suffix;

        File dest = new File(dir, filename);
        try {
            file.transferTo(dest);
        } catch (IllegalStateException e) {
            // 抛出异常
            throw new FileStateException("文件状态异常，可能文件已被移动或删除");
        } catch (IOException e) {
            // 抛出异常
            throw new FileUploadIOException("上传文件时读写错误，请稍后重新尝试");
        }

        String Image = "/psource/" + filename;
        adminService.updatePhoto3(id, Image);
        return new JsonResult<String>(OK, Image);
    }
    @RequestMapping("up_Im4")
    public JsonResult<String> upIm4(Integer id, HttpSession session, MultipartFile file){
        if(file.isEmpty()){
            throw new FileEmptyException("文件为空");
        }
        if(file.getSize() > PHOTO_MAX_SIZE){
            throw new FileSizeException("文件超出限制");
        }
        String contentType = file.getContentType();
        // boolean contains(Object o)：当前列表若包含某元素，返回结果为true；若不包含该元素，返回结果为false
        if (!PHOTO_TYPES.contains(contentType)) {
            throw new FileTypeException("文件类型不支持");
        }

        String parent = session.getServletContext().getRealPath("/psource");
        File dir = new File(parent);
        if (!dir.exists()) {
            dir.mkdirs();
        }

        String suffix = "";
        String originalFilename = file.getOriginalFilename();
        int beginIndex = originalFilename.lastIndexOf(".");
        if (beginIndex > 0) {
            suffix = originalFilename.substring(beginIndex);
        }
        String filename = UUID.randomUUID().toString() + suffix;

        File dest = new File(dir, filename);
        try {
            file.transferTo(dest);
        } catch (IllegalStateException e) {
            // 抛出异常
            throw new FileStateException("文件状态异常，可能文件已被移动或删除");
        } catch (IOException e) {
            // 抛出异常
            throw new FileUploadIOException("上传文件时读写错误，请稍后重新尝试");
        }
        String Image = "/psource/" + filename;
        adminService.updatePhoto4(id, Image);
        return new JsonResult<String>(OK, Image);
    }
    @RequestMapping("up_Im5")
    public JsonResult<String> upIm5(Integer id, HttpSession session, MultipartFile file){
        if(file.isEmpty()){
            throw new FileEmptyException("文件为空");
        }
        if(file.getSize() > PHOTO_MAX_SIZE){
            throw new FileSizeException("文件超出限制");
        }
        String contentType = file.getContentType();
        // boolean contains(Object o)：当前列表若包含某元素，返回结果为true；若不包含该元素，返回结果为false
        if (!PHOTO_TYPES.contains(contentType)) {
            throw new FileTypeException("文件类型不支持");
        }

        String parent = session.getServletContext().getRealPath("/psource");
        File dir = new File(parent);
        if (!dir.exists()) {
            dir.mkdirs();
        }

        String suffix = "";
        String originalFilename = file.getOriginalFilename();
        int beginIndex = originalFilename.lastIndexOf(".");
        if (beginIndex > 0) {
            suffix = originalFilename.substring(beginIndex);
        }
        String filename = UUID.randomUUID().toString() + suffix;

        File dest = new File(dir, filename);
        try {
            file.transferTo(dest);
        } catch (IllegalStateException e) {
            // 抛出异常
            throw new FileStateException("文件状态异常，可能文件已被移动或删除");
        } catch (IOException e) {
            // 抛出异常
            throw new FileUploadIOException("上传文件时读写错误，请稍后重新尝试");
        }
        String Image = "/psource/" + filename;
        adminService.updatePhoto5(id, Image);
        return new JsonResult<String>(OK, Image);
    }

    @RequestMapping("add_to_t_product")
    public JsonResult<Void> addToProduct(Product prod) {

        adminService.addt_product(prod);

        if (prod.getCategoryId() == 1) {
            //农产品
            Vegetable vege = new Vegetable();
            vege.setId(prod.getId());
            adminService.ve_Insert(vege);
        } else if (prod.getCategoryId() == 2) {
            //牧产品
            Livestock live = new Livestock();
            live.setId(prod.getId());
            adminService.lv_Insert(live);
        }
        return new JsonResult<Void>(OK);
    }

    @RequestMapping("/prodchange")
    public JsonResult<Void> delete(Integer id){
        adminService.t_proDelete(id);
        return new JsonResult<Void>(OK);
    }

    /** 文件大小的上限值(10MB) */
    public static final int AVATAR_MAX_SIZE = 10 * 1024 * 1024;
    /** 允许上传的的文件类型 */
    public static final List<String> AVATAR_TYPES = new ArrayList<String>();

    /** 初始化允许上传的的文件类型 */
    static {
        AVATAR_TYPES.add("image/jpeg");
        AVATAR_TYPES.add("image/png");
        AVATAR_TYPES.add("image/bmp");
        AVATAR_TYPES.add("image/gif");
    }

    @RequestMapping("up_VeIm1")
    public JsonResult<String> upVeIm1(Integer id, HttpSession session, MultipartFile file){
        if(file.isEmpty()){
            throw new FileEmptyException("文件为空");
        }
        if(file.getSize() > AVATAR_MAX_SIZE){
            throw new FileSizeException("文件超出限制");
        }
        String contentType = file.getContentType();
        // boolean contains(Object o)：当前列表若包含某元素，返回结果为true；若不包含该元素，返回结果为false
        if (!AVATAR_TYPES.contains(contentType)) {
            throw new FileTypeException("文件类型不支持");
        }

        ApplicationHome ah = new ApplicationHome(getClass());
        File file3 = ah.getSource();
        String parent = file3.getParentFile()+"/Vsource".toString();

        File dir = new File(parent);
        if (!dir.exists()) {
            dir.mkdirs();
        }

        String suffix = "";
        String originalFilename = file.getOriginalFilename();
        int beginIndex = originalFilename.lastIndexOf(".");
        if (beginIndex > 0) {
            suffix = originalFilename.substring(beginIndex);
        }
        String filename = UUID.randomUUID().toString() + suffix;

        File dest = new File(dir, filename);
        try {
            file.transferTo(dest);
        } catch (IllegalStateException e) {
            // 抛出异常
            throw new FileStateException("文件状态异常，可能文件已被移动或删除");
        } catch (IOException e) {
            // 抛出异常
            throw new FileUploadIOException("上传文件时读写错误，请稍后重新尝试");
        }
        String Image = "/Vsource/" + filename;
        adminService.UploadVegetableImages1(id, Image);
        return new JsonResult<String>(OK, Image);
    }
    @RequestMapping("up_VeIm2")
    public JsonResult<String> upVeIm2(Integer id, HttpSession session, MultipartFile file){
        if(file.isEmpty()){
            throw new FileEmptyException("文件为空");
        }
        if(file.getSize() > AVATAR_MAX_SIZE){
            throw new FileSizeException("文件超出限制");
        }
        String contentType = file.getContentType();
        // boolean contains(Object o)：当前列表若包含某元素，返回结果为true；若不包含该元素，返回结果为false
        if (!AVATAR_TYPES.contains(contentType)) {
            throw new FileTypeException("文件类型不支持");
        }

        ApplicationHome ah = new ApplicationHome(getClass());
        File file3 = ah.getSource();
        String parent = file3.getParentFile()+"/Vsource".toString();


        File dir = new File(parent);
        if (!dir.exists()) {
            dir.mkdirs();
        }
        String suffix = "";
        String originalFilename = file.getOriginalFilename();
        int beginIndex = originalFilename.lastIndexOf(".");
        if (beginIndex > 0) {
            suffix = originalFilename.substring(beginIndex);
        }
        String filename = UUID.randomUUID().toString() + suffix;

        File dest = new File(dir, filename);

        try {
            file.transferTo(dest);
        } catch (IllegalStateException e) {
            // 抛出异常
            throw new FileStateException("文件状态异常，可能文件已被移动或删除");
        } catch (IOException e) {
            // 抛出异常
            throw new FileUploadIOException("上传文件时读写错误，请稍后重新尝试");
        }
        String Image = "/Vsource/" + filename;
        adminService.UploadVegetableImages2(id, Image);
        return new JsonResult<String>(OK, Image);
    }
    @RequestMapping("up_VeIm3")
    public JsonResult<String> upVeIm3(Integer id, HttpSession session, MultipartFile file){
        if(file.isEmpty()){
            throw new FileEmptyException("文件为空");
        }
        if(file.getSize() > AVATAR_MAX_SIZE){
            throw new FileSizeException("文件超出限制");
        }

        // 判断上传的文件类型是否超出限制
        String contentType = file.getContentType();
        // boolean contains(Object o)：当前列表若包含某元素，返回结果为true；若不包含该元素，返回结果为false
        if (!AVATAR_TYPES.contains(contentType)) {
            throw new FileTypeException("文件类型不支持");
        }

        ApplicationHome ah = new ApplicationHome(getClass());
        File file3 = ah.getSource();
        String parent = file3.getParentFile()+"/Vsource".toString();

        File dir = new File(parent);
        if (!dir.exists()) {
            dir.mkdirs();
        }

        String suffix = "";
        String originalFilename = file.getOriginalFilename();
        int beginIndex = originalFilename.lastIndexOf(".");
        if (beginIndex > 0) {
            suffix = originalFilename.substring(beginIndex);
        }
        String filename = UUID.randomUUID().toString() + suffix;

        File dest = new File(dir, filename);
        try {
            file.transferTo(dest);
        } catch (IllegalStateException e) {
            // 抛出异常
            throw new FileStateException("文件状态异常，可能文件已被移动或删除");
        } catch (IOException e) {
            // 抛出异常
            throw new FileUploadIOException("上传文件时读写错误，请稍后重新尝试");
        }
        String Image = "/Vsource/" + filename;
        adminService.UploadVegetableImages3(id, Image);
        return new JsonResult<String>(OK, Image);
    }
    @RequestMapping("up_VeIm4")
    public JsonResult<String> upVeIm4(Integer id, HttpSession session, MultipartFile file){
        if(file.isEmpty()){
            throw new FileEmptyException("文件为空");
        }
        if(file.getSize() > AVATAR_MAX_SIZE){
            throw new FileSizeException("文件超出限制");
        }
        String contentType = file.getContentType();
        // boolean contains(Object o)：当前列表若包含某元素，返回结果为true；若不包含该元素，返回结果为false
        if (!AVATAR_TYPES.contains(contentType)) {
            throw new FileTypeException("文件类型不支持");
        }
        ApplicationHome ah = new ApplicationHome(getClass());
        File file3 = ah.getSource();
        String parent = file3.getParentFile()+"/Vsource".toString();

        File dir = new File(parent);
        if (!dir.exists()) {
            dir.mkdirs();
        }

        String suffix = "";
        String originalFilename = file.getOriginalFilename();
        int beginIndex = originalFilename.lastIndexOf(".");
        if (beginIndex > 0) {
            suffix = originalFilename.substring(beginIndex);
        }
        String filename = UUID.randomUUID().toString() + suffix;

        File dest = new File(dir, filename);

        try {
            file.transferTo(dest);
        } catch (IllegalStateException e) {
            // 抛出异常
            throw new FileStateException("文件状态异常，可能文件已被移动或删除");
        } catch (IOException e) {
            // 抛出异常
            throw new FileUploadIOException("上传文件时读写错误，请稍后重新尝试");
        }
        String Image = "/Vsource/" + filename;
        adminService.UploadVegetableImages4(id, Image);
        return new JsonResult<String>(OK, Image);
    }
    @RequestMapping("up_VeIm5")
    public JsonResult<String> upVeIm5(Integer id, HttpSession session, MultipartFile file){
        if(file.isEmpty()){
            throw new FileEmptyException("文件为空");
        }
        if(file.getSize() > AVATAR_MAX_SIZE){
            throw new FileSizeException("文件超出限制");
        }

        // 判断上传的文件类型是否超出限制
        String contentType = file.getContentType();
        // boolean contains(Object o)：当前列表若包含某元素，返回结果为true；若不包含该元素，返回结果为false
        if (!AVATAR_TYPES.contains(contentType)) {
            throw new FileTypeException("文件类型不支持");
        }

        ApplicationHome ah = new ApplicationHome(getClass());
        File file3 = ah.getSource();
        String parent = file3.getParentFile()+"/Vsource".toString();

        File dir = new File(parent);
        if (!dir.exists()) {
            dir.mkdirs();
        }

        String suffix = "";
        String originalFilename = file.getOriginalFilename();
        int beginIndex = originalFilename.lastIndexOf(".");
        if (beginIndex > 0) {
            suffix = originalFilename.substring(beginIndex);
        }
        String filename = UUID.randomUUID().toString() + suffix;

        File dest = new File(dir, filename);

        try {
            file.transferTo(dest);
        } catch (IllegalStateException e) {
            // 抛出异常
            throw new FileStateException("文件状态异常，可能文件已被移动或删除");
        } catch (IOException e) {
            // 抛出异常
            throw new FileUploadIOException("上传文件时读写错误，请稍后重新尝试");
        }
        String Image = "/Vsource/" + filename;
        adminService.UploadVegetableImages5(id, Image);
        return new JsonResult<String>(OK, Image);
    }
    @RequestMapping("up_VeIm6")
    public JsonResult<String> upVeIm6(Integer id, HttpSession session, MultipartFile file){
        if(file.isEmpty()){
            throw new FileEmptyException("文件为空");
        }
        if(file.getSize() > AVATAR_MAX_SIZE){
            throw new FileSizeException("文件超出限制");
        }

        // 判断上传的文件类型是否超出限制
        String contentType = file.getContentType();
        // boolean contains(Object o)：当前列表若包含某元素，返回结果为true；若不包含该元素，返回结果为false
        if (!AVATAR_TYPES.contains(contentType)) {
            throw new FileTypeException("文件类型不支持");
        }

        ApplicationHome ah = new ApplicationHome(getClass());
        File file3 = ah.getSource();
        String parent = file3.getParentFile()+"/Vsource".toString();

        File dir = new File(parent);
        if (!dir.exists()) {
            dir.mkdirs();
        }
        String suffix = "";
        String originalFilename = file.getOriginalFilename();
        int beginIndex = originalFilename.lastIndexOf(".");
        if (beginIndex > 0) {
            suffix = originalFilename.substring(beginIndex);
        }
        String filename = UUID.randomUUID().toString() + suffix;

        File dest = new File(dir, filename);
        try {
            file.transferTo(dest);
        } catch (IllegalStateException e) {
            // 抛出异常
            throw new FileStateException("文件状态异常，可能文件已被移动或删除");
        } catch (IOException e) {
            // 抛出异常
            throw new FileUploadIOException("上传文件时读写错误，请稍后重新尝试");
        }
        String Image = "/Vsource/" + filename;
        adminService.UploadVegetableImages6(id, Image);
        return new JsonResult<String>(OK, Image);
    }
    @RequestMapping("up_VeIm7")
    public JsonResult<String> upVeIm7(Integer id, HttpSession session, MultipartFile file){
        if(file.isEmpty()){
            throw new FileEmptyException("文件为空");
        }
        if(file.getSize() > AVATAR_MAX_SIZE){
            throw new FileSizeException("文件超出限制");
        }

        // 判断上传的文件类型是否超出限制
        String contentType = file.getContentType();
        // boolean contains(Object o)：当前列表若包含某元素，返回结果为true；若不包含该元素，返回结果为false
        if (!AVATAR_TYPES.contains(contentType)) {
            throw new FileTypeException("文件类型不支持");
        }

        ApplicationHome ah = new ApplicationHome(getClass());
        File file3 = ah.getSource();
        String parent = file3.getParentFile()+"/Vsource".toString();

        File dir = new File(parent);
        if (!dir.exists()) {
            dir.mkdirs();
        }

        String suffix = "";
        String originalFilename = file.getOriginalFilename();
        int beginIndex = originalFilename.lastIndexOf(".");
        if (beginIndex > 0) {
            suffix = originalFilename.substring(beginIndex);
        }
        String filename = UUID.randomUUID().toString() + suffix;

        File dest = new File(dir, filename);
        try {
            file.transferTo(dest);
        } catch (IllegalStateException e) {
            // 抛出异常
            throw new FileStateException("文件状态异常，可能文件已被移动或删除");
        } catch (IOException e) {
            // 抛出异常
            throw new FileUploadIOException("上传文件时读写错误，请稍后重新尝试");
        }
        String Image = "/Vsource/" + filename;
        adminService.UploadVegetableImages7(id, Image);
        return new JsonResult<String>(OK, Image);
    }
    @RequestMapping("up_VeIm8")
    public JsonResult<String> upVeIm8(Integer id, HttpSession session, MultipartFile file){
        if(file.isEmpty()){
            throw new FileEmptyException("文件为空");
        }
        if(file.getSize() > AVATAR_MAX_SIZE){
            throw new FileSizeException("文件超出限制");
        }
        String contentType = file.getContentType();
        // boolean contains(Object o)：当前列表若包含某元素，返回结果为true；若不包含该元素，返回结果为false
        if (!AVATAR_TYPES.contains(contentType)) {
            throw new FileTypeException("文件类型不支持");
        }

        ApplicationHome ah = new ApplicationHome(getClass());
        File file3 = ah.getSource();
        String parent = file3.getParentFile()+"/Vsource".toString();
        File dir = new File(parent);

        if (!dir.exists()) {
            dir.mkdirs();
        }
        String suffix = "";
        String originalFilename = file.getOriginalFilename();
        int beginIndex = originalFilename.lastIndexOf(".");
        if (beginIndex > 0) {
            suffix = originalFilename.substring(beginIndex);
        }
        String filename = UUID.randomUUID().toString() + suffix;
        File dest = new File(dir, filename);
        try {
            file.transferTo(dest);
        } catch (IllegalStateException e) {
            // 抛出异常
            throw new FileStateException("文件状态异常，可能文件已被移动或删除");
        } catch (IOException e) {
            // 抛出异常
            throw new FileUploadIOException("上传文件时读写错误，请稍后重新尝试");
        }
        String Image = "/Vsource/" + filename;
        adminService.UploadVegetableImages8(id, Image);
        return new JsonResult<String>(OK, Image);
    }


//    @RequestMapping("up_LiveIm1")
//    public JsonResult<String> upLiveIm1(Integer id, Date time, HttpSession session, MultipartFile file){
//        if(file.isEmpty()){
//            throw new FileEmptyException("文件为空");
//        }
//        if(file.getSize() > AVATAR_MAX_SIZE){
//            throw new FileSizeException("文件超出限制");
//        }
//        String contentType = file.getContentType();
//        if (!AVATAR_TYPES.contains(contentType)) {
//            throw new FileTypeException("文件类型不支持");
//        }
//        String parent = session.getServletContext().getRealPath("/Lsource");
//
//        File dir = new File(parent);
//        if (!dir.exists()) {
//            dir.mkdirs();
//        }
//        String suffix = "";
//        String originalFilename = file.getOriginalFilename();
//        int beginIndex = originalFilename.lastIndexOf(".");
//        if (beginIndex > 0) {
//            suffix = originalFilename.substring(beginIndex);
//        }
//        String filename = UUID.randomUUID().toString() + suffix;
//        File dest = new File(dir, filename);
//        try {
//            file.transferTo(dest);
//        } catch (IllegalStateException e) {
//            throw new FileStateException("文件状态异常，可能文件已被移动或删除");
//        } catch (IOException e) {
//            throw new FileUploadIOException("上传文件时读写错误，请稍后重新尝试");
//        }
//        String Image = "/Lsource/" + filename;
//        adminService.updateLivestockPhoto1(id, Image);
//        adminMapper.updateLvTime1(id, time);
//        return new JsonResult<String>(OK, Image);
//    }
//    @RequestMapping("up_LiveIm2")
//    public JsonResult<String> upLiveIm2(Integer id, Date time, HttpSession session, MultipartFile file){
//        if(file.isEmpty()){
//            throw new FileEmptyException("文件为空");
//        }
//        if(file.getSize() > AVATAR_MAX_SIZE){
//            throw new FileSizeException("文件超出限制");
//        }
//        String contentType = file.getContentType();
//        if (!AVATAR_TYPES.contains(contentType)) {
//            throw new FileTypeException("文件类型不支持");
//        }
//        String parent = session.getServletContext().getRealPath("Lsource");
//        File dir = new File(parent);
//        if (!dir.exists()) {
//            dir.mkdirs();
//        }
//        String suffix = "";
//        String originalFilename = file.getOriginalFilename();
//        int beginIndex = originalFilename.lastIndexOf(".");
//        if (beginIndex > 0) {
//            suffix = originalFilename.substring(beginIndex);
//        }
//        String filename = UUID.randomUUID().toString() + suffix;
//        File dest = new File(dir, filename);
//        try {
//            file.transferTo(dest);
//        } catch (IllegalStateException e) {
//            throw new FileStateException("文件状态异常，可能文件已被移动或删除");
//        } catch (IOException e) {
//            throw new FileUploadIOException("上传文件时读写错误，请稍后重新尝试");
//        }
//        String Image = "/Lsource" + filename;
//        adminService.updateLivestockPhoto2(id, Image);
//        adminMapper.updateLvTime2(id, time);
//        return new JsonResult<String>(OK, Image);
//    }

//    @RequestMapping("up_slIm")
//    public JsonResult<String> upslIm(String name, Integer id, Date time, HttpSession session, MultipartFile file){
//        if(file.isEmpty()){
//            throw new FileEmptyException("文件为空");
//        }
//        if(file.getSize() > AVATAR_MAX_SIZE){
//            throw new FileSizeException("文件超出限制");
//        }
//        String contentType = file.getContentType();
//        if (!AVATAR_TYPES.contains(contentType)) {
//            throw new FileTypeException("文件类型不支持");
//        }
//        String parent = session.getServletContext().getRealPath("Lsource");
//        File dir = new File(parent);
//        if (!dir.exists()) {
//            dir.mkdirs();
//        }
//        String suffix = "";
//        String originalFilename = file.getOriginalFilename();
//        int beginIndex = originalFilename.lastIndexOf(".");
//        if (beginIndex > 0) {
//            suffix = originalFilename.substring(beginIndex);
//        }
//        String filename = UUID.randomUUID().toString() + suffix;
//        File dest = new File(dir, filename);
//        try {
//            file.transferTo(dest);
//        } catch (IllegalStateException e) {
//            throw new FileStateException("文件状态异常，可能文件已被移动或删除");
//        } catch (IOException e) {
//            throw new FileUploadIOException("上传文件时读写错误，请稍后重新尝试");
//        }
//        String Image = "/Lsource" + filename;
//        adminService.updateSlaughter_ph(id, Image);
//        adminMapper.updateslTime(id, time);
//        adminMapper.updateslName(id, name);
//        return new JsonResult<String>(OK, Image);
//    }



    //上传证书图片
    @RequestMapping("up_CeIm1")
    public JsonResult<String> upCeIm1(Integer id, HttpSession session, MultipartFile file){
        if(file.isEmpty()){
            throw new FileEmptyException("文件为空");
        }
        if(file.getSize() > AVATAR_MAX_SIZE){
            throw new FileSizeException("文件超出限制");
        }

        // 判断上传的文件类型是否超出限制
        String contentType = file.getContentType();
        // boolean contains(Object o)：当前列表若包含某元素，返回结果为true；若不包含该元素，返回结果为false
        if (!AVATAR_TYPES.contains(contentType)) {
            throw new FileTypeException("文件类型不支持");
        }
        String parent = session.getServletContext().getRealPath("certp");
        File dir = new File(parent);
        if (!dir.exists()) {
            dir.mkdirs();
        }
        // 保存的照片文件的文件名
        String suffix = "";
        String originalFilename = file.getOriginalFilename();
        int beginIndex = originalFilename.lastIndexOf(".");
        if (beginIndex > 0) {
            suffix = originalFilename.substring(beginIndex);
        }
        String filename = UUID.randomUUID().toString() + suffix;
        File dest = new File(dir, filename);
        // 执行保存照片文件
        try {
            file.transferTo(dest);
        } catch (IllegalStateException e) {
            // 抛出异常
            throw new FileStateException("文件状态异常，可能文件已被移动或删除");
        } catch (IOException e) {
            // 抛出异常
            throw new FileUploadIOException("上传文件时读写错误，请稍后重新尝试");
        }
        String Image = "/certp" + filename;
        adminService.UploadCertImages(id, Image);
        return new JsonResult<String>(OK, Image);
    }

    @RequestMapping("/userdelete")
    public JsonResult<Void> userDelete(Integer uid){
        adminService.userDelete(uid);
        return new JsonResult<Void>(OK);
    }
}
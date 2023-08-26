package com.cy.store.controller;

import com.cy.store.entity.LvPhoto;
import com.cy.store.entity.VePhoto;
import com.cy.store.service.ILvPhotoService;
import com.cy.store.util.JsonResult;
import com.cy.store.vo.LiveSourceVO;
import com.cy.store.vo.LvVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("Lvphoto")
public class LvPhotoController extends BaseController{
    @Autowired
    private ILvPhotoService lvPhotoService;

    //溯源农牧产品图片
    @GetMapping("showlvdetails")
    public JsonResult<LvVO> showLvById(Integer id) {
        // 调用业务对象执行获取数据
        LvVO data = lvPhotoService.showLvById(id);
        // 返回成功和数据
        return new JsonResult<LvVO>(OK, data);
    }

    @GetMapping("showLv1")
    public JsonResult<LiveSourceVO> showLv1(Integer id){
        LiveSourceVO data = lvPhotoService.showSourceById1(id);
        return new JsonResult<LiveSourceVO>(OK, data);
    }
    @GetMapping("showLv2")
    public JsonResult<LiveSourceVO> showLv2(Integer id){
        LiveSourceVO data = lvPhotoService.showSourceById2(id);
        return new JsonResult<LiveSourceVO>(OK, data);
    }
    @GetMapping("showLv3")
    public JsonResult<LiveSourceVO> showLv3(Integer id){
        LiveSourceVO data = lvPhotoService.showSourceById3(id);
        return new JsonResult<LiveSourceVO>(OK, data);
    }
    @GetMapping("showLv4")
    public JsonResult<LiveSourceVO> showLv4(Integer id){
        LiveSourceVO data = lvPhotoService.showSourceById4(id);
        return new JsonResult<LiveSourceVO>(OK, data);
    }
    @GetMapping("showLv5")
    public JsonResult<LiveSourceVO> showLv5(Integer id){
        LiveSourceVO data = lvPhotoService.showSourceById5(id);
        return new JsonResult<LiveSourceVO>(OK, data);
    }
    @GetMapping("showLv6")
    public JsonResult<LiveSourceVO> showLv6(Integer id){
        LiveSourceVO data = lvPhotoService.showSourceById6(id);
        return new JsonResult<LiveSourceVO>(OK, data);
    }
    @GetMapping("showLv7")
    public JsonResult<LiveSourceVO> showLv7(Integer id){
        LiveSourceVO data = lvPhotoService.showSourceById7(id);
        return new JsonResult<LiveSourceVO>(OK, data);
    }
    @GetMapping("showLv8")
    public JsonResult<LiveSourceVO> showLv8(Integer id){
        LiveSourceVO data = lvPhotoService.showSourceById8(id);
        return new JsonResult<LiveSourceVO>(OK, data);
    }
    @GetMapping("showLv9")
    public JsonResult<LiveSourceVO> showLv9(Integer id){
        LiveSourceVO data = lvPhotoService.showSourceById9(id);
        return new JsonResult<LiveSourceVO>(OK, data);
    }
    @GetMapping("showLv10")
    public JsonResult<LiveSourceVO> showLv10(Integer id){
        LiveSourceVO data = lvPhotoService.showSourceById10(id);
        return new JsonResult<LiveSourceVO>(OK, data);
    }
    @GetMapping("showLv11")
    public JsonResult<LiveSourceVO> showLv11(Integer id){
        LiveSourceVO data = lvPhotoService.showSourceById11(id);
        return new JsonResult<LiveSourceVO>(OK, data);
    }
    @GetMapping("showLv12")
    public JsonResult<LiveSourceVO> showLv12(Integer id){
        LiveSourceVO data = lvPhotoService.showSourceById12(id);
        return new JsonResult<LiveSourceVO>(OK, data);
    }
    @GetMapping("showLv13")
    public JsonResult<LiveSourceVO> showLv13(Integer id){
        LiveSourceVO data = lvPhotoService.showSourceById13(id);
        return new JsonResult<LiveSourceVO>(OK, data);
    }
    @GetMapping("showLv14")
    public JsonResult<LiveSourceVO> showLv14(Integer id){
        LiveSourceVO data = lvPhotoService.showSourceById14(id);
        return new JsonResult<LiveSourceVO>(OK, data);
    }
    @GetMapping("showLv15")
    public JsonResult<LiveSourceVO> showLv15(Integer id){
        LiveSourceVO data = lvPhotoService.showSourceById15(id);
        return new JsonResult<LiveSourceVO>(OK, data);
    }
    @GetMapping("showLv16")
    public JsonResult<LiveSourceVO> showLv16(Integer id){
        LiveSourceVO data = lvPhotoService.showSourceById16(id);
        return new JsonResult<LiveSourceVO>(OK, data);
    }
    @GetMapping("showLv17")
    public JsonResult<LiveSourceVO> showLv17(Integer id){
        LiveSourceVO data = lvPhotoService.showSourceById17(id);
        return new JsonResult<LiveSourceVO>(OK, data);
    }
    @GetMapping("showLv18")
    public JsonResult<LiveSourceVO> showLv18(Integer id){
        LiveSourceVO data = lvPhotoService.showSourceById18(id);
        return new JsonResult<LiveSourceVO>(OK, data);
    }
    @GetMapping("showLv19")
    public JsonResult<LiveSourceVO> showLv19(Integer id){
        LiveSourceVO data = lvPhotoService.showSourceById19(id);
        return new JsonResult<LiveSourceVO>(OK, data);
    }
    @GetMapping("showLv20")
    public JsonResult<LiveSourceVO> showLv20(Integer id){
        LiveSourceVO data = lvPhotoService.showSourceById20(id);
        return new JsonResult<LiveSourceVO>(OK, data);
    }
    @GetMapping("showLv21")
    public JsonResult<LiveSourceVO> showLv21(Integer id){
        LiveSourceVO data = lvPhotoService.showSourceById21(id);
        return new JsonResult<LiveSourceVO>(OK, data);
    }
    @GetMapping("showLv22")
    public JsonResult<LiveSourceVO> showLv22(Integer id){
        LiveSourceVO data = lvPhotoService.showSourceById22(id);
        return new JsonResult<LiveSourceVO>(OK, data);
    }
    @GetMapping("showLv23")
    public JsonResult<LiveSourceVO> showLv23(Integer id){
        LiveSourceVO data = lvPhotoService.showSourceById23(id);
        return new JsonResult<LiveSourceVO>(OK, data);
    }
    @GetMapping("showLv24")
    public JsonResult<LiveSourceVO> showLv24(Integer id){
        LiveSourceVO data = lvPhotoService.showSourceById24(id);
        return new JsonResult<LiveSourceVO>(OK, data);
    }
    @GetMapping("showLvSl")
    public JsonResult<LiveSourceVO> showLvSl(Integer id){
        LiveSourceVO data = lvPhotoService.showSlSourceById(id);
        return new JsonResult<LiveSourceVO>(OK, data);
    }
}
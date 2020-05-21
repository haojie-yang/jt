package com.lbx.mng.pms.controller;

import com.lbx.framework.common.domain.common.ResponseResult;
import com.lbx.framework.common.util.ResponseResultUtil;
import com.lbx.framework.mng.util.CasUtil;
import com.lbx.mng.pms.domain.pmsproduct.PmsProductQuery;
import com.lbx.mng.pms.domain.pmsproduct.PmsProductView;
import com.lbx.mng.pms.service.PmsProductService;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.*;

/**
 * 控制器层
 * @author code generator
 * @date 2020-05-13 14:02:29
 **/

@RestController
@RequestMapping("/pmsProduct")
@Slf4j
public class PmsProductController {

    @Autowired
    private PmsProductService pmsProductService;

    @RequestMapping("index")
    public ModelAndView index(ModelAndView modelAndView){
        modelAndView.setViewName("pmsproduct/index");
        return modelAndView;
    }

    /**
    * 分页条件查询
    */
    @GetMapping("list")
    public ResponseResult list(@RequestParam("page") int page, @RequestParam("size") int size,@RequestParam("responsible_department")int responsibleDepartment, @RequestParam("product_name")String productName, @RequestParam("product_type")int productType, @RequestParam("business_type")int businessType){
        return pmsProductService.getList(page, size,responsibleDepartment,productName,productType,businessType);
    }

    /**
    * 查看详情
    */
    @RequestMapping("detail")
    public ModelAndView detail(ModelAndView modelAndView, String id, String event){
        if(StringUtils.isNoneEmpty(id)){
            ResponseResult responseResult = pmsProductService.getById(id);
            modelAndView.addObject("responseResult", responseResult);
        }else {
            Map model = new HashMap<>();
            modelAndView.addObject("responseResult",ResponseResultUtil.success(model));
        }
        modelAndView.addObject("event",event);
        modelAndView.setViewName("pmsproduct/detail");
        return modelAndView;
    }

    /**
     * 删除
     */
    @PostMapping("delete")
    public ResponseResult delete(@RequestBody PmsProductView view){
        return pmsProductService.delete(view.getId());
    }

    /**
     * 批量删除
     */
    @PostMapping("deletes")
    public ResponseResult delete(@RequestBody List<PmsProductView> views){
        List<String> ids = new ArrayList<>();
        for (PmsProductView view : views) {
            ids.add(view.getId());
        }
        return pmsProductService.delete(ids);
    }

    /**
    * 保存
    */
    @PostMapping("save")
    public ResponseResult save(@RequestBody PmsProductView view){

        if (StringUtils.isEmpty(view.getId())) {
            view.setCreationUser(CasUtil.getLoginId());
        } else {
            view.setModificationUser(CasUtil.getLoginId());
        }
        return pmsProductService.save(view);
    }

}

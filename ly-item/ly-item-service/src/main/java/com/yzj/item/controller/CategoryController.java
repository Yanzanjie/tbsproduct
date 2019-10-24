package com.yzj.item.controller;

import com.yzj.item.po.Category;
import com.yzj.item.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.util.CollectionUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

/**
 * 作者: yzj
 * 日期: 2019/8/28
 * 分类类目
 */
@Controller
@RequestMapping("category")
public class CategoryController {
    @Autowired
    private CategoryService categoryService;

    @GetMapping("list")
    public ResponseEntity<List<Category>> queryCategoriesByPid(@RequestParam(value = "pid",defaultValue = "0")Long pid){
//        (Double)pid = -1.0;
            if(pid == null || pid < 0){
                //400：参数不合法
                return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
            }
            List<Category> categories = this.categoryService.queryCategoriesByPid(pid);
            if(CollectionUtils.isEmpty(categories)){
                //404：资源服务器未找到
                return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
            }
            //200：查询成功
            return  ResponseEntity.ok(categories);
    }
}

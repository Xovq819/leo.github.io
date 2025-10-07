package com.situ.controller;


import com.situ.pojo.Department;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/Department")
public class Department_Controller extends BaseController<Department> {
   /* @RequestMapping("delete")
    public ResultData delete(int id) throws Exception{
        getService().delete(id);
        return new ResultData(1);

    }

    */
}

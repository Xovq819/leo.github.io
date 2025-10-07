package com.situ.controller;


import com.situ.pojo.Project;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/Project")
public class Project_Controller extends BaseController<Project> {
   /* @RequestMapping("delete")
    public ResultData delete(int id) throws Exception{
        getService().delete(id);
        return new ResultData(1);

    }

    */
}

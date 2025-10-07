package com.situ.controller;


import com.situ.pojo.Client_level;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/Client_level")
public class Client_level_Controller extends BaseController<Client_level> {
   /* @RequestMapping("delete")
    public ResultData delete(int id) throws Exception{
        getService().delete(id);
        return new ResultData(1);

    }

    */
}

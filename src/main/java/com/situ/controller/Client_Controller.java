package com.situ.controller;


import com.situ.pojo.Client;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/Client")
public class Client_Controller extends BaseController<Client> {
   /* @RequestMapping("delete")
    public ResultData delete(int id) throws Exception{
        getService().delete(id);
        return new ResultData(1);

    }

    */
}

package com.situ.controller;


import com.situ.pojo.Order_details;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/Order_details")
public class Order_details_Controller extends BaseController<Order_details> {
   /* @RequestMapping("delete")
    public ResultData delete(int id) throws Exception{
        getService().delete(id);
        return new ResultData(1);

    }

    */
}

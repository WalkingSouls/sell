package test.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author liuyadong
 * @since 2019/4/30
 */
@Controller
@RequestMapping("/test")
public class TestController {
    @RequestMapping("/test")
//    @ResponseBody
    public String test(){
        return "OK";
    }
}

package mine.ticks.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * User: chengcheng.liu
 * Date: 16/11/8
 */
@Controller
@RequestMapping("/hello")
public class HelloController {
    @RequestMapping("/name")
    public String hello(){
        return "hello";
    }
}

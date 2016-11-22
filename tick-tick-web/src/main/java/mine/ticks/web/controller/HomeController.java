package mine.ticks.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * User: chengcheng.liu
 * Date: 16/11/22
 */

@Controller
@RequestMapping("/index.html")
public class HomeController {
    @RequestMapping
    public String home() {
        return "hello";
    }
}

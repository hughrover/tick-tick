package mine.ticks.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

/**
 * User: chengcheng.liu
 * Date: 16/11/22
 */
@Controller
@RequestMapping("/gossip")
public class JsonTestController {
    @RequestMapping(value="{name}", method = RequestMethod.GET, produces = "application/json")
    public @ResponseBody Map<String, String> gossip(@PathVariable("name") String name) {
        Map<String, String> resultMap = new HashMap<String, String>();
        resultMap.put(name, name);
        resultMap.put("1", "gossip1");
        resultMap.put("2", "gossip2");
        return resultMap;
    }
}

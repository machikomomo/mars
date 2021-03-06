package com.momoka.marsdemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/")
public class MarsController {

    @RequestMapping("")
    public ModelAndView home(@RequestParam String name, Integer num) {

        ModelAndView modelMap = new ModelAndView();
        modelMap.addObject("name", name);
        if (name.equals("momochan")) {
            modelMap.addObject("imgLink", "https://am.zdmimg.com/201712/23/5a3e579e3f8003590.jpg_e680.jpg");
        } else {
            modelMap.addObject("imgLink", "https://i.ytimg.com/vi/JIvxozSw-c0/maxresdefault.jpg");
        }
        if (num.equals(0)) {
            modelMap.addObject("imgLink1", "https://gimg2.baidu.com/image_search/src=http%3A%2F%2Fn.sinaimg.cn%2Fsinacn22%2F392%2Fw639h553%2F20180604%2F9af4-hcmurvh7974472.jpg&refer=http%3A%2F%2Fn.sinaimg.cn&app=2002&size=f9999,10000&q=a80&n=0&g=0n&fmt=jpeg?sec=1617466347&t=5aa04f55f9130037c09e23bb7568ff86");
        }else{
            modelMap.addObject("imgLink1","https://gimg2.baidu.com/image_search/src=http%3A%2F%2Fhbimg.b0.upaiyun.com%2F581a3803f130389997c8f4cb2c5747e54ca4e6852ed54-dJra9R_fw658&refer=http%3A%2F%2Fhbimg.b0.upaiyun.com&app=2002&size=f9999,10000&q=a80&n=0&g=0n&fmt=jpeg?sec=1617466458&t=890c38c7816dbdc62b996e88528429a6");
        }
        modelMap.setViewName("index");
        return modelMap;
    }

//    @RequestMapping("")
//    public String home(ModelAndView modelAndView, @RequestParam String name){
//        System.out.println(name);
//        modelAndView.addObject("name", name);
//        return "index";
//    }

}

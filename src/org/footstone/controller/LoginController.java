package org.footstone.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class LoginController {

    
    //域名访问跳转到登录页
    @RequestMapping("/")    
    public String index(){    

        return "login";    
    }
    
    //登录跳转到首页
    @RequestMapping(value="/login",method = RequestMethod.POST)
    public ModelAndView login(String nickname){
        ModelAndView mv = new ModelAndView();
        mv.setViewName("index.html");
        mv.addObject("nickname",nickname);
        return mv;
    }
    
    //获取人员信息
    @RequestMapping(value="/getPersonData.do")
    @ResponseBody //添加该注释后，返回值将由转换器进行转换，转换器为Jackson，所以会转换成json格式
    public Map<String,Object> getPersonData(){
        Map<String,Object> personMap = new HashMap<String,Object>();
        personMap.put("rows","hello");
        
        return personMap;
        
    }

}
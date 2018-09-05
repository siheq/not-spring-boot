package com.simon.test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.support.SessionStatus;

import javax.servlet.http.HttpSession;

@Controller
@RequestMapping("/")
@SessionAttributes("session")
public class testController {

    //    @RequestMapping("/ha{*}")
//    @ResponseBody
//    public String ceshi () {
//        return "123456";
//    }
    @ModelAttribute("u")
    public TestModal setUsername(String test,ModelMap mp){
        System.out.println(test);
        System.out.println("into");
        return new TestModal("test","test");//返回值是上面注解名的value值，会放在request里面

    }

    @RequestMapping(value = "/model", method = RequestMethod.POST)
    @ResponseBody
    public TestModal test (@ModelAttribute("u")TestModal test, @SessionAttribute("Test") String xxxx) {
        System.out.println(xxxx);
        System.out.println(test);
        TestModal xxx = new TestModal();
        xxx.setFirst("1231");
        xxx.setSecond("12312");
        return xxx;
    }

    @RequestMapping(value = "/model1", method = RequestMethod.POST)
    @ResponseBody
    public TestModal test1 (HttpSession httpSession) {
        httpSession.setAttribute("Test", "1231");
//        System.out.println(status);
        return new TestModal();
    }
}

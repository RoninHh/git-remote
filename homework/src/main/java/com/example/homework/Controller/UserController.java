package com.example.homework.Controller;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.example.homework.domain.User;
import com.example.homework.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

//@RestController
@Controller
@RequestMapping("users")
public class UserController {
    @Autowired
    private IUserService ius;

//    @RequestMapping("/findUserList")
//    private ModelAndView findUserList(){
//        ModelAndView mv = new ModelAndView();
//        QueryWrapper<User> wrapper = new QueryWrapper<>();
//        List<User> users = ius.FindUserList(wrapper);
//        System.out.println(users);
//        mv.setViewName("redirect:/user/list");
//        mv.addObject("users",users);
//        return mv;
//    }
    @RequestMapping("/findUserList")
    private String findUserList(Model model){
        QueryWrapper<User> wrapper = new QueryWrapper<>();
        List<User> users = ius.FindUserList(wrapper);
        model.addAttribute("users",users);
        return "user/list";
    }
}

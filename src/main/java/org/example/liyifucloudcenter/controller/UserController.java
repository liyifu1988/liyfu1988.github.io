package org.example.liyifucloudcenter.controller;

import jakarta.annotation.Resource;
import org.example.liyifucloudcenter.entity.User;
import org.example.liyifucloudcenter.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class UserController {
    @Resource
    UserService userService;

    @GetMapping("/index")
    public  String list(Model model){
        List<User> list = userService.list();
        model.addAttribute("list", list);
        return "index";
    }
}

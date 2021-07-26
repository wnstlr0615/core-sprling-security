package com.example.corespringsecurity.controller.user;

import com.example.corespringsecurity.domain.AccountDto;
import com.example.corespringsecurity.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
@RequiredArgsConstructor
public class UserController {
    private final UserService userService;

    @GetMapping(value="/mypage")
    public String myPage() throws Exception {
        return "user/mypage";
    }
    @GetMapping("/users")
    public String createUser(){
        return "user/login/register";
    }
    @PostMapping("/users")
    public String createUser( AccountDto accountDto){
        userService.createUser(accountDto);
        return "redirect:/";
    }

}

package com.sparta.week02_1_login3.controller;


import com.fasterxml.jackson.core.JsonProcessingException;
import com.sparta.week02_1_login3.dto.SignupRequestDto;
import com.sparta.week02_1_login3.service.KakaoUserService;
import com.sparta.week02_1_login3.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@RequiredArgsConstructor
@Controller
public class UserController {

    private final UserService userService;
    private final KakaoUserService kakaoUserService;

    // 회원 로그인 페이지
    @GetMapping("/user/login")
    public String login() {
        return "login";
    }

    // 회원 가입 페이지
    @GetMapping("/user/signup")
    public String signup() {
        return "signup";
    }

    // 회원 가입 요청 처리
    @PostMapping("/user/signup")
    public String registerUser(SignupRequestDto requestDto) {
        userService.registerUser(requestDto);
        return "redirect:/user/login";
    }
    @GetMapping("/user/kakao/callback")
    public String kakaoLogin(@RequestParam String code) throws JsonProcessingException {
        System.out.println("여기까지 성공");

        kakaoUserService.kakaoLogin(code);
        return "redirect:/";
    }
}
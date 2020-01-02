package com.chandler.security.controller;

import com.chandler.security.dto.MemberDto;
import com.chandler.security.service.MemberService;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
@AllArgsConstructor
public class MemberController {
    private MemberService memberService;

    // 메인 페이지
    @GetMapping("/")
    public String index() {
        return "/index";
    }

    // 회원가입 페이지
    @GetMapping("/user/signup")
    public String viewSignup() {
        return "/signup";
    }

    // 회원가입 처리
    @PostMapping("/user/signup")
    public String processSignup(MemberDto memberDto) {
        memberService.joinUser(memberDto);

        return "redirect:/user/login";
    }

    // 로그인 페이지
    @GetMapping("/user/login")
    public String viewLogin() {
        return "/login";
    }

    // 로그인 성공 페이지
    @GetMapping("/user/login/success")
    public String viewLoginSuccess() {
        return "/loginSuccess";
    }
    
    // 로그인 실패 페이지
    @GetMapping("/user/login/fail")
    public String viewLoginFail() {
        return "/loginFail";
    }

    // 로그아웃 결과 페이지
    @GetMapping("/user/logout/result")
    public String viewLogout() {
        return "/logout";
    }

    // 접근 거부 페이지
    @GetMapping("/user/denied")
    public String viewDenied() {
        return "/denied";
    }

    // 내 정보 페이지
    @GetMapping("/user/info")
    public String viewMyInfo() {
        return "/myinfo";
    }

    // 어드민 페이지
    @GetMapping("/admin")
    public String viewAdmin() {
        return "/admin";
    }
}

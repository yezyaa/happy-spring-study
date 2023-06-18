package com.happy.happyjpa.yezy;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
//@RestController // 모든 메소드에 @ResponseBody를 붙이는 요소
public class AppController {
    // 사용자의 입력을 직접적으로 받는 요소
    private final AppService service;

    public AppController(AppService service) {
        this.service = service;
    }

    @GetMapping("/create-view")
    public String createView() {
        return "/create";
    }

    @PostMapping("/create")
    public String create(
            @RequestParam("title") String title,
            @RequestParam("content") String content,
            @RequestParam("name") String name) {
        this.service.createBoard(title, content, name); // DB 저장 역할
        return "redirect:/home"; // 생성 후 홈으로
    }

    @GetMapping("/home")
    public String home(Model model) {
        model.addAttribute("boardList", this.service.readBoardAll());
        return "/home";
    }
}

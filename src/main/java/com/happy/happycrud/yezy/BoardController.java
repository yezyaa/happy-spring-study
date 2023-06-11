package com.happy.happycrud.yezy;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class BoardController {
    @GetMapping("/create-view")
    public String createView() {
        return "create";
    }

    @PostMapping("/create")
    public String create(
            @RequestParam("title") String title,
            @RequestParam("content") String content,
            @RequestParam("name") String name) {
        System.out.println(title);
        System.out.println(content);
        System.out.println(name);
        return "create";
    }
}

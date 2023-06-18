//package com.happy.happyjpa.chaeyeon;
//
//import com.happy.happyjpa.chaeyeon.entities.BoardEntity;
//import org.springframework.stereotype.Controller;
//import org.springframework.ui.Model;
//import org.springframework.web.bind.annotation.*;
//
//@Controller
////@RestController
//public class AppController {
//    private final AppService service;
//
//    public AppController(AppService service) {
//        this.service = service;
//    }
//
//    @GetMapping("/create-view")
//    public String createView() {
//        return "/create";
//    }
//
//    @PostMapping("/create")
//    public String create(
//            @RequestParam("title") String title,
//            @RequestParam("content") String content,
//            @RequestParam("name") String name
//    ) {
//        this.service.craeteBoard(title, content, name);
////        this.service.craeteBoard();
//        return "redirect:/home";
//    }
//
//    @GetMapping("/home")
//    public String home(Model model) {
//        model.addAttribute("boardList", this.service.readBoardAll());
//        return "/home";
//    }
//}
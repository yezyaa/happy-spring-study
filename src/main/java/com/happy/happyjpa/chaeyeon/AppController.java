//package com.happy.happyjpa.chaeyeon;
//
//import com.happy.happyjpa.chaeyeon.entities.BoardEntity;
//import org.springframework.stereotype.Controller;
//import org.springframework.ui.Model;
//import org.springframework.web.bind.annotation.*;
//
//import java.util.Optional;
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
//
//    @GetMapping("/{id}")
//    public String readOne(@PathVariable("id") Long id, Model model) {
//        BoardEntity entity = this.service.readBoard(id);
//        model.addAttribute("board", entity);
//        return "/read";
//    }
//
//    @GetMapping("/{id}/update-view")
//    public String updateView(@PathVariable("id") Long id, Model model) {
//        BoardEntity entity = this.service.readBoard(id);
//        model.addAttribute("board", entity);
//        return "/update";
//    }
//
//    @PostMapping("/{id}/update")
//    public String update(
//            @PathVariable("id") Long id,
//            @RequestParam("title") String title,
//            @RequestParam("content") String content
//    ) {
//        this.service.updateBoard(id, title, content);
//        return "redirect:/home";
//    }
//
//    @GetMapping("/{id}/delete-view")
//    public String deleteView(@PathVariable("id") Long id, Model model) {
//        BoardEntity entity = this.service.readBoard(id);
//        model.addAttribute("board", entity);
//        return "delete";
//    }
//
//    @PostMapping("/{id}/delete")
//    public String delete(@PathVariable("id") Long id) {
//        this.service.deleteBoard(id);
//        return "redirect:/home";
//    }
//}
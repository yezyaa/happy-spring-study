package com.happy.happyjpa.yezy;

import com.happy.happyjpa.yezy.dto.BoardDto;
import com.happy.happyjpa.yezy.entities.BoardEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

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

//    @GetMapping("/home")
//    public String home(Model model) {
//        model.addAttribute("boardList", this.service.readBoardAll());
//        return "/home";
//    }

    @GetMapping("/{id}")
    public String readOne(@PathVariable("id") Long id, Model model) {
        BoardEntity entity = this.service.readBoard(id);
        model.addAttribute("board", entity);
        return "/read";
    }

    @GetMapping("/{id}/update-view")
    public String updateView(@PathVariable("id") Long id, Model model) {
        BoardEntity entity = this.service.readBoard(id);
        model.addAttribute("board", entity);
        return "/update";
    }

    @PostMapping("/{id}/update")
    public String update(
            @PathVariable("id") Long id,
            @RequestParam("title") String title,
            @RequestParam("content") String content) {
        this.service.updateBoard(id, title, content); // DB 저장 역할
        return "redirect:/home"; // 생성 후 홈으로
    }

    @GetMapping("/{id}/delete-view")
    public String deleteView(@PathVariable("id") Long id, Model model) {
        BoardEntity entity = this.service.readBoard(id);
        model.addAttribute("board", entity);
        return "/delete";
    }

    @PostMapping("/{id}/delete")
    public String delete(@PathVariable("id") Long id) {
        this.service.deleteBoard(id);
        return "redirect:/home";
    }

    @GetMapping("find")
    public @ResponseBody String find() {
        this.service.findAllByTest();
        return "done-find";
    }

    // @ResponseBody로 return
//    @GetMapping("/home")
//    public @ResponseBody List<BoardEntity> readAll() {
//        return this.service.readBoardAll();
//    }

    @GetMapping("/home")
    public @ResponseBody List<BoardDto> home() {
        return this.service.readBoardAll();
    }
}
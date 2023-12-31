package com.happy.happycrud.yezy;

import com.happy.happycrud.yezy.model.BoardDto;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class BoardController {
    // BoradService를 Controller에서 사용 --> 의존성 주입
    private final BoardService boardService;
    public BoardController(BoardService boardService) {
        this.boardService = boardService;
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
        System.out.println(title);
        System.out.println(content);
        System.out.println(name);
        BoardDto newBoard = boardService.createBoard(title, content, name);
        System.out.println(newBoard);
//        return "redirect:/create-view";
        return "redirect:/home"; // 생성 후 홈으로
    }

    @GetMapping("/home")
    public String home(Model model) {
        model.addAttribute("boardList", boardService.readBoradAll());
        return "/home";
    }

    @GetMapping("/{id}")
    public String readOne(@PathVariable("id") Long id, Model model) {
        BoardDto dto = boardService.readBoard(id);
        model.addAttribute("board", dto);
        return "/read";
    }

    @GetMapping("/{id}/update-view")
    public String updateView(@PathVariable("id") Long id, Model model) {
        BoardDto dto = boardService.readBoard(id);
        model.addAttribute("board", dto);
        return "update";
    }

    @PostMapping("/{id}/update")
    public String update(
            @PathVariable("id") Long id,
            @RequestParam("title") String title,
            @RequestParam("content") String content) {
        BoardDto boardDto = boardService.updateBoard(id, title, content);
        return String.format("redirect:/%s", id);
//        return "redirect:/id"; // 상세페이지로
    }

    @GetMapping("/{id}/delete-view")
    public String deleteView(@PathVariable("id") Long id, Model model) {
        BoardDto dto = boardService.readBoard(id);
        model.addAttribute("board", dto);
        return "delete";
    }

    @PostMapping("/{id}/delete")
    public String delete(@PathVariable("id") Long id) {
        boardService.deleteBoard(id);
        return "redirect:/home";
    }
}

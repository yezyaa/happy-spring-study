package com.happy.happycrud.yezy;

import com.happy.happycrud.yezy.model.BoardDto;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
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
        return "redirect:/create-view";
    }
}

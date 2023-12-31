//package com.happy.happycrud.chaeyeon;
//
//import com.happy.happycrud.chaeyeon.model.BoardDto;
//import org.springframework.stereotype.Controller;
//import org.springframework.ui.Model;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestParam;
//
//@Controller
//public class BoardController {
//    private final BoardService boardService;
//
//    public BoardController(BoardService boardService) {
//        this.boardService = boardService;
//    }
//
//    @GetMapping("/create-view")
//    public String createView() {
//        return "create";
//    }
//
//    @PostMapping("/create")
//    public String create(
//            @RequestParam("title") String title,
//            @RequestParam("content") String content,
//            @RequestParam("name") String name
//    ) {
//        System.out.println(title);
//        System.out.println(content);
//        System.out.println(name);
//        BoardDto boardDto = boardService.createBoard(title, content, name);
//        System.out.println(boardDto);
//        return "redirect:/home";
//    }
//
//    @GetMapping("/home")
//    public String index(Model model) {
//        model.addAttribute("boardList", boardService.readBoardAll());
//        return "home";
//    }
//
//    @GetMapping("/{id}")
//    public String readOne(@PathVariable("id") Long id, Model model) {
//        BoardDto dto = boardService.readBoard(id);
//        model.addAttribute("board", dto);
//        return "read";
//    }
//
//    @GetMapping("/{id}/update-view")
//    public String updateView(@PathVariable("id") Long id, Model model) {
//        BoardDto dto = boardService.readBoard(id);
//        model.addAttribute("board", dto);
//        return "update";
//    }
//
//    @PostMapping("/{id}/update")
//    public String update(
//            @PathVariable("id") Long id,
//            @RequestParam("title") String title,
//            @RequestParam("content") String content) {
//        BoardDto boardDto = boardService.updateBoard(id, title, content);
//        return "redirect:/{id}";
//    }
//
//    @GetMapping("/{id}/delete-view")
//    public String deleteView(@PathVariable("id") Long id, Model model) {
//        BoardDto dto = boardService.readBoard(id);
//        model.addAttribute("board", dto);
//        return "delete";
//    }
//
//    @PostMapping("/{id}/delete")
//    public String delete(@PathVariable("id") Long id) {
//        boardService.deleteBoard(id);
//        return "redirect:/home";
//    }
//}

//package com.happy.happycrud.chaeyeon;
//
//import com.happy.happycrud.chaeyeon.model.BoardDto;
//import org.springframework.stereotype.Service;
//
//import java.util.ArrayList;
//import java.util.List;
//
//@Service
//public class BoardService {
//    private Long nextId = 1L;
//    private final List<BoardDto> boardList = new ArrayList<>();
//
//    public BoardDto createBoard(String title, String content, String name) {
//        BoardDto boardDto = new BoardDto(nextId, title, content, name);
//        nextId++;
//        boardList.add(boardDto);
//        return boardDto;
//    }
//
//    public List<BoardDto> readBoardAll() {
//        return boardList;
//    }
//
//}

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
//    public BoardDto readBoard(Long id) {
//        for (BoardDto boardDto : boardList){
//            if (boardDto.getId().equals(id)) {
//                return boardDto;
//            }
//        }
//        return null;
//    }
//
//    public BoardDto updateBoard(Long id, String title, String content) {
//        int target = -1;
//        for (int i = 0; i < boardList.size(); i++) {
//            if (boardList.get(i).getId().equals(id)) {
//                target = i;
//                break;
//            }
//        }
//        if (target != -1) {
//            boardList.get(target).setTitle(title);
//            boardList.get(target).setContent(content);
//            return boardList.get(target);
//        }
//        else return null;
//    }
//
//
//}

package com.happy.happycrud.yezy;

import com.happy.happycrud.yezy.model.BoardDto;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class BoardService {
    private Long nextId = 1L;
    private final List<BoardDto> boardList = new ArrayList<>();

    public BoardDto createBoard(String title, String content, String name) {
        BoardDto newBoard = new BoardDto(nextId, title, content, name);
        nextId++;
        boardList.add(newBoard);
        return newBoard;
    }

    // BoardService에 모든 게시글을 반환하는 메소드
    public List<BoardDto> readBoradAll() {
        return boardList;
    }
}

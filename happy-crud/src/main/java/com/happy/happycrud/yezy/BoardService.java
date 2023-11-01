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

    // BoardService에서 모든 게시글을 반환하는 메소드 -> readAll
    public List<BoardDto> readBoradAll() {
        return boardList;
    }

    // BoardService에서 하나의 BoardDto를 반환하는 메소드 -> readOne
    // 찾는 기준: id
    public BoardDto readBoard(Long id) {
        for (BoardDto boardDto: boardList) {
            if (boardDto.getId().equals(id)) {
                return boardDto;
            }
        }
        return null;
    }

    public BoardDto updateBoard(Long id, String title, String content) {
        int target = -1;
        for (int i = 0; i < boardList.size(); i++) {
            if (boardList.get(i).getId().equals(id)) {
                target = i;
                break;
            }
        }
        if (target != -1) {
            boardList.get(target).setTitle(title);
            boardList.get(target).setContent(content);
            return boardList.get(target);
        } else {
            return null;
        }
    }

    public boolean deleteBoard(Long id) {
        int target = -1;
        for (int i = 0; i < boardList.size(); i++) {
            if (boardList.get(i).getId().equals(id)) {
                target = i;
                break;
            }
        }
        if (target != -1) {
            boardList.remove(target);
            return true;
        }
        return false;
    }
}

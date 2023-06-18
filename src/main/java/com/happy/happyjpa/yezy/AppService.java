package com.happy.happyjpa.yezy;

import com.happy.happyjpa.yezy.entities.BoardEntity;
import com.happy.happyjpa.yezy.repos.BoardRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AppService {
    // JpaRepository
    private final BoardRepository repository;

    public AppService(BoardRepository repository) {
        this.repository = repository;
    }

    // CREATE
    public void createBoard(String title, String content, String name) {
        BoardEntity newBoard = new BoardEntity();
        newBoard.setTitle(title);
        newBoard.setContent(content);
        newBoard.setName(name);
        repository.save(newBoard);
    }

    // READ
    public void readBoard() {
        System.out.println(repository.findById(1L));
    }
    public List<BoardEntity> readBoardAll() {
        return repository.findAll();
    }

    //UPDATE
    public void updateBoard(Long id) {
        BoardEntity targetEntity = repository.findById(id).orElse(new BoardEntity());
        targetEntity.setTitle("제목1 수정");
        targetEntity = repository.save(targetEntity);
        System.out.println(targetEntity);
    }
}

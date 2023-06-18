//package com.happy.happyjpa.chaeyeon;
//
//import com.happy.happyjpa.chaeyeon.entities.BoardEntity;
//import com.happy.happyjpa.chaeyeon.repos.BoardRepository;
//import org.springframework.stereotype.Service;
//
//import java.util.List;
//
//@Service
//public class AppService {
//    private final BoardRepository repository;
//
//    public AppService(BoardRepository repository) {
//        this.repository = repository;
//    }
//
//    public void craeteBoard(String title, String content, String name) {
//        BoardEntity newBoard = new BoardEntity();
//        newBoard.setTitle(title);
//        newBoard.setContent(content);
//        newBoard.setName(name);
//        repository.save(newBoard);
//    }
//
//    public void readBoard() {
//        System.out.println(repository.findById(1L));
//    }
//
//    public List<BoardEntity> readBoardAll() {
//        return repository.findAll();
//    }
//
//    public void updateBoard(Long id) {
//        BoardEntity targetEntity
//                = repository.findById(id).orElse(new BoardEntity());
//        targetEntity.setTitle("제목1 수정");
//        targetEntity = repository.save(targetEntity);
//        System.out.println(targetEntity);
//    }
//}

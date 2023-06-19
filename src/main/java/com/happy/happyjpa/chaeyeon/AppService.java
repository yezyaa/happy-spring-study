//package com.happy.happyjpa.chaeyeon;
//
//import com.happy.happyjpa.chaeyeon.entities.BoardEntity;
//import com.happy.happyjpa.chaeyeon.repos.BoardRepository;
//import org.springframework.stereotype.Service;
//
//import java.util.List;
//import java.util.Optional;
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
//    public BoardEntity readBoard(Long id) {
//        Optional<BoardEntity> entity = repository.findById(id);
//        if (entity.isPresent())
//            return entity.get();
//        else {
//            return null;
//        }
//    }
//
//    public List<BoardEntity> readBoardAll() {
//        return repository.findAll();
//    }
//
//    public void updateBoard(Long id, String title, String content) {
//        BoardEntity targetEntity
//                = repository.findById(id).orElse(new BoardEntity());
//        targetEntity.setTitle(title);
//        targetEntity.setContent(content);
//        targetEntity = repository.save(targetEntity);
//        System.out.println(targetEntity);
//    }
//
//    public void deleteBoard(Long id) {
//        BoardEntity targetEntity =
//                repository.findById(id).orElse(new BoardEntity());
//        repository.delete(targetEntity);
//    }
//}

<<<<<<< HEAD
//package com.happy.happyjpa.yezy;
//
//import com.happy.happyjpa.yezy.entities.BoardEntity;
//import com.happy.happyjpa.yezy.repos.BoardRepository;
//import org.springframework.stereotype.Service;
//
//import java.util.List;
//import java.util.Optional;
//
//@Service
//public class AppService {
//    // JpaRepository
//    private final BoardRepository repository;
//
//    public AppService(BoardRepository repository) {
//        this.repository = repository;
//    }
//
//    // CREATE
//    public void createBoard(String title, String content, String name) {
//        BoardEntity newBoard = new BoardEntity();
//        newBoard.setTitle(title);
//        newBoard.setContent(content);
//        newBoard.setName(name);
//        repository.save(newBoard);
//    }
//
//    // READ
//    public BoardEntity readBoard(Long id) {
//        Optional<BoardEntity> entity = repository.findById(id);
//        if (entity.isPresent()) {
//            return entity.get();
//        } else {
//          return null;
//        }
//    }
//
//    // READALL
////    public List<BoardEntity> readBoardAll() {
////        return repository.findAll();
////    }
//
//    // UPDATE
//    public void updateBoard(Long id, String title, String content) {
//        BoardEntity targetEntity = repository.findById(id).orElse(new BoardEntity());
//        targetEntity.setTitle(title);
//        targetEntity.setContent(content);
//        targetEntity = repository.save(targetEntity);
//        System.out.println(targetEntity);
//    }
//
//    // DELETE
//    public void deleteBoard(Long id) {
//        BoardEntity targetEntity = repository.findById(id).orElse(new BoardEntity());
//        repository.delete(targetEntity);
//    }
//
//    // findAllBy
//    public void findAllByTest() {
//        System.out.println("findAllByOrderByIdDesc");
//        List<BoardEntity> boardEntities = this.repository.findAllByOrderByIdDesc();
//        for (int i = 0; i < 5; i++) {
//            System.out.println(boardEntities.get(i));
//        }
//        System.out.println("...");
//    }
//
//    // @ResponseBody로 return
//    public List<BoardEntity> readStudentAll() {
//        return this.repository.findAll();
//    }
//}
=======
package com.happy.happyjpa.yezy;

import com.happy.happyjpa.yezy.dto.BoardDto;
import com.happy.happyjpa.yezy.entities.BoardEntity;
import com.happy.happyjpa.yezy.repos.BoardRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

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
    public BoardEntity readBoard(Long id) {
        Optional<BoardEntity> entity = repository.findById(id);
        if (entity.isPresent()) {
            return entity.get();
        } else {
          return null;
        }
    }

    // READALL
//    public List<BoardEntity> readBoardAll() {
//        return repository.findAll();
//    }

    // UPDATE
    public void updateBoard(Long id, String title, String content) {
        BoardEntity targetEntity = repository.findById(id).orElse(new BoardEntity());
        targetEntity.setTitle(title);
        targetEntity.setContent(content);
        targetEntity = repository.save(targetEntity);
        System.out.println(targetEntity);
    }

    // DELETE
    public void deleteBoard(Long id) {
        BoardEntity targetEntity = repository.findById(id).orElse(new BoardEntity());
        repository.delete(targetEntity);
    }

    // findAllBy
    public void findAllByTest() {
        System.out.println("findAllByOrderByIdDesc");
        List<BoardEntity> boardEntities = this.repository.findAllByOrderByIdDesc();
        for (int i = 0; i < 5; i++) {
            System.out.println(boardEntities.get(i));
        }
        System.out.println("...");
    }

    // @ResponseBody로 return
//    public List<BoardEntity> readBoardAll() {
//        return this.repository.findAll();
//    }

    public List<BoardDto> readBoardAll() {
        List<BoardDto> boardDtoList = new ArrayList<>();
        for (BoardEntity boardEntity:
                this.repository.findAll()) {

            boardDtoList.add(BoardDto.fromEntity(boardEntity));
        }
        return boardDtoList;
    }
}
>>>>>>> 4e7e1dd9db0c05702cbd8bdb7b36a98cf451dcbe

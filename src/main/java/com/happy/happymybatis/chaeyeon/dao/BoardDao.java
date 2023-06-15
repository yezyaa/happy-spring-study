//package com.happy.happymybatis.chaeyeon.dao;
//
//import com.happy.happymybatis.chaeyeon.mapper.BoardMapper;
//import com.happy.happymybatis.chaeyeon.model.Board;
//import com.happy.happymybatis.yezy.mapper.BoardMapper;
//import org.apache.ibatis.session.SqlSession;
//import org.apache.ibatis.session.SqlSessionFactory;
//import org.springframework.stereotype.Repository;
//
//import java.util.List;
//
//@Repository
//public class BoardDao {
//    private final SqlSessionFactory sessionFactory;
//
//    public BoardDao(SqlSessionFactory sessionFactory) {
//        this.sessionFactory = sessionFactory;
//    }
//
//    public void createStudent(Board board) {
//        try (SqlSession session = sessionFactory.openSession()) {
//            BoardMapper boardMapper = session.getMapper(BoardMapper.class);
//            boardMapper.insertBoard(board);
//        }
//    }
//
//    public List<Board> readBoardAll() {
//        try (SqlSession session = sessionFactory.openSession()) {
//            BoardMapper boardMapper =
//                    session.getMapper(BoardMapper.class);
//            return boardMapper.selectBoardAll();
//        }
//    }
//
//    public Board readBoard(Long id) {
//        try (SqlSession session = sessionFactory.openSession()) {
//            BoardMapper boardMapper = session.getMapper(BoardMapper.class);
//            return boardMapper.selectBoard(id);
//        }
//    }
//}

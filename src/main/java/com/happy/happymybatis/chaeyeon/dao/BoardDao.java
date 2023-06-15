//package com.happy.happymybatis.chaeyeon.dao;
//
//import com.happy.happymybatis.chaeyeon.mapper.BoardMapper;
//import com.happy.happymybatis.chaeyeon.model.Board;
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
//    public List<Board> readBoardAll() {
//        try (SqlSession session = sessionFactory.openSession()) {
//            BoardMapper boardMapper =
//                    session.getMapper(BoardMapper.class);
//            return boardMapper.selectBoardAll();
//        }
//    }
//}

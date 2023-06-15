package com.happy.happymybatis.yezy.dao;

import com.happy.happymybatis.yezy.mapper.BoardMapper;
import com.happy.happymybatis.yezy.model.Board;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class StudentDao {
    private final SqlSessionFactory sessionFactory;
    public StudentDao(SqlSessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    public List<Board> readStudentsAll() {
        try (SqlSession session = sessionFactory.openSession()) {
            BoardMapper boardMapper = session.getMapper(BoardMapper.class);
            return boardMapper.selectBoardAll();
        }
    }
}
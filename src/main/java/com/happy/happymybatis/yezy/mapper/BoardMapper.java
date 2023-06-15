package com.happy.happymybatis.yezy.mapper;

import com.happy.happymybatis.yezy.model.Board;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper // MyBatis가 Mapper가 붙은 클래스를 데이터베이스 통신에 사용할 준비를 해줌
public interface BoardMapper {
    @Select("SELECT * FROM board")
    List<Board> selectBoardAll();

    @Insert("INSERT INTO board(title, content, name)\n" + "VALUES(#{title}, #{content}, #{name}")
    void insertBoard(Board board);
}

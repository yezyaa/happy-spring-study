package com.happy.happymybatis.yezy.mapper;

import com.happy.happymybatis.yezy.model.Board;
import org.apache.ibatis.annotations.*;

import java.util.List;
import java.util.Optional;

@Mapper // MyBatis가 Mapper가 붙은 클래스를 데이터베이스 통신에 사용할 준비를 해줌
public interface BoardMapper {
    @Select("SELECT * FROM board")
    List<Board> selectBoardAll();

    @Select("SELECT * FROM board WHERE id = #{id}")
    Board selectBoard(Long id);

    @Insert("INSERT INTO board(title, content, name)\n" + "VALUES(#{title}, #{content}, #{name}")
    void insertBoard(Board board);

    @Update("UPDATE board SET " +
            "title = #{title}," +
            "content = #{content}," +
            "name = #{name}")
    void updateStudent(Board board);

    @Delete("DELETE FROM board " +
            "WHERE id = #{id}")
    void deleteBoard(Long id);

    @Select("SELECT * FROM board WHERE id = #{id}")
    Optional<Board> selectBoardOptional(Long id);
}

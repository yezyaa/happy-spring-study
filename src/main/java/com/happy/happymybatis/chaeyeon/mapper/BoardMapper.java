//package com.happy.happymybatis.chaeyeon.mapper;
//
//import com.happy.happymybatis.chaeyeon.model.Board;
//import lombok.Data;
//import org.apache.ibatis.annotations.*;
//
//import java.util.List;
//import java.util.Optional;
//
//@Mapper
//public interface BoardMapper {
//    @Select("SELECT * FROM board")
//    List<Board> selectBoardAll();
//
//    @Select("SELECT * FROM board WHERE id = #{id}")
//    Board selectBoard(Long id);
//
//    @Insert("INSERT INTO board(title, content, name)\n" + "VALUES(#{title}, #{content}, #{name})")
//    void insertBoard(Board board);
//
//    @Update("UPDATE board SET " +
//            "title = #{title}," +
//            "content = #{content}," +
//            "name = #{name]")
//    void updateBoard(Board board);
//
//    @Delete("DELETE FROM students" +
//            "WHERE id = #{id}")
//    void deleteBoard(Long id);
//}

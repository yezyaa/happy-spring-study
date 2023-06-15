//package com.happy.happymybatis.chaeyeon.mapper;
//
//import com.happy.happymybatis.chaeyeon.model.Board;
//import org.apache.ibatis.annotations.Insert;
//import org.apache.ibatis.annotations.Mapper;
//import org.apache.ibatis.annotations.Select;
//
//import java.util.List;
//
//@Mapper
//public interface BoardMapper {
//    @Select("SELECT * FROM board")
//    List<Board> selectBoardAll();
//
//    @Insert("INSERT INTO board(title, content, name)\n" + "VALUES(#{title}, #{content}, #{name})")
//    void insertBoard(Board board);
//}

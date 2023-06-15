package com.happy.happymybatis.yezy.mapper;

import com.happy.happymybatis.yezy.model.Board;

import java.util.List;

public interface BoardXmlMapper {
    Board selectBoard(Long id);
    List<Board> selectBoardAll();
}

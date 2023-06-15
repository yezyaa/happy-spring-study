package com.happy.happymybatis;

import com.happy.happymybatis.yezy.dao.BoardDao;
import com.happy.happymybatis.yezy.model.Board;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class HappyMybatisApplication {

	public static void main(String[] args) {
		ApplicationContext applicationContext = SpringApplication.run(HappyMybatisApplication.class, args);
		BoardDao dao = applicationContext.getBean(BoardDao.class);

		// SELECT
//		System.out.println(dao.readBoardAll());
//		System.out.println(dao.readBoard(1L));
		System.out.println(dao.readAllXml());

		// INSERT
//		Board board = new Board();
//		board.setTitle("제목 추가");
//		board.setContent("내용 추가");
//		board.setName("dave");
//      dao.createBoard(board);
//      System.out.println(dao.readBoardAll());
	}

}

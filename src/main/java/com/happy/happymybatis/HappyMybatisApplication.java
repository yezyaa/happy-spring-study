package com.happy.happymybatis;

import com.happy.happymybatis.chaeyeon.dao.BoardDao;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class HappyMybatisApplication {

	public static void main(String[] args) {
		ApplicationContext applicationContext = SpringApplication.run(HappyMybatisApplication.class, args);
		BoardDao dao = applicationContext.getBean(BoardDao.class);

		System.out.println(dao.readBoardAll());
		System.out.println(dao.readAllXml());

	}

}

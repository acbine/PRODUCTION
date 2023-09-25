package production.management.persistence;


import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import lombok.extern.log4j.Log4j;


@Log4j
@RunWith(SpringJUnit4ClassRunner.class) 
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml")
public class MyBatisTest {
	@Autowired
	private SqlSessionFactory sqlSessionFactory;
	
	@Test
	public void testMyBatis() {// 자바에서 DB를 연결할떄처럼 이것은 mybatis에 연결해준다
		SqlSession session=sqlSessionFactory.openSession();
		log.info("SqlSession session 객체생성");
		session.getConnection();
		log.info("MyBatis 와 spring 연결 완료");
	}
	
}

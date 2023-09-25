package production.management.dao;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import lombok.extern.log4j.Log4j;
import lombok.extern.log4j.Log4j2;
import production.management.VO.PMVO;

@Log4j
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml")
public class TestproducitonMapper {
	
	@Autowired
	ProductionMapper produciotnMapper;
	
	@Test
	public void Testdate() {
		log.info("확인1");
		log.info(produciotnMapper.date());
		log.info("확인2");
	}
	
	@Test //삽입 쿼리
	public void insert() {
		PMVO vo = new PMVO();
		vo.setCode("I15");
		vo.setPname("등록 테스트3");
		vo.setPnum(1500);
		vo.setJnum(300);
		vo.setPnum(50);
		vo.setSale(2000);
		vo.setGcode("A");
		produciotnMapper.insert(vo);
		
	}
	
	@Test //데이터 조회 쿼리
	public void search() {
		log.info(produciotnMapper.search("I12"));
	}
	
	@Test //데이터 업데이트 쿼리
	public void update() {
		
		PMVO vo = new PMVO();
		vo.setCode("I13");
		vo.setPname("자바수정테스트1");
		vo.setPnum(10);
		vo.setJnum(30);
		vo.setPnum(10);
		vo.setSale(200);
		vo.setGcode("A");
		produciotnMapper.update(vo);
		
		
	}
	
	@Test //데이터 삭제 쿼리
	public void delete() {
		produciotnMapper.delete("I14");		
	}
	
	
	

}

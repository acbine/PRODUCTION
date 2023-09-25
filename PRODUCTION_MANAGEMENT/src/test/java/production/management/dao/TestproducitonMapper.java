package production.management.dao;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import lombok.extern.log4j.Log4j;

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
	

}

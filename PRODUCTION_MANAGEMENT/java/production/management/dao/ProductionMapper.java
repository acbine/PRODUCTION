package production.management.dao;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;

import production.management.VO.PMVO;

public interface ProductionMapper {
	
	//테스트 코드
	Date date ();
	
	//등록->데이터 넣어야 등록 리턴은-> 필요없음
	void insert(PMVO vo);
	
	//조회->데이터중 PMVO의 code를 넣어 조회 리턴은-> PMVO의 전체
	PMVO search(String SerStrcode);
	
	//수정->데이터중 PMVO 객체의  code를 넣어 리턴은-> 필요없음
	//mapper 수정필요
	void update(PMVO vo);
	
	//삭제 데이터중 PMVO의 code를 넣고  리턴은 -> 필요없음
	//완료
	void delete(String DeStrCode);

}

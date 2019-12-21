package kr.pmadvisor.web;

import javax.inject.Inject;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import kr.pmadvisor.domain.MemberVO;
import kr.pmadvisor.persistence.MemberDAO;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"file:src/main/webapp/WEB-INF/spring/**/*.xml"})
public class MemberDAOTest {
	
	@Inject
	private MemberDAO dao; // MemberDAO를 주입함
	
	@Test
	public void testTime() {
		System.out.println(dao.getTime());		
	}
	
	@Test
	public void testInsertMember() {
		
		MemberVO vo = new MemberVO();
		
		vo.setUserid("user00");
		vo.setUserpw("user00");
		vo.setUsername("USER00");
		vo.setEmail("user00@aaa.com");
		
		dao.insertMember(vo);
		
	}
	
	@Test
	public void testSelectMember() throws Exception {
		
		dao.readMember("user00");
		
	}	
	
	@Test
	public void testSelectWithPw() throws Exception {
		
		dao.readWithPW("user00", "user00");
		
	}

}

package kr.pmadvisor.persistence;

import kr.pmadvisor.domain.MemberVO;

//---------------------------------------------
// 데이터베이스의 현재 시간을 체크하는 기능
// tbl_member에 데이터를 추가하는 기능 
//
public interface MenberDAO {
	
	public String getTime();
	
	public void insertMember(MemberVO vo);

}

package kr.pmadvisor.persistence;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import kr.pmadvisor.domain.MemberVO;

@Repository
public class MemberDAOImpl implements MemberDAO{

	@Inject
	private SqlSession sqlSession;
	
	
	private static final String namespace =
			"kr.pmadvisor.mapper.MemberMapper";

	@Override
	public String getTime() {
		return sqlSession.selectOne(namespace+".getTime");
	}

	@Override
	public void insertMember(MemberVO vo) {
		sqlSession.insert(namespace+".insertMember", vo);
	}
	
}

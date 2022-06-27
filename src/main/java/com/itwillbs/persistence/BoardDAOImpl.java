package com.itwillbs.persistence;

import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

import com.itwillbs.domain.BoardVO;

@Repository
public class BoardDAOImpl implements BoardDAO {

	private static final Logger log = LoggerFactory.getLogger(BoardDAOImpl.class);
	// 디비 연결 및 mapper 연결처리 객체
	@Inject
	private SqlSession sqlSession;

	static final String Namespace = "com.itwillbs.mapper.BoardMapper";

	@Override
	public void create(BoardVO vo) {
		log.info("정보 전달 받아서 mapper 호출");

		// 정보 전달 받아서 mapper를 거쳐러 DB에 저장
		// sqlSession.insert("com.itwillbs.mapper.BoardMapper", vo);
		sqlSession.insert(Namespace + ".createBoard", vo);

		log.info("mapper에서 처리 후 이동");

	}

	@Override
	public List<BoardVO> listAll() {
		log.info("listAll() 호출");
		// mapper 해당 sql 호출
		// return sqlSession.selectList(Namespace+".listAll"); 
		List<BoardVO> boardList = sqlSession.selectList(Namespace + ".listAll");
		return boardList;
	}

	@Override
	public BoardVO getBoard(Integer bno) {
		// mapper에 있는 sql 호출
	//	BoardVO vo = sqlSession.selectOne(Namespace+".getBoard",bno);
		return sqlSession.selectOne(Namespace+".getBoard",bno);
	}

	@Override
	public void updateBoard(BoardVO VO) {
		// mapper - sql 호출
		sqlSession.update(Namespace+".updateBoard",VO);
		
	}

	@Override
	public void removeBoard(Integer bno) {
		sqlSession.delete(Namespace+".deleteBoard", bno);
	}

	@Override
	public void updateBoardCnt(Integer bno) {
		sqlSession.update(Namespace+".updateBoardCnt",bno);
	}

	


}

package com.itwillbs.persistence;

import java.util.List;

import com.itwillbs.domain.BoardVO;

public interface BoardDAO {
	
	// 글쓰기 (create)
	public void create(BoardVO vo);
	
	// 글 리스트 (select - list)
	public List<BoardVO> listAll();
	
	// 글 내용 (select - read)
	public BoardVO getBoard(Integer bno);
	
	// 글 수정 (update)
	public void updateBoard(BoardVO VO);
	
	// 글 삭제 (delete)
	public void removeBoard(Integer bno);
	
	// 글 조회수 1증가
	public void updateBoardCnt(Integer bno);
	
	
}

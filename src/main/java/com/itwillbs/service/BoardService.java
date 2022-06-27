package com.itwillbs.service;

import java.util.List;

import com.itwillbs.domain.BoardVO;

public interface BoardService {
	
	public void boardCreate(BoardVO vo);
	
	public List<BoardVO> getBoardListAll();
	
	public BoardVO readBoard(Integer bno);
	
	public void updateBoard(BoardVO vo);
	
	public void deleteBoard(Integer bno);
	
	public void updateBoardCount(Integer bno);
	
	
}

package com.my.board.dao;

import java.util.List;

import com.my.board.dto.BoardDto;

public interface BoardDao {

	String NAMESPACE = "board.";
	
	public List<BoardDto> selectList();
	public BoardDto selectOne(int myno);
	public int insert(BoardDto dto);
	public int update(BoardDto dto);
	public int delete(int myno);
	
}

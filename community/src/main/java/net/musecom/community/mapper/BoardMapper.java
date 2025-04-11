package net.musecom.community.mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import net.musecom.community.dto.BoardDto;

@Mapper
public interface BoardMapper {

	List<BoardDto> allList(int bid);
	List<BoardDto> getSearchList(
			@Param("bid") int bbsid, 
			@Param("option") String searchKey,
			@Param("search") String searchVal);
	BoardDto getBoardById(long id);
	int setBoard(BoardDto dto);
	int setUpdateBoard(BoardDto dto);
	int setDeleteBoard(long id);
	BoardDto getBoardByPassword(Map<String, Object> params);
	
	void updateRef(long id);
	void updateStep(Map<String, Object> map);
}

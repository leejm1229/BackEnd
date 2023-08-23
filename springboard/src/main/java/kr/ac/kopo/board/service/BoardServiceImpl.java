package kr.ac.kopo.board.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.ac.kopo.board.dao.BoardDAO;
import kr.ac.kopo.board.vo.BoardVO;


@Service
public class BoardServiceImpl implements boardService {

	@Autowired
	private BoardDAO boardDAO;

	@Override
	public List<BoardVO> getAllBoard() {

		List<BoardVO> boardlist = boardDAO.getAllPost();
		return boardlist;
	}

}

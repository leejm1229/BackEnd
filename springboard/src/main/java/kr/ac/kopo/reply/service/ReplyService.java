package kr.ac.kopo.reply.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import kr.ac.kopo.board.dao.BoardDAO;
import kr.ac.kopo.reply.dao.ReplyDAO;
import kr.ac.kopo.reply.vo.ReplyVO;

@Service
public class ReplyService {

	@Autowired
	private ReplyDAO replyDAO;
	
	@Autowired
	private BoardDAO boardDAO;

	
	@Transactional
	public void insertReply(ReplyVO replyVO) {
		replyDAO.insertReply(replyVO);
		boardDAO.increaseCount(replyVO.getBoardNo());
	}

	public List<ReplyVO> getReplybyBoardNo(int bno) {
		List<ReplyVO> replylist = replyDAO.getReplybyBoardNo(bno);
		return replylist;
	}
	
	
	@Transactional
	public void deleteReplyByNo(int boardNo, int replyNo) {
		boardDAO.decreaseCount(boardNo);
		replyDAO.deleteReplyByNo(replyNo);
	}
}

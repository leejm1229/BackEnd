package kr.ac.kopo.reply.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.ac.kopo.board.dao.BoardDAO;
import kr.ac.kopo.reply.dao.ReplyDAO;
import kr.ac.kopo.reply.vo.ReplyVO;

@Service
public class ReplyService {

	@Autowired
	private ReplyDAO replyDAO;
	
	@Autowired
	private BoardDAO boardDAO;

	public void insertReply(ReplyVO replyVO) {
		replyDAO.insertReply(replyVO);
		boardDAO.increaeCount(replyVO.getBoardNo());
	}

	public List<ReplyVO> getReplybyBoardNo(int bno) {
		List<ReplyVO> replylist = replyDAO.getReplybyBoardNo(bno);
		return replylist;
	}
	
	public void deleteReplyByNo(int replyNo) {
		replyDAO.deleteReplyByNo(replyNo);
	}
}

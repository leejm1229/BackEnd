package kr.ac.kopo.reply.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import kr.ac.kopo.reply.service.ReplyService;
import kr.ac.kopo.reply.vo.ReplyVO;

@Controller
public class ReplyController {

	@Autowired
	private ReplyService replyService;

	@ResponseBody
	@RequestMapping("/reply")
	public void writeReply(ReplyVO replyVO) {
		replyService.insertReply(replyVO);
	}

	
	@GetMapping("/reply/{bno}")
	@ResponseBody
	public List<ReplyVO> getAllReply(@PathVariable("bno") int bno) {
		List<ReplyVO> replylist = replyService.getReplybyBoardNo(bno);
		
		for(ReplyVO replyVO : replylist) {
			System.out.println(replyVO);
		}
		
		return replylist;
	}
}

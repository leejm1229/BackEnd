package kr.ac.kopo.reply.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
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
}

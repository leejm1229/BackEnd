package kr.ac.kopo.board.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class boardController {
	
	@GetMapping("/board")
	public ModelAndView getAllBoard() {
		ModelAndView mav = new ModelAndView("board/boardlist");
		return mav;
	}
}

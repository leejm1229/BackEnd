package kr.ac.kopo.board.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import kr.ac.kopo.board.service.BoardService;
import kr.ac.kopo.board.vo.BoardVO;

@Controller
public class BoardController {
    
    @Autowired
    private BoardService boardService;
    
//    @GetMapping("/post")
//    public String getPostbyNo(@RequestParam("no") int no,
//            Model model) {
//        BoardVO boardVO = boardService.getPostByNo(no);
//        model.addAttribute("boardVO", boardVO);
//        return "board/detail";
//    }
    
    @GetMapping("/board/{no}")
    public String getPostbyNo(@PathVariable("no") int no,
            Model model) {
        BoardVO boardVO = boardService.getPostByNo(no);
        model.addAttribute("boardVO", boardVO);
        return "board/detail";
    }
    
    @GetMapping("/board")
    public ModelAndView getAllBoard() {
        
        ModelAndView mav = new ModelAndView("board/boardlist");
        
        List<BoardVO> boardlist = boardService.getAllBoard();
        
        mav.addObject("boardlist", boardlist);
        return mav;
    }
    
    
    @GetMapping("/board/new")
    public String newPost() {
        return "board/writeForm";
    }
    
    @PostMapping("/board/new")
    public String postNewPost(BoardVO boardVO) {
        //boardService에 일을 시킬거야~
        boardService.writeNewPost(boardVO);
        return "redirect:/board";
    }
    
}

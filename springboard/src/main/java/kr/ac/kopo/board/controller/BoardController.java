package kr.ac.kopo.board.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import kr.ac.kopo.board.service.BoardService;
import kr.ac.kopo.board.vo.BoardVO;

@Controller
public class BoardController {

    @Autowired
    private BoardService boardService;

    //    @GetMapping("/post")
    @GetMapping("/board/{no}")
    public String getPostByNo(@PathVariable("no") int no,
                              Model model) {
        BoardVO boardVO = boardService.getPostByNo(no);
        model.addAttribute("boardVO", boardVO);
        return "board/detail";
    }
    //    @GetMapping("/post")
//    public String getPostByNo(@RequestParam("no") int no,
//                              Model model) {
//        BoardVO boardVO = boardService.getPostByNo(no);
//        model.addAttribute("boardVO", boardVO);
//        return "board/detail";
//    }

    @GetMapping("/board")
    public ModelAndView getAllBoard() {
        ModelAndView modelAndView = new ModelAndView("board/boardlist");
        List<BoardVO> boardList = boardService.getAllBoard();
        modelAndView.addObject("boardlist", boardList);
        return modelAndView;
    }

    @GetMapping("/board/new")
    public String newPost(Model model) {

        BoardVO boardVO = new BoardVO();
        boardVO.setTitle("기본제목");
        model.addAttribute("boardVO", boardVO);

        return "board/writeForm";
    }

    @PostMapping("/board/new")
    public String newPostProcess(@Valid BoardVO boardVO, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            System.out.println("null 값이 있습니다.");
            return "board/writeForm";
        } else {
            boardService.writeNewPost(boardVO);

            return "redirect:/board";
        }
    }
    
    
}
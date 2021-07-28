package com.my.board.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.my.board.biz.BoardBiz;
import com.my.board.dto.BoardDto;

@Controller
public class BoardController {

	@Autowired
	private BoardBiz biz;
	
	@RequestMapping("/list.do")
	public String selectList(Model model) {
		model.addAttribute("list", biz.selectList());
		return "list";
	}
	
	@RequestMapping("/select.do")
	public String selectOne(Model model, int myno) {
		model.addAttribute("dto", biz.selectOne(myno));
		return "boardselect";
	}
	
	@RequestMapping("/insertform.do")
	public String insertForm() {
		return "boardinsert";
	}
	
	@RequestMapping("/insertres.do")
	public String insertRes(BoardDto dto) {
		if (biz.insert(dto) > 0) {
			return "redirect:list.do";
		}
		return "redirect:insertform.do";
	}
	
	@RequestMapping("/updateform.do")
	public String updateForm(Model model, int myno) {
		model.addAttribute("dto", biz.selectOne(myno));
		return "boardupdate";
	}
	
	@RequestMapping("/updateres.do")
	public String updateRes(BoardDto dto) {
		if (biz.update(dto) > 0) {
			return "redirect:select.do?myno="+dto.getMyno();
		}
		
		return "redirect:updateform.do?myno="+dto.getMyno();
	}
	
	@RequestMapping("/delete.do")
	public String delete(int myno) {
		if (biz.delete(myno) > 0) {
			return "redirect:list.do";
		}
		return "redirect:select.do?myno=" + myno;
	}
}

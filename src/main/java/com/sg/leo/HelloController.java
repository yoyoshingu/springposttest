package com.sg.leo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

import com.sg.leo.domain.Post;
import com.sg.leo.service.PostService;

@Controller
public class HelloController {

	@GetMapping("/html")
	public String html() {
		System.out.println("html 파일 요청됨");
		return "redirect:hello.html";
	}
	
	@GetMapping("/jsp")
	public String jsp(Model model) {
		System.out.println("JSp파일 요청됨");
		model.addAttribute("dowhat", "post시험하려고함");
		return "hellojsp";
	}
	
	@GetMapping("/post")
	public String post(Model model) {
		System.out.println("POST등록 화면");
		return "insertPost";
	}
	
//	@PostMapping("/post")
//	public String insertpost(Model model) {
//		System.out.println("POST등록 요청됨");
//		return "Post를 등록했음";
//	}
	@Autowired
	private PostService postService;
	
	@PostMapping("/post")
	public @ResponseBody String insertPost(@RequestBody Post post){
		post.setCnt(0);
		postService.insertPost(post);
		return "새로운 포스트 등록";
	}
	
}

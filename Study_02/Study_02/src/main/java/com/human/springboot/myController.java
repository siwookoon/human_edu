package com.human.springboot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;

@Controller
public class myController {
	@Autowired
	HttpSession session;

	@RequestMapping("/")
	public String doRoot(HttpServletRequest req, Model model) {
//		session=req.getSession();
//		String sess_info=(String) session.getAttribute("gUserid");
//		System.out.println("sess_info"+sess_info);
//		model.addAttribute("userid", sess_info);
		return "index";
	}
	@RequestMapping("/login")
	public String dologin() {
		return "login";
	}
	@RequestMapping("/checkuser")
	public String docheck(HttpServletRequest req, Model model) {
		String uid = req.getParameter("loginid");
		String pw = req.getParameter("passcode");
		
		session=req.getSession();
		session.setAttribute("gUserid", uid);
		System.out.println("uid"+uid);
		return "redirect:/";
	}
	@RequestMapping("/signin")
	public String dosign() {
		return "signin";
	}
	@RequestMapping("/viewuser")
	public String doviewuser(Person req, Model model) {
		model.addAttribute("person", req);
		return "viewuser";
	}
	@RequestMapping("/logout")
	public String dologout(HttpServletRequest req) {
		HttpSession session = req.getSession();
		session.invalidate();
		return "redirect:/";
	}
}

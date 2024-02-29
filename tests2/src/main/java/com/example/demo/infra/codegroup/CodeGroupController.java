package com.example.demo.infra.codegroup;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CodeGroupController {
	
	
	@Autowired
	CodeGroupService service;
	
	@RequestMapping(value = "/codeGroupXdmList")
	public String codeGroupXdmList(Model model) throws Exception
	{
		
		model.addAttribute("list", service.selectList());
//		List<CodeGroupDto> CodeGroupDtos = service.selectList();
//		
//		for(CodeGroupDto a : CodeGroupDtos)
//		{
//			System.out.println(a.getGroupname());
//		}
		
		
		
		return "codeGroupXdmList";
	}

}

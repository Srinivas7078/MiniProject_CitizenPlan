package in.ashokit.controller;

import java.util.List;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import in.ashokit.entity.Citizen;
import in.ashokit.request.SearchRequest;
import in.ashokit.service.ServiceImpl;

@Controller
public class CitizenController {
	@Autowired
	private ServiceImpl serv;

	@GetMapping("/")
	public String loadIndex(Model model) {
		model.addAttribute("search", new SearchRequest());
		init(model);
		return "index";
	}

	@PostMapping("/searchData")
	public String search(SearchRequest req, Model model) {
		init(model);
		List<Citizen> citizenList = serv.search(req);
		model.addAttribute("plans1", citizenList);
		model.addAttribute("search",req);
		return "index";
	}

	private void init(Model model) {
		
		model.addAttribute("status", serv.getPlanStatus());
		model.addAttribute("plans", serv.getPlanNames());
		model.addAttribute("gender",serv.getGender());
	}
	  @GetMapping("/excel")
	public void downloadExcel(HttpServletResponse response)throws Exception {
		response.setContentType("application/octet-stream");
		response.addHeader("Content-Disposition", "attachment;filename=plans.xls");
		serv.exportExcel(response);
	}
	  @GetMapping("/pdf")
		public void downloadPdf(HttpServletResponse response)throws Exception {
			response.setContentType("application/pdf");
			response.addHeader("Content-Disposition", "attachment;filename=plans.pdf");
			serv.exportPdf(response);
		}
}

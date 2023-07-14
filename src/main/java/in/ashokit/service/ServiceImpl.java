package in.ashokit.service;

import java.util.List;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.stereotype.Service;

import in.ashokit.entity.Citizen;
import in.ashokit.repo.CirtizenRepository;
import in.ashokit.request.SearchRequest;
import in.ashokit.utils.ExcelGenerator;
import in.ashokit.utils.PdfGenerator;

@Service
public class ServiceImpl implements ServiceInterface {
	@Autowired
	private CirtizenRepository repo;
	@Autowired
	private ExcelGenerator excelGen;

	@Autowired
	private PdfGenerator pdfGen;

	Citizen c = new Citizen();

	@Override
	public List<String> getPlanNames() {
		List<String> planNames = repo.getPlanNames();

		return planNames;

	}

	@Override
	public List<String> getPlanStatus() {
		List<String> planStatus = repo.getPlanStatus();
		return planStatus;
	}

	@Override
	public List<Citizen> search(SearchRequest req) {
//		Citizen c=new Citizen();
		if (null != req.getPlanName() && !"".equals(req.getPlanName())) {
			c.setPlanName(req.getPlanName());
		}
		if (null != req.getPlanStatus() && !"".equals(req.getPlanStatus())) {
			c.setPlanStatus(req.getPlanStatus());
		}
		if (null != req.getGender() && !"".equals(req.getGender())) {
			c.setGender(req.getGender());
		}

		Example<Citizen> of = Example.of(c);
		List<Citizen> findAll = repo.findAll(of);
//		 BeanUtils.copyProperties(findAll, list);
		return findAll;
	}

	@Override
	public Boolean exportExcel(HttpServletResponse response) throws Exception {
		excelGen.generateExcel(response, c);
		return true;
	}

	@Override
	public Boolean exportPdf(HttpServletResponse response) throws Exception {
		pdfGen.pdfGenerate(response, c);
		return true;
	}

	@Override
	public List<String> getGender() {
		List<String> gender = repo.getGender();
		return gender;
	}

}

package in.ashokit.service;

import java.util.List;

import javax.servlet.http.HttpServletResponse;

import in.ashokit.entity.Citizen;
import in.ashokit.request.SearchRequest;

public interface ServiceInterface {

	public List<String> getPlanNames();

	public List<String> getPlanStatus();
	
	public List<String> getGender();

	public List<Citizen> search(SearchRequest req);

	public Boolean exportExcel(HttpServletResponse response)throws Exception;

	public Boolean exportPdf(HttpServletResponse response)throws Exception;

}

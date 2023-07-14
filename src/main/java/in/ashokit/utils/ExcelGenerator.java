package in.ashokit.utils;

import java.util.List;

import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletResponse;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.stereotype.Component;

import in.ashokit.entity.Citizen;
import in.ashokit.repo.CirtizenRepository;

@Component
public class ExcelGenerator {
     @Autowired
	private CirtizenRepository repo;

	public void generateExcel(HttpServletResponse response,Citizen c) throws Exception {

	Example<Citizen> of = Example.of(c);
		List<Citizen> findAll = repo.findAll(of);
//	List<Citizen> findAll = repo.findAll();
		Workbook workbook = new HSSFWorkbook();
		Sheet sheet = workbook.createSheet("Plans-data");
		Row headerRow = sheet.createRow(0);
		headerRow.createCell(0).setCellValue("ID");
		headerRow.createCell(1).setCellValue("Name");
		headerRow.createCell(2).setCellValue("PlanName");
		headerRow.createCell(3).setCellValue("PlanStatus");
		headerRow.createCell(4).setCellValue("Start Date");
		headerRow.createCell(5).setCellValue("End Date");

		int row = 1;
		for (Citizen cit : findAll) {
			Row dataRow = sheet.createRow(row);
			dataRow.createCell(0).setCellValue(cit.getCitizenId());
			dataRow.createCell(1).setCellValue(cit.getName());
			dataRow.createCell(2).setCellValue(cit.getPlanName());
			dataRow.createCell(3).setCellValue(cit.getPlanStatus());
			dataRow.createCell(4).setCellValue(cit.getPlanStartDate());
			dataRow.createCell(5).setCellValue(cit.getPlanEndDate());
			row++;
		}
		ServletOutputStream outputStream = response.getOutputStream();
		workbook.write(outputStream);
		workbook.close();

	}

}
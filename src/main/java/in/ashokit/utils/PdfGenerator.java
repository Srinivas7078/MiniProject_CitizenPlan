package in.ashokit.utils;

import java.util.List;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.stereotype.Component;

import com.lowagie.text.Document;
import com.lowagie.text.PageSize;
import com.lowagie.text.Paragraph;
import com.lowagie.text.pdf.PdfPTable;
import com.lowagie.text.pdf.PdfWriter;

import in.ashokit.entity.Citizen;
import in.ashokit.repo.CirtizenRepository;

@Component
public class PdfGenerator {

	@Autowired
	private CirtizenRepository repo;

	public void pdfGenerate(HttpServletResponse response, Citizen c) throws Exception {
		Example<Citizen> of = Example.of(c);
		List<Citizen> findAll = repo.findAll(of);
		Document document = new Document(PageSize.A4);
		PdfWriter.getInstance(document, response.getOutputStream());
		document.open();
		Paragraph p = new Paragraph("Records Citizen");
		document.add(p);
		PdfPTable pt = new PdfPTable(6);
		pt.addCell("ID");
		pt.addCell("Name");
		pt.addCell("PlanName");
		pt.addCell("PlanStatus");
		pt.addCell("Start Date");
		pt.addCell("End Date");

		for (Citizen pd : findAll) {
			pt.addCell(String.valueOf(pd.getCitizenId()));
			pt.addCell(String.valueOf(pd.getName()));
			pt.addCell(String.valueOf(pd.getPlanName()));
			pt.addCell(String.valueOf(pd.getPlanStatus()));
			pt.addCell(String.valueOf(pd.getPlanStartDate()));
			pt.addCell(String.valueOf(pd.getPlanEndDate()));

		}
		document.add(pt);
		document.close();
	}
}

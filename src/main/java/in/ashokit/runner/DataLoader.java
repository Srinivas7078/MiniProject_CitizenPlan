//package in.ashokit.runner;
//
//import java.time.LocalDate;
//import java.util.ArrayList;
//import java.util.Arrays;
//import java.util.List;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.ApplicationArguments;
//import org.springframework.boot.ApplicationRunner;
//import org.springframework.stereotype.Component;
//
//import in.ashokit.entity.Citizen;
//import in.ashokit.repo.CirtizenRepository;
//@Component
//public class DataLoader implements ApplicationRunner {
//	@Autowired
//    private CirtizenRepository repo;
//	@Override
//	public void run(ApplicationArguments args) throws Exception {
//		// TODO Auto-generated method stub
//		Citizen c1=new Citizen();
//		c1.setName("Jack");
//		c1.setGender("Male");
//		c1.setPlanName("Cash");
//		c1.setPlanStatus("Approved");
//		c1.setPlanStartDate(LocalDate.now());
//		c1.setPlanEndDate(LocalDate.now().plusMonths(6));
//		c1.setBenefitAmt(16000.00);
//		
//		Citizen c2=new Citizen();
//		c2.setName("John");
//		c2.setGender("Male");
//		c2.setPlanName("Employement");
//		c2.setPlanStatus("Denied");
//		c2.setPlanStartDate(LocalDate.now());
//		c2.setPlanEndDate(LocalDate.now().plusMonths(6));
//		c2.setBenefitAmt(16000.00);
//		c2.setTerminateDate(LocalDate.now());
//		c2.setTerminateReason("Govt Job");
//		
//		Citizen c3=new Citizen();
//		c3.setName("Rani");
//		c3.setGender("female");
//		c3.setPlanName("Housing");
//		c3.setPlanStatus("Approved");
//		c3.setPlanStartDate(LocalDate.now());
//		c3.setPlanEndDate(LocalDate.now().plusMonths(6));
//		c3.setBenefitAmt(26000.00);
//		
//		
//		Citizen c4=new Citizen();
//		c4.setName("Radha");
//		c4.setGender("femaale");
//		c4.setPlanName("Employement");
//		c4.setPlanStatus("Denied");
//		c4.setPlanStartDate(LocalDate.now());
//		c4.setPlanEndDate(LocalDate.now().plusMonths(6));
//		c4.setBenefitAmt(16000.00);
//		c4.setTerminateDate(LocalDate.now());
//		c4.setTerminateReason("No PF account");
//		
//		Citizen c5=new Citizen();
//		c5.setName("Ranga");
//		c5.setGender("Male");
//		c5.setPlanName("Cash");
//		c5.setPlanStatus("Approved");
//		c5.setPlanStartDate(LocalDate.now());
//		c5.setPlanEndDate(LocalDate.now().plusMonths(6));
//		c5.setBenefitAmt(15000.00);
//		
//		Citizen c6=new Citizen();
//		c6.setName("Mahesh");
//		c6.setGender("Male");
//		c6.setPlanName("Employement");
//		c6.setPlanStatus("Denied");
//		c6.setPlanStartDate(LocalDate.now());
//		c6.setPlanEndDate(LocalDate.now().plusMonths(6));
//		c6.setBenefitAmt(16000.00);
//		c6.setTerminateDate(LocalDate.now());
//		c6.setTerminateReason("Govt Job");
//		
//		Citizen c7=new Citizen();
//		c7.setName("Ramba");
//		c7.setGender("female");
//		c7.setPlanName("Housing");
//		c7.setPlanStatus("Approved");
//		c7.setPlanStartDate(LocalDate.now());
//		c7.setPlanEndDate(LocalDate.now().plusMonths(6));
//		c7.setBenefitAmt(26000.00);
//		
//		
//		Citizen c8=new Citizen();
//		c8.setName("Kajaol");
//		c8.setGender("femaale");
//		c8.setPlanName("Employement");
//		c8.setPlanStatus("Denied");
//		c8.setPlanStartDate(LocalDate.now());
//		c8.setPlanEndDate(LocalDate.now().plusMonths(6));
//		c8.setBenefitAmt(16000.00);
//		c8.setTerminateDate(LocalDate.now());
//		c8.setTerminateReason("No PF account");
//		
//		Citizen c9=new Citizen();
//		c9.setName("samba");
//		c9.setGender("Male");
//		c9.setPlanName("Cash");
//		c9.setPlanStatus("Approved");
//		c9.setPlanStartDate(LocalDate.now());
//		c9.setPlanEndDate(LocalDate.now().plusMonths(6));
//		c9.setBenefitAmt(16000.00);
//		
//		Citizen c10=new Citizen();
//		c10.setName("Satti");
//		c10.setGender("Male");
//		c10.setPlanName("Employement");
//		c10.setPlanStatus("Denied");
//		c10.setPlanStartDate(LocalDate.now());
//		c10.setPlanEndDate(LocalDate.now().plusMonths(6));
//		c10.setBenefitAmt(16000.00);
//		c10.setTerminateDate(LocalDate.now());
//		c10.setTerminateReason("Govt Job");
//		
//		Citizen c11=new Citizen();
//		c11.setName("Vyshu");
//		c11.setGender("female");
//		c11.setPlanName("Housing");
//		c11.setPlanStatus("Approved");
//		c11.setPlanStartDate(LocalDate.now());
//		c11.setPlanEndDate(LocalDate.now().plusMonths(6));
//		c11.setBenefitAmt(26000.00);
//		
//		
//		Citizen c12=new Citizen();
//		c12.setName("Ruchitha");
//		c12.setGender("femaale");
//		c12.setPlanName("Employement");
//		c12.setPlanStatus("Denied");
//		c12.setPlanStartDate(LocalDate.now());
//		c12.setPlanEndDate(LocalDate.now().plusMonths(6));
//		c12.setBenefitAmt(16000.00);
//		c12.setTerminateDate(LocalDate.now());
//		c12.setTerminateReason("No PF account");
//		
//		
//		List<Citizen> asList = Arrays.asList(c1,c2,c3,c4,c5,c6,c7,c8,c9,c10,c11,c12);
//		repo.saveAll(asList);
//		
//	}
//
//}
	
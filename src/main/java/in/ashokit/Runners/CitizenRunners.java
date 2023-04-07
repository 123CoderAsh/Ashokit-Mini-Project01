package in.ashokit.Runners;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import in.ashokit.entity.CitizenPlan;
import in.ashokit.repository.CitizenRepository;

@Component
public class CitizenRunners implements ApplicationRunner {

	@Autowired
	private CitizenRepository repo;

	@Override
	public void run(ApplicationArguments args) throws Exception {

		CitizenPlan c1 = new CitizenPlan();
		c1.setCitizeName("ashish");
		c1.setGender("male");
		c1.setPlanName("cash");
		c1.setPlanStatus("Approved");
		c1.setPlanStartDate(LocalDate.now());
		c1.setPlanEndDate(LocalDate.now().plusMonths(6));
		c1.setBenefitAmount(5000.00);

		CitizenPlan c2 = new CitizenPlan();
		c2.setCitizeName("somnath");
		c2.setGender("fe-male");
		c2.setPlanName("food");
		c2.setPlanStatus("Approved");
		c2.setPlanStartDate(LocalDate.now());
		c2.setPlanEndDate(LocalDate.now().plusMonths(6));
		c2.setBenefitAmount(5000.00);

		CitizenPlan c3 = new CitizenPlan();
		c3.setCitizeName("atul");
		c3.setGender("male");
		c3.setPlanName("Medical");
		c3.setPlanStatus("Approved");
		c3.setPlanStartDate(LocalDate.now());
		c3.setPlanEndDate(LocalDate.now().plusMonths(6));
		c3.setBenefitAmount(5000.00);

		CitizenPlan c4 = new CitizenPlan();
		c4.setCitizeName("suraj");
		c4.setGender("male");
		c4.setPlanName("Employment");
		c4.setPlanStatus("Approved");
		c4.setPlanStartDate(LocalDate.now());
		c4.setPlanEndDate(LocalDate.now().plusMonths(6));
		c4.setBenefitAmount(5000.00);

		CitizenPlan c5 = new CitizenPlan();
		c5.setCitizeName("shubham");
		c5.setGender("male");
		c5.setPlanName("cash");
		c5.setPlanStatus("Denied");
		c5.setDenialReason("Rental Income");

		CitizenPlan c6 = new CitizenPlan();
		c6.setCitizeName("viki");
		c6.setGender("male");
		c6.setPlanName("Food");
		c6.setPlanStatus("Denied");
		c6.setDenialReason("Employment");

		CitizenPlan c7 = new CitizenPlan();
		c7.setCitizeName("swapnil");
		c7.setGender("male");
		c7.setPlanName("medical");
		c7.setPlanStatus("Denied");
		c7.setDenialReason("Employment");

		CitizenPlan c8 = new CitizenPlan();
		c8.setCitizeName("juber");
		c8.setGender("male");
		c8.setPlanName("employment");
		c8.setPlanStatus("Denied");
		c8.setDenialReason("it Employment");

		CitizenPlan c9 = new CitizenPlan();
		c9.setCitizeName("ashish");
		c9.setGender("male");
		c9.setPlanName("Cash");
		c9.setPlanStatus("Terminated");
		c9.setPlanStartDate(LocalDate.now().minusMonths(3));
		c9.setPlanEndDate(LocalDate.now().plusMonths(6));
		c9.setBenefitAmount(6000.00);
		c9.setTerminatedDate(LocalDate.now());
		c9.setTerminatedReason("money Problem");

		CitizenPlan c10 = new CitizenPlan();
		c10.setCitizeName("juber");
		c10.setGender("male");
		c10.setPlanName("Food");
		c10.setPlanStatus("Terminated");
		c10.setPlanStartDate(LocalDate.now().minusMonths(4));
		c10.setPlanEndDate(LocalDate.now().plusMonths(6));
		c10.setBenefitAmount(8000.00);
		c10.setTerminatedDate(LocalDate.now());
		c10.setTerminatedReason("employment");

		CitizenPlan c11 = new CitizenPlan();
		c11.setCitizeName("somnath");
		c11.setGender("male");
		c11.setPlanName("Cash");
		c11.setPlanStatus("Terminated");
		c11.setPlanStartDate(LocalDate.now().minusMonths(3));
		c11.setPlanEndDate(LocalDate.now().plusMonths(6));
		c11.setBenefitAmount(6000.00);
		c11.setTerminatedDate(LocalDate.now());
		c11.setTerminatedReason("money Problem");

		CitizenPlan c12 = new CitizenPlan();
		c12.setCitizeName("kunal");
		c12.setGender("male");
		c12.setPlanName("Food");
		c12.setPlanStatus("Terminated");
		c12.setPlanStartDate(LocalDate.now().minusMonths(4));
		c12.setPlanEndDate(LocalDate.now().plusMonths(6));
		c12.setBenefitAmount(8000.00);
		c12.setTerminatedDate(LocalDate.now());
		c12.setTerminatedReason("employment");

		CitizenPlan c13 = new CitizenPlan();
		c13.setCitizeName("ashish");
		c13.setGender("male");
		c13.setPlanName("cash");
		c13.setPlanStatus("Approved");
		c13.setPlanStartDate(LocalDate.now());
		c13.setPlanEndDate(LocalDate.now().plusMonths(6));
		c13.setBenefitAmount(5000.00);

		CitizenPlan c14 = new CitizenPlan();
		c14.setCitizeName("somnath");
		c14.setGender("fe-male");
		c14.setPlanName("food");
		c14.setPlanStatus("Approved");
		c14.setPlanStartDate(LocalDate.now());
		c14.setPlanEndDate(LocalDate.now().plusMonths(6));
		c14.setBenefitAmount(5000.00);

		CitizenPlan c15 = new CitizenPlan();
		c15.setCitizeName("atul");
		c15.setGender("male");
		c15.setPlanName("Medical");
		c15.setPlanStatus("Approved");
		c15.setPlanStartDate(LocalDate.now());
		c15.setPlanEndDate(LocalDate.now().plusMonths(6));
		c15.setBenefitAmount(5000.00);

		CitizenPlan c16 = new CitizenPlan();
		c16.setCitizeName("suraj");
		c16.setGender("male");
		c16.setPlanName("Employment");
		c16.setPlanStatus("Approved");
		c16.setPlanStartDate(LocalDate.now());
		c16.setPlanEndDate(LocalDate.now().plusMonths(6));
		c16.setBenefitAmount(5000.00);

		CitizenPlan c17 = new CitizenPlan();
		c17.setCitizeName("shubham");
		c17.setGender("male");
		c17.setPlanName("cash");
		c17.setPlanStatus("Denied");
		c17.setDenialReason("Rental Income");

		CitizenPlan c18 = new CitizenPlan();
		c18.setCitizeName("viki");
		c18.setGender("male");
		c18.setPlanName("Food");
		c18.setPlanStatus("Denied");
		c18.setDenialReason("Employment");

		CitizenPlan c19 = new CitizenPlan();
		c19.setCitizeName("swapnil");
		c19.setGender("male");
		c19.setPlanName("medical");
		c19.setPlanStatus("Denied");
		c19.setDenialReason("Employment");

		CitizenPlan c20 = new CitizenPlan();
		c20.setCitizeName("juber");
		c20.setGender("male");
		c20.setPlanName("employment");
		c20.setPlanStatus("Denied");
		c20.setDenialReason("it Employment");

		CitizenPlan c21 = new CitizenPlan();
		c21.setCitizeName("ashish");
		c21.setGender("male");
		c21.setPlanName("Cash");
		c21.setPlanStatus("Terminated");
		c21.setPlanStartDate(LocalDate.now().minusMonths(3));
		c21.setPlanEndDate(LocalDate.now().plusMonths(6));
		c21.setBenefitAmount(6000.00);
		c21.setTerminatedDate(LocalDate.now());
		c21.setTerminatedReason("money Problem");

		CitizenPlan c22 = new CitizenPlan();
		c22.setCitizeName("juber");
		c22.setGender("male");
		c22.setPlanName("Food");
		c22.setPlanStatus("Terminated");
		c22.setPlanStartDate(LocalDate.now().minusMonths(4));
		c22.setPlanEndDate(LocalDate.now().plusMonths(6));
		c22.setBenefitAmount(8000.00);
		c22.setTerminatedDate(LocalDate.now());
		c22.setTerminatedReason("employment");

		CitizenPlan c23 = new CitizenPlan();
		c23.setCitizeName("somnath");
		c23.setGender("male");
		c23.setPlanName("Cash");
		c23.setPlanStatus("Terminated");
		c23.setPlanStartDate(LocalDate.now().minusMonths(3));
		c23.setPlanEndDate(LocalDate.now().plusMonths(6));
		c23.setBenefitAmount(6000.00);
		c23.setTerminatedDate(LocalDate.now());
		c23.setTerminatedReason("money Problem");

		CitizenPlan c24 = new CitizenPlan();
		c24.setCitizeName("kunal");
		c24.setGender("male");
		c24.setPlanName("Food");
		c24.setPlanStatus("Terminated");
		c24.setPlanStartDate(LocalDate.now().minusMonths(4));
		c24.setPlanEndDate(LocalDate.now().plusMonths(6));
		c24.setBenefitAmount(8000.00);
		c24.setTerminatedDate(LocalDate.now());
		c24.setTerminatedReason("employment");

		List<CitizenPlan> asList = Arrays.asList(c1, c2, c3, c4, c5, c6, c7, c8, c9, c10, c11, c12, c13, c14, c15, c16,
				c17, c18, c19, c20, c21, c22, c23, c24);

		repo.saveAll(asList);

	}

}

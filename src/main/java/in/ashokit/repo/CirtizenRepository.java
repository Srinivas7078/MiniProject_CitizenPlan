package in.ashokit.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import in.ashokit.entity.Citizen;

public interface CirtizenRepository extends JpaRepository<Citizen, Integer> {
	@Query("select distinct(planName) from Citizen")
	public List<String> getPlanNames();
		
	@Query("select distinct(planStatus) from Citizen")
	public List<String> getPlanStatus();
	@Query("select distinct(gender) from Citizen")
	public List<String> getGender();

}

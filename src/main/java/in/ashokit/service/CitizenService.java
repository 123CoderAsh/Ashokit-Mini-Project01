package in.ashokit.service;

import org.springframework.stereotype.Service;

import java.util.*;

import in.ashokit.entity.CitizenPlan;
import in.ashokit.serchingrequest.SerchRequest;

@Service
public interface CitizenService {
	
	public List<String> getPlanNames();
	
	public List<String> getPlanStatus();
	
	public List<CitizenPlan> serch(SerchRequest request);
	
	public boolean exportPdf();
	
	public boolean exportExcel();
	

}

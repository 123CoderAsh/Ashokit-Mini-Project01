package in.ashokit.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import in.ashokit.service.CitizenService;

@Controller
public class ReportController {

	@Autowired
	private CitizenService citirepo;
}

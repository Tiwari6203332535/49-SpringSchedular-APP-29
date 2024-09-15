package in.happy.service;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

@Service
public class ReportService {
//@Scheduled(fixedRate = 9000)
//	@Scheduled(fixedDelay =  9000)
	@Scheduled(cron ="0/5 * * * * *")
	public void generatReport() {
		
		 //logic
		System.out.println("report generated");
	}

}

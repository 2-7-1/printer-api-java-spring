package com.printerapijavaspring.webservices.printerapijavaspring.printer;

import java.util.ArrayList;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;

import org.springframework.stereotype.Component;

@Component
public class PrinterDALService {
	private static List<PrintJob> printerQueue = new ArrayList<>();
	private static List<PrintJob> completed = new ArrayList<>();
	
	static {
		TimerTask timerTask = new TimerTask() {

			@Override
			public void run() {
				if (printerQueue.size() > 0) {
					PrintJob finishedJob = printerQueue.remove(0);
					finishedJob.setStatus("complete");
					completed.add(finishedJob);
					if (printerQueue.size() > 0) {
						printerQueue.get(0).setStatus("inProgress");
					}
				}
			}
		};
		Timer timer = new Timer(true);
		timer.scheduleAtFixedRate(timerTask, 30000, 30000);
	}

	public List<PrintJob> getPrinterQueue() {
		List<PrintJob> allQueue= new ArrayList<>();
		allQueue.addAll(printerQueue);
		allQueue.addAll(completed);
		return allQueue;
	}
	
	public Integer postPrinterQueue(Integer id) {
		printerQueue.add(new PrintJob(id, "ready"));
		return id;
	}
}

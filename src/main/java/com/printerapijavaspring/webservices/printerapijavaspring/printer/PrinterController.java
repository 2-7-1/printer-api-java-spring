package com.printerapijavaspring.webservices.printerapijavaspring.printer;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PrinterController {
	
	@Autowired
	private PrinterDALService printerDALService;
	
	@RequestMapping(value = "/printer", method = RequestMethod.GET)
	public List<PrintJob> getPrinterQueue() {
		return printerDALService.getPrinterQueue();
	}
	
	@RequestMapping(value = "/printer/{id}", method = RequestMethod.POST)
	public Integer postPrinterQueue(@PathVariable Integer id) {
		return printerDALService.postPrinterQueue(id);
	}
}

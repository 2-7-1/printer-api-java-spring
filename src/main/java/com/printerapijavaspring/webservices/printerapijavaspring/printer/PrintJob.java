package com.printerapijavaspring.webservices.printerapijavaspring.printer;

public class PrintJob {
	private Integer id;
	private String status;

	public PrintJob() {
		super();
	}

	public PrintJob(Integer id, String status) {
		super();
		this.id = id;
		this.status = status;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}
}

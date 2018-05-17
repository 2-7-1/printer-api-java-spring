package com.printerapijavaspring.webservices.printerapijavaspring.part;

public class Part {
	private Integer id;
	private String materialType;
	private String printerType;
	private double orientationAngle;
	private double densityPercentage;

	public Part() {
		super();
	}

	public Part(Integer id, String materialType, String printerType, double orientationAngle, double densityPercentage) {
		super();
		this.id = id;
		this.materialType = materialType;
		this.printerType = printerType;
		this.orientationAngle = orientationAngle;
		this.densityPercentage = densityPercentage;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getMaterialType() {
		return materialType;
	}

	public void setMaterialType(String materialType) {
		this.materialType = materialType;
	}

	public String getPrinterType() {
		return printerType;
	}

	public void setPrinterType(String printerType) {
		this.printerType = printerType;
	}

	public double getOrientationAngle() {
		return orientationAngle;
	}

	public void setOrientationAngle(double orientationAngle) {
		this.orientationAngle = orientationAngle;
	}

	public double getDensityPercentage() {
		return densityPercentage;
	}

	public void setDensityPercentage(double densityPercentage) {
		this.densityPercentage = densityPercentage;
	}

	@Override
	public String toString() {
		return "Part [materialType=" + materialType + ", printerType=" + printerType + ", orientationAngle="
				+ orientationAngle + ", densityPercentage=" + densityPercentage + "]";
	}
}

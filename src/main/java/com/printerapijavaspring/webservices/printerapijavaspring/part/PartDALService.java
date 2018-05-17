package com.printerapijavaspring.webservices.printerapijavaspring.part;

import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Component;

@Component
public class PartDALService {
	private static List<Part> parts = new ArrayList<>();
	private static Integer partCount = 3;
	
	static {
		parts.add(new Part(1, "material_1", "printer_1", 11.11, 22.22));
		parts.add(new Part(2, "material_2", "printer_2", 33.33, 44.44));
		parts.add(new Part(3, "material_3", "printer_3", 55.55, 66.66));
	}
	
	public List<Part> listParts() {
		return parts;
	}
	
	public Part postPart(Part part) {
		if (part.getId() == null) {
			part.setId(++partCount);
		}
		parts.add(part);
		return part;
	}
	
	public Part getPart(Integer id) {
		for (Part part : parts) {
			if (part.getId() == id) {
				return part;
			}
		}
		return null;
	}
	
	public Part putPart(Part part) {
		for (int m = 0; m < parts.size(); m++) {
			if (parts.get(m).getId() == part.getId()) {
				parts.set(m, part);
			}
		}
		return part;
	}
	
	public void deletePart(Integer id) {
		for (int m = 0; m < parts.size(); m++) {
			if (parts.get(m).getId() == id) {
				parts.remove(m);
				return;
			}
		}
	}
}

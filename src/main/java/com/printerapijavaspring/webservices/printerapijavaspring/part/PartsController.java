package com.printerapijavaspring.webservices.printerapijavaspring.part;

import org.springframework.web.bind.annotation.*;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;;

@RestController
public class PartsController {

	// PartDALService is dependency injected into this member with @Autowired
	@Autowired
	private PartDALService partDALService;
	
	@RequestMapping(value = "/part", method = RequestMethod.GET)
	public List<Part> listParts() {
		return partDALService.listParts();
	}
	
	@RequestMapping(value = "/part/{id}", method = RequestMethod.GET)
	public Part getPart(@PathVariable(value = "id") Integer id) {
		return partDALService.getPart(id);
	}
	
	@RequestMapping(value = "/part", method = RequestMethod.POST)
	public Part postPart(@RequestBody Part part) {
		return partDALService.postPart(part);
	}
	
	@RequestMapping(value = "/part", method = RequestMethod.PUT)
	public Part putPart(@RequestBody Part part) {
		return partDALService.putPart(part);
	}
	
	@RequestMapping(value = "/part/{id}", method = RequestMethod.DELETE)
	public void deletePart(@PathVariable(value = "id") Integer id) {
		partDALService.deletePart(id);
	}
}

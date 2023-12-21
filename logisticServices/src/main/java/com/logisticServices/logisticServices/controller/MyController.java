package com.logisticServices.logisticServices.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.logisticServices.logisticServices.entities.Logistic;
import com.logisticServices.logisticServices.services.LogisticService;

@RestController
public class MyController {
	
	@Autowired
	private LogisticService logisticService;
	
	// Get all the Logistic Loads
	@GetMapping("/load")
	public List<Logistic> getLogisticLoads() {
		return this.logisticService.getLogisticLoads();
	}
	
	// Get the Logistic load with 'loadId'
	@GetMapping("/load/{loadId}")
	public Logistic getLogisticLoadByLoadId(@PathVariable("loadId") String loadId) {
		System.out.println(Long.parseLong(loadId));
		return this.logisticService.getLogisticLoadByLoadId(Long.parseLong(loadId));
	}
	
	// Get the Logistic load with 'shipperId'
	@GetMapping("/load/shipperId/{shipperId}")
	public List<Logistic> getLogisticLoadByShipperId(@PathVariable("shipperId") String shipperId) {
		return this.logisticService.getLogisticLoadByShipperId(shipperId);
	}
	
	// add the Logistic Load
	@PostMapping("/load")
	public Logistic addLogisticLoad(@RequestBody Logistic logistic) {
		return this.logisticService.addLogisticLoad(logistic);
	}
	
	// update the Logistic Load with 'loadId'
	@PutMapping("/load/{loadId}")
	public Logistic updateLogisticLoad(@PathVariable("loadId") String loadId, @RequestBody Logistic logistic) {
		return this.logisticService.updateLogisticLoad(Long.parseLong(loadId),logistic);
	}
	
	// delete the Logistic Load with 'loadId'
	@DeleteMapping("/load/{loadId}")
	public void deleteLogisticLoad(@PathVariable String loadId) {
		this.logisticService.deleteLogisticLoad(Long.parseLong(loadId));
	}
	
}

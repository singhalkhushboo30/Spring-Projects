package com.restapi.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.restapi.model.CloudVendor;
import com.restapi.response.ResponseHandler;
import com.restapi.service.CloudVendorService;

@RestController
public class CloudVendorController {

	private CloudVendorService cloudVendorService;
	
	public CloudVendorController(CloudVendorService cloudVendorService) {
		this.cloudVendorService = cloudVendorService;
	}

	@GetMapping("/vendor/{vendorId}")
	public ResponseEntity<Object> getCloudVendorDetails(@PathVariable String vendorId) {
		return ResponseHandler.responseBuilder("Requested Vendor Details are given here.", HttpStatus.OK,cloudVendorService.getCloudVendor(vendorId));
	
	}
	
	@GetMapping("/vendor")
	public List<CloudVendor> getAllCloudVendorDetails(){
		return cloudVendorService.getAllCloudVendors();
		
	}
	
	@PostMapping("/vendor")
	public CloudVendor createCloudVendorDetails(@RequestBody CloudVendor cloudVendor) {
		return cloudVendorService.createCloudVendor(cloudVendor);
		
	}
	
	@PutMapping("/vendor")
	public CloudVendor updateCloudVendorDetails(@RequestBody CloudVendor cloudVendor) {
	     return cloudVendorService.updateCloudVendor(cloudVendor);
	     
	}
	
	@DeleteMapping("/vendor/{vendorId}")
	public String deleteCloudVendorDetails(@PathVariable String vendorId) {
		cloudVendorService.deleteCloudVendor(vendorId);
		return "Cloud Vendor deleted successfully.";
	}
}

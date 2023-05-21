package com.restapi.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.restapi.model.CloudVendor;
import com.restapi.repository.CloudVendorRepository;

@Service
public class CloudVendorServiceImpl implements CloudVendorService {
	
	CloudVendorRepository cloudVendorRepository;

	public CloudVendorServiceImpl(CloudVendorRepository cloudVendorRepository) {
		this.cloudVendorRepository = cloudVendorRepository;
	}

	@Override
	public CloudVendor createCloudVendor(CloudVendor cloudVendor) {
		return this.cloudVendorRepository.save(cloudVendor);
		
	}

	@Override
	public CloudVendor updateCloudVendor(CloudVendor cloudVendor) {
		return this.cloudVendorRepository.save(cloudVendor);
		
	}

	@Override
	public String deleteCloudVendor(String cloudVendorId) {
		cloudVendorRepository.deleteById(cloudVendorId);
		return "Success";
	}

	@Override
	public CloudVendor getCloudVendor(String cloudVendorId) {
		return cloudVendorRepository.findById(cloudVendorId).get();
		
	}

	@Override
	public List<CloudVendor> getAllCloudVendors() {
		return cloudVendorRepository.findAll();
	}
	
	

}

package com.restapi.service;

import java.util.List;

import com.restapi.model.CloudVendor;

public interface CloudVendorService {
      
	public CloudVendor createCloudVendor(CloudVendor cloudVendor);
	public CloudVendor updateCloudVendor(CloudVendor cloudVendor);
	public String deleteCloudVendor(String cloudVendorId);
	public CloudVendor getCloudVendor(String cloudVendorId);
	public List<CloudVendor> getAllCloudVendors();
}

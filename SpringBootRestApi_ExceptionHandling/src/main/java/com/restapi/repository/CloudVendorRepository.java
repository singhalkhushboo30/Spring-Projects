package com.restapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.restapi.model.CloudVendor;

@Repository
public interface CloudVendorRepository extends JpaRepository<CloudVendor,String>{

}

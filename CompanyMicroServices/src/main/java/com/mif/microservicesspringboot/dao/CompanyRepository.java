package com.mif.microservicesspringboot.dao;

import com.mif.microservicesspringboot.entities.Company;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface CompanyRepository extends JpaRepository<Company,Long> {
}

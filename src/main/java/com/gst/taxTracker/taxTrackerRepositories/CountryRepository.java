package com.gst.taxTracker.taxTrackerRepositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gst.taxTracker.taxTrackerDomain.Country;

public interface CountryRepository extends JpaRepository<Country, Long>{
	Optional<Country> findByCode(String code);

}

package com.gst.taxTracker.taxTrackerRepositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gst.taxTracker.taxTrackerDomain.Gst;

public interface GstRepository extends JpaRepository<Gst, Long>{
	Gst findTopByOrderByEffectiveFromDesc();
}

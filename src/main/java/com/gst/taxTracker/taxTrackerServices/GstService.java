package com.gst.taxTracker.taxTrackerServices;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gst.taxTracker.taxTrackerDomain.Gst;
import com.gst.taxTracker.taxTrackerRepositories.GstRepository;

@Service
public class GstService {
	
	protected final Logger logger = LoggerFactory.getLogger(getClass());

    @Autowired
    private GstRepository gstRepository;
    
    public double getLatestGst() {
        Gst gst = gstRepository.findTopByOrderByEffectiveFromDesc();
        return gst != null ? gst.getGst() : 0.0;
    }
/*
    public double getCurrentGst() {
        LocalDateTime now = LocalDateTime.now();
        logger.info("Fetching GST rate for current date: {}", now);
        Gst gst = gstRepository.findAll().stream()
                .filter(g -> g.getEffectiveFrom().isBefore(now) && (g.getEffectiveTill() == null || g.getEffectiveTill().isAfter(now)))
                .findFirst()
                .orElseThrow(() -> new RuntimeException("No GST rate found for current date"));
        logger.info("Current GST rate: {}", gst.getGst());
        return gst.getGst();
    }

    public double calculateGst(double amount) {
    	logger.info("Calculating GST for amount: {}", amount);
        double gstRate = getCurrentGst();
        double gstAmount = amount * gstRate / 100;
        logger.info("GST amount calculated: {}", gstAmount);
        return gstAmount;
    }
    */
}

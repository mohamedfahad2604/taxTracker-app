package com.gst.taxTracker.taxTrackerWebControllers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.gst.taxTracker.taxTrackerServices.GstService;

@Controller
public class GstController {
	
	protected final Logger logger = LoggerFactory.getLogger(getClass());

    @Autowired
    private GstService gstService;
    
    @GetMapping("/")
    public String home() {
        return "home";
    }

    @GetMapping("/gst")
    public String getGst(Model model) {
    	logger.info("GST1:" + gstService.getLatestGst());
        double gst = gstService.getLatestGst();
        logger.info("GST:" + gst);
        model.addAttribute("gst", gst);
        
        return "gst";
    }
    

    @GetMapping("/exchange-rate")
    public ResponseEntity<Double> getExchangeRate(@RequestParam String code) {
        Double exchangeRate = gstService.getExchangeRate(code);
        return ResponseEntity.ok(exchangeRate);
    }

    @GetMapping("/calculate")
    public String calculatePage() {
        return "calculate";
    }
    
    @PostMapping("/calculate")
    public ResponseEntity<Double> calculateTotal(@RequestParam Double amount, @RequestParam String code) {
        Double exchangeRate = gstService.getExchangeRate(code);
        Double gstRate = gstService.getGstRate();
        Double totalAmount = gstService.calculateTotalAmount(amount, exchangeRate, gstRate);
        return ResponseEntity.ok(totalAmount);
    }
    
}

/*
package com.gst.taxTrackerServices;


import org.springframework.stereotype.Service;

@Service
	public class GSTCalculationService {
		
	 private static final double GST_RATE = 0.09; // GST rate of 9%

	    public double calculateGST(double amount) {
	        return amount * GST_RATE;
	    }

	    public double calculateTotalAmount(double amount) {
	        return amount + calculateGST(amount);
	    }
		
	}
*/



/*
//Traditional Way
@Service
public class GstService {

    @Autowired
    private GstRepository gstRepository;

    public double getCurrentGst() {
        LocalDateTime now = LocalDateTime.now();
        List<Gst> gstList = gstRepository.findAll();
        
        for (Gst gst : gstList) {
            if (gst.getEffectiveFrom().isBefore(now) && (gst.getEffectiveTill() == null || gst.getEffectiveTill().isAfter(now))) {
                return gst.getGst();
            }
        }

        throw new RuntimeException("No GST rate found for current date");
    }

    public double calculateGst(double amount) {
        double gstRate = getCurrentGst();
        return amount * gstRate / 100;
    }
}

*/



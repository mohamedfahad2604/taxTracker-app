package com.gst.taxTracker.taxTrackerWebControllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.gst.taxTracker.taxTrackerServices.GstService;

@Controller
public class GstController {

    @Autowired
    private GstService gstService;

    @GetMapping("/gst")
    public String getGst(Model model) {
        double gst = gstService.getLatestGst();
        model.addAttribute("gst", gst);
        return "gst";
    }
}

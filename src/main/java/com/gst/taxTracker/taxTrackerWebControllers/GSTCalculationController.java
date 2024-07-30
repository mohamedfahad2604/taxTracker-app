/*
package com.gst.taxTrackerWebControllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class GSTCalculationController {

    @GetMapping("/")
    public String gstCalculatorForm() {
        return "gst_calculator";
    }

    @PostMapping("/calculateGST")
    public String calculateGST(@RequestParam("amount") double amount, Model model) {
        double gstRate = 0.09;
        double gstAmount = amount * gstRate;
        double totalAmount = amount + gstAmount;

        model.addAttribute("amount", amount);
        model.addAttribute("gstAmount", gstAmount);
        model.addAttribute("totalAmount", totalAmount);

        return "gst_result";
    }
}

*/




package com.nik.validations.controllers;

import com.nik.validations.model.Customer;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/customer")
public class CustomerController {

    @GetMapping("/form")
    public String getCustomerForm(@ModelAttribute("theCustomer")Customer customer){
        return "customer-form";
    }
}

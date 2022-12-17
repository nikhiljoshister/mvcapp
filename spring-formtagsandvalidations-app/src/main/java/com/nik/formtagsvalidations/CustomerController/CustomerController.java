package com.nik.formtagsvalidations.CustomerController;

import com.nik.formtagsvalidations.model.Customer;
import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;

@Controller
@RequestMapping("/customer")
public class CustomerController {

    @InitBinder
    private void myInit(WebDataBinder dataBinder){
        StringTrimmerEditor stringTrimmerEditor = new StringTrimmerEditor(true);
        dataBinder.registerCustomEditor(String.class,stringTrimmerEditor);
    }

    @GetMapping("/form")
    public String getCustomerForm(@ModelAttribute("theCustomer")Customer customer){
        return "customer-form";
    }

    @GetMapping("/processform")
    public String getLandingPage(@Valid @ModelAttribute("theCustomer")Customer customer, BindingResult bindingResult){
        if(bindingResult.hasErrors()) {
            System.out.println("Errors: " + bindingResult.getAllErrors());
            return "customer-form";
        }
        else
            return "landing-page";
    }
}

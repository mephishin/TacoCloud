package com.example.tacocloud.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.bind.support.SessionStatus;
import lombok.extern.slf4j.Slf4j;
import com.example.tacocloud.classes.TacoOrder;

@Slf4j
@Controller
@RequestMapping("/orders")
@SessionAttributes({"tacoOrder"})
public class OrderController {

    @GetMapping("/current")
    public String orderForm() {
        return "OrderForm";
    }

    @PostMapping
    public String processOrder(TacoOrder order,
                               SessionStatus sessionStatus) {
        log.info("Order submitted: {}", order);
        sessionStatus.setComplete();
        return "redirect:/";
    }
}


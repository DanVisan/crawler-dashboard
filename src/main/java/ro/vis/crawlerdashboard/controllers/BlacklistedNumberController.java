package ro.vis.crawlerdashboard.controllers;

import org.springframework.stereotype.Controller;
import ro.vis.crawlerdashboard.services.BlacklistedNumberService;

@Controller
public class BlacklistedNumberController {

    BlacklistedNumberService service;

    public BlacklistedNumberController(BlacklistedNumberService service) {
        this.service = service;
    }


    public void findAll() {
        var all = service.findAll();
        System.out.println(all);
    }
}

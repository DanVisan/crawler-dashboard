package ro.vis.crawlerdashboard.controllers;

import org.springframework.stereotype.Controller;
import ro.vis.crawlerdashboard.services.BlacklistedKeywordService;

@Controller
public class BlacklistedKeywordsController {
    private final BlacklistedKeywordService service;

    public BlacklistedKeywordsController(BlacklistedKeywordService service) {
        this.service = service;
    }

    public void findAll() {
        var all = service.findAll();
        System.out.println(all);
    }
}

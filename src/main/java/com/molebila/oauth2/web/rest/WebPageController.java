package com.molebila.oauth2.web.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Nurvadli
 * @created 09/05/2020 - 9꞉33 PM
 */
@RestController
@RequestMapping(path = "/api/v1/test_pages")
public class WebPageController {

    @GetMapping({"/","index"})
    public String displayInitialize() {
        return "index";
    }

    @GetMapping("/web_private")
    public String displayPrivatePage() {
        return "private";
    }

    @GetMapping("/web_public")
    public String displayPublicLogin() {
        return "publico";
    }

    @GetMapping("/web_admin")
    public String displayAdmin() {
        return "admin";
    }

    @GetMapping("/login")
    public String login() {
        return "login";
    }
}

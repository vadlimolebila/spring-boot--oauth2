package com.molebila.oauth2.web.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Nurvadli
 * @created 09/05/2020 - 9꞉38 PM
 */
@RestController
@RequestMapping(path = "/api/v1/side")
public class SideController {

    @GetMapping("/public")
    public String sidePublic() {
        return "You are on public side";
    }

    @GetMapping("/private")
    public String sidePrivate() {
        return "You have been accessed private side";
    }

    @GetMapping("/admin")
    public String sideAdmin() {
        return "You have been accessed administrator side";
    }
}

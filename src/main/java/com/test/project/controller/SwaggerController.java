package com.test.project.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * The type Swagger controller.
 */
@Controller
public class SwaggerController {

    /**
     * Redirect swagger.
     *
     * @return the swagger page.
     */
    @GetMapping("/")
    public String index() {
        return "redirect:swagger-ui/";
    }

}

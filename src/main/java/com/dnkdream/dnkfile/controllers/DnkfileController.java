package com.dnkdream.dnkfile.controllers;

import com.dnkdream.dnkfile.dtoes.DnkFIleDto;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/")
public class DnkfileController {
    @RequestMapping(value="/", method= RequestMethod.GET)
    public DnkFIleDto getFile() {
        return new DnkFIleDto();
    }
}

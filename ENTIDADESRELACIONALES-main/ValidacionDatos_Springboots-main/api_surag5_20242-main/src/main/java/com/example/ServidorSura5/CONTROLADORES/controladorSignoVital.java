package com.example.ServidorSura5.CONTROLADORES;

import com.example.ServidorSura5.MODELOS.SignoVital;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/SignoVital")
public class controladorSignoVital
{
    @GetMapping
    public list<SignoVital> getAllSignoVital{}
    
}

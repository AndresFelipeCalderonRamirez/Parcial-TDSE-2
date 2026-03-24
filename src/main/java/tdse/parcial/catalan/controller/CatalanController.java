package tdse.parcial.catalan.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import tdse.parcial.catalan.service.Catalan;

import java.util.LinkedList;

@RestController
public class CatalanController {

    @GetMapping("/value")
    public LinkedList<Long> catalan(@RequestParam int n) {
        return Catalan.catalan(n);
    }
}
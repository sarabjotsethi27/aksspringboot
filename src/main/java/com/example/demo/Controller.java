package com.example.demo;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class Controller {


    @GetMapping("/teams")
    public List<IPL> getTeams(){
        List<IPL> l = new ArrayList<>();

        IPL l1 = new IPL();
        IPL l2 = new IPL();

        l1.setId(101);
        l1.setName("CSK");
        l1.setWin(4);

        l2.setId(102);
        l2.setName("RR");
        l2.setWin(1);

        l.add(l1);
        l.add(l2);

        return l;
    }
}

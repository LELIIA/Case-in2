package com.example.casein.controller;

import com.example.casein.domain.Machine;
import com.example.casein.domain.Repair;
import com.example.casein.domain.User;
import com.example.casein.repos.RepairRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Map;
@Controller
public class RepairController {

    @Autowired
    private RepairRepo repairRepo;


    @GetMapping("/repair")
public String main(Map<String, Object> model) {
    Iterable<Repair> repairs = repairRepo.findAll();
    model.put("repairs", repairs);
    return "repair";
}
//добавление новой заявки (проблема с полями связанных таблиц)
    @PostMapping("/repair")
    public String addRepair(@RequestParam Integer priority , @RequestParam String status, @RequestParam String description,
                            @RequestParam Machine id, @RequestParam User username, Map<String, Object> model) {
        Repair repair = new Repair(priority, status, description, id, username);

        repairRepo.save(repair);

        Iterable<Repair> repairs = repairRepo.findAll();

        model.put("repairs", repairs);

        return "repair";
    }

    /*@PostMapping("fio")
    public String filter(@RequestParam User fio, Map<String, Object> model) {
        Iterable<Repair> repairs;

        if (fio != null ) {
            repairs = repairRepo.findByUsername(fio);
        } else {
            repairs = repairRepo.findAll();
        }

        model.put("repairs", repairs);

        return "repair";
    }*/
}

package com.example.casein.controller;

import com.example.casein.domain.Machine;
import com.example.casein.repos.MachineRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Map;

@Controller
public class MachineController {
    @Autowired
    private MachineRepo machineRepo;
    @GetMapping("/Site_Manager")
    public String machine(Map<String, Object> model) {
        Iterable<Machine> machines = machineRepo.findAll();
        model.put("machines", machines);
        return "Site_Manager";
    }
//Тест форм, добавляет новый станок по заявке на ремонт)))
    @PostMapping("/Site_Manager")
    public String addMachine(@RequestParam Integer id , @RequestParam String status,
                             @RequestParam Boolean on_off, Map<String, Object> model) {
        Machine machine = new Machine(id,  status,  on_off);

        machineRepo.save(machine);

        Iterable<Machine> machines = machineRepo.findAll();

        model.put("machines", machines);

        return "Site_Manager";
    }
}

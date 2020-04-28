package com.example.casein.controller;

import com.example.casein.domain.Condition;
import com.example.casein.domain.Machine;
import com.example.casein.repos.ConditionRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Map;

@Controller
public class ConditionController {
    @Autowired
    private ConditionRepo conditionRepo;
    //просмотр всех состаяний всех станков
    @GetMapping("/condition")
    public String machine(Map<String, Object> model) {
        Iterable<Condition> conditions = conditionRepo.findAll();
        model.put("conditions", conditions);
        return "condition";
    }
    //добавление нового состояния станка (проблема с полем id станка)
    @PostMapping("/condition")
    public String addMachine(@RequestParam Integer P , @RequestParam Integer U,
                             @RequestParam Integer W, @RequestParam Machine id, Map<String, Object> model) {
        Condition condition = new Condition(P, U, W, id);

        conditionRepo.save(condition);

        Iterable<Condition> conditions = conditionRepo.findAll();

        model.put("conditions", conditions);

        return "condition";
    }
}

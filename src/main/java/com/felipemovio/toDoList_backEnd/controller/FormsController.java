package com.felipemovio.toDoList_backEnd.controller;


import com.felipemovio.toDoList_backEnd.service.FormsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/forms")
public class FormsController {

    @Autowired
    private FormsService formsService;

}

package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author git-leon
 * @version 1.0.0
 * @date 8/11/21 10:04 AM
 */
@RestController
@RequestMapping(value = "/webpage")
public class WebPage {
    @Autowired
    private PersonService service;

    @GetMapping(value = "/all-persons")
    public String readAll() {
        StringBuilder sb = new StringBuilder();
        List<Person> personList = service.readAll();
        sb.append("<h1>List of all people</h1>");
        sb.append("<ol>");
        for (Person person : personList) {
            sb
                    .append("<li>")
                    .append("<font color='red'>")
                    .append("FirstName: ")
                    .append(person.getFirstName())
                    .append("</font>")
                    .append("<font color='blue'>")
                    .append(" LastName: ")
                    .append(person.getLastName())
                    .append("</font>")
                    .append("</li>");
        }
        sb.append("</ol>");
        return sb.toString();
    }
}

package com.example.manytoone.resource;


import com.example.manytoone.model.Users;
import com.example.manytoone.model.UsersLog;
import com.example.manytoone.repository.UsersLogRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/rest/users/log")
public class UsersLogResource {

    private UsersLogRepository usersLogRepository;

    public UsersLogResource(UsersLogRepository usersLogRepository) {
        this.usersLogRepository = usersLogRepository;
    }


    @GetMapping(value ="/all")
    public List<UsersLog> getAll() {
        return usersLogRepository.findAll();

    }

    @GetMapping(value = "/update/{name}")
    List<UsersLog> update(@PathVariable final String name) {
        Users users = new Users();
        users.setName(name).setSalary(123333).setTeamName("ajajajajajja");

        UsersLog usersLog1 = new UsersLog();
        usersLog1.setUsers(users);
        usersLog1.setLog("Hi Shubham");
        usersLogRepository.save(usersLog1);

        UsersLog usersLog2 = new UsersLog();
        usersLog2.setUsers(users);
        usersLog2.setLog("Hi Raj");
        usersLogRepository.save(usersLog2);

        return usersLogRepository.findAll();


    }


}

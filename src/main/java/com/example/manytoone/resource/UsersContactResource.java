package com.example.manytoone.resource;

import com.example.manytoone.model.Users;
import com.example.manytoone.model.UsersContact;
import com.example.manytoone.model.UsersLog;
import com.example.manytoone.repository.UsersContactRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RequestMapping("/rest/userscontact")
@RestController
public class UsersContactResource {

    private UsersContactRepository usersContactRepository;

    public UsersContactResource(UsersContactRepository usersContactRepository) {
        this.usersContactRepository = usersContactRepository;
    }

    @GetMapping(value = "/all")
    public List<UsersContact> getUsersContact() {
        return usersContactRepository.findAll();
    }

    @GetMapping(value = "/update/{name}")
    public List<UsersContact> update(@PathVariable final String name) {

        UsersContact usersContact = new UsersContact();
        Users users = new Users();
        UsersLog usersLog = new UsersLog();
        usersLog.setLog("HI Youtube");

        UsersLog usersLog2 = new UsersLog();
        usersLog2.setLog("HI Viewers");

        users.setTeamName("Development")
                .setSalary(10000)
                .setName(name);

        usersContact.setPhoneNo(11111)
                .setUsers(users);

        //persist
        usersContactRepository.save(usersContact);

        //getall
        return usersContactRepository.findAll();


    }


}

package com.amit.MicroServicesExample.resources;

import com.amit.MicroServicesExample.model.AccountList;
import com.amit.MicroServicesExample.model.AccountOpen;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@RestController
@RequestMapping("micro")
public class HomeResource {

    @Autowired
    private RestTemplate restTemplate;

    @RequestMapping("/{userId}")
    public void accountOpens(@PathVariable("userId") String userId) throws IllegalAccessException {


        String url = "http://localhost:8080/MicroServices/account";

        AccountList accountOpen = restTemplate.getForObject(url, AccountList.class);
/*
         AccountList accountList = restTemplate.getForObject("http://localhost:8080/accountOpen?fname=amit&lastname=mathur&number=07023422740&address=A-876&city=jaipur&state=Rajasthan&country=India&fathname=Rajkumar+Mathur&mothname=Madhu+Mathur&aadhar=6233622&accountBalance=5000&img=fixeddeposit.jpg"
                , AccountList.class);*/
/*
         accountOpen.getAccountBalance()
                 .filter(p -> accountOpen.getAccountBalance()>1000)
                .map(accountOpen1 -> accountOpen1.getAccountBalance())
                 .forEach(System.out::println);*/


    }
}

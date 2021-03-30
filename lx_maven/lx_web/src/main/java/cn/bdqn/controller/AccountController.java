package cn.bdqn.controller;

import cn.bdqn.domain.Account;
import cn.bdqn.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/account")
public class AccountController {

    @Autowired
    private AccountService accountService;

    @RequestMapping("/queryAll")
    public String queryAll(){

        List<Account> accounts = accountService.queryAll();

        System.out.println(accounts);

        return "查询成功";
    }

    @RequestMapping(value = "/register")
    public String register(Account account){
        accountService.save(account);

        return "插入成功";
    }

}

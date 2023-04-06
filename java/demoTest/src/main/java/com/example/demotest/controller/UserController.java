package com.example.demotest.controller;

import com.example.demotest.model.User;
import com.example.demotest.model.Wallet;
import com.example.demotest.model.dto.UserDTO;
import com.example.demotest.reponsitory.UserReponsitory;
import com.example.demotest.reponsitory.WalletReponsitory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/user")
public class UserController {
        @Autowired
        private UserReponsitory userReponsitory;
        @Autowired
        private WalletReponsitory walletReponsitiry;

        @RequestMapping(value = "/all", method = RequestMethod.GET)
        public ResponseEntity<List<User>> getAllUser() {
                return ResponseEntity.ok(userReponsitory.findAll());
        }



        @PostMapping(value = "/insert/userWallet")
        public ResponseEntity<User> insertUser2(@RequestBody UserDTO userDTO) {
                User user = new User();
                user.setName(userDTO.getName());
                user.setGender(userDTO.isGender());
                Wallet wallet = new Wallet();
                wallet.setAccountNumber(userDTO.getWallet().getAccountNumber());
                wallet.setBalance(userDTO.getWallet().getBalance());
                walletReponsitiry.save(wallet);
                user.setWallet(wallet);
                userReponsitory.save(user);
                return ResponseEntity.ok(user);
        }


        public ResponseEntity<?> updateUser(@PathVariable int id) {
                User user = userReponsitory.findById(id).orElse(null);
                if(user!= null) {
                        Wallet wallet = new Wallet();
                        wallet.setAccountNumber("123123123");
                        wallet.setBalance(200);
                        walletReponsitiry.save(wallet);

                        user.setWallet(wallet);
                        userReponsitory.save(user);
                        return ResponseEntity.ok(user);
                }
                return ResponseEntity.status(HttpStatus.NOT_FOUND).body("null");
        }

}

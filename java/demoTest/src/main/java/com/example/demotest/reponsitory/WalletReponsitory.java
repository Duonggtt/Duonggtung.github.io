package com.example.demotest.reponsitory;

import com.example.demotest.model.Wallet;
import org.springframework.data.jpa.repository.JpaRepository;


public interface WalletReponsitory extends JpaRepository<Wallet, Integer> {

}

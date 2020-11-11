package com.naya.game_of_thrones;

import com.naya.mainannotationstarter.Main;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Service;

@Service
public class MoneyGenerator {
    @Autowired
    private MoneyRepo moneyRepo;

//    @EventListener(ContextRefreshedEvent.class)
    @Main
    public void fillBank(){
        Bank bank = Bank.builder().filialName("dorn").amount(100).build();
        moneyRepo.save(bank);
    }
}

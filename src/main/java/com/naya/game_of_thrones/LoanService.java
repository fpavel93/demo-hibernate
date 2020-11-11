package com.naya.game_of_thrones;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class LoanService {

    @Autowired
    private IronBankService ironBankService;
    @Autowired
    private PredictionService predictionService;

    public String loan(String name, int amount){
        if(ironBankService.getMoney()>amount && predictionService.willSurviveUpcomingWinter(name)){
            log.info(amount+" was transfered");
            ironBankService.decreaseMoney(amount);
            return "loan accepted";
        } else {
            return "loan rejected, ты сдохнешь";
        }
    }
}

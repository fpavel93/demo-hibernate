package com.naya.game_of_thrones;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import static com.gameofthrones.ironbankstarter.ProfilesConst.ЗИМА_ТУТА;

@Service
@Profile(ЗИМА_ТУТА)
public class СуровыйPredictionService implements PredictionService {
    @Override
    public boolean willSurviveUpcomingWinter(String name) {
        return name.toLowerCase().contains("lanister");
    }
}

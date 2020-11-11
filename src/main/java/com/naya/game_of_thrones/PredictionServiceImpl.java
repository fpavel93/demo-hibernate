package com.naya.game_of_thrones;

import com.gameofthrones.ironbankstarter.ConditionalOnProduction;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import static com.gameofthrones.ironbankstarter.ProfilesConst.ЗИМА_БЛИЗКО;

@Service
@Profile(ЗИМА_БЛИЗКО)
public class PredictionServiceImpl implements PredictionService {
    @Override
    public boolean willSurviveUpcomingWinter(String name) {
        return !name.toLowerCase().contains("stark");
    }
}

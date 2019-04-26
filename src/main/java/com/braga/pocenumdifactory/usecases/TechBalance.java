package com.braga.pocenumdifactory.usecases;

import com.braga.pocenumdifactory.domain.Balance;
import com.braga.pocenumdifactory.domain.ProcessType;
import org.springframework.stereotype.Component;

@Component
@ProcessType
public class TechBalance implements Balance {

    @Override
    public void calculate() {
        //
    }
}

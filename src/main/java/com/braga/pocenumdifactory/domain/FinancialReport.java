package com.braga.pocenumdifactory.domain;

import lombok.Builder;
import lombok.Data;

@Data
public class FinancialReport extends ReportDefault {

    private String customer;

    @Builder
    public FinancialReport(final String name, final String customer){
        super(name);
        this.customer = customer;
    }


}

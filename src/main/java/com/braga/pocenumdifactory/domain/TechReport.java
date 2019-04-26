package com.braga.pocenumdifactory.domain;

import lombok.Builder;
import lombok.Data;

@Data
public class TechReport extends ReportDefault {

    private String cloudAgent;

    @Builder
    public TechReport(final String name, final String cloudAgent){
        super(name);
        this.cloudAgent = cloudAgent;
    }

}

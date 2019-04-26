package com.braga.pocenumdifactory.usecases;

import com.braga.pocenumdifactory.domain.*;
import org.springframework.stereotype.Component;

@Component
@ProcessType(ReportType.PARTIAL)
public class TechReportService implements Platform {

    @Override
    public ReportDefault createReport() {
        return TechReport.builder().name("tech").cloudAgent("azure").build();
    }
}

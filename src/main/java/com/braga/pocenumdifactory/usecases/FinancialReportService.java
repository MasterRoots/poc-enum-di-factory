package com.braga.pocenumdifactory.usecases;

import com.braga.pocenumdifactory.domain.FinancialReport;
import com.braga.pocenumdifactory.domain.Platform;
import com.braga.pocenumdifactory.domain.ProcessType;
import com.braga.pocenumdifactory.domain.ReportDefault;
import org.springframework.stereotype.Component;

@Component
@ProcessType
public class FinancialReportService implements Platform {

    @Override
    public ReportDefault createReport() {
        return FinancialReport.builder().name("financial").customer("bb").build();
    }
}

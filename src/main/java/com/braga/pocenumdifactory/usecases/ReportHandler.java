package com.braga.pocenumdifactory.usecases;

import com.braga.pocenumdifactory.domain.ReportRequest;
import com.braga.pocenumdifactory.domain.ReportType;
import com.braga.pocenumdifactory.factory.ReportProcessFactory;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor
public class ReportHandler {

    private ReportProcessFactory factory;

    public String execute(final String reportType){

        final ReportRequest request = ReportRequest.builder()
                .reportType(ReportType.valueOf(reportType.toUpperCase()))
                .build();

        return factory.getPlatform(request.getReportType()).createReport().getName();
    }
}

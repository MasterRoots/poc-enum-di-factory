package com.braga.pocenumdifactory.gateways;

import com.braga.pocenumdifactory.usecases.ReportHandler;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
public class ReportController {

    private ReportHandler handler;

    @RequestMapping("/{reportType}")
    public String index(@PathVariable final String reportType) {

        return handler.execute(reportType);

    }

}

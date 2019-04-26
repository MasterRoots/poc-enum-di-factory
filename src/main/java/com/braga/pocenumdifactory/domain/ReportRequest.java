package com.braga.pocenumdifactory.domain;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class ReportRequest {

    private ReportType reportType;

}

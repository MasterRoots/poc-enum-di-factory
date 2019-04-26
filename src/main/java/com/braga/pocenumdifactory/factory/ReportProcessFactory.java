package com.braga.pocenumdifactory.factory;

import com.braga.pocenumdifactory.domain.Platform;
import com.braga.pocenumdifactory.domain.ProcessType;
import com.braga.pocenumdifactory.domain.ReportType;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Component
@RequiredArgsConstructor
public class ReportProcessFactory {

    private List<Platform> platforms;

    private Map<ReportType, Platform> factoryMap = new HashMap<>();

    @Autowired
    public  ReportProcessFactory(final List<Platform> platforms){
        this.platforms = platforms;
    }

    @PostConstruct
    public void init(){

        platforms.forEach(platform ->
                 factoryMap.put(platform.getClass().getAnnotation(ProcessType.class).value(),platform)
                );

    }

    public Platform getPlatform(final ReportType reportType){
        return  factoryMap.get(reportType);
    }
}

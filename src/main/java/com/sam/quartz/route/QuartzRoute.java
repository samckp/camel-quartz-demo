package com.sam.quartz.route;

import org.apache.camel.LoggingLevel;
import org.apache.camel.builder.RouteBuilder;
import org.springframework.stereotype.Component;

@Component
public class QuartzRoute extends RouteBuilder {

    @Override
    public void configure() throws Exception {

        //execute this route in every 1 second and Repeat 10 times
        from("quartz2://myGroup/myTimerName?trigger.repeatInterval={{repeatInterval}}&trigger.repeatCount={{repeatCount}}")
                .routeId("myRoute")
                .log(LoggingLevel.INFO, "Execution time ::--${headers.fireTime}")
                .to("mock:result");

        //every 1 Minute, between 12-23PM, MON-FRI
        from("quartz2://groupName/timerName?{{scheduleTime}}")
                .routeId("quartzScheduler")
                .log(LoggingLevel.INFO,"${headers.jobDetail}")
                .to("mock:result");
    }
}

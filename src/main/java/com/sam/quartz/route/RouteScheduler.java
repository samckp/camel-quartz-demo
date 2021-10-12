package com.sam.quartz.route;

import org.apache.camel.LoggingLevel;
import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.routepolicy.quartz2.CronScheduledRoutePolicy;
import org.springframework.stereotype.Component;

@Component
public class RouteScheduler extends RouteBuilder {

    @Override
    public void configure() throws Exception {

        CronScheduledRoutePolicy startPolicy = new CronScheduledRoutePolicy();
        startPolicy.setRouteStartTime("0/10 * * * * ?");

        from("direct:start")
                .routeId("schedule-testRoute").routePolicy(startPolicy).noAutoStartup()
                .log(LoggingLevel.INFO, "message from schedule-testRout")
                .to("mock:success");
    }
}

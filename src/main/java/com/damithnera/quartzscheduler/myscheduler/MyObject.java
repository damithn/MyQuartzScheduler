package com.damithnera.quartzscheduler.myscheduler;

import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;

import java.util.Date;

public class MyObject implements Job {

    public void execute(JobExecutionContext jobExecutionContext) throws JobExecutionException {
        System.out.println("My schduler is running !!");
        System.out.println("Time is :" + new Date());
    }
}

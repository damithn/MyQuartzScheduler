import com.damithnera.quartzscheduler.myscheduler.MyObject;
import org.quartz.*;
import org.quartz.impl.StdSchedulerFactory;

public class Main {
    public static void main(String[] args) throws SchedulerException {
        JobDetail jobDetail = JobBuilder.newJob(MyObject.class).build();

        Trigger trigger = TriggerBuilder.newTrigger().withIdentity("MyCronTrigger")
                .withSchedule(SimpleScheduleBuilder.simpleSchedule().withIntervalInSeconds(02).repeatForever()).build();

        Scheduler scheduler = StdSchedulerFactory.getDefaultScheduler();

        scheduler.start();
        scheduler.scheduleJob(jobDetail, trigger);

    }
}

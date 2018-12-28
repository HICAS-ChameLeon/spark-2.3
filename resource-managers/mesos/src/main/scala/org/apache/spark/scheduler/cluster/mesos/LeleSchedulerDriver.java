package org.apache.spark.scheduler.cluster.mesos;

import org.apache.mesos.Protos.*;
import org.apache.mesos.Scheduler;
import org.apache.mesos.SchedulerDriver;
//import org.apache.mesos.SchedulerDriver;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Map;

public class LeleSchedulerDriver  implements SchedulerDriver {

    public LeleSchedulerDriver(Scheduler scheduler, FrameworkInfo framework, String master){
        if (scheduler == null) {
            throw new NullPointerException("Not expecting a null Scheduler");
        }

        if (framework == null) {
            throw new NullPointerException("Not expecting a null FrameworkInfo");
        }

        if (master == null) {
            throw new NullPointerException("Not expecting a null master");
        }

        this.scheduler = scheduler;
        this.framework = framework;
        this.master = master;
        this.implicitAcknowledgements = true;
        this.credential = null;
        System.out.println("lele scheduler initialization begins");
    }

    @Override
    public Status start() {
        return null;
    }

    @Override
    public Status stop(boolean failover) {
        return null;
    }

    @Override
    public Status stop() {
        return null;
    }

    @Override
    public Status abort() {
        return null;
    }

    @Override
    public Status join() {
        return null;
    }

    @Override
    public Status run() {
        return null;
    }

    @Override
    public Status requestResources(Collection<Request> requests) {
        return null;
    }

    @Override
    public Status launchTasks(Collection<OfferID> offerIds, Collection<TaskInfo> tasks, Filters filters) {
        return null;
    }

    @Override
    public Status launchTasks(Collection<OfferID> offerIds, Collection<TaskInfo> tasks) {
        return null;
    }

    @Override
    public Status launchTasks(OfferID offerId, Collection<TaskInfo> tasks, Filters filters) {
        return null;
    }

    @Override
    public Status launchTasks(OfferID offerId, Collection<TaskInfo> tasks) {
        return null;
    }

    @Override
    public Status killTask(TaskID taskId) {
        return null;
    }

    @Override
    public Status acceptOffers(Collection<OfferID> offerIds, Collection<Offer.Operation> operations, Filters filters) {
        return null;
    }

    @Override
    public Status declineOffer(OfferID offerId, Filters filters) {
        return null;
    }

    @Override
    public Status declineOffer(OfferID offerId) {
        return null;
    }

    @Override
    public Status reviveOffers() {
        return null;
    }

    @Override
    public Status suppressOffers() {
        return null;
    }

    @Override
    public Status acknowledgeStatusUpdate(TaskStatus status) {
        return null;
    }

    @Override
    public Status sendFrameworkMessage(ExecutorID executorId, SlaveID slaveId, byte[] data) {
        return null;
    }

    @Override
    public Status reconcileTasks(Collection<TaskStatus> statuses) {
        return null;
    }

    private final Scheduler scheduler;
    private final FrameworkInfo framework;
    private final String master;
    private final boolean implicitAcknowledgements;
    private final Credential credential;
}

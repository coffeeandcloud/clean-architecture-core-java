package com.sulkyoops.cleanarchitecture.core.usecase;

import io.reactivex.Scheduler;
import io.reactivex.schedulers.Schedulers;

/**
 * Base class for an usecase with an input and an output data type
 *
 * @param <I> Input data type
 * @param <O> Output data type
 */
abstract public class Usecase<I,O> {

    private Scheduler observeOnScheduler;
    private Scheduler subscribeOnScheduler;

    public Usecase() {
        this.observeOnScheduler = Schedulers.io();
        this.subscribeOnScheduler = Schedulers.io();
    }

    public Usecase(Scheduler observeOnScheduler, Scheduler subscribeOnScheduler) {
        this.observeOnScheduler = observeOnScheduler;
        this.subscribeOnScheduler = subscribeOnScheduler;
    }

    protected Scheduler getObserveOnScheduler() {
        return this.observeOnScheduler;
    }

    protected Scheduler getSubscribeOnScheduler() {
        return this.subscribeOnScheduler;
    }

    public void subscribeOn(Scheduler scheduler) {
        this.subscribeOnScheduler = scheduler;
    }

    public void observeOn(Scheduler scheduler) {
        this.observeOnScheduler = scheduler;
    }

    public abstract O run(I param);
    protected abstract O execute(I param);
}

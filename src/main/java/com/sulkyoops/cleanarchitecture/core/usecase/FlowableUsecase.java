package com.sulkyoops.cleanarchitecture.core.usecase;

import io.reactivex.Flowable;
import io.reactivex.Scheduler;

public abstract class FlowableUsecase<I,O> extends Usecase<I, Flowable<O>> {

    public FlowableUsecase() {
        super();
    }

    public FlowableUsecase(Scheduler observeOnScheduler, Scheduler subscribeOnScheduler) {
        super(observeOnScheduler, subscribeOnScheduler);
    }

    @Override
    protected Flowable<O> execute(I param) {
        return execute(param)
                .observeOn(getObserveOnScheduler())
                .subscribeOn(getSubscribeOnScheduler());
    }
}

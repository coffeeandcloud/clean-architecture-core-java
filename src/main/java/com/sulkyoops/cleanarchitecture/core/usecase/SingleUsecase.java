package com.sulkyoops.cleanarchitecture.core.usecase;

import io.reactivex.Scheduler;
import io.reactivex.Single;

abstract public class SingleUsecase<I,O> extends Usecase<I, Single<O>>{

    public SingleUsecase() {
        super();
    }

    public SingleUsecase(Scheduler observeOnScheduler, Scheduler subscribeOnScheduler) {
        super(observeOnScheduler, subscribeOnScheduler);
    }

    @Override
    protected Single<O> execute(I param) {
        return run(param)
                .subscribeOn(getSubscribeOnScheduler())
                .observeOn(getObserveOnScheduler());
    }
}

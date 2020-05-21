package com.sulkyoops.cleanarchitecture.core.usecase;

import io.reactivex.Completable;
import io.reactivex.Scheduler;

public abstract class CompletableUsecase<I> extends Usecase<I, Completable> {

    public CompletableUsecase() {
        super();
    }

    public CompletableUsecase(Scheduler observeOnScheduler, Scheduler subscribeOnScheduler) {
        super(observeOnScheduler, subscribeOnScheduler);
    }

    @Override
    protected Completable execute(I param) {
        return null;
    }
}

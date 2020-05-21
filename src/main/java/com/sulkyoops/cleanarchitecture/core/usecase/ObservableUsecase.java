package com.sulkyoops.cleanarchitecture.core.usecase;


import io.reactivex.Observable;
import io.reactivex.Scheduler;

public abstract class ObservableUsecase<I,O> extends Usecase<I, Observable<O>>{

    public ObservableUsecase() {
        super();
    }

    public ObservableUsecase(Scheduler observeOnScheduler, Scheduler subscribeOnScheduler) {
        super(observeOnScheduler, subscribeOnScheduler);
    }

    @Override
    protected Observable<O> execute(I param) {
        return run(param)
                .subscribeOn(getSubscribeOnScheduler())
                .observeOn(getObserveOnScheduler());
    }
}

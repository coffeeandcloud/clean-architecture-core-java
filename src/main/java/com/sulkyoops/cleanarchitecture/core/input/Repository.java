package com.sulkyoops.cleanarchitecture.core.input;

import io.reactivex.Completable;
import io.reactivex.Single;

import java.util.List;

/**
 * This interface defines the basic functionalities of an repository that an usecase will be able to handle. Repositories
 * are the basic data input source within the core layer of the clean architecture pattern and may need to be extended
 * for special cases. In general, it offers the basic CRUD operations normally done by a repository.
 *
 * @param <T> The type of the object the repository will return
 * @param <ID> The type by which an object can be uniquely identified
 */
public interface Repository<T, ID> {
    public Single<T> createOne(T creation);
    public Single<List<T>> createMany(List<T> creations);
    public Single<T> findOneById(ID id);
    public Single<List<T>> findAll();
    public Single<T> updateById(ID id, T update);
    public Completable deleteOneById(ID id);
    public Completable deleteAll();
    public Completable deleteAllById(List<ID> ids);
}

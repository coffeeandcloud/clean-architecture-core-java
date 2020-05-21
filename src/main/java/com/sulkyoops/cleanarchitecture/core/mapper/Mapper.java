package com.sulkyoops.cleanarchitecture.core.mapper;

/**
 * Mapper allows the transformation of objects between two layers of the architecture. E.g. when reading a data object
 * from the repository, the mapper will transform the object first to the core layer and then into the presentation layer.
 *
 * @param <I> Input object to be mapped from and to
 * @param <O> Output object to be mapped from and to
 */
public interface Mapper<I,O> {
    public O mapFrom(I param);
    public I mapTo(O param);
}

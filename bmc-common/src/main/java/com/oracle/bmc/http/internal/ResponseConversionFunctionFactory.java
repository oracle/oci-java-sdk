/**
 * Copyright (c) 2016 Oracle and/or its affiliates. All rights reserved.
 */
package com.oracle.bmc.http.internal;

import java.util.List;

import javax.ws.rs.core.GenericType;
import javax.ws.rs.core.Response;

import com.google.common.base.Function;

import lombok.RequiredArgsConstructor;

/**
 * Factory class to create the appropriate type of Function to convert a REST
 * Response into its final form.
 */
public class ResponseConversionFunctionFactory {

    /**
     * Creates a Function that will not convert the Response into any given type, just
     * return the headers.
     *
     * @return A new Function.
     */
    public Function<Response, WithHeaders<Void>> create() {
        return new ParseResponseOnlyHeadersFunction();
    }

    /**
     * Creates a Function that will convert the Response into the given object type.
     *
     * @param clazz The type of instance to convert to.
     * @return A new Function.
     */
    public <T> Function<Response, WithHeaders<T>> create(Class<T> clazz) {
        return new ParseResponseWithHeadersFunction<>(clazz);
    }

    /**
     * Creates a Function that will convert the Response into a List of objects.
     *
     * @param type The generic type list to convert to.
     * @return A new Function.
     */
    public <T> Function<Response, WithHeaders<List<T>>> create(GenericType<List<T>> type) {
        return new ParsePagedResponseWithHeadersFunction<>(type);
    }

    @RequiredArgsConstructor
    private static final class ParseResponseWithHeadersFunction<T>
            extends ValidatingParseResponseFunction<WithHeaders<T>> {
        private final Class<T> responseClass;

        @Override
        protected WithHeaders<T> doApply(Response response) {
            T entity = ResponseHelper.readEntity(response, responseClass);
            return new WithHeaders<>(entity, response.getStringHeaders(), response.getStatus());
        }
    }

    @RequiredArgsConstructor
    private static final class ParsePagedResponseWithHeadersFunction<T>
            extends ValidatingParseResponseFunction<WithHeaders<List<T>>> {
        private final GenericType<List<T>> genericType;

        @Override
        protected WithHeaders<List<T>> doApply(Response response) {
            List<T> list = ResponseHelper.readEntity(response, genericType);
            return new WithHeaders<>(list, response.getStringHeaders(), response.getStatus());
        }
    }

    private static final class ParseResponseOnlyHeadersFunction
            extends ValidatingParseResponseFunction<WithHeaders<Void>> {
        @Override
        protected WithHeaders<Void> doApply(Response response) {
            return new WithHeaders<>(null, response.getStringHeaders(), response.getStatus());
        }
    }

    private static abstract class ValidatingParseResponseFunction<T>
            implements Function<Response, T> {
        @Override
        public final T apply(Response response) {
            ResponseHelper.throwIfNotSuccessful(response);
            return doApply(response);
        }

        protected abstract T doApply(Response response);
    }
}

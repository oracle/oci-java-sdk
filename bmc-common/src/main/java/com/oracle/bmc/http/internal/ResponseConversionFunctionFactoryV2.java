/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.http.internal;

import java.util.function.Function;
import javax.ws.rs.core.GenericType;
import javax.ws.rs.core.Response;

import com.oracle.bmc.ServiceDetails;

/**
 * Factory class to create the appropriate type of Function to convert a REST
 * Response into its final form.
 */
public class ResponseConversionFunctionFactoryV2 {

    /**
     * Creates a Function that will not convert the Response into any given type, just
     * return the headers.
     *
     * @return A new Function.
     */
    public Function<Response, WithHeaders<Void>> create() {
        return new ParseResponseOnlyHeadersFunction(ServiceDetails.UNKNOWN_SERVICE_DETAILS);
    }

    /**
     * Creates a Function that will not convert the Response into any given type, just
     * return the headers.
     * @param serviceDetails service details of the Response
     * @return A new Function.
     */
    public Function<Response, WithHeaders<Void>> create(ServiceDetails serviceDetails) {
        return new ParseResponseOnlyHeadersFunction(serviceDetails);
    }

    /**
     * Creates a Function that will convert the Response into the given object type.
     *
     * @param clazz The type of instance to convert to.
     * @return A new Function.
     */
    public <T> Function<Response, WithHeaders<T>> create(Class<T> clazz) {
        return new ParseResponseWithHeadersFunction<>(
                clazz, ServiceDetails.UNKNOWN_SERVICE_DETAILS);
    }

    /**
     * Creates a Function that will convert the Response into the given object type.
     *
     * @param clazz The type of instance to convert to.
     * @param serviceDetails service details of the Response
     * @return A new Function.
     */
    public <T> Function<Response, WithHeaders<T>> create(
            Class<T> clazz, ServiceDetails serviceDetails) {
        return new ParseResponseWithHeadersFunction<>(clazz, serviceDetails);
    }

    /**
     * Creates a Function that will convert the Response into a parameterized collection object,
     * or some other parameterized type.
     *
     * @param type The generic type to convert to.
     * @return A new Function.
     */
    public <T> Function<Response, WithHeaders<T>> create(GenericType<T> type) {
        return new ParseGenericResponseWithHeadersFunction<>(
                type, ServiceDetails.UNKNOWN_SERVICE_DETAILS);
    }

    /**
     * Creates a Function that will convert the Response into a parameterized collection object,
     * or some other parameterized type.
     *
     * @param type The generic type to convert to.
     * @param serviceDetails service details of the Response
     * @return A new Function.
     */
    public <T> Function<Response, WithHeaders<T>> create(
            GenericType<T> type, ServiceDetails serviceDetails) {
        return new ParseGenericResponseWithHeadersFunction<>(type, serviceDetails);
    }

    private static final class ParseResponseWithHeadersFunction<T>
            extends ValidatingParseResponseFunction<WithHeaders<T>> {
        private final Class<T> responseClass;

        @Override
        protected WithHeaders<T> doApply(Response response) {
            T entity = ResponseHelper.readEntity(response, responseClass);
            return new WithHeaders<>(entity, response.getStringHeaders(), response.getStatus());
        }

        @java.beans.ConstructorProperties({"responseClass", "serviceDetails"})
        public ParseResponseWithHeadersFunction(
                final Class<T> responseClass, final ServiceDetails serviceDetails) {
            super(serviceDetails);
            this.responseClass = responseClass;
        }
    }

    private static final class ParseGenericResponseWithHeadersFunction<T>
            extends ValidatingParseResponseFunction<WithHeaders<T>> {
        private final GenericType<T> genericType;

        @Override
        protected WithHeaders<T> doApply(Response response) {
            T entity = ResponseHelper.readEntity(response, genericType);
            return new WithHeaders<>(entity, response.getStringHeaders(), response.getStatus());
        }

        @java.beans.ConstructorProperties({"genericType", "serviceDetails"})
        public ParseGenericResponseWithHeadersFunction(
                final GenericType<T> genericType, final ServiceDetails serviceDetails) {
            super(serviceDetails);
            this.genericType = genericType;
        }
    }

    private static final class ParseResponseOnlyHeadersFunction
            extends ValidatingParseResponseFunction<WithHeaders<Void>> {

        ParseResponseOnlyHeadersFunction(ServiceDetails serviceDetails) {
            super(serviceDetails);
        }

        @Override
        protected WithHeaders<Void> doApply(Response response) {
            ResponseHelper.readWithoutEntity(response);
            return new WithHeaders<>(null, response.getStringHeaders(), response.getStatus());
        }
    }

    private static abstract class ValidatingParseResponseFunction<T>
            implements Function<Response, T> {
        protected ServiceDetails serviceDetails;

        @java.beans.ConstructorProperties({"serviceDetails"})
        ValidatingParseResponseFunction(final ServiceDetails serviceDetails) {
            this.serviceDetails = serviceDetails;
        }

        @Override
        public final T apply(Response response) {
            ResponseHelper.throwIfNotSuccessful(response, serviceDetails);
            return doApply(response);
        }

        protected abstract T doApply(Response response);
    }
}

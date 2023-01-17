/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.http.internal;

import com.google.common /*Guava will be removed soon*/.base.Function;
import javax.ws.rs.core.GenericType;
import javax.ws.rs.core.Response;
import com.oracle.bmc.ServiceDetails;
import com.oracle.bmc.internal.GuavaUtils;

/**
 * Factory class to create the appropriate type of Function to convert a REST
 * Response into its final form.
 *
 * @deprecated all clients of this version or newer use {@link ResponseConversionFunctionFactoryV2} instead
 */
@Deprecated
public class ResponseConversionFunctionFactory {

    private final ResponseConversionFunctionFactoryV2 factoryV2 =
            new ResponseConversionFunctionFactoryV2();

    /**
     * Creates a Function that will not convert the Response into any given type, just
     * return the headers.
     *
     * @return A new Function.
     *
     * @deprecated all clients of this version or newer use {@link ResponseConversionFunctionFactoryV2} instead
     */
    @Deprecated
    public Function<Response, WithHeaders<Void>> create() {
        return GuavaUtils.adaptToGuava(factoryV2.create());
    }

    /**
     * Creates a Function that will not convert the Response into any given type, just
     * return the headers.
     * @param serviceDetails service details of the Response
     * @return A new Function.
     *
     * @deprecated all clients of this version or newer use {@link ResponseConversionFunctionFactoryV2} instead
     */
    @Deprecated
    public Function<Response, WithHeaders<Void>> create(ServiceDetails serviceDetails) {
        return GuavaUtils.adaptToGuava(factoryV2.create(serviceDetails));
    }

    /**
     * Creates a Function that will convert the Response into the given object type.
     *
     * @param clazz The type of instance to convert to.
     * @return A new Function.
     *
     * @deprecated all clients of this version or newer use {@link ResponseConversionFunctionFactoryV2} instead
     */
    @Deprecated
    public <T> Function<Response, WithHeaders<T>> create(Class<T> clazz) {
        return GuavaUtils.adaptToGuava(factoryV2.create(clazz));
    }

    /**
     * Creates a Function that will convert the Response into the given object type.
     *
     * @param clazz The type of instance to convert to.
     * @param serviceDetails service details of the Response
     * @return A new Function.
     *
     * @deprecated all clients of this version or newer use {@link ResponseConversionFunctionFactoryV2} instead
     */
    @Deprecated
    public <T> Function<Response, WithHeaders<T>> create(
            Class<T> clazz, ServiceDetails serviceDetails) {
        return GuavaUtils.adaptToGuava(factoryV2.create(clazz, serviceDetails));
    }

    /**
     * Creates a Function that will convert the Response into a parameterized collection object,
     * or some other parameterized type.
     *
     * @param type The generic type to convert to.
     * @return A new Function.
     *
     * @deprecated all clients of this version or newer use {@link ResponseConversionFunctionFactoryV2} instead
     */
    @Deprecated
    public <T> Function<Response, WithHeaders<T>> create(GenericType<T> type) {
        return GuavaUtils.adaptToGuava(factoryV2.create(type));
    }

    /**
     * Creates a Function that will convert the Response into a parameterized collection object,
     * or some other parameterized type.
     *
     * @param type The generic type to convert to.
     * @param serviceDetails service details of the Response
     * @return A new Function.
     *
     * @deprecated all clients of this version or newer use {@link ResponseConversionFunctionFactoryV2} instead
     */
    @Deprecated
    public <T> Function<Response, WithHeaders<T>> create(
            GenericType<T> type, ServiceDetails serviceDetails) {
        return GuavaUtils.adaptToGuava(factoryV2.create(type, serviceDetails));
    }
}

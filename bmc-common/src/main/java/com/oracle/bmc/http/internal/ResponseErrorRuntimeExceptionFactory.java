/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.http.internal;

import com.oracle.bmc.ServiceDetails;
import com.oracle.bmc.model.SdkRuntimeException;

/**
 * Factory interface that defines the model type of a response error (used for deserializing a
 * response error), as well as how to create a <code>SdkRuntimeException</code> that allows access
 * to that deserialized error.
 *
 * <p>This factory allows client code to inject their own error handling code, complete with their
 * own error model and <code>SdkRuntimeException</code> implementation to pass on that information
 * in the deserialized response.
 *
 * @param <ERRMODEL> The model type that represents the model in the response error.
 * @param <E> A {@link SdkRuntimeException} to be created by the "create exception" methods.
 */
public interface ResponseErrorRuntimeExceptionFactory<ERRMODEL, E extends SdkRuntimeException> {

    /**
     * @return a Class that represents the type of model in the response error, which can be used to
     *     deserialize the response content.
     */
    public Class<ERRMODEL> getResponseErrorModelType();

    public E createRuntimeException(
            int statusCode,
            String opcRequestId,
            ERRMODEL errorResponse,
            ServiceDetails serviceDetails);

    public E createRuntimeException(
            int statusCode,
            String serviceCode,
            String message,
            String opcRequestId,
            ServiceDetails serviceDetails);

    public E createRuntimeException(
            int statusCode,
            String serviceCode,
            String message,
            String opcRequestId,
            Throwable cause,
            ServiceDetails serviceDetails);
}

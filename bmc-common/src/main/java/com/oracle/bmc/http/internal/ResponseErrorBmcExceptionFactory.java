/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.http.internal;

import com.oracle.bmc.ServiceDetails;
import com.oracle.bmc.http.internal.ResponseHelper.ErrorCodeAndMessage;
import com.oracle.bmc.model.BmcException;

/**
 * Default {@link ResponseErrorRuntimeExceptionFactory} implementation that knows how to deserialize
 * error responses using the {@link ResponseHelper.ErrorCodeAndMessage} model. When an error
 * response is received and deserialized, a {@link BmcException} is thrown, allowing access to the
 * error object.
 */
public enum ResponseErrorBmcExceptionFactory
        implements
                ResponseErrorRuntimeExceptionFactory<
                        ResponseHelper.ErrorCodeAndMessage, BmcException> {

    /** The single stateless ResponseErrorBmcExceptionFactory instance. */
    INSTANCE;

    /**
     * @return This implementation returns the {@link ResponseHelper.ErrorCodeAndMessage} class
     *     object.
     */
    @Override
    public Class<ResponseHelper.ErrorCodeAndMessage> getResponseErrorModelType() {
        return ResponseHelper.ErrorCodeAndMessage.class;
    }

    @Override
    public BmcException createRuntimeException(
            int statusCode,
            String opcRequestId,
            ErrorCodeAndMessage errorResponse,
            ServiceDetails serviceDetails) {
        return new BmcException(
                statusCode,
                errorResponse.getCode(),
                errorResponse.getMessage(),
                opcRequestId,
                serviceDetails,
                errorResponse.getOriginalMessage(),
                errorResponse.getOriginalMessageTemplate(),
                errorResponse.getMessageArguments(),
                errorResponse.getAdditionalProperties());
    }

    @Override
    public BmcException createRuntimeException(
            int statusCode,
            String serviceCode,
            String message,
            String opcRequestId,
            ServiceDetails serviceDetails) {
        return new BmcException(statusCode, serviceCode, message, opcRequestId, serviceDetails);
    }

    @Override
    public BmcException createRuntimeException(
            int statusCode,
            String serviceCode,
            String message,
            String opcRequestId,
            Throwable cause,
            ServiceDetails serviceDetails) {
        return new BmcException(
                statusCode, serviceCode, message, opcRequestId, cause, serviceDetails);
    }
}

/**
 * Copyright (c) 2016, 2021, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.apmtraces.internal.http;

import com.oracle.bmc.http.internal.ResponseHelper;
import com.oracle.bmc.apmtraces.model.*;
import com.oracle.bmc.apmtraces.requests.*;
import com.oracle.bmc.apmtraces.responses.*;
import org.apache.commons.lang3.Validate;

@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200630")
@lombok.extern.slf4j.Slf4j
public class GetSpanConverter {
    private static final com.oracle.bmc.http.internal.ResponseConversionFunctionFactory
            RESPONSE_CONVERSION_FACTORY =
                    new com.oracle.bmc.http.internal.ResponseConversionFunctionFactory();

    public static com.oracle.bmc.apmtraces.requests.GetSpanRequest interceptRequest(
            com.oracle.bmc.apmtraces.requests.GetSpanRequest request) {

        return request;
    }

    public static com.oracle.bmc.http.internal.WrappedInvocationBuilder fromRequest(
            com.oracle.bmc.http.internal.RestClient client,
            com.oracle.bmc.apmtraces.requests.GetSpanRequest request) {
        Validate.notNull(request, "request instance is required");
        Validate.notNull(request.getApmDomainId(), "apmDomainId is required");
        Validate.notBlank(request.getSpanKey(), "spanKey must not be blank");
        Validate.notBlank(request.getTraceKey(), "traceKey must not be blank");

        com.oracle.bmc.http.internal.WrappedWebTarget target =
                client.getBaseTarget()
                        .path("/20200630")
                        .path("spans")
                        .path(
                                com.oracle.bmc.util.internal.HttpUtils.encodePathSegment(
                                        request.getTraceKey()))
                        .path(
                                com.oracle.bmc.util.internal.HttpUtils.encodePathSegment(
                                        request.getSpanKey()));

        target =
                target.queryParam(
                        "apmDomainId",
                        com.oracle.bmc.util.internal.HttpUtils.attemptEncodeQueryParam(
                                request.getApmDomainId()));

        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib = target.request();

        ib.accept(javax.ws.rs.core.MediaType.APPLICATION_JSON);

        if (request.getOpcRequestId() != null) {
            ib.header("opc-request-id", request.getOpcRequestId());
        }

        return ib;
    }

    public static com.google.common.base.Function<
                    javax.ws.rs.core.Response, com.oracle.bmc.apmtraces.responses.GetSpanResponse>
            fromResponse() {
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response,
                        com.oracle.bmc.apmtraces.responses.GetSpanResponse>
                transformer =
                        new com.google.common.base.Function<
                                javax.ws.rs.core.Response,
                                com.oracle.bmc.apmtraces.responses.GetSpanResponse>() {
                            @Override
                            public com.oracle.bmc.apmtraces.responses.GetSpanResponse apply(
                                    javax.ws.rs.core.Response rawResponse) {
                                LOG.trace(
                                        "Transform function invoked for com.oracle.bmc.apmtraces.responses.GetSpanResponse");
                                com.google.common.base.Function<
                                                javax.ws.rs.core.Response,
                                                com.oracle.bmc.http.internal.WithHeaders<Span>>
                                        responseFn = RESPONSE_CONVERSION_FACTORY.create(Span.class);

                                com.oracle.bmc.http.internal.WithHeaders<Span> response =
                                        responseFn.apply(rawResponse);
                                javax.ws.rs.core.MultivaluedMap<String, String> headers =
                                        response.getHeaders();

                                com.oracle.bmc.apmtraces.responses.GetSpanResponse.Builder builder =
                                        com.oracle.bmc.apmtraces.responses.GetSpanResponse.builder()
                                                .__httpStatusCode__(rawResponse.getStatus());

                                builder.span(response.getItem());

                                com.google.common.base.Optional<java.util.List<String>>
                                        opcRequestIdHeader =
                                                com.oracle.bmc.http.internal.HeaderUtils.get(
                                                        headers, "opc-request-id");
                                if (opcRequestIdHeader.isPresent()) {
                                    builder.opcRequestId(
                                            com.oracle.bmc.http.internal.HeaderUtils.toValue(
                                                    "opc-request-id",
                                                    opcRequestIdHeader.get().get(0),
                                                    String.class));
                                }

                                com.oracle.bmc.apmtraces.responses.GetSpanResponse responseWrapper =
                                        builder.build();

                                ResponseHelper.closeResponseSilentlyIfNotBuffered(rawResponse);
                                return responseWrapper;
                            }
                        };
        return transformer;
    }
}

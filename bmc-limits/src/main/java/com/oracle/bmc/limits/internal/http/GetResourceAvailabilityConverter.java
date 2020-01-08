/**
 * Copyright (c) 2016, 2020, Oracle and/or its affiliates. All rights reserved.
 */
package com.oracle.bmc.limits.internal.http;

import com.oracle.bmc.http.internal.ResponseHelper;
import com.oracle.bmc.limits.model.*;
import com.oracle.bmc.limits.requests.*;
import com.oracle.bmc.limits.responses.*;
import org.apache.commons.lang3.Validate;

@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: ")
@lombok.extern.slf4j.Slf4j
public class GetResourceAvailabilityConverter {
    private static final com.oracle.bmc.http.internal.ResponseConversionFunctionFactory
            RESPONSE_CONVERSION_FACTORY =
                    new com.oracle.bmc.http.internal.ResponseConversionFunctionFactory();

    public static GetResourceAvailabilityRequest interceptRequest(
            GetResourceAvailabilityRequest request) {

        return request;
    }

    public static com.oracle.bmc.http.internal.WrappedInvocationBuilder fromRequest(
            com.oracle.bmc.http.internal.RestClient client,
            GetResourceAvailabilityRequest request) {
        Validate.notNull(request, "request instance is required");
        Validate.notBlank(request.getServiceName(), "serviceName must not be blank");
        Validate.notBlank(request.getLimitName(), "limitName must not be blank");
        Validate.notNull(request.getCompartmentId(), "compartmentId is required");

        com.oracle.bmc.http.internal.WrappedWebTarget target =
                client.getBaseTarget()
                        .path("/")
                        .path("20190729")
                        .path("services")
                        .path(
                                com.oracle.bmc.util.internal.HttpUtils.encodePathSegment(
                                        request.getServiceName()))
                        .path("limits")
                        .path(
                                com.oracle.bmc.util.internal.HttpUtils.encodePathSegment(
                                        request.getLimitName()))
                        .path("resourceAvailability");

        target =
                target.queryParam(
                        "compartmentId",
                        com.oracle.bmc.util.internal.HttpUtils.attemptEncodeQueryParam(
                                request.getCompartmentId()));

        if (request.getAvailabilityDomain() != null) {
            target =
                    target.queryParam(
                            "availabilityDomain",
                            com.oracle.bmc.util.internal.HttpUtils.attemptEncodeQueryParam(
                                    request.getAvailabilityDomain()));
        }

        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib = target.request();

        ib.accept(javax.ws.rs.core.MediaType.APPLICATION_JSON);

        if (request.getOpcRequestId() != null) {
            ib.header("opc-request-id", request.getOpcRequestId());
        }

        return ib;
    }

    public static com.google.common.base.Function<
                    javax.ws.rs.core.Response, GetResourceAvailabilityResponse>
            fromResponse() {
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, GetResourceAvailabilityResponse>
                transformer =
                        new com.google.common.base.Function<
                                javax.ws.rs.core.Response, GetResourceAvailabilityResponse>() {
                            @Override
                            public GetResourceAvailabilityResponse apply(
                                    javax.ws.rs.core.Response rawResponse) {
                                LOG.trace(
                                        "Transform function invoked for GetResourceAvailabilityResponse");
                                com.google.common.base.Function<
                                                javax.ws.rs.core.Response,
                                                com.oracle.bmc.http.internal.WithHeaders<
                                                        ResourceAvailability>>
                                        responseFn =
                                                RESPONSE_CONVERSION_FACTORY.create(
                                                        ResourceAvailability.class);

                                com.oracle.bmc.http.internal.WithHeaders<ResourceAvailability>
                                        response = responseFn.apply(rawResponse);
                                javax.ws.rs.core.MultivaluedMap<String, String> headers =
                                        response.getHeaders();

                                GetResourceAvailabilityResponse.Builder builder =
                                        GetResourceAvailabilityResponse.builder();

                                builder.resourceAvailability(response.getItem());

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

                                GetResourceAvailabilityResponse responseWrapper = builder.build();

                                ResponseHelper.closeResponseSilentlyIfNotBuffered(rawResponse);
                                return responseWrapper;
                            }
                        };
        return transformer;
    }
}

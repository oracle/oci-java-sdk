/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.apmsynthetics.internal.http;

import com.oracle.bmc.http.internal.ResponseHelper;
import com.oracle.bmc.apmsynthetics.model.*;
import com.oracle.bmc.apmsynthetics.requests.*;
import com.oracle.bmc.apmsynthetics.responses.*;
import com.oracle.bmc.util.internal.Validate;

@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200630")
public class GetWorkerConverter {
    private static final com.oracle.bmc.http.internal.ResponseConversionFunctionFactoryV2
            RESPONSE_CONVERSION_FACTORY =
                    new com.oracle.bmc.http.internal.ResponseConversionFunctionFactoryV2();

    private static final org.slf4j.Logger LOG =
            org.slf4j.LoggerFactory.getLogger(GetWorkerConverter.class);

    public static com.oracle.bmc.apmsynthetics.requests.GetWorkerRequest interceptRequest(
            com.oracle.bmc.apmsynthetics.requests.GetWorkerRequest request) {

        return request;
    }

    public static com.oracle.bmc.http.internal.WrappedInvocationBuilder fromRequest(
            com.oracle.bmc.http.internal.RestClient client,
            com.oracle.bmc.apmsynthetics.requests.GetWorkerRequest request) {
        Validate.notNull(request, "request instance is required");
        Validate.notNull(request.getApmDomainId(), "apmDomainId is required");
        Validate.notBlank(
                request.getOnPremiseVantagePointId(), "onPremiseVantagePointId must not be blank");
        Validate.notBlank(request.getWorkerId(), "workerId must not be blank");

        com.oracle.bmc.http.internal.WrappedWebTarget target =
                client.getBaseTarget()
                        .path("/20200630")
                        .path("onPremiseVantagePoints")
                        .path(
                                com.oracle.bmc.util.internal.HttpUtils.encodePathSegment(
                                        request.getOnPremiseVantagePointId()))
                        .path("workers")
                        .path(
                                com.oracle.bmc.util.internal.HttpUtils.encodePathSegment(
                                        request.getWorkerId()));

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

        if (client.getClientConfigurator() != null) {
            client.getClientConfigurator().customizeRequest(request, ib);
        }
        return ib;
    }

    public static java.util.function.Function<
                    javax.ws.rs.core.Response,
                    com.oracle.bmc.apmsynthetics.responses.GetWorkerResponse>
            fromResponse() {
        return fromResponse(java.util.Optional.empty());
    }

    public static java.util.function.Function<
                    javax.ws.rs.core.Response,
                    com.oracle.bmc.apmsynthetics.responses.GetWorkerResponse>
            fromResponse(java.util.Optional<com.oracle.bmc.ServiceDetails> serviceDetails) {
        final java.util.function.Function<
                        javax.ws.rs.core.Response,
                        com.oracle.bmc.apmsynthetics.responses.GetWorkerResponse>
                transformer =
                        new java.util.function.Function<
                                javax.ws.rs.core.Response,
                                com.oracle.bmc.apmsynthetics.responses.GetWorkerResponse>() {
                            @Override
                            public com.oracle.bmc.apmsynthetics.responses.GetWorkerResponse apply(
                                    javax.ws.rs.core.Response rawResponse) {
                                LOG.trace(
                                        "Transform function invoked for com.oracle.bmc.apmsynthetics.responses.GetWorkerResponse");
                                final java.util.function.Function<
                                                javax.ws.rs.core.Response,
                                                com.oracle.bmc.http.internal.WithHeaders<
                                                        com.oracle.bmc.apmsynthetics.model.Worker>>
                                        responseFn;
                                if (serviceDetails.isPresent()) {
                                    responseFn =
                                            RESPONSE_CONVERSION_FACTORY.create(
                                                    com.oracle.bmc.apmsynthetics.model.Worker.class,
                                                    serviceDetails.get());
                                } else {
                                    responseFn =
                                            RESPONSE_CONVERSION_FACTORY.create(
                                                    com.oracle.bmc.apmsynthetics.model.Worker
                                                            .class);
                                }

                                com.oracle.bmc.http.internal.WithHeaders<
                                                com.oracle.bmc.apmsynthetics.model.Worker>
                                        response = responseFn.apply(rawResponse);
                                javax.ws.rs.core.MultivaluedMap<String, String> headers =
                                        response.getHeaders();

                                com.oracle.bmc.apmsynthetics.responses.GetWorkerResponse.Builder
                                        builder =
                                                com.oracle.bmc.apmsynthetics.responses
                                                        .GetWorkerResponse.builder()
                                                        .__httpStatusCode__(rawResponse.getStatus())
                                                        .headers(headers);

                                builder.worker(response.getItem());

                                java.util.Optional<java.util.List<String>> etagHeader =
                                        com.oracle.bmc.http.internal.HeaderUtils.getHeadersWithName(
                                                headers, "etag");
                                if (etagHeader.isPresent()) {
                                    builder.etag(
                                            com.oracle.bmc.http.internal.HeaderUtils.toValue(
                                                    "etag", etagHeader.get().get(0), String.class));
                                }

                                java.util.Optional<java.util.List<String>> opcRequestIdHeader =
                                        com.oracle.bmc.http.internal.HeaderUtils.getHeadersWithName(
                                                headers, "opc-request-id");
                                if (opcRequestIdHeader.isPresent()) {
                                    builder.opcRequestId(
                                            com.oracle.bmc.http.internal.HeaderUtils.toValue(
                                                    "opc-request-id",
                                                    opcRequestIdHeader.get().get(0),
                                                    String.class));
                                }

                                com.oracle.bmc.apmsynthetics.responses.GetWorkerResponse
                                        responseWrapper = builder.build();

                                ResponseHelper.closeResponseSilentlyIfNotBuffered(rawResponse);
                                return responseWrapper;
                            }
                        };
        return transformer;
    }
}

/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.fusionapps.internal.http;

import com.oracle.bmc.http.internal.ResponseHelper;
import com.oracle.bmc.fusionapps.model.*;
import com.oracle.bmc.fusionapps.requests.*;
import com.oracle.bmc.fusionapps.responses.*;
import com.oracle.bmc.util.internal.Validate;

@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20211201")
public class CreateVanityDomainActivityConverter {
    private static final com.oracle.bmc.http.internal.ResponseConversionFunctionFactoryV2
            RESPONSE_CONVERSION_FACTORY =
                    new com.oracle.bmc.http.internal.ResponseConversionFunctionFactoryV2();

    private static final org.slf4j.Logger LOG =
            org.slf4j.LoggerFactory.getLogger(CreateVanityDomainActivityConverter.class);

    public static com.oracle.bmc.fusionapps.requests.CreateVanityDomainActivityRequest
            interceptRequest(
                    com.oracle.bmc.fusionapps.requests.CreateVanityDomainActivityRequest request) {

        return request;
    }

    public static com.oracle.bmc.http.internal.WrappedInvocationBuilder fromRequest(
            com.oracle.bmc.http.internal.RestClient client,
            com.oracle.bmc.fusionapps.requests.CreateVanityDomainActivityRequest request) {
        Validate.notNull(request, "request instance is required");
        Validate.notNull(
                request.getCreateVanityDomainActivityDetails(),
                "createVanityDomainActivityDetails is required");
        Validate.notBlank(
                request.getFusionEnvironmentId(), "fusionEnvironmentId must not be blank");

        com.oracle.bmc.http.internal.WrappedWebTarget target =
                client.getBaseTarget()
                        .path("/20211201")
                        .path("fusionEnvironments")
                        .path(
                                com.oracle.bmc.util.internal.HttpUtils.encodePathSegment(
                                        request.getFusionEnvironmentId()))
                        .path("vanityDomainActivities");

        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib = target.request();

        ib.accept(javax.ws.rs.core.MediaType.APPLICATION_JSON);

        if (request.getOpcRetryToken() != null) {
            ib.header("opc-retry-token", request.getOpcRetryToken());
        }

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
                    com.oracle.bmc.fusionapps.responses.CreateVanityDomainActivityResponse>
            fromResponse() {
        return fromResponse(java.util.Optional.empty());
    }

    public static java.util.function.Function<
                    javax.ws.rs.core.Response,
                    com.oracle.bmc.fusionapps.responses.CreateVanityDomainActivityResponse>
            fromResponse(java.util.Optional<com.oracle.bmc.ServiceDetails> serviceDetails) {
        final java.util.function.Function<
                        javax.ws.rs.core.Response,
                        com.oracle.bmc.fusionapps.responses.CreateVanityDomainActivityResponse>
                transformer =
                        new java.util.function.Function<
                                javax.ws.rs.core.Response,
                                com.oracle.bmc.fusionapps.responses
                                        .CreateVanityDomainActivityResponse>() {
                            @Override
                            public com.oracle.bmc.fusionapps.responses
                                            .CreateVanityDomainActivityResponse
                                    apply(javax.ws.rs.core.Response rawResponse) {
                                LOG.trace(
                                        "Transform function invoked for com.oracle.bmc.fusionapps.responses.CreateVanityDomainActivityResponse");
                                final java.util.function.Function<
                                                javax.ws.rs.core.Response,
                                                com.oracle.bmc.http.internal.WithHeaders<Void>>
                                        responseFn;
                                if (serviceDetails.isPresent()) {
                                    responseFn =
                                            RESPONSE_CONVERSION_FACTORY.create(
                                                    serviceDetails.get());
                                } else {
                                    responseFn = RESPONSE_CONVERSION_FACTORY.create();
                                }

                                com.oracle.bmc.http.internal.WithHeaders<Void> response =
                                        responseFn.apply(rawResponse);
                                javax.ws.rs.core.MultivaluedMap<String, String> headers =
                                        response.getHeaders();

                                com.oracle.bmc.fusionapps.responses
                                                .CreateVanityDomainActivityResponse.Builder
                                        builder =
                                                com.oracle.bmc.fusionapps.responses
                                                        .CreateVanityDomainActivityResponse
                                                        .builder()
                                                        .__httpStatusCode__(rawResponse.getStatus())
                                                        .headers(headers);

                                java.util.Optional<java.util.List<String>> opcWorkRequestIdHeader =
                                        com.oracle.bmc.http.internal.HeaderUtils.getHeadersWithName(
                                                headers, "opc-work-request-id");
                                if (opcWorkRequestIdHeader.isPresent()) {
                                    builder.opcWorkRequestId(
                                            com.oracle.bmc.http.internal.HeaderUtils.toValue(
                                                    "opc-work-request-id",
                                                    opcWorkRequestIdHeader.get().get(0),
                                                    String.class));
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

                                java.util.Optional<java.util.List<String>> vanityActivityIdHeader =
                                        com.oracle.bmc.http.internal.HeaderUtils.getHeadersWithName(
                                                headers, "vanity-activity-id");
                                if (vanityActivityIdHeader.isPresent()) {
                                    builder.vanityActivityId(
                                            com.oracle.bmc.http.internal.HeaderUtils.toValue(
                                                    "vanity-activity-id",
                                                    vanityActivityIdHeader.get().get(0),
                                                    String.class));
                                }

                                com.oracle.bmc.fusionapps.responses
                                                .CreateVanityDomainActivityResponse
                                        responseWrapper = builder.build();

                                ResponseHelper.closeResponseSilentlyIfNotBuffered(rawResponse);
                                return responseWrapper;
                            }
                        };
        return transformer;
    }
}

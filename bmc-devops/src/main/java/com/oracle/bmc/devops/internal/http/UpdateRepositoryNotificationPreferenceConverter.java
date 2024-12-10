/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.devops.internal.http;

import com.oracle.bmc.http.internal.ResponseHelper;
import com.oracle.bmc.devops.model.*;
import com.oracle.bmc.devops.requests.*;
import com.oracle.bmc.devops.responses.*;
import com.oracle.bmc.util.internal.Validate;

@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20210630")
public class UpdateRepositoryNotificationPreferenceConverter {
    private static final com.oracle.bmc.http.internal.ResponseConversionFunctionFactoryV2
            RESPONSE_CONVERSION_FACTORY =
                    new com.oracle.bmc.http.internal.ResponseConversionFunctionFactoryV2();

    private static final org.slf4j.Logger LOG =
            org.slf4j.LoggerFactory.getLogger(
                    UpdateRepositoryNotificationPreferenceConverter.class);

    public static com.oracle.bmc.devops.requests.UpdateRepositoryNotificationPreferenceRequest
            interceptRequest(
                    com.oracle.bmc.devops.requests.UpdateRepositoryNotificationPreferenceRequest
                            request) {

        return request;
    }

    public static com.oracle.bmc.http.internal.WrappedInvocationBuilder fromRequest(
            com.oracle.bmc.http.internal.RestClient client,
            com.oracle.bmc.devops.requests.UpdateRepositoryNotificationPreferenceRequest request) {
        Validate.notNull(request, "request instance is required");
        Validate.notNull(
                request.getUpdateRepositoryNotificationPreferenceDetails(),
                "updateRepositoryNotificationPreferenceDetails is required");
        Validate.notBlank(request.getRepositoryId(), "repositoryId must not be blank");
        Validate.notBlank(request.getPrincipalId(), "principalId must not be blank");

        com.oracle.bmc.http.internal.WrappedWebTarget target =
                client.getBaseTarget()
                        .path("/20210630")
                        .path("repositories")
                        .path(
                                com.oracle.bmc.util.internal.HttpUtils.encodePathSegment(
                                        request.getRepositoryId()))
                        .path("principals")
                        .path(
                                com.oracle.bmc.util.internal.HttpUtils.encodePathSegment(
                                        request.getPrincipalId()))
                        .path("pullRequestNotificationPreference");

        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib = target.request();

        ib.accept(javax.ws.rs.core.MediaType.APPLICATION_JSON);

        if (request.getIfMatch() != null) {
            ib.header("if-match", request.getIfMatch());
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
                    com.oracle.bmc.devops.responses.UpdateRepositoryNotificationPreferenceResponse>
            fromResponse() {
        return fromResponse(java.util.Optional.empty());
    }

    public static java.util.function.Function<
                    javax.ws.rs.core.Response,
                    com.oracle.bmc.devops.responses.UpdateRepositoryNotificationPreferenceResponse>
            fromResponse(java.util.Optional<com.oracle.bmc.ServiceDetails> serviceDetails) {
        final java.util.function.Function<
                        javax.ws.rs.core.Response,
                        com.oracle.bmc.devops.responses
                                .UpdateRepositoryNotificationPreferenceResponse>
                transformer =
                        new java.util.function.Function<
                                javax.ws.rs.core.Response,
                                com.oracle.bmc.devops.responses
                                        .UpdateRepositoryNotificationPreferenceResponse>() {
                            @Override
                            public com.oracle.bmc.devops.responses
                                            .UpdateRepositoryNotificationPreferenceResponse
                                    apply(javax.ws.rs.core.Response rawResponse) {
                                LOG.trace(
                                        "Transform function invoked for com.oracle.bmc.devops.responses.UpdateRepositoryNotificationPreferenceResponse");
                                final java.util.function.Function<
                                                javax.ws.rs.core.Response,
                                                com.oracle.bmc.http.internal.WithHeaders<
                                                        com.oracle.bmc.devops.model
                                                                .RepositoryNotificationPreference>>
                                        responseFn;
                                if (serviceDetails.isPresent()) {
                                    responseFn =
                                            RESPONSE_CONVERSION_FACTORY.create(
                                                    com.oracle.bmc.devops.model
                                                                    .RepositoryNotificationPreference
                                                            .class,
                                                    serviceDetails.get());
                                } else {
                                    responseFn =
                                            RESPONSE_CONVERSION_FACTORY.create(
                                                    com.oracle.bmc.devops.model
                                                                    .RepositoryNotificationPreference
                                                            .class);
                                }

                                com.oracle.bmc.http.internal.WithHeaders<
                                                com.oracle.bmc.devops.model
                                                        .RepositoryNotificationPreference>
                                        response = responseFn.apply(rawResponse);
                                javax.ws.rs.core.MultivaluedMap<String, String> headers =
                                        response.getHeaders();

                                com.oracle.bmc.devops.responses
                                                .UpdateRepositoryNotificationPreferenceResponse
                                                .Builder
                                        builder =
                                                com.oracle.bmc.devops.responses
                                                        .UpdateRepositoryNotificationPreferenceResponse
                                                        .builder()
                                                        .__httpStatusCode__(rawResponse.getStatus())
                                                        .headers(headers);

                                builder.repositoryNotificationPreference(response.getItem());

                                java.util.Optional<java.util.List<String>> locationHeader =
                                        com.oracle.bmc.http.internal.HeaderUtils.getHeadersWithName(
                                                headers, "location");
                                if (locationHeader.isPresent()) {
                                    builder.location(
                                            com.oracle.bmc.http.internal.HeaderUtils.toValue(
                                                    "location",
                                                    locationHeader.get().get(0),
                                                    String.class));
                                }

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

                                com.oracle.bmc.devops.responses
                                                .UpdateRepositoryNotificationPreferenceResponse
                                        responseWrapper = builder.build();

                                ResponseHelper.closeResponseSilentlyIfNotBuffered(rawResponse);
                                return responseWrapper;
                            }
                        };
        return transformer;
    }
}

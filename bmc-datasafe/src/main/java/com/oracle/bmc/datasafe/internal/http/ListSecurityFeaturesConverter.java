/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.datasafe.internal.http;

import com.oracle.bmc.http.internal.ResponseHelper;
import com.oracle.bmc.datasafe.model.*;
import com.oracle.bmc.datasafe.requests.*;
import com.oracle.bmc.datasafe.responses.*;
import com.oracle.bmc.util.internal.Validate;

@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20181201")
public class ListSecurityFeaturesConverter {
    private static final com.oracle.bmc.http.internal.ResponseConversionFunctionFactoryV2
            RESPONSE_CONVERSION_FACTORY =
                    new com.oracle.bmc.http.internal.ResponseConversionFunctionFactoryV2();

    private static final org.slf4j.Logger LOG =
            org.slf4j.LoggerFactory.getLogger(ListSecurityFeaturesConverter.class);

    public static com.oracle.bmc.datasafe.requests.ListSecurityFeaturesRequest interceptRequest(
            com.oracle.bmc.datasafe.requests.ListSecurityFeaturesRequest request) {

        return request;
    }

    public static com.oracle.bmc.http.internal.WrappedInvocationBuilder fromRequest(
            com.oracle.bmc.http.internal.RestClient client,
            com.oracle.bmc.datasafe.requests.ListSecurityFeaturesRequest request) {
        Validate.notNull(request, "request instance is required");
        Validate.notNull(request.getCompartmentId(), "compartmentId is required");

        com.oracle.bmc.http.internal.WrappedWebTarget target =
                client.getBaseTarget()
                        .path("/20181201")
                        .path("securityAssessments")
                        .path("securityFeatures");

        target =
                target.queryParam(
                        "compartmentId",
                        com.oracle.bmc.util.internal.HttpUtils.attemptEncodeQueryParam(
                                request.getCompartmentId()));

        if (request.getCompartmentIdInSubtree() != null) {
            target =
                    target.queryParam(
                            "compartmentIdInSubtree",
                            com.oracle.bmc.util.internal.HttpUtils.attemptEncodeQueryParam(
                                    request.getCompartmentIdInSubtree()));
        }

        if (request.getAccessLevel() != null) {
            target =
                    target.queryParam(
                            "accessLevel",
                            com.oracle.bmc.util.internal.HttpUtils.attemptEncodeQueryParam(
                                    request.getAccessLevel().getValue()));
        }

        if (request.getTargetId() != null) {
            target =
                    target.queryParam(
                            "targetId",
                            com.oracle.bmc.util.internal.HttpUtils.attemptEncodeQueryParam(
                                    request.getTargetId()));
        }

        if (request.getTargetsWithUnifiedAudit() != null) {
            target =
                    target.queryParam(
                            "targetsWithUnifiedAudit",
                            com.oracle.bmc.util.internal.HttpUtils.attemptEncodeQueryParam(
                                    request.getTargetsWithUnifiedAudit().getValue()));
        }

        if (request.getTargetsWithFineGrainedAudit() != null) {
            target =
                    target.queryParam(
                            "targetsWithFineGrainedAudit",
                            com.oracle.bmc.util.internal.HttpUtils.attemptEncodeQueryParam(
                                    request.getTargetsWithFineGrainedAudit().getValue()));
        }

        if (request.getTargetsWithTraditionalAudit() != null) {
            target =
                    target.queryParam(
                            "targetsWithTraditionalAudit",
                            com.oracle.bmc.util.internal.HttpUtils.attemptEncodeQueryParam(
                                    request.getTargetsWithTraditionalAudit().getValue()));
        }

        if (request.getTargetsWithDatabaseVault() != null) {
            target =
                    target.queryParam(
                            "targetsWithDatabaseVault",
                            com.oracle.bmc.util.internal.HttpUtils.attemptEncodeQueryParam(
                                    request.getTargetsWithDatabaseVault().getValue()));
        }

        if (request.getTargetsWithPrivilegeAnalysis() != null) {
            target =
                    target.queryParam(
                            "targetsWithPrivilegeAnalysis",
                            com.oracle.bmc.util.internal.HttpUtils.attemptEncodeQueryParam(
                                    request.getTargetsWithPrivilegeAnalysis().getValue()));
        }

        if (request.getTargetsWithTablespaceEncryption() != null) {
            target =
                    target.queryParam(
                            "targetsWithTablespaceEncryption",
                            com.oracle.bmc.util.internal.HttpUtils.attemptEncodeQueryParam(
                                    request.getTargetsWithTablespaceEncryption().getValue()));
        }

        if (request.getTargetsWithColumnEncryption() != null) {
            target =
                    target.queryParam(
                            "targetsWithColumnEncryption",
                            com.oracle.bmc.util.internal.HttpUtils.attemptEncodeQueryParam(
                                    request.getTargetsWithColumnEncryption().getValue()));
        }

        if (request.getTargetsWithNetworkEncryption() != null) {
            target =
                    target.queryParam(
                            "targetsWithNetworkEncryption",
                            com.oracle.bmc.util.internal.HttpUtils.attemptEncodeQueryParam(
                                    request.getTargetsWithNetworkEncryption().getValue()));
        }

        if (request.getTargetsWithPasswordAuthentication() != null) {
            target =
                    target.queryParam(
                            "targetsWithPasswordAuthentication",
                            com.oracle.bmc.util.internal.HttpUtils.attemptEncodeQueryParam(
                                    request.getTargetsWithPasswordAuthentication().getValue()));
        }

        if (request.getTargetsWithGlobalAuthentication() != null) {
            target =
                    target.queryParam(
                            "targetsWithGlobalAuthentication",
                            com.oracle.bmc.util.internal.HttpUtils.attemptEncodeQueryParam(
                                    request.getTargetsWithGlobalAuthentication().getValue()));
        }

        if (request.getTargetsWithExternalAuthentication() != null) {
            target =
                    target.queryParam(
                            "targetsWithExternalAuthentication",
                            com.oracle.bmc.util.internal.HttpUtils.attemptEncodeQueryParam(
                                    request.getTargetsWithExternalAuthentication().getValue()));
        }

        if (request.getLimit() != null) {
            target =
                    target.queryParam(
                            "limit",
                            com.oracle.bmc.util.internal.HttpUtils.attemptEncodeQueryParam(
                                    request.getLimit()));
        }

        if (request.getPage() != null) {
            target =
                    target.queryParam(
                            "page",
                            com.oracle.bmc.util.internal.HttpUtils.attemptEncodeQueryParam(
                                    request.getPage()));
        }

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
                    com.oracle.bmc.datasafe.responses.ListSecurityFeaturesResponse>
            fromResponse() {
        return fromResponse(java.util.Optional.empty());
    }

    public static java.util.function.Function<
                    javax.ws.rs.core.Response,
                    com.oracle.bmc.datasafe.responses.ListSecurityFeaturesResponse>
            fromResponse(java.util.Optional<com.oracle.bmc.ServiceDetails> serviceDetails) {
        final java.util.function.Function<
                        javax.ws.rs.core.Response,
                        com.oracle.bmc.datasafe.responses.ListSecurityFeaturesResponse>
                transformer =
                        new java.util.function.Function<
                                javax.ws.rs.core.Response,
                                com.oracle.bmc.datasafe.responses.ListSecurityFeaturesResponse>() {
                            @Override
                            public com.oracle.bmc.datasafe.responses.ListSecurityFeaturesResponse
                                    apply(javax.ws.rs.core.Response rawResponse) {
                                LOG.trace(
                                        "Transform function invoked for com.oracle.bmc.datasafe.responses.ListSecurityFeaturesResponse");
                                final java.util.function.Function<
                                                javax.ws.rs.core.Response,
                                                com.oracle.bmc.http.internal.WithHeaders<
                                                        com.oracle.bmc.datasafe.model
                                                                .SecurityFeatureCollection>>
                                        responseFn;
                                if (serviceDetails.isPresent()) {
                                    responseFn =
                                            RESPONSE_CONVERSION_FACTORY.create(
                                                    com.oracle.bmc.datasafe.model
                                                                    .SecurityFeatureCollection
                                                            .class,
                                                    serviceDetails.get());
                                } else {
                                    responseFn =
                                            RESPONSE_CONVERSION_FACTORY.create(
                                                    com.oracle.bmc.datasafe.model
                                                                    .SecurityFeatureCollection
                                                            .class);
                                }

                                com.oracle.bmc.http.internal.WithHeaders<
                                                com.oracle.bmc.datasafe.model
                                                        .SecurityFeatureCollection>
                                        response = responseFn.apply(rawResponse);
                                javax.ws.rs.core.MultivaluedMap<String, String> headers =
                                        response.getHeaders();

                                com.oracle.bmc.datasafe.responses.ListSecurityFeaturesResponse
                                                .Builder
                                        builder =
                                                com.oracle.bmc.datasafe.responses
                                                        .ListSecurityFeaturesResponse.builder()
                                                        .__httpStatusCode__(rawResponse.getStatus())
                                                        .headers(headers);

                                builder.securityFeatureCollection(response.getItem());

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

                                java.util.Optional<java.util.List<String>> opcNextPageHeader =
                                        com.oracle.bmc.http.internal.HeaderUtils.getHeadersWithName(
                                                headers, "opc-next-page");
                                if (opcNextPageHeader.isPresent()) {
                                    builder.opcNextPage(
                                            com.oracle.bmc.http.internal.HeaderUtils.toValue(
                                                    "opc-next-page",
                                                    opcNextPageHeader.get().get(0),
                                                    String.class));
                                }

                                java.util.Optional<java.util.List<String>> opcPrevPageHeader =
                                        com.oracle.bmc.http.internal.HeaderUtils.getHeadersWithName(
                                                headers, "opc-prev-page");
                                if (opcPrevPageHeader.isPresent()) {
                                    builder.opcPrevPage(
                                            com.oracle.bmc.http.internal.HeaderUtils.toValue(
                                                    "opc-prev-page",
                                                    opcPrevPageHeader.get().get(0),
                                                    String.class));
                                }

                                com.oracle.bmc.datasafe.responses.ListSecurityFeaturesResponse
                                        responseWrapper = builder.build();

                                ResponseHelper.closeResponseSilentlyIfNotBuffered(rawResponse);
                                return responseWrapper;
                            }
                        };
        return transformer;
    }
}

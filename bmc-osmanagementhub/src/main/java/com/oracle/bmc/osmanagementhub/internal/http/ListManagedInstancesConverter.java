/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.osmanagementhub.internal.http;

import com.oracle.bmc.http.internal.ResponseHelper;
import com.oracle.bmc.osmanagementhub.model.*;
import com.oracle.bmc.osmanagementhub.requests.*;
import com.oracle.bmc.osmanagementhub.responses.*;
import com.oracle.bmc.util.internal.Validate;

@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20220901")
public class ListManagedInstancesConverter {
    private static final com.oracle.bmc.http.internal.ResponseConversionFunctionFactoryV2
            RESPONSE_CONVERSION_FACTORY =
                    new com.oracle.bmc.http.internal.ResponseConversionFunctionFactoryV2();

    private static final org.slf4j.Logger LOG =
            org.slf4j.LoggerFactory.getLogger(ListManagedInstancesConverter.class);

    public static com.oracle.bmc.osmanagementhub.requests.ListManagedInstancesRequest
            interceptRequest(
                    com.oracle.bmc.osmanagementhub.requests.ListManagedInstancesRequest request) {

        return request;
    }

    public static com.oracle.bmc.http.internal.WrappedInvocationBuilder fromRequest(
            com.oracle.bmc.http.internal.RestClient client,
            com.oracle.bmc.osmanagementhub.requests.ListManagedInstancesRequest request) {
        Validate.notNull(request, "request instance is required");

        com.oracle.bmc.http.internal.WrappedWebTarget target =
                client.getBaseTarget().path("/20220901").path("managedInstances");

        if (request.getCompartmentId() != null) {
            target =
                    target.queryParam(
                            "compartmentId",
                            com.oracle.bmc.util.internal.HttpUtils.attemptEncodeQueryParam(
                                    request.getCompartmentId()));
        }

        if (request.getDisplayName() != null) {
            target =
                    com.oracle.bmc.util.internal.HttpUtils.encodeCollectionFormatQueryParam(
                            target,
                            "displayName",
                            request.getDisplayName(),
                            com.oracle.bmc.util.internal.CollectionFormatType.Multi);
        }

        if (request.getDisplayNameContains() != null) {
            target =
                    target.queryParam(
                            "displayNameContains",
                            com.oracle.bmc.util.internal.HttpUtils.attemptEncodeQueryParam(
                                    request.getDisplayNameContains()));
        }

        if (request.getManagedInstanceId() != null) {
            target =
                    target.queryParam(
                            "managedInstanceId",
                            com.oracle.bmc.util.internal.HttpUtils.attemptEncodeQueryParam(
                                    request.getManagedInstanceId()));
        }

        if (request.getStatus() != null) {
            target =
                    com.oracle.bmc.util.internal.HttpUtils.encodeCollectionFormatQueryParam(
                            target,
                            "status",
                            request.getStatus(),
                            com.oracle.bmc.util.internal.CollectionFormatType.Multi);
        }

        if (request.getArchType() != null) {
            target =
                    com.oracle.bmc.util.internal.HttpUtils.encodeCollectionFormatQueryParam(
                            target,
                            "archType",
                            request.getArchType(),
                            com.oracle.bmc.util.internal.CollectionFormatType.Multi);
        }

        if (request.getOsFamily() != null) {
            target =
                    com.oracle.bmc.util.internal.HttpUtils.encodeCollectionFormatQueryParam(
                            target,
                            "osFamily",
                            request.getOsFamily(),
                            com.oracle.bmc.util.internal.CollectionFormatType.Multi);
        }

        if (request.getIsManagementStation() != null) {
            target =
                    target.queryParam(
                            "isManagementStation",
                            com.oracle.bmc.util.internal.HttpUtils.attemptEncodeQueryParam(
                                    request.getIsManagementStation()));
        }

        if (request.getGroup() != null) {
            target =
                    target.queryParam(
                            "group",
                            com.oracle.bmc.util.internal.HttpUtils.attemptEncodeQueryParam(
                                    request.getGroup()));
        }

        if (request.getGroupNotEqualTo() != null) {
            target =
                    target.queryParam(
                            "groupNotEqualTo",
                            com.oracle.bmc.util.internal.HttpUtils.attemptEncodeQueryParam(
                                    request.getGroupNotEqualTo()));
        }

        if (request.getLifecycleStage() != null) {
            target =
                    target.queryParam(
                            "lifecycleStage",
                            com.oracle.bmc.util.internal.HttpUtils.attemptEncodeQueryParam(
                                    request.getLifecycleStage()));
        }

        if (request.getLifecycleStageNotEqualTo() != null) {
            target =
                    target.queryParam(
                            "lifecycleStageNotEqualTo",
                            com.oracle.bmc.util.internal.HttpUtils.attemptEncodeQueryParam(
                                    request.getLifecycleStageNotEqualTo()));
        }

        if (request.getIsAttachedToGroupOrLifecycleStage() != null) {
            target =
                    target.queryParam(
                            "isAttachedToGroupOrLifecycleStage",
                            com.oracle.bmc.util.internal.HttpUtils.attemptEncodeQueryParam(
                                    request.getIsAttachedToGroupOrLifecycleStage()));
        }

        if (request.getSoftwareSourceId() != null) {
            target =
                    target.queryParam(
                            "softwareSourceId",
                            com.oracle.bmc.util.internal.HttpUtils.attemptEncodeQueryParam(
                                    request.getSoftwareSourceId()));
        }

        if (request.getAdvisoryName() != null) {
            target =
                    com.oracle.bmc.util.internal.HttpUtils.encodeCollectionFormatQueryParam(
                            target,
                            "advisoryName",
                            request.getAdvisoryName(),
                            com.oracle.bmc.util.internal.CollectionFormatType.Multi);
        }

        if (request.getLifecycleEnvironment() != null) {
            target =
                    target.queryParam(
                            "lifecycleEnvironment",
                            com.oracle.bmc.util.internal.HttpUtils.attemptEncodeQueryParam(
                                    request.getLifecycleEnvironment()));
        }

        if (request.getLifecycleEnvironmentNotEqualTo() != null) {
            target =
                    target.queryParam(
                            "lifecycleEnvironmentNotEqualTo",
                            com.oracle.bmc.util.internal.HttpUtils.attemptEncodeQueryParam(
                                    request.getLifecycleEnvironmentNotEqualTo()));
        }

        if (request.getLocation() != null) {
            target =
                    com.oracle.bmc.util.internal.HttpUtils.encodeCollectionFormatQueryParam(
                            target,
                            "location",
                            request.getLocation(),
                            com.oracle.bmc.util.internal.CollectionFormatType.Multi);
        }

        if (request.getLocationNotEqualTo() != null) {
            target =
                    com.oracle.bmc.util.internal.HttpUtils.encodeCollectionFormatQueryParam(
                            target,
                            "locationNotEqualTo",
                            request.getLocationNotEqualTo(),
                            com.oracle.bmc.util.internal.CollectionFormatType.Multi);
        }

        if (request.getProfile() != null) {
            target =
                    com.oracle.bmc.util.internal.HttpUtils.encodeCollectionFormatQueryParam(
                            target,
                            "profile",
                            request.getProfile(),
                            com.oracle.bmc.util.internal.CollectionFormatType.Multi);
        }

        if (request.getProfileNotEqualTo() != null) {
            target =
                    com.oracle.bmc.util.internal.HttpUtils.encodeCollectionFormatQueryParam(
                            target,
                            "profileNotEqualTo",
                            request.getProfileNotEqualTo(),
                            com.oracle.bmc.util.internal.CollectionFormatType.Multi);
        }

        if (request.getIsProfileAttached() != null) {
            target =
                    target.queryParam(
                            "isProfileAttached",
                            com.oracle.bmc.util.internal.HttpUtils.attemptEncodeQueryParam(
                                    request.getIsProfileAttached()));
        }

        if (request.getIsManagedByAutonomousLinux() != null) {
            target =
                    target.queryParam(
                            "isManagedByAutonomousLinux",
                            com.oracle.bmc.util.internal.HttpUtils.attemptEncodeQueryParam(
                                    request.getIsManagedByAutonomousLinux()));
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

        if (request.getSortOrder() != null) {
            target =
                    target.queryParam(
                            "sortOrder",
                            com.oracle.bmc.util.internal.HttpUtils.attemptEncodeQueryParam(
                                    request.getSortOrder().getValue()));
        }

        if (request.getSortBy() != null) {
            target =
                    target.queryParam(
                            "sortBy",
                            com.oracle.bmc.util.internal.HttpUtils.attemptEncodeQueryParam(
                                    request.getSortBy().getValue()));
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
                    com.oracle.bmc.osmanagementhub.responses.ListManagedInstancesResponse>
            fromResponse() {
        return fromResponse(java.util.Optional.empty());
    }

    public static java.util.function.Function<
                    javax.ws.rs.core.Response,
                    com.oracle.bmc.osmanagementhub.responses.ListManagedInstancesResponse>
            fromResponse(java.util.Optional<com.oracle.bmc.ServiceDetails> serviceDetails) {
        final java.util.function.Function<
                        javax.ws.rs.core.Response,
                        com.oracle.bmc.osmanagementhub.responses.ListManagedInstancesResponse>
                transformer =
                        new java.util.function.Function<
                                javax.ws.rs.core.Response,
                                com.oracle.bmc.osmanagementhub.responses
                                        .ListManagedInstancesResponse>() {
                            @Override
                            public com.oracle.bmc.osmanagementhub.responses
                                            .ListManagedInstancesResponse
                                    apply(javax.ws.rs.core.Response rawResponse) {
                                LOG.trace(
                                        "Transform function invoked for com.oracle.bmc.osmanagementhub.responses.ListManagedInstancesResponse");
                                final java.util.function.Function<
                                                javax.ws.rs.core.Response,
                                                com.oracle.bmc.http.internal.WithHeaders<
                                                        com.oracle.bmc.osmanagementhub.model
                                                                .ManagedInstanceCollection>>
                                        responseFn;
                                if (serviceDetails.isPresent()) {
                                    responseFn =
                                            RESPONSE_CONVERSION_FACTORY.create(
                                                    com.oracle.bmc.osmanagementhub.model
                                                                    .ManagedInstanceCollection
                                                            .class,
                                                    serviceDetails.get());
                                } else {
                                    responseFn =
                                            RESPONSE_CONVERSION_FACTORY.create(
                                                    com.oracle.bmc.osmanagementhub.model
                                                                    .ManagedInstanceCollection
                                                            .class);
                                }

                                com.oracle.bmc.http.internal.WithHeaders<
                                                com.oracle.bmc.osmanagementhub.model
                                                        .ManagedInstanceCollection>
                                        response = responseFn.apply(rawResponse);
                                javax.ws.rs.core.MultivaluedMap<String, String> headers =
                                        response.getHeaders();

                                com.oracle.bmc.osmanagementhub.responses
                                                .ListManagedInstancesResponse.Builder
                                        builder =
                                                com.oracle.bmc.osmanagementhub.responses
                                                        .ListManagedInstancesResponse.builder()
                                                        .__httpStatusCode__(rawResponse.getStatus())
                                                        .headers(headers);

                                builder.managedInstanceCollection(response.getItem());

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

                                com.oracle.bmc.osmanagementhub.responses
                                                .ListManagedInstancesResponse
                                        responseWrapper = builder.build();

                                ResponseHelper.closeResponseSilentlyIfNotBuffered(rawResponse);
                                return responseWrapper;
                            }
                        };
        return transformer;
    }
}

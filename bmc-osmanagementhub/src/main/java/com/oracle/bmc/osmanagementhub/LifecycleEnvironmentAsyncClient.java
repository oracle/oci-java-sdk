/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.osmanagementhub;

import com.oracle.bmc.util.internal.Validate;
import com.oracle.bmc.osmanagementhub.requests.*;
import com.oracle.bmc.osmanagementhub.responses.*;

import java.util.Objects;

/**
 * Async client implementation for LifecycleEnvironment service. <br>
 * There are two ways to use async client: 1. Use AsyncHandler: using AsyncHandler, if the response
 * to the call is an {@link java.io.InputStream}, like getObject Api in object storage service,
 * developers need to process the stream in AsyncHandler, and not anywhere else, because the stream
 * will be closed right after the AsyncHandler is invoked. <br>
 * 2. Use Java Future: using Java Future, developers need to close the stream after they are done
 * with the Java Future.<br>
 * Accessing the result should be done in a mutually exclusive manner, either through the Future or
 * the AsyncHandler, but not both. If the Future is used, the caller should pass in null as the
 * AsyncHandler. If the AsyncHandler is used, it is still safe to use the Future to determine
 * whether or not the request was completed via Future.isDone/isCancelled.<br>
 * Please refer to
 * https://github.com/oracle/oci-java-sdk/blob/master/bmc-examples/src/main/java/ResteasyClientWithObjectStorageExample.java
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20220901")
public class LifecycleEnvironmentAsyncClient extends com.oracle.bmc.http.internal.BaseAsyncClient
        implements LifecycleEnvironmentAsync {
    /** Service instance for LifecycleEnvironment. */
    public static final com.oracle.bmc.Service SERVICE =
            com.oracle.bmc.Services.serviceBuilder()
                    .serviceName(LifecycleEnvironmentClient.class.getName())
                    .serviceEndpointPrefix("")
                    .serviceEndpointTemplate("https://osmh.{region}.oci.{secondLevelDomain}")
                    .build();

    private static final org.slf4j.Logger LOG =
            org.slf4j.LoggerFactory.getLogger(LifecycleEnvironmentAsyncClient.class);

    LifecycleEnvironmentAsyncClient(
            com.oracle.bmc.common.ClientBuilderBase<?, ?> builder,
            com.oracle.bmc.auth.AbstractAuthenticationDetailsProvider
                    authenticationDetailsProvider) {
        super(builder, authenticationDetailsProvider);
    }

    /**
     * Create a builder for this client.
     *
     * @return builder
     */
    public static Builder builder() {
        return new Builder(SERVICE);
    }

    /**
     * Builder class for this client. The "authenticationDetailsProvider" is required and must be
     * passed to the {@link #build(AbstractAuthenticationDetailsProvider)} method.
     */
    public static class Builder
            extends com.oracle.bmc.common.RegionalClientBuilder<
                    Builder, LifecycleEnvironmentAsyncClient> {
        private Builder(com.oracle.bmc.Service service) {
            super(service);
            final String packageName = "osmanagementhub";
            com.oracle.bmc.internal.Alloy.throwDisabledServiceExceptionIfAppropriate(packageName);
            requestSignerFactory =
                    new com.oracle.bmc.http.signing.internal.DefaultRequestSignerFactory(
                            com.oracle.bmc.http.signing.SigningStrategy.STANDARD);
        }

        /**
         * Build the client.
         *
         * @param authenticationDetailsProvider authentication details provider
         * @return the client
         */
        public LifecycleEnvironmentAsyncClient build(
                @jakarta.annotation.Nonnull
                        com.oracle.bmc.auth.AbstractAuthenticationDetailsProvider
                                authenticationDetailsProvider) {
            return new LifecycleEnvironmentAsyncClient(this, authenticationDetailsProvider);
        }
    }

    @Override
    public void setRegion(com.oracle.bmc.Region region) {
        super.setRegion(region);
    }

    @Override
    public void setRegion(String regionId) {
        super.setRegion(regionId);
    }

    @Override
    public java.util.concurrent.Future<AttachManagedInstancesToLifecycleStageResponse>
            attachManagedInstancesToLifecycleStage(
                    AttachManagedInstancesToLifecycleStageRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    AttachManagedInstancesToLifecycleStageRequest,
                                    AttachManagedInstancesToLifecycleStageResponse>
                            handler) {

        Validate.notBlank(request.getLifecycleStageId(), "lifecycleStageId must not be blank");
        Objects.requireNonNull(
                request.getAttachManagedInstancesToLifecycleStageDetails(),
                "attachManagedInstancesToLifecycleStageDetails is required");

        return clientCall(request, AttachManagedInstancesToLifecycleStageResponse::builder)
                .logger(LOG, "attachManagedInstancesToLifecycleStage")
                .serviceDetails(
                        "LifecycleEnvironment",
                        "AttachManagedInstancesToLifecycleStage",
                        "https://docs.oracle.com/iaas/api/#/en/osmh/20220901/LifecycleStage/AttachManagedInstancesToLifecycleStage")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(AttachManagedInstancesToLifecycleStageRequest::builder)
                .basePath("/20220901")
                .appendPathParam("lifecycleStages")
                .appendPathParam(request.getLifecycleStageId())
                .appendPathParam("actions")
                .appendPathParam("attachManagedInstances")
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("if-match", request.getIfMatch())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-request-id",
                        AttachManagedInstancesToLifecycleStageResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        AttachManagedInstancesToLifecycleStageResponse.Builder::opcWorkRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ChangeLifecycleEnvironmentCompartmentResponse>
            changeLifecycleEnvironmentCompartment(
                    ChangeLifecycleEnvironmentCompartmentRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ChangeLifecycleEnvironmentCompartmentRequest,
                                    ChangeLifecycleEnvironmentCompartmentResponse>
                            handler) {

        Validate.notBlank(
                request.getLifecycleEnvironmentId(), "lifecycleEnvironmentId must not be blank");
        Objects.requireNonNull(
                request.getChangeLifecycleEnvironmentCompartmentDetails(),
                "changeLifecycleEnvironmentCompartmentDetails is required");

        return clientCall(request, ChangeLifecycleEnvironmentCompartmentResponse::builder)
                .logger(LOG, "changeLifecycleEnvironmentCompartment")
                .serviceDetails(
                        "LifecycleEnvironment",
                        "ChangeLifecycleEnvironmentCompartment",
                        "https://docs.oracle.com/iaas/api/#/en/osmh/20220901/LifecycleEnvironment/ChangeLifecycleEnvironmentCompartment")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(ChangeLifecycleEnvironmentCompartmentRequest::builder)
                .basePath("/20220901")
                .appendPathParam("lifecycleEnvironments")
                .appendPathParam(request.getLifecycleEnvironmentId())
                .appendPathParam("actions")
                .appendPathParam("changeCompartment")
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-request-id",
                        ChangeLifecycleEnvironmentCompartmentResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<CreateLifecycleEnvironmentResponse>
            createLifecycleEnvironment(
                    CreateLifecycleEnvironmentRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    CreateLifecycleEnvironmentRequest,
                                    CreateLifecycleEnvironmentResponse>
                            handler) {
        Objects.requireNonNull(
                request.getCreateLifecycleEnvironmentDetails(),
                "createLifecycleEnvironmentDetails is required");

        return clientCall(request, CreateLifecycleEnvironmentResponse::builder)
                .logger(LOG, "createLifecycleEnvironment")
                .serviceDetails(
                        "LifecycleEnvironment",
                        "CreateLifecycleEnvironment",
                        "https://docs.oracle.com/iaas/api/#/en/osmh/20220901/LifecycleEnvironment/CreateLifecycleEnvironment")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CreateLifecycleEnvironmentRequest::builder)
                .basePath("/20220901")
                .appendPathParam("lifecycleEnvironments")
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.osmanagementhub.model.LifecycleEnvironment.class,
                        CreateLifecycleEnvironmentResponse.Builder::lifecycleEnvironment)
                .handleResponseHeaderString(
                        "etag", CreateLifecycleEnvironmentResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", CreateLifecycleEnvironmentResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<DeleteLifecycleEnvironmentResponse>
            deleteLifecycleEnvironment(
                    DeleteLifecycleEnvironmentRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    DeleteLifecycleEnvironmentRequest,
                                    DeleteLifecycleEnvironmentResponse>
                            handler) {

        Validate.notBlank(
                request.getLifecycleEnvironmentId(), "lifecycleEnvironmentId must not be blank");

        return clientCall(request, DeleteLifecycleEnvironmentResponse::builder)
                .logger(LOG, "deleteLifecycleEnvironment")
                .serviceDetails(
                        "LifecycleEnvironment",
                        "DeleteLifecycleEnvironment",
                        "https://docs.oracle.com/iaas/api/#/en/osmh/20220901/LifecycleEnvironment/DeleteLifecycleEnvironment")
                .method(com.oracle.bmc.http.client.Method.DELETE)
                .requestBuilder(DeleteLifecycleEnvironmentRequest::builder)
                .basePath("/20220901")
                .appendPathParam("lifecycleEnvironments")
                .appendPathParam(request.getLifecycleEnvironmentId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleResponseHeaderString(
                        "opc-request-id", DeleteLifecycleEnvironmentResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<DetachManagedInstancesFromLifecycleStageResponse>
            detachManagedInstancesFromLifecycleStage(
                    DetachManagedInstancesFromLifecycleStageRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    DetachManagedInstancesFromLifecycleStageRequest,
                                    DetachManagedInstancesFromLifecycleStageResponse>
                            handler) {

        Validate.notBlank(request.getLifecycleStageId(), "lifecycleStageId must not be blank");
        Objects.requireNonNull(
                request.getDetachManagedInstancesFromLifecycleStageDetails(),
                "detachManagedInstancesFromLifecycleStageDetails is required");

        return clientCall(request, DetachManagedInstancesFromLifecycleStageResponse::builder)
                .logger(LOG, "detachManagedInstancesFromLifecycleStage")
                .serviceDetails(
                        "LifecycleEnvironment",
                        "DetachManagedInstancesFromLifecycleStage",
                        "https://docs.oracle.com/iaas/api/#/en/osmh/20220901/LifecycleStage/DetachManagedInstancesFromLifecycleStage")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(DetachManagedInstancesFromLifecycleStageRequest::builder)
                .basePath("/20220901")
                .appendPathParam("lifecycleStages")
                .appendPathParam(request.getLifecycleStageId())
                .appendPathParam("actions")
                .appendPathParam("detachManagedInstances")
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("if-match", request.getIfMatch())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-request-id",
                        DetachManagedInstancesFromLifecycleStageResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        DetachManagedInstancesFromLifecycleStageResponse.Builder::opcWorkRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<GetLifecycleEnvironmentResponse> getLifecycleEnvironment(
            GetLifecycleEnvironmentRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetLifecycleEnvironmentRequest, GetLifecycleEnvironmentResponse>
                    handler) {

        Validate.notBlank(
                request.getLifecycleEnvironmentId(), "lifecycleEnvironmentId must not be blank");

        return clientCall(request, GetLifecycleEnvironmentResponse::builder)
                .logger(LOG, "getLifecycleEnvironment")
                .serviceDetails(
                        "LifecycleEnvironment",
                        "GetLifecycleEnvironment",
                        "https://docs.oracle.com/iaas/api/#/en/osmh/20220901/LifecycleEnvironment/GetLifecycleEnvironment")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetLifecycleEnvironmentRequest::builder)
                .basePath("/20220901")
                .appendPathParam("lifecycleEnvironments")
                .appendPathParam(request.getLifecycleEnvironmentId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.osmanagementhub.model.LifecycleEnvironment.class,
                        GetLifecycleEnvironmentResponse.Builder::lifecycleEnvironment)
                .handleResponseHeaderString("etag", GetLifecycleEnvironmentResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", GetLifecycleEnvironmentResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<GetLifecycleStageResponse> getLifecycleStage(
            GetLifecycleStageRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetLifecycleStageRequest, GetLifecycleStageResponse>
                    handler) {

        Validate.notBlank(request.getLifecycleStageId(), "lifecycleStageId must not be blank");

        return clientCall(request, GetLifecycleStageResponse::builder)
                .logger(LOG, "getLifecycleStage")
                .serviceDetails(
                        "LifecycleEnvironment",
                        "GetLifecycleStage",
                        "https://docs.oracle.com/iaas/api/#/en/osmh/20220901/LifecycleStage/GetLifecycleStage")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetLifecycleStageRequest::builder)
                .basePath("/20220901")
                .appendPathParam("lifecycleStages")
                .appendPathParam(request.getLifecycleStageId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.osmanagementhub.model.LifecycleStage.class,
                        GetLifecycleStageResponse.Builder::lifecycleStage)
                .handleResponseHeaderString("etag", GetLifecycleStageResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", GetLifecycleStageResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListLifecycleEnvironmentsResponse> listLifecycleEnvironments(
            ListLifecycleEnvironmentsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListLifecycleEnvironmentsRequest, ListLifecycleEnvironmentsResponse>
                    handler) {

        return clientCall(request, ListLifecycleEnvironmentsResponse::builder)
                .logger(LOG, "listLifecycleEnvironments")
                .serviceDetails(
                        "LifecycleEnvironment",
                        "ListLifecycleEnvironments",
                        "https://docs.oracle.com/iaas/api/#/en/osmh/20220901/LifecycleEnvironment/ListLifecycleEnvironments")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListLifecycleEnvironmentsRequest::builder)
                .basePath("/20220901")
                .appendPathParam("lifecycleEnvironments")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendListQueryParam(
                        "displayName",
                        request.getDisplayName(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .appendQueryParam("displayNameContains", request.getDisplayNameContains())
                .appendQueryParam("lifecycleEnvironmentId", request.getLifecycleEnvironmentId())
                .appendEnumQueryParam("archType", request.getArchType())
                .appendEnumQueryParam("osFamily", request.getOsFamily())
                .appendListQueryParam(
                        "location",
                        request.getLocation(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .appendListQueryParam(
                        "locationNotEqualTo",
                        request.getLocationNotEqualTo(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendEnumQueryParam("lifecycleState", request.getLifecycleState())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.osmanagementhub.model.LifecycleEnvironmentCollection.class,
                        ListLifecycleEnvironmentsResponse.Builder::lifecycleEnvironmentCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListLifecycleEnvironmentsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListLifecycleEnvironmentsResponse.Builder::opcNextPage)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListLifecycleStageInstalledPackagesResponse>
            listLifecycleStageInstalledPackages(
                    ListLifecycleStageInstalledPackagesRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ListLifecycleStageInstalledPackagesRequest,
                                    ListLifecycleStageInstalledPackagesResponse>
                            handler) {

        Validate.notBlank(request.getLifecycleStageId(), "lifecycleStageId must not be blank");

        return clientCall(request, ListLifecycleStageInstalledPackagesResponse::builder)
                .logger(LOG, "listLifecycleStageInstalledPackages")
                .serviceDetails(
                        "LifecycleEnvironment",
                        "ListLifecycleStageInstalledPackages",
                        "https://docs.oracle.com/iaas/api/#/en/osmh/20220901/LifecycleStage/ListLifecycleStageInstalledPackages")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListLifecycleStageInstalledPackagesRequest::builder)
                .basePath("/20220901")
                .appendPathParam("lifecycleStages")
                .appendPathParam(request.getLifecycleStageId())
                .appendPathParam("installedPackages")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendListQueryParam(
                        "displayName",
                        request.getDisplayName(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .appendQueryParam("displayNameContains", request.getDisplayNameContains())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendEnumQueryParam("lifecycleState", request.getLifecycleState())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.osmanagementhub.model.InstalledPackageCollection.class,
                        ListLifecycleStageInstalledPackagesResponse.Builder
                                ::installedPackageCollection)
                .handleResponseHeaderString(
                        "opc-request-id",
                        ListLifecycleStageInstalledPackagesResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page",
                        ListLifecycleStageInstalledPackagesResponse.Builder::opcNextPage)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListLifecycleStagesResponse> listLifecycleStages(
            ListLifecycleStagesRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListLifecycleStagesRequest, ListLifecycleStagesResponse>
                    handler) {

        return clientCall(request, ListLifecycleStagesResponse::builder)
                .logger(LOG, "listLifecycleStages")
                .serviceDetails(
                        "LifecycleEnvironment",
                        "ListLifecycleStages",
                        "https://docs.oracle.com/iaas/api/#/en/osmh/20220901/LifecycleStage/ListLifecycleStages")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListLifecycleStagesRequest::builder)
                .basePath("/20220901")
                .appendPathParam("lifecycleStages")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendListQueryParam(
                        "displayName",
                        request.getDisplayName(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .appendQueryParam("displayNameContains", request.getDisplayNameContains())
                .appendQueryParam("lifecycleStageId", request.getLifecycleStageId())
                .appendQueryParam("softwareSourceId", request.getSoftwareSourceId())
                .appendEnumQueryParam("archType", request.getArchType())
                .appendEnumQueryParam("osFamily", request.getOsFamily())
                .appendListQueryParam(
                        "location",
                        request.getLocation(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .appendListQueryParam(
                        "locationNotEqualTo",
                        request.getLocationNotEqualTo(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendEnumQueryParam("lifecycleState", request.getLifecycleState())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.osmanagementhub.model.LifecycleStageCollection.class,
                        ListLifecycleStagesResponse.Builder::lifecycleStageCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListLifecycleStagesResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListLifecycleStagesResponse.Builder::opcNextPage)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<PromoteSoftwareSourceToLifecycleStageResponse>
            promoteSoftwareSourceToLifecycleStage(
                    PromoteSoftwareSourceToLifecycleStageRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    PromoteSoftwareSourceToLifecycleStageRequest,
                                    PromoteSoftwareSourceToLifecycleStageResponse>
                            handler) {

        Validate.notBlank(request.getLifecycleStageId(), "lifecycleStageId must not be blank");
        Objects.requireNonNull(
                request.getPromoteSoftwareSourceToLifecycleStageDetails(),
                "promoteSoftwareSourceToLifecycleStageDetails is required");

        return clientCall(request, PromoteSoftwareSourceToLifecycleStageResponse::builder)
                .logger(LOG, "promoteSoftwareSourceToLifecycleStage")
                .serviceDetails(
                        "LifecycleEnvironment",
                        "PromoteSoftwareSourceToLifecycleStage",
                        "https://docs.oracle.com/iaas/api/#/en/osmh/20220901/LifecycleStage/PromoteSoftwareSourceToLifecycleStage")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(PromoteSoftwareSourceToLifecycleStageRequest::builder)
                .basePath("/20220901")
                .appendPathParam("lifecycleStages")
                .appendPathParam(request.getLifecycleStageId())
                .appendPathParam("actions")
                .appendPathParam("promoteSoftwareSource")
                .appendQueryParam("softwareSourceId", request.getSoftwareSourceId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("if-match", request.getIfMatch())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        PromoteSoftwareSourceToLifecycleStageResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id",
                        PromoteSoftwareSourceToLifecycleStageResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<RebootLifecycleStageResponse> rebootLifecycleStage(
            RebootLifecycleStageRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            RebootLifecycleStageRequest, RebootLifecycleStageResponse>
                    handler) {

        Validate.notBlank(request.getLifecycleStageId(), "lifecycleStageId must not be blank");
        Objects.requireNonNull(
                request.getRebootLifecycleStageDetails(),
                "rebootLifecycleStageDetails is required");

        return clientCall(request, RebootLifecycleStageResponse::builder)
                .logger(LOG, "rebootLifecycleStage")
                .serviceDetails(
                        "LifecycleEnvironment",
                        "RebootLifecycleStage",
                        "https://docs.oracle.com/iaas/api/#/en/osmh/20220901/LifecycleStage/RebootLifecycleStage")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(RebootLifecycleStageRequest::builder)
                .basePath("/20220901")
                .appendPathParam("lifecycleStages")
                .appendPathParam(request.getLifecycleStageId())
                .appendPathParam("actions")
                .appendPathParam("reboot")
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("if-match", request.getIfMatch())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        RebootLifecycleStageResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", RebootLifecycleStageResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<UpdateLifecycleEnvironmentResponse>
            updateLifecycleEnvironment(
                    UpdateLifecycleEnvironmentRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    UpdateLifecycleEnvironmentRequest,
                                    UpdateLifecycleEnvironmentResponse>
                            handler) {

        Validate.notBlank(
                request.getLifecycleEnvironmentId(), "lifecycleEnvironmentId must not be blank");
        Objects.requireNonNull(
                request.getUpdateLifecycleEnvironmentDetails(),
                "updateLifecycleEnvironmentDetails is required");

        return clientCall(request, UpdateLifecycleEnvironmentResponse::builder)
                .logger(LOG, "updateLifecycleEnvironment")
                .serviceDetails(
                        "LifecycleEnvironment",
                        "UpdateLifecycleEnvironment",
                        "https://docs.oracle.com/iaas/api/#/en/osmh/20220901/LifecycleEnvironment/UpdateLifecycleEnvironment")
                .method(com.oracle.bmc.http.client.Method.PUT)
                .requestBuilder(UpdateLifecycleEnvironmentRequest::builder)
                .basePath("/20220901")
                .appendPathParam("lifecycleEnvironments")
                .appendPathParam(request.getLifecycleEnvironmentId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.osmanagementhub.model.LifecycleEnvironment.class,
                        UpdateLifecycleEnvironmentResponse.Builder::lifecycleEnvironment)
                .handleResponseHeaderString(
                        "etag", UpdateLifecycleEnvironmentResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", UpdateLifecycleEnvironmentResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    /**
     * Create a new client instance.
     *
     * @param authenticationDetailsProvider The authentication details (see {@link Builder#build})
     * @deprecated Use the {@link #builder() builder} instead.
     */
    @Deprecated
    public LifecycleEnvironmentAsyncClient(
            com.oracle.bmc.auth.BasicAuthenticationDetailsProvider authenticationDetailsProvider) {
        this(builder(), authenticationDetailsProvider);
    }

    /**
     * Create a new client instance.
     *
     * @param authenticationDetailsProvider The authentication details (see {@link Builder#build})
     * @param configuration {@link Builder#configuration}
     * @deprecated Use the {@link #builder() builder} instead.
     */
    @Deprecated
    public LifecycleEnvironmentAsyncClient(
            com.oracle.bmc.auth.BasicAuthenticationDetailsProvider authenticationDetailsProvider,
            com.oracle.bmc.ClientConfiguration configuration) {
        this(builder().configuration(configuration), authenticationDetailsProvider);
    }

    /**
     * Create a new client instance.
     *
     * @param authenticationDetailsProvider The authentication details (see {@link Builder#build})
     * @param configuration {@link Builder#configuration}
     * @param clientConfigurator {@link Builder#clientConfigurator}
     * @deprecated Use the {@link #builder() builder} instead.
     */
    @Deprecated
    public LifecycleEnvironmentAsyncClient(
            com.oracle.bmc.auth.BasicAuthenticationDetailsProvider authenticationDetailsProvider,
            com.oracle.bmc.ClientConfiguration configuration,
            com.oracle.bmc.http.ClientConfigurator clientConfigurator) {
        this(
                builder().configuration(configuration).clientConfigurator(clientConfigurator),
                authenticationDetailsProvider);
    }

    /**
     * Create a new client instance.
     *
     * @param authenticationDetailsProvider The authentication details (see {@link Builder#build})
     * @param configuration {@link Builder#configuration}
     * @param clientConfigurator {@link Builder#clientConfigurator}
     * @param defaultRequestSignerFactory {@link Builder#requestSignerFactory}
     * @deprecated Use the {@link #builder() builder} instead.
     */
    @Deprecated
    public LifecycleEnvironmentAsyncClient(
            com.oracle.bmc.auth.AbstractAuthenticationDetailsProvider authenticationDetailsProvider,
            com.oracle.bmc.ClientConfiguration configuration,
            com.oracle.bmc.http.ClientConfigurator clientConfigurator,
            com.oracle.bmc.http.signing.RequestSignerFactory defaultRequestSignerFactory) {
        this(
                builder()
                        .configuration(configuration)
                        .clientConfigurator(clientConfigurator)
                        .requestSignerFactory(defaultRequestSignerFactory),
                authenticationDetailsProvider);
    }

    /**
     * Create a new client instance.
     *
     * @param authenticationDetailsProvider The authentication details (see {@link Builder#build})
     * @param configuration {@link Builder#configuration}
     * @param clientConfigurator {@link Builder#clientConfigurator}
     * @param defaultRequestSignerFactory {@link Builder#requestSignerFactory}
     * @param additionalClientConfigurators {@link Builder#additionalClientConfigurators}
     * @deprecated Use the {@link #builder() builder} instead.
     */
    @Deprecated
    public LifecycleEnvironmentAsyncClient(
            com.oracle.bmc.auth.AbstractAuthenticationDetailsProvider authenticationDetailsProvider,
            com.oracle.bmc.ClientConfiguration configuration,
            com.oracle.bmc.http.ClientConfigurator clientConfigurator,
            com.oracle.bmc.http.signing.RequestSignerFactory defaultRequestSignerFactory,
            java.util.List<com.oracle.bmc.http.ClientConfigurator> additionalClientConfigurators) {
        this(
                builder()
                        .configuration(configuration)
                        .clientConfigurator(clientConfigurator)
                        .requestSignerFactory(defaultRequestSignerFactory)
                        .additionalClientConfigurators(additionalClientConfigurators),
                authenticationDetailsProvider);
    }

    /**
     * Create a new client instance.
     *
     * @param authenticationDetailsProvider The authentication details (see {@link Builder#build})
     * @param configuration {@link Builder#configuration}
     * @param clientConfigurator {@link Builder#clientConfigurator}
     * @param defaultRequestSignerFactory {@link Builder#requestSignerFactory}
     * @param additionalClientConfigurators {@link Builder#additionalClientConfigurators}
     * @param endpoint {@link Builder#endpoint}
     * @deprecated Use the {@link #builder() builder} instead.
     */
    @Deprecated
    public LifecycleEnvironmentAsyncClient(
            com.oracle.bmc.auth.AbstractAuthenticationDetailsProvider authenticationDetailsProvider,
            com.oracle.bmc.ClientConfiguration configuration,
            com.oracle.bmc.http.ClientConfigurator clientConfigurator,
            com.oracle.bmc.http.signing.RequestSignerFactory defaultRequestSignerFactory,
            java.util.List<com.oracle.bmc.http.ClientConfigurator> additionalClientConfigurators,
            String endpoint) {
        this(
                builder()
                        .configuration(configuration)
                        .clientConfigurator(clientConfigurator)
                        .requestSignerFactory(defaultRequestSignerFactory)
                        .additionalClientConfigurators(additionalClientConfigurators)
                        .endpoint(endpoint),
                authenticationDetailsProvider);
    }

    /**
     * Create a new client instance.
     *
     * @param authenticationDetailsProvider The authentication details (see {@link Builder#build})
     * @param configuration {@link Builder#configuration}
     * @param clientConfigurator {@link Builder#clientConfigurator}
     * @param defaultRequestSignerFactory {@link Builder#requestSignerFactory}
     * @param additionalClientConfigurators {@link Builder#additionalClientConfigurators}
     * @param endpoint {@link Builder#endpoint}
     * @param signingStrategyRequestSignerFactories {@link
     *     Builder#signingStrategyRequestSignerFactories}
     * @deprecated Use the {@link #builder() builder} instead.
     */
    @Deprecated
    public LifecycleEnvironmentAsyncClient(
            com.oracle.bmc.auth.AbstractAuthenticationDetailsProvider authenticationDetailsProvider,
            com.oracle.bmc.ClientConfiguration configuration,
            com.oracle.bmc.http.ClientConfigurator clientConfigurator,
            com.oracle.bmc.http.signing.RequestSignerFactory defaultRequestSignerFactory,
            java.util.Map<
                            com.oracle.bmc.http.signing.SigningStrategy,
                            com.oracle.bmc.http.signing.RequestSignerFactory>
                    signingStrategyRequestSignerFactories,
            java.util.List<com.oracle.bmc.http.ClientConfigurator> additionalClientConfigurators,
            String endpoint) {
        this(
                builder()
                        .configuration(configuration)
                        .clientConfigurator(clientConfigurator)
                        .requestSignerFactory(defaultRequestSignerFactory)
                        .additionalClientConfigurators(additionalClientConfigurators)
                        .endpoint(endpoint)
                        .signingStrategyRequestSignerFactories(
                                signingStrategyRequestSignerFactories),
                authenticationDetailsProvider);
    }
}

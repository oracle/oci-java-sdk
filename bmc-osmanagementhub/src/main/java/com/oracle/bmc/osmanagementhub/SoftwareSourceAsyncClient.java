/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.osmanagementhub;

import com.oracle.bmc.util.internal.Validate;
import com.oracle.bmc.osmanagementhub.requests.*;
import com.oracle.bmc.osmanagementhub.responses.*;

import java.util.Objects;

/**
 * Async client implementation for SoftwareSource service. <br>
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
public class SoftwareSourceAsyncClient extends com.oracle.bmc.http.internal.BaseAsyncClient
        implements SoftwareSourceAsync {
    /** Service instance for SoftwareSource. */
    public static final com.oracle.bmc.Service SERVICE =
            com.oracle.bmc.Services.serviceBuilder()
                    .serviceName(SoftwareSourceClient.class.getName())
                    .serviceEndpointPrefix("")
                    .serviceEndpointTemplate("https://osmh.{region}.oci.{secondLevelDomain}")
                    .build();

    private static final org.slf4j.Logger LOG =
            org.slf4j.LoggerFactory.getLogger(SoftwareSourceAsyncClient.class);

    SoftwareSourceAsyncClient(
            com.oracle.bmc.common.ClientBuilderBase<?, ?> builder,
            com.oracle.bmc.auth.AbstractAuthenticationDetailsProvider
                    authenticationDetailsProvider) {
        this(builder, authenticationDetailsProvider, true);
    }

    SoftwareSourceAsyncClient(
            com.oracle.bmc.common.ClientBuilderBase<?, ?> builder,
            com.oracle.bmc.auth.AbstractAuthenticationDetailsProvider authenticationDetailsProvider,
            boolean isStreamWarningEnabled) {
        super(builder, authenticationDetailsProvider);

        if (isStreamWarningEnabled && com.oracle.bmc.util.StreamUtils.isExtraStreamLogsEnabled()) {
            LOG.warn(
                    com.oracle.bmc.util.StreamUtils.getStreamWarningMessage(
                            "SoftwareSourceAsyncClient", "getSoftwareSourceManifest"));
        }
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
                    Builder, SoftwareSourceAsyncClient> {
        private boolean isStreamWarningEnabled = true;

        private Builder(com.oracle.bmc.Service service) {
            super(service);
            final String packageName = "osmanagementhub";
            com.oracle.bmc.internal.Alloy.throwDisabledServiceExceptionIfAppropriate(packageName);
            requestSignerFactory =
                    new com.oracle.bmc.http.signing.internal.DefaultRequestSignerFactory(
                            com.oracle.bmc.http.signing.SigningStrategy.STANDARD);
        }

        /**
         * Enable/disable the stream warnings for the client
         *
         * @param isStreamWarningEnabled executorService
         * @return this builder
         */
        public Builder isStreamWarningEnabled(boolean isStreamWarningEnabled) {
            this.isStreamWarningEnabled = isStreamWarningEnabled;
            return this;
        }

        /**
         * Build the client.
         *
         * @param authenticationDetailsProvider authentication details provider
         * @return the client
         */
        public SoftwareSourceAsyncClient build(
                @jakarta.annotation.Nonnull
                        com.oracle.bmc.auth.AbstractAuthenticationDetailsProvider
                                authenticationDetailsProvider) {
            return new SoftwareSourceAsyncClient(
                    this, authenticationDetailsProvider, isStreamWarningEnabled);
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
    public java.util.concurrent.Future<AddPackagesToSoftwareSourceResponse>
            addPackagesToSoftwareSource(
                    AddPackagesToSoftwareSourceRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    AddPackagesToSoftwareSourceRequest,
                                    AddPackagesToSoftwareSourceResponse>
                            handler) {

        Validate.notBlank(request.getSoftwareSourceId(), "softwareSourceId must not be blank");
        Objects.requireNonNull(
                request.getAddPackagesToSoftwareSourceDetails(),
                "addPackagesToSoftwareSourceDetails is required");

        return clientCall(request, AddPackagesToSoftwareSourceResponse::builder)
                .logger(LOG, "addPackagesToSoftwareSource")
                .serviceDetails(
                        "SoftwareSource",
                        "AddPackagesToSoftwareSource",
                        "https://docs.oracle.com/iaas/api/#/en/osmh/20220901/SoftwareSource/AddPackagesToSoftwareSource")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(AddPackagesToSoftwareSourceRequest::builder)
                .basePath("/20220901")
                .appendPathParam("softwareSources")
                .appendPathParam(request.getSoftwareSourceId())
                .appendPathParam("actions")
                .appendPathParam("addPackages")
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-request-id", AddPackagesToSoftwareSourceResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        AddPackagesToSoftwareSourceResponse.Builder::opcWorkRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ChangeAvailabilityOfSoftwareSourcesResponse>
            changeAvailabilityOfSoftwareSources(
                    ChangeAvailabilityOfSoftwareSourcesRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ChangeAvailabilityOfSoftwareSourcesRequest,
                                    ChangeAvailabilityOfSoftwareSourcesResponse>
                            handler) {
        Objects.requireNonNull(
                request.getChangeAvailabilityOfSoftwareSourcesDetails(),
                "changeAvailabilityOfSoftwareSourcesDetails is required");

        return clientCall(request, ChangeAvailabilityOfSoftwareSourcesResponse::builder)
                .logger(LOG, "changeAvailabilityOfSoftwareSources")
                .serviceDetails(
                        "SoftwareSource",
                        "ChangeAvailabilityOfSoftwareSources",
                        "https://docs.oracle.com/iaas/api/#/en/osmh/20220901/SoftwareSource/ChangeAvailabilityOfSoftwareSources")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(ChangeAvailabilityOfSoftwareSourcesRequest::builder)
                .basePath("/20220901")
                .appendPathParam("softwareSources")
                .appendPathParam("actions")
                .appendPathParam("changeAvailability")
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-request-id",
                        ChangeAvailabilityOfSoftwareSourcesResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ChangeSoftwareSourceCompartmentResponse>
            changeSoftwareSourceCompartment(
                    ChangeSoftwareSourceCompartmentRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ChangeSoftwareSourceCompartmentRequest,
                                    ChangeSoftwareSourceCompartmentResponse>
                            handler) {

        Validate.notBlank(request.getSoftwareSourceId(), "softwareSourceId must not be blank");
        Objects.requireNonNull(
                request.getChangeSoftwareSourceCompartmentDetails(),
                "changeSoftwareSourceCompartmentDetails is required");

        return clientCall(request, ChangeSoftwareSourceCompartmentResponse::builder)
                .logger(LOG, "changeSoftwareSourceCompartment")
                .serviceDetails(
                        "SoftwareSource",
                        "ChangeSoftwareSourceCompartment",
                        "https://docs.oracle.com/iaas/api/#/en/osmh/20220901/SoftwareSource/ChangeSoftwareSourceCompartment")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(ChangeSoftwareSourceCompartmentRequest::builder)
                .basePath("/20220901")
                .appendPathParam("softwareSources")
                .appendPathParam(request.getSoftwareSourceId())
                .appendPathParam("actions")
                .appendPathParam("changeCompartment")
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-request-id",
                        ChangeSoftwareSourceCompartmentResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<CreateEntitlementResponse> createEntitlement(
            CreateEntitlementRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            CreateEntitlementRequest, CreateEntitlementResponse>
                    handler) {
        Objects.requireNonNull(
                request.getCreateEntitlementDetails(), "createEntitlementDetails is required");

        return clientCall(request, CreateEntitlementResponse::builder)
                .logger(LOG, "createEntitlement")
                .serviceDetails(
                        "SoftwareSource",
                        "CreateEntitlement",
                        "https://docs.oracle.com/iaas/api/#/en/osmh/20220901/SoftwareSource/CreateEntitlement")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CreateEntitlementRequest::builder)
                .basePath("/20220901")
                .appendPathParam("entitlements")
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-request-id", CreateEntitlementResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<CreateSoftwareSourceResponse> createSoftwareSource(
            CreateSoftwareSourceRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            CreateSoftwareSourceRequest, CreateSoftwareSourceResponse>
                    handler) {
        Objects.requireNonNull(
                request.getCreateSoftwareSourceDetails(),
                "createSoftwareSourceDetails is required");

        return clientCall(request, CreateSoftwareSourceResponse::builder)
                .logger(LOG, "createSoftwareSource")
                .serviceDetails(
                        "SoftwareSource",
                        "CreateSoftwareSource",
                        "https://docs.oracle.com/iaas/api/#/en/osmh/20220901/SoftwareSource/CreateSoftwareSource")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CreateSoftwareSourceRequest::builder)
                .basePath("/20220901")
                .appendPathParam("softwareSources")
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.osmanagementhub.model.SoftwareSource.class,
                        CreateSoftwareSourceResponse.Builder::softwareSource)
                .handleResponseHeaderString("etag", CreateSoftwareSourceResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", CreateSoftwareSourceResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "location", CreateSoftwareSourceResponse.Builder::location)
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        CreateSoftwareSourceResponse.Builder::opcWorkRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<DeleteSoftwareSourceResponse> deleteSoftwareSource(
            DeleteSoftwareSourceRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            DeleteSoftwareSourceRequest, DeleteSoftwareSourceResponse>
                    handler) {

        Validate.notBlank(request.getSoftwareSourceId(), "softwareSourceId must not be blank");

        return clientCall(request, DeleteSoftwareSourceResponse::builder)
                .logger(LOG, "deleteSoftwareSource")
                .serviceDetails(
                        "SoftwareSource",
                        "DeleteSoftwareSource",
                        "https://docs.oracle.com/iaas/api/#/en/osmh/20220901/SoftwareSource/DeleteSoftwareSource")
                .method(com.oracle.bmc.http.client.Method.DELETE)
                .requestBuilder(DeleteSoftwareSourceRequest::builder)
                .basePath("/20220901")
                .appendPathParam("softwareSources")
                .appendPathParam(request.getSoftwareSourceId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("if-match", request.getIfMatch())
                .handleResponseHeaderString(
                        "opc-request-id", DeleteSoftwareSourceResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<GetErratumResponse> getErratum(
            GetErratumRequest request,
            final com.oracle.bmc.responses.AsyncHandler<GetErratumRequest, GetErratumResponse>
                    handler) {
        Objects.requireNonNull(request.getCompartmentId(), "compartmentId is required");

        Validate.notBlank(request.getName(), "name must not be blank");

        return clientCall(request, GetErratumResponse::builder)
                .logger(LOG, "getErratum")
                .serviceDetails(
                        "SoftwareSource",
                        "GetErratum",
                        "https://docs.oracle.com/iaas/api/#/en/osmh/20220901/Erratum/GetErratum")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetErratumRequest::builder)
                .basePath("/20220901")
                .appendPathParam("errata")
                .appendPathParam(request.getName())
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.osmanagementhub.model.Erratum.class,
                        GetErratumResponse.Builder::erratum)
                .handleResponseHeaderString(
                        "opc-request-id", GetErratumResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<GetModuleStreamResponse> getModuleStream(
            GetModuleStreamRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetModuleStreamRequest, GetModuleStreamResponse>
                    handler) {

        Validate.notBlank(request.getSoftwareSourceId(), "softwareSourceId must not be blank");

        Validate.notBlank(request.getModuleName(), "moduleName must not be blank");
        Objects.requireNonNull(request.getStreamName(), "streamName is required");

        return clientCall(request, GetModuleStreamResponse::builder)
                .logger(LOG, "getModuleStream")
                .serviceDetails(
                        "SoftwareSource",
                        "GetModuleStream",
                        "https://docs.oracle.com/iaas/api/#/en/osmh/20220901/ModuleStream/GetModuleStream")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetModuleStreamRequest::builder)
                .basePath("/20220901")
                .appendPathParam("softwareSources")
                .appendPathParam(request.getSoftwareSourceId())
                .appendPathParam("moduleStreams")
                .appendPathParam(request.getModuleName())
                .appendQueryParam("streamName", request.getStreamName())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.osmanagementhub.model.ModuleStream.class,
                        GetModuleStreamResponse.Builder::moduleStream)
                .handleResponseHeaderString(
                        "opc-request-id", GetModuleStreamResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<GetModuleStreamProfileResponse> getModuleStreamProfile(
            GetModuleStreamProfileRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetModuleStreamProfileRequest, GetModuleStreamProfileResponse>
                    handler) {

        Validate.notBlank(request.getSoftwareSourceId(), "softwareSourceId must not be blank");

        Validate.notBlank(request.getProfileName(), "profileName must not be blank");
        Objects.requireNonNull(request.getModuleName(), "moduleName is required");

        Objects.requireNonNull(request.getStreamName(), "streamName is required");

        return clientCall(request, GetModuleStreamProfileResponse::builder)
                .logger(LOG, "getModuleStreamProfile")
                .serviceDetails(
                        "SoftwareSource",
                        "GetModuleStreamProfile",
                        "https://docs.oracle.com/iaas/api/#/en/osmh/20220901/ModuleStreamProfile/GetModuleStreamProfile")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetModuleStreamProfileRequest::builder)
                .basePath("/20220901")
                .appendPathParam("softwareSources")
                .appendPathParam(request.getSoftwareSourceId())
                .appendPathParam("moduleStreamProfiles")
                .appendPathParam(request.getProfileName())
                .appendQueryParam("moduleName", request.getModuleName())
                .appendQueryParam("streamName", request.getStreamName())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.osmanagementhub.model.ModuleStreamProfile.class,
                        GetModuleStreamProfileResponse.Builder::moduleStreamProfile)
                .handleResponseHeaderString(
                        "opc-request-id", GetModuleStreamProfileResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<GetPackageGroupResponse> getPackageGroup(
            GetPackageGroupRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetPackageGroupRequest, GetPackageGroupResponse>
                    handler) {

        Validate.notBlank(request.getSoftwareSourceId(), "softwareSourceId must not be blank");

        Validate.notBlank(request.getPackageGroupId(), "packageGroupId must not be blank");

        return clientCall(request, GetPackageGroupResponse::builder)
                .logger(LOG, "getPackageGroup")
                .serviceDetails(
                        "SoftwareSource",
                        "GetPackageGroup",
                        "https://docs.oracle.com/iaas/api/#/en/osmh/20220901/PackageGroup/GetPackageGroup")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetPackageGroupRequest::builder)
                .basePath("/20220901")
                .appendPathParam("softwareSources")
                .appendPathParam(request.getSoftwareSourceId())
                .appendPathParam("packageGroups")
                .appendPathParam(request.getPackageGroupId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.osmanagementhub.model.PackageGroup.class,
                        GetPackageGroupResponse.Builder::packageGroup)
                .handleResponseHeaderString(
                        "opc-request-id", GetPackageGroupResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<GetSoftwarePackageResponse> getSoftwarePackage(
            GetSoftwarePackageRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetSoftwarePackageRequest, GetSoftwarePackageResponse>
                    handler) {

        Validate.notBlank(request.getSoftwareSourceId(), "softwareSourceId must not be blank");

        Validate.notBlank(
                request.getSoftwarePackageName(), "softwarePackageName must not be blank");

        return clientCall(request, GetSoftwarePackageResponse::builder)
                .logger(LOG, "getSoftwarePackage")
                .serviceDetails(
                        "SoftwareSource",
                        "GetSoftwarePackage",
                        "https://docs.oracle.com/iaas/api/#/en/osmh/20220901/SoftwareSource/GetSoftwarePackage")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetSoftwarePackageRequest::builder)
                .basePath("/20220901")
                .appendPathParam("softwareSources")
                .appendPathParam(request.getSoftwareSourceId())
                .appendPathParam("softwarePackages")
                .appendPathParam(request.getSoftwarePackageName())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.osmanagementhub.model.SoftwarePackage.class,
                        GetSoftwarePackageResponse.Builder::softwarePackage)
                .handleResponseHeaderString(
                        "opc-request-id", GetSoftwarePackageResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<GetSoftwarePackageByNameResponse> getSoftwarePackageByName(
            GetSoftwarePackageByNameRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetSoftwarePackageByNameRequest, GetSoftwarePackageByNameResponse>
                    handler) {

        Validate.notBlank(
                request.getSoftwarePackageName(), "softwarePackageName must not be blank");

        return clientCall(request, GetSoftwarePackageByNameResponse::builder)
                .logger(LOG, "getSoftwarePackageByName")
                .serviceDetails(
                        "SoftwareSource",
                        "GetSoftwarePackageByName",
                        "https://docs.oracle.com/iaas/api/#/en/osmh/20220901/SoftwareSource/GetSoftwarePackageByName")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetSoftwarePackageByNameRequest::builder)
                .basePath("/20220901")
                .appendPathParam("softwarePackages")
                .appendPathParam(request.getSoftwarePackageName())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.osmanagementhub.model.SoftwarePackage.class,
                        GetSoftwarePackageByNameResponse.Builder::softwarePackage)
                .handleResponseHeaderString(
                        "opc-request-id", GetSoftwarePackageByNameResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<GetSoftwareSourceResponse> getSoftwareSource(
            GetSoftwareSourceRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetSoftwareSourceRequest, GetSoftwareSourceResponse>
                    handler) {

        Validate.notBlank(request.getSoftwareSourceId(), "softwareSourceId must not be blank");

        return clientCall(request, GetSoftwareSourceResponse::builder)
                .logger(LOG, "getSoftwareSource")
                .serviceDetails(
                        "SoftwareSource",
                        "GetSoftwareSource",
                        "https://docs.oracle.com/iaas/api/#/en/osmh/20220901/SoftwareSource/GetSoftwareSource")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetSoftwareSourceRequest::builder)
                .basePath("/20220901")
                .appendPathParam("softwareSources")
                .appendPathParam(request.getSoftwareSourceId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.osmanagementhub.model.SoftwareSource.class,
                        GetSoftwareSourceResponse.Builder::softwareSource)
                .handleResponseHeaderString("etag", GetSoftwareSourceResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", GetSoftwareSourceResponse.Builder::opcRequestId)
                .handleResponseHeaderInteger(
                        "retry-after", GetSoftwareSourceResponse.Builder::retryAfter)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<GetSoftwareSourceManifestResponse> getSoftwareSourceManifest(
            GetSoftwareSourceManifestRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetSoftwareSourceManifestRequest, GetSoftwareSourceManifestResponse>
                    handler) {

        Validate.notBlank(request.getSoftwareSourceId(), "softwareSourceId must not be blank");

        return clientCall(request, GetSoftwareSourceManifestResponse::builder)
                .logger(LOG, "getSoftwareSourceManifest")
                .serviceDetails(
                        "SoftwareSource",
                        "GetSoftwareSourceManifest",
                        "https://docs.oracle.com/iaas/api/#/en/osmh/20220901/SoftwareSource/GetSoftwareSourceManifest")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetSoftwareSourceManifestRequest::builder)
                .basePath("/20220901")
                .appendPathParam("softwareSources")
                .appendPathParam(request.getSoftwareSourceId())
                .appendPathParam("manifest")
                .accept("application/octet-stream")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        java.io.InputStream.class,
                        GetSoftwareSourceManifestResponse.Builder::inputStream)
                .handleResponseHeaderString("etag", GetSoftwareSourceManifestResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", GetSoftwareSourceManifestResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListAllSoftwarePackagesResponse> listAllSoftwarePackages(
            ListAllSoftwarePackagesRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListAllSoftwarePackagesRequest, ListAllSoftwarePackagesResponse>
                    handler) {

        return clientCall(request, ListAllSoftwarePackagesResponse::builder)
                .logger(LOG, "listAllSoftwarePackages")
                .serviceDetails(
                        "SoftwareSource",
                        "ListAllSoftwarePackages",
                        "https://docs.oracle.com/iaas/api/#/en/osmh/20220901/SoftwareSource/ListAllSoftwarePackages")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListAllSoftwarePackagesRequest::builder)
                .basePath("/20220901")
                .appendPathParam("softwarePackages")
                .appendQueryParam("displayName", request.getDisplayName())
                .appendQueryParam("displayNameContains", request.getDisplayNameContains())
                .appendQueryParam("version", request.getVersion())
                .appendEnumQueryParam("architecture", request.getArchitecture())
                .appendQueryParam("isLatest", request.getIsLatest())
                .appendEnumQueryParam("osFamily", request.getOsFamily())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.osmanagementhub.model.SoftwarePackageCollection.class,
                        ListAllSoftwarePackagesResponse.Builder::softwarePackageCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListAllSoftwarePackagesResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListAllSoftwarePackagesResponse.Builder::opcNextPage)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListAvailableSoftwarePackagesResponse>
            listAvailableSoftwarePackages(
                    ListAvailableSoftwarePackagesRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ListAvailableSoftwarePackagesRequest,
                                    ListAvailableSoftwarePackagesResponse>
                            handler) {

        Validate.notBlank(request.getSoftwareSourceId(), "softwareSourceId must not be blank");

        return clientCall(request, ListAvailableSoftwarePackagesResponse::builder)
                .logger(LOG, "listAvailableSoftwarePackages")
                .serviceDetails(
                        "SoftwareSource",
                        "ListAvailableSoftwarePackages",
                        "https://docs.oracle.com/iaas/api/#/en/osmh/20220901/SoftwareSource/ListAvailableSoftwarePackages")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListAvailableSoftwarePackagesRequest::builder)
                .basePath("/20220901")
                .appendPathParam("softwareSources")
                .appendPathParam(request.getSoftwareSourceId())
                .appendPathParam("availableSoftwarePackages")
                .appendQueryParam("displayName", request.getDisplayName())
                .appendQueryParam("displayNameContains", request.getDisplayNameContains())
                .appendQueryParam("isLatest", request.getIsLatest())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.osmanagementhub.model.SoftwarePackageCollection.class,
                        ListAvailableSoftwarePackagesResponse.Builder::softwarePackageCollection)
                .handleResponseHeaderString(
                        "opc-request-id",
                        ListAvailableSoftwarePackagesResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListAvailableSoftwarePackagesResponse.Builder::opcNextPage)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListEntitlementsResponse> listEntitlements(
            ListEntitlementsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListEntitlementsRequest, ListEntitlementsResponse>
                    handler) {
        Objects.requireNonNull(request.getCompartmentId(), "compartmentId is required");

        return clientCall(request, ListEntitlementsResponse::builder)
                .logger(LOG, "listEntitlements")
                .serviceDetails(
                        "SoftwareSource",
                        "ListEntitlements",
                        "https://docs.oracle.com/iaas/api/#/en/osmh/20220901/SoftwareSource/ListEntitlements")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListEntitlementsRequest::builder)
                .basePath("/20220901")
                .appendPathParam("entitlements")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendQueryParam("csi", request.getCsi())
                .appendEnumQueryParam("vendorName", request.getVendorName())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.osmanagementhub.model.EntitlementCollection.class,
                        ListEntitlementsResponse.Builder::entitlementCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListEntitlementsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListEntitlementsResponse.Builder::opcNextPage)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListErrataResponse> listErrata(
            ListErrataRequest request,
            final com.oracle.bmc.responses.AsyncHandler<ListErrataRequest, ListErrataResponse>
                    handler) {
        Objects.requireNonNull(request.getCompartmentId(), "compartmentId is required");

        return clientCall(request, ListErrataResponse::builder)
                .logger(LOG, "listErrata")
                .serviceDetails(
                        "SoftwareSource",
                        "ListErrata",
                        "https://docs.oracle.com/iaas/api/#/en/osmh/20220901/Erratum/ListErrata")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListErrataRequest::builder)
                .basePath("/20220901")
                .appendPathParam("errata")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendListQueryParam(
                        "name",
                        request.getName(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .appendQueryParam("nameContains", request.getNameContains())
                .appendListQueryParam(
                        "classificationType",
                        request.getClassificationType(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .appendListQueryParam(
                        "advisoryType",
                        request.getAdvisoryType(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .appendEnumQueryParam("osFamily", request.getOsFamily())
                .appendListQueryParam(
                        "advisorySeverity",
                        request.getAdvisorySeverity(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .appendQueryParam("timeIssueDateStart", request.getTimeIssueDateStart())
                .appendQueryParam("timeIssueDateEnd", request.getTimeIssueDateEnd())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.osmanagementhub.model.ErratumCollection.class,
                        ListErrataResponse.Builder::erratumCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListErrataResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListErrataResponse.Builder::opcNextPage)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListModuleStreamProfilesResponse> listModuleStreamProfiles(
            ListModuleStreamProfilesRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListModuleStreamProfilesRequest, ListModuleStreamProfilesResponse>
                    handler) {

        Validate.notBlank(request.getSoftwareSourceId(), "softwareSourceId must not be blank");

        return clientCall(request, ListModuleStreamProfilesResponse::builder)
                .logger(LOG, "listModuleStreamProfiles")
                .serviceDetails(
                        "SoftwareSource",
                        "ListModuleStreamProfiles",
                        "https://docs.oracle.com/iaas/api/#/en/osmh/20220901/SoftwareSource/ListModuleStreamProfiles")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListModuleStreamProfilesRequest::builder)
                .basePath("/20220901")
                .appendPathParam("softwareSources")
                .appendPathParam(request.getSoftwareSourceId())
                .appendPathParam("moduleStreamProfiles")
                .appendQueryParam("moduleName", request.getModuleName())
                .appendQueryParam("streamName", request.getStreamName())
                .appendQueryParam("name", request.getName())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.osmanagementhub.model.ModuleStreamProfileCollection.class,
                        ListModuleStreamProfilesResponse.Builder::moduleStreamProfileCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListModuleStreamProfilesResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListModuleStreamProfilesResponse.Builder::opcNextPage)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListModuleStreamsResponse> listModuleStreams(
            ListModuleStreamsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListModuleStreamsRequest, ListModuleStreamsResponse>
                    handler) {

        Validate.notBlank(request.getSoftwareSourceId(), "softwareSourceId must not be blank");

        return clientCall(request, ListModuleStreamsResponse::builder)
                .logger(LOG, "listModuleStreams")
                .serviceDetails(
                        "SoftwareSource",
                        "ListModuleStreams",
                        "https://docs.oracle.com/iaas/api/#/en/osmh/20220901/SoftwareSource/ListModuleStreams")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListModuleStreamsRequest::builder)
                .basePath("/20220901")
                .appendPathParam("softwareSources")
                .appendPathParam(request.getSoftwareSourceId())
                .appendPathParam("moduleStreams")
                .appendQueryParam("moduleName", request.getModuleName())
                .appendQueryParam("name", request.getName())
                .appendQueryParam("isLatest", request.getIsLatest())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .appendQueryParam("moduleNameContains", request.getModuleNameContains())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.osmanagementhub.model.ModuleStreamCollection.class,
                        ListModuleStreamsResponse.Builder::moduleStreamCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListModuleStreamsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListModuleStreamsResponse.Builder::opcNextPage)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListPackageGroupsResponse> listPackageGroups(
            ListPackageGroupsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListPackageGroupsRequest, ListPackageGroupsResponse>
                    handler) {

        Validate.notBlank(request.getSoftwareSourceId(), "softwareSourceId must not be blank");

        return clientCall(request, ListPackageGroupsResponse::builder)
                .logger(LOG, "listPackageGroups")
                .serviceDetails(
                        "SoftwareSource",
                        "ListPackageGroups",
                        "https://docs.oracle.com/iaas/api/#/en/osmh/20220901/SoftwareSource/ListPackageGroups")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListPackageGroupsRequest::builder)
                .basePath("/20220901")
                .appendPathParam("softwareSources")
                .appendPathParam(request.getSoftwareSourceId())
                .appendPathParam("packageGroups")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendQueryParam("name", request.getName())
                .appendQueryParam("nameContains", request.getNameContains())
                .appendListQueryParam(
                        "groupType",
                        request.getGroupType(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.osmanagementhub.model.PackageGroupCollection.class,
                        ListPackageGroupsResponse.Builder::packageGroupCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListPackageGroupsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListPackageGroupsResponse.Builder::opcNextPage)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListSoftwarePackageSoftwareSourcesResponse>
            listSoftwarePackageSoftwareSources(
                    ListSoftwarePackageSoftwareSourcesRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ListSoftwarePackageSoftwareSourcesRequest,
                                    ListSoftwarePackageSoftwareSourcesResponse>
                            handler) {

        Validate.notBlank(
                request.getSoftwarePackageName(), "softwarePackageName must not be blank");
        Objects.requireNonNull(request.getCompartmentId(), "compartmentId is required");

        return clientCall(request, ListSoftwarePackageSoftwareSourcesResponse::builder)
                .logger(LOG, "listSoftwarePackageSoftwareSources")
                .serviceDetails(
                        "SoftwareSource",
                        "ListSoftwarePackageSoftwareSources",
                        "https://docs.oracle.com/iaas/api/#/en/osmh/20220901/SoftwareSource/ListSoftwarePackageSoftwareSources")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListSoftwarePackageSoftwareSourcesRequest::builder)
                .basePath("/20220901")
                .appendPathParam("softwarePackages")
                .appendPathParam(request.getSoftwarePackageName())
                .appendPathParam("softwareSources")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendListQueryParam(
                        "softwareSourceType",
                        request.getSoftwareSourceType(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .appendListQueryParam(
                        "osFamily",
                        request.getOsFamily(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .appendListQueryParam(
                        "archType",
                        request.getArchType(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .appendListQueryParam(
                        "availability",
                        request.getAvailability(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .appendListQueryParam(
                        "availabilityAtOci",
                        request.getAvailabilityAtOci(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .appendListQueryParam(
                        "availabilityAnywhere",
                        request.getAvailabilityAnywhere(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .appendQueryParam("displayName", request.getDisplayName())
                .appendQueryParam("displayNameContains", request.getDisplayNameContains())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .appendListQueryParam(
                        "lifecycleState",
                        request.getLifecycleState(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.osmanagementhub.model.SoftwareSourceCollection.class,
                        ListSoftwarePackageSoftwareSourcesResponse.Builder
                                ::softwareSourceCollection)
                .handleResponseHeaderString(
                        "opc-request-id",
                        ListSoftwarePackageSoftwareSourcesResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page",
                        ListSoftwarePackageSoftwareSourcesResponse.Builder::opcNextPage)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListSoftwarePackagesResponse> listSoftwarePackages(
            ListSoftwarePackagesRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListSoftwarePackagesRequest, ListSoftwarePackagesResponse>
                    handler) {

        Validate.notBlank(request.getSoftwareSourceId(), "softwareSourceId must not be blank");

        return clientCall(request, ListSoftwarePackagesResponse::builder)
                .logger(LOG, "listSoftwarePackages")
                .serviceDetails(
                        "SoftwareSource",
                        "ListSoftwarePackages",
                        "https://docs.oracle.com/iaas/api/#/en/osmh/20220901/SoftwareSource/ListSoftwarePackages")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListSoftwarePackagesRequest::builder)
                .basePath("/20220901")
                .appendPathParam("softwareSources")
                .appendPathParam(request.getSoftwareSourceId())
                .appendPathParam("softwarePackages")
                .appendQueryParam("displayName", request.getDisplayName())
                .appendQueryParam("displayNameContains", request.getDisplayNameContains())
                .appendQueryParam("isLatest", request.getIsLatest())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.osmanagementhub.model.SoftwarePackageCollection.class,
                        ListSoftwarePackagesResponse.Builder::softwarePackageCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListSoftwarePackagesResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListSoftwarePackagesResponse.Builder::opcNextPage)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListSoftwareSourceVendorsResponse> listSoftwareSourceVendors(
            ListSoftwareSourceVendorsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListSoftwareSourceVendorsRequest, ListSoftwareSourceVendorsResponse>
                    handler) {
        Objects.requireNonNull(request.getCompartmentId(), "compartmentId is required");

        return clientCall(request, ListSoftwareSourceVendorsResponse::builder)
                .logger(LOG, "listSoftwareSourceVendors")
                .serviceDetails(
                        "SoftwareSource",
                        "ListSoftwareSourceVendors",
                        "https://docs.oracle.com/iaas/api/#/en/osmh/20220901/SoftwareSource/ListSoftwareSourceVendors")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListSoftwareSourceVendorsRequest::builder)
                .basePath("/20220901")
                .appendPathParam("softwareSourceVendors")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .appendQueryParam("name", request.getName())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.osmanagementhub.model.SoftwareSourceVendorCollection.class,
                        ListSoftwareSourceVendorsResponse.Builder::softwareSourceVendorCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListSoftwareSourceVendorsResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListSoftwareSourcesResponse> listSoftwareSources(
            ListSoftwareSourcesRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListSoftwareSourcesRequest, ListSoftwareSourcesResponse>
                    handler) {

        return clientCall(request, ListSoftwareSourcesResponse::builder)
                .logger(LOG, "listSoftwareSources")
                .serviceDetails(
                        "SoftwareSource",
                        "ListSoftwareSources",
                        "https://docs.oracle.com/iaas/api/#/en/osmh/20220901/SoftwareSource/ListSoftwareSources")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListSoftwareSourcesRequest::builder)
                .basePath("/20220901")
                .appendPathParam("softwareSources")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendQueryParam("softwareSourceId", request.getSoftwareSourceId())
                .appendListQueryParam(
                        "softwareSourceType",
                        request.getSoftwareSourceType(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .appendEnumQueryParam("vendorName", request.getVendorName())
                .appendListQueryParam(
                        "osFamily",
                        request.getOsFamily(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .appendListQueryParam(
                        "archType",
                        request.getArchType(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .appendListQueryParam(
                        "availability",
                        request.getAvailability(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .appendListQueryParam(
                        "availabilityAtOci",
                        request.getAvailabilityAtOci(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .appendListQueryParam(
                        "availabilityAnywhere",
                        request.getAvailabilityAnywhere(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .appendQueryParam(
                        "isMandatoryForAutonomousLinux", request.getIsMandatoryForAutonomousLinux())
                .appendQueryParam("isMirrorSyncAllowed", request.getIsMirrorSyncAllowed())
                .appendQueryParam("displayName", request.getDisplayName())
                .appendQueryParam("displayNameContains", request.getDisplayNameContains())
                .appendListQueryParam(
                        "displayNameNotEqualTo",
                        request.getDisplayNameNotEqualTo(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .appendListQueryParam(
                        "lifecycleState",
                        request.getLifecycleState(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.osmanagementhub.model.SoftwareSourceCollection.class,
                        ListSoftwareSourcesResponse.Builder::softwareSourceCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListSoftwareSourcesResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListSoftwareSourcesResponse.Builder::opcNextPage)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<RemovePackagesFromSoftwareSourceResponse>
            removePackagesFromSoftwareSource(
                    RemovePackagesFromSoftwareSourceRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    RemovePackagesFromSoftwareSourceRequest,
                                    RemovePackagesFromSoftwareSourceResponse>
                            handler) {

        Validate.notBlank(request.getSoftwareSourceId(), "softwareSourceId must not be blank");
        Objects.requireNonNull(
                request.getRemovePackagesFromSoftwareSourceDetails(),
                "removePackagesFromSoftwareSourceDetails is required");

        return clientCall(request, RemovePackagesFromSoftwareSourceResponse::builder)
                .logger(LOG, "removePackagesFromSoftwareSource")
                .serviceDetails(
                        "SoftwareSource",
                        "RemovePackagesFromSoftwareSource",
                        "https://docs.oracle.com/iaas/api/#/en/osmh/20220901/SoftwareSource/RemovePackagesFromSoftwareSource")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(RemovePackagesFromSoftwareSourceRequest::builder)
                .basePath("/20220901")
                .appendPathParam("softwareSources")
                .appendPathParam(request.getSoftwareSourceId())
                .appendPathParam("actions")
                .appendPathParam("removePackages")
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-request-id",
                        RemovePackagesFromSoftwareSourceResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        RemovePackagesFromSoftwareSourceResponse.Builder::opcWorkRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ReplacePackagesInSoftwareSourceResponse>
            replacePackagesInSoftwareSource(
                    ReplacePackagesInSoftwareSourceRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ReplacePackagesInSoftwareSourceRequest,
                                    ReplacePackagesInSoftwareSourceResponse>
                            handler) {

        Validate.notBlank(request.getSoftwareSourceId(), "softwareSourceId must not be blank");
        Objects.requireNonNull(
                request.getReplacePackagesInSoftwareSourceDetails(),
                "replacePackagesInSoftwareSourceDetails is required");

        return clientCall(request, ReplacePackagesInSoftwareSourceResponse::builder)
                .logger(LOG, "replacePackagesInSoftwareSource")
                .serviceDetails(
                        "SoftwareSource",
                        "ReplacePackagesInSoftwareSource",
                        "https://docs.oracle.com/iaas/api/#/en/osmh/20220901/SoftwareSource/ReplacePackagesInSoftwareSource")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(ReplacePackagesInSoftwareSourceRequest::builder)
                .basePath("/20220901")
                .appendPathParam("softwareSources")
                .appendPathParam(request.getSoftwareSourceId())
                .appendPathParam("actions")
                .appendPathParam("replacePackages")
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-request-id",
                        ReplacePackagesInSoftwareSourceResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        ReplacePackagesInSoftwareSourceResponse.Builder::opcWorkRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<SearchSoftwareSourceModuleStreamsResponse>
            searchSoftwareSourceModuleStreams(
                    SearchSoftwareSourceModuleStreamsRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    SearchSoftwareSourceModuleStreamsRequest,
                                    SearchSoftwareSourceModuleStreamsResponse>
                            handler) {
        Objects.requireNonNull(
                request.getSearchSoftwareSourceModuleStreamsDetails(),
                "searchSoftwareSourceModuleStreamsDetails is required");

        return clientCall(request, SearchSoftwareSourceModuleStreamsResponse::builder)
                .logger(LOG, "searchSoftwareSourceModuleStreams")
                .serviceDetails(
                        "SoftwareSource",
                        "SearchSoftwareSourceModuleStreams",
                        "https://docs.oracle.com/iaas/api/#/en/osmh/20220901/SoftwareSource/SearchSoftwareSourceModuleStreams")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(SearchSoftwareSourceModuleStreamsRequest::builder)
                .basePath("/20220901")
                .appendPathParam("softwareSourceModuleStreams")
                .appendPathParam("actions")
                .appendPathParam("search")
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.osmanagementhub.model.ModuleStreamCollection.class,
                        SearchSoftwareSourceModuleStreamsResponse.Builder::moduleStreamCollection)
                .handleResponseHeaderString(
                        "opc-request-id",
                        SearchSoftwareSourceModuleStreamsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page",
                        SearchSoftwareSourceModuleStreamsResponse.Builder::opcNextPage)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<SearchSoftwareSourceModulesResponse>
            searchSoftwareSourceModules(
                    SearchSoftwareSourceModulesRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    SearchSoftwareSourceModulesRequest,
                                    SearchSoftwareSourceModulesResponse>
                            handler) {
        Objects.requireNonNull(
                request.getSearchSoftwareSourceModulesDetails(),
                "searchSoftwareSourceModulesDetails is required");

        return clientCall(request, SearchSoftwareSourceModulesResponse::builder)
                .logger(LOG, "searchSoftwareSourceModules")
                .serviceDetails(
                        "SoftwareSource",
                        "SearchSoftwareSourceModules",
                        "https://docs.oracle.com/iaas/api/#/en/osmh/20220901/SoftwareSource/SearchSoftwareSourceModules")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(SearchSoftwareSourceModulesRequest::builder)
                .basePath("/20220901")
                .appendPathParam("softwareSourceModules")
                .appendPathParam("actions")
                .appendPathParam("search")
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.osmanagementhub.model.ModuleCollection.class,
                        SearchSoftwareSourceModulesResponse.Builder::moduleCollection)
                .handleResponseHeaderString(
                        "opc-request-id", SearchSoftwareSourceModulesResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", SearchSoftwareSourceModulesResponse.Builder::opcNextPage)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<SearchSoftwareSourcePackageGroupsResponse>
            searchSoftwareSourcePackageGroups(
                    SearchSoftwareSourcePackageGroupsRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    SearchSoftwareSourcePackageGroupsRequest,
                                    SearchSoftwareSourcePackageGroupsResponse>
                            handler) {
        Objects.requireNonNull(
                request.getSearchSoftwareSourcePackageGroupsDetails(),
                "searchSoftwareSourcePackageGroupsDetails is required");

        return clientCall(request, SearchSoftwareSourcePackageGroupsResponse::builder)
                .logger(LOG, "searchSoftwareSourcePackageGroups")
                .serviceDetails(
                        "SoftwareSource",
                        "SearchSoftwareSourcePackageGroups",
                        "https://docs.oracle.com/iaas/api/#/en/osmh/20220901/SoftwareSource/SearchSoftwareSourcePackageGroups")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(SearchSoftwareSourcePackageGroupsRequest::builder)
                .basePath("/20220901")
                .appendPathParam("softwareSourcePackageGroups")
                .appendPathParam("actions")
                .appendPathParam("search")
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.osmanagementhub.model.PackageGroupCollection.class,
                        SearchSoftwareSourcePackageGroupsResponse.Builder::packageGroupCollection)
                .handleResponseHeaderString(
                        "opc-request-id",
                        SearchSoftwareSourcePackageGroupsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page",
                        SearchSoftwareSourcePackageGroupsResponse.Builder::opcNextPage)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<SoftwareSourceGenerateMetadataResponse>
            softwareSourceGenerateMetadata(
                    SoftwareSourceGenerateMetadataRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    SoftwareSourceGenerateMetadataRequest,
                                    SoftwareSourceGenerateMetadataResponse>
                            handler) {

        Validate.notBlank(request.getSoftwareSourceId(), "softwareSourceId must not be blank");

        return clientCall(request, SoftwareSourceGenerateMetadataResponse::builder)
                .logger(LOG, "softwareSourceGenerateMetadata")
                .serviceDetails(
                        "SoftwareSource",
                        "SoftwareSourceGenerateMetadata",
                        "https://docs.oracle.com/iaas/api/#/en/osmh/20220901/SoftwareSource/SoftwareSourceGenerateMetadata")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(SoftwareSourceGenerateMetadataRequest::builder)
                .basePath("/20220901")
                .appendPathParam("softwareSources")
                .appendPathParam(request.getSoftwareSourceId())
                .appendPathParam("actions")
                .appendPathParam("generateMetadata")
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .handleResponseHeaderString(
                        "opc-request-id",
                        SoftwareSourceGenerateMetadataResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<UpdateSoftwareSourceResponse> updateSoftwareSource(
            UpdateSoftwareSourceRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            UpdateSoftwareSourceRequest, UpdateSoftwareSourceResponse>
                    handler) {

        Validate.notBlank(request.getSoftwareSourceId(), "softwareSourceId must not be blank");
        Objects.requireNonNull(
                request.getUpdateSoftwareSourceDetails(),
                "updateSoftwareSourceDetails is required");

        return clientCall(request, UpdateSoftwareSourceResponse::builder)
                .logger(LOG, "updateSoftwareSource")
                .serviceDetails(
                        "SoftwareSource",
                        "UpdateSoftwareSource",
                        "https://docs.oracle.com/iaas/api/#/en/osmh/20220901/SoftwareSource/UpdateSoftwareSource")
                .method(com.oracle.bmc.http.client.Method.PUT)
                .requestBuilder(UpdateSoftwareSourceRequest::builder)
                .basePath("/20220901")
                .appendPathParam("softwareSources")
                .appendPathParam(request.getSoftwareSourceId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("if-match", request.getIfMatch())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.osmanagementhub.model.SoftwareSource.class,
                        UpdateSoftwareSourceResponse.Builder::softwareSource)
                .handleResponseHeaderString("etag", UpdateSoftwareSourceResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", UpdateSoftwareSourceResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        UpdateSoftwareSourceResponse.Builder::opcWorkRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<UpdateSoftwareSourceManifestResponse>
            updateSoftwareSourceManifest(
                    UpdateSoftwareSourceManifestRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    UpdateSoftwareSourceManifestRequest,
                                    UpdateSoftwareSourceManifestResponse>
                            handler) {
        Objects.requireNonNull(
                request.getUpdateSoftwareSourceManifestDetails(),
                "updateSoftwareSourceManifestDetails is required");

        Validate.notBlank(request.getSoftwareSourceId(), "softwareSourceId must not be blank");

        return clientCall(request, UpdateSoftwareSourceManifestResponse::builder)
                .logger(LOG, "updateSoftwareSourceManifest")
                .serviceDetails(
                        "SoftwareSource",
                        "UpdateSoftwareSourceManifest",
                        "https://docs.oracle.com/iaas/api/#/en/osmh/20220901/SoftwareSource/UpdateSoftwareSourceManifest")
                .method(com.oracle.bmc.http.client.Method.PUT)
                .requestBuilder(UpdateSoftwareSourceManifestRequest::builder)
                .basePath("/20220901")
                .appendPathParam("softwareSources")
                .appendPathParam(request.getSoftwareSourceId())
                .appendPathParam("manifest")
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .hasBinaryRequestBody()
                .hasBody()
                .handleBody(
                        com.oracle.bmc.osmanagementhub.model.SoftwareSource.class,
                        UpdateSoftwareSourceManifestResponse.Builder::softwareSource)
                .handleResponseHeaderString(
                        "opc-request-id",
                        UpdateSoftwareSourceManifestResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        UpdateSoftwareSourceManifestResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "etag", UpdateSoftwareSourceManifestResponse.Builder::etag)
                .callAsync(handler);
    }

    /**
     * Create a new client instance.
     *
     * @param authenticationDetailsProvider The authentication details (see {@link Builder#build})
     * @deprecated Use the {@link #builder() builder} instead.
     */
    @Deprecated
    public SoftwareSourceAsyncClient(
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
    public SoftwareSourceAsyncClient(
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
    public SoftwareSourceAsyncClient(
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
    public SoftwareSourceAsyncClient(
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
    public SoftwareSourceAsyncClient(
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
    public SoftwareSourceAsyncClient(
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
    public SoftwareSourceAsyncClient(
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

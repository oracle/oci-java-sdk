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
 * Async client implementation for Onboarding service. <br>
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
public class OnboardingAsyncClient extends com.oracle.bmc.http.internal.BaseAsyncClient
        implements OnboardingAsync {
    /** Service instance for Onboarding. */
    public static final com.oracle.bmc.Service SERVICE =
            com.oracle.bmc.Services.serviceBuilder()
                    .serviceName("ONBOARDING")
                    .serviceEndpointPrefix("")
                    .serviceEndpointTemplate("https://osmh.{region}.oci.{secondLevelDomain}")
                    .build();

    private static final org.slf4j.Logger LOG =
            org.slf4j.LoggerFactory.getLogger(OnboardingAsyncClient.class);

    OnboardingAsyncClient(
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
            extends com.oracle.bmc.common.RegionalClientBuilder<Builder, OnboardingAsyncClient> {
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
        public OnboardingAsyncClient build(
                @jakarta.annotation.Nonnull
                        com.oracle.bmc.auth.AbstractAuthenticationDetailsProvider
                                authenticationDetailsProvider) {
            return new OnboardingAsyncClient(this, authenticationDetailsProvider);
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
    public java.util.concurrent.Future<AttachLifecycleStageToProfileResponse>
            attachLifecycleStageToProfile(
                    AttachLifecycleStageToProfileRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    AttachLifecycleStageToProfileRequest,
                                    AttachLifecycleStageToProfileResponse>
                            handler) {

        Validate.notBlank(request.getProfileId(), "profileId must not be blank");
        Objects.requireNonNull(
                request.getAttachLifecycleStageToProfileDetails(),
                "attachLifecycleStageToProfileDetails is required");

        return clientCall(request, AttachLifecycleStageToProfileResponse::builder)
                .logger(LOG, "attachLifecycleStageToProfile")
                .serviceDetails(
                        "Onboarding",
                        "AttachLifecycleStageToProfile",
                        "https://docs.oracle.com/iaas/api/#/en/osmh/20220901/Profile/AttachLifecycleStageToProfile")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(AttachLifecycleStageToProfileRequest::builder)
                .basePath("/20220901")
                .appendPathParam("profiles")
                .appendPathParam(request.getProfileId())
                .appendPathParam("actions")
                .appendPathParam("attachLifecycleStage")
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("if-match", request.getIfMatch())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-request-id",
                        AttachLifecycleStageToProfileResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<AttachManagedInstanceGroupToProfileResponse>
            attachManagedInstanceGroupToProfile(
                    AttachManagedInstanceGroupToProfileRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    AttachManagedInstanceGroupToProfileRequest,
                                    AttachManagedInstanceGroupToProfileResponse>
                            handler) {

        Validate.notBlank(request.getProfileId(), "profileId must not be blank");
        Objects.requireNonNull(
                request.getAttachManagedInstanceGroupToProfileDetails(),
                "attachManagedInstanceGroupToProfileDetails is required");

        return clientCall(request, AttachManagedInstanceGroupToProfileResponse::builder)
                .logger(LOG, "attachManagedInstanceGroupToProfile")
                .serviceDetails(
                        "Onboarding",
                        "AttachManagedInstanceGroupToProfile",
                        "https://docs.oracle.com/iaas/api/#/en/osmh/20220901/Profile/AttachManagedInstanceGroupToProfile")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(AttachManagedInstanceGroupToProfileRequest::builder)
                .basePath("/20220901")
                .appendPathParam("profiles")
                .appendPathParam(request.getProfileId())
                .appendPathParam("actions")
                .appendPathParam("attachManagedInstanceGroup")
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("if-match", request.getIfMatch())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-request-id",
                        AttachManagedInstanceGroupToProfileResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<AttachManagementStationToProfileResponse>
            attachManagementStationToProfile(
                    AttachManagementStationToProfileRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    AttachManagementStationToProfileRequest,
                                    AttachManagementStationToProfileResponse>
                            handler) {

        Validate.notBlank(request.getProfileId(), "profileId must not be blank");
        Objects.requireNonNull(
                request.getAttachManagementStationToProfileDetails(),
                "attachManagementStationToProfileDetails is required");

        return clientCall(request, AttachManagementStationToProfileResponse::builder)
                .logger(LOG, "attachManagementStationToProfile")
                .serviceDetails(
                        "Onboarding",
                        "AttachManagementStationToProfile",
                        "https://docs.oracle.com/iaas/api/#/en/osmh/20220901/Profile/AttachManagementStationToProfile")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(AttachManagementStationToProfileRequest::builder)
                .basePath("/20220901")
                .appendPathParam("profiles")
                .appendPathParam(request.getProfileId())
                .appendPathParam("actions")
                .appendPathParam("attachManagementStation")
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("if-match", request.getIfMatch())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-request-id",
                        AttachManagementStationToProfileResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<AttachSoftwareSourcesToProfileResponse>
            attachSoftwareSourcesToProfile(
                    AttachSoftwareSourcesToProfileRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    AttachSoftwareSourcesToProfileRequest,
                                    AttachSoftwareSourcesToProfileResponse>
                            handler) {

        Validate.notBlank(request.getProfileId(), "profileId must not be blank");
        Objects.requireNonNull(
                request.getAttachSoftwareSourcesToProfileDetails(),
                "attachSoftwareSourcesToProfileDetails is required");

        return clientCall(request, AttachSoftwareSourcesToProfileResponse::builder)
                .logger(LOG, "attachSoftwareSourcesToProfile")
                .serviceDetails(
                        "Onboarding",
                        "AttachSoftwareSourcesToProfile",
                        "https://docs.oracle.com/iaas/api/#/en/osmh/20220901/Profile/AttachSoftwareSourcesToProfile")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(AttachSoftwareSourcesToProfileRequest::builder)
                .basePath("/20220901")
                .appendPathParam("profiles")
                .appendPathParam(request.getProfileId())
                .appendPathParam("actions")
                .appendPathParam("attachSoftwareSources")
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("if-match", request.getIfMatch())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-request-id",
                        AttachSoftwareSourcesToProfileResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ChangeProfileCompartmentResponse> changeProfileCompartment(
            ChangeProfileCompartmentRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ChangeProfileCompartmentRequest, ChangeProfileCompartmentResponse>
                    handler) {

        Validate.notBlank(request.getProfileId(), "profileId must not be blank");
        Objects.requireNonNull(
                request.getChangeProfileCompartmentDetails(),
                "changeProfileCompartmentDetails is required");

        return clientCall(request, ChangeProfileCompartmentResponse::builder)
                .logger(LOG, "changeProfileCompartment")
                .serviceDetails(
                        "Onboarding",
                        "ChangeProfileCompartment",
                        "https://docs.oracle.com/iaas/api/#/en/osmh/20220901/Profile/ChangeProfileCompartment")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(ChangeProfileCompartmentRequest::builder)
                .basePath("/20220901")
                .appendPathParam("profiles")
                .appendPathParam(request.getProfileId())
                .appendPathParam("actions")
                .appendPathParam("changeCompartment")
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-request-id", ChangeProfileCompartmentResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<CreateProfileResponse> createProfile(
            CreateProfileRequest request,
            final com.oracle.bmc.responses.AsyncHandler<CreateProfileRequest, CreateProfileResponse>
                    handler) {
        Objects.requireNonNull(
                request.getCreateProfileDetails(), "createProfileDetails is required");

        return clientCall(request, CreateProfileResponse::builder)
                .logger(LOG, "createProfile")
                .serviceDetails(
                        "Onboarding",
                        "CreateProfile",
                        "https://docs.oracle.com/iaas/api/#/en/osmh/20220901/Profile/CreateProfile")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CreateProfileRequest::builder)
                .basePath("/20220901")
                .appendPathParam("profiles")
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.osmanagementhub.model.Profile.class,
                        CreateProfileResponse.Builder::profile)
                .handleResponseHeaderString("etag", CreateProfileResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", CreateProfileResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<DeleteProfileResponse> deleteProfile(
            DeleteProfileRequest request,
            final com.oracle.bmc.responses.AsyncHandler<DeleteProfileRequest, DeleteProfileResponse>
                    handler) {

        Validate.notBlank(request.getProfileId(), "profileId must not be blank");

        return clientCall(request, DeleteProfileResponse::builder)
                .logger(LOG, "deleteProfile")
                .serviceDetails(
                        "Onboarding",
                        "DeleteProfile",
                        "https://docs.oracle.com/iaas/api/#/en/osmh/20220901/Profile/DeleteProfile")
                .method(com.oracle.bmc.http.client.Method.DELETE)
                .requestBuilder(DeleteProfileRequest::builder)
                .basePath("/20220901")
                .appendPathParam("profiles")
                .appendPathParam(request.getProfileId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleResponseHeaderString(
                        "opc-request-id", DeleteProfileResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<DetachSoftwareSourcesFromProfileResponse>
            detachSoftwareSourcesFromProfile(
                    DetachSoftwareSourcesFromProfileRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    DetachSoftwareSourcesFromProfileRequest,
                                    DetachSoftwareSourcesFromProfileResponse>
                            handler) {

        Validate.notBlank(request.getProfileId(), "profileId must not be blank");
        Objects.requireNonNull(
                request.getDetachSoftwareSourcesFromProfileDetails(),
                "detachSoftwareSourcesFromProfileDetails is required");

        return clientCall(request, DetachSoftwareSourcesFromProfileResponse::builder)
                .logger(LOG, "detachSoftwareSourcesFromProfile")
                .serviceDetails(
                        "Onboarding",
                        "DetachSoftwareSourcesFromProfile",
                        "https://docs.oracle.com/iaas/api/#/en/osmh/20220901/Profile/DetachSoftwareSourcesFromProfile")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(DetachSoftwareSourcesFromProfileRequest::builder)
                .basePath("/20220901")
                .appendPathParam("profiles")
                .appendPathParam(request.getProfileId())
                .appendPathParam("actions")
                .appendPathParam("detachSoftwareSources")
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("if-match", request.getIfMatch())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-request-id",
                        DetachSoftwareSourcesFromProfileResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<GetProfileResponse> getProfile(
            GetProfileRequest request,
            final com.oracle.bmc.responses.AsyncHandler<GetProfileRequest, GetProfileResponse>
                    handler) {

        Validate.notBlank(request.getProfileId(), "profileId must not be blank");

        return clientCall(request, GetProfileResponse::builder)
                .logger(LOG, "getProfile")
                .serviceDetails(
                        "Onboarding",
                        "GetProfile",
                        "https://docs.oracle.com/iaas/api/#/en/osmh/20220901/Profile/GetProfile")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetProfileRequest::builder)
                .basePath("/20220901")
                .appendPathParam("profiles")
                .appendPathParam(request.getProfileId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.osmanagementhub.model.Profile.class,
                        GetProfileResponse.Builder::profile)
                .handleResponseHeaderString("etag", GetProfileResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", GetProfileResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<GetProfileVersionResponse> getProfileVersion(
            GetProfileVersionRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetProfileVersionRequest, GetProfileVersionResponse>
                    handler) {

        Validate.notBlank(request.getProfileId(), "profileId must not be blank");

        Validate.notBlank(request.getProfileVersion(), "profileVersion must not be blank");

        return clientCall(request, GetProfileVersionResponse::builder)
                .logger(LOG, "getProfileVersion")
                .serviceDetails(
                        "Onboarding",
                        "GetProfileVersion",
                        "https://docs.oracle.com/iaas/api/#/en/osmh/20220901/ProfileVersion/GetProfileVersion")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetProfileVersionRequest::builder)
                .basePath("/20220901")
                .appendPathParam("profiles")
                .appendPathParam(request.getProfileId())
                .appendPathParam("version")
                .appendPathParam(request.getProfileVersion())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.osmanagementhub.model.ProfileVersion.class,
                        GetProfileVersionResponse.Builder::profileVersion)
                .handleResponseHeaderString("etag", GetProfileVersionResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", GetProfileVersionResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListProfileAvailableSoftwareSourcesResponse>
            listProfileAvailableSoftwareSources(
                    ListProfileAvailableSoftwareSourcesRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ListProfileAvailableSoftwareSourcesRequest,
                                    ListProfileAvailableSoftwareSourcesResponse>
                            handler) {

        Validate.notBlank(request.getProfileId(), "profileId must not be blank");

        return clientCall(request, ListProfileAvailableSoftwareSourcesResponse::builder)
                .logger(LOG, "listProfileAvailableSoftwareSources")
                .serviceDetails(
                        "Onboarding",
                        "ListProfileAvailableSoftwareSources",
                        "https://docs.oracle.com/iaas/api/#/en/osmh/20220901/Profile/ListProfileAvailableSoftwareSources")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListProfileAvailableSoftwareSourcesRequest::builder)
                .basePath("/20220901")
                .appendPathParam("profiles")
                .appendPathParam(request.getProfileId())
                .appendPathParam("availableSoftwareSources")
                .appendListQueryParam(
                        "displayName",
                        request.getDisplayName(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .appendQueryParam("displayNameContains", request.getDisplayNameContains())
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.osmanagementhub.model.AvailableSoftwareSourceCollection
                                .class,
                        ListProfileAvailableSoftwareSourcesResponse.Builder
                                ::availableSoftwareSourceCollection)
                .handleResponseHeaderString(
                        "opc-request-id",
                        ListProfileAvailableSoftwareSourcesResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page",
                        ListProfileAvailableSoftwareSourcesResponse.Builder::opcNextPage)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListProfilesResponse> listProfiles(
            ListProfilesRequest request,
            final com.oracle.bmc.responses.AsyncHandler<ListProfilesRequest, ListProfilesResponse>
                    handler) {

        return clientCall(request, ListProfilesResponse::builder)
                .logger(LOG, "listProfiles")
                .serviceDetails(
                        "Onboarding",
                        "ListProfiles",
                        "https://docs.oracle.com/iaas/api/#/en/osmh/20220901/Profile/ListProfiles")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListProfilesRequest::builder)
                .basePath("/20220901")
                .appendPathParam("profiles")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendListQueryParam(
                        "displayName",
                        request.getDisplayName(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .appendQueryParam("displayNameContains", request.getDisplayNameContains())
                .appendListQueryParam(
                        "profileType",
                        request.getProfileType(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .appendQueryParam("profileId", request.getProfileId())
                .appendEnumQueryParam("osFamily", request.getOsFamily())
                .appendEnumQueryParam("archType", request.getArchType())
                .appendListQueryParam(
                        "registrationType",
                        request.getRegistrationType(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .appendQueryParam("isDefaultProfile", request.getIsDefaultProfile())
                .appendQueryParam("isServiceProvidedProfile", request.getIsServiceProvidedProfile())
                .appendListQueryParam(
                        "managementStation",
                        request.getManagementStation(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .appendListQueryParam(
                        "managementStationNotEqualTo",
                        request.getManagementStationNotEqualTo(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .appendQueryParam("profileVersion", request.getProfileVersion())
                .appendEnumQueryParam("vendorName", request.getVendorName())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendEnumQueryParam("lifecycleState", request.getLifecycleState())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.osmanagementhub.model.ProfileCollection.class,
                        ListProfilesResponse.Builder::profileCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListProfilesResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListProfilesResponse.Builder::opcNextPage)
                .handleResponseHeaderInteger(
                        "opc-total-items", ListProfilesResponse.Builder::opcTotalItems)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<UpdateProfileResponse> updateProfile(
            UpdateProfileRequest request,
            final com.oracle.bmc.responses.AsyncHandler<UpdateProfileRequest, UpdateProfileResponse>
                    handler) {

        Validate.notBlank(request.getProfileId(), "profileId must not be blank");
        Objects.requireNonNull(
                request.getUpdateProfileDetails(), "updateProfileDetails is required");

        return clientCall(request, UpdateProfileResponse::builder)
                .logger(LOG, "updateProfile")
                .serviceDetails(
                        "Onboarding",
                        "UpdateProfile",
                        "https://docs.oracle.com/iaas/api/#/en/osmh/20220901/Profile/UpdateProfile")
                .method(com.oracle.bmc.http.client.Method.PUT)
                .requestBuilder(UpdateProfileRequest::builder)
                .basePath("/20220901")
                .appendPathParam("profiles")
                .appendPathParam(request.getProfileId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.osmanagementhub.model.Profile.class,
                        UpdateProfileResponse.Builder::profile)
                .handleResponseHeaderString("etag", UpdateProfileResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", UpdateProfileResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    /**
     * Create a new client instance.
     *
     * @param authenticationDetailsProvider The authentication details (see {@link Builder#build})
     * @deprecated Use the {@link #builder() builder} instead.
     */
    @Deprecated
    public OnboardingAsyncClient(
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
    public OnboardingAsyncClient(
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
    public OnboardingAsyncClient(
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
    public OnboardingAsyncClient(
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
    public OnboardingAsyncClient(
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
    public OnboardingAsyncClient(
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
    public OnboardingAsyncClient(
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

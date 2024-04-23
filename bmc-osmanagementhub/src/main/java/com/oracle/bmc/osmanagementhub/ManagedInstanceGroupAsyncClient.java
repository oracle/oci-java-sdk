/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.osmanagementhub;

import com.oracle.bmc.util.internal.Validate;
import com.oracle.bmc.osmanagementhub.requests.*;
import com.oracle.bmc.osmanagementhub.responses.*;

import java.util.Objects;

/**
 * Async client implementation for ManagedInstanceGroup service. <br>
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
public class ManagedInstanceGroupAsyncClient extends com.oracle.bmc.http.internal.BaseAsyncClient
        implements ManagedInstanceGroupAsync {
    /** Service instance for ManagedInstanceGroup. */
    public static final com.oracle.bmc.Service SERVICE =
            com.oracle.bmc.Services.serviceBuilder()
                    .serviceName("MANAGEDINSTANCEGROUP")
                    .serviceEndpointPrefix("")
                    .serviceEndpointTemplate("https://osmh.{region}.oci.{secondLevelDomain}")
                    .build();

    private static final org.slf4j.Logger LOG =
            org.slf4j.LoggerFactory.getLogger(ManagedInstanceGroupAsyncClient.class);

    ManagedInstanceGroupAsyncClient(
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
                    Builder, ManagedInstanceGroupAsyncClient> {
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
        public ManagedInstanceGroupAsyncClient build(
                @jakarta.annotation.Nonnull
                        com.oracle.bmc.auth.AbstractAuthenticationDetailsProvider
                                authenticationDetailsProvider) {
            return new ManagedInstanceGroupAsyncClient(this, authenticationDetailsProvider);
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
    public java.util.concurrent.Future<AttachManagedInstancesToManagedInstanceGroupResponse>
            attachManagedInstancesToManagedInstanceGroup(
                    AttachManagedInstancesToManagedInstanceGroupRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    AttachManagedInstancesToManagedInstanceGroupRequest,
                                    AttachManagedInstancesToManagedInstanceGroupResponse>
                            handler) {

        Validate.notBlank(
                request.getManagedInstanceGroupId(), "managedInstanceGroupId must not be blank");
        Objects.requireNonNull(
                request.getAttachManagedInstancesToManagedInstanceGroupDetails(),
                "attachManagedInstancesToManagedInstanceGroupDetails is required");

        return clientCall(request, AttachManagedInstancesToManagedInstanceGroupResponse::builder)
                .logger(LOG, "attachManagedInstancesToManagedInstanceGroup")
                .serviceDetails(
                        "ManagedInstanceGroup",
                        "AttachManagedInstancesToManagedInstanceGroup",
                        "https://docs.oracle.com/iaas/api/#/en/osmh/20220901/ManagedInstanceGroup/AttachManagedInstancesToManagedInstanceGroup")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(AttachManagedInstancesToManagedInstanceGroupRequest::builder)
                .basePath("/20220901")
                .appendPathParam("managedInstanceGroups")
                .appendPathParam(request.getManagedInstanceGroupId())
                .appendPathParam("actions")
                .appendPathParam("attachManagedInstances")
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("if-match", request.getIfMatch())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        AttachManagedInstancesToManagedInstanceGroupResponse.Builder
                                ::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id",
                        AttachManagedInstancesToManagedInstanceGroupResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<AttachSoftwareSourcesToManagedInstanceGroupResponse>
            attachSoftwareSourcesToManagedInstanceGroup(
                    AttachSoftwareSourcesToManagedInstanceGroupRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    AttachSoftwareSourcesToManagedInstanceGroupRequest,
                                    AttachSoftwareSourcesToManagedInstanceGroupResponse>
                            handler) {

        Validate.notBlank(
                request.getManagedInstanceGroupId(), "managedInstanceGroupId must not be blank");
        Objects.requireNonNull(
                request.getAttachSoftwareSourcesToManagedInstanceGroupDetails(),
                "attachSoftwareSourcesToManagedInstanceGroupDetails is required");

        return clientCall(request, AttachSoftwareSourcesToManagedInstanceGroupResponse::builder)
                .logger(LOG, "attachSoftwareSourcesToManagedInstanceGroup")
                .serviceDetails(
                        "ManagedInstanceGroup",
                        "AttachSoftwareSourcesToManagedInstanceGroup",
                        "https://docs.oracle.com/iaas/api/#/en/osmh/20220901/ManagedInstanceGroup/AttachSoftwareSourcesToManagedInstanceGroup")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(AttachSoftwareSourcesToManagedInstanceGroupRequest::builder)
                .basePath("/20220901")
                .appendPathParam("managedInstanceGroups")
                .appendPathParam(request.getManagedInstanceGroupId())
                .appendPathParam("actions")
                .appendPathParam("attachSoftwareSources")
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("if-match", request.getIfMatch())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        AttachSoftwareSourcesToManagedInstanceGroupResponse.Builder
                                ::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id",
                        AttachSoftwareSourcesToManagedInstanceGroupResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ChangeManagedInstanceGroupCompartmentResponse>
            changeManagedInstanceGroupCompartment(
                    ChangeManagedInstanceGroupCompartmentRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ChangeManagedInstanceGroupCompartmentRequest,
                                    ChangeManagedInstanceGroupCompartmentResponse>
                            handler) {

        Validate.notBlank(
                request.getManagedInstanceGroupId(), "managedInstanceGroupId must not be blank");
        Objects.requireNonNull(
                request.getChangeManagedInstanceGroupCompartmentDetails(),
                "changeManagedInstanceGroupCompartmentDetails is required");

        return clientCall(request, ChangeManagedInstanceGroupCompartmentResponse::builder)
                .logger(LOG, "changeManagedInstanceGroupCompartment")
                .serviceDetails(
                        "ManagedInstanceGroup",
                        "ChangeManagedInstanceGroupCompartment",
                        "https://docs.oracle.com/iaas/api/#/en/osmh/20220901/ManagedInstanceGroup/ChangeManagedInstanceGroupCompartment")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(ChangeManagedInstanceGroupCompartmentRequest::builder)
                .basePath("/20220901")
                .appendPathParam("managedInstanceGroups")
                .appendPathParam(request.getManagedInstanceGroupId())
                .appendPathParam("actions")
                .appendPathParam("changeCompartment")
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-request-id",
                        ChangeManagedInstanceGroupCompartmentResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<CreateManagedInstanceGroupResponse>
            createManagedInstanceGroup(
                    CreateManagedInstanceGroupRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    CreateManagedInstanceGroupRequest,
                                    CreateManagedInstanceGroupResponse>
                            handler) {
        Objects.requireNonNull(
                request.getCreateManagedInstanceGroupDetails(),
                "createManagedInstanceGroupDetails is required");

        return clientCall(request, CreateManagedInstanceGroupResponse::builder)
                .logger(LOG, "createManagedInstanceGroup")
                .serviceDetails(
                        "ManagedInstanceGroup",
                        "CreateManagedInstanceGroup",
                        "https://docs.oracle.com/iaas/api/#/en/osmh/20220901/ManagedInstanceGroup/CreateManagedInstanceGroup")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CreateManagedInstanceGroupRequest::builder)
                .basePath("/20220901")
                .appendPathParam("managedInstanceGroups")
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.osmanagementhub.model.ManagedInstanceGroup.class,
                        CreateManagedInstanceGroupResponse.Builder::managedInstanceGroup)
                .handleResponseHeaderString(
                        "etag", CreateManagedInstanceGroupResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", CreateManagedInstanceGroupResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<DeleteManagedInstanceGroupResponse>
            deleteManagedInstanceGroup(
                    DeleteManagedInstanceGroupRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    DeleteManagedInstanceGroupRequest,
                                    DeleteManagedInstanceGroupResponse>
                            handler) {

        Validate.notBlank(
                request.getManagedInstanceGroupId(), "managedInstanceGroupId must not be blank");

        return clientCall(request, DeleteManagedInstanceGroupResponse::builder)
                .logger(LOG, "deleteManagedInstanceGroup")
                .serviceDetails(
                        "ManagedInstanceGroup",
                        "DeleteManagedInstanceGroup",
                        "https://docs.oracle.com/iaas/api/#/en/osmh/20220901/ManagedInstanceGroup/DeleteManagedInstanceGroup")
                .method(com.oracle.bmc.http.client.Method.DELETE)
                .requestBuilder(DeleteManagedInstanceGroupRequest::builder)
                .basePath("/20220901")
                .appendPathParam("managedInstanceGroups")
                .appendPathParam(request.getManagedInstanceGroupId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleResponseHeaderString(
                        "opc-request-id", DeleteManagedInstanceGroupResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<DetachManagedInstancesFromManagedInstanceGroupResponse>
            detachManagedInstancesFromManagedInstanceGroup(
                    DetachManagedInstancesFromManagedInstanceGroupRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    DetachManagedInstancesFromManagedInstanceGroupRequest,
                                    DetachManagedInstancesFromManagedInstanceGroupResponse>
                            handler) {

        Validate.notBlank(
                request.getManagedInstanceGroupId(), "managedInstanceGroupId must not be blank");
        Objects.requireNonNull(
                request.getDetachManagedInstancesFromManagedInstanceGroupDetails(),
                "detachManagedInstancesFromManagedInstanceGroupDetails is required");

        return clientCall(request, DetachManagedInstancesFromManagedInstanceGroupResponse::builder)
                .logger(LOG, "detachManagedInstancesFromManagedInstanceGroup")
                .serviceDetails(
                        "ManagedInstanceGroup",
                        "DetachManagedInstancesFromManagedInstanceGroup",
                        "https://docs.oracle.com/iaas/api/#/en/osmh/20220901/ManagedInstanceGroup/DetachManagedInstancesFromManagedInstanceGroup")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(DetachManagedInstancesFromManagedInstanceGroupRequest::builder)
                .basePath("/20220901")
                .appendPathParam("managedInstanceGroups")
                .appendPathParam(request.getManagedInstanceGroupId())
                .appendPathParam("actions")
                .appendPathParam("detachManagedInstances")
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("if-match", request.getIfMatch())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-request-id",
                        DetachManagedInstancesFromManagedInstanceGroupResponse.Builder
                                ::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<DetachSoftwareSourcesFromManagedInstanceGroupResponse>
            detachSoftwareSourcesFromManagedInstanceGroup(
                    DetachSoftwareSourcesFromManagedInstanceGroupRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    DetachSoftwareSourcesFromManagedInstanceGroupRequest,
                                    DetachSoftwareSourcesFromManagedInstanceGroupResponse>
                            handler) {

        Validate.notBlank(
                request.getManagedInstanceGroupId(), "managedInstanceGroupId must not be blank");
        Objects.requireNonNull(
                request.getDetachSoftwareSourcesFromManagedInstanceGroupDetails(),
                "detachSoftwareSourcesFromManagedInstanceGroupDetails is required");

        return clientCall(request, DetachSoftwareSourcesFromManagedInstanceGroupResponse::builder)
                .logger(LOG, "detachSoftwareSourcesFromManagedInstanceGroup")
                .serviceDetails(
                        "ManagedInstanceGroup",
                        "DetachSoftwareSourcesFromManagedInstanceGroup",
                        "https://docs.oracle.com/iaas/api/#/en/osmh/20220901/ManagedInstanceGroup/DetachSoftwareSourcesFromManagedInstanceGroup")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(DetachSoftwareSourcesFromManagedInstanceGroupRequest::builder)
                .basePath("/20220901")
                .appendPathParam("managedInstanceGroups")
                .appendPathParam(request.getManagedInstanceGroupId())
                .appendPathParam("actions")
                .appendPathParam("detachSoftwareSources")
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("if-match", request.getIfMatch())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-request-id",
                        DetachSoftwareSourcesFromManagedInstanceGroupResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<DisableModuleStreamOnManagedInstanceGroupResponse>
            disableModuleStreamOnManagedInstanceGroup(
                    DisableModuleStreamOnManagedInstanceGroupRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    DisableModuleStreamOnManagedInstanceGroupRequest,
                                    DisableModuleStreamOnManagedInstanceGroupResponse>
                            handler) {

        Validate.notBlank(
                request.getManagedInstanceGroupId(), "managedInstanceGroupId must not be blank");
        Objects.requireNonNull(
                request.getDisableModuleStreamOnManagedInstanceGroupDetails(),
                "disableModuleStreamOnManagedInstanceGroupDetails is required");

        return clientCall(request, DisableModuleStreamOnManagedInstanceGroupResponse::builder)
                .logger(LOG, "disableModuleStreamOnManagedInstanceGroup")
                .serviceDetails(
                        "ManagedInstanceGroup",
                        "DisableModuleStreamOnManagedInstanceGroup",
                        "https://docs.oracle.com/iaas/api/#/en/osmh/20220901/ManagedInstanceGroup/DisableModuleStreamOnManagedInstanceGroup")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(DisableModuleStreamOnManagedInstanceGroupRequest::builder)
                .basePath("/20220901")
                .appendPathParam("managedInstanceGroups")
                .appendPathParam(request.getManagedInstanceGroupId())
                .appendPathParam("actions")
                .appendPathParam("disableModuleStream")
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("if-match", request.getIfMatch())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        DisableModuleStreamOnManagedInstanceGroupResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id",
                        DisableModuleStreamOnManagedInstanceGroupResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<EnableModuleStreamOnManagedInstanceGroupResponse>
            enableModuleStreamOnManagedInstanceGroup(
                    EnableModuleStreamOnManagedInstanceGroupRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    EnableModuleStreamOnManagedInstanceGroupRequest,
                                    EnableModuleStreamOnManagedInstanceGroupResponse>
                            handler) {

        Validate.notBlank(
                request.getManagedInstanceGroupId(), "managedInstanceGroupId must not be blank");
        Objects.requireNonNull(
                request.getEnableModuleStreamOnManagedInstanceGroupDetails(),
                "enableModuleStreamOnManagedInstanceGroupDetails is required");

        return clientCall(request, EnableModuleStreamOnManagedInstanceGroupResponse::builder)
                .logger(LOG, "enableModuleStreamOnManagedInstanceGroup")
                .serviceDetails(
                        "ManagedInstanceGroup",
                        "EnableModuleStreamOnManagedInstanceGroup",
                        "https://docs.oracle.com/iaas/api/#/en/osmh/20220901/ManagedInstanceGroup/EnableModuleStreamOnManagedInstanceGroup")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(EnableModuleStreamOnManagedInstanceGroupRequest::builder)
                .basePath("/20220901")
                .appendPathParam("managedInstanceGroups")
                .appendPathParam(request.getManagedInstanceGroupId())
                .appendPathParam("actions")
                .appendPathParam("enableModuleStream")
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("if-match", request.getIfMatch())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        EnableModuleStreamOnManagedInstanceGroupResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id",
                        EnableModuleStreamOnManagedInstanceGroupResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<GetManagedInstanceGroupResponse> getManagedInstanceGroup(
            GetManagedInstanceGroupRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetManagedInstanceGroupRequest, GetManagedInstanceGroupResponse>
                    handler) {

        Validate.notBlank(
                request.getManagedInstanceGroupId(), "managedInstanceGroupId must not be blank");

        return clientCall(request, GetManagedInstanceGroupResponse::builder)
                .logger(LOG, "getManagedInstanceGroup")
                .serviceDetails(
                        "ManagedInstanceGroup",
                        "GetManagedInstanceGroup",
                        "https://docs.oracle.com/iaas/api/#/en/osmh/20220901/ManagedInstanceGroup/GetManagedInstanceGroup")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetManagedInstanceGroupRequest::builder)
                .basePath("/20220901")
                .appendPathParam("managedInstanceGroups")
                .appendPathParam(request.getManagedInstanceGroupId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.osmanagementhub.model.ManagedInstanceGroup.class,
                        GetManagedInstanceGroupResponse.Builder::managedInstanceGroup)
                .handleResponseHeaderString("etag", GetManagedInstanceGroupResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", GetManagedInstanceGroupResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<InstallModuleStreamProfileOnManagedInstanceGroupResponse>
            installModuleStreamProfileOnManagedInstanceGroup(
                    InstallModuleStreamProfileOnManagedInstanceGroupRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    InstallModuleStreamProfileOnManagedInstanceGroupRequest,
                                    InstallModuleStreamProfileOnManagedInstanceGroupResponse>
                            handler) {

        Validate.notBlank(
                request.getManagedInstanceGroupId(), "managedInstanceGroupId must not be blank");
        Objects.requireNonNull(
                request.getInstallModuleStreamProfileOnManagedInstanceGroupDetails(),
                "installModuleStreamProfileOnManagedInstanceGroupDetails is required");

        return clientCall(
                        request, InstallModuleStreamProfileOnManagedInstanceGroupResponse::builder)
                .logger(LOG, "installModuleStreamProfileOnManagedInstanceGroup")
                .serviceDetails(
                        "ManagedInstanceGroup",
                        "InstallModuleStreamProfileOnManagedInstanceGroup",
                        "https://docs.oracle.com/iaas/api/#/en/osmh/20220901/ManagedInstanceGroup/InstallModuleStreamProfileOnManagedInstanceGroup")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(InstallModuleStreamProfileOnManagedInstanceGroupRequest::builder)
                .basePath("/20220901")
                .appendPathParam("managedInstanceGroups")
                .appendPathParam(request.getManagedInstanceGroupId())
                .appendPathParam("actions")
                .appendPathParam("installStreamProfile")
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("if-match", request.getIfMatch())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        InstallModuleStreamProfileOnManagedInstanceGroupResponse.Builder
                                ::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id",
                        InstallModuleStreamProfileOnManagedInstanceGroupResponse.Builder
                                ::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<InstallPackagesOnManagedInstanceGroupResponse>
            installPackagesOnManagedInstanceGroup(
                    InstallPackagesOnManagedInstanceGroupRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    InstallPackagesOnManagedInstanceGroupRequest,
                                    InstallPackagesOnManagedInstanceGroupResponse>
                            handler) {

        Validate.notBlank(
                request.getManagedInstanceGroupId(), "managedInstanceGroupId must not be blank");
        Objects.requireNonNull(
                request.getInstallPackagesOnManagedInstanceGroupDetails(),
                "installPackagesOnManagedInstanceGroupDetails is required");

        return clientCall(request, InstallPackagesOnManagedInstanceGroupResponse::builder)
                .logger(LOG, "installPackagesOnManagedInstanceGroup")
                .serviceDetails(
                        "ManagedInstanceGroup",
                        "InstallPackagesOnManagedInstanceGroup",
                        "https://docs.oracle.com/iaas/api/#/en/osmh/20220901/ManagedInstanceGroup/InstallPackagesOnManagedInstanceGroup")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(InstallPackagesOnManagedInstanceGroupRequest::builder)
                .basePath("/20220901")
                .appendPathParam("managedInstanceGroups")
                .appendPathParam(request.getManagedInstanceGroupId())
                .appendPathParam("actions")
                .appendPathParam("installPackages")
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("if-match", request.getIfMatch())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        InstallPackagesOnManagedInstanceGroupResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id",
                        InstallPackagesOnManagedInstanceGroupResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<InstallWindowsUpdatesOnManagedInstanceGroupResponse>
            installWindowsUpdatesOnManagedInstanceGroup(
                    InstallWindowsUpdatesOnManagedInstanceGroupRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    InstallWindowsUpdatesOnManagedInstanceGroupRequest,
                                    InstallWindowsUpdatesOnManagedInstanceGroupResponse>
                            handler) {

        Validate.notBlank(
                request.getManagedInstanceGroupId(), "managedInstanceGroupId must not be blank");
        Objects.requireNonNull(
                request.getInstallWindowsUpdatesOnManagedInstanceGroupDetails(),
                "installWindowsUpdatesOnManagedInstanceGroupDetails is required");

        return clientCall(request, InstallWindowsUpdatesOnManagedInstanceGroupResponse::builder)
                .logger(LOG, "installWindowsUpdatesOnManagedInstanceGroup")
                .serviceDetails(
                        "ManagedInstanceGroup",
                        "InstallWindowsUpdatesOnManagedInstanceGroup",
                        "https://docs.oracle.com/iaas/api/#/en/osmh/20220901/ManagedInstanceGroup/InstallWindowsUpdatesOnManagedInstanceGroup")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(InstallWindowsUpdatesOnManagedInstanceGroupRequest::builder)
                .basePath("/20220901")
                .appendPathParam("managedInstanceGroups")
                .appendPathParam(request.getManagedInstanceGroupId())
                .appendPathParam("actions")
                .appendPathParam("installWindowsUpdates")
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("if-match", request.getIfMatch())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        InstallWindowsUpdatesOnManagedInstanceGroupResponse.Builder
                                ::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id",
                        InstallWindowsUpdatesOnManagedInstanceGroupResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListManagedInstanceGroupAvailableModulesResponse>
            listManagedInstanceGroupAvailableModules(
                    ListManagedInstanceGroupAvailableModulesRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ListManagedInstanceGroupAvailableModulesRequest,
                                    ListManagedInstanceGroupAvailableModulesResponse>
                            handler) {

        Validate.notBlank(
                request.getManagedInstanceGroupId(), "managedInstanceGroupId must not be blank");

        return clientCall(request, ListManagedInstanceGroupAvailableModulesResponse::builder)
                .logger(LOG, "listManagedInstanceGroupAvailableModules")
                .serviceDetails(
                        "ManagedInstanceGroup",
                        "ListManagedInstanceGroupAvailableModules",
                        "https://docs.oracle.com/iaas/api/#/en/osmh/20220901/ManagedInstanceGroup/ListManagedInstanceGroupAvailableModules")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListManagedInstanceGroupAvailableModulesRequest::builder)
                .basePath("/20220901")
                .appendPathParam("managedInstanceGroups")
                .appendPathParam(request.getManagedInstanceGroupId())
                .appendPathParam("availableModules")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendQueryParam("name", request.getName())
                .appendQueryParam("nameContains", request.getNameContains())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.osmanagementhub.model
                                .ManagedInstanceGroupAvailableModuleCollection.class,
                        ListManagedInstanceGroupAvailableModulesResponse.Builder
                                ::managedInstanceGroupAvailableModuleCollection)
                .handleResponseHeaderString(
                        "opc-request-id",
                        ListManagedInstanceGroupAvailableModulesResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page",
                        ListManagedInstanceGroupAvailableModulesResponse.Builder::opcNextPage)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListManagedInstanceGroupAvailablePackagesResponse>
            listManagedInstanceGroupAvailablePackages(
                    ListManagedInstanceGroupAvailablePackagesRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ListManagedInstanceGroupAvailablePackagesRequest,
                                    ListManagedInstanceGroupAvailablePackagesResponse>
                            handler) {

        Validate.notBlank(
                request.getManagedInstanceGroupId(), "managedInstanceGroupId must not be blank");

        return clientCall(request, ListManagedInstanceGroupAvailablePackagesResponse::builder)
                .logger(LOG, "listManagedInstanceGroupAvailablePackages")
                .serviceDetails(
                        "ManagedInstanceGroup",
                        "ListManagedInstanceGroupAvailablePackages",
                        "https://docs.oracle.com/iaas/api/#/en/osmh/20220901/ManagedInstanceGroup/ListManagedInstanceGroupAvailablePackages")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListManagedInstanceGroupAvailablePackagesRequest::builder)
                .basePath("/20220901")
                .appendPathParam("managedInstanceGroups")
                .appendPathParam(request.getManagedInstanceGroupId())
                .appendPathParam("availablePackages")
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
                .appendQueryParam("isLatest", request.getIsLatest())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.osmanagementhub.model
                                .ManagedInstanceGroupAvailablePackageCollection.class,
                        ListManagedInstanceGroupAvailablePackagesResponse.Builder
                                ::managedInstanceGroupAvailablePackageCollection)
                .handleResponseHeaderString(
                        "opc-request-id",
                        ListManagedInstanceGroupAvailablePackagesResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page",
                        ListManagedInstanceGroupAvailablePackagesResponse.Builder::opcNextPage)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListManagedInstanceGroupAvailableSoftwareSourcesResponse>
            listManagedInstanceGroupAvailableSoftwareSources(
                    ListManagedInstanceGroupAvailableSoftwareSourcesRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ListManagedInstanceGroupAvailableSoftwareSourcesRequest,
                                    ListManagedInstanceGroupAvailableSoftwareSourcesResponse>
                            handler) {

        Validate.notBlank(
                request.getManagedInstanceGroupId(), "managedInstanceGroupId must not be blank");

        return clientCall(
                        request, ListManagedInstanceGroupAvailableSoftwareSourcesResponse::builder)
                .logger(LOG, "listManagedInstanceGroupAvailableSoftwareSources")
                .serviceDetails(
                        "ManagedInstanceGroup",
                        "ListManagedInstanceGroupAvailableSoftwareSources",
                        "https://docs.oracle.com/iaas/api/#/en/osmh/20220901/ManagedInstanceGroup/ListManagedInstanceGroupAvailableSoftwareSources")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListManagedInstanceGroupAvailableSoftwareSourcesRequest::builder)
                .basePath("/20220901")
                .appendPathParam("managedInstanceGroups")
                .appendPathParam(request.getManagedInstanceGroupId())
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
                        ListManagedInstanceGroupAvailableSoftwareSourcesResponse.Builder
                                ::availableSoftwareSourceCollection)
                .handleResponseHeaderString(
                        "opc-request-id",
                        ListManagedInstanceGroupAvailableSoftwareSourcesResponse.Builder
                                ::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page",
                        ListManagedInstanceGroupAvailableSoftwareSourcesResponse.Builder
                                ::opcNextPage)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListManagedInstanceGroupInstalledPackagesResponse>
            listManagedInstanceGroupInstalledPackages(
                    ListManagedInstanceGroupInstalledPackagesRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ListManagedInstanceGroupInstalledPackagesRequest,
                                    ListManagedInstanceGroupInstalledPackagesResponse>
                            handler) {

        Validate.notBlank(
                request.getManagedInstanceGroupId(), "managedInstanceGroupId must not be blank");

        return clientCall(request, ListManagedInstanceGroupInstalledPackagesResponse::builder)
                .logger(LOG, "listManagedInstanceGroupInstalledPackages")
                .serviceDetails(
                        "ManagedInstanceGroup",
                        "ListManagedInstanceGroupInstalledPackages",
                        "https://docs.oracle.com/iaas/api/#/en/osmh/20220901/ManagedInstanceGroup/ListManagedInstanceGroupInstalledPackages")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListManagedInstanceGroupInstalledPackagesRequest::builder)
                .basePath("/20220901")
                .appendPathParam("managedInstanceGroups")
                .appendPathParam(request.getManagedInstanceGroupId())
                .appendPathParam("installedPackages")
                .appendListQueryParam(
                        "displayName",
                        request.getDisplayName(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .appendQueryParam("displayNameContains", request.getDisplayNameContains())
                .appendQueryParam("timeInstallDateStart", request.getTimeInstallDateStart())
                .appendQueryParam("timeInstallDateEnd", request.getTimeInstallDateEnd())
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.osmanagementhub.model
                                .ManagedInstanceGroupInstalledPackageCollection.class,
                        ListManagedInstanceGroupInstalledPackagesResponse.Builder
                                ::managedInstanceGroupInstalledPackageCollection)
                .handleResponseHeaderString(
                        "opc-request-id",
                        ListManagedInstanceGroupInstalledPackagesResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page",
                        ListManagedInstanceGroupInstalledPackagesResponse.Builder::opcNextPage)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListManagedInstanceGroupModulesResponse>
            listManagedInstanceGroupModules(
                    ListManagedInstanceGroupModulesRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ListManagedInstanceGroupModulesRequest,
                                    ListManagedInstanceGroupModulesResponse>
                            handler) {

        Validate.notBlank(
                request.getManagedInstanceGroupId(), "managedInstanceGroupId must not be blank");

        return clientCall(request, ListManagedInstanceGroupModulesResponse::builder)
                .logger(LOG, "listManagedInstanceGroupModules")
                .serviceDetails(
                        "ManagedInstanceGroup",
                        "ListManagedInstanceGroupModules",
                        "https://docs.oracle.com/iaas/api/#/en/osmh/20220901/ManagedInstanceGroup/ListManagedInstanceGroupModules")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListManagedInstanceGroupModulesRequest::builder)
                .basePath("/20220901")
                .appendPathParam("managedInstanceGroups")
                .appendPathParam(request.getManagedInstanceGroupId())
                .appendPathParam("modules")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendQueryParam("name", request.getName())
                .appendQueryParam("nameContains", request.getNameContains())
                .appendQueryParam("streamName", request.getStreamName())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.osmanagementhub.model.ManagedInstanceGroupModuleCollection
                                .class,
                        ListManagedInstanceGroupModulesResponse.Builder
                                ::managedInstanceGroupModuleCollection)
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        ListManagedInstanceGroupModulesResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id",
                        ListManagedInstanceGroupModulesResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page",
                        ListManagedInstanceGroupModulesResponse.Builder::opcNextPage)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListManagedInstanceGroupsResponse> listManagedInstanceGroups(
            ListManagedInstanceGroupsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListManagedInstanceGroupsRequest, ListManagedInstanceGroupsResponse>
                    handler) {

        return clientCall(request, ListManagedInstanceGroupsResponse::builder)
                .logger(LOG, "listManagedInstanceGroups")
                .serviceDetails(
                        "ManagedInstanceGroup",
                        "ListManagedInstanceGroups",
                        "https://docs.oracle.com/iaas/api/#/en/osmh/20220901/ManagedInstanceGroup/ListManagedInstanceGroups")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListManagedInstanceGroupsRequest::builder)
                .basePath("/20220901")
                .appendPathParam("managedInstanceGroups")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendQueryParam("managedInstanceGroupId", request.getManagedInstanceGroupId())
                .appendQueryParam("softwareSourceId", request.getSoftwareSourceId())
                .appendListQueryParam(
                        "displayName",
                        request.getDisplayName(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .appendQueryParam("displayNameContains", request.getDisplayNameContains())
                .appendEnumQueryParam("archType", request.getArchType())
                .appendEnumQueryParam("osFamily", request.getOsFamily())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendEnumQueryParam("lifecycleState", request.getLifecycleState())
                .appendListQueryParam(
                        "location",
                        request.getLocation(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .appendListQueryParam(
                        "locationNotEqualTo",
                        request.getLocationNotEqualTo(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .appendQueryParam(
                        "isManagedByAutonomousLinux", request.getIsManagedByAutonomousLinux())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.osmanagementhub.model.ManagedInstanceGroupCollection.class,
                        ListManagedInstanceGroupsResponse.Builder::managedInstanceGroupCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListManagedInstanceGroupsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListManagedInstanceGroupsResponse.Builder::opcNextPage)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ManageModuleStreamsOnManagedInstanceGroupResponse>
            manageModuleStreamsOnManagedInstanceGroup(
                    ManageModuleStreamsOnManagedInstanceGroupRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ManageModuleStreamsOnManagedInstanceGroupRequest,
                                    ManageModuleStreamsOnManagedInstanceGroupResponse>
                            handler) {

        Validate.notBlank(
                request.getManagedInstanceGroupId(), "managedInstanceGroupId must not be blank");
        Objects.requireNonNull(
                request.getManageModuleStreamsOnManagedInstanceGroupDetails(),
                "manageModuleStreamsOnManagedInstanceGroupDetails is required");

        return clientCall(request, ManageModuleStreamsOnManagedInstanceGroupResponse::builder)
                .logger(LOG, "manageModuleStreamsOnManagedInstanceGroup")
                .serviceDetails(
                        "ManagedInstanceGroup",
                        "ManageModuleStreamsOnManagedInstanceGroup",
                        "https://docs.oracle.com/iaas/api/#/en/osmh/20220901/ManagedInstanceGroup/ManageModuleStreamsOnManagedInstanceGroup")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(ManageModuleStreamsOnManagedInstanceGroupRequest::builder)
                .basePath("/20220901")
                .appendPathParam("managedInstanceGroups")
                .appendPathParam(request.getManagedInstanceGroupId())
                .appendPathParam("actions")
                .appendPathParam("manageModuleStreams")
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("if-match", request.getIfMatch())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        ManageModuleStreamsOnManagedInstanceGroupResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id",
                        ManageModuleStreamsOnManagedInstanceGroupResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<RemoveModuleStreamProfileFromManagedInstanceGroupResponse>
            removeModuleStreamProfileFromManagedInstanceGroup(
                    RemoveModuleStreamProfileFromManagedInstanceGroupRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    RemoveModuleStreamProfileFromManagedInstanceGroupRequest,
                                    RemoveModuleStreamProfileFromManagedInstanceGroupResponse>
                            handler) {

        Validate.notBlank(
                request.getManagedInstanceGroupId(), "managedInstanceGroupId must not be blank");
        Objects.requireNonNull(
                request.getRemoveModuleStreamProfileFromManagedInstanceGroupDetails(),
                "removeModuleStreamProfileFromManagedInstanceGroupDetails is required");

        return clientCall(
                        request, RemoveModuleStreamProfileFromManagedInstanceGroupResponse::builder)
                .logger(LOG, "removeModuleStreamProfileFromManagedInstanceGroup")
                .serviceDetails(
                        "ManagedInstanceGroup",
                        "RemoveModuleStreamProfileFromManagedInstanceGroup",
                        "https://docs.oracle.com/iaas/api/#/en/osmh/20220901/ManagedInstanceGroup/RemoveModuleStreamProfileFromManagedInstanceGroup")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(RemoveModuleStreamProfileFromManagedInstanceGroupRequest::builder)
                .basePath("/20220901")
                .appendPathParam("managedInstanceGroups")
                .appendPathParam(request.getManagedInstanceGroupId())
                .appendPathParam("actions")
                .appendPathParam("removeStreamProfile")
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("if-match", request.getIfMatch())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        RemoveModuleStreamProfileFromManagedInstanceGroupResponse.Builder
                                ::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id",
                        RemoveModuleStreamProfileFromManagedInstanceGroupResponse.Builder
                                ::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<RemovePackagesFromManagedInstanceGroupResponse>
            removePackagesFromManagedInstanceGroup(
                    RemovePackagesFromManagedInstanceGroupRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    RemovePackagesFromManagedInstanceGroupRequest,
                                    RemovePackagesFromManagedInstanceGroupResponse>
                            handler) {

        Validate.notBlank(
                request.getManagedInstanceGroupId(), "managedInstanceGroupId must not be blank");
        Objects.requireNonNull(
                request.getRemovePackagesFromManagedInstanceGroupDetails(),
                "removePackagesFromManagedInstanceGroupDetails is required");

        return clientCall(request, RemovePackagesFromManagedInstanceGroupResponse::builder)
                .logger(LOG, "removePackagesFromManagedInstanceGroup")
                .serviceDetails(
                        "ManagedInstanceGroup",
                        "RemovePackagesFromManagedInstanceGroup",
                        "https://docs.oracle.com/iaas/api/#/en/osmh/20220901/ManagedInstanceGroup/RemovePackagesFromManagedInstanceGroup")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(RemovePackagesFromManagedInstanceGroupRequest::builder)
                .basePath("/20220901")
                .appendPathParam("managedInstanceGroups")
                .appendPathParam(request.getManagedInstanceGroupId())
                .appendPathParam("actions")
                .appendPathParam("removePackages")
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("if-match", request.getIfMatch())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        RemovePackagesFromManagedInstanceGroupResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id",
                        RemovePackagesFromManagedInstanceGroupResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<SwitchModuleStreamOnManagedInstanceGroupResponse>
            switchModuleStreamOnManagedInstanceGroup(
                    SwitchModuleStreamOnManagedInstanceGroupRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    SwitchModuleStreamOnManagedInstanceGroupRequest,
                                    SwitchModuleStreamOnManagedInstanceGroupResponse>
                            handler) {

        Validate.notBlank(
                request.getManagedInstanceGroupId(), "managedInstanceGroupId must not be blank");
        Objects.requireNonNull(
                request.getSwitchModuleStreamOnManagedInstanceGroupDetails(),
                "switchModuleStreamOnManagedInstanceGroupDetails is required");

        return clientCall(request, SwitchModuleStreamOnManagedInstanceGroupResponse::builder)
                .logger(LOG, "switchModuleStreamOnManagedInstanceGroup")
                .serviceDetails(
                        "ManagedInstanceGroup",
                        "SwitchModuleStreamOnManagedInstanceGroup",
                        "https://docs.oracle.com/iaas/api/#/en/osmh/20220901/ManagedInstanceGroup/SwitchModuleStreamOnManagedInstanceGroup")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(SwitchModuleStreamOnManagedInstanceGroupRequest::builder)
                .basePath("/20220901")
                .appendPathParam("managedInstanceGroups")
                .appendPathParam(request.getManagedInstanceGroupId())
                .appendPathParam("actions")
                .appendPathParam("moduleStreams")
                .appendPathParam("switchModuleStream")
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("if-match", request.getIfMatch())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        SwitchModuleStreamOnManagedInstanceGroupResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id",
                        SwitchModuleStreamOnManagedInstanceGroupResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<UpdateAllPackagesOnManagedInstanceGroupResponse>
            updateAllPackagesOnManagedInstanceGroup(
                    UpdateAllPackagesOnManagedInstanceGroupRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    UpdateAllPackagesOnManagedInstanceGroupRequest,
                                    UpdateAllPackagesOnManagedInstanceGroupResponse>
                            handler) {

        Validate.notBlank(
                request.getManagedInstanceGroupId(), "managedInstanceGroupId must not be blank");
        Objects.requireNonNull(
                request.getUpdateAllPackagesOnManagedInstanceGroupDetails(),
                "updateAllPackagesOnManagedInstanceGroupDetails is required");

        return clientCall(request, UpdateAllPackagesOnManagedInstanceGroupResponse::builder)
                .logger(LOG, "updateAllPackagesOnManagedInstanceGroup")
                .serviceDetails(
                        "ManagedInstanceGroup",
                        "UpdateAllPackagesOnManagedInstanceGroup",
                        "https://docs.oracle.com/iaas/api/#/en/osmh/20220901/ManagedInstanceGroup/UpdateAllPackagesOnManagedInstanceGroup")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(UpdateAllPackagesOnManagedInstanceGroupRequest::builder)
                .basePath("/20220901")
                .appendPathParam("managedInstanceGroups")
                .appendPathParam(request.getManagedInstanceGroupId())
                .appendPathParam("actions")
                .appendPathParam("updateAllPackages")
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("if-match", request.getIfMatch())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        UpdateAllPackagesOnManagedInstanceGroupResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id",
                        UpdateAllPackagesOnManagedInstanceGroupResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<UpdateManagedInstanceGroupResponse>
            updateManagedInstanceGroup(
                    UpdateManagedInstanceGroupRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    UpdateManagedInstanceGroupRequest,
                                    UpdateManagedInstanceGroupResponse>
                            handler) {

        Validate.notBlank(
                request.getManagedInstanceGroupId(), "managedInstanceGroupId must not be blank");
        Objects.requireNonNull(
                request.getUpdateManagedInstanceGroupDetails(),
                "updateManagedInstanceGroupDetails is required");

        return clientCall(request, UpdateManagedInstanceGroupResponse::builder)
                .logger(LOG, "updateManagedInstanceGroup")
                .serviceDetails(
                        "ManagedInstanceGroup",
                        "UpdateManagedInstanceGroup",
                        "https://docs.oracle.com/iaas/api/#/en/osmh/20220901/ManagedInstanceGroup/UpdateManagedInstanceGroup")
                .method(com.oracle.bmc.http.client.Method.PUT)
                .requestBuilder(UpdateManagedInstanceGroupRequest::builder)
                .basePath("/20220901")
                .appendPathParam("managedInstanceGroups")
                .appendPathParam(request.getManagedInstanceGroupId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.osmanagementhub.model.ManagedInstanceGroup.class,
                        UpdateManagedInstanceGroupResponse.Builder::managedInstanceGroup)
                .handleResponseHeaderString(
                        "etag", UpdateManagedInstanceGroupResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", UpdateManagedInstanceGroupResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    /**
     * Create a new client instance.
     *
     * @param authenticationDetailsProvider The authentication details (see {@link Builder#build})
     * @deprecated Use the {@link #builder() builder} instead.
     */
    @Deprecated
    public ManagedInstanceGroupAsyncClient(
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
    public ManagedInstanceGroupAsyncClient(
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
    public ManagedInstanceGroupAsyncClient(
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
    public ManagedInstanceGroupAsyncClient(
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
    public ManagedInstanceGroupAsyncClient(
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
    public ManagedInstanceGroupAsyncClient(
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
    public ManagedInstanceGroupAsyncClient(
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

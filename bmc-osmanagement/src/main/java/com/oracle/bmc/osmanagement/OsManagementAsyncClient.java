/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.osmanagement;

import com.oracle.bmc.util.internal.Validate;
import com.oracle.bmc.osmanagement.requests.*;
import com.oracle.bmc.osmanagement.responses.*;

import java.util.Objects;

/**
 * Async client implementation for OsManagement service. <br>
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
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20190801")
public class OsManagementAsyncClient extends com.oracle.bmc.http.internal.BaseAsyncClient
        implements OsManagementAsync {
    /** Service instance for OsManagement. */
    public static final com.oracle.bmc.Service SERVICE =
            com.oracle.bmc.Services.serviceBuilder()
                    .serviceName("OSMANAGEMENT")
                    .serviceEndpointPrefix("")
                    .serviceEndpointTemplate("https://osms.{region}.oci.{secondLevelDomain}")
                    .build();

    private static final org.slf4j.Logger LOG =
            org.slf4j.LoggerFactory.getLogger(OsManagementAsyncClient.class);

    OsManagementAsyncClient(
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
            extends com.oracle.bmc.common.RegionalClientBuilder<Builder, OsManagementAsyncClient> {
        private Builder(com.oracle.bmc.Service service) {
            super(service);
            final String packageName = "osmanagement";
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
        public OsManagementAsyncClient build(
                @jakarta.annotation.Nonnull
                        com.oracle.bmc.auth.AbstractAuthenticationDetailsProvider
                                authenticationDetailsProvider) {
            return new OsManagementAsyncClient(this, authenticationDetailsProvider);
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
                        "OsManagement",
                        "AddPackagesToSoftwareSource",
                        "https://docs.oracle.com/iaas/api/#/en/os-management/20190801/SoftwareSource/AddPackagesToSoftwareSource")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(AddPackagesToSoftwareSourceRequest::builder)
                .basePath("/20190801")
                .appendPathParam("softwareSources")
                .appendPathParam(request.getSoftwareSourceId())
                .appendPathParam("actions")
                .appendPathParam("addPackages")
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-request-id", AddPackagesToSoftwareSourceResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<AttachChildSoftwareSourceToManagedInstanceResponse>
            attachChildSoftwareSourceToManagedInstance(
                    AttachChildSoftwareSourceToManagedInstanceRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    AttachChildSoftwareSourceToManagedInstanceRequest,
                                    AttachChildSoftwareSourceToManagedInstanceResponse>
                            handler) {

        Validate.notBlank(request.getManagedInstanceId(), "managedInstanceId must not be blank");
        Objects.requireNonNull(
                request.getAttachChildSoftwareSourceToManagedInstanceDetails(),
                "attachChildSoftwareSourceToManagedInstanceDetails is required");

        return clientCall(request, AttachChildSoftwareSourceToManagedInstanceResponse::builder)
                .logger(LOG, "attachChildSoftwareSourceToManagedInstance")
                .serviceDetails(
                        "OsManagement",
                        "AttachChildSoftwareSourceToManagedInstance",
                        "https://docs.oracle.com/iaas/api/#/en/os-management/20190801/ManagedInstance/AttachChildSoftwareSourceToManagedInstance")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(AttachChildSoftwareSourceToManagedInstanceRequest::builder)
                .basePath("/20190801")
                .appendPathParam("managedInstances")
                .appendPathParam(request.getManagedInstanceId())
                .appendPathParam("actions")
                .appendPathParam("attachChildSoftwareSource")
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-request-id",
                        AttachChildSoftwareSourceToManagedInstanceResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<AttachManagedInstanceToManagedInstanceGroupResponse>
            attachManagedInstanceToManagedInstanceGroup(
                    AttachManagedInstanceToManagedInstanceGroupRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    AttachManagedInstanceToManagedInstanceGroupRequest,
                                    AttachManagedInstanceToManagedInstanceGroupResponse>
                            handler) {

        Validate.notBlank(
                request.getManagedInstanceGroupId(), "managedInstanceGroupId must not be blank");
        Objects.requireNonNull(request.getManagedInstanceId(), "managedInstanceId is required");

        return clientCall(request, AttachManagedInstanceToManagedInstanceGroupResponse::builder)
                .logger(LOG, "attachManagedInstanceToManagedInstanceGroup")
                .serviceDetails(
                        "OsManagement",
                        "AttachManagedInstanceToManagedInstanceGroup",
                        "https://docs.oracle.com/iaas/api/#/en/os-management/20190801/ManagedInstanceGroup/AttachManagedInstanceToManagedInstanceGroup")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(AttachManagedInstanceToManagedInstanceGroupRequest::builder)
                .basePath("/20190801")
                .appendPathParam("managedInstanceGroups")
                .appendPathParam(request.getManagedInstanceGroupId())
                .appendPathParam("actions")
                .appendPathParam("attachManagedInstance")
                .appendQueryParam("managedInstanceId", request.getManagedInstanceId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .handleResponseHeaderString(
                        "opc-request-id",
                        AttachManagedInstanceToManagedInstanceGroupResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<AttachParentSoftwareSourceToManagedInstanceResponse>
            attachParentSoftwareSourceToManagedInstance(
                    AttachParentSoftwareSourceToManagedInstanceRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    AttachParentSoftwareSourceToManagedInstanceRequest,
                                    AttachParentSoftwareSourceToManagedInstanceResponse>
                            handler) {

        Validate.notBlank(request.getManagedInstanceId(), "managedInstanceId must not be blank");
        Objects.requireNonNull(
                request.getAttachParentSoftwareSourceToManagedInstanceDetails(),
                "attachParentSoftwareSourceToManagedInstanceDetails is required");

        return clientCall(request, AttachParentSoftwareSourceToManagedInstanceResponse::builder)
                .logger(LOG, "attachParentSoftwareSourceToManagedInstance")
                .serviceDetails(
                        "OsManagement",
                        "AttachParentSoftwareSourceToManagedInstance",
                        "https://docs.oracle.com/iaas/api/#/en/os-management/20190801/ManagedInstance/AttachParentSoftwareSourceToManagedInstance")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(AttachParentSoftwareSourceToManagedInstanceRequest::builder)
                .basePath("/20190801")
                .appendPathParam("managedInstances")
                .appendPathParam(request.getManagedInstanceId())
                .appendPathParam("actions")
                .appendPathParam("attachParentSoftwareSource")
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-request-id",
                        AttachParentSoftwareSourceToManagedInstanceResponse.Builder::opcRequestId)
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
                        "OsManagement",
                        "ChangeManagedInstanceGroupCompartment",
                        "https://docs.oracle.com/iaas/api/#/en/os-management/20190801/ManagedInstanceGroup/ChangeManagedInstanceGroupCompartment")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(ChangeManagedInstanceGroupCompartmentRequest::builder)
                .basePath("/20190801")
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
    public java.util.concurrent.Future<ChangeScheduledJobCompartmentResponse>
            changeScheduledJobCompartment(
                    ChangeScheduledJobCompartmentRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ChangeScheduledJobCompartmentRequest,
                                    ChangeScheduledJobCompartmentResponse>
                            handler) {

        Validate.notBlank(request.getScheduledJobId(), "scheduledJobId must not be blank");
        Objects.requireNonNull(
                request.getChangeScheduledJobCompartmentDetails(),
                "changeScheduledJobCompartmentDetails is required");

        return clientCall(request, ChangeScheduledJobCompartmentResponse::builder)
                .logger(LOG, "changeScheduledJobCompartment")
                .serviceDetails(
                        "OsManagement",
                        "ChangeScheduledJobCompartment",
                        "https://docs.oracle.com/iaas/api/#/en/os-management/20190801/ScheduledJob/ChangeScheduledJobCompartment")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(ChangeScheduledJobCompartmentRequest::builder)
                .basePath("/20190801")
                .appendPathParam("scheduledJobs")
                .appendPathParam(request.getScheduledJobId())
                .appendPathParam("actions")
                .appendPathParam("changeCompartment")
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-request-id",
                        ChangeScheduledJobCompartmentResponse.Builder::opcRequestId)
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
                        "OsManagement",
                        "ChangeSoftwareSourceCompartment",
                        "https://docs.oracle.com/iaas/api/#/en/os-management/20190801/SoftwareSource/ChangeSoftwareSourceCompartment")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(ChangeSoftwareSourceCompartmentRequest::builder)
                .basePath("/20190801")
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
                        "OsManagement",
                        "CreateManagedInstanceGroup",
                        "https://docs.oracle.com/iaas/api/#/en/os-management/20190801/ManagedInstanceGroup/CreateManagedInstanceGroup")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CreateManagedInstanceGroupRequest::builder)
                .basePath("/20190801")
                .appendPathParam("managedInstanceGroups")
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.osmanagement.model.ManagedInstanceGroup.class,
                        CreateManagedInstanceGroupResponse.Builder::managedInstanceGroup)
                .handleResponseHeaderString(
                        "Location", CreateManagedInstanceGroupResponse.Builder::location)
                .handleResponseHeaderString(
                        "opc-request-id", CreateManagedInstanceGroupResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "etag", CreateManagedInstanceGroupResponse.Builder::etag)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<CreateScheduledJobResponse> createScheduledJob(
            CreateScheduledJobRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            CreateScheduledJobRequest, CreateScheduledJobResponse>
                    handler) {
        Objects.requireNonNull(
                request.getCreateScheduledJobDetails(), "createScheduledJobDetails is required");

        return clientCall(request, CreateScheduledJobResponse::builder)
                .logger(LOG, "createScheduledJob")
                .serviceDetails(
                        "OsManagement",
                        "CreateScheduledJob",
                        "https://docs.oracle.com/iaas/api/#/en/os-management/20190801/ScheduledJob/CreateScheduledJob")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CreateScheduledJobRequest::builder)
                .basePath("/20190801")
                .appendPathParam("scheduledJobs")
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.osmanagement.model.ScheduledJob.class,
                        CreateScheduledJobResponse.Builder::scheduledJob)
                .handleResponseHeaderString(
                        "Location", CreateScheduledJobResponse.Builder::location)
                .handleResponseHeaderString(
                        "opc-request-id", CreateScheduledJobResponse.Builder::opcRequestId)
                .handleResponseHeaderString("etag", CreateScheduledJobResponse.Builder::etag)
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
                        "OsManagement",
                        "CreateSoftwareSource",
                        "https://docs.oracle.com/iaas/api/#/en/os-management/20190801/SoftwareSource/CreateSoftwareSource")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CreateSoftwareSourceRequest::builder)
                .basePath("/20190801")
                .appendPathParam("softwareSources")
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.osmanagement.model.SoftwareSource.class,
                        CreateSoftwareSourceResponse.Builder::softwareSource)
                .handleResponseHeaderString(
                        "Location", CreateSoftwareSourceResponse.Builder::location)
                .handleResponseHeaderString(
                        "opc-request-id", CreateSoftwareSourceResponse.Builder::opcRequestId)
                .handleResponseHeaderString("etag", CreateSoftwareSourceResponse.Builder::etag)
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
                        "OsManagement",
                        "DeleteManagedInstanceGroup",
                        "https://docs.oracle.com/iaas/api/#/en/os-management/20190801/ManagedInstanceGroup/DeleteManagedInstanceGroup")
                .method(com.oracle.bmc.http.client.Method.DELETE)
                .requestBuilder(DeleteManagedInstanceGroupRequest::builder)
                .basePath("/20190801")
                .appendPathParam("managedInstanceGroups")
                .appendPathParam(request.getManagedInstanceGroupId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("if-match", request.getIfMatch())
                .handleResponseHeaderString(
                        "opc-request-id", DeleteManagedInstanceGroupResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<DeleteScheduledJobResponse> deleteScheduledJob(
            DeleteScheduledJobRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            DeleteScheduledJobRequest, DeleteScheduledJobResponse>
                    handler) {

        Validate.notBlank(request.getScheduledJobId(), "scheduledJobId must not be blank");

        return clientCall(request, DeleteScheduledJobResponse::builder)
                .logger(LOG, "deleteScheduledJob")
                .serviceDetails(
                        "OsManagement",
                        "DeleteScheduledJob",
                        "https://docs.oracle.com/iaas/api/#/en/os-management/20190801/ScheduledJob/DeleteScheduledJob")
                .method(com.oracle.bmc.http.client.Method.DELETE)
                .requestBuilder(DeleteScheduledJobRequest::builder)
                .basePath("/20190801")
                .appendPathParam("scheduledJobs")
                .appendPathParam(request.getScheduledJobId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("if-match", request.getIfMatch())
                .handleResponseHeaderString(
                        "opc-request-id", DeleteScheduledJobResponse.Builder::opcRequestId)
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
                        "OsManagement",
                        "DeleteSoftwareSource",
                        "https://docs.oracle.com/iaas/api/#/en/os-management/20190801/SoftwareSource/DeleteSoftwareSource")
                .method(com.oracle.bmc.http.client.Method.DELETE)
                .requestBuilder(DeleteSoftwareSourceRequest::builder)
                .basePath("/20190801")
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
    public java.util.concurrent.Future<DetachChildSoftwareSourceFromManagedInstanceResponse>
            detachChildSoftwareSourceFromManagedInstance(
                    DetachChildSoftwareSourceFromManagedInstanceRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    DetachChildSoftwareSourceFromManagedInstanceRequest,
                                    DetachChildSoftwareSourceFromManagedInstanceResponse>
                            handler) {

        Validate.notBlank(request.getManagedInstanceId(), "managedInstanceId must not be blank");
        Objects.requireNonNull(
                request.getDetachChildSoftwareSourceFromManagedInstanceDetails(),
                "detachChildSoftwareSourceFromManagedInstanceDetails is required");

        return clientCall(request, DetachChildSoftwareSourceFromManagedInstanceResponse::builder)
                .logger(LOG, "detachChildSoftwareSourceFromManagedInstance")
                .serviceDetails(
                        "OsManagement",
                        "DetachChildSoftwareSourceFromManagedInstance",
                        "https://docs.oracle.com/iaas/api/#/en/os-management/20190801/ManagedInstance/DetachChildSoftwareSourceFromManagedInstance")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(DetachChildSoftwareSourceFromManagedInstanceRequest::builder)
                .basePath("/20190801")
                .appendPathParam("managedInstances")
                .appendPathParam(request.getManagedInstanceId())
                .appendPathParam("actions")
                .appendPathParam("detachChildSoftwareSource")
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-request-id",
                        DetachChildSoftwareSourceFromManagedInstanceResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<DetachManagedInstanceFromManagedInstanceGroupResponse>
            detachManagedInstanceFromManagedInstanceGroup(
                    DetachManagedInstanceFromManagedInstanceGroupRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    DetachManagedInstanceFromManagedInstanceGroupRequest,
                                    DetachManagedInstanceFromManagedInstanceGroupResponse>
                            handler) {

        Validate.notBlank(
                request.getManagedInstanceGroupId(), "managedInstanceGroupId must not be blank");
        Objects.requireNonNull(request.getManagedInstanceId(), "managedInstanceId is required");

        return clientCall(request, DetachManagedInstanceFromManagedInstanceGroupResponse::builder)
                .logger(LOG, "detachManagedInstanceFromManagedInstanceGroup")
                .serviceDetails(
                        "OsManagement",
                        "DetachManagedInstanceFromManagedInstanceGroup",
                        "https://docs.oracle.com/iaas/api/#/en/os-management/20190801/ManagedInstanceGroup/DetachManagedInstanceFromManagedInstanceGroup")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(DetachManagedInstanceFromManagedInstanceGroupRequest::builder)
                .basePath("/20190801")
                .appendPathParam("managedInstanceGroups")
                .appendPathParam(request.getManagedInstanceGroupId())
                .appendPathParam("actions")
                .appendPathParam("detachManagedInstance")
                .appendQueryParam("managedInstanceId", request.getManagedInstanceId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .handleResponseHeaderString(
                        "opc-request-id",
                        DetachManagedInstanceFromManagedInstanceGroupResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<DetachParentSoftwareSourceFromManagedInstanceResponse>
            detachParentSoftwareSourceFromManagedInstance(
                    DetachParentSoftwareSourceFromManagedInstanceRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    DetachParentSoftwareSourceFromManagedInstanceRequest,
                                    DetachParentSoftwareSourceFromManagedInstanceResponse>
                            handler) {

        Validate.notBlank(request.getManagedInstanceId(), "managedInstanceId must not be blank");
        Objects.requireNonNull(
                request.getDetachParentSoftwareSourceFromManagedInstanceDetails(),
                "detachParentSoftwareSourceFromManagedInstanceDetails is required");

        return clientCall(request, DetachParentSoftwareSourceFromManagedInstanceResponse::builder)
                .logger(LOG, "detachParentSoftwareSourceFromManagedInstance")
                .serviceDetails(
                        "OsManagement",
                        "DetachParentSoftwareSourceFromManagedInstance",
                        "https://docs.oracle.com/iaas/api/#/en/os-management/20190801/ManagedInstance/DetachParentSoftwareSourceFromManagedInstance")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(DetachParentSoftwareSourceFromManagedInstanceRequest::builder)
                .basePath("/20190801")
                .appendPathParam("managedInstances")
                .appendPathParam(request.getManagedInstanceId())
                .appendPathParam("actions")
                .appendPathParam("detachParentSoftwareSource")
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-request-id",
                        DetachParentSoftwareSourceFromManagedInstanceResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<DisableModuleStreamOnManagedInstanceResponse>
            disableModuleStreamOnManagedInstance(
                    DisableModuleStreamOnManagedInstanceRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    DisableModuleStreamOnManagedInstanceRequest,
                                    DisableModuleStreamOnManagedInstanceResponse>
                            handler) {

        Validate.notBlank(request.getManagedInstanceId(), "managedInstanceId must not be blank");
        Objects.requireNonNull(request.getModuleName(), "moduleName is required");

        return clientCall(request, DisableModuleStreamOnManagedInstanceResponse::builder)
                .logger(LOG, "disableModuleStreamOnManagedInstance")
                .serviceDetails(
                        "OsManagement",
                        "DisableModuleStreamOnManagedInstance",
                        "https://docs.oracle.com/iaas/api/#/en/os-management/20190801/ModuleStreamDetails/DisableModuleStreamOnManagedInstance")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(DisableModuleStreamOnManagedInstanceRequest::builder)
                .basePath("/20190801")
                .appendPathParam("managedInstances")
                .appendPathParam(request.getManagedInstanceId())
                .appendPathParam("actions")
                .appendPathParam("moduleStreams")
                .appendPathParam("disable")
                .appendQueryParam("moduleName", request.getModuleName())
                .appendQueryParam("streamName", request.getStreamName())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("if-match", request.getIfMatch())
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        DisableModuleStreamOnManagedInstanceResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id",
                        DisableModuleStreamOnManagedInstanceResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<EnableModuleStreamOnManagedInstanceResponse>
            enableModuleStreamOnManagedInstance(
                    EnableModuleStreamOnManagedInstanceRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    EnableModuleStreamOnManagedInstanceRequest,
                                    EnableModuleStreamOnManagedInstanceResponse>
                            handler) {

        Validate.notBlank(request.getManagedInstanceId(), "managedInstanceId must not be blank");
        Objects.requireNonNull(request.getModuleName(), "moduleName is required");

        return clientCall(request, EnableModuleStreamOnManagedInstanceResponse::builder)
                .logger(LOG, "enableModuleStreamOnManagedInstance")
                .serviceDetails(
                        "OsManagement",
                        "EnableModuleStreamOnManagedInstance",
                        "https://docs.oracle.com/iaas/api/#/en/os-management/20190801/ModuleStreamDetails/EnableModuleStreamOnManagedInstance")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(EnableModuleStreamOnManagedInstanceRequest::builder)
                .basePath("/20190801")
                .appendPathParam("managedInstances")
                .appendPathParam(request.getManagedInstanceId())
                .appendPathParam("actions")
                .appendPathParam("moduleStreams")
                .appendPathParam("enable")
                .appendQueryParam("moduleName", request.getModuleName())
                .appendQueryParam("streamName", request.getStreamName())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("if-match", request.getIfMatch())
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        EnableModuleStreamOnManagedInstanceResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id",
                        EnableModuleStreamOnManagedInstanceResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<GetErratumResponse> getErratum(
            GetErratumRequest request,
            final com.oracle.bmc.responses.AsyncHandler<GetErratumRequest, GetErratumResponse>
                    handler) {

        Validate.notBlank(request.getErratumId(), "erratumId must not be blank");

        return clientCall(request, GetErratumResponse::builder)
                .logger(LOG, "getErratum")
                .serviceDetails(
                        "OsManagement",
                        "GetErratum",
                        "https://docs.oracle.com/iaas/api/#/en/os-management/20190801/Erratum/GetErratum")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetErratumRequest::builder)
                .basePath("/20190801")
                .appendPathParam("errata")
                .appendPathParam(request.getErratumId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.osmanagement.model.Erratum.class,
                        GetErratumResponse.Builder::erratum)
                .handleResponseHeaderString(
                        "opc-request-id", GetErratumResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<GetManagedInstanceResponse> getManagedInstance(
            GetManagedInstanceRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetManagedInstanceRequest, GetManagedInstanceResponse>
                    handler) {

        Validate.notBlank(request.getManagedInstanceId(), "managedInstanceId must not be blank");

        return clientCall(request, GetManagedInstanceResponse::builder)
                .logger(LOG, "getManagedInstance")
                .serviceDetails(
                        "OsManagement",
                        "GetManagedInstance",
                        "https://docs.oracle.com/iaas/api/#/en/os-management/20190801/ManagedInstance/GetManagedInstance")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetManagedInstanceRequest::builder)
                .basePath("/20190801")
                .appendPathParam("managedInstances")
                .appendPathParam(request.getManagedInstanceId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.osmanagement.model.ManagedInstance.class,
                        GetManagedInstanceResponse.Builder::managedInstance)
                .handleResponseHeaderString("etag", GetManagedInstanceResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", GetManagedInstanceResponse.Builder::opcRequestId)
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
                        "OsManagement",
                        "GetManagedInstanceGroup",
                        "https://docs.oracle.com/iaas/api/#/en/os-management/20190801/ManagedInstanceGroup/GetManagedInstanceGroup")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetManagedInstanceGroupRequest::builder)
                .basePath("/20190801")
                .appendPathParam("managedInstanceGroups")
                .appendPathParam(request.getManagedInstanceGroupId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.osmanagement.model.ManagedInstanceGroup.class,
                        GetManagedInstanceGroupResponse.Builder::managedInstanceGroup)
                .handleResponseHeaderString("etag", GetManagedInstanceGroupResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", GetManagedInstanceGroupResponse.Builder::opcRequestId)
                .handleResponseHeaderFloat(
                        "retry-after", GetManagedInstanceGroupResponse.Builder::retryAfter)
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

        Validate.notBlank(request.getStreamName(), "streamName must not be blank");

        return clientCall(request, GetModuleStreamResponse::builder)
                .logger(LOG, "getModuleStream")
                .serviceDetails(
                        "OsManagement",
                        "GetModuleStream",
                        "https://docs.oracle.com/iaas/api/#/en/os-management/20190801/ModuleStream/GetModuleStream")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetModuleStreamRequest::builder)
                .basePath("/20190801")
                .appendPathParam("softwareSources")
                .appendPathParam(request.getSoftwareSourceId())
                .appendPathParam("modules")
                .appendPathParam(request.getModuleName())
                .appendPathParam("streams")
                .appendPathParam(request.getStreamName())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.osmanagement.model.ModuleStream.class,
                        GetModuleStreamResponse.Builder::moduleStream)
                .handleResponseHeaderString(
                        "opc-work-request-id", GetModuleStreamResponse.Builder::opcWorkRequestId)
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

        Validate.notBlank(request.getModuleName(), "moduleName must not be blank");

        Validate.notBlank(request.getStreamName(), "streamName must not be blank");

        Validate.notBlank(request.getProfileName(), "profileName must not be blank");

        return clientCall(request, GetModuleStreamProfileResponse::builder)
                .logger(LOG, "getModuleStreamProfile")
                .serviceDetails(
                        "OsManagement",
                        "GetModuleStreamProfile",
                        "https://docs.oracle.com/iaas/api/#/en/os-management/20190801/ModuleStreamProfile/GetModuleStreamProfile")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetModuleStreamProfileRequest::builder)
                .basePath("/20190801")
                .appendPathParam("softwareSources")
                .appendPathParam(request.getSoftwareSourceId())
                .appendPathParam("modules")
                .appendPathParam(request.getModuleName())
                .appendPathParam("streams")
                .appendPathParam(request.getStreamName())
                .appendPathParam("profiles")
                .appendPathParam(request.getProfileName())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.osmanagement.model.ModuleStreamProfile.class,
                        GetModuleStreamProfileResponse.Builder::moduleStreamProfile)
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        GetModuleStreamProfileResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", GetModuleStreamProfileResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<GetScheduledJobResponse> getScheduledJob(
            GetScheduledJobRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetScheduledJobRequest, GetScheduledJobResponse>
                    handler) {

        Validate.notBlank(request.getScheduledJobId(), "scheduledJobId must not be blank");

        return clientCall(request, GetScheduledJobResponse::builder)
                .logger(LOG, "getScheduledJob")
                .serviceDetails(
                        "OsManagement",
                        "GetScheduledJob",
                        "https://docs.oracle.com/iaas/api/#/en/os-management/20190801/ScheduledJob/GetScheduledJob")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetScheduledJobRequest::builder)
                .basePath("/20190801")
                .appendPathParam("scheduledJobs")
                .appendPathParam(request.getScheduledJobId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.osmanagement.model.ScheduledJob.class,
                        GetScheduledJobResponse.Builder::scheduledJob)
                .handleResponseHeaderString("etag", GetScheduledJobResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", GetScheduledJobResponse.Builder::opcRequestId)
                .handleResponseHeaderFloat(
                        "retry-after", GetScheduledJobResponse.Builder::retryAfter)
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
                        "OsManagement",
                        "GetSoftwarePackage",
                        "https://docs.oracle.com/iaas/api/#/en/os-management/20190801/SoftwareSource/GetSoftwarePackage")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetSoftwarePackageRequest::builder)
                .basePath("/20190801")
                .appendPathParam("softwareSources")
                .appendPathParam(request.getSoftwareSourceId())
                .appendPathParam("softwarePackages")
                .appendPathParam(request.getSoftwarePackageName())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.osmanagement.model.SoftwarePackage.class,
                        GetSoftwarePackageResponse.Builder::softwarePackage)
                .handleResponseHeaderString(
                        "opc-request-id", GetSoftwarePackageResponse.Builder::opcRequestId)
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
                        "OsManagement",
                        "GetSoftwareSource",
                        "https://docs.oracle.com/iaas/api/#/en/os-management/20190801/SoftwareSource/GetSoftwareSource")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetSoftwareSourceRequest::builder)
                .basePath("/20190801")
                .appendPathParam("softwareSources")
                .appendPathParam(request.getSoftwareSourceId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.osmanagement.model.SoftwareSource.class,
                        GetSoftwareSourceResponse.Builder::softwareSource)
                .handleResponseHeaderString("etag", GetSoftwareSourceResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", GetSoftwareSourceResponse.Builder::opcRequestId)
                .handleResponseHeaderFloat(
                        "retry-after", GetSoftwareSourceResponse.Builder::retryAfter)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<GetWindowsUpdateResponse> getWindowsUpdate(
            GetWindowsUpdateRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetWindowsUpdateRequest, GetWindowsUpdateResponse>
                    handler) {

        Validate.notBlank(request.getWindowsUpdate(), "windowsUpdate must not be blank");

        return clientCall(request, GetWindowsUpdateResponse::builder)
                .logger(LOG, "getWindowsUpdate")
                .serviceDetails(
                        "OsManagement",
                        "GetWindowsUpdate",
                        "https://docs.oracle.com/iaas/api/#/en/os-management/20190801/WindowsUpdate/GetWindowsUpdate")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetWindowsUpdateRequest::builder)
                .basePath("/20190801")
                .appendPathParam("updates")
                .appendPathParam(request.getWindowsUpdate())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.osmanagement.model.WindowsUpdate.class,
                        GetWindowsUpdateResponse.Builder::windowsUpdate)
                .handleResponseHeaderString(
                        "opc-request-id", GetWindowsUpdateResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<GetWorkRequestResponse> getWorkRequest(
            GetWorkRequestRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetWorkRequestRequest, GetWorkRequestResponse>
                    handler) {

        Validate.notBlank(request.getWorkRequestId(), "workRequestId must not be blank");

        return clientCall(request, GetWorkRequestResponse::builder)
                .logger(LOG, "getWorkRequest")
                .serviceDetails(
                        "OsManagement",
                        "GetWorkRequest",
                        "https://docs.oracle.com/iaas/api/#/en/os-management/20190801/WorkRequest/GetWorkRequest")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetWorkRequestRequest::builder)
                .basePath("/20190801")
                .appendPathParam("workRequests")
                .appendPathParam(request.getWorkRequestId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.osmanagement.model.WorkRequest.class,
                        GetWorkRequestResponse.Builder::workRequest)
                .handleResponseHeaderString("etag", GetWorkRequestResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", GetWorkRequestResponse.Builder::opcRequestId)
                .handleResponseHeaderFloat(
                        "retry-after", GetWorkRequestResponse.Builder::retryAfter)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<InstallAllPackageUpdatesOnManagedInstanceResponse>
            installAllPackageUpdatesOnManagedInstance(
                    InstallAllPackageUpdatesOnManagedInstanceRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    InstallAllPackageUpdatesOnManagedInstanceRequest,
                                    InstallAllPackageUpdatesOnManagedInstanceResponse>
                            handler) {

        Validate.notBlank(request.getManagedInstanceId(), "managedInstanceId must not be blank");

        return clientCall(request, InstallAllPackageUpdatesOnManagedInstanceResponse::builder)
                .logger(LOG, "installAllPackageUpdatesOnManagedInstance")
                .serviceDetails(
                        "OsManagement",
                        "InstallAllPackageUpdatesOnManagedInstance",
                        "https://docs.oracle.com/iaas/api/#/en/os-management/20190801/ManagedInstance/InstallAllPackageUpdatesOnManagedInstance")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(InstallAllPackageUpdatesOnManagedInstanceRequest::builder)
                .basePath("/20190801")
                .appendPathParam("managedInstances")
                .appendPathParam(request.getManagedInstanceId())
                .appendPathParam("actions")
                .appendPathParam("packages")
                .appendPathParam("updateAll")
                .appendEnumQueryParam("updateType", request.getUpdateType())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        InstallAllPackageUpdatesOnManagedInstanceResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id",
                        InstallAllPackageUpdatesOnManagedInstanceResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<InstallAllUpdatesOnManagedInstanceGroupResponse>
            installAllUpdatesOnManagedInstanceGroup(
                    InstallAllUpdatesOnManagedInstanceGroupRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    InstallAllUpdatesOnManagedInstanceGroupRequest,
                                    InstallAllUpdatesOnManagedInstanceGroupResponse>
                            handler) {

        Validate.notBlank(
                request.getManagedInstanceGroupId(), "managedInstanceGroupId must not be blank");

        return clientCall(request, InstallAllUpdatesOnManagedInstanceGroupResponse::builder)
                .logger(LOG, "installAllUpdatesOnManagedInstanceGroup")
                .serviceDetails(
                        "OsManagement",
                        "InstallAllUpdatesOnManagedInstanceGroup",
                        "https://docs.oracle.com/iaas/api/#/en/os-management/20190801/ManagedInstanceGroup/InstallAllUpdatesOnManagedInstanceGroup")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(InstallAllUpdatesOnManagedInstanceGroupRequest::builder)
                .basePath("/20190801")
                .appendPathParam("managedInstanceGroups")
                .appendPathParam(request.getManagedInstanceGroupId())
                .appendPathParam("actions")
                .appendPathParam("updates")
                .appendPathParam("installAll")
                .appendEnumQueryParam("updateType", request.getUpdateType())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        InstallAllUpdatesOnManagedInstanceGroupResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id",
                        InstallAllUpdatesOnManagedInstanceGroupResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<InstallAllWindowsUpdatesOnManagedInstanceResponse>
            installAllWindowsUpdatesOnManagedInstance(
                    InstallAllWindowsUpdatesOnManagedInstanceRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    InstallAllWindowsUpdatesOnManagedInstanceRequest,
                                    InstallAllWindowsUpdatesOnManagedInstanceResponse>
                            handler) {

        Validate.notBlank(request.getManagedInstanceId(), "managedInstanceId must not be blank");

        return clientCall(request, InstallAllWindowsUpdatesOnManagedInstanceResponse::builder)
                .logger(LOG, "installAllWindowsUpdatesOnManagedInstance")
                .serviceDetails(
                        "OsManagement",
                        "InstallAllWindowsUpdatesOnManagedInstance",
                        "https://docs.oracle.com/iaas/api/#/en/os-management/20190801/ManagedInstance/InstallAllWindowsUpdatesOnManagedInstance")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(InstallAllWindowsUpdatesOnManagedInstanceRequest::builder)
                .basePath("/20190801")
                .appendPathParam("managedInstances")
                .appendPathParam(request.getManagedInstanceId())
                .appendPathParam("actions")
                .appendPathParam("updates")
                .appendPathParam("installAll")
                .appendEnumQueryParam("updateType", request.getUpdateType())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        InstallAllWindowsUpdatesOnManagedInstanceResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id",
                        InstallAllWindowsUpdatesOnManagedInstanceResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<InstallModuleStreamProfileOnManagedInstanceResponse>
            installModuleStreamProfileOnManagedInstance(
                    InstallModuleStreamProfileOnManagedInstanceRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    InstallModuleStreamProfileOnManagedInstanceRequest,
                                    InstallModuleStreamProfileOnManagedInstanceResponse>
                            handler) {

        Validate.notBlank(request.getManagedInstanceId(), "managedInstanceId must not be blank");
        Objects.requireNonNull(request.getModuleName(), "moduleName is required");

        return clientCall(request, InstallModuleStreamProfileOnManagedInstanceResponse::builder)
                .logger(LOG, "installModuleStreamProfileOnManagedInstance")
                .serviceDetails(
                        "OsManagement",
                        "InstallModuleStreamProfileOnManagedInstance",
                        "https://docs.oracle.com/iaas/api/#/en/os-management/20190801/ModuleStreamProfileDetails/InstallModuleStreamProfileOnManagedInstance")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(InstallModuleStreamProfileOnManagedInstanceRequest::builder)
                .basePath("/20190801")
                .appendPathParam("managedInstances")
                .appendPathParam(request.getManagedInstanceId())
                .appendPathParam("actions")
                .appendPathParam("streamProfiles")
                .appendPathParam("install")
                .appendQueryParam("moduleName", request.getModuleName())
                .appendQueryParam("streamName", request.getStreamName())
                .appendQueryParam("profileName", request.getProfileName())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("if-match", request.getIfMatch())
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        InstallModuleStreamProfileOnManagedInstanceResponse.Builder
                                ::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id",
                        InstallModuleStreamProfileOnManagedInstanceResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<InstallPackageOnManagedInstanceResponse>
            installPackageOnManagedInstance(
                    InstallPackageOnManagedInstanceRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    InstallPackageOnManagedInstanceRequest,
                                    InstallPackageOnManagedInstanceResponse>
                            handler) {

        Validate.notBlank(request.getManagedInstanceId(), "managedInstanceId must not be blank");
        Objects.requireNonNull(request.getSoftwarePackageName(), "softwarePackageName is required");

        return clientCall(request, InstallPackageOnManagedInstanceResponse::builder)
                .logger(LOG, "installPackageOnManagedInstance")
                .serviceDetails(
                        "OsManagement",
                        "InstallPackageOnManagedInstance",
                        "https://docs.oracle.com/iaas/api/#/en/os-management/20190801/ManagedInstance/InstallPackageOnManagedInstance")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(InstallPackageOnManagedInstanceRequest::builder)
                .basePath("/20190801")
                .appendPathParam("managedInstances")
                .appendPathParam(request.getManagedInstanceId())
                .appendPathParam("actions")
                .appendPathParam("packages")
                .appendPathParam("install")
                .appendQueryParam("softwarePackageName", request.getSoftwarePackageName())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        InstallPackageOnManagedInstanceResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id",
                        InstallPackageOnManagedInstanceResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<InstallPackageUpdateOnManagedInstanceResponse>
            installPackageUpdateOnManagedInstance(
                    InstallPackageUpdateOnManagedInstanceRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    InstallPackageUpdateOnManagedInstanceRequest,
                                    InstallPackageUpdateOnManagedInstanceResponse>
                            handler) {

        Validate.notBlank(request.getManagedInstanceId(), "managedInstanceId must not be blank");
        Objects.requireNonNull(request.getSoftwarePackageName(), "softwarePackageName is required");

        return clientCall(request, InstallPackageUpdateOnManagedInstanceResponse::builder)
                .logger(LOG, "installPackageUpdateOnManagedInstance")
                .serviceDetails(
                        "OsManagement",
                        "InstallPackageUpdateOnManagedInstance",
                        "https://docs.oracle.com/iaas/api/#/en/os-management/20190801/ManagedInstance/InstallPackageUpdateOnManagedInstance")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(InstallPackageUpdateOnManagedInstanceRequest::builder)
                .basePath("/20190801")
                .appendPathParam("managedInstances")
                .appendPathParam(request.getManagedInstanceId())
                .appendPathParam("actions")
                .appendPathParam("packages")
                .appendPathParam("update")
                .appendQueryParam("softwarePackageName", request.getSoftwarePackageName())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        InstallPackageUpdateOnManagedInstanceResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id",
                        InstallPackageUpdateOnManagedInstanceResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<InstallWindowsUpdateOnManagedInstanceResponse>
            installWindowsUpdateOnManagedInstance(
                    InstallWindowsUpdateOnManagedInstanceRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    InstallWindowsUpdateOnManagedInstanceRequest,
                                    InstallWindowsUpdateOnManagedInstanceResponse>
                            handler) {

        Validate.notBlank(request.getManagedInstanceId(), "managedInstanceId must not be blank");
        Objects.requireNonNull(request.getWindowsUpdateName(), "windowsUpdateName is required");

        return clientCall(request, InstallWindowsUpdateOnManagedInstanceResponse::builder)
                .logger(LOG, "installWindowsUpdateOnManagedInstance")
                .serviceDetails(
                        "OsManagement",
                        "InstallWindowsUpdateOnManagedInstance",
                        "https://docs.oracle.com/iaas/api/#/en/os-management/20190801/ManagedInstance/InstallWindowsUpdateOnManagedInstance")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(InstallWindowsUpdateOnManagedInstanceRequest::builder)
                .basePath("/20190801")
                .appendPathParam("managedInstances")
                .appendPathParam(request.getManagedInstanceId())
                .appendPathParam("actions")
                .appendPathParam("updates")
                .appendPathParam("install")
                .appendQueryParam("windowsUpdateName", request.getWindowsUpdateName())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        InstallWindowsUpdateOnManagedInstanceResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id",
                        InstallWindowsUpdateOnManagedInstanceResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListAvailablePackagesForManagedInstanceResponse>
            listAvailablePackagesForManagedInstance(
                    ListAvailablePackagesForManagedInstanceRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ListAvailablePackagesForManagedInstanceRequest,
                                    ListAvailablePackagesForManagedInstanceResponse>
                            handler) {

        Validate.notBlank(request.getManagedInstanceId(), "managedInstanceId must not be blank");

        return clientCall(request, ListAvailablePackagesForManagedInstanceResponse::builder)
                .logger(LOG, "listAvailablePackagesForManagedInstance")
                .serviceDetails(
                        "OsManagement",
                        "ListAvailablePackagesForManagedInstance",
                        "https://docs.oracle.com/iaas/api/#/en/os-management/20190801/ManagedInstance/ListAvailablePackagesForManagedInstance")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListAvailablePackagesForManagedInstanceRequest::builder)
                .basePath("/20190801")
                .appendPathParam("managedInstances")
                .appendPathParam(request.getManagedInstanceId())
                .appendPathParam("packages")
                .appendPathParam("available")
                .appendQueryParam("displayName", request.getDisplayName())
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBodyList(
                        com.oracle.bmc.osmanagement.model.InstallablePackageSummary.class,
                        ListAvailablePackagesForManagedInstanceResponse.Builder::items)
                .handleResponseHeaderString(
                        "opc-request-id",
                        ListAvailablePackagesForManagedInstanceResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page",
                        ListAvailablePackagesForManagedInstanceResponse.Builder::opcNextPage)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListAvailableSoftwareSourcesForManagedInstanceResponse>
            listAvailableSoftwareSourcesForManagedInstance(
                    ListAvailableSoftwareSourcesForManagedInstanceRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ListAvailableSoftwareSourcesForManagedInstanceRequest,
                                    ListAvailableSoftwareSourcesForManagedInstanceResponse>
                            handler) {

        Validate.notBlank(request.getManagedInstanceId(), "managedInstanceId must not be blank");

        return clientCall(request, ListAvailableSoftwareSourcesForManagedInstanceResponse::builder)
                .logger(LOG, "listAvailableSoftwareSourcesForManagedInstance")
                .serviceDetails(
                        "OsManagement",
                        "ListAvailableSoftwareSourcesForManagedInstance",
                        "https://docs.oracle.com/iaas/api/#/en/os-management/20190801/ManagedInstance/ListAvailableSoftwareSourcesForManagedInstance")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListAvailableSoftwareSourcesForManagedInstanceRequest::builder)
                .basePath("/20190801")
                .appendPathParam("managedInstances")
                .appendPathParam(request.getManagedInstanceId())
                .appendPathParam("availableSoftwareSources")
                .appendQueryParam("displayName", request.getDisplayName())
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBodyList(
                        com.oracle.bmc.osmanagement.model.AvailableSoftwareSourceSummary.class,
                        ListAvailableSoftwareSourcesForManagedInstanceResponse.Builder::items)
                .handleResponseHeaderString(
                        "opc-request-id",
                        ListAvailableSoftwareSourcesForManagedInstanceResponse.Builder
                                ::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page",
                        ListAvailableSoftwareSourcesForManagedInstanceResponse.Builder::opcNextPage)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListAvailableUpdatesForManagedInstanceResponse>
            listAvailableUpdatesForManagedInstance(
                    ListAvailableUpdatesForManagedInstanceRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ListAvailableUpdatesForManagedInstanceRequest,
                                    ListAvailableUpdatesForManagedInstanceResponse>
                            handler) {

        Validate.notBlank(request.getManagedInstanceId(), "managedInstanceId must not be blank");

        return clientCall(request, ListAvailableUpdatesForManagedInstanceResponse::builder)
                .logger(LOG, "listAvailableUpdatesForManagedInstance")
                .serviceDetails(
                        "OsManagement",
                        "ListAvailableUpdatesForManagedInstance",
                        "https://docs.oracle.com/iaas/api/#/en/os-management/20190801/ManagedInstance/ListAvailableUpdatesForManagedInstance")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListAvailableUpdatesForManagedInstanceRequest::builder)
                .basePath("/20190801")
                .appendPathParam("managedInstances")
                .appendPathParam(request.getManagedInstanceId())
                .appendPathParam("packages")
                .appendPathParam("updates")
                .appendQueryParam("displayName", request.getDisplayName())
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBodyList(
                        com.oracle.bmc.osmanagement.model.AvailableUpdateSummary.class,
                        ListAvailableUpdatesForManagedInstanceResponse.Builder::items)
                .handleResponseHeaderString(
                        "opc-request-id",
                        ListAvailableUpdatesForManagedInstanceResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page",
                        ListAvailableUpdatesForManagedInstanceResponse.Builder::opcNextPage)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListAvailableWindowsUpdatesForManagedInstanceResponse>
            listAvailableWindowsUpdatesForManagedInstance(
                    ListAvailableWindowsUpdatesForManagedInstanceRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ListAvailableWindowsUpdatesForManagedInstanceRequest,
                                    ListAvailableWindowsUpdatesForManagedInstanceResponse>
                            handler) {

        Validate.notBlank(request.getManagedInstanceId(), "managedInstanceId must not be blank");

        return clientCall(request, ListAvailableWindowsUpdatesForManagedInstanceResponse::builder)
                .logger(LOG, "listAvailableWindowsUpdatesForManagedInstance")
                .serviceDetails(
                        "OsManagement",
                        "ListAvailableWindowsUpdatesForManagedInstance",
                        "https://docs.oracle.com/iaas/api/#/en/os-management/20190801/ManagedInstance/ListAvailableWindowsUpdatesForManagedInstance")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListAvailableWindowsUpdatesForManagedInstanceRequest::builder)
                .basePath("/20190801")
                .appendPathParam("managedInstances")
                .appendPathParam(request.getManagedInstanceId())
                .appendPathParam("updates")
                .appendPathParam("available")
                .appendQueryParam("displayName", request.getDisplayName())
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .appendEnumQueryParam(
                        "isEligibleForInstallation", request.getIsEligibleForInstallation())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBodyList(
                        com.oracle.bmc.osmanagement.model.AvailableWindowsUpdateSummary.class,
                        ListAvailableWindowsUpdatesForManagedInstanceResponse.Builder::items)
                .handleResponseHeaderString(
                        "opc-request-id",
                        ListAvailableWindowsUpdatesForManagedInstanceResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page",
                        ListAvailableWindowsUpdatesForManagedInstanceResponse.Builder::opcNextPage)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListErrataResponse> listErrata(
            ListErrataRequest request,
            final com.oracle.bmc.responses.AsyncHandler<ListErrataRequest, ListErrataResponse>
                    handler) {

        return clientCall(request, ListErrataResponse::builder)
                .logger(LOG, "listErrata")
                .serviceDetails(
                        "OsManagement",
                        "ListErrata",
                        "https://docs.oracle.com/iaas/api/#/en/os-management/20190801/ErratumSummary/ListErrata")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListErrataRequest::builder)
                .basePath("/20190801")
                .appendPathParam("errata")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendQueryParam("erratumId", request.getErratumId())
                .appendQueryParam("advisoryName", request.getAdvisoryName())
                .appendQueryParam("timeIssueDateStart", request.getTimeIssueDateStart())
                .appendQueryParam("timeIssueDateEnd", request.getTimeIssueDateEnd())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBodyList(
                        com.oracle.bmc.osmanagement.model.ErratumSummary.class,
                        ListErrataResponse.Builder::items)
                .handleResponseHeaderString(
                        "opc-request-id", ListErrataResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListErrataResponse.Builder::opcNextPage)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListManagedInstanceErrataResponse> listManagedInstanceErrata(
            ListManagedInstanceErrataRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListManagedInstanceErrataRequest, ListManagedInstanceErrataResponse>
                    handler) {

        Validate.notBlank(request.getManagedInstanceId(), "managedInstanceId must not be blank");

        return clientCall(request, ListManagedInstanceErrataResponse::builder)
                .logger(LOG, "listManagedInstanceErrata")
                .serviceDetails(
                        "OsManagement",
                        "ListManagedInstanceErrata",
                        "https://docs.oracle.com/iaas/api/#/en/os-management/20190801/ManagedInstance/ListManagedInstanceErrata")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListManagedInstanceErrataRequest::builder)
                .basePath("/20190801")
                .appendPathParam("managedInstances")
                .appendPathParam(request.getManagedInstanceId())
                .appendPathParam("errata")
                .appendQueryParam("displayName", request.getDisplayName())
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBodyList(
                        com.oracle.bmc.osmanagement.model.ErratumSummary.class,
                        ListManagedInstanceErrataResponse.Builder::items)
                .handleResponseHeaderString(
                        "opc-request-id", ListManagedInstanceErrataResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListManagedInstanceErrataResponse.Builder::opcNextPage)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListManagedInstanceGroupsResponse> listManagedInstanceGroups(
            ListManagedInstanceGroupsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListManagedInstanceGroupsRequest, ListManagedInstanceGroupsResponse>
                    handler) {
        Objects.requireNonNull(request.getCompartmentId(), "compartmentId is required");

        return clientCall(request, ListManagedInstanceGroupsResponse::builder)
                .logger(LOG, "listManagedInstanceGroups")
                .serviceDetails(
                        "OsManagement",
                        "ListManagedInstanceGroups",
                        "https://docs.oracle.com/iaas/api/#/en/os-management/20190801/ManagedInstanceGroupSummary/ListManagedInstanceGroups")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListManagedInstanceGroupsRequest::builder)
                .basePath("/20190801")
                .appendPathParam("managedInstanceGroups")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendQueryParam("displayName", request.getDisplayName())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .appendEnumQueryParam("lifecycleState", request.getLifecycleState())
                .appendEnumQueryParam("osFamily", request.getOsFamily())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBodyList(
                        com.oracle.bmc.osmanagement.model.ManagedInstanceGroupSummary.class,
                        ListManagedInstanceGroupsResponse.Builder::items)
                .handleResponseHeaderString(
                        "opc-request-id", ListManagedInstanceGroupsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListManagedInstanceGroupsResponse.Builder::opcNextPage)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListManagedInstancesResponse> listManagedInstances(
            ListManagedInstancesRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListManagedInstancesRequest, ListManagedInstancesResponse>
                    handler) {
        Objects.requireNonNull(request.getCompartmentId(), "compartmentId is required");

        return clientCall(request, ListManagedInstancesResponse::builder)
                .logger(LOG, "listManagedInstances")
                .serviceDetails(
                        "OsManagement",
                        "ListManagedInstances",
                        "https://docs.oracle.com/iaas/api/#/en/os-management/20190801/ManagedInstanceSummary/ListManagedInstances")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListManagedInstancesRequest::builder)
                .basePath("/20190801")
                .appendPathParam("managedInstances")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendQueryParam("displayName", request.getDisplayName())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .appendEnumQueryParam("osFamily", request.getOsFamily())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBodyList(
                        com.oracle.bmc.osmanagement.model.ManagedInstanceSummary.class,
                        ListManagedInstancesResponse.Builder::items)
                .handleResponseHeaderString(
                        "opc-request-id", ListManagedInstancesResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListManagedInstancesResponse.Builder::opcNextPage)
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
                        "OsManagement",
                        "ListModuleStreamProfiles",
                        "https://docs.oracle.com/iaas/api/#/en/os-management/20190801/ModuleStreamProfileSummary/ListModuleStreamProfiles")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListModuleStreamProfilesRequest::builder)
                .basePath("/20190801")
                .appendPathParam("softwareSources")
                .appendPathParam(request.getSoftwareSourceId())
                .appendPathParam("streamProfiles")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendQueryParam("moduleName", request.getModuleName())
                .appendQueryParam("streamName", request.getStreamName())
                .appendQueryParam("profileName", request.getProfileName())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBodyList(
                        com.oracle.bmc.osmanagement.model.ModuleStreamProfileSummary.class,
                        ListModuleStreamProfilesResponse.Builder::items)
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        ListModuleStreamProfilesResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", ListModuleStreamProfilesResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListModuleStreamProfilesResponse.Builder::opcNextPage)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListModuleStreamProfilesOnManagedInstanceResponse>
            listModuleStreamProfilesOnManagedInstance(
                    ListModuleStreamProfilesOnManagedInstanceRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ListModuleStreamProfilesOnManagedInstanceRequest,
                                    ListModuleStreamProfilesOnManagedInstanceResponse>
                            handler) {

        Validate.notBlank(request.getManagedInstanceId(), "managedInstanceId must not be blank");

        return clientCall(request, ListModuleStreamProfilesOnManagedInstanceResponse::builder)
                .logger(LOG, "listModuleStreamProfilesOnManagedInstance")
                .serviceDetails(
                        "OsManagement",
                        "ListModuleStreamProfilesOnManagedInstance",
                        "https://docs.oracle.com/iaas/api/#/en/os-management/20190801/ManagedInstance/ListModuleStreamProfilesOnManagedInstance")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListModuleStreamProfilesOnManagedInstanceRequest::builder)
                .basePath("/20190801")
                .appendPathParam("managedInstances")
                .appendPathParam(request.getManagedInstanceId())
                .appendPathParam("streamProfiles")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendQueryParam("moduleName", request.getModuleName())
                .appendQueryParam("streamName", request.getStreamName())
                .appendQueryParam("profileName", request.getProfileName())
                .appendEnumQueryParam("profileStatus", request.getProfileStatus())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBodyList(
                        com.oracle.bmc.osmanagement.model
                                .ModuleStreamProfileOnManagedInstanceSummary.class,
                        ListModuleStreamProfilesOnManagedInstanceResponse.Builder::items)
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        ListModuleStreamProfilesOnManagedInstanceResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id",
                        ListModuleStreamProfilesOnManagedInstanceResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page",
                        ListModuleStreamProfilesOnManagedInstanceResponse.Builder::opcNextPage)
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
                        "OsManagement",
                        "ListModuleStreams",
                        "https://docs.oracle.com/iaas/api/#/en/os-management/20190801/ModuleStreamSummary/ListModuleStreams")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListModuleStreamsRequest::builder)
                .basePath("/20190801")
                .appendPathParam("softwareSources")
                .appendPathParam(request.getSoftwareSourceId())
                .appendPathParam("moduleStreams")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendQueryParam("moduleName", request.getModuleName())
                .appendQueryParam("streamName", request.getStreamName())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBodyList(
                        com.oracle.bmc.osmanagement.model.ModuleStreamSummary.class,
                        ListModuleStreamsResponse.Builder::items)
                .handleResponseHeaderString(
                        "opc-work-request-id", ListModuleStreamsResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", ListModuleStreamsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListModuleStreamsResponse.Builder::opcNextPage)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListModuleStreamsOnManagedInstanceResponse>
            listModuleStreamsOnManagedInstance(
                    ListModuleStreamsOnManagedInstanceRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ListModuleStreamsOnManagedInstanceRequest,
                                    ListModuleStreamsOnManagedInstanceResponse>
                            handler) {

        Validate.notBlank(request.getManagedInstanceId(), "managedInstanceId must not be blank");

        return clientCall(request, ListModuleStreamsOnManagedInstanceResponse::builder)
                .logger(LOG, "listModuleStreamsOnManagedInstance")
                .serviceDetails(
                        "OsManagement",
                        "ListModuleStreamsOnManagedInstance",
                        "https://docs.oracle.com/iaas/api/#/en/os-management/20190801/ManagedInstance/ListModuleStreamsOnManagedInstance")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListModuleStreamsOnManagedInstanceRequest::builder)
                .basePath("/20190801")
                .appendPathParam("managedInstances")
                .appendPathParam(request.getManagedInstanceId())
                .appendPathParam("moduleStreams")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendQueryParam("moduleName", request.getModuleName())
                .appendQueryParam("streamName", request.getStreamName())
                .appendEnumQueryParam("streamStatus", request.getStreamStatus())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBodyList(
                        com.oracle.bmc.osmanagement.model.ModuleStreamOnManagedInstanceSummary
                                .class,
                        ListModuleStreamsOnManagedInstanceResponse.Builder::items)
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        ListModuleStreamsOnManagedInstanceResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id",
                        ListModuleStreamsOnManagedInstanceResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page",
                        ListModuleStreamsOnManagedInstanceResponse.Builder::opcNextPage)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListPackagesInstalledOnManagedInstanceResponse>
            listPackagesInstalledOnManagedInstance(
                    ListPackagesInstalledOnManagedInstanceRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ListPackagesInstalledOnManagedInstanceRequest,
                                    ListPackagesInstalledOnManagedInstanceResponse>
                            handler) {

        Validate.notBlank(request.getManagedInstanceId(), "managedInstanceId must not be blank");

        return clientCall(request, ListPackagesInstalledOnManagedInstanceResponse::builder)
                .logger(LOG, "listPackagesInstalledOnManagedInstance")
                .serviceDetails(
                        "OsManagement",
                        "ListPackagesInstalledOnManagedInstance",
                        "https://docs.oracle.com/iaas/api/#/en/os-management/20190801/ManagedInstance/ListPackagesInstalledOnManagedInstance")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListPackagesInstalledOnManagedInstanceRequest::builder)
                .basePath("/20190801")
                .appendPathParam("managedInstances")
                .appendPathParam(request.getManagedInstanceId())
                .appendPathParam("packages")
                .appendQueryParam("displayName", request.getDisplayName())
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBodyList(
                        com.oracle.bmc.osmanagement.model.InstalledPackageSummary.class,
                        ListPackagesInstalledOnManagedInstanceResponse.Builder::items)
                .handleResponseHeaderString(
                        "opc-request-id",
                        ListPackagesInstalledOnManagedInstanceResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page",
                        ListPackagesInstalledOnManagedInstanceResponse.Builder::opcNextPage)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListScheduledJobsResponse> listScheduledJobs(
            ListScheduledJobsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListScheduledJobsRequest, ListScheduledJobsResponse>
                    handler) {
        Objects.requireNonNull(request.getCompartmentId(), "compartmentId is required");

        return clientCall(request, ListScheduledJobsResponse::builder)
                .logger(LOG, "listScheduledJobs")
                .serviceDetails(
                        "OsManagement",
                        "ListScheduledJobs",
                        "https://docs.oracle.com/iaas/api/#/en/os-management/20190801/ScheduledJob/ListScheduledJobs")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListScheduledJobsRequest::builder)
                .basePath("/20190801")
                .appendPathParam("scheduledJobs")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendQueryParam("displayName", request.getDisplayName())
                .appendQueryParam("managedInstanceId", request.getManagedInstanceId())
                .appendQueryParam("managedInstanceGroupId", request.getManagedInstanceGroupId())
                .appendEnumQueryParam("operationType", request.getOperationType())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .appendEnumQueryParam("lifecycleState", request.getLifecycleState())
                .appendEnumQueryParam("osFamily", request.getOsFamily())
                .appendQueryParam("isRestricted", request.getIsRestricted())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBodyList(
                        com.oracle.bmc.osmanagement.model.ScheduledJobSummary.class,
                        ListScheduledJobsResponse.Builder::items)
                .handleResponseHeaderString(
                        "opc-request-id", ListScheduledJobsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListScheduledJobsResponse.Builder::opcNextPage)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListSoftwareSourcePackagesResponse>
            listSoftwareSourcePackages(
                    ListSoftwareSourcePackagesRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ListSoftwareSourcePackagesRequest,
                                    ListSoftwareSourcePackagesResponse>
                            handler) {

        Validate.notBlank(request.getSoftwareSourceId(), "softwareSourceId must not be blank");

        return clientCall(request, ListSoftwareSourcePackagesResponse::builder)
                .logger(LOG, "listSoftwareSourcePackages")
                .serviceDetails(
                        "OsManagement",
                        "ListSoftwareSourcePackages",
                        "https://docs.oracle.com/iaas/api/#/en/os-management/20190801/SoftwareSource/ListSoftwareSourcePackages")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListSoftwareSourcePackagesRequest::builder)
                .basePath("/20190801")
                .appendPathParam("softwareSources")
                .appendPathParam(request.getSoftwareSourceId())
                .appendPathParam("softwarePackages")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendQueryParam("displayName", request.getDisplayName())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBodyList(
                        com.oracle.bmc.osmanagement.model.SoftwarePackageSummary.class,
                        ListSoftwareSourcePackagesResponse.Builder::items)
                .handleResponseHeaderString(
                        "opc-request-id", ListSoftwareSourcePackagesResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListSoftwareSourcePackagesResponse.Builder::opcNextPage)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListSoftwareSourcesResponse> listSoftwareSources(
            ListSoftwareSourcesRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListSoftwareSourcesRequest, ListSoftwareSourcesResponse>
                    handler) {
        Objects.requireNonNull(request.getCompartmentId(), "compartmentId is required");

        return clientCall(request, ListSoftwareSourcesResponse::builder)
                .logger(LOG, "listSoftwareSources")
                .serviceDetails(
                        "OsManagement",
                        "ListSoftwareSources",
                        "https://docs.oracle.com/iaas/api/#/en/os-management/20190801/SoftwareSourceSummary/ListSoftwareSources")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListSoftwareSourcesRequest::builder)
                .basePath("/20190801")
                .appendPathParam("softwareSources")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendQueryParam("displayName", request.getDisplayName())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .appendEnumQueryParam("lifecycleState", request.getLifecycleState())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBodyList(
                        com.oracle.bmc.osmanagement.model.SoftwareSourceSummary.class,
                        ListSoftwareSourcesResponse.Builder::items)
                .handleResponseHeaderString(
                        "opc-request-id", ListSoftwareSourcesResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListSoftwareSourcesResponse.Builder::opcNextPage)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListUpcomingScheduledJobsResponse> listUpcomingScheduledJobs(
            ListUpcomingScheduledJobsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListUpcomingScheduledJobsRequest, ListUpcomingScheduledJobsResponse>
                    handler) {
        Objects.requireNonNull(request.getCompartmentId(), "compartmentId is required");

        Objects.requireNonNull(request.getTimeEnd(), "timeEnd is required");

        return clientCall(request, ListUpcomingScheduledJobsResponse::builder)
                .logger(LOG, "listUpcomingScheduledJobs")
                .serviceDetails(
                        "OsManagement",
                        "ListUpcomingScheduledJobs",
                        "https://docs.oracle.com/iaas/api/#/en/os-management/20190801/ScheduledJob/ListUpcomingScheduledJobs")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListUpcomingScheduledJobsRequest::builder)
                .basePath("/20190801")
                .appendPathParam("scheduledJobs")
                .appendPathParam("upcomingSchedules")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendQueryParam("displayName", request.getDisplayName())
                .appendQueryParam("timeEnd", request.getTimeEnd())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .appendQueryParam("tagName", request.getTagName())
                .appendQueryParam("tagValue", request.getTagValue())
                .appendEnumQueryParam("lifecycleState", request.getLifecycleState())
                .appendEnumQueryParam("osFamily", request.getOsFamily())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBodyList(
                        com.oracle.bmc.osmanagement.model.ScheduledJobSummary.class,
                        ListUpcomingScheduledJobsResponse.Builder::items)
                .handleResponseHeaderString(
                        "opc-request-id", ListUpcomingScheduledJobsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListUpcomingScheduledJobsResponse.Builder::opcNextPage)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListWindowsUpdatesResponse> listWindowsUpdates(
            ListWindowsUpdatesRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListWindowsUpdatesRequest, ListWindowsUpdatesResponse>
                    handler) {

        return clientCall(request, ListWindowsUpdatesResponse::builder)
                .logger(LOG, "listWindowsUpdates")
                .serviceDetails(
                        "OsManagement",
                        "ListWindowsUpdates",
                        "https://docs.oracle.com/iaas/api/#/en/os-management/20190801/WindowsUpdateSummary/ListWindowsUpdates")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListWindowsUpdatesRequest::builder)
                .basePath("/20190801")
                .appendPathParam("updates")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendQueryParam("displayName", request.getDisplayName())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBodyList(
                        com.oracle.bmc.osmanagement.model.WindowsUpdateSummary.class,
                        ListWindowsUpdatesResponse.Builder::items)
                .handleResponseHeaderString(
                        "opc-request-id", ListWindowsUpdatesResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListWindowsUpdatesResponse.Builder::opcNextPage)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListWindowsUpdatesInstalledOnManagedInstanceResponse>
            listWindowsUpdatesInstalledOnManagedInstance(
                    ListWindowsUpdatesInstalledOnManagedInstanceRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ListWindowsUpdatesInstalledOnManagedInstanceRequest,
                                    ListWindowsUpdatesInstalledOnManagedInstanceResponse>
                            handler) {

        Validate.notBlank(request.getManagedInstanceId(), "managedInstanceId must not be blank");

        return clientCall(request, ListWindowsUpdatesInstalledOnManagedInstanceResponse::builder)
                .logger(LOG, "listWindowsUpdatesInstalledOnManagedInstance")
                .serviceDetails(
                        "OsManagement",
                        "ListWindowsUpdatesInstalledOnManagedInstance",
                        "https://docs.oracle.com/iaas/api/#/en/os-management/20190801/ManagedInstance/ListWindowsUpdatesInstalledOnManagedInstance")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListWindowsUpdatesInstalledOnManagedInstanceRequest::builder)
                .basePath("/20190801")
                .appendPathParam("managedInstances")
                .appendPathParam(request.getManagedInstanceId())
                .appendPathParam("updates")
                .appendPathParam("installed")
                .appendQueryParam("displayName", request.getDisplayName())
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBodyList(
                        com.oracle.bmc.osmanagement.model.InstalledWindowsUpdateSummary.class,
                        ListWindowsUpdatesInstalledOnManagedInstanceResponse.Builder::items)
                .handleResponseHeaderString(
                        "opc-request-id",
                        ListWindowsUpdatesInstalledOnManagedInstanceResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page",
                        ListWindowsUpdatesInstalledOnManagedInstanceResponse.Builder::opcNextPage)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListWorkRequestErrorsResponse> listWorkRequestErrors(
            ListWorkRequestErrorsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListWorkRequestErrorsRequest, ListWorkRequestErrorsResponse>
                    handler) {

        Validate.notBlank(request.getWorkRequestId(), "workRequestId must not be blank");

        return clientCall(request, ListWorkRequestErrorsResponse::builder)
                .logger(LOG, "listWorkRequestErrors")
                .serviceDetails(
                        "OsManagement",
                        "ListWorkRequestErrors",
                        "https://docs.oracle.com/iaas/api/#/en/os-management/20190801/WorkRequest/ListWorkRequestErrors")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListWorkRequestErrorsRequest::builder)
                .basePath("/20190801")
                .appendPathParam("workRequests")
                .appendPathParam(request.getWorkRequestId())
                .appendPathParam("errors")
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBodyList(
                        com.oracle.bmc.osmanagement.model.WorkRequestError.class,
                        ListWorkRequestErrorsResponse.Builder::items)
                .handleResponseHeaderString(
                        "opc-request-id", ListWorkRequestErrorsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListWorkRequestErrorsResponse.Builder::opcNextPage)
                .handleResponseHeaderFloat(
                        "retry-after", ListWorkRequestErrorsResponse.Builder::retryAfter)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListWorkRequestLogsResponse> listWorkRequestLogs(
            ListWorkRequestLogsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListWorkRequestLogsRequest, ListWorkRequestLogsResponse>
                    handler) {

        Validate.notBlank(request.getWorkRequestId(), "workRequestId must not be blank");

        return clientCall(request, ListWorkRequestLogsResponse::builder)
                .logger(LOG, "listWorkRequestLogs")
                .serviceDetails(
                        "OsManagement",
                        "ListWorkRequestLogs",
                        "https://docs.oracle.com/iaas/api/#/en/os-management/20190801/WorkRequest/ListWorkRequestLogs")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListWorkRequestLogsRequest::builder)
                .basePath("/20190801")
                .appendPathParam("workRequests")
                .appendPathParam(request.getWorkRequestId())
                .appendPathParam("logs")
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBodyList(
                        com.oracle.bmc.osmanagement.model.WorkRequestLogEntry.class,
                        ListWorkRequestLogsResponse.Builder::items)
                .handleResponseHeaderString(
                        "opc-request-id", ListWorkRequestLogsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListWorkRequestLogsResponse.Builder::opcNextPage)
                .handleResponseHeaderFloat(
                        "retry-after", ListWorkRequestLogsResponse.Builder::retryAfter)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListWorkRequestsResponse> listWorkRequests(
            ListWorkRequestsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListWorkRequestsRequest, ListWorkRequestsResponse>
                    handler) {
        Objects.requireNonNull(request.getCompartmentId(), "compartmentId is required");

        return clientCall(request, ListWorkRequestsResponse::builder)
                .logger(LOG, "listWorkRequests")
                .serviceDetails(
                        "OsManagement",
                        "ListWorkRequests",
                        "https://docs.oracle.com/iaas/api/#/en/os-management/20190801/WorkRequestSummary/ListWorkRequests")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListWorkRequestsRequest::builder)
                .basePath("/20190801")
                .appendPathParam("workRequests")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendQueryParam("displayName", request.getDisplayName())
                .appendQueryParam("managedInstanceId", request.getManagedInstanceId())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .appendEnumQueryParam("osFamily", request.getOsFamily())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBodyList(
                        com.oracle.bmc.osmanagement.model.WorkRequestSummary.class,
                        ListWorkRequestsResponse.Builder::items)
                .handleResponseHeaderString(
                        "opc-request-id", ListWorkRequestsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListWorkRequestsResponse.Builder::opcNextPage)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ManageModuleStreamsOnManagedInstanceResponse>
            manageModuleStreamsOnManagedInstance(
                    ManageModuleStreamsOnManagedInstanceRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ManageModuleStreamsOnManagedInstanceRequest,
                                    ManageModuleStreamsOnManagedInstanceResponse>
                            handler) {

        Validate.notBlank(request.getManagedInstanceId(), "managedInstanceId must not be blank");
        Objects.requireNonNull(
                request.getManageModuleStreamsOnManagedInstanceDetails(),
                "manageModuleStreamsOnManagedInstanceDetails is required");

        return clientCall(request, ManageModuleStreamsOnManagedInstanceResponse::builder)
                .logger(LOG, "manageModuleStreamsOnManagedInstance")
                .serviceDetails(
                        "OsManagement",
                        "ManageModuleStreamsOnManagedInstance",
                        "https://docs.oracle.com/iaas/api/#/en/os-management/20190801/ManagedInstance/ManageModuleStreamsOnManagedInstance")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(ManageModuleStreamsOnManagedInstanceRequest::builder)
                .basePath("/20190801")
                .appendPathParam("managedInstances")
                .appendPathParam(request.getManagedInstanceId())
                .appendPathParam("actions")
                .appendPathParam("moduleStreams")
                .appendPathParam("manage")
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("if-match", request.getIfMatch())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        ManageModuleStreamsOnManagedInstanceResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id",
                        ManageModuleStreamsOnManagedInstanceResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<RemoveModuleStreamProfileFromManagedInstanceResponse>
            removeModuleStreamProfileFromManagedInstance(
                    RemoveModuleStreamProfileFromManagedInstanceRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    RemoveModuleStreamProfileFromManagedInstanceRequest,
                                    RemoveModuleStreamProfileFromManagedInstanceResponse>
                            handler) {

        Validate.notBlank(request.getManagedInstanceId(), "managedInstanceId must not be blank");
        Objects.requireNonNull(request.getModuleName(), "moduleName is required");

        return clientCall(request, RemoveModuleStreamProfileFromManagedInstanceResponse::builder)
                .logger(LOG, "removeModuleStreamProfileFromManagedInstance")
                .serviceDetails(
                        "OsManagement",
                        "RemoveModuleStreamProfileFromManagedInstance",
                        "https://docs.oracle.com/iaas/api/#/en/os-management/20190801/ModuleStreamProfileDetails/RemoveModuleStreamProfileFromManagedInstance")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(RemoveModuleStreamProfileFromManagedInstanceRequest::builder)
                .basePath("/20190801")
                .appendPathParam("managedInstances")
                .appendPathParam(request.getManagedInstanceId())
                .appendPathParam("actions")
                .appendPathParam("streamProfiles")
                .appendPathParam("remove")
                .appendQueryParam("moduleName", request.getModuleName())
                .appendQueryParam("streamName", request.getStreamName())
                .appendQueryParam("profileName", request.getProfileName())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("if-match", request.getIfMatch())
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        RemoveModuleStreamProfileFromManagedInstanceResponse.Builder
                                ::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id",
                        RemoveModuleStreamProfileFromManagedInstanceResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<RemovePackageFromManagedInstanceResponse>
            removePackageFromManagedInstance(
                    RemovePackageFromManagedInstanceRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    RemovePackageFromManagedInstanceRequest,
                                    RemovePackageFromManagedInstanceResponse>
                            handler) {

        Validate.notBlank(request.getManagedInstanceId(), "managedInstanceId must not be blank");
        Objects.requireNonNull(request.getSoftwarePackageName(), "softwarePackageName is required");

        return clientCall(request, RemovePackageFromManagedInstanceResponse::builder)
                .logger(LOG, "removePackageFromManagedInstance")
                .serviceDetails(
                        "OsManagement",
                        "RemovePackageFromManagedInstance",
                        "https://docs.oracle.com/iaas/api/#/en/os-management/20190801/ManagedInstance/RemovePackageFromManagedInstance")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(RemovePackageFromManagedInstanceRequest::builder)
                .basePath("/20190801")
                .appendPathParam("managedInstances")
                .appendPathParam(request.getManagedInstanceId())
                .appendPathParam("actions")
                .appendPathParam("packages")
                .appendPathParam("remove")
                .appendQueryParam("softwarePackageName", request.getSoftwarePackageName())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        RemovePackageFromManagedInstanceResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id",
                        RemovePackageFromManagedInstanceResponse.Builder::opcRequestId)
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
                        "OsManagement",
                        "RemovePackagesFromSoftwareSource",
                        "https://docs.oracle.com/iaas/api/#/en/os-management/20190801/SoftwareSource/RemovePackagesFromSoftwareSource")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(RemovePackagesFromSoftwareSourceRequest::builder)
                .basePath("/20190801")
                .appendPathParam("softwareSources")
                .appendPathParam(request.getSoftwareSourceId())
                .appendPathParam("actions")
                .appendPathParam("removePackages")
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-request-id",
                        RemovePackagesFromSoftwareSourceResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<RunScheduledJobNowResponse> runScheduledJobNow(
            RunScheduledJobNowRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            RunScheduledJobNowRequest, RunScheduledJobNowResponse>
                    handler) {

        Validate.notBlank(request.getScheduledJobId(), "scheduledJobId must not be blank");

        return clientCall(request, RunScheduledJobNowResponse::builder)
                .logger(LOG, "runScheduledJobNow")
                .serviceDetails(
                        "OsManagement",
                        "RunScheduledJobNow",
                        "https://docs.oracle.com/iaas/api/#/en/os-management/20190801/ScheduledJob/RunScheduledJobNow")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(RunScheduledJobNowRequest::builder)
                .basePath("/20190801")
                .appendPathParam("scheduledJobs")
                .appendPathParam(request.getScheduledJobId())
                .appendPathParam("actions")
                .appendPathParam("runNow")
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .handleResponseHeaderString("etag", RunScheduledJobNowResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", RunScheduledJobNowResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<SearchSoftwarePackagesResponse> searchSoftwarePackages(
            SearchSoftwarePackagesRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            SearchSoftwarePackagesRequest, SearchSoftwarePackagesResponse>
                    handler) {

        return clientCall(request, SearchSoftwarePackagesResponse::builder)
                .logger(LOG, "searchSoftwarePackages")
                .serviceDetails(
                        "OsManagement",
                        "SearchSoftwarePackages",
                        "https://docs.oracle.com/iaas/api/#/en/os-management/20190801/SoftwareSource/SearchSoftwarePackages")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(SearchSoftwarePackagesRequest::builder)
                .basePath("/20190801")
                .appendPathParam("softwareSources")
                .appendPathParam("softwarePackages")
                .appendQueryParam("softwarePackageName", request.getSoftwarePackageName())
                .appendQueryParam("displayName", request.getDisplayName())
                .appendQueryParam("cveName", request.getCveName())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBodyList(
                        com.oracle.bmc.osmanagement.model.SoftwarePackageSearchSummary.class,
                        SearchSoftwarePackagesResponse.Builder::items)
                .handleResponseHeaderString(
                        "opc-request-id", SearchSoftwarePackagesResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", SearchSoftwarePackagesResponse.Builder::opcNextPage)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<SkipNextScheduledJobExecutionResponse>
            skipNextScheduledJobExecution(
                    SkipNextScheduledJobExecutionRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    SkipNextScheduledJobExecutionRequest,
                                    SkipNextScheduledJobExecutionResponse>
                            handler) {

        Validate.notBlank(request.getScheduledJobId(), "scheduledJobId must not be blank");

        return clientCall(request, SkipNextScheduledJobExecutionResponse::builder)
                .logger(LOG, "skipNextScheduledJobExecution")
                .serviceDetails(
                        "OsManagement",
                        "SkipNextScheduledJobExecution",
                        "https://docs.oracle.com/iaas/api/#/en/os-management/20190801/ScheduledJob/SkipNextScheduledJobExecution")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(SkipNextScheduledJobExecutionRequest::builder)
                .basePath("/20190801")
                .appendPathParam("scheduledJobs")
                .appendPathParam(request.getScheduledJobId())
                .appendPathParam("actions")
                .appendPathParam("skipNextExecution")
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .handleResponseHeaderString(
                        "etag", SkipNextScheduledJobExecutionResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id",
                        SkipNextScheduledJobExecutionResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<SwitchModuleStreamOnManagedInstanceResponse>
            switchModuleStreamOnManagedInstance(
                    SwitchModuleStreamOnManagedInstanceRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    SwitchModuleStreamOnManagedInstanceRequest,
                                    SwitchModuleStreamOnManagedInstanceResponse>
                            handler) {

        Validate.notBlank(request.getManagedInstanceId(), "managedInstanceId must not be blank");
        Objects.requireNonNull(request.getModuleName(), "moduleName is required");

        return clientCall(request, SwitchModuleStreamOnManagedInstanceResponse::builder)
                .logger(LOG, "switchModuleStreamOnManagedInstance")
                .serviceDetails(
                        "OsManagement",
                        "SwitchModuleStreamOnManagedInstance",
                        "https://docs.oracle.com/iaas/api/#/en/os-management/20190801/ModuleStreamDetails/SwitchModuleStreamOnManagedInstance")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(SwitchModuleStreamOnManagedInstanceRequest::builder)
                .basePath("/20190801")
                .appendPathParam("managedInstances")
                .appendPathParam(request.getManagedInstanceId())
                .appendPathParam("actions")
                .appendPathParam("moduleStreams")
                .appendPathParam("switch")
                .appendQueryParam("moduleName", request.getModuleName())
                .appendQueryParam("streamName", request.getStreamName())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("if-match", request.getIfMatch())
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        SwitchModuleStreamOnManagedInstanceResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id",
                        SwitchModuleStreamOnManagedInstanceResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<UpdateManagedInstanceResponse> updateManagedInstance(
            UpdateManagedInstanceRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            UpdateManagedInstanceRequest, UpdateManagedInstanceResponse>
                    handler) {

        Validate.notBlank(request.getManagedInstanceId(), "managedInstanceId must not be blank");
        Objects.requireNonNull(
                request.getUpdateManagedInstanceDetails(),
                "updateManagedInstanceDetails is required");

        return clientCall(request, UpdateManagedInstanceResponse::builder)
                .logger(LOG, "updateManagedInstance")
                .serviceDetails(
                        "OsManagement",
                        "UpdateManagedInstance",
                        "https://docs.oracle.com/iaas/api/#/en/os-management/20190801/UpdateManagedInstanceDetails/UpdateManagedInstance")
                .method(com.oracle.bmc.http.client.Method.PUT)
                .requestBuilder(UpdateManagedInstanceRequest::builder)
                .basePath("/20190801")
                .appendPathParam("managedInstances")
                .appendPathParam(request.getManagedInstanceId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("if-match", request.getIfMatch())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.osmanagement.model.ManagedInstance.class,
                        UpdateManagedInstanceResponse.Builder::managedInstance)
                .handleResponseHeaderString("etag", UpdateManagedInstanceResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", UpdateManagedInstanceResponse.Builder::opcRequestId)
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
                        "OsManagement",
                        "UpdateManagedInstanceGroup",
                        "https://docs.oracle.com/iaas/api/#/en/os-management/20190801/ManagedInstanceGroup/UpdateManagedInstanceGroup")
                .method(com.oracle.bmc.http.client.Method.PUT)
                .requestBuilder(UpdateManagedInstanceGroupRequest::builder)
                .basePath("/20190801")
                .appendPathParam("managedInstanceGroups")
                .appendPathParam(request.getManagedInstanceGroupId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("if-match", request.getIfMatch())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.osmanagement.model.ManagedInstanceGroup.class,
                        UpdateManagedInstanceGroupResponse.Builder::managedInstanceGroup)
                .handleResponseHeaderString(
                        "etag", UpdateManagedInstanceGroupResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", UpdateManagedInstanceGroupResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<UpdateScheduledJobResponse> updateScheduledJob(
            UpdateScheduledJobRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            UpdateScheduledJobRequest, UpdateScheduledJobResponse>
                    handler) {

        Validate.notBlank(request.getScheduledJobId(), "scheduledJobId must not be blank");
        Objects.requireNonNull(
                request.getUpdateScheduledJobDetails(), "updateScheduledJobDetails is required");

        return clientCall(request, UpdateScheduledJobResponse::builder)
                .logger(LOG, "updateScheduledJob")
                .serviceDetails(
                        "OsManagement",
                        "UpdateScheduledJob",
                        "https://docs.oracle.com/iaas/api/#/en/os-management/20190801/ScheduledJob/UpdateScheduledJob")
                .method(com.oracle.bmc.http.client.Method.PUT)
                .requestBuilder(UpdateScheduledJobRequest::builder)
                .basePath("/20190801")
                .appendPathParam("scheduledJobs")
                .appendPathParam(request.getScheduledJobId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("if-match", request.getIfMatch())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.osmanagement.model.ScheduledJob.class,
                        UpdateScheduledJobResponse.Builder::scheduledJob)
                .handleResponseHeaderString("etag", UpdateScheduledJobResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", UpdateScheduledJobResponse.Builder::opcRequestId)
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
                        "OsManagement",
                        "UpdateSoftwareSource",
                        "https://docs.oracle.com/iaas/api/#/en/os-management/20190801/SoftwareSource/UpdateSoftwareSource")
                .method(com.oracle.bmc.http.client.Method.PUT)
                .requestBuilder(UpdateSoftwareSourceRequest::builder)
                .basePath("/20190801")
                .appendPathParam("softwareSources")
                .appendPathParam(request.getSoftwareSourceId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("if-match", request.getIfMatch())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.osmanagement.model.SoftwareSource.class,
                        UpdateSoftwareSourceResponse.Builder::softwareSource)
                .handleResponseHeaderString("etag", UpdateSoftwareSourceResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", UpdateSoftwareSourceResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    /**
     * Create a new client instance.
     *
     * @param authenticationDetailsProvider The authentication details (see {@link Builder#build})
     * @deprecated Use the {@link #builder() builder} instead.
     */
    @Deprecated
    public OsManagementAsyncClient(
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
    public OsManagementAsyncClient(
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
    public OsManagementAsyncClient(
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
    public OsManagementAsyncClient(
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
    public OsManagementAsyncClient(
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
    public OsManagementAsyncClient(
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
    public OsManagementAsyncClient(
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

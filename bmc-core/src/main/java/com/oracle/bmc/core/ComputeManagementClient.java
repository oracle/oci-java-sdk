/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.core;

import com.oracle.bmc.util.internal.Validate;
import com.oracle.bmc.core.requests.*;
import com.oracle.bmc.core.responses.*;
import com.oracle.bmc.circuitbreaker.CircuitBreakerConfiguration;
import com.oracle.bmc.util.CircuitBreakerUtils;

import java.util.Objects;

@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
public class ComputeManagementClient extends com.oracle.bmc.http.internal.BaseSyncClient
        implements ComputeManagement {
    /** Service instance for ComputeManagement. */
    public static final com.oracle.bmc.Service SERVICE =
            com.oracle.bmc.Services.serviceBuilder()
                    .serviceName("COMPUTEMANAGEMENT")
                    .serviceEndpointPrefix("iaas")
                    .serviceEndpointTemplate("https://iaas.{region}.{secondLevelDomain}")
                    .build();

    private static final org.slf4j.Logger LOG =
            org.slf4j.LoggerFactory.getLogger(ComputeManagementClient.class);

    protected final java.util.concurrent.ExecutorService executorService;
    private final ComputeManagementWaiters waiters;

    private final ComputeManagementPaginators paginators;

    ComputeManagementClient(
            com.oracle.bmc.common.ClientBuilderBase<?, ?> builder,
            com.oracle.bmc.auth.AbstractAuthenticationDetailsProvider authenticationDetailsProvider,
            java.util.concurrent.ExecutorService executorService) {
        super(
                builder,
                authenticationDetailsProvider,
                CircuitBreakerUtils.DEFAULT_CIRCUIT_BREAKER_CONFIGURATION);

        if (executorService == null) {
            // up to 50 (core) threads, time out after 60s idle, all daemon
            java.util.concurrent.ThreadPoolExecutor threadPoolExecutor =
                    new java.util.concurrent.ThreadPoolExecutor(
                            50,
                            50,
                            60L,
                            java.util.concurrent.TimeUnit.SECONDS,
                            new java.util.concurrent.LinkedBlockingQueue<Runnable>(),
                            com.oracle.bmc.internal.ClientThreadFactory.builder()
                                    .isDaemon(true)
                                    .nameFormat("ComputeManagement-waiters-%d")
                                    .build());
            threadPoolExecutor.allowCoreThreadTimeOut(true);

            executorService = threadPoolExecutor;
        }
        this.executorService = executorService;
        this.waiters = new ComputeManagementWaiters(executorService, this);

        this.paginators = new ComputeManagementPaginators(this);
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
            extends com.oracle.bmc.common.RegionalClientBuilder<Builder, ComputeManagementClient> {
        private java.util.concurrent.ExecutorService executorService;

        private Builder(com.oracle.bmc.Service service) {
            super(service);
            final String packageName = "core";
            com.oracle.bmc.internal.Alloy.throwDisabledServiceExceptionIfAppropriate(packageName);
            requestSignerFactory =
                    new com.oracle.bmc.http.signing.internal.DefaultRequestSignerFactory(
                            com.oracle.bmc.http.signing.SigningStrategy.STANDARD);
        }

        /**
         * Set the ExecutorService for the client to be created.
         *
         * @param executorService executorService
         * @return this builder
         */
        public Builder executorService(java.util.concurrent.ExecutorService executorService) {
            this.executorService = executorService;
            return this;
        }

        /**
         * Build the client.
         *
         * @param authenticationDetailsProvider authentication details provider
         * @return the client
         */
        public ComputeManagementClient build(
                @jakarta.annotation.Nonnull
                        com.oracle.bmc.auth.AbstractAuthenticationDetailsProvider
                                authenticationDetailsProvider) {
            return new ComputeManagementClient(
                    this, authenticationDetailsProvider, executorService);
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
    public AttachInstancePoolInstanceResponse attachInstancePoolInstance(
            AttachInstancePoolInstanceRequest request) {

        Validate.notBlank(request.getInstancePoolId(), "instancePoolId must not be blank");
        Objects.requireNonNull(
                request.getAttachInstancePoolInstanceDetails(),
                "attachInstancePoolInstanceDetails is required");

        return clientCall(request, AttachInstancePoolInstanceResponse::builder)
                .logger(LOG, "attachInstancePoolInstance")
                .serviceDetails("ComputeManagement", "AttachInstancePoolInstance", "")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(AttachInstancePoolInstanceRequest::builder)
                .basePath("/20160918")
                .appendPathParam("instancePools")
                .appendPathParam(request.getInstancePoolId())
                .appendPathParam("instances")
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.core.model.InstancePoolInstance.class,
                        AttachInstancePoolInstanceResponse.Builder::instancePoolInstance)
                .handleResponseHeaderString(
                        "opc-request-id", AttachInstancePoolInstanceResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "etag", AttachInstancePoolInstanceResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        AttachInstancePoolInstanceResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "location", AttachInstancePoolInstanceResponse.Builder::location)
                .callSync();
    }

    @Override
    public AttachLoadBalancerResponse attachLoadBalancer(AttachLoadBalancerRequest request) {

        Validate.notBlank(request.getInstancePoolId(), "instancePoolId must not be blank");
        Objects.requireNonNull(
                request.getAttachLoadBalancerDetails(), "attachLoadBalancerDetails is required");

        return clientCall(request, AttachLoadBalancerResponse::builder)
                .logger(LOG, "attachLoadBalancer")
                .serviceDetails(
                        "ComputeManagement",
                        "AttachLoadBalancer",
                        "https://docs.oracle.com/iaas/api/#/en/iaas/20160918/InstancePool/AttachLoadBalancer")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(AttachLoadBalancerRequest::builder)
                .basePath("/20160918")
                .appendPathParam("instancePools")
                .appendPathParam(request.getInstancePoolId())
                .appendPathParam("actions")
                .appendPathParam("attachLoadBalancer")
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("if-match", request.getIfMatch())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.core.model.InstancePool.class,
                        AttachLoadBalancerResponse.Builder::instancePool)
                .handleResponseHeaderString("etag", AttachLoadBalancerResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", AttachLoadBalancerResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public ChangeClusterNetworkCompartmentResponse changeClusterNetworkCompartment(
            ChangeClusterNetworkCompartmentRequest request) {

        Validate.notBlank(request.getClusterNetworkId(), "clusterNetworkId must not be blank");
        Objects.requireNonNull(
                request.getChangeClusterNetworkCompartmentDetails(),
                "changeClusterNetworkCompartmentDetails is required");

        return clientCall(request, ChangeClusterNetworkCompartmentResponse::builder)
                .logger(LOG, "changeClusterNetworkCompartment")
                .serviceDetails(
                        "ComputeManagement",
                        "ChangeClusterNetworkCompartment",
                        "https://docs.oracle.com/iaas/api/#/en/iaas/20160918/ClusterNetwork/ChangeClusterNetworkCompartment")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(ChangeClusterNetworkCompartmentRequest::builder)
                .basePath("/20160918")
                .appendPathParam("clusterNetworks")
                .appendPathParam(request.getClusterNetworkId())
                .appendPathParam("actions")
                .appendPathParam("changeCompartment")
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .hasBody()
                .handleResponseHeaderString(
                        "etag", ChangeClusterNetworkCompartmentResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id",
                        ChangeClusterNetworkCompartmentResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public ChangeInstanceConfigurationCompartmentResponse changeInstanceConfigurationCompartment(
            ChangeInstanceConfigurationCompartmentRequest request) {

        Validate.notBlank(
                request.getInstanceConfigurationId(), "instanceConfigurationId must not be blank");
        Objects.requireNonNull(
                request.getChangeInstanceConfigurationCompartmentDetails(),
                "changeInstanceConfigurationCompartmentDetails is required");

        return clientCall(request, ChangeInstanceConfigurationCompartmentResponse::builder)
                .logger(LOG, "changeInstanceConfigurationCompartment")
                .serviceDetails(
                        "ComputeManagement",
                        "ChangeInstanceConfigurationCompartment",
                        "https://docs.oracle.com/iaas/api/#/en/iaas/20160918/InstanceConfiguration/ChangeInstanceConfigurationCompartment")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(ChangeInstanceConfigurationCompartmentRequest::builder)
                .basePath("/20160918")
                .appendPathParam("instanceConfigurations")
                .appendPathParam(request.getInstanceConfigurationId())
                .appendPathParam("actions")
                .appendPathParam("changeCompartment")
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .hasBody()
                .handleResponseHeaderString(
                        "etag", ChangeInstanceConfigurationCompartmentResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id",
                        ChangeInstanceConfigurationCompartmentResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public ChangeInstancePoolCompartmentResponse changeInstancePoolCompartment(
            ChangeInstancePoolCompartmentRequest request) {

        Validate.notBlank(request.getInstancePoolId(), "instancePoolId must not be blank");
        Objects.requireNonNull(
                request.getChangeInstancePoolCompartmentDetails(),
                "changeInstancePoolCompartmentDetails is required");

        return clientCall(request, ChangeInstancePoolCompartmentResponse::builder)
                .logger(LOG, "changeInstancePoolCompartment")
                .serviceDetails(
                        "ComputeManagement",
                        "ChangeInstancePoolCompartment",
                        "https://docs.oracle.com/iaas/api/#/en/iaas/20160918/InstancePool/ChangeInstancePoolCompartment")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(ChangeInstancePoolCompartmentRequest::builder)
                .basePath("/20160918")
                .appendPathParam("instancePools")
                .appendPathParam(request.getInstancePoolId())
                .appendPathParam("actions")
                .appendPathParam("changeCompartment")
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .hasBody()
                .handleResponseHeaderString(
                        "etag", ChangeInstancePoolCompartmentResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id",
                        ChangeInstancePoolCompartmentResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public CreateClusterNetworkResponse createClusterNetwork(CreateClusterNetworkRequest request) {
        Objects.requireNonNull(
                request.getCreateClusterNetworkDetails(),
                "createClusterNetworkDetails is required");

        return clientCall(request, CreateClusterNetworkResponse::builder)
                .logger(LOG, "createClusterNetwork")
                .serviceDetails(
                        "ComputeManagement",
                        "CreateClusterNetwork",
                        "https://docs.oracle.com/iaas/api/#/en/iaas/20160918/ClusterNetwork/CreateClusterNetwork")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CreateClusterNetworkRequest::builder)
                .basePath("/20160918")
                .appendPathParam("clusterNetworks")
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.core.model.ClusterNetwork.class,
                        CreateClusterNetworkResponse.Builder::clusterNetwork)
                .handleResponseHeaderString("etag", CreateClusterNetworkResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", CreateClusterNetworkResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        CreateClusterNetworkResponse.Builder::opcWorkRequestId)
                .callSync();
    }

    @Override
    public CreateInstanceConfigurationResponse createInstanceConfiguration(
            CreateInstanceConfigurationRequest request) {
        Objects.requireNonNull(
                request.getCreateInstanceConfiguration(),
                "createInstanceConfiguration is required");

        return clientCall(request, CreateInstanceConfigurationResponse::builder)
                .logger(LOG, "createInstanceConfiguration")
                .serviceDetails(
                        "ComputeManagement",
                        "CreateInstanceConfiguration",
                        "https://docs.oracle.com/iaas/api/#/en/iaas/20160918/InstanceConfiguration/CreateInstanceConfiguration")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CreateInstanceConfigurationRequest::builder)
                .basePath("/20160918")
                .appendPathParam("instanceConfigurations")
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.core.model.InstanceConfiguration.class,
                        CreateInstanceConfigurationResponse.Builder::instanceConfiguration)
                .handleResponseHeaderString(
                        "etag", CreateInstanceConfigurationResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", CreateInstanceConfigurationResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public CreateInstancePoolResponse createInstancePool(CreateInstancePoolRequest request) {
        Objects.requireNonNull(
                request.getCreateInstancePoolDetails(), "createInstancePoolDetails is required");

        return clientCall(request, CreateInstancePoolResponse::builder)
                .logger(LOG, "createInstancePool")
                .serviceDetails(
                        "ComputeManagement",
                        "CreateInstancePool",
                        "https://docs.oracle.com/iaas/api/#/en/iaas/20160918/InstancePool/CreateInstancePool")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CreateInstancePoolRequest::builder)
                .basePath("/20160918")
                .appendPathParam("instancePools")
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.core.model.InstancePool.class,
                        CreateInstancePoolResponse.Builder::instancePool)
                .handleResponseHeaderString("etag", CreateInstancePoolResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", CreateInstancePoolResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public DeleteInstanceConfigurationResponse deleteInstanceConfiguration(
            DeleteInstanceConfigurationRequest request) {

        Validate.notBlank(
                request.getInstanceConfigurationId(), "instanceConfigurationId must not be blank");

        return clientCall(request, DeleteInstanceConfigurationResponse::builder)
                .logger(LOG, "deleteInstanceConfiguration")
                .serviceDetails("ComputeManagement", "DeleteInstanceConfiguration", "")
                .method(com.oracle.bmc.http.client.Method.DELETE)
                .requestBuilder(DeleteInstanceConfigurationRequest::builder)
                .basePath("/20160918")
                .appendPathParam("instanceConfigurations")
                .appendPathParam(request.getInstanceConfigurationId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .handleResponseHeaderString(
                        "opc-request-id", DeleteInstanceConfigurationResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public DetachInstancePoolInstanceResponse detachInstancePoolInstance(
            DetachInstancePoolInstanceRequest request) {

        Validate.notBlank(request.getInstancePoolId(), "instancePoolId must not be blank");
        Objects.requireNonNull(
                request.getDetachInstancePoolInstanceDetails(),
                "detachInstancePoolInstanceDetails is required");

        return clientCall(request, DetachInstancePoolInstanceResponse::builder)
                .logger(LOG, "detachInstancePoolInstance")
                .serviceDetails(
                        "ComputeManagement",
                        "DetachInstancePoolInstance",
                        "https://docs.oracle.com/iaas/api/#/en/iaas/20160918/InstancePoolInstance/DetachInstancePoolInstance")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(DetachInstancePoolInstanceRequest::builder)
                .basePath("/20160918")
                .appendPathParam("instancePools")
                .appendPathParam(request.getInstancePoolId())
                .appendPathParam("actions")
                .appendPathParam("detachInstance")
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-request-id", DetachInstancePoolInstanceResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        DetachInstancePoolInstanceResponse.Builder::opcWorkRequestId)
                .callSync();
    }

    @Override
    public DetachLoadBalancerResponse detachLoadBalancer(DetachLoadBalancerRequest request) {

        Validate.notBlank(request.getInstancePoolId(), "instancePoolId must not be blank");
        Objects.requireNonNull(
                request.getDetachLoadBalancerDetails(), "detachLoadBalancerDetails is required");

        return clientCall(request, DetachLoadBalancerResponse::builder)
                .logger(LOG, "detachLoadBalancer")
                .serviceDetails(
                        "ComputeManagement",
                        "DetachLoadBalancer",
                        "https://docs.oracle.com/iaas/api/#/en/iaas/20160918/InstancePool/DetachLoadBalancer")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(DetachLoadBalancerRequest::builder)
                .basePath("/20160918")
                .appendPathParam("instancePools")
                .appendPathParam(request.getInstancePoolId())
                .appendPathParam("actions")
                .appendPathParam("detachLoadBalancer")
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("if-match", request.getIfMatch())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.core.model.InstancePool.class,
                        DetachLoadBalancerResponse.Builder::instancePool)
                .handleResponseHeaderString("etag", DetachLoadBalancerResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", DetachLoadBalancerResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public GetClusterNetworkResponse getClusterNetwork(GetClusterNetworkRequest request) {

        Validate.notBlank(request.getClusterNetworkId(), "clusterNetworkId must not be blank");

        return clientCall(request, GetClusterNetworkResponse::builder)
                .logger(LOG, "getClusterNetwork")
                .serviceDetails(
                        "ComputeManagement",
                        "GetClusterNetwork",
                        "https://docs.oracle.com/iaas/api/#/en/iaas/20160918/ClusterNetwork/GetClusterNetwork")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetClusterNetworkRequest::builder)
                .basePath("/20160918")
                .appendPathParam("clusterNetworks")
                .appendPathParam(request.getClusterNetworkId())
                .accept("application/json")
                .handleBody(
                        com.oracle.bmc.core.model.ClusterNetwork.class,
                        GetClusterNetworkResponse.Builder::clusterNetwork)
                .handleResponseHeaderString("etag", GetClusterNetworkResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", GetClusterNetworkResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public GetInstanceConfigurationResponse getInstanceConfiguration(
            GetInstanceConfigurationRequest request) {

        Validate.notBlank(
                request.getInstanceConfigurationId(), "instanceConfigurationId must not be blank");

        return clientCall(request, GetInstanceConfigurationResponse::builder)
                .logger(LOG, "getInstanceConfiguration")
                .serviceDetails(
                        "ComputeManagement",
                        "GetInstanceConfiguration",
                        "https://docs.oracle.com/iaas/api/#/en/iaas/20160918/InstanceConfiguration/GetInstanceConfiguration")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetInstanceConfigurationRequest::builder)
                .basePath("/20160918")
                .appendPathParam("instanceConfigurations")
                .appendPathParam(request.getInstanceConfigurationId())
                .accept("application/json")
                .handleBody(
                        com.oracle.bmc.core.model.InstanceConfiguration.class,
                        GetInstanceConfigurationResponse.Builder::instanceConfiguration)
                .handleResponseHeaderString("etag", GetInstanceConfigurationResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", GetInstanceConfigurationResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public GetInstancePoolResponse getInstancePool(GetInstancePoolRequest request) {

        Validate.notBlank(request.getInstancePoolId(), "instancePoolId must not be blank");

        return clientCall(request, GetInstancePoolResponse::builder)
                .logger(LOG, "getInstancePool")
                .serviceDetails(
                        "ComputeManagement",
                        "GetInstancePool",
                        "https://docs.oracle.com/iaas/api/#/en/iaas/20160918/InstancePool/GetInstancePool")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetInstancePoolRequest::builder)
                .basePath("/20160918")
                .appendPathParam("instancePools")
                .appendPathParam(request.getInstancePoolId())
                .accept("application/json")
                .handleBody(
                        com.oracle.bmc.core.model.InstancePool.class,
                        GetInstancePoolResponse.Builder::instancePool)
                .handleResponseHeaderString("etag", GetInstancePoolResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", GetInstancePoolResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public GetInstancePoolInstanceResponse getInstancePoolInstance(
            GetInstancePoolInstanceRequest request) {

        Validate.notBlank(request.getInstancePoolId(), "instancePoolId must not be blank");

        Validate.notBlank(request.getInstanceId(), "instanceId must not be blank");

        return clientCall(request, GetInstancePoolInstanceResponse::builder)
                .logger(LOG, "getInstancePoolInstance")
                .serviceDetails(
                        "ComputeManagement",
                        "GetInstancePoolInstance",
                        "https://docs.oracle.com/iaas/api/#/en/iaas/20160918/InstancePoolInstance/GetInstancePoolInstance")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetInstancePoolInstanceRequest::builder)
                .basePath("/20160918")
                .appendPathParam("instancePools")
                .appendPathParam(request.getInstancePoolId())
                .appendPathParam("instances")
                .appendPathParam(request.getInstanceId())
                .accept("application/json")
                .handleBody(
                        com.oracle.bmc.core.model.InstancePoolInstance.class,
                        GetInstancePoolInstanceResponse.Builder::instancePoolInstance)
                .handleResponseHeaderString("etag", GetInstancePoolInstanceResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", GetInstancePoolInstanceResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public GetInstancePoolLoadBalancerAttachmentResponse getInstancePoolLoadBalancerAttachment(
            GetInstancePoolLoadBalancerAttachmentRequest request) {

        Validate.notBlank(request.getInstancePoolId(), "instancePoolId must not be blank");

        Validate.notBlank(
                request.getInstancePoolLoadBalancerAttachmentId(),
                "instancePoolLoadBalancerAttachmentId must not be blank");

        return clientCall(request, GetInstancePoolLoadBalancerAttachmentResponse::builder)
                .logger(LOG, "getInstancePoolLoadBalancerAttachment")
                .serviceDetails(
                        "ComputeManagement",
                        "GetInstancePoolLoadBalancerAttachment",
                        "https://docs.oracle.com/iaas/api/#/en/iaas/20160918/InstancePoolLoadBalancerAttachment/GetInstancePoolLoadBalancerAttachment")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetInstancePoolLoadBalancerAttachmentRequest::builder)
                .basePath("/20160918")
                .appendPathParam("instancePools")
                .appendPathParam(request.getInstancePoolId())
                .appendPathParam("loadBalancerAttachments")
                .appendPathParam(request.getInstancePoolLoadBalancerAttachmentId())
                .accept("application/json")
                .handleBody(
                        com.oracle.bmc.core.model.InstancePoolLoadBalancerAttachment.class,
                        GetInstancePoolLoadBalancerAttachmentResponse.Builder
                                ::instancePoolLoadBalancerAttachment)
                .handleResponseHeaderString(
                        "opc-request-id",
                        GetInstancePoolLoadBalancerAttachmentResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public LaunchInstanceConfigurationResponse launchInstanceConfiguration(
            LaunchInstanceConfigurationRequest request) {

        Validate.notBlank(
                request.getInstanceConfigurationId(), "instanceConfigurationId must not be blank");
        Objects.requireNonNull(
                request.getInstanceConfiguration(), "instanceConfiguration is required");

        return clientCall(request, LaunchInstanceConfigurationResponse::builder)
                .logger(LOG, "launchInstanceConfiguration")
                .serviceDetails(
                        "ComputeManagement",
                        "LaunchInstanceConfiguration",
                        "https://docs.oracle.com/iaas/api/#/en/iaas/20160918/Instance/LaunchInstanceConfiguration")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(LaunchInstanceConfigurationRequest::builder)
                .basePath("/20160918")
                .appendPathParam("instanceConfigurations")
                .appendPathParam(request.getInstanceConfigurationId())
                .appendPathParam("actions")
                .appendPathParam("launch")
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.core.model.Instance.class,
                        LaunchInstanceConfigurationResponse.Builder::instance)
                .handleResponseHeaderString(
                        "etag", LaunchInstanceConfigurationResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", LaunchInstanceConfigurationResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        LaunchInstanceConfigurationResponse.Builder::opcWorkRequestId)
                .callSync();
    }

    @Override
    public ListClusterNetworkInstancesResponse listClusterNetworkInstances(
            ListClusterNetworkInstancesRequest request) {
        Objects.requireNonNull(request.getCompartmentId(), "compartmentId is required");

        Validate.notBlank(request.getClusterNetworkId(), "clusterNetworkId must not be blank");

        return clientCall(request, ListClusterNetworkInstancesResponse::builder)
                .logger(LOG, "listClusterNetworkInstances")
                .serviceDetails(
                        "ComputeManagement",
                        "ListClusterNetworkInstances",
                        "https://docs.oracle.com/iaas/api/#/en/iaas/20160918/ClusterNetwork/ListClusterNetworkInstances")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListClusterNetworkInstancesRequest::builder)
                .basePath("/20160918")
                .appendPathParam("clusterNetworks")
                .appendPathParam(request.getClusterNetworkId())
                .appendPathParam("instances")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendQueryParam("displayName", request.getDisplayName())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .accept("application/json")
                .handleBodyList(
                        com.oracle.bmc.core.model.InstanceSummary.class,
                        ListClusterNetworkInstancesResponse.Builder::items)
                .handleResponseHeaderString(
                        "opc-next-page", ListClusterNetworkInstancesResponse.Builder::opcNextPage)
                .handleResponseHeaderString(
                        "opc-request-id", ListClusterNetworkInstancesResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public ListClusterNetworksResponse listClusterNetworks(ListClusterNetworksRequest request) {
        Objects.requireNonNull(request.getCompartmentId(), "compartmentId is required");

        return clientCall(request, ListClusterNetworksResponse::builder)
                .logger(LOG, "listClusterNetworks")
                .serviceDetails(
                        "ComputeManagement",
                        "ListClusterNetworks",
                        "https://docs.oracle.com/iaas/api/#/en/iaas/20160918/ClusterNetwork/ListClusterNetworks")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListClusterNetworksRequest::builder)
                .basePath("/20160918")
                .appendPathParam("clusterNetworks")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendQueryParam("displayName", request.getDisplayName())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("lifecycleState", request.getLifecycleState())
                .accept("application/json")
                .handleBodyList(
                        com.oracle.bmc.core.model.ClusterNetworkSummary.class,
                        ListClusterNetworksResponse.Builder::items)
                .handleResponseHeaderString(
                        "opc-next-page", ListClusterNetworksResponse.Builder::opcNextPage)
                .handleResponseHeaderString(
                        "opc-request-id", ListClusterNetworksResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public ListInstanceConfigurationsResponse listInstanceConfigurations(
            ListInstanceConfigurationsRequest request) {
        Objects.requireNonNull(request.getCompartmentId(), "compartmentId is required");

        return clientCall(request, ListInstanceConfigurationsResponse::builder)
                .logger(LOG, "listInstanceConfigurations")
                .serviceDetails(
                        "ComputeManagement",
                        "ListInstanceConfigurations",
                        "https://docs.oracle.com/iaas/api/#/en/iaas/20160918/InstanceConfigurationSummary/ListInstanceConfigurations")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListInstanceConfigurationsRequest::builder)
                .basePath("/20160918")
                .appendPathParam("instanceConfigurations")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .accept("application/json")
                .handleBodyList(
                        com.oracle.bmc.core.model.InstanceConfigurationSummary.class,
                        ListInstanceConfigurationsResponse.Builder::items)
                .handleResponseHeaderString(
                        "opc-next-page", ListInstanceConfigurationsResponse.Builder::opcNextPage)
                .handleResponseHeaderString(
                        "opc-request-id", ListInstanceConfigurationsResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public ListInstancePoolInstancesResponse listInstancePoolInstances(
            ListInstancePoolInstancesRequest request) {
        Objects.requireNonNull(request.getCompartmentId(), "compartmentId is required");

        Validate.notBlank(request.getInstancePoolId(), "instancePoolId must not be blank");

        return clientCall(request, ListInstancePoolInstancesResponse::builder)
                .logger(LOG, "listInstancePoolInstances")
                .serviceDetails(
                        "ComputeManagement",
                        "ListInstancePoolInstances",
                        "https://docs.oracle.com/iaas/api/#/en/iaas/20160918/InstanceSummary/ListInstancePoolInstances")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListInstancePoolInstancesRequest::builder)
                .basePath("/20160918")
                .appendPathParam("instancePools")
                .appendPathParam(request.getInstancePoolId())
                .appendPathParam("instances")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendQueryParam("displayName", request.getDisplayName())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .accept("application/json")
                .handleBodyList(
                        com.oracle.bmc.core.model.InstanceSummary.class,
                        ListInstancePoolInstancesResponse.Builder::items)
                .handleResponseHeaderString(
                        "opc-next-page", ListInstancePoolInstancesResponse.Builder::opcNextPage)
                .handleResponseHeaderString(
                        "opc-request-id", ListInstancePoolInstancesResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public ListInstancePoolsResponse listInstancePools(ListInstancePoolsRequest request) {
        Objects.requireNonNull(request.getCompartmentId(), "compartmentId is required");

        return clientCall(request, ListInstancePoolsResponse::builder)
                .logger(LOG, "listInstancePools")
                .serviceDetails(
                        "ComputeManagement",
                        "ListInstancePools",
                        "https://docs.oracle.com/iaas/api/#/en/iaas/20160918/InstancePoolSummary/ListInstancePools")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListInstancePoolsRequest::builder)
                .basePath("/20160918")
                .appendPathParam("instancePools")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendQueryParam("displayName", request.getDisplayName())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("lifecycleState", request.getLifecycleState())
                .accept("application/json")
                .handleBodyList(
                        com.oracle.bmc.core.model.InstancePoolSummary.class,
                        ListInstancePoolsResponse.Builder::items)
                .handleResponseHeaderString(
                        "opc-next-page", ListInstancePoolsResponse.Builder::opcNextPage)
                .handleResponseHeaderString(
                        "opc-request-id", ListInstancePoolsResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public ResetInstancePoolResponse resetInstancePool(ResetInstancePoolRequest request) {

        Validate.notBlank(request.getInstancePoolId(), "instancePoolId must not be blank");

        return clientCall(request, ResetInstancePoolResponse::builder)
                .logger(LOG, "resetInstancePool")
                .serviceDetails(
                        "ComputeManagement",
                        "ResetInstancePool",
                        "https://docs.oracle.com/iaas/api/#/en/iaas/20160918/InstancePool/ResetInstancePool")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(ResetInstancePoolRequest::builder)
                .basePath("/20160918")
                .appendPathParam("instancePools")
                .appendPathParam(request.getInstancePoolId())
                .appendPathParam("actions")
                .appendPathParam("reset")
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("if-match", request.getIfMatch())
                .handleBody(
                        com.oracle.bmc.core.model.InstancePool.class,
                        ResetInstancePoolResponse.Builder::instancePool)
                .handleResponseHeaderString("etag", ResetInstancePoolResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", ResetInstancePoolResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public SoftresetInstancePoolResponse softresetInstancePool(
            SoftresetInstancePoolRequest request) {

        Validate.notBlank(request.getInstancePoolId(), "instancePoolId must not be blank");

        return clientCall(request, SoftresetInstancePoolResponse::builder)
                .logger(LOG, "softresetInstancePool")
                .serviceDetails(
                        "ComputeManagement",
                        "SoftresetInstancePool",
                        "https://docs.oracle.com/iaas/api/#/en/iaas/20160918/InstancePool/SoftresetInstancePool")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(SoftresetInstancePoolRequest::builder)
                .basePath("/20160918")
                .appendPathParam("instancePools")
                .appendPathParam(request.getInstancePoolId())
                .appendPathParam("actions")
                .appendPathParam("softreset")
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("if-match", request.getIfMatch())
                .handleBody(
                        com.oracle.bmc.core.model.InstancePool.class,
                        SoftresetInstancePoolResponse.Builder::instancePool)
                .handleResponseHeaderString("etag", SoftresetInstancePoolResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", SoftresetInstancePoolResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public SoftstopInstancePoolResponse softstopInstancePool(SoftstopInstancePoolRequest request) {

        Validate.notBlank(request.getInstancePoolId(), "instancePoolId must not be blank");

        return clientCall(request, SoftstopInstancePoolResponse::builder)
                .logger(LOG, "softstopInstancePool")
                .serviceDetails(
                        "ComputeManagement",
                        "SoftstopInstancePool",
                        "https://docs.oracle.com/iaas/api/#/en/iaas/20160918/InstancePool/SoftstopInstancePool")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(SoftstopInstancePoolRequest::builder)
                .basePath("/20160918")
                .appendPathParam("instancePools")
                .appendPathParam(request.getInstancePoolId())
                .appendPathParam("actions")
                .appendPathParam("softstop")
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("if-match", request.getIfMatch())
                .handleBody(
                        com.oracle.bmc.core.model.InstancePool.class,
                        SoftstopInstancePoolResponse.Builder::instancePool)
                .handleResponseHeaderString("etag", SoftstopInstancePoolResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", SoftstopInstancePoolResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public StartInstancePoolResponse startInstancePool(StartInstancePoolRequest request) {

        Validate.notBlank(request.getInstancePoolId(), "instancePoolId must not be blank");

        return clientCall(request, StartInstancePoolResponse::builder)
                .logger(LOG, "startInstancePool")
                .serviceDetails(
                        "ComputeManagement",
                        "StartInstancePool",
                        "https://docs.oracle.com/iaas/api/#/en/iaas/20160918/InstancePool/StartInstancePool")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(StartInstancePoolRequest::builder)
                .basePath("/20160918")
                .appendPathParam("instancePools")
                .appendPathParam(request.getInstancePoolId())
                .appendPathParam("actions")
                .appendPathParam("start")
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("if-match", request.getIfMatch())
                .handleBody(
                        com.oracle.bmc.core.model.InstancePool.class,
                        StartInstancePoolResponse.Builder::instancePool)
                .handleResponseHeaderString("etag", StartInstancePoolResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", StartInstancePoolResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public StopInstancePoolResponse stopInstancePool(StopInstancePoolRequest request) {

        Validate.notBlank(request.getInstancePoolId(), "instancePoolId must not be blank");

        return clientCall(request, StopInstancePoolResponse::builder)
                .logger(LOG, "stopInstancePool")
                .serviceDetails(
                        "ComputeManagement",
                        "StopInstancePool",
                        "https://docs.oracle.com/iaas/api/#/en/iaas/20160918/InstancePool/StopInstancePool")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(StopInstancePoolRequest::builder)
                .basePath("/20160918")
                .appendPathParam("instancePools")
                .appendPathParam(request.getInstancePoolId())
                .appendPathParam("actions")
                .appendPathParam("stop")
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("if-match", request.getIfMatch())
                .handleBody(
                        com.oracle.bmc.core.model.InstancePool.class,
                        StopInstancePoolResponse.Builder::instancePool)
                .handleResponseHeaderString("etag", StopInstancePoolResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", StopInstancePoolResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public TerminateClusterNetworkResponse terminateClusterNetwork(
            TerminateClusterNetworkRequest request) {

        Validate.notBlank(request.getClusterNetworkId(), "clusterNetworkId must not be blank");

        return clientCall(request, TerminateClusterNetworkResponse::builder)
                .logger(LOG, "terminateClusterNetwork")
                .serviceDetails(
                        "ComputeManagement",
                        "TerminateClusterNetwork",
                        "https://docs.oracle.com/iaas/api/#/en/iaas/20160918/ClusterNetwork/TerminateClusterNetwork")
                .method(com.oracle.bmc.http.client.Method.DELETE)
                .requestBuilder(TerminateClusterNetworkRequest::builder)
                .basePath("/20160918")
                .appendPathParam("clusterNetworks")
                .appendPathParam(request.getClusterNetworkId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .handleResponseHeaderString(
                        "opc-request-id", TerminateClusterNetworkResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        TerminateClusterNetworkResponse.Builder::opcWorkRequestId)
                .callSync();
    }

    @Override
    public TerminateInstancePoolResponse terminateInstancePool(
            TerminateInstancePoolRequest request) {

        Validate.notBlank(request.getInstancePoolId(), "instancePoolId must not be blank");

        return clientCall(request, TerminateInstancePoolResponse::builder)
                .logger(LOG, "terminateInstancePool")
                .serviceDetails("ComputeManagement", "TerminateInstancePool", "")
                .method(com.oracle.bmc.http.client.Method.DELETE)
                .requestBuilder(TerminateInstancePoolRequest::builder)
                .basePath("/20160918")
                .appendPathParam("instancePools")
                .appendPathParam(request.getInstancePoolId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .handleResponseHeaderString(
                        "opc-request-id", TerminateInstancePoolResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public UpdateClusterNetworkResponse updateClusterNetwork(UpdateClusterNetworkRequest request) {

        Validate.notBlank(request.getClusterNetworkId(), "clusterNetworkId must not be blank");
        Objects.requireNonNull(
                request.getUpdateClusterNetworkDetails(),
                "updateClusterNetworkDetails is required");

        return clientCall(request, UpdateClusterNetworkResponse::builder)
                .logger(LOG, "updateClusterNetwork")
                .serviceDetails(
                        "ComputeManagement",
                        "UpdateClusterNetwork",
                        "https://docs.oracle.com/iaas/api/#/en/iaas/20160918/ClusterNetwork/UpdateClusterNetwork")
                .method(com.oracle.bmc.http.client.Method.PUT)
                .requestBuilder(UpdateClusterNetworkRequest::builder)
                .basePath("/20160918")
                .appendPathParam("clusterNetworks")
                .appendPathParam(request.getClusterNetworkId())
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("if-match", request.getIfMatch())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.core.model.ClusterNetwork.class,
                        UpdateClusterNetworkResponse.Builder::clusterNetwork)
                .handleResponseHeaderString("etag", UpdateClusterNetworkResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", UpdateClusterNetworkResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public UpdateInstanceConfigurationResponse updateInstanceConfiguration(
            UpdateInstanceConfigurationRequest request) {

        Validate.notBlank(
                request.getInstanceConfigurationId(), "instanceConfigurationId must not be blank");
        Objects.requireNonNull(
                request.getUpdateInstanceConfigurationDetails(),
                "updateInstanceConfigurationDetails is required");

        return clientCall(request, UpdateInstanceConfigurationResponse::builder)
                .logger(LOG, "updateInstanceConfiguration")
                .serviceDetails(
                        "ComputeManagement",
                        "UpdateInstanceConfiguration",
                        "https://docs.oracle.com/iaas/api/#/en/iaas/20160918/InstanceConfiguration/UpdateInstanceConfiguration")
                .method(com.oracle.bmc.http.client.Method.PUT)
                .requestBuilder(UpdateInstanceConfigurationRequest::builder)
                .basePath("/20160918")
                .appendPathParam("instanceConfigurations")
                .appendPathParam(request.getInstanceConfigurationId())
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("if-match", request.getIfMatch())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.core.model.InstanceConfiguration.class,
                        UpdateInstanceConfigurationResponse.Builder::instanceConfiguration)
                .handleResponseHeaderString(
                        "etag", UpdateInstanceConfigurationResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", UpdateInstanceConfigurationResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public UpdateInstancePoolResponse updateInstancePool(UpdateInstancePoolRequest request) {

        Validate.notBlank(request.getInstancePoolId(), "instancePoolId must not be blank");
        Objects.requireNonNull(
                request.getUpdateInstancePoolDetails(), "updateInstancePoolDetails is required");

        return clientCall(request, UpdateInstancePoolResponse::builder)
                .logger(LOG, "updateInstancePool")
                .serviceDetails(
                        "ComputeManagement",
                        "UpdateInstancePool",
                        "https://docs.oracle.com/iaas/api/#/en/iaas/20160918/InstancePool/UpdateInstancePool")
                .method(com.oracle.bmc.http.client.Method.PUT)
                .requestBuilder(UpdateInstancePoolRequest::builder)
                .basePath("/20160918")
                .appendPathParam("instancePools")
                .appendPathParam(request.getInstancePoolId())
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("if-match", request.getIfMatch())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.core.model.InstancePool.class,
                        UpdateInstancePoolResponse.Builder::instancePool)
                .handleResponseHeaderString("etag", UpdateInstancePoolResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", UpdateInstancePoolResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public ComputeManagementWaiters getWaiters() {
        return waiters;
    }

    @Override
    public ComputeManagementWaiters newWaiters(
            com.oracle.bmc.workrequests.WorkRequest workRequestClient) {
        return new ComputeManagementWaiters(executorService, this, workRequestClient);
    }

    @Override
    public ComputeManagementPaginators getPaginators() {
        return paginators;
    }

    /**
     * Create a new client instance.
     *
     * @param authenticationDetailsProvider The authentication details (see {@link Builder#build})
     * @deprecated Use the {@link #builder() builder} instead.
     */
    @Deprecated
    public ComputeManagementClient(
            com.oracle.bmc.auth.BasicAuthenticationDetailsProvider authenticationDetailsProvider) {
        this(builder(), authenticationDetailsProvider, null);
    }

    /**
     * Create a new client instance.
     *
     * @param authenticationDetailsProvider The authentication details (see {@link Builder#build})
     * @param configuration {@link Builder#configuration}
     * @deprecated Use the {@link #builder() builder} instead.
     */
    @Deprecated
    public ComputeManagementClient(
            com.oracle.bmc.auth.BasicAuthenticationDetailsProvider authenticationDetailsProvider,
            com.oracle.bmc.ClientConfiguration configuration) {
        this(builder().configuration(configuration), authenticationDetailsProvider, null);
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
    public ComputeManagementClient(
            com.oracle.bmc.auth.BasicAuthenticationDetailsProvider authenticationDetailsProvider,
            com.oracle.bmc.ClientConfiguration configuration,
            com.oracle.bmc.http.ClientConfigurator clientConfigurator) {
        this(
                builder().configuration(configuration).clientConfigurator(clientConfigurator),
                authenticationDetailsProvider,
                null);
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
    public ComputeManagementClient(
            com.oracle.bmc.auth.AbstractAuthenticationDetailsProvider authenticationDetailsProvider,
            com.oracle.bmc.ClientConfiguration configuration,
            com.oracle.bmc.http.ClientConfigurator clientConfigurator,
            com.oracle.bmc.http.signing.RequestSignerFactory defaultRequestSignerFactory) {
        this(
                builder()
                        .configuration(configuration)
                        .clientConfigurator(clientConfigurator)
                        .requestSignerFactory(defaultRequestSignerFactory),
                authenticationDetailsProvider,
                null);
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
    public ComputeManagementClient(
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
                authenticationDetailsProvider,
                null);
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
    public ComputeManagementClient(
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
                authenticationDetailsProvider,
                null);
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
    public ComputeManagementClient(
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
                authenticationDetailsProvider,
                null);
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
     * @param executorService {@link Builder#executorService}
     * @deprecated Use the {@link #builder() builder} instead.
     */
    @Deprecated
    public ComputeManagementClient(
            com.oracle.bmc.auth.AbstractAuthenticationDetailsProvider authenticationDetailsProvider,
            com.oracle.bmc.ClientConfiguration configuration,
            com.oracle.bmc.http.ClientConfigurator clientConfigurator,
            com.oracle.bmc.http.signing.RequestSignerFactory defaultRequestSignerFactory,
            java.util.Map<
                            com.oracle.bmc.http.signing.SigningStrategy,
                            com.oracle.bmc.http.signing.RequestSignerFactory>
                    signingStrategyRequestSignerFactories,
            java.util.List<com.oracle.bmc.http.ClientConfigurator> additionalClientConfigurators,
            String endpoint,
            java.util.concurrent.ExecutorService executorService) {
        this(
                builder()
                        .configuration(configuration)
                        .clientConfigurator(clientConfigurator)
                        .requestSignerFactory(defaultRequestSignerFactory)
                        .additionalClientConfigurators(additionalClientConfigurators)
                        .endpoint(endpoint)
                        .signingStrategyRequestSignerFactories(
                                signingStrategyRequestSignerFactories),
                authenticationDetailsProvider,
                executorService);
    }
}

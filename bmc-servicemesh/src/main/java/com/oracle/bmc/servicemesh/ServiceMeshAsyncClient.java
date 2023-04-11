/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.servicemesh;

import com.oracle.bmc.util.internal.Validate;
import com.oracle.bmc.servicemesh.requests.*;
import com.oracle.bmc.servicemesh.responses.*;

import java.util.Objects;

/**
 * Async client implementation for ServiceMesh service. <br>
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
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20220615")
public class ServiceMeshAsyncClient extends com.oracle.bmc.http.internal.BaseAsyncClient
        implements ServiceMeshAsync {
    /** Service instance for ServiceMesh. */
    public static final com.oracle.bmc.Service SERVICE =
            com.oracle.bmc.Services.serviceBuilder()
                    .serviceName("SERVICEMESH")
                    .serviceEndpointPrefix("")
                    .serviceEndpointTemplate("https://servicemesh.{region}.oci.{secondLevelDomain}")
                    .build();

    private static final org.slf4j.Logger LOG =
            org.slf4j.LoggerFactory.getLogger(ServiceMeshAsyncClient.class);

    ServiceMeshAsyncClient(
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
            extends com.oracle.bmc.common.RegionalClientBuilder<Builder, ServiceMeshAsyncClient> {
        private Builder(com.oracle.bmc.Service service) {
            super(service);
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
        public ServiceMeshAsyncClient build(
                @jakarta.annotation.Nonnull
                        com.oracle.bmc.auth.AbstractAuthenticationDetailsProvider
                                authenticationDetailsProvider) {
            return new ServiceMeshAsyncClient(this, authenticationDetailsProvider);
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
    public java.util.concurrent.Future<CancelWorkRequestResponse> cancelWorkRequest(
            CancelWorkRequestRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            CancelWorkRequestRequest, CancelWorkRequestResponse>
                    handler) {

        Validate.notBlank(request.getWorkRequestId(), "workRequestId must not be blank");

        return clientCall(request, CancelWorkRequestResponse::builder)
                .logger(LOG, "cancelWorkRequest")
                .serviceDetails(
                        "ServiceMesh",
                        "CancelWorkRequest",
                        "https://docs.oracle.com/iaas/api/#/en/service-mesh/20220615/WorkRequest/CancelWorkRequest")
                .method(com.oracle.bmc.http.client.Method.DELETE)
                .requestBuilder(CancelWorkRequestRequest::builder)
                .basePath("/20220615")
                .appendPathParam("workRequests")
                .appendPathParam(request.getWorkRequestId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleResponseHeaderString(
                        "opc-request-id", CancelWorkRequestResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ChangeAccessPolicyCompartmentResponse>
            changeAccessPolicyCompartment(
                    ChangeAccessPolicyCompartmentRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ChangeAccessPolicyCompartmentRequest,
                                    ChangeAccessPolicyCompartmentResponse>
                            handler) {

        Validate.notBlank(request.getAccessPolicyId(), "accessPolicyId must not be blank");
        Objects.requireNonNull(
                request.getChangeAccessPolicyCompartmentDetails(),
                "changeAccessPolicyCompartmentDetails is required");

        return clientCall(request, ChangeAccessPolicyCompartmentResponse::builder)
                .logger(LOG, "changeAccessPolicyCompartment")
                .serviceDetails(
                        "ServiceMesh",
                        "ChangeAccessPolicyCompartment",
                        "https://docs.oracle.com/iaas/api/#/en/service-mesh/20220615/AccessPolicy/ChangeAccessPolicyCompartment")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(ChangeAccessPolicyCompartmentRequest::builder)
                .basePath("/20220615")
                .appendPathParam("accessPolicies")
                .appendPathParam(request.getAccessPolicyId())
                .appendPathParam("actions")
                .appendPathParam("changeCompartment")
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        ChangeAccessPolicyCompartmentResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id",
                        ChangeAccessPolicyCompartmentResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ChangeIngressGatewayCompartmentResponse>
            changeIngressGatewayCompartment(
                    ChangeIngressGatewayCompartmentRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ChangeIngressGatewayCompartmentRequest,
                                    ChangeIngressGatewayCompartmentResponse>
                            handler) {

        Validate.notBlank(request.getIngressGatewayId(), "ingressGatewayId must not be blank");
        Objects.requireNonNull(
                request.getChangeIngressGatewayCompartmentDetails(),
                "changeIngressGatewayCompartmentDetails is required");

        return clientCall(request, ChangeIngressGatewayCompartmentResponse::builder)
                .logger(LOG, "changeIngressGatewayCompartment")
                .serviceDetails(
                        "ServiceMesh",
                        "ChangeIngressGatewayCompartment",
                        "https://docs.oracle.com/iaas/api/#/en/service-mesh/20220615/IngressGateway/ChangeIngressGatewayCompartment")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(ChangeIngressGatewayCompartmentRequest::builder)
                .basePath("/20220615")
                .appendPathParam("ingressGateways")
                .appendPathParam(request.getIngressGatewayId())
                .appendPathParam("actions")
                .appendPathParam("changeCompartment")
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        ChangeIngressGatewayCompartmentResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id",
                        ChangeIngressGatewayCompartmentResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ChangeIngressGatewayRouteTableCompartmentResponse>
            changeIngressGatewayRouteTableCompartment(
                    ChangeIngressGatewayRouteTableCompartmentRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ChangeIngressGatewayRouteTableCompartmentRequest,
                                    ChangeIngressGatewayRouteTableCompartmentResponse>
                            handler) {

        Validate.notBlank(
                request.getIngressGatewayRouteTableId(),
                "ingressGatewayRouteTableId must not be blank");
        Objects.requireNonNull(
                request.getChangeIngressGatewayRouteTableCompartmentDetails(),
                "changeIngressGatewayRouteTableCompartmentDetails is required");

        return clientCall(request, ChangeIngressGatewayRouteTableCompartmentResponse::builder)
                .logger(LOG, "changeIngressGatewayRouteTableCompartment")
                .serviceDetails(
                        "ServiceMesh",
                        "ChangeIngressGatewayRouteTableCompartment",
                        "https://docs.oracle.com/iaas/api/#/en/service-mesh/20220615/IngressGatewayRouteTable/ChangeIngressGatewayRouteTableCompartment")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(ChangeIngressGatewayRouteTableCompartmentRequest::builder)
                .basePath("/20220615")
                .appendPathParam("ingressGatewayRouteTables")
                .appendPathParam(request.getIngressGatewayRouteTableId())
                .appendPathParam("actions")
                .appendPathParam("changeCompartment")
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        ChangeIngressGatewayRouteTableCompartmentResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id",
                        ChangeIngressGatewayRouteTableCompartmentResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ChangeMeshCompartmentResponse> changeMeshCompartment(
            ChangeMeshCompartmentRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ChangeMeshCompartmentRequest, ChangeMeshCompartmentResponse>
                    handler) {

        Validate.notBlank(request.getMeshId(), "meshId must not be blank");
        Objects.requireNonNull(
                request.getChangeMeshCompartmentDetails(),
                "changeMeshCompartmentDetails is required");

        return clientCall(request, ChangeMeshCompartmentResponse::builder)
                .logger(LOG, "changeMeshCompartment")
                .serviceDetails(
                        "ServiceMesh",
                        "ChangeMeshCompartment",
                        "https://docs.oracle.com/iaas/api/#/en/service-mesh/20220615/Mesh/ChangeMeshCompartment")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(ChangeMeshCompartmentRequest::builder)
                .basePath("/20220615")
                .appendPathParam("meshes")
                .appendPathParam(request.getMeshId())
                .appendPathParam("actions")
                .appendPathParam("changeCompartment")
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        ChangeMeshCompartmentResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", ChangeMeshCompartmentResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ChangeVirtualDeploymentCompartmentResponse>
            changeVirtualDeploymentCompartment(
                    ChangeVirtualDeploymentCompartmentRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ChangeVirtualDeploymentCompartmentRequest,
                                    ChangeVirtualDeploymentCompartmentResponse>
                            handler) {

        Validate.notBlank(
                request.getVirtualDeploymentId(), "virtualDeploymentId must not be blank");
        Objects.requireNonNull(
                request.getChangeVirtualDeploymentCompartmentDetails(),
                "changeVirtualDeploymentCompartmentDetails is required");

        return clientCall(request, ChangeVirtualDeploymentCompartmentResponse::builder)
                .logger(LOG, "changeVirtualDeploymentCompartment")
                .serviceDetails(
                        "ServiceMesh",
                        "ChangeVirtualDeploymentCompartment",
                        "https://docs.oracle.com/iaas/api/#/en/service-mesh/20220615/VirtualDeployment/ChangeVirtualDeploymentCompartment")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(ChangeVirtualDeploymentCompartmentRequest::builder)
                .basePath("/20220615")
                .appendPathParam("virtualDeployments")
                .appendPathParam(request.getVirtualDeploymentId())
                .appendPathParam("actions")
                .appendPathParam("changeCompartment")
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        ChangeVirtualDeploymentCompartmentResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id",
                        ChangeVirtualDeploymentCompartmentResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ChangeVirtualServiceCompartmentResponse>
            changeVirtualServiceCompartment(
                    ChangeVirtualServiceCompartmentRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ChangeVirtualServiceCompartmentRequest,
                                    ChangeVirtualServiceCompartmentResponse>
                            handler) {

        Validate.notBlank(request.getVirtualServiceId(), "virtualServiceId must not be blank");
        Objects.requireNonNull(
                request.getChangeVirtualServiceCompartmentDetails(),
                "changeVirtualServiceCompartmentDetails is required");

        return clientCall(request, ChangeVirtualServiceCompartmentResponse::builder)
                .logger(LOG, "changeVirtualServiceCompartment")
                .serviceDetails(
                        "ServiceMesh",
                        "ChangeVirtualServiceCompartment",
                        "https://docs.oracle.com/iaas/api/#/en/service-mesh/20220615/VirtualService/ChangeVirtualServiceCompartment")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(ChangeVirtualServiceCompartmentRequest::builder)
                .basePath("/20220615")
                .appendPathParam("virtualServices")
                .appendPathParam(request.getVirtualServiceId())
                .appendPathParam("actions")
                .appendPathParam("changeCompartment")
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        ChangeVirtualServiceCompartmentResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id",
                        ChangeVirtualServiceCompartmentResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ChangeVirtualServiceRouteTableCompartmentResponse>
            changeVirtualServiceRouteTableCompartment(
                    ChangeVirtualServiceRouteTableCompartmentRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ChangeVirtualServiceRouteTableCompartmentRequest,
                                    ChangeVirtualServiceRouteTableCompartmentResponse>
                            handler) {

        Validate.notBlank(
                request.getVirtualServiceRouteTableId(),
                "virtualServiceRouteTableId must not be blank");
        Objects.requireNonNull(
                request.getChangeVirtualServiceRouteTableCompartmentDetails(),
                "changeVirtualServiceRouteTableCompartmentDetails is required");

        return clientCall(request, ChangeVirtualServiceRouteTableCompartmentResponse::builder)
                .logger(LOG, "changeVirtualServiceRouteTableCompartment")
                .serviceDetails(
                        "ServiceMesh",
                        "ChangeVirtualServiceRouteTableCompartment",
                        "https://docs.oracle.com/iaas/api/#/en/service-mesh/20220615/VirtualServiceRouteTable/ChangeVirtualServiceRouteTableCompartment")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(ChangeVirtualServiceRouteTableCompartmentRequest::builder)
                .basePath("/20220615")
                .appendPathParam("virtualServiceRouteTables")
                .appendPathParam(request.getVirtualServiceRouteTableId())
                .appendPathParam("actions")
                .appendPathParam("changeCompartment")
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        ChangeVirtualServiceRouteTableCompartmentResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id",
                        ChangeVirtualServiceRouteTableCompartmentResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<CreateAccessPolicyResponse> createAccessPolicy(
            CreateAccessPolicyRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            CreateAccessPolicyRequest, CreateAccessPolicyResponse>
                    handler) {
        Objects.requireNonNull(
                request.getCreateAccessPolicyDetails(), "createAccessPolicyDetails is required");

        return clientCall(request, CreateAccessPolicyResponse::builder)
                .logger(LOG, "createAccessPolicy")
                .serviceDetails(
                        "ServiceMesh",
                        "CreateAccessPolicy",
                        "https://docs.oracle.com/iaas/api/#/en/service-mesh/20220615/AccessPolicy/CreateAccessPolicy")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CreateAccessPolicyRequest::builder)
                .basePath("/20220615")
                .appendPathParam("accessPolicies")
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.servicemesh.model.AccessPolicy.class,
                        CreateAccessPolicyResponse.Builder::accessPolicy)
                .handleResponseHeaderString("etag", CreateAccessPolicyResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-work-request-id", CreateAccessPolicyResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", CreateAccessPolicyResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "location", CreateAccessPolicyResponse.Builder::location)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<CreateIngressGatewayResponse> createIngressGateway(
            CreateIngressGatewayRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            CreateIngressGatewayRequest, CreateIngressGatewayResponse>
                    handler) {
        Objects.requireNonNull(
                request.getCreateIngressGatewayDetails(),
                "createIngressGatewayDetails is required");

        return clientCall(request, CreateIngressGatewayResponse::builder)
                .logger(LOG, "createIngressGateway")
                .serviceDetails(
                        "ServiceMesh",
                        "CreateIngressGateway",
                        "https://docs.oracle.com/iaas/api/#/en/service-mesh/20220615/IngressGateway/CreateIngressGateway")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CreateIngressGatewayRequest::builder)
                .basePath("/20220615")
                .appendPathParam("ingressGateways")
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.servicemesh.model.IngressGateway.class,
                        CreateIngressGatewayResponse.Builder::ingressGateway)
                .handleResponseHeaderString("etag", CreateIngressGatewayResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        CreateIngressGatewayResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", CreateIngressGatewayResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "location", CreateIngressGatewayResponse.Builder::location)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<CreateIngressGatewayRouteTableResponse>
            createIngressGatewayRouteTable(
                    CreateIngressGatewayRouteTableRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    CreateIngressGatewayRouteTableRequest,
                                    CreateIngressGatewayRouteTableResponse>
                            handler) {
        Objects.requireNonNull(
                request.getCreateIngressGatewayRouteTableDetails(),
                "createIngressGatewayRouteTableDetails is required");

        return clientCall(request, CreateIngressGatewayRouteTableResponse::builder)
                .logger(LOG, "createIngressGatewayRouteTable")
                .serviceDetails(
                        "ServiceMesh",
                        "CreateIngressGatewayRouteTable",
                        "https://docs.oracle.com/iaas/api/#/en/service-mesh/20220615/IngressGatewayRouteTable/CreateIngressGatewayRouteTable")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CreateIngressGatewayRouteTableRequest::builder)
                .basePath("/20220615")
                .appendPathParam("ingressGatewayRouteTables")
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.servicemesh.model.IngressGatewayRouteTable.class,
                        CreateIngressGatewayRouteTableResponse.Builder::ingressGatewayRouteTable)
                .handleResponseHeaderString(
                        "etag", CreateIngressGatewayRouteTableResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        CreateIngressGatewayRouteTableResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id",
                        CreateIngressGatewayRouteTableResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "location", CreateIngressGatewayRouteTableResponse.Builder::location)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<CreateMeshResponse> createMesh(
            CreateMeshRequest request,
            final com.oracle.bmc.responses.AsyncHandler<CreateMeshRequest, CreateMeshResponse>
                    handler) {
        Objects.requireNonNull(request.getCreateMeshDetails(), "createMeshDetails is required");

        return clientCall(request, CreateMeshResponse::builder)
                .logger(LOG, "createMesh")
                .serviceDetails(
                        "ServiceMesh",
                        "CreateMesh",
                        "https://docs.oracle.com/iaas/api/#/en/service-mesh/20220615/Mesh/CreateMesh")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CreateMeshRequest::builder)
                .basePath("/20220615")
                .appendPathParam("meshes")
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.servicemesh.model.Mesh.class,
                        CreateMeshResponse.Builder::mesh)
                .handleResponseHeaderString("etag", CreateMeshResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-work-request-id", CreateMeshResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", CreateMeshResponse.Builder::opcRequestId)
                .handleResponseHeaderString("location", CreateMeshResponse.Builder::location)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<CreateVirtualDeploymentResponse> createVirtualDeployment(
            CreateVirtualDeploymentRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            CreateVirtualDeploymentRequest, CreateVirtualDeploymentResponse>
                    handler) {
        Objects.requireNonNull(
                request.getCreateVirtualDeploymentDetails(),
                "createVirtualDeploymentDetails is required");

        return clientCall(request, CreateVirtualDeploymentResponse::builder)
                .logger(LOG, "createVirtualDeployment")
                .serviceDetails(
                        "ServiceMesh",
                        "CreateVirtualDeployment",
                        "https://docs.oracle.com/iaas/api/#/en/service-mesh/20220615/VirtualDeployment/CreateVirtualDeployment")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CreateVirtualDeploymentRequest::builder)
                .basePath("/20220615")
                .appendPathParam("virtualDeployments")
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.servicemesh.model.VirtualDeployment.class,
                        CreateVirtualDeploymentResponse.Builder::virtualDeployment)
                .handleResponseHeaderString("etag", CreateVirtualDeploymentResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        CreateVirtualDeploymentResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", CreateVirtualDeploymentResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "location", CreateVirtualDeploymentResponse.Builder::location)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<CreateVirtualServiceResponse> createVirtualService(
            CreateVirtualServiceRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            CreateVirtualServiceRequest, CreateVirtualServiceResponse>
                    handler) {
        Objects.requireNonNull(
                request.getCreateVirtualServiceDetails(),
                "createVirtualServiceDetails is required");

        return clientCall(request, CreateVirtualServiceResponse::builder)
                .logger(LOG, "createVirtualService")
                .serviceDetails(
                        "ServiceMesh",
                        "CreateVirtualService",
                        "https://docs.oracle.com/iaas/api/#/en/service-mesh/20220615/VirtualService/CreateVirtualService")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CreateVirtualServiceRequest::builder)
                .basePath("/20220615")
                .appendPathParam("virtualServices")
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.servicemesh.model.VirtualService.class,
                        CreateVirtualServiceResponse.Builder::virtualService)
                .handleResponseHeaderString("etag", CreateVirtualServiceResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        CreateVirtualServiceResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", CreateVirtualServiceResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "location", CreateVirtualServiceResponse.Builder::location)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<CreateVirtualServiceRouteTableResponse>
            createVirtualServiceRouteTable(
                    CreateVirtualServiceRouteTableRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    CreateVirtualServiceRouteTableRequest,
                                    CreateVirtualServiceRouteTableResponse>
                            handler) {
        Objects.requireNonNull(
                request.getCreateVirtualServiceRouteTableDetails(),
                "createVirtualServiceRouteTableDetails is required");

        return clientCall(request, CreateVirtualServiceRouteTableResponse::builder)
                .logger(LOG, "createVirtualServiceRouteTable")
                .serviceDetails(
                        "ServiceMesh",
                        "CreateVirtualServiceRouteTable",
                        "https://docs.oracle.com/iaas/api/#/en/service-mesh/20220615/VirtualServiceRouteTable/CreateVirtualServiceRouteTable")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CreateVirtualServiceRouteTableRequest::builder)
                .basePath("/20220615")
                .appendPathParam("virtualServiceRouteTables")
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.servicemesh.model.VirtualServiceRouteTable.class,
                        CreateVirtualServiceRouteTableResponse.Builder::virtualServiceRouteTable)
                .handleResponseHeaderString(
                        "etag", CreateVirtualServiceRouteTableResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        CreateVirtualServiceRouteTableResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id",
                        CreateVirtualServiceRouteTableResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "location", CreateVirtualServiceRouteTableResponse.Builder::location)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<DeleteAccessPolicyResponse> deleteAccessPolicy(
            DeleteAccessPolicyRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            DeleteAccessPolicyRequest, DeleteAccessPolicyResponse>
                    handler) {

        Validate.notBlank(request.getAccessPolicyId(), "accessPolicyId must not be blank");

        return clientCall(request, DeleteAccessPolicyResponse::builder)
                .logger(LOG, "deleteAccessPolicy")
                .serviceDetails(
                        "ServiceMesh",
                        "DeleteAccessPolicy",
                        "https://docs.oracle.com/iaas/api/#/en/service-mesh/20220615/AccessPolicy/DeleteAccessPolicy")
                .method(com.oracle.bmc.http.client.Method.DELETE)
                .requestBuilder(DeleteAccessPolicyRequest::builder)
                .basePath("/20220615")
                .appendPathParam("accessPolicies")
                .appendPathParam(request.getAccessPolicyId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleResponseHeaderString(
                        "opc-work-request-id", DeleteAccessPolicyResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", DeleteAccessPolicyResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<DeleteIngressGatewayResponse> deleteIngressGateway(
            DeleteIngressGatewayRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            DeleteIngressGatewayRequest, DeleteIngressGatewayResponse>
                    handler) {

        Validate.notBlank(request.getIngressGatewayId(), "ingressGatewayId must not be blank");

        return clientCall(request, DeleteIngressGatewayResponse::builder)
                .logger(LOG, "deleteIngressGateway")
                .serviceDetails(
                        "ServiceMesh",
                        "DeleteIngressGateway",
                        "https://docs.oracle.com/iaas/api/#/en/service-mesh/20220615/IngressGateway/DeleteIngressGateway")
                .method(com.oracle.bmc.http.client.Method.DELETE)
                .requestBuilder(DeleteIngressGatewayRequest::builder)
                .basePath("/20220615")
                .appendPathParam("ingressGateways")
                .appendPathParam(request.getIngressGatewayId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        DeleteIngressGatewayResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", DeleteIngressGatewayResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<DeleteIngressGatewayRouteTableResponse>
            deleteIngressGatewayRouteTable(
                    DeleteIngressGatewayRouteTableRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    DeleteIngressGatewayRouteTableRequest,
                                    DeleteIngressGatewayRouteTableResponse>
                            handler) {

        Validate.notBlank(
                request.getIngressGatewayRouteTableId(),
                "ingressGatewayRouteTableId must not be blank");

        return clientCall(request, DeleteIngressGatewayRouteTableResponse::builder)
                .logger(LOG, "deleteIngressGatewayRouteTable")
                .serviceDetails(
                        "ServiceMesh",
                        "DeleteIngressGatewayRouteTable",
                        "https://docs.oracle.com/iaas/api/#/en/service-mesh/20220615/IngressGatewayRouteTable/DeleteIngressGatewayRouteTable")
                .method(com.oracle.bmc.http.client.Method.DELETE)
                .requestBuilder(DeleteIngressGatewayRouteTableRequest::builder)
                .basePath("/20220615")
                .appendPathParam("ingressGatewayRouteTables")
                .appendPathParam(request.getIngressGatewayRouteTableId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        DeleteIngressGatewayRouteTableResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id",
                        DeleteIngressGatewayRouteTableResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<DeleteMeshResponse> deleteMesh(
            DeleteMeshRequest request,
            final com.oracle.bmc.responses.AsyncHandler<DeleteMeshRequest, DeleteMeshResponse>
                    handler) {

        Validate.notBlank(request.getMeshId(), "meshId must not be blank");

        return clientCall(request, DeleteMeshResponse::builder)
                .logger(LOG, "deleteMesh")
                .serviceDetails(
                        "ServiceMesh",
                        "DeleteMesh",
                        "https://docs.oracle.com/iaas/api/#/en/service-mesh/20220615/Mesh/DeleteMesh")
                .method(com.oracle.bmc.http.client.Method.DELETE)
                .requestBuilder(DeleteMeshRequest::builder)
                .basePath("/20220615")
                .appendPathParam("meshes")
                .appendPathParam(request.getMeshId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleResponseHeaderString(
                        "opc-work-request-id", DeleteMeshResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", DeleteMeshResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<DeleteVirtualDeploymentResponse> deleteVirtualDeployment(
            DeleteVirtualDeploymentRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            DeleteVirtualDeploymentRequest, DeleteVirtualDeploymentResponse>
                    handler) {

        Validate.notBlank(
                request.getVirtualDeploymentId(), "virtualDeploymentId must not be blank");

        return clientCall(request, DeleteVirtualDeploymentResponse::builder)
                .logger(LOG, "deleteVirtualDeployment")
                .serviceDetails(
                        "ServiceMesh",
                        "DeleteVirtualDeployment",
                        "https://docs.oracle.com/iaas/api/#/en/service-mesh/20220615/VirtualDeployment/DeleteVirtualDeployment")
                .method(com.oracle.bmc.http.client.Method.DELETE)
                .requestBuilder(DeleteVirtualDeploymentRequest::builder)
                .basePath("/20220615")
                .appendPathParam("virtualDeployments")
                .appendPathParam(request.getVirtualDeploymentId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        DeleteVirtualDeploymentResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", DeleteVirtualDeploymentResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<DeleteVirtualServiceResponse> deleteVirtualService(
            DeleteVirtualServiceRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            DeleteVirtualServiceRequest, DeleteVirtualServiceResponse>
                    handler) {

        Validate.notBlank(request.getVirtualServiceId(), "virtualServiceId must not be blank");

        return clientCall(request, DeleteVirtualServiceResponse::builder)
                .logger(LOG, "deleteVirtualService")
                .serviceDetails(
                        "ServiceMesh",
                        "DeleteVirtualService",
                        "https://docs.oracle.com/iaas/api/#/en/service-mesh/20220615/VirtualService/DeleteVirtualService")
                .method(com.oracle.bmc.http.client.Method.DELETE)
                .requestBuilder(DeleteVirtualServiceRequest::builder)
                .basePath("/20220615")
                .appendPathParam("virtualServices")
                .appendPathParam(request.getVirtualServiceId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        DeleteVirtualServiceResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", DeleteVirtualServiceResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<DeleteVirtualServiceRouteTableResponse>
            deleteVirtualServiceRouteTable(
                    DeleteVirtualServiceRouteTableRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    DeleteVirtualServiceRouteTableRequest,
                                    DeleteVirtualServiceRouteTableResponse>
                            handler) {

        Validate.notBlank(
                request.getVirtualServiceRouteTableId(),
                "virtualServiceRouteTableId must not be blank");

        return clientCall(request, DeleteVirtualServiceRouteTableResponse::builder)
                .logger(LOG, "deleteVirtualServiceRouteTable")
                .serviceDetails(
                        "ServiceMesh",
                        "DeleteVirtualServiceRouteTable",
                        "https://docs.oracle.com/iaas/api/#/en/service-mesh/20220615/VirtualServiceRouteTable/DeleteVirtualServiceRouteTable")
                .method(com.oracle.bmc.http.client.Method.DELETE)
                .requestBuilder(DeleteVirtualServiceRouteTableRequest::builder)
                .basePath("/20220615")
                .appendPathParam("virtualServiceRouteTables")
                .appendPathParam(request.getVirtualServiceRouteTableId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        DeleteVirtualServiceRouteTableResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id",
                        DeleteVirtualServiceRouteTableResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<GetAccessPolicyResponse> getAccessPolicy(
            GetAccessPolicyRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetAccessPolicyRequest, GetAccessPolicyResponse>
                    handler) {

        Validate.notBlank(request.getAccessPolicyId(), "accessPolicyId must not be blank");

        return clientCall(request, GetAccessPolicyResponse::builder)
                .logger(LOG, "getAccessPolicy")
                .serviceDetails(
                        "ServiceMesh",
                        "GetAccessPolicy",
                        "https://docs.oracle.com/iaas/api/#/en/service-mesh/20220615/AccessPolicy/GetAccessPolicy")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetAccessPolicyRequest::builder)
                .basePath("/20220615")
                .appendPathParam("accessPolicies")
                .appendPathParam(request.getAccessPolicyId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.servicemesh.model.AccessPolicy.class,
                        GetAccessPolicyResponse.Builder::accessPolicy)
                .handleResponseHeaderString("etag", GetAccessPolicyResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", GetAccessPolicyResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<GetIngressGatewayResponse> getIngressGateway(
            GetIngressGatewayRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetIngressGatewayRequest, GetIngressGatewayResponse>
                    handler) {

        Validate.notBlank(request.getIngressGatewayId(), "ingressGatewayId must not be blank");

        return clientCall(request, GetIngressGatewayResponse::builder)
                .logger(LOG, "getIngressGateway")
                .serviceDetails(
                        "ServiceMesh",
                        "GetIngressGateway",
                        "https://docs.oracle.com/iaas/api/#/en/service-mesh/20220615/IngressGateway/GetIngressGateway")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetIngressGatewayRequest::builder)
                .basePath("/20220615")
                .appendPathParam("ingressGateways")
                .appendPathParam(request.getIngressGatewayId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.servicemesh.model.IngressGateway.class,
                        GetIngressGatewayResponse.Builder::ingressGateway)
                .handleResponseHeaderString("etag", GetIngressGatewayResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", GetIngressGatewayResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<GetIngressGatewayRouteTableResponse>
            getIngressGatewayRouteTable(
                    GetIngressGatewayRouteTableRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    GetIngressGatewayRouteTableRequest,
                                    GetIngressGatewayRouteTableResponse>
                            handler) {

        Validate.notBlank(
                request.getIngressGatewayRouteTableId(),
                "ingressGatewayRouteTableId must not be blank");

        return clientCall(request, GetIngressGatewayRouteTableResponse::builder)
                .logger(LOG, "getIngressGatewayRouteTable")
                .serviceDetails(
                        "ServiceMesh",
                        "GetIngressGatewayRouteTable",
                        "https://docs.oracle.com/iaas/api/#/en/service-mesh/20220615/IngressGatewayRouteTable/GetIngressGatewayRouteTable")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetIngressGatewayRouteTableRequest::builder)
                .basePath("/20220615")
                .appendPathParam("ingressGatewayRouteTables")
                .appendPathParam(request.getIngressGatewayRouteTableId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.servicemesh.model.IngressGatewayRouteTable.class,
                        GetIngressGatewayRouteTableResponse.Builder::ingressGatewayRouteTable)
                .handleResponseHeaderString(
                        "etag", GetIngressGatewayRouteTableResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", GetIngressGatewayRouteTableResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<GetMeshResponse> getMesh(
            GetMeshRequest request,
            final com.oracle.bmc.responses.AsyncHandler<GetMeshRequest, GetMeshResponse> handler) {

        Validate.notBlank(request.getMeshId(), "meshId must not be blank");

        return clientCall(request, GetMeshResponse::builder)
                .logger(LOG, "getMesh")
                .serviceDetails(
                        "ServiceMesh",
                        "GetMesh",
                        "https://docs.oracle.com/iaas/api/#/en/service-mesh/20220615/Mesh/GetMesh")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetMeshRequest::builder)
                .basePath("/20220615")
                .appendPathParam("meshes")
                .appendPathParam(request.getMeshId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.servicemesh.model.Mesh.class, GetMeshResponse.Builder::mesh)
                .handleResponseHeaderString("etag", GetMeshResponse.Builder::etag)
                .handleResponseHeaderString("opc-request-id", GetMeshResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<GetProxyDetailsResponse> getProxyDetails(
            GetProxyDetailsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetProxyDetailsRequest, GetProxyDetailsResponse>
                    handler) {

        return clientCall(request, GetProxyDetailsResponse::builder)
                .logger(LOG, "getProxyDetails")
                .serviceDetails(
                        "ServiceMesh",
                        "GetProxyDetails",
                        "https://docs.oracle.com/iaas/api/#/en/service-mesh/20220615/ProxyDetails/GetProxyDetails")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetProxyDetailsRequest::builder)
                .basePath("/20220615")
                .appendPathParam("proxyDetails")
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.servicemesh.model.ProxyDetails.class,
                        GetProxyDetailsResponse.Builder::proxyDetails)
                .handleResponseHeaderString(
                        "opc-request-id", GetProxyDetailsResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<GetVirtualDeploymentResponse> getVirtualDeployment(
            GetVirtualDeploymentRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetVirtualDeploymentRequest, GetVirtualDeploymentResponse>
                    handler) {

        Validate.notBlank(
                request.getVirtualDeploymentId(), "virtualDeploymentId must not be blank");

        return clientCall(request, GetVirtualDeploymentResponse::builder)
                .logger(LOG, "getVirtualDeployment")
                .serviceDetails(
                        "ServiceMesh",
                        "GetVirtualDeployment",
                        "https://docs.oracle.com/iaas/api/#/en/service-mesh/20220615/VirtualDeployment/GetVirtualDeployment")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetVirtualDeploymentRequest::builder)
                .basePath("/20220615")
                .appendPathParam("virtualDeployments")
                .appendPathParam(request.getVirtualDeploymentId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.servicemesh.model.VirtualDeployment.class,
                        GetVirtualDeploymentResponse.Builder::virtualDeployment)
                .handleResponseHeaderString("etag", GetVirtualDeploymentResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", GetVirtualDeploymentResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<GetVirtualServiceResponse> getVirtualService(
            GetVirtualServiceRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetVirtualServiceRequest, GetVirtualServiceResponse>
                    handler) {

        Validate.notBlank(request.getVirtualServiceId(), "virtualServiceId must not be blank");

        return clientCall(request, GetVirtualServiceResponse::builder)
                .logger(LOG, "getVirtualService")
                .serviceDetails(
                        "ServiceMesh",
                        "GetVirtualService",
                        "https://docs.oracle.com/iaas/api/#/en/service-mesh/20220615/VirtualService/GetVirtualService")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetVirtualServiceRequest::builder)
                .basePath("/20220615")
                .appendPathParam("virtualServices")
                .appendPathParam(request.getVirtualServiceId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.servicemesh.model.VirtualService.class,
                        GetVirtualServiceResponse.Builder::virtualService)
                .handleResponseHeaderString("etag", GetVirtualServiceResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", GetVirtualServiceResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<GetVirtualServiceRouteTableResponse>
            getVirtualServiceRouteTable(
                    GetVirtualServiceRouteTableRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    GetVirtualServiceRouteTableRequest,
                                    GetVirtualServiceRouteTableResponse>
                            handler) {

        Validate.notBlank(
                request.getVirtualServiceRouteTableId(),
                "virtualServiceRouteTableId must not be blank");

        return clientCall(request, GetVirtualServiceRouteTableResponse::builder)
                .logger(LOG, "getVirtualServiceRouteTable")
                .serviceDetails(
                        "ServiceMesh",
                        "GetVirtualServiceRouteTable",
                        "https://docs.oracle.com/iaas/api/#/en/service-mesh/20220615/VirtualServiceRouteTable/GetVirtualServiceRouteTable")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetVirtualServiceRouteTableRequest::builder)
                .basePath("/20220615")
                .appendPathParam("virtualServiceRouteTables")
                .appendPathParam(request.getVirtualServiceRouteTableId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.servicemesh.model.VirtualServiceRouteTable.class,
                        GetVirtualServiceRouteTableResponse.Builder::virtualServiceRouteTable)
                .handleResponseHeaderString(
                        "etag", GetVirtualServiceRouteTableResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", GetVirtualServiceRouteTableResponse.Builder::opcRequestId)
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
                        "ServiceMesh",
                        "GetWorkRequest",
                        "https://docs.oracle.com/iaas/api/#/en/service-mesh/20220615/WorkRequest/GetWorkRequest")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetWorkRequestRequest::builder)
                .basePath("/20220615")
                .appendPathParam("workRequests")
                .appendPathParam(request.getWorkRequestId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.servicemesh.model.WorkRequest.class,
                        GetWorkRequestResponse.Builder::workRequest)
                .handleResponseHeaderString("etag", GetWorkRequestResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", GetWorkRequestResponse.Builder::opcRequestId)
                .handleResponseHeaderInteger(
                        "retry-after", GetWorkRequestResponse.Builder::retryAfter)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListAccessPoliciesResponse> listAccessPolicies(
            ListAccessPoliciesRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListAccessPoliciesRequest, ListAccessPoliciesResponse>
                    handler) {
        Objects.requireNonNull(request.getCompartmentId(), "compartmentId is required");

        return clientCall(request, ListAccessPoliciesResponse::builder)
                .logger(LOG, "listAccessPolicies")
                .serviceDetails(
                        "ServiceMesh",
                        "ListAccessPolicies",
                        "https://docs.oracle.com/iaas/api/#/en/service-mesh/20220615/AccessPolicy/ListAccessPolicies")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListAccessPoliciesRequest::builder)
                .basePath("/20220615")
                .appendPathParam("accessPolicies")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendQueryParam("name", request.getName())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .appendQueryParam("meshId", request.getMeshId())
                .appendQueryParam("id", request.getId())
                .appendEnumQueryParam("lifecycleState", request.getLifecycleState())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.servicemesh.model.AccessPolicyCollection.class,
                        ListAccessPoliciesResponse.Builder::accessPolicyCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListAccessPoliciesResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListAccessPoliciesResponse.Builder::opcNextPage)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListIngressGatewayRouteTablesResponse>
            listIngressGatewayRouteTables(
                    ListIngressGatewayRouteTablesRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ListIngressGatewayRouteTablesRequest,
                                    ListIngressGatewayRouteTablesResponse>
                            handler) {
        Objects.requireNonNull(request.getCompartmentId(), "compartmentId is required");

        return clientCall(request, ListIngressGatewayRouteTablesResponse::builder)
                .logger(LOG, "listIngressGatewayRouteTables")
                .serviceDetails(
                        "ServiceMesh",
                        "ListIngressGatewayRouteTables",
                        "https://docs.oracle.com/iaas/api/#/en/service-mesh/20220615/IngressGatewayRouteTable/ListIngressGatewayRouteTables")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListIngressGatewayRouteTablesRequest::builder)
                .basePath("/20220615")
                .appendPathParam("ingressGatewayRouteTables")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendQueryParam("name", request.getName())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .appendQueryParam("ingressGatewayId", request.getIngressGatewayId())
                .appendQueryParam("id", request.getId())
                .appendEnumQueryParam("lifecycleState", request.getLifecycleState())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.servicemesh.model.IngressGatewayRouteTableCollection.class,
                        ListIngressGatewayRouteTablesResponse.Builder
                                ::ingressGatewayRouteTableCollection)
                .handleResponseHeaderString(
                        "opc-request-id",
                        ListIngressGatewayRouteTablesResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListIngressGatewayRouteTablesResponse.Builder::opcNextPage)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListIngressGatewaysResponse> listIngressGateways(
            ListIngressGatewaysRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListIngressGatewaysRequest, ListIngressGatewaysResponse>
                    handler) {
        Objects.requireNonNull(request.getCompartmentId(), "compartmentId is required");

        return clientCall(request, ListIngressGatewaysResponse::builder)
                .logger(LOG, "listIngressGateways")
                .serviceDetails(
                        "ServiceMesh",
                        "ListIngressGateways",
                        "https://docs.oracle.com/iaas/api/#/en/service-mesh/20220615/IngressGateway/ListIngressGateways")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListIngressGatewaysRequest::builder)
                .basePath("/20220615")
                .appendPathParam("ingressGateways")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendQueryParam("name", request.getName())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .appendQueryParam("meshId", request.getMeshId())
                .appendQueryParam("id", request.getId())
                .appendEnumQueryParam("lifecycleState", request.getLifecycleState())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.servicemesh.model.IngressGatewayCollection.class,
                        ListIngressGatewaysResponse.Builder::ingressGatewayCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListIngressGatewaysResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListIngressGatewaysResponse.Builder::opcNextPage)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListMeshesResponse> listMeshes(
            ListMeshesRequest request,
            final com.oracle.bmc.responses.AsyncHandler<ListMeshesRequest, ListMeshesResponse>
                    handler) {
        Objects.requireNonNull(request.getCompartmentId(), "compartmentId is required");

        return clientCall(request, ListMeshesResponse::builder)
                .logger(LOG, "listMeshes")
                .serviceDetails(
                        "ServiceMesh",
                        "ListMeshes",
                        "https://docs.oracle.com/iaas/api/#/en/service-mesh/20220615/Mesh/ListMeshes")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListMeshesRequest::builder)
                .basePath("/20220615")
                .appendPathParam("meshes")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendQueryParam("displayName", request.getDisplayName())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .appendEnumQueryParam("lifecycleState", request.getLifecycleState())
                .appendQueryParam("id", request.getId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.servicemesh.model.MeshCollection.class,
                        ListMeshesResponse.Builder::meshCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListMeshesResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListMeshesResponse.Builder::opcNextPage)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListVirtualDeploymentsResponse> listVirtualDeployments(
            ListVirtualDeploymentsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListVirtualDeploymentsRequest, ListVirtualDeploymentsResponse>
                    handler) {
        Objects.requireNonNull(request.getCompartmentId(), "compartmentId is required");

        return clientCall(request, ListVirtualDeploymentsResponse::builder)
                .logger(LOG, "listVirtualDeployments")
                .serviceDetails(
                        "ServiceMesh",
                        "ListVirtualDeployments",
                        "https://docs.oracle.com/iaas/api/#/en/service-mesh/20220615/VirtualDeployment/ListVirtualDeployments")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListVirtualDeploymentsRequest::builder)
                .basePath("/20220615")
                .appendPathParam("virtualDeployments")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendQueryParam("name", request.getName())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .appendQueryParam("virtualServiceId", request.getVirtualServiceId())
                .appendQueryParam("id", request.getId())
                .appendEnumQueryParam("lifecycleState", request.getLifecycleState())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.servicemesh.model.VirtualDeploymentCollection.class,
                        ListVirtualDeploymentsResponse.Builder::virtualDeploymentCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListVirtualDeploymentsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListVirtualDeploymentsResponse.Builder::opcNextPage)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListVirtualServiceRouteTablesResponse>
            listVirtualServiceRouteTables(
                    ListVirtualServiceRouteTablesRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ListVirtualServiceRouteTablesRequest,
                                    ListVirtualServiceRouteTablesResponse>
                            handler) {
        Objects.requireNonNull(request.getCompartmentId(), "compartmentId is required");

        return clientCall(request, ListVirtualServiceRouteTablesResponse::builder)
                .logger(LOG, "listVirtualServiceRouteTables")
                .serviceDetails(
                        "ServiceMesh",
                        "ListVirtualServiceRouteTables",
                        "https://docs.oracle.com/iaas/api/#/en/service-mesh/20220615/VirtualServiceRouteTable/ListVirtualServiceRouteTables")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListVirtualServiceRouteTablesRequest::builder)
                .basePath("/20220615")
                .appendPathParam("virtualServiceRouteTables")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendQueryParam("name", request.getName())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .appendQueryParam("virtualServiceId", request.getVirtualServiceId())
                .appendQueryParam("id", request.getId())
                .appendEnumQueryParam("lifecycleState", request.getLifecycleState())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.servicemesh.model.VirtualServiceRouteTableCollection.class,
                        ListVirtualServiceRouteTablesResponse.Builder
                                ::virtualServiceRouteTableCollection)
                .handleResponseHeaderString(
                        "opc-request-id",
                        ListVirtualServiceRouteTablesResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListVirtualServiceRouteTablesResponse.Builder::opcNextPage)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListVirtualServicesResponse> listVirtualServices(
            ListVirtualServicesRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListVirtualServicesRequest, ListVirtualServicesResponse>
                    handler) {
        Objects.requireNonNull(request.getCompartmentId(), "compartmentId is required");

        return clientCall(request, ListVirtualServicesResponse::builder)
                .logger(LOG, "listVirtualServices")
                .serviceDetails(
                        "ServiceMesh",
                        "ListVirtualServices",
                        "https://docs.oracle.com/iaas/api/#/en/service-mesh/20220615/VirtualService/ListVirtualServices")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListVirtualServicesRequest::builder)
                .basePath("/20220615")
                .appendPathParam("virtualServices")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendQueryParam("name", request.getName())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .appendQueryParam("meshId", request.getMeshId())
                .appendQueryParam("id", request.getId())
                .appendEnumQueryParam("lifecycleState", request.getLifecycleState())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.servicemesh.model.VirtualServiceCollection.class,
                        ListVirtualServicesResponse.Builder::virtualServiceCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListVirtualServicesResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListVirtualServicesResponse.Builder::opcNextPage)
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
                        "ServiceMesh",
                        "ListWorkRequestErrors",
                        "https://docs.oracle.com/iaas/api/#/en/service-mesh/20220615/WorkRequest/ListWorkRequestErrors")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListWorkRequestErrorsRequest::builder)
                .basePath("/20220615")
                .appendPathParam("workRequests")
                .appendPathParam(request.getWorkRequestId())
                .appendPathParam("errors")
                .appendQueryParam("page", request.getPage())
                .appendQueryParam("limit", request.getLimit())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.servicemesh.model.WorkRequestErrorCollection.class,
                        ListWorkRequestErrorsResponse.Builder::workRequestErrorCollection)
                .handleResponseHeaderString(
                        "opc-next-page", ListWorkRequestErrorsResponse.Builder::opcNextPage)
                .handleResponseHeaderString(
                        "opc-request-id", ListWorkRequestErrorsResponse.Builder::opcRequestId)
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
                        "ServiceMesh",
                        "ListWorkRequestLogs",
                        "https://docs.oracle.com/iaas/api/#/en/service-mesh/20220615/WorkRequest/ListWorkRequestLogs")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListWorkRequestLogsRequest::builder)
                .basePath("/20220615")
                .appendPathParam("workRequests")
                .appendPathParam(request.getWorkRequestId())
                .appendPathParam("logs")
                .appendQueryParam("page", request.getPage())
                .appendQueryParam("limit", request.getLimit())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.servicemesh.model.WorkRequestLogEntryCollection.class,
                        ListWorkRequestLogsResponse.Builder::workRequestLogEntryCollection)
                .handleResponseHeaderString(
                        "opc-next-page", ListWorkRequestLogsResponse.Builder::opcNextPage)
                .handleResponseHeaderString(
                        "opc-request-id", ListWorkRequestLogsResponse.Builder::opcRequestId)
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
                        "ServiceMesh",
                        "ListWorkRequests",
                        "https://docs.oracle.com/iaas/api/#/en/service-mesh/20220615/WorkRequest/ListWorkRequests")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListWorkRequestsRequest::builder)
                .basePath("/20220615")
                .appendPathParam("workRequests")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendQueryParam("workRequestId", request.getWorkRequestId())
                .appendQueryParam("resourceId", request.getResourceId())
                .appendEnumQueryParam("operationStatus", request.getOperationStatus())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .appendQueryParam("page", request.getPage())
                .appendQueryParam("limit", request.getLimit())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.servicemesh.model.WorkRequestCollection.class,
                        ListWorkRequestsResponse.Builder::workRequestCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListWorkRequestsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListWorkRequestsResponse.Builder::opcNextPage)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<UpdateAccessPolicyResponse> updateAccessPolicy(
            UpdateAccessPolicyRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            UpdateAccessPolicyRequest, UpdateAccessPolicyResponse>
                    handler) {

        Validate.notBlank(request.getAccessPolicyId(), "accessPolicyId must not be blank");
        Objects.requireNonNull(
                request.getUpdateAccessPolicyDetails(), "updateAccessPolicyDetails is required");

        return clientCall(request, UpdateAccessPolicyResponse::builder)
                .logger(LOG, "updateAccessPolicy")
                .serviceDetails(
                        "ServiceMesh",
                        "UpdateAccessPolicy",
                        "https://docs.oracle.com/iaas/api/#/en/service-mesh/20220615/AccessPolicy/UpdateAccessPolicy")
                .method(com.oracle.bmc.http.client.Method.PUT)
                .requestBuilder(UpdateAccessPolicyRequest::builder)
                .basePath("/20220615")
                .appendPathParam("accessPolicies")
                .appendPathParam(request.getAccessPolicyId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-work-request-id", UpdateAccessPolicyResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", UpdateAccessPolicyResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<UpdateIngressGatewayResponse> updateIngressGateway(
            UpdateIngressGatewayRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            UpdateIngressGatewayRequest, UpdateIngressGatewayResponse>
                    handler) {

        Validate.notBlank(request.getIngressGatewayId(), "ingressGatewayId must not be blank");
        Objects.requireNonNull(
                request.getUpdateIngressGatewayDetails(),
                "updateIngressGatewayDetails is required");

        return clientCall(request, UpdateIngressGatewayResponse::builder)
                .logger(LOG, "updateIngressGateway")
                .serviceDetails(
                        "ServiceMesh",
                        "UpdateIngressGateway",
                        "https://docs.oracle.com/iaas/api/#/en/service-mesh/20220615/IngressGateway/UpdateIngressGateway")
                .method(com.oracle.bmc.http.client.Method.PUT)
                .requestBuilder(UpdateIngressGatewayRequest::builder)
                .basePath("/20220615")
                .appendPathParam("ingressGateways")
                .appendPathParam(request.getIngressGatewayId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        UpdateIngressGatewayResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", UpdateIngressGatewayResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<UpdateIngressGatewayRouteTableResponse>
            updateIngressGatewayRouteTable(
                    UpdateIngressGatewayRouteTableRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    UpdateIngressGatewayRouteTableRequest,
                                    UpdateIngressGatewayRouteTableResponse>
                            handler) {

        Validate.notBlank(
                request.getIngressGatewayRouteTableId(),
                "ingressGatewayRouteTableId must not be blank");
        Objects.requireNonNull(
                request.getUpdateIngressGatewayRouteTableDetails(),
                "updateIngressGatewayRouteTableDetails is required");

        return clientCall(request, UpdateIngressGatewayRouteTableResponse::builder)
                .logger(LOG, "updateIngressGatewayRouteTable")
                .serviceDetails(
                        "ServiceMesh",
                        "UpdateIngressGatewayRouteTable",
                        "https://docs.oracle.com/iaas/api/#/en/service-mesh/20220615/IngressGatewayRouteTable/UpdateIngressGatewayRouteTable")
                .method(com.oracle.bmc.http.client.Method.PUT)
                .requestBuilder(UpdateIngressGatewayRouteTableRequest::builder)
                .basePath("/20220615")
                .appendPathParam("ingressGatewayRouteTables")
                .appendPathParam(request.getIngressGatewayRouteTableId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        UpdateIngressGatewayRouteTableResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id",
                        UpdateIngressGatewayRouteTableResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<UpdateMeshResponse> updateMesh(
            UpdateMeshRequest request,
            final com.oracle.bmc.responses.AsyncHandler<UpdateMeshRequest, UpdateMeshResponse>
                    handler) {

        Validate.notBlank(request.getMeshId(), "meshId must not be blank");
        Objects.requireNonNull(request.getUpdateMeshDetails(), "updateMeshDetails is required");

        return clientCall(request, UpdateMeshResponse::builder)
                .logger(LOG, "updateMesh")
                .serviceDetails(
                        "ServiceMesh",
                        "UpdateMesh",
                        "https://docs.oracle.com/iaas/api/#/en/service-mesh/20220615/Mesh/UpdateMesh")
                .method(com.oracle.bmc.http.client.Method.PUT)
                .requestBuilder(UpdateMeshRequest::builder)
                .basePath("/20220615")
                .appendPathParam("meshes")
                .appendPathParam(request.getMeshId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-work-request-id", UpdateMeshResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", UpdateMeshResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<UpdateVirtualDeploymentResponse> updateVirtualDeployment(
            UpdateVirtualDeploymentRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            UpdateVirtualDeploymentRequest, UpdateVirtualDeploymentResponse>
                    handler) {

        Validate.notBlank(
                request.getVirtualDeploymentId(), "virtualDeploymentId must not be blank");
        Objects.requireNonNull(
                request.getUpdateVirtualDeploymentDetails(),
                "updateVirtualDeploymentDetails is required");

        return clientCall(request, UpdateVirtualDeploymentResponse::builder)
                .logger(LOG, "updateVirtualDeployment")
                .serviceDetails(
                        "ServiceMesh",
                        "UpdateVirtualDeployment",
                        "https://docs.oracle.com/iaas/api/#/en/service-mesh/20220615/VirtualDeployment/UpdateVirtualDeployment")
                .method(com.oracle.bmc.http.client.Method.PUT)
                .requestBuilder(UpdateVirtualDeploymentRequest::builder)
                .basePath("/20220615")
                .appendPathParam("virtualDeployments")
                .appendPathParam(request.getVirtualDeploymentId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        UpdateVirtualDeploymentResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", UpdateVirtualDeploymentResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<UpdateVirtualServiceResponse> updateVirtualService(
            UpdateVirtualServiceRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            UpdateVirtualServiceRequest, UpdateVirtualServiceResponse>
                    handler) {

        Validate.notBlank(request.getVirtualServiceId(), "virtualServiceId must not be blank");
        Objects.requireNonNull(
                request.getUpdateVirtualServiceDetails(),
                "updateVirtualServiceDetails is required");

        return clientCall(request, UpdateVirtualServiceResponse::builder)
                .logger(LOG, "updateVirtualService")
                .serviceDetails(
                        "ServiceMesh",
                        "UpdateVirtualService",
                        "https://docs.oracle.com/iaas/api/#/en/service-mesh/20220615/VirtualService/UpdateVirtualService")
                .method(com.oracle.bmc.http.client.Method.PUT)
                .requestBuilder(UpdateVirtualServiceRequest::builder)
                .basePath("/20220615")
                .appendPathParam("virtualServices")
                .appendPathParam(request.getVirtualServiceId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        UpdateVirtualServiceResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", UpdateVirtualServiceResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<UpdateVirtualServiceRouteTableResponse>
            updateVirtualServiceRouteTable(
                    UpdateVirtualServiceRouteTableRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    UpdateVirtualServiceRouteTableRequest,
                                    UpdateVirtualServiceRouteTableResponse>
                            handler) {

        Validate.notBlank(
                request.getVirtualServiceRouteTableId(),
                "virtualServiceRouteTableId must not be blank");
        Objects.requireNonNull(
                request.getUpdateVirtualServiceRouteTableDetails(),
                "updateVirtualServiceRouteTableDetails is required");

        return clientCall(request, UpdateVirtualServiceRouteTableResponse::builder)
                .logger(LOG, "updateVirtualServiceRouteTable")
                .serviceDetails(
                        "ServiceMesh",
                        "UpdateVirtualServiceRouteTable",
                        "https://docs.oracle.com/iaas/api/#/en/service-mesh/20220615/VirtualServiceRouteTable/UpdateVirtualServiceRouteTable")
                .method(com.oracle.bmc.http.client.Method.PUT)
                .requestBuilder(UpdateVirtualServiceRouteTableRequest::builder)
                .basePath("/20220615")
                .appendPathParam("virtualServiceRouteTables")
                .appendPathParam(request.getVirtualServiceRouteTableId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        UpdateVirtualServiceRouteTableResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id",
                        UpdateVirtualServiceRouteTableResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    /**
     * Create a new client instance.
     *
     * @param authenticationDetailsProvider The authentication details (see {@link Builder#build})
     * @deprecated Use the {@link #builder() builder} instead.
     */
    @Deprecated
    public ServiceMeshAsyncClient(
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
    public ServiceMeshAsyncClient(
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
    public ServiceMeshAsyncClient(
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
    public ServiceMeshAsyncClient(
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
    public ServiceMeshAsyncClient(
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
    public ServiceMeshAsyncClient(
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
    public ServiceMeshAsyncClient(
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

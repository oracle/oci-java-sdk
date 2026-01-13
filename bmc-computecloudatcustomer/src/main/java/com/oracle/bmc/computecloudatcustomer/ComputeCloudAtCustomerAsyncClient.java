/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.computecloudatcustomer;

import com.oracle.bmc.util.internal.Validate;
import com.oracle.bmc.computecloudatcustomer.requests.*;
import com.oracle.bmc.computecloudatcustomer.responses.*;

import java.util.Objects;

/**
 * Async client implementation for ComputeCloudAtCustomer service. <br>
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
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20221208")
public class ComputeCloudAtCustomerAsyncClient extends com.oracle.bmc.http.internal.BaseAsyncClient
        implements ComputeCloudAtCustomerAsync {
    /** Service instance for ComputeCloudAtCustomer. */
    public static final com.oracle.bmc.Service SERVICE =
            com.oracle.bmc.Services.serviceBuilder()
                    .serviceName(ComputeCloudAtCustomerClient.class.getName())
                    .serviceEndpointPrefix("")
                    .serviceEndpointTemplate("https://ccc.{region}.oci.{secondLevelDomain}")
                    .build();

    private static final org.slf4j.Logger LOG =
            org.slf4j.LoggerFactory.getLogger(ComputeCloudAtCustomerAsyncClient.class);

    ComputeCloudAtCustomerAsyncClient(
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
                    Builder, ComputeCloudAtCustomerAsyncClient> {
        private Builder(com.oracle.bmc.Service service) {
            super(service);
            final String packageName = "computecloudatcustomer";
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
        public ComputeCloudAtCustomerAsyncClient build(
                @jakarta.annotation.Nonnull
                        com.oracle.bmc.auth.AbstractAuthenticationDetailsProvider
                                authenticationDetailsProvider) {
            return new ComputeCloudAtCustomerAsyncClient(this, authenticationDetailsProvider);
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
    public java.util.concurrent.Future<ChangeCccInfrastructureCompartmentResponse>
            changeCccInfrastructureCompartment(
                    ChangeCccInfrastructureCompartmentRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ChangeCccInfrastructureCompartmentRequest,
                                    ChangeCccInfrastructureCompartmentResponse>
                            handler) {

        Validate.notBlank(
                request.getCccInfrastructureId(), "cccInfrastructureId must not be blank");
        Objects.requireNonNull(
                request.getChangeCccInfrastructureCompartmentDetails(),
                "changeCccInfrastructureCompartmentDetails is required");

        return clientCall(request, ChangeCccInfrastructureCompartmentResponse::builder)
                .logger(LOG, "changeCccInfrastructureCompartment")
                .serviceDetails(
                        "ComputeCloudAtCustomer",
                        "ChangeCccInfrastructureCompartment",
                        "https://docs.oracle.com/iaas/api/#/en/compute-cloud-at-customer/20221208/CccInfrastructure/ChangeCccInfrastructureCompartment")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(ChangeCccInfrastructureCompartmentRequest::builder)
                .basePath("/20221208")
                .appendPathParam("cccInfrastructures")
                .appendPathParam(request.getCccInfrastructureId())
                .appendPathParam("actions")
                .appendPathParam("changeCompartment")
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-request-id",
                        ChangeCccInfrastructureCompartmentResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ChangeCccUpgradeScheduleCompartmentResponse>
            changeCccUpgradeScheduleCompartment(
                    ChangeCccUpgradeScheduleCompartmentRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ChangeCccUpgradeScheduleCompartmentRequest,
                                    ChangeCccUpgradeScheduleCompartmentResponse>
                            handler) {

        Validate.notBlank(
                request.getCccUpgradeScheduleId(), "cccUpgradeScheduleId must not be blank");
        Objects.requireNonNull(
                request.getChangeCccUpgradeScheduleCompartmentDetails(),
                "changeCccUpgradeScheduleCompartmentDetails is required");

        return clientCall(request, ChangeCccUpgradeScheduleCompartmentResponse::builder)
                .logger(LOG, "changeCccUpgradeScheduleCompartment")
                .serviceDetails(
                        "ComputeCloudAtCustomer",
                        "ChangeCccUpgradeScheduleCompartment",
                        "https://docs.oracle.com/iaas/api/#/en/compute-cloud-at-customer/20221208/CccUpgradeSchedule/ChangeCccUpgradeScheduleCompartment")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(ChangeCccUpgradeScheduleCompartmentRequest::builder)
                .basePath("/20221208")
                .appendPathParam("cccUpgradeSchedules")
                .appendPathParam(request.getCccUpgradeScheduleId())
                .appendPathParam("actions")
                .appendPathParam("changeCompartment")
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-request-id",
                        ChangeCccUpgradeScheduleCompartmentResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<CreateCccInfrastructureResponse> createCccInfrastructure(
            CreateCccInfrastructureRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            CreateCccInfrastructureRequest, CreateCccInfrastructureResponse>
                    handler) {
        Objects.requireNonNull(
                request.getCreateCccInfrastructureDetails(),
                "createCccInfrastructureDetails is required");

        return clientCall(request, CreateCccInfrastructureResponse::builder)
                .logger(LOG, "createCccInfrastructure")
                .serviceDetails(
                        "ComputeCloudAtCustomer",
                        "CreateCccInfrastructure",
                        "https://docs.oracle.com/iaas/api/#/en/compute-cloud-at-customer/20221208/CccInfrastructure/CreateCccInfrastructure")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CreateCccInfrastructureRequest::builder)
                .basePath("/20221208")
                .appendPathParam("cccInfrastructures")
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.computecloudatcustomer.model.CccInfrastructure.class,
                        CreateCccInfrastructureResponse.Builder::cccInfrastructure)
                .handleResponseHeaderString("etag", CreateCccInfrastructureResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", CreateCccInfrastructureResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<CreateCccUpgradeScheduleResponse> createCccUpgradeSchedule(
            CreateCccUpgradeScheduleRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            CreateCccUpgradeScheduleRequest, CreateCccUpgradeScheduleResponse>
                    handler) {
        Objects.requireNonNull(
                request.getCreateCccUpgradeScheduleDetails(),
                "createCccUpgradeScheduleDetails is required");

        return clientCall(request, CreateCccUpgradeScheduleResponse::builder)
                .logger(LOG, "createCccUpgradeSchedule")
                .serviceDetails(
                        "ComputeCloudAtCustomer",
                        "CreateCccUpgradeSchedule",
                        "https://docs.oracle.com/iaas/api/#/en/compute-cloud-at-customer/20221208/CccUpgradeSchedule/CreateCccUpgradeSchedule")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CreateCccUpgradeScheduleRequest::builder)
                .basePath("/20221208")
                .appendPathParam("cccUpgradeSchedules")
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.computecloudatcustomer.model.CccUpgradeSchedule.class,
                        CreateCccUpgradeScheduleResponse.Builder::cccUpgradeSchedule)
                .handleResponseHeaderString("etag", CreateCccUpgradeScheduleResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", CreateCccUpgradeScheduleResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<DeleteCccInfrastructureResponse> deleteCccInfrastructure(
            DeleteCccInfrastructureRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            DeleteCccInfrastructureRequest, DeleteCccInfrastructureResponse>
                    handler) {

        Validate.notBlank(
                request.getCccInfrastructureId(), "cccInfrastructureId must not be blank");

        return clientCall(request, DeleteCccInfrastructureResponse::builder)
                .logger(LOG, "deleteCccInfrastructure")
                .serviceDetails(
                        "ComputeCloudAtCustomer",
                        "DeleteCccInfrastructure",
                        "https://docs.oracle.com/iaas/api/#/en/compute-cloud-at-customer/20221208/CccInfrastructure/DeleteCccInfrastructure")
                .method(com.oracle.bmc.http.client.Method.DELETE)
                .requestBuilder(DeleteCccInfrastructureRequest::builder)
                .basePath("/20221208")
                .appendPathParam("cccInfrastructures")
                .appendPathParam(request.getCccInfrastructureId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleResponseHeaderString(
                        "opc-request-id", DeleteCccInfrastructureResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<DeleteCccUpgradeScheduleResponse> deleteCccUpgradeSchedule(
            DeleteCccUpgradeScheduleRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            DeleteCccUpgradeScheduleRequest, DeleteCccUpgradeScheduleResponse>
                    handler) {

        Validate.notBlank(
                request.getCccUpgradeScheduleId(), "cccUpgradeScheduleId must not be blank");

        return clientCall(request, DeleteCccUpgradeScheduleResponse::builder)
                .logger(LOG, "deleteCccUpgradeSchedule")
                .serviceDetails(
                        "ComputeCloudAtCustomer",
                        "DeleteCccUpgradeSchedule",
                        "https://docs.oracle.com/iaas/api/#/en/compute-cloud-at-customer/20221208/CccUpgradeSchedule/DeleteCccUpgradeSchedule")
                .method(com.oracle.bmc.http.client.Method.DELETE)
                .requestBuilder(DeleteCccUpgradeScheduleRequest::builder)
                .basePath("/20221208")
                .appendPathParam("cccUpgradeSchedules")
                .appendPathParam(request.getCccUpgradeScheduleId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleResponseHeaderString(
                        "opc-request-id", DeleteCccUpgradeScheduleResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<GetCccInfrastructureResponse> getCccInfrastructure(
            GetCccInfrastructureRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetCccInfrastructureRequest, GetCccInfrastructureResponse>
                    handler) {

        Validate.notBlank(
                request.getCccInfrastructureId(), "cccInfrastructureId must not be blank");

        return clientCall(request, GetCccInfrastructureResponse::builder)
                .logger(LOG, "getCccInfrastructure")
                .serviceDetails(
                        "ComputeCloudAtCustomer",
                        "GetCccInfrastructure",
                        "https://docs.oracle.com/iaas/api/#/en/compute-cloud-at-customer/20221208/CccInfrastructure/GetCccInfrastructure")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetCccInfrastructureRequest::builder)
                .basePath("/20221208")
                .appendPathParam("cccInfrastructures")
                .appendPathParam(request.getCccInfrastructureId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.computecloudatcustomer.model.CccInfrastructure.class,
                        GetCccInfrastructureResponse.Builder::cccInfrastructure)
                .handleResponseHeaderString("etag", GetCccInfrastructureResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", GetCccInfrastructureResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<GetCccUpgradeScheduleResponse> getCccUpgradeSchedule(
            GetCccUpgradeScheduleRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetCccUpgradeScheduleRequest, GetCccUpgradeScheduleResponse>
                    handler) {

        Validate.notBlank(
                request.getCccUpgradeScheduleId(), "cccUpgradeScheduleId must not be blank");

        return clientCall(request, GetCccUpgradeScheduleResponse::builder)
                .logger(LOG, "getCccUpgradeSchedule")
                .serviceDetails(
                        "ComputeCloudAtCustomer",
                        "GetCccUpgradeSchedule",
                        "https://docs.oracle.com/iaas/api/#/en/compute-cloud-at-customer/20221208/CccUpgradeSchedule/GetCccUpgradeSchedule")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetCccUpgradeScheduleRequest::builder)
                .basePath("/20221208")
                .appendPathParam("cccUpgradeSchedules")
                .appendPathParam(request.getCccUpgradeScheduleId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.computecloudatcustomer.model.CccUpgradeSchedule.class,
                        GetCccUpgradeScheduleResponse.Builder::cccUpgradeSchedule)
                .handleResponseHeaderString("etag", GetCccUpgradeScheduleResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", GetCccUpgradeScheduleResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListCccInfrastructuresResponse> listCccInfrastructures(
            ListCccInfrastructuresRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListCccInfrastructuresRequest, ListCccInfrastructuresResponse>
                    handler) {

        return clientCall(request, ListCccInfrastructuresResponse::builder)
                .logger(LOG, "listCccInfrastructures")
                .serviceDetails(
                        "ComputeCloudAtCustomer",
                        "ListCccInfrastructures",
                        "https://docs.oracle.com/iaas/api/#/en/compute-cloud-at-customer/20221208/CccInfrastructureCollection/ListCccInfrastructures")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListCccInfrastructuresRequest::builder)
                .basePath("/20221208")
                .appendPathParam("cccInfrastructures")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendQueryParam("compartmentIdInSubtree", request.getCompartmentIdInSubtree())
                .appendEnumQueryParam("accessLevel", request.getAccessLevel())
                .appendEnumQueryParam("lifecycleState", request.getLifecycleState())
                .appendQueryParam("displayName", request.getDisplayName())
                .appendQueryParam("displayNameContains", request.getDisplayNameContains())
                .appendQueryParam("cccInfrastructureId", request.getCccInfrastructureId())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.computecloudatcustomer.model.CccInfrastructureCollection
                                .class,
                        ListCccInfrastructuresResponse.Builder::cccInfrastructureCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListCccInfrastructuresResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListCccInfrastructuresResponse.Builder::opcNextPage)
                .handleResponseHeaderString(
                        "opc-prev-page", ListCccInfrastructuresResponse.Builder::opcPrevPage)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListCccUpgradeSchedulesResponse> listCccUpgradeSchedules(
            ListCccUpgradeSchedulesRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListCccUpgradeSchedulesRequest, ListCccUpgradeSchedulesResponse>
                    handler) {

        return clientCall(request, ListCccUpgradeSchedulesResponse::builder)
                .logger(LOG, "listCccUpgradeSchedules")
                .serviceDetails(
                        "ComputeCloudAtCustomer",
                        "ListCccUpgradeSchedules",
                        "https://docs.oracle.com/iaas/api/#/en/compute-cloud-at-customer/20221208/CccUpgradeScheduleCollection/ListCccUpgradeSchedules")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListCccUpgradeSchedulesRequest::builder)
                .basePath("/20221208")
                .appendPathParam("cccUpgradeSchedules")
                .appendQueryParam("cccUpgradeScheduleId", request.getCccUpgradeScheduleId())
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendQueryParam("compartmentIdInSubtree", request.getCompartmentIdInSubtree())
                .appendEnumQueryParam("accessLevel", request.getAccessLevel())
                .appendEnumQueryParam("lifecycleState", request.getLifecycleState())
                .appendQueryParam("displayName", request.getDisplayName())
                .appendQueryParam("displayNameContains", request.getDisplayNameContains())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.computecloudatcustomer.model.CccUpgradeScheduleCollection
                                .class,
                        ListCccUpgradeSchedulesResponse.Builder::cccUpgradeScheduleCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListCccUpgradeSchedulesResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListCccUpgradeSchedulesResponse.Builder::opcNextPage)
                .handleResponseHeaderString(
                        "opc-prev-page", ListCccUpgradeSchedulesResponse.Builder::opcPrevPage)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<UpdateCccInfrastructureResponse> updateCccInfrastructure(
            UpdateCccInfrastructureRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            UpdateCccInfrastructureRequest, UpdateCccInfrastructureResponse>
                    handler) {

        Validate.notBlank(
                request.getCccInfrastructureId(), "cccInfrastructureId must not be blank");
        Objects.requireNonNull(
                request.getUpdateCccInfrastructureDetails(),
                "updateCccInfrastructureDetails is required");

        return clientCall(request, UpdateCccInfrastructureResponse::builder)
                .logger(LOG, "updateCccInfrastructure")
                .serviceDetails(
                        "ComputeCloudAtCustomer",
                        "UpdateCccInfrastructure",
                        "https://docs.oracle.com/iaas/api/#/en/compute-cloud-at-customer/20221208/CccInfrastructure/UpdateCccInfrastructure")
                .method(com.oracle.bmc.http.client.Method.PUT)
                .requestBuilder(UpdateCccInfrastructureRequest::builder)
                .basePath("/20221208")
                .appendPathParam("cccInfrastructures")
                .appendPathParam(request.getCccInfrastructureId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.computecloudatcustomer.model.CccInfrastructure.class,
                        UpdateCccInfrastructureResponse.Builder::cccInfrastructure)
                .handleResponseHeaderString("etag", UpdateCccInfrastructureResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", UpdateCccInfrastructureResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<UpdateCccUpgradeScheduleResponse> updateCccUpgradeSchedule(
            UpdateCccUpgradeScheduleRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            UpdateCccUpgradeScheduleRequest, UpdateCccUpgradeScheduleResponse>
                    handler) {

        Validate.notBlank(
                request.getCccUpgradeScheduleId(), "cccUpgradeScheduleId must not be blank");
        Objects.requireNonNull(
                request.getUpdateCccUpgradeScheduleDetails(),
                "updateCccUpgradeScheduleDetails is required");

        return clientCall(request, UpdateCccUpgradeScheduleResponse::builder)
                .logger(LOG, "updateCccUpgradeSchedule")
                .serviceDetails(
                        "ComputeCloudAtCustomer",
                        "UpdateCccUpgradeSchedule",
                        "https://docs.oracle.com/iaas/api/#/en/compute-cloud-at-customer/20221208/CccUpgradeSchedule/UpdateCccUpgradeSchedule")
                .method(com.oracle.bmc.http.client.Method.PUT)
                .requestBuilder(UpdateCccUpgradeScheduleRequest::builder)
                .basePath("/20221208")
                .appendPathParam("cccUpgradeSchedules")
                .appendPathParam(request.getCccUpgradeScheduleId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.computecloudatcustomer.model.CccUpgradeSchedule.class,
                        UpdateCccUpgradeScheduleResponse.Builder::cccUpgradeSchedule)
                .handleResponseHeaderString("etag", UpdateCccUpgradeScheduleResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", UpdateCccUpgradeScheduleResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    /**
     * Create a new client instance.
     *
     * @param authenticationDetailsProvider The authentication details (see {@link Builder#build})
     * @deprecated Use the {@link #builder() builder} instead.
     */
    @Deprecated
    public ComputeCloudAtCustomerAsyncClient(
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
    public ComputeCloudAtCustomerAsyncClient(
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
    public ComputeCloudAtCustomerAsyncClient(
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
    public ComputeCloudAtCustomerAsyncClient(
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
    public ComputeCloudAtCustomerAsyncClient(
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
    public ComputeCloudAtCustomerAsyncClient(
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
    public ComputeCloudAtCustomerAsyncClient(
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

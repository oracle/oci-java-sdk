/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.apmcontrolplane;

import com.oracle.bmc.util.internal.Validate;
import com.oracle.bmc.apmcontrolplane.requests.*;
import com.oracle.bmc.apmcontrolplane.responses.*;

import java.util.Objects;

/**
 * Async client implementation for ApmDomain service. <br>
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
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200630")
public class ApmDomainAsyncClient extends com.oracle.bmc.http.internal.BaseAsyncClient
        implements ApmDomainAsync {
    /** Service instance for ApmDomain. */
    public static final com.oracle.bmc.Service SERVICE =
            com.oracle.bmc.Services.serviceBuilder()
                    .serviceName(ApmDomainClient.class.getName())
                    .serviceEndpointPrefix("")
                    .serviceEndpointTemplate("https://apm-cp.{region}.oci.{secondLevelDomain}")
                    .build();

    private static final org.slf4j.Logger LOG =
            org.slf4j.LoggerFactory.getLogger(ApmDomainAsyncClient.class);

    ApmDomainAsyncClient(
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
            extends com.oracle.bmc.common.RegionalClientBuilder<Builder, ApmDomainAsyncClient> {
        private Builder(com.oracle.bmc.Service service) {
            super(service);
            final String packageName = "apmcontrolplane";
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
        public ApmDomainAsyncClient build(
                @jakarta.annotation.Nonnull
                        com.oracle.bmc.auth.AbstractAuthenticationDetailsProvider
                                authenticationDetailsProvider) {
            return new ApmDomainAsyncClient(this, authenticationDetailsProvider);
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
    public java.util.concurrent.Future<ChangeApmDomainCompartmentResponse>
            changeApmDomainCompartment(
                    ChangeApmDomainCompartmentRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ChangeApmDomainCompartmentRequest,
                                    ChangeApmDomainCompartmentResponse>
                            handler) {

        Validate.notBlank(request.getApmDomainId(), "apmDomainId must not be blank");
        Objects.requireNonNull(
                request.getChangeApmDomainCompartmentDetails(),
                "changeApmDomainCompartmentDetails is required");

        return clientCall(request, ChangeApmDomainCompartmentResponse::builder)
                .logger(LOG, "changeApmDomainCompartment")
                .serviceDetails(
                        "ApmDomain",
                        "ChangeApmDomainCompartment",
                        "https://docs.oracle.com/iaas/api/#/en/apm-control-plane/20200630/ApmDomain/ChangeApmDomainCompartment")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(ChangeApmDomainCompartmentRequest::builder)
                .basePath("/20200630")
                .appendPathParam("apmDomains")
                .appendPathParam(request.getApmDomainId())
                .appendPathParam("actions")
                .appendPathParam("changeCompartment")
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        ChangeApmDomainCompartmentResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", ChangeApmDomainCompartmentResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<CreateApmDomainResponse> createApmDomain(
            CreateApmDomainRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            CreateApmDomainRequest, CreateApmDomainResponse>
                    handler) {
        Objects.requireNonNull(
                request.getCreateApmDomainDetails(), "createApmDomainDetails is required");

        return clientCall(request, CreateApmDomainResponse::builder)
                .logger(LOG, "createApmDomain")
                .serviceDetails(
                        "ApmDomain",
                        "CreateApmDomain",
                        "https://docs.oracle.com/iaas/api/#/en/apm-control-plane/20200630/ApmDomain/CreateApmDomain")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CreateApmDomainRequest::builder)
                .basePath("/20200630")
                .appendPathParam("apmDomains")
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-work-request-id", CreateApmDomainResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", CreateApmDomainResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<DeleteApmDomainResponse> deleteApmDomain(
            DeleteApmDomainRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            DeleteApmDomainRequest, DeleteApmDomainResponse>
                    handler) {

        Validate.notBlank(request.getApmDomainId(), "apmDomainId must not be blank");

        return clientCall(request, DeleteApmDomainResponse::builder)
                .logger(LOG, "deleteApmDomain")
                .serviceDetails(
                        "ApmDomain",
                        "DeleteApmDomain",
                        "https://docs.oracle.com/iaas/api/#/en/apm-control-plane/20200630/ApmDomain/DeleteApmDomain")
                .method(com.oracle.bmc.http.client.Method.DELETE)
                .requestBuilder(DeleteApmDomainRequest::builder)
                .basePath("/20200630")
                .appendPathParam("apmDomains")
                .appendPathParam(request.getApmDomainId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleResponseHeaderString(
                        "opc-work-request-id", DeleteApmDomainResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", DeleteApmDomainResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<GenerateDataKeysResponse> generateDataKeys(
            GenerateDataKeysRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GenerateDataKeysRequest, GenerateDataKeysResponse>
                    handler) {
        Objects.requireNonNull(
                request.getGenerateDataKeysListDetails(),
                "generateDataKeysListDetails is required");

        Validate.notBlank(request.getApmDomainId(), "apmDomainId must not be blank");

        return clientCall(request, GenerateDataKeysResponse::builder)
                .logger(LOG, "generateDataKeys")
                .serviceDetails(
                        "ApmDomain",
                        "GenerateDataKeys",
                        "https://docs.oracle.com/iaas/api/#/en/apm-control-plane/20200630/DataKey/GenerateDataKeys")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(GenerateDataKeysRequest::builder)
                .basePath("/20200630")
                .appendPathParam("apmDomains")
                .appendPathParam(request.getApmDomainId())
                .appendPathParam("actions")
                .appendPathParam("generateDataKeys")
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-work-request-id", GenerateDataKeysResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", GenerateDataKeysResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<GetApmDomainResponse> getApmDomain(
            GetApmDomainRequest request,
            final com.oracle.bmc.responses.AsyncHandler<GetApmDomainRequest, GetApmDomainResponse>
                    handler) {

        Validate.notBlank(request.getApmDomainId(), "apmDomainId must not be blank");

        return clientCall(request, GetApmDomainResponse::builder)
                .logger(LOG, "getApmDomain")
                .serviceDetails(
                        "ApmDomain",
                        "GetApmDomain",
                        "https://docs.oracle.com/iaas/api/#/en/apm-control-plane/20200630/ApmDomain/GetApmDomain")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetApmDomainRequest::builder)
                .basePath("/20200630")
                .appendPathParam("apmDomains")
                .appendPathParam(request.getApmDomainId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.apmcontrolplane.model.ApmDomain.class,
                        GetApmDomainResponse.Builder::apmDomain)
                .handleResponseHeaderString("etag", GetApmDomainResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", GetApmDomainResponse.Builder::opcRequestId)
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
                        "ApmDomain",
                        "GetWorkRequest",
                        "https://docs.oracle.com/iaas/api/#/en/apm-control-plane/20200630/WorkRequest/GetWorkRequest")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetWorkRequestRequest::builder)
                .basePath("/20200630")
                .appendPathParam("workRequests")
                .appendPathParam(request.getWorkRequestId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.apmcontrolplane.model.WorkRequest.class,
                        GetWorkRequestResponse.Builder::workRequest)
                .handleResponseHeaderString("etag", GetWorkRequestResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", GetWorkRequestResponse.Builder::opcRequestId)
                .handleResponseHeaderFloat(
                        "retry-after", GetWorkRequestResponse.Builder::retryAfter)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListApmDomainWorkRequestsResponse> listApmDomainWorkRequests(
            ListApmDomainWorkRequestsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListApmDomainWorkRequestsRequest, ListApmDomainWorkRequestsResponse>
                    handler) {

        Validate.notBlank(request.getApmDomainId(), "apmDomainId must not be blank");

        return clientCall(request, ListApmDomainWorkRequestsResponse::builder)
                .logger(LOG, "listApmDomainWorkRequests")
                .serviceDetails(
                        "ApmDomain",
                        "ListApmDomainWorkRequests",
                        "https://docs.oracle.com/iaas/api/#/en/apm-control-plane/20200630/WorkRequest/ListApmDomainWorkRequests")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListApmDomainWorkRequestsRequest::builder)
                .basePath("/20200630")
                .appendPathParam("apmDomains")
                .appendPathParam(request.getApmDomainId())
                .appendPathParam("workRequests")
                .appendQueryParam("page", request.getPage())
                .appendQueryParam("limit", request.getLimit())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBodyList(
                        com.oracle.bmc.apmcontrolplane.model.WorkRequest.class,
                        ListApmDomainWorkRequestsResponse.Builder::items)
                .handleResponseHeaderString(
                        "opc-request-id", ListApmDomainWorkRequestsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListApmDomainWorkRequestsResponse.Builder::opcNextPage)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListApmDomainsResponse> listApmDomains(
            ListApmDomainsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListApmDomainsRequest, ListApmDomainsResponse>
                    handler) {
        Objects.requireNonNull(request.getCompartmentId(), "compartmentId is required");

        return clientCall(request, ListApmDomainsResponse::builder)
                .logger(LOG, "listApmDomains")
                .serviceDetails(
                        "ApmDomain",
                        "ListApmDomains",
                        "https://docs.oracle.com/iaas/api/#/en/apm-control-plane/20200630/ApmDomainSummary/ListApmDomains")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListApmDomainsRequest::builder)
                .basePath("/20200630")
                .appendPathParam("apmDomains")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendQueryParam("displayName", request.getDisplayName())
                .appendEnumQueryParam("lifecycleState", request.getLifecycleState())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBodyList(
                        com.oracle.bmc.apmcontrolplane.model.ApmDomainSummary.class,
                        ListApmDomainsResponse.Builder::items)
                .handleResponseHeaderString(
                        "opc-request-id", ListApmDomainsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListApmDomainsResponse.Builder::opcNextPage)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListDataKeysResponse> listDataKeys(
            ListDataKeysRequest request,
            final com.oracle.bmc.responses.AsyncHandler<ListDataKeysRequest, ListDataKeysResponse>
                    handler) {

        Validate.notBlank(request.getApmDomainId(), "apmDomainId must not be blank");

        return clientCall(request, ListDataKeysResponse::builder)
                .logger(LOG, "listDataKeys")
                .serviceDetails(
                        "ApmDomain",
                        "ListDataKeys",
                        "https://docs.oracle.com/iaas/api/#/en/apm-control-plane/20200630/DataKeySummary/ListDataKeys")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListDataKeysRequest::builder)
                .basePath("/20200630")
                .appendPathParam("apmDomains")
                .appendPathParam(request.getApmDomainId())
                .appendPathParam("dataKeys")
                .appendEnumQueryParam("dataKeyType", request.getDataKeyType())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBodyList(
                        com.oracle.bmc.apmcontrolplane.model.DataKeySummary.class,
                        ListDataKeysResponse.Builder::items)
                .handleResponseHeaderString(
                        "opc-request-id", ListDataKeysResponse.Builder::opcRequestId)
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
                        "ApmDomain",
                        "ListWorkRequestErrors",
                        "https://docs.oracle.com/iaas/api/#/en/apm-control-plane/20200630/WorkRequestError/ListWorkRequestErrors")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListWorkRequestErrorsRequest::builder)
                .basePath("/20200630")
                .appendPathParam("workRequests")
                .appendPathParam(request.getWorkRequestId())
                .appendPathParam("errors")
                .appendQueryParam("page", request.getPage())
                .appendQueryParam("limit", request.getLimit())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBodyList(
                        com.oracle.bmc.apmcontrolplane.model.WorkRequestError.class,
                        ListWorkRequestErrorsResponse.Builder::items)
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
                        "ApmDomain",
                        "ListWorkRequestLogs",
                        "https://docs.oracle.com/iaas/api/#/en/apm-control-plane/20200630/WorkRequestLogEntry/ListWorkRequestLogs")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListWorkRequestLogsRequest::builder)
                .basePath("/20200630")
                .appendPathParam("workRequests")
                .appendPathParam(request.getWorkRequestId())
                .appendPathParam("logs")
                .appendQueryParam("page", request.getPage())
                .appendQueryParam("limit", request.getLimit())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBodyList(
                        com.oracle.bmc.apmcontrolplane.model.WorkRequestLogEntry.class,
                        ListWorkRequestLogsResponse.Builder::items)
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
                        "ApmDomain",
                        "ListWorkRequests",
                        "https://docs.oracle.com/iaas/api/#/en/apm-control-plane/20200630/WorkRequest/ListWorkRequests")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListWorkRequestsRequest::builder)
                .basePath("/20200630")
                .appendPathParam("workRequests")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendQueryParam("page", request.getPage())
                .appendQueryParam("limit", request.getLimit())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBodyList(
                        com.oracle.bmc.apmcontrolplane.model.WorkRequest.class,
                        ListWorkRequestsResponse.Builder::items)
                .handleResponseHeaderString(
                        "opc-request-id", ListWorkRequestsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListWorkRequestsResponse.Builder::opcNextPage)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<RemoveDataKeysResponse> removeDataKeys(
            RemoveDataKeysRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            RemoveDataKeysRequest, RemoveDataKeysResponse>
                    handler) {

        Validate.notBlank(request.getApmDomainId(), "apmDomainId must not be blank");
        Objects.requireNonNull(
                request.getRemoveDataKeysListDetails(), "removeDataKeysListDetails is required");

        return clientCall(request, RemoveDataKeysResponse::builder)
                .logger(LOG, "removeDataKeys")
                .serviceDetails(
                        "ApmDomain",
                        "RemoveDataKeys",
                        "https://docs.oracle.com/iaas/api/#/en/apm-control-plane/20200630/DataKey/RemoveDataKeys")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(RemoveDataKeysRequest::builder)
                .basePath("/20200630")
                .appendPathParam("apmDomains")
                .appendPathParam(request.getApmDomainId())
                .appendPathParam("actions")
                .appendPathParam("removeDataKeys")
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-work-request-id", RemoveDataKeysResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", RemoveDataKeysResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<UpdateApmDomainResponse> updateApmDomain(
            UpdateApmDomainRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            UpdateApmDomainRequest, UpdateApmDomainResponse>
                    handler) {

        Validate.notBlank(request.getApmDomainId(), "apmDomainId must not be blank");
        Objects.requireNonNull(
                request.getUpdateApmDomainDetails(), "updateApmDomainDetails is required");

        return clientCall(request, UpdateApmDomainResponse::builder)
                .logger(LOG, "updateApmDomain")
                .serviceDetails(
                        "ApmDomain",
                        "UpdateApmDomain",
                        "https://docs.oracle.com/iaas/api/#/en/apm-control-plane/20200630/ApmDomain/UpdateApmDomain")
                .method(com.oracle.bmc.http.client.Method.PUT)
                .requestBuilder(UpdateApmDomainRequest::builder)
                .basePath("/20200630")
                .appendPathParam("apmDomains")
                .appendPathParam(request.getApmDomainId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-work-request-id", UpdateApmDomainResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", UpdateApmDomainResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    /**
     * Create a new client instance.
     *
     * @param authenticationDetailsProvider The authentication details (see {@link Builder#build})
     * @deprecated Use the {@link #builder() builder} instead.
     */
    @Deprecated
    public ApmDomainAsyncClient(
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
    public ApmDomainAsyncClient(
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
    public ApmDomainAsyncClient(
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
    public ApmDomainAsyncClient(
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
    public ApmDomainAsyncClient(
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
    public ApmDomainAsyncClient(
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
    public ApmDomainAsyncClient(
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

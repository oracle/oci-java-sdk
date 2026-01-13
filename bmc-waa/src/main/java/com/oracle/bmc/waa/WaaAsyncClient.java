/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.waa;

import com.oracle.bmc.util.internal.Validate;
import com.oracle.bmc.waa.requests.*;
import com.oracle.bmc.waa.responses.*;

import java.util.Objects;

/**
 * Async client implementation for Waa service. <br>
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
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20211230")
public class WaaAsyncClient extends com.oracle.bmc.http.internal.BaseAsyncClient
        implements WaaAsync {
    /** Service instance for Waa. */
    public static final com.oracle.bmc.Service SERVICE =
            com.oracle.bmc.Services.serviceBuilder()
                    .serviceName(WaaClient.class.getName())
                    .serviceEndpointPrefix("")
                    .serviceEndpointTemplate("https://waa.{region}.oci.{secondLevelDomain}")
                    .build();

    private static final org.slf4j.Logger LOG =
            org.slf4j.LoggerFactory.getLogger(WaaAsyncClient.class);

    WaaAsyncClient(
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
            extends com.oracle.bmc.common.RegionalClientBuilder<Builder, WaaAsyncClient> {
        private Builder(com.oracle.bmc.Service service) {
            super(service);
            final String packageName = "waa";
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
        public WaaAsyncClient build(
                @jakarta.annotation.Nonnull
                        com.oracle.bmc.auth.AbstractAuthenticationDetailsProvider
                                authenticationDetailsProvider) {
            return new WaaAsyncClient(this, authenticationDetailsProvider);
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
    public java.util.concurrent.Future<ChangeWebAppAccelerationCompartmentResponse>
            changeWebAppAccelerationCompartment(
                    ChangeWebAppAccelerationCompartmentRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ChangeWebAppAccelerationCompartmentRequest,
                                    ChangeWebAppAccelerationCompartmentResponse>
                            handler) {

        Validate.notBlank(
                request.getWebAppAccelerationId(), "webAppAccelerationId must not be blank");
        Objects.requireNonNull(
                request.getChangeWebAppAccelerationCompartmentDetails(),
                "changeWebAppAccelerationCompartmentDetails is required");

        return clientCall(request, ChangeWebAppAccelerationCompartmentResponse::builder)
                .logger(LOG, "changeWebAppAccelerationCompartment")
                .serviceDetails(
                        "Waa",
                        "ChangeWebAppAccelerationCompartment",
                        "https://docs.oracle.com/iaas/api/#/en/waa/20211230/WebAppAcceleration/ChangeWebAppAccelerationCompartment")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(ChangeWebAppAccelerationCompartmentRequest::builder)
                .basePath("/20211230")
                .appendPathParam("webAppAccelerations")
                .appendPathParam(request.getWebAppAccelerationId())
                .appendPathParam("actions")
                .appendPathParam("changeCompartment")
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        ChangeWebAppAccelerationCompartmentResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id",
                        ChangeWebAppAccelerationCompartmentResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ChangeWebAppAccelerationPolicyCompartmentResponse>
            changeWebAppAccelerationPolicyCompartment(
                    ChangeWebAppAccelerationPolicyCompartmentRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ChangeWebAppAccelerationPolicyCompartmentRequest,
                                    ChangeWebAppAccelerationPolicyCompartmentResponse>
                            handler) {

        Validate.notBlank(
                request.getWebAppAccelerationPolicyId(),
                "webAppAccelerationPolicyId must not be blank");
        Objects.requireNonNull(
                request.getChangeWebAppAccelerationPolicyCompartmentDetails(),
                "changeWebAppAccelerationPolicyCompartmentDetails is required");

        return clientCall(request, ChangeWebAppAccelerationPolicyCompartmentResponse::builder)
                .logger(LOG, "changeWebAppAccelerationPolicyCompartment")
                .serviceDetails(
                        "Waa",
                        "ChangeWebAppAccelerationPolicyCompartment",
                        "https://docs.oracle.com/iaas/api/#/en/waa/20211230/WebAppAccelerationPolicy/ChangeWebAppAccelerationPolicyCompartment")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(ChangeWebAppAccelerationPolicyCompartmentRequest::builder)
                .basePath("/20211230")
                .appendPathParam("webAppAccelerationPolicies")
                .appendPathParam(request.getWebAppAccelerationPolicyId())
                .appendPathParam("actions")
                .appendPathParam("changeCompartment")
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        ChangeWebAppAccelerationPolicyCompartmentResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id",
                        ChangeWebAppAccelerationPolicyCompartmentResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<CreateWebAppAccelerationResponse> createWebAppAcceleration(
            CreateWebAppAccelerationRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            CreateWebAppAccelerationRequest, CreateWebAppAccelerationResponse>
                    handler) {
        Objects.requireNonNull(
                request.getCreateWebAppAccelerationDetails(),
                "createWebAppAccelerationDetails is required");

        return clientCall(request, CreateWebAppAccelerationResponse::builder)
                .logger(LOG, "createWebAppAcceleration")
                .serviceDetails(
                        "Waa",
                        "CreateWebAppAcceleration",
                        "https://docs.oracle.com/iaas/api/#/en/waa/20211230/WebAppAcceleration/CreateWebAppAcceleration")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CreateWebAppAccelerationRequest::builder)
                .basePath("/20211230")
                .appendPathParam("webAppAccelerations")
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.waa.model.WebAppAcceleration.class,
                        CreateWebAppAccelerationResponse.Builder::webAppAcceleration)
                .handleResponseHeaderString("etag", CreateWebAppAccelerationResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        CreateWebAppAccelerationResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", CreateWebAppAccelerationResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "location", CreateWebAppAccelerationResponse.Builder::location)
                .handleResponseHeaderString(
                        "content-location",
                        CreateWebAppAccelerationResponse.Builder::contentLocation)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<CreateWebAppAccelerationPolicyResponse>
            createWebAppAccelerationPolicy(
                    CreateWebAppAccelerationPolicyRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    CreateWebAppAccelerationPolicyRequest,
                                    CreateWebAppAccelerationPolicyResponse>
                            handler) {
        Objects.requireNonNull(
                request.getCreateWebAppAccelerationPolicyDetails(),
                "createWebAppAccelerationPolicyDetails is required");

        return clientCall(request, CreateWebAppAccelerationPolicyResponse::builder)
                .logger(LOG, "createWebAppAccelerationPolicy")
                .serviceDetails(
                        "Waa",
                        "CreateWebAppAccelerationPolicy",
                        "https://docs.oracle.com/iaas/api/#/en/waa/20211230/WebAppAccelerationPolicy/CreateWebAppAccelerationPolicy")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CreateWebAppAccelerationPolicyRequest::builder)
                .basePath("/20211230")
                .appendPathParam("webAppAccelerationPolicies")
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.waa.model.WebAppAccelerationPolicy.class,
                        CreateWebAppAccelerationPolicyResponse.Builder::webAppAccelerationPolicy)
                .handleResponseHeaderString(
                        "etag", CreateWebAppAccelerationPolicyResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        CreateWebAppAccelerationPolicyResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id",
                        CreateWebAppAccelerationPolicyResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "location", CreateWebAppAccelerationPolicyResponse.Builder::location)
                .handleResponseHeaderString(
                        "content-location",
                        CreateWebAppAccelerationPolicyResponse.Builder::contentLocation)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<DeleteWebAppAccelerationResponse> deleteWebAppAcceleration(
            DeleteWebAppAccelerationRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            DeleteWebAppAccelerationRequest, DeleteWebAppAccelerationResponse>
                    handler) {

        Validate.notBlank(
                request.getWebAppAccelerationId(), "webAppAccelerationId must not be blank");

        return clientCall(request, DeleteWebAppAccelerationResponse::builder)
                .logger(LOG, "deleteWebAppAcceleration")
                .serviceDetails(
                        "Waa",
                        "DeleteWebAppAcceleration",
                        "https://docs.oracle.com/iaas/api/#/en/waa/20211230/WebAppAcceleration/DeleteWebAppAcceleration")
                .method(com.oracle.bmc.http.client.Method.DELETE)
                .requestBuilder(DeleteWebAppAccelerationRequest::builder)
                .basePath("/20211230")
                .appendPathParam("webAppAccelerations")
                .appendPathParam(request.getWebAppAccelerationId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        DeleteWebAppAccelerationResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", DeleteWebAppAccelerationResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<DeleteWebAppAccelerationPolicyResponse>
            deleteWebAppAccelerationPolicy(
                    DeleteWebAppAccelerationPolicyRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    DeleteWebAppAccelerationPolicyRequest,
                                    DeleteWebAppAccelerationPolicyResponse>
                            handler) {

        Validate.notBlank(
                request.getWebAppAccelerationPolicyId(),
                "webAppAccelerationPolicyId must not be blank");

        return clientCall(request, DeleteWebAppAccelerationPolicyResponse::builder)
                .logger(LOG, "deleteWebAppAccelerationPolicy")
                .serviceDetails(
                        "Waa",
                        "DeleteWebAppAccelerationPolicy",
                        "https://docs.oracle.com/iaas/api/#/en/waa/20211230/WebAppAccelerationPolicy/DeleteWebAppAccelerationPolicy")
                .method(com.oracle.bmc.http.client.Method.DELETE)
                .requestBuilder(DeleteWebAppAccelerationPolicyRequest::builder)
                .basePath("/20211230")
                .appendPathParam("webAppAccelerationPolicies")
                .appendPathParam(request.getWebAppAccelerationPolicyId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        DeleteWebAppAccelerationPolicyResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id",
                        DeleteWebAppAccelerationPolicyResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<GetWebAppAccelerationResponse> getWebAppAcceleration(
            GetWebAppAccelerationRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetWebAppAccelerationRequest, GetWebAppAccelerationResponse>
                    handler) {

        Validate.notBlank(
                request.getWebAppAccelerationId(), "webAppAccelerationId must not be blank");

        return clientCall(request, GetWebAppAccelerationResponse::builder)
                .logger(LOG, "getWebAppAcceleration")
                .serviceDetails(
                        "Waa",
                        "GetWebAppAcceleration",
                        "https://docs.oracle.com/iaas/api/#/en/waa/20211230/WebAppAcceleration/GetWebAppAcceleration")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetWebAppAccelerationRequest::builder)
                .basePath("/20211230")
                .appendPathParam("webAppAccelerations")
                .appendPathParam(request.getWebAppAccelerationId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.waa.model.WebAppAcceleration.class,
                        GetWebAppAccelerationResponse.Builder::webAppAcceleration)
                .handleResponseHeaderString("etag", GetWebAppAccelerationResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", GetWebAppAccelerationResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<GetWebAppAccelerationPolicyResponse>
            getWebAppAccelerationPolicy(
                    GetWebAppAccelerationPolicyRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    GetWebAppAccelerationPolicyRequest,
                                    GetWebAppAccelerationPolicyResponse>
                            handler) {

        Validate.notBlank(
                request.getWebAppAccelerationPolicyId(),
                "webAppAccelerationPolicyId must not be blank");

        return clientCall(request, GetWebAppAccelerationPolicyResponse::builder)
                .logger(LOG, "getWebAppAccelerationPolicy")
                .serviceDetails(
                        "Waa",
                        "GetWebAppAccelerationPolicy",
                        "https://docs.oracle.com/iaas/api/#/en/waa/20211230/WebAppAccelerationPolicy/GetWebAppAccelerationPolicy")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetWebAppAccelerationPolicyRequest::builder)
                .basePath("/20211230")
                .appendPathParam("webAppAccelerationPolicies")
                .appendPathParam(request.getWebAppAccelerationPolicyId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.waa.model.WebAppAccelerationPolicy.class,
                        GetWebAppAccelerationPolicyResponse.Builder::webAppAccelerationPolicy)
                .handleResponseHeaderString(
                        "etag", GetWebAppAccelerationPolicyResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", GetWebAppAccelerationPolicyResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListWebAppAccelerationPoliciesResponse>
            listWebAppAccelerationPolicies(
                    ListWebAppAccelerationPoliciesRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ListWebAppAccelerationPoliciesRequest,
                                    ListWebAppAccelerationPoliciesResponse>
                            handler) {
        Objects.requireNonNull(request.getCompartmentId(), "compartmentId is required");

        return clientCall(request, ListWebAppAccelerationPoliciesResponse::builder)
                .logger(LOG, "listWebAppAccelerationPolicies")
                .serviceDetails(
                        "Waa",
                        "ListWebAppAccelerationPolicies",
                        "https://docs.oracle.com/iaas/api/#/en/waa/20211230/WebAppAccelerationPolicy/ListWebAppAccelerationPolicies")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListWebAppAccelerationPoliciesRequest::builder)
                .basePath("/20211230")
                .appendPathParam("webAppAccelerationPolicies")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendListQueryParam(
                        "lifecycleState",
                        request.getLifecycleState(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .appendQueryParam("displayName", request.getDisplayName())
                .appendQueryParam("id", request.getId())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.waa.model.WebAppAccelerationPolicyCollection.class,
                        ListWebAppAccelerationPoliciesResponse.Builder
                                ::webAppAccelerationPolicyCollection)
                .handleResponseHeaderString(
                        "opc-request-id",
                        ListWebAppAccelerationPoliciesResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page",
                        ListWebAppAccelerationPoliciesResponse.Builder::opcNextPage)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListWebAppAccelerationsResponse> listWebAppAccelerations(
            ListWebAppAccelerationsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListWebAppAccelerationsRequest, ListWebAppAccelerationsResponse>
                    handler) {
        Objects.requireNonNull(request.getCompartmentId(), "compartmentId is required");

        return clientCall(request, ListWebAppAccelerationsResponse::builder)
                .logger(LOG, "listWebAppAccelerations")
                .serviceDetails(
                        "Waa",
                        "ListWebAppAccelerations",
                        "https://docs.oracle.com/iaas/api/#/en/waa/20211230/WebAppAcceleration/ListWebAppAccelerations")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListWebAppAccelerationsRequest::builder)
                .basePath("/20211230")
                .appendPathParam("webAppAccelerations")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendQueryParam("id", request.getId())
                .appendQueryParam(
                        "webAppAccelerationPolicyId", request.getWebAppAccelerationPolicyId())
                .appendListQueryParam(
                        "lifecycleState",
                        request.getLifecycleState(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .appendQueryParam("displayName", request.getDisplayName())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.waa.model.WebAppAccelerationCollection.class,
                        ListWebAppAccelerationsResponse.Builder::webAppAccelerationCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListWebAppAccelerationsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListWebAppAccelerationsResponse.Builder::opcNextPage)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<PurgeWebAppAccelerationCacheResponse>
            purgeWebAppAccelerationCache(
                    PurgeWebAppAccelerationCacheRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    PurgeWebAppAccelerationCacheRequest,
                                    PurgeWebAppAccelerationCacheResponse>
                            handler) {

        Validate.notBlank(
                request.getWebAppAccelerationId(), "webAppAccelerationId must not be blank");
        Objects.requireNonNull(
                request.getPurgeWebAppAccelerationCacheDetails(),
                "purgeWebAppAccelerationCacheDetails is required");

        return clientCall(request, PurgeWebAppAccelerationCacheResponse::builder)
                .logger(LOG, "purgeWebAppAccelerationCache")
                .serviceDetails(
                        "Waa",
                        "PurgeWebAppAccelerationCache",
                        "https://docs.oracle.com/iaas/api/#/en/waa/20211230/WebAppAcceleration/PurgeWebAppAccelerationCache")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(PurgeWebAppAccelerationCacheRequest::builder)
                .basePath("/20211230")
                .appendPathParam("webAppAccelerations")
                .appendPathParam(request.getWebAppAccelerationId())
                .appendPathParam("actions")
                .appendPathParam("purgeCache")
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        PurgeWebAppAccelerationCacheResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id",
                        PurgeWebAppAccelerationCacheResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<UpdateWebAppAccelerationResponse> updateWebAppAcceleration(
            UpdateWebAppAccelerationRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            UpdateWebAppAccelerationRequest, UpdateWebAppAccelerationResponse>
                    handler) {

        Validate.notBlank(
                request.getWebAppAccelerationId(), "webAppAccelerationId must not be blank");
        Objects.requireNonNull(
                request.getUpdateWebAppAccelerationDetails(),
                "updateWebAppAccelerationDetails is required");

        return clientCall(request, UpdateWebAppAccelerationResponse::builder)
                .logger(LOG, "updateWebAppAcceleration")
                .serviceDetails(
                        "Waa",
                        "UpdateWebAppAcceleration",
                        "https://docs.oracle.com/iaas/api/#/en/waa/20211230/WebAppAcceleration/UpdateWebAppAcceleration")
                .method(com.oracle.bmc.http.client.Method.PUT)
                .requestBuilder(UpdateWebAppAccelerationRequest::builder)
                .basePath("/20211230")
                .appendPathParam("webAppAccelerations")
                .appendPathParam(request.getWebAppAccelerationId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        UpdateWebAppAccelerationResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", UpdateWebAppAccelerationResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<UpdateWebAppAccelerationPolicyResponse>
            updateWebAppAccelerationPolicy(
                    UpdateWebAppAccelerationPolicyRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    UpdateWebAppAccelerationPolicyRequest,
                                    UpdateWebAppAccelerationPolicyResponse>
                            handler) {

        Validate.notBlank(
                request.getWebAppAccelerationPolicyId(),
                "webAppAccelerationPolicyId must not be blank");
        Objects.requireNonNull(
                request.getUpdateWebAppAccelerationPolicyDetails(),
                "updateWebAppAccelerationPolicyDetails is required");

        return clientCall(request, UpdateWebAppAccelerationPolicyResponse::builder)
                .logger(LOG, "updateWebAppAccelerationPolicy")
                .serviceDetails(
                        "Waa",
                        "UpdateWebAppAccelerationPolicy",
                        "https://docs.oracle.com/iaas/api/#/en/waa/20211230/WebAppAccelerationPolicy/UpdateWebAppAccelerationPolicy")
                .method(com.oracle.bmc.http.client.Method.PUT)
                .requestBuilder(UpdateWebAppAccelerationPolicyRequest::builder)
                .basePath("/20211230")
                .appendPathParam("webAppAccelerationPolicies")
                .appendPathParam(request.getWebAppAccelerationPolicyId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        UpdateWebAppAccelerationPolicyResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id",
                        UpdateWebAppAccelerationPolicyResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    /**
     * Create a new client instance.
     *
     * @param authenticationDetailsProvider The authentication details (see {@link Builder#build})
     * @deprecated Use the {@link #builder() builder} instead.
     */
    @Deprecated
    public WaaAsyncClient(
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
    public WaaAsyncClient(
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
    public WaaAsyncClient(
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
    public WaaAsyncClient(
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
    public WaaAsyncClient(
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
    public WaaAsyncClient(
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
    public WaaAsyncClient(
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

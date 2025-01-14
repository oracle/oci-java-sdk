/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.ocvp;

import com.oracle.bmc.util.internal.Validate;
import com.oracle.bmc.ocvp.requests.*;
import com.oracle.bmc.ocvp.responses.*;

import java.util.Objects;

/**
 * Async client implementation for EsxiHost service. <br>
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
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20230701")
public class EsxiHostAsyncClient extends com.oracle.bmc.http.internal.BaseAsyncClient
        implements EsxiHostAsync {
    /** Service instance for EsxiHost. */
    public static final com.oracle.bmc.Service SERVICE =
            com.oracle.bmc.Services.serviceBuilder()
                    .serviceName("ESXIHOST")
                    .serviceEndpointPrefix("")
                    .serviceEndpointTemplate("https://ocvps.{region}.oci.{secondLevelDomain}")
                    .build();

    private static final org.slf4j.Logger LOG =
            org.slf4j.LoggerFactory.getLogger(EsxiHostAsyncClient.class);

    EsxiHostAsyncClient(
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
            extends com.oracle.bmc.common.RegionalClientBuilder<Builder, EsxiHostAsyncClient> {
        private Builder(com.oracle.bmc.Service service) {
            super(service);
            final String packageName = "ocvp";
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
        public EsxiHostAsyncClient build(
                @jakarta.annotation.Nonnull
                        com.oracle.bmc.auth.AbstractAuthenticationDetailsProvider
                                authenticationDetailsProvider) {
            return new EsxiHostAsyncClient(this, authenticationDetailsProvider);
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
    public java.util.concurrent.Future<CreateEsxiHostResponse> createEsxiHost(
            CreateEsxiHostRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            CreateEsxiHostRequest, CreateEsxiHostResponse>
                    handler) {
        Objects.requireNonNull(
                request.getCreateEsxiHostDetails(), "createEsxiHostDetails is required");

        return clientCall(request, CreateEsxiHostResponse::builder)
                .logger(LOG, "createEsxiHost")
                .serviceDetails(
                        "EsxiHost",
                        "CreateEsxiHost",
                        "https://docs.oracle.com/iaas/api/#/en/vmware/20230701/EsxiHost/CreateEsxiHost")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CreateEsxiHostRequest::builder)
                .basePath("/20230701")
                .appendPathParam("esxiHosts")
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-work-request-id", CreateEsxiHostResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", CreateEsxiHostResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<DeleteEsxiHostResponse> deleteEsxiHost(
            DeleteEsxiHostRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            DeleteEsxiHostRequest, DeleteEsxiHostResponse>
                    handler) {

        Validate.notBlank(request.getEsxiHostId(), "esxiHostId must not be blank");

        return clientCall(request, DeleteEsxiHostResponse::builder)
                .logger(LOG, "deleteEsxiHost")
                .serviceDetails(
                        "EsxiHost",
                        "DeleteEsxiHost",
                        "https://docs.oracle.com/iaas/api/#/en/vmware/20230701/EsxiHost/DeleteEsxiHost")
                .method(com.oracle.bmc.http.client.Method.DELETE)
                .requestBuilder(DeleteEsxiHostRequest::builder)
                .basePath("/20230701")
                .appendPathParam("esxiHosts")
                .appendPathParam(request.getEsxiHostId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleResponseHeaderString(
                        "opc-work-request-id", DeleteEsxiHostResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", DeleteEsxiHostResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<GetEsxiHostResponse> getEsxiHost(
            GetEsxiHostRequest request,
            final com.oracle.bmc.responses.AsyncHandler<GetEsxiHostRequest, GetEsxiHostResponse>
                    handler) {

        Validate.notBlank(request.getEsxiHostId(), "esxiHostId must not be blank");

        return clientCall(request, GetEsxiHostResponse::builder)
                .logger(LOG, "getEsxiHost")
                .serviceDetails(
                        "EsxiHost",
                        "GetEsxiHost",
                        "https://docs.oracle.com/iaas/api/#/en/vmware/20230701/EsxiHost/GetEsxiHost")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetEsxiHostRequest::builder)
                .basePath("/20230701")
                .appendPathParam("esxiHosts")
                .appendPathParam(request.getEsxiHostId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.ocvp.model.EsxiHost.class,
                        GetEsxiHostResponse.Builder::esxiHost)
                .handleResponseHeaderString("etag", GetEsxiHostResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", GetEsxiHostResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<InplaceUpgradeResponse> inplaceUpgrade(
            InplaceUpgradeRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            InplaceUpgradeRequest, InplaceUpgradeResponse>
                    handler) {

        Validate.notBlank(request.getEsxiHostId(), "esxiHostId must not be blank");

        return clientCall(request, InplaceUpgradeResponse::builder)
                .logger(LOG, "inplaceUpgrade")
                .serviceDetails(
                        "EsxiHost",
                        "InplaceUpgrade",
                        "https://docs.oracle.com/iaas/api/#/en/vmware/20230701/EsxiHost/InplaceUpgrade")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(InplaceUpgradeRequest::builder)
                .basePath("/20230701")
                .appendPathParam("esxiHosts")
                .appendPathParam(request.getEsxiHostId())
                .appendPathParam("actions")
                .appendPathParam("inplaceUpgrade")
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleResponseHeaderString(
                        "opc-work-request-id", InplaceUpgradeResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", InplaceUpgradeResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListEsxiHostsResponse> listEsxiHosts(
            ListEsxiHostsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<ListEsxiHostsRequest, ListEsxiHostsResponse>
                    handler) {

        return clientCall(request, ListEsxiHostsResponse::builder)
                .logger(LOG, "listEsxiHosts")
                .serviceDetails(
                        "EsxiHost",
                        "ListEsxiHosts",
                        "https://docs.oracle.com/iaas/api/#/en/vmware/20230701/EsxiHostSummary/ListEsxiHosts")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListEsxiHostsRequest::builder)
                .basePath("/20230701")
                .appendPathParam("esxiHosts")
                .appendQueryParam("sddcId", request.getSddcId())
                .appendQueryParam("clusterId", request.getClusterId())
                .appendQueryParam("computeInstanceId", request.getComputeInstanceId())
                .appendQueryParam("displayName", request.getDisplayName())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .appendEnumQueryParam("lifecycleState", request.getLifecycleState())
                .appendQueryParam("isBillingDonorsOnly", request.getIsBillingDonorsOnly())
                .appendQueryParam("isSwapBillingOnly", request.getIsSwapBillingOnly())
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.ocvp.model.EsxiHostCollection.class,
                        ListEsxiHostsResponse.Builder::esxiHostCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListEsxiHostsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListEsxiHostsResponse.Builder::opcNextPage)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ReplaceHostResponse> replaceHost(
            ReplaceHostRequest request,
            final com.oracle.bmc.responses.AsyncHandler<ReplaceHostRequest, ReplaceHostResponse>
                    handler) {

        Validate.notBlank(request.getEsxiHostId(), "esxiHostId must not be blank");
        Objects.requireNonNull(request.getReplaceHostDetails(), "replaceHostDetails is required");

        return clientCall(request, ReplaceHostResponse::builder)
                .logger(LOG, "replaceHost")
                .serviceDetails(
                        "EsxiHost",
                        "ReplaceHost",
                        "https://docs.oracle.com/iaas/api/#/en/vmware/20230701/EsxiHost/ReplaceHost")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(ReplaceHostRequest::builder)
                .basePath("/20230701")
                .appendPathParam("esxiHosts")
                .appendPathParam(request.getEsxiHostId())
                .appendPathParam("actions")
                .appendPathParam("replaceHost")
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-work-request-id", ReplaceHostResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", ReplaceHostResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<SwapBillingResponse> swapBilling(
            SwapBillingRequest request,
            final com.oracle.bmc.responses.AsyncHandler<SwapBillingRequest, SwapBillingResponse>
                    handler) {

        Validate.notBlank(request.getEsxiHostId(), "esxiHostId must not be blank");
        Objects.requireNonNull(request.getSwapBillingHostId(), "swapBillingHostId is required");

        return clientCall(request, SwapBillingResponse::builder)
                .logger(LOG, "swapBilling")
                .serviceDetails(
                        "EsxiHost",
                        "SwapBilling",
                        "https://docs.oracle.com/iaas/api/#/en/vmware/20230701/EsxiHost/SwapBilling")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(SwapBillingRequest::builder)
                .basePath("/20230701")
                .appendPathParam("esxiHosts")
                .appendPathParam(request.getEsxiHostId())
                .appendPathParam("actions")
                .appendPathParam("swapBilling")
                .appendQueryParam("swapBillingHostId", request.getSwapBillingHostId())
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleResponseHeaderString(
                        "opc-work-request-id", SwapBillingResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", SwapBillingResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<UpdateEsxiHostResponse> updateEsxiHost(
            UpdateEsxiHostRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            UpdateEsxiHostRequest, UpdateEsxiHostResponse>
                    handler) {

        Validate.notBlank(request.getEsxiHostId(), "esxiHostId must not be blank");
        Objects.requireNonNull(
                request.getUpdateEsxiHostDetails(), "updateEsxiHostDetails is required");

        return clientCall(request, UpdateEsxiHostResponse::builder)
                .logger(LOG, "updateEsxiHost")
                .serviceDetails(
                        "EsxiHost",
                        "UpdateEsxiHost",
                        "https://docs.oracle.com/iaas/api/#/en/vmware/20230701/EsxiHost/UpdateEsxiHost")
                .method(com.oracle.bmc.http.client.Method.PUT)
                .requestBuilder(UpdateEsxiHostRequest::builder)
                .basePath("/20230701")
                .appendPathParam("esxiHosts")
                .appendPathParam(request.getEsxiHostId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.ocvp.model.EsxiHost.class,
                        UpdateEsxiHostResponse.Builder::esxiHost)
                .handleResponseHeaderString("etag", UpdateEsxiHostResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", UpdateEsxiHostResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    /**
     * Create a new client instance.
     *
     * @param authenticationDetailsProvider The authentication details (see {@link Builder#build})
     * @deprecated Use the {@link #builder() builder} instead.
     */
    @Deprecated
    public EsxiHostAsyncClient(
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
    public EsxiHostAsyncClient(
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
    public EsxiHostAsyncClient(
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
    public EsxiHostAsyncClient(
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
    public EsxiHostAsyncClient(
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
    public EsxiHostAsyncClient(
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
    public EsxiHostAsyncClient(
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

/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.functions;

import com.oracle.bmc.util.internal.Validate;
import com.oracle.bmc.functions.requests.*;
import com.oracle.bmc.functions.responses.*;
import com.oracle.bmc.circuitbreaker.CircuitBreakerConfiguration;
import com.oracle.bmc.util.CircuitBreakerUtils;

import java.util.Objects;

@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20181201")
public class FunctionsManagementClient extends com.oracle.bmc.http.internal.BaseSyncClient
        implements FunctionsManagement {
    /** Service instance for FunctionsManagement. */
    public static final com.oracle.bmc.Service SERVICE =
            com.oracle.bmc.Services.serviceBuilder()
                    .serviceName(FunctionsManagementClient.class.getName())
                    .serviceEndpointPrefix("")
                    .serviceEndpointTemplate("https://functions.{region}.oci.{secondLevelDomain}")
                    .build();

    private static final org.slf4j.Logger LOG =
            org.slf4j.LoggerFactory.getLogger(FunctionsManagementClient.class);

    private final FunctionsManagementWaiters waiters;

    private final FunctionsManagementPaginators paginators;

    FunctionsManagementClient(
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
                                    .nameFormat("FunctionsManagement-waiters-%d")
                                    .build());
            threadPoolExecutor.allowCoreThreadTimeOut(true);

            executorService = threadPoolExecutor;
        }
        this.waiters = new FunctionsManagementWaiters(executorService, this);

        this.paginators = new FunctionsManagementPaginators(this);
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
                    Builder, FunctionsManagementClient> {
        private java.util.concurrent.ExecutorService executorService;

        private Builder(com.oracle.bmc.Service service) {
            super(service);
            final String packageName = "functions";
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
        public FunctionsManagementClient build(
                @jakarta.annotation.Nonnull
                        com.oracle.bmc.auth.AbstractAuthenticationDetailsProvider
                                authenticationDetailsProvider) {
            return new FunctionsManagementClient(
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
    public ChangeApplicationCompartmentResponse changeApplicationCompartment(
            ChangeApplicationCompartmentRequest request) {

        Validate.notBlank(request.getApplicationId(), "applicationId must not be blank");
        Objects.requireNonNull(
                request.getChangeApplicationCompartmentDetails(),
                "changeApplicationCompartmentDetails is required");

        return clientCall(request, ChangeApplicationCompartmentResponse::builder)
                .logger(LOG, "changeApplicationCompartment")
                .serviceDetails(
                        "FunctionsManagement",
                        "ChangeApplicationCompartment",
                        "https://docs.oracle.com/iaas/api/#/en/functions/20181201/Application/ChangeApplicationCompartment")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(ChangeApplicationCompartmentRequest::builder)
                .basePath("/20181201")
                .appendPathParam("applications")
                .appendPathParam(request.getApplicationId())
                .appendPathParam("actions")
                .appendPathParam("changeCompartment")
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .hasBody()
                .handleResponseHeaderString(
                        "opc-request-id",
                        ChangeApplicationCompartmentResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public CreateApplicationResponse createApplication(CreateApplicationRequest request) {
        Objects.requireNonNull(
                request.getCreateApplicationDetails(), "createApplicationDetails is required");

        return clientCall(request, CreateApplicationResponse::builder)
                .logger(LOG, "createApplication")
                .serviceDetails(
                        "FunctionsManagement",
                        "CreateApplication",
                        "https://docs.oracle.com/iaas/api/#/en/functions/20181201/Application/CreateApplication")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CreateApplicationRequest::builder)
                .basePath("/20181201")
                .appendPathParam("applications")
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .hasBody()
                .handleBody(
                        com.oracle.bmc.functions.model.Application.class,
                        CreateApplicationResponse.Builder::application)
                .handleResponseHeaderString("etag", CreateApplicationResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", CreateApplicationResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public CreateFunctionResponse createFunction(CreateFunctionRequest request) {
        Objects.requireNonNull(
                request.getCreateFunctionDetails(), "createFunctionDetails is required");

        return clientCall(request, CreateFunctionResponse::builder)
                .logger(LOG, "createFunction")
                .serviceDetails(
                        "FunctionsManagement",
                        "CreateFunction",
                        "https://docs.oracle.com/iaas/api/#/en/functions/20181201/Function/CreateFunction")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CreateFunctionRequest::builder)
                .basePath("/20181201")
                .appendPathParam("functions")
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .hasBody()
                .handleBody(
                        com.oracle.bmc.functions.model.Function.class,
                        CreateFunctionResponse.Builder::function)
                .handleResponseHeaderString("etag", CreateFunctionResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", CreateFunctionResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public DeleteApplicationResponse deleteApplication(DeleteApplicationRequest request) {

        Validate.notBlank(request.getApplicationId(), "applicationId must not be blank");

        return clientCall(request, DeleteApplicationResponse::builder)
                .logger(LOG, "deleteApplication")
                .serviceDetails(
                        "FunctionsManagement",
                        "DeleteApplication",
                        "https://docs.oracle.com/iaas/api/#/en/functions/20181201/Application/DeleteApplication")
                .method(com.oracle.bmc.http.client.Method.DELETE)
                .requestBuilder(DeleteApplicationRequest::builder)
                .basePath("/20181201")
                .appendPathParam("applications")
                .appendPathParam(request.getApplicationId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .handleResponseHeaderString(
                        "opc-request-id", DeleteApplicationResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public DeleteFunctionResponse deleteFunction(DeleteFunctionRequest request) {

        Validate.notBlank(request.getFunctionId(), "functionId must not be blank");

        return clientCall(request, DeleteFunctionResponse::builder)
                .logger(LOG, "deleteFunction")
                .serviceDetails(
                        "FunctionsManagement",
                        "DeleteFunction",
                        "https://docs.oracle.com/iaas/api/#/en/functions/20181201/Function/DeleteFunction")
                .method(com.oracle.bmc.http.client.Method.DELETE)
                .requestBuilder(DeleteFunctionRequest::builder)
                .basePath("/20181201")
                .appendPathParam("functions")
                .appendPathParam(request.getFunctionId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .handleResponseHeaderString(
                        "opc-request-id", DeleteFunctionResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public GetApplicationResponse getApplication(GetApplicationRequest request) {

        Validate.notBlank(request.getApplicationId(), "applicationId must not be blank");

        return clientCall(request, GetApplicationResponse::builder)
                .logger(LOG, "getApplication")
                .serviceDetails(
                        "FunctionsManagement",
                        "GetApplication",
                        "https://docs.oracle.com/iaas/api/#/en/functions/20181201/Application/GetApplication")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetApplicationRequest::builder)
                .basePath("/20181201")
                .appendPathParam("applications")
                .appendPathParam(request.getApplicationId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .handleBody(
                        com.oracle.bmc.functions.model.Application.class,
                        GetApplicationResponse.Builder::application)
                .handleResponseHeaderString("etag", GetApplicationResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", GetApplicationResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public GetFunctionResponse getFunction(GetFunctionRequest request) {

        Validate.notBlank(request.getFunctionId(), "functionId must not be blank");

        return clientCall(request, GetFunctionResponse::builder)
                .logger(LOG, "getFunction")
                .serviceDetails(
                        "FunctionsManagement",
                        "GetFunction",
                        "https://docs.oracle.com/iaas/api/#/en/functions/20181201/Function/GetFunction")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetFunctionRequest::builder)
                .basePath("/20181201")
                .appendPathParam("functions")
                .appendPathParam(request.getFunctionId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .handleBody(
                        com.oracle.bmc.functions.model.Function.class,
                        GetFunctionResponse.Builder::function)
                .handleResponseHeaderString("etag", GetFunctionResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", GetFunctionResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public GetPbfListingResponse getPbfListing(GetPbfListingRequest request) {

        Validate.notBlank(request.getPbfListingId(), "pbfListingId must not be blank");

        return clientCall(request, GetPbfListingResponse::builder)
                .logger(LOG, "getPbfListing")
                .serviceDetails(
                        "FunctionsManagement",
                        "GetPbfListing",
                        "https://docs.oracle.com/iaas/api/#/en/functions/20181201/PbfListing/GetPbfListing")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetPbfListingRequest::builder)
                .basePath("/20181201")
                .appendPathParam("pbfListings")
                .appendPathParam(request.getPbfListingId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .handleBody(
                        com.oracle.bmc.functions.model.PbfListing.class,
                        GetPbfListingResponse.Builder::pbfListing)
                .handleResponseHeaderString("etag", GetPbfListingResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", GetPbfListingResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public GetPbfListingVersionResponse getPbfListingVersion(GetPbfListingVersionRequest request) {

        Validate.notBlank(
                request.getPbfListingVersionId(), "pbfListingVersionId must not be blank");

        return clientCall(request, GetPbfListingVersionResponse::builder)
                .logger(LOG, "getPbfListingVersion")
                .serviceDetails(
                        "FunctionsManagement",
                        "GetPbfListingVersion",
                        "https://docs.oracle.com/iaas/api/#/en/functions/20181201/PbfListingVersion/GetPbfListingVersion")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetPbfListingVersionRequest::builder)
                .basePath("/20181201")
                .appendPathParam("pbfListingVersions")
                .appendPathParam(request.getPbfListingVersionId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .handleBody(
                        com.oracle.bmc.functions.model.PbfListingVersion.class,
                        GetPbfListingVersionResponse.Builder::pbfListingVersion)
                .handleResponseHeaderString("etag", GetPbfListingVersionResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", GetPbfListingVersionResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public ListApplicationsResponse listApplications(ListApplicationsRequest request) {
        Objects.requireNonNull(request.getCompartmentId(), "compartmentId is required");

        return clientCall(request, ListApplicationsResponse::builder)
                .logger(LOG, "listApplications")
                .serviceDetails(
                        "FunctionsManagement",
                        "ListApplications",
                        "https://docs.oracle.com/iaas/api/#/en/functions/20181201/ApplicationSummary/ListApplications")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListApplicationsRequest::builder)
                .basePath("/20181201")
                .appendPathParam("applications")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendEnumQueryParam("lifecycleState", request.getLifecycleState())
                .appendQueryParam("displayName", request.getDisplayName())
                .appendQueryParam("id", request.getId())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .handleBodyList(
                        com.oracle.bmc.functions.model.ApplicationSummary.class,
                        ListApplicationsResponse.Builder::items)
                .handleResponseHeaderString(
                        "opc-next-page", ListApplicationsResponse.Builder::opcNextPage)
                .handleResponseHeaderString(
                        "opc-request-id", ListApplicationsResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public ListFunctionsResponse listFunctions(ListFunctionsRequest request) {
        Objects.requireNonNull(request.getApplicationId(), "applicationId is required");

        return clientCall(request, ListFunctionsResponse::builder)
                .logger(LOG, "listFunctions")
                .serviceDetails(
                        "FunctionsManagement",
                        "ListFunctions",
                        "https://docs.oracle.com/iaas/api/#/en/functions/20181201/FunctionSummary/ListFunctions")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListFunctionsRequest::builder)
                .basePath("/20181201")
                .appendPathParam("functions")
                .appendQueryParam("applicationId", request.getApplicationId())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendEnumQueryParam("lifecycleState", request.getLifecycleState())
                .appendQueryParam("displayName", request.getDisplayName())
                .appendQueryParam("id", request.getId())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .handleBodyList(
                        com.oracle.bmc.functions.model.FunctionSummary.class,
                        ListFunctionsResponse.Builder::items)
                .handleResponseHeaderString(
                        "opc-next-page", ListFunctionsResponse.Builder::opcNextPage)
                .handleResponseHeaderString(
                        "opc-request-id", ListFunctionsResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public ListPbfListingVersionsResponse listPbfListingVersions(
            ListPbfListingVersionsRequest request) {
        Objects.requireNonNull(request.getPbfListingId(), "pbfListingId is required");

        return clientCall(request, ListPbfListingVersionsResponse::builder)
                .logger(LOG, "listPbfListingVersions")
                .serviceDetails(
                        "FunctionsManagement",
                        "ListPbfListingVersions",
                        "https://docs.oracle.com/iaas/api/#/en/functions/20181201/PbfListingVersion/ListPbfListingVersions")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListPbfListingVersionsRequest::builder)
                .basePath("/20181201")
                .appendPathParam("pbfListingVersions")
                .appendQueryParam("pbfListingId", request.getPbfListingId())
                .appendQueryParam("pbfListingVersionId", request.getPbfListingVersionId())
                .appendQueryParam("name", request.getName())
                .appendQueryParam("isCurrentVersion", request.getIsCurrentVersion())
                .appendEnumQueryParam("lifecycleState", request.getLifecycleState())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .handleBody(
                        com.oracle.bmc.functions.model.PbfListingVersionsCollection.class,
                        ListPbfListingVersionsResponse.Builder::pbfListingVersionsCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListPbfListingVersionsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListPbfListingVersionsResponse.Builder::opcNextPage)
                .callSync();
    }

    @Override
    public ListPbfListingsResponse listPbfListings(ListPbfListingsRequest request) {

        return clientCall(request, ListPbfListingsResponse::builder)
                .logger(LOG, "listPbfListings")
                .serviceDetails(
                        "FunctionsManagement",
                        "ListPbfListings",
                        "https://docs.oracle.com/iaas/api/#/en/functions/20181201/PbfListing/ListPbfListings")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListPbfListingsRequest::builder)
                .basePath("/20181201")
                .appendPathParam("pbfListings")
                .appendQueryParam("pbfListingId", request.getPbfListingId())
                .appendQueryParam("name", request.getName())
                .appendQueryParam("nameContains", request.getNameContains())
                .appendQueryParam("nameStartsWith", request.getNameStartsWith())
                .appendListQueryParam(
                        "trigger",
                        request.getTrigger(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .appendEnumQueryParam("lifecycleState", request.getLifecycleState())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .handleBody(
                        com.oracle.bmc.functions.model.PbfListingsCollection.class,
                        ListPbfListingsResponse.Builder::pbfListingsCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListPbfListingsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListPbfListingsResponse.Builder::opcNextPage)
                .callSync();
    }

    @Override
    public ListTriggersResponse listTriggers(ListTriggersRequest request) {

        return clientCall(request, ListTriggersResponse::builder)
                .logger(LOG, "listTriggers")
                .serviceDetails(
                        "FunctionsManagement",
                        "ListTriggers",
                        "https://docs.oracle.com/iaas/api/#/en/functions/20181201/TriggersCollection/ListTriggers")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListTriggersRequest::builder)
                .basePath("/20181201")
                .appendPathParam("pbfListings")
                .appendPathParam("triggers")
                .appendQueryParam("name", request.getName())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .handleBody(
                        com.oracle.bmc.functions.model.TriggersCollection.class,
                        ListTriggersResponse.Builder::triggersCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListTriggersResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListTriggersResponse.Builder::opcNextPage)
                .callSync();
    }

    @Override
    public UpdateApplicationResponse updateApplication(UpdateApplicationRequest request) {

        Validate.notBlank(request.getApplicationId(), "applicationId must not be blank");
        Objects.requireNonNull(
                request.getUpdateApplicationDetails(), "updateApplicationDetails is required");

        return clientCall(request, UpdateApplicationResponse::builder)
                .logger(LOG, "updateApplication")
                .serviceDetails(
                        "FunctionsManagement",
                        "UpdateApplication",
                        "https://docs.oracle.com/iaas/api/#/en/functions/20181201/Application/UpdateApplication")
                .method(com.oracle.bmc.http.client.Method.PUT)
                .requestBuilder(UpdateApplicationRequest::builder)
                .basePath("/20181201")
                .appendPathParam("applications")
                .appendPathParam(request.getApplicationId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .hasBody()
                .handleBody(
                        com.oracle.bmc.functions.model.Application.class,
                        UpdateApplicationResponse.Builder::application)
                .handleResponseHeaderString("etag", UpdateApplicationResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", UpdateApplicationResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public UpdateFunctionResponse updateFunction(UpdateFunctionRequest request) {

        Validate.notBlank(request.getFunctionId(), "functionId must not be blank");
        Objects.requireNonNull(
                request.getUpdateFunctionDetails(), "updateFunctionDetails is required");

        return clientCall(request, UpdateFunctionResponse::builder)
                .logger(LOG, "updateFunction")
                .serviceDetails(
                        "FunctionsManagement",
                        "UpdateFunction",
                        "https://docs.oracle.com/iaas/api/#/en/functions/20181201/Function/UpdateFunction")
                .method(com.oracle.bmc.http.client.Method.PUT)
                .requestBuilder(UpdateFunctionRequest::builder)
                .basePath("/20181201")
                .appendPathParam("functions")
                .appendPathParam(request.getFunctionId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .hasBody()
                .handleBody(
                        com.oracle.bmc.functions.model.Function.class,
                        UpdateFunctionResponse.Builder::function)
                .handleResponseHeaderString("etag", UpdateFunctionResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", UpdateFunctionResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public FunctionsManagementWaiters getWaiters() {
        return waiters;
    }

    @Override
    public FunctionsManagementPaginators getPaginators() {
        return paginators;
    }

    /**
     * Create a new client instance.
     *
     * @param authenticationDetailsProvider The authentication details (see {@link Builder#build})
     * @deprecated Use the {@link #builder() builder} instead.
     */
    @Deprecated
    public FunctionsManagementClient(
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
    public FunctionsManagementClient(
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
    public FunctionsManagementClient(
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
    public FunctionsManagementClient(
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
    public FunctionsManagementClient(
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
    public FunctionsManagementClient(
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
    public FunctionsManagementClient(
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
    public FunctionsManagementClient(
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

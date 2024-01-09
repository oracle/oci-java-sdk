/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.optimizer;

import com.oracle.bmc.util.internal.Validate;
import com.oracle.bmc.optimizer.requests.*;
import com.oracle.bmc.optimizer.responses.*;
import com.oracle.bmc.circuitbreaker.CircuitBreakerConfiguration;
import com.oracle.bmc.util.CircuitBreakerUtils;

import java.util.Objects;

@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200606")
public class OptimizerClient extends com.oracle.bmc.http.internal.BaseSyncClient
        implements Optimizer {
    /** Service instance for Optimizer. */
    public static final com.oracle.bmc.Service SERVICE =
            com.oracle.bmc.Services.serviceBuilder()
                    .serviceName("OPTIMIZER")
                    .serviceEndpointPrefix("")
                    .serviceEndpointTemplate("https://optimizer.{region}.oci.{secondLevelDomain}")
                    .build();

    private static final org.slf4j.Logger LOG =
            org.slf4j.LoggerFactory.getLogger(OptimizerClient.class);

    private final OptimizerWaiters waiters;

    private final OptimizerPaginators paginators;

    OptimizerClient(
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
                                    .nameFormat("Optimizer-waiters-%d")
                                    .build());
            threadPoolExecutor.allowCoreThreadTimeOut(true);

            executorService = threadPoolExecutor;
        }
        this.waiters = new OptimizerWaiters(executorService, this);

        this.paginators = new OptimizerPaginators(this);
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
            extends com.oracle.bmc.common.RegionalClientBuilder<Builder, OptimizerClient> {
        private java.util.concurrent.ExecutorService executorService;

        private Builder(com.oracle.bmc.Service service) {
            super(service);
            final String packageName = "optimizer";
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
        public OptimizerClient build(
                @jakarta.annotation.Nonnull
                        com.oracle.bmc.auth.AbstractAuthenticationDetailsProvider
                                authenticationDetailsProvider) {
            return new OptimizerClient(this, authenticationDetailsProvider, executorService);
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
    public BulkApplyRecommendationsResponse bulkApplyRecommendations(
            BulkApplyRecommendationsRequest request) {

        Validate.notBlank(request.getRecommendationId(), "recommendationId must not be blank");
        Objects.requireNonNull(
                request.getBulkApplyRecommendationsDetails(),
                "bulkApplyRecommendationsDetails is required");

        return clientCall(request, BulkApplyRecommendationsResponse::builder)
                .logger(LOG, "bulkApplyRecommendations")
                .serviceDetails(
                        "Optimizer",
                        "BulkApplyRecommendations",
                        "https://docs.oracle.com/iaas/api/#/en/advisor/20200606/Recommendation/BulkApplyRecommendations")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(BulkApplyRecommendationsRequest::builder)
                .basePath("/20200606")
                .appendPathParam("recommendations")
                .appendPathParam(request.getRecommendationId())
                .appendPathParam("actions")
                .appendPathParam("bulkApplyRecommendations")
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .operationUsesDefaultRetries()
                .hasBody()
                .handleResponseHeaderString(
                        "opc-request-id", BulkApplyRecommendationsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        BulkApplyRecommendationsResponse.Builder::opcWorkRequestId)
                .callSync();
    }

    @Override
    public CreateProfileResponse createProfile(CreateProfileRequest request) {
        Objects.requireNonNull(
                request.getCreateProfileDetails(), "createProfileDetails is required");

        return clientCall(request, CreateProfileResponse::builder)
                .logger(LOG, "createProfile")
                .serviceDetails(
                        "Optimizer",
                        "CreateProfile",
                        "https://docs.oracle.com/iaas/api/#/en/advisor/20200606/Profile/CreateProfile")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CreateProfileRequest::builder)
                .basePath("/20200606")
                .appendPathParam("profiles")
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .operationUsesDefaultRetries()
                .hasBody()
                .handleBody(
                        com.oracle.bmc.optimizer.model.Profile.class,
                        CreateProfileResponse.Builder::profile)
                .handleResponseHeaderString("etag", CreateProfileResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", CreateProfileResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public DeleteProfileResponse deleteProfile(DeleteProfileRequest request) {

        Validate.notBlank(request.getProfileId(), "profileId must not be blank");

        return clientCall(request, DeleteProfileResponse::builder)
                .logger(LOG, "deleteProfile")
                .serviceDetails(
                        "Optimizer",
                        "DeleteProfile",
                        "https://docs.oracle.com/iaas/api/#/en/advisor/20200606/Profile/DeleteProfile")
                .method(com.oracle.bmc.http.client.Method.DELETE)
                .requestBuilder(DeleteProfileRequest::builder)
                .basePath("/20200606")
                .appendPathParam("profiles")
                .appendPathParam(request.getProfileId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .handleResponseHeaderString(
                        "opc-request-id", DeleteProfileResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public FilterResourceActionsResponse filterResourceActions(
            FilterResourceActionsRequest request) {
        Objects.requireNonNull(request.getCompartmentId(), "compartmentId is required");

        Objects.requireNonNull(
                request.getCompartmentIdInSubtree(), "compartmentIdInSubtree is required");

        Objects.requireNonNull(request.getQueryDetails(), "queryDetails is required");

        return clientCall(request, FilterResourceActionsResponse::builder)
                .logger(LOG, "filterResourceActions")
                .serviceDetails(
                        "Optimizer",
                        "FilterResourceActions",
                        "https://docs.oracle.com/iaas/api/#/en/advisor/20200606/ResourceActionSummary/FilterResourceActions")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(FilterResourceActionsRequest::builder)
                .basePath("/20200606")
                .appendPathParam("actions")
                .appendPathParam("filterResourceActions")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendQueryParam("compartmentIdInSubtree", request.getCompartmentIdInSubtree())
                .appendQueryParam("recommendationId", request.getRecommendationId())
                .appendQueryParam("recommendationName", request.getRecommendationName())
                .appendListQueryParam(
                        "childTenancyIds",
                        request.getChildTenancyIds(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .appendQueryParam("includeOrganization", request.getIncludeOrganization())
                .appendQueryParam("includeResourceMetadata", request.getIncludeResourceMetadata())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .hasBody()
                .handleBody(
                        com.oracle.bmc.optimizer.model.ResourceActionCollection.class,
                        FilterResourceActionsResponse.Builder::resourceActionCollection)
                .handleResponseHeaderString(
                        "opc-request-id", FilterResourceActionsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", FilterResourceActionsResponse.Builder::opcNextPage)
                .handleResponseHeaderString(
                        "opc-prev-page", FilterResourceActionsResponse.Builder::opcPrevPage)
                .callSync();
    }

    @Override
    public GetCategoryResponse getCategory(GetCategoryRequest request) {

        Validate.notBlank(request.getCategoryId(), "categoryId must not be blank");

        return clientCall(request, GetCategoryResponse::builder)
                .logger(LOG, "getCategory")
                .serviceDetails(
                        "Optimizer",
                        "GetCategory",
                        "https://docs.oracle.com/iaas/api/#/en/advisor/20200606/Category/GetCategory")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetCategoryRequest::builder)
                .basePath("/20200606")
                .appendPathParam("categories")
                .appendPathParam(request.getCategoryId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .handleBody(
                        com.oracle.bmc.optimizer.model.Category.class,
                        GetCategoryResponse.Builder::category)
                .handleResponseHeaderString(
                        "opc-request-id", GetCategoryResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public GetEnrollmentStatusResponse getEnrollmentStatus(GetEnrollmentStatusRequest request) {

        Validate.notBlank(request.getEnrollmentStatusId(), "enrollmentStatusId must not be blank");

        return clientCall(request, GetEnrollmentStatusResponse::builder)
                .logger(LOG, "getEnrollmentStatus")
                .serviceDetails(
                        "Optimizer",
                        "GetEnrollmentStatus",
                        "https://docs.oracle.com/iaas/api/#/en/advisor/20200606/EnrollmentStatus/GetEnrollmentStatus")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetEnrollmentStatusRequest::builder)
                .basePath("/20200606")
                .appendPathParam("enrollmentStatus")
                .appendPathParam(request.getEnrollmentStatusId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .handleBody(
                        com.oracle.bmc.optimizer.model.EnrollmentStatus.class,
                        GetEnrollmentStatusResponse.Builder::enrollmentStatus)
                .handleResponseHeaderString("etag", GetEnrollmentStatusResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", GetEnrollmentStatusResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public GetProfileResponse getProfile(GetProfileRequest request) {

        Validate.notBlank(request.getProfileId(), "profileId must not be blank");

        return clientCall(request, GetProfileResponse::builder)
                .logger(LOG, "getProfile")
                .serviceDetails(
                        "Optimizer",
                        "GetProfile",
                        "https://docs.oracle.com/iaas/api/#/en/advisor/20200606/Profile/GetProfile")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetProfileRequest::builder)
                .basePath("/20200606")
                .appendPathParam("profiles")
                .appendPathParam(request.getProfileId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .handleBody(
                        com.oracle.bmc.optimizer.model.Profile.class,
                        GetProfileResponse.Builder::profile)
                .handleResponseHeaderString("etag", GetProfileResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", GetProfileResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public GetRecommendationResponse getRecommendation(GetRecommendationRequest request) {

        Validate.notBlank(request.getRecommendationId(), "recommendationId must not be blank");

        return clientCall(request, GetRecommendationResponse::builder)
                .logger(LOG, "getRecommendation")
                .serviceDetails(
                        "Optimizer",
                        "GetRecommendation",
                        "https://docs.oracle.com/iaas/api/#/en/advisor/20200606/Recommendation/GetRecommendation")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetRecommendationRequest::builder)
                .basePath("/20200606")
                .appendPathParam("recommendations")
                .appendPathParam(request.getRecommendationId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .handleBody(
                        com.oracle.bmc.optimizer.model.Recommendation.class,
                        GetRecommendationResponse.Builder::recommendation)
                .handleResponseHeaderString("etag", GetRecommendationResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", GetRecommendationResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public GetResourceActionResponse getResourceAction(GetResourceActionRequest request) {

        Validate.notBlank(request.getResourceActionId(), "resourceActionId must not be blank");

        return clientCall(request, GetResourceActionResponse::builder)
                .logger(LOG, "getResourceAction")
                .serviceDetails(
                        "Optimizer",
                        "GetResourceAction",
                        "https://docs.oracle.com/iaas/api/#/en/advisor/20200606/ResourceAction/GetResourceAction")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetResourceActionRequest::builder)
                .basePath("/20200606")
                .appendPathParam("resourceActions")
                .appendPathParam(request.getResourceActionId())
                .appendQueryParam("includeResourceMetadata", request.getIncludeResourceMetadata())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .handleBody(
                        com.oracle.bmc.optimizer.model.ResourceAction.class,
                        GetResourceActionResponse.Builder::resourceAction)
                .handleResponseHeaderString("etag", GetResourceActionResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", GetResourceActionResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public GetWorkRequestResponse getWorkRequest(GetWorkRequestRequest request) {

        Validate.notBlank(request.getWorkRequestId(), "workRequestId must not be blank");

        return clientCall(request, GetWorkRequestResponse::builder)
                .logger(LOG, "getWorkRequest")
                .serviceDetails(
                        "Optimizer",
                        "GetWorkRequest",
                        "https://docs.oracle.com/iaas/api/#/en/advisor/20200606/WorkRequest/GetWorkRequest")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetWorkRequestRequest::builder)
                .basePath("/20200606")
                .appendPathParam("workRequests")
                .appendPathParam(request.getWorkRequestId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .handleBody(
                        com.oracle.bmc.optimizer.model.WorkRequest.class,
                        GetWorkRequestResponse.Builder::workRequest)
                .handleResponseHeaderString(
                        "opc-request-id", GetWorkRequestResponse.Builder::opcRequestId)
                .handleResponseHeaderFloat(
                        "retry-after", GetWorkRequestResponse.Builder::retryAfter)
                .callSync();
    }

    @Override
    public ListCategoriesResponse listCategories(ListCategoriesRequest request) {
        Objects.requireNonNull(request.getCompartmentId(), "compartmentId is required");

        Objects.requireNonNull(
                request.getCompartmentIdInSubtree(), "compartmentIdInSubtree is required");

        return clientCall(request, ListCategoriesResponse::builder)
                .logger(LOG, "listCategories")
                .serviceDetails(
                        "Optimizer",
                        "ListCategories",
                        "https://docs.oracle.com/iaas/api/#/en/advisor/20200606/CategorySummary/ListCategories")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListCategoriesRequest::builder)
                .basePath("/20200606")
                .appendPathParam("categories")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendQueryParam("compartmentIdInSubtree", request.getCompartmentIdInSubtree())
                .appendListQueryParam(
                        "childTenancyIds",
                        request.getChildTenancyIds(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .appendQueryParam("includeOrganization", request.getIncludeOrganization())
                .appendQueryParam("name", request.getName())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .appendEnumQueryParam("lifecycleState", request.getLifecycleState())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .handleBody(
                        com.oracle.bmc.optimizer.model.CategoryCollection.class,
                        ListCategoriesResponse.Builder::categoryCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListCategoriesResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListCategoriesResponse.Builder::opcNextPage)
                .handleResponseHeaderString(
                        "opc-prev-page", ListCategoriesResponse.Builder::opcPrevPage)
                .callSync();
    }

    @Override
    public ListEnrollmentStatusesResponse listEnrollmentStatuses(
            ListEnrollmentStatusesRequest request) {
        Objects.requireNonNull(request.getCompartmentId(), "compartmentId is required");

        return clientCall(request, ListEnrollmentStatusesResponse::builder)
                .logger(LOG, "listEnrollmentStatuses")
                .serviceDetails(
                        "Optimizer",
                        "ListEnrollmentStatuses",
                        "https://docs.oracle.com/iaas/api/#/en/advisor/20200606/EnrollmentStatusSummary/ListEnrollmentStatuses")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListEnrollmentStatusesRequest::builder)
                .basePath("/20200606")
                .appendPathParam("enrollmentStatus")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .appendEnumQueryParam("lifecycleState", request.getLifecycleState())
                .appendEnumQueryParam("status", request.getStatus())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .handleBody(
                        com.oracle.bmc.optimizer.model.EnrollmentStatusCollection.class,
                        ListEnrollmentStatusesResponse.Builder::enrollmentStatusCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListEnrollmentStatusesResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListEnrollmentStatusesResponse.Builder::opcNextPage)
                .handleResponseHeaderString(
                        "opc-prev-page", ListEnrollmentStatusesResponse.Builder::opcPrevPage)
                .callSync();
    }

    @Override
    public ListHistoriesResponse listHistories(ListHistoriesRequest request) {
        Objects.requireNonNull(request.getCompartmentId(), "compartmentId is required");

        Objects.requireNonNull(
                request.getCompartmentIdInSubtree(), "compartmentIdInSubtree is required");

        return clientCall(request, ListHistoriesResponse::builder)
                .logger(LOG, "listHistories")
                .serviceDetails(
                        "Optimizer",
                        "ListHistories",
                        "https://docs.oracle.com/iaas/api/#/en/advisor/20200606/HistorySummary/ListHistories")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListHistoriesRequest::builder)
                .basePath("/20200606")
                .appendPathParam("histories")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendQueryParam("compartmentIdInSubtree", request.getCompartmentIdInSubtree())
                .appendQueryParam("name", request.getName())
                .appendQueryParam("recommendationName", request.getRecommendationName())
                .appendQueryParam("recommendationId", request.getRecommendationId())
                .appendQueryParam("resourceType", request.getResourceType())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .appendEnumQueryParam("lifecycleState", request.getLifecycleState())
                .appendEnumQueryParam("status", request.getStatus())
                .appendQueryParam("includeResourceMetadata", request.getIncludeResourceMetadata())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .handleBody(
                        com.oracle.bmc.optimizer.model.HistoryCollection.class,
                        ListHistoriesResponse.Builder::historyCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListHistoriesResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListHistoriesResponse.Builder::opcNextPage)
                .handleResponseHeaderString(
                        "opc-prev-page", ListHistoriesResponse.Builder::opcPrevPage)
                .callSync();
    }

    @Override
    public ListProfileLevelsResponse listProfileLevels(ListProfileLevelsRequest request) {
        Objects.requireNonNull(request.getCompartmentId(), "compartmentId is required");

        Objects.requireNonNull(
                request.getCompartmentIdInSubtree(), "compartmentIdInSubtree is required");

        return clientCall(request, ListProfileLevelsResponse::builder)
                .logger(LOG, "listProfileLevels")
                .serviceDetails(
                        "Optimizer",
                        "ListProfileLevels",
                        "https://docs.oracle.com/iaas/api/#/en/advisor/20200606/ProfileLevelSummary/ListProfileLevels")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListProfileLevelsRequest::builder)
                .basePath("/20200606")
                .appendPathParam("profileLevels")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendQueryParam("compartmentIdInSubtree", request.getCompartmentIdInSubtree())
                .appendQueryParam("name", request.getName())
                .appendQueryParam("recommendationName", request.getRecommendationName())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .handleBody(
                        com.oracle.bmc.optimizer.model.ProfileLevelCollection.class,
                        ListProfileLevelsResponse.Builder::profileLevelCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListProfileLevelsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListProfileLevelsResponse.Builder::opcNextPage)
                .handleResponseHeaderString(
                        "opc-prev-page", ListProfileLevelsResponse.Builder::opcPrevPage)
                .callSync();
    }

    @Override
    public ListProfilesResponse listProfiles(ListProfilesRequest request) {
        Objects.requireNonNull(request.getCompartmentId(), "compartmentId is required");

        return clientCall(request, ListProfilesResponse::builder)
                .logger(LOG, "listProfiles")
                .serviceDetails(
                        "Optimizer",
                        "ListProfiles",
                        "https://docs.oracle.com/iaas/api/#/en/advisor/20200606/ProfileSummary/ListProfiles")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListProfilesRequest::builder)
                .basePath("/20200606")
                .appendPathParam("profiles")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendQueryParam("name", request.getName())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .appendEnumQueryParam("lifecycleState", request.getLifecycleState())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .handleBody(
                        com.oracle.bmc.optimizer.model.ProfileCollection.class,
                        ListProfilesResponse.Builder::profileCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListProfilesResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListProfilesResponse.Builder::opcNextPage)
                .handleResponseHeaderString(
                        "opc-prev-page", ListProfilesResponse.Builder::opcPrevPage)
                .callSync();
    }

    @Override
    public ListRecommendationStrategiesResponse listRecommendationStrategies(
            ListRecommendationStrategiesRequest request) {
        Objects.requireNonNull(request.getCompartmentId(), "compartmentId is required");

        Objects.requireNonNull(
                request.getCompartmentIdInSubtree(), "compartmentIdInSubtree is required");

        return clientCall(request, ListRecommendationStrategiesResponse::builder)
                .logger(LOG, "listRecommendationStrategies")
                .serviceDetails(
                        "Optimizer",
                        "ListRecommendationStrategies",
                        "https://docs.oracle.com/iaas/api/#/en/advisor/20200606/RecommendationStrategySummary/ListRecommendationStrategies")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListRecommendationStrategiesRequest::builder)
                .basePath("/20200606")
                .appendPathParam("recommendationStrategies")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendQueryParam("compartmentIdInSubtree", request.getCompartmentIdInSubtree())
                .appendQueryParam("name", request.getName())
                .appendQueryParam("recommendationName", request.getRecommendationName())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .handleBody(
                        com.oracle.bmc.optimizer.model.RecommendationStrategyCollection.class,
                        ListRecommendationStrategiesResponse.Builder
                                ::recommendationStrategyCollection)
                .handleResponseHeaderString(
                        "opc-request-id",
                        ListRecommendationStrategiesResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListRecommendationStrategiesResponse.Builder::opcNextPage)
                .handleResponseHeaderString(
                        "opc-prev-page", ListRecommendationStrategiesResponse.Builder::opcPrevPage)
                .callSync();
    }

    @Override
    public ListRecommendationsResponse listRecommendations(ListRecommendationsRequest request) {
        Objects.requireNonNull(request.getCompartmentId(), "compartmentId is required");

        Objects.requireNonNull(
                request.getCompartmentIdInSubtree(), "compartmentIdInSubtree is required");

        return clientCall(request, ListRecommendationsResponse::builder)
                .logger(LOG, "listRecommendations")
                .serviceDetails(
                        "Optimizer",
                        "ListRecommendations",
                        "https://docs.oracle.com/iaas/api/#/en/advisor/20200606/RecommendationSummary/ListRecommendations")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListRecommendationsRequest::builder)
                .basePath("/20200606")
                .appendPathParam("recommendations")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendQueryParam("compartmentIdInSubtree", request.getCompartmentIdInSubtree())
                .appendQueryParam("categoryId", request.getCategoryId())
                .appendQueryParam("categoryName", request.getCategoryName())
                .appendListQueryParam(
                        "childTenancyIds",
                        request.getChildTenancyIds(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .appendQueryParam("includeOrganization", request.getIncludeOrganization())
                .appendQueryParam("name", request.getName())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .appendEnumQueryParam("lifecycleState", request.getLifecycleState())
                .appendEnumQueryParam("status", request.getStatus())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .handleBody(
                        com.oracle.bmc.optimizer.model.RecommendationCollection.class,
                        ListRecommendationsResponse.Builder::recommendationCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListRecommendationsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListRecommendationsResponse.Builder::opcNextPage)
                .handleResponseHeaderString(
                        "opc-prev-page", ListRecommendationsResponse.Builder::opcPrevPage)
                .callSync();
    }

    @Override
    public ListResourceActionQueryableFieldsResponse listResourceActionQueryableFields(
            ListResourceActionQueryableFieldsRequest request) {
        Objects.requireNonNull(request.getCompartmentId(), "compartmentId is required");

        Objects.requireNonNull(
                request.getCompartmentIdInSubtree(), "compartmentIdInSubtree is required");

        return clientCall(request, ListResourceActionQueryableFieldsResponse::builder)
                .logger(LOG, "listResourceActionQueryableFields")
                .serviceDetails(
                        "Optimizer",
                        "ListResourceActionQueryableFields",
                        "https://docs.oracle.com/iaas/api/#/en/advisor/20200606/QueryableFieldSummary/ListResourceActionQueryableFields")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListResourceActionQueryableFieldsRequest::builder)
                .basePath("/20200606")
                .appendPathParam("resourceActions")
                .appendPathParam("actions")
                .appendPathParam("getQueryableFields")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendQueryParam("compartmentIdInSubtree", request.getCompartmentIdInSubtree())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .handleBody(
                        com.oracle.bmc.optimizer.model.QueryableFieldCollection.class,
                        ListResourceActionQueryableFieldsResponse.Builder::queryableFieldCollection)
                .handleResponseHeaderString(
                        "opc-request-id",
                        ListResourceActionQueryableFieldsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page",
                        ListResourceActionQueryableFieldsResponse.Builder::opcNextPage)
                .handleResponseHeaderString(
                        "opc-prev-page",
                        ListResourceActionQueryableFieldsResponse.Builder::opcPrevPage)
                .callSync();
    }

    @Override
    public ListResourceActionsResponse listResourceActions(ListResourceActionsRequest request) {
        Objects.requireNonNull(request.getCompartmentId(), "compartmentId is required");

        Objects.requireNonNull(
                request.getCompartmentIdInSubtree(), "compartmentIdInSubtree is required");

        return clientCall(request, ListResourceActionsResponse::builder)
                .logger(LOG, "listResourceActions")
                .serviceDetails(
                        "Optimizer",
                        "ListResourceActions",
                        "https://docs.oracle.com/iaas/api/#/en/advisor/20200606/ResourceActionSummary/ListResourceActions")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListResourceActionsRequest::builder)
                .basePath("/20200606")
                .appendPathParam("resourceActions")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendQueryParam("compartmentIdInSubtree", request.getCompartmentIdInSubtree())
                .appendQueryParam("recommendationId", request.getRecommendationId())
                .appendQueryParam("recommendationName", request.getRecommendationName())
                .appendListQueryParam(
                        "childTenancyIds",
                        request.getChildTenancyIds(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .appendQueryParam("includeOrganization", request.getIncludeOrganization())
                .appendQueryParam("name", request.getName())
                .appendQueryParam("resourceType", request.getResourceType())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .appendEnumQueryParam("lifecycleState", request.getLifecycleState())
                .appendEnumQueryParam("status", request.getStatus())
                .appendQueryParam("includeResourceMetadata", request.getIncludeResourceMetadata())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .handleBody(
                        com.oracle.bmc.optimizer.model.ResourceActionCollection.class,
                        ListResourceActionsResponse.Builder::resourceActionCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListResourceActionsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListResourceActionsResponse.Builder::opcNextPage)
                .handleResponseHeaderString(
                        "opc-prev-page", ListResourceActionsResponse.Builder::opcPrevPage)
                .callSync();
    }

    @Override
    public ListWorkRequestErrorsResponse listWorkRequestErrors(
            ListWorkRequestErrorsRequest request) {

        Validate.notBlank(request.getWorkRequestId(), "workRequestId must not be blank");

        return clientCall(request, ListWorkRequestErrorsResponse::builder)
                .logger(LOG, "listWorkRequestErrors")
                .serviceDetails(
                        "Optimizer",
                        "ListWorkRequestErrors",
                        "https://docs.oracle.com/iaas/api/#/en/advisor/20200606/WorkRequestError/ListWorkRequestErrors")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListWorkRequestErrorsRequest::builder)
                .basePath("/20200606")
                .appendPathParam("workRequests")
                .appendPathParam(request.getWorkRequestId())
                .appendPathParam("errors")
                .appendQueryParam("page", request.getPage())
                .appendQueryParam("limit", request.getLimit())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .handleBody(
                        com.oracle.bmc.optimizer.model.WorkRequestErrorCollection.class,
                        ListWorkRequestErrorsResponse.Builder::workRequestErrorCollection)
                .handleResponseHeaderString(
                        "opc-next-page", ListWorkRequestErrorsResponse.Builder::opcNextPage)
                .handleResponseHeaderString(
                        "opc-request-id", ListWorkRequestErrorsResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public ListWorkRequestLogsResponse listWorkRequestLogs(ListWorkRequestLogsRequest request) {

        Validate.notBlank(request.getWorkRequestId(), "workRequestId must not be blank");

        return clientCall(request, ListWorkRequestLogsResponse::builder)
                .logger(LOG, "listWorkRequestLogs")
                .serviceDetails(
                        "Optimizer",
                        "ListWorkRequestLogs",
                        "https://docs.oracle.com/iaas/api/#/en/advisor/20200606/WorkRequestLogEntry/ListWorkRequestLogs")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListWorkRequestLogsRequest::builder)
                .basePath("/20200606")
                .appendPathParam("workRequests")
                .appendPathParam(request.getWorkRequestId())
                .appendPathParam("logs")
                .appendQueryParam("page", request.getPage())
                .appendQueryParam("limit", request.getLimit())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .handleBody(
                        com.oracle.bmc.optimizer.model.WorkRequestLogEntryCollection.class,
                        ListWorkRequestLogsResponse.Builder::workRequestLogEntryCollection)
                .handleResponseHeaderString(
                        "opc-next-page", ListWorkRequestLogsResponse.Builder::opcNextPage)
                .handleResponseHeaderString(
                        "opc-request-id", ListWorkRequestLogsResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public ListWorkRequestsResponse listWorkRequests(ListWorkRequestsRequest request) {
        Objects.requireNonNull(request.getCompartmentId(), "compartmentId is required");

        return clientCall(request, ListWorkRequestsResponse::builder)
                .logger(LOG, "listWorkRequests")
                .serviceDetails(
                        "Optimizer",
                        "ListWorkRequests",
                        "https://docs.oracle.com/iaas/api/#/en/advisor/20200606/WorkRequest/ListWorkRequests")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListWorkRequestsRequest::builder)
                .basePath("/20200606")
                .appendPathParam("workRequests")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendQueryParam("page", request.getPage())
                .appendQueryParam("limit", request.getLimit())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .handleBody(
                        com.oracle.bmc.optimizer.model.WorkRequestCollection.class,
                        ListWorkRequestsResponse.Builder::workRequestCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListWorkRequestsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListWorkRequestsResponse.Builder::opcNextPage)
                .callSync();
    }

    @Override
    public UpdateEnrollmentStatusResponse updateEnrollmentStatus(
            UpdateEnrollmentStatusRequest request) {

        Validate.notBlank(request.getEnrollmentStatusId(), "enrollmentStatusId must not be blank");
        Objects.requireNonNull(
                request.getUpdateEnrollmentStatusDetails(),
                "updateEnrollmentStatusDetails is required");

        return clientCall(request, UpdateEnrollmentStatusResponse::builder)
                .logger(LOG, "updateEnrollmentStatus")
                .serviceDetails(
                        "Optimizer",
                        "UpdateEnrollmentStatus",
                        "https://docs.oracle.com/iaas/api/#/en/advisor/20200606/EnrollmentStatus/UpdateEnrollmentStatus")
                .method(com.oracle.bmc.http.client.Method.PUT)
                .requestBuilder(UpdateEnrollmentStatusRequest::builder)
                .basePath("/20200606")
                .appendPathParam("enrollmentStatus")
                .appendPathParam(request.getEnrollmentStatusId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("if-match", request.getIfMatch())
                .operationUsesDefaultRetries()
                .hasBody()
                .handleBody(
                        com.oracle.bmc.optimizer.model.EnrollmentStatus.class,
                        UpdateEnrollmentStatusResponse.Builder::enrollmentStatus)
                .handleResponseHeaderString("etag", UpdateEnrollmentStatusResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", UpdateEnrollmentStatusResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public UpdateProfileResponse updateProfile(UpdateProfileRequest request) {

        Validate.notBlank(request.getProfileId(), "profileId must not be blank");
        Objects.requireNonNull(
                request.getUpdateProfileDetails(), "updateProfileDetails is required");

        return clientCall(request, UpdateProfileResponse::builder)
                .logger(LOG, "updateProfile")
                .serviceDetails(
                        "Optimizer",
                        "UpdateProfile",
                        "https://docs.oracle.com/iaas/api/#/en/advisor/20200606/Profile/UpdateProfile")
                .method(com.oracle.bmc.http.client.Method.PUT)
                .requestBuilder(UpdateProfileRequest::builder)
                .basePath("/20200606")
                .appendPathParam("profiles")
                .appendPathParam(request.getProfileId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .hasBody()
                .handleBody(
                        com.oracle.bmc.optimizer.model.Profile.class,
                        UpdateProfileResponse.Builder::profile)
                .handleResponseHeaderString("etag", UpdateProfileResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", UpdateProfileResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public UpdateRecommendationResponse updateRecommendation(UpdateRecommendationRequest request) {

        Validate.notBlank(request.getRecommendationId(), "recommendationId must not be blank");
        Objects.requireNonNull(
                request.getUpdateRecommendationDetails(),
                "updateRecommendationDetails is required");

        return clientCall(request, UpdateRecommendationResponse::builder)
                .logger(LOG, "updateRecommendation")
                .serviceDetails(
                        "Optimizer",
                        "UpdateRecommendation",
                        "https://docs.oracle.com/iaas/api/#/en/advisor/20200606/Recommendation/UpdateRecommendation")
                .method(com.oracle.bmc.http.client.Method.PUT)
                .requestBuilder(UpdateRecommendationRequest::builder)
                .basePath("/20200606")
                .appendPathParam("recommendations")
                .appendPathParam(request.getRecommendationId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("if-match", request.getIfMatch())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.optimizer.model.Recommendation.class,
                        UpdateRecommendationResponse.Builder::recommendation)
                .handleResponseHeaderString("etag", UpdateRecommendationResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", UpdateRecommendationResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public UpdateResourceActionResponse updateResourceAction(UpdateResourceActionRequest request) {

        Validate.notBlank(request.getResourceActionId(), "resourceActionId must not be blank");
        Objects.requireNonNull(
                request.getUpdateResourceActionDetails(),
                "updateResourceActionDetails is required");

        return clientCall(request, UpdateResourceActionResponse::builder)
                .logger(LOG, "updateResourceAction")
                .serviceDetails(
                        "Optimizer",
                        "UpdateResourceAction",
                        "https://docs.oracle.com/iaas/api/#/en/advisor/20200606/ResourceAction/UpdateResourceAction")
                .method(com.oracle.bmc.http.client.Method.PUT)
                .requestBuilder(UpdateResourceActionRequest::builder)
                .basePath("/20200606")
                .appendPathParam("resourceActions")
                .appendPathParam(request.getResourceActionId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("if-match", request.getIfMatch())
                .operationUsesDefaultRetries()
                .hasBody()
                .handleBody(
                        com.oracle.bmc.optimizer.model.ResourceAction.class,
                        UpdateResourceActionResponse.Builder::resourceAction)
                .handleResponseHeaderString("etag", UpdateResourceActionResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", UpdateResourceActionResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public OptimizerWaiters getWaiters() {
        return waiters;
    }

    @Override
    public OptimizerPaginators getPaginators() {
        return paginators;
    }

    /**
     * Create a new client instance.
     *
     * @param authenticationDetailsProvider The authentication details (see {@link Builder#build})
     * @deprecated Use the {@link #builder() builder} instead.
     */
    @Deprecated
    public OptimizerClient(
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
    public OptimizerClient(
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
    public OptimizerClient(
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
    public OptimizerClient(
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
    public OptimizerClient(
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
    public OptimizerClient(
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
    public OptimizerClient(
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
    public OptimizerClient(
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

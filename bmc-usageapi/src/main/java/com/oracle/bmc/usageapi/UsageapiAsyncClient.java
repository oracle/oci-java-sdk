/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.usageapi;

import com.oracle.bmc.util.internal.Validate;
import com.oracle.bmc.usageapi.requests.*;
import com.oracle.bmc.usageapi.responses.*;

import java.util.Objects;

/**
 * Async client implementation for Usageapi service. <br>
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
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200107")
public class UsageapiAsyncClient extends com.oracle.bmc.http.internal.BaseAsyncClient
        implements UsageapiAsync {
    /** Service instance for Usageapi. */
    public static final com.oracle.bmc.Service SERVICE =
            com.oracle.bmc.Services.serviceBuilder()
                    .serviceName("USAGEAPI")
                    .serviceEndpointPrefix("")
                    .serviceEndpointTemplate("https://usageapi.{region}.oci.{secondLevelDomain}")
                    .build();

    private static final org.slf4j.Logger LOG =
            org.slf4j.LoggerFactory.getLogger(UsageapiAsyncClient.class);

    UsageapiAsyncClient(
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
            extends com.oracle.bmc.common.RegionalClientBuilder<Builder, UsageapiAsyncClient> {
        private Builder(com.oracle.bmc.Service service) {
            super(service);
            final String packageName = "usageapi";
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
        public UsageapiAsyncClient build(
                @jakarta.annotation.Nonnull
                        com.oracle.bmc.auth.AbstractAuthenticationDetailsProvider
                                authenticationDetailsProvider) {
            return new UsageapiAsyncClient(this, authenticationDetailsProvider);
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
    public java.util.concurrent.Future<CreateCustomTableResponse> createCustomTable(
            CreateCustomTableRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            CreateCustomTableRequest, CreateCustomTableResponse>
                    handler) {
        Objects.requireNonNull(
                request.getCreateCustomTableDetails(), "createCustomTableDetails is required");

        return clientCall(request, CreateCustomTableResponse::builder)
                .logger(LOG, "createCustomTable")
                .serviceDetails(
                        "Usageapi",
                        "CreateCustomTable",
                        "https://docs.oracle.com/iaas/api/#/en/usage/20200107/CustomTable/CreateCustomTable")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CreateCustomTableRequest::builder)
                .basePath("/20200107")
                .appendPathParam("customTables")
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.usageapi.model.CustomTable.class,
                        CreateCustomTableResponse.Builder::customTable)
                .handleResponseHeaderString(
                        "opc-request-id", CreateCustomTableResponse.Builder::opcRequestId)
                .handleResponseHeaderString("etag", CreateCustomTableResponse.Builder::etag)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<CreateEmailRecipientsGroupResponse>
            createEmailRecipientsGroup(
                    CreateEmailRecipientsGroupRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    CreateEmailRecipientsGroupRequest,
                                    CreateEmailRecipientsGroupResponse>
                            handler) {
        Objects.requireNonNull(
                request.getCreateEmailRecipientsGroupDetails(),
                "createEmailRecipientsGroupDetails is required");

        Validate.notBlank(request.getSubscriptionId(), "subscriptionId must not be blank");

        return clientCall(request, CreateEmailRecipientsGroupResponse::builder)
                .logger(LOG, "createEmailRecipientsGroup")
                .serviceDetails(
                        "Usageapi",
                        "CreateEmailRecipientsGroup",
                        "https://docs.oracle.com/iaas/api/#/en/usage/20200107/EmailRecipientsGroup/CreateEmailRecipientsGroup")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CreateEmailRecipientsGroupRequest::builder)
                .basePath("/20200107")
                .appendPathParam("usageStatements")
                .appendPathParam(request.getSubscriptionId())
                .appendPathParam("emailRecipientsGroups")
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.usageapi.model.EmailRecipientsGroup.class,
                        CreateEmailRecipientsGroupResponse.Builder::emailRecipientsGroup)
                .handleResponseHeaderString(
                        "opc-request-id", CreateEmailRecipientsGroupResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "etag", CreateEmailRecipientsGroupResponse.Builder::etag)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<CreateQueryResponse> createQuery(
            CreateQueryRequest request,
            final com.oracle.bmc.responses.AsyncHandler<CreateQueryRequest, CreateQueryResponse>
                    handler) {
        Objects.requireNonNull(request.getCreateQueryDetails(), "createQueryDetails is required");

        return clientCall(request, CreateQueryResponse::builder)
                .logger(LOG, "createQuery")
                .serviceDetails(
                        "Usageapi",
                        "CreateQuery",
                        "https://docs.oracle.com/iaas/api/#/en/usage/20200107/Query/CreateQuery")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CreateQueryRequest::builder)
                .basePath("/20200107")
                .appendPathParam("queries")
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.usageapi.model.Query.class,
                        CreateQueryResponse.Builder::query)
                .handleResponseHeaderString(
                        "opc-request-id", CreateQueryResponse.Builder::opcRequestId)
                .handleResponseHeaderString("etag", CreateQueryResponse.Builder::etag)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<CreateScheduleResponse> createSchedule(
            CreateScheduleRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            CreateScheduleRequest, CreateScheduleResponse>
                    handler) {
        Objects.requireNonNull(
                request.getCreateScheduleDetails(), "createScheduleDetails is required");

        return clientCall(request, CreateScheduleResponse::builder)
                .logger(LOG, "createSchedule")
                .serviceDetails(
                        "Usageapi",
                        "CreateSchedule",
                        "https://docs.oracle.com/iaas/api/#/en/usage/20200107/Schedule/CreateSchedule")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CreateScheduleRequest::builder)
                .basePath("/20200107")
                .appendPathParam("schedules")
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.usageapi.model.Schedule.class,
                        CreateScheduleResponse.Builder::schedule)
                .handleResponseHeaderString(
                        "opc-request-id", CreateScheduleResponse.Builder::opcRequestId)
                .handleResponseHeaderString("etag", CreateScheduleResponse.Builder::etag)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<CreateUsageCarbonEmissionsQueryResponse>
            createUsageCarbonEmissionsQuery(
                    CreateUsageCarbonEmissionsQueryRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    CreateUsageCarbonEmissionsQueryRequest,
                                    CreateUsageCarbonEmissionsQueryResponse>
                            handler) {
        Objects.requireNonNull(
                request.getCreateUsageCarbonEmissionsQueryDetails(),
                "createUsageCarbonEmissionsQueryDetails is required");

        return clientCall(request, CreateUsageCarbonEmissionsQueryResponse::builder)
                .logger(LOG, "createUsageCarbonEmissionsQuery")
                .serviceDetails(
                        "Usageapi",
                        "CreateUsageCarbonEmissionsQuery",
                        "https://docs.oracle.com/iaas/api/#/en/usage/20200107/UsageCarbonEmissionsQuery/CreateUsageCarbonEmissionsQuery")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CreateUsageCarbonEmissionsQueryRequest::builder)
                .basePath("/20200107")
                .appendPathParam("usageCarbonEmissionsQueries")
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.usageapi.model.UsageCarbonEmissionsQuery.class,
                        CreateUsageCarbonEmissionsQueryResponse.Builder::usageCarbonEmissionsQuery)
                .handleResponseHeaderString(
                        "opc-request-id",
                        CreateUsageCarbonEmissionsQueryResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "etag", CreateUsageCarbonEmissionsQueryResponse.Builder::etag)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<DeleteCustomTableResponse> deleteCustomTable(
            DeleteCustomTableRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            DeleteCustomTableRequest, DeleteCustomTableResponse>
                    handler) {

        Validate.notBlank(request.getCustomTableId(), "customTableId must not be blank");

        return clientCall(request, DeleteCustomTableResponse::builder)
                .logger(LOG, "deleteCustomTable")
                .serviceDetails(
                        "Usageapi",
                        "DeleteCustomTable",
                        "https://docs.oracle.com/iaas/api/#/en/usage/20200107/CustomTable/DeleteCustomTable")
                .method(com.oracle.bmc.http.client.Method.DELETE)
                .requestBuilder(DeleteCustomTableRequest::builder)
                .basePath("/20200107")
                .appendPathParam("customTables")
                .appendPathParam(request.getCustomTableId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("if-match", request.getIfMatch())
                .handleResponseHeaderString(
                        "opc-request-id", DeleteCustomTableResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<DeleteEmailRecipientsGroupResponse>
            deleteEmailRecipientsGroup(
                    DeleteEmailRecipientsGroupRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    DeleteEmailRecipientsGroupRequest,
                                    DeleteEmailRecipientsGroupResponse>
                            handler) {

        Validate.notBlank(
                request.getEmailRecipientsGroupId(), "emailRecipientsGroupId must not be blank");

        Validate.notBlank(request.getSubscriptionId(), "subscriptionId must not be blank");
        Objects.requireNonNull(request.getCompartmentId(), "compartmentId is required");

        return clientCall(request, DeleteEmailRecipientsGroupResponse::builder)
                .logger(LOG, "deleteEmailRecipientsGroup")
                .serviceDetails(
                        "Usageapi",
                        "DeleteEmailRecipientsGroup",
                        "https://docs.oracle.com/iaas/api/#/en/usage/20200107/EmailRecipientsGroup/DeleteEmailRecipientsGroup")
                .method(com.oracle.bmc.http.client.Method.DELETE)
                .requestBuilder(DeleteEmailRecipientsGroupRequest::builder)
                .basePath("/20200107")
                .appendPathParam("usageStatements")
                .appendPathParam(request.getSubscriptionId())
                .appendPathParam("emailRecipientsGroups")
                .appendPathParam(request.getEmailRecipientsGroupId())
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("if-match", request.getIfMatch())
                .handleResponseHeaderString(
                        "opc-request-id", DeleteEmailRecipientsGroupResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<DeleteQueryResponse> deleteQuery(
            DeleteQueryRequest request,
            final com.oracle.bmc.responses.AsyncHandler<DeleteQueryRequest, DeleteQueryResponse>
                    handler) {

        Validate.notBlank(request.getQueryId(), "queryId must not be blank");

        return clientCall(request, DeleteQueryResponse::builder)
                .logger(LOG, "deleteQuery")
                .serviceDetails(
                        "Usageapi",
                        "DeleteQuery",
                        "https://docs.oracle.com/iaas/api/#/en/usage/20200107/Query/DeleteQuery")
                .method(com.oracle.bmc.http.client.Method.DELETE)
                .requestBuilder(DeleteQueryRequest::builder)
                .basePath("/20200107")
                .appendPathParam("queries")
                .appendPathParam(request.getQueryId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("if-match", request.getIfMatch())
                .handleResponseHeaderString(
                        "opc-request-id", DeleteQueryResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<DeleteScheduleResponse> deleteSchedule(
            DeleteScheduleRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            DeleteScheduleRequest, DeleteScheduleResponse>
                    handler) {

        Validate.notBlank(request.getScheduleId(), "scheduleId must not be blank");

        return clientCall(request, DeleteScheduleResponse::builder)
                .logger(LOG, "deleteSchedule")
                .serviceDetails(
                        "Usageapi",
                        "DeleteSchedule",
                        "https://docs.oracle.com/iaas/api/#/en/usage/20200107/Schedule/DeleteSchedule")
                .method(com.oracle.bmc.http.client.Method.DELETE)
                .requestBuilder(DeleteScheduleRequest::builder)
                .basePath("/20200107")
                .appendPathParam("schedules")
                .appendPathParam(request.getScheduleId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("if-match", request.getIfMatch())
                .handleResponseHeaderString(
                        "opc-request-id", DeleteScheduleResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<DeleteUsageCarbonEmissionsQueryResponse>
            deleteUsageCarbonEmissionsQuery(
                    DeleteUsageCarbonEmissionsQueryRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    DeleteUsageCarbonEmissionsQueryRequest,
                                    DeleteUsageCarbonEmissionsQueryResponse>
                            handler) {

        Validate.notBlank(
                request.getUsageCarbonEmissionsQueryId(),
                "usageCarbonEmissionsQueryId must not be blank");

        return clientCall(request, DeleteUsageCarbonEmissionsQueryResponse::builder)
                .logger(LOG, "deleteUsageCarbonEmissionsQuery")
                .serviceDetails(
                        "Usageapi",
                        "DeleteUsageCarbonEmissionsQuery",
                        "https://docs.oracle.com/iaas/api/#/en/usage/20200107/UsageCarbonEmissionsQuery/DeleteUsageCarbonEmissionsQuery")
                .method(com.oracle.bmc.http.client.Method.DELETE)
                .requestBuilder(DeleteUsageCarbonEmissionsQueryRequest::builder)
                .basePath("/20200107")
                .appendPathParam("usageCarbonEmissionsQueries")
                .appendPathParam(request.getUsageCarbonEmissionsQueryId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("if-match", request.getIfMatch())
                .handleResponseHeaderString(
                        "opc-request-id",
                        DeleteUsageCarbonEmissionsQueryResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<GetCustomTableResponse> getCustomTable(
            GetCustomTableRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetCustomTableRequest, GetCustomTableResponse>
                    handler) {

        Validate.notBlank(request.getCustomTableId(), "customTableId must not be blank");

        return clientCall(request, GetCustomTableResponse::builder)
                .logger(LOG, "getCustomTable")
                .serviceDetails(
                        "Usageapi",
                        "GetCustomTable",
                        "https://docs.oracle.com/iaas/api/#/en/usage/20200107/CustomTable/GetCustomTable")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetCustomTableRequest::builder)
                .basePath("/20200107")
                .appendPathParam("customTables")
                .appendPathParam(request.getCustomTableId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.usageapi.model.CustomTable.class,
                        GetCustomTableResponse.Builder::customTable)
                .handleResponseHeaderString(
                        "opc-request-id", GetCustomTableResponse.Builder::opcRequestId)
                .handleResponseHeaderString("etag", GetCustomTableResponse.Builder::etag)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<GetEmailRecipientsGroupResponse> getEmailRecipientsGroup(
            GetEmailRecipientsGroupRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetEmailRecipientsGroupRequest, GetEmailRecipientsGroupResponse>
                    handler) {

        Validate.notBlank(
                request.getEmailRecipientsGroupId(), "emailRecipientsGroupId must not be blank");

        Validate.notBlank(request.getSubscriptionId(), "subscriptionId must not be blank");
        Objects.requireNonNull(request.getCompartmentId(), "compartmentId is required");

        return clientCall(request, GetEmailRecipientsGroupResponse::builder)
                .logger(LOG, "getEmailRecipientsGroup")
                .serviceDetails(
                        "Usageapi",
                        "GetEmailRecipientsGroup",
                        "https://docs.oracle.com/iaas/api/#/en/usage/20200107/EmailRecipientsGroup/GetEmailRecipientsGroup")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetEmailRecipientsGroupRequest::builder)
                .basePath("/20200107")
                .appendPathParam("usageStatements")
                .appendPathParam(request.getSubscriptionId())
                .appendPathParam("emailRecipientsGroups")
                .appendPathParam(request.getEmailRecipientsGroupId())
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.usageapi.model.EmailRecipientsGroup.class,
                        GetEmailRecipientsGroupResponse.Builder::emailRecipientsGroup)
                .handleResponseHeaderString(
                        "opc-request-id", GetEmailRecipientsGroupResponse.Builder::opcRequestId)
                .handleResponseHeaderString("etag", GetEmailRecipientsGroupResponse.Builder::etag)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<GetQueryResponse> getQuery(
            GetQueryRequest request,
            final com.oracle.bmc.responses.AsyncHandler<GetQueryRequest, GetQueryResponse>
                    handler) {

        Validate.notBlank(request.getQueryId(), "queryId must not be blank");

        return clientCall(request, GetQueryResponse::builder)
                .logger(LOG, "getQuery")
                .serviceDetails(
                        "Usageapi",
                        "GetQuery",
                        "https://docs.oracle.com/iaas/api/#/en/usage/20200107/Query/GetQuery")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetQueryRequest::builder)
                .basePath("/20200107")
                .appendPathParam("queries")
                .appendPathParam(request.getQueryId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.usageapi.model.Query.class, GetQueryResponse.Builder::query)
                .handleResponseHeaderString(
                        "opc-request-id", GetQueryResponse.Builder::opcRequestId)
                .handleResponseHeaderString("etag", GetQueryResponse.Builder::etag)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<GetScheduleResponse> getSchedule(
            GetScheduleRequest request,
            final com.oracle.bmc.responses.AsyncHandler<GetScheduleRequest, GetScheduleResponse>
                    handler) {

        Validate.notBlank(request.getScheduleId(), "scheduleId must not be blank");

        return clientCall(request, GetScheduleResponse::builder)
                .logger(LOG, "getSchedule")
                .serviceDetails(
                        "Usageapi",
                        "GetSchedule",
                        "https://docs.oracle.com/iaas/api/#/en/usage/20200107/Schedule/GetSchedule")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetScheduleRequest::builder)
                .basePath("/20200107")
                .appendPathParam("schedules")
                .appendPathParam(request.getScheduleId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.usageapi.model.Schedule.class,
                        GetScheduleResponse.Builder::schedule)
                .handleResponseHeaderString(
                        "opc-request-id", GetScheduleResponse.Builder::opcRequestId)
                .handleResponseHeaderString("etag", GetScheduleResponse.Builder::etag)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<GetScheduledRunResponse> getScheduledRun(
            GetScheduledRunRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetScheduledRunRequest, GetScheduledRunResponse>
                    handler) {

        Validate.notBlank(request.getScheduledRunId(), "scheduledRunId must not be blank");

        return clientCall(request, GetScheduledRunResponse::builder)
                .logger(LOG, "getScheduledRun")
                .serviceDetails(
                        "Usageapi",
                        "GetScheduledRun",
                        "https://docs.oracle.com/iaas/api/#/en/usage/20200107/ScheduledRun/GetScheduledRun")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetScheduledRunRequest::builder)
                .basePath("/20200107")
                .appendPathParam("scheduledRuns")
                .appendPathParam(request.getScheduledRunId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.usageapi.model.ScheduledRun.class,
                        GetScheduledRunResponse.Builder::scheduledRun)
                .handleResponseHeaderString(
                        "opc-request-id", GetScheduledRunResponse.Builder::opcRequestId)
                .handleResponseHeaderString("etag", GetScheduledRunResponse.Builder::etag)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<GetUsageCarbonEmissionsQueryResponse>
            getUsageCarbonEmissionsQuery(
                    GetUsageCarbonEmissionsQueryRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    GetUsageCarbonEmissionsQueryRequest,
                                    GetUsageCarbonEmissionsQueryResponse>
                            handler) {

        Validate.notBlank(
                request.getUsageCarbonEmissionsQueryId(),
                "usageCarbonEmissionsQueryId must not be blank");

        return clientCall(request, GetUsageCarbonEmissionsQueryResponse::builder)
                .logger(LOG, "getUsageCarbonEmissionsQuery")
                .serviceDetails(
                        "Usageapi",
                        "GetUsageCarbonEmissionsQuery",
                        "https://docs.oracle.com/iaas/api/#/en/usage/20200107/UsageCarbonEmissionsQuery/GetUsageCarbonEmissionsQuery")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetUsageCarbonEmissionsQueryRequest::builder)
                .basePath("/20200107")
                .appendPathParam("usageCarbonEmissionsQueries")
                .appendPathParam(request.getUsageCarbonEmissionsQueryId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.usageapi.model.UsageCarbonEmissionsQuery.class,
                        GetUsageCarbonEmissionsQueryResponse.Builder::usageCarbonEmissionsQuery)
                .handleResponseHeaderString(
                        "opc-request-id",
                        GetUsageCarbonEmissionsQueryResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "etag", GetUsageCarbonEmissionsQueryResponse.Builder::etag)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListCustomTablesResponse> listCustomTables(
            ListCustomTablesRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListCustomTablesRequest, ListCustomTablesResponse>
                    handler) {
        Objects.requireNonNull(request.getCompartmentId(), "compartmentId is required");

        Objects.requireNonNull(request.getSavedReportId(), "savedReportId is required");

        return clientCall(request, ListCustomTablesResponse::builder)
                .logger(LOG, "listCustomTables")
                .serviceDetails(
                        "Usageapi",
                        "ListCustomTables",
                        "https://docs.oracle.com/iaas/api/#/en/usage/20200107/CustomTable/ListCustomTables")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListCustomTablesRequest::builder)
                .basePath("/20200107")
                .appendPathParam("customTables")
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendQueryParam("savedReportId", request.getSavedReportId())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.usageapi.model.CustomTableCollection.class,
                        ListCustomTablesResponse.Builder::customTableCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListCustomTablesResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListCustomTablesResponse.Builder::opcNextPage)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListEmailRecipientsGroupsResponse> listEmailRecipientsGroups(
            ListEmailRecipientsGroupsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListEmailRecipientsGroupsRequest, ListEmailRecipientsGroupsResponse>
                    handler) {

        Validate.notBlank(request.getSubscriptionId(), "subscriptionId must not be blank");
        Objects.requireNonNull(request.getCompartmentId(), "compartmentId is required");

        return clientCall(request, ListEmailRecipientsGroupsResponse::builder)
                .logger(LOG, "listEmailRecipientsGroups")
                .serviceDetails(
                        "Usageapi",
                        "ListEmailRecipientsGroups",
                        "https://docs.oracle.com/iaas/api/#/en/usage/20200107/EmailRecipientsGroup/ListEmailRecipientsGroups")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListEmailRecipientsGroupsRequest::builder)
                .basePath("/20200107")
                .appendPathParam("usageStatements")
                .appendPathParam(request.getSubscriptionId())
                .appendPathParam("emailRecipientsGroups")
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .handleBody(
                        com.oracle.bmc.usageapi.model.EmailRecipientsGroupCollection.class,
                        ListEmailRecipientsGroupsResponse.Builder::emailRecipientsGroupCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListEmailRecipientsGroupsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListEmailRecipientsGroupsResponse.Builder::opcNextPage)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListQueriesResponse> listQueries(
            ListQueriesRequest request,
            final com.oracle.bmc.responses.AsyncHandler<ListQueriesRequest, ListQueriesResponse>
                    handler) {
        Objects.requireNonNull(request.getCompartmentId(), "compartmentId is required");

        return clientCall(request, ListQueriesResponse::builder)
                .logger(LOG, "listQueries")
                .serviceDetails(
                        "Usageapi",
                        "ListQueries",
                        "https://docs.oracle.com/iaas/api/#/en/usage/20200107/Query/ListQueries")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListQueriesRequest::builder)
                .basePath("/20200107")
                .appendPathParam("queries")
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.usageapi.model.QueryCollection.class,
                        ListQueriesResponse.Builder::queryCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListQueriesResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListQueriesResponse.Builder::opcNextPage)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListScheduledRunsResponse> listScheduledRuns(
            ListScheduledRunsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListScheduledRunsRequest, ListScheduledRunsResponse>
                    handler) {
        Objects.requireNonNull(request.getScheduleId(), "scheduleId is required");

        return clientCall(request, ListScheduledRunsResponse::builder)
                .logger(LOG, "listScheduledRuns")
                .serviceDetails(
                        "Usageapi",
                        "ListScheduledRuns",
                        "https://docs.oracle.com/iaas/api/#/en/usage/20200107/ScheduledRun/ListScheduledRuns")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListScheduledRunsRequest::builder)
                .basePath("/20200107")
                .appendPathParam("scheduledRuns")
                .appendQueryParam("page", request.getPage())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("scheduleId", request.getScheduleId())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.usageapi.model.ScheduledRunCollection.class,
                        ListScheduledRunsResponse.Builder::scheduledRunCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListScheduledRunsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListScheduledRunsResponse.Builder::opcNextPage)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListSchedulesResponse> listSchedules(
            ListSchedulesRequest request,
            final com.oracle.bmc.responses.AsyncHandler<ListSchedulesRequest, ListSchedulesResponse>
                    handler) {
        Objects.requireNonNull(request.getCompartmentId(), "compartmentId is required");

        return clientCall(request, ListSchedulesResponse::builder)
                .logger(LOG, "listSchedules")
                .serviceDetails(
                        "Usageapi",
                        "ListSchedules",
                        "https://docs.oracle.com/iaas/api/#/en/usage/20200107/Schedule/ListSchedules")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListSchedulesRequest::builder)
                .basePath("/20200107")
                .appendPathParam("schedules")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendQueryParam("page", request.getPage())
                .appendQueryParam("limit", request.getLimit())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendQueryParam("name", request.getName())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.usageapi.model.ScheduleCollection.class,
                        ListSchedulesResponse.Builder::scheduleCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListSchedulesResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListSchedulesResponse.Builder::opcNextPage)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListUsageCarbonEmissionsQueriesResponse>
            listUsageCarbonEmissionsQueries(
                    ListUsageCarbonEmissionsQueriesRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ListUsageCarbonEmissionsQueriesRequest,
                                    ListUsageCarbonEmissionsQueriesResponse>
                            handler) {
        Objects.requireNonNull(request.getCompartmentId(), "compartmentId is required");

        return clientCall(request, ListUsageCarbonEmissionsQueriesResponse::builder)
                .logger(LOG, "listUsageCarbonEmissionsQueries")
                .serviceDetails(
                        "Usageapi",
                        "ListUsageCarbonEmissionsQueries",
                        "https://docs.oracle.com/iaas/api/#/en/usage/20200107/UsageCarbonEmissionsQuery/ListUsageCarbonEmissionsQueries")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListUsageCarbonEmissionsQueriesRequest::builder)
                .basePath("/20200107")
                .appendPathParam("usageCarbonEmissionsQueries")
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.usageapi.model.UsageCarbonEmissionsQueryCollection.class,
                        ListUsageCarbonEmissionsQueriesResponse.Builder
                                ::usageCarbonEmissionsQueryCollection)
                .handleResponseHeaderString(
                        "opc-request-id",
                        ListUsageCarbonEmissionsQueriesResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page",
                        ListUsageCarbonEmissionsQueriesResponse.Builder::opcNextPage)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<RequestAverageCarbonEmissionResponse>
            requestAverageCarbonEmission(
                    RequestAverageCarbonEmissionRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    RequestAverageCarbonEmissionRequest,
                                    RequestAverageCarbonEmissionResponse>
                            handler) {

        Validate.notBlank(request.getSkuPartNumber(), "skuPartNumber must not be blank");

        return clientCall(request, RequestAverageCarbonEmissionResponse::builder)
                .logger(LOG, "requestAverageCarbonEmission")
                .serviceDetails(
                        "Usageapi",
                        "RequestAverageCarbonEmission",
                        "https://docs.oracle.com/iaas/api/#/en/usage/20200107/AverageCarbonEmission/RequestAverageCarbonEmission")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(RequestAverageCarbonEmissionRequest::builder)
                .basePath("/20200107")
                .appendPathParam("averageCarbonEmissions")
                .appendPathParam(request.getSkuPartNumber())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.usageapi.model.AverageCarbonEmission.class,
                        RequestAverageCarbonEmissionResponse.Builder::averageCarbonEmission)
                .handleResponseHeaderString(
                        "opc-request-id",
                        RequestAverageCarbonEmissionResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "etag", RequestAverageCarbonEmissionResponse.Builder::etag)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<RequestCleanEnergyUsageResponse> requestCleanEnergyUsage(
            RequestCleanEnergyUsageRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            RequestCleanEnergyUsageRequest, RequestCleanEnergyUsageResponse>
                    handler) {

        Validate.notBlank(request.getRegion(), "region must not be blank");

        return clientCall(request, RequestCleanEnergyUsageResponse::builder)
                .logger(LOG, "requestCleanEnergyUsage")
                .serviceDetails(
                        "Usageapi",
                        "RequestCleanEnergyUsage",
                        "https://docs.oracle.com/iaas/api/#/en/usage/20200107/CleanEnergyUsage/RequestCleanEnergyUsage")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(RequestCleanEnergyUsageRequest::builder)
                .basePath("/20200107")
                .appendPathParam("cleanEnergyUsages")
                .appendPathParam(request.getRegion())
                .appendQueryParam("ad", request.getAd())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.usageapi.model.CleanEnergyUsage.class,
                        RequestCleanEnergyUsageResponse.Builder::cleanEnergyUsage)
                .handleResponseHeaderString(
                        "opc-request-id", RequestCleanEnergyUsageResponse.Builder::opcRequestId)
                .handleResponseHeaderString("etag", RequestCleanEnergyUsageResponse.Builder::etag)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<RequestSummarizedConfigurationsResponse>
            requestSummarizedConfigurations(
                    RequestSummarizedConfigurationsRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    RequestSummarizedConfigurationsRequest,
                                    RequestSummarizedConfigurationsResponse>
                            handler) {
        Objects.requireNonNull(request.getTenantId(), "tenantId is required");

        return clientCall(request, RequestSummarizedConfigurationsResponse::builder)
                .logger(LOG, "requestSummarizedConfigurations")
                .serviceDetails(
                        "Usageapi",
                        "RequestSummarizedConfigurations",
                        "https://docs.oracle.com/iaas/api/#/en/usage/20200107/Configuration/RequestSummarizedConfigurations")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(RequestSummarizedConfigurationsRequest::builder)
                .basePath("/20200107")
                .appendPathParam("configuration")
                .appendQueryParam("tenantId", request.getTenantId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.usageapi.model.ConfigurationAggregation.class,
                        RequestSummarizedConfigurationsResponse.Builder::configurationAggregation)
                .handleResponseHeaderString(
                        "opc-request-id",
                        RequestSummarizedConfigurationsResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<RequestSummarizedUsagesResponse> requestSummarizedUsages(
            RequestSummarizedUsagesRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            RequestSummarizedUsagesRequest, RequestSummarizedUsagesResponse>
                    handler) {
        Objects.requireNonNull(
                request.getRequestSummarizedUsagesDetails(),
                "requestSummarizedUsagesDetails is required");

        return clientCall(request, RequestSummarizedUsagesResponse::builder)
                .logger(LOG, "requestSummarizedUsages")
                .serviceDetails(
                        "Usageapi",
                        "RequestSummarizedUsages",
                        "https://docs.oracle.com/iaas/api/#/en/usage/20200107/UsageSummary/RequestSummarizedUsages")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(RequestSummarizedUsagesRequest::builder)
                .basePath("/20200107")
                .appendPathParam("usage")
                .appendQueryParam("page", request.getPage())
                .appendQueryParam("limit", request.getLimit())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.usageapi.model.UsageAggregation.class,
                        RequestSummarizedUsagesResponse.Builder::usageAggregation)
                .handleResponseHeaderString(
                        "opc-request-id", RequestSummarizedUsagesResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", RequestSummarizedUsagesResponse.Builder::opcNextPage)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<RequestUsageCarbonEmissionConfigResponse>
            requestUsageCarbonEmissionConfig(
                    RequestUsageCarbonEmissionConfigRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    RequestUsageCarbonEmissionConfigRequest,
                                    RequestUsageCarbonEmissionConfigResponse>
                            handler) {
        Objects.requireNonNull(request.getTenantId(), "tenantId is required");

        return clientCall(request, RequestUsageCarbonEmissionConfigResponse::builder)
                .logger(LOG, "requestUsageCarbonEmissionConfig")
                .serviceDetails(
                        "Usageapi",
                        "RequestUsageCarbonEmissionConfig",
                        "https://docs.oracle.com/iaas/api/#/en/usage/20200107/Configuration/RequestUsageCarbonEmissionConfig")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(RequestUsageCarbonEmissionConfigRequest::builder)
                .basePath("/20200107")
                .appendPathParam("usageCarbonEmissionsConfig")
                .appendQueryParam("tenantId", request.getTenantId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.usageapi.model.ConfigurationAggregation.class,
                        RequestUsageCarbonEmissionConfigResponse.Builder::configurationAggregation)
                .handleResponseHeaderString(
                        "opc-request-id",
                        RequestUsageCarbonEmissionConfigResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<RequestUsageCarbonEmissionsResponse>
            requestUsageCarbonEmissions(
                    RequestUsageCarbonEmissionsRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    RequestUsageCarbonEmissionsRequest,
                                    RequestUsageCarbonEmissionsResponse>
                            handler) {
        Objects.requireNonNull(
                request.getRequestUsageCarbonEmissionsDetails(),
                "requestUsageCarbonEmissionsDetails is required");

        return clientCall(request, RequestUsageCarbonEmissionsResponse::builder)
                .logger(LOG, "requestUsageCarbonEmissions")
                .serviceDetails(
                        "Usageapi",
                        "RequestUsageCarbonEmissions",
                        "https://docs.oracle.com/iaas/api/#/en/usage/20200107/UsageCarbonEmissionSummary/RequestUsageCarbonEmissions")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(RequestUsageCarbonEmissionsRequest::builder)
                .basePath("/20200107")
                .appendPathParam("usageCarbonEmissions")
                .appendQueryParam("page", request.getPage())
                .appendQueryParam("limit", request.getLimit())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.usageapi.model.UsageCarbonEmissionAggregation.class,
                        RequestUsageCarbonEmissionsResponse.Builder::usageCarbonEmissionAggregation)
                .handleResponseHeaderString(
                        "opc-request-id", RequestUsageCarbonEmissionsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", RequestUsageCarbonEmissionsResponse.Builder::opcNextPage)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<UpdateCustomTableResponse> updateCustomTable(
            UpdateCustomTableRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            UpdateCustomTableRequest, UpdateCustomTableResponse>
                    handler) {
        Objects.requireNonNull(
                request.getUpdateCustomTableDetails(), "updateCustomTableDetails is required");

        Validate.notBlank(request.getCustomTableId(), "customTableId must not be blank");

        return clientCall(request, UpdateCustomTableResponse::builder)
                .logger(LOG, "updateCustomTable")
                .serviceDetails(
                        "Usageapi",
                        "UpdateCustomTable",
                        "https://docs.oracle.com/iaas/api/#/en/usage/20200107/CustomTable/UpdateCustomTable")
                .method(com.oracle.bmc.http.client.Method.PUT)
                .requestBuilder(UpdateCustomTableRequest::builder)
                .basePath("/20200107")
                .appendPathParam("customTables")
                .appendPathParam(request.getCustomTableId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("if-match", request.getIfMatch())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.usageapi.model.CustomTable.class,
                        UpdateCustomTableResponse.Builder::customTable)
                .handleResponseHeaderString(
                        "opc-request-id", UpdateCustomTableResponse.Builder::opcRequestId)
                .handleResponseHeaderString("etag", UpdateCustomTableResponse.Builder::etag)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<UpdateEmailRecipientsGroupResponse>
            updateEmailRecipientsGroup(
                    UpdateEmailRecipientsGroupRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    UpdateEmailRecipientsGroupRequest,
                                    UpdateEmailRecipientsGroupResponse>
                            handler) {
        Objects.requireNonNull(
                request.getUpdateEmailRecipientsGroupDetails(),
                "updateEmailRecipientsGroupDetails is required");

        Validate.notBlank(
                request.getEmailRecipientsGroupId(), "emailRecipientsGroupId must not be blank");

        Validate.notBlank(request.getSubscriptionId(), "subscriptionId must not be blank");
        Objects.requireNonNull(request.getCompartmentId(), "compartmentId is required");

        return clientCall(request, UpdateEmailRecipientsGroupResponse::builder)
                .logger(LOG, "updateEmailRecipientsGroup")
                .serviceDetails(
                        "Usageapi",
                        "UpdateEmailRecipientsGroup",
                        "https://docs.oracle.com/iaas/api/#/en/usage/20200107/EmailRecipientsGroup/UpdateEmailRecipientsGroup")
                .method(com.oracle.bmc.http.client.Method.PUT)
                .requestBuilder(UpdateEmailRecipientsGroupRequest::builder)
                .basePath("/20200107")
                .appendPathParam("usageStatements")
                .appendPathParam(request.getSubscriptionId())
                .appendPathParam("emailRecipientsGroups")
                .appendPathParam(request.getEmailRecipientsGroupId())
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("if-match", request.getIfMatch())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.usageapi.model.EmailRecipientsGroup.class,
                        UpdateEmailRecipientsGroupResponse.Builder::emailRecipientsGroup)
                .handleResponseHeaderString(
                        "opc-request-id", UpdateEmailRecipientsGroupResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "etag", UpdateEmailRecipientsGroupResponse.Builder::etag)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<UpdateQueryResponse> updateQuery(
            UpdateQueryRequest request,
            final com.oracle.bmc.responses.AsyncHandler<UpdateQueryRequest, UpdateQueryResponse>
                    handler) {
        Objects.requireNonNull(request.getUpdateQueryDetails(), "updateQueryDetails is required");

        Validate.notBlank(request.getQueryId(), "queryId must not be blank");

        return clientCall(request, UpdateQueryResponse::builder)
                .logger(LOG, "updateQuery")
                .serviceDetails(
                        "Usageapi",
                        "UpdateQuery",
                        "https://docs.oracle.com/iaas/api/#/en/usage/20200107/Query/UpdateQuery")
                .method(com.oracle.bmc.http.client.Method.PUT)
                .requestBuilder(UpdateQueryRequest::builder)
                .basePath("/20200107")
                .appendPathParam("queries")
                .appendPathParam(request.getQueryId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("if-match", request.getIfMatch())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.usageapi.model.Query.class,
                        UpdateQueryResponse.Builder::query)
                .handleResponseHeaderString(
                        "opc-request-id", UpdateQueryResponse.Builder::opcRequestId)
                .handleResponseHeaderString("etag", UpdateQueryResponse.Builder::etag)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<UpdateScheduleResponse> updateSchedule(
            UpdateScheduleRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            UpdateScheduleRequest, UpdateScheduleResponse>
                    handler) {
        Objects.requireNonNull(
                request.getUpdateScheduleDetails(), "updateScheduleDetails is required");

        Validate.notBlank(request.getScheduleId(), "scheduleId must not be blank");

        return clientCall(request, UpdateScheduleResponse::builder)
                .logger(LOG, "updateSchedule")
                .serviceDetails(
                        "Usageapi",
                        "UpdateSchedule",
                        "https://docs.oracle.com/iaas/api/#/en/usage/20200107/Schedule/UpdateSchedule")
                .method(com.oracle.bmc.http.client.Method.PUT)
                .requestBuilder(UpdateScheduleRequest::builder)
                .basePath("/20200107")
                .appendPathParam("schedules")
                .appendPathParam(request.getScheduleId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("if-match", request.getIfMatch())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.usageapi.model.Schedule.class,
                        UpdateScheduleResponse.Builder::schedule)
                .handleResponseHeaderString(
                        "opc-request-id", UpdateScheduleResponse.Builder::opcRequestId)
                .handleResponseHeaderString("etag", UpdateScheduleResponse.Builder::etag)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<UpdateUsageCarbonEmissionsQueryResponse>
            updateUsageCarbonEmissionsQuery(
                    UpdateUsageCarbonEmissionsQueryRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    UpdateUsageCarbonEmissionsQueryRequest,
                                    UpdateUsageCarbonEmissionsQueryResponse>
                            handler) {
        Objects.requireNonNull(
                request.getUpdateUsageCarbonEmissionsQueryDetails(),
                "updateUsageCarbonEmissionsQueryDetails is required");

        Validate.notBlank(
                request.getUsageCarbonEmissionsQueryId(),
                "usageCarbonEmissionsQueryId must not be blank");

        return clientCall(request, UpdateUsageCarbonEmissionsQueryResponse::builder)
                .logger(LOG, "updateUsageCarbonEmissionsQuery")
                .serviceDetails(
                        "Usageapi",
                        "UpdateUsageCarbonEmissionsQuery",
                        "https://docs.oracle.com/iaas/api/#/en/usage/20200107/UsageCarbonEmissionsQuery/UpdateUsageCarbonEmissionsQuery")
                .method(com.oracle.bmc.http.client.Method.PUT)
                .requestBuilder(UpdateUsageCarbonEmissionsQueryRequest::builder)
                .basePath("/20200107")
                .appendPathParam("usageCarbonEmissionsQueries")
                .appendPathParam(request.getUsageCarbonEmissionsQueryId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("if-match", request.getIfMatch())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.usageapi.model.UsageCarbonEmissionsQuery.class,
                        UpdateUsageCarbonEmissionsQueryResponse.Builder::usageCarbonEmissionsQuery)
                .handleResponseHeaderString(
                        "opc-request-id",
                        UpdateUsageCarbonEmissionsQueryResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "etag", UpdateUsageCarbonEmissionsQueryResponse.Builder::etag)
                .callAsync(handler);
    }

    /**
     * Create a new client instance.
     *
     * @param authenticationDetailsProvider The authentication details (see {@link Builder#build})
     * @deprecated Use the {@link #builder() builder} instead.
     */
    @Deprecated
    public UsageapiAsyncClient(
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
    public UsageapiAsyncClient(
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
    public UsageapiAsyncClient(
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
    public UsageapiAsyncClient(
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
    public UsageapiAsyncClient(
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
    public UsageapiAsyncClient(
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
    public UsageapiAsyncClient(
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

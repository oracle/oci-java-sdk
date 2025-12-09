/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.databasemanagement;

import com.oracle.bmc.util.internal.Validate;
import com.oracle.bmc.databasemanagement.requests.*;
import com.oracle.bmc.databasemanagement.responses.*;

import java.util.Objects;

/**
 * Async client implementation for ManagedMySqlDatabases service. <br>
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
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20201101")
public class ManagedMySqlDatabasesAsyncClient extends com.oracle.bmc.http.internal.BaseAsyncClient
        implements ManagedMySqlDatabasesAsync {
    /** Service instance for ManagedMySqlDatabases. */
    public static final com.oracle.bmc.Service SERVICE =
            com.oracle.bmc.Services.serviceBuilder()
                    .serviceName(ManagedMySqlDatabasesClient.class.getName())
                    .serviceEndpointPrefix("")
                    .serviceEndpointTemplate("https://dbmgmt.{region}.oci.{secondLevelDomain}")
                    .build();

    private static final org.slf4j.Logger LOG =
            org.slf4j.LoggerFactory.getLogger(ManagedMySqlDatabasesAsyncClient.class);

    ManagedMySqlDatabasesAsyncClient(
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
                    Builder, ManagedMySqlDatabasesAsyncClient> {
        private Builder(com.oracle.bmc.Service service) {
            super(service);
            final String packageName = "databasemanagement";
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
        public ManagedMySqlDatabasesAsyncClient build(
                @jakarta.annotation.Nonnull
                        com.oracle.bmc.auth.AbstractAuthenticationDetailsProvider
                                authenticationDetailsProvider) {
            return new ManagedMySqlDatabasesAsyncClient(this, authenticationDetailsProvider);
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
    public java.util.concurrent.Future<ChangeMysqlDatabaseManagementTypeResponse>
            changeMysqlDatabaseManagementType(
                    ChangeMysqlDatabaseManagementTypeRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ChangeMysqlDatabaseManagementTypeRequest,
                                    ChangeMysqlDatabaseManagementTypeResponse>
                            handler) {

        Validate.notBlank(
                request.getManagedMySqlDatabaseId(), "managedMySqlDatabaseId must not be blank");
        Objects.requireNonNull(
                request.getChangeMysqlDatabaseManagementTypeDetails(),
                "changeMysqlDatabaseManagementTypeDetails is required");

        return clientCall(request, ChangeMysqlDatabaseManagementTypeResponse::builder)
                .logger(LOG, "changeMysqlDatabaseManagementType")
                .serviceDetails(
                        "ManagedMySqlDatabases",
                        "ChangeMysqlDatabaseManagementType",
                        "https://docs.oracle.com/iaas/api/#/en/database-management/20201101/ManagedMySqlDatabase/ChangeMysqlDatabaseManagementType")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(ChangeMysqlDatabaseManagementTypeRequest::builder)
                .basePath("/20201101")
                .appendPathParam("managedMySqlDatabases")
                .appendPathParam(request.getManagedMySqlDatabaseId())
                .appendPathParam("actions")
                .appendPathParam("changeManagementType")
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        ChangeMysqlDatabaseManagementTypeResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id",
                        ChangeMysqlDatabaseManagementTypeResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<GetBinaryLogInformationResponse> getBinaryLogInformation(
            GetBinaryLogInformationRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetBinaryLogInformationRequest, GetBinaryLogInformationResponse>
                    handler) {

        Validate.notBlank(
                request.getManagedMySqlDatabaseId(), "managedMySqlDatabaseId must not be blank");

        return clientCall(request, GetBinaryLogInformationResponse::builder)
                .logger(LOG, "getBinaryLogInformation")
                .serviceDetails(
                        "ManagedMySqlDatabases",
                        "GetBinaryLogInformation",
                        "https://docs.oracle.com/iaas/api/#/en/database-management/20201101/ManagedMySqlDatabase/GetBinaryLogInformation")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetBinaryLogInformationRequest::builder)
                .basePath("/20201101")
                .appendPathParam("managedMySqlDatabases")
                .appendPathParam(request.getManagedMySqlDatabaseId())
                .appendPathParam("binaryLogInformation")
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.databasemanagement.model
                                .ManagedMySqlDatabaseBinaryLogInformation.class,
                        GetBinaryLogInformationResponse.Builder
                                ::managedMySqlDatabaseBinaryLogInformation)
                .handleResponseHeaderString(
                        "opc-request-id", GetBinaryLogInformationResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", GetBinaryLogInformationResponse.Builder::opcNextPage)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<GetGeneralReplicationInformationResponse>
            getGeneralReplicationInformation(
                    GetGeneralReplicationInformationRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    GetGeneralReplicationInformationRequest,
                                    GetGeneralReplicationInformationResponse>
                            handler) {

        Validate.notBlank(
                request.getManagedMySqlDatabaseId(), "managedMySqlDatabaseId must not be blank");

        return clientCall(request, GetGeneralReplicationInformationResponse::builder)
                .logger(LOG, "getGeneralReplicationInformation")
                .serviceDetails(
                        "ManagedMySqlDatabases",
                        "GetGeneralReplicationInformation",
                        "https://docs.oracle.com/iaas/api/#/en/database-management/20201101/ManagedMySqlDatabase/GetGeneralReplicationInformation")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetGeneralReplicationInformationRequest::builder)
                .basePath("/20201101")
                .appendPathParam("managedMySqlDatabases")
                .appendPathParam(request.getManagedMySqlDatabaseId())
                .appendPathParam("generalReplicationInformation")
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.databasemanagement.model
                                .ManagedMySqlDatabaseGeneralReplicationInformation.class,
                        GetGeneralReplicationInformationResponse.Builder
                                ::managedMySqlDatabaseGeneralReplicationInformation)
                .handleResponseHeaderString(
                        "opc-request-id",
                        GetGeneralReplicationInformationResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page",
                        GetGeneralReplicationInformationResponse.Builder::opcNextPage)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<GetHeatWaveFleetMetricResponse> getHeatWaveFleetMetric(
            GetHeatWaveFleetMetricRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetHeatWaveFleetMetricRequest, GetHeatWaveFleetMetricResponse>
                    handler) {
        Objects.requireNonNull(request.getCompartmentId(), "compartmentId is required");

        Objects.requireNonNull(request.getStartTime(), "startTime is required");

        Objects.requireNonNull(request.getEndTime(), "endTime is required");

        return clientCall(request, GetHeatWaveFleetMetricResponse::builder)
                .logger(LOG, "getHeatWaveFleetMetric")
                .serviceDetails(
                        "ManagedMySqlDatabases",
                        "GetHeatWaveFleetMetric",
                        "https://docs.oracle.com/iaas/api/#/en/database-management/20201101/HeatWaveFleetMetrics/GetHeatWaveFleetMetric")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetHeatWaveFleetMetricRequest::builder)
                .basePath("/20201101")
                .appendPathParam("heatWaveFleetMetrics")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendQueryParam("filterByMetricNames", request.getFilterByMetricNames())
                .appendQueryParam("startTime", request.getStartTime())
                .appendQueryParam("endTime", request.getEndTime())
                .appendEnumQueryParam("filterByHeatWaveStatus", request.getFilterByHeatWaveStatus())
                .appendQueryParam("filterByHeatWaveShape", request.getFilterByHeatWaveShape())
                .appendQueryParam(
                        "isHeatWaveLakehouseEnabled", request.getIsHeatWaveLakehouseEnabled())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.databasemanagement.model.HeatWaveFleetMetrics.class,
                        GetHeatWaveFleetMetricResponse.Builder::heatWaveFleetMetrics)
                .handleResponseHeaderString(
                        "opc-request-id", GetHeatWaveFleetMetricResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<GetManagedMySqlDatabaseResponse> getManagedMySqlDatabase(
            GetManagedMySqlDatabaseRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetManagedMySqlDatabaseRequest, GetManagedMySqlDatabaseResponse>
                    handler) {

        Validate.notBlank(
                request.getManagedMySqlDatabaseId(), "managedMySqlDatabaseId must not be blank");

        return clientCall(request, GetManagedMySqlDatabaseResponse::builder)
                .logger(LOG, "getManagedMySqlDatabase")
                .serviceDetails(
                        "ManagedMySqlDatabases",
                        "GetManagedMySqlDatabase",
                        "https://docs.oracle.com/iaas/api/#/en/database-management/20201101/ManagedMySqlDatabase/GetManagedMySqlDatabase")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetManagedMySqlDatabaseRequest::builder)
                .basePath("/20201101")
                .appendPathParam("managedMySqlDatabases")
                .appendPathParam(request.getManagedMySqlDatabaseId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.databasemanagement.model.ManagedMySqlDatabase.class,
                        GetManagedMySqlDatabaseResponse.Builder::managedMySqlDatabase)
                .handleResponseHeaderString(
                        "opc-request-id", GetManagedMySqlDatabaseResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<GetMySqlFleetMetricResponse> getMySqlFleetMetric(
            GetMySqlFleetMetricRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetMySqlFleetMetricRequest, GetMySqlFleetMetricResponse>
                    handler) {
        Objects.requireNonNull(request.getCompartmentId(), "compartmentId is required");

        Objects.requireNonNull(request.getStartTime(), "startTime is required");

        Objects.requireNonNull(request.getEndTime(), "endTime is required");

        return clientCall(request, GetMySqlFleetMetricResponse::builder)
                .logger(LOG, "getMySqlFleetMetric")
                .serviceDetails(
                        "ManagedMySqlDatabases",
                        "GetMySqlFleetMetric",
                        "https://docs.oracle.com/iaas/api/#/en/database-management/20201101/MySqlFleetMetrics/GetMySqlFleetMetric")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetMySqlFleetMetricRequest::builder)
                .basePath("/20201101")
                .appendPathParam("mysqlFleetMetrics")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendQueryParam("filterByMetricNames", request.getFilterByMetricNames())
                .appendQueryParam("startTime", request.getStartTime())
                .appendQueryParam("endTime", request.getEndTime())
                .appendEnumQueryParam(
                        "filterByMySqlDeploymentTypeParam",
                        request.getFilterByMySqlDeploymentTypeParam())
                .appendEnumQueryParam(
                        "filterByMdsDeploymentType", request.getFilterByMdsDeploymentType())
                .appendEnumQueryParam(
                        "filterByMySqlDatabaseTypeParam",
                        request.getFilterByMySqlDatabaseTypeParam())
                .appendEnumQueryParam("filterByMySqlStatus", request.getFilterByMySqlStatus())
                .appendQueryParam(
                        "filterByMySqlDatabaseVersion", request.getFilterByMySqlDatabaseVersion())
                .appendQueryParam("isHeatWaveEnabled", request.getIsHeatWaveEnabled())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.databasemanagement.model.MySqlFleetMetrics.class,
                        GetMySqlFleetMetricResponse.Builder::mySqlFleetMetrics)
                .handleResponseHeaderString(
                        "opc-request-id", GetMySqlFleetMetricResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<GetMySqlQueryDetailsResponse> getMySqlQueryDetails(
            GetMySqlQueryDetailsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetMySqlQueryDetailsRequest, GetMySqlQueryDetailsResponse>
                    handler) {

        Validate.notBlank(
                request.getManagedMySqlDatabaseId(), "managedMySqlDatabaseId must not be blank");
        Objects.requireNonNull(request.getDigest(), "digest is required");

        return clientCall(request, GetMySqlQueryDetailsResponse::builder)
                .logger(LOG, "getMySqlQueryDetails")
                .serviceDetails(
                        "ManagedMySqlDatabases",
                        "GetMySqlQueryDetails",
                        "https://docs.oracle.com/iaas/api/#/en/database-management/20201101/ManagedMySqlDatabase/GetMySqlQueryDetails")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetMySqlQueryDetailsRequest::builder)
                .basePath("/20201101")
                .appendPathParam("managedMySqlDatabases")
                .appendPathParam(request.getManagedMySqlDatabaseId())
                .appendPathParam("queryDetails")
                .appendQueryParam("digest", request.getDigest())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.databasemanagement.model.MySqlQueryDetails.class,
                        GetMySqlQueryDetailsResponse.Builder::mySqlQueryDetails)
                .handleResponseHeaderString(
                        "opc-request-id", GetMySqlQueryDetailsResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListHighAvailabilityMembersResponse>
            listHighAvailabilityMembers(
                    ListHighAvailabilityMembersRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ListHighAvailabilityMembersRequest,
                                    ListHighAvailabilityMembersResponse>
                            handler) {

        Validate.notBlank(
                request.getManagedMySqlDatabaseId(), "managedMySqlDatabaseId must not be blank");

        return clientCall(request, ListHighAvailabilityMembersResponse::builder)
                .logger(LOG, "listHighAvailabilityMembers")
                .serviceDetails(
                        "ManagedMySqlDatabases",
                        "ListHighAvailabilityMembers",
                        "https://docs.oracle.com/iaas/api/#/en/database-management/20201101/ManagedMySqlDatabase/ListHighAvailabilityMembers")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListHighAvailabilityMembersRequest::builder)
                .basePath("/20201101")
                .appendPathParam("managedMySqlDatabases")
                .appendPathParam(request.getManagedMySqlDatabaseId())
                .appendPathParam("highAvailabilityMembers")
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.databasemanagement.model
                                .ManagedMySqlDatabaseHighAvailabilityMemberCollection.class,
                        ListHighAvailabilityMembersResponse.Builder
                                ::managedMySqlDatabaseHighAvailabilityMemberCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListHighAvailabilityMembersResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListHighAvailabilityMembersResponse.Builder::opcNextPage)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListInboundReplicationsResponse> listInboundReplications(
            ListInboundReplicationsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListInboundReplicationsRequest, ListInboundReplicationsResponse>
                    handler) {

        Validate.notBlank(
                request.getManagedMySqlDatabaseId(), "managedMySqlDatabaseId must not be blank");

        return clientCall(request, ListInboundReplicationsResponse::builder)
                .logger(LOG, "listInboundReplications")
                .serviceDetails(
                        "ManagedMySqlDatabases",
                        "ListInboundReplications",
                        "https://docs.oracle.com/iaas/api/#/en/database-management/20201101/ManagedMySqlDatabase/ListInboundReplications")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListInboundReplicationsRequest::builder)
                .basePath("/20201101")
                .appendPathParam("managedMySqlDatabases")
                .appendPathParam(request.getManagedMySqlDatabaseId())
                .appendPathParam("inboundReplications")
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.databasemanagement.model
                                .ManagedMySqlDatabaseInboundReplicationCollection.class,
                        ListInboundReplicationsResponse.Builder
                                ::managedMySqlDatabaseInboundReplicationCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListInboundReplicationsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListInboundReplicationsResponse.Builder::opcNextPage)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListManagedMySqlDatabaseConfigurationDataResponse>
            listManagedMySqlDatabaseConfigurationData(
                    ListManagedMySqlDatabaseConfigurationDataRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ListManagedMySqlDatabaseConfigurationDataRequest,
                                    ListManagedMySqlDatabaseConfigurationDataResponse>
                            handler) {

        Validate.notBlank(
                request.getManagedMySqlDatabaseId(), "managedMySqlDatabaseId must not be blank");

        return clientCall(request, ListManagedMySqlDatabaseConfigurationDataResponse::builder)
                .logger(LOG, "listManagedMySqlDatabaseConfigurationData")
                .serviceDetails(
                        "ManagedMySqlDatabases",
                        "ListManagedMySqlDatabaseConfigurationData",
                        "https://docs.oracle.com/iaas/api/#/en/database-management/20201101/ManagedMySqlDatabase/ListManagedMySqlDatabaseConfigurationData")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListManagedMySqlDatabaseConfigurationDataRequest::builder)
                .basePath("/20201101")
                .appendPathParam("managedMySqlDatabases")
                .appendPathParam(request.getManagedMySqlDatabaseId())
                .appendPathParam("configurationData")
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.databasemanagement.model.MySqlConfigurationDataCollection
                                .class,
                        ListManagedMySqlDatabaseConfigurationDataResponse.Builder
                                ::mySqlConfigurationDataCollection)
                .handleResponseHeaderString(
                        "opc-request-id",
                        ListManagedMySqlDatabaseConfigurationDataResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page",
                        ListManagedMySqlDatabaseConfigurationDataResponse.Builder::opcNextPage)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListManagedMySqlDatabaseSqlDataResponse>
            listManagedMySqlDatabaseSqlData(
                    ListManagedMySqlDatabaseSqlDataRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ListManagedMySqlDatabaseSqlDataRequest,
                                    ListManagedMySqlDatabaseSqlDataResponse>
                            handler) {

        Validate.notBlank(
                request.getManagedMySqlDatabaseId(), "managedMySqlDatabaseId must not be blank");
        Objects.requireNonNull(request.getStartTime(), "startTime is required");

        Objects.requireNonNull(request.getEndTime(), "endTime is required");

        return clientCall(request, ListManagedMySqlDatabaseSqlDataResponse::builder)
                .logger(LOG, "listManagedMySqlDatabaseSqlData")
                .serviceDetails(
                        "ManagedMySqlDatabases",
                        "ListManagedMySqlDatabaseSqlData",
                        "https://docs.oracle.com/iaas/api/#/en/database-management/20201101/ManagedMySqlDatabase/ListManagedMySqlDatabaseSqlData")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListManagedMySqlDatabaseSqlDataRequest::builder)
                .basePath("/20201101")
                .appendPathParam("managedMySqlDatabases")
                .appendPathParam(request.getManagedMySqlDatabaseId())
                .appendPathParam("sqlData")
                .appendQueryParam("filterColumn", request.getFilterColumn())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendQueryParam("startTime", request.getStartTime())
                .appendQueryParam("endTime", request.getEndTime())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.databasemanagement.model.MySqlDataCollection.class,
                        ListManagedMySqlDatabaseSqlDataResponse.Builder::mySqlDataCollection)
                .handleResponseHeaderString(
                        "opc-request-id",
                        ListManagedMySqlDatabaseSqlDataResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page",
                        ListManagedMySqlDatabaseSqlDataResponse.Builder::opcNextPage)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListManagedMySqlDatabasesResponse> listManagedMySqlDatabases(
            ListManagedMySqlDatabasesRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListManagedMySqlDatabasesRequest, ListManagedMySqlDatabasesResponse>
                    handler) {
        Objects.requireNonNull(request.getCompartmentId(), "compartmentId is required");

        return clientCall(request, ListManagedMySqlDatabasesResponse::builder)
                .logger(LOG, "listManagedMySqlDatabases")
                .serviceDetails(
                        "ManagedMySqlDatabases",
                        "ListManagedMySqlDatabases",
                        "https://docs.oracle.com/iaas/api/#/en/database-management/20201101/ManagedMySqlDatabaseCollection/ListManagedMySqlDatabases")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListManagedMySqlDatabasesRequest::builder)
                .basePath("/20201101")
                .appendPathParam("managedMySqlDatabases")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendQueryParam("page", request.getPage())
                .appendQueryParam("limit", request.getLimit())
                .appendEnumQueryParam(
                        "filterByMySqlDatabaseTypeParam",
                        request.getFilterByMySqlDatabaseTypeParam())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.databasemanagement.model.ManagedMySqlDatabaseCollection
                                .class,
                        ListManagedMySqlDatabasesResponse.Builder::managedMySqlDatabaseCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListManagedMySqlDatabasesResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListManagedMySqlDatabasesResponse.Builder::opcNextPage)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListMySqlDigestErrorsResponse> listMySqlDigestErrors(
            ListMySqlDigestErrorsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListMySqlDigestErrorsRequest, ListMySqlDigestErrorsResponse>
                    handler) {

        Validate.notBlank(
                request.getManagedMySqlDatabaseId(), "managedMySqlDatabaseId must not be blank");
        Objects.requireNonNull(request.getDigest(), "digest is required");

        return clientCall(request, ListMySqlDigestErrorsResponse::builder)
                .logger(LOG, "listMySqlDigestErrors")
                .serviceDetails(
                        "ManagedMySqlDatabases",
                        "ListMySqlDigestErrors",
                        "https://docs.oracle.com/iaas/api/#/en/database-management/20201101/ManagedMySqlDatabase/ListMySqlDigestErrors")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListMySqlDigestErrorsRequest::builder)
                .basePath("/20201101")
                .appendPathParam("managedMySqlDatabases")
                .appendPathParam(request.getManagedMySqlDatabaseId())
                .appendPathParam("digestErrors")
                .appendQueryParam("digest", request.getDigest())
                .appendQueryParam("page", request.getPage())
                .appendQueryParam("limit", request.getLimit())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.databasemanagement.model.MySqlDigestErrorsCollection.class,
                        ListMySqlDigestErrorsResponse.Builder::mySqlDigestErrorsCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListMySqlDigestErrorsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListMySqlDigestErrorsResponse.Builder::opcNextPage)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListOutboundReplicationsResponse> listOutboundReplications(
            ListOutboundReplicationsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListOutboundReplicationsRequest, ListOutboundReplicationsResponse>
                    handler) {

        Validate.notBlank(
                request.getManagedMySqlDatabaseId(), "managedMySqlDatabaseId must not be blank");

        return clientCall(request, ListOutboundReplicationsResponse::builder)
                .logger(LOG, "listOutboundReplications")
                .serviceDetails(
                        "ManagedMySqlDatabases",
                        "ListOutboundReplications",
                        "https://docs.oracle.com/iaas/api/#/en/database-management/20201101/ManagedMySqlDatabase/ListOutboundReplications")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListOutboundReplicationsRequest::builder)
                .basePath("/20201101")
                .appendPathParam("managedMySqlDatabases")
                .appendPathParam(request.getManagedMySqlDatabaseId())
                .appendPathParam("outboundReplications")
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.databasemanagement.model
                                .ManagedMySqlDatabaseOutboundReplicationCollection.class,
                        ListOutboundReplicationsResponse.Builder
                                ::managedMySqlDatabaseOutboundReplicationCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListOutboundReplicationsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListOutboundReplicationsResponse.Builder::opcNextPage)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<SummarizeManagedMySqlDatabaseAvailabilityMetricsResponse>
            summarizeManagedMySqlDatabaseAvailabilityMetrics(
                    SummarizeManagedMySqlDatabaseAvailabilityMetricsRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    SummarizeManagedMySqlDatabaseAvailabilityMetricsRequest,
                                    SummarizeManagedMySqlDatabaseAvailabilityMetricsResponse>
                            handler) {

        Validate.notBlank(
                request.getManagedMySqlDatabaseId(), "managedMySqlDatabaseId must not be blank");
        Objects.requireNonNull(request.getStartTime(), "startTime is required");

        Objects.requireNonNull(request.getEndTime(), "endTime is required");

        return clientCall(
                        request, SummarizeManagedMySqlDatabaseAvailabilityMetricsResponse::builder)
                .logger(LOG, "summarizeManagedMySqlDatabaseAvailabilityMetrics")
                .serviceDetails(
                        "ManagedMySqlDatabases",
                        "SummarizeManagedMySqlDatabaseAvailabilityMetrics",
                        "https://docs.oracle.com/iaas/api/#/en/database-management/20201101/ManagedMySqlDatabase/SummarizeManagedMySqlDatabaseAvailabilityMetrics")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(SummarizeManagedMySqlDatabaseAvailabilityMetricsRequest::builder)
                .basePath("/20201101")
                .appendPathParam("managedMySqlDatabases")
                .appendPathParam(request.getManagedMySqlDatabaseId())
                .appendPathParam("availabilityMetrics")
                .appendQueryParam("page", request.getPage())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("startTime", request.getStartTime())
                .appendQueryParam("endTime", request.getEndTime())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.databasemanagement.model.MetricsAggregationRangeCollection
                                .class,
                        SummarizeManagedMySqlDatabaseAvailabilityMetricsResponse.Builder
                                ::metricsAggregationRangeCollection)
                .handleResponseHeaderString(
                        "opc-request-id",
                        SummarizeManagedMySqlDatabaseAvailabilityMetricsResponse.Builder
                                ::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page",
                        SummarizeManagedMySqlDatabaseAvailabilityMetricsResponse.Builder
                                ::opcNextPage)
                .callAsync(handler);
    }

    /**
     * Create a new client instance.
     *
     * @param authenticationDetailsProvider The authentication details (see {@link Builder#build})
     * @deprecated Use the {@link #builder() builder} instead.
     */
    @Deprecated
    public ManagedMySqlDatabasesAsyncClient(
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
    public ManagedMySqlDatabasesAsyncClient(
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
    public ManagedMySqlDatabasesAsyncClient(
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
    public ManagedMySqlDatabasesAsyncClient(
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
    public ManagedMySqlDatabasesAsyncClient(
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
    public ManagedMySqlDatabasesAsyncClient(
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
    public ManagedMySqlDatabasesAsyncClient(
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

/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.cloudmigrations;

import com.oracle.bmc.cloudmigrations.requests.*;
import com.oracle.bmc.cloudmigrations.responses.*;

/**
 * A description of the Oracle Cloud Migrations API.
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20220919")
public interface MigrationAsync extends AutoCloseable {

    /**
     * Rebuilds the client from scratch.
     * Useful to refresh certificates.
     */
    void refreshClient();

    /**
     * Sets the endpoint to call (ex, https://www.example.com).
     * @param endpoint The endpoint of the serice.
     */
    void setEndpoint(String endpoint);

    /**
     * Gets the set endpoint for REST call (ex, https://www.example.com)
     */
    String getEndpoint();

    /**
     * Sets the region to call (ex, Region.US_PHOENIX_1).
     * <p>
     * Note, this will call {@link #setEndpoint(String) setEndpoint} after resolving the endpoint.  If the service is not available in this region, however, an IllegalArgumentException will be raised.
     * @param region The region of the service.
     */
    void setRegion(com.oracle.bmc.Region region);

    /**
     * Sets the region to call (ex, 'us-phoenix-1').
     * <p>
     * Note, this will first try to map the region ID to a known Region and call
     * {@link #setRegion(Region) setRegion}.
     * <p>
     * If no known Region could be determined, it will create an endpoint based on the
     * default endpoint format ({@link com.oracle.bmc.Region#formatDefaultRegionEndpoint(Service, String)}
     * and then call {@link #setEndpoint(String) setEndpoint}.
     * @param regionId The public region ID.
     */
    void setRegion(String regionId);

    /**
     * Cancels work request with the given ID.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<CancelWorkRequestResponse> cancelWorkRequest(
            CancelWorkRequestRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            CancelWorkRequestRequest, CancelWorkRequestResponse>
                    handler);

    /**
     * Moves a migration resource from one compartment identifier to another. When provided, If-Match is checked against ETag values of the resource.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<ChangeMigrationCompartmentResponse> changeMigrationCompartment(
            ChangeMigrationCompartmentRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            ChangeMigrationCompartmentRequest, ChangeMigrationCompartmentResponse>
                    handler);

    /**
     * Moves a resource into a different compartment. When provided, If-Match is checked against ETag values of the resource.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<ChangeMigrationPlanCompartmentResponse>
            changeMigrationPlanCompartment(
                    ChangeMigrationPlanCompartmentRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    ChangeMigrationPlanCompartmentRequest,
                                    ChangeMigrationPlanCompartmentResponse>
                            handler);

    /**
     * Moves a resource into a different compartment. When provided, If-Match is checked against ETag values of the resource.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<ChangeReplicationScheduleCompartmentResponse>
            changeReplicationScheduleCompartment(
                    ChangeReplicationScheduleCompartmentRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    ChangeReplicationScheduleCompartmentRequest,
                                    ChangeReplicationScheduleCompartmentResponse>
                            handler);

    /**
     * Creates a migration.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<CreateMigrationResponse> createMigration(
            CreateMigrationRequest request,
            com.oracle.bmc.responses.AsyncHandler<CreateMigrationRequest, CreateMigrationResponse>
                    handler);

    /**
     * Creates a migration asset.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<CreateMigrationAssetResponse> createMigrationAsset(
            CreateMigrationAssetRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            CreateMigrationAssetRequest, CreateMigrationAssetResponse>
                    handler);

    /**
     * Creates a migration plan.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<CreateMigrationPlanResponse> createMigrationPlan(
            CreateMigrationPlanRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            CreateMigrationPlanRequest, CreateMigrationPlanResponse>
                    handler);

    /**
     * Creates a replication schedule.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<CreateReplicationScheduleResponse> createReplicationSchedule(
            CreateReplicationScheduleRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            CreateReplicationScheduleRequest, CreateReplicationScheduleResponse>
                    handler);

    /**
     * Creates a target asset.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<CreateTargetAssetResponse> createTargetAsset(
            CreateTargetAssetRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            CreateTargetAssetRequest, CreateTargetAssetResponse>
                    handler);

    /**
     * Deletes a migration resource by identifier.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<DeleteMigrationResponse> deleteMigration(
            DeleteMigrationRequest request,
            com.oracle.bmc.responses.AsyncHandler<DeleteMigrationRequest, DeleteMigrationResponse>
                    handler);

    /**
     * Deletes a migration asset resource by an identifier.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<DeleteMigrationAssetResponse> deleteMigrationAsset(
            DeleteMigrationAssetRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            DeleteMigrationAssetRequest, DeleteMigrationAssetResponse>
                    handler);

    /**
     * Deletes a migration plan resource by an identifier.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<DeleteMigrationPlanResponse> deleteMigrationPlan(
            DeleteMigrationPlanRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            DeleteMigrationPlanRequest, DeleteMigrationPlanResponse>
                    handler);

    /**
     * Deletes a replication schedule resource by identifier.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<DeleteReplicationScheduleResponse> deleteReplicationSchedule(
            DeleteReplicationScheduleRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            DeleteReplicationScheduleRequest, DeleteReplicationScheduleResponse>
                    handler);

    /**
     * Deletes a target asset resource by identifier.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<DeleteTargetAssetResponse> deleteTargetAsset(
            DeleteTargetAssetRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            DeleteTargetAssetRequest, DeleteTargetAssetResponse>
                    handler);

    /**
     * Executes the migration plan with the migration plan ID.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<ExecuteMigrationPlanResponse> executeMigrationPlan(
            ExecuteMigrationPlanRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            ExecuteMigrationPlanRequest, ExecuteMigrationPlanResponse>
                    handler);

    /**
     * Exports the migration plan to a csv file.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<ExportMigrationPlanResponse> exportMigrationPlan(
            ExportMigrationPlanRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            ExportMigrationPlanRequest, ExportMigrationPlanResponse>
                    handler);

    /**
     * Gets a migration by identifier.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<GetMigrationResponse> getMigration(
            GetMigrationRequest request,
            com.oracle.bmc.responses.AsyncHandler<GetMigrationRequest, GetMigrationResponse>
                    handler);

    /**
     * Gets a migration asset by identifier.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<GetMigrationAssetResponse> getMigrationAsset(
            GetMigrationAssetRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            GetMigrationAssetRequest, GetMigrationAssetResponse>
                    handler);

    /**
     * Gets a migration plan by identifier.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<GetMigrationPlanResponse> getMigrationPlan(
            GetMigrationPlanRequest request,
            com.oracle.bmc.responses.AsyncHandler<GetMigrationPlanRequest, GetMigrationPlanResponse>
                    handler);

    /**
     * Gets the progress percentage of a migration asset's replication process.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<GetReplicationProgressResponse> getReplicationProgress(
            GetReplicationProgressRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            GetReplicationProgressRequest, GetReplicationProgressResponse>
                    handler);

    /**
     * Gets a replication schedule by identifier.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<GetReplicationScheduleResponse> getReplicationSchedule(
            GetReplicationScheduleRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            GetReplicationScheduleRequest, GetReplicationScheduleResponse>
                    handler);

    /**
     * Gets a target asset by identifier.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<GetTargetAssetResponse> getTargetAsset(
            GetTargetAssetRequest request,
            com.oracle.bmc.responses.AsyncHandler<GetTargetAssetRequest, GetTargetAssetResponse>
                    handler);

    /**
     * Gets the status of the work request with the given ID.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<GetWorkRequestResponse> getWorkRequest(
            GetWorkRequestRequest request,
            com.oracle.bmc.responses.AsyncHandler<GetWorkRequestRequest, GetWorkRequestResponse>
                    handler);

    /**
     * Imports a migration plan from a csv file.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<ImportMigrationPlanResponse> importMigrationPlan(
            ImportMigrationPlanRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            ImportMigrationPlanRequest, ImportMigrationPlanResponse>
                    handler);

    /**
     * List of shapes by parameters.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<ListAvailableShapesResponse> listAvailableShapes(
            ListAvailableShapesRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            ListAvailableShapesRequest, ListAvailableShapesResponse>
                    handler);

    /**
     * Returns a list of migration assets.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<ListMigrationAssetsResponse> listMigrationAssets(
            ListMigrationAssetsRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            ListMigrationAssetsRequest, ListMigrationAssetsResponse>
                    handler);

    /**
     * Returns a list of migration plans.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<ListMigrationPlansResponse> listMigrationPlans(
            ListMigrationPlansRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            ListMigrationPlansRequest, ListMigrationPlansResponse>
                    handler);

    /**
     * Returns a list of migrations.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<ListMigrationsResponse> listMigrations(
            ListMigrationsRequest request,
            com.oracle.bmc.responses.AsyncHandler<ListMigrationsRequest, ListMigrationsResponse>
                    handler);

    /**
     * Returns a list of replication schedules.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<ListReplicationSchedulesResponse> listReplicationSchedules(
            ListReplicationSchedulesRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            ListReplicationSchedulesRequest, ListReplicationSchedulesResponse>
                    handler);

    /**
     * Returns a list of target assets.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<ListTargetAssetsResponse> listTargetAssets(
            ListTargetAssetsRequest request,
            com.oracle.bmc.responses.AsyncHandler<ListTargetAssetsRequest, ListTargetAssetsResponse>
                    handler);

    /**
     * Returns a paginated list of errors for a given work request.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<ListWorkRequestErrorsResponse> listWorkRequestErrors(
            ListWorkRequestErrorsRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            ListWorkRequestErrorsRequest, ListWorkRequestErrorsResponse>
                    handler);

    /**
     * Returns a paginated list of logs for a given work request.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<ListWorkRequestLogsResponse> listWorkRequestLogs(
            ListWorkRequestLogsRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            ListWorkRequestLogsRequest, ListWorkRequestLogsResponse>
                    handler);

    /**
     * List of work requests in a compartment.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<ListWorkRequestsResponse> listWorkRequests(
            ListWorkRequestsRequest request,
            com.oracle.bmc.responses.AsyncHandler<ListWorkRequestsRequest, ListWorkRequestsResponse>
                    handler);

    /**
     * Refreshes migration based on the migration ID.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<RefreshMigrationResponse> refreshMigration(
            RefreshMigrationRequest request,
            com.oracle.bmc.responses.AsyncHandler<RefreshMigrationRequest, RefreshMigrationResponse>
                    handler);

    /**
     * Refreshes the migration asset with the migration asset ID.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<RefreshMigrationAssetResponse> refreshMigrationAsset(
            RefreshMigrationAssetRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            RefreshMigrationAssetRequest, RefreshMigrationAssetResponse>
                    handler);

    /**
     * Refreshes the migration plan with the migration plan ID.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<RefreshMigrationPlanResponse> refreshMigrationPlan(
            RefreshMigrationPlanRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            RefreshMigrationPlanRequest, RefreshMigrationPlanResponse>
                    handler);

    /**
     * Starts replication for the asset with the migration asset ID.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<StartAssetReplicationResponse> startAssetReplication(
            StartAssetReplicationRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            StartAssetReplicationRequest, StartAssetReplicationResponse>
                    handler);

    /**
     * Starts replication for a migration or for some asset.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<StartMigrationReplicationResponse> startMigrationReplication(
            StartMigrationReplicationRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            StartMigrationReplicationRequest, StartMigrationReplicationResponse>
                    handler);

    /**
     * Updates the migration.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<UpdateMigrationResponse> updateMigration(
            UpdateMigrationRequest request,
            com.oracle.bmc.responses.AsyncHandler<UpdateMigrationRequest, UpdateMigrationResponse>
                    handler);

    /**
     * Updates the migration asset.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<UpdateMigrationAssetResponse> updateMigrationAsset(
            UpdateMigrationAssetRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            UpdateMigrationAssetRequest, UpdateMigrationAssetResponse>
                    handler);

    /**
     * Updates the migration plan.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<UpdateMigrationPlanResponse> updateMigrationPlan(
            UpdateMigrationPlanRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            UpdateMigrationPlanRequest, UpdateMigrationPlanResponse>
                    handler);

    /**
     * Updates the replication schedule.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<UpdateReplicationScheduleResponse> updateReplicationSchedule(
            UpdateReplicationScheduleRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            UpdateReplicationScheduleRequest, UpdateReplicationScheduleResponse>
                    handler);

    /**
     * Updates the target asset.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<UpdateTargetAssetResponse> updateTargetAsset(
            UpdateTargetAssetRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            UpdateTargetAssetRequest, UpdateTargetAssetResponse>
                    handler);
}

/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.fusionapps;

import com.oracle.bmc.fusionapps.requests.*;
import com.oracle.bmc.fusionapps.responses.*;

/**
 * Use the Fusion Applications Environment Management API to manage the environments where your Fusion Applications run. For more information, see the [Fusion Applications Environment Management documentation](https://docs.cloud.oracle.com/iaas/Content/Identity/fusion-applications/home.htm).
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20211201")
public interface FusionApplicationsAsync extends AutoCloseable {

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
     * Moves a FusionEnvironment into a different compartment. When provided, If-Match is checked against ETag
     * values of the resource.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<ChangeFusionEnvironmentCompartmentResponse>
            changeFusionEnvironmentCompartment(
                    ChangeFusionEnvironmentCompartmentRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    ChangeFusionEnvironmentCompartmentRequest,
                                    ChangeFusionEnvironmentCompartmentResponse>
                            handler);

    /**
     * Moves a FusionEnvironmentFamily into a different compartment. When provided, If-Match is checked against ETag
     * values of the resource.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<ChangeFusionEnvironmentFamilyCompartmentResponse>
            changeFusionEnvironmentFamilyCompartment(
                    ChangeFusionEnvironmentFamilyCompartmentRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    ChangeFusionEnvironmentFamilyCompartmentRequest,
                                    ChangeFusionEnvironmentFamilyCompartmentResponse>
                            handler);

    /**
     * Creates a new DataMaskingActivity.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<CreateDataMaskingActivityResponse> createDataMaskingActivity(
            CreateDataMaskingActivityRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            CreateDataMaskingActivityRequest, CreateDataMaskingActivityResponse>
                    handler);

    /**
     * Creates a new FusionEnvironment.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<CreateFusionEnvironmentResponse> createFusionEnvironment(
            CreateFusionEnvironmentRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            CreateFusionEnvironmentRequest, CreateFusionEnvironmentResponse>
                    handler);

    /**
     * Create a FusionEnvironment admin user
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<CreateFusionEnvironmentAdminUserResponse>
            createFusionEnvironmentAdminUser(
                    CreateFusionEnvironmentAdminUserRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    CreateFusionEnvironmentAdminUserRequest,
                                    CreateFusionEnvironmentAdminUserResponse>
                            handler);

    /**
     * Creates a new FusionEnvironmentFamily.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<CreateFusionEnvironmentFamilyResponse>
            createFusionEnvironmentFamily(
                    CreateFusionEnvironmentFamilyRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    CreateFusionEnvironmentFamilyRequest,
                                    CreateFusionEnvironmentFamilyResponse>
                            handler);

    /**
     * Creates a new RefreshActivity.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<CreateRefreshActivityResponse> createRefreshActivity(
            CreateRefreshActivityRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            CreateRefreshActivityRequest, CreateRefreshActivityResponse>
                    handler);

    /**
     * Deletes the Fusion environment identified by it's OCID.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<DeleteFusionEnvironmentResponse> deleteFusionEnvironment(
            DeleteFusionEnvironmentRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            DeleteFusionEnvironmentRequest, DeleteFusionEnvironmentResponse>
                    handler);

    /**
     * Deletes the FusionEnvironment administrator user identified by the username.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<DeleteFusionEnvironmentAdminUserResponse>
            deleteFusionEnvironmentAdminUser(
                    DeleteFusionEnvironmentAdminUserRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    DeleteFusionEnvironmentAdminUserRequest,
                                    DeleteFusionEnvironmentAdminUserResponse>
                            handler);

    /**
     * Deletes a FusionEnvironmentFamily resource by identifier
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<DeleteFusionEnvironmentFamilyResponse>
            deleteFusionEnvironmentFamily(
                    DeleteFusionEnvironmentFamilyRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    DeleteFusionEnvironmentFamilyRequest,
                                    DeleteFusionEnvironmentFamilyResponse>
                            handler);

    /**
     * Gets a DataMaskingActivity by identifier
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<GetDataMaskingActivityResponse> getDataMaskingActivity(
            GetDataMaskingActivityRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            GetDataMaskingActivityRequest, GetDataMaskingActivityResponse>
                    handler);

    /**
     * Gets a FusionEnvironment by identifier
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<GetFusionEnvironmentResponse> getFusionEnvironment(
            GetFusionEnvironmentRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            GetFusionEnvironmentRequest, GetFusionEnvironmentResponse>
                    handler);

    /**
     * Retrieves a fusion environment family identified by its OCID.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<GetFusionEnvironmentFamilyResponse> getFusionEnvironmentFamily(
            GetFusionEnvironmentFamilyRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            GetFusionEnvironmentFamilyRequest, GetFusionEnvironmentFamilyResponse>
                    handler);

    /**
     * Gets the number of environments (usage) of each type in the fusion environment family, as well as the limit that's allowed to be created based on the group's associated subscriptions.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<GetFusionEnvironmentFamilyLimitsAndUsageResponse>
            getFusionEnvironmentFamilyLimitsAndUsage(
                    GetFusionEnvironmentFamilyLimitsAndUsageRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    GetFusionEnvironmentFamilyLimitsAndUsageRequest,
                                    GetFusionEnvironmentFamilyLimitsAndUsageResponse>
                            handler);

    /**
     * Gets the subscription details of an fusion environment family.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<GetFusionEnvironmentFamilySubscriptionDetailResponse>
            getFusionEnvironmentFamilySubscriptionDetail(
                    GetFusionEnvironmentFamilySubscriptionDetailRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    GetFusionEnvironmentFamilySubscriptionDetailRequest,
                                    GetFusionEnvironmentFamilySubscriptionDetailResponse>
                            handler);

    /**
     * Gets the status of a Fusion environment identified by its OCID.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<GetFusionEnvironmentStatusResponse> getFusionEnvironmentStatus(
            GetFusionEnvironmentStatusRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            GetFusionEnvironmentStatusRequest, GetFusionEnvironmentStatusResponse>
                    handler);

    /**
     * Gets a RefreshActivity by identifier
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<GetRefreshActivityResponse> getRefreshActivity(
            GetRefreshActivityRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            GetRefreshActivityRequest, GetRefreshActivityResponse>
                    handler);

    /**
     * Gets a ScheduledActivity by identifier
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<GetScheduledActivityResponse> getScheduledActivity(
            GetScheduledActivityRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            GetScheduledActivityRequest, GetScheduledActivityResponse>
                    handler);

    /**
     * Gets a Service Attachment by identifier
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<GetServiceAttachmentResponse> getServiceAttachment(
            GetServiceAttachmentRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            GetServiceAttachmentRequest, GetServiceAttachmentResponse>
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
     * List all FusionEnvironment admin users
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<ListAdminUsersResponse> listAdminUsers(
            ListAdminUsersRequest request,
            com.oracle.bmc.responses.AsyncHandler<ListAdminUsersRequest, ListAdminUsersResponse>
                    handler);

    /**
     * Returns a list of DataMaskingActivities.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<ListDataMaskingActivitiesResponse> listDataMaskingActivities(
            ListDataMaskingActivitiesRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            ListDataMaskingActivitiesRequest, ListDataMaskingActivitiesResponse>
                    handler);

    /**
     * Returns a list of FusionEnvironmentFamilies.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<ListFusionEnvironmentFamiliesResponse>
            listFusionEnvironmentFamilies(
                    ListFusionEnvironmentFamiliesRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    ListFusionEnvironmentFamiliesRequest,
                                    ListFusionEnvironmentFamiliesResponse>
                            handler);

    /**
     * Returns a list of FusionEnvironments.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<ListFusionEnvironmentsResponse> listFusionEnvironments(
            ListFusionEnvironmentsRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            ListFusionEnvironmentsRequest, ListFusionEnvironmentsResponse>
                    handler);

    /**
     * Returns a list of RefreshActivities.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<ListRefreshActivitiesResponse> listRefreshActivities(
            ListRefreshActivitiesRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            ListRefreshActivitiesRequest, ListRefreshActivitiesResponse>
                    handler);

    /**
     * Returns a list of ScheduledActivities.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<ListScheduledActivitiesResponse> listScheduledActivities(
            ListScheduledActivitiesRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            ListScheduledActivitiesRequest, ListScheduledActivitiesResponse>
                    handler);

    /**
     * Returns a list of service attachments.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<ListServiceAttachmentsResponse> listServiceAttachments(
            ListServiceAttachmentsRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            ListServiceAttachmentsRequest, ListServiceAttachmentsResponse>
                    handler);

    /**
     * Gets available refresh time for this fusion environment
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<ListTimeAvailableForRefreshesResponse>
            listTimeAvailableForRefreshes(
                    ListTimeAvailableForRefreshesRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    ListTimeAvailableForRefreshesRequest,
                                    ListTimeAvailableForRefreshesResponse>
                            handler);

    /**
     * Return a (paginated) list of errors for a given work request.
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
     * Return a (paginated) list of logs for a given work request.
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
     * Lists the work requests in a compartment.
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
     * Resets the password of the Fusion Environment Administrator.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<ResetFusionEnvironmentPasswordResponse>
            resetFusionEnvironmentPassword(
                    ResetFusionEnvironmentPasswordRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    ResetFusionEnvironmentPasswordRequest,
                                    ResetFusionEnvironmentPasswordResponse>
                            handler);

    /**
     * Updates the FusionEnvironment
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<UpdateFusionEnvironmentResponse> updateFusionEnvironment(
            UpdateFusionEnvironmentRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            UpdateFusionEnvironmentRequest, UpdateFusionEnvironmentResponse>
                    handler);

    /**
     * Updates the FusionEnvironmentFamily
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<UpdateFusionEnvironmentFamilyResponse>
            updateFusionEnvironmentFamily(
                    UpdateFusionEnvironmentFamilyRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    UpdateFusionEnvironmentFamilyRequest,
                                    UpdateFusionEnvironmentFamilyResponse>
                            handler);
}

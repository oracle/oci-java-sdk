/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.usageapi;

import com.oracle.bmc.usageapi.requests.*;
import com.oracle.bmc.usageapi.responses.*;

/**
 * Use the Usage API to view your Oracle Cloud usage and costs. The API allows you to request data that meets the specified filter criteria, and to group that data by the chosen dimension. The Usage API is used by the Cost Analysis and Carbon Emissions Analysis tools in the Console. See [Cost Analysis Overview](https://docs.cloud.oracle.com/Content/Billing/Concepts/costanalysisoverview.htm) and [Using the Usage API](https://docs.cloud.oracle.com/Content/Billing/Concepts/costanalysisoverview.htm#cost_analysis_using_the_api) for more information.
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200107")
public interface UsageapiAsync extends AutoCloseable {

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
     * Determines whether realm specific endpoint should be used or not.
     * Set realmSpecificEndpointTemplateEnabled to "true" if the user wants to enable use of realm specific endpoint template, otherwise set it to "false"
     * @param realmSpecificEndpointTemplateEnabled flag to enable the use of realm specific endpoint template
     */
    void useRealmSpecificEndpointTemplate(boolean realmSpecificEndpointTemplateEnabled);

    /**
     * Returns the created custom table.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<CreateCustomTableResponse> createCustomTable(
            CreateCustomTableRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            CreateCustomTableRequest, CreateCustomTableResponse>
                    handler);

    /**
     * Add a list of email recipients that can receive usage statements for the subscription.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<CreateEmailRecipientsGroupResponse> createEmailRecipientsGroup(
            CreateEmailRecipientsGroupRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            CreateEmailRecipientsGroupRequest, CreateEmailRecipientsGroupResponse>
                    handler);

    /**
     * Returns the created query.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<CreateQueryResponse> createQuery(
            CreateQueryRequest request,
            com.oracle.bmc.responses.AsyncHandler<CreateQueryRequest, CreateQueryResponse> handler);

    /**
     * Returns the created schedule.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<CreateScheduleResponse> createSchedule(
            CreateScheduleRequest request,
            com.oracle.bmc.responses.AsyncHandler<CreateScheduleRequest, CreateScheduleResponse>
                    handler);

    /**
     * Returns the created usage carbon emissions query.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<CreateUsageCarbonEmissionsQueryResponse>
            createUsageCarbonEmissionsQuery(
                    CreateUsageCarbonEmissionsQueryRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    CreateUsageCarbonEmissionsQueryRequest,
                                    CreateUsageCarbonEmissionsQueryResponse>
                            handler);

    /**
     * Delete a saved custom table by the OCID.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<DeleteCustomTableResponse> deleteCustomTable(
            DeleteCustomTableRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            DeleteCustomTableRequest, DeleteCustomTableResponse>
                    handler);

    /**
     * Delete the email recipients group for the usage statement subscription.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<DeleteEmailRecipientsGroupResponse> deleteEmailRecipientsGroup(
            DeleteEmailRecipientsGroupRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            DeleteEmailRecipientsGroupRequest, DeleteEmailRecipientsGroupResponse>
                    handler);

    /**
     * Delete a saved query by the OCID.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<DeleteQueryResponse> deleteQuery(
            DeleteQueryRequest request,
            com.oracle.bmc.responses.AsyncHandler<DeleteQueryRequest, DeleteQueryResponse> handler);

    /**
     * Delete a saved scheduled report by the OCID.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<DeleteScheduleResponse> deleteSchedule(
            DeleteScheduleRequest request,
            com.oracle.bmc.responses.AsyncHandler<DeleteScheduleRequest, DeleteScheduleResponse>
                    handler);

    /**
     * Delete a usage carbon emissions saved query by the OCID.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<DeleteUsageCarbonEmissionsQueryResponse>
            deleteUsageCarbonEmissionsQuery(
                    DeleteUsageCarbonEmissionsQueryRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    DeleteUsageCarbonEmissionsQueryRequest,
                                    DeleteUsageCarbonEmissionsQueryResponse>
                            handler);

    /**
     * Returns the saved custom table.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<GetCustomTableResponse> getCustomTable(
            GetCustomTableRequest request,
            com.oracle.bmc.responses.AsyncHandler<GetCustomTableRequest, GetCustomTableResponse>
                    handler);

    /**
     * Return the saved usage statement email recipient group.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<GetEmailRecipientsGroupResponse> getEmailRecipientsGroup(
            GetEmailRecipientsGroupRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            GetEmailRecipientsGroupRequest, GetEmailRecipientsGroupResponse>
                    handler);

    /**
     * Returns the saved query.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<GetQueryResponse> getQuery(
            GetQueryRequest request,
            com.oracle.bmc.responses.AsyncHandler<GetQueryRequest, GetQueryResponse> handler);

    /**
     * Returns the saved schedule.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<GetScheduleResponse> getSchedule(
            GetScheduleRequest request,
            com.oracle.bmc.responses.AsyncHandler<GetScheduleRequest, GetScheduleResponse> handler);

    /**
     * Returns the saved schedule run.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<GetScheduledRunResponse> getScheduledRun(
            GetScheduledRunRequest request,
            com.oracle.bmc.responses.AsyncHandler<GetScheduledRunRequest, GetScheduledRunResponse>
                    handler);

    /**
     * Returns the usage carbon emissions saved query.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<GetUsageCarbonEmissionsQueryResponse> getUsageCarbonEmissionsQuery(
            GetUsageCarbonEmissionsQueryRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            GetUsageCarbonEmissionsQueryRequest,
                            GetUsageCarbonEmissionsQueryResponse>
                    handler);

    /**
     * Returns the saved custom table list.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<ListCustomTablesResponse> listCustomTables(
            ListCustomTablesRequest request,
            com.oracle.bmc.responses.AsyncHandler<ListCustomTablesRequest, ListCustomTablesResponse>
                    handler);

    /**
     * Return the saved usage statement email recipient group.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<ListEmailRecipientsGroupsResponse> listEmailRecipientsGroups(
            ListEmailRecipientsGroupsRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            ListEmailRecipientsGroupsRequest, ListEmailRecipientsGroupsResponse>
                    handler);

    /**
     * Returns the saved query list.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<ListQueriesResponse> listQueries(
            ListQueriesRequest request,
            com.oracle.bmc.responses.AsyncHandler<ListQueriesRequest, ListQueriesResponse> handler);

    /**
     * Returns schedule history list.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<ListScheduledRunsResponse> listScheduledRuns(
            ListScheduledRunsRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            ListScheduledRunsRequest, ListScheduledRunsResponse>
                    handler);

    /**
     * Returns the saved schedule list.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<ListSchedulesResponse> listSchedules(
            ListSchedulesRequest request,
            com.oracle.bmc.responses.AsyncHandler<ListSchedulesRequest, ListSchedulesResponse>
                    handler);

    /**
     * Returns the usage carbon emissions saved query list.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<ListUsageCarbonEmissionsQueriesResponse>
            listUsageCarbonEmissionsQueries(
                    ListUsageCarbonEmissionsQueriesRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    ListUsageCarbonEmissionsQueriesRequest,
                                    ListUsageCarbonEmissionsQueriesResponse>
                            handler);

    /**
     * Returns the average carbon emissions summary by SKU.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<RequestAverageCarbonEmissionResponse> requestAverageCarbonEmission(
            RequestAverageCarbonEmissionRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            RequestAverageCarbonEmissionRequest,
                            RequestAverageCarbonEmissionResponse>
                    handler);

    /**
     * Returns the clean energy usage summary by region.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<RequestCleanEnergyUsageResponse> requestCleanEnergyUsage(
            RequestCleanEnergyUsageRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            RequestCleanEnergyUsageRequest, RequestCleanEnergyUsageResponse>
                    handler);

    /**
     * Returns the configurations list for the UI drop-down list.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<RequestSummarizedConfigurationsResponse>
            requestSummarizedConfigurations(
                    RequestSummarizedConfigurationsRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    RequestSummarizedConfigurationsRequest,
                                    RequestSummarizedConfigurationsResponse>
                            handler);

    /**
     * Returns usage for the given account.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<RequestSummarizedUsagesResponse> requestSummarizedUsages(
            RequestSummarizedUsagesRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            RequestSummarizedUsagesRequest, RequestSummarizedUsagesResponse>
                    handler);

    /**
     * Returns the configuration list for the UI drop-down list of carbon emission console.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<RequestUsageCarbonEmissionConfigResponse>
            requestUsageCarbonEmissionConfig(
                    RequestUsageCarbonEmissionConfigRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    RequestUsageCarbonEmissionConfigRequest,
                                    RequestUsageCarbonEmissionConfigResponse>
                            handler);

    /**
     * Returns usage carbon emission for the given account.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<RequestUsageCarbonEmissionsResponse> requestUsageCarbonEmissions(
            RequestUsageCarbonEmissionsRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            RequestUsageCarbonEmissionsRequest, RequestUsageCarbonEmissionsResponse>
                    handler);

    /**
     * Update a saved custom table by table id.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<UpdateCustomTableResponse> updateCustomTable(
            UpdateCustomTableRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            UpdateCustomTableRequest, UpdateCustomTableResponse>
                    handler);

    /**
     * Update a saved email recipients group.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<UpdateEmailRecipientsGroupResponse> updateEmailRecipientsGroup(
            UpdateEmailRecipientsGroupRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            UpdateEmailRecipientsGroupRequest, UpdateEmailRecipientsGroupResponse>
                    handler);

    /**
     * Update a saved query by the OCID.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<UpdateQueryResponse> updateQuery(
            UpdateQueryRequest request,
            com.oracle.bmc.responses.AsyncHandler<UpdateQueryRequest, UpdateQueryResponse> handler);

    /**
     * Update a saved schedule
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<UpdateScheduleResponse> updateSchedule(
            UpdateScheduleRequest request,
            com.oracle.bmc.responses.AsyncHandler<UpdateScheduleRequest, UpdateScheduleResponse>
                    handler);

    /**
     * Update a usage carbon emissions saved query by the OCID.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<UpdateUsageCarbonEmissionsQueryResponse>
            updateUsageCarbonEmissionsQuery(
                    UpdateUsageCarbonEmissionsQueryRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    UpdateUsageCarbonEmissionsQueryRequest,
                                    UpdateUsageCarbonEmissionsQueryResponse>
                            handler);
}

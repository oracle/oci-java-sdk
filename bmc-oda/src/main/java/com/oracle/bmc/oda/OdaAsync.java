/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.oda;

import com.oracle.bmc.oda.requests.*;
import com.oracle.bmc.oda.responses.*;

/** API to create and maintain Oracle Digital Assistant service instances. */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20190506")
public interface OdaAsync extends AutoCloseable {

    /** Rebuilds the client from scratch. Useful to refresh certificates. */
    void refreshClient();

    /**
     * Sets the endpoint to call (ex, https://www.example.com).
     *
     * @param endpoint The endpoint of the serice.
     */
    void setEndpoint(String endpoint);

    /** Gets the set endpoint for REST call (ex, https://www.example.com) */
    String getEndpoint();

    /**
     * Sets the region to call (ex, Region.US_PHOENIX_1).
     *
     * <p>Note, this will call {@link #setEndpoint(String) setEndpoint} after resolving the
     * endpoint. If the service is not available in this region, however, an
     * IllegalArgumentException will be raised.
     *
     * @param region The region of the service.
     */
    void setRegion(com.oracle.bmc.Region region);

    /**
     * Sets the region to call (ex, 'us-phoenix-1').
     *
     * <p>Note, this will first try to map the region ID to a known Region and call {@link
     * #setRegion(Region) setRegion}.
     *
     * <p>If no known Region could be determined, it will create an endpoint based on the default
     * endpoint format ({@link com.oracle.bmc.Region#formatDefaultRegionEndpoint(Service, String)}
     * and then call {@link #setEndpoint(String) setEndpoint}.
     *
     * @param regionId The public region ID.
     */
    void setRegion(String regionId);

    /**
     * Determines whether realm specific endpoint should be used or not. Set
     * realmSpecificEndpointTemplateEnabled to "true" if the user wants to enable use of realm
     * specific endpoint template, otherwise set it to "false"
     *
     * @param realmSpecificEndpointTemplateEnabled flag to enable the use of realm specific endpoint
     *     template
     */
    void useRealmSpecificEndpointTemplate(boolean realmSpecificEndpointTemplateEnabled);

    /**
     * Moves an Digital Assistant instance into a different compartment. When provided, If-Match is
     * checked against ETag values of the resource.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ChangeOdaInstanceCompartmentResponse> changeOdaInstanceCompartment(
            ChangeOdaInstanceCompartmentRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            ChangeOdaInstanceCompartmentRequest,
                            ChangeOdaInstanceCompartmentResponse>
                    handler);

    /**
     * Starts an asynchronous job to create a Digital Assistant instance.
     *
     * <p>To monitor the status of the job, take the `opc-work-request-id` response header value and
     * use it to call `GET /workRequests/{workRequestId}`.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<CreateOdaInstanceResponse> createOdaInstance(
            CreateOdaInstanceRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            CreateOdaInstanceRequest, CreateOdaInstanceResponse>
                    handler);

    /**
     * Starts an asynchronous job to create a Digital Assistant instance attachment.
     *
     * <p>To monitor the status of the job, take the `opc-work-request-id` response header value and
     * use it to call `GET /workRequests/{workRequestId}`.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<CreateOdaInstanceAttachmentResponse> createOdaInstanceAttachment(
            CreateOdaInstanceAttachmentRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            CreateOdaInstanceAttachmentRequest, CreateOdaInstanceAttachmentResponse>
                    handler);

    /**
     * Starts an asynchronous job to delete the specified Digital Assistant instance. To monitor the
     * status of the job, take the `opc-work-request-id` response header value and use it to call
     * `GET /workRequests/{workRequestId}`.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<DeleteOdaInstanceResponse> deleteOdaInstance(
            DeleteOdaInstanceRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            DeleteOdaInstanceRequest, DeleteOdaInstanceResponse>
                    handler);

    /**
     * Starts an asynchronous job to delete the specified Digital Assistant instance attachment.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<DeleteOdaInstanceAttachmentResponse> deleteOdaInstanceAttachment(
            DeleteOdaInstanceAttachmentRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            DeleteOdaInstanceAttachmentRequest, DeleteOdaInstanceAttachmentResponse>
                    handler);

    /**
     * Gets the specified Digital Assistant instance.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<GetOdaInstanceResponse> getOdaInstance(
            GetOdaInstanceRequest request,
            com.oracle.bmc.responses.AsyncHandler<GetOdaInstanceRequest, GetOdaInstanceResponse>
                    handler);

    /**
     * Gets an ODA instance attachment by identifier
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<GetOdaInstanceAttachmentResponse> getOdaInstanceAttachment(
            GetOdaInstanceAttachmentRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            GetOdaInstanceAttachmentRequest, GetOdaInstanceAttachmentResponse>
                    handler);

    /**
     * Gets information about the work request with the specified ID, including its status.
     *
     * <p>You can use this operation to monitor the status of jobs that you requested to create,
     * delete, and update instances.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<GetWorkRequestResponse> getWorkRequest(
            GetWorkRequestRequest request,
            com.oracle.bmc.responses.AsyncHandler<GetWorkRequestRequest, GetWorkRequestResponse>
                    handler);

    /**
     * Returns a list of ODA instance attachments
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ListOdaInstanceAttachmentsResponse> listOdaInstanceAttachments(
            ListOdaInstanceAttachmentsRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            ListOdaInstanceAttachmentsRequest, ListOdaInstanceAttachmentsResponse>
                    handler);

    /**
     * Returns a page of Digital Assistant instances that belong to the specified compartment.
     *
     * <p>If the `opc-next-page` header appears in the response, then there are more items to
     * retrieve. To get the next page in the subsequent GET request, include the header's value as
     * the `page` query parameter.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ListOdaInstancesResponse> listOdaInstances(
            ListOdaInstancesRequest request,
            com.oracle.bmc.responses.AsyncHandler<ListOdaInstancesRequest, ListOdaInstancesResponse>
                    handler);

    /**
     * Returns a page of errors for the specified work request.
     *
     * <p>If the `opc-next-page` header appears in the response, then there are more items to
     * retrieve. To get the next page in the subsequent GET request, include the header's value as
     * the `page` query parameter.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ListWorkRequestErrorsResponse> listWorkRequestErrors(
            ListWorkRequestErrorsRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            ListWorkRequestErrorsRequest, ListWorkRequestErrorsResponse>
                    handler);

    /**
     * Returns a page of of log messages for a given work request.
     *
     * <p>If the `opc-next-page` header appears in the response, then there are more items to
     * retrieve. To get the next page in the subsequent GET request, include the header's value as
     * the `page` query parameter.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ListWorkRequestLogsResponse> listWorkRequestLogs(
            ListWorkRequestLogsRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            ListWorkRequestLogsRequest, ListWorkRequestLogsResponse>
                    handler);

    /**
     * Returns a page of work requests for the specified compartment.
     *
     * <p>If the `opc-next-page` header appears in the response, then there are more items to
     * retrieve. To get the next page in the subsequent GET request, include the header's value as
     * the `page` query parameter.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ListWorkRequestsResponse> listWorkRequests(
            ListWorkRequestsRequest request,
            com.oracle.bmc.responses.AsyncHandler<ListWorkRequestsRequest, ListWorkRequestsResponse>
                    handler);

    /**
     * Starts an inactive Digital Assistant instance. Once active, the instance will be accessible
     * and metering of requests will be started again.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<StartOdaInstanceResponse> startOdaInstance(
            StartOdaInstanceRequest request,
            com.oracle.bmc.responses.AsyncHandler<StartOdaInstanceRequest, StartOdaInstanceResponse>
                    handler);

    /**
     * Stops an active Digital Assistant instance. Once inactive, the instance will not be
     * accessible and metering of requests will be stopped until the instance is started again. Data
     * associated with the instance is not affected.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<StopOdaInstanceResponse> stopOdaInstance(
            StopOdaInstanceRequest request,
            com.oracle.bmc.responses.AsyncHandler<StopOdaInstanceRequest, StopOdaInstanceResponse>
                    handler);

    /**
     * Updates the specified Digital Assistant instance with the information in the request body.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<UpdateOdaInstanceResponse> updateOdaInstance(
            UpdateOdaInstanceRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            UpdateOdaInstanceRequest, UpdateOdaInstanceResponse>
                    handler);

    /**
     * Updates the ODA instance attachment
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<UpdateOdaInstanceAttachmentResponse> updateOdaInstanceAttachment(
            UpdateOdaInstanceAttachmentRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            UpdateOdaInstanceAttachmentRequest, UpdateOdaInstanceAttachmentResponse>
                    handler);
}

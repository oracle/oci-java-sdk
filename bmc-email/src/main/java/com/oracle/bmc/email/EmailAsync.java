/**
 * Copyright (c) 2016, 2018, Oracle and/or its affiliates. All rights reserved.
 */
package com.oracle.bmc.email;

import com.oracle.bmc.email.requests.*;
import com.oracle.bmc.email.responses.*;

@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20170907")
public interface EmailAsync extends AutoCloseable {

    /**
     * Sets the endpoint to call (ex, https://www.example.com).
     * @param endpoint The endpoint of the serice.
     */
    void setEndpoint(String endpoint);

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
     * Creates a sender for a tenancy in a given compartment.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<CreateSenderResponse> createSender(
            CreateSenderRequest request,
            com.oracle.bmc.responses.AsyncHandler<CreateSenderRequest, CreateSenderResponse>
                    handler);

    /**
     * Adds recipient email addresses to the suppression list for a tenancy.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<CreateSuppressionResponse> createSuppression(
            CreateSuppressionRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            CreateSuppressionRequest, CreateSuppressionResponse>
                    handler);

    /**
     * Deletes an approved sender for a tenancy in a given compartment for a
     * provided `senderId`.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<DeleteSenderResponse> deleteSender(
            DeleteSenderRequest request,
            com.oracle.bmc.responses.AsyncHandler<DeleteSenderRequest, DeleteSenderResponse>
                    handler);

    /**
     * Removes a suppressed recipient email address from the suppression list
     * for a tenancy in a given compartment for a provided `suppressionId`.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<DeleteSuppressionResponse> deleteSuppression(
            DeleteSuppressionRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            DeleteSuppressionRequest, DeleteSuppressionResponse>
                    handler);

    /**
     * Gets an approved sender for a given `senderId`.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<GetSenderResponse> getSender(
            GetSenderRequest request,
            com.oracle.bmc.responses.AsyncHandler<GetSenderRequest, GetSenderResponse> handler);

    /**
     * Gets the details of a suppressed recipient email address for a given
     * `suppressionId`. Each suppression is given a unique OCID.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<GetSuppressionResponse> getSuppression(
            GetSuppressionRequest request,
            com.oracle.bmc.responses.AsyncHandler<GetSuppressionRequest, GetSuppressionResponse>
                    handler);

    /**
     * Gets a collection of approved sender email addresses and sender IDs.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<ListSendersResponse> listSenders(
            ListSendersRequest request,
            com.oracle.bmc.responses.AsyncHandler<ListSendersRequest, ListSendersResponse> handler);

    /**
     * Gets a list of suppressed recipient email addresses for a user. The
     * `compartmentId` for suppressions must be a tenancy OCID. The returned list
     * is sorted by creation time in descending order.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<ListSuppressionsResponse> listSuppressions(
            ListSuppressionsRequest request,
            com.oracle.bmc.responses.AsyncHandler<ListSuppressionsRequest, ListSuppressionsResponse>
                    handler);
}

/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.announcementsservice;

import com.oracle.bmc.announcementsservice.requests.*;
import com.oracle.bmc.announcementsservice.responses.*;

/**
 * Manage Oracle Cloud Infrastructure console announcements.
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 0.0.1")
public interface AnnouncementsPreferencesAsync extends AutoCloseable {

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
     * Creates a request that specifies preferences for the tenancy regarding receiving announcements by email.
     * <p>
     * This call is subject to an Announcements limit that applies to the total number of requests across all read or write operations. Announcements might throttle this call to reject an otherwise valid request when the total rate of operations exceeds 20 requests per second for a given user. The service might also throttle this call to reject an otherwise valid request when the total rate of operations exceeds 100 requests per second for a given tenancy.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<CreateAnnouncementsPreferenceResponse>
            createAnnouncementsPreference(
                    CreateAnnouncementsPreferenceRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    CreateAnnouncementsPreferenceRequest,
                                    CreateAnnouncementsPreferenceResponse>
                            handler);

    /**
     * Gets the current preferences of the tenancy regarding receiving announcements by email.
     * <p>
     * This call is subject to an Announcements limit that applies to the total number of requests across all read or write operations. Announcements might throttle this call to reject an otherwise valid request when the total rate of operations exceeds 20 requests per second for a given user. The service might also throttle this call to reject an otherwise valid request when the total rate of operations exceeds 100 requests per second for a given tenancy.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<GetAnnouncementsPreferenceResponse> getAnnouncementsPreference(
            GetAnnouncementsPreferenceRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            GetAnnouncementsPreferenceRequest, GetAnnouncementsPreferenceResponse>
                    handler);

    /**
     * Gets the current preferences of the tenancy regarding receiving announcements by email.
     * <p>
     * This call is subject to an Announcements limit that applies to the total number of requests across all read or write operations. Announcements might throttle this call to reject an otherwise valid request when the total rate of operations exceeds 20 requests per second for a given user. The service might also throttle this call to reject an otherwise valid request when the total rate of operations exceeds 100 requests per second for a given tenancy.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<ListAnnouncementsPreferencesResponse> listAnnouncementsPreferences(
            ListAnnouncementsPreferencesRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            ListAnnouncementsPreferencesRequest,
                            ListAnnouncementsPreferencesResponse>
                    handler);

    /**
     * Updates the preferences of the tenancy regarding receiving announcements by email.
     * <p>
     * This call is subject to an Announcements limit that applies to the total number of requests across all read or write operations. Announcements might throttle this call to reject an otherwise valid request when the total rate of operations exceeds 20 requests per second for a given user. The service might also throttle this call to reject an otherwise valid request when the total rate of operations exceeds 100 requests per second for a given tenancy.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<UpdateAnnouncementsPreferenceResponse>
            updateAnnouncementsPreference(
                    UpdateAnnouncementsPreferenceRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    UpdateAnnouncementsPreferenceRequest,
                                    UpdateAnnouncementsPreferenceResponse>
                            handler);
}

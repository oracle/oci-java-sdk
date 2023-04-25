/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.announcementsservice;

import com.oracle.bmc.announcementsservice.requests.*;
import com.oracle.bmc.announcementsservice.responses.*;

/** Manage Oracle Cloud Infrastructure console announcements. */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 0.0.1")
public interface AnnouncementAsync extends AutoCloseable {

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
     * Gets the details of a specific announcement.
     *
     * <p>This call is subject to an Announcements limit that applies to the total number of
     * requests across all read or write operations. Announcements might throttle this call to
     * reject an otherwise valid request when the total rate of operations exceeds 20 requests per
     * second for a given user. The service might also throttle this call to reject an otherwise
     * valid request when the total rate of operations exceeds 100 requests per second for a given
     * tenancy.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<GetAnnouncementResponse> getAnnouncement(
            GetAnnouncementRequest request,
            com.oracle.bmc.responses.AsyncHandler<GetAnnouncementRequest, GetAnnouncementResponse>
                    handler);

    /**
     * Gets information about whether a specific announcement was acknowledged by a user.
     *
     * <p>This call is subject to an Announcements limit that applies to the total number of
     * requests across all read or write operations. Announcements might throttle this call to
     * reject an otherwise valid request when the total rate of operations exceeds 20 requests per
     * second for a given user. The service might also throttle this call to reject an otherwise
     * valid request when the total rate of operations exceeds 100 requests per second for a given
     * tenancy.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<GetAnnouncementUserStatusResponse> getAnnouncementUserStatus(
            GetAnnouncementUserStatusRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            GetAnnouncementUserStatusRequest, GetAnnouncementUserStatusResponse>
                    handler);

    /**
     * Gets a list of announcements for the current tenancy.
     *
     * <p>This call is subject to an Announcements limit that applies to the total number of
     * requests across all read or write operations. Announcements might throttle this call to
     * reject an otherwise valid request when the total rate of operations exceeds 20 requests per
     * second for a given user. The service might also throttle this call to reject an otherwise
     * valid request when the total rate of operations exceeds 100 requests per second for a given
     * tenancy.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ListAnnouncementsResponse> listAnnouncements(
            ListAnnouncementsRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            ListAnnouncementsRequest, ListAnnouncementsResponse>
                    handler);

    /**
     * Updates the status of the specified announcement with regard to whether it has been marked as
     * read.
     *
     * <p>This call is subject to an Announcements limit that applies to the total number of
     * requests across all read or write operations. Announcements might throttle this call to
     * reject an otherwise valid request when the total rate of operations exceeds 20 requests per
     * second for a given user. The service might also throttle this call to reject an otherwise
     * valid request when the total rate of operations exceeds 100 requests per second for a given
     * tenancy.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<UpdateAnnouncementUserStatusResponse> updateAnnouncementUserStatus(
            UpdateAnnouncementUserStatusRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            UpdateAnnouncementUserStatusRequest,
                            UpdateAnnouncementUserStatusResponse>
                    handler);
}

/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.mediaservices;

import com.oracle.bmc.mediaservices.requests.*;
import com.oracle.bmc.mediaservices.responses.*;

/**
 * Media Services (includes Media Flow and Media Streams) is a fully managed service for processing
 * media (video) source content. Use Media Flow and Media Streams to transcode and package digital
 * video using configurable workflows and stream video outputs.
 *
 * <p>Use the Media Services API to configure media workflows and run Media Flow jobs, create
 * distribution channels, ingest assets, create Preview URLs and play assets. For more information,
 * see [Media Flow](https://docs.oracle.com/iaas/Content/dms-mediaflow/home.htm) and [Media
 * Streams](https://docs.oracle.com/iaas/Content/dms-mediastream/home.htm).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20211101")
public interface MediaStreamAsync extends AutoCloseable {

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
     * Gets the playlist content for the specified Packaging Configuration and Media Asset
     * combination. This API call is made using the MediaStreamsClient, which requires the endpoint
     * to be set with the value of the distribution channel domain name (for example,
     * https://example_channel.dc.mediaservices.example_region.oci.oraclecloud.com) to generate a
     * session token or playlist for a media asset registered in this distribution channel.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<GeneratePlaylistResponse> generatePlaylist(
            GeneratePlaylistRequest request,
            com.oracle.bmc.responses.AsyncHandler<GeneratePlaylistRequest, GeneratePlaylistResponse>
                    handler);

    /**
     * Generate a new streaming session token. This API call is made using the MediaStreamsClient,
     * which requires the endpoint to be set with the value of the distribution channel domain name
     * (for example, https://example_channel.dc.mediaservices.example_region.oci.oraclecloud.com) to
     * generate a session token or playlist for a media asset registered in this distribution
     * channel.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<GenerateSessionTokenResponse> generateSessionToken(
            GenerateSessionTokenRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            GenerateSessionTokenRequest, GenerateSessionTokenResponse>
                    handler);
}

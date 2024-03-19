/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.apmtraces;

import com.oracle.bmc.apmtraces.requests.*;
import com.oracle.bmc.apmtraces.responses.*;

/**
 * Use the Application Performance Monitoring Trace Explorer API to query traces and associated
 * spans in Trace Explorer. For more information, see [Application Performance
 * Monitoring](https://docs.oracle.com/iaas/application-performance-monitoring/index.html).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200630")
public interface AttributesAsync extends AutoCloseable {

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
     * Activates a set of attributes for the given APM Domain. The API is not case-sensitive. Any
     * duplicates present in the bulk activation request are deduplicated and only unique attributes
     * are activated. A maximum number of 700 string attributes and 100 numeric attributes can be
     * activated in an APM Domain subject to the available string and numeric slots. Once an
     * attribute has been activated, it may take sometime for it to be appear in searches as ingest
     * might not have picked up the changes or any associated caches might not have refreshed. The
     * bulk activation operation is atomic, and the operation succeeds only if all the attributes in
     * the request have been processed successfully and they get a success status back. If the
     * processing of any attribute results in a processing or validation error, then none of the
     * attributes in the bulk request are activated. Attributes that are activated are unpinned by
     * default if they are pinned.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<BulkActivateAttributeResponse> bulkActivateAttribute(
            BulkActivateAttributeRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            BulkActivateAttributeRequest, BulkActivateAttributeResponse>
                    handler);

    /**
     * Deactivates a set of attributes for the given APM Domain. The API is case in-sensitive. Any
     * duplicates present in the bulk deactivation request are deduplicated and only unique
     * attributes are deactivated. A maximum number of 700 string attributes and 100 numeric
     * attributes can be deactivated in an APM Domain subject to the available string and numeric
     * slots. Out of box attributes (Trace and Span) cannot be deactivated, and will result in a
     * processing error. Once an attribute has been deactivated, it may take sometime for it to
     * disappear in searches as ingest might not have picked up the changes or any associated caches
     * might not have refreshed. The bulk deactivation operation is atomic, and the operation
     * succeeds only if all the attributes in the request have been processed successfully and they
     * get a success status back. If the processing of any attribute results in a processing or
     * validation error, then none of the attributes in the bulk request are deactivated.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<BulkDeActivateAttributeResponse> bulkDeActivateAttribute(
            BulkDeActivateAttributeRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            BulkDeActivateAttributeRequest, BulkDeActivateAttributeResponse>
                    handler);

    /**
     * Pin a set of attributes in the APM Domain. Attributes that are marked pinned are not
     * autoactivated by ingest. Attributes that are deactivated are pinned by default.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<BulkPinAttributeResponse> bulkPinAttribute(
            BulkPinAttributeRequest request,
            com.oracle.bmc.responses.AsyncHandler<BulkPinAttributeRequest, BulkPinAttributeResponse>
                    handler);

    /**
     * Unpin a set of attributes in the APM Domain.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<BulkUnpinAttributeResponse> bulkUnpinAttribute(
            BulkUnpinAttributeRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            BulkUnpinAttributeRequest, BulkUnpinAttributeResponse>
                    handler);

    /**
     * Update a set of attribute properties in the APM Domain.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<BulkUpdateAttributeResponse> bulkUpdateAttribute(
            BulkUpdateAttributeRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            BulkUpdateAttributeRequest, BulkUpdateAttributeResponse>
                    handler);

    /**
     * Add or edit notes to a set of attributes in the APM Domain. Notes can be added to either an
     * active or an inactive attribute. The notes will be preserved even if the attribute changes
     * state (when an active attribute is deactivated or when an inactive attribute is activated).
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<BulkUpdateAttributeNotesResponse> bulkUpdateAttributeNotes(
            BulkUpdateAttributeNotesRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            BulkUpdateAttributeNotesRequest, BulkUpdateAttributeNotesResponse>
                    handler);

    /**
     * Get autoactivation status for a private data key or public data key in the APM Domain.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<GetStatusAutoActivateResponse> getStatusAutoActivate(
            GetStatusAutoActivateRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            GetStatusAutoActivateRequest, GetStatusAutoActivateResponse>
                    handler);

    /**
     * Turn on or off autoactivate for private data key or public data key traffic a given APM
     * Domain.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<PutToggleAutoActivateResponse> putToggleAutoActivate(
            PutToggleAutoActivateRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            PutToggleAutoActivateRequest, PutToggleAutoActivateResponse>
                    handler);
}

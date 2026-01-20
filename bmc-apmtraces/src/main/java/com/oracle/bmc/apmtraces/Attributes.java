/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.apmtraces;

import com.oracle.bmc.apmtraces.requests.*;
import com.oracle.bmc.apmtraces.responses.*;

/**
 * Use the Application Performance Monitoring Trace Explorer API to query traces and associated
 * spans in Trace Explorer. For more information, see [Application Performance
 * Monitoring](https://docs.oracle.com/iaas/application-performance-monitoring/index.html).
 *
 * <p>This service client uses CircuitBreakerUtils.DEFAULT_CIRCUIT_BREAKER for all the operations by
 * default if no circuit breaker configuration is defined by the user.
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200630")
public interface Attributes extends AutoCloseable {

    /** Rebuilds the client from scratch. Useful to refresh certificates. */
    void refreshClient();

    /**
     * Sets the endpoint to call (ex, https://www.example.com).
     *
     * @param endpoint The endpoint of the service.
     */
    void setEndpoint(String endpoint);

    /** Gets the set endpoint for REST call (ex, https://www.example.com) */
    String getEndpoint();

    /**
     * Sets the region to call (ex, Region.US_PHOENIX_1).
     *
     * <p>Note, this will call {@link #setEndpoint(String) setEndpoint} after resolving the
     * endpoint. If the service is not available in this Region, however, an
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
     * Activates a set of attributes for the given APM Domain. Attribute names are not
     * case-sensitive. Any duplicates present in the bulk activation request are deduplicated and
     * only unique attributes are activated. A maximum number of 700 string attributes and 100
     * numeric attributes can be activated in an APM Domain subject to the available string and
     * numeric slots. Once an attribute has been activated, it may take some time for it to be
     * appear in searches as ingest might not have picked up the changes or any associated caches
     * might not have refreshed. The bulk activation operation is atomic, and the operation succeeds
     * only if all the attributes in the request have been processed successfully and they get a
     * success status back. If the processing of any attribute results in a processing or validation
     * error, then none of the attributes in the bulk request are activated. Attributes that are
     * activated are unpinned by default if they are pinned.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/apmtraces/BulkActivateAttributeExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     BulkActivateAttribute API.
     */
    BulkActivateAttributeResponse bulkActivateAttribute(BulkActivateAttributeRequest request);

    /**
     * Deactivates a set of attributes for the given APM Domain. Attribute names are not
     * case-sensitive. Any duplicates present in the bulk deactivation request are deduplicated and
     * only unique attributes are deactivated. A maximum number of 700 string attributes and 100
     * numeric attributes can be deactivated in an APM Domain subject to the available string and
     * numeric slots. Out of box attributes (Trace and Span) cannot be deactivated, and will result
     * in a processing error. Once an attribute has been deactivated, it may take some time for it
     * to disappear in searches as ingest might not have picked up the changes or any associated
     * caches might not have refreshed. The bulk deactivation operation is atomic, and the operation
     * succeeds only if all the attributes in the request have been processed successfully and they
     * get a success status back. If the processing of any attribute results in a processing or
     * validation error, then none of the attributes in the bulk request are deactivated.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/apmtraces/BulkDeActivateAttributeExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     BulkDeActivateAttribute API.
     */
    BulkDeActivateAttributeResponse bulkDeActivateAttribute(BulkDeActivateAttributeRequest request);

    /**
     * Pin a set of attributes in the APM Domain. Attributes that are marked pinned are not
     * autoactivated by ingest. Attributes that are deactivated are pinned by default.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/apmtraces/BulkPinAttributeExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use BulkPinAttribute
     *     API.
     */
    BulkPinAttributeResponse bulkPinAttribute(BulkPinAttributeRequest request);

    /**
     * Unpin a set of attributes in the APM Domain.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/apmtraces/BulkUnpinAttributeExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use BulkUnpinAttribute
     *     API.
     */
    BulkUnpinAttributeResponse bulkUnpinAttribute(BulkUnpinAttributeRequest request);

    /**
     * Update a set of attribute properties in the APM Domain.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/apmtraces/BulkUpdateAttributeExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use BulkUpdateAttribute
     *     API.
     */
    BulkUpdateAttributeResponse bulkUpdateAttribute(BulkUpdateAttributeRequest request);

    /**
     * Add or edit notes to a set of attributes in the APM Domain. Notes can be added to either an
     * active or an inactive attribute. The notes will be preserved even if the attribute changes
     * state (when an active attribute is deactivated or when an inactive attribute is activated).
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/apmtraces/BulkUpdateAttributeNotesExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     BulkUpdateAttributeNotes API.
     */
    BulkUpdateAttributeNotesResponse bulkUpdateAttributeNotes(
            BulkUpdateAttributeNotesRequest request);

    /**
     * Get autoactivation status for a private data key or public data key in the APM Domain.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/apmtraces/GetStatusAutoActivateExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     GetStatusAutoActivate API.
     */
    GetStatusAutoActivateResponse getStatusAutoActivate(GetStatusAutoActivateRequest request);

    /**
     * Turn on or off autoactivate for private data key or public data key traffic a given APM
     * Domain.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/apmtraces/PutToggleAutoActivateExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     PutToggleAutoActivate API.
     */
    PutToggleAutoActivateResponse putToggleAutoActivate(PutToggleAutoActivateRequest request);
}

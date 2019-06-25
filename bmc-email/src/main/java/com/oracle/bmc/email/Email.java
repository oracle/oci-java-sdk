/**
 * Copyright (c) 2016, 2019, Oracle and/or its affiliates. All rights reserved.
 */
package com.oracle.bmc.email;

import com.oracle.bmc.email.requests.*;
import com.oracle.bmc.email.responses.*;

@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20170907")
public interface Email extends AutoCloseable {

    /**
     * Sets the endpoint to call (ex, https://www.example.com).
     * @param endpoint The endpoint of the service.
     */
    void setEndpoint(String endpoint);

    /**
     * Sets the region to call (ex, Region.US_PHOENIX_1).
     * <p>
     * Note, this will call {@link #setEndpoint(String) setEndpoint} after resolving the endpoint.  If the service is not available in this Region, however, an IllegalArgumentException will be raised.
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
     * Moves a sender into a different compartment. When provided, If-Match is checked against ETag values of the resource.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    ChangeSenderCompartmentResponse changeSenderCompartment(ChangeSenderCompartmentRequest request);

    /**
     * Creates a sender for a tenancy in a given compartment.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    CreateSenderResponse createSender(CreateSenderRequest request);

    /**
     * Adds recipient email addresses to the suppression list for a tenancy.
     * Addresses added to the suppression list via the API are denoted as
     * \"MANUAL\" in the `reason` field. *Note:* All email addresses added to the
     * suppression list are normalized to include only lowercase letters.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    CreateSuppressionResponse createSuppression(CreateSuppressionRequest request);

    /**
     * Deletes an approved sender for a tenancy in a given compartment for a
     * provided `senderId`.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    DeleteSenderResponse deleteSender(DeleteSenderRequest request);

    /**
     * Removes a suppressed recipient email address from the suppression list
     * for a tenancy in a given compartment for a provided `suppressionId`.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    DeleteSuppressionResponse deleteSuppression(DeleteSuppressionRequest request);

    /**
     * Gets an approved sender for a given `senderId`.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    GetSenderResponse getSender(GetSenderRequest request);

    /**
     * Gets the details of a suppressed recipient email address for a given
     * `suppressionId`. Each suppression is given a unique OCID.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    GetSuppressionResponse getSuppression(GetSuppressionRequest request);

    /**
     * Gets a collection of approved sender email addresses and sender IDs.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    ListSendersResponse listSenders(ListSendersRequest request);

    /**
     * Gets a list of suppressed recipient email addresses for a user. The
     * `compartmentId` for suppressions must be a tenancy OCID. The returned list
     * is sorted by creation time in descending order.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    ListSuppressionsResponse listSuppressions(ListSuppressionsRequest request);

    /**
     * Replaces the set of tags for a sender with the tags provided. If either freeform
     * or defined tags are omitted, the tags for that set remain the same. Each set must
     * include the full set of tags for the sender, partial updates are not permitted.
     * For more information about tagging, see [Resource Tags](https://docs.cloud.oracle.com/Content/General/Concepts/resourcetags.htm).
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    UpdateSenderResponse updateSender(UpdateSenderRequest request);

    /**
     * Gets the pre-configured waiters available for resources for this service.
     *
     * @return The service waiters.
     */
    EmailWaiters getWaiters();

    /**
     * Gets the pre-configured paginators available for list operations in this service which may return multiple
     * pages of data. These paginators provide an {@link java.lang.Iterable} interface so that service responses, or
     * resources/records, can be iterated through without having to manually deal with pagination and page tokens.
     *
     * @return The service paginators.
     */
    EmailPaginators getPaginators();
}

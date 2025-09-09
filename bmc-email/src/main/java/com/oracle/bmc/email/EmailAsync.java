/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.email;

import com.oracle.bmc.email.requests.*;
import com.oracle.bmc.email.responses.*;

/**
 * Use the Email Delivery API to do the necessary set up to send high-volume and
 * application-generated emails through the OCI Email Delivery service. For more information, see
 * [Overview of the Email Delivery
 * Service](https://docs.oracle.com/iaas/Content/Email/Concepts/overview.htm).
 *
 * <p>*Note:** Write actions (POST, UPDATE, DELETE) may take several minutes to propagate and be
 * reflected by the API. If a subsequent read request fails to reflect your changes, wait a few
 * minutes and try again.
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20170907")
public interface EmailAsync extends AutoCloseable {

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
     * Adds a lock to a resource.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<AddEmailDomainLockResponse> addEmailDomainLock(
            AddEmailDomainLockRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            AddEmailDomainLockRequest, AddEmailDomainLockResponse>
                    handler);

    /**
     * Adds a lock to a resource.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<AddReturnPathLockResponse> addReturnPathLock(
            AddReturnPathLockRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            AddReturnPathLockRequest, AddReturnPathLockResponse>
                    handler);

    /**
     * Adds a lock to a resource.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<AddSenderLockResponse> addSenderLock(
            AddSenderLockRequest request,
            com.oracle.bmc.responses.AsyncHandler<AddSenderLockRequest, AddSenderLockResponse>
                    handler);

    /**
     * Moves an email domain into a different compartment. When provided, If-Match is checked
     * against ETag value of the resource. For information about moving resources between
     * compartments, see [Moving Resources to a Different
     * Compartment](https://docs.oracle.com/iaas/Content/Identity/Tasks/managingcompartments.htm#moveRes).
     *
     * <p>*Note:** All DKIM objects associated with this email domain will also be moved into the
     * provided compartment.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ChangeEmailDomainCompartmentResponse> changeEmailDomainCompartment(
            ChangeEmailDomainCompartmentRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            ChangeEmailDomainCompartmentRequest,
                            ChangeEmailDomainCompartmentResponse>
                    handler);

    /**
     * Moves a sender into a different compartment. When provided, If-Match is checked against ETag
     * values of the resource.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ChangeSenderCompartmentResponse> changeSenderCompartment(
            ChangeSenderCompartmentRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            ChangeSenderCompartmentRequest, ChangeSenderCompartmentResponse>
                    handler);

    /**
     * Creates a new DKIM for an email domain. This DKIM signs all approved senders in the tenancy
     * that are in this email domain. Best security practices indicate to periodically rotate the
     * DKIM that is doing the signing. When a second DKIM is applied, all senders seamlessly pick up
     * the new key without interruption in signing.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<CreateDkimResponse> createDkim(
            CreateDkimRequest request,
            com.oracle.bmc.responses.AsyncHandler<CreateDkimRequest, CreateDkimResponse> handler);

    /**
     * Creates a new email domain. Avoid entering confidential information.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<CreateEmailDomainResponse> createEmailDomain(
            CreateEmailDomainRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            CreateEmailDomainRequest, CreateEmailDomainResponse>
                    handler);

    /**
     * Creates a new email return path. Avoid entering confidential information.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<CreateEmailReturnPathResponse> createEmailReturnPath(
            CreateEmailReturnPathRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            CreateEmailReturnPathRequest, CreateEmailReturnPathResponse>
                    handler);

    /**
     * Creates a sender for a tenancy in a given compartment.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<CreateSenderResponse> createSender(
            CreateSenderRequest request,
            com.oracle.bmc.responses.AsyncHandler<CreateSenderRequest, CreateSenderResponse>
                    handler);

    /**
     * Adds recipient email addresses to the suppression list for a tenancy. Addresses added to the
     * suppression list via the API are denoted as \"MANUAL\" in the `reason` field. *Note:* All
     * email addresses added to the suppression list are normalized to include only lowercase
     * letters.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<CreateSuppressionResponse> createSuppression(
            CreateSuppressionRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            CreateSuppressionRequest, CreateSuppressionResponse>
                    handler);

    /**
     * Deletes a DKIM. If this key is currently the active key for the email domain, deleting the
     * key will stop signing the domain's outgoing mail. DKIM keys are left in DELETING state for
     * about a day to allow DKIM signatures on in-transit mail to be validated. Consider creating a
     * new DKIM for this domain so the signing can be rotated to it instead of deletion.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<DeleteDkimResponse> deleteDkim(
            DeleteDkimRequest request,
            com.oracle.bmc.responses.AsyncHandler<DeleteDkimRequest, DeleteDkimResponse> handler);

    /**
     * Deletes an email domain.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<DeleteEmailDomainResponse> deleteEmailDomain(
            DeleteEmailDomainRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            DeleteEmailDomainRequest, DeleteEmailDomainResponse>
                    handler);

    /**
     * Deletes an email return path.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<DeleteEmailReturnPathResponse> deleteEmailReturnPath(
            DeleteEmailReturnPathRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            DeleteEmailReturnPathRequest, DeleteEmailReturnPathResponse>
                    handler);

    /**
     * Deletes an approved sender for a tenancy in a given compartment for a provided `senderId`.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<DeleteSenderResponse> deleteSender(
            DeleteSenderRequest request,
            com.oracle.bmc.responses.AsyncHandler<DeleteSenderRequest, DeleteSenderResponse>
                    handler);

    /**
     * Removes a suppressed recipient email address from the suppression list for a tenancy in a
     * given compartment for a provided `suppressionId`.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<DeleteSuppressionResponse> deleteSuppression(
            DeleteSuppressionRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            DeleteSuppressionRequest, DeleteSuppressionResponse>
                    handler);

    /**
     * Retrieves the specified DKIM.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<GetDkimResponse> getDkim(
            GetDkimRequest request,
            com.oracle.bmc.responses.AsyncHandler<GetDkimRequest, GetDkimResponse> handler);

    /**
     * Returns email configuration associated with the specified compartment.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<GetEmailConfigurationResponse> getEmailConfiguration(
            GetEmailConfigurationRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            GetEmailConfigurationRequest, GetEmailConfigurationResponse>
                    handler);

    /**
     * Retrieves the specified email domain.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<GetEmailDomainResponse> getEmailDomain(
            GetEmailDomainRequest request,
            com.oracle.bmc.responses.AsyncHandler<GetEmailDomainRequest, GetEmailDomainResponse>
                    handler);

    /**
     * Retrieves the specified email return path.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<GetEmailReturnPathResponse> getEmailReturnPath(
            GetEmailReturnPathRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            GetEmailReturnPathRequest, GetEmailReturnPathResponse>
                    handler);

    /**
     * Gets an approved sender for a given `senderId`.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<GetSenderResponse> getSender(
            GetSenderRequest request,
            com.oracle.bmc.responses.AsyncHandler<GetSenderRequest, GetSenderResponse> handler);

    /**
     * Gets the details of a suppressed recipient email address for a given `suppressionId`. Each
     * suppression is given a unique OCID.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<GetSuppressionResponse> getSuppression(
            GetSuppressionRequest request,
            com.oracle.bmc.responses.AsyncHandler<GetSuppressionRequest, GetSuppressionResponse>
                    handler);

    /**
     * Gets the status of the work request with the given ID.
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
     * Lists DKIMs for an email domain.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ListDkimsResponse> listDkims(
            ListDkimsRequest request,
            com.oracle.bmc.responses.AsyncHandler<ListDkimsRequest, ListDkimsResponse> handler);

    /**
     * Lists email domains in the specified compartment.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ListEmailDomainsResponse> listEmailDomains(
            ListEmailDomainsRequest request,
            com.oracle.bmc.responses.AsyncHandler<ListEmailDomainsRequest, ListEmailDomainsResponse>
                    handler);

    /**
     * Lists email return paths in the specified compartment or emaildomain.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ListEmailReturnPathsResponse> listEmailReturnPaths(
            ListEmailReturnPathsRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            ListEmailReturnPathsRequest, ListEmailReturnPathsResponse>
                    handler);

    /**
     * Gets a collection of approved sender email addresses and sender IDs.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ListSendersResponse> listSenders(
            ListSendersRequest request,
            com.oracle.bmc.responses.AsyncHandler<ListSendersRequest, ListSendersResponse> handler);

    /**
     * Gets a list of suppressed recipient email addresses for a user. The `compartmentId` for
     * suppressions must be a tenancy OCID. The returned list is sorted by creation time in
     * descending order.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ListSuppressionsResponse> listSuppressions(
            ListSuppressionsRequest request,
            com.oracle.bmc.responses.AsyncHandler<ListSuppressionsRequest, ListSuppressionsResponse>
                    handler);

    /**
     * Return a (paginated) list of errors for a given work request.
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
     * Return a (paginated) list of logs for a given work request.
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
     * Lists the work requests in a compartment.
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
     * Remove a lock to a resource.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<RemoveEmailDomainLockResponse> removeEmailDomainLock(
            RemoveEmailDomainLockRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            RemoveEmailDomainLockRequest, RemoveEmailDomainLockResponse>
                    handler);

    /**
     * Remove a lock to a resource.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<RemoveReturnPathLockResponse> removeReturnPathLock(
            RemoveReturnPathLockRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            RemoveReturnPathLockRequest, RemoveReturnPathLockResponse>
                    handler);

    /**
     * Remove a lock to a resource.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<RemoveSenderLockResponse> removeSenderLock(
            RemoveSenderLockRequest request,
            com.oracle.bmc.responses.AsyncHandler<RemoveSenderLockRequest, RemoveSenderLockResponse>
                    handler);

    /**
     * Modifies a DKIM.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<UpdateDkimResponse> updateDkim(
            UpdateDkimRequest request,
            com.oracle.bmc.responses.AsyncHandler<UpdateDkimRequest, UpdateDkimResponse> handler);

    /**
     * Modifies an email domain.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<UpdateEmailDomainResponse> updateEmailDomain(
            UpdateEmailDomainRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            UpdateEmailDomainRequest, UpdateEmailDomainResponse>
                    handler);

    /**
     * Modifies an email return path.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<UpdateEmailReturnPathResponse> updateEmailReturnPath(
            UpdateEmailReturnPathRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            UpdateEmailReturnPathRequest, UpdateEmailReturnPathResponse>
                    handler);

    /**
     * Replaces the set of tags for a sender with the tags provided. If either freeform or defined
     * tags are omitted, the tags for that set remain the same. Each set must include the full set
     * of tags for the sender, partial updates are not permitted. For more information about
     * tagging, see [Resource
     * Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<UpdateSenderResponse> updateSender(
            UpdateSenderRequest request,
            com.oracle.bmc.responses.AsyncHandler<UpdateSenderRequest, UpdateSenderResponse>
                    handler);
}

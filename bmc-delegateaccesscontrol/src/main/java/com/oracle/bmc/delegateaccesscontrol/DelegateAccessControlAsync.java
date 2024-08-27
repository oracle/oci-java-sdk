/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.delegateaccesscontrol;

import com.oracle.bmc.delegateaccesscontrol.requests.*;
import com.oracle.bmc.delegateaccesscontrol.responses.*;

/**
 * Oracle Delegate Access Control allows ExaCC and ExaCS customers to delegate management of their
 * Exadata resources operators outside their tenancies. With Delegate Access Control, Support
 * Providers can deliver managed services using comprehensive and robust tooling built on the OCI
 * platform. Customers maintain control over who has access to the delegated resources in their
 * tenancy and what actions can be taken. Enterprises managing resources across multiple tenants can
 * use Delegate Access Control to streamline management tasks. Using logging service, customers can
 * view a near real-time audit report of all actions performed by a Service Provider operator.
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20230801")
public interface DelegateAccessControlAsync extends AutoCloseable {

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
     * Approves a Delegated Resource Access Request.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ApproveDelegatedResourceAccessRequestResponse>
            approveDelegatedResourceAccessRequest(
                    ApproveDelegatedResourceAccessRequestRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    ApproveDelegatedResourceAccessRequestRequest,
                                    ApproveDelegatedResourceAccessRequestResponse>
                            handler);

    /**
     * Moves the Delegation Control resource into a different compartment. When provided, 'If-Match'
     * is checked against 'ETag' values of the resource.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ChangeDelegationControlCompartmentResponse>
            changeDelegationControlCompartment(
                    ChangeDelegationControlCompartmentRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    ChangeDelegationControlCompartmentRequest,
                                    ChangeDelegationControlCompartmentResponse>
                            handler);

    /**
     * Moves the Delegation Subscription resource into a different compartment. When provided,
     * 'If-Match' is checked against 'ETag' values of the resource.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ChangeDelegationSubscriptionCompartmentResponse>
            changeDelegationSubscriptionCompartment(
                    ChangeDelegationSubscriptionCompartmentRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    ChangeDelegationSubscriptionCompartmentRequest,
                                    ChangeDelegationSubscriptionCompartmentResponse>
                            handler);

    /**
     * Creates a Delegation Control.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<CreateDelegationControlResponse> createDelegationControl(
            CreateDelegationControlRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            CreateDelegationControlRequest, CreateDelegationControlResponse>
                    handler);

    /**
     * Creates Delegation Subscription in Delegation Control.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<CreateDelegationSubscriptionResponse> createDelegationSubscription(
            CreateDelegationSubscriptionRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            CreateDelegationSubscriptionRequest,
                            CreateDelegationSubscriptionResponse>
                    handler);

    /**
     * Deletes a Delegation Control. You cannot delete a Delegation Control if it is assigned to
     * govern any target resource currently or in the future. In that case, first, delete all of the
     * current and future assignments before deleting the Delegation Control. A Delegation Control
     * that was previously assigned to a target resource is marked as DELETED following a successful
     * deletion. However, it is not completely deleted from the system. This is to ensure auditing
     * information for the accesses done under the Delegation Control is preserved for future needs.
     * The system purges the deleted Delegation Control only when all of the audit data associated
     * with the Delegation Control are also deleted. Therefore, you cannot reuse the name of the
     * deleted Delegation Control until the system purges the Delegation Control.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<DeleteDelegationControlResponse> deleteDelegationControl(
            DeleteDelegationControlRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            DeleteDelegationControlRequest, DeleteDelegationControlResponse>
                    handler);

    /**
     * eletes an Delegation Subscription in Delegation Control.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<DeleteDelegationSubscriptionResponse> deleteDelegationSubscription(
            DeleteDelegationSubscriptionRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            DeleteDelegationSubscriptionRequest,
                            DeleteDelegationSubscriptionResponse>
                    handler);

    /**
     * Gets details of a Delegated Resource Access Request.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<GetDelegatedResourceAccessRequestResponse>
            getDelegatedResourceAccessRequest(
                    GetDelegatedResourceAccessRequestRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    GetDelegatedResourceAccessRequestRequest,
                                    GetDelegatedResourceAccessRequestResponse>
                            handler);

    /**
     * Gets the audit log report for the given Delegated Resource Access Request.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<GetDelegatedResourceAccessRequestAuditLogReportResponse>
            getDelegatedResourceAccessRequestAuditLogReport(
                    GetDelegatedResourceAccessRequestAuditLogReportRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    GetDelegatedResourceAccessRequestAuditLogReportRequest,
                                    GetDelegatedResourceAccessRequestAuditLogReportResponse>
                            handler);

    /**
     * Gets the Delegation Control associated with the specified Delegation Control ID.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<GetDelegationControlResponse> getDelegationControl(
            GetDelegationControlRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            GetDelegationControlRequest, GetDelegationControlResponse>
                    handler);

    /**
     * Gets a DelegationSubscription by identifier
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<GetDelegationSubscriptionResponse> getDelegationSubscription(
            GetDelegationSubscriptionRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            GetDelegationSubscriptionRequest, GetDelegationSubscriptionResponse>
                    handler);

    /**
     * Gets a ServiceProvider by identifier
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<GetServiceProviderResponse> getServiceProvider(
            GetServiceProviderRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            GetServiceProviderRequest, GetServiceProviderResponse>
                    handler);

    /**
     * Gets the Service Provider Action associated with the specified Service Provider Action ID.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<GetServiceProviderActionResponse> getServiceProviderAction(
            GetServiceProviderActionRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            GetServiceProviderActionRequest, GetServiceProviderActionResponse>
                    handler);

    /**
     * Returns a history of all status associated with the Delegated Resource Access RequestId.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ListDelegatedResourceAccessRequestHistoriesResponse>
            listDelegatedResourceAccessRequestHistories(
                    ListDelegatedResourceAccessRequestHistoriesRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    ListDelegatedResourceAccessRequestHistoriesRequest,
                                    ListDelegatedResourceAccessRequestHistoriesResponse>
                            handler);

    /**
     * Lists all Delegated Resource Access Requests in the compartment. Note that only one of
     * lifecycleState or requestStatus query parameter can be used.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ListDelegatedResourceAccessRequestsResponse>
            listDelegatedResourceAccessRequests(
                    ListDelegatedResourceAccessRequestsRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    ListDelegatedResourceAccessRequestsRequest,
                                    ListDelegatedResourceAccessRequestsResponse>
                            handler);

    /**
     * Returns a list of resources associated with the Delegation Control.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ListDelegationControlResourcesResponse>
            listDelegationControlResources(
                    ListDelegationControlResourcesRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    ListDelegationControlResourcesRequest,
                                    ListDelegationControlResourcesResponse>
                            handler);

    /**
     * Lists the Delegation Controls in the compartment.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ListDelegationControlsResponse> listDelegationControls(
            ListDelegationControlsRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            ListDelegationControlsRequest, ListDelegationControlsResponse>
                    handler);

    /**
     * Lists the Delegation Subscriptions in Delegation Control.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ListDelegationSubscriptionsResponse> listDelegationSubscriptions(
            ListDelegationSubscriptionsRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            ListDelegationSubscriptionsRequest, ListDelegationSubscriptionsResponse>
                    handler);

    /**
     * Lists all the ServiceProviderActions available in the system.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ListServiceProviderActionsResponse> listServiceProviderActions(
            ListServiceProviderActionsRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            ListServiceProviderActionsRequest, ListServiceProviderActionsResponse>
                    handler);

    /**
     * Lists the MoreInformation interaction between customer and support operators.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ListServiceProviderInteractionsResponse>
            listServiceProviderInteractions(
                    ListServiceProviderInteractionsRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    ListServiceProviderInteractionsRequest,
                                    ListServiceProviderInteractionsResponse>
                            handler);

    /**
     * Lists the Service Providers.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ListServiceProvidersResponse> listServiceProviders(
            ListServiceProvidersRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            ListServiceProvidersRequest, ListServiceProvidersResponse>
                    handler);

    /**
     * Rejects a Delegated Resource Access Request.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<RejectDelegatedResourceAccessRequestResponse>
            rejectDelegatedResourceAccessRequest(
                    RejectDelegatedResourceAccessRequestRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    RejectDelegatedResourceAccessRequestRequest,
                                    RejectDelegatedResourceAccessRequestResponse>
                            handler);

    /**
     * Revokes an already approved Delegated Resource Access Request.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<RevokeDelegatedResourceAccessRequestResponse>
            revokeDelegatedResourceAccessRequest(
                    RevokeDelegatedResourceAccessRequestRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    RevokeDelegatedResourceAccessRequestRequest,
                                    RevokeDelegatedResourceAccessRequestResponse>
                            handler);

    /**
     * Posts query for additional information for the given Delegated Resource Access Request.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ServiceProviderInteractionRequestResponse>
            serviceProviderInteractionRequest(
                    ServiceProviderInteractionRequestRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    ServiceProviderInteractionRequestRequest,
                                    ServiceProviderInteractionRequestResponse>
                            handler);

    /**
     * Updates the existing DelegationControl for a given Delegation Control ID.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<UpdateDelegationControlResponse> updateDelegationControl(
            UpdateDelegationControlRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            UpdateDelegationControlRequest, UpdateDelegationControlResponse>
                    handler);

    /**
     * Updates the existing DelegationSubscription for a given Delegation Subscription ID.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<UpdateDelegationSubscriptionResponse> updateDelegationSubscription(
            UpdateDelegationSubscriptionRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            UpdateDelegationSubscriptionRequest,
                            UpdateDelegationSubscriptionResponse>
                    handler);
}

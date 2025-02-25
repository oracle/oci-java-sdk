/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.securityattribute;

import com.oracle.bmc.securityattribute.requests.*;
import com.oracle.bmc.securityattribute.responses.*;

/**
 * Use the Security Attributes API to manage security attributes and security attribute namespaces. For more information, see the documentation for [Security Attributes](https://docs.oracle.com/iaas/Content/zero-trust-packet-routing/managing-security-attributes.htm) and [Security Attribute Nampespaces](https://docs.oracle.com/iaas/Content/zero-trust-packet-routing/managing-security-attribute-namespaces.htm).
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20240815")
public interface SecurityAttributeAsync extends AutoCloseable {

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
     * Determines whether realm specific endpoint should be used or not.
     * Set realmSpecificEndpointTemplateEnabled to "true" if the user wants to enable use of realm specific endpoint template, otherwise set it to "false"
     * @param realmSpecificEndpointTemplateEnabled flag to enable the use of realm specific endpoint template
     */
    void useRealmSpecificEndpointTemplate(boolean realmSpecificEndpointTemplateEnabled);

    /**
     * Deletes the specified security attribute definitions. This operation triggers a process that removes the
     * security attributes from all resources in your tenancy. The security attributes must be within the same security attribute namespace.
     *
     * The following actions happen immediately:
     *
     * After you start this operation, the state of the tag changes to DELETING, and security attribute removal
     * from resources begins. This process can take up to 48 hours depending on the number of resources that
     * are tagged and the regions in which those resources reside.
     *
     * When all security attributes have been removed, the state changes to DELETED. You cannot restore a deleted security attribute. After the security attribute state
     * changes to DELETED, you can use the same security attribute name again.
     *
     * After you start this operation, you cannot start either the {@link #deleteSecurityAttribute(DeleteSecurityAttributeRequest, Consumer, Consumer) deleteSecurityAttribute} or the {@link #cascadeDeleteSecurityAttributeNamespace(CascadeDeleteSecurityAttributeNamespaceRequest, Consumer, Consumer) cascadeDeleteSecurityAttributeNamespace} operation until this process completes.
     *
     * In order to delete security attribute, you must first retire the security attribute. Use {@link #updateSecurityAttribute(UpdateSecurityAttributeRequest, Consumer, Consumer) updateSecurityAttribute}
     * to retire a security attribute.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<BulkDeleteSecurityAttributesResponse> bulkDeleteSecurityAttributes(
            BulkDeleteSecurityAttributesRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            BulkDeleteSecurityAttributesRequest,
                            BulkDeleteSecurityAttributesResponse>
                    handler);

    /**
     * Edits the specified list of security attributes for the selected resources.
     * This operation triggers a process that edits the attributes on all selected resources. The possible actions are:
     * <p>
     * Add a security attribute when it does not already exist on the resource.
     *   * Update the value for a security attribute when it is present on the resource.
     *   * Add a security attribute when it does not already exist on the resource or update the value when it is present on the resource.
     *   * Remove a security attribute from a resource. The security attribute is removed from the resource regardless of the value.
     * <p>
     * The edits can include a combination of operations and attributes.
     * However, multiple operations cannot apply to the same attribute in the same request.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<BulkEditSecurityAttributesResponse> bulkEditSecurityAttributes(
            BulkEditSecurityAttributesRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            BulkEditSecurityAttributesRequest, BulkEditSecurityAttributesResponse>
                    handler);

    /**
     * Deletes the specified security attribute namespace. This operation triggers a process that removes all of the security attributes
     * defined in the specified security attribute namespace from all resources in your tenancy and then deletes the security attribute namespace.
     * <p>
     * After you start the delete operation:
     * <p>
     * New security attribute key definitions cannot be created under the namespace.
     *   * The state of the security attribute namespace changes to DELETING.
     *   * Security attribute removal from the resources begins.
     * <p>
     * This process can take up to 48 hours depending on the number of security attributes in the namespace, the number of resources
     * that are tagged, and the locations of the regions in which those resources reside.
     * <p>
     * After all security attributes are removed, the state changes to DELETED. You cannot restore a deleted security attribute namespace. After the deleted security attribute namespace
     * changes its state to DELETED, you can use the name of the deleted security attribute namespace again.
     * <p>
     * After you start this operation, you cannot start either the {@link #deleteSecurityAttribute(DeleteSecurityAttributeRequest, Consumer, Consumer) deleteSecurityAttribute} or the {@link #bulkDeleteSecurityAttributes(BulkDeleteSecurityAttributesRequest, Consumer, Consumer) bulkDeleteSecurityAttributes} operation until this process completes.
     * <p>
     * To delete a security attribute namespace, you must first retire it. Use {@link #updateSecurityAttributeNamespace(UpdateSecurityAttributeNamespaceRequest, Consumer, Consumer) updateSecurityAttributeNamespace}
     * to retire a security attribute namespace.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<CascadingDeleteSecurityAttributeNamespaceResponse>
            cascadingDeleteSecurityAttributeNamespace(
                    CascadingDeleteSecurityAttributeNamespaceRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    CascadingDeleteSecurityAttributeNamespaceRequest,
                                    CascadingDeleteSecurityAttributeNamespaceResponse>
                            handler);

    /**
     * Moves the specified security attribute namespace to the specified compartment within the same tenancy.
     * <p>
     * To move the security attribute namespace, you must have the manage security-attributes permission on both compartments.
     * For more information about IAM policies, see [Details for IAM](https://docs.oracle.com/iaas/Content/Identity/policyreference/iampolicyreference.htm).
     * <p>
     * Moving a security attribute namespace moves all the security attributes contained in the security attribute namespace.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<ChangeSecurityAttributeNamespaceCompartmentResponse>
            changeSecurityAttributeNamespaceCompartment(
                    ChangeSecurityAttributeNamespaceCompartmentRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    ChangeSecurityAttributeNamespaceCompartmentRequest,
                                    ChangeSecurityAttributeNamespaceCompartmentResponse>
                            handler);

    /**
     * Creates a new security attribute in the specified security attribute namespace.
     * <p>
     * The security attribute requires either the OCID or the name of the security attribute namespace that will contain this
     * security attribute.
     * <p>
     * You must specify a *name* for the attribute, which must be unique across all attributes in the security attribute namespace
     * and cannot be changed. The only valid characters for security attribute names are:\u00A00-9, A-Z, a-z, -, _ characters.
     * Names are case insensitive. That means, for example, \"mySecurityAttribute\" and \"mysecurityattribute\" are not allowed in the same namespace.
     * If you specify a name that's already in use in the security attribute namespace, a 409 error is returned.
     * <p>
     * The security attribute must have a *description*. It does not have to be unique, and you can change it with
     * {@link #updateSecurityAttribute(UpdateSecurityAttributeRequest, Consumer, Consumer) updateSecurityAttribute}.
     * <p>
     * The security attribute must have a value type, which is specified with a validator. Security attribute can use either a
     * static value or a list of possible values. Static values are entered by a user applying the security attribute
     * to a resource. Lists are created by the user and the user must apply a value from the list. Lists
     * are validated.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<CreateSecurityAttributeResponse> createSecurityAttribute(
            CreateSecurityAttributeRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            CreateSecurityAttributeRequest, CreateSecurityAttributeResponse>
                    handler);

    /**
     * Creates a new security attribute namespace in the specified compartment.
     * <p>
     * You must specify the compartment ID in the request object (remember that the tenancy is simply the root
     * compartment).
     * <p>
     * You must also specify a *name* for the namespace, which must be unique across all namespaces in your tenancy
     * and cannot be changed. The only valid characters for security attribute names are: \u00A00-9, A-Z, a-z, -, _ characters.
     * Names are case insensitive. That means, for example, \"myNamespace\" and \"mynamespace\" are not allowed
     * in the same tenancy. Once you created a namespace, you cannot change the name.
     * If you specify a name that's already in use in the tenancy, a 409 error is returned.
     * <p>
     * You must also specify a *description* for the namespace.
     * It does not have to be unique, and you can change it with
     * {@link #securityAttributeNamespace(SecurityAttributeNamespaceRequest, Consumer, Consumer) securityAttributeNamespace}.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<CreateSecurityAttributeNamespaceResponse>
            createSecurityAttributeNamespace(
                    CreateSecurityAttributeNamespaceRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    CreateSecurityAttributeNamespaceRequest,
                                    CreateSecurityAttributeNamespaceResponse>
                            handler);

    /**
     * Deletes the specified security attribute. This operation triggers a process that removes the
     * security attribute from all resources in your tenancy.
     * <p>
     * When you start the delete operation, the state of the security attribute changes to DELETING and security attribute removal
     * from resources begins. This can take up to 48 hours depending on the number of resources that
     * were tagged as well as the regions in which those resources reside.
     * <p>
     * When all attributes have been removed, the state changes to DELETED. You cannot restore a deleted attribute. Once the deleted attribute
     * changes its state to DELETED, you can use the same security attribute name again.
     * <p>
     * After you start this operation, you cannot start either the {@link #bulkDeleteSecurityAttributes(BulkDeleteSecurityAttributesRequest, Consumer, Consumer) bulkDeleteSecurityAttributes} or the {@link #cascadeDeleteTagNamespace(CascadeDeleteTagNamespaceRequest, Consumer, Consumer) cascadeDeleteTagNamespace} operation until this process completes.
     * <p>
     * To delete a security attribute, you must first retire it. Use {@link #updateSecurityAttribute(UpdateSecurityAttributeRequest, Consumer, Consumer) updateSecurityAttribute}
     * to retire a security attribute.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<DeleteSecurityAttributeResponse> deleteSecurityAttribute(
            DeleteSecurityAttributeRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            DeleteSecurityAttributeRequest, DeleteSecurityAttributeResponse>
                    handler);

    /**
     * Deletes the specified security attribute namespace. Only an empty security attribute namespace can be deleted with this operation. To use this operation
     * to delete a security attribute namespace that contains security attributes, first delete all of its security attributes.
     * Use {@link #deleteSecurityAttribute(DeleteSecurityAttributeRequest, Consumer, Consumer) deleteSecurityAttribute} to delete a security attribute.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<DeleteSecurityAttributeNamespaceResponse>
            deleteSecurityAttributeNamespace(
                    DeleteSecurityAttributeNamespaceRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    DeleteSecurityAttributeNamespaceRequest,
                                    DeleteSecurityAttributeNamespaceResponse>
                            handler);

    /**
     * Gets the specified security attribute's information.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<GetSecurityAttributeResponse> getSecurityAttribute(
            GetSecurityAttributeRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            GetSecurityAttributeRequest, GetSecurityAttributeResponse>
                    handler);

    /**
     * Gets the specified security attribute namespace's information.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<GetSecurityAttributeNamespaceResponse>
            getSecurityAttributeNamespace(
                    GetSecurityAttributeNamespaceRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    GetSecurityAttributeNamespaceRequest,
                                    GetSecurityAttributeNamespaceResponse>
                            handler);

    /**
     * Gets details on a specified work request. The workRequestID is returned in the opc-work-request-id header
     * for any asynchronous operation in security attributes service.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<GetSecurityAttributeWorkRequestResponse>
            getSecurityAttributeWorkRequest(
                    GetSecurityAttributeWorkRequestRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    GetSecurityAttributeWorkRequestRequest,
                                    GetSecurityAttributeWorkRequestResponse>
                            handler);

    /**
     * Lists the security attribute namespaces in the specified compartment.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<ListSecurityAttributeNamespacesResponse>
            listSecurityAttributeNamespaces(
                    ListSecurityAttributeNamespacesRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    ListSecurityAttributeNamespacesRequest,
                                    ListSecurityAttributeNamespacesResponse>
                            handler);

    /**
     * Gets the errors for a work request.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<ListSecurityAttributeWorkRequestErrorsResponse>
            listSecurityAttributeWorkRequestErrors(
                    ListSecurityAttributeWorkRequestErrorsRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    ListSecurityAttributeWorkRequestErrorsRequest,
                                    ListSecurityAttributeWorkRequestErrorsResponse>
                            handler);

    /**
     * Gets the logs for a work request.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<ListSecurityAttributeWorkRequestLogsResponse>
            listSecurityAttributeWorkRequestLogs(
                    ListSecurityAttributeWorkRequestLogsRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    ListSecurityAttributeWorkRequestLogsRequest,
                                    ListSecurityAttributeWorkRequestLogsResponse>
                            handler);

    /**
     * Lists the security attribute work requests in compartment.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<ListSecurityAttributeWorkRequestsResponse>
            listSecurityAttributeWorkRequests(
                    ListSecurityAttributeWorkRequestsRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    ListSecurityAttributeWorkRequestsRequest,
                                    ListSecurityAttributeWorkRequestsResponse>
                            handler);

    /**
     * Lists the security attributes in the specified namespace.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<ListSecurityAttributesResponse> listSecurityAttributes(
            ListSecurityAttributesRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            ListSecurityAttributesRequest, ListSecurityAttributesResponse>
                    handler);

    /**
     * Updates the specified security attribute. You can only update `description`, and `isRetired`.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<UpdateSecurityAttributeResponse> updateSecurityAttribute(
            UpdateSecurityAttributeRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            UpdateSecurityAttributeRequest, UpdateSecurityAttributeResponse>
                    handler);

    /**
     * Updates the specified security attribute namespace. You can't update the namespace name.
     * <p>
     * Updating `isRetired` to 'true' retires the namespace and all the security attributes in the namespace. Reactivating a
     * namespace (changing `isRetired` from 'true' to 'false') does not reactivate security attributes.
     * To reactivate the security attributes, you must reactivate each one individually *after* you reactivate the namespace,
     * using {@link #updateTag(UpdateTagRequest, Consumer, Consumer) updateTag}. For more information about retiring security attribute namespaces, see
     * [Managing Security Attribute Namespaces](https://docs.oracle.com/iaas/Content/zero-trust-packet-routing/managing-security-attribute-namespaces.htm).
     * <p>
     * You can't add a namespace with the same name as a retired namespace in the same tenancy.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<UpdateSecurityAttributeNamespaceResponse>
            updateSecurityAttributeNamespace(
                    UpdateSecurityAttributeNamespaceRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    UpdateSecurityAttributeNamespaceRequest,
                                    UpdateSecurityAttributeNamespaceResponse>
                            handler);
}

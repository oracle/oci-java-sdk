/**
 * Copyright (c) 2016, 2021, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.identity;

import com.oracle.bmc.identity.requests.*;
import com.oracle.bmc.identity.responses.*;

/**
 * APIs for managing users, groups, compartments, and policies.
 * This service client uses CircuitBreakerUtils.DEFAULT_CIRCUIT_BREAKER for all the operations by default if no circuit breaker configuration is defined by the user.
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
public interface Identity extends AutoCloseable {

    /**
     * Sets the endpoint to call (ex, https://www.example.com).
     * @param endpoint The endpoint of the service.
     */
    void setEndpoint(String endpoint);

    /**
     * Gets the set endpoint for REST call (ex, https://www.example.com)
     */
    String getEndpoint();

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
     * If the domain's {@code lifecycleState} is INACTIVE,
     * 1. Set the {@code lifecycleDetails} to ACTIVATING and asynchronously starts enabling
     *    the domain and return 202 ACCEPTED.
     *     1.1 Sets the domain status to ENABLED and set specified domain's
     *         {@code lifecycleState} to ACTIVE and set the {@code lifecycleDetails} to null.
     * <p>
     * To track progress, HTTP GET on /iamWorkRequests/{iamWorkRequestsId} endpoint will provide
     * the async operation's status. Deactivate a domain can be done using HTTP POST
     * /domains/{domainId}/actions/deactivate.
     * <p>
     * - If the domain's {@code lifecycleState} is ACTIVE, returns 202 ACCEPTED with no action
     *   taken on service side.
     * - If domain is of {@code type} DEFAULT or DEFAULT_LIGHTWEIGHT or domain's {@code lifecycleState} is not INACTIVE,
     *   returns 400 BAD REQUEST.
     * - If the domain doesn't exists, returns 404 NOT FOUND.
     * - If the authenticated user is part of the domain to be activated, returns 400 BAD REQUEST
     * - If error occurs while activating domain, returns 500 INTERNAL SERVER ERROR.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation will not retry by default, users can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to enable retries for it.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/identity/ActivateDomainExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use ActivateDomain API.
     */
    ActivateDomainResponse activateDomain(ActivateDomainRequest request);

    /**
     * Activates the specified MFA TOTP device for the user. Activation requires manual interaction with the Console.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation will not retry by default, users can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to enable retries for it.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/identity/ActivateMfaTotpDeviceExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use ActivateMfaTotpDevice API.
     */
    ActivateMfaTotpDeviceResponse activateMfaTotpDevice(ActivateMfaTotpDeviceRequest request);

    /**
     * Adds the specified user to the specified group and returns a `UserGroupMembership` object with its own OCID.
     * <p>
     * After you send your request, the new object's `lifecycleState` will temporarily be CREATING. Before using the
     * object, first make sure its `lifecycleState` has changed to ACTIVE.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation will not retry by default, users can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to enable retries for it.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/identity/AddUserToGroupExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use AddUserToGroup API.
     */
    AddUserToGroupResponse addUserToGroup(AddUserToGroupRequest request);

    /**
     * Assembles tag defaults in the specified compartment and any parent compartments to determine
     * the tags to apply. Tag defaults from parent compartments do not override tag defaults
     * referencing the same tag in a compartment lower down the hierarchy. This set of tag defaults
     * includes all tag defaults from the current compartment back to the root compartment.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation will not retry by default, users can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to enable retries for it.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/identity/AssembleEffectiveTagSetExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use AssembleEffectiveTagSet API.
     */
    AssembleEffectiveTagSetResponse assembleEffectiveTagSet(AssembleEffectiveTagSetRequest request);

    /**
     * Deletes multiple resources in the compartment. All resources must be in the same compartment. You must have the appropriate
     * permissions to delete the resources in the request. This API can only be invoked from the tenancy's
     * [home region](https://docs.cloud.oracle.com/Content/Identity/Tasks/managingregions.htm#Home). This operation creates a
     * {@link WorkRequest}. Use the {@link #getWorkRequest(GetWorkRequestRequest) getWorkRequest}
     * API to monitor the status of the bulk action.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation will not retry by default, users can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to enable retries for it.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/identity/BulkDeleteResourcesExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use BulkDeleteResources API.
     */
    BulkDeleteResourcesResponse bulkDeleteResources(BulkDeleteResourcesRequest request);

    /**
     * Deletes the specified tag key definitions. This operation triggers a process that removes the
     * tags from all resources in your tenancy. The tag key definitions must be within the same tag namespace.
     * <p>
     * The following actions happen immediately:
     * \u00A0
     *   * If the tag is a cost-tracking tag, the tag no longer counts against your
     *   10 cost-tracking tags limit, even if you do not disable the tag before running this operation.
     *   * If the tag is used with dynamic groups, the rules that contain the tag are no longer
     *   evaluated against the tag.
     * <p>
     * After you start this operation, the state of the tag changes to DELETING, and tag removal
     * from resources begins. This process can take up to 48 hours depending on the number of resources that
     * are tagged and the regions in which those resources reside.
     * <p>
     * When all tags have been removed, the state changes to DELETED. You cannot restore a deleted tag. After the tag state
     * changes to DELETED, you can use the same tag name again.
     * <p>
     * After you start this operation, you cannot start either the {@link #deleteTag(DeleteTagRequest) deleteTag} or the {@link #cascadeDeleteTagNamespace(CascadeDeleteTagNamespaceRequest) cascadeDeleteTagNamespace} operation until this process completes.
     * <p>
     * In order to delete tags, you must first retire the tags. Use {@link #updateTag(UpdateTagRequest) updateTag}
     * to retire a tag.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation will not retry by default, users can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to enable retries for it.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/identity/BulkDeleteTagsExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use BulkDeleteTags API.
     */
    BulkDeleteTagsResponse bulkDeleteTags(BulkDeleteTagsRequest request);

    /**
     * Edits the specified list of tag key definitions for the selected resources.
     * This operation triggers a process that edits the tags on all selected resources. The possible actions are:
     * <p>
     * Add a defined tag when the tag does not already exist on the resource.
     *   * Update the value for a defined tag when the tag is present on the resource.
     *   * Add a defined tag when it does not already exist on the resource or update the value for a defined tag when the tag is present on the resource.
     *   * Remove a defined tag from a resource. The tag is removed from the resource regardless of the tag value.
     * <p>
     * See {@link #bulkEditOperationDetails(BulkEditOperationDetailsRequest) bulkEditOperationDetails} for more information.
     * <p>
     * The edits can include a combination of operations and tag sets.
     * However, multiple operations cannot apply to one key definition in the same request.
     * For example, if one request adds `tag set-1` to a resource and sets a tag value to `tag set-2`,
     * `tag set-1` and `tag set-2` cannot have any common tag definitions.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation will not retry by default, users can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to enable retries for it.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/identity/BulkEditTagsExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use BulkEditTags API.
     */
    BulkEditTagsResponse bulkEditTags(BulkEditTagsRequest request);

    /**
     * Moves multiple resources from one compartment to another. All resources must be in the same compartment.
     * This API can only be invoked from the tenancy's [home region](https://docs.cloud.oracle.com/Content/Identity/Tasks/managingregions.htm#Home).
     * To move resources, you must have the appropriate permissions to move the resource in both the source and target
     * compartments. This operation creates a {@link WorkRequest}.
     * Use the {@link #getWorkRequest(GetWorkRequestRequest) getWorkRequest} API to monitor the status of the bulk action.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation will not retry by default, users can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to enable retries for it.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/identity/BulkMoveResourcesExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use BulkMoveResources API.
     */
    BulkMoveResourcesResponse bulkMoveResources(BulkMoveResourcesRequest request);

    /**
     * Deletes the specified tag namespace. This operation triggers a process that removes all of the tags
     * defined in the specified tag namespace from all resources in your tenancy and then deletes the tag namespace.
     * <p>
     * After you start the delete operation:
     * <p>
     * New tag key definitions cannot be created under the namespace.
     *   * The state of the tag namespace changes to DELETING.
     *   * Tag removal from the resources begins.
     * <p>
     * This process can take up to 48 hours depending on the number of tag definitions in the namespace, the number of resources
     * that are tagged, and the locations of the regions in which those resources reside.
     * <p>
     * After all tags are removed, the state changes to DELETED. You cannot restore a deleted tag namespace. After the deleted tag namespace
     * changes its state to DELETED, you can use the name of the deleted tag namespace again.
     * <p>
     * After you start this operation, you cannot start either the {@link #deleteTag(DeleteTagRequest) deleteTag} or the {@link #bulkDeleteTags(BulkDeleteTagsRequest) bulkDeleteTags} operation until this process completes.
     * <p>
     * To delete a tag namespace, you must first retire it. Use {@link #updateTagNamespace(UpdateTagNamespaceRequest) updateTagNamespace}
     * to retire a tag namespace.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation will not retry by default, users can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to enable retries for it.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/identity/CascadeDeleteTagNamespaceExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use CascadeDeleteTagNamespace API.
     */
    CascadeDeleteTagNamespaceResponse cascadeDeleteTagNamespace(
            CascadeDeleteTagNamespaceRequest request);

    /**
     * Change the containing compartment for a domain.
     * <p>
     * This is an asynchronous call where the Domain's compartment is changed and is updated with the new compartment information.
     * To track progress, HTTP GET on /iamWorkRequests/{iamWorkRequestsId} endpoint will provide
     * the async operation's status.
     * <p>
     * The compartment change is complete when accessed via domain URL and
     * also returns new compartment OCID.
     * - If the domain doesn't exists, returns 404 NOT FOUND.
     * - If Domain {@code type} is DEFAULT or DEFAULT_LIGHTWEIGHT, return 400 BAD Request
     * - If Domain is not active or being updated, returns 400 BAD REQUEST.
     * - If error occurs while changing compartment for domain, return 500 INTERNAL SERVER ERROR.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation will not retry by default, users can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to enable retries for it.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/identity/ChangeDomainCompartmentExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use ChangeDomainCompartment API.
     */
    ChangeDomainCompartmentResponse changeDomainCompartment(ChangeDomainCompartmentRequest request);

    /**
     * If the domain's {@code lifecycleState} is ACTIVE, validates the requested {@code licenseType} update
     * is allowed and
     * 1. Set the {@code lifecycleDetails} to UPDATING
     * 2. Asynchronously starts updating the domain and return 202 ACCEPTED.
     *     2.1 Successfully updates specified domain's {@code licenseType}.
     * 3. On completion set the {@code lifecycleDetails} to null.
     * To track progress, HTTP GET on /iamWorkRequests/{iamWorkRequestsId} endpoint will provide
     * the async operation's status.
     * <p>
     * - If license type update is successful, return 202 ACCEPTED
     * - If requested {@code licenseType} validation fails, returns 400 Bad request.
     * - If Domain is not active or being updated, returns 400 BAD REQUEST.
     * - If Domain {@code type} is DEFAULT or DEFAULT_LIGHTWEIGHT, return 400 BAD Request
     * - If the domain doesn't exists, returns 404 NOT FOUND
     * - If any internal error occurs, returns 500 INTERNAL SERVER ERROR.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation will not retry by default, users can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to enable retries for it.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/identity/ChangeDomainLicenseTypeExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use ChangeDomainLicenseType API.
     */
    ChangeDomainLicenseTypeResponse changeDomainLicenseType(ChangeDomainLicenseTypeRequest request);

    /**
     * Moves the specified tag namespace to the specified compartment within the same tenancy.
     * <p>
     * To move the tag namespace, you must have the manage tag-namespaces permission on both compartments.
     * For more information about IAM policies, see [Details for IAM](https://docs.cloud.oracle.com/Content/Identity/Reference/iampolicyreference.htm).
     * <p>
     * Moving a tag namespace moves all the tag key definitions contained in the tag namespace.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation will not retry by default, users can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to enable retries for it.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/identity/ChangeTagNamespaceCompartmentExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use ChangeTagNamespaceCompartment API.
     */
    ChangeTagNamespaceCompartmentResponse changeTagNamespaceCompartment(
            ChangeTagNamespaceCompartmentRequest request);

    /**
     * Creates a new auth token for the specified user. For information about what auth tokens are for, see
     * [Managing User Credentials](https://docs.cloud.oracle.com/Content/Identity/Tasks/managingcredentials.htm).
     * <p>
     * You must specify a *description* for the auth token (although it can be an empty string). It does not
     * have to be unique, and you can change it anytime with
     * {@link #updateAuthToken(UpdateAuthTokenRequest) updateAuthToken}.
     * <p>
     * Every user has permission to create an auth token for *their own user ID*. An administrator in your organization
     * does not need to write a policy to give users this ability. To compare, administrators who have permission to the
     * tenancy can use this operation to create an auth token for any user, including themselves.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation will not retry by default, users can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to enable retries for it.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/identity/CreateAuthTokenExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use CreateAuthToken API.
     */
    CreateAuthTokenResponse createAuthToken(CreateAuthTokenRequest request);

    /**
     * Creates a new compartment in the specified compartment.
     * <p>
     **Important:** Compartments cannot be deleted.
     * <p>
     * Specify the parent compartment's OCID as the compartment ID in the request object. Remember that the tenancy
     * is simply the root compartment. For information about OCIDs, see
     * [Resource Identifiers](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm).
     * <p>
     * You must also specify a *name* for the compartment, which must be unique across all compartments in
     * your tenancy. You can use this name or the OCID when writing policies that apply
     * to the compartment. For more information about policies, see
     * [How Policies Work](https://docs.cloud.oracle.com/Content/Identity/Concepts/policies.htm).
     * <p>
     * You must also specify a *description* for the compartment (although it can be an empty string). It does
     * not have to be unique, and you can change it anytime with
     * {@link #updateCompartment(UpdateCompartmentRequest) updateCompartment}.
     * <p>
     * After you send your request, the new object's `lifecycleState` will temporarily be CREATING. Before using the
     * object, first make sure its `lifecycleState` has changed to ACTIVE.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation will not retry by default, users can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to enable retries for it.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/identity/CreateCompartmentExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use CreateCompartment API.
     */
    CreateCompartmentResponse createCompartment(CreateCompartmentRequest request);

    /**
     * Creates a new secret key for the specified user. Secret keys are used for authentication with the Object Storage Service's Amazon S3
     * compatible API. The secret key consists of an Access Key/Secret Key pair. For information, see
     * [Managing User Credentials](https://docs.cloud.oracle.com/Content/Identity/Tasks/managingcredentials.htm).
     * <p>
     * You must specify a *description* for the secret key (although it can be an empty string). It does not
     * have to be unique, and you can change it anytime with
     * {@link #updateCustomerSecretKey(UpdateCustomerSecretKeyRequest) updateCustomerSecretKey}.
     * <p>
     * Every user has permission to create a secret key for *their own user ID*. An administrator in your organization
     * does not need to write a policy to give users this ability. To compare, administrators who have permission to the
     * tenancy can use this operation to create a secret key for any user, including themselves.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation will not retry by default, users can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to enable retries for it.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/identity/CreateCustomerSecretKeyExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use CreateCustomerSecretKey API.
     */
    CreateCustomerSecretKeyResponse createCustomerSecretKey(CreateCustomerSecretKeyRequest request);

    /**
     * Creates a new domain in the tenancy with domain home in {@code homeRegion}. This is an asynchronous call - where, at start,
     * {@code lifecycleState} of this domain is set to CREATING and {@code lifecycleDetails} to UPDATING. On domain creation completion
     * this Domain's {@code lifecycleState} will be set to ACTIVE and {@code lifecycleDetails} to null.
     * <p>
     * To track progress, HTTP GET on /iamWorkRequests/{iamWorkRequestsId} endpoint will provide
     * the async operation's status.
     * <p>
     * After creating a `Domain`, make sure its `lifecycleState` changes from CREATING to ACTIVE
     * before using it.
     * If the domain's {@code displayName} already exists, returns 400 BAD REQUEST.
     * If any one of admin related fields are provided and one of the following 3 fields
     * - {@code adminEmail}, {@code adminLastName} and {@code adminUserName} - is not provided,
     * returns 400 BAD REQUEST.
     * - If {@code isNotificationBypassed} is NOT provided when admin information is provided,
     * returns 400 BAD REQUEST.
     * - If any internal error occurs, return 500 INTERNAL SERVER ERROR.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation will not retry by default, users can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to enable retries for it.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/identity/CreateDomainExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use CreateDomain API.
     */
    CreateDomainResponse createDomain(CreateDomainRequest request);

    /**
     * Creates a new dynamic group in your tenancy.
     * <p>
     * You must specify your tenancy's OCID as the compartment ID in the request object (remember that the tenancy
     * is simply the root compartment). Notice that IAM resources (users, groups, compartments, and some policies)
     * reside within the tenancy itself, unlike cloud resources such as compute instances, which typically
     * reside within compartments inside the tenancy. For information about OCIDs, see
     * [Resource Identifiers](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm).
     * <p>
     * You must also specify a *name* for the dynamic group, which must be unique across all dynamic groups in your
     * tenancy, and cannot be changed. Note that this name has to be also unique across all groups in your tenancy.
     * You can use this name or the OCID when writing policies that apply to the dynamic group. For more information
     * about policies, see [How Policies Work](https://docs.cloud.oracle.com/Content/Identity/Concepts/policies.htm).
     * <p>
     * You must also specify a *description* for the dynamic group (although it can be an empty string). It does not
     * have to be unique, and you can change it anytime with {@link #updateDynamicGroup(UpdateDynamicGroupRequest) updateDynamicGroup}.
     * <p>
     * After you send your request, the new object's `lifecycleState` will temporarily be CREATING. Before using the
     * object, first make sure its `lifecycleState` has changed to ACTIVE.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation will not retry by default, users can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to enable retries for it.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/identity/CreateDynamicGroupExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use CreateDynamicGroup API.
     */
    CreateDynamicGroupResponse createDynamicGroup(CreateDynamicGroupRequest request);

    /**
     * Creates a new group in your tenancy.
     * <p>
     * You must specify your tenancy's OCID as the compartment ID in the request object (remember that the tenancy
     * is simply the root compartment). Notice that IAM resources (users, groups, compartments, and some policies)
     * reside within the tenancy itself, unlike cloud resources such as compute instances, which typically
     * reside within compartments inside the tenancy. For information about OCIDs, see
     * [Resource Identifiers](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm).
     * <p>
     * You must also specify a *name* for the group, which must be unique across all groups in your tenancy and
     * cannot be changed. You can use this name or the OCID when writing policies that apply to the group. For more
     * information about policies, see [How Policies Work](https://docs.cloud.oracle.com/Content/Identity/Concepts/policies.htm).
     * <p>
     * You must also specify a *description* for the group (although it can be an empty string). It does not
     * have to be unique, and you can change it anytime with {@link #updateGroup(UpdateGroupRequest) updateGroup}.
     * <p>
     * After you send your request, the new object's `lifecycleState` will temporarily be CREATING. Before using the
     * object, first make sure its `lifecycleState` has changed to ACTIVE.
     * <p>
     * After creating the group, you need to put users in it and write policies for it.
     * See {@link #addUserToGroup(AddUserToGroupRequest) addUserToGroup} and
     * {@link #createPolicy(CreatePolicyRequest) createPolicy}.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation will not retry by default, users can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to enable retries for it.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/identity/CreateGroupExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use CreateGroup API.
     */
    CreateGroupResponse createGroup(CreateGroupRequest request);

    /**
     * **Deprecated.** For more information, see [Deprecated IAM Service APIs](https://docs.cloud.oracle.com/Content/Identity/Reference/deprecatediamapis.htm).
     * <p>
     * Creates a new identity provider in your tenancy. For more information, see
     * [Identity Providers and Federation](https://docs.cloud.oracle.com/Content/Identity/Concepts/federation.htm).
     * <p>
     * You must specify your tenancy's OCID as the compartment ID in the request object.
     * Remember that the tenancy is simply the root compartment. For information about
     * OCIDs, see [Resource Identifiers](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm).
     * <p>
     * You must also specify a *name* for the `IdentityProvider`, which must be unique
     * across all `IdentityProvider` objects in your tenancy and cannot be changed.
     * <p>
     * You must also specify a *description* for the `IdentityProvider` (although
     * it can be an empty string). It does not have to be unique, and you can change
     * it anytime with
     * {@link #updateIdentityProvider(UpdateIdentityProviderRequest) updateIdentityProvider}.
     * <p>
     * After you send your request, the new object's `lifecycleState` will temporarily
     * be CREATING. Before using the object, first make sure its `lifecycleState` has
     * changed to ACTIVE.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation will not retry by default, users can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to enable retries for it.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/identity/CreateIdentityProviderExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use CreateIdentityProvider API.
     */
    CreateIdentityProviderResponse createIdentityProvider(CreateIdentityProviderRequest request);

    /**
     * **Deprecated.** For more information, see [Deprecated IAM Service APIs](https://docs.cloud.oracle.com/Content/Identity/Reference/deprecatediamapis.htm).
     * <p>
     * Creates a single mapping between an IdP group and an IAM Service
     * {@link Group}.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation will not retry by default, users can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to enable retries for it.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/identity/CreateIdpGroupMappingExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use CreateIdpGroupMapping API.
     */
    CreateIdpGroupMappingResponse createIdpGroupMapping(CreateIdpGroupMappingRequest request);

    /**
     * Creates a new MFA TOTP device for the user. A user can have one MFA TOTP device.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation will not retry by default, users can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to enable retries for it.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/identity/CreateMfaTotpDeviceExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use CreateMfaTotpDevice API.
     */
    CreateMfaTotpDeviceResponse createMfaTotpDevice(CreateMfaTotpDeviceRequest request);

    /**
     * Creates a new network source in your tenancy.
     * <p>
     * You must specify your tenancy's OCID as the compartment ID in the request object (remember that the tenancy
     * is simply the root compartment). Notice that IAM resources (users, groups, compartments, and some policies)
     * reside within the tenancy itself, unlike cloud resources such as compute instances, which typically
     * reside within compartments inside the tenancy. For information about OCIDs, see
     * [Resource Identifiers](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm).
     * <p>
     * You must also specify a *name* for the network source, which must be unique across all network sources in your
     * tenancy, and cannot be changed.
     * You can use this name or the OCID when writing policies that apply to the network source. For more information
     * about policies, see [How Policies Work](https://docs.cloud.oracle.com/Content/Identity/Concepts/policies.htm).
     * <p>
     * You must also specify a *description* for the network source (although it can be an empty string). It does not
     * have to be unique, and you can change it anytime with {@link #updateNetworkSource(UpdateNetworkSourceRequest) updateNetworkSource}.
     * <p>
     * After you send your request, the new object's `lifecycleState` will temporarily be CREATING. Before using the
     * object, first make sure its `lifecycleState` has changed to ACTIVE.
     * <p>
     * After your network resource is created, you can use it in policy to restrict access to only requests made from an allowed
     * IP address specified in your network source. For more information, see [Managing Network Sources](https://docs.cloud.oracle.com/Content/Identity/Tasks/managingnetworksources.htm).
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation will not retry by default, users can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to enable retries for it.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/identity/CreateNetworkSourceExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use CreateNetworkSource API.
     */
    CreateNetworkSourceResponse createNetworkSource(CreateNetworkSourceRequest request);

    /**
     * Creates Oauth token for the user
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation will not retry by default, users can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to enable retries for it.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/identity/CreateOAuthClientCredentialExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use CreateOAuthClientCredential API.
     */
    CreateOAuthClientCredentialResponse createOAuthClientCredential(
            CreateOAuthClientCredentialRequest request);

    /**
     * Creates a new Console one-time password for the specified user. For more information about user
     * credentials, see [User Credentials](https://docs.cloud.oracle.com/Content/Identity/Concepts/usercredentials.htm).
     * <p>
     * Use this operation after creating a new user, or if a user forgets their password. The new one-time
     * password is returned to you in the response, and you must securely deliver it to the user. They'll
     * be prompted to change this password the next time they sign in to the Console. If they don't change
     * it within 7 days, the password will expire and you'll need to create a new one-time password for the
     * user.
     * <p>
     **Note:** The user's Console login is the unique name you specified when you created the user
     * (see {@link #createUser(CreateUserRequest) createUser}).
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation will not retry by default, users can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to enable retries for it.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/identity/CreateOrResetUIPasswordExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use CreateOrResetUIPassword API.
     */
    CreateOrResetUIPasswordResponse createOrResetUIPassword(CreateOrResetUIPasswordRequest request);

    /**
     * Creates a new policy in the specified compartment (either the tenancy or another of your compartments).
     * If you're new to policies, see [Getting Started with Policies](https://docs.cloud.oracle.com/Content/Identity/Concepts/policygetstarted.htm).
     * <p>
     * You must specify a *name* for the policy, which must be unique across all policies in your tenancy
     * and cannot be changed.
     * <p>
     * You must also specify a *description* for the policy (although it can be an empty string). It does not
     * have to be unique, and you can change it anytime with {@link #updatePolicy(UpdatePolicyRequest) updatePolicy}.
     * <p>
     * You must specify one or more policy statements in the statements array. For information about writing
     * policies, see [How Policies Work](https://docs.cloud.oracle.com/Content/Identity/Concepts/policies.htm) and
     * [Common Policies](https://docs.cloud.oracle.com/Content/Identity/Concepts/commonpolicies.htm).
     * <p>
     * After you send your request, the new object's `lifecycleState` will temporarily be CREATING. Before using the
     * object, first make sure its `lifecycleState` has changed to ACTIVE.
     * <p>
     * New policies take effect typically within 10 seconds.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation will not retry by default, users can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to enable retries for it.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/identity/CreatePolicyExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use CreatePolicy API.
     */
    CreatePolicyResponse createPolicy(CreatePolicyRequest request);

    /**
     * Creates a subscription to a region for a tenancy.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation will not retry by default, users can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to enable retries for it.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/identity/CreateRegionSubscriptionExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use CreateRegionSubscription API.
     */
    CreateRegionSubscriptionResponse createRegionSubscription(
            CreateRegionSubscriptionRequest request);

    /**
     * Creates a new SMTP credential for the specified user. An SMTP credential has an SMTP user name and an SMTP password.
     * You must specify a *description* for the SMTP credential (although it can be an empty string). It does not
     * have to be unique, and you can change it anytime with
     * {@link #updateSmtpCredential(UpdateSmtpCredentialRequest) updateSmtpCredential}.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation will not retry by default, users can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to enable retries for it.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/identity/CreateSmtpCredentialExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use CreateSmtpCredential API.
     */
    CreateSmtpCredentialResponse createSmtpCredential(CreateSmtpCredentialRequest request);

    /**
     * **Deprecated. Use {@link #createAuthToken(CreateAuthTokenRequest) createAuthToken} instead.**
     * <p>
     * Creates a new Swift password for the specified user. For information about what Swift passwords are for, see
     * [Managing User Credentials](https://docs.cloud.oracle.com/Content/Identity/Tasks/managingcredentials.htm).
     * <p>
     * You must specify a *description* for the Swift password (although it can be an empty string). It does not
     * have to be unique, and you can change it anytime with
     * {@link #updateSwiftPassword(UpdateSwiftPasswordRequest) updateSwiftPassword}.
     * <p>
     * Every user has permission to create a Swift password for *their own user ID*. An administrator in your organization
     * does not need to write a policy to give users this ability. To compare, administrators who have permission to the
     * tenancy can use this operation to create a Swift password for any user, including themselves.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation will not retry by default, users can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to enable retries for it.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/identity/CreateSwiftPasswordExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use CreateSwiftPassword API.
     */
    CreateSwiftPasswordResponse createSwiftPassword(CreateSwiftPasswordRequest request);

    /**
     * Creates a new tag in the specified tag namespace.
     * <p>
     * The tag requires either the OCID or the name of the tag namespace that will contain this
     * tag definition.
     * <p>
     * You must specify a *name* for the tag, which must be unique across all tags in the tag namespace
     * and cannot be changed. The name can contain any ASCII character except the space (_) or period (.) characters.
     * Names are case insensitive. That means, for example, \"myTag\" and \"mytag\" are not allowed in the same namespace.
     * If you specify a name that's already in use in the tag namespace, a 409 error is returned.
     * <p>
     * The tag must have a *description*. It does not have to be unique, and you can change it with
     * {@link #updateTag(UpdateTagRequest) updateTag}.
     * <p>
     * The tag must have a value type, which is specified with a validator. Tags can use either a
     * static value or a list of possible values. Static values are entered by a user applying the tag
     * to a resource. Lists are created by you and the user must apply a value from the list. Lists
     * are validiated.
     * <p>
     * If no `validator` is set, the user applying the tag to a resource can type in a static
     * value or leave the tag value empty.
     * * If a `validator` is set, the user applying the tag to a resource must select from a list
     * of values that you supply with {@link #enumTagDefinitionValidator(EnumTagDefinitionValidatorRequest) enumTagDefinitionValidator}.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation will not retry by default, users can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to enable retries for it.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/identity/CreateTagExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use CreateTag API.
     */
    CreateTagResponse createTag(CreateTagRequest request);

    /**
     * Creates a new tag default in the specified compartment for the specified tag definition.
     * <p>
     * If you specify that a value is required, a value is set during resource creation (either by
     * the user creating the resource or another tag defualt). If no value is set, resource creation
     * is blocked.
     * <p>
     * If the `isRequired` flag is set to \"true\", the value is set during resource creation.
     * * If the `isRequired` flag is set to \"false\", the value you enter is set during resource creation.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation will not retry by default, users can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to enable retries for it.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/identity/CreateTagDefaultExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use CreateTagDefault API.
     */
    CreateTagDefaultResponse createTagDefault(CreateTagDefaultRequest request);

    /**
     * Creates a new tag namespace in the specified compartment.
     * <p>
     * You must specify the compartment ID in the request object (remember that the tenancy is simply the root
     * compartment).
     * <p>
     * You must also specify a *name* for the namespace, which must be unique across all namespaces in your tenancy
     * and cannot be changed. The name can contain any ASCII character except the space (_) or period (.).
     * Names are case insensitive. That means, for example, \"myNamespace\" and \"mynamespace\" are not allowed
     * in the same tenancy. Once you created a namespace, you cannot change the name.
     * If you specify a name that's already in use in the tenancy, a 409 error is returned.
     * <p>
     * You must also specify a *description* for the namespace.
     * It does not have to be unique, and you can change it with
     * {@link #updateTagNamespace(UpdateTagNamespaceRequest) updateTagNamespace}.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation will not retry by default, users can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to enable retries for it.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/identity/CreateTagNamespaceExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use CreateTagNamespace API.
     */
    CreateTagNamespaceResponse createTagNamespace(CreateTagNamespaceRequest request);

    /**
     * Creates a new user in your tenancy. For conceptual information about users, your tenancy, and other
     * IAM Service components, see [Overview of the IAM Service](https://docs.cloud.oracle.com/Content/Identity/Concepts/overview.htm).
     * <p>
     * You must specify your tenancy's OCID as the compartment ID in the request object (remember that the
     * tenancy is simply the root compartment). Notice that IAM resources (users, groups, compartments, and
     * some policies) reside within the tenancy itself, unlike cloud resources such as compute instances,
     * which typically reside within compartments inside the tenancy. For information about OCIDs, see
     * [Resource Identifiers](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm).
     * <p>
     * You must also specify a *name* for the user, which must be unique across all users in your tenancy
     * and cannot be changed. Allowed characters: No spaces. Only letters, numerals, hyphens, periods,
     * underscores, +, and @. If you specify a name that's already in use, you'll get a 409 error.
     * This name will be the user's login to the Console. You might want to pick a
     * name that your company's own identity system (e.g., Active Directory, LDAP, etc.) already uses.
     * If you delete a user and then create a new user with the same name, they'll be considered different
     * users because they have different OCIDs.
     * <p>
     * You must also specify a *description* for the user (although it can be an empty string).
     * It does not have to be unique, and you can change it anytime with
     * {@link #updateUser(UpdateUserRequest) updateUser}. You can use the field to provide the user's
     * full name, a description, a nickname, or other information to generally identify the user.
     * <p>
     * After you send your request, the new object's `lifecycleState` will temporarily be CREATING. Before
     * using the object, first make sure its `lifecycleState` has changed to ACTIVE.
     * <p>
     * A new user has no permissions until you place the user in one or more groups (see
     * {@link #addUserToGroup(AddUserToGroupRequest) addUserToGroup}). If the user needs to
     * access the Console, you need to provide the user a password (see
     * {@link #createOrResetUIPassword(CreateOrResetUIPasswordRequest) createOrResetUIPassword}).
     * If the user needs to access the Oracle Cloud Infrastructure REST API, you need to upload a
     * public API signing key for that user (see
     * [Required Keys and OCIDs](https://docs.cloud.oracle.com/Content/API/Concepts/apisigningkey.htm) and also
     * {@link #uploadApiKey(UploadApiKeyRequest) uploadApiKey}).
     * <p>
     **Important:** Make sure to inform the new user which compartment(s) they have access to.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation will not retry by default, users can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to enable retries for it.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/identity/CreateUserExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use CreateUser API.
     */
    CreateUserResponse createUser(CreateUserRequest request);

    /**
     * If the domain's {@code lifecycleState} is ACTIVE and no active Apps are present in domain,
     * 1. Set the {@code lifecycleDetails} to DEACTIVATING and asynchronously starts disabling
     *    the domain and return 202 ACCEPTED.
     *     1.1 Sets the domain status to DISABLED and set specified domain's
     *         {@code lifecycleState} to INACTIVE and set the {@code lifecycleDetails} to null.
     * <p>
     * To track progress, HTTP GET on /iamWorkRequests/{iamWorkRequestsId} endpoint will provide
     * the async operation's status. Activate a domain can be done using HTTP POST
     * /domains/{domainId}/actions/activate.
     * <p>
     * - If the domain's {@code lifecycleState} is INACTIVE, returns 202 ACCEPTED with no action
     *   taken on service side.
     * - If domain is of {@code type} DEFAULT or DEFAULT_LIGHTWEIGHT or domain's {@code lifecycleState}
     *   is not ACTIVE, returns 400 BAD REQUEST.
     * - If the domain doesn't exists, returns 404 NOT FOUND.
     * - If any active Apps in domain, returns 400 BAD REQUEST.
     * - If the authenticated user is part of the domain to be activated, returns 400 BAD REQUEST
     * - If error occurs while deactivating domain, returns 500 INTERNAL SERVER ERROR.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation will not retry by default, users can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to enable retries for it.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/identity/DeactivateDomainExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use DeactivateDomain API.
     */
    DeactivateDomainResponse deactivateDomain(DeactivateDomainRequest request);

    /**
     * Deletes the specified API signing key for the specified user.
     * <p>
     * Every user has permission to use this operation to delete a key for *their own user ID*. An
     * administrator in your organization does not need to write a policy to give users this ability.
     * To compare, administrators who have permission to the tenancy can use this operation to delete
     * a key for any user, including themselves.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation will not retry by default, users can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to enable retries for it.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/identity/DeleteApiKeyExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use DeleteApiKey API.
     */
    DeleteApiKeyResponse deleteApiKey(DeleteApiKeyRequest request);

    /**
     * Deletes the specified auth token for the specified user.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation will not retry by default, users can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to enable retries for it.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/identity/DeleteAuthTokenExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use DeleteAuthToken API.
     */
    DeleteAuthTokenResponse deleteAuthToken(DeleteAuthTokenRequest request);

    /**
     * Deletes the specified compartment. The compartment must be empty.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation will not retry by default, users can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to enable retries for it.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/identity/DeleteCompartmentExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use DeleteCompartment API.
     */
    DeleteCompartmentResponse deleteCompartment(DeleteCompartmentRequest request);

    /**
     * Deletes the specified secret key for the specified user.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation will not retry by default, users can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to enable retries for it.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/identity/DeleteCustomerSecretKeyExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use DeleteCustomerSecretKey API.
     */
    DeleteCustomerSecretKeyResponse deleteCustomerSecretKey(DeleteCustomerSecretKeyRequest request);

    /**
     * Soft Deletes a domain.
     * <p>
     * This is an asynchronous API, where, if the domain's {@code lifecycleState} is INACTIVE and
     * no active Apps are present in underlying stripe,
     *   1. Sets the specified domain's {@code lifecycleState} to DELETING.
     *   2. Domains marked as DELETING will be cleaned up by a periodic task unless customer request it to be undo via ticket.
     *   3. Work request is created and returned as opc-work-request-id along with 202 ACCEPTED.
     * To track progress, HTTP GET on /iamWorkRequests/{iamWorkRequestsId} endpoint will provide
     * the async operation's status.
     * <p>
     * - If the domain's {@code lifecycleState} is DELETING, returns 202 Accepted as a deletion
     *   is already in progress for this domain.
     * - If the domain doesn't exists, returns 404 NOT FOUND.
     * - If domain is of {@code type} DEFAULT or DEFAULT_LIGHTWEIGHT, returns 400 BAD REQUEST.
     * - If any active Apps in domain, returns 400 BAD REQUEST.
     * - If the authenticated user is part of the domain to be deleted, returns 400 BAD REQUEST.
     * - If any internal error occurs, return 500 INTERNAL SERVER ERROR.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation will not retry by default, users can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to enable retries for it.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/identity/DeleteDomainExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use DeleteDomain API.
     */
    DeleteDomainResponse deleteDomain(DeleteDomainRequest request);

    /**
     * Deletes the specified dynamic group.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation will not retry by default, users can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to enable retries for it.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/identity/DeleteDynamicGroupExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use DeleteDynamicGroup API.
     */
    DeleteDynamicGroupResponse deleteDynamicGroup(DeleteDynamicGroupRequest request);

    /**
     * Deletes the specified group. The group must be empty.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation will not retry by default, users can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to enable retries for it.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/identity/DeleteGroupExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use DeleteGroup API.
     */
    DeleteGroupResponse deleteGroup(DeleteGroupRequest request);

    /**
     * **Deprecated.** For more information, see [Deprecated IAM Service APIs](https://docs.cloud.oracle.com/Content/Identity/Reference/deprecatediamapis.htm).
     * <p>
     * Deletes the specified identity provider. The identity provider must not have
     * any group mappings (see {@link IdpGroupMapping}).
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation will not retry by default, users can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to enable retries for it.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/identity/DeleteIdentityProviderExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use DeleteIdentityProvider API.
     */
    DeleteIdentityProviderResponse deleteIdentityProvider(DeleteIdentityProviderRequest request);

    /**
     * **Deprecated.** For more information, see [Deprecated IAM Service APIs](https://docs.cloud.oracle.com/Content/Identity/Reference/deprecatediamapis.htm).
     * <p>
     * Deletes the specified group mapping.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation will not retry by default, users can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to enable retries for it.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/identity/DeleteIdpGroupMappingExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use DeleteIdpGroupMapping API.
     */
    DeleteIdpGroupMappingResponse deleteIdpGroupMapping(DeleteIdpGroupMappingRequest request);

    /**
     * Deletes the specified MFA TOTP device for the specified user.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation will not retry by default, users can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to enable retries for it.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/identity/DeleteMfaTotpDeviceExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use DeleteMfaTotpDevice API.
     */
    DeleteMfaTotpDeviceResponse deleteMfaTotpDevice(DeleteMfaTotpDeviceRequest request);

    /**
     * Deletes the specified network source
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation will not retry by default, users can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to enable retries for it.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/identity/DeleteNetworkSourceExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use DeleteNetworkSource API.
     */
    DeleteNetworkSourceResponse deleteNetworkSource(DeleteNetworkSourceRequest request);

    /**
     * Delete Oauth token for the user
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation will not retry by default, users can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to enable retries for it.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/identity/DeleteOAuthClientCredentialExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use DeleteOAuthClientCredential API.
     */
    DeleteOAuthClientCredentialResponse deleteOAuthClientCredential(
            DeleteOAuthClientCredentialRequest request);

    /**
     * Deletes the specified policy. The deletion takes effect typically within 10 seconds.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation will not retry by default, users can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to enable retries for it.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/identity/DeletePolicyExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use DeletePolicy API.
     */
    DeletePolicyResponse deletePolicy(DeletePolicyRequest request);

    /**
     * Deletes the specified SMTP credential for the specified user.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation will not retry by default, users can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to enable retries for it.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/identity/DeleteSmtpCredentialExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use DeleteSmtpCredential API.
     */
    DeleteSmtpCredentialResponse deleteSmtpCredential(DeleteSmtpCredentialRequest request);

    /**
     * **Deprecated. Use {@link #deleteAuthToken(DeleteAuthTokenRequest) deleteAuthToken} instead.**
     * <p>
     * Deletes the specified Swift password for the specified user.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation will not retry by default, users can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to enable retries for it.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/identity/DeleteSwiftPasswordExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use DeleteSwiftPassword API.
     */
    DeleteSwiftPasswordResponse deleteSwiftPassword(DeleteSwiftPasswordRequest request);

    /**
     * Deletes the specified tag definition. This operation triggers a process that removes the
     * tag from all resources in your tenancy.
     * <p>
     * These things happen immediately:
     * \u00A0
     *   * If the tag was a cost-tracking tag, it no longer counts against your 10 cost-tracking
     *   tags limit, whether you first disabled it or not.
     *   * If the tag was used with dynamic groups, none of the rules that contain the tag will
     *   be evaluated against the tag.
     * <p>
     * When you start the delete operation, the state of the tag changes to DELETING and tag removal
     * from resources begins. This can take up to 48 hours depending on the number of resources that
     * were tagged as well as the regions in which those resources reside.
     * <p>
     * When all tags have been removed, the state changes to DELETED. You cannot restore a deleted tag. Once the deleted tag
     * changes its state to DELETED, you can use the same tag name again.
     * <p>
     * After you start this operation, you cannot start either the {@link #bulkDeleteTags(BulkDeleteTagsRequest) bulkDeleteTags} or the {@link #cascadeDeleteTagNamespace(CascadeDeleteTagNamespaceRequest) cascadeDeleteTagNamespace} operation until this process completes.
     * <p>
     * To delete a tag, you must first retire it. Use {@link #updateTag(UpdateTagRequest) updateTag}
     * to retire a tag.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation will not retry by default, users can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to enable retries for it.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/identity/DeleteTagExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use DeleteTag API.
     */
    DeleteTagResponse deleteTag(DeleteTagRequest request);

    /**
     * Deletes the the specified tag default.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation will not retry by default, users can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to enable retries for it.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/identity/DeleteTagDefaultExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use DeleteTagDefault API.
     */
    DeleteTagDefaultResponse deleteTagDefault(DeleteTagDefaultRequest request);

    /**
     * Deletes the specified tag namespace. Only an empty tag namespace can be deleted with this operation. To use this operation
     * to delete a tag namespace that contains tag definitions, first delete all of its tag definitions.
     * <p>
     * Use {@link #cascadeDeleteTagNamespace(CascadeDeleteTagNamespaceRequest) cascadeDeleteTagNamespace} to delete a tag namespace along with all of
     * the tag definitions contained within that namespace.
     * <p>
     * Use {@link #deleteTag(DeleteTagRequest) deleteTag} to delete a tag definition.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation will not retry by default, users can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to enable retries for it.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/identity/DeleteTagNamespaceExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use DeleteTagNamespace API.
     */
    DeleteTagNamespaceResponse deleteTagNamespace(DeleteTagNamespaceRequest request);

    /**
     * Deletes the specified user. The user must not be in any groups.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation will not retry by default, users can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to enable retries for it.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/identity/DeleteUserExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use DeleteUser API.
     */
    DeleteUserResponse deleteUser(DeleteUserRequest request);

    /**
     * Replicate domain to a new region. This is an asynchronous call - where, at start,
     * {@code state} of this domain in replica region is set to ENABLING_REPLICATION.
     * On domain replication completion the {@code state} will be set to REPLICATION_ENABLED.
     * <p>
     * To track progress, HTTP GET on /iamWorkRequests/{iamWorkRequestsId} endpoint will provide
     * the async operation's status.
     * <p>
     * If the replica region's {@code state} is already ENABLING_REPLICATION or REPLICATION_ENABLED,
     * returns 409 CONFLICT.
     * - If the domain doesn't exists, returns 404 NOT FOUND.
     * - If home region is same as replication region, return 400 BAD REQUEST.
     * - If Domain is not active or being updated, returns 400 BAD REQUEST.
     * - If any internal error occurs, return 500 INTERNAL SERVER ERROR.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation will not retry by default, users can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to enable retries for it.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/identity/EnableReplicationToRegionExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use EnableReplicationToRegion API.
     */
    EnableReplicationToRegionResponse enableReplicationToRegion(
            EnableReplicationToRegionRequest request);

    /**
     * Generate seed for the MFA TOTP device.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation will not retry by default, users can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to enable retries for it.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/identity/GenerateTotpSeedExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use GenerateTotpSeed API.
     */
    GenerateTotpSeedResponse generateTotpSeed(GenerateTotpSeedRequest request);

    /**
     * Gets the authentication policy for the given tenancy. You must specify your tenant\u2019s OCID as the value for
     * the compartment ID (remember that the tenancy is simply the root compartment).
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation will not retry by default, users can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to enable retries for it.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/identity/GetAuthenticationPolicyExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use GetAuthenticationPolicy API.
     */
    GetAuthenticationPolicyResponse getAuthenticationPolicy(GetAuthenticationPolicyRequest request);

    /**
     * Gets the specified compartment's information.
     * <p>
     * This operation does not return a list of all the resources inside the compartment. There is no single
     * API operation that does that. Compartments can contain multiple types of resources (instances, block
     * storage volumes, etc.). To find out what's in a compartment, you must call the \"List\" operation for
     * each resource type and specify the compartment's OCID as a query parameter in the request. For example,
     * call the {@link #listInstances(ListInstancesRequest) listInstances} operation in the Cloud Compute
     * Service or the {@link #listVolumes(ListVolumesRequest) listVolumes} operation in Cloud Block Storage.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation will not retry by default, users can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to enable retries for it.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/identity/GetCompartmentExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use GetCompartment API.
     */
    GetCompartmentResponse getCompartment(GetCompartmentRequest request);

    /**
     * Get the specified domain's information.
     * <p>
     * - If the domain doesn't exists, returns 404 NOT FOUND.
     * - If any internal error occurs, returns 500 INTERNAL SERVER ERROR.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation will not retry by default, users can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to enable retries for it.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/identity/GetDomainExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use GetDomain API.
     */
    GetDomainResponse getDomain(GetDomainRequest request);

    /**
     * Gets the specified dynamic group's information.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation will not retry by default, users can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to enable retries for it.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/identity/GetDynamicGroupExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use GetDynamicGroup API.
     */
    GetDynamicGroupResponse getDynamicGroup(GetDynamicGroupRequest request);

    /**
     * Gets the specified group's information.
     * <p>
     * This operation does not return a list of all the users in the group. To do that, use
     * {@link #listUserGroupMemberships(ListUserGroupMembershipsRequest) listUserGroupMemberships} and
     * provide the group's OCID as a query parameter in the request.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation will not retry by default, users can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to enable retries for it.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/identity/GetGroupExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use GetGroup API.
     */
    GetGroupResponse getGroup(GetGroupRequest request);

    /**
     * Gets details on a specified IAM work request. For asynchronous operations in Identity and Access Management service, opc-work-request-id header values contains
     * iam work request id that can be provided in this API to track the current status of the operation.
     * <p>
     * - If workrequest exists, returns 202 ACCEPTED
     * - If workrequest does not exist, returns 404 NOT FOUND
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation will not retry by default, users can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to enable retries for it.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/identity/GetIamWorkRequestExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use GetIamWorkRequest API.
     */
    GetIamWorkRequestResponse getIamWorkRequest(GetIamWorkRequestRequest request);

    /**
     * **Deprecated.** For more information, see [Deprecated IAM Service APIs](https://docs.cloud.oracle.com/Content/Identity/Reference/deprecatediamapis.htm).
     * <p>
     * Gets the specified identity provider's information.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation will not retry by default, users can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to enable retries for it.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/identity/GetIdentityProviderExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use GetIdentityProvider API.
     */
    GetIdentityProviderResponse getIdentityProvider(GetIdentityProviderRequest request);

    /**
     * **Deprecated.** For more information, see [Deprecated IAM Service APIs](https://docs.cloud.oracle.com/Content/Identity/Reference/deprecatediamapis.htm).
     * <p>
     * Gets the specified group mapping.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation will not retry by default, users can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to enable retries for it.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/identity/GetIdpGroupMappingExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use GetIdpGroupMapping API.
     */
    GetIdpGroupMappingResponse getIdpGroupMapping(GetIdpGroupMappingRequest request);

    /**
     * Get the specified MFA TOTP device for the specified user.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation will not retry by default, users can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to enable retries for it.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/identity/GetMfaTotpDeviceExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use GetMfaTotpDevice API.
     */
    GetMfaTotpDeviceResponse getMfaTotpDevice(GetMfaTotpDeviceRequest request);

    /**
     * Gets the specified network source's information.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation will not retry by default, users can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to enable retries for it.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/identity/GetNetworkSourceExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use GetNetworkSource API.
     */
    GetNetworkSourceResponse getNetworkSource(GetNetworkSourceRequest request);

    /**
     * Gets the specified policy's information.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation will not retry by default, users can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to enable retries for it.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/identity/GetPolicyExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use GetPolicy API.
     */
    GetPolicyResponse getPolicy(GetPolicyRequest request);

    /**
     * Retrieve the standard tag namespace template given the standard tag namespace name.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation will not retry by default, users can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to enable retries for it.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/identity/GetStandardTagTemplateExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use GetStandardTagTemplate API.
     */
    GetStandardTagTemplateResponse getStandardTagTemplate(GetStandardTagTemplateRequest request);

    /**
     * Gets the specified tag's information.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation will not retry by default, users can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to enable retries for it.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/identity/GetTagExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use GetTag API.
     */
    GetTagResponse getTag(GetTagRequest request);

    /**
     * Retrieves the specified tag default.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation will not retry by default, users can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to enable retries for it.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/identity/GetTagDefaultExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use GetTagDefault API.
     */
    GetTagDefaultResponse getTagDefault(GetTagDefaultRequest request);

    /**
     * Gets the specified tag namespace's information.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation will not retry by default, users can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to enable retries for it.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/identity/GetTagNamespaceExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use GetTagNamespace API.
     */
    GetTagNamespaceResponse getTagNamespace(GetTagNamespaceRequest request);

    /**
     * Gets details on a specified work request. The workRequestID is returned in the opc-workrequest-id header
     * for any asynchronous operation in tagging service.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation will not retry by default, users can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to enable retries for it.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/identity/GetTaggingWorkRequestExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use GetTaggingWorkRequest API.
     */
    GetTaggingWorkRequestResponse getTaggingWorkRequest(GetTaggingWorkRequestRequest request);

    /**
     * Get the specified tenancy's information.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation will not retry by default, users can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to enable retries for it.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/identity/GetTenancyExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use GetTenancy API.
     */
    GetTenancyResponse getTenancy(GetTenancyRequest request);

    /**
     * Gets the specified user's information.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation will not retry by default, users can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to enable retries for it.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/identity/GetUserExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use GetUser API.
     */
    GetUserResponse getUser(GetUserRequest request);

    /**
     * Gets the specified UserGroupMembership's information.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation will not retry by default, users can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to enable retries for it.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/identity/GetUserGroupMembershipExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use GetUserGroupMembership API.
     */
    GetUserGroupMembershipResponse getUserGroupMembership(GetUserGroupMembershipRequest request);

    /**
     * Gets the specified user's console password information. The returned object contains the user's OCID,
     * but not the password itself. The actual password is returned only when created or reset.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation will not retry by default, users can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to enable retries for it.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/identity/GetUserUIPasswordInformationExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use GetUserUIPasswordInformation API.
     */
    GetUserUIPasswordInformationResponse getUserUIPasswordInformation(
            GetUserUIPasswordInformationRequest request);

    /**
     * Gets details on a specified work request. The workRequestID is returned in the opc-workrequest-id header
     * for any asynchronous operation in the compartment service.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation will not retry by default, users can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to enable retries for it.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/identity/GetWorkRequestExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use GetWorkRequest API.
     */
    GetWorkRequestResponse getWorkRequest(GetWorkRequestRequest request);

    /**
     * OCI will release Tag Namespaces that our customers can import.
     * These Tag Namespaces will provide Tags for our customers and Partners to provide consistency and enable data reporting.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation will not retry by default, users can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to enable retries for it.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/identity/ImportStandardTagsExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use ImportStandardTags API.
     */
    ImportStandardTagsResponse importStandardTags(ImportStandardTagsRequest request);

    /**
     * List the allowed domain license types supported by OCI
     * If {@code currentLicenseTypeName} provided, returns allowed license types a domain with the specified license type name can migrate to.
     * If {@code name} is provided, it filters and returns resources that match the given license type name.
     * Otherwise, returns all valid license types that are currently supported.
     * <p>
     * - If license type details are retrieved sucessfully, return 202 ACCEPTED.
     * - If any internal error occurs, return 500 INTERNAL SERVER ERROR.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation will not retry by default, users can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to enable retries for it.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/identity/ListAllowedDomainLicenseTypesExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use ListAllowedDomainLicenseTypes API.
     */
    ListAllowedDomainLicenseTypesResponse listAllowedDomainLicenseTypes(
            ListAllowedDomainLicenseTypesRequest request);

    /**
     * Lists the API signing keys for the specified user. A user can have a maximum of three keys.
     * <p>
     * Every user has permission to use this API call for *their own user ID*.  An administrator in your
     * organization does not need to write a policy to give users this ability.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation will not retry by default, users can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to enable retries for it.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/identity/ListApiKeysExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use ListApiKeys API.
     */
    ListApiKeysResponse listApiKeys(ListApiKeysRequest request);

    /**
     * Lists the auth tokens for the specified user. The returned object contains the token's OCID, but not
     * the token itself. The actual token is returned only upon creation.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation will not retry by default, users can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to enable retries for it.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/identity/ListAuthTokensExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use ListAuthTokens API.
     */
    ListAuthTokensResponse listAuthTokens(ListAuthTokensRequest request);

    /**
     * Lists the availability domains in your tenancy. Specify the OCID of either the tenancy or another
     * of your compartments as the value for the compartment ID (remember that the tenancy is simply the root compartment).
     * See [Where to Get the Tenancy's OCID and User's OCID](https://docs.cloud.oracle.com/Content/API/Concepts/apisigningkey.htm#five).
     * Note that the order of the results returned can change if availability domains are added or removed; therefore, do not
     * create a dependency on the list order.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation will not retry by default, users can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to enable retries for it.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/identity/ListAvailabilityDomainsExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use ListAvailabilityDomains API.
     */
    ListAvailabilityDomainsResponse listAvailabilityDomains(ListAvailabilityDomainsRequest request);

    /**
     * Lists the resource-types supported by compartment bulk actions. Use this API to help you provide the correct
     * resource-type information to the {@link #bulkDeleteResources(BulkDeleteResourcesRequest) bulkDeleteResources}
     * and {@link #bulkMoveResources(BulkMoveResourcesRequest) bulkMoveResources} operations. The returned list of
     * resource-types provides the appropriate resource-type names to use with the bulk action operations along with
     * the type of identifying information you'll need to provide for each resource-type. Most resource-types just
     * require an [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) to identify a specific resource, but some resource-types,
     * such as buckets, require you to provide other identifying information.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation will not retry by default, users can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to enable retries for it.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/identity/ListBulkActionResourceTypesExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use ListBulkActionResourceTypes API.
     */
    ListBulkActionResourceTypesResponse listBulkActionResourceTypes(
            ListBulkActionResourceTypesRequest request);

    /**
     * Lists the resource types that support bulk tag editing.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation will not retry by default, users can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to enable retries for it.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/identity/ListBulkEditTagsResourceTypesExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use ListBulkEditTagsResourceTypes API.
     */
    ListBulkEditTagsResourceTypesResponse listBulkEditTagsResourceTypes(
            ListBulkEditTagsResourceTypesRequest request);

    /**
     * Lists the compartments in a specified compartment. The members of the list
     * returned depends on the values set for several parameters.
     * <p>
     * With the exception of the tenancy (root compartment), the ListCompartments operation
     * returns only the first-level child compartments in the parent compartment specified in
     * `compartmentId`. The list does not include any subcompartments of the child
     * compartments (grandchildren).
     * <p>
     * The parameter `accessLevel` specifies whether to return only those compartments for which the
     * requestor has INSPECT permissions on at least one resource directly
     * or indirectly (the resource can be in a subcompartment).
     * <p>
     * The parameter `compartmentIdInSubtree` applies only when you perform ListCompartments on the
     * tenancy (root compartment). When set to true, the entire hierarchy of compartments can be returned.
     * To get a full list of all compartments and subcompartments in the tenancy (root compartment),
     * set the parameter `compartmentIdInSubtree` to true and `accessLevel` to ANY.
     * <p>
     * See [Where to Get the Tenancy's OCID and User's OCID](https://docs.cloud.oracle.com/Content/API/Concepts/apisigningkey.htm#five).
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation will not retry by default, users can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to enable retries for it.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/identity/ListCompartmentsExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use ListCompartments API.
     */
    ListCompartmentsResponse listCompartments(ListCompartmentsRequest request);

    /**
     * Lists all the tags enabled for cost-tracking in the specified tenancy. For information about
     * cost-tracking tags, see [Using Cost-tracking Tags](https://docs.cloud.oracle.com/Content/Identity/Concepts/taggingoverview.htm#costs).
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation will not retry by default, users can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to enable retries for it.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/identity/ListCostTrackingTagsExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use ListCostTrackingTags API.
     */
    ListCostTrackingTagsResponse listCostTrackingTags(ListCostTrackingTagsRequest request);

    /**
     * Lists the secret keys for the specified user. The returned object contains the secret key's OCID, but not
     * the secret key itself. The actual secret key is returned only upon creation.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation will not retry by default, users can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to enable retries for it.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/identity/ListCustomerSecretKeysExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use ListCustomerSecretKeys API.
     */
    ListCustomerSecretKeysResponse listCustomerSecretKeys(ListCustomerSecretKeysRequest request);

    /**
     * List all domains that are homed or have a replica region in current region.
     * - If any internal error occurs, return 500 INTERNAL SERVER ERROR.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation will not retry by default, users can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to enable retries for it.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/identity/ListDomainsExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use ListDomains API.
     */
    ListDomainsResponse listDomains(ListDomainsRequest request);

    /**
     * Lists the dynamic groups in your tenancy. You must specify your tenancy's OCID as the value for
     * the compartment ID (remember that the tenancy is simply the root compartment).
     * See [Where to Get the Tenancy's OCID and User's OCID](https://docs.cloud.oracle.com/Content/API/Concepts/apisigningkey.htm#five).
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation will not retry by default, users can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to enable retries for it.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/identity/ListDynamicGroupsExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use ListDynamicGroups API.
     */
    ListDynamicGroupsResponse listDynamicGroups(ListDynamicGroupsRequest request);

    /**
     * Lists the Fault Domains in your tenancy. Specify the OCID of either the tenancy or another
     * of your compartments as the value for the compartment ID (remember that the tenancy is simply the root compartment).
     * See [Where to Get the Tenancy's OCID and User's OCID](https://docs.cloud.oracle.com/Content/API/Concepts/apisigningkey.htm#five).
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation will not retry by default, users can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to enable retries for it.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/identity/ListFaultDomainsExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use ListFaultDomains API.
     */
    ListFaultDomainsResponse listFaultDomains(ListFaultDomainsRequest request);

    /**
     * Lists the groups in your tenancy. You must specify your tenancy's OCID as the value for
     * the compartment ID (remember that the tenancy is simply the root compartment).
     * See [Where to Get the Tenancy's OCID and User's OCID](https://docs.cloud.oracle.com/Content/API/Concepts/apisigningkey.htm#five).
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation will not retry by default, users can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to enable retries for it.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/identity/ListGroupsExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use ListGroups API.
     */
    ListGroupsResponse listGroups(ListGroupsRequest request);

    /**
     * Gets error details for a specified IAM work request. For asynchronous operations in Identity and Access Management service, opc-work-request-id header values contains
     * iam work request id that can be provided in this API to track the current status of the operation.
     * <p>
     * - If workrequest exists, returns 202 ACCEPTED
     * - If workrequest does not exist, returns 404 NOT FOUND
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation will not retry by default, users can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to enable retries for it.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/identity/ListIamWorkRequestErrorsExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use ListIamWorkRequestErrors API.
     */
    ListIamWorkRequestErrorsResponse listIamWorkRequestErrors(
            ListIamWorkRequestErrorsRequest request);

    /**
     * Gets logs for a specified IAM work request. For asynchronous operations in Identity and Access Management service, opc-work-request-id header values contains
     * iam work request id that can be provided in this API to track the current status of the operation.
     * <p>
     * - If workrequest exists, returns 202 ACCEPTED
     * - If workrequest does not exist, returns 404 NOT FOUND
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation will not retry by default, users can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to enable retries for it.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/identity/ListIamWorkRequestLogsExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use ListIamWorkRequestLogs API.
     */
    ListIamWorkRequestLogsResponse listIamWorkRequestLogs(ListIamWorkRequestLogsRequest request);

    /**
     * List the IAM work requests in compartment
     * <p>
     * - If IAM workrequest  details are retrieved sucessfully, return 202 ACCEPTED.
     * - If any internal error occurs, return 500 INTERNAL SERVER ERROR.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation will not retry by default, users can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to enable retries for it.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/identity/ListIamWorkRequestsExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use ListIamWorkRequests API.
     */
    ListIamWorkRequestsResponse listIamWorkRequests(ListIamWorkRequestsRequest request);

    /**
     * **Deprecated.** For more information, see [Deprecated IAM Service APIs](https://docs.cloud.oracle.com/Content/Identity/Reference/deprecatediamapis.htm).
     * <p>
     * Lists the identity provider groups.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation will not retry by default, users can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to enable retries for it.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/identity/ListIdentityProviderGroupsExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use ListIdentityProviderGroups API.
     */
    ListIdentityProviderGroupsResponse listIdentityProviderGroups(
            ListIdentityProviderGroupsRequest request);

    /**
     * **Deprecated.** For more information, see [Deprecated IAM Service APIs](https://docs.cloud.oracle.com/Content/Identity/Reference/deprecatediamapis.htm).
     * <p>
     * Lists all the identity providers in your tenancy. You must specify the identity provider type (e.g., `SAML2` for
     * identity providers using the SAML2.0 protocol). You must specify your tenancy's OCID as the value for the
     * compartment ID (remember that the tenancy is simply the root compartment).
     * See [Where to Get the Tenancy's OCID and User's OCID](https://docs.cloud.oracle.com/Content/API/Concepts/apisigningkey.htm#five).
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation will not retry by default, users can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to enable retries for it.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/identity/ListIdentityProvidersExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use ListIdentityProviders API.
     */
    ListIdentityProvidersResponse listIdentityProviders(ListIdentityProvidersRequest request);

    /**
     * **Deprecated.** For more information, see [Deprecated IAM Service APIs](https://docs.cloud.oracle.com/Content/Identity/Reference/deprecatediamapis.htm).
     * <p>
     * Lists the group mappings for the specified identity provider.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation will not retry by default, users can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to enable retries for it.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/identity/ListIdpGroupMappingsExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use ListIdpGroupMappings API.
     */
    ListIdpGroupMappingsResponse listIdpGroupMappings(ListIdpGroupMappingsRequest request);

    /**
     * Lists the MFA TOTP devices for the specified user. The returned object contains the device's OCID, but not
     * the seed. The seed is returned only upon creation or when the IAM service regenerates the MFA seed for the device.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation will not retry by default, users can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to enable retries for it.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/identity/ListMfaTotpDevicesExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use ListMfaTotpDevices API.
     */
    ListMfaTotpDevicesResponse listMfaTotpDevices(ListMfaTotpDevicesRequest request);

    /**
     * Lists the network sources in your tenancy. You must specify your tenancy's OCID as the value for
     * the compartment ID (remember that the tenancy is simply the root compartment).
     * See [Where to Get the Tenancy's OCID and User's OCID](https://docs.cloud.oracle.com/Content/API/Concepts/apisigningkey.htm#five).
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation will not retry by default, users can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to enable retries for it.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/identity/ListNetworkSourcesExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use ListNetworkSources API.
     */
    ListNetworkSourcesResponse listNetworkSources(ListNetworkSourcesRequest request);

    /**
     * List of Oauth tokens for the user
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation will not retry by default, users can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to enable retries for it.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/identity/ListOAuthClientCredentialsExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use ListOAuthClientCredentials API.
     */
    ListOAuthClientCredentialsResponse listOAuthClientCredentials(
            ListOAuthClientCredentialsRequest request);

    /**
     * Lists the policies in the specified compartment (either the tenancy or another of your compartments).
     * See [Where to Get the Tenancy's OCID and User's OCID](https://docs.cloud.oracle.com/Content/API/Concepts/apisigningkey.htm#five).
     * <p>
     * To determine which policies apply to a particular group or compartment, you must view the individual
     * statements inside all your policies. There isn't a way to automatically obtain that information via the API.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation will not retry by default, users can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to enable retries for it.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/identity/ListPoliciesExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use ListPolicies API.
     */
    ListPoliciesResponse listPolicies(ListPoliciesRequest request);

    /**
     * Lists the region subscriptions for the specified tenancy.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation will not retry by default, users can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to enable retries for it.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/identity/ListRegionSubscriptionsExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use ListRegionSubscriptions API.
     */
    ListRegionSubscriptionsResponse listRegionSubscriptions(ListRegionSubscriptionsRequest request);

    /**
     * Lists all the regions offered by Oracle Cloud Infrastructure.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation will not retry by default, users can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to enable retries for it.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/identity/ListRegionsExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use ListRegions API.
     */
    ListRegionsResponse listRegions(ListRegionsRequest request);

    /**
     * Lists the SMTP credentials for the specified user. The returned object contains the credential's OCID,
     * the SMTP user name but not the SMTP password. The SMTP password is returned only upon creation.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation will not retry by default, users can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to enable retries for it.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/identity/ListSmtpCredentialsExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use ListSmtpCredentials API.
     */
    ListSmtpCredentialsResponse listSmtpCredentials(ListSmtpCredentialsRequest request);

    /**
     * Lists available standard tag namespaces that users can create.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation will not retry by default, users can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to enable retries for it.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/identity/ListStandardTagNamespacesExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use ListStandardTagNamespaces API.
     */
    ListStandardTagNamespacesResponse listStandardTagNamespaces(
            ListStandardTagNamespacesRequest request);

    /**
     * **Deprecated. Use {@link #listAuthTokens(ListAuthTokensRequest) listAuthTokens} instead.**
     * <p>
     * Lists the Swift passwords for the specified user. The returned object contains the password's OCID, but not
     * the password itself. The actual password is returned only upon creation.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation will not retry by default, users can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to enable retries for it.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/identity/ListSwiftPasswordsExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use ListSwiftPasswords API.
     */
    ListSwiftPasswordsResponse listSwiftPasswords(ListSwiftPasswordsRequest request);

    /**
     * Lists the tag defaults for tag definitions in the specified compartment.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation will not retry by default, users can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to enable retries for it.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/identity/ListTagDefaultsExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use ListTagDefaults API.
     */
    ListTagDefaultsResponse listTagDefaults(ListTagDefaultsRequest request);

    /**
     * Lists the tag namespaces in the specified compartment.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation will not retry by default, users can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to enable retries for it.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/identity/ListTagNamespacesExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use ListTagNamespaces API.
     */
    ListTagNamespacesResponse listTagNamespaces(ListTagNamespacesRequest request);

    /**
     * Gets the errors for a work request.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation will not retry by default, users can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to enable retries for it.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/identity/ListTaggingWorkRequestErrorsExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use ListTaggingWorkRequestErrors API.
     */
    ListTaggingWorkRequestErrorsResponse listTaggingWorkRequestErrors(
            ListTaggingWorkRequestErrorsRequest request);

    /**
     * Gets the logs for a work request.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation will not retry by default, users can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to enable retries for it.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/identity/ListTaggingWorkRequestLogsExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use ListTaggingWorkRequestLogs API.
     */
    ListTaggingWorkRequestLogsResponse listTaggingWorkRequestLogs(
            ListTaggingWorkRequestLogsRequest request);

    /**
     * Lists the tagging work requests in compartment.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation will not retry by default, users can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to enable retries for it.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/identity/ListTaggingWorkRequestsExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use ListTaggingWorkRequests API.
     */
    ListTaggingWorkRequestsResponse listTaggingWorkRequests(ListTaggingWorkRequestsRequest request);

    /**
     * Lists the tag definitions in the specified tag namespace.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation will not retry by default, users can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to enable retries for it.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/identity/ListTagsExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use ListTags API.
     */
    ListTagsResponse listTags(ListTagsRequest request);

    /**
     * Lists the `UserGroupMembership` objects in your tenancy. You must specify your tenancy's OCID
     * as the value for the compartment ID
     * (see [Where to Get the Tenancy's OCID and User's OCID](https://docs.cloud.oracle.com/Content/API/Concepts/apisigningkey.htm#five)).
     * You must also then filter the list in one of these ways:
     * <p>
     * - You can limit the results to just the memberships for a given user by specifying a `userId`.
     * - Similarly, you can limit the results to just the memberships for a given group by specifying a `groupId`.
     * - You can set both the `userId` and `groupId` to determine if the specified user is in the specified group.
     * If the answer is no, the response is an empty list.
     * - Although`userId` and `groupId` are not individually required, you must set one of them.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation will not retry by default, users can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to enable retries for it.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/identity/ListUserGroupMembershipsExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use ListUserGroupMemberships API.
     */
    ListUserGroupMembershipsResponse listUserGroupMemberships(
            ListUserGroupMembershipsRequest request);

    /**
     * Lists the users in your tenancy. You must specify your tenancy's OCID as the value for the
     * compartment ID (remember that the tenancy is simply the root compartment).
     * See [Where to Get the Tenancy's OCID and User's OCID](https://docs.cloud.oracle.com/Content/API/Concepts/apisigningkey.htm#five).
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation will not retry by default, users can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to enable retries for it.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/identity/ListUsersExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use ListUsers API.
     */
    ListUsersResponse listUsers(ListUsersRequest request);

    /**
     * Lists the work requests in compartment.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation will not retry by default, users can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to enable retries for it.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/identity/ListWorkRequestsExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use ListWorkRequests API.
     */
    ListWorkRequestsResponse listWorkRequests(ListWorkRequestsRequest request);

    /**
     * Move the compartment to a different parent compartment in the same tenancy. When you move a
     * compartment, all its contents (subcompartments and resources) are moved with it. Note that
     * the `CompartmentId` that you specify in the path is the compartment that you want to move.
     * <p>
     **IMPORTANT**: After you move a compartment to a new parent compartment, the access policies of
     * the new parent take effect and the policies of the previous parent no longer apply. Ensure that you
     * are aware of the implications for the compartment contents before you move it. For more
     * information, see [Moving a Compartment](https://docs.cloud.oracle.com/Content/Identity/Tasks/managingcompartments.htm#MoveCompartment).
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation will not retry by default, users can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to enable retries for it.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/identity/MoveCompartmentExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use MoveCompartment API.
     */
    MoveCompartmentResponse moveCompartment(MoveCompartmentRequest request);

    /**
     * Recover the compartment from DELETED state to ACTIVE state.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation will not retry by default, users can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to enable retries for it.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/identity/RecoverCompartmentExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use RecoverCompartment API.
     */
    RecoverCompartmentResponse recoverCompartment(RecoverCompartmentRequest request);

    /**
     * Removes a user from a group by deleting the corresponding `UserGroupMembership`.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation will not retry by default, users can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to enable retries for it.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/identity/RemoveUserFromGroupExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use RemoveUserFromGroup API.
     */
    RemoveUserFromGroupResponse removeUserFromGroup(RemoveUserFromGroupRequest request);

    /**
     * Resets the OAuth2 client credentials for the SCIM client associated with this identity provider.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation will not retry by default, users can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to enable retries for it.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/identity/ResetIdpScimClientExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use ResetIdpScimClient API.
     */
    ResetIdpScimClientResponse resetIdpScimClient(ResetIdpScimClientRequest request);

    /**
     * Updates the specified auth token's description.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation will not retry by default, users can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to enable retries for it.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/identity/UpdateAuthTokenExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use UpdateAuthToken API.
     */
    UpdateAuthTokenResponse updateAuthToken(UpdateAuthTokenRequest request);

    /**
     * Updates authentication policy for the specified tenancy
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation will not retry by default, users can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to enable retries for it.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/identity/UpdateAuthenticationPolicyExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use UpdateAuthenticationPolicy API.
     */
    UpdateAuthenticationPolicyResponse updateAuthenticationPolicy(
            UpdateAuthenticationPolicyRequest request);

    /**
     * Updates the specified compartment's description or name. You can't update the root compartment.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation will not retry by default, users can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to enable retries for it.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/identity/UpdateCompartmentExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use UpdateCompartment API.
     */
    UpdateCompartmentResponse updateCompartment(UpdateCompartmentRequest request);

    /**
     * Updates the specified secret key's description.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation will not retry by default, users can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to enable retries for it.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/identity/UpdateCustomerSecretKeyExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use UpdateCustomerSecretKey API.
     */
    UpdateCustomerSecretKeyResponse updateCustomerSecretKey(UpdateCustomerSecretKeyRequest request);

    /**
     * Updates domain information and associated stripe. This is an asynchronous call where
     * the associated stripe and domain are updated.
     * <p>
     * To track progress, HTTP GET on /iamWorkRequests/{iamWorkRequestsId} endpoint will provide
     * the async operation's status.
     * <p>
     * - If the {@code displayName} is not unique within the tenancy, returns 400 BAD REQUEST.
     * - If any field other than {@code description} is requested to be updated for DEFAULT domain,
     * returns 400 BAD REQUEST.
     * - If Domain is not active or being updated, returns 400 BAD REQUEST.
     * - If Domain {@code type} is DEFAULT or DEFAULT_LIGHTWEIGHT, return 400 BAD Request
     * - If the domain doesn't exists, returns 404 NOT FOUND.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation will not retry by default, users can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to enable retries for it.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/identity/UpdateDomainExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use UpdateDomain API.
     */
    UpdateDomainResponse updateDomain(UpdateDomainRequest request);

    /**
     * Updates the specified dynamic group.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation will not retry by default, users can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to enable retries for it.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/identity/UpdateDynamicGroupExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use UpdateDynamicGroup API.
     */
    UpdateDynamicGroupResponse updateDynamicGroup(UpdateDynamicGroupRequest request);

    /**
     * Updates the specified group.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation will not retry by default, users can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to enable retries for it.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/identity/UpdateGroupExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use UpdateGroup API.
     */
    UpdateGroupResponse updateGroup(UpdateGroupRequest request);

    /**
     * **Deprecated.** For more information, see [Deprecated IAM Service APIs](https://docs.cloud.oracle.com/Content/Identity/Reference/deprecatediamapis.htm).
     * <p>
     * Updates the specified identity provider.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation will not retry by default, users can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to enable retries for it.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/identity/UpdateIdentityProviderExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use UpdateIdentityProvider API.
     */
    UpdateIdentityProviderResponse updateIdentityProvider(UpdateIdentityProviderRequest request);

    /**
     * **Deprecated.** For more information, see [Deprecated IAM Service APIs](https://docs.cloud.oracle.com/Content/Identity/Reference/deprecatediamapis.htm).
     * <p>
     * Updates the specified group mapping.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation will not retry by default, users can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to enable retries for it.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/identity/UpdateIdpGroupMappingExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use UpdateIdpGroupMapping API.
     */
    UpdateIdpGroupMappingResponse updateIdpGroupMapping(UpdateIdpGroupMappingRequest request);

    /**
     * Updates the specified network source.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation will not retry by default, users can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to enable retries for it.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/identity/UpdateNetworkSourceExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use UpdateNetworkSource API.
     */
    UpdateNetworkSourceResponse updateNetworkSource(UpdateNetworkSourceRequest request);

    /**
     * Updates Oauth token for the user
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation will not retry by default, users can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to enable retries for it.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/identity/UpdateOAuthClientCredentialExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use UpdateOAuthClientCredential API.
     */
    UpdateOAuthClientCredentialResponse updateOAuthClientCredential(
            UpdateOAuthClientCredentialRequest request);

    /**
     * Updates the specified policy. You can update the description or the policy statements themselves.
     * <p>
     * Policy changes take effect typically within 10 seconds.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation will not retry by default, users can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to enable retries for it.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/identity/UpdatePolicyExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use UpdatePolicy API.
     */
    UpdatePolicyResponse updatePolicy(UpdatePolicyRequest request);

    /**
     * Updates the specified SMTP credential's description.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation will not retry by default, users can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to enable retries for it.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/identity/UpdateSmtpCredentialExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use UpdateSmtpCredential API.
     */
    UpdateSmtpCredentialResponse updateSmtpCredential(UpdateSmtpCredentialRequest request);

    /**
     * **Deprecated. Use {@link #updateAuthToken(UpdateAuthTokenRequest) updateAuthToken} instead.**
     * <p>
     * Updates the specified Swift password's description.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation will not retry by default, users can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to enable retries for it.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/identity/UpdateSwiftPasswordExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use UpdateSwiftPassword API.
     */
    UpdateSwiftPasswordResponse updateSwiftPassword(UpdateSwiftPasswordRequest request);

    /**
     * Updates the specified tag definition.
     * <p>
     * Setting `validator` determines the value type. Tags can use either a static value or a
     * list of possible values. Static values are entered by a user applying the tag to a resource.
     * Lists are created by you and the user must apply a value from the list. On update, any values
     * in a list that were previously set do not change, but new values must pass validation. Values
     * already applied to a resource do not change.
     * <p>
     * You cannot remove list values that appear in a TagDefault. To remove a list value that
     * appears in a TagDefault, first update the TagDefault to use a different value.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation will not retry by default, users can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to enable retries for it.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/identity/UpdateTagExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use UpdateTag API.
     */
    UpdateTagResponse updateTag(UpdateTagRequest request);

    /**
     * Updates the specified tag default. If you specify that a value is required, a value is set
     * during resource creation (either by the user creating the resource or another tag defualt).
     * If no value is set, resource creation is blocked.
     * <p>
     * If the `isRequired` flag is set to \"true\", the value is set during resource creation.
     * * If the `isRequired` flag is set to \"false\", the value you enter is set during resource creation.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation will not retry by default, users can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to enable retries for it.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/identity/UpdateTagDefaultExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use UpdateTagDefault API.
     */
    UpdateTagDefaultResponse updateTagDefault(UpdateTagDefaultRequest request);

    /**
     * Updates the the specified tag namespace. You can't update the namespace name.
     * <p>
     * Updating `isRetired` to 'true' retires the namespace and all the tag definitions in the namespace. Reactivating a
     * namespace (changing `isRetired` from 'true' to 'false') does not reactivate tag definitions.
     * To reactivate the tag definitions, you must reactivate each one individually *after* you reactivate the namespace,
     * using {@link #updateTag(UpdateTagRequest) updateTag}. For more information about retiring tag namespaces, see
     * [Retiring Key Definitions and Namespace Definitions](https://docs.cloud.oracle.com/Content/Identity/Concepts/taggingoverview.htm#Retiring).
     * <p>
     * You can't add a namespace with the same name as a retired namespace in the same tenancy.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation will not retry by default, users can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to enable retries for it.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/identity/UpdateTagNamespaceExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use UpdateTagNamespace API.
     */
    UpdateTagNamespaceResponse updateTagNamespace(UpdateTagNamespaceRequest request);

    /**
     * Updates the description of the specified user.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation will not retry by default, users can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to enable retries for it.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/identity/UpdateUserExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use UpdateUser API.
     */
    UpdateUserResponse updateUser(UpdateUserRequest request);

    /**
     * Updates the capabilities of the specified user.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation will not retry by default, users can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to enable retries for it.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/identity/UpdateUserCapabilitiesExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use UpdateUserCapabilities API.
     */
    UpdateUserCapabilitiesResponse updateUserCapabilities(UpdateUserCapabilitiesRequest request);

    /**
     * Updates the state of the specified user.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation will not retry by default, users can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to enable retries for it.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/identity/UpdateUserStateExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use UpdateUserState API.
     */
    UpdateUserStateResponse updateUserState(UpdateUserStateRequest request);

    /**
     * Uploads an API signing key for the specified user.
     * <p>
     * Every user has permission to use this operation to upload a key for *their own user ID*. An
     * administrator in your organization does not need to write a policy to give users this ability.
     * To compare, administrators who have permission to the tenancy can use this operation to upload a
     * key for any user, including themselves.
     * <p>
     **Important:** Even though you have permission to upload an API key, you might not yet
     * have permission to do much else. If you try calling an operation unrelated to your own credential
     * management (e.g., `ListUsers`, `LaunchInstance`) and receive an \"unauthorized\" error,
     * check with an administrator to confirm which IAM Service group(s) you're in and what access
     * you have. Also confirm you're working in the correct compartment.
     * <p>
     * After you send your request, the new object's `lifecycleState` will temporarily be CREATING. Before using
     * the object, first make sure its `lifecycleState` has changed to ACTIVE.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation will not retry by default, users can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to enable retries for it.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/identity/UploadApiKeyExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use UploadApiKey API.
     */
    UploadApiKeyResponse uploadApiKey(UploadApiKeyRequest request);

    /**
     * Gets the pre-configured waiters available for resources for this service.
     *
     * @return The service waiters.
     */
    IdentityWaiters getWaiters();

    /**
     * Gets the pre-configured paginators available for list operations in this service which may return multiple
     * pages of data. These paginators provide an {@link java.lang.Iterable} interface so that service responses, or
     * resources/records, can be iterated through without having to manually deal with pagination and page tokens.
     *
     * @return The service paginators.
     */
    IdentityPaginators getPaginators();
}

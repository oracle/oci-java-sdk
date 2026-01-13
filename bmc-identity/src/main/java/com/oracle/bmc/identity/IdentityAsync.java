/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.identity;

import com.oracle.bmc.identity.requests.*;
import com.oracle.bmc.identity.responses.*;

/**
 * Use the Identity and Access Management Service API to manage users, groups, identity domains,
 * compartments, policies, tagging, and limits. For information about managing users, groups,
 * compartments, and policies, see [Identity and Access Management (without identity
 * domains)](https://docs.oracle.com/iaas/Content/Identity/Concepts/overview.htm). For information
 * about tagging and service limits, see
 * [Tagging](https://docs.oracle.com/iaas/Content/Tagging/Concepts/taggingoverview.htm) and [Service
 * Limits](https://docs.oracle.com/iaas/Content/General/Concepts/servicelimits.htm). For information
 * about creating, modifying, and deleting identity domains, see [Identity and Access Management
 * (with identity domains)](https://docs.oracle.com/iaas/Content/Identity/home.htm).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
public interface IdentityAsync extends AutoCloseable {

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
     * (For tenancies that support identity domains) Activates a deactivated identity domain. You
     * can only activate identity domains that your user account is not a part of.
     *
     * <p>After you send the request, the `lifecycleDetails` of the identity domain is set to
     * ACTIVATING. When the operation completes, the `lifecycleDetails` is set to null and the
     * `lifecycleState` of the identity domain is set to ACTIVE.
     *
     * <p>To track the progress of the request, submitting an HTTP GET on the
     * /iamWorkRequests/{iamWorkRequestsId} endpoint retrieves the operation's status.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ActivateDomainResponse> activateDomain(
            ActivateDomainRequest request,
            com.oracle.bmc.responses.AsyncHandler<ActivateDomainRequest, ActivateDomainResponse>
                    handler);

    /**
     * Activates the specified MFA TOTP device for the user. Activation requires manual interaction
     * with the Console.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ActivateMfaTotpDeviceResponse> activateMfaTotpDevice(
            ActivateMfaTotpDeviceRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            ActivateMfaTotpDeviceRequest, ActivateMfaTotpDeviceResponse>
                    handler);

    /**
     * Add a resource lock to a tag default.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<AddTagDefaultLockResponse> addTagDefaultLock(
            AddTagDefaultLockRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            AddTagDefaultLockRequest, AddTagDefaultLockResponse>
                    handler);

    /**
     * Add a resource lock to a tag namespace.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<AddTagNamespaceLockResponse> addTagNamespaceLock(
            AddTagNamespaceLockRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            AddTagNamespaceLockRequest, AddTagNamespaceLockResponse>
                    handler);

    /**
     * Adds the specified user to the specified group and returns a `UserGroupMembership` object
     * with its own OCID.
     *
     * <p>After you send your request, the new object's `lifecycleState` will temporarily be
     * CREATING. Before using the object, first make sure its `lifecycleState` has changed to
     * ACTIVE.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<AddUserToGroupResponse> addUserToGroup(
            AddUserToGroupRequest request,
            com.oracle.bmc.responses.AsyncHandler<AddUserToGroupRequest, AddUserToGroupResponse>
                    handler);

    /**
     * Assembles tag defaults in the specified compartment and any parent compartments to determine
     * the tags to apply. Tag defaults from parent compartments do not override tag defaults
     * referencing the same tag in a compartment lower down the hierarchy. This set of tag defaults
     * includes all tag defaults from the current compartment back to the root compartment.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<AssembleEffectiveTagSetResponse> assembleEffectiveTagSet(
            AssembleEffectiveTagSetRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            AssembleEffectiveTagSetRequest, AssembleEffectiveTagSetResponse>
                    handler);

    /**
     * Deletes multiple resources in the compartment. All resources must be in the same compartment.
     * You must have the appropriate permissions to delete the resources in the request. This API
     * can only be invoked from the tenancy's [home
     * region](https://docs.oracle.com/iaas/Content/Identity/regions/managingregions.htm#Home). This
     * operation creates a {@link WorkRequest}. Use the {@link
     * #getWorkRequest(GetWorkRequestRequest, Consumer, Consumer) getWorkRequest} API to monitor the
     * status of the bulk action.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<BulkDeleteResourcesResponse> bulkDeleteResources(
            BulkDeleteResourcesRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            BulkDeleteResourcesRequest, BulkDeleteResourcesResponse>
                    handler);

    /**
     * Deletes the specified tag key definitions. This operation triggers a process that removes the
     * tags from all resources in your tenancy. The tag key definitions must be within the same tag
     * namespace.
     *
     * <p>The following actions happen immediately:
     *
     * <p>If the tag is a cost-tracking tag, the tag no longer counts against your 10 cost-tracking
     * tags limit, even if you do not disable the tag before running this operation. * If the tag is
     * used with dynamic groups, the rules that contain the tag are no longer evaluated against the
     * tag.
     *
     * <p>After you start this operation, the state of the tag changes to DELETING, and tag removal
     * from resources begins. This process can take up to 48 hours depending on the number of
     * resources that are tagged and the regions in which those resources reside.
     *
     * <p>When all tags have been removed, the state changes to DELETED. You cannot restore a
     * deleted tag. After the tag state changes to DELETED, you can use the same tag name again.
     *
     * <p>After you start this operation, you cannot start either the {@link
     * #deleteTag(DeleteTagRequest, Consumer, Consumer) deleteTag} or the {@link
     * #cascadeDeleteTagNamespace(CascadeDeleteTagNamespaceRequest, Consumer, Consumer)
     * cascadeDeleteTagNamespace} operation until this process completes.
     *
     * <p>In order to delete tags, you must first retire the tags. Use {@link
     * #updateTag(UpdateTagRequest, Consumer, Consumer) updateTag} to retire a tag.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<BulkDeleteTagsResponse> bulkDeleteTags(
            BulkDeleteTagsRequest request,
            com.oracle.bmc.responses.AsyncHandler<BulkDeleteTagsRequest, BulkDeleteTagsResponse>
                    handler);

    /**
     * Edits the specified list of tag key definitions for the selected resources. This operation
     * triggers a process that edits the tags on all selected resources. The possible actions are:
     *
     * <p>Add a defined tag when the tag does not already exist on the resource. * Update the value
     * for a defined tag when the tag is present on the resource. * Add a defined tag when it does
     * not already exist on the resource or update the value for a defined tag when the tag is
     * present on the resource. * Remove a defined tag from a resource. The tag is removed from the
     * resource regardless of the tag value.
     *
     * <p>See {@link #bulkEditOperationDetails(BulkEditOperationDetailsRequest, Consumer, Consumer)
     * bulkEditOperationDetails} for more information.
     *
     * <p>The edits can include a combination of operations and tag sets. However, multiple
     * operations cannot apply to one key definition in the same request. For example, if one
     * request adds `tag set-1` to a resource and sets a tag value to `tag set-2`, `tag set-1` and
     * `tag set-2` cannot have any common tag definitions.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<BulkEditTagsResponse> bulkEditTags(
            BulkEditTagsRequest request,
            com.oracle.bmc.responses.AsyncHandler<BulkEditTagsRequest, BulkEditTagsResponse>
                    handler);

    /**
     * Moves multiple resources from one compartment to another. All resources must be in the same
     * compartment. This API can only be invoked from the tenancy's [home
     * region](https://docs.oracle.com/iaas/Content/Identity/regions/managingregions.htm#Home). To
     * move resources, you must have the appropriate permissions to move the resource in both the
     * source and target compartments. This operation creates a {@link WorkRequest}. Use the {@link
     * #getWorkRequest(GetWorkRequestRequest, Consumer, Consumer) getWorkRequest} API to monitor the
     * status of the bulk action.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<BulkMoveResourcesResponse> bulkMoveResources(
            BulkMoveResourcesRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            BulkMoveResourcesRequest, BulkMoveResourcesResponse>
                    handler);

    /**
     * Deletes the specified tag namespace. This operation triggers a process that removes all of
     * the tags defined in the specified tag namespace from all resources in your tenancy and then
     * deletes the tag namespace.
     *
     * <p>After you start the delete operation:
     *
     * <p>New tag key definitions cannot be created under the namespace. * The state of the tag
     * namespace changes to DELETING. * Tag removal from the resources begins.
     *
     * <p>This process can take up to 48 hours depending on the number of tag definitions in the
     * namespace, the number of resources that are tagged, and the locations of the regions in which
     * those resources reside.
     *
     * <p>After all tags are removed, the state changes to DELETED. You cannot restore a deleted tag
     * namespace. After the deleted tag namespace changes its state to DELETED, you can use the name
     * of the deleted tag namespace again.
     *
     * <p>After you start this operation, you cannot start either the {@link
     * #deleteTag(DeleteTagRequest, Consumer, Consumer) deleteTag} or the {@link
     * #bulkDeleteTags(BulkDeleteTagsRequest, Consumer, Consumer) bulkDeleteTags} operation until
     * this process completes.
     *
     * <p>To delete a tag namespace, you must first retire it. Use {@link
     * #updateTagNamespace(UpdateTagNamespaceRequest, Consumer, Consumer) updateTagNamespace} to
     * retire a tag namespace.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<CascadeDeleteTagNamespaceResponse> cascadeDeleteTagNamespace(
            CascadeDeleteTagNamespaceRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            CascadeDeleteTagNamespaceRequest, CascadeDeleteTagNamespaceResponse>
                    handler);

    /**
     * (For tenancies that support identity domains) Moves the identity domain to a different
     * compartment in the tenancy.
     *
     * <p>To track the progress of the request, submitting an HTTP GET on the
     * /iamWorkRequests/{iamWorkRequestsId} endpoint retrieves the operation's status.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ChangeDomainCompartmentResponse> changeDomainCompartment(
            ChangeDomainCompartmentRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            ChangeDomainCompartmentRequest, ChangeDomainCompartmentResponse>
                    handler);

    /**
     * (For tenancies that support identity domains) Changes the license type of the given identity
     * domain. The identity domain's `lifecycleState` must be set to ACTIVE and the requested
     * `licenseType` must be allowed. To retrieve the allowed `licenseType` for the identity domain,
     * use {@link #listAllowedDomainLicenseTypes(ListAllowedDomainLicenseTypesRequest, Consumer,
     * Consumer) listAllowedDomainLicenseTypes}.
     *
     * <p>After you send your request, the `lifecycleDetails` of this identity domain is set to
     * UPDATING. When the update of the identity domain completes, then the `lifecycleDetails` is
     * set to null.
     *
     * <p>To track the progress of the request, submitting an HTTP GET on the
     * /iamWorkRequests/{iamWorkRequestsId} endpoint retrieves the operation's status.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ChangeDomainLicenseTypeResponse> changeDomainLicenseType(
            ChangeDomainLicenseTypeRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            ChangeDomainLicenseTypeRequest, ChangeDomainLicenseTypeResponse>
                    handler);

    /**
     * Moves the specified tag namespace to the specified compartment within the same tenancy.
     *
     * <p>To move the tag namespace, you must have the manage tag-namespaces permission on both
     * compartments. For more information about IAM policies, see [Details for
     * IAM](https://docs.oracle.com/iaas/Content/Identity/policyreference/iampolicyreference.htm).
     *
     * <p>Moving a tag namespace moves all the tag key definitions contained in the tag namespace.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ChangeTagNamespaceCompartmentResponse>
            changeTagNamespaceCompartment(
                    ChangeTagNamespaceCompartmentRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    ChangeTagNamespaceCompartmentRequest,
                                    ChangeTagNamespaceCompartmentResponse>
                            handler);

    /**
     * Creates a new auth token for the specified user. For information about what auth tokens are
     * for, see [Managing User
     * Credentials](https://docs.oracle.com/iaas/Content/Identity/access/managing-user-credentials.htm).
     *
     * <p>You must specify a *description* for the auth token (although it can be an empty string).
     * It does not have to be unique, and you can change it anytime with {@link
     * #updateAuthToken(UpdateAuthTokenRequest, Consumer, Consumer) updateAuthToken}.
     *
     * <p>Every user has permission to create an auth token for *their own user ID*. An
     * administrator in your organization does not need to write a policy to give users this
     * ability. To compare, administrators who have permission to the tenancy can use this operation
     * to create an auth token for any user, including themselves.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<CreateAuthTokenResponse> createAuthToken(
            CreateAuthTokenRequest request,
            com.oracle.bmc.responses.AsyncHandler<CreateAuthTokenRequest, CreateAuthTokenResponse>
                    handler);

    /**
     * Creates a new compartment in the specified compartment.
     *
     * <p>Specify the parent compartment's OCID as the compartment ID in the request object.
     * Remember that the tenancy is simply the root compartment. For information about OCIDs, see
     * [Resource
     * Identifiers](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm).
     *
     * <p>You must also specify a *name* for the compartment, which must be unique across all
     * compartments in your tenancy. You can use this name or the OCID when writing policies that
     * apply to the compartment. For more information about policies, see [How Policies
     * Work](https://docs.oracle.com/iaas/Content/Identity/policieshow/how-policies-work.htm).
     *
     * <p>You must also specify a *description* for the compartment (although it can be an empty
     * string). It does not have to be unique, and you can change it anytime with {@link
     * #updateCompartment(UpdateCompartmentRequest, Consumer, Consumer) updateCompartment}.
     *
     * <p>After you send your request, the new object's `lifecycleState` will temporarily be
     * CREATING. Before using the object, first make sure its `lifecycleState` has changed to
     * ACTIVE.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<CreateCompartmentResponse> createCompartment(
            CreateCompartmentRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            CreateCompartmentRequest, CreateCompartmentResponse>
                    handler);

    /**
     * Creates a new secret key for the specified user. Secret keys are used for authentication with
     * the Object Storage Service's Amazon S3 compatible API. The secret key consists of an Access
     * Key/Secret Key pair. For information, see [Managing User
     * Credentials](https://docs.oracle.com/iaas/Content/Identity/access/managing-user-credentials.htm).
     *
     * <p>You must specify a *description* for the secret key (although it can be an empty string).
     * It does not have to be unique, and you can change it anytime with {@link
     * #updateCustomerSecretKey(UpdateCustomerSecretKeyRequest, Consumer, Consumer)
     * updateCustomerSecretKey}.
     *
     * <p>Every user has permission to create a secret key for *their own user ID*. An administrator
     * in your organization does not need to write a policy to give users this ability. To compare,
     * administrators who have permission to the tenancy can use this operation to create a secret
     * key for any user, including themselves.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<CreateCustomerSecretKeyResponse> createCustomerSecretKey(
            CreateCustomerSecretKeyRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            CreateCustomerSecretKeyRequest, CreateCustomerSecretKeyResponse>
                    handler);

    /**
     * Creates a new DB credential for the specified user.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<CreateDbCredentialResponse> createDbCredential(
            CreateDbCredentialRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            CreateDbCredentialRequest, CreateDbCredentialResponse>
                    handler);

    /**
     * (For tenancies that support identity domains) Creates a new identity domain in the tenancy
     * with the identity domain home in `homeRegion`. After you send your request, the temporary
     * `lifecycleState` of this identity domain is set to CREATING and `lifecycleDetails` to
     * UPDATING. When creation of the identity domain completes, this identity domain's
     * `lifecycleState` is set to ACTIVE and `lifecycleDetails` to null.
     *
     * <p>To track the progress of the request, submitting an HTTP GET on the
     * /iamWorkRequests/{iamWorkRequestsId} endpoint retrieves the operation's status.
     *
     * <p>After creating an `identity domain`, first make sure its `lifecycleState` changes from
     * CREATING to ACTIVE before you use it.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<CreateDomainResponse> createDomain(
            CreateDomainRequest request,
            com.oracle.bmc.responses.AsyncHandler<CreateDomainRequest, CreateDomainResponse>
                    handler);

    /**
     * Creates a new dynamic group in your tenancy.
     *
     * <p>You must specify your tenancy's OCID as the compartment ID in the request object (remember
     * that the tenancy is simply the root compartment). Notice that IAM resources (users, groups,
     * compartments, and some policies) reside within the tenancy itself, unlike cloud resources
     * such as compute instances, which typically reside within compartments inside the tenancy. For
     * information about OCIDs, see [Resource
     * Identifiers](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm).
     *
     * <p>You must also specify a *name* for the dynamic group, which must be unique across all
     * dynamic groups in your tenancy, and cannot be changed. Note that this name has to be also
     * unique across all groups in your tenancy. You can use this name or the OCID when writing
     * policies that apply to the dynamic group. For more information about policies, see [How
     * Policies
     * Work](https://docs.oracle.com/iaas/Content/Identity/policieshow/how-policies-work.htm).
     *
     * <p>You must also specify a *description* for the dynamic group (although it can be an empty
     * string). It does not have to be unique, and you can change it anytime with {@link
     * #updateDynamicGroup(UpdateDynamicGroupRequest, Consumer, Consumer) updateDynamicGroup}.
     *
     * <p>After you send your request, the new object's `lifecycleState` will temporarily be
     * CREATING. Before using the object, first make sure its `lifecycleState` has changed to
     * ACTIVE.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<CreateDynamicGroupResponse> createDynamicGroup(
            CreateDynamicGroupRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            CreateDynamicGroupRequest, CreateDynamicGroupResponse>
                    handler);

    /**
     * Creates a new group in your tenancy.
     *
     * <p>You must specify your tenancy's OCID as the compartment ID in the request object (remember
     * that the tenancy is simply the root compartment). Notice that IAM resources (users, groups,
     * compartments, and some policies) reside within the tenancy itself, unlike cloud resources
     * such as compute instances, which typically reside within compartments inside the tenancy. For
     * information about OCIDs, see [Resource
     * Identifiers](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm).
     *
     * <p>You must also specify a *name* for the group, which must be unique across all groups in
     * your tenancy and cannot be changed. You can use this name or the OCID when writing policies
     * that apply to the group. For more information about policies, see [How Policies
     * Work](https://docs.oracle.com/iaas/Content/Identity/policieshow/how-policies-work.htm).
     *
     * <p>You must also specify a *description* for the group (although it can be an empty string).
     * It does not have to be unique, and you can change it anytime with {@link
     * #updateGroup(UpdateGroupRequest, Consumer, Consumer) updateGroup}.
     *
     * <p>After you send your request, the new object's `lifecycleState` will temporarily be
     * CREATING. Before using the object, first make sure its `lifecycleState` has changed to
     * ACTIVE.
     *
     * <p>After creating the group, you need to put users in it and write policies for it. See
     * {@link #addUserToGroup(AddUserToGroupRequest, Consumer, Consumer) addUserToGroup} and {@link
     * #createPolicy(CreatePolicyRequest, Consumer, Consumer) createPolicy}.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<CreateGroupResponse> createGroup(
            CreateGroupRequest request,
            com.oracle.bmc.responses.AsyncHandler<CreateGroupRequest, CreateGroupResponse> handler);

    /**
     * **Deprecated.** For more information, see [Deprecated IAM Service
     * APIs](https://docs.oracle.com/iaas/Content/Identity/Reference/deprecatediamapis.htm).
     *
     * <p>Creates a new identity provider in your tenancy. For more information, see [Identity
     * Providers and
     * Federation](https://docs.oracle.com/iaas/Content/Identity/Concepts/federation.htm).
     *
     * <p>You must specify your tenancy's OCID as the compartment ID in the request object. Remember
     * that the tenancy is simply the root compartment. For information about OCIDs, see [Resource
     * Identifiers](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm).
     *
     * <p>You must also specify a *name* for the `IdentityProvider`, which must be unique across all
     * `IdentityProvider` objects in your tenancy and cannot be changed.
     *
     * <p>You must also specify a *description* for the `IdentityProvider` (although it can be an
     * empty string). It does not have to be unique, and you can change it anytime with {@link
     * #updateIdentityProvider(UpdateIdentityProviderRequest, Consumer, Consumer)
     * updateIdentityProvider}.
     *
     * <p>After you send your request, the new object's `lifecycleState` will temporarily be
     * CREATING. Before using the object, first make sure its `lifecycleState` has changed to
     * ACTIVE.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<CreateIdentityProviderResponse> createIdentityProvider(
            CreateIdentityProviderRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            CreateIdentityProviderRequest, CreateIdentityProviderResponse>
                    handler);

    /**
     * **Deprecated.** For more information, see [Deprecated IAM Service
     * APIs](https://docs.oracle.com/iaas/Content/Identity/Reference/deprecatediamapis.htm).
     *
     * <p>Creates a single mapping between an IdP group and an IAM Service {@link Group}.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<CreateIdpGroupMappingResponse> createIdpGroupMapping(
            CreateIdpGroupMappingRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            CreateIdpGroupMappingRequest, CreateIdpGroupMappingResponse>
                    handler);

    /**
     * Creates a new MFA TOTP device for the user. A user can have one MFA TOTP device.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<CreateMfaTotpDeviceResponse> createMfaTotpDevice(
            CreateMfaTotpDeviceRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            CreateMfaTotpDeviceRequest, CreateMfaTotpDeviceResponse>
                    handler);

    /**
     * Creates a new network source in your tenancy.
     *
     * <p>You must specify your tenancy's OCID as the compartment ID in the request object (remember
     * that the tenancy is simply the root compartment). Notice that IAM resources (users, groups,
     * compartments, and some policies) reside within the tenancy itself, unlike cloud resources
     * such as compute instances, which typically reside within compartments inside the tenancy. For
     * information about OCIDs, see [Resource
     * Identifiers](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm).
     *
     * <p>You must also specify a *name* for the network source, which must be unique across all
     * network sources in your tenancy, and cannot be changed. You can use this name or the OCID
     * when writing policies that apply to the network source. For more information about policies,
     * see [How Policies
     * Work](https://docs.oracle.com/iaas/Content/Identity/policieshow/how-policies-work.htm).
     *
     * <p>You must also specify a *description* for the network source (although it can be an empty
     * string). It does not have to be unique, and you can change it anytime with {@link
     * #updateNetworkSource(UpdateNetworkSourceRequest, Consumer, Consumer) updateNetworkSource}.
     *
     * <p>After you send your request, the new object's `lifecycleState` will temporarily be
     * CREATING. Before using the object, first make sure its `lifecycleState` has changed to
     * ACTIVE.
     *
     * <p>After your network resource is created, you can use it in policy to restrict access to
     * only requests made from an allowed IP address specified in your network source. For more
     * information, see [Managing Network
     * Sources](https://docs.oracle.com/iaas/Content/Identity/Tasks/managingnetworksources.htm).
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<CreateNetworkSourceResponse> createNetworkSource(
            CreateNetworkSourceRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            CreateNetworkSourceRequest, CreateNetworkSourceResponse>
                    handler);

    /**
     * Creates Oauth token for the user
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<CreateOAuthClientCredentialResponse> createOAuthClientCredential(
            CreateOAuthClientCredentialRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            CreateOAuthClientCredentialRequest, CreateOAuthClientCredentialResponse>
                    handler);

    /**
     * Creates a new Console one-time password for the specified user. For more information about
     * user credentials, see [User
     * Credentials](https://docs.oracle.com/iaas/Content/Identity/usercred/usercredentials.htm).
     *
     * <p>Use this operation after creating a new user, or if a user forgets their password. The new
     * one-time password is returned to you in the response, and you must securely deliver it to the
     * user. They'll be prompted to change this password the next time they sign in to the Console.
     * If they don't change it within 7 days, the password will expire and you'll need to create a
     * new one-time password for the user.
     *
     * <p>(For tenancies that support identity domains) Resetting a user's password generates a
     * reset password email with a link that the user must follow to reset their password. If the
     * user does not reset their password before the link expires, you'll need to reset the user's
     * password again.
     *
     * <p>*Note:** The user's Console login is the unique name you specified when you created the
     * user (see {@link #createUser(CreateUserRequest, Consumer, Consumer) createUser}).
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<CreateOrResetUIPasswordResponse> createOrResetUIPassword(
            CreateOrResetUIPasswordRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            CreateOrResetUIPasswordRequest, CreateOrResetUIPasswordResponse>
                    handler);

    /**
     * Creates a new policy in the specified compartment (either the tenancy or another of your
     * compartments). If you're new to policies, see [Get Started with
     * Policies](https://docs.oracle.com/iaas/Content/Identity/policiesgs/get-started-with-policies.htm).
     *
     * <p>You must specify a *name* for the policy, which must be unique across all policies in your
     * tenancy and cannot be changed.
     *
     * <p>You must also specify a *description* for the policy (although it can be an empty string).
     * It does not have to be unique, and you can change it anytime with {@link
     * #updatePolicy(UpdatePolicyRequest, Consumer, Consumer) updatePolicy}.
     *
     * <p>You must specify one or more policy statements in the statements array. For information
     * about writing policies, see [How Policies
     * Work](https://docs.oracle.com/iaas/Content/Identity/policieshow/how-policies-work.htm) and
     * [Common
     * Policies](https://docs.oracle.com/iaas/Content/Identity/policiescommon/commonpolicies.htm).
     *
     * <p>After you send your request, the new object's `lifecycleState` will temporarily be
     * CREATING. Before using the object, first make sure its `lifecycleState` has changed to
     * ACTIVE.
     *
     * <p>New policies take effect typically within 10 seconds.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<CreatePolicyResponse> createPolicy(
            CreatePolicyRequest request,
            com.oracle.bmc.responses.AsyncHandler<CreatePolicyRequest, CreatePolicyResponse>
                    handler);

    /**
     * Creates a subscription to a region for a tenancy.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<CreateRegionSubscriptionResponse> createRegionSubscription(
            CreateRegionSubscriptionRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            CreateRegionSubscriptionRequest, CreateRegionSubscriptionResponse>
                    handler);

    /**
     * Creates a new SMTP credential for the specified user. An SMTP credential has an SMTP user
     * name and an SMTP password. You must specify a *description* for the SMTP credential (although
     * it can be an empty string). It does not have to be unique, and you can change it anytime with
     * {@link #updateSmtpCredential(UpdateSmtpCredentialRequest, Consumer, Consumer)
     * updateSmtpCredential}.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<CreateSmtpCredentialResponse> createSmtpCredential(
            CreateSmtpCredentialRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            CreateSmtpCredentialRequest, CreateSmtpCredentialResponse>
                    handler);

    /**
     * **Deprecated. Use {@link #createAuthToken(CreateAuthTokenRequest, Consumer, Consumer)
     * createAuthToken} instead.**
     *
     * <p>Creates a new Swift password for the specified user. For information about what Swift
     * passwords are for, see [Managing User
     * Credentials](https://docs.oracle.com/iaas/Content/Identity/Tasks/managingcredentials.htm).
     *
     * <p>You must specify a *description* for the Swift password (although it can be an empty
     * string). It does not have to be unique, and you can change it anytime with {@link
     * #updateSwiftPassword(UpdateSwiftPasswordRequest, Consumer, Consumer) updateSwiftPassword}.
     *
     * <p>Every user has permission to create a Swift password for *their own user ID*. An
     * administrator in your organization does not need to write a policy to give users this
     * ability. To compare, administrators who have permission to the tenancy can use this operation
     * to create a Swift password for any user, including themselves.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<CreateSwiftPasswordResponse> createSwiftPassword(
            CreateSwiftPasswordRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            CreateSwiftPasswordRequest, CreateSwiftPasswordResponse>
                    handler);

    /**
     * Creates a new tag in the specified tag namespace.
     *
     * <p>The tag requires either the OCID or the name of the tag namespace that will contain this
     * tag definition.
     *
     * <p>You must specify a *name* for the tag, which must be unique across all tags in the tag
     * namespace and cannot be changed. The name can contain any ASCII character except the space
     * (_) or period (.) characters. Names are case insensitive. That means, for example, \"myTag\"
     * and \"mytag\" are not allowed in the same namespace. If you specify a name that's already in
     * use in the tag namespace, a 409 error is returned.
     *
     * <p>The tag must have a *description*. It does not have to be unique, and you can change it
     * with {@link #updateTag(UpdateTagRequest, Consumer, Consumer) updateTag}.
     *
     * <p>The tag must have a value type, which is specified with a validator. Tags can use either a
     * static value or a list of possible values. Static values are entered by a user applying the
     * tag to a resource. Lists are created by you and the user must apply a value from the list.
     * Lists are validiated.
     *
     * <p>If no `validator` is set, the user applying the tag to a resource can type in a static
     * value or leave the tag value empty. * If a `validator` is set, the user applying the tag to a
     * resource must select from a list of values that you supply with {@link
     * #enumTagDefinitionValidator(EnumTagDefinitionValidatorRequest, Consumer, Consumer)
     * enumTagDefinitionValidator}.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<CreateTagResponse> createTag(
            CreateTagRequest request,
            com.oracle.bmc.responses.AsyncHandler<CreateTagRequest, CreateTagResponse> handler);

    /**
     * Creates a new tag default in the specified compartment for the specified tag definition.
     *
     * <p>If you specify that a value is required, a value is set during resource creation (either
     * by the user creating the resource or another tag defualt). If no value is set, resource
     * creation is blocked.
     *
     * <p>If the `isRequired` flag is set to \"true\", the value is set during resource creation. *
     * If the `isRequired` flag is set to \"false\", the value you enter is set during resource
     * creation.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<CreateTagDefaultResponse> createTagDefault(
            CreateTagDefaultRequest request,
            com.oracle.bmc.responses.AsyncHandler<CreateTagDefaultRequest, CreateTagDefaultResponse>
                    handler);

    /**
     * Creates a new tag namespace in the specified compartment.
     *
     * <p>You must specify the compartment ID in the request object (remember that the tenancy is
     * simply the root compartment).
     *
     * <p>You must also specify a *name* for the namespace, which must be unique across all
     * namespaces in your tenancy and cannot be changed. The name can contain any ASCII character
     * except the space (_) or period (.). Names are case insensitive. That means, for example,
     * \"myNamespace\" and \"mynamespace\" are not allowed in the same tenancy. Once you created a
     * namespace, you cannot change the name. If you specify a name that's already in use in the
     * tenancy, a 409 error is returned.
     *
     * <p>You must also specify a *description* for the namespace. It does not have to be unique,
     * and you can change it with {@link #updateTagNamespace(UpdateTagNamespaceRequest, Consumer,
     * Consumer) updateTagNamespace}.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<CreateTagNamespaceResponse> createTagNamespace(
            CreateTagNamespaceRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            CreateTagNamespaceRequest, CreateTagNamespaceResponse>
                    handler);

    /**
     * Creates a new user in your tenancy. For conceptual information about users, your tenancy, and
     * other IAM Service components, see [Overview of
     * IAM](https://docs.oracle.com/iaas/Content/Identity/getstarted/identity-domains.htm).
     *
     * <p>You must specify your tenancy's OCID as the compartment ID in the request object (remember
     * that the tenancy is simply the root compartment). Notice that IAM resources (users, groups,
     * compartments, and some policies) reside within the tenancy itself, unlike cloud resources
     * such as compute instances, which typically reside within compartments inside the tenancy. For
     * information about OCIDs, see [Resource
     * Identifiers](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm).
     *
     * <p>You must also specify a *name* for the user, which must be unique across all users in your
     * tenancy and cannot be changed. Allowed characters: No spaces. Only letters, numerals,
     * hyphens, periods, underscores, +, and @. If you specify a name that's already in use, you'll
     * get a 409 error. This name will be the user's login to the Console. You might want to pick a
     * name that your company's own identity system (e.g., Active Directory, LDAP, etc.) already
     * uses. If you delete a user and then create a new user with the same name, they'll be
     * considered different users because they have different OCIDs.
     *
     * <p>You must also specify a *description* for the user (although it can be an empty string).
     * It does not have to be unique, and you can change it anytime with {@link
     * #updateUser(UpdateUserRequest, Consumer, Consumer) updateUser}. You can use the field to
     * provide the user's full name, a description, a nickname, or other information to generally
     * identify the user.
     *
     * <p>After you send your request, the new object's `lifecycleState` will temporarily be
     * CREATING. Before using the object, first make sure its `lifecycleState` has changed to
     * ACTIVE.
     *
     * <p>A new user has no permissions until you place the user in one or more groups (see {@link
     * #addUserToGroup(AddUserToGroupRequest, Consumer, Consumer) addUserToGroup}). If the user
     * needs to access the Console, you need to provide the user a password (see {@link
     * #createOrResetUIPassword(CreateOrResetUIPasswordRequest, Consumer, Consumer)
     * createOrResetUIPassword}). If the user needs to access the Oracle Cloud Infrastructure REST
     * API, you need to upload a public API signing key for that user (see [Required Keys and
     * OCIDs](https://docs.oracle.com/iaas/Content/API/Concepts/apisigningkey.htm) and also {@link
     * #uploadApiKey(UploadApiKeyRequest, Consumer, Consumer) uploadApiKey}).
     *
     * <p>*Important:** Make sure to inform the new user which compartment(s) they have access to.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<CreateUserResponse> createUser(
            CreateUserRequest request,
            com.oracle.bmc.responses.AsyncHandler<CreateUserRequest, CreateUserResponse> handler);

    /**
     * (For tenancies that support identity domains) Deactivates the specified identity domain.
     * Identity domains must be in an ACTIVE `lifecycleState` and have no active apps present in the
     * domain or underlying Identity Cloud Service stripe. You cannot deactivate the default
     * identity domain.
     *
     * <p>After you send your request, the `lifecycleDetails` of this identity domain is set to
     * DEACTIVATING. When the operation completes, then the `lifecycleDetails` is set to null and
     * the `lifecycleState` is set to INACTIVE.
     *
     * <p>To track the progress of the request, submitting an HTTP GET on the
     * /iamWorkRequests/{iamWorkRequestsId} endpoint retrieves the operation's status.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<DeactivateDomainResponse> deactivateDomain(
            DeactivateDomainRequest request,
            com.oracle.bmc.responses.AsyncHandler<DeactivateDomainRequest, DeactivateDomainResponse>
                    handler);

    /**
     * Deletes the specified API signing key for the specified user.
     *
     * <p>Every user has permission to use this operation to delete a key for *their own user ID*.
     * An administrator in your organization does not need to write a policy to give users this
     * ability. To compare, administrators who have permission to the tenancy can use this operation
     * to delete a key for any user, including themselves.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<DeleteApiKeyResponse> deleteApiKey(
            DeleteApiKeyRequest request,
            com.oracle.bmc.responses.AsyncHandler<DeleteApiKeyRequest, DeleteApiKeyResponse>
                    handler);

    /**
     * Deletes the specified auth token for the specified user.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<DeleteAuthTokenResponse> deleteAuthToken(
            DeleteAuthTokenRequest request,
            com.oracle.bmc.responses.AsyncHandler<DeleteAuthTokenRequest, DeleteAuthTokenResponse>
                    handler);

    /**
     * Deletes the specified compartment. The compartment must be empty.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<DeleteCompartmentResponse> deleteCompartment(
            DeleteCompartmentRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            DeleteCompartmentRequest, DeleteCompartmentResponse>
                    handler);

    /**
     * Deletes the specified secret key for the specified user.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<DeleteCustomerSecretKeyResponse> deleteCustomerSecretKey(
            DeleteCustomerSecretKeyRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            DeleteCustomerSecretKeyRequest, DeleteCustomerSecretKeyResponse>
                    handler);

    /**
     * Deletes the specified DB credential for the specified user.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<DeleteDbCredentialResponse> deleteDbCredential(
            DeleteDbCredentialRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            DeleteDbCredentialRequest, DeleteDbCredentialResponse>
                    handler);

    /**
     * (For tenancies that support identity domains) Deletes an identity domain. The identity domain
     * must have no active apps present in the underlying IDCS stripe. You must also deactivate the
     * identity domain, rendering the `lifecycleState` of the identity domain INACTIVE. Furthermore,
     * as the authenticated user performing the operation, you cannot be a member of the identity
     * domain you are deleting. Lastly, you cannot delete the default identity domain. A tenancy
     * must always have at least the default identity domain.
     *
     * <p>To track the progress of the request, submitting an HTTP GET on the
     * /iamWorkRequests/{iamWorkRequestsId} endpoint retrieves the operation's status.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<DeleteDomainResponse> deleteDomain(
            DeleteDomainRequest request,
            com.oracle.bmc.responses.AsyncHandler<DeleteDomainRequest, DeleteDomainResponse>
                    handler);

    /**
     * Deletes the specified dynamic group.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<DeleteDynamicGroupResponse> deleteDynamicGroup(
            DeleteDynamicGroupRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            DeleteDynamicGroupRequest, DeleteDynamicGroupResponse>
                    handler);

    /**
     * Deletes the specified group. The group must be empty.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<DeleteGroupResponse> deleteGroup(
            DeleteGroupRequest request,
            com.oracle.bmc.responses.AsyncHandler<DeleteGroupRequest, DeleteGroupResponse> handler);

    /**
     * **Deprecated.** For more information, see [Deprecated IAM Service
     * APIs](https://docs.oracle.com/iaas/Content/Identity/Reference/deprecatediamapis.htm).
     *
     * <p>Deletes the specified identity provider. The identity provider must not have any group
     * mappings (see {@link IdpGroupMapping}).
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<DeleteIdentityProviderResponse> deleteIdentityProvider(
            DeleteIdentityProviderRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            DeleteIdentityProviderRequest, DeleteIdentityProviderResponse>
                    handler);

    /**
     * **Deprecated.** For more information, see [Deprecated IAM Service
     * APIs](https://docs.oracle.com/iaas/Content/Identity/Reference/deprecatediamapis.htm).
     *
     * <p>Deletes the specified group mapping.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<DeleteIdpGroupMappingResponse> deleteIdpGroupMapping(
            DeleteIdpGroupMappingRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            DeleteIdpGroupMappingRequest, DeleteIdpGroupMappingResponse>
                    handler);

    /**
     * Deletes the specified MFA TOTP device for the specified user.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<DeleteMfaTotpDeviceResponse> deleteMfaTotpDevice(
            DeleteMfaTotpDeviceRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            DeleteMfaTotpDeviceRequest, DeleteMfaTotpDeviceResponse>
                    handler);

    /**
     * Deletes the specified network source.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<DeleteNetworkSourceResponse> deleteNetworkSource(
            DeleteNetworkSourceRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            DeleteNetworkSourceRequest, DeleteNetworkSourceResponse>
                    handler);

    /**
     * Delete Oauth token for the user
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<DeleteOAuthClientCredentialResponse> deleteOAuthClientCredential(
            DeleteOAuthClientCredentialRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            DeleteOAuthClientCredentialRequest, DeleteOAuthClientCredentialResponse>
                    handler);

    /**
     * Deletes the specified policy. The deletion takes effect typically within 10 seconds.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<DeletePolicyResponse> deletePolicy(
            DeletePolicyRequest request,
            com.oracle.bmc.responses.AsyncHandler<DeletePolicyRequest, DeletePolicyResponse>
                    handler);

    /**
     * Deletes the specified SMTP credential for the specified user.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<DeleteSmtpCredentialResponse> deleteSmtpCredential(
            DeleteSmtpCredentialRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            DeleteSmtpCredentialRequest, DeleteSmtpCredentialResponse>
                    handler);

    /**
     * **Deprecated. Use {@link #deleteAuthToken(DeleteAuthTokenRequest, Consumer, Consumer)
     * deleteAuthToken} instead.**
     *
     * <p>Deletes the specified Swift password for the specified user.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<DeleteSwiftPasswordResponse> deleteSwiftPassword(
            DeleteSwiftPasswordRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            DeleteSwiftPasswordRequest, DeleteSwiftPasswordResponse>
                    handler);

    /**
     * Deletes the specified tag definition. This operation triggers a process that removes the tag
     * from all resources in your tenancy.
     *
     * <p>These things happen immediately: * If the tag was a cost-tracking tag, it no longer counts
     * against your 10 cost-tracking tags limit, whether you first disabled it or not. * If the tag
     * was used with dynamic groups, none of the rules that contain the tag will be evaluated
     * against the tag.
     *
     * <p>When you start the delete operation, the state of the tag changes to DELETING and tag
     * removal from resources begins. This can take up to 48 hours depending on the number of
     * resources that were tagged as well as the regions in which those resources reside.
     *
     * <p>When all tags have been removed, the state changes to DELETED. You cannot restore a
     * deleted tag. Once the deleted tag changes its state to DELETED, you can use the same tag name
     * again.
     *
     * <p>After you start this operation, you cannot start either the {@link
     * #bulkDeleteTags(BulkDeleteTagsRequest, Consumer, Consumer) bulkDeleteTags} or the {@link
     * #cascadeDeleteTagNamespace(CascadeDeleteTagNamespaceRequest, Consumer, Consumer)
     * cascadeDeleteTagNamespace} operation until this process completes.
     *
     * <p>To delete a tag, you must first retire it. Use {@link #updateTag(UpdateTagRequest,
     * Consumer, Consumer) updateTag} to retire a tag.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<DeleteTagResponse> deleteTag(
            DeleteTagRequest request,
            com.oracle.bmc.responses.AsyncHandler<DeleteTagRequest, DeleteTagResponse> handler);

    /**
     * Deletes the the specified tag default.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<DeleteTagDefaultResponse> deleteTagDefault(
            DeleteTagDefaultRequest request,
            com.oracle.bmc.responses.AsyncHandler<DeleteTagDefaultRequest, DeleteTagDefaultResponse>
                    handler);

    /**
     * Deletes the specified tag namespace. Only an empty tag namespace can be deleted with this
     * operation. To use this operation to delete a tag namespace that contains tag definitions,
     * first delete all of its tag definitions.
     *
     * <p>Use {@link #cascadeDeleteTagNamespace(CascadeDeleteTagNamespaceRequest, Consumer,
     * Consumer) cascadeDeleteTagNamespace} to delete a tag namespace along with all of the tag
     * definitions contained within that namespace.
     *
     * <p>Use {@link #deleteTag(DeleteTagRequest, Consumer, Consumer) deleteTag} to delete a tag
     * definition.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<DeleteTagNamespaceResponse> deleteTagNamespace(
            DeleteTagNamespaceRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            DeleteTagNamespaceRequest, DeleteTagNamespaceResponse>
                    handler);

    /**
     * Deletes the specified user. The user must not be in any groups.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<DeleteUserResponse> deleteUser(
            DeleteUserRequest request,
            com.oracle.bmc.responses.AsyncHandler<DeleteUserRequest, DeleteUserResponse> handler);

    /**
     * (For tenancies that support identity domains) Replicates the identity domain to a new region
     * (provided that the region is the tenancy home region or other region that the tenancy
     * subscribes to). You can only replicate identity domains that are in an ACTIVE
     * `lifecycleState` and not currently updating or already replicating. You also can only trigger
     * the replication of secondary identity domains. The default identity domain is automatically
     * replicated to all regions that the tenancy subscribes to.
     *
     * <p>After you send the request, the `state` of the identity domain in the replica region is
     * set to ENABLING_REPLICATION. When the operation completes, the `state` is set to
     * REPLICATION_ENABLED.
     *
     * <p>To track the progress of the request, submitting an HTTP GET on the
     * /iamWorkRequests/{iamWorkRequestsId} endpoint retrieves the operation's status.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<EnableReplicationToRegionResponse> enableReplicationToRegion(
            EnableReplicationToRegionRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            EnableReplicationToRegionRequest, EnableReplicationToRegionResponse>
                    handler);

    /**
     * Generate seed for the MFA TOTP device.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<GenerateTotpSeedResponse> generateTotpSeed(
            GenerateTotpSeedRequest request,
            com.oracle.bmc.responses.AsyncHandler<GenerateTotpSeedRequest, GenerateTotpSeedResponse>
                    handler);

    /**
     * Gets the authentication policy for the given tenancy. You must specify your tenant's OCID as
     * the value for the compartment ID (remember that the tenancy is simply the root compartment).
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<GetAuthenticationPolicyResponse> getAuthenticationPolicy(
            GetAuthenticationPolicyRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            GetAuthenticationPolicyRequest, GetAuthenticationPolicyResponse>
                    handler);

    /**
     * Gets the specified compartment's information.
     *
     * <p>This operation does not return a list of all the resources inside the compartment. There
     * is no single API operation that does that. Compartments can contain multiple types of
     * resources (instances, block storage volumes, etc.). To find out what's in a compartment, you
     * must call the \"List\" operation for each resource type and specify the compartment's OCID as
     * a query parameter in the request. For example, call the {@link
     * #listInstances(ListInstancesRequest, Consumer, Consumer) listInstances} operation in the
     * Cloud Compute Service or the {@link #listVolumes(ListVolumesRequest, Consumer, Consumer)
     * listVolumes} operation in Cloud Block Storage.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<GetCompartmentResponse> getCompartment(
            GetCompartmentRequest request,
            com.oracle.bmc.responses.AsyncHandler<GetCompartmentRequest, GetCompartmentResponse>
                    handler);

    /**
     * (For tenancies that support identity domains) Gets the specified identity domain's
     * information.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<GetDomainResponse> getDomain(
            GetDomainRequest request,
            com.oracle.bmc.responses.AsyncHandler<GetDomainRequest, GetDomainResponse> handler);

    /**
     * Gets the specified dynamic group's information.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<GetDynamicGroupResponse> getDynamicGroup(
            GetDynamicGroupRequest request,
            com.oracle.bmc.responses.AsyncHandler<GetDynamicGroupRequest, GetDynamicGroupResponse>
                    handler);

    /**
     * Gets the specified group's information.
     *
     * <p>This operation does not return a list of all the users in the group. To do that, use
     * {@link #listUserGroupMemberships(ListUserGroupMembershipsRequest, Consumer, Consumer)
     * listUserGroupMemberships} and provide the group's OCID as a query parameter in the request.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<GetGroupResponse> getGroup(
            GetGroupRequest request,
            com.oracle.bmc.responses.AsyncHandler<GetGroupRequest, GetGroupResponse> handler);

    /**
     * Gets the details of a specified IAM work request. The workRequestID is returned in the
     * opc-workrequest-id header for any asynchronous operation in the Identity and Access
     * Management service.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<GetIamWorkRequestResponse> getIamWorkRequest(
            GetIamWorkRequestRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            GetIamWorkRequestRequest, GetIamWorkRequestResponse>
                    handler);

    /**
     * **Deprecated.** For more information, see [Deprecated IAM Service
     * APIs](https://docs.oracle.com/iaas/Content/Identity/Reference/deprecatediamapis.htm).
     *
     * <p>Gets the specified identity provider's information.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<GetIdentityProviderResponse> getIdentityProvider(
            GetIdentityProviderRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            GetIdentityProviderRequest, GetIdentityProviderResponse>
                    handler);

    /**
     * **Deprecated.** For more information, see [Deprecated IAM Service
     * APIs](https://docs.oracle.com/iaas/Content/Identity/Reference/deprecatediamapis.htm).
     *
     * <p>Gets the specified group mapping.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<GetIdpGroupMappingResponse> getIdpGroupMapping(
            GetIdpGroupMappingRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            GetIdpGroupMappingRequest, GetIdpGroupMappingResponse>
                    handler);

    /**
     * Get the specified MFA TOTP device for the specified user.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<GetMfaTotpDeviceResponse> getMfaTotpDevice(
            GetMfaTotpDeviceRequest request,
            com.oracle.bmc.responses.AsyncHandler<GetMfaTotpDeviceRequest, GetMfaTotpDeviceResponse>
                    handler);

    /**
     * Gets the specified network source's information.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<GetNetworkSourceResponse> getNetworkSource(
            GetNetworkSourceRequest request,
            com.oracle.bmc.responses.AsyncHandler<GetNetworkSourceRequest, GetNetworkSourceResponse>
                    handler);

    /**
     * Gets the specified policy's information.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<GetPolicyResponse> getPolicy(
            GetPolicyRequest request,
            com.oracle.bmc.responses.AsyncHandler<GetPolicyRequest, GetPolicyResponse> handler);

    /**
     * Retrieve the standard tag namespace template given the standard tag namespace name.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<GetStandardTagTemplateResponse> getStandardTagTemplate(
            GetStandardTagTemplateRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            GetStandardTagTemplateRequest, GetStandardTagTemplateResponse>
                    handler);

    /**
     * Gets the specified tag's information.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<GetTagResponse> getTag(
            GetTagRequest request,
            com.oracle.bmc.responses.AsyncHandler<GetTagRequest, GetTagResponse> handler);

    /**
     * Retrieves the specified tag default.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<GetTagDefaultResponse> getTagDefault(
            GetTagDefaultRequest request,
            com.oracle.bmc.responses.AsyncHandler<GetTagDefaultRequest, GetTagDefaultResponse>
                    handler);

    /**
     * Gets the specified tag namespace's information.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<GetTagNamespaceResponse> getTagNamespace(
            GetTagNamespaceRequest request,
            com.oracle.bmc.responses.AsyncHandler<GetTagNamespaceRequest, GetTagNamespaceResponse>
                    handler);

    /**
     * Gets details on a specified work request. The workRequestID is returned in the
     * opc-workrequest-id header for any asynchronous operation in tagging service.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<GetTaggingWorkRequestResponse> getTaggingWorkRequest(
            GetTaggingWorkRequestRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            GetTaggingWorkRequestRequest, GetTaggingWorkRequestResponse>
                    handler);

    /**
     * Get the specified tenancy's information.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<GetTenancyResponse> getTenancy(
            GetTenancyRequest request,
            com.oracle.bmc.responses.AsyncHandler<GetTenancyRequest, GetTenancyResponse> handler);

    /**
     * Gets the specified user's information.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<GetUserResponse> getUser(
            GetUserRequest request,
            com.oracle.bmc.responses.AsyncHandler<GetUserRequest, GetUserResponse> handler);

    /**
     * Gets the specified UserGroupMembership's information.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<GetUserGroupMembershipResponse> getUserGroupMembership(
            GetUserGroupMembershipRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            GetUserGroupMembershipRequest, GetUserGroupMembershipResponse>
                    handler);

    /**
     * Gets the specified user's console password information. The returned object contains the
     * user's OCID, but not the password itself. The actual password is returned only when created
     * or reset.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<GetUserUIPasswordInformationResponse> getUserUIPasswordInformation(
            GetUserUIPasswordInformationRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            GetUserUIPasswordInformationRequest,
                            GetUserUIPasswordInformationResponse>
                    handler);

    /**
     * Gets details on a specified work request. The workRequestID is returned in the
     * opc-workrequest-id header for any asynchronous operation in the compartment service.
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
     * OCI will release Tag Namespaces that our customers can import. These Tag Namespaces will
     * provide Tags for our customers and Partners to provide consistency and enable data reporting.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ImportStandardTagsResponse> importStandardTags(
            ImportStandardTagsRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            ImportStandardTagsRequest, ImportStandardTagsResponse>
                    handler);

    /**
     * (For tenancies that support identity domains) Lists the license types for identity domains
     * supported by Oracle Cloud Infrastructure. (License types are also referred to as domain
     * types.)
     *
     * <p>If `currentLicenseTypeName` is provided, then the request returns license types that the
     * identity domain with the specified license type name can change to. Otherwise, the request
     * returns all valid license types currently supported.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ListAllowedDomainLicenseTypesResponse>
            listAllowedDomainLicenseTypes(
                    ListAllowedDomainLicenseTypesRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    ListAllowedDomainLicenseTypesRequest,
                                    ListAllowedDomainLicenseTypesResponse>
                            handler);

    /**
     * Lists the API signing keys for the specified user. A user can have a maximum of three keys.
     *
     * <p>Every user has permission to use this API call for *their own user ID*. An administrator
     * in your organization does not need to write a policy to give users this ability.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ListApiKeysResponse> listApiKeys(
            ListApiKeysRequest request,
            com.oracle.bmc.responses.AsyncHandler<ListApiKeysRequest, ListApiKeysResponse> handler);

    /**
     * Lists the auth tokens for the specified user. The returned object contains the token's OCID,
     * but not the token itself. The actual token is returned only upon creation.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ListAuthTokensResponse> listAuthTokens(
            ListAuthTokensRequest request,
            com.oracle.bmc.responses.AsyncHandler<ListAuthTokensRequest, ListAuthTokensResponse>
                    handler);

    /**
     * Lists the availability domains in your tenancy. Specify the OCID of either the tenancy or
     * another of your compartments as the value for the compartment ID (remember that the tenancy
     * is simply the root compartment). See [Where to Get the Tenancy's OCID and User's
     * OCID](https://docs.oracle.com/iaas/Content/API/Concepts/apisigningkey.htm#five). Note that
     * the order of the results returned can change if availability domains are added or removed;
     * therefore, do not create a dependency on the list order.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ListAvailabilityDomainsResponse> listAvailabilityDomains(
            ListAvailabilityDomainsRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            ListAvailabilityDomainsRequest, ListAvailabilityDomainsResponse>
                    handler);

    /**
     * Lists the resource-types supported by compartment bulk actions. Use this API to help you
     * provide the correct resource-type information to the {@link
     * #bulkDeleteResources(BulkDeleteResourcesRequest, Consumer, Consumer) bulkDeleteResources} and
     * {@link #bulkMoveResources(BulkMoveResourcesRequest, Consumer, Consumer) bulkMoveResources}
     * operations. The returned list of resource-types provides the appropriate resource-type names
     * to use with the bulk action operations along with the type of identifying information you'll
     * need to provide for each resource-type. Most resource-types just require an
     * [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) to identify a
     * specific resource, but some resource-types, such as buckets, require you to provide other
     * identifying information.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ListBulkActionResourceTypesResponse> listBulkActionResourceTypes(
            ListBulkActionResourceTypesRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            ListBulkActionResourceTypesRequest, ListBulkActionResourceTypesResponse>
                    handler);

    /**
     * Lists the resource types that support bulk tag editing.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ListBulkEditTagsResourceTypesResponse>
            listBulkEditTagsResourceTypes(
                    ListBulkEditTagsResourceTypesRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    ListBulkEditTagsResourceTypesRequest,
                                    ListBulkEditTagsResourceTypesResponse>
                            handler);

    /**
     * Lists the compartments in a specified compartment. The members of the list returned depends
     * on the values set for several parameters.
     *
     * <p>With the exception of the tenancy (root compartment), the ListCompartments operation
     * returns only the first-level child compartments in the parent compartment specified in
     * `compartmentId`. The list does not include any subcompartments of the child compartments
     * (grandchildren).
     *
     * <p>The parameter `accessLevel` specifies whether to return only those compartments for which
     * the requestor has INSPECT permissions on at least one resource directly or indirectly (the
     * resource can be in a subcompartment).
     *
     * <p>The parameter `compartmentIdInSubtree` applies only when you perform ListCompartments on
     * the tenancy (root compartment). When set to true, the entire hierarchy of compartments can be
     * returned. To get a full list of all compartments and subcompartments in the tenancy (root
     * compartment), set the parameter `compartmentIdInSubtree` to true and `accessLevel` to ANY.
     *
     * <p>See [Where to Get the Tenancy's OCID and User's
     * OCID](https://docs.oracle.com/iaas/Content/API/Concepts/apisigningkey.htm#five).
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ListCompartmentsResponse> listCompartments(
            ListCompartmentsRequest request,
            com.oracle.bmc.responses.AsyncHandler<ListCompartmentsRequest, ListCompartmentsResponse>
                    handler);

    /**
     * Lists all the tags enabled for cost-tracking in the specified tenancy. For information about
     * cost-tracking tags, see [Using Cost-tracking
     * Tags](https://docs.oracle.com/iaas/Content/Tagging/Tasks/usingcosttrackingtags.htm).
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ListCostTrackingTagsResponse> listCostTrackingTags(
            ListCostTrackingTagsRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            ListCostTrackingTagsRequest, ListCostTrackingTagsResponse>
                    handler);

    /**
     * Lists the secret keys for the specified user. The returned object contains the secret key's
     * OCID, but not the secret key itself. The actual secret key is returned only upon creation.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ListCustomerSecretKeysResponse> listCustomerSecretKeys(
            ListCustomerSecretKeysRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            ListCustomerSecretKeysRequest, ListCustomerSecretKeysResponse>
                    handler);

    /**
     * Lists the DB credentials for the specified user. The returned object contains the
     * credential's OCID
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ListDbCredentialsResponse> listDbCredentials(
            ListDbCredentialsRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            ListDbCredentialsRequest, ListDbCredentialsResponse>
                    handler);

    /**
     * (For tenancies that support identity domains) Lists all identity domains within a tenancy.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ListDomainsResponse> listDomains(
            ListDomainsRequest request,
            com.oracle.bmc.responses.AsyncHandler<ListDomainsRequest, ListDomainsResponse> handler);

    /**
     * Lists the dynamic groups in your tenancy. You must specify your tenancy's OCID as the value
     * for the compartment ID (remember that the tenancy is simply the root compartment). See [Where
     * to Get the Tenancy's OCID and User's
     * OCID](https://docs.oracle.com/iaas/Content/API/Concepts/apisigningkey.htm#five).
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ListDynamicGroupsResponse> listDynamicGroups(
            ListDynamicGroupsRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            ListDynamicGroupsRequest, ListDynamicGroupsResponse>
                    handler);

    /**
     * Lists the Fault Domains in your tenancy. Specify the OCID of either the tenancy or another of
     * your compartments as the value for the compartment ID (remember that the tenancy is simply
     * the root compartment). See [Where to Get the Tenancy's OCID and User's
     * OCID](https://docs.oracle.com/iaas/Content/API/Concepts/apisigningkey.htm#five).
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ListFaultDomainsResponse> listFaultDomains(
            ListFaultDomainsRequest request,
            com.oracle.bmc.responses.AsyncHandler<ListFaultDomainsRequest, ListFaultDomainsResponse>
                    handler);

    /**
     * Lists the groups in your tenancy. You must specify your tenancy's OCID as the value for the
     * compartment ID (remember that the tenancy is simply the root compartment). See [Where to Get
     * the Tenancy's OCID and User's
     * OCID](https://docs.oracle.com/iaas/Content/API/Concepts/apisigningkey.htm#five).
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ListGroupsResponse> listGroups(
            ListGroupsRequest request,
            com.oracle.bmc.responses.AsyncHandler<ListGroupsRequest, ListGroupsResponse> handler);

    /**
     * Gets error details for a specified IAM work request. The workRequestID is returned in the
     * opc-workrequest-id header for any asynchronous operation in the Identity and Access
     * Management service.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ListIamWorkRequestErrorsResponse> listIamWorkRequestErrors(
            ListIamWorkRequestErrorsRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            ListIamWorkRequestErrorsRequest, ListIamWorkRequestErrorsResponse>
                    handler);

    /**
     * Gets logs for a specified IAM work request. The workRequestID is returned in the
     * opc-workrequest-id header for any asynchronous operation in the Identity and Access
     * Management service.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ListIamWorkRequestLogsResponse> listIamWorkRequestLogs(
            ListIamWorkRequestLogsRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            ListIamWorkRequestLogsRequest, ListIamWorkRequestLogsResponse>
                    handler);

    /**
     * Lists the IAM work requests in compartment. The workRequestID is returned in the
     * opc-workrequest-id header for any asynchronous operation in the Identity and Access
     * Management service.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ListIamWorkRequestsResponse> listIamWorkRequests(
            ListIamWorkRequestsRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            ListIamWorkRequestsRequest, ListIamWorkRequestsResponse>
                    handler);

    /**
     * **Deprecated.** For more information, see [Deprecated IAM Service
     * APIs](https://docs.oracle.com/iaas/Content/Identity/Reference/deprecatediamapis.htm).
     *
     * <p>Lists the identity provider groups.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ListIdentityProviderGroupsResponse> listIdentityProviderGroups(
            ListIdentityProviderGroupsRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            ListIdentityProviderGroupsRequest, ListIdentityProviderGroupsResponse>
                    handler);

    /**
     * **Deprecated.** For more information, see [Deprecated IAM Service
     * APIs](https://docs.oracle.com/iaas/Content/Identity/Reference/deprecatediamapis.htm).
     *
     * <p>Lists all the identity providers in your tenancy. You must specify the identity provider
     * type (e.g., `SAML2` for identity providers using the SAML2.0 protocol). You must specify your
     * tenancy's OCID as the value for the compartment ID (remember that the tenancy is simply the
     * root compartment). See [Where to Get the Tenancy's OCID and User's
     * OCID](https://docs.oracle.com/iaas/Content/API/Concepts/apisigningkey.htm#five).
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ListIdentityProvidersResponse> listIdentityProviders(
            ListIdentityProvidersRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            ListIdentityProvidersRequest, ListIdentityProvidersResponse>
                    handler);

    /**
     * **Deprecated.** For more information, see [Deprecated IAM Service
     * APIs](https://docs.oracle.com/iaas/Content/Identity/Reference/deprecatediamapis.htm).
     *
     * <p>Lists the group mappings for the specified identity provider.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ListIdpGroupMappingsResponse> listIdpGroupMappings(
            ListIdpGroupMappingsRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            ListIdpGroupMappingsRequest, ListIdpGroupMappingsResponse>
                    handler);

    /**
     * Lists the MFA TOTP devices for the specified user. The returned object contains the device's
     * OCID, but not the seed. The seed is returned only upon creation or when the IAM service
     * regenerates the MFA seed for the device.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ListMfaTotpDevicesResponse> listMfaTotpDevices(
            ListMfaTotpDevicesRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            ListMfaTotpDevicesRequest, ListMfaTotpDevicesResponse>
                    handler);

    /**
     * Lists the network sources in your tenancy. You must specify your tenancy's OCID as the value
     * for the compartment ID (remember that the tenancy is simply the root compartment). See [Where
     * to Get the Tenancy's OCID and User's
     * OCID](https://docs.oracle.com/iaas/Content/API/Concepts/apisigningkey.htm#five).
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ListNetworkSourcesResponse> listNetworkSources(
            ListNetworkSourcesRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            ListNetworkSourcesRequest, ListNetworkSourcesResponse>
                    handler);

    /**
     * List of Oauth tokens for the user
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ListOAuthClientCredentialsResponse> listOAuthClientCredentials(
            ListOAuthClientCredentialsRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            ListOAuthClientCredentialsRequest, ListOAuthClientCredentialsResponse>
                    handler);

    /**
     * Lists the policies in the specified compartment (either the tenancy or another of your
     * compartments). See [Where to Get the Tenancy's OCID and User's
     * OCID](https://docs.oracle.com/iaas/Content/API/Concepts/apisigningkey.htm#five).
     *
     * <p>To determine which policies apply to a particular group or compartment, you must view the
     * individual statements inside all your policies. There isn't a way to automatically obtain
     * that information via the API.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ListPoliciesResponse> listPolicies(
            ListPoliciesRequest request,
            com.oracle.bmc.responses.AsyncHandler<ListPoliciesRequest, ListPoliciesResponse>
                    handler);

    /**
     * Lists the region subscriptions for the specified tenancy.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ListRegionSubscriptionsResponse> listRegionSubscriptions(
            ListRegionSubscriptionsRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            ListRegionSubscriptionsRequest, ListRegionSubscriptionsResponse>
                    handler);

    /**
     * Lists all the regions offered by Oracle Cloud Infrastructure.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ListRegionsResponse> listRegions(
            ListRegionsRequest request,
            com.oracle.bmc.responses.AsyncHandler<ListRegionsRequest, ListRegionsResponse> handler);

    /**
     * Lists the SMTP credentials for the specified user. The returned object contains the
     * credential's OCID, the SMTP user name but not the SMTP password. The SMTP password is
     * returned only upon creation.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ListSmtpCredentialsResponse> listSmtpCredentials(
            ListSmtpCredentialsRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            ListSmtpCredentialsRequest, ListSmtpCredentialsResponse>
                    handler);

    /**
     * Lists available standard tag namespaces that users can create.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ListStandardTagNamespacesResponse> listStandardTagNamespaces(
            ListStandardTagNamespacesRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            ListStandardTagNamespacesRequest, ListStandardTagNamespacesResponse>
                    handler);

    /**
     * **Deprecated. Use {@link #listAuthTokens(ListAuthTokensRequest, Consumer, Consumer)
     * listAuthTokens} instead.**
     *
     * <p>Lists the Swift passwords for the specified user. The returned object contains the
     * password's OCID, but not the password itself. The actual password is returned only upon
     * creation.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ListSwiftPasswordsResponse> listSwiftPasswords(
            ListSwiftPasswordsRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            ListSwiftPasswordsRequest, ListSwiftPasswordsResponse>
                    handler);

    /**
     * Lists the tag defaults for tag definitions in the specified compartment.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ListTagDefaultsResponse> listTagDefaults(
            ListTagDefaultsRequest request,
            com.oracle.bmc.responses.AsyncHandler<ListTagDefaultsRequest, ListTagDefaultsResponse>
                    handler);

    /**
     * Lists the tag namespaces in the specified compartment.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ListTagNamespacesResponse> listTagNamespaces(
            ListTagNamespacesRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            ListTagNamespacesRequest, ListTagNamespacesResponse>
                    handler);

    /**
     * Gets the errors for a work request.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ListTaggingWorkRequestErrorsResponse> listTaggingWorkRequestErrors(
            ListTaggingWorkRequestErrorsRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            ListTaggingWorkRequestErrorsRequest,
                            ListTaggingWorkRequestErrorsResponse>
                    handler);

    /**
     * Gets the logs for a work request.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ListTaggingWorkRequestLogsResponse> listTaggingWorkRequestLogs(
            ListTaggingWorkRequestLogsRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            ListTaggingWorkRequestLogsRequest, ListTaggingWorkRequestLogsResponse>
                    handler);

    /**
     * Lists the tagging work requests in compartment.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ListTaggingWorkRequestsResponse> listTaggingWorkRequests(
            ListTaggingWorkRequestsRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            ListTaggingWorkRequestsRequest, ListTaggingWorkRequestsResponse>
                    handler);

    /**
     * Lists the tag definitions in the specified tag namespace.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ListTagsResponse> listTags(
            ListTagsRequest request,
            com.oracle.bmc.responses.AsyncHandler<ListTagsRequest, ListTagsResponse> handler);

    /**
     * Lists the `UserGroupMembership` objects in your tenancy. You must specify your tenancy's OCID
     * as the value for the compartment ID (see [Where to Get the Tenancy's OCID and User's
     * OCID](https://docs.oracle.com/iaas/Content/API/Concepts/apisigningkey.htm#five)). You must
     * also then filter the list in one of these ways:
     *
     * <p>- You can limit the results to just the memberships for a given user by specifying a
     * `userId`. - Similarly, you can limit the results to just the memberships for a given group by
     * specifying a `groupId`. - You can set both the `userId` and `groupId` to determine if the
     * specified user is in the specified group. If the answer is no, the response is an empty list.
     * - Although`userId` and `groupId` are not individually required, you must set one of them.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ListUserGroupMembershipsResponse> listUserGroupMemberships(
            ListUserGroupMembershipsRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            ListUserGroupMembershipsRequest, ListUserGroupMembershipsResponse>
                    handler);

    /**
     * Lists the users in your tenancy. You must specify your tenancy's OCID as the value for the
     * compartment ID (remember that the tenancy is simply the root compartment). See [Where to Get
     * the Tenancy's OCID and User's
     * OCID](https://docs.oracle.com/iaas/Content/API/Concepts/apisigningkey.htm#five).
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ListUsersResponse> listUsers(
            ListUsersRequest request,
            com.oracle.bmc.responses.AsyncHandler<ListUsersRequest, ListUsersResponse> handler);

    /**
     * Lists the work requests in compartment.
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
     * Move the compartment to a different parent compartment in the same tenancy. When you move a
     * compartment, all its contents (subcompartments and resources) are moved with it. Note that
     * the `CompartmentId` that you specify in the path is the compartment that you want to move.
     *
     * <p>*IMPORTANT**: After you move a compartment to a new parent compartment, the access
     * policies of the new parent take effect and the policies of the previous parent no longer
     * apply. Ensure that you are aware of the implications for the compartment contents before you
     * move it. For more information, see [Moving a
     * Compartment](https://docs.oracle.com/iaas/Content/Identity/compartments/managingcompartments.htm#MoveCompartment).
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<MoveCompartmentResponse> moveCompartment(
            MoveCompartmentRequest request,
            com.oracle.bmc.responses.AsyncHandler<MoveCompartmentRequest, MoveCompartmentResponse>
                    handler);

    /**
     * Recover the compartment from DELETED state to ACTIVE state.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<RecoverCompartmentResponse> recoverCompartment(
            RecoverCompartmentRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            RecoverCompartmentRequest, RecoverCompartmentResponse>
                    handler);

    /**
     * Remove a resource lock from a tag default.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<RemoveTagDefaultLockResponse> removeTagDefaultLock(
            RemoveTagDefaultLockRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            RemoveTagDefaultLockRequest, RemoveTagDefaultLockResponse>
                    handler);

    /**
     * Remove a resource lock from a tag namespace.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<RemoveTagNamespaceLockResponse> removeTagNamespaceLock(
            RemoveTagNamespaceLockRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            RemoveTagNamespaceLockRequest, RemoveTagNamespaceLockResponse>
                    handler);

    /**
     * Removes a user from a group by deleting the corresponding `UserGroupMembership`.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<RemoveUserFromGroupResponse> removeUserFromGroup(
            RemoveUserFromGroupRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            RemoveUserFromGroupRequest, RemoveUserFromGroupResponse>
                    handler);

    /**
     * Resets the OAuth2 client credentials for the SCIM client associated with this identity
     * provider.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ResetIdpScimClientResponse> resetIdpScimClient(
            ResetIdpScimClientRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            ResetIdpScimClientRequest, ResetIdpScimClientResponse>
                    handler);

    /**
     * Updates the specified auth token's description.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<UpdateAuthTokenResponse> updateAuthToken(
            UpdateAuthTokenRequest request,
            com.oracle.bmc.responses.AsyncHandler<UpdateAuthTokenRequest, UpdateAuthTokenResponse>
                    handler);

    /**
     * Updates authentication policy for the specified tenancy.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<UpdateAuthenticationPolicyResponse> updateAuthenticationPolicy(
            UpdateAuthenticationPolicyRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            UpdateAuthenticationPolicyRequest, UpdateAuthenticationPolicyResponse>
                    handler);

    /**
     * Updates the specified compartment's description or name. You can't update the root
     * compartment.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<UpdateCompartmentResponse> updateCompartment(
            UpdateCompartmentRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            UpdateCompartmentRequest, UpdateCompartmentResponse>
                    handler);

    /**
     * Updates the specified secret key's description.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<UpdateCustomerSecretKeyResponse> updateCustomerSecretKey(
            UpdateCustomerSecretKeyRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            UpdateCustomerSecretKeyRequest, UpdateCustomerSecretKeyResponse>
                    handler);

    /**
     * (For tenancies that support identity domains) Updates identity domain information and the
     * associated Identity Cloud Service (IDCS) stripe.
     *
     * <p>To track the progress of the request, submitting an HTTP GET on the
     * /iamWorkRequests/{iamWorkRequestsId} endpoint retrieves the operation's status.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<UpdateDomainResponse> updateDomain(
            UpdateDomainRequest request,
            com.oracle.bmc.responses.AsyncHandler<UpdateDomainRequest, UpdateDomainResponse>
                    handler);

    /**
     * Updates the specified dynamic group.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<UpdateDynamicGroupResponse> updateDynamicGroup(
            UpdateDynamicGroupRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            UpdateDynamicGroupRequest, UpdateDynamicGroupResponse>
                    handler);

    /**
     * Updates the specified group.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<UpdateGroupResponse> updateGroup(
            UpdateGroupRequest request,
            com.oracle.bmc.responses.AsyncHandler<UpdateGroupRequest, UpdateGroupResponse> handler);

    /**
     * **Deprecated.** For more information, see [Deprecated IAM Service
     * APIs](https://docs.oracle.com/iaas/Content/Identity/Reference/deprecatediamapis.htm).
     *
     * <p>Updates the specified identity provider.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<UpdateIdentityProviderResponse> updateIdentityProvider(
            UpdateIdentityProviderRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            UpdateIdentityProviderRequest, UpdateIdentityProviderResponse>
                    handler);

    /**
     * **Deprecated.** For more information, see [Deprecated IAM Service
     * APIs](https://docs.oracle.com/iaas/Content/Identity/Reference/deprecatediamapis.htm).
     *
     * <p>Updates the specified group mapping.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<UpdateIdpGroupMappingResponse> updateIdpGroupMapping(
            UpdateIdpGroupMappingRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            UpdateIdpGroupMappingRequest, UpdateIdpGroupMappingResponse>
                    handler);

    /**
     * Updates the specified network source.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<UpdateNetworkSourceResponse> updateNetworkSource(
            UpdateNetworkSourceRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            UpdateNetworkSourceRequest, UpdateNetworkSourceResponse>
                    handler);

    /**
     * Updates Oauth token for the user
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<UpdateOAuthClientCredentialResponse> updateOAuthClientCredential(
            UpdateOAuthClientCredentialRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            UpdateOAuthClientCredentialRequest, UpdateOAuthClientCredentialResponse>
                    handler);

    /**
     * Updates the specified policy. You can update the description or the policy statements
     * themselves.
     *
     * <p>Policy changes take effect typically within 10 seconds.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<UpdatePolicyResponse> updatePolicy(
            UpdatePolicyRequest request,
            com.oracle.bmc.responses.AsyncHandler<UpdatePolicyRequest, UpdatePolicyResponse>
                    handler);

    /**
     * Updates the specified SMTP credential's description.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<UpdateSmtpCredentialResponse> updateSmtpCredential(
            UpdateSmtpCredentialRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            UpdateSmtpCredentialRequest, UpdateSmtpCredentialResponse>
                    handler);

    /**
     * **Deprecated. Use {@link #updateAuthToken(UpdateAuthTokenRequest, Consumer, Consumer)
     * updateAuthToken} instead.**
     *
     * <p>Updates the specified Swift password's description.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<UpdateSwiftPasswordResponse> updateSwiftPassword(
            UpdateSwiftPasswordRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            UpdateSwiftPasswordRequest, UpdateSwiftPasswordResponse>
                    handler);

    /**
     * Updates the specified tag definition.
     *
     * <p>Setting `validator` determines the value type. Tags can use either a static value or a
     * list of possible values. Static values are entered by a user applying the tag to a resource.
     * Lists are created by you and the user must apply a value from the list. On update, any values
     * in a list that were previously set do not change, but new values must pass validation. Values
     * already applied to a resource do not change.
     *
     * <p>You cannot remove list values that appear in a TagDefault. To remove a list value that
     * appears in a TagDefault, first update the TagDefault to use a different value.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<UpdateTagResponse> updateTag(
            UpdateTagRequest request,
            com.oracle.bmc.responses.AsyncHandler<UpdateTagRequest, UpdateTagResponse> handler);

    /**
     * Updates the specified tag default. If you specify that a value is required, a value is set
     * during resource creation (either by the user creating the resource or another tag defualt).
     * If no value is set, resource creation is blocked.
     *
     * <p>If the `isRequired` flag is set to \"true\", the value is set during resource creation. *
     * If the `isRequired` flag is set to \"false\", the value you enter is set during resource
     * creation.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<UpdateTagDefaultResponse> updateTagDefault(
            UpdateTagDefaultRequest request,
            com.oracle.bmc.responses.AsyncHandler<UpdateTagDefaultRequest, UpdateTagDefaultResponse>
                    handler);

    /**
     * Updates the the specified tag namespace. You can't update the namespace name.
     *
     * <p>Updating `isRetired` to 'true' retires the namespace and all the tag definitions in the
     * namespace. Reactivating a namespace (changing `isRetired` from 'true' to 'false') does not
     * reactivate tag definitions. To reactivate the tag definitions, you must reactivate each one
     * individually *after* you reactivate the namespace, using {@link #updateTag(UpdateTagRequest,
     * Consumer, Consumer) updateTag}. For more information about retiring tag namespaces, see
     * [Retiring Key Definitions and Namespace
     * Definitions](https://docs.oracle.com/iaas/Content/Tagging/Tasks/managingtagsandtagnamespaces.htm#retiringkeys).
     *
     * <p>You can't add a namespace with the same name as a retired namespace in the same tenancy.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<UpdateTagNamespaceResponse> updateTagNamespace(
            UpdateTagNamespaceRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            UpdateTagNamespaceRequest, UpdateTagNamespaceResponse>
                    handler);

    /**
     * Updates the description of the specified user.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<UpdateUserResponse> updateUser(
            UpdateUserRequest request,
            com.oracle.bmc.responses.AsyncHandler<UpdateUserRequest, UpdateUserResponse> handler);

    /**
     * Updates the capabilities of the specified user.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<UpdateUserCapabilitiesResponse> updateUserCapabilities(
            UpdateUserCapabilitiesRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            UpdateUserCapabilitiesRequest, UpdateUserCapabilitiesResponse>
                    handler);

    /**
     * Updates the state of the specified user.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<UpdateUserStateResponse> updateUserState(
            UpdateUserStateRequest request,
            com.oracle.bmc.responses.AsyncHandler<UpdateUserStateRequest, UpdateUserStateResponse>
                    handler);

    /**
     * Uploads an API signing key for the specified user.
     *
     * <p>Every user has permission to use this operation to upload a key for *their own user ID*.
     * An administrator in your organization does not need to write a policy to give users this
     * ability. To compare, administrators who have permission to the tenancy can use this operation
     * to upload a key for any user, including themselves.
     *
     * <p>*Important:** Even though you have permission to upload an API key, you might not yet have
     * permission to do much else. If you try calling an operation unrelated to your own credential
     * management (e.g., `ListUsers`, `LaunchInstance`) and receive an \"unauthorized\" error, check
     * with an administrator to confirm which IAM Service group(s) you're in and what access you
     * have. Also confirm you're working in the correct compartment.
     *
     * <p>After you send your request, the new object's `lifecycleState` will temporarily be
     * CREATING. Before using the object, first make sure its `lifecycleState` has changed to
     * ACTIVE.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<UploadApiKeyResponse> uploadApiKey(
            UploadApiKeyRequest request,
            com.oracle.bmc.responses.AsyncHandler<UploadApiKeyRequest, UploadApiKeyResponse>
                    handler);
}

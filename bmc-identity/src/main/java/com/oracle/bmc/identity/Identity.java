/**
 * Copyright (c) 2016, 2017, Oracle and/or its affiliates. All rights reserved.
 */
package com.oracle.bmc.identity;

import com.oracle.bmc.identity.requests.*;
import com.oracle.bmc.identity.responses.*;

import com.oracle.bmc.*;

@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
public interface Identity extends AutoCloseable {

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
    void setRegion(Region region);

    /**
     * Sets the region to call (ex, 'us-phoenix-1').
     * <p>
     * Note, this will first try to map the region ID to a known Region and call
     * {@link #setRegion(Region) setRegion}.
     * <p>
     * If no known Region could be determined, it will create an endpoint based on the
     * default endpoint format ({@link Region#formatDefaultRegionEndpoint(Service, String)}
     * and then call {@link #setEndpoint(String) setEndpoint}.
     * @param regionId The public region ID.
     */
    void setRegion(String regionId);

    /**
     * Adds the specified user to the specified group and returns a `UserGroupMembership` object with its own OCID.
     * <p>
     * After you send your request, the new object's `lifecycleState` will temporarily be CREATING. Before using the
     * object, first make sure its `lifecycleState` has changed to ACTIVE.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    AddUserToGroupResponse addUserToGroup(AddUserToGroupRequest request);

    /**
     * Creates a new compartment in your tenancy.
     * <p>
     **Important:** Compartments cannot be renamed or deleted.
     * <p>
     * You must specify your tenancy's OCID as the compartment ID in the request object. Remember that the tenancy
     * is simply the root compartment. For information about OCIDs, see
     * [Resource Identifiers](https://docs.us-phoenix-1.oraclecloud.com/Content/General/Concepts/identifiers.htm).
     * <p>
     * You must also specify a *name* for the compartment, which must be unique across all compartments in
     * your tenancy and cannot be changed. You can use this name or the OCID when writing policies that apply
     * to the compartment. For more information about policies, see
     * [How Policies Work](https://docs.us-phoenix-1.oraclecloud.com/Content/Identity/Concepts/policies.htm).
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
     */
    CreateCompartmentResponse createCompartment(CreateCompartmentRequest request);

    /**
     * Creates a new group in your tenancy.
     * <p>
     * You must specify your tenancy's OCID as the compartment ID in the request object (remember that the tenancy
     * is simply the root compartment). Notice that IAM resources (users, groups, compartments, and some policies)
     * reside within the tenancy itself, unlike cloud resources such as compute instances, which typically
     * reside within compartments inside the tenancy. For information about OCIDs, see
     * [Resource Identifiers](https://docs.us-phoenix-1.oraclecloud.com/Content/General/Concepts/identifiers.htm).
     * <p>
     * You must also specify a *name* for the group, which must be unique across all groups in your tenancy and
     * cannot be changed. You can use this name or the OCID when writing policies that apply to the group. For more
     * information about policies, see [How Policies Work](https://docs.us-phoenix-1.oraclecloud.com/Content/Identity/Concepts/policies.htm).
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
     */
    CreateGroupResponse createGroup(CreateGroupRequest request);

    /**
     * Creates a new identity provider in your tenancy. For more information, see
     * [Identity Providers and Federation](https://docs.us-phoenix-1.oraclecloud.com/Content/Identity/Concepts/federation.htm).
     * <p>
     * You must specify your tenancy's OCID as the compartment ID in the request object.
     * Remember that the tenancy is simply the root compartment. For information about
     * OCIDs, see [Resource Identifiers](https://docs.us-phoenix-1.oraclecloud.com/Content/General/Concepts/identifiers.htm).
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
     */
    CreateIdentityProviderResponse createIdentityProvider(CreateIdentityProviderRequest request);

    /**
     * Creates a single mapping between an IdP group and an IAM Service
     * {@link Group}.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    CreateIdpGroupMappingResponse createIdpGroupMapping(CreateIdpGroupMappingRequest request);

    /**
     * Creates a new Console one-time password for the specified user. For more information about user
     * credentials, see [User Credentials](https://docs.us-phoenix-1.oraclecloud.com/Content/Identity/Concepts/usercredentials.htm).
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
     */
    CreateOrResetUIPasswordResponse createOrResetUIPassword(CreateOrResetUIPasswordRequest request);

    /**
     * Creates a new policy in the specified compartment (either the tenancy or another of your compartments).
     * If you're new to policies, see [Getting Started with Policies](https://docs.us-phoenix-1.oraclecloud.com/Content/Identity/Concepts/policygetstarted.htm).
     * <p>
     * You must specify a *name* for the policy, which must be unique across all policies in your tenancy
     * and cannot be changed.
     * <p>
     * You must also specify a *description* for the policy (although it can be an empty string). It does not
     * have to be unique, and you can change it anytime with {@link #updatePolicy(UpdatePolicyRequest) updatePolicy}.
     * <p>
     * You must specify one or more policy statements in the statements array. For information about writing
     * policies, see [How Policies Work](https://docs.us-phoenix-1.oraclecloud.com/Content/Identity/Concepts/policies.htm) and
     * [Common Policies](https://docs.us-phoenix-1.oraclecloud.com/Content/Identity/Concepts/commonpolicies.htm).
     * <p>
     * After you send your request, the new object's `lifecycleState` will temporarily be CREATING. Before using the
     * object, first make sure its `lifecycleState` has changed to ACTIVE.
     * <p>
     * New policies take effect typically within 10 seconds.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    CreatePolicyResponse createPolicy(CreatePolicyRequest request);

    /**
     * Creates a subscription to a region for a tenancy.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    CreateRegionSubscriptionResponse createRegionSubscription(
            CreateRegionSubscriptionRequest request);

    /**
     * Creates a new Swift password for the specified user. For information about what Swift passwords are for, see
     * [Managing User Credentials](https://docs.us-phoenix-1.oraclecloud.com/Content/Identity/Tasks/managingcredentials.htm).
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
     */
    CreateSwiftPasswordResponse createSwiftPassword(CreateSwiftPasswordRequest request);

    /**
     * Creates a new user in your tenancy. For conceptual information about users, your tenancy, and other
     * IAM Service components, see [Overview of the IAM Service](https://docs.us-phoenix-1.oraclecloud.com/Content/Identity/Concepts/overview.htm).
     * <p>
     * You must specify your tenancy's OCID as the compartment ID in the request object (remember that the
     * tenancy is simply the root compartment). Notice that IAM resources (users, groups, compartments, and
     * some policies) reside within the tenancy itself, unlike cloud resources such as compute instances,
     * which typically reside within compartments inside the tenancy. For information about OCIDs, see
     * [Resource Identifiers](https://docs.us-phoenix-1.oraclecloud.com/Content/General/Concepts/identifiers.htm).
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
     * If the user needs to access the Oracle Bare Metal Cloud Services REST API, you need to upload a
     * public API signing key for that user (see
     * [Required Keys and OCIDs](https://docs.us-phoenix-1.oraclecloud.com/Content/API/Concepts/apisigningkey.htm) and also
     * {@link #uploadApiKey(UploadApiKeyRequest) uploadApiKey}).
     * <p>
     **Important:** Make sure to inform the new user which compartment(s) they have access to.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    CreateUserResponse createUser(CreateUserRequest request);

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
     */
    DeleteApiKeyResponse deleteApiKey(DeleteApiKeyRequest request);

    /**
     * Deletes the specified group. The group must be empty.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    DeleteGroupResponse deleteGroup(DeleteGroupRequest request);

    /**
     * Deletes the specified identity provider. The identity provider must not have
     * any group mappings (see {@link IdpGroupMapping}).
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    DeleteIdentityProviderResponse deleteIdentityProvider(DeleteIdentityProviderRequest request);

    /**
     * Deletes the specified group mapping.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    DeleteIdpGroupMappingResponse deleteIdpGroupMapping(DeleteIdpGroupMappingRequest request);

    /**
     * Deletes the specified policy. The deletion takes effect typically within 10 seconds.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    DeletePolicyResponse deletePolicy(DeletePolicyRequest request);

    /**
     * Deletes the specified Swift password for the specified user.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    DeleteSwiftPasswordResponse deleteSwiftPassword(DeleteSwiftPasswordRequest request);

    /**
     * Deletes the specified user. The user must not be in any groups.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    DeleteUserResponse deleteUser(DeleteUserRequest request);

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
     */
    GetCompartmentResponse getCompartment(GetCompartmentRequest request);

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
     */
    GetGroupResponse getGroup(GetGroupRequest request);

    /**
     * Gets the specified identity provider's information.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    GetIdentityProviderResponse getIdentityProvider(GetIdentityProviderRequest request);

    /**
     * Gets the specified group mapping.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    GetIdpGroupMappingResponse getIdpGroupMapping(GetIdpGroupMappingRequest request);

    /**
     * Gets the specified policy's information.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    GetPolicyResponse getPolicy(GetPolicyRequest request);

    /**
     * Get the specified tenancy's information.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    GetTenancyResponse getTenancy(GetTenancyRequest request);

    /**
     * Gets the specified user's information.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    GetUserResponse getUser(GetUserRequest request);

    /**
     * Gets the specified UserGroupMembership's information.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    GetUserGroupMembershipResponse getUserGroupMembership(GetUserGroupMembershipRequest request);

    /**
     * Lists the API signing keys for the specified user. A user can have a maximum of three keys.
     * <p>
     * Every user has permission to use this API call for *their own user ID*.  An administrator in your
     * organization does not need to write a policy to give users this ability.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    ListApiKeysResponse listApiKeys(ListApiKeysRequest request);

    /**
     * Lists the Availability Domains in your tenancy. Specify the OCID of either the tenancy or another
     * of your compartments as the value for the compartment ID (remember that the tenancy is simply the root compartment).
     * See [Where to Get the Tenancy's OCID and User's OCID](https://docs.us-phoenix-1.oraclecloud.com/Content/API/Concepts/apisigningkey.htm#five).
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    ListAvailabilityDomainsResponse listAvailabilityDomains(ListAvailabilityDomainsRequest request);

    /**
     * Lists the compartments in your tenancy. You must specify your tenancy's OCID as the value
     * for the compartment ID (remember that the tenancy is simply the root compartment).
     * See [Where to Get the Tenancy's OCID and User's OCID](https://docs.us-phoenix-1.oraclecloud.com/Content/API/Concepts/apisigningkey.htm#five).
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    ListCompartmentsResponse listCompartments(ListCompartmentsRequest request);

    /**
     * Lists the groups in your tenancy. You must specify your tenancy's OCID as the value for
     * the compartment ID (remember that the tenancy is simply the root compartment).
     * See [Where to Get the Tenancy's OCID and User's OCID](https://docs.us-phoenix-1.oraclecloud.com/Content/API/Concepts/apisigningkey.htm#five).
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    ListGroupsResponse listGroups(ListGroupsRequest request);

    /**
     * Lists all the identity providers in your tenancy. You must specify the identity provider type (e.g., `SAML2` for
     * identity providers using the SAML2.0 protocol). You must specify your tenancy's OCID as the value for the
     * compartment ID (remember that the tenancy is simply the root compartment).
     * See [Where to Get the Tenancy's OCID and User's OCID](https://docs.us-phoenix-1.oraclecloud.com/Content/API/Concepts/apisigningkey.htm#five).
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    ListIdentityProvidersResponse listIdentityProviders(ListIdentityProvidersRequest request);

    /**
     * Lists the group mappings for the specified identity provider.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    ListIdpGroupMappingsResponse listIdpGroupMappings(ListIdpGroupMappingsRequest request);

    /**
     * Lists the policies in the specified compartment (either the tenancy or another of your compartments).
     * See [Where to Get the Tenancy's OCID and User's OCID](https://docs.us-phoenix-1.oraclecloud.com/Content/API/Concepts/apisigningkey.htm#five).
     * <p>
     * To determine which policies apply to a particular group or compartment, you must view the individual
     * statements inside all your policies. There isn't a way to automatically obtain that information via the API.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    ListPoliciesResponse listPolicies(ListPoliciesRequest request);

    /**
     * Lists the region subscriptions for the specified tenancy.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    ListRegionSubscriptionsResponse listRegionSubscriptions(ListRegionSubscriptionsRequest request);

    /**
     * Lists all the regions offered by Oracle Bare Metal Cloud Services.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    ListRegionsResponse listRegions(ListRegionsRequest request);

    /**
     * Lists the Swift passwords for the specified user. The returned object contains the password's OCID, but not
     * the password itself. The actual password is returned only upon creation.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    ListSwiftPasswordsResponse listSwiftPasswords(ListSwiftPasswordsRequest request);

    /**
     * Lists the `UserGroupMembership` objects in your tenancy. You must specify your tenancy's OCID
     * as the value for the compartment ID
     * (see [Where to Get the Tenancy's OCID and User's OCID](https://docs.us-phoenix-1.oraclecloud.com/Content/API/Concepts/apisigningkey.htm#five)).
     * You must also then filter the list in one of these ways:
     * <p>
     * - You can limit the results to just the memberships for a given user by specifying a `userId`.
     * - Similarly, you can limit the results to just the memberships for a given group by specifying a `groupId`.
     * - You can set both the `userId` and `groupId` to determine if the specified user is in the specified group.
     * If the answer is no, the response is an empty list.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    ListUserGroupMembershipsResponse listUserGroupMemberships(
            ListUserGroupMembershipsRequest request);

    /**
     * Lists the users in your tenancy. You must specify your tenancy's OCID as the value for the
     * compartment ID (remember that the tenancy is simply the root compartment).
     * See [Where to Get the Tenancy's OCID and User's OCID](https://docs.us-phoenix-1.oraclecloud.com/Content/API/Concepts/apisigningkey.htm#five).
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    ListUsersResponse listUsers(ListUsersRequest request);

    /**
     * Removes a user from a group by deleting the corresponding `UserGroupMembership`.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    RemoveUserFromGroupResponse removeUserFromGroup(RemoveUserFromGroupRequest request);

    /**
     * Updates the specified compartment's description.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    UpdateCompartmentResponse updateCompartment(UpdateCompartmentRequest request);

    /**
     * Updates the specified group.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    UpdateGroupResponse updateGroup(UpdateGroupRequest request);

    /**
     * Updates the specified identity provider.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    UpdateIdentityProviderResponse updateIdentityProvider(UpdateIdentityProviderRequest request);

    /**
     * Updates the specified group mapping.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    UpdateIdpGroupMappingResponse updateIdpGroupMapping(UpdateIdpGroupMappingRequest request);

    /**
     * Updates the specified policy. You can update the description or the policy statements themselves.
     * <p>
     * Policy changes take effect typically within 10 seconds.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    UpdatePolicyResponse updatePolicy(UpdatePolicyRequest request);

    /**
     * Updates the specified Swift password's description.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    UpdateSwiftPasswordResponse updateSwiftPassword(UpdateSwiftPasswordRequest request);

    /**
     * Updates the description of the specified user.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    UpdateUserResponse updateUser(UpdateUserRequest request);

    /**
     * Updates the state of the specified user.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
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
     */
    UploadApiKeyResponse uploadApiKey(UploadApiKeyRequest request);

    /**
     * Gets the pre-configured waiters available for resources for this service.
     *
     * @return The service waiters.
     */
    IdentityWaiters getWaiters();
}

/**
 * Copyright (c) 2016, 2020, Oracle and/or its affiliates. All rights reserved.
 */
package com.oracle.bmc.identity;

import com.oracle.bmc.identity.requests.*;
import com.oracle.bmc.identity.responses.*;

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
     * Activates the specified MFA TOTP device for the user. Activation requires manual interaction with the Console.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
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
     */
    AssembleEffectiveTagSetResponse assembleEffectiveTagSet(AssembleEffectiveTagSetRequest request);

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
     */
    CreateCompartmentResponse createCompartment(CreateCompartmentRequest request);

    /**
     * Creates a new secret key for the specified user. Secret keys are used for authentication with the Object Storage Service's Amazon S3
     * compatible API. For information, see
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
     */
    CreateCustomerSecretKeyResponse createCustomerSecretKey(CreateCustomerSecretKeyRequest request);

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
     */
    CreateGroupResponse createGroup(CreateGroupRequest request);

    /**
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
     * Creates a new MFA TOTP device for the user. A user can have one MFA TOTP device.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
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
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    CreateNetworkSourceResponse createNetworkSource(CreateNetworkSourceRequest request);

    /**
     * Creates Oauth token for the user
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
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
     * Creates a new SMTP credential for the specified user. An SMTP credential has an SMTP user name and an SMTP password.
     * You must specify a *description* for the SMTP credential (although it can be an empty string). It does not
     * have to be unique, and you can change it anytime with
     * {@link #updateSmtpCredential(UpdateSmtpCredentialRequest) updateSmtpCredential}.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
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
     * Deletes the specified auth token for the specified user.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    DeleteAuthTokenResponse deleteAuthToken(DeleteAuthTokenRequest request);

    /**
     * Deletes the specified compartment. The compartment must be empty.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    DeleteCompartmentResponse deleteCompartment(DeleteCompartmentRequest request);

    /**
     * Deletes the specified secret key for the specified user.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    DeleteCustomerSecretKeyResponse deleteCustomerSecretKey(DeleteCustomerSecretKeyRequest request);

    /**
     * Deletes the specified dynamic group.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    DeleteDynamicGroupResponse deleteDynamicGroup(DeleteDynamicGroupRequest request);

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
     * Deletes the specified MFA TOTP device for the specified user.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    DeleteMfaTotpDeviceResponse deleteMfaTotpDevice(DeleteMfaTotpDeviceRequest request);

    /**
     * Deletes the specified network source
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    DeleteNetworkSourceResponse deleteNetworkSource(DeleteNetworkSourceRequest request);

    /**
     * Delete Oauth token for the user
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    DeleteOAuthClientCredentialResponse deleteOAuthClientCredential(
            DeleteOAuthClientCredentialRequest request);

    /**
     * Deletes the specified policy. The deletion takes effect typically within 10 seconds.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    DeletePolicyResponse deletePolicy(DeletePolicyRequest request);

    /**
     * Deletes the specified SMTP credential for the specified user.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
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
     * Once you start the delete operation, the state of the tag changes to DELETING and tag removal
     * from resources begins. This can take up to 48 hours depending on the number of resources that
     * were tagged as well as the regions in which those resources reside. When all tags have been
     * removed, the state changes to DELETED. You cannot restore a deleted tag. Once the deleted tag
     * changes its state to DELETED, you can use the same tag name again.
     * <p>
     * To delete a tag, you must first retire it. Use {@link #updateTag(UpdateTagRequest) updateTag}
     * to retire a tag.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    DeleteTagResponse deleteTag(DeleteTagRequest request);

    /**
     * Deletes the the specified tag default.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    DeleteTagDefaultResponse deleteTagDefault(DeleteTagDefaultRequest request);

    /**
     * Deletes the specified tag namespace. Only an empty tag namespace can be deleted. To delete
     * a tag namespace, first delete all its tag definitions.
     * <p>
     * Use {@link #deleteTag(DeleteTagRequest) deleteTag} to delete a tag definition.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    DeleteTagNamespaceResponse deleteTagNamespace(DeleteTagNamespaceRequest request);

    /**
     * Deletes the specified user. The user must not be in any groups.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    DeleteUserResponse deleteUser(DeleteUserRequest request);

    /**
     * Generate seed for the MFA TOTP device.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    GenerateTotpSeedResponse generateTotpSeed(GenerateTotpSeedRequest request);

    /**
     * Gets the authentication policy for the given tenancy. You must specify your tenant\u2019s OCID as the value for
     * the compartment ID (remember that the tenancy is simply the root compartment).
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
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
     */
    GetCompartmentResponse getCompartment(GetCompartmentRequest request);

    /**
     * Gets the specified dynamic group's information.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
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
     * Get the specified MFA TOTP device for the specified user.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    GetMfaTotpDeviceResponse getMfaTotpDevice(GetMfaTotpDeviceRequest request);

    /**
     * Gets the specified network source's information.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    GetNetworkSourceResponse getNetworkSource(GetNetworkSourceRequest request);

    /**
     * Gets the specified policy's information.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    GetPolicyResponse getPolicy(GetPolicyRequest request);

    /**
     * Gets the specified tag's information.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    GetTagResponse getTag(GetTagRequest request);

    /**
     * Retrieves the specified tag default.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    GetTagDefaultResponse getTagDefault(GetTagDefaultRequest request);

    /**
     * Gets the specified tag namespace's information.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    GetTagNamespaceResponse getTagNamespace(GetTagNamespaceRequest request);

    /**
     * Gets details on a specified work request. The workRequestID is returned in the opc-workrequest-id header
     * for any asynchronous operation in the Identity and Access Management service.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    GetTaggingWorkRequestResponse getTaggingWorkRequest(GetTaggingWorkRequestRequest request);

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
     * Gets the specified user's console password information. The returned object contains the user's OCID,
     * but not the password itself. The actual password is returned only when created or reset.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    GetUserUIPasswordInformationResponse getUserUIPasswordInformation(
            GetUserUIPasswordInformationRequest request);

    /**
     * Gets details on a specified work request. The workRequestID is returned in the opc-workrequest-id header
     * for any asynchronous operation in the Identity and Access Management service.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    GetWorkRequestResponse getWorkRequest(GetWorkRequestRequest request);

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
     * Lists the auth tokens for the specified user. The returned object contains the token's OCID, but not
     * the token itself. The actual token is returned only upon creation.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
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
     */
    ListAvailabilityDomainsResponse listAvailabilityDomains(ListAvailabilityDomainsRequest request);

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
     */
    ListCompartmentsResponse listCompartments(ListCompartmentsRequest request);

    /**
     * Lists all the tags enabled for cost-tracking in the specified tenancy. For information about
     * cost-tracking tags, see [Using Cost-tracking Tags](https://docs.cloud.oracle.com/Content/Identity/Concepts/taggingoverview.htm#costs).
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    ListCostTrackingTagsResponse listCostTrackingTags(ListCostTrackingTagsRequest request);

    /**
     * Lists the secret keys for the specified user. The returned object contains the secret key's OCID, but not
     * the secret key itself. The actual secret key is returned only upon creation.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    ListCustomerSecretKeysResponse listCustomerSecretKeys(ListCustomerSecretKeysRequest request);

    /**
     * Lists the dynamic groups in your tenancy. You must specify your tenancy's OCID as the value for
     * the compartment ID (remember that the tenancy is simply the root compartment).
     * See [Where to Get the Tenancy's OCID and User's OCID](https://docs.cloud.oracle.com/Content/API/Concepts/apisigningkey.htm#five).
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
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
     */
    ListGroupsResponse listGroups(ListGroupsRequest request);

    /**
     * Lists the identity provider groups.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    ListIdentityProviderGroupsResponse listIdentityProviderGroups(
            ListIdentityProviderGroupsRequest request);

    /**
     * Lists all the identity providers in your tenancy. You must specify the identity provider type (e.g., `SAML2` for
     * identity providers using the SAML2.0 protocol). You must specify your tenancy's OCID as the value for the
     * compartment ID (remember that the tenancy is simply the root compartment).
     * See [Where to Get the Tenancy's OCID and User's OCID](https://docs.cloud.oracle.com/Content/API/Concepts/apisigningkey.htm#five).
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
     * Lists the MFA TOTP devices for the specified user. The returned object contains the device's OCID, but not
     * the seed. The seed is returned only upon creation or when the IAM service regenerates the MFA seed for the device.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
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
     */
    ListNetworkSourcesResponse listNetworkSources(ListNetworkSourcesRequest request);

    /**
     * List of Oauth tokens for the user
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
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
     * Lists all the regions offered by Oracle Cloud Infrastructure.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    ListRegionsResponse listRegions(ListRegionsRequest request);

    /**
     * Lists the SMTP credentials for the specified user. The returned object contains the credential's OCID,
     * the SMTP user name but not the SMTP password. The SMTP password is returned only upon creation.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    ListSmtpCredentialsResponse listSmtpCredentials(ListSmtpCredentialsRequest request);

    /**
     * **Deprecated. Use {@link #listAuthTokens(ListAuthTokensRequest) listAuthTokens} instead.**
     * <p>
     * Lists the Swift passwords for the specified user. The returned object contains the password's OCID, but not
     * the password itself. The actual password is returned only upon creation.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    ListSwiftPasswordsResponse listSwiftPasswords(ListSwiftPasswordsRequest request);

    /**
     * Lists the tag defaults for tag definitions in the specified compartment.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    ListTagDefaultsResponse listTagDefaults(ListTagDefaultsRequest request);

    /**
     * Lists the tag namespaces in the specified compartment.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    ListTagNamespacesResponse listTagNamespaces(ListTagNamespacesRequest request);

    /**
     * Gets the errors for a work request.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    ListTaggingWorkRequestErrorsResponse listTaggingWorkRequestErrors(
            ListTaggingWorkRequestErrorsRequest request);

    /**
     * Gets the logs for a work request.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    ListTaggingWorkRequestLogsResponse listTaggingWorkRequestLogs(
            ListTaggingWorkRequestLogsRequest request);

    /**
     * Lists the tagging work requests in compartment.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    ListTaggingWorkRequestsResponse listTaggingWorkRequests(ListTaggingWorkRequestsRequest request);

    /**
     * Lists the tag definitions in the specified tag namespace.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
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
     */
    ListUsersResponse listUsers(ListUsersRequest request);

    /**
     * Lists the work requests in compartment.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
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
     */
    MoveCompartmentResponse moveCompartment(MoveCompartmentRequest request);

    /**
     * Recover the compartment from DELETED state to ACTIVE state.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    RecoverCompartmentResponse recoverCompartment(RecoverCompartmentRequest request);

    /**
     * Removes a user from a group by deleting the corresponding `UserGroupMembership`.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    RemoveUserFromGroupResponse removeUserFromGroup(RemoveUserFromGroupRequest request);

    /**
     * Resets the OAuth2 client credentials for the SCIM client associated with this identity provider.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    ResetIdpScimClientResponse resetIdpScimClient(ResetIdpScimClientRequest request);

    /**
     * Updates the specified auth token's description.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    UpdateAuthTokenResponse updateAuthToken(UpdateAuthTokenRequest request);

    /**
     * Updates authentication policy for the specified tenancy
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    UpdateAuthenticationPolicyResponse updateAuthenticationPolicy(
            UpdateAuthenticationPolicyRequest request);

    /**
     * Updates the specified compartment's description or name. You can't update the root compartment.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    UpdateCompartmentResponse updateCompartment(UpdateCompartmentRequest request);

    /**
     * Updates the specified secret key's description.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    UpdateCustomerSecretKeyResponse updateCustomerSecretKey(UpdateCustomerSecretKeyRequest request);

    /**
     * Updates the specified dynamic group.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    UpdateDynamicGroupResponse updateDynamicGroup(UpdateDynamicGroupRequest request);

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
     * Updates the specified network source.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    UpdateNetworkSourceResponse updateNetworkSource(UpdateNetworkSourceRequest request);

    /**
     * Updates Oauth token for the user
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
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
     */
    UpdatePolicyResponse updatePolicy(UpdatePolicyRequest request);

    /**
     * Updates the specified SMTP credential's description.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
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
     */
    UpdateTagNamespaceResponse updateTagNamespace(UpdateTagNamespaceRequest request);

    /**
     * Updates the description of the specified user.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    UpdateUserResponse updateUser(UpdateUserRequest request);

    /**
     * Updates the capabilities of the specified user.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    UpdateUserCapabilitiesResponse updateUserCapabilities(UpdateUserCapabilitiesRequest request);

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

    /**
     * Gets the pre-configured paginators available for list operations in this service which may return multiple
     * pages of data. These paginators provide an {@link java.lang.Iterable} interface so that service responses, or
     * resources/records, can be iterated through without having to manually deal with pagination and page tokens.
     *
     * @return The service paginators.
     */
    IdentityPaginators getPaginators();
}

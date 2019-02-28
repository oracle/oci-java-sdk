/**
 * Copyright (c) 2016, 2019, Oracle and/or its affiliates. All rights reserved.
 */
package com.oracle.bmc.identity;

import com.oracle.bmc.identity.requests.*;
import com.oracle.bmc.identity.responses.*;

@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
public interface IdentityAsync extends AutoCloseable {

    /**
     * Sets the endpoint to call (ex, https://www.example.com).
     * @param endpoint The endpoint of the serice.
     */
    void setEndpoint(String endpoint);

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
     * Activate the specified MFA TOTP device for the user.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<ActivateMfaTotpDeviceResponse> activateMfaTotpDevice(
            ActivateMfaTotpDeviceRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            ActivateMfaTotpDeviceRequest, ActivateMfaTotpDeviceResponse>
                    handler);

    /**
     * Adds the specified user to the specified group and returns a `UserGroupMembership` object with its own OCID.
     * <p>
     * After you send your request, the new object's `lifecycleState` will temporarily be CREATING. Before using the
     * object, first make sure its `lifecycleState` has changed to ACTIVE.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<AddUserToGroupResponse> addUserToGroup(
            AddUserToGroupRequest request,
            com.oracle.bmc.responses.AsyncHandler<AddUserToGroupRequest, AddUserToGroupResponse>
                    handler);

    /**
     * Moves the specified tag namespace to the specified compartment within the same tenancy.
     * <p>
     * To move the tag namespace, you must have the manage tag-namespaces permission on both compartments.
     * For more information about IAM policies, see [Details for IAM](https://docs.us-phoenix-1.oraclecloud.com/Content/Identity/Reference/iampolicyreference.htm).
     * <p>
     * Moving a tag namespace moves all the tag key definitions contained in the tag namespace.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<ChangeTagNamespaceCompartmentResponse>
            changeTagNamespaceCompartment(
                    ChangeTagNamespaceCompartmentRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    ChangeTagNamespaceCompartmentRequest,
                                    ChangeTagNamespaceCompartmentResponse>
                            handler);

    /**
     * Creates a new auth token for the specified user. For information about what auth tokens are for, see
     * [Managing User Credentials](https://docs.us-phoenix-1.oraclecloud.com/Content/Identity/Tasks/managingcredentials.htm).
     * <p>
     * You must specify a *description* for the auth token (although it can be an empty string). It does not
     * have to be unique, and you can change it anytime with
     * {@link #updateAuthToken(UpdateAuthTokenRequest, Consumer, Consumer) updateAuthToken}.
     * <p>
     * Every user has permission to create an auth token for *their own user ID*. An administrator in your organization
     * does not need to write a policy to give users this ability. To compare, administrators who have permission to the
     * tenancy can use this operation to create an auth token for any user, including themselves.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<CreateAuthTokenResponse> createAuthToken(
            CreateAuthTokenRequest request,
            com.oracle.bmc.responses.AsyncHandler<CreateAuthTokenRequest, CreateAuthTokenResponse>
                    handler);

    /**
     * Creates a new compartment in the specified compartment.
     * <p>
     **Important:** Compartments cannot be deleted.
     * <p>
     * Specify the parent compartment's OCID as the compartment ID in the request object. Remember that the tenancy
     * is simply the root compartment. For information about OCIDs, see
     * [Resource Identifiers](https://docs.us-phoenix-1.oraclecloud.com/Content/General/Concepts/identifiers.htm).
     * <p>
     * You must also specify a *name* for the compartment, which must be unique across all compartments in
     * your tenancy. You can use this name or the OCID when writing policies that apply
     * to the compartment. For more information about policies, see
     * [How Policies Work](https://docs.us-phoenix-1.oraclecloud.com/Content/Identity/Concepts/policies.htm).
     * <p>
     * You must also specify a *description* for the compartment (although it can be an empty string). It does
     * not have to be unique, and you can change it anytime with
     * {@link #updateCompartment(UpdateCompartmentRequest, Consumer, Consumer) updateCompartment}.
     * <p>
     * After you send your request, the new object's `lifecycleState` will temporarily be CREATING. Before using the
     * object, first make sure its `lifecycleState` has changed to ACTIVE.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<CreateCompartmentResponse> createCompartment(
            CreateCompartmentRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            CreateCompartmentRequest, CreateCompartmentResponse>
                    handler);

    /**
     * Creates a new secret key for the specified user. Secret keys are used for authentication with the Object Storage Service's Amazon S3
     * compatible API. For information, see
     * [Managing User Credentials](https://docs.us-phoenix-1.oraclecloud.com/Content/Identity/Tasks/managingcredentials.htm).
     * <p>
     * You must specify a *description* for the secret key (although it can be an empty string). It does not
     * have to be unique, and you can change it anytime with
     * {@link #updateCustomerSecretKey(UpdateCustomerSecretKeyRequest, Consumer, Consumer) updateCustomerSecretKey}.
     * <p>
     * Every user has permission to create a secret key for *their own user ID*. An administrator in your organization
     * does not need to write a policy to give users this ability. To compare, administrators who have permission to the
     * tenancy can use this operation to create a secret key for any user, including themselves.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<CreateCustomerSecretKeyResponse> createCustomerSecretKey(
            CreateCustomerSecretKeyRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            CreateCustomerSecretKeyRequest, CreateCustomerSecretKeyResponse>
                    handler);

    /**
     * Creates a new dynamic group in your tenancy.
     * <p>
     * You must specify your tenancy's OCID as the compartment ID in the request object (remember that the tenancy
     * is simply the root compartment). Notice that IAM resources (users, groups, compartments, and some policies)
     * reside within the tenancy itself, unlike cloud resources such as compute instances, which typically
     * reside within compartments inside the tenancy. For information about OCIDs, see
     * [Resource Identifiers](https://docs.us-phoenix-1.oraclecloud.com/Content/General/Concepts/identifiers.htm).
     * <p>
     * You must also specify a *name* for the dynamic group, which must be unique across all dynamic groups in your
     * tenancy, and cannot be changed. Note that this name has to be also unique accross all groups in your tenancy.
     * You can use this name or the OCID when writing policies that apply to the dynamic group. For more information
     * about policies, see [How Policies Work](https://docs.us-phoenix-1.oraclecloud.com/Content/Identity/Concepts/policies.htm).
     * <p>
     * You must also specify a *description* for the dynamic group (although it can be an empty string). It does not
     * have to be unique, and you can change it anytime with {@link #updateDynamicGroup(UpdateDynamicGroupRequest, Consumer, Consumer) updateDynamicGroup}.
     * <p>
     * After you send your request, the new object's `lifecycleState` will temporarily be CREATING. Before using the
     * object, first make sure its `lifecycleState` has changed to ACTIVE.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<CreateDynamicGroupResponse> createDynamicGroup(
            CreateDynamicGroupRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            CreateDynamicGroupRequest, CreateDynamicGroupResponse>
                    handler);

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
     * have to be unique, and you can change it anytime with {@link #updateGroup(UpdateGroupRequest, Consumer, Consumer) updateGroup}.
     * <p>
     * After you send your request, the new object's `lifecycleState` will temporarily be CREATING. Before using the
     * object, first make sure its `lifecycleState` has changed to ACTIVE.
     * <p>
     * After creating the group, you need to put users in it and write policies for it.
     * See {@link #addUserToGroup(AddUserToGroupRequest, Consumer, Consumer) addUserToGroup} and
     * {@link #createPolicy(CreatePolicyRequest, Consumer, Consumer) createPolicy}.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<CreateGroupResponse> createGroup(
            CreateGroupRequest request,
            com.oracle.bmc.responses.AsyncHandler<CreateGroupRequest, CreateGroupResponse> handler);

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
     * {@link #updateIdentityProvider(UpdateIdentityProviderRequest, Consumer, Consumer) updateIdentityProvider}.
     * <p>
     * After you send your request, the new object's `lifecycleState` will temporarily
     * be CREATING. Before using the object, first make sure its `lifecycleState` has
     * changed to ACTIVE.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<CreateIdentityProviderResponse> createIdentityProvider(
            CreateIdentityProviderRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            CreateIdentityProviderRequest, CreateIdentityProviderResponse>
                    handler);

    /**
     * Creates a single mapping between an IdP group and an IAM Service
     * {@link Group}.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<CreateIdpGroupMappingResponse> createIdpGroupMapping(
            CreateIdpGroupMappingRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            CreateIdpGroupMappingRequest, CreateIdpGroupMappingResponse>
                    handler);

    /**
     * Create a new MFA TOTP device for the user. A user can only create one MFA TOTP device.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<CreateMfaTotpDeviceResponse> createMfaTotpDevice(
            CreateMfaTotpDeviceRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            CreateMfaTotpDeviceRequest, CreateMfaTotpDeviceResponse>
                    handler);

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
     * (see {@link #createUser(CreateUserRequest, Consumer, Consumer) createUser}).
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<CreateOrResetUIPasswordResponse> createOrResetUIPassword(
            CreateOrResetUIPasswordRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            CreateOrResetUIPasswordRequest, CreateOrResetUIPasswordResponse>
                    handler);

    /**
     * Creates a new policy in the specified compartment (either the tenancy or another of your compartments).
     * If you're new to policies, see [Getting Started with Policies](https://docs.us-phoenix-1.oraclecloud.com/Content/Identity/Concepts/policygetstarted.htm).
     * <p>
     * You must specify a *name* for the policy, which must be unique across all policies in your tenancy
     * and cannot be changed.
     * <p>
     * You must also specify a *description* for the policy (although it can be an empty string). It does not
     * have to be unique, and you can change it anytime with {@link #updatePolicy(UpdatePolicyRequest, Consumer, Consumer) updatePolicy}.
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
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<CreatePolicyResponse> createPolicy(
            CreatePolicyRequest request,
            com.oracle.bmc.responses.AsyncHandler<CreatePolicyRequest, CreatePolicyResponse>
                    handler);

    /**
     * Creates a subscription to a region for a tenancy.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<CreateRegionSubscriptionResponse> createRegionSubscription(
            CreateRegionSubscriptionRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            CreateRegionSubscriptionRequest, CreateRegionSubscriptionResponse>
                    handler);

    /**
     * Creates a new SMTP credential for the specified user. An SMTP credential has an SMTP user name and an SMTP password.
     * You must specify a *description* for the SMTP credential (although it can be an empty string). It does not
     * have to be unique, and you can change it anytime with
     * {@link #updateSmtpCredential(UpdateSmtpCredentialRequest, Consumer, Consumer) updateSmtpCredential}.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<CreateSmtpCredentialResponse> createSmtpCredential(
            CreateSmtpCredentialRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            CreateSmtpCredentialRequest, CreateSmtpCredentialResponse>
                    handler);

    /**
     * **Deprecated. Use {@link #createAuthToken(CreateAuthTokenRequest, Consumer, Consumer) createAuthToken} instead.**
     * <p>
     * Creates a new Swift password for the specified user. For information about what Swift passwords are for, see
     * [Managing User Credentials](https://docs.us-phoenix-1.oraclecloud.com/Content/Identity/Tasks/managingcredentials.htm).
     * <p>
     * You must specify a *description* for the Swift password (although it can be an empty string). It does not
     * have to be unique, and you can change it anytime with
     * {@link #updateSwiftPassword(UpdateSwiftPasswordRequest, Consumer, Consumer) updateSwiftPassword}.
     * <p>
     * Every user has permission to create a Swift password for *their own user ID*. An administrator in your organization
     * does not need to write a policy to give users this ability. To compare, administrators who have permission to the
     * tenancy can use this operation to create a Swift password for any user, including themselves.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<CreateSwiftPasswordResponse> createSwiftPassword(
            CreateSwiftPasswordRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            CreateSwiftPasswordRequest, CreateSwiftPasswordResponse>
                    handler);

    /**
     * Creates a new tag in the specified tag namespace.
     * <p>
     * You must specify either the OCID or the name of the tag namespace that will contain this tag definition.
     * <p>
     * You must also specify a *name* for the tag, which must be unique across all tags in the tag namespace
     * and cannot be changed. The name can contain any ASCII character except the space (_) or period (.) characters.
     * Names are case insensitive. That means, for example, \"myTag\" and \"mytag\" are not allowed in the same namespace.
     * If you specify a name that's already in use in the tag namespace, a 409 error is returned.
     * <p>
     * You must also specify a *description* for the tag.
     * It does not have to be unique, and you can change it with
     * {@link #updateTag(UpdateTagRequest, Consumer, Consumer) updateTag}.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<CreateTagResponse> createTag(
            CreateTagRequest request,
            com.oracle.bmc.responses.AsyncHandler<CreateTagRequest, CreateTagResponse> handler);

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
     * {@link #updateTagNamespace(UpdateTagNamespaceRequest, Consumer, Consumer) updateTagNamespace}.
     * <p>
     * Tag namespaces cannot be deleted, but they can be retired.
     * See [Retiring Key Definitions and Namespace Definitions](https://docs.us-phoenix-1.oraclecloud.com/Content/Identity/Concepts/taggingoverview.htm#Retiring) for more information.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<CreateTagNamespaceResponse> createTagNamespace(
            CreateTagNamespaceRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            CreateTagNamespaceRequest, CreateTagNamespaceResponse>
                    handler);

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
     * {@link #updateUser(UpdateUserRequest, Consumer, Consumer) updateUser}. You can use the field to provide the user's
     * full name, a description, a nickname, or other information to generally identify the user.
     * <p>
     * After you send your request, the new object's `lifecycleState` will temporarily be CREATING. Before
     * using the object, first make sure its `lifecycleState` has changed to ACTIVE.
     * <p>
     * A new user has no permissions until you place the user in one or more groups (see
     * {@link #addUserToGroup(AddUserToGroupRequest, Consumer, Consumer) addUserToGroup}). If the user needs to
     * access the Console, you need to provide the user a password (see
     * {@link #createOrResetUIPassword(CreateOrResetUIPasswordRequest, Consumer, Consumer) createOrResetUIPassword}).
     * If the user needs to access the Oracle Cloud Infrastructure REST API, you need to upload a
     * public API signing key for that user (see
     * [Required Keys and OCIDs](https://docs.us-phoenix-1.oraclecloud.com/Content/API/Concepts/apisigningkey.htm) and also
     * {@link #uploadApiKey(UploadApiKeyRequest, Consumer, Consumer) uploadApiKey}).
     * <p>
     **Important:** Make sure to inform the new user which compartment(s) they have access to.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<CreateUserResponse> createUser(
            CreateUserRequest request,
            com.oracle.bmc.responses.AsyncHandler<CreateUserRequest, CreateUserResponse> handler);

    /**
     * Deletes the specified API signing key for the specified user.
     * <p>
     * Every user has permission to use this operation to delete a key for *their own user ID*. An
     * administrator in your organization does not need to write a policy to give users this ability.
     * To compare, administrators who have permission to the tenancy can use this operation to delete
     * a key for any user, including themselves.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<DeleteApiKeyResponse> deleteApiKey(
            DeleteApiKeyRequest request,
            com.oracle.bmc.responses.AsyncHandler<DeleteApiKeyRequest, DeleteApiKeyResponse>
                    handler);

    /**
     * Deletes the specified auth token for the specified user.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<DeleteAuthTokenResponse> deleteAuthToken(
            DeleteAuthTokenRequest request,
            com.oracle.bmc.responses.AsyncHandler<DeleteAuthTokenRequest, DeleteAuthTokenResponse>
                    handler);

    /**
     * Deletes the specified compartment. The compartment must be empty.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<DeleteCompartmentResponse> deleteCompartment(
            DeleteCompartmentRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            DeleteCompartmentRequest, DeleteCompartmentResponse>
                    handler);

    /**
     * Deletes the specified secret key for the specified user.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<DeleteCustomerSecretKeyResponse> deleteCustomerSecretKey(
            DeleteCustomerSecretKeyRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            DeleteCustomerSecretKeyRequest, DeleteCustomerSecretKeyResponse>
                    handler);

    /**
     * Deletes the specified dynamic group.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<DeleteDynamicGroupResponse> deleteDynamicGroup(
            DeleteDynamicGroupRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            DeleteDynamicGroupRequest, DeleteDynamicGroupResponse>
                    handler);

    /**
     * Deletes the specified group. The group must be empty.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<DeleteGroupResponse> deleteGroup(
            DeleteGroupRequest request,
            com.oracle.bmc.responses.AsyncHandler<DeleteGroupRequest, DeleteGroupResponse> handler);

    /**
     * Deletes the specified identity provider. The identity provider must not have
     * any group mappings (see {@link IdpGroupMapping}).
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<DeleteIdentityProviderResponse> deleteIdentityProvider(
            DeleteIdentityProviderRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            DeleteIdentityProviderRequest, DeleteIdentityProviderResponse>
                    handler);

    /**
     * Deletes the specified group mapping.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<DeleteIdpGroupMappingResponse> deleteIdpGroupMapping(
            DeleteIdpGroupMappingRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            DeleteIdpGroupMappingRequest, DeleteIdpGroupMappingResponse>
                    handler);

    /**
     * Delete the specified MFA TOTP device for the specified user.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<DeleteMfaTotpDeviceResponse> deleteMfaTotpDevice(
            DeleteMfaTotpDeviceRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            DeleteMfaTotpDeviceRequest, DeleteMfaTotpDeviceResponse>
                    handler);

    /**
     * Deletes the specified policy. The deletion takes effect typically within 10 seconds.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<DeletePolicyResponse> deletePolicy(
            DeletePolicyRequest request,
            com.oracle.bmc.responses.AsyncHandler<DeletePolicyRequest, DeletePolicyResponse>
                    handler);

    /**
     * Deletes the specified SMTP credential for the specified user.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<DeleteSmtpCredentialResponse> deleteSmtpCredential(
            DeleteSmtpCredentialRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            DeleteSmtpCredentialRequest, DeleteSmtpCredentialResponse>
                    handler);

    /**
     * **Deprecated. Use {@link #deleteAuthToken(DeleteAuthTokenRequest, Consumer, Consumer) deleteAuthToken} instead.**
     * <p>
     * Deletes the specified Swift password for the specified user.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<DeleteSwiftPasswordResponse> deleteSwiftPassword(
            DeleteSwiftPasswordRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            DeleteSwiftPasswordRequest, DeleteSwiftPasswordResponse>
                    handler);

    /**
     * Deletes the specified user. The user must not be in any groups.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<DeleteUserResponse> deleteUser(
            DeleteUserRequest request,
            com.oracle.bmc.responses.AsyncHandler<DeleteUserRequest, DeleteUserResponse> handler);

    /**
     * Generate seed for the MFA TOTP device
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<GenerateTotpSeedResponse> generateTotpSeed(
            GenerateTotpSeedRequest request,
            com.oracle.bmc.responses.AsyncHandler<GenerateTotpSeedRequest, GenerateTotpSeedResponse>
                    handler);

    /**
     * Gets the specified compartment's information.
     * <p>
     * This operation does not return a list of all the resources inside the compartment. There is no single
     * API operation that does that. Compartments can contain multiple types of resources (instances, block
     * storage volumes, etc.). To find out what's in a compartment, you must call the \"List\" operation for
     * each resource type and specify the compartment's OCID as a query parameter in the request. For example,
     * call the {@link #listInstances(ListInstancesRequest, Consumer, Consumer) listInstances} operation in the Cloud Compute
     * Service or the {@link #listVolumes(ListVolumesRequest, Consumer, Consumer) listVolumes} operation in Cloud Block Storage.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<GetCompartmentResponse> getCompartment(
            GetCompartmentRequest request,
            com.oracle.bmc.responses.AsyncHandler<GetCompartmentRequest, GetCompartmentResponse>
                    handler);

    /**
     * Gets the specified dynamic group's information.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<GetDynamicGroupResponse> getDynamicGroup(
            GetDynamicGroupRequest request,
            com.oracle.bmc.responses.AsyncHandler<GetDynamicGroupRequest, GetDynamicGroupResponse>
                    handler);

    /**
     * Gets the specified group's information.
     * <p>
     * This operation does not return a list of all the users in the group. To do that, use
     * {@link #listUserGroupMemberships(ListUserGroupMembershipsRequest, Consumer, Consumer) listUserGroupMemberships} and
     * provide the group's OCID as a query parameter in the request.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<GetGroupResponse> getGroup(
            GetGroupRequest request,
            com.oracle.bmc.responses.AsyncHandler<GetGroupRequest, GetGroupResponse> handler);

    /**
     * Gets the specified identity provider's information.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<GetIdentityProviderResponse> getIdentityProvider(
            GetIdentityProviderRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            GetIdentityProviderRequest, GetIdentityProviderResponse>
                    handler);

    /**
     * Gets the specified group mapping.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<GetIdpGroupMappingResponse> getIdpGroupMapping(
            GetIdpGroupMappingRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            GetIdpGroupMappingRequest, GetIdpGroupMappingResponse>
                    handler);

    /**
     * Get the specified MFA TOTP device for the specified user.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<GetMfaTotpDeviceResponse> getMfaTotpDevice(
            GetMfaTotpDeviceRequest request,
            com.oracle.bmc.responses.AsyncHandler<GetMfaTotpDeviceRequest, GetMfaTotpDeviceResponse>
                    handler);

    /**
     * Gets the specified policy's information.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<GetPolicyResponse> getPolicy(
            GetPolicyRequest request,
            com.oracle.bmc.responses.AsyncHandler<GetPolicyRequest, GetPolicyResponse> handler);

    /**
     * Gets the specified tag's information.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<GetTagResponse> getTag(
            GetTagRequest request,
            com.oracle.bmc.responses.AsyncHandler<GetTagRequest, GetTagResponse> handler);

    /**
     * Gets the specified tag namespace's information.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<GetTagNamespaceResponse> getTagNamespace(
            GetTagNamespaceRequest request,
            com.oracle.bmc.responses.AsyncHandler<GetTagNamespaceRequest, GetTagNamespaceResponse>
                    handler);

    /**
     * Get the specified tenancy's information.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<GetTenancyResponse> getTenancy(
            GetTenancyRequest request,
            com.oracle.bmc.responses.AsyncHandler<GetTenancyRequest, GetTenancyResponse> handler);

    /**
     * Gets the specified user's information.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<GetUserResponse> getUser(
            GetUserRequest request,
            com.oracle.bmc.responses.AsyncHandler<GetUserRequest, GetUserResponse> handler);

    /**
     * Gets the specified UserGroupMembership's information.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<GetUserGroupMembershipResponse> getUserGroupMembership(
            GetUserGroupMembershipRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            GetUserGroupMembershipRequest, GetUserGroupMembershipResponse>
                    handler);

    /**
     * Gets details on a specified work request. The workRequestID is returned in the opc-workrequest-id header
     * for any asynchronous operation in the Identity and Access Management service.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<GetWorkRequestResponse> getWorkRequest(
            GetWorkRequestRequest request,
            com.oracle.bmc.responses.AsyncHandler<GetWorkRequestRequest, GetWorkRequestResponse>
                    handler);

    /**
     * Lists the API signing keys for the specified user. A user can have a maximum of three keys.
     * <p>
     * Every user has permission to use this API call for *their own user ID*.  An administrator in your
     * organization does not need to write a policy to give users this ability.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<ListApiKeysResponse> listApiKeys(
            ListApiKeysRequest request,
            com.oracle.bmc.responses.AsyncHandler<ListApiKeysRequest, ListApiKeysResponse> handler);

    /**
     * Lists the auth tokens for the specified user. The returned object contains the token's OCID, but not
     * the token itself. The actual token is returned only upon creation.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<ListAuthTokensResponse> listAuthTokens(
            ListAuthTokensRequest request,
            com.oracle.bmc.responses.AsyncHandler<ListAuthTokensRequest, ListAuthTokensResponse>
                    handler);

    /**
     * Lists the availability domains in your tenancy. Specify the OCID of either the tenancy or another
     * of your compartments as the value for the compartment ID (remember that the tenancy is simply the root compartment).
     * See [Where to Get the Tenancy's OCID and User's OCID](https://docs.us-phoenix-1.oraclecloud.com/Content/API/Concepts/apisigningkey.htm#five).
     * Note that the order of the results returned can change if availability domains are added or removed; therefore, do not
     * create a dependency on the list order.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<ListAvailabilityDomainsResponse> listAvailabilityDomains(
            ListAvailabilityDomainsRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            ListAvailabilityDomainsRequest, ListAvailabilityDomainsResponse>
                    handler);

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
     * See [Where to Get the Tenancy's OCID and User's OCID](https://docs.us-phoenix-1.oraclecloud.com/Content/API/Concepts/apisigningkey.htm#five).
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<ListCompartmentsResponse> listCompartments(
            ListCompartmentsRequest request,
            com.oracle.bmc.responses.AsyncHandler<ListCompartmentsRequest, ListCompartmentsResponse>
                    handler);

    /**
     * Lists all the tags enabled for cost-tracking in the specified tenancy. For information about
     * cost-tracking tags, see [Using Cost-tracking Tags](https://docs.us-phoenix-1.oraclecloud.com/Content/Identity/Concepts/taggingoverview.htm#costs).
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<ListCostTrackingTagsResponse> listCostTrackingTags(
            ListCostTrackingTagsRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            ListCostTrackingTagsRequest, ListCostTrackingTagsResponse>
                    handler);

    /**
     * Lists the secret keys for the specified user. The returned object contains the secret key's OCID, but not
     * the secret key itself. The actual secret key is returned only upon creation.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<ListCustomerSecretKeysResponse> listCustomerSecretKeys(
            ListCustomerSecretKeysRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            ListCustomerSecretKeysRequest, ListCustomerSecretKeysResponse>
                    handler);

    /**
     * Lists the dynamic groups in your tenancy. You must specify your tenancy's OCID as the value for
     * the compartment ID (remember that the tenancy is simply the root compartment).
     * See [Where to Get the Tenancy's OCID and User's OCID](https://docs.us-phoenix-1.oraclecloud.com/Content/API/Concepts/apisigningkey.htm#five).
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<ListDynamicGroupsResponse> listDynamicGroups(
            ListDynamicGroupsRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            ListDynamicGroupsRequest, ListDynamicGroupsResponse>
                    handler);

    /**
     * Lists the Fault Domains in your tenancy. Specify the OCID of either the tenancy or another
     * of your compartments as the value for the compartment ID (remember that the tenancy is simply the root compartment).
     * See [Where to Get the Tenancy's OCID and User's OCID](https://docs.us-phoenix-1.oraclecloud.com/Content/API/Concepts/apisigningkey.htm#five).
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<ListFaultDomainsResponse> listFaultDomains(
            ListFaultDomainsRequest request,
            com.oracle.bmc.responses.AsyncHandler<ListFaultDomainsRequest, ListFaultDomainsResponse>
                    handler);

    /**
     * Lists the groups in your tenancy. You must specify your tenancy's OCID as the value for
     * the compartment ID (remember that the tenancy is simply the root compartment).
     * See [Where to Get the Tenancy's OCID and User's OCID](https://docs.us-phoenix-1.oraclecloud.com/Content/API/Concepts/apisigningkey.htm#five).
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<ListGroupsResponse> listGroups(
            ListGroupsRequest request,
            com.oracle.bmc.responses.AsyncHandler<ListGroupsRequest, ListGroupsResponse> handler);

    /**
     * Lists the identity provider groups.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<ListIdentityProviderGroupsResponse> listIdentityProviderGroups(
            ListIdentityProviderGroupsRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            ListIdentityProviderGroupsRequest, ListIdentityProviderGroupsResponse>
                    handler);

    /**
     * Lists all the identity providers in your tenancy. You must specify the identity provider type (e.g., `SAML2` for
     * identity providers using the SAML2.0 protocol). You must specify your tenancy's OCID as the value for the
     * compartment ID (remember that the tenancy is simply the root compartment).
     * See [Where to Get the Tenancy's OCID and User's OCID](https://docs.us-phoenix-1.oraclecloud.com/Content/API/Concepts/apisigningkey.htm#five).
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<ListIdentityProvidersResponse> listIdentityProviders(
            ListIdentityProvidersRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            ListIdentityProvidersRequest, ListIdentityProvidersResponse>
                    handler);

    /**
     * Lists the group mappings for the specified identity provider.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<ListIdpGroupMappingsResponse> listIdpGroupMappings(
            ListIdpGroupMappingsRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            ListIdpGroupMappingsRequest, ListIdpGroupMappingsResponse>
                    handler);

    /**
     * Lists the MFA TOTP devices for the specified user. The returned object contains the device's OCID, but not
     * the seed. The seed is returned only upon creation or when we regenerate MFA seed for the device.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<ListMfaTotpDevicesResponse> listMfaTotpDevices(
            ListMfaTotpDevicesRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            ListMfaTotpDevicesRequest, ListMfaTotpDevicesResponse>
                    handler);

    /**
     * Lists the policies in the specified compartment (either the tenancy or another of your compartments).
     * See [Where to Get the Tenancy's OCID and User's OCID](https://docs.us-phoenix-1.oraclecloud.com/Content/API/Concepts/apisigningkey.htm#five).
     * <p>
     * To determine which policies apply to a particular group or compartment, you must view the individual
     * statements inside all your policies. There isn't a way to automatically obtain that information via the API.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
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
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
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
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<ListRegionsResponse> listRegions(
            ListRegionsRequest request,
            com.oracle.bmc.responses.AsyncHandler<ListRegionsRequest, ListRegionsResponse> handler);

    /**
     * Lists the SMTP credentials for the specified user. The returned object contains the credential's OCID,
     * the SMTP user name but not the SMTP password. The SMTP password is returned only upon creation.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<ListSmtpCredentialsResponse> listSmtpCredentials(
            ListSmtpCredentialsRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            ListSmtpCredentialsRequest, ListSmtpCredentialsResponse>
                    handler);

    /**
     * **Deprecated. Use {@link #listAuthTokens(ListAuthTokensRequest, Consumer, Consumer) listAuthTokens} instead.**
     * <p>
     * Lists the Swift passwords for the specified user. The returned object contains the password's OCID, but not
     * the password itself. The actual password is returned only upon creation.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<ListSwiftPasswordsResponse> listSwiftPasswords(
            ListSwiftPasswordsRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            ListSwiftPasswordsRequest, ListSwiftPasswordsResponse>
                    handler);

    /**
     * Lists the tag namespaces in the specified compartment.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<ListTagNamespacesResponse> listTagNamespaces(
            ListTagNamespacesRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            ListTagNamespacesRequest, ListTagNamespacesResponse>
                    handler);

    /**
     * Lists the tag definitions in the specified tag namespace.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<ListTagsResponse> listTags(
            ListTagsRequest request,
            com.oracle.bmc.responses.AsyncHandler<ListTagsRequest, ListTagsResponse> handler);

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
     * - Although`userId` and `groupId` are not indvidually required, you must set one of them.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<ListUserGroupMembershipsResponse> listUserGroupMemberships(
            ListUserGroupMembershipsRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            ListUserGroupMembershipsRequest, ListUserGroupMembershipsResponse>
                    handler);

    /**
     * Lists the users in your tenancy. You must specify your tenancy's OCID as the value for the
     * compartment ID (remember that the tenancy is simply the root compartment).
     * See [Where to Get the Tenancy's OCID and User's OCID](https://docs.us-phoenix-1.oraclecloud.com/Content/API/Concepts/apisigningkey.htm#five).
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<ListUsersResponse> listUsers(
            ListUsersRequest request,
            com.oracle.bmc.responses.AsyncHandler<ListUsersRequest, ListUsersResponse> handler);

    /**
     * Lists the work requests in compartment.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<ListWorkRequestsResponse> listWorkRequests(
            ListWorkRequestsRequest request,
            com.oracle.bmc.responses.AsyncHandler<ListWorkRequestsRequest, ListWorkRequestsResponse>
                    handler);

    /**
     * Removes a user from a group by deleting the corresponding `UserGroupMembership`.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<RemoveUserFromGroupResponse> removeUserFromGroup(
            RemoveUserFromGroupRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            RemoveUserFromGroupRequest, RemoveUserFromGroupResponse>
                    handler);

    /**
     * Resets the OAuth2 client credentials for the SCIM client associated with this identity provider.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<ResetIdpScimClientResponse> resetIdpScimClient(
            ResetIdpScimClientRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            ResetIdpScimClientRequest, ResetIdpScimClientResponse>
                    handler);

    /**
     * Updates the specified auth token's description.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<UpdateAuthTokenResponse> updateAuthToken(
            UpdateAuthTokenRequest request,
            com.oracle.bmc.responses.AsyncHandler<UpdateAuthTokenRequest, UpdateAuthTokenResponse>
                    handler);

    /**
     * Updates the specified compartment's description or name. You can't update the root compartment.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<UpdateCompartmentResponse> updateCompartment(
            UpdateCompartmentRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            UpdateCompartmentRequest, UpdateCompartmentResponse>
                    handler);

    /**
     * Updates the specified secret key's description.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<UpdateCustomerSecretKeyResponse> updateCustomerSecretKey(
            UpdateCustomerSecretKeyRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            UpdateCustomerSecretKeyRequest, UpdateCustomerSecretKeyResponse>
                    handler);

    /**
     * Updates the specified dynamic group.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
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
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<UpdateGroupResponse> updateGroup(
            UpdateGroupRequest request,
            com.oracle.bmc.responses.AsyncHandler<UpdateGroupRequest, UpdateGroupResponse> handler);

    /**
     * Updates the specified identity provider.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<UpdateIdentityProviderResponse> updateIdentityProvider(
            UpdateIdentityProviderRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            UpdateIdentityProviderRequest, UpdateIdentityProviderResponse>
                    handler);

    /**
     * Updates the specified group mapping.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<UpdateIdpGroupMappingResponse> updateIdpGroupMapping(
            UpdateIdpGroupMappingRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            UpdateIdpGroupMappingRequest, UpdateIdpGroupMappingResponse>
                    handler);

    /**
     * Updates the specified policy. You can update the description or the policy statements themselves.
     * <p>
     * Policy changes take effect typically within 10 seconds.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<UpdatePolicyResponse> updatePolicy(
            UpdatePolicyRequest request,
            com.oracle.bmc.responses.AsyncHandler<UpdatePolicyRequest, UpdatePolicyResponse>
                    handler);

    /**
     * Updates the specified SMTP credential's description.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<UpdateSmtpCredentialResponse> updateSmtpCredential(
            UpdateSmtpCredentialRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            UpdateSmtpCredentialRequest, UpdateSmtpCredentialResponse>
                    handler);

    /**
     * **Deprecated. Use {@link #updateAuthToken(UpdateAuthTokenRequest, Consumer, Consumer) updateAuthToken} instead.**
     * <p>
     * Updates the specified Swift password's description.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<UpdateSwiftPasswordResponse> updateSwiftPassword(
            UpdateSwiftPasswordRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            UpdateSwiftPasswordRequest, UpdateSwiftPasswordResponse>
                    handler);

    /**
     * Updates the the specified tag definition. You can update `description`, and `isRetired`.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<UpdateTagResponse> updateTag(
            UpdateTagRequest request,
            com.oracle.bmc.responses.AsyncHandler<UpdateTagRequest, UpdateTagResponse> handler);

    /**
     * Updates the the specified tag namespace. You can't update the namespace name.
     * <p>
     * Updating `isRetired` to 'true' retires the namespace and all the tag definitions in the namespace. Reactivating a
     * namespace (changing `isRetired` from 'true' to 'false') does not reactivate tag definitions.
     * To reactivate the tag definitions, you must reactivate each one indvidually *after* you reactivate the namespace,
     * using {@link #updateTag(UpdateTagRequest, Consumer, Consumer) updateTag}. For more information about retiring tag namespaces, see
     * [Retiring Key Definitions and Namespace Definitions](https://docs.us-phoenix-1.oraclecloud.com/Content/Identity/Concepts/taggingoverview.htm#Retiring).
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
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<UpdateUserResponse> updateUser(
            UpdateUserRequest request,
            com.oracle.bmc.responses.AsyncHandler<UpdateUserRequest, UpdateUserResponse> handler);

    /**
     * Updates the capabilities of the specified user.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<UpdateUserCapabilitiesResponse> updateUserCapabilities(
            UpdateUserCapabilitiesRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            UpdateUserCapabilitiesRequest, UpdateUserCapabilitiesResponse>
                    handler);

    /**
     * Updates the state of the specified user.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<UpdateUserStateResponse> updateUserState(
            UpdateUserStateRequest request,
            com.oracle.bmc.responses.AsyncHandler<UpdateUserStateRequest, UpdateUserStateResponse>
                    handler);

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
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<UploadApiKeyResponse> uploadApiKey(
            UploadApiKeyRequest request,
            com.oracle.bmc.responses.AsyncHandler<UploadApiKeyRequest, UploadApiKeyResponse>
                    handler);
}

/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.identity;

import com.oracle.bmc.util.internal.Validate;
import com.oracle.bmc.identity.requests.*;
import com.oracle.bmc.identity.responses.*;

import java.util.Objects;

/**
 * Async client implementation for Identity service. <br>
 * There are two ways to use async client: 1. Use AsyncHandler: using AsyncHandler, if the response
 * to the call is an {@link java.io.InputStream}, like getObject Api in object storage service,
 * developers need to process the stream in AsyncHandler, and not anywhere else, because the stream
 * will be closed right after the AsyncHandler is invoked. <br>
 * 2. Use Java Future: using Java Future, developers need to close the stream after they are done
 * with the Java Future.<br>
 * Accessing the result should be done in a mutually exclusive manner, either through the Future or
 * the AsyncHandler, but not both. If the Future is used, the caller should pass in null as the
 * AsyncHandler. If the AsyncHandler is used, it is still safe to use the Future to determine
 * whether or not the request was completed via Future.isDone/isCancelled.<br>
 * Please refer to
 * https://github.com/oracle/oci-java-sdk/blob/master/bmc-examples/src/main/java/ResteasyClientWithObjectStorageExample.java
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
public class IdentityAsyncClient extends com.oracle.bmc.http.internal.BaseAsyncClient
        implements IdentityAsync {
    /** Service instance for Identity. */
    public static final com.oracle.bmc.Service SERVICE =
            com.oracle.bmc.Services.serviceBuilder()
                    .serviceName("IDENTITY")
                    .serviceEndpointPrefix("identity")
                    .serviceEndpointTemplate("https://identity.{region}.oci.{secondLevelDomain}")
                    .build();

    private static final org.slf4j.Logger LOG =
            org.slf4j.LoggerFactory.getLogger(IdentityAsyncClient.class);

    IdentityAsyncClient(
            com.oracle.bmc.common.ClientBuilderBase<?, ?> builder,
            com.oracle.bmc.auth.AbstractAuthenticationDetailsProvider
                    authenticationDetailsProvider) {
        super(builder, authenticationDetailsProvider);
    }

    /**
     * Create a builder for this client.
     *
     * @return builder
     */
    public static Builder builder() {
        return new Builder(SERVICE);
    }

    /**
     * Builder class for this client. The "authenticationDetailsProvider" is required and must be
     * passed to the {@link #build(AbstractAuthenticationDetailsProvider)} method.
     */
    public static class Builder
            extends com.oracle.bmc.common.RegionalClientBuilder<Builder, IdentityAsyncClient> {
        private Builder(com.oracle.bmc.Service service) {
            super(service);
            final String packageName = "identity";
            com.oracle.bmc.internal.Alloy.throwDisabledServiceExceptionIfAppropriate(packageName);
            requestSignerFactory =
                    new com.oracle.bmc.http.signing.internal.DefaultRequestSignerFactory(
                            com.oracle.bmc.http.signing.SigningStrategy.STANDARD);
        }

        /**
         * Build the client.
         *
         * @param authenticationDetailsProvider authentication details provider
         * @return the client
         */
        public IdentityAsyncClient build(
                @jakarta.annotation.Nonnull
                        com.oracle.bmc.auth.AbstractAuthenticationDetailsProvider
                                authenticationDetailsProvider) {
            return new IdentityAsyncClient(this, authenticationDetailsProvider);
        }
    }

    @Override
    public void setRegion(com.oracle.bmc.Region region) {
        super.setRegion(region);
    }

    @Override
    public void setRegion(String regionId) {
        super.setRegion(regionId);
    }

    @Override
    public java.util.concurrent.Future<ActivateDomainResponse> activateDomain(
            ActivateDomainRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ActivateDomainRequest, ActivateDomainResponse>
                    handler) {

        Validate.notBlank(request.getDomainId(), "domainId must not be blank");

        return clientCall(request, ActivateDomainResponse::builder)
                .logger(LOG, "activateDomain")
                .serviceDetails(
                        "Identity",
                        "ActivateDomain",
                        "https://docs.oracle.com/iaas/api/#/en/identity/20160918/Domain/ActivateDomain")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(ActivateDomainRequest::builder)
                .basePath("/20160918")
                .appendPathParam("domains")
                .appendPathParam(request.getDomainId())
                .appendPathParam("actions")
                .appendPathParam("activate")
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("if-match", request.getIfMatch())
                .handleResponseHeaderString(
                        "opc-request-id", ActivateDomainResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-work-request-id", ActivateDomainResponse.Builder::opcWorkRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ActivateMfaTotpDeviceResponse> activateMfaTotpDevice(
            ActivateMfaTotpDeviceRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ActivateMfaTotpDeviceRequest, ActivateMfaTotpDeviceResponse>
                    handler) {

        Validate.notBlank(request.getUserId(), "userId must not be blank");

        Validate.notBlank(request.getMfaTotpDeviceId(), "mfaTotpDeviceId must not be blank");
        Objects.requireNonNull(request.getMfaTotpToken(), "mfaTotpToken is required");

        return clientCall(request, ActivateMfaTotpDeviceResponse::builder)
                .logger(LOG, "activateMfaTotpDevice")
                .serviceDetails(
                        "Identity",
                        "ActivateMfaTotpDevice",
                        "https://docs.oracle.com/iaas/api/#/en/identity/20160918/MfaTotpDeviceSummary/ActivateMfaTotpDevice")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(ActivateMfaTotpDeviceRequest::builder)
                .basePath("/20160918")
                .appendPathParam("users")
                .appendPathParam(request.getUserId())
                .appendPathParam("mfaTotpDevices")
                .appendPathParam(request.getMfaTotpDeviceId())
                .appendPathParam("actions")
                .appendPathParam("activate")
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.identity.model.MfaTotpDeviceSummary.class,
                        ActivateMfaTotpDeviceResponse.Builder::mfaTotpDeviceSummary)
                .handleResponseHeaderString(
                        "opc-request-id", ActivateMfaTotpDeviceResponse.Builder::opcRequestId)
                .handleResponseHeaderString("etag", ActivateMfaTotpDeviceResponse.Builder::etag)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<AddTagDefaultLockResponse> addTagDefaultLock(
            AddTagDefaultLockRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            AddTagDefaultLockRequest, AddTagDefaultLockResponse>
                    handler) {

        Validate.notBlank(request.getTagDefaultId(), "tagDefaultId must not be blank");
        Objects.requireNonNull(request.getAddLockDetails(), "addLockDetails is required");

        return clientCall(request, AddTagDefaultLockResponse::builder)
                .logger(LOG, "addTagDefaultLock")
                .serviceDetails(
                        "Identity",
                        "AddTagDefaultLock",
                        "https://docs.oracle.com/iaas/api/#/en/identity/20160918/TagDefault/AddTagDefaultLock")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(AddTagDefaultLockRequest::builder)
                .basePath("/20160918")
                .appendPathParam("tagDefaults")
                .appendPathParam(request.getTagDefaultId())
                .appendPathParam("actions")
                .appendPathParam("addLock")
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.identity.model.TagDefault.class,
                        AddTagDefaultLockResponse.Builder::tagDefault)
                .handleResponseHeaderString(
                        "opc-request-id", AddTagDefaultLockResponse.Builder::opcRequestId)
                .handleResponseHeaderString("etag", AddTagDefaultLockResponse.Builder::etag)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<AddTagNamespaceLockResponse> addTagNamespaceLock(
            AddTagNamespaceLockRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            AddTagNamespaceLockRequest, AddTagNamespaceLockResponse>
                    handler) {

        Validate.notBlank(request.getTagNamespaceId(), "tagNamespaceId must not be blank");
        Objects.requireNonNull(request.getAddLockDetails(), "addLockDetails is required");

        return clientCall(request, AddTagNamespaceLockResponse::builder)
                .logger(LOG, "addTagNamespaceLock")
                .serviceDetails(
                        "Identity",
                        "AddTagNamespaceLock",
                        "https://docs.oracle.com/iaas/api/#/en/identity/20160918/TagNamespace/AddTagNamespaceLock")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(AddTagNamespaceLockRequest::builder)
                .basePath("/20160918")
                .appendPathParam("tagNamespaces")
                .appendPathParam(request.getTagNamespaceId())
                .appendPathParam("actions")
                .appendPathParam("addLock")
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.identity.model.TagNamespace.class,
                        AddTagNamespaceLockResponse.Builder::tagNamespace)
                .handleResponseHeaderString(
                        "opc-request-id", AddTagNamespaceLockResponse.Builder::opcRequestId)
                .handleResponseHeaderString("etag", AddTagNamespaceLockResponse.Builder::etag)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<AddUserToGroupResponse> addUserToGroup(
            AddUserToGroupRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            AddUserToGroupRequest, AddUserToGroupResponse>
                    handler) {
        Objects.requireNonNull(
                request.getAddUserToGroupDetails(), "addUserToGroupDetails is required");

        return clientCall(request, AddUserToGroupResponse::builder)
                .logger(LOG, "addUserToGroup")
                .serviceDetails(
                        "Identity",
                        "AddUserToGroup",
                        "https://docs.oracle.com/iaas/api/#/en/identity/20160918/UserGroupMembership/AddUserToGroup")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(AddUserToGroupRequest::builder)
                .basePath("/20160918")
                .appendPathParam("userGroupMemberships")
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.identity.model.UserGroupMembership.class,
                        AddUserToGroupResponse.Builder::userGroupMembership)
                .handleResponseHeaderString(
                        "opc-request-id", AddUserToGroupResponse.Builder::opcRequestId)
                .handleResponseHeaderString("etag", AddUserToGroupResponse.Builder::etag)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<AssembleEffectiveTagSetResponse> assembleEffectiveTagSet(
            AssembleEffectiveTagSetRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            AssembleEffectiveTagSetRequest, AssembleEffectiveTagSetResponse>
                    handler) {
        Objects.requireNonNull(request.getCompartmentId(), "compartmentId is required");

        return clientCall(request, AssembleEffectiveTagSetResponse::builder)
                .logger(LOG, "assembleEffectiveTagSet")
                .serviceDetails(
                        "Identity",
                        "AssembleEffectiveTagSet",
                        "https://docs.oracle.com/iaas/api/#/en/identity/20160918/TagDefault/AssembleEffectiveTagSet")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(AssembleEffectiveTagSetRequest::builder)
                .basePath("/20160918")
                .appendPathParam("tagDefaults")
                .appendPathParam("actions")
                .appendPathParam("assembleEffectiveTagSet")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendEnumQueryParam("lifecycleState", request.getLifecycleState())
                .accept("application/json")
                .handleBodyList(
                        com.oracle.bmc.identity.model.TagDefaultSummary.class,
                        AssembleEffectiveTagSetResponse.Builder::items)
                .handleResponseHeaderString(
                        "opc-request-id", AssembleEffectiveTagSetResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", AssembleEffectiveTagSetResponse.Builder::opcNextPage)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<BulkDeleteResourcesResponse> bulkDeleteResources(
            BulkDeleteResourcesRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            BulkDeleteResourcesRequest, BulkDeleteResourcesResponse>
                    handler) {

        Validate.notBlank(request.getCompartmentId(), "compartmentId must not be blank");
        Objects.requireNonNull(
                request.getBulkDeleteResourcesDetails(), "bulkDeleteResourcesDetails is required");

        return clientCall(request, BulkDeleteResourcesResponse::builder)
                .logger(LOG, "bulkDeleteResources")
                .serviceDetails(
                        "Identity",
                        "BulkDeleteResources",
                        "https://docs.oracle.com/iaas/api/#/en/identity/20160918/Compartment/BulkDeleteResources")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(BulkDeleteResourcesRequest::builder)
                .basePath("/20160918")
                .appendPathParam("compartments")
                .appendPathParam(request.getCompartmentId())
                .appendPathParam("actions")
                .appendPathParam("bulkDeleteResources")
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-request-id", BulkDeleteResourcesResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        BulkDeleteResourcesResponse.Builder::opcWorkRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<BulkDeleteTagsResponse> bulkDeleteTags(
            BulkDeleteTagsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            BulkDeleteTagsRequest, BulkDeleteTagsResponse>
                    handler) {
        Objects.requireNonNull(
                request.getBulkDeleteTagsDetails(), "bulkDeleteTagsDetails is required");

        return clientCall(request, BulkDeleteTagsResponse::builder)
                .logger(LOG, "bulkDeleteTags")
                .serviceDetails(
                        "Identity",
                        "BulkDeleteTags",
                        "https://docs.oracle.com/iaas/api/#/en/identity/20160918/Tag/BulkDeleteTags")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(BulkDeleteTagsRequest::builder)
                .basePath("/20160918")
                .appendPathParam("tags")
                .appendPathParam("actions")
                .appendPathParam("bulkDelete")
                .appendQueryParam("isLockOverride", request.getIsLockOverride())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-request-id", BulkDeleteTagsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-work-request-id", BulkDeleteTagsResponse.Builder::opcWorkRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<BulkEditTagsResponse> bulkEditTags(
            BulkEditTagsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<BulkEditTagsRequest, BulkEditTagsResponse>
                    handler) {

        return clientCall(request, BulkEditTagsResponse::builder)
                .logger(LOG, "bulkEditTags")
                .serviceDetails(
                        "Identity",
                        "BulkEditTags",
                        "https://docs.oracle.com/iaas/api/#/en/identity/20160918/Tag/BulkEditTags")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(BulkEditTagsRequest::builder)
                .basePath("/20160918")
                .appendPathParam("tags")
                .appendPathParam("actions")
                .appendPathParam("bulkEdit")
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-request-id", BulkEditTagsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-work-request-id", BulkEditTagsResponse.Builder::opcWorkRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<BulkMoveResourcesResponse> bulkMoveResources(
            BulkMoveResourcesRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            BulkMoveResourcesRequest, BulkMoveResourcesResponse>
                    handler) {

        Validate.notBlank(request.getCompartmentId(), "compartmentId must not be blank");
        Objects.requireNonNull(
                request.getBulkMoveResourcesDetails(), "bulkMoveResourcesDetails is required");

        return clientCall(request, BulkMoveResourcesResponse::builder)
                .logger(LOG, "bulkMoveResources")
                .serviceDetails(
                        "Identity",
                        "BulkMoveResources",
                        "https://docs.oracle.com/iaas/api/#/en/identity/20160918/Compartment/BulkMoveResources")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(BulkMoveResourcesRequest::builder)
                .basePath("/20160918")
                .appendPathParam("compartments")
                .appendPathParam(request.getCompartmentId())
                .appendPathParam("actions")
                .appendPathParam("bulkMoveResources")
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-request-id", BulkMoveResourcesResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-work-request-id", BulkMoveResourcesResponse.Builder::opcWorkRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<CascadeDeleteTagNamespaceResponse> cascadeDeleteTagNamespace(
            CascadeDeleteTagNamespaceRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            CascadeDeleteTagNamespaceRequest, CascadeDeleteTagNamespaceResponse>
                    handler) {

        Validate.notBlank(request.getTagNamespaceId(), "tagNamespaceId must not be blank");

        return clientCall(request, CascadeDeleteTagNamespaceResponse::builder)
                .logger(LOG, "cascadeDeleteTagNamespace")
                .serviceDetails(
                        "Identity",
                        "CascadeDeleteTagNamespace",
                        "https://docs.oracle.com/iaas/api/#/en/identity/20160918/TagNamespace/CascadeDeleteTagNamespace")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CascadeDeleteTagNamespaceRequest::builder)
                .basePath("/20160918")
                .appendPathParam("tagNamespaces")
                .appendPathParam(request.getTagNamespaceId())
                .appendPathParam("actions")
                .appendPathParam("cascadeDelete")
                .appendQueryParam("isLockOverride", request.getIsLockOverride())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .handleResponseHeaderString(
                        "opc-request-id", CascadeDeleteTagNamespaceResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        CascadeDeleteTagNamespaceResponse.Builder::opcWorkRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ChangeDomainCompartmentResponse> changeDomainCompartment(
            ChangeDomainCompartmentRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ChangeDomainCompartmentRequest, ChangeDomainCompartmentResponse>
                    handler) {

        Validate.notBlank(request.getDomainId(), "domainId must not be blank");
        Objects.requireNonNull(
                request.getChangeDomainCompartmentDetails(),
                "changeDomainCompartmentDetails is required");

        return clientCall(request, ChangeDomainCompartmentResponse::builder)
                .logger(LOG, "changeDomainCompartment")
                .serviceDetails(
                        "Identity",
                        "ChangeDomainCompartment",
                        "https://docs.oracle.com/iaas/api/#/en/identity/20160918/Domain/ChangeDomainCompartment")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(ChangeDomainCompartmentRequest::builder)
                .basePath("/20160918")
                .appendPathParam("domains")
                .appendPathParam(request.getDomainId())
                .appendPathParam("actions")
                .appendPathParam("changeCompartment")
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("if-match", request.getIfMatch())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-request-id", ChangeDomainCompartmentResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        ChangeDomainCompartmentResponse.Builder::opcWorkRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ChangeDomainLicenseTypeResponse> changeDomainLicenseType(
            ChangeDomainLicenseTypeRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ChangeDomainLicenseTypeRequest, ChangeDomainLicenseTypeResponse>
                    handler) {

        Validate.notBlank(request.getDomainId(), "domainId must not be blank");
        Objects.requireNonNull(
                request.getChangeDomainLicenseTypeDetails(),
                "changeDomainLicenseTypeDetails is required");

        return clientCall(request, ChangeDomainLicenseTypeResponse::builder)
                .logger(LOG, "changeDomainLicenseType")
                .serviceDetails(
                        "Identity",
                        "ChangeDomainLicenseType",
                        "https://docs.oracle.com/iaas/api/#/en/identity/20160918/Domain/ChangeDomainLicenseType")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(ChangeDomainLicenseTypeRequest::builder)
                .basePath("/20160918")
                .appendPathParam("domains")
                .appendPathParam(request.getDomainId())
                .appendPathParam("actions")
                .appendPathParam("changeLicenseType")
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("if-match", request.getIfMatch())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-request-id", ChangeDomainLicenseTypeResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        ChangeDomainLicenseTypeResponse.Builder::opcWorkRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ChangeTagNamespaceCompartmentResponse>
            changeTagNamespaceCompartment(
                    ChangeTagNamespaceCompartmentRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ChangeTagNamespaceCompartmentRequest,
                                    ChangeTagNamespaceCompartmentResponse>
                            handler) {

        Validate.notBlank(request.getTagNamespaceId(), "tagNamespaceId must not be blank");
        Objects.requireNonNull(
                request.getChangeTagNamespaceCompartmentDetail(),
                "changeTagNamespaceCompartmentDetail is required");

        return clientCall(request, ChangeTagNamespaceCompartmentResponse::builder)
                .logger(LOG, "changeTagNamespaceCompartment")
                .serviceDetails(
                        "Identity",
                        "ChangeTagNamespaceCompartment",
                        "https://docs.oracle.com/iaas/api/#/en/identity/20160918/TagNamespace/ChangeTagNamespaceCompartment")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(ChangeTagNamespaceCompartmentRequest::builder)
                .basePath("/20160918")
                .appendPathParam("tagNamespaces")
                .appendPathParam(request.getTagNamespaceId())
                .appendPathParam("actions")
                .appendPathParam("changeCompartment")
                .appendQueryParam("isLockOverride", request.getIsLockOverride())
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-request-id",
                        ChangeTagNamespaceCompartmentResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<CreateAuthTokenResponse> createAuthToken(
            CreateAuthTokenRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            CreateAuthTokenRequest, CreateAuthTokenResponse>
                    handler) {
        Objects.requireNonNull(
                request.getCreateAuthTokenDetails(), "createAuthTokenDetails is required");

        Validate.notBlank(request.getUserId(), "userId must not be blank");

        return clientCall(request, CreateAuthTokenResponse::builder)
                .logger(LOG, "createAuthToken")
                .serviceDetails(
                        "Identity",
                        "CreateAuthToken",
                        "https://docs.oracle.com/iaas/api/#/en/identity/20160918/AuthToken/CreateAuthToken")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CreateAuthTokenRequest::builder)
                .basePath("/20160918")
                .appendPathParam("users")
                .appendPathParam(request.getUserId())
                .appendPathParam("authTokens")
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.identity.model.AuthToken.class,
                        CreateAuthTokenResponse.Builder::authToken)
                .handleResponseHeaderString(
                        "opc-request-id", CreateAuthTokenResponse.Builder::opcRequestId)
                .handleResponseHeaderString("etag", CreateAuthTokenResponse.Builder::etag)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<CreateCompartmentResponse> createCompartment(
            CreateCompartmentRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            CreateCompartmentRequest, CreateCompartmentResponse>
                    handler) {
        Objects.requireNonNull(
                request.getCreateCompartmentDetails(), "createCompartmentDetails is required");

        return clientCall(request, CreateCompartmentResponse::builder)
                .logger(LOG, "createCompartment")
                .serviceDetails(
                        "Identity",
                        "CreateCompartment",
                        "https://docs.oracle.com/iaas/api/#/en/identity/20160918/Compartment/CreateCompartment")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CreateCompartmentRequest::builder)
                .basePath("/20160918")
                .appendPathParam("compartments")
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.identity.model.Compartment.class,
                        CreateCompartmentResponse.Builder::compartment)
                .handleResponseHeaderString(
                        "opc-request-id", CreateCompartmentResponse.Builder::opcRequestId)
                .handleResponseHeaderString("etag", CreateCompartmentResponse.Builder::etag)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<CreateCustomerSecretKeyResponse> createCustomerSecretKey(
            CreateCustomerSecretKeyRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            CreateCustomerSecretKeyRequest, CreateCustomerSecretKeyResponse>
                    handler) {
        Objects.requireNonNull(
                request.getCreateCustomerSecretKeyDetails(),
                "createCustomerSecretKeyDetails is required");

        Validate.notBlank(request.getUserId(), "userId must not be blank");

        return clientCall(request, CreateCustomerSecretKeyResponse::builder)
                .logger(LOG, "createCustomerSecretKey")
                .serviceDetails(
                        "Identity",
                        "CreateCustomerSecretKey",
                        "https://docs.oracle.com/iaas/api/#/en/identity/20160918/CustomerSecretKey/CreateCustomerSecretKey")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CreateCustomerSecretKeyRequest::builder)
                .basePath("/20160918")
                .appendPathParam("users")
                .appendPathParam(request.getUserId())
                .appendPathParam("customerSecretKeys")
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.identity.model.CustomerSecretKey.class,
                        CreateCustomerSecretKeyResponse.Builder::customerSecretKey)
                .handleResponseHeaderString(
                        "opc-request-id", CreateCustomerSecretKeyResponse.Builder::opcRequestId)
                .handleResponseHeaderString("etag", CreateCustomerSecretKeyResponse.Builder::etag)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<CreateDbCredentialResponse> createDbCredential(
            CreateDbCredentialRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            CreateDbCredentialRequest, CreateDbCredentialResponse>
                    handler) {
        Objects.requireNonNull(
                request.getCreateDbCredentialDetails(), "createDbCredentialDetails is required");

        Validate.notBlank(request.getUserId(), "userId must not be blank");

        return clientCall(request, CreateDbCredentialResponse::builder)
                .logger(LOG, "createDbCredential")
                .serviceDetails(
                        "Identity",
                        "CreateDbCredential",
                        "https://docs.oracle.com/iaas/api/#/en/identity/20160918/User/CreateDbCredential")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CreateDbCredentialRequest::builder)
                .basePath("/20160918")
                .appendPathParam("users")
                .appendPathParam(request.getUserId())
                .appendPathParam("dbCredentials")
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.identity.model.DbCredential.class,
                        CreateDbCredentialResponse.Builder::dbCredential)
                .handleResponseHeaderString(
                        "opc-request-id", CreateDbCredentialResponse.Builder::opcRequestId)
                .handleResponseHeaderString("etag", CreateDbCredentialResponse.Builder::etag)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<CreateDomainResponse> createDomain(
            CreateDomainRequest request,
            final com.oracle.bmc.responses.AsyncHandler<CreateDomainRequest, CreateDomainResponse>
                    handler) {
        Objects.requireNonNull(request.getCreateDomainDetails(), "createDomainDetails is required");

        return clientCall(request, CreateDomainResponse::builder)
                .logger(LOG, "createDomain")
                .serviceDetails(
                        "Identity",
                        "CreateDomain",
                        "https://docs.oracle.com/iaas/api/#/en/identity/20160918/Domain/CreateDomain")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CreateDomainRequest::builder)
                .basePath("/20160918")
                .appendPathParam("domains")
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-request-id", CreateDomainResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-work-request-id", CreateDomainResponse.Builder::opcWorkRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<CreateDynamicGroupResponse> createDynamicGroup(
            CreateDynamicGroupRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            CreateDynamicGroupRequest, CreateDynamicGroupResponse>
                    handler) {
        Objects.requireNonNull(
                request.getCreateDynamicGroupDetails(), "createDynamicGroupDetails is required");

        return clientCall(request, CreateDynamicGroupResponse::builder)
                .logger(LOG, "createDynamicGroup")
                .serviceDetails(
                        "Identity",
                        "CreateDynamicGroup",
                        "https://docs.oracle.com/iaas/api/#/en/identity/20160918/DynamicGroup/CreateDynamicGroup")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CreateDynamicGroupRequest::builder)
                .basePath("/20160918")
                .appendPathParam("dynamicGroups")
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.identity.model.DynamicGroup.class,
                        CreateDynamicGroupResponse.Builder::dynamicGroup)
                .handleResponseHeaderString(
                        "opc-request-id", CreateDynamicGroupResponse.Builder::opcRequestId)
                .handleResponseHeaderString("etag", CreateDynamicGroupResponse.Builder::etag)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<CreateGroupResponse> createGroup(
            CreateGroupRequest request,
            final com.oracle.bmc.responses.AsyncHandler<CreateGroupRequest, CreateGroupResponse>
                    handler) {
        Objects.requireNonNull(request.getCreateGroupDetails(), "createGroupDetails is required");

        return clientCall(request, CreateGroupResponse::builder)
                .logger(LOG, "createGroup")
                .serviceDetails(
                        "Identity",
                        "CreateGroup",
                        "https://docs.oracle.com/iaas/api/#/en/identity/20160918/Group/CreateGroup")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CreateGroupRequest::builder)
                .basePath("/20160918")
                .appendPathParam("groups")
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.identity.model.Group.class,
                        CreateGroupResponse.Builder::group)
                .handleResponseHeaderString(
                        "opc-request-id", CreateGroupResponse.Builder::opcRequestId)
                .handleResponseHeaderString("etag", CreateGroupResponse.Builder::etag)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<CreateIdentityProviderResponse> createIdentityProvider(
            CreateIdentityProviderRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            CreateIdentityProviderRequest, CreateIdentityProviderResponse>
                    handler) {
        Objects.requireNonNull(
                request.getCreateIdentityProviderDetails(),
                "createIdentityProviderDetails is required");

        return clientCall(request, CreateIdentityProviderResponse::builder)
                .logger(LOG, "createIdentityProvider")
                .serviceDetails(
                        "Identity",
                        "CreateIdentityProvider",
                        "https://docs.oracle.com/iaas/api/#/en/identity/20160918/IdentityProvider/CreateIdentityProvider")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CreateIdentityProviderRequest::builder)
                .basePath("/20160918")
                .appendPathParam("identityProviders")
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.identity.model.IdentityProvider.class,
                        CreateIdentityProviderResponse.Builder::identityProvider)
                .handleResponseHeaderString(
                        "opc-request-id", CreateIdentityProviderResponse.Builder::opcRequestId)
                .handleResponseHeaderString("etag", CreateIdentityProviderResponse.Builder::etag)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<CreateIdpGroupMappingResponse> createIdpGroupMapping(
            CreateIdpGroupMappingRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            CreateIdpGroupMappingRequest, CreateIdpGroupMappingResponse>
                    handler) {
        Objects.requireNonNull(
                request.getCreateIdpGroupMappingDetails(),
                "createIdpGroupMappingDetails is required");

        Validate.notBlank(request.getIdentityProviderId(), "identityProviderId must not be blank");

        return clientCall(request, CreateIdpGroupMappingResponse::builder)
                .logger(LOG, "createIdpGroupMapping")
                .serviceDetails(
                        "Identity",
                        "CreateIdpGroupMapping",
                        "https://docs.oracle.com/iaas/api/#/en/identity/20160918/IdpGroupMapping/CreateIdpGroupMapping")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CreateIdpGroupMappingRequest::builder)
                .basePath("/20160918")
                .appendPathParam("identityProviders")
                .appendPathParam(request.getIdentityProviderId())
                .appendPathParam("groupMappings")
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.identity.model.IdpGroupMapping.class,
                        CreateIdpGroupMappingResponse.Builder::idpGroupMapping)
                .handleResponseHeaderString(
                        "opc-request-id", CreateIdpGroupMappingResponse.Builder::opcRequestId)
                .handleResponseHeaderString("etag", CreateIdpGroupMappingResponse.Builder::etag)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<CreateMfaTotpDeviceResponse> createMfaTotpDevice(
            CreateMfaTotpDeviceRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            CreateMfaTotpDeviceRequest, CreateMfaTotpDeviceResponse>
                    handler) {

        Validate.notBlank(request.getUserId(), "userId must not be blank");

        return clientCall(request, CreateMfaTotpDeviceResponse::builder)
                .logger(LOG, "createMfaTotpDevice")
                .serviceDetails(
                        "Identity",
                        "CreateMfaTotpDevice",
                        "https://docs.oracle.com/iaas/api/#/en/identity/20160918/MfaTotpDevice/CreateMfaTotpDevice")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CreateMfaTotpDeviceRequest::builder)
                .basePath("/20160918")
                .appendPathParam("users")
                .appendPathParam(request.getUserId())
                .appendPathParam("mfaTotpDevices")
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .handleBody(
                        com.oracle.bmc.identity.model.MfaTotpDevice.class,
                        CreateMfaTotpDeviceResponse.Builder::mfaTotpDevice)
                .handleResponseHeaderString(
                        "opc-request-id", CreateMfaTotpDeviceResponse.Builder::opcRequestId)
                .handleResponseHeaderString("etag", CreateMfaTotpDeviceResponse.Builder::etag)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<CreateNetworkSourceResponse> createNetworkSource(
            CreateNetworkSourceRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            CreateNetworkSourceRequest, CreateNetworkSourceResponse>
                    handler) {
        Objects.requireNonNull(
                request.getCreateNetworkSourceDetails(), "createNetworkSourceDetails is required");

        return clientCall(request, CreateNetworkSourceResponse::builder)
                .logger(LOG, "createNetworkSource")
                .serviceDetails(
                        "Identity",
                        "CreateNetworkSource",
                        "https://docs.oracle.com/iaas/api/#/en/identity/20160918/NetworkSources/CreateNetworkSource")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CreateNetworkSourceRequest::builder)
                .basePath("/20160918")
                .appendPathParam("networkSources")
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.identity.model.NetworkSources.class,
                        CreateNetworkSourceResponse.Builder::networkSources)
                .handleResponseHeaderString(
                        "opc-request-id", CreateNetworkSourceResponse.Builder::opcRequestId)
                .handleResponseHeaderString("etag", CreateNetworkSourceResponse.Builder::etag)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<CreateOAuthClientCredentialResponse>
            createOAuthClientCredential(
                    CreateOAuthClientCredentialRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    CreateOAuthClientCredentialRequest,
                                    CreateOAuthClientCredentialResponse>
                            handler) {

        Validate.notBlank(request.getUserId(), "userId must not be blank");
        Objects.requireNonNull(
                request.getCreateOAuth2ClientCredentialDetails(),
                "createOAuth2ClientCredentialDetails is required");

        return clientCall(request, CreateOAuthClientCredentialResponse::builder)
                .logger(LOG, "createOAuthClientCredential")
                .serviceDetails(
                        "Identity",
                        "CreateOAuthClientCredential",
                        "https://docs.oracle.com/iaas/api/#/en/identity/20160918/User/CreateOAuthClientCredential")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CreateOAuthClientCredentialRequest::builder)
                .basePath("/20160918")
                .appendPathParam("users")
                .appendPathParam(request.getUserId())
                .appendPathParam("oauth2ClientCredentials")
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.identity.model.OAuth2ClientCredential.class,
                        CreateOAuthClientCredentialResponse.Builder::oAuth2ClientCredential)
                .handleResponseHeaderString(
                        "opc-request-id", CreateOAuthClientCredentialResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "etag", CreateOAuthClientCredentialResponse.Builder::etag)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<CreateOrResetUIPasswordResponse> createOrResetUIPassword(
            CreateOrResetUIPasswordRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            CreateOrResetUIPasswordRequest, CreateOrResetUIPasswordResponse>
                    handler) {

        Validate.notBlank(request.getUserId(), "userId must not be blank");

        return clientCall(request, CreateOrResetUIPasswordResponse::builder)
                .logger(LOG, "createOrResetUIPassword")
                .serviceDetails(
                        "Identity",
                        "CreateOrResetUIPassword",
                        "https://docs.oracle.com/iaas/api/#/en/identity/20160918/UIPassword/CreateOrResetUIPassword")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CreateOrResetUIPasswordRequest::builder)
                .basePath("/20160918")
                .appendPathParam("users")
                .appendPathParam(request.getUserId())
                .appendPathParam("uiPassword")
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .handleBody(
                        com.oracle.bmc.identity.model.UIPassword.class,
                        CreateOrResetUIPasswordResponse.Builder::uIPassword)
                .handleResponseHeaderString(
                        "opc-request-id", CreateOrResetUIPasswordResponse.Builder::opcRequestId)
                .handleResponseHeaderString("etag", CreateOrResetUIPasswordResponse.Builder::etag)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<CreatePolicyResponse> createPolicy(
            CreatePolicyRequest request,
            final com.oracle.bmc.responses.AsyncHandler<CreatePolicyRequest, CreatePolicyResponse>
                    handler) {
        Objects.requireNonNull(request.getCreatePolicyDetails(), "createPolicyDetails is required");

        return clientCall(request, CreatePolicyResponse::builder)
                .logger(LOG, "createPolicy")
                .serviceDetails(
                        "Identity",
                        "CreatePolicy",
                        "https://docs.oracle.com/iaas/api/#/en/identity/20160918/Policy/CreatePolicy")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CreatePolicyRequest::builder)
                .basePath("/20160918")
                .appendPathParam("policies")
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.identity.model.Policy.class,
                        CreatePolicyResponse.Builder::policy)
                .handleResponseHeaderString(
                        "opc-request-id", CreatePolicyResponse.Builder::opcRequestId)
                .handleResponseHeaderString("etag", CreatePolicyResponse.Builder::etag)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<CreateRegionSubscriptionResponse> createRegionSubscription(
            CreateRegionSubscriptionRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            CreateRegionSubscriptionRequest, CreateRegionSubscriptionResponse>
                    handler) {
        Objects.requireNonNull(
                request.getCreateRegionSubscriptionDetails(),
                "createRegionSubscriptionDetails is required");

        Validate.notBlank(request.getTenancyId(), "tenancyId must not be blank");

        return clientCall(request, CreateRegionSubscriptionResponse::builder)
                .logger(LOG, "createRegionSubscription")
                .serviceDetails(
                        "Identity",
                        "CreateRegionSubscription",
                        "https://docs.oracle.com/iaas/api/#/en/identity/20160918/RegionSubscription/CreateRegionSubscription")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CreateRegionSubscriptionRequest::builder)
                .basePath("/20160918")
                .appendPathParam("tenancies")
                .appendPathParam(request.getTenancyId())
                .appendPathParam("regionSubscriptions")
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.identity.model.RegionSubscription.class,
                        CreateRegionSubscriptionResponse.Builder::regionSubscription)
                .handleResponseHeaderString(
                        "opc-request-id", CreateRegionSubscriptionResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<CreateSmtpCredentialResponse> createSmtpCredential(
            CreateSmtpCredentialRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            CreateSmtpCredentialRequest, CreateSmtpCredentialResponse>
                    handler) {
        Objects.requireNonNull(
                request.getCreateSmtpCredentialDetails(),
                "createSmtpCredentialDetails is required");

        Validate.notBlank(request.getUserId(), "userId must not be blank");

        return clientCall(request, CreateSmtpCredentialResponse::builder)
                .logger(LOG, "createSmtpCredential")
                .serviceDetails(
                        "Identity",
                        "CreateSmtpCredential",
                        "https://docs.oracle.com/iaas/api/#/en/identity/20160918/SmtpCredential/CreateSmtpCredential")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CreateSmtpCredentialRequest::builder)
                .basePath("/20160918")
                .appendPathParam("users")
                .appendPathParam(request.getUserId())
                .appendPathParam("smtpCredentials")
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.identity.model.SmtpCredential.class,
                        CreateSmtpCredentialResponse.Builder::smtpCredential)
                .handleResponseHeaderString(
                        "opc-request-id", CreateSmtpCredentialResponse.Builder::opcRequestId)
                .handleResponseHeaderString("etag", CreateSmtpCredentialResponse.Builder::etag)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<CreateSwiftPasswordResponse> createSwiftPassword(
            CreateSwiftPasswordRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            CreateSwiftPasswordRequest, CreateSwiftPasswordResponse>
                    handler) {
        Objects.requireNonNull(
                request.getCreateSwiftPasswordDetails(), "createSwiftPasswordDetails is required");

        Validate.notBlank(request.getUserId(), "userId must not be blank");

        return clientCall(request, CreateSwiftPasswordResponse::builder)
                .logger(LOG, "createSwiftPassword")
                .serviceDetails(
                        "Identity",
                        "CreateSwiftPassword",
                        "https://docs.oracle.com/iaas/api/#/en/identity/20160918/SwiftPassword/CreateSwiftPassword")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CreateSwiftPasswordRequest::builder)
                .basePath("/20160918")
                .appendPathParam("users")
                .appendPathParam(request.getUserId())
                .appendPathParam("swiftPasswords")
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.identity.model.SwiftPassword.class,
                        CreateSwiftPasswordResponse.Builder::swiftPassword)
                .handleResponseHeaderString(
                        "opc-request-id", CreateSwiftPasswordResponse.Builder::opcRequestId)
                .handleResponseHeaderString("etag", CreateSwiftPasswordResponse.Builder::etag)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<CreateTagResponse> createTag(
            CreateTagRequest request,
            final com.oracle.bmc.responses.AsyncHandler<CreateTagRequest, CreateTagResponse>
                    handler) {

        Validate.notBlank(request.getTagNamespaceId(), "tagNamespaceId must not be blank");
        Objects.requireNonNull(request.getCreateTagDetails(), "createTagDetails is required");

        return clientCall(request, CreateTagResponse::builder)
                .logger(LOG, "createTag")
                .serviceDetails(
                        "Identity",
                        "CreateTag",
                        "https://docs.oracle.com/iaas/api/#/en/identity/20160918/Tag/CreateTag")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CreateTagRequest::builder)
                .basePath("/20160918")
                .appendPathParam("tagNamespaces")
                .appendPathParam(request.getTagNamespaceId())
                .appendPathParam("tags")
                .appendQueryParam("isLockOverride", request.getIsLockOverride())
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .hasBody()
                .handleBody(com.oracle.bmc.identity.model.Tag.class, CreateTagResponse.Builder::tag)
                .handleResponseHeaderString(
                        "opc-request-id", CreateTagResponse.Builder::opcRequestId)
                .handleResponseHeaderString("etag", CreateTagResponse.Builder::etag)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<CreateTagDefaultResponse> createTagDefault(
            CreateTagDefaultRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            CreateTagDefaultRequest, CreateTagDefaultResponse>
                    handler) {
        Objects.requireNonNull(
                request.getCreateTagDefaultDetails(), "createTagDefaultDetails is required");

        return clientCall(request, CreateTagDefaultResponse::builder)
                .logger(LOG, "createTagDefault")
                .serviceDetails(
                        "Identity",
                        "CreateTagDefault",
                        "https://docs.oracle.com/iaas/api/#/en/identity/20160918/TagDefault/CreateTagDefault")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CreateTagDefaultRequest::builder)
                .basePath("/20160918")
                .appendPathParam("tagDefaults")
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.identity.model.TagDefault.class,
                        CreateTagDefaultResponse.Builder::tagDefault)
                .handleResponseHeaderString(
                        "opc-request-id", CreateTagDefaultResponse.Builder::opcRequestId)
                .handleResponseHeaderString("etag", CreateTagDefaultResponse.Builder::etag)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<CreateTagNamespaceResponse> createTagNamespace(
            CreateTagNamespaceRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            CreateTagNamespaceRequest, CreateTagNamespaceResponse>
                    handler) {
        Objects.requireNonNull(
                request.getCreateTagNamespaceDetails(), "createTagNamespaceDetails is required");

        return clientCall(request, CreateTagNamespaceResponse::builder)
                .logger(LOG, "createTagNamespace")
                .serviceDetails(
                        "Identity",
                        "CreateTagNamespace",
                        "https://docs.oracle.com/iaas/api/#/en/identity/20160918/TagNamespace/CreateTagNamespace")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CreateTagNamespaceRequest::builder)
                .basePath("/20160918")
                .appendPathParam("tagNamespaces")
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.identity.model.TagNamespace.class,
                        CreateTagNamespaceResponse.Builder::tagNamespace)
                .handleResponseHeaderString(
                        "opc-request-id", CreateTagNamespaceResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<CreateUserResponse> createUser(
            CreateUserRequest request,
            final com.oracle.bmc.responses.AsyncHandler<CreateUserRequest, CreateUserResponse>
                    handler) {
        Objects.requireNonNull(request.getCreateUserDetails(), "createUserDetails is required");

        return clientCall(request, CreateUserResponse::builder)
                .logger(LOG, "createUser")
                .serviceDetails(
                        "Identity",
                        "CreateUser",
                        "https://docs.oracle.com/iaas/api/#/en/identity/20160918/User/CreateUser")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CreateUserRequest::builder)
                .basePath("/20160918")
                .appendPathParam("users")
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.identity.model.User.class, CreateUserResponse.Builder::user)
                .handleResponseHeaderString(
                        "opc-request-id", CreateUserResponse.Builder::opcRequestId)
                .handleResponseHeaderString("etag", CreateUserResponse.Builder::etag)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<DeactivateDomainResponse> deactivateDomain(
            DeactivateDomainRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            DeactivateDomainRequest, DeactivateDomainResponse>
                    handler) {

        Validate.notBlank(request.getDomainId(), "domainId must not be blank");

        return clientCall(request, DeactivateDomainResponse::builder)
                .logger(LOG, "deactivateDomain")
                .serviceDetails(
                        "Identity",
                        "DeactivateDomain",
                        "https://docs.oracle.com/iaas/api/#/en/identity/20160918/Domain/DeactivateDomain")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(DeactivateDomainRequest::builder)
                .basePath("/20160918")
                .appendPathParam("domains")
                .appendPathParam(request.getDomainId())
                .appendPathParam("actions")
                .appendPathParam("deactivate")
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("if-match", request.getIfMatch())
                .handleResponseHeaderString(
                        "opc-request-id", DeactivateDomainResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-work-request-id", DeactivateDomainResponse.Builder::opcWorkRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<DeleteApiKeyResponse> deleteApiKey(
            DeleteApiKeyRequest request,
            final com.oracle.bmc.responses.AsyncHandler<DeleteApiKeyRequest, DeleteApiKeyResponse>
                    handler) {

        Validate.notBlank(request.getUserId(), "userId must not be blank");

        Validate.notBlank(request.getFingerprint(), "fingerprint must not be blank");

        return clientCall(request, DeleteApiKeyResponse::builder)
                .logger(LOG, "deleteApiKey")
                .serviceDetails("Identity", "DeleteApiKey", "")
                .method(com.oracle.bmc.http.client.Method.DELETE)
                .requestBuilder(DeleteApiKeyRequest::builder)
                .basePath("/20160918")
                .appendPathParam("users")
                .appendPathParam(request.getUserId())
                .appendPathParam("apiKeys")
                .appendPathParam(request.getFingerprint())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .handleResponseHeaderString(
                        "opc-request-id", DeleteApiKeyResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<DeleteAuthTokenResponse> deleteAuthToken(
            DeleteAuthTokenRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            DeleteAuthTokenRequest, DeleteAuthTokenResponse>
                    handler) {

        Validate.notBlank(request.getUserId(), "userId must not be blank");

        Validate.notBlank(request.getAuthTokenId(), "authTokenId must not be blank");

        return clientCall(request, DeleteAuthTokenResponse::builder)
                .logger(LOG, "deleteAuthToken")
                .serviceDetails("Identity", "DeleteAuthToken", "")
                .method(com.oracle.bmc.http.client.Method.DELETE)
                .requestBuilder(DeleteAuthTokenRequest::builder)
                .basePath("/20160918")
                .appendPathParam("users")
                .appendPathParam(request.getUserId())
                .appendPathParam("authTokens")
                .appendPathParam(request.getAuthTokenId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .handleResponseHeaderString(
                        "opc-request-id", DeleteAuthTokenResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<DeleteCompartmentResponse> deleteCompartment(
            DeleteCompartmentRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            DeleteCompartmentRequest, DeleteCompartmentResponse>
                    handler) {

        Validate.notBlank(request.getCompartmentId(), "compartmentId must not be blank");

        return clientCall(request, DeleteCompartmentResponse::builder)
                .logger(LOG, "deleteCompartment")
                .serviceDetails(
                        "Identity",
                        "DeleteCompartment",
                        "https://docs.oracle.com/iaas/api/#/en/identity/20160918/Compartment/DeleteCompartment")
                .method(com.oracle.bmc.http.client.Method.DELETE)
                .requestBuilder(DeleteCompartmentRequest::builder)
                .basePath("/20160918")
                .appendPathParam("compartments")
                .appendPathParam(request.getCompartmentId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .handleResponseHeaderString(
                        "opc-request-id", DeleteCompartmentResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-work-request-id", DeleteCompartmentResponse.Builder::opcWorkRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<DeleteCustomerSecretKeyResponse> deleteCustomerSecretKey(
            DeleteCustomerSecretKeyRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            DeleteCustomerSecretKeyRequest, DeleteCustomerSecretKeyResponse>
                    handler) {

        Validate.notBlank(request.getUserId(), "userId must not be blank");

        Validate.notBlank(
                request.getCustomerSecretKeyId(), "customerSecretKeyId must not be blank");

        return clientCall(request, DeleteCustomerSecretKeyResponse::builder)
                .logger(LOG, "deleteCustomerSecretKey")
                .serviceDetails("Identity", "DeleteCustomerSecretKey", "")
                .method(com.oracle.bmc.http.client.Method.DELETE)
                .requestBuilder(DeleteCustomerSecretKeyRequest::builder)
                .basePath("/20160918")
                .appendPathParam("users")
                .appendPathParam(request.getUserId())
                .appendPathParam("customerSecretKeys")
                .appendPathParam(request.getCustomerSecretKeyId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .handleResponseHeaderString(
                        "opc-request-id", DeleteCustomerSecretKeyResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<DeleteDbCredentialResponse> deleteDbCredential(
            DeleteDbCredentialRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            DeleteDbCredentialRequest, DeleteDbCredentialResponse>
                    handler) {

        Validate.notBlank(request.getUserId(), "userId must not be blank");

        Validate.notBlank(request.getDbCredentialId(), "dbCredentialId must not be blank");

        return clientCall(request, DeleteDbCredentialResponse::builder)
                .logger(LOG, "deleteDbCredential")
                .serviceDetails(
                        "Identity",
                        "DeleteDbCredential",
                        "https://docs.oracle.com/iaas/api/#/en/identity/20160918/User/DeleteDbCredential")
                .method(com.oracle.bmc.http.client.Method.DELETE)
                .requestBuilder(DeleteDbCredentialRequest::builder)
                .basePath("/20160918")
                .appendPathParam("users")
                .appendPathParam(request.getUserId())
                .appendPathParam("dbCredentials")
                .appendPathParam(request.getDbCredentialId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("if-match", request.getIfMatch())
                .handleResponseHeaderString(
                        "opc-request-id", DeleteDbCredentialResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<DeleteDomainResponse> deleteDomain(
            DeleteDomainRequest request,
            final com.oracle.bmc.responses.AsyncHandler<DeleteDomainRequest, DeleteDomainResponse>
                    handler) {

        Validate.notBlank(request.getDomainId(), "domainId must not be blank");

        return clientCall(request, DeleteDomainResponse::builder)
                .logger(LOG, "deleteDomain")
                .serviceDetails(
                        "Identity",
                        "DeleteDomain",
                        "https://docs.oracle.com/iaas/api/#/en/identity/20160918/Domain/DeleteDomain")
                .method(com.oracle.bmc.http.client.Method.DELETE)
                .requestBuilder(DeleteDomainRequest::builder)
                .basePath("/20160918")
                .appendPathParam("domains")
                .appendPathParam(request.getDomainId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleResponseHeaderString(
                        "opc-request-id", DeleteDomainResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-work-request-id", DeleteDomainResponse.Builder::opcWorkRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<DeleteDynamicGroupResponse> deleteDynamicGroup(
            DeleteDynamicGroupRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            DeleteDynamicGroupRequest, DeleteDynamicGroupResponse>
                    handler) {

        Validate.notBlank(request.getDynamicGroupId(), "dynamicGroupId must not be blank");

        return clientCall(request, DeleteDynamicGroupResponse::builder)
                .logger(LOG, "deleteDynamicGroup")
                .serviceDetails("Identity", "DeleteDynamicGroup", "")
                .method(com.oracle.bmc.http.client.Method.DELETE)
                .requestBuilder(DeleteDynamicGroupRequest::builder)
                .basePath("/20160918")
                .appendPathParam("dynamicGroups")
                .appendPathParam(request.getDynamicGroupId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .handleResponseHeaderString(
                        "opc-request-id", DeleteDynamicGroupResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<DeleteGroupResponse> deleteGroup(
            DeleteGroupRequest request,
            final com.oracle.bmc.responses.AsyncHandler<DeleteGroupRequest, DeleteGroupResponse>
                    handler) {

        Validate.notBlank(request.getGroupId(), "groupId must not be blank");

        return clientCall(request, DeleteGroupResponse::builder)
                .logger(LOG, "deleteGroup")
                .serviceDetails("Identity", "DeleteGroup", "")
                .method(com.oracle.bmc.http.client.Method.DELETE)
                .requestBuilder(DeleteGroupRequest::builder)
                .basePath("/20160918")
                .appendPathParam("groups")
                .appendPathParam(request.getGroupId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .handleResponseHeaderString(
                        "opc-request-id", DeleteGroupResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<DeleteIdentityProviderResponse> deleteIdentityProvider(
            DeleteIdentityProviderRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            DeleteIdentityProviderRequest, DeleteIdentityProviderResponse>
                    handler) {

        Validate.notBlank(request.getIdentityProviderId(), "identityProviderId must not be blank");

        return clientCall(request, DeleteIdentityProviderResponse::builder)
                .logger(LOG, "deleteIdentityProvider")
                .serviceDetails("Identity", "DeleteIdentityProvider", "")
                .method(com.oracle.bmc.http.client.Method.DELETE)
                .requestBuilder(DeleteIdentityProviderRequest::builder)
                .basePath("/20160918")
                .appendPathParam("identityProviders")
                .appendPathParam(request.getIdentityProviderId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .handleResponseHeaderString(
                        "opc-request-id", DeleteIdentityProviderResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<DeleteIdpGroupMappingResponse> deleteIdpGroupMapping(
            DeleteIdpGroupMappingRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            DeleteIdpGroupMappingRequest, DeleteIdpGroupMappingResponse>
                    handler) {

        Validate.notBlank(request.getIdentityProviderId(), "identityProviderId must not be blank");

        Validate.notBlank(request.getMappingId(), "mappingId must not be blank");

        return clientCall(request, DeleteIdpGroupMappingResponse::builder)
                .logger(LOG, "deleteIdpGroupMapping")
                .serviceDetails("Identity", "DeleteIdpGroupMapping", "")
                .method(com.oracle.bmc.http.client.Method.DELETE)
                .requestBuilder(DeleteIdpGroupMappingRequest::builder)
                .basePath("/20160918")
                .appendPathParam("identityProviders")
                .appendPathParam(request.getIdentityProviderId())
                .appendPathParam("groupMappings")
                .appendPathParam(request.getMappingId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .handleResponseHeaderString(
                        "opc-request-id", DeleteIdpGroupMappingResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<DeleteMfaTotpDeviceResponse> deleteMfaTotpDevice(
            DeleteMfaTotpDeviceRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            DeleteMfaTotpDeviceRequest, DeleteMfaTotpDeviceResponse>
                    handler) {

        Validate.notBlank(request.getUserId(), "userId must not be blank");

        Validate.notBlank(request.getMfaTotpDeviceId(), "mfaTotpDeviceId must not be blank");

        return clientCall(request, DeleteMfaTotpDeviceResponse::builder)
                .logger(LOG, "deleteMfaTotpDevice")
                .serviceDetails(
                        "Identity",
                        "DeleteMfaTotpDevice",
                        "https://docs.oracle.com/iaas/api/#/en/identity/20160918/MfaTotpDevice/DeleteMfaTotpDevice")
                .method(com.oracle.bmc.http.client.Method.DELETE)
                .requestBuilder(DeleteMfaTotpDeviceRequest::builder)
                .basePath("/20160918")
                .appendPathParam("users")
                .appendPathParam(request.getUserId())
                .appendPathParam("mfaTotpDevices")
                .appendPathParam(request.getMfaTotpDeviceId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .handleResponseHeaderString(
                        "opc-request-id", DeleteMfaTotpDeviceResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<DeleteNetworkSourceResponse> deleteNetworkSource(
            DeleteNetworkSourceRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            DeleteNetworkSourceRequest, DeleteNetworkSourceResponse>
                    handler) {

        Validate.notBlank(request.getNetworkSourceId(), "networkSourceId must not be blank");

        return clientCall(request, DeleteNetworkSourceResponse::builder)
                .logger(LOG, "deleteNetworkSource")
                .serviceDetails(
                        "Identity",
                        "DeleteNetworkSource",
                        "https://docs.oracle.com/iaas/api/#/en/identity/20160918/NetworkSources/DeleteNetworkSource")
                .method(com.oracle.bmc.http.client.Method.DELETE)
                .requestBuilder(DeleteNetworkSourceRequest::builder)
                .basePath("/20160918")
                .appendPathParam("networkSources")
                .appendPathParam(request.getNetworkSourceId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .handleResponseHeaderString(
                        "opc-request-id", DeleteNetworkSourceResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<DeleteOAuthClientCredentialResponse>
            deleteOAuthClientCredential(
                    DeleteOAuthClientCredentialRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    DeleteOAuthClientCredentialRequest,
                                    DeleteOAuthClientCredentialResponse>
                            handler) {

        Validate.notBlank(request.getUserId(), "userId must not be blank");

        Validate.notBlank(
                request.getOauth2ClientCredentialId(),
                "oauth2ClientCredentialId must not be blank");

        return clientCall(request, DeleteOAuthClientCredentialResponse::builder)
                .logger(LOG, "deleteOAuthClientCredential")
                .serviceDetails(
                        "Identity",
                        "DeleteOAuthClientCredential",
                        "https://docs.oracle.com/iaas/api/#/en/identity/20160918/User/DeleteOAuthClientCredential")
                .method(com.oracle.bmc.http.client.Method.DELETE)
                .requestBuilder(DeleteOAuthClientCredentialRequest::builder)
                .basePath("/20160918")
                .appendPathParam("users")
                .appendPathParam(request.getUserId())
                .appendPathParam("oauth2ClientCredentials")
                .appendPathParam(request.getOauth2ClientCredentialId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .handleResponseHeaderString(
                        "opc-request-id", DeleteOAuthClientCredentialResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<DeletePolicyResponse> deletePolicy(
            DeletePolicyRequest request,
            final com.oracle.bmc.responses.AsyncHandler<DeletePolicyRequest, DeletePolicyResponse>
                    handler) {

        Validate.notBlank(request.getPolicyId(), "policyId must not be blank");

        return clientCall(request, DeletePolicyResponse::builder)
                .logger(LOG, "deletePolicy")
                .serviceDetails("Identity", "DeletePolicy", "")
                .method(com.oracle.bmc.http.client.Method.DELETE)
                .requestBuilder(DeletePolicyRequest::builder)
                .basePath("/20160918")
                .appendPathParam("policies")
                .appendPathParam(request.getPolicyId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .handleResponseHeaderString(
                        "opc-request-id", DeletePolicyResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<DeleteSmtpCredentialResponse> deleteSmtpCredential(
            DeleteSmtpCredentialRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            DeleteSmtpCredentialRequest, DeleteSmtpCredentialResponse>
                    handler) {

        Validate.notBlank(request.getUserId(), "userId must not be blank");

        Validate.notBlank(request.getSmtpCredentialId(), "smtpCredentialId must not be blank");

        return clientCall(request, DeleteSmtpCredentialResponse::builder)
                .logger(LOG, "deleteSmtpCredential")
                .serviceDetails("Identity", "DeleteSmtpCredential", "")
                .method(com.oracle.bmc.http.client.Method.DELETE)
                .requestBuilder(DeleteSmtpCredentialRequest::builder)
                .basePath("/20160918")
                .appendPathParam("users")
                .appendPathParam(request.getUserId())
                .appendPathParam("smtpCredentials")
                .appendPathParam(request.getSmtpCredentialId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .handleResponseHeaderString(
                        "opc-request-id", DeleteSmtpCredentialResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<DeleteSwiftPasswordResponse> deleteSwiftPassword(
            DeleteSwiftPasswordRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            DeleteSwiftPasswordRequest, DeleteSwiftPasswordResponse>
                    handler) {

        Validate.notBlank(request.getUserId(), "userId must not be blank");

        Validate.notBlank(request.getSwiftPasswordId(), "swiftPasswordId must not be blank");

        return clientCall(request, DeleteSwiftPasswordResponse::builder)
                .logger(LOG, "deleteSwiftPassword")
                .serviceDetails("Identity", "DeleteSwiftPassword", "")
                .method(com.oracle.bmc.http.client.Method.DELETE)
                .requestBuilder(DeleteSwiftPasswordRequest::builder)
                .basePath("/20160918")
                .appendPathParam("users")
                .appendPathParam(request.getUserId())
                .appendPathParam("swiftPasswords")
                .appendPathParam(request.getSwiftPasswordId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .handleResponseHeaderString(
                        "opc-request-id", DeleteSwiftPasswordResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<DeleteTagResponse> deleteTag(
            DeleteTagRequest request,
            final com.oracle.bmc.responses.AsyncHandler<DeleteTagRequest, DeleteTagResponse>
                    handler) {

        Validate.notBlank(request.getTagNamespaceId(), "tagNamespaceId must not be blank");

        Validate.notBlank(request.getTagName(), "tagName must not be blank");

        return clientCall(request, DeleteTagResponse::builder)
                .logger(LOG, "deleteTag")
                .serviceDetails(
                        "Identity",
                        "DeleteTag",
                        "https://docs.oracle.com/iaas/api/#/en/identity/20160918/Tag/DeleteTag")
                .method(com.oracle.bmc.http.client.Method.DELETE)
                .requestBuilder(DeleteTagRequest::builder)
                .basePath("/20160918")
                .appendPathParam("tagNamespaces")
                .appendPathParam(request.getTagNamespaceId())
                .appendPathParam("tags")
                .appendPathParam(request.getTagName())
                .appendQueryParam("isLockOverride", request.getIsLockOverride())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .handleResponseHeaderString(
                        "opc-request-id", DeleteTagResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-work-request-id", DeleteTagResponse.Builder::opcWorkRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<DeleteTagDefaultResponse> deleteTagDefault(
            DeleteTagDefaultRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            DeleteTagDefaultRequest, DeleteTagDefaultResponse>
                    handler) {

        Validate.notBlank(request.getTagDefaultId(), "tagDefaultId must not be blank");

        return clientCall(request, DeleteTagDefaultResponse::builder)
                .logger(LOG, "deleteTagDefault")
                .serviceDetails(
                        "Identity",
                        "DeleteTagDefault",
                        "https://docs.oracle.com/iaas/api/#/en/identity/20160918/TagDefault/DeleteTagDefault")
                .method(com.oracle.bmc.http.client.Method.DELETE)
                .requestBuilder(DeleteTagDefaultRequest::builder)
                .basePath("/20160918")
                .appendPathParam("tagDefaults")
                .appendPathParam(request.getTagDefaultId())
                .appendQueryParam("isLockOverride", request.getIsLockOverride())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("if-match", request.getIfMatch())
                .handleResponseHeaderString(
                        "opc-request-id", DeleteTagDefaultResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<DeleteTagNamespaceResponse> deleteTagNamespace(
            DeleteTagNamespaceRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            DeleteTagNamespaceRequest, DeleteTagNamespaceResponse>
                    handler) {

        Validate.notBlank(request.getTagNamespaceId(), "tagNamespaceId must not be blank");

        return clientCall(request, DeleteTagNamespaceResponse::builder)
                .logger(LOG, "deleteTagNamespace")
                .serviceDetails(
                        "Identity",
                        "DeleteTagNamespace",
                        "https://docs.oracle.com/iaas/api/#/en/identity/20160918/TagNamespace/DeleteTagNamespace")
                .method(com.oracle.bmc.http.client.Method.DELETE)
                .requestBuilder(DeleteTagNamespaceRequest::builder)
                .basePath("/20160918")
                .appendPathParam("tagNamespaces")
                .appendPathParam(request.getTagNamespaceId())
                .appendQueryParam("isLockOverride", request.getIsLockOverride())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleResponseHeaderString(
                        "opc-request-id", DeleteTagNamespaceResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<DeleteUserResponse> deleteUser(
            DeleteUserRequest request,
            final com.oracle.bmc.responses.AsyncHandler<DeleteUserRequest, DeleteUserResponse>
                    handler) {

        Validate.notBlank(request.getUserId(), "userId must not be blank");

        return clientCall(request, DeleteUserResponse::builder)
                .logger(LOG, "deleteUser")
                .serviceDetails("Identity", "DeleteUser", "")
                .method(com.oracle.bmc.http.client.Method.DELETE)
                .requestBuilder(DeleteUserRequest::builder)
                .basePath("/20160918")
                .appendPathParam("users")
                .appendPathParam(request.getUserId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .handleResponseHeaderString(
                        "opc-request-id", DeleteUserResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<EnableReplicationToRegionResponse> enableReplicationToRegion(
            EnableReplicationToRegionRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            EnableReplicationToRegionRequest, EnableReplicationToRegionResponse>
                    handler) {

        Validate.notBlank(request.getDomainId(), "domainId must not be blank");
        Objects.requireNonNull(
                request.getEnableReplicationToRegionDetails(),
                "enableReplicationToRegionDetails is required");

        return clientCall(request, EnableReplicationToRegionResponse::builder)
                .logger(LOG, "enableReplicationToRegion")
                .serviceDetails(
                        "Identity",
                        "EnableReplicationToRegion",
                        "https://docs.oracle.com/iaas/api/#/en/identity/20160918/Domain/EnableReplicationToRegion")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(EnableReplicationToRegionRequest::builder)
                .basePath("/20160918")
                .appendPathParam("domains")
                .appendPathParam(request.getDomainId())
                .appendPathParam("actions")
                .appendPathParam("enableReplicationToRegion")
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("if-match", request.getIfMatch())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-request-id", EnableReplicationToRegionResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        EnableReplicationToRegionResponse.Builder::opcWorkRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<GenerateTotpSeedResponse> generateTotpSeed(
            GenerateTotpSeedRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GenerateTotpSeedRequest, GenerateTotpSeedResponse>
                    handler) {

        Validate.notBlank(request.getUserId(), "userId must not be blank");

        Validate.notBlank(request.getMfaTotpDeviceId(), "mfaTotpDeviceId must not be blank");

        return clientCall(request, GenerateTotpSeedResponse::builder)
                .logger(LOG, "generateTotpSeed")
                .serviceDetails(
                        "Identity",
                        "GenerateTotpSeed",
                        "https://docs.oracle.com/iaas/api/#/en/identity/20160918/MfaTotpDevice/GenerateTotpSeed")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(GenerateTotpSeedRequest::builder)
                .basePath("/20160918")
                .appendPathParam("users")
                .appendPathParam(request.getUserId())
                .appendPathParam("mfaTotpDevices")
                .appendPathParam(request.getMfaTotpDeviceId())
                .appendPathParam("actions")
                .appendPathParam("generateSeed")
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .handleBody(
                        com.oracle.bmc.identity.model.MfaTotpDevice.class,
                        GenerateTotpSeedResponse.Builder::mfaTotpDevice)
                .handleResponseHeaderString(
                        "opc-request-id", GenerateTotpSeedResponse.Builder::opcRequestId)
                .handleResponseHeaderString("etag", GenerateTotpSeedResponse.Builder::etag)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<GetAuthenticationPolicyResponse> getAuthenticationPolicy(
            GetAuthenticationPolicyRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetAuthenticationPolicyRequest, GetAuthenticationPolicyResponse>
                    handler) {

        Validate.notBlank(request.getCompartmentId(), "compartmentId must not be blank");

        return clientCall(request, GetAuthenticationPolicyResponse::builder)
                .logger(LOG, "getAuthenticationPolicy")
                .serviceDetails(
                        "Identity",
                        "GetAuthenticationPolicy",
                        "https://docs.oracle.com/iaas/api/#/en/identity/20160918/AuthenticationPolicy/GetAuthenticationPolicy")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetAuthenticationPolicyRequest::builder)
                .basePath("/20160918")
                .appendPathParam("authenticationPolicies")
                .appendPathParam(request.getCompartmentId())
                .accept("application/json")
                .handleBody(
                        com.oracle.bmc.identity.model.AuthenticationPolicy.class,
                        GetAuthenticationPolicyResponse.Builder::authenticationPolicy)
                .handleResponseHeaderString(
                        "opc-request-id", GetAuthenticationPolicyResponse.Builder::opcRequestId)
                .handleResponseHeaderString("etag", GetAuthenticationPolicyResponse.Builder::etag)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<GetCompartmentResponse> getCompartment(
            GetCompartmentRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetCompartmentRequest, GetCompartmentResponse>
                    handler) {

        Validate.notBlank(request.getCompartmentId(), "compartmentId must not be blank");

        return clientCall(request, GetCompartmentResponse::builder)
                .logger(LOG, "getCompartment")
                .serviceDetails(
                        "Identity",
                        "GetCompartment",
                        "https://docs.oracle.com/iaas/api/#/en/identity/20160918/Compartment/GetCompartment")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetCompartmentRequest::builder)
                .basePath("/20160918")
                .appendPathParam("compartments")
                .appendPathParam(request.getCompartmentId())
                .accept("application/json")
                .handleBody(
                        com.oracle.bmc.identity.model.Compartment.class,
                        GetCompartmentResponse.Builder::compartment)
                .handleResponseHeaderString(
                        "opc-request-id", GetCompartmentResponse.Builder::opcRequestId)
                .handleResponseHeaderString("etag", GetCompartmentResponse.Builder::etag)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<GetDomainResponse> getDomain(
            GetDomainRequest request,
            final com.oracle.bmc.responses.AsyncHandler<GetDomainRequest, GetDomainResponse>
                    handler) {

        Validate.notBlank(request.getDomainId(), "domainId must not be blank");

        return clientCall(request, GetDomainResponse::builder)
                .logger(LOG, "getDomain")
                .serviceDetails(
                        "Identity",
                        "GetDomain",
                        "https://docs.oracle.com/iaas/api/#/en/identity/20160918/Domain/GetDomain")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetDomainRequest::builder)
                .basePath("/20160918")
                .appendPathParam("domains")
                .appendPathParam(request.getDomainId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.identity.model.Domain.class,
                        GetDomainResponse.Builder::domain)
                .handleResponseHeaderString(
                        "opc-request-id", GetDomainResponse.Builder::opcRequestId)
                .handleResponseHeaderString("etag", GetDomainResponse.Builder::etag)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<GetDynamicGroupResponse> getDynamicGroup(
            GetDynamicGroupRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetDynamicGroupRequest, GetDynamicGroupResponse>
                    handler) {

        Validate.notBlank(request.getDynamicGroupId(), "dynamicGroupId must not be blank");

        return clientCall(request, GetDynamicGroupResponse::builder)
                .logger(LOG, "getDynamicGroup")
                .serviceDetails(
                        "Identity",
                        "GetDynamicGroup",
                        "https://docs.oracle.com/iaas/api/#/en/identity/20160918/DynamicGroup/GetDynamicGroup")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetDynamicGroupRequest::builder)
                .basePath("/20160918")
                .appendPathParam("dynamicGroups")
                .appendPathParam(request.getDynamicGroupId())
                .accept("application/json")
                .handleBody(
                        com.oracle.bmc.identity.model.DynamicGroup.class,
                        GetDynamicGroupResponse.Builder::dynamicGroup)
                .handleResponseHeaderString(
                        "opc-request-id", GetDynamicGroupResponse.Builder::opcRequestId)
                .handleResponseHeaderString("etag", GetDynamicGroupResponse.Builder::etag)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<GetGroupResponse> getGroup(
            GetGroupRequest request,
            final com.oracle.bmc.responses.AsyncHandler<GetGroupRequest, GetGroupResponse>
                    handler) {

        Validate.notBlank(request.getGroupId(), "groupId must not be blank");

        return clientCall(request, GetGroupResponse::builder)
                .logger(LOG, "getGroup")
                .serviceDetails(
                        "Identity",
                        "GetGroup",
                        "https://docs.oracle.com/iaas/api/#/en/identity/20160918/Group/GetGroup")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetGroupRequest::builder)
                .basePath("/20160918")
                .appendPathParam("groups")
                .appendPathParam(request.getGroupId())
                .accept("application/json")
                .handleBody(
                        com.oracle.bmc.identity.model.Group.class, GetGroupResponse.Builder::group)
                .handleResponseHeaderString(
                        "opc-request-id", GetGroupResponse.Builder::opcRequestId)
                .handleResponseHeaderString("etag", GetGroupResponse.Builder::etag)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<GetIamWorkRequestResponse> getIamWorkRequest(
            GetIamWorkRequestRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetIamWorkRequestRequest, GetIamWorkRequestResponse>
                    handler) {

        Validate.notBlank(request.getIamWorkRequestId(), "iamWorkRequestId must not be blank");

        return clientCall(request, GetIamWorkRequestResponse::builder)
                .logger(LOG, "getIamWorkRequest")
                .serviceDetails(
                        "Identity",
                        "GetIamWorkRequest",
                        "https://docs.oracle.com/iaas/api/#/en/identity/20160918/IamWorkRequest/GetIamWorkRequest")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetIamWorkRequestRequest::builder)
                .basePath("/20160918")
                .appendPathParam("iamWorkRequests")
                .appendPathParam(request.getIamWorkRequestId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.identity.model.IamWorkRequest.class,
                        GetIamWorkRequestResponse.Builder::iamWorkRequest)
                .handleResponseHeaderString(
                        "opc-request-id", GetIamWorkRequestResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<GetIdentityProviderResponse> getIdentityProvider(
            GetIdentityProviderRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetIdentityProviderRequest, GetIdentityProviderResponse>
                    handler) {

        Validate.notBlank(request.getIdentityProviderId(), "identityProviderId must not be blank");

        return clientCall(request, GetIdentityProviderResponse::builder)
                .logger(LOG, "getIdentityProvider")
                .serviceDetails(
                        "Identity",
                        "GetIdentityProvider",
                        "https://docs.oracle.com/iaas/api/#/en/identity/20160918/IdentityProvider/GetIdentityProvider")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetIdentityProviderRequest::builder)
                .basePath("/20160918")
                .appendPathParam("identityProviders")
                .appendPathParam(request.getIdentityProviderId())
                .accept("application/json")
                .handleBody(
                        com.oracle.bmc.identity.model.IdentityProvider.class,
                        GetIdentityProviderResponse.Builder::identityProvider)
                .handleResponseHeaderString(
                        "opc-request-id", GetIdentityProviderResponse.Builder::opcRequestId)
                .handleResponseHeaderString("etag", GetIdentityProviderResponse.Builder::etag)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<GetIdpGroupMappingResponse> getIdpGroupMapping(
            GetIdpGroupMappingRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetIdpGroupMappingRequest, GetIdpGroupMappingResponse>
                    handler) {

        Validate.notBlank(request.getIdentityProviderId(), "identityProviderId must not be blank");

        Validate.notBlank(request.getMappingId(), "mappingId must not be blank");

        return clientCall(request, GetIdpGroupMappingResponse::builder)
                .logger(LOG, "getIdpGroupMapping")
                .serviceDetails(
                        "Identity",
                        "GetIdpGroupMapping",
                        "https://docs.oracle.com/iaas/api/#/en/identity/20160918/IdpGroupMapping/GetIdpGroupMapping")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetIdpGroupMappingRequest::builder)
                .basePath("/20160918")
                .appendPathParam("identityProviders")
                .appendPathParam(request.getIdentityProviderId())
                .appendPathParam("groupMappings")
                .appendPathParam(request.getMappingId())
                .accept("application/json")
                .handleBody(
                        com.oracle.bmc.identity.model.IdpGroupMapping.class,
                        GetIdpGroupMappingResponse.Builder::idpGroupMapping)
                .handleResponseHeaderString(
                        "opc-request-id", GetIdpGroupMappingResponse.Builder::opcRequestId)
                .handleResponseHeaderString("etag", GetIdpGroupMappingResponse.Builder::etag)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<GetMfaTotpDeviceResponse> getMfaTotpDevice(
            GetMfaTotpDeviceRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetMfaTotpDeviceRequest, GetMfaTotpDeviceResponse>
                    handler) {

        Validate.notBlank(request.getUserId(), "userId must not be blank");

        Validate.notBlank(request.getMfaTotpDeviceId(), "mfaTotpDeviceId must not be blank");

        return clientCall(request, GetMfaTotpDeviceResponse::builder)
                .logger(LOG, "getMfaTotpDevice")
                .serviceDetails(
                        "Identity",
                        "GetMfaTotpDevice",
                        "https://docs.oracle.com/iaas/api/#/en/identity/20160918/MfaTotpDeviceSummary/GetMfaTotpDevice")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetMfaTotpDeviceRequest::builder)
                .basePath("/20160918")
                .appendPathParam("users")
                .appendPathParam(request.getUserId())
                .appendPathParam("mfaTotpDevices")
                .appendPathParam(request.getMfaTotpDeviceId())
                .accept("application/json")
                .handleBody(
                        com.oracle.bmc.identity.model.MfaTotpDeviceSummary.class,
                        GetMfaTotpDeviceResponse.Builder::mfaTotpDeviceSummary)
                .handleResponseHeaderString(
                        "opc-request-id", GetMfaTotpDeviceResponse.Builder::opcRequestId)
                .handleResponseHeaderString("etag", GetMfaTotpDeviceResponse.Builder::etag)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<GetNetworkSourceResponse> getNetworkSource(
            GetNetworkSourceRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetNetworkSourceRequest, GetNetworkSourceResponse>
                    handler) {

        Validate.notBlank(request.getNetworkSourceId(), "networkSourceId must not be blank");

        return clientCall(request, GetNetworkSourceResponse::builder)
                .logger(LOG, "getNetworkSource")
                .serviceDetails(
                        "Identity",
                        "GetNetworkSource",
                        "https://docs.oracle.com/iaas/api/#/en/identity/20160918/NetworkSources/GetNetworkSource")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetNetworkSourceRequest::builder)
                .basePath("/20160918")
                .appendPathParam("networkSources")
                .appendPathParam(request.getNetworkSourceId())
                .accept("application/json")
                .handleBody(
                        com.oracle.bmc.identity.model.NetworkSources.class,
                        GetNetworkSourceResponse.Builder::networkSources)
                .handleResponseHeaderString(
                        "opc-request-id", GetNetworkSourceResponse.Builder::opcRequestId)
                .handleResponseHeaderString("etag", GetNetworkSourceResponse.Builder::etag)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<GetPolicyResponse> getPolicy(
            GetPolicyRequest request,
            final com.oracle.bmc.responses.AsyncHandler<GetPolicyRequest, GetPolicyResponse>
                    handler) {

        Validate.notBlank(request.getPolicyId(), "policyId must not be blank");

        return clientCall(request, GetPolicyResponse::builder)
                .logger(LOG, "getPolicy")
                .serviceDetails(
                        "Identity",
                        "GetPolicy",
                        "https://docs.oracle.com/iaas/api/#/en/identity/20160918/Policy/GetPolicy")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetPolicyRequest::builder)
                .basePath("/20160918")
                .appendPathParam("policies")
                .appendPathParam(request.getPolicyId())
                .accept("application/json")
                .handleBody(
                        com.oracle.bmc.identity.model.Policy.class,
                        GetPolicyResponse.Builder::policy)
                .handleResponseHeaderString(
                        "opc-request-id", GetPolicyResponse.Builder::opcRequestId)
                .handleResponseHeaderString("etag", GetPolicyResponse.Builder::etag)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<GetStandardTagTemplateResponse> getStandardTagTemplate(
            GetStandardTagTemplateRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetStandardTagTemplateRequest, GetStandardTagTemplateResponse>
                    handler) {
        Objects.requireNonNull(request.getCompartmentId(), "compartmentId is required");

        Validate.notBlank(
                request.getStandardTagNamespaceName(),
                "standardTagNamespaceName must not be blank");

        return clientCall(request, GetStandardTagTemplateResponse::builder)
                .logger(LOG, "getStandardTagTemplate")
                .serviceDetails(
                        "Identity",
                        "GetStandardTagTemplate",
                        "https://docs.oracle.com/iaas/api/#/en/identity/20160918/StandardTagNamespaceTemplate/GetStandardTagTemplate")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetStandardTagTemplateRequest::builder)
                .basePath("/20160918")
                .appendPathParam("tags")
                .appendPathParam("standardTagNamespaceTemplates")
                .appendPathParam(request.getStandardTagNamespaceName())
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .accept("application/json")
                .handleBody(
                        com.oracle.bmc.identity.model.StandardTagNamespaceTemplate.class,
                        GetStandardTagTemplateResponse.Builder::standardTagNamespaceTemplate)
                .handleResponseHeaderString(
                        "opc-request-id", GetStandardTagTemplateResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<GetTagResponse> getTag(
            GetTagRequest request,
            final com.oracle.bmc.responses.AsyncHandler<GetTagRequest, GetTagResponse> handler) {

        Validate.notBlank(request.getTagNamespaceId(), "tagNamespaceId must not be blank");

        Validate.notBlank(request.getTagName(), "tagName must not be blank");

        return clientCall(request, GetTagResponse::builder)
                .logger(LOG, "getTag")
                .serviceDetails(
                        "Identity",
                        "GetTag",
                        "https://docs.oracle.com/iaas/api/#/en/identity/20160918/Tag/GetTag")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetTagRequest::builder)
                .basePath("/20160918")
                .appendPathParam("tagNamespaces")
                .appendPathParam(request.getTagNamespaceId())
                .appendPathParam("tags")
                .appendPathParam(request.getTagName())
                .accept("application/json")
                .handleBody(com.oracle.bmc.identity.model.Tag.class, GetTagResponse.Builder::tag)
                .handleResponseHeaderString("opc-request-id", GetTagResponse.Builder::opcRequestId)
                .handleResponseHeaderString("etag", GetTagResponse.Builder::etag)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<GetTagDefaultResponse> getTagDefault(
            GetTagDefaultRequest request,
            final com.oracle.bmc.responses.AsyncHandler<GetTagDefaultRequest, GetTagDefaultResponse>
                    handler) {

        Validate.notBlank(request.getTagDefaultId(), "tagDefaultId must not be blank");

        return clientCall(request, GetTagDefaultResponse::builder)
                .logger(LOG, "getTagDefault")
                .serviceDetails(
                        "Identity",
                        "GetTagDefault",
                        "https://docs.oracle.com/iaas/api/#/en/identity/20160918/TagDefault/GetTagDefault")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetTagDefaultRequest::builder)
                .basePath("/20160918")
                .appendPathParam("tagDefaults")
                .appendPathParam(request.getTagDefaultId())
                .accept("application/json")
                .handleBody(
                        com.oracle.bmc.identity.model.TagDefault.class,
                        GetTagDefaultResponse.Builder::tagDefault)
                .handleResponseHeaderString(
                        "opc-request-id", GetTagDefaultResponse.Builder::opcRequestId)
                .handleResponseHeaderString("etag", GetTagDefaultResponse.Builder::etag)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<GetTagNamespaceResponse> getTagNamespace(
            GetTagNamespaceRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetTagNamespaceRequest, GetTagNamespaceResponse>
                    handler) {

        Validate.notBlank(request.getTagNamespaceId(), "tagNamespaceId must not be blank");

        return clientCall(request, GetTagNamespaceResponse::builder)
                .logger(LOG, "getTagNamespace")
                .serviceDetails(
                        "Identity",
                        "GetTagNamespace",
                        "https://docs.oracle.com/iaas/api/#/en/identity/20160918/TagNamespace/GetTagNamespace")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetTagNamespaceRequest::builder)
                .basePath("/20160918")
                .appendPathParam("tagNamespaces")
                .appendPathParam(request.getTagNamespaceId())
                .accept("application/json")
                .handleBody(
                        com.oracle.bmc.identity.model.TagNamespace.class,
                        GetTagNamespaceResponse.Builder::tagNamespace)
                .handleResponseHeaderString(
                        "opc-request-id", GetTagNamespaceResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<GetTaggingWorkRequestResponse> getTaggingWorkRequest(
            GetTaggingWorkRequestRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetTaggingWorkRequestRequest, GetTaggingWorkRequestResponse>
                    handler) {

        Validate.notBlank(request.getWorkRequestId(), "workRequestId must not be blank");

        return clientCall(request, GetTaggingWorkRequestResponse::builder)
                .logger(LOG, "getTaggingWorkRequest")
                .serviceDetails(
                        "Identity",
                        "GetTaggingWorkRequest",
                        "https://docs.oracle.com/iaas/api/#/en/identity/20160918/TaggingWorkRequest/GetTaggingWorkRequest")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetTaggingWorkRequestRequest::builder)
                .basePath("/20160918")
                .appendPathParam("taggingWorkRequests")
                .appendPathParam(request.getWorkRequestId())
                .accept("application/json")
                .handleBody(
                        com.oracle.bmc.identity.model.TaggingWorkRequest.class,
                        GetTaggingWorkRequestResponse.Builder::taggingWorkRequest)
                .handleResponseHeaderString(
                        "opc-request-id", GetTaggingWorkRequestResponse.Builder::opcRequestId)
                .handleResponseHeaderFloat(
                        "retry-after", GetTaggingWorkRequestResponse.Builder::retryAfter)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<GetTenancyResponse> getTenancy(
            GetTenancyRequest request,
            final com.oracle.bmc.responses.AsyncHandler<GetTenancyRequest, GetTenancyResponse>
                    handler) {

        Validate.notBlank(request.getTenancyId(), "tenancyId must not be blank");

        return clientCall(request, GetTenancyResponse::builder)
                .logger(LOG, "getTenancy")
                .serviceDetails(
                        "Identity",
                        "GetTenancy",
                        "https://docs.oracle.com/iaas/api/#/en/identity/20160918/Tenancy/GetTenancy")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetTenancyRequest::builder)
                .basePath("/20160918")
                .appendPathParam("tenancies")
                .appendPathParam(request.getTenancyId())
                .accept("application/json")
                .handleBody(
                        com.oracle.bmc.identity.model.Tenancy.class,
                        GetTenancyResponse.Builder::tenancy)
                .handleResponseHeaderString(
                        "opc-request-id", GetTenancyResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<GetUserResponse> getUser(
            GetUserRequest request,
            final com.oracle.bmc.responses.AsyncHandler<GetUserRequest, GetUserResponse> handler) {

        Validate.notBlank(request.getUserId(), "userId must not be blank");

        return clientCall(request, GetUserResponse::builder)
                .logger(LOG, "getUser")
                .serviceDetails(
                        "Identity",
                        "GetUser",
                        "https://docs.oracle.com/iaas/api/#/en/identity/20160918/User/GetUser")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetUserRequest::builder)
                .basePath("/20160918")
                .appendPathParam("users")
                .appendPathParam(request.getUserId())
                .accept("application/json")
                .handleBody(com.oracle.bmc.identity.model.User.class, GetUserResponse.Builder::user)
                .handleResponseHeaderString("opc-request-id", GetUserResponse.Builder::opcRequestId)
                .handleResponseHeaderString("etag", GetUserResponse.Builder::etag)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<GetUserGroupMembershipResponse> getUserGroupMembership(
            GetUserGroupMembershipRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetUserGroupMembershipRequest, GetUserGroupMembershipResponse>
                    handler) {

        Validate.notBlank(
                request.getUserGroupMembershipId(), "userGroupMembershipId must not be blank");

        return clientCall(request, GetUserGroupMembershipResponse::builder)
                .logger(LOG, "getUserGroupMembership")
                .serviceDetails(
                        "Identity",
                        "GetUserGroupMembership",
                        "https://docs.oracle.com/iaas/api/#/en/identity/20160918/UserGroupMembership/GetUserGroupMembership")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetUserGroupMembershipRequest::builder)
                .basePath("/20160918")
                .appendPathParam("userGroupMemberships")
                .appendPathParam(request.getUserGroupMembershipId())
                .accept("application/json")
                .handleBody(
                        com.oracle.bmc.identity.model.UserGroupMembership.class,
                        GetUserGroupMembershipResponse.Builder::userGroupMembership)
                .handleResponseHeaderString(
                        "opc-request-id", GetUserGroupMembershipResponse.Builder::opcRequestId)
                .handleResponseHeaderString("etag", GetUserGroupMembershipResponse.Builder::etag)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<GetUserUIPasswordInformationResponse>
            getUserUIPasswordInformation(
                    GetUserUIPasswordInformationRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    GetUserUIPasswordInformationRequest,
                                    GetUserUIPasswordInformationResponse>
                            handler) {

        Validate.notBlank(request.getUserId(), "userId must not be blank");

        return clientCall(request, GetUserUIPasswordInformationResponse::builder)
                .logger(LOG, "getUserUIPasswordInformation")
                .serviceDetails(
                        "Identity",
                        "GetUserUIPasswordInformation",
                        "https://docs.oracle.com/iaas/api/#/en/identity/20160918/UIPasswordInformation/GetUserUIPasswordInformation")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetUserUIPasswordInformationRequest::builder)
                .basePath("/20160918")
                .appendPathParam("users")
                .appendPathParam(request.getUserId())
                .appendPathParam("uiPassword")
                .accept("application/json")
                .handleBody(
                        com.oracle.bmc.identity.model.UIPasswordInformation.class,
                        GetUserUIPasswordInformationResponse.Builder::uIPasswordInformation)
                .handleResponseHeaderString(
                        "opc-request-id",
                        GetUserUIPasswordInformationResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "etag", GetUserUIPasswordInformationResponse.Builder::etag)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<GetWorkRequestResponse> getWorkRequest(
            GetWorkRequestRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetWorkRequestRequest, GetWorkRequestResponse>
                    handler) {

        Validate.notBlank(request.getWorkRequestId(), "workRequestId must not be blank");

        return clientCall(request, GetWorkRequestResponse::builder)
                .logger(LOG, "getWorkRequest")
                .serviceDetails(
                        "Identity",
                        "GetWorkRequest",
                        "https://docs.oracle.com/iaas/api/#/en/identity/20160918/WorkRequest/GetWorkRequest")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetWorkRequestRequest::builder)
                .basePath("/20160918")
                .appendPathParam("workRequests")
                .appendPathParam(request.getWorkRequestId())
                .accept("application/json")
                .handleBody(
                        com.oracle.bmc.identity.model.WorkRequest.class,
                        GetWorkRequestResponse.Builder::workRequest)
                .handleResponseHeaderString(
                        "opc-request-id", GetWorkRequestResponse.Builder::opcRequestId)
                .handleResponseHeaderFloat(
                        "retry-after", GetWorkRequestResponse.Builder::retryAfter)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ImportStandardTagsResponse> importStandardTags(
            ImportStandardTagsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ImportStandardTagsRequest, ImportStandardTagsResponse>
                    handler) {

        return clientCall(request, ImportStandardTagsResponse::builder)
                .logger(LOG, "importStandardTags")
                .serviceDetails(
                        "Identity",
                        "ImportStandardTags",
                        "https://docs.oracle.com/iaas/api/#/en/identity/20160918/Tag/ImportStandardTags")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(ImportStandardTagsRequest::builder)
                .basePath("/20160918")
                .appendPathParam("tags")
                .appendPathParam("actions")
                .appendPathParam("importStandardTags")
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-request-id", ImportStandardTagsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-work-request-id", ImportStandardTagsResponse.Builder::opcWorkRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListAllowedDomainLicenseTypesResponse>
            listAllowedDomainLicenseTypes(
                    ListAllowedDomainLicenseTypesRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ListAllowedDomainLicenseTypesRequest,
                                    ListAllowedDomainLicenseTypesResponse>
                            handler) {

        return clientCall(request, ListAllowedDomainLicenseTypesResponse::builder)
                .logger(LOG, "listAllowedDomainLicenseTypes")
                .serviceDetails(
                        "Identity",
                        "ListAllowedDomainLicenseTypes",
                        "https://docs.oracle.com/iaas/api/#/en/identity/20160918/Domain/ListAllowedDomainLicenseTypes")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListAllowedDomainLicenseTypesRequest::builder)
                .basePath("/20160918")
                .appendPathParam("allowedDomainLicenseTypes")
                .appendQueryParam("currentLicenseTypeName", request.getCurrentLicenseTypeName())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBodyList(
                        com.oracle.bmc.identity.model.AllowedDomainLicenseTypeSummary.class,
                        ListAllowedDomainLicenseTypesResponse.Builder::items)
                .handleResponseHeaderString(
                        "opc-request-id",
                        ListAllowedDomainLicenseTypesResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListAllowedDomainLicenseTypesResponse.Builder::opcNextPage)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListApiKeysResponse> listApiKeys(
            ListApiKeysRequest request,
            final com.oracle.bmc.responses.AsyncHandler<ListApiKeysRequest, ListApiKeysResponse>
                    handler) {

        Validate.notBlank(request.getUserId(), "userId must not be blank");

        return clientCall(request, ListApiKeysResponse::builder)
                .logger(LOG, "listApiKeys")
                .serviceDetails(
                        "Identity",
                        "ListApiKeys",
                        "https://docs.oracle.com/iaas/api/#/en/identity/20160918/ApiKey/ListApiKeys")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListApiKeysRequest::builder)
                .basePath("/20160918")
                .appendPathParam("users")
                .appendPathParam(request.getUserId())
                .appendPathParam("apiKeys")
                .accept("application/json")
                .handleBodyList(
                        com.oracle.bmc.identity.model.ApiKey.class,
                        ListApiKeysResponse.Builder::items)
                .handleResponseHeaderString(
                        "opc-request-id", ListApiKeysResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListApiKeysResponse.Builder::opcNextPage)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListAuthTokensResponse> listAuthTokens(
            ListAuthTokensRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListAuthTokensRequest, ListAuthTokensResponse>
                    handler) {

        Validate.notBlank(request.getUserId(), "userId must not be blank");

        return clientCall(request, ListAuthTokensResponse::builder)
                .logger(LOG, "listAuthTokens")
                .serviceDetails(
                        "Identity",
                        "ListAuthTokens",
                        "https://docs.oracle.com/iaas/api/#/en/identity/20160918/AuthToken/ListAuthTokens")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListAuthTokensRequest::builder)
                .basePath("/20160918")
                .appendPathParam("users")
                .appendPathParam(request.getUserId())
                .appendPathParam("authTokens")
                .accept("application/json")
                .handleBodyList(
                        com.oracle.bmc.identity.model.AuthToken.class,
                        ListAuthTokensResponse.Builder::items)
                .handleResponseHeaderString(
                        "opc-request-id", ListAuthTokensResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListAuthTokensResponse.Builder::opcNextPage)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListAvailabilityDomainsResponse> listAvailabilityDomains(
            ListAvailabilityDomainsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListAvailabilityDomainsRequest, ListAvailabilityDomainsResponse>
                    handler) {
        Objects.requireNonNull(request.getCompartmentId(), "compartmentId is required");

        return clientCall(request, ListAvailabilityDomainsResponse::builder)
                .logger(LOG, "listAvailabilityDomains")
                .serviceDetails(
                        "Identity",
                        "ListAvailabilityDomains",
                        "https://docs.oracle.com/iaas/api/#/en/identity/20160918/AvailabilityDomain/ListAvailabilityDomains")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListAvailabilityDomainsRequest::builder)
                .basePath("/20160918")
                .appendPathParam("availabilityDomains")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .accept("application/json")
                .handleBodyList(
                        com.oracle.bmc.identity.model.AvailabilityDomain.class,
                        ListAvailabilityDomainsResponse.Builder::items)
                .handleResponseHeaderString(
                        "opc-request-id", ListAvailabilityDomainsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListAvailabilityDomainsResponse.Builder::opcNextPage)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListBulkActionResourceTypesResponse>
            listBulkActionResourceTypes(
                    ListBulkActionResourceTypesRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ListBulkActionResourceTypesRequest,
                                    ListBulkActionResourceTypesResponse>
                            handler) {
        Objects.requireNonNull(request.getBulkActionType(), "bulkActionType is required");

        return clientCall(request, ListBulkActionResourceTypesResponse::builder)
                .logger(LOG, "listBulkActionResourceTypes")
                .serviceDetails(
                        "Identity",
                        "ListBulkActionResourceTypes",
                        "https://docs.oracle.com/iaas/api/#/en/identity/20160918/BulkActionResourceTypeCollection/ListBulkActionResourceTypes")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListBulkActionResourceTypesRequest::builder)
                .basePath("/20160918")
                .appendPathParam("compartments")
                .appendPathParam("bulkActionResourceTypes")
                .appendEnumQueryParam("bulkActionType", request.getBulkActionType())
                .appendQueryParam("page", request.getPage())
                .appendQueryParam("limit", request.getLimit())
                .accept("application/json")
                .handleBody(
                        com.oracle.bmc.identity.model.BulkActionResourceTypeCollection.class,
                        ListBulkActionResourceTypesResponse.Builder
                                ::bulkActionResourceTypeCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListBulkActionResourceTypesResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListBulkActionResourceTypesResponse.Builder::opcNextPage)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListBulkEditTagsResourceTypesResponse>
            listBulkEditTagsResourceTypes(
                    ListBulkEditTagsResourceTypesRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ListBulkEditTagsResourceTypesRequest,
                                    ListBulkEditTagsResourceTypesResponse>
                            handler) {

        return clientCall(request, ListBulkEditTagsResourceTypesResponse::builder)
                .logger(LOG, "listBulkEditTagsResourceTypes")
                .serviceDetails(
                        "Identity",
                        "ListBulkEditTagsResourceTypes",
                        "https://docs.oracle.com/iaas/api/#/en/identity/20160918/BulkEditTagsResourceTypeCollection/ListBulkEditTagsResourceTypes")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListBulkEditTagsResourceTypesRequest::builder)
                .basePath("/20160918")
                .appendPathParam("tags")
                .appendPathParam("bulkEditResourceTypes")
                .appendQueryParam("page", request.getPage())
                .appendQueryParam("limit", request.getLimit())
                .accept("application/json")
                .handleBody(
                        com.oracle.bmc.identity.model.BulkEditTagsResourceTypeCollection.class,
                        ListBulkEditTagsResourceTypesResponse.Builder
                                ::bulkEditTagsResourceTypeCollection)
                .handleResponseHeaderString(
                        "opc-request-id",
                        ListBulkEditTagsResourceTypesResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListBulkEditTagsResourceTypesResponse.Builder::opcNextPage)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListCompartmentsResponse> listCompartments(
            ListCompartmentsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListCompartmentsRequest, ListCompartmentsResponse>
                    handler) {
        Objects.requireNonNull(request.getCompartmentId(), "compartmentId is required");

        return clientCall(request, ListCompartmentsResponse::builder)
                .logger(LOG, "listCompartments")
                .serviceDetails(
                        "Identity",
                        "ListCompartments",
                        "https://docs.oracle.com/iaas/api/#/en/identity/20160918/Compartment/ListCompartments")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListCompartmentsRequest::builder)
                .basePath("/20160918")
                .appendPathParam("compartments")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendQueryParam("page", request.getPage())
                .appendQueryParam("limit", request.getLimit())
                .appendEnumQueryParam("accessLevel", request.getAccessLevel())
                .appendQueryParam("compartmentIdInSubtree", request.getCompartmentIdInSubtree())
                .appendQueryParam("name", request.getName())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("lifecycleState", request.getLifecycleState())
                .accept("application/json")
                .handleBodyList(
                        com.oracle.bmc.identity.model.Compartment.class,
                        ListCompartmentsResponse.Builder::items)
                .handleResponseHeaderString(
                        "opc-request-id", ListCompartmentsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListCompartmentsResponse.Builder::opcNextPage)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListCostTrackingTagsResponse> listCostTrackingTags(
            ListCostTrackingTagsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListCostTrackingTagsRequest, ListCostTrackingTagsResponse>
                    handler) {
        Objects.requireNonNull(request.getCompartmentId(), "compartmentId is required");

        return clientCall(request, ListCostTrackingTagsResponse::builder)
                .logger(LOG, "listCostTrackingTags")
                .serviceDetails(
                        "Identity",
                        "ListCostTrackingTags",
                        "https://docs.oracle.com/iaas/api/#/en/identity/20160918/Tag/ListCostTrackingTags")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListCostTrackingTagsRequest::builder)
                .basePath("/20160918")
                .appendPathParam("tagNamespaces")
                .appendPathParam("actions")
                .appendPathParam("listCostTrackingTags")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendQueryParam("page", request.getPage())
                .appendQueryParam("limit", request.getLimit())
                .accept("application/json")
                .handleBodyList(
                        com.oracle.bmc.identity.model.Tag.class,
                        ListCostTrackingTagsResponse.Builder::items)
                .handleResponseHeaderString(
                        "opc-request-id", ListCostTrackingTagsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListCostTrackingTagsResponse.Builder::opcNextPage)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListCustomerSecretKeysResponse> listCustomerSecretKeys(
            ListCustomerSecretKeysRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListCustomerSecretKeysRequest, ListCustomerSecretKeysResponse>
                    handler) {

        Validate.notBlank(request.getUserId(), "userId must not be blank");

        return clientCall(request, ListCustomerSecretKeysResponse::builder)
                .logger(LOG, "listCustomerSecretKeys")
                .serviceDetails(
                        "Identity",
                        "ListCustomerSecretKeys",
                        "https://docs.oracle.com/iaas/api/#/en/identity/20160918/CustomerSecretKeySummary/ListCustomerSecretKeys")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListCustomerSecretKeysRequest::builder)
                .basePath("/20160918")
                .appendPathParam("users")
                .appendPathParam(request.getUserId())
                .appendPathParam("customerSecretKeys")
                .accept("application/json")
                .handleBodyList(
                        com.oracle.bmc.identity.model.CustomerSecretKeySummary.class,
                        ListCustomerSecretKeysResponse.Builder::items)
                .handleResponseHeaderString(
                        "opc-request-id", ListCustomerSecretKeysResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListCustomerSecretKeysResponse.Builder::opcNextPage)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListDbCredentialsResponse> listDbCredentials(
            ListDbCredentialsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListDbCredentialsRequest, ListDbCredentialsResponse>
                    handler) {

        Validate.notBlank(request.getUserId(), "userId must not be blank");

        return clientCall(request, ListDbCredentialsResponse::builder)
                .logger(LOG, "listDbCredentials")
                .serviceDetails(
                        "Identity",
                        "ListDbCredentials",
                        "https://docs.oracle.com/iaas/api/#/en/identity/20160918/User/ListDbCredentials")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListDbCredentialsRequest::builder)
                .basePath("/20160918")
                .appendPathParam("users")
                .appendPathParam(request.getUserId())
                .appendPathParam("dbCredentials")
                .appendQueryParam("page", request.getPage())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("name", request.getName())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("lifecycleState", request.getLifecycleState())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBodyList(
                        com.oracle.bmc.identity.model.DbCredentialSummary.class,
                        ListDbCredentialsResponse.Builder::items)
                .handleResponseHeaderString(
                        "opc-request-id", ListDbCredentialsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListDbCredentialsResponse.Builder::opcNextPage)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListDomainsResponse> listDomains(
            ListDomainsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<ListDomainsRequest, ListDomainsResponse>
                    handler) {
        Objects.requireNonNull(request.getCompartmentId(), "compartmentId is required");

        return clientCall(request, ListDomainsResponse::builder)
                .logger(LOG, "listDomains")
                .serviceDetails(
                        "Identity",
                        "ListDomains",
                        "https://docs.oracle.com/iaas/api/#/en/identity/20160918/DomainSummary/ListDomains")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListDomainsRequest::builder)
                .basePath("/20160918")
                .appendPathParam("domains")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendQueryParam("displayName", request.getDisplayName())
                .appendQueryParam("url", request.getUrl())
                .appendQueryParam("homeRegionUrl", request.getHomeRegionUrl())
                .appendQueryParam("type", request.getType())
                .appendQueryParam("licenseType", request.getLicenseType())
                .appendQueryParam("isHiddenOnLogin", request.getIsHiddenOnLogin())
                .appendQueryParam("page", request.getPage())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("name", request.getName())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("lifecycleState", request.getLifecycleState())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBodyList(
                        com.oracle.bmc.identity.model.DomainSummary.class,
                        ListDomainsResponse.Builder::items)
                .handleResponseHeaderString(
                        "opc-request-id", ListDomainsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListDomainsResponse.Builder::opcNextPage)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListDynamicGroupsResponse> listDynamicGroups(
            ListDynamicGroupsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListDynamicGroupsRequest, ListDynamicGroupsResponse>
                    handler) {
        Objects.requireNonNull(request.getCompartmentId(), "compartmentId is required");

        return clientCall(request, ListDynamicGroupsResponse::builder)
                .logger(LOG, "listDynamicGroups")
                .serviceDetails(
                        "Identity",
                        "ListDynamicGroups",
                        "https://docs.oracle.com/iaas/api/#/en/identity/20160918/DynamicGroup/ListDynamicGroups")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListDynamicGroupsRequest::builder)
                .basePath("/20160918")
                .appendPathParam("dynamicGroups")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendQueryParam("page", request.getPage())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("name", request.getName())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("lifecycleState", request.getLifecycleState())
                .accept("application/json")
                .handleBodyList(
                        com.oracle.bmc.identity.model.DynamicGroup.class,
                        ListDynamicGroupsResponse.Builder::items)
                .handleResponseHeaderString(
                        "opc-request-id", ListDynamicGroupsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListDynamicGroupsResponse.Builder::opcNextPage)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListFaultDomainsResponse> listFaultDomains(
            ListFaultDomainsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListFaultDomainsRequest, ListFaultDomainsResponse>
                    handler) {
        Objects.requireNonNull(request.getCompartmentId(), "compartmentId is required");

        Objects.requireNonNull(request.getAvailabilityDomain(), "availabilityDomain is required");

        return clientCall(request, ListFaultDomainsResponse::builder)
                .logger(LOG, "listFaultDomains")
                .serviceDetails(
                        "Identity",
                        "ListFaultDomains",
                        "https://docs.oracle.com/iaas/api/#/en/identity/20160918/FaultDomain/ListFaultDomains")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListFaultDomainsRequest::builder)
                .basePath("/20160918")
                .appendPathParam("faultDomains")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendQueryParam("availabilityDomain", request.getAvailabilityDomain())
                .accept("application/json")
                .handleBodyList(
                        com.oracle.bmc.identity.model.FaultDomain.class,
                        ListFaultDomainsResponse.Builder::items)
                .handleResponseHeaderString(
                        "opc-request-id", ListFaultDomainsResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListGroupsResponse> listGroups(
            ListGroupsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<ListGroupsRequest, ListGroupsResponse>
                    handler) {
        Objects.requireNonNull(request.getCompartmentId(), "compartmentId is required");

        return clientCall(request, ListGroupsResponse::builder)
                .logger(LOG, "listGroups")
                .serviceDetails(
                        "Identity",
                        "ListGroups",
                        "https://docs.oracle.com/iaas/api/#/en/identity/20160918/Group/ListGroups")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListGroupsRequest::builder)
                .basePath("/20160918")
                .appendPathParam("groups")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendQueryParam("page", request.getPage())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("name", request.getName())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("lifecycleState", request.getLifecycleState())
                .accept("application/json")
                .handleBodyList(
                        com.oracle.bmc.identity.model.Group.class,
                        ListGroupsResponse.Builder::items)
                .handleResponseHeaderString(
                        "opc-request-id", ListGroupsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListGroupsResponse.Builder::opcNextPage)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListIamWorkRequestErrorsResponse> listIamWorkRequestErrors(
            ListIamWorkRequestErrorsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListIamWorkRequestErrorsRequest, ListIamWorkRequestErrorsResponse>
                    handler) {

        Validate.notBlank(request.getIamWorkRequestId(), "iamWorkRequestId must not be blank");

        return clientCall(request, ListIamWorkRequestErrorsResponse::builder)
                .logger(LOG, "listIamWorkRequestErrors")
                .serviceDetails(
                        "Identity",
                        "ListIamWorkRequestErrors",
                        "https://docs.oracle.com/iaas/api/#/en/identity/20160918/IamWorkRequest/ListIamWorkRequestErrors")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListIamWorkRequestErrorsRequest::builder)
                .basePath("/20160918")
                .appendPathParam("iamWorkRequests")
                .appendPathParam(request.getIamWorkRequestId())
                .appendPathParam("errors")
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBodyList(
                        com.oracle.bmc.identity.model.IamWorkRequestErrorSummary.class,
                        ListIamWorkRequestErrorsResponse.Builder::items)
                .handleResponseHeaderString(
                        "opc-next-page", ListIamWorkRequestErrorsResponse.Builder::opcNextPage)
                .handleResponseHeaderString(
                        "opc-request-id", ListIamWorkRequestErrorsResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListIamWorkRequestLogsResponse> listIamWorkRequestLogs(
            ListIamWorkRequestLogsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListIamWorkRequestLogsRequest, ListIamWorkRequestLogsResponse>
                    handler) {

        Validate.notBlank(request.getIamWorkRequestId(), "iamWorkRequestId must not be blank");

        return clientCall(request, ListIamWorkRequestLogsResponse::builder)
                .logger(LOG, "listIamWorkRequestLogs")
                .serviceDetails(
                        "Identity",
                        "ListIamWorkRequestLogs",
                        "https://docs.oracle.com/iaas/api/#/en/identity/20160918/IamWorkRequestLogSummary/ListIamWorkRequestLogs")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListIamWorkRequestLogsRequest::builder)
                .basePath("/20160918")
                .appendPathParam("iamWorkRequests")
                .appendPathParam(request.getIamWorkRequestId())
                .appendPathParam("logs")
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBodyList(
                        com.oracle.bmc.identity.model.IamWorkRequestLogSummary.class,
                        ListIamWorkRequestLogsResponse.Builder::items)
                .handleResponseHeaderString(
                        "opc-request-id", ListIamWorkRequestLogsResponse.Builder::opcRequestId)
                .handleResponseHeaderFloat(
                        "retry-after", ListIamWorkRequestLogsResponse.Builder::retryAfter)
                .handleResponseHeaderString(
                        "opc-next-page", ListIamWorkRequestLogsResponse.Builder::opcNextPage)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListIamWorkRequestsResponse> listIamWorkRequests(
            ListIamWorkRequestsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListIamWorkRequestsRequest, ListIamWorkRequestsResponse>
                    handler) {
        Objects.requireNonNull(request.getCompartmentId(), "compartmentId is required");

        return clientCall(request, ListIamWorkRequestsResponse::builder)
                .logger(LOG, "listIamWorkRequests")
                .serviceDetails(
                        "Identity",
                        "ListIamWorkRequests",
                        "https://docs.oracle.com/iaas/api/#/en/identity/20160918/IamWorkRequestSummary/ListIamWorkRequests")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListIamWorkRequestsRequest::builder)
                .basePath("/20160918")
                .appendPathParam("iamWorkRequests")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendQueryParam("page", request.getPage())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("resourceIdentifier", request.getResourceIdentifier())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBodyList(
                        com.oracle.bmc.identity.model.IamWorkRequestSummary.class,
                        ListIamWorkRequestsResponse.Builder::items)
                .handleResponseHeaderString(
                        "opc-request-id", ListIamWorkRequestsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListIamWorkRequestsResponse.Builder::opcNextPage)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListIdentityProviderGroupsResponse>
            listIdentityProviderGroups(
                    ListIdentityProviderGroupsRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ListIdentityProviderGroupsRequest,
                                    ListIdentityProviderGroupsResponse>
                            handler) {

        Validate.notBlank(request.getIdentityProviderId(), "identityProviderId must not be blank");

        return clientCall(request, ListIdentityProviderGroupsResponse::builder)
                .logger(LOG, "listIdentityProviderGroups")
                .serviceDetails(
                        "Identity",
                        "ListIdentityProviderGroups",
                        "https://docs.oracle.com/iaas/api/#/en/identity/20160918/IdentityProviderGroupSummary/ListIdentityProviderGroups")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListIdentityProviderGroupsRequest::builder)
                .basePath("/20160918")
                .appendPathParam("identityProviders")
                .appendPathParam(request.getIdentityProviderId())
                .appendPathParam("groups")
                .appendQueryParam("page", request.getPage())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("name", request.getName())
                .appendEnumQueryParam("lifecycleState", request.getLifecycleState())
                .accept("application/json")
                .handleBodyList(
                        com.oracle.bmc.identity.model.IdentityProviderGroupSummary.class,
                        ListIdentityProviderGroupsResponse.Builder::items)
                .handleResponseHeaderString(
                        "opc-request-id", ListIdentityProviderGroupsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListIdentityProviderGroupsResponse.Builder::opcNextPage)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListIdentityProvidersResponse> listIdentityProviders(
            ListIdentityProvidersRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListIdentityProvidersRequest, ListIdentityProvidersResponse>
                    handler) {
        Objects.requireNonNull(request.getProtocol(), "protocol is required");

        Objects.requireNonNull(request.getCompartmentId(), "compartmentId is required");

        return clientCall(request, ListIdentityProvidersResponse::builder)
                .logger(LOG, "listIdentityProviders")
                .serviceDetails(
                        "Identity",
                        "ListIdentityProviders",
                        "https://docs.oracle.com/iaas/api/#/en/identity/20160918/IdentityProvider/ListIdentityProviders")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListIdentityProvidersRequest::builder)
                .basePath("/20160918")
                .appendPathParam("identityProviders")
                .appendQueryParam("protocol", request.getProtocol())
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendQueryParam("page", request.getPage())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("name", request.getName())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("lifecycleState", request.getLifecycleState())
                .accept("application/json")
                .handleBodyList(
                        com.oracle.bmc.identity.model.IdentityProvider.class,
                        ListIdentityProvidersResponse.Builder::items)
                .handleResponseHeaderString(
                        "opc-request-id", ListIdentityProvidersResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListIdentityProvidersResponse.Builder::opcNextPage)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListIdpGroupMappingsResponse> listIdpGroupMappings(
            ListIdpGroupMappingsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListIdpGroupMappingsRequest, ListIdpGroupMappingsResponse>
                    handler) {

        Validate.notBlank(request.getIdentityProviderId(), "identityProviderId must not be blank");

        return clientCall(request, ListIdpGroupMappingsResponse::builder)
                .logger(LOG, "listIdpGroupMappings")
                .serviceDetails(
                        "Identity",
                        "ListIdpGroupMappings",
                        "https://docs.oracle.com/iaas/api/#/en/identity/20160918/IdpGroupMapping/ListIdpGroupMappings")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListIdpGroupMappingsRequest::builder)
                .basePath("/20160918")
                .appendPathParam("identityProviders")
                .appendPathParam(request.getIdentityProviderId())
                .appendPathParam("groupMappings")
                .appendQueryParam("page", request.getPage())
                .appendQueryParam("limit", request.getLimit())
                .accept("application/json")
                .handleBodyList(
                        com.oracle.bmc.identity.model.IdpGroupMapping.class,
                        ListIdpGroupMappingsResponse.Builder::items)
                .handleResponseHeaderString(
                        "opc-request-id", ListIdpGroupMappingsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListIdpGroupMappingsResponse.Builder::opcNextPage)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListMfaTotpDevicesResponse> listMfaTotpDevices(
            ListMfaTotpDevicesRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListMfaTotpDevicesRequest, ListMfaTotpDevicesResponse>
                    handler) {

        Validate.notBlank(request.getUserId(), "userId must not be blank");

        return clientCall(request, ListMfaTotpDevicesResponse::builder)
                .logger(LOG, "listMfaTotpDevices")
                .serviceDetails(
                        "Identity",
                        "ListMfaTotpDevices",
                        "https://docs.oracle.com/iaas/api/#/en/identity/20160918/MfaTotpDeviceSummary/ListMfaTotpDevices")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListMfaTotpDevicesRequest::builder)
                .basePath("/20160918")
                .appendPathParam("users")
                .appendPathParam(request.getUserId())
                .appendPathParam("mfaTotpDevices")
                .appendQueryParam("page", request.getPage())
                .appendQueryParam("limit", request.getLimit())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .accept("application/json")
                .handleBodyList(
                        com.oracle.bmc.identity.model.MfaTotpDeviceSummary.class,
                        ListMfaTotpDevicesResponse.Builder::items)
                .handleResponseHeaderString(
                        "opc-request-id", ListMfaTotpDevicesResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListMfaTotpDevicesResponse.Builder::opcNextPage)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListNetworkSourcesResponse> listNetworkSources(
            ListNetworkSourcesRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListNetworkSourcesRequest, ListNetworkSourcesResponse>
                    handler) {
        Objects.requireNonNull(request.getCompartmentId(), "compartmentId is required");

        return clientCall(request, ListNetworkSourcesResponse::builder)
                .logger(LOG, "listNetworkSources")
                .serviceDetails(
                        "Identity",
                        "ListNetworkSources",
                        "https://docs.oracle.com/iaas/api/#/en/identity/20160918/NetworkSourcesSummary/ListNetworkSources")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListNetworkSourcesRequest::builder)
                .basePath("/20160918")
                .appendPathParam("networkSources")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendQueryParam("page", request.getPage())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("name", request.getName())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("lifecycleState", request.getLifecycleState())
                .accept("application/json")
                .handleBodyList(
                        com.oracle.bmc.identity.model.NetworkSourcesSummary.class,
                        ListNetworkSourcesResponse.Builder::items)
                .handleResponseHeaderString(
                        "opc-request-id", ListNetworkSourcesResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListNetworkSourcesResponse.Builder::opcNextPage)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListOAuthClientCredentialsResponse>
            listOAuthClientCredentials(
                    ListOAuthClientCredentialsRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ListOAuthClientCredentialsRequest,
                                    ListOAuthClientCredentialsResponse>
                            handler) {

        Validate.notBlank(request.getUserId(), "userId must not be blank");

        return clientCall(request, ListOAuthClientCredentialsResponse::builder)
                .logger(LOG, "listOAuthClientCredentials")
                .serviceDetails(
                        "Identity",
                        "ListOAuthClientCredentials",
                        "https://docs.oracle.com/iaas/api/#/en/identity/20160918/User/ListOAuthClientCredentials")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListOAuthClientCredentialsRequest::builder)
                .basePath("/20160918")
                .appendPathParam("users")
                .appendPathParam(request.getUserId())
                .appendPathParam("oauth2ClientCredentials")
                .appendQueryParam("page", request.getPage())
                .appendQueryParam("limit", request.getLimit())
                .appendEnumQueryParam("lifecycleState", request.getLifecycleState())
                .accept("application/json")
                .handleBodyList(
                        com.oracle.bmc.identity.model.OAuth2ClientCredentialSummary.class,
                        ListOAuthClientCredentialsResponse.Builder::items)
                .handleResponseHeaderString(
                        "opc-request-id", ListOAuthClientCredentialsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListOAuthClientCredentialsResponse.Builder::opcNextPage)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListPoliciesResponse> listPolicies(
            ListPoliciesRequest request,
            final com.oracle.bmc.responses.AsyncHandler<ListPoliciesRequest, ListPoliciesResponse>
                    handler) {
        Objects.requireNonNull(request.getCompartmentId(), "compartmentId is required");

        return clientCall(request, ListPoliciesResponse::builder)
                .logger(LOG, "listPolicies")
                .serviceDetails(
                        "Identity",
                        "ListPolicies",
                        "https://docs.oracle.com/iaas/api/#/en/identity/20160918/Policy/ListPolicies")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListPoliciesRequest::builder)
                .basePath("/20160918")
                .appendPathParam("policies")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendQueryParam("page", request.getPage())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("name", request.getName())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("lifecycleState", request.getLifecycleState())
                .accept("application/json")
                .handleBodyList(
                        com.oracle.bmc.identity.model.Policy.class,
                        ListPoliciesResponse.Builder::items)
                .handleResponseHeaderString(
                        "opc-request-id", ListPoliciesResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListPoliciesResponse.Builder::opcNextPage)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListRegionSubscriptionsResponse> listRegionSubscriptions(
            ListRegionSubscriptionsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListRegionSubscriptionsRequest, ListRegionSubscriptionsResponse>
                    handler) {

        Validate.notBlank(request.getTenancyId(), "tenancyId must not be blank");

        return clientCall(request, ListRegionSubscriptionsResponse::builder)
                .logger(LOG, "listRegionSubscriptions")
                .serviceDetails(
                        "Identity",
                        "ListRegionSubscriptions",
                        "https://docs.oracle.com/iaas/api/#/en/identity/20160918/RegionSubscription/ListRegionSubscriptions")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListRegionSubscriptionsRequest::builder)
                .basePath("/20160918")
                .appendPathParam("tenancies")
                .appendPathParam(request.getTenancyId())
                .appendPathParam("regionSubscriptions")
                .accept("application/json")
                .handleBodyList(
                        com.oracle.bmc.identity.model.RegionSubscription.class,
                        ListRegionSubscriptionsResponse.Builder::items)
                .handleResponseHeaderString(
                        "opc-request-id", ListRegionSubscriptionsResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListRegionsResponse> listRegions(
            ListRegionsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<ListRegionsRequest, ListRegionsResponse>
                    handler) {

        return clientCall(request, ListRegionsResponse::builder)
                .logger(LOG, "listRegions")
                .serviceDetails(
                        "Identity",
                        "ListRegions",
                        "https://docs.oracle.com/iaas/api/#/en/identity/20160918/Region/ListRegions")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListRegionsRequest::builder)
                .basePath("/20160918")
                .appendPathParam("regions")
                .accept("application/json")
                .handleBodyList(
                        com.oracle.bmc.identity.model.Region.class,
                        ListRegionsResponse.Builder::items)
                .handleResponseHeaderString(
                        "opc-request-id", ListRegionsResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListSmtpCredentialsResponse> listSmtpCredentials(
            ListSmtpCredentialsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListSmtpCredentialsRequest, ListSmtpCredentialsResponse>
                    handler) {

        Validate.notBlank(request.getUserId(), "userId must not be blank");

        return clientCall(request, ListSmtpCredentialsResponse::builder)
                .logger(LOG, "listSmtpCredentials")
                .serviceDetails(
                        "Identity",
                        "ListSmtpCredentials",
                        "https://docs.oracle.com/iaas/api/#/en/identity/20160918/SmtpCredentialSummary/ListSmtpCredentials")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListSmtpCredentialsRequest::builder)
                .basePath("/20160918")
                .appendPathParam("users")
                .appendPathParam(request.getUserId())
                .appendPathParam("smtpCredentials")
                .accept("application/json")
                .handleBodyList(
                        com.oracle.bmc.identity.model.SmtpCredentialSummary.class,
                        ListSmtpCredentialsResponse.Builder::items)
                .handleResponseHeaderString(
                        "opc-request-id", ListSmtpCredentialsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListSmtpCredentialsResponse.Builder::opcNextPage)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListStandardTagNamespacesResponse> listStandardTagNamespaces(
            ListStandardTagNamespacesRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListStandardTagNamespacesRequest, ListStandardTagNamespacesResponse>
                    handler) {
        Objects.requireNonNull(request.getCompartmentId(), "compartmentId is required");

        return clientCall(request, ListStandardTagNamespacesResponse::builder)
                .logger(LOG, "listStandardTagNamespaces")
                .serviceDetails(
                        "Identity",
                        "ListStandardTagNamespaces",
                        "https://docs.oracle.com/iaas/api/#/en/identity/20160918/StandardTagNamespaceTemplateSummary/ListStandardTagNamespaces")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListStandardTagNamespacesRequest::builder)
                .basePath("/20160918")
                .appendPathParam("tags")
                .appendPathParam("standardTagNamespaceTemplates")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendQueryParam("page", request.getPage())
                .appendQueryParam("limit", request.getLimit())
                .accept("application/json")
                .handleBodyList(
                        com.oracle.bmc.identity.model.StandardTagNamespaceTemplateSummary.class,
                        ListStandardTagNamespacesResponse.Builder::items)
                .handleResponseHeaderString(
                        "opc-request-id", ListStandardTagNamespacesResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListStandardTagNamespacesResponse.Builder::opcNextPage)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListSwiftPasswordsResponse> listSwiftPasswords(
            ListSwiftPasswordsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListSwiftPasswordsRequest, ListSwiftPasswordsResponse>
                    handler) {

        Validate.notBlank(request.getUserId(), "userId must not be blank");

        return clientCall(request, ListSwiftPasswordsResponse::builder)
                .logger(LOG, "listSwiftPasswords")
                .serviceDetails(
                        "Identity",
                        "ListSwiftPasswords",
                        "https://docs.oracle.com/iaas/api/#/en/identity/20160918/SwiftPassword/ListSwiftPasswords")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListSwiftPasswordsRequest::builder)
                .basePath("/20160918")
                .appendPathParam("users")
                .appendPathParam(request.getUserId())
                .appendPathParam("swiftPasswords")
                .accept("application/json")
                .handleBodyList(
                        com.oracle.bmc.identity.model.SwiftPassword.class,
                        ListSwiftPasswordsResponse.Builder::items)
                .handleResponseHeaderString(
                        "opc-request-id", ListSwiftPasswordsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListSwiftPasswordsResponse.Builder::opcNextPage)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListTagDefaultsResponse> listTagDefaults(
            ListTagDefaultsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListTagDefaultsRequest, ListTagDefaultsResponse>
                    handler) {

        return clientCall(request, ListTagDefaultsResponse::builder)
                .logger(LOG, "listTagDefaults")
                .serviceDetails(
                        "Identity",
                        "ListTagDefaults",
                        "https://docs.oracle.com/iaas/api/#/en/identity/20160918/TagDefaultSummary/ListTagDefaults")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListTagDefaultsRequest::builder)
                .basePath("/20160918")
                .appendPathParam("tagDefaults")
                .appendQueryParam("page", request.getPage())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("id", request.getId())
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendQueryParam("tagDefinitionId", request.getTagDefinitionId())
                .appendEnumQueryParam("lifecycleState", request.getLifecycleState())
                .accept("application/json")
                .handleBodyList(
                        com.oracle.bmc.identity.model.TagDefaultSummary.class,
                        ListTagDefaultsResponse.Builder::items)
                .handleResponseHeaderString(
                        "opc-request-id", ListTagDefaultsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListTagDefaultsResponse.Builder::opcNextPage)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListTagNamespacesResponse> listTagNamespaces(
            ListTagNamespacesRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListTagNamespacesRequest, ListTagNamespacesResponse>
                    handler) {
        Objects.requireNonNull(request.getCompartmentId(), "compartmentId is required");

        return clientCall(request, ListTagNamespacesResponse::builder)
                .logger(LOG, "listTagNamespaces")
                .serviceDetails(
                        "Identity",
                        "ListTagNamespaces",
                        "https://docs.oracle.com/iaas/api/#/en/identity/20160918/TagNamespaceSummary/ListTagNamespaces")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListTagNamespacesRequest::builder)
                .basePath("/20160918")
                .appendPathParam("tagNamespaces")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendQueryParam("page", request.getPage())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("includeSubcompartments", request.getIncludeSubcompartments())
                .appendEnumQueryParam("lifecycleState", request.getLifecycleState())
                .accept("application/json")
                .handleBodyList(
                        com.oracle.bmc.identity.model.TagNamespaceSummary.class,
                        ListTagNamespacesResponse.Builder::items)
                .handleResponseHeaderString(
                        "opc-request-id", ListTagNamespacesResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListTagNamespacesResponse.Builder::opcNextPage)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListTaggingWorkRequestErrorsResponse>
            listTaggingWorkRequestErrors(
                    ListTaggingWorkRequestErrorsRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ListTaggingWorkRequestErrorsRequest,
                                    ListTaggingWorkRequestErrorsResponse>
                            handler) {

        Validate.notBlank(request.getWorkRequestId(), "workRequestId must not be blank");

        return clientCall(request, ListTaggingWorkRequestErrorsResponse::builder)
                .logger(LOG, "listTaggingWorkRequestErrors")
                .serviceDetails(
                        "Identity",
                        "ListTaggingWorkRequestErrors",
                        "https://docs.oracle.com/iaas/api/#/en/identity/20160918/TaggingWorkRequestErrorSummary/ListTaggingWorkRequestErrors")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListTaggingWorkRequestErrorsRequest::builder)
                .basePath("/20160918")
                .appendPathParam("taggingWorkRequests")
                .appendPathParam(request.getWorkRequestId())
                .appendPathParam("errors")
                .appendQueryParam("page", request.getPage())
                .appendQueryParam("limit", request.getLimit())
                .accept("application/json")
                .handleBodyList(
                        com.oracle.bmc.identity.model.TaggingWorkRequestErrorSummary.class,
                        ListTaggingWorkRequestErrorsResponse.Builder::items)
                .handleResponseHeaderString(
                        "opc-request-id",
                        ListTaggingWorkRequestErrorsResponse.Builder::opcRequestId)
                .handleResponseHeaderFloat(
                        "retry-after", ListTaggingWorkRequestErrorsResponse.Builder::retryAfter)
                .handleResponseHeaderString(
                        "opc-next-page", ListTaggingWorkRequestErrorsResponse.Builder::opcNextPage)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListTaggingWorkRequestLogsResponse>
            listTaggingWorkRequestLogs(
                    ListTaggingWorkRequestLogsRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ListTaggingWorkRequestLogsRequest,
                                    ListTaggingWorkRequestLogsResponse>
                            handler) {

        Validate.notBlank(request.getWorkRequestId(), "workRequestId must not be blank");

        return clientCall(request, ListTaggingWorkRequestLogsResponse::builder)
                .logger(LOG, "listTaggingWorkRequestLogs")
                .serviceDetails(
                        "Identity",
                        "ListTaggingWorkRequestLogs",
                        "https://docs.oracle.com/iaas/api/#/en/identity/20160918/TaggingWorkRequestLogSummary/ListTaggingWorkRequestLogs")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListTaggingWorkRequestLogsRequest::builder)
                .basePath("/20160918")
                .appendPathParam("taggingWorkRequests")
                .appendPathParam(request.getWorkRequestId())
                .appendPathParam("logs")
                .appendQueryParam("page", request.getPage())
                .appendQueryParam("limit", request.getLimit())
                .accept("application/json")
                .handleBodyList(
                        com.oracle.bmc.identity.model.TaggingWorkRequestLogSummary.class,
                        ListTaggingWorkRequestLogsResponse.Builder::items)
                .handleResponseHeaderString(
                        "opc-request-id", ListTaggingWorkRequestLogsResponse.Builder::opcRequestId)
                .handleResponseHeaderFloat(
                        "retry-after", ListTaggingWorkRequestLogsResponse.Builder::retryAfter)
                .handleResponseHeaderString(
                        "opc-next-page", ListTaggingWorkRequestLogsResponse.Builder::opcNextPage)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListTaggingWorkRequestsResponse> listTaggingWorkRequests(
            ListTaggingWorkRequestsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListTaggingWorkRequestsRequest, ListTaggingWorkRequestsResponse>
                    handler) {
        Objects.requireNonNull(request.getCompartmentId(), "compartmentId is required");

        return clientCall(request, ListTaggingWorkRequestsResponse::builder)
                .logger(LOG, "listTaggingWorkRequests")
                .serviceDetails(
                        "Identity",
                        "ListTaggingWorkRequests",
                        "https://docs.oracle.com/iaas/api/#/en/identity/20160918/TaggingWorkRequestSummary/ListTaggingWorkRequests")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListTaggingWorkRequestsRequest::builder)
                .basePath("/20160918")
                .appendPathParam("taggingWorkRequests")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendQueryParam("page", request.getPage())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("resourceIdentifier", request.getResourceIdentifier())
                .accept("application/json")
                .handleBodyList(
                        com.oracle.bmc.identity.model.TaggingWorkRequestSummary.class,
                        ListTaggingWorkRequestsResponse.Builder::items)
                .handleResponseHeaderString(
                        "opc-request-id", ListTaggingWorkRequestsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListTaggingWorkRequestsResponse.Builder::opcNextPage)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListTagsResponse> listTags(
            ListTagsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<ListTagsRequest, ListTagsResponse>
                    handler) {

        Validate.notBlank(request.getTagNamespaceId(), "tagNamespaceId must not be blank");

        return clientCall(request, ListTagsResponse::builder)
                .logger(LOG, "listTags")
                .serviceDetails(
                        "Identity",
                        "ListTags",
                        "https://docs.oracle.com/iaas/api/#/en/identity/20160918/TagSummary/ListTags")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListTagsRequest::builder)
                .basePath("/20160918")
                .appendPathParam("tagNamespaces")
                .appendPathParam(request.getTagNamespaceId())
                .appendPathParam("tags")
                .appendQueryParam("page", request.getPage())
                .appendQueryParam("limit", request.getLimit())
                .appendEnumQueryParam("lifecycleState", request.getLifecycleState())
                .accept("application/json")
                .handleBodyList(
                        com.oracle.bmc.identity.model.TagSummary.class,
                        ListTagsResponse.Builder::items)
                .handleResponseHeaderString(
                        "opc-request-id", ListTagsResponse.Builder::opcRequestId)
                .handleResponseHeaderString("opc-next-page", ListTagsResponse.Builder::opcNextPage)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListUserGroupMembershipsResponse> listUserGroupMemberships(
            ListUserGroupMembershipsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListUserGroupMembershipsRequest, ListUserGroupMembershipsResponse>
                    handler) {
        Objects.requireNonNull(request.getCompartmentId(), "compartmentId is required");

        return clientCall(request, ListUserGroupMembershipsResponse::builder)
                .logger(LOG, "listUserGroupMemberships")
                .serviceDetails(
                        "Identity",
                        "ListUserGroupMemberships",
                        "https://docs.oracle.com/iaas/api/#/en/identity/20160918/UserGroupMembership/ListUserGroupMemberships")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListUserGroupMembershipsRequest::builder)
                .basePath("/20160918")
                .appendPathParam("userGroupMemberships")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendQueryParam("userId", request.getUserId())
                .appendQueryParam("groupId", request.getGroupId())
                .appendQueryParam("page", request.getPage())
                .appendQueryParam("limit", request.getLimit())
                .accept("application/json")
                .handleBodyList(
                        com.oracle.bmc.identity.model.UserGroupMembership.class,
                        ListUserGroupMembershipsResponse.Builder::items)
                .handleResponseHeaderString(
                        "opc-request-id", ListUserGroupMembershipsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListUserGroupMembershipsResponse.Builder::opcNextPage)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListUsersResponse> listUsers(
            ListUsersRequest request,
            final com.oracle.bmc.responses.AsyncHandler<ListUsersRequest, ListUsersResponse>
                    handler) {
        Objects.requireNonNull(request.getCompartmentId(), "compartmentId is required");

        return clientCall(request, ListUsersResponse::builder)
                .logger(LOG, "listUsers")
                .serviceDetails(
                        "Identity",
                        "ListUsers",
                        "https://docs.oracle.com/iaas/api/#/en/identity/20160918/User/ListUsers")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListUsersRequest::builder)
                .basePath("/20160918")
                .appendPathParam("users")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendQueryParam("page", request.getPage())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("identityProviderId", request.getIdentityProviderId())
                .appendQueryParam("externalIdentifier", request.getExternalIdentifier())
                .appendQueryParam("name", request.getName())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("lifecycleState", request.getLifecycleState())
                .accept("application/json")
                .handleBodyList(
                        com.oracle.bmc.identity.model.User.class, ListUsersResponse.Builder::items)
                .handleResponseHeaderString(
                        "opc-request-id", ListUsersResponse.Builder::opcRequestId)
                .handleResponseHeaderString("opc-next-page", ListUsersResponse.Builder::opcNextPage)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListWorkRequestsResponse> listWorkRequests(
            ListWorkRequestsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListWorkRequestsRequest, ListWorkRequestsResponse>
                    handler) {
        Objects.requireNonNull(request.getCompartmentId(), "compartmentId is required");

        return clientCall(request, ListWorkRequestsResponse::builder)
                .logger(LOG, "listWorkRequests")
                .serviceDetails(
                        "Identity",
                        "ListWorkRequests",
                        "https://docs.oracle.com/iaas/api/#/en/identity/20160918/WorkRequestSummary/ListWorkRequests")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListWorkRequestsRequest::builder)
                .basePath("/20160918")
                .appendPathParam("workRequests")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendQueryParam("page", request.getPage())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("resourceIdentifier", request.getResourceIdentifier())
                .accept("application/json")
                .handleBodyList(
                        com.oracle.bmc.identity.model.WorkRequestSummary.class,
                        ListWorkRequestsResponse.Builder::items)
                .handleResponseHeaderString(
                        "opc-request-id", ListWorkRequestsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListWorkRequestsResponse.Builder::opcNextPage)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<MoveCompartmentResponse> moveCompartment(
            MoveCompartmentRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            MoveCompartmentRequest, MoveCompartmentResponse>
                    handler) {

        Validate.notBlank(request.getCompartmentId(), "compartmentId must not be blank");
        Objects.requireNonNull(
                request.getMoveCompartmentDetails(), "moveCompartmentDetails is required");

        return clientCall(request, MoveCompartmentResponse::builder)
                .logger(LOG, "moveCompartment")
                .serviceDetails(
                        "Identity",
                        "MoveCompartment",
                        "https://docs.oracle.com/iaas/api/#/en/identity/20160918/Compartment/MoveCompartment")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(MoveCompartmentRequest::builder)
                .basePath("/20160918")
                .appendPathParam("compartments")
                .appendPathParam(request.getCompartmentId())
                .appendPathParam("actions")
                .appendPathParam("moveCompartment")
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-request-id", MoveCompartmentResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-work-request-id", MoveCompartmentResponse.Builder::opcWorkRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<RecoverCompartmentResponse> recoverCompartment(
            RecoverCompartmentRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            RecoverCompartmentRequest, RecoverCompartmentResponse>
                    handler) {

        Validate.notBlank(request.getCompartmentId(), "compartmentId must not be blank");

        return clientCall(request, RecoverCompartmentResponse::builder)
                .logger(LOG, "recoverCompartment")
                .serviceDetails(
                        "Identity",
                        "RecoverCompartment",
                        "https://docs.oracle.com/iaas/api/#/en/identity/20160918/Compartment/RecoverCompartment")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(RecoverCompartmentRequest::builder)
                .basePath("/20160918")
                .appendPathParam("compartments")
                .appendPathParam(request.getCompartmentId())
                .appendPathParam("actions")
                .appendPathParam("recoverCompartment")
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.identity.model.Compartment.class,
                        RecoverCompartmentResponse.Builder::compartment)
                .handleResponseHeaderString(
                        "opc-request-id", RecoverCompartmentResponse.Builder::opcRequestId)
                .handleResponseHeaderString("etag", RecoverCompartmentResponse.Builder::etag)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<RemoveTagDefaultLockResponse> removeTagDefaultLock(
            RemoveTagDefaultLockRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            RemoveTagDefaultLockRequest, RemoveTagDefaultLockResponse>
                    handler) {

        Validate.notBlank(request.getTagDefaultId(), "tagDefaultId must not be blank");
        Objects.requireNonNull(request.getRemoveLockDetails(), "removeLockDetails is required");

        return clientCall(request, RemoveTagDefaultLockResponse::builder)
                .logger(LOG, "removeTagDefaultLock")
                .serviceDetails(
                        "Identity",
                        "RemoveTagDefaultLock",
                        "https://docs.oracle.com/iaas/api/#/en/identity/20160918/TagDefault/RemoveTagDefaultLock")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(RemoveTagDefaultLockRequest::builder)
                .basePath("/20160918")
                .appendPathParam("tagDefaults")
                .appendPathParam(request.getTagDefaultId())
                .appendPathParam("actions")
                .appendPathParam("removeLock")
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.identity.model.TagDefault.class,
                        RemoveTagDefaultLockResponse.Builder::tagDefault)
                .handleResponseHeaderString(
                        "opc-request-id", RemoveTagDefaultLockResponse.Builder::opcRequestId)
                .handleResponseHeaderString("etag", RemoveTagDefaultLockResponse.Builder::etag)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<RemoveTagNamespaceLockResponse> removeTagNamespaceLock(
            RemoveTagNamespaceLockRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            RemoveTagNamespaceLockRequest, RemoveTagNamespaceLockResponse>
                    handler) {

        Validate.notBlank(request.getTagNamespaceId(), "tagNamespaceId must not be blank");
        Objects.requireNonNull(request.getRemoveLockDetails(), "removeLockDetails is required");

        return clientCall(request, RemoveTagNamespaceLockResponse::builder)
                .logger(LOG, "removeTagNamespaceLock")
                .serviceDetails(
                        "Identity",
                        "RemoveTagNamespaceLock",
                        "https://docs.oracle.com/iaas/api/#/en/identity/20160918/TagNamespace/RemoveTagNamespaceLock")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(RemoveTagNamespaceLockRequest::builder)
                .basePath("/20160918")
                .appendPathParam("tagNamespaces")
                .appendPathParam(request.getTagNamespaceId())
                .appendPathParam("actions")
                .appendPathParam("removeLock")
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.identity.model.TagNamespace.class,
                        RemoveTagNamespaceLockResponse.Builder::tagNamespace)
                .handleResponseHeaderString(
                        "opc-request-id", RemoveTagNamespaceLockResponse.Builder::opcRequestId)
                .handleResponseHeaderString("etag", RemoveTagNamespaceLockResponse.Builder::etag)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<RemoveUserFromGroupResponse> removeUserFromGroup(
            RemoveUserFromGroupRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            RemoveUserFromGroupRequest, RemoveUserFromGroupResponse>
                    handler) {

        Validate.notBlank(
                request.getUserGroupMembershipId(), "userGroupMembershipId must not be blank");

        return clientCall(request, RemoveUserFromGroupResponse::builder)
                .logger(LOG, "removeUserFromGroup")
                .serviceDetails(
                        "Identity",
                        "RemoveUserFromGroup",
                        "https://docs.oracle.com/iaas/api/#/en/identity/20160918/UserGroupMembership/RemoveUserFromGroup")
                .method(com.oracle.bmc.http.client.Method.DELETE)
                .requestBuilder(RemoveUserFromGroupRequest::builder)
                .basePath("/20160918")
                .appendPathParam("userGroupMemberships")
                .appendPathParam(request.getUserGroupMembershipId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .handleResponseHeaderString(
                        "opc-request-id", RemoveUserFromGroupResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ResetIdpScimClientResponse> resetIdpScimClient(
            ResetIdpScimClientRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ResetIdpScimClientRequest, ResetIdpScimClientResponse>
                    handler) {

        Validate.notBlank(request.getIdentityProviderId(), "identityProviderId must not be blank");

        return clientCall(request, ResetIdpScimClientResponse::builder)
                .logger(LOG, "resetIdpScimClient")
                .serviceDetails(
                        "Identity",
                        "ResetIdpScimClient",
                        "https://docs.oracle.com/iaas/api/#/en/identity/20160918/ScimClientCredentials/ResetIdpScimClient")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(ResetIdpScimClientRequest::builder)
                .basePath("/20160918")
                .appendPathParam("identityProviders")
                .appendPathParam(request.getIdentityProviderId())
                .appendPathParam("actions")
                .appendPathParam("resetScimClient")
                .accept("application/json")
                .handleBody(
                        com.oracle.bmc.identity.model.ScimClientCredentials.class,
                        ResetIdpScimClientResponse.Builder::scimClientCredentials)
                .handleResponseHeaderString(
                        "opc-request-id", ResetIdpScimClientResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<UpdateAuthTokenResponse> updateAuthToken(
            UpdateAuthTokenRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            UpdateAuthTokenRequest, UpdateAuthTokenResponse>
                    handler) {

        Validate.notBlank(request.getUserId(), "userId must not be blank");

        Validate.notBlank(request.getAuthTokenId(), "authTokenId must not be blank");
        Objects.requireNonNull(
                request.getUpdateAuthTokenDetails(), "updateAuthTokenDetails is required");

        return clientCall(request, UpdateAuthTokenResponse::builder)
                .logger(LOG, "updateAuthToken")
                .serviceDetails(
                        "Identity",
                        "UpdateAuthToken",
                        "https://docs.oracle.com/iaas/api/#/en/identity/20160918/AuthToken/UpdateAuthToken")
                .method(com.oracle.bmc.http.client.Method.PUT)
                .requestBuilder(UpdateAuthTokenRequest::builder)
                .basePath("/20160918")
                .appendPathParam("users")
                .appendPathParam(request.getUserId())
                .appendPathParam("authTokens")
                .appendPathParam(request.getAuthTokenId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.identity.model.AuthToken.class,
                        UpdateAuthTokenResponse.Builder::authToken)
                .handleResponseHeaderString(
                        "opc-request-id", UpdateAuthTokenResponse.Builder::opcRequestId)
                .handleResponseHeaderString("etag", UpdateAuthTokenResponse.Builder::etag)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<UpdateAuthenticationPolicyResponse>
            updateAuthenticationPolicy(
                    UpdateAuthenticationPolicyRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    UpdateAuthenticationPolicyRequest,
                                    UpdateAuthenticationPolicyResponse>
                            handler) {

        Validate.notBlank(request.getCompartmentId(), "compartmentId must not be blank");
        Objects.requireNonNull(
                request.getUpdateAuthenticationPolicyDetails(),
                "updateAuthenticationPolicyDetails is required");

        return clientCall(request, UpdateAuthenticationPolicyResponse::builder)
                .logger(LOG, "updateAuthenticationPolicy")
                .serviceDetails(
                        "Identity",
                        "UpdateAuthenticationPolicy",
                        "https://docs.oracle.com/iaas/api/#/en/identity/20160918/AuthenticationPolicy/UpdateAuthenticationPolicy")
                .method(com.oracle.bmc.http.client.Method.PUT)
                .requestBuilder(UpdateAuthenticationPolicyRequest::builder)
                .basePath("/20160918")
                .appendPathParam("authenticationPolicies")
                .appendPathParam(request.getCompartmentId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.identity.model.AuthenticationPolicy.class,
                        UpdateAuthenticationPolicyResponse.Builder::authenticationPolicy)
                .handleResponseHeaderString(
                        "opc-request-id", UpdateAuthenticationPolicyResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "etag", UpdateAuthenticationPolicyResponse.Builder::etag)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<UpdateCompartmentResponse> updateCompartment(
            UpdateCompartmentRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            UpdateCompartmentRequest, UpdateCompartmentResponse>
                    handler) {

        Validate.notBlank(request.getCompartmentId(), "compartmentId must not be blank");
        Objects.requireNonNull(
                request.getUpdateCompartmentDetails(), "updateCompartmentDetails is required");

        return clientCall(request, UpdateCompartmentResponse::builder)
                .logger(LOG, "updateCompartment")
                .serviceDetails(
                        "Identity",
                        "UpdateCompartment",
                        "https://docs.oracle.com/iaas/api/#/en/identity/20160918/Compartment/UpdateCompartment")
                .method(com.oracle.bmc.http.client.Method.PUT)
                .requestBuilder(UpdateCompartmentRequest::builder)
                .basePath("/20160918")
                .appendPathParam("compartments")
                .appendPathParam(request.getCompartmentId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.identity.model.Compartment.class,
                        UpdateCompartmentResponse.Builder::compartment)
                .handleResponseHeaderString(
                        "opc-request-id", UpdateCompartmentResponse.Builder::opcRequestId)
                .handleResponseHeaderString("etag", UpdateCompartmentResponse.Builder::etag)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<UpdateCustomerSecretKeyResponse> updateCustomerSecretKey(
            UpdateCustomerSecretKeyRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            UpdateCustomerSecretKeyRequest, UpdateCustomerSecretKeyResponse>
                    handler) {

        Validate.notBlank(request.getUserId(), "userId must not be blank");

        Validate.notBlank(
                request.getCustomerSecretKeyId(), "customerSecretKeyId must not be blank");
        Objects.requireNonNull(
                request.getUpdateCustomerSecretKeyDetails(),
                "updateCustomerSecretKeyDetails is required");

        return clientCall(request, UpdateCustomerSecretKeyResponse::builder)
                .logger(LOG, "updateCustomerSecretKey")
                .serviceDetails(
                        "Identity",
                        "UpdateCustomerSecretKey",
                        "https://docs.oracle.com/iaas/api/#/en/identity/20160918/CustomerSecretKeySummary/UpdateCustomerSecretKey")
                .method(com.oracle.bmc.http.client.Method.PUT)
                .requestBuilder(UpdateCustomerSecretKeyRequest::builder)
                .basePath("/20160918")
                .appendPathParam("users")
                .appendPathParam(request.getUserId())
                .appendPathParam("customerSecretKeys")
                .appendPathParam(request.getCustomerSecretKeyId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.identity.model.CustomerSecretKeySummary.class,
                        UpdateCustomerSecretKeyResponse.Builder::customerSecretKeySummary)
                .handleResponseHeaderString(
                        "opc-request-id", UpdateCustomerSecretKeyResponse.Builder::opcRequestId)
                .handleResponseHeaderString("etag", UpdateCustomerSecretKeyResponse.Builder::etag)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<UpdateDomainResponse> updateDomain(
            UpdateDomainRequest request,
            final com.oracle.bmc.responses.AsyncHandler<UpdateDomainRequest, UpdateDomainResponse>
                    handler) {

        Validate.notBlank(request.getDomainId(), "domainId must not be blank");
        Objects.requireNonNull(request.getUpdateDomainDetails(), "updateDomainDetails is required");

        return clientCall(request, UpdateDomainResponse::builder)
                .logger(LOG, "updateDomain")
                .serviceDetails(
                        "Identity",
                        "UpdateDomain",
                        "https://docs.oracle.com/iaas/api/#/en/identity/20160918/Domain/UpdateDomain")
                .method(com.oracle.bmc.http.client.Method.PUT)
                .requestBuilder(UpdateDomainRequest::builder)
                .basePath("/20160918")
                .appendPathParam("domains")
                .appendPathParam(request.getDomainId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-request-id", UpdateDomainResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-work-request-id", UpdateDomainResponse.Builder::opcWorkRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<UpdateDynamicGroupResponse> updateDynamicGroup(
            UpdateDynamicGroupRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            UpdateDynamicGroupRequest, UpdateDynamicGroupResponse>
                    handler) {

        Validate.notBlank(request.getDynamicGroupId(), "dynamicGroupId must not be blank");
        Objects.requireNonNull(
                request.getUpdateDynamicGroupDetails(), "updateDynamicGroupDetails is required");

        return clientCall(request, UpdateDynamicGroupResponse::builder)
                .logger(LOG, "updateDynamicGroup")
                .serviceDetails(
                        "Identity",
                        "UpdateDynamicGroup",
                        "https://docs.oracle.com/iaas/api/#/en/identity/20160918/DynamicGroup/UpdateDynamicGroup")
                .method(com.oracle.bmc.http.client.Method.PUT)
                .requestBuilder(UpdateDynamicGroupRequest::builder)
                .basePath("/20160918")
                .appendPathParam("dynamicGroups")
                .appendPathParam(request.getDynamicGroupId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.identity.model.DynamicGroup.class,
                        UpdateDynamicGroupResponse.Builder::dynamicGroup)
                .handleResponseHeaderString(
                        "opc-request-id", UpdateDynamicGroupResponse.Builder::opcRequestId)
                .handleResponseHeaderString("etag", UpdateDynamicGroupResponse.Builder::etag)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<UpdateGroupResponse> updateGroup(
            UpdateGroupRequest request,
            final com.oracle.bmc.responses.AsyncHandler<UpdateGroupRequest, UpdateGroupResponse>
                    handler) {

        Validate.notBlank(request.getGroupId(), "groupId must not be blank");
        Objects.requireNonNull(request.getUpdateGroupDetails(), "updateGroupDetails is required");

        return clientCall(request, UpdateGroupResponse::builder)
                .logger(LOG, "updateGroup")
                .serviceDetails(
                        "Identity",
                        "UpdateGroup",
                        "https://docs.oracle.com/iaas/api/#/en/identity/20160918/Group/UpdateGroup")
                .method(com.oracle.bmc.http.client.Method.PUT)
                .requestBuilder(UpdateGroupRequest::builder)
                .basePath("/20160918")
                .appendPathParam("groups")
                .appendPathParam(request.getGroupId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.identity.model.Group.class,
                        UpdateGroupResponse.Builder::group)
                .handleResponseHeaderString(
                        "opc-request-id", UpdateGroupResponse.Builder::opcRequestId)
                .handleResponseHeaderString("etag", UpdateGroupResponse.Builder::etag)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<UpdateIdentityProviderResponse> updateIdentityProvider(
            UpdateIdentityProviderRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            UpdateIdentityProviderRequest, UpdateIdentityProviderResponse>
                    handler) {

        Validate.notBlank(request.getIdentityProviderId(), "identityProviderId must not be blank");
        Objects.requireNonNull(
                request.getUpdateIdentityProviderDetails(),
                "updateIdentityProviderDetails is required");

        return clientCall(request, UpdateIdentityProviderResponse::builder)
                .logger(LOG, "updateIdentityProvider")
                .serviceDetails(
                        "Identity",
                        "UpdateIdentityProvider",
                        "https://docs.oracle.com/iaas/api/#/en/identity/20160918/IdentityProvider/UpdateIdentityProvider")
                .method(com.oracle.bmc.http.client.Method.PUT)
                .requestBuilder(UpdateIdentityProviderRequest::builder)
                .basePath("/20160918")
                .appendPathParam("identityProviders")
                .appendPathParam(request.getIdentityProviderId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.identity.model.IdentityProvider.class,
                        UpdateIdentityProviderResponse.Builder::identityProvider)
                .handleResponseHeaderString(
                        "opc-request-id", UpdateIdentityProviderResponse.Builder::opcRequestId)
                .handleResponseHeaderString("etag", UpdateIdentityProviderResponse.Builder::etag)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<UpdateIdpGroupMappingResponse> updateIdpGroupMapping(
            UpdateIdpGroupMappingRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            UpdateIdpGroupMappingRequest, UpdateIdpGroupMappingResponse>
                    handler) {

        Validate.notBlank(request.getIdentityProviderId(), "identityProviderId must not be blank");

        Validate.notBlank(request.getMappingId(), "mappingId must not be blank");
        Objects.requireNonNull(
                request.getUpdateIdpGroupMappingDetails(),
                "updateIdpGroupMappingDetails is required");

        return clientCall(request, UpdateIdpGroupMappingResponse::builder)
                .logger(LOG, "updateIdpGroupMapping")
                .serviceDetails(
                        "Identity",
                        "UpdateIdpGroupMapping",
                        "https://docs.oracle.com/iaas/api/#/en/identity/20160918/IdpGroupMapping/UpdateIdpGroupMapping")
                .method(com.oracle.bmc.http.client.Method.PUT)
                .requestBuilder(UpdateIdpGroupMappingRequest::builder)
                .basePath("/20160918")
                .appendPathParam("identityProviders")
                .appendPathParam(request.getIdentityProviderId())
                .appendPathParam("groupMappings")
                .appendPathParam(request.getMappingId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.identity.model.IdpGroupMapping.class,
                        UpdateIdpGroupMappingResponse.Builder::idpGroupMapping)
                .handleResponseHeaderString(
                        "opc-request-id", UpdateIdpGroupMappingResponse.Builder::opcRequestId)
                .handleResponseHeaderString("etag", UpdateIdpGroupMappingResponse.Builder::etag)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<UpdateNetworkSourceResponse> updateNetworkSource(
            UpdateNetworkSourceRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            UpdateNetworkSourceRequest, UpdateNetworkSourceResponse>
                    handler) {

        Validate.notBlank(request.getNetworkSourceId(), "networkSourceId must not be blank");
        Objects.requireNonNull(
                request.getUpdateNetworkSourceDetails(), "updateNetworkSourceDetails is required");

        return clientCall(request, UpdateNetworkSourceResponse::builder)
                .logger(LOG, "updateNetworkSource")
                .serviceDetails(
                        "Identity",
                        "UpdateNetworkSource",
                        "https://docs.oracle.com/iaas/api/#/en/identity/20160918/NetworkSources/UpdateNetworkSource")
                .method(com.oracle.bmc.http.client.Method.PUT)
                .requestBuilder(UpdateNetworkSourceRequest::builder)
                .basePath("/20160918")
                .appendPathParam("networkSources")
                .appendPathParam(request.getNetworkSourceId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.identity.model.NetworkSources.class,
                        UpdateNetworkSourceResponse.Builder::networkSources)
                .handleResponseHeaderString(
                        "opc-request-id", UpdateNetworkSourceResponse.Builder::opcRequestId)
                .handleResponseHeaderString("etag", UpdateNetworkSourceResponse.Builder::etag)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<UpdateOAuthClientCredentialResponse>
            updateOAuthClientCredential(
                    UpdateOAuthClientCredentialRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    UpdateOAuthClientCredentialRequest,
                                    UpdateOAuthClientCredentialResponse>
                            handler) {

        Validate.notBlank(request.getUserId(), "userId must not be blank");

        Validate.notBlank(
                request.getOauth2ClientCredentialId(),
                "oauth2ClientCredentialId must not be blank");
        Objects.requireNonNull(
                request.getUpdateOAuth2ClientCredentialDetails(),
                "updateOAuth2ClientCredentialDetails is required");

        return clientCall(request, UpdateOAuthClientCredentialResponse::builder)
                .logger(LOG, "updateOAuthClientCredential")
                .serviceDetails(
                        "Identity",
                        "UpdateOAuthClientCredential",
                        "https://docs.oracle.com/iaas/api/#/en/identity/20160918/User/UpdateOAuthClientCredential")
                .method(com.oracle.bmc.http.client.Method.PUT)
                .requestBuilder(UpdateOAuthClientCredentialRequest::builder)
                .basePath("/20160918")
                .appendPathParam("users")
                .appendPathParam(request.getUserId())
                .appendPathParam("oauth2ClientCredentials")
                .appendPathParam(request.getOauth2ClientCredentialId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.identity.model.OAuth2ClientCredential.class,
                        UpdateOAuthClientCredentialResponse.Builder::oAuth2ClientCredential)
                .handleResponseHeaderString(
                        "opc-request-id", UpdateOAuthClientCredentialResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "etag", UpdateOAuthClientCredentialResponse.Builder::etag)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<UpdatePolicyResponse> updatePolicy(
            UpdatePolicyRequest request,
            final com.oracle.bmc.responses.AsyncHandler<UpdatePolicyRequest, UpdatePolicyResponse>
                    handler) {

        Validate.notBlank(request.getPolicyId(), "policyId must not be blank");
        Objects.requireNonNull(request.getUpdatePolicyDetails(), "updatePolicyDetails is required");

        return clientCall(request, UpdatePolicyResponse::builder)
                .logger(LOG, "updatePolicy")
                .serviceDetails(
                        "Identity",
                        "UpdatePolicy",
                        "https://docs.oracle.com/iaas/api/#/en/identity/20160918/Policy/UpdatePolicy")
                .method(com.oracle.bmc.http.client.Method.PUT)
                .requestBuilder(UpdatePolicyRequest::builder)
                .basePath("/20160918")
                .appendPathParam("policies")
                .appendPathParam(request.getPolicyId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.identity.model.Policy.class,
                        UpdatePolicyResponse.Builder::policy)
                .handleResponseHeaderString(
                        "opc-request-id", UpdatePolicyResponse.Builder::opcRequestId)
                .handleResponseHeaderString("etag", UpdatePolicyResponse.Builder::etag)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<UpdateSmtpCredentialResponse> updateSmtpCredential(
            UpdateSmtpCredentialRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            UpdateSmtpCredentialRequest, UpdateSmtpCredentialResponse>
                    handler) {

        Validate.notBlank(request.getUserId(), "userId must not be blank");

        Validate.notBlank(request.getSmtpCredentialId(), "smtpCredentialId must not be blank");
        Objects.requireNonNull(
                request.getUpdateSmtpCredentialDetails(),
                "updateSmtpCredentialDetails is required");

        return clientCall(request, UpdateSmtpCredentialResponse::builder)
                .logger(LOG, "updateSmtpCredential")
                .serviceDetails(
                        "Identity",
                        "UpdateSmtpCredential",
                        "https://docs.oracle.com/iaas/api/#/en/identity/20160918/SmtpCredentialSummary/UpdateSmtpCredential")
                .method(com.oracle.bmc.http.client.Method.PUT)
                .requestBuilder(UpdateSmtpCredentialRequest::builder)
                .basePath("/20160918")
                .appendPathParam("users")
                .appendPathParam(request.getUserId())
                .appendPathParam("smtpCredentials")
                .appendPathParam(request.getSmtpCredentialId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.identity.model.SmtpCredentialSummary.class,
                        UpdateSmtpCredentialResponse.Builder::smtpCredentialSummary)
                .handleResponseHeaderString(
                        "opc-request-id", UpdateSmtpCredentialResponse.Builder::opcRequestId)
                .handleResponseHeaderString("etag", UpdateSmtpCredentialResponse.Builder::etag)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<UpdateSwiftPasswordResponse> updateSwiftPassword(
            UpdateSwiftPasswordRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            UpdateSwiftPasswordRequest, UpdateSwiftPasswordResponse>
                    handler) {

        Validate.notBlank(request.getUserId(), "userId must not be blank");

        Validate.notBlank(request.getSwiftPasswordId(), "swiftPasswordId must not be blank");
        Objects.requireNonNull(
                request.getUpdateSwiftPasswordDetails(), "updateSwiftPasswordDetails is required");

        return clientCall(request, UpdateSwiftPasswordResponse::builder)
                .logger(LOG, "updateSwiftPassword")
                .serviceDetails(
                        "Identity",
                        "UpdateSwiftPassword",
                        "https://docs.oracle.com/iaas/api/#/en/identity/20160918/SwiftPassword/UpdateSwiftPassword")
                .method(com.oracle.bmc.http.client.Method.PUT)
                .requestBuilder(UpdateSwiftPasswordRequest::builder)
                .basePath("/20160918")
                .appendPathParam("users")
                .appendPathParam(request.getUserId())
                .appendPathParam("swiftPasswords")
                .appendPathParam(request.getSwiftPasswordId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.identity.model.SwiftPassword.class,
                        UpdateSwiftPasswordResponse.Builder::swiftPassword)
                .handleResponseHeaderString(
                        "opc-request-id", UpdateSwiftPasswordResponse.Builder::opcRequestId)
                .handleResponseHeaderString("etag", UpdateSwiftPasswordResponse.Builder::etag)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<UpdateTagResponse> updateTag(
            UpdateTagRequest request,
            final com.oracle.bmc.responses.AsyncHandler<UpdateTagRequest, UpdateTagResponse>
                    handler) {

        Validate.notBlank(request.getTagNamespaceId(), "tagNamespaceId must not be blank");

        Validate.notBlank(request.getTagName(), "tagName must not be blank");
        Objects.requireNonNull(request.getUpdateTagDetails(), "updateTagDetails is required");

        return clientCall(request, UpdateTagResponse::builder)
                .logger(LOG, "updateTag")
                .serviceDetails(
                        "Identity",
                        "UpdateTag",
                        "https://docs.oracle.com/iaas/api/#/en/identity/20160918/Tag/UpdateTag")
                .method(com.oracle.bmc.http.client.Method.PUT)
                .requestBuilder(UpdateTagRequest::builder)
                .basePath("/20160918")
                .appendPathParam("tagNamespaces")
                .appendPathParam(request.getTagNamespaceId())
                .appendPathParam("tags")
                .appendPathParam(request.getTagName())
                .appendQueryParam("isLockOverride", request.getIsLockOverride())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .hasBody()
                .handleBody(com.oracle.bmc.identity.model.Tag.class, UpdateTagResponse.Builder::tag)
                .handleResponseHeaderString(
                        "opc-request-id", UpdateTagResponse.Builder::opcRequestId)
                .handleResponseHeaderString("etag", UpdateTagResponse.Builder::etag)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<UpdateTagDefaultResponse> updateTagDefault(
            UpdateTagDefaultRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            UpdateTagDefaultRequest, UpdateTagDefaultResponse>
                    handler) {

        Validate.notBlank(request.getTagDefaultId(), "tagDefaultId must not be blank");
        Objects.requireNonNull(
                request.getUpdateTagDefaultDetails(), "updateTagDefaultDetails is required");

        return clientCall(request, UpdateTagDefaultResponse::builder)
                .logger(LOG, "updateTagDefault")
                .serviceDetails(
                        "Identity",
                        "UpdateTagDefault",
                        "https://docs.oracle.com/iaas/api/#/en/identity/20160918/TagDefault/UpdateTagDefault")
                .method(com.oracle.bmc.http.client.Method.PUT)
                .requestBuilder(UpdateTagDefaultRequest::builder)
                .basePath("/20160918")
                .appendPathParam("tagDefaults")
                .appendPathParam(request.getTagDefaultId())
                .appendQueryParam("isLockOverride", request.getIsLockOverride())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.identity.model.TagDefault.class,
                        UpdateTagDefaultResponse.Builder::tagDefault)
                .handleResponseHeaderString(
                        "opc-request-id", UpdateTagDefaultResponse.Builder::opcRequestId)
                .handleResponseHeaderString("etag", UpdateTagDefaultResponse.Builder::etag)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<UpdateTagNamespaceResponse> updateTagNamespace(
            UpdateTagNamespaceRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            UpdateTagNamespaceRequest, UpdateTagNamespaceResponse>
                    handler) {

        Validate.notBlank(request.getTagNamespaceId(), "tagNamespaceId must not be blank");
        Objects.requireNonNull(
                request.getUpdateTagNamespaceDetails(), "updateTagNamespaceDetails is required");

        return clientCall(request, UpdateTagNamespaceResponse::builder)
                .logger(LOG, "updateTagNamespace")
                .serviceDetails(
                        "Identity",
                        "UpdateTagNamespace",
                        "https://docs.oracle.com/iaas/api/#/en/identity/20160918/TagNamespace/UpdateTagNamespace")
                .method(com.oracle.bmc.http.client.Method.PUT)
                .requestBuilder(UpdateTagNamespaceRequest::builder)
                .basePath("/20160918")
                .appendPathParam("tagNamespaces")
                .appendPathParam(request.getTagNamespaceId())
                .appendQueryParam("isLockOverride", request.getIsLockOverride())
                .accept("application/json")
                .hasBody()
                .handleBody(
                        com.oracle.bmc.identity.model.TagNamespace.class,
                        UpdateTagNamespaceResponse.Builder::tagNamespace)
                .handleResponseHeaderString(
                        "opc-request-id", UpdateTagNamespaceResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<UpdateUserResponse> updateUser(
            UpdateUserRequest request,
            final com.oracle.bmc.responses.AsyncHandler<UpdateUserRequest, UpdateUserResponse>
                    handler) {

        Validate.notBlank(request.getUserId(), "userId must not be blank");
        Objects.requireNonNull(request.getUpdateUserDetails(), "updateUserDetails is required");

        return clientCall(request, UpdateUserResponse::builder)
                .logger(LOG, "updateUser")
                .serviceDetails(
                        "Identity",
                        "UpdateUser",
                        "https://docs.oracle.com/iaas/api/#/en/identity/20160918/User/UpdateUser")
                .method(com.oracle.bmc.http.client.Method.PUT)
                .requestBuilder(UpdateUserRequest::builder)
                .basePath("/20160918")
                .appendPathParam("users")
                .appendPathParam(request.getUserId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.identity.model.User.class, UpdateUserResponse.Builder::user)
                .handleResponseHeaderString(
                        "opc-request-id", UpdateUserResponse.Builder::opcRequestId)
                .handleResponseHeaderString("etag", UpdateUserResponse.Builder::etag)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<UpdateUserCapabilitiesResponse> updateUserCapabilities(
            UpdateUserCapabilitiesRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            UpdateUserCapabilitiesRequest, UpdateUserCapabilitiesResponse>
                    handler) {

        Validate.notBlank(request.getUserId(), "userId must not be blank");
        Objects.requireNonNull(
                request.getUpdateUserCapabilitiesDetails(),
                "updateUserCapabilitiesDetails is required");

        return clientCall(request, UpdateUserCapabilitiesResponse::builder)
                .logger(LOG, "updateUserCapabilities")
                .serviceDetails(
                        "Identity",
                        "UpdateUserCapabilities",
                        "https://docs.oracle.com/iaas/api/#/en/identity/20160918/User/UpdateUserCapabilities")
                .method(com.oracle.bmc.http.client.Method.PUT)
                .requestBuilder(UpdateUserCapabilitiesRequest::builder)
                .basePath("/20160918")
                .appendPathParam("users")
                .appendPathParam(request.getUserId())
                .appendPathParam("capabilities")
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.identity.model.User.class,
                        UpdateUserCapabilitiesResponse.Builder::user)
                .handleResponseHeaderString(
                        "opc-request-id", UpdateUserCapabilitiesResponse.Builder::opcRequestId)
                .handleResponseHeaderString("etag", UpdateUserCapabilitiesResponse.Builder::etag)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<UpdateUserStateResponse> updateUserState(
            UpdateUserStateRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            UpdateUserStateRequest, UpdateUserStateResponse>
                    handler) {

        Validate.notBlank(request.getUserId(), "userId must not be blank");
        Objects.requireNonNull(request.getUpdateStateDetails(), "updateStateDetails is required");

        return clientCall(request, UpdateUserStateResponse::builder)
                .logger(LOG, "updateUserState")
                .serviceDetails(
                        "Identity",
                        "UpdateUserState",
                        "https://docs.oracle.com/iaas/api/#/en/identity/20160918/User/UpdateUserState")
                .method(com.oracle.bmc.http.client.Method.PUT)
                .requestBuilder(UpdateUserStateRequest::builder)
                .basePath("/20160918")
                .appendPathParam("users")
                .appendPathParam(request.getUserId())
                .appendPathParam("state")
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.identity.model.User.class,
                        UpdateUserStateResponse.Builder::user)
                .handleResponseHeaderString(
                        "opc-request-id", UpdateUserStateResponse.Builder::opcRequestId)
                .handleResponseHeaderString("etag", UpdateUserStateResponse.Builder::etag)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<UploadApiKeyResponse> uploadApiKey(
            UploadApiKeyRequest request,
            final com.oracle.bmc.responses.AsyncHandler<UploadApiKeyRequest, UploadApiKeyResponse>
                    handler) {

        Validate.notBlank(request.getUserId(), "userId must not be blank");
        Objects.requireNonNull(request.getCreateApiKeyDetails(), "createApiKeyDetails is required");

        return clientCall(request, UploadApiKeyResponse::builder)
                .logger(LOG, "uploadApiKey")
                .serviceDetails(
                        "Identity",
                        "UploadApiKey",
                        "https://docs.oracle.com/iaas/api/#/en/identity/20160918/ApiKey/UploadApiKey")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(UploadApiKeyRequest::builder)
                .basePath("/20160918")
                .appendPathParam("users")
                .appendPathParam(request.getUserId())
                .appendPathParam("apiKeys")
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.identity.model.ApiKey.class,
                        UploadApiKeyResponse.Builder::apiKey)
                .handleResponseHeaderString(
                        "opc-request-id", UploadApiKeyResponse.Builder::opcRequestId)
                .handleResponseHeaderString("etag", UploadApiKeyResponse.Builder::etag)
                .callAsync(handler);
    }

    /**
     * Create a new client instance.
     *
     * @param authenticationDetailsProvider The authentication details (see {@link Builder#build})
     * @deprecated Use the {@link #builder() builder} instead.
     */
    @Deprecated
    public IdentityAsyncClient(
            com.oracle.bmc.auth.BasicAuthenticationDetailsProvider authenticationDetailsProvider) {
        this(builder(), authenticationDetailsProvider);
    }

    /**
     * Create a new client instance.
     *
     * @param authenticationDetailsProvider The authentication details (see {@link Builder#build})
     * @param configuration {@link Builder#configuration}
     * @deprecated Use the {@link #builder() builder} instead.
     */
    @Deprecated
    public IdentityAsyncClient(
            com.oracle.bmc.auth.BasicAuthenticationDetailsProvider authenticationDetailsProvider,
            com.oracle.bmc.ClientConfiguration configuration) {
        this(builder().configuration(configuration), authenticationDetailsProvider);
    }

    /**
     * Create a new client instance.
     *
     * @param authenticationDetailsProvider The authentication details (see {@link Builder#build})
     * @param configuration {@link Builder#configuration}
     * @param clientConfigurator {@link Builder#clientConfigurator}
     * @deprecated Use the {@link #builder() builder} instead.
     */
    @Deprecated
    public IdentityAsyncClient(
            com.oracle.bmc.auth.BasicAuthenticationDetailsProvider authenticationDetailsProvider,
            com.oracle.bmc.ClientConfiguration configuration,
            com.oracle.bmc.http.ClientConfigurator clientConfigurator) {
        this(
                builder().configuration(configuration).clientConfigurator(clientConfigurator),
                authenticationDetailsProvider);
    }

    /**
     * Create a new client instance.
     *
     * @param authenticationDetailsProvider The authentication details (see {@link Builder#build})
     * @param configuration {@link Builder#configuration}
     * @param clientConfigurator {@link Builder#clientConfigurator}
     * @param defaultRequestSignerFactory {@link Builder#requestSignerFactory}
     * @deprecated Use the {@link #builder() builder} instead.
     */
    @Deprecated
    public IdentityAsyncClient(
            com.oracle.bmc.auth.AbstractAuthenticationDetailsProvider authenticationDetailsProvider,
            com.oracle.bmc.ClientConfiguration configuration,
            com.oracle.bmc.http.ClientConfigurator clientConfigurator,
            com.oracle.bmc.http.signing.RequestSignerFactory defaultRequestSignerFactory) {
        this(
                builder()
                        .configuration(configuration)
                        .clientConfigurator(clientConfigurator)
                        .requestSignerFactory(defaultRequestSignerFactory),
                authenticationDetailsProvider);
    }

    /**
     * Create a new client instance.
     *
     * @param authenticationDetailsProvider The authentication details (see {@link Builder#build})
     * @param configuration {@link Builder#configuration}
     * @param clientConfigurator {@link Builder#clientConfigurator}
     * @param defaultRequestSignerFactory {@link Builder#requestSignerFactory}
     * @param additionalClientConfigurators {@link Builder#additionalClientConfigurators}
     * @deprecated Use the {@link #builder() builder} instead.
     */
    @Deprecated
    public IdentityAsyncClient(
            com.oracle.bmc.auth.AbstractAuthenticationDetailsProvider authenticationDetailsProvider,
            com.oracle.bmc.ClientConfiguration configuration,
            com.oracle.bmc.http.ClientConfigurator clientConfigurator,
            com.oracle.bmc.http.signing.RequestSignerFactory defaultRequestSignerFactory,
            java.util.List<com.oracle.bmc.http.ClientConfigurator> additionalClientConfigurators) {
        this(
                builder()
                        .configuration(configuration)
                        .clientConfigurator(clientConfigurator)
                        .requestSignerFactory(defaultRequestSignerFactory)
                        .additionalClientConfigurators(additionalClientConfigurators),
                authenticationDetailsProvider);
    }

    /**
     * Create a new client instance.
     *
     * @param authenticationDetailsProvider The authentication details (see {@link Builder#build})
     * @param configuration {@link Builder#configuration}
     * @param clientConfigurator {@link Builder#clientConfigurator}
     * @param defaultRequestSignerFactory {@link Builder#requestSignerFactory}
     * @param additionalClientConfigurators {@link Builder#additionalClientConfigurators}
     * @param endpoint {@link Builder#endpoint}
     * @deprecated Use the {@link #builder() builder} instead.
     */
    @Deprecated
    public IdentityAsyncClient(
            com.oracle.bmc.auth.AbstractAuthenticationDetailsProvider authenticationDetailsProvider,
            com.oracle.bmc.ClientConfiguration configuration,
            com.oracle.bmc.http.ClientConfigurator clientConfigurator,
            com.oracle.bmc.http.signing.RequestSignerFactory defaultRequestSignerFactory,
            java.util.List<com.oracle.bmc.http.ClientConfigurator> additionalClientConfigurators,
            String endpoint) {
        this(
                builder()
                        .configuration(configuration)
                        .clientConfigurator(clientConfigurator)
                        .requestSignerFactory(defaultRequestSignerFactory)
                        .additionalClientConfigurators(additionalClientConfigurators)
                        .endpoint(endpoint),
                authenticationDetailsProvider);
    }

    /**
     * Create a new client instance.
     *
     * @param authenticationDetailsProvider The authentication details (see {@link Builder#build})
     * @param configuration {@link Builder#configuration}
     * @param clientConfigurator {@link Builder#clientConfigurator}
     * @param defaultRequestSignerFactory {@link Builder#requestSignerFactory}
     * @param additionalClientConfigurators {@link Builder#additionalClientConfigurators}
     * @param endpoint {@link Builder#endpoint}
     * @param signingStrategyRequestSignerFactories {@link
     *     Builder#signingStrategyRequestSignerFactories}
     * @deprecated Use the {@link #builder() builder} instead.
     */
    @Deprecated
    public IdentityAsyncClient(
            com.oracle.bmc.auth.AbstractAuthenticationDetailsProvider authenticationDetailsProvider,
            com.oracle.bmc.ClientConfiguration configuration,
            com.oracle.bmc.http.ClientConfigurator clientConfigurator,
            com.oracle.bmc.http.signing.RequestSignerFactory defaultRequestSignerFactory,
            java.util.Map<
                            com.oracle.bmc.http.signing.SigningStrategy,
                            com.oracle.bmc.http.signing.RequestSignerFactory>
                    signingStrategyRequestSignerFactories,
            java.util.List<com.oracle.bmc.http.ClientConfigurator> additionalClientConfigurators,
            String endpoint) {
        this(
                builder()
                        .configuration(configuration)
                        .clientConfigurator(clientConfigurator)
                        .requestSignerFactory(defaultRequestSignerFactory)
                        .additionalClientConfigurators(additionalClientConfigurators)
                        .endpoint(endpoint)
                        .signingStrategyRequestSignerFactories(
                                signingStrategyRequestSignerFactories),
                authenticationDetailsProvider);
    }
}

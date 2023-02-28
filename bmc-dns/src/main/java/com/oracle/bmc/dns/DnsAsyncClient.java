/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.dns;

import com.oracle.bmc.util.internal.Validate;
import com.oracle.bmc.dns.requests.*;
import com.oracle.bmc.dns.responses.*;

import java.util.Objects;

/**
 * Async client implementation for Dns service. <br>
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
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20180115")
public class DnsAsyncClient extends com.oracle.bmc.http.internal.BaseAsyncClient
        implements DnsAsync {
    /** Service instance for Dns. */
    public static final com.oracle.bmc.Service SERVICE =
            com.oracle.bmc.Services.serviceBuilder()
                    .serviceName("DNS")
                    .serviceEndpointPrefix("dns")
                    .serviceEndpointTemplate("https://dns.{region}.oci.{secondLevelDomain}")
                    .build();

    private static final org.slf4j.Logger LOG =
            org.slf4j.LoggerFactory.getLogger(DnsAsyncClient.class);

    private DnsAsyncClient(
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
            extends com.oracle.bmc.common.RegionalClientBuilder<Builder, DnsAsyncClient> {
        private Builder(com.oracle.bmc.Service service) {
            super(service);
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
        public DnsAsyncClient build(
                @jakarta.annotation.Nonnull
                        com.oracle.bmc.auth.AbstractAuthenticationDetailsProvider
                                authenticationDetailsProvider) {
            return new DnsAsyncClient(this, authenticationDetailsProvider);
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
    public java.util.concurrent.Future<ChangeResolverCompartmentResponse> changeResolverCompartment(
            ChangeResolverCompartmentRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ChangeResolverCompartmentRequest, ChangeResolverCompartmentResponse>
                    handler) {

        Validate.notBlank(request.getResolverId(), "resolverId must not be blank");
        Objects.requireNonNull(
                request.getChangeResolverCompartmentDetails(),
                "changeResolverCompartmentDetails is required");

        return clientCall(request, ChangeResolverCompartmentResponse::builder)
                .logger(LOG, "changeResolverCompartment")
                .serviceDetails(
                        "Dns",
                        "ChangeResolverCompartment",
                        "https://docs.oracle.com/iaas/api/#/en/dns/20180115/Resolver/ChangeResolverCompartment")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(ChangeResolverCompartmentRequest::builder)
                .basePath("/20180115")
                .appendPathParam("resolvers")
                .appendPathParam(request.getResolverId())
                .appendPathParam("actions")
                .appendPathParam("changeCompartment")
                .appendEnumQueryParam("scope", request.getScope())
                .accept("application/json")
                .appendHeader("If-Match", request.getIfMatch())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-request-id", ChangeResolverCompartmentResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        ChangeResolverCompartmentResponse.Builder::opcWorkRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ChangeSteeringPolicyCompartmentResponse>
            changeSteeringPolicyCompartment(
                    ChangeSteeringPolicyCompartmentRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ChangeSteeringPolicyCompartmentRequest,
                                    ChangeSteeringPolicyCompartmentResponse>
                            handler) {

        Validate.notBlank(request.getSteeringPolicyId(), "steeringPolicyId must not be blank");
        Objects.requireNonNull(
                request.getChangeSteeringPolicyCompartmentDetails(),
                "changeSteeringPolicyCompartmentDetails is required");

        return clientCall(request, ChangeSteeringPolicyCompartmentResponse::builder)
                .logger(LOG, "changeSteeringPolicyCompartment")
                .serviceDetails(
                        "Dns",
                        "ChangeSteeringPolicyCompartment",
                        "https://docs.oracle.com/iaas/api/#/en/dns/20180115/SteeringPolicy/ChangeSteeringPolicyCompartment")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(ChangeSteeringPolicyCompartmentRequest::builder)
                .basePath("/20180115")
                .appendPathParam("steeringPolicies")
                .appendPathParam(request.getSteeringPolicyId())
                .appendPathParam("actions")
                .appendPathParam("changeCompartment")
                .appendEnumQueryParam("scope", request.getScope())
                .accept("application/json")
                .appendHeader("If-Match", request.getIfMatch())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-request-id",
                        ChangeSteeringPolicyCompartmentResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ChangeTsigKeyCompartmentResponse> changeTsigKeyCompartment(
            ChangeTsigKeyCompartmentRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ChangeTsigKeyCompartmentRequest, ChangeTsigKeyCompartmentResponse>
                    handler) {

        Validate.notBlank(request.getTsigKeyId(), "tsigKeyId must not be blank");
        Objects.requireNonNull(
                request.getChangeTsigKeyCompartmentDetails(),
                "changeTsigKeyCompartmentDetails is required");

        return clientCall(request, ChangeTsigKeyCompartmentResponse::builder)
                .logger(LOG, "changeTsigKeyCompartment")
                .serviceDetails(
                        "Dns",
                        "ChangeTsigKeyCompartment",
                        "https://docs.oracle.com/iaas/api/#/en/dns/20180115/TsigKey/ChangeTsigKeyCompartment")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(ChangeTsigKeyCompartmentRequest::builder)
                .basePath("/20180115")
                .appendPathParam("tsigKeys")
                .appendPathParam(request.getTsigKeyId())
                .appendPathParam("actions")
                .appendPathParam("changeCompartment")
                .appendEnumQueryParam("scope", request.getScope())
                .accept("application/json")
                .appendHeader("If-Match", request.getIfMatch())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-request-id", ChangeTsigKeyCompartmentResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ChangeViewCompartmentResponse> changeViewCompartment(
            ChangeViewCompartmentRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ChangeViewCompartmentRequest, ChangeViewCompartmentResponse>
                    handler) {

        Validate.notBlank(request.getViewId(), "viewId must not be blank");
        Objects.requireNonNull(
                request.getChangeViewCompartmentDetails(),
                "changeViewCompartmentDetails is required");

        return clientCall(request, ChangeViewCompartmentResponse::builder)
                .logger(LOG, "changeViewCompartment")
                .serviceDetails(
                        "Dns",
                        "ChangeViewCompartment",
                        "https://docs.oracle.com/iaas/api/#/en/dns/20180115/View/ChangeViewCompartment")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(ChangeViewCompartmentRequest::builder)
                .basePath("/20180115")
                .appendPathParam("views")
                .appendPathParam(request.getViewId())
                .appendPathParam("actions")
                .appendPathParam("changeCompartment")
                .appendEnumQueryParam("scope", request.getScope())
                .accept("application/json")
                .appendHeader("If-Match", request.getIfMatch())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-request-id", ChangeViewCompartmentResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        ChangeViewCompartmentResponse.Builder::opcWorkRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ChangeZoneCompartmentResponse> changeZoneCompartment(
            ChangeZoneCompartmentRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ChangeZoneCompartmentRequest, ChangeZoneCompartmentResponse>
                    handler) {

        Validate.notBlank(request.getZoneId(), "zoneId must not be blank");
        Objects.requireNonNull(
                request.getChangeZoneCompartmentDetails(),
                "changeZoneCompartmentDetails is required");

        return clientCall(request, ChangeZoneCompartmentResponse::builder)
                .logger(LOG, "changeZoneCompartment")
                .serviceDetails(
                        "Dns",
                        "ChangeZoneCompartment",
                        "https://docs.oracle.com/iaas/api/#/en/dns/20180115/Zone/ChangeZoneCompartment")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(ChangeZoneCompartmentRequest::builder)
                .basePath("/20180115")
                .appendPathParam("zones")
                .appendPathParam(request.getZoneId())
                .appendPathParam("actions")
                .appendPathParam("changeCompartment")
                .appendEnumQueryParam("scope", request.getScope())
                .accept("application/json")
                .appendHeader("If-Match", request.getIfMatch())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-request-id", ChangeZoneCompartmentResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        ChangeZoneCompartmentResponse.Builder::opcWorkRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<CreateResolverEndpointResponse> createResolverEndpoint(
            CreateResolverEndpointRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            CreateResolverEndpointRequest, CreateResolverEndpointResponse>
                    handler) {

        Validate.notBlank(request.getResolverId(), "resolverId must not be blank");
        Objects.requireNonNull(
                request.getCreateResolverEndpointDetails(),
                "createResolverEndpointDetails is required");

        return clientCall(request, CreateResolverEndpointResponse::builder)
                .logger(LOG, "createResolverEndpoint")
                .serviceDetails("Dns", "CreateResolverEndpoint", "")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CreateResolverEndpointRequest::builder)
                .basePath("/20180115")
                .appendPathParam("resolvers")
                .appendPathParam(request.getResolverId())
                .appendPathParam("endpoints")
                .appendEnumQueryParam("scope", request.getScope())
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.dns.model.ResolverEndpoint.class,
                        CreateResolverEndpointResponse.Builder::resolverEndpoint)
                .handleResponseHeaderString("etag", CreateResolverEndpointResponse.Builder::etag)
                .handleResponseHeaderString(
                        "Location", CreateResolverEndpointResponse.Builder::location)
                .handleResponseHeaderString(
                        "opc-request-id", CreateResolverEndpointResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        CreateResolverEndpointResponse.Builder::opcWorkRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<CreateSteeringPolicyResponse> createSteeringPolicy(
            CreateSteeringPolicyRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            CreateSteeringPolicyRequest, CreateSteeringPolicyResponse>
                    handler) {
        Objects.requireNonNull(
                request.getCreateSteeringPolicyDetails(),
                "createSteeringPolicyDetails is required");

        return clientCall(request, CreateSteeringPolicyResponse::builder)
                .logger(LOG, "createSteeringPolicy")
                .serviceDetails("Dns", "CreateSteeringPolicy", "")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CreateSteeringPolicyRequest::builder)
                .basePath("/20180115")
                .appendPathParam("steeringPolicies")
                .appendEnumQueryParam("scope", request.getScope())
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.dns.model.SteeringPolicy.class,
                        CreateSteeringPolicyResponse.Builder::steeringPolicy)
                .handleResponseHeaderString("ETag", CreateSteeringPolicyResponse.Builder::eTag)
                .handleResponseHeaderString(
                        "Location", CreateSteeringPolicyResponse.Builder::location)
                .handleResponseHeaderString(
                        "opc-request-id", CreateSteeringPolicyResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<CreateSteeringPolicyAttachmentResponse>
            createSteeringPolicyAttachment(
                    CreateSteeringPolicyAttachmentRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    CreateSteeringPolicyAttachmentRequest,
                                    CreateSteeringPolicyAttachmentResponse>
                            handler) {
        Objects.requireNonNull(
                request.getCreateSteeringPolicyAttachmentDetails(),
                "createSteeringPolicyAttachmentDetails is required");

        return clientCall(request, CreateSteeringPolicyAttachmentResponse::builder)
                .logger(LOG, "createSteeringPolicyAttachment")
                .serviceDetails("Dns", "CreateSteeringPolicyAttachment", "")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CreateSteeringPolicyAttachmentRequest::builder)
                .basePath("/20180115")
                .appendPathParam("steeringPolicyAttachments")
                .appendEnumQueryParam("scope", request.getScope())
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.dns.model.SteeringPolicyAttachment.class,
                        CreateSteeringPolicyAttachmentResponse.Builder::steeringPolicyAttachment)
                .handleResponseHeaderString(
                        "ETag", CreateSteeringPolicyAttachmentResponse.Builder::eTag)
                .handleResponseHeaderString(
                        "Location", CreateSteeringPolicyAttachmentResponse.Builder::location)
                .handleResponseHeaderString(
                        "opc-request-id",
                        CreateSteeringPolicyAttachmentResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<CreateTsigKeyResponse> createTsigKey(
            CreateTsigKeyRequest request,
            final com.oracle.bmc.responses.AsyncHandler<CreateTsigKeyRequest, CreateTsigKeyResponse>
                    handler) {
        Objects.requireNonNull(
                request.getCreateTsigKeyDetails(), "createTsigKeyDetails is required");

        return clientCall(request, CreateTsigKeyResponse::builder)
                .logger(LOG, "createTsigKey")
                .serviceDetails("Dns", "CreateTsigKey", "")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CreateTsigKeyRequest::builder)
                .basePath("/20180115")
                .appendPathParam("tsigKeys")
                .appendEnumQueryParam("scope", request.getScope())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.dns.model.TsigKey.class,
                        CreateTsigKeyResponse.Builder::tsigKey)
                .handleResponseHeaderString("ETag", CreateTsigKeyResponse.Builder::eTag)
                .handleResponseHeaderString("Location", CreateTsigKeyResponse.Builder::location)
                .handleResponseHeaderString(
                        "opc-request-id", CreateTsigKeyResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-work-request-id", CreateTsigKeyResponse.Builder::opcWorkRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<CreateViewResponse> createView(
            CreateViewRequest request,
            final com.oracle.bmc.responses.AsyncHandler<CreateViewRequest, CreateViewResponse>
                    handler) {
        Objects.requireNonNull(request.getCreateViewDetails(), "createViewDetails is required");

        return clientCall(request, CreateViewResponse::builder)
                .logger(LOG, "createView")
                .serviceDetails("Dns", "CreateView", "")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CreateViewRequest::builder)
                .basePath("/20180115")
                .appendPathParam("views")
                .appendEnumQueryParam("scope", request.getScope())
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleBody(com.oracle.bmc.dns.model.View.class, CreateViewResponse.Builder::view)
                .handleResponseHeaderString("etag", CreateViewResponse.Builder::etag)
                .handleResponseHeaderString("Location", CreateViewResponse.Builder::location)
                .handleResponseHeaderString(
                        "opc-request-id", CreateViewResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-work-request-id", CreateViewResponse.Builder::opcWorkRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<CreateZoneResponse> createZone(
            CreateZoneRequest request,
            final com.oracle.bmc.responses.AsyncHandler<CreateZoneRequest, CreateZoneResponse>
                    handler) {
        Objects.requireNonNull(request.getCreateZoneDetails(), "createZoneDetails is required");

        return clientCall(request, CreateZoneResponse::builder)
                .logger(LOG, "createZone")
                .serviceDetails("Dns", "CreateZone", "")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CreateZoneRequest::builder)
                .basePath("/20180115")
                .appendPathParam("zones")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendEnumQueryParam("scope", request.getScope())
                .appendQueryParam("viewId", request.getViewId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleBody(com.oracle.bmc.dns.model.Zone.class, CreateZoneResponse.Builder::zone)
                .handleResponseHeaderString("ETag", CreateZoneResponse.Builder::eTag)
                .handleResponseHeaderString("Location", CreateZoneResponse.Builder::location)
                .handleResponseHeaderString(
                        "opc-request-id", CreateZoneResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-work-request-id", CreateZoneResponse.Builder::opcWorkRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<DeleteDomainRecordsResponse> deleteDomainRecords(
            DeleteDomainRecordsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            DeleteDomainRecordsRequest, DeleteDomainRecordsResponse>
                    handler) {

        Validate.notBlank(request.getZoneNameOrId(), "zoneNameOrId must not be blank");

        Validate.notBlank(request.getDomain(), "domain must not be blank");

        return clientCall(request, DeleteDomainRecordsResponse::builder)
                .logger(LOG, "deleteDomainRecords")
                .serviceDetails(
                        "Dns",
                        "DeleteDomainRecords",
                        "https://docs.oracle.com/iaas/api/#/en/dns/20180115/Records/DeleteDomainRecords")
                .method(com.oracle.bmc.http.client.Method.DELETE)
                .requestBuilder(DeleteDomainRecordsRequest::builder)
                .basePath("/20180115")
                .appendPathParam("zones")
                .appendPathParam(request.getZoneNameOrId())
                .appendPathParam("records")
                .appendPathParam(request.getDomain())
                .appendEnumQueryParam("scope", request.getScope())
                .appendQueryParam("viewId", request.getViewId())
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .accept("application/json")
                .appendHeader("If-Match", request.getIfMatch())
                .appendHeader("If-Unmodified-Since", request.getIfUnmodifiedSince())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleResponseHeaderString(
                        "opc-request-id", DeleteDomainRecordsResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<DeleteRRSetResponse> deleteRRSet(
            DeleteRRSetRequest request,
            final com.oracle.bmc.responses.AsyncHandler<DeleteRRSetRequest, DeleteRRSetResponse>
                    handler) {

        Validate.notBlank(request.getZoneNameOrId(), "zoneNameOrId must not be blank");

        Validate.notBlank(request.getDomain(), "domain must not be blank");

        Validate.notBlank(request.getRtype(), "rtype must not be blank");

        return clientCall(request, DeleteRRSetResponse::builder)
                .logger(LOG, "deleteRRSet")
                .serviceDetails("Dns", "DeleteRRSet", "")
                .method(com.oracle.bmc.http.client.Method.DELETE)
                .requestBuilder(DeleteRRSetRequest::builder)
                .basePath("/20180115")
                .appendPathParam("zones")
                .appendPathParam(request.getZoneNameOrId())
                .appendPathParam("records")
                .appendPathParam(request.getDomain())
                .appendPathParam(request.getRtype())
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendEnumQueryParam("scope", request.getScope())
                .appendQueryParam("viewId", request.getViewId())
                .accept("application/json")
                .appendHeader("If-Match", request.getIfMatch())
                .appendHeader("If-Unmodified-Since", request.getIfUnmodifiedSince())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleResponseHeaderString(
                        "opc-request-id", DeleteRRSetResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<DeleteResolverEndpointResponse> deleteResolverEndpoint(
            DeleteResolverEndpointRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            DeleteResolverEndpointRequest, DeleteResolverEndpointResponse>
                    handler) {

        Validate.notBlank(request.getResolverId(), "resolverId must not be blank");

        Validate.notBlank(
                request.getResolverEndpointName(), "resolverEndpointName must not be blank");

        return clientCall(request, DeleteResolverEndpointResponse::builder)
                .logger(LOG, "deleteResolverEndpoint")
                .serviceDetails(
                        "Dns",
                        "DeleteResolverEndpoint",
                        "https://docs.oracle.com/iaas/api/#/en/dns/20180115/ResolverEndpoint/DeleteResolverEndpoint")
                .method(com.oracle.bmc.http.client.Method.DELETE)
                .requestBuilder(DeleteResolverEndpointRequest::builder)
                .basePath("/20180115")
                .appendPathParam("resolvers")
                .appendPathParam(request.getResolverId())
                .appendPathParam("endpoints")
                .appendPathParam(request.getResolverEndpointName())
                .appendEnumQueryParam("scope", request.getScope())
                .accept("application/json")
                .appendHeader("If-Match", request.getIfMatch())
                .appendHeader("If-Unmodified-Since", request.getIfUnmodifiedSince())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleResponseHeaderString(
                        "opc-request-id", DeleteResolverEndpointResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        DeleteResolverEndpointResponse.Builder::opcWorkRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<DeleteSteeringPolicyResponse> deleteSteeringPolicy(
            DeleteSteeringPolicyRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            DeleteSteeringPolicyRequest, DeleteSteeringPolicyResponse>
                    handler) {

        Validate.notBlank(request.getSteeringPolicyId(), "steeringPolicyId must not be blank");

        return clientCall(request, DeleteSteeringPolicyResponse::builder)
                .logger(LOG, "deleteSteeringPolicy")
                .serviceDetails("Dns", "DeleteSteeringPolicy", "")
                .method(com.oracle.bmc.http.client.Method.DELETE)
                .requestBuilder(DeleteSteeringPolicyRequest::builder)
                .basePath("/20180115")
                .appendPathParam("steeringPolicies")
                .appendPathParam(request.getSteeringPolicyId())
                .appendEnumQueryParam("scope", request.getScope())
                .accept("application/json")
                .appendHeader("If-Match", request.getIfMatch())
                .appendHeader("If-Unmodified-Since", request.getIfUnmodifiedSince())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleResponseHeaderString(
                        "opc-request-id", DeleteSteeringPolicyResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<DeleteSteeringPolicyAttachmentResponse>
            deleteSteeringPolicyAttachment(
                    DeleteSteeringPolicyAttachmentRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    DeleteSteeringPolicyAttachmentRequest,
                                    DeleteSteeringPolicyAttachmentResponse>
                            handler) {

        Validate.notBlank(
                request.getSteeringPolicyAttachmentId(),
                "steeringPolicyAttachmentId must not be blank");

        return clientCall(request, DeleteSteeringPolicyAttachmentResponse::builder)
                .logger(LOG, "deleteSteeringPolicyAttachment")
                .serviceDetails("Dns", "DeleteSteeringPolicyAttachment", "")
                .method(com.oracle.bmc.http.client.Method.DELETE)
                .requestBuilder(DeleteSteeringPolicyAttachmentRequest::builder)
                .basePath("/20180115")
                .appendPathParam("steeringPolicyAttachments")
                .appendPathParam(request.getSteeringPolicyAttachmentId())
                .appendEnumQueryParam("scope", request.getScope())
                .accept("application/json")
                .appendHeader("If-Match", request.getIfMatch())
                .appendHeader("If-Unmodified-Since", request.getIfUnmodifiedSince())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleResponseHeaderString(
                        "opc-request-id",
                        DeleteSteeringPolicyAttachmentResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<DeleteTsigKeyResponse> deleteTsigKey(
            DeleteTsigKeyRequest request,
            final com.oracle.bmc.responses.AsyncHandler<DeleteTsigKeyRequest, DeleteTsigKeyResponse>
                    handler) {

        Validate.notBlank(request.getTsigKeyId(), "tsigKeyId must not be blank");

        return clientCall(request, DeleteTsigKeyResponse::builder)
                .logger(LOG, "deleteTsigKey")
                .serviceDetails("Dns", "DeleteTsigKey", "")
                .method(com.oracle.bmc.http.client.Method.DELETE)
                .requestBuilder(DeleteTsigKeyRequest::builder)
                .basePath("/20180115")
                .appendPathParam("tsigKeys")
                .appendPathParam(request.getTsigKeyId())
                .appendEnumQueryParam("scope", request.getScope())
                .accept("application/json")
                .appendHeader("If-Match", request.getIfMatch())
                .appendHeader("If-Unmodified-Since", request.getIfUnmodifiedSince())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleResponseHeaderString(
                        "opc-request-id", DeleteTsigKeyResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-work-request-id", DeleteTsigKeyResponse.Builder::opcWorkRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<DeleteViewResponse> deleteView(
            DeleteViewRequest request,
            final com.oracle.bmc.responses.AsyncHandler<DeleteViewRequest, DeleteViewResponse>
                    handler) {

        Validate.notBlank(request.getViewId(), "viewId must not be blank");

        return clientCall(request, DeleteViewResponse::builder)
                .logger(LOG, "deleteView")
                .serviceDetails(
                        "Dns",
                        "DeleteView",
                        "https://docs.oracle.com/iaas/api/#/en/dns/20180115/View/DeleteView")
                .method(com.oracle.bmc.http.client.Method.DELETE)
                .requestBuilder(DeleteViewRequest::builder)
                .basePath("/20180115")
                .appendPathParam("views")
                .appendPathParam(request.getViewId())
                .appendEnumQueryParam("scope", request.getScope())
                .accept("application/json")
                .appendHeader("If-Match", request.getIfMatch())
                .appendHeader("If-Unmodified-Since", request.getIfUnmodifiedSince())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleResponseHeaderString(
                        "opc-request-id", DeleteViewResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-work-request-id", DeleteViewResponse.Builder::opcWorkRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<DeleteZoneResponse> deleteZone(
            DeleteZoneRequest request,
            final com.oracle.bmc.responses.AsyncHandler<DeleteZoneRequest, DeleteZoneResponse>
                    handler) {

        Validate.notBlank(request.getZoneNameOrId(), "zoneNameOrId must not be blank");

        return clientCall(request, DeleteZoneResponse::builder)
                .logger(LOG, "deleteZone")
                .serviceDetails("Dns", "DeleteZone", "")
                .method(com.oracle.bmc.http.client.Method.DELETE)
                .requestBuilder(DeleteZoneRequest::builder)
                .basePath("/20180115")
                .appendPathParam("zones")
                .appendPathParam(request.getZoneNameOrId())
                .appendEnumQueryParam("scope", request.getScope())
                .appendQueryParam("viewId", request.getViewId())
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .accept("application/json")
                .appendHeader("If-Match", request.getIfMatch())
                .appendHeader("If-Unmodified-Since", request.getIfUnmodifiedSince())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleResponseHeaderString(
                        "opc-request-id", DeleteZoneResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-work-request-id", DeleteZoneResponse.Builder::opcWorkRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<GetDomainRecordsResponse> getDomainRecords(
            GetDomainRecordsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetDomainRecordsRequest, GetDomainRecordsResponse>
                    handler) {

        Validate.notBlank(request.getZoneNameOrId(), "zoneNameOrId must not be blank");

        Validate.notBlank(request.getDomain(), "domain must not be blank");

        return clientCall(request, GetDomainRecordsResponse::builder)
                .logger(LOG, "getDomainRecords")
                .serviceDetails(
                        "Dns",
                        "GetDomainRecords",
                        "https://docs.oracle.com/iaas/api/#/en/dns/20180115/Records/GetDomainRecords")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetDomainRecordsRequest::builder)
                .basePath("/20180115")
                .appendPathParam("zones")
                .appendPathParam(request.getZoneNameOrId())
                .appendPathParam("records")
                .appendPathParam(request.getDomain())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendQueryParam("zoneVersion", request.getZoneVersion())
                .appendQueryParam("rtype", request.getRtype())
                .appendEnumQueryParam("scope", request.getScope())
                .appendQueryParam("viewId", request.getViewId())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .accept("application/json")
                .appendHeader("If-None-Match", request.getIfNoneMatch())
                .appendHeader("If-Modified-Since", request.getIfModifiedSince())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.dns.model.RecordCollection.class,
                        GetDomainRecordsResponse.Builder::recordCollection)
                .handleResponseHeaderString(
                        "opc-next-page", GetDomainRecordsResponse.Builder::opcNextPage)
                .handleResponseHeaderInteger(
                        "opc-total-items", GetDomainRecordsResponse.Builder::opcTotalItems)
                .handleResponseHeaderString(
                        "opc-request-id", GetDomainRecordsResponse.Builder::opcRequestId)
                .handleResponseHeaderString("ETag", GetDomainRecordsResponse.Builder::eTag)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<GetRRSetResponse> getRRSet(
            GetRRSetRequest request,
            final com.oracle.bmc.responses.AsyncHandler<GetRRSetRequest, GetRRSetResponse>
                    handler) {

        Validate.notBlank(request.getZoneNameOrId(), "zoneNameOrId must not be blank");

        Validate.notBlank(request.getDomain(), "domain must not be blank");

        Validate.notBlank(request.getRtype(), "rtype must not be blank");

        return clientCall(request, GetRRSetResponse::builder)
                .logger(LOG, "getRRSet")
                .serviceDetails(
                        "Dns",
                        "GetRRSet",
                        "https://docs.oracle.com/iaas/api/#/en/dns/20180115/RRSet/GetRRSet")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetRRSetRequest::builder)
                .basePath("/20180115")
                .appendPathParam("zones")
                .appendPathParam(request.getZoneNameOrId())
                .appendPathParam("records")
                .appendPathParam(request.getDomain())
                .appendPathParam(request.getRtype())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendQueryParam("zoneVersion", request.getZoneVersion())
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendEnumQueryParam("scope", request.getScope())
                .appendQueryParam("viewId", request.getViewId())
                .accept("application/json")
                .appendHeader("If-None-Match", request.getIfNoneMatch())
                .appendHeader("If-Modified-Since", request.getIfModifiedSince())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(com.oracle.bmc.dns.model.RRSet.class, GetRRSetResponse.Builder::rRSet)
                .handleResponseHeaderString("opc-next-page", GetRRSetResponse.Builder::opcNextPage)
                .handleResponseHeaderInteger(
                        "opc-total-items", GetRRSetResponse.Builder::opcTotalItems)
                .handleResponseHeaderString(
                        "opc-request-id", GetRRSetResponse.Builder::opcRequestId)
                .handleResponseHeaderString("ETag", GetRRSetResponse.Builder::eTag)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<GetResolverResponse> getResolver(
            GetResolverRequest request,
            final com.oracle.bmc.responses.AsyncHandler<GetResolverRequest, GetResolverResponse>
                    handler) {

        Validate.notBlank(request.getResolverId(), "resolverId must not be blank");

        return clientCall(request, GetResolverResponse::builder)
                .logger(LOG, "getResolver")
                .serviceDetails(
                        "Dns",
                        "GetResolver",
                        "https://docs.oracle.com/iaas/api/#/en/dns/20180115/Resolver/GetResolver")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetResolverRequest::builder)
                .basePath("/20180115")
                .appendPathParam("resolvers")
                .appendPathParam(request.getResolverId())
                .appendEnumQueryParam("scope", request.getScope())
                .accept("application/json")
                .appendHeader("If-Modified-Since", request.getIfModifiedSince())
                .appendHeader("If-None-Match", request.getIfNoneMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.dns.model.Resolver.class,
                        GetResolverResponse.Builder::resolver)
                .handleResponseHeaderString("etag", GetResolverResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", GetResolverResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<GetResolverEndpointResponse> getResolverEndpoint(
            GetResolverEndpointRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetResolverEndpointRequest, GetResolverEndpointResponse>
                    handler) {

        Validate.notBlank(request.getResolverId(), "resolverId must not be blank");

        Validate.notBlank(
                request.getResolverEndpointName(), "resolverEndpointName must not be blank");

        return clientCall(request, GetResolverEndpointResponse::builder)
                .logger(LOG, "getResolverEndpoint")
                .serviceDetails(
                        "Dns",
                        "GetResolverEndpoint",
                        "https://docs.oracle.com/iaas/api/#/en/dns/20180115/ResolverEndpoint/GetResolverEndpoint")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetResolverEndpointRequest::builder)
                .basePath("/20180115")
                .appendPathParam("resolvers")
                .appendPathParam(request.getResolverId())
                .appendPathParam("endpoints")
                .appendPathParam(request.getResolverEndpointName())
                .appendEnumQueryParam("scope", request.getScope())
                .accept("application/json")
                .appendHeader("If-Modified-Since", request.getIfModifiedSince())
                .appendHeader("If-None-Match", request.getIfNoneMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.dns.model.ResolverEndpoint.class,
                        GetResolverEndpointResponse.Builder::resolverEndpoint)
                .handleResponseHeaderString("etag", GetResolverEndpointResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", GetResolverEndpointResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<GetSteeringPolicyResponse> getSteeringPolicy(
            GetSteeringPolicyRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetSteeringPolicyRequest, GetSteeringPolicyResponse>
                    handler) {

        Validate.notBlank(request.getSteeringPolicyId(), "steeringPolicyId must not be blank");

        return clientCall(request, GetSteeringPolicyResponse::builder)
                .logger(LOG, "getSteeringPolicy")
                .serviceDetails(
                        "Dns",
                        "GetSteeringPolicy",
                        "https://docs.oracle.com/iaas/api/#/en/dns/20180115/SteeringPolicy/GetSteeringPolicy")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetSteeringPolicyRequest::builder)
                .basePath("/20180115")
                .appendPathParam("steeringPolicies")
                .appendPathParam(request.getSteeringPolicyId())
                .appendEnumQueryParam("scope", request.getScope())
                .accept("application/json")
                .appendHeader("If-None-Match", request.getIfNoneMatch())
                .appendHeader("If-Modified-Since", request.getIfModifiedSince())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.dns.model.SteeringPolicy.class,
                        GetSteeringPolicyResponse.Builder::steeringPolicy)
                .handleResponseHeaderString(
                        "opc-request-id", GetSteeringPolicyResponse.Builder::opcRequestId)
                .handleResponseHeaderString("ETag", GetSteeringPolicyResponse.Builder::eTag)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<GetSteeringPolicyAttachmentResponse>
            getSteeringPolicyAttachment(
                    GetSteeringPolicyAttachmentRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    GetSteeringPolicyAttachmentRequest,
                                    GetSteeringPolicyAttachmentResponse>
                            handler) {

        Validate.notBlank(
                request.getSteeringPolicyAttachmentId(),
                "steeringPolicyAttachmentId must not be blank");

        return clientCall(request, GetSteeringPolicyAttachmentResponse::builder)
                .logger(LOG, "getSteeringPolicyAttachment")
                .serviceDetails(
                        "Dns",
                        "GetSteeringPolicyAttachment",
                        "https://docs.oracle.com/iaas/api/#/en/dns/20180115/SteeringPolicyAttachment/GetSteeringPolicyAttachment")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetSteeringPolicyAttachmentRequest::builder)
                .basePath("/20180115")
                .appendPathParam("steeringPolicyAttachments")
                .appendPathParam(request.getSteeringPolicyAttachmentId())
                .appendEnumQueryParam("scope", request.getScope())
                .accept("application/json")
                .appendHeader("If-None-Match", request.getIfNoneMatch())
                .appendHeader("If-Modified-Since", request.getIfModifiedSince())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.dns.model.SteeringPolicyAttachment.class,
                        GetSteeringPolicyAttachmentResponse.Builder::steeringPolicyAttachment)
                .handleResponseHeaderString(
                        "opc-request-id", GetSteeringPolicyAttachmentResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "ETag", GetSteeringPolicyAttachmentResponse.Builder::eTag)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<GetTsigKeyResponse> getTsigKey(
            GetTsigKeyRequest request,
            final com.oracle.bmc.responses.AsyncHandler<GetTsigKeyRequest, GetTsigKeyResponse>
                    handler) {

        Validate.notBlank(request.getTsigKeyId(), "tsigKeyId must not be blank");

        return clientCall(request, GetTsigKeyResponse::builder)
                .logger(LOG, "getTsigKey")
                .serviceDetails(
                        "Dns",
                        "GetTsigKey",
                        "https://docs.oracle.com/iaas/api/#/en/dns/20180115/TsigKey/GetTsigKey")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetTsigKeyRequest::builder)
                .basePath("/20180115")
                .appendPathParam("tsigKeys")
                .appendPathParam(request.getTsigKeyId())
                .appendEnumQueryParam("scope", request.getScope())
                .accept("application/json")
                .appendHeader("If-None-Match", request.getIfNoneMatch())
                .appendHeader("If-Modified-Since", request.getIfModifiedSince())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.dns.model.TsigKey.class, GetTsigKeyResponse.Builder::tsigKey)
                .handleResponseHeaderString("ETag", GetTsigKeyResponse.Builder::eTag)
                .handleResponseHeaderString(
                        "opc-request-id", GetTsigKeyResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<GetViewResponse> getView(
            GetViewRequest request,
            final com.oracle.bmc.responses.AsyncHandler<GetViewRequest, GetViewResponse> handler) {

        Validate.notBlank(request.getViewId(), "viewId must not be blank");

        return clientCall(request, GetViewResponse::builder)
                .logger(LOG, "getView")
                .serviceDetails(
                        "Dns",
                        "GetView",
                        "https://docs.oracle.com/iaas/api/#/en/dns/20180115/View/GetView")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetViewRequest::builder)
                .basePath("/20180115")
                .appendPathParam("views")
                .appendPathParam(request.getViewId())
                .appendEnumQueryParam("scope", request.getScope())
                .accept("application/json")
                .appendHeader("If-Modified-Since", request.getIfModifiedSince())
                .appendHeader("If-None-Match", request.getIfNoneMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(com.oracle.bmc.dns.model.View.class, GetViewResponse.Builder::view)
                .handleResponseHeaderString("etag", GetViewResponse.Builder::etag)
                .handleResponseHeaderString("opc-request-id", GetViewResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<GetZoneResponse> getZone(
            GetZoneRequest request,
            final com.oracle.bmc.responses.AsyncHandler<GetZoneRequest, GetZoneResponse> handler) {

        Validate.notBlank(request.getZoneNameOrId(), "zoneNameOrId must not be blank");

        return clientCall(request, GetZoneResponse::builder)
                .logger(LOG, "getZone")
                .serviceDetails(
                        "Dns",
                        "GetZone",
                        "https://docs.oracle.com/iaas/api/#/en/dns/20180115/Zone/GetZone")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetZoneRequest::builder)
                .basePath("/20180115")
                .appendPathParam("zones")
                .appendPathParam(request.getZoneNameOrId())
                .appendEnumQueryParam("scope", request.getScope())
                .appendQueryParam("viewId", request.getViewId())
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .accept("application/json")
                .appendHeader("If-None-Match", request.getIfNoneMatch())
                .appendHeader("If-Modified-Since", request.getIfModifiedSince())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(com.oracle.bmc.dns.model.Zone.class, GetZoneResponse.Builder::zone)
                .handleResponseHeaderString("opc-request-id", GetZoneResponse.Builder::opcRequestId)
                .handleResponseHeaderString("ETag", GetZoneResponse.Builder::eTag)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<GetZoneContentResponse> getZoneContent(
            GetZoneContentRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetZoneContentRequest, GetZoneContentResponse>
                    handler) {

        Validate.notBlank(request.getZoneNameOrId(), "zoneNameOrId must not be blank");

        return clientCall(request, GetZoneContentResponse::builder)
                .logger(LOG, "getZoneContent")
                .serviceDetails(
                        "Dns",
                        "GetZoneContent",
                        "https://docs.oracle.com/iaas/api/#/en/dns/20180115/Zone/GetZoneContent")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetZoneContentRequest::builder)
                .basePath("/20180115")
                .appendPathParam("zones")
                .appendPathParam(request.getZoneNameOrId())
                .appendPathParam("content")
                .appendEnumQueryParam("scope", request.getScope())
                .appendQueryParam("viewId", request.getViewId())
                .accept("text/dns")
                .appendHeader("If-None-Match", request.getIfNoneMatch())
                .appendHeader("If-Modified-Since", request.getIfModifiedSince())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(java.io.InputStream.class, GetZoneContentResponse.Builder::inputStream)
                .handleResponseHeaderString("etag", GetZoneContentResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", GetZoneContentResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<GetZoneRecordsResponse> getZoneRecords(
            GetZoneRecordsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetZoneRecordsRequest, GetZoneRecordsResponse>
                    handler) {

        Validate.notBlank(request.getZoneNameOrId(), "zoneNameOrId must not be blank");

        return clientCall(request, GetZoneRecordsResponse::builder)
                .logger(LOG, "getZoneRecords")
                .serviceDetails(
                        "Dns",
                        "GetZoneRecords",
                        "https://docs.oracle.com/iaas/api/#/en/dns/20180115/Records/GetZoneRecords")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetZoneRecordsRequest::builder)
                .basePath("/20180115")
                .appendPathParam("zones")
                .appendPathParam(request.getZoneNameOrId())
                .appendPathParam("records")
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendQueryParam("zoneVersion", request.getZoneVersion())
                .appendQueryParam("domain", request.getDomain())
                .appendQueryParam("domainContains", request.getDomainContains())
                .appendQueryParam("rtype", request.getRtype())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendEnumQueryParam("scope", request.getScope())
                .appendQueryParam("viewId", request.getViewId())
                .accept("application/json")
                .appendHeader("If-None-Match", request.getIfNoneMatch())
                .appendHeader("If-Modified-Since", request.getIfModifiedSince())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.dns.model.RecordCollection.class,
                        GetZoneRecordsResponse.Builder::recordCollection)
                .handleResponseHeaderString(
                        "opc-next-page", GetZoneRecordsResponse.Builder::opcNextPage)
                .handleResponseHeaderInteger(
                        "opc-total-items", GetZoneRecordsResponse.Builder::opcTotalItems)
                .handleResponseHeaderString(
                        "opc-request-id", GetZoneRecordsResponse.Builder::opcRequestId)
                .handleResponseHeaderString("ETag", GetZoneRecordsResponse.Builder::eTag)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListResolverEndpointsResponse> listResolverEndpoints(
            ListResolverEndpointsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListResolverEndpointsRequest, ListResolverEndpointsResponse>
                    handler) {

        Validate.notBlank(request.getResolverId(), "resolverId must not be blank");

        return clientCall(request, ListResolverEndpointsResponse::builder)
                .logger(LOG, "listResolverEndpoints")
                .serviceDetails(
                        "Dns",
                        "ListResolverEndpoints",
                        "https://docs.oracle.com/iaas/api/#/en/dns/20180115/ResolverEndpoint/ListResolverEndpoints")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListResolverEndpointsRequest::builder)
                .basePath("/20180115")
                .appendPathParam("resolvers")
                .appendPathParam(request.getResolverId())
                .appendPathParam("endpoints")
                .appendQueryParam("name", request.getName())
                .appendQueryParam("page", request.getPage())
                .appendQueryParam("limit", request.getLimit())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .appendEnumQueryParam("lifecycleState", request.getLifecycleState())
                .appendEnumQueryParam("scope", request.getScope())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBodyList(
                        com.oracle.bmc.dns.model.ResolverEndpointSummary.class,
                        ListResolverEndpointsResponse.Builder::items)
                .handleResponseHeaderString(
                        "opc-request-id", ListResolverEndpointsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListResolverEndpointsResponse.Builder::opcNextPage)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListResolversResponse> listResolvers(
            ListResolversRequest request,
            final com.oracle.bmc.responses.AsyncHandler<ListResolversRequest, ListResolversResponse>
                    handler) {
        Objects.requireNonNull(request.getCompartmentId(), "compartmentId is required");

        return clientCall(request, ListResolversResponse::builder)
                .logger(LOG, "listResolvers")
                .serviceDetails(
                        "Dns",
                        "ListResolvers",
                        "https://docs.oracle.com/iaas/api/#/en/dns/20180115/Resolver/ListResolvers")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListResolversRequest::builder)
                .basePath("/20180115")
                .appendPathParam("resolvers")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendQueryParam("displayName", request.getDisplayName())
                .appendQueryParam("id", request.getId())
                .appendQueryParam("page", request.getPage())
                .appendQueryParam("limit", request.getLimit())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .appendEnumQueryParam("lifecycleState", request.getLifecycleState())
                .appendEnumQueryParam("scope", request.getScope())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBodyList(
                        com.oracle.bmc.dns.model.ResolverSummary.class,
                        ListResolversResponse.Builder::items)
                .handleResponseHeaderString(
                        "opc-request-id", ListResolversResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListResolversResponse.Builder::opcNextPage)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListSteeringPoliciesResponse> listSteeringPolicies(
            ListSteeringPoliciesRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListSteeringPoliciesRequest, ListSteeringPoliciesResponse>
                    handler) {
        Objects.requireNonNull(request.getCompartmentId(), "compartmentId is required");

        return clientCall(request, ListSteeringPoliciesResponse::builder)
                .logger(LOG, "listSteeringPolicies")
                .serviceDetails(
                        "Dns",
                        "ListSteeringPolicies",
                        "https://docs.oracle.com/iaas/api/#/en/dns/20180115/SteeringPolicy/ListSteeringPolicies")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListSteeringPoliciesRequest::builder)
                .basePath("/20180115")
                .appendPathParam("steeringPolicies")
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendQueryParam("id", request.getId())
                .appendQueryParam("displayName", request.getDisplayName())
                .appendQueryParam("displayNameContains", request.getDisplayNameContains())
                .appendQueryParam("healthCheckMonitorId", request.getHealthCheckMonitorId())
                .appendQueryParam(
                        "timeCreatedGreaterThanOrEqualTo",
                        request.getTimeCreatedGreaterThanOrEqualTo())
                .appendQueryParam("timeCreatedLessThan", request.getTimeCreatedLessThan())
                .appendQueryParam("template", request.getTemplate())
                .appendEnumQueryParam("lifecycleState", request.getLifecycleState())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("scope", request.getScope())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBodyList(
                        com.oracle.bmc.dns.model.SteeringPolicySummary.class,
                        ListSteeringPoliciesResponse.Builder::items)
                .handleResponseHeaderString(
                        "opc-next-page", ListSteeringPoliciesResponse.Builder::opcNextPage)
                .handleResponseHeaderInteger(
                        "opc-total-items", ListSteeringPoliciesResponse.Builder::opcTotalItems)
                .handleResponseHeaderString(
                        "opc-request-id", ListSteeringPoliciesResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListSteeringPolicyAttachmentsResponse>
            listSteeringPolicyAttachments(
                    ListSteeringPolicyAttachmentsRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ListSteeringPolicyAttachmentsRequest,
                                    ListSteeringPolicyAttachmentsResponse>
                            handler) {
        Objects.requireNonNull(request.getCompartmentId(), "compartmentId is required");

        return clientCall(request, ListSteeringPolicyAttachmentsResponse::builder)
                .logger(LOG, "listSteeringPolicyAttachments")
                .serviceDetails(
                        "Dns",
                        "ListSteeringPolicyAttachments",
                        "https://docs.oracle.com/iaas/api/#/en/dns/20180115/SteeringPolicyAttachment/ListSteeringPolicyAttachments")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListSteeringPolicyAttachmentsRequest::builder)
                .basePath("/20180115")
                .appendPathParam("steeringPolicyAttachments")
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendQueryParam("id", request.getId())
                .appendQueryParam("displayName", request.getDisplayName())
                .appendQueryParam("steeringPolicyId", request.getSteeringPolicyId())
                .appendQueryParam("zoneId", request.getZoneId())
                .appendQueryParam("domain", request.getDomain())
                .appendQueryParam("domainContains", request.getDomainContains())
                .appendQueryParam(
                        "timeCreatedGreaterThanOrEqualTo",
                        request.getTimeCreatedGreaterThanOrEqualTo())
                .appendQueryParam("timeCreatedLessThan", request.getTimeCreatedLessThan())
                .appendEnumQueryParam("lifecycleState", request.getLifecycleState())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("scope", request.getScope())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBodyList(
                        com.oracle.bmc.dns.model.SteeringPolicyAttachmentSummary.class,
                        ListSteeringPolicyAttachmentsResponse.Builder::items)
                .handleResponseHeaderString(
                        "opc-next-page", ListSteeringPolicyAttachmentsResponse.Builder::opcNextPage)
                .handleResponseHeaderInteger(
                        "opc-total-items",
                        ListSteeringPolicyAttachmentsResponse.Builder::opcTotalItems)
                .handleResponseHeaderString(
                        "opc-request-id",
                        ListSteeringPolicyAttachmentsResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListTsigKeysResponse> listTsigKeys(
            ListTsigKeysRequest request,
            final com.oracle.bmc.responses.AsyncHandler<ListTsigKeysRequest, ListTsigKeysResponse>
                    handler) {
        Objects.requireNonNull(request.getCompartmentId(), "compartmentId is required");

        return clientCall(request, ListTsigKeysResponse::builder)
                .logger(LOG, "listTsigKeys")
                .serviceDetails(
                        "Dns",
                        "ListTsigKeys",
                        "https://docs.oracle.com/iaas/api/#/en/dns/20180115/TsigKey/ListTsigKeys")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListTsigKeysRequest::builder)
                .basePath("/20180115")
                .appendPathParam("tsigKeys")
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendQueryParam("id", request.getId())
                .appendQueryParam("name", request.getName())
                .appendEnumQueryParam("lifecycleState", request.getLifecycleState())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("scope", request.getScope())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBodyList(
                        com.oracle.bmc.dns.model.TsigKeySummary.class,
                        ListTsigKeysResponse.Builder::items)
                .handleResponseHeaderString(
                        "opc-next-page", ListTsigKeysResponse.Builder::opcNextPage)
                .handleResponseHeaderString(
                        "opc-request-id", ListTsigKeysResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListViewsResponse> listViews(
            ListViewsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<ListViewsRequest, ListViewsResponse>
                    handler) {
        Objects.requireNonNull(request.getCompartmentId(), "compartmentId is required");

        return clientCall(request, ListViewsResponse::builder)
                .logger(LOG, "listViews")
                .serviceDetails(
                        "Dns",
                        "ListViews",
                        "https://docs.oracle.com/iaas/api/#/en/dns/20180115/View/ListViews")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListViewsRequest::builder)
                .basePath("/20180115")
                .appendPathParam("views")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendQueryParam("displayName", request.getDisplayName())
                .appendQueryParam("id", request.getId())
                .appendQueryParam("page", request.getPage())
                .appendQueryParam("limit", request.getLimit())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .appendEnumQueryParam("lifecycleState", request.getLifecycleState())
                .appendEnumQueryParam("scope", request.getScope())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBodyList(
                        com.oracle.bmc.dns.model.ViewSummary.class,
                        ListViewsResponse.Builder::items)
                .handleResponseHeaderString(
                        "opc-request-id", ListViewsResponse.Builder::opcRequestId)
                .handleResponseHeaderString("opc-next-page", ListViewsResponse.Builder::opcNextPage)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListZoneTransferServersResponse> listZoneTransferServers(
            ListZoneTransferServersRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListZoneTransferServersRequest, ListZoneTransferServersResponse>
                    handler) {
        Objects.requireNonNull(request.getCompartmentId(), "compartmentId is required");

        return clientCall(request, ListZoneTransferServersResponse::builder)
                .logger(LOG, "listZoneTransferServers")
                .serviceDetails(
                        "Dns",
                        "ListZoneTransferServers",
                        "https://docs.oracle.com/iaas/api/#/en/dns/20180115/ZoneTransferServer/ListZoneTransferServers")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListZoneTransferServersRequest::builder)
                .basePath("/20180115")
                .appendPathParam("zoneTransferServers")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendEnumQueryParam("scope", request.getScope())
                .appendQueryParam("page", request.getPage())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBodyList(
                        com.oracle.bmc.dns.model.ZoneTransferServer.class,
                        ListZoneTransferServersResponse.Builder::items)
                .handleResponseHeaderString(
                        "opc-request-id", ListZoneTransferServersResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListZoneTransferServersResponse.Builder::opcNextPage)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListZonesResponse> listZones(
            ListZonesRequest request,
            final com.oracle.bmc.responses.AsyncHandler<ListZonesRequest, ListZonesResponse>
                    handler) {
        Objects.requireNonNull(request.getCompartmentId(), "compartmentId is required");

        return clientCall(request, ListZonesResponse::builder)
                .logger(LOG, "listZones")
                .serviceDetails(
                        "Dns",
                        "ListZones",
                        "https://docs.oracle.com/iaas/api/#/en/dns/20180115/Zone/ListZones")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListZonesRequest::builder)
                .basePath("/20180115")
                .appendPathParam("zones")
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendQueryParam("name", request.getName())
                .appendQueryParam("nameContains", request.getNameContains())
                .appendEnumQueryParam("zoneType", request.getZoneType())
                .appendQueryParam(
                        "timeCreatedGreaterThanOrEqualTo",
                        request.getTimeCreatedGreaterThanOrEqualTo())
                .appendQueryParam("timeCreatedLessThan", request.getTimeCreatedLessThan())
                .appendEnumQueryParam("lifecycleState", request.getLifecycleState())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("scope", request.getScope())
                .appendQueryParam("viewId", request.getViewId())
                .appendQueryParam("tsigKeyId", request.getTsigKeyId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBodyList(
                        com.oracle.bmc.dns.model.ZoneSummary.class,
                        ListZonesResponse.Builder::items)
                .handleResponseHeaderString("opc-next-page", ListZonesResponse.Builder::opcNextPage)
                .handleResponseHeaderInteger(
                        "opc-total-items", ListZonesResponse.Builder::opcTotalItems)
                .handleResponseHeaderString(
                        "opc-request-id", ListZonesResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<PatchDomainRecordsResponse> patchDomainRecords(
            PatchDomainRecordsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            PatchDomainRecordsRequest, PatchDomainRecordsResponse>
                    handler) {

        Validate.notBlank(request.getZoneNameOrId(), "zoneNameOrId must not be blank");

        Validate.notBlank(request.getDomain(), "domain must not be blank");
        Objects.requireNonNull(
                request.getPatchDomainRecordsDetails(), "patchDomainRecordsDetails is required");

        return clientCall(request, PatchDomainRecordsResponse::builder)
                .logger(LOG, "patchDomainRecords")
                .serviceDetails(
                        "Dns",
                        "PatchDomainRecords",
                        "https://docs.oracle.com/iaas/api/#/en/dns/20180115/Records/PatchDomainRecords")
                .method(com.oracle.bmc.http.client.Method.PATCH)
                .requestBuilder(PatchDomainRecordsRequest::builder)
                .basePath("/20180115")
                .appendPathParam("zones")
                .appendPathParam(request.getZoneNameOrId())
                .appendPathParam("records")
                .appendPathParam(request.getDomain())
                .appendEnumQueryParam("scope", request.getScope())
                .appendQueryParam("viewId", request.getViewId())
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .accept("application/json")
                .appendHeader("If-Match", request.getIfMatch())
                .appendHeader("If-Unmodified-Since", request.getIfUnmodifiedSince())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.dns.model.RecordCollection.class,
                        PatchDomainRecordsResponse.Builder::recordCollection)
                .handleResponseHeaderString(
                        "opc-next-page", PatchDomainRecordsResponse.Builder::opcNextPage)
                .handleResponseHeaderInteger(
                        "opc-total-items", PatchDomainRecordsResponse.Builder::opcTotalItems)
                .handleResponseHeaderString(
                        "opc-request-id", PatchDomainRecordsResponse.Builder::opcRequestId)
                .handleResponseHeaderString("ETag", PatchDomainRecordsResponse.Builder::eTag)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<PatchRRSetResponse> patchRRSet(
            PatchRRSetRequest request,
            final com.oracle.bmc.responses.AsyncHandler<PatchRRSetRequest, PatchRRSetResponse>
                    handler) {

        Validate.notBlank(request.getZoneNameOrId(), "zoneNameOrId must not be blank");

        Validate.notBlank(request.getDomain(), "domain must not be blank");

        Validate.notBlank(request.getRtype(), "rtype must not be blank");
        Objects.requireNonNull(request.getPatchRRSetDetails(), "patchRRSetDetails is required");

        return clientCall(request, PatchRRSetResponse::builder)
                .logger(LOG, "patchRRSet")
                .serviceDetails(
                        "Dns",
                        "PatchRRSet",
                        "https://docs.oracle.com/iaas/api/#/en/dns/20180115/RRSet/PatchRRSet")
                .method(com.oracle.bmc.http.client.Method.PATCH)
                .requestBuilder(PatchRRSetRequest::builder)
                .basePath("/20180115")
                .appendPathParam("zones")
                .appendPathParam(request.getZoneNameOrId())
                .appendPathParam("records")
                .appendPathParam(request.getDomain())
                .appendPathParam(request.getRtype())
                .appendEnumQueryParam("scope", request.getScope())
                .appendQueryParam("viewId", request.getViewId())
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .accept("application/json")
                .appendHeader("If-Match", request.getIfMatch())
                .appendHeader("If-Unmodified-Since", request.getIfUnmodifiedSince())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.dns.model.RecordCollection.class,
                        PatchRRSetResponse.Builder::recordCollection)
                .handleResponseHeaderString(
                        "opc-next-page", PatchRRSetResponse.Builder::opcNextPage)
                .handleResponseHeaderInteger(
                        "opc-total-items", PatchRRSetResponse.Builder::opcTotalItems)
                .handleResponseHeaderString(
                        "opc-request-id", PatchRRSetResponse.Builder::opcRequestId)
                .handleResponseHeaderString("ETag", PatchRRSetResponse.Builder::eTag)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<PatchZoneRecordsResponse> patchZoneRecords(
            PatchZoneRecordsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            PatchZoneRecordsRequest, PatchZoneRecordsResponse>
                    handler) {

        Validate.notBlank(request.getZoneNameOrId(), "zoneNameOrId must not be blank");
        Objects.requireNonNull(
                request.getPatchZoneRecordsDetails(), "patchZoneRecordsDetails is required");

        return clientCall(request, PatchZoneRecordsResponse::builder)
                .logger(LOG, "patchZoneRecords")
                .serviceDetails(
                        "Dns",
                        "PatchZoneRecords",
                        "https://docs.oracle.com/iaas/api/#/en/dns/20180115/Records/PatchZoneRecords")
                .method(com.oracle.bmc.http.client.Method.PATCH)
                .requestBuilder(PatchZoneRecordsRequest::builder)
                .basePath("/20180115")
                .appendPathParam("zones")
                .appendPathParam(request.getZoneNameOrId())
                .appendPathParam("records")
                .appendEnumQueryParam("scope", request.getScope())
                .appendQueryParam("viewId", request.getViewId())
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .accept("application/json")
                .appendHeader("If-Match", request.getIfMatch())
                .appendHeader("If-Unmodified-Since", request.getIfUnmodifiedSince())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.dns.model.RecordCollection.class,
                        PatchZoneRecordsResponse.Builder::recordCollection)
                .handleResponseHeaderString(
                        "opc-next-page", PatchZoneRecordsResponse.Builder::opcNextPage)
                .handleResponseHeaderInteger(
                        "opc-total-items", PatchZoneRecordsResponse.Builder::opcTotalItems)
                .handleResponseHeaderString(
                        "opc-request-id", PatchZoneRecordsResponse.Builder::opcRequestId)
                .handleResponseHeaderString("ETag", PatchZoneRecordsResponse.Builder::eTag)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<UpdateDomainRecordsResponse> updateDomainRecords(
            UpdateDomainRecordsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            UpdateDomainRecordsRequest, UpdateDomainRecordsResponse>
                    handler) {

        Validate.notBlank(request.getZoneNameOrId(), "zoneNameOrId must not be blank");

        Validate.notBlank(request.getDomain(), "domain must not be blank");
        Objects.requireNonNull(
                request.getUpdateDomainRecordsDetails(), "updateDomainRecordsDetails is required");

        return clientCall(request, UpdateDomainRecordsResponse::builder)
                .logger(LOG, "updateDomainRecords")
                .serviceDetails(
                        "Dns",
                        "UpdateDomainRecords",
                        "https://docs.oracle.com/iaas/api/#/en/dns/20180115/Records/UpdateDomainRecords")
                .method(com.oracle.bmc.http.client.Method.PUT)
                .requestBuilder(UpdateDomainRecordsRequest::builder)
                .basePath("/20180115")
                .appendPathParam("zones")
                .appendPathParam(request.getZoneNameOrId())
                .appendPathParam("records")
                .appendPathParam(request.getDomain())
                .appendEnumQueryParam("scope", request.getScope())
                .appendQueryParam("viewId", request.getViewId())
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .accept("application/json")
                .appendHeader("If-Match", request.getIfMatch())
                .appendHeader("If-Unmodified-Since", request.getIfUnmodifiedSince())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.dns.model.RecordCollection.class,
                        UpdateDomainRecordsResponse.Builder::recordCollection)
                .handleResponseHeaderString(
                        "opc-next-page", UpdateDomainRecordsResponse.Builder::opcNextPage)
                .handleResponseHeaderInteger(
                        "opc-total-items", UpdateDomainRecordsResponse.Builder::opcTotalItems)
                .handleResponseHeaderString(
                        "opc-request-id", UpdateDomainRecordsResponse.Builder::opcRequestId)
                .handleResponseHeaderString("ETag", UpdateDomainRecordsResponse.Builder::eTag)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<UpdateRRSetResponse> updateRRSet(
            UpdateRRSetRequest request,
            final com.oracle.bmc.responses.AsyncHandler<UpdateRRSetRequest, UpdateRRSetResponse>
                    handler) {

        Validate.notBlank(request.getZoneNameOrId(), "zoneNameOrId must not be blank");

        Validate.notBlank(request.getDomain(), "domain must not be blank");

        Validate.notBlank(request.getRtype(), "rtype must not be blank");
        Objects.requireNonNull(request.getUpdateRRSetDetails(), "updateRRSetDetails is required");

        return clientCall(request, UpdateRRSetResponse::builder)
                .logger(LOG, "updateRRSet")
                .serviceDetails(
                        "Dns",
                        "UpdateRRSet",
                        "https://docs.oracle.com/iaas/api/#/en/dns/20180115/RRSet/UpdateRRSet")
                .method(com.oracle.bmc.http.client.Method.PUT)
                .requestBuilder(UpdateRRSetRequest::builder)
                .basePath("/20180115")
                .appendPathParam("zones")
                .appendPathParam(request.getZoneNameOrId())
                .appendPathParam("records")
                .appendPathParam(request.getDomain())
                .appendPathParam(request.getRtype())
                .appendEnumQueryParam("scope", request.getScope())
                .appendQueryParam("viewId", request.getViewId())
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .accept("application/json")
                .appendHeader("If-Match", request.getIfMatch())
                .appendHeader("If-Unmodified-Since", request.getIfUnmodifiedSince())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.dns.model.RecordCollection.class,
                        UpdateRRSetResponse.Builder::recordCollection)
                .handleResponseHeaderString(
                        "opc-next-page", UpdateRRSetResponse.Builder::opcNextPage)
                .handleResponseHeaderInteger(
                        "opc-total-items", UpdateRRSetResponse.Builder::opcTotalItems)
                .handleResponseHeaderString(
                        "opc-request-id", UpdateRRSetResponse.Builder::opcRequestId)
                .handleResponseHeaderString("ETag", UpdateRRSetResponse.Builder::eTag)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<UpdateResolverResponse> updateResolver(
            UpdateResolverRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            UpdateResolverRequest, UpdateResolverResponse>
                    handler) {

        Validate.notBlank(request.getResolverId(), "resolverId must not be blank");
        Objects.requireNonNull(
                request.getUpdateResolverDetails(), "updateResolverDetails is required");

        return clientCall(request, UpdateResolverResponse::builder)
                .logger(LOG, "updateResolver")
                .serviceDetails(
                        "Dns",
                        "UpdateResolver",
                        "https://docs.oracle.com/iaas/api/#/en/dns/20180115/Resolver/UpdateResolver")
                .method(com.oracle.bmc.http.client.Method.PUT)
                .requestBuilder(UpdateResolverRequest::builder)
                .basePath("/20180115")
                .appendPathParam("resolvers")
                .appendPathParam(request.getResolverId())
                .appendEnumQueryParam("scope", request.getScope())
                .accept("application/json")
                .appendHeader("If-Match", request.getIfMatch())
                .appendHeader("If-Unmodified-Since", request.getIfUnmodifiedSince())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.dns.model.Resolver.class,
                        UpdateResolverResponse.Builder::resolver)
                .handleResponseHeaderString("etag", UpdateResolverResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", UpdateResolverResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-work-request-id", UpdateResolverResponse.Builder::opcWorkRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<UpdateResolverEndpointResponse> updateResolverEndpoint(
            UpdateResolverEndpointRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            UpdateResolverEndpointRequest, UpdateResolverEndpointResponse>
                    handler) {

        Validate.notBlank(request.getResolverId(), "resolverId must not be blank");

        Validate.notBlank(
                request.getResolverEndpointName(), "resolverEndpointName must not be blank");
        Objects.requireNonNull(
                request.getUpdateResolverEndpointDetails(),
                "updateResolverEndpointDetails is required");

        return clientCall(request, UpdateResolverEndpointResponse::builder)
                .logger(LOG, "updateResolverEndpoint")
                .serviceDetails(
                        "Dns",
                        "UpdateResolverEndpoint",
                        "https://docs.oracle.com/iaas/api/#/en/dns/20180115/ResolverEndpoint/UpdateResolverEndpoint")
                .method(com.oracle.bmc.http.client.Method.PUT)
                .requestBuilder(UpdateResolverEndpointRequest::builder)
                .basePath("/20180115")
                .appendPathParam("resolvers")
                .appendPathParam(request.getResolverId())
                .appendPathParam("endpoints")
                .appendPathParam(request.getResolverEndpointName())
                .appendEnumQueryParam("scope", request.getScope())
                .accept("application/json")
                .appendHeader("If-Match", request.getIfMatch())
                .appendHeader("If-Unmodified-Since", request.getIfUnmodifiedSince())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.dns.model.ResolverEndpoint.class,
                        UpdateResolverEndpointResponse.Builder::resolverEndpoint)
                .handleResponseHeaderString("etag", UpdateResolverEndpointResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", UpdateResolverEndpointResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        UpdateResolverEndpointResponse.Builder::opcWorkRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<UpdateSteeringPolicyResponse> updateSteeringPolicy(
            UpdateSteeringPolicyRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            UpdateSteeringPolicyRequest, UpdateSteeringPolicyResponse>
                    handler) {

        Validate.notBlank(request.getSteeringPolicyId(), "steeringPolicyId must not be blank");
        Objects.requireNonNull(
                request.getUpdateSteeringPolicyDetails(),
                "updateSteeringPolicyDetails is required");

        return clientCall(request, UpdateSteeringPolicyResponse::builder)
                .logger(LOG, "updateSteeringPolicy")
                .serviceDetails(
                        "Dns",
                        "UpdateSteeringPolicy",
                        "https://docs.oracle.com/iaas/api/#/en/dns/20180115/SteeringPolicy/UpdateSteeringPolicy")
                .method(com.oracle.bmc.http.client.Method.PUT)
                .requestBuilder(UpdateSteeringPolicyRequest::builder)
                .basePath("/20180115")
                .appendPathParam("steeringPolicies")
                .appendPathParam(request.getSteeringPolicyId())
                .appendEnumQueryParam("scope", request.getScope())
                .accept("application/json")
                .appendHeader("If-Match", request.getIfMatch())
                .appendHeader("If-Unmodified-Since", request.getIfUnmodifiedSince())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.dns.model.SteeringPolicy.class,
                        UpdateSteeringPolicyResponse.Builder::steeringPolicy)
                .handleResponseHeaderString(
                        "opc-request-id", UpdateSteeringPolicyResponse.Builder::opcRequestId)
                .handleResponseHeaderString("ETag", UpdateSteeringPolicyResponse.Builder::eTag)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<UpdateSteeringPolicyAttachmentResponse>
            updateSteeringPolicyAttachment(
                    UpdateSteeringPolicyAttachmentRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    UpdateSteeringPolicyAttachmentRequest,
                                    UpdateSteeringPolicyAttachmentResponse>
                            handler) {

        Validate.notBlank(
                request.getSteeringPolicyAttachmentId(),
                "steeringPolicyAttachmentId must not be blank");
        Objects.requireNonNull(
                request.getUpdateSteeringPolicyAttachmentDetails(),
                "updateSteeringPolicyAttachmentDetails is required");

        return clientCall(request, UpdateSteeringPolicyAttachmentResponse::builder)
                .logger(LOG, "updateSteeringPolicyAttachment")
                .serviceDetails(
                        "Dns",
                        "UpdateSteeringPolicyAttachment",
                        "https://docs.oracle.com/iaas/api/#/en/dns/20180115/SteeringPolicyAttachment/UpdateSteeringPolicyAttachment")
                .method(com.oracle.bmc.http.client.Method.PUT)
                .requestBuilder(UpdateSteeringPolicyAttachmentRequest::builder)
                .basePath("/20180115")
                .appendPathParam("steeringPolicyAttachments")
                .appendPathParam(request.getSteeringPolicyAttachmentId())
                .appendEnumQueryParam("scope", request.getScope())
                .accept("application/json")
                .appendHeader("If-Match", request.getIfMatch())
                .appendHeader("If-Unmodified-Since", request.getIfUnmodifiedSince())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.dns.model.SteeringPolicyAttachment.class,
                        UpdateSteeringPolicyAttachmentResponse.Builder::steeringPolicyAttachment)
                .handleResponseHeaderString(
                        "opc-request-id",
                        UpdateSteeringPolicyAttachmentResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "ETag", UpdateSteeringPolicyAttachmentResponse.Builder::eTag)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<UpdateTsigKeyResponse> updateTsigKey(
            UpdateTsigKeyRequest request,
            final com.oracle.bmc.responses.AsyncHandler<UpdateTsigKeyRequest, UpdateTsigKeyResponse>
                    handler) {

        Validate.notBlank(request.getTsigKeyId(), "tsigKeyId must not be blank");
        Objects.requireNonNull(
                request.getUpdateTsigKeyDetails(), "updateTsigKeyDetails is required");

        return clientCall(request, UpdateTsigKeyResponse::builder)
                .logger(LOG, "updateTsigKey")
                .serviceDetails(
                        "Dns",
                        "UpdateTsigKey",
                        "https://docs.oracle.com/iaas/api/#/en/dns/20180115/TsigKey/UpdateTsigKey")
                .method(com.oracle.bmc.http.client.Method.PUT)
                .requestBuilder(UpdateTsigKeyRequest::builder)
                .basePath("/20180115")
                .appendPathParam("tsigKeys")
                .appendPathParam(request.getTsigKeyId())
                .appendEnumQueryParam("scope", request.getScope())
                .accept("application/json")
                .appendHeader("If-Match", request.getIfMatch())
                .appendHeader("If-Unmodified-Since", request.getIfUnmodifiedSince())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.dns.model.TsigKey.class,
                        UpdateTsigKeyResponse.Builder::tsigKey)
                .handleResponseHeaderString("ETag", UpdateTsigKeyResponse.Builder::eTag)
                .handleResponseHeaderString(
                        "opc-request-id", UpdateTsigKeyResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-work-request-id", UpdateTsigKeyResponse.Builder::opcWorkRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<UpdateViewResponse> updateView(
            UpdateViewRequest request,
            final com.oracle.bmc.responses.AsyncHandler<UpdateViewRequest, UpdateViewResponse>
                    handler) {

        Validate.notBlank(request.getViewId(), "viewId must not be blank");
        Objects.requireNonNull(request.getUpdateViewDetails(), "updateViewDetails is required");

        return clientCall(request, UpdateViewResponse::builder)
                .logger(LOG, "updateView")
                .serviceDetails(
                        "Dns",
                        "UpdateView",
                        "https://docs.oracle.com/iaas/api/#/en/dns/20180115/View/UpdateView")
                .method(com.oracle.bmc.http.client.Method.PUT)
                .requestBuilder(UpdateViewRequest::builder)
                .basePath("/20180115")
                .appendPathParam("views")
                .appendPathParam(request.getViewId())
                .appendEnumQueryParam("scope", request.getScope())
                .accept("application/json")
                .appendHeader("If-Match", request.getIfMatch())
                .appendHeader("If-Unmodified-Since", request.getIfUnmodifiedSince())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleBody(com.oracle.bmc.dns.model.View.class, UpdateViewResponse.Builder::view)
                .handleResponseHeaderString("etag", UpdateViewResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", UpdateViewResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-work-request-id", UpdateViewResponse.Builder::opcWorkRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<UpdateZoneResponse> updateZone(
            UpdateZoneRequest request,
            final com.oracle.bmc.responses.AsyncHandler<UpdateZoneRequest, UpdateZoneResponse>
                    handler) {

        Validate.notBlank(request.getZoneNameOrId(), "zoneNameOrId must not be blank");
        Objects.requireNonNull(request.getUpdateZoneDetails(), "updateZoneDetails is required");

        return clientCall(request, UpdateZoneResponse::builder)
                .logger(LOG, "updateZone")
                .serviceDetails(
                        "Dns",
                        "UpdateZone",
                        "https://docs.oracle.com/iaas/api/#/en/dns/20180115/Zone/UpdateZone")
                .method(com.oracle.bmc.http.client.Method.PUT)
                .requestBuilder(UpdateZoneRequest::builder)
                .basePath("/20180115")
                .appendPathParam("zones")
                .appendPathParam(request.getZoneNameOrId())
                .appendEnumQueryParam("scope", request.getScope())
                .appendQueryParam("viewId", request.getViewId())
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .accept("application/json")
                .appendHeader("If-Match", request.getIfMatch())
                .appendHeader("If-Unmodified-Since", request.getIfUnmodifiedSince())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleBody(com.oracle.bmc.dns.model.Zone.class, UpdateZoneResponse.Builder::zone)
                .handleResponseHeaderString("ETag", UpdateZoneResponse.Builder::eTag)
                .handleResponseHeaderString(
                        "opc-request-id", UpdateZoneResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-work-request-id", UpdateZoneResponse.Builder::opcWorkRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<UpdateZoneRecordsResponse> updateZoneRecords(
            UpdateZoneRecordsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            UpdateZoneRecordsRequest, UpdateZoneRecordsResponse>
                    handler) {

        Validate.notBlank(request.getZoneNameOrId(), "zoneNameOrId must not be blank");
        Objects.requireNonNull(
                request.getUpdateZoneRecordsDetails(), "updateZoneRecordsDetails is required");

        return clientCall(request, UpdateZoneRecordsResponse::builder)
                .logger(LOG, "updateZoneRecords")
                .serviceDetails(
                        "Dns",
                        "UpdateZoneRecords",
                        "https://docs.oracle.com/iaas/api/#/en/dns/20180115/Records/UpdateZoneRecords")
                .method(com.oracle.bmc.http.client.Method.PUT)
                .requestBuilder(UpdateZoneRecordsRequest::builder)
                .basePath("/20180115")
                .appendPathParam("zones")
                .appendPathParam(request.getZoneNameOrId())
                .appendPathParam("records")
                .appendEnumQueryParam("scope", request.getScope())
                .appendQueryParam("viewId", request.getViewId())
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .accept("application/json")
                .appendHeader("If-Match", request.getIfMatch())
                .appendHeader("If-Unmodified-Since", request.getIfUnmodifiedSince())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.dns.model.RecordCollection.class,
                        UpdateZoneRecordsResponse.Builder::recordCollection)
                .handleResponseHeaderString(
                        "opc-next-page", UpdateZoneRecordsResponse.Builder::opcNextPage)
                .handleResponseHeaderInteger(
                        "opc-total-items", UpdateZoneRecordsResponse.Builder::opcTotalItems)
                .handleResponseHeaderString(
                        "opc-request-id", UpdateZoneRecordsResponse.Builder::opcRequestId)
                .handleResponseHeaderString("ETag", UpdateZoneRecordsResponse.Builder::eTag)
                .callAsync(handler);
    }

    /**
     * Create a new client instance.
     *
     * @param authenticationDetailsProvider The authentication details (see {@link Builder#build})
     * @deprecated Use the {@link #builder() builder} instead.
     */
    @Deprecated
    public DnsAsyncClient(
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
    public DnsAsyncClient(
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
    public DnsAsyncClient(
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
    public DnsAsyncClient(
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
    public DnsAsyncClient(
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
    public DnsAsyncClient(
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
    public DnsAsyncClient(
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

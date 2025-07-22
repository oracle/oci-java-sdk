/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.marketplacepublisher;

import com.oracle.bmc.util.internal.Validate;
import com.oracle.bmc.marketplacepublisher.requests.*;
import com.oracle.bmc.marketplacepublisher.responses.*;
import com.oracle.bmc.circuitbreaker.CircuitBreakerConfiguration;
import com.oracle.bmc.util.CircuitBreakerUtils;

import java.util.Objects;

@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20241201")
public class MarketplacePublisherClient extends com.oracle.bmc.http.internal.BaseSyncClient
        implements MarketplacePublisher {
    /** Service instance for MarketplacePublisher. */
    public static final com.oracle.bmc.Service SERVICE =
            com.oracle.bmc.Services.serviceBuilder()
                    .serviceName("MARKETPLACEPUBLISHER")
                    .serviceEndpointPrefix("")
                    .serviceEndpointTemplate(
                            "https://marketplace-publisher.{region}.oci.{secondLevelDomain}")
                    .build();

    private static final org.slf4j.Logger LOG =
            org.slf4j.LoggerFactory.getLogger(MarketplacePublisherClient.class);

    private final MarketplacePublisherWaiters waiters;

    private final MarketplacePublisherPaginators paginators;

    MarketplacePublisherClient(
            com.oracle.bmc.common.ClientBuilderBase<?, ?> builder,
            com.oracle.bmc.auth.AbstractAuthenticationDetailsProvider authenticationDetailsProvider,
            java.util.concurrent.ExecutorService executorService) {
        this(builder, authenticationDetailsProvider, executorService, true);
    }

    MarketplacePublisherClient(
            com.oracle.bmc.common.ClientBuilderBase<?, ?> builder,
            com.oracle.bmc.auth.AbstractAuthenticationDetailsProvider authenticationDetailsProvider,
            java.util.concurrent.ExecutorService executorService,
            boolean isStreamWarningEnabled) {
        super(
                builder,
                authenticationDetailsProvider,
                CircuitBreakerUtils.DEFAULT_CIRCUIT_BREAKER_CONFIGURATION);

        if (executorService == null) {
            // up to 50 (core) threads, time out after 60s idle, all daemon
            java.util.concurrent.ThreadPoolExecutor threadPoolExecutor =
                    new java.util.concurrent.ThreadPoolExecutor(
                            50,
                            50,
                            60L,
                            java.util.concurrent.TimeUnit.SECONDS,
                            new java.util.concurrent.LinkedBlockingQueue<Runnable>(),
                            com.oracle.bmc.internal.ClientThreadFactory.builder()
                                    .isDaemon(true)
                                    .nameFormat("MarketplacePublisher-waiters-%d")
                                    .build());
            threadPoolExecutor.allowCoreThreadTimeOut(true);

            executorService = threadPoolExecutor;
        }
        this.waiters = new MarketplacePublisherWaiters(executorService, this);

        this.paginators = new MarketplacePublisherPaginators(this);
        if (isStreamWarningEnabled && com.oracle.bmc.util.StreamUtils.isExtraStreamLogsEnabled()) {
            LOG.warn(
                    com.oracle.bmc.util.StreamUtils.getStreamWarningMessage(
                            "MarketplacePublisherClient",
                            "getListingRevisionAttachmentContent,getListingRevisionIconContent,getSupportDocContent,getTermVersionContent"));
        }
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
            extends com.oracle.bmc.common.RegionalClientBuilder<
                    Builder, MarketplacePublisherClient> {
        private boolean isStreamWarningEnabled = true;
        private java.util.concurrent.ExecutorService executorService;

        private Builder(com.oracle.bmc.Service service) {
            super(service);
            final String packageName = "marketplacepublisher";
            com.oracle.bmc.internal.Alloy.throwDisabledServiceExceptionIfAppropriate(packageName);
            requestSignerFactory =
                    new com.oracle.bmc.http.signing.internal.DefaultRequestSignerFactory(
                            com.oracle.bmc.http.signing.SigningStrategy.STANDARD);
        }

        /**
         * Set the ExecutorService for the client to be created.
         *
         * @param executorService executorService
         * @return this builder
         */
        public Builder executorService(java.util.concurrent.ExecutorService executorService) {
            this.executorService = executorService;
            return this;
        }

        /**
         * Enable/disable the stream warnings for the client
         *
         * @param isStreamWarningEnabled executorService
         * @return this builder
         */
        public Builder isStreamWarningEnabled(boolean isStreamWarningEnabled) {
            this.isStreamWarningEnabled = isStreamWarningEnabled;
            return this;
        }

        /**
         * Build the client.
         *
         * @param authenticationDetailsProvider authentication details provider
         * @return the client
         */
        public MarketplacePublisherClient build(
                @jakarta.annotation.Nonnull
                        com.oracle.bmc.auth.AbstractAuthenticationDetailsProvider
                                authenticationDetailsProvider) {
            return new MarketplacePublisherClient(
                    this, authenticationDetailsProvider, executorService, isStreamWarningEnabled);
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
    public ActivateTermVersionResponse activateTermVersion(ActivateTermVersionRequest request) {

        Validate.notBlank(request.getTermVersionId(), "termVersionId must not be blank");

        return clientCall(request, ActivateTermVersionResponse::builder)
                .logger(LOG, "activateTermVersion")
                .serviceDetails(
                        "MarketplacePublisher",
                        "ActivateTermVersion",
                        "https://docs.oracle.com/iaas/api/#/en/publisher/20241201/TermVersion/ActivateTermVersion")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(ActivateTermVersionRequest::builder)
                .basePath("/20241201")
                .appendPathParam("termVersions")
                .appendPathParam(request.getTermVersionId())
                .appendPathParam("actions")
                .appendPathParam("Activate")
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .handleBody(
                        com.oracle.bmc.marketplacepublisher.model.TermVersion.class,
                        ActivateTermVersionResponse.Builder::termVersion)
                .handleResponseHeaderString("etag", ActivateTermVersionResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", ActivateTermVersionResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public CancelWorkRequestResponse cancelWorkRequest(CancelWorkRequestRequest request) {

        Validate.notBlank(request.getWorkRequestId(), "workRequestId must not be blank");

        return clientCall(request, CancelWorkRequestResponse::builder)
                .logger(LOG, "cancelWorkRequest")
                .serviceDetails(
                        "MarketplacePublisher",
                        "CancelWorkRequest",
                        "https://docs.oracle.com/iaas/api/#/en/publisher/20241201/WorkRequest/CancelWorkRequest")
                .method(com.oracle.bmc.http.client.Method.DELETE)
                .requestBuilder(CancelWorkRequestRequest::builder)
                .basePath("/20241201")
                .appendPathParam("workRequests")
                .appendPathParam(request.getWorkRequestId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .handleResponseHeaderString(
                        "opc-request-id", CancelWorkRequestResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public CascadingDeleteListingResponse cascadingDeleteListing(
            CascadingDeleteListingRequest request) {

        Validate.notBlank(request.getListingId(), "listingId must not be blank");

        return clientCall(request, CascadingDeleteListingResponse::builder)
                .logger(LOG, "cascadingDeleteListing")
                .serviceDetails(
                        "MarketplacePublisher",
                        "CascadingDeleteListing",
                        "https://docs.oracle.com/iaas/api/#/en/publisher/20241201/Listing/CascadingDeleteListing")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CascadingDeleteListingRequest::builder)
                .basePath("/20241201")
                .appendPathParam("listings")
                .appendPathParam(request.getListingId())
                .appendPathParam("actions")
                .appendPathParam("cascadingDelete")
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .operationUsesDefaultRetries()
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        CascadingDeleteListingResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", CascadingDeleteListingResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public CascadingDeleteListingRevisionResponse cascadingDeleteListingRevision(
            CascadingDeleteListingRevisionRequest request) {

        Validate.notBlank(request.getListingRevisionId(), "listingRevisionId must not be blank");

        return clientCall(request, CascadingDeleteListingRevisionResponse::builder)
                .logger(LOG, "cascadingDeleteListingRevision")
                .serviceDetails(
                        "MarketplacePublisher",
                        "CascadingDeleteListingRevision",
                        "https://docs.oracle.com/iaas/api/#/en/publisher/20241201/ListingRevision/CascadingDeleteListingRevision")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CascadingDeleteListingRevisionRequest::builder)
                .basePath("/20241201")
                .appendPathParam("listingRevisions")
                .appendPathParam(request.getListingRevisionId())
                .appendPathParam("actions")
                .appendPathParam("cascadingDelete")
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .operationUsesDefaultRetries()
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        CascadingDeleteListingRevisionResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id",
                        CascadingDeleteListingRevisionResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public ChangeArtifactCompartmentResponse changeArtifactCompartment(
            ChangeArtifactCompartmentRequest request) {

        Validate.notBlank(request.getArtifactId(), "artifactId must not be blank");
        Objects.requireNonNull(
                request.getChangeArtifactCompartmentDetails(),
                "changeArtifactCompartmentDetails is required");

        return clientCall(request, ChangeArtifactCompartmentResponse::builder)
                .logger(LOG, "changeArtifactCompartment")
                .serviceDetails(
                        "MarketplacePublisher",
                        "ChangeArtifactCompartment",
                        "https://docs.oracle.com/iaas/api/#/en/publisher/20241201/Artifact/ChangeArtifactCompartment")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(ChangeArtifactCompartmentRequest::builder)
                .basePath("/20241201")
                .appendPathParam("artifacts")
                .appendPathParam(request.getArtifactId())
                .appendPathParam("actions")
                .appendPathParam("changeCompartment")
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("if-match", request.getIfMatch())
                .operationUsesDefaultRetries()
                .hasBody()
                .handleResponseHeaderString(
                        "opc-request-id", ChangeArtifactCompartmentResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        ChangeArtifactCompartmentResponse.Builder::opcWorkRequestId)
                .callSync();
    }

    @Override
    public ChangeListingCompartmentResponse changeListingCompartment(
            ChangeListingCompartmentRequest request) {

        Validate.notBlank(request.getListingId(), "listingId must not be blank");
        Objects.requireNonNull(
                request.getChangeListingCompartmentDetails(),
                "changeListingCompartmentDetails is required");

        return clientCall(request, ChangeListingCompartmentResponse::builder)
                .logger(LOG, "changeListingCompartment")
                .serviceDetails(
                        "MarketplacePublisher",
                        "ChangeListingCompartment",
                        "https://docs.oracle.com/iaas/api/#/en/publisher/20241201/Listing/ChangeListingCompartment")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(ChangeListingCompartmentRequest::builder)
                .basePath("/20241201")
                .appendPathParam("listings")
                .appendPathParam(request.getListingId())
                .appendPathParam("actions")
                .appendPathParam("changeCompartment")
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("if-match", request.getIfMatch())
                .operationUsesDefaultRetries()
                .hasBody()
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        ChangeListingCompartmentResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", ChangeListingCompartmentResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public ChangeListingRevisionToNewStatusResponse changeListingRevisionToNewStatus(
            ChangeListingRevisionToNewStatusRequest request) {

        Validate.notBlank(request.getListingRevisionId(), "listingRevisionId must not be blank");

        return clientCall(request, ChangeListingRevisionToNewStatusResponse::builder)
                .logger(LOG, "changeListingRevisionToNewStatus")
                .serviceDetails(
                        "MarketplacePublisher",
                        "ChangeListingRevisionToNewStatus",
                        "https://docs.oracle.com/iaas/api/#/en/publisher/20241201/ListingRevision/ChangeListingRevisionToNewStatus")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(ChangeListingRevisionToNewStatusRequest::builder)
                .basePath("/20241201")
                .appendPathParam("listingRevisions")
                .appendPathParam(request.getListingRevisionId())
                .appendPathParam("actions")
                .appendPathParam("changeToNewStatus")
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .handleBody(
                        com.oracle.bmc.marketplacepublisher.model.ListingRevision.class,
                        ChangeListingRevisionToNewStatusResponse.Builder::listingRevision)
                .handleResponseHeaderString(
                        "etag", ChangeListingRevisionToNewStatusResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id",
                        ChangeListingRevisionToNewStatusResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public ChangeTermCompartmentResponse changeTermCompartment(
            ChangeTermCompartmentRequest request) {

        Validate.notBlank(request.getTermId(), "termId must not be blank");
        Objects.requireNonNull(
                request.getChangeTermCompartmentDetails(),
                "changeTermCompartmentDetails is required");

        return clientCall(request, ChangeTermCompartmentResponse::builder)
                .logger(LOG, "changeTermCompartment")
                .serviceDetails(
                        "MarketplacePublisher",
                        "ChangeTermCompartment",
                        "https://docs.oracle.com/iaas/api/#/en/publisher/20241201/Term/ChangeTermCompartment")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(ChangeTermCompartmentRequest::builder)
                .basePath("/20241201")
                .appendPathParam("terms")
                .appendPathParam(request.getTermId())
                .appendPathParam("actions")
                .appendPathParam("changeCompartment")
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("if-match", request.getIfMatch())
                .operationUsesDefaultRetries()
                .hasBody()
                .handleResponseHeaderString(
                        "opc-request-id", ChangeTermCompartmentResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        ChangeTermCompartmentResponse.Builder::opcWorkRequestId)
                .callSync();
    }

    @Override
    public CloneListingRevisionResponse cloneListingRevision(CloneListingRevisionRequest request) {

        Validate.notBlank(request.getListingRevisionId(), "listingRevisionId must not be blank");

        return clientCall(request, CloneListingRevisionResponse::builder)
                .logger(LOG, "cloneListingRevision")
                .serviceDetails(
                        "MarketplacePublisher",
                        "CloneListingRevision",
                        "https://docs.oracle.com/iaas/api/#/en/publisher/20241201/ListingRevision/CloneListingRevision")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CloneListingRevisionRequest::builder)
                .basePath("/20241201")
                .appendPathParam("listingRevisions")
                .appendPathParam(request.getListingRevisionId())
                .appendPathParam("actions")
                .appendPathParam("clone")
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .operationUsesDefaultRetries()
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        CloneListingRevisionResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", CloneListingRevisionResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public CreateArtifactResponse createArtifact(CreateArtifactRequest request) {
        Objects.requireNonNull(
                request.getCreateArtifactDetails(), "createArtifactDetails is required");

        return clientCall(request, CreateArtifactResponse::builder)
                .logger(LOG, "createArtifact")
                .serviceDetails(
                        "MarketplacePublisher",
                        "CreateArtifact",
                        "https://docs.oracle.com/iaas/api/#/en/publisher/20241201/Artifact/CreateArtifact")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CreateArtifactRequest::builder)
                .basePath("/20241201")
                .appendPathParam("artifacts")
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .hasBody()
                .handleResponseHeaderString(
                        "opc-work-request-id", CreateArtifactResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", CreateArtifactResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public CreateListingResponse createListing(CreateListingRequest request) {
        Objects.requireNonNull(
                request.getCreateListingDetails(), "createListingDetails is required");

        return clientCall(request, CreateListingResponse::builder)
                .logger(LOG, "createListing")
                .serviceDetails(
                        "MarketplacePublisher",
                        "CreateListing",
                        "https://docs.oracle.com/iaas/api/#/en/publisher/20241201/Listing/CreateListing")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CreateListingRequest::builder)
                .basePath("/20241201")
                .appendPathParam("listings")
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .hasBody()
                .handleBody(
                        com.oracle.bmc.marketplacepublisher.model.Listing.class,
                        CreateListingResponse.Builder::listing)
                .handleResponseHeaderString("etag", CreateListingResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", CreateListingResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public CreateListingRevisionResponse createListingRevision(
            CreateListingRevisionRequest request) {
        Objects.requireNonNull(
                request.getCreateListingRevisionDetails(),
                "createListingRevisionDetails is required");

        return clientCall(request, CreateListingRevisionResponse::builder)
                .logger(LOG, "createListingRevision")
                .serviceDetails(
                        "MarketplacePublisher",
                        "CreateListingRevision",
                        "https://docs.oracle.com/iaas/api/#/en/publisher/20241201/ListingRevision/CreateListingRevision")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CreateListingRevisionRequest::builder)
                .basePath("/20241201")
                .appendPathParam("listingRevisions")
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .hasBody()
                .handleBody(
                        com.oracle.bmc.marketplacepublisher.model.ListingRevision.class,
                        CreateListingRevisionResponse.Builder::listingRevision)
                .handleResponseHeaderString("etag", CreateListingRevisionResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", CreateListingRevisionResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public CreateListingRevisionAttachmentResponse createListingRevisionAttachment(
            CreateListingRevisionAttachmentRequest request) {
        Objects.requireNonNull(
                request.getCreateListingRevisionAttachmentDetails(),
                "createListingRevisionAttachmentDetails is required");

        return clientCall(request, CreateListingRevisionAttachmentResponse::builder)
                .logger(LOG, "createListingRevisionAttachment")
                .serviceDetails(
                        "MarketplacePublisher",
                        "CreateListingRevisionAttachment",
                        "https://docs.oracle.com/iaas/api/#/en/publisher/20241201/ListingRevisionAttachment/CreateListingRevisionAttachment")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CreateListingRevisionAttachmentRequest::builder)
                .basePath("/20241201")
                .appendPathParam("listingRevisionAttachments")
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .hasBody()
                .handleBody(
                        com.oracle.bmc.marketplacepublisher.model.ListingRevisionAttachment.class,
                        CreateListingRevisionAttachmentResponse.Builder::listingRevisionAttachment)
                .handleResponseHeaderString(
                        "opc-request-id",
                        CreateListingRevisionAttachmentResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "etag", CreateListingRevisionAttachmentResponse.Builder::etag)
                .callSync();
    }

    @Override
    public CreateListingRevisionNoteResponse createListingRevisionNote(
            CreateListingRevisionNoteRequest request) {
        Objects.requireNonNull(
                request.getCreateListingRevisionNoteDetails(),
                "createListingRevisionNoteDetails is required");

        return clientCall(request, CreateListingRevisionNoteResponse::builder)
                .logger(LOG, "createListingRevisionNote")
                .serviceDetails(
                        "MarketplacePublisher",
                        "CreateListingRevisionNote",
                        "https://docs.oracle.com/iaas/api/#/en/publisher/20241201/ListingRevisionNote/CreateListingRevisionNote")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CreateListingRevisionNoteRequest::builder)
                .basePath("/20241201")
                .appendPathParam("listingRevisionNotes")
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .hasBody()
                .handleBody(
                        com.oracle.bmc.marketplacepublisher.model.ListingRevisionNote.class,
                        CreateListingRevisionNoteResponse.Builder::listingRevisionNote)
                .handleResponseHeaderString(
                        "opc-request-id", CreateListingRevisionNoteResponse.Builder::opcRequestId)
                .handleResponseHeaderString("etag", CreateListingRevisionNoteResponse.Builder::etag)
                .callSync();
    }

    @Override
    public CreateListingRevisionPackageResponse createListingRevisionPackage(
            CreateListingRevisionPackageRequest request) {
        Objects.requireNonNull(
                request.getCreateListingRevisionPackageDetails(),
                "createListingRevisionPackageDetails is required");

        return clientCall(request, CreateListingRevisionPackageResponse::builder)
                .logger(LOG, "createListingRevisionPackage")
                .serviceDetails(
                        "MarketplacePublisher",
                        "CreateListingRevisionPackage",
                        "https://docs.oracle.com/iaas/api/#/en/publisher/20241201/ListingRevisionPackage/CreateListingRevisionPackage")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CreateListingRevisionPackageRequest::builder)
                .basePath("/20241201")
                .appendPathParam("listingRevisionPackages")
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .hasBody()
                .handleBody(
                        com.oracle.bmc.marketplacepublisher.model.ListingRevisionPackage.class,
                        CreateListingRevisionPackageResponse.Builder::listingRevisionPackage)
                .handleResponseHeaderString(
                        "opc-request-id",
                        CreateListingRevisionPackageResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "etag", CreateListingRevisionPackageResponse.Builder::etag)
                .callSync();
    }

    @Override
    public CreateTermResponse createTerm(CreateTermRequest request) {
        Objects.requireNonNull(request.getCreateTermDetails(), "createTermDetails is required");

        return clientCall(request, CreateTermResponse::builder)
                .logger(LOG, "createTerm")
                .serviceDetails(
                        "MarketplacePublisher",
                        "CreateTerm",
                        "https://docs.oracle.com/iaas/api/#/en/publisher/20241201/Term/CreateTerm")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CreateTermRequest::builder)
                .basePath("/20241201")
                .appendPathParam("terms")
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .hasBody()
                .handleBody(
                        com.oracle.bmc.marketplacepublisher.model.Term.class,
                        CreateTermResponse.Builder::term)
                .handleResponseHeaderString("etag", CreateTermResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", CreateTermResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public CreateTermVersionResponse createTermVersion(CreateTermVersionRequest request) {
        Objects.requireNonNull(
                request.getCreateTermVersionContent(), "createTermVersionContent is required");

        Objects.requireNonNull(request.getTermId(), "termId is required");

        return clientCall(request, CreateTermVersionResponse::builder)
                .logger(LOG, "createTermVersion")
                .serviceDetails(
                        "MarketplacePublisher",
                        "CreateTermVersion",
                        "https://docs.oracle.com/iaas/api/#/en/publisher/20241201/TermVersion/CreateTermVersion")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CreateTermVersionRequest::builder)
                .basePath("/20241201")
                .appendPathParam("termVersions")
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("display-name", request.getDisplayName())
                .appendHeader("term-id", request.getTermId())
                .operationUsesDefaultRetries()
                .hasBinaryRequestBody()
                .hasBody()
                .handleBody(
                        com.oracle.bmc.marketplacepublisher.model.TermVersion.class,
                        CreateTermVersionResponse.Builder::termVersion)
                .handleResponseHeaderString("etag", CreateTermVersionResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", CreateTermVersionResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public DeleteArtifactResponse deleteArtifact(DeleteArtifactRequest request) {

        Validate.notBlank(request.getArtifactId(), "artifactId must not be blank");

        return clientCall(request, DeleteArtifactResponse::builder)
                .logger(LOG, "deleteArtifact")
                .serviceDetails(
                        "MarketplacePublisher",
                        "DeleteArtifact",
                        "https://docs.oracle.com/iaas/api/#/en/publisher/20241201/Artifact/DeleteArtifact")
                .method(com.oracle.bmc.http.client.Method.DELETE)
                .requestBuilder(DeleteArtifactRequest::builder)
                .basePath("/20241201")
                .appendPathParam("artifacts")
                .appendPathParam(request.getArtifactId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .operationUsesDefaultRetries()
                .handleResponseHeaderString(
                        "opc-work-request-id", DeleteArtifactResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", DeleteArtifactResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public DeleteListingResponse deleteListing(DeleteListingRequest request) {

        Validate.notBlank(request.getListingId(), "listingId must not be blank");

        return clientCall(request, DeleteListingResponse::builder)
                .logger(LOG, "deleteListing")
                .serviceDetails(
                        "MarketplacePublisher",
                        "DeleteListing",
                        "https://docs.oracle.com/iaas/api/#/en/publisher/20241201/Listing/DeleteListing")
                .method(com.oracle.bmc.http.client.Method.DELETE)
                .requestBuilder(DeleteListingRequest::builder)
                .basePath("/20241201")
                .appendPathParam("listings")
                .appendPathParam(request.getListingId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .handleResponseHeaderString(
                        "opc-request-id", DeleteListingResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public DeleteListingRevisionResponse deleteListingRevision(
            DeleteListingRevisionRequest request) {

        Validate.notBlank(request.getListingRevisionId(), "listingRevisionId must not be blank");

        return clientCall(request, DeleteListingRevisionResponse::builder)
                .logger(LOG, "deleteListingRevision")
                .serviceDetails(
                        "MarketplacePublisher",
                        "DeleteListingRevision",
                        "https://docs.oracle.com/iaas/api/#/en/publisher/20241201/ListingRevision/DeleteListingRevision")
                .method(com.oracle.bmc.http.client.Method.DELETE)
                .requestBuilder(DeleteListingRevisionRequest::builder)
                .basePath("/20241201")
                .appendPathParam("listingRevisions")
                .appendPathParam(request.getListingRevisionId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .handleResponseHeaderString(
                        "opc-request-id", DeleteListingRevisionResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public DeleteListingRevisionAttachmentResponse deleteListingRevisionAttachment(
            DeleteListingRevisionAttachmentRequest request) {

        Validate.notBlank(
                request.getListingRevisionAttachmentId(),
                "listingRevisionAttachmentId must not be blank");

        return clientCall(request, DeleteListingRevisionAttachmentResponse::builder)
                .logger(LOG, "deleteListingRevisionAttachment")
                .serviceDetails(
                        "MarketplacePublisher",
                        "DeleteListingRevisionAttachment",
                        "https://docs.oracle.com/iaas/api/#/en/publisher/20241201/ListingRevisionAttachment/DeleteListingRevisionAttachment")
                .method(com.oracle.bmc.http.client.Method.DELETE)
                .requestBuilder(DeleteListingRevisionAttachmentRequest::builder)
                .basePath("/20241201")
                .appendPathParam("listingRevisionAttachments")
                .appendPathParam(request.getListingRevisionAttachmentId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .handleResponseHeaderString(
                        "opc-request-id",
                        DeleteListingRevisionAttachmentResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public DeleteListingRevisionNoteResponse deleteListingRevisionNote(
            DeleteListingRevisionNoteRequest request) {

        Validate.notBlank(
                request.getListingRevisionNoteId(), "listingRevisionNoteId must not be blank");

        return clientCall(request, DeleteListingRevisionNoteResponse::builder)
                .logger(LOG, "deleteListingRevisionNote")
                .serviceDetails(
                        "MarketplacePublisher",
                        "DeleteListingRevisionNote",
                        "https://docs.oracle.com/iaas/api/#/en/publisher/20241201/ListingRevisionNote/DeleteListingRevisionNote")
                .method(com.oracle.bmc.http.client.Method.DELETE)
                .requestBuilder(DeleteListingRevisionNoteRequest::builder)
                .basePath("/20241201")
                .appendPathParam("listingRevisionNotes")
                .appendPathParam(request.getListingRevisionNoteId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .handleResponseHeaderString(
                        "opc-request-id", DeleteListingRevisionNoteResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public DeleteListingRevisionPackageResponse deleteListingRevisionPackage(
            DeleteListingRevisionPackageRequest request) {

        Validate.notBlank(
                request.getListingRevisionPackageId(),
                "listingRevisionPackageId must not be blank");

        return clientCall(request, DeleteListingRevisionPackageResponse::builder)
                .logger(LOG, "deleteListingRevisionPackage")
                .serviceDetails(
                        "MarketplacePublisher",
                        "DeleteListingRevisionPackage",
                        "https://docs.oracle.com/iaas/api/#/en/publisher/20241201/ListingRevisionPackage/DeleteListingRevisionPackage")
                .method(com.oracle.bmc.http.client.Method.DELETE)
                .requestBuilder(DeleteListingRevisionPackageRequest::builder)
                .basePath("/20241201")
                .appendPathParam("listingRevisionPackages")
                .appendPathParam(request.getListingRevisionPackageId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .handleResponseHeaderString(
                        "opc-request-id",
                        DeleteListingRevisionPackageResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public DeleteTermResponse deleteTerm(DeleteTermRequest request) {

        Validate.notBlank(request.getTermId(), "termId must not be blank");

        return clientCall(request, DeleteTermResponse::builder)
                .logger(LOG, "deleteTerm")
                .serviceDetails(
                        "MarketplacePublisher",
                        "DeleteTerm",
                        "https://docs.oracle.com/iaas/api/#/en/publisher/20241201/Term/DeleteTerm")
                .method(com.oracle.bmc.http.client.Method.DELETE)
                .requestBuilder(DeleteTermRequest::builder)
                .basePath("/20241201")
                .appendPathParam("terms")
                .appendPathParam(request.getTermId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .handleResponseHeaderString(
                        "opc-request-id", DeleteTermResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public DeleteTermVersionResponse deleteTermVersion(DeleteTermVersionRequest request) {

        Validate.notBlank(request.getTermVersionId(), "termVersionId must not be blank");

        return clientCall(request, DeleteTermVersionResponse::builder)
                .logger(LOG, "deleteTermVersion")
                .serviceDetails(
                        "MarketplacePublisher",
                        "DeleteTermVersion",
                        "https://docs.oracle.com/iaas/api/#/en/publisher/20241201/TermVersion/DeleteTermVersion")
                .method(com.oracle.bmc.http.client.Method.DELETE)
                .requestBuilder(DeleteTermVersionRequest::builder)
                .basePath("/20241201")
                .appendPathParam("termVersions")
                .appendPathParam(request.getTermVersionId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .handleResponseHeaderString(
                        "opc-request-id", DeleteTermVersionResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public GetArtifactResponse getArtifact(GetArtifactRequest request) {

        Validate.notBlank(request.getArtifactId(), "artifactId must not be blank");

        return clientCall(request, GetArtifactResponse::builder)
                .logger(LOG, "getArtifact")
                .serviceDetails(
                        "MarketplacePublisher",
                        "GetArtifact",
                        "https://docs.oracle.com/iaas/api/#/en/publisher/20241201/Artifact/GetArtifact")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetArtifactRequest::builder)
                .basePath("/20241201")
                .appendPathParam("artifacts")
                .appendPathParam(request.getArtifactId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .handleBody(
                        com.oracle.bmc.marketplacepublisher.model.Artifact.class,
                        GetArtifactResponse.Builder::artifact)
                .handleResponseHeaderString("etag", GetArtifactResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", GetArtifactResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public GetCategoryResponse getCategory(GetCategoryRequest request) {

        Validate.notBlank(request.getCategoryCode(), "categoryCode must not be blank");
        Objects.requireNonNull(request.getCompartmentId(), "compartmentId is required");

        return clientCall(request, GetCategoryResponse::builder)
                .logger(LOG, "getCategory")
                .serviceDetails(
                        "MarketplacePublisher",
                        "GetCategory",
                        "https://docs.oracle.com/iaas/api/#/en/publisher/20241201/Category/GetCategory")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetCategoryRequest::builder)
                .basePath("/20241201")
                .appendPathParam("categories")
                .appendPathParam(request.getCategoryCode())
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .handleBody(
                        com.oracle.bmc.marketplacepublisher.model.Category.class,
                        GetCategoryResponse.Builder::category)
                .handleResponseHeaderString("etag", GetCategoryResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", GetCategoryResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public GetLeadResponse getLead(GetLeadRequest request) {

        Validate.notBlank(request.getLeadId(), "leadId must not be blank");

        return clientCall(request, GetLeadResponse::builder)
                .logger(LOG, "getLead")
                .serviceDetails(
                        "MarketplacePublisher",
                        "GetLead",
                        "https://docs.oracle.com/iaas/api/#/en/publisher/20241201/Lead/GetLead")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetLeadRequest::builder)
                .basePath("/20241201")
                .appendPathParam("leads")
                .appendPathParam(request.getLeadId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .handleBody(
                        com.oracle.bmc.marketplacepublisher.model.Lead.class,
                        GetLeadResponse.Builder::lead)
                .handleResponseHeaderString("etag", GetLeadResponse.Builder::etag)
                .handleResponseHeaderString("opc-request-id", GetLeadResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public GetListingResponse getListing(GetListingRequest request) {

        Validate.notBlank(request.getListingId(), "listingId must not be blank");

        return clientCall(request, GetListingResponse::builder)
                .logger(LOG, "getListing")
                .serviceDetails(
                        "MarketplacePublisher",
                        "GetListing",
                        "https://docs.oracle.com/iaas/api/#/en/publisher/20241201/Listing/GetListing")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetListingRequest::builder)
                .basePath("/20241201")
                .appendPathParam("listings")
                .appendPathParam(request.getListingId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .handleBody(
                        com.oracle.bmc.marketplacepublisher.model.Listing.class,
                        GetListingResponse.Builder::listing)
                .handleResponseHeaderString("etag", GetListingResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", GetListingResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public GetListingRevisionResponse getListingRevision(GetListingRevisionRequest request) {

        Validate.notBlank(request.getListingRevisionId(), "listingRevisionId must not be blank");

        return clientCall(request, GetListingRevisionResponse::builder)
                .logger(LOG, "getListingRevision")
                .serviceDetails(
                        "MarketplacePublisher",
                        "GetListingRevision",
                        "https://docs.oracle.com/iaas/api/#/en/publisher/20241201/ListingRevision/GetListingRevision")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetListingRevisionRequest::builder)
                .basePath("/20241201")
                .appendPathParam("listingRevisions")
                .appendPathParam(request.getListingRevisionId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .handleBody(
                        com.oracle.bmc.marketplacepublisher.model.ListingRevision.class,
                        GetListingRevisionResponse.Builder::listingRevision)
                .handleResponseHeaderString("etag", GetListingRevisionResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", GetListingRevisionResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public GetListingRevisionAttachmentResponse getListingRevisionAttachment(
            GetListingRevisionAttachmentRequest request) {

        Validate.notBlank(
                request.getListingRevisionAttachmentId(),
                "listingRevisionAttachmentId must not be blank");

        return clientCall(request, GetListingRevisionAttachmentResponse::builder)
                .logger(LOG, "getListingRevisionAttachment")
                .serviceDetails(
                        "MarketplacePublisher",
                        "GetListingRevisionAttachment",
                        "https://docs.oracle.com/iaas/api/#/en/publisher/20241201/ListingRevisionAttachment/GetListingRevisionAttachment")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetListingRevisionAttachmentRequest::builder)
                .basePath("/20241201")
                .appendPathParam("listingRevisionAttachments")
                .appendPathParam(request.getListingRevisionAttachmentId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .handleBody(
                        com.oracle.bmc.marketplacepublisher.model.ListingRevisionAttachment.class,
                        GetListingRevisionAttachmentResponse.Builder::listingRevisionAttachment)
                .handleResponseHeaderString(
                        "opc-request-id",
                        GetListingRevisionAttachmentResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "etag", GetListingRevisionAttachmentResponse.Builder::etag)
                .callSync();
    }

    @Override
    public GetListingRevisionAttachmentContentResponse getListingRevisionAttachmentContent(
            GetListingRevisionAttachmentContentRequest request) {

        Validate.notBlank(
                request.getListingRevisionAttachmentId(),
                "listingRevisionAttachmentId must not be blank");

        return clientCall(request, GetListingRevisionAttachmentContentResponse::builder)
                .logger(LOG, "getListingRevisionAttachmentContent")
                .serviceDetails(
                        "MarketplacePublisher",
                        "GetListingRevisionAttachmentContent",
                        "https://docs.oracle.com/iaas/api/#/en/publisher/20241201/ListingRevisionAttachment/GetListingRevisionAttachmentContent")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetListingRevisionAttachmentContentRequest::builder)
                .basePath("/20241201")
                .appendPathParam("listingRevisionAttachments")
                .appendPathParam(request.getListingRevisionAttachmentId())
                .appendPathParam("content")
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .handleBody(
                        java.io.InputStream.class,
                        GetListingRevisionAttachmentContentResponse.Builder::inputStream)
                .handleResponseHeaderString(
                        "opc-request-id",
                        GetListingRevisionAttachmentContentResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "etag", GetListingRevisionAttachmentContentResponse.Builder::etag)
                .callSync();
    }

    @Override
    public GetListingRevisionIconContentResponse getListingRevisionIconContent(
            GetListingRevisionIconContentRequest request) {

        Validate.notBlank(request.getListingRevisionId(), "listingRevisionId must not be blank");

        return clientCall(request, GetListingRevisionIconContentResponse::builder)
                .logger(LOG, "getListingRevisionIconContent")
                .serviceDetails(
                        "MarketplacePublisher",
                        "GetListingRevisionIconContent",
                        "https://docs.oracle.com/iaas/api/#/en/publisher/20241201/ListingRevision/GetListingRevisionIconContent")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetListingRevisionIconContentRequest::builder)
                .basePath("/20241201")
                .appendPathParam("listingRevisions")
                .appendPathParam(request.getListingRevisionId())
                .appendPathParam("icon")
                .appendPathParam("content")
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .handleBody(
                        java.io.InputStream.class,
                        GetListingRevisionIconContentResponse.Builder::inputStream)
                .handleResponseHeaderString(
                        "opc-request-id",
                        GetListingRevisionIconContentResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "etag", GetListingRevisionIconContentResponse.Builder::etag)
                .callSync();
    }

    @Override
    public GetListingRevisionNoteResponse getListingRevisionNote(
            GetListingRevisionNoteRequest request) {

        Validate.notBlank(
                request.getListingRevisionNoteId(), "listingRevisionNoteId must not be blank");

        return clientCall(request, GetListingRevisionNoteResponse::builder)
                .logger(LOG, "getListingRevisionNote")
                .serviceDetails(
                        "MarketplacePublisher",
                        "GetListingRevisionNote",
                        "https://docs.oracle.com/iaas/api/#/en/publisher/20241201/ListingRevisionNote/GetListingRevisionNote")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetListingRevisionNoteRequest::builder)
                .basePath("/20241201")
                .appendPathParam("listingRevisionNotes")
                .appendPathParam(request.getListingRevisionNoteId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .handleBody(
                        com.oracle.bmc.marketplacepublisher.model.ListingRevisionNote.class,
                        GetListingRevisionNoteResponse.Builder::listingRevisionNote)
                .handleResponseHeaderString(
                        "opc-request-id", GetListingRevisionNoteResponse.Builder::opcRequestId)
                .handleResponseHeaderString("etag", GetListingRevisionNoteResponse.Builder::etag)
                .callSync();
    }

    @Override
    public GetListingRevisionPackageResponse getListingRevisionPackage(
            GetListingRevisionPackageRequest request) {

        Validate.notBlank(
                request.getListingRevisionPackageId(),
                "listingRevisionPackageId must not be blank");

        return clientCall(request, GetListingRevisionPackageResponse::builder)
                .logger(LOG, "getListingRevisionPackage")
                .serviceDetails(
                        "MarketplacePublisher",
                        "GetListingRevisionPackage",
                        "https://docs.oracle.com/iaas/api/#/en/publisher/20241201/ListingRevisionPackage/GetListingRevisionPackage")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetListingRevisionPackageRequest::builder)
                .basePath("/20241201")
                .appendPathParam("listingRevisionPackages")
                .appendPathParam(request.getListingRevisionPackageId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .handleBody(
                        com.oracle.bmc.marketplacepublisher.model.ListingRevisionPackage.class,
                        GetListingRevisionPackageResponse.Builder::listingRevisionPackage)
                .handleResponseHeaderString(
                        "opc-request-id", GetListingRevisionPackageResponse.Builder::opcRequestId)
                .handleResponseHeaderString("etag", GetListingRevisionPackageResponse.Builder::etag)
                .callSync();
    }

    @Override
    public GetMarketResponse getMarket(GetMarketRequest request) {

        Validate.notBlank(request.getMarketCode(), "marketCode must not be blank");

        return clientCall(request, GetMarketResponse::builder)
                .logger(LOG, "getMarket")
                .serviceDetails(
                        "MarketplacePublisher",
                        "GetMarket",
                        "https://docs.oracle.com/iaas/api/#/en/publisher/20241201/Market/GetMarket")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetMarketRequest::builder)
                .basePath("/20241201")
                .appendPathParam("markets")
                .appendPathParam(request.getMarketCode())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .handleBody(
                        com.oracle.bmc.marketplacepublisher.model.Market.class,
                        GetMarketResponse.Builder::market)
                .handleResponseHeaderString("etag", GetMarketResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", GetMarketResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public GetProductResponse getProduct(GetProductRequest request) {

        Validate.notBlank(request.getProductCode(), "productCode must not be blank");

        return clientCall(request, GetProductResponse::builder)
                .logger(LOG, "getProduct")
                .serviceDetails(
                        "MarketplacePublisher",
                        "GetProduct",
                        "https://docs.oracle.com/iaas/api/#/en/publisher/20241201/Product/GetProduct")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetProductRequest::builder)
                .basePath("/20241201")
                .appendPathParam("products")
                .appendPathParam(request.getProductCode())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .handleBody(
                        com.oracle.bmc.marketplacepublisher.model.Product.class,
                        GetProductResponse.Builder::product)
                .handleResponseHeaderString("etag", GetProductResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", GetProductResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public GetPublisherResponse getPublisher(GetPublisherRequest request) {

        Validate.notBlank(request.getPublisherId(), "publisherId must not be blank");

        return clientCall(request, GetPublisherResponse::builder)
                .logger(LOG, "getPublisher")
                .serviceDetails(
                        "MarketplacePublisher",
                        "GetPublisher",
                        "https://docs.oracle.com/iaas/api/#/en/publisher/20241201/Publisher/GetPublisher")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetPublisherRequest::builder)
                .basePath("/20241201")
                .appendPathParam("publishers")
                .appendPathParam(request.getPublisherId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .handleBody(
                        com.oracle.bmc.marketplacepublisher.model.Publisher.class,
                        GetPublisherResponse.Builder::publisher)
                .handleResponseHeaderString("etag", GetPublisherResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", GetPublisherResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public GetSupportDocResponse getSupportDoc(GetSupportDocRequest request) {

        Validate.notBlank(request.getSupportDocCode(), "supportDocCode must not be blank");

        return clientCall(request, GetSupportDocResponse::builder)
                .logger(LOG, "getSupportDoc")
                .serviceDetails(
                        "MarketplacePublisher",
                        "GetSupportDoc",
                        "https://docs.oracle.com/iaas/api/#/en/publisher/20241201/SupportDoc/GetSupportDoc")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetSupportDocRequest::builder)
                .basePath("/20241201")
                .appendPathParam("supportDocs")
                .appendPathParam(request.getSupportDocCode())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .handleBody(
                        com.oracle.bmc.marketplacepublisher.model.SupportDoc.class,
                        GetSupportDocResponse.Builder::supportDoc)
                .handleResponseHeaderString("etag", GetSupportDocResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", GetSupportDocResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public GetSupportDocContentResponse getSupportDocContent(GetSupportDocContentRequest request) {

        Validate.notBlank(request.getSupportDocCode(), "supportDocCode must not be blank");

        return clientCall(request, GetSupportDocContentResponse::builder)
                .logger(LOG, "getSupportDocContent")
                .serviceDetails(
                        "MarketplacePublisher",
                        "GetSupportDocContent",
                        "https://docs.oracle.com/iaas/api/#/en/publisher/20241201/SupportDoc/GetSupportDocContent")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetSupportDocContentRequest::builder)
                .basePath("/20241201")
                .appendPathParam("supportDocs")
                .appendPathParam(request.getSupportDocCode())
                .appendPathParam("content")
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .handleBody(
                        java.io.InputStream.class,
                        GetSupportDocContentResponse.Builder::inputStream)
                .handleResponseHeaderString(
                        "opc-request-id", GetSupportDocContentResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public GetTermResponse getTerm(GetTermRequest request) {

        Validate.notBlank(request.getTermId(), "termId must not be blank");

        return clientCall(request, GetTermResponse::builder)
                .logger(LOG, "getTerm")
                .serviceDetails(
                        "MarketplacePublisher",
                        "GetTerm",
                        "https://docs.oracle.com/iaas/api/#/en/publisher/20241201/Term/GetTerm")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetTermRequest::builder)
                .basePath("/20241201")
                .appendPathParam("terms")
                .appendPathParam(request.getTermId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .handleBody(
                        com.oracle.bmc.marketplacepublisher.model.Term.class,
                        GetTermResponse.Builder::term)
                .handleResponseHeaderString("etag", GetTermResponse.Builder::etag)
                .handleResponseHeaderString("opc-request-id", GetTermResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public GetTermVersionResponse getTermVersion(GetTermVersionRequest request) {

        Validate.notBlank(request.getTermVersionId(), "termVersionId must not be blank");

        return clientCall(request, GetTermVersionResponse::builder)
                .logger(LOG, "getTermVersion")
                .serviceDetails(
                        "MarketplacePublisher",
                        "GetTermVersion",
                        "https://docs.oracle.com/iaas/api/#/en/publisher/20241201/TermVersion/GetTermVersion")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetTermVersionRequest::builder)
                .basePath("/20241201")
                .appendPathParam("termVersions")
                .appendPathParam(request.getTermVersionId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .handleBody(
                        com.oracle.bmc.marketplacepublisher.model.TermVersion.class,
                        GetTermVersionResponse.Builder::termVersion)
                .handleResponseHeaderString("etag", GetTermVersionResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", GetTermVersionResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public GetTermVersionContentResponse getTermVersionContent(
            GetTermVersionContentRequest request) {

        Validate.notBlank(request.getTermVersionId(), "termVersionId must not be blank");

        return clientCall(request, GetTermVersionContentResponse::builder)
                .logger(LOG, "getTermVersionContent")
                .serviceDetails(
                        "MarketplacePublisher",
                        "GetTermVersionContent",
                        "https://docs.oracle.com/iaas/api/#/en/publisher/20241201/TermVersion/GetTermVersionContent")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetTermVersionContentRequest::builder)
                .basePath("/20241201")
                .appendPathParam("termVersions")
                .appendPathParam(request.getTermVersionId())
                .appendPathParam("content")
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .handleBody(
                        java.io.InputStream.class,
                        GetTermVersionContentResponse.Builder::inputStream)
                .handleResponseHeaderString("etag", GetTermVersionContentResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", GetTermVersionContentResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public GetWorkRequestResponse getWorkRequest(GetWorkRequestRequest request) {

        Validate.notBlank(request.getWorkRequestId(), "workRequestId must not be blank");

        return clientCall(request, GetWorkRequestResponse::builder)
                .logger(LOG, "getWorkRequest")
                .serviceDetails(
                        "MarketplacePublisher",
                        "GetWorkRequest",
                        "https://docs.oracle.com/iaas/api/#/en/publisher/20241201/WorkRequest/GetWorkRequest")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetWorkRequestRequest::builder)
                .basePath("/20241201")
                .appendPathParam("workRequests")
                .appendPathParam(request.getWorkRequestId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .handleBody(
                        com.oracle.bmc.marketplacepublisher.model.WorkRequest.class,
                        GetWorkRequestResponse.Builder::workRequest)
                .handleResponseHeaderString("etag", GetWorkRequestResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", GetWorkRequestResponse.Builder::opcRequestId)
                .handleResponseHeaderInteger(
                        "retry-after", GetWorkRequestResponse.Builder::retryAfter)
                .callSync();
    }

    @Override
    public ListArtifactsResponse listArtifacts(ListArtifactsRequest request) {
        Objects.requireNonNull(request.getCompartmentId(), "compartmentId is required");

        return clientCall(request, ListArtifactsResponse::builder)
                .logger(LOG, "listArtifacts")
                .serviceDetails(
                        "MarketplacePublisher",
                        "ListArtifacts",
                        "https://docs.oracle.com/iaas/api/#/en/publisher/20241201/ArtifactCollection/ListArtifacts")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListArtifactsRequest::builder)
                .basePath("/20241201")
                .appendPathParam("artifacts")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendEnumQueryParam("lifecycleState", request.getLifecycleState())
                .appendQueryParam("displayName", request.getDisplayName())
                .appendEnumQueryParam("status", request.getStatus())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .handleBody(
                        com.oracle.bmc.marketplacepublisher.model.ArtifactCollection.class,
                        ListArtifactsResponse.Builder::artifactCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListArtifactsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListArtifactsResponse.Builder::opcNextPage)
                .callSync();
    }

    @Override
    public ListAvailableServicesResponse listAvailableServices(
            ListAvailableServicesRequest request) {
        Objects.requireNonNull(request.getCompartmentId(), "compartmentId is required");

        return clientCall(request, ListAvailableServicesResponse::builder)
                .logger(LOG, "listAvailableServices")
                .serviceDetails(
                        "MarketplacePublisher",
                        "ListAvailableServices",
                        "https://docs.oracle.com/iaas/api/#/en/publisher/20241201/AvailableServiceCollection/ListAvailableServices")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListAvailableServicesRequest::builder)
                .basePath("/20241201")
                .appendPathParam("availableServices")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendQueryParam("name", request.getName())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .handleBody(
                        com.oracle.bmc.marketplacepublisher.model.AvailableServiceCollection.class,
                        ListAvailableServicesResponse.Builder::availableServiceCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListAvailableServicesResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListAvailableServicesResponse.Builder::opcNextPage)
                .callSync();
    }

    @Override
    public ListCategoriesResponse listCategories(ListCategoriesRequest request) {
        Objects.requireNonNull(request.getCompartmentId(), "compartmentId is required");

        return clientCall(request, ListCategoriesResponse::builder)
                .logger(LOG, "listCategories")
                .serviceDetails(
                        "MarketplacePublisher",
                        "ListCategories",
                        "https://docs.oracle.com/iaas/api/#/en/publisher/20241201/CategoryCollection/ListCategories")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListCategoriesRequest::builder)
                .basePath("/20241201")
                .appendPathParam("categories")
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendQueryParam("productCode", request.getProductCode())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .appendQueryParam("name", request.getName())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .handleBody(
                        com.oracle.bmc.marketplacepublisher.model.CategoryCollection.class,
                        ListCategoriesResponse.Builder::categoryCollection)
                .handleResponseHeaderString(
                        "opc-next-page", ListCategoriesResponse.Builder::opcNextPage)
                .handleResponseHeaderString(
                        "opc-request-id", ListCategoriesResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public ListCustomerInstanceReportRecordsResponse listCustomerInstanceReportRecords(
            ListCustomerInstanceReportRecordsRequest request) {
        Objects.requireNonNull(request.getCompartmentId(), "compartmentId is required");

        Objects.requireNonNull(request.getDateRange(), "dateRange is required");

        return clientCall(request, ListCustomerInstanceReportRecordsResponse::builder)
                .logger(LOG, "listCustomerInstanceReportRecords")
                .serviceDetails(
                        "MarketplacePublisher",
                        "ListCustomerInstanceReportRecords",
                        "https://docs.oracle.com/iaas/api/#/en/publisher/20241201/CustomerInstanceReportRecordCollection/ListCustomerInstanceReportRecords")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListCustomerInstanceReportRecordsRequest::builder)
                .basePath("/20241201")
                .appendPathParam("customerInstanceReportRecords")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendEnumQueryParam("dateRange", request.getDateRange())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .appendQueryParam("name", request.getName())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .handleBody(
                        com.oracle.bmc.marketplacepublisher.model
                                .CustomerInstanceReportRecordCollection.class,
                        ListCustomerInstanceReportRecordsResponse.Builder
                                ::customerInstanceReportRecordCollection)
                .handleResponseHeaderString(
                        "opc-request-id",
                        ListCustomerInstanceReportRecordsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page",
                        ListCustomerInstanceReportRecordsResponse.Builder::opcNextPage)
                .callSync();
    }

    @Override
    public ListDisbursementReportRecordsResponse listDisbursementReportRecords(
            ListDisbursementReportRecordsRequest request) {
        Objects.requireNonNull(request.getCompartmentId(), "compartmentId is required");

        Objects.requireNonNull(request.getDateRange(), "dateRange is required");

        return clientCall(request, ListDisbursementReportRecordsResponse::builder)
                .logger(LOG, "listDisbursementReportRecords")
                .serviceDetails(
                        "MarketplacePublisher",
                        "ListDisbursementReportRecords",
                        "https://docs.oracle.com/iaas/api/#/en/publisher/20241201/DisbursementReportRecordCollection/ListDisbursementReportRecords")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListDisbursementReportRecordsRequest::builder)
                .basePath("/20241201")
                .appendPathParam("disbursementReportRecords")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendEnumQueryParam("dateRange", request.getDateRange())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .appendQueryParam("name", request.getName())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .handleBody(
                        com.oracle.bmc.marketplacepublisher.model.DisbursementReportRecordCollection
                                .class,
                        ListDisbursementReportRecordsResponse.Builder
                                ::disbursementReportRecordCollection)
                .handleResponseHeaderString(
                        "opc-request-id",
                        ListDisbursementReportRecordsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListDisbursementReportRecordsResponse.Builder::opcNextPage)
                .callSync();
    }

    @Override
    public ListLeadsResponse listLeads(ListLeadsRequest request) {
        Objects.requireNonNull(request.getCompartmentId(), "compartmentId is required");

        return clientCall(request, ListLeadsResponse::builder)
                .logger(LOG, "listLeads")
                .serviceDetails(
                        "MarketplacePublisher",
                        "ListLeads",
                        "https://docs.oracle.com/iaas/api/#/en/publisher/20241201/LeadCollection/ListLeads")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListLeadsRequest::builder)
                .basePath("/20241201")
                .appendPathParam("leads")
                .appendQueryParam("listingId", request.getListingId())
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .handleBody(
                        com.oracle.bmc.marketplacepublisher.model.LeadCollection.class,
                        ListLeadsResponse.Builder::leadCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListLeadsResponse.Builder::opcRequestId)
                .handleResponseHeaderString("opc-next-page", ListLeadsResponse.Builder::opcNextPage)
                .callSync();
    }

    @Override
    public ListListingRevisionAttachmentsResponse listListingRevisionAttachments(
            ListListingRevisionAttachmentsRequest request) {
        Objects.requireNonNull(request.getListingRevisionId(), "listingRevisionId is required");

        return clientCall(request, ListListingRevisionAttachmentsResponse::builder)
                .logger(LOG, "listListingRevisionAttachments")
                .serviceDetails(
                        "MarketplacePublisher",
                        "ListListingRevisionAttachments",
                        "https://docs.oracle.com/iaas/api/#/en/publisher/20241201/ListingRevisionAttachmentCollection/ListListingRevisionAttachments")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListListingRevisionAttachmentsRequest::builder)
                .basePath("/20241201")
                .appendPathParam("listingRevisionAttachments")
                .appendQueryParam("listingRevisionId", request.getListingRevisionId())
                .appendQueryParam("displayName", request.getDisplayName())
                .appendEnumQueryParam("lifecycleState", request.getLifecycleState())
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .handleBody(
                        com.oracle.bmc.marketplacepublisher.model
                                .ListingRevisionAttachmentCollection.class,
                        ListListingRevisionAttachmentsResponse.Builder
                                ::listingRevisionAttachmentCollection)
                .handleResponseHeaderString(
                        "opc-request-id",
                        ListListingRevisionAttachmentsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page",
                        ListListingRevisionAttachmentsResponse.Builder::opcNextPage)
                .callSync();
    }

    @Override
    public ListListingRevisionNotesResponse listListingRevisionNotes(
            ListListingRevisionNotesRequest request) {
        Objects.requireNonNull(request.getListingRevisionId(), "listingRevisionId is required");

        return clientCall(request, ListListingRevisionNotesResponse::builder)
                .logger(LOG, "listListingRevisionNotes")
                .serviceDetails(
                        "MarketplacePublisher",
                        "ListListingRevisionNotes",
                        "https://docs.oracle.com/iaas/api/#/en/publisher/20241201/ListingRevisionNoteCollection/ListListingRevisionNotes")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListListingRevisionNotesRequest::builder)
                .basePath("/20241201")
                .appendPathParam("listingRevisionNotes")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendQueryParam("listingRevisionId", request.getListingRevisionId())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .handleBody(
                        com.oracle.bmc.marketplacepublisher.model.ListingRevisionNoteCollection
                                .class,
                        ListListingRevisionNotesResponse.Builder::listingRevisionNoteCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListListingRevisionNotesResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListListingRevisionNotesResponse.Builder::opcNextPage)
                .callSync();
    }

    @Override
    public ListListingRevisionPackagesResponse listListingRevisionPackages(
            ListListingRevisionPackagesRequest request) {
        Objects.requireNonNull(request.getListingRevisionId(), "listingRevisionId is required");

        return clientCall(request, ListListingRevisionPackagesResponse::builder)
                .logger(LOG, "listListingRevisionPackages")
                .serviceDetails(
                        "MarketplacePublisher",
                        "ListListingRevisionPackages",
                        "https://docs.oracle.com/iaas/api/#/en/publisher/20241201/ListingRevisionPackageCollection/ListListingRevisionPackages")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListListingRevisionPackagesRequest::builder)
                .basePath("/20241201")
                .appendPathParam("listingRevisionPackages")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendQueryParam("listingRevisionId", request.getListingRevisionId())
                .appendQueryParam("displayName", request.getDisplayName())
                .appendEnumQueryParam("lifecycleState", request.getLifecycleState())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .handleBody(
                        com.oracle.bmc.marketplacepublisher.model.ListingRevisionPackageCollection
                                .class,
                        ListListingRevisionPackagesResponse.Builder
                                ::listingRevisionPackageCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListListingRevisionPackagesResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListListingRevisionPackagesResponse.Builder::opcNextPage)
                .callSync();
    }

    @Override
    public ListListingRevisionsResponse listListingRevisions(ListListingRevisionsRequest request) {
        Objects.requireNonNull(request.getListingId(), "listingId is required");

        return clientCall(request, ListListingRevisionsResponse::builder)
                .logger(LOG, "listListingRevisions")
                .serviceDetails(
                        "MarketplacePublisher",
                        "ListListingRevisions",
                        "https://docs.oracle.com/iaas/api/#/en/publisher/20241201/ListingRevisionCollection/ListListingRevisions")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListListingRevisionsRequest::builder)
                .basePath("/20241201")
                .appendPathParam("listingRevisions")
                .appendQueryParam("listingId", request.getListingId())
                .appendQueryParam("displayName", request.getDisplayName())
                .appendEnumQueryParam("lifecycleState", request.getLifecycleState())
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendEnumQueryParam("listingRevisionStatus", request.getListingRevisionStatus())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .handleBody(
                        com.oracle.bmc.marketplacepublisher.model.ListingRevisionCollection.class,
                        ListListingRevisionsResponse.Builder::listingRevisionCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListListingRevisionsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListListingRevisionsResponse.Builder::opcNextPage)
                .callSync();
    }

    @Override
    public ListListingsResponse listListings(ListListingsRequest request) {
        Objects.requireNonNull(request.getCompartmentId(), "compartmentId is required");

        return clientCall(request, ListListingsResponse::builder)
                .logger(LOG, "listListings")
                .serviceDetails(
                        "MarketplacePublisher",
                        "ListListings",
                        "https://docs.oracle.com/iaas/api/#/en/publisher/20241201/ListingCollection/ListListings")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListListingsRequest::builder)
                .basePath("/20241201")
                .appendPathParam("listings")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendEnumQueryParam("lifecycleState", request.getLifecycleState())
                .appendEnumQueryParam("listingType", request.getListingType())
                .appendQueryParam("name", request.getName())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .handleBody(
                        com.oracle.bmc.marketplacepublisher.model.ListingCollection.class,
                        ListListingsResponse.Builder::listingCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListListingsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListListingsResponse.Builder::opcNextPage)
                .callSync();
    }

    @Override
    public ListMarketsResponse listMarkets(ListMarketsRequest request) {
        Objects.requireNonNull(request.getCompartmentId(), "compartmentId is required");

        return clientCall(request, ListMarketsResponse::builder)
                .logger(LOG, "listMarkets")
                .serviceDetails(
                        "MarketplacePublisher",
                        "ListMarkets",
                        "https://docs.oracle.com/iaas/api/#/en/publisher/20241201/MarketCollection/ListMarkets")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListMarketsRequest::builder)
                .basePath("/20241201")
                .appendPathParam("markets")
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .appendQueryParam("name", request.getName())
                .appendQueryParam("listingId", request.getListingId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .handleBody(
                        com.oracle.bmc.marketplacepublisher.model.MarketCollection.class,
                        ListMarketsResponse.Builder::marketCollection)
                .handleResponseHeaderString(
                        "opc-next-page", ListMarketsResponse.Builder::opcNextPage)
                .handleResponseHeaderString(
                        "opc-request-id", ListMarketsResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public ListProductsResponse listProducts(ListProductsRequest request) {
        Objects.requireNonNull(request.getCompartmentId(), "compartmentId is required");

        return clientCall(request, ListProductsResponse::builder)
                .logger(LOG, "listProducts")
                .serviceDetails(
                        "MarketplacePublisher",
                        "ListProducts",
                        "https://docs.oracle.com/iaas/api/#/en/publisher/20241201/ProductCollection/ListProducts")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListProductsRequest::builder)
                .basePath("/20241201")
                .appendPathParam("products")
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .appendQueryParam("productGroup", request.getProductGroup())
                .appendQueryParam("name", request.getName())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .handleBody(
                        com.oracle.bmc.marketplacepublisher.model.ProductCollection.class,
                        ListProductsResponse.Builder::productCollection)
                .handleResponseHeaderString(
                        "opc-next-page", ListProductsResponse.Builder::opcNextPage)
                .handleResponseHeaderString(
                        "opc-request-id", ListProductsResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public ListPublishersResponse listPublishers(ListPublishersRequest request) {
        Objects.requireNonNull(request.getCompartmentId(), "compartmentId is required");

        return clientCall(request, ListPublishersResponse::builder)
                .logger(LOG, "listPublishers")
                .serviceDetails(
                        "MarketplacePublisher",
                        "ListPublishers",
                        "https://docs.oracle.com/iaas/api/#/en/publisher/20241201/PublisherCollection/ListPublishers")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListPublishersRequest::builder)
                .basePath("/20241201")
                .appendPathParam("publishers")
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .appendQueryParam("name", request.getName())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .handleBody(
                        com.oracle.bmc.marketplacepublisher.model.PublisherCollection.class,
                        ListPublishersResponse.Builder::publisherCollection)
                .handleResponseHeaderString(
                        "opc-next-page", ListPublishersResponse.Builder::opcNextPage)
                .handleResponseHeaderString(
                        "opc-request-id", ListPublishersResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public ListSupportDocsResponse listSupportDocs(ListSupportDocsRequest request) {
        Objects.requireNonNull(request.getCompartmentId(), "compartmentId is required");

        return clientCall(request, ListSupportDocsResponse::builder)
                .logger(LOG, "listSupportDocs")
                .serviceDetails(
                        "MarketplacePublisher",
                        "ListSupportDocs",
                        "https://docs.oracle.com/iaas/api/#/en/publisher/20241201/SupportDocCollection/ListSupportDocs")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListSupportDocsRequest::builder)
                .basePath("/20241201")
                .appendPathParam("supportDocs")
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .appendQueryParam("supportDocGroup", request.getSupportDocGroup())
                .appendQueryParam("name", request.getName())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .handleBody(
                        com.oracle.bmc.marketplacepublisher.model.SupportDocCollection.class,
                        ListSupportDocsResponse.Builder::supportDocCollection)
                .handleResponseHeaderString(
                        "opc-next-page", ListSupportDocsResponse.Builder::opcNextPage)
                .handleResponseHeaderString(
                        "opc-request-id", ListSupportDocsResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public ListSupportedCurrenciesResponse listSupportedCurrencies(
            ListSupportedCurrenciesRequest request) {
        Objects.requireNonNull(request.getCompartmentId(), "compartmentId is required");

        return clientCall(request, ListSupportedCurrenciesResponse::builder)
                .logger(LOG, "listSupportedCurrencies")
                .serviceDetails(
                        "MarketplacePublisher",
                        "ListSupportedCurrencies",
                        "https://docs.oracle.com/iaas/api/#/en/publisher/20241201/SupportedCurrencyCollection/ListSupportedCurrencies")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListSupportedCurrenciesRequest::builder)
                .basePath("/20241201")
                .appendPathParam("supportedCurrencies")
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .handleBody(
                        com.oracle.bmc.marketplacepublisher.model.SupportedCurrencyCollection.class,
                        ListSupportedCurrenciesResponse.Builder::supportedCurrencyCollection)
                .handleResponseHeaderString(
                        "opc-next-page", ListSupportedCurrenciesResponse.Builder::opcNextPage)
                .handleResponseHeaderString(
                        "opc-request-id", ListSupportedCurrenciesResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public ListSupportedShapesResponse listSupportedShapes(ListSupportedShapesRequest request) {
        Objects.requireNonNull(request.getCompartmentId(), "compartmentId is required");

        return clientCall(request, ListSupportedShapesResponse::builder)
                .logger(LOG, "listSupportedShapes")
                .serviceDetails(
                        "MarketplacePublisher",
                        "ListSupportedShapes",
                        "https://docs.oracle.com/iaas/api/#/en/publisher/20241201/SupportedShapeCollection/ListSupportedShapes")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListSupportedShapesRequest::builder)
                .basePath("/20241201")
                .appendPathParam("supportedShapes")
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .appendQueryParam("name", request.getName())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .handleBody(
                        com.oracle.bmc.marketplacepublisher.model.SupportedShapeCollection.class,
                        ListSupportedShapesResponse.Builder::supportedShapeCollection)
                .handleResponseHeaderString(
                        "opc-next-page", ListSupportedShapesResponse.Builder::opcNextPage)
                .handleResponseHeaderString(
                        "opc-request-id", ListSupportedShapesResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public ListTermVersionsResponse listTermVersions(ListTermVersionsRequest request) {
        Objects.requireNonNull(request.getTermId(), "termId is required");

        return clientCall(request, ListTermVersionsResponse::builder)
                .logger(LOG, "listTermVersions")
                .serviceDetails(
                        "MarketplacePublisher",
                        "ListTermVersions",
                        "https://docs.oracle.com/iaas/api/#/en/publisher/20241201/TermVersionCollection/ListTermVersions")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListTermVersionsRequest::builder)
                .basePath("/20241201")
                .appendPathParam("termVersions")
                .appendQueryParam("termId", request.getTermId())
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .appendQueryParam("displayName", request.getDisplayName())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .handleBody(
                        com.oracle.bmc.marketplacepublisher.model.TermVersionCollection.class,
                        ListTermVersionsResponse.Builder::termVersionCollection)
                .handleResponseHeaderString(
                        "opc-next-page", ListTermVersionsResponse.Builder::opcNextPage)
                .handleResponseHeaderString(
                        "opc-request-id", ListTermVersionsResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public ListTermsResponse listTerms(ListTermsRequest request) {
        Objects.requireNonNull(request.getCompartmentId(), "compartmentId is required");

        return clientCall(request, ListTermsResponse::builder)
                .logger(LOG, "listTerms")
                .serviceDetails(
                        "MarketplacePublisher",
                        "ListTerms",
                        "https://docs.oracle.com/iaas/api/#/en/publisher/20241201/TermCollection/ListTerms")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListTermsRequest::builder)
                .basePath("/20241201")
                .appendPathParam("terms")
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .appendQueryParam("name", request.getName())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .handleBody(
                        com.oracle.bmc.marketplacepublisher.model.TermCollection.class,
                        ListTermsResponse.Builder::termCollection)
                .handleResponseHeaderString("opc-next-page", ListTermsResponse.Builder::opcNextPage)
                .handleResponseHeaderString(
                        "opc-request-id", ListTermsResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public ListWorkRequestErrorsResponse listWorkRequestErrors(
            ListWorkRequestErrorsRequest request) {

        Validate.notBlank(request.getWorkRequestId(), "workRequestId must not be blank");

        return clientCall(request, ListWorkRequestErrorsResponse::builder)
                .logger(LOG, "listWorkRequestErrors")
                .serviceDetails(
                        "MarketplacePublisher",
                        "ListWorkRequestErrors",
                        "https://docs.oracle.com/iaas/api/#/en/publisher/20241201/WorkRequestError/ListWorkRequestErrors")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListWorkRequestErrorsRequest::builder)
                .basePath("/20241201")
                .appendPathParam("workRequests")
                .appendPathParam(request.getWorkRequestId())
                .appendPathParam("errors")
                .appendQueryParam("page", request.getPage())
                .appendQueryParam("limit", request.getLimit())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .handleBody(
                        com.oracle.bmc.marketplacepublisher.model.WorkRequestErrorCollection.class,
                        ListWorkRequestErrorsResponse.Builder::workRequestErrorCollection)
                .handleResponseHeaderString(
                        "opc-next-page", ListWorkRequestErrorsResponse.Builder::opcNextPage)
                .handleResponseHeaderString(
                        "opc-request-id", ListWorkRequestErrorsResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public ListWorkRequestLogsResponse listWorkRequestLogs(ListWorkRequestLogsRequest request) {

        Validate.notBlank(request.getWorkRequestId(), "workRequestId must not be blank");

        return clientCall(request, ListWorkRequestLogsResponse::builder)
                .logger(LOG, "listWorkRequestLogs")
                .serviceDetails(
                        "MarketplacePublisher",
                        "ListWorkRequestLogs",
                        "https://docs.oracle.com/iaas/api/#/en/publisher/20241201/WorkRequestLogEntry/ListWorkRequestLogs")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListWorkRequestLogsRequest::builder)
                .basePath("/20241201")
                .appendPathParam("workRequests")
                .appendPathParam(request.getWorkRequestId())
                .appendPathParam("logs")
                .appendQueryParam("page", request.getPage())
                .appendQueryParam("limit", request.getLimit())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .handleBody(
                        com.oracle.bmc.marketplacepublisher.model.WorkRequestLogEntryCollection
                                .class,
                        ListWorkRequestLogsResponse.Builder::workRequestLogEntryCollection)
                .handleResponseHeaderString(
                        "opc-next-page", ListWorkRequestLogsResponse.Builder::opcNextPage)
                .handleResponseHeaderString(
                        "opc-request-id", ListWorkRequestLogsResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public ListWorkRequestsResponse listWorkRequests(ListWorkRequestsRequest request) {
        Objects.requireNonNull(request.getCompartmentId(), "compartmentId is required");

        return clientCall(request, ListWorkRequestsResponse::builder)
                .logger(LOG, "listWorkRequests")
                .serviceDetails(
                        "MarketplacePublisher",
                        "ListWorkRequests",
                        "https://docs.oracle.com/iaas/api/#/en/publisher/20241201/WorkRequest/ListWorkRequests")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListWorkRequestsRequest::builder)
                .basePath("/20241201")
                .appendPathParam("workRequests")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendQueryParam("workRequestId", request.getWorkRequestId())
                .appendEnumQueryParam("status", request.getStatus())
                .appendQueryParam("resourceId", request.getResourceId())
                .appendQueryParam("page", request.getPage())
                .appendQueryParam("limit", request.getLimit())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .handleBody(
                        com.oracle.bmc.marketplacepublisher.model.WorkRequestSummaryCollection
                                .class,
                        ListWorkRequestsResponse.Builder::workRequestSummaryCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListWorkRequestsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListWorkRequestsResponse.Builder::opcNextPage)
                .callSync();
    }

    @Override
    public MarkListingRevisionPackageAsDefaultResponse markListingRevisionPackageAsDefault(
            MarkListingRevisionPackageAsDefaultRequest request) {

        Validate.notBlank(
                request.getListingRevisionPackageId(),
                "listingRevisionPackageId must not be blank");

        return clientCall(request, MarkListingRevisionPackageAsDefaultResponse::builder)
                .logger(LOG, "markListingRevisionPackageAsDefault")
                .serviceDetails(
                        "MarketplacePublisher",
                        "MarkListingRevisionPackageAsDefault",
                        "https://docs.oracle.com/iaas/api/#/en/publisher/20241201/ListingRevisionPackage/MarkListingRevisionPackageAsDefault")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(MarkListingRevisionPackageAsDefaultRequest::builder)
                .basePath("/20241201")
                .appendPathParam("listingRevisionPackages")
                .appendPathParam(request.getListingRevisionPackageId())
                .appendPathParam("actions")
                .appendPathParam("markAsDefault")
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .operationUsesDefaultRetries()
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        MarkListingRevisionPackageAsDefaultResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id",
                        MarkListingRevisionPackageAsDefaultResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public PublishListingRevisionResponse publishListingRevision(
            PublishListingRevisionRequest request) {

        Validate.notBlank(request.getListingRevisionId(), "listingRevisionId must not be blank");

        return clientCall(request, PublishListingRevisionResponse::builder)
                .logger(LOG, "publishListingRevision")
                .serviceDetails(
                        "MarketplacePublisher",
                        "PublishListingRevision",
                        "https://docs.oracle.com/iaas/api/#/en/publisher/20241201/ListingRevision/PublishListingRevision")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(PublishListingRevisionRequest::builder)
                .basePath("/20241201")
                .appendPathParam("listingRevisions")
                .appendPathParam(request.getListingRevisionId())
                .appendPathParam("actions")
                .appendPathParam("publish")
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .operationUsesDefaultRetries()
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        PublishListingRevisionResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", PublishListingRevisionResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public PublishListingRevisionAsPrivateResponse publishListingRevisionAsPrivate(
            PublishListingRevisionAsPrivateRequest request) {
        Objects.requireNonNull(
                request.getPublishListingRevisionAsPrivateDetails(),
                "publishListingRevisionAsPrivateDetails is required");

        Validate.notBlank(request.getListingRevisionId(), "listingRevisionId must not be blank");

        return clientCall(request, PublishListingRevisionAsPrivateResponse::builder)
                .logger(LOG, "publishListingRevisionAsPrivate")
                .serviceDetails(
                        "MarketplacePublisher",
                        "PublishListingRevisionAsPrivate",
                        "https://docs.oracle.com/iaas/api/#/en/publisher/20241201/ListingRevision/PublishListingRevisionAsPrivate")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(PublishListingRevisionAsPrivateRequest::builder)
                .basePath("/20241201")
                .appendPathParam("listingRevisions")
                .appendPathParam(request.getListingRevisionId())
                .appendPathParam("actions")
                .appendPathParam("publishAsPrivate")
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .operationUsesDefaultRetries()
                .hasBody()
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        PublishListingRevisionAsPrivateResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id",
                        PublishListingRevisionAsPrivateResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public PublishListingRevisionPackageResponse publishListingRevisionPackage(
            PublishListingRevisionPackageRequest request) {

        Validate.notBlank(
                request.getListingRevisionPackageId(),
                "listingRevisionPackageId must not be blank");

        return clientCall(request, PublishListingRevisionPackageResponse::builder)
                .logger(LOG, "publishListingRevisionPackage")
                .serviceDetails(
                        "MarketplacePublisher",
                        "PublishListingRevisionPackage",
                        "https://docs.oracle.com/iaas/api/#/en/publisher/20241201/ListingRevisionPackage/PublishListingRevisionPackage")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(PublishListingRevisionPackageRequest::builder)
                .basePath("/20241201")
                .appendPathParam("listingRevisionPackages")
                .appendPathParam(request.getListingRevisionPackageId())
                .appendPathParam("actions")
                .appendPathParam("publish")
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .operationUsesDefaultRetries()
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        PublishListingRevisionPackageResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id",
                        PublishListingRevisionPackageResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public SubmitListingRevisionForReviewResponse submitListingRevisionForReview(
            SubmitListingRevisionForReviewRequest request) {
        Objects.requireNonNull(
                request.getSubmitListingRevisionForReviewDetails(),
                "submitListingRevisionForReviewDetails is required");

        Validate.notBlank(request.getListingRevisionId(), "listingRevisionId must not be blank");

        return clientCall(request, SubmitListingRevisionForReviewResponse::builder)
                .logger(LOG, "submitListingRevisionForReview")
                .serviceDetails(
                        "MarketplacePublisher",
                        "SubmitListingRevisionForReview",
                        "https://docs.oracle.com/iaas/api/#/en/publisher/20241201/ListingRevision/SubmitListingRevisionForReview")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(SubmitListingRevisionForReviewRequest::builder)
                .basePath("/20241201")
                .appendPathParam("listingRevisions")
                .appendPathParam(request.getListingRevisionId())
                .appendPathParam("actions")
                .appendPathParam("submitForReview")
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .operationUsesDefaultRetries()
                .hasBody()
                .handleBody(
                        com.oracle.bmc.marketplacepublisher.model.ListingRevision.class,
                        SubmitListingRevisionForReviewResponse.Builder::listingRevision)
                .handleResponseHeaderString(
                        "etag", SubmitListingRevisionForReviewResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id",
                        SubmitListingRevisionForReviewResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public UnPublishListingRevisionPackageResponse unPublishListingRevisionPackage(
            UnPublishListingRevisionPackageRequest request) {

        Validate.notBlank(
                request.getListingRevisionPackageId(),
                "listingRevisionPackageId must not be blank");

        return clientCall(request, UnPublishListingRevisionPackageResponse::builder)
                .logger(LOG, "unPublishListingRevisionPackage")
                .serviceDetails(
                        "MarketplacePublisher",
                        "UnPublishListingRevisionPackage",
                        "https://docs.oracle.com/iaas/api/#/en/publisher/20241201/ListingRevisionPackage/UnPublishListingRevisionPackage")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(UnPublishListingRevisionPackageRequest::builder)
                .basePath("/20241201")
                .appendPathParam("listingRevisionPackages")
                .appendPathParam(request.getListingRevisionPackageId())
                .appendPathParam("actions")
                .appendPathParam("unPublish")
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .operationUsesDefaultRetries()
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        UnPublishListingRevisionPackageResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id",
                        UnPublishListingRevisionPackageResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public UpdateArtifactResponse updateArtifact(UpdateArtifactRequest request) {

        Validate.notBlank(request.getArtifactId(), "artifactId must not be blank");
        Objects.requireNonNull(
                request.getUpdateArtifactDetails(), "updateArtifactDetails is required");

        return clientCall(request, UpdateArtifactResponse::builder)
                .logger(LOG, "updateArtifact")
                .serviceDetails(
                        "MarketplacePublisher",
                        "UpdateArtifact",
                        "https://docs.oracle.com/iaas/api/#/en/publisher/20241201/Artifact/UpdateArtifact")
                .method(com.oracle.bmc.http.client.Method.PUT)
                .requestBuilder(UpdateArtifactRequest::builder)
                .basePath("/20241201")
                .appendPathParam("artifacts")
                .appendPathParam(request.getArtifactId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .hasBody()
                .handleResponseHeaderString(
                        "opc-work-request-id", UpdateArtifactResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", UpdateArtifactResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public UpdateListingResponse updateListing(UpdateListingRequest request) {

        Validate.notBlank(request.getListingId(), "listingId must not be blank");
        Objects.requireNonNull(
                request.getUpdateListingDetails(), "updateListingDetails is required");

        return clientCall(request, UpdateListingResponse::builder)
                .logger(LOG, "updateListing")
                .serviceDetails(
                        "MarketplacePublisher",
                        "UpdateListing",
                        "https://docs.oracle.com/iaas/api/#/en/publisher/20241201/Listing/UpdateListing")
                .method(com.oracle.bmc.http.client.Method.PUT)
                .requestBuilder(UpdateListingRequest::builder)
                .basePath("/20241201")
                .appendPathParam("listings")
                .appendPathParam(request.getListingId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .hasBody()
                .handleBody(
                        com.oracle.bmc.marketplacepublisher.model.Listing.class,
                        UpdateListingResponse.Builder::listing)
                .handleResponseHeaderString("etag", UpdateListingResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", UpdateListingResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public UpdateListingRevisionResponse updateListingRevision(
            UpdateListingRevisionRequest request) {

        Validate.notBlank(request.getListingRevisionId(), "listingRevisionId must not be blank");
        Objects.requireNonNull(
                request.getUpdateListingRevisionDetails(),
                "updateListingRevisionDetails is required");

        return clientCall(request, UpdateListingRevisionResponse::builder)
                .logger(LOG, "updateListingRevision")
                .serviceDetails(
                        "MarketplacePublisher",
                        "UpdateListingRevision",
                        "https://docs.oracle.com/iaas/api/#/en/publisher/20241201/ListingRevision/UpdateListingRevision")
                .method(com.oracle.bmc.http.client.Method.PUT)
                .requestBuilder(UpdateListingRevisionRequest::builder)
                .basePath("/20241201")
                .appendPathParam("listingRevisions")
                .appendPathParam(request.getListingRevisionId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .hasBody()
                .handleBody(
                        com.oracle.bmc.marketplacepublisher.model.ListingRevision.class,
                        UpdateListingRevisionResponse.Builder::listingRevision)
                .handleResponseHeaderString("etag", UpdateListingRevisionResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", UpdateListingRevisionResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public UpdateListingRevisionAttachmentResponse updateListingRevisionAttachment(
            UpdateListingRevisionAttachmentRequest request) {

        Validate.notBlank(
                request.getListingRevisionAttachmentId(),
                "listingRevisionAttachmentId must not be blank");
        Objects.requireNonNull(
                request.getUpdateListingRevisionAttachmentDetails(),
                "updateListingRevisionAttachmentDetails is required");

        return clientCall(request, UpdateListingRevisionAttachmentResponse::builder)
                .logger(LOG, "updateListingRevisionAttachment")
                .serviceDetails(
                        "MarketplacePublisher",
                        "UpdateListingRevisionAttachment",
                        "https://docs.oracle.com/iaas/api/#/en/publisher/20241201/ListingRevisionAttachment/UpdateListingRevisionAttachment")
                .method(com.oracle.bmc.http.client.Method.PUT)
                .requestBuilder(UpdateListingRevisionAttachmentRequest::builder)
                .basePath("/20241201")
                .appendPathParam("listingRevisionAttachments")
                .appendPathParam(request.getListingRevisionAttachmentId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .hasBody()
                .handleBody(
                        com.oracle.bmc.marketplacepublisher.model.ListingRevisionAttachment.class,
                        UpdateListingRevisionAttachmentResponse.Builder::listingRevisionAttachment)
                .handleResponseHeaderString(
                        "opc-request-id",
                        UpdateListingRevisionAttachmentResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "etag", UpdateListingRevisionAttachmentResponse.Builder::etag)
                .callSync();
    }

    @Override
    public UpdateListingRevisionAttachmentContentResponse updateListingRevisionAttachmentContent(
            UpdateListingRevisionAttachmentContentRequest request) {

        Validate.notBlank(
                request.getListingRevisionAttachmentId(),
                "listingRevisionAttachmentId must not be blank");
        Objects.requireNonNull(
                request.getUpdateListingRevisionAttachmentContent(),
                "updateListingRevisionAttachmentContent is required");

        return clientCall(request, UpdateListingRevisionAttachmentContentResponse::builder)
                .logger(LOG, "updateListingRevisionAttachmentContent")
                .serviceDetails(
                        "MarketplacePublisher",
                        "UpdateListingRevisionAttachmentContent",
                        "https://docs.oracle.com/iaas/api/#/en/publisher/20241201/ListingRevisionAttachment/UpdateListingRevisionAttachmentContent")
                .method(com.oracle.bmc.http.client.Method.PUT)
                .requestBuilder(UpdateListingRevisionAttachmentContentRequest::builder)
                .basePath("/20241201")
                .appendPathParam("listingRevisionAttachments")
                .appendPathParam(request.getListingRevisionAttachmentId())
                .appendPathParam("content")
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .hasBinaryRequestBody()
                .hasBody()
                .handleBody(
                        com.oracle.bmc.marketplacepublisher.model.ListingRevisionAttachment.class,
                        UpdateListingRevisionAttachmentContentResponse.Builder
                                ::listingRevisionAttachment)
                .handleResponseHeaderString(
                        "opc-request-id",
                        UpdateListingRevisionAttachmentContentResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "etag", UpdateListingRevisionAttachmentContentResponse.Builder::etag)
                .callSync();
    }

    @Override
    public UpdateListingRevisionIconContentResponse updateListingRevisionIconContent(
            UpdateListingRevisionIconContentRequest request) {

        Validate.notBlank(request.getListingRevisionId(), "listingRevisionId must not be blank");
        Objects.requireNonNull(
                request.getUpdateListingRevisionIconContent(),
                "updateListingRevisionIconContent is required");

        return clientCall(request, UpdateListingRevisionIconContentResponse::builder)
                .logger(LOG, "updateListingRevisionIconContent")
                .serviceDetails(
                        "MarketplacePublisher",
                        "UpdateListingRevisionIconContent",
                        "https://docs.oracle.com/iaas/api/#/en/publisher/20241201/ListingRevision/UpdateListingRevisionIconContent")
                .method(com.oracle.bmc.http.client.Method.PUT)
                .requestBuilder(UpdateListingRevisionIconContentRequest::builder)
                .basePath("/20241201")
                .appendPathParam("listingRevisions")
                .appendPathParam(request.getListingRevisionId())
                .appendPathParam("icon")
                .appendPathParam("content")
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .hasBinaryRequestBody()
                .hasBody()
                .handleBody(
                        com.oracle.bmc.marketplacepublisher.model.ListingRevision.class,
                        UpdateListingRevisionIconContentResponse.Builder::listingRevision)
                .handleResponseHeaderString(
                        "etag", UpdateListingRevisionIconContentResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id",
                        UpdateListingRevisionIconContentResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public UpdateListingRevisionNoteResponse updateListingRevisionNote(
            UpdateListingRevisionNoteRequest request) {

        Validate.notBlank(
                request.getListingRevisionNoteId(), "listingRevisionNoteId must not be blank");
        Objects.requireNonNull(
                request.getUpdateListingRevisionNoteDetails(),
                "updateListingRevisionNoteDetails is required");

        return clientCall(request, UpdateListingRevisionNoteResponse::builder)
                .logger(LOG, "updateListingRevisionNote")
                .serviceDetails(
                        "MarketplacePublisher",
                        "UpdateListingRevisionNote",
                        "https://docs.oracle.com/iaas/api/#/en/publisher/20241201/ListingRevisionNote/UpdateListingRevisionNote")
                .method(com.oracle.bmc.http.client.Method.PUT)
                .requestBuilder(UpdateListingRevisionNoteRequest::builder)
                .basePath("/20241201")
                .appendPathParam("listingRevisionNotes")
                .appendPathParam(request.getListingRevisionNoteId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .hasBody()
                .handleBody(
                        com.oracle.bmc.marketplacepublisher.model.ListingRevisionNote.class,
                        UpdateListingRevisionNoteResponse.Builder::listingRevisionNote)
                .handleResponseHeaderString("etag", UpdateListingRevisionNoteResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", UpdateListingRevisionNoteResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public UpdateListingRevisionPackageResponse updateListingRevisionPackage(
            UpdateListingRevisionPackageRequest request) {

        Validate.notBlank(
                request.getListingRevisionPackageId(),
                "listingRevisionPackageId must not be blank");
        Objects.requireNonNull(
                request.getUpdateListingRevisionPackageDetails(),
                "updateListingRevisionPackageDetails is required");

        return clientCall(request, UpdateListingRevisionPackageResponse::builder)
                .logger(LOG, "updateListingRevisionPackage")
                .serviceDetails(
                        "MarketplacePublisher",
                        "UpdateListingRevisionPackage",
                        "https://docs.oracle.com/iaas/api/#/en/publisher/20241201/ListingRevisionPackage/UpdateListingRevisionPackage")
                .method(com.oracle.bmc.http.client.Method.PUT)
                .requestBuilder(UpdateListingRevisionPackageRequest::builder)
                .basePath("/20241201")
                .appendPathParam("listingRevisionPackages")
                .appendPathParam(request.getListingRevisionPackageId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .hasBody()
                .handleBody(
                        com.oracle.bmc.marketplacepublisher.model.ListingRevisionPackage.class,
                        UpdateListingRevisionPackageResponse.Builder::listingRevisionPackage)
                .handleResponseHeaderString(
                        "opc-request-id",
                        UpdateListingRevisionPackageResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "etag", UpdateListingRevisionPackageResponse.Builder::etag)
                .callSync();
    }

    @Override
    public UpdateTermResponse updateTerm(UpdateTermRequest request) {

        Validate.notBlank(request.getTermId(), "termId must not be blank");
        Objects.requireNonNull(request.getUpdateTermDetails(), "updateTermDetails is required");

        return clientCall(request, UpdateTermResponse::builder)
                .logger(LOG, "updateTerm")
                .serviceDetails(
                        "MarketplacePublisher",
                        "UpdateTerm",
                        "https://docs.oracle.com/iaas/api/#/en/publisher/20241201/Term/UpdateTerm")
                .method(com.oracle.bmc.http.client.Method.PUT)
                .requestBuilder(UpdateTermRequest::builder)
                .basePath("/20241201")
                .appendPathParam("terms")
                .appendPathParam(request.getTermId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .hasBody()
                .handleBody(
                        com.oracle.bmc.marketplacepublisher.model.Term.class,
                        UpdateTermResponse.Builder::term)
                .handleResponseHeaderString("etag", UpdateTermResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", UpdateTermResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public UpdateTermVersionResponse updateTermVersion(UpdateTermVersionRequest request) {

        Validate.notBlank(request.getTermVersionId(), "termVersionId must not be blank");
        Objects.requireNonNull(
                request.getUpdateTermVersionDetails(), "updateTermVersionDetails is required");

        return clientCall(request, UpdateTermVersionResponse::builder)
                .logger(LOG, "updateTermVersion")
                .serviceDetails(
                        "MarketplacePublisher",
                        "UpdateTermVersion",
                        "https://docs.oracle.com/iaas/api/#/en/publisher/20241201/TermVersion/UpdateTermVersion")
                .method(com.oracle.bmc.http.client.Method.PUT)
                .requestBuilder(UpdateTermVersionRequest::builder)
                .basePath("/20241201")
                .appendPathParam("termVersions")
                .appendPathParam(request.getTermVersionId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .hasBody()
                .handleBody(
                        com.oracle.bmc.marketplacepublisher.model.TermVersion.class,
                        UpdateTermVersionResponse.Builder::termVersion)
                .handleResponseHeaderString("etag", UpdateTermVersionResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", UpdateTermVersionResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public UpdateTermVersionContentResponse updateTermVersionContent(
            UpdateTermVersionContentRequest request) {

        Validate.notBlank(request.getTermVersionId(), "termVersionId must not be blank");
        Objects.requireNonNull(
                request.getUpdateTermVersionContent(), "updateTermVersionContent is required");

        return clientCall(request, UpdateTermVersionContentResponse::builder)
                .logger(LOG, "updateTermVersionContent")
                .serviceDetails(
                        "MarketplacePublisher",
                        "UpdateTermVersionContent",
                        "https://docs.oracle.com/iaas/api/#/en/publisher/20241201/TermVersion/UpdateTermVersionContent")
                .method(com.oracle.bmc.http.client.Method.PUT)
                .requestBuilder(UpdateTermVersionContentRequest::builder)
                .basePath("/20241201")
                .appendPathParam("termVersions")
                .appendPathParam(request.getTermVersionId())
                .appendPathParam("content")
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("display-name", request.getDisplayName())
                .operationUsesDefaultRetries()
                .hasBinaryRequestBody()
                .hasBody()
                .handleBody(
                        com.oracle.bmc.marketplacepublisher.model.TermVersion.class,
                        UpdateTermVersionContentResponse.Builder::termVersion)
                .handleResponseHeaderString("etag", UpdateTermVersionContentResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", UpdateTermVersionContentResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public ValidateAndPublishArtifactResponse validateAndPublishArtifact(
            ValidateAndPublishArtifactRequest request) {

        Validate.notBlank(request.getArtifactId(), "artifactId must not be blank");

        return clientCall(request, ValidateAndPublishArtifactResponse::builder)
                .logger(LOG, "validateAndPublishArtifact")
                .serviceDetails(
                        "MarketplacePublisher",
                        "ValidateAndPublishArtifact",
                        "https://docs.oracle.com/iaas/api/#/en/publisher/20241201/Artifact/ValidateAndPublishArtifact")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(ValidateAndPublishArtifactRequest::builder)
                .basePath("/20241201")
                .appendPathParam("artifacts")
                .appendPathParam(request.getArtifactId())
                .appendPathParam("actions")
                .appendPathParam("validateAndPublish")
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .operationUsesDefaultRetries()
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        ValidateAndPublishArtifactResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", ValidateAndPublishArtifactResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public WithdrawListingRevisionResponse withdrawListingRevision(
            WithdrawListingRevisionRequest request) {

        Validate.notBlank(request.getListingRevisionId(), "listingRevisionId must not be blank");

        return clientCall(request, WithdrawListingRevisionResponse::builder)
                .logger(LOG, "withdrawListingRevision")
                .serviceDetails(
                        "MarketplacePublisher",
                        "WithdrawListingRevision",
                        "https://docs.oracle.com/iaas/api/#/en/publisher/20241201/ListingRevision/WithdrawListingRevision")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(WithdrawListingRevisionRequest::builder)
                .basePath("/20241201")
                .appendPathParam("listingRevisions")
                .appendPathParam(request.getListingRevisionId())
                .appendPathParam("actions")
                .appendPathParam("withdraw")
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .operationUsesDefaultRetries()
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        WithdrawListingRevisionResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", WithdrawListingRevisionResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public MarketplacePublisherWaiters getWaiters() {
        return waiters;
    }

    @Override
    public MarketplacePublisherPaginators getPaginators() {
        return paginators;
    }

    /**
     * Create a new client instance.
     *
     * @param authenticationDetailsProvider The authentication details (see {@link Builder#build})
     * @deprecated Use the {@link #builder() builder} instead.
     */
    @Deprecated
    public MarketplacePublisherClient(
            com.oracle.bmc.auth.BasicAuthenticationDetailsProvider authenticationDetailsProvider) {
        this(builder(), authenticationDetailsProvider, null);
    }

    /**
     * Create a new client instance.
     *
     * @param authenticationDetailsProvider The authentication details (see {@link Builder#build})
     * @param configuration {@link Builder#configuration}
     * @deprecated Use the {@link #builder() builder} instead.
     */
    @Deprecated
    public MarketplacePublisherClient(
            com.oracle.bmc.auth.BasicAuthenticationDetailsProvider authenticationDetailsProvider,
            com.oracle.bmc.ClientConfiguration configuration) {
        this(builder().configuration(configuration), authenticationDetailsProvider, null);
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
    public MarketplacePublisherClient(
            com.oracle.bmc.auth.BasicAuthenticationDetailsProvider authenticationDetailsProvider,
            com.oracle.bmc.ClientConfiguration configuration,
            com.oracle.bmc.http.ClientConfigurator clientConfigurator) {
        this(
                builder().configuration(configuration).clientConfigurator(clientConfigurator),
                authenticationDetailsProvider,
                null);
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
    public MarketplacePublisherClient(
            com.oracle.bmc.auth.AbstractAuthenticationDetailsProvider authenticationDetailsProvider,
            com.oracle.bmc.ClientConfiguration configuration,
            com.oracle.bmc.http.ClientConfigurator clientConfigurator,
            com.oracle.bmc.http.signing.RequestSignerFactory defaultRequestSignerFactory) {
        this(
                builder()
                        .configuration(configuration)
                        .clientConfigurator(clientConfigurator)
                        .requestSignerFactory(defaultRequestSignerFactory),
                authenticationDetailsProvider,
                null);
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
    public MarketplacePublisherClient(
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
                authenticationDetailsProvider,
                null);
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
    public MarketplacePublisherClient(
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
                authenticationDetailsProvider,
                null);
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
    public MarketplacePublisherClient(
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
                authenticationDetailsProvider,
                null);
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
     * @param executorService {@link Builder#executorService}
     * @deprecated Use the {@link #builder() builder} instead.
     */
    @Deprecated
    public MarketplacePublisherClient(
            com.oracle.bmc.auth.AbstractAuthenticationDetailsProvider authenticationDetailsProvider,
            com.oracle.bmc.ClientConfiguration configuration,
            com.oracle.bmc.http.ClientConfigurator clientConfigurator,
            com.oracle.bmc.http.signing.RequestSignerFactory defaultRequestSignerFactory,
            java.util.Map<
                            com.oracle.bmc.http.signing.SigningStrategy,
                            com.oracle.bmc.http.signing.RequestSignerFactory>
                    signingStrategyRequestSignerFactories,
            java.util.List<com.oracle.bmc.http.ClientConfigurator> additionalClientConfigurators,
            String endpoint,
            java.util.concurrent.ExecutorService executorService) {
        this(
                builder()
                        .configuration(configuration)
                        .clientConfigurator(clientConfigurator)
                        .requestSignerFactory(defaultRequestSignerFactory)
                        .additionalClientConfigurators(additionalClientConfigurators)
                        .endpoint(endpoint)
                        .signingStrategyRequestSignerFactories(
                                signingStrategyRequestSignerFactories),
                authenticationDetailsProvider,
                executorService);
    }
}

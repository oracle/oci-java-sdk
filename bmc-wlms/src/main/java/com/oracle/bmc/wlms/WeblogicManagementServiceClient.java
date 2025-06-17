/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.wlms;

import com.oracle.bmc.util.internal.Validate;
import com.oracle.bmc.wlms.requests.*;
import com.oracle.bmc.wlms.responses.*;
import com.oracle.bmc.circuitbreaker.CircuitBreakerConfiguration;
import com.oracle.bmc.util.CircuitBreakerUtils;

import java.util.Objects;

@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20241101")
public class WeblogicManagementServiceClient extends com.oracle.bmc.http.internal.BaseSyncClient
        implements WeblogicManagementService {
    /** Service instance for WeblogicManagementService. */
    public static final com.oracle.bmc.Service SERVICE =
            com.oracle.bmc.Services.serviceBuilder()
                    .serviceName("WEBLOGICMANAGEMENTSERVICE")
                    .serviceEndpointPrefix("")
                    .serviceEndpointTemplate(
                            "https://api.weblogicmanagement.{region}.oci.{secondLevelDomain}")
                    .build();

    private static final org.slf4j.Logger LOG =
            org.slf4j.LoggerFactory.getLogger(WeblogicManagementServiceClient.class);

    private final WeblogicManagementServiceWaiters waiters;

    private final WeblogicManagementServicePaginators paginators;

    WeblogicManagementServiceClient(
            com.oracle.bmc.common.ClientBuilderBase<?, ?> builder,
            com.oracle.bmc.auth.AbstractAuthenticationDetailsProvider authenticationDetailsProvider,
            java.util.concurrent.ExecutorService executorService) {
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
                                    .nameFormat("WeblogicManagementService-waiters-%d")
                                    .build());
            threadPoolExecutor.allowCoreThreadTimeOut(true);

            executorService = threadPoolExecutor;
        }
        this.waiters = new WeblogicManagementServiceWaiters(executorService, this);

        this.paginators = new WeblogicManagementServicePaginators(this);
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
                    Builder, WeblogicManagementServiceClient> {
        private java.util.concurrent.ExecutorService executorService;

        private Builder(com.oracle.bmc.Service service) {
            super(service);
            final String packageName = "wlms";
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
         * Build the client.
         *
         * @param authenticationDetailsProvider authentication details provider
         * @return the client
         */
        public WeblogicManagementServiceClient build(
                @jakarta.annotation.Nonnull
                        com.oracle.bmc.auth.AbstractAuthenticationDetailsProvider
                                authenticationDetailsProvider) {
            return new WeblogicManagementServiceClient(
                    this, authenticationDetailsProvider, executorService);
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
    public ChangeWlsDomainCompartmentResponse changeWlsDomainCompartment(
            ChangeWlsDomainCompartmentRequest request) {

        Validate.notBlank(request.getWlsDomainId(), "wlsDomainId must not be blank");
        Objects.requireNonNull(
                request.getChangeWlsDomainCompartmentDetails(),
                "changeWlsDomainCompartmentDetails is required");

        return clientCall(request, ChangeWlsDomainCompartmentResponse::builder)
                .logger(LOG, "changeWlsDomainCompartment")
                .serviceDetails(
                        "WeblogicManagementService",
                        "ChangeWlsDomainCompartment",
                        "https://docs.oracle.com/iaas/api/#/en/wlms/20241101/WlsDomain/ChangeWlsDomainCompartment")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(ChangeWlsDomainCompartmentRequest::builder)
                .basePath("/20241101")
                .appendPathParam("wlsDomains")
                .appendPathParam(request.getWlsDomainId())
                .appendPathParam("actions")
                .appendPathParam("changeCompartment")
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .operationUsesDefaultRetries()
                .hasBody()
                .handleResponseHeaderString(
                        "opc-request-id", ChangeWlsDomainCompartmentResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public CreateAgreementRecordResponse createAgreementRecord(
            CreateAgreementRecordRequest request) {
        Objects.requireNonNull(
                request.getCreateAgreementRecordDetails(),
                "createAgreementRecordDetails is required");

        Validate.notBlank(request.getWlsDomainId(), "wlsDomainId must not be blank");

        return clientCall(request, CreateAgreementRecordResponse::builder)
                .logger(LOG, "createAgreementRecord")
                .serviceDetails(
                        "WeblogicManagementService",
                        "CreateAgreementRecord",
                        "https://docs.oracle.com/iaas/api/#/en/wlms/20241101/WlsDomain/CreateAgreementRecord")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CreateAgreementRecordRequest::builder)
                .basePath("/20241101")
                .appendPathParam("wlsDomains")
                .appendPathParam(request.getWlsDomainId())
                .appendPathParam("agreementRecords")
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .operationUsesDefaultRetries()
                .hasBody()
                .handleBody(
                        com.oracle.bmc.wlms.model.AgreementRecord.class,
                        CreateAgreementRecordResponse.Builder::agreementRecord)
                .handleResponseHeaderString("etag", CreateAgreementRecordResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", CreateAgreementRecordResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public DeleteWlsDomainResponse deleteWlsDomain(DeleteWlsDomainRequest request) {

        Validate.notBlank(request.getWlsDomainId(), "wlsDomainId must not be blank");

        return clientCall(request, DeleteWlsDomainResponse::builder)
                .logger(LOG, "deleteWlsDomain")
                .serviceDetails(
                        "WeblogicManagementService",
                        "DeleteWlsDomain",
                        "https://docs.oracle.com/iaas/api/#/en/wlms/20241101/WlsDomain/DeleteWlsDomain")
                .method(com.oracle.bmc.http.client.Method.DELETE)
                .requestBuilder(DeleteWlsDomainRequest::builder)
                .basePath("/20241101")
                .appendPathParam("wlsDomains")
                .appendPathParam(request.getWlsDomainId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .operationUsesDefaultRetries()
                .handleResponseHeaderString(
                        "opc-request-id", DeleteWlsDomainResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public GetAgreementResponse getAgreement(GetAgreementRequest request) {

        return clientCall(request, GetAgreementResponse::builder)
                .logger(LOG, "getAgreement")
                .serviceDetails(
                        "WeblogicManagementService",
                        "GetAgreement",
                        "https://docs.oracle.com/iaas/api/#/en/wlms/20241101/Agreement/GetAgreement")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetAgreementRequest::builder)
                .basePath("/20241101")
                .appendPathParam("agreement")
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .handleBody(
                        com.oracle.bmc.wlms.model.Agreement.class,
                        GetAgreementResponse.Builder::agreement)
                .handleResponseHeaderString(
                        "opc-request-id", GetAgreementResponse.Builder::opcRequestId)
                .handleResponseHeaderString("etag", GetAgreementResponse.Builder::etag)
                .callSync();
    }

    @Override
    public GetManagedInstanceResponse getManagedInstance(GetManagedInstanceRequest request) {

        Validate.notBlank(request.getManagedInstanceId(), "managedInstanceId must not be blank");

        return clientCall(request, GetManagedInstanceResponse::builder)
                .logger(LOG, "getManagedInstance")
                .serviceDetails(
                        "WeblogicManagementService",
                        "GetManagedInstance",
                        "https://docs.oracle.com/iaas/api/#/en/wlms/20241101/ManagedInstance/GetManagedInstance")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetManagedInstanceRequest::builder)
                .basePath("/20241101")
                .appendPathParam("managedInstances")
                .appendPathParam(request.getManagedInstanceId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .handleBody(
                        com.oracle.bmc.wlms.model.ManagedInstance.class,
                        GetManagedInstanceResponse.Builder::managedInstance)
                .handleResponseHeaderString("etag", GetManagedInstanceResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", GetManagedInstanceResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public GetManagedInstanceServerResponse getManagedInstanceServer(
            GetManagedInstanceServerRequest request) {

        Validate.notBlank(request.getManagedInstanceId(), "managedInstanceId must not be blank");

        Validate.notBlank(request.getServerId(), "serverId must not be blank");

        return clientCall(request, GetManagedInstanceServerResponse::builder)
                .logger(LOG, "getManagedInstanceServer")
                .serviceDetails(
                        "WeblogicManagementService",
                        "GetManagedInstanceServer",
                        "https://docs.oracle.com/iaas/api/#/en/wlms/20241101/ManagedInstance/GetManagedInstanceServer")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetManagedInstanceServerRequest::builder)
                .basePath("/20241101")
                .appendPathParam("managedInstances")
                .appendPathParam(request.getManagedInstanceId())
                .appendPathParam("servers")
                .appendPathParam(request.getServerId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .handleBody(
                        com.oracle.bmc.wlms.model.Server.class,
                        GetManagedInstanceServerResponse.Builder::server)
                .handleResponseHeaderString("etag", GetManagedInstanceServerResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", GetManagedInstanceServerResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public GetWlsDomainResponse getWlsDomain(GetWlsDomainRequest request) {

        Validate.notBlank(request.getWlsDomainId(), "wlsDomainId must not be blank");

        return clientCall(request, GetWlsDomainResponse::builder)
                .logger(LOG, "getWlsDomain")
                .serviceDetails(
                        "WeblogicManagementService",
                        "GetWlsDomain",
                        "https://docs.oracle.com/iaas/api/#/en/wlms/20241101/WlsDomain/GetWlsDomain")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetWlsDomainRequest::builder)
                .basePath("/20241101")
                .appendPathParam("wlsDomains")
                .appendPathParam(request.getWlsDomainId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .handleBody(
                        com.oracle.bmc.wlms.model.WlsDomain.class,
                        GetWlsDomainResponse.Builder::wlsDomain)
                .handleResponseHeaderString("etag", GetWlsDomainResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", GetWlsDomainResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public GetWlsDomainCredentialResponse getWlsDomainCredential(
            GetWlsDomainCredentialRequest request) {

        Validate.notBlank(request.getWlsDomainId(), "wlsDomainId must not be blank");

        Validate.notBlank(
                request.getCredentialType().getValue(), "credentialType must not be blank");

        return clientCall(request, GetWlsDomainCredentialResponse::builder)
                .logger(LOG, "getWlsDomainCredential")
                .serviceDetails(
                        "WeblogicManagementService",
                        "GetWlsDomainCredential",
                        "https://docs.oracle.com/iaas/api/#/en/wlms/20241101/WlsDomain/GetWlsDomainCredential")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetWlsDomainCredentialRequest::builder)
                .basePath("/20241101")
                .appendPathParam("wlsDomains")
                .appendPathParam(request.getWlsDomainId())
                .appendPathParam("credentials")
                .appendPathParam(request.getCredentialType().getValue())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .handleBody(
                        com.oracle.bmc.wlms.model.WlsDomainCredential.class,
                        GetWlsDomainCredentialResponse.Builder::wlsDomainCredential)
                .handleResponseHeaderString("etag", GetWlsDomainCredentialResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", GetWlsDomainCredentialResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public GetWlsDomainServerResponse getWlsDomainServer(GetWlsDomainServerRequest request) {

        Validate.notBlank(request.getWlsDomainId(), "wlsDomainId must not be blank");

        Validate.notBlank(request.getServerId(), "serverId must not be blank");

        return clientCall(request, GetWlsDomainServerResponse::builder)
                .logger(LOG, "getWlsDomainServer")
                .serviceDetails(
                        "WeblogicManagementService",
                        "GetWlsDomainServer",
                        "https://docs.oracle.com/iaas/api/#/en/wlms/20241101/WlsDomain/GetWlsDomainServer")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetWlsDomainServerRequest::builder)
                .basePath("/20241101")
                .appendPathParam("wlsDomains")
                .appendPathParam(request.getWlsDomainId())
                .appendPathParam("servers")
                .appendPathParam(request.getServerId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .handleBody(
                        com.oracle.bmc.wlms.model.Server.class,
                        GetWlsDomainServerResponse.Builder::server)
                .handleResponseHeaderString("etag", GetWlsDomainServerResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", GetWlsDomainServerResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public GetWlsDomainServerBackupResponse getWlsDomainServerBackup(
            GetWlsDomainServerBackupRequest request) {

        Validate.notBlank(request.getWlsDomainId(), "wlsDomainId must not be blank");

        Validate.notBlank(request.getServerId(), "serverId must not be blank");

        Validate.notBlank(request.getBackupId(), "backupId must not be blank");

        return clientCall(request, GetWlsDomainServerBackupResponse::builder)
                .logger(LOG, "getWlsDomainServerBackup")
                .serviceDetails(
                        "WeblogicManagementService",
                        "GetWlsDomainServerBackup",
                        "https://docs.oracle.com/iaas/api/#/en/wlms/20241101/WlsDomain/GetWlsDomainServerBackup")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetWlsDomainServerBackupRequest::builder)
                .basePath("/20241101")
                .appendPathParam("wlsDomains")
                .appendPathParam(request.getWlsDomainId())
                .appendPathParam("servers")
                .appendPathParam(request.getServerId())
                .appendPathParam("backups")
                .appendPathParam(request.getBackupId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .handleBody(
                        com.oracle.bmc.wlms.model.Backup.class,
                        GetWlsDomainServerBackupResponse.Builder::backup)
                .handleResponseHeaderString("etag", GetWlsDomainServerBackupResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", GetWlsDomainServerBackupResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public GetWlsDomainServerBackupContentResponse getWlsDomainServerBackupContent(
            GetWlsDomainServerBackupContentRequest request) {

        Validate.notBlank(request.getWlsDomainId(), "wlsDomainId must not be blank");

        Validate.notBlank(request.getServerId(), "serverId must not be blank");

        Validate.notBlank(request.getBackupId(), "backupId must not be blank");

        return clientCall(request, GetWlsDomainServerBackupContentResponse::builder)
                .logger(LOG, "getWlsDomainServerBackupContent")
                .serviceDetails(
                        "WeblogicManagementService",
                        "GetWlsDomainServerBackupContent",
                        "https://docs.oracle.com/iaas/api/#/en/wlms/20241101/WlsDomain/GetWlsDomainServerBackupContent")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetWlsDomainServerBackupContentRequest::builder)
                .basePath("/20241101")
                .appendPathParam("wlsDomains")
                .appendPathParam(request.getWlsDomainId())
                .appendPathParam("servers")
                .appendPathParam(request.getServerId())
                .appendPathParam("backups")
                .appendPathParam(request.getBackupId())
                .appendPathParam("content")
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .handleBody(
                        com.oracle.bmc.wlms.model.BackupContent.class,
                        GetWlsDomainServerBackupContentResponse.Builder::backupContent)
                .handleResponseHeaderString(
                        "etag", GetWlsDomainServerBackupContentResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id",
                        GetWlsDomainServerBackupContentResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public GetWorkRequestResponse getWorkRequest(GetWorkRequestRequest request) {

        Validate.notBlank(request.getWorkRequestId(), "workRequestId must not be blank");

        return clientCall(request, GetWorkRequestResponse::builder)
                .logger(LOG, "getWorkRequest")
                .serviceDetails(
                        "WeblogicManagementService",
                        "GetWorkRequest",
                        "https://docs.oracle.com/iaas/api/#/en/wlms/20241101/WorkRequest/GetWorkRequest")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetWorkRequestRequest::builder)
                .basePath("/20241101")
                .appendPathParam("workRequests")
                .appendPathParam(request.getWorkRequestId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .handleBody(
                        com.oracle.bmc.wlms.model.WorkRequest.class,
                        GetWorkRequestResponse.Builder::workRequest)
                .handleResponseHeaderString("etag", GetWorkRequestResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", GetWorkRequestResponse.Builder::opcRequestId)
                .handleResponseHeaderInteger(
                        "retry-after", GetWorkRequestResponse.Builder::retryAfter)
                .callSync();
    }

    @Override
    public InstallLatestPatchesOnWlsDomainResponse installLatestPatchesOnWlsDomain(
            InstallLatestPatchesOnWlsDomainRequest request) {

        Validate.notBlank(request.getWlsDomainId(), "wlsDomainId must not be blank");
        Objects.requireNonNull(
                request.getInstallLatestPatchesOnWlsDomainDetails(),
                "installLatestPatchesOnWlsDomainDetails is required");

        return clientCall(request, InstallLatestPatchesOnWlsDomainResponse::builder)
                .logger(LOG, "installLatestPatchesOnWlsDomain")
                .serviceDetails(
                        "WeblogicManagementService",
                        "InstallLatestPatchesOnWlsDomain",
                        "https://docs.oracle.com/iaas/api/#/en/wlms/20241101/WlsDomain/InstallLatestPatchesOnWlsDomain")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(InstallLatestPatchesOnWlsDomainRequest::builder)
                .basePath("/20241101")
                .appendPathParam("wlsDomains")
                .appendPathParam(request.getWlsDomainId())
                .appendPathParam("actions")
                .appendPathParam("installLatestPatches")
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .operationUsesDefaultRetries()
                .hasBody()
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        InstallLatestPatchesOnWlsDomainResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id",
                        InstallLatestPatchesOnWlsDomainResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public ListAgreementRecordsResponse listAgreementRecords(ListAgreementRecordsRequest request) {

        Validate.notBlank(request.getWlsDomainId(), "wlsDomainId must not be blank");

        return clientCall(request, ListAgreementRecordsResponse::builder)
                .logger(LOG, "listAgreementRecords")
                .serviceDetails(
                        "WeblogicManagementService",
                        "ListAgreementRecords",
                        "https://docs.oracle.com/iaas/api/#/en/wlms/20241101/WlsDomain/ListAgreementRecords")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListAgreementRecordsRequest::builder)
                .basePath("/20241101")
                .appendPathParam("wlsDomains")
                .appendPathParam(request.getWlsDomainId())
                .appendPathParam("agreementRecords")
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .handleBody(
                        com.oracle.bmc.wlms.model.AgreementRecordCollection.class,
                        ListAgreementRecordsResponse.Builder::agreementRecordCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListAgreementRecordsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListAgreementRecordsResponse.Builder::opcNextPage)
                .callSync();
    }

    @Override
    public ListApplicablePatchesResponse listApplicablePatches(
            ListApplicablePatchesRequest request) {

        Validate.notBlank(request.getWlsDomainId(), "wlsDomainId must not be blank");

        return clientCall(request, ListApplicablePatchesResponse::builder)
                .logger(LOG, "listApplicablePatches")
                .serviceDetails(
                        "WeblogicManagementService",
                        "ListApplicablePatches",
                        "https://docs.oracle.com/iaas/api/#/en/wlms/20241101/WlsDomain/ListApplicablePatches")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListApplicablePatchesRequest::builder)
                .basePath("/20241101")
                .appendPathParam("wlsDomains")
                .appendPathParam(request.getWlsDomainId())
                .appendPathParam("applicablePatches")
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .operationUsesDefaultRetries()
                .handleBody(
                        com.oracle.bmc.wlms.model.ApplicablePatchCollection.class,
                        ListApplicablePatchesResponse.Builder::applicablePatchCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListApplicablePatchesResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListApplicablePatchesResponse.Builder::opcNextPage)
                .callSync();
    }

    @Override
    public ListManagedInstanceScanResultsResponse listManagedInstanceScanResults(
            ListManagedInstanceScanResultsRequest request) {

        Validate.notBlank(request.getManagedInstanceId(), "managedInstanceId must not be blank");

        return clientCall(request, ListManagedInstanceScanResultsResponse::builder)
                .logger(LOG, "listManagedInstanceScanResults")
                .serviceDetails(
                        "WeblogicManagementService",
                        "ListManagedInstanceScanResults",
                        "https://docs.oracle.com/iaas/api/#/en/wlms/20241101/ManagedInstance/ListManagedInstanceScanResults")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListManagedInstanceScanResultsRequest::builder)
                .basePath("/20241101")
                .appendPathParam("managedInstances")
                .appendPathParam(request.getManagedInstanceId())
                .appendPathParam("scanResults")
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .appendQueryParam("wlsDomainId", request.getWlsDomainId())
                .appendQueryParam("serverName", request.getServerName())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .handleBody(
                        com.oracle.bmc.wlms.model.ScanResultCollection.class,
                        ListManagedInstanceScanResultsResponse.Builder::scanResultCollection)
                .handleResponseHeaderString(
                        "opc-request-id",
                        ListManagedInstanceScanResultsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page",
                        ListManagedInstanceScanResultsResponse.Builder::opcNextPage)
                .callSync();
    }

    @Override
    public ListManagedInstanceServerInstalledPatchesResponse
            listManagedInstanceServerInstalledPatches(
                    ListManagedInstanceServerInstalledPatchesRequest request) {

        Validate.notBlank(request.getManagedInstanceId(), "managedInstanceId must not be blank");

        Validate.notBlank(request.getServerId(), "serverId must not be blank");

        return clientCall(request, ListManagedInstanceServerInstalledPatchesResponse::builder)
                .logger(LOG, "listManagedInstanceServerInstalledPatches")
                .serviceDetails(
                        "WeblogicManagementService",
                        "ListManagedInstanceServerInstalledPatches",
                        "https://docs.oracle.com/iaas/api/#/en/wlms/20241101/ManagedInstance/ListManagedInstanceServerInstalledPatches")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListManagedInstanceServerInstalledPatchesRequest::builder)
                .basePath("/20241101")
                .appendPathParam("managedInstances")
                .appendPathParam(request.getManagedInstanceId())
                .appendPathParam("servers")
                .appendPathParam(request.getServerId())
                .appendPathParam("installedPatches")
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .handleBody(
                        com.oracle.bmc.wlms.model.InstalledPatchCollection.class,
                        ListManagedInstanceServerInstalledPatchesResponse.Builder
                                ::installedPatchCollection)
                .handleResponseHeaderString(
                        "opc-request-id",
                        ListManagedInstanceServerInstalledPatchesResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page",
                        ListManagedInstanceServerInstalledPatchesResponse.Builder::opcNextPage)
                .callSync();
    }

    @Override
    public ListManagedInstanceServersResponse listManagedInstanceServers(
            ListManagedInstanceServersRequest request) {

        Validate.notBlank(request.getManagedInstanceId(), "managedInstanceId must not be blank");

        return clientCall(request, ListManagedInstanceServersResponse::builder)
                .logger(LOG, "listManagedInstanceServers")
                .serviceDetails(
                        "WeblogicManagementService",
                        "ListManagedInstanceServers",
                        "https://docs.oracle.com/iaas/api/#/en/wlms/20241101/ManagedInstance/ListManagedInstanceServers")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListManagedInstanceServersRequest::builder)
                .basePath("/20241101")
                .appendPathParam("managedInstances")
                .appendPathParam(request.getManagedInstanceId())
                .appendPathParam("servers")
                .appendQueryParam("name", request.getName())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .operationUsesDefaultRetries()
                .handleBody(
                        com.oracle.bmc.wlms.model.ServerCollection.class,
                        ListManagedInstanceServersResponse.Builder::serverCollection)
                .handleResponseHeaderString(
                        "opc-next-page", ListManagedInstanceServersResponse.Builder::opcNextPage)
                .handleResponseHeaderString(
                        "opc-request-id", ListManagedInstanceServersResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public ListManagedInstancesResponse listManagedInstances(ListManagedInstancesRequest request) {

        return clientCall(request, ListManagedInstancesResponse::builder)
                .logger(LOG, "listManagedInstances")
                .serviceDetails(
                        "WeblogicManagementService",
                        "ListManagedInstances",
                        "https://docs.oracle.com/iaas/api/#/en/wlms/20241101/ManagedInstance/ListManagedInstances")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListManagedInstancesRequest::builder)
                .basePath("/20241101")
                .appendPathParam("managedInstances")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendQueryParam("displayName", request.getDisplayName())
                .appendQueryParam("id", request.getId())
                .appendEnumQueryParam("pluginStatus", request.getPluginStatus())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .operationUsesDefaultRetries()
                .handleBody(
                        com.oracle.bmc.wlms.model.ManagedInstanceCollection.class,
                        ListManagedInstancesResponse.Builder::managedInstanceCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListManagedInstancesResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListManagedInstancesResponse.Builder::opcNextPage)
                .callSync();
    }

    @Override
    public ListRequiredPoliciesResponse listRequiredPolicies(ListRequiredPoliciesRequest request) {

        return clientCall(request, ListRequiredPoliciesResponse::builder)
                .logger(LOG, "listRequiredPolicies")
                .serviceDetails(
                        "WeblogicManagementService",
                        "ListRequiredPolicies",
                        "https://docs.oracle.com/iaas/api/#/en/wlms/20241101/RequiredPolicyCollection/ListRequiredPolicies")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListRequiredPoliciesRequest::builder)
                .basePath("/20241101")
                .appendPathParam("requiredPolicies")
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .handleBody(
                        com.oracle.bmc.wlms.model.RequiredPolicyCollection.class,
                        ListRequiredPoliciesResponse.Builder::requiredPolicyCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListRequiredPoliciesResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListRequiredPoliciesResponse.Builder::opcNextPage)
                .callSync();
    }

    @Override
    public ListWlsDomainCredentialsResponse listWlsDomainCredentials(
            ListWlsDomainCredentialsRequest request) {

        Validate.notBlank(request.getWlsDomainId(), "wlsDomainId must not be blank");

        return clientCall(request, ListWlsDomainCredentialsResponse::builder)
                .logger(LOG, "listWlsDomainCredentials")
                .serviceDetails(
                        "WeblogicManagementService",
                        "ListWlsDomainCredentials",
                        "https://docs.oracle.com/iaas/api/#/en/wlms/20241101/WlsDomain/ListWlsDomainCredentials")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListWlsDomainCredentialsRequest::builder)
                .basePath("/20241101")
                .appendPathParam("wlsDomains")
                .appendPathParam(request.getWlsDomainId())
                .appendPathParam("credentials")
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .operationUsesDefaultRetries()
                .handleBody(
                        com.oracle.bmc.wlms.model.WlsDomainCredentialCollection.class,
                        ListWlsDomainCredentialsResponse.Builder::wlsDomainCredentialCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListWlsDomainCredentialsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListWlsDomainCredentialsResponse.Builder::opcNextPage)
                .callSync();
    }

    @Override
    public ListWlsDomainScanResultsResponse listWlsDomainScanResults(
            ListWlsDomainScanResultsRequest request) {

        Validate.notBlank(request.getWlsDomainId(), "wlsDomainId must not be blank");

        return clientCall(request, ListWlsDomainScanResultsResponse::builder)
                .logger(LOG, "listWlsDomainScanResults")
                .serviceDetails(
                        "WeblogicManagementService",
                        "ListWlsDomainScanResults",
                        "https://docs.oracle.com/iaas/api/#/en/wlms/20241101/WlsDomain/ListWlsDomainScanResults")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListWlsDomainScanResultsRequest::builder)
                .basePath("/20241101")
                .appendPathParam("wlsDomains")
                .appendPathParam(request.getWlsDomainId())
                .appendPathParam("scanResults")
                .appendQueryParam("serverName", request.getServerName())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .handleBody(
                        com.oracle.bmc.wlms.model.ScanResultCollection.class,
                        ListWlsDomainScanResultsResponse.Builder::scanResultCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListWlsDomainScanResultsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListWlsDomainScanResultsResponse.Builder::opcNextPage)
                .callSync();
    }

    @Override
    public ListWlsDomainServerBackupsResponse listWlsDomainServerBackups(
            ListWlsDomainServerBackupsRequest request) {

        Validate.notBlank(request.getWlsDomainId(), "wlsDomainId must not be blank");

        Validate.notBlank(request.getServerId(), "serverId must not be blank");

        return clientCall(request, ListWlsDomainServerBackupsResponse::builder)
                .logger(LOG, "listWlsDomainServerBackups")
                .serviceDetails(
                        "WeblogicManagementService",
                        "ListWlsDomainServerBackups",
                        "https://docs.oracle.com/iaas/api/#/en/wlms/20241101/WlsDomain/ListWlsDomainServerBackups")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListWlsDomainServerBackupsRequest::builder)
                .basePath("/20241101")
                .appendPathParam("wlsDomains")
                .appendPathParam(request.getWlsDomainId())
                .appendPathParam("servers")
                .appendPathParam(request.getServerId())
                .appendPathParam("backups")
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .handleBody(
                        com.oracle.bmc.wlms.model.BackupCollection.class,
                        ListWlsDomainServerBackupsResponse.Builder::backupCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListWlsDomainServerBackupsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListWlsDomainServerBackupsResponse.Builder::opcNextPage)
                .callSync();
    }

    @Override
    public ListWlsDomainServerInstalledPatchesResponse listWlsDomainServerInstalledPatches(
            ListWlsDomainServerInstalledPatchesRequest request) {

        Validate.notBlank(request.getWlsDomainId(), "wlsDomainId must not be blank");

        Validate.notBlank(request.getServerId(), "serverId must not be blank");

        return clientCall(request, ListWlsDomainServerInstalledPatchesResponse::builder)
                .logger(LOG, "listWlsDomainServerInstalledPatches")
                .serviceDetails(
                        "WeblogicManagementService",
                        "ListWlsDomainServerInstalledPatches",
                        "https://docs.oracle.com/iaas/api/#/en/wlms/20241101/WlsDomain/ListWlsDomainServerInstalledPatches")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListWlsDomainServerInstalledPatchesRequest::builder)
                .basePath("/20241101")
                .appendPathParam("wlsDomains")
                .appendPathParam(request.getWlsDomainId())
                .appendPathParam("servers")
                .appendPathParam(request.getServerId())
                .appendPathParam("installedPatches")
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .handleBody(
                        com.oracle.bmc.wlms.model.InstalledPatchCollection.class,
                        ListWlsDomainServerInstalledPatchesResponse.Builder
                                ::installedPatchCollection)
                .handleResponseHeaderString(
                        "opc-request-id",
                        ListWlsDomainServerInstalledPatchesResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page",
                        ListWlsDomainServerInstalledPatchesResponse.Builder::opcNextPage)
                .callSync();
    }

    @Override
    public ListWlsDomainServersResponse listWlsDomainServers(ListWlsDomainServersRequest request) {

        Validate.notBlank(request.getWlsDomainId(), "wlsDomainId must not be blank");

        return clientCall(request, ListWlsDomainServersResponse::builder)
                .logger(LOG, "listWlsDomainServers")
                .serviceDetails(
                        "WeblogicManagementService",
                        "ListWlsDomainServers",
                        "https://docs.oracle.com/iaas/api/#/en/wlms/20241101/WlsDomain/ListWlsDomainServers")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListWlsDomainServersRequest::builder)
                .basePath("/20241101")
                .appendPathParam("wlsDomains")
                .appendPathParam(request.getWlsDomainId())
                .appendPathParam("servers")
                .appendQueryParam("name", request.getName())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .operationUsesDefaultRetries()
                .handleBody(
                        com.oracle.bmc.wlms.model.ServerCollection.class,
                        ListWlsDomainServersResponse.Builder::serverCollection)
                .handleResponseHeaderString(
                        "opc-next-page", ListWlsDomainServersResponse.Builder::opcNextPage)
                .handleResponseHeaderString(
                        "opc-request-id", ListWlsDomainServersResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public ListWlsDomainsResponse listWlsDomains(ListWlsDomainsRequest request) {

        return clientCall(request, ListWlsDomainsResponse::builder)
                .logger(LOG, "listWlsDomains")
                .serviceDetails(
                        "WeblogicManagementService",
                        "ListWlsDomains",
                        "https://docs.oracle.com/iaas/api/#/en/wlms/20241101/WlsDomain/ListWlsDomains")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListWlsDomainsRequest::builder)
                .basePath("/20241101")
                .appendPathParam("wlsDomains")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendEnumQueryParam("lifecycleState", request.getLifecycleState())
                .appendQueryParam("displayName", request.getDisplayName())
                .appendQueryParam("id", request.getId())
                .appendEnumQueryParam("weblogicVersion", request.getWeblogicVersion())
                .appendEnumQueryParam("middlewareType", request.getMiddlewareType())
                .appendEnumQueryParam("patchReadinessStatus", request.getPatchReadinessStatus())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .operationUsesDefaultRetries()
                .handleBody(
                        com.oracle.bmc.wlms.model.WlsDomainCollection.class,
                        ListWlsDomainsResponse.Builder::wlsDomainCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListWlsDomainsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListWlsDomainsResponse.Builder::opcNextPage)
                .callSync();
    }

    @Override
    public ListWlsDomainsSharingMiddlewaresResponse listWlsDomainsSharingMiddlewares(
            ListWlsDomainsSharingMiddlewaresRequest request) {

        Validate.notBlank(request.getWlsDomainId(), "wlsDomainId must not be blank");

        return clientCall(request, ListWlsDomainsSharingMiddlewaresResponse::builder)
                .logger(LOG, "listWlsDomainsSharingMiddlewares")
                .serviceDetails(
                        "WeblogicManagementService",
                        "ListWlsDomainsSharingMiddlewares",
                        "https://docs.oracle.com/iaas/api/#/en/wlms/20241101/WlsDomain/ListWlsDomainsSharingMiddlewares")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListWlsDomainsSharingMiddlewaresRequest::builder)
                .basePath("/20241101")
                .appendPathParam("wlsDomains")
                .appendPathParam(request.getWlsDomainId())
                .appendPathParam("wlsDomainsSharingMiddleware")
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .handleBody(
                        com.oracle.bmc.wlms.model.WlsDomainCollection.class,
                        ListWlsDomainsSharingMiddlewaresResponse.Builder::wlsDomainCollection)
                .handleResponseHeaderString(
                        "opc-request-id",
                        ListWlsDomainsSharingMiddlewaresResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page",
                        ListWlsDomainsSharingMiddlewaresResponse.Builder::opcNextPage)
                .callSync();
    }

    @Override
    public ListWorkRequestErrorsResponse listWorkRequestErrors(
            ListWorkRequestErrorsRequest request) {

        Validate.notBlank(request.getWorkRequestId(), "workRequestId must not be blank");

        return clientCall(request, ListWorkRequestErrorsResponse::builder)
                .logger(LOG, "listWorkRequestErrors")
                .serviceDetails(
                        "WeblogicManagementService",
                        "ListWorkRequestErrors",
                        "https://docs.oracle.com/iaas/api/#/en/wlms/20241101/WorkRequest/ListWorkRequestErrors")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListWorkRequestErrorsRequest::builder)
                .basePath("/20241101")
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
                        com.oracle.bmc.wlms.model.WorkRequestErrorCollection.class,
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
                        "WeblogicManagementService",
                        "ListWorkRequestLogs",
                        "https://docs.oracle.com/iaas/api/#/en/wlms/20241101/WorkRequest/ListWorkRequestLogs")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListWorkRequestLogsRequest::builder)
                .basePath("/20241101")
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
                        com.oracle.bmc.wlms.model.WorkRequestLogEntryCollection.class,
                        ListWorkRequestLogsResponse.Builder::workRequestLogEntryCollection)
                .handleResponseHeaderString(
                        "opc-next-page", ListWorkRequestLogsResponse.Builder::opcNextPage)
                .handleResponseHeaderString(
                        "opc-request-id", ListWorkRequestLogsResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public ListWorkRequestsResponse listWorkRequests(ListWorkRequestsRequest request) {

        return clientCall(request, ListWorkRequestsResponse::builder)
                .logger(LOG, "listWorkRequests")
                .serviceDetails(
                        "WeblogicManagementService",
                        "ListWorkRequests",
                        "https://docs.oracle.com/iaas/api/#/en/wlms/20241101/WorkRequest/ListWorkRequests")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListWorkRequestsRequest::builder)
                .basePath("/20241101")
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
                        com.oracle.bmc.wlms.model.WorkRequestSummaryCollection.class,
                        ListWorkRequestsResponse.Builder::workRequestSummaryCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListWorkRequestsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListWorkRequestsResponse.Builder::opcNextPage)
                .callSync();
    }

    @Override
    public RestartWlsDomainResponse restartWlsDomain(RestartWlsDomainRequest request) {

        Validate.notBlank(request.getWlsDomainId(), "wlsDomainId must not be blank");
        Objects.requireNonNull(
                request.getRestartWlsDomainDetails(), "restartWlsDomainDetails is required");

        return clientCall(request, RestartWlsDomainResponse::builder)
                .logger(LOG, "restartWlsDomain")
                .serviceDetails(
                        "WeblogicManagementService",
                        "RestartWlsDomain",
                        "https://docs.oracle.com/iaas/api/#/en/wlms/20241101/WlsDomain/RestartWlsDomain")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(RestartWlsDomainRequest::builder)
                .basePath("/20241101")
                .appendPathParam("wlsDomains")
                .appendPathParam(request.getWlsDomainId())
                .appendPathParam("actions")
                .appendPathParam("restart")
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .operationUsesDefaultRetries()
                .hasBody()
                .handleResponseHeaderString(
                        "opc-work-request-id", RestartWlsDomainResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", RestartWlsDomainResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public RestoreWlsDomainResponse restoreWlsDomain(RestoreWlsDomainRequest request) {

        Validate.notBlank(request.getWlsDomainId(), "wlsDomainId must not be blank");
        Objects.requireNonNull(
                request.getRestoreWlsDomainDetails(), "restoreWlsDomainDetails is required");

        return clientCall(request, RestoreWlsDomainResponse::builder)
                .logger(LOG, "restoreWlsDomain")
                .serviceDetails(
                        "WeblogicManagementService",
                        "RestoreWlsDomain",
                        "https://docs.oracle.com/iaas/api/#/en/wlms/20241101/WlsDomain/RestoreWlsDomain")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(RestoreWlsDomainRequest::builder)
                .basePath("/20241101")
                .appendPathParam("wlsDomains")
                .appendPathParam(request.getWlsDomainId())
                .appendPathParam("actions")
                .appendPathParam("restore")
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .operationUsesDefaultRetries()
                .hasBody()
                .handleResponseHeaderString(
                        "opc-work-request-id", RestoreWlsDomainResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", RestoreWlsDomainResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public ScanManagedInstanceResponse scanManagedInstance(ScanManagedInstanceRequest request) {

        Validate.notBlank(request.getManagedInstanceId(), "managedInstanceId must not be blank");

        return clientCall(request, ScanManagedInstanceResponse::builder)
                .logger(LOG, "scanManagedInstance")
                .serviceDetails(
                        "WeblogicManagementService",
                        "ScanManagedInstance",
                        "https://docs.oracle.com/iaas/api/#/en/wlms/20241101/ManagedInstance/ScanManagedInstance")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(ScanManagedInstanceRequest::builder)
                .basePath("/20241101")
                .appendPathParam("managedInstances")
                .appendPathParam(request.getManagedInstanceId())
                .appendPathParam("actions")
                .appendPathParam("scan")
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("if-match", request.getIfMatch())
                .operationUsesDefaultRetries()
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        ScanManagedInstanceResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", ScanManagedInstanceResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public ScanWlsDomainResponse scanWlsDomain(ScanWlsDomainRequest request) {

        Validate.notBlank(request.getWlsDomainId(), "wlsDomainId must not be blank");

        return clientCall(request, ScanWlsDomainResponse::builder)
                .logger(LOG, "scanWlsDomain")
                .serviceDetails(
                        "WeblogicManagementService",
                        "ScanWlsDomain",
                        "https://docs.oracle.com/iaas/api/#/en/wlms/20241101/WlsDomain/ScanWlsDomain")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(ScanWlsDomainRequest::builder)
                .basePath("/20241101")
                .appendPathParam("wlsDomains")
                .appendPathParam(request.getWlsDomainId())
                .appendPathParam("actions")
                .appendPathParam("scan")
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .operationUsesDefaultRetries()
                .handleResponseHeaderString(
                        "opc-work-request-id", ScanWlsDomainResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", ScanWlsDomainResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public SetRestartOrderResponse setRestartOrder(SetRestartOrderRequest request) {

        Validate.notBlank(request.getWlsDomainId(), "wlsDomainId must not be blank");
        Objects.requireNonNull(
                request.getSetRestartOrderDetails(), "setRestartOrderDetails is required");

        return clientCall(request, SetRestartOrderResponse::builder)
                .logger(LOG, "setRestartOrder")
                .serviceDetails(
                        "WeblogicManagementService",
                        "SetRestartOrder",
                        "https://docs.oracle.com/iaas/api/#/en/wlms/20241101/WlsDomain/SetRestartOrder")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(SetRestartOrderRequest::builder)
                .basePath("/20241101")
                .appendPathParam("wlsDomains")
                .appendPathParam(request.getWlsDomainId())
                .appendPathParam("actions")
                .appendPathParam("setRestartOrder")
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .operationUsesDefaultRetries()
                .hasBody()
                .handleBody(
                        com.oracle.bmc.wlms.model.ServerCollection.class,
                        SetRestartOrderResponse.Builder::serverCollection)
                .handleResponseHeaderString("etag", SetRestartOrderResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", SetRestartOrderResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public StartWlsDomainResponse startWlsDomain(StartWlsDomainRequest request) {

        Validate.notBlank(request.getWlsDomainId(), "wlsDomainId must not be blank");

        return clientCall(request, StartWlsDomainResponse::builder)
                .logger(LOG, "startWlsDomain")
                .serviceDetails(
                        "WeblogicManagementService",
                        "StartWlsDomain",
                        "https://docs.oracle.com/iaas/api/#/en/wlms/20241101/WlsDomain/StartWlsDomain")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(StartWlsDomainRequest::builder)
                .basePath("/20241101")
                .appendPathParam("wlsDomains")
                .appendPathParam(request.getWlsDomainId())
                .appendPathParam("actions")
                .appendPathParam("start")
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .operationUsesDefaultRetries()
                .handleResponseHeaderString(
                        "opc-work-request-id", StartWlsDomainResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", StartWlsDomainResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public StopWlsDomainResponse stopWlsDomain(StopWlsDomainRequest request) {

        Validate.notBlank(request.getWlsDomainId(), "wlsDomainId must not be blank");
        Objects.requireNonNull(
                request.getStopWlsDomainDetails(), "stopWlsDomainDetails is required");

        return clientCall(request, StopWlsDomainResponse::builder)
                .logger(LOG, "stopWlsDomain")
                .serviceDetails(
                        "WeblogicManagementService",
                        "StopWlsDomain",
                        "https://docs.oracle.com/iaas/api/#/en/wlms/20241101/WlsDomain/StopWlsDomain")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(StopWlsDomainRequest::builder)
                .basePath("/20241101")
                .appendPathParam("wlsDomains")
                .appendPathParam(request.getWlsDomainId())
                .appendPathParam("actions")
                .appendPathParam("stop")
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .operationUsesDefaultRetries()
                .hasBody()
                .handleResponseHeaderString(
                        "opc-work-request-id", StopWlsDomainResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", StopWlsDomainResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public SummarizeResourceInventoryResponse summarizeResourceInventory(
            SummarizeResourceInventoryRequest request) {
        Objects.requireNonNull(request.getCompartmentId(), "compartmentId is required");

        return clientCall(request, SummarizeResourceInventoryResponse::builder)
                .logger(LOG, "summarizeResourceInventory")
                .serviceDetails(
                        "WeblogicManagementService",
                        "SummarizeResourceInventory",
                        "https://docs.oracle.com/iaas/api/#/en/wlms/20241101/ResourceInventory/SummarizeResourceInventory")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(SummarizeResourceInventoryRequest::builder)
                .basePath("/20241101")
                .appendPathParam("resourceInventory")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .handleBody(
                        com.oracle.bmc.wlms.model.ResourceInventory.class,
                        SummarizeResourceInventoryResponse.Builder::resourceInventory)
                .handleResponseHeaderString(
                        "opc-request-id", SummarizeResourceInventoryResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public UpdateManagedInstanceResponse updateManagedInstance(
            UpdateManagedInstanceRequest request) {

        Validate.notBlank(request.getManagedInstanceId(), "managedInstanceId must not be blank");
        Objects.requireNonNull(
                request.getUpdateManagedInstanceDetails(),
                "updateManagedInstanceDetails is required");

        return clientCall(request, UpdateManagedInstanceResponse::builder)
                .logger(LOG, "updateManagedInstance")
                .serviceDetails(
                        "WeblogicManagementService",
                        "UpdateManagedInstance",
                        "https://docs.oracle.com/iaas/api/#/en/wlms/20241101/ManagedInstance/UpdateManagedInstance")
                .method(com.oracle.bmc.http.client.Method.PUT)
                .requestBuilder(UpdateManagedInstanceRequest::builder)
                .basePath("/20241101")
                .appendPathParam("managedInstances")
                .appendPathParam(request.getManagedInstanceId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("if-match", request.getIfMatch())
                .operationUsesDefaultRetries()
                .hasBody()
                .handleBody(
                        com.oracle.bmc.wlms.model.ManagedInstance.class,
                        UpdateManagedInstanceResponse.Builder::managedInstance)
                .handleResponseHeaderString("etag", UpdateManagedInstanceResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", UpdateManagedInstanceResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public UpdateWlsDomainResponse updateWlsDomain(UpdateWlsDomainRequest request) {

        Validate.notBlank(request.getWlsDomainId(), "wlsDomainId must not be blank");
        Objects.requireNonNull(
                request.getUpdateWlsDomainDetails(), "updateWlsDomainDetails is required");

        return clientCall(request, UpdateWlsDomainResponse::builder)
                .logger(LOG, "updateWlsDomain")
                .serviceDetails(
                        "WeblogicManagementService",
                        "UpdateWlsDomain",
                        "https://docs.oracle.com/iaas/api/#/en/wlms/20241101/WlsDomain/UpdateWlsDomain")
                .method(com.oracle.bmc.http.client.Method.PUT)
                .requestBuilder(UpdateWlsDomainRequest::builder)
                .basePath("/20241101")
                .appendPathParam("wlsDomains")
                .appendPathParam(request.getWlsDomainId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .hasBody()
                .handleBody(
                        com.oracle.bmc.wlms.model.WlsDomain.class,
                        UpdateWlsDomainResponse.Builder::wlsDomain)
                .handleResponseHeaderString("etag", UpdateWlsDomainResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", UpdateWlsDomainResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public UpdateWlsDomainCredentialResponse updateWlsDomainCredential(
            UpdateWlsDomainCredentialRequest request) {

        Validate.notBlank(request.getWlsDomainId(), "wlsDomainId must not be blank");

        Validate.notBlank(
                request.getCredentialType().getValue(), "credentialType must not be blank");
        Objects.requireNonNull(
                request.getUpdateWlsDomainCredentialDetails(),
                "updateWlsDomainCredentialDetails is required");

        return clientCall(request, UpdateWlsDomainCredentialResponse::builder)
                .logger(LOG, "updateWlsDomainCredential")
                .serviceDetails(
                        "WeblogicManagementService",
                        "UpdateWlsDomainCredential",
                        "https://docs.oracle.com/iaas/api/#/en/wlms/20241101/WlsDomain/UpdateWlsDomainCredential")
                .method(com.oracle.bmc.http.client.Method.PUT)
                .requestBuilder(UpdateWlsDomainCredentialRequest::builder)
                .basePath("/20241101")
                .appendPathParam("wlsDomains")
                .appendPathParam(request.getWlsDomainId())
                .appendPathParam("credentials")
                .appendPathParam(request.getCredentialType().getValue())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .hasBody()
                .handleBody(
                        com.oracle.bmc.wlms.model.WlsDomainCredential.class,
                        UpdateWlsDomainCredentialResponse.Builder::wlsDomainCredential)
                .handleResponseHeaderString("etag", UpdateWlsDomainCredentialResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", UpdateWlsDomainCredentialResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public WeblogicManagementServiceWaiters getWaiters() {
        return waiters;
    }

    @Override
    public WeblogicManagementServicePaginators getPaginators() {
        return paginators;
    }

    /**
     * Create a new client instance.
     *
     * @param authenticationDetailsProvider The authentication details (see {@link Builder#build})
     * @deprecated Use the {@link #builder() builder} instead.
     */
    @Deprecated
    public WeblogicManagementServiceClient(
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
    public WeblogicManagementServiceClient(
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
    public WeblogicManagementServiceClient(
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
    public WeblogicManagementServiceClient(
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
    public WeblogicManagementServiceClient(
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
    public WeblogicManagementServiceClient(
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
    public WeblogicManagementServiceClient(
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
    public WeblogicManagementServiceClient(
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

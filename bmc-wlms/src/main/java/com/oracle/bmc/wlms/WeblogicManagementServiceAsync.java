/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.wlms;

import com.oracle.bmc.wlms.requests.*;
import com.oracle.bmc.wlms.responses.*;

/**
 * WebLogic Management Service is an OCI service that enables a unified view and management of
 * WebLogic domains in Oracle Cloud Infrastructure. Features include on-demand patching of WebLogic
 * domains, rollback of the last applied patch, discovery and management of WebLogic instances on a
 * compute host.
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20241101")
public interface WeblogicManagementServiceAsync extends AutoCloseable {

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
     * Moves a WebLogic domain into a different compartment within the same tenancy.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ChangeWlsDomainCompartmentResponse> changeWlsDomainCompartment(
            ChangeWlsDomainCompartmentRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            ChangeWlsDomainCompartmentRequest, ChangeWlsDomainCompartmentResponse>
                    handler);

    /**
     * Creates a terms of use agreement record for a WebLogic domain.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<CreateAgreementRecordResponse> createAgreementRecord(
            CreateAgreementRecordRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            CreateAgreementRecordRequest, CreateAgreementRecordResponse>
                    handler);

    /**
     * Delete the WebLogic domain.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<DeleteWlsDomainResponse> deleteWlsDomain(
            DeleteWlsDomainRequest request,
            com.oracle.bmc.responses.AsyncHandler<DeleteWlsDomainRequest, DeleteWlsDomainResponse>
                    handler);

    /**
     * Returns the terms and conditions of use agreement.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<GetAgreementResponse> getAgreement(
            GetAgreementRequest request,
            com.oracle.bmc.responses.AsyncHandler<GetAgreementRequest, GetAgreementResponse>
                    handler);

    /**
     * Gets information about the specified managed instance.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<GetManagedInstanceResponse> getManagedInstance(
            GetManagedInstanceRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            GetManagedInstanceRequest, GetManagedInstanceResponse>
                    handler);

    /**
     * Gets information about the specified server in a managed instance.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<GetManagedInstanceServerResponse> getManagedInstanceServer(
            GetManagedInstanceServerRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            GetManagedInstanceServerRequest, GetManagedInstanceServerResponse>
                    handler);

    /**
     * Gets a specific WebLogic domain.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<GetWlsDomainResponse> getWlsDomain(
            GetWlsDomainRequest request,
            com.oracle.bmc.responses.AsyncHandler<GetWlsDomainRequest, GetWlsDomainResponse>
                    handler);

    /**
     * Gets WebLogic and Node Manager credentials of a specific WebLogic domain.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<GetWlsDomainCredentialResponse> getWlsDomainCredential(
            GetWlsDomainCredentialRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            GetWlsDomainCredentialRequest, GetWlsDomainCredentialResponse>
                    handler);

    /**
     * Gets information about the specified server in a WebLogic domain.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<GetWlsDomainServerResponse> getWlsDomainServer(
            GetWlsDomainServerRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            GetWlsDomainServerRequest, GetWlsDomainServerResponse>
                    handler);

    /**
     * Get details of specific backup for the WebLogic Domain.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<GetWlsDomainServerBackupResponse> getWlsDomainServerBackup(
            GetWlsDomainServerBackupRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            GetWlsDomainServerBackupRequest, GetWlsDomainServerBackupResponse>
                    handler);

    /**
     * Get details of specific backup for the WebLogic Domain.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<GetWlsDomainServerBackupContentResponse>
            getWlsDomainServerBackupContent(
                    GetWlsDomainServerBackupContentRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    GetWlsDomainServerBackupContentRequest,
                                    GetWlsDomainServerBackupContentResponse>
                            handler);

    /**
     * Gets the details of a work request.
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
     * Install the latest patches on a WebLogic domain.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<InstallLatestPatchesOnWlsDomainResponse>
            installLatestPatchesOnWlsDomain(
                    InstallLatestPatchesOnWlsDomainRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    InstallLatestPatchesOnWlsDomainRequest,
                                    InstallLatestPatchesOnWlsDomainResponse>
                            handler);

    /**
     * List the terms of use agreement record for the WebLogic domain.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ListAgreementRecordsResponse> listAgreementRecords(
            ListAgreementRecordsRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            ListAgreementRecordsRequest, ListAgreementRecordsResponse>
                    handler);

    /**
     * Gets the latest patches that can be installed to the WebLogic domains.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ListApplicablePatchesResponse> listApplicablePatches(
            ListApplicablePatchesRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            ListApplicablePatchesRequest, ListApplicablePatchesResponse>
                    handler);

    /**
     * Gets all the scan results for all WebLogic servers in the managed instance.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ListManagedInstanceScanResultsResponse>
            listManagedInstanceScanResults(
                    ListManagedInstanceScanResultsRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    ListManagedInstanceScanResultsRequest,
                                    ListManagedInstanceScanResultsResponse>
                            handler);

    /**
     * Gets a list of installed patches on a server in a managed instance.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ListManagedInstanceServerInstalledPatchesResponse>
            listManagedInstanceServerInstalledPatches(
                    ListManagedInstanceServerInstalledPatchesRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    ListManagedInstanceServerInstalledPatchesRequest,
                                    ListManagedInstanceServerInstalledPatchesResponse>
                            handler);

    /**
     * Gets list of servers in a specific managed instance.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ListManagedInstanceServersResponse> listManagedInstanceServers(
            ListManagedInstanceServersRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            ListManagedInstanceServersRequest, ListManagedInstanceServersResponse>
                    handler);

    /**
     * Lists managed instances that match the specified compartment or managed instance OCID. Filter
     * the list against a variety of criteria including but not limited to its name, status and
     * compartment.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ListManagedInstancesResponse> listManagedInstances(
            ListManagedInstancesRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            ListManagedInstancesRequest, ListManagedInstancesResponse>
                    handler);

    /**
     * Gets all the required policies for the WebLogic Management Service.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ListRequiredPoliciesResponse> listRequiredPolicies(
            ListRequiredPoliciesRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            ListRequiredPoliciesRequest, ListRequiredPoliciesResponse>
                    handler);

    /**
     * Gets domain credentials of a specific domain.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ListWlsDomainCredentialsResponse> listWlsDomainCredentials(
            ListWlsDomainCredentialsRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            ListWlsDomainCredentialsRequest, ListWlsDomainCredentialsResponse>
                    handler);

    /**
     * Get all scan results for a server in a specific WebLogic domain.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ListWlsDomainScanResultsResponse> listWlsDomainScanResults(
            ListWlsDomainScanResultsRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            ListWlsDomainScanResultsRequest, ListWlsDomainScanResultsResponse>
                    handler);

    /**
     * Gets a list of backups for the server of a specific WebLogic Domain.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ListWlsDomainServerBackupsResponse> listWlsDomainServerBackups(
            ListWlsDomainServerBackupsRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            ListWlsDomainServerBackupsRequest, ListWlsDomainServerBackupsResponse>
                    handler);

    /**
     * Gets a list of installed patches on a server for a domain.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ListWlsDomainServerInstalledPatchesResponse>
            listWlsDomainServerInstalledPatches(
                    ListWlsDomainServerInstalledPatchesRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    ListWlsDomainServerInstalledPatchesRequest,
                                    ListWlsDomainServerInstalledPatchesResponse>
                            handler);

    /**
     * Gets list of servers in a specific WebLogic domain.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ListWlsDomainServersResponse> listWlsDomainServers(
            ListWlsDomainServersRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            ListWlsDomainServersRequest, ListWlsDomainServersResponse>
                    handler);

    /**
     * Gets all WebLogic domains in a given compartment.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ListWlsDomainsResponse> listWlsDomains(
            ListWlsDomainsRequest request,
            com.oracle.bmc.responses.AsyncHandler<ListWlsDomainsRequest, ListWlsDomainsResponse>
                    handler);

    /**
     * Gets a list of WebLogic domains that share middleware with a specific domain.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ListWlsDomainsSharingMiddlewaresResponse>
            listWlsDomainsSharingMiddlewares(
                    ListWlsDomainsSharingMiddlewaresRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    ListWlsDomainsSharingMiddlewaresRequest,
                                    ListWlsDomainsSharingMiddlewaresResponse>
                            handler);

    /**
     * Lists the errors for a work request.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ListWorkRequestErrorsResponse> listWorkRequestErrors(
            ListWorkRequestErrorsRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            ListWorkRequestErrorsRequest, ListWorkRequestErrorsResponse>
                    handler);

    /**
     * Lists the logs for a work request.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ListWorkRequestLogsResponse> listWorkRequestLogs(
            ListWorkRequestLogsRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            ListWorkRequestLogsRequest, ListWorkRequestLogsResponse>
                    handler);

    /**
     * Lists the work requests in a compartment.
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
     * Restarts all the servers in the WebLogic domains. Servers that are already stopped are
     * ignored.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<RestartWlsDomainResponse> restartWlsDomain(
            RestartWlsDomainRequest request,
            com.oracle.bmc.responses.AsyncHandler<RestartWlsDomainRequest, RestartWlsDomainResponse>
                    handler);

    /**
     * Restore a domain from backup. If the backup contains a MIDDLEWARE asset, then the middleware
     * of the domain, including patches, will be restored.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<RestoreWlsDomainResponse> restoreWlsDomain(
            RestoreWlsDomainRequest request,
            com.oracle.bmc.responses.AsyncHandler<RestoreWlsDomainRequest, RestoreWlsDomainResponse>
                    handler);

    /**
     * Scans a managed instance for WebLogic domains.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ScanManagedInstanceResponse> scanManagedInstance(
            ScanManagedInstanceRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            ScanManagedInstanceRequest, ScanManagedInstanceResponse>
                    handler);

    /**
     * Runs a series of checks in the WebLogic domain.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ScanWlsDomainResponse> scanWlsDomain(
            ScanWlsDomainRequest request,
            com.oracle.bmc.responses.AsyncHandler<ScanWlsDomainRequest, ScanWlsDomainResponse>
                    handler);

    /**
     * Sets restart order of servers in specific WebLogic domain.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<SetRestartOrderResponse> setRestartOrder(
            SetRestartOrderRequest request,
            com.oracle.bmc.responses.AsyncHandler<SetRestartOrderRequest, SetRestartOrderResponse>
                    handler);

    /**
     * Starts all the servers in the WebLogic domain. Servers that are already started are ignored.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<StartWlsDomainResponse> startWlsDomain(
            StartWlsDomainRequest request,
            com.oracle.bmc.responses.AsyncHandler<StartWlsDomainRequest, StartWlsDomainResponse>
                    handler);

    /**
     * Stops all the servers in the WebLogic domain. Servers that are already stopped are ignored.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<StopWlsDomainResponse> stopWlsDomain(
            StopWlsDomainRequest request,
            com.oracle.bmc.responses.AsyncHandler<StopWlsDomainRequest, StopWlsDomainResponse>
                    handler);

    /**
     * Gets the data to be shown in the Overview page of the service in a given compartment.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<SummarizeResourceInventoryResponse> summarizeResourceInventory(
            SummarizeResourceInventoryRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            SummarizeResourceInventoryRequest, SummarizeResourceInventoryResponse>
                    handler);

    /**
     * Updates the specified managed instance information, such as discovery interval and domain
     * search path.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<UpdateManagedInstanceResponse> updateManagedInstance(
            UpdateManagedInstanceRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            UpdateManagedInstanceRequest, UpdateManagedInstanceResponse>
                    handler);

    /**
     * Updates a specific WebLogic domain.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<UpdateWlsDomainResponse> updateWlsDomain(
            UpdateWlsDomainRequest request,
            com.oracle.bmc.responses.AsyncHandler<UpdateWlsDomainRequest, UpdateWlsDomainResponse>
                    handler);

    /**
     * Updates WebLogic domain credentials of specific WebLogic domain.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<UpdateWlsDomainCredentialResponse> updateWlsDomainCredential(
            UpdateWlsDomainCredentialRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            UpdateWlsDomainCredentialRequest, UpdateWlsDomainCredentialResponse>
                    handler);
}

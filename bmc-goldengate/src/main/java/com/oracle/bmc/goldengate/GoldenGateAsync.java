/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.goldengate;

import com.oracle.bmc.goldengate.requests.*;
import com.oracle.bmc.goldengate.responses.*;

/**
 * Use the Oracle Cloud Infrastructure GoldenGate APIs to perform data replication operations.
 *
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200407")
public interface GoldenGateAsync extends AutoCloseable {

    /**
     * Rebuilds the client from scratch.
     * Useful to refresh certificates.
     */
    void refreshClient();

    /**
     * Sets the endpoint to call (ex, https://www.example.com).
     * @param endpoint The endpoint of the serice.
     */
    void setEndpoint(String endpoint);

    /**
     * Gets the set endpoint for REST call (ex, https://www.example.com)
     */
    String getEndpoint();

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
     * Cancels a Deployment Backup creation process.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<CancelDeploymentBackupResponse> cancelDeploymentBackup(
            CancelDeploymentBackupRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            CancelDeploymentBackupRequest, CancelDeploymentBackupResponse>
                    handler);

    /**
     * Cancel snooze of a DeploymentUpgrade. When provided, If-Match is checked against ETag values of the resource.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<CancelSnoozeDeploymentUpgradeResponse>
            cancelSnoozeDeploymentUpgrade(
                    CancelSnoozeDeploymentUpgradeRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    CancelSnoozeDeploymentUpgradeRequest,
                                    CancelSnoozeDeploymentUpgradeResponse>
                            handler);

    /**
     * Moves the Connection into a different compartment within the same tenancy. When
     * provided, If-Match is checked against ETag values of the resource.  For information about
     * moving resources between compartments, see [Moving Resources Between
     * Compartments](https://docs.cloud.oracle.com/iaas/Content/Identity/Tasks/managingcompartments.htm#moveRes).
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<ChangeConnectionCompartmentResponse> changeConnectionCompartment(
            ChangeConnectionCompartmentRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            ChangeConnectionCompartmentRequest, ChangeConnectionCompartmentResponse>
                    handler);

    /**
     * Note: Deprecated. Use the /connections API instead.
     * Moves the DatabaseRegistration into a different compartment within the same tenancy. When
     * provided, If-Match is checked against ETag values of the resource.  For information about
     * moving resources between compartments, see [Moving Resources Between
     * Compartments](https://docs.cloud.oracle.com/iaas/Content/Identity/Tasks/managingcompartments.htm#moveRes).
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<ChangeDatabaseRegistrationCompartmentResponse>
            changeDatabaseRegistrationCompartment(
                    ChangeDatabaseRegistrationCompartmentRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    ChangeDatabaseRegistrationCompartmentRequest,
                                    ChangeDatabaseRegistrationCompartmentResponse>
                            handler);

    /**
     * Moves a DeploymentBackup into a different compartment within the same tenancy.  When provided,
     * If-Match is checked against ETag values of the resource.  For information about moving
     * resources between compartments, see [Moving Resources Between
     * Compartments](https://docs.cloud.oracle.com/iaas/Content/Identity/Tasks/managingcompartments.htm#moveRes).
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<ChangeDeploymentBackupCompartmentResponse>
            changeDeploymentBackupCompartment(
                    ChangeDeploymentBackupCompartmentRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    ChangeDeploymentBackupCompartmentRequest,
                                    ChangeDeploymentBackupCompartmentResponse>
                            handler);

    /**
     * Moves the Deployment into a different compartment within the same tenancy.  When provided,
     * If-Match is checked against ETag values of the resource.  For information about moving
     * resources between compartments, see [Moving Resources Between
     * Compartments](https://docs.cloud.oracle.com/iaas/Content/Identity/Tasks/managingcompartments.htm#moveRes).
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<ChangeDeploymentCompartmentResponse> changeDeploymentCompartment(
            ChangeDeploymentCompartmentRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            ChangeDeploymentCompartmentRequest, ChangeDeploymentCompartmentResponse>
                    handler);

    /**
     * Collects the diagnostic of a Deployment. When provided, If-Match is checked against ETag values of the resource.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<CollectDeploymentDiagnosticResponse> collectDeploymentDiagnostic(
            CollectDeploymentDiagnosticRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            CollectDeploymentDiagnosticRequest, CollectDeploymentDiagnosticResponse>
                    handler);

    /**
     * Creates a new Connection.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<CreateConnectionResponse> createConnection(
            CreateConnectionRequest request,
            com.oracle.bmc.responses.AsyncHandler<CreateConnectionRequest, CreateConnectionResponse>
                    handler);

    /**
     * Creates a new Connection Assignment.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<CreateConnectionAssignmentResponse> createConnectionAssignment(
            CreateConnectionAssignmentRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            CreateConnectionAssignmentRequest, CreateConnectionAssignmentResponse>
                    handler);

    /**
     * Note: Deprecated. Use the /connections API instead.
     * Creates a new DatabaseRegistration.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<CreateDatabaseRegistrationResponse> createDatabaseRegistration(
            CreateDatabaseRegistrationRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            CreateDatabaseRegistrationRequest, CreateDatabaseRegistrationResponse>
                    handler);

    /**
     * Creates a new Deployment.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<CreateDeploymentResponse> createDeployment(
            CreateDeploymentRequest request,
            com.oracle.bmc.responses.AsyncHandler<CreateDeploymentRequest, CreateDeploymentResponse>
                    handler);

    /**
     * Creates a new DeploymentBackup.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<CreateDeploymentBackupResponse> createDeploymentBackup(
            CreateDeploymentBackupRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            CreateDeploymentBackupRequest, CreateDeploymentBackupResponse>
                    handler);

    /**
     * Deletes a Connection.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<DeleteConnectionResponse> deleteConnection(
            DeleteConnectionRequest request,
            com.oracle.bmc.responses.AsyncHandler<DeleteConnectionRequest, DeleteConnectionResponse>
                    handler);

    /**
     * Deletes a Connection Assignment.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<DeleteConnectionAssignmentResponse> deleteConnectionAssignment(
            DeleteConnectionAssignmentRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            DeleteConnectionAssignmentRequest, DeleteConnectionAssignmentResponse>
                    handler);

    /**
     * Note: Deprecated. Use the /connections API instead.
     * Deletes a DatabaseRegistration.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<DeleteDatabaseRegistrationResponse> deleteDatabaseRegistration(
            DeleteDatabaseRegistrationRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            DeleteDatabaseRegistrationRequest, DeleteDatabaseRegistrationResponse>
                    handler);

    /**
     * Deletes the Deployment.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<DeleteDeploymentResponse> deleteDeployment(
            DeleteDeploymentRequest request,
            com.oracle.bmc.responses.AsyncHandler<DeleteDeploymentRequest, DeleteDeploymentResponse>
                    handler);

    /**
     * Deletes a DeploymentBackup.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<DeleteDeploymentBackupResponse> deleteDeploymentBackup(
            DeleteDeploymentBackupRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            DeleteDeploymentBackupRequest, DeleteDeploymentBackupResponse>
                    handler);

    /**
     * Checks if a wallet is already present in the deployment. When provided, If-Match is checked against ETag values of the resource.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<DeploymentWalletExistsResponse> deploymentWalletExists(
            DeploymentWalletExistsRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            DeploymentWalletExistsRequest, DeploymentWalletExistsResponse>
                    handler);

    /**
     * Export the OGG wallet from the deployment to OCI vault. When provided, If-Match is checked against ETag values of the resource.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<ExportDeploymentWalletResponse> exportDeploymentWallet(
            ExportDeploymentWalletRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            ExportDeploymentWalletRequest, ExportDeploymentWalletResponse>
                    handler);

    /**
     * Retrieves a Connection.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<GetConnectionResponse> getConnection(
            GetConnectionRequest request,
            com.oracle.bmc.responses.AsyncHandler<GetConnectionRequest, GetConnectionResponse>
                    handler);

    /**
     * Retrieves a Connection Assignment.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<GetConnectionAssignmentResponse> getConnectionAssignment(
            GetConnectionAssignmentRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            GetConnectionAssignmentRequest, GetConnectionAssignmentResponse>
                    handler);

    /**
     * Note: Deprecated. Use the /connections API instead.
     * Retrieves a DatabaseRegistration.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<GetDatabaseRegistrationResponse> getDatabaseRegistration(
            GetDatabaseRegistrationRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            GetDatabaseRegistrationRequest, GetDatabaseRegistrationResponse>
                    handler);

    /**
     * Retrieves a deployment.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<GetDeploymentResponse> getDeployment(
            GetDeploymentRequest request,
            com.oracle.bmc.responses.AsyncHandler<GetDeploymentRequest, GetDeploymentResponse>
                    handler);

    /**
     * Retrieves a DeploymentBackup.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<GetDeploymentBackupResponse> getDeploymentBackup(
            GetDeploymentBackupRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            GetDeploymentBackupRequest, GetDeploymentBackupResponse>
                    handler);

    /**
     * Retrieves a deployment upgrade.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<GetDeploymentUpgradeResponse> getDeploymentUpgrade(
            GetDeploymentUpgradeRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            GetDeploymentUpgradeRequest, GetDeploymentUpgradeResponse>
                    handler);

    /**
     * Retrieve the WorkRequest identified by the given OCID.
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
     * Imports an OGG wallet from the OCI Vault to the Deployment. When provided, If-Match is checked against ETag values of the resource.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<ImportDeploymentWalletResponse> importDeploymentWallet(
            ImportDeploymentWalletRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            ImportDeploymentWalletRequest, ImportDeploymentWalletResponse>
                    handler);

    /**
     * Lists the Connection Assignments in the compartment.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<ListConnectionAssignmentsResponse> listConnectionAssignments(
            ListConnectionAssignmentsRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            ListConnectionAssignmentsRequest, ListConnectionAssignmentsResponse>
                    handler);

    /**
     * Lists the Connections in the compartment.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<ListConnectionsResponse> listConnections(
            ListConnectionsRequest request,
            com.oracle.bmc.responses.AsyncHandler<ListConnectionsRequest, ListConnectionsResponse>
                    handler);

    /**
     * Note: Deprecated. Use the /connections API instead.
     * Lists the DatabaseRegistrations in the compartment.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<ListDatabaseRegistrationsResponse> listDatabaseRegistrations(
            ListDatabaseRegistrationsRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            ListDatabaseRegistrationsRequest, ListDatabaseRegistrationsResponse>
                    handler);

    /**
     * Lists the Backups in a compartment.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<ListDeploymentBackupsResponse> listDeploymentBackups(
            ListDeploymentBackupsRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            ListDeploymentBackupsRequest, ListDeploymentBackupsResponse>
                    handler);

    /**
     * Returns an array of DeploymentTypeDescriptor
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<ListDeploymentTypesResponse> listDeploymentTypes(
            ListDeploymentTypesRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            ListDeploymentTypesRequest, ListDeploymentTypesResponse>
                    handler);

    /**
     * Lists the Deployment Upgrades in a compartment.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<ListDeploymentUpgradesResponse> listDeploymentUpgrades(
            ListDeploymentUpgradesRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            ListDeploymentUpgradesRequest, ListDeploymentUpgradesResponse>
                    handler);

    /**
     * Returns the list of available deployment versions.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<ListDeploymentVersionsResponse> listDeploymentVersions(
            ListDeploymentVersionsRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            ListDeploymentVersionsRequest, ListDeploymentVersionsResponse>
                    handler);

    /**
     * Lists the wallets export/import operations to/from a deployment.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<ListDeploymentWalletsOperationsResponse>
            listDeploymentWalletsOperations(
                    ListDeploymentWalletsOperationsRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    ListDeploymentWalletsOperationsRequest,
                                    ListDeploymentWalletsOperationsResponse>
                            handler);

    /**
     * Lists the Deployments in a compartment.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<ListDeploymentsResponse> listDeployments(
            ListDeploymentsRequest request,
            com.oracle.bmc.responses.AsyncHandler<ListDeploymentsRequest, ListDeploymentsResponse>
                    handler);

    /**
     * Lists the DeploymentMessages for a deployment. The sorting order is not important. By default first will be Upgrade message, next Exception message and then Storage Utilization message.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<ListMessagesResponse> listMessages(
            ListMessagesRequest request,
            com.oracle.bmc.responses.AsyncHandler<ListMessagesRequest, ListMessagesResponse>
                    handler);

    /**
     * Lists the TrailFiles for a deployment.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<ListTrailFilesResponse> listTrailFiles(
            ListTrailFilesRequest request,
            com.oracle.bmc.responses.AsyncHandler<ListTrailFilesRequest, ListTrailFilesResponse>
                    handler);

    /**
     * Lists the Trail Sequences for a TrailFile in a given deployment.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<ListTrailSequencesResponse> listTrailSequences(
            ListTrailSequencesRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            ListTrailSequencesRequest, ListTrailSequencesResponse>
                    handler);

    /**
     * Lists work request errors.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<ListWorkRequestErrorsResponse> listWorkRequestErrors(
            ListWorkRequestErrorsRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            ListWorkRequestErrorsRequest, ListWorkRequestErrorsResponse>
                    handler);

    /**
     * Lists work request logs.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<ListWorkRequestLogsResponse> listWorkRequestLogs(
            ListWorkRequestLogsRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            ListWorkRequestLogsRequest, ListWorkRequestLogsResponse>
                    handler);

    /**
     * Lists the work requests in the compartment.
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
     * Restores a Deployment from a Deployment Backup created from the same Deployment.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<RestoreDeploymentResponse> restoreDeployment(
            RestoreDeploymentRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            RestoreDeploymentRequest, RestoreDeploymentResponse>
                    handler);

    /**
     * Rollback a deployment to it's previous version. When provided, If-Match is checked against ETag values of the resource.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<RollbackDeploymentUpgradeResponse> rollbackDeploymentUpgrade(
            RollbackDeploymentUpgradeRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            RollbackDeploymentUpgradeRequest, RollbackDeploymentUpgradeResponse>
                    handler);

    /**
     * Snooze a DeploymentUpgrade. When provided, If-Match is checked against ETag values of the resource.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<SnoozeDeploymentUpgradeResponse> snoozeDeploymentUpgrade(
            SnoozeDeploymentUpgradeRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            SnoozeDeploymentUpgradeRequest, SnoozeDeploymentUpgradeResponse>
                    handler);

    /**
     * Starts a Deployment. When provided, If-Match is checked against ETag values of the resource.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<StartDeploymentResponse> startDeployment(
            StartDeploymentRequest request,
            com.oracle.bmc.responses.AsyncHandler<StartDeploymentRequest, StartDeploymentResponse>
                    handler);

    /**
     * Stops a Deployment. When provided, If-Match is checked against ETag values of the resource.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<StopDeploymentResponse> stopDeployment(
            StopDeploymentRequest request,
            com.oracle.bmc.responses.AsyncHandler<StopDeploymentRequest, StopDeploymentResponse>
                    handler);

    /**
     * Updates the Connection.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<UpdateConnectionResponse> updateConnection(
            UpdateConnectionRequest request,
            com.oracle.bmc.responses.AsyncHandler<UpdateConnectionRequest, UpdateConnectionResponse>
                    handler);

    /**
     * Note: Deprecated. Use the /connections API instead.
     * Updates the DatabaseRegistration.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<UpdateDatabaseRegistrationResponse> updateDatabaseRegistration(
            UpdateDatabaseRegistrationRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            UpdateDatabaseRegistrationRequest, UpdateDatabaseRegistrationResponse>
                    handler);

    /**
     * Modifies a Deployment.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<UpdateDeploymentResponse> updateDeployment(
            UpdateDeploymentRequest request,
            com.oracle.bmc.responses.AsyncHandler<UpdateDeploymentRequest, UpdateDeploymentResponse>
                    handler);

    /**
     * Modifies a Deployment Backup.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<UpdateDeploymentBackupResponse> updateDeploymentBackup(
            UpdateDeploymentBackupRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            UpdateDeploymentBackupRequest, UpdateDeploymentBackupResponse>
                    handler);

    /**
     * Upgrade a Deployment. When provided, If-Match is checked against ETag values of the resource.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<UpgradeDeploymentResponse> upgradeDeployment(
            UpgradeDeploymentRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            UpgradeDeploymentRequest, UpgradeDeploymentResponse>
                    handler);

    /**
     * Upgrade a deployment. When provided, If-Match is checked against ETag values of the resource.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<UpgradeDeploymentUpgradeResponse> upgradeDeploymentUpgrade(
            UpgradeDeploymentUpgradeRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            UpgradeDeploymentUpgradeRequest, UpgradeDeploymentUpgradeResponse>
                    handler);
}

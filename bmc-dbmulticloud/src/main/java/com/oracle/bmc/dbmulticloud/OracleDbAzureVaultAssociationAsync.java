/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.dbmulticloud;

import com.oracle.bmc.dbmulticloud.requests.*;
import com.oracle.bmc.dbmulticloud.responses.*;

/**
 * <b>Microsoft Azure:</b> <br>
 * <b>Oracle Azure Connector Resource:</b>:&nbsp;&nbsp;The Oracle Azure Connector Resource is used
 * to install the Azure Arc Server on an Exadata VM cluster in Oracle Exadata Database Service on
 * Dedicated Infrastructure (ExaDB-D). The supported method to install the Azure Arc Server (Azure
 * Identity) on the Exadata VM cluster:
 *
 * <ul>
 *   <li>Using a Bearer Access Token
 * </ul>
 *
 * <b>Oracle Azure Blob Container Resource:</b>&nbsp;&nbsp;The Oracle Azure Blob Container Resource
 * is used to capture the details of an Azure Blob Container. This resource can then be reused
 * across multiple Exadata VM clusters in Oracle Exadata Database Service on Dedicated
 * Infrastructure (ExaDB-D) to mount the Azure container.
 *
 * <p><b>Oracle Azure Blob Mount Resource:</b>&nbsp;&nbsp;The Oracle Azure Blob Mount Resource is
 * used to mount an Azure Blob Container on an Exadata VM cluster in Oracle Exadata Database Service
 * on Dedicated Infrastructure (ExaDB-D). It relies on both the Oracle Azure Connector and the
 * Oracle Azure Blob Container Resource to perform the mount operation.
 *
 * <p><b>Discover Azure Vaults and Keys Resource:</b>&nbsp;&nbsp;The Discover Oracle Azure Vaults
 * and Azure Keys Resource is used to discover Azure Vaults and the associated encryption keys
 * available in your Azure project.
 *
 * <p><b>Oracle Azure Vault:</b>&nbsp;&nbsp;The Oracle Azure Vault Resource is used to manage Azure
 * Vaults within Oracle Cloud Infrastructure (OCI) for use with services such as Oracle Exadata
 * Database Service on Dedicated Infrastructure.
 *
 * <p><b>Oracle Azure Key:</b>&nbsp;&nbsp;Oracle Azure Key Resource is used to register and manage a
 * Oracle Azure Key Key within Oracle Cloud Infrastructure (OCI) under an associated Azure Vault.
 * <br>
 * <b>Google Cloud:</b><br>
 * <b>Oracle Google Cloud Connector Resource:</b>&nbsp;&nbsp;The Oracle Google Cloud Connector
 * Resource is used to install the Google Cloud Identity Connector on an Exadata VM cluster in
 * Oracle Exadata Database Service on Dedicated Infrastructure (ExaDB-D).
 *
 * <p><b>Discover Google Key Rings and Keys Resource:</b>&nbsp;&nbsp;The Discover Google Key Rings
 * and Keys Resource is used to discover Google Cloud Key Rings and the associated encryption keys
 * available in your Google Cloud project.
 *
 * <p><b>Google Key Rings Resource:</b>&nbsp;&nbsp;The Google Key Rings Resource is used to register
 * and manage Google Cloud Key Rings within Oracle Cloud Infrastructure (OCI) for use with services
 * such as Oracle Exadata Database Service on Dedicated Infrastructure.
 *
 * <p><b>Google Key Resource:</b>&nbsp;&nbsp;The Google Key Resource is used to register and manage
 * a Google Cloud Key within Oracle Cloud Infrastructure (OCI) under an associated Google Key Ring.
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20240501")
public interface OracleDbAzureVaultAssociationAsync extends AutoCloseable {

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
     * Deletes the Oracle DB Azure Vault Association resource.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<CascadingDeleteOracleDbAzureVaultAssociationResponse>
            cascadingDeleteOracleDbAzureVaultAssociation(
                    CascadingDeleteOracleDbAzureVaultAssociationRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    CascadingDeleteOracleDbAzureVaultAssociationRequest,
                                    CascadingDeleteOracleDbAzureVaultAssociationResponse>
                            handler);

    /**
     * Moves the Oracle DB Azure Vault Association resource into a different compartment. When
     * provided, 'If-Match' is checked against 'ETag' values of the resource.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ChangeOracleDbAzureVaultAssociationCompartmentResponse>
            changeOracleDbAzureVaultAssociationCompartment(
                    ChangeOracleDbAzureVaultAssociationCompartmentRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    ChangeOracleDbAzureVaultAssociationCompartmentRequest,
                                    ChangeOracleDbAzureVaultAssociationCompartmentResponse>
                            handler);

    /**
     * Creates Oracle DB Azure Vault Association resource.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<CreateOracleDbAzureVaultAssociationResponse>
            createOracleDbAzureVaultAssociation(
                    CreateOracleDbAzureVaultAssociationRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    CreateOracleDbAzureVaultAssociationRequest,
                                    CreateOracleDbAzureVaultAssociationResponse>
                            handler);

    /**
     * Deletes the Oracle DB Azure Vault Association resource.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<DeleteOracleDbAzureVaultAssociationResponse>
            deleteOracleDbAzureVaultAssociation(
                    DeleteOracleDbAzureVaultAssociationRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    DeleteOracleDbAzureVaultAssociationRequest,
                                    DeleteOracleDbAzureVaultAssociationResponse>
                            handler);

    /**
     * Retrieves the details of an Oracle DB Azure Vault Association using the specified association
     * resource [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm).
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<GetOracleDbAzureVaultAssociationResponse>
            getOracleDbAzureVaultAssociation(
                    GetOracleDbAzureVaultAssociationRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    GetOracleDbAzureVaultAssociationRequest,
                                    GetOracleDbAzureVaultAssociationResponse>
                            handler);

    /**
     * Lists all Oracle DB Azure Associations based on the specified filters.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ListOracleDbAzureVaultAssociationsResponse>
            listOracleDbAzureVaultAssociations(
                    ListOracleDbAzureVaultAssociationsRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    ListOracleDbAzureVaultAssociationsRequest,
                                    ListOracleDbAzureVaultAssociationsResponse>
                            handler);

    /**
     * Modifies the properties of an Oracle DB Azure Vault Association resource identified by the
     * specified resource
     * [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm).
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<UpdateOracleDbAzureVaultAssociationResponse>
            updateOracleDbAzureVaultAssociation(
                    UpdateOracleDbAzureVaultAssociationRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    UpdateOracleDbAzureVaultAssociationRequest,
                                    UpdateOracleDbAzureVaultAssociationResponse>
                            handler);
}

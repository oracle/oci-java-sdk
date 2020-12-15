/**
 * Copyright (c) 2016, 2020, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.dts;

import com.oracle.bmc.dts.requests.*;
import com.oracle.bmc.dts.responses.*;

/**
 * Data Transfer Service API Specification
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 1.0.015")
public interface TransferAppliance extends AutoCloseable {

    /**
     * Sets the endpoint to call (ex, https://www.example.com).
     * @param endpoint The endpoint of the service.
     */
    void setEndpoint(String endpoint);

    /**
     * Gets the set endpoint for REST call (ex, https://www.example.com)
     */
    String getEndpoint();

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
     * Create a new Transfer Appliance
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/dts/CreateTransferApplianceExample.java.html">here</a> to see how to use CreateTransferAppliance API.
     */
    CreateTransferApplianceResponse createTransferAppliance(CreateTransferApplianceRequest request);

    /**
     * Creates an X.509 certificate from a public key
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/dts/CreateTransferApplianceAdminCredentialsExample.java.html">here</a> to see how to use CreateTransferApplianceAdminCredentials API.
     */
    CreateTransferApplianceAdminCredentialsResponse createTransferApplianceAdminCredentials(
            CreateTransferApplianceAdminCredentialsRequest request);

    /**
     * deletes a transfer Appliance
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/dts/DeleteTransferApplianceExample.java.html">here</a> to see how to use DeleteTransferAppliance API.
     */
    DeleteTransferApplianceResponse deleteTransferAppliance(DeleteTransferApplianceRequest request);

    /**
     * Describes a transfer appliance in detail
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/dts/GetTransferApplianceExample.java.html">here</a> to see how to use GetTransferAppliance API.
     */
    GetTransferApplianceResponse getTransferAppliance(GetTransferApplianceRequest request);

    /**
     * Gets the x.509 certificate for the Transfer Appliance's dedicated Certificate Authority (CA)
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/dts/GetTransferApplianceCertificateAuthorityCertificateExample.java.html">here</a> to see how to use GetTransferApplianceCertificateAuthorityCertificate API.
     */
    GetTransferApplianceCertificateAuthorityCertificateResponse
            getTransferApplianceCertificateAuthorityCertificate(
                    GetTransferApplianceCertificateAuthorityCertificateRequest request);

    /**
     * Describes a transfer appliance encryptionPassphrase in detail
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/dts/GetTransferApplianceEncryptionPassphraseExample.java.html">here</a> to see how to use GetTransferApplianceEncryptionPassphrase API.
     */
    GetTransferApplianceEncryptionPassphraseResponse getTransferApplianceEncryptionPassphrase(
            GetTransferApplianceEncryptionPassphraseRequest request);

    /**
     * Lists Transfer Appliances associated with a transferJob
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/dts/ListTransferAppliancesExample.java.html">here</a> to see how to use ListTransferAppliances API.
     */
    ListTransferAppliancesResponse listTransferAppliances(ListTransferAppliancesRequest request);

    /**
     * Updates a Transfer Appliance
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/dts/UpdateTransferApplianceExample.java.html">here</a> to see how to use UpdateTransferAppliance API.
     */
    UpdateTransferApplianceResponse updateTransferAppliance(UpdateTransferApplianceRequest request);

    /**
     * Gets the pre-configured waiters available for resources for this service.
     *
     * @return The service waiters.
     */
    TransferApplianceWaiters getWaiters();
}

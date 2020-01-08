/**
 * Copyright (c) 2016, 2020, Oracle and/or its affiliates. All rights reserved.
 */
package com.oracle.bmc.dts;

import com.oracle.bmc.dts.requests.*;
import com.oracle.bmc.dts.responses.*;

@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 1.0.011")
public interface TransferJob extends AutoCloseable {

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
     * Moves a TransferJob into a different compartment.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    ChangeTransferJobCompartmentResponse changeTransferJobCompartment(
            ChangeTransferJobCompartmentRequest request);

    /**
     * Create a new Transfer Job that corresponds with customer's logical dataset e.g. a DB or a filesystem.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    CreateTransferJobResponse createTransferJob(CreateTransferJobRequest request);

    /**
     * deletes a transfer job
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    DeleteTransferJobResponse deleteTransferJob(DeleteTransferJobRequest request);

    /**
     * Describes a transfer job in detail
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    GetTransferJobResponse getTransferJob(GetTransferJobRequest request);

    /**
     * Lists Transfer Jobs in a given compartment
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    ListTransferJobsResponse listTransferJobs(ListTransferJobsRequest request);

    /**
     * Updates a Transfer Job that corresponds with customer's logical dataset e.g. a DB or a filesystem.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    UpdateTransferJobResponse updateTransferJob(UpdateTransferJobRequest request);

    /**
     * Gets the pre-configured waiters available for resources for this service.
     *
     * @return The service waiters.
     */
    TransferJobWaiters getWaiters();
}

/**
 * Copyright (c) 2016, 2020, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.bds;

import com.oracle.bmc.bds.requests.*;
import com.oracle.bmc.bds.responses.*;

/**
 * API for the Big Data Service. Use this API to build, deploy, and manage fully elastic Big Data Service
 * build on Hadoop, Spark and Data Science distribution, which can be fully integrated with existing enterprise
 * data in Oracle Database and Oracle Applications..
 *
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20190531")
public interface Bds extends AutoCloseable {

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
     * Adds storage to existing worker nodes. The same amount of storage will be added to all workers.
     * No change will be made to already attached storage. Block Storage once added cannot be removed.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/bds/AddBlockStorageExample.java.html">here</a> to see how to use AddBlockStorage API.
     */
    AddBlockStorageResponse addBlockStorage(AddBlockStorageRequest request);

    /**
     * Adds Cloud SQL to your cluster. This will add a query server node to the cluster
     * and create cell servers on all your worker nodes.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/bds/AddCloudSqlExample.java.html">here</a> to see how to use AddCloudSql API.
     */
    AddCloudSqlResponse addCloudSql(AddCloudSqlRequest request);

    /**
     * Add worker nodes to an existing cluster. The worker nodes added will be based on an identical shape
     * and have the same amount of attached block storage as other worker nodes in the cluster.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/bds/AddWorkerNodesExample.java.html">here</a> to see how to use AddWorkerNodes API.
     */
    AddWorkerNodesResponse addWorkerNodes(AddWorkerNodesRequest request);

    /**
     * Moves a BDS instance into a different compartment.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/bds/ChangeBdsInstanceCompartmentExample.java.html">here</a> to see how to use ChangeBdsInstanceCompartment API.
     */
    ChangeBdsInstanceCompartmentResponse changeBdsInstanceCompartment(
            ChangeBdsInstanceCompartmentRequest request);

    /**
     * Scale-up/down individial nodes (per role type) in the cluster. Customer can choose
     * arbitrarty VM_STANDARD shape to scale-up/down the instance. Only VM_STANDARD nodes
     * can be re-shaped.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/bds/ChangeShapeExample.java.html">here</a> to see how to use ChangeShape API.
     */
    ChangeShapeResponse changeShape(ChangeShapeRequest request);

    /**
     * Creates a new BDS instance.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/bds/CreateBdsInstanceExample.java.html">here</a> to see how to use CreateBdsInstance API.
     */
    CreateBdsInstanceResponse createBdsInstance(CreateBdsInstanceRequest request);

    /**
     * Deletes a BDS instance by identifier
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/bds/DeleteBdsInstanceExample.java.html">here</a> to see how to use DeleteBdsInstance API.
     */
    DeleteBdsInstanceResponse deleteBdsInstance(DeleteBdsInstanceRequest request);

    /**
     * Gets a BDS instance by identifier
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/bds/GetBdsInstanceExample.java.html">here</a> to see how to use GetBdsInstance API.
     */
    GetBdsInstanceResponse getBdsInstance(GetBdsInstanceRequest request);

    /**
     * Gets the status of the work request with the given ID.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/bds/GetWorkRequestExample.java.html">here</a> to see how to use GetWorkRequest API.
     */
    GetWorkRequestResponse getWorkRequest(GetWorkRequestRequest request);

    /**
     * Returns a list of BDS instances.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/bds/ListBdsInstancesExample.java.html">here</a> to see how to use ListBdsInstances API.
     */
    ListBdsInstancesResponse listBdsInstances(ListBdsInstancesRequest request);

    /**
     * Return a (paginated) list of errors for a given work request.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/bds/ListWorkRequestErrorsExample.java.html">here</a> to see how to use ListWorkRequestErrors API.
     */
    ListWorkRequestErrorsResponse listWorkRequestErrors(ListWorkRequestErrorsRequest request);

    /**
     * Return a (paginated) list of logs for a given work request.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/bds/ListWorkRequestLogsExample.java.html">here</a> to see how to use ListWorkRequestLogs API.
     */
    ListWorkRequestLogsResponse listWorkRequestLogs(ListWorkRequestLogsRequest request);

    /**
     * Lists the work requests in a compartment.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/bds/ListWorkRequestsExample.java.html">here</a> to see how to use ListWorkRequests API.
     */
    ListWorkRequestsResponse listWorkRequests(ListWorkRequestsRequest request);

    /**
     * Remove Cloud SQL capability.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/bds/RemoveCloudSqlExample.java.html">here</a> to see how to use RemoveCloudSql API.
     */
    RemoveCloudSqlResponse removeCloudSql(RemoveCloudSqlRequest request);

    /**
     * Restarts a single node of a BDS instance.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/bds/RestartNodeExample.java.html">here</a> to see how to use RestartNode API.
     */
    RestartNodeResponse restartNode(RestartNodeRequest request);

    /**
     * Update the BDS instance identified by the id
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/bds/UpdateBdsInstanceExample.java.html">here</a> to see how to use UpdateBdsInstance API.
     */
    UpdateBdsInstanceResponse updateBdsInstance(UpdateBdsInstanceRequest request);

    /**
     * Gets the pre-configured waiters available for resources for this service.
     *
     * @return The service waiters.
     */
    BdsWaiters getWaiters();

    /**
     * Gets the pre-configured paginators available for list operations in this service which may return multiple
     * pages of data. These paginators provide an {@link java.lang.Iterable} interface so that service responses, or
     * resources/records, can be iterated through without having to manually deal with pagination and page tokens.
     *
     * @return The service paginators.
     */
    BdsPaginators getPaginators();
}

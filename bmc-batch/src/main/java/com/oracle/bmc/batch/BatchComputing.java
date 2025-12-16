/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.batch;

import com.oracle.bmc.batch.requests.*;
import com.oracle.bmc.batch.responses.*;

/**
 * Use the Batch Control Plane API to encapsulate and manage all aspects of computationally
 * intensive jobs. This service client uses CircuitBreakerUtils.DEFAULT_CIRCUIT_BREAKER for all the
 * operations by default if no circuit breaker configuration is defined by the user.
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20251031")
public interface BatchComputing extends AutoCloseable {

    /** Rebuilds the client from scratch. Useful to refresh certificates. */
    void refreshClient();

    /**
     * Sets the endpoint to call (ex, https://www.example.com).
     *
     * @param endpoint The endpoint of the service.
     */
    void setEndpoint(String endpoint);

    /** Gets the set endpoint for REST call (ex, https://www.example.com) */
    String getEndpoint();

    /**
     * Sets the region to call (ex, Region.US_PHOENIX_1).
     *
     * <p>Note, this will call {@link #setEndpoint(String) setEndpoint} after resolving the
     * endpoint. If the service is not available in this Region, however, an
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
     * Cancels a batch job.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/batch/CancelBatchJobExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use CancelBatchJob API.
     */
    CancelBatchJobResponse cancelBatchJob(CancelBatchJobRequest request);

    /**
     * Moves a batch context into a different compartment within the same tenancy. For information
     * about moving resources between compartments, see [Moving Resources to a Different
     * Compartment](https://docs.oracle.com/iaas/Content/Identity/Tasks/managingcompartments.htm#moveRes).
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/batch/ChangeBatchContextCompartmentExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     ChangeBatchContextCompartment API.
     */
    ChangeBatchContextCompartmentResponse changeBatchContextCompartment(
            ChangeBatchContextCompartmentRequest request);

    /**
     * Moves a batch job into a different compartment within the same tenancy. For information about
     * moving resources between compartments, see [Moving Resources to a Different
     * Compartment](https://docs.oracle.com/iaas/Content/Identity/Tasks/managingcompartments.htm#moveRes).
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/batch/ChangeBatchJobCompartmentExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     ChangeBatchJobCompartment API.
     */
    ChangeBatchJobCompartmentResponse changeBatchJobCompartment(
            ChangeBatchJobCompartmentRequest request);

    /**
     * Moves a batch job pool into a different compartment within the same tenancy. For information
     * about moving resources between compartments, see [Moving Resources to a Different
     * Compartment](https://docs.oracle.com/iaas/Content/Identity/Tasks/managingcompartments.htm#moveRes).
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/batch/ChangeBatchJobPoolCompartmentExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     ChangeBatchJobPoolCompartment API.
     */
    ChangeBatchJobPoolCompartmentResponse changeBatchJobPoolCompartment(
            ChangeBatchJobPoolCompartmentRequest request);

    /**
     * Moves a batch task environment into a different compartment within the same tenancy. For
     * information about moving resources between compartments, see [Moving Resources to a Different
     * Compartment](https://docs.oracle.com/iaas/Content/Identity/Tasks/managingcompartments.htm#moveRes).
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/batch/ChangeBatchTaskEnvironmentCompartmentExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     ChangeBatchTaskEnvironmentCompartment API.
     */
    ChangeBatchTaskEnvironmentCompartmentResponse changeBatchTaskEnvironmentCompartment(
            ChangeBatchTaskEnvironmentCompartmentRequest request);

    /**
     * Moves a batch task profile into a different compartment within the same tenancy. For
     * information about moving resources between compartments, see [Moving Resources to a Different
     * Compartment](https://docs.oracle.com/iaas/Content/Identity/Tasks/managingcompartments.htm#moveRes).
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/batch/ChangeBatchTaskProfileCompartmentExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     ChangeBatchTaskProfileCompartment API.
     */
    ChangeBatchTaskProfileCompartmentResponse changeBatchTaskProfileCompartment(
            ChangeBatchTaskProfileCompartmentRequest request);

    /**
     * Creates a batch context.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/batch/CreateBatchContextExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use CreateBatchContext
     *     API.
     */
    CreateBatchContextResponse createBatchContext(CreateBatchContextRequest request);

    /**
     * Creates a batch job.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/batch/CreateBatchJobExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use CreateBatchJob API.
     */
    CreateBatchJobResponse createBatchJob(CreateBatchJobRequest request);

    /**
     * Creates a batch job pool.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/batch/CreateBatchJobPoolExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use CreateBatchJobPool
     *     API.
     */
    CreateBatchJobPoolResponse createBatchJobPool(CreateBatchJobPoolRequest request);

    /**
     * Creates a batch task environment.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/batch/CreateBatchTaskEnvironmentExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     CreateBatchTaskEnvironment API.
     */
    CreateBatchTaskEnvironmentResponse createBatchTaskEnvironment(
            CreateBatchTaskEnvironmentRequest request);

    /**
     * Creates a batch task profile.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/batch/CreateBatchTaskProfileExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     CreateBatchTaskProfile API.
     */
    CreateBatchTaskProfileResponse createBatchTaskProfile(CreateBatchTaskProfileRequest request);

    /**
     * Deletes a batch context. All batch job pools associated with the batch context must be
     * deleted beforehand.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/batch/DeleteBatchContextExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use DeleteBatchContext
     *     API.
     */
    DeleteBatchContextResponse deleteBatchContext(DeleteBatchContextRequest request);

    /**
     * Deletes a batch job pool. All batch jobs associated with the batch job pool must be canceled
     * beforehand.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/batch/DeleteBatchJobPoolExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use DeleteBatchJobPool
     *     API.
     */
    DeleteBatchJobPoolResponse deleteBatchJobPool(DeleteBatchJobPoolRequest request);

    /**
     * Deletes a batch task environment. All batch tasks associated with the batch task environment
     * must be canceled beforehand.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/batch/DeleteBatchTaskEnvironmentExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     DeleteBatchTaskEnvironment API.
     */
    DeleteBatchTaskEnvironmentResponse deleteBatchTaskEnvironment(
            DeleteBatchTaskEnvironmentRequest request);

    /**
     * Deletes a batch task profile. All batch tasks associated with the batch task profile must be
     * canceled beforehand.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/batch/DeleteBatchTaskProfileExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     DeleteBatchTaskProfile API.
     */
    DeleteBatchTaskProfileResponse deleteBatchTaskProfile(DeleteBatchTaskProfileRequest request);

    /**
     * Gets information about a batch context.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/batch/GetBatchContextExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use GetBatchContext
     *     API.
     */
    GetBatchContextResponse getBatchContext(GetBatchContextRequest request);

    /**
     * Gets information about a batch job.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/batch/GetBatchJobExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use GetBatchJob API.
     */
    GetBatchJobResponse getBatchJob(GetBatchJobRequest request);

    /**
     * Gets information about a batch job pool.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/batch/GetBatchJobPoolExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use GetBatchJobPool
     *     API.
     */
    GetBatchJobPoolResponse getBatchJobPool(GetBatchJobPoolRequest request);

    /**
     * Gets a specific batch task associated with a batch job by its name.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/batch/GetBatchTaskExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use GetBatchTask API.
     */
    GetBatchTaskResponse getBatchTask(GetBatchTaskRequest request);

    /**
     * Gets information about a batch task environment.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/batch/GetBatchTaskEnvironmentExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     GetBatchTaskEnvironment API.
     */
    GetBatchTaskEnvironmentResponse getBatchTaskEnvironment(GetBatchTaskEnvironmentRequest request);

    /**
     * Gets information about a batch task profile.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/batch/GetBatchTaskProfileExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use GetBatchTaskProfile
     *     API.
     */
    GetBatchTaskProfileResponse getBatchTaskProfile(GetBatchTaskProfileRequest request);

    /**
     * Gets the details of a work request.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/batch/GetWorkRequestExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use GetWorkRequest API.
     */
    GetWorkRequestResponse getWorkRequest(GetWorkRequestRequest request);

    /**
     * Lists the shapes allowed to be specified during batch context creation. Ordered by the shape
     * name.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/batch/ListBatchContextShapesExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     ListBatchContextShapes API.
     */
    ListBatchContextShapesResponse listBatchContextShapes(ListBatchContextShapesRequest request);

    /**
     * Lists the batch contexts by compartment or context
     * [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm). You can filter
     * and sort them by various properties like lifecycle state, name and also ocid. All properties
     * require an exact match. List operation only provides a summary information, use
     * GetBatchContext to get the full details on a specific context
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/batch/ListBatchContextsExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use ListBatchContexts
     *     API.
     */
    ListBatchContextsResponse listBatchContexts(ListBatchContextsRequest request);

    /**
     * Lists the batch job pools by compartment or job pool
     * [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm). You can filter
     * and sort them by various properties like lifecycle state, display name and also ocid. All
     * properties require an exact match. List operation only provides a summary information, use
     * GetBatchJobPool to get the full details on a specific context
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/batch/ListBatchJobPoolsExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use ListBatchJobPools
     *     API.
     */
    ListBatchJobPoolsResponse listBatchJobPools(ListBatchJobPoolsRequest request);

    /**
     * Lists the batch tasks by batch job
     * [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm). You can filter
     * and sort them by various properties like lifecycle state, name and also ocid. All properties
     * require an exact match. List operation only provides a summary information, use GetBatchTask
     * to get the full details on a specific context List is incomplete until jobs lifecycle is
     * in_progress
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/batch/ListBatchJobTasksExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use ListBatchJobTasks
     *     API.
     */
    ListBatchJobTasksResponse listBatchJobTasks(ListBatchJobTasksRequest request);

    /**
     * Lists the batch jobs by compartment or job
     * [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm). You can filter
     * and sort them by various properties like lifecycle state, display name and also ocid. All
     * properties require an exact match. List operation only provides a summary information, use
     * GetBatchJob to get the full details on a specific context
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/batch/ListBatchJobsExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use ListBatchJobs API.
     */
    ListBatchJobsResponse listBatchJobs(ListBatchJobsRequest request);

    /**
     * Lists the task environments by compartment or environment
     * [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm). You can filter
     * and sort them by various properties like lifecycle state, display name and also ocid. All
     * properties require an exact match. List operation only provides a summary information, use
     * GetBatchTaskEnvironment to get the full details on a specific context
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/batch/ListBatchTaskEnvironmentsExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     ListBatchTaskEnvironments API.
     */
    ListBatchTaskEnvironmentsResponse listBatchTaskEnvironments(
            ListBatchTaskEnvironmentsRequest request);

    /**
     * Lists the task profiles by compartment or profile
     * [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm). You can filter
     * and sort them by various properties like lifecycle state, name and also ocid. All properties
     * require an exact match. List operation only provides a summary information, use
     * GetBatchTaskProfile to get the full details on a specific context
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/batch/ListBatchTaskProfilesExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     ListBatchTaskProfiles API.
     */
    ListBatchTaskProfilesResponse listBatchTaskProfiles(ListBatchTaskProfilesRequest request);

    /**
     * Lists the batch tasks associated with batch jobs.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/batch/ListBatchTasksExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use ListBatchTasks API.
     */
    ListBatchTasksResponse listBatchTasks(ListBatchTasksRequest request);

    /**
     * Lists the errors for a work request.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/batch/ListWorkRequestErrorsExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     ListWorkRequestErrors API.
     */
    ListWorkRequestErrorsResponse listWorkRequestErrors(ListWorkRequestErrorsRequest request);

    /**
     * Lists the logs for a work request.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/batch/ListWorkRequestLogsExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use ListWorkRequestLogs
     *     API.
     */
    ListWorkRequestLogsResponse listWorkRequestLogs(ListWorkRequestLogsRequest request);

    /**
     * Lists the work requests in a compartment.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/batch/ListWorkRequestsExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use ListWorkRequests
     *     API.
     */
    ListWorkRequestsResponse listWorkRequests(ListWorkRequestsRequest request);

    /**
     * Pauses the batch job and all its tasks.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/batch/PauseBatchJobExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use PauseBatchJob API.
     */
    PauseBatchJobResponse pauseBatchJob(PauseBatchJobRequest request);

    /**
     * Activates a batch context to accept new jobs.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/batch/StartBatchContextExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use StartBatchContext
     *     API.
     */
    StartBatchContextResponse startBatchContext(StartBatchContextRequest request);

    /**
     * Activates the batch job pool.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/batch/StartBatchJobPoolExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use StartBatchJobPool
     *     API.
     */
    StartBatchJobPoolResponse startBatchJobPool(StartBatchJobPoolRequest request);

    /**
     * Stops a batch context from accepting new jobs.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/batch/StopBatchContextExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use StopBatchContext
     *     API.
     */
    StopBatchContextResponse stopBatchContext(StopBatchContextRequest request);

    /**
     * Deactivates the batch job pool.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/batch/StopBatchJobPoolExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use StopBatchJobPool
     *     API.
     */
    StopBatchJobPoolResponse stopBatchJobPool(StopBatchJobPoolRequest request);

    /**
     * Resumes the batch job and all its tasks.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/batch/UnpauseBatchJobExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use UnpauseBatchJob
     *     API.
     */
    UnpauseBatchJobResponse unpauseBatchJob(UnpauseBatchJobRequest request);

    /**
     * Updates a batch context.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/batch/UpdateBatchContextExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use UpdateBatchContext
     *     API.
     */
    UpdateBatchContextResponse updateBatchContext(UpdateBatchContextRequest request);

    /**
     * Updates a batch job.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/batch/UpdateBatchJobExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use UpdateBatchJob API.
     */
    UpdateBatchJobResponse updateBatchJob(UpdateBatchJobRequest request);

    /**
     * Updates a batch job pool.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/batch/UpdateBatchJobPoolExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use UpdateBatchJobPool
     *     API.
     */
    UpdateBatchJobPoolResponse updateBatchJobPool(UpdateBatchJobPoolRequest request);

    /**
     * Updates a batch task environment.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/batch/UpdateBatchTaskEnvironmentExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     UpdateBatchTaskEnvironment API.
     */
    UpdateBatchTaskEnvironmentResponse updateBatchTaskEnvironment(
            UpdateBatchTaskEnvironmentRequest request);

    /**
     * Updates a batch task profile.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/batch/UpdateBatchTaskProfileExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     UpdateBatchTaskProfile API.
     */
    UpdateBatchTaskProfileResponse updateBatchTaskProfile(UpdateBatchTaskProfileRequest request);

    /**
     * Gets the pre-configured waiters available for resources for this service.
     *
     * @return The service waiters.
     */
    BatchComputingWaiters getWaiters();

    /**
     * Gets the pre-configured paginators available for list operations in this service which may
     * return multiple pages of data. These paginators provide an {@link java.lang.Iterable}
     * interface so that service responses, or resources/records, can be iterated through without
     * having to manually deal with pagination and page tokens.
     *
     * @return The service paginators.
     */
    BatchComputingPaginators getPaginators();
}

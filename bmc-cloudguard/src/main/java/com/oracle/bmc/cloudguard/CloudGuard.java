/**
 * Copyright (c) 2016, 2021, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.cloudguard;

import com.oracle.bmc.cloudguard.requests.*;
import com.oracle.bmc.cloudguard.responses.*;

/**
 * A description of the Cloud Guard APIs
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200131")
public interface CloudGuard extends AutoCloseable {

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
     * Moves the DetectorRecipe from current compartment to another.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation will not retry by default, users can also use RetryConfiguration.DEFAULT_RETRY_CONFIGURATION provided by the SDK to enable retries for it.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/cloudguard/ChangeDetectorRecipeCompartmentExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use ChangeDetectorRecipeCompartment API.
     */
    ChangeDetectorRecipeCompartmentResponse changeDetectorRecipeCompartment(
            ChangeDetectorRecipeCompartmentRequest request);

    /**
     * Moves the ManagedList from current compartment to another.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation will not retry by default, users can also use RetryConfiguration.DEFAULT_RETRY_CONFIGURATION provided by the SDK to enable retries for it.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/cloudguard/ChangeManagedListCompartmentExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use ChangeManagedListCompartment API.
     */
    ChangeManagedListCompartmentResponse changeManagedListCompartment(
            ChangeManagedListCompartmentRequest request);

    /**
     * Moves the ResponderRecipe from current compartment to another.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation will not retry by default, users can also use RetryConfiguration.DEFAULT_RETRY_CONFIGURATION provided by the SDK to enable retries for it.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/cloudguard/ChangeResponderRecipeCompartmentExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use ChangeResponderRecipeCompartment API.
     */
    ChangeResponderRecipeCompartmentResponse changeResponderRecipeCompartment(
            ChangeResponderRecipeCompartmentRequest request);

    /**
     * Creates a new Data Mask Rule Definition
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation will not retry by default, users can also use RetryConfiguration.DEFAULT_RETRY_CONFIGURATION provided by the SDK to enable retries for it.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/cloudguard/CreateDataMaskRuleExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use CreateDataMaskRule API.
     */
    CreateDataMaskRuleResponse createDataMaskRule(CreateDataMaskRuleRequest request);

    /**
     * Creates a DetectorRecipe
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation will not retry by default, users can also use RetryConfiguration.DEFAULT_RETRY_CONFIGURATION provided by the SDK to enable retries for it.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/cloudguard/CreateDetectorRecipeExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use CreateDetectorRecipe API.
     */
    CreateDetectorRecipeResponse createDetectorRecipe(CreateDetectorRecipeRequest request);

    /**
     * Creates a new ManagedList.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation will not retry by default, users can also use RetryConfiguration.DEFAULT_RETRY_CONFIGURATION provided by the SDK to enable retries for it.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/cloudguard/CreateManagedListExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use CreateManagedList API.
     */
    CreateManagedListResponse createManagedList(CreateManagedListRequest request);

    /**
     * Create a ResponderRecipe.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation will not retry by default, users can also use RetryConfiguration.DEFAULT_RETRY_CONFIGURATION provided by the SDK to enable retries for it.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/cloudguard/CreateResponderRecipeExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use CreateResponderRecipe API.
     */
    CreateResponderRecipeResponse createResponderRecipe(CreateResponderRecipeRequest request);

    /**
     * Creates a new Target
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation will not retry by default, users can also use RetryConfiguration.DEFAULT_RETRY_CONFIGURATION provided by the SDK to enable retries for it.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/cloudguard/CreateTargetExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use CreateTarget API.
     */
    CreateTargetResponse createTarget(CreateTargetRequest request);

    /**
     * Attach a DetectorRecipe with the Target
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation will not retry by default, users can also use RetryConfiguration.DEFAULT_RETRY_CONFIGURATION provided by the SDK to enable retries for it.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/cloudguard/CreateTargetDetectorRecipeExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use CreateTargetDetectorRecipe API.
     */
    CreateTargetDetectorRecipeResponse createTargetDetectorRecipe(
            CreateTargetDetectorRecipeRequest request);

    /**
     * Attach a ResponderRecipe with the Target
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation will not retry by default, users can also use RetryConfiguration.DEFAULT_RETRY_CONFIGURATION provided by the SDK to enable retries for it.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/cloudguard/CreateTargetResponderRecipeExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use CreateTargetResponderRecipe API.
     */
    CreateTargetResponderRecipeResponse createTargetResponderRecipe(
            CreateTargetResponderRecipeRequest request);

    /**
     * Deletes a DataMaskRule identified by dataMaskRuleId
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation will not retry by default, users can also use RetryConfiguration.DEFAULT_RETRY_CONFIGURATION provided by the SDK to enable retries for it.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/cloudguard/DeleteDataMaskRuleExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use DeleteDataMaskRule API.
     */
    DeleteDataMaskRuleResponse deleteDataMaskRule(DeleteDataMaskRuleRequest request);

    /**
     * Deletes a DetectorRecipe identified by detectorRecipeId
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation will not retry by default, users can also use RetryConfiguration.DEFAULT_RETRY_CONFIGURATION provided by the SDK to enable retries for it.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/cloudguard/DeleteDetectorRecipeExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use DeleteDetectorRecipe API.
     */
    DeleteDetectorRecipeResponse deleteDetectorRecipe(DeleteDetectorRecipeRequest request);

    /**
     * Deletes a managed list identified by managedListId
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation will not retry by default, users can also use RetryConfiguration.DEFAULT_RETRY_CONFIGURATION provided by the SDK to enable retries for it.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/cloudguard/DeleteManagedListExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use DeleteManagedList API.
     */
    DeleteManagedListResponse deleteManagedList(DeleteManagedListRequest request);

    /**
     * Delete the ResponderRecipe resource by identifier
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation will not retry by default, users can also use RetryConfiguration.DEFAULT_RETRY_CONFIGURATION provided by the SDK to enable retries for it.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/cloudguard/DeleteResponderRecipeExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use DeleteResponderRecipe API.
     */
    DeleteResponderRecipeResponse deleteResponderRecipe(DeleteResponderRecipeRequest request);

    /**
     * Deletes a Target identified by targetId
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation will not retry by default, users can also use RetryConfiguration.DEFAULT_RETRY_CONFIGURATION provided by the SDK to enable retries for it.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/cloudguard/DeleteTargetExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use DeleteTarget API.
     */
    DeleteTargetResponse deleteTarget(DeleteTargetRequest request);

    /**
     * Delete the TargetDetectorRecipe resource by identifier
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation will not retry by default, users can also use RetryConfiguration.DEFAULT_RETRY_CONFIGURATION provided by the SDK to enable retries for it.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/cloudguard/DeleteTargetDetectorRecipeExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use DeleteTargetDetectorRecipe API.
     */
    DeleteTargetDetectorRecipeResponse deleteTargetDetectorRecipe(
            DeleteTargetDetectorRecipeRequest request);

    /**
     * Delete the TargetResponderRecipe resource by identifier
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation will not retry by default, users can also use RetryConfiguration.DEFAULT_RETRY_CONFIGURATION provided by the SDK to enable retries for it.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/cloudguard/DeleteTargetResponderRecipeExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use DeleteTargetResponderRecipe API.
     */
    DeleteTargetResponderRecipeResponse deleteTargetResponderRecipe(
            DeleteTargetResponderRecipeRequest request);

    /**
     * Executes the responder execution. When provided, If-Match is checked against ETag values of the resource.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation will not retry by default, users can also use RetryConfiguration.DEFAULT_RETRY_CONFIGURATION provided by the SDK to enable retries for it.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/cloudguard/ExecuteResponderExecutionExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use ExecuteResponderExecution API.
     */
    ExecuteResponderExecutionResponse executeResponderExecution(
            ExecuteResponderExecutionRequest request);

    /**
     * Returns ConditionType with its details.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation will not retry by default, users can also use RetryConfiguration.DEFAULT_RETRY_CONFIGURATION provided by the SDK to enable retries for it.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/cloudguard/GetConditionMetadataTypeExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use GetConditionMetadataType API.
     */
    GetConditionMetadataTypeResponse getConditionMetadataType(
            GetConditionMetadataTypeRequest request);

    /**
     * GET Cloud Guard Configuration Details for a Tenancy.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation will not retry by default, users can also use RetryConfiguration.DEFAULT_RETRY_CONFIGURATION provided by the SDK to enable retries for it.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/cloudguard/GetConfigurationExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use GetConfiguration API.
     */
    GetConfigurationResponse getConfiguration(GetConfigurationRequest request);

    /**
     * Returns a DataMaskRule identified by DataMaskRuleId
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation will not retry by default, users can also use RetryConfiguration.DEFAULT_RETRY_CONFIGURATION provided by the SDK to enable retries for it.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/cloudguard/GetDataMaskRuleExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use GetDataMaskRule API.
     */
    GetDataMaskRuleResponse getDataMaskRule(GetDataMaskRuleRequest request);

    /**
     * Returns a Detector identified by detectorId.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation will not retry by default, users can also use RetryConfiguration.DEFAULT_RETRY_CONFIGURATION provided by the SDK to enable retries for it.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/cloudguard/GetDetectorExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use GetDetector API.
     */
    GetDetectorResponse getDetector(GetDetectorRequest request);

    /**
     * Returns a DetectorRecipe identified by detectorRecipeId
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation will not retry by default, users can also use RetryConfiguration.DEFAULT_RETRY_CONFIGURATION provided by the SDK to enable retries for it.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/cloudguard/GetDetectorRecipeExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use GetDetectorRecipe API.
     */
    GetDetectorRecipeResponse getDetectorRecipe(GetDetectorRecipeRequest request);

    /**
     * Get DetectorRule by identifier
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation will not retry by default, users can also use RetryConfiguration.DEFAULT_RETRY_CONFIGURATION provided by the SDK to enable retries for it.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/cloudguard/GetDetectorRecipeDetectorRuleExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use GetDetectorRecipeDetectorRule API.
     */
    GetDetectorRecipeDetectorRuleResponse getDetectorRecipeDetectorRule(
            GetDetectorRecipeDetectorRuleRequest request);

    /**
     * Returns a Detector Rule identified by detectorRuleId
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation will not retry by default, users can also use RetryConfiguration.DEFAULT_RETRY_CONFIGURATION provided by the SDK to enable retries for it.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/cloudguard/GetDetectorRuleExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use GetDetectorRule API.
     */
    GetDetectorRuleResponse getDetectorRule(GetDetectorRuleRequest request);

    /**
     * Returns a managed list identified by managedListId
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation will not retry by default, users can also use RetryConfiguration.DEFAULT_RETRY_CONFIGURATION provided by the SDK to enable retries for it.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/cloudguard/GetManagedListExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use GetManagedList API.
     */
    GetManagedListResponse getManagedList(GetManagedListRequest request);

    /**
     * Returns a Problems response
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation will not retry by default, users can also use RetryConfiguration.DEFAULT_RETRY_CONFIGURATION provided by the SDK to enable retries for it.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/cloudguard/GetProblemExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use GetProblem API.
     */
    GetProblemResponse getProblem(GetProblemRequest request);

    /**
     * Returns a Responder Execution identified by responderExecutionId
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation will not retry by default, users can also use RetryConfiguration.DEFAULT_RETRY_CONFIGURATION provided by the SDK to enable retries for it.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/cloudguard/GetResponderExecutionExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use GetResponderExecution API.
     */
    GetResponderExecutionResponse getResponderExecution(GetResponderExecutionRequest request);

    /**
     * Get a ResponderRecipe by identifier
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation will not retry by default, users can also use RetryConfiguration.DEFAULT_RETRY_CONFIGURATION provided by the SDK to enable retries for it.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/cloudguard/GetResponderRecipeExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use GetResponderRecipe API.
     */
    GetResponderRecipeResponse getResponderRecipe(GetResponderRecipeRequest request);

    /**
     * Get ResponderRule by identifier
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation will not retry by default, users can also use RetryConfiguration.DEFAULT_RETRY_CONFIGURATION provided by the SDK to enable retries for it.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/cloudguard/GetResponderRecipeResponderRuleExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use GetResponderRecipeResponderRule API.
     */
    GetResponderRecipeResponderRuleResponse getResponderRecipeResponderRule(
            GetResponderRecipeResponderRuleRequest request);

    /**
     * Get a ResponderRule by identifier
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation will not retry by default, users can also use RetryConfiguration.DEFAULT_RETRY_CONFIGURATION provided by the SDK to enable retries for it.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/cloudguard/GetResponderRuleExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use GetResponderRule API.
     */
    GetResponderRuleResponse getResponderRule(GetResponderRuleRequest request);

    /**
     * Returns a Target identified by targetId
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation will not retry by default, users can also use RetryConfiguration.DEFAULT_RETRY_CONFIGURATION provided by the SDK to enable retries for it.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/cloudguard/GetTargetExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use GetTarget API.
     */
    GetTargetResponse getTarget(GetTargetRequest request);

    /**
     * Get a TargetDetectorRecipe by identifier
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation will not retry by default, users can also use RetryConfiguration.DEFAULT_RETRY_CONFIGURATION provided by the SDK to enable retries for it.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/cloudguard/GetTargetDetectorRecipeExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use GetTargetDetectorRecipe API.
     */
    GetTargetDetectorRecipeResponse getTargetDetectorRecipe(GetTargetDetectorRecipeRequest request);

    /**
     * Get DetectorRule by identifier
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation will not retry by default, users can also use RetryConfiguration.DEFAULT_RETRY_CONFIGURATION provided by the SDK to enable retries for it.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/cloudguard/GetTargetDetectorRecipeDetectorRuleExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use GetTargetDetectorRecipeDetectorRule API.
     */
    GetTargetDetectorRecipeDetectorRuleResponse getTargetDetectorRecipeDetectorRule(
            GetTargetDetectorRecipeDetectorRuleRequest request);

    /**
     * Get a TargetResponderRecipe by identifier
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation will not retry by default, users can also use RetryConfiguration.DEFAULT_RETRY_CONFIGURATION provided by the SDK to enable retries for it.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/cloudguard/GetTargetResponderRecipeExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use GetTargetResponderRecipe API.
     */
    GetTargetResponderRecipeResponse getTargetResponderRecipe(
            GetTargetResponderRecipeRequest request);

    /**
     * Get ResponderRule by identifier
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation will not retry by default, users can also use RetryConfiguration.DEFAULT_RETRY_CONFIGURATION provided by the SDK to enable retries for it.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/cloudguard/GetTargetResponderRecipeResponderRuleExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use GetTargetResponderRecipeResponderRule API.
     */
    GetTargetResponderRecipeResponderRuleResponse getTargetResponderRecipeResponderRule(
            GetTargetResponderRecipeResponderRuleRequest request);

    /**
     * Returns a list of condition types.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation will not retry by default, users can also use RetryConfiguration.DEFAULT_RETRY_CONFIGURATION provided by the SDK to enable retries for it.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/cloudguard/ListConditionMetadataTypesExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use ListConditionMetadataTypes API.
     */
    ListConditionMetadataTypesResponse listConditionMetadataTypes(
            ListConditionMetadataTypesRequest request);

    /**
     * Returns a list of all Data Mask Rules in the root 'compartmentId' passed.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation will not retry by default, users can also use RetryConfiguration.DEFAULT_RETRY_CONFIGURATION provided by the SDK to enable retries for it.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/cloudguard/ListDataMaskRulesExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use ListDataMaskRules API.
     */
    ListDataMaskRulesResponse listDataMaskRules(ListDataMaskRulesRequest request);

    /**
     * Returns a list of DetectorRule associated with DetectorRecipe.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation will not retry by default, users can also use RetryConfiguration.DEFAULT_RETRY_CONFIGURATION provided by the SDK to enable retries for it.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/cloudguard/ListDetectorRecipeDetectorRulesExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use ListDetectorRecipeDetectorRules API.
     */
    ListDetectorRecipeDetectorRulesResponse listDetectorRecipeDetectorRules(
            ListDetectorRecipeDetectorRulesRequest request);

    /**
     * Returns a list of all Detector Recipes in a compartment
     * <p>
     * The ListDetectorRecipes operation returns only the detector recipes in `compartmentId` passed.
     * The list does not include any subcompartments of the compartmentId passed.
     * <p>
     * The parameter `accessLevel` specifies whether to return only those compartments for which the
     * requestor has INSPECT permissions on at least one resource directly
     * or indirectly (ACCESSIBLE) (the resource can be in a subcompartment) or to return Not Authorized if
     * Principal doesn't have access to even one of the child compartments. This is valid only when
     * `compartmentIdInSubtree` is set to `true`.
     * <p>
     * The parameter `compartmentIdInSubtree` applies when you perform ListDetectorRecipes on the
     * `compartmentId` passed and when it is set to true, the entire hierarchy of compartments can be returned.
     * To get a full list of all compartments and subcompartments in the tenancy (root compartment),
     * set the parameter `compartmentIdInSubtree` to true and `accessLevel` to ACCESSIBLE.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation will not retry by default, users can also use RetryConfiguration.DEFAULT_RETRY_CONFIGURATION provided by the SDK to enable retries for it.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/cloudguard/ListDetectorRecipesExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use ListDetectorRecipes API.
     */
    ListDetectorRecipesResponse listDetectorRecipes(ListDetectorRecipesRequest request);

    /**
     * Returns a list of detector rules for the detectorId passed.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation will not retry by default, users can also use RetryConfiguration.DEFAULT_RETRY_CONFIGURATION provided by the SDK to enable retries for it.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/cloudguard/ListDetectorRulesExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use ListDetectorRules API.
     */
    ListDetectorRulesResponse listDetectorRules(ListDetectorRulesRequest request);

    /**
     * Returns detector catalog - list of detectors supported by Cloud Guard
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation will not retry by default, users can also use RetryConfiguration.DEFAULT_RETRY_CONFIGURATION provided by the SDK to enable retries for it.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/cloudguard/ListDetectorsExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use ListDetectors API.
     */
    ListDetectorsResponse listDetectors(ListDetectorsRequest request);

    /**
     * Returns a list of Impacted Resources for a CloudGuard Problem
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation will not retry by default, users can also use RetryConfiguration.DEFAULT_RETRY_CONFIGURATION provided by the SDK to enable retries for it.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/cloudguard/ListImpactedResourcesExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use ListImpactedResources API.
     */
    ListImpactedResourcesResponse listImpactedResources(ListImpactedResourcesRequest request);

    /**
     * Returns all ManagedList types supported by Cloud Guard
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation will not retry by default, users can also use RetryConfiguration.DEFAULT_RETRY_CONFIGURATION provided by the SDK to enable retries for it.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/cloudguard/ListManagedListTypesExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use ListManagedListTypes API.
     */
    ListManagedListTypesResponse listManagedListTypes(ListManagedListTypesRequest request);

    /**
     * Returns a list of ListManagedLists.
     * The ListManagedLists operation returns only the managed lists in `compartmentId` passed.
     * The list does not include any subcompartments of the compartmentId passed.
     * <p>
     * The parameter `accessLevel` specifies whether to return ManagedLists in only
     * those compartments for which the requestor has INSPECT permissions on at least one resource directly
     * or indirectly (ACCESSIBLE) (the resource can be in a subcompartment) or to return Not Authorized if
     * Principal doesn't have access to even one of the child compartments. This is valid only when
     * `compartmentIdInSubtree` is set to `true`.
     * <p>
     * The parameter `compartmentIdInSubtree` applies when you perform ListManagedLists on the
     * `compartmentId` passed and when it is set to true, the entire hierarchy of compartments can be returned.
     * To get a full list of all compartments and subcompartments in the tenancy (root compartment),
     * set the parameter `compartmentIdInSubtree` to true and `accessLevel` to ACCESSIBLE.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation will not retry by default, users can also use RetryConfiguration.DEFAULT_RETRY_CONFIGURATION provided by the SDK to enable retries for it.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/cloudguard/ListManagedListsExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use ListManagedLists API.
     */
    ListManagedListsResponse listManagedLists(ListManagedListsRequest request);

    /**
     * Returns the list of global policy statements needed by Cloud Guard when enabling
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation will not retry by default, users can also use RetryConfiguration.DEFAULT_RETRY_CONFIGURATION provided by the SDK to enable retries for it.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/cloudguard/ListPoliciesExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use ListPolicies API.
     */
    ListPoliciesResponse listPolicies(ListPoliciesRequest request);

    /**
     * Returns a list of Actions done on CloudGuard Problem
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation will not retry by default, users can also use RetryConfiguration.DEFAULT_RETRY_CONFIGURATION provided by the SDK to enable retries for it.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/cloudguard/ListProblemHistoriesExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use ListProblemHistories API.
     */
    ListProblemHistoriesResponse listProblemHistories(ListProblemHistoriesRequest request);

    /**
     * Returns a list of all Problems identified by the Cloud Guard
     * <p>
     * The ListProblems operation returns only the problems in `compartmentId` passed.
     * The list does not include any subcompartments of the compartmentId passed.
     * <p>
     * The parameter `accessLevel` specifies whether to return only those compartments for which the
     * requestor has INSPECT permissions on at least one resource directly
     * or indirectly (ACCESSIBLE) (the resource can be in a subcompartment) or to return Not Authorized if
     * Principal doesn't have access to even one of the child compartments. This is valid only when
     * `compartmentIdInSubtree` is set to `true`.
     * <p>
     * The parameter `compartmentIdInSubtree` applies when you perform ListProblems on the
     * `compartmentId` passed and when it is set to true, the entire hierarchy of compartments can be returned.
     * To get a full list of all compartments and subcompartments in the tenancy (root compartment),
     * set the parameter `compartmentIdInSubtree` to true and `accessLevel` to ACCESSIBLE.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation will not retry by default, users can also use RetryConfiguration.DEFAULT_RETRY_CONFIGURATION provided by the SDK to enable retries for it.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/cloudguard/ListProblemsExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use ListProblems API.
     */
    ListProblemsResponse listProblems(ListProblemsRequest request);

    /**
     * Returns a list of all Recommendations.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation will not retry by default, users can also use RetryConfiguration.DEFAULT_RETRY_CONFIGURATION provided by the SDK to enable retries for it.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/cloudguard/ListRecommendationsExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use ListRecommendations API.
     */
    ListRecommendationsResponse listRecommendations(ListRecommendationsRequest request);

    /**
     * Returns a list of resource types.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation will not retry by default, users can also use RetryConfiguration.DEFAULT_RETRY_CONFIGURATION provided by the SDK to enable retries for it.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/cloudguard/ListResourceTypesExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use ListResourceTypes API.
     */
    ListResourceTypesResponse listResourceTypes(ListResourceTypesRequest request);

    /**
     * Returns a list of Responder activities done on CloudGuard Problem
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation will not retry by default, users can also use RetryConfiguration.DEFAULT_RETRY_CONFIGURATION provided by the SDK to enable retries for it.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/cloudguard/ListResponderActivitiesExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use ListResponderActivities API.
     */
    ListResponderActivitiesResponse listResponderActivities(ListResponderActivitiesRequest request);

    /**
     * Returns a list of Responder Executions. A Responder Execution is an entity that tracks the collective execution of multiple Responder Rule Executions for a given Problem.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation will not retry by default, users can also use RetryConfiguration.DEFAULT_RETRY_CONFIGURATION provided by the SDK to enable retries for it.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/cloudguard/ListResponderExecutionsExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use ListResponderExecutions API.
     */
    ListResponderExecutionsResponse listResponderExecutions(ListResponderExecutionsRequest request);

    /**
     * Returns a list of ResponderRule associated with ResponderRecipe.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation will not retry by default, users can also use RetryConfiguration.DEFAULT_RETRY_CONFIGURATION provided by the SDK to enable retries for it.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/cloudguard/ListResponderRecipeResponderRulesExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use ListResponderRecipeResponderRules API.
     */
    ListResponderRecipeResponderRulesResponse listResponderRecipeResponderRules(
            ListResponderRecipeResponderRulesRequest request);

    /**
     * Returns a list of all ResponderRecipes in a compartment
     * The ListResponderRecipe operation returns only the targets in `compartmentId` passed.
     * The list does not include any subcompartments of the compartmentId passed.
     * <p>
     * The parameter `accessLevel` specifies whether to return only those compartments for which the
     * requestor has INSPECT permissions on at least one resource directly
     * or indirectly (ACCESSIBLE) (the resource can be in a subcompartment) or to return Not Authorized if
     * Principal doesn't have access to even one of the child compartments. This is valid only when
     * `compartmentIdInSubtree` is set to `true`.
     * <p>
     * The parameter `compartmentIdInSubtree` applies when you perform ListResponderRecipe on the
     * `compartmentId` passed and when it is set to true, the entire hierarchy of compartments can be returned.
     * To get a full list of all compartments and subcompartments in the tenancy (root compartment),
     * set the parameter `compartmentIdInSubtree` to true and `accessLevel` to ACCESSIBLE.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation will not retry by default, users can also use RetryConfiguration.DEFAULT_RETRY_CONFIGURATION provided by the SDK to enable retries for it.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/cloudguard/ListResponderRecipesExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use ListResponderRecipes API.
     */
    ListResponderRecipesResponse listResponderRecipes(ListResponderRecipesRequest request);

    /**
     * Returns a list of ResponderRule.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation will not retry by default, users can also use RetryConfiguration.DEFAULT_RETRY_CONFIGURATION provided by the SDK to enable retries for it.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/cloudguard/ListResponderRulesExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use ListResponderRules API.
     */
    ListResponderRulesResponse listResponderRules(ListResponderRulesRequest request);

    /**
     * Returns a list of DetectorRule associated with DetectorRecipe within a Target.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation will not retry by default, users can also use RetryConfiguration.DEFAULT_RETRY_CONFIGURATION provided by the SDK to enable retries for it.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/cloudguard/ListTargetDetectorRecipeDetectorRulesExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use ListTargetDetectorRecipeDetectorRules API.
     */
    ListTargetDetectorRecipeDetectorRulesResponse listTargetDetectorRecipeDetectorRules(
            ListTargetDetectorRecipeDetectorRulesRequest request);

    /**
     * Returns a list of all detector recipes associated with the target identified by targetId
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation will not retry by default, users can also use RetryConfiguration.DEFAULT_RETRY_CONFIGURATION provided by the SDK to enable retries for it.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/cloudguard/ListTargetDetectorRecipesExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use ListTargetDetectorRecipes API.
     */
    ListTargetDetectorRecipesResponse listTargetDetectorRecipes(
            ListTargetDetectorRecipesRequest request);

    /**
     * Returns a list of ResponderRule associated with ResponderRecipe within a Target.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation will not retry by default, users can also use RetryConfiguration.DEFAULT_RETRY_CONFIGURATION provided by the SDK to enable retries for it.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/cloudguard/ListTargetResponderRecipeResponderRulesExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use ListTargetResponderRecipeResponderRules API.
     */
    ListTargetResponderRecipeResponderRulesResponse listTargetResponderRecipeResponderRules(
            ListTargetResponderRecipeResponderRulesRequest request);

    /**
     * Returns a list of all responder recipes associated with the target identified by targetId
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation will not retry by default, users can also use RetryConfiguration.DEFAULT_RETRY_CONFIGURATION provided by the SDK to enable retries for it.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/cloudguard/ListTargetResponderRecipesExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use ListTargetResponderRecipes API.
     */
    ListTargetResponderRecipesResponse listTargetResponderRecipes(
            ListTargetResponderRecipesRequest request);

    /**
     * Returns a list of all Targets in a compartment
     * The ListTargets operation returns only the targets in `compartmentId` passed.
     * The list does not include any subcompartments of the compartmentId passed.
     * <p>
     * The parameter `accessLevel` specifies whether to return only those compartments for which the
     * requestor has INSPECT permissions on at least one resource directly
     * or indirectly (ACCESSIBLE) (the resource can be in a subcompartment) or to return Not Authorized if
     * Principal doesn't have access to even one of the child compartments. This is valid only when
     * `compartmentIdInSubtree` is set to `true`.
     * <p>
     * The parameter `compartmentIdInSubtree` applies when you perform ListTargets on the
     * `compartmentId` passed and when it is set to true, the entire hierarchy of compartments can be returned.
     * To get a full list of all compartments and subcompartments in the tenancy (root compartment),
     * set the parameter `compartmentIdInSubtree` to true and `accessLevel` to ACCESSIBLE.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation will not retry by default, users can also use RetryConfiguration.DEFAULT_RETRY_CONFIGURATION provided by the SDK to enable retries for it.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/cloudguard/ListTargetsExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use ListTargets API.
     */
    ListTargetsResponse listTargets(ListTargetsRequest request);

    /**
     * Examines the number of problems related to the resource and the relative severity of those problems.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation will not retry by default, users can also use RetryConfiguration.DEFAULT_RETRY_CONFIGURATION provided by the SDK to enable retries for it.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/cloudguard/RequestRiskScoresExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use RequestRiskScores API.
     */
    RequestRiskScoresResponse requestRiskScores(RequestRiskScoresRequest request);

    /**
     * Measures the number of resources examined across all regions and compares it with the
     * number of problems detected, for a given time period.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation will not retry by default, users can also use RetryConfiguration.DEFAULT_RETRY_CONFIGURATION provided by the SDK to enable retries for it.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/cloudguard/RequestSecurityScoreSummarizedTrendExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use RequestSecurityScoreSummarizedTrend API.
     */
    RequestSecurityScoreSummarizedTrendResponse requestSecurityScoreSummarizedTrend(
            RequestSecurityScoreSummarizedTrendRequest request);

    /**
     * Measures the number of resources examined across all regions and compares it with the number of problems detected.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation will not retry by default, users can also use RetryConfiguration.DEFAULT_RETRY_CONFIGURATION provided by the SDK to enable retries for it.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/cloudguard/RequestSecurityScoresExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use RequestSecurityScores API.
     */
    RequestSecurityScoresResponse requestSecurityScores(RequestSecurityScoresRequest request);

    /**
     * Returns the summary of Activity type problems identified by cloud guard, for a given set of dimensions.
     * <p>
     * The parameter `accessLevel` specifies whether to return only those compartments for which the
     * requestor has INSPECT permissions on at least one resource directly
     * or indirectly (ACCESSIBLE) (the resource can be in a subcompartment) or to return Not Authorized if
     * Principal doesn't have access to even one of the child compartments. This is valid only when
     * `compartmentIdInSubtree` is set to `true`.
     * <p>
     * The parameter `compartmentIdInSubtree` applies when you perform summarize API on the
     * `compartmentId` passed and when it is set to true, the entire hierarchy of compartments can be returned.
     * To get a full list of all compartments and subcompartments in the tenancy (root compartment),
     * set the parameter `compartmentIdInSubtree` to true and `accessLevel` to ACCESSIBLE.
     * <p>
     * The compartmentId to be passed with `accessLevel` and `compartmentIdInSubtree` params has to be the root
     * compartment id (tenant-id) only.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation will not retry by default, users can also use RetryConfiguration.DEFAULT_RETRY_CONFIGURATION provided by the SDK to enable retries for it.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/cloudguard/RequestSummarizedActivityProblemsExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use RequestSummarizedActivityProblems API.
     */
    RequestSummarizedActivityProblemsResponse requestSummarizedActivityProblems(
            RequestSummarizedActivityProblemsRequest request);

    /**
     * Returns the number of problems identified by cloud guard, for a given set of dimensions.
     * <p>
     * The parameter `accessLevel` specifies whether to return only those compartments for which the
     * requestor has INSPECT permissions on at least one resource directly
     * or indirectly (ACCESSIBLE) (the resource can be in a subcompartment) or to return Not Authorized if
     * Principal doesn't have access to even one of the child compartments. This is valid only when
     * `compartmentIdInSubtree` is set to `true`.
     * <p>
     * The parameter `compartmentIdInSubtree` applies when you perform summarize API on the
     * `compartmentId` passed and when it is set to true, the entire hierarchy of compartments can be returned.
     * To get a full list of all compartments and subcompartments in the tenancy (root compartment),
     * set the parameter `compartmentIdInSubtree` to true and `accessLevel` to ACCESSIBLE.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation will not retry by default, users can also use RetryConfiguration.DEFAULT_RETRY_CONFIGURATION provided by the SDK to enable retries for it.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/cloudguard/RequestSummarizedProblemsExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use RequestSummarizedProblems API.
     */
    RequestSummarizedProblemsResponse requestSummarizedProblems(
            RequestSummarizedProblemsRequest request);

    /**
     * Returns the number of Responder Executions, for a given set of dimensions.
     * <p>
     * The parameter `accessLevel` specifies whether to return only those compartments for which the
     * requestor has INSPECT permissions on at least one resource directly
     * or indirectly (ACCESSIBLE) (the resource can be in a subcompartment) or to return Not Authorized if
     * Principal doesn't have access to even one of the child compartments. This is valid only when
     * `compartmentIdInSubtree` is set to `true`.
     * <p>
     * The parameter `compartmentIdInSubtree` applies when you perform summarize API on the
     * `compartmentId` passed and when it is set to true, the entire hierarchy of compartments can be returned.
     * To get a full list of all compartments and subcompartments in the tenancy (root compartment),
     * set the parameter `compartmentIdInSubtree` to true and `accessLevel` to ACCESSIBLE.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation will not retry by default, users can also use RetryConfiguration.DEFAULT_RETRY_CONFIGURATION provided by the SDK to enable retries for it.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/cloudguard/RequestSummarizedResponderExecutionsExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use RequestSummarizedResponderExecutions API.
     */
    RequestSummarizedResponderExecutionsResponse requestSummarizedResponderExecutions(
            RequestSummarizedResponderExecutionsRequest request);

    /**
     * DEPRECATED
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation will not retry by default, users can also use RetryConfiguration.DEFAULT_RETRY_CONFIGURATION provided by the SDK to enable retries for it.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/cloudguard/RequestSummarizedRiskScoresExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use RequestSummarizedRiskScores API.
     */
    RequestSummarizedRiskScoresResponse requestSummarizedRiskScores(
            RequestSummarizedRiskScoresRequest request);

    /**
     * DEPRECATED
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation will not retry by default, users can also use RetryConfiguration.DEFAULT_RETRY_CONFIGURATION provided by the SDK to enable retries for it.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/cloudguard/RequestSummarizedSecurityScoresExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use RequestSummarizedSecurityScores API.
     */
    RequestSummarizedSecurityScoresResponse requestSummarizedSecurityScores(
            RequestSummarizedSecurityScoresRequest request);

    /**
     * Returns the number of problems identified by cloud guard, for a given time period.
     * <p>
     * The parameter `accessLevel` specifies whether to return only those compartments for which the
     * requestor has INSPECT permissions on at least one resource directly
     * or indirectly (ACCESSIBLE) (the resource can be in a subcompartment) or to return Not Authorized if
     * Principal doesn't have access to even one of the child compartments. This is valid only when
     * `compartmentIdInSubtree` is set to `true`.
     * <p>
     * The parameter `compartmentIdInSubtree` applies when you perform summarize API on the
     * `compartmentId` passed and when it is set to true, the entire hierarchy of compartments can be returned.
     * To get a full list of all compartments and subcompartments in the tenancy (root compartment),
     * set the parameter `compartmentIdInSubtree` to true and `accessLevel` to ACCESSIBLE.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation will not retry by default, users can also use RetryConfiguration.DEFAULT_RETRY_CONFIGURATION provided by the SDK to enable retries for it.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/cloudguard/RequestSummarizedTrendProblemsExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use RequestSummarizedTrendProblems API.
     */
    RequestSummarizedTrendProblemsResponse requestSummarizedTrendProblems(
            RequestSummarizedTrendProblemsRequest request);

    /**
     * Returns the number of remediations performed by Responders, for a given time period.
     * <p>
     * The parameter `accessLevel` specifies whether to return only those compartments for which the
     * requestor has INSPECT permissions on at least one resource directly
     * or indirectly (ACCESSIBLE) (the resource can be in a subcompartment) or to return Not Authorized if
     * Principal doesn't have access to even one of the child compartments. This is valid only when
     * `compartmentIdInSubtree` is set to `true`.
     * <p>
     * The parameter `compartmentIdInSubtree` applies when you perform summarize API on the
     * `compartmentId` passed and when it is set to true, the entire hierarchy of compartments can be returned.
     * To get a full list of all compartments and subcompartments in the tenancy (root compartment),
     * set the parameter `compartmentIdInSubtree` to true and `accessLevel` to ACCESSIBLE.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation will not retry by default, users can also use RetryConfiguration.DEFAULT_RETRY_CONFIGURATION provided by the SDK to enable retries for it.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/cloudguard/RequestSummarizedTrendResponderExecutionsExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use RequestSummarizedTrendResponderExecutions API.
     */
    RequestSummarizedTrendResponderExecutionsResponse requestSummarizedTrendResponderExecutions(
            RequestSummarizedTrendResponderExecutionsRequest request);

    /**
     * DEPRECATED
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation will not retry by default, users can also use RetryConfiguration.DEFAULT_RETRY_CONFIGURATION provided by the SDK to enable retries for it.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/cloudguard/RequestSummarizedTrendSecurityScoresExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use RequestSummarizedTrendSecurityScores API.
     */
    RequestSummarizedTrendSecurityScoresResponse requestSummarizedTrendSecurityScores(
            RequestSummarizedTrendSecurityScoresRequest request);

    /**
     * Skips the execution for a bulk of responder executions
     * The operation is atomic in nature
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation will not retry by default, users can also use RetryConfiguration.DEFAULT_RETRY_CONFIGURATION provided by the SDK to enable retries for it.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/cloudguard/SkipBulkResponderExecutionExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use SkipBulkResponderExecution API.
     */
    SkipBulkResponderExecutionResponse skipBulkResponderExecution(
            SkipBulkResponderExecutionRequest request);

    /**
     * Skips the execution of the responder execution. When provided, If-Match is checked against ETag values of the resource.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation will not retry by default, users can also use RetryConfiguration.DEFAULT_RETRY_CONFIGURATION provided by the SDK to enable retries for it.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/cloudguard/SkipResponderExecutionExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use SkipResponderExecution API.
     */
    SkipResponderExecutionResponse skipResponderExecution(SkipResponderExecutionRequest request);

    /**
     * push the problem to responder
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation will not retry by default, users can also use RetryConfiguration.DEFAULT_RETRY_CONFIGURATION provided by the SDK to enable retries for it.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/cloudguard/TriggerResponderExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use TriggerResponder API.
     */
    TriggerResponderResponse triggerResponder(TriggerResponderRequest request);

    /**
     * Updates the statuses in bulk for a list of problems
     * The operation is atomic in nature
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation will not retry by default, users can also use RetryConfiguration.DEFAULT_RETRY_CONFIGURATION provided by the SDK to enable retries for it.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/cloudguard/UpdateBulkProblemStatusExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use UpdateBulkProblemStatus API.
     */
    UpdateBulkProblemStatusResponse updateBulkProblemStatus(UpdateBulkProblemStatusRequest request);

    /**
     * Enable/Disable Cloud Guard. The reporting region cannot be updated once created.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation will not retry by default, users can also use RetryConfiguration.DEFAULT_RETRY_CONFIGURATION provided by the SDK to enable retries for it.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/cloudguard/UpdateConfigurationExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use UpdateConfiguration API.
     */
    UpdateConfigurationResponse updateConfiguration(UpdateConfigurationRequest request);

    /**
     * Updates a DataMaskRule identified by dataMaskRuleId
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation will not retry by default, users can also use RetryConfiguration.DEFAULT_RETRY_CONFIGURATION provided by the SDK to enable retries for it.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/cloudguard/UpdateDataMaskRuleExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use UpdateDataMaskRule API.
     */
    UpdateDataMaskRuleResponse updateDataMaskRule(UpdateDataMaskRuleRequest request);

    /**
     * Updates a detector recipe identified by detectorRecipeId
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation will not retry by default, users can also use RetryConfiguration.DEFAULT_RETRY_CONFIGURATION provided by the SDK to enable retries for it.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/cloudguard/UpdateDetectorRecipeExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use UpdateDetectorRecipe API.
     */
    UpdateDetectorRecipeResponse updateDetectorRecipe(UpdateDetectorRecipeRequest request);

    /**
     * Update the DetectorRule by identifier
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation will not retry by default, users can also use RetryConfiguration.DEFAULT_RETRY_CONFIGURATION provided by the SDK to enable retries for it.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/cloudguard/UpdateDetectorRecipeDetectorRuleExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use UpdateDetectorRecipeDetectorRule API.
     */
    UpdateDetectorRecipeDetectorRuleResponse updateDetectorRecipeDetectorRule(
            UpdateDetectorRecipeDetectorRuleRequest request);

    /**
     * Updates a managed list identified by managedListId
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation will not retry by default, users can also use RetryConfiguration.DEFAULT_RETRY_CONFIGURATION provided by the SDK to enable retries for it.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/cloudguard/UpdateManagedListExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use UpdateManagedList API.
     */
    UpdateManagedListResponse updateManagedList(UpdateManagedListRequest request);

    /**
     * updates the problem details
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation will not retry by default, users can also use RetryConfiguration.DEFAULT_RETRY_CONFIGURATION provided by the SDK to enable retries for it.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/cloudguard/UpdateProblemStatusExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use UpdateProblemStatus API.
     */
    UpdateProblemStatusResponse updateProblemStatus(UpdateProblemStatusRequest request);

    /**
     * Update the ResponderRecipe resource by identifier
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation will not retry by default, users can also use RetryConfiguration.DEFAULT_RETRY_CONFIGURATION provided by the SDK to enable retries for it.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/cloudguard/UpdateResponderRecipeExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use UpdateResponderRecipe API.
     */
    UpdateResponderRecipeResponse updateResponderRecipe(UpdateResponderRecipeRequest request);

    /**
     * Update the ResponderRule by identifier
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation will not retry by default, users can also use RetryConfiguration.DEFAULT_RETRY_CONFIGURATION provided by the SDK to enable retries for it.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/cloudguard/UpdateResponderRecipeResponderRuleExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use UpdateResponderRecipeResponderRule API.
     */
    UpdateResponderRecipeResponderRuleResponse updateResponderRecipeResponderRule(
            UpdateResponderRecipeResponderRuleRequest request);

    /**
     * Updates a Target identified by targetId
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation will not retry by default, users can also use RetryConfiguration.DEFAULT_RETRY_CONFIGURATION provided by the SDK to enable retries for it.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/cloudguard/UpdateTargetExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use UpdateTarget API.
     */
    UpdateTargetResponse updateTarget(UpdateTargetRequest request);

    /**
     * Update the TargetDetectorRecipe resource by identifier
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation will not retry by default, users can also use RetryConfiguration.DEFAULT_RETRY_CONFIGURATION provided by the SDK to enable retries for it.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/cloudguard/UpdateTargetDetectorRecipeExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use UpdateTargetDetectorRecipe API.
     */
    UpdateTargetDetectorRecipeResponse updateTargetDetectorRecipe(
            UpdateTargetDetectorRecipeRequest request);

    /**
     * Update the DetectorRule by identifier
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation will not retry by default, users can also use RetryConfiguration.DEFAULT_RETRY_CONFIGURATION provided by the SDK to enable retries for it.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/cloudguard/UpdateTargetDetectorRecipeDetectorRuleExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use UpdateTargetDetectorRecipeDetectorRule API.
     */
    UpdateTargetDetectorRecipeDetectorRuleResponse updateTargetDetectorRecipeDetectorRule(
            UpdateTargetDetectorRecipeDetectorRuleRequest request);

    /**
     * Update the TargetResponderRecipe resource by identifier
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation will not retry by default, users can also use RetryConfiguration.DEFAULT_RETRY_CONFIGURATION provided by the SDK to enable retries for it.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/cloudguard/UpdateTargetResponderRecipeExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use UpdateTargetResponderRecipe API.
     */
    UpdateTargetResponderRecipeResponse updateTargetResponderRecipe(
            UpdateTargetResponderRecipeRequest request);

    /**
     * Update the ResponderRule by identifier
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation will not retry by default, users can also use RetryConfiguration.DEFAULT_RETRY_CONFIGURATION provided by the SDK to enable retries for it.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/cloudguard/UpdateTargetResponderRecipeResponderRuleExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use UpdateTargetResponderRecipeResponderRule API.
     */
    UpdateTargetResponderRecipeResponderRuleResponse updateTargetResponderRecipeResponderRule(
            UpdateTargetResponderRecipeResponderRuleRequest request);

    /**
     * Gets the pre-configured waiters available for resources for this service.
     *
     * @return The service waiters.
     */
    CloudGuardWaiters getWaiters();

    /**
     * Gets the pre-configured paginators available for list operations in this service which may return multiple
     * pages of data. These paginators provide an {@link java.lang.Iterable} interface so that service responses, or
     * resources/records, can be iterated through without having to manually deal with pagination and page tokens.
     *
     * @return The service paginators.
     */
    CloudGuardPaginators getPaginators();
}

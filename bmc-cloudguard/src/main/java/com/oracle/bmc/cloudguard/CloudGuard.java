/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.cloudguard;

import com.oracle.bmc.cloudguard.requests.*;
import com.oracle.bmc.cloudguard.responses.*;

/**
 * Use the Cloud Guard and Security Zones API to automate processes that you would otherwise perform through the Cloud Guard Console or the Security Zones Console. For more information on these services, see the [Cloud Guard](https://docs.cloud.oracle.com/iaas/cloud-guard/home.htm) and [Security Zones](https://docs.cloud.oracle.com/iaas/security-zone/home.htm) documentation.
 *
 **Note:** For Cloud Guard, you can perform Create, Update, and Delete operations only from the reporting region of your Cloud Guard tenancy. You can perform Read operations from any region.
 *
 * This service client uses CircuitBreakerUtils.DEFAULT_CIRCUIT_BREAKER for all the operations by default if no circuit breaker configuration is defined by the user.
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200131")
public interface CloudGuard extends AutoCloseable {

    /**
     * Rebuilds the client from scratch.
     * Useful to refresh certificates.
     */
    void refreshClient();

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
     * Determines whether realm specific endpoint should be used or not.
     * Set realmSpecificEndpointTemplateEnabled to "true" if the user wants to enable use of realm specific endpoint template, otherwise set it to "false"
     * @param realmSpecificEndpointTemplateEnabled flag to enable the use of realm specific endpoint template
     */
    void useRealmSpecificEndpointTemplate(boolean realmSpecificEndpointTemplateEnabled);

    /**
     * Adds a compartment to an existing security zone (SecurityZone resource), identified by
     * securityZoneId. Specify parameters in an AddCompartmentDetails resource that you pass.
     * If you previously removed a subcompartment from a security zone, you can add it back to the
     * same security zone. The security zone ensures that resources in the subcompartment comply with
     * the security zone's policies.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation will not retry by default, users can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to enable retries for it.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/cloudguard/AddCompartmentExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use AddCompartment API.
     */
    AddCompartmentResponse addCompartment(AddCompartmentRequest request);

    /**
     * Cancels a work request identified by workRequestId.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation will not retry by default, users can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to enable retries for it.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/cloudguard/CancelWorkRequestExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use CancelWorkRequest API.
     */
    CancelWorkRequestResponse cancelWorkRequest(CancelWorkRequestRequest request);

    /**
     * Moves a data source (DataSource resource), identified by parameters
     * passed in a ChangeDataSourceCompartmentDetails resource, from the current
     * compartment to another.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation will not retry by default, users can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to enable retries for it.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/cloudguard/ChangeDataSourceCompartmentExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use ChangeDataSourceCompartment API.
     */
    ChangeDataSourceCompartmentResponse changeDataSourceCompartment(
            ChangeDataSourceCompartmentRequest request);

    /**
     * Moves the detector recipe (DetectorRecipe resource),
     * identified by detectorRecipeId, from the current compartment to
     * another compartment. When provided, If-Match is checked against
     * etag values of the resource.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation will not retry by default, users can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to enable retries for it.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/cloudguard/ChangeDetectorRecipeCompartmentExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use ChangeDetectorRecipeCompartment API.
     */
    ChangeDetectorRecipeCompartmentResponse changeDetectorRecipeCompartment(
            ChangeDetectorRecipeCompartmentRequest request);

    /**
     * Moves the managed list (ManagedList resource), identified by managedListId, from the current compartment to another compartment.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation will not retry by default, users can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to enable retries for it.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/cloudguard/ChangeManagedListCompartmentExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use ChangeManagedListCompartment API.
     */
    ChangeManagedListCompartmentResponse changeManagedListCompartment(
            ChangeManagedListCompartmentRequest request);

    /**
     * Moves the responder recipe (ResponderRecipe resource), identified by responderRecipeId
     * in a ChangeResponderRecipeCompartmentDetails resource, from the current compartment to another compartment.
     * When provided, if-match is checked against etag values of the resource.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation will not retry by default, users can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to enable retries for it.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/cloudguard/ChangeResponderRecipeCompartmentExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use ChangeResponderRecipeCompartment API.
     */
    ChangeResponderRecipeCompartmentResponse changeResponderRecipeCompartment(
            ChangeResponderRecipeCompartmentRequest request);

    /**
     * Moves the SavedQuery resource into a different compartment. When provided, If-Match is checked against etag values of the resource.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation will not retry by default, users can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to enable retries for it.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/cloudguard/ChangeSavedQueryCompartmentExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use ChangeSavedQueryCompartment API.
     */
    ChangeSavedQueryCompartmentResponse changeSavedQueryCompartment(
            ChangeSavedQueryCompartmentRequest request);

    /**
     * Moves the security recipe (SecurityRecipe resource), identified by securityRecipeId,
     * from the current compartment to another compartment. When provided, `if-match` is checked
     * against `etag` values of the resource.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation will not retry by default, users can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to enable retries for it.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/cloudguard/ChangeSecurityRecipeCompartmentExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use ChangeSecurityRecipeCompartment API.
     */
    ChangeSecurityRecipeCompartmentResponse changeSecurityRecipeCompartment(
            ChangeSecurityRecipeCompartmentRequest request);

    /**
     * Moves a security zone, identified by securityZoneId, to a different compartment.
     * Pass parameters through a ChangeSecurityZoneCompartmentDetails resource.
     * When provided, `if-match` is checked against `etag` values of the resource.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation will not retry by default, users can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to enable retries for it.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/cloudguard/ChangeSecurityZoneCompartmentExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use ChangeSecurityZoneCompartment API.
     */
    ChangeSecurityZoneCompartmentResponse changeSecurityZoneCompartment(
            ChangeSecurityZoneCompartmentRequest request);

    /**
     * Creates a AdhocQuery resource.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation will not retry by default, users can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to enable retries for it.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/cloudguard/CreateAdhocQueryExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use CreateAdhocQuery API.
     */
    CreateAdhocQueryResponse createAdhocQuery(CreateAdhocQueryRequest request);

    /**
     * Creates a new DataMaskRule resource definition.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation will not retry by default, users can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to enable retries for it.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/cloudguard/CreateDataMaskRuleExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use CreateDataMaskRule API.
     */
    CreateDataMaskRuleResponse createDataMaskRule(CreateDataMaskRuleRequest request);

    /**
     * Creates a data source (DataSource resource), using parameters passed
     * through a CreateDataSourceDetails resource.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation will not retry by default, users can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to enable retries for it.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/cloudguard/CreateDataSourceExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use CreateDataSource API.
     */
    CreateDataSourceResponse createDataSource(CreateDataSourceRequest request);

    /**
     * Creates a new DetectorRecipe resource.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation will not retry by default, users can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to enable retries for it.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/cloudguard/CreateDetectorRecipeExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use CreateDetectorRecipe API.
     */
    CreateDetectorRecipeResponse createDetectorRecipe(CreateDetectorRecipeRequest request);

    /**
     * Creates a detector rule.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation will not retry by default, users can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to enable retries for it.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/cloudguard/CreateDetectorRecipeDetectorRuleExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use CreateDetectorRecipeDetectorRule API.
     */
    CreateDetectorRecipeDetectorRuleResponse createDetectorRecipeDetectorRule(
            CreateDetectorRecipeDetectorRuleRequest request);

    /**
     * Creates a new ManagedList resource.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation will not retry by default, users can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to enable retries for it.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/cloudguard/CreateManagedListExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use CreateManagedList API.
     */
    CreateManagedListResponse createManagedList(CreateManagedListRequest request);

    /**
     * Creates a responder recipe (ResponderRecipe resource), from values passed in a
     * CreateResponderRecipeDetails resource.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation will not retry by default, users can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to enable retries for it.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/cloudguard/CreateResponderRecipeExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use CreateResponderRecipe API.
     */
    CreateResponderRecipeResponse createResponderRecipe(CreateResponderRecipeRequest request);

    /**
     * Creates a SavedQuery resource.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation will not retry by default, users can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to enable retries for it.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/cloudguard/CreateSavedQueryExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use CreateSavedQuery API.
     */
    CreateSavedQueryResponse createSavedQuery(CreateSavedQueryRequest request);

    /**
     * Creates a security zone recipe (SecurityRecipe resource), using parameters
     * passed in a CreateSecurityRecipeDetails resource.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation will not retry by default, users can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to enable retries for it.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/cloudguard/CreateSecurityRecipeExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use CreateSecurityRecipe API.
     */
    CreateSecurityRecipeResponse createSecurityRecipe(CreateSecurityRecipeRequest request);

    /**
     * Creates a security zone (SecurityZone resource) for a compartment. Pass parameters
     * through a CreateSecurityZoneDetails resource.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation will not retry by default, users can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to enable retries for it.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/cloudguard/CreateSecurityZoneExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use CreateSecurityZone API.
     */
    CreateSecurityZoneResponse createSecurityZone(CreateSecurityZoneRequest request);

    /**
     * Creates a target (Target resource), using parameters passed in a CreateTargetDetails resource.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation will not retry by default, users can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to enable retries for it.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/cloudguard/CreateTargetExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use CreateTarget API.
     */
    CreateTargetResponse createTarget(CreateTargetRequest request);

    /**
     * Attaches a DetectorRecipe to a target (Target resource) identified by targetId,
     * using parameters passed in a TargetAttachTargetDetectorRecipeDetails resource.
     * Attach a DetectorRecipe with the Target
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation will not retry by default, users can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to enable retries for it.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/cloudguard/CreateTargetDetectorRecipeExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use CreateTargetDetectorRecipe API.
     */
    CreateTargetDetectorRecipeResponse createTargetDetectorRecipe(
            CreateTargetDetectorRecipeRequest request);

    /**
     * Attaches a responder recipe to a target.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation will not retry by default, users can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to enable retries for it.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/cloudguard/CreateTargetResponderRecipeExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use CreateTargetResponderRecipe API.
     */
    CreateTargetResponderRecipeResponse createTargetResponderRecipe(
            CreateTargetResponderRecipeRequest request);

    /**
     * Creates and registers a WLP agent for an
     * on-premise resource.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation will not retry by default, users can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to enable retries for it.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/cloudguard/CreateWlpAgentExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use CreateWlpAgent API.
     */
    CreateWlpAgentResponse createWlpAgent(CreateWlpAgentRequest request);

    /**
     * Deletes a AdhocQuery resource identified by adhocQueryId.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation will not retry by default, users can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to enable retries for it.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/cloudguard/DeleteAdhocQueryExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use DeleteAdhocQuery API.
     */
    DeleteAdhocQueryResponse deleteAdhocQuery(DeleteAdhocQueryRequest request);

    /**
     * Deletes a DataMaskRule resource, identified by dataMaskRuleId.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation will not retry by default, users can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to enable retries for it.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/cloudguard/DeleteDataMaskRuleExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use DeleteDataMaskRule API.
     */
    DeleteDataMaskRuleResponse deleteDataMaskRule(DeleteDataMaskRuleRequest request);

    /**
     * Deletes a data source (DataSource resource) identified by dataSourceId.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation will not retry by default, users can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to enable retries for it.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/cloudguard/DeleteDataSourceExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use DeleteDataSource API.
     */
    DeleteDataSourceResponse deleteDataSource(DeleteDataSourceRequest request);

    /**
     * Deletes a detector recipe (DetectorRecipe resource) identified by detectorRecipeId.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation will not retry by default, users can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to enable retries for it.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/cloudguard/DeleteDetectorRecipeExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use DeleteDetectorRecipe API.
     */
    DeleteDetectorRecipeResponse deleteDetectorRecipe(DeleteDetectorRecipeRequest request);

    /**
     * Deletes the DetectorRecipeDetectorRule resource identified by detectorRuleId.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation will not retry by default, users can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to enable retries for it.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/cloudguard/DeleteDetectorRecipeDetectorRuleExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use DeleteDetectorRecipeDetectorRule API.
     */
    DeleteDetectorRecipeDetectorRuleResponse deleteDetectorRecipeDetectorRule(
            DeleteDetectorRecipeDetectorRuleRequest request);

    /**
     * Deletes the DetectorRecipeDetectorRuleDataSource resource by identifier.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation will not retry by default, users can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to enable retries for it.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/cloudguard/DeleteDetectorRecipeDetectorRuleDataSourceExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use DeleteDetectorRecipeDetectorRuleDataSource API.
     */
    DeleteDetectorRecipeDetectorRuleDataSourceResponse deleteDetectorRecipeDetectorRuleDataSource(
            DeleteDetectorRecipeDetectorRuleDataSourceRequest request);

    /**
     * Deletes a managed list identified by managedListId.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation will not retry by default, users can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to enable retries for it.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/cloudguard/DeleteManagedListExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use DeleteManagedList API.
     */
    DeleteManagedListResponse deleteManagedList(DeleteManagedListRequest request);

    /**
     * Deletes a responder recipe (ResponderRecipe resource) identified by responderRecipeId.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation will not retry by default, users can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to enable retries for it.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/cloudguard/DeleteResponderRecipeExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use DeleteResponderRecipe API.
     */
    DeleteResponderRecipeResponse deleteResponderRecipe(DeleteResponderRecipeRequest request);

    /**
     * Deletes a SavedQuery resource identified by savedQueryId.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation will not retry by default, users can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to enable retries for it.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/cloudguard/DeleteSavedQueryExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use DeleteSavedQuery API.
     */
    DeleteSavedQueryResponse deleteSavedQuery(DeleteSavedQueryRequest request);

    /**
     * Deletes a security zone recipe, identified by securityRecipeId. The recipe can't be associated with an existing security zone.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation will not retry by default, users can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to enable retries for it.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/cloudguard/DeleteSecurityRecipeExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use DeleteSecurityRecipe API.
     */
    DeleteSecurityRecipeResponse deleteSecurityRecipe(DeleteSecurityRecipeRequest request);

    /**
     * Deletes a security zone, identified by securityZoneId.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation will not retry by default, users can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to enable retries for it.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/cloudguard/DeleteSecurityZoneExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use DeleteSecurityZone API.
     */
    DeleteSecurityZoneResponse deleteSecurityZone(DeleteSecurityZoneRequest request);

    /**
     * Deletes a target (Target resource) identified by targetId.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation will not retry by default, users can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to enable retries for it.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/cloudguard/DeleteTargetExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use DeleteTarget API.
     */
    DeleteTargetResponse deleteTarget(DeleteTargetRequest request);

    /**
     * Deletes the target detector recipe (TargetDetectorRecipe resource) identified by
     * targetDetectorRecipeId, from a target (Target resource) identified by targetId.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation will not retry by default, users can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to enable retries for it.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/cloudguard/DeleteTargetDetectorRecipeExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use DeleteTargetDetectorRecipe API.
     */
    DeleteTargetDetectorRecipeResponse deleteTargetDetectorRecipe(
            DeleteTargetDetectorRecipeRequest request);

    /**
     * Detaches a target responder recipe (TargetResponderRecipe resource)
     * identified by targetResponderRecipeId, from a target (Target resource)
     * identified by targetId.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation will not retry by default, users can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to enable retries for it.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/cloudguard/DeleteTargetResponderRecipeExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use DeleteTargetResponderRecipe API.
     */
    DeleteTargetResponderRecipeResponse deleteTargetResponderRecipe(
            DeleteTargetResponderRecipeRequest request);

    /**
     * Deletes and unregisters the WLP agent for an on-premise resource.
     * x-obmcs-splat:
     * routing:
     *   strategy: route-to-any-ad
     * serviceList: [ 'cloudguard-cp-SPLAT_ENV' ]
     * resources:
     *   wlpAgent:
     *     serviceResourceName: WlpAgent
     *     targetCompartmentId: downstream.getOr404('cloudguard-cp-SPLAT_ENV', 'GetWlpAgent', request.resourceId).compartmentId
     *     actionKind: delete
     *     resourceOcid: request.resourceId
     *     reconciliationCanStartAfterSecs: 30
     *     permissions: [ \"WLP_AGENT_DELETE\" ]
     * authorization:
     *   mode: automated
     *   check: resources['wlpAgent'].grantedPermissions.contains('WLP_AGENT_DELETE')
     *   allowCrossTenancy: true
     * tagStore:
     *   mode: automated
     * maximumAttemptCount: 3
     * throttling:
     *   perUserLimit:
     *     rpsLimit: 15
     *   perTenantLimit:
     *     rpsLimit: 30
     * quotas:
     *   mode: automated
     * search:
     *   mode: backfilling
     *   operationResourceName: wlpAgent
     * lock:
     *   mode: test
     *   operationResourceName: wlpAgent
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation will not retry by default, users can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to enable retries for it.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/cloudguard/DeleteWlpAgentExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use DeleteWlpAgent API.
     */
    DeleteWlpAgentResponse deleteWlpAgent(DeleteWlpAgentRequest request);

    /**
     * Executes the responder execution. When provided, if-match is checked
     * against etag values of the resource.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation will not retry by default, users can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to enable retries for it.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/cloudguard/ExecuteResponderExecutionExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use ExecuteResponderExecution API.
     */
    ExecuteResponderExecutionResponse executeResponderExecution(
            ExecuteResponderExecutionRequest request);

    /**
     * Returns an adhoc query identified by adhocQueryId.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation will not retry by default, users can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to enable retries for it.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/cloudguard/GetAdhocQueryExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use GetAdhocQuery API.
     */
    GetAdhocQueryResponse getAdhocQuery(GetAdhocQueryRequest request);

    /**
     * Downloads the results for a given adhoc ID (from includes results from all monitoring regions).
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation will not retry by default, users can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to enable retries for it.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/cloudguard/GetAdhocQueryResultContentExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use GetAdhocQueryResultContent API.
     */
    GetAdhocQueryResultContentResponse getAdhocQueryResultContent(
            GetAdhocQueryResultContentRequest request);

    /**
     * Returns a ConditionMetatDataType resource with its details.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation will not retry by default, users can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to enable retries for it.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/cloudguard/GetConditionMetadataTypeExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use GetConditionMetadataType API.
     */
    GetConditionMetadataTypeResponse getConditionMetadataType(
            GetConditionMetadataTypeRequest request);

    /**
     * Returns the configuration details for a Cloud Guard tenancy,
     * identified by root compartment OCID.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation will not retry by default, users can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to enable retries for it.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/cloudguard/GetConfigurationExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use GetConfiguration API.
     */
    GetConfigurationResponse getConfiguration(GetConfigurationRequest request);

    /**
     * Returns a DataMaskRule resource, identified by dataMaskRuleId.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation will not retry by default, users can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to enable retries for it.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/cloudguard/GetDataMaskRuleExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use GetDataMaskRule API.
     */
    GetDataMaskRuleResponse getDataMaskRule(GetDataMaskRuleRequest request);

    /**
     * Returns a data source (DataSource resource) identified by dataSourceId.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation will not retry by default, users can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to enable retries for it.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/cloudguard/GetDataSourceExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use GetDataSource API.
     */
    GetDataSourceResponse getDataSource(GetDataSourceRequest request);

    /**
     * Returns a Detector resource, identified by detectorId.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation will not retry by default, users can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to enable retries for it.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/cloudguard/GetDetectorExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use GetDetector API.
     */
    GetDetectorResponse getDetector(GetDetectorRequest request);

    /**
     * Returns a detector recipe (DetectorRecipe resource) identified by detectorRecipeId.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation will not retry by default, users can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to enable retries for it.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/cloudguard/GetDetectorRecipeExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use GetDetectorRecipe API.
     */
    GetDetectorRecipeResponse getDetectorRecipe(GetDetectorRecipeRequest request);

    /**
     * Returns a detector rule (DetectorRule resource) identified by detectorRuleId.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation will not retry by default, users can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to enable retries for it.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/cloudguard/GetDetectorRecipeDetectorRuleExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use GetDetectorRecipeDetectorRule API.
     */
    GetDetectorRecipeDetectorRuleResponse getDetectorRecipeDetectorRule(
            GetDetectorRecipeDetectorRuleRequest request);

    /**
     * Returns a detector rule (DetectorRule resource) identified by detectorRuleId.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation will not retry by default, users can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to enable retries for it.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/cloudguard/GetDetectorRuleExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use GetDetectorRule API.
     */
    GetDetectorRuleResponse getDetectorRule(GetDetectorRuleRequest request);

    /**
     * Returns a managed list identified by managedListId.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation will not retry by default, users can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to enable retries for it.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/cloudguard/GetManagedListExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use GetManagedList API.
     */
    GetManagedListResponse getManagedList(GetManagedListRequest request);

    /**
     * Returns the Problem resource identified by problemId.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation will not retry by default, users can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to enable retries for it.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/cloudguard/GetProblemExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use GetProblem API.
     */
    GetProblemResponse getProblem(GetProblemRequest request);

    /**
     * Returns a resource identified by resourceId
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation will not retry by default, users can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to enable retries for it.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/cloudguard/GetResourceExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use GetResource API.
     */
    GetResourceResponse getResource(GetResourceRequest request);

    /**
     * Returns details for a resource profile, identified by resourceProfileId.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation will not retry by default, users can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to enable retries for it.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/cloudguard/GetResourceProfileExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use GetResourceProfile API.
     */
    GetResourceProfileResponse getResourceProfile(GetResourceProfileRequest request);

    /**
     * Returns the vulnerability details associated with the cveId where resource is an instance
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation will not retry by default, users can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to enable retries for it.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/cloudguard/GetResourceVulnerabilityExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use GetResourceVulnerability API.
     */
    GetResourceVulnerabilityResponse getResourceVulnerability(
            GetResourceVulnerabilityRequest request);

    /**
     * Returns a responder execution identified by responderExecutionId.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation will not retry by default, users can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to enable retries for it.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/cloudguard/GetResponderExecutionExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use GetResponderExecution API.
     */
    GetResponderExecutionResponse getResponderExecution(GetResponderExecutionRequest request);

    /**
     * Returns a responder recipe (ResponderRecipe resource) identified by responderRecipeId.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation will not retry by default, users can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to enable retries for it.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/cloudguard/GetResponderRecipeExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use GetResponderRecipe API.
     */
    GetResponderRecipeResponse getResponderRecipe(GetResponderRecipeRequest request);

    /**
     * Returns a responder rule (ResponderRule resource) identified by responderRuleId.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation will not retry by default, users can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to enable retries for it.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/cloudguard/GetResponderRecipeResponderRuleExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use GetResponderRecipeResponderRule API.
     */
    GetResponderRecipeResponderRuleResponse getResponderRecipeResponderRule(
            GetResponderRecipeResponderRuleRequest request);

    /**
     * Returns a responder rule (ResponderRule resource) identified by resonderRuleId.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation will not retry by default, users can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to enable retries for it.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/cloudguard/GetResponderRuleExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use GetResponderRule API.
     */
    GetResponderRuleResponse getResponderRule(GetResponderRuleRequest request);

    /**
     * Returns a SavedQuery resource identified by savedQueryId.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation will not retry by default, users can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to enable retries for it.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/cloudguard/GetSavedQueryExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use GetSavedQuery API.
     */
    GetSavedQueryResponse getSavedQuery(GetSavedQueryRequest request);

    /**
     * Returns a security zone policy (SecurityPolicy resource), identified by its unique ID
     * (securityPolicyId). When a policy is enabled in a security zone, then any action in
     * the zone that attempts to violate that policy is blocked.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation will not retry by default, users can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to enable retries for it.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/cloudguard/GetSecurityPolicyExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use GetSecurityPolicy API.
     */
    GetSecurityPolicyResponse getSecurityPolicy(GetSecurityPolicyRequest request);

    /**
     * Returns a security zone recipe (SecurityRecipe resource) identified by securityRecipeId.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation will not retry by default, users can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to enable retries for it.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/cloudguard/GetSecurityRecipeExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use GetSecurityRecipe API.
     */
    GetSecurityRecipeResponse getSecurityRecipe(GetSecurityRecipeRequest request);

    /**
     * Returns a security zone (SecurityZone resource) identified by securityZoneId.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation will not retry by default, users can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to enable retries for it.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/cloudguard/GetSecurityZoneExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use GetSecurityZone API.
     */
    GetSecurityZoneResponse getSecurityZone(GetSecurityZoneRequest request);

    /**
     * Returns a single sighting (Sighting resource) identified by sightingId.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation will not retry by default, users can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to enable retries for it.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/cloudguard/GetSightingExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use GetSighting API.
     */
    GetSightingResponse getSighting(GetSightingRequest request);

    /**
     * Returns a target (Target resource) identified by targetId.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation will not retry by default, users can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to enable retries for it.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/cloudguard/GetTargetExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use GetTarget API.
     */
    GetTargetResponse getTarget(GetTargetRequest request);

    /**
     * Returns a target detector recipe (TargetDetectorRecipe resource) identified by targetDetectorRecipeId.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation will not retry by default, users can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to enable retries for it.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/cloudguard/GetTargetDetectorRecipeExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use GetTargetDetectorRecipe API.
     */
    GetTargetDetectorRecipeResponse getTargetDetectorRecipe(GetTargetDetectorRecipeRequest request);

    /**
     * Returns DetectorRule resource by identified by targetDetectorRecipeId.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation will not retry by default, users can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to enable retries for it.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/cloudguard/GetTargetDetectorRecipeDetectorRuleExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use GetTargetDetectorRecipeDetectorRule API.
     */
    GetTargetDetectorRecipeDetectorRuleResponse getTargetDetectorRecipeDetectorRule(
            GetTargetDetectorRecipeDetectorRuleRequest request);

    /**
     * Returns a target responder recipe (TargetResponderRecipe) identified by
     * targetResponderRecipeId for a target (Target resource) identified by targetId.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation will not retry by default, users can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to enable retries for it.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/cloudguard/GetTargetResponderRecipeExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use GetTargetResponderRecipe API.
     */
    GetTargetResponderRecipeResponse getTargetResponderRecipe(
            GetTargetResponderRecipeRequest request);

    /**
     * Returns a responder rule (ResponderRule resource) identified by
     * responderRuleId, from a target responder recipe (TargetResponderRecipe resource)
     * identified by targetResponderRecipeId, attached to a target (Target resource)
     * identified by targetId.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation will not retry by default, users can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to enable retries for it.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/cloudguard/GetTargetResponderRecipeResponderRuleExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use GetTargetResponderRecipeResponderRule API.
     */
    GetTargetResponderRecipeResponderRuleResponse getTargetResponderRecipeResponderRule(
            GetTargetResponderRecipeResponderRuleRequest request);

    /**
     * Returns a WlpAgent resource for an on-premise resource identified by wlpAgentId.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation will not retry by default, users can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to enable retries for it.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/cloudguard/GetWlpAgentExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use GetWlpAgent API.
     */
    GetWlpAgentResponse getWlpAgent(GetWlpAgentRequest request);

    /**
     * Returns details for a work request (WorkRequest resource) identified by workRequestId.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation will not retry by default, users can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to enable retries for it.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/cloudguard/GetWorkRequestExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use GetWorkRequest API.
     */
    GetWorkRequestResponse getWorkRequest(GetWorkRequestRequest request);

    /**
     * Returns a list of all adhoc queries (AdhocQuery resources) for a compartment
     * identified by compartmentId. List is returned in a AdhocQueryCollection resource
     * with page of AdhocQuerySummary resources.
     * <p>
     * The ListAdhocQueries operation returns only the adhoc queries in 'compartmentId' passed.
     * The list does not include any subcompartments of the compartmentId passed.
     * <p>
     * The parameter `accessLevel` specifies whether to return only those compartments for which the
     * requestor has INSPECT permissions on at least one resource directly
     * or indirectly (ACCESSIBLE) (the resource can be in a subcompartment) or to return Not Authorized if
     * Principal doesn't have access to even one of the child compartments. This is valid only when
     * `compartmentIdInSubtree` is set to `true`.
     * <p>
     * The parameter `compartmentIdInSubtree` applies when you perform ListAdhocQueries on the
     * `compartmentId` passed and when it is set to true, the entire hierarchy of compartments can be returned.
     * To get a full list of all compartments and subcompartments in the tenancy (root compartment),
     * set the parameter `compartmentIdInSubtree` to true and `accessLevel` to ACCESSIBLE.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation will not retry by default, users can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to enable retries for it.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/cloudguard/ListAdhocQueriesExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use ListAdhocQueries API.
     */
    ListAdhocQueriesResponse listAdhocQueries(ListAdhocQueriesRequest request);

    /**
     * Lists the results for a given adhoc ID (from includes results from all monitoring regions).
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation will not retry by default, users can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to enable retries for it.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/cloudguard/ListAdhocQueryResultsExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use ListAdhocQueryResults API.
     */
    ListAdhocQueryResultsResponse listAdhocQueryResults(ListAdhocQueryResultsRequest request);

    /**
     * Returns a list of ConditionMetadataType resources.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation will not retry by default, users can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to enable retries for it.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/cloudguard/ListConditionMetadataTypesExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use ListConditionMetadataTypes API.
     */
    ListConditionMetadataTypesResponse listConditionMetadataTypes(
            ListConditionMetadataTypesRequest request);

    /**
     * Returns a list of all DataMaskRule resources in the specified compartmentId (OCID) and its subcompartments.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation will not retry by default, users can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to enable retries for it.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/cloudguard/ListDataMaskRulesExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use ListDataMaskRules API.
     */
    ListDataMaskRulesResponse listDataMaskRules(ListDataMaskRulesRequest request);

    /**
     * Returns a list of data source events
     * (DataSourceEventCollection  resource) from the data source
     * (DataSource resource) identified by dataSourceId.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation will not retry by default, users can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to enable retries for it.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/cloudguard/ListDataSourceEventsExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use ListDataSourceEvents API.
     */
    ListDataSourceEventsResponse listDataSourceEvents(ListDataSourceEventsRequest request);

    /**
     * Returns a list of all data sources (DataSource resources) for a compartment
     * identified by compartmentId. List is returned in a DataSourceCollection resource
     * with page of DataSourceSummary resources.
     * <p>
     * The ListAdhocQueries operation returns only the adhoc queries in 'compartmentId' passed.
     * The list does not include any subcompartments of the compartmentId passed.
     * <p>
     * The parameter `accessLevel` specifies whether to return only those compartments for which the
     * requestor has INSPECT permissions on at least one resource directly
     * or indirectly (ACCESSIBLE) (the resource can be in a subcompartment) or to return Not Authorized if
     * Principal doesn't have access to even one of the child compartments. This is valid only when
     * `compartmentIdInSubtree` is set to `true`.
     * <p>
     * The parameter `compartmentIdInSubtree` applies when you perform ListAdhocQueries on the
     * `compartmentId` passed and when it is set to true, the entire hierarchy of compartments can be returned.
     * To get a full list of all compartments and subcompartments in the tenancy (root compartment),
     * set the parameter `compartmentIdInSubtree` to true and `accessLevel` to ACCESSIBLE.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation will not retry by default, users can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to enable retries for it.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/cloudguard/ListDataSourcesExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use ListDataSources API.
     */
    ListDataSourcesResponse listDataSources(ListDataSourcesRequest request);

    /**
     * Returns a list of detector rules (DetectorRule resources) for a detector recipe (DetectorRecipe resource), identified by detectorRecipeId.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation will not retry by default, users can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to enable retries for it.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/cloudguard/ListDetectorRecipeDetectorRulesExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use ListDetectorRecipeDetectorRules API.
     */
    ListDetectorRecipeDetectorRulesResponse listDetectorRecipeDetectorRules(
            ListDetectorRecipeDetectorRulesRequest request);

    /**
     * Returns a list of all detector recipes (DetectorRecipe resources) in a compartment, identified by compartmentId.
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
     * This operation will not retry by default, users can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to enable retries for it.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/cloudguard/ListDetectorRecipesExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use ListDetectorRecipes API.
     */
    ListDetectorRecipesResponse listDetectorRecipes(ListDetectorRecipesRequest request);

    /**
     * Returns a list of detector rules for the DetectorRecipe resource identified by detectorId.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation will not retry by default, users can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to enable retries for it.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/cloudguard/ListDetectorRulesExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use ListDetectorRules API.
     */
    ListDetectorRulesResponse listDetectorRules(ListDetectorRulesRequest request);

    /**
     * Returns a detector catalog (DetectorCollection resource) with a list of DetectorSummary resources.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation will not retry by default, users can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to enable retries for it.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/cloudguard/ListDetectorsExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use ListDetectors API.
     */
    ListDetectorsResponse listDetectors(ListDetectorsRequest request);

    /**
     * Returns a list of impacted resources for a problem identified by problemId.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation will not retry by default, users can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to enable retries for it.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/cloudguard/ListImpactedResourcesExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use ListImpactedResources API.
     */
    ListImpactedResourcesResponse listImpactedResources(ListImpactedResourcesRequest request);

    /**
     * Returns all managed list types (listType parameter) that Cloud Guard supports.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation will not retry by default, users can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to enable retries for it.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/cloudguard/ListManagedListTypesExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use ListManagedListTypes API.
     */
    ListManagedListTypesResponse listManagedListTypes(ListManagedListTypesRequest request);

    /**
     * Returns a list of all ManagedList resources in a compartment, identified by compartmentId.
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
     * This operation will not retry by default, users can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to enable retries for it.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/cloudguard/ListManagedListsExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use ListManagedLists API.
     */
    ListManagedListsResponse listManagedLists(ListManagedListsRequest request);

    /**
     * Returns the list of global policy statements (policy attributes) needed to fully enable Cloud Guard.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation will not retry by default, users can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to enable retries for it.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/cloudguard/ListPoliciesExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use ListPolicies API.
     */
    ListPoliciesResponse listPolicies(ListPoliciesRequest request);

    /**
     * Returns a list of endpoints associated with a problem, identified by problemId.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation will not retry by default, users can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to enable retries for it.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/cloudguard/ListProblemEndpointsExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use ListProblemEndpoints API.
     */
    ListProblemEndpointsResponse listProblemEndpoints(ListProblemEndpointsRequest request);

    /**
     * Returns a list of entities for a problem.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation will not retry by default, users can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to enable retries for it.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/cloudguard/ListProblemEntitiesExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use ListProblemEntities API.
     */
    ListProblemEntitiesResponse listProblemEntities(ListProblemEntitiesRequest request);

    /**
     * Returns a list of actions taken on a problem.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation will not retry by default, users can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to enable retries for it.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/cloudguard/ListProblemHistoriesExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use ListProblemHistories API.
     */
    ListProblemHistoriesResponse listProblemHistories(ListProblemHistoriesRequest request);

    /**
     * Returns a list of all Problems identified by Cloud Guard which are currently in the database and meet the filtering criteria.
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
     * This operation will not retry by default, users can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to enable retries for it.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/cloudguard/ListProblemsExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use ListProblems API.
     */
    ListProblemsResponse listProblems(ListProblemsRequest request);

    /**
     * Returns a list of recommendations (RecommendationSummaryCollection resource with a page of
     * RecommendationSummary resources) for a specified compartment OCID.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation will not retry by default, users can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to enable retries for it.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/cloudguard/ListRecommendationsExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use ListRecommendations API.
     */
    ListRecommendationsResponse listRecommendations(ListRecommendationsRequest request);

    /**
     * Returns the list of open ports associated with the resourceId where resource is an instance
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation will not retry by default, users can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to enable retries for it.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/cloudguard/ListResourcePortsExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use ListResourcePorts API.
     */
    ListResourcePortsResponse listResourcePorts(ListResourcePortsRequest request);

    /**
     * Returns a list of endpoints (ResourceProfileEndpointCollection resource with a page of
     * ResourceProfileEndpointSummary resources) for a resource profile identified by resourceProfileId.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation will not retry by default, users can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to enable retries for it.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/cloudguard/ListResourceProfileEndpointsExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use ListResourceProfileEndpoints API.
     */
    ListResourceProfileEndpointsResponse listResourceProfileEndpoints(
            ListResourceProfileEndpointsRequest request);

    /**
     * Returns a list of impacted resources (ResourceProfileImpactedResourceCollection resource
     * with a page of ResourceProfileImpactedResourceSummary resources) for a resource profile
     * identified by resourceProfileId.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation will not retry by default, users can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to enable retries for it.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/cloudguard/ListResourceProfileImpactedResourcesExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use ListResourceProfileImpactedResources API.
     */
    ListResourceProfileImpactedResourcesResponse listResourceProfileImpactedResources(
            ListResourceProfileImpactedResourcesRequest request);

    /**
     * Returns a list of all resource profile summaries (ResourceProfileCollection resource with a page of
     * ResourceProfileSummary resources) for a compartment, identified by compartmentId and filtered as specified.
     * <p>
     * The ListResourceProfiles operation returns only the resource profiles in `compartmentId` passed.
     * The parameter `accessLevel` specifies whether to return only those compartments for which the
     * requestor has INSPECT permissions on at least one resource directly
     * or indirectly (ACCESSIBLE) (the resource can be in a subcompartment) or to return Not Authorized if
     * Principal doesn't have access to even one of the child compartments. This is valid only when
     * `compartmentIdInSubtree` is set to `true`.
     * <p>
     * The parameter `compartmentIdInSubtree` applies when you perform ListResourceProfiles on the
     * `compartmentId` passed and when it is set to true, the entire hierarchy of compartments can be returned.
     * To get a full list of all compartments and subcompartments in the tenancy (root compartment),
     * set the parameter `compartmentIdInSubtree` to true and `accessLevel` to ACCESSIBLE.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation will not retry by default, users can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to enable retries for it.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/cloudguard/ListResourceProfilesExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use ListResourceProfiles API.
     */
    ListResourceProfilesResponse listResourceProfiles(ListResourceProfilesRequest request);

    /**
     * Returns a single ResourceTypeCollection resource, containing a list of resource types,
     * identified by parameters specified.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation will not retry by default, users can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to enable retries for it.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/cloudguard/ListResourceTypesExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use ListResourceTypes API.
     */
    ListResourceTypesResponse listResourceTypes(ListResourceTypesRequest request);

    /**
     * Returns the list of vulnerabilities associated with the resourceId where resource is an instance
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation will not retry by default, users can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to enable retries for it.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/cloudguard/ListResourceVulnerabilitiesExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use ListResourceVulnerabilities API.
     */
    ListResourceVulnerabilitiesResponse listResourceVulnerabilities(
            ListResourceVulnerabilitiesRequest request);

    /**
     * Returns a list of all resources in a compartment
     * <p>
     * The ListResources operation returns only the resources in `compartmentId` passed.
     * The list does not include any subcompartments of the compartmentId passed.
     * <p>
     * The parameter `accessLevel` specifies whether to return only those compartments for which the
     * requestor has INSPECT permissions on at least one resource directly
     * or indirectly (ACCESSIBLE) (the resource can be in a subcompartment) or to return Not Authorized if
     * Principal doesn't have access to even one of the child compartments. This is valid only when
     * `compartmentIdInSubtree` is set to `true`.
     * <p>
     * The parameter `compartmentIdInSubtree` applies when you perform ListResources on the
     * `compartmentId` passed and when it is set to true, the entire hierarchy of compartments can be returned.
     * To get a full list of all compartments and subcompartments in the tenancy (root compartment),
     * set the parameter `compartmentIdInSubtree` to true and `accessLevel` to ACCESSIBLE.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation will not retry by default, users can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to enable retries for it.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/cloudguard/ListResourcesExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use ListResources API.
     */
    ListResourcesResponse listResources(ListResourcesRequest request);

    /**
     * Returns a list of responder activities for a problem, identified by problemId, in a
     * ResponderActivityCollection resource, with a page of ResponderActivitySummary resources.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation will not retry by default, users can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to enable retries for it.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/cloudguard/ListResponderActivitiesExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use ListResponderActivities API.
     */
    ListResponderActivitiesResponse listResponderActivities(ListResponderActivitiesRequest request);

    /**
     * Returns a list of responder executions. A responder execution is an entity that tracks
     * the collective execution of multiple responder rule executions for a given problem.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation will not retry by default, users can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to enable retries for it.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/cloudguard/ListResponderExecutionsExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use ListResponderExecutions API.
     */
    ListResponderExecutionsResponse listResponderExecutions(ListResponderExecutionsRequest request);

    /**
     * Returns a list of responder rules (ResponderRule resources in a
     * responderRecipeResponderRuleCollection resource, with page of ResponderRuleSummary resources),
     * for a responder recipe (ResponderRecipe resource), identified by responderRecipeId.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation will not retry by default, users can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to enable retries for it.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/cloudguard/ListResponderRecipeResponderRulesExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use ListResponderRecipeResponderRules API.
     */
    ListResponderRecipeResponderRulesResponse listResponderRecipeResponderRules(
            ListResponderRecipeResponderRulesRequest request);

    /**
     * Returns a list (ResponderRecipeCollection resource, with a page of ResponderRecipeSummary resources)
     * of all responder recipes (RespponderRecipe resources) in a compartment, identified by compartmentId.
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
     * This operation will not retry by default, users can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to enable retries for it.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/cloudguard/ListResponderRecipesExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use ListResponderRecipes API.
     */
    ListResponderRecipesResponse listResponderRecipes(ListResponderRecipesRequest request);

    /**
     * Returns a list of responder rules for the ResponderRecipe resource
     * identified by responderId. The list is contained in a ResponderRuleCollection
     * resource with a page of ResponderRuleSummary resources.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation will not retry by default, users can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to enable retries for it.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/cloudguard/ListResponderRulesExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use ListResponderRules API.
     */
    ListResponderRulesResponse listResponderRules(ListResponderRulesRequest request);

    /**
     * Returns a list of saved queries run in a tenancy.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation will not retry by default, users can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to enable retries for it.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/cloudguard/ListSavedQueriesExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use ListSavedQueries API.
     */
    ListSavedQueriesResponse listSavedQueries(ListSavedQueriesRequest request);

    /**
     * Returns a list of security zone policies (SecurityPolicySummary resources),
     * identified by compartmentId.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation will not retry by default, users can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to enable retries for it.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/cloudguard/ListSecurityPoliciesExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use ListSecurityPolicies API.
     */
    ListSecurityPoliciesResponse listSecurityPolicies(ListSecurityPoliciesRequest request);

    /**
     * Returns a list of security zone recipes (SecurityRecipeSummary resources) in a
     * compartment, identified by compartmentId.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation will not retry by default, users can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to enable retries for it.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/cloudguard/ListSecurityRecipesExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use ListSecurityRecipes API.
     */
    ListSecurityRecipesResponse listSecurityRecipes(ListSecurityRecipesRequest request);

    /**
     * Returns a list of security zones (SecurityZone resources) in a compartment identified by
     * compartmentId. List is contained in a page of SecurityZoneSummary resources.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation will not retry by default, users can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to enable retries for it.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/cloudguard/ListSecurityZonesExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use ListSecurityZones API.
     */
    ListSecurityZonesResponse listSecurityZones(ListSecurityZonesRequest request);

    /**
     * Returns sighting endpoints details in a
     * SightingEndpointsCollection resource
     * with a page of SightingEndpointSummary resources.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation will not retry by default, users can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to enable retries for it.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/cloudguard/ListSightingEndpointsExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use ListSightingEndpoints API.
     */
    ListSightingEndpointsResponse listSightingEndpoints(ListSightingEndpointsRequest request);

    /**
     * Returns a list of impacted resources for a sighting, identified by sightingId, in a
     * SightingImpactedResourceCollection resource with a page of SightingImpactedResourceSummary resources.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation will not retry by default, users can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to enable retries for it.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/cloudguard/ListSightingImpactedResourcesExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use ListSightingImpactedResources API.
     */
    ListSightingImpactedResourcesResponse listSightingImpactedResources(
            ListSightingImpactedResourcesRequest request);

    /**
     * For the parameters passed, returns a list of sightings
     * (SightingCollection resource) with a page of SightingSummary resources.
     * <p>
     * The parameter `accessLevel` specifies whether to return only those compartments for which the
     * requestor has INSPECT permissions on at least one resource directly
     * or indirectly (ACCESSIBLE) (the resource can be in a subcompartment) or to return Not Authorized if
     * Principal doesn't have access to even one of the child compartments. This is valid only when
     * `compartmentIdInSubtree` is set to `true`.
     * <p>
     * The parameter `compartmentIdInSubtree` applies when you perform ListSightings on the
     * `compartmentId` passed and when it is set to true, the entire hierarchy of compartments can be returned.
     * To get a full list of all compartments and subcompartments in the tenancy (root compartment),
     * set the parameter `compartmentIdInSubtree` to true and `accessLevel` to ACCESSIBLE.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation will not retry by default, users can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to enable retries for it.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/cloudguard/ListSightingsExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use ListSightings API.
     */
    ListSightingsResponse listSightings(ListSightingsRequest request);

    /**
     * Returns a list of TacticSummary resources for a compartment, identified by compartmentId.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation will not retry by default, users can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to enable retries for it.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/cloudguard/ListTacticsExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use ListTactics API.
     */
    ListTacticsResponse listTactics(ListTacticsRequest request);

    /**
     * Returns a list of DetectorRule associated with DetectorRecipe within a Target.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation will not retry by default, users can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to enable retries for it.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/cloudguard/ListTargetDetectorRecipeDetectorRulesExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use ListTargetDetectorRecipeDetectorRules API.
     */
    ListTargetDetectorRecipeDetectorRulesResponse listTargetDetectorRecipeDetectorRules(
            ListTargetDetectorRecipeDetectorRulesRequest request);

    /**
     * Returns a list of all target detector recipes (TargetDetectorRecipe resources)
     * associated with a target (Target resource), identified by targetId. The list is contained
     * in a TargetDetectorRecipeCollection resource with page of TargetDetectorRecipeSummary resources.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation will not retry by default, users can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to enable retries for it.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/cloudguard/ListTargetDetectorRecipesExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use ListTargetDetectorRecipes API.
     */
    ListTargetDetectorRecipesResponse listTargetDetectorRecipes(
            ListTargetDetectorRecipesRequest request);

    /**
     * Returns a list of responder rules (ResponderRule resources) associated with a
     * responder recipe (ResponderRecipe resource) attached to a Target.
     * List is returned in a TargetResponderRecipeResponderRuleCollection resource
     * with page of TargetResponderRecipeResponderRuleSummary resources.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation will not retry by default, users can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to enable retries for it.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/cloudguard/ListTargetResponderRecipeResponderRulesExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use ListTargetResponderRecipeResponderRules API.
     */
    ListTargetResponderRecipeResponderRulesResponse listTargetResponderRecipeResponderRules(
            ListTargetResponderRecipeResponderRulesRequest request);

    /**
     * Returns a list of summary information for all responder recipes
     * (TargetResponderRecipeCollection resource, with a page of TargetResponderRecipeSummary resources)
     * attached to a target identified by targetId, located in a compartment identified by compartmentId.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation will not retry by default, users can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to enable retries for it.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/cloudguard/ListTargetResponderRecipesExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use ListTargetResponderRecipes API.
     */
    ListTargetResponderRecipesResponse listTargetResponderRecipes(
            ListTargetResponderRecipesRequest request);

    /**
     * Returns a list of targets (TargetCollection resource with page of TargetSummary
     * resources) for the target identified by compartmentId. By default, only the target
     * associated with the compartment is returned. Setting compartmentIdInSubtree to true
     * returns the entire hierarchy of targets in subcompartments.
     * <p>
     * The parameter `accessLevel` specifies whether to return only those compartments for which the
     * requestor has INSPECT permissions on at least one resource directly
     * or indirectly (ACCESSIBLE) (the resource can be in a subcompartment) or to return Not Authorized if
     * Principal doesn't have access to even one of the child compartments. This is valid only when
     * `compartmentIdInSubtree` is set to `true`.
     * <p>
     * The parameter `compartmentIdInSubtree` applies when you perform ListTargets on the
     * `compartmentId` passed and when it is set to true, the entire hierarchy of compartments can be returned.
     * To get a full list of all targets in compartments and subcompartments in the tenancy (root compartment),
     * set the parameter `compartmentIdInSubtree` to true and `accessLevel` to ACCESSIBLE.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation will not retry by default, users can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to enable retries for it.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/cloudguard/ListTargetsExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use ListTargets API.
     */
    ListTargetsResponse listTargets(ListTargetsRequest request);

    /**
     * Returns a list of techniques associated with detector rules.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation will not retry by default, users can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to enable retries for it.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/cloudguard/ListTechniquesExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use ListTechniques API.
     */
    ListTechniquesResponse listTechniques(ListTechniquesRequest request);

    /**
     * Returns a list of WLP agents in a compartment.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation will not retry by default, users can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to enable retries for it.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/cloudguard/ListWlpAgentsExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use ListWlpAgents API.
     */
    ListWlpAgentsResponse listWlpAgents(ListWlpAgentsRequest request);

    /**
     * Returns a list of errors for a work request
     * identified by workRequestId.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation will not retry by default, users can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to enable retries for it.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/cloudguard/ListWorkRequestErrorsExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use ListWorkRequestErrors API.
     */
    ListWorkRequestErrorsResponse listWorkRequestErrors(ListWorkRequestErrorsRequest request);

    /**
     * Returns a paginated list (WorkRequestLogEntryCollection resource)
     * of log entries for a request, identified by workRequestId.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation will not retry by default, users can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to enable retries for it.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/cloudguard/ListWorkRequestLogsExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use ListWorkRequestLogs API.
     */
    ListWorkRequestLogsResponse listWorkRequestLogs(ListWorkRequestLogsRequest request);

    /**
     * Returns a list of work requests (WorkRequestSummaryCollection resource),
     * in a compartment identified by compartmentId.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation will not retry by default, users can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to enable retries for it.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/cloudguard/ListWorkRequestsExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use ListWorkRequests API.
     */
    ListWorkRequestsResponse listWorkRequests(ListWorkRequestsRequest request);

    /**
     * Removes a compartment from a security zone (SecurityZone resource), identified by securityZoneId.
     * Pass compartmentId of compartment to remove through a RemoveCompartmentDetails resource. When you remove a
     * subcompartment from a security zone, it no longer enforces security zone policies on the resources in the
     * subcompartment. You can't remove the primary compartment that was used to create the security zone.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation will not retry by default, users can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to enable retries for it.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/cloudguard/RemoveCompartmentExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use RemoveCompartment API.
     */
    RemoveCompartmentResponse removeCompartment(RemoveCompartmentRequest request);

    /**
     * Returns a page of RiskScoreAggregation resources for a compartment,
     * identified by compartmentId.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation will not retry by default, users can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to enable retries for it.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/cloudguard/RequestRiskScoresExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use RequestRiskScores API.
     */
    RequestRiskScoresResponse requestRiskScores(RequestRiskScoresRequest request);

    /**
     * Returns a page of SecurityScoreTrendAggregation resources. These measure the number
     * of resources examined across all regions and compare it with the number of problems detected.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation will not retry by default, users can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to enable retries for it.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/cloudguard/RequestSecurityScoreSummarizedTrendExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use RequestSecurityScoreSummarizedTrend API.
     */
    RequestSecurityScoreSummarizedTrendResponse requestSecurityScoreSummarizedTrend(
            RequestSecurityScoreSummarizedTrendRequest request);

    /**
     * Returns a page of SecurityScoreAggregation resources. These measure the number
     * of resources examined across all regions and compare it with the number of problems detected.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation will not retry by default, users can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to enable retries for it.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/cloudguard/RequestSecurityScoresExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use RequestSecurityScores API.
     */
    RequestSecurityScoresResponse requestSecurityScores(RequestSecurityScoresRequest request);

    /**
     * Returns the summary of problems generated by OCI Activity Detector rules, identified by parameters specified.
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
     * This operation will not retry by default, users can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to enable retries for it.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/cloudguard/RequestSummarizedActivityProblemsExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use RequestSummarizedActivityProblems API.
     */
    RequestSummarizedActivityProblemsResponse requestSummarizedActivityProblems(
            RequestSummarizedActivityProblemsRequest request);

    /**
     * Returns the number of problems matching the key-value pairs in dimensionMap.
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
     * This operation will not retry by default, users can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to enable retries for it.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/cloudguard/RequestSummarizedProblemsExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use RequestSummarizedProblems API.
     */
    RequestSummarizedProblemsResponse requestSummarizedProblems(
            RequestSummarizedProblemsRequest request);

    /**
     * Returns the number of responder executions, identified by parameters specified, in a page of
     * ResponderExecutionAggregation resources.
     * <p>
     * Setting accessLevel to ACCESSIBLE returns only those compartments for which the user has INSPECT permissions,
     * directly or indirectly (permissions can be on a resource in a subcompartment). \u201CNot Authorized\u201D is returned
     * if user doesn't have access to at least one of the child compartments. When accessLevel is set to RESTRICTED,
     * permissions are checked and no partial results are displayed. This is valid only when compartmentIdInSubtree is set to true.
     * <p>
     * Setting accessLevel to ACCESSIBLE returns only those compartments for which the user has INSPECT permissions, directly or
     * indirectly (permissions can be on a resource in a subcompartment). \u201CNot Authorized\u201D is returned if user doesn't have
     * access to at least one of the child compartments. When accessLevel is set to RESTRICTED, permissions are checked
     * and no partial results are displayed. This is valid only when compartmentIdInSubtree is set to true.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation will not retry by default, users can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to enable retries for it.
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
     * This operation will not retry by default, users can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to enable retries for it.
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
     * This operation will not retry by default, users can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to enable retries for it.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/cloudguard/RequestSummarizedSecurityScoresExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use RequestSummarizedSecurityScores API.
     */
    RequestSummarizedSecurityScoresResponse requestSummarizedSecurityScores(
            RequestSummarizedSecurityScoresRequest request);

    /**
     * Returns a list of resource profile risk score aggregation summaries
     * (ResourceProfileRiskScoreAggregationSummaryCollection resource with a page of
     * ResourceProfileRiskScoreAggregationSummary resources) for a specified compartment.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation will not retry by default, users can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to enable retries for it.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/cloudguard/RequestSummarizedTopTrendResourceProfileRiskScoresExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use RequestSummarizedTopTrendResourceProfileRiskScores API.
     */
    RequestSummarizedTopTrendResourceProfileRiskScoresResponse
            requestSummarizedTopTrendResourceProfileRiskScores(
                    RequestSummarizedTopTrendResourceProfileRiskScoresRequest request);

    /**
     * Returns a ProblemTrendAggregationCollection resource for a compartment, identified by compartmentId, for the specified time period. The ProblemTrendAggregationCollection resource contains a list of ProblemTrendAggregation resources.
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
     * This operation will not retry by default, users can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to enable retries for it.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/cloudguard/RequestSummarizedTrendProblemsExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use RequestSummarizedTrendProblems API.
     */
    RequestSummarizedTrendProblemsResponse requestSummarizedTrendProblems(
            RequestSummarizedTrendProblemsRequest request);

    /**
     * Returns a summary of risk score trends in a  ResourceRiskScoreAggregationCollection resource,
     * with a page of ResourceRiskScoreAggregation resources, filtered by parameters that you specify
     * in a RequestSummarizedTrendResourceRiskScoresDetailsresource.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation will not retry by default, users can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to enable retries for it.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/cloudguard/RequestSummarizedTrendResourceRiskScoresExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use RequestSummarizedTrendResourceRiskScores API.
     */
    RequestSummarizedTrendResourceRiskScoresResponse requestSummarizedTrendResourceRiskScores(
            RequestSummarizedTrendResourceRiskScoresRequest request);

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
     * This operation will not retry by default, users can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to enable retries for it.
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
     * This operation will not retry by default, users can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to enable retries for it.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/cloudguard/RequestSummarizedTrendSecurityScoresExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use RequestSummarizedTrendSecurityScores API.
     */
    RequestSummarizedTrendSecurityScoresResponse requestSummarizedTrendSecurityScores(
            RequestSummarizedTrendSecurityScoresRequest request);

    /**
     * Skips the execution for a bulk of responder executions.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation will not retry by default, users can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to enable retries for it.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/cloudguard/SkipBulkResponderExecutionExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use SkipBulkResponderExecution API.
     */
    SkipBulkResponderExecutionResponse skipBulkResponderExecution(
            SkipBulkResponderExecutionRequest request);

    /**
     * Skips the execution of the responder execution. When provided, If-Match is checked against etag values of the resource.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation will not retry by default, users can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to enable retries for it.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/cloudguard/SkipResponderExecutionExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use SkipResponderExecution API.
     */
    SkipResponderExecutionResponse skipResponderExecution(SkipResponderExecutionRequest request);

    /**
     * Sends the problem identified by problemId to the responder engine, to be processed by rule
     * that\u2019s identified by responderRuleId, in the TriggerResponderDetails resource that\u2019s passed.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation will not retry by default, users can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to enable retries for it.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/cloudguard/TriggerResponderExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use TriggerResponder API.
     */
    TriggerResponderResponse triggerResponder(TriggerResponderRequest request);

    /**
     * Changes the status for all problems listed in the problemIds array, passed through the UpdateBulkProblemStatusDetails resource, from the current status to the status set in UpdateBulkProblemStatusDetails.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation will not retry by default, users can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to enable retries for it.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/cloudguard/UpdateBulkProblemStatusExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use UpdateBulkProblemStatus API.
     */
    UpdateBulkProblemStatusResponse updateBulkProblemStatus(UpdateBulkProblemStatusRequest request);

    /**
     * Updates configuration details for a Cloud Guard tenancy, identified by root compartment OCID.
     * The reporting region cannot be updated once created.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation will not retry by default, users can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to enable retries for it.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/cloudguard/UpdateConfigurationExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use UpdateConfiguration API.
     */
    UpdateConfigurationResponse updateConfiguration(UpdateConfigurationRequest request);

    /**
     * Updates a data mask rule (DataMaskRule resource) identified by dataMaskRuleId.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation will not retry by default, users can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to enable retries for it.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/cloudguard/UpdateDataMaskRuleExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use UpdateDataMaskRule API.
     */
    UpdateDataMaskRuleResponse updateDataMaskRule(UpdateDataMaskRuleRequest request);

    /**
     * Updates a data source (DataSource resource) identified by dataSourceId,
     * using values passed in an UpdateDataSourceDetails resource.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation will not retry by default, users can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to enable retries for it.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/cloudguard/UpdateDataSourceExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use UpdateDataSource API.
     */
    UpdateDataSourceResponse updateDataSource(UpdateDataSourceRequest request);

    /**
     * Updates a detector recipe (DetectorRecipe resource) identified by detectorRecipeId.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation will not retry by default, users can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to enable retries for it.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/cloudguard/UpdateDetectorRecipeExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use UpdateDetectorRecipe API.
     */
    UpdateDetectorRecipeResponse updateDetectorRecipe(UpdateDetectorRecipeRequest request);

    /**
     * Updates a detector rule (DetectorRule resource) identified by detectorRuleId.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation will not retry by default, users can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to enable retries for it.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/cloudguard/UpdateDetectorRecipeDetectorRuleExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use UpdateDetectorRecipeDetectorRule API.
     */
    UpdateDetectorRecipeDetectorRuleResponse updateDetectorRecipeDetectorRule(
            UpdateDetectorRecipeDetectorRuleRequest request);

    /**
     * Updates a ManagedList resource, identified by managedList.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation will not retry by default, users can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to enable retries for it.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/cloudguard/UpdateManagedListExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use UpdateManagedList API.
     */
    UpdateManagedListResponse updateManagedList(UpdateManagedListRequest request);

    /**
     * Changes the current status of the problem, identified by problemId, to the status specified in the UpdateProblemStatusDetails resource that you pass.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation will not retry by default, users can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to enable retries for it.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/cloudguard/UpdateProblemStatusExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use UpdateProblemStatus API.
     */
    UpdateProblemStatusResponse updateProblemStatus(UpdateProblemStatusRequest request);

    /**
     * Updates a responder recipe (ResponderRecipe resource) identified by
     * responderRecipeId, passed in an UpdateResponderRecipeDetails resource.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation will not retry by default, users can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to enable retries for it.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/cloudguard/UpdateResponderRecipeExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use UpdateResponderRecipe API.
     */
    UpdateResponderRecipeResponse updateResponderRecipe(UpdateResponderRecipeRequest request);

    /**
     * Updates a responder rule (ResponderRule resource) identified by responderRuleId,
     * passed in a UpdateResponderRecipeResponderRuleDetails resource.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation will not retry by default, users can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to enable retries for it.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/cloudguard/UpdateResponderRecipeResponderRuleExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use UpdateResponderRecipeResponderRule API.
     */
    UpdateResponderRecipeResponderRuleResponse updateResponderRecipeResponderRule(
            UpdateResponderRecipeResponderRuleRequest request);

    /**
     * Updates a saved query identified by savedQueryId.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation will not retry by default, users can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to enable retries for it.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/cloudguard/UpdateSavedQueryExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use UpdateSavedQuery API.
     */
    UpdateSavedQueryResponse updateSavedQuery(UpdateSavedQueryRequest request);

    /**
     * Updates a security zone recipe (SecurityRecipe resource), identified by securityRecipeId,
     * using parameters passed in an UpdateSecurityRecipeDetails resource.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation will not retry by default, users can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to enable retries for it.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/cloudguard/UpdateSecurityRecipeExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use UpdateSecurityRecipe API.
     */
    UpdateSecurityRecipeResponse updateSecurityRecipe(UpdateSecurityRecipeRequest request);

    /**
     * Updates a security zone (SecurityZone resource) identified by securityZoneId.
     * Pass parameters through an UpdateSecurityZoneDetails resource.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation will not retry by default, users can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to enable retries for it.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/cloudguard/UpdateSecurityZoneExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use UpdateSecurityZone API.
     */
    UpdateSecurityZoneResponse updateSecurityZone(UpdateSecurityZoneRequest request);

    /**
     * Updates a target (Target resource) identified by targetId, using parameters
     * passed in an UpdateTargetDetails resource.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation will not retry by default, users can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to enable retries for it.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/cloudguard/UpdateTargetExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use UpdateTarget API.
     */
    UpdateTargetResponse updateTarget(UpdateTargetRequest request);

    /**
     * Updates a target detector recipe (TargtetDetectorRecipe resource) identified by
     * targetDetectorRecipeId, using parameters passed in an UpdateTargetDetectorRecipeDetails resource.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation will not retry by default, users can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to enable retries for it.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/cloudguard/UpdateTargetDetectorRecipeExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use UpdateTargetDetectorRecipe API.
     */
    UpdateTargetDetectorRecipeResponse updateTargetDetectorRecipe(
            UpdateTargetDetectorRecipeRequest request);

    /**
     * Updates the DetectorRule resource identified by targetDetectorRecipeId
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation will not retry by default, users can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to enable retries for it.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/cloudguard/UpdateTargetDetectorRecipeDetectorRuleExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use UpdateTargetDetectorRecipeDetectorRule API.
     */
    UpdateTargetDetectorRecipeDetectorRuleResponse updateTargetDetectorRecipeDetectorRule(
            UpdateTargetDetectorRecipeDetectorRuleRequest request);

    /**
     * Updates the target responder recipe (TargetResponderRecipe resource)
     * identified by targetResponderRecipeId, attached to a target identified
     * by targetId. Pass parameters for the update through an
     * UpdateTargetResponderRecipeDetails resource.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation will not retry by default, users can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to enable retries for it.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/cloudguard/UpdateTargetResponderRecipeExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use UpdateTargetResponderRecipe API.
     */
    UpdateTargetResponderRecipeResponse updateTargetResponderRecipe(
            UpdateTargetResponderRecipeRequest request);

    /**
     * Updates a responder rule (ResponderRule resource) identified by
     * responderRuleId, for a target responder recipe (TargetResponderRecipe resource)
     * identified by targetResponderRecipeId, for a target (Target resource)
     * identified by targetId. Parameters for the update are passed through an
     * UpdateTargetResponderRecipeResponderRuleDetails resource.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation will not retry by default, users can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to enable retries for it.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/cloudguard/UpdateTargetResponderRecipeResponderRuleExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use UpdateTargetResponderRecipeResponderRule API.
     */
    UpdateTargetResponderRecipeResponderRuleResponse updateTargetResponderRecipeResponderRule(
            UpdateTargetResponderRecipeResponderRuleRequest request);

    /**
     * Updates and renews the certificate for an on-premise WLP agent identified by wlpAgentId.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation will not retry by default, users can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to enable retries for it.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/cloudguard/UpdateWlpAgentExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use UpdateWlpAgent API.
     */
    UpdateWlpAgentResponse updateWlpAgent(UpdateWlpAgentRequest request);

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

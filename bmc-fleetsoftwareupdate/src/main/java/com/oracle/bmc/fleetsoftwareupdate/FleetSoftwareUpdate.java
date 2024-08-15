/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.fleetsoftwareupdate;

import com.oracle.bmc.fleetsoftwareupdate.requests.*;
import com.oracle.bmc.fleetsoftwareupdate.responses.*;

/**
 * Use the Exadata Fleet Update service to patch large collections of components directly,
 * as a single entity, orchestrating the maintenance actions to update all chosen components in the stack in a single cycle.
 *
 * This service client uses CircuitBreakerUtils.DEFAULT_CIRCUIT_BREAKER for all the operations by default if no circuit breaker configuration is defined by the user.
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20220528")
public interface FleetSoftwareUpdate extends AutoCloseable {

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
     * Aborts Exadata Fleet Update Discovery in progress.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation uses RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is provided.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/fleetsoftwareupdate/AbortFsuDiscoveryExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use AbortFsuDiscovery API.
     */
    AbortFsuDiscoveryResponse abortFsuDiscovery(AbortFsuDiscoveryRequest request);

    /**
     * Adds targets to an existing Exadata Fleet Update Collection.
     * Targets that are already part of a different Collection with an active Fleet Software Update Cycle cannot be added.
     * This operation can only be performed on Collections that do not have an Action executing under an active Fleet Software Update Cycle.
     * Additionally, during an active Fleet Software Update Cycle, targets can be added only prior to executing an Apply Action. This will require running a new Stage Action for the active Cycle.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation uses RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is provided.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/fleetsoftwareupdate/AddFsuCollectionTargetsExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use AddFsuCollectionTargets API.
     */
    AddFsuCollectionTargetsResponse addFsuCollectionTargets(AddFsuCollectionTargetsRequest request);

    /**
     * Cancels a scheduled Action. Only applicable for Actions that have not started executing.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation uses RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is provided.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/fleetsoftwareupdate/CancelFsuActionExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use CancelFsuAction API.
     */
    CancelFsuActionResponse cancelFsuAction(CancelFsuActionRequest request);

    /**
     * Moves a Exadata Fleet Update Action resource from one compartment identifier to another.
     * When provided, If-Match is checked against ETag values of the resource.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation uses RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is provided.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/fleetsoftwareupdate/ChangeFsuActionCompartmentExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use ChangeFsuActionCompartment API.
     */
    ChangeFsuActionCompartmentResponse changeFsuActionCompartment(
            ChangeFsuActionCompartmentRequest request);

    /**
     * Moves a Exadata Fleet Update Collection resource from one compartment identifier to another.
     * When provided, If-Match is checked against ETag values of the resource.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation uses RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is provided.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/fleetsoftwareupdate/ChangeFsuCollectionCompartmentExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use ChangeFsuCollectionCompartment API.
     */
    ChangeFsuCollectionCompartmentResponse changeFsuCollectionCompartment(
            ChangeFsuCollectionCompartmentRequest request);

    /**
     * Moves a Exadata Fleet Update Cycle resource from one compartment identifier to another.
     * When provided, If-Match is checked against ETag values of the resource.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation uses RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is provided.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/fleetsoftwareupdate/ChangeFsuCycleCompartmentExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use ChangeFsuCycleCompartment API.
     */
    ChangeFsuCycleCompartmentResponse changeFsuCycleCompartment(
            ChangeFsuCycleCompartmentRequest request);

    /**
     * Moves a Exadata Fleet Update Discovery resource from one compartment identifier to another.
     * When provided, If-Match is checked against ETag values of the resource.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation uses RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is provided.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/fleetsoftwareupdate/ChangeFsuDiscoveryCompartmentExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use ChangeFsuDiscoveryCompartment API.
     */
    ChangeFsuDiscoveryCompartmentResponse changeFsuDiscoveryCompartment(
            ChangeFsuDiscoveryCompartmentRequest request);

    /**
     * Clones existing Exadata Fleet Update Cycle details into a new Exadata Fleet Update Cycle resource.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation uses RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is provided.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/fleetsoftwareupdate/CloneFsuCycleExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use CloneFsuCycle API.
     */
    CloneFsuCycleResponse cloneFsuCycle(CloneFsuCycleRequest request);

    /**
     * Creates a new Exadata Fleet Update Action.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation uses RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is provided.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/fleetsoftwareupdate/CreateFsuActionExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use CreateFsuAction API.
     */
    CreateFsuActionResponse createFsuAction(CreateFsuActionRequest request);

    /**
     * Creates a new Exadata Fleet Update Collection.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation uses RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is provided.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/fleetsoftwareupdate/CreateFsuCollectionExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use CreateFsuCollection API.
     */
    CreateFsuCollectionResponse createFsuCollection(CreateFsuCollectionRequest request);

    /**
     * Creates a new Exadata Fleet Update Cycle.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation uses RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is provided.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/fleetsoftwareupdate/CreateFsuCycleExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use CreateFsuCycle API.
     */
    CreateFsuCycleResponse createFsuCycle(CreateFsuCycleRequest request);

    /**
     * Creates a new Exadata Fleet Update Discovery.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation uses RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is provided.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/fleetsoftwareupdate/CreateFsuDiscoveryExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use CreateFsuDiscovery API.
     */
    CreateFsuDiscoveryResponse createFsuDiscovery(CreateFsuDiscoveryRequest request);

    /**
     * Deletes a Exadata Fleet Update Action resource by identifier.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation uses RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is provided.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/fleetsoftwareupdate/DeleteFsuActionExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use DeleteFsuAction API.
     */
    DeleteFsuActionResponse deleteFsuAction(DeleteFsuActionRequest request);

    /**
     * Deletes a Exadata Fleet Update Collection resource by identifier.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation uses RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is provided.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/fleetsoftwareupdate/DeleteFsuCollectionExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use DeleteFsuCollection API.
     */
    DeleteFsuCollectionResponse deleteFsuCollection(DeleteFsuCollectionRequest request);

    /**
     * Removes a target from an existing Exadata Fleet Update Collection.
     * This operation can only be performed on Collections that do not have an Action executing under an active Fleet Software Update Cycle.
     * Additionally, during an active Fleet Software Update Cycle, a target can be removed only prior to executing an Apply Action.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation uses RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is provided.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/fleetsoftwareupdate/DeleteFsuCollectionTargetExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use DeleteFsuCollectionTarget API.
     */
    DeleteFsuCollectionTargetResponse deleteFsuCollectionTarget(
            DeleteFsuCollectionTargetRequest request);

    /**
     * Deletes a Exadata Fleet Update Cycle resource by identifier.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation uses RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is provided.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/fleetsoftwareupdate/DeleteFsuCycleExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use DeleteFsuCycle API.
     */
    DeleteFsuCycleResponse deleteFsuCycle(DeleteFsuCycleRequest request);

    /**
     * Deletes a Exadata Fleet Update Discovery resource by identifier.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation uses RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is provided.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/fleetsoftwareupdate/DeleteFsuDiscoveryExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use DeleteFsuDiscovery API.
     */
    DeleteFsuDiscoveryResponse deleteFsuDiscovery(DeleteFsuDiscoveryRequest request);

    /**
     * Deletes the Exadata Fleet Update Job resource by identifier.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation uses RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is provided.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/fleetsoftwareupdate/DeleteFsuJobExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use DeleteFsuJob API.
     */
    DeleteFsuJobResponse deleteFsuJob(DeleteFsuJobRequest request);

    /**
     * Gets a Exadata Fleet Update Action by identifier.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation uses RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is provided.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/fleetsoftwareupdate/GetFsuActionExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use GetFsuAction API.
     */
    GetFsuActionResponse getFsuAction(GetFsuActionRequest request);

    /**
     * Gets the Exadata Fleet Update Action Output content as a binary file (string).
     * This will only include the output from FAILED Exadata Fleet Update Jobs. No content in case there are no FAILED jobs.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation uses RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is provided.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/fleetsoftwareupdate/GetFsuActionOutputContentExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use GetFsuActionOutputContent API.
     */
    GetFsuActionOutputContentResponse getFsuActionOutputContent(
            GetFsuActionOutputContentRequest request);

    /**
     * Gets a Exadata Fleet Update Collection by identifier.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation uses RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is provided.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/fleetsoftwareupdate/GetFsuCollectionExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use GetFsuCollection API.
     */
    GetFsuCollectionResponse getFsuCollection(GetFsuCollectionRequest request);

    /**
     * Gets a Exadata Fleet Update Collection Target by identifier.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation uses RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is provided.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/fleetsoftwareupdate/GetFsuCollectionTargetExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use GetFsuCollectionTarget API.
     */
    GetFsuCollectionTargetResponse getFsuCollectionTarget(GetFsuCollectionTargetRequest request);

    /**
     * Gets a Exadata Fleet Update Cycle by identifier.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation uses RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is provided.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/fleetsoftwareupdate/GetFsuCycleExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use GetFsuCycle API.
     */
    GetFsuCycleResponse getFsuCycle(GetFsuCycleRequest request);

    /**
     * Gets a Exadata Fleet Update Discovery by identifier.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation uses RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is provided.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/fleetsoftwareupdate/GetFsuDiscoveryExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use GetFsuDiscovery API.
     */
    GetFsuDiscoveryResponse getFsuDiscovery(GetFsuDiscoveryRequest request);

    /**
     * Gets a Exadata Fleet Update Job by identifier.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation uses RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is provided.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/fleetsoftwareupdate/GetFsuJobExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use GetFsuJob API.
     */
    GetFsuJobResponse getFsuJob(GetFsuJobRequest request);

    /**
     * Get the Exadata Fleet Update Job Output content as a binary file (string).
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation uses RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is provided.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/fleetsoftwareupdate/GetFsuJobOutputContentExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use GetFsuJobOutputContent API.
     */
    GetFsuJobOutputContentResponse getFsuJobOutputContent(GetFsuJobOutputContentRequest request);

    /**
     * Gets the status of the work request with the specified ID.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation uses RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is provided.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/fleetsoftwareupdate/GetWorkRequestExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use GetWorkRequest API.
     */
    GetWorkRequestResponse getWorkRequest(GetWorkRequestRequest request);

    /**
     * Gets a list of all Exadata Fleet Update Actions in a compartment.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation uses RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is provided.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/fleetsoftwareupdate/ListFsuActionsExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use ListFsuActions API.
     */
    ListFsuActionsResponse listFsuActions(ListFsuActionsRequest request);

    /**
     * Gets a list of all Targets that are members of a specific Exadata Fleet Update Collection.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation uses RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is provided.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/fleetsoftwareupdate/ListFsuCollectionTargetsExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use ListFsuCollectionTargets API.
     */
    ListFsuCollectionTargetsResponse listFsuCollectionTargets(
            ListFsuCollectionTargetsRequest request);

    /**
     * Gets a list of all Exadata Fleet Update Collections in a compartment.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation uses RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is provided.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/fleetsoftwareupdate/ListFsuCollectionsExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use ListFsuCollections API.
     */
    ListFsuCollectionsResponse listFsuCollections(ListFsuCollectionsRequest request);

    /**
     * Gets a list of all Exadata Fleet Update Cycles in a compartment.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation uses RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is provided.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/fleetsoftwareupdate/ListFsuCyclesExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use ListFsuCycles API.
     */
    ListFsuCyclesResponse listFsuCycles(ListFsuCyclesRequest request);

    /**
     * Returns a list of Exadata Fleet Update Discoveries resources in the specified compartment.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation uses RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is provided.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/fleetsoftwareupdate/ListFsuDiscoveriesExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use ListFsuDiscoveries API.
     */
    ListFsuDiscoveriesResponse listFsuDiscoveries(ListFsuDiscoveriesRequest request);

    /**
     * Gets a list of all Targets in the results of a Exadata Fleet Update Discovery.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation uses RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is provided.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/fleetsoftwareupdate/ListFsuDiscoveryTargetsExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use ListFsuDiscoveryTargets API.
     */
    ListFsuDiscoveryTargetsResponse listFsuDiscoveryTargets(ListFsuDiscoveryTargetsRequest request);

    /**
     * Lists the Exadata Fleet Update Job Output messages, if any.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation uses RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is provided.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/fleetsoftwareupdate/ListFsuJobOutputsExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use ListFsuJobOutputs API.
     */
    ListFsuJobOutputsResponse listFsuJobOutputs(ListFsuJobOutputsRequest request);

    /**
     * Lists all the Exadata Fleet Update Jobs associated to the specified Exadata Fleet Update Action.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation uses RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is provided.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/fleetsoftwareupdate/ListFsuJobsExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use ListFsuJobs API.
     */
    ListFsuJobsResponse listFsuJobs(ListFsuJobsRequest request);

    /**
     * Returns a paginated list of errors for a specified Work Request..
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation uses RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is provided.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/fleetsoftwareupdate/ListWorkRequestErrorsExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use ListWorkRequestErrors API.
     */
    ListWorkRequestErrorsResponse listWorkRequestErrors(ListWorkRequestErrorsRequest request);

    /**
     * Returns a paginated list of logs for a specified Work Request.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation uses RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is provided.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/fleetsoftwareupdate/ListWorkRequestLogsExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use ListWorkRequestLogs API.
     */
    ListWorkRequestLogsResponse listWorkRequestLogs(ListWorkRequestLogsRequest request);

    /**
     * Lists the work requests in a compartment.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation uses RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is provided.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/fleetsoftwareupdate/ListWorkRequestsExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use ListWorkRequests API.
     */
    ListWorkRequestsResponse listWorkRequests(ListWorkRequestsRequest request);

    /**
     * Removes targets from an existing Exadata Fleet Update Collection.
     * This operation can only be performed on Collections that do not have an Action executing under an active Fleet Software Update Cycle.
     * Additionally, during an active Fleet Software Update Cycle, targets can be removed only prior to executing an Apply Action.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation uses RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is provided.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/fleetsoftwareupdate/RemoveFsuCollectionTargetsExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use RemoveFsuCollectionTargets API.
     */
    RemoveFsuCollectionTargetsResponse removeFsuCollectionTargets(
            RemoveFsuCollectionTargetsRequest request);

    /**
     * Resumes an Action that has batches of targets waiting to execute.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation uses RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is provided.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/fleetsoftwareupdate/ResumeFsuActionExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use ResumeFsuAction API.
     */
    ResumeFsuActionResponse resumeFsuAction(ResumeFsuActionRequest request);

    /**
     * Retry a failed Job, only while the current Action is being executed.
     * After the Action reaches a terminal state, a new Action of the same kind is required to retry on failed targets.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation uses RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is provided.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/fleetsoftwareupdate/RetryFsuJobExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use RetryFsuJob API.
     */
    RetryFsuJobResponse retryFsuJob(RetryFsuJobRequest request);

    /**
     * Updates the Exadata Fleet Update Action identified by the ID.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation uses RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is provided.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/fleetsoftwareupdate/UpdateFsuActionExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use UpdateFsuAction API.
     */
    UpdateFsuActionResponse updateFsuAction(UpdateFsuActionRequest request);

    /**
     * Updates the Exadata Fleet Update Collection identified by the ID.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation uses RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is provided.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/fleetsoftwareupdate/UpdateFsuCollectionExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use UpdateFsuCollection API.
     */
    UpdateFsuCollectionResponse updateFsuCollection(UpdateFsuCollectionRequest request);

    /**
     * Updates the Exadata Fleet Update Cycle identified by the ID.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation uses RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is provided.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/fleetsoftwareupdate/UpdateFsuCycleExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use UpdateFsuCycle API.
     */
    UpdateFsuCycleResponse updateFsuCycle(UpdateFsuCycleRequest request);

    /**
     * Updates the Exadata Fleet Update Discovery identified by the ID.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation uses RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is provided.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/fleetsoftwareupdate/UpdateFsuDiscoveryExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use UpdateFsuDiscovery API.
     */
    UpdateFsuDiscoveryResponse updateFsuDiscovery(UpdateFsuDiscoveryRequest request);

    /**
     * Updates Exadata Fleet Update Job resource details.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation uses RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is provided.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/fleetsoftwareupdate/UpdateFsuJobExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use UpdateFsuJob API.
     */
    UpdateFsuJobResponse updateFsuJob(UpdateFsuJobRequest request);

    /**
     * Gets the pre-configured waiters available for resources for this service.
     *
     * @return The service waiters.
     */
    FleetSoftwareUpdateWaiters getWaiters();

    /**
     * Gets the pre-configured paginators available for list operations in this service which may return multiple
     * pages of data. These paginators provide an {@link java.lang.Iterable} interface so that service responses, or
     * resources/records, can be iterated through without having to manually deal with pagination and page tokens.
     *
     * @return The service paginators.
     */
    FleetSoftwareUpdatePaginators getPaginators();
}

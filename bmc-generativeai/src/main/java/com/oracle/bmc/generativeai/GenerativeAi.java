/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.generativeai;

import com.oracle.bmc.generativeai.requests.*;
import com.oracle.bmc.generativeai.responses.*;

/**
 * OCI Generative AI is a fully managed service that provides a set of state-of-the-art, customizable large language models (LLMs) that cover a wide range of use cases for text generation, summarization, and text embeddings.
 *
 * Use the Generative AI service management API to create and manage {@link DedicatedAiCluster}, {@link Endpoint}, {@link Model}, and {@link WorkRequest} in the Generative AI service. For example, create a custom model by fine-tuning an out-of-the-box model using your own data, on a fine-tuning dedicated AI cluster. Then, create a hosting dedicated AI cluster with an endpoint to host your custom model.
 *
 * To access your custom model endpoints, or to try the out-of-the-box models to generate text, summarize, and create text embeddings see the [Generative AI Inference API](https://docs.oracle.com/iaas/api/#/en/generative-ai-inference/latest/).
 *
 * To learn more about the service, see the [Generative AI documentation](https://docs.oracle.com/iaas/Content/generative-ai/home.htm).
 *
 * This service client uses CircuitBreakerUtils.DEFAULT_CIRCUIT_BREAKER for all the operations by default if no circuit breaker configuration is defined by the user.
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20231130")
public interface GenerativeAi extends AutoCloseable {

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
     * add image with isAutoDeploy flag.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation uses RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is provided.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/generativeai/AddArtifactExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use AddArtifact API.
     */
    AddArtifactResponse addArtifact(AddArtifactRequest request);

    /**
     * Cancels a vectorStoreConnectorFileSync.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation uses RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is provided.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/generativeai/CancelVectorStoreConnectorFileSyncExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use CancelVectorStoreConnectorFileSync API.
     */
    CancelVectorStoreConnectorFileSyncResponse cancelVectorStoreConnectorFileSync(
            CancelVectorStoreConnectorFileSyncRequest request);

    /**
     * Moves an API key into a different compartment within the same tenancy. For information about moving resources between compartments, see [Moving Resources to a Different Compartment](https://docs.oracle.com/iaas/Content/Identity/Tasks/managingcompartments.htm#moveRes).
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation uses RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is provided.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/generativeai/ChangeApiKeyCompartmentExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use ChangeApiKeyCompartment API.
     */
    ChangeApiKeyCompartmentResponse changeApiKeyCompartment(ChangeApiKeyCompartmentRequest request);

    /**
     * Moves a dedicated AI cluster into a different compartment within the same tenancy. For information about moving resources between compartments, see [Moving Resources to a Different Compartment](https://docs.oracle.com/iaas/Content/Identity/Tasks/managingcompartments.htm#moveRes).
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation uses RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is provided.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/generativeai/ChangeDedicatedAiClusterCompartmentExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use ChangeDedicatedAiClusterCompartment API.
     */
    ChangeDedicatedAiClusterCompartmentResponse changeDedicatedAiClusterCompartment(
            ChangeDedicatedAiClusterCompartmentRequest request);

    /**
     * Moves an endpoint into a different compartment within the same tenancy. For information about moving resources between compartments, see [Moving Resources to a Different Compartment](https://docs.oracle.com/iaas/Content/Identity/Tasks/managingcompartments.htm#moveRes).
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation uses RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is provided.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/generativeai/ChangeEndpointCompartmentExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use ChangeEndpointCompartment API.
     */
    ChangeEndpointCompartmentResponse changeEndpointCompartment(
            ChangeEndpointCompartmentRequest request);

    /**
     * Moves a Generative AI private endpoint into a different compartment. When provided, If-Match is checked against ETag values of the resource.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation uses RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is provided.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/generativeai/ChangeGenerativeAiPrivateEndpointCompartmentExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use ChangeGenerativeAiPrivateEndpointCompartment API.
     */
    ChangeGenerativeAiPrivateEndpointCompartmentResponse
            changeGenerativeAiPrivateEndpointCompartment(
                    ChangeGenerativeAiPrivateEndpointCompartmentRequest request);

    /**
     * Moves a generativeAiProject into a different compartment within the same tenancy. For information about moving resources between compartments, see [Moving Resources to a Different Compartment](https://docs.oracle.com/iaas/Content/Identity/Tasks/managingcompartments.htm#moveRes).
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation uses RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is provided.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/generativeai/ChangeGenerativeAiProjectCompartmentExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use ChangeGenerativeAiProjectCompartment API.
     */
    ChangeGenerativeAiProjectCompartmentResponse changeGenerativeAiProjectCompartment(
            ChangeGenerativeAiProjectCompartmentRequest request);

    /**
     * Moves a hosted application into a different compartment within the same tenancy. For information about moving resources between compartments, see [Moving Resources to a Different Compartment](https://docs.oracle.com/iaas/Content/Identity/Tasks/managingcompartments.htm#moveRes).
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation uses RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is provided.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/generativeai/ChangeHostedApplicationCompartmentExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use ChangeHostedApplicationCompartment API.
     */
    ChangeHostedApplicationCompartmentResponse changeHostedApplicationCompartment(
            ChangeHostedApplicationCompartmentRequest request);

    /**
     * Moves a hosted application storage into a different compartment within the same tenancy. For information about moving resources between compartments, see [Moving Resources to a Different Compartment](https://docs.oracle.com/iaas/Content/Identity/Tasks/managingcompartments.htm#moveRes).
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation uses RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is provided.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/generativeai/ChangeHostedApplicationStorageCompartmentExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use ChangeHostedApplicationStorageCompartment API.
     */
    ChangeHostedApplicationStorageCompartmentResponse changeHostedApplicationStorageCompartment(
            ChangeHostedApplicationStorageCompartmentRequest request);

    /**
     * Moves an imported model into a different compartment. For information about moving resources between compartments, see [Moving Resources to a Different Compartment](https://docs.oracle.com/iaas/Content/Identity/Tasks/managingcompartments.htm#moveRes).
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation uses RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is provided.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/generativeai/ChangeImportedModelCompartmentExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use ChangeImportedModelCompartment API.
     */
    ChangeImportedModelCompartmentResponse changeImportedModelCompartment(
            ChangeImportedModelCompartmentRequest request);

    /**
     * Moves a custom model into a different compartment. For information about moving resources between compartments, see [Moving Resources to a Different Compartment](https://docs.oracle.com/iaas/Content/Identity/Tasks/managingcompartments.htm#moveRes).
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation uses RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is provided.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/generativeai/ChangeModelCompartmentExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use ChangeModelCompartment API.
     */
    ChangeModelCompartmentResponse changeModelCompartment(ChangeModelCompartmentRequest request);

    /**
     * Moves a SemanticStore into a different compartment within the same tenancy. For information about moving resources between compartments, see [Moving Resources to a Different Compartment](https://docs.oracle.com/iaas/Content/Identity/Tasks/managingcompartments.htm#moveRes).
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation uses RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is provided.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/generativeai/ChangeSemanticStoreCompartmentExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use ChangeSemanticStoreCompartment API.
     */
    ChangeSemanticStoreCompartmentResponse changeSemanticStoreCompartment(
            ChangeSemanticStoreCompartmentRequest request);

    /**
     * Creates a new API key in the specified compartment.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation uses RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is provided.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/generativeai/CreateApiKeyExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use CreateApiKey API.
     */
    CreateApiKeyResponse createApiKey(CreateApiKeyRequest request);

    /**
     * Creates a dedicated AI cluster.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation uses RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is provided.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/generativeai/CreateDedicatedAiClusterExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use CreateDedicatedAiCluster API.
     */
    CreateDedicatedAiClusterResponse createDedicatedAiCluster(
            CreateDedicatedAiClusterRequest request);

    /**
     * Creates an endpoint.
     * <p>
     * The header contains an opc-work-request-id, which is the id for the WorkRequest that tracks the endpoint creation progress.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation uses RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is provided.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/generativeai/CreateEndpointExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use CreateEndpoint API.
     */
    CreateEndpointResponse createEndpoint(CreateEndpointRequest request);

    /**
     * Creates a Generative AI private endpoint.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation uses RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is provided.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/generativeai/CreateGenerativeAiPrivateEndpointExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use CreateGenerativeAiPrivateEndpoint API.
     */
    CreateGenerativeAiPrivateEndpointResponse createGenerativeAiPrivateEndpoint(
            CreateGenerativeAiPrivateEndpointRequest request);

    /**
     * Creates a GenerativeAiProject.
     * The header contains an opc-work-request-id, which is the id for the WorkRequest that tracks the generativeAiProject creation progress.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation uses RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is provided.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/generativeai/CreateGenerativeAiProjectExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use CreateGenerativeAiProject API.
     */
    CreateGenerativeAiProjectResponse createGenerativeAiProject(
            CreateGenerativeAiProjectRequest request);

    /**
     * Creates a hosted application.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation uses RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is provided.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/generativeai/CreateHostedApplicationExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use CreateHostedApplication API.
     */
    CreateHostedApplicationResponse createHostedApplication(CreateHostedApplicationRequest request);

    /**
     * Creates a hosted application storage.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation uses RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is provided.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/generativeai/CreateHostedApplicationStorageExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use CreateHostedApplicationStorage API.
     */
    CreateHostedApplicationStorageResponse createHostedApplicationStorage(
            CreateHostedApplicationStorageRequest request);

    /**
     * Creates a hosted deployment.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation uses RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is provided.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/generativeai/CreateHostedDeploymentExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use CreateHostedDeployment API.
     */
    CreateHostedDeploymentResponse createHostedDeployment(CreateHostedDeploymentRequest request);

    /**
     * Import a model from ModelDataSource.
     * <p>
     * The header contains an opc-work-request-id, which is the id for the WorkRequest that tracks the importedModel creation progress.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation uses RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is provided.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/generativeai/CreateImportedModelExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use CreateImportedModel API.
     */
    CreateImportedModelResponse createImportedModel(CreateImportedModelRequest request);

    /**
     * Creates a custom model by fine-tuning a base model with your own dataset. You can create a new custom models or create a new version of existing custom model..
     * <p>
     * The header contains an opc-work-request-id, which is the id for the WorkRequest that tracks the model creation progress.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation uses RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is provided.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/generativeai/CreateModelExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use CreateModel API.
     */
    CreateModelResponse createModel(CreateModelRequest request);

    /**
     * Creates a SemanticStore.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation uses RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is provided.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/generativeai/CreateSemanticStoreExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use CreateSemanticStore API.
     */
    CreateSemanticStoreResponse createSemanticStore(CreateSemanticStoreRequest request);

    /**
     * Creates a VectorStoreConnector.
     * The header contains an opc-work-request-id, which is the id for the WorkRequest that tracks the vectorStoreConnector creation progress.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation uses RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is provided.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/generativeai/CreateVectorStoreConnectorExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use CreateVectorStoreConnector API.
     */
    CreateVectorStoreConnectorResponse createVectorStoreConnector(
            CreateVectorStoreConnectorRequest request);

    /**
     * Creates a File Sync operation for a VectorStoreConnector.
     * The header contains an opc-work-request-id, which is the id for the WorkRequest that tracks the vectorStoreConnectorFileSync creation progress.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation uses RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is provided.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/generativeai/CreateVectorStoreConnectorFileSyncExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use CreateVectorStoreConnectorFileSync API.
     */
    CreateVectorStoreConnectorFileSyncResponse createVectorStoreConnectorFileSync(
            CreateVectorStoreConnectorFileSyncRequest request);

    /**
     * Deletes an API key.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation uses RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is provided.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/generativeai/DeleteApiKeyExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use DeleteApiKey API.
     */
    DeleteApiKeyResponse deleteApiKey(DeleteApiKeyRequest request);

    /**
     * Deletes a dedicated AI cluster.
     * <p>
     * You can only delete clusters without attached resources. Before you delete a hosting dedicated AI cluster, you must delete the endpoints associated to that cluster. Before you delete a fine-tuning dedicated AI cluster, you must delete the custom model on that cluster. The delete action permanently deletes the cluster. This action can't be undone.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation uses RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is provided.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/generativeai/DeleteDedicatedAiClusterExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use DeleteDedicatedAiCluster API.
     */
    DeleteDedicatedAiClusterResponse deleteDedicatedAiCluster(
            DeleteDedicatedAiClusterRequest request);

    /**
     * Deletes an endpoint.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation uses RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is provided.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/generativeai/DeleteEndpointExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use DeleteEndpoint API.
     */
    DeleteEndpointResponse deleteEndpoint(DeleteEndpointRequest request);

    /**
     * Deletes a Generative AI  private endpoint using `privateEndpointId`.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation uses RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is provided.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/generativeai/DeleteGenerativeAiPrivateEndpointExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use DeleteGenerativeAiPrivateEndpoint API.
     */
    DeleteGenerativeAiPrivateEndpointResponse deleteGenerativeAiPrivateEndpoint(
            DeleteGenerativeAiPrivateEndpointRequest request);

    /**
     * Deletes a generativeAiProject.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation uses RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is provided.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/generativeai/DeleteGenerativeAiProjectExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use DeleteGenerativeAiProject API.
     */
    DeleteGenerativeAiProjectResponse deleteGenerativeAiProject(
            DeleteGenerativeAiProjectRequest request);

    /**
     * Deletes a hosted application.
     * You can only delete hosted application without attached resources. Before you delete a hosting hosted application, you must delete the endpoints associated to that application. Before you delete a fine-tuning hosted application, you must delete the custom model on that application. The delete action permanently deletes the cluster. This action can't be undone.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation uses RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is provided.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/generativeai/DeleteHostedApplicationExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use DeleteHostedApplication API.
     */
    DeleteHostedApplicationResponse deleteHostedApplication(DeleteHostedApplicationRequest request);

    /**
     * Deletes a hosted application.
     * You can only delete hosted application without attached resources. Before you delete a hosting hosted application, you must delete the endpoints associated to that application. Before you delete a fine-tuning hosted application, you must delete the custom model on that application. The delete action permanently deletes the cluster. This action can't be undone.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation uses RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is provided.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/generativeai/DeleteHostedApplicationStorageExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use DeleteHostedApplicationStorage API.
     */
    DeleteHostedApplicationStorageResponse deleteHostedApplicationStorage(
            DeleteHostedApplicationStorageRequest request);

    /**
     * Deletes a hosted deployment.
     * You can only delete hosted deployment without attached resources. Before you delete a hosting hosted deployment, you must delete the endpoints associated to that deployment. Before you delete a fine-tuning hosted deployment, you must delete the custom model on that deployment. The delete action permanently deletes the cluster. This action can't be undone.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation uses RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is provided.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/generativeai/DeleteHostedDeploymentExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use DeleteHostedDeployment API.
     */
    DeleteHostedDeploymentResponse deleteHostedDeployment(DeleteHostedDeploymentRequest request);

    /**
     * delete artifact.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation uses RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is provided.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/generativeai/DeleteHostedDeploymentArtifactExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use DeleteHostedDeploymentArtifact API.
     */
    DeleteHostedDeploymentArtifactResponse deleteHostedDeploymentArtifact(
            DeleteHostedDeploymentArtifactRequest request);

    /**
     * Deletes an imported model. An imported model shouldn't be deleted if there's one or more active endpoints associated with that imported model.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation uses RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is provided.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/generativeai/DeleteImportedModelExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use DeleteImportedModel API.
     */
    DeleteImportedModelResponse deleteImportedModel(DeleteImportedModelRequest request);

    /**
     * Deletes a custom model. A model shouldn't be deleted if there's one or more active endpoints associated with that model.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation uses RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is provided.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/generativeai/DeleteModelExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use DeleteModel API.
     */
    DeleteModelResponse deleteModel(DeleteModelRequest request);

    /**
     * Deletes a semanticStore.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation uses RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is provided.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/generativeai/DeleteSemanticStoreExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use DeleteSemanticStore API.
     */
    DeleteSemanticStoreResponse deleteSemanticStore(DeleteSemanticStoreRequest request);

    /**
     * Deletes a vectorStoreConnector.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation uses RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is provided.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/generativeai/DeleteVectorStoreConnectorExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use DeleteVectorStoreConnector API.
     */
    DeleteVectorStoreConnectorResponse deleteVectorStoreConnector(
            DeleteVectorStoreConnectorRequest request);

    /**
     * Gets information about an API key.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation uses RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is provided.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/generativeai/GetApiKeyExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use GetApiKey API.
     */
    GetApiKeyResponse getApiKey(GetApiKeyRequest request);

    /**
     * Gets information about a dedicated AI cluster.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation uses RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is provided.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/generativeai/GetDedicatedAiClusterExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use GetDedicatedAiCluster API.
     */
    GetDedicatedAiClusterResponse getDedicatedAiCluster(GetDedicatedAiClusterRequest request);

    /**
     * Gets information about an endpoint.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation uses RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is provided.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/generativeai/GetEndpointExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use GetEndpoint API.
     */
    GetEndpointResponse getEndpoint(GetEndpointRequest request);

    /**
     * Retrieves an Generative AI private endpoint using a `privateEndpointId`.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation uses RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is provided.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/generativeai/GetGenerativeAiPrivateEndpointExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use GetGenerativeAiPrivateEndpoint API.
     */
    GetGenerativeAiPrivateEndpointResponse getGenerativeAiPrivateEndpoint(
            GetGenerativeAiPrivateEndpointRequest request);

    /**
     * Gets information about a generativeAiProject.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation uses RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is provided.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/generativeai/GetGenerativeAiProjectExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use GetGenerativeAiProject API.
     */
    GetGenerativeAiProjectResponse getGenerativeAiProject(GetGenerativeAiProjectRequest request);

    /**
     * Gets information about a hosted application.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation uses RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is provided.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/generativeai/GetHostedApplicationExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use GetHostedApplication API.
     */
    GetHostedApplicationResponse getHostedApplication(GetHostedApplicationRequest request);

    /**
     * Gets information about a hosted application storage.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation uses RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is provided.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/generativeai/GetHostedApplicationStorageExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use GetHostedApplicationStorage API.
     */
    GetHostedApplicationStorageResponse getHostedApplicationStorage(
            GetHostedApplicationStorageRequest request);

    /**
     * Gets information about a hosted deployment.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation uses RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is provided.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/generativeai/GetHostedDeploymentExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use GetHostedDeployment API.
     */
    GetHostedDeploymentResponse getHostedDeployment(GetHostedDeploymentRequest request);

    /**
     * Gets information about an imported model.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation uses RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is provided.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/generativeai/GetImportedModelExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use GetImportedModel API.
     */
    GetImportedModelResponse getImportedModel(GetImportedModelRequest request);

    /**
     * Gets information about a custom model.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation uses RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is provided.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/generativeai/GetModelExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use GetModel API.
     */
    GetModelResponse getModel(GetModelRequest request);

    /**
     * Gets information about a semanticStore.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation uses RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is provided.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/generativeai/GetSemanticStoreExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use GetSemanticStore API.
     */
    GetSemanticStoreResponse getSemanticStore(GetSemanticStoreRequest request);

    /**
     * Gets information about a vectorStoreConnector.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation uses RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is provided.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/generativeai/GetVectorStoreConnectorExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use GetVectorStoreConnector API.
     */
    GetVectorStoreConnectorResponse getVectorStoreConnector(GetVectorStoreConnectorRequest request);

    /**
     * Gets information about a vectorStoreConnectorFileSync.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation uses RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is provided.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/generativeai/GetVectorStoreConnectorFileSyncExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use GetVectorStoreConnectorFileSync API.
     */
    GetVectorStoreConnectorFileSyncResponse getVectorStoreConnectorFileSync(
            GetVectorStoreConnectorFileSyncRequest request);

    /**
     * Gets Sync statistics from a vectorStoreConnector.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation uses RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is provided.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/generativeai/GetVectorStoreConnectorStatsExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use GetVectorStoreConnectorStats API.
     */
    GetVectorStoreConnectorStatsResponse getVectorStoreConnectorStats(
            GetVectorStoreConnectorStatsRequest request);

    /**
     * Gets the details of a work request.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation uses RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is provided.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/generativeai/GetWorkRequestExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use GetWorkRequest API.
     */
    GetWorkRequestResponse getWorkRequest(GetWorkRequestRequest request);

    /**
     * Lists the ApiKeys of a specific compartment.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation uses RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is provided.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/generativeai/ListApiKeysExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use ListApiKeys API.
     */
    ListApiKeysResponse listApiKeys(ListApiKeysRequest request);

    /**
     * Lists the dedicated AI clusters in a specific compartment.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation uses RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is provided.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/generativeai/ListDedicatedAiClustersExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use ListDedicatedAiClusters API.
     */
    ListDedicatedAiClustersResponse listDedicatedAiClusters(ListDedicatedAiClustersRequest request);

    /**
     * Lists the endpoints of a specific compartment.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation uses RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is provided.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/generativeai/ListEndpointsExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use ListEndpoints API.
     */
    ListEndpointsResponse listEndpoints(ListEndpointsRequest request);

    /**
     * Lists all Generative AI private endpoints in the specified compartment.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation uses RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is provided.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/generativeai/ListGenerativeAiPrivateEndpointsExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use ListGenerativeAiPrivateEndpoints API.
     */
    ListGenerativeAiPrivateEndpointsResponse listGenerativeAiPrivateEndpoints(
            ListGenerativeAiPrivateEndpointsRequest request);

    /**
     * Lists the generativeAiProjects of a specific compartment.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation uses RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is provided.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/generativeai/ListGenerativeAiProjectsExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use ListGenerativeAiProjects API.
     */
    ListGenerativeAiProjectsResponse listGenerativeAiProjects(
            ListGenerativeAiProjectsRequest request);

    /**
     * Lists the hosted application storage in a specific compartment.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation uses RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is provided.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/generativeai/ListHostedApplicationStoragesExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use ListHostedApplicationStorages API.
     */
    ListHostedApplicationStoragesResponse listHostedApplicationStorages(
            ListHostedApplicationStoragesRequest request);

    /**
     * Lists the hosted applications in a specific compartment.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation uses RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is provided.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/generativeai/ListHostedApplicationsExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use ListHostedApplications API.
     */
    ListHostedApplicationsResponse listHostedApplications(ListHostedApplicationsRequest request);

    /**
     * Lists the hosted applications in a specific compartment.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation uses RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is provided.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/generativeai/ListHostedDeploymentsExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use ListHostedDeployments API.
     */
    ListHostedDeploymentsResponse listHostedDeployments(ListHostedDeploymentsRequest request);

    /**
     * Lists imported models in a specific compartment.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation uses RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is provided.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/generativeai/ListImportedModelsExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use ListImportedModels API.
     */
    ListImportedModelsResponse listImportedModels(ListImportedModelsRequest request);

    /**
     * Lists the models in a specific compartment. Includes pretrained base models and fine-tuned custom models.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation uses RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is provided.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/generativeai/ListModelsExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use ListModels API.
     */
    ListModelsResponse listModels(ListModelsRequest request);

    /**
     * Lists the SemanticStores given specific filter.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation uses RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is provided.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/generativeai/ListSemanticStoresExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use ListSemanticStores API.
     */
    ListSemanticStoresResponse listSemanticStores(ListSemanticStoresRequest request);

    /**
     * Gets Ingestion logs for a vectorStoreConnectorFileSync operation.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation uses RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is provided.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/generativeai/ListVectorStoreConnectorFileSyncIngestionLogsExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use ListVectorStoreConnectorFileSyncIngestionLogs API.
     */
    ListVectorStoreConnectorFileSyncIngestionLogsResponse
            listVectorStoreConnectorFileSyncIngestionLogs(
                    ListVectorStoreConnectorFileSyncIngestionLogsRequest request);

    /**
     * Lists the vectorStoreConnectorFileSyncs of a specific compartment.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation uses RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is provided.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/generativeai/ListVectorStoreConnectorFileSyncsExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use ListVectorStoreConnectorFileSyncs API.
     */
    ListVectorStoreConnectorFileSyncsResponse listVectorStoreConnectorFileSyncs(
            ListVectorStoreConnectorFileSyncsRequest request);

    /**
     * Gets Ingestion logs for a vectorStoreConnector.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation uses RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is provided.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/generativeai/ListVectorStoreConnectorIngestionLogsExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use ListVectorStoreConnectorIngestionLogs API.
     */
    ListVectorStoreConnectorIngestionLogsResponse listVectorStoreConnectorIngestionLogs(
            ListVectorStoreConnectorIngestionLogsRequest request);

    /**
     * Lists the vectorStoreConnectors of a specific compartment.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation uses RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is provided.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/generativeai/ListVectorStoreConnectorsExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use ListVectorStoreConnectors API.
     */
    ListVectorStoreConnectorsResponse listVectorStoreConnectors(
            ListVectorStoreConnectorsRequest request);

    /**
     * Lists the errors for a work request.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation uses RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is provided.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/generativeai/ListWorkRequestErrorsExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use ListWorkRequestErrors API.
     */
    ListWorkRequestErrorsResponse listWorkRequestErrors(ListWorkRequestErrorsRequest request);

    /**
     * Lists the logs for a work request.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation uses RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is provided.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/generativeai/ListWorkRequestLogsExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use ListWorkRequestLogs API.
     */
    ListWorkRequestLogsResponse listWorkRequestLogs(ListWorkRequestLogsRequest request);

    /**
     * Lists the work requests in a compartment.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation uses RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is provided.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/generativeai/ListWorkRequestsExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use ListWorkRequests API.
     */
    ListWorkRequestsResponse listWorkRequests(ListWorkRequestsRequest request);

    /**
     * Renew the primary or secondary key.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation uses RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is provided.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/generativeai/RenewApiKeyExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use RenewApiKey API.
     */
    RenewApiKeyResponse renewApiKey(RenewApiKeyRequest request);

    /**
     * Set state of the key.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation uses RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is provided.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/generativeai/SetApiKeyStateExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use SetApiKeyState API.
     */
    SetApiKeyStateResponse setApiKeyState(SetApiKeyStateRequest request);

    /**
     * Updates the properties of an apiKey.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation uses RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is provided.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/generativeai/UpdateApiKeyExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use UpdateApiKey API.
     */
    UpdateApiKeyResponse updateApiKey(UpdateApiKeyRequest request);

    /**
     * Updates a dedicated AI cluster.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation uses RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is provided.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/generativeai/UpdateDedicatedAiClusterExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use UpdateDedicatedAiCluster API.
     */
    UpdateDedicatedAiClusterResponse updateDedicatedAiCluster(
            UpdateDedicatedAiClusterRequest request);

    /**
     * Updates the properties of an endpoint.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation uses RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is provided.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/generativeai/UpdateEndpointExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use UpdateEndpoint API.
     */
    UpdateEndpointResponse updateEndpoint(UpdateEndpointRequest request);

    /**
     * Updates a Generative AI private endpoint using a `privateEndpointId`.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation uses RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is provided.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/generativeai/UpdateGenerativeAiPrivateEndpointExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use UpdateGenerativeAiPrivateEndpoint API.
     */
    UpdateGenerativeAiPrivateEndpointResponse updateGenerativeAiPrivateEndpoint(
            UpdateGenerativeAiPrivateEndpointRequest request);

    /**
     * Updates the properties of a generativeAiProject.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation uses RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is provided.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/generativeai/UpdateGenerativeAiProjectExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use UpdateGenerativeAiProject API.
     */
    UpdateGenerativeAiProjectResponse updateGenerativeAiProject(
            UpdateGenerativeAiProjectRequest request);

    /**
     * Updates a hosted application.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation uses RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is provided.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/generativeai/UpdateHostedApplicationExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use UpdateHostedApplication API.
     */
    UpdateHostedApplicationResponse updateHostedApplication(UpdateHostedApplicationRequest request);

    /**
     * Updates a hosted deployment.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation uses RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is provided.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/generativeai/UpdateHostedDeploymentExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use UpdateHostedDeployment API.
     */
    UpdateHostedDeploymentResponse updateHostedDeployment(UpdateHostedDeploymentRequest request);

    /**
     * Updates the properties of an imported model such as name, description, freeform tags, and defined tags.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation uses RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is provided.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/generativeai/UpdateImportedModelExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use UpdateImportedModel API.
     */
    UpdateImportedModelResponse updateImportedModel(UpdateImportedModelRequest request);

    /**
     * Updates the properties of a custom model such as name, description, version, freeform tags, and defined tags.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation uses RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is provided.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/generativeai/UpdateModelExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use UpdateModel API.
     */
    UpdateModelResponse updateModel(UpdateModelRequest request);

    /**
     * Updates the properties of a SemanticStore.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation uses RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is provided.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/generativeai/UpdateSemanticStoreExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use UpdateSemanticStore API.
     */
    UpdateSemanticStoreResponse updateSemanticStore(UpdateSemanticStoreRequest request);

    /**
     * Updates the properties of a vectorStoreConnector.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation uses RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is provided.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/generativeai/UpdateVectorStoreConnectorExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use UpdateVectorStoreConnector API.
     */
    UpdateVectorStoreConnectorResponse updateVectorStoreConnector(
            UpdateVectorStoreConnectorRequest request);

    /**
     * Gets the pre-configured waiters available for resources for this service.
     *
     * @return The service waiters.
     */
    GenerativeAiWaiters getWaiters();

    /**
     * Gets the pre-configured paginators available for list operations in this service which may return multiple
     * pages of data. These paginators provide an {@link java.lang.Iterable} interface so that service responses, or
     * resources/records, can be iterated through without having to manually deal with pagination and page tokens.
     *
     * @return The service paginators.
     */
    GenerativeAiPaginators getPaginators();
}

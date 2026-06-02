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
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20231130")
public interface GenerativeAiAsync extends AutoCloseable {

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
     * Determines whether realm specific endpoint should be used or not.
     * Set realmSpecificEndpointTemplateEnabled to "true" if the user wants to enable use of realm specific endpoint template, otherwise set it to "false"
     * @param realmSpecificEndpointTemplateEnabled flag to enable the use of realm specific endpoint template
     */
    void useRealmSpecificEndpointTemplate(boolean realmSpecificEndpointTemplateEnabled);

    /**
     * Determines whether dual stack endpoint should be used or not.
     * Set dualStackEndpointTemplateEnabled to "true" if the user wants to enable use of dual stack endpoint template. Default value is "false"
     * @param dualStackEndpointTemplateEnabled flag to enable the use of dual stack endpoint template
     */
    void enableDualStackEndpoints(boolean dualStackEndpointTemplateEnabled);

    /**
     * add image with isAutoDeploy flag.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<AddArtifactResponse> addArtifact(
            AddArtifactRequest request,
            com.oracle.bmc.responses.AsyncHandler<AddArtifactRequest, AddArtifactResponse> handler);

    /**
     * Cancels a vectorStoreConnectorFileSync.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<CancelVectorStoreConnectorFileSyncResponse>
            cancelVectorStoreConnectorFileSync(
                    CancelVectorStoreConnectorFileSyncRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    CancelVectorStoreConnectorFileSyncRequest,
                                    CancelVectorStoreConnectorFileSyncResponse>
                            handler);

    /**
     * Moves an API key into a different compartment within the same tenancy. For information about moving resources between compartments, see [Moving Resources to a Different Compartment](https://docs.oracle.com/iaas/Content/Identity/Tasks/managingcompartments.htm#moveRes).
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<ChangeApiKeyCompartmentResponse> changeApiKeyCompartment(
            ChangeApiKeyCompartmentRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            ChangeApiKeyCompartmentRequest, ChangeApiKeyCompartmentResponse>
                    handler);

    /**
     * Moves a dedicated AI cluster into a different compartment within the same tenancy. For information about moving resources between compartments, see [Moving Resources to a Different Compartment](https://docs.oracle.com/iaas/Content/Identity/Tasks/managingcompartments.htm#moveRes).
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<ChangeDedicatedAiClusterCompartmentResponse>
            changeDedicatedAiClusterCompartment(
                    ChangeDedicatedAiClusterCompartmentRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    ChangeDedicatedAiClusterCompartmentRequest,
                                    ChangeDedicatedAiClusterCompartmentResponse>
                            handler);

    /**
     * Moves an endpoint into a different compartment within the same tenancy. For information about moving resources between compartments, see [Moving Resources to a Different Compartment](https://docs.oracle.com/iaas/Content/Identity/Tasks/managingcompartments.htm#moveRes).
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<ChangeEndpointCompartmentResponse> changeEndpointCompartment(
            ChangeEndpointCompartmentRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            ChangeEndpointCompartmentRequest, ChangeEndpointCompartmentResponse>
                    handler);

    /**
     * Moves a Generative AI private endpoint into a different compartment. When provided, If-Match is checked against ETag values of the resource.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<ChangeGenerativeAiPrivateEndpointCompartmentResponse>
            changeGenerativeAiPrivateEndpointCompartment(
                    ChangeGenerativeAiPrivateEndpointCompartmentRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    ChangeGenerativeAiPrivateEndpointCompartmentRequest,
                                    ChangeGenerativeAiPrivateEndpointCompartmentResponse>
                            handler);

    /**
     * Moves a generativeAiProject into a different compartment within the same tenancy. For information about moving resources between compartments, see [Moving Resources to a Different Compartment](https://docs.oracle.com/iaas/Content/Identity/Tasks/managingcompartments.htm#moveRes).
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<ChangeGenerativeAiProjectCompartmentResponse>
            changeGenerativeAiProjectCompartment(
                    ChangeGenerativeAiProjectCompartmentRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    ChangeGenerativeAiProjectCompartmentRequest,
                                    ChangeGenerativeAiProjectCompartmentResponse>
                            handler);

    /**
     * Moves a hosted application into a different compartment within the same tenancy. For information about moving resources between compartments, see [Moving Resources to a Different Compartment](https://docs.oracle.com/iaas/Content/Identity/Tasks/managingcompartments.htm#moveRes).
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<ChangeHostedApplicationCompartmentResponse>
            changeHostedApplicationCompartment(
                    ChangeHostedApplicationCompartmentRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    ChangeHostedApplicationCompartmentRequest,
                                    ChangeHostedApplicationCompartmentResponse>
                            handler);

    /**
     * Moves a hosted application storage into a different compartment within the same tenancy. For information about moving resources between compartments, see [Moving Resources to a Different Compartment](https://docs.oracle.com/iaas/Content/Identity/Tasks/managingcompartments.htm#moveRes).
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<ChangeHostedApplicationStorageCompartmentResponse>
            changeHostedApplicationStorageCompartment(
                    ChangeHostedApplicationStorageCompartmentRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    ChangeHostedApplicationStorageCompartmentRequest,
                                    ChangeHostedApplicationStorageCompartmentResponse>
                            handler);

    /**
     * Moves an imported model into a different compartment. For information about moving resources between compartments, see [Moving Resources to a Different Compartment](https://docs.oracle.com/iaas/Content/Identity/Tasks/managingcompartments.htm#moveRes).
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<ChangeImportedModelCompartmentResponse>
            changeImportedModelCompartment(
                    ChangeImportedModelCompartmentRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    ChangeImportedModelCompartmentRequest,
                                    ChangeImportedModelCompartmentResponse>
                            handler);

    /**
     * Moves a custom model into a different compartment. For information about moving resources between compartments, see [Moving Resources to a Different Compartment](https://docs.oracle.com/iaas/Content/Identity/Tasks/managingcompartments.htm#moveRes).
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<ChangeModelCompartmentResponse> changeModelCompartment(
            ChangeModelCompartmentRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            ChangeModelCompartmentRequest, ChangeModelCompartmentResponse>
                    handler);

    /**
     * Moves a SemanticStore into a different compartment within the same tenancy. For information about moving resources between compartments, see [Moving Resources to a Different Compartment](https://docs.oracle.com/iaas/Content/Identity/Tasks/managingcompartments.htm#moveRes).
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<ChangeSemanticStoreCompartmentResponse>
            changeSemanticStoreCompartment(
                    ChangeSemanticStoreCompartmentRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    ChangeSemanticStoreCompartmentRequest,
                                    ChangeSemanticStoreCompartmentResponse>
                            handler);

    /**
     * Creates a new API key in the specified compartment.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<CreateApiKeyResponse> createApiKey(
            CreateApiKeyRequest request,
            com.oracle.bmc.responses.AsyncHandler<CreateApiKeyRequest, CreateApiKeyResponse>
                    handler);

    /**
     * Creates a dedicated AI cluster.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<CreateDedicatedAiClusterResponse> createDedicatedAiCluster(
            CreateDedicatedAiClusterRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            CreateDedicatedAiClusterRequest, CreateDedicatedAiClusterResponse>
                    handler);

    /**
     * Creates an endpoint.
     * <p>
     * The header contains an opc-work-request-id, which is the id for the WorkRequest that tracks the endpoint creation progress.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<CreateEndpointResponse> createEndpoint(
            CreateEndpointRequest request,
            com.oracle.bmc.responses.AsyncHandler<CreateEndpointRequest, CreateEndpointResponse>
                    handler);

    /**
     * Creates a Generative AI private endpoint.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<CreateGenerativeAiPrivateEndpointResponse>
            createGenerativeAiPrivateEndpoint(
                    CreateGenerativeAiPrivateEndpointRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    CreateGenerativeAiPrivateEndpointRequest,
                                    CreateGenerativeAiPrivateEndpointResponse>
                            handler);

    /**
     * Creates a GenerativeAiProject.
     * The header contains an opc-work-request-id, which is the id for the WorkRequest that tracks the generativeAiProject creation progress.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<CreateGenerativeAiProjectResponse> createGenerativeAiProject(
            CreateGenerativeAiProjectRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            CreateGenerativeAiProjectRequest, CreateGenerativeAiProjectResponse>
                    handler);

    /**
     * Creates a hosted application.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<CreateHostedApplicationResponse> createHostedApplication(
            CreateHostedApplicationRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            CreateHostedApplicationRequest, CreateHostedApplicationResponse>
                    handler);

    /**
     * Creates a hosted application storage.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<CreateHostedApplicationStorageResponse>
            createHostedApplicationStorage(
                    CreateHostedApplicationStorageRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    CreateHostedApplicationStorageRequest,
                                    CreateHostedApplicationStorageResponse>
                            handler);

    /**
     * Creates a hosted deployment.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<CreateHostedDeploymentResponse> createHostedDeployment(
            CreateHostedDeploymentRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            CreateHostedDeploymentRequest, CreateHostedDeploymentResponse>
                    handler);

    /**
     * Import a model from ModelDataSource.
     * <p>
     * The header contains an opc-work-request-id, which is the id for the WorkRequest that tracks the importedModel creation progress.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<CreateImportedModelResponse> createImportedModel(
            CreateImportedModelRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            CreateImportedModelRequest, CreateImportedModelResponse>
                    handler);

    /**
     * Creates a custom model by fine-tuning a base model with your own dataset. You can create a new custom models or create a new version of existing custom model..
     * <p>
     * The header contains an opc-work-request-id, which is the id for the WorkRequest that tracks the model creation progress.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<CreateModelResponse> createModel(
            CreateModelRequest request,
            com.oracle.bmc.responses.AsyncHandler<CreateModelRequest, CreateModelResponse> handler);

    /**
     * Creates a SemanticStore.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<CreateSemanticStoreResponse> createSemanticStore(
            CreateSemanticStoreRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            CreateSemanticStoreRequest, CreateSemanticStoreResponse>
                    handler);

    /**
     * Creates a VectorStoreConnector.
     * The header contains an opc-work-request-id, which is the id for the WorkRequest that tracks the vectorStoreConnector creation progress.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<CreateVectorStoreConnectorResponse> createVectorStoreConnector(
            CreateVectorStoreConnectorRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            CreateVectorStoreConnectorRequest, CreateVectorStoreConnectorResponse>
                    handler);

    /**
     * Creates a File Sync operation for a VectorStoreConnector.
     * The header contains an opc-work-request-id, which is the id for the WorkRequest that tracks the vectorStoreConnectorFileSync creation progress.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<CreateVectorStoreConnectorFileSyncResponse>
            createVectorStoreConnectorFileSync(
                    CreateVectorStoreConnectorFileSyncRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    CreateVectorStoreConnectorFileSyncRequest,
                                    CreateVectorStoreConnectorFileSyncResponse>
                            handler);

    /**
     * Deletes an API key.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<DeleteApiKeyResponse> deleteApiKey(
            DeleteApiKeyRequest request,
            com.oracle.bmc.responses.AsyncHandler<DeleteApiKeyRequest, DeleteApiKeyResponse>
                    handler);

    /**
     * Deletes a dedicated AI cluster.
     * <p>
     * You can only delete clusters without attached resources. Before you delete a hosting dedicated AI cluster, you must delete the endpoints associated to that cluster. Before you delete a fine-tuning dedicated AI cluster, you must delete the custom model on that cluster. The delete action permanently deletes the cluster. This action can't be undone.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<DeleteDedicatedAiClusterResponse> deleteDedicatedAiCluster(
            DeleteDedicatedAiClusterRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            DeleteDedicatedAiClusterRequest, DeleteDedicatedAiClusterResponse>
                    handler);

    /**
     * Deletes an endpoint.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<DeleteEndpointResponse> deleteEndpoint(
            DeleteEndpointRequest request,
            com.oracle.bmc.responses.AsyncHandler<DeleteEndpointRequest, DeleteEndpointResponse>
                    handler);

    /**
     * Deletes a Generative AI  private endpoint using `privateEndpointId`.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<DeleteGenerativeAiPrivateEndpointResponse>
            deleteGenerativeAiPrivateEndpoint(
                    DeleteGenerativeAiPrivateEndpointRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    DeleteGenerativeAiPrivateEndpointRequest,
                                    DeleteGenerativeAiPrivateEndpointResponse>
                            handler);

    /**
     * Deletes a generativeAiProject.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<DeleteGenerativeAiProjectResponse> deleteGenerativeAiProject(
            DeleteGenerativeAiProjectRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            DeleteGenerativeAiProjectRequest, DeleteGenerativeAiProjectResponse>
                    handler);

    /**
     * Deletes a hosted application.
     * You can only delete hosted application without attached resources. Before you delete a hosting hosted application, you must delete the endpoints associated to that application. Before you delete a fine-tuning hosted application, you must delete the custom model on that application. The delete action permanently deletes the cluster. This action can't be undone.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<DeleteHostedApplicationResponse> deleteHostedApplication(
            DeleteHostedApplicationRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            DeleteHostedApplicationRequest, DeleteHostedApplicationResponse>
                    handler);

    /**
     * Deletes a hosted application.
     * You can only delete hosted application without attached resources. Before you delete a hosting hosted application, you must delete the endpoints associated to that application. Before you delete a fine-tuning hosted application, you must delete the custom model on that application. The delete action permanently deletes the cluster. This action can't be undone.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<DeleteHostedApplicationStorageResponse>
            deleteHostedApplicationStorage(
                    DeleteHostedApplicationStorageRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    DeleteHostedApplicationStorageRequest,
                                    DeleteHostedApplicationStorageResponse>
                            handler);

    /**
     * Deletes a hosted deployment.
     * You can only delete hosted deployment without attached resources. Before you delete a hosting hosted deployment, you must delete the endpoints associated to that deployment. Before you delete a fine-tuning hosted deployment, you must delete the custom model on that deployment. The delete action permanently deletes the cluster. This action can't be undone.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<DeleteHostedDeploymentResponse> deleteHostedDeployment(
            DeleteHostedDeploymentRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            DeleteHostedDeploymentRequest, DeleteHostedDeploymentResponse>
                    handler);

    /**
     * delete artifact.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<DeleteHostedDeploymentArtifactResponse>
            deleteHostedDeploymentArtifact(
                    DeleteHostedDeploymentArtifactRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    DeleteHostedDeploymentArtifactRequest,
                                    DeleteHostedDeploymentArtifactResponse>
                            handler);

    /**
     * Deletes an imported model. An imported model shouldn't be deleted if there's one or more active endpoints associated with that imported model.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<DeleteImportedModelResponse> deleteImportedModel(
            DeleteImportedModelRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            DeleteImportedModelRequest, DeleteImportedModelResponse>
                    handler);

    /**
     * Deletes a custom model. A model shouldn't be deleted if there's one or more active endpoints associated with that model.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<DeleteModelResponse> deleteModel(
            DeleteModelRequest request,
            com.oracle.bmc.responses.AsyncHandler<DeleteModelRequest, DeleteModelResponse> handler);

    /**
     * Deletes a semanticStore.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<DeleteSemanticStoreResponse> deleteSemanticStore(
            DeleteSemanticStoreRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            DeleteSemanticStoreRequest, DeleteSemanticStoreResponse>
                    handler);

    /**
     * Deletes a vectorStoreConnector.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<DeleteVectorStoreConnectorResponse> deleteVectorStoreConnector(
            DeleteVectorStoreConnectorRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            DeleteVectorStoreConnectorRequest, DeleteVectorStoreConnectorResponse>
                    handler);

    /**
     * Gets information about an API key.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<GetApiKeyResponse> getApiKey(
            GetApiKeyRequest request,
            com.oracle.bmc.responses.AsyncHandler<GetApiKeyRequest, GetApiKeyResponse> handler);

    /**
     * Gets information about a dedicated AI cluster.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<GetDedicatedAiClusterResponse> getDedicatedAiCluster(
            GetDedicatedAiClusterRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            GetDedicatedAiClusterRequest, GetDedicatedAiClusterResponse>
                    handler);

    /**
     * Gets information about an endpoint.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<GetEndpointResponse> getEndpoint(
            GetEndpointRequest request,
            com.oracle.bmc.responses.AsyncHandler<GetEndpointRequest, GetEndpointResponse> handler);

    /**
     * Retrieves an Generative AI private endpoint using a `privateEndpointId`.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<GetGenerativeAiPrivateEndpointResponse>
            getGenerativeAiPrivateEndpoint(
                    GetGenerativeAiPrivateEndpointRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    GetGenerativeAiPrivateEndpointRequest,
                                    GetGenerativeAiPrivateEndpointResponse>
                            handler);

    /**
     * Gets information about a generativeAiProject.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<GetGenerativeAiProjectResponse> getGenerativeAiProject(
            GetGenerativeAiProjectRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            GetGenerativeAiProjectRequest, GetGenerativeAiProjectResponse>
                    handler);

    /**
     * Gets information about a hosted application.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<GetHostedApplicationResponse> getHostedApplication(
            GetHostedApplicationRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            GetHostedApplicationRequest, GetHostedApplicationResponse>
                    handler);

    /**
     * Gets information about a hosted application storage.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<GetHostedApplicationStorageResponse> getHostedApplicationStorage(
            GetHostedApplicationStorageRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            GetHostedApplicationStorageRequest, GetHostedApplicationStorageResponse>
                    handler);

    /**
     * Gets information about a hosted deployment.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<GetHostedDeploymentResponse> getHostedDeployment(
            GetHostedDeploymentRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            GetHostedDeploymentRequest, GetHostedDeploymentResponse>
                    handler);

    /**
     * Gets information about an imported model.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<GetImportedModelResponse> getImportedModel(
            GetImportedModelRequest request,
            com.oracle.bmc.responses.AsyncHandler<GetImportedModelRequest, GetImportedModelResponse>
                    handler);

    /**
     * Gets information about a custom model.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<GetModelResponse> getModel(
            GetModelRequest request,
            com.oracle.bmc.responses.AsyncHandler<GetModelRequest, GetModelResponse> handler);

    /**
     * Gets information about a semanticStore.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<GetSemanticStoreResponse> getSemanticStore(
            GetSemanticStoreRequest request,
            com.oracle.bmc.responses.AsyncHandler<GetSemanticStoreRequest, GetSemanticStoreResponse>
                    handler);

    /**
     * Gets information about a vectorStoreConnector.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<GetVectorStoreConnectorResponse> getVectorStoreConnector(
            GetVectorStoreConnectorRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            GetVectorStoreConnectorRequest, GetVectorStoreConnectorResponse>
                    handler);

    /**
     * Gets information about a vectorStoreConnectorFileSync.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<GetVectorStoreConnectorFileSyncResponse>
            getVectorStoreConnectorFileSync(
                    GetVectorStoreConnectorFileSyncRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    GetVectorStoreConnectorFileSyncRequest,
                                    GetVectorStoreConnectorFileSyncResponse>
                            handler);

    /**
     * Gets Sync statistics from a vectorStoreConnector.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<GetVectorStoreConnectorStatsResponse> getVectorStoreConnectorStats(
            GetVectorStoreConnectorStatsRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            GetVectorStoreConnectorStatsRequest,
                            GetVectorStoreConnectorStatsResponse>
                    handler);

    /**
     * Gets the details of a work request.
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
     * Lists the ApiKeys of a specific compartment.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<ListApiKeysResponse> listApiKeys(
            ListApiKeysRequest request,
            com.oracle.bmc.responses.AsyncHandler<ListApiKeysRequest, ListApiKeysResponse> handler);

    /**
     * Lists the dedicated AI clusters in a specific compartment.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<ListDedicatedAiClustersResponse> listDedicatedAiClusters(
            ListDedicatedAiClustersRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            ListDedicatedAiClustersRequest, ListDedicatedAiClustersResponse>
                    handler);

    /**
     * Lists the endpoints of a specific compartment.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<ListEndpointsResponse> listEndpoints(
            ListEndpointsRequest request,
            com.oracle.bmc.responses.AsyncHandler<ListEndpointsRequest, ListEndpointsResponse>
                    handler);

    /**
     * Lists all Generative AI private endpoints in the specified compartment.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<ListGenerativeAiPrivateEndpointsResponse>
            listGenerativeAiPrivateEndpoints(
                    ListGenerativeAiPrivateEndpointsRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    ListGenerativeAiPrivateEndpointsRequest,
                                    ListGenerativeAiPrivateEndpointsResponse>
                            handler);

    /**
     * Lists the generativeAiProjects of a specific compartment.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<ListGenerativeAiProjectsResponse> listGenerativeAiProjects(
            ListGenerativeAiProjectsRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            ListGenerativeAiProjectsRequest, ListGenerativeAiProjectsResponse>
                    handler);

    /**
     * Lists the hosted application storage in a specific compartment.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<ListHostedApplicationStoragesResponse>
            listHostedApplicationStorages(
                    ListHostedApplicationStoragesRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    ListHostedApplicationStoragesRequest,
                                    ListHostedApplicationStoragesResponse>
                            handler);

    /**
     * Lists the hosted applications in a specific compartment.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<ListHostedApplicationsResponse> listHostedApplications(
            ListHostedApplicationsRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            ListHostedApplicationsRequest, ListHostedApplicationsResponse>
                    handler);

    /**
     * Lists the hosted applications in a specific compartment.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<ListHostedDeploymentsResponse> listHostedDeployments(
            ListHostedDeploymentsRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            ListHostedDeploymentsRequest, ListHostedDeploymentsResponse>
                    handler);

    /**
     * Lists imported models in a specific compartment.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<ListImportedModelsResponse> listImportedModels(
            ListImportedModelsRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            ListImportedModelsRequest, ListImportedModelsResponse>
                    handler);

    /**
     * Lists the models in a specific compartment. Includes pretrained base models and fine-tuned custom models.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<ListModelsResponse> listModels(
            ListModelsRequest request,
            com.oracle.bmc.responses.AsyncHandler<ListModelsRequest, ListModelsResponse> handler);

    /**
     * Lists the SemanticStores given specific filter.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<ListSemanticStoresResponse> listSemanticStores(
            ListSemanticStoresRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            ListSemanticStoresRequest, ListSemanticStoresResponse>
                    handler);

    /**
     * Gets Ingestion logs for a vectorStoreConnectorFileSync operation.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<ListVectorStoreConnectorFileSyncIngestionLogsResponse>
            listVectorStoreConnectorFileSyncIngestionLogs(
                    ListVectorStoreConnectorFileSyncIngestionLogsRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    ListVectorStoreConnectorFileSyncIngestionLogsRequest,
                                    ListVectorStoreConnectorFileSyncIngestionLogsResponse>
                            handler);

    /**
     * Lists the vectorStoreConnectorFileSyncs of a specific compartment.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<ListVectorStoreConnectorFileSyncsResponse>
            listVectorStoreConnectorFileSyncs(
                    ListVectorStoreConnectorFileSyncsRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    ListVectorStoreConnectorFileSyncsRequest,
                                    ListVectorStoreConnectorFileSyncsResponse>
                            handler);

    /**
     * Gets Ingestion logs for a vectorStoreConnector.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<ListVectorStoreConnectorIngestionLogsResponse>
            listVectorStoreConnectorIngestionLogs(
                    ListVectorStoreConnectorIngestionLogsRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    ListVectorStoreConnectorIngestionLogsRequest,
                                    ListVectorStoreConnectorIngestionLogsResponse>
                            handler);

    /**
     * Lists the vectorStoreConnectors of a specific compartment.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<ListVectorStoreConnectorsResponse> listVectorStoreConnectors(
            ListVectorStoreConnectorsRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            ListVectorStoreConnectorsRequest, ListVectorStoreConnectorsResponse>
                    handler);

    /**
     * Lists the errors for a work request.
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
     * Lists the logs for a work request.
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
     * Lists the work requests in a compartment.
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
     * Renew the primary or secondary key.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<RenewApiKeyResponse> renewApiKey(
            RenewApiKeyRequest request,
            com.oracle.bmc.responses.AsyncHandler<RenewApiKeyRequest, RenewApiKeyResponse> handler);

    /**
     * Set state of the key.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<SetApiKeyStateResponse> setApiKeyState(
            SetApiKeyStateRequest request,
            com.oracle.bmc.responses.AsyncHandler<SetApiKeyStateRequest, SetApiKeyStateResponse>
                    handler);

    /**
     * Updates the properties of an apiKey.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<UpdateApiKeyResponse> updateApiKey(
            UpdateApiKeyRequest request,
            com.oracle.bmc.responses.AsyncHandler<UpdateApiKeyRequest, UpdateApiKeyResponse>
                    handler);

    /**
     * Updates a dedicated AI cluster.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<UpdateDedicatedAiClusterResponse> updateDedicatedAiCluster(
            UpdateDedicatedAiClusterRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            UpdateDedicatedAiClusterRequest, UpdateDedicatedAiClusterResponse>
                    handler);

    /**
     * Updates the properties of an endpoint.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<UpdateEndpointResponse> updateEndpoint(
            UpdateEndpointRequest request,
            com.oracle.bmc.responses.AsyncHandler<UpdateEndpointRequest, UpdateEndpointResponse>
                    handler);

    /**
     * Updates a Generative AI private endpoint using a `privateEndpointId`.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<UpdateGenerativeAiPrivateEndpointResponse>
            updateGenerativeAiPrivateEndpoint(
                    UpdateGenerativeAiPrivateEndpointRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    UpdateGenerativeAiPrivateEndpointRequest,
                                    UpdateGenerativeAiPrivateEndpointResponse>
                            handler);

    /**
     * Updates the properties of a generativeAiProject.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<UpdateGenerativeAiProjectResponse> updateGenerativeAiProject(
            UpdateGenerativeAiProjectRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            UpdateGenerativeAiProjectRequest, UpdateGenerativeAiProjectResponse>
                    handler);

    /**
     * Updates a hosted application.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<UpdateHostedApplicationResponse> updateHostedApplication(
            UpdateHostedApplicationRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            UpdateHostedApplicationRequest, UpdateHostedApplicationResponse>
                    handler);

    /**
     * Updates a hosted deployment.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<UpdateHostedDeploymentResponse> updateHostedDeployment(
            UpdateHostedDeploymentRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            UpdateHostedDeploymentRequest, UpdateHostedDeploymentResponse>
                    handler);

    /**
     * Updates the properties of an imported model such as name, description, freeform tags, and defined tags.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<UpdateImportedModelResponse> updateImportedModel(
            UpdateImportedModelRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            UpdateImportedModelRequest, UpdateImportedModelResponse>
                    handler);

    /**
     * Updates the properties of a custom model such as name, description, version, freeform tags, and defined tags.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<UpdateModelResponse> updateModel(
            UpdateModelRequest request,
            com.oracle.bmc.responses.AsyncHandler<UpdateModelRequest, UpdateModelResponse> handler);

    /**
     * Updates the properties of a SemanticStore.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<UpdateSemanticStoreResponse> updateSemanticStore(
            UpdateSemanticStoreRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            UpdateSemanticStoreRequest, UpdateSemanticStoreResponse>
                    handler);

    /**
     * Updates the properties of a vectorStoreConnector.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<UpdateVectorStoreConnectorResponse> updateVectorStoreConnector(
            UpdateVectorStoreConnectorRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            UpdateVectorStoreConnectorRequest, UpdateVectorStoreConnectorResponse>
                    handler);
}

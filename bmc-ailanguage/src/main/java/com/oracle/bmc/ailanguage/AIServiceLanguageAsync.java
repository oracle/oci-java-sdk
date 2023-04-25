/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.ailanguage;

import com.oracle.bmc.ailanguage.requests.*;
import com.oracle.bmc.ailanguage.responses.*;

/**
 * OCI Language Service solutions can help enterprise customers integrate AI into their products
 * immediately using our proven, pre-trained and custom models or containers, without a need to set
 * up an house team of AI and ML experts. This allows enterprises to focus on business drivers and
 * development work rather than AI and ML operations, which shortens the time to market.
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20221001")
public interface AIServiceLanguageAsync extends AutoCloseable {

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
     * The API returns the detected language and a related confidence score (between 0 and 1). It
     * supports passing a batch of records.
     *
     * <p>[List of supported
     * languages.](https://docs.cloud.oracle.com/iaas/language/using/pretrain-models.htm#lang-detect)
     *
     * <p>Limitations: - A batch may have up to 100 records. - A record may be up to 5000 characters
     * long. - The total of characters to process in a request can be up to 20,000 characters.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<BatchDetectDominantLanguageResponse> batchDetectDominantLanguage(
            BatchDetectDominantLanguageRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            BatchDetectDominantLanguageRequest, BatchDetectDominantLanguageResponse>
                    handler);

    /**
     * The API extracts entities in text records. For each entity, its type/subtype and confidence
     * score (between 0 and 1) is returned. It supports passing a batch of records.
     *
     * <p>[List of supported
     * entities.](https://docs.cloud.oracle.com/iaas/language/using/pretrain-models.htm#ner__sup-ner-entity)
     *
     * <p>Limitations: - A batch may have up to 100 records. - A record may be up to 5000 characters
     * long. - The total of characters to process in a request can be up to 20,000 characters.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<BatchDetectLanguageEntitiesResponse> batchDetectLanguageEntities(
            BatchDetectLanguageEntitiesRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            BatchDetectLanguageEntitiesRequest, BatchDetectLanguageEntitiesResponse>
                    handler);

    /**
     * The API extracts key-phrases in text records. For each key-phrase, a score (between 0 and 1)
     * is returned that highlights the importance of the key-phrase in the context of the text. It
     * supports passing a batch of records.
     *
     * <p>Limitations: - A batch may have up to 100 records. - A record may be up to 5000 characters
     * long. - The total of characters to process in a request can be up to 20,000 characters.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<BatchDetectLanguageKeyPhrasesResponse>
            batchDetectLanguageKeyPhrases(
                    BatchDetectLanguageKeyPhrasesRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    BatchDetectLanguageKeyPhrasesRequest,
                                    BatchDetectLanguageKeyPhrasesResponse>
                            handler);

    /**
     * The API extracts pii entities in text records. For each entity, its type and confidence score
     * (between 0 and 1) is returned. It supports passing a batch of records.
     *
     * <p>Limitations: - A batch may have up to 100 records. - A record may be up to 5000 characters
     * long. - The total of characters to process in a request can be up to 20,000 characters.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<BatchDetectLanguagePiiEntitiesResponse>
            batchDetectLanguagePiiEntities(
                    BatchDetectLanguagePiiEntitiesRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    BatchDetectLanguagePiiEntitiesRequest,
                                    BatchDetectLanguagePiiEntitiesResponse>
                            handler);

    /**
     * The API extracts aspect-based and sentence level sentiment in text records.
     *
     * <p>For aspect-based sentiment analysis, a set of aspects and their respective sentiment is
     * returned for each record. Similarly, for sentence-level sentiment analysis, the sentiment is
     * returned at the sentence level.
     *
     * <p>For sentiment analysis, confidence scores are provided for each of the classes (positive,
     * negative, neutral and mixed).
     *
     * <p>Learn more about sentiment analysis
     * [here](https://docs.cloud.oracle.com/iaas/language/using/pretrain-models.htm#sentiment).
     *
     * <p>Limitations: - A batch may have up to 100 records. - A record may be up to 5000 characters
     * long. - The total of characters to process in a request can be up to 20,000 characters.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<BatchDetectLanguageSentimentsResponse>
            batchDetectLanguageSentiments(
                    BatchDetectLanguageSentimentsRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    BatchDetectLanguageSentimentsRequest,
                                    BatchDetectLanguageSentimentsResponse>
                            handler);

    /**
     * The API automatically classifies text into a set of pre-determined classes and sub-classes. A
     * single class/subclass is returned for each record classified.
     *
     * <p>It supports passing a batch of records.
     *
     * <p>Learn more about text classification
     * [here](https://docs.cloud.oracle.com/iaas/language/using/pretrain-models.htm#text-class).
     *
     * <p>Limitations: - A batch may have up to 100 records. - A record may be up to 5000 characters
     * long. - The total of characters to process in a request can be up to 20,000 characters.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<BatchDetectLanguageTextClassificationResponse>
            batchDetectLanguageTextClassification(
                    BatchDetectLanguageTextClassificationRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    BatchDetectLanguageTextClassificationRequest,
                                    BatchDetectLanguageTextClassificationResponse>
                            handler);

    /**
     * Translate text to other language over pre-deployed model. Use state of the art neural machine
     * translation to translate text between more than 15 languages. Limitations: - A batch may have
     * up to 100 records. - A record may be up to 5000 characters long. - The total of characters to
     * process in a request can be up to 20,000 characters.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<BatchLanguageTranslationResponse> batchLanguageTranslation(
            BatchLanguageTranslationRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            BatchLanguageTranslationRequest, BatchLanguageTranslationResponse>
                    handler);

    /**
     * Moves a Endpoint into a different compartment. When provided, If-Match is checked against
     * ETag values of the resource.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ChangeEndpointCompartmentResponse> changeEndpointCompartment(
            ChangeEndpointCompartmentRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            ChangeEndpointCompartmentRequest, ChangeEndpointCompartmentResponse>
                    handler);

    /**
     * Moves a Model into a different compartment. When provided, If-Match is checked against ETag
     * values of the resource.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ChangeModelCompartmentResponse> changeModelCompartment(
            ChangeModelCompartmentRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            ChangeModelCompartmentRequest, ChangeModelCompartmentResponse>
                    handler);

    /**
     * Moves a Project into a different compartment. When provided, If-Match is checked against ETag
     * values of the resource.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ChangeProjectCompartmentResponse> changeProjectCompartment(
            ChangeProjectCompartmentRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            ChangeProjectCompartmentRequest, ChangeProjectCompartmentResponse>
                    handler);

    /**
     * Creates a new endpoint and deploy the trained model
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<CreateEndpointResponse> createEndpoint(
            CreateEndpointRequest request,
            com.oracle.bmc.responses.AsyncHandler<CreateEndpointRequest, CreateEndpointResponse>
                    handler);

    /**
     * Creates a new model for training and train the model with date provided.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<CreateModelResponse> createModel(
            CreateModelRequest request,
            com.oracle.bmc.responses.AsyncHandler<CreateModelRequest, CreateModelResponse> handler);

    /**
     * Creates a new Project.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<CreateProjectResponse> createProject(
            CreateProjectRequest request,
            com.oracle.bmc.responses.AsyncHandler<CreateProjectRequest, CreateProjectResponse>
                    handler);

    /**
     * Deletes a provisioned endpoint resource by identifier. This operation fails with a 409 error
     * unless all associated resources are in a DELETED state. You must delete all associated
     * resources before deleting a model.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<DeleteEndpointResponse> deleteEndpoint(
            DeleteEndpointRequest request,
            com.oracle.bmc.responses.AsyncHandler<DeleteEndpointRequest, DeleteEndpointResponse>
                    handler);

    /**
     * Deletes a provisioned model resource by identifier. This operation fails with a 409 error
     * unless all associated resources are in a DELETED state. You must delete all associated
     * resources before deleting a model.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<DeleteModelResponse> deleteModel(
            DeleteModelRequest request,
            com.oracle.bmc.responses.AsyncHandler<DeleteModelRequest, DeleteModelResponse> handler);

    /**
     * Deletes a Project resource by identifier. This operation fails with a 409 error unless all
     * associated resources (models deployments or data assets) are in a DELETED state. You must
     * delete all associated resources before deleting a project.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<DeleteProjectResponse> deleteProject(
            DeleteProjectRequest request,
            com.oracle.bmc.responses.AsyncHandler<DeleteProjectRequest, DeleteProjectResponse>
                    handler);

    /**
     * This API will be retired on Monday, 10 Oct 2023 00:00:00 GMT The API returns the detected
     * language and a related confidence score (between 0 and 1).
     *
     * <p>[List of supported
     * languages.](https://docs.cloud.oracle.com/iaas/language/using/pretrain-models.htm#lang-detect)
     *
     * <p>Limitations: - A record may be up to 1000 characters long.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<DetectDominantLanguageResponse> detectDominantLanguage(
            DetectDominantLanguageRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            DetectDominantLanguageRequest, DetectDominantLanguageResponse>
                    handler);

    /**
     * This API will be retired on Monday, 10 Oct 2023 00:00:00 GMT The API extracts entities in
     * text records. For each entity, its type and confidence score (between 0 and 1) is returned.
     *
     * <p>Limitations: - A text may be up to 1000 characters long.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<DetectLanguageEntitiesResponse> detectLanguageEntities(
            DetectLanguageEntitiesRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            DetectLanguageEntitiesRequest, DetectLanguageEntitiesResponse>
                    handler);

    /**
     * This API will be retired on Monday, 10 Oct 2023 00:00:00 GMT The API extracts key-phrases in
     * text records. For each key-phrase, a score (between 0 and 1) is returned that highlights the
     * importance of the key-phrase in the context of the text.
     *
     * <p>Limitations: - A record may be up to 1000 characters long.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<DetectLanguageKeyPhrasesResponse> detectLanguageKeyPhrases(
            DetectLanguageKeyPhrasesRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            DetectLanguageKeyPhrasesRequest, DetectLanguageKeyPhrasesResponse>
                    handler);

    /**
     * This API will be retired on Monday, 10 Oct 2023 00:00:00 GMT The API extracts aspect-based in
     * text records.
     *
     * <p>For aspect-based sentiment analysis, a set of aspects and their respective sentiment is
     * returned.
     *
     * <p>For sentiment analysis, confidence scores are provided for each of the classes (positive,
     * negative, neutral).
     *
     * <p>Learn more about sentiment analysis
     * [here](https://docs.cloud.oracle.com/iaas/language/using/pretrain-models.htm#sentiment).
     *
     * <p>Limitations: - A record may be up to 1000 characters long.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<DetectLanguageSentimentsResponse> detectLanguageSentiments(
            DetectLanguageSentimentsRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            DetectLanguageSentimentsRequest, DetectLanguageSentimentsResponse>
                    handler);

    /**
     * This API will be retired on Monday, 10 Oct 2023 00:00:00 GMT The API automatically classifies
     * text into a set of pre-determined classes and sub-classes. A single class/subclass is
     * returned for each record classified.
     *
     * <p>Learn more about text classification
     * [here](https://docs.cloud.oracle.com/iaas/language/using/pretrain-models.htm#text-class).
     *
     * <p>Limitations: - A record may be up to 1000 characters long.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<DetectLanguageTextClassificationResponse>
            detectLanguageTextClassification(
                    DetectLanguageTextClassificationRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    DetectLanguageTextClassificationRequest,
                                    DetectLanguageTextClassificationResponse>
                            handler);

    /**
     * Gets an endpoint by identifier
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<GetEndpointResponse> getEndpoint(
            GetEndpointRequest request,
            com.oracle.bmc.responses.AsyncHandler<GetEndpointRequest, GetEndpointResponse> handler);

    /**
     * Gets a model by identifier
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<GetModelResponse> getModel(
            GetModelRequest request,
            com.oracle.bmc.responses.AsyncHandler<GetModelRequest, GetModelResponse> handler);

    /**
     * Gets a Project by identifier
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<GetProjectResponse> getProject(
            GetProjectRequest request,
            com.oracle.bmc.responses.AsyncHandler<GetProjectRequest, GetProjectResponse> handler);

    /**
     * Gets the status of the work request with the given ID.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<GetWorkRequestResponse> getWorkRequest(
            GetWorkRequestRequest request,
            com.oracle.bmc.responses.AsyncHandler<GetWorkRequestRequest, GetWorkRequestResponse>
                    handler);

    /**
     * Returns a list of Endpoints.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ListEndpointsResponse> listEndpoints(
            ListEndpointsRequest request,
            com.oracle.bmc.responses.AsyncHandler<ListEndpointsRequest, ListEndpointsResponse>
                    handler);

    /**
     * Get a (paginated) list of evaluation results for a given model.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ListEvaluationResultsResponse> listEvaluationResults(
            ListEvaluationResultsRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            ListEvaluationResultsRequest, ListEvaluationResultsResponse>
                    handler);

    /**
     * Returns a list of models.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ListModelsResponse> listModels(
            ListModelsRequest request,
            com.oracle.bmc.responses.AsyncHandler<ListModelsRequest, ListModelsResponse> handler);

    /**
     * Returns a list of Projects.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ListProjectsResponse> listProjects(
            ListProjectsRequest request,
            com.oracle.bmc.responses.AsyncHandler<ListProjectsRequest, ListProjectsResponse>
                    handler);

    /**
     * Return a (paginated) list of errors for a given work request.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ListWorkRequestErrorsResponse> listWorkRequestErrors(
            ListWorkRequestErrorsRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            ListWorkRequestErrorsRequest, ListWorkRequestErrorsResponse>
                    handler);

    /**
     * Return a (paginated) list of logs for a given work request.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
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
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ListWorkRequestsResponse> listWorkRequests(
            ListWorkRequestsRequest request,
            com.oracle.bmc.responses.AsyncHandler<ListWorkRequestsRequest, ListWorkRequestsResponse>
                    handler);

    /**
     * Update the Endpoint identified by the id
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<UpdateEndpointResponse> updateEndpoint(
            UpdateEndpointRequest request,
            com.oracle.bmc.responses.AsyncHandler<UpdateEndpointRequest, UpdateEndpointResponse>
                    handler);

    /**
     * Updates the model
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<UpdateModelResponse> updateModel(
            UpdateModelRequest request,
            com.oracle.bmc.responses.AsyncHandler<UpdateModelRequest, UpdateModelResponse> handler);

    /**
     * Updates the Project
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<UpdateProjectResponse> updateProject(
            UpdateProjectRequest request,
            com.oracle.bmc.responses.AsyncHandler<UpdateProjectRequest, UpdateProjectResponse>
                    handler);
}

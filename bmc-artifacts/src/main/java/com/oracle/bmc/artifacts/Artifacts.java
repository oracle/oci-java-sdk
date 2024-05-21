/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.artifacts;

import com.oracle.bmc.artifacts.requests.*;
import com.oracle.bmc.artifacts.responses.*;

/**
 * API covering the Artifacts and [Registry](https://docs.cloud.oracle.com/iaas/Content/Registry/Concepts/registryoverview.htm) services.
 * Use this API to manage resources such as generic artifacts and container images.
 *
 * This service client uses CircuitBreakerUtils.DEFAULT_CIRCUIT_BREAKER for all the operations by default if no circuit breaker configuration is defined by the user.
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
public interface Artifacts extends AutoCloseable {

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
     * Moves a container repository into a different compartment within the same tenancy. For information about moving
     * resources between compartments, see
     * [Moving Resources to a Different Compartment](https://docs.cloud.oracle.com/iaas/Content/Identity/Tasks/managingcompartments.htm#moveRes).
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation uses RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is provided.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/artifacts/ChangeContainerRepositoryCompartmentExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use ChangeContainerRepositoryCompartment API.
     */
    ChangeContainerRepositoryCompartmentResponse changeContainerRepositoryCompartment(
            ChangeContainerRepositoryCompartmentRequest request);

    /**
     * Moves a repository into a different compartment within the same tenancy. For information about moving
     * resources between compartments, see
     * [Moving Resources to a Different Compartment](https://docs.cloud.oracle.com/iaas/Content/Identity/Tasks/managingcompartments.htm#moveRes).
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation uses RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is provided.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/artifacts/ChangeRepositoryCompartmentExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use ChangeRepositoryCompartment API.
     */
    ChangeRepositoryCompartmentResponse changeRepositoryCompartment(
            ChangeRepositoryCompartmentRequest request);

    /**
     * Upload a signature to an image.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation uses RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is provided.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/artifacts/CreateContainerImageSignatureExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use CreateContainerImageSignature API.
     */
    CreateContainerImageSignatureResponse createContainerImageSignature(
            CreateContainerImageSignatureRequest request);

    /**
     * Create a new empty container repository. Avoid entering confidential information.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation uses RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is provided.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/artifacts/CreateContainerRepositoryExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use CreateContainerRepository API.
     */
    CreateContainerRepositoryResponse createContainerRepository(
            CreateContainerRepositoryRequest request);

    /**
     * Creates a new repository for storing artifacts.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation will not retry by default, users can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to enable retries for it.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/artifacts/CreateRepositoryExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use CreateRepository API.
     */
    CreateRepositoryResponse createRepository(CreateRepositoryRequest request);

    /**
     * Delete a container image.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation uses RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is provided.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/artifacts/DeleteContainerImageExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use DeleteContainerImage API.
     */
    DeleteContainerImageResponse deleteContainerImage(DeleteContainerImageRequest request);

    /**
     * Delete a container image signature.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation uses RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is provided.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/artifacts/DeleteContainerImageSignatureExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use DeleteContainerImageSignature API.
     */
    DeleteContainerImageSignatureResponse deleteContainerImageSignature(
            DeleteContainerImageSignatureRequest request);

    /**
     * Delete container repository.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation uses RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is provided.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/artifacts/DeleteContainerRepositoryExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use DeleteContainerRepository API.
     */
    DeleteContainerRepositoryResponse deleteContainerRepository(
            DeleteContainerRepositoryRequest request);

    /**
     * Deletes an artifact with a specified [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm).
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation uses RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is provided.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/artifacts/DeleteGenericArtifactExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use DeleteGenericArtifact API.
     */
    DeleteGenericArtifactResponse deleteGenericArtifact(DeleteGenericArtifactRequest request);

    /**
     * Deletes an artifact with a specified `artifactPath` and `version`.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation uses RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is provided.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/artifacts/DeleteGenericArtifactByPathExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use DeleteGenericArtifactByPath API.
     */
    DeleteGenericArtifactByPathResponse deleteGenericArtifactByPath(
            DeleteGenericArtifactByPathRequest request);

    /**
     * Deletes the specified repository. This operation fails unless all associated artifacts are in a DELETED state. You must delete all associated artifacts before deleting a repository.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation uses RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is provided.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/artifacts/DeleteRepositoryExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use DeleteRepository API.
     */
    DeleteRepositoryResponse deleteRepository(DeleteRepositoryRequest request);

    /**
     * Get container configuration.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation uses RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is provided.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/artifacts/GetContainerConfigurationExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use GetContainerConfiguration API.
     */
    GetContainerConfigurationResponse getContainerConfiguration(
            GetContainerConfigurationRequest request);

    /**
     * Get container image metadata.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation uses RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is provided.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/artifacts/GetContainerImageExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use GetContainerImage API.
     */
    GetContainerImageResponse getContainerImage(GetContainerImageRequest request);

    /**
     * Get container image signature metadata.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation uses RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is provided.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/artifacts/GetContainerImageSignatureExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use GetContainerImageSignature API.
     */
    GetContainerImageSignatureResponse getContainerImageSignature(
            GetContainerImageSignatureRequest request);

    /**
     * Get container repository.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation uses RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is provided.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/artifacts/GetContainerRepositoryExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use GetContainerRepository API.
     */
    GetContainerRepositoryResponse getContainerRepository(GetContainerRepositoryRequest request);

    /**
     * Gets information about an artifact with a specified [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm).
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation uses RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is provided.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/artifacts/GetGenericArtifactExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use GetGenericArtifact API.
     */
    GetGenericArtifactResponse getGenericArtifact(GetGenericArtifactRequest request);

    /**
     * Gets information about an artifact with a specified `artifactPath` and `version`.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation uses RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is provided.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/artifacts/GetGenericArtifactByPathExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use GetGenericArtifactByPath API.
     */
    GetGenericArtifactByPathResponse getGenericArtifactByPath(
            GetGenericArtifactByPathRequest request);

    /**
     * Gets the specified repository's information.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation uses RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is provided.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/artifacts/GetRepositoryExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use GetRepository API.
     */
    GetRepositoryResponse getRepository(GetRepositoryRequest request);

    /**
     * List container image signatures in an image.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation uses RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is provided.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/artifacts/ListContainerImageSignaturesExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use ListContainerImageSignatures API.
     */
    ListContainerImageSignaturesResponse listContainerImageSignatures(
            ListContainerImageSignaturesRequest request);

    /**
     * List container images in a compartment.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation uses RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is provided.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/artifacts/ListContainerImagesExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use ListContainerImages API.
     */
    ListContainerImagesResponse listContainerImages(ListContainerImagesRequest request);

    /**
     * List container repositories in a compartment.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation uses RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is provided.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/artifacts/ListContainerRepositoriesExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use ListContainerRepositories API.
     */
    ListContainerRepositoriesResponse listContainerRepositories(
            ListContainerRepositoriesRequest request);

    /**
     * Lists artifacts in the specified repository.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation uses RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is provided.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/artifacts/ListGenericArtifactsExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use ListGenericArtifacts API.
     */
    ListGenericArtifactsResponse listGenericArtifacts(ListGenericArtifactsRequest request);

    /**
     * Lists repositories in the specified compartment.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation uses RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is provided.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/artifacts/ListRepositoriesExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use ListRepositories API.
     */
    ListRepositoriesResponse listRepositories(ListRepositoriesRequest request);

    /**
     * Remove version from container image.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation uses RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is provided.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/artifacts/RemoveContainerVersionExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use RemoveContainerVersion API.
     */
    RemoveContainerVersionResponse removeContainerVersion(RemoveContainerVersionRequest request);

    /**
     * Restore a container image.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation uses RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is provided.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/artifacts/RestoreContainerImageExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use RestoreContainerImage API.
     */
    RestoreContainerImageResponse restoreContainerImage(RestoreContainerImageRequest request);

    /**
     * Update container configuration.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation uses RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is provided.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/artifacts/UpdateContainerConfigurationExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use UpdateContainerConfiguration API.
     */
    UpdateContainerConfigurationResponse updateContainerConfiguration(
            UpdateContainerConfigurationRequest request);

    /**
     * Modify the properties of a container image. Avoid entering confidential information.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation uses RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is provided.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/artifacts/UpdateContainerImageExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use UpdateContainerImage API.
     */
    UpdateContainerImageResponse updateContainerImage(UpdateContainerImageRequest request);

    /**
     * Modify the properties of a container image signature. Avoid entering confidential information.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation uses RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is provided.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/artifacts/UpdateContainerImageSignatureExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use UpdateContainerImageSignature API.
     */
    UpdateContainerImageSignatureResponse updateContainerImageSignature(
            UpdateContainerImageSignatureRequest request);

    /**
     * Modify the properties of a container repository. Avoid entering confidential information.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation uses RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is provided.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/artifacts/UpdateContainerRepositoryExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use UpdateContainerRepository API.
     */
    UpdateContainerRepositoryResponse updateContainerRepository(
            UpdateContainerRepositoryRequest request);

    /**
     * Updates the artifact with the specified [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm). You can only update the tags of an artifact.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation uses RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is provided.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/artifacts/UpdateGenericArtifactExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use UpdateGenericArtifact API.
     */
    UpdateGenericArtifactResponse updateGenericArtifact(UpdateGenericArtifactRequest request);

    /**
     * Updates an artifact with a specified `artifactPath` and `version`. You can only update the tags of an artifact.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation uses RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is provided.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/artifacts/UpdateGenericArtifactByPathExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use UpdateGenericArtifactByPath API.
     */
    UpdateGenericArtifactByPathResponse updateGenericArtifactByPath(
            UpdateGenericArtifactByPathRequest request);

    /**
     * Updates the properties of a repository. You can update the `displayName` and  `description` properties.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation uses RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is provided.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/artifacts/UpdateRepositoryExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use UpdateRepository API.
     */
    UpdateRepositoryResponse updateRepository(UpdateRepositoryRequest request);

    /**
     * Gets the pre-configured waiters available for resources for this service.
     *
     * @return The service waiters.
     */
    ArtifactsWaiters getWaiters();

    /**
     * Gets the pre-configured paginators available for list operations in this service which may return multiple
     * pages of data. These paginators provide an {@link java.lang.Iterable} interface so that service responses, or
     * resources/records, can be iterated through without having to manually deal with pagination and page tokens.
     *
     * @return The service paginators.
     */
    ArtifactsPaginators getPaginators();
}

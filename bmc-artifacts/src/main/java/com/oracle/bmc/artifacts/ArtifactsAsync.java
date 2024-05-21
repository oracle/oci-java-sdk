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
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
public interface ArtifactsAsync extends AutoCloseable {

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
     * Moves a container repository into a different compartment within the same tenancy. For information about moving
     * resources between compartments, see
     * [Moving Resources to a Different Compartment](https://docs.cloud.oracle.com/iaas/Content/Identity/Tasks/managingcompartments.htm#moveRes).
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<ChangeContainerRepositoryCompartmentResponse>
            changeContainerRepositoryCompartment(
                    ChangeContainerRepositoryCompartmentRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    ChangeContainerRepositoryCompartmentRequest,
                                    ChangeContainerRepositoryCompartmentResponse>
                            handler);

    /**
     * Moves a repository into a different compartment within the same tenancy. For information about moving
     * resources between compartments, see
     * [Moving Resources to a Different Compartment](https://docs.cloud.oracle.com/iaas/Content/Identity/Tasks/managingcompartments.htm#moveRes).
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<ChangeRepositoryCompartmentResponse> changeRepositoryCompartment(
            ChangeRepositoryCompartmentRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            ChangeRepositoryCompartmentRequest, ChangeRepositoryCompartmentResponse>
                    handler);

    /**
     * Upload a signature to an image.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<CreateContainerImageSignatureResponse>
            createContainerImageSignature(
                    CreateContainerImageSignatureRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    CreateContainerImageSignatureRequest,
                                    CreateContainerImageSignatureResponse>
                            handler);

    /**
     * Create a new empty container repository. Avoid entering confidential information.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<CreateContainerRepositoryResponse> createContainerRepository(
            CreateContainerRepositoryRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            CreateContainerRepositoryRequest, CreateContainerRepositoryResponse>
                    handler);

    /**
     * Creates a new repository for storing artifacts.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<CreateRepositoryResponse> createRepository(
            CreateRepositoryRequest request,
            com.oracle.bmc.responses.AsyncHandler<CreateRepositoryRequest, CreateRepositoryResponse>
                    handler);

    /**
     * Delete a container image.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<DeleteContainerImageResponse> deleteContainerImage(
            DeleteContainerImageRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            DeleteContainerImageRequest, DeleteContainerImageResponse>
                    handler);

    /**
     * Delete a container image signature.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<DeleteContainerImageSignatureResponse>
            deleteContainerImageSignature(
                    DeleteContainerImageSignatureRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    DeleteContainerImageSignatureRequest,
                                    DeleteContainerImageSignatureResponse>
                            handler);

    /**
     * Delete container repository.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<DeleteContainerRepositoryResponse> deleteContainerRepository(
            DeleteContainerRepositoryRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            DeleteContainerRepositoryRequest, DeleteContainerRepositoryResponse>
                    handler);

    /**
     * Deletes an artifact with a specified [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm).
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<DeleteGenericArtifactResponse> deleteGenericArtifact(
            DeleteGenericArtifactRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            DeleteGenericArtifactRequest, DeleteGenericArtifactResponse>
                    handler);

    /**
     * Deletes an artifact with a specified `artifactPath` and `version`.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<DeleteGenericArtifactByPathResponse> deleteGenericArtifactByPath(
            DeleteGenericArtifactByPathRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            DeleteGenericArtifactByPathRequest, DeleteGenericArtifactByPathResponse>
                    handler);

    /**
     * Deletes the specified repository. This operation fails unless all associated artifacts are in a DELETED state. You must delete all associated artifacts before deleting a repository.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<DeleteRepositoryResponse> deleteRepository(
            DeleteRepositoryRequest request,
            com.oracle.bmc.responses.AsyncHandler<DeleteRepositoryRequest, DeleteRepositoryResponse>
                    handler);

    /**
     * Get container configuration.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<GetContainerConfigurationResponse> getContainerConfiguration(
            GetContainerConfigurationRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            GetContainerConfigurationRequest, GetContainerConfigurationResponse>
                    handler);

    /**
     * Get container image metadata.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<GetContainerImageResponse> getContainerImage(
            GetContainerImageRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            GetContainerImageRequest, GetContainerImageResponse>
                    handler);

    /**
     * Get container image signature metadata.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<GetContainerImageSignatureResponse> getContainerImageSignature(
            GetContainerImageSignatureRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            GetContainerImageSignatureRequest, GetContainerImageSignatureResponse>
                    handler);

    /**
     * Get container repository.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<GetContainerRepositoryResponse> getContainerRepository(
            GetContainerRepositoryRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            GetContainerRepositoryRequest, GetContainerRepositoryResponse>
                    handler);

    /**
     * Gets information about an artifact with a specified [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm).
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<GetGenericArtifactResponse> getGenericArtifact(
            GetGenericArtifactRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            GetGenericArtifactRequest, GetGenericArtifactResponse>
                    handler);

    /**
     * Gets information about an artifact with a specified `artifactPath` and `version`.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<GetGenericArtifactByPathResponse> getGenericArtifactByPath(
            GetGenericArtifactByPathRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            GetGenericArtifactByPathRequest, GetGenericArtifactByPathResponse>
                    handler);

    /**
     * Gets the specified repository's information.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<GetRepositoryResponse> getRepository(
            GetRepositoryRequest request,
            com.oracle.bmc.responses.AsyncHandler<GetRepositoryRequest, GetRepositoryResponse>
                    handler);

    /**
     * List container image signatures in an image.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<ListContainerImageSignaturesResponse> listContainerImageSignatures(
            ListContainerImageSignaturesRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            ListContainerImageSignaturesRequest,
                            ListContainerImageSignaturesResponse>
                    handler);

    /**
     * List container images in a compartment.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<ListContainerImagesResponse> listContainerImages(
            ListContainerImagesRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            ListContainerImagesRequest, ListContainerImagesResponse>
                    handler);

    /**
     * List container repositories in a compartment.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<ListContainerRepositoriesResponse> listContainerRepositories(
            ListContainerRepositoriesRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            ListContainerRepositoriesRequest, ListContainerRepositoriesResponse>
                    handler);

    /**
     * Lists artifacts in the specified repository.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<ListGenericArtifactsResponse> listGenericArtifacts(
            ListGenericArtifactsRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            ListGenericArtifactsRequest, ListGenericArtifactsResponse>
                    handler);

    /**
     * Lists repositories in the specified compartment.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<ListRepositoriesResponse> listRepositories(
            ListRepositoriesRequest request,
            com.oracle.bmc.responses.AsyncHandler<ListRepositoriesRequest, ListRepositoriesResponse>
                    handler);

    /**
     * Remove version from container image.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<RemoveContainerVersionResponse> removeContainerVersion(
            RemoveContainerVersionRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            RemoveContainerVersionRequest, RemoveContainerVersionResponse>
                    handler);

    /**
     * Restore a container image.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<RestoreContainerImageResponse> restoreContainerImage(
            RestoreContainerImageRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            RestoreContainerImageRequest, RestoreContainerImageResponse>
                    handler);

    /**
     * Update container configuration.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<UpdateContainerConfigurationResponse> updateContainerConfiguration(
            UpdateContainerConfigurationRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            UpdateContainerConfigurationRequest,
                            UpdateContainerConfigurationResponse>
                    handler);

    /**
     * Modify the properties of a container image. Avoid entering confidential information.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<UpdateContainerImageResponse> updateContainerImage(
            UpdateContainerImageRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            UpdateContainerImageRequest, UpdateContainerImageResponse>
                    handler);

    /**
     * Modify the properties of a container image signature. Avoid entering confidential information.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<UpdateContainerImageSignatureResponse>
            updateContainerImageSignature(
                    UpdateContainerImageSignatureRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    UpdateContainerImageSignatureRequest,
                                    UpdateContainerImageSignatureResponse>
                            handler);

    /**
     * Modify the properties of a container repository. Avoid entering confidential information.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<UpdateContainerRepositoryResponse> updateContainerRepository(
            UpdateContainerRepositoryRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            UpdateContainerRepositoryRequest, UpdateContainerRepositoryResponse>
                    handler);

    /**
     * Updates the artifact with the specified [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm). You can only update the tags of an artifact.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<UpdateGenericArtifactResponse> updateGenericArtifact(
            UpdateGenericArtifactRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            UpdateGenericArtifactRequest, UpdateGenericArtifactResponse>
                    handler);

    /**
     * Updates an artifact with a specified `artifactPath` and `version`. You can only update the tags of an artifact.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<UpdateGenericArtifactByPathResponse> updateGenericArtifactByPath(
            UpdateGenericArtifactByPathRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            UpdateGenericArtifactByPathRequest, UpdateGenericArtifactByPathResponse>
                    handler);

    /**
     * Updates the properties of a repository. You can update the `displayName` and  `description` properties.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<UpdateRepositoryResponse> updateRepository(
            UpdateRepositoryRequest request,
            com.oracle.bmc.responses.AsyncHandler<UpdateRepositoryRequest, UpdateRepositoryResponse>
                    handler);
}

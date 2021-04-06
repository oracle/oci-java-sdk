/**
 * Copyright (c) 2016, 2021, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.artifacts;

import com.oracle.bmc.artifacts.requests.*;
import com.oracle.bmc.artifacts.responses.*;

/**
 * API covering the [Registry](https://docs.cloud.oracle.com/iaas/Content/Registry/Concepts/registryoverview.htm) services.
 * Use this API to manage resources such as container images and repositories.
 *
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
public interface Artifacts extends AutoCloseable {

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
     * Moves a container repository into a different compartment within the same tenancy. For information about moving
     * resources between compartments, see
     * [Moving Resources to a Different Compartment](https://docs.cloud.oracle.com/iaas/Content/Identity/Tasks/managingcompartments.htm#moveRes).
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/artifacts/ChangeContainerRepositoryCompartmentExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use ChangeContainerRepositoryCompartment API.
     */
    ChangeContainerRepositoryCompartmentResponse changeContainerRepositoryCompartment(
            ChangeContainerRepositoryCompartmentRequest request);

    /**
     * Upload a signature to an image.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
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
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/artifacts/CreateContainerRepositoryExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use CreateContainerRepository API.
     */
    CreateContainerRepositoryResponse createContainerRepository(
            CreateContainerRepositoryRequest request);

    /**
     * Delete a container image.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/artifacts/DeleteContainerImageExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use DeleteContainerImage API.
     */
    DeleteContainerImageResponse deleteContainerImage(DeleteContainerImageRequest request);

    /**
     * Delete a container image signature.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
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
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/artifacts/DeleteContainerRepositoryExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use DeleteContainerRepository API.
     */
    DeleteContainerRepositoryResponse deleteContainerRepository(
            DeleteContainerRepositoryRequest request);

    /**
     * Get container configuration.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
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
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/artifacts/GetContainerImageExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use GetContainerImage API.
     */
    GetContainerImageResponse getContainerImage(GetContainerImageRequest request);

    /**
     * Get container image signature metadata.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
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
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/artifacts/GetContainerRepositoryExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use GetContainerRepository API.
     */
    GetContainerRepositoryResponse getContainerRepository(GetContainerRepositoryRequest request);

    /**
     * List container image signatures in an image.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
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
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/artifacts/ListContainerImagesExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use ListContainerImages API.
     */
    ListContainerImagesResponse listContainerImages(ListContainerImagesRequest request);

    /**
     * List container repositories in a compartment.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/artifacts/ListContainerRepositoriesExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use ListContainerRepositories API.
     */
    ListContainerRepositoriesResponse listContainerRepositories(
            ListContainerRepositoriesRequest request);

    /**
     * Remove version from container image.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/artifacts/RemoveContainerVersionExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use RemoveContainerVersion API.
     */
    RemoveContainerVersionResponse removeContainerVersion(RemoveContainerVersionRequest request);

    /**
     * Restore a container image.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/artifacts/RestoreContainerImageExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use RestoreContainerImage API.
     */
    RestoreContainerImageResponse restoreContainerImage(RestoreContainerImageRequest request);

    /**
     * Update container configuration.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/artifacts/UpdateContainerConfigurationExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use UpdateContainerConfiguration API.
     */
    UpdateContainerConfigurationResponse updateContainerConfiguration(
            UpdateContainerConfigurationRequest request);

    /**
     * Modify the properties of a container repository. Avoid entering confidential information.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/artifacts/UpdateContainerRepositoryExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use UpdateContainerRepository API.
     */
    UpdateContainerRepositoryResponse updateContainerRepository(
            UpdateContainerRepositoryRequest request);

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

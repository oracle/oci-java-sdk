/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.iot;

import com.oracle.bmc.iot.requests.*;
import com.oracle.bmc.iot.responses.*;

/**
 * Use the Internet of Things (IoT) API to manage IoT domain groups, domains, and digital twin
 * resources including models, adapters, instances, and relationships. For more information, see
 * [Internet of Things](https://docs.oracle.com/iaas/Content/internet-of-things/home.htm).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20250531")
public interface IotAsync extends AutoCloseable {

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
     * Moves an IoT domain to a different compartment within the same tenancy. For information about
     * moving resources between compartments, see [Moving Resources to a Different
     * Compartment](https://docs.oracle.com/iaas/Content/Identity/Tasks/managingcompartments.htm#moveRes).
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ChangeIotDomainCompartmentResponse> changeIotDomainCompartment(
            ChangeIotDomainCompartmentRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            ChangeIotDomainCompartmentRequest, ChangeIotDomainCompartmentResponse>
                    handler);

    /**
     * Updates Data Retention Period of the IoT Domain.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ChangeIotDomainDataRetentionPeriodResponse>
            changeIotDomainDataRetentionPeriod(
                    ChangeIotDomainDataRetentionPeriodRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    ChangeIotDomainDataRetentionPeriodRequest,
                                    ChangeIotDomainDataRetentionPeriodResponse>
                            handler);

    /**
     * Moves an IoT domain group to a different compartment within the same tenancy. For information
     * about moving resources between compartments, see [Moving Resources to a Different
     * Compartment](https://docs.oracle.com/iaas/Content/Identity/Tasks/managingcompartments.htm#moveRes).
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ChangeIotDomainGroupCompartmentResponse>
            changeIotDomainGroupCompartment(
                    ChangeIotDomainGroupCompartmentRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    ChangeIotDomainGroupCompartmentRequest,
                                    ChangeIotDomainGroupCompartmentResponse>
                            handler);

    /**
     * Updates an IoT domain Data Access.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ConfigureIotDomainDataAccessResponse> configureIotDomainDataAccess(
            ConfigureIotDomainDataAccessRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            ConfigureIotDomainDataAccessRequest,
                            ConfigureIotDomainDataAccessResponse>
                    handler);

    /**
     * Updates an IoT domain Group Data Access.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ConfigureIotDomainGroupDataAccessResponse>
            configureIotDomainGroupDataAccess(
                    ConfigureIotDomainGroupDataAccessRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    ConfigureIotDomainGroupDataAccessRequest,
                                    ConfigureIotDomainGroupDataAccessResponse>
                            handler);

    /**
     * Creates a new digital twin adapter.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<CreateDigitalTwinAdapterResponse> createDigitalTwinAdapter(
            CreateDigitalTwinAdapterRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            CreateDigitalTwinAdapterRequest, CreateDigitalTwinAdapterResponse>
                    handler);

    /**
     * Creates a new digital twin instance.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<CreateDigitalTwinInstanceResponse> createDigitalTwinInstance(
            CreateDigitalTwinInstanceRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            CreateDigitalTwinInstanceRequest, CreateDigitalTwinInstanceResponse>
                    handler);

    /**
     * Creates a new digital twin model.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<CreateDigitalTwinModelResponse> createDigitalTwinModel(
            CreateDigitalTwinModelRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            CreateDigitalTwinModelRequest, CreateDigitalTwinModelResponse>
                    handler);

    /**
     * Creates a new digital twin relationship.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<CreateDigitalTwinRelationshipResponse>
            createDigitalTwinRelationship(
                    CreateDigitalTwinRelationshipRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    CreateDigitalTwinRelationshipRequest,
                                    CreateDigitalTwinRelationshipResponse>
                            handler);

    /**
     * Creates a new IoT domain.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<CreateIotDomainResponse> createIotDomain(
            CreateIotDomainRequest request,
            com.oracle.bmc.responses.AsyncHandler<CreateIotDomainRequest, CreateIotDomainResponse>
                    handler);

    /**
     * Creates a new IoT domain group.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<CreateIotDomainGroupResponse> createIotDomainGroup(
            CreateIotDomainGroupRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            CreateIotDomainGroupRequest, CreateIotDomainGroupResponse>
                    handler);

    /**
     * Deletes the digital twin adapter identified by the specified OCID.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<DeleteDigitalTwinAdapterResponse> deleteDigitalTwinAdapter(
            DeleteDigitalTwinAdapterRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            DeleteDigitalTwinAdapterRequest, DeleteDigitalTwinAdapterResponse>
                    handler);

    /**
     * Deletes the digital twin instance identified by the specified OCID.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<DeleteDigitalTwinInstanceResponse> deleteDigitalTwinInstance(
            DeleteDigitalTwinInstanceRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            DeleteDigitalTwinInstanceRequest, DeleteDigitalTwinInstanceResponse>
                    handler);

    /**
     * Deletes the digital twin model identified by the specified OCID.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<DeleteDigitalTwinModelResponse> deleteDigitalTwinModel(
            DeleteDigitalTwinModelRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            DeleteDigitalTwinModelRequest, DeleteDigitalTwinModelResponse>
                    handler);

    /**
     * Deletes the digital twin relationship identified by the specified OCID.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<DeleteDigitalTwinRelationshipResponse>
            deleteDigitalTwinRelationship(
                    DeleteDigitalTwinRelationshipRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    DeleteDigitalTwinRelationshipRequest,
                                    DeleteDigitalTwinRelationshipResponse>
                            handler);

    /**
     * Deletes the IoT domain identified by the specified OCID.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<DeleteIotDomainResponse> deleteIotDomain(
            DeleteIotDomainRequest request,
            com.oracle.bmc.responses.AsyncHandler<DeleteIotDomainRequest, DeleteIotDomainResponse>
                    handler);

    /**
     * Deletes the IoT domain group identified by the specified OCID.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<DeleteIotDomainGroupResponse> deleteIotDomainGroup(
            DeleteIotDomainGroupRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            DeleteIotDomainGroupRequest, DeleteIotDomainGroupResponse>
                    handler);

    /**
     * Retrieves the digital twin adapter identified by the specified OCID.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<GetDigitalTwinAdapterResponse> getDigitalTwinAdapter(
            GetDigitalTwinAdapterRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            GetDigitalTwinAdapterRequest, GetDigitalTwinAdapterResponse>
                    handler);

    /**
     * Retrieves the digital twin instance identified by the specified OCID.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<GetDigitalTwinInstanceResponse> getDigitalTwinInstance(
            GetDigitalTwinInstanceRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            GetDigitalTwinInstanceRequest, GetDigitalTwinInstanceResponse>
                    handler);

    /**
     * Retrieves the latest snapshot data of digital twin instance identified by the specified OCID.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<GetDigitalTwinInstanceContentResponse>
            getDigitalTwinInstanceContent(
                    GetDigitalTwinInstanceContentRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    GetDigitalTwinInstanceContentRequest,
                                    GetDigitalTwinInstanceContentResponse>
                            handler);

    /**
     * Retrieves the digital twin model identified by the specified OCID.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<GetDigitalTwinModelResponse> getDigitalTwinModel(
            GetDigitalTwinModelRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            GetDigitalTwinModelRequest, GetDigitalTwinModelResponse>
                    handler);

    /**
     * Retrieves the spec of digital twin model identified by the specified OCID.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<GetDigitalTwinModelSpecResponse> getDigitalTwinModelSpec(
            GetDigitalTwinModelSpecRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            GetDigitalTwinModelSpecRequest, GetDigitalTwinModelSpecResponse>
                    handler);

    /**
     * Retrieves the digital twin relationship identified by the specified OCID.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<GetDigitalTwinRelationshipResponse> getDigitalTwinRelationship(
            GetDigitalTwinRelationshipRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            GetDigitalTwinRelationshipRequest, GetDigitalTwinRelationshipResponse>
                    handler);

    /**
     * Retrieves the IoT domain identified by the specified OCID.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<GetIotDomainResponse> getIotDomain(
            GetIotDomainRequest request,
            com.oracle.bmc.responses.AsyncHandler<GetIotDomainRequest, GetIotDomainResponse>
                    handler);

    /**
     * Retrieves the IoT domain group identified by the specified OCID.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<GetIotDomainGroupResponse> getIotDomainGroup(
            GetIotDomainGroupRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            GetIotDomainGroupRequest, GetIotDomainGroupResponse>
                    handler);

    /**
     * Retrieves the status of the work request with the given ID.
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
     * Invokes the raw command on the specified digital twin instance.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<InvokeRawCommandResponse> invokeRawCommand(
            InvokeRawCommandRequest request,
            com.oracle.bmc.responses.AsyncHandler<InvokeRawCommandRequest, InvokeRawCommandResponse>
                    handler);

    /**
     * Retrieves a list of digital twin adapters within the specified IoT domain.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ListDigitalTwinAdaptersResponse> listDigitalTwinAdapters(
            ListDigitalTwinAdaptersRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            ListDigitalTwinAdaptersRequest, ListDigitalTwinAdaptersResponse>
                    handler);

    /**
     * Retrieves a list of digital twin instances within the specified IoT domain.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ListDigitalTwinInstancesResponse> listDigitalTwinInstances(
            ListDigitalTwinInstancesRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            ListDigitalTwinInstancesRequest, ListDigitalTwinInstancesResponse>
                    handler);

    /**
     * Retrieves a list of digital twin models within the specified IoT domain.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ListDigitalTwinModelsResponse> listDigitalTwinModels(
            ListDigitalTwinModelsRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            ListDigitalTwinModelsRequest, ListDigitalTwinModelsResponse>
                    handler);

    /**
     * Retrieves a list of digital twin relationships within the specified IoT domain.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ListDigitalTwinRelationshipsResponse> listDigitalTwinRelationships(
            ListDigitalTwinRelationshipsRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            ListDigitalTwinRelationshipsRequest,
                            ListDigitalTwinRelationshipsResponse>
                    handler);

    /**
     * Retrieves a list of IoT domain groups within the specified compartment.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ListIotDomainGroupsResponse> listIotDomainGroups(
            ListIotDomainGroupsRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            ListIotDomainGroupsRequest, ListIotDomainGroupsResponse>
                    handler);

    /**
     * Retrieves a list of IoT domains within the specified compartment.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ListIotDomainsResponse> listIotDomains(
            ListIotDomainsRequest request,
            com.oracle.bmc.responses.AsyncHandler<ListIotDomainsRequest, ListIotDomainsResponse>
                    handler);

    /**
     * Lists errors associated with the specified work request.
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
     * Lists the logs associated with the specified work request.
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
     * Lists work requests in the specified compartment.
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
     * Updates the details of digital twin adapter identified by the specified OCID.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<UpdateDigitalTwinAdapterResponse> updateDigitalTwinAdapter(
            UpdateDigitalTwinAdapterRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            UpdateDigitalTwinAdapterRequest, UpdateDigitalTwinAdapterResponse>
                    handler);

    /**
     * Updates the details of digital twin instance identified by the specified OCID.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<UpdateDigitalTwinInstanceResponse> updateDigitalTwinInstance(
            UpdateDigitalTwinInstanceRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            UpdateDigitalTwinInstanceRequest, UpdateDigitalTwinInstanceResponse>
                    handler);

    /**
     * Updates the details of the digital twin model identified by the specified OCID.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<UpdateDigitalTwinModelResponse> updateDigitalTwinModel(
            UpdateDigitalTwinModelRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            UpdateDigitalTwinModelRequest, UpdateDigitalTwinModelResponse>
                    handler);

    /**
     * Updates the details of digital twin relationship identified by the specified OCID.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<UpdateDigitalTwinRelationshipResponse>
            updateDigitalTwinRelationship(
                    UpdateDigitalTwinRelationshipRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    UpdateDigitalTwinRelationshipRequest,
                                    UpdateDigitalTwinRelationshipResponse>
                            handler);

    /**
     * Updates the details of IoT domain identified by the specified OCID.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<UpdateIotDomainResponse> updateIotDomain(
            UpdateIotDomainRequest request,
            com.oracle.bmc.responses.AsyncHandler<UpdateIotDomainRequest, UpdateIotDomainResponse>
                    handler);

    /**
     * Updates the details of IoT domain group identified by the specified OCID.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<UpdateIotDomainGroupResponse> updateIotDomainGroup(
            UpdateIotDomainGroupRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            UpdateIotDomainGroupRequest, UpdateIotDomainGroupResponse>
                    handler);
}

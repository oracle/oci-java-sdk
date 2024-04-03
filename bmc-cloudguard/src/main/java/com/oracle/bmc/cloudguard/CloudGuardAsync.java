/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.cloudguard;

import com.oracle.bmc.cloudguard.requests.*;
import com.oracle.bmc.cloudguard.responses.*;

/**
 * Use the Cloud Guard and Security Zones API to automate processes that you would otherwise perform
 * through the Cloud Guard Console or the Security Zones Console. For more information on these
 * services, see the [Cloud Guard](https://docs.cloud.oracle.com/iaas/cloud-guard/home.htm) and
 * [Security Zones](https://docs.cloud.oracle.com/iaas/security-zone/home.htm) documentation.
 *
 * <p>*Note:** For Cloud Guard, you can perform Create, Update, and Delete operations only from the
 * reporting region of your Cloud Guard tenancy. You can perform Read operations from any region.
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200131")
public interface CloudGuardAsync extends AutoCloseable {

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
     * Add an existing compartment to a security zone. If you previously removed a subcompartment
     * from a security zone, you can add it back to the same security zone. The security zone
     * ensures that resources in the subcompartment comply with the security zone's policies.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<AddCompartmentResponse> addCompartment(
            AddCompartmentRequest request,
            com.oracle.bmc.responses.AsyncHandler<AddCompartmentRequest, AddCompartmentResponse>
                    handler);

    /**
     * Cancels the work request with the given ID.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<CancelWorkRequestResponse> cancelWorkRequest(
            CancelWorkRequestRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            CancelWorkRequestRequest, CancelWorkRequestResponse>
                    handler);

    /**
     * Moves the DataSource from current compartment to another.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ChangeDataSourceCompartmentResponse> changeDataSourceCompartment(
            ChangeDataSourceCompartmentRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            ChangeDataSourceCompartmentRequest, ChangeDataSourceCompartmentResponse>
                    handler);

    /**
     * Moves the detector recipe (DetectorRecipe object), identified by detectorRecipeId, from the
     * current compartment to another compartment.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ChangeDetectorRecipeCompartmentResponse>
            changeDetectorRecipeCompartment(
                    ChangeDetectorRecipeCompartmentRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    ChangeDetectorRecipeCompartmentRequest,
                                    ChangeDetectorRecipeCompartmentResponse>
                            handler);

    /**
     * Moves the managed list (ManagedList object), identified by managedListId, from the current
     * compartment to another compartment.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ChangeManagedListCompartmentResponse> changeManagedListCompartment(
            ChangeManagedListCompartmentRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            ChangeManagedListCompartmentRequest,
                            ChangeManagedListCompartmentResponse>
                    handler);

    /**
     * Moves the ResponderRecipe from current compartment to another.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ChangeResponderRecipeCompartmentResponse>
            changeResponderRecipeCompartment(
                    ChangeResponderRecipeCompartmentRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    ChangeResponderRecipeCompartmentRequest,
                                    ChangeResponderRecipeCompartmentResponse>
                            handler);

    /**
     * Moves a security zone recipe to a different compartment. When provided, `If-Match` is checked
     * against `ETag` values of the resource.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ChangeSecurityRecipeCompartmentResponse>
            changeSecurityRecipeCompartment(
                    ChangeSecurityRecipeCompartmentRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    ChangeSecurityRecipeCompartmentRequest,
                                    ChangeSecurityRecipeCompartmentResponse>
                            handler);

    /**
     * Moves a security zone to a different compartment. When provided, `If-Match` is checked
     * against `ETag` values of the resource.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ChangeSecurityZoneCompartmentResponse>
            changeSecurityZoneCompartment(
                    ChangeSecurityZoneCompartmentRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    ChangeSecurityZoneCompartmentRequest,
                                    ChangeSecurityZoneCompartmentResponse>
                            handler);

    /**
     * Creates a new DataMaskRule object definition.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<CreateDataMaskRuleResponse> createDataMaskRule(
            CreateDataMaskRuleRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            CreateDataMaskRuleRequest, CreateDataMaskRuleResponse>
                    handler);

    /**
     * Creates a DataSource
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<CreateDataSourceResponse> createDataSource(
            CreateDataSourceRequest request,
            com.oracle.bmc.responses.AsyncHandler<CreateDataSourceRequest, CreateDataSourceResponse>
                    handler);

    /**
     * Creates a new DetectorRecipe object.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<CreateDetectorRecipeResponse> createDetectorRecipe(
            CreateDetectorRecipeRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            CreateDetectorRecipeRequest, CreateDetectorRecipeResponse>
                    handler);

    /**
     * Create the DetectorRule
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<CreateDetectorRecipeDetectorRuleResponse>
            createDetectorRecipeDetectorRule(
                    CreateDetectorRecipeDetectorRuleRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    CreateDetectorRecipeDetectorRuleRequest,
                                    CreateDetectorRecipeDetectorRuleResponse>
                            handler);

    /**
     * Creates a new ManagedList object.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<CreateManagedListResponse> createManagedList(
            CreateManagedListRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            CreateManagedListRequest, CreateManagedListResponse>
                    handler);

    /**
     * Create a ResponderRecipe.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<CreateResponderRecipeResponse> createResponderRecipe(
            CreateResponderRecipeRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            CreateResponderRecipeRequest, CreateResponderRecipeResponse>
                    handler);

    /**
     * Creates a security zone recipe. A security zone recipe is a collection of security zone
     * policies.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<CreateSecurityRecipeResponse> createSecurityRecipe(
            CreateSecurityRecipeRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            CreateSecurityRecipeRequest, CreateSecurityRecipeResponse>
                    handler);

    /**
     * Creates a security zone for a compartment. A security zone enforces all security zone
     * policies in a given security zone recipe. Any actions that violate a policy are denied. By
     * default, any subcompartments are also in the same security zone.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<CreateSecurityZoneResponse> createSecurityZone(
            CreateSecurityZoneRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            CreateSecurityZoneRequest, CreateSecurityZoneResponse>
                    handler);

    /**
     * Creates a new Target
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<CreateTargetResponse> createTarget(
            CreateTargetRequest request,
            com.oracle.bmc.responses.AsyncHandler<CreateTargetRequest, CreateTargetResponse>
                    handler);

    /**
     * Attach a DetectorRecipe with the Target
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<CreateTargetDetectorRecipeResponse> createTargetDetectorRecipe(
            CreateTargetDetectorRecipeRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            CreateTargetDetectorRecipeRequest, CreateTargetDetectorRecipeResponse>
                    handler);

    /**
     * Attach a ResponderRecipe with the Target
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<CreateTargetResponderRecipeResponse> createTargetResponderRecipe(
            CreateTargetResponderRecipeRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            CreateTargetResponderRecipeRequest, CreateTargetResponderRecipeResponse>
                    handler);

    /**
     * Deletes a DataMaskRule object, identified by dataMaskRuleId.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<DeleteDataMaskRuleResponse> deleteDataMaskRule(
            DeleteDataMaskRuleRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            DeleteDataMaskRuleRequest, DeleteDataMaskRuleResponse>
                    handler);

    /**
     * Deletes a DataSource identified by dataSourceId
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<DeleteDataSourceResponse> deleteDataSource(
            DeleteDataSourceRequest request,
            com.oracle.bmc.responses.AsyncHandler<DeleteDataSourceRequest, DeleteDataSourceResponse>
                    handler);

    /**
     * Deletes a detector recipe (DetectorRecipe object) identified by detectorRecipeId.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<DeleteDetectorRecipeResponse> deleteDetectorRecipe(
            DeleteDetectorRecipeRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            DeleteDetectorRecipeRequest, DeleteDetectorRecipeResponse>
                    handler);

    /**
     * Deletes DetectorRecipeDetectorRule
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<DeleteDetectorRecipeDetectorRuleResponse>
            deleteDetectorRecipeDetectorRule(
                    DeleteDetectorRecipeDetectorRuleRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    DeleteDetectorRecipeDetectorRuleRequest,
                                    DeleteDetectorRecipeDetectorRuleResponse>
                            handler);

    /**
     * Delete the DetectorRecipeDetectorRuleDataSource resource by identifier
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<DeleteDetectorRecipeDetectorRuleDataSourceResponse>
            deleteDetectorRecipeDetectorRuleDataSource(
                    DeleteDetectorRecipeDetectorRuleDataSourceRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    DeleteDetectorRecipeDetectorRuleDataSourceRequest,
                                    DeleteDetectorRecipeDetectorRuleDataSourceResponse>
                            handler);

    /**
     * Deletes a managed list identified by managedListId.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<DeleteManagedListResponse> deleteManagedList(
            DeleteManagedListRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            DeleteManagedListRequest, DeleteManagedListResponse>
                    handler);

    /**
     * Delete the ResponderRecipe resource by identifier
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<DeleteResponderRecipeResponse> deleteResponderRecipe(
            DeleteResponderRecipeRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            DeleteResponderRecipeRequest, DeleteResponderRecipeResponse>
                    handler);

    /**
     * Deletes a security zone recipe. The recipe can't be associated with an existing security
     * zone.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<DeleteSecurityRecipeResponse> deleteSecurityRecipe(
            DeleteSecurityRecipeRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            DeleteSecurityRecipeRequest, DeleteSecurityRecipeResponse>
                    handler);

    /**
     * Deletes an existing security zone with a given identifier.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<DeleteSecurityZoneResponse> deleteSecurityZone(
            DeleteSecurityZoneRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            DeleteSecurityZoneRequest, DeleteSecurityZoneResponse>
                    handler);

    /**
     * Deletes a Target identified by targetId
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<DeleteTargetResponse> deleteTarget(
            DeleteTargetRequest request,
            com.oracle.bmc.responses.AsyncHandler<DeleteTargetRequest, DeleteTargetResponse>
                    handler);

    /**
     * Delete the TargetDetectorRecipe resource by identifier
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<DeleteTargetDetectorRecipeResponse> deleteTargetDetectorRecipe(
            DeleteTargetDetectorRecipeRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            DeleteTargetDetectorRecipeRequest, DeleteTargetDetectorRecipeResponse>
                    handler);

    /**
     * Delete the TargetResponderRecipe resource by identifier
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<DeleteTargetResponderRecipeResponse> deleteTargetResponderRecipe(
            DeleteTargetResponderRecipeRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            DeleteTargetResponderRecipeRequest, DeleteTargetResponderRecipeResponse>
                    handler);

    /**
     * Executes the responder execution. When provided, If-Match is checked against ETag values of
     * the resource.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ExecuteResponderExecutionResponse> executeResponderExecution(
            ExecuteResponderExecutionRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            ExecuteResponderExecutionRequest, ExecuteResponderExecutionResponse>
                    handler);

    /**
     * Returns a ConditionMetatDataType object with its details.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<GetConditionMetadataTypeResponse> getConditionMetadataType(
            GetConditionMetadataTypeRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            GetConditionMetadataTypeRequest, GetConditionMetadataTypeResponse>
                    handler);

    /**
     * Returns the configuration details for a Cloud Guard tenancy, identified by root compartment
     * OCID.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<GetConfigurationResponse> getConfiguration(
            GetConfigurationRequest request,
            com.oracle.bmc.responses.AsyncHandler<GetConfigurationRequest, GetConfigurationResponse>
                    handler);

    /**
     * Returns a DataMaskRule object, identified by DataMaskRuleId.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<GetDataMaskRuleResponse> getDataMaskRule(
            GetDataMaskRuleRequest request,
            com.oracle.bmc.responses.AsyncHandler<GetDataMaskRuleRequest, GetDataMaskRuleResponse>
                    handler);

    /**
     * Returns a DataSource identified by dataSourceId
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<GetDataSourceResponse> getDataSource(
            GetDataSourceRequest request,
            com.oracle.bmc.responses.AsyncHandler<GetDataSourceRequest, GetDataSourceResponse>
                    handler);

    /**
     * Returns a Detector object, identified by detectorId.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<GetDetectorResponse> getDetector(
            GetDetectorRequest request,
            com.oracle.bmc.responses.AsyncHandler<GetDetectorRequest, GetDetectorResponse> handler);

    /**
     * Returns a detector recipe (DetectorRecipe object) identified by detectorRecipeId.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<GetDetectorRecipeResponse> getDetectorRecipe(
            GetDetectorRecipeRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            GetDetectorRecipeRequest, GetDetectorRecipeResponse>
                    handler);

    /**
     * Returns a detector rule (DetectorRule object) identified by detectorRuleId.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<GetDetectorRecipeDetectorRuleResponse>
            getDetectorRecipeDetectorRule(
                    GetDetectorRecipeDetectorRuleRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    GetDetectorRecipeDetectorRuleRequest,
                                    GetDetectorRecipeDetectorRuleResponse>
                            handler);

    /**
     * Returns a detector rule (DetectorRule object) identified by detectorRuleId.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<GetDetectorRuleResponse> getDetectorRule(
            GetDetectorRuleRequest request,
            com.oracle.bmc.responses.AsyncHandler<GetDetectorRuleRequest, GetDetectorRuleResponse>
                    handler);

    /**
     * Returns a managed list identified by managedListId.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<GetManagedListResponse> getManagedList(
            GetManagedListRequest request,
            com.oracle.bmc.responses.AsyncHandler<GetManagedListRequest, GetManagedListResponse>
                    handler);

    /**
     * Returns the Problem object identified by a problemId.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<GetProblemResponse> getProblem(
            GetProblemRequest request,
            com.oracle.bmc.responses.AsyncHandler<GetProblemRequest, GetProblemResponse> handler);

    /**
     * Returns resource profile details
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<GetResourceProfileResponse> getResourceProfile(
            GetResourceProfileRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            GetResourceProfileRequest, GetResourceProfileResponse>
                    handler);

    /**
     * Returns a Responder Execution identified by responderExecutionId
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<GetResponderExecutionResponse> getResponderExecution(
            GetResponderExecutionRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            GetResponderExecutionRequest, GetResponderExecutionResponse>
                    handler);

    /**
     * Get a ResponderRecipe by identifier
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<GetResponderRecipeResponse> getResponderRecipe(
            GetResponderRecipeRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            GetResponderRecipeRequest, GetResponderRecipeResponse>
                    handler);

    /**
     * Get ResponderRule by identifier
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<GetResponderRecipeResponderRuleResponse>
            getResponderRecipeResponderRule(
                    GetResponderRecipeResponderRuleRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    GetResponderRecipeResponderRuleRequest,
                                    GetResponderRecipeResponderRuleResponse>
                            handler);

    /**
     * Get a ResponderRule by identifier
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<GetResponderRuleResponse> getResponderRule(
            GetResponderRuleRequest request,
            com.oracle.bmc.responses.AsyncHandler<GetResponderRuleRequest, GetResponderRuleResponse>
                    handler);

    /**
     * Gets a security zone policy using its identifier. When a policy is enabled in a security
     * zone, then any action in the zone that attempts to violate that policy is denied.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<GetSecurityPolicyResponse> getSecurityPolicy(
            GetSecurityPolicyRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            GetSecurityPolicyRequest, GetSecurityPolicyResponse>
                    handler);

    /**
     * Gets a security zone recipe by identifier. A security zone recipe is a collection of security
     * zone policies.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<GetSecurityRecipeResponse> getSecurityRecipe(
            GetSecurityRecipeRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            GetSecurityRecipeRequest, GetSecurityRecipeResponse>
                    handler);

    /**
     * Gets a security zone by its identifier. A security zone is associated with a security zone
     * recipe and enforces all security zone policies in the recipe. Any actions in the zone's
     * compartments that violate a policy are denied.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<GetSecurityZoneResponse> getSecurityZone(
            GetSecurityZoneRequest request,
            com.oracle.bmc.responses.AsyncHandler<GetSecurityZoneRequest, GetSecurityZoneResponse>
                    handler);

    /**
     * Returns Sighting details
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<GetSightingResponse> getSighting(
            GetSightingRequest request,
            com.oracle.bmc.responses.AsyncHandler<GetSightingRequest, GetSightingResponse> handler);

    /**
     * Returns a Target identified by targetId
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<GetTargetResponse> getTarget(
            GetTargetRequest request,
            com.oracle.bmc.responses.AsyncHandler<GetTargetRequest, GetTargetResponse> handler);

    /**
     * Get a TargetDetectorRecipe by identifier
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<GetTargetDetectorRecipeResponse> getTargetDetectorRecipe(
            GetTargetDetectorRecipeRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            GetTargetDetectorRecipeRequest, GetTargetDetectorRecipeResponse>
                    handler);

    /**
     * Get DetectorRule by identifier
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<GetTargetDetectorRecipeDetectorRuleResponse>
            getTargetDetectorRecipeDetectorRule(
                    GetTargetDetectorRecipeDetectorRuleRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    GetTargetDetectorRecipeDetectorRuleRequest,
                                    GetTargetDetectorRecipeDetectorRuleResponse>
                            handler);

    /**
     * Get a TargetResponderRecipe by identifier
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<GetTargetResponderRecipeResponse> getTargetResponderRecipe(
            GetTargetResponderRecipeRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            GetTargetResponderRecipeRequest, GetTargetResponderRecipeResponse>
                    handler);

    /**
     * Get ResponderRule by identifier
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<GetTargetResponderRecipeResponderRuleResponse>
            getTargetResponderRecipeResponderRule(
                    GetTargetResponderRecipeResponderRuleRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    GetTargetResponderRecipeResponderRuleRequest,
                                    GetTargetResponderRecipeResponderRuleResponse>
                            handler);

    /**
     * Gets details of the work request with the given ID.
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
     * Returns a list of ConditionMetadataType objects.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ListConditionMetadataTypesResponse> listConditionMetadataTypes(
            ListConditionMetadataTypesRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            ListConditionMetadataTypesRequest, ListConditionMetadataTypesResponse>
                    handler);

    /**
     * Returns a list of all DataMaskRule objects in the specified compartmentId (OCID) and its
     * subcompartments.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ListDataMaskRulesResponse> listDataMaskRules(
            ListDataMaskRulesRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            ListDataMaskRulesRequest, ListDataMaskRulesResponse>
                    handler);

    /**
     * Returns a list of events from CloudGuard DataSource
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ListDataSourceEventsResponse> listDataSourceEvents(
            ListDataSourceEventsRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            ListDataSourceEventsRequest, ListDataSourceEventsResponse>
                    handler);

    /**
     * Returns a list of all Data Sources in a compartment
     *
     * <p>The ListDataSources operation returns only the data Sources in `compartmentId` passed. The
     * list does not include any subcompartments of the compartmentId passed.
     *
     * <p>The parameter `accessLevel` specifies whether to return only those compartments for which
     * the requestor has INSPECT permissions on at least one resource directly or indirectly
     * (ACCESSIBLE) (the resource can be in a subcompartment) or to return Not Authorized if
     * Principal doesn't have access to even one of the child compartments. This is valid only when
     * `compartmentIdInSubtree` is set to `true`.
     *
     * <p>The parameter `compartmentIdInSubtree` applies when you perform ListdataSources on the
     * `compartmentId` passed and when it is set to true, the entire hierarchy of compartments can
     * be returned. To get a full list of all compartments and subcompartments in the tenancy (root
     * compartment), set the parameter `compartmentIdInSubtree` to true and `accessLevel` to
     * ACCESSIBLE.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ListDataSourcesResponse> listDataSources(
            ListDataSourcesRequest request,
            com.oracle.bmc.responses.AsyncHandler<ListDataSourcesRequest, ListDataSourcesResponse>
                    handler);

    /**
     * Returns a list of detector rules (DetectorRule objects) for a detector recipe (DetectorRecipe
     * object), identified by detectorRecipeId.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ListDetectorRecipeDetectorRulesResponse>
            listDetectorRecipeDetectorRules(
                    ListDetectorRecipeDetectorRulesRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    ListDetectorRecipeDetectorRulesRequest,
                                    ListDetectorRecipeDetectorRulesResponse>
                            handler);

    /**
     * Returns a list of all detector recipes (DetectorRecipe objects) in a compartment, identified
     * by compartmentId.
     *
     * <p>The ListDetectorRecipes operation returns only the detector recipes in `compartmentId`
     * passed. The list does not include any subcompartments of the compartmentId passed.
     *
     * <p>The parameter `accessLevel` specifies whether to return only those compartments for which
     * the requestor has INSPECT permissions on at least one resource directly or indirectly
     * (ACCESSIBLE) (the resource can be in a subcompartment) or to return Not Authorized if
     * Principal doesn't have access to even one of the child compartments. This is valid only when
     * `compartmentIdInSubtree` is set to `true`.
     *
     * <p>The parameter `compartmentIdInSubtree` applies when you perform ListDetectorRecipes on the
     * `compartmentId` passed and when it is set to true, the entire hierarchy of compartments can
     * be returned. To get a full list of all compartments and subcompartments in the tenancy (root
     * compartment), set the parameter `compartmentIdInSubtree` to true and `accessLevel` to
     * ACCESSIBLE.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ListDetectorRecipesResponse> listDetectorRecipes(
            ListDetectorRecipesRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            ListDetectorRecipesRequest, ListDetectorRecipesResponse>
                    handler);

    /**
     * Returns a list of detector rules for the DetectorRecipe object identified by detectorId.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ListDetectorRulesResponse> listDetectorRules(
            ListDetectorRulesRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            ListDetectorRulesRequest, ListDetectorRulesResponse>
                    handler);

    /**
     * Returns a detector catalog (DetectorCollection object) with a list of DetectorSummary
     * objects.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ListDetectorsResponse> listDetectors(
            ListDetectorsRequest request,
            com.oracle.bmc.responses.AsyncHandler<ListDetectorsRequest, ListDetectorsResponse>
                    handler);

    /**
     * Returns a list of impacted resources for a Cloud Guard problem with a specified problem ID.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ListImpactedResourcesResponse> listImpactedResources(
            ListImpactedResourcesRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            ListImpactedResourcesRequest, ListImpactedResourcesResponse>
                    handler);

    /**
     * Returns all managed list types (listType parameter) that Cloud Guard supports.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ListManagedListTypesResponse> listManagedListTypes(
            ListManagedListTypesRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            ListManagedListTypesRequest, ListManagedListTypesResponse>
                    handler);

    /**
     * Returns a list of all ManagedList objects in a compartment, identified by compartmentId. The
     * ListManagedLists operation returns only the managed lists in `compartmentId` passed. The list
     * does not include any subcompartments of the compartmentId passed.
     *
     * <p>The parameter `accessLevel` specifies whether to return ManagedLists in only those
     * compartments for which the requestor has INSPECT permissions on at least one resource
     * directly or indirectly (ACCESSIBLE) (the resource can be in a subcompartment) or to return
     * Not Authorized if Principal doesn't have access to even one of the child compartments. This
     * is valid only when `compartmentIdInSubtree` is set to `true`.
     *
     * <p>The parameter `compartmentIdInSubtree` applies when you perform ListManagedLists on the
     * `compartmentId` passed and when it is set to true, the entire hierarchy of compartments can
     * be returned. To get a full list of all compartments and subcompartments in the tenancy (root
     * compartment), set the parameter `compartmentIdInSubtree` to true and `accessLevel` to
     * ACCESSIBLE.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ListManagedListsResponse> listManagedLists(
            ListManagedListsRequest request,
            com.oracle.bmc.responses.AsyncHandler<ListManagedListsRequest, ListManagedListsResponse>
                    handler);

    /**
     * Returns the list of global policy statements (policy attributes) needed to fully enable Cloud
     * Guard.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ListPoliciesResponse> listPolicies(
            ListPoliciesRequest request,
            com.oracle.bmc.responses.AsyncHandler<ListPoliciesRequest, ListPoliciesResponse>
                    handler);

    /**
     * Returns a list of endpoints associated with a problem, identified by problemId.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ListProblemEndpointsResponse> listProblemEndpoints(
            ListProblemEndpointsRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            ListProblemEndpointsRequest, ListProblemEndpointsResponse>
                    handler);

    /**
     * Returns a list of entities for a CloudGuard Problem
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ListProblemEntitiesResponse> listProblemEntities(
            ListProblemEntitiesRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            ListProblemEntitiesRequest, ListProblemEntitiesResponse>
                    handler);

    /**
     * Returns a list of actions taken on a Cloud Guard problem.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ListProblemHistoriesResponse> listProblemHistories(
            ListProblemHistoriesRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            ListProblemHistoriesRequest, ListProblemHistoriesResponse>
                    handler);

    /**
     * Returns a list of all Problems identified by Cloud Guard which are currently in the database
     * and meet the filtering criteria.
     *
     * <p>The ListProblems operation returns only the problems in `compartmentId` passed. The list
     * does not include any subcompartments of the compartmentId passed.
     *
     * <p>The parameter `accessLevel` specifies whether to return only those compartments for which
     * the requestor has INSPECT permissions on at least one resource directly or indirectly
     * (ACCESSIBLE) (the resource can be in a subcompartment) or to return Not Authorized if
     * Principal doesn't have access to even one of the child compartments. This is valid only when
     * `compartmentIdInSubtree` is set to `true`.
     *
     * <p>The parameter `compartmentIdInSubtree` applies when you perform ListProblems on the
     * `compartmentId` passed and when it is set to true, the entire hierarchy of compartments can
     * be returned. To get a full list of all compartments and subcompartments in the tenancy (root
     * compartment), set the parameter `compartmentIdInSubtree` to true and `accessLevel` to
     * ACCESSIBLE.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ListProblemsResponse> listProblems(
            ListProblemsRequest request,
            com.oracle.bmc.responses.AsyncHandler<ListProblemsRequest, ListProblemsResponse>
                    handler);

    /**
     * Returns a list of all Recommendations.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ListRecommendationsResponse> listRecommendations(
            ListRecommendationsRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            ListRecommendationsRequest, ListRecommendationsResponse>
                    handler);

    /**
     * Returns a list of endpoints for Cloud Guard resource profile
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ListResourceProfileEndpointsResponse> listResourceProfileEndpoints(
            ListResourceProfileEndpointsRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            ListResourceProfileEndpointsRequest,
                            ListResourceProfileEndpointsResponse>
                    handler);

    /**
     * Returns a list of impacted resources for Cloud Guard resource profile
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ListResourceProfileImpactedResourcesResponse>
            listResourceProfileImpactedResources(
                    ListResourceProfileImpactedResourcesRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    ListResourceProfileImpactedResourcesRequest,
                                    ListResourceProfileImpactedResourcesResponse>
                            handler);

    /**
     * Returns a list of all resource profiles identified by the Cloud Guard The
     * ListResourceProfiles operation returns only resource profiles that match the passed filters.
     *
     * <p>The ListResourceProfiles operation returns only the resource profiles in `compartmentId`
     * passed. The parameter `accessLevel` specifies whether to return only those compartments for
     * which the requestor has INSPECT permissions on at least one resource directly or indirectly
     * (ACCESSIBLE) (the resource can be in a subcompartment) or to return Not Authorized if
     * Principal doesn't have access to even one of the child compartments. This is valid only when
     * `compartmentIdInSubtree` is set to `true`.
     *
     * <p>The parameter `compartmentIdInSubtree` applies when you perform ListResourceProfiles on
     * the `compartmentId` passed and when it is set to true, the entire hierarchy of compartments
     * can be returned. To get a full list of all compartments and subcompartments in the tenancy
     * (root compartment), set the parameter `compartmentIdInSubtree` to true and `accessLevel` to
     * ACCESSIBLE.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ListResourceProfilesResponse> listResourceProfiles(
            ListResourceProfilesRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            ListResourceProfilesRequest, ListResourceProfilesResponse>
                    handler);

    /**
     * Returns a list of resource types.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ListResourceTypesResponse> listResourceTypes(
            ListResourceTypesRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            ListResourceTypesRequest, ListResourceTypesResponse>
                    handler);

    /**
     * Returns a list of Responder activities done on CloudGuard Problem
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ListResponderActivitiesResponse> listResponderActivities(
            ListResponderActivitiesRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            ListResponderActivitiesRequest, ListResponderActivitiesResponse>
                    handler);

    /**
     * Returns a list of Responder Executions. A Responder Execution is an entity that tracks the
     * collective execution of multiple Responder Rule Executions for a given Problem.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ListResponderExecutionsResponse> listResponderExecutions(
            ListResponderExecutionsRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            ListResponderExecutionsRequest, ListResponderExecutionsResponse>
                    handler);

    /**
     * Returns a list of ResponderRule associated with ResponderRecipe.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ListResponderRecipeResponderRulesResponse>
            listResponderRecipeResponderRules(
                    ListResponderRecipeResponderRulesRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    ListResponderRecipeResponderRulesRequest,
                                    ListResponderRecipeResponderRulesResponse>
                            handler);

    /**
     * Returns a list of all ResponderRecipes in a compartment The ListResponderRecipe operation
     * returns only the targets in `compartmentId` passed. The list does not include any
     * subcompartments of the compartmentId passed.
     *
     * <p>The parameter `accessLevel` specifies whether to return only those compartments for which
     * the requestor has INSPECT permissions on at least one resource directly or indirectly
     * (ACCESSIBLE) (the resource can be in a subcompartment) or to return Not Authorized if
     * Principal doesn't have access to even one of the child compartments. This is valid only when
     * `compartmentIdInSubtree` is set to `true`.
     *
     * <p>The parameter `compartmentIdInSubtree` applies when you perform ListResponderRecipe on the
     * `compartmentId` passed and when it is set to true, the entire hierarchy of compartments can
     * be returned. To get a full list of all compartments and subcompartments in the tenancy (root
     * compartment), set the parameter `compartmentIdInSubtree` to true and `accessLevel` to
     * ACCESSIBLE.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ListResponderRecipesResponse> listResponderRecipes(
            ListResponderRecipesRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            ListResponderRecipesRequest, ListResponderRecipesResponse>
                    handler);

    /**
     * Returns a list of ResponderRule.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ListResponderRulesResponse> listResponderRules(
            ListResponderRulesRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            ListResponderRulesRequest, ListResponderRulesResponse>
                    handler);

    /**
     * Returns a list of security zone policies. Specify any compartment.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ListSecurityPoliciesResponse> listSecurityPolicies(
            ListSecurityPoliciesRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            ListSecurityPoliciesRequest, ListSecurityPoliciesResponse>
                    handler);

    /**
     * Gets a list of all security zone recipes in a compartment.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ListSecurityRecipesResponse> listSecurityRecipes(
            ListSecurityRecipesRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            ListSecurityRecipesRequest, ListSecurityRecipesResponse>
                    handler);

    /**
     * Gets a list of all security zones in a compartment.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ListSecurityZonesResponse> listSecurityZones(
            ListSecurityZonesRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            ListSecurityZonesRequest, ListSecurityZonesResponse>
                    handler);

    /**
     * Returns Sighting endpoints details
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ListSightingEndpointsResponse> listSightingEndpoints(
            ListSightingEndpointsRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            ListSightingEndpointsRequest, ListSightingEndpointsResponse>
                    handler);

    /**
     * Return a list of Impacted Resources for a CloudGuard Sighting
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ListSightingImpactedResourcesResponse>
            listSightingImpactedResources(
                    ListSightingImpactedResourcesRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    ListSightingImpactedResourcesRequest,
                                    ListSightingImpactedResourcesResponse>
                            handler);

    /**
     * Returns a list of all Sightings identified by the Cloud Guard The ListSightings operation
     * returns only sightings that match the passed filters.
     *
     * <p>The parameter `accessLevel` specifies whether to return only those compartments for which
     * the requestor has INSPECT permissions on at least one resource directly or indirectly
     * (ACCESSIBLE) (the resource can be in a subcompartment) or to return Not Authorized if
     * Principal doesn't have access to even one of the child compartments. This is valid only when
     * `compartmentIdInSubtree` is set to `true`.
     *
     * <p>The parameter `compartmentIdInSubtree` applies when you perform ListSightings on the
     * `compartmentId` passed and when it is set to true, the entire hierarchy of compartments can
     * be returned. To get a full list of all compartments and subcompartments in the tenancy (root
     * compartment), set the parameter `compartmentIdInSubtree` to true and `accessLevel` to
     * ACCESSIBLE.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ListSightingsResponse> listSightings(
            ListSightingsRequest request,
            com.oracle.bmc.responses.AsyncHandler<ListSightingsRequest, ListSightingsResponse>
                    handler);

    /**
     * Returns a list of tactics associated with detector rules.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ListTacticsResponse> listTactics(
            ListTacticsRequest request,
            com.oracle.bmc.responses.AsyncHandler<ListTacticsRequest, ListTacticsResponse> handler);

    /**
     * Returns a list of DetectorRule associated with DetectorRecipe within a Target.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ListTargetDetectorRecipeDetectorRulesResponse>
            listTargetDetectorRecipeDetectorRules(
                    ListTargetDetectorRecipeDetectorRulesRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    ListTargetDetectorRecipeDetectorRulesRequest,
                                    ListTargetDetectorRecipeDetectorRulesResponse>
                            handler);

    /**
     * Returns a list of all detector recipes associated with the target identified by targetId
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ListTargetDetectorRecipesResponse> listTargetDetectorRecipes(
            ListTargetDetectorRecipesRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            ListTargetDetectorRecipesRequest, ListTargetDetectorRecipesResponse>
                    handler);

    /**
     * Returns a list of ResponderRule associated with ResponderRecipe within a Target.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ListTargetResponderRecipeResponderRulesResponse>
            listTargetResponderRecipeResponderRules(
                    ListTargetResponderRecipeResponderRulesRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    ListTargetResponderRecipeResponderRulesRequest,
                                    ListTargetResponderRecipeResponderRulesResponse>
                            handler);

    /**
     * Returns a list of all responder recipes associated with the target identified by targetId
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ListTargetResponderRecipesResponse> listTargetResponderRecipes(
            ListTargetResponderRecipesRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            ListTargetResponderRecipesRequest, ListTargetResponderRecipesResponse>
                    handler);

    /**
     * Returns a list of all Targets in a compartment The ListTargets operation returns only the
     * targets in `compartmentId` passed. The list does not include any subcompartments of the
     * compartmentId passed.
     *
     * <p>The parameter `accessLevel` specifies whether to return only those compartments for which
     * the requestor has INSPECT permissions on at least one resource directly or indirectly
     * (ACCESSIBLE) (the resource can be in a subcompartment) or to return Not Authorized if
     * Principal doesn't have access to even one of the child compartments. This is valid only when
     * `compartmentIdInSubtree` is set to `true`.
     *
     * <p>The parameter `compartmentIdInSubtree` applies when you perform ListTargets on the
     * `compartmentId` passed and when it is set to true, the entire hierarchy of compartments can
     * be returned. To get a full list of all compartments and subcompartments in the tenancy (root
     * compartment), set the parameter `compartmentIdInSubtree` to true and `accessLevel` to
     * ACCESSIBLE.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ListTargetsResponse> listTargets(
            ListTargetsRequest request,
            com.oracle.bmc.responses.AsyncHandler<ListTargetsRequest, ListTargetsResponse> handler);

    /**
     * Returns a list of techniques associated with detector rules.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ListTechniquesResponse> listTechniques(
            ListTechniquesRequest request,
            com.oracle.bmc.responses.AsyncHandler<ListTechniquesRequest, ListTechniquesResponse>
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
     * Removes an existing compartment from a security zone. When you remove a subcompartment from a
     * security zone, it no longer enforces security zone policies on the resources in the
     * subcompartment. You can't remove the primary compartment that was used to create the security
     * zone.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<RemoveCompartmentResponse> removeCompartment(
            RemoveCompartmentRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            RemoveCompartmentRequest, RemoveCompartmentResponse>
                    handler);

    /**
     * Examines the number of problems related to the resource and the relative severity of those
     * problems.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<RequestRiskScoresResponse> requestRiskScores(
            RequestRiskScoresRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            RequestRiskScoresRequest, RequestRiskScoresResponse>
                    handler);

    /**
     * Measures the number of resources examined across all regions and compares it with the number
     * of problems detected, for a given time period.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<RequestSecurityScoreSummarizedTrendResponse>
            requestSecurityScoreSummarizedTrend(
                    RequestSecurityScoreSummarizedTrendRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    RequestSecurityScoreSummarizedTrendRequest,
                                    RequestSecurityScoreSummarizedTrendResponse>
                            handler);

    /**
     * Measures the number of resources examined across all regions and compares it with the number
     * of problems detected.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<RequestSecurityScoresResponse> requestSecurityScores(
            RequestSecurityScoresRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            RequestSecurityScoresRequest, RequestSecurityScoresResponse>
                    handler);

    /**
     * Returns the summary of problems generated by OCI Activity Detector rules, identified by
     * parameters specified.
     *
     * <p>The parameter `accessLevel` specifies whether to return only those compartments for which
     * the requestor has INSPECT permissions on at least one resource directly or indirectly
     * (ACCESSIBLE) (the resource can be in a subcompartment) or to return Not Authorized if
     * Principal doesn't have access to even one of the child compartments. This is valid only when
     * `compartmentIdInSubtree` is set to `true`.
     *
     * <p>The parameter `compartmentIdInSubtree` applies when you perform summarize API on the
     * `compartmentId` passed and when it is set to true, the entire hierarchy of compartments can
     * be returned. To get a full list of all compartments and subcompartments in the tenancy (root
     * compartment), set the parameter `compartmentIdInSubtree` to true and `accessLevel` to
     * ACCESSIBLE.
     *
     * <p>The compartmentId to be passed with `accessLevel` and `compartmentIdInSubtree` params has
     * to be the root compartment id (tenant-id) only.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<RequestSummarizedActivityProblemsResponse>
            requestSummarizedActivityProblems(
                    RequestSummarizedActivityProblemsRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    RequestSummarizedActivityProblemsRequest,
                                    RequestSummarizedActivityProblemsResponse>
                            handler);

    /**
     * Returns the number of problems matching the key-value pairs in dimensionMap.
     *
     * <p>The parameter `accessLevel` specifies whether to return only those compartments for which
     * the requestor has INSPECT permissions on at least one resource directly or indirectly
     * (ACCESSIBLE) (the resource can be in a subcompartment) or to return Not Authorized if
     * Principal doesn't have access to even one of the child compartments. This is valid only when
     * `compartmentIdInSubtree` is set to `true`.
     *
     * <p>The parameter `compartmentIdInSubtree` applies when you perform summarize API on the
     * `compartmentId` passed and when it is set to true, the entire hierarchy of compartments can
     * be returned. To get a full list of all compartments and subcompartments in the tenancy (root
     * compartment), set the parameter `compartmentIdInSubtree` to true and `accessLevel` to
     * ACCESSIBLE.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<RequestSummarizedProblemsResponse> requestSummarizedProblems(
            RequestSummarizedProblemsRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            RequestSummarizedProblemsRequest, RequestSummarizedProblemsResponse>
                    handler);

    /**
     * Returns the number of Responder Executions, for a given set of dimensions.
     *
     * <p>The parameter `accessLevel` specifies whether to return only those compartments for which
     * the requestor has INSPECT permissions on at least one resource directly or indirectly
     * (ACCESSIBLE) (the resource can be in a subcompartment) or to return Not Authorized if
     * Principal doesn't have access to even one of the child compartments. This is valid only when
     * `compartmentIdInSubtree` is set to `true`.
     *
     * <p>The parameter `compartmentIdInSubtree` applies when you perform summarize API on the
     * `compartmentId` passed and when it is set to true, the entire hierarchy of compartments can
     * be returned. To get a full list of all compartments and subcompartments in the tenancy (root
     * compartment), set the parameter `compartmentIdInSubtree` to true and `accessLevel` to
     * ACCESSIBLE.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<RequestSummarizedResponderExecutionsResponse>
            requestSummarizedResponderExecutions(
                    RequestSummarizedResponderExecutionsRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    RequestSummarizedResponderExecutionsRequest,
                                    RequestSummarizedResponderExecutionsResponse>
                            handler);

    /**
     * DEPRECATED
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<RequestSummarizedRiskScoresResponse> requestSummarizedRiskScores(
            RequestSummarizedRiskScoresRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            RequestSummarizedRiskScoresRequest, RequestSummarizedRiskScoresResponse>
                    handler);

    /**
     * DEPRECATED
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<RequestSummarizedSecurityScoresResponse>
            requestSummarizedSecurityScores(
                    RequestSummarizedSecurityScoresRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    RequestSummarizedSecurityScoresRequest,
                                    RequestSummarizedSecurityScoresResponse>
                            handler);

    /**
     * Summarizes the resource profile risk score top trends for the given time range based on the
     * search filters.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<RequestSummarizedTopTrendResourceProfileRiskScoresResponse>
            requestSummarizedTopTrendResourceProfileRiskScores(
                    RequestSummarizedTopTrendResourceProfileRiskScoresRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    RequestSummarizedTopTrendResourceProfileRiskScoresRequest,
                                    RequestSummarizedTopTrendResourceProfileRiskScoresResponse>
                            handler);

    /**
     * Returns a ProblemTrendAggregationCollection resource for a compartment, identified by
     * compartmentId, for the specified time period. The ProblemTrendAggregationCollection resource
     * contains a list of ProblemTrendAggregation resources.
     *
     * <p>The parameter `accessLevel` specifies whether to return only those compartments for which
     * the requestor has INSPECT permissions on at least one resource directly or indirectly
     * (ACCESSIBLE) (the resource can be in a subcompartment) or to return Not Authorized if
     * Principal doesn't have access to even one of the child compartments. This is valid only when
     * `compartmentIdInSubtree` is set to `true`.
     *
     * <p>The parameter `compartmentIdInSubtree` applies when you perform summarize API on the
     * `compartmentId` passed and when it is set to true, the entire hierarchy of compartments can
     * be returned. To get a full list of all compartments and subcompartments in the tenancy (root
     * compartment), set the parameter `compartmentIdInSubtree` to true and `accessLevel` to
     * ACCESSIBLE.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<RequestSummarizedTrendProblemsResponse>
            requestSummarizedTrendProblems(
                    RequestSummarizedTrendProblemsRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    RequestSummarizedTrendProblemsRequest,
                                    RequestSummarizedTrendProblemsResponse>
                            handler);

    /**
     * Summarizes the resource risk score trend for the given time range based on the search
     * filters.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<RequestSummarizedTrendResourceRiskScoresResponse>
            requestSummarizedTrendResourceRiskScores(
                    RequestSummarizedTrendResourceRiskScoresRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    RequestSummarizedTrendResourceRiskScoresRequest,
                                    RequestSummarizedTrendResourceRiskScoresResponse>
                            handler);

    /**
     * Returns the number of remediations performed by Responders, for a given time period.
     *
     * <p>The parameter `accessLevel` specifies whether to return only those compartments for which
     * the requestor has INSPECT permissions on at least one resource directly or indirectly
     * (ACCESSIBLE) (the resource can be in a subcompartment) or to return Not Authorized if
     * Principal doesn't have access to even one of the child compartments. This is valid only when
     * `compartmentIdInSubtree` is set to `true`.
     *
     * <p>The parameter `compartmentIdInSubtree` applies when you perform summarize API on the
     * `compartmentId` passed and when it is set to true, the entire hierarchy of compartments can
     * be returned. To get a full list of all compartments and subcompartments in the tenancy (root
     * compartment), set the parameter `compartmentIdInSubtree` to true and `accessLevel` to
     * ACCESSIBLE.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<RequestSummarizedTrendResponderExecutionsResponse>
            requestSummarizedTrendResponderExecutions(
                    RequestSummarizedTrendResponderExecutionsRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    RequestSummarizedTrendResponderExecutionsRequest,
                                    RequestSummarizedTrendResponderExecutionsResponse>
                            handler);

    /**
     * DEPRECATED
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<RequestSummarizedTrendSecurityScoresResponse>
            requestSummarizedTrendSecurityScores(
                    RequestSummarizedTrendSecurityScoresRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    RequestSummarizedTrendSecurityScoresRequest,
                                    RequestSummarizedTrendSecurityScoresResponse>
                            handler);

    /**
     * Skips the execution for a bulk of responder executions The operation is atomic in nature
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<SkipBulkResponderExecutionResponse> skipBulkResponderExecution(
            SkipBulkResponderExecutionRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            SkipBulkResponderExecutionRequest, SkipBulkResponderExecutionResponse>
                    handler);

    /**
     * Skips the execution of the responder execution. When provided, If-Match is checked against
     * ETag values of the resource.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<SkipResponderExecutionResponse> skipResponderExecution(
            SkipResponderExecutionRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            SkipResponderExecutionRequest, SkipResponderExecutionResponse>
                    handler);

    /**
     * Sends the problem identified by problemId to the responder engine, to be processed by rule
     * that\u2019s identified by responderRuleId, in the TriggerResponderDetails resource
     * that\u2019s passed.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<TriggerResponderResponse> triggerResponder(
            TriggerResponderRequest request,
            com.oracle.bmc.responses.AsyncHandler<TriggerResponderRequest, TriggerResponderResponse>
                    handler);

    /**
     * Changes the status for all problems listed in the problemIds array, passed through the
     * UpdateBulkProblemStatusDetails resource, from the current status to the status set in
     * UpdateBulkProblemStatusDetails.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<UpdateBulkProblemStatusResponse> updateBulkProblemStatus(
            UpdateBulkProblemStatusRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            UpdateBulkProblemStatusRequest, UpdateBulkProblemStatusResponse>
                    handler);

    /**
     * Update configuration details for a Cloud Guard tenancy, identified by root compartment OCID.
     * The reporting region cannot be updated once created.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<UpdateConfigurationResponse> updateConfiguration(
            UpdateConfigurationRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            UpdateConfigurationRequest, UpdateConfigurationResponse>
                    handler);

    /**
     * Updates a data mask rule (DataMaskRule object) identified by dataMaskRuleId.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<UpdateDataMaskRuleResponse> updateDataMaskRule(
            UpdateDataMaskRuleRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            UpdateDataMaskRuleRequest, UpdateDataMaskRuleResponse>
                    handler);

    /**
     * Updates a data source identified by dataSourceId
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<UpdateDataSourceResponse> updateDataSource(
            UpdateDataSourceRequest request,
            com.oracle.bmc.responses.AsyncHandler<UpdateDataSourceRequest, UpdateDataSourceResponse>
                    handler);

    /**
     * Updates a detector recipe (DetectorRecipe object) identified by detectorRecipeId.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<UpdateDetectorRecipeResponse> updateDetectorRecipe(
            UpdateDetectorRecipeRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            UpdateDetectorRecipeRequest, UpdateDetectorRecipeResponse>
                    handler);

    /**
     * Updates a detector rule (DetectorRule object) identified by detectorRuleId.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<UpdateDetectorRecipeDetectorRuleResponse>
            updateDetectorRecipeDetectorRule(
                    UpdateDetectorRecipeDetectorRuleRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    UpdateDetectorRecipeDetectorRuleRequest,
                                    UpdateDetectorRecipeDetectorRuleResponse>
                            handler);

    /**
     * Updates a ManagedList object, identified by managedList.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<UpdateManagedListResponse> updateManagedList(
            UpdateManagedListRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            UpdateManagedListRequest, UpdateManagedListResponse>
                    handler);

    /**
     * Changes the current status of the problem, identified by problemId, to the status specified
     * in the UpdateProblemStatusDetails resource that you pass.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<UpdateProblemStatusResponse> updateProblemStatus(
            UpdateProblemStatusRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            UpdateProblemStatusRequest, UpdateProblemStatusResponse>
                    handler);

    /**
     * Update the ResponderRecipe resource by identifier
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<UpdateResponderRecipeResponse> updateResponderRecipe(
            UpdateResponderRecipeRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            UpdateResponderRecipeRequest, UpdateResponderRecipeResponse>
                    handler);

    /**
     * Update the ResponderRule by identifier
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<UpdateResponderRecipeResponderRuleResponse>
            updateResponderRecipeResponderRule(
                    UpdateResponderRecipeResponderRuleRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    UpdateResponderRecipeResponderRuleRequest,
                                    UpdateResponderRecipeResponderRuleResponse>
                            handler);

    /**
     * Updates a security zone recipe. A security zone recipe is a collection of security zone
     * policies.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<UpdateSecurityRecipeResponse> updateSecurityRecipe(
            UpdateSecurityRecipeRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            UpdateSecurityRecipeRequest, UpdateSecurityRecipeResponse>
                    handler);

    /**
     * Updates the security zone identified by its id
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<UpdateSecurityZoneResponse> updateSecurityZone(
            UpdateSecurityZoneRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            UpdateSecurityZoneRequest, UpdateSecurityZoneResponse>
                    handler);

    /**
     * Updates a Target identified by targetId
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<UpdateTargetResponse> updateTarget(
            UpdateTargetRequest request,
            com.oracle.bmc.responses.AsyncHandler<UpdateTargetRequest, UpdateTargetResponse>
                    handler);

    /**
     * Update the TargetDetectorRecipe resource by identifier
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<UpdateTargetDetectorRecipeResponse> updateTargetDetectorRecipe(
            UpdateTargetDetectorRecipeRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            UpdateTargetDetectorRecipeRequest, UpdateTargetDetectorRecipeResponse>
                    handler);

    /**
     * Update the DetectorRule by identifier
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<UpdateTargetDetectorRecipeDetectorRuleResponse>
            updateTargetDetectorRecipeDetectorRule(
                    UpdateTargetDetectorRecipeDetectorRuleRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    UpdateTargetDetectorRecipeDetectorRuleRequest,
                                    UpdateTargetDetectorRecipeDetectorRuleResponse>
                            handler);

    /**
     * Update the TargetResponderRecipe resource by identifier
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<UpdateTargetResponderRecipeResponse> updateTargetResponderRecipe(
            UpdateTargetResponderRecipeRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            UpdateTargetResponderRecipeRequest, UpdateTargetResponderRecipeResponse>
                    handler);

    /**
     * Update the ResponderRule by identifier
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<UpdateTargetResponderRecipeResponderRuleResponse>
            updateTargetResponderRecipeResponderRule(
                    UpdateTargetResponderRecipeResponderRuleRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    UpdateTargetResponderRecipeResponderRuleRequest,
                                    UpdateTargetResponderRecipeResponderRuleResponse>
                            handler);
}

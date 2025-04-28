/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.osmanagement;

import com.oracle.bmc.osmanagement.requests.*;
import com.oracle.bmc.osmanagement.responses.*;

/**
 * API for the OS Management service. Use these API operations for working with Managed instances
 * and Managed instance groups.
 *
 * <p>This service client uses CircuitBreakerUtils.DEFAULT_CIRCUIT_BREAKER for all the operations by
 * default if no circuit breaker configuration is defined by the user.
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20190801")
public interface OsManagement extends AutoCloseable {

    /** Rebuilds the client from scratch. Useful to refresh certificates. */
    void refreshClient();

    /**
     * Sets the endpoint to call (ex, https://www.example.com).
     *
     * @param endpoint The endpoint of the service.
     */
    void setEndpoint(String endpoint);

    /** Gets the set endpoint for REST call (ex, https://www.example.com) */
    String getEndpoint();

    /**
     * Sets the region to call (ex, Region.US_PHOENIX_1).
     *
     * <p>Note, this will call {@link #setEndpoint(String) setEndpoint} after resolving the
     * endpoint. If the service is not available in this Region, however, an
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
     * Adds a given list of Software Packages to a specific Software Source.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/osmanagement/AddPackagesToSoftwareSourceExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     AddPackagesToSoftwareSource API.
     */
    AddPackagesToSoftwareSourceResponse addPackagesToSoftwareSource(
            AddPackagesToSoftwareSourceRequest request);

    /**
     * Adds a child software source to a managed instance. After the software source has been added,
     * then packages from that software source can be installed on the managed instance.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/osmanagement/AttachChildSoftwareSourceToManagedInstanceExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     AttachChildSoftwareSourceToManagedInstance API.
     */
    AttachChildSoftwareSourceToManagedInstanceResponse attachChildSoftwareSourceToManagedInstance(
            AttachChildSoftwareSourceToManagedInstanceRequest request);

    /**
     * Adds a Managed Instance to a Managed Instance Group. After the Managed Instance has been
     * added, then operations can be performed on the Managed Instance Group which will then apply
     * to all Managed Instances in the group.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/osmanagement/AttachManagedInstanceToManagedInstanceGroupExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     AttachManagedInstanceToManagedInstanceGroup API.
     */
    AttachManagedInstanceToManagedInstanceGroupResponse attachManagedInstanceToManagedInstanceGroup(
            AttachManagedInstanceToManagedInstanceGroupRequest request);

    /**
     * Adds a parent software source to a managed instance. After the software source has been
     * added, then packages from that software source can be installed on the managed instance.
     * Software sources that have this software source as a parent will be able to be added to this
     * managed instance.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/osmanagement/AttachParentSoftwareSourceToManagedInstanceExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     AttachParentSoftwareSourceToManagedInstance API.
     */
    AttachParentSoftwareSourceToManagedInstanceResponse attachParentSoftwareSourceToManagedInstance(
            AttachParentSoftwareSourceToManagedInstanceRequest request);

    /**
     * Moves a resource into a different compartment. When provided, If-Match is checked against
     * ETag values of the resource.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/osmanagement/ChangeManagedInstanceGroupCompartmentExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     ChangeManagedInstanceGroupCompartment API.
     */
    ChangeManagedInstanceGroupCompartmentResponse changeManagedInstanceGroupCompartment(
            ChangeManagedInstanceGroupCompartmentRequest request);

    /**
     * Moves a resource into a different compartment. When provided, If-Match is checked against
     * ETag values of the resource.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/osmanagement/ChangeScheduledJobCompartmentExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     ChangeScheduledJobCompartment API.
     */
    ChangeScheduledJobCompartmentResponse changeScheduledJobCompartment(
            ChangeScheduledJobCompartmentRequest request);

    /**
     * Moves a resource into a different compartment. When provided, If-Match is checked against
     * ETag values of the resource.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/osmanagement/ChangeSoftwareSourceCompartmentExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     ChangeSoftwareSourceCompartment API.
     */
    ChangeSoftwareSourceCompartmentResponse changeSoftwareSourceCompartment(
            ChangeSoftwareSourceCompartmentRequest request);

    /**
     * Creates a new Managed Instance Group on the management system. This will not contain any
     * managed instances after it is first created, and they must be added later.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/osmanagement/CreateManagedInstanceGroupExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     CreateManagedInstanceGroup API.
     */
    CreateManagedInstanceGroupResponse createManagedInstanceGroup(
            CreateManagedInstanceGroupRequest request);

    /**
     * Creates a new Scheduled Job to perform a specific package operation on a set of managed
     * instances or managed instance groups. Can be created as a one-time execution in the future,
     * or as a recurring execution that repeats on a defined interval.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/osmanagement/CreateScheduledJobExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use CreateScheduledJob
     *     API.
     */
    CreateScheduledJobResponse createScheduledJob(CreateScheduledJobRequest request);

    /**
     * Creates a new custom Software Source on the management system. This will not contain any
     * packages after it is first created, and they must be added later.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/osmanagement/CreateSoftwareSourceExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     CreateSoftwareSource API.
     */
    CreateSoftwareSourceResponse createSoftwareSource(CreateSoftwareSourceRequest request);

    /**
     * Deletes a Managed Instance Group from the management system
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/osmanagement/DeleteManagedInstanceGroupExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     DeleteManagedInstanceGroup API.
     */
    DeleteManagedInstanceGroupResponse deleteManagedInstanceGroup(
            DeleteManagedInstanceGroupRequest request);

    /**
     * Cancels an existing Scheduled Job on the management system
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/osmanagement/DeleteScheduledJobExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use DeleteScheduledJob
     *     API.
     */
    DeleteScheduledJobResponse deleteScheduledJob(DeleteScheduledJobRequest request);

    /**
     * Deletes a custom Software Source on the management system
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/osmanagement/DeleteSoftwareSourceExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     DeleteSoftwareSource API.
     */
    DeleteSoftwareSourceResponse deleteSoftwareSource(DeleteSoftwareSourceRequest request);

    /**
     * Removes a child software source from a managed instance. Packages will no longer be able to
     * be installed from these software sources.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/osmanagement/DetachChildSoftwareSourceFromManagedInstanceExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     DetachChildSoftwareSourceFromManagedInstance API.
     */
    DetachChildSoftwareSourceFromManagedInstanceResponse
            detachChildSoftwareSourceFromManagedInstance(
                    DetachChildSoftwareSourceFromManagedInstanceRequest request);

    /**
     * Removes a Managed Instance from a Managed Instance Group.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/osmanagement/DetachManagedInstanceFromManagedInstanceGroupExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     DetachManagedInstanceFromManagedInstanceGroup API.
     */
    DetachManagedInstanceFromManagedInstanceGroupResponse
            detachManagedInstanceFromManagedInstanceGroup(
                    DetachManagedInstanceFromManagedInstanceGroupRequest request);

    /**
     * Removes a software source from a managed instance. All child software sources will also be
     * removed from the managed instance. Packages will no longer be able to be installed from these
     * software sources.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/osmanagement/DetachParentSoftwareSourceFromManagedInstanceExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     DetachParentSoftwareSourceFromManagedInstance API.
     */
    DetachParentSoftwareSourceFromManagedInstanceResponse
            detachParentSoftwareSourceFromManagedInstance(
                    DetachParentSoftwareSourceFromManagedInstanceRequest request);

    /**
     * Disables a module stream on a managed instance. After the stream is disabled, it is no longer
     * possible to install the profiles that are contained by the stream. All installed profiles
     * must be removed prior to disabling a module stream.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/osmanagement/DisableModuleStreamOnManagedInstanceExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     DisableModuleStreamOnManagedInstance API.
     */
    DisableModuleStreamOnManagedInstanceResponse disableModuleStreamOnManagedInstance(
            DisableModuleStreamOnManagedInstanceRequest request);

    /**
     * Enables a module stream on a managed instance. After the stream is enabled, it is possible to
     * install the profiles that are contained by the stream. Enabling a stream that is already
     * enabled will succeed. Attempting to enable a different stream for a module that already has a
     * stream enabled results in an error.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/osmanagement/EnableModuleStreamOnManagedInstanceExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     EnableModuleStreamOnManagedInstance API.
     */
    EnableModuleStreamOnManagedInstanceResponse enableModuleStreamOnManagedInstance(
            EnableModuleStreamOnManagedInstanceRequest request);

    /**
     * Returns a specific erratum.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/osmanagement/GetErratumExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use GetErratum API.
     */
    GetErratumResponse getErratum(GetErratumRequest request);

    /**
     * Returns a specific Managed Instance.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/osmanagement/GetManagedInstanceExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use GetManagedInstance
     *     API.
     */
    GetManagedInstanceResponse getManagedInstance(GetManagedInstanceRequest request);

    /**
     * Returns a specific Managed Instance Group.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/osmanagement/GetManagedInstanceGroupExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     GetManagedInstanceGroup API.
     */
    GetManagedInstanceGroupResponse getManagedInstanceGroup(GetManagedInstanceGroupRequest request);

    /**
     * Retrieve a detailed description of a module stream from a software source.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/osmanagement/GetModuleStreamExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use GetModuleStream
     *     API.
     */
    GetModuleStreamResponse getModuleStream(GetModuleStreamRequest request);

    /**
     * Retrieve a detailed description of a module stream profile from a software source.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/osmanagement/GetModuleStreamProfileExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     GetModuleStreamProfile API.
     */
    GetModuleStreamProfileResponse getModuleStreamProfile(GetModuleStreamProfileRequest request);

    /**
     * Gets the detailed information for the Scheduled Job with the given ID.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/osmanagement/GetScheduledJobExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use GetScheduledJob
     *     API.
     */
    GetScheduledJobResponse getScheduledJob(GetScheduledJobRequest request);

    /**
     * Returns a specific Software Package.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/osmanagement/GetSoftwarePackageExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use GetSoftwarePackage
     *     API.
     */
    GetSoftwarePackageResponse getSoftwarePackage(GetSoftwarePackageRequest request);

    /**
     * Returns a specific Software Source.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/osmanagement/GetSoftwareSourceExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use GetSoftwareSource
     *     API.
     */
    GetSoftwareSourceResponse getSoftwareSource(GetSoftwareSourceRequest request);

    /**
     * Returns a Windows Update object.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/osmanagement/GetWindowsUpdateExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use GetWindowsUpdate
     *     API.
     */
    GetWindowsUpdateResponse getWindowsUpdate(GetWindowsUpdateRequest request);

    /**
     * Gets the detailed information for the work request with the given ID.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/osmanagement/GetWorkRequestExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use GetWorkRequest API.
     */
    GetWorkRequestResponse getWorkRequest(GetWorkRequestRequest request);

    /**
     * Install all of the available package updates for the managed instance.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/osmanagement/InstallAllPackageUpdatesOnManagedInstanceExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     InstallAllPackageUpdatesOnManagedInstance API.
     */
    InstallAllPackageUpdatesOnManagedInstanceResponse installAllPackageUpdatesOnManagedInstance(
            InstallAllPackageUpdatesOnManagedInstanceRequest request);

    /**
     * Install all of the available updates for the Managed Instance Group.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/osmanagement/InstallAllUpdatesOnManagedInstanceGroupExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     InstallAllUpdatesOnManagedInstanceGroup API.
     */
    InstallAllUpdatesOnManagedInstanceGroupResponse installAllUpdatesOnManagedInstanceGroup(
            InstallAllUpdatesOnManagedInstanceGroupRequest request);

    /**
     * Install all of the available Windows updates for the managed instance.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/osmanagement/InstallAllWindowsUpdatesOnManagedInstanceExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     InstallAllWindowsUpdatesOnManagedInstance API.
     */
    InstallAllWindowsUpdatesOnManagedInstanceResponse installAllWindowsUpdatesOnManagedInstance(
            InstallAllWindowsUpdatesOnManagedInstanceRequest request);

    /**
     * Installs a profile for an module stream. The stream must be enabled before a profile can be
     * installed. If a module stream defines multiple profiles, each one can be installed
     * independently.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/osmanagement/InstallModuleStreamProfileOnManagedInstanceExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     InstallModuleStreamProfileOnManagedInstance API.
     */
    InstallModuleStreamProfileOnManagedInstanceResponse installModuleStreamProfileOnManagedInstance(
            InstallModuleStreamProfileOnManagedInstanceRequest request);

    /**
     * Installs a package on a managed instance.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/osmanagement/InstallPackageOnManagedInstanceExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     InstallPackageOnManagedInstance API.
     */
    InstallPackageOnManagedInstanceResponse installPackageOnManagedInstance(
            InstallPackageOnManagedInstanceRequest request);

    /**
     * Updates a package on a managed instance.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/osmanagement/InstallPackageUpdateOnManagedInstanceExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     InstallPackageUpdateOnManagedInstance API.
     */
    InstallPackageUpdateOnManagedInstanceResponse installPackageUpdateOnManagedInstance(
            InstallPackageUpdateOnManagedInstanceRequest request);

    /**
     * Installs a Windows update on a managed instance.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/osmanagement/InstallWindowsUpdateOnManagedInstanceExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     InstallWindowsUpdateOnManagedInstance API.
     */
    InstallWindowsUpdateOnManagedInstanceResponse installWindowsUpdateOnManagedInstance(
            InstallWindowsUpdateOnManagedInstanceRequest request);

    /**
     * Returns a list of packages available for install on the Managed Instance.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/osmanagement/ListAvailablePackagesForManagedInstanceExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     ListAvailablePackagesForManagedInstance API.
     */
    ListAvailablePackagesForManagedInstanceResponse listAvailablePackagesForManagedInstance(
            ListAvailablePackagesForManagedInstanceRequest request);

    /**
     * Returns a list of available software sources for a Managed Instance.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/osmanagement/ListAvailableSoftwareSourcesForManagedInstanceExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     ListAvailableSoftwareSourcesForManagedInstance API.
     */
    ListAvailableSoftwareSourcesForManagedInstanceResponse
            listAvailableSoftwareSourcesForManagedInstance(
                    ListAvailableSoftwareSourcesForManagedInstanceRequest request);

    /**
     * Returns a list of available updates for a Managed Instance.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/osmanagement/ListAvailableUpdatesForManagedInstanceExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     ListAvailableUpdatesForManagedInstance API.
     */
    ListAvailableUpdatesForManagedInstanceResponse listAvailableUpdatesForManagedInstance(
            ListAvailableUpdatesForManagedInstanceRequest request);

    /**
     * Returns a list of available Windows updates for a Managed Instance. This is only applicable
     * to Windows instances.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/osmanagement/ListAvailableWindowsUpdatesForManagedInstanceExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     ListAvailableWindowsUpdatesForManagedInstance API.
     */
    ListAvailableWindowsUpdatesForManagedInstanceResponse
            listAvailableWindowsUpdatesForManagedInstance(
                    ListAvailableWindowsUpdatesForManagedInstanceRequest request);

    /**
     * Returns a list of all of the currently available Errata in the system
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/osmanagement/ListErrataExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use ListErrata API.
     */
    ListErrataResponse listErrata(ListErrataRequest request);

    /**
     * Returns a list of errata relevant to the Managed Instance.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/osmanagement/ListManagedInstanceErrataExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     ListManagedInstanceErrata API.
     */
    ListManagedInstanceErrataResponse listManagedInstanceErrata(
            ListManagedInstanceErrataRequest request);

    /**
     * Returns a list of all Managed Instance Groups.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/osmanagement/ListManagedInstanceGroupsExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     ListManagedInstanceGroups API.
     */
    ListManagedInstanceGroupsResponse listManagedInstanceGroups(
            ListManagedInstanceGroupsRequest request);

    /**
     * Returns a list of all Managed Instances.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/osmanagement/ListManagedInstancesExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     ListManagedInstances API.
     */
    ListManagedInstancesResponse listManagedInstances(ListManagedInstancesRequest request);

    /**
     * Retrieve a list of module stream profiles from a software source. Filters may be applied to
     * select a subset of module stream profiles based on the filter criteria.
     *
     * <p>The \"moduleName\", \"streamName\", and \"profileName\" attributes combine to form a set
     * of filters on the list of module stream profiles. If a \"moduleName\" is provided, only
     * profiles that belong to that module are returned. If both a \"moduleName\" and \"streamName\"
     * are given, only profiles belonging to that module stream are returned. Finally, if all three
     * are given then only the particular profile indicated by the triple is returned. It is not
     * valid to supply a \"streamName\" without a \"moduleName\". It is also not valid to supply a
     * \"profileName\" without a \"streamName\".
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/osmanagement/ListModuleStreamProfilesExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     ListModuleStreamProfiles API.
     */
    ListModuleStreamProfilesResponse listModuleStreamProfiles(
            ListModuleStreamProfilesRequest request);

    /**
     * Retrieve a list of module stream profiles, along with a summary of their of their status,
     * from a managed instance. Filters may be applied to select a subset of profiles based on the
     * filter criteria.
     *
     * <p>The \"moduleName\", \"streamName\", and \"profileName\" attributes combine to form a set
     * of filters on the list of module stream profiles. If a \"modulName\" is provided, only
     * profiles that belong to that module are returned. If both a \"moduleName\" and \"streamName\"
     * are given, only profiles belonging to that module stream are returned. Finally, if all three
     * are given then only the particular profile indicated by the triple is returned. It is not
     * valid to supply a \"streamName\" without a \"moduleName\". It is also not valid to supply a
     * \"profileName\" without a \"streamName\".
     *
     * <p>The \"status\" attribute filters against the state of a module stream profile. Valid
     * values are \"INSTALLED\" and \"AVAILABLE\". If the attribute is set to \"INSTALLED\", only
     * module stream profiles that are installed are included in the result set. If the attribute is
     * set to \"AVAILABLE\", only module stream profiles that are not installed are included in the
     * result set. If the attribute is not defined, the request is not subject to this filter.
     *
     * <p>When sorting by display name, the result set is sorted first by module name, then by
     * stream name, and finally by profile name.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/osmanagement/ListModuleStreamProfilesOnManagedInstanceExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     ListModuleStreamProfilesOnManagedInstance API.
     */
    ListModuleStreamProfilesOnManagedInstanceResponse listModuleStreamProfilesOnManagedInstance(
            ListModuleStreamProfilesOnManagedInstanceRequest request);

    /**
     * Retrieve a list of module streams from a software source. Filters may be applied to select a
     * subset of module streams based on the filter criteria.
     *
     * <p>The 'moduleName' attribute filters against the name of a module. It accepts strings of the
     * format \"<module>\". If this attribute is defined, only streams that belong to the specified
     * module are included in the result set. If it is not defined, the request is not subject to
     * this filter. The 'streamName' attribute filters against the name of a stream of a module. If
     * this attribute is defined, only the particular module stream that matches both the module and
     * stream names is included in the result set. It is not valid to supply 'streamName' without
     * also supplying a 'moduleName'.
     *
     * <p>When sorting by display name, the result set is sorted first by module name, then by
     * stream name.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/osmanagement/ListModuleStreamsExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use ListModuleStreams
     *     API.
     */
    ListModuleStreamsResponse listModuleStreams(ListModuleStreamsRequest request);

    /**
     * Retrieve a list of module streams, along with a summary of their status, from a managed
     * instance. Filters may be applied to select a subset of module streams based on the filter
     * criteria.
     *
     * <p>The 'moduleName' attribute filters against the name of a module. It accepts strings of the
     * format \"<module>\". If this attribute is defined, only streams that belong to the specified
     * module are included in the result set. If it is not defined, the request is not subject to
     * this filter.
     *
     * <p>The \"status\" attribute filters against the state of a module stream. Valid values are
     * \"ENABLED\", \"DISABLED\", and \"ACTIVE\". If the attribute is set to \"ENABLED\", only
     * module streams that are enabled are included in the result set. If the attribute is set to
     * \"DISABLED\", only module streams that are not enabled are included in the result set. If the
     * attribute is set to \"ACTIVE\", only module streams that are active are included in the
     * result set. If the attribute is not defined, the request is not subject to this filter.
     *
     * <p>When sorting by the display name, the result set is sorted first by the module name and
     * then by the stream name.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/osmanagement/ListModuleStreamsOnManagedInstanceExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     ListModuleStreamsOnManagedInstance API.
     */
    ListModuleStreamsOnManagedInstanceResponse listModuleStreamsOnManagedInstance(
            ListModuleStreamsOnManagedInstanceRequest request);

    /**
     * Returns a list of installed packages on the Managed Instance.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/osmanagement/ListPackagesInstalledOnManagedInstanceExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     ListPackagesInstalledOnManagedInstance API.
     */
    ListPackagesInstalledOnManagedInstanceResponse listPackagesInstalledOnManagedInstance(
            ListPackagesInstalledOnManagedInstanceRequest request);

    /**
     * Returns a list of all of the currently active Scheduled Jobs in the system
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/osmanagement/ListScheduledJobsExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use ListScheduledJobs
     *     API.
     */
    ListScheduledJobsResponse listScheduledJobs(ListScheduledJobsRequest request);

    /**
     * Lists Software Packages in a Software Source
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/osmanagement/ListSoftwareSourcePackagesExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     ListSoftwareSourcePackages API.
     */
    ListSoftwareSourcePackagesResponse listSoftwareSourcePackages(
            ListSoftwareSourcePackagesRequest request);

    /**
     * Returns a list of all Software Sources.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/osmanagement/ListSoftwareSourcesExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use ListSoftwareSources
     *     API.
     */
    ListSoftwareSourcesResponse listSoftwareSources(ListSoftwareSourcesRequest request);

    /**
     * Returns a list of all of the Scheduled Jobs whose next execution time is at or before the
     * specified time.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/osmanagement/ListUpcomingScheduledJobsExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     ListUpcomingScheduledJobs API.
     */
    ListUpcomingScheduledJobsResponse listUpcomingScheduledJobs(
            ListUpcomingScheduledJobsRequest request);

    /**
     * Returns a list of Windows Updates.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/osmanagement/ListWindowsUpdatesExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use ListWindowsUpdates
     *     API.
     */
    ListWindowsUpdatesResponse listWindowsUpdates(ListWindowsUpdatesRequest request);

    /**
     * Returns a list of installed Windows updates for a Managed Instance. This is only applicable
     * to Windows instances.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/osmanagement/ListWindowsUpdatesInstalledOnManagedInstanceExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     ListWindowsUpdatesInstalledOnManagedInstance API.
     */
    ListWindowsUpdatesInstalledOnManagedInstanceResponse
            listWindowsUpdatesInstalledOnManagedInstance(
                    ListWindowsUpdatesInstalledOnManagedInstanceRequest request);

    /**
     * Gets the errors for the work request with the given ID.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/osmanagement/ListWorkRequestErrorsExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     ListWorkRequestErrors API.
     */
    ListWorkRequestErrorsResponse listWorkRequestErrors(ListWorkRequestErrorsRequest request);

    /**
     * Lists the log entries for the work request with the given ID.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/osmanagement/ListWorkRequestLogsExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use ListWorkRequestLogs
     *     API.
     */
    ListWorkRequestLogsResponse listWorkRequestLogs(ListWorkRequestLogsRequest request);

    /**
     * Lists the work requests in a compartment.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/osmanagement/ListWorkRequestsExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use ListWorkRequests
     *     API.
     */
    ListWorkRequestsResponse listWorkRequests(ListWorkRequestsRequest request);

    /**
     * Perform an operation involving modules, streams, and profiles on a managed instance. Each
     * operation may enable or disable an arbitrary amount of module streams, and install or remove
     * an arbitrary number of module stream profiles. When the operation is complete, the state of
     * the modules, streams, and profiles on the managed instance will match the state indicated in
     * the operation.
     *
     * <p>Each module stream specified in the list of module streams to enable will be in the
     * \"ENABLED\" state upon completion of the operation. If there was already a stream of that
     * module enabled, any work required to switch from the current stream to the new stream is
     * performed implicitly.
     *
     * <p>Each module stream specified in the list of module streams to disable will be in the
     * \"DISABLED\" state upon completion of the operation. Any profiles that are installed for the
     * module stream will be removed as part of the operation.
     *
     * <p>Each module stream profile specified in the list of profiles to install will be in the
     * \"INSTALLED\" state upon completion of the operation, indicating that any packages that are
     * part of the profile are installed on the managed instance. If the module stream containing
     * the profile is not enabled, it will be enabled as part of the operation. There is an
     * exception when attempting to install a stream of a profile when another stream of the same
     * module is enabled. It is an error to attempt to install a profile of another module stream,
     * unless enabling the new module stream is explicitly included in this operation.
     *
     * <p>Each module stream profile specified in the list of profiles to remove will be in the
     * \"AVAILABLE\" state upon completion of the operation. The status of packages within the
     * profile after the operation is complete is defined by the package manager on the managed
     * instance.
     *
     * <p>Operations that contain one or more elements that are not allowed are rejected.
     *
     * <p>The result of this request is a WorkRequest object. The returned WorkRequest is the parent
     * of a structure of other WorkRequests. Taken as a whole, this structure indicates the entire
     * set of work to be performed to complete the operation.
     *
     * <p>This interface can also be used to perform a dry run of the operation rather than
     * committing it to a managed instance. If a dry run is requested, the OS Management Service
     * will evaluate the operation against the current module, stream, and profile state on the
     * managed instance. It will calculate the impact of the operation on all modules, streams, and
     * profiles on the managed instance, including those that are implicitly impacted by the
     * operation.
     *
     * <p>The WorkRequest resulting from a dry run behaves differently than a WorkRequest resulting
     * from a committable operation. Dry run WorkRequests are always singletons and never have
     * children. The impact of the operation is returned using the log and error facilities of
     * WorkRequests. The impact of operations that are allowed by the OS Management Service are
     * communicated as one or more work request log entries. Operations that are not allowed by the
     * OS Management Service are communicated as one or more work requst error entries. Each entry,
     * for either logs or errors, contains a structured message containing the results of one or
     * more operations.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/osmanagement/ManageModuleStreamsOnManagedInstanceExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     ManageModuleStreamsOnManagedInstance API.
     */
    ManageModuleStreamsOnManagedInstanceResponse manageModuleStreamsOnManagedInstance(
            ManageModuleStreamsOnManagedInstanceRequest request);

    /**
     * Removes a profile for a module stream that is installed on a managed instance. If a module
     * stream is provided, rather than a fully qualified profile, all profiles that have been
     * installed for the module stream will be removed.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/osmanagement/RemoveModuleStreamProfileFromManagedInstanceExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     RemoveModuleStreamProfileFromManagedInstance API.
     */
    RemoveModuleStreamProfileFromManagedInstanceResponse
            removeModuleStreamProfileFromManagedInstance(
                    RemoveModuleStreamProfileFromManagedInstanceRequest request);

    /**
     * Removes an installed package from a managed instance.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/osmanagement/RemovePackageFromManagedInstanceExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     RemovePackageFromManagedInstance API.
     */
    RemovePackageFromManagedInstanceResponse removePackageFromManagedInstance(
            RemovePackageFromManagedInstanceRequest request);

    /**
     * Removes a given list of Software Packages from a specific Software Source.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/osmanagement/RemovePackagesFromSoftwareSourceExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     RemovePackagesFromSoftwareSource API.
     */
    RemovePackagesFromSoftwareSourceResponse removePackagesFromSoftwareSource(
            RemovePackagesFromSoftwareSourceRequest request);

    /**
     * This will trigger an already created Scheduled Job to being executing immediately instead of
     * waiting for its next regularly scheduled time.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/osmanagement/RunScheduledJobNowExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use RunScheduledJobNow
     *     API.
     */
    RunScheduledJobNowResponse runScheduledJobNow(RunScheduledJobNowRequest request);

    /**
     * Searches all of the available Software Sources and returns any/all Software Packages matching
     * the search criteria.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/osmanagement/SearchSoftwarePackagesExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     SearchSoftwarePackages API.
     */
    SearchSoftwarePackagesResponse searchSoftwarePackages(SearchSoftwarePackagesRequest request);

    /**
     * This will force an already created Scheduled Job to skip its next regularly scheduled
     * execution
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/osmanagement/SkipNextScheduledJobExecutionExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     SkipNextScheduledJobExecution API.
     */
    SkipNextScheduledJobExecutionResponse skipNextScheduledJobExecution(
            SkipNextScheduledJobExecutionRequest request);

    /**
     * Enables a new stream for a module that already has a stream enabled. If any profiles or
     * packages from the original module are installed, switching to a new stream will remove the
     * existing packages and install their counterparts in the new stream.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/osmanagement/SwitchModuleStreamOnManagedInstanceExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     SwitchModuleStreamOnManagedInstance API.
     */
    SwitchModuleStreamOnManagedInstanceResponse switchModuleStreamOnManagedInstance(
            SwitchModuleStreamOnManagedInstanceRequest request);

    /**
     * Updates a specific Managed Instance.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/osmanagement/UpdateManagedInstanceExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     UpdateManagedInstance API.
     */
    UpdateManagedInstanceResponse updateManagedInstance(UpdateManagedInstanceRequest request);

    /**
     * Updates a specific Managed Instance Group.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/osmanagement/UpdateManagedInstanceGroupExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     UpdateManagedInstanceGroup API.
     */
    UpdateManagedInstanceGroupResponse updateManagedInstanceGroup(
            UpdateManagedInstanceGroupRequest request);

    /**
     * Updates an existing Scheduled Job on the management system.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/osmanagement/UpdateScheduledJobExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use UpdateScheduledJob
     *     API.
     */
    UpdateScheduledJobResponse updateScheduledJob(UpdateScheduledJobRequest request);

    /**
     * Updates an existing custom Software Source on the management system.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/osmanagement/UpdateSoftwareSourceExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     UpdateSoftwareSource API.
     */
    UpdateSoftwareSourceResponse updateSoftwareSource(UpdateSoftwareSourceRequest request);

    /**
     * Gets the pre-configured waiters available for resources for this service.
     *
     * @return The service waiters.
     */
    OsManagementWaiters getWaiters();

    /**
     * Gets the pre-configured paginators available for list operations in this service which may
     * return multiple pages of data. These paginators provide an {@link java.lang.Iterable}
     * interface so that service responses, or resources/records, can be iterated through without
     * having to manually deal with pagination and page tokens.
     *
     * @return The service paginators.
     */
    OsManagementPaginators getPaginators();
}

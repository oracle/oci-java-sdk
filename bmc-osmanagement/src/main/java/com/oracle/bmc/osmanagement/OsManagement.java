/**
 * Copyright (c) 2016, 2021, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.osmanagement;

import com.oracle.bmc.osmanagement.requests.*;
import com.oracle.bmc.osmanagement.responses.*;

/**
 * API for the OS Management service. Use these API operations for working
 * with Managed instances and Managed instance groups.
 *
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20190801")
public interface OsManagement extends AutoCloseable {

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
     * Adds a given list of Software Packages to a specific Software Source.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation will not retry by default, users can also use RetryConfiguration.DEFAULT_RETRY_CONFIGURATION provided by the SDK to enable retries for it.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/osmanagement/AddPackagesToSoftwareSourceExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use AddPackagesToSoftwareSource API.
     */
    AddPackagesToSoftwareSourceResponse addPackagesToSoftwareSource(
            AddPackagesToSoftwareSourceRequest request);

    /**
     * Adds a child software source to a managed instance. After the software
     * source has been added, then packages from that software source can be
     * installed on the managed instance.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation will not retry by default, users can also use RetryConfiguration.DEFAULT_RETRY_CONFIGURATION provided by the SDK to enable retries for it.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/osmanagement/AttachChildSoftwareSourceToManagedInstanceExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use AttachChildSoftwareSourceToManagedInstance API.
     */
    AttachChildSoftwareSourceToManagedInstanceResponse attachChildSoftwareSourceToManagedInstance(
            AttachChildSoftwareSourceToManagedInstanceRequest request);

    /**
     * Adds a Managed Instance to a Managed Instance Group. After the Managed
     * Instance has been added, then operations can be performed on the Managed
     * Instance Group which will then apply to all Managed Instances in the
     * group.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation will not retry by default, users can also use RetryConfiguration.DEFAULT_RETRY_CONFIGURATION provided by the SDK to enable retries for it.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/osmanagement/AttachManagedInstanceToManagedInstanceGroupExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use AttachManagedInstanceToManagedInstanceGroup API.
     */
    AttachManagedInstanceToManagedInstanceGroupResponse attachManagedInstanceToManagedInstanceGroup(
            AttachManagedInstanceToManagedInstanceGroupRequest request);

    /**
     * Adds a parent software source to a managed instance. After the software
     * source has been added, then packages from that software source can be
     * installed on the managed instance. Software sources that have this
     * software source as a parent will be able to be added to this managed instance.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation will not retry by default, users can also use RetryConfiguration.DEFAULT_RETRY_CONFIGURATION provided by the SDK to enable retries for it.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/osmanagement/AttachParentSoftwareSourceToManagedInstanceExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use AttachParentSoftwareSourceToManagedInstance API.
     */
    AttachParentSoftwareSourceToManagedInstanceResponse attachParentSoftwareSourceToManagedInstance(
            AttachParentSoftwareSourceToManagedInstanceRequest request);

    /**
     * Moves a resource into a different compartment. When provided, If-Match
     * is checked against ETag values of the resource.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation will not retry by default, users can also use RetryConfiguration.DEFAULT_RETRY_CONFIGURATION provided by the SDK to enable retries for it.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/osmanagement/ChangeManagedInstanceGroupCompartmentExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use ChangeManagedInstanceGroupCompartment API.
     */
    ChangeManagedInstanceGroupCompartmentResponse changeManagedInstanceGroupCompartment(
            ChangeManagedInstanceGroupCompartmentRequest request);

    /**
     * Moves a resource into a different compartment. When provided, If-Match
     * is checked against ETag values of the resource.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation will not retry by default, users can also use RetryConfiguration.DEFAULT_RETRY_CONFIGURATION provided by the SDK to enable retries for it.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/osmanagement/ChangeScheduledJobCompartmentExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use ChangeScheduledJobCompartment API.
     */
    ChangeScheduledJobCompartmentResponse changeScheduledJobCompartment(
            ChangeScheduledJobCompartmentRequest request);

    /**
     * Moves a resource into a different compartment. When provided, If-Match
     * is checked against ETag values of the resource.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation will not retry by default, users can also use RetryConfiguration.DEFAULT_RETRY_CONFIGURATION provided by the SDK to enable retries for it.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/osmanagement/ChangeSoftwareSourceCompartmentExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use ChangeSoftwareSourceCompartment API.
     */
    ChangeSoftwareSourceCompartmentResponse changeSoftwareSourceCompartment(
            ChangeSoftwareSourceCompartmentRequest request);

    /**
     * Creates a new Managed Instance Group on the management system.
     * This will not contain any managed instances after it is first created,
     * and they must be added later.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation will not retry by default, users can also use RetryConfiguration.DEFAULT_RETRY_CONFIGURATION provided by the SDK to enable retries for it.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/osmanagement/CreateManagedInstanceGroupExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use CreateManagedInstanceGroup API.
     */
    CreateManagedInstanceGroupResponse createManagedInstanceGroup(
            CreateManagedInstanceGroupRequest request);

    /**
     * Creates a new Scheduled Job to perform a specific package operation on
     * a set of managed instances or managed instance groups.  Can be created
     * as a one-time execution in the future, or as a recurring execution
     * that repeats on a defined interval.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation will not retry by default, users can also use RetryConfiguration.DEFAULT_RETRY_CONFIGURATION provided by the SDK to enable retries for it.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/osmanagement/CreateScheduledJobExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use CreateScheduledJob API.
     */
    CreateScheduledJobResponse createScheduledJob(CreateScheduledJobRequest request);

    /**
     * Creates a new custom Software Source on the management system.
     * This will not contain any packages after it is first created,
     * and they must be added later.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation will not retry by default, users can also use RetryConfiguration.DEFAULT_RETRY_CONFIGURATION provided by the SDK to enable retries for it.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/osmanagement/CreateSoftwareSourceExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use CreateSoftwareSource API.
     */
    CreateSoftwareSourceResponse createSoftwareSource(CreateSoftwareSourceRequest request);

    /**
     * Deletes a Managed Instance Group from the management system
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation will not retry by default, users can also use RetryConfiguration.DEFAULT_RETRY_CONFIGURATION provided by the SDK to enable retries for it.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/osmanagement/DeleteManagedInstanceGroupExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use DeleteManagedInstanceGroup API.
     */
    DeleteManagedInstanceGroupResponse deleteManagedInstanceGroup(
            DeleteManagedInstanceGroupRequest request);

    /**
     * Cancels an existing Scheduled Job on the management system
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation will not retry by default, users can also use RetryConfiguration.DEFAULT_RETRY_CONFIGURATION provided by the SDK to enable retries for it.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/osmanagement/DeleteScheduledJobExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use DeleteScheduledJob API.
     */
    DeleteScheduledJobResponse deleteScheduledJob(DeleteScheduledJobRequest request);

    /**
     * Deletes a custom Software Source on the management system
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation will not retry by default, users can also use RetryConfiguration.DEFAULT_RETRY_CONFIGURATION provided by the SDK to enable retries for it.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/osmanagement/DeleteSoftwareSourceExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use DeleteSoftwareSource API.
     */
    DeleteSoftwareSourceResponse deleteSoftwareSource(DeleteSoftwareSourceRequest request);

    /**
     * Removes a child software source from a managed instance. Packages will no longer be able to be
     * installed from these software sources.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation will not retry by default, users can also use RetryConfiguration.DEFAULT_RETRY_CONFIGURATION provided by the SDK to enable retries for it.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/osmanagement/DetachChildSoftwareSourceFromManagedInstanceExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use DetachChildSoftwareSourceFromManagedInstance API.
     */
    DetachChildSoftwareSourceFromManagedInstanceResponse
            detachChildSoftwareSourceFromManagedInstance(
                    DetachChildSoftwareSourceFromManagedInstanceRequest request);

    /**
     * Removes a Managed Instance from a Managed Instance Group.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation will not retry by default, users can also use RetryConfiguration.DEFAULT_RETRY_CONFIGURATION provided by the SDK to enable retries for it.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/osmanagement/DetachManagedInstanceFromManagedInstanceGroupExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use DetachManagedInstanceFromManagedInstanceGroup API.
     */
    DetachManagedInstanceFromManagedInstanceGroupResponse
            detachManagedInstanceFromManagedInstanceGroup(
                    DetachManagedInstanceFromManagedInstanceGroupRequest request);

    /**
     * Removes a software source from a managed instance. All child software sources will also be removed
     * from the managed instance. Packages will no longer be able to be installed from these software sources.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation will not retry by default, users can also use RetryConfiguration.DEFAULT_RETRY_CONFIGURATION provided by the SDK to enable retries for it.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/osmanagement/DetachParentSoftwareSourceFromManagedInstanceExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use DetachParentSoftwareSourceFromManagedInstance API.
     */
    DetachParentSoftwareSourceFromManagedInstanceResponse
            detachParentSoftwareSourceFromManagedInstance(
                    DetachParentSoftwareSourceFromManagedInstanceRequest request);

    /**
     * Returns a specific erratum.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation will not retry by default, users can also use RetryConfiguration.DEFAULT_RETRY_CONFIGURATION provided by the SDK to enable retries for it.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/osmanagement/GetErratumExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use GetErratum API.
     */
    GetErratumResponse getErratum(GetErratumRequest request);

    /**
     * Returns a specific Managed Instance.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation will not retry by default, users can also use RetryConfiguration.DEFAULT_RETRY_CONFIGURATION provided by the SDK to enable retries for it.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/osmanagement/GetManagedInstanceExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use GetManagedInstance API.
     */
    GetManagedInstanceResponse getManagedInstance(GetManagedInstanceRequest request);

    /**
     * Returns a specific Managed Instance Group.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation will not retry by default, users can also use RetryConfiguration.DEFAULT_RETRY_CONFIGURATION provided by the SDK to enable retries for it.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/osmanagement/GetManagedInstanceGroupExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use GetManagedInstanceGroup API.
     */
    GetManagedInstanceGroupResponse getManagedInstanceGroup(GetManagedInstanceGroupRequest request);

    /**
     * Gets the detailed information for the Scheduled Job with the given ID.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation will not retry by default, users can also use RetryConfiguration.DEFAULT_RETRY_CONFIGURATION provided by the SDK to enable retries for it.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/osmanagement/GetScheduledJobExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use GetScheduledJob API.
     */
    GetScheduledJobResponse getScheduledJob(GetScheduledJobRequest request);

    /**
     * Returns a specific Software Package.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation will not retry by default, users can also use RetryConfiguration.DEFAULT_RETRY_CONFIGURATION provided by the SDK to enable retries for it.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/osmanagement/GetSoftwarePackageExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use GetSoftwarePackage API.
     */
    GetSoftwarePackageResponse getSoftwarePackage(GetSoftwarePackageRequest request);

    /**
     * Returns a specific Software Source.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation will not retry by default, users can also use RetryConfiguration.DEFAULT_RETRY_CONFIGURATION provided by the SDK to enable retries for it.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/osmanagement/GetSoftwareSourceExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use GetSoftwareSource API.
     */
    GetSoftwareSourceResponse getSoftwareSource(GetSoftwareSourceRequest request);

    /**
     * Returns a Windows Update object.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation will not retry by default, users can also use RetryConfiguration.DEFAULT_RETRY_CONFIGURATION provided by the SDK to enable retries for it.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/osmanagement/GetWindowsUpdateExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use GetWindowsUpdate API.
     */
    GetWindowsUpdateResponse getWindowsUpdate(GetWindowsUpdateRequest request);

    /**
     * Gets the detailed information for the work request with the given ID.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation will not retry by default, users can also use RetryConfiguration.DEFAULT_RETRY_CONFIGURATION provided by the SDK to enable retries for it.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/osmanagement/GetWorkRequestExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use GetWorkRequest API.
     */
    GetWorkRequestResponse getWorkRequest(GetWorkRequestRequest request);

    /**
     * Install all of the available package updates for the managed instance.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation will not retry by default, users can also use RetryConfiguration.DEFAULT_RETRY_CONFIGURATION provided by the SDK to enable retries for it.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/osmanagement/InstallAllPackageUpdatesOnManagedInstanceExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use InstallAllPackageUpdatesOnManagedInstance API.
     */
    InstallAllPackageUpdatesOnManagedInstanceResponse installAllPackageUpdatesOnManagedInstance(
            InstallAllPackageUpdatesOnManagedInstanceRequest request);

    /**
     * Install all of the available updates for the Managed Instance Group.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation will not retry by default, users can also use RetryConfiguration.DEFAULT_RETRY_CONFIGURATION provided by the SDK to enable retries for it.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/osmanagement/InstallAllUpdatesOnManagedInstanceGroupExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use InstallAllUpdatesOnManagedInstanceGroup API.
     */
    InstallAllUpdatesOnManagedInstanceGroupResponse installAllUpdatesOnManagedInstanceGroup(
            InstallAllUpdatesOnManagedInstanceGroupRequest request);

    /**
     * Install all of the available Windows updates for the managed instance.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation will not retry by default, users can also use RetryConfiguration.DEFAULT_RETRY_CONFIGURATION provided by the SDK to enable retries for it.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/osmanagement/InstallAllWindowsUpdatesOnManagedInstanceExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use InstallAllWindowsUpdatesOnManagedInstance API.
     */
    InstallAllWindowsUpdatesOnManagedInstanceResponse installAllWindowsUpdatesOnManagedInstance(
            InstallAllWindowsUpdatesOnManagedInstanceRequest request);

    /**
     * Installs a package on a managed instance.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation will not retry by default, users can also use RetryConfiguration.DEFAULT_RETRY_CONFIGURATION provided by the SDK to enable retries for it.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/osmanagement/InstallPackageOnManagedInstanceExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use InstallPackageOnManagedInstance API.
     */
    InstallPackageOnManagedInstanceResponse installPackageOnManagedInstance(
            InstallPackageOnManagedInstanceRequest request);

    /**
     * Updates a package on a managed instance.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation will not retry by default, users can also use RetryConfiguration.DEFAULT_RETRY_CONFIGURATION provided by the SDK to enable retries for it.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/osmanagement/InstallPackageUpdateOnManagedInstanceExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use InstallPackageUpdateOnManagedInstance API.
     */
    InstallPackageUpdateOnManagedInstanceResponse installPackageUpdateOnManagedInstance(
            InstallPackageUpdateOnManagedInstanceRequest request);

    /**
     * Installs a Windows update on a managed instance.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation will not retry by default, users can also use RetryConfiguration.DEFAULT_RETRY_CONFIGURATION provided by the SDK to enable retries for it.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/osmanagement/InstallWindowsUpdateOnManagedInstanceExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use InstallWindowsUpdateOnManagedInstance API.
     */
    InstallWindowsUpdateOnManagedInstanceResponse installWindowsUpdateOnManagedInstance(
            InstallWindowsUpdateOnManagedInstanceRequest request);

    /**
     * Returns a list of packages available for install on the Managed Instance.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation will not retry by default, users can also use RetryConfiguration.DEFAULT_RETRY_CONFIGURATION provided by the SDK to enable retries for it.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/osmanagement/ListAvailablePackagesForManagedInstanceExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use ListAvailablePackagesForManagedInstance API.
     */
    ListAvailablePackagesForManagedInstanceResponse listAvailablePackagesForManagedInstance(
            ListAvailablePackagesForManagedInstanceRequest request);

    /**
     * Returns a list of available software sources for a Managed Instance.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation will not retry by default, users can also use RetryConfiguration.DEFAULT_RETRY_CONFIGURATION provided by the SDK to enable retries for it.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/osmanagement/ListAvailableSoftwareSourcesForManagedInstanceExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use ListAvailableSoftwareSourcesForManagedInstance API.
     */
    ListAvailableSoftwareSourcesForManagedInstanceResponse
            listAvailableSoftwareSourcesForManagedInstance(
                    ListAvailableSoftwareSourcesForManagedInstanceRequest request);

    /**
     * Returns a list of available updates for a Managed Instance.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation will not retry by default, users can also use RetryConfiguration.DEFAULT_RETRY_CONFIGURATION provided by the SDK to enable retries for it.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/osmanagement/ListAvailableUpdatesForManagedInstanceExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use ListAvailableUpdatesForManagedInstance API.
     */
    ListAvailableUpdatesForManagedInstanceResponse listAvailableUpdatesForManagedInstance(
            ListAvailableUpdatesForManagedInstanceRequest request);

    /**
     * Returns a list of available Windows updates for a Managed Instance. This is only applicable to Windows instances.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation will not retry by default, users can also use RetryConfiguration.DEFAULT_RETRY_CONFIGURATION provided by the SDK to enable retries for it.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/osmanagement/ListAvailableWindowsUpdatesForManagedInstanceExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use ListAvailableWindowsUpdatesForManagedInstance API.
     */
    ListAvailableWindowsUpdatesForManagedInstanceResponse
            listAvailableWindowsUpdatesForManagedInstance(
                    ListAvailableWindowsUpdatesForManagedInstanceRequest request);

    /**
     * Returns a list of all of the currently available Errata in the system
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation will not retry by default, users can also use RetryConfiguration.DEFAULT_RETRY_CONFIGURATION provided by the SDK to enable retries for it.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/osmanagement/ListErrataExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use ListErrata API.
     */
    ListErrataResponse listErrata(ListErrataRequest request);

    /**
     * Returns a list of errata relevant to the Managed Instance.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation will not retry by default, users can also use RetryConfiguration.DEFAULT_RETRY_CONFIGURATION provided by the SDK to enable retries for it.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/osmanagement/ListManagedInstanceErrataExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use ListManagedInstanceErrata API.
     */
    ListManagedInstanceErrataResponse listManagedInstanceErrata(
            ListManagedInstanceErrataRequest request);

    /**
     * Returns a list of all Managed Instance Groups.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation will not retry by default, users can also use RetryConfiguration.DEFAULT_RETRY_CONFIGURATION provided by the SDK to enable retries for it.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/osmanagement/ListManagedInstanceGroupsExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use ListManagedInstanceGroups API.
     */
    ListManagedInstanceGroupsResponse listManagedInstanceGroups(
            ListManagedInstanceGroupsRequest request);

    /**
     * Returns a list of all Managed Instances.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation will not retry by default, users can also use RetryConfiguration.DEFAULT_RETRY_CONFIGURATION provided by the SDK to enable retries for it.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/osmanagement/ListManagedInstancesExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use ListManagedInstances API.
     */
    ListManagedInstancesResponse listManagedInstances(ListManagedInstancesRequest request);

    /**
     * Returns a list of installed packages on the Managed Instance.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation will not retry by default, users can also use RetryConfiguration.DEFAULT_RETRY_CONFIGURATION provided by the SDK to enable retries for it.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/osmanagement/ListPackagesInstalledOnManagedInstanceExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use ListPackagesInstalledOnManagedInstance API.
     */
    ListPackagesInstalledOnManagedInstanceResponse listPackagesInstalledOnManagedInstance(
            ListPackagesInstalledOnManagedInstanceRequest request);

    /**
     * Returns a list of all of the currently active Scheduled Jobs in the system
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation will not retry by default, users can also use RetryConfiguration.DEFAULT_RETRY_CONFIGURATION provided by the SDK to enable retries for it.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/osmanagement/ListScheduledJobsExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use ListScheduledJobs API.
     */
    ListScheduledJobsResponse listScheduledJobs(ListScheduledJobsRequest request);

    /**
     * Lists Software Packages in a Software Source
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation will not retry by default, users can also use RetryConfiguration.DEFAULT_RETRY_CONFIGURATION provided by the SDK to enable retries for it.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/osmanagement/ListSoftwareSourcePackagesExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use ListSoftwareSourcePackages API.
     */
    ListSoftwareSourcePackagesResponse listSoftwareSourcePackages(
            ListSoftwareSourcePackagesRequest request);

    /**
     * Returns a list of all Software Sources.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation will not retry by default, users can also use RetryConfiguration.DEFAULT_RETRY_CONFIGURATION provided by the SDK to enable retries for it.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/osmanagement/ListSoftwareSourcesExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use ListSoftwareSources API.
     */
    ListSoftwareSourcesResponse listSoftwareSources(ListSoftwareSourcesRequest request);

    /**
     * Returns a list of all of the Scheduled Jobs whose next execution time is at or before the specified time.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation will not retry by default, users can also use RetryConfiguration.DEFAULT_RETRY_CONFIGURATION provided by the SDK to enable retries for it.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/osmanagement/ListUpcomingScheduledJobsExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use ListUpcomingScheduledJobs API.
     */
    ListUpcomingScheduledJobsResponse listUpcomingScheduledJobs(
            ListUpcomingScheduledJobsRequest request);

    /**
     * Returns a list of Windows Updates.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation will not retry by default, users can also use RetryConfiguration.DEFAULT_RETRY_CONFIGURATION provided by the SDK to enable retries for it.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/osmanagement/ListWindowsUpdatesExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use ListWindowsUpdates API.
     */
    ListWindowsUpdatesResponse listWindowsUpdates(ListWindowsUpdatesRequest request);

    /**
     * Returns a list of installed Windows updates for a Managed Instance. This is only applicable to Windows instances.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation will not retry by default, users can also use RetryConfiguration.DEFAULT_RETRY_CONFIGURATION provided by the SDK to enable retries for it.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/osmanagement/ListWindowsUpdatesInstalledOnManagedInstanceExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use ListWindowsUpdatesInstalledOnManagedInstance API.
     */
    ListWindowsUpdatesInstalledOnManagedInstanceResponse
            listWindowsUpdatesInstalledOnManagedInstance(
                    ListWindowsUpdatesInstalledOnManagedInstanceRequest request);

    /**
     * Gets the errors for the work request with the given ID.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation will not retry by default, users can also use RetryConfiguration.DEFAULT_RETRY_CONFIGURATION provided by the SDK to enable retries for it.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/osmanagement/ListWorkRequestErrorsExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use ListWorkRequestErrors API.
     */
    ListWorkRequestErrorsResponse listWorkRequestErrors(ListWorkRequestErrorsRequest request);

    /**
     * Lists the log entries for the work request with the given ID.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation will not retry by default, users can also use RetryConfiguration.DEFAULT_RETRY_CONFIGURATION provided by the SDK to enable retries for it.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/osmanagement/ListWorkRequestLogsExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use ListWorkRequestLogs API.
     */
    ListWorkRequestLogsResponse listWorkRequestLogs(ListWorkRequestLogsRequest request);

    /**
     * Lists the work requests in a compartment.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation will not retry by default, users can also use RetryConfiguration.DEFAULT_RETRY_CONFIGURATION provided by the SDK to enable retries for it.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/osmanagement/ListWorkRequestsExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use ListWorkRequests API.
     */
    ListWorkRequestsResponse listWorkRequests(ListWorkRequestsRequest request);

    /**
     * Removes an installed package from a managed instance.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation will not retry by default, users can also use RetryConfiguration.DEFAULT_RETRY_CONFIGURATION provided by the SDK to enable retries for it.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/osmanagement/RemovePackageFromManagedInstanceExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use RemovePackageFromManagedInstance API.
     */
    RemovePackageFromManagedInstanceResponse removePackageFromManagedInstance(
            RemovePackageFromManagedInstanceRequest request);

    /**
     * Removes a given list of Software Packages from a specific Software Source.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation will not retry by default, users can also use RetryConfiguration.DEFAULT_RETRY_CONFIGURATION provided by the SDK to enable retries for it.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/osmanagement/RemovePackagesFromSoftwareSourceExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use RemovePackagesFromSoftwareSource API.
     */
    RemovePackagesFromSoftwareSourceResponse removePackagesFromSoftwareSource(
            RemovePackagesFromSoftwareSourceRequest request);

    /**
     * This will trigger an already created Scheduled Job to being executing
     * immediately instead of waiting for its next regularly scheduled time.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation will not retry by default, users can also use RetryConfiguration.DEFAULT_RETRY_CONFIGURATION provided by the SDK to enable retries for it.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/osmanagement/RunScheduledJobNowExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use RunScheduledJobNow API.
     */
    RunScheduledJobNowResponse runScheduledJobNow(RunScheduledJobNowRequest request);

    /**
     * Searches all of the available Software Sources and returns any/all Software Packages matching
     * the search criteria.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation will not retry by default, users can also use RetryConfiguration.DEFAULT_RETRY_CONFIGURATION provided by the SDK to enable retries for it.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/osmanagement/SearchSoftwarePackagesExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use SearchSoftwarePackages API.
     */
    SearchSoftwarePackagesResponse searchSoftwarePackages(SearchSoftwarePackagesRequest request);

    /**
     * This will force an already created Scheduled Job to skip its
     * next regularly scheduled execution
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation will not retry by default, users can also use RetryConfiguration.DEFAULT_RETRY_CONFIGURATION provided by the SDK to enable retries for it.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/osmanagement/SkipNextScheduledJobExecutionExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use SkipNextScheduledJobExecution API.
     */
    SkipNextScheduledJobExecutionResponse skipNextScheduledJobExecution(
            SkipNextScheduledJobExecutionRequest request);

    /**
     * Updates a specific Managed Instance.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation will not retry by default, users can also use RetryConfiguration.DEFAULT_RETRY_CONFIGURATION provided by the SDK to enable retries for it.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/osmanagement/UpdateManagedInstanceExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use UpdateManagedInstance API.
     */
    UpdateManagedInstanceResponse updateManagedInstance(UpdateManagedInstanceRequest request);

    /**
     * Updates a specific Managed Instance Group.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation will not retry by default, users can also use RetryConfiguration.DEFAULT_RETRY_CONFIGURATION provided by the SDK to enable retries for it.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/osmanagement/UpdateManagedInstanceGroupExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use UpdateManagedInstanceGroup API.
     */
    UpdateManagedInstanceGroupResponse updateManagedInstanceGroup(
            UpdateManagedInstanceGroupRequest request);

    /**
     * Updates an existing Scheduled Job on the management system.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation will not retry by default, users can also use RetryConfiguration.DEFAULT_RETRY_CONFIGURATION provided by the SDK to enable retries for it.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/osmanagement/UpdateScheduledJobExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use UpdateScheduledJob API.
     */
    UpdateScheduledJobResponse updateScheduledJob(UpdateScheduledJobRequest request);

    /**
     * Updates an existing custom Software Source on the management system.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation will not retry by default, users can also use RetryConfiguration.DEFAULT_RETRY_CONFIGURATION provided by the SDK to enable retries for it.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/osmanagement/UpdateSoftwareSourceExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use UpdateSoftwareSource API.
     */
    UpdateSoftwareSourceResponse updateSoftwareSource(UpdateSoftwareSourceRequest request);

    /**
     * Gets the pre-configured waiters available for resources for this service.
     *
     * @return The service waiters.
     */
    OsManagementWaiters getWaiters();

    /**
     * Gets the pre-configured paginators available for list operations in this service which may return multiple
     * pages of data. These paginators provide an {@link java.lang.Iterable} interface so that service responses, or
     * resources/records, can be iterated through without having to manually deal with pagination and page tokens.
     *
     * @return The service paginators.
     */
    OsManagementPaginators getPaginators();
}

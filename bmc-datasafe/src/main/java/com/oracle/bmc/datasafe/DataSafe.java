/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.datasafe;

import com.oracle.bmc.datasafe.requests.*;
import com.oracle.bmc.datasafe.responses.*;

/**
 * APIs for using Oracle Data Safe. This service client uses
 * CircuitBreakerUtils.DEFAULT_CIRCUIT_BREAKER for all the operations by default if no circuit
 * breaker configuration is defined by the user.
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20181201")
public interface DataSafe extends AutoCloseable {

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
     * Reactivates a previously deactivated Data Safe target database.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/datasafe/ActivateTargetDatabaseExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     ActivateTargetDatabase API.
     */
    ActivateTargetDatabaseResponse activateTargetDatabase(ActivateTargetDatabaseRequest request);

    /**
     * Adds columns to the specified masking policy from the associated sensitive data model. It
     * automatically pulls all the sensitive columns and their relationships from the sensitive data
     * model and uses this information to create columns in the masking policy. It also assigns
     * default masking formats to these columns based on the associated sensitive types.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/datasafe/AddMaskingColumnsFromSdmExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     AddMaskingColumnsFromSdm API.
     */
    AddMaskingColumnsFromSdmResponse addMaskingColumnsFromSdm(
            AddMaskingColumnsFromSdmRequest request);

    /**
     * Updates alerts in the specified compartment.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/datasafe/AlertsUpdateExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use AlertsUpdate API.
     */
    AlertsUpdateResponse alertsUpdate(AlertsUpdateRequest request);

    /**
     * Applies the results of a discovery job to the specified sensitive data model. Note that the
     * plannedAction attribute of discovery results is used for processing them. You should first
     * use PatchDiscoveryJobResults to set the plannedAction attribute of the discovery results you
     * want to process. ApplyDiscoveryJobResults automatically reads the plannedAction attribute and
     * updates the sensitive data model to reflect the actions you planned.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/datasafe/ApplyDiscoveryJobResultsExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     ApplyDiscoveryJobResults API.
     */
    ApplyDiscoveryJobResultsResponse applyDiscoveryJobResults(
            ApplyDiscoveryJobResultsRequest request);

    /**
     * Applies the difference of a SDM Masking policy difference resource to the specified masking
     * policy. Note that the plannedAction attribute of difference columns is used for processing.
     * You should first use PatchSdmMaskingPolicyDifferenceColumns to set the plannedAction
     * attribute of the difference columns you want to process. ApplySdmMaskingPolicyDifference
     * automatically reads the plannedAction attribute and updates the masking policy to reflect the
     * actions you planned. If the sdmMaskingPolicydifferenceId is not passed, the latest
     * sdmMaskingPolicydifference is used. Note that if the masking policy associated with the
     * SdmMaskingPolicyDifference used for this operation is not associated with the original SDM
     * anymore, this operation won't be allowed.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/datasafe/ApplySdmMaskingPolicyDifferenceExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     ApplySdmMaskingPolicyDifference API.
     */
    ApplySdmMaskingPolicyDifferenceResponse applySdmMaskingPolicyDifference(
            ApplySdmMaskingPolicyDifferenceRequest request);

    /**
     * Calculates the volume of audit events available on the target database to be collected.
     * Measurable up to the defined retention period of the audit target resource.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/datasafe/CalculateAuditVolumeAvailableExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     CalculateAuditVolumeAvailable API.
     */
    CalculateAuditVolumeAvailableResponse calculateAuditVolumeAvailable(
            CalculateAuditVolumeAvailableRequest request);

    /**
     * Calculates the volume of audit events collected by data safe.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/datasafe/CalculateAuditVolumeCollectedExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     CalculateAuditVolumeCollected API.
     */
    CalculateAuditVolumeCollectedResponse calculateAuditVolumeCollected(
            CalculateAuditVolumeCollectedRequest request);

    /**
     * Cancel the given work request.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/datasafe/CancelWorkRequestExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use CancelWorkRequest
     *     API.
     */
    CancelWorkRequestResponse cancelWorkRequest(CancelWorkRequestRequest request);

    /**
     * Moves the specified alert into a different compartment.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/datasafe/ChangeAlertCompartmentExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     ChangeAlertCompartment API.
     */
    ChangeAlertCompartmentResponse changeAlertCompartment(ChangeAlertCompartmentRequest request);

    /**
     * Moves the archive retreival to the specified compartment. When provided, if-Match is checked
     * against ETag value of the resource.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/datasafe/ChangeAuditArchiveRetrievalCompartmentExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     ChangeAuditArchiveRetrievalCompartment API.
     */
    ChangeAuditArchiveRetrievalCompartmentResponse changeAuditArchiveRetrievalCompartment(
            ChangeAuditArchiveRetrievalCompartmentRequest request);

    /**
     * Moves the specified audit policy and its dependent resources into a different compartment.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/datasafe/ChangeAuditPolicyCompartmentExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     ChangeAuditPolicyCompartment API.
     */
    ChangeAuditPolicyCompartmentResponse changeAuditPolicyCompartment(
            ChangeAuditPolicyCompartmentRequest request);

    /**
     * Moves the specified audit profile and its dependent resources into a different compartment.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/datasafe/ChangeAuditProfileCompartmentExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     ChangeAuditProfileCompartment API.
     */
    ChangeAuditProfileCompartmentResponse changeAuditProfileCompartment(
            ChangeAuditProfileCompartmentRequest request);

    /**
     * Moves the Data Safe private endpoint and its dependent resources to the specified
     * compartment.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/datasafe/ChangeDataSafePrivateEndpointCompartmentExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     ChangeDataSafePrivateEndpointCompartment API.
     */
    ChangeDataSafePrivateEndpointCompartmentResponse changeDataSafePrivateEndpointCompartment(
            ChangeDataSafePrivateEndpointCompartmentRequest request);

    /**
     * Moves the specified discovery job and its dependent resources into a different compartment.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/datasafe/ChangeDiscoveryJobCompartmentExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     ChangeDiscoveryJobCompartment API.
     */
    ChangeDiscoveryJobCompartmentResponse changeDiscoveryJobCompartment(
            ChangeDiscoveryJobCompartmentRequest request);

    /**
     * Moves the specified library masking format into a different compartment.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/datasafe/ChangeLibraryMaskingFormatCompartmentExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     ChangeLibraryMaskingFormatCompartment API.
     */
    ChangeLibraryMaskingFormatCompartmentResponse changeLibraryMaskingFormatCompartment(
            ChangeLibraryMaskingFormatCompartmentRequest request);

    /**
     * Moves the specified masking policy and its dependent resources into a different compartment.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/datasafe/ChangeMaskingPolicyCompartmentExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     ChangeMaskingPolicyCompartment API.
     */
    ChangeMaskingPolicyCompartmentResponse changeMaskingPolicyCompartment(
            ChangeMaskingPolicyCompartmentRequest request);

    /**
     * Moves the specified on-premises connector into a different compartment.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/datasafe/ChangeOnPremConnectorCompartmentExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     ChangeOnPremConnectorCompartment API.
     */
    ChangeOnPremConnectorCompartmentResponse changeOnPremConnectorCompartment(
            ChangeOnPremConnectorCompartmentRequest request);

    /**
     * Moves a resource into a different compartment. When provided, If-Match is checked against
     * ETag values of the resource.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/datasafe/ChangeReportCompartmentExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     ChangeReportCompartment API.
     */
    ChangeReportCompartmentResponse changeReportCompartment(ChangeReportCompartmentRequest request);

    /**
     * Moves a resource into a different compartment. When provided, If-Match is checked against
     * ETag values of the resource.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/datasafe/ChangeReportDefinitionCompartmentExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     ChangeReportDefinitionCompartment API.
     */
    ChangeReportDefinitionCompartmentResponse changeReportDefinitionCompartment(
            ChangeReportDefinitionCompartmentRequest request);

    /**
     * Change the online and offline months .
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/datasafe/ChangeRetentionExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use ChangeRetention
     *     API.
     */
    ChangeRetentionResponse changeRetention(ChangeRetentionRequest request);

    /**
     * Moves the specified SDM masking policy difference into a different compartment.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/datasafe/ChangeSdmMaskingPolicyDifferenceCompartmentExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     ChangeSdmMaskingPolicyDifferenceCompartment API.
     */
    ChangeSdmMaskingPolicyDifferenceCompartmentResponse changeSdmMaskingPolicyDifferenceCompartment(
            ChangeSdmMaskingPolicyDifferenceCompartmentRequest request);

    /**
     * Moves the specified saved security assessment or future scheduled assessments into a
     * different compartment.
     *
     * <p>To start, call first the operation ListSecurityAssessments with filters \"type =
     * save_schedule\". This returns the scheduleAssessmentId. Then, call this changeCompartment
     * with the scheduleAssessmentId.
     *
     * <p>The existing saved security assessments created due to the schedule are not moved.
     * However, all new saves will be associated with the new compartment.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/datasafe/ChangeSecurityAssessmentCompartmentExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     ChangeSecurityAssessmentCompartment API.
     */
    ChangeSecurityAssessmentCompartmentResponse changeSecurityAssessmentCompartment(
            ChangeSecurityAssessmentCompartmentRequest request);

    /**
     * Moves the specified sensitive data model and its dependent resources into a different
     * compartment.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/datasafe/ChangeSensitiveDataModelCompartmentExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     ChangeSensitiveDataModelCompartment API.
     */
    ChangeSensitiveDataModelCompartmentResponse changeSensitiveDataModelCompartment(
            ChangeSensitiveDataModelCompartmentRequest request);

    /**
     * Moves the specified sensitive type into a different compartment.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/datasafe/ChangeSensitiveTypeCompartmentExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     ChangeSensitiveTypeCompartment API.
     */
    ChangeSensitiveTypeCompartmentResponse changeSensitiveTypeCompartment(
            ChangeSensitiveTypeCompartmentRequest request);

    /**
     * Moves the specified target-alert policy Association into a different compartment.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/datasafe/ChangeTargetAlertPolicyAssociationCompartmentExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     ChangeTargetAlertPolicyAssociationCompartment API.
     */
    ChangeTargetAlertPolicyAssociationCompartmentResponse
            changeTargetAlertPolicyAssociationCompartment(
                    ChangeTargetAlertPolicyAssociationCompartmentRequest request);

    /**
     * Moves the Data Safe target database to the specified compartment.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/datasafe/ChangeTargetDatabaseCompartmentExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     ChangeTargetDatabaseCompartment API.
     */
    ChangeTargetDatabaseCompartmentResponse changeTargetDatabaseCompartment(
            ChangeTargetDatabaseCompartmentRequest request);

    /**
     * Moves the specified saved user assessment or future scheduled assessments into a different
     * compartment. To start storing scheduled user assessments on a different compartment, first
     * call the operation ListUserAssessments with the filters \"type = save_schedule\". That call
     * returns the scheduleAssessmentId. Then call ChangeUserAssessmentCompartment with the
     * scheduleAssessmentId. The existing saved user assessments created per the schedule are not be
     * moved. However, all new saves will be associated with the new compartment.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/datasafe/ChangeUserAssessmentCompartmentExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     ChangeUserAssessmentCompartment API.
     */
    ChangeUserAssessmentCompartmentResponse changeUserAssessmentCompartment(
            ChangeUserAssessmentCompartmentRequest request);

    /**
     * Compares two security assessments. For this comparison, a security assessment can be a saved
     * assessment, a latest assessment, or a baseline assessment. For example, you can compare saved
     * assessment or a latest assessment against a baseline.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/datasafe/CompareSecurityAssessmentExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     CompareSecurityAssessment API.
     */
    CompareSecurityAssessmentResponse compareSecurityAssessment(
            CompareSecurityAssessmentRequest request);

    /**
     * Compares two user assessments. For this comparison, a user assessment can be a saved, a
     * latest assessment, or a baseline. As an example, it can be used to compare a user assessment
     * saved or a latest assessment with a baseline.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/datasafe/CompareUserAssessmentExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     CompareUserAssessment API.
     */
    CompareUserAssessmentResponse compareUserAssessment(CompareUserAssessmentRequest request);

    /**
     * Creates a work request to retrieve archived audit data. This asynchronous process will
     * usually take over an hour to complete. Save the id from the response of this operation. Call
     * GetAuditArchiveRetrieval operation after an hour, passing the id to know the status of this
     * operation.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/datasafe/CreateAuditArchiveRetrievalExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     CreateAuditArchiveRetrieval API.
     */
    CreateAuditArchiveRetrievalResponse createAuditArchiveRetrieval(
            CreateAuditArchiveRetrievalRequest request);

    /**
     * Creates a new Data Safe private endpoint.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/datasafe/CreateDataSafePrivateEndpointExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     CreateDataSafePrivateEndpoint API.
     */
    CreateDataSafePrivateEndpointResponse createDataSafePrivateEndpoint(
            CreateDataSafePrivateEndpointRequest request);

    /**
     * Performs incremental data discovery for the specified sensitive data model. It uses the
     * target database associated with the sensitive data model. After performing data discovery,
     * you can use ListDiscoveryJobResults to view the discovery results, PatchDiscoveryJobResults
     * to specify the action you want perform on these results, and then ApplyDiscoveryJobResults to
     * process the results and apply them to the sensitive data model.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/datasafe/CreateDiscoveryJobExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use CreateDiscoveryJob
     *     API.
     */
    CreateDiscoveryJobResponse createDiscoveryJob(CreateDiscoveryJobRequest request);

    /**
     * Creates a new library masking format. A masking format can have one or more format entries.
     * The combined output of all the format entries is used for masking. It provides the
     * flexibility to define a masking format that can generate different parts of a data value
     * separately and then combine them to get the final data value for masking. Note that you
     * cannot define masking condition in a library masking format.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/datasafe/CreateLibraryMaskingFormatExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     CreateLibraryMaskingFormat API.
     */
    CreateLibraryMaskingFormatResponse createLibraryMaskingFormat(
            CreateLibraryMaskingFormatRequest request);

    /**
     * Creates a new masking column in the specified masking policy. Use this operation to add
     * parent columns only. It automatically adds the child columns from the associated sensitive
     * data model or target database. If you provide the sensitiveTypeId attribute but not the
     * maskingFormats attribute, it automatically assigns the default masking format associated with
     * the specified sensitive type. Alternatively, if you provide the maskingFormats attribute, the
     * specified masking formats are assigned to the column.
     *
     * <p>Using the maskingFormats attribute, you can assign one or more masking formats to a
     * column. You need to specify a condition as part of each masking format. It enables you to do
     * <a
     * href=\"https://docs.oracle.com/en/cloud/paas/data-safe/udscs/conditional-masking.html\">conditional
     * masking</a> so that you can mask the column data values differently using different masking
     * conditions. A masking format can have one or more format entries. The combined output of all
     * the format entries is used for masking. It provides the flexibility to define a masking
     * format that can generate different parts of a data value separately and then combine them to
     * get the final data value for masking.
     *
     * <p>You can use the maskingColumnGroup attribute to group the columns that you would like to
     * mask together. It enables you to do <a
     * href=\"https://docs.oracle.com/en/cloud/paas/data-safe/udscs/group-masking1.html#GUID-755056B9-9540-48C0-9491-262A44A85037\">group
     * or compound masking</a> that ensures that the masked data across the columns in a group
     * continue to retain the same logical relationship.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/datasafe/CreateMaskingColumnExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use CreateMaskingColumn
     *     API.
     */
    CreateMaskingColumnResponse createMaskingColumn(CreateMaskingColumnRequest request);

    /**
     * Creates a new masking policy and associates it with a sensitive data model or a reference
     * target database.
     *
     * <p>To use a sensitive data model as the source of masking columns, set the columnSource
     * attribute to SENSITIVE_DATA_MODEL and provide the sensitiveDataModelId attribute. After
     * creating a masking policy, you can use the AddMaskingColumnsFromSdm operation to
     * automatically add all the columns from the associated sensitive data model. In this case, the
     * target database associated with the sensitive data model is used for column and masking
     * format validations.
     *
     * <p>You can also create a masking policy without using a sensitive data model. In this case,
     * you need to associate your masking policy with a target database by setting the columnSource
     * attribute to TARGET and providing the targetId attribute. The specified target database is
     * used for column and masking format validations.
     *
     * <p>After creating a masking policy, you can use the CreateMaskingColumn or
     * PatchMaskingColumns operation to manually add columns to the policy. You need to add the
     * parent columns only, and it automatically adds the child columns (in referential relationship
     * with the parent columns) from the associated sensitive data model or target database.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/datasafe/CreateMaskingPolicyExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use CreateMaskingPolicy
     *     API.
     */
    CreateMaskingPolicyResponse createMaskingPolicy(CreateMaskingPolicyRequest request);

    /**
     * Creates a new on-premises connector.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/datasafe/CreateOnPremConnectorExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     CreateOnPremConnector API.
     */
    CreateOnPremConnectorResponse createOnPremConnector(CreateOnPremConnectorRequest request);

    /**
     * Creates a new report definition with parameters specified in the body. The report definition
     * is stored in the specified compartment.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/datasafe/CreateReportDefinitionExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     CreateReportDefinition API.
     */
    CreateReportDefinitionResponse createReportDefinition(CreateReportDefinitionRequest request);

    /**
     * Creates SDM masking policy difference for the specified masking policy. It finds the
     * difference between masking columns of the masking policy and sensitive columns of the SDM.
     * After performing this operation, you can use ListDifferenceColumns to view the difference
     * columns, PatchSdmMaskingPolicyDifferenceColumns to specify the action you want perform on
     * these columns, and then ApplySdmMaskingPolicyDifference to process the difference columns and
     * apply them to the masking policy.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/datasafe/CreateSdmMaskingPolicyDifferenceExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     CreateSdmMaskingPolicyDifference API.
     */
    CreateSdmMaskingPolicyDifferenceResponse createSdmMaskingPolicyDifference(
            CreateSdmMaskingPolicyDifferenceRequest request);

    /**
     * Creates a new saved security assessment for one or multiple targets in a compartment. When
     * this operation is performed, it will save the latest assessments in the specified
     * compartment. If a schedule is passed, it will persist the latest assessments, at the defined
     * date and time, in the format defined by [RFC3339](https://tools.ietf.org/html/rfc3339).
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/datasafe/CreateSecurityAssessmentExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     CreateSecurityAssessment API.
     */
    CreateSecurityAssessmentResponse createSecurityAssessment(
            CreateSecurityAssessmentRequest request);

    /**
     * Creates a new sensitive column in the specified sensitive data model.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/datasafe/CreateSensitiveColumnExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     CreateSensitiveColumn API.
     */
    CreateSensitiveColumnResponse createSensitiveColumn(CreateSensitiveColumnRequest request);

    /**
     * Creates a new sensitive data model. If schemas and sensitive types are provided, it
     * automatically runs data discovery and adds the discovered columns to the sensitive data
     * model. Otherwise, it creates an empty sensitive data model that can be updated later.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/datasafe/CreateSensitiveDataModelExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     CreateSensitiveDataModel API.
     */
    CreateSensitiveDataModelResponse createSensitiveDataModel(
            CreateSensitiveDataModelRequest request);

    /**
     * Creates a new sensitive type, which can be a basic sensitive type with regular expressions or
     * a sensitive category. While sensitive types are used for data discovery, sensitive categories
     * are used for logically grouping the related or similar sensitive types.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/datasafe/CreateSensitiveTypeExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use CreateSensitiveType
     *     API.
     */
    CreateSensitiveTypeResponse createSensitiveType(CreateSensitiveTypeRequest request);

    /**
     * Creates a new target-alert policy association to track a alert policy applied on target.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/datasafe/CreateTargetAlertPolicyAssociationExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     CreateTargetAlertPolicyAssociation API.
     */
    CreateTargetAlertPolicyAssociationResponse createTargetAlertPolicyAssociation(
            CreateTargetAlertPolicyAssociationRequest request);

    /**
     * Registers the specified database with Data Safe and creates a Data Safe target database in
     * the Data Safe Console.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/datasafe/CreateTargetDatabaseExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     CreateTargetDatabase API.
     */
    CreateTargetDatabaseResponse createTargetDatabase(CreateTargetDatabaseRequest request);

    /**
     * Creates a new saved user assessment for one or multiple targets in a compartment. It saves
     * the latest assessments in the specified compartment. If a scheduled is passed in, this
     * operation persists the latest assessments that exist at the defined date and time, in the
     * format defined by [RFC3339](https://tools.ietf.org/html/rfc3339).
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/datasafe/CreateUserAssessmentExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     CreateUserAssessment API.
     */
    CreateUserAssessmentResponse createUserAssessment(CreateUserAssessmentRequest request);

    /**
     * Deactivates a target database in Data Safe.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/datasafe/DeactivateTargetDatabaseExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     DeactivateTargetDatabase API.
     */
    DeactivateTargetDatabaseResponse deactivateTargetDatabase(
            DeactivateTargetDatabaseRequest request);

    /**
     * To unload retrieved archive data, call the operation ListAuditArchiveRetrieval first. This
     * will return the auditArchiveRetrievalId. Then call this operation with
     * auditArchiveRetrievalId.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/datasafe/DeleteAuditArchiveRetrievalExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     DeleteAuditArchiveRetrieval API.
     */
    DeleteAuditArchiveRetrievalResponse deleteAuditArchiveRetrieval(
            DeleteAuditArchiveRetrievalRequest request);

    /**
     * Deletes the specified audit trail.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/datasafe/DeleteAuditTrailExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use DeleteAuditTrail
     *     API.
     */
    DeleteAuditTrailResponse deleteAuditTrail(DeleteAuditTrailRequest request);

    /**
     * Deletes the specified Data Safe private endpoint.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/datasafe/DeleteDataSafePrivateEndpointExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     DeleteDataSafePrivateEndpoint API.
     */
    DeleteDataSafePrivateEndpointResponse deleteDataSafePrivateEndpoint(
            DeleteDataSafePrivateEndpointRequest request);

    /**
     * Deletes the specified discovery job.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/datasafe/DeleteDiscoveryJobExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use DeleteDiscoveryJob
     *     API.
     */
    DeleteDiscoveryJobResponse deleteDiscoveryJob(DeleteDiscoveryJobRequest request);

    /**
     * Deletes the specified discovery result.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/datasafe/DeleteDiscoveryJobResultExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     DeleteDiscoveryJobResult API.
     */
    DeleteDiscoveryJobResultResponse deleteDiscoveryJobResult(
            DeleteDiscoveryJobResultRequest request);

    /**
     * Deletes the specified library masking format.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/datasafe/DeleteLibraryMaskingFormatExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     DeleteLibraryMaskingFormat API.
     */
    DeleteLibraryMaskingFormatResponse deleteLibraryMaskingFormat(
            DeleteLibraryMaskingFormatRequest request);

    /**
     * Deletes the specified masking column.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/datasafe/DeleteMaskingColumnExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use DeleteMaskingColumn
     *     API.
     */
    DeleteMaskingColumnResponse deleteMaskingColumn(DeleteMaskingColumnRequest request);

    /**
     * Deletes the specified masking policy.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/datasafe/DeleteMaskingPolicyExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use DeleteMaskingPolicy
     *     API.
     */
    DeleteMaskingPolicyResponse deleteMaskingPolicy(DeleteMaskingPolicyRequest request);

    /**
     * Deletes the specified on-premises connector.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/datasafe/DeleteOnPremConnectorExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     DeleteOnPremConnector API.
     */
    DeleteOnPremConnectorResponse deleteOnPremConnector(DeleteOnPremConnectorRequest request);

    /**
     * Deletes the specified report definition. Only the user created report definition can be
     * deleted. The seeded report definitions cannot be deleted.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/datasafe/DeleteReportDefinitionExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     DeleteReportDefinition API.
     */
    DeleteReportDefinitionResponse deleteReportDefinition(DeleteReportDefinitionRequest request);

    /**
     * Deletes the specified SDM Masking policy difference.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/datasafe/DeleteSdmMaskingPolicyDifferenceExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     DeleteSdmMaskingPolicyDifference API.
     */
    DeleteSdmMaskingPolicyDifferenceResponse deleteSdmMaskingPolicyDifference(
            DeleteSdmMaskingPolicyDifferenceRequest request);

    /**
     * Deletes the specified saved security assessment or schedule. To delete a security assessment
     * schedule, first call the operation ListSecurityAssessments with filters \"type =
     * save_schedule\". That operation returns the scheduleAssessmentId. Then, call
     * DeleteSecurityAssessment with the scheduleAssessmentId. If the assessment being deleted is
     * the baseline for that compartment, then it will impact all baselines in the compartment.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/datasafe/DeleteSecurityAssessmentExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     DeleteSecurityAssessment API.
     */
    DeleteSecurityAssessmentResponse deleteSecurityAssessment(
            DeleteSecurityAssessmentRequest request);

    /**
     * Deletes the specified sensitive column.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/datasafe/DeleteSensitiveColumnExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     DeleteSensitiveColumn API.
     */
    DeleteSensitiveColumnResponse deleteSensitiveColumn(DeleteSensitiveColumnRequest request);

    /**
     * Deletes the specified sensitive data model.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/datasafe/DeleteSensitiveDataModelExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     DeleteSensitiveDataModel API.
     */
    DeleteSensitiveDataModelResponse deleteSensitiveDataModel(
            DeleteSensitiveDataModelRequest request);

    /**
     * Deletes the specified sensitive type.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/datasafe/DeleteSensitiveTypeExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use DeleteSensitiveType
     *     API.
     */
    DeleteSensitiveTypeResponse deleteSensitiveType(DeleteSensitiveTypeRequest request);

    /**
     * Deletes the specified target-alert policy Association.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/datasafe/DeleteTargetAlertPolicyAssociationExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     DeleteTargetAlertPolicyAssociation API.
     */
    DeleteTargetAlertPolicyAssociationResponse deleteTargetAlertPolicyAssociation(
            DeleteTargetAlertPolicyAssociationRequest request);

    /**
     * Deregisters the specified database from Data Safe and removes the target database from the
     * Data Safe Console.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/datasafe/DeleteTargetDatabaseExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     DeleteTargetDatabase API.
     */
    DeleteTargetDatabaseResponse deleteTargetDatabase(DeleteTargetDatabaseRequest request);

    /**
     * Deletes the specified saved user assessment or schedule. To delete a user assessment
     * schedule, first call the operation ListUserAssessments with filters \"type = save_schedule\".
     * That call returns the scheduleAssessmentId. Then call DeleteUserAssessment with the
     * scheduleAssessmentId. If the assessment being deleted is the baseline for that compartment,
     * then it will impact all baselines in the compartment.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/datasafe/DeleteUserAssessmentExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     DeleteUserAssessment API.
     */
    DeleteUserAssessmentResponse deleteUserAssessment(DeleteUserAssessmentRequest request);

    /**
     * Updates the list of audit trails created under audit profile.The operation can be used to
     * create new audit trails for target database when they become available for audit collection
     * because of change of database version or change of database unified mode or change of data
     * base edition or being deleted previously etc.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/datasafe/DiscoverAuditTrailsExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use DiscoverAuditTrails
     *     API.
     */
    DiscoverAuditTrailsResponse discoverAuditTrails(DiscoverAuditTrailsRequest request);

    /**
     * Downloads an already-generated discovery report. Note that the
     * GenerateDiscoveryReportForDownload operation is a prerequisite for the
     * DownloadDiscoveryReport operation. Use GenerateDiscoveryReportForDownload to generate a
     * discovery report file and then use DownloadDiscoveryReport to download the generated file. By
     * default, it downloads report for all the columns in a sensitive data model. Use the
     * discoveryJobId attribute to download report for a specific discovery job.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/datasafe/DownloadDiscoveryReportExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     DownloadDiscoveryReport API.
     */
    DownloadDiscoveryReportResponse downloadDiscoveryReport(DownloadDiscoveryReportRequest request);

    /**
     * Downloads the masking log generated by the last masking operation on a target database using
     * the specified masking policy.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/datasafe/DownloadMaskingLogExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use DownloadMaskingLog
     *     API.
     */
    DownloadMaskingLogResponse downloadMaskingLog(DownloadMaskingLogRequest request);

    /**
     * Downloads an already-generated file corresponding to the specified masking policy. Note that
     * the GenerateMaskingPolicyForDownload operation is a prerequisite for the
     * DownloadMaskingPolicy operation. Use GenerateMaskingPolicyForDownload to generate a masking
     * policy file and then use DownloadMaskingPolicy to download the generated file.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/datasafe/DownloadMaskingPolicyExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     DownloadMaskingPolicy API.
     */
    DownloadMaskingPolicyResponse downloadMaskingPolicy(DownloadMaskingPolicyRequest request);

    /**
     * Downloads an already-generated masking report. Note that the GenerateMaskingReportForDownload
     * operation is a prerequisite for the DownloadMaskingReport operation. Use
     * GenerateMaskingReportForDownload to generate a masking report file and then use
     * DownloadMaskingReport to download the generated file.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/datasafe/DownloadMaskingReportExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     DownloadMaskingReport API.
     */
    DownloadMaskingReportResponse downloadMaskingReport(DownloadMaskingReportRequest request);

    /**
     * Downloads the privilege script to grant/revoke required roles from the Data Safe account on
     * the target database.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/datasafe/DownloadPrivilegeScriptExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     DownloadPrivilegeScript API.
     */
    DownloadPrivilegeScriptResponse downloadPrivilegeScript(DownloadPrivilegeScriptRequest request);

    /**
     * Downloads the report of the specified security assessment. To download the security
     * assessment report, it needs to be generated first. Please use
     * GenerateSecurityAssessmentReport to generate a downloadable report in the preferred format
     * (PDF, XLS).
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/datasafe/DownloadSecurityAssessmentReportExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     DownloadSecurityAssessmentReport API.
     */
    DownloadSecurityAssessmentReportResponse downloadSecurityAssessmentReport(
            DownloadSecurityAssessmentReportRequest request);

    /**
     * Downloads an already-generated file corresponding to the specified sensitive data model. Note
     * that the GenerateSensitiveDataModelForDownload operation is a prerequisite for the
     * DownloadSensitiveDataModel operation. Use GenerateSensitiveDataModelForDownload to generate a
     * data model file and then use DownloadSensitiveDataModel to download the generated file.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/datasafe/DownloadSensitiveDataModelExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     DownloadSensitiveDataModel API.
     */
    DownloadSensitiveDataModelResponse downloadSensitiveDataModel(
            DownloadSensitiveDataModelRequest request);

    /**
     * Downloads the report of the specified user assessment. To download the user assessment
     * report, it needs to be generated first. Please use GenerateUserAssessmentReport to generate a
     * downloadable report in the preferred format (PDF, XLS).
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/datasafe/DownloadUserAssessmentReportExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     DownloadUserAssessmentReport API.
     */
    DownloadUserAssessmentReportResponse downloadUserAssessmentReport(
            DownloadUserAssessmentReportRequest request);

    /**
     * Enables Data Safe in the tenancy and region.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/datasafe/EnableDataSafeConfigurationExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     EnableDataSafeConfiguration API.
     */
    EnableDataSafeConfigurationResponse enableDataSafeConfiguration(
            EnableDataSafeConfigurationRequest request);

    /**
     * Generates a downloadable discovery report. It's a prerequisite for the
     * DownloadDiscoveryReport operation. Use this endpoint to generate a discovery report file and
     * then use DownloadDiscoveryReport to download the generated file. By default, it generates
     * report for all the columns in a sensitive data model. Use the discoveryJobId attribute to
     * generate report for a specific discovery job.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/datasafe/GenerateDiscoveryReportForDownloadExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     GenerateDiscoveryReportForDownload API.
     */
    GenerateDiscoveryReportForDownloadResponse generateDiscoveryReportForDownload(
            GenerateDiscoveryReportForDownloadRequest request);

    /**
     * Generates a downloadable file corresponding to the specified masking policy. It's a
     * prerequisite for the DownloadMaskingPolicy operation. Use this endpoint to generate a masking
     * policy file and then use DownloadMaskingPolicy to download the generated file. Note that file
     * generation and download are serial operations. The download operation can't be invoked while
     * the generate operation is in progress.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/datasafe/GenerateMaskingPolicyForDownloadExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     GenerateMaskingPolicyForDownload API.
     */
    GenerateMaskingPolicyForDownloadResponse generateMaskingPolicyForDownload(
            GenerateMaskingPolicyForDownloadRequest request);

    /**
     * Generates a downloadable masking report. It's a prerequisite for the DownloadMaskingReport
     * operation. Use this endpoint to generate a masking report file and then use
     * DownloadMaskingReport to download the generated file.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/datasafe/GenerateMaskingReportForDownloadExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     GenerateMaskingReportForDownload API.
     */
    GenerateMaskingReportForDownloadResponse generateMaskingReportForDownload(
            GenerateMaskingReportForDownloadRequest request);

    /**
     * Creates and downloads the configuration of the specified on-premises connector.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/datasafe/GenerateOnPremConnectorConfigurationExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     GenerateOnPremConnectorConfiguration API.
     */
    GenerateOnPremConnectorConfigurationResponse generateOnPremConnectorConfiguration(
            GenerateOnPremConnectorConfigurationRequest request);

    /**
     * Generates a PDF or XLS report based on parameters and report definition.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/datasafe/GenerateReportExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use GenerateReport API.
     */
    GenerateReportResponse generateReport(GenerateReportRequest request);

    /**
     * Generates the report of the specified security assessment. You can get the report in PDF or
     * XLS format. After generating the report, use DownloadSecurityAssessmentReport to download it
     * in the preferred format.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/datasafe/GenerateSecurityAssessmentReportExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     GenerateSecurityAssessmentReport API.
     */
    GenerateSecurityAssessmentReportResponse generateSecurityAssessmentReport(
            GenerateSecurityAssessmentReportRequest request);

    /**
     * Generates a downloadable file corresponding to the specified sensitive data model. It's a
     * prerequisite for the DownloadSensitiveDataModel operation. Use this endpoint to generate a
     * data model file and then use DownloadSensitiveDataModel to download the generated file. Note
     * that file generation and download are serial operations. The download operation can't be
     * invoked while the generate operation is in progress.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/datasafe/GenerateSensitiveDataModelForDownloadExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     GenerateSensitiveDataModelForDownload API.
     */
    GenerateSensitiveDataModelForDownloadResponse generateSensitiveDataModelForDownload(
            GenerateSensitiveDataModelForDownloadRequest request);

    /**
     * Generates the report of the specified user assessment. The report is available in PDF or XLS
     * format. After generating the report, use DownloadUserAssessmentReport to download it in the
     * preferred format.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/datasafe/GenerateUserAssessmentReportExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     GenerateUserAssessmentReport API.
     */
    GenerateUserAssessmentReportResponse generateUserAssessmentReport(
            GenerateUserAssessmentReportRequest request);

    /**
     * Gets the details of the specified alerts.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/datasafe/GetAlertExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use GetAlert API.
     */
    GetAlertResponse getAlert(GetAlertRequest request);

    /**
     * Gets the details of alert policy by its ID.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/datasafe/GetAlertPolicyExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use GetAlertPolicy API.
     */
    GetAlertPolicyResponse getAlertPolicy(GetAlertPolicyRequest request);

    /**
     * Gets the details of the specified archive retreival.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/datasafe/GetAuditArchiveRetrievalExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     GetAuditArchiveRetrieval API.
     */
    GetAuditArchiveRetrievalResponse getAuditArchiveRetrieval(
            GetAuditArchiveRetrievalRequest request);

    /**
     * Gets a audit policy by identifier.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/datasafe/GetAuditPolicyExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use GetAuditPolicy API.
     */
    GetAuditPolicyResponse getAuditPolicy(GetAuditPolicyRequest request);

    /**
     * Gets the details of audit profile resource and associated audit trails of the audit profile.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/datasafe/GetAuditProfileExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use GetAuditProfile
     *     API.
     */
    GetAuditProfileResponse getAuditProfile(GetAuditProfileRequest request);

    /**
     * Gets the details of audit trail.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/datasafe/GetAuditTrailExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use GetAuditTrail API.
     */
    GetAuditTrailResponse getAuditTrail(GetAuditTrailRequest request);

    /**
     * Gets a list of basic masking formats compatible with the supported data types. The data types
     * are grouped into the following categories - Character - Includes CHAR, NCHAR, VARCHAR2, and
     * NVARCHAR2 Numeric - Includes NUMBER, FLOAT, RAW, BINARY_FLOAT, and BINARY_DOUBLE Date -
     * Includes DATE and TIMESTAMP LOB - Includes BLOB, CLOB, and NCLOB All - Includes all the
     * supported data types
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/datasafe/GetCompatibleFormatsForDataTypesExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     GetCompatibleFormatsForDataTypes API.
     */
    GetCompatibleFormatsForDataTypesResponse getCompatibleFormatsForDataTypes(
            GetCompatibleFormatsForDataTypesRequest request);

    /**
     * Gets a list of library masking formats compatible with the existing sensitive types. For each
     * sensitive type, it returns the assigned default masking format as well as the other library
     * masking formats that have the sensitiveTypeIds attribute containing the OCID of the sensitive
     * type.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/datasafe/GetCompatibleFormatsForSensitiveTypesExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     GetCompatibleFormatsForSensitiveTypes API.
     */
    GetCompatibleFormatsForSensitiveTypesResponse getCompatibleFormatsForSensitiveTypes(
            GetCompatibleFormatsForSensitiveTypesRequest request);

    /**
     * Gets the details of the Data Safe configuration.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/datasafe/GetDataSafeConfigurationExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     GetDataSafeConfiguration API.
     */
    GetDataSafeConfigurationResponse getDataSafeConfiguration(
            GetDataSafeConfigurationRequest request);

    /**
     * Gets the details of the specified Data Safe private endpoint.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/datasafe/GetDataSafePrivateEndpointExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     GetDataSafePrivateEndpoint API.
     */
    GetDataSafePrivateEndpointResponse getDataSafePrivateEndpoint(
            GetDataSafePrivateEndpointRequest request);

    /**
     * Gets the details of the specified SDM Masking policy difference column.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/datasafe/GetDifferenceColumnExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use GetDifferenceColumn
     *     API.
     */
    GetDifferenceColumnResponse getDifferenceColumn(GetDifferenceColumnRequest request);

    /**
     * Gets the details of the specified discovery job.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/datasafe/GetDiscoveryJobExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use GetDiscoveryJob
     *     API.
     */
    GetDiscoveryJobResponse getDiscoveryJob(GetDiscoveryJobRequest request);

    /**
     * Gets the details of the specified discovery result.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/datasafe/GetDiscoveryJobResultExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     GetDiscoveryJobResult API.
     */
    GetDiscoveryJobResultResponse getDiscoveryJobResult(GetDiscoveryJobResultRequest request);

    /**
     * Gets the details of the specified library masking format.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/datasafe/GetLibraryMaskingFormatExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     GetLibraryMaskingFormat API.
     */
    GetLibraryMaskingFormatResponse getLibraryMaskingFormat(GetLibraryMaskingFormatRequest request);

    /**
     * Gets the details of the specified masking column.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/datasafe/GetMaskingColumnExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use GetMaskingColumn
     *     API.
     */
    GetMaskingColumnResponse getMaskingColumn(GetMaskingColumnRequest request);

    /**
     * Gets the details of the specified masking policy.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/datasafe/GetMaskingPolicyExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use GetMaskingPolicy
     *     API.
     */
    GetMaskingPolicyResponse getMaskingPolicy(GetMaskingPolicyRequest request);

    /**
     * Gets the details of the specified masking report.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/datasafe/GetMaskingReportExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use GetMaskingReport
     *     API.
     */
    GetMaskingReportResponse getMaskingReport(GetMaskingReportRequest request);

    /**
     * Gets the details of the specified on-premises connector.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/datasafe/GetOnPremConnectorExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use GetOnPremConnector
     *     API.
     */
    GetOnPremConnectorResponse getOnPremConnector(GetOnPremConnectorRequest request);

    /**
     * Lists the details of given profile available on the target.
     *
     * <p>The GetProfile operation returns only the profiles in the specified 'userAssessmentId'.
     * This does not include any subcompartments of the current compartment.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/datasafe/GetProfileExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use GetProfile API.
     */
    GetProfileResponse getProfile(GetProfileRequest request);

    /**
     * Gets a report by identifier
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/datasafe/GetReportExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use GetReport API.
     */
    GetReportResponse getReport(GetReportRequest request);

    /**
     * Downloads the specified report in the form of PDF or XLXS.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/datasafe/GetReportContentExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use GetReportContent
     *     API.
     */
    GetReportContentResponse getReportContent(GetReportContentRequest request);

    /**
     * Gets the details of report definition specified by the identifier
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/datasafe/GetReportDefinitionExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use GetReportDefinition
     *     API.
     */
    GetReportDefinitionResponse getReportDefinition(GetReportDefinitionRequest request);

    /**
     * Gets the details of the specified SDM Masking policy difference.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/datasafe/GetSdmMaskingPolicyDifferenceExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     GetSdmMaskingPolicyDifference API.
     */
    GetSdmMaskingPolicyDifferenceResponse getSdmMaskingPolicyDifference(
            GetSdmMaskingPolicyDifferenceRequest request);

    /**
     * Gets the details of the specified security assessment.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/datasafe/GetSecurityAssessmentExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     GetSecurityAssessment API.
     */
    GetSecurityAssessmentResponse getSecurityAssessment(GetSecurityAssessmentRequest request);

    /**
     * Gets the details of the comparison report on the security assessments submitted for
     * comparison.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/datasafe/GetSecurityAssessmentComparisonExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     GetSecurityAssessmentComparison API.
     */
    GetSecurityAssessmentComparisonResponse getSecurityAssessmentComparison(
            GetSecurityAssessmentComparisonRequest request);

    /**
     * Gets the details of the specified sensitive column.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/datasafe/GetSensitiveColumnExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use GetSensitiveColumn
     *     API.
     */
    GetSensitiveColumnResponse getSensitiveColumn(GetSensitiveColumnRequest request);

    /**
     * Gets the details of the specified sensitive data model.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/datasafe/GetSensitiveDataModelExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     GetSensitiveDataModel API.
     */
    GetSensitiveDataModelResponse getSensitiveDataModel(GetSensitiveDataModelRequest request);

    /**
     * Gets the details of the specified sensitive type.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/datasafe/GetSensitiveTypeExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use GetSensitiveType
     *     API.
     */
    GetSensitiveTypeResponse getSensitiveType(GetSensitiveTypeRequest request);

    /**
     * Gets the details of target-alert policy association by its ID.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/datasafe/GetTargetAlertPolicyAssociationExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     GetTargetAlertPolicyAssociation API.
     */
    GetTargetAlertPolicyAssociationResponse getTargetAlertPolicyAssociation(
            GetTargetAlertPolicyAssociationRequest request);

    /**
     * Returns the details of the specified Data Safe target database.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/datasafe/GetTargetDatabaseExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use GetTargetDatabase
     *     API.
     */
    GetTargetDatabaseResponse getTargetDatabase(GetTargetDatabaseRequest request);

    /**
     * Gets a user assessment by identifier.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/datasafe/GetUserAssessmentExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use GetUserAssessment
     *     API.
     */
    GetUserAssessmentResponse getUserAssessment(GetUserAssessmentRequest request);

    /**
     * Gets the details of the comparison report for the user assessments provided.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/datasafe/GetUserAssessmentComparisonExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     GetUserAssessmentComparison API.
     */
    GetUserAssessmentComparisonResponse getUserAssessmentComparison(
            GetUserAssessmentComparisonRequest request);

    /**
     * Gets the details of the specified work request.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/datasafe/GetWorkRequestExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use GetWorkRequest API.
     */
    GetWorkRequestResponse getWorkRequest(GetWorkRequestRequest request);

    /**
     * Returns the aggregation details of the alerts.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/datasafe/ListAlertAnalyticsExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use ListAlertAnalytics
     *     API.
     */
    ListAlertAnalyticsResponse listAlertAnalytics(ListAlertAnalyticsRequest request);

    /**
     * Gets a list of all alert policies.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/datasafe/ListAlertPoliciesExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use ListAlertPolicies
     *     API.
     */
    ListAlertPoliciesResponse listAlertPolicies(ListAlertPoliciesRequest request);

    /**
     * Lists the rules of the specified alert policy. The alert policy is said to be satisfied when
     * all rules in the policy evaulate to true. If there are three rules: rule1,rule2 and rule3,
     * the policy is satisfied if rule1 AND rule2 AND rule3 is True.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/datasafe/ListAlertPolicyRulesExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     ListAlertPolicyRules API.
     */
    ListAlertPolicyRulesResponse listAlertPolicyRules(ListAlertPolicyRulesRequest request);

    /**
     * Gets a list of all alerts.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/datasafe/ListAlertsExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use ListAlerts API.
     */
    ListAlertsResponse listAlerts(ListAlertsRequest request);

    /**
     * Returns the list of audit archive retrieval.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/datasafe/ListAuditArchiveRetrievalsExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     ListAuditArchiveRetrievals API.
     */
    ListAuditArchiveRetrievalsResponse listAuditArchiveRetrievals(
            ListAuditArchiveRetrievalsRequest request);

    /**
     * By default the ListAuditEventAnalytics operation will return all of the summary columns. To
     * filter for a specific summary column, specify it in the `summaryField` query parameter.
     *
     * <p>*Example:**
     * /ListAuditEventAnalytics?summaryField=targetName&summaryField=userName&summaryField=clientHostname
     * &summaryField=dmls&summaryField=privilegeChanges&summaryField=ddls&summaryField=loginFailure&summaryField=loginSuccess
     * &summaryField=allRecord&q=(auditEventTime ge \"2021-06-13T23:49:14\")
     *
     * <p>/ListAuditEventAnalytics?timeStarted=2022-08-18T11:02:26.000Z&timeEnded=2022-08-24T11:02:26.000Z
     * This will give number of events grouped by periods. Period can be 1 day, 1 week, etc.
     *
     * <p>/ListAuditEventAnalytics?summaryField=targetName&groupBy=targetName This will give the
     * number of events group by targetName. Only targetName summary column would be returned.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/datasafe/ListAuditEventAnalyticsExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     ListAuditEventAnalytics API.
     */
    ListAuditEventAnalyticsResponse listAuditEventAnalytics(ListAuditEventAnalyticsRequest request);

    /**
     * The ListAuditEvents operation returns specified `compartmentId` audit Events only. The list
     * does not include any audit Events associated with the `subcompartments` of the specified
     * `compartmentId`.
     *
     * <p>The parameter `accessLevel` specifies whether to return only those compartments for which
     * the requestor has INSPECT permissions on at least one resource directly or indirectly
     * (ACCESSIBLE) (the resource can be in a subcompartment) or to return Not Authorized if
     * Principal doesn't have access to even one of the child compartments. This is valid only when
     * `compartmentIdInSubtree` is set to `true`.
     *
     * <p>The parameter `compartmentIdInSubtree` applies when you perform ListAuditEvents on the
     * `compartmentId` passed and when it is set to true, the entire hierarchy of compartments can
     * be returned. To get a full list of all compartments and subcompartments in the tenancy (root
     * compartment), set the parameter `compartmentIdInSubtree` to true and `accessLevel` to
     * ACCESSIBLE.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/datasafe/ListAuditEventsExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use ListAuditEvents
     *     API.
     */
    ListAuditEventsResponse listAuditEvents(ListAuditEventsRequest request);

    /**
     * Retrieves a list of all audited targets with their corresponding provisioned audit policies,
     * and their provisioning conditions.
     *
     * <p>The ListAuditPolicies operation returns only the audit policies in the specified
     * `compartmentId`. The list does not include any subcompartments of the compartmentId passed.
     *
     * <p>The parameter `accessLevel` specifies whether to return only those compartments for which
     * the requestor has INSPECT permissions on at least one resource directly or indirectly
     * (ACCESSIBLE) (the resource can be in a subcompartment) or to return Not Authorized if
     * Principal doesn't have access to even one of the child compartments. This is valid only when
     * `compartmentIdInSubtree` is set to `true`.
     *
     * <p>The parameter `compartmentIdInSubtree` applies when you perform ListAuditPolicies on the
     * `compartmentId` passed and when it is set to true, the entire hierarchy of compartments can
     * be returned. To get a full list of all compartments and subcompartments in the tenancy (root
     * compartment), set the parameter `compartmentIdInSubtree` to true and `accessLevel` to
     * ACCESSIBLE.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/datasafe/ListAuditPoliciesExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use ListAuditPolicies
     *     API.
     */
    ListAuditPoliciesResponse listAuditPolicies(ListAuditPoliciesRequest request);

    /**
     * Gets a list of aggregated audit policy details on the target databases. A audit policy
     * aggregation helps understand the overall state of policies provisioned on targets. It is
     * especially useful to create dashboards or to support analytics.
     *
     * <p>The parameter `accessLevel` specifies whether to return only those compartments for which
     * the requestor has INSPECT permissions on at least one resource directly or indirectly
     * (ACCESSIBLE) (the resource can be in a subcompartment) or to return Not Authorized if
     * principal doesn't have access to even one of the child compartments. This is valid only when
     * `compartmentIdInSubtree` is set to `true`.
     *
     * <p>The parameter `compartmentIdInSubtree` applies when you perform SummarizedAuditPolicyInfo
     * on the specified `compartmentId` and when it is set to true, the entire hierarchy of
     * compartments can be returned. To get a full list of all compartments and subcompartments in
     * the tenancy (root compartment), set the parameter `compartmentIdInSubtree` to true and
     * `accessLevel` to ACCESSIBLE.
     *
     * <p>*Example:** ListAuditPolicyAnalytics?groupBy=auditPolicyCategory
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/datasafe/ListAuditPolicyAnalyticsExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     ListAuditPolicyAnalytics API.
     */
    ListAuditPolicyAnalyticsResponse listAuditPolicyAnalytics(
            ListAuditPolicyAnalyticsRequest request);

    /**
     * Gets a list of audit profile aggregated details . A audit profile aggregation helps
     * understand the overall state of audit profile profiles. As an example, it helps understand
     * how many audit profiles have paid usage. It is especially useful to create dashboards or to
     * support analytics.
     *
     * <p>The parameter `accessLevel` specifies whether to return only those compartments for which
     * the requestor has INSPECT permissions on at least one resource directly or indirectly
     * (ACCESSIBLE) (the resource can be in a subcompartment) or to return Not Authorized if
     * Principal doesn't have access to even one of the child compartments. This is valid only when
     * `compartmentIdInSubtree` is set to `true`.
     *
     * <p>The parameter `compartmentIdInSubtree` applies when you perform AuditProfileAnalytics on
     * the `compartmentId` passed and when it is set to true, the entire hierarchy of compartments
     * can be returned. To get a full list of all compartments and subcompartments in the tenancy
     * (root compartment), set the parameter `compartmentIdInSubtree` to true and `accessLevel` to
     * ACCESSIBLE.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/datasafe/ListAuditProfileAnalyticsExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     ListAuditProfileAnalytics API.
     */
    ListAuditProfileAnalyticsResponse listAuditProfileAnalytics(
            ListAuditProfileAnalyticsRequest request);

    /**
     * Gets a list of all audit profiles.
     *
     * <p>The ListAuditProfiles operation returns only the audit profiles in the specified
     * `compartmentId`. The list does not include any subcompartments of the compartmentId passed.
     *
     * <p>The parameter `accessLevel` specifies whether to return only those compartments for which
     * the requestor has INSPECT permissions on at least one resource directly or indirectly
     * (ACCESSIBLE) (the resource can be in a subcompartment) or to return Not Authorized if
     * Principal doesn't have access to even one of the child compartments. This is valid only when
     * `compartmentIdInSubtree` is set to `true`.
     *
     * <p>The parameter `compartmentIdInSubtree` applies when you perform ListAuditProfiles on the
     * `compartmentId` passed and when it is set to true, the entire hierarchy of compartments can
     * be returned. To get a full list of all compartments and subcompartments in the tenancy (root
     * compartment), set the parameter `compartmentIdInSubtree` to true and `accessLevel` to
     * ACCESSIBLE.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/datasafe/ListAuditProfilesExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use ListAuditProfiles
     *     API.
     */
    ListAuditProfilesResponse listAuditProfiles(ListAuditProfilesRequest request);

    /**
     * Gets a list of audit trail aggregated details . A audit trail aggregation helps understand
     * the overall state of trails. As an example, it helps understand how many trails are running
     * or stopped. It is especially useful to create dashboards or to support analytics.
     *
     * <p>The parameter `accessLevel` specifies whether to return only those compartments for which
     * the requestor has INSPECT permissions on at least one resource directly or indirectly
     * (ACCESSIBLE) (the resource can be in a subcompartment) or to return Not Authorized if
     * Principal doesn't have access to even one of the child compartments. This is valid only when
     * `compartmentIdInSubtree` is set to `true`.
     *
     * <p>The parameter `compartmentIdInSubtree` applies when you perform AuditTrailAnalytics on the
     * `compartmentId` passed and when it is set to true, the entire hierarchy of compartments can
     * be returned. To get a full list of all compartments and subcompartments in the tenancy (root
     * compartment), set the parameter `compartmentIdInSubtree` to true and `accessLevel` to
     * ACCESSIBLE.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/datasafe/ListAuditTrailAnalyticsExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     ListAuditTrailAnalytics API.
     */
    ListAuditTrailAnalyticsResponse listAuditTrailAnalytics(ListAuditTrailAnalyticsRequest request);

    /**
     * Gets a list of all audit trails. The ListAuditTrails operation returns only the audit trails
     * in the specified `compartmentId`. The list does not include any subcompartments of the
     * compartmentId passed.
     *
     * <p>The parameter `accessLevel` specifies whether to return only those compartments for which
     * the requestor has INSPECT permissions on at least one resource directly or indirectly
     * (ACCESSIBLE) (the resource can be in a subcompartment) or to return Not Authorized if
     * Principal doesn't have access to even one of the child compartments. This is valid only when
     * `compartmentIdInSubtree` is set to `true`.
     *
     * <p>The parameter `compartmentIdInSubtree` applies when you perform ListAuditTrails on the
     * `compartmentId` passed and when it is set to true, the entire hierarchy of compartments can
     * be returned. To get a full list of all compartments and subcompartments in the tenancy (root
     * compartment), set the parameter `compartmentIdInSubtree` to true and `accessLevel` to
     * ACCESSIBLE.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/datasafe/ListAuditTrailsExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use ListAuditTrails
     *     API.
     */
    ListAuditTrailsResponse listAuditTrails(ListAuditTrailsRequest request);

    /**
     * Retrieves a list of audit trails, and associated audit event volume for each trail up to
     * defined start date.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/datasafe/ListAvailableAuditVolumesExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     ListAvailableAuditVolumes API.
     */
    ListAvailableAuditVolumesResponse listAvailableAuditVolumes(
            ListAvailableAuditVolumesRequest request);

    /**
     * Gets a list of all collected audit volume data points.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/datasafe/ListCollectedAuditVolumesExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     ListCollectedAuditVolumes API.
     */
    ListCollectedAuditVolumesResponse listCollectedAuditVolumes(
            ListCollectedAuditVolumesRequest request);

    /**
     * Returns a list of column metadata objects.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/datasafe/ListColumnsExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use ListColumns API.
     */
    ListColumnsResponse listColumns(ListColumnsRequest request);

    /**
     * Gets a list of Data Safe private endpoints.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/datasafe/ListDataSafePrivateEndpointsExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     ListDataSafePrivateEndpoints API.
     */
    ListDataSafePrivateEndpointsResponse listDataSafePrivateEndpoints(
            ListDataSafePrivateEndpointsRequest request);

    /**
     * Gets a list of columns of a SDM masking policy difference resource based on the specified
     * query parameters.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/datasafe/ListDifferenceColumnsExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     ListDifferenceColumns API.
     */
    ListDifferenceColumnsResponse listDifferenceColumns(ListDifferenceColumnsRequest request);

    /**
     * Gets consolidated discovery analytics data based on the specified query parameters. If
     * CompartmentIdInSubtreeQueryParam is specified as true, the behaviour is equivalent to
     * accessLevel \"ACCESSIBLE\" by default.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/datasafe/ListDiscoveryAnalyticsExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     ListDiscoveryAnalytics API.
     */
    ListDiscoveryAnalyticsResponse listDiscoveryAnalytics(ListDiscoveryAnalyticsRequest request);

    /**
     * Gets a list of discovery results based on the specified query parameters.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/datasafe/ListDiscoveryJobResultsExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     ListDiscoveryJobResults API.
     */
    ListDiscoveryJobResultsResponse listDiscoveryJobResults(ListDiscoveryJobResultsRequest request);

    /**
     * Gets a list of incremental discovery jobs based on the specified query parameters.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/datasafe/ListDiscoveryJobsExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use ListDiscoveryJobs
     *     API.
     */
    ListDiscoveryJobsResponse listDiscoveryJobs(ListDiscoveryJobsRequest request);

    /**
     * List all the findings from all the targets in the specified assessment.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/datasafe/ListFindingsExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use ListFindings API.
     */
    ListFindingsResponse listFindings(ListFindingsRequest request);

    /**
     * Gets a list of grants for a particular user in the specified user assessment. A user grant
     * contains details such as the privilege name, type, category, and depth level. The depth level
     * indicates how deep in the hierarchy of roles granted to roles a privilege grant is. The
     * userKey in this operation is a system-generated identifier. Perform the operation ListUsers
     * to get the userKey for a particular user.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/datasafe/ListGrantsExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use ListGrants API.
     */
    ListGrantsResponse listGrants(ListGrantsRequest request);

    /**
     * Gets a list of library masking formats based on the specified query parameters.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/datasafe/ListLibraryMaskingFormatsExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     ListLibraryMaskingFormats API.
     */
    ListLibraryMaskingFormatsResponse listLibraryMaskingFormats(
            ListLibraryMaskingFormatsRequest request);

    /**
     * Gets a list of masked columns present in the specified masking report and based on the
     * specified query parameters.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/datasafe/ListMaskedColumnsExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use ListMaskedColumns
     *     API.
     */
    ListMaskedColumnsResponse listMaskedColumns(ListMaskedColumnsRequest request);

    /**
     * Gets consolidated masking analytics data based on the specified query parameters. If
     * CompartmentIdInSubtreeQueryParam is specified as true, the behaviour is equivalent to
     * accessLevel \"ACCESSIBLE\" by default.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/datasafe/ListMaskingAnalyticsExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     ListMaskingAnalytics API.
     */
    ListMaskingAnalyticsResponse listMaskingAnalytics(ListMaskingAnalyticsRequest request);

    /**
     * Gets a list of masking columns present in the specified masking policy and based on the
     * specified query parameters.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/datasafe/ListMaskingColumnsExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use ListMaskingColumns
     *     API.
     */
    ListMaskingColumnsResponse listMaskingColumns(ListMaskingColumnsRequest request);

    /**
     * Gets a list of masking objects present in the specified masking policy and based on the
     * specified query parameters.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/datasafe/ListMaskingObjectsExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use ListMaskingObjects
     *     API.
     */
    ListMaskingObjectsResponse listMaskingObjects(ListMaskingObjectsRequest request);

    /**
     * Gets a list of masking policies based on the specified query parameters.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/datasafe/ListMaskingPoliciesExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use ListMaskingPolicies
     *     API.
     */
    ListMaskingPoliciesResponse listMaskingPolicies(ListMaskingPoliciesRequest request);

    /**
     * Gets a list of masking reports based on the specified query parameters.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/datasafe/ListMaskingReportsExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use ListMaskingReports
     *     API.
     */
    ListMaskingReportsResponse listMaskingReports(ListMaskingReportsRequest request);

    /**
     * Gets a list of masking schemas present in the specified masking policy and based on the
     * specified query parameters.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/datasafe/ListMaskingSchemasExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use ListMaskingSchemas
     *     API.
     */
    ListMaskingSchemasResponse listMaskingSchemas(ListMaskingSchemasRequest request);

    /**
     * Gets a list of on-premises connectors.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/datasafe/ListOnPremConnectorsExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     ListOnPremConnectors API.
     */
    ListOnPremConnectorsResponse listOnPremConnectors(ListOnPremConnectorsRequest request);

    /**
     * Gets a list of aggregated user profile details in the specified compartment. This provides
     * information about the overall profiles available. For example, the user profile details
     * include how many users have the profile assigned and do how many use password verification
     * function. This data is especially useful content for dashboards or to support analytics.
     *
     * <p>When you perform the ListProfileAnalytics operation, if the parameter
     * compartmentIdInSubtree is set to \"true,\" and if the parameter accessLevel is set to
     * ACCESSIBLE, then the operation returns compartments in which the requestor has INSPECT
     * permissions on at least one resource, directly or indirectly (in subcompartments). If the
     * operation is performed at the root compartment. If the requestor does not have access to at
     * least one subcompartment of the compartment specified by compartmentId, then \"Not
     * Authorized\" is returned.
     *
     * <p>The parameter compartmentIdInSubtree applies when you perform ListProfileAnalytics on the
     * compartmentId passed and when it is set to true, the entire hierarchy of compartments can be
     * returned.
     *
     * <p>To use ListProfileAnalytics to get a full list of all compartments and subcompartments in
     * the tenancy from the root compartment, set the parameter compartmentIdInSubtree to true and
     * accessLevel to ACCESSIBLE.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/datasafe/ListProfileAnalyticsExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     ListProfileAnalytics API.
     */
    ListProfileAnalyticsResponse listProfileAnalytics(ListProfileAnalyticsRequest request);

    /**
     * Gets a list of user profiles containing the profile details along with the target id and user
     * counts.
     *
     * <p>The ListProfiles operation returns only the profiles belonging to a certain target. If
     * compartment type user assessment id is provided, then profile information for all the targets
     * belonging to the pertaining compartment is returned. The list does not include any
     * subcompartments of the compartment under consideration.
     *
     * <p>The parameter 'accessLevel' specifies whether to return only those compartments for which
     * the requestor has INSPECT permissions on at least one resource directly or indirectly
     * (ACCESSIBLE) (the resource can be in a subcompartment) or to return Not Authorized if
     * Principal doesn't have access to even one of the child compartments. This is valid only when
     * 'compartmentIdInSubtree' is set to 'true'.
     *
     * <p>The parameter 'compartmentIdInSubtree' applies when you perform ListUserProfiles on the
     * 'compartmentId' belonging to the assessmentId passed and when it is set to true, the entire
     * hierarchy of compartments can be returned. To get a full list of all compartments and
     * subcompartments in the tenancy (root compartment), set the parameter 'compartmentIdInSubtree'
     * to true and 'accessLevel' to ACCESSIBLE.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/datasafe/ListProfileSummariesExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     ListProfileSummaries API.
     */
    ListProfileSummariesResponse listProfileSummaries(ListProfileSummariesRequest request);

    /**
     * Gets a list of report definitions. The ListReportDefinitions operation returns only the
     * report definitions in the specified `compartmentId`. It also returns the seeded report
     * definitions which are available to all the compartments.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/datasafe/ListReportDefinitionsExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     ListReportDefinitions API.
     */
    ListReportDefinitionsResponse listReportDefinitions(ListReportDefinitionsRequest request);

    /**
     * Gets a list of all the reports in the compartment. It contains information such as report
     * generation time.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/datasafe/ListReportsExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use ListReports API.
     */
    ListReportsResponse listReports(ListReportsRequest request);

    /**
     * Returns a list of role metadata objects.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/datasafe/ListRolesExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use ListRoles API.
     */
    ListRolesResponse listRoles(ListRolesRequest request);

    /**
     * Returns list of schema.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/datasafe/ListSchemasExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use ListSchemas API.
     */
    ListSchemasResponse listSchemas(ListSchemasRequest request);

    /**
     * Gets a list of SDM and masking policy difference resources based on the specified query
     * parameters.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/datasafe/ListSdmMaskingPolicyDifferencesExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     ListSdmMaskingPolicyDifferences API.
     */
    ListSdmMaskingPolicyDifferencesResponse listSdmMaskingPolicyDifferences(
            ListSdmMaskingPolicyDifferencesRequest request);

    /**
     * Gets a list of security assessments.
     *
     * <p>The ListSecurityAssessments operation returns only the assessments in the specified
     * `compartmentId`. The list does not include any subcompartments of the compartmentId passed.
     *
     * <p>The parameter `accessLevel` specifies whether to return only those compartments for which
     * the requestor has INSPECT permissions on at least one resource directly or indirectly
     * (ACCESSIBLE) (the resource can be in a subcompartment) or to return Not Authorized if
     * Principal doesn't have access to even one of the child compartments. This is valid only when
     * `compartmentIdInSubtree` is set to `true`.
     *
     * <p>The parameter `compartmentIdInSubtree` applies when you perform ListSecurityAssessments on
     * the `compartmentId` passed and when it is set to true, the entire hierarchy of compartments
     * can be returned. To get a full list of all compartments and subcompartments in the tenancy
     * (root compartment), set the parameter `compartmentIdInSubtree` to true and `accessLevel` to
     * ACCESSIBLE.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/datasafe/ListSecurityAssessmentsExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     ListSecurityAssessments API.
     */
    ListSecurityAssessmentsResponse listSecurityAssessments(ListSecurityAssessmentsRequest request);

    /**
     * Gets a list of sensitive columns present in the specified sensitive data model based on the
     * specified query parameters.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/datasafe/ListSensitiveColumnsExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     ListSensitiveColumns API.
     */
    ListSensitiveColumnsResponse listSensitiveColumns(ListSensitiveColumnsRequest request);

    /**
     * Gets a list of sensitive data models based on the specified query parameters.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/datasafe/ListSensitiveDataModelsExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     ListSensitiveDataModels API.
     */
    ListSensitiveDataModelsResponse listSensitiveDataModels(ListSensitiveDataModelsRequest request);

    /**
     * Gets a list of sensitive objects present in the specified sensitive data model based on the
     * specified query parameters.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/datasafe/ListSensitiveObjectsExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     ListSensitiveObjects API.
     */
    ListSensitiveObjectsResponse listSensitiveObjects(ListSensitiveObjectsRequest request);

    /**
     * Gets a list of sensitive schemas present in the specified sensitive data model based on the
     * specified query parameters.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/datasafe/ListSensitiveSchemasExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     ListSensitiveSchemas API.
     */
    ListSensitiveSchemasResponse listSensitiveSchemas(ListSensitiveSchemasRequest request);

    /**
     * Gets a list of sensitive types based on the specified query parameters.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/datasafe/ListSensitiveTypesExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use ListSensitiveTypes
     *     API.
     */
    ListSensitiveTypesResponse listSensitiveTypes(ListSensitiveTypesRequest request);

    /**
     * Returns a list of table metadata objects.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/datasafe/ListTablesExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use ListTables API.
     */
    ListTablesResponse listTables(ListTablesRequest request);

    /**
     * Gets a list of all target-alert policy associations.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/datasafe/ListTargetAlertPolicyAssociationsExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     ListTargetAlertPolicyAssociations API.
     */
    ListTargetAlertPolicyAssociationsResponse listTargetAlertPolicyAssociations(
            ListTargetAlertPolicyAssociationsRequest request);

    /**
     * Returns the list of registered target databases in Data Safe.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/datasafe/ListTargetDatabasesExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use ListTargetDatabases
     *     API.
     */
    ListTargetDatabasesResponse listTargetDatabases(ListTargetDatabasesRequest request);

    /**
     * Gets a list of aggregated user details from the specified user assessment. This provides
     * information about the overall state of database user security. For example, the user details
     * include how many users have the DBA role and how many users are in the critical category.
     * This data is especially useful content for dashboards or to support analytics.
     *
     * <p>When you perform the ListUserAnalytics operation, if the parameter compartmentIdInSubtree
     * is set to \"true,\" and if the parameter accessLevel is set to ACCESSIBLE, then the operation
     * returns compartments in which the requestor has INSPECT permissions on at least one resource,
     * directly or indirectly (in subcompartments). If the operation is performed at the root
     * compartment. If the requestor does not have access to at least one subcompartment of the
     * compartment specified by compartmentId, then \"Not Authorized\" is returned.
     *
     * <p>The parameter compartmentIdInSubtree applies when you perform ListUserAnalytics on the
     * compartmentId passed and when it is set to true, the entire hierarchy of compartments can be
     * returned.
     *
     * <p>To use ListUserAnalytics to get a full list of all compartments and subcompartments in the
     * tenancy from the root compartment, set the parameter compartmentIdInSubtree to true and
     * accessLevel to ACCESSIBLE.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/datasafe/ListUserAnalyticsExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use ListUserAnalytics
     *     API.
     */
    ListUserAnalyticsResponse listUserAnalytics(ListUserAnalyticsRequest request);

    /**
     * Gets a list of user assessments.
     *
     * <p>The ListUserAssessments operation returns only the assessments in the specified
     * `compartmentId`. The list does not include any subcompartments of the compartmentId passed.
     *
     * <p>The parameter `accessLevel` specifies whether to return only those compartments for which
     * the requestor has INSPECT permissions on at least one resource directly or indirectly
     * (ACCESSIBLE) (the resource can be in a subcompartment) or to return Not Authorized if
     * Principal doesn't have access to even one of the child compartments. This is valid only when
     * `compartmentIdInSubtree` is set to `true`.
     *
     * <p>The parameter `compartmentIdInSubtree` applies when you perform ListUserAssessments on the
     * `compartmentId` passed and when it is set to true, the entire hierarchy of compartments can
     * be returned. To get a full list of all compartments and subcompartments in the tenancy (root
     * compartment), set the parameter `compartmentIdInSubtree` to true and `accessLevel` to
     * ACCESSIBLE.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/datasafe/ListUserAssessmentsExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use ListUserAssessments
     *     API.
     */
    ListUserAssessmentsResponse listUserAssessments(ListUserAssessmentsRequest request);

    /**
     * Gets a list of users of the specified user assessment. The result contains the database user
     * details for each user, such as user type, account status, last login time, user creation
     * time, authentication type, user profile, and the date and time of the latest password change.
     * It also contains the user category derived from these user details as well as privileges
     * granted to each user.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/datasafe/ListUsersExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use ListUsers API.
     */
    ListUsersResponse listUsers(ListUsersRequest request);

    /**
     * Gets a list of errors for the specified work request.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/datasafe/ListWorkRequestErrorsExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     ListWorkRequestErrors API.
     */
    ListWorkRequestErrorsResponse listWorkRequestErrors(ListWorkRequestErrorsRequest request);

    /**
     * Gets a list of log entries for the specified work request.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/datasafe/ListWorkRequestLogsExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use ListWorkRequestLogs
     *     API.
     */
    ListWorkRequestLogsResponse listWorkRequestLogs(ListWorkRequestLogsRequest request);

    /**
     * Gets a list of work requests.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/datasafe/ListWorkRequestsExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use ListWorkRequests
     *     API.
     */
    ListWorkRequestsResponse listWorkRequests(ListWorkRequestsRequest request);

    /**
     * Masks data using the specified masking policy.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/datasafe/MaskDataExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use MaskData API.
     */
    MaskDataResponse maskData(MaskDataRequest request);

    /**
     * Modifies Global Settings in Data Safe in the tenancy and region.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/datasafe/ModifyGlobalSettingsExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     ModifyGlobalSettings API.
     */
    ModifyGlobalSettingsResponse modifyGlobalSettings(ModifyGlobalSettingsRequest request);

    /**
     * Updates the status of one or more alert specified by the alert IDs.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/datasafe/PatchAlertsExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use PatchAlerts API.
     */
    PatchAlertsResponse patchAlerts(PatchAlertsRequest request);

    /**
     * Patches one or more discovery results. You can use this operation to set the plannedAction
     * attribute before using ApplyDiscoveryJobResults to process the results based on this
     * attribute.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/datasafe/PatchDiscoveryJobResultsExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     PatchDiscoveryJobResults API.
     */
    PatchDiscoveryJobResultsResponse patchDiscoveryJobResults(
            PatchDiscoveryJobResultsRequest request);

    /**
     * Patches one or more columns in the specified masking policy. Use it to create, or update
     * masking columns. To create masking columns, use CreateMaskingColumnDetails as the patch
     * value. And to update masking columns, use UpdateMaskingColumnDetails as the patch value.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/datasafe/PatchMaskingColumnsExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use PatchMaskingColumns
     *     API.
     */
    PatchMaskingColumnsResponse patchMaskingColumns(PatchMaskingColumnsRequest request);

    /**
     * Patches one or more SDM masking policy difference columns. You can use this operation to set
     * the plannedAction attribute before using ApplySdmMaskingPolicyDifference to process the
     * difference based on this attribute.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/datasafe/PatchSdmMaskingPolicyDifferenceColumnsExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     PatchSdmMaskingPolicyDifferenceColumns API.
     */
    PatchSdmMaskingPolicyDifferenceColumnsResponse patchSdmMaskingPolicyDifferenceColumns(
            PatchSdmMaskingPolicyDifferenceColumnsRequest request);

    /**
     * Patches one or more columns in the specified sensitive data model. Use it to create, update,
     * or delete sensitive columns. To create sensitive columns, use CreateSensitiveColumnDetails as
     * the patch value. And to update sensitive columns, use UpdateSensitiveColumnDetails as the
     * patch value.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/datasafe/PatchSensitiveColumnsExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     PatchSensitiveColumns API.
     */
    PatchSensitiveColumnsResponse patchSensitiveColumns(PatchSensitiveColumnsRequest request);

    /**
     * Creates new target-alert policy associations that will be applied on the target database.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/datasafe/PatchTargetAlertPolicyAssociationExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     PatchTargetAlertPolicyAssociation API.
     */
    PatchTargetAlertPolicyAssociationResponse patchTargetAlertPolicyAssociation(
            PatchTargetAlertPolicyAssociationRequest request);

    /**
     * Provision audit policy.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/datasafe/ProvisionAuditPolicyExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     ProvisionAuditPolicy API.
     */
    ProvisionAuditPolicyResponse provisionAuditPolicy(ProvisionAuditPolicyRequest request);

    /**
     * Runs a security assessment, refreshes the latest assessment, and saves it for future
     * reference. The assessment runs with a securityAssessmentId of type LATEST. Before you start,
     * first call the ListSecurityAssessments operation with filter \"type = latest\" to get the
     * security assessment id for the target's latest assessment.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/datasafe/RefreshSecurityAssessmentExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     RefreshSecurityAssessment API.
     */
    RefreshSecurityAssessmentResponse refreshSecurityAssessment(
            RefreshSecurityAssessmentRequest request);

    /**
     * Refreshes the latest assessment and saves it for future reference. This operation runs with a
     * userAssessmentId of type LATEST. Before you start, first call the ListUserAssessments
     * operation with filter \"type = latest\" to get the user assessment ID for the target's latest
     * assessment.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/datasafe/RefreshUserAssessmentExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     RefreshUserAssessment API.
     */
    RefreshUserAssessmentResponse refreshUserAssessment(RefreshUserAssessmentRequest request);

    /**
     * Deletes the schedule of a PDF or XLS report.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/datasafe/RemoveScheduleReportExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     RemoveScheduleReport API.
     */
    RemoveScheduleReportResponse removeScheduleReport(RemoveScheduleReportRequest request);

    /**
     * Resumes the specified audit trail once it got stopped.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/datasafe/ResumeAuditTrailExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use ResumeAuditTrail
     *     API.
     */
    ResumeAuditTrailResponse resumeAuditTrail(ResumeAuditTrailRequest request);

    /**
     * Resume the given work request. Issuing a resume does not guarantee of immediate resume of the
     * work request.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/datasafe/ResumeWorkRequestExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use ResumeWorkRequest
     *     API.
     */
    ResumeWorkRequestResponse resumeWorkRequest(ResumeWorkRequestRequest request);

    /**
     * Retrieves the audit policy details from the source target database.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/datasafe/RetrieveAuditPoliciesExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     RetrieveAuditPolicies API.
     */
    RetrieveAuditPoliciesResponse retrieveAuditPolicies(RetrieveAuditPoliciesRequest request);

    /**
     * Schedules a PDF or XLS report based on parameters and report definition.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/datasafe/ScheduleReportExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use ScheduleReport API.
     */
    ScheduleReportResponse scheduleReport(ScheduleReportRequest request);

    /**
     * Sets the saved security assessment as the baseline in the compartment where the the specified
     * assessment resides. The security assessment needs to be of type 'SAVED'.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/datasafe/SetSecurityAssessmentBaselineExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     SetSecurityAssessmentBaseline API.
     */
    SetSecurityAssessmentBaselineResponse setSecurityAssessmentBaseline(
            SetSecurityAssessmentBaselineRequest request);

    /**
     * Sets the saved user assessment as the baseline in the compartment where the specified
     * assessment resides. The user assessment needs to be of type 'SAVED'.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/datasafe/SetUserAssessmentBaselineExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     SetUserAssessmentBaseline API.
     */
    SetUserAssessmentBaselineResponse setUserAssessmentBaseline(
            SetUserAssessmentBaselineRequest request);

    /**
     * Starts collection of audit records on the specified audit trail.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/datasafe/StartAuditTrailExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use StartAuditTrail
     *     API.
     */
    StartAuditTrailResponse startAuditTrail(StartAuditTrailRequest request);

    /**
     * Stops the specified audit trail.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/datasafe/StopAuditTrailExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use StopAuditTrail API.
     */
    StopAuditTrailResponse stopAuditTrail(StopAuditTrailRequest request);

    /**
     * Suspend the given work request. Issuing a suspend does not guarantee of a immediate suspend
     * of the work request.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/datasafe/SuspendWorkRequestExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use SuspendWorkRequest
     *     API.
     */
    SuspendWorkRequestResponse suspendWorkRequest(SuspendWorkRequestRequest request);

    /**
     * Removes the baseline setting for the saved security assessment. The saved security assessment
     * is no longer considered a baseline. Sets the if-match parameter to the value of the etag from
     * a previous GET or POST response for that resource.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/datasafe/UnsetSecurityAssessmentBaselineExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     UnsetSecurityAssessmentBaseline API.
     */
    UnsetSecurityAssessmentBaselineResponse unsetSecurityAssessmentBaseline(
            UnsetSecurityAssessmentBaselineRequest request);

    /**
     * Removes the baseline setting for the saved user assessment. The saved user assessment is no
     * longer considered a baseline. Sets the if-match parameter to the value of the etag from a
     * previous GET or POST response for that resource.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/datasafe/UnsetUserAssessmentBaselineExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     UnsetUserAssessmentBaseline API.
     */
    UnsetUserAssessmentBaselineResponse unsetUserAssessmentBaseline(
            UnsetUserAssessmentBaselineRequest request);

    /**
     * Updates the status of the specified alert.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/datasafe/UpdateAlertExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use UpdateAlert API.
     */
    UpdateAlertResponse updateAlert(UpdateAlertRequest request);

    /**
     * Updates the audit archive retrieval.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/datasafe/UpdateAuditArchiveRetrievalExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     UpdateAuditArchiveRetrieval API.
     */
    UpdateAuditArchiveRetrievalResponse updateAuditArchiveRetrieval(
            UpdateAuditArchiveRetrievalRequest request);

    /**
     * Updates the audit policy.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/datasafe/UpdateAuditPolicyExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use UpdateAuditPolicy
     *     API.
     */
    UpdateAuditPolicyResponse updateAuditPolicy(UpdateAuditPolicyRequest request);

    /**
     * Updates one or more attributes of the specified audit profile.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/datasafe/UpdateAuditProfileExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use UpdateAuditProfile
     *     API.
     */
    UpdateAuditProfileResponse updateAuditProfile(UpdateAuditProfileRequest request);

    /**
     * Updates one or more attributes of the specified audit trail.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/datasafe/UpdateAuditTrailExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use UpdateAuditTrail
     *     API.
     */
    UpdateAuditTrailResponse updateAuditTrail(UpdateAuditTrailRequest request);

    /**
     * Updates one or more attributes of the specified Data Safe private endpoint.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/datasafe/UpdateDataSafePrivateEndpointExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     UpdateDataSafePrivateEndpoint API.
     */
    UpdateDataSafePrivateEndpointResponse updateDataSafePrivateEndpoint(
            UpdateDataSafePrivateEndpointRequest request);

    /**
     * Updates one or more attributes of the specified library masking format. Note that updating
     * the formatEntries attribute replaces all the existing masking format entries with the
     * specified format entries.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/datasafe/UpdateLibraryMaskingFormatExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     UpdateLibraryMaskingFormat API.
     */
    UpdateLibraryMaskingFormatResponse updateLibraryMaskingFormat(
            UpdateLibraryMaskingFormatRequest request);

    /**
     * Updates one or more attributes of the specified masking column. Note that updating the
     * maskingFormats attribute replaces the currently assigned masking formats with the specified
     * masking formats.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/datasafe/UpdateMaskingColumnExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use UpdateMaskingColumn
     *     API.
     */
    UpdateMaskingColumnResponse updateMaskingColumn(UpdateMaskingColumnRequest request);

    /**
     * Updates one or more attributes of the specified masking policy.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/datasafe/UpdateMaskingPolicyExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use UpdateMaskingPolicy
     *     API.
     */
    UpdateMaskingPolicyResponse updateMaskingPolicy(UpdateMaskingPolicyRequest request);

    /**
     * Updates one or more attributes of the specified on-premises connector.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/datasafe/UpdateOnPremConnectorExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     UpdateOnPremConnector API.
     */
    UpdateOnPremConnectorResponse updateOnPremConnector(UpdateOnPremConnectorRequest request);

    /**
     * Updates the wallet for the specified on-premises connector to a new version.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/datasafe/UpdateOnPremConnectorWalletExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     UpdateOnPremConnectorWallet API.
     */
    UpdateOnPremConnectorWalletResponse updateOnPremConnectorWallet(
            UpdateOnPremConnectorWalletRequest request);

    /**
     * Updates the specified report definition. Only user created report definition can be updated.
     * Seeded report definitions need to be saved as new report definition first.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/datasafe/UpdateReportDefinitionExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     UpdateReportDefinition API.
     */
    UpdateReportDefinitionResponse updateReportDefinition(UpdateReportDefinitionRequest request);

    /**
     * Updates one or more attributes of the specified sdm masking policy difference.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/datasafe/UpdateSdmMaskingPolicyDifferenceExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     UpdateSdmMaskingPolicyDifference API.
     */
    UpdateSdmMaskingPolicyDifferenceResponse updateSdmMaskingPolicyDifference(
            UpdateSdmMaskingPolicyDifferenceRequest request);

    /**
     * Updates one or more attributes of the specified security assessment. This operation allows to
     * update the security assessment displayName, description, or schedule.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/datasafe/UpdateSecurityAssessmentExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     UpdateSecurityAssessment API.
     */
    UpdateSecurityAssessmentResponse updateSecurityAssessment(
            UpdateSecurityAssessmentRequest request);

    /**
     * Updates one or more attributes of the specified sensitive column.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/datasafe/UpdateSensitiveColumnExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     UpdateSensitiveColumn API.
     */
    UpdateSensitiveColumnResponse updateSensitiveColumn(UpdateSensitiveColumnRequest request);

    /**
     * Updates one or more attributes of the specified sensitive data model. Note that updating any
     * attribute of a sensitive data model does not perform data discovery.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/datasafe/UpdateSensitiveDataModelExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     UpdateSensitiveDataModel API.
     */
    UpdateSensitiveDataModelResponse updateSensitiveDataModel(
            UpdateSensitiveDataModelRequest request);

    /**
     * Updates one or more attributes of the specified sensitive type.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/datasafe/UpdateSensitiveTypeExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use UpdateSensitiveType
     *     API.
     */
    UpdateSensitiveTypeResponse updateSensitiveType(UpdateSensitiveTypeRequest request);

    /**
     * Updates the specified target-alert policy association.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/datasafe/UpdateTargetAlertPolicyAssociationExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     UpdateTargetAlertPolicyAssociation API.
     */
    UpdateTargetAlertPolicyAssociationResponse updateTargetAlertPolicyAssociation(
            UpdateTargetAlertPolicyAssociationRequest request);

    /**
     * Updates one or more attributes of the specified Data Safe target database.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/datasafe/UpdateTargetDatabaseExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     UpdateTargetDatabase API.
     */
    UpdateTargetDatabaseResponse updateTargetDatabase(UpdateTargetDatabaseRequest request);

    /**
     * Updates one or more attributes of the specified user assessment. This operation allows to
     * update the user assessment displayName, description, or schedule.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/datasafe/UpdateUserAssessmentExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     UpdateUserAssessment API.
     */
    UpdateUserAssessmentResponse updateUserAssessment(UpdateUserAssessmentRequest request);

    /**
     * Uploads a masking policy file (also called template) to update the specified masking policy.
     * To create a new masking policy using a file, first use the CreateMaskingPolicy operation to
     * create an empty masking policy and then use this endpoint to upload the masking policy file.
     * Note that the upload operation replaces the content of the specified masking policy,
     * including all the existing columns and masking formats, with the content of the file.
     *
     * <p>Note: This operation consumes a stream.
     *
     * <p>If the stream supports {@link java.io.InputStream#mark(int)} and {@link
     * java.io.InputStream#reset()}, when a retry is necessary, the stream is reset so it starts at
     * the beginning (or whatever the stream's position was at the time this operation is called}.
     *
     * <p>Note this means that if the caller has used {@link java.io.InputStream#mark(int)} before,
     * then the mark will not be the same anymore after this operation, and a subsequent call to
     * {@link java.io.InputStream#reset()} by the caller will reset the stream not to the caller's
     * mark, but to the position the stream was in when this operation was called.
     *
     * <p>If the stream is a {@link java.io.FileInputStream}, and the stream's {@link
     * java.nio.channels.FileChannel} position can be changed (like for a regular file), the stream
     * will be wrapped in such a way that it does provide support for {@link
     * java.io.InputStream#mark(int)} and {@link java.io.InputStream#reset()}. Then the same
     * procedure as above is followed. If the stream's {@link java.nio.channels.FileChannel}
     * position cannot be changed (like for a named pipe), then the stream's contents will be
     * buffered in memory, as described below.
     *
     * <p>If the stream does not support {@link java.io.InputStream#mark(int)} and {@link
     * java.io.InputStream#reset()}, then the stream is wrapped in a {@link
     * java.io.BufferedInputStream}, which means the entire contents may be buffered in memory. Then
     * the same procedure as above is followed.
     *
     * <p>The contents of the stream, except when the stream is a {@link java.io.FileInputStream}
     * whose {@link java.nio.channels.FileChannel} position can be changed, should be less than 2
     * GiB in size if retries are used. This is because streams 2 GiB in size or larger do no
     * guarantee that mark-and-reset can be performed. If the stream is larger, do not use built-in
     * retries and manage retries yourself.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/datasafe/UploadMaskingPolicyExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use UploadMaskingPolicy
     *     API.
     */
    UploadMaskingPolicyResponse uploadMaskingPolicy(UploadMaskingPolicyRequest request);

    /**
     * Uploads a sensitive data model file (also called template) to update the specified sensitive
     * data model. To create a new sensitive data model using a file, first use the
     * CreateSensitiveDataModel operation to create an empty data model and then use this endpoint
     * to upload the data model file. Note that the upload operation replaces the content of the
     * specified sensitive data model, including all the existing columns and their relationships,
     * with the content of the file.
     *
     * <p>Note: This operation consumes a stream.
     *
     * <p>If the stream supports {@link java.io.InputStream#mark(int)} and {@link
     * java.io.InputStream#reset()}, when a retry is necessary, the stream is reset so it starts at
     * the beginning (or whatever the stream's position was at the time this operation is called}.
     *
     * <p>Note this means that if the caller has used {@link java.io.InputStream#mark(int)} before,
     * then the mark will not be the same anymore after this operation, and a subsequent call to
     * {@link java.io.InputStream#reset()} by the caller will reset the stream not to the caller's
     * mark, but to the position the stream was in when this operation was called.
     *
     * <p>If the stream is a {@link java.io.FileInputStream}, and the stream's {@link
     * java.nio.channels.FileChannel} position can be changed (like for a regular file), the stream
     * will be wrapped in such a way that it does provide support for {@link
     * java.io.InputStream#mark(int)} and {@link java.io.InputStream#reset()}. Then the same
     * procedure as above is followed. If the stream's {@link java.nio.channels.FileChannel}
     * position cannot be changed (like for a named pipe), then the stream's contents will be
     * buffered in memory, as described below.
     *
     * <p>If the stream does not support {@link java.io.InputStream#mark(int)} and {@link
     * java.io.InputStream#reset()}, then the stream is wrapped in a {@link
     * java.io.BufferedInputStream}, which means the entire contents may be buffered in memory. Then
     * the same procedure as above is followed.
     *
     * <p>The contents of the stream, except when the stream is a {@link java.io.FileInputStream}
     * whose {@link java.nio.channels.FileChannel} position can be changed, should be less than 2
     * GiB in size if retries are used. This is because streams 2 GiB in size or larger do no
     * guarantee that mark-and-reset can be performed. If the stream is larger, do not use built-in
     * retries and manage retries yourself.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/datasafe/UploadSensitiveDataModelExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     UploadSensitiveDataModel API.
     */
    UploadSensitiveDataModelResponse uploadSensitiveDataModel(
            UploadSensitiveDataModelRequest request);

    /**
     * Gets the pre-configured waiters available for resources for this service.
     *
     * @return The service waiters.
     */
    DataSafeWaiters getWaiters();

    /**
     * Gets the pre-configured paginators available for list operations in this service which may
     * return multiple pages of data. These paginators provide an {@link java.lang.Iterable}
     * interface so that service responses, or resources/records, can be iterated through without
     * having to manually deal with pagination and page tokens.
     *
     * @return The service paginators.
     */
    DataSafePaginators getPaginators();
}

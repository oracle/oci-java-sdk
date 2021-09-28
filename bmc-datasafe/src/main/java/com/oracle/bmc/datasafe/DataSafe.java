/**
 * Copyright (c) 2016, 2021, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.datasafe;

import com.oracle.bmc.datasafe.requests.*;
import com.oracle.bmc.datasafe.responses.*;

/**
 * APIs for using Oracle Data Safe.
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20181201")
public interface DataSafe extends AutoCloseable {

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
     * Reactivates a previously deactivated Data Safe target database.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/datasafe/ActivateTargetDatabaseExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use ActivateTargetDatabase API.
     */
    ActivateTargetDatabaseResponse activateTargetDatabase(ActivateTargetDatabaseRequest request);

    /**
     * Moves the Data Safe private endpoint and its dependent resources to the specified compartment.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/datasafe/ChangeDataSafePrivateEndpointCompartmentExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use ChangeDataSafePrivateEndpointCompartment API.
     */
    ChangeDataSafePrivateEndpointCompartmentResponse changeDataSafePrivateEndpointCompartment(
            ChangeDataSafePrivateEndpointCompartmentRequest request);

    /**
     * Moves the specified on-premises connector into a different compartment.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/datasafe/ChangeOnPremConnectorCompartmentExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use ChangeOnPremConnectorCompartment API.
     */
    ChangeOnPremConnectorCompartmentResponse changeOnPremConnectorCompartment(
            ChangeOnPremConnectorCompartmentRequest request);

    /**
     * Moves the specified saved security assessment or future scheduled assessments into a different compartment.
     * <p>
     * To start, call first the operation ListSecurityAssessments with filters \"type = save_schedule\". This returns the scheduleAssessmentId. Then, call this changeCompartment with the scheduleAssessmentId.
     * <p>
     * The existing saved security assessments created due to the schedule are not moved. However, all new saves will be associated with the new compartment.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/datasafe/ChangeSecurityAssessmentCompartmentExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use ChangeSecurityAssessmentCompartment API.
     */
    ChangeSecurityAssessmentCompartmentResponse changeSecurityAssessmentCompartment(
            ChangeSecurityAssessmentCompartmentRequest request);

    /**
     * Moves the Data Safe target database to the specified compartment.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/datasafe/ChangeTargetDatabaseCompartmentExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use ChangeTargetDatabaseCompartment API.
     */
    ChangeTargetDatabaseCompartmentResponse changeTargetDatabaseCompartment(
            ChangeTargetDatabaseCompartmentRequest request);

    /**
     * Moves the specified saved user assessment or future scheduled assessments into a different compartment.
     * To start storing scheduled user assessments on a different compartment, first call the operation ListUserAssessments with
     * the filters \"type = save_schedule\". That call returns the scheduleAssessmentId. Then call
     * ChangeUserAssessmentCompartment with the scheduleAssessmentId. The existing saved user assessments created per the schedule
     * are not be moved. However, all new saves will be associated with the new compartment.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/datasafe/ChangeUserAssessmentCompartmentExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use ChangeUserAssessmentCompartment API.
     */
    ChangeUserAssessmentCompartmentResponse changeUserAssessmentCompartment(
            ChangeUserAssessmentCompartmentRequest request);

    /**
     * Compares two security assessments. For this comparison, a security assessment can be a saved assessment, a latest assessment, or a baseline assessment.
     * For example, you can compare saved assessment or a latest assessment against a baseline.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/datasafe/CompareSecurityAssessmentExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use CompareSecurityAssessment API.
     */
    CompareSecurityAssessmentResponse compareSecurityAssessment(
            CompareSecurityAssessmentRequest request);

    /**
     * Compares two user assessments. For this comparison, a user assessment can be a saved, a latest assessment, or a baseline.
     * As an example, it can be used to compare a user assessment saved or a latest assessment with a baseline.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/datasafe/CompareUserAssessmentExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use CompareUserAssessment API.
     */
    CompareUserAssessmentResponse compareUserAssessment(CompareUserAssessmentRequest request);

    /**
     * Creates a new Data Safe private endpoint.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/datasafe/CreateDataSafePrivateEndpointExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use CreateDataSafePrivateEndpoint API.
     */
    CreateDataSafePrivateEndpointResponse createDataSafePrivateEndpoint(
            CreateDataSafePrivateEndpointRequest request);

    /**
     * Creates a new on-premises connector.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/datasafe/CreateOnPremConnectorExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use CreateOnPremConnector API.
     */
    CreateOnPremConnectorResponse createOnPremConnector(CreateOnPremConnectorRequest request);

    /**
     * Creates a new saved security assessment for one or multiple targets in a compartment. When this operation is performed,
     * it will save the latest assessments in the specified compartment. If a schedule is passed, it will persist the latest assessments,
     * at the defined date and time, in the format defined by [RFC3339](https://tools.ietf.org/html/rfc3339).
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/datasafe/CreateSecurityAssessmentExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use CreateSecurityAssessment API.
     */
    CreateSecurityAssessmentResponse createSecurityAssessment(
            CreateSecurityAssessmentRequest request);

    /**
     * Registers the specified database with Data Safe and creates a Data Safe target database in the Data Safe Console.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/datasafe/CreateTargetDatabaseExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use CreateTargetDatabase API.
     */
    CreateTargetDatabaseResponse createTargetDatabase(CreateTargetDatabaseRequest request);

    /**
     * Creates a new saved user assessment for one or multiple targets in a compartment. It saves the latest assessments in the
     * specified compartment. If a scheduled is passed in, this operation persists the latest assessments that exist at the defined
     * date and time, in the format defined by [RFC3339](https://tools.ietf.org/html/rfc3339).
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/datasafe/CreateUserAssessmentExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use CreateUserAssessment API.
     */
    CreateUserAssessmentResponse createUserAssessment(CreateUserAssessmentRequest request);

    /**
     * Deactivates a target database in Data Safe.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/datasafe/DeactivateTargetDatabaseExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use DeactivateTargetDatabase API.
     */
    DeactivateTargetDatabaseResponse deactivateTargetDatabase(
            DeactivateTargetDatabaseRequest request);

    /**
     * Deletes the specified Data Safe private endpoint.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/datasafe/DeleteDataSafePrivateEndpointExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use DeleteDataSafePrivateEndpoint API.
     */
    DeleteDataSafePrivateEndpointResponse deleteDataSafePrivateEndpoint(
            DeleteDataSafePrivateEndpointRequest request);

    /**
     * Deletes the specified on-premises connector.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/datasafe/DeleteOnPremConnectorExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use DeleteOnPremConnector API.
     */
    DeleteOnPremConnectorResponse deleteOnPremConnector(DeleteOnPremConnectorRequest request);

    /**
     * Deletes the specified saved security assessment or schedule. To delete a security assessment schedule,
     * first call the operation ListSecurityAssessments with filters \"type = save_schedule\".
     * That operation returns the scheduleAssessmentId. Then, call DeleteSecurityAssessment with the scheduleAssessmentId.
     * If the assessment being deleted is the baseline for that compartment, then it will impact all baselines in the compartment.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/datasafe/DeleteSecurityAssessmentExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use DeleteSecurityAssessment API.
     */
    DeleteSecurityAssessmentResponse deleteSecurityAssessment(
            DeleteSecurityAssessmentRequest request);

    /**
     * Deregisters the specified database from Data Safe and removes the target database from the Data Safe Console.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/datasafe/DeleteTargetDatabaseExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use DeleteTargetDatabase API.
     */
    DeleteTargetDatabaseResponse deleteTargetDatabase(DeleteTargetDatabaseRequest request);

    /**
     * Deletes the specified saved user assessment or schedule. To delete a user assessment schedule, first call the operation
     * ListUserAssessments with filters \"type = save_schedule\".
     * That call returns the scheduleAssessmentId. Then call DeleteUserAssessment with the scheduleAssessmentId.
     * If the assessment being deleted is the baseline for that compartment, then it will impact all baselines in the compartment.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/datasafe/DeleteUserAssessmentExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use DeleteUserAssessment API.
     */
    DeleteUserAssessmentResponse deleteUserAssessment(DeleteUserAssessmentRequest request);

    /**
     * Downloads the privilege script to grant/revoke required roles from the Data Safe account on the target database.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/datasafe/DownloadPrivilegeScriptExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use DownloadPrivilegeScript API.
     */
    DownloadPrivilegeScriptResponse downloadPrivilegeScript(DownloadPrivilegeScriptRequest request);

    /**
     * Downloads the report of the specified security assessment. To download the security assessment report, it needs to be generated first.
     * Please use GenerateSecurityAssessmentReport to generate a downloadable report in the preferred format (PDF, XLS).
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/datasafe/DownloadSecurityAssessmentReportExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use DownloadSecurityAssessmentReport API.
     */
    DownloadSecurityAssessmentReportResponse downloadSecurityAssessmentReport(
            DownloadSecurityAssessmentReportRequest request);

    /**
     * Downloads the report of the specified user assessment. To download the user assessment report, it needs to be generated first.
     * Please use GenerateUserAssessmentReport to generate a downloadable report in the preferred format (PDF, XLS).
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/datasafe/DownloadUserAssessmentReportExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use DownloadUserAssessmentReport API.
     */
    DownloadUserAssessmentReportResponse downloadUserAssessmentReport(
            DownloadUserAssessmentReportRequest request);

    /**
     * Enables Data Safe in the tenancy and region.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/datasafe/EnableDataSafeConfigurationExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use EnableDataSafeConfiguration API.
     */
    EnableDataSafeConfigurationResponse enableDataSafeConfiguration(
            EnableDataSafeConfigurationRequest request);

    /**
     * Creates and downloads the configuration of the specified on-premises connector.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/datasafe/GenerateOnPremConnectorConfigurationExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use GenerateOnPremConnectorConfiguration API.
     */
    GenerateOnPremConnectorConfigurationResponse generateOnPremConnectorConfiguration(
            GenerateOnPremConnectorConfigurationRequest request);

    /**
     * Generates the report of the specified security assessment. You can get the report in PDF or XLS format.
     * After generating the report, use DownloadSecurityAssessmentReport to download it in the preferred format.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/datasafe/GenerateSecurityAssessmentReportExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use GenerateSecurityAssessmentReport API.
     */
    GenerateSecurityAssessmentReportResponse generateSecurityAssessmentReport(
            GenerateSecurityAssessmentReportRequest request);

    /**
     * Generates the report of the specified user assessment. The report is available in PDF or XLS format.
     * After generating the report, use DownloadUserAssessmentReport to download it in the preferred format.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/datasafe/GenerateUserAssessmentReportExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use GenerateUserAssessmentReport API.
     */
    GenerateUserAssessmentReportResponse generateUserAssessmentReport(
            GenerateUserAssessmentReportRequest request);

    /**
     * Gets the details of the Data Safe configuration.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/datasafe/GetDataSafeConfigurationExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use GetDataSafeConfiguration API.
     */
    GetDataSafeConfigurationResponse getDataSafeConfiguration(
            GetDataSafeConfigurationRequest request);

    /**
     * Gets the details of the specified Data Safe private endpoint.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/datasafe/GetDataSafePrivateEndpointExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use GetDataSafePrivateEndpoint API.
     */
    GetDataSafePrivateEndpointResponse getDataSafePrivateEndpoint(
            GetDataSafePrivateEndpointRequest request);

    /**
     * Gets the details of the specified on-premises connector.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/datasafe/GetOnPremConnectorExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use GetOnPremConnector API.
     */
    GetOnPremConnectorResponse getOnPremConnector(GetOnPremConnectorRequest request);

    /**
     * Gets the details of the specified security assessment.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/datasafe/GetSecurityAssessmentExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use GetSecurityAssessment API.
     */
    GetSecurityAssessmentResponse getSecurityAssessment(GetSecurityAssessmentRequest request);

    /**
     * Gets the details of the comparison report on the security assessments submitted for comparison.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/datasafe/GetSecurityAssessmentComparisonExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use GetSecurityAssessmentComparison API.
     */
    GetSecurityAssessmentComparisonResponse getSecurityAssessmentComparison(
            GetSecurityAssessmentComparisonRequest request);

    /**
     * Returns the details of the specified Data Safe target database.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/datasafe/GetTargetDatabaseExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use GetTargetDatabase API.
     */
    GetTargetDatabaseResponse getTargetDatabase(GetTargetDatabaseRequest request);

    /**
     * Gets a user assessment by identifier.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/datasafe/GetUserAssessmentExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use GetUserAssessment API.
     */
    GetUserAssessmentResponse getUserAssessment(GetUserAssessmentRequest request);

    /**
     * Gets the details of the comparison report for the user assessments provided.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/datasafe/GetUserAssessmentComparisonExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use GetUserAssessmentComparison API.
     */
    GetUserAssessmentComparisonResponse getUserAssessmentComparison(
            GetUserAssessmentComparisonRequest request);

    /**
     * Gets the details of the specified work request.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/datasafe/GetWorkRequestExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use GetWorkRequest API.
     */
    GetWorkRequestResponse getWorkRequest(GetWorkRequestRequest request);

    /**
     * Gets a list of Data Safe private endpoints.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/datasafe/ListDataSafePrivateEndpointsExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use ListDataSafePrivateEndpoints API.
     */
    ListDataSafePrivateEndpointsResponse listDataSafePrivateEndpoints(
            ListDataSafePrivateEndpointsRequest request);

    /**
     * List all the findings from all the targets in the specified assessment.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/datasafe/ListFindingsExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use ListFindings API.
     */
    ListFindingsResponse listFindings(ListFindingsRequest request);

    /**
     * Gets a list of grants for a particular user in the specified user assessment. A user grant contains details such as the
     * privilege name, type, category, and depth level. The depth level indicates how deep in the hierarchy of roles granted to
     * roles a privilege grant is. The userKey in this operation is a system-generated identifier. Perform the operation ListUsers
     * to get the userKey for a particular user.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/datasafe/ListGrantsExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use ListGrants API.
     */
    ListGrantsResponse listGrants(ListGrantsRequest request);

    /**
     * Gets a list of on-premises connectors.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/datasafe/ListOnPremConnectorsExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use ListOnPremConnectors API.
     */
    ListOnPremConnectorsResponse listOnPremConnectors(ListOnPremConnectorsRequest request);

    /**
     * Gets a list of security assessments.
     * <p>
     * The ListSecurityAssessments operation returns only the assessments in the specified `compartmentId`.
     * The list does not include any subcompartments of the compartmentId passed.
     * <p>
     * The parameter `accessLevel` specifies whether to return only those compartments for which the
     * requestor has INSPECT permissions on at least one resource directly
     * or indirectly (ACCESSIBLE) (the resource can be in a subcompartment) or to return Not Authorized if
     * Principal doesn't have access to even one of the child compartments. This is valid only when
     * `compartmentIdInSubtree` is set to `true`.
     * <p>
     * The parameter `compartmentIdInSubtree` applies when you perform ListSecurityAssessments on the
     * `compartmentId` passed and when it is set to true, the entire hierarchy of compartments can be returned.
     * To get a full list of all compartments and subcompartments in the tenancy (root compartment),
     * set the parameter `compartmentIdInSubtree` to true and `accessLevel` to ACCESSIBLE.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/datasafe/ListSecurityAssessmentsExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use ListSecurityAssessments API.
     */
    ListSecurityAssessmentsResponse listSecurityAssessments(ListSecurityAssessmentsRequest request);

    /**
     * Returns the list of registered target databases in Data Safe.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/datasafe/ListTargetDatabasesExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use ListTargetDatabases API.
     */
    ListTargetDatabasesResponse listTargetDatabases(ListTargetDatabasesRequest request);

    /**
     * Gets a list of aggregated user details from the specified user assessment. This provides information about the overall state
     * of database user security.  For example, the user details include how many users have the DBA role and how many users are in
     * the critical category. This data is especially useful content for dashboards or to support analytics.
     * <p>
     * When you perform the ListUserAnalytics operation, if the parameter compartmentIdInSubtree is set to \"true,\" and if the
     * parameter accessLevel is set to ACCESSIBLE, then the operation returns compartments in which the requestor has INSPECT
     * permissions on at least one resource, directly or indirectly (in subcompartments). If the operation is performed at the
     * root compartment. If the requestor does not have access to at least one subcompartment of the compartment specified by
     * compartmentId, then \"Not Authorized\" is returned.
     * <p>
     * The parameter compartmentIdInSubtree applies when you perform ListUserAnalytics on the compartmentId passed and when it is
     * set to true, the entire hierarchy of compartments can be returned.
     * <p>
     * To use ListUserAnalytics to get a full list of all compartments and subcompartments in the tenancy from the root compartment,
     * set the parameter compartmentIdInSubtree to true and accessLevel to ACCESSIBLE.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/datasafe/ListUserAnalyticsExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use ListUserAnalytics API.
     */
    ListUserAnalyticsResponse listUserAnalytics(ListUserAnalyticsRequest request);

    /**
     * Gets a list of user assessments.
     * <p>
     * The ListUserAssessments operation returns only the assessments in the specified `compartmentId`.
     * The list does not include any subcompartments of the compartmentId passed.
     * <p>
     * The parameter `accessLevel` specifies whether to return only those compartments for which the
     * requestor has INSPECT permissions on at least one resource directly
     * or indirectly (ACCESSIBLE) (the resource can be in a subcompartment) or to return Not Authorized if
     * Principal doesn't have access to even one of the child compartments. This is valid only when
     * `compartmentIdInSubtree` is set to `true`.
     * <p>
     * The parameter `compartmentIdInSubtree` applies when you perform ListUserAssessments on the
     * `compartmentId` passed and when it is set to true, the entire hierarchy of compartments can be returned.
     * To get a full list of all compartments and subcompartments in the tenancy (root compartment),
     * set the parameter `compartmentIdInSubtree` to true and `accessLevel` to ACCESSIBLE.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/datasafe/ListUserAssessmentsExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use ListUserAssessments API.
     */
    ListUserAssessmentsResponse listUserAssessments(ListUserAssessmentsRequest request);

    /**
     * Gets a list of users of the specified user assessment. The result contains the database user details for each user, such
     * as user type, account status, last login time, user creation time, authentication type, user profile, and the date and time
     * of the latest password change. It also contains the user category derived from these user details as well as privileges
     * granted to each user.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/datasafe/ListUsersExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use ListUsers API.
     */
    ListUsersResponse listUsers(ListUsersRequest request);

    /**
     * Gets a list of errors for the specified work request.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/datasafe/ListWorkRequestErrorsExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use ListWorkRequestErrors API.
     */
    ListWorkRequestErrorsResponse listWorkRequestErrors(ListWorkRequestErrorsRequest request);

    /**
     * Gets a list of log entries for the specified work request.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/datasafe/ListWorkRequestLogsExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use ListWorkRequestLogs API.
     */
    ListWorkRequestLogsResponse listWorkRequestLogs(ListWorkRequestLogsRequest request);

    /**
     * Gets a list of work requests.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/datasafe/ListWorkRequestsExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use ListWorkRequests API.
     */
    ListWorkRequestsResponse listWorkRequests(ListWorkRequestsRequest request);

    /**
     * Runs a security assessment, refreshes the latest assessment, and saves it for future reference.
     * The assessment runs with a securityAssessmentId of type LATEST. Before you start, first call the ListSecurityAssessments operation with filter \"type = latest\" to get the security assessment id for the target's latest assessment.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/datasafe/RefreshSecurityAssessmentExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use RefreshSecurityAssessment API.
     */
    RefreshSecurityAssessmentResponse refreshSecurityAssessment(
            RefreshSecurityAssessmentRequest request);

    /**
     * Refreshes the latest assessment and saves it for future reference. This operation runs with a userAssessmentId of type LATEST.
     * Before you start, first call the ListUserAssessments operation with filter \"type = latest\" to get the user assessment ID for
     * the target's latest assessment.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/datasafe/RefreshUserAssessmentExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use RefreshUserAssessment API.
     */
    RefreshUserAssessmentResponse refreshUserAssessment(RefreshUserAssessmentRequest request);

    /**
     * Sets the saved security assessment as the baseline in the compartment where the the specified assessment resides. The security assessment needs to be of type 'SAVED'.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/datasafe/SetSecurityAssessmentBaselineExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use SetSecurityAssessmentBaseline API.
     */
    SetSecurityAssessmentBaselineResponse setSecurityAssessmentBaseline(
            SetSecurityAssessmentBaselineRequest request);

    /**
     * Sets the saved user assessment as the baseline in the compartment where the specified assessment resides. The user assessment needs to be of type 'SAVED'.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/datasafe/SetUserAssessmentBaselineExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use SetUserAssessmentBaseline API.
     */
    SetUserAssessmentBaselineResponse setUserAssessmentBaseline(
            SetUserAssessmentBaselineRequest request);

    /**
     * Removes the baseline setting for the saved security assessment. The saved security assessment is no longer considered a baseline.
     * Sets the if-match parameter to the value of the etag from a previous GET or POST response for that resource.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/datasafe/UnsetSecurityAssessmentBaselineExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use UnsetSecurityAssessmentBaseline API.
     */
    UnsetSecurityAssessmentBaselineResponse unsetSecurityAssessmentBaseline(
            UnsetSecurityAssessmentBaselineRequest request);

    /**
     * Removes the baseline setting for the saved user assessment. The saved user assessment is no longer considered a baseline.
     * Sets the if-match parameter to the value of the etag from a previous GET or POST response for that resource.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/datasafe/UnsetUserAssessmentBaselineExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use UnsetUserAssessmentBaseline API.
     */
    UnsetUserAssessmentBaselineResponse unsetUserAssessmentBaseline(
            UnsetUserAssessmentBaselineRequest request);

    /**
     * Updates one or more attributes of the specified Data Safe private endpoint.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/datasafe/UpdateDataSafePrivateEndpointExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use UpdateDataSafePrivateEndpoint API.
     */
    UpdateDataSafePrivateEndpointResponse updateDataSafePrivateEndpoint(
            UpdateDataSafePrivateEndpointRequest request);

    /**
     * Updates one or more attributes of the specified on-premises connector.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/datasafe/UpdateOnPremConnectorExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use UpdateOnPremConnector API.
     */
    UpdateOnPremConnectorResponse updateOnPremConnector(UpdateOnPremConnectorRequest request);

    /**
     * Updates the wallet for the specified on-premises connector to a new version.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/datasafe/UpdateOnPremConnectorWalletExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use UpdateOnPremConnectorWallet API.
     */
    UpdateOnPremConnectorWalletResponse updateOnPremConnectorWallet(
            UpdateOnPremConnectorWalletRequest request);

    /**
     * Updates one or more attributes of the specified security assessment. This operation allows to update the security assessment displayName, description, or schedule.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/datasafe/UpdateSecurityAssessmentExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use UpdateSecurityAssessment API.
     */
    UpdateSecurityAssessmentResponse updateSecurityAssessment(
            UpdateSecurityAssessmentRequest request);

    /**
     * Updates one or more attributes of the specified Data Safe target database.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/datasafe/UpdateTargetDatabaseExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use UpdateTargetDatabase API.
     */
    UpdateTargetDatabaseResponse updateTargetDatabase(UpdateTargetDatabaseRequest request);

    /**
     * Updates one or more attributes of the specified user assessment. This operation allows to update the user assessment displayName, description, or schedule.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/datasafe/UpdateUserAssessmentExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use UpdateUserAssessment API.
     */
    UpdateUserAssessmentResponse updateUserAssessment(UpdateUserAssessmentRequest request);

    /**
     * Gets the pre-configured waiters available for resources for this service.
     *
     * @return The service waiters.
     */
    DataSafeWaiters getWaiters();

    /**
     * Gets the pre-configured paginators available for list operations in this service which may return multiple
     * pages of data. These paginators provide an {@link java.lang.Iterable} interface so that service responses, or
     * resources/records, can be iterated through without having to manually deal with pagination and page tokens.
     *
     * @return The service paginators.
     */
    DataSafePaginators getPaginators();
}

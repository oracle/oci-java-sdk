/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.databasemigration;

import com.oracle.bmc.databasemigration.requests.*;
import com.oracle.bmc.databasemigration.responses.*;

/**
 * Use the Oracle Cloud Infrastructure Database Migration APIs to perform database migration operations.
 * This service client uses CircuitBreakerUtils.DEFAULT_CIRCUIT_BREAKER for all the operations by default if no circuit breaker configuration is defined by the user.
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20230518")
public interface DatabaseMigration extends AutoCloseable {

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
     * Aborts a Migration Job (either Evaluation or Migration).
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation uses RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is provided.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/databasemigration/AbortJobExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use AbortJob API.
     */
    AbortJobResponse abortJob(AbortJobRequest request);

    /**
     * Add excluded/included object to the list.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation uses RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is provided.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/databasemigration/AddAssessmentObjectsExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use AddAssessmentObjects API.
     */
    AddAssessmentObjectsResponse addAssessmentObjects(AddAssessmentObjectsRequest request);

    /**
     * Add excluded/included object to the list.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation uses RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is provided.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/databasemigration/AddMigrationObjectsExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use AddMigrationObjects API.
     */
    AddMigrationObjectsResponse addMigrationObjects(AddMigrationObjectsRequest request);

    /**
     * Used to change the Assessment compartment.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation uses RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is provided.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/databasemigration/ChangeAssessmentCompartmentExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use ChangeAssessmentCompartment API.
     */
    ChangeAssessmentCompartmentResponse changeAssessmentCompartment(
            ChangeAssessmentCompartmentRequest request);

    /**
     * Used to change the Database Connection compartment.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation uses RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is provided.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/databasemigration/ChangeConnectionCompartmentExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use ChangeConnectionCompartment API.
     */
    ChangeConnectionCompartmentResponse changeConnectionCompartment(
            ChangeConnectionCompartmentRequest request);

    /**
     * Used to change the Migration compartment.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation uses RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is provided.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/databasemigration/ChangeMigrationCompartmentExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use ChangeMigrationCompartment API.
     */
    ChangeMigrationCompartmentResponse changeMigrationCompartment(
            ChangeMigrationCompartmentRequest request);

    /**
     * Clone a configuration from an existing Assessment.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation uses RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is provided.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/databasemigration/CloneAssessmentExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use CloneAssessment API.
     */
    CloneAssessmentResponse cloneAssessment(CloneAssessmentRequest request);

    /**
     * Clone a configuration from an existing Migration.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation uses RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is provided.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/databasemigration/CloneMigrationExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use CloneMigration API.
     */
    CloneMigrationResponse cloneMigration(CloneMigrationRequest request);

    /**
     * Collects the DB trace and alert logs.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation uses RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is provided.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/databasemigration/CollectTracesExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use CollectTraces API.
     */
    CollectTracesResponse collectTraces(CollectTracesRequest request);

    /**
     * Perform connection test for a database connection.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation uses RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is provided.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/databasemigration/ConnectionDiagnosticsExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use ConnectionDiagnostics API.
     */
    ConnectionDiagnosticsResponse connectionDiagnostics(ConnectionDiagnosticsRequest request);

    /**
     * Create an Assessment resource that contains all the details to perform the
     * database assessment operation, such as source and destination database
     * details, network throughput, accepted downtime etc.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation uses RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is provided.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/databasemigration/CreateAssessmentExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use CreateAssessment API.
     */
    CreateAssessmentResponse createAssessment(CreateAssessmentRequest request);

    /**
     * Create a Database Connection resource that contains the details to connect to either a Source or Target Database
     * in the migration.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation uses RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is provided.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/databasemigration/CreateConnectionExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use CreateConnection API.
     */
    CreateConnectionResponse createConnection(CreateConnectionRequest request);

    /**
     * Create a Migration resource that contains all the details to perform the
     * database migration operation, such as source and destination database
     * details, credentials, etc.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation uses RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is provided.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/databasemigration/CreateMigrationExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use CreateMigration API.
     */
    CreateMigrationResponse createMigration(CreateMigrationRequest request);

    /**
     * Creates a new version of the current parameter file contents to the specified value.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation uses RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is provided.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/databasemigration/CreateParameterFileVersionExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use CreateParameterFileVersion API.
     */
    CreateParameterFileVersionResponse createParameterFileVersion(
            CreateParameterFileVersionRequest request);

    /**
     * Deletes the Assessment represented by the specified assessment ID.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation uses RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is provided.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/databasemigration/DeleteAssessmentExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use DeleteAssessment API.
     */
    DeleteAssessmentResponse deleteAssessment(DeleteAssessmentRequest request);

    /**
     * Deletes the Database Connection represented by the specified connection ID.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation uses RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is provided.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/databasemigration/DeleteConnectionExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use DeleteConnection API.
     */
    DeleteConnectionResponse deleteConnection(DeleteConnectionRequest request);

    /**
     * Deletes the migration job represented by the given job ID.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation uses RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is provided.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/databasemigration/DeleteJobExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use DeleteJob API.
     */
    DeleteJobResponse deleteJob(DeleteJobRequest request);

    /**
     * Deletes the Migration represented by the specified migration ID.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation uses RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is provided.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/databasemigration/DeleteMigrationExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use DeleteMigration API.
     */
    DeleteMigrationResponse deleteMigration(DeleteMigrationRequest request);

    /**
     * Deletes the given parameter file version
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation uses RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is provided.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/databasemigration/DeleteParameterFileVersionExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use DeleteParameterFileVersion API.
     */
    DeleteParameterFileVersionResponse deleteParameterFileVersion(
            DeleteParameterFileVersionRequest request);

    /**
     * Start Validate Migration job.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation uses RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is provided.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/databasemigration/EvaluateMigrationExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use EvaluateMigration API.
     */
    EvaluateMigrationResponse evaluateMigration(EvaluateMigrationRequest request);

    /**
     * Get the Pre-Migration Advisor report details
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation uses RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is provided.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/databasemigration/GetAdvisorReportExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use GetAdvisorReport API.
     */
    GetAdvisorReportResponse getAdvisorReport(GetAdvisorReportRequest request);

    /**
     * Display Assessment details.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation uses RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is provided.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/databasemigration/GetAssessmentExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use GetAssessment API.
     */
    GetAssessmentResponse getAssessment(GetAssessmentRequest request);

    /**
     * Display Assessor details.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation uses RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is provided.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/databasemigration/GetAssessorExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use GetAssessor API.
     */
    GetAssessorResponse getAssessor(GetAssessorRequest request);

    /**
     * Get Assessor Check details.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation uses RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is provided.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/databasemigration/GetAssessorCheckExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use GetAssessorCheck API.
     */
    GetAssessorCheckResponse getAssessorCheck(GetAssessorCheckRequest request);

    /**
     * Display Database Connection details.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation uses RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is provided.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/databasemigration/GetConnectionExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use GetConnection API.
     */
    GetConnectionResponse getConnection(GetConnectionRequest request);

    /**
     * Get a migration job.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation uses RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is provided.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/databasemigration/GetJobExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use GetJob API.
     */
    GetJobResponse getJob(GetJobRequest request);

    /**
     * Get the migration Job Output content as a String.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation uses RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is provided.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/databasemigration/GetJobOutputContentExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use GetJobOutputContent API.
     */
    GetJobOutputContentResponse getJobOutputContent(GetJobOutputContentRequest request);

    /**
     * Display Migration details.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation uses RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is provided.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/databasemigration/GetMigrationExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use GetMigration API.
     */
    GetMigrationResponse getMigration(GetMigrationRequest request);

    /**
     * Obtain the parameter file version contents for the specified parameter file name and the associated job. This operation will
     * be allowed only if the job is certain acceptable lifecycle states.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation uses RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is provided.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/databasemigration/GetParameterFileVersionExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use GetParameterFileVersion API.
     */
    GetParameterFileVersionResponse getParameterFileVersion(GetParameterFileVersionRequest request);

    /**
     * Download DMS script.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation uses RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is provided.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/databasemigration/GetScriptExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use GetScript API.
     */
    GetScriptResponse getScript(GetScriptRequest request);

    /**
     * Gets the details of a work request.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation uses RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is provided.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/databasemigration/GetWorkRequestExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use GetWorkRequest API.
     */
    GetWorkRequestResponse getWorkRequest(GetWorkRequestRequest request);

    /**
     * Get the Pre-Migration extended Advisor report object list.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation uses RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is provided.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/databasemigration/ListAdvisorReportCheckObjectsExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use ListAdvisorReportCheckObjects API.
     */
    ListAdvisorReportCheckObjectsResponse listAdvisorReportCheckObjects(
            ListAdvisorReportCheckObjectsRequest request);

    /**
     * List of Pre-Migration checks from the advisor.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation uses RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is provided.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/databasemigration/ListAdvisorReportChecksExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use ListAdvisorReportChecks API.
     */
    ListAdvisorReportChecksResponse listAdvisorReportChecks(ListAdvisorReportChecksRequest request);

    /**
     * Display Check Affected objects.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation uses RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is provided.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/databasemigration/ListAffectedObjectsExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use ListAffectedObjects API.
     */
    ListAffectedObjectsResponse listAffectedObjects(ListAffectedObjectsRequest request);

    /**
     * Display sample object types to exclude or include for an Assessment.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation uses RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is provided.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/databasemigration/ListAssessmentObjectTypesExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use ListAssessmentObjectTypes API.
     */
    ListAssessmentObjectTypesResponse listAssessmentObjectTypes(
            ListAssessmentObjectTypesRequest request);

    /**
     * Display excluded/included objects.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation uses RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is provided.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/databasemigration/ListAssessmentObjectsExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use ListAssessmentObjects API.
     */
    ListAssessmentObjectsResponse listAssessmentObjects(ListAssessmentObjectsRequest request);

    /**
     * List all Assessments.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation uses RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is provided.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/databasemigration/ListAssessmentsExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use ListAssessments API.
     */
    ListAssessmentsResponse listAssessments(ListAssessmentsRequest request);

    /**
     * List Assessor Check Summaries.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation uses RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is provided.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/databasemigration/ListAssessorChecksExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use ListAssessorChecks API.
     */
    ListAssessorChecksResponse listAssessorChecks(ListAssessorChecksRequest request);

    /**
     * List all Assessors.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation uses RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is provided.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/databasemigration/ListAssessorsExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use ListAssessors API.
     */
    ListAssessorsResponse listAssessors(ListAssessorsRequest request);

    /**
     * List all Database Connections.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation uses RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is provided.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/databasemigration/ListConnectionsExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use ListConnections API.
     */
    ListConnectionsResponse listConnections(ListConnectionsRequest request);

    /**
     * List supported Database Types, Sub-types and Versions.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation uses RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is provided.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/databasemigration/ListDatabaseConnectionTypeExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use ListDatabaseConnectionType API.
     */
    ListDatabaseConnectionTypeResponse listDatabaseConnectionType(
            ListDatabaseConnectionTypeRequest request);

    /**
     * List the excluded database objects.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation uses RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is provided.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/databasemigration/ListExcludedObjectsExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use ListExcludedObjects API.
     */
    ListExcludedObjectsResponse listExcludedObjects(ListExcludedObjectsRequest request);

    /**
     * List the Job Outputs
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation uses RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is provided.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/databasemigration/ListJobOutputsExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use ListJobOutputs API.
     */
    ListJobOutputsResponse listJobOutputs(ListJobOutputsRequest request);

    /**
     * List all the names of the Migration jobs associated to the specified
     * migration site.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation uses RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is provided.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/databasemigration/ListJobsExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use ListJobs API.
     */
    ListJobsResponse listJobs(ListJobsRequest request);

    /**
     * Display sample object types to exclude or include for a Migration.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation uses RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is provided.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/databasemigration/ListMigrationObjectTypesExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use ListMigrationObjectTypes API.
     */
    ListMigrationObjectTypesResponse listMigrationObjectTypes(
            ListMigrationObjectTypesRequest request);

    /**
     * Display excluded/included objects.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation uses RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is provided.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/databasemigration/ListMigrationObjectsExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use ListMigrationObjects API.
     */
    ListMigrationObjectsResponse listMigrationObjects(ListMigrationObjectsRequest request);

    /**
     * List of parameters that can be used to customize migrations.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation uses RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is provided.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/databasemigration/ListMigrationParametersExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use ListMigrationParameters API.
     */
    ListMigrationParametersResponse listMigrationParameters(ListMigrationParametersRequest request);

    /**
     * List all Migrations.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation uses RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is provided.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/databasemigration/ListMigrationsExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use ListMigrations API.
     */
    ListMigrationsResponse listMigrations(ListMigrationsRequest request);

    /**
     * Return a list of the parameter file metadata of the migration execution of the specified job.  This will
     * only be acceptable if the job is in particular state. It will be accessible if the job is in
     * the FAILED, PAUSED or SUSPENDED state.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation uses RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is provided.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/databasemigration/ListParameterFileVersionsExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use ListParameterFileVersions API.
     */
    ListParameterFileVersionsResponse listParameterFileVersions(
            ListParameterFileVersionsRequest request);

    /**
     * Gets the errors for a work request.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation uses RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is provided.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/databasemigration/ListWorkRequestErrorsExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use ListWorkRequestErrors API.
     */
    ListWorkRequestErrorsResponse listWorkRequestErrors(ListWorkRequestErrorsRequest request);

    /**
     * Gets the logs for a work request.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation uses RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is provided.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/databasemigration/ListWorkRequestLogsExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use ListWorkRequestLogs API.
     */
    ListWorkRequestLogsResponse listWorkRequestLogs(ListWorkRequestLogsRequest request);

    /**
     * Lists the work requests in a compartment or for a specified resource.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation uses RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is provided.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/databasemigration/ListWorkRequestsExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use ListWorkRequests API.
     */
    ListWorkRequestsResponse listWorkRequests(ListWorkRequestsRequest request);

    /**
     * Make current the given parameter file version
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation uses RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is provided.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/databasemigration/MakeCurrentParameterFileVersionExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use MakeCurrentParameterFileVersion API.
     */
    MakeCurrentParameterFileVersionResponse makeCurrentParameterFileVersion(
            MakeCurrentParameterFileVersionRequest request);

    /**
     * Assessor Action.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation uses RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is provided.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/databasemigration/PerformAssessorActionExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use PerformAssessorAction API.
     */
    PerformAssessorActionResponse performAssessorAction(PerformAssessorActionRequest request);

    /**
     * Download SQL script Assessor Action.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation uses RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is provided.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/databasemigration/PerformAssessorActionDownloadSqlExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use PerformAssessorActionDownloadSql API.
     */
    PerformAssessorActionDownloadSqlResponse performAssessorActionDownloadSql(
            PerformAssessorActionDownloadSqlRequest request);

    /**
     * Assessor Check Action.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation uses RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is provided.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/databasemigration/PerformAssessorCheckActionExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use PerformAssessorCheckAction API.
     */
    PerformAssessorCheckActionResponse performAssessorCheckAction(
            PerformAssessorCheckActionRequest request);

    /**
     * Remove excluded/included objects.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation uses RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is provided.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/databasemigration/RemoveAssessmentObjectsExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use RemoveAssessmentObjects API.
     */
    RemoveAssessmentObjectsResponse removeAssessmentObjects(RemoveAssessmentObjectsRequest request);

    /**
     * Remove excluded/included objects.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation uses RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is provided.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/databasemigration/RemoveMigrationObjectsExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use RemoveMigrationObjects API.
     */
    RemoveMigrationObjectsResponse removeMigrationObjects(RemoveMigrationObjectsRequest request);

    /**
     * Resume a migration Job.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation uses RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is provided.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/databasemigration/ResumeJobExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use ResumeJob API.
     */
    ResumeJobResponse resumeJob(ResumeJobRequest request);

    /**
     * Display Migration Phases for a specified migration.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation uses RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is provided.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/databasemigration/RetrieveSupportedPhasesExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use RetrieveSupportedPhases API.
     */
    RetrieveSupportedPhasesResponse retrieveSupportedPhases(RetrieveSupportedPhasesRequest request);

    /**
     * Start Migration job.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation uses RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is provided.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/databasemigration/StartMigrationExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use StartMigration API.
     */
    StartMigrationResponse startMigration(StartMigrationRequest request);

    /**
     * Place the currently executing migration Job in a Suspended State.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation uses RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is provided.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/databasemigration/SuspendJobExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use SuspendJob API.
     */
    SuspendJobResponse suspendJob(SuspendJobRequest request);

    /**
     * Update the premigration extended Advisor report check.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation uses RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is provided.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/databasemigration/UpdateAdvisorReportCheckExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use UpdateAdvisorReportCheck API.
     */
    UpdateAdvisorReportCheckResponse updateAdvisorReportCheck(
            UpdateAdvisorReportCheckRequest request);

    /**
     * Update the Pre-Migration extended Advisor report object list.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation uses RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is provided.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/databasemigration/UpdateAdvisorReportCheckObjectsExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use UpdateAdvisorReportCheckObjects API.
     */
    UpdateAdvisorReportCheckObjectsResponse updateAdvisorReportCheckObjects(
            UpdateAdvisorReportCheckObjectsRequest request);

    /**
     * Update Assessment resource details.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation uses RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is provided.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/databasemigration/UpdateAssessmentExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use UpdateAssessment API.
     */
    UpdateAssessmentResponse updateAssessment(UpdateAssessmentRequest request);

    /**
     * Update the advisor report object list.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation uses RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is provided.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/databasemigration/UpdateCheckActionUpdateObjectExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use UpdateCheckActionUpdateObject API.
     */
    UpdateCheckActionUpdateObjectResponse updateCheckActionUpdateObject(
            UpdateCheckActionUpdateObjectRequest request);

    /**
     * Update Database Connection resource details.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation uses RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is provided.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/databasemigration/UpdateConnectionExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use UpdateConnection API.
     */
    UpdateConnectionResponse updateConnection(UpdateConnectionRequest request);

    /**
     * Update Migration Job resource details.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation uses RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is provided.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/databasemigration/UpdateJobExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use UpdateJob API.
     */
    UpdateJobResponse updateJob(UpdateJobRequest request);

    /**
     * Update Migration resource details.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation uses RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is provided.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/databasemigration/UpdateMigrationExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use UpdateMigration API.
     */
    UpdateMigrationResponse updateMigration(UpdateMigrationRequest request);

    /**
     * Gets the pre-configured waiters available for resources for this service.
     *
     * @return The service waiters.
     */
    DatabaseMigrationWaiters getWaiters();

    /**
     * Gets the pre-configured paginators available for list operations in this service which may return multiple
     * pages of data. These paginators provide an {@link java.lang.Iterable} interface so that service responses, or
     * resources/records, can be iterated through without having to manually deal with pagination and page tokens.
     *
     * @return The service paginators.
     */
    DatabaseMigrationPaginators getPaginators();
}

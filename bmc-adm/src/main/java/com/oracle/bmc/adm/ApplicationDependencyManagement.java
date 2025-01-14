/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.adm;

import com.oracle.bmc.adm.requests.*;
import com.oracle.bmc.adm.responses.*;

/**
 * Use the Application Dependency Management API to create knowledge bases and vulnerability audits.
 * For more information, see
 * [ADM](https://docs.cloud.oracle.com/Content/application-dependency-management/home.htm). This
 * service client uses CircuitBreakerUtils.DEFAULT_CIRCUIT_BREAKER for all the operations by default
 * if no circuit breaker configuration is defined by the user.
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20220421")
public interface ApplicationDependencyManagement extends AutoCloseable {

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
     * Activates the specified Remediation Recipe.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/adm/ActivateRemediationRecipeExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     ActivateRemediationRecipe API.
     */
    ActivateRemediationRecipeResponse activateRemediationRecipe(
            ActivateRemediationRecipeRequest request);

    /**
     * Cancels the specified remediation run.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/adm/CancelRemediationRunExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     CancelRemediationRun API.
     */
    CancelRemediationRunResponse cancelRemediationRun(CancelRemediationRunRequest request);

    /**
     * Cancel work request with the given ID.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/adm/CancelWorkRequestExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use CancelWorkRequest
     *     API.
     */
    CancelWorkRequestResponse cancelWorkRequest(CancelWorkRequestRequest request);

    /**
     * Moves a Knowledge Base from one compartment to another.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/adm/ChangeKnowledgeBaseCompartmentExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     ChangeKnowledgeBaseCompartment API.
     */
    ChangeKnowledgeBaseCompartmentResponse changeKnowledgeBaseCompartment(
            ChangeKnowledgeBaseCompartmentRequest request);

    /**
     * Moves a Remediation Recipe from one compartment to another.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/adm/ChangeRemediationRecipeCompartmentExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     ChangeRemediationRecipeCompartment API.
     */
    ChangeRemediationRecipeCompartmentResponse changeRemediationRecipeCompartment(
            ChangeRemediationRecipeCompartmentRequest request);

    /**
     * Moves a remediation run from one compartment to another.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/adm/ChangeRemediationRunCompartmentExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     ChangeRemediationRunCompartment API.
     */
    ChangeRemediationRunCompartmentResponse changeRemediationRunCompartment(
            ChangeRemediationRunCompartmentRequest request);

    /**
     * Moves a Vulnerability Audit from one compartment to another.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/adm/ChangeVulnerabilityAuditCompartmentExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     ChangeVulnerabilityAuditCompartment API.
     */
    ChangeVulnerabilityAuditCompartmentResponse changeVulnerabilityAuditCompartment(
            ChangeVulnerabilityAuditCompartmentRequest request);

    /**
     * Creates a new Knowledge Base.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/adm/CreateKnowledgeBaseExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use CreateKnowledgeBase
     *     API.
     */
    CreateKnowledgeBaseResponse createKnowledgeBase(CreateKnowledgeBaseRequest request);

    /**
     * Creates a new Remediation Recipe.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/adm/CreateRemediationRecipeExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     CreateRemediationRecipe API.
     */
    CreateRemediationRecipeResponse createRemediationRecipe(CreateRemediationRecipeRequest request);

    /**
     * Creates a new remediation run.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/adm/CreateRemediationRunExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     CreateRemediationRun API.
     */
    CreateRemediationRunResponse createRemediationRun(CreateRemediationRunRequest request);

    /**
     * Creates a new Vulnerability Audit by providing a tree of Application Dependencies.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/adm/CreateVulnerabilityAuditExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     CreateVulnerabilityAudit API.
     */
    CreateVulnerabilityAuditResponse createVulnerabilityAudit(
            CreateVulnerabilityAuditRequest request);

    /**
     * Deactivates the specified Remediation Recipe.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/adm/DeactivateRemediationRecipeExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     DeactivateRemediationRecipe API.
     */
    DeactivateRemediationRecipeResponse deactivateRemediationRecipe(
            DeactivateRemediationRecipeRequest request);

    /**
     * Deletes the specified Knowledge Base.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/adm/DeleteKnowledgeBaseExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use DeleteKnowledgeBase
     *     API.
     */
    DeleteKnowledgeBaseResponse deleteKnowledgeBase(DeleteKnowledgeBaseRequest request);

    /**
     * Deletes the specified Remediation Recipe.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/adm/DeleteRemediationRecipeExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     DeleteRemediationRecipe API.
     */
    DeleteRemediationRecipeResponse deleteRemediationRecipe(DeleteRemediationRecipeRequest request);

    /**
     * Deletes the specified remediation run.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/adm/DeleteRemediationRunExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     DeleteRemediationRun API.
     */
    DeleteRemediationRunResponse deleteRemediationRun(DeleteRemediationRunRequest request);

    /**
     * Deletes the specified Vulnerability Audit.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/adm/DeleteVulnerabilityAuditExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     DeleteVulnerabilityAudit API.
     */
    DeleteVulnerabilityAuditResponse deleteVulnerabilityAudit(
            DeleteVulnerabilityAuditRequest request);

    /**
     * Returns the details of the specified Knowledge Base.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/adm/GetKnowledgeBaseExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use GetKnowledgeBase
     *     API.
     */
    GetKnowledgeBaseResponse getKnowledgeBase(GetKnowledgeBaseRequest request);

    /**
     * Returns the details of the specified RemediationRecipe.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/adm/GetRemediationRecipeExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     GetRemediationRecipe API.
     */
    GetRemediationRecipeResponse getRemediationRecipe(GetRemediationRecipeRequest request);

    /**
     * Returns the details of the specified remediation run.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/adm/GetRemediationRunExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use GetRemediationRun
     *     API.
     */
    GetRemediationRunResponse getRemediationRun(GetRemediationRunRequest request);

    /**
     * Returns the details of the specified Remediation Run Stage.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/adm/GetStageExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use GetStage API.
     */
    GetStageResponse getStage(GetStageRequest request);

    /**
     * Returns the details of the specified Vulnerability Audit.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/adm/GetVulnerabilityAuditExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     GetVulnerabilityAudit API.
     */
    GetVulnerabilityAuditResponse getVulnerabilityAudit(GetVulnerabilityAuditRequest request);

    /**
     * Gets the status of the work request with the given ID.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/adm/GetWorkRequestExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use GetWorkRequest API.
     */
    GetWorkRequestResponse getWorkRequest(GetWorkRequestRequest request);

    /**
     * Returns a list of application dependency with their associated recommendations.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/adm/ListApplicationDependencyRecommendationsExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     ListApplicationDependencyRecommendations API.
     */
    ListApplicationDependencyRecommendationsResponse listApplicationDependencyRecommendations(
            ListApplicationDependencyRecommendationsRequest request);

    /**
     * Returns a list of Application Dependencies with their associated vulnerabilities.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/adm/ListApplicationDependencyVulnerabilitiesExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     ListApplicationDependencyVulnerabilities API.
     */
    ListApplicationDependencyVulnerabilitiesResponse listApplicationDependencyVulnerabilities(
            ListApplicationDependencyVulnerabilitiesRequest request);

    /**
     * Returns a list of KnowledgeBases based on the specified query parameters. At least id or
     * compartmentId query parameter must be provided.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/adm/ListKnowledgeBasesExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use ListKnowledgeBases
     *     API.
     */
    ListKnowledgeBasesResponse listKnowledgeBases(ListKnowledgeBasesRequest request);

    /**
     * Returns a list of Remediation Recipes based on the specified query parameters. The query
     * parameters `compartmentId` or `id` must be provided.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/adm/ListRemediationRecipesExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     ListRemediationRecipes API.
     */
    ListRemediationRecipesResponse listRemediationRecipes(ListRemediationRecipesRequest request);

    /**
     * Returns a list of remediation runs contained by a compartment. The query parameter
     * `compartmentId` is required unless the query parameter `id` is specified.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/adm/ListRemediationRunsExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use ListRemediationRuns
     *     API.
     */
    ListRemediationRunsResponse listRemediationRuns(ListRemediationRunsRequest request);

    /**
     * Returns a list of Remediation Run Stages based on the specified query parameters and
     * Remediation Run identifier.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/adm/ListStagesExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use ListStages API.
     */
    ListStagesResponse listStages(ListStagesRequest request);

    /**
     * Returns a list of Vulnerability Audits based on the specified query parameters. At least one
     * of id, compartmentId query parameter must be provided.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/adm/ListVulnerabilityAuditsExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     ListVulnerabilityAudits API.
     */
    ListVulnerabilityAuditsResponse listVulnerabilityAudits(ListVulnerabilityAuditsRequest request);

    /**
     * Return a (paginated) list of errors for a given work request.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/adm/ListWorkRequestErrorsExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     ListWorkRequestErrors API.
     */
    ListWorkRequestErrorsResponse listWorkRequestErrors(ListWorkRequestErrorsRequest request);

    /**
     * Return a (paginated) list of logs for a given work request.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/adm/ListWorkRequestLogsExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use ListWorkRequestLogs
     *     API.
     */
    ListWorkRequestLogsResponse listWorkRequestLogs(ListWorkRequestLogsRequest request);

    /**
     * Lists the work requests in a compartment.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/adm/ListWorkRequestsExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use ListWorkRequests
     *     API.
     */
    ListWorkRequestsResponse listWorkRequests(ListWorkRequestsRequest request);

    /**
     * Updates one or more attributes of the specified Knowledge Base.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/adm/UpdateKnowledgeBaseExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use UpdateKnowledgeBase
     *     API.
     */
    UpdateKnowledgeBaseResponse updateKnowledgeBase(UpdateKnowledgeBaseRequest request);

    /**
     * Updates one or more attributes of the specified Remediation Recipe.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/adm/UpdateRemediationRecipeExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     UpdateRemediationRecipe API.
     */
    UpdateRemediationRecipeResponse updateRemediationRecipe(UpdateRemediationRecipeRequest request);

    /**
     * Updates by identifier one or more attributes of the specified remediation run.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/adm/UpdateRemediationRunExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     UpdateRemediationRun API.
     */
    UpdateRemediationRunResponse updateRemediationRun(UpdateRemediationRunRequest request);

    /**
     * Updates one or more attributes of the specified Vulnerability Audit.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/adm/UpdateVulnerabilityAuditExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     UpdateVulnerabilityAudit API.
     */
    UpdateVulnerabilityAuditResponse updateVulnerabilityAudit(
            UpdateVulnerabilityAuditRequest request);

    /**
     * Gets the pre-configured waiters available for resources for this service.
     *
     * @return The service waiters.
     */
    ApplicationDependencyManagementWaiters getWaiters();

    /**
     * Gets the pre-configured paginators available for list operations in this service which may
     * return multiple pages of data. These paginators provide an {@link java.lang.Iterable}
     * interface so that service responses, or resources/records, can be iterated through without
     * having to manually deal with pagination and page tokens.
     *
     * @return The service paginators.
     */
    ApplicationDependencyManagementPaginators getPaginators();
}

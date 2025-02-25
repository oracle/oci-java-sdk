/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.governancerulescontrolplane;

import com.oracle.bmc.governancerulescontrolplane.requests.*;
import com.oracle.bmc.governancerulescontrolplane.responses.*;

/**
 * A description of the GovernanceRulesControlPlane API
 * This service client uses CircuitBreakerUtils.DEFAULT_CIRCUIT_BREAKER for all the operations by default if no circuit breaker configuration is defined by the user.
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20220504")
public interface GovernanceRule extends AutoCloseable {

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
     * Create governance rule in the root compartment only. Either relatedResourceId or template must be supplied.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation will not retry by default, users can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to enable retries for it.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/governancerulescontrolplane/CreateGovernanceRuleExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use CreateGovernanceRule API.
     */
    CreateGovernanceRuleResponse createGovernanceRule(CreateGovernanceRuleRequest request);

    /**
     * Create inclusion criterion of type tenancy or tag for the governance rule.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation will not retry by default, users can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to enable retries for it.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/governancerulescontrolplane/CreateInclusionCriterionExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use CreateInclusionCriterion API.
     */
    CreateInclusionCriterionResponse createInclusionCriterion(
            CreateInclusionCriterionRequest request);

    /**
     * Delete the specified governance rule.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation will not retry by default, users can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to enable retries for it.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/governancerulescontrolplane/DeleteGovernanceRuleExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use DeleteGovernanceRule API.
     */
    DeleteGovernanceRuleResponse deleteGovernanceRule(DeleteGovernanceRuleRequest request);

    /**
     * Delete the specified inclusion criterion.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation will not retry by default, users can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to enable retries for it.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/governancerulescontrolplane/DeleteInclusionCriterionExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use DeleteInclusionCriterion API.
     */
    DeleteInclusionCriterionResponse deleteInclusionCriterion(
            DeleteInclusionCriterionRequest request);

    /**
     * Get the specified enforced governance rule's information.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation will not retry by default, users can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to enable retries for it.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/governancerulescontrolplane/GetEnforcedGovernanceRuleExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use GetEnforcedGovernanceRule API.
     */
    GetEnforcedGovernanceRuleResponse getEnforcedGovernanceRule(
            GetEnforcedGovernanceRuleRequest request);

    /**
     * Get the specified governance rule's information.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation will not retry by default, users can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to enable retries for it.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/governancerulescontrolplane/GetGovernanceRuleExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use GetGovernanceRule API.
     */
    GetGovernanceRuleResponse getGovernanceRule(GetGovernanceRuleRequest request);

    /**
     * Get the specified inclusion criterion's information.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation will not retry by default, users can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to enable retries for it.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/governancerulescontrolplane/GetInclusionCriterionExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use GetInclusionCriterion API.
     */
    GetInclusionCriterionResponse getInclusionCriterion(GetInclusionCriterionRequest request);

    /**
     * Get the specified tenancy attachment's information.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation will not retry by default, users can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to enable retries for it.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/governancerulescontrolplane/GetTenancyAttachmentExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use GetTenancyAttachment API.
     */
    GetTenancyAttachmentResponse getTenancyAttachment(GetTenancyAttachmentRequest request);

    /**
     * List enforced governance rules. Either compartment id or enforced governance rule id must be supplied.
     * An optional governance rule type or a display name can also be supplied.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation will not retry by default, users can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to enable retries for it.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/governancerulescontrolplane/ListEnforcedGovernanceRulesExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use ListEnforcedGovernanceRules API.
     */
    ListEnforcedGovernanceRulesResponse listEnforcedGovernanceRules(
            ListEnforcedGovernanceRulesRequest request);

    /**
     * List governance rules. Either compartment id or governance rule id must be supplied.
     * An optional lifecycle state, display name or a governance rule type can also be supplied.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation will not retry by default, users can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to enable retries for it.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/governancerulescontrolplane/ListGovernanceRulesExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use ListGovernanceRules API.
     */
    ListGovernanceRulesResponse listGovernanceRules(ListGovernanceRulesRequest request);

    /**
     * List inclusion criteria associated with a governance rule. Governance rule id must be supplied.
     * An optional inclusion criterion id or a lifecycle state can also be supplied.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation will not retry by default, users can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to enable retries for it.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/governancerulescontrolplane/ListInclusionCriteriaExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use ListInclusionCriteria API.
     */
    ListInclusionCriteriaResponse listInclusionCriteria(ListInclusionCriteriaRequest request);

    /**
     * List tenancy attachments. Either compartment id, governance rule id or tenancy attachment id must be supplied.
     * An optional lifecycle state or a child tenancy id can also be supplied.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation will not retry by default, users can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to enable retries for it.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/governancerulescontrolplane/ListTenancyAttachmentsExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use ListTenancyAttachments API.
     */
    ListTenancyAttachmentsResponse listTenancyAttachments(ListTenancyAttachmentsRequest request);

    /**
     * Retry the creation of the specified governance rule.
     * Used by the tenancy admins when all the workflow retries have exhausted.
     * When provided, If-Match is checked against ETag values of the resource.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation will not retry by default, users can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to enable retries for it.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/governancerulescontrolplane/RetryGovernanceRuleExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use RetryGovernanceRule API.
     */
    RetryGovernanceRuleResponse retryGovernanceRule(RetryGovernanceRuleRequest request);

    /**
     * Retry governance rule application for the specified tenancy attachment id.
     * Used by the tenancy admins when all the workflow retries have exhausted.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation will not retry by default, users can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to enable retries for it.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/governancerulescontrolplane/RetryTenancyAttachmentExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use RetryTenancyAttachment API.
     */
    RetryTenancyAttachmentResponse retryTenancyAttachment(RetryTenancyAttachmentRequest request);

    /**
     * Update the specified governance rule.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation will not retry by default, users can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to enable retries for it.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/governancerulescontrolplane/UpdateGovernanceRuleExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use UpdateGovernanceRule API.
     */
    UpdateGovernanceRuleResponse updateGovernanceRule(UpdateGovernanceRuleRequest request);

    /**
     * Gets the pre-configured waiters available for resources for this service.
     *
     * @return The service waiters.
     */
    GovernanceRuleWaiters getWaiters();

    /**
     * Gets the pre-configured paginators available for list operations in this service which may return multiple
     * pages of data. These paginators provide an {@link java.lang.Iterable} interface so that service responses, or
     * resources/records, can be iterated through without having to manually deal with pagination and page tokens.
     *
     * @return The service paginators.
     */
    GovernanceRulePaginators getPaginators();
}

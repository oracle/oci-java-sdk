/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.governancerulescontrolplane;

import com.oracle.bmc.governancerulescontrolplane.requests.*;
import com.oracle.bmc.governancerulescontrolplane.responses.*;

/** A description of the GovernanceRulesControlPlane API */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20220504")
public interface GovernanceRuleAsync extends AutoCloseable {

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
     * Create governance rule in the root compartment only. Either relatedResourceId or template
     * must be supplied.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<CreateGovernanceRuleResponse> createGovernanceRule(
            CreateGovernanceRuleRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            CreateGovernanceRuleRequest, CreateGovernanceRuleResponse>
                    handler);

    /**
     * Create inclusion criterion of type tenancy or tag for the governance rule.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<CreateInclusionCriterionResponse> createInclusionCriterion(
            CreateInclusionCriterionRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            CreateInclusionCriterionRequest, CreateInclusionCriterionResponse>
                    handler);

    /**
     * Delete the specified governance rule.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<DeleteGovernanceRuleResponse> deleteGovernanceRule(
            DeleteGovernanceRuleRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            DeleteGovernanceRuleRequest, DeleteGovernanceRuleResponse>
                    handler);

    /**
     * Delete the specified inclusion criterion.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<DeleteInclusionCriterionResponse> deleteInclusionCriterion(
            DeleteInclusionCriterionRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            DeleteInclusionCriterionRequest, DeleteInclusionCriterionResponse>
                    handler);

    /**
     * Get the specified enforced governance rule's information.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<GetEnforcedGovernanceRuleResponse> getEnforcedGovernanceRule(
            GetEnforcedGovernanceRuleRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            GetEnforcedGovernanceRuleRequest, GetEnforcedGovernanceRuleResponse>
                    handler);

    /**
     * Get the specified governance rule's information.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<GetGovernanceRuleResponse> getGovernanceRule(
            GetGovernanceRuleRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            GetGovernanceRuleRequest, GetGovernanceRuleResponse>
                    handler);

    /**
     * Get the specified inclusion criterion's information.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<GetInclusionCriterionResponse> getInclusionCriterion(
            GetInclusionCriterionRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            GetInclusionCriterionRequest, GetInclusionCriterionResponse>
                    handler);

    /**
     * Get the specified tenancy attachment's information.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<GetTenancyAttachmentResponse> getTenancyAttachment(
            GetTenancyAttachmentRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            GetTenancyAttachmentRequest, GetTenancyAttachmentResponse>
                    handler);

    /**
     * List enforced governance rules. Either compartment id or enforced governance rule id must be
     * supplied. An optional governance rule type or a display name can also be supplied.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ListEnforcedGovernanceRulesResponse> listEnforcedGovernanceRules(
            ListEnforcedGovernanceRulesRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            ListEnforcedGovernanceRulesRequest, ListEnforcedGovernanceRulesResponse>
                    handler);

    /**
     * List governance rules. Either compartment id or governance rule id must be supplied. An
     * optional lifecycle state, display name or a governance rule type can also be supplied.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ListGovernanceRulesResponse> listGovernanceRules(
            ListGovernanceRulesRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            ListGovernanceRulesRequest, ListGovernanceRulesResponse>
                    handler);

    /**
     * List inclusion criteria associated with a governance rule. Governance rule id must be
     * supplied. An optional inclusion criterion id or a lifecycle state can also be supplied.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ListInclusionCriteriaResponse> listInclusionCriteria(
            ListInclusionCriteriaRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            ListInclusionCriteriaRequest, ListInclusionCriteriaResponse>
                    handler);

    /**
     * List tenancy attachments. Either compartment id, governance rule id or tenancy attachment id
     * must be supplied. An optional lifecycle state or a child tenancy id can also be supplied.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ListTenancyAttachmentsResponse> listTenancyAttachments(
            ListTenancyAttachmentsRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            ListTenancyAttachmentsRequest, ListTenancyAttachmentsResponse>
                    handler);

    /**
     * Retry the creation of the specified governance rule. Used by the tenancy admins when all the
     * workflow retries have exhausted. When provided, If-Match is checked against ETag values of
     * the resource.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<RetryGovernanceRuleResponse> retryGovernanceRule(
            RetryGovernanceRuleRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            RetryGovernanceRuleRequest, RetryGovernanceRuleResponse>
                    handler);

    /**
     * Retry governance rule application for the specified tenancy attachment id. Used by the
     * tenancy admins when all the workflow retries have exhausted.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<RetryTenancyAttachmentResponse> retryTenancyAttachment(
            RetryTenancyAttachmentRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            RetryTenancyAttachmentRequest, RetryTenancyAttachmentResponse>
                    handler);

    /**
     * Update the specified governance rule.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<UpdateGovernanceRuleResponse> updateGovernanceRule(
            UpdateGovernanceRuleRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            UpdateGovernanceRuleRequest, UpdateGovernanceRuleResponse>
                    handler);
}

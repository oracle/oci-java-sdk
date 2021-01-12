/**
 * Copyright (c) 2016, 2021, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.budget;

import com.oracle.bmc.budget.requests.*;
import com.oracle.bmc.budget.responses.*;

/**
 * Use the Budgets API to manage budgets and budget alerts.
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20190111")
public interface BudgetAsync extends AutoCloseable {

    /**
     * Sets the endpoint to call (ex, https://www.example.com).
     * @param endpoint The endpoint of the serice.
     */
    void setEndpoint(String endpoint);

    /**
     * Gets the set endpoint for REST call (ex, https://www.example.com)
     */
    String getEndpoint();

    /**
     * Sets the region to call (ex, Region.US_PHOENIX_1).
     * <p>
     * Note, this will call {@link #setEndpoint(String) setEndpoint} after resolving the endpoint.  If the service is not available in this region, however, an IllegalArgumentException will be raised.
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
     * Creates a new Alert Rule.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<CreateAlertRuleResponse> createAlertRule(
            CreateAlertRuleRequest request,
            com.oracle.bmc.responses.AsyncHandler<CreateAlertRuleRequest, CreateAlertRuleResponse>
                    handler);

    /**
     * Creates a new Budget.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<CreateBudgetResponse> createBudget(
            CreateBudgetRequest request,
            com.oracle.bmc.responses.AsyncHandler<CreateBudgetRequest, CreateBudgetResponse>
                    handler);

    /**
     * Deletes a specified Alert Rule resource.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<DeleteAlertRuleResponse> deleteAlertRule(
            DeleteAlertRuleRequest request,
            com.oracle.bmc.responses.AsyncHandler<DeleteAlertRuleRequest, DeleteAlertRuleResponse>
                    handler);

    /**
     * Deletes a specified Budget resource
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<DeleteBudgetResponse> deleteBudget(
            DeleteBudgetRequest request,
            com.oracle.bmc.responses.AsyncHandler<DeleteBudgetRequest, DeleteBudgetResponse>
                    handler);

    /**
     * Gets an Alert Rule for a specified Budget.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<GetAlertRuleResponse> getAlertRule(
            GetAlertRuleRequest request,
            com.oracle.bmc.responses.AsyncHandler<GetAlertRuleRequest, GetAlertRuleResponse>
                    handler);

    /**
     * Gets a Budget by identifier
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<GetBudgetResponse> getBudget(
            GetBudgetRequest request,
            com.oracle.bmc.responses.AsyncHandler<GetBudgetRequest, GetBudgetResponse> handler);

    /**
     * Returns a list of Alert Rules for a specified Budget.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<ListAlertRulesResponse> listAlertRules(
            ListAlertRulesRequest request,
            com.oracle.bmc.responses.AsyncHandler<ListAlertRulesRequest, ListAlertRulesResponse>
                    handler);

    /**
     * Gets a list of Budgets in a compartment.
     * <p>
     * By default, ListBudgets returns budgets of 'COMPARTMENT' target type and the budget records with only ONE target compartment OCID.
     * <p>
     * To list ALL budgets, set the targetType query parameter to ALL.
     * Example:
     *   'targetType=ALL'
     * <p>
     * Additional targetTypes would be available in future releases. Clients should ignore new targetType
     * or upgrade to latest version of client SDK to handle new targetType.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<ListBudgetsResponse> listBudgets(
            ListBudgetsRequest request,
            com.oracle.bmc.responses.AsyncHandler<ListBudgetsRequest, ListBudgetsResponse> handler);

    /**
     * Update an Alert Rule for the budget identified by the OCID.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<UpdateAlertRuleResponse> updateAlertRule(
            UpdateAlertRuleRequest request,
            com.oracle.bmc.responses.AsyncHandler<UpdateAlertRuleRequest, UpdateAlertRuleResponse>
                    handler);

    /**
     * Update a Budget identified by the OCID
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<UpdateBudgetResponse> updateBudget(
            UpdateBudgetRequest request,
            com.oracle.bmc.responses.AsyncHandler<UpdateBudgetRequest, UpdateBudgetResponse>
                    handler);
}

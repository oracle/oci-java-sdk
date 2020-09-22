/**
 * Copyright (c) 2016, 2020, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.budget;

import com.oracle.bmc.budget.requests.*;
import com.oracle.bmc.budget.responses.*;

/**
 * Use the Budgets API to manage budgets and budget alerts.
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20190111")
public interface Budget extends AutoCloseable {

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
     * Creates a new Alert Rule.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    CreateAlertRuleResponse createAlertRule(CreateAlertRuleRequest request);

    /**
     * Creates a new Budget.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    CreateBudgetResponse createBudget(CreateBudgetRequest request);

    /**
     * Deletes a specified Alert Rule resource.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    DeleteAlertRuleResponse deleteAlertRule(DeleteAlertRuleRequest request);

    /**
     * Deletes a specified Budget resource
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    DeleteBudgetResponse deleteBudget(DeleteBudgetRequest request);

    /**
     * Gets an Alert Rule for a specified Budget.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    GetAlertRuleResponse getAlertRule(GetAlertRuleRequest request);

    /**
     * Gets a Budget by identifier
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    GetBudgetResponse getBudget(GetBudgetRequest request);

    /**
     * Returns a list of Alert Rules for a specified Budget.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    ListAlertRulesResponse listAlertRules(ListAlertRulesRequest request);

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
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    ListBudgetsResponse listBudgets(ListBudgetsRequest request);

    /**
     * Update an Alert Rule for the budget identified by the OCID.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    UpdateAlertRuleResponse updateAlertRule(UpdateAlertRuleRequest request);

    /**
     * Update a Budget identified by the OCID
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    UpdateBudgetResponse updateBudget(UpdateBudgetRequest request);

    /**
     * Gets the pre-configured waiters available for resources for this service.
     *
     * @return The service waiters.
     */
    BudgetWaiters getWaiters();

    /**
     * Gets the pre-configured paginators available for list operations in this service which may return multiple
     * pages of data. These paginators provide an {@link java.lang.Iterable} interface so that service responses, or
     * resources/records, can be iterated through without having to manually deal with pagination and page tokens.
     *
     * @return The service paginators.
     */
    BudgetPaginators getPaginators();
}

/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.budget;

import com.oracle.bmc.budget.requests.*;
import com.oracle.bmc.budget.responses.*;

/**
 * Collection of helper methods that can be used to provide an {@link java.lang.Iterable} interface
 * to any list operations of Budget where multiple pages of data may be fetched. Two styles of
 * iteration are supported:
 *
 * <ul>
 *   <li>Iterating over the Response objects returned by the list operation. These are referred to
 *       as ResponseIterators, and the methods are suffixed with ResponseIterator. For example:
 *       <i>listUsersResponseIterator</i>
 *   <li>Iterating over the resources/records being listed. These are referred to as
 *       RecordIterators, and the methods are suffixed with RecordIterator. For example:
 *       <i>listUsersRecordIterator</i>
 * </ul>
 *
 * These iterables abstract away the need to write code to manually handle pagination via looping
 * and using the page tokens. They will automatically fetch more data from the service when
 * required.
 *
 * <p>As an example, if we were using the ListUsers operation in IdentityService, then the {@link
 * java.lang.Iterable} returned by calling a ResponseIterator method would iterate over the
 * ListUsersResponse objects returned by each ListUsers call, whereas the {@link java.lang.Iterable}
 * returned by calling a RecordIterator method would iterate over the User records and we don't have
 * to deal with ListUsersResponse objects at all. In either case, pagination will be automatically
 * handled so we can iterate until there are no more responses or no more resources/records
 * available.
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20190111")
public class BudgetPaginators {
    private final Budget client;

    public BudgetPaginators(Budget client) {
        this.client = client;
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the listAlertRules
     * operation. This iterable will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses
     *     received from the service.
     */
    public Iterable<ListAlertRulesResponse> listAlertRulesResponseIterator(
            final ListAlertRulesRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListAlertRulesRequest.Builder, ListAlertRulesRequest, ListAlertRulesResponse>(
                new java.util.function.Supplier<ListAlertRulesRequest.Builder>() {
                    @Override
                    public ListAlertRulesRequest.Builder get() {
                        return ListAlertRulesRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListAlertRulesResponse, String>() {
                    @Override
                    public String apply(ListAlertRulesResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListAlertRulesRequest.Builder>,
                        ListAlertRulesRequest>() {
                    @Override
                    public ListAlertRulesRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListAlertRulesRequest.Builder>
                                    input) {
                        if (input.getNextPageToken() == null) {
                            return input.getRequestBuilder().build();
                        } else {
                            return input.getRequestBuilder()
                                    .page(input.getNextPageToken().orElse(null))
                                    .build();
                        }
                    }
                },
                new java.util.function.Function<ListAlertRulesRequest, ListAlertRulesResponse>() {
                    @Override
                    public ListAlertRulesResponse apply(ListAlertRulesRequest request) {
                        return client.listAlertRules(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link
     * com.oracle.bmc.budget.model.AlertRuleSummary} objects contained in responses from the
     * listAlertRules operation. This iterable will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link
     *     com.oracle.bmc.budget.model.AlertRuleSummary} objects contained in responses received
     *     from the service.
     */
    public Iterable<com.oracle.bmc.budget.model.AlertRuleSummary> listAlertRulesRecordIterator(
            final ListAlertRulesRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListAlertRulesRequest.Builder,
                ListAlertRulesRequest,
                ListAlertRulesResponse,
                com.oracle.bmc.budget.model.AlertRuleSummary>(
                new java.util.function.Supplier<ListAlertRulesRequest.Builder>() {
                    @Override
                    public ListAlertRulesRequest.Builder get() {
                        return ListAlertRulesRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListAlertRulesResponse, String>() {
                    @Override
                    public String apply(ListAlertRulesResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListAlertRulesRequest.Builder>,
                        ListAlertRulesRequest>() {
                    @Override
                    public ListAlertRulesRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListAlertRulesRequest.Builder>
                                    input) {
                        if (input.getNextPageToken() == null) {
                            return input.getRequestBuilder().build();
                        } else {
                            return input.getRequestBuilder()
                                    .page(input.getNextPageToken().orElse(null))
                                    .build();
                        }
                    }
                },
                new java.util.function.Function<ListAlertRulesRequest, ListAlertRulesResponse>() {
                    @Override
                    public ListAlertRulesResponse apply(ListAlertRulesRequest request) {
                        return client.listAlertRules(request);
                    }
                },
                new java.util.function.Function<
                        ListAlertRulesResponse,
                        java.util.List<com.oracle.bmc.budget.model.AlertRuleSummary>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.budget.model.AlertRuleSummary> apply(
                            ListAlertRulesResponse response) {
                        return response.getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the listBudgets
     * operation. This iterable will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses
     *     received from the service.
     */
    public Iterable<ListBudgetsResponse> listBudgetsResponseIterator(
            final ListBudgetsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListBudgetsRequest.Builder, ListBudgetsRequest, ListBudgetsResponse>(
                new java.util.function.Supplier<ListBudgetsRequest.Builder>() {
                    @Override
                    public ListBudgetsRequest.Builder get() {
                        return ListBudgetsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListBudgetsResponse, String>() {
                    @Override
                    public String apply(ListBudgetsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListBudgetsRequest.Builder>,
                        ListBudgetsRequest>() {
                    @Override
                    public ListBudgetsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListBudgetsRequest.Builder>
                                    input) {
                        if (input.getNextPageToken() == null) {
                            return input.getRequestBuilder().build();
                        } else {
                            return input.getRequestBuilder()
                                    .page(input.getNextPageToken().orElse(null))
                                    .build();
                        }
                    }
                },
                new java.util.function.Function<ListBudgetsRequest, ListBudgetsResponse>() {
                    @Override
                    public ListBudgetsResponse apply(ListBudgetsRequest request) {
                        return client.listBudgets(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link
     * com.oracle.bmc.budget.model.BudgetSummary} objects contained in responses from the
     * listBudgets operation. This iterable will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link
     *     com.oracle.bmc.budget.model.BudgetSummary} objects contained in responses received from
     *     the service.
     */
    public Iterable<com.oracle.bmc.budget.model.BudgetSummary> listBudgetsRecordIterator(
            final ListBudgetsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListBudgetsRequest.Builder,
                ListBudgetsRequest,
                ListBudgetsResponse,
                com.oracle.bmc.budget.model.BudgetSummary>(
                new java.util.function.Supplier<ListBudgetsRequest.Builder>() {
                    @Override
                    public ListBudgetsRequest.Builder get() {
                        return ListBudgetsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListBudgetsResponse, String>() {
                    @Override
                    public String apply(ListBudgetsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListBudgetsRequest.Builder>,
                        ListBudgetsRequest>() {
                    @Override
                    public ListBudgetsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListBudgetsRequest.Builder>
                                    input) {
                        if (input.getNextPageToken() == null) {
                            return input.getRequestBuilder().build();
                        } else {
                            return input.getRequestBuilder()
                                    .page(input.getNextPageToken().orElse(null))
                                    .build();
                        }
                    }
                },
                new java.util.function.Function<ListBudgetsRequest, ListBudgetsResponse>() {
                    @Override
                    public ListBudgetsResponse apply(ListBudgetsRequest request) {
                        return client.listBudgets(request);
                    }
                },
                new java.util.function.Function<
                        ListBudgetsResponse,
                        java.util.List<com.oracle.bmc.budget.model.BudgetSummary>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.budget.model.BudgetSummary> apply(
                            ListBudgetsResponse response) {
                        return response.getItems();
                    }
                });
    }
}

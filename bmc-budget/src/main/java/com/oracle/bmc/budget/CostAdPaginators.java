/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.budget;

import com.oracle.bmc.budget.requests.*;
import com.oracle.bmc.budget.responses.*;

/**
 * Collection of helper methods that can be used to provide an {@link java.lang.Iterable} interface
 * to any list operations of CostAd where multiple pages of data may be fetched. Two styles of
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
public class CostAdPaginators {
    private final CostAd client;

    public CostAdPaginators(CostAd client) {
        this.client = client;
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the
     * listCostAlertSubscriptions operation. This iterable will fetch more data from the server as
     * needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses
     *     received from the service.
     */
    public Iterable<ListCostAlertSubscriptionsResponse> listCostAlertSubscriptionsResponseIterator(
            final ListCostAlertSubscriptionsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListCostAlertSubscriptionsRequest.Builder,
                ListCostAlertSubscriptionsRequest,
                ListCostAlertSubscriptionsResponse>(
                new java.util.function.Supplier<ListCostAlertSubscriptionsRequest.Builder>() {
                    @Override
                    public ListCostAlertSubscriptionsRequest.Builder get() {
                        return ListCostAlertSubscriptionsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListCostAlertSubscriptionsResponse, String>() {
                    @Override
                    public String apply(ListCostAlertSubscriptionsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListCostAlertSubscriptionsRequest.Builder>,
                        ListCostAlertSubscriptionsRequest>() {
                    @Override
                    public ListCostAlertSubscriptionsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListCostAlertSubscriptionsRequest.Builder>
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
                new java.util.function.Function<
                        ListCostAlertSubscriptionsRequest, ListCostAlertSubscriptionsResponse>() {
                    @Override
                    public ListCostAlertSubscriptionsResponse apply(
                            ListCostAlertSubscriptionsRequest request) {
                        return client.listCostAlertSubscriptions(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link
     * com.oracle.bmc.budget.model.CostAlertSubscriptionSummary} objects contained in responses from
     * the listCostAlertSubscriptions operation. This iterable will fetch more data from the server
     * as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link
     *     com.oracle.bmc.budget.model.CostAlertSubscriptionSummary} objects contained in responses
     *     received from the service.
     */
    public Iterable<com.oracle.bmc.budget.model.CostAlertSubscriptionSummary>
            listCostAlertSubscriptionsRecordIterator(
                    final ListCostAlertSubscriptionsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListCostAlertSubscriptionsRequest.Builder,
                ListCostAlertSubscriptionsRequest,
                ListCostAlertSubscriptionsResponse,
                com.oracle.bmc.budget.model.CostAlertSubscriptionSummary>(
                new java.util.function.Supplier<ListCostAlertSubscriptionsRequest.Builder>() {
                    @Override
                    public ListCostAlertSubscriptionsRequest.Builder get() {
                        return ListCostAlertSubscriptionsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListCostAlertSubscriptionsResponse, String>() {
                    @Override
                    public String apply(ListCostAlertSubscriptionsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListCostAlertSubscriptionsRequest.Builder>,
                        ListCostAlertSubscriptionsRequest>() {
                    @Override
                    public ListCostAlertSubscriptionsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListCostAlertSubscriptionsRequest.Builder>
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
                new java.util.function.Function<
                        ListCostAlertSubscriptionsRequest, ListCostAlertSubscriptionsResponse>() {
                    @Override
                    public ListCostAlertSubscriptionsResponse apply(
                            ListCostAlertSubscriptionsRequest request) {
                        return client.listCostAlertSubscriptions(request);
                    }
                },
                new java.util.function.Function<
                        ListCostAlertSubscriptionsResponse,
                        java.util.List<
                                com.oracle.bmc.budget.model.CostAlertSubscriptionSummary>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.budget.model.CostAlertSubscriptionSummary>
                            apply(ListCostAlertSubscriptionsResponse response) {
                        return response.getCostAlertSubscriptionCollection().getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the
     * listCostAnomalyEvents operation. This iterable will fetch more data from the server as
     * needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses
     *     received from the service.
     */
    public Iterable<ListCostAnomalyEventsResponse> listCostAnomalyEventsResponseIterator(
            final ListCostAnomalyEventsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListCostAnomalyEventsRequest.Builder,
                ListCostAnomalyEventsRequest,
                ListCostAnomalyEventsResponse>(
                new java.util.function.Supplier<ListCostAnomalyEventsRequest.Builder>() {
                    @Override
                    public ListCostAnomalyEventsRequest.Builder get() {
                        return ListCostAnomalyEventsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListCostAnomalyEventsResponse, String>() {
                    @Override
                    public String apply(ListCostAnomalyEventsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListCostAnomalyEventsRequest.Builder>,
                        ListCostAnomalyEventsRequest>() {
                    @Override
                    public ListCostAnomalyEventsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListCostAnomalyEventsRequest.Builder>
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
                new java.util.function.Function<
                        ListCostAnomalyEventsRequest, ListCostAnomalyEventsResponse>() {
                    @Override
                    public ListCostAnomalyEventsResponse apply(
                            ListCostAnomalyEventsRequest request) {
                        return client.listCostAnomalyEvents(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link
     * com.oracle.bmc.budget.model.CostAnomalyEventSummary} objects contained in responses from the
     * listCostAnomalyEvents operation. This iterable will fetch more data from the server as
     * needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link
     *     com.oracle.bmc.budget.model.CostAnomalyEventSummary} objects contained in responses
     *     received from the service.
     */
    public Iterable<com.oracle.bmc.budget.model.CostAnomalyEventSummary>
            listCostAnomalyEventsRecordIterator(final ListCostAnomalyEventsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListCostAnomalyEventsRequest.Builder,
                ListCostAnomalyEventsRequest,
                ListCostAnomalyEventsResponse,
                com.oracle.bmc.budget.model.CostAnomalyEventSummary>(
                new java.util.function.Supplier<ListCostAnomalyEventsRequest.Builder>() {
                    @Override
                    public ListCostAnomalyEventsRequest.Builder get() {
                        return ListCostAnomalyEventsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListCostAnomalyEventsResponse, String>() {
                    @Override
                    public String apply(ListCostAnomalyEventsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListCostAnomalyEventsRequest.Builder>,
                        ListCostAnomalyEventsRequest>() {
                    @Override
                    public ListCostAnomalyEventsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListCostAnomalyEventsRequest.Builder>
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
                new java.util.function.Function<
                        ListCostAnomalyEventsRequest, ListCostAnomalyEventsResponse>() {
                    @Override
                    public ListCostAnomalyEventsResponse apply(
                            ListCostAnomalyEventsRequest request) {
                        return client.listCostAnomalyEvents(request);
                    }
                },
                new java.util.function.Function<
                        ListCostAnomalyEventsResponse,
                        java.util.List<com.oracle.bmc.budget.model.CostAnomalyEventSummary>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.budget.model.CostAnomalyEventSummary>
                            apply(ListCostAnomalyEventsResponse response) {
                        return response.getCostAnomalyEventCollection().getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the
     * listCostAnomalyMonitors operation. This iterable will fetch more data from the server as
     * needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses
     *     received from the service.
     */
    public Iterable<ListCostAnomalyMonitorsResponse> listCostAnomalyMonitorsResponseIterator(
            final ListCostAnomalyMonitorsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListCostAnomalyMonitorsRequest.Builder,
                ListCostAnomalyMonitorsRequest,
                ListCostAnomalyMonitorsResponse>(
                new java.util.function.Supplier<ListCostAnomalyMonitorsRequest.Builder>() {
                    @Override
                    public ListCostAnomalyMonitorsRequest.Builder get() {
                        return ListCostAnomalyMonitorsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListCostAnomalyMonitorsResponse, String>() {
                    @Override
                    public String apply(ListCostAnomalyMonitorsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListCostAnomalyMonitorsRequest.Builder>,
                        ListCostAnomalyMonitorsRequest>() {
                    @Override
                    public ListCostAnomalyMonitorsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListCostAnomalyMonitorsRequest.Builder>
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
                new java.util.function.Function<
                        ListCostAnomalyMonitorsRequest, ListCostAnomalyMonitorsResponse>() {
                    @Override
                    public ListCostAnomalyMonitorsResponse apply(
                            ListCostAnomalyMonitorsRequest request) {
                        return client.listCostAnomalyMonitors(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link
     * com.oracle.bmc.budget.model.CostAnomalyMonitorSummary} objects contained in responses from
     * the listCostAnomalyMonitors operation. This iterable will fetch more data from the server as
     * needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link
     *     com.oracle.bmc.budget.model.CostAnomalyMonitorSummary} objects contained in responses
     *     received from the service.
     */
    public Iterable<com.oracle.bmc.budget.model.CostAnomalyMonitorSummary>
            listCostAnomalyMonitorsRecordIterator(final ListCostAnomalyMonitorsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListCostAnomalyMonitorsRequest.Builder,
                ListCostAnomalyMonitorsRequest,
                ListCostAnomalyMonitorsResponse,
                com.oracle.bmc.budget.model.CostAnomalyMonitorSummary>(
                new java.util.function.Supplier<ListCostAnomalyMonitorsRequest.Builder>() {
                    @Override
                    public ListCostAnomalyMonitorsRequest.Builder get() {
                        return ListCostAnomalyMonitorsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListCostAnomalyMonitorsResponse, String>() {
                    @Override
                    public String apply(ListCostAnomalyMonitorsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListCostAnomalyMonitorsRequest.Builder>,
                        ListCostAnomalyMonitorsRequest>() {
                    @Override
                    public ListCostAnomalyMonitorsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListCostAnomalyMonitorsRequest.Builder>
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
                new java.util.function.Function<
                        ListCostAnomalyMonitorsRequest, ListCostAnomalyMonitorsResponse>() {
                    @Override
                    public ListCostAnomalyMonitorsResponse apply(
                            ListCostAnomalyMonitorsRequest request) {
                        return client.listCostAnomalyMonitors(request);
                    }
                },
                new java.util.function.Function<
                        ListCostAnomalyMonitorsResponse,
                        java.util.List<com.oracle.bmc.budget.model.CostAnomalyMonitorSummary>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.budget.model.CostAnomalyMonitorSummary>
                            apply(ListCostAnomalyMonitorsResponse response) {
                        return response.getCostAnomalyMonitorCollection().getItems();
                    }
                });
    }
}

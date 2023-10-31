/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.datasafe;

import com.oracle.bmc.datasafe.requests.*;
import com.oracle.bmc.datasafe.responses.*;

/**
 * Collection of helper methods that can be used to provide an {@link java.lang.Iterable} interface
 * to any list operations of DataSafe where multiple pages of data may be fetched. Two styles of
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
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20181201")
public class DataSafePaginators {
    private final DataSafe client;

    public DataSafePaginators(DataSafe client) {
        this.client = client;
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the
     * listAlertAnalytics operation. This iterable will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses
     *     received from the service.
     */
    public Iterable<ListAlertAnalyticsResponse> listAlertAnalyticsResponseIterator(
            final ListAlertAnalyticsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListAlertAnalyticsRequest.Builder,
                ListAlertAnalyticsRequest,
                ListAlertAnalyticsResponse>(
                new java.util.function.Supplier<ListAlertAnalyticsRequest.Builder>() {
                    @Override
                    public ListAlertAnalyticsRequest.Builder get() {
                        return ListAlertAnalyticsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListAlertAnalyticsResponse, String>() {
                    @Override
                    public String apply(ListAlertAnalyticsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListAlertAnalyticsRequest.Builder>,
                        ListAlertAnalyticsRequest>() {
                    @Override
                    public ListAlertAnalyticsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListAlertAnalyticsRequest.Builder>
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
                        ListAlertAnalyticsRequest, ListAlertAnalyticsResponse>() {
                    @Override
                    public ListAlertAnalyticsResponse apply(ListAlertAnalyticsRequest request) {
                        return client.listAlertAnalytics(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link
     * com.oracle.bmc.datasafe.model.AlertAggregationItems} objects contained in responses from the
     * listAlertAnalytics operation. This iterable will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link
     *     com.oracle.bmc.datasafe.model.AlertAggregationItems} objects contained in responses
     *     received from the service.
     */
    public Iterable<com.oracle.bmc.datasafe.model.AlertAggregationItems>
            listAlertAnalyticsRecordIterator(final ListAlertAnalyticsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListAlertAnalyticsRequest.Builder,
                ListAlertAnalyticsRequest,
                ListAlertAnalyticsResponse,
                com.oracle.bmc.datasafe.model.AlertAggregationItems>(
                new java.util.function.Supplier<ListAlertAnalyticsRequest.Builder>() {
                    @Override
                    public ListAlertAnalyticsRequest.Builder get() {
                        return ListAlertAnalyticsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListAlertAnalyticsResponse, String>() {
                    @Override
                    public String apply(ListAlertAnalyticsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListAlertAnalyticsRequest.Builder>,
                        ListAlertAnalyticsRequest>() {
                    @Override
                    public ListAlertAnalyticsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListAlertAnalyticsRequest.Builder>
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
                        ListAlertAnalyticsRequest, ListAlertAnalyticsResponse>() {
                    @Override
                    public ListAlertAnalyticsResponse apply(ListAlertAnalyticsRequest request) {
                        return client.listAlertAnalytics(request);
                    }
                },
                new java.util.function.Function<
                        ListAlertAnalyticsResponse,
                        java.util.List<com.oracle.bmc.datasafe.model.AlertAggregationItems>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.datasafe.model.AlertAggregationItems>
                            apply(ListAlertAnalyticsResponse response) {
                        return response.getAlertAnalyticsCollection().getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the
     * listAlertPolicies operation. This iterable will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses
     *     received from the service.
     */
    public Iterable<ListAlertPoliciesResponse> listAlertPoliciesResponseIterator(
            final ListAlertPoliciesRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListAlertPoliciesRequest.Builder,
                ListAlertPoliciesRequest,
                ListAlertPoliciesResponse>(
                new java.util.function.Supplier<ListAlertPoliciesRequest.Builder>() {
                    @Override
                    public ListAlertPoliciesRequest.Builder get() {
                        return ListAlertPoliciesRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListAlertPoliciesResponse, String>() {
                    @Override
                    public String apply(ListAlertPoliciesResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListAlertPoliciesRequest.Builder>,
                        ListAlertPoliciesRequest>() {
                    @Override
                    public ListAlertPoliciesRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListAlertPoliciesRequest.Builder>
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
                        ListAlertPoliciesRequest, ListAlertPoliciesResponse>() {
                    @Override
                    public ListAlertPoliciesResponse apply(ListAlertPoliciesRequest request) {
                        return client.listAlertPolicies(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link
     * com.oracle.bmc.datasafe.model.AlertPolicySummary} objects contained in responses from the
     * listAlertPolicies operation. This iterable will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link
     *     com.oracle.bmc.datasafe.model.AlertPolicySummary} objects contained in responses received
     *     from the service.
     */
    public Iterable<com.oracle.bmc.datasafe.model.AlertPolicySummary>
            listAlertPoliciesRecordIterator(final ListAlertPoliciesRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListAlertPoliciesRequest.Builder,
                ListAlertPoliciesRequest,
                ListAlertPoliciesResponse,
                com.oracle.bmc.datasafe.model.AlertPolicySummary>(
                new java.util.function.Supplier<ListAlertPoliciesRequest.Builder>() {
                    @Override
                    public ListAlertPoliciesRequest.Builder get() {
                        return ListAlertPoliciesRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListAlertPoliciesResponse, String>() {
                    @Override
                    public String apply(ListAlertPoliciesResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListAlertPoliciesRequest.Builder>,
                        ListAlertPoliciesRequest>() {
                    @Override
                    public ListAlertPoliciesRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListAlertPoliciesRequest.Builder>
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
                        ListAlertPoliciesRequest, ListAlertPoliciesResponse>() {
                    @Override
                    public ListAlertPoliciesResponse apply(ListAlertPoliciesRequest request) {
                        return client.listAlertPolicies(request);
                    }
                },
                new java.util.function.Function<
                        ListAlertPoliciesResponse,
                        java.util.List<com.oracle.bmc.datasafe.model.AlertPolicySummary>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.datasafe.model.AlertPolicySummary> apply(
                            ListAlertPoliciesResponse response) {
                        return response.getAlertPolicyCollection().getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the
     * listAlertPolicyRules operation. This iterable will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses
     *     received from the service.
     */
    public Iterable<ListAlertPolicyRulesResponse> listAlertPolicyRulesResponseIterator(
            final ListAlertPolicyRulesRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListAlertPolicyRulesRequest.Builder,
                ListAlertPolicyRulesRequest,
                ListAlertPolicyRulesResponse>(
                new java.util.function.Supplier<ListAlertPolicyRulesRequest.Builder>() {
                    @Override
                    public ListAlertPolicyRulesRequest.Builder get() {
                        return ListAlertPolicyRulesRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListAlertPolicyRulesResponse, String>() {
                    @Override
                    public String apply(ListAlertPolicyRulesResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListAlertPolicyRulesRequest.Builder>,
                        ListAlertPolicyRulesRequest>() {
                    @Override
                    public ListAlertPolicyRulesRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListAlertPolicyRulesRequest.Builder>
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
                        ListAlertPolicyRulesRequest, ListAlertPolicyRulesResponse>() {
                    @Override
                    public ListAlertPolicyRulesResponse apply(ListAlertPolicyRulesRequest request) {
                        return client.listAlertPolicyRules(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link
     * com.oracle.bmc.datasafe.model.AlertPolicyRuleSummary} objects contained in responses from the
     * listAlertPolicyRules operation. This iterable will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link
     *     com.oracle.bmc.datasafe.model.AlertPolicyRuleSummary} objects contained in responses
     *     received from the service.
     */
    public Iterable<com.oracle.bmc.datasafe.model.AlertPolicyRuleSummary>
            listAlertPolicyRulesRecordIterator(final ListAlertPolicyRulesRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListAlertPolicyRulesRequest.Builder,
                ListAlertPolicyRulesRequest,
                ListAlertPolicyRulesResponse,
                com.oracle.bmc.datasafe.model.AlertPolicyRuleSummary>(
                new java.util.function.Supplier<ListAlertPolicyRulesRequest.Builder>() {
                    @Override
                    public ListAlertPolicyRulesRequest.Builder get() {
                        return ListAlertPolicyRulesRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListAlertPolicyRulesResponse, String>() {
                    @Override
                    public String apply(ListAlertPolicyRulesResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListAlertPolicyRulesRequest.Builder>,
                        ListAlertPolicyRulesRequest>() {
                    @Override
                    public ListAlertPolicyRulesRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListAlertPolicyRulesRequest.Builder>
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
                        ListAlertPolicyRulesRequest, ListAlertPolicyRulesResponse>() {
                    @Override
                    public ListAlertPolicyRulesResponse apply(ListAlertPolicyRulesRequest request) {
                        return client.listAlertPolicyRules(request);
                    }
                },
                new java.util.function.Function<
                        ListAlertPolicyRulesResponse,
                        java.util.List<com.oracle.bmc.datasafe.model.AlertPolicyRuleSummary>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.datasafe.model.AlertPolicyRuleSummary>
                            apply(ListAlertPolicyRulesResponse response) {
                        return response.getAlertPolicyRuleCollection().getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the listAlerts
     * operation. This iterable will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses
     *     received from the service.
     */
    public Iterable<ListAlertsResponse> listAlertsResponseIterator(
            final ListAlertsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListAlertsRequest.Builder, ListAlertsRequest, ListAlertsResponse>(
                new java.util.function.Supplier<ListAlertsRequest.Builder>() {
                    @Override
                    public ListAlertsRequest.Builder get() {
                        return ListAlertsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListAlertsResponse, String>() {
                    @Override
                    public String apply(ListAlertsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListAlertsRequest.Builder>,
                        ListAlertsRequest>() {
                    @Override
                    public ListAlertsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListAlertsRequest.Builder>
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
                new java.util.function.Function<ListAlertsRequest, ListAlertsResponse>() {
                    @Override
                    public ListAlertsResponse apply(ListAlertsRequest request) {
                        return client.listAlerts(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link
     * com.oracle.bmc.datasafe.model.AlertSummary} objects contained in responses from the
     * listAlerts operation. This iterable will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link
     *     com.oracle.bmc.datasafe.model.AlertSummary} objects contained in responses received from
     *     the service.
     */
    public Iterable<com.oracle.bmc.datasafe.model.AlertSummary> listAlertsRecordIterator(
            final ListAlertsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListAlertsRequest.Builder,
                ListAlertsRequest,
                ListAlertsResponse,
                com.oracle.bmc.datasafe.model.AlertSummary>(
                new java.util.function.Supplier<ListAlertsRequest.Builder>() {
                    @Override
                    public ListAlertsRequest.Builder get() {
                        return ListAlertsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListAlertsResponse, String>() {
                    @Override
                    public String apply(ListAlertsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListAlertsRequest.Builder>,
                        ListAlertsRequest>() {
                    @Override
                    public ListAlertsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListAlertsRequest.Builder>
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
                new java.util.function.Function<ListAlertsRequest, ListAlertsResponse>() {
                    @Override
                    public ListAlertsResponse apply(ListAlertsRequest request) {
                        return client.listAlerts(request);
                    }
                },
                new java.util.function.Function<
                        ListAlertsResponse,
                        java.util.List<com.oracle.bmc.datasafe.model.AlertSummary>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.datasafe.model.AlertSummary> apply(
                            ListAlertsResponse response) {
                        return response.getAlertCollection().getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the
     * listAuditArchiveRetrievals operation. This iterable will fetch more data from the server as
     * needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses
     *     received from the service.
     */
    public Iterable<ListAuditArchiveRetrievalsResponse> listAuditArchiveRetrievalsResponseIterator(
            final ListAuditArchiveRetrievalsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListAuditArchiveRetrievalsRequest.Builder,
                ListAuditArchiveRetrievalsRequest,
                ListAuditArchiveRetrievalsResponse>(
                new java.util.function.Supplier<ListAuditArchiveRetrievalsRequest.Builder>() {
                    @Override
                    public ListAuditArchiveRetrievalsRequest.Builder get() {
                        return ListAuditArchiveRetrievalsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListAuditArchiveRetrievalsResponse, String>() {
                    @Override
                    public String apply(ListAuditArchiveRetrievalsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListAuditArchiveRetrievalsRequest.Builder>,
                        ListAuditArchiveRetrievalsRequest>() {
                    @Override
                    public ListAuditArchiveRetrievalsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListAuditArchiveRetrievalsRequest.Builder>
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
                        ListAuditArchiveRetrievalsRequest, ListAuditArchiveRetrievalsResponse>() {
                    @Override
                    public ListAuditArchiveRetrievalsResponse apply(
                            ListAuditArchiveRetrievalsRequest request) {
                        return client.listAuditArchiveRetrievals(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link
     * com.oracle.bmc.datasafe.model.AuditArchiveRetrievalSummary} objects contained in responses
     * from the listAuditArchiveRetrievals operation. This iterable will fetch more data from the
     * server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link
     *     com.oracle.bmc.datasafe.model.AuditArchiveRetrievalSummary} objects contained in
     *     responses received from the service.
     */
    public Iterable<com.oracle.bmc.datasafe.model.AuditArchiveRetrievalSummary>
            listAuditArchiveRetrievalsRecordIterator(
                    final ListAuditArchiveRetrievalsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListAuditArchiveRetrievalsRequest.Builder,
                ListAuditArchiveRetrievalsRequest,
                ListAuditArchiveRetrievalsResponse,
                com.oracle.bmc.datasafe.model.AuditArchiveRetrievalSummary>(
                new java.util.function.Supplier<ListAuditArchiveRetrievalsRequest.Builder>() {
                    @Override
                    public ListAuditArchiveRetrievalsRequest.Builder get() {
                        return ListAuditArchiveRetrievalsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListAuditArchiveRetrievalsResponse, String>() {
                    @Override
                    public String apply(ListAuditArchiveRetrievalsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListAuditArchiveRetrievalsRequest.Builder>,
                        ListAuditArchiveRetrievalsRequest>() {
                    @Override
                    public ListAuditArchiveRetrievalsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListAuditArchiveRetrievalsRequest.Builder>
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
                        ListAuditArchiveRetrievalsRequest, ListAuditArchiveRetrievalsResponse>() {
                    @Override
                    public ListAuditArchiveRetrievalsResponse apply(
                            ListAuditArchiveRetrievalsRequest request) {
                        return client.listAuditArchiveRetrievals(request);
                    }
                },
                new java.util.function.Function<
                        ListAuditArchiveRetrievalsResponse,
                        java.util.List<
                                com.oracle.bmc.datasafe.model.AuditArchiveRetrievalSummary>>() {
                    @Override
                    public java.util.List<
                                    com.oracle.bmc.datasafe.model.AuditArchiveRetrievalSummary>
                            apply(ListAuditArchiveRetrievalsResponse response) {
                        return response.getAuditArchiveRetrievalCollection().getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the
     * listAuditEventAnalytics operation. This iterable will fetch more data from the server as
     * needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses
     *     received from the service.
     */
    public Iterable<ListAuditEventAnalyticsResponse> listAuditEventAnalyticsResponseIterator(
            final ListAuditEventAnalyticsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListAuditEventAnalyticsRequest.Builder,
                ListAuditEventAnalyticsRequest,
                ListAuditEventAnalyticsResponse>(
                new java.util.function.Supplier<ListAuditEventAnalyticsRequest.Builder>() {
                    @Override
                    public ListAuditEventAnalyticsRequest.Builder get() {
                        return ListAuditEventAnalyticsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListAuditEventAnalyticsResponse, String>() {
                    @Override
                    public String apply(ListAuditEventAnalyticsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListAuditEventAnalyticsRequest.Builder>,
                        ListAuditEventAnalyticsRequest>() {
                    @Override
                    public ListAuditEventAnalyticsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListAuditEventAnalyticsRequest.Builder>
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
                        ListAuditEventAnalyticsRequest, ListAuditEventAnalyticsResponse>() {
                    @Override
                    public ListAuditEventAnalyticsResponse apply(
                            ListAuditEventAnalyticsRequest request) {
                        return client.listAuditEventAnalytics(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link
     * com.oracle.bmc.datasafe.model.AuditEventAggregationItems} objects contained in responses from
     * the listAuditEventAnalytics operation. This iterable will fetch more data from the server as
     * needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link
     *     com.oracle.bmc.datasafe.model.AuditEventAggregationItems} objects contained in responses
     *     received from the service.
     */
    public Iterable<com.oracle.bmc.datasafe.model.AuditEventAggregationItems>
            listAuditEventAnalyticsRecordIterator(final ListAuditEventAnalyticsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListAuditEventAnalyticsRequest.Builder,
                ListAuditEventAnalyticsRequest,
                ListAuditEventAnalyticsResponse,
                com.oracle.bmc.datasafe.model.AuditEventAggregationItems>(
                new java.util.function.Supplier<ListAuditEventAnalyticsRequest.Builder>() {
                    @Override
                    public ListAuditEventAnalyticsRequest.Builder get() {
                        return ListAuditEventAnalyticsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListAuditEventAnalyticsResponse, String>() {
                    @Override
                    public String apply(ListAuditEventAnalyticsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListAuditEventAnalyticsRequest.Builder>,
                        ListAuditEventAnalyticsRequest>() {
                    @Override
                    public ListAuditEventAnalyticsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListAuditEventAnalyticsRequest.Builder>
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
                        ListAuditEventAnalyticsRequest, ListAuditEventAnalyticsResponse>() {
                    @Override
                    public ListAuditEventAnalyticsResponse apply(
                            ListAuditEventAnalyticsRequest request) {
                        return client.listAuditEventAnalytics(request);
                    }
                },
                new java.util.function.Function<
                        ListAuditEventAnalyticsResponse,
                        java.util.List<
                                com.oracle.bmc.datasafe.model.AuditEventAggregationItems>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.datasafe.model.AuditEventAggregationItems>
                            apply(ListAuditEventAnalyticsResponse response) {
                        return response.getAuditEventAnalyticsCollection().getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the
     * listAuditEvents operation. This iterable will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses
     *     received from the service.
     */
    public Iterable<ListAuditEventsResponse> listAuditEventsResponseIterator(
            final ListAuditEventsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListAuditEventsRequest.Builder, ListAuditEventsRequest, ListAuditEventsResponse>(
                new java.util.function.Supplier<ListAuditEventsRequest.Builder>() {
                    @Override
                    public ListAuditEventsRequest.Builder get() {
                        return ListAuditEventsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListAuditEventsResponse, String>() {
                    @Override
                    public String apply(ListAuditEventsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListAuditEventsRequest.Builder>,
                        ListAuditEventsRequest>() {
                    @Override
                    public ListAuditEventsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListAuditEventsRequest.Builder>
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
                new java.util.function.Function<ListAuditEventsRequest, ListAuditEventsResponse>() {
                    @Override
                    public ListAuditEventsResponse apply(ListAuditEventsRequest request) {
                        return client.listAuditEvents(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link
     * com.oracle.bmc.datasafe.model.AuditEventSummary} objects contained in responses from the
     * listAuditEvents operation. This iterable will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link
     *     com.oracle.bmc.datasafe.model.AuditEventSummary} objects contained in responses received
     *     from the service.
     */
    public Iterable<com.oracle.bmc.datasafe.model.AuditEventSummary> listAuditEventsRecordIterator(
            final ListAuditEventsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListAuditEventsRequest.Builder,
                ListAuditEventsRequest,
                ListAuditEventsResponse,
                com.oracle.bmc.datasafe.model.AuditEventSummary>(
                new java.util.function.Supplier<ListAuditEventsRequest.Builder>() {
                    @Override
                    public ListAuditEventsRequest.Builder get() {
                        return ListAuditEventsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListAuditEventsResponse, String>() {
                    @Override
                    public String apply(ListAuditEventsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListAuditEventsRequest.Builder>,
                        ListAuditEventsRequest>() {
                    @Override
                    public ListAuditEventsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListAuditEventsRequest.Builder>
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
                new java.util.function.Function<ListAuditEventsRequest, ListAuditEventsResponse>() {
                    @Override
                    public ListAuditEventsResponse apply(ListAuditEventsRequest request) {
                        return client.listAuditEvents(request);
                    }
                },
                new java.util.function.Function<
                        ListAuditEventsResponse,
                        java.util.List<com.oracle.bmc.datasafe.model.AuditEventSummary>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.datasafe.model.AuditEventSummary> apply(
                            ListAuditEventsResponse response) {
                        return response.getAuditEventCollection().getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the
     * listAuditPolicies operation. This iterable will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses
     *     received from the service.
     */
    public Iterable<ListAuditPoliciesResponse> listAuditPoliciesResponseIterator(
            final ListAuditPoliciesRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListAuditPoliciesRequest.Builder,
                ListAuditPoliciesRequest,
                ListAuditPoliciesResponse>(
                new java.util.function.Supplier<ListAuditPoliciesRequest.Builder>() {
                    @Override
                    public ListAuditPoliciesRequest.Builder get() {
                        return ListAuditPoliciesRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListAuditPoliciesResponse, String>() {
                    @Override
                    public String apply(ListAuditPoliciesResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListAuditPoliciesRequest.Builder>,
                        ListAuditPoliciesRequest>() {
                    @Override
                    public ListAuditPoliciesRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListAuditPoliciesRequest.Builder>
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
                        ListAuditPoliciesRequest, ListAuditPoliciesResponse>() {
                    @Override
                    public ListAuditPoliciesResponse apply(ListAuditPoliciesRequest request) {
                        return client.listAuditPolicies(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link
     * com.oracle.bmc.datasafe.model.AuditPolicySummary} objects contained in responses from the
     * listAuditPolicies operation. This iterable will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link
     *     com.oracle.bmc.datasafe.model.AuditPolicySummary} objects contained in responses received
     *     from the service.
     */
    public Iterable<com.oracle.bmc.datasafe.model.AuditPolicySummary>
            listAuditPoliciesRecordIterator(final ListAuditPoliciesRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListAuditPoliciesRequest.Builder,
                ListAuditPoliciesRequest,
                ListAuditPoliciesResponse,
                com.oracle.bmc.datasafe.model.AuditPolicySummary>(
                new java.util.function.Supplier<ListAuditPoliciesRequest.Builder>() {
                    @Override
                    public ListAuditPoliciesRequest.Builder get() {
                        return ListAuditPoliciesRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListAuditPoliciesResponse, String>() {
                    @Override
                    public String apply(ListAuditPoliciesResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListAuditPoliciesRequest.Builder>,
                        ListAuditPoliciesRequest>() {
                    @Override
                    public ListAuditPoliciesRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListAuditPoliciesRequest.Builder>
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
                        ListAuditPoliciesRequest, ListAuditPoliciesResponse>() {
                    @Override
                    public ListAuditPoliciesResponse apply(ListAuditPoliciesRequest request) {
                        return client.listAuditPolicies(request);
                    }
                },
                new java.util.function.Function<
                        ListAuditPoliciesResponse,
                        java.util.List<com.oracle.bmc.datasafe.model.AuditPolicySummary>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.datasafe.model.AuditPolicySummary> apply(
                            ListAuditPoliciesResponse response) {
                        return response.getAuditPolicyCollection().getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the
     * listAuditPolicyAnalytics operation. This iterable will fetch more data from the server as
     * needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses
     *     received from the service.
     */
    public Iterable<ListAuditPolicyAnalyticsResponse> listAuditPolicyAnalyticsResponseIterator(
            final ListAuditPolicyAnalyticsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListAuditPolicyAnalyticsRequest.Builder,
                ListAuditPolicyAnalyticsRequest,
                ListAuditPolicyAnalyticsResponse>(
                new java.util.function.Supplier<ListAuditPolicyAnalyticsRequest.Builder>() {
                    @Override
                    public ListAuditPolicyAnalyticsRequest.Builder get() {
                        return ListAuditPolicyAnalyticsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListAuditPolicyAnalyticsResponse, String>() {
                    @Override
                    public String apply(ListAuditPolicyAnalyticsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListAuditPolicyAnalyticsRequest.Builder>,
                        ListAuditPolicyAnalyticsRequest>() {
                    @Override
                    public ListAuditPolicyAnalyticsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListAuditPolicyAnalyticsRequest.Builder>
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
                        ListAuditPolicyAnalyticsRequest, ListAuditPolicyAnalyticsResponse>() {
                    @Override
                    public ListAuditPolicyAnalyticsResponse apply(
                            ListAuditPolicyAnalyticsRequest request) {
                        return client.listAuditPolicyAnalytics(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link
     * com.oracle.bmc.datasafe.model.AuditPolicyAggregationItems} objects contained in responses
     * from the listAuditPolicyAnalytics operation. This iterable will fetch more data from the
     * server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link
     *     com.oracle.bmc.datasafe.model.AuditPolicyAggregationItems} objects contained in responses
     *     received from the service.
     */
    public Iterable<com.oracle.bmc.datasafe.model.AuditPolicyAggregationItems>
            listAuditPolicyAnalyticsRecordIterator(final ListAuditPolicyAnalyticsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListAuditPolicyAnalyticsRequest.Builder,
                ListAuditPolicyAnalyticsRequest,
                ListAuditPolicyAnalyticsResponse,
                com.oracle.bmc.datasafe.model.AuditPolicyAggregationItems>(
                new java.util.function.Supplier<ListAuditPolicyAnalyticsRequest.Builder>() {
                    @Override
                    public ListAuditPolicyAnalyticsRequest.Builder get() {
                        return ListAuditPolicyAnalyticsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListAuditPolicyAnalyticsResponse, String>() {
                    @Override
                    public String apply(ListAuditPolicyAnalyticsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListAuditPolicyAnalyticsRequest.Builder>,
                        ListAuditPolicyAnalyticsRequest>() {
                    @Override
                    public ListAuditPolicyAnalyticsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListAuditPolicyAnalyticsRequest.Builder>
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
                        ListAuditPolicyAnalyticsRequest, ListAuditPolicyAnalyticsResponse>() {
                    @Override
                    public ListAuditPolicyAnalyticsResponse apply(
                            ListAuditPolicyAnalyticsRequest request) {
                        return client.listAuditPolicyAnalytics(request);
                    }
                },
                new java.util.function.Function<
                        ListAuditPolicyAnalyticsResponse,
                        java.util.List<
                                com.oracle.bmc.datasafe.model.AuditPolicyAggregationItems>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.datasafe.model.AuditPolicyAggregationItems>
                            apply(ListAuditPolicyAnalyticsResponse response) {
                        return response.getAuditPolicyAnalyticCollection().getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the
     * listAuditProfileAnalytics operation. This iterable will fetch more data from the server as
     * needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses
     *     received from the service.
     */
    public Iterable<ListAuditProfileAnalyticsResponse> listAuditProfileAnalyticsResponseIterator(
            final ListAuditProfileAnalyticsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListAuditProfileAnalyticsRequest.Builder,
                ListAuditProfileAnalyticsRequest,
                ListAuditProfileAnalyticsResponse>(
                new java.util.function.Supplier<ListAuditProfileAnalyticsRequest.Builder>() {
                    @Override
                    public ListAuditProfileAnalyticsRequest.Builder get() {
                        return ListAuditProfileAnalyticsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListAuditProfileAnalyticsResponse, String>() {
                    @Override
                    public String apply(ListAuditProfileAnalyticsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListAuditProfileAnalyticsRequest.Builder>,
                        ListAuditProfileAnalyticsRequest>() {
                    @Override
                    public ListAuditProfileAnalyticsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListAuditProfileAnalyticsRequest.Builder>
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
                        ListAuditProfileAnalyticsRequest, ListAuditProfileAnalyticsResponse>() {
                    @Override
                    public ListAuditProfileAnalyticsResponse apply(
                            ListAuditProfileAnalyticsRequest request) {
                        return client.listAuditProfileAnalytics(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link
     * com.oracle.bmc.datasafe.model.AuditProfileAggregationItems} objects contained in responses
     * from the listAuditProfileAnalytics operation. This iterable will fetch more data from the
     * server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link
     *     com.oracle.bmc.datasafe.model.AuditProfileAggregationItems} objects contained in
     *     responses received from the service.
     */
    public Iterable<com.oracle.bmc.datasafe.model.AuditProfileAggregationItems>
            listAuditProfileAnalyticsRecordIterator(
                    final ListAuditProfileAnalyticsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListAuditProfileAnalyticsRequest.Builder,
                ListAuditProfileAnalyticsRequest,
                ListAuditProfileAnalyticsResponse,
                com.oracle.bmc.datasafe.model.AuditProfileAggregationItems>(
                new java.util.function.Supplier<ListAuditProfileAnalyticsRequest.Builder>() {
                    @Override
                    public ListAuditProfileAnalyticsRequest.Builder get() {
                        return ListAuditProfileAnalyticsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListAuditProfileAnalyticsResponse, String>() {
                    @Override
                    public String apply(ListAuditProfileAnalyticsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListAuditProfileAnalyticsRequest.Builder>,
                        ListAuditProfileAnalyticsRequest>() {
                    @Override
                    public ListAuditProfileAnalyticsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListAuditProfileAnalyticsRequest.Builder>
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
                        ListAuditProfileAnalyticsRequest, ListAuditProfileAnalyticsResponse>() {
                    @Override
                    public ListAuditProfileAnalyticsResponse apply(
                            ListAuditProfileAnalyticsRequest request) {
                        return client.listAuditProfileAnalytics(request);
                    }
                },
                new java.util.function.Function<
                        ListAuditProfileAnalyticsResponse,
                        java.util.List<
                                com.oracle.bmc.datasafe.model.AuditProfileAggregationItems>>() {
                    @Override
                    public java.util.List<
                                    com.oracle.bmc.datasafe.model.AuditProfileAggregationItems>
                            apply(ListAuditProfileAnalyticsResponse response) {
                        return response.getAuditProfileAnalyticCollection().getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the
     * listAuditProfiles operation. This iterable will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses
     *     received from the service.
     */
    public Iterable<ListAuditProfilesResponse> listAuditProfilesResponseIterator(
            final ListAuditProfilesRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListAuditProfilesRequest.Builder,
                ListAuditProfilesRequest,
                ListAuditProfilesResponse>(
                new java.util.function.Supplier<ListAuditProfilesRequest.Builder>() {
                    @Override
                    public ListAuditProfilesRequest.Builder get() {
                        return ListAuditProfilesRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListAuditProfilesResponse, String>() {
                    @Override
                    public String apply(ListAuditProfilesResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListAuditProfilesRequest.Builder>,
                        ListAuditProfilesRequest>() {
                    @Override
                    public ListAuditProfilesRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListAuditProfilesRequest.Builder>
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
                        ListAuditProfilesRequest, ListAuditProfilesResponse>() {
                    @Override
                    public ListAuditProfilesResponse apply(ListAuditProfilesRequest request) {
                        return client.listAuditProfiles(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link
     * com.oracle.bmc.datasafe.model.AuditProfileSummary} objects contained in responses from the
     * listAuditProfiles operation. This iterable will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link
     *     com.oracle.bmc.datasafe.model.AuditProfileSummary} objects contained in responses
     *     received from the service.
     */
    public Iterable<com.oracle.bmc.datasafe.model.AuditProfileSummary>
            listAuditProfilesRecordIterator(final ListAuditProfilesRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListAuditProfilesRequest.Builder,
                ListAuditProfilesRequest,
                ListAuditProfilesResponse,
                com.oracle.bmc.datasafe.model.AuditProfileSummary>(
                new java.util.function.Supplier<ListAuditProfilesRequest.Builder>() {
                    @Override
                    public ListAuditProfilesRequest.Builder get() {
                        return ListAuditProfilesRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListAuditProfilesResponse, String>() {
                    @Override
                    public String apply(ListAuditProfilesResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListAuditProfilesRequest.Builder>,
                        ListAuditProfilesRequest>() {
                    @Override
                    public ListAuditProfilesRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListAuditProfilesRequest.Builder>
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
                        ListAuditProfilesRequest, ListAuditProfilesResponse>() {
                    @Override
                    public ListAuditProfilesResponse apply(ListAuditProfilesRequest request) {
                        return client.listAuditProfiles(request);
                    }
                },
                new java.util.function.Function<
                        ListAuditProfilesResponse,
                        java.util.List<com.oracle.bmc.datasafe.model.AuditProfileSummary>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.datasafe.model.AuditProfileSummary> apply(
                            ListAuditProfilesResponse response) {
                        return response.getAuditProfileCollection().getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the
     * listAuditTrailAnalytics operation. This iterable will fetch more data from the server as
     * needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses
     *     received from the service.
     */
    public Iterable<ListAuditTrailAnalyticsResponse> listAuditTrailAnalyticsResponseIterator(
            final ListAuditTrailAnalyticsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListAuditTrailAnalyticsRequest.Builder,
                ListAuditTrailAnalyticsRequest,
                ListAuditTrailAnalyticsResponse>(
                new java.util.function.Supplier<ListAuditTrailAnalyticsRequest.Builder>() {
                    @Override
                    public ListAuditTrailAnalyticsRequest.Builder get() {
                        return ListAuditTrailAnalyticsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListAuditTrailAnalyticsResponse, String>() {
                    @Override
                    public String apply(ListAuditTrailAnalyticsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListAuditTrailAnalyticsRequest.Builder>,
                        ListAuditTrailAnalyticsRequest>() {
                    @Override
                    public ListAuditTrailAnalyticsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListAuditTrailAnalyticsRequest.Builder>
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
                        ListAuditTrailAnalyticsRequest, ListAuditTrailAnalyticsResponse>() {
                    @Override
                    public ListAuditTrailAnalyticsResponse apply(
                            ListAuditTrailAnalyticsRequest request) {
                        return client.listAuditTrailAnalytics(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link
     * com.oracle.bmc.datasafe.model.AuditTrailAggregationItems} objects contained in responses from
     * the listAuditTrailAnalytics operation. This iterable will fetch more data from the server as
     * needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link
     *     com.oracle.bmc.datasafe.model.AuditTrailAggregationItems} objects contained in responses
     *     received from the service.
     */
    public Iterable<com.oracle.bmc.datasafe.model.AuditTrailAggregationItems>
            listAuditTrailAnalyticsRecordIterator(final ListAuditTrailAnalyticsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListAuditTrailAnalyticsRequest.Builder,
                ListAuditTrailAnalyticsRequest,
                ListAuditTrailAnalyticsResponse,
                com.oracle.bmc.datasafe.model.AuditTrailAggregationItems>(
                new java.util.function.Supplier<ListAuditTrailAnalyticsRequest.Builder>() {
                    @Override
                    public ListAuditTrailAnalyticsRequest.Builder get() {
                        return ListAuditTrailAnalyticsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListAuditTrailAnalyticsResponse, String>() {
                    @Override
                    public String apply(ListAuditTrailAnalyticsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListAuditTrailAnalyticsRequest.Builder>,
                        ListAuditTrailAnalyticsRequest>() {
                    @Override
                    public ListAuditTrailAnalyticsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListAuditTrailAnalyticsRequest.Builder>
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
                        ListAuditTrailAnalyticsRequest, ListAuditTrailAnalyticsResponse>() {
                    @Override
                    public ListAuditTrailAnalyticsResponse apply(
                            ListAuditTrailAnalyticsRequest request) {
                        return client.listAuditTrailAnalytics(request);
                    }
                },
                new java.util.function.Function<
                        ListAuditTrailAnalyticsResponse,
                        java.util.List<
                                com.oracle.bmc.datasafe.model.AuditTrailAggregationItems>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.datasafe.model.AuditTrailAggregationItems>
                            apply(ListAuditTrailAnalyticsResponse response) {
                        return response.getAuditTrailAnalyticCollection().getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the
     * listAuditTrails operation. This iterable will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses
     *     received from the service.
     */
    public Iterable<ListAuditTrailsResponse> listAuditTrailsResponseIterator(
            final ListAuditTrailsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListAuditTrailsRequest.Builder, ListAuditTrailsRequest, ListAuditTrailsResponse>(
                new java.util.function.Supplier<ListAuditTrailsRequest.Builder>() {
                    @Override
                    public ListAuditTrailsRequest.Builder get() {
                        return ListAuditTrailsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListAuditTrailsResponse, String>() {
                    @Override
                    public String apply(ListAuditTrailsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListAuditTrailsRequest.Builder>,
                        ListAuditTrailsRequest>() {
                    @Override
                    public ListAuditTrailsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListAuditTrailsRequest.Builder>
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
                new java.util.function.Function<ListAuditTrailsRequest, ListAuditTrailsResponse>() {
                    @Override
                    public ListAuditTrailsResponse apply(ListAuditTrailsRequest request) {
                        return client.listAuditTrails(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link
     * com.oracle.bmc.datasafe.model.AuditTrailSummary} objects contained in responses from the
     * listAuditTrails operation. This iterable will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link
     *     com.oracle.bmc.datasafe.model.AuditTrailSummary} objects contained in responses received
     *     from the service.
     */
    public Iterable<com.oracle.bmc.datasafe.model.AuditTrailSummary> listAuditTrailsRecordIterator(
            final ListAuditTrailsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListAuditTrailsRequest.Builder,
                ListAuditTrailsRequest,
                ListAuditTrailsResponse,
                com.oracle.bmc.datasafe.model.AuditTrailSummary>(
                new java.util.function.Supplier<ListAuditTrailsRequest.Builder>() {
                    @Override
                    public ListAuditTrailsRequest.Builder get() {
                        return ListAuditTrailsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListAuditTrailsResponse, String>() {
                    @Override
                    public String apply(ListAuditTrailsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListAuditTrailsRequest.Builder>,
                        ListAuditTrailsRequest>() {
                    @Override
                    public ListAuditTrailsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListAuditTrailsRequest.Builder>
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
                new java.util.function.Function<ListAuditTrailsRequest, ListAuditTrailsResponse>() {
                    @Override
                    public ListAuditTrailsResponse apply(ListAuditTrailsRequest request) {
                        return client.listAuditTrails(request);
                    }
                },
                new java.util.function.Function<
                        ListAuditTrailsResponse,
                        java.util.List<com.oracle.bmc.datasafe.model.AuditTrailSummary>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.datasafe.model.AuditTrailSummary> apply(
                            ListAuditTrailsResponse response) {
                        return response.getAuditTrailCollection().getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the
     * listAvailableAuditVolumes operation. This iterable will fetch more data from the server as
     * needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses
     *     received from the service.
     */
    public Iterable<ListAvailableAuditVolumesResponse> listAvailableAuditVolumesResponseIterator(
            final ListAvailableAuditVolumesRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListAvailableAuditVolumesRequest.Builder,
                ListAvailableAuditVolumesRequest,
                ListAvailableAuditVolumesResponse>(
                new java.util.function.Supplier<ListAvailableAuditVolumesRequest.Builder>() {
                    @Override
                    public ListAvailableAuditVolumesRequest.Builder get() {
                        return ListAvailableAuditVolumesRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListAvailableAuditVolumesResponse, String>() {
                    @Override
                    public String apply(ListAvailableAuditVolumesResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListAvailableAuditVolumesRequest.Builder>,
                        ListAvailableAuditVolumesRequest>() {
                    @Override
                    public ListAvailableAuditVolumesRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListAvailableAuditVolumesRequest.Builder>
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
                        ListAvailableAuditVolumesRequest, ListAvailableAuditVolumesResponse>() {
                    @Override
                    public ListAvailableAuditVolumesResponse apply(
                            ListAvailableAuditVolumesRequest request) {
                        return client.listAvailableAuditVolumes(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link
     * com.oracle.bmc.datasafe.model.AvailableAuditVolumeSummary} objects contained in responses
     * from the listAvailableAuditVolumes operation. This iterable will fetch more data from the
     * server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link
     *     com.oracle.bmc.datasafe.model.AvailableAuditVolumeSummary} objects contained in responses
     *     received from the service.
     */
    public Iterable<com.oracle.bmc.datasafe.model.AvailableAuditVolumeSummary>
            listAvailableAuditVolumesRecordIterator(
                    final ListAvailableAuditVolumesRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListAvailableAuditVolumesRequest.Builder,
                ListAvailableAuditVolumesRequest,
                ListAvailableAuditVolumesResponse,
                com.oracle.bmc.datasafe.model.AvailableAuditVolumeSummary>(
                new java.util.function.Supplier<ListAvailableAuditVolumesRequest.Builder>() {
                    @Override
                    public ListAvailableAuditVolumesRequest.Builder get() {
                        return ListAvailableAuditVolumesRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListAvailableAuditVolumesResponse, String>() {
                    @Override
                    public String apply(ListAvailableAuditVolumesResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListAvailableAuditVolumesRequest.Builder>,
                        ListAvailableAuditVolumesRequest>() {
                    @Override
                    public ListAvailableAuditVolumesRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListAvailableAuditVolumesRequest.Builder>
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
                        ListAvailableAuditVolumesRequest, ListAvailableAuditVolumesResponse>() {
                    @Override
                    public ListAvailableAuditVolumesResponse apply(
                            ListAvailableAuditVolumesRequest request) {
                        return client.listAvailableAuditVolumes(request);
                    }
                },
                new java.util.function.Function<
                        ListAvailableAuditVolumesResponse,
                        java.util.List<
                                com.oracle.bmc.datasafe.model.AvailableAuditVolumeSummary>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.datasafe.model.AvailableAuditVolumeSummary>
                            apply(ListAvailableAuditVolumesResponse response) {
                        return response.getAvailableAuditVolumeCollection().getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the
     * listCollectedAuditVolumes operation. This iterable will fetch more data from the server as
     * needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses
     *     received from the service.
     */
    public Iterable<ListCollectedAuditVolumesResponse> listCollectedAuditVolumesResponseIterator(
            final ListCollectedAuditVolumesRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListCollectedAuditVolumesRequest.Builder,
                ListCollectedAuditVolumesRequest,
                ListCollectedAuditVolumesResponse>(
                new java.util.function.Supplier<ListCollectedAuditVolumesRequest.Builder>() {
                    @Override
                    public ListCollectedAuditVolumesRequest.Builder get() {
                        return ListCollectedAuditVolumesRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListCollectedAuditVolumesResponse, String>() {
                    @Override
                    public String apply(ListCollectedAuditVolumesResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListCollectedAuditVolumesRequest.Builder>,
                        ListCollectedAuditVolumesRequest>() {
                    @Override
                    public ListCollectedAuditVolumesRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListCollectedAuditVolumesRequest.Builder>
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
                        ListCollectedAuditVolumesRequest, ListCollectedAuditVolumesResponse>() {
                    @Override
                    public ListCollectedAuditVolumesResponse apply(
                            ListCollectedAuditVolumesRequest request) {
                        return client.listCollectedAuditVolumes(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link
     * com.oracle.bmc.datasafe.model.CollectedAuditVolumeSummary} objects contained in responses
     * from the listCollectedAuditVolumes operation. This iterable will fetch more data from the
     * server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link
     *     com.oracle.bmc.datasafe.model.CollectedAuditVolumeSummary} objects contained in responses
     *     received from the service.
     */
    public Iterable<com.oracle.bmc.datasafe.model.CollectedAuditVolumeSummary>
            listCollectedAuditVolumesRecordIterator(
                    final ListCollectedAuditVolumesRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListCollectedAuditVolumesRequest.Builder,
                ListCollectedAuditVolumesRequest,
                ListCollectedAuditVolumesResponse,
                com.oracle.bmc.datasafe.model.CollectedAuditVolumeSummary>(
                new java.util.function.Supplier<ListCollectedAuditVolumesRequest.Builder>() {
                    @Override
                    public ListCollectedAuditVolumesRequest.Builder get() {
                        return ListCollectedAuditVolumesRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListCollectedAuditVolumesResponse, String>() {
                    @Override
                    public String apply(ListCollectedAuditVolumesResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListCollectedAuditVolumesRequest.Builder>,
                        ListCollectedAuditVolumesRequest>() {
                    @Override
                    public ListCollectedAuditVolumesRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListCollectedAuditVolumesRequest.Builder>
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
                        ListCollectedAuditVolumesRequest, ListCollectedAuditVolumesResponse>() {
                    @Override
                    public ListCollectedAuditVolumesResponse apply(
                            ListCollectedAuditVolumesRequest request) {
                        return client.listCollectedAuditVolumes(request);
                    }
                },
                new java.util.function.Function<
                        ListCollectedAuditVolumesResponse,
                        java.util.List<
                                com.oracle.bmc.datasafe.model.CollectedAuditVolumeSummary>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.datasafe.model.CollectedAuditVolumeSummary>
                            apply(ListCollectedAuditVolumesResponse response) {
                        return response.getCollectedAuditVolumeCollection().getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the listColumns
     * operation. This iterable will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses
     *     received from the service.
     */
    public Iterable<ListColumnsResponse> listColumnsResponseIterator(
            final ListColumnsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListColumnsRequest.Builder, ListColumnsRequest, ListColumnsResponse>(
                new java.util.function.Supplier<ListColumnsRequest.Builder>() {
                    @Override
                    public ListColumnsRequest.Builder get() {
                        return ListColumnsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListColumnsResponse, String>() {
                    @Override
                    public String apply(ListColumnsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListColumnsRequest.Builder>,
                        ListColumnsRequest>() {
                    @Override
                    public ListColumnsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListColumnsRequest.Builder>
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
                new java.util.function.Function<ListColumnsRequest, ListColumnsResponse>() {
                    @Override
                    public ListColumnsResponse apply(ListColumnsRequest request) {
                        return client.listColumns(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link
     * com.oracle.bmc.datasafe.model.ColumnSummary} objects contained in responses from the
     * listColumns operation. This iterable will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link
     *     com.oracle.bmc.datasafe.model.ColumnSummary} objects contained in responses received from
     *     the service.
     */
    public Iterable<com.oracle.bmc.datasafe.model.ColumnSummary> listColumnsRecordIterator(
            final ListColumnsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListColumnsRequest.Builder,
                ListColumnsRequest,
                ListColumnsResponse,
                com.oracle.bmc.datasafe.model.ColumnSummary>(
                new java.util.function.Supplier<ListColumnsRequest.Builder>() {
                    @Override
                    public ListColumnsRequest.Builder get() {
                        return ListColumnsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListColumnsResponse, String>() {
                    @Override
                    public String apply(ListColumnsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListColumnsRequest.Builder>,
                        ListColumnsRequest>() {
                    @Override
                    public ListColumnsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListColumnsRequest.Builder>
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
                new java.util.function.Function<ListColumnsRequest, ListColumnsResponse>() {
                    @Override
                    public ListColumnsResponse apply(ListColumnsRequest request) {
                        return client.listColumns(request);
                    }
                },
                new java.util.function.Function<
                        ListColumnsResponse,
                        java.util.List<com.oracle.bmc.datasafe.model.ColumnSummary>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.datasafe.model.ColumnSummary> apply(
                            ListColumnsResponse response) {
                        return response.getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the
     * listDataSafePrivateEndpoints operation. This iterable will fetch more data from the server as
     * needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses
     *     received from the service.
     */
    public Iterable<ListDataSafePrivateEndpointsResponse>
            listDataSafePrivateEndpointsResponseIterator(
                    final ListDataSafePrivateEndpointsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListDataSafePrivateEndpointsRequest.Builder,
                ListDataSafePrivateEndpointsRequest,
                ListDataSafePrivateEndpointsResponse>(
                new java.util.function.Supplier<ListDataSafePrivateEndpointsRequest.Builder>() {
                    @Override
                    public ListDataSafePrivateEndpointsRequest.Builder get() {
                        return ListDataSafePrivateEndpointsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListDataSafePrivateEndpointsResponse, String>() {
                    @Override
                    public String apply(ListDataSafePrivateEndpointsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListDataSafePrivateEndpointsRequest.Builder>,
                        ListDataSafePrivateEndpointsRequest>() {
                    @Override
                    public ListDataSafePrivateEndpointsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListDataSafePrivateEndpointsRequest.Builder>
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
                        ListDataSafePrivateEndpointsRequest,
                        ListDataSafePrivateEndpointsResponse>() {
                    @Override
                    public ListDataSafePrivateEndpointsResponse apply(
                            ListDataSafePrivateEndpointsRequest request) {
                        return client.listDataSafePrivateEndpoints(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link
     * com.oracle.bmc.datasafe.model.DataSafePrivateEndpointSummary} objects contained in responses
     * from the listDataSafePrivateEndpoints operation. This iterable will fetch more data from the
     * server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link
     *     com.oracle.bmc.datasafe.model.DataSafePrivateEndpointSummary} objects contained in
     *     responses received from the service.
     */
    public Iterable<com.oracle.bmc.datasafe.model.DataSafePrivateEndpointSummary>
            listDataSafePrivateEndpointsRecordIterator(
                    final ListDataSafePrivateEndpointsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListDataSafePrivateEndpointsRequest.Builder,
                ListDataSafePrivateEndpointsRequest,
                ListDataSafePrivateEndpointsResponse,
                com.oracle.bmc.datasafe.model.DataSafePrivateEndpointSummary>(
                new java.util.function.Supplier<ListDataSafePrivateEndpointsRequest.Builder>() {
                    @Override
                    public ListDataSafePrivateEndpointsRequest.Builder get() {
                        return ListDataSafePrivateEndpointsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListDataSafePrivateEndpointsResponse, String>() {
                    @Override
                    public String apply(ListDataSafePrivateEndpointsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListDataSafePrivateEndpointsRequest.Builder>,
                        ListDataSafePrivateEndpointsRequest>() {
                    @Override
                    public ListDataSafePrivateEndpointsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListDataSafePrivateEndpointsRequest.Builder>
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
                        ListDataSafePrivateEndpointsRequest,
                        ListDataSafePrivateEndpointsResponse>() {
                    @Override
                    public ListDataSafePrivateEndpointsResponse apply(
                            ListDataSafePrivateEndpointsRequest request) {
                        return client.listDataSafePrivateEndpoints(request);
                    }
                },
                new java.util.function.Function<
                        ListDataSafePrivateEndpointsResponse,
                        java.util.List<
                                com.oracle.bmc.datasafe.model.DataSafePrivateEndpointSummary>>() {
                    @Override
                    public java.util.List<
                                    com.oracle.bmc.datasafe.model.DataSafePrivateEndpointSummary>
                            apply(ListDataSafePrivateEndpointsResponse response) {
                        return response.getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the
     * listDatabaseSecurityConfigs operation. This iterable will fetch more data from the server as
     * needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses
     *     received from the service.
     */
    public Iterable<ListDatabaseSecurityConfigsResponse>
            listDatabaseSecurityConfigsResponseIterator(
                    final ListDatabaseSecurityConfigsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListDatabaseSecurityConfigsRequest.Builder,
                ListDatabaseSecurityConfigsRequest,
                ListDatabaseSecurityConfigsResponse>(
                new java.util.function.Supplier<ListDatabaseSecurityConfigsRequest.Builder>() {
                    @Override
                    public ListDatabaseSecurityConfigsRequest.Builder get() {
                        return ListDatabaseSecurityConfigsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListDatabaseSecurityConfigsResponse, String>() {
                    @Override
                    public String apply(ListDatabaseSecurityConfigsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListDatabaseSecurityConfigsRequest.Builder>,
                        ListDatabaseSecurityConfigsRequest>() {
                    @Override
                    public ListDatabaseSecurityConfigsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListDatabaseSecurityConfigsRequest.Builder>
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
                        ListDatabaseSecurityConfigsRequest, ListDatabaseSecurityConfigsResponse>() {
                    @Override
                    public ListDatabaseSecurityConfigsResponse apply(
                            ListDatabaseSecurityConfigsRequest request) {
                        return client.listDatabaseSecurityConfigs(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link
     * com.oracle.bmc.datasafe.model.DatabaseSecurityConfigSummary} objects contained in responses
     * from the listDatabaseSecurityConfigs operation. This iterable will fetch more data from the
     * server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link
     *     com.oracle.bmc.datasafe.model.DatabaseSecurityConfigSummary} objects contained in
     *     responses received from the service.
     */
    public Iterable<com.oracle.bmc.datasafe.model.DatabaseSecurityConfigSummary>
            listDatabaseSecurityConfigsRecordIterator(
                    final ListDatabaseSecurityConfigsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListDatabaseSecurityConfigsRequest.Builder,
                ListDatabaseSecurityConfigsRequest,
                ListDatabaseSecurityConfigsResponse,
                com.oracle.bmc.datasafe.model.DatabaseSecurityConfigSummary>(
                new java.util.function.Supplier<ListDatabaseSecurityConfigsRequest.Builder>() {
                    @Override
                    public ListDatabaseSecurityConfigsRequest.Builder get() {
                        return ListDatabaseSecurityConfigsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListDatabaseSecurityConfigsResponse, String>() {
                    @Override
                    public String apply(ListDatabaseSecurityConfigsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListDatabaseSecurityConfigsRequest.Builder>,
                        ListDatabaseSecurityConfigsRequest>() {
                    @Override
                    public ListDatabaseSecurityConfigsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListDatabaseSecurityConfigsRequest.Builder>
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
                        ListDatabaseSecurityConfigsRequest, ListDatabaseSecurityConfigsResponse>() {
                    @Override
                    public ListDatabaseSecurityConfigsResponse apply(
                            ListDatabaseSecurityConfigsRequest request) {
                        return client.listDatabaseSecurityConfigs(request);
                    }
                },
                new java.util.function.Function<
                        ListDatabaseSecurityConfigsResponse,
                        java.util.List<
                                com.oracle.bmc.datasafe.model.DatabaseSecurityConfigSummary>>() {
                    @Override
                    public java.util.List<
                                    com.oracle.bmc.datasafe.model.DatabaseSecurityConfigSummary>
                            apply(ListDatabaseSecurityConfigsResponse response) {
                        return response.getDatabaseSecurityConfigCollection().getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the
     * listDifferenceColumns operation. This iterable will fetch more data from the server as
     * needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses
     *     received from the service.
     */
    public Iterable<ListDifferenceColumnsResponse> listDifferenceColumnsResponseIterator(
            final ListDifferenceColumnsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListDifferenceColumnsRequest.Builder,
                ListDifferenceColumnsRequest,
                ListDifferenceColumnsResponse>(
                new java.util.function.Supplier<ListDifferenceColumnsRequest.Builder>() {
                    @Override
                    public ListDifferenceColumnsRequest.Builder get() {
                        return ListDifferenceColumnsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListDifferenceColumnsResponse, String>() {
                    @Override
                    public String apply(ListDifferenceColumnsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListDifferenceColumnsRequest.Builder>,
                        ListDifferenceColumnsRequest>() {
                    @Override
                    public ListDifferenceColumnsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListDifferenceColumnsRequest.Builder>
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
                        ListDifferenceColumnsRequest, ListDifferenceColumnsResponse>() {
                    @Override
                    public ListDifferenceColumnsResponse apply(
                            ListDifferenceColumnsRequest request) {
                        return client.listDifferenceColumns(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link
     * com.oracle.bmc.datasafe.model.DifferenceColumnSummary} objects contained in responses from
     * the listDifferenceColumns operation. This iterable will fetch more data from the server as
     * needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link
     *     com.oracle.bmc.datasafe.model.DifferenceColumnSummary} objects contained in responses
     *     received from the service.
     */
    public Iterable<com.oracle.bmc.datasafe.model.DifferenceColumnSummary>
            listDifferenceColumnsRecordIterator(final ListDifferenceColumnsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListDifferenceColumnsRequest.Builder,
                ListDifferenceColumnsRequest,
                ListDifferenceColumnsResponse,
                com.oracle.bmc.datasafe.model.DifferenceColumnSummary>(
                new java.util.function.Supplier<ListDifferenceColumnsRequest.Builder>() {
                    @Override
                    public ListDifferenceColumnsRequest.Builder get() {
                        return ListDifferenceColumnsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListDifferenceColumnsResponse, String>() {
                    @Override
                    public String apply(ListDifferenceColumnsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListDifferenceColumnsRequest.Builder>,
                        ListDifferenceColumnsRequest>() {
                    @Override
                    public ListDifferenceColumnsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListDifferenceColumnsRequest.Builder>
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
                        ListDifferenceColumnsRequest, ListDifferenceColumnsResponse>() {
                    @Override
                    public ListDifferenceColumnsResponse apply(
                            ListDifferenceColumnsRequest request) {
                        return client.listDifferenceColumns(request);
                    }
                },
                new java.util.function.Function<
                        ListDifferenceColumnsResponse,
                        java.util.List<com.oracle.bmc.datasafe.model.DifferenceColumnSummary>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.datasafe.model.DifferenceColumnSummary>
                            apply(ListDifferenceColumnsResponse response) {
                        return response.getSdmMaskingPolicyDifferenceColumnCollection().getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the
     * listDiscoveryAnalytics operation. This iterable will fetch more data from the server as
     * needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses
     *     received from the service.
     */
    public Iterable<ListDiscoveryAnalyticsResponse> listDiscoveryAnalyticsResponseIterator(
            final ListDiscoveryAnalyticsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListDiscoveryAnalyticsRequest.Builder,
                ListDiscoveryAnalyticsRequest,
                ListDiscoveryAnalyticsResponse>(
                new java.util.function.Supplier<ListDiscoveryAnalyticsRequest.Builder>() {
                    @Override
                    public ListDiscoveryAnalyticsRequest.Builder get() {
                        return ListDiscoveryAnalyticsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListDiscoveryAnalyticsResponse, String>() {
                    @Override
                    public String apply(ListDiscoveryAnalyticsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListDiscoveryAnalyticsRequest.Builder>,
                        ListDiscoveryAnalyticsRequest>() {
                    @Override
                    public ListDiscoveryAnalyticsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListDiscoveryAnalyticsRequest.Builder>
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
                        ListDiscoveryAnalyticsRequest, ListDiscoveryAnalyticsResponse>() {
                    @Override
                    public ListDiscoveryAnalyticsResponse apply(
                            ListDiscoveryAnalyticsRequest request) {
                        return client.listDiscoveryAnalytics(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link
     * com.oracle.bmc.datasafe.model.DiscoveryAnalyticsSummary} objects contained in responses from
     * the listDiscoveryAnalytics operation. This iterable will fetch more data from the server as
     * needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link
     *     com.oracle.bmc.datasafe.model.DiscoveryAnalyticsSummary} objects contained in responses
     *     received from the service.
     */
    public Iterable<com.oracle.bmc.datasafe.model.DiscoveryAnalyticsSummary>
            listDiscoveryAnalyticsRecordIterator(final ListDiscoveryAnalyticsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListDiscoveryAnalyticsRequest.Builder,
                ListDiscoveryAnalyticsRequest,
                ListDiscoveryAnalyticsResponse,
                com.oracle.bmc.datasafe.model.DiscoveryAnalyticsSummary>(
                new java.util.function.Supplier<ListDiscoveryAnalyticsRequest.Builder>() {
                    @Override
                    public ListDiscoveryAnalyticsRequest.Builder get() {
                        return ListDiscoveryAnalyticsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListDiscoveryAnalyticsResponse, String>() {
                    @Override
                    public String apply(ListDiscoveryAnalyticsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListDiscoveryAnalyticsRequest.Builder>,
                        ListDiscoveryAnalyticsRequest>() {
                    @Override
                    public ListDiscoveryAnalyticsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListDiscoveryAnalyticsRequest.Builder>
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
                        ListDiscoveryAnalyticsRequest, ListDiscoveryAnalyticsResponse>() {
                    @Override
                    public ListDiscoveryAnalyticsResponse apply(
                            ListDiscoveryAnalyticsRequest request) {
                        return client.listDiscoveryAnalytics(request);
                    }
                },
                new java.util.function.Function<
                        ListDiscoveryAnalyticsResponse,
                        java.util.List<com.oracle.bmc.datasafe.model.DiscoveryAnalyticsSummary>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.datasafe.model.DiscoveryAnalyticsSummary>
                            apply(ListDiscoveryAnalyticsResponse response) {
                        return response.getDiscoveryAnalyticsCollection().getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the
     * listDiscoveryJobResults operation. This iterable will fetch more data from the server as
     * needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses
     *     received from the service.
     */
    public Iterable<ListDiscoveryJobResultsResponse> listDiscoveryJobResultsResponseIterator(
            final ListDiscoveryJobResultsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListDiscoveryJobResultsRequest.Builder,
                ListDiscoveryJobResultsRequest,
                ListDiscoveryJobResultsResponse>(
                new java.util.function.Supplier<ListDiscoveryJobResultsRequest.Builder>() {
                    @Override
                    public ListDiscoveryJobResultsRequest.Builder get() {
                        return ListDiscoveryJobResultsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListDiscoveryJobResultsResponse, String>() {
                    @Override
                    public String apply(ListDiscoveryJobResultsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListDiscoveryJobResultsRequest.Builder>,
                        ListDiscoveryJobResultsRequest>() {
                    @Override
                    public ListDiscoveryJobResultsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListDiscoveryJobResultsRequest.Builder>
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
                        ListDiscoveryJobResultsRequest, ListDiscoveryJobResultsResponse>() {
                    @Override
                    public ListDiscoveryJobResultsResponse apply(
                            ListDiscoveryJobResultsRequest request) {
                        return client.listDiscoveryJobResults(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link
     * com.oracle.bmc.datasafe.model.DiscoveryJobResultSummary} objects contained in responses from
     * the listDiscoveryJobResults operation. This iterable will fetch more data from the server as
     * needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link
     *     com.oracle.bmc.datasafe.model.DiscoveryJobResultSummary} objects contained in responses
     *     received from the service.
     */
    public Iterable<com.oracle.bmc.datasafe.model.DiscoveryJobResultSummary>
            listDiscoveryJobResultsRecordIterator(final ListDiscoveryJobResultsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListDiscoveryJobResultsRequest.Builder,
                ListDiscoveryJobResultsRequest,
                ListDiscoveryJobResultsResponse,
                com.oracle.bmc.datasafe.model.DiscoveryJobResultSummary>(
                new java.util.function.Supplier<ListDiscoveryJobResultsRequest.Builder>() {
                    @Override
                    public ListDiscoveryJobResultsRequest.Builder get() {
                        return ListDiscoveryJobResultsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListDiscoveryJobResultsResponse, String>() {
                    @Override
                    public String apply(ListDiscoveryJobResultsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListDiscoveryJobResultsRequest.Builder>,
                        ListDiscoveryJobResultsRequest>() {
                    @Override
                    public ListDiscoveryJobResultsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListDiscoveryJobResultsRequest.Builder>
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
                        ListDiscoveryJobResultsRequest, ListDiscoveryJobResultsResponse>() {
                    @Override
                    public ListDiscoveryJobResultsResponse apply(
                            ListDiscoveryJobResultsRequest request) {
                        return client.listDiscoveryJobResults(request);
                    }
                },
                new java.util.function.Function<
                        ListDiscoveryJobResultsResponse,
                        java.util.List<com.oracle.bmc.datasafe.model.DiscoveryJobResultSummary>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.datasafe.model.DiscoveryJobResultSummary>
                            apply(ListDiscoveryJobResultsResponse response) {
                        return response.getDiscoveryJobResultCollection().getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the
     * listDiscoveryJobs operation. This iterable will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses
     *     received from the service.
     */
    public Iterable<ListDiscoveryJobsResponse> listDiscoveryJobsResponseIterator(
            final ListDiscoveryJobsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListDiscoveryJobsRequest.Builder,
                ListDiscoveryJobsRequest,
                ListDiscoveryJobsResponse>(
                new java.util.function.Supplier<ListDiscoveryJobsRequest.Builder>() {
                    @Override
                    public ListDiscoveryJobsRequest.Builder get() {
                        return ListDiscoveryJobsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListDiscoveryJobsResponse, String>() {
                    @Override
                    public String apply(ListDiscoveryJobsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListDiscoveryJobsRequest.Builder>,
                        ListDiscoveryJobsRequest>() {
                    @Override
                    public ListDiscoveryJobsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListDiscoveryJobsRequest.Builder>
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
                        ListDiscoveryJobsRequest, ListDiscoveryJobsResponse>() {
                    @Override
                    public ListDiscoveryJobsResponse apply(ListDiscoveryJobsRequest request) {
                        return client.listDiscoveryJobs(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link
     * com.oracle.bmc.datasafe.model.DiscoveryJobSummary} objects contained in responses from the
     * listDiscoveryJobs operation. This iterable will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link
     *     com.oracle.bmc.datasafe.model.DiscoveryJobSummary} objects contained in responses
     *     received from the service.
     */
    public Iterable<com.oracle.bmc.datasafe.model.DiscoveryJobSummary>
            listDiscoveryJobsRecordIterator(final ListDiscoveryJobsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListDiscoveryJobsRequest.Builder,
                ListDiscoveryJobsRequest,
                ListDiscoveryJobsResponse,
                com.oracle.bmc.datasafe.model.DiscoveryJobSummary>(
                new java.util.function.Supplier<ListDiscoveryJobsRequest.Builder>() {
                    @Override
                    public ListDiscoveryJobsRequest.Builder get() {
                        return ListDiscoveryJobsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListDiscoveryJobsResponse, String>() {
                    @Override
                    public String apply(ListDiscoveryJobsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListDiscoveryJobsRequest.Builder>,
                        ListDiscoveryJobsRequest>() {
                    @Override
                    public ListDiscoveryJobsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListDiscoveryJobsRequest.Builder>
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
                        ListDiscoveryJobsRequest, ListDiscoveryJobsResponse>() {
                    @Override
                    public ListDiscoveryJobsResponse apply(ListDiscoveryJobsRequest request) {
                        return client.listDiscoveryJobs(request);
                    }
                },
                new java.util.function.Function<
                        ListDiscoveryJobsResponse,
                        java.util.List<com.oracle.bmc.datasafe.model.DiscoveryJobSummary>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.datasafe.model.DiscoveryJobSummary> apply(
                            ListDiscoveryJobsResponse response) {
                        return response.getDiscoveryJobCollection().getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the listFindings
     * operation. This iterable will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses
     *     received from the service.
     */
    public Iterable<ListFindingsResponse> listFindingsResponseIterator(
            final ListFindingsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListFindingsRequest.Builder, ListFindingsRequest, ListFindingsResponse>(
                new java.util.function.Supplier<ListFindingsRequest.Builder>() {
                    @Override
                    public ListFindingsRequest.Builder get() {
                        return ListFindingsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListFindingsResponse, String>() {
                    @Override
                    public String apply(ListFindingsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListFindingsRequest.Builder>,
                        ListFindingsRequest>() {
                    @Override
                    public ListFindingsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListFindingsRequest.Builder>
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
                new java.util.function.Function<ListFindingsRequest, ListFindingsResponse>() {
                    @Override
                    public ListFindingsResponse apply(ListFindingsRequest request) {
                        return client.listFindings(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link
     * com.oracle.bmc.datasafe.model.FindingSummary} objects contained in responses from the
     * listFindings operation. This iterable will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link
     *     com.oracle.bmc.datasafe.model.FindingSummary} objects contained in responses received
     *     from the service.
     */
    public Iterable<com.oracle.bmc.datasafe.model.FindingSummary> listFindingsRecordIterator(
            final ListFindingsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListFindingsRequest.Builder,
                ListFindingsRequest,
                ListFindingsResponse,
                com.oracle.bmc.datasafe.model.FindingSummary>(
                new java.util.function.Supplier<ListFindingsRequest.Builder>() {
                    @Override
                    public ListFindingsRequest.Builder get() {
                        return ListFindingsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListFindingsResponse, String>() {
                    @Override
                    public String apply(ListFindingsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListFindingsRequest.Builder>,
                        ListFindingsRequest>() {
                    @Override
                    public ListFindingsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListFindingsRequest.Builder>
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
                new java.util.function.Function<ListFindingsRequest, ListFindingsResponse>() {
                    @Override
                    public ListFindingsResponse apply(ListFindingsRequest request) {
                        return client.listFindings(request);
                    }
                },
                new java.util.function.Function<
                        ListFindingsResponse,
                        java.util.List<com.oracle.bmc.datasafe.model.FindingSummary>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.datasafe.model.FindingSummary> apply(
                            ListFindingsResponse response) {
                        return response.getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the listGrants
     * operation. This iterable will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses
     *     received from the service.
     */
    public Iterable<ListGrantsResponse> listGrantsResponseIterator(
            final ListGrantsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListGrantsRequest.Builder, ListGrantsRequest, ListGrantsResponse>(
                new java.util.function.Supplier<ListGrantsRequest.Builder>() {
                    @Override
                    public ListGrantsRequest.Builder get() {
                        return ListGrantsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListGrantsResponse, String>() {
                    @Override
                    public String apply(ListGrantsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListGrantsRequest.Builder>,
                        ListGrantsRequest>() {
                    @Override
                    public ListGrantsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListGrantsRequest.Builder>
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
                new java.util.function.Function<ListGrantsRequest, ListGrantsResponse>() {
                    @Override
                    public ListGrantsResponse apply(ListGrantsRequest request) {
                        return client.listGrants(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link
     * com.oracle.bmc.datasafe.model.GrantSummary} objects contained in responses from the
     * listGrants operation. This iterable will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link
     *     com.oracle.bmc.datasafe.model.GrantSummary} objects contained in responses received from
     *     the service.
     */
    public Iterable<com.oracle.bmc.datasafe.model.GrantSummary> listGrantsRecordIterator(
            final ListGrantsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListGrantsRequest.Builder,
                ListGrantsRequest,
                ListGrantsResponse,
                com.oracle.bmc.datasafe.model.GrantSummary>(
                new java.util.function.Supplier<ListGrantsRequest.Builder>() {
                    @Override
                    public ListGrantsRequest.Builder get() {
                        return ListGrantsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListGrantsResponse, String>() {
                    @Override
                    public String apply(ListGrantsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListGrantsRequest.Builder>,
                        ListGrantsRequest>() {
                    @Override
                    public ListGrantsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListGrantsRequest.Builder>
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
                new java.util.function.Function<ListGrantsRequest, ListGrantsResponse>() {
                    @Override
                    public ListGrantsResponse apply(ListGrantsRequest request) {
                        return client.listGrants(request);
                    }
                },
                new java.util.function.Function<
                        ListGrantsResponse,
                        java.util.List<com.oracle.bmc.datasafe.model.GrantSummary>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.datasafe.model.GrantSummary> apply(
                            ListGrantsResponse response) {
                        return response.getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the
     * listLibraryMaskingFormats operation. This iterable will fetch more data from the server as
     * needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses
     *     received from the service.
     */
    public Iterable<ListLibraryMaskingFormatsResponse> listLibraryMaskingFormatsResponseIterator(
            final ListLibraryMaskingFormatsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListLibraryMaskingFormatsRequest.Builder,
                ListLibraryMaskingFormatsRequest,
                ListLibraryMaskingFormatsResponse>(
                new java.util.function.Supplier<ListLibraryMaskingFormatsRequest.Builder>() {
                    @Override
                    public ListLibraryMaskingFormatsRequest.Builder get() {
                        return ListLibraryMaskingFormatsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListLibraryMaskingFormatsResponse, String>() {
                    @Override
                    public String apply(ListLibraryMaskingFormatsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListLibraryMaskingFormatsRequest.Builder>,
                        ListLibraryMaskingFormatsRequest>() {
                    @Override
                    public ListLibraryMaskingFormatsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListLibraryMaskingFormatsRequest.Builder>
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
                        ListLibraryMaskingFormatsRequest, ListLibraryMaskingFormatsResponse>() {
                    @Override
                    public ListLibraryMaskingFormatsResponse apply(
                            ListLibraryMaskingFormatsRequest request) {
                        return client.listLibraryMaskingFormats(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link
     * com.oracle.bmc.datasafe.model.LibraryMaskingFormatSummary} objects contained in responses
     * from the listLibraryMaskingFormats operation. This iterable will fetch more data from the
     * server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link
     *     com.oracle.bmc.datasafe.model.LibraryMaskingFormatSummary} objects contained in responses
     *     received from the service.
     */
    public Iterable<com.oracle.bmc.datasafe.model.LibraryMaskingFormatSummary>
            listLibraryMaskingFormatsRecordIterator(
                    final ListLibraryMaskingFormatsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListLibraryMaskingFormatsRequest.Builder,
                ListLibraryMaskingFormatsRequest,
                ListLibraryMaskingFormatsResponse,
                com.oracle.bmc.datasafe.model.LibraryMaskingFormatSummary>(
                new java.util.function.Supplier<ListLibraryMaskingFormatsRequest.Builder>() {
                    @Override
                    public ListLibraryMaskingFormatsRequest.Builder get() {
                        return ListLibraryMaskingFormatsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListLibraryMaskingFormatsResponse, String>() {
                    @Override
                    public String apply(ListLibraryMaskingFormatsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListLibraryMaskingFormatsRequest.Builder>,
                        ListLibraryMaskingFormatsRequest>() {
                    @Override
                    public ListLibraryMaskingFormatsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListLibraryMaskingFormatsRequest.Builder>
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
                        ListLibraryMaskingFormatsRequest, ListLibraryMaskingFormatsResponse>() {
                    @Override
                    public ListLibraryMaskingFormatsResponse apply(
                            ListLibraryMaskingFormatsRequest request) {
                        return client.listLibraryMaskingFormats(request);
                    }
                },
                new java.util.function.Function<
                        ListLibraryMaskingFormatsResponse,
                        java.util.List<
                                com.oracle.bmc.datasafe.model.LibraryMaskingFormatSummary>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.datasafe.model.LibraryMaskingFormatSummary>
                            apply(ListLibraryMaskingFormatsResponse response) {
                        return response.getLibraryMaskingFormatCollection().getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the
     * listMaskedColumns operation. This iterable will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses
     *     received from the service.
     */
    public Iterable<ListMaskedColumnsResponse> listMaskedColumnsResponseIterator(
            final ListMaskedColumnsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListMaskedColumnsRequest.Builder,
                ListMaskedColumnsRequest,
                ListMaskedColumnsResponse>(
                new java.util.function.Supplier<ListMaskedColumnsRequest.Builder>() {
                    @Override
                    public ListMaskedColumnsRequest.Builder get() {
                        return ListMaskedColumnsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListMaskedColumnsResponse, String>() {
                    @Override
                    public String apply(ListMaskedColumnsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListMaskedColumnsRequest.Builder>,
                        ListMaskedColumnsRequest>() {
                    @Override
                    public ListMaskedColumnsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListMaskedColumnsRequest.Builder>
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
                        ListMaskedColumnsRequest, ListMaskedColumnsResponse>() {
                    @Override
                    public ListMaskedColumnsResponse apply(ListMaskedColumnsRequest request) {
                        return client.listMaskedColumns(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link
     * com.oracle.bmc.datasafe.model.MaskedColumnSummary} objects contained in responses from the
     * listMaskedColumns operation. This iterable will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link
     *     com.oracle.bmc.datasafe.model.MaskedColumnSummary} objects contained in responses
     *     received from the service.
     */
    public Iterable<com.oracle.bmc.datasafe.model.MaskedColumnSummary>
            listMaskedColumnsRecordIterator(final ListMaskedColumnsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListMaskedColumnsRequest.Builder,
                ListMaskedColumnsRequest,
                ListMaskedColumnsResponse,
                com.oracle.bmc.datasafe.model.MaskedColumnSummary>(
                new java.util.function.Supplier<ListMaskedColumnsRequest.Builder>() {
                    @Override
                    public ListMaskedColumnsRequest.Builder get() {
                        return ListMaskedColumnsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListMaskedColumnsResponse, String>() {
                    @Override
                    public String apply(ListMaskedColumnsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListMaskedColumnsRequest.Builder>,
                        ListMaskedColumnsRequest>() {
                    @Override
                    public ListMaskedColumnsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListMaskedColumnsRequest.Builder>
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
                        ListMaskedColumnsRequest, ListMaskedColumnsResponse>() {
                    @Override
                    public ListMaskedColumnsResponse apply(ListMaskedColumnsRequest request) {
                        return client.listMaskedColumns(request);
                    }
                },
                new java.util.function.Function<
                        ListMaskedColumnsResponse,
                        java.util.List<com.oracle.bmc.datasafe.model.MaskedColumnSummary>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.datasafe.model.MaskedColumnSummary> apply(
                            ListMaskedColumnsResponse response) {
                        return response.getMaskedColumnCollection().getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the
     * listMaskingAnalytics operation. This iterable will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses
     *     received from the service.
     */
    public Iterable<ListMaskingAnalyticsResponse> listMaskingAnalyticsResponseIterator(
            final ListMaskingAnalyticsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListMaskingAnalyticsRequest.Builder,
                ListMaskingAnalyticsRequest,
                ListMaskingAnalyticsResponse>(
                new java.util.function.Supplier<ListMaskingAnalyticsRequest.Builder>() {
                    @Override
                    public ListMaskingAnalyticsRequest.Builder get() {
                        return ListMaskingAnalyticsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListMaskingAnalyticsResponse, String>() {
                    @Override
                    public String apply(ListMaskingAnalyticsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListMaskingAnalyticsRequest.Builder>,
                        ListMaskingAnalyticsRequest>() {
                    @Override
                    public ListMaskingAnalyticsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListMaskingAnalyticsRequest.Builder>
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
                        ListMaskingAnalyticsRequest, ListMaskingAnalyticsResponse>() {
                    @Override
                    public ListMaskingAnalyticsResponse apply(ListMaskingAnalyticsRequest request) {
                        return client.listMaskingAnalytics(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link
     * com.oracle.bmc.datasafe.model.MaskingAnalyticsSummary} objects contained in responses from
     * the listMaskingAnalytics operation. This iterable will fetch more data from the server as
     * needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link
     *     com.oracle.bmc.datasafe.model.MaskingAnalyticsSummary} objects contained in responses
     *     received from the service.
     */
    public Iterable<com.oracle.bmc.datasafe.model.MaskingAnalyticsSummary>
            listMaskingAnalyticsRecordIterator(final ListMaskingAnalyticsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListMaskingAnalyticsRequest.Builder,
                ListMaskingAnalyticsRequest,
                ListMaskingAnalyticsResponse,
                com.oracle.bmc.datasafe.model.MaskingAnalyticsSummary>(
                new java.util.function.Supplier<ListMaskingAnalyticsRequest.Builder>() {
                    @Override
                    public ListMaskingAnalyticsRequest.Builder get() {
                        return ListMaskingAnalyticsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListMaskingAnalyticsResponse, String>() {
                    @Override
                    public String apply(ListMaskingAnalyticsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListMaskingAnalyticsRequest.Builder>,
                        ListMaskingAnalyticsRequest>() {
                    @Override
                    public ListMaskingAnalyticsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListMaskingAnalyticsRequest.Builder>
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
                        ListMaskingAnalyticsRequest, ListMaskingAnalyticsResponse>() {
                    @Override
                    public ListMaskingAnalyticsResponse apply(ListMaskingAnalyticsRequest request) {
                        return client.listMaskingAnalytics(request);
                    }
                },
                new java.util.function.Function<
                        ListMaskingAnalyticsResponse,
                        java.util.List<com.oracle.bmc.datasafe.model.MaskingAnalyticsSummary>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.datasafe.model.MaskingAnalyticsSummary>
                            apply(ListMaskingAnalyticsResponse response) {
                        return response.getMaskingAnalyticsCollection().getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the
     * listMaskingColumns operation. This iterable will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses
     *     received from the service.
     */
    public Iterable<ListMaskingColumnsResponse> listMaskingColumnsResponseIterator(
            final ListMaskingColumnsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListMaskingColumnsRequest.Builder,
                ListMaskingColumnsRequest,
                ListMaskingColumnsResponse>(
                new java.util.function.Supplier<ListMaskingColumnsRequest.Builder>() {
                    @Override
                    public ListMaskingColumnsRequest.Builder get() {
                        return ListMaskingColumnsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListMaskingColumnsResponse, String>() {
                    @Override
                    public String apply(ListMaskingColumnsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListMaskingColumnsRequest.Builder>,
                        ListMaskingColumnsRequest>() {
                    @Override
                    public ListMaskingColumnsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListMaskingColumnsRequest.Builder>
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
                        ListMaskingColumnsRequest, ListMaskingColumnsResponse>() {
                    @Override
                    public ListMaskingColumnsResponse apply(ListMaskingColumnsRequest request) {
                        return client.listMaskingColumns(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link
     * com.oracle.bmc.datasafe.model.MaskingColumnSummary} objects contained in responses from the
     * listMaskingColumns operation. This iterable will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link
     *     com.oracle.bmc.datasafe.model.MaskingColumnSummary} objects contained in responses
     *     received from the service.
     */
    public Iterable<com.oracle.bmc.datasafe.model.MaskingColumnSummary>
            listMaskingColumnsRecordIterator(final ListMaskingColumnsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListMaskingColumnsRequest.Builder,
                ListMaskingColumnsRequest,
                ListMaskingColumnsResponse,
                com.oracle.bmc.datasafe.model.MaskingColumnSummary>(
                new java.util.function.Supplier<ListMaskingColumnsRequest.Builder>() {
                    @Override
                    public ListMaskingColumnsRequest.Builder get() {
                        return ListMaskingColumnsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListMaskingColumnsResponse, String>() {
                    @Override
                    public String apply(ListMaskingColumnsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListMaskingColumnsRequest.Builder>,
                        ListMaskingColumnsRequest>() {
                    @Override
                    public ListMaskingColumnsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListMaskingColumnsRequest.Builder>
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
                        ListMaskingColumnsRequest, ListMaskingColumnsResponse>() {
                    @Override
                    public ListMaskingColumnsResponse apply(ListMaskingColumnsRequest request) {
                        return client.listMaskingColumns(request);
                    }
                },
                new java.util.function.Function<
                        ListMaskingColumnsResponse,
                        java.util.List<com.oracle.bmc.datasafe.model.MaskingColumnSummary>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.datasafe.model.MaskingColumnSummary> apply(
                            ListMaskingColumnsResponse response) {
                        return response.getMaskingColumnCollection().getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the
     * listMaskingObjects operation. This iterable will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses
     *     received from the service.
     */
    public Iterable<ListMaskingObjectsResponse> listMaskingObjectsResponseIterator(
            final ListMaskingObjectsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListMaskingObjectsRequest.Builder,
                ListMaskingObjectsRequest,
                ListMaskingObjectsResponse>(
                new java.util.function.Supplier<ListMaskingObjectsRequest.Builder>() {
                    @Override
                    public ListMaskingObjectsRequest.Builder get() {
                        return ListMaskingObjectsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListMaskingObjectsResponse, String>() {
                    @Override
                    public String apply(ListMaskingObjectsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListMaskingObjectsRequest.Builder>,
                        ListMaskingObjectsRequest>() {
                    @Override
                    public ListMaskingObjectsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListMaskingObjectsRequest.Builder>
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
                        ListMaskingObjectsRequest, ListMaskingObjectsResponse>() {
                    @Override
                    public ListMaskingObjectsResponse apply(ListMaskingObjectsRequest request) {
                        return client.listMaskingObjects(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link
     * com.oracle.bmc.datasafe.model.MaskingObjectSummary} objects contained in responses from the
     * listMaskingObjects operation. This iterable will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link
     *     com.oracle.bmc.datasafe.model.MaskingObjectSummary} objects contained in responses
     *     received from the service.
     */
    public Iterable<com.oracle.bmc.datasafe.model.MaskingObjectSummary>
            listMaskingObjectsRecordIterator(final ListMaskingObjectsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListMaskingObjectsRequest.Builder,
                ListMaskingObjectsRequest,
                ListMaskingObjectsResponse,
                com.oracle.bmc.datasafe.model.MaskingObjectSummary>(
                new java.util.function.Supplier<ListMaskingObjectsRequest.Builder>() {
                    @Override
                    public ListMaskingObjectsRequest.Builder get() {
                        return ListMaskingObjectsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListMaskingObjectsResponse, String>() {
                    @Override
                    public String apply(ListMaskingObjectsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListMaskingObjectsRequest.Builder>,
                        ListMaskingObjectsRequest>() {
                    @Override
                    public ListMaskingObjectsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListMaskingObjectsRequest.Builder>
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
                        ListMaskingObjectsRequest, ListMaskingObjectsResponse>() {
                    @Override
                    public ListMaskingObjectsResponse apply(ListMaskingObjectsRequest request) {
                        return client.listMaskingObjects(request);
                    }
                },
                new java.util.function.Function<
                        ListMaskingObjectsResponse,
                        java.util.List<com.oracle.bmc.datasafe.model.MaskingObjectSummary>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.datasafe.model.MaskingObjectSummary> apply(
                            ListMaskingObjectsResponse response) {
                        return response.getMaskingObjectCollection().getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the
     * listMaskingPolicies operation. This iterable will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses
     *     received from the service.
     */
    public Iterable<ListMaskingPoliciesResponse> listMaskingPoliciesResponseIterator(
            final ListMaskingPoliciesRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListMaskingPoliciesRequest.Builder,
                ListMaskingPoliciesRequest,
                ListMaskingPoliciesResponse>(
                new java.util.function.Supplier<ListMaskingPoliciesRequest.Builder>() {
                    @Override
                    public ListMaskingPoliciesRequest.Builder get() {
                        return ListMaskingPoliciesRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListMaskingPoliciesResponse, String>() {
                    @Override
                    public String apply(ListMaskingPoliciesResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListMaskingPoliciesRequest.Builder>,
                        ListMaskingPoliciesRequest>() {
                    @Override
                    public ListMaskingPoliciesRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListMaskingPoliciesRequest.Builder>
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
                        ListMaskingPoliciesRequest, ListMaskingPoliciesResponse>() {
                    @Override
                    public ListMaskingPoliciesResponse apply(ListMaskingPoliciesRequest request) {
                        return client.listMaskingPolicies(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link
     * com.oracle.bmc.datasafe.model.MaskingPolicySummary} objects contained in responses from the
     * listMaskingPolicies operation. This iterable will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link
     *     com.oracle.bmc.datasafe.model.MaskingPolicySummary} objects contained in responses
     *     received from the service.
     */
    public Iterable<com.oracle.bmc.datasafe.model.MaskingPolicySummary>
            listMaskingPoliciesRecordIterator(final ListMaskingPoliciesRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListMaskingPoliciesRequest.Builder,
                ListMaskingPoliciesRequest,
                ListMaskingPoliciesResponse,
                com.oracle.bmc.datasafe.model.MaskingPolicySummary>(
                new java.util.function.Supplier<ListMaskingPoliciesRequest.Builder>() {
                    @Override
                    public ListMaskingPoliciesRequest.Builder get() {
                        return ListMaskingPoliciesRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListMaskingPoliciesResponse, String>() {
                    @Override
                    public String apply(ListMaskingPoliciesResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListMaskingPoliciesRequest.Builder>,
                        ListMaskingPoliciesRequest>() {
                    @Override
                    public ListMaskingPoliciesRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListMaskingPoliciesRequest.Builder>
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
                        ListMaskingPoliciesRequest, ListMaskingPoliciesResponse>() {
                    @Override
                    public ListMaskingPoliciesResponse apply(ListMaskingPoliciesRequest request) {
                        return client.listMaskingPolicies(request);
                    }
                },
                new java.util.function.Function<
                        ListMaskingPoliciesResponse,
                        java.util.List<com.oracle.bmc.datasafe.model.MaskingPolicySummary>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.datasafe.model.MaskingPolicySummary> apply(
                            ListMaskingPoliciesResponse response) {
                        return response.getMaskingPolicyCollection().getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the
     * listMaskingReports operation. This iterable will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses
     *     received from the service.
     */
    public Iterable<ListMaskingReportsResponse> listMaskingReportsResponseIterator(
            final ListMaskingReportsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListMaskingReportsRequest.Builder,
                ListMaskingReportsRequest,
                ListMaskingReportsResponse>(
                new java.util.function.Supplier<ListMaskingReportsRequest.Builder>() {
                    @Override
                    public ListMaskingReportsRequest.Builder get() {
                        return ListMaskingReportsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListMaskingReportsResponse, String>() {
                    @Override
                    public String apply(ListMaskingReportsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListMaskingReportsRequest.Builder>,
                        ListMaskingReportsRequest>() {
                    @Override
                    public ListMaskingReportsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListMaskingReportsRequest.Builder>
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
                        ListMaskingReportsRequest, ListMaskingReportsResponse>() {
                    @Override
                    public ListMaskingReportsResponse apply(ListMaskingReportsRequest request) {
                        return client.listMaskingReports(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link
     * com.oracle.bmc.datasafe.model.MaskingReportSummary} objects contained in responses from the
     * listMaskingReports operation. This iterable will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link
     *     com.oracle.bmc.datasafe.model.MaskingReportSummary} objects contained in responses
     *     received from the service.
     */
    public Iterable<com.oracle.bmc.datasafe.model.MaskingReportSummary>
            listMaskingReportsRecordIterator(final ListMaskingReportsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListMaskingReportsRequest.Builder,
                ListMaskingReportsRequest,
                ListMaskingReportsResponse,
                com.oracle.bmc.datasafe.model.MaskingReportSummary>(
                new java.util.function.Supplier<ListMaskingReportsRequest.Builder>() {
                    @Override
                    public ListMaskingReportsRequest.Builder get() {
                        return ListMaskingReportsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListMaskingReportsResponse, String>() {
                    @Override
                    public String apply(ListMaskingReportsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListMaskingReportsRequest.Builder>,
                        ListMaskingReportsRequest>() {
                    @Override
                    public ListMaskingReportsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListMaskingReportsRequest.Builder>
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
                        ListMaskingReportsRequest, ListMaskingReportsResponse>() {
                    @Override
                    public ListMaskingReportsResponse apply(ListMaskingReportsRequest request) {
                        return client.listMaskingReports(request);
                    }
                },
                new java.util.function.Function<
                        ListMaskingReportsResponse,
                        java.util.List<com.oracle.bmc.datasafe.model.MaskingReportSummary>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.datasafe.model.MaskingReportSummary> apply(
                            ListMaskingReportsResponse response) {
                        return response.getMaskingReportCollection().getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the
     * listMaskingSchemas operation. This iterable will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses
     *     received from the service.
     */
    public Iterable<ListMaskingSchemasResponse> listMaskingSchemasResponseIterator(
            final ListMaskingSchemasRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListMaskingSchemasRequest.Builder,
                ListMaskingSchemasRequest,
                ListMaskingSchemasResponse>(
                new java.util.function.Supplier<ListMaskingSchemasRequest.Builder>() {
                    @Override
                    public ListMaskingSchemasRequest.Builder get() {
                        return ListMaskingSchemasRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListMaskingSchemasResponse, String>() {
                    @Override
                    public String apply(ListMaskingSchemasResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListMaskingSchemasRequest.Builder>,
                        ListMaskingSchemasRequest>() {
                    @Override
                    public ListMaskingSchemasRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListMaskingSchemasRequest.Builder>
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
                        ListMaskingSchemasRequest, ListMaskingSchemasResponse>() {
                    @Override
                    public ListMaskingSchemasResponse apply(ListMaskingSchemasRequest request) {
                        return client.listMaskingSchemas(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link
     * com.oracle.bmc.datasafe.model.MaskingSchemaSummary} objects contained in responses from the
     * listMaskingSchemas operation. This iterable will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link
     *     com.oracle.bmc.datasafe.model.MaskingSchemaSummary} objects contained in responses
     *     received from the service.
     */
    public Iterable<com.oracle.bmc.datasafe.model.MaskingSchemaSummary>
            listMaskingSchemasRecordIterator(final ListMaskingSchemasRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListMaskingSchemasRequest.Builder,
                ListMaskingSchemasRequest,
                ListMaskingSchemasResponse,
                com.oracle.bmc.datasafe.model.MaskingSchemaSummary>(
                new java.util.function.Supplier<ListMaskingSchemasRequest.Builder>() {
                    @Override
                    public ListMaskingSchemasRequest.Builder get() {
                        return ListMaskingSchemasRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListMaskingSchemasResponse, String>() {
                    @Override
                    public String apply(ListMaskingSchemasResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListMaskingSchemasRequest.Builder>,
                        ListMaskingSchemasRequest>() {
                    @Override
                    public ListMaskingSchemasRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListMaskingSchemasRequest.Builder>
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
                        ListMaskingSchemasRequest, ListMaskingSchemasResponse>() {
                    @Override
                    public ListMaskingSchemasResponse apply(ListMaskingSchemasRequest request) {
                        return client.listMaskingSchemas(request);
                    }
                },
                new java.util.function.Function<
                        ListMaskingSchemasResponse,
                        java.util.List<com.oracle.bmc.datasafe.model.MaskingSchemaSummary>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.datasafe.model.MaskingSchemaSummary> apply(
                            ListMaskingSchemasResponse response) {
                        return response.getMaskingSchemaCollection().getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the
     * listOnPremConnectors operation. This iterable will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses
     *     received from the service.
     */
    public Iterable<ListOnPremConnectorsResponse> listOnPremConnectorsResponseIterator(
            final ListOnPremConnectorsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListOnPremConnectorsRequest.Builder,
                ListOnPremConnectorsRequest,
                ListOnPremConnectorsResponse>(
                new java.util.function.Supplier<ListOnPremConnectorsRequest.Builder>() {
                    @Override
                    public ListOnPremConnectorsRequest.Builder get() {
                        return ListOnPremConnectorsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListOnPremConnectorsResponse, String>() {
                    @Override
                    public String apply(ListOnPremConnectorsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListOnPremConnectorsRequest.Builder>,
                        ListOnPremConnectorsRequest>() {
                    @Override
                    public ListOnPremConnectorsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListOnPremConnectorsRequest.Builder>
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
                        ListOnPremConnectorsRequest, ListOnPremConnectorsResponse>() {
                    @Override
                    public ListOnPremConnectorsResponse apply(ListOnPremConnectorsRequest request) {
                        return client.listOnPremConnectors(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link
     * com.oracle.bmc.datasafe.model.OnPremConnectorSummary} objects contained in responses from the
     * listOnPremConnectors operation. This iterable will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link
     *     com.oracle.bmc.datasafe.model.OnPremConnectorSummary} objects contained in responses
     *     received from the service.
     */
    public Iterable<com.oracle.bmc.datasafe.model.OnPremConnectorSummary>
            listOnPremConnectorsRecordIterator(final ListOnPremConnectorsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListOnPremConnectorsRequest.Builder,
                ListOnPremConnectorsRequest,
                ListOnPremConnectorsResponse,
                com.oracle.bmc.datasafe.model.OnPremConnectorSummary>(
                new java.util.function.Supplier<ListOnPremConnectorsRequest.Builder>() {
                    @Override
                    public ListOnPremConnectorsRequest.Builder get() {
                        return ListOnPremConnectorsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListOnPremConnectorsResponse, String>() {
                    @Override
                    public String apply(ListOnPremConnectorsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListOnPremConnectorsRequest.Builder>,
                        ListOnPremConnectorsRequest>() {
                    @Override
                    public ListOnPremConnectorsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListOnPremConnectorsRequest.Builder>
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
                        ListOnPremConnectorsRequest, ListOnPremConnectorsResponse>() {
                    @Override
                    public ListOnPremConnectorsResponse apply(ListOnPremConnectorsRequest request) {
                        return client.listOnPremConnectors(request);
                    }
                },
                new java.util.function.Function<
                        ListOnPremConnectorsResponse,
                        java.util.List<com.oracle.bmc.datasafe.model.OnPremConnectorSummary>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.datasafe.model.OnPremConnectorSummary>
                            apply(ListOnPremConnectorsResponse response) {
                        return response.getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the
     * listProfileAnalytics operation. This iterable will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses
     *     received from the service.
     */
    public Iterable<ListProfileAnalyticsResponse> listProfileAnalyticsResponseIterator(
            final ListProfileAnalyticsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListProfileAnalyticsRequest.Builder,
                ListProfileAnalyticsRequest,
                ListProfileAnalyticsResponse>(
                new java.util.function.Supplier<ListProfileAnalyticsRequest.Builder>() {
                    @Override
                    public ListProfileAnalyticsRequest.Builder get() {
                        return ListProfileAnalyticsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListProfileAnalyticsResponse, String>() {
                    @Override
                    public String apply(ListProfileAnalyticsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListProfileAnalyticsRequest.Builder>,
                        ListProfileAnalyticsRequest>() {
                    @Override
                    public ListProfileAnalyticsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListProfileAnalyticsRequest.Builder>
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
                        ListProfileAnalyticsRequest, ListProfileAnalyticsResponse>() {
                    @Override
                    public ListProfileAnalyticsResponse apply(ListProfileAnalyticsRequest request) {
                        return client.listProfileAnalytics(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link
     * com.oracle.bmc.datasafe.model.ProfileAggregation} objects contained in responses from the
     * listProfileAnalytics operation. This iterable will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link
     *     com.oracle.bmc.datasafe.model.ProfileAggregation} objects contained in responses received
     *     from the service.
     */
    public Iterable<com.oracle.bmc.datasafe.model.ProfileAggregation>
            listProfileAnalyticsRecordIterator(final ListProfileAnalyticsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListProfileAnalyticsRequest.Builder,
                ListProfileAnalyticsRequest,
                ListProfileAnalyticsResponse,
                com.oracle.bmc.datasafe.model.ProfileAggregation>(
                new java.util.function.Supplier<ListProfileAnalyticsRequest.Builder>() {
                    @Override
                    public ListProfileAnalyticsRequest.Builder get() {
                        return ListProfileAnalyticsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListProfileAnalyticsResponse, String>() {
                    @Override
                    public String apply(ListProfileAnalyticsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListProfileAnalyticsRequest.Builder>,
                        ListProfileAnalyticsRequest>() {
                    @Override
                    public ListProfileAnalyticsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListProfileAnalyticsRequest.Builder>
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
                        ListProfileAnalyticsRequest, ListProfileAnalyticsResponse>() {
                    @Override
                    public ListProfileAnalyticsResponse apply(ListProfileAnalyticsRequest request) {
                        return client.listProfileAnalytics(request);
                    }
                },
                new java.util.function.Function<
                        ListProfileAnalyticsResponse,
                        java.util.List<com.oracle.bmc.datasafe.model.ProfileAggregation>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.datasafe.model.ProfileAggregation> apply(
                            ListProfileAnalyticsResponse response) {
                        return response.getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the
     * listProfileSummaries operation. This iterable will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses
     *     received from the service.
     */
    public Iterable<ListProfileSummariesResponse> listProfileSummariesResponseIterator(
            final ListProfileSummariesRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListProfileSummariesRequest.Builder,
                ListProfileSummariesRequest,
                ListProfileSummariesResponse>(
                new java.util.function.Supplier<ListProfileSummariesRequest.Builder>() {
                    @Override
                    public ListProfileSummariesRequest.Builder get() {
                        return ListProfileSummariesRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListProfileSummariesResponse, String>() {
                    @Override
                    public String apply(ListProfileSummariesResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListProfileSummariesRequest.Builder>,
                        ListProfileSummariesRequest>() {
                    @Override
                    public ListProfileSummariesRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListProfileSummariesRequest.Builder>
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
                        ListProfileSummariesRequest, ListProfileSummariesResponse>() {
                    @Override
                    public ListProfileSummariesResponse apply(ListProfileSummariesRequest request) {
                        return client.listProfileSummaries(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link
     * com.oracle.bmc.datasafe.model.ProfileSummary} objects contained in responses from the
     * listProfileSummaries operation. This iterable will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link
     *     com.oracle.bmc.datasafe.model.ProfileSummary} objects contained in responses received
     *     from the service.
     */
    public Iterable<com.oracle.bmc.datasafe.model.ProfileSummary>
            listProfileSummariesRecordIterator(final ListProfileSummariesRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListProfileSummariesRequest.Builder,
                ListProfileSummariesRequest,
                ListProfileSummariesResponse,
                com.oracle.bmc.datasafe.model.ProfileSummary>(
                new java.util.function.Supplier<ListProfileSummariesRequest.Builder>() {
                    @Override
                    public ListProfileSummariesRequest.Builder get() {
                        return ListProfileSummariesRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListProfileSummariesResponse, String>() {
                    @Override
                    public String apply(ListProfileSummariesResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListProfileSummariesRequest.Builder>,
                        ListProfileSummariesRequest>() {
                    @Override
                    public ListProfileSummariesRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListProfileSummariesRequest.Builder>
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
                        ListProfileSummariesRequest, ListProfileSummariesResponse>() {
                    @Override
                    public ListProfileSummariesResponse apply(ListProfileSummariesRequest request) {
                        return client.listProfileSummaries(request);
                    }
                },
                new java.util.function.Function<
                        ListProfileSummariesResponse,
                        java.util.List<com.oracle.bmc.datasafe.model.ProfileSummary>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.datasafe.model.ProfileSummary> apply(
                            ListProfileSummariesResponse response) {
                        return response.getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the
     * listReportDefinitions operation. This iterable will fetch more data from the server as
     * needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses
     *     received from the service.
     */
    public Iterable<ListReportDefinitionsResponse> listReportDefinitionsResponseIterator(
            final ListReportDefinitionsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListReportDefinitionsRequest.Builder,
                ListReportDefinitionsRequest,
                ListReportDefinitionsResponse>(
                new java.util.function.Supplier<ListReportDefinitionsRequest.Builder>() {
                    @Override
                    public ListReportDefinitionsRequest.Builder get() {
                        return ListReportDefinitionsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListReportDefinitionsResponse, String>() {
                    @Override
                    public String apply(ListReportDefinitionsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListReportDefinitionsRequest.Builder>,
                        ListReportDefinitionsRequest>() {
                    @Override
                    public ListReportDefinitionsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListReportDefinitionsRequest.Builder>
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
                        ListReportDefinitionsRequest, ListReportDefinitionsResponse>() {
                    @Override
                    public ListReportDefinitionsResponse apply(
                            ListReportDefinitionsRequest request) {
                        return client.listReportDefinitions(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link
     * com.oracle.bmc.datasafe.model.ReportDefinitionSummary} objects contained in responses from
     * the listReportDefinitions operation. This iterable will fetch more data from the server as
     * needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link
     *     com.oracle.bmc.datasafe.model.ReportDefinitionSummary} objects contained in responses
     *     received from the service.
     */
    public Iterable<com.oracle.bmc.datasafe.model.ReportDefinitionSummary>
            listReportDefinitionsRecordIterator(final ListReportDefinitionsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListReportDefinitionsRequest.Builder,
                ListReportDefinitionsRequest,
                ListReportDefinitionsResponse,
                com.oracle.bmc.datasafe.model.ReportDefinitionSummary>(
                new java.util.function.Supplier<ListReportDefinitionsRequest.Builder>() {
                    @Override
                    public ListReportDefinitionsRequest.Builder get() {
                        return ListReportDefinitionsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListReportDefinitionsResponse, String>() {
                    @Override
                    public String apply(ListReportDefinitionsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListReportDefinitionsRequest.Builder>,
                        ListReportDefinitionsRequest>() {
                    @Override
                    public ListReportDefinitionsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListReportDefinitionsRequest.Builder>
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
                        ListReportDefinitionsRequest, ListReportDefinitionsResponse>() {
                    @Override
                    public ListReportDefinitionsResponse apply(
                            ListReportDefinitionsRequest request) {
                        return client.listReportDefinitions(request);
                    }
                },
                new java.util.function.Function<
                        ListReportDefinitionsResponse,
                        java.util.List<com.oracle.bmc.datasafe.model.ReportDefinitionSummary>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.datasafe.model.ReportDefinitionSummary>
                            apply(ListReportDefinitionsResponse response) {
                        return response.getReportDefinitionCollection().getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the listReports
     * operation. This iterable will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses
     *     received from the service.
     */
    public Iterable<ListReportsResponse> listReportsResponseIterator(
            final ListReportsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListReportsRequest.Builder, ListReportsRequest, ListReportsResponse>(
                new java.util.function.Supplier<ListReportsRequest.Builder>() {
                    @Override
                    public ListReportsRequest.Builder get() {
                        return ListReportsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListReportsResponse, String>() {
                    @Override
                    public String apply(ListReportsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListReportsRequest.Builder>,
                        ListReportsRequest>() {
                    @Override
                    public ListReportsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListReportsRequest.Builder>
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
                new java.util.function.Function<ListReportsRequest, ListReportsResponse>() {
                    @Override
                    public ListReportsResponse apply(ListReportsRequest request) {
                        return client.listReports(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link
     * com.oracle.bmc.datasafe.model.ReportSummary} objects contained in responses from the
     * listReports operation. This iterable will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link
     *     com.oracle.bmc.datasafe.model.ReportSummary} objects contained in responses received from
     *     the service.
     */
    public Iterable<com.oracle.bmc.datasafe.model.ReportSummary> listReportsRecordIterator(
            final ListReportsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListReportsRequest.Builder,
                ListReportsRequest,
                ListReportsResponse,
                com.oracle.bmc.datasafe.model.ReportSummary>(
                new java.util.function.Supplier<ListReportsRequest.Builder>() {
                    @Override
                    public ListReportsRequest.Builder get() {
                        return ListReportsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListReportsResponse, String>() {
                    @Override
                    public String apply(ListReportsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListReportsRequest.Builder>,
                        ListReportsRequest>() {
                    @Override
                    public ListReportsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListReportsRequest.Builder>
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
                new java.util.function.Function<ListReportsRequest, ListReportsResponse>() {
                    @Override
                    public ListReportsResponse apply(ListReportsRequest request) {
                        return client.listReports(request);
                    }
                },
                new java.util.function.Function<
                        ListReportsResponse,
                        java.util.List<com.oracle.bmc.datasafe.model.ReportSummary>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.datasafe.model.ReportSummary> apply(
                            ListReportsResponse response) {
                        return response.getReportCollection().getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the listRoles
     * operation. This iterable will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses
     *     received from the service.
     */
    public Iterable<ListRolesResponse> listRolesResponseIterator(final ListRolesRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListRolesRequest.Builder, ListRolesRequest, ListRolesResponse>(
                new java.util.function.Supplier<ListRolesRequest.Builder>() {
                    @Override
                    public ListRolesRequest.Builder get() {
                        return ListRolesRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListRolesResponse, String>() {
                    @Override
                    public String apply(ListRolesResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListRolesRequest.Builder>,
                        ListRolesRequest>() {
                    @Override
                    public ListRolesRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListRolesRequest.Builder>
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
                new java.util.function.Function<ListRolesRequest, ListRolesResponse>() {
                    @Override
                    public ListRolesResponse apply(ListRolesRequest request) {
                        return client.listRoles(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link
     * com.oracle.bmc.datasafe.model.RoleSummary} objects contained in responses from the listRoles
     * operation. This iterable will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link
     *     com.oracle.bmc.datasafe.model.RoleSummary} objects contained in responses received from
     *     the service.
     */
    public Iterable<com.oracle.bmc.datasafe.model.RoleSummary> listRolesRecordIterator(
            final ListRolesRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListRolesRequest.Builder,
                ListRolesRequest,
                ListRolesResponse,
                com.oracle.bmc.datasafe.model.RoleSummary>(
                new java.util.function.Supplier<ListRolesRequest.Builder>() {
                    @Override
                    public ListRolesRequest.Builder get() {
                        return ListRolesRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListRolesResponse, String>() {
                    @Override
                    public String apply(ListRolesResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListRolesRequest.Builder>,
                        ListRolesRequest>() {
                    @Override
                    public ListRolesRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListRolesRequest.Builder>
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
                new java.util.function.Function<ListRolesRequest, ListRolesResponse>() {
                    @Override
                    public ListRolesResponse apply(ListRolesRequest request) {
                        return client.listRoles(request);
                    }
                },
                new java.util.function.Function<
                        ListRolesResponse,
                        java.util.List<com.oracle.bmc.datasafe.model.RoleSummary>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.datasafe.model.RoleSummary> apply(
                            ListRolesResponse response) {
                        return response.getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the listSchemas
     * operation. This iterable will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses
     *     received from the service.
     */
    public Iterable<ListSchemasResponse> listSchemasResponseIterator(
            final ListSchemasRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListSchemasRequest.Builder, ListSchemasRequest, ListSchemasResponse>(
                new java.util.function.Supplier<ListSchemasRequest.Builder>() {
                    @Override
                    public ListSchemasRequest.Builder get() {
                        return ListSchemasRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListSchemasResponse, String>() {
                    @Override
                    public String apply(ListSchemasResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListSchemasRequest.Builder>,
                        ListSchemasRequest>() {
                    @Override
                    public ListSchemasRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListSchemasRequest.Builder>
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
                new java.util.function.Function<ListSchemasRequest, ListSchemasResponse>() {
                    @Override
                    public ListSchemasResponse apply(ListSchemasRequest request) {
                        return client.listSchemas(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link
     * com.oracle.bmc.datasafe.model.SchemaSummary} objects contained in responses from the
     * listSchemas operation. This iterable will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link
     *     com.oracle.bmc.datasafe.model.SchemaSummary} objects contained in responses received from
     *     the service.
     */
    public Iterable<com.oracle.bmc.datasafe.model.SchemaSummary> listSchemasRecordIterator(
            final ListSchemasRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListSchemasRequest.Builder,
                ListSchemasRequest,
                ListSchemasResponse,
                com.oracle.bmc.datasafe.model.SchemaSummary>(
                new java.util.function.Supplier<ListSchemasRequest.Builder>() {
                    @Override
                    public ListSchemasRequest.Builder get() {
                        return ListSchemasRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListSchemasResponse, String>() {
                    @Override
                    public String apply(ListSchemasResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListSchemasRequest.Builder>,
                        ListSchemasRequest>() {
                    @Override
                    public ListSchemasRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListSchemasRequest.Builder>
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
                new java.util.function.Function<ListSchemasRequest, ListSchemasResponse>() {
                    @Override
                    public ListSchemasResponse apply(ListSchemasRequest request) {
                        return client.listSchemas(request);
                    }
                },
                new java.util.function.Function<
                        ListSchemasResponse,
                        java.util.List<com.oracle.bmc.datasafe.model.SchemaSummary>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.datasafe.model.SchemaSummary> apply(
                            ListSchemasResponse response) {
                        return response.getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the
     * listSdmMaskingPolicyDifferences operation. This iterable will fetch more data from the server
     * as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses
     *     received from the service.
     */
    public Iterable<ListSdmMaskingPolicyDifferencesResponse>
            listSdmMaskingPolicyDifferencesResponseIterator(
                    final ListSdmMaskingPolicyDifferencesRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListSdmMaskingPolicyDifferencesRequest.Builder,
                ListSdmMaskingPolicyDifferencesRequest,
                ListSdmMaskingPolicyDifferencesResponse>(
                new java.util.function.Supplier<ListSdmMaskingPolicyDifferencesRequest.Builder>() {
                    @Override
                    public ListSdmMaskingPolicyDifferencesRequest.Builder get() {
                        return ListSdmMaskingPolicyDifferencesRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListSdmMaskingPolicyDifferencesResponse, String>() {
                    @Override
                    public String apply(ListSdmMaskingPolicyDifferencesResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListSdmMaskingPolicyDifferencesRequest.Builder>,
                        ListSdmMaskingPolicyDifferencesRequest>() {
                    @Override
                    public ListSdmMaskingPolicyDifferencesRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListSdmMaskingPolicyDifferencesRequest.Builder>
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
                        ListSdmMaskingPolicyDifferencesRequest,
                        ListSdmMaskingPolicyDifferencesResponse>() {
                    @Override
                    public ListSdmMaskingPolicyDifferencesResponse apply(
                            ListSdmMaskingPolicyDifferencesRequest request) {
                        return client.listSdmMaskingPolicyDifferences(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link
     * com.oracle.bmc.datasafe.model.SdmMaskingPolicyDifferenceSummary} objects contained in
     * responses from the listSdmMaskingPolicyDifferences operation. This iterable will fetch more
     * data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link
     *     com.oracle.bmc.datasafe.model.SdmMaskingPolicyDifferenceSummary} objects contained in
     *     responses received from the service.
     */
    public Iterable<com.oracle.bmc.datasafe.model.SdmMaskingPolicyDifferenceSummary>
            listSdmMaskingPolicyDifferencesRecordIterator(
                    final ListSdmMaskingPolicyDifferencesRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListSdmMaskingPolicyDifferencesRequest.Builder,
                ListSdmMaskingPolicyDifferencesRequest,
                ListSdmMaskingPolicyDifferencesResponse,
                com.oracle.bmc.datasafe.model.SdmMaskingPolicyDifferenceSummary>(
                new java.util.function.Supplier<ListSdmMaskingPolicyDifferencesRequest.Builder>() {
                    @Override
                    public ListSdmMaskingPolicyDifferencesRequest.Builder get() {
                        return ListSdmMaskingPolicyDifferencesRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListSdmMaskingPolicyDifferencesResponse, String>() {
                    @Override
                    public String apply(ListSdmMaskingPolicyDifferencesResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListSdmMaskingPolicyDifferencesRequest.Builder>,
                        ListSdmMaskingPolicyDifferencesRequest>() {
                    @Override
                    public ListSdmMaskingPolicyDifferencesRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListSdmMaskingPolicyDifferencesRequest.Builder>
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
                        ListSdmMaskingPolicyDifferencesRequest,
                        ListSdmMaskingPolicyDifferencesResponse>() {
                    @Override
                    public ListSdmMaskingPolicyDifferencesResponse apply(
                            ListSdmMaskingPolicyDifferencesRequest request) {
                        return client.listSdmMaskingPolicyDifferences(request);
                    }
                },
                new java.util.function.Function<
                        ListSdmMaskingPolicyDifferencesResponse,
                        java.util.List<
                                com.oracle.bmc.datasafe.model
                                        .SdmMaskingPolicyDifferenceSummary>>() {
                    @Override
                    public java.util.List<
                                    com.oracle.bmc.datasafe.model.SdmMaskingPolicyDifferenceSummary>
                            apply(ListSdmMaskingPolicyDifferencesResponse response) {
                        return response.getSdmMaskingPolicyDifferenceCollection().getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the
     * listSecurityAssessments operation. This iterable will fetch more data from the server as
     * needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses
     *     received from the service.
     */
    public Iterable<ListSecurityAssessmentsResponse> listSecurityAssessmentsResponseIterator(
            final ListSecurityAssessmentsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListSecurityAssessmentsRequest.Builder,
                ListSecurityAssessmentsRequest,
                ListSecurityAssessmentsResponse>(
                new java.util.function.Supplier<ListSecurityAssessmentsRequest.Builder>() {
                    @Override
                    public ListSecurityAssessmentsRequest.Builder get() {
                        return ListSecurityAssessmentsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListSecurityAssessmentsResponse, String>() {
                    @Override
                    public String apply(ListSecurityAssessmentsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListSecurityAssessmentsRequest.Builder>,
                        ListSecurityAssessmentsRequest>() {
                    @Override
                    public ListSecurityAssessmentsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListSecurityAssessmentsRequest.Builder>
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
                        ListSecurityAssessmentsRequest, ListSecurityAssessmentsResponse>() {
                    @Override
                    public ListSecurityAssessmentsResponse apply(
                            ListSecurityAssessmentsRequest request) {
                        return client.listSecurityAssessments(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link
     * com.oracle.bmc.datasafe.model.SecurityAssessmentSummary} objects contained in responses from
     * the listSecurityAssessments operation. This iterable will fetch more data from the server as
     * needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link
     *     com.oracle.bmc.datasafe.model.SecurityAssessmentSummary} objects contained in responses
     *     received from the service.
     */
    public Iterable<com.oracle.bmc.datasafe.model.SecurityAssessmentSummary>
            listSecurityAssessmentsRecordIterator(final ListSecurityAssessmentsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListSecurityAssessmentsRequest.Builder,
                ListSecurityAssessmentsRequest,
                ListSecurityAssessmentsResponse,
                com.oracle.bmc.datasafe.model.SecurityAssessmentSummary>(
                new java.util.function.Supplier<ListSecurityAssessmentsRequest.Builder>() {
                    @Override
                    public ListSecurityAssessmentsRequest.Builder get() {
                        return ListSecurityAssessmentsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListSecurityAssessmentsResponse, String>() {
                    @Override
                    public String apply(ListSecurityAssessmentsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListSecurityAssessmentsRequest.Builder>,
                        ListSecurityAssessmentsRequest>() {
                    @Override
                    public ListSecurityAssessmentsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListSecurityAssessmentsRequest.Builder>
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
                        ListSecurityAssessmentsRequest, ListSecurityAssessmentsResponse>() {
                    @Override
                    public ListSecurityAssessmentsResponse apply(
                            ListSecurityAssessmentsRequest request) {
                        return client.listSecurityAssessments(request);
                    }
                },
                new java.util.function.Function<
                        ListSecurityAssessmentsResponse,
                        java.util.List<com.oracle.bmc.datasafe.model.SecurityAssessmentSummary>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.datasafe.model.SecurityAssessmentSummary>
                            apply(ListSecurityAssessmentsResponse response) {
                        return response.getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the
     * listSecurityPolicies operation. This iterable will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses
     *     received from the service.
     */
    public Iterable<ListSecurityPoliciesResponse> listSecurityPoliciesResponseIterator(
            final ListSecurityPoliciesRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListSecurityPoliciesRequest.Builder,
                ListSecurityPoliciesRequest,
                ListSecurityPoliciesResponse>(
                new java.util.function.Supplier<ListSecurityPoliciesRequest.Builder>() {
                    @Override
                    public ListSecurityPoliciesRequest.Builder get() {
                        return ListSecurityPoliciesRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListSecurityPoliciesResponse, String>() {
                    @Override
                    public String apply(ListSecurityPoliciesResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListSecurityPoliciesRequest.Builder>,
                        ListSecurityPoliciesRequest>() {
                    @Override
                    public ListSecurityPoliciesRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListSecurityPoliciesRequest.Builder>
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
                        ListSecurityPoliciesRequest, ListSecurityPoliciesResponse>() {
                    @Override
                    public ListSecurityPoliciesResponse apply(ListSecurityPoliciesRequest request) {
                        return client.listSecurityPolicies(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link
     * com.oracle.bmc.datasafe.model.SecurityPolicySummary} objects contained in responses from the
     * listSecurityPolicies operation. This iterable will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link
     *     com.oracle.bmc.datasafe.model.SecurityPolicySummary} objects contained in responses
     *     received from the service.
     */
    public Iterable<com.oracle.bmc.datasafe.model.SecurityPolicySummary>
            listSecurityPoliciesRecordIterator(final ListSecurityPoliciesRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListSecurityPoliciesRequest.Builder,
                ListSecurityPoliciesRequest,
                ListSecurityPoliciesResponse,
                com.oracle.bmc.datasafe.model.SecurityPolicySummary>(
                new java.util.function.Supplier<ListSecurityPoliciesRequest.Builder>() {
                    @Override
                    public ListSecurityPoliciesRequest.Builder get() {
                        return ListSecurityPoliciesRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListSecurityPoliciesResponse, String>() {
                    @Override
                    public String apply(ListSecurityPoliciesResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListSecurityPoliciesRequest.Builder>,
                        ListSecurityPoliciesRequest>() {
                    @Override
                    public ListSecurityPoliciesRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListSecurityPoliciesRequest.Builder>
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
                        ListSecurityPoliciesRequest, ListSecurityPoliciesResponse>() {
                    @Override
                    public ListSecurityPoliciesResponse apply(ListSecurityPoliciesRequest request) {
                        return client.listSecurityPolicies(request);
                    }
                },
                new java.util.function.Function<
                        ListSecurityPoliciesResponse,
                        java.util.List<com.oracle.bmc.datasafe.model.SecurityPolicySummary>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.datasafe.model.SecurityPolicySummary>
                            apply(ListSecurityPoliciesResponse response) {
                        return response.getSecurityPolicyCollection().getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the
     * listSecurityPolicyDeployments operation. This iterable will fetch more data from the server
     * as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses
     *     received from the service.
     */
    public Iterable<ListSecurityPolicyDeploymentsResponse>
            listSecurityPolicyDeploymentsResponseIterator(
                    final ListSecurityPolicyDeploymentsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListSecurityPolicyDeploymentsRequest.Builder,
                ListSecurityPolicyDeploymentsRequest,
                ListSecurityPolicyDeploymentsResponse>(
                new java.util.function.Supplier<ListSecurityPolicyDeploymentsRequest.Builder>() {
                    @Override
                    public ListSecurityPolicyDeploymentsRequest.Builder get() {
                        return ListSecurityPolicyDeploymentsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListSecurityPolicyDeploymentsResponse, String>() {
                    @Override
                    public String apply(ListSecurityPolicyDeploymentsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListSecurityPolicyDeploymentsRequest.Builder>,
                        ListSecurityPolicyDeploymentsRequest>() {
                    @Override
                    public ListSecurityPolicyDeploymentsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListSecurityPolicyDeploymentsRequest.Builder>
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
                        ListSecurityPolicyDeploymentsRequest,
                        ListSecurityPolicyDeploymentsResponse>() {
                    @Override
                    public ListSecurityPolicyDeploymentsResponse apply(
                            ListSecurityPolicyDeploymentsRequest request) {
                        return client.listSecurityPolicyDeployments(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link
     * com.oracle.bmc.datasafe.model.SecurityPolicyDeploymentSummary} objects contained in responses
     * from the listSecurityPolicyDeployments operation. This iterable will fetch more data from the
     * server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link
     *     com.oracle.bmc.datasafe.model.SecurityPolicyDeploymentSummary} objects contained in
     *     responses received from the service.
     */
    public Iterable<com.oracle.bmc.datasafe.model.SecurityPolicyDeploymentSummary>
            listSecurityPolicyDeploymentsRecordIterator(
                    final ListSecurityPolicyDeploymentsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListSecurityPolicyDeploymentsRequest.Builder,
                ListSecurityPolicyDeploymentsRequest,
                ListSecurityPolicyDeploymentsResponse,
                com.oracle.bmc.datasafe.model.SecurityPolicyDeploymentSummary>(
                new java.util.function.Supplier<ListSecurityPolicyDeploymentsRequest.Builder>() {
                    @Override
                    public ListSecurityPolicyDeploymentsRequest.Builder get() {
                        return ListSecurityPolicyDeploymentsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListSecurityPolicyDeploymentsResponse, String>() {
                    @Override
                    public String apply(ListSecurityPolicyDeploymentsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListSecurityPolicyDeploymentsRequest.Builder>,
                        ListSecurityPolicyDeploymentsRequest>() {
                    @Override
                    public ListSecurityPolicyDeploymentsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListSecurityPolicyDeploymentsRequest.Builder>
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
                        ListSecurityPolicyDeploymentsRequest,
                        ListSecurityPolicyDeploymentsResponse>() {
                    @Override
                    public ListSecurityPolicyDeploymentsResponse apply(
                            ListSecurityPolicyDeploymentsRequest request) {
                        return client.listSecurityPolicyDeployments(request);
                    }
                },
                new java.util.function.Function<
                        ListSecurityPolicyDeploymentsResponse,
                        java.util.List<
                                com.oracle.bmc.datasafe.model.SecurityPolicyDeploymentSummary>>() {
                    @Override
                    public java.util.List<
                                    com.oracle.bmc.datasafe.model.SecurityPolicyDeploymentSummary>
                            apply(ListSecurityPolicyDeploymentsResponse response) {
                        return response.getSecurityPolicyDeploymentCollection().getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the
     * listSecurityPolicyEntryStates operation. This iterable will fetch more data from the server
     * as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses
     *     received from the service.
     */
    public Iterable<ListSecurityPolicyEntryStatesResponse>
            listSecurityPolicyEntryStatesResponseIterator(
                    final ListSecurityPolicyEntryStatesRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListSecurityPolicyEntryStatesRequest.Builder,
                ListSecurityPolicyEntryStatesRequest,
                ListSecurityPolicyEntryStatesResponse>(
                new java.util.function.Supplier<ListSecurityPolicyEntryStatesRequest.Builder>() {
                    @Override
                    public ListSecurityPolicyEntryStatesRequest.Builder get() {
                        return ListSecurityPolicyEntryStatesRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListSecurityPolicyEntryStatesResponse, String>() {
                    @Override
                    public String apply(ListSecurityPolicyEntryStatesResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListSecurityPolicyEntryStatesRequest.Builder>,
                        ListSecurityPolicyEntryStatesRequest>() {
                    @Override
                    public ListSecurityPolicyEntryStatesRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListSecurityPolicyEntryStatesRequest.Builder>
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
                        ListSecurityPolicyEntryStatesRequest,
                        ListSecurityPolicyEntryStatesResponse>() {
                    @Override
                    public ListSecurityPolicyEntryStatesResponse apply(
                            ListSecurityPolicyEntryStatesRequest request) {
                        return client.listSecurityPolicyEntryStates(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link
     * com.oracle.bmc.datasafe.model.SecurityPolicyEntryStateSummary} objects contained in responses
     * from the listSecurityPolicyEntryStates operation. This iterable will fetch more data from the
     * server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link
     *     com.oracle.bmc.datasafe.model.SecurityPolicyEntryStateSummary} objects contained in
     *     responses received from the service.
     */
    public Iterable<com.oracle.bmc.datasafe.model.SecurityPolicyEntryStateSummary>
            listSecurityPolicyEntryStatesRecordIterator(
                    final ListSecurityPolicyEntryStatesRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListSecurityPolicyEntryStatesRequest.Builder,
                ListSecurityPolicyEntryStatesRequest,
                ListSecurityPolicyEntryStatesResponse,
                com.oracle.bmc.datasafe.model.SecurityPolicyEntryStateSummary>(
                new java.util.function.Supplier<ListSecurityPolicyEntryStatesRequest.Builder>() {
                    @Override
                    public ListSecurityPolicyEntryStatesRequest.Builder get() {
                        return ListSecurityPolicyEntryStatesRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListSecurityPolicyEntryStatesResponse, String>() {
                    @Override
                    public String apply(ListSecurityPolicyEntryStatesResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListSecurityPolicyEntryStatesRequest.Builder>,
                        ListSecurityPolicyEntryStatesRequest>() {
                    @Override
                    public ListSecurityPolicyEntryStatesRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListSecurityPolicyEntryStatesRequest.Builder>
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
                        ListSecurityPolicyEntryStatesRequest,
                        ListSecurityPolicyEntryStatesResponse>() {
                    @Override
                    public ListSecurityPolicyEntryStatesResponse apply(
                            ListSecurityPolicyEntryStatesRequest request) {
                        return client.listSecurityPolicyEntryStates(request);
                    }
                },
                new java.util.function.Function<
                        ListSecurityPolicyEntryStatesResponse,
                        java.util.List<
                                com.oracle.bmc.datasafe.model.SecurityPolicyEntryStateSummary>>() {
                    @Override
                    public java.util.List<
                                    com.oracle.bmc.datasafe.model.SecurityPolicyEntryStateSummary>
                            apply(ListSecurityPolicyEntryStatesResponse response) {
                        return response.getSecurityPolicyEntryStateCollection().getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the
     * listSensitiveColumns operation. This iterable will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses
     *     received from the service.
     */
    public Iterable<ListSensitiveColumnsResponse> listSensitiveColumnsResponseIterator(
            final ListSensitiveColumnsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListSensitiveColumnsRequest.Builder,
                ListSensitiveColumnsRequest,
                ListSensitiveColumnsResponse>(
                new java.util.function.Supplier<ListSensitiveColumnsRequest.Builder>() {
                    @Override
                    public ListSensitiveColumnsRequest.Builder get() {
                        return ListSensitiveColumnsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListSensitiveColumnsResponse, String>() {
                    @Override
                    public String apply(ListSensitiveColumnsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListSensitiveColumnsRequest.Builder>,
                        ListSensitiveColumnsRequest>() {
                    @Override
                    public ListSensitiveColumnsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListSensitiveColumnsRequest.Builder>
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
                        ListSensitiveColumnsRequest, ListSensitiveColumnsResponse>() {
                    @Override
                    public ListSensitiveColumnsResponse apply(ListSensitiveColumnsRequest request) {
                        return client.listSensitiveColumns(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link
     * com.oracle.bmc.datasafe.model.SensitiveColumnSummary} objects contained in responses from the
     * listSensitiveColumns operation. This iterable will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link
     *     com.oracle.bmc.datasafe.model.SensitiveColumnSummary} objects contained in responses
     *     received from the service.
     */
    public Iterable<com.oracle.bmc.datasafe.model.SensitiveColumnSummary>
            listSensitiveColumnsRecordIterator(final ListSensitiveColumnsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListSensitiveColumnsRequest.Builder,
                ListSensitiveColumnsRequest,
                ListSensitiveColumnsResponse,
                com.oracle.bmc.datasafe.model.SensitiveColumnSummary>(
                new java.util.function.Supplier<ListSensitiveColumnsRequest.Builder>() {
                    @Override
                    public ListSensitiveColumnsRequest.Builder get() {
                        return ListSensitiveColumnsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListSensitiveColumnsResponse, String>() {
                    @Override
                    public String apply(ListSensitiveColumnsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListSensitiveColumnsRequest.Builder>,
                        ListSensitiveColumnsRequest>() {
                    @Override
                    public ListSensitiveColumnsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListSensitiveColumnsRequest.Builder>
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
                        ListSensitiveColumnsRequest, ListSensitiveColumnsResponse>() {
                    @Override
                    public ListSensitiveColumnsResponse apply(ListSensitiveColumnsRequest request) {
                        return client.listSensitiveColumns(request);
                    }
                },
                new java.util.function.Function<
                        ListSensitiveColumnsResponse,
                        java.util.List<com.oracle.bmc.datasafe.model.SensitiveColumnSummary>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.datasafe.model.SensitiveColumnSummary>
                            apply(ListSensitiveColumnsResponse response) {
                        return response.getSensitiveColumnCollection().getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the
     * listSensitiveDataModels operation. This iterable will fetch more data from the server as
     * needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses
     *     received from the service.
     */
    public Iterable<ListSensitiveDataModelsResponse> listSensitiveDataModelsResponseIterator(
            final ListSensitiveDataModelsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListSensitiveDataModelsRequest.Builder,
                ListSensitiveDataModelsRequest,
                ListSensitiveDataModelsResponse>(
                new java.util.function.Supplier<ListSensitiveDataModelsRequest.Builder>() {
                    @Override
                    public ListSensitiveDataModelsRequest.Builder get() {
                        return ListSensitiveDataModelsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListSensitiveDataModelsResponse, String>() {
                    @Override
                    public String apply(ListSensitiveDataModelsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListSensitiveDataModelsRequest.Builder>,
                        ListSensitiveDataModelsRequest>() {
                    @Override
                    public ListSensitiveDataModelsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListSensitiveDataModelsRequest.Builder>
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
                        ListSensitiveDataModelsRequest, ListSensitiveDataModelsResponse>() {
                    @Override
                    public ListSensitiveDataModelsResponse apply(
                            ListSensitiveDataModelsRequest request) {
                        return client.listSensitiveDataModels(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link
     * com.oracle.bmc.datasafe.model.SensitiveDataModelSummary} objects contained in responses from
     * the listSensitiveDataModels operation. This iterable will fetch more data from the server as
     * needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link
     *     com.oracle.bmc.datasafe.model.SensitiveDataModelSummary} objects contained in responses
     *     received from the service.
     */
    public Iterable<com.oracle.bmc.datasafe.model.SensitiveDataModelSummary>
            listSensitiveDataModelsRecordIterator(final ListSensitiveDataModelsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListSensitiveDataModelsRequest.Builder,
                ListSensitiveDataModelsRequest,
                ListSensitiveDataModelsResponse,
                com.oracle.bmc.datasafe.model.SensitiveDataModelSummary>(
                new java.util.function.Supplier<ListSensitiveDataModelsRequest.Builder>() {
                    @Override
                    public ListSensitiveDataModelsRequest.Builder get() {
                        return ListSensitiveDataModelsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListSensitiveDataModelsResponse, String>() {
                    @Override
                    public String apply(ListSensitiveDataModelsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListSensitiveDataModelsRequest.Builder>,
                        ListSensitiveDataModelsRequest>() {
                    @Override
                    public ListSensitiveDataModelsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListSensitiveDataModelsRequest.Builder>
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
                        ListSensitiveDataModelsRequest, ListSensitiveDataModelsResponse>() {
                    @Override
                    public ListSensitiveDataModelsResponse apply(
                            ListSensitiveDataModelsRequest request) {
                        return client.listSensitiveDataModels(request);
                    }
                },
                new java.util.function.Function<
                        ListSensitiveDataModelsResponse,
                        java.util.List<com.oracle.bmc.datasafe.model.SensitiveDataModelSummary>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.datasafe.model.SensitiveDataModelSummary>
                            apply(ListSensitiveDataModelsResponse response) {
                        return response.getSensitiveDataModelCollection().getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the
     * listSensitiveObjects operation. This iterable will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses
     *     received from the service.
     */
    public Iterable<ListSensitiveObjectsResponse> listSensitiveObjectsResponseIterator(
            final ListSensitiveObjectsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListSensitiveObjectsRequest.Builder,
                ListSensitiveObjectsRequest,
                ListSensitiveObjectsResponse>(
                new java.util.function.Supplier<ListSensitiveObjectsRequest.Builder>() {
                    @Override
                    public ListSensitiveObjectsRequest.Builder get() {
                        return ListSensitiveObjectsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListSensitiveObjectsResponse, String>() {
                    @Override
                    public String apply(ListSensitiveObjectsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListSensitiveObjectsRequest.Builder>,
                        ListSensitiveObjectsRequest>() {
                    @Override
                    public ListSensitiveObjectsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListSensitiveObjectsRequest.Builder>
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
                        ListSensitiveObjectsRequest, ListSensitiveObjectsResponse>() {
                    @Override
                    public ListSensitiveObjectsResponse apply(ListSensitiveObjectsRequest request) {
                        return client.listSensitiveObjects(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link
     * com.oracle.bmc.datasafe.model.SensitiveObjectSummary} objects contained in responses from the
     * listSensitiveObjects operation. This iterable will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link
     *     com.oracle.bmc.datasafe.model.SensitiveObjectSummary} objects contained in responses
     *     received from the service.
     */
    public Iterable<com.oracle.bmc.datasafe.model.SensitiveObjectSummary>
            listSensitiveObjectsRecordIterator(final ListSensitiveObjectsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListSensitiveObjectsRequest.Builder,
                ListSensitiveObjectsRequest,
                ListSensitiveObjectsResponse,
                com.oracle.bmc.datasafe.model.SensitiveObjectSummary>(
                new java.util.function.Supplier<ListSensitiveObjectsRequest.Builder>() {
                    @Override
                    public ListSensitiveObjectsRequest.Builder get() {
                        return ListSensitiveObjectsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListSensitiveObjectsResponse, String>() {
                    @Override
                    public String apply(ListSensitiveObjectsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListSensitiveObjectsRequest.Builder>,
                        ListSensitiveObjectsRequest>() {
                    @Override
                    public ListSensitiveObjectsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListSensitiveObjectsRequest.Builder>
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
                        ListSensitiveObjectsRequest, ListSensitiveObjectsResponse>() {
                    @Override
                    public ListSensitiveObjectsResponse apply(ListSensitiveObjectsRequest request) {
                        return client.listSensitiveObjects(request);
                    }
                },
                new java.util.function.Function<
                        ListSensitiveObjectsResponse,
                        java.util.List<com.oracle.bmc.datasafe.model.SensitiveObjectSummary>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.datasafe.model.SensitiveObjectSummary>
                            apply(ListSensitiveObjectsResponse response) {
                        return response.getSensitiveObjectCollection().getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the
     * listSensitiveSchemas operation. This iterable will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses
     *     received from the service.
     */
    public Iterable<ListSensitiveSchemasResponse> listSensitiveSchemasResponseIterator(
            final ListSensitiveSchemasRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListSensitiveSchemasRequest.Builder,
                ListSensitiveSchemasRequest,
                ListSensitiveSchemasResponse>(
                new java.util.function.Supplier<ListSensitiveSchemasRequest.Builder>() {
                    @Override
                    public ListSensitiveSchemasRequest.Builder get() {
                        return ListSensitiveSchemasRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListSensitiveSchemasResponse, String>() {
                    @Override
                    public String apply(ListSensitiveSchemasResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListSensitiveSchemasRequest.Builder>,
                        ListSensitiveSchemasRequest>() {
                    @Override
                    public ListSensitiveSchemasRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListSensitiveSchemasRequest.Builder>
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
                        ListSensitiveSchemasRequest, ListSensitiveSchemasResponse>() {
                    @Override
                    public ListSensitiveSchemasResponse apply(ListSensitiveSchemasRequest request) {
                        return client.listSensitiveSchemas(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link
     * com.oracle.bmc.datasafe.model.SensitiveSchemaSummary} objects contained in responses from the
     * listSensitiveSchemas operation. This iterable will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link
     *     com.oracle.bmc.datasafe.model.SensitiveSchemaSummary} objects contained in responses
     *     received from the service.
     */
    public Iterable<com.oracle.bmc.datasafe.model.SensitiveSchemaSummary>
            listSensitiveSchemasRecordIterator(final ListSensitiveSchemasRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListSensitiveSchemasRequest.Builder,
                ListSensitiveSchemasRequest,
                ListSensitiveSchemasResponse,
                com.oracle.bmc.datasafe.model.SensitiveSchemaSummary>(
                new java.util.function.Supplier<ListSensitiveSchemasRequest.Builder>() {
                    @Override
                    public ListSensitiveSchemasRequest.Builder get() {
                        return ListSensitiveSchemasRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListSensitiveSchemasResponse, String>() {
                    @Override
                    public String apply(ListSensitiveSchemasResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListSensitiveSchemasRequest.Builder>,
                        ListSensitiveSchemasRequest>() {
                    @Override
                    public ListSensitiveSchemasRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListSensitiveSchemasRequest.Builder>
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
                        ListSensitiveSchemasRequest, ListSensitiveSchemasResponse>() {
                    @Override
                    public ListSensitiveSchemasResponse apply(ListSensitiveSchemasRequest request) {
                        return client.listSensitiveSchemas(request);
                    }
                },
                new java.util.function.Function<
                        ListSensitiveSchemasResponse,
                        java.util.List<com.oracle.bmc.datasafe.model.SensitiveSchemaSummary>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.datasafe.model.SensitiveSchemaSummary>
                            apply(ListSensitiveSchemasResponse response) {
                        return response.getSensitiveSchemaCollection().getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the
     * listSensitiveTypes operation. This iterable will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses
     *     received from the service.
     */
    public Iterable<ListSensitiveTypesResponse> listSensitiveTypesResponseIterator(
            final ListSensitiveTypesRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListSensitiveTypesRequest.Builder,
                ListSensitiveTypesRequest,
                ListSensitiveTypesResponse>(
                new java.util.function.Supplier<ListSensitiveTypesRequest.Builder>() {
                    @Override
                    public ListSensitiveTypesRequest.Builder get() {
                        return ListSensitiveTypesRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListSensitiveTypesResponse, String>() {
                    @Override
                    public String apply(ListSensitiveTypesResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListSensitiveTypesRequest.Builder>,
                        ListSensitiveTypesRequest>() {
                    @Override
                    public ListSensitiveTypesRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListSensitiveTypesRequest.Builder>
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
                        ListSensitiveTypesRequest, ListSensitiveTypesResponse>() {
                    @Override
                    public ListSensitiveTypesResponse apply(ListSensitiveTypesRequest request) {
                        return client.listSensitiveTypes(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link
     * com.oracle.bmc.datasafe.model.SensitiveTypeSummary} objects contained in responses from the
     * listSensitiveTypes operation. This iterable will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link
     *     com.oracle.bmc.datasafe.model.SensitiveTypeSummary} objects contained in responses
     *     received from the service.
     */
    public Iterable<com.oracle.bmc.datasafe.model.SensitiveTypeSummary>
            listSensitiveTypesRecordIterator(final ListSensitiveTypesRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListSensitiveTypesRequest.Builder,
                ListSensitiveTypesRequest,
                ListSensitiveTypesResponse,
                com.oracle.bmc.datasafe.model.SensitiveTypeSummary>(
                new java.util.function.Supplier<ListSensitiveTypesRequest.Builder>() {
                    @Override
                    public ListSensitiveTypesRequest.Builder get() {
                        return ListSensitiveTypesRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListSensitiveTypesResponse, String>() {
                    @Override
                    public String apply(ListSensitiveTypesResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListSensitiveTypesRequest.Builder>,
                        ListSensitiveTypesRequest>() {
                    @Override
                    public ListSensitiveTypesRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListSensitiveTypesRequest.Builder>
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
                        ListSensitiveTypesRequest, ListSensitiveTypesResponse>() {
                    @Override
                    public ListSensitiveTypesResponse apply(ListSensitiveTypesRequest request) {
                        return client.listSensitiveTypes(request);
                    }
                },
                new java.util.function.Function<
                        ListSensitiveTypesResponse,
                        java.util.List<com.oracle.bmc.datasafe.model.SensitiveTypeSummary>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.datasafe.model.SensitiveTypeSummary> apply(
                            ListSensitiveTypesResponse response) {
                        return response.getSensitiveTypeCollection().getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the
     * listSqlCollectionAnalytics operation. This iterable will fetch more data from the server as
     * needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses
     *     received from the service.
     */
    public Iterable<ListSqlCollectionAnalyticsResponse> listSqlCollectionAnalyticsResponseIterator(
            final ListSqlCollectionAnalyticsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListSqlCollectionAnalyticsRequest.Builder,
                ListSqlCollectionAnalyticsRequest,
                ListSqlCollectionAnalyticsResponse>(
                new java.util.function.Supplier<ListSqlCollectionAnalyticsRequest.Builder>() {
                    @Override
                    public ListSqlCollectionAnalyticsRequest.Builder get() {
                        return ListSqlCollectionAnalyticsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListSqlCollectionAnalyticsResponse, String>() {
                    @Override
                    public String apply(ListSqlCollectionAnalyticsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListSqlCollectionAnalyticsRequest.Builder>,
                        ListSqlCollectionAnalyticsRequest>() {
                    @Override
                    public ListSqlCollectionAnalyticsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListSqlCollectionAnalyticsRequest.Builder>
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
                        ListSqlCollectionAnalyticsRequest, ListSqlCollectionAnalyticsResponse>() {
                    @Override
                    public ListSqlCollectionAnalyticsResponse apply(
                            ListSqlCollectionAnalyticsRequest request) {
                        return client.listSqlCollectionAnalytics(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link
     * com.oracle.bmc.datasafe.model.SqlCollectionAggregation} objects contained in responses from
     * the listSqlCollectionAnalytics operation. This iterable will fetch more data from the server
     * as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link
     *     com.oracle.bmc.datasafe.model.SqlCollectionAggregation} objects contained in responses
     *     received from the service.
     */
    public Iterable<com.oracle.bmc.datasafe.model.SqlCollectionAggregation>
            listSqlCollectionAnalyticsRecordIterator(
                    final ListSqlCollectionAnalyticsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListSqlCollectionAnalyticsRequest.Builder,
                ListSqlCollectionAnalyticsRequest,
                ListSqlCollectionAnalyticsResponse,
                com.oracle.bmc.datasafe.model.SqlCollectionAggregation>(
                new java.util.function.Supplier<ListSqlCollectionAnalyticsRequest.Builder>() {
                    @Override
                    public ListSqlCollectionAnalyticsRequest.Builder get() {
                        return ListSqlCollectionAnalyticsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListSqlCollectionAnalyticsResponse, String>() {
                    @Override
                    public String apply(ListSqlCollectionAnalyticsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListSqlCollectionAnalyticsRequest.Builder>,
                        ListSqlCollectionAnalyticsRequest>() {
                    @Override
                    public ListSqlCollectionAnalyticsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListSqlCollectionAnalyticsRequest.Builder>
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
                        ListSqlCollectionAnalyticsRequest, ListSqlCollectionAnalyticsResponse>() {
                    @Override
                    public ListSqlCollectionAnalyticsResponse apply(
                            ListSqlCollectionAnalyticsRequest request) {
                        return client.listSqlCollectionAnalytics(request);
                    }
                },
                new java.util.function.Function<
                        ListSqlCollectionAnalyticsResponse,
                        java.util.List<com.oracle.bmc.datasafe.model.SqlCollectionAggregation>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.datasafe.model.SqlCollectionAggregation>
                            apply(ListSqlCollectionAnalyticsResponse response) {
                        return response.getSqlCollectionAnalyticsCollection().getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the
     * listSqlCollectionLogInsights operation. This iterable will fetch more data from the server as
     * needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses
     *     received from the service.
     */
    public Iterable<ListSqlCollectionLogInsightsResponse>
            listSqlCollectionLogInsightsResponseIterator(
                    final ListSqlCollectionLogInsightsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListSqlCollectionLogInsightsRequest.Builder,
                ListSqlCollectionLogInsightsRequest,
                ListSqlCollectionLogInsightsResponse>(
                new java.util.function.Supplier<ListSqlCollectionLogInsightsRequest.Builder>() {
                    @Override
                    public ListSqlCollectionLogInsightsRequest.Builder get() {
                        return ListSqlCollectionLogInsightsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListSqlCollectionLogInsightsResponse, String>() {
                    @Override
                    public String apply(ListSqlCollectionLogInsightsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListSqlCollectionLogInsightsRequest.Builder>,
                        ListSqlCollectionLogInsightsRequest>() {
                    @Override
                    public ListSqlCollectionLogInsightsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListSqlCollectionLogInsightsRequest.Builder>
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
                        ListSqlCollectionLogInsightsRequest,
                        ListSqlCollectionLogInsightsResponse>() {
                    @Override
                    public ListSqlCollectionLogInsightsResponse apply(
                            ListSqlCollectionLogInsightsRequest request) {
                        return client.listSqlCollectionLogInsights(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link
     * com.oracle.bmc.datasafe.model.SqlCollectionLogAggregation} objects contained in responses
     * from the listSqlCollectionLogInsights operation. This iterable will fetch more data from the
     * server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link
     *     com.oracle.bmc.datasafe.model.SqlCollectionLogAggregation} objects contained in responses
     *     received from the service.
     */
    public Iterable<com.oracle.bmc.datasafe.model.SqlCollectionLogAggregation>
            listSqlCollectionLogInsightsRecordIterator(
                    final ListSqlCollectionLogInsightsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListSqlCollectionLogInsightsRequest.Builder,
                ListSqlCollectionLogInsightsRequest,
                ListSqlCollectionLogInsightsResponse,
                com.oracle.bmc.datasafe.model.SqlCollectionLogAggregation>(
                new java.util.function.Supplier<ListSqlCollectionLogInsightsRequest.Builder>() {
                    @Override
                    public ListSqlCollectionLogInsightsRequest.Builder get() {
                        return ListSqlCollectionLogInsightsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListSqlCollectionLogInsightsResponse, String>() {
                    @Override
                    public String apply(ListSqlCollectionLogInsightsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListSqlCollectionLogInsightsRequest.Builder>,
                        ListSqlCollectionLogInsightsRequest>() {
                    @Override
                    public ListSqlCollectionLogInsightsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListSqlCollectionLogInsightsRequest.Builder>
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
                        ListSqlCollectionLogInsightsRequest,
                        ListSqlCollectionLogInsightsResponse>() {
                    @Override
                    public ListSqlCollectionLogInsightsResponse apply(
                            ListSqlCollectionLogInsightsRequest request) {
                        return client.listSqlCollectionLogInsights(request);
                    }
                },
                new java.util.function.Function<
                        ListSqlCollectionLogInsightsResponse,
                        java.util.List<
                                com.oracle.bmc.datasafe.model.SqlCollectionLogAggregation>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.datasafe.model.SqlCollectionLogAggregation>
                            apply(ListSqlCollectionLogInsightsResponse response) {
                        return response.getSqlCollectionLogInsightsCollection().getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the
     * listSqlCollections operation. This iterable will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses
     *     received from the service.
     */
    public Iterable<ListSqlCollectionsResponse> listSqlCollectionsResponseIterator(
            final ListSqlCollectionsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListSqlCollectionsRequest.Builder,
                ListSqlCollectionsRequest,
                ListSqlCollectionsResponse>(
                new java.util.function.Supplier<ListSqlCollectionsRequest.Builder>() {
                    @Override
                    public ListSqlCollectionsRequest.Builder get() {
                        return ListSqlCollectionsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListSqlCollectionsResponse, String>() {
                    @Override
                    public String apply(ListSqlCollectionsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListSqlCollectionsRequest.Builder>,
                        ListSqlCollectionsRequest>() {
                    @Override
                    public ListSqlCollectionsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListSqlCollectionsRequest.Builder>
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
                        ListSqlCollectionsRequest, ListSqlCollectionsResponse>() {
                    @Override
                    public ListSqlCollectionsResponse apply(ListSqlCollectionsRequest request) {
                        return client.listSqlCollections(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link
     * com.oracle.bmc.datasafe.model.SqlCollectionSummary} objects contained in responses from the
     * listSqlCollections operation. This iterable will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link
     *     com.oracle.bmc.datasafe.model.SqlCollectionSummary} objects contained in responses
     *     received from the service.
     */
    public Iterable<com.oracle.bmc.datasafe.model.SqlCollectionSummary>
            listSqlCollectionsRecordIterator(final ListSqlCollectionsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListSqlCollectionsRequest.Builder,
                ListSqlCollectionsRequest,
                ListSqlCollectionsResponse,
                com.oracle.bmc.datasafe.model.SqlCollectionSummary>(
                new java.util.function.Supplier<ListSqlCollectionsRequest.Builder>() {
                    @Override
                    public ListSqlCollectionsRequest.Builder get() {
                        return ListSqlCollectionsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListSqlCollectionsResponse, String>() {
                    @Override
                    public String apply(ListSqlCollectionsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListSqlCollectionsRequest.Builder>,
                        ListSqlCollectionsRequest>() {
                    @Override
                    public ListSqlCollectionsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListSqlCollectionsRequest.Builder>
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
                        ListSqlCollectionsRequest, ListSqlCollectionsResponse>() {
                    @Override
                    public ListSqlCollectionsResponse apply(ListSqlCollectionsRequest request) {
                        return client.listSqlCollections(request);
                    }
                },
                new java.util.function.Function<
                        ListSqlCollectionsResponse,
                        java.util.List<com.oracle.bmc.datasafe.model.SqlCollectionSummary>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.datasafe.model.SqlCollectionSummary> apply(
                            ListSqlCollectionsResponse response) {
                        return response.getSqlCollectionCollection().getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the
     * listSqlFirewallAllowedSqlAnalytics operation. This iterable will fetch more data from the
     * server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses
     *     received from the service.
     */
    public Iterable<ListSqlFirewallAllowedSqlAnalyticsResponse>
            listSqlFirewallAllowedSqlAnalyticsResponseIterator(
                    final ListSqlFirewallAllowedSqlAnalyticsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListSqlFirewallAllowedSqlAnalyticsRequest.Builder,
                ListSqlFirewallAllowedSqlAnalyticsRequest,
                ListSqlFirewallAllowedSqlAnalyticsResponse>(
                new java.util.function.Supplier<
                        ListSqlFirewallAllowedSqlAnalyticsRequest.Builder>() {
                    @Override
                    public ListSqlFirewallAllowedSqlAnalyticsRequest.Builder get() {
                        return ListSqlFirewallAllowedSqlAnalyticsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<
                        ListSqlFirewallAllowedSqlAnalyticsResponse, String>() {
                    @Override
                    public String apply(ListSqlFirewallAllowedSqlAnalyticsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListSqlFirewallAllowedSqlAnalyticsRequest.Builder>,
                        ListSqlFirewallAllowedSqlAnalyticsRequest>() {
                    @Override
                    public ListSqlFirewallAllowedSqlAnalyticsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListSqlFirewallAllowedSqlAnalyticsRequest.Builder>
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
                        ListSqlFirewallAllowedSqlAnalyticsRequest,
                        ListSqlFirewallAllowedSqlAnalyticsResponse>() {
                    @Override
                    public ListSqlFirewallAllowedSqlAnalyticsResponse apply(
                            ListSqlFirewallAllowedSqlAnalyticsRequest request) {
                        return client.listSqlFirewallAllowedSqlAnalytics(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link
     * com.oracle.bmc.datasafe.model.SqlFirewallAllowedSqlAggregation} objects contained in
     * responses from the listSqlFirewallAllowedSqlAnalytics operation. This iterable will fetch
     * more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link
     *     com.oracle.bmc.datasafe.model.SqlFirewallAllowedSqlAggregation} objects contained in
     *     responses received from the service.
     */
    public Iterable<com.oracle.bmc.datasafe.model.SqlFirewallAllowedSqlAggregation>
            listSqlFirewallAllowedSqlAnalyticsRecordIterator(
                    final ListSqlFirewallAllowedSqlAnalyticsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListSqlFirewallAllowedSqlAnalyticsRequest.Builder,
                ListSqlFirewallAllowedSqlAnalyticsRequest,
                ListSqlFirewallAllowedSqlAnalyticsResponse,
                com.oracle.bmc.datasafe.model.SqlFirewallAllowedSqlAggregation>(
                new java.util.function.Supplier<
                        ListSqlFirewallAllowedSqlAnalyticsRequest.Builder>() {
                    @Override
                    public ListSqlFirewallAllowedSqlAnalyticsRequest.Builder get() {
                        return ListSqlFirewallAllowedSqlAnalyticsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<
                        ListSqlFirewallAllowedSqlAnalyticsResponse, String>() {
                    @Override
                    public String apply(ListSqlFirewallAllowedSqlAnalyticsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListSqlFirewallAllowedSqlAnalyticsRequest.Builder>,
                        ListSqlFirewallAllowedSqlAnalyticsRequest>() {
                    @Override
                    public ListSqlFirewallAllowedSqlAnalyticsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListSqlFirewallAllowedSqlAnalyticsRequest.Builder>
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
                        ListSqlFirewallAllowedSqlAnalyticsRequest,
                        ListSqlFirewallAllowedSqlAnalyticsResponse>() {
                    @Override
                    public ListSqlFirewallAllowedSqlAnalyticsResponse apply(
                            ListSqlFirewallAllowedSqlAnalyticsRequest request) {
                        return client.listSqlFirewallAllowedSqlAnalytics(request);
                    }
                },
                new java.util.function.Function<
                        ListSqlFirewallAllowedSqlAnalyticsResponse,
                        java.util.List<
                                com.oracle.bmc.datasafe.model.SqlFirewallAllowedSqlAggregation>>() {
                    @Override
                    public java.util.List<
                                    com.oracle.bmc.datasafe.model.SqlFirewallAllowedSqlAggregation>
                            apply(ListSqlFirewallAllowedSqlAnalyticsResponse response) {
                        return response.getSqlFirewallAllowedSqlAnalyticsCollection().getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the
     * listSqlFirewallAllowedSqls operation. This iterable will fetch more data from the server as
     * needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses
     *     received from the service.
     */
    public Iterable<ListSqlFirewallAllowedSqlsResponse> listSqlFirewallAllowedSqlsResponseIterator(
            final ListSqlFirewallAllowedSqlsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListSqlFirewallAllowedSqlsRequest.Builder,
                ListSqlFirewallAllowedSqlsRequest,
                ListSqlFirewallAllowedSqlsResponse>(
                new java.util.function.Supplier<ListSqlFirewallAllowedSqlsRequest.Builder>() {
                    @Override
                    public ListSqlFirewallAllowedSqlsRequest.Builder get() {
                        return ListSqlFirewallAllowedSqlsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListSqlFirewallAllowedSqlsResponse, String>() {
                    @Override
                    public String apply(ListSqlFirewallAllowedSqlsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListSqlFirewallAllowedSqlsRequest.Builder>,
                        ListSqlFirewallAllowedSqlsRequest>() {
                    @Override
                    public ListSqlFirewallAllowedSqlsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListSqlFirewallAllowedSqlsRequest.Builder>
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
                        ListSqlFirewallAllowedSqlsRequest, ListSqlFirewallAllowedSqlsResponse>() {
                    @Override
                    public ListSqlFirewallAllowedSqlsResponse apply(
                            ListSqlFirewallAllowedSqlsRequest request) {
                        return client.listSqlFirewallAllowedSqls(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link
     * com.oracle.bmc.datasafe.model.SqlFirewallAllowedSqlSummary} objects contained in responses
     * from the listSqlFirewallAllowedSqls operation. This iterable will fetch more data from the
     * server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link
     *     com.oracle.bmc.datasafe.model.SqlFirewallAllowedSqlSummary} objects contained in
     *     responses received from the service.
     */
    public Iterable<com.oracle.bmc.datasafe.model.SqlFirewallAllowedSqlSummary>
            listSqlFirewallAllowedSqlsRecordIterator(
                    final ListSqlFirewallAllowedSqlsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListSqlFirewallAllowedSqlsRequest.Builder,
                ListSqlFirewallAllowedSqlsRequest,
                ListSqlFirewallAllowedSqlsResponse,
                com.oracle.bmc.datasafe.model.SqlFirewallAllowedSqlSummary>(
                new java.util.function.Supplier<ListSqlFirewallAllowedSqlsRequest.Builder>() {
                    @Override
                    public ListSqlFirewallAllowedSqlsRequest.Builder get() {
                        return ListSqlFirewallAllowedSqlsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListSqlFirewallAllowedSqlsResponse, String>() {
                    @Override
                    public String apply(ListSqlFirewallAllowedSqlsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListSqlFirewallAllowedSqlsRequest.Builder>,
                        ListSqlFirewallAllowedSqlsRequest>() {
                    @Override
                    public ListSqlFirewallAllowedSqlsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListSqlFirewallAllowedSqlsRequest.Builder>
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
                        ListSqlFirewallAllowedSqlsRequest, ListSqlFirewallAllowedSqlsResponse>() {
                    @Override
                    public ListSqlFirewallAllowedSqlsResponse apply(
                            ListSqlFirewallAllowedSqlsRequest request) {
                        return client.listSqlFirewallAllowedSqls(request);
                    }
                },
                new java.util.function.Function<
                        ListSqlFirewallAllowedSqlsResponse,
                        java.util.List<
                                com.oracle.bmc.datasafe.model.SqlFirewallAllowedSqlSummary>>() {
                    @Override
                    public java.util.List<
                                    com.oracle.bmc.datasafe.model.SqlFirewallAllowedSqlSummary>
                            apply(ListSqlFirewallAllowedSqlsResponse response) {
                        return response.getSqlFirewallAllowedSqlCollection().getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the
     * listSqlFirewallPolicies operation. This iterable will fetch more data from the server as
     * needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses
     *     received from the service.
     */
    public Iterable<ListSqlFirewallPoliciesResponse> listSqlFirewallPoliciesResponseIterator(
            final ListSqlFirewallPoliciesRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListSqlFirewallPoliciesRequest.Builder,
                ListSqlFirewallPoliciesRequest,
                ListSqlFirewallPoliciesResponse>(
                new java.util.function.Supplier<ListSqlFirewallPoliciesRequest.Builder>() {
                    @Override
                    public ListSqlFirewallPoliciesRequest.Builder get() {
                        return ListSqlFirewallPoliciesRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListSqlFirewallPoliciesResponse, String>() {
                    @Override
                    public String apply(ListSqlFirewallPoliciesResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListSqlFirewallPoliciesRequest.Builder>,
                        ListSqlFirewallPoliciesRequest>() {
                    @Override
                    public ListSqlFirewallPoliciesRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListSqlFirewallPoliciesRequest.Builder>
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
                        ListSqlFirewallPoliciesRequest, ListSqlFirewallPoliciesResponse>() {
                    @Override
                    public ListSqlFirewallPoliciesResponse apply(
                            ListSqlFirewallPoliciesRequest request) {
                        return client.listSqlFirewallPolicies(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link
     * com.oracle.bmc.datasafe.model.SqlFirewallPolicySummary} objects contained in responses from
     * the listSqlFirewallPolicies operation. This iterable will fetch more data from the server as
     * needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link
     *     com.oracle.bmc.datasafe.model.SqlFirewallPolicySummary} objects contained in responses
     *     received from the service.
     */
    public Iterable<com.oracle.bmc.datasafe.model.SqlFirewallPolicySummary>
            listSqlFirewallPoliciesRecordIterator(final ListSqlFirewallPoliciesRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListSqlFirewallPoliciesRequest.Builder,
                ListSqlFirewallPoliciesRequest,
                ListSqlFirewallPoliciesResponse,
                com.oracle.bmc.datasafe.model.SqlFirewallPolicySummary>(
                new java.util.function.Supplier<ListSqlFirewallPoliciesRequest.Builder>() {
                    @Override
                    public ListSqlFirewallPoliciesRequest.Builder get() {
                        return ListSqlFirewallPoliciesRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListSqlFirewallPoliciesResponse, String>() {
                    @Override
                    public String apply(ListSqlFirewallPoliciesResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListSqlFirewallPoliciesRequest.Builder>,
                        ListSqlFirewallPoliciesRequest>() {
                    @Override
                    public ListSqlFirewallPoliciesRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListSqlFirewallPoliciesRequest.Builder>
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
                        ListSqlFirewallPoliciesRequest, ListSqlFirewallPoliciesResponse>() {
                    @Override
                    public ListSqlFirewallPoliciesResponse apply(
                            ListSqlFirewallPoliciesRequest request) {
                        return client.listSqlFirewallPolicies(request);
                    }
                },
                new java.util.function.Function<
                        ListSqlFirewallPoliciesResponse,
                        java.util.List<com.oracle.bmc.datasafe.model.SqlFirewallPolicySummary>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.datasafe.model.SqlFirewallPolicySummary>
                            apply(ListSqlFirewallPoliciesResponse response) {
                        return response.getSqlFirewallPolicyCollection().getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the
     * listSqlFirewallPolicyAnalytics operation. This iterable will fetch more data from the server
     * as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses
     *     received from the service.
     */
    public Iterable<ListSqlFirewallPolicyAnalyticsResponse>
            listSqlFirewallPolicyAnalyticsResponseIterator(
                    final ListSqlFirewallPolicyAnalyticsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListSqlFirewallPolicyAnalyticsRequest.Builder,
                ListSqlFirewallPolicyAnalyticsRequest,
                ListSqlFirewallPolicyAnalyticsResponse>(
                new java.util.function.Supplier<ListSqlFirewallPolicyAnalyticsRequest.Builder>() {
                    @Override
                    public ListSqlFirewallPolicyAnalyticsRequest.Builder get() {
                        return ListSqlFirewallPolicyAnalyticsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListSqlFirewallPolicyAnalyticsResponse, String>() {
                    @Override
                    public String apply(ListSqlFirewallPolicyAnalyticsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListSqlFirewallPolicyAnalyticsRequest.Builder>,
                        ListSqlFirewallPolicyAnalyticsRequest>() {
                    @Override
                    public ListSqlFirewallPolicyAnalyticsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListSqlFirewallPolicyAnalyticsRequest.Builder>
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
                        ListSqlFirewallPolicyAnalyticsRequest,
                        ListSqlFirewallPolicyAnalyticsResponse>() {
                    @Override
                    public ListSqlFirewallPolicyAnalyticsResponse apply(
                            ListSqlFirewallPolicyAnalyticsRequest request) {
                        return client.listSqlFirewallPolicyAnalytics(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link
     * com.oracle.bmc.datasafe.model.SqlFirewallPolicyAggregation} objects contained in responses
     * from the listSqlFirewallPolicyAnalytics operation. This iterable will fetch more data from
     * the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link
     *     com.oracle.bmc.datasafe.model.SqlFirewallPolicyAggregation} objects contained in
     *     responses received from the service.
     */
    public Iterable<com.oracle.bmc.datasafe.model.SqlFirewallPolicyAggregation>
            listSqlFirewallPolicyAnalyticsRecordIterator(
                    final ListSqlFirewallPolicyAnalyticsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListSqlFirewallPolicyAnalyticsRequest.Builder,
                ListSqlFirewallPolicyAnalyticsRequest,
                ListSqlFirewallPolicyAnalyticsResponse,
                com.oracle.bmc.datasafe.model.SqlFirewallPolicyAggregation>(
                new java.util.function.Supplier<ListSqlFirewallPolicyAnalyticsRequest.Builder>() {
                    @Override
                    public ListSqlFirewallPolicyAnalyticsRequest.Builder get() {
                        return ListSqlFirewallPolicyAnalyticsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListSqlFirewallPolicyAnalyticsResponse, String>() {
                    @Override
                    public String apply(ListSqlFirewallPolicyAnalyticsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListSqlFirewallPolicyAnalyticsRequest.Builder>,
                        ListSqlFirewallPolicyAnalyticsRequest>() {
                    @Override
                    public ListSqlFirewallPolicyAnalyticsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListSqlFirewallPolicyAnalyticsRequest.Builder>
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
                        ListSqlFirewallPolicyAnalyticsRequest,
                        ListSqlFirewallPolicyAnalyticsResponse>() {
                    @Override
                    public ListSqlFirewallPolicyAnalyticsResponse apply(
                            ListSqlFirewallPolicyAnalyticsRequest request) {
                        return client.listSqlFirewallPolicyAnalytics(request);
                    }
                },
                new java.util.function.Function<
                        ListSqlFirewallPolicyAnalyticsResponse,
                        java.util.List<
                                com.oracle.bmc.datasafe.model.SqlFirewallPolicyAggregation>>() {
                    @Override
                    public java.util.List<
                                    com.oracle.bmc.datasafe.model.SqlFirewallPolicyAggregation>
                            apply(ListSqlFirewallPolicyAnalyticsResponse response) {
                        return response.getSqlFirewallPolicyAnalyticsCollection().getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the
     * listSqlFirewallViolationAnalytics operation. This iterable will fetch more data from the
     * server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses
     *     received from the service.
     */
    public Iterable<ListSqlFirewallViolationAnalyticsResponse>
            listSqlFirewallViolationAnalyticsResponseIterator(
                    final ListSqlFirewallViolationAnalyticsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListSqlFirewallViolationAnalyticsRequest.Builder,
                ListSqlFirewallViolationAnalyticsRequest,
                ListSqlFirewallViolationAnalyticsResponse>(
                new java.util.function.Supplier<
                        ListSqlFirewallViolationAnalyticsRequest.Builder>() {
                    @Override
                    public ListSqlFirewallViolationAnalyticsRequest.Builder get() {
                        return ListSqlFirewallViolationAnalyticsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<
                        ListSqlFirewallViolationAnalyticsResponse, String>() {
                    @Override
                    public String apply(ListSqlFirewallViolationAnalyticsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListSqlFirewallViolationAnalyticsRequest.Builder>,
                        ListSqlFirewallViolationAnalyticsRequest>() {
                    @Override
                    public ListSqlFirewallViolationAnalyticsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListSqlFirewallViolationAnalyticsRequest.Builder>
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
                        ListSqlFirewallViolationAnalyticsRequest,
                        ListSqlFirewallViolationAnalyticsResponse>() {
                    @Override
                    public ListSqlFirewallViolationAnalyticsResponse apply(
                            ListSqlFirewallViolationAnalyticsRequest request) {
                        return client.listSqlFirewallViolationAnalytics(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link
     * com.oracle.bmc.datasafe.model.SqlFirewallViolationAggregation} objects contained in responses
     * from the listSqlFirewallViolationAnalytics operation. This iterable will fetch more data from
     * the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link
     *     com.oracle.bmc.datasafe.model.SqlFirewallViolationAggregation} objects contained in
     *     responses received from the service.
     */
    public Iterable<com.oracle.bmc.datasafe.model.SqlFirewallViolationAggregation>
            listSqlFirewallViolationAnalyticsRecordIterator(
                    final ListSqlFirewallViolationAnalyticsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListSqlFirewallViolationAnalyticsRequest.Builder,
                ListSqlFirewallViolationAnalyticsRequest,
                ListSqlFirewallViolationAnalyticsResponse,
                com.oracle.bmc.datasafe.model.SqlFirewallViolationAggregation>(
                new java.util.function.Supplier<
                        ListSqlFirewallViolationAnalyticsRequest.Builder>() {
                    @Override
                    public ListSqlFirewallViolationAnalyticsRequest.Builder get() {
                        return ListSqlFirewallViolationAnalyticsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<
                        ListSqlFirewallViolationAnalyticsResponse, String>() {
                    @Override
                    public String apply(ListSqlFirewallViolationAnalyticsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListSqlFirewallViolationAnalyticsRequest.Builder>,
                        ListSqlFirewallViolationAnalyticsRequest>() {
                    @Override
                    public ListSqlFirewallViolationAnalyticsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListSqlFirewallViolationAnalyticsRequest.Builder>
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
                        ListSqlFirewallViolationAnalyticsRequest,
                        ListSqlFirewallViolationAnalyticsResponse>() {
                    @Override
                    public ListSqlFirewallViolationAnalyticsResponse apply(
                            ListSqlFirewallViolationAnalyticsRequest request) {
                        return client.listSqlFirewallViolationAnalytics(request);
                    }
                },
                new java.util.function.Function<
                        ListSqlFirewallViolationAnalyticsResponse,
                        java.util.List<
                                com.oracle.bmc.datasafe.model.SqlFirewallViolationAggregation>>() {
                    @Override
                    public java.util.List<
                                    com.oracle.bmc.datasafe.model.SqlFirewallViolationAggregation>
                            apply(ListSqlFirewallViolationAnalyticsResponse response) {
                        return response.getSqlFirewallViolationAnalyticsCollection().getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the
     * listSqlFirewallViolations operation. This iterable will fetch more data from the server as
     * needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses
     *     received from the service.
     */
    public Iterable<ListSqlFirewallViolationsResponse> listSqlFirewallViolationsResponseIterator(
            final ListSqlFirewallViolationsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListSqlFirewallViolationsRequest.Builder,
                ListSqlFirewallViolationsRequest,
                ListSqlFirewallViolationsResponse>(
                new java.util.function.Supplier<ListSqlFirewallViolationsRequest.Builder>() {
                    @Override
                    public ListSqlFirewallViolationsRequest.Builder get() {
                        return ListSqlFirewallViolationsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListSqlFirewallViolationsResponse, String>() {
                    @Override
                    public String apply(ListSqlFirewallViolationsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListSqlFirewallViolationsRequest.Builder>,
                        ListSqlFirewallViolationsRequest>() {
                    @Override
                    public ListSqlFirewallViolationsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListSqlFirewallViolationsRequest.Builder>
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
                        ListSqlFirewallViolationsRequest, ListSqlFirewallViolationsResponse>() {
                    @Override
                    public ListSqlFirewallViolationsResponse apply(
                            ListSqlFirewallViolationsRequest request) {
                        return client.listSqlFirewallViolations(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link
     * com.oracle.bmc.datasafe.model.SqlFirewallViolationSummary} objects contained in responses
     * from the listSqlFirewallViolations operation. This iterable will fetch more data from the
     * server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link
     *     com.oracle.bmc.datasafe.model.SqlFirewallViolationSummary} objects contained in responses
     *     received from the service.
     */
    public Iterable<com.oracle.bmc.datasafe.model.SqlFirewallViolationSummary>
            listSqlFirewallViolationsRecordIterator(
                    final ListSqlFirewallViolationsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListSqlFirewallViolationsRequest.Builder,
                ListSqlFirewallViolationsRequest,
                ListSqlFirewallViolationsResponse,
                com.oracle.bmc.datasafe.model.SqlFirewallViolationSummary>(
                new java.util.function.Supplier<ListSqlFirewallViolationsRequest.Builder>() {
                    @Override
                    public ListSqlFirewallViolationsRequest.Builder get() {
                        return ListSqlFirewallViolationsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListSqlFirewallViolationsResponse, String>() {
                    @Override
                    public String apply(ListSqlFirewallViolationsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListSqlFirewallViolationsRequest.Builder>,
                        ListSqlFirewallViolationsRequest>() {
                    @Override
                    public ListSqlFirewallViolationsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListSqlFirewallViolationsRequest.Builder>
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
                        ListSqlFirewallViolationsRequest, ListSqlFirewallViolationsResponse>() {
                    @Override
                    public ListSqlFirewallViolationsResponse apply(
                            ListSqlFirewallViolationsRequest request) {
                        return client.listSqlFirewallViolations(request);
                    }
                },
                new java.util.function.Function<
                        ListSqlFirewallViolationsResponse,
                        java.util.List<
                                com.oracle.bmc.datasafe.model.SqlFirewallViolationSummary>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.datasafe.model.SqlFirewallViolationSummary>
                            apply(ListSqlFirewallViolationsResponse response) {
                        return response.getSqlFirewallViolationsCollection().getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the listTables
     * operation. This iterable will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses
     *     received from the service.
     */
    public Iterable<ListTablesResponse> listTablesResponseIterator(
            final ListTablesRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListTablesRequest.Builder, ListTablesRequest, ListTablesResponse>(
                new java.util.function.Supplier<ListTablesRequest.Builder>() {
                    @Override
                    public ListTablesRequest.Builder get() {
                        return ListTablesRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListTablesResponse, String>() {
                    @Override
                    public String apply(ListTablesResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListTablesRequest.Builder>,
                        ListTablesRequest>() {
                    @Override
                    public ListTablesRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListTablesRequest.Builder>
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
                new java.util.function.Function<ListTablesRequest, ListTablesResponse>() {
                    @Override
                    public ListTablesResponse apply(ListTablesRequest request) {
                        return client.listTables(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link
     * com.oracle.bmc.datasafe.model.TableSummary} objects contained in responses from the
     * listTables operation. This iterable will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link
     *     com.oracle.bmc.datasafe.model.TableSummary} objects contained in responses received from
     *     the service.
     */
    public Iterable<com.oracle.bmc.datasafe.model.TableSummary> listTablesRecordIterator(
            final ListTablesRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListTablesRequest.Builder,
                ListTablesRequest,
                ListTablesResponse,
                com.oracle.bmc.datasafe.model.TableSummary>(
                new java.util.function.Supplier<ListTablesRequest.Builder>() {
                    @Override
                    public ListTablesRequest.Builder get() {
                        return ListTablesRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListTablesResponse, String>() {
                    @Override
                    public String apply(ListTablesResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListTablesRequest.Builder>,
                        ListTablesRequest>() {
                    @Override
                    public ListTablesRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListTablesRequest.Builder>
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
                new java.util.function.Function<ListTablesRequest, ListTablesResponse>() {
                    @Override
                    public ListTablesResponse apply(ListTablesRequest request) {
                        return client.listTables(request);
                    }
                },
                new java.util.function.Function<
                        ListTablesResponse,
                        java.util.List<com.oracle.bmc.datasafe.model.TableSummary>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.datasafe.model.TableSummary> apply(
                            ListTablesResponse response) {
                        return response.getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the
     * listTargetAlertPolicyAssociations operation. This iterable will fetch more data from the
     * server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses
     *     received from the service.
     */
    public Iterable<ListTargetAlertPolicyAssociationsResponse>
            listTargetAlertPolicyAssociationsResponseIterator(
                    final ListTargetAlertPolicyAssociationsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListTargetAlertPolicyAssociationsRequest.Builder,
                ListTargetAlertPolicyAssociationsRequest,
                ListTargetAlertPolicyAssociationsResponse>(
                new java.util.function.Supplier<
                        ListTargetAlertPolicyAssociationsRequest.Builder>() {
                    @Override
                    public ListTargetAlertPolicyAssociationsRequest.Builder get() {
                        return ListTargetAlertPolicyAssociationsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<
                        ListTargetAlertPolicyAssociationsResponse, String>() {
                    @Override
                    public String apply(ListTargetAlertPolicyAssociationsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListTargetAlertPolicyAssociationsRequest.Builder>,
                        ListTargetAlertPolicyAssociationsRequest>() {
                    @Override
                    public ListTargetAlertPolicyAssociationsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListTargetAlertPolicyAssociationsRequest.Builder>
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
                        ListTargetAlertPolicyAssociationsRequest,
                        ListTargetAlertPolicyAssociationsResponse>() {
                    @Override
                    public ListTargetAlertPolicyAssociationsResponse apply(
                            ListTargetAlertPolicyAssociationsRequest request) {
                        return client.listTargetAlertPolicyAssociations(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link
     * com.oracle.bmc.datasafe.model.TargetAlertPolicyAssociationSummary} objects contained in
     * responses from the listTargetAlertPolicyAssociations operation. This iterable will fetch more
     * data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link
     *     com.oracle.bmc.datasafe.model.TargetAlertPolicyAssociationSummary} objects contained in
     *     responses received from the service.
     */
    public Iterable<com.oracle.bmc.datasafe.model.TargetAlertPolicyAssociationSummary>
            listTargetAlertPolicyAssociationsRecordIterator(
                    final ListTargetAlertPolicyAssociationsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListTargetAlertPolicyAssociationsRequest.Builder,
                ListTargetAlertPolicyAssociationsRequest,
                ListTargetAlertPolicyAssociationsResponse,
                com.oracle.bmc.datasafe.model.TargetAlertPolicyAssociationSummary>(
                new java.util.function.Supplier<
                        ListTargetAlertPolicyAssociationsRequest.Builder>() {
                    @Override
                    public ListTargetAlertPolicyAssociationsRequest.Builder get() {
                        return ListTargetAlertPolicyAssociationsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<
                        ListTargetAlertPolicyAssociationsResponse, String>() {
                    @Override
                    public String apply(ListTargetAlertPolicyAssociationsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListTargetAlertPolicyAssociationsRequest.Builder>,
                        ListTargetAlertPolicyAssociationsRequest>() {
                    @Override
                    public ListTargetAlertPolicyAssociationsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListTargetAlertPolicyAssociationsRequest.Builder>
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
                        ListTargetAlertPolicyAssociationsRequest,
                        ListTargetAlertPolicyAssociationsResponse>() {
                    @Override
                    public ListTargetAlertPolicyAssociationsResponse apply(
                            ListTargetAlertPolicyAssociationsRequest request) {
                        return client.listTargetAlertPolicyAssociations(request);
                    }
                },
                new java.util.function.Function<
                        ListTargetAlertPolicyAssociationsResponse,
                        java.util.List<
                                com.oracle.bmc.datasafe.model
                                        .TargetAlertPolicyAssociationSummary>>() {
                    @Override
                    public java.util.List<
                                    com.oracle.bmc.datasafe.model
                                            .TargetAlertPolicyAssociationSummary>
                            apply(ListTargetAlertPolicyAssociationsResponse response) {
                        return response.getTargetAlertPolicyAssociationCollection().getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the
     * listTargetDatabases operation. This iterable will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses
     *     received from the service.
     */
    public Iterable<ListTargetDatabasesResponse> listTargetDatabasesResponseIterator(
            final ListTargetDatabasesRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListTargetDatabasesRequest.Builder,
                ListTargetDatabasesRequest,
                ListTargetDatabasesResponse>(
                new java.util.function.Supplier<ListTargetDatabasesRequest.Builder>() {
                    @Override
                    public ListTargetDatabasesRequest.Builder get() {
                        return ListTargetDatabasesRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListTargetDatabasesResponse, String>() {
                    @Override
                    public String apply(ListTargetDatabasesResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListTargetDatabasesRequest.Builder>,
                        ListTargetDatabasesRequest>() {
                    @Override
                    public ListTargetDatabasesRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListTargetDatabasesRequest.Builder>
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
                        ListTargetDatabasesRequest, ListTargetDatabasesResponse>() {
                    @Override
                    public ListTargetDatabasesResponse apply(ListTargetDatabasesRequest request) {
                        return client.listTargetDatabases(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link
     * com.oracle.bmc.datasafe.model.TargetDatabaseSummary} objects contained in responses from the
     * listTargetDatabases operation. This iterable will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link
     *     com.oracle.bmc.datasafe.model.TargetDatabaseSummary} objects contained in responses
     *     received from the service.
     */
    public Iterable<com.oracle.bmc.datasafe.model.TargetDatabaseSummary>
            listTargetDatabasesRecordIterator(final ListTargetDatabasesRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListTargetDatabasesRequest.Builder,
                ListTargetDatabasesRequest,
                ListTargetDatabasesResponse,
                com.oracle.bmc.datasafe.model.TargetDatabaseSummary>(
                new java.util.function.Supplier<ListTargetDatabasesRequest.Builder>() {
                    @Override
                    public ListTargetDatabasesRequest.Builder get() {
                        return ListTargetDatabasesRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListTargetDatabasesResponse, String>() {
                    @Override
                    public String apply(ListTargetDatabasesResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListTargetDatabasesRequest.Builder>,
                        ListTargetDatabasesRequest>() {
                    @Override
                    public ListTargetDatabasesRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListTargetDatabasesRequest.Builder>
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
                        ListTargetDatabasesRequest, ListTargetDatabasesResponse>() {
                    @Override
                    public ListTargetDatabasesResponse apply(ListTargetDatabasesRequest request) {
                        return client.listTargetDatabases(request);
                    }
                },
                new java.util.function.Function<
                        ListTargetDatabasesResponse,
                        java.util.List<com.oracle.bmc.datasafe.model.TargetDatabaseSummary>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.datasafe.model.TargetDatabaseSummary>
                            apply(ListTargetDatabasesResponse response) {
                        return response.getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the
     * listUserAnalytics operation. This iterable will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses
     *     received from the service.
     */
    public Iterable<ListUserAnalyticsResponse> listUserAnalyticsResponseIterator(
            final ListUserAnalyticsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListUserAnalyticsRequest.Builder,
                ListUserAnalyticsRequest,
                ListUserAnalyticsResponse>(
                new java.util.function.Supplier<ListUserAnalyticsRequest.Builder>() {
                    @Override
                    public ListUserAnalyticsRequest.Builder get() {
                        return ListUserAnalyticsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListUserAnalyticsResponse, String>() {
                    @Override
                    public String apply(ListUserAnalyticsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListUserAnalyticsRequest.Builder>,
                        ListUserAnalyticsRequest>() {
                    @Override
                    public ListUserAnalyticsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListUserAnalyticsRequest.Builder>
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
                        ListUserAnalyticsRequest, ListUserAnalyticsResponse>() {
                    @Override
                    public ListUserAnalyticsResponse apply(ListUserAnalyticsRequest request) {
                        return client.listUserAnalytics(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link
     * com.oracle.bmc.datasafe.model.UserAggregation} objects contained in responses from the
     * listUserAnalytics operation. This iterable will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link
     *     com.oracle.bmc.datasafe.model.UserAggregation} objects contained in responses received
     *     from the service.
     */
    public Iterable<com.oracle.bmc.datasafe.model.UserAggregation> listUserAnalyticsRecordIterator(
            final ListUserAnalyticsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListUserAnalyticsRequest.Builder,
                ListUserAnalyticsRequest,
                ListUserAnalyticsResponse,
                com.oracle.bmc.datasafe.model.UserAggregation>(
                new java.util.function.Supplier<ListUserAnalyticsRequest.Builder>() {
                    @Override
                    public ListUserAnalyticsRequest.Builder get() {
                        return ListUserAnalyticsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListUserAnalyticsResponse, String>() {
                    @Override
                    public String apply(ListUserAnalyticsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListUserAnalyticsRequest.Builder>,
                        ListUserAnalyticsRequest>() {
                    @Override
                    public ListUserAnalyticsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListUserAnalyticsRequest.Builder>
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
                        ListUserAnalyticsRequest, ListUserAnalyticsResponse>() {
                    @Override
                    public ListUserAnalyticsResponse apply(ListUserAnalyticsRequest request) {
                        return client.listUserAnalytics(request);
                    }
                },
                new java.util.function.Function<
                        ListUserAnalyticsResponse,
                        java.util.List<com.oracle.bmc.datasafe.model.UserAggregation>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.datasafe.model.UserAggregation> apply(
                            ListUserAnalyticsResponse response) {
                        return response.getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the
     * listUserAssessments operation. This iterable will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses
     *     received from the service.
     */
    public Iterable<ListUserAssessmentsResponse> listUserAssessmentsResponseIterator(
            final ListUserAssessmentsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListUserAssessmentsRequest.Builder,
                ListUserAssessmentsRequest,
                ListUserAssessmentsResponse>(
                new java.util.function.Supplier<ListUserAssessmentsRequest.Builder>() {
                    @Override
                    public ListUserAssessmentsRequest.Builder get() {
                        return ListUserAssessmentsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListUserAssessmentsResponse, String>() {
                    @Override
                    public String apply(ListUserAssessmentsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListUserAssessmentsRequest.Builder>,
                        ListUserAssessmentsRequest>() {
                    @Override
                    public ListUserAssessmentsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListUserAssessmentsRequest.Builder>
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
                        ListUserAssessmentsRequest, ListUserAssessmentsResponse>() {
                    @Override
                    public ListUserAssessmentsResponse apply(ListUserAssessmentsRequest request) {
                        return client.listUserAssessments(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link
     * com.oracle.bmc.datasafe.model.UserAssessmentSummary} objects contained in responses from the
     * listUserAssessments operation. This iterable will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link
     *     com.oracle.bmc.datasafe.model.UserAssessmentSummary} objects contained in responses
     *     received from the service.
     */
    public Iterable<com.oracle.bmc.datasafe.model.UserAssessmentSummary>
            listUserAssessmentsRecordIterator(final ListUserAssessmentsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListUserAssessmentsRequest.Builder,
                ListUserAssessmentsRequest,
                ListUserAssessmentsResponse,
                com.oracle.bmc.datasafe.model.UserAssessmentSummary>(
                new java.util.function.Supplier<ListUserAssessmentsRequest.Builder>() {
                    @Override
                    public ListUserAssessmentsRequest.Builder get() {
                        return ListUserAssessmentsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListUserAssessmentsResponse, String>() {
                    @Override
                    public String apply(ListUserAssessmentsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListUserAssessmentsRequest.Builder>,
                        ListUserAssessmentsRequest>() {
                    @Override
                    public ListUserAssessmentsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListUserAssessmentsRequest.Builder>
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
                        ListUserAssessmentsRequest, ListUserAssessmentsResponse>() {
                    @Override
                    public ListUserAssessmentsResponse apply(ListUserAssessmentsRequest request) {
                        return client.listUserAssessments(request);
                    }
                },
                new java.util.function.Function<
                        ListUserAssessmentsResponse,
                        java.util.List<com.oracle.bmc.datasafe.model.UserAssessmentSummary>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.datasafe.model.UserAssessmentSummary>
                            apply(ListUserAssessmentsResponse response) {
                        return response.getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the listUsers
     * operation. This iterable will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses
     *     received from the service.
     */
    public Iterable<ListUsersResponse> listUsersResponseIterator(final ListUsersRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListUsersRequest.Builder, ListUsersRequest, ListUsersResponse>(
                new java.util.function.Supplier<ListUsersRequest.Builder>() {
                    @Override
                    public ListUsersRequest.Builder get() {
                        return ListUsersRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListUsersResponse, String>() {
                    @Override
                    public String apply(ListUsersResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListUsersRequest.Builder>,
                        ListUsersRequest>() {
                    @Override
                    public ListUsersRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListUsersRequest.Builder>
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
                new java.util.function.Function<ListUsersRequest, ListUsersResponse>() {
                    @Override
                    public ListUsersResponse apply(ListUsersRequest request) {
                        return client.listUsers(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link
     * com.oracle.bmc.datasafe.model.UserSummary} objects contained in responses from the listUsers
     * operation. This iterable will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link
     *     com.oracle.bmc.datasafe.model.UserSummary} objects contained in responses received from
     *     the service.
     */
    public Iterable<com.oracle.bmc.datasafe.model.UserSummary> listUsersRecordIterator(
            final ListUsersRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListUsersRequest.Builder,
                ListUsersRequest,
                ListUsersResponse,
                com.oracle.bmc.datasafe.model.UserSummary>(
                new java.util.function.Supplier<ListUsersRequest.Builder>() {
                    @Override
                    public ListUsersRequest.Builder get() {
                        return ListUsersRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListUsersResponse, String>() {
                    @Override
                    public String apply(ListUsersResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListUsersRequest.Builder>,
                        ListUsersRequest>() {
                    @Override
                    public ListUsersRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListUsersRequest.Builder>
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
                new java.util.function.Function<ListUsersRequest, ListUsersResponse>() {
                    @Override
                    public ListUsersResponse apply(ListUsersRequest request) {
                        return client.listUsers(request);
                    }
                },
                new java.util.function.Function<
                        ListUsersResponse,
                        java.util.List<com.oracle.bmc.datasafe.model.UserSummary>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.datasafe.model.UserSummary> apply(
                            ListUsersResponse response) {
                        return response.getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the
     * listWorkRequestErrors operation. This iterable will fetch more data from the server as
     * needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses
     *     received from the service.
     */
    public Iterable<ListWorkRequestErrorsResponse> listWorkRequestErrorsResponseIterator(
            final ListWorkRequestErrorsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListWorkRequestErrorsRequest.Builder,
                ListWorkRequestErrorsRequest,
                ListWorkRequestErrorsResponse>(
                new java.util.function.Supplier<ListWorkRequestErrorsRequest.Builder>() {
                    @Override
                    public ListWorkRequestErrorsRequest.Builder get() {
                        return ListWorkRequestErrorsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListWorkRequestErrorsResponse, String>() {
                    @Override
                    public String apply(ListWorkRequestErrorsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListWorkRequestErrorsRequest.Builder>,
                        ListWorkRequestErrorsRequest>() {
                    @Override
                    public ListWorkRequestErrorsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListWorkRequestErrorsRequest.Builder>
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
                        ListWorkRequestErrorsRequest, ListWorkRequestErrorsResponse>() {
                    @Override
                    public ListWorkRequestErrorsResponse apply(
                            ListWorkRequestErrorsRequest request) {
                        return client.listWorkRequestErrors(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link
     * com.oracle.bmc.datasafe.model.WorkRequestError} objects contained in responses from the
     * listWorkRequestErrors operation. This iterable will fetch more data from the server as
     * needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link
     *     com.oracle.bmc.datasafe.model.WorkRequestError} objects contained in responses received
     *     from the service.
     */
    public Iterable<com.oracle.bmc.datasafe.model.WorkRequestError>
            listWorkRequestErrorsRecordIterator(final ListWorkRequestErrorsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListWorkRequestErrorsRequest.Builder,
                ListWorkRequestErrorsRequest,
                ListWorkRequestErrorsResponse,
                com.oracle.bmc.datasafe.model.WorkRequestError>(
                new java.util.function.Supplier<ListWorkRequestErrorsRequest.Builder>() {
                    @Override
                    public ListWorkRequestErrorsRequest.Builder get() {
                        return ListWorkRequestErrorsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListWorkRequestErrorsResponse, String>() {
                    @Override
                    public String apply(ListWorkRequestErrorsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListWorkRequestErrorsRequest.Builder>,
                        ListWorkRequestErrorsRequest>() {
                    @Override
                    public ListWorkRequestErrorsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListWorkRequestErrorsRequest.Builder>
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
                        ListWorkRequestErrorsRequest, ListWorkRequestErrorsResponse>() {
                    @Override
                    public ListWorkRequestErrorsResponse apply(
                            ListWorkRequestErrorsRequest request) {
                        return client.listWorkRequestErrors(request);
                    }
                },
                new java.util.function.Function<
                        ListWorkRequestErrorsResponse,
                        java.util.List<com.oracle.bmc.datasafe.model.WorkRequestError>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.datasafe.model.WorkRequestError> apply(
                            ListWorkRequestErrorsResponse response) {
                        return response.getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the
     * listWorkRequestLogs operation. This iterable will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses
     *     received from the service.
     */
    public Iterable<ListWorkRequestLogsResponse> listWorkRequestLogsResponseIterator(
            final ListWorkRequestLogsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListWorkRequestLogsRequest.Builder,
                ListWorkRequestLogsRequest,
                ListWorkRequestLogsResponse>(
                new java.util.function.Supplier<ListWorkRequestLogsRequest.Builder>() {
                    @Override
                    public ListWorkRequestLogsRequest.Builder get() {
                        return ListWorkRequestLogsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListWorkRequestLogsResponse, String>() {
                    @Override
                    public String apply(ListWorkRequestLogsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListWorkRequestLogsRequest.Builder>,
                        ListWorkRequestLogsRequest>() {
                    @Override
                    public ListWorkRequestLogsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListWorkRequestLogsRequest.Builder>
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
                        ListWorkRequestLogsRequest, ListWorkRequestLogsResponse>() {
                    @Override
                    public ListWorkRequestLogsResponse apply(ListWorkRequestLogsRequest request) {
                        return client.listWorkRequestLogs(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link
     * com.oracle.bmc.datasafe.model.WorkRequestLogEntry} objects contained in responses from the
     * listWorkRequestLogs operation. This iterable will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link
     *     com.oracle.bmc.datasafe.model.WorkRequestLogEntry} objects contained in responses
     *     received from the service.
     */
    public Iterable<com.oracle.bmc.datasafe.model.WorkRequestLogEntry>
            listWorkRequestLogsRecordIterator(final ListWorkRequestLogsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListWorkRequestLogsRequest.Builder,
                ListWorkRequestLogsRequest,
                ListWorkRequestLogsResponse,
                com.oracle.bmc.datasafe.model.WorkRequestLogEntry>(
                new java.util.function.Supplier<ListWorkRequestLogsRequest.Builder>() {
                    @Override
                    public ListWorkRequestLogsRequest.Builder get() {
                        return ListWorkRequestLogsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListWorkRequestLogsResponse, String>() {
                    @Override
                    public String apply(ListWorkRequestLogsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListWorkRequestLogsRequest.Builder>,
                        ListWorkRequestLogsRequest>() {
                    @Override
                    public ListWorkRequestLogsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListWorkRequestLogsRequest.Builder>
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
                        ListWorkRequestLogsRequest, ListWorkRequestLogsResponse>() {
                    @Override
                    public ListWorkRequestLogsResponse apply(ListWorkRequestLogsRequest request) {
                        return client.listWorkRequestLogs(request);
                    }
                },
                new java.util.function.Function<
                        ListWorkRequestLogsResponse,
                        java.util.List<com.oracle.bmc.datasafe.model.WorkRequestLogEntry>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.datasafe.model.WorkRequestLogEntry> apply(
                            ListWorkRequestLogsResponse response) {
                        return response.getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the
     * listWorkRequests operation. This iterable will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses
     *     received from the service.
     */
    public Iterable<ListWorkRequestsResponse> listWorkRequestsResponseIterator(
            final ListWorkRequestsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListWorkRequestsRequest.Builder, ListWorkRequestsRequest, ListWorkRequestsResponse>(
                new java.util.function.Supplier<ListWorkRequestsRequest.Builder>() {
                    @Override
                    public ListWorkRequestsRequest.Builder get() {
                        return ListWorkRequestsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListWorkRequestsResponse, String>() {
                    @Override
                    public String apply(ListWorkRequestsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListWorkRequestsRequest.Builder>,
                        ListWorkRequestsRequest>() {
                    @Override
                    public ListWorkRequestsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListWorkRequestsRequest.Builder>
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
                        ListWorkRequestsRequest, ListWorkRequestsResponse>() {
                    @Override
                    public ListWorkRequestsResponse apply(ListWorkRequestsRequest request) {
                        return client.listWorkRequests(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link
     * com.oracle.bmc.datasafe.model.WorkRequestSummary} objects contained in responses from the
     * listWorkRequests operation. This iterable will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link
     *     com.oracle.bmc.datasafe.model.WorkRequestSummary} objects contained in responses received
     *     from the service.
     */
    public Iterable<com.oracle.bmc.datasafe.model.WorkRequestSummary>
            listWorkRequestsRecordIterator(final ListWorkRequestsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListWorkRequestsRequest.Builder,
                ListWorkRequestsRequest,
                ListWorkRequestsResponse,
                com.oracle.bmc.datasafe.model.WorkRequestSummary>(
                new java.util.function.Supplier<ListWorkRequestsRequest.Builder>() {
                    @Override
                    public ListWorkRequestsRequest.Builder get() {
                        return ListWorkRequestsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListWorkRequestsResponse, String>() {
                    @Override
                    public String apply(ListWorkRequestsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListWorkRequestsRequest.Builder>,
                        ListWorkRequestsRequest>() {
                    @Override
                    public ListWorkRequestsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListWorkRequestsRequest.Builder>
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
                        ListWorkRequestsRequest, ListWorkRequestsResponse>() {
                    @Override
                    public ListWorkRequestsResponse apply(ListWorkRequestsRequest request) {
                        return client.listWorkRequests(request);
                    }
                },
                new java.util.function.Function<
                        ListWorkRequestsResponse,
                        java.util.List<com.oracle.bmc.datasafe.model.WorkRequestSummary>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.datasafe.model.WorkRequestSummary> apply(
                            ListWorkRequestsResponse response) {
                        return response.getItems();
                    }
                });
    }
}

/**
 * Copyright (c) 2016, 2021, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.opsi;

import com.oracle.bmc.opsi.requests.*;
import com.oracle.bmc.opsi.responses.*;

/**
 * Collection of helper methods that can be used to provide an {@link java.lang.Iterable} interface
 * to any list operations of OperationsInsights where multiple pages of data may be fetched.
 * Two styles of iteration are supported:
 *
 * <ul>
 *   <li>Iterating over the Response objects returned by the list operation. These are referred to as ResponseIterators, and the methods are suffixed with ResponseIterator. For example: <i>listUsersResponseIterator</i></li>
 *   <li>Iterating over the resources/records being listed. These are referred to as RecordIterators, and the methods are suffixed with RecordIterator. For example: <i>listUsersRecordIterator</i></li>
 * </ul>
 *
 * These iterables abstract away the need to write code to manually handle pagination via looping and using the page tokens.
 * They will automatically fetch more data from the service when required.
 *
 * As an example, if we were using the ListUsers operation in IdentityService, then the {@link java.lang.Iterable} returned by calling a
 * ResponseIterator method would iterate over the ListUsersResponse objects returned by each ListUsers call, whereas the {@link java.lang.Iterable}
 * returned by calling a RecordIterator method would iterate over the User records and we don't have to deal with ListUsersResponse objects at all.
 * In either case, pagination will be automatically handled so we can iterate until there are no more responses or no more resources/records available.
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200630")
@lombok.RequiredArgsConstructor
public class OperationsInsightsPaginators {
    private final OperationsInsights client;

    /**
     * Creates a new iterable which will iterate over the responses received from the listDatabaseInsights operation. This iterable
     * will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses received from the service.
     */
    public Iterable<ListDatabaseInsightsResponse> listDatabaseInsightsResponseIterator(
            final ListDatabaseInsightsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListDatabaseInsightsRequest.Builder, ListDatabaseInsightsRequest,
                ListDatabaseInsightsResponse>(
                new com.google.common.base.Supplier<ListDatabaseInsightsRequest.Builder>() {
                    @Override
                    public ListDatabaseInsightsRequest.Builder get() {
                        return ListDatabaseInsightsRequest.builder().copy(request);
                    }
                },
                new com.google.common.base.Function<ListDatabaseInsightsResponse, String>() {
                    @Override
                    public String apply(ListDatabaseInsightsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new com.google.common.base.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListDatabaseInsightsRequest.Builder>,
                        ListDatabaseInsightsRequest>() {
                    @Override
                    public ListDatabaseInsightsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListDatabaseInsightsRequest.Builder>
                                    input) {
                        if (input.getToken() == null) {
                            return input.getRequestBuilder().build();
                        } else {
                            return input.getRequestBuilder()
                                    .page(input.getToken().orNull())
                                    .build();
                        }
                    }
                },
                new com.google.common.base.Function<
                        ListDatabaseInsightsRequest, ListDatabaseInsightsResponse>() {
                    @Override
                    public ListDatabaseInsightsResponse apply(ListDatabaseInsightsRequest request) {
                        return client.listDatabaseInsights(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link com.oracle.bmc.opsi.model.DatabaseInsightSummary} objects
     * contained in responses from the listDatabaseInsights operation. This iterable will fetch more data from the
     * server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link com.oracle.bmc.opsi.model.DatabaseInsightSummary} objects
     * contained in responses received from the service.
     */
    public Iterable<com.oracle.bmc.opsi.model.DatabaseInsightSummary>
            listDatabaseInsightsRecordIterator(final ListDatabaseInsightsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListDatabaseInsightsRequest.Builder, ListDatabaseInsightsRequest,
                ListDatabaseInsightsResponse, com.oracle.bmc.opsi.model.DatabaseInsightSummary>(
                new com.google.common.base.Supplier<ListDatabaseInsightsRequest.Builder>() {
                    @Override
                    public ListDatabaseInsightsRequest.Builder get() {
                        return ListDatabaseInsightsRequest.builder().copy(request);
                    }
                },
                new com.google.common.base.Function<ListDatabaseInsightsResponse, String>() {
                    @Override
                    public String apply(ListDatabaseInsightsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new com.google.common.base.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListDatabaseInsightsRequest.Builder>,
                        ListDatabaseInsightsRequest>() {
                    @Override
                    public ListDatabaseInsightsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListDatabaseInsightsRequest.Builder>
                                    input) {
                        if (input.getToken() == null) {
                            return input.getRequestBuilder().build();
                        } else {
                            return input.getRequestBuilder()
                                    .page(input.getToken().orNull())
                                    .build();
                        }
                    }
                },
                new com.google.common.base.Function<
                        ListDatabaseInsightsRequest, ListDatabaseInsightsResponse>() {
                    @Override
                    public ListDatabaseInsightsResponse apply(ListDatabaseInsightsRequest request) {
                        return client.listDatabaseInsights(request);
                    }
                },
                new com.google.common.base.Function<
                        ListDatabaseInsightsResponse,
                        java.util.List<com.oracle.bmc.opsi.model.DatabaseInsightSummary>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.opsi.model.DatabaseInsightSummary> apply(
                            ListDatabaseInsightsResponse response) {
                        return response.getDatabaseInsightsCollection().getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the listSqlPlans operation. This iterable
     * will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses received from the service.
     */
    public Iterable<ListSqlPlansResponse> listSqlPlansResponseIterator(
            final ListSqlPlansRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListSqlPlansRequest.Builder, ListSqlPlansRequest, ListSqlPlansResponse>(
                new com.google.common.base.Supplier<ListSqlPlansRequest.Builder>() {
                    @Override
                    public ListSqlPlansRequest.Builder get() {
                        return ListSqlPlansRequest.builder().copy(request);
                    }
                },
                new com.google.common.base.Function<ListSqlPlansResponse, String>() {
                    @Override
                    public String apply(ListSqlPlansResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new com.google.common.base.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListSqlPlansRequest.Builder>,
                        ListSqlPlansRequest>() {
                    @Override
                    public ListSqlPlansRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListSqlPlansRequest.Builder>
                                    input) {
                        if (input.getToken() == null) {
                            return input.getRequestBuilder().build();
                        } else {
                            return input.getRequestBuilder()
                                    .page(input.getToken().orNull())
                                    .build();
                        }
                    }
                },
                new com.google.common.base.Function<ListSqlPlansRequest, ListSqlPlansResponse>() {
                    @Override
                    public ListSqlPlansResponse apply(ListSqlPlansRequest request) {
                        return client.listSqlPlans(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link com.oracle.bmc.opsi.model.SqlPlanSummary} objects
     * contained in responses from the listSqlPlans operation. This iterable will fetch more data from the
     * server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link com.oracle.bmc.opsi.model.SqlPlanSummary} objects
     * contained in responses received from the service.
     */
    public Iterable<com.oracle.bmc.opsi.model.SqlPlanSummary> listSqlPlansRecordIterator(
            final ListSqlPlansRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListSqlPlansRequest.Builder, ListSqlPlansRequest, ListSqlPlansResponse,
                com.oracle.bmc.opsi.model.SqlPlanSummary>(
                new com.google.common.base.Supplier<ListSqlPlansRequest.Builder>() {
                    @Override
                    public ListSqlPlansRequest.Builder get() {
                        return ListSqlPlansRequest.builder().copy(request);
                    }
                },
                new com.google.common.base.Function<ListSqlPlansResponse, String>() {
                    @Override
                    public String apply(ListSqlPlansResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new com.google.common.base.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListSqlPlansRequest.Builder>,
                        ListSqlPlansRequest>() {
                    @Override
                    public ListSqlPlansRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListSqlPlansRequest.Builder>
                                    input) {
                        if (input.getToken() == null) {
                            return input.getRequestBuilder().build();
                        } else {
                            return input.getRequestBuilder()
                                    .page(input.getToken().orNull())
                                    .build();
                        }
                    }
                },
                new com.google.common.base.Function<ListSqlPlansRequest, ListSqlPlansResponse>() {
                    @Override
                    public ListSqlPlansResponse apply(ListSqlPlansRequest request) {
                        return client.listSqlPlans(request);
                    }
                },
                new com.google.common.base.Function<
                        ListSqlPlansResponse,
                        java.util.List<com.oracle.bmc.opsi.model.SqlPlanSummary>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.opsi.model.SqlPlanSummary> apply(
                            ListSqlPlansResponse response) {
                        return response.getSqlPlanCollection().getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the listSqlSearches operation. This iterable
     * will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses received from the service.
     */
    public Iterable<ListSqlSearchesResponse> listSqlSearchesResponseIterator(
            final ListSqlSearchesRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListSqlSearchesRequest.Builder, ListSqlSearchesRequest, ListSqlSearchesResponse>(
                new com.google.common.base.Supplier<ListSqlSearchesRequest.Builder>() {
                    @Override
                    public ListSqlSearchesRequest.Builder get() {
                        return ListSqlSearchesRequest.builder().copy(request);
                    }
                },
                new com.google.common.base.Function<ListSqlSearchesResponse, String>() {
                    @Override
                    public String apply(ListSqlSearchesResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new com.google.common.base.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListSqlSearchesRequest.Builder>,
                        ListSqlSearchesRequest>() {
                    @Override
                    public ListSqlSearchesRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListSqlSearchesRequest.Builder>
                                    input) {
                        if (input.getToken() == null) {
                            return input.getRequestBuilder().build();
                        } else {
                            return input.getRequestBuilder()
                                    .page(input.getToken().orNull())
                                    .build();
                        }
                    }
                },
                new com.google.common.base.Function<
                        ListSqlSearchesRequest, ListSqlSearchesResponse>() {
                    @Override
                    public ListSqlSearchesResponse apply(ListSqlSearchesRequest request) {
                        return client.listSqlSearches(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link com.oracle.bmc.opsi.model.SqlSearchSummary} objects
     * contained in responses from the listSqlSearches operation. This iterable will fetch more data from the
     * server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link com.oracle.bmc.opsi.model.SqlSearchSummary} objects
     * contained in responses received from the service.
     */
    public Iterable<com.oracle.bmc.opsi.model.SqlSearchSummary> listSqlSearchesRecordIterator(
            final ListSqlSearchesRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListSqlSearchesRequest.Builder, ListSqlSearchesRequest, ListSqlSearchesResponse,
                com.oracle.bmc.opsi.model.SqlSearchSummary>(
                new com.google.common.base.Supplier<ListSqlSearchesRequest.Builder>() {
                    @Override
                    public ListSqlSearchesRequest.Builder get() {
                        return ListSqlSearchesRequest.builder().copy(request);
                    }
                },
                new com.google.common.base.Function<ListSqlSearchesResponse, String>() {
                    @Override
                    public String apply(ListSqlSearchesResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new com.google.common.base.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListSqlSearchesRequest.Builder>,
                        ListSqlSearchesRequest>() {
                    @Override
                    public ListSqlSearchesRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListSqlSearchesRequest.Builder>
                                    input) {
                        if (input.getToken() == null) {
                            return input.getRequestBuilder().build();
                        } else {
                            return input.getRequestBuilder()
                                    .page(input.getToken().orNull())
                                    .build();
                        }
                    }
                },
                new com.google.common.base.Function<
                        ListSqlSearchesRequest, ListSqlSearchesResponse>() {
                    @Override
                    public ListSqlSearchesResponse apply(ListSqlSearchesRequest request) {
                        return client.listSqlSearches(request);
                    }
                },
                new com.google.common.base.Function<
                        ListSqlSearchesResponse,
                        java.util.List<com.oracle.bmc.opsi.model.SqlSearchSummary>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.opsi.model.SqlSearchSummary> apply(
                            ListSqlSearchesResponse response) {
                        return response.getSqlSearchCollection().getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the listSqlTexts operation. This iterable
     * will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses received from the service.
     */
    public Iterable<ListSqlTextsResponse> listSqlTextsResponseIterator(
            final ListSqlTextsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListSqlTextsRequest.Builder, ListSqlTextsRequest, ListSqlTextsResponse>(
                new com.google.common.base.Supplier<ListSqlTextsRequest.Builder>() {
                    @Override
                    public ListSqlTextsRequest.Builder get() {
                        return ListSqlTextsRequest.builder().copy(request);
                    }
                },
                new com.google.common.base.Function<ListSqlTextsResponse, String>() {
                    @Override
                    public String apply(ListSqlTextsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new com.google.common.base.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListSqlTextsRequest.Builder>,
                        ListSqlTextsRequest>() {
                    @Override
                    public ListSqlTextsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListSqlTextsRequest.Builder>
                                    input) {
                        if (input.getToken() == null) {
                            return input.getRequestBuilder().build();
                        } else {
                            return input.getRequestBuilder()
                                    .page(input.getToken().orNull())
                                    .build();
                        }
                    }
                },
                new com.google.common.base.Function<ListSqlTextsRequest, ListSqlTextsResponse>() {
                    @Override
                    public ListSqlTextsResponse apply(ListSqlTextsRequest request) {
                        return client.listSqlTexts(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link com.oracle.bmc.opsi.model.SqlTextSummary} objects
     * contained in responses from the listSqlTexts operation. This iterable will fetch more data from the
     * server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link com.oracle.bmc.opsi.model.SqlTextSummary} objects
     * contained in responses received from the service.
     */
    public Iterable<com.oracle.bmc.opsi.model.SqlTextSummary> listSqlTextsRecordIterator(
            final ListSqlTextsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListSqlTextsRequest.Builder, ListSqlTextsRequest, ListSqlTextsResponse,
                com.oracle.bmc.opsi.model.SqlTextSummary>(
                new com.google.common.base.Supplier<ListSqlTextsRequest.Builder>() {
                    @Override
                    public ListSqlTextsRequest.Builder get() {
                        return ListSqlTextsRequest.builder().copy(request);
                    }
                },
                new com.google.common.base.Function<ListSqlTextsResponse, String>() {
                    @Override
                    public String apply(ListSqlTextsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new com.google.common.base.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListSqlTextsRequest.Builder>,
                        ListSqlTextsRequest>() {
                    @Override
                    public ListSqlTextsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListSqlTextsRequest.Builder>
                                    input) {
                        if (input.getToken() == null) {
                            return input.getRequestBuilder().build();
                        } else {
                            return input.getRequestBuilder()
                                    .page(input.getToken().orNull())
                                    .build();
                        }
                    }
                },
                new com.google.common.base.Function<ListSqlTextsRequest, ListSqlTextsResponse>() {
                    @Override
                    public ListSqlTextsResponse apply(ListSqlTextsRequest request) {
                        return client.listSqlTexts(request);
                    }
                },
                new com.google.common.base.Function<
                        ListSqlTextsResponse,
                        java.util.List<com.oracle.bmc.opsi.model.SqlTextSummary>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.opsi.model.SqlTextSummary> apply(
                            ListSqlTextsResponse response) {
                        return response.getSqlTextCollection().getItems();
                    }
                });
    }
}

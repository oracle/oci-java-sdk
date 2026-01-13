/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.databasemanagement;

import com.oracle.bmc.databasemanagement.requests.*;
import com.oracle.bmc.databasemanagement.responses.*;

/**
 * Collection of helper methods that can be used to provide an {@link java.lang.Iterable} interface
 * to any list operations of SqlTuning where multiple pages of data may be fetched. Two styles of
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
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20201101")
public class SqlTuningPaginators {
    private final SqlTuning client;

    public SqlTuningPaginators(SqlTuning client) {
        this.client = client;
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the
     * listSqlTuningAdvisorTaskFindings operation. This iterable will fetch more data from the
     * server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses
     *     received from the service.
     */
    public Iterable<ListSqlTuningAdvisorTaskFindingsResponse>
            listSqlTuningAdvisorTaskFindingsResponseIterator(
                    final ListSqlTuningAdvisorTaskFindingsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListSqlTuningAdvisorTaskFindingsRequest.Builder,
                ListSqlTuningAdvisorTaskFindingsRequest,
                ListSqlTuningAdvisorTaskFindingsResponse>(
                new java.util.function.Supplier<ListSqlTuningAdvisorTaskFindingsRequest.Builder>() {
                    @Override
                    public ListSqlTuningAdvisorTaskFindingsRequest.Builder get() {
                        return ListSqlTuningAdvisorTaskFindingsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<
                        ListSqlTuningAdvisorTaskFindingsResponse, String>() {
                    @Override
                    public String apply(ListSqlTuningAdvisorTaskFindingsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListSqlTuningAdvisorTaskFindingsRequest.Builder>,
                        ListSqlTuningAdvisorTaskFindingsRequest>() {
                    @Override
                    public ListSqlTuningAdvisorTaskFindingsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListSqlTuningAdvisorTaskFindingsRequest.Builder>
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
                        ListSqlTuningAdvisorTaskFindingsRequest,
                        ListSqlTuningAdvisorTaskFindingsResponse>() {
                    @Override
                    public ListSqlTuningAdvisorTaskFindingsResponse apply(
                            ListSqlTuningAdvisorTaskFindingsRequest request) {
                        return client.listSqlTuningAdvisorTaskFindings(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link
     * com.oracle.bmc.databasemanagement.model.SqlTuningAdvisorTaskFindingSummary} objects contained
     * in responses from the listSqlTuningAdvisorTaskFindings operation. This iterable will fetch
     * more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link
     *     com.oracle.bmc.databasemanagement.model.SqlTuningAdvisorTaskFindingSummary} objects
     *     contained in responses received from the service.
     */
    public Iterable<com.oracle.bmc.databasemanagement.model.SqlTuningAdvisorTaskFindingSummary>
            listSqlTuningAdvisorTaskFindingsRecordIterator(
                    final ListSqlTuningAdvisorTaskFindingsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListSqlTuningAdvisorTaskFindingsRequest.Builder,
                ListSqlTuningAdvisorTaskFindingsRequest,
                ListSqlTuningAdvisorTaskFindingsResponse,
                com.oracle.bmc.databasemanagement.model.SqlTuningAdvisorTaskFindingSummary>(
                new java.util.function.Supplier<ListSqlTuningAdvisorTaskFindingsRequest.Builder>() {
                    @Override
                    public ListSqlTuningAdvisorTaskFindingsRequest.Builder get() {
                        return ListSqlTuningAdvisorTaskFindingsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<
                        ListSqlTuningAdvisorTaskFindingsResponse, String>() {
                    @Override
                    public String apply(ListSqlTuningAdvisorTaskFindingsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListSqlTuningAdvisorTaskFindingsRequest.Builder>,
                        ListSqlTuningAdvisorTaskFindingsRequest>() {
                    @Override
                    public ListSqlTuningAdvisorTaskFindingsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListSqlTuningAdvisorTaskFindingsRequest.Builder>
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
                        ListSqlTuningAdvisorTaskFindingsRequest,
                        ListSqlTuningAdvisorTaskFindingsResponse>() {
                    @Override
                    public ListSqlTuningAdvisorTaskFindingsResponse apply(
                            ListSqlTuningAdvisorTaskFindingsRequest request) {
                        return client.listSqlTuningAdvisorTaskFindings(request);
                    }
                },
                new java.util.function.Function<
                        ListSqlTuningAdvisorTaskFindingsResponse,
                        java.util.List<
                                com.oracle.bmc.databasemanagement.model
                                        .SqlTuningAdvisorTaskFindingSummary>>() {
                    @Override
                    public java.util.List<
                                    com.oracle.bmc.databasemanagement.model
                                            .SqlTuningAdvisorTaskFindingSummary>
                            apply(ListSqlTuningAdvisorTaskFindingsResponse response) {
                        return response.getSqlTuningAdvisorTaskFindingCollection().getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the
     * listSqlTuningAdvisorTaskRecommendations operation. This iterable will fetch more data from
     * the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses
     *     received from the service.
     */
    public Iterable<ListSqlTuningAdvisorTaskRecommendationsResponse>
            listSqlTuningAdvisorTaskRecommendationsResponseIterator(
                    final ListSqlTuningAdvisorTaskRecommendationsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListSqlTuningAdvisorTaskRecommendationsRequest.Builder,
                ListSqlTuningAdvisorTaskRecommendationsRequest,
                ListSqlTuningAdvisorTaskRecommendationsResponse>(
                new java.util.function.Supplier<
                        ListSqlTuningAdvisorTaskRecommendationsRequest.Builder>() {
                    @Override
                    public ListSqlTuningAdvisorTaskRecommendationsRequest.Builder get() {
                        return ListSqlTuningAdvisorTaskRecommendationsRequest.builder()
                                .copy(request);
                    }
                },
                new java.util.function.Function<
                        ListSqlTuningAdvisorTaskRecommendationsResponse, String>() {
                    @Override
                    public String apply(ListSqlTuningAdvisorTaskRecommendationsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListSqlTuningAdvisorTaskRecommendationsRequest.Builder>,
                        ListSqlTuningAdvisorTaskRecommendationsRequest>() {
                    @Override
                    public ListSqlTuningAdvisorTaskRecommendationsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListSqlTuningAdvisorTaskRecommendationsRequest.Builder>
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
                        ListSqlTuningAdvisorTaskRecommendationsRequest,
                        ListSqlTuningAdvisorTaskRecommendationsResponse>() {
                    @Override
                    public ListSqlTuningAdvisorTaskRecommendationsResponse apply(
                            ListSqlTuningAdvisorTaskRecommendationsRequest request) {
                        return client.listSqlTuningAdvisorTaskRecommendations(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link
     * com.oracle.bmc.databasemanagement.model.SqlTuningAdvisorTaskRecommendationSummary} objects
     * contained in responses from the listSqlTuningAdvisorTaskRecommendations operation. This
     * iterable will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link
     *     com.oracle.bmc.databasemanagement.model.SqlTuningAdvisorTaskRecommendationSummary}
     *     objects contained in responses received from the service.
     */
    public Iterable<
                    com.oracle.bmc.databasemanagement.model
                            .SqlTuningAdvisorTaskRecommendationSummary>
            listSqlTuningAdvisorTaskRecommendationsRecordIterator(
                    final ListSqlTuningAdvisorTaskRecommendationsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListSqlTuningAdvisorTaskRecommendationsRequest.Builder,
                ListSqlTuningAdvisorTaskRecommendationsRequest,
                ListSqlTuningAdvisorTaskRecommendationsResponse,
                com.oracle.bmc.databasemanagement.model.SqlTuningAdvisorTaskRecommendationSummary>(
                new java.util.function.Supplier<
                        ListSqlTuningAdvisorTaskRecommendationsRequest.Builder>() {
                    @Override
                    public ListSqlTuningAdvisorTaskRecommendationsRequest.Builder get() {
                        return ListSqlTuningAdvisorTaskRecommendationsRequest.builder()
                                .copy(request);
                    }
                },
                new java.util.function.Function<
                        ListSqlTuningAdvisorTaskRecommendationsResponse, String>() {
                    @Override
                    public String apply(ListSqlTuningAdvisorTaskRecommendationsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListSqlTuningAdvisorTaskRecommendationsRequest.Builder>,
                        ListSqlTuningAdvisorTaskRecommendationsRequest>() {
                    @Override
                    public ListSqlTuningAdvisorTaskRecommendationsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListSqlTuningAdvisorTaskRecommendationsRequest.Builder>
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
                        ListSqlTuningAdvisorTaskRecommendationsRequest,
                        ListSqlTuningAdvisorTaskRecommendationsResponse>() {
                    @Override
                    public ListSqlTuningAdvisorTaskRecommendationsResponse apply(
                            ListSqlTuningAdvisorTaskRecommendationsRequest request) {
                        return client.listSqlTuningAdvisorTaskRecommendations(request);
                    }
                },
                new java.util.function.Function<
                        ListSqlTuningAdvisorTaskRecommendationsResponse,
                        java.util.List<
                                com.oracle.bmc.databasemanagement.model
                                        .SqlTuningAdvisorTaskRecommendationSummary>>() {
                    @Override
                    public java.util.List<
                                    com.oracle.bmc.databasemanagement.model
                                            .SqlTuningAdvisorTaskRecommendationSummary>
                            apply(ListSqlTuningAdvisorTaskRecommendationsResponse response) {
                        return response.getSqlTuningAdvisorTaskRecommendationCollection()
                                .getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the
     * listSqlTuningAdvisorTasks operation. This iterable will fetch more data from the server as
     * needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses
     *     received from the service.
     */
    public Iterable<ListSqlTuningAdvisorTasksResponse> listSqlTuningAdvisorTasksResponseIterator(
            final ListSqlTuningAdvisorTasksRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListSqlTuningAdvisorTasksRequest.Builder,
                ListSqlTuningAdvisorTasksRequest,
                ListSqlTuningAdvisorTasksResponse>(
                new java.util.function.Supplier<ListSqlTuningAdvisorTasksRequest.Builder>() {
                    @Override
                    public ListSqlTuningAdvisorTasksRequest.Builder get() {
                        return ListSqlTuningAdvisorTasksRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListSqlTuningAdvisorTasksResponse, String>() {
                    @Override
                    public String apply(ListSqlTuningAdvisorTasksResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListSqlTuningAdvisorTasksRequest.Builder>,
                        ListSqlTuningAdvisorTasksRequest>() {
                    @Override
                    public ListSqlTuningAdvisorTasksRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListSqlTuningAdvisorTasksRequest.Builder>
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
                        ListSqlTuningAdvisorTasksRequest, ListSqlTuningAdvisorTasksResponse>() {
                    @Override
                    public ListSqlTuningAdvisorTasksResponse apply(
                            ListSqlTuningAdvisorTasksRequest request) {
                        return client.listSqlTuningAdvisorTasks(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link
     * com.oracle.bmc.databasemanagement.model.SqlTuningAdvisorTaskSummary} objects contained in
     * responses from the listSqlTuningAdvisorTasks operation. This iterable will fetch more data
     * from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link
     *     com.oracle.bmc.databasemanagement.model.SqlTuningAdvisorTaskSummary} objects contained in
     *     responses received from the service.
     */
    public Iterable<com.oracle.bmc.databasemanagement.model.SqlTuningAdvisorTaskSummary>
            listSqlTuningAdvisorTasksRecordIterator(
                    final ListSqlTuningAdvisorTasksRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListSqlTuningAdvisorTasksRequest.Builder,
                ListSqlTuningAdvisorTasksRequest,
                ListSqlTuningAdvisorTasksResponse,
                com.oracle.bmc.databasemanagement.model.SqlTuningAdvisorTaskSummary>(
                new java.util.function.Supplier<ListSqlTuningAdvisorTasksRequest.Builder>() {
                    @Override
                    public ListSqlTuningAdvisorTasksRequest.Builder get() {
                        return ListSqlTuningAdvisorTasksRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListSqlTuningAdvisorTasksResponse, String>() {
                    @Override
                    public String apply(ListSqlTuningAdvisorTasksResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListSqlTuningAdvisorTasksRequest.Builder>,
                        ListSqlTuningAdvisorTasksRequest>() {
                    @Override
                    public ListSqlTuningAdvisorTasksRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListSqlTuningAdvisorTasksRequest.Builder>
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
                        ListSqlTuningAdvisorTasksRequest, ListSqlTuningAdvisorTasksResponse>() {
                    @Override
                    public ListSqlTuningAdvisorTasksResponse apply(
                            ListSqlTuningAdvisorTasksRequest request) {
                        return client.listSqlTuningAdvisorTasks(request);
                    }
                },
                new java.util.function.Function<
                        ListSqlTuningAdvisorTasksResponse,
                        java.util.List<
                                com.oracle.bmc.databasemanagement.model
                                        .SqlTuningAdvisorTaskSummary>>() {
                    @Override
                    public java.util.List<
                                    com.oracle.bmc.databasemanagement.model
                                            .SqlTuningAdvisorTaskSummary>
                            apply(ListSqlTuningAdvisorTasksResponse response) {
                        return response.getSqlTuningAdvisorTaskCollection().getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the
     * listSqlTuningSets operation. This iterable will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses
     *     received from the service.
     */
    public Iterable<ListSqlTuningSetsResponse> listSqlTuningSetsResponseIterator(
            final ListSqlTuningSetsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListSqlTuningSetsRequest.Builder,
                ListSqlTuningSetsRequest,
                ListSqlTuningSetsResponse>(
                new java.util.function.Supplier<ListSqlTuningSetsRequest.Builder>() {
                    @Override
                    public ListSqlTuningSetsRequest.Builder get() {
                        return ListSqlTuningSetsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListSqlTuningSetsResponse, String>() {
                    @Override
                    public String apply(ListSqlTuningSetsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListSqlTuningSetsRequest.Builder>,
                        ListSqlTuningSetsRequest>() {
                    @Override
                    public ListSqlTuningSetsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListSqlTuningSetsRequest.Builder>
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
                        ListSqlTuningSetsRequest, ListSqlTuningSetsResponse>() {
                    @Override
                    public ListSqlTuningSetsResponse apply(ListSqlTuningSetsRequest request) {
                        return client.listSqlTuningSets(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link
     * com.oracle.bmc.databasemanagement.model.SqlTuningSetSummary} objects contained in responses
     * from the listSqlTuningSets operation. This iterable will fetch more data from the server as
     * needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link
     *     com.oracle.bmc.databasemanagement.model.SqlTuningSetSummary} objects contained in
     *     responses received from the service.
     */
    public Iterable<com.oracle.bmc.databasemanagement.model.SqlTuningSetSummary>
            listSqlTuningSetsRecordIterator(final ListSqlTuningSetsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListSqlTuningSetsRequest.Builder,
                ListSqlTuningSetsRequest,
                ListSqlTuningSetsResponse,
                com.oracle.bmc.databasemanagement.model.SqlTuningSetSummary>(
                new java.util.function.Supplier<ListSqlTuningSetsRequest.Builder>() {
                    @Override
                    public ListSqlTuningSetsRequest.Builder get() {
                        return ListSqlTuningSetsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListSqlTuningSetsResponse, String>() {
                    @Override
                    public String apply(ListSqlTuningSetsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListSqlTuningSetsRequest.Builder>,
                        ListSqlTuningSetsRequest>() {
                    @Override
                    public ListSqlTuningSetsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListSqlTuningSetsRequest.Builder>
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
                        ListSqlTuningSetsRequest, ListSqlTuningSetsResponse>() {
                    @Override
                    public ListSqlTuningSetsResponse apply(ListSqlTuningSetsRequest request) {
                        return client.listSqlTuningSets(request);
                    }
                },
                new java.util.function.Function<
                        ListSqlTuningSetsResponse,
                        java.util.List<
                                com.oracle.bmc.databasemanagement.model.SqlTuningSetSummary>>() {
                    @Override
                    public java.util.List<
                                    com.oracle.bmc.databasemanagement.model.SqlTuningSetSummary>
                            apply(ListSqlTuningSetsResponse response) {
                        return response.getSqlTuningSetCollection().getItems();
                    }
                });
    }
}

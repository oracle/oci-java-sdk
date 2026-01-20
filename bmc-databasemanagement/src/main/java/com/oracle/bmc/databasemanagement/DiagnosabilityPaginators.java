/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.databasemanagement;

import com.oracle.bmc.databasemanagement.requests.*;
import com.oracle.bmc.databasemanagement.responses.*;

/**
 * Collection of helper methods that can be used to provide an {@link java.lang.Iterable} interface
 * to any list operations of Diagnosability where multiple pages of data may be fetched. Two styles
 * of iteration are supported:
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
public class DiagnosabilityPaginators {
    private final Diagnosability client;

    public DiagnosabilityPaginators(Diagnosability client) {
        this.client = client;
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the listAlertLogs
     * operation. This iterable will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses
     *     received from the service.
     */
    public Iterable<ListAlertLogsResponse> listAlertLogsResponseIterator(
            final ListAlertLogsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListAlertLogsRequest.Builder, ListAlertLogsRequest, ListAlertLogsResponse>(
                new java.util.function.Supplier<ListAlertLogsRequest.Builder>() {
                    @Override
                    public ListAlertLogsRequest.Builder get() {
                        return ListAlertLogsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListAlertLogsResponse, String>() {
                    @Override
                    public String apply(ListAlertLogsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListAlertLogsRequest.Builder>,
                        ListAlertLogsRequest>() {
                    @Override
                    public ListAlertLogsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListAlertLogsRequest.Builder>
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
                new java.util.function.Function<ListAlertLogsRequest, ListAlertLogsResponse>() {
                    @Override
                    public ListAlertLogsResponse apply(ListAlertLogsRequest request) {
                        return client.listAlertLogs(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link
     * com.oracle.bmc.databasemanagement.model.AlertLogSummary} objects contained in responses from
     * the listAlertLogs operation. This iterable will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link
     *     com.oracle.bmc.databasemanagement.model.AlertLogSummary} objects contained in responses
     *     received from the service.
     */
    public Iterable<com.oracle.bmc.databasemanagement.model.AlertLogSummary>
            listAlertLogsRecordIterator(final ListAlertLogsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListAlertLogsRequest.Builder,
                ListAlertLogsRequest,
                ListAlertLogsResponse,
                com.oracle.bmc.databasemanagement.model.AlertLogSummary>(
                new java.util.function.Supplier<ListAlertLogsRequest.Builder>() {
                    @Override
                    public ListAlertLogsRequest.Builder get() {
                        return ListAlertLogsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListAlertLogsResponse, String>() {
                    @Override
                    public String apply(ListAlertLogsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListAlertLogsRequest.Builder>,
                        ListAlertLogsRequest>() {
                    @Override
                    public ListAlertLogsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListAlertLogsRequest.Builder>
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
                new java.util.function.Function<ListAlertLogsRequest, ListAlertLogsResponse>() {
                    @Override
                    public ListAlertLogsResponse apply(ListAlertLogsRequest request) {
                        return client.listAlertLogs(request);
                    }
                },
                new java.util.function.Function<
                        ListAlertLogsResponse,
                        java.util.List<com.oracle.bmc.databasemanagement.model.AlertLogSummary>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.databasemanagement.model.AlertLogSummary>
                            apply(ListAlertLogsResponse response) {
                        return response.getAlertLogCollection().getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the
     * listAttentionLogs operation. This iterable will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses
     *     received from the service.
     */
    public Iterable<ListAttentionLogsResponse> listAttentionLogsResponseIterator(
            final ListAttentionLogsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListAttentionLogsRequest.Builder,
                ListAttentionLogsRequest,
                ListAttentionLogsResponse>(
                new java.util.function.Supplier<ListAttentionLogsRequest.Builder>() {
                    @Override
                    public ListAttentionLogsRequest.Builder get() {
                        return ListAttentionLogsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListAttentionLogsResponse, String>() {
                    @Override
                    public String apply(ListAttentionLogsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListAttentionLogsRequest.Builder>,
                        ListAttentionLogsRequest>() {
                    @Override
                    public ListAttentionLogsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListAttentionLogsRequest.Builder>
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
                        ListAttentionLogsRequest, ListAttentionLogsResponse>() {
                    @Override
                    public ListAttentionLogsResponse apply(ListAttentionLogsRequest request) {
                        return client.listAttentionLogs(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link
     * com.oracle.bmc.databasemanagement.model.AttentionLogSummary} objects contained in responses
     * from the listAttentionLogs operation. This iterable will fetch more data from the server as
     * needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link
     *     com.oracle.bmc.databasemanagement.model.AttentionLogSummary} objects contained in
     *     responses received from the service.
     */
    public Iterable<com.oracle.bmc.databasemanagement.model.AttentionLogSummary>
            listAttentionLogsRecordIterator(final ListAttentionLogsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListAttentionLogsRequest.Builder,
                ListAttentionLogsRequest,
                ListAttentionLogsResponse,
                com.oracle.bmc.databasemanagement.model.AttentionLogSummary>(
                new java.util.function.Supplier<ListAttentionLogsRequest.Builder>() {
                    @Override
                    public ListAttentionLogsRequest.Builder get() {
                        return ListAttentionLogsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListAttentionLogsResponse, String>() {
                    @Override
                    public String apply(ListAttentionLogsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListAttentionLogsRequest.Builder>,
                        ListAttentionLogsRequest>() {
                    @Override
                    public ListAttentionLogsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListAttentionLogsRequest.Builder>
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
                        ListAttentionLogsRequest, ListAttentionLogsResponse>() {
                    @Override
                    public ListAttentionLogsResponse apply(ListAttentionLogsRequest request) {
                        return client.listAttentionLogs(request);
                    }
                },
                new java.util.function.Function<
                        ListAttentionLogsResponse,
                        java.util.List<
                                com.oracle.bmc.databasemanagement.model.AttentionLogSummary>>() {
                    @Override
                    public java.util.List<
                                    com.oracle.bmc.databasemanagement.model.AttentionLogSummary>
                            apply(ListAttentionLogsResponse response) {
                        return response.getAttentionLogCollection().getItems();
                    }
                });
    }
}

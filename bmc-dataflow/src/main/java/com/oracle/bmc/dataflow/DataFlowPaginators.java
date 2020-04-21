/**
 * Copyright (c) 2016, 2020, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.dataflow;

import com.oracle.bmc.dataflow.requests.*;
import com.oracle.bmc.dataflow.responses.*;

/**
 * Collection of helper methods that can be used to provide an {@link java.lang.Iterable} interface
 * to any list operations of DataFlow where multiple pages of data may be fetched.
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
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200129")
@lombok.RequiredArgsConstructor
public class DataFlowPaginators {
    private final DataFlow client;

    /**
     * Creates a new iterable which will iterate over the responses received from the listApplications operation. This iterable
     * will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses received from the service.
     */
    public Iterable<ListApplicationsResponse> listApplicationsResponseIterator(
            final ListApplicationsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListApplicationsRequest.Builder, ListApplicationsRequest, ListApplicationsResponse>(
                new com.google.common.base.Supplier<ListApplicationsRequest.Builder>() {
                    @Override
                    public ListApplicationsRequest.Builder get() {
                        return ListApplicationsRequest.builder().copy(request);
                    }
                },
                new com.google.common.base.Function<ListApplicationsResponse, String>() {
                    @Override
                    public String apply(ListApplicationsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new com.google.common.base.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListApplicationsRequest.Builder>,
                        ListApplicationsRequest>() {
                    @Override
                    public ListApplicationsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListApplicationsRequest.Builder>
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
                        ListApplicationsRequest, ListApplicationsResponse>() {
                    @Override
                    public ListApplicationsResponse apply(ListApplicationsRequest request) {
                        return client.listApplications(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link com.oracle.bmc.dataflow.model.ApplicationSummary} objects
     * contained in responses from the listApplications operation. This iterable will fetch more data from the
     * server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link com.oracle.bmc.dataflow.model.ApplicationSummary} objects
     * contained in responses received from the service.
     */
    public Iterable<com.oracle.bmc.dataflow.model.ApplicationSummary>
            listApplicationsRecordIterator(final ListApplicationsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListApplicationsRequest.Builder, ListApplicationsRequest, ListApplicationsResponse,
                com.oracle.bmc.dataflow.model.ApplicationSummary>(
                new com.google.common.base.Supplier<ListApplicationsRequest.Builder>() {
                    @Override
                    public ListApplicationsRequest.Builder get() {
                        return ListApplicationsRequest.builder().copy(request);
                    }
                },
                new com.google.common.base.Function<ListApplicationsResponse, String>() {
                    @Override
                    public String apply(ListApplicationsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new com.google.common.base.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListApplicationsRequest.Builder>,
                        ListApplicationsRequest>() {
                    @Override
                    public ListApplicationsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListApplicationsRequest.Builder>
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
                        ListApplicationsRequest, ListApplicationsResponse>() {
                    @Override
                    public ListApplicationsResponse apply(ListApplicationsRequest request) {
                        return client.listApplications(request);
                    }
                },
                new com.google.common.base.Function<
                        ListApplicationsResponse,
                        java.util.List<com.oracle.bmc.dataflow.model.ApplicationSummary>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.dataflow.model.ApplicationSummary> apply(
                            ListApplicationsResponse response) {
                        return response.getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the listRunLogs operation. This iterable
     * will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses received from the service.
     */
    public Iterable<ListRunLogsResponse> listRunLogsResponseIterator(
            final ListRunLogsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListRunLogsRequest.Builder, ListRunLogsRequest, ListRunLogsResponse>(
                new com.google.common.base.Supplier<ListRunLogsRequest.Builder>() {
                    @Override
                    public ListRunLogsRequest.Builder get() {
                        return ListRunLogsRequest.builder().copy(request);
                    }
                },
                new com.google.common.base.Function<ListRunLogsResponse, String>() {
                    @Override
                    public String apply(ListRunLogsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new com.google.common.base.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListRunLogsRequest.Builder>,
                        ListRunLogsRequest>() {
                    @Override
                    public ListRunLogsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListRunLogsRequest.Builder>
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
                new com.google.common.base.Function<ListRunLogsRequest, ListRunLogsResponse>() {
                    @Override
                    public ListRunLogsResponse apply(ListRunLogsRequest request) {
                        return client.listRunLogs(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link com.oracle.bmc.dataflow.model.RunLogSummary} objects
     * contained in responses from the listRunLogs operation. This iterable will fetch more data from the
     * server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link com.oracle.bmc.dataflow.model.RunLogSummary} objects
     * contained in responses received from the service.
     */
    public Iterable<com.oracle.bmc.dataflow.model.RunLogSummary> listRunLogsRecordIterator(
            final ListRunLogsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListRunLogsRequest.Builder, ListRunLogsRequest, ListRunLogsResponse,
                com.oracle.bmc.dataflow.model.RunLogSummary>(
                new com.google.common.base.Supplier<ListRunLogsRequest.Builder>() {
                    @Override
                    public ListRunLogsRequest.Builder get() {
                        return ListRunLogsRequest.builder().copy(request);
                    }
                },
                new com.google.common.base.Function<ListRunLogsResponse, String>() {
                    @Override
                    public String apply(ListRunLogsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new com.google.common.base.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListRunLogsRequest.Builder>,
                        ListRunLogsRequest>() {
                    @Override
                    public ListRunLogsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListRunLogsRequest.Builder>
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
                new com.google.common.base.Function<ListRunLogsRequest, ListRunLogsResponse>() {
                    @Override
                    public ListRunLogsResponse apply(ListRunLogsRequest request) {
                        return client.listRunLogs(request);
                    }
                },
                new com.google.common.base.Function<
                        ListRunLogsResponse,
                        java.util.List<com.oracle.bmc.dataflow.model.RunLogSummary>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.dataflow.model.RunLogSummary> apply(
                            ListRunLogsResponse response) {
                        return response.getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the listRuns operation. This iterable
     * will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses received from the service.
     */
    public Iterable<ListRunsResponse> listRunsResponseIterator(final ListRunsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListRunsRequest.Builder, ListRunsRequest, ListRunsResponse>(
                new com.google.common.base.Supplier<ListRunsRequest.Builder>() {
                    @Override
                    public ListRunsRequest.Builder get() {
                        return ListRunsRequest.builder().copy(request);
                    }
                },
                new com.google.common.base.Function<ListRunsResponse, String>() {
                    @Override
                    public String apply(ListRunsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new com.google.common.base.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListRunsRequest.Builder>,
                        ListRunsRequest>() {
                    @Override
                    public ListRunsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListRunsRequest.Builder>
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
                new com.google.common.base.Function<ListRunsRequest, ListRunsResponse>() {
                    @Override
                    public ListRunsResponse apply(ListRunsRequest request) {
                        return client.listRuns(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link com.oracle.bmc.dataflow.model.RunSummary} objects
     * contained in responses from the listRuns operation. This iterable will fetch more data from the
     * server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link com.oracle.bmc.dataflow.model.RunSummary} objects
     * contained in responses received from the service.
     */
    public Iterable<com.oracle.bmc.dataflow.model.RunSummary> listRunsRecordIterator(
            final ListRunsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListRunsRequest.Builder, ListRunsRequest, ListRunsResponse,
                com.oracle.bmc.dataflow.model.RunSummary>(
                new com.google.common.base.Supplier<ListRunsRequest.Builder>() {
                    @Override
                    public ListRunsRequest.Builder get() {
                        return ListRunsRequest.builder().copy(request);
                    }
                },
                new com.google.common.base.Function<ListRunsResponse, String>() {
                    @Override
                    public String apply(ListRunsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new com.google.common.base.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListRunsRequest.Builder>,
                        ListRunsRequest>() {
                    @Override
                    public ListRunsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListRunsRequest.Builder>
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
                new com.google.common.base.Function<ListRunsRequest, ListRunsResponse>() {
                    @Override
                    public ListRunsResponse apply(ListRunsRequest request) {
                        return client.listRuns(request);
                    }
                },
                new com.google.common.base.Function<
                        ListRunsResponse,
                        java.util.List<com.oracle.bmc.dataflow.model.RunSummary>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.dataflow.model.RunSummary> apply(
                            ListRunsResponse response) {
                        return response.getItems();
                    }
                });
    }
}

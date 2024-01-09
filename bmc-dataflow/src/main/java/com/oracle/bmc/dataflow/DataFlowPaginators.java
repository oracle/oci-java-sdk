/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.dataflow;

import com.oracle.bmc.dataflow.requests.*;
import com.oracle.bmc.dataflow.responses.*;

/**
 * Collection of helper methods that can be used to provide an {@link java.lang.Iterable} interface
 * to any list operations of DataFlow where multiple pages of data may be fetched. Two styles of
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
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200129")
public class DataFlowPaginators {
    private final DataFlow client;

    public DataFlowPaginators(DataFlow client) {
        this.client = client;
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the
     * listApplications operation. This iterable will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses
     *     received from the service.
     */
    public Iterable<ListApplicationsResponse> listApplicationsResponseIterator(
            final ListApplicationsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListApplicationsRequest.Builder, ListApplicationsRequest, ListApplicationsResponse>(
                new java.util.function.Supplier<ListApplicationsRequest.Builder>() {
                    @Override
                    public ListApplicationsRequest.Builder get() {
                        return ListApplicationsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListApplicationsResponse, String>() {
                    @Override
                    public String apply(ListApplicationsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListApplicationsRequest.Builder>,
                        ListApplicationsRequest>() {
                    @Override
                    public ListApplicationsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListApplicationsRequest.Builder>
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
                        ListApplicationsRequest, ListApplicationsResponse>() {
                    @Override
                    public ListApplicationsResponse apply(ListApplicationsRequest request) {
                        return client.listApplications(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link
     * com.oracle.bmc.dataflow.model.ApplicationSummary} objects contained in responses from the
     * listApplications operation. This iterable will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link
     *     com.oracle.bmc.dataflow.model.ApplicationSummary} objects contained in responses received
     *     from the service.
     */
    public Iterable<com.oracle.bmc.dataflow.model.ApplicationSummary>
            listApplicationsRecordIterator(final ListApplicationsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListApplicationsRequest.Builder,
                ListApplicationsRequest,
                ListApplicationsResponse,
                com.oracle.bmc.dataflow.model.ApplicationSummary>(
                new java.util.function.Supplier<ListApplicationsRequest.Builder>() {
                    @Override
                    public ListApplicationsRequest.Builder get() {
                        return ListApplicationsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListApplicationsResponse, String>() {
                    @Override
                    public String apply(ListApplicationsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListApplicationsRequest.Builder>,
                        ListApplicationsRequest>() {
                    @Override
                    public ListApplicationsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListApplicationsRequest.Builder>
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
                        ListApplicationsRequest, ListApplicationsResponse>() {
                    @Override
                    public ListApplicationsResponse apply(ListApplicationsRequest request) {
                        return client.listApplications(request);
                    }
                },
                new java.util.function.Function<
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
     * Creates a new iterable which will iterate over the responses received from the listPools
     * operation. This iterable will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses
     *     received from the service.
     */
    public Iterable<ListPoolsResponse> listPoolsResponseIterator(final ListPoolsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListPoolsRequest.Builder, ListPoolsRequest, ListPoolsResponse>(
                new java.util.function.Supplier<ListPoolsRequest.Builder>() {
                    @Override
                    public ListPoolsRequest.Builder get() {
                        return ListPoolsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListPoolsResponse, String>() {
                    @Override
                    public String apply(ListPoolsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListPoolsRequest.Builder>,
                        ListPoolsRequest>() {
                    @Override
                    public ListPoolsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListPoolsRequest.Builder>
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
                new java.util.function.Function<ListPoolsRequest, ListPoolsResponse>() {
                    @Override
                    public ListPoolsResponse apply(ListPoolsRequest request) {
                        return client.listPools(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link
     * com.oracle.bmc.dataflow.model.PoolSummary} objects contained in responses from the listPools
     * operation. This iterable will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link
     *     com.oracle.bmc.dataflow.model.PoolSummary} objects contained in responses received from
     *     the service.
     */
    public Iterable<com.oracle.bmc.dataflow.model.PoolSummary> listPoolsRecordIterator(
            final ListPoolsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListPoolsRequest.Builder,
                ListPoolsRequest,
                ListPoolsResponse,
                com.oracle.bmc.dataflow.model.PoolSummary>(
                new java.util.function.Supplier<ListPoolsRequest.Builder>() {
                    @Override
                    public ListPoolsRequest.Builder get() {
                        return ListPoolsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListPoolsResponse, String>() {
                    @Override
                    public String apply(ListPoolsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListPoolsRequest.Builder>,
                        ListPoolsRequest>() {
                    @Override
                    public ListPoolsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListPoolsRequest.Builder>
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
                new java.util.function.Function<ListPoolsRequest, ListPoolsResponse>() {
                    @Override
                    public ListPoolsResponse apply(ListPoolsRequest request) {
                        return client.listPools(request);
                    }
                },
                new java.util.function.Function<
                        ListPoolsResponse,
                        java.util.List<com.oracle.bmc.dataflow.model.PoolSummary>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.dataflow.model.PoolSummary> apply(
                            ListPoolsResponse response) {
                        return response.getPoolCollection().getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the
     * listPrivateEndpoints operation. This iterable will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses
     *     received from the service.
     */
    public Iterable<ListPrivateEndpointsResponse> listPrivateEndpointsResponseIterator(
            final ListPrivateEndpointsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListPrivateEndpointsRequest.Builder,
                ListPrivateEndpointsRequest,
                ListPrivateEndpointsResponse>(
                new java.util.function.Supplier<ListPrivateEndpointsRequest.Builder>() {
                    @Override
                    public ListPrivateEndpointsRequest.Builder get() {
                        return ListPrivateEndpointsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListPrivateEndpointsResponse, String>() {
                    @Override
                    public String apply(ListPrivateEndpointsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListPrivateEndpointsRequest.Builder>,
                        ListPrivateEndpointsRequest>() {
                    @Override
                    public ListPrivateEndpointsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListPrivateEndpointsRequest.Builder>
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
                        ListPrivateEndpointsRequest, ListPrivateEndpointsResponse>() {
                    @Override
                    public ListPrivateEndpointsResponse apply(ListPrivateEndpointsRequest request) {
                        return client.listPrivateEndpoints(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link
     * com.oracle.bmc.dataflow.model.PrivateEndpointSummary} objects contained in responses from the
     * listPrivateEndpoints operation. This iterable will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link
     *     com.oracle.bmc.dataflow.model.PrivateEndpointSummary} objects contained in responses
     *     received from the service.
     */
    public Iterable<com.oracle.bmc.dataflow.model.PrivateEndpointSummary>
            listPrivateEndpointsRecordIterator(final ListPrivateEndpointsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListPrivateEndpointsRequest.Builder,
                ListPrivateEndpointsRequest,
                ListPrivateEndpointsResponse,
                com.oracle.bmc.dataflow.model.PrivateEndpointSummary>(
                new java.util.function.Supplier<ListPrivateEndpointsRequest.Builder>() {
                    @Override
                    public ListPrivateEndpointsRequest.Builder get() {
                        return ListPrivateEndpointsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListPrivateEndpointsResponse, String>() {
                    @Override
                    public String apply(ListPrivateEndpointsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListPrivateEndpointsRequest.Builder>,
                        ListPrivateEndpointsRequest>() {
                    @Override
                    public ListPrivateEndpointsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListPrivateEndpointsRequest.Builder>
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
                        ListPrivateEndpointsRequest, ListPrivateEndpointsResponse>() {
                    @Override
                    public ListPrivateEndpointsResponse apply(ListPrivateEndpointsRequest request) {
                        return client.listPrivateEndpoints(request);
                    }
                },
                new java.util.function.Function<
                        ListPrivateEndpointsResponse,
                        java.util.List<com.oracle.bmc.dataflow.model.PrivateEndpointSummary>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.dataflow.model.PrivateEndpointSummary>
                            apply(ListPrivateEndpointsResponse response) {
                        return response.getPrivateEndpointCollection().getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the listRunLogs
     * operation. This iterable will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses
     *     received from the service.
     */
    public Iterable<ListRunLogsResponse> listRunLogsResponseIterator(
            final ListRunLogsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListRunLogsRequest.Builder, ListRunLogsRequest, ListRunLogsResponse>(
                new java.util.function.Supplier<ListRunLogsRequest.Builder>() {
                    @Override
                    public ListRunLogsRequest.Builder get() {
                        return ListRunLogsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListRunLogsResponse, String>() {
                    @Override
                    public String apply(ListRunLogsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListRunLogsRequest.Builder>,
                        ListRunLogsRequest>() {
                    @Override
                    public ListRunLogsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListRunLogsRequest.Builder>
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
                new java.util.function.Function<ListRunLogsRequest, ListRunLogsResponse>() {
                    @Override
                    public ListRunLogsResponse apply(ListRunLogsRequest request) {
                        return client.listRunLogs(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link
     * com.oracle.bmc.dataflow.model.RunLogSummary} objects contained in responses from the
     * listRunLogs operation. This iterable will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link
     *     com.oracle.bmc.dataflow.model.RunLogSummary} objects contained in responses received from
     *     the service.
     */
    public Iterable<com.oracle.bmc.dataflow.model.RunLogSummary> listRunLogsRecordIterator(
            final ListRunLogsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListRunLogsRequest.Builder,
                ListRunLogsRequest,
                ListRunLogsResponse,
                com.oracle.bmc.dataflow.model.RunLogSummary>(
                new java.util.function.Supplier<ListRunLogsRequest.Builder>() {
                    @Override
                    public ListRunLogsRequest.Builder get() {
                        return ListRunLogsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListRunLogsResponse, String>() {
                    @Override
                    public String apply(ListRunLogsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListRunLogsRequest.Builder>,
                        ListRunLogsRequest>() {
                    @Override
                    public ListRunLogsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListRunLogsRequest.Builder>
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
                new java.util.function.Function<ListRunLogsRequest, ListRunLogsResponse>() {
                    @Override
                    public ListRunLogsResponse apply(ListRunLogsRequest request) {
                        return client.listRunLogs(request);
                    }
                },
                new java.util.function.Function<
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
     * Creates a new iterable which will iterate over the responses received from the listRuns
     * operation. This iterable will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses
     *     received from the service.
     */
    public Iterable<ListRunsResponse> listRunsResponseIterator(final ListRunsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListRunsRequest.Builder, ListRunsRequest, ListRunsResponse>(
                new java.util.function.Supplier<ListRunsRequest.Builder>() {
                    @Override
                    public ListRunsRequest.Builder get() {
                        return ListRunsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListRunsResponse, String>() {
                    @Override
                    public String apply(ListRunsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListRunsRequest.Builder>,
                        ListRunsRequest>() {
                    @Override
                    public ListRunsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListRunsRequest.Builder>
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
                new java.util.function.Function<ListRunsRequest, ListRunsResponse>() {
                    @Override
                    public ListRunsResponse apply(ListRunsRequest request) {
                        return client.listRuns(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link
     * com.oracle.bmc.dataflow.model.RunSummary} objects contained in responses from the listRuns
     * operation. This iterable will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link
     *     com.oracle.bmc.dataflow.model.RunSummary} objects contained in responses received from
     *     the service.
     */
    public Iterable<com.oracle.bmc.dataflow.model.RunSummary> listRunsRecordIterator(
            final ListRunsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListRunsRequest.Builder,
                ListRunsRequest,
                ListRunsResponse,
                com.oracle.bmc.dataflow.model.RunSummary>(
                new java.util.function.Supplier<ListRunsRequest.Builder>() {
                    @Override
                    public ListRunsRequest.Builder get() {
                        return ListRunsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListRunsResponse, String>() {
                    @Override
                    public String apply(ListRunsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListRunsRequest.Builder>,
                        ListRunsRequest>() {
                    @Override
                    public ListRunsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListRunsRequest.Builder>
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
                new java.util.function.Function<ListRunsRequest, ListRunsResponse>() {
                    @Override
                    public ListRunsResponse apply(ListRunsRequest request) {
                        return client.listRuns(request);
                    }
                },
                new java.util.function.Function<
                        ListRunsResponse,
                        java.util.List<com.oracle.bmc.dataflow.model.RunSummary>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.dataflow.model.RunSummary> apply(
                            ListRunsResponse response) {
                        return response.getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the
     * listSqlEndpoints operation. This iterable will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses
     *     received from the service.
     */
    public Iterable<ListSqlEndpointsResponse> listSqlEndpointsResponseIterator(
            final ListSqlEndpointsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListSqlEndpointsRequest.Builder, ListSqlEndpointsRequest, ListSqlEndpointsResponse>(
                new java.util.function.Supplier<ListSqlEndpointsRequest.Builder>() {
                    @Override
                    public ListSqlEndpointsRequest.Builder get() {
                        return ListSqlEndpointsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListSqlEndpointsResponse, String>() {
                    @Override
                    public String apply(ListSqlEndpointsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListSqlEndpointsRequest.Builder>,
                        ListSqlEndpointsRequest>() {
                    @Override
                    public ListSqlEndpointsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListSqlEndpointsRequest.Builder>
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
                        ListSqlEndpointsRequest, ListSqlEndpointsResponse>() {
                    @Override
                    public ListSqlEndpointsResponse apply(ListSqlEndpointsRequest request) {
                        return client.listSqlEndpoints(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link
     * com.oracle.bmc.dataflow.model.SqlEndpointSummary} objects contained in responses from the
     * listSqlEndpoints operation. This iterable will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link
     *     com.oracle.bmc.dataflow.model.SqlEndpointSummary} objects contained in responses received
     *     from the service.
     */
    public Iterable<com.oracle.bmc.dataflow.model.SqlEndpointSummary>
            listSqlEndpointsRecordIterator(final ListSqlEndpointsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListSqlEndpointsRequest.Builder,
                ListSqlEndpointsRequest,
                ListSqlEndpointsResponse,
                com.oracle.bmc.dataflow.model.SqlEndpointSummary>(
                new java.util.function.Supplier<ListSqlEndpointsRequest.Builder>() {
                    @Override
                    public ListSqlEndpointsRequest.Builder get() {
                        return ListSqlEndpointsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListSqlEndpointsResponse, String>() {
                    @Override
                    public String apply(ListSqlEndpointsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListSqlEndpointsRequest.Builder>,
                        ListSqlEndpointsRequest>() {
                    @Override
                    public ListSqlEndpointsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListSqlEndpointsRequest.Builder>
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
                        ListSqlEndpointsRequest, ListSqlEndpointsResponse>() {
                    @Override
                    public ListSqlEndpointsResponse apply(ListSqlEndpointsRequest request) {
                        return client.listSqlEndpoints(request);
                    }
                },
                new java.util.function.Function<
                        ListSqlEndpointsResponse,
                        java.util.List<com.oracle.bmc.dataflow.model.SqlEndpointSummary>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.dataflow.model.SqlEndpointSummary> apply(
                            ListSqlEndpointsResponse response) {
                        return response.getSqlEndpointCollection().getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the listStatements
     * operation. This iterable will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses
     *     received from the service.
     */
    public Iterable<ListStatementsResponse> listStatementsResponseIterator(
            final ListStatementsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListStatementsRequest.Builder, ListStatementsRequest, ListStatementsResponse>(
                new java.util.function.Supplier<ListStatementsRequest.Builder>() {
                    @Override
                    public ListStatementsRequest.Builder get() {
                        return ListStatementsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListStatementsResponse, String>() {
                    @Override
                    public String apply(ListStatementsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListStatementsRequest.Builder>,
                        ListStatementsRequest>() {
                    @Override
                    public ListStatementsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListStatementsRequest.Builder>
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
                new java.util.function.Function<ListStatementsRequest, ListStatementsResponse>() {
                    @Override
                    public ListStatementsResponse apply(ListStatementsRequest request) {
                        return client.listStatements(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link
     * com.oracle.bmc.dataflow.model.StatementSummary} objects contained in responses from the
     * listStatements operation. This iterable will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link
     *     com.oracle.bmc.dataflow.model.StatementSummary} objects contained in responses received
     *     from the service.
     */
    public Iterable<com.oracle.bmc.dataflow.model.StatementSummary> listStatementsRecordIterator(
            final ListStatementsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListStatementsRequest.Builder,
                ListStatementsRequest,
                ListStatementsResponse,
                com.oracle.bmc.dataflow.model.StatementSummary>(
                new java.util.function.Supplier<ListStatementsRequest.Builder>() {
                    @Override
                    public ListStatementsRequest.Builder get() {
                        return ListStatementsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListStatementsResponse, String>() {
                    @Override
                    public String apply(ListStatementsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListStatementsRequest.Builder>,
                        ListStatementsRequest>() {
                    @Override
                    public ListStatementsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListStatementsRequest.Builder>
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
                new java.util.function.Function<ListStatementsRequest, ListStatementsResponse>() {
                    @Override
                    public ListStatementsResponse apply(ListStatementsRequest request) {
                        return client.listStatements(request);
                    }
                },
                new java.util.function.Function<
                        ListStatementsResponse,
                        java.util.List<com.oracle.bmc.dataflow.model.StatementSummary>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.dataflow.model.StatementSummary> apply(
                            ListStatementsResponse response) {
                        return response.getStatementCollection().getItems();
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
     * com.oracle.bmc.dataflow.model.WorkRequestError} objects contained in responses from the
     * listWorkRequestErrors operation. This iterable will fetch more data from the server as
     * needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link
     *     com.oracle.bmc.dataflow.model.WorkRequestError} objects contained in responses received
     *     from the service.
     */
    public Iterable<com.oracle.bmc.dataflow.model.WorkRequestError>
            listWorkRequestErrorsRecordIterator(final ListWorkRequestErrorsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListWorkRequestErrorsRequest.Builder,
                ListWorkRequestErrorsRequest,
                ListWorkRequestErrorsResponse,
                com.oracle.bmc.dataflow.model.WorkRequestError>(
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
                        java.util.List<com.oracle.bmc.dataflow.model.WorkRequestError>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.dataflow.model.WorkRequestError> apply(
                            ListWorkRequestErrorsResponse response) {
                        return response.getWorkRequestErrorCollection().getItems();
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
     * com.oracle.bmc.dataflow.model.WorkRequestLog} objects contained in responses from the
     * listWorkRequestLogs operation. This iterable will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link
     *     com.oracle.bmc.dataflow.model.WorkRequestLog} objects contained in responses received
     *     from the service.
     */
    public Iterable<com.oracle.bmc.dataflow.model.WorkRequestLog> listWorkRequestLogsRecordIterator(
            final ListWorkRequestLogsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListWorkRequestLogsRequest.Builder,
                ListWorkRequestLogsRequest,
                ListWorkRequestLogsResponse,
                com.oracle.bmc.dataflow.model.WorkRequestLog>(
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
                        java.util.List<com.oracle.bmc.dataflow.model.WorkRequestLog>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.dataflow.model.WorkRequestLog> apply(
                            ListWorkRequestLogsResponse response) {
                        return response.getWorkRequestLogCollection().getItems();
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
     * com.oracle.bmc.dataflow.model.WorkRequestSummary} objects contained in responses from the
     * listWorkRequests operation. This iterable will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link
     *     com.oracle.bmc.dataflow.model.WorkRequestSummary} objects contained in responses received
     *     from the service.
     */
    public Iterable<com.oracle.bmc.dataflow.model.WorkRequestSummary>
            listWorkRequestsRecordIterator(final ListWorkRequestsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListWorkRequestsRequest.Builder,
                ListWorkRequestsRequest,
                ListWorkRequestsResponse,
                com.oracle.bmc.dataflow.model.WorkRequestSummary>(
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
                        java.util.List<com.oracle.bmc.dataflow.model.WorkRequestSummary>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.dataflow.model.WorkRequestSummary> apply(
                            ListWorkRequestsResponse response) {
                        return response.getWorkRequestCollection().getItems();
                    }
                });
    }
}

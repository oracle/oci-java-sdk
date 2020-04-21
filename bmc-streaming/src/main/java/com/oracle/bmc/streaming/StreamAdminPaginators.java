/**
 * Copyright (c) 2016, 2020, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.streaming;

import com.oracle.bmc.streaming.requests.*;
import com.oracle.bmc.streaming.responses.*;

/**
 * Collection of helper methods that can be used to provide an {@link java.lang.Iterable} interface
 * to any list operations of StreamAdmin where multiple pages of data may be fetched.
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
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20180418")
@lombok.RequiredArgsConstructor
public class StreamAdminPaginators {
    private final StreamAdmin client;

    /**
     * Creates a new iterable which will iterate over the responses received from the listConnectHarnesses operation. This iterable
     * will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses received from the service.
     */
    public Iterable<ListConnectHarnessesResponse> listConnectHarnessesResponseIterator(
            final ListConnectHarnessesRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListConnectHarnessesRequest.Builder, ListConnectHarnessesRequest,
                ListConnectHarnessesResponse>(
                new com.google.common.base.Supplier<ListConnectHarnessesRequest.Builder>() {
                    @Override
                    public ListConnectHarnessesRequest.Builder get() {
                        return ListConnectHarnessesRequest.builder().copy(request);
                    }
                },
                new com.google.common.base.Function<ListConnectHarnessesResponse, String>() {
                    @Override
                    public String apply(ListConnectHarnessesResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new com.google.common.base.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListConnectHarnessesRequest.Builder>,
                        ListConnectHarnessesRequest>() {
                    @Override
                    public ListConnectHarnessesRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListConnectHarnessesRequest.Builder>
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
                        ListConnectHarnessesRequest, ListConnectHarnessesResponse>() {
                    @Override
                    public ListConnectHarnessesResponse apply(ListConnectHarnessesRequest request) {
                        return client.listConnectHarnesses(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link com.oracle.bmc.streaming.model.ConnectHarnessSummary} objects
     * contained in responses from the listConnectHarnesses operation. This iterable will fetch more data from the
     * server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link com.oracle.bmc.streaming.model.ConnectHarnessSummary} objects
     * contained in responses received from the service.
     */
    public Iterable<com.oracle.bmc.streaming.model.ConnectHarnessSummary>
            listConnectHarnessesRecordIterator(final ListConnectHarnessesRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListConnectHarnessesRequest.Builder, ListConnectHarnessesRequest,
                ListConnectHarnessesResponse, com.oracle.bmc.streaming.model.ConnectHarnessSummary>(
                new com.google.common.base.Supplier<ListConnectHarnessesRequest.Builder>() {
                    @Override
                    public ListConnectHarnessesRequest.Builder get() {
                        return ListConnectHarnessesRequest.builder().copy(request);
                    }
                },
                new com.google.common.base.Function<ListConnectHarnessesResponse, String>() {
                    @Override
                    public String apply(ListConnectHarnessesResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new com.google.common.base.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListConnectHarnessesRequest.Builder>,
                        ListConnectHarnessesRequest>() {
                    @Override
                    public ListConnectHarnessesRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListConnectHarnessesRequest.Builder>
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
                        ListConnectHarnessesRequest, ListConnectHarnessesResponse>() {
                    @Override
                    public ListConnectHarnessesResponse apply(ListConnectHarnessesRequest request) {
                        return client.listConnectHarnesses(request);
                    }
                },
                new com.google.common.base.Function<
                        ListConnectHarnessesResponse,
                        java.util.List<com.oracle.bmc.streaming.model.ConnectHarnessSummary>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.streaming.model.ConnectHarnessSummary>
                            apply(ListConnectHarnessesResponse response) {
                        return response.getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the listStreamPools operation. This iterable
     * will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses received from the service.
     */
    public Iterable<ListStreamPoolsResponse> listStreamPoolsResponseIterator(
            final ListStreamPoolsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListStreamPoolsRequest.Builder, ListStreamPoolsRequest, ListStreamPoolsResponse>(
                new com.google.common.base.Supplier<ListStreamPoolsRequest.Builder>() {
                    @Override
                    public ListStreamPoolsRequest.Builder get() {
                        return ListStreamPoolsRequest.builder().copy(request);
                    }
                },
                new com.google.common.base.Function<ListStreamPoolsResponse, String>() {
                    @Override
                    public String apply(ListStreamPoolsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new com.google.common.base.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListStreamPoolsRequest.Builder>,
                        ListStreamPoolsRequest>() {
                    @Override
                    public ListStreamPoolsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListStreamPoolsRequest.Builder>
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
                        ListStreamPoolsRequest, ListStreamPoolsResponse>() {
                    @Override
                    public ListStreamPoolsResponse apply(ListStreamPoolsRequest request) {
                        return client.listStreamPools(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link com.oracle.bmc.streaming.model.StreamPoolSummary} objects
     * contained in responses from the listStreamPools operation. This iterable will fetch more data from the
     * server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link com.oracle.bmc.streaming.model.StreamPoolSummary} objects
     * contained in responses received from the service.
     */
    public Iterable<com.oracle.bmc.streaming.model.StreamPoolSummary> listStreamPoolsRecordIterator(
            final ListStreamPoolsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListStreamPoolsRequest.Builder, ListStreamPoolsRequest, ListStreamPoolsResponse,
                com.oracle.bmc.streaming.model.StreamPoolSummary>(
                new com.google.common.base.Supplier<ListStreamPoolsRequest.Builder>() {
                    @Override
                    public ListStreamPoolsRequest.Builder get() {
                        return ListStreamPoolsRequest.builder().copy(request);
                    }
                },
                new com.google.common.base.Function<ListStreamPoolsResponse, String>() {
                    @Override
                    public String apply(ListStreamPoolsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new com.google.common.base.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListStreamPoolsRequest.Builder>,
                        ListStreamPoolsRequest>() {
                    @Override
                    public ListStreamPoolsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListStreamPoolsRequest.Builder>
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
                        ListStreamPoolsRequest, ListStreamPoolsResponse>() {
                    @Override
                    public ListStreamPoolsResponse apply(ListStreamPoolsRequest request) {
                        return client.listStreamPools(request);
                    }
                },
                new com.google.common.base.Function<
                        ListStreamPoolsResponse,
                        java.util.List<com.oracle.bmc.streaming.model.StreamPoolSummary>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.streaming.model.StreamPoolSummary> apply(
                            ListStreamPoolsResponse response) {
                        return response.getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the listStreams operation. This iterable
     * will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses received from the service.
     */
    public Iterable<ListStreamsResponse> listStreamsResponseIterator(
            final ListStreamsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListStreamsRequest.Builder, ListStreamsRequest, ListStreamsResponse>(
                new com.google.common.base.Supplier<ListStreamsRequest.Builder>() {
                    @Override
                    public ListStreamsRequest.Builder get() {
                        return ListStreamsRequest.builder().copy(request);
                    }
                },
                new com.google.common.base.Function<ListStreamsResponse, String>() {
                    @Override
                    public String apply(ListStreamsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new com.google.common.base.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListStreamsRequest.Builder>,
                        ListStreamsRequest>() {
                    @Override
                    public ListStreamsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListStreamsRequest.Builder>
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
                new com.google.common.base.Function<ListStreamsRequest, ListStreamsResponse>() {
                    @Override
                    public ListStreamsResponse apply(ListStreamsRequest request) {
                        return client.listStreams(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link com.oracle.bmc.streaming.model.StreamSummary} objects
     * contained in responses from the listStreams operation. This iterable will fetch more data from the
     * server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link com.oracle.bmc.streaming.model.StreamSummary} objects
     * contained in responses received from the service.
     */
    public Iterable<com.oracle.bmc.streaming.model.StreamSummary> listStreamsRecordIterator(
            final ListStreamsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListStreamsRequest.Builder, ListStreamsRequest, ListStreamsResponse,
                com.oracle.bmc.streaming.model.StreamSummary>(
                new com.google.common.base.Supplier<ListStreamsRequest.Builder>() {
                    @Override
                    public ListStreamsRequest.Builder get() {
                        return ListStreamsRequest.builder().copy(request);
                    }
                },
                new com.google.common.base.Function<ListStreamsResponse, String>() {
                    @Override
                    public String apply(ListStreamsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new com.google.common.base.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListStreamsRequest.Builder>,
                        ListStreamsRequest>() {
                    @Override
                    public ListStreamsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListStreamsRequest.Builder>
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
                new com.google.common.base.Function<ListStreamsRequest, ListStreamsResponse>() {
                    @Override
                    public ListStreamsResponse apply(ListStreamsRequest request) {
                        return client.listStreams(request);
                    }
                },
                new com.google.common.base.Function<
                        ListStreamsResponse,
                        java.util.List<com.oracle.bmc.streaming.model.StreamSummary>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.streaming.model.StreamSummary> apply(
                            ListStreamsResponse response) {
                        return response.getItems();
                    }
                });
    }
}

/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.generativeaisandbox;

import com.oracle.bmc.generativeaisandbox.requests.*;
import com.oracle.bmc.generativeaisandbox.responses.*;

/**
 * Collection of helper methods that can be used to provide an {@link java.lang.Iterable} interface
 * to any list operations of GenerativeAiSandbox where multiple pages of data may be fetched. Two
 * styles of iteration are supported:
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
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 1.0")
public class GenerativeAiSandboxPaginators {
    private final GenerativeAiSandbox client;

    public GenerativeAiSandboxPaginators(GenerativeAiSandbox client) {
        this.client = client;
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the
     * listSandboxCommand operation. This iterable will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses
     *     received from the service.
     */
    public Iterable<ListSandboxCommandResponse> listSandboxCommandResponseIterator(
            final ListSandboxCommandRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListSandboxCommandRequest.Builder,
                ListSandboxCommandRequest,
                ListSandboxCommandResponse>(
                new java.util.function.Supplier<ListSandboxCommandRequest.Builder>() {
                    @Override
                    public ListSandboxCommandRequest.Builder get() {
                        return ListSandboxCommandRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListSandboxCommandResponse, String>() {
                    @Override
                    public String apply(ListSandboxCommandResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListSandboxCommandRequest.Builder>,
                        ListSandboxCommandRequest>() {
                    @Override
                    public ListSandboxCommandRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListSandboxCommandRequest.Builder>
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
                        ListSandboxCommandRequest, ListSandboxCommandResponse>() {
                    @Override
                    public ListSandboxCommandResponse apply(ListSandboxCommandRequest request) {
                        return client.listSandboxCommand(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link
     * com.oracle.bmc.generativeaisandbox.model.SandboxCommandSummary} objects contained in
     * responses from the listSandboxCommand operation. This iterable will fetch more data from the
     * server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link
     *     com.oracle.bmc.generativeaisandbox.model.SandboxCommandSummary} objects contained in
     *     responses received from the service.
     */
    public Iterable<com.oracle.bmc.generativeaisandbox.model.SandboxCommandSummary>
            listSandboxCommandRecordIterator(final ListSandboxCommandRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListSandboxCommandRequest.Builder,
                ListSandboxCommandRequest,
                ListSandboxCommandResponse,
                com.oracle.bmc.generativeaisandbox.model.SandboxCommandSummary>(
                new java.util.function.Supplier<ListSandboxCommandRequest.Builder>() {
                    @Override
                    public ListSandboxCommandRequest.Builder get() {
                        return ListSandboxCommandRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListSandboxCommandResponse, String>() {
                    @Override
                    public String apply(ListSandboxCommandResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListSandboxCommandRequest.Builder>,
                        ListSandboxCommandRequest>() {
                    @Override
                    public ListSandboxCommandRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListSandboxCommandRequest.Builder>
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
                        ListSandboxCommandRequest, ListSandboxCommandResponse>() {
                    @Override
                    public ListSandboxCommandResponse apply(ListSandboxCommandRequest request) {
                        return client.listSandboxCommand(request);
                    }
                },
                new java.util.function.Function<
                        ListSandboxCommandResponse,
                        java.util.List<
                                com.oracle.bmc.generativeaisandbox.model.SandboxCommandSummary>>() {
                    @Override
                    public java.util.List<
                                    com.oracle.bmc.generativeaisandbox.model.SandboxCommandSummary>
                            apply(ListSandboxCommandResponse response) {
                        return response.getSandboxCommandCollection().getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the
     * listSandboxSnapshots operation. This iterable will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses
     *     received from the service.
     */
    public Iterable<ListSandboxSnapshotsResponse> listSandboxSnapshotsResponseIterator(
            final ListSandboxSnapshotsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListSandboxSnapshotsRequest.Builder,
                ListSandboxSnapshotsRequest,
                ListSandboxSnapshotsResponse>(
                new java.util.function.Supplier<ListSandboxSnapshotsRequest.Builder>() {
                    @Override
                    public ListSandboxSnapshotsRequest.Builder get() {
                        return ListSandboxSnapshotsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListSandboxSnapshotsResponse, String>() {
                    @Override
                    public String apply(ListSandboxSnapshotsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListSandboxSnapshotsRequest.Builder>,
                        ListSandboxSnapshotsRequest>() {
                    @Override
                    public ListSandboxSnapshotsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListSandboxSnapshotsRequest.Builder>
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
                        ListSandboxSnapshotsRequest, ListSandboxSnapshotsResponse>() {
                    @Override
                    public ListSandboxSnapshotsResponse apply(ListSandboxSnapshotsRequest request) {
                        return client.listSandboxSnapshots(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link
     * com.oracle.bmc.generativeaisandbox.model.SandboxSnapshotSummary} objects contained in
     * responses from the listSandboxSnapshots operation. This iterable will fetch more data from
     * the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link
     *     com.oracle.bmc.generativeaisandbox.model.SandboxSnapshotSummary} objects contained in
     *     responses received from the service.
     */
    public Iterable<com.oracle.bmc.generativeaisandbox.model.SandboxSnapshotSummary>
            listSandboxSnapshotsRecordIterator(final ListSandboxSnapshotsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListSandboxSnapshotsRequest.Builder,
                ListSandboxSnapshotsRequest,
                ListSandboxSnapshotsResponse,
                com.oracle.bmc.generativeaisandbox.model.SandboxSnapshotSummary>(
                new java.util.function.Supplier<ListSandboxSnapshotsRequest.Builder>() {
                    @Override
                    public ListSandboxSnapshotsRequest.Builder get() {
                        return ListSandboxSnapshotsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListSandboxSnapshotsResponse, String>() {
                    @Override
                    public String apply(ListSandboxSnapshotsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListSandboxSnapshotsRequest.Builder>,
                        ListSandboxSnapshotsRequest>() {
                    @Override
                    public ListSandboxSnapshotsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListSandboxSnapshotsRequest.Builder>
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
                        ListSandboxSnapshotsRequest, ListSandboxSnapshotsResponse>() {
                    @Override
                    public ListSandboxSnapshotsResponse apply(ListSandboxSnapshotsRequest request) {
                        return client.listSandboxSnapshots(request);
                    }
                },
                new java.util.function.Function<
                        ListSandboxSnapshotsResponse,
                        java.util.List<
                                com.oracle.bmc.generativeaisandbox.model
                                        .SandboxSnapshotSummary>>() {
                    @Override
                    public java.util.List<
                                    com.oracle.bmc.generativeaisandbox.model.SandboxSnapshotSummary>
                            apply(ListSandboxSnapshotsResponse response) {
                        return response.getSandboxSnapshotCollection().getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the listSandboxes
     * operation. This iterable will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses
     *     received from the service.
     */
    public Iterable<ListSandboxesResponse> listSandboxesResponseIterator(
            final ListSandboxesRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListSandboxesRequest.Builder, ListSandboxesRequest, ListSandboxesResponse>(
                new java.util.function.Supplier<ListSandboxesRequest.Builder>() {
                    @Override
                    public ListSandboxesRequest.Builder get() {
                        return ListSandboxesRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListSandboxesResponse, String>() {
                    @Override
                    public String apply(ListSandboxesResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListSandboxesRequest.Builder>,
                        ListSandboxesRequest>() {
                    @Override
                    public ListSandboxesRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListSandboxesRequest.Builder>
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
                new java.util.function.Function<ListSandboxesRequest, ListSandboxesResponse>() {
                    @Override
                    public ListSandboxesResponse apply(ListSandboxesRequest request) {
                        return client.listSandboxes(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link
     * com.oracle.bmc.generativeaisandbox.model.SandboxSummary} objects contained in responses from
     * the listSandboxes operation. This iterable will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link
     *     com.oracle.bmc.generativeaisandbox.model.SandboxSummary} objects contained in responses
     *     received from the service.
     */
    public Iterable<com.oracle.bmc.generativeaisandbox.model.SandboxSummary>
            listSandboxesRecordIterator(final ListSandboxesRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListSandboxesRequest.Builder,
                ListSandboxesRequest,
                ListSandboxesResponse,
                com.oracle.bmc.generativeaisandbox.model.SandboxSummary>(
                new java.util.function.Supplier<ListSandboxesRequest.Builder>() {
                    @Override
                    public ListSandboxesRequest.Builder get() {
                        return ListSandboxesRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListSandboxesResponse, String>() {
                    @Override
                    public String apply(ListSandboxesResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListSandboxesRequest.Builder>,
                        ListSandboxesRequest>() {
                    @Override
                    public ListSandboxesRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListSandboxesRequest.Builder>
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
                new java.util.function.Function<ListSandboxesRequest, ListSandboxesResponse>() {
                    @Override
                    public ListSandboxesResponse apply(ListSandboxesRequest request) {
                        return client.listSandboxes(request);
                    }
                },
                new java.util.function.Function<
                        ListSandboxesResponse,
                        java.util.List<com.oracle.bmc.generativeaisandbox.model.SandboxSummary>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.generativeaisandbox.model.SandboxSummary>
                            apply(ListSandboxesResponse response) {
                        return response.getSandboxCollection().getItems();
                    }
                });
    }
}

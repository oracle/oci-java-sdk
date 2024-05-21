/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.rover;

import com.oracle.bmc.rover.requests.*;
import com.oracle.bmc.rover.responses.*;

/**
 * Collection of helper methods that can be used to provide an {@link java.lang.Iterable} interface
 * to any list operations of RoverBundle where multiple pages of data may be fetched.
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
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20201210")
public class RoverBundlePaginators {
    private final RoverBundle client;

    public RoverBundlePaginators(RoverBundle client) {
        this.client = client;
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the listRoverClusterRoverBundleRequests operation. This iterable
     * will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses received from the service.
     */
    public Iterable<ListRoverClusterRoverBundleRequestsResponse>
            listRoverClusterRoverBundleRequestsResponseIterator(
                    final ListRoverClusterRoverBundleRequestsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListRoverClusterRoverBundleRequestsRequest.Builder,
                ListRoverClusterRoverBundleRequestsRequest,
                ListRoverClusterRoverBundleRequestsResponse>(
                new java.util.function.Supplier<
                        ListRoverClusterRoverBundleRequestsRequest.Builder>() {
                    @Override
                    public ListRoverClusterRoverBundleRequestsRequest.Builder get() {
                        return ListRoverClusterRoverBundleRequestsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<
                        ListRoverClusterRoverBundleRequestsResponse, String>() {
                    @Override
                    public String apply(ListRoverClusterRoverBundleRequestsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListRoverClusterRoverBundleRequestsRequest.Builder>,
                        ListRoverClusterRoverBundleRequestsRequest>() {
                    @Override
                    public ListRoverClusterRoverBundleRequestsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListRoverClusterRoverBundleRequestsRequest.Builder>
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
                        ListRoverClusterRoverBundleRequestsRequest,
                        ListRoverClusterRoverBundleRequestsResponse>() {
                    @Override
                    public ListRoverClusterRoverBundleRequestsResponse apply(
                            ListRoverClusterRoverBundleRequestsRequest request) {
                        return client.listRoverClusterRoverBundleRequests(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link com.oracle.bmc.rover.model.RoverBundleRequestSummary} objects
     * contained in responses from the listRoverClusterRoverBundleRequests operation. This iterable will fetch more data from the
     * server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link com.oracle.bmc.rover.model.RoverBundleRequestSummary} objects
     * contained in responses received from the service.
     */
    public Iterable<com.oracle.bmc.rover.model.RoverBundleRequestSummary>
            listRoverClusterRoverBundleRequestsRecordIterator(
                    final ListRoverClusterRoverBundleRequestsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListRoverClusterRoverBundleRequestsRequest.Builder,
                ListRoverClusterRoverBundleRequestsRequest,
                ListRoverClusterRoverBundleRequestsResponse,
                com.oracle.bmc.rover.model.RoverBundleRequestSummary>(
                new java.util.function.Supplier<
                        ListRoverClusterRoverBundleRequestsRequest.Builder>() {
                    @Override
                    public ListRoverClusterRoverBundleRequestsRequest.Builder get() {
                        return ListRoverClusterRoverBundleRequestsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<
                        ListRoverClusterRoverBundleRequestsResponse, String>() {
                    @Override
                    public String apply(ListRoverClusterRoverBundleRequestsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListRoverClusterRoverBundleRequestsRequest.Builder>,
                        ListRoverClusterRoverBundleRequestsRequest>() {
                    @Override
                    public ListRoverClusterRoverBundleRequestsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListRoverClusterRoverBundleRequestsRequest.Builder>
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
                        ListRoverClusterRoverBundleRequestsRequest,
                        ListRoverClusterRoverBundleRequestsResponse>() {
                    @Override
                    public ListRoverClusterRoverBundleRequestsResponse apply(
                            ListRoverClusterRoverBundleRequestsRequest request) {
                        return client.listRoverClusterRoverBundleRequests(request);
                    }
                },
                new java.util.function.Function<
                        ListRoverClusterRoverBundleRequestsResponse,
                        java.util.List<com.oracle.bmc.rover.model.RoverBundleRequestSummary>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.rover.model.RoverBundleRequestSummary>
                            apply(ListRoverClusterRoverBundleRequestsResponse response) {
                        return response.getRoverBundleRequestCollection().getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the listRoverNodeRoverBundleRequests operation. This iterable
     * will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses received from the service.
     */
    public Iterable<ListRoverNodeRoverBundleRequestsResponse>
            listRoverNodeRoverBundleRequestsResponseIterator(
                    final ListRoverNodeRoverBundleRequestsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListRoverNodeRoverBundleRequestsRequest.Builder,
                ListRoverNodeRoverBundleRequestsRequest, ListRoverNodeRoverBundleRequestsResponse>(
                new java.util.function.Supplier<ListRoverNodeRoverBundleRequestsRequest.Builder>() {
                    @Override
                    public ListRoverNodeRoverBundleRequestsRequest.Builder get() {
                        return ListRoverNodeRoverBundleRequestsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<
                        ListRoverNodeRoverBundleRequestsResponse, String>() {
                    @Override
                    public String apply(ListRoverNodeRoverBundleRequestsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListRoverNodeRoverBundleRequestsRequest.Builder>,
                        ListRoverNodeRoverBundleRequestsRequest>() {
                    @Override
                    public ListRoverNodeRoverBundleRequestsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListRoverNodeRoverBundleRequestsRequest.Builder>
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
                        ListRoverNodeRoverBundleRequestsRequest,
                        ListRoverNodeRoverBundleRequestsResponse>() {
                    @Override
                    public ListRoverNodeRoverBundleRequestsResponse apply(
                            ListRoverNodeRoverBundleRequestsRequest request) {
                        return client.listRoverNodeRoverBundleRequests(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link com.oracle.bmc.rover.model.RoverBundleRequestSummary} objects
     * contained in responses from the listRoverNodeRoverBundleRequests operation. This iterable will fetch more data from the
     * server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link com.oracle.bmc.rover.model.RoverBundleRequestSummary} objects
     * contained in responses received from the service.
     */
    public Iterable<com.oracle.bmc.rover.model.RoverBundleRequestSummary>
            listRoverNodeRoverBundleRequestsRecordIterator(
                    final ListRoverNodeRoverBundleRequestsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListRoverNodeRoverBundleRequestsRequest.Builder,
                ListRoverNodeRoverBundleRequestsRequest, ListRoverNodeRoverBundleRequestsResponse,
                com.oracle.bmc.rover.model.RoverBundleRequestSummary>(
                new java.util.function.Supplier<ListRoverNodeRoverBundleRequestsRequest.Builder>() {
                    @Override
                    public ListRoverNodeRoverBundleRequestsRequest.Builder get() {
                        return ListRoverNodeRoverBundleRequestsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<
                        ListRoverNodeRoverBundleRequestsResponse, String>() {
                    @Override
                    public String apply(ListRoverNodeRoverBundleRequestsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListRoverNodeRoverBundleRequestsRequest.Builder>,
                        ListRoverNodeRoverBundleRequestsRequest>() {
                    @Override
                    public ListRoverNodeRoverBundleRequestsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListRoverNodeRoverBundleRequestsRequest.Builder>
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
                        ListRoverNodeRoverBundleRequestsRequest,
                        ListRoverNodeRoverBundleRequestsResponse>() {
                    @Override
                    public ListRoverNodeRoverBundleRequestsResponse apply(
                            ListRoverNodeRoverBundleRequestsRequest request) {
                        return client.listRoverNodeRoverBundleRequests(request);
                    }
                },
                new java.util.function.Function<
                        ListRoverNodeRoverBundleRequestsResponse,
                        java.util.List<com.oracle.bmc.rover.model.RoverBundleRequestSummary>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.rover.model.RoverBundleRequestSummary>
                            apply(ListRoverNodeRoverBundleRequestsResponse response) {
                        return response.getRoverBundleRequestCollection().getItems();
                    }
                });
    }
}

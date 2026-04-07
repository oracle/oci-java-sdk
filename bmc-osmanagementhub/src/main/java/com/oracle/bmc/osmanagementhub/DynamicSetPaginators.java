/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.osmanagementhub;

import com.oracle.bmc.osmanagementhub.requests.*;
import com.oracle.bmc.osmanagementhub.responses.*;

/**
 * Collection of helper methods that can be used to provide an {@link java.lang.Iterable} interface
 * to any list operations of DynamicSet where multiple pages of data may be fetched. Two styles of
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
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20220901")
public class DynamicSetPaginators {
    private final DynamicSet client;

    public DynamicSetPaginators(DynamicSet client) {
        this.client = client;
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the
     * listDynamicSets operation. This iterable will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses
     *     received from the service.
     */
    public Iterable<ListDynamicSetsResponse> listDynamicSetsResponseIterator(
            final ListDynamicSetsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListDynamicSetsRequest.Builder, ListDynamicSetsRequest, ListDynamicSetsResponse>(
                new java.util.function.Supplier<ListDynamicSetsRequest.Builder>() {
                    @Override
                    public ListDynamicSetsRequest.Builder get() {
                        return ListDynamicSetsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListDynamicSetsResponse, String>() {
                    @Override
                    public String apply(ListDynamicSetsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListDynamicSetsRequest.Builder>,
                        ListDynamicSetsRequest>() {
                    @Override
                    public ListDynamicSetsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListDynamicSetsRequest.Builder>
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
                new java.util.function.Function<ListDynamicSetsRequest, ListDynamicSetsResponse>() {
                    @Override
                    public ListDynamicSetsResponse apply(ListDynamicSetsRequest request) {
                        return client.listDynamicSets(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link
     * com.oracle.bmc.osmanagementhub.model.DynamicSetSummary} objects contained in responses from
     * the listDynamicSets operation. This iterable will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link
     *     com.oracle.bmc.osmanagementhub.model.DynamicSetSummary} objects contained in responses
     *     received from the service.
     */
    public Iterable<com.oracle.bmc.osmanagementhub.model.DynamicSetSummary>
            listDynamicSetsRecordIterator(final ListDynamicSetsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListDynamicSetsRequest.Builder,
                ListDynamicSetsRequest,
                ListDynamicSetsResponse,
                com.oracle.bmc.osmanagementhub.model.DynamicSetSummary>(
                new java.util.function.Supplier<ListDynamicSetsRequest.Builder>() {
                    @Override
                    public ListDynamicSetsRequest.Builder get() {
                        return ListDynamicSetsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListDynamicSetsResponse, String>() {
                    @Override
                    public String apply(ListDynamicSetsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListDynamicSetsRequest.Builder>,
                        ListDynamicSetsRequest>() {
                    @Override
                    public ListDynamicSetsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListDynamicSetsRequest.Builder>
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
                new java.util.function.Function<ListDynamicSetsRequest, ListDynamicSetsResponse>() {
                    @Override
                    public ListDynamicSetsResponse apply(ListDynamicSetsRequest request) {
                        return client.listDynamicSets(request);
                    }
                },
                new java.util.function.Function<
                        ListDynamicSetsResponse,
                        java.util.List<com.oracle.bmc.osmanagementhub.model.DynamicSetSummary>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.osmanagementhub.model.DynamicSetSummary>
                            apply(ListDynamicSetsResponse response) {
                        return response.getDynamicSetCollection().getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the
     * listManagedInstancesInDynamicSet operation. This iterable will fetch more data from the
     * server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses
     *     received from the service.
     */
    public Iterable<ListManagedInstancesInDynamicSetResponse>
            listManagedInstancesInDynamicSetResponseIterator(
                    final ListManagedInstancesInDynamicSetRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListManagedInstancesInDynamicSetRequest.Builder,
                ListManagedInstancesInDynamicSetRequest,
                ListManagedInstancesInDynamicSetResponse>(
                new java.util.function.Supplier<ListManagedInstancesInDynamicSetRequest.Builder>() {
                    @Override
                    public ListManagedInstancesInDynamicSetRequest.Builder get() {
                        return ListManagedInstancesInDynamicSetRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<
                        ListManagedInstancesInDynamicSetResponse, String>() {
                    @Override
                    public String apply(ListManagedInstancesInDynamicSetResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListManagedInstancesInDynamicSetRequest.Builder>,
                        ListManagedInstancesInDynamicSetRequest>() {
                    @Override
                    public ListManagedInstancesInDynamicSetRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListManagedInstancesInDynamicSetRequest.Builder>
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
                        ListManagedInstancesInDynamicSetRequest,
                        ListManagedInstancesInDynamicSetResponse>() {
                    @Override
                    public ListManagedInstancesInDynamicSetResponse apply(
                            ListManagedInstancesInDynamicSetRequest request) {
                        return client.listManagedInstancesInDynamicSet(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link
     * com.oracle.bmc.osmanagementhub.model.ManagedInstanceSummary} objects contained in responses
     * from the listManagedInstancesInDynamicSet operation. This iterable will fetch more data from
     * the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link
     *     com.oracle.bmc.osmanagementhub.model.ManagedInstanceSummary} objects contained in
     *     responses received from the service.
     */
    public Iterable<com.oracle.bmc.osmanagementhub.model.ManagedInstanceSummary>
            listManagedInstancesInDynamicSetRecordIterator(
                    final ListManagedInstancesInDynamicSetRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListManagedInstancesInDynamicSetRequest.Builder,
                ListManagedInstancesInDynamicSetRequest,
                ListManagedInstancesInDynamicSetResponse,
                com.oracle.bmc.osmanagementhub.model.ManagedInstanceSummary>(
                new java.util.function.Supplier<ListManagedInstancesInDynamicSetRequest.Builder>() {
                    @Override
                    public ListManagedInstancesInDynamicSetRequest.Builder get() {
                        return ListManagedInstancesInDynamicSetRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<
                        ListManagedInstancesInDynamicSetResponse, String>() {
                    @Override
                    public String apply(ListManagedInstancesInDynamicSetResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListManagedInstancesInDynamicSetRequest.Builder>,
                        ListManagedInstancesInDynamicSetRequest>() {
                    @Override
                    public ListManagedInstancesInDynamicSetRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListManagedInstancesInDynamicSetRequest.Builder>
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
                        ListManagedInstancesInDynamicSetRequest,
                        ListManagedInstancesInDynamicSetResponse>() {
                    @Override
                    public ListManagedInstancesInDynamicSetResponse apply(
                            ListManagedInstancesInDynamicSetRequest request) {
                        return client.listManagedInstancesInDynamicSet(request);
                    }
                },
                new java.util.function.Function<
                        ListManagedInstancesInDynamicSetResponse,
                        java.util.List<
                                com.oracle.bmc.osmanagementhub.model.ManagedInstanceSummary>>() {
                    @Override
                    public java.util.List<
                                    com.oracle.bmc.osmanagementhub.model.ManagedInstanceSummary>
                            apply(ListManagedInstancesInDynamicSetResponse response) {
                        return response.getManagedInstanceCollection().getItems();
                    }
                });
    }
}

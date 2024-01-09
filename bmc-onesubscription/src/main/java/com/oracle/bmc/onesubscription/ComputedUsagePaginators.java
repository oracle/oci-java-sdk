/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.onesubscription;

import com.oracle.bmc.onesubscription.requests.*;
import com.oracle.bmc.onesubscription.responses.*;

/**
 * Collection of helper methods that can be used to provide an {@link java.lang.Iterable} interface
 * to any list operations of ComputedUsage where multiple pages of data may be fetched. Two styles
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
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20190111")
public class ComputedUsagePaginators {
    private final ComputedUsage client;

    public ComputedUsagePaginators(ComputedUsage client) {
        this.client = client;
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the
     * listAggregatedComputedUsages operation. This iterable will fetch more data from the server as
     * needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses
     *     received from the service.
     */
    public Iterable<ListAggregatedComputedUsagesResponse>
            listAggregatedComputedUsagesResponseIterator(
                    final ListAggregatedComputedUsagesRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListAggregatedComputedUsagesRequest.Builder,
                ListAggregatedComputedUsagesRequest,
                ListAggregatedComputedUsagesResponse>(
                new java.util.function.Supplier<ListAggregatedComputedUsagesRequest.Builder>() {
                    @Override
                    public ListAggregatedComputedUsagesRequest.Builder get() {
                        return ListAggregatedComputedUsagesRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListAggregatedComputedUsagesResponse, String>() {
                    @Override
                    public String apply(ListAggregatedComputedUsagesResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListAggregatedComputedUsagesRequest.Builder>,
                        ListAggregatedComputedUsagesRequest>() {
                    @Override
                    public ListAggregatedComputedUsagesRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListAggregatedComputedUsagesRequest.Builder>
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
                        ListAggregatedComputedUsagesRequest,
                        ListAggregatedComputedUsagesResponse>() {
                    @Override
                    public ListAggregatedComputedUsagesResponse apply(
                            ListAggregatedComputedUsagesRequest request) {
                        return client.listAggregatedComputedUsages(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link
     * com.oracle.bmc.onesubscription.model.AggregatedComputedUsageSummary} objects contained in
     * responses from the listAggregatedComputedUsages operation. This iterable will fetch more data
     * from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link
     *     com.oracle.bmc.onesubscription.model.AggregatedComputedUsageSummary} objects contained in
     *     responses received from the service.
     */
    public Iterable<com.oracle.bmc.onesubscription.model.AggregatedComputedUsageSummary>
            listAggregatedComputedUsagesRecordIterator(
                    final ListAggregatedComputedUsagesRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListAggregatedComputedUsagesRequest.Builder,
                ListAggregatedComputedUsagesRequest,
                ListAggregatedComputedUsagesResponse,
                com.oracle.bmc.onesubscription.model.AggregatedComputedUsageSummary>(
                new java.util.function.Supplier<ListAggregatedComputedUsagesRequest.Builder>() {
                    @Override
                    public ListAggregatedComputedUsagesRequest.Builder get() {
                        return ListAggregatedComputedUsagesRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListAggregatedComputedUsagesResponse, String>() {
                    @Override
                    public String apply(ListAggregatedComputedUsagesResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListAggregatedComputedUsagesRequest.Builder>,
                        ListAggregatedComputedUsagesRequest>() {
                    @Override
                    public ListAggregatedComputedUsagesRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListAggregatedComputedUsagesRequest.Builder>
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
                        ListAggregatedComputedUsagesRequest,
                        ListAggregatedComputedUsagesResponse>() {
                    @Override
                    public ListAggregatedComputedUsagesResponse apply(
                            ListAggregatedComputedUsagesRequest request) {
                        return client.listAggregatedComputedUsages(request);
                    }
                },
                new java.util.function.Function<
                        ListAggregatedComputedUsagesResponse,
                        java.util.List<
                                com.oracle.bmc.onesubscription.model
                                        .AggregatedComputedUsageSummary>>() {
                    @Override
                    public java.util.List<
                                    com.oracle.bmc.onesubscription.model
                                            .AggregatedComputedUsageSummary>
                            apply(ListAggregatedComputedUsagesResponse response) {
                        return response.getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the
     * listComputedUsages operation. This iterable will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses
     *     received from the service.
     */
    public Iterable<ListComputedUsagesResponse> listComputedUsagesResponseIterator(
            final ListComputedUsagesRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListComputedUsagesRequest.Builder,
                ListComputedUsagesRequest,
                ListComputedUsagesResponse>(
                new java.util.function.Supplier<ListComputedUsagesRequest.Builder>() {
                    @Override
                    public ListComputedUsagesRequest.Builder get() {
                        return ListComputedUsagesRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListComputedUsagesResponse, String>() {
                    @Override
                    public String apply(ListComputedUsagesResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListComputedUsagesRequest.Builder>,
                        ListComputedUsagesRequest>() {
                    @Override
                    public ListComputedUsagesRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListComputedUsagesRequest.Builder>
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
                        ListComputedUsagesRequest, ListComputedUsagesResponse>() {
                    @Override
                    public ListComputedUsagesResponse apply(ListComputedUsagesRequest request) {
                        return client.listComputedUsages(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link
     * com.oracle.bmc.onesubscription.model.ComputedUsageSummary} objects contained in responses
     * from the listComputedUsages operation. This iterable will fetch more data from the server as
     * needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link
     *     com.oracle.bmc.onesubscription.model.ComputedUsageSummary} objects contained in responses
     *     received from the service.
     */
    public Iterable<com.oracle.bmc.onesubscription.model.ComputedUsageSummary>
            listComputedUsagesRecordIterator(final ListComputedUsagesRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListComputedUsagesRequest.Builder,
                ListComputedUsagesRequest,
                ListComputedUsagesResponse,
                com.oracle.bmc.onesubscription.model.ComputedUsageSummary>(
                new java.util.function.Supplier<ListComputedUsagesRequest.Builder>() {
                    @Override
                    public ListComputedUsagesRequest.Builder get() {
                        return ListComputedUsagesRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListComputedUsagesResponse, String>() {
                    @Override
                    public String apply(ListComputedUsagesResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListComputedUsagesRequest.Builder>,
                        ListComputedUsagesRequest>() {
                    @Override
                    public ListComputedUsagesRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListComputedUsagesRequest.Builder>
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
                        ListComputedUsagesRequest, ListComputedUsagesResponse>() {
                    @Override
                    public ListComputedUsagesResponse apply(ListComputedUsagesRequest request) {
                        return client.listComputedUsages(request);
                    }
                },
                new java.util.function.Function<
                        ListComputedUsagesResponse,
                        java.util.List<
                                com.oracle.bmc.onesubscription.model.ComputedUsageSummary>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.onesubscription.model.ComputedUsageSummary>
                            apply(ListComputedUsagesResponse response) {
                        return response.getItems();
                    }
                });
    }
}

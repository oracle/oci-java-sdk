/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.redis;

import com.oracle.bmc.redis.requests.*;
import com.oracle.bmc.redis.responses.*;

/**
 * Collection of helper methods that can be used to provide an {@link java.lang.Iterable} interface
 * to any list operations of OciCacheConfigSet where multiple pages of data may be fetched. Two
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
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20220315")
public class OciCacheConfigSetPaginators {
    private final OciCacheConfigSet client;

    public OciCacheConfigSetPaginators(OciCacheConfigSet client) {
        this.client = client;
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the
     * listAssociatedOciCacheClusters operation. This iterable will fetch more data from the server
     * as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses
     *     received from the service.
     */
    public Iterable<ListAssociatedOciCacheClustersResponse>
            listAssociatedOciCacheClustersResponseIterator(
                    final ListAssociatedOciCacheClustersRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListAssociatedOciCacheClustersRequest.Builder,
                ListAssociatedOciCacheClustersRequest,
                ListAssociatedOciCacheClustersResponse>(
                new java.util.function.Supplier<ListAssociatedOciCacheClustersRequest.Builder>() {
                    @Override
                    public ListAssociatedOciCacheClustersRequest.Builder get() {
                        return ListAssociatedOciCacheClustersRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListAssociatedOciCacheClustersResponse, String>() {
                    @Override
                    public String apply(ListAssociatedOciCacheClustersResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListAssociatedOciCacheClustersRequest.Builder>,
                        ListAssociatedOciCacheClustersRequest>() {
                    @Override
                    public ListAssociatedOciCacheClustersRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListAssociatedOciCacheClustersRequest.Builder>
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
                        ListAssociatedOciCacheClustersRequest,
                        ListAssociatedOciCacheClustersResponse>() {
                    @Override
                    public ListAssociatedOciCacheClustersResponse apply(
                            ListAssociatedOciCacheClustersRequest request) {
                        return client.listAssociatedOciCacheClusters(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link
     * com.oracle.bmc.redis.model.AssociatedOciCacheClusterSummary} objects contained in responses
     * from the listAssociatedOciCacheClusters operation. This iterable will fetch more data from
     * the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link
     *     com.oracle.bmc.redis.model.AssociatedOciCacheClusterSummary} objects contained in
     *     responses received from the service.
     */
    public Iterable<com.oracle.bmc.redis.model.AssociatedOciCacheClusterSummary>
            listAssociatedOciCacheClustersRecordIterator(
                    final ListAssociatedOciCacheClustersRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListAssociatedOciCacheClustersRequest.Builder,
                ListAssociatedOciCacheClustersRequest,
                ListAssociatedOciCacheClustersResponse,
                com.oracle.bmc.redis.model.AssociatedOciCacheClusterSummary>(
                new java.util.function.Supplier<ListAssociatedOciCacheClustersRequest.Builder>() {
                    @Override
                    public ListAssociatedOciCacheClustersRequest.Builder get() {
                        return ListAssociatedOciCacheClustersRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListAssociatedOciCacheClustersResponse, String>() {
                    @Override
                    public String apply(ListAssociatedOciCacheClustersResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListAssociatedOciCacheClustersRequest.Builder>,
                        ListAssociatedOciCacheClustersRequest>() {
                    @Override
                    public ListAssociatedOciCacheClustersRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListAssociatedOciCacheClustersRequest.Builder>
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
                        ListAssociatedOciCacheClustersRequest,
                        ListAssociatedOciCacheClustersResponse>() {
                    @Override
                    public ListAssociatedOciCacheClustersResponse apply(
                            ListAssociatedOciCacheClustersRequest request) {
                        return client.listAssociatedOciCacheClusters(request);
                    }
                },
                new java.util.function.Function<
                        ListAssociatedOciCacheClustersResponse,
                        java.util.List<
                                com.oracle.bmc.redis.model.AssociatedOciCacheClusterSummary>>() {
                    @Override
                    public java.util.List<
                                    com.oracle.bmc.redis.model.AssociatedOciCacheClusterSummary>
                            apply(ListAssociatedOciCacheClustersResponse response) {
                        return response.getAssociatedOciCacheClusterCollection().getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the
     * listOciCacheConfigSets operation. This iterable will fetch more data from the server as
     * needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses
     *     received from the service.
     */
    public Iterable<ListOciCacheConfigSetsResponse> listOciCacheConfigSetsResponseIterator(
            final ListOciCacheConfigSetsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListOciCacheConfigSetsRequest.Builder,
                ListOciCacheConfigSetsRequest,
                ListOciCacheConfigSetsResponse>(
                new java.util.function.Supplier<ListOciCacheConfigSetsRequest.Builder>() {
                    @Override
                    public ListOciCacheConfigSetsRequest.Builder get() {
                        return ListOciCacheConfigSetsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListOciCacheConfigSetsResponse, String>() {
                    @Override
                    public String apply(ListOciCacheConfigSetsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListOciCacheConfigSetsRequest.Builder>,
                        ListOciCacheConfigSetsRequest>() {
                    @Override
                    public ListOciCacheConfigSetsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListOciCacheConfigSetsRequest.Builder>
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
                        ListOciCacheConfigSetsRequest, ListOciCacheConfigSetsResponse>() {
                    @Override
                    public ListOciCacheConfigSetsResponse apply(
                            ListOciCacheConfigSetsRequest request) {
                        return client.listOciCacheConfigSets(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link
     * com.oracle.bmc.redis.model.OciCacheConfigSetSummary} objects contained in responses from the
     * listOciCacheConfigSets operation. This iterable will fetch more data from the server as
     * needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link
     *     com.oracle.bmc.redis.model.OciCacheConfigSetSummary} objects contained in responses
     *     received from the service.
     */
    public Iterable<com.oracle.bmc.redis.model.OciCacheConfigSetSummary>
            listOciCacheConfigSetsRecordIterator(final ListOciCacheConfigSetsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListOciCacheConfigSetsRequest.Builder,
                ListOciCacheConfigSetsRequest,
                ListOciCacheConfigSetsResponse,
                com.oracle.bmc.redis.model.OciCacheConfigSetSummary>(
                new java.util.function.Supplier<ListOciCacheConfigSetsRequest.Builder>() {
                    @Override
                    public ListOciCacheConfigSetsRequest.Builder get() {
                        return ListOciCacheConfigSetsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListOciCacheConfigSetsResponse, String>() {
                    @Override
                    public String apply(ListOciCacheConfigSetsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListOciCacheConfigSetsRequest.Builder>,
                        ListOciCacheConfigSetsRequest>() {
                    @Override
                    public ListOciCacheConfigSetsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListOciCacheConfigSetsRequest.Builder>
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
                        ListOciCacheConfigSetsRequest, ListOciCacheConfigSetsResponse>() {
                    @Override
                    public ListOciCacheConfigSetsResponse apply(
                            ListOciCacheConfigSetsRequest request) {
                        return client.listOciCacheConfigSets(request);
                    }
                },
                new java.util.function.Function<
                        ListOciCacheConfigSetsResponse,
                        java.util.List<com.oracle.bmc.redis.model.OciCacheConfigSetSummary>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.redis.model.OciCacheConfigSetSummary>
                            apply(ListOciCacheConfigSetsResponse response) {
                        return response.getOciCacheConfigSetCollection().getItems();
                    }
                });
    }
}

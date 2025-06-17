/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.redis;

import com.oracle.bmc.redis.requests.*;
import com.oracle.bmc.redis.responses.*;

/**
 * Collection of helper methods that can be used to provide an {@link java.lang.Iterable} interface
 * to any list operations of OciCacheUser where multiple pages of data may be fetched. Two styles of
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
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20220315")
public class OciCacheUserPaginators {
    private final OciCacheUser client;

    public OciCacheUserPaginators(OciCacheUser client) {
        this.client = client;
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the
     * listAttachedRedisClusters operation. This iterable will fetch more data from the server as
     * needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses
     *     received from the service.
     */
    public Iterable<ListAttachedRedisClustersResponse> listAttachedRedisClustersResponseIterator(
            final ListAttachedRedisClustersRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListAttachedRedisClustersRequest.Builder,
                ListAttachedRedisClustersRequest,
                ListAttachedRedisClustersResponse>(
                new java.util.function.Supplier<ListAttachedRedisClustersRequest.Builder>() {
                    @Override
                    public ListAttachedRedisClustersRequest.Builder get() {
                        return ListAttachedRedisClustersRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListAttachedRedisClustersResponse, String>() {
                    @Override
                    public String apply(ListAttachedRedisClustersResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListAttachedRedisClustersRequest.Builder>,
                        ListAttachedRedisClustersRequest>() {
                    @Override
                    public ListAttachedRedisClustersRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListAttachedRedisClustersRequest.Builder>
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
                        ListAttachedRedisClustersRequest, ListAttachedRedisClustersResponse>() {
                    @Override
                    public ListAttachedRedisClustersResponse apply(
                            ListAttachedRedisClustersRequest request) {
                        return client.listAttachedRedisClusters(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link
     * com.oracle.bmc.redis.model.AttachedOciCacheCluster} objects contained in responses from the
     * listAttachedRedisClusters operation. This iterable will fetch more data from the server as
     * needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link
     *     com.oracle.bmc.redis.model.AttachedOciCacheCluster} objects contained in responses
     *     received from the service.
     */
    public Iterable<com.oracle.bmc.redis.model.AttachedOciCacheCluster>
            listAttachedRedisClustersRecordIterator(
                    final ListAttachedRedisClustersRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListAttachedRedisClustersRequest.Builder,
                ListAttachedRedisClustersRequest,
                ListAttachedRedisClustersResponse,
                com.oracle.bmc.redis.model.AttachedOciCacheCluster>(
                new java.util.function.Supplier<ListAttachedRedisClustersRequest.Builder>() {
                    @Override
                    public ListAttachedRedisClustersRequest.Builder get() {
                        return ListAttachedRedisClustersRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListAttachedRedisClustersResponse, String>() {
                    @Override
                    public String apply(ListAttachedRedisClustersResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListAttachedRedisClustersRequest.Builder>,
                        ListAttachedRedisClustersRequest>() {
                    @Override
                    public ListAttachedRedisClustersRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListAttachedRedisClustersRequest.Builder>
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
                        ListAttachedRedisClustersRequest, ListAttachedRedisClustersResponse>() {
                    @Override
                    public ListAttachedRedisClustersResponse apply(
                            ListAttachedRedisClustersRequest request) {
                        return client.listAttachedRedisClusters(request);
                    }
                },
                new java.util.function.Function<
                        ListAttachedRedisClustersResponse,
                        java.util.List<com.oracle.bmc.redis.model.AttachedOciCacheCluster>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.redis.model.AttachedOciCacheCluster> apply(
                            ListAttachedRedisClustersResponse response) {
                        return response.getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the
     * listOciCacheUsers operation. This iterable will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses
     *     received from the service.
     */
    public Iterable<ListOciCacheUsersResponse> listOciCacheUsersResponseIterator(
            final ListOciCacheUsersRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListOciCacheUsersRequest.Builder,
                ListOciCacheUsersRequest,
                ListOciCacheUsersResponse>(
                new java.util.function.Supplier<ListOciCacheUsersRequest.Builder>() {
                    @Override
                    public ListOciCacheUsersRequest.Builder get() {
                        return ListOciCacheUsersRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListOciCacheUsersResponse, String>() {
                    @Override
                    public String apply(ListOciCacheUsersResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListOciCacheUsersRequest.Builder>,
                        ListOciCacheUsersRequest>() {
                    @Override
                    public ListOciCacheUsersRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListOciCacheUsersRequest.Builder>
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
                        ListOciCacheUsersRequest, ListOciCacheUsersResponse>() {
                    @Override
                    public ListOciCacheUsersResponse apply(ListOciCacheUsersRequest request) {
                        return client.listOciCacheUsers(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link
     * com.oracle.bmc.redis.model.OciCacheUserSummary} objects contained in responses from the
     * listOciCacheUsers operation. This iterable will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link
     *     com.oracle.bmc.redis.model.OciCacheUserSummary} objects contained in responses received
     *     from the service.
     */
    public Iterable<com.oracle.bmc.redis.model.OciCacheUserSummary> listOciCacheUsersRecordIterator(
            final ListOciCacheUsersRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListOciCacheUsersRequest.Builder,
                ListOciCacheUsersRequest,
                ListOciCacheUsersResponse,
                com.oracle.bmc.redis.model.OciCacheUserSummary>(
                new java.util.function.Supplier<ListOciCacheUsersRequest.Builder>() {
                    @Override
                    public ListOciCacheUsersRequest.Builder get() {
                        return ListOciCacheUsersRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListOciCacheUsersResponse, String>() {
                    @Override
                    public String apply(ListOciCacheUsersResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListOciCacheUsersRequest.Builder>,
                        ListOciCacheUsersRequest>() {
                    @Override
                    public ListOciCacheUsersRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListOciCacheUsersRequest.Builder>
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
                        ListOciCacheUsersRequest, ListOciCacheUsersResponse>() {
                    @Override
                    public ListOciCacheUsersResponse apply(ListOciCacheUsersRequest request) {
                        return client.listOciCacheUsers(request);
                    }
                },
                new java.util.function.Function<
                        ListOciCacheUsersResponse,
                        java.util.List<com.oracle.bmc.redis.model.OciCacheUserSummary>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.redis.model.OciCacheUserSummary> apply(
                            ListOciCacheUsersResponse response) {
                        return response.getOciCacheUserCollection().getItems();
                    }
                });
    }
}

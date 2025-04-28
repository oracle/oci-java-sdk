/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.keymanagement;

import com.oracle.bmc.keymanagement.requests.*;
import com.oracle.bmc.keymanagement.responses.*;

/**
 * Collection of helper methods that can be used to provide an {@link java.lang.Iterable} interface
 * to any list operations of KmsHsmCluster where multiple pages of data may be fetched. Two styles
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
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: release")
public class KmsHsmClusterPaginators {
    private final KmsHsmCluster client;

    public KmsHsmClusterPaginators(KmsHsmCluster client) {
        this.client = client;
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the
     * listHsmClusters operation. This iterable will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses
     *     received from the service.
     */
    public Iterable<ListHsmClustersResponse> listHsmClustersResponseIterator(
            final ListHsmClustersRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListHsmClustersRequest.Builder, ListHsmClustersRequest, ListHsmClustersResponse>(
                new java.util.function.Supplier<ListHsmClustersRequest.Builder>() {
                    @Override
                    public ListHsmClustersRequest.Builder get() {
                        return ListHsmClustersRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListHsmClustersResponse, String>() {
                    @Override
                    public String apply(ListHsmClustersResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListHsmClustersRequest.Builder>,
                        ListHsmClustersRequest>() {
                    @Override
                    public ListHsmClustersRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListHsmClustersRequest.Builder>
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
                new java.util.function.Function<ListHsmClustersRequest, ListHsmClustersResponse>() {
                    @Override
                    public ListHsmClustersResponse apply(ListHsmClustersRequest request) {
                        return client.listHsmClusters(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link
     * com.oracle.bmc.keymanagement.model.HsmClusterSummary} objects contained in responses from the
     * listHsmClusters operation. This iterable will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link
     *     com.oracle.bmc.keymanagement.model.HsmClusterSummary} objects contained in responses
     *     received from the service.
     */
    public Iterable<com.oracle.bmc.keymanagement.model.HsmClusterSummary>
            listHsmClustersRecordIterator(final ListHsmClustersRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListHsmClustersRequest.Builder,
                ListHsmClustersRequest,
                ListHsmClustersResponse,
                com.oracle.bmc.keymanagement.model.HsmClusterSummary>(
                new java.util.function.Supplier<ListHsmClustersRequest.Builder>() {
                    @Override
                    public ListHsmClustersRequest.Builder get() {
                        return ListHsmClustersRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListHsmClustersResponse, String>() {
                    @Override
                    public String apply(ListHsmClustersResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListHsmClustersRequest.Builder>,
                        ListHsmClustersRequest>() {
                    @Override
                    public ListHsmClustersRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListHsmClustersRequest.Builder>
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
                new java.util.function.Function<ListHsmClustersRequest, ListHsmClustersResponse>() {
                    @Override
                    public ListHsmClustersResponse apply(ListHsmClustersRequest request) {
                        return client.listHsmClusters(request);
                    }
                },
                new java.util.function.Function<
                        ListHsmClustersResponse,
                        java.util.List<com.oracle.bmc.keymanagement.model.HsmClusterSummary>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.keymanagement.model.HsmClusterSummary>
                            apply(ListHsmClustersResponse response) {
                        return response.getHsmClusterCollection().getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the
     * listHsmPartitions operation. This iterable will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses
     *     received from the service.
     */
    public Iterable<ListHsmPartitionsResponse> listHsmPartitionsResponseIterator(
            final ListHsmPartitionsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListHsmPartitionsRequest.Builder,
                ListHsmPartitionsRequest,
                ListHsmPartitionsResponse>(
                new java.util.function.Supplier<ListHsmPartitionsRequest.Builder>() {
                    @Override
                    public ListHsmPartitionsRequest.Builder get() {
                        return ListHsmPartitionsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListHsmPartitionsResponse, String>() {
                    @Override
                    public String apply(ListHsmPartitionsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListHsmPartitionsRequest.Builder>,
                        ListHsmPartitionsRequest>() {
                    @Override
                    public ListHsmPartitionsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListHsmPartitionsRequest.Builder>
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
                        ListHsmPartitionsRequest, ListHsmPartitionsResponse>() {
                    @Override
                    public ListHsmPartitionsResponse apply(ListHsmPartitionsRequest request) {
                        return client.listHsmPartitions(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link
     * com.oracle.bmc.keymanagement.model.HsmPartitionSummary} objects contained in responses from
     * the listHsmPartitions operation. This iterable will fetch more data from the server as
     * needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link
     *     com.oracle.bmc.keymanagement.model.HsmPartitionSummary} objects contained in responses
     *     received from the service.
     */
    public Iterable<com.oracle.bmc.keymanagement.model.HsmPartitionSummary>
            listHsmPartitionsRecordIterator(final ListHsmPartitionsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListHsmPartitionsRequest.Builder,
                ListHsmPartitionsRequest,
                ListHsmPartitionsResponse,
                com.oracle.bmc.keymanagement.model.HsmPartitionSummary>(
                new java.util.function.Supplier<ListHsmPartitionsRequest.Builder>() {
                    @Override
                    public ListHsmPartitionsRequest.Builder get() {
                        return ListHsmPartitionsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListHsmPartitionsResponse, String>() {
                    @Override
                    public String apply(ListHsmPartitionsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListHsmPartitionsRequest.Builder>,
                        ListHsmPartitionsRequest>() {
                    @Override
                    public ListHsmPartitionsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListHsmPartitionsRequest.Builder>
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
                        ListHsmPartitionsRequest, ListHsmPartitionsResponse>() {
                    @Override
                    public ListHsmPartitionsResponse apply(ListHsmPartitionsRequest request) {
                        return client.listHsmPartitions(request);
                    }
                },
                new java.util.function.Function<
                        ListHsmPartitionsResponse,
                        java.util.List<com.oracle.bmc.keymanagement.model.HsmPartitionSummary>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.keymanagement.model.HsmPartitionSummary>
                            apply(ListHsmPartitionsResponse response) {
                        return response.getHsmPartitionCollection().getItems();
                    }
                });
    }
}

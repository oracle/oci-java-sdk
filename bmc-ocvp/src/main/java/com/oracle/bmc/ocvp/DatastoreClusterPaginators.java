/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.ocvp;

import com.oracle.bmc.ocvp.requests.*;
import com.oracle.bmc.ocvp.responses.*;

/**
 * Collection of helper methods that can be used to provide an {@link java.lang.Iterable} interface
 * to any list operations of DatastoreCluster where multiple pages of data may be fetched. Two
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
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20230701")
public class DatastoreClusterPaginators {
    private final DatastoreCluster client;

    public DatastoreClusterPaginators(DatastoreCluster client) {
        this.client = client;
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the
     * listDatastoreClusters operation. This iterable will fetch more data from the server as
     * needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses
     *     received from the service.
     */
    public Iterable<ListDatastoreClustersResponse> listDatastoreClustersResponseIterator(
            final ListDatastoreClustersRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListDatastoreClustersRequest.Builder,
                ListDatastoreClustersRequest,
                ListDatastoreClustersResponse>(
                new java.util.function.Supplier<ListDatastoreClustersRequest.Builder>() {
                    @Override
                    public ListDatastoreClustersRequest.Builder get() {
                        return ListDatastoreClustersRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListDatastoreClustersResponse, String>() {
                    @Override
                    public String apply(ListDatastoreClustersResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListDatastoreClustersRequest.Builder>,
                        ListDatastoreClustersRequest>() {
                    @Override
                    public ListDatastoreClustersRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListDatastoreClustersRequest.Builder>
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
                        ListDatastoreClustersRequest, ListDatastoreClustersResponse>() {
                    @Override
                    public ListDatastoreClustersResponse apply(
                            ListDatastoreClustersRequest request) {
                        return client.listDatastoreClusters(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link
     * com.oracle.bmc.ocvp.model.DatastoreClusterSummary} objects contained in responses from the
     * listDatastoreClusters operation. This iterable will fetch more data from the server as
     * needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link
     *     com.oracle.bmc.ocvp.model.DatastoreClusterSummary} objects contained in responses
     *     received from the service.
     */
    public Iterable<com.oracle.bmc.ocvp.model.DatastoreClusterSummary>
            listDatastoreClustersRecordIterator(final ListDatastoreClustersRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListDatastoreClustersRequest.Builder,
                ListDatastoreClustersRequest,
                ListDatastoreClustersResponse,
                com.oracle.bmc.ocvp.model.DatastoreClusterSummary>(
                new java.util.function.Supplier<ListDatastoreClustersRequest.Builder>() {
                    @Override
                    public ListDatastoreClustersRequest.Builder get() {
                        return ListDatastoreClustersRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListDatastoreClustersResponse, String>() {
                    @Override
                    public String apply(ListDatastoreClustersResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListDatastoreClustersRequest.Builder>,
                        ListDatastoreClustersRequest>() {
                    @Override
                    public ListDatastoreClustersRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListDatastoreClustersRequest.Builder>
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
                        ListDatastoreClustersRequest, ListDatastoreClustersResponse>() {
                    @Override
                    public ListDatastoreClustersResponse apply(
                            ListDatastoreClustersRequest request) {
                        return client.listDatastoreClusters(request);
                    }
                },
                new java.util.function.Function<
                        ListDatastoreClustersResponse,
                        java.util.List<com.oracle.bmc.ocvp.model.DatastoreClusterSummary>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.ocvp.model.DatastoreClusterSummary> apply(
                            ListDatastoreClustersResponse response) {
                        return response.getDatastoreClusterCollection().getItems();
                    }
                });
    }
}

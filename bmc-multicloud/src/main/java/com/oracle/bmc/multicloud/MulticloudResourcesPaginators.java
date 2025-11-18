/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.multicloud;

import com.oracle.bmc.multicloud.requests.*;
import com.oracle.bmc.multicloud.responses.*;

/**
 * Collection of helper methods that can be used to provide an {@link java.lang.Iterable} interface
 * to any list operations of MulticloudResources where multiple pages of data may be fetched. Two
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
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20180828")
public class MulticloudResourcesPaginators {
    private final MulticloudResources client;

    public MulticloudResourcesPaginators(MulticloudResources client) {
        this.client = client;
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the
     * listMulticloudResources operation. This iterable will fetch more data from the server as
     * needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses
     *     received from the service.
     */
    public Iterable<ListMulticloudResourcesResponse> listMulticloudResourcesResponseIterator(
            final ListMulticloudResourcesRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListMulticloudResourcesRequest.Builder,
                ListMulticloudResourcesRequest,
                ListMulticloudResourcesResponse>(
                new java.util.function.Supplier<ListMulticloudResourcesRequest.Builder>() {
                    @Override
                    public ListMulticloudResourcesRequest.Builder get() {
                        return ListMulticloudResourcesRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListMulticloudResourcesResponse, String>() {
                    @Override
                    public String apply(ListMulticloudResourcesResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListMulticloudResourcesRequest.Builder>,
                        ListMulticloudResourcesRequest>() {
                    @Override
                    public ListMulticloudResourcesRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListMulticloudResourcesRequest.Builder>
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
                        ListMulticloudResourcesRequest, ListMulticloudResourcesResponse>() {
                    @Override
                    public ListMulticloudResourcesResponse apply(
                            ListMulticloudResourcesRequest request) {
                        return client.listMulticloudResources(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link
     * com.oracle.bmc.multicloud.model.MulticloudResourceSummary} objects contained in responses
     * from the listMulticloudResources operation. This iterable will fetch more data from the
     * server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link
     *     com.oracle.bmc.multicloud.model.MulticloudResourceSummary} objects contained in responses
     *     received from the service.
     */
    public Iterable<com.oracle.bmc.multicloud.model.MulticloudResourceSummary>
            listMulticloudResourcesRecordIterator(final ListMulticloudResourcesRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListMulticloudResourcesRequest.Builder,
                ListMulticloudResourcesRequest,
                ListMulticloudResourcesResponse,
                com.oracle.bmc.multicloud.model.MulticloudResourceSummary>(
                new java.util.function.Supplier<ListMulticloudResourcesRequest.Builder>() {
                    @Override
                    public ListMulticloudResourcesRequest.Builder get() {
                        return ListMulticloudResourcesRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListMulticloudResourcesResponse, String>() {
                    @Override
                    public String apply(ListMulticloudResourcesResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListMulticloudResourcesRequest.Builder>,
                        ListMulticloudResourcesRequest>() {
                    @Override
                    public ListMulticloudResourcesRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListMulticloudResourcesRequest.Builder>
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
                        ListMulticloudResourcesRequest, ListMulticloudResourcesResponse>() {
                    @Override
                    public ListMulticloudResourcesResponse apply(
                            ListMulticloudResourcesRequest request) {
                        return client.listMulticloudResources(request);
                    }
                },
                new java.util.function.Function<
                        ListMulticloudResourcesResponse,
                        java.util.List<
                                com.oracle.bmc.multicloud.model.MulticloudResourceSummary>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.multicloud.model.MulticloudResourceSummary>
                            apply(ListMulticloudResourcesResponse response) {
                        return response.getMulticloudResourceCollection().getItems();
                    }
                });
    }
}

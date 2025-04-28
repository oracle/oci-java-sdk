/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.waas;

import com.oracle.bmc.waas.requests.*;
import com.oracle.bmc.waas.responses.*;

/**
 * Collection of helper methods that can be used to provide an {@link java.lang.Iterable} interface
 * to any list operations of Redirect where multiple pages of data may be fetched. Two styles of
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
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20181116")
public class RedirectPaginators {
    private final Redirect client;

    public RedirectPaginators(Redirect client) {
        this.client = client;
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the
     * listHttpRedirects operation. This iterable will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses
     *     received from the service.
     */
    public Iterable<ListHttpRedirectsResponse> listHttpRedirectsResponseIterator(
            final ListHttpRedirectsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListHttpRedirectsRequest.Builder,
                ListHttpRedirectsRequest,
                ListHttpRedirectsResponse>(
                new java.util.function.Supplier<ListHttpRedirectsRequest.Builder>() {
                    @Override
                    public ListHttpRedirectsRequest.Builder get() {
                        return ListHttpRedirectsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListHttpRedirectsResponse, String>() {
                    @Override
                    public String apply(ListHttpRedirectsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListHttpRedirectsRequest.Builder>,
                        ListHttpRedirectsRequest>() {
                    @Override
                    public ListHttpRedirectsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListHttpRedirectsRequest.Builder>
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
                        ListHttpRedirectsRequest, ListHttpRedirectsResponse>() {
                    @Override
                    public ListHttpRedirectsResponse apply(ListHttpRedirectsRequest request) {
                        return client.listHttpRedirects(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link
     * com.oracle.bmc.waas.model.HttpRedirectSummary} objects contained in responses from the
     * listHttpRedirects operation. This iterable will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link
     *     com.oracle.bmc.waas.model.HttpRedirectSummary} objects contained in responses received
     *     from the service.
     */
    public Iterable<com.oracle.bmc.waas.model.HttpRedirectSummary> listHttpRedirectsRecordIterator(
            final ListHttpRedirectsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListHttpRedirectsRequest.Builder,
                ListHttpRedirectsRequest,
                ListHttpRedirectsResponse,
                com.oracle.bmc.waas.model.HttpRedirectSummary>(
                new java.util.function.Supplier<ListHttpRedirectsRequest.Builder>() {
                    @Override
                    public ListHttpRedirectsRequest.Builder get() {
                        return ListHttpRedirectsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListHttpRedirectsResponse, String>() {
                    @Override
                    public String apply(ListHttpRedirectsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListHttpRedirectsRequest.Builder>,
                        ListHttpRedirectsRequest>() {
                    @Override
                    public ListHttpRedirectsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListHttpRedirectsRequest.Builder>
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
                        ListHttpRedirectsRequest, ListHttpRedirectsResponse>() {
                    @Override
                    public ListHttpRedirectsResponse apply(ListHttpRedirectsRequest request) {
                        return client.listHttpRedirects(request);
                    }
                },
                new java.util.function.Function<
                        ListHttpRedirectsResponse,
                        java.util.List<com.oracle.bmc.waas.model.HttpRedirectSummary>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.waas.model.HttpRedirectSummary> apply(
                            ListHttpRedirectsResponse response) {
                        return response.getItems();
                    }
                });
    }
}

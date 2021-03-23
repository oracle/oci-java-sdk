/**
 * Copyright (c) 2016, 2021, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.usageapi;

import com.oracle.bmc.usageapi.requests.*;
import com.oracle.bmc.usageapi.responses.*;

/**
 * Collection of helper methods that can be used to provide an {@link java.lang.Iterable} interface
 * to any list operations of Usageapi where multiple pages of data may be fetched.
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
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200107")
@lombok.RequiredArgsConstructor
public class UsageapiPaginators {
    private final Usageapi client;

    /**
     * Creates a new iterable which will iterate over the responses received from the listQueries operation. This iterable
     * will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses received from the service.
     */
    public Iterable<ListQueriesResponse> listQueriesResponseIterator(
            final ListQueriesRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListQueriesRequest.Builder, ListQueriesRequest, ListQueriesResponse>(
                new com.google.common.base.Supplier<ListQueriesRequest.Builder>() {
                    @Override
                    public ListQueriesRequest.Builder get() {
                        return ListQueriesRequest.builder().copy(request);
                    }
                },
                new com.google.common.base.Function<ListQueriesResponse, String>() {
                    @Override
                    public String apply(ListQueriesResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new com.google.common.base.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListQueriesRequest.Builder>,
                        ListQueriesRequest>() {
                    @Override
                    public ListQueriesRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListQueriesRequest.Builder>
                                    input) {
                        if (input.getToken() == null) {
                            return input.getRequestBuilder().build();
                        } else {
                            return input.getRequestBuilder()
                                    .page(input.getToken().orNull())
                                    .build();
                        }
                    }
                },
                new com.google.common.base.Function<ListQueriesRequest, ListQueriesResponse>() {
                    @Override
                    public ListQueriesResponse apply(ListQueriesRequest request) {
                        return client.listQueries(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link com.oracle.bmc.usageapi.model.QuerySummary} objects
     * contained in responses from the listQueries operation. This iterable will fetch more data from the
     * server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link com.oracle.bmc.usageapi.model.QuerySummary} objects
     * contained in responses received from the service.
     */
    public Iterable<com.oracle.bmc.usageapi.model.QuerySummary> listQueriesRecordIterator(
            final ListQueriesRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListQueriesRequest.Builder, ListQueriesRequest, ListQueriesResponse,
                com.oracle.bmc.usageapi.model.QuerySummary>(
                new com.google.common.base.Supplier<ListQueriesRequest.Builder>() {
                    @Override
                    public ListQueriesRequest.Builder get() {
                        return ListQueriesRequest.builder().copy(request);
                    }
                },
                new com.google.common.base.Function<ListQueriesResponse, String>() {
                    @Override
                    public String apply(ListQueriesResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new com.google.common.base.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListQueriesRequest.Builder>,
                        ListQueriesRequest>() {
                    @Override
                    public ListQueriesRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListQueriesRequest.Builder>
                                    input) {
                        if (input.getToken() == null) {
                            return input.getRequestBuilder().build();
                        } else {
                            return input.getRequestBuilder()
                                    .page(input.getToken().orNull())
                                    .build();
                        }
                    }
                },
                new com.google.common.base.Function<ListQueriesRequest, ListQueriesResponse>() {
                    @Override
                    public ListQueriesResponse apply(ListQueriesRequest request) {
                        return client.listQueries(request);
                    }
                },
                new com.google.common.base.Function<
                        ListQueriesResponse,
                        java.util.List<com.oracle.bmc.usageapi.model.QuerySummary>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.usageapi.model.QuerySummary> apply(
                            ListQueriesResponse response) {
                        return response.getQueryCollection().getItems();
                    }
                });
    }
}

/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.usage;

import com.oracle.bmc.usage.requests.*;
import com.oracle.bmc.usage.responses.*;

/**
 * Collection of helper methods that can be used to provide an {@link java.lang.Iterable} interface
 * to any list operations of Usagelimits where multiple pages of data may be fetched. Two styles of
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
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20190111")
public class UsagelimitsPaginators {
    private final Usagelimits client;

    public UsagelimitsPaginators(Usagelimits client) {
        this.client = client;
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the
     * listUsageLimits operation. This iterable will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses
     *     received from the service.
     */
    public Iterable<ListUsageLimitsResponse> listUsageLimitsResponseIterator(
            final ListUsageLimitsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListUsageLimitsRequest.Builder, ListUsageLimitsRequest, ListUsageLimitsResponse>(
                new java.util.function.Supplier<ListUsageLimitsRequest.Builder>() {
                    @Override
                    public ListUsageLimitsRequest.Builder get() {
                        return ListUsageLimitsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListUsageLimitsResponse, String>() {
                    @Override
                    public String apply(ListUsageLimitsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListUsageLimitsRequest.Builder>,
                        ListUsageLimitsRequest>() {
                    @Override
                    public ListUsageLimitsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListUsageLimitsRequest.Builder>
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
                new java.util.function.Function<ListUsageLimitsRequest, ListUsageLimitsResponse>() {
                    @Override
                    public ListUsageLimitsResponse apply(ListUsageLimitsRequest request) {
                        return client.listUsageLimits(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link
     * com.oracle.bmc.usage.model.UsageLimitSummary} objects contained in responses from the
     * listUsageLimits operation. This iterable will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link
     *     com.oracle.bmc.usage.model.UsageLimitSummary} objects contained in responses received
     *     from the service.
     */
    public Iterable<com.oracle.bmc.usage.model.UsageLimitSummary> listUsageLimitsRecordIterator(
            final ListUsageLimitsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListUsageLimitsRequest.Builder,
                ListUsageLimitsRequest,
                ListUsageLimitsResponse,
                com.oracle.bmc.usage.model.UsageLimitSummary>(
                new java.util.function.Supplier<ListUsageLimitsRequest.Builder>() {
                    @Override
                    public ListUsageLimitsRequest.Builder get() {
                        return ListUsageLimitsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListUsageLimitsResponse, String>() {
                    @Override
                    public String apply(ListUsageLimitsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListUsageLimitsRequest.Builder>,
                        ListUsageLimitsRequest>() {
                    @Override
                    public ListUsageLimitsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListUsageLimitsRequest.Builder>
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
                new java.util.function.Function<ListUsageLimitsRequest, ListUsageLimitsResponse>() {
                    @Override
                    public ListUsageLimitsResponse apply(ListUsageLimitsRequest request) {
                        return client.listUsageLimits(request);
                    }
                },
                new java.util.function.Function<
                        ListUsageLimitsResponse,
                        java.util.List<com.oracle.bmc.usage.model.UsageLimitSummary>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.usage.model.UsageLimitSummary> apply(
                            ListUsageLimitsResponse response) {
                        return response.getUsageLimitCollection().getItems();
                    }
                });
    }
}

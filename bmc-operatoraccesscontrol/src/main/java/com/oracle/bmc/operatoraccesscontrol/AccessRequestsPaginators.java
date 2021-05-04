/**
 * Copyright (c) 2016, 2021, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.operatoraccesscontrol;

import com.oracle.bmc.operatoraccesscontrol.requests.*;
import com.oracle.bmc.operatoraccesscontrol.responses.*;

/**
 * Collection of helper methods that can be used to provide an {@link java.lang.Iterable} interface
 * to any list operations of AccessRequests where multiple pages of data may be fetched.
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
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200630")
@lombok.RequiredArgsConstructor
public class AccessRequestsPaginators {
    private final AccessRequests client;

    /**
     * Creates a new iterable which will iterate over the responses received from the listAccessRequestHistories operation. This iterable
     * will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses received from the service.
     */
    public Iterable<ListAccessRequestHistoriesResponse> listAccessRequestHistoriesResponseIterator(
            final ListAccessRequestHistoriesRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListAccessRequestHistoriesRequest.Builder, ListAccessRequestHistoriesRequest,
                ListAccessRequestHistoriesResponse>(
                new com.google.common.base.Supplier<ListAccessRequestHistoriesRequest.Builder>() {
                    @Override
                    public ListAccessRequestHistoriesRequest.Builder get() {
                        return ListAccessRequestHistoriesRequest.builder().copy(request);
                    }
                },
                new com.google.common.base.Function<ListAccessRequestHistoriesResponse, String>() {
                    @Override
                    public String apply(ListAccessRequestHistoriesResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new com.google.common.base.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListAccessRequestHistoriesRequest.Builder>,
                        ListAccessRequestHistoriesRequest>() {
                    @Override
                    public ListAccessRequestHistoriesRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListAccessRequestHistoriesRequest.Builder>
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
                new com.google.common.base.Function<
                        ListAccessRequestHistoriesRequest, ListAccessRequestHistoriesResponse>() {
                    @Override
                    public ListAccessRequestHistoriesResponse apply(
                            ListAccessRequestHistoriesRequest request) {
                        return client.listAccessRequestHistories(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link com.oracle.bmc.operatoraccesscontrol.model.AccessRequestHistorySummary} objects
     * contained in responses from the listAccessRequestHistories operation. This iterable will fetch more data from the
     * server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link com.oracle.bmc.operatoraccesscontrol.model.AccessRequestHistorySummary} objects
     * contained in responses received from the service.
     */
    public Iterable<com.oracle.bmc.operatoraccesscontrol.model.AccessRequestHistorySummary>
            listAccessRequestHistoriesRecordIterator(
                    final ListAccessRequestHistoriesRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListAccessRequestHistoriesRequest.Builder, ListAccessRequestHistoriesRequest,
                ListAccessRequestHistoriesResponse,
                com.oracle.bmc.operatoraccesscontrol.model.AccessRequestHistorySummary>(
                new com.google.common.base.Supplier<ListAccessRequestHistoriesRequest.Builder>() {
                    @Override
                    public ListAccessRequestHistoriesRequest.Builder get() {
                        return ListAccessRequestHistoriesRequest.builder().copy(request);
                    }
                },
                new com.google.common.base.Function<ListAccessRequestHistoriesResponse, String>() {
                    @Override
                    public String apply(ListAccessRequestHistoriesResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new com.google.common.base.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListAccessRequestHistoriesRequest.Builder>,
                        ListAccessRequestHistoriesRequest>() {
                    @Override
                    public ListAccessRequestHistoriesRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListAccessRequestHistoriesRequest.Builder>
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
                new com.google.common.base.Function<
                        ListAccessRequestHistoriesRequest, ListAccessRequestHistoriesResponse>() {
                    @Override
                    public ListAccessRequestHistoriesResponse apply(
                            ListAccessRequestHistoriesRequest request) {
                        return client.listAccessRequestHistories(request);
                    }
                },
                new com.google.common.base.Function<
                        ListAccessRequestHistoriesResponse,
                        java.util.List<
                                com.oracle.bmc.operatoraccesscontrol.model
                                        .AccessRequestHistorySummary>>() {
                    @Override
                    public java.util.List<
                                    com.oracle.bmc.operatoraccesscontrol.model
                                            .AccessRequestHistorySummary>
                            apply(ListAccessRequestHistoriesResponse response) {
                        return response.getAccessRequestHistoryCollection().getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the listAccessRequests operation. This iterable
     * will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses received from the service.
     */
    public Iterable<ListAccessRequestsResponse> listAccessRequestsResponseIterator(
            final ListAccessRequestsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListAccessRequestsRequest.Builder, ListAccessRequestsRequest,
                ListAccessRequestsResponse>(
                new com.google.common.base.Supplier<ListAccessRequestsRequest.Builder>() {
                    @Override
                    public ListAccessRequestsRequest.Builder get() {
                        return ListAccessRequestsRequest.builder().copy(request);
                    }
                },
                new com.google.common.base.Function<ListAccessRequestsResponse, String>() {
                    @Override
                    public String apply(ListAccessRequestsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new com.google.common.base.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListAccessRequestsRequest.Builder>,
                        ListAccessRequestsRequest>() {
                    @Override
                    public ListAccessRequestsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListAccessRequestsRequest.Builder>
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
                new com.google.common.base.Function<
                        ListAccessRequestsRequest, ListAccessRequestsResponse>() {
                    @Override
                    public ListAccessRequestsResponse apply(ListAccessRequestsRequest request) {
                        return client.listAccessRequests(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link com.oracle.bmc.operatoraccesscontrol.model.AccessRequestSummary} objects
     * contained in responses from the listAccessRequests operation. This iterable will fetch more data from the
     * server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link com.oracle.bmc.operatoraccesscontrol.model.AccessRequestSummary} objects
     * contained in responses received from the service.
     */
    public Iterable<com.oracle.bmc.operatoraccesscontrol.model.AccessRequestSummary>
            listAccessRequestsRecordIterator(final ListAccessRequestsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListAccessRequestsRequest.Builder, ListAccessRequestsRequest,
                ListAccessRequestsResponse,
                com.oracle.bmc.operatoraccesscontrol.model.AccessRequestSummary>(
                new com.google.common.base.Supplier<ListAccessRequestsRequest.Builder>() {
                    @Override
                    public ListAccessRequestsRequest.Builder get() {
                        return ListAccessRequestsRequest.builder().copy(request);
                    }
                },
                new com.google.common.base.Function<ListAccessRequestsResponse, String>() {
                    @Override
                    public String apply(ListAccessRequestsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new com.google.common.base.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListAccessRequestsRequest.Builder>,
                        ListAccessRequestsRequest>() {
                    @Override
                    public ListAccessRequestsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListAccessRequestsRequest.Builder>
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
                new com.google.common.base.Function<
                        ListAccessRequestsRequest, ListAccessRequestsResponse>() {
                    @Override
                    public ListAccessRequestsResponse apply(ListAccessRequestsRequest request) {
                        return client.listAccessRequests(request);
                    }
                },
                new com.google.common.base.Function<
                        ListAccessRequestsResponse,
                        java.util.List<
                                com.oracle.bmc.operatoraccesscontrol.model
                                        .AccessRequestSummary>>() {
                    @Override
                    public java.util.List<
                                    com.oracle.bmc.operatoraccesscontrol.model.AccessRequestSummary>
                            apply(ListAccessRequestsResponse response) {
                        return response.getAccessRequestCollection().getItems();
                    }
                });
    }
}

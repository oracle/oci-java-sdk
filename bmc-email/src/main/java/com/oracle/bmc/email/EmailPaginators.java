/**
 * Copyright (c) 2016, 2020, Oracle and/or its affiliates. All rights reserved.
 */
package com.oracle.bmc.email;

import com.oracle.bmc.email.requests.*;
import com.oracle.bmc.email.responses.*;

/**
 * Collection of helper methods that can be used to provide an {@link java.lang.Iterable} interface
 * to any list operations of Email where multiple pages of data may be fetched.
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
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20170907")
@lombok.RequiredArgsConstructor
public class EmailPaginators {
    private final Email client;

    /**
     * Creates a new iterable which will iterate over the responses received from the listSenders operation. This iterable
     * will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses received from the service.
     */
    public Iterable<ListSendersResponse> listSendersResponseIterator(
            final ListSendersRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListSendersRequest.Builder, ListSendersRequest, ListSendersResponse>(
                new com.google.common.base.Supplier<ListSendersRequest.Builder>() {
                    @Override
                    public ListSendersRequest.Builder get() {
                        return ListSendersRequest.builder().copy(request);
                    }
                },
                new com.google.common.base.Function<ListSendersResponse, String>() {
                    @Override
                    public String apply(ListSendersResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new com.google.common.base.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListSendersRequest.Builder>,
                        ListSendersRequest>() {
                    @Override
                    public ListSendersRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListSendersRequest.Builder>
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
                new com.google.common.base.Function<ListSendersRequest, ListSendersResponse>() {
                    @Override
                    public ListSendersResponse apply(ListSendersRequest request) {
                        return client.listSenders(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link com.oracle.bmc.email.model.SenderSummary} objects
     * contained in responses from the listSenders operation. This iterable will fetch more data from the
     * server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link com.oracle.bmc.email.model.SenderSummary} objects
     * contained in responses received from the service.
     */
    public Iterable<com.oracle.bmc.email.model.SenderSummary> listSendersRecordIterator(
            final ListSendersRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListSendersRequest.Builder, ListSendersRequest, ListSendersResponse,
                com.oracle.bmc.email.model.SenderSummary>(
                new com.google.common.base.Supplier<ListSendersRequest.Builder>() {
                    @Override
                    public ListSendersRequest.Builder get() {
                        return ListSendersRequest.builder().copy(request);
                    }
                },
                new com.google.common.base.Function<ListSendersResponse, String>() {
                    @Override
                    public String apply(ListSendersResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new com.google.common.base.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListSendersRequest.Builder>,
                        ListSendersRequest>() {
                    @Override
                    public ListSendersRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListSendersRequest.Builder>
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
                new com.google.common.base.Function<ListSendersRequest, ListSendersResponse>() {
                    @Override
                    public ListSendersResponse apply(ListSendersRequest request) {
                        return client.listSenders(request);
                    }
                },
                new com.google.common.base.Function<
                        ListSendersResponse,
                        java.util.List<com.oracle.bmc.email.model.SenderSummary>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.email.model.SenderSummary> apply(
                            ListSendersResponse response) {
                        return response.getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the listSuppressions operation. This iterable
     * will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses received from the service.
     */
    public Iterable<ListSuppressionsResponse> listSuppressionsResponseIterator(
            final ListSuppressionsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListSuppressionsRequest.Builder, ListSuppressionsRequest, ListSuppressionsResponse>(
                new com.google.common.base.Supplier<ListSuppressionsRequest.Builder>() {
                    @Override
                    public ListSuppressionsRequest.Builder get() {
                        return ListSuppressionsRequest.builder().copy(request);
                    }
                },
                new com.google.common.base.Function<ListSuppressionsResponse, String>() {
                    @Override
                    public String apply(ListSuppressionsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new com.google.common.base.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListSuppressionsRequest.Builder>,
                        ListSuppressionsRequest>() {
                    @Override
                    public ListSuppressionsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListSuppressionsRequest.Builder>
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
                        ListSuppressionsRequest, ListSuppressionsResponse>() {
                    @Override
                    public ListSuppressionsResponse apply(ListSuppressionsRequest request) {
                        return client.listSuppressions(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link com.oracle.bmc.email.model.SuppressionSummary} objects
     * contained in responses from the listSuppressions operation. This iterable will fetch more data from the
     * server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link com.oracle.bmc.email.model.SuppressionSummary} objects
     * contained in responses received from the service.
     */
    public Iterable<com.oracle.bmc.email.model.SuppressionSummary> listSuppressionsRecordIterator(
            final ListSuppressionsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListSuppressionsRequest.Builder, ListSuppressionsRequest, ListSuppressionsResponse,
                com.oracle.bmc.email.model.SuppressionSummary>(
                new com.google.common.base.Supplier<ListSuppressionsRequest.Builder>() {
                    @Override
                    public ListSuppressionsRequest.Builder get() {
                        return ListSuppressionsRequest.builder().copy(request);
                    }
                },
                new com.google.common.base.Function<ListSuppressionsResponse, String>() {
                    @Override
                    public String apply(ListSuppressionsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new com.google.common.base.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListSuppressionsRequest.Builder>,
                        ListSuppressionsRequest>() {
                    @Override
                    public ListSuppressionsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListSuppressionsRequest.Builder>
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
                        ListSuppressionsRequest, ListSuppressionsResponse>() {
                    @Override
                    public ListSuppressionsResponse apply(ListSuppressionsRequest request) {
                        return client.listSuppressions(request);
                    }
                },
                new com.google.common.base.Function<
                        ListSuppressionsResponse,
                        java.util.List<com.oracle.bmc.email.model.SuppressionSummary>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.email.model.SuppressionSummary> apply(
                            ListSuppressionsResponse response) {
                        return response.getItems();
                    }
                });
    }
}

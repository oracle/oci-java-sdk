/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.limitsincrease;

import com.oracle.bmc.limitsincrease.requests.*;
import com.oracle.bmc.limitsincrease.responses.*;

/**
 * Collection of helper methods that can be used to provide an {@link java.lang.Iterable} interface
 * to any list operations of LimitsIncrease where multiple pages of data may be fetched.
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
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20251101")
public class LimitsIncreasePaginators {
    private final LimitsIncrease client;

    public LimitsIncreasePaginators(LimitsIncrease client) {
        this.client = client;
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the listLimitsIncreaseItemRequests operation. This iterable
     * will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses received from the service.
     */
    public Iterable<ListLimitsIncreaseItemRequestsResponse>
            listLimitsIncreaseItemRequestsResponseIterator(
                    final ListLimitsIncreaseItemRequestsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListLimitsIncreaseItemRequestsRequest.Builder,
                ListLimitsIncreaseItemRequestsRequest, ListLimitsIncreaseItemRequestsResponse>(
                new java.util.function.Supplier<ListLimitsIncreaseItemRequestsRequest.Builder>() {
                    @Override
                    public ListLimitsIncreaseItemRequestsRequest.Builder get() {
                        return ListLimitsIncreaseItemRequestsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListLimitsIncreaseItemRequestsResponse, String>() {
                    @Override
                    public String apply(ListLimitsIncreaseItemRequestsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListLimitsIncreaseItemRequestsRequest.Builder>,
                        ListLimitsIncreaseItemRequestsRequest>() {
                    @Override
                    public ListLimitsIncreaseItemRequestsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListLimitsIncreaseItemRequestsRequest.Builder>
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
                        ListLimitsIncreaseItemRequestsRequest,
                        ListLimitsIncreaseItemRequestsResponse>() {
                    @Override
                    public ListLimitsIncreaseItemRequestsResponse apply(
                            ListLimitsIncreaseItemRequestsRequest request) {
                        return client.listLimitsIncreaseItemRequests(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link com.oracle.bmc.limitsincrease.model.LimitsIncreaseItemRequestSummary} objects
     * contained in responses from the listLimitsIncreaseItemRequests operation. This iterable will fetch more data from the
     * server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link com.oracle.bmc.limitsincrease.model.LimitsIncreaseItemRequestSummary} objects
     * contained in responses received from the service.
     */
    public Iterable<com.oracle.bmc.limitsincrease.model.LimitsIncreaseItemRequestSummary>
            listLimitsIncreaseItemRequestsRecordIterator(
                    final ListLimitsIncreaseItemRequestsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListLimitsIncreaseItemRequestsRequest.Builder,
                ListLimitsIncreaseItemRequestsRequest, ListLimitsIncreaseItemRequestsResponse,
                com.oracle.bmc.limitsincrease.model.LimitsIncreaseItemRequestSummary>(
                new java.util.function.Supplier<ListLimitsIncreaseItemRequestsRequest.Builder>() {
                    @Override
                    public ListLimitsIncreaseItemRequestsRequest.Builder get() {
                        return ListLimitsIncreaseItemRequestsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListLimitsIncreaseItemRequestsResponse, String>() {
                    @Override
                    public String apply(ListLimitsIncreaseItemRequestsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListLimitsIncreaseItemRequestsRequest.Builder>,
                        ListLimitsIncreaseItemRequestsRequest>() {
                    @Override
                    public ListLimitsIncreaseItemRequestsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListLimitsIncreaseItemRequestsRequest.Builder>
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
                        ListLimitsIncreaseItemRequestsRequest,
                        ListLimitsIncreaseItemRequestsResponse>() {
                    @Override
                    public ListLimitsIncreaseItemRequestsResponse apply(
                            ListLimitsIncreaseItemRequestsRequest request) {
                        return client.listLimitsIncreaseItemRequests(request);
                    }
                },
                new java.util.function.Function<
                        ListLimitsIncreaseItemRequestsResponse,
                        java.util.List<
                                com.oracle.bmc.limitsincrease.model
                                        .LimitsIncreaseItemRequestSummary>>() {
                    @Override
                    public java.util.List<
                                    com.oracle.bmc.limitsincrease.model
                                            .LimitsIncreaseItemRequestSummary>
                            apply(ListLimitsIncreaseItemRequestsResponse response) {
                        return response.getLimitsIncreaseItemRequestCollection().getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the listLimitsIncreaseQuestions operation. This iterable
     * will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses received from the service.
     */
    public Iterable<ListLimitsIncreaseQuestionsResponse>
            listLimitsIncreaseQuestionsResponseIterator(
                    final ListLimitsIncreaseQuestionsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListLimitsIncreaseQuestionsRequest.Builder, ListLimitsIncreaseQuestionsRequest,
                ListLimitsIncreaseQuestionsResponse>(
                new java.util.function.Supplier<ListLimitsIncreaseQuestionsRequest.Builder>() {
                    @Override
                    public ListLimitsIncreaseQuestionsRequest.Builder get() {
                        return ListLimitsIncreaseQuestionsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListLimitsIncreaseQuestionsResponse, String>() {
                    @Override
                    public String apply(ListLimitsIncreaseQuestionsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListLimitsIncreaseQuestionsRequest.Builder>,
                        ListLimitsIncreaseQuestionsRequest>() {
                    @Override
                    public ListLimitsIncreaseQuestionsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListLimitsIncreaseQuestionsRequest.Builder>
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
                        ListLimitsIncreaseQuestionsRequest, ListLimitsIncreaseQuestionsResponse>() {
                    @Override
                    public ListLimitsIncreaseQuestionsResponse apply(
                            ListLimitsIncreaseQuestionsRequest request) {
                        return client.listLimitsIncreaseQuestions(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link com.oracle.bmc.limitsincrease.model.LimitsIncreaseQuestionSummary} objects
     * contained in responses from the listLimitsIncreaseQuestions operation. This iterable will fetch more data from the
     * server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link com.oracle.bmc.limitsincrease.model.LimitsIncreaseQuestionSummary} objects
     * contained in responses received from the service.
     */
    public Iterable<com.oracle.bmc.limitsincrease.model.LimitsIncreaseQuestionSummary>
            listLimitsIncreaseQuestionsRecordIterator(
                    final ListLimitsIncreaseQuestionsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListLimitsIncreaseQuestionsRequest.Builder, ListLimitsIncreaseQuestionsRequest,
                ListLimitsIncreaseQuestionsResponse,
                com.oracle.bmc.limitsincrease.model.LimitsIncreaseQuestionSummary>(
                new java.util.function.Supplier<ListLimitsIncreaseQuestionsRequest.Builder>() {
                    @Override
                    public ListLimitsIncreaseQuestionsRequest.Builder get() {
                        return ListLimitsIncreaseQuestionsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListLimitsIncreaseQuestionsResponse, String>() {
                    @Override
                    public String apply(ListLimitsIncreaseQuestionsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListLimitsIncreaseQuestionsRequest.Builder>,
                        ListLimitsIncreaseQuestionsRequest>() {
                    @Override
                    public ListLimitsIncreaseQuestionsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListLimitsIncreaseQuestionsRequest.Builder>
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
                        ListLimitsIncreaseQuestionsRequest, ListLimitsIncreaseQuestionsResponse>() {
                    @Override
                    public ListLimitsIncreaseQuestionsResponse apply(
                            ListLimitsIncreaseQuestionsRequest request) {
                        return client.listLimitsIncreaseQuestions(request);
                    }
                },
                new java.util.function.Function<
                        ListLimitsIncreaseQuestionsResponse,
                        java.util.List<
                                com.oracle.bmc.limitsincrease.model
                                        .LimitsIncreaseQuestionSummary>>() {
                    @Override
                    public java.util.List<
                                    com.oracle.bmc.limitsincrease.model
                                            .LimitsIncreaseQuestionSummary>
                            apply(ListLimitsIncreaseQuestionsResponse response) {
                        return response.getLimitsIncreaseQuestionCollection().getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the listLimitsIncreaseRequests operation. This iterable
     * will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses received from the service.
     */
    public Iterable<ListLimitsIncreaseRequestsResponse> listLimitsIncreaseRequestsResponseIterator(
            final ListLimitsIncreaseRequestsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListLimitsIncreaseRequestsRequest.Builder, ListLimitsIncreaseRequestsRequest,
                ListLimitsIncreaseRequestsResponse>(
                new java.util.function.Supplier<ListLimitsIncreaseRequestsRequest.Builder>() {
                    @Override
                    public ListLimitsIncreaseRequestsRequest.Builder get() {
                        return ListLimitsIncreaseRequestsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListLimitsIncreaseRequestsResponse, String>() {
                    @Override
                    public String apply(ListLimitsIncreaseRequestsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListLimitsIncreaseRequestsRequest.Builder>,
                        ListLimitsIncreaseRequestsRequest>() {
                    @Override
                    public ListLimitsIncreaseRequestsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListLimitsIncreaseRequestsRequest.Builder>
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
                        ListLimitsIncreaseRequestsRequest, ListLimitsIncreaseRequestsResponse>() {
                    @Override
                    public ListLimitsIncreaseRequestsResponse apply(
                            ListLimitsIncreaseRequestsRequest request) {
                        return client.listLimitsIncreaseRequests(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link com.oracle.bmc.limitsincrease.model.LimitsIncreaseRequestSummary} objects
     * contained in responses from the listLimitsIncreaseRequests operation. This iterable will fetch more data from the
     * server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link com.oracle.bmc.limitsincrease.model.LimitsIncreaseRequestSummary} objects
     * contained in responses received from the service.
     */
    public Iterable<com.oracle.bmc.limitsincrease.model.LimitsIncreaseRequestSummary>
            listLimitsIncreaseRequestsRecordIterator(
                    final ListLimitsIncreaseRequestsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListLimitsIncreaseRequestsRequest.Builder, ListLimitsIncreaseRequestsRequest,
                ListLimitsIncreaseRequestsResponse,
                com.oracle.bmc.limitsincrease.model.LimitsIncreaseRequestSummary>(
                new java.util.function.Supplier<ListLimitsIncreaseRequestsRequest.Builder>() {
                    @Override
                    public ListLimitsIncreaseRequestsRequest.Builder get() {
                        return ListLimitsIncreaseRequestsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListLimitsIncreaseRequestsResponse, String>() {
                    @Override
                    public String apply(ListLimitsIncreaseRequestsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListLimitsIncreaseRequestsRequest.Builder>,
                        ListLimitsIncreaseRequestsRequest>() {
                    @Override
                    public ListLimitsIncreaseRequestsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListLimitsIncreaseRequestsRequest.Builder>
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
                        ListLimitsIncreaseRequestsRequest, ListLimitsIncreaseRequestsResponse>() {
                    @Override
                    public ListLimitsIncreaseRequestsResponse apply(
                            ListLimitsIncreaseRequestsRequest request) {
                        return client.listLimitsIncreaseRequests(request);
                    }
                },
                new java.util.function.Function<
                        ListLimitsIncreaseRequestsResponse,
                        java.util.List<
                                com.oracle.bmc.limitsincrease.model
                                        .LimitsIncreaseRequestSummary>>() {
                    @Override
                    public java.util.List<
                                    com.oracle.bmc.limitsincrease.model
                                            .LimitsIncreaseRequestSummary>
                            apply(ListLimitsIncreaseRequestsResponse response) {
                        return response.getLimitsIncreaseRequestCollection().getItems();
                    }
                });
    }
}

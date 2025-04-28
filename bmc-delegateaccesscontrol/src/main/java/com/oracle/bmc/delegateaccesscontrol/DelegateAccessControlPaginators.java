/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.delegateaccesscontrol;

import com.oracle.bmc.delegateaccesscontrol.requests.*;
import com.oracle.bmc.delegateaccesscontrol.responses.*;

/**
 * Collection of helper methods that can be used to provide an {@link java.lang.Iterable} interface
 * to any list operations of DelegateAccessControl where multiple pages of data may be fetched. Two
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
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20230801")
public class DelegateAccessControlPaginators {
    private final DelegateAccessControl client;

    public DelegateAccessControlPaginators(DelegateAccessControl client) {
        this.client = client;
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the
     * listDelegatedResourceAccessRequestHistories operation. This iterable will fetch more data
     * from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses
     *     received from the service.
     */
    public Iterable<ListDelegatedResourceAccessRequestHistoriesResponse>
            listDelegatedResourceAccessRequestHistoriesResponseIterator(
                    final ListDelegatedResourceAccessRequestHistoriesRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListDelegatedResourceAccessRequestHistoriesRequest.Builder,
                ListDelegatedResourceAccessRequestHistoriesRequest,
                ListDelegatedResourceAccessRequestHistoriesResponse>(
                new java.util.function.Supplier<
                        ListDelegatedResourceAccessRequestHistoriesRequest.Builder>() {
                    @Override
                    public ListDelegatedResourceAccessRequestHistoriesRequest.Builder get() {
                        return ListDelegatedResourceAccessRequestHistoriesRequest.builder()
                                .copy(request);
                    }
                },
                new java.util.function.Function<
                        ListDelegatedResourceAccessRequestHistoriesResponse, String>() {
                    @Override
                    public String apply(
                            ListDelegatedResourceAccessRequestHistoriesResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListDelegatedResourceAccessRequestHistoriesRequest.Builder>,
                        ListDelegatedResourceAccessRequestHistoriesRequest>() {
                    @Override
                    public ListDelegatedResourceAccessRequestHistoriesRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListDelegatedResourceAccessRequestHistoriesRequest
                                                    .Builder>
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
                        ListDelegatedResourceAccessRequestHistoriesRequest,
                        ListDelegatedResourceAccessRequestHistoriesResponse>() {
                    @Override
                    public ListDelegatedResourceAccessRequestHistoriesResponse apply(
                            ListDelegatedResourceAccessRequestHistoriesRequest request) {
                        return client.listDelegatedResourceAccessRequestHistories(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link
     * com.oracle.bmc.delegateaccesscontrol.model.DelegatedResourceAccessRequestHistorySummary}
     * objects contained in responses from the listDelegatedResourceAccessRequestHistories
     * operation. This iterable will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link
     *     com.oracle.bmc.delegateaccesscontrol.model.DelegatedResourceAccessRequestHistorySummary}
     *     objects contained in responses received from the service.
     */
    public Iterable<
                    com.oracle.bmc.delegateaccesscontrol.model
                            .DelegatedResourceAccessRequestHistorySummary>
            listDelegatedResourceAccessRequestHistoriesRecordIterator(
                    final ListDelegatedResourceAccessRequestHistoriesRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListDelegatedResourceAccessRequestHistoriesRequest.Builder,
                ListDelegatedResourceAccessRequestHistoriesRequest,
                ListDelegatedResourceAccessRequestHistoriesResponse,
                com.oracle.bmc.delegateaccesscontrol.model
                        .DelegatedResourceAccessRequestHistorySummary>(
                new java.util.function.Supplier<
                        ListDelegatedResourceAccessRequestHistoriesRequest.Builder>() {
                    @Override
                    public ListDelegatedResourceAccessRequestHistoriesRequest.Builder get() {
                        return ListDelegatedResourceAccessRequestHistoriesRequest.builder()
                                .copy(request);
                    }
                },
                new java.util.function.Function<
                        ListDelegatedResourceAccessRequestHistoriesResponse, String>() {
                    @Override
                    public String apply(
                            ListDelegatedResourceAccessRequestHistoriesResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListDelegatedResourceAccessRequestHistoriesRequest.Builder>,
                        ListDelegatedResourceAccessRequestHistoriesRequest>() {
                    @Override
                    public ListDelegatedResourceAccessRequestHistoriesRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListDelegatedResourceAccessRequestHistoriesRequest
                                                    .Builder>
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
                        ListDelegatedResourceAccessRequestHistoriesRequest,
                        ListDelegatedResourceAccessRequestHistoriesResponse>() {
                    @Override
                    public ListDelegatedResourceAccessRequestHistoriesResponse apply(
                            ListDelegatedResourceAccessRequestHistoriesRequest request) {
                        return client.listDelegatedResourceAccessRequestHistories(request);
                    }
                },
                new java.util.function.Function<
                        ListDelegatedResourceAccessRequestHistoriesResponse,
                        java.util.List<
                                com.oracle.bmc.delegateaccesscontrol.model
                                        .DelegatedResourceAccessRequestHistorySummary>>() {
                    @Override
                    public java.util.List<
                                    com.oracle.bmc.delegateaccesscontrol.model
                                            .DelegatedResourceAccessRequestHistorySummary>
                            apply(ListDelegatedResourceAccessRequestHistoriesResponse response) {
                        return response.getDelegatedResourceAccessRequestHistoryCollection()
                                .getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the
     * listDelegatedResourceAccessRequests operation. This iterable will fetch more data from the
     * server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses
     *     received from the service.
     */
    public Iterable<ListDelegatedResourceAccessRequestsResponse>
            listDelegatedResourceAccessRequestsResponseIterator(
                    final ListDelegatedResourceAccessRequestsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListDelegatedResourceAccessRequestsRequest.Builder,
                ListDelegatedResourceAccessRequestsRequest,
                ListDelegatedResourceAccessRequestsResponse>(
                new java.util.function.Supplier<
                        ListDelegatedResourceAccessRequestsRequest.Builder>() {
                    @Override
                    public ListDelegatedResourceAccessRequestsRequest.Builder get() {
                        return ListDelegatedResourceAccessRequestsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<
                        ListDelegatedResourceAccessRequestsResponse, String>() {
                    @Override
                    public String apply(ListDelegatedResourceAccessRequestsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListDelegatedResourceAccessRequestsRequest.Builder>,
                        ListDelegatedResourceAccessRequestsRequest>() {
                    @Override
                    public ListDelegatedResourceAccessRequestsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListDelegatedResourceAccessRequestsRequest.Builder>
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
                        ListDelegatedResourceAccessRequestsRequest,
                        ListDelegatedResourceAccessRequestsResponse>() {
                    @Override
                    public ListDelegatedResourceAccessRequestsResponse apply(
                            ListDelegatedResourceAccessRequestsRequest request) {
                        return client.listDelegatedResourceAccessRequests(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link
     * com.oracle.bmc.delegateaccesscontrol.model.DelegatedResourceAccessRequestSummary} objects
     * contained in responses from the listDelegatedResourceAccessRequests operation. This iterable
     * will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link
     *     com.oracle.bmc.delegateaccesscontrol.model.DelegatedResourceAccessRequestSummary} objects
     *     contained in responses received from the service.
     */
    public Iterable<
                    com.oracle.bmc.delegateaccesscontrol.model
                            .DelegatedResourceAccessRequestSummary>
            listDelegatedResourceAccessRequestsRecordIterator(
                    final ListDelegatedResourceAccessRequestsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListDelegatedResourceAccessRequestsRequest.Builder,
                ListDelegatedResourceAccessRequestsRequest,
                ListDelegatedResourceAccessRequestsResponse,
                com.oracle.bmc.delegateaccesscontrol.model.DelegatedResourceAccessRequestSummary>(
                new java.util.function.Supplier<
                        ListDelegatedResourceAccessRequestsRequest.Builder>() {
                    @Override
                    public ListDelegatedResourceAccessRequestsRequest.Builder get() {
                        return ListDelegatedResourceAccessRequestsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<
                        ListDelegatedResourceAccessRequestsResponse, String>() {
                    @Override
                    public String apply(ListDelegatedResourceAccessRequestsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListDelegatedResourceAccessRequestsRequest.Builder>,
                        ListDelegatedResourceAccessRequestsRequest>() {
                    @Override
                    public ListDelegatedResourceAccessRequestsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListDelegatedResourceAccessRequestsRequest.Builder>
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
                        ListDelegatedResourceAccessRequestsRequest,
                        ListDelegatedResourceAccessRequestsResponse>() {
                    @Override
                    public ListDelegatedResourceAccessRequestsResponse apply(
                            ListDelegatedResourceAccessRequestsRequest request) {
                        return client.listDelegatedResourceAccessRequests(request);
                    }
                },
                new java.util.function.Function<
                        ListDelegatedResourceAccessRequestsResponse,
                        java.util.List<
                                com.oracle.bmc.delegateaccesscontrol.model
                                        .DelegatedResourceAccessRequestSummary>>() {
                    @Override
                    public java.util.List<
                                    com.oracle.bmc.delegateaccesscontrol.model
                                            .DelegatedResourceAccessRequestSummary>
                            apply(ListDelegatedResourceAccessRequestsResponse response) {
                        return response.getDelegatedResourceAccessRequestSummaryCollection()
                                .getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the
     * listDelegationControlResources operation. This iterable will fetch more data from the server
     * as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses
     *     received from the service.
     */
    public Iterable<ListDelegationControlResourcesResponse>
            listDelegationControlResourcesResponseIterator(
                    final ListDelegationControlResourcesRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListDelegationControlResourcesRequest.Builder,
                ListDelegationControlResourcesRequest,
                ListDelegationControlResourcesResponse>(
                new java.util.function.Supplier<ListDelegationControlResourcesRequest.Builder>() {
                    @Override
                    public ListDelegationControlResourcesRequest.Builder get() {
                        return ListDelegationControlResourcesRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListDelegationControlResourcesResponse, String>() {
                    @Override
                    public String apply(ListDelegationControlResourcesResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListDelegationControlResourcesRequest.Builder>,
                        ListDelegationControlResourcesRequest>() {
                    @Override
                    public ListDelegationControlResourcesRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListDelegationControlResourcesRequest.Builder>
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
                        ListDelegationControlResourcesRequest,
                        ListDelegationControlResourcesResponse>() {
                    @Override
                    public ListDelegationControlResourcesResponse apply(
                            ListDelegationControlResourcesRequest request) {
                        return client.listDelegationControlResources(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link
     * com.oracle.bmc.delegateaccesscontrol.model.DelegationControlResourceSummary} objects
     * contained in responses from the listDelegationControlResources operation. This iterable will
     * fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link
     *     com.oracle.bmc.delegateaccesscontrol.model.DelegationControlResourceSummary} objects
     *     contained in responses received from the service.
     */
    public Iterable<com.oracle.bmc.delegateaccesscontrol.model.DelegationControlResourceSummary>
            listDelegationControlResourcesRecordIterator(
                    final ListDelegationControlResourcesRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListDelegationControlResourcesRequest.Builder,
                ListDelegationControlResourcesRequest,
                ListDelegationControlResourcesResponse,
                com.oracle.bmc.delegateaccesscontrol.model.DelegationControlResourceSummary>(
                new java.util.function.Supplier<ListDelegationControlResourcesRequest.Builder>() {
                    @Override
                    public ListDelegationControlResourcesRequest.Builder get() {
                        return ListDelegationControlResourcesRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListDelegationControlResourcesResponse, String>() {
                    @Override
                    public String apply(ListDelegationControlResourcesResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListDelegationControlResourcesRequest.Builder>,
                        ListDelegationControlResourcesRequest>() {
                    @Override
                    public ListDelegationControlResourcesRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListDelegationControlResourcesRequest.Builder>
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
                        ListDelegationControlResourcesRequest,
                        ListDelegationControlResourcesResponse>() {
                    @Override
                    public ListDelegationControlResourcesResponse apply(
                            ListDelegationControlResourcesRequest request) {
                        return client.listDelegationControlResources(request);
                    }
                },
                new java.util.function.Function<
                        ListDelegationControlResourcesResponse,
                        java.util.List<
                                com.oracle.bmc.delegateaccesscontrol.model
                                        .DelegationControlResourceSummary>>() {
                    @Override
                    public java.util.List<
                                    com.oracle.bmc.delegateaccesscontrol.model
                                            .DelegationControlResourceSummary>
                            apply(ListDelegationControlResourcesResponse response) {
                        return response.getDelegationControlResourceCollection().getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the
     * listDelegationControls operation. This iterable will fetch more data from the server as
     * needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses
     *     received from the service.
     */
    public Iterable<ListDelegationControlsResponse> listDelegationControlsResponseIterator(
            final ListDelegationControlsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListDelegationControlsRequest.Builder,
                ListDelegationControlsRequest,
                ListDelegationControlsResponse>(
                new java.util.function.Supplier<ListDelegationControlsRequest.Builder>() {
                    @Override
                    public ListDelegationControlsRequest.Builder get() {
                        return ListDelegationControlsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListDelegationControlsResponse, String>() {
                    @Override
                    public String apply(ListDelegationControlsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListDelegationControlsRequest.Builder>,
                        ListDelegationControlsRequest>() {
                    @Override
                    public ListDelegationControlsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListDelegationControlsRequest.Builder>
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
                        ListDelegationControlsRequest, ListDelegationControlsResponse>() {
                    @Override
                    public ListDelegationControlsResponse apply(
                            ListDelegationControlsRequest request) {
                        return client.listDelegationControls(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link
     * com.oracle.bmc.delegateaccesscontrol.model.DelegationControlSummary} objects contained in
     * responses from the listDelegationControls operation. This iterable will fetch more data from
     * the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link
     *     com.oracle.bmc.delegateaccesscontrol.model.DelegationControlSummary} objects contained in
     *     responses received from the service.
     */
    public Iterable<com.oracle.bmc.delegateaccesscontrol.model.DelegationControlSummary>
            listDelegationControlsRecordIterator(final ListDelegationControlsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListDelegationControlsRequest.Builder,
                ListDelegationControlsRequest,
                ListDelegationControlsResponse,
                com.oracle.bmc.delegateaccesscontrol.model.DelegationControlSummary>(
                new java.util.function.Supplier<ListDelegationControlsRequest.Builder>() {
                    @Override
                    public ListDelegationControlsRequest.Builder get() {
                        return ListDelegationControlsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListDelegationControlsResponse, String>() {
                    @Override
                    public String apply(ListDelegationControlsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListDelegationControlsRequest.Builder>,
                        ListDelegationControlsRequest>() {
                    @Override
                    public ListDelegationControlsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListDelegationControlsRequest.Builder>
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
                        ListDelegationControlsRequest, ListDelegationControlsResponse>() {
                    @Override
                    public ListDelegationControlsResponse apply(
                            ListDelegationControlsRequest request) {
                        return client.listDelegationControls(request);
                    }
                },
                new java.util.function.Function<
                        ListDelegationControlsResponse,
                        java.util.List<
                                com.oracle.bmc.delegateaccesscontrol.model
                                        .DelegationControlSummary>>() {
                    @Override
                    public java.util.List<
                                    com.oracle.bmc.delegateaccesscontrol.model
                                            .DelegationControlSummary>
                            apply(ListDelegationControlsResponse response) {
                        return response.getDelegationControlSummaryCollection().getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the
     * listDelegationSubscriptions operation. This iterable will fetch more data from the server as
     * needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses
     *     received from the service.
     */
    public Iterable<ListDelegationSubscriptionsResponse>
            listDelegationSubscriptionsResponseIterator(
                    final ListDelegationSubscriptionsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListDelegationSubscriptionsRequest.Builder,
                ListDelegationSubscriptionsRequest,
                ListDelegationSubscriptionsResponse>(
                new java.util.function.Supplier<ListDelegationSubscriptionsRequest.Builder>() {
                    @Override
                    public ListDelegationSubscriptionsRequest.Builder get() {
                        return ListDelegationSubscriptionsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListDelegationSubscriptionsResponse, String>() {
                    @Override
                    public String apply(ListDelegationSubscriptionsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListDelegationSubscriptionsRequest.Builder>,
                        ListDelegationSubscriptionsRequest>() {
                    @Override
                    public ListDelegationSubscriptionsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListDelegationSubscriptionsRequest.Builder>
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
                        ListDelegationSubscriptionsRequest, ListDelegationSubscriptionsResponse>() {
                    @Override
                    public ListDelegationSubscriptionsResponse apply(
                            ListDelegationSubscriptionsRequest request) {
                        return client.listDelegationSubscriptions(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link
     * com.oracle.bmc.delegateaccesscontrol.model.DelegationSubscriptionSummary} objects contained
     * in responses from the listDelegationSubscriptions operation. This iterable will fetch more
     * data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link
     *     com.oracle.bmc.delegateaccesscontrol.model.DelegationSubscriptionSummary} objects
     *     contained in responses received from the service.
     */
    public Iterable<com.oracle.bmc.delegateaccesscontrol.model.DelegationSubscriptionSummary>
            listDelegationSubscriptionsRecordIterator(
                    final ListDelegationSubscriptionsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListDelegationSubscriptionsRequest.Builder,
                ListDelegationSubscriptionsRequest,
                ListDelegationSubscriptionsResponse,
                com.oracle.bmc.delegateaccesscontrol.model.DelegationSubscriptionSummary>(
                new java.util.function.Supplier<ListDelegationSubscriptionsRequest.Builder>() {
                    @Override
                    public ListDelegationSubscriptionsRequest.Builder get() {
                        return ListDelegationSubscriptionsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListDelegationSubscriptionsResponse, String>() {
                    @Override
                    public String apply(ListDelegationSubscriptionsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListDelegationSubscriptionsRequest.Builder>,
                        ListDelegationSubscriptionsRequest>() {
                    @Override
                    public ListDelegationSubscriptionsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListDelegationSubscriptionsRequest.Builder>
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
                        ListDelegationSubscriptionsRequest, ListDelegationSubscriptionsResponse>() {
                    @Override
                    public ListDelegationSubscriptionsResponse apply(
                            ListDelegationSubscriptionsRequest request) {
                        return client.listDelegationSubscriptions(request);
                    }
                },
                new java.util.function.Function<
                        ListDelegationSubscriptionsResponse,
                        java.util.List<
                                com.oracle.bmc.delegateaccesscontrol.model
                                        .DelegationSubscriptionSummary>>() {
                    @Override
                    public java.util.List<
                                    com.oracle.bmc.delegateaccesscontrol.model
                                            .DelegationSubscriptionSummary>
                            apply(ListDelegationSubscriptionsResponse response) {
                        return response.getDelegationSubscriptionSummaryCollection().getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the
     * listServiceProviderActions operation. This iterable will fetch more data from the server as
     * needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses
     *     received from the service.
     */
    public Iterable<ListServiceProviderActionsResponse> listServiceProviderActionsResponseIterator(
            final ListServiceProviderActionsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListServiceProviderActionsRequest.Builder,
                ListServiceProviderActionsRequest,
                ListServiceProviderActionsResponse>(
                new java.util.function.Supplier<ListServiceProviderActionsRequest.Builder>() {
                    @Override
                    public ListServiceProviderActionsRequest.Builder get() {
                        return ListServiceProviderActionsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListServiceProviderActionsResponse, String>() {
                    @Override
                    public String apply(ListServiceProviderActionsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListServiceProviderActionsRequest.Builder>,
                        ListServiceProviderActionsRequest>() {
                    @Override
                    public ListServiceProviderActionsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListServiceProviderActionsRequest.Builder>
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
                        ListServiceProviderActionsRequest, ListServiceProviderActionsResponse>() {
                    @Override
                    public ListServiceProviderActionsResponse apply(
                            ListServiceProviderActionsRequest request) {
                        return client.listServiceProviderActions(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link
     * com.oracle.bmc.delegateaccesscontrol.model.ServiceProviderActionSummary} objects contained in
     * responses from the listServiceProviderActions operation. This iterable will fetch more data
     * from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link
     *     com.oracle.bmc.delegateaccesscontrol.model.ServiceProviderActionSummary} objects
     *     contained in responses received from the service.
     */
    public Iterable<com.oracle.bmc.delegateaccesscontrol.model.ServiceProviderActionSummary>
            listServiceProviderActionsRecordIterator(
                    final ListServiceProviderActionsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListServiceProviderActionsRequest.Builder,
                ListServiceProviderActionsRequest,
                ListServiceProviderActionsResponse,
                com.oracle.bmc.delegateaccesscontrol.model.ServiceProviderActionSummary>(
                new java.util.function.Supplier<ListServiceProviderActionsRequest.Builder>() {
                    @Override
                    public ListServiceProviderActionsRequest.Builder get() {
                        return ListServiceProviderActionsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListServiceProviderActionsResponse, String>() {
                    @Override
                    public String apply(ListServiceProviderActionsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListServiceProviderActionsRequest.Builder>,
                        ListServiceProviderActionsRequest>() {
                    @Override
                    public ListServiceProviderActionsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListServiceProviderActionsRequest.Builder>
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
                        ListServiceProviderActionsRequest, ListServiceProviderActionsResponse>() {
                    @Override
                    public ListServiceProviderActionsResponse apply(
                            ListServiceProviderActionsRequest request) {
                        return client.listServiceProviderActions(request);
                    }
                },
                new java.util.function.Function<
                        ListServiceProviderActionsResponse,
                        java.util.List<
                                com.oracle.bmc.delegateaccesscontrol.model
                                        .ServiceProviderActionSummary>>() {
                    @Override
                    public java.util.List<
                                    com.oracle.bmc.delegateaccesscontrol.model
                                            .ServiceProviderActionSummary>
                            apply(ListServiceProviderActionsResponse response) {
                        return response.getServiceProviderActionSummaryCollection().getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the
     * listServiceProviderInteractions operation. This iterable will fetch more data from the server
     * as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses
     *     received from the service.
     */
    public Iterable<ListServiceProviderInteractionsResponse>
            listServiceProviderInteractionsResponseIterator(
                    final ListServiceProviderInteractionsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListServiceProviderInteractionsRequest.Builder,
                ListServiceProviderInteractionsRequest,
                ListServiceProviderInteractionsResponse>(
                new java.util.function.Supplier<ListServiceProviderInteractionsRequest.Builder>() {
                    @Override
                    public ListServiceProviderInteractionsRequest.Builder get() {
                        return ListServiceProviderInteractionsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListServiceProviderInteractionsResponse, String>() {
                    @Override
                    public String apply(ListServiceProviderInteractionsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListServiceProviderInteractionsRequest.Builder>,
                        ListServiceProviderInteractionsRequest>() {
                    @Override
                    public ListServiceProviderInteractionsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListServiceProviderInteractionsRequest.Builder>
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
                        ListServiceProviderInteractionsRequest,
                        ListServiceProviderInteractionsResponse>() {
                    @Override
                    public ListServiceProviderInteractionsResponse apply(
                            ListServiceProviderInteractionsRequest request) {
                        return client.listServiceProviderInteractions(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link
     * com.oracle.bmc.delegateaccesscontrol.model.ServiceProviderInteractionSummary} objects
     * contained in responses from the listServiceProviderInteractions operation. This iterable will
     * fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link
     *     com.oracle.bmc.delegateaccesscontrol.model.ServiceProviderInteractionSummary} objects
     *     contained in responses received from the service.
     */
    public Iterable<com.oracle.bmc.delegateaccesscontrol.model.ServiceProviderInteractionSummary>
            listServiceProviderInteractionsRecordIterator(
                    final ListServiceProviderInteractionsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListServiceProviderInteractionsRequest.Builder,
                ListServiceProviderInteractionsRequest,
                ListServiceProviderInteractionsResponse,
                com.oracle.bmc.delegateaccesscontrol.model.ServiceProviderInteractionSummary>(
                new java.util.function.Supplier<ListServiceProviderInteractionsRequest.Builder>() {
                    @Override
                    public ListServiceProviderInteractionsRequest.Builder get() {
                        return ListServiceProviderInteractionsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListServiceProviderInteractionsResponse, String>() {
                    @Override
                    public String apply(ListServiceProviderInteractionsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListServiceProviderInteractionsRequest.Builder>,
                        ListServiceProviderInteractionsRequest>() {
                    @Override
                    public ListServiceProviderInteractionsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListServiceProviderInteractionsRequest.Builder>
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
                        ListServiceProviderInteractionsRequest,
                        ListServiceProviderInteractionsResponse>() {
                    @Override
                    public ListServiceProviderInteractionsResponse apply(
                            ListServiceProviderInteractionsRequest request) {
                        return client.listServiceProviderInteractions(request);
                    }
                },
                new java.util.function.Function<
                        ListServiceProviderInteractionsResponse,
                        java.util.List<
                                com.oracle.bmc.delegateaccesscontrol.model
                                        .ServiceProviderInteractionSummary>>() {
                    @Override
                    public java.util.List<
                                    com.oracle.bmc.delegateaccesscontrol.model
                                            .ServiceProviderInteractionSummary>
                            apply(ListServiceProviderInteractionsResponse response) {
                        return response.getServiceProviderInteractionCollection().getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the
     * listServiceProviders operation. This iterable will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses
     *     received from the service.
     */
    public Iterable<ListServiceProvidersResponse> listServiceProvidersResponseIterator(
            final ListServiceProvidersRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListServiceProvidersRequest.Builder,
                ListServiceProvidersRequest,
                ListServiceProvidersResponse>(
                new java.util.function.Supplier<ListServiceProvidersRequest.Builder>() {
                    @Override
                    public ListServiceProvidersRequest.Builder get() {
                        return ListServiceProvidersRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListServiceProvidersResponse, String>() {
                    @Override
                    public String apply(ListServiceProvidersResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListServiceProvidersRequest.Builder>,
                        ListServiceProvidersRequest>() {
                    @Override
                    public ListServiceProvidersRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListServiceProvidersRequest.Builder>
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
                        ListServiceProvidersRequest, ListServiceProvidersResponse>() {
                    @Override
                    public ListServiceProvidersResponse apply(ListServiceProvidersRequest request) {
                        return client.listServiceProviders(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link
     * com.oracle.bmc.delegateaccesscontrol.model.ServiceProviderSummary} objects contained in
     * responses from the listServiceProviders operation. This iterable will fetch more data from
     * the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link
     *     com.oracle.bmc.delegateaccesscontrol.model.ServiceProviderSummary} objects contained in
     *     responses received from the service.
     */
    public Iterable<com.oracle.bmc.delegateaccesscontrol.model.ServiceProviderSummary>
            listServiceProvidersRecordIterator(final ListServiceProvidersRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListServiceProvidersRequest.Builder,
                ListServiceProvidersRequest,
                ListServiceProvidersResponse,
                com.oracle.bmc.delegateaccesscontrol.model.ServiceProviderSummary>(
                new java.util.function.Supplier<ListServiceProvidersRequest.Builder>() {
                    @Override
                    public ListServiceProvidersRequest.Builder get() {
                        return ListServiceProvidersRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListServiceProvidersResponse, String>() {
                    @Override
                    public String apply(ListServiceProvidersResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListServiceProvidersRequest.Builder>,
                        ListServiceProvidersRequest>() {
                    @Override
                    public ListServiceProvidersRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListServiceProvidersRequest.Builder>
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
                        ListServiceProvidersRequest, ListServiceProvidersResponse>() {
                    @Override
                    public ListServiceProvidersResponse apply(ListServiceProvidersRequest request) {
                        return client.listServiceProviders(request);
                    }
                },
                new java.util.function.Function<
                        ListServiceProvidersResponse,
                        java.util.List<
                                com.oracle.bmc.delegateaccesscontrol.model
                                        .ServiceProviderSummary>>() {
                    @Override
                    public java.util.List<
                                    com.oracle.bmc.delegateaccesscontrol.model
                                            .ServiceProviderSummary>
                            apply(ListServiceProvidersResponse response) {
                        return response.getServiceProviderSummaryCollection().getItems();
                    }
                });
    }
}

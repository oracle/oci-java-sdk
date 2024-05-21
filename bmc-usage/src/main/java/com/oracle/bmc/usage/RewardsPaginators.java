/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.usage;

import com.oracle.bmc.usage.requests.*;
import com.oracle.bmc.usage.responses.*;

/**
 * Collection of helper methods that can be used to provide an {@link java.lang.Iterable} interface
 * to any list operations of Rewards where multiple pages of data may be fetched.
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
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20190111")
public class RewardsPaginators {
    private final Rewards client;

    public RewardsPaginators(Rewards client) {
        this.client = client;
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the listProducts operation. This iterable
     * will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses received from the service.
     */
    public Iterable<ListProductsResponse> listProductsResponseIterator(
            final ListProductsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListProductsRequest.Builder, ListProductsRequest, ListProductsResponse>(
                new java.util.function.Supplier<ListProductsRequest.Builder>() {
                    @Override
                    public ListProductsRequest.Builder get() {
                        return ListProductsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListProductsResponse, String>() {
                    @Override
                    public String apply(ListProductsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListProductsRequest.Builder>,
                        ListProductsRequest>() {
                    @Override
                    public ListProductsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListProductsRequest.Builder>
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
                new java.util.function.Function<ListProductsRequest, ListProductsResponse>() {
                    @Override
                    public ListProductsResponse apply(ListProductsRequest request) {
                        return client.listProducts(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link com.oracle.bmc.usage.model.ProductSummary} objects
     * contained in responses from the listProducts operation. This iterable will fetch more data from the
     * server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link com.oracle.bmc.usage.model.ProductSummary} objects
     * contained in responses received from the service.
     */
    public Iterable<com.oracle.bmc.usage.model.ProductSummary> listProductsRecordIterator(
            final ListProductsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListProductsRequest.Builder, ListProductsRequest, ListProductsResponse,
                com.oracle.bmc.usage.model.ProductSummary>(
                new java.util.function.Supplier<ListProductsRequest.Builder>() {
                    @Override
                    public ListProductsRequest.Builder get() {
                        return ListProductsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListProductsResponse, String>() {
                    @Override
                    public String apply(ListProductsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListProductsRequest.Builder>,
                        ListProductsRequest>() {
                    @Override
                    public ListProductsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListProductsRequest.Builder>
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
                new java.util.function.Function<ListProductsRequest, ListProductsResponse>() {
                    @Override
                    public ListProductsResponse apply(ListProductsRequest request) {
                        return client.listProducts(request);
                    }
                },
                new java.util.function.Function<
                        ListProductsResponse,
                        java.util.List<com.oracle.bmc.usage.model.ProductSummary>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.usage.model.ProductSummary> apply(
                            ListProductsResponse response) {
                        return response.getProductCollection().getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the listRedeemableUsers operation. This iterable
     * will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses received from the service.
     */
    public Iterable<ListRedeemableUsersResponse> listRedeemableUsersResponseIterator(
            final ListRedeemableUsersRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListRedeemableUsersRequest.Builder, ListRedeemableUsersRequest,
                ListRedeemableUsersResponse>(
                new java.util.function.Supplier<ListRedeemableUsersRequest.Builder>() {
                    @Override
                    public ListRedeemableUsersRequest.Builder get() {
                        return ListRedeemableUsersRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListRedeemableUsersResponse, String>() {
                    @Override
                    public String apply(ListRedeemableUsersResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListRedeemableUsersRequest.Builder>,
                        ListRedeemableUsersRequest>() {
                    @Override
                    public ListRedeemableUsersRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListRedeemableUsersRequest.Builder>
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
                        ListRedeemableUsersRequest, ListRedeemableUsersResponse>() {
                    @Override
                    public ListRedeemableUsersResponse apply(ListRedeemableUsersRequest request) {
                        return client.listRedeemableUsers(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link com.oracle.bmc.usage.model.RedeemableUserSummary} objects
     * contained in responses from the listRedeemableUsers operation. This iterable will fetch more data from the
     * server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link com.oracle.bmc.usage.model.RedeemableUserSummary} objects
     * contained in responses received from the service.
     */
    public Iterable<com.oracle.bmc.usage.model.RedeemableUserSummary>
            listRedeemableUsersRecordIterator(final ListRedeemableUsersRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListRedeemableUsersRequest.Builder, ListRedeemableUsersRequest,
                ListRedeemableUsersResponse, com.oracle.bmc.usage.model.RedeemableUserSummary>(
                new java.util.function.Supplier<ListRedeemableUsersRequest.Builder>() {
                    @Override
                    public ListRedeemableUsersRequest.Builder get() {
                        return ListRedeemableUsersRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListRedeemableUsersResponse, String>() {
                    @Override
                    public String apply(ListRedeemableUsersResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListRedeemableUsersRequest.Builder>,
                        ListRedeemableUsersRequest>() {
                    @Override
                    public ListRedeemableUsersRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListRedeemableUsersRequest.Builder>
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
                        ListRedeemableUsersRequest, ListRedeemableUsersResponse>() {
                    @Override
                    public ListRedeemableUsersResponse apply(ListRedeemableUsersRequest request) {
                        return client.listRedeemableUsers(request);
                    }
                },
                new java.util.function.Function<
                        ListRedeemableUsersResponse,
                        java.util.List<com.oracle.bmc.usage.model.RedeemableUserSummary>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.usage.model.RedeemableUserSummary> apply(
                            ListRedeemableUsersResponse response) {
                        return response.getRedeemableUserCollection().getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the listRedemptions operation. This iterable
     * will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses received from the service.
     */
    public Iterable<ListRedemptionsResponse> listRedemptionsResponseIterator(
            final ListRedemptionsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListRedemptionsRequest.Builder, ListRedemptionsRequest, ListRedemptionsResponse>(
                new java.util.function.Supplier<ListRedemptionsRequest.Builder>() {
                    @Override
                    public ListRedemptionsRequest.Builder get() {
                        return ListRedemptionsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListRedemptionsResponse, String>() {
                    @Override
                    public String apply(ListRedemptionsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListRedemptionsRequest.Builder>,
                        ListRedemptionsRequest>() {
                    @Override
                    public ListRedemptionsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListRedemptionsRequest.Builder>
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
                new java.util.function.Function<ListRedemptionsRequest, ListRedemptionsResponse>() {
                    @Override
                    public ListRedemptionsResponse apply(ListRedemptionsRequest request) {
                        return client.listRedemptions(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link com.oracle.bmc.usage.model.RedemptionSummary} objects
     * contained in responses from the listRedemptions operation. This iterable will fetch more data from the
     * server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link com.oracle.bmc.usage.model.RedemptionSummary} objects
     * contained in responses received from the service.
     */
    public Iterable<com.oracle.bmc.usage.model.RedemptionSummary> listRedemptionsRecordIterator(
            final ListRedemptionsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListRedemptionsRequest.Builder, ListRedemptionsRequest, ListRedemptionsResponse,
                com.oracle.bmc.usage.model.RedemptionSummary>(
                new java.util.function.Supplier<ListRedemptionsRequest.Builder>() {
                    @Override
                    public ListRedemptionsRequest.Builder get() {
                        return ListRedemptionsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListRedemptionsResponse, String>() {
                    @Override
                    public String apply(ListRedemptionsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListRedemptionsRequest.Builder>,
                        ListRedemptionsRequest>() {
                    @Override
                    public ListRedemptionsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListRedemptionsRequest.Builder>
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
                new java.util.function.Function<ListRedemptionsRequest, ListRedemptionsResponse>() {
                    @Override
                    public ListRedemptionsResponse apply(ListRedemptionsRequest request) {
                        return client.listRedemptions(request);
                    }
                },
                new java.util.function.Function<
                        ListRedemptionsResponse,
                        java.util.List<com.oracle.bmc.usage.model.RedemptionSummary>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.usage.model.RedemptionSummary> apply(
                            ListRedemptionsResponse response) {
                        return response.getRedemptionCollection().getItems();
                    }
                });
    }
}

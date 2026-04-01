/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.self;

import com.oracle.bmc.self.requests.*;
import com.oracle.bmc.self.responses.*;

/**
 * Collection of helper methods that can be used to provide an {@link java.lang.Iterable} interface
 * to any list operations of PartnerIntegeration where multiple pages of data may be fetched.
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
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260129")
public class PartnerIntegerationPaginators {
    private final PartnerIntegeration client;

    public PartnerIntegerationPaginators(PartnerIntegeration client) {
        this.client = client;
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the listingSubscriptions operation. This iterable
     * will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses received from the service.
     */
    public Iterable<ListingSubscriptionsResponse> listingSubscriptionsResponseIterator(
            final ListingSubscriptionsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListingSubscriptionsRequest.Builder, ListingSubscriptionsRequest,
                ListingSubscriptionsResponse>(
                new java.util.function.Supplier<ListingSubscriptionsRequest.Builder>() {
                    @Override
                    public ListingSubscriptionsRequest.Builder get() {
                        return ListingSubscriptionsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListingSubscriptionsResponse, String>() {
                    @Override
                    public String apply(ListingSubscriptionsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListingSubscriptionsRequest.Builder>,
                        ListingSubscriptionsRequest>() {
                    @Override
                    public ListingSubscriptionsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListingSubscriptionsRequest.Builder>
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
                        ListingSubscriptionsRequest, ListingSubscriptionsResponse>() {
                    @Override
                    public ListingSubscriptionsResponse apply(ListingSubscriptionsRequest request) {
                        return client.listingSubscriptions(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link com.oracle.bmc.self.model.ListingSubscriptionSummary} objects
     * contained in responses from the listingSubscriptions operation. This iterable will fetch more data from the
     * server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link com.oracle.bmc.self.model.ListingSubscriptionSummary} objects
     * contained in responses received from the service.
     */
    public Iterable<com.oracle.bmc.self.model.ListingSubscriptionSummary>
            listingSubscriptionsRecordIterator(final ListingSubscriptionsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListingSubscriptionsRequest.Builder, ListingSubscriptionsRequest,
                ListingSubscriptionsResponse, com.oracle.bmc.self.model.ListingSubscriptionSummary>(
                new java.util.function.Supplier<ListingSubscriptionsRequest.Builder>() {
                    @Override
                    public ListingSubscriptionsRequest.Builder get() {
                        return ListingSubscriptionsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListingSubscriptionsResponse, String>() {
                    @Override
                    public String apply(ListingSubscriptionsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListingSubscriptionsRequest.Builder>,
                        ListingSubscriptionsRequest>() {
                    @Override
                    public ListingSubscriptionsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListingSubscriptionsRequest.Builder>
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
                        ListingSubscriptionsRequest, ListingSubscriptionsResponse>() {
                    @Override
                    public ListingSubscriptionsResponse apply(ListingSubscriptionsRequest request) {
                        return client.listingSubscriptions(request);
                    }
                },
                new java.util.function.Function<
                        ListingSubscriptionsResponse,
                        java.util.List<com.oracle.bmc.self.model.ListingSubscriptionSummary>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.self.model.ListingSubscriptionSummary>
                            apply(ListingSubscriptionsResponse response) {
                        return response.getListingSubscriptionsCollection().getItems();
                    }
                });
    }
}

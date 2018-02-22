/**
 * Copyright (c) 2016, 2018, Oracle and/or its affiliates. All rights reserved.
 */
package com.oracle.bmc.dns;

import com.oracle.bmc.dns.requests.*;
import com.oracle.bmc.dns.responses.*;

/**
 * Collection of helper methods that can be used to provide an {@link java.lang.Iterable} interface
 * to any list operations of Dns where multiple pages of data may be fetched.
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
 * As an example, if we were using the ListUsers operation in IdentityService, then the {@link java.lang.Interable} returned by calling a
 * ResponseIterator method would iterate over the ListUsersResponse objects returned by each ListUsers call, whereas the {@link java.lang.Iterable}
 * returned by calling a RecordIterator method would iterate over the User records and we don't have to deal with ListUsersResponse objects at all.
 * In either case, pagination will be automatically handled so we can iterate until there are no more responses or no more resources/records available.
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20180115")
@lombok.RequiredArgsConstructor
public class DnsPaginators {
    private final Dns client;

    /**
     * Creates a new iterable which will iterate over the responses received from the listZones operation. This iterable
     * will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses received from the service.
     */
    public Iterable<ListZonesResponse> listZonesResponseIterator(final ListZonesRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListZonesRequest.Builder, ListZonesRequest, ListZonesResponse>(
                new com.google.common.base.Supplier<ListZonesRequest.Builder>() {
                    @Override
                    public ListZonesRequest.Builder get() {
                        return ListZonesRequest.builder().copy(request);
                    }
                },
                new com.google.common.base.Function<ListZonesResponse, String>() {
                    @Override
                    public String apply(ListZonesResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new com.google.common.base.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListZonesRequest.Builder>,
                        ListZonesRequest>() {
                    @Override
                    public ListZonesRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListZonesRequest.Builder>
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
                new com.google.common.base.Function<ListZonesRequest, ListZonesResponse>() {
                    @Override
                    public ListZonesResponse apply(ListZonesRequest request) {
                        return client.listZones(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link com.oracle.bmc.dns.model.ZoneSummary} objects
     * contained in responses from the listZones operation. This iterable will fetch more data from the
     * server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link com.oracle.bmc.dns.model.ZoneSummary} objects
     * contained in responses received from the service.
     */
    public Iterable<com.oracle.bmc.dns.model.ZoneSummary> listZonesRecordIterator(
            final ListZonesRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListZonesRequest.Builder, ListZonesRequest, ListZonesResponse,
                com.oracle.bmc.dns.model.ZoneSummary>(
                new com.google.common.base.Supplier<ListZonesRequest.Builder>() {
                    @Override
                    public ListZonesRequest.Builder get() {
                        return ListZonesRequest.builder().copy(request);
                    }
                },
                new com.google.common.base.Function<ListZonesResponse, String>() {
                    @Override
                    public String apply(ListZonesResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new com.google.common.base.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListZonesRequest.Builder>,
                        ListZonesRequest>() {
                    @Override
                    public ListZonesRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListZonesRequest.Builder>
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
                new com.google.common.base.Function<ListZonesRequest, ListZonesResponse>() {
                    @Override
                    public ListZonesResponse apply(ListZonesRequest request) {
                        return client.listZones(request);
                    }
                },
                new com.google.common.base.Function<
                        ListZonesResponse, java.util.List<com.oracle.bmc.dns.model.ZoneSummary>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.dns.model.ZoneSummary> apply(
                            ListZonesResponse response) {
                        return response.getItems();
                    }
                });
    }
}

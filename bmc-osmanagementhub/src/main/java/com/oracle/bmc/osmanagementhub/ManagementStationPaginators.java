/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.osmanagementhub;

import com.oracle.bmc.osmanagementhub.requests.*;
import com.oracle.bmc.osmanagementhub.responses.*;

/**
 * Collection of helper methods that can be used to provide an {@link java.lang.Iterable} interface
 * to any list operations of ManagementStation where multiple pages of data may be fetched.
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
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20220901")
public class ManagementStationPaginators {
    private final ManagementStation client;

    public ManagementStationPaginators(ManagementStation client) {
        this.client = client;
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the listManagementStations operation. This iterable
     * will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses received from the service.
     */
    public Iterable<ListManagementStationsResponse> listManagementStationsResponseIterator(
            final ListManagementStationsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListManagementStationsRequest.Builder, ListManagementStationsRequest,
                ListManagementStationsResponse>(
                new java.util.function.Supplier<ListManagementStationsRequest.Builder>() {
                    @Override
                    public ListManagementStationsRequest.Builder get() {
                        return ListManagementStationsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListManagementStationsResponse, String>() {
                    @Override
                    public String apply(ListManagementStationsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListManagementStationsRequest.Builder>,
                        ListManagementStationsRequest>() {
                    @Override
                    public ListManagementStationsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListManagementStationsRequest.Builder>
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
                        ListManagementStationsRequest, ListManagementStationsResponse>() {
                    @Override
                    public ListManagementStationsResponse apply(
                            ListManagementStationsRequest request) {
                        return client.listManagementStations(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link com.oracle.bmc.osmanagementhub.model.ManagementStationSummary} objects
     * contained in responses from the listManagementStations operation. This iterable will fetch more data from the
     * server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link com.oracle.bmc.osmanagementhub.model.ManagementStationSummary} objects
     * contained in responses received from the service.
     */
    public Iterable<com.oracle.bmc.osmanagementhub.model.ManagementStationSummary>
            listManagementStationsRecordIterator(final ListManagementStationsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListManagementStationsRequest.Builder, ListManagementStationsRequest,
                ListManagementStationsResponse,
                com.oracle.bmc.osmanagementhub.model.ManagementStationSummary>(
                new java.util.function.Supplier<ListManagementStationsRequest.Builder>() {
                    @Override
                    public ListManagementStationsRequest.Builder get() {
                        return ListManagementStationsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListManagementStationsResponse, String>() {
                    @Override
                    public String apply(ListManagementStationsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListManagementStationsRequest.Builder>,
                        ListManagementStationsRequest>() {
                    @Override
                    public ListManagementStationsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListManagementStationsRequest.Builder>
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
                        ListManagementStationsRequest, ListManagementStationsResponse>() {
                    @Override
                    public ListManagementStationsResponse apply(
                            ListManagementStationsRequest request) {
                        return client.listManagementStations(request);
                    }
                },
                new java.util.function.Function<
                        ListManagementStationsResponse,
                        java.util.List<
                                com.oracle.bmc.osmanagementhub.model.ManagementStationSummary>>() {
                    @Override
                    public java.util.List<
                                    com.oracle.bmc.osmanagementhub.model.ManagementStationSummary>
                            apply(ListManagementStationsResponse response) {
                        return response.getManagementStationCollection().getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the listMirrors operation. This iterable
     * will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses received from the service.
     */
    public Iterable<ListMirrorsResponse> listMirrorsResponseIterator(
            final ListMirrorsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListMirrorsRequest.Builder, ListMirrorsRequest, ListMirrorsResponse>(
                new java.util.function.Supplier<ListMirrorsRequest.Builder>() {
                    @Override
                    public ListMirrorsRequest.Builder get() {
                        return ListMirrorsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListMirrorsResponse, String>() {
                    @Override
                    public String apply(ListMirrorsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListMirrorsRequest.Builder>,
                        ListMirrorsRequest>() {
                    @Override
                    public ListMirrorsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListMirrorsRequest.Builder>
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
                new java.util.function.Function<ListMirrorsRequest, ListMirrorsResponse>() {
                    @Override
                    public ListMirrorsResponse apply(ListMirrorsRequest request) {
                        return client.listMirrors(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link com.oracle.bmc.osmanagementhub.model.MirrorSummary} objects
     * contained in responses from the listMirrors operation. This iterable will fetch more data from the
     * server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link com.oracle.bmc.osmanagementhub.model.MirrorSummary} objects
     * contained in responses received from the service.
     */
    public Iterable<com.oracle.bmc.osmanagementhub.model.MirrorSummary> listMirrorsRecordIterator(
            final ListMirrorsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListMirrorsRequest.Builder, ListMirrorsRequest, ListMirrorsResponse,
                com.oracle.bmc.osmanagementhub.model.MirrorSummary>(
                new java.util.function.Supplier<ListMirrorsRequest.Builder>() {
                    @Override
                    public ListMirrorsRequest.Builder get() {
                        return ListMirrorsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListMirrorsResponse, String>() {
                    @Override
                    public String apply(ListMirrorsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListMirrorsRequest.Builder>,
                        ListMirrorsRequest>() {
                    @Override
                    public ListMirrorsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListMirrorsRequest.Builder>
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
                new java.util.function.Function<ListMirrorsRequest, ListMirrorsResponse>() {
                    @Override
                    public ListMirrorsResponse apply(ListMirrorsRequest request) {
                        return client.listMirrors(request);
                    }
                },
                new java.util.function.Function<
                        ListMirrorsResponse,
                        java.util.List<com.oracle.bmc.osmanagementhub.model.MirrorSummary>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.osmanagementhub.model.MirrorSummary> apply(
                            ListMirrorsResponse response) {
                        return response.getMirrorsCollection().getItems();
                    }
                });
    }
}

/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.osmanagement;

import com.oracle.bmc.osmanagement.requests.*;
import com.oracle.bmc.osmanagement.responses.*;

/**
 * Collection of helper methods that can be used to provide an {@link java.lang.Iterable} interface
 * to any list operations of Event where multiple pages of data may be fetched.
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
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20190801")
public class EventPaginators {
    private final Event client;

    public EventPaginators(Event client) {
        this.client = client;
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the listEvents operation. This iterable
     * will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses received from the service.
     */
    public Iterable<ListEventsResponse> listEventsResponseIterator(
            final ListEventsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListEventsRequest.Builder, ListEventsRequest, ListEventsResponse>(
                new com.google.common.base.Supplier<ListEventsRequest.Builder>() {
                    @Override
                    public ListEventsRequest.Builder get() {
                        return ListEventsRequest.builder().copy(request);
                    }
                },
                new com.google.common.base.Function<ListEventsResponse, String>() {
                    @Override
                    public String apply(ListEventsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new com.google.common.base.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListEventsRequest.Builder>,
                        ListEventsRequest>() {
                    @Override
                    public ListEventsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListEventsRequest.Builder>
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
                new com.google.common.base.Function<ListEventsRequest, ListEventsResponse>() {
                    @Override
                    public ListEventsResponse apply(ListEventsRequest request) {
                        return client.listEvents(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link com.oracle.bmc.osmanagement.model.EventSummary} objects
     * contained in responses from the listEvents operation. This iterable will fetch more data from the
     * server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link com.oracle.bmc.osmanagement.model.EventSummary} objects
     * contained in responses received from the service.
     */
    public Iterable<com.oracle.bmc.osmanagement.model.EventSummary> listEventsRecordIterator(
            final ListEventsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListEventsRequest.Builder, ListEventsRequest, ListEventsResponse,
                com.oracle.bmc.osmanagement.model.EventSummary>(
                new com.google.common.base.Supplier<ListEventsRequest.Builder>() {
                    @Override
                    public ListEventsRequest.Builder get() {
                        return ListEventsRequest.builder().copy(request);
                    }
                },
                new com.google.common.base.Function<ListEventsResponse, String>() {
                    @Override
                    public String apply(ListEventsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new com.google.common.base.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListEventsRequest.Builder>,
                        ListEventsRequest>() {
                    @Override
                    public ListEventsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListEventsRequest.Builder>
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
                new com.google.common.base.Function<ListEventsRequest, ListEventsResponse>() {
                    @Override
                    public ListEventsResponse apply(ListEventsRequest request) {
                        return client.listEvents(request);
                    }
                },
                new com.google.common.base.Function<
                        ListEventsResponse,
                        java.util.List<com.oracle.bmc.osmanagement.model.EventSummary>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.osmanagement.model.EventSummary> apply(
                            ListEventsResponse response) {
                        return response.getEventCollection().getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the listRelatedEvents operation. This iterable
     * will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses received from the service.
     */
    public Iterable<ListRelatedEventsResponse> listRelatedEventsResponseIterator(
            final ListRelatedEventsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListRelatedEventsRequest.Builder, ListRelatedEventsRequest,
                ListRelatedEventsResponse>(
                new com.google.common.base.Supplier<ListRelatedEventsRequest.Builder>() {
                    @Override
                    public ListRelatedEventsRequest.Builder get() {
                        return ListRelatedEventsRequest.builder().copy(request);
                    }
                },
                new com.google.common.base.Function<ListRelatedEventsResponse, String>() {
                    @Override
                    public String apply(ListRelatedEventsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new com.google.common.base.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListRelatedEventsRequest.Builder>,
                        ListRelatedEventsRequest>() {
                    @Override
                    public ListRelatedEventsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListRelatedEventsRequest.Builder>
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
                        ListRelatedEventsRequest, ListRelatedEventsResponse>() {
                    @Override
                    public ListRelatedEventsResponse apply(ListRelatedEventsRequest request) {
                        return client.listRelatedEvents(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link com.oracle.bmc.osmanagement.model.RelatedEventSummary} objects
     * contained in responses from the listRelatedEvents operation. This iterable will fetch more data from the
     * server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link com.oracle.bmc.osmanagement.model.RelatedEventSummary} objects
     * contained in responses received from the service.
     */
    public Iterable<com.oracle.bmc.osmanagement.model.RelatedEventSummary>
            listRelatedEventsRecordIterator(final ListRelatedEventsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListRelatedEventsRequest.Builder, ListRelatedEventsRequest,
                ListRelatedEventsResponse, com.oracle.bmc.osmanagement.model.RelatedEventSummary>(
                new com.google.common.base.Supplier<ListRelatedEventsRequest.Builder>() {
                    @Override
                    public ListRelatedEventsRequest.Builder get() {
                        return ListRelatedEventsRequest.builder().copy(request);
                    }
                },
                new com.google.common.base.Function<ListRelatedEventsResponse, String>() {
                    @Override
                    public String apply(ListRelatedEventsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new com.google.common.base.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListRelatedEventsRequest.Builder>,
                        ListRelatedEventsRequest>() {
                    @Override
                    public ListRelatedEventsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListRelatedEventsRequest.Builder>
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
                        ListRelatedEventsRequest, ListRelatedEventsResponse>() {
                    @Override
                    public ListRelatedEventsResponse apply(ListRelatedEventsRequest request) {
                        return client.listRelatedEvents(request);
                    }
                },
                new com.google.common.base.Function<
                        ListRelatedEventsResponse,
                        java.util.List<com.oracle.bmc.osmanagement.model.RelatedEventSummary>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.osmanagement.model.RelatedEventSummary>
                            apply(ListRelatedEventsResponse response) {
                        return response.getRelatedEventCollection().getItems();
                    }
                });
    }
}

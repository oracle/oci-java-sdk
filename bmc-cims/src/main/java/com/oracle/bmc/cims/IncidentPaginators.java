/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.cims;

import com.oracle.bmc.cims.requests.*;
import com.oracle.bmc.cims.responses.*;

/**
 * Collection of helper methods that can be used to provide an {@link java.lang.Iterable} interface
 * to any list operations of Incident where multiple pages of data may be fetched.
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
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20181231")
public class IncidentPaginators {
    private final Incident client;

    public IncidentPaginators(Incident client) {
        this.client = client;
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the listIncidentResourceTypes operation. This iterable
     * will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses received from the service.
     */
    public Iterable<ListIncidentResourceTypesResponse> listIncidentResourceTypesResponseIterator(
            final ListIncidentResourceTypesRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListIncidentResourceTypesRequest.Builder, ListIncidentResourceTypesRequest,
                ListIncidentResourceTypesResponse>(
                new java.util.function.Supplier<ListIncidentResourceTypesRequest.Builder>() {
                    @Override
                    public ListIncidentResourceTypesRequest.Builder get() {
                        return ListIncidentResourceTypesRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListIncidentResourceTypesResponse, String>() {
                    @Override
                    public String apply(ListIncidentResourceTypesResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListIncidentResourceTypesRequest.Builder>,
                        ListIncidentResourceTypesRequest>() {
                    @Override
                    public ListIncidentResourceTypesRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListIncidentResourceTypesRequest.Builder>
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
                        ListIncidentResourceTypesRequest, ListIncidentResourceTypesResponse>() {
                    @Override
                    public ListIncidentResourceTypesResponse apply(
                            ListIncidentResourceTypesRequest request) {
                        return client.listIncidentResourceTypes(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link com.oracle.bmc.cims.model.IncidentResourceType} objects
     * contained in responses from the listIncidentResourceTypes operation. This iterable will fetch more data from the
     * server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link com.oracle.bmc.cims.model.IncidentResourceType} objects
     * contained in responses received from the service.
     */
    public Iterable<com.oracle.bmc.cims.model.IncidentResourceType>
            listIncidentResourceTypesRecordIterator(
                    final ListIncidentResourceTypesRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListIncidentResourceTypesRequest.Builder, ListIncidentResourceTypesRequest,
                ListIncidentResourceTypesResponse, com.oracle.bmc.cims.model.IncidentResourceType>(
                new java.util.function.Supplier<ListIncidentResourceTypesRequest.Builder>() {
                    @Override
                    public ListIncidentResourceTypesRequest.Builder get() {
                        return ListIncidentResourceTypesRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListIncidentResourceTypesResponse, String>() {
                    @Override
                    public String apply(ListIncidentResourceTypesResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListIncidentResourceTypesRequest.Builder>,
                        ListIncidentResourceTypesRequest>() {
                    @Override
                    public ListIncidentResourceTypesRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListIncidentResourceTypesRequest.Builder>
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
                        ListIncidentResourceTypesRequest, ListIncidentResourceTypesResponse>() {
                    @Override
                    public ListIncidentResourceTypesResponse apply(
                            ListIncidentResourceTypesRequest request) {
                        return client.listIncidentResourceTypes(request);
                    }
                },
                new java.util.function.Function<
                        ListIncidentResourceTypesResponse,
                        java.util.List<com.oracle.bmc.cims.model.IncidentResourceType>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.cims.model.IncidentResourceType> apply(
                            ListIncidentResourceTypesResponse response) {
                        return response.getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the listIncidents operation. This iterable
     * will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses received from the service.
     */
    public Iterable<ListIncidentsResponse> listIncidentsResponseIterator(
            final ListIncidentsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListIncidentsRequest.Builder, ListIncidentsRequest, ListIncidentsResponse>(
                new java.util.function.Supplier<ListIncidentsRequest.Builder>() {
                    @Override
                    public ListIncidentsRequest.Builder get() {
                        return ListIncidentsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListIncidentsResponse, String>() {
                    @Override
                    public String apply(ListIncidentsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListIncidentsRequest.Builder>,
                        ListIncidentsRequest>() {
                    @Override
                    public ListIncidentsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListIncidentsRequest.Builder>
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
                new java.util.function.Function<ListIncidentsRequest, ListIncidentsResponse>() {
                    @Override
                    public ListIncidentsResponse apply(ListIncidentsRequest request) {
                        return client.listIncidents(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link com.oracle.bmc.cims.model.IncidentSummary} objects
     * contained in responses from the listIncidents operation. This iterable will fetch more data from the
     * server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link com.oracle.bmc.cims.model.IncidentSummary} objects
     * contained in responses received from the service.
     */
    public Iterable<com.oracle.bmc.cims.model.IncidentSummary> listIncidentsRecordIterator(
            final ListIncidentsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListIncidentsRequest.Builder, ListIncidentsRequest, ListIncidentsResponse,
                com.oracle.bmc.cims.model.IncidentSummary>(
                new java.util.function.Supplier<ListIncidentsRequest.Builder>() {
                    @Override
                    public ListIncidentsRequest.Builder get() {
                        return ListIncidentsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListIncidentsResponse, String>() {
                    @Override
                    public String apply(ListIncidentsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListIncidentsRequest.Builder>,
                        ListIncidentsRequest>() {
                    @Override
                    public ListIncidentsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListIncidentsRequest.Builder>
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
                new java.util.function.Function<ListIncidentsRequest, ListIncidentsResponse>() {
                    @Override
                    public ListIncidentsResponse apply(ListIncidentsRequest request) {
                        return client.listIncidents(request);
                    }
                },
                new java.util.function.Function<
                        ListIncidentsResponse,
                        java.util.List<com.oracle.bmc.cims.model.IncidentSummary>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.cims.model.IncidentSummary> apply(
                            ListIncidentsResponse response) {
                        return response.getItems();
                    }
                });
    }
}

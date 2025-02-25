/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.managementdashboard;

import com.oracle.bmc.managementdashboard.requests.*;
import com.oracle.bmc.managementdashboard.responses.*;

/**
 * Collection of helper methods that can be used to provide an {@link java.lang.Iterable} interface
 * to any list operations of DashxApis where multiple pages of data may be fetched.
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
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200901")
public class DashxApisPaginators {
    private final DashxApis client;

    public DashxApisPaginators(DashxApis client) {
        this.client = client;
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the listManagementDashboards operation. This iterable
     * will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses received from the service.
     */
    public Iterable<ListManagementDashboardsResponse> listManagementDashboardsResponseIterator(
            final ListManagementDashboardsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListManagementDashboardsRequest.Builder, ListManagementDashboardsRequest,
                ListManagementDashboardsResponse>(
                new java.util.function.Supplier<ListManagementDashboardsRequest.Builder>() {
                    @Override
                    public ListManagementDashboardsRequest.Builder get() {
                        return ListManagementDashboardsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListManagementDashboardsResponse, String>() {
                    @Override
                    public String apply(ListManagementDashboardsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListManagementDashboardsRequest.Builder>,
                        ListManagementDashboardsRequest>() {
                    @Override
                    public ListManagementDashboardsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListManagementDashboardsRequest.Builder>
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
                        ListManagementDashboardsRequest, ListManagementDashboardsResponse>() {
                    @Override
                    public ListManagementDashboardsResponse apply(
                            ListManagementDashboardsRequest request) {
                        return client.listManagementDashboards(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link com.oracle.bmc.managementdashboard.model.ManagementDashboardSummary} objects
     * contained in responses from the listManagementDashboards operation. This iterable will fetch more data from the
     * server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link com.oracle.bmc.managementdashboard.model.ManagementDashboardSummary} objects
     * contained in responses received from the service.
     */
    public Iterable<com.oracle.bmc.managementdashboard.model.ManagementDashboardSummary>
            listManagementDashboardsRecordIterator(final ListManagementDashboardsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListManagementDashboardsRequest.Builder, ListManagementDashboardsRequest,
                ListManagementDashboardsResponse,
                com.oracle.bmc.managementdashboard.model.ManagementDashboardSummary>(
                new java.util.function.Supplier<ListManagementDashboardsRequest.Builder>() {
                    @Override
                    public ListManagementDashboardsRequest.Builder get() {
                        return ListManagementDashboardsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListManagementDashboardsResponse, String>() {
                    @Override
                    public String apply(ListManagementDashboardsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListManagementDashboardsRequest.Builder>,
                        ListManagementDashboardsRequest>() {
                    @Override
                    public ListManagementDashboardsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListManagementDashboardsRequest.Builder>
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
                        ListManagementDashboardsRequest, ListManagementDashboardsResponse>() {
                    @Override
                    public ListManagementDashboardsResponse apply(
                            ListManagementDashboardsRequest request) {
                        return client.listManagementDashboards(request);
                    }
                },
                new java.util.function.Function<
                        ListManagementDashboardsResponse,
                        java.util.List<
                                com.oracle.bmc.managementdashboard.model
                                        .ManagementDashboardSummary>>() {
                    @Override
                    public java.util.List<
                                    com.oracle.bmc.managementdashboard.model
                                            .ManagementDashboardSummary>
                            apply(ListManagementDashboardsResponse response) {
                        return response.getManagementDashboardCollection().getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the listManagementSavedSearches operation. This iterable
     * will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses received from the service.
     */
    public Iterable<ListManagementSavedSearchesResponse>
            listManagementSavedSearchesResponseIterator(
                    final ListManagementSavedSearchesRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListManagementSavedSearchesRequest.Builder, ListManagementSavedSearchesRequest,
                ListManagementSavedSearchesResponse>(
                new java.util.function.Supplier<ListManagementSavedSearchesRequest.Builder>() {
                    @Override
                    public ListManagementSavedSearchesRequest.Builder get() {
                        return ListManagementSavedSearchesRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListManagementSavedSearchesResponse, String>() {
                    @Override
                    public String apply(ListManagementSavedSearchesResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListManagementSavedSearchesRequest.Builder>,
                        ListManagementSavedSearchesRequest>() {
                    @Override
                    public ListManagementSavedSearchesRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListManagementSavedSearchesRequest.Builder>
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
                        ListManagementSavedSearchesRequest, ListManagementSavedSearchesResponse>() {
                    @Override
                    public ListManagementSavedSearchesResponse apply(
                            ListManagementSavedSearchesRequest request) {
                        return client.listManagementSavedSearches(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link com.oracle.bmc.managementdashboard.model.ManagementSavedSearchSummary} objects
     * contained in responses from the listManagementSavedSearches operation. This iterable will fetch more data from the
     * server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link com.oracle.bmc.managementdashboard.model.ManagementSavedSearchSummary} objects
     * contained in responses received from the service.
     */
    public Iterable<com.oracle.bmc.managementdashboard.model.ManagementSavedSearchSummary>
            listManagementSavedSearchesRecordIterator(
                    final ListManagementSavedSearchesRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListManagementSavedSearchesRequest.Builder, ListManagementSavedSearchesRequest,
                ListManagementSavedSearchesResponse,
                com.oracle.bmc.managementdashboard.model.ManagementSavedSearchSummary>(
                new java.util.function.Supplier<ListManagementSavedSearchesRequest.Builder>() {
                    @Override
                    public ListManagementSavedSearchesRequest.Builder get() {
                        return ListManagementSavedSearchesRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListManagementSavedSearchesResponse, String>() {
                    @Override
                    public String apply(ListManagementSavedSearchesResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListManagementSavedSearchesRequest.Builder>,
                        ListManagementSavedSearchesRequest>() {
                    @Override
                    public ListManagementSavedSearchesRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListManagementSavedSearchesRequest.Builder>
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
                        ListManagementSavedSearchesRequest, ListManagementSavedSearchesResponse>() {
                    @Override
                    public ListManagementSavedSearchesResponse apply(
                            ListManagementSavedSearchesRequest request) {
                        return client.listManagementSavedSearches(request);
                    }
                },
                new java.util.function.Function<
                        ListManagementSavedSearchesResponse,
                        java.util.List<
                                com.oracle.bmc.managementdashboard.model
                                        .ManagementSavedSearchSummary>>() {
                    @Override
                    public java.util.List<
                                    com.oracle.bmc.managementdashboard.model
                                            .ManagementSavedSearchSummary>
                            apply(ListManagementSavedSearchesResponse response) {
                        return response.getManagementSavedSearchCollection().getItems();
                    }
                });
    }
}

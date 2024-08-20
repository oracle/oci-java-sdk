/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.fleetappsmanagement;

import com.oracle.bmc.fleetappsmanagement.requests.*;
import com.oracle.bmc.fleetappsmanagement.responses.*;

/**
 * Collection of helper methods that can be used to provide an {@link java.lang.Iterable} interface
 * to any list operations of FleetAppsManagementRunbooks where multiple pages of data may be
 * fetched. Two styles of iteration are supported:
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
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20230831")
public class FleetAppsManagementRunbooksPaginators {
    private final FleetAppsManagementRunbooks client;

    public FleetAppsManagementRunbooksPaginators(FleetAppsManagementRunbooks client) {
        this.client = client;
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the listRunbooks
     * operation. This iterable will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses
     *     received from the service.
     */
    public Iterable<ListRunbooksResponse> listRunbooksResponseIterator(
            final ListRunbooksRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListRunbooksRequest.Builder, ListRunbooksRequest, ListRunbooksResponse>(
                new java.util.function.Supplier<ListRunbooksRequest.Builder>() {
                    @Override
                    public ListRunbooksRequest.Builder get() {
                        return ListRunbooksRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListRunbooksResponse, String>() {
                    @Override
                    public String apply(ListRunbooksResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListRunbooksRequest.Builder>,
                        ListRunbooksRequest>() {
                    @Override
                    public ListRunbooksRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListRunbooksRequest.Builder>
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
                new java.util.function.Function<ListRunbooksRequest, ListRunbooksResponse>() {
                    @Override
                    public ListRunbooksResponse apply(ListRunbooksRequest request) {
                        return client.listRunbooks(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link
     * com.oracle.bmc.fleetappsmanagement.model.RunbookSummary} objects contained in responses from
     * the listRunbooks operation. This iterable will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link
     *     com.oracle.bmc.fleetappsmanagement.model.RunbookSummary} objects contained in responses
     *     received from the service.
     */
    public Iterable<com.oracle.bmc.fleetappsmanagement.model.RunbookSummary>
            listRunbooksRecordIterator(final ListRunbooksRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListRunbooksRequest.Builder,
                ListRunbooksRequest,
                ListRunbooksResponse,
                com.oracle.bmc.fleetappsmanagement.model.RunbookSummary>(
                new java.util.function.Supplier<ListRunbooksRequest.Builder>() {
                    @Override
                    public ListRunbooksRequest.Builder get() {
                        return ListRunbooksRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListRunbooksResponse, String>() {
                    @Override
                    public String apply(ListRunbooksResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListRunbooksRequest.Builder>,
                        ListRunbooksRequest>() {
                    @Override
                    public ListRunbooksRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListRunbooksRequest.Builder>
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
                new java.util.function.Function<ListRunbooksRequest, ListRunbooksResponse>() {
                    @Override
                    public ListRunbooksResponse apply(ListRunbooksRequest request) {
                        return client.listRunbooks(request);
                    }
                },
                new java.util.function.Function<
                        ListRunbooksResponse,
                        java.util.List<com.oracle.bmc.fleetappsmanagement.model.RunbookSummary>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.fleetappsmanagement.model.RunbookSummary>
                            apply(ListRunbooksResponse response) {
                        return response.getRunbookCollection().getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the
     * listTaskRecords operation. This iterable will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses
     *     received from the service.
     */
    public Iterable<ListTaskRecordsResponse> listTaskRecordsResponseIterator(
            final ListTaskRecordsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListTaskRecordsRequest.Builder, ListTaskRecordsRequest, ListTaskRecordsResponse>(
                new java.util.function.Supplier<ListTaskRecordsRequest.Builder>() {
                    @Override
                    public ListTaskRecordsRequest.Builder get() {
                        return ListTaskRecordsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListTaskRecordsResponse, String>() {
                    @Override
                    public String apply(ListTaskRecordsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListTaskRecordsRequest.Builder>,
                        ListTaskRecordsRequest>() {
                    @Override
                    public ListTaskRecordsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListTaskRecordsRequest.Builder>
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
                new java.util.function.Function<ListTaskRecordsRequest, ListTaskRecordsResponse>() {
                    @Override
                    public ListTaskRecordsResponse apply(ListTaskRecordsRequest request) {
                        return client.listTaskRecords(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link
     * com.oracle.bmc.fleetappsmanagement.model.TaskRecordSummary} objects contained in responses
     * from the listTaskRecords operation. This iterable will fetch more data from the server as
     * needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link
     *     com.oracle.bmc.fleetappsmanagement.model.TaskRecordSummary} objects contained in
     *     responses received from the service.
     */
    public Iterable<com.oracle.bmc.fleetappsmanagement.model.TaskRecordSummary>
            listTaskRecordsRecordIterator(final ListTaskRecordsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListTaskRecordsRequest.Builder,
                ListTaskRecordsRequest,
                ListTaskRecordsResponse,
                com.oracle.bmc.fleetappsmanagement.model.TaskRecordSummary>(
                new java.util.function.Supplier<ListTaskRecordsRequest.Builder>() {
                    @Override
                    public ListTaskRecordsRequest.Builder get() {
                        return ListTaskRecordsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListTaskRecordsResponse, String>() {
                    @Override
                    public String apply(ListTaskRecordsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListTaskRecordsRequest.Builder>,
                        ListTaskRecordsRequest>() {
                    @Override
                    public ListTaskRecordsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListTaskRecordsRequest.Builder>
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
                new java.util.function.Function<ListTaskRecordsRequest, ListTaskRecordsResponse>() {
                    @Override
                    public ListTaskRecordsResponse apply(ListTaskRecordsRequest request) {
                        return client.listTaskRecords(request);
                    }
                },
                new java.util.function.Function<
                        ListTaskRecordsResponse,
                        java.util.List<
                                com.oracle.bmc.fleetappsmanagement.model.TaskRecordSummary>>() {
                    @Override
                    public java.util.List<
                                    com.oracle.bmc.fleetappsmanagement.model.TaskRecordSummary>
                            apply(ListTaskRecordsResponse response) {
                        return response.getTaskRecordCollection().getItems();
                    }
                });
    }
}

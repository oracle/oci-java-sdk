/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.capacitymanagement;

import com.oracle.bmc.capacitymanagement.requests.*;
import com.oracle.bmc.capacitymanagement.responses.*;

/**
 * Collection of helper methods that can be used to provide an {@link java.lang.Iterable} interface
 * to any list operations of CapacityManagement where multiple pages of data may be fetched. Two
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
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20231107")
public class CapacityManagementPaginators {
    private final CapacityManagement client;

    public CapacityManagementPaginators(CapacityManagement client) {
        this.client = client;
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the
     * listInternalNamespaceOccOverviews operation. This iterable will fetch more data from the
     * server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses
     *     received from the service.
     */
    public Iterable<ListInternalNamespaceOccOverviewsResponse>
            listInternalNamespaceOccOverviewsResponseIterator(
                    final ListInternalNamespaceOccOverviewsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListInternalNamespaceOccOverviewsRequest.Builder,
                ListInternalNamespaceOccOverviewsRequest,
                ListInternalNamespaceOccOverviewsResponse>(
                new java.util.function.Supplier<
                        ListInternalNamespaceOccOverviewsRequest.Builder>() {
                    @Override
                    public ListInternalNamespaceOccOverviewsRequest.Builder get() {
                        return ListInternalNamespaceOccOverviewsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<
                        ListInternalNamespaceOccOverviewsResponse, String>() {
                    @Override
                    public String apply(ListInternalNamespaceOccOverviewsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListInternalNamespaceOccOverviewsRequest.Builder>,
                        ListInternalNamespaceOccOverviewsRequest>() {
                    @Override
                    public ListInternalNamespaceOccOverviewsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListInternalNamespaceOccOverviewsRequest.Builder>
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
                        ListInternalNamespaceOccOverviewsRequest,
                        ListInternalNamespaceOccOverviewsResponse>() {
                    @Override
                    public ListInternalNamespaceOccOverviewsResponse apply(
                            ListInternalNamespaceOccOverviewsRequest request) {
                        return client.listInternalNamespaceOccOverviews(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link
     * com.oracle.bmc.capacitymanagement.model.OccOverviewSummary} objects contained in responses
     * from the listInternalNamespaceOccOverviews operation. This iterable will fetch more data from
     * the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link
     *     com.oracle.bmc.capacitymanagement.model.OccOverviewSummary} objects contained in
     *     responses received from the service.
     */
    public Iterable<com.oracle.bmc.capacitymanagement.model.OccOverviewSummary>
            listInternalNamespaceOccOverviewsRecordIterator(
                    final ListInternalNamespaceOccOverviewsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListInternalNamespaceOccOverviewsRequest.Builder,
                ListInternalNamespaceOccOverviewsRequest,
                ListInternalNamespaceOccOverviewsResponse,
                com.oracle.bmc.capacitymanagement.model.OccOverviewSummary>(
                new java.util.function.Supplier<
                        ListInternalNamespaceOccOverviewsRequest.Builder>() {
                    @Override
                    public ListInternalNamespaceOccOverviewsRequest.Builder get() {
                        return ListInternalNamespaceOccOverviewsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<
                        ListInternalNamespaceOccOverviewsResponse, String>() {
                    @Override
                    public String apply(ListInternalNamespaceOccOverviewsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListInternalNamespaceOccOverviewsRequest.Builder>,
                        ListInternalNamespaceOccOverviewsRequest>() {
                    @Override
                    public ListInternalNamespaceOccOverviewsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListInternalNamespaceOccOverviewsRequest.Builder>
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
                        ListInternalNamespaceOccOverviewsRequest,
                        ListInternalNamespaceOccOverviewsResponse>() {
                    @Override
                    public ListInternalNamespaceOccOverviewsResponse apply(
                            ListInternalNamespaceOccOverviewsRequest request) {
                        return client.listInternalNamespaceOccOverviews(request);
                    }
                },
                new java.util.function.Function<
                        ListInternalNamespaceOccOverviewsResponse,
                        java.util.List<
                                com.oracle.bmc.capacitymanagement.model.OccOverviewSummary>>() {
                    @Override
                    public java.util.List<
                                    com.oracle.bmc.capacitymanagement.model.OccOverviewSummary>
                            apply(ListInternalNamespaceOccOverviewsResponse response) {
                        return response.getOccOverviewCollection().getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the
     * listOccAvailabilities operation. This iterable will fetch more data from the server as
     * needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses
     *     received from the service.
     */
    public Iterable<ListOccAvailabilitiesResponse> listOccAvailabilitiesResponseIterator(
            final ListOccAvailabilitiesRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListOccAvailabilitiesRequest.Builder,
                ListOccAvailabilitiesRequest,
                ListOccAvailabilitiesResponse>(
                new java.util.function.Supplier<ListOccAvailabilitiesRequest.Builder>() {
                    @Override
                    public ListOccAvailabilitiesRequest.Builder get() {
                        return ListOccAvailabilitiesRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListOccAvailabilitiesResponse, String>() {
                    @Override
                    public String apply(ListOccAvailabilitiesResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListOccAvailabilitiesRequest.Builder>,
                        ListOccAvailabilitiesRequest>() {
                    @Override
                    public ListOccAvailabilitiesRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListOccAvailabilitiesRequest.Builder>
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
                        ListOccAvailabilitiesRequest, ListOccAvailabilitiesResponse>() {
                    @Override
                    public ListOccAvailabilitiesResponse apply(
                            ListOccAvailabilitiesRequest request) {
                        return client.listOccAvailabilities(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link
     * com.oracle.bmc.capacitymanagement.model.OccAvailabilitySummary} objects contained in
     * responses from the listOccAvailabilities operation. This iterable will fetch more data from
     * the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link
     *     com.oracle.bmc.capacitymanagement.model.OccAvailabilitySummary} objects contained in
     *     responses received from the service.
     */
    public Iterable<com.oracle.bmc.capacitymanagement.model.OccAvailabilitySummary>
            listOccAvailabilitiesRecordIterator(final ListOccAvailabilitiesRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListOccAvailabilitiesRequest.Builder,
                ListOccAvailabilitiesRequest,
                ListOccAvailabilitiesResponse,
                com.oracle.bmc.capacitymanagement.model.OccAvailabilitySummary>(
                new java.util.function.Supplier<ListOccAvailabilitiesRequest.Builder>() {
                    @Override
                    public ListOccAvailabilitiesRequest.Builder get() {
                        return ListOccAvailabilitiesRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListOccAvailabilitiesResponse, String>() {
                    @Override
                    public String apply(ListOccAvailabilitiesResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListOccAvailabilitiesRequest.Builder>,
                        ListOccAvailabilitiesRequest>() {
                    @Override
                    public ListOccAvailabilitiesRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListOccAvailabilitiesRequest.Builder>
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
                        ListOccAvailabilitiesRequest, ListOccAvailabilitiesResponse>() {
                    @Override
                    public ListOccAvailabilitiesResponse apply(
                            ListOccAvailabilitiesRequest request) {
                        return client.listOccAvailabilities(request);
                    }
                },
                new java.util.function.Function<
                        ListOccAvailabilitiesResponse,
                        java.util.List<
                                com.oracle.bmc.capacitymanagement.model.OccAvailabilitySummary>>() {
                    @Override
                    public java.util.List<
                                    com.oracle.bmc.capacitymanagement.model.OccAvailabilitySummary>
                            apply(ListOccAvailabilitiesResponse response) {
                        return response.getOccAvailabilityCollection().getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the
     * listOccAvailabilityCatalogs operation. This iterable will fetch more data from the server as
     * needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses
     *     received from the service.
     */
    public Iterable<ListOccAvailabilityCatalogsResponse>
            listOccAvailabilityCatalogsResponseIterator(
                    final ListOccAvailabilityCatalogsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListOccAvailabilityCatalogsRequest.Builder,
                ListOccAvailabilityCatalogsRequest,
                ListOccAvailabilityCatalogsResponse>(
                new java.util.function.Supplier<ListOccAvailabilityCatalogsRequest.Builder>() {
                    @Override
                    public ListOccAvailabilityCatalogsRequest.Builder get() {
                        return ListOccAvailabilityCatalogsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListOccAvailabilityCatalogsResponse, String>() {
                    @Override
                    public String apply(ListOccAvailabilityCatalogsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListOccAvailabilityCatalogsRequest.Builder>,
                        ListOccAvailabilityCatalogsRequest>() {
                    @Override
                    public ListOccAvailabilityCatalogsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListOccAvailabilityCatalogsRequest.Builder>
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
                        ListOccAvailabilityCatalogsRequest, ListOccAvailabilityCatalogsResponse>() {
                    @Override
                    public ListOccAvailabilityCatalogsResponse apply(
                            ListOccAvailabilityCatalogsRequest request) {
                        return client.listOccAvailabilityCatalogs(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link
     * com.oracle.bmc.capacitymanagement.model.OccAvailabilityCatalogSummary} objects contained in
     * responses from the listOccAvailabilityCatalogs operation. This iterable will fetch more data
     * from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link
     *     com.oracle.bmc.capacitymanagement.model.OccAvailabilityCatalogSummary} objects contained
     *     in responses received from the service.
     */
    public Iterable<com.oracle.bmc.capacitymanagement.model.OccAvailabilityCatalogSummary>
            listOccAvailabilityCatalogsRecordIterator(
                    final ListOccAvailabilityCatalogsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListOccAvailabilityCatalogsRequest.Builder,
                ListOccAvailabilityCatalogsRequest,
                ListOccAvailabilityCatalogsResponse,
                com.oracle.bmc.capacitymanagement.model.OccAvailabilityCatalogSummary>(
                new java.util.function.Supplier<ListOccAvailabilityCatalogsRequest.Builder>() {
                    @Override
                    public ListOccAvailabilityCatalogsRequest.Builder get() {
                        return ListOccAvailabilityCatalogsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListOccAvailabilityCatalogsResponse, String>() {
                    @Override
                    public String apply(ListOccAvailabilityCatalogsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListOccAvailabilityCatalogsRequest.Builder>,
                        ListOccAvailabilityCatalogsRequest>() {
                    @Override
                    public ListOccAvailabilityCatalogsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListOccAvailabilityCatalogsRequest.Builder>
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
                        ListOccAvailabilityCatalogsRequest, ListOccAvailabilityCatalogsResponse>() {
                    @Override
                    public ListOccAvailabilityCatalogsResponse apply(
                            ListOccAvailabilityCatalogsRequest request) {
                        return client.listOccAvailabilityCatalogs(request);
                    }
                },
                new java.util.function.Function<
                        ListOccAvailabilityCatalogsResponse,
                        java.util.List<
                                com.oracle.bmc.capacitymanagement.model
                                        .OccAvailabilityCatalogSummary>>() {
                    @Override
                    public java.util.List<
                                    com.oracle.bmc.capacitymanagement.model
                                            .OccAvailabilityCatalogSummary>
                            apply(ListOccAvailabilityCatalogsResponse response) {
                        return response.getOccAvailabilityCatalogCollection().getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the
     * listOccAvailabilityCatalogsInternal operation. This iterable will fetch more data from the
     * server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses
     *     received from the service.
     */
    public Iterable<ListOccAvailabilityCatalogsInternalResponse>
            listOccAvailabilityCatalogsInternalResponseIterator(
                    final ListOccAvailabilityCatalogsInternalRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListOccAvailabilityCatalogsInternalRequest.Builder,
                ListOccAvailabilityCatalogsInternalRequest,
                ListOccAvailabilityCatalogsInternalResponse>(
                new java.util.function.Supplier<
                        ListOccAvailabilityCatalogsInternalRequest.Builder>() {
                    @Override
                    public ListOccAvailabilityCatalogsInternalRequest.Builder get() {
                        return ListOccAvailabilityCatalogsInternalRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<
                        ListOccAvailabilityCatalogsInternalResponse, String>() {
                    @Override
                    public String apply(ListOccAvailabilityCatalogsInternalResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListOccAvailabilityCatalogsInternalRequest.Builder>,
                        ListOccAvailabilityCatalogsInternalRequest>() {
                    @Override
                    public ListOccAvailabilityCatalogsInternalRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListOccAvailabilityCatalogsInternalRequest.Builder>
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
                        ListOccAvailabilityCatalogsInternalRequest,
                        ListOccAvailabilityCatalogsInternalResponse>() {
                    @Override
                    public ListOccAvailabilityCatalogsInternalResponse apply(
                            ListOccAvailabilityCatalogsInternalRequest request) {
                        return client.listOccAvailabilityCatalogsInternal(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link
     * com.oracle.bmc.capacitymanagement.model.OccAvailabilityCatalogSummary} objects contained in
     * responses from the listOccAvailabilityCatalogsInternal operation. This iterable will fetch
     * more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link
     *     com.oracle.bmc.capacitymanagement.model.OccAvailabilityCatalogSummary} objects contained
     *     in responses received from the service.
     */
    public Iterable<com.oracle.bmc.capacitymanagement.model.OccAvailabilityCatalogSummary>
            listOccAvailabilityCatalogsInternalRecordIterator(
                    final ListOccAvailabilityCatalogsInternalRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListOccAvailabilityCatalogsInternalRequest.Builder,
                ListOccAvailabilityCatalogsInternalRequest,
                ListOccAvailabilityCatalogsInternalResponse,
                com.oracle.bmc.capacitymanagement.model.OccAvailabilityCatalogSummary>(
                new java.util.function.Supplier<
                        ListOccAvailabilityCatalogsInternalRequest.Builder>() {
                    @Override
                    public ListOccAvailabilityCatalogsInternalRequest.Builder get() {
                        return ListOccAvailabilityCatalogsInternalRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<
                        ListOccAvailabilityCatalogsInternalResponse, String>() {
                    @Override
                    public String apply(ListOccAvailabilityCatalogsInternalResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListOccAvailabilityCatalogsInternalRequest.Builder>,
                        ListOccAvailabilityCatalogsInternalRequest>() {
                    @Override
                    public ListOccAvailabilityCatalogsInternalRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListOccAvailabilityCatalogsInternalRequest.Builder>
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
                        ListOccAvailabilityCatalogsInternalRequest,
                        ListOccAvailabilityCatalogsInternalResponse>() {
                    @Override
                    public ListOccAvailabilityCatalogsInternalResponse apply(
                            ListOccAvailabilityCatalogsInternalRequest request) {
                        return client.listOccAvailabilityCatalogsInternal(request);
                    }
                },
                new java.util.function.Function<
                        ListOccAvailabilityCatalogsInternalResponse,
                        java.util.List<
                                com.oracle.bmc.capacitymanagement.model
                                        .OccAvailabilityCatalogSummary>>() {
                    @Override
                    public java.util.List<
                                    com.oracle.bmc.capacitymanagement.model
                                            .OccAvailabilityCatalogSummary>
                            apply(ListOccAvailabilityCatalogsInternalResponse response) {
                        return response.getOccAvailabilityCatalogCollection().getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the
     * listOccCapacityRequests operation. This iterable will fetch more data from the server as
     * needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses
     *     received from the service.
     */
    public Iterable<ListOccCapacityRequestsResponse> listOccCapacityRequestsResponseIterator(
            final ListOccCapacityRequestsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListOccCapacityRequestsRequest.Builder,
                ListOccCapacityRequestsRequest,
                ListOccCapacityRequestsResponse>(
                new java.util.function.Supplier<ListOccCapacityRequestsRequest.Builder>() {
                    @Override
                    public ListOccCapacityRequestsRequest.Builder get() {
                        return ListOccCapacityRequestsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListOccCapacityRequestsResponse, String>() {
                    @Override
                    public String apply(ListOccCapacityRequestsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListOccCapacityRequestsRequest.Builder>,
                        ListOccCapacityRequestsRequest>() {
                    @Override
                    public ListOccCapacityRequestsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListOccCapacityRequestsRequest.Builder>
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
                        ListOccCapacityRequestsRequest, ListOccCapacityRequestsResponse>() {
                    @Override
                    public ListOccCapacityRequestsResponse apply(
                            ListOccCapacityRequestsRequest request) {
                        return client.listOccCapacityRequests(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link
     * com.oracle.bmc.capacitymanagement.model.OccCapacityRequestSummary} objects contained in
     * responses from the listOccCapacityRequests operation. This iterable will fetch more data from
     * the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link
     *     com.oracle.bmc.capacitymanagement.model.OccCapacityRequestSummary} objects contained in
     *     responses received from the service.
     */
    public Iterable<com.oracle.bmc.capacitymanagement.model.OccCapacityRequestSummary>
            listOccCapacityRequestsRecordIterator(final ListOccCapacityRequestsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListOccCapacityRequestsRequest.Builder,
                ListOccCapacityRequestsRequest,
                ListOccCapacityRequestsResponse,
                com.oracle.bmc.capacitymanagement.model.OccCapacityRequestSummary>(
                new java.util.function.Supplier<ListOccCapacityRequestsRequest.Builder>() {
                    @Override
                    public ListOccCapacityRequestsRequest.Builder get() {
                        return ListOccCapacityRequestsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListOccCapacityRequestsResponse, String>() {
                    @Override
                    public String apply(ListOccCapacityRequestsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListOccCapacityRequestsRequest.Builder>,
                        ListOccCapacityRequestsRequest>() {
                    @Override
                    public ListOccCapacityRequestsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListOccCapacityRequestsRequest.Builder>
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
                        ListOccCapacityRequestsRequest, ListOccCapacityRequestsResponse>() {
                    @Override
                    public ListOccCapacityRequestsResponse apply(
                            ListOccCapacityRequestsRequest request) {
                        return client.listOccCapacityRequests(request);
                    }
                },
                new java.util.function.Function<
                        ListOccCapacityRequestsResponse,
                        java.util.List<
                                com.oracle.bmc.capacitymanagement.model
                                        .OccCapacityRequestSummary>>() {
                    @Override
                    public java.util.List<
                                    com.oracle.bmc.capacitymanagement.model
                                            .OccCapacityRequestSummary>
                            apply(ListOccCapacityRequestsResponse response) {
                        return response.getOccCapacityRequestCollection().getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the
     * listOccCapacityRequestsInternal operation. This iterable will fetch more data from the server
     * as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses
     *     received from the service.
     */
    public Iterable<ListOccCapacityRequestsInternalResponse>
            listOccCapacityRequestsInternalResponseIterator(
                    final ListOccCapacityRequestsInternalRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListOccCapacityRequestsInternalRequest.Builder,
                ListOccCapacityRequestsInternalRequest,
                ListOccCapacityRequestsInternalResponse>(
                new java.util.function.Supplier<ListOccCapacityRequestsInternalRequest.Builder>() {
                    @Override
                    public ListOccCapacityRequestsInternalRequest.Builder get() {
                        return ListOccCapacityRequestsInternalRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListOccCapacityRequestsInternalResponse, String>() {
                    @Override
                    public String apply(ListOccCapacityRequestsInternalResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListOccCapacityRequestsInternalRequest.Builder>,
                        ListOccCapacityRequestsInternalRequest>() {
                    @Override
                    public ListOccCapacityRequestsInternalRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListOccCapacityRequestsInternalRequest.Builder>
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
                        ListOccCapacityRequestsInternalRequest,
                        ListOccCapacityRequestsInternalResponse>() {
                    @Override
                    public ListOccCapacityRequestsInternalResponse apply(
                            ListOccCapacityRequestsInternalRequest request) {
                        return client.listOccCapacityRequestsInternal(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link
     * com.oracle.bmc.capacitymanagement.model.OccCapacityRequestSummary} objects contained in
     * responses from the listOccCapacityRequestsInternal operation. This iterable will fetch more
     * data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link
     *     com.oracle.bmc.capacitymanagement.model.OccCapacityRequestSummary} objects contained in
     *     responses received from the service.
     */
    public Iterable<com.oracle.bmc.capacitymanagement.model.OccCapacityRequestSummary>
            listOccCapacityRequestsInternalRecordIterator(
                    final ListOccCapacityRequestsInternalRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListOccCapacityRequestsInternalRequest.Builder,
                ListOccCapacityRequestsInternalRequest,
                ListOccCapacityRequestsInternalResponse,
                com.oracle.bmc.capacitymanagement.model.OccCapacityRequestSummary>(
                new java.util.function.Supplier<ListOccCapacityRequestsInternalRequest.Builder>() {
                    @Override
                    public ListOccCapacityRequestsInternalRequest.Builder get() {
                        return ListOccCapacityRequestsInternalRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListOccCapacityRequestsInternalResponse, String>() {
                    @Override
                    public String apply(ListOccCapacityRequestsInternalResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListOccCapacityRequestsInternalRequest.Builder>,
                        ListOccCapacityRequestsInternalRequest>() {
                    @Override
                    public ListOccCapacityRequestsInternalRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListOccCapacityRequestsInternalRequest.Builder>
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
                        ListOccCapacityRequestsInternalRequest,
                        ListOccCapacityRequestsInternalResponse>() {
                    @Override
                    public ListOccCapacityRequestsInternalResponse apply(
                            ListOccCapacityRequestsInternalRequest request) {
                        return client.listOccCapacityRequestsInternal(request);
                    }
                },
                new java.util.function.Function<
                        ListOccCapacityRequestsInternalResponse,
                        java.util.List<
                                com.oracle.bmc.capacitymanagement.model
                                        .OccCapacityRequestSummary>>() {
                    @Override
                    public java.util.List<
                                    com.oracle.bmc.capacitymanagement.model
                                            .OccCapacityRequestSummary>
                            apply(ListOccCapacityRequestsInternalResponse response) {
                        return response.getOccCapacityRequestCollection().getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the
     * listOccCustomerGroups operation. This iterable will fetch more data from the server as
     * needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses
     *     received from the service.
     */
    public Iterable<ListOccCustomerGroupsResponse> listOccCustomerGroupsResponseIterator(
            final ListOccCustomerGroupsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListOccCustomerGroupsRequest.Builder,
                ListOccCustomerGroupsRequest,
                ListOccCustomerGroupsResponse>(
                new java.util.function.Supplier<ListOccCustomerGroupsRequest.Builder>() {
                    @Override
                    public ListOccCustomerGroupsRequest.Builder get() {
                        return ListOccCustomerGroupsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListOccCustomerGroupsResponse, String>() {
                    @Override
                    public String apply(ListOccCustomerGroupsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListOccCustomerGroupsRequest.Builder>,
                        ListOccCustomerGroupsRequest>() {
                    @Override
                    public ListOccCustomerGroupsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListOccCustomerGroupsRequest.Builder>
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
                        ListOccCustomerGroupsRequest, ListOccCustomerGroupsResponse>() {
                    @Override
                    public ListOccCustomerGroupsResponse apply(
                            ListOccCustomerGroupsRequest request) {
                        return client.listOccCustomerGroups(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link
     * com.oracle.bmc.capacitymanagement.model.OccCustomerGroupSummary} objects contained in
     * responses from the listOccCustomerGroups operation. This iterable will fetch more data from
     * the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link
     *     com.oracle.bmc.capacitymanagement.model.OccCustomerGroupSummary} objects contained in
     *     responses received from the service.
     */
    public Iterable<com.oracle.bmc.capacitymanagement.model.OccCustomerGroupSummary>
            listOccCustomerGroupsRecordIterator(final ListOccCustomerGroupsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListOccCustomerGroupsRequest.Builder,
                ListOccCustomerGroupsRequest,
                ListOccCustomerGroupsResponse,
                com.oracle.bmc.capacitymanagement.model.OccCustomerGroupSummary>(
                new java.util.function.Supplier<ListOccCustomerGroupsRequest.Builder>() {
                    @Override
                    public ListOccCustomerGroupsRequest.Builder get() {
                        return ListOccCustomerGroupsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListOccCustomerGroupsResponse, String>() {
                    @Override
                    public String apply(ListOccCustomerGroupsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListOccCustomerGroupsRequest.Builder>,
                        ListOccCustomerGroupsRequest>() {
                    @Override
                    public ListOccCustomerGroupsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListOccCustomerGroupsRequest.Builder>
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
                        ListOccCustomerGroupsRequest, ListOccCustomerGroupsResponse>() {
                    @Override
                    public ListOccCustomerGroupsResponse apply(
                            ListOccCustomerGroupsRequest request) {
                        return client.listOccCustomerGroups(request);
                    }
                },
                new java.util.function.Function<
                        ListOccCustomerGroupsResponse,
                        java.util.List<
                                com.oracle.bmc.capacitymanagement.model
                                        .OccCustomerGroupSummary>>() {
                    @Override
                    public java.util.List<
                                    com.oracle.bmc.capacitymanagement.model.OccCustomerGroupSummary>
                            apply(ListOccCustomerGroupsResponse response) {
                        return response.getOccCustomerGroupCollection().getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the
     * listOccOverviews operation. This iterable will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses
     *     received from the service.
     */
    public Iterable<ListOccOverviewsResponse> listOccOverviewsResponseIterator(
            final ListOccOverviewsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListOccOverviewsRequest.Builder, ListOccOverviewsRequest, ListOccOverviewsResponse>(
                new java.util.function.Supplier<ListOccOverviewsRequest.Builder>() {
                    @Override
                    public ListOccOverviewsRequest.Builder get() {
                        return ListOccOverviewsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListOccOverviewsResponse, String>() {
                    @Override
                    public String apply(ListOccOverviewsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListOccOverviewsRequest.Builder>,
                        ListOccOverviewsRequest>() {
                    @Override
                    public ListOccOverviewsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListOccOverviewsRequest.Builder>
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
                        ListOccOverviewsRequest, ListOccOverviewsResponse>() {
                    @Override
                    public ListOccOverviewsResponse apply(ListOccOverviewsRequest request) {
                        return client.listOccOverviews(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link
     * com.oracle.bmc.capacitymanagement.model.OccOverviewSummary} objects contained in responses
     * from the listOccOverviews operation. This iterable will fetch more data from the server as
     * needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link
     *     com.oracle.bmc.capacitymanagement.model.OccOverviewSummary} objects contained in
     *     responses received from the service.
     */
    public Iterable<com.oracle.bmc.capacitymanagement.model.OccOverviewSummary>
            listOccOverviewsRecordIterator(final ListOccOverviewsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListOccOverviewsRequest.Builder,
                ListOccOverviewsRequest,
                ListOccOverviewsResponse,
                com.oracle.bmc.capacitymanagement.model.OccOverviewSummary>(
                new java.util.function.Supplier<ListOccOverviewsRequest.Builder>() {
                    @Override
                    public ListOccOverviewsRequest.Builder get() {
                        return ListOccOverviewsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListOccOverviewsResponse, String>() {
                    @Override
                    public String apply(ListOccOverviewsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListOccOverviewsRequest.Builder>,
                        ListOccOverviewsRequest>() {
                    @Override
                    public ListOccOverviewsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListOccOverviewsRequest.Builder>
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
                        ListOccOverviewsRequest, ListOccOverviewsResponse>() {
                    @Override
                    public ListOccOverviewsResponse apply(ListOccOverviewsRequest request) {
                        return client.listOccOverviews(request);
                    }
                },
                new java.util.function.Function<
                        ListOccOverviewsResponse,
                        java.util.List<
                                com.oracle.bmc.capacitymanagement.model.OccOverviewSummary>>() {
                    @Override
                    public java.util.List<
                                    com.oracle.bmc.capacitymanagement.model.OccOverviewSummary>
                            apply(ListOccOverviewsResponse response) {
                        return response.getOccOverviewCollection().getItems();
                    }
                });
    }
}

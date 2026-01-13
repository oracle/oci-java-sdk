/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.capacitymanagement;

import com.oracle.bmc.capacitymanagement.requests.*;
import com.oracle.bmc.capacitymanagement.responses.*;

/**
 * Collection of helper methods that can be used to provide an {@link java.lang.Iterable} interface
 * to any list operations of InternalDemandSignal where multiple pages of data may be fetched. Two
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
public class InternalDemandSignalPaginators {
    private final InternalDemandSignal client;

    public InternalDemandSignalPaginators(InternalDemandSignal client) {
        this.client = client;
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the
     * listInternalOccmDemandSignalCatalogResources operation. This iterable will fetch more data
     * from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses
     *     received from the service.
     */
    public Iterable<ListInternalOccmDemandSignalCatalogResourcesResponse>
            listInternalOccmDemandSignalCatalogResourcesResponseIterator(
                    final ListInternalOccmDemandSignalCatalogResourcesRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListInternalOccmDemandSignalCatalogResourcesRequest.Builder,
                ListInternalOccmDemandSignalCatalogResourcesRequest,
                ListInternalOccmDemandSignalCatalogResourcesResponse>(
                new java.util.function.Supplier<
                        ListInternalOccmDemandSignalCatalogResourcesRequest.Builder>() {
                    @Override
                    public ListInternalOccmDemandSignalCatalogResourcesRequest.Builder get() {
                        return ListInternalOccmDemandSignalCatalogResourcesRequest.builder()
                                .copy(request);
                    }
                },
                new java.util.function.Function<
                        ListInternalOccmDemandSignalCatalogResourcesResponse, String>() {
                    @Override
                    public String apply(
                            ListInternalOccmDemandSignalCatalogResourcesResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListInternalOccmDemandSignalCatalogResourcesRequest.Builder>,
                        ListInternalOccmDemandSignalCatalogResourcesRequest>() {
                    @Override
                    public ListInternalOccmDemandSignalCatalogResourcesRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListInternalOccmDemandSignalCatalogResourcesRequest
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
                        ListInternalOccmDemandSignalCatalogResourcesRequest,
                        ListInternalOccmDemandSignalCatalogResourcesResponse>() {
                    @Override
                    public ListInternalOccmDemandSignalCatalogResourcesResponse apply(
                            ListInternalOccmDemandSignalCatalogResourcesRequest request) {
                        return client.listInternalOccmDemandSignalCatalogResources(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link
     * com.oracle.bmc.capacitymanagement.model.InternalOccmDemandSignalCatalogResourceSummary}
     * objects contained in responses from the listInternalOccmDemandSignalCatalogResources
     * operation. This iterable will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link
     *     com.oracle.bmc.capacitymanagement.model.InternalOccmDemandSignalCatalogResourceSummary}
     *     objects contained in responses received from the service.
     */
    public Iterable<
                    com.oracle.bmc.capacitymanagement.model
                            .InternalOccmDemandSignalCatalogResourceSummary>
            listInternalOccmDemandSignalCatalogResourcesRecordIterator(
                    final ListInternalOccmDemandSignalCatalogResourcesRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListInternalOccmDemandSignalCatalogResourcesRequest.Builder,
                ListInternalOccmDemandSignalCatalogResourcesRequest,
                ListInternalOccmDemandSignalCatalogResourcesResponse,
                com.oracle.bmc.capacitymanagement.model
                        .InternalOccmDemandSignalCatalogResourceSummary>(
                new java.util.function.Supplier<
                        ListInternalOccmDemandSignalCatalogResourcesRequest.Builder>() {
                    @Override
                    public ListInternalOccmDemandSignalCatalogResourcesRequest.Builder get() {
                        return ListInternalOccmDemandSignalCatalogResourcesRequest.builder()
                                .copy(request);
                    }
                },
                new java.util.function.Function<
                        ListInternalOccmDemandSignalCatalogResourcesResponse, String>() {
                    @Override
                    public String apply(
                            ListInternalOccmDemandSignalCatalogResourcesResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListInternalOccmDemandSignalCatalogResourcesRequest.Builder>,
                        ListInternalOccmDemandSignalCatalogResourcesRequest>() {
                    @Override
                    public ListInternalOccmDemandSignalCatalogResourcesRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListInternalOccmDemandSignalCatalogResourcesRequest
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
                        ListInternalOccmDemandSignalCatalogResourcesRequest,
                        ListInternalOccmDemandSignalCatalogResourcesResponse>() {
                    @Override
                    public ListInternalOccmDemandSignalCatalogResourcesResponse apply(
                            ListInternalOccmDemandSignalCatalogResourcesRequest request) {
                        return client.listInternalOccmDemandSignalCatalogResources(request);
                    }
                },
                new java.util.function.Function<
                        ListInternalOccmDemandSignalCatalogResourcesResponse,
                        java.util.List<
                                com.oracle.bmc.capacitymanagement.model
                                        .InternalOccmDemandSignalCatalogResourceSummary>>() {
                    @Override
                    public java.util.List<
                                    com.oracle.bmc.capacitymanagement.model
                                            .InternalOccmDemandSignalCatalogResourceSummary>
                            apply(ListInternalOccmDemandSignalCatalogResourcesResponse response) {
                        return response.getInternalOccmDemandSignalCatalogResourceCollection()
                                .getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the
     * listInternalOccmDemandSignalCatalogs operation. This iterable will fetch more data from the
     * server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses
     *     received from the service.
     */
    public Iterable<ListInternalOccmDemandSignalCatalogsResponse>
            listInternalOccmDemandSignalCatalogsResponseIterator(
                    final ListInternalOccmDemandSignalCatalogsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListInternalOccmDemandSignalCatalogsRequest.Builder,
                ListInternalOccmDemandSignalCatalogsRequest,
                ListInternalOccmDemandSignalCatalogsResponse>(
                new java.util.function.Supplier<
                        ListInternalOccmDemandSignalCatalogsRequest.Builder>() {
                    @Override
                    public ListInternalOccmDemandSignalCatalogsRequest.Builder get() {
                        return ListInternalOccmDemandSignalCatalogsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<
                        ListInternalOccmDemandSignalCatalogsResponse, String>() {
                    @Override
                    public String apply(ListInternalOccmDemandSignalCatalogsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListInternalOccmDemandSignalCatalogsRequest.Builder>,
                        ListInternalOccmDemandSignalCatalogsRequest>() {
                    @Override
                    public ListInternalOccmDemandSignalCatalogsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListInternalOccmDemandSignalCatalogsRequest.Builder>
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
                        ListInternalOccmDemandSignalCatalogsRequest,
                        ListInternalOccmDemandSignalCatalogsResponse>() {
                    @Override
                    public ListInternalOccmDemandSignalCatalogsResponse apply(
                            ListInternalOccmDemandSignalCatalogsRequest request) {
                        return client.listInternalOccmDemandSignalCatalogs(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link
     * com.oracle.bmc.capacitymanagement.model.OccmDemandSignalCatalogSummary} objects contained in
     * responses from the listInternalOccmDemandSignalCatalogs operation. This iterable will fetch
     * more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link
     *     com.oracle.bmc.capacitymanagement.model.OccmDemandSignalCatalogSummary} objects contained
     *     in responses received from the service.
     */
    public Iterable<com.oracle.bmc.capacitymanagement.model.OccmDemandSignalCatalogSummary>
            listInternalOccmDemandSignalCatalogsRecordIterator(
                    final ListInternalOccmDemandSignalCatalogsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListInternalOccmDemandSignalCatalogsRequest.Builder,
                ListInternalOccmDemandSignalCatalogsRequest,
                ListInternalOccmDemandSignalCatalogsResponse,
                com.oracle.bmc.capacitymanagement.model.OccmDemandSignalCatalogSummary>(
                new java.util.function.Supplier<
                        ListInternalOccmDemandSignalCatalogsRequest.Builder>() {
                    @Override
                    public ListInternalOccmDemandSignalCatalogsRequest.Builder get() {
                        return ListInternalOccmDemandSignalCatalogsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<
                        ListInternalOccmDemandSignalCatalogsResponse, String>() {
                    @Override
                    public String apply(ListInternalOccmDemandSignalCatalogsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListInternalOccmDemandSignalCatalogsRequest.Builder>,
                        ListInternalOccmDemandSignalCatalogsRequest>() {
                    @Override
                    public ListInternalOccmDemandSignalCatalogsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListInternalOccmDemandSignalCatalogsRequest.Builder>
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
                        ListInternalOccmDemandSignalCatalogsRequest,
                        ListInternalOccmDemandSignalCatalogsResponse>() {
                    @Override
                    public ListInternalOccmDemandSignalCatalogsResponse apply(
                            ListInternalOccmDemandSignalCatalogsRequest request) {
                        return client.listInternalOccmDemandSignalCatalogs(request);
                    }
                },
                new java.util.function.Function<
                        ListInternalOccmDemandSignalCatalogsResponse,
                        java.util.List<
                                com.oracle.bmc.capacitymanagement.model
                                        .OccmDemandSignalCatalogSummary>>() {
                    @Override
                    public java.util.List<
                                    com.oracle.bmc.capacitymanagement.model
                                            .OccmDemandSignalCatalogSummary>
                            apply(ListInternalOccmDemandSignalCatalogsResponse response) {
                        return response.getOccmDemandSignalCatalogCollection().getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the
     * listInternalOccmDemandSignalDeliveries operation. This iterable will fetch more data from the
     * server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses
     *     received from the service.
     */
    public Iterable<ListInternalOccmDemandSignalDeliveriesResponse>
            listInternalOccmDemandSignalDeliveriesResponseIterator(
                    final ListInternalOccmDemandSignalDeliveriesRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListInternalOccmDemandSignalDeliveriesRequest.Builder,
                ListInternalOccmDemandSignalDeliveriesRequest,
                ListInternalOccmDemandSignalDeliveriesResponse>(
                new java.util.function.Supplier<
                        ListInternalOccmDemandSignalDeliveriesRequest.Builder>() {
                    @Override
                    public ListInternalOccmDemandSignalDeliveriesRequest.Builder get() {
                        return ListInternalOccmDemandSignalDeliveriesRequest.builder()
                                .copy(request);
                    }
                },
                new java.util.function.Function<
                        ListInternalOccmDemandSignalDeliveriesResponse, String>() {
                    @Override
                    public String apply(ListInternalOccmDemandSignalDeliveriesResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListInternalOccmDemandSignalDeliveriesRequest.Builder>,
                        ListInternalOccmDemandSignalDeliveriesRequest>() {
                    @Override
                    public ListInternalOccmDemandSignalDeliveriesRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListInternalOccmDemandSignalDeliveriesRequest.Builder>
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
                        ListInternalOccmDemandSignalDeliveriesRequest,
                        ListInternalOccmDemandSignalDeliveriesResponse>() {
                    @Override
                    public ListInternalOccmDemandSignalDeliveriesResponse apply(
                            ListInternalOccmDemandSignalDeliveriesRequest request) {
                        return client.listInternalOccmDemandSignalDeliveries(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link
     * com.oracle.bmc.capacitymanagement.model.InternalOccmDemandSignalDeliverySummary} objects
     * contained in responses from the listInternalOccmDemandSignalDeliveries operation. This
     * iterable will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link
     *     com.oracle.bmc.capacitymanagement.model.InternalOccmDemandSignalDeliverySummary} objects
     *     contained in responses received from the service.
     */
    public Iterable<com.oracle.bmc.capacitymanagement.model.InternalOccmDemandSignalDeliverySummary>
            listInternalOccmDemandSignalDeliveriesRecordIterator(
                    final ListInternalOccmDemandSignalDeliveriesRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListInternalOccmDemandSignalDeliveriesRequest.Builder,
                ListInternalOccmDemandSignalDeliveriesRequest,
                ListInternalOccmDemandSignalDeliveriesResponse,
                com.oracle.bmc.capacitymanagement.model.InternalOccmDemandSignalDeliverySummary>(
                new java.util.function.Supplier<
                        ListInternalOccmDemandSignalDeliveriesRequest.Builder>() {
                    @Override
                    public ListInternalOccmDemandSignalDeliveriesRequest.Builder get() {
                        return ListInternalOccmDemandSignalDeliveriesRequest.builder()
                                .copy(request);
                    }
                },
                new java.util.function.Function<
                        ListInternalOccmDemandSignalDeliveriesResponse, String>() {
                    @Override
                    public String apply(ListInternalOccmDemandSignalDeliveriesResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListInternalOccmDemandSignalDeliveriesRequest.Builder>,
                        ListInternalOccmDemandSignalDeliveriesRequest>() {
                    @Override
                    public ListInternalOccmDemandSignalDeliveriesRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListInternalOccmDemandSignalDeliveriesRequest.Builder>
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
                        ListInternalOccmDemandSignalDeliveriesRequest,
                        ListInternalOccmDemandSignalDeliveriesResponse>() {
                    @Override
                    public ListInternalOccmDemandSignalDeliveriesResponse apply(
                            ListInternalOccmDemandSignalDeliveriesRequest request) {
                        return client.listInternalOccmDemandSignalDeliveries(request);
                    }
                },
                new java.util.function.Function<
                        ListInternalOccmDemandSignalDeliveriesResponse,
                        java.util.List<
                                com.oracle.bmc.capacitymanagement.model
                                        .InternalOccmDemandSignalDeliverySummary>>() {
                    @Override
                    public java.util.List<
                                    com.oracle.bmc.capacitymanagement.model
                                            .InternalOccmDemandSignalDeliverySummary>
                            apply(ListInternalOccmDemandSignalDeliveriesResponse response) {
                        return response.getInternalOccmDemandSignalDeliveryCollection().getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the
     * listInternalOccmDemandSignalItems operation. This iterable will fetch more data from the
     * server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses
     *     received from the service.
     */
    public Iterable<ListInternalOccmDemandSignalItemsResponse>
            listInternalOccmDemandSignalItemsResponseIterator(
                    final ListInternalOccmDemandSignalItemsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListInternalOccmDemandSignalItemsRequest.Builder,
                ListInternalOccmDemandSignalItemsRequest,
                ListInternalOccmDemandSignalItemsResponse>(
                new java.util.function.Supplier<
                        ListInternalOccmDemandSignalItemsRequest.Builder>() {
                    @Override
                    public ListInternalOccmDemandSignalItemsRequest.Builder get() {
                        return ListInternalOccmDemandSignalItemsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<
                        ListInternalOccmDemandSignalItemsResponse, String>() {
                    @Override
                    public String apply(ListInternalOccmDemandSignalItemsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListInternalOccmDemandSignalItemsRequest.Builder>,
                        ListInternalOccmDemandSignalItemsRequest>() {
                    @Override
                    public ListInternalOccmDemandSignalItemsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListInternalOccmDemandSignalItemsRequest.Builder>
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
                        ListInternalOccmDemandSignalItemsRequest,
                        ListInternalOccmDemandSignalItemsResponse>() {
                    @Override
                    public ListInternalOccmDemandSignalItemsResponse apply(
                            ListInternalOccmDemandSignalItemsRequest request) {
                        return client.listInternalOccmDemandSignalItems(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link
     * com.oracle.bmc.capacitymanagement.model.InternalOccmDemandSignalItemSummary} objects
     * contained in responses from the listInternalOccmDemandSignalItems operation. This iterable
     * will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link
     *     com.oracle.bmc.capacitymanagement.model.InternalOccmDemandSignalItemSummary} objects
     *     contained in responses received from the service.
     */
    public Iterable<com.oracle.bmc.capacitymanagement.model.InternalOccmDemandSignalItemSummary>
            listInternalOccmDemandSignalItemsRecordIterator(
                    final ListInternalOccmDemandSignalItemsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListInternalOccmDemandSignalItemsRequest.Builder,
                ListInternalOccmDemandSignalItemsRequest,
                ListInternalOccmDemandSignalItemsResponse,
                com.oracle.bmc.capacitymanagement.model.InternalOccmDemandSignalItemSummary>(
                new java.util.function.Supplier<
                        ListInternalOccmDemandSignalItemsRequest.Builder>() {
                    @Override
                    public ListInternalOccmDemandSignalItemsRequest.Builder get() {
                        return ListInternalOccmDemandSignalItemsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<
                        ListInternalOccmDemandSignalItemsResponse, String>() {
                    @Override
                    public String apply(ListInternalOccmDemandSignalItemsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListInternalOccmDemandSignalItemsRequest.Builder>,
                        ListInternalOccmDemandSignalItemsRequest>() {
                    @Override
                    public ListInternalOccmDemandSignalItemsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListInternalOccmDemandSignalItemsRequest.Builder>
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
                        ListInternalOccmDemandSignalItemsRequest,
                        ListInternalOccmDemandSignalItemsResponse>() {
                    @Override
                    public ListInternalOccmDemandSignalItemsResponse apply(
                            ListInternalOccmDemandSignalItemsRequest request) {
                        return client.listInternalOccmDemandSignalItems(request);
                    }
                },
                new java.util.function.Function<
                        ListInternalOccmDemandSignalItemsResponse,
                        java.util.List<
                                com.oracle.bmc.capacitymanagement.model
                                        .InternalOccmDemandSignalItemSummary>>() {
                    @Override
                    public java.util.List<
                                    com.oracle.bmc.capacitymanagement.model
                                            .InternalOccmDemandSignalItemSummary>
                            apply(ListInternalOccmDemandSignalItemsResponse response) {
                        return response.getInternalOccmDemandSignalItemCollection().getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the
     * listInternalOccmDemandSignals operation. This iterable will fetch more data from the server
     * as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses
     *     received from the service.
     */
    public Iterable<ListInternalOccmDemandSignalsResponse>
            listInternalOccmDemandSignalsResponseIterator(
                    final ListInternalOccmDemandSignalsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListInternalOccmDemandSignalsRequest.Builder,
                ListInternalOccmDemandSignalsRequest,
                ListInternalOccmDemandSignalsResponse>(
                new java.util.function.Supplier<ListInternalOccmDemandSignalsRequest.Builder>() {
                    @Override
                    public ListInternalOccmDemandSignalsRequest.Builder get() {
                        return ListInternalOccmDemandSignalsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListInternalOccmDemandSignalsResponse, String>() {
                    @Override
                    public String apply(ListInternalOccmDemandSignalsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListInternalOccmDemandSignalsRequest.Builder>,
                        ListInternalOccmDemandSignalsRequest>() {
                    @Override
                    public ListInternalOccmDemandSignalsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListInternalOccmDemandSignalsRequest.Builder>
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
                        ListInternalOccmDemandSignalsRequest,
                        ListInternalOccmDemandSignalsResponse>() {
                    @Override
                    public ListInternalOccmDemandSignalsResponse apply(
                            ListInternalOccmDemandSignalsRequest request) {
                        return client.listInternalOccmDemandSignals(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link
     * com.oracle.bmc.capacitymanagement.model.InternalOccmDemandSignalSummary} objects contained in
     * responses from the listInternalOccmDemandSignals operation. This iterable will fetch more
     * data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link
     *     com.oracle.bmc.capacitymanagement.model.InternalOccmDemandSignalSummary} objects
     *     contained in responses received from the service.
     */
    public Iterable<com.oracle.bmc.capacitymanagement.model.InternalOccmDemandSignalSummary>
            listInternalOccmDemandSignalsRecordIterator(
                    final ListInternalOccmDemandSignalsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListInternalOccmDemandSignalsRequest.Builder,
                ListInternalOccmDemandSignalsRequest,
                ListInternalOccmDemandSignalsResponse,
                com.oracle.bmc.capacitymanagement.model.InternalOccmDemandSignalSummary>(
                new java.util.function.Supplier<ListInternalOccmDemandSignalsRequest.Builder>() {
                    @Override
                    public ListInternalOccmDemandSignalsRequest.Builder get() {
                        return ListInternalOccmDemandSignalsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListInternalOccmDemandSignalsResponse, String>() {
                    @Override
                    public String apply(ListInternalOccmDemandSignalsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListInternalOccmDemandSignalsRequest.Builder>,
                        ListInternalOccmDemandSignalsRequest>() {
                    @Override
                    public ListInternalOccmDemandSignalsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListInternalOccmDemandSignalsRequest.Builder>
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
                        ListInternalOccmDemandSignalsRequest,
                        ListInternalOccmDemandSignalsResponse>() {
                    @Override
                    public ListInternalOccmDemandSignalsResponse apply(
                            ListInternalOccmDemandSignalsRequest request) {
                        return client.listInternalOccmDemandSignals(request);
                    }
                },
                new java.util.function.Function<
                        ListInternalOccmDemandSignalsResponse,
                        java.util.List<
                                com.oracle.bmc.capacitymanagement.model
                                        .InternalOccmDemandSignalSummary>>() {
                    @Override
                    public java.util.List<
                                    com.oracle.bmc.capacitymanagement.model
                                            .InternalOccmDemandSignalSummary>
                            apply(ListInternalOccmDemandSignalsResponse response) {
                        return response.getInternalOccmDemandSignalCollection().getItems();
                    }
                });
    }
}

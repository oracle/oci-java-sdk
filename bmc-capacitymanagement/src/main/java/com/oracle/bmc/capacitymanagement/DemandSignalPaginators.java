/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.capacitymanagement;

import com.oracle.bmc.capacitymanagement.requests.*;
import com.oracle.bmc.capacitymanagement.responses.*;

/**
 * Collection of helper methods that can be used to provide an {@link java.lang.Iterable} interface
 * to any list operations of DemandSignal where multiple pages of data may be fetched. Two styles of
 * iteration are supported:
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
public class DemandSignalPaginators {
    private final DemandSignal client;

    public DemandSignalPaginators(DemandSignal client) {
        this.client = client;
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the
     * listOccmDemandSignalCatalogResources operation. This iterable will fetch more data from the
     * server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses
     *     received from the service.
     */
    public Iterable<ListOccmDemandSignalCatalogResourcesResponse>
            listOccmDemandSignalCatalogResourcesResponseIterator(
                    final ListOccmDemandSignalCatalogResourcesRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListOccmDemandSignalCatalogResourcesRequest.Builder,
                ListOccmDemandSignalCatalogResourcesRequest,
                ListOccmDemandSignalCatalogResourcesResponse>(
                new java.util.function.Supplier<
                        ListOccmDemandSignalCatalogResourcesRequest.Builder>() {
                    @Override
                    public ListOccmDemandSignalCatalogResourcesRequest.Builder get() {
                        return ListOccmDemandSignalCatalogResourcesRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<
                        ListOccmDemandSignalCatalogResourcesResponse, String>() {
                    @Override
                    public String apply(ListOccmDemandSignalCatalogResourcesResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListOccmDemandSignalCatalogResourcesRequest.Builder>,
                        ListOccmDemandSignalCatalogResourcesRequest>() {
                    @Override
                    public ListOccmDemandSignalCatalogResourcesRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListOccmDemandSignalCatalogResourcesRequest.Builder>
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
                        ListOccmDemandSignalCatalogResourcesRequest,
                        ListOccmDemandSignalCatalogResourcesResponse>() {
                    @Override
                    public ListOccmDemandSignalCatalogResourcesResponse apply(
                            ListOccmDemandSignalCatalogResourcesRequest request) {
                        return client.listOccmDemandSignalCatalogResources(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link
     * com.oracle.bmc.capacitymanagement.model.OccmDemandSignalCatalogResourceSummary} objects
     * contained in responses from the listOccmDemandSignalCatalogResources operation. This iterable
     * will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link
     *     com.oracle.bmc.capacitymanagement.model.OccmDemandSignalCatalogResourceSummary} objects
     *     contained in responses received from the service.
     */
    public Iterable<com.oracle.bmc.capacitymanagement.model.OccmDemandSignalCatalogResourceSummary>
            listOccmDemandSignalCatalogResourcesRecordIterator(
                    final ListOccmDemandSignalCatalogResourcesRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListOccmDemandSignalCatalogResourcesRequest.Builder,
                ListOccmDemandSignalCatalogResourcesRequest,
                ListOccmDemandSignalCatalogResourcesResponse,
                com.oracle.bmc.capacitymanagement.model.OccmDemandSignalCatalogResourceSummary>(
                new java.util.function.Supplier<
                        ListOccmDemandSignalCatalogResourcesRequest.Builder>() {
                    @Override
                    public ListOccmDemandSignalCatalogResourcesRequest.Builder get() {
                        return ListOccmDemandSignalCatalogResourcesRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<
                        ListOccmDemandSignalCatalogResourcesResponse, String>() {
                    @Override
                    public String apply(ListOccmDemandSignalCatalogResourcesResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListOccmDemandSignalCatalogResourcesRequest.Builder>,
                        ListOccmDemandSignalCatalogResourcesRequest>() {
                    @Override
                    public ListOccmDemandSignalCatalogResourcesRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListOccmDemandSignalCatalogResourcesRequest.Builder>
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
                        ListOccmDemandSignalCatalogResourcesRequest,
                        ListOccmDemandSignalCatalogResourcesResponse>() {
                    @Override
                    public ListOccmDemandSignalCatalogResourcesResponse apply(
                            ListOccmDemandSignalCatalogResourcesRequest request) {
                        return client.listOccmDemandSignalCatalogResources(request);
                    }
                },
                new java.util.function.Function<
                        ListOccmDemandSignalCatalogResourcesResponse,
                        java.util.List<
                                com.oracle.bmc.capacitymanagement.model
                                        .OccmDemandSignalCatalogResourceSummary>>() {
                    @Override
                    public java.util.List<
                                    com.oracle.bmc.capacitymanagement.model
                                            .OccmDemandSignalCatalogResourceSummary>
                            apply(ListOccmDemandSignalCatalogResourcesResponse response) {
                        return response.getOccmDemandSignalCatalogResourceCollection().getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the
     * listOccmDemandSignalDeliveries operation. This iterable will fetch more data from the server
     * as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses
     *     received from the service.
     */
    public Iterable<ListOccmDemandSignalDeliveriesResponse>
            listOccmDemandSignalDeliveriesResponseIterator(
                    final ListOccmDemandSignalDeliveriesRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListOccmDemandSignalDeliveriesRequest.Builder,
                ListOccmDemandSignalDeliveriesRequest,
                ListOccmDemandSignalDeliveriesResponse>(
                new java.util.function.Supplier<ListOccmDemandSignalDeliveriesRequest.Builder>() {
                    @Override
                    public ListOccmDemandSignalDeliveriesRequest.Builder get() {
                        return ListOccmDemandSignalDeliveriesRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListOccmDemandSignalDeliveriesResponse, String>() {
                    @Override
                    public String apply(ListOccmDemandSignalDeliveriesResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListOccmDemandSignalDeliveriesRequest.Builder>,
                        ListOccmDemandSignalDeliveriesRequest>() {
                    @Override
                    public ListOccmDemandSignalDeliveriesRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListOccmDemandSignalDeliveriesRequest.Builder>
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
                        ListOccmDemandSignalDeliveriesRequest,
                        ListOccmDemandSignalDeliveriesResponse>() {
                    @Override
                    public ListOccmDemandSignalDeliveriesResponse apply(
                            ListOccmDemandSignalDeliveriesRequest request) {
                        return client.listOccmDemandSignalDeliveries(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link
     * com.oracle.bmc.capacitymanagement.model.OccmDemandSignalDeliverySummary} objects contained in
     * responses from the listOccmDemandSignalDeliveries operation. This iterable will fetch more
     * data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link
     *     com.oracle.bmc.capacitymanagement.model.OccmDemandSignalDeliverySummary} objects
     *     contained in responses received from the service.
     */
    public Iterable<com.oracle.bmc.capacitymanagement.model.OccmDemandSignalDeliverySummary>
            listOccmDemandSignalDeliveriesRecordIterator(
                    final ListOccmDemandSignalDeliveriesRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListOccmDemandSignalDeliveriesRequest.Builder,
                ListOccmDemandSignalDeliveriesRequest,
                ListOccmDemandSignalDeliveriesResponse,
                com.oracle.bmc.capacitymanagement.model.OccmDemandSignalDeliverySummary>(
                new java.util.function.Supplier<ListOccmDemandSignalDeliveriesRequest.Builder>() {
                    @Override
                    public ListOccmDemandSignalDeliveriesRequest.Builder get() {
                        return ListOccmDemandSignalDeliveriesRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListOccmDemandSignalDeliveriesResponse, String>() {
                    @Override
                    public String apply(ListOccmDemandSignalDeliveriesResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListOccmDemandSignalDeliveriesRequest.Builder>,
                        ListOccmDemandSignalDeliveriesRequest>() {
                    @Override
                    public ListOccmDemandSignalDeliveriesRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListOccmDemandSignalDeliveriesRequest.Builder>
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
                        ListOccmDemandSignalDeliveriesRequest,
                        ListOccmDemandSignalDeliveriesResponse>() {
                    @Override
                    public ListOccmDemandSignalDeliveriesResponse apply(
                            ListOccmDemandSignalDeliveriesRequest request) {
                        return client.listOccmDemandSignalDeliveries(request);
                    }
                },
                new java.util.function.Function<
                        ListOccmDemandSignalDeliveriesResponse,
                        java.util.List<
                                com.oracle.bmc.capacitymanagement.model
                                        .OccmDemandSignalDeliverySummary>>() {
                    @Override
                    public java.util.List<
                                    com.oracle.bmc.capacitymanagement.model
                                            .OccmDemandSignalDeliverySummary>
                            apply(ListOccmDemandSignalDeliveriesResponse response) {
                        return response.getOccmDemandSignalDeliveryCollection().getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the
     * listOccmDemandSignalItems operation. This iterable will fetch more data from the server as
     * needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses
     *     received from the service.
     */
    public Iterable<ListOccmDemandSignalItemsResponse> listOccmDemandSignalItemsResponseIterator(
            final ListOccmDemandSignalItemsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListOccmDemandSignalItemsRequest.Builder,
                ListOccmDemandSignalItemsRequest,
                ListOccmDemandSignalItemsResponse>(
                new java.util.function.Supplier<ListOccmDemandSignalItemsRequest.Builder>() {
                    @Override
                    public ListOccmDemandSignalItemsRequest.Builder get() {
                        return ListOccmDemandSignalItemsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListOccmDemandSignalItemsResponse, String>() {
                    @Override
                    public String apply(ListOccmDemandSignalItemsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListOccmDemandSignalItemsRequest.Builder>,
                        ListOccmDemandSignalItemsRequest>() {
                    @Override
                    public ListOccmDemandSignalItemsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListOccmDemandSignalItemsRequest.Builder>
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
                        ListOccmDemandSignalItemsRequest, ListOccmDemandSignalItemsResponse>() {
                    @Override
                    public ListOccmDemandSignalItemsResponse apply(
                            ListOccmDemandSignalItemsRequest request) {
                        return client.listOccmDemandSignalItems(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link
     * com.oracle.bmc.capacitymanagement.model.OccmDemandSignalItemSummary} objects contained in
     * responses from the listOccmDemandSignalItems operation. This iterable will fetch more data
     * from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link
     *     com.oracle.bmc.capacitymanagement.model.OccmDemandSignalItemSummary} objects contained in
     *     responses received from the service.
     */
    public Iterable<com.oracle.bmc.capacitymanagement.model.OccmDemandSignalItemSummary>
            listOccmDemandSignalItemsRecordIterator(
                    final ListOccmDemandSignalItemsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListOccmDemandSignalItemsRequest.Builder,
                ListOccmDemandSignalItemsRequest,
                ListOccmDemandSignalItemsResponse,
                com.oracle.bmc.capacitymanagement.model.OccmDemandSignalItemSummary>(
                new java.util.function.Supplier<ListOccmDemandSignalItemsRequest.Builder>() {
                    @Override
                    public ListOccmDemandSignalItemsRequest.Builder get() {
                        return ListOccmDemandSignalItemsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListOccmDemandSignalItemsResponse, String>() {
                    @Override
                    public String apply(ListOccmDemandSignalItemsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListOccmDemandSignalItemsRequest.Builder>,
                        ListOccmDemandSignalItemsRequest>() {
                    @Override
                    public ListOccmDemandSignalItemsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListOccmDemandSignalItemsRequest.Builder>
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
                        ListOccmDemandSignalItemsRequest, ListOccmDemandSignalItemsResponse>() {
                    @Override
                    public ListOccmDemandSignalItemsResponse apply(
                            ListOccmDemandSignalItemsRequest request) {
                        return client.listOccmDemandSignalItems(request);
                    }
                },
                new java.util.function.Function<
                        ListOccmDemandSignalItemsResponse,
                        java.util.List<
                                com.oracle.bmc.capacitymanagement.model
                                        .OccmDemandSignalItemSummary>>() {
                    @Override
                    public java.util.List<
                                    com.oracle.bmc.capacitymanagement.model
                                            .OccmDemandSignalItemSummary>
                            apply(ListOccmDemandSignalItemsResponse response) {
                        return response.getOccmDemandSignalItemCollection().getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the
     * listOccmDemandSignals operation. This iterable will fetch more data from the server as
     * needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses
     *     received from the service.
     */
    public Iterable<ListOccmDemandSignalsResponse> listOccmDemandSignalsResponseIterator(
            final ListOccmDemandSignalsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListOccmDemandSignalsRequest.Builder,
                ListOccmDemandSignalsRequest,
                ListOccmDemandSignalsResponse>(
                new java.util.function.Supplier<ListOccmDemandSignalsRequest.Builder>() {
                    @Override
                    public ListOccmDemandSignalsRequest.Builder get() {
                        return ListOccmDemandSignalsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListOccmDemandSignalsResponse, String>() {
                    @Override
                    public String apply(ListOccmDemandSignalsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListOccmDemandSignalsRequest.Builder>,
                        ListOccmDemandSignalsRequest>() {
                    @Override
                    public ListOccmDemandSignalsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListOccmDemandSignalsRequest.Builder>
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
                        ListOccmDemandSignalsRequest, ListOccmDemandSignalsResponse>() {
                    @Override
                    public ListOccmDemandSignalsResponse apply(
                            ListOccmDemandSignalsRequest request) {
                        return client.listOccmDemandSignals(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link
     * com.oracle.bmc.capacitymanagement.model.OccmDemandSignalSummary} objects contained in
     * responses from the listOccmDemandSignals operation. This iterable will fetch more data from
     * the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link
     *     com.oracle.bmc.capacitymanagement.model.OccmDemandSignalSummary} objects contained in
     *     responses received from the service.
     */
    public Iterable<com.oracle.bmc.capacitymanagement.model.OccmDemandSignalSummary>
            listOccmDemandSignalsRecordIterator(final ListOccmDemandSignalsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListOccmDemandSignalsRequest.Builder,
                ListOccmDemandSignalsRequest,
                ListOccmDemandSignalsResponse,
                com.oracle.bmc.capacitymanagement.model.OccmDemandSignalSummary>(
                new java.util.function.Supplier<ListOccmDemandSignalsRequest.Builder>() {
                    @Override
                    public ListOccmDemandSignalsRequest.Builder get() {
                        return ListOccmDemandSignalsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListOccmDemandSignalsResponse, String>() {
                    @Override
                    public String apply(ListOccmDemandSignalsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListOccmDemandSignalsRequest.Builder>,
                        ListOccmDemandSignalsRequest>() {
                    @Override
                    public ListOccmDemandSignalsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListOccmDemandSignalsRequest.Builder>
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
                        ListOccmDemandSignalsRequest, ListOccmDemandSignalsResponse>() {
                    @Override
                    public ListOccmDemandSignalsResponse apply(
                            ListOccmDemandSignalsRequest request) {
                        return client.listOccmDemandSignals(request);
                    }
                },
                new java.util.function.Function<
                        ListOccmDemandSignalsResponse,
                        java.util.List<
                                com.oracle.bmc.capacitymanagement.model
                                        .OccmDemandSignalSummary>>() {
                    @Override
                    public java.util.List<
                                    com.oracle.bmc.capacitymanagement.model.OccmDemandSignalSummary>
                            apply(ListOccmDemandSignalsResponse response) {
                        return response.getOccmDemandSignalCollection().getItems();
                    }
                });
    }
}

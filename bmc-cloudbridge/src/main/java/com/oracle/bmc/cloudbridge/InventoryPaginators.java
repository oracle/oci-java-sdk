/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.cloudbridge;

import com.oracle.bmc.cloudbridge.requests.*;
import com.oracle.bmc.cloudbridge.responses.*;

/**
 * Collection of helper methods that can be used to provide an {@link java.lang.Iterable} interface
 * to any list operations of Inventory where multiple pages of data may be fetched. Two styles of
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
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20220509")
public class InventoryPaginators {
    private final Inventory client;

    public InventoryPaginators(Inventory client) {
        this.client = client;
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the listAssets
     * operation. This iterable will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses
     *     received from the service.
     */
    public Iterable<ListAssetsResponse> listAssetsResponseIterator(
            final ListAssetsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListAssetsRequest.Builder, ListAssetsRequest, ListAssetsResponse>(
                new java.util.function.Supplier<ListAssetsRequest.Builder>() {
                    @Override
                    public ListAssetsRequest.Builder get() {
                        return ListAssetsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListAssetsResponse, String>() {
                    @Override
                    public String apply(ListAssetsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListAssetsRequest.Builder>,
                        ListAssetsRequest>() {
                    @Override
                    public ListAssetsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListAssetsRequest.Builder>
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
                new java.util.function.Function<ListAssetsRequest, ListAssetsResponse>() {
                    @Override
                    public ListAssetsResponse apply(ListAssetsRequest request) {
                        return client.listAssets(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link
     * com.oracle.bmc.cloudbridge.model.AssetSummary} objects contained in responses from the
     * listAssets operation. This iterable will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link
     *     com.oracle.bmc.cloudbridge.model.AssetSummary} objects contained in responses received
     *     from the service.
     */
    public Iterable<com.oracle.bmc.cloudbridge.model.AssetSummary> listAssetsRecordIterator(
            final ListAssetsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListAssetsRequest.Builder,
                ListAssetsRequest,
                ListAssetsResponse,
                com.oracle.bmc.cloudbridge.model.AssetSummary>(
                new java.util.function.Supplier<ListAssetsRequest.Builder>() {
                    @Override
                    public ListAssetsRequest.Builder get() {
                        return ListAssetsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListAssetsResponse, String>() {
                    @Override
                    public String apply(ListAssetsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListAssetsRequest.Builder>,
                        ListAssetsRequest>() {
                    @Override
                    public ListAssetsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListAssetsRequest.Builder>
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
                new java.util.function.Function<ListAssetsRequest, ListAssetsResponse>() {
                    @Override
                    public ListAssetsResponse apply(ListAssetsRequest request) {
                        return client.listAssets(request);
                    }
                },
                new java.util.function.Function<
                        ListAssetsResponse,
                        java.util.List<com.oracle.bmc.cloudbridge.model.AssetSummary>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.cloudbridge.model.AssetSummary> apply(
                            ListAssetsResponse response) {
                        return response.getAssetCollection().getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the
     * listHistoricalMetrics operation. This iterable will fetch more data from the server as
     * needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses
     *     received from the service.
     */
    public Iterable<ListHistoricalMetricsResponse> listHistoricalMetricsResponseIterator(
            final ListHistoricalMetricsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListHistoricalMetricsRequest.Builder,
                ListHistoricalMetricsRequest,
                ListHistoricalMetricsResponse>(
                new java.util.function.Supplier<ListHistoricalMetricsRequest.Builder>() {
                    @Override
                    public ListHistoricalMetricsRequest.Builder get() {
                        return ListHistoricalMetricsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListHistoricalMetricsResponse, String>() {
                    @Override
                    public String apply(ListHistoricalMetricsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListHistoricalMetricsRequest.Builder>,
                        ListHistoricalMetricsRequest>() {
                    @Override
                    public ListHistoricalMetricsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListHistoricalMetricsRequest.Builder>
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
                        ListHistoricalMetricsRequest, ListHistoricalMetricsResponse>() {
                    @Override
                    public ListHistoricalMetricsResponse apply(
                            ListHistoricalMetricsRequest request) {
                        return client.listHistoricalMetrics(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link
     * com.oracle.bmc.cloudbridge.model.HistoricalMetricSummary} objects contained in responses from
     * the listHistoricalMetrics operation. This iterable will fetch more data from the server as
     * needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link
     *     com.oracle.bmc.cloudbridge.model.HistoricalMetricSummary} objects contained in responses
     *     received from the service.
     */
    public Iterable<com.oracle.bmc.cloudbridge.model.HistoricalMetricSummary>
            listHistoricalMetricsRecordIterator(final ListHistoricalMetricsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListHistoricalMetricsRequest.Builder,
                ListHistoricalMetricsRequest,
                ListHistoricalMetricsResponse,
                com.oracle.bmc.cloudbridge.model.HistoricalMetricSummary>(
                new java.util.function.Supplier<ListHistoricalMetricsRequest.Builder>() {
                    @Override
                    public ListHistoricalMetricsRequest.Builder get() {
                        return ListHistoricalMetricsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListHistoricalMetricsResponse, String>() {
                    @Override
                    public String apply(ListHistoricalMetricsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListHistoricalMetricsRequest.Builder>,
                        ListHistoricalMetricsRequest>() {
                    @Override
                    public ListHistoricalMetricsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListHistoricalMetricsRequest.Builder>
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
                        ListHistoricalMetricsRequest, ListHistoricalMetricsResponse>() {
                    @Override
                    public ListHistoricalMetricsResponse apply(
                            ListHistoricalMetricsRequest request) {
                        return client.listHistoricalMetrics(request);
                    }
                },
                new java.util.function.Function<
                        ListHistoricalMetricsResponse,
                        java.util.List<
                                com.oracle.bmc.cloudbridge.model.HistoricalMetricSummary>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.cloudbridge.model.HistoricalMetricSummary>
                            apply(ListHistoricalMetricsResponse response) {
                        return response.getHistoricalMetricCollection().getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the
     * listInventories operation. This iterable will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses
     *     received from the service.
     */
    public Iterable<ListInventoriesResponse> listInventoriesResponseIterator(
            final ListInventoriesRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListInventoriesRequest.Builder, ListInventoriesRequest, ListInventoriesResponse>(
                new java.util.function.Supplier<ListInventoriesRequest.Builder>() {
                    @Override
                    public ListInventoriesRequest.Builder get() {
                        return ListInventoriesRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListInventoriesResponse, String>() {
                    @Override
                    public String apply(ListInventoriesResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListInventoriesRequest.Builder>,
                        ListInventoriesRequest>() {
                    @Override
                    public ListInventoriesRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListInventoriesRequest.Builder>
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
                new java.util.function.Function<ListInventoriesRequest, ListInventoriesResponse>() {
                    @Override
                    public ListInventoriesResponse apply(ListInventoriesRequest request) {
                        return client.listInventories(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link
     * com.oracle.bmc.cloudbridge.model.InventorySummary} objects contained in responses from the
     * listInventories operation. This iterable will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link
     *     com.oracle.bmc.cloudbridge.model.InventorySummary} objects contained in responses
     *     received from the service.
     */
    public Iterable<com.oracle.bmc.cloudbridge.model.InventorySummary>
            listInventoriesRecordIterator(final ListInventoriesRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListInventoriesRequest.Builder,
                ListInventoriesRequest,
                ListInventoriesResponse,
                com.oracle.bmc.cloudbridge.model.InventorySummary>(
                new java.util.function.Supplier<ListInventoriesRequest.Builder>() {
                    @Override
                    public ListInventoriesRequest.Builder get() {
                        return ListInventoriesRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListInventoriesResponse, String>() {
                    @Override
                    public String apply(ListInventoriesResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListInventoriesRequest.Builder>,
                        ListInventoriesRequest>() {
                    @Override
                    public ListInventoriesRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListInventoriesRequest.Builder>
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
                new java.util.function.Function<ListInventoriesRequest, ListInventoriesResponse>() {
                    @Override
                    public ListInventoriesResponse apply(ListInventoriesRequest request) {
                        return client.listInventories(request);
                    }
                },
                new java.util.function.Function<
                        ListInventoriesResponse,
                        java.util.List<com.oracle.bmc.cloudbridge.model.InventorySummary>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.cloudbridge.model.InventorySummary> apply(
                            ListInventoriesResponse response) {
                        return response.getInventoryCollection().getItems();
                    }
                });
    }
}

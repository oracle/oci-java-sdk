/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.cloudbridge;

import com.oracle.bmc.cloudbridge.requests.*;
import com.oracle.bmc.cloudbridge.responses.*;

/**
 * Collection of helper methods that can be used to provide an {@link java.lang.Iterable} interface
 * to any list operations of Discovery where multiple pages of data may be fetched.
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
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20220509")
public class DiscoveryPaginators {
    private final Discovery client;

    public DiscoveryPaginators(Discovery client) {
        this.client = client;
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the listAssetSourceConnections operation. This iterable
     * will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses received from the service.
     */
    public Iterable<ListAssetSourceConnectionsResponse> listAssetSourceConnectionsResponseIterator(
            final ListAssetSourceConnectionsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListAssetSourceConnectionsRequest.Builder, ListAssetSourceConnectionsRequest,
                ListAssetSourceConnectionsResponse>(
                new java.util.function.Supplier<ListAssetSourceConnectionsRequest.Builder>() {
                    @Override
                    public ListAssetSourceConnectionsRequest.Builder get() {
                        return ListAssetSourceConnectionsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListAssetSourceConnectionsResponse, String>() {
                    @Override
                    public String apply(ListAssetSourceConnectionsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListAssetSourceConnectionsRequest.Builder>,
                        ListAssetSourceConnectionsRequest>() {
                    @Override
                    public ListAssetSourceConnectionsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListAssetSourceConnectionsRequest.Builder>
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
                        ListAssetSourceConnectionsRequest, ListAssetSourceConnectionsResponse>() {
                    @Override
                    public ListAssetSourceConnectionsResponse apply(
                            ListAssetSourceConnectionsRequest request) {
                        return client.listAssetSourceConnections(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link com.oracle.bmc.cloudbridge.model.AssetSourceConnection} objects
     * contained in responses from the listAssetSourceConnections operation. This iterable will fetch more data from the
     * server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link com.oracle.bmc.cloudbridge.model.AssetSourceConnection} objects
     * contained in responses received from the service.
     */
    public Iterable<com.oracle.bmc.cloudbridge.model.AssetSourceConnection>
            listAssetSourceConnectionsRecordIterator(
                    final ListAssetSourceConnectionsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListAssetSourceConnectionsRequest.Builder, ListAssetSourceConnectionsRequest,
                ListAssetSourceConnectionsResponse,
                com.oracle.bmc.cloudbridge.model.AssetSourceConnection>(
                new java.util.function.Supplier<ListAssetSourceConnectionsRequest.Builder>() {
                    @Override
                    public ListAssetSourceConnectionsRequest.Builder get() {
                        return ListAssetSourceConnectionsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListAssetSourceConnectionsResponse, String>() {
                    @Override
                    public String apply(ListAssetSourceConnectionsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListAssetSourceConnectionsRequest.Builder>,
                        ListAssetSourceConnectionsRequest>() {
                    @Override
                    public ListAssetSourceConnectionsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListAssetSourceConnectionsRequest.Builder>
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
                        ListAssetSourceConnectionsRequest, ListAssetSourceConnectionsResponse>() {
                    @Override
                    public ListAssetSourceConnectionsResponse apply(
                            ListAssetSourceConnectionsRequest request) {
                        return client.listAssetSourceConnections(request);
                    }
                },
                new java.util.function.Function<
                        ListAssetSourceConnectionsResponse,
                        java.util.List<com.oracle.bmc.cloudbridge.model.AssetSourceConnection>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.cloudbridge.model.AssetSourceConnection>
                            apply(ListAssetSourceConnectionsResponse response) {
                        return response.getAssetSourceConnectionCollection().getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the listAssetSources operation. This iterable
     * will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses received from the service.
     */
    public Iterable<ListAssetSourcesResponse> listAssetSourcesResponseIterator(
            final ListAssetSourcesRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListAssetSourcesRequest.Builder, ListAssetSourcesRequest, ListAssetSourcesResponse>(
                new java.util.function.Supplier<ListAssetSourcesRequest.Builder>() {
                    @Override
                    public ListAssetSourcesRequest.Builder get() {
                        return ListAssetSourcesRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListAssetSourcesResponse, String>() {
                    @Override
                    public String apply(ListAssetSourcesResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListAssetSourcesRequest.Builder>,
                        ListAssetSourcesRequest>() {
                    @Override
                    public ListAssetSourcesRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListAssetSourcesRequest.Builder>
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
                        ListAssetSourcesRequest, ListAssetSourcesResponse>() {
                    @Override
                    public ListAssetSourcesResponse apply(ListAssetSourcesRequest request) {
                        return client.listAssetSources(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link com.oracle.bmc.cloudbridge.model.AssetSourceSummary} objects
     * contained in responses from the listAssetSources operation. This iterable will fetch more data from the
     * server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link com.oracle.bmc.cloudbridge.model.AssetSourceSummary} objects
     * contained in responses received from the service.
     */
    public Iterable<com.oracle.bmc.cloudbridge.model.AssetSourceSummary>
            listAssetSourcesRecordIterator(final ListAssetSourcesRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListAssetSourcesRequest.Builder, ListAssetSourcesRequest, ListAssetSourcesResponse,
                com.oracle.bmc.cloudbridge.model.AssetSourceSummary>(
                new java.util.function.Supplier<ListAssetSourcesRequest.Builder>() {
                    @Override
                    public ListAssetSourcesRequest.Builder get() {
                        return ListAssetSourcesRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListAssetSourcesResponse, String>() {
                    @Override
                    public String apply(ListAssetSourcesResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListAssetSourcesRequest.Builder>,
                        ListAssetSourcesRequest>() {
                    @Override
                    public ListAssetSourcesRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListAssetSourcesRequest.Builder>
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
                        ListAssetSourcesRequest, ListAssetSourcesResponse>() {
                    @Override
                    public ListAssetSourcesResponse apply(ListAssetSourcesRequest request) {
                        return client.listAssetSources(request);
                    }
                },
                new java.util.function.Function<
                        ListAssetSourcesResponse,
                        java.util.List<com.oracle.bmc.cloudbridge.model.AssetSourceSummary>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.cloudbridge.model.AssetSourceSummary>
                            apply(ListAssetSourcesResponse response) {
                        return response.getAssetSourceCollection().getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the listDiscoverySchedules operation. This iterable
     * will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses received from the service.
     */
    public Iterable<ListDiscoverySchedulesResponse> listDiscoverySchedulesResponseIterator(
            final ListDiscoverySchedulesRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListDiscoverySchedulesRequest.Builder, ListDiscoverySchedulesRequest,
                ListDiscoverySchedulesResponse>(
                new java.util.function.Supplier<ListDiscoverySchedulesRequest.Builder>() {
                    @Override
                    public ListDiscoverySchedulesRequest.Builder get() {
                        return ListDiscoverySchedulesRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListDiscoverySchedulesResponse, String>() {
                    @Override
                    public String apply(ListDiscoverySchedulesResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListDiscoverySchedulesRequest.Builder>,
                        ListDiscoverySchedulesRequest>() {
                    @Override
                    public ListDiscoverySchedulesRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListDiscoverySchedulesRequest.Builder>
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
                        ListDiscoverySchedulesRequest, ListDiscoverySchedulesResponse>() {
                    @Override
                    public ListDiscoverySchedulesResponse apply(
                            ListDiscoverySchedulesRequest request) {
                        return client.listDiscoverySchedules(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link com.oracle.bmc.cloudbridge.model.DiscoveryScheduleSummary} objects
     * contained in responses from the listDiscoverySchedules operation. This iterable will fetch more data from the
     * server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link com.oracle.bmc.cloudbridge.model.DiscoveryScheduleSummary} objects
     * contained in responses received from the service.
     */
    public Iterable<com.oracle.bmc.cloudbridge.model.DiscoveryScheduleSummary>
            listDiscoverySchedulesRecordIterator(final ListDiscoverySchedulesRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListDiscoverySchedulesRequest.Builder, ListDiscoverySchedulesRequest,
                ListDiscoverySchedulesResponse,
                com.oracle.bmc.cloudbridge.model.DiscoveryScheduleSummary>(
                new java.util.function.Supplier<ListDiscoverySchedulesRequest.Builder>() {
                    @Override
                    public ListDiscoverySchedulesRequest.Builder get() {
                        return ListDiscoverySchedulesRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListDiscoverySchedulesResponse, String>() {
                    @Override
                    public String apply(ListDiscoverySchedulesResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListDiscoverySchedulesRequest.Builder>,
                        ListDiscoverySchedulesRequest>() {
                    @Override
                    public ListDiscoverySchedulesRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListDiscoverySchedulesRequest.Builder>
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
                        ListDiscoverySchedulesRequest, ListDiscoverySchedulesResponse>() {
                    @Override
                    public ListDiscoverySchedulesResponse apply(
                            ListDiscoverySchedulesRequest request) {
                        return client.listDiscoverySchedules(request);
                    }
                },
                new java.util.function.Function<
                        ListDiscoverySchedulesResponse,
                        java.util.List<
                                com.oracle.bmc.cloudbridge.model.DiscoveryScheduleSummary>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.cloudbridge.model.DiscoveryScheduleSummary>
                            apply(ListDiscoverySchedulesResponse response) {
                        return response.getDiscoveryScheduleCollection().getItems();
                    }
                });
    }
}

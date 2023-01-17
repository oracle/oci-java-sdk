/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.dataconnectivity;

import com.oracle.bmc.dataconnectivity.requests.*;
import com.oracle.bmc.dataconnectivity.responses.*;

/**
 * Collection of helper methods that can be used to provide an {@link java.lang.Iterable} interface
 * to any list operations of DataConnectivityManagement where multiple pages of data may be fetched.
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
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20210217")
public class DataConnectivityManagementPaginators {
    private final DataConnectivityManagement client;

    public DataConnectivityManagementPaginators(DataConnectivityManagement client) {
        this.client = client;
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the listConnections operation. This iterable
     * will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses received from the service.
     */
    public Iterable<ListConnectionsResponse> listConnectionsResponseIterator(
            final ListConnectionsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListConnectionsRequest.Builder, ListConnectionsRequest, ListConnectionsResponse>(
                new java.util.function.Supplier<ListConnectionsRequest.Builder>() {
                    @Override
                    public ListConnectionsRequest.Builder get() {
                        return ListConnectionsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListConnectionsResponse, String>() {
                    @Override
                    public String apply(ListConnectionsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListConnectionsRequest.Builder>,
                        ListConnectionsRequest>() {
                    @Override
                    public ListConnectionsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListConnectionsRequest.Builder>
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
                new java.util.function.Function<ListConnectionsRequest, ListConnectionsResponse>() {
                    @Override
                    public ListConnectionsResponse apply(ListConnectionsRequest request) {
                        return client.listConnections(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link com.oracle.bmc.dataconnectivity.model.ConnectionSummary} objects
     * contained in responses from the listConnections operation. This iterable will fetch more data from the
     * server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link com.oracle.bmc.dataconnectivity.model.ConnectionSummary} objects
     * contained in responses received from the service.
     */
    public Iterable<com.oracle.bmc.dataconnectivity.model.ConnectionSummary>
            listConnectionsRecordIterator(final ListConnectionsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListConnectionsRequest.Builder, ListConnectionsRequest, ListConnectionsResponse,
                com.oracle.bmc.dataconnectivity.model.ConnectionSummary>(
                new java.util.function.Supplier<ListConnectionsRequest.Builder>() {
                    @Override
                    public ListConnectionsRequest.Builder get() {
                        return ListConnectionsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListConnectionsResponse, String>() {
                    @Override
                    public String apply(ListConnectionsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListConnectionsRequest.Builder>,
                        ListConnectionsRequest>() {
                    @Override
                    public ListConnectionsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListConnectionsRequest.Builder>
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
                new java.util.function.Function<ListConnectionsRequest, ListConnectionsResponse>() {
                    @Override
                    public ListConnectionsResponse apply(ListConnectionsRequest request) {
                        return client.listConnections(request);
                    }
                },
                new java.util.function.Function<
                        ListConnectionsResponse,
                        java.util.List<com.oracle.bmc.dataconnectivity.model.ConnectionSummary>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.dataconnectivity.model.ConnectionSummary>
                            apply(ListConnectionsResponse response) {
                        return response.getConnectionSummaryCollection().getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the listDataAssets operation. This iterable
     * will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses received from the service.
     */
    public Iterable<ListDataAssetsResponse> listDataAssetsResponseIterator(
            final ListDataAssetsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListDataAssetsRequest.Builder, ListDataAssetsRequest, ListDataAssetsResponse>(
                new java.util.function.Supplier<ListDataAssetsRequest.Builder>() {
                    @Override
                    public ListDataAssetsRequest.Builder get() {
                        return ListDataAssetsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListDataAssetsResponse, String>() {
                    @Override
                    public String apply(ListDataAssetsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListDataAssetsRequest.Builder>,
                        ListDataAssetsRequest>() {
                    @Override
                    public ListDataAssetsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListDataAssetsRequest.Builder>
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
                new java.util.function.Function<ListDataAssetsRequest, ListDataAssetsResponse>() {
                    @Override
                    public ListDataAssetsResponse apply(ListDataAssetsRequest request) {
                        return client.listDataAssets(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link com.oracle.bmc.dataconnectivity.model.DataAssetSummary} objects
     * contained in responses from the listDataAssets operation. This iterable will fetch more data from the
     * server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link com.oracle.bmc.dataconnectivity.model.DataAssetSummary} objects
     * contained in responses received from the service.
     */
    public Iterable<com.oracle.bmc.dataconnectivity.model.DataAssetSummary>
            listDataAssetsRecordIterator(final ListDataAssetsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListDataAssetsRequest.Builder, ListDataAssetsRequest, ListDataAssetsResponse,
                com.oracle.bmc.dataconnectivity.model.DataAssetSummary>(
                new java.util.function.Supplier<ListDataAssetsRequest.Builder>() {
                    @Override
                    public ListDataAssetsRequest.Builder get() {
                        return ListDataAssetsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListDataAssetsResponse, String>() {
                    @Override
                    public String apply(ListDataAssetsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListDataAssetsRequest.Builder>,
                        ListDataAssetsRequest>() {
                    @Override
                    public ListDataAssetsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListDataAssetsRequest.Builder>
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
                new java.util.function.Function<ListDataAssetsRequest, ListDataAssetsResponse>() {
                    @Override
                    public ListDataAssetsResponse apply(ListDataAssetsRequest request) {
                        return client.listDataAssets(request);
                    }
                },
                new java.util.function.Function<
                        ListDataAssetsResponse,
                        java.util.List<com.oracle.bmc.dataconnectivity.model.DataAssetSummary>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.dataconnectivity.model.DataAssetSummary>
                            apply(ListDataAssetsResponse response) {
                        return response.getDataAssetSummaryCollection().getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the listDataEntities operation. This iterable
     * will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses received from the service.
     */
    public Iterable<ListDataEntitiesResponse> listDataEntitiesResponseIterator(
            final ListDataEntitiesRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListDataEntitiesRequest.Builder, ListDataEntitiesRequest, ListDataEntitiesResponse>(
                new java.util.function.Supplier<ListDataEntitiesRequest.Builder>() {
                    @Override
                    public ListDataEntitiesRequest.Builder get() {
                        return ListDataEntitiesRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListDataEntitiesResponse, String>() {
                    @Override
                    public String apply(ListDataEntitiesResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListDataEntitiesRequest.Builder>,
                        ListDataEntitiesRequest>() {
                    @Override
                    public ListDataEntitiesRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListDataEntitiesRequest.Builder>
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
                        ListDataEntitiesRequest, ListDataEntitiesResponse>() {
                    @Override
                    public ListDataEntitiesResponse apply(ListDataEntitiesRequest request) {
                        return client.listDataEntities(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link com.oracle.bmc.dataconnectivity.model.DataEntitySummary} objects
     * contained in responses from the listDataEntities operation. This iterable will fetch more data from the
     * server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link com.oracle.bmc.dataconnectivity.model.DataEntitySummary} objects
     * contained in responses received from the service.
     */
    public Iterable<com.oracle.bmc.dataconnectivity.model.DataEntitySummary>
            listDataEntitiesRecordIterator(final ListDataEntitiesRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListDataEntitiesRequest.Builder, ListDataEntitiesRequest, ListDataEntitiesResponse,
                com.oracle.bmc.dataconnectivity.model.DataEntitySummary>(
                new java.util.function.Supplier<ListDataEntitiesRequest.Builder>() {
                    @Override
                    public ListDataEntitiesRequest.Builder get() {
                        return ListDataEntitiesRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListDataEntitiesResponse, String>() {
                    @Override
                    public String apply(ListDataEntitiesResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListDataEntitiesRequest.Builder>,
                        ListDataEntitiesRequest>() {
                    @Override
                    public ListDataEntitiesRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListDataEntitiesRequest.Builder>
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
                        ListDataEntitiesRequest, ListDataEntitiesResponse>() {
                    @Override
                    public ListDataEntitiesResponse apply(ListDataEntitiesRequest request) {
                        return client.listDataEntities(request);
                    }
                },
                new java.util.function.Function<
                        ListDataEntitiesResponse,
                        java.util.List<com.oracle.bmc.dataconnectivity.model.DataEntitySummary>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.dataconnectivity.model.DataEntitySummary>
                            apply(ListDataEntitiesResponse response) {
                        return response.getDataEntitySummaryCollection().getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the listEndpoints operation. This iterable
     * will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses received from the service.
     */
    public Iterable<ListEndpointsResponse> listEndpointsResponseIterator(
            final ListEndpointsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListEndpointsRequest.Builder, ListEndpointsRequest, ListEndpointsResponse>(
                new java.util.function.Supplier<ListEndpointsRequest.Builder>() {
                    @Override
                    public ListEndpointsRequest.Builder get() {
                        return ListEndpointsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListEndpointsResponse, String>() {
                    @Override
                    public String apply(ListEndpointsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListEndpointsRequest.Builder>,
                        ListEndpointsRequest>() {
                    @Override
                    public ListEndpointsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListEndpointsRequest.Builder>
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
                new java.util.function.Function<ListEndpointsRequest, ListEndpointsResponse>() {
                    @Override
                    public ListEndpointsResponse apply(ListEndpointsRequest request) {
                        return client.listEndpoints(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link com.oracle.bmc.dataconnectivity.model.EndpointSummary} objects
     * contained in responses from the listEndpoints operation. This iterable will fetch more data from the
     * server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link com.oracle.bmc.dataconnectivity.model.EndpointSummary} objects
     * contained in responses received from the service.
     */
    public Iterable<com.oracle.bmc.dataconnectivity.model.EndpointSummary>
            listEndpointsRecordIterator(final ListEndpointsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListEndpointsRequest.Builder, ListEndpointsRequest, ListEndpointsResponse,
                com.oracle.bmc.dataconnectivity.model.EndpointSummary>(
                new java.util.function.Supplier<ListEndpointsRequest.Builder>() {
                    @Override
                    public ListEndpointsRequest.Builder get() {
                        return ListEndpointsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListEndpointsResponse, String>() {
                    @Override
                    public String apply(ListEndpointsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListEndpointsRequest.Builder>,
                        ListEndpointsRequest>() {
                    @Override
                    public ListEndpointsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListEndpointsRequest.Builder>
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
                new java.util.function.Function<ListEndpointsRequest, ListEndpointsResponse>() {
                    @Override
                    public ListEndpointsResponse apply(ListEndpointsRequest request) {
                        return client.listEndpoints(request);
                    }
                },
                new java.util.function.Function<
                        ListEndpointsResponse,
                        java.util.List<com.oracle.bmc.dataconnectivity.model.EndpointSummary>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.dataconnectivity.model.EndpointSummary>
                            apply(ListEndpointsResponse response) {
                        return response.getEndpointSummaryCollection().getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the listFolders operation. This iterable
     * will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses received from the service.
     */
    public Iterable<ListFoldersResponse> listFoldersResponseIterator(
            final ListFoldersRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListFoldersRequest.Builder, ListFoldersRequest, ListFoldersResponse>(
                new java.util.function.Supplier<ListFoldersRequest.Builder>() {
                    @Override
                    public ListFoldersRequest.Builder get() {
                        return ListFoldersRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListFoldersResponse, String>() {
                    @Override
                    public String apply(ListFoldersResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListFoldersRequest.Builder>,
                        ListFoldersRequest>() {
                    @Override
                    public ListFoldersRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListFoldersRequest.Builder>
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
                new java.util.function.Function<ListFoldersRequest, ListFoldersResponse>() {
                    @Override
                    public ListFoldersResponse apply(ListFoldersRequest request) {
                        return client.listFolders(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link com.oracle.bmc.dataconnectivity.model.FolderSummary} objects
     * contained in responses from the listFolders operation. This iterable will fetch more data from the
     * server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link com.oracle.bmc.dataconnectivity.model.FolderSummary} objects
     * contained in responses received from the service.
     */
    public Iterable<com.oracle.bmc.dataconnectivity.model.FolderSummary> listFoldersRecordIterator(
            final ListFoldersRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListFoldersRequest.Builder, ListFoldersRequest, ListFoldersResponse,
                com.oracle.bmc.dataconnectivity.model.FolderSummary>(
                new java.util.function.Supplier<ListFoldersRequest.Builder>() {
                    @Override
                    public ListFoldersRequest.Builder get() {
                        return ListFoldersRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListFoldersResponse, String>() {
                    @Override
                    public String apply(ListFoldersResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListFoldersRequest.Builder>,
                        ListFoldersRequest>() {
                    @Override
                    public ListFoldersRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListFoldersRequest.Builder>
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
                new java.util.function.Function<ListFoldersRequest, ListFoldersResponse>() {
                    @Override
                    public ListFoldersResponse apply(ListFoldersRequest request) {
                        return client.listFolders(request);
                    }
                },
                new java.util.function.Function<
                        ListFoldersResponse,
                        java.util.List<com.oracle.bmc.dataconnectivity.model.FolderSummary>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.dataconnectivity.model.FolderSummary>
                            apply(ListFoldersResponse response) {
                        return response.getFolderSummaryCollection().getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the listOperations operation. This iterable
     * will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses received from the service.
     */
    public Iterable<ListOperationsResponse> listOperationsResponseIterator(
            final ListOperationsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListOperationsRequest.Builder, ListOperationsRequest, ListOperationsResponse>(
                new java.util.function.Supplier<ListOperationsRequest.Builder>() {
                    @Override
                    public ListOperationsRequest.Builder get() {
                        return ListOperationsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListOperationsResponse, String>() {
                    @Override
                    public String apply(ListOperationsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListOperationsRequest.Builder>,
                        ListOperationsRequest>() {
                    @Override
                    public ListOperationsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListOperationsRequest.Builder>
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
                new java.util.function.Function<ListOperationsRequest, ListOperationsResponse>() {
                    @Override
                    public ListOperationsResponse apply(ListOperationsRequest request) {
                        return client.listOperations(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link com.oracle.bmc.dataconnectivity.model.OperationSummary} objects
     * contained in responses from the listOperations operation. This iterable will fetch more data from the
     * server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link com.oracle.bmc.dataconnectivity.model.OperationSummary} objects
     * contained in responses received from the service.
     */
    public Iterable<com.oracle.bmc.dataconnectivity.model.OperationSummary>
            listOperationsRecordIterator(final ListOperationsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListOperationsRequest.Builder, ListOperationsRequest, ListOperationsResponse,
                com.oracle.bmc.dataconnectivity.model.OperationSummary>(
                new java.util.function.Supplier<ListOperationsRequest.Builder>() {
                    @Override
                    public ListOperationsRequest.Builder get() {
                        return ListOperationsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListOperationsResponse, String>() {
                    @Override
                    public String apply(ListOperationsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListOperationsRequest.Builder>,
                        ListOperationsRequest>() {
                    @Override
                    public ListOperationsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListOperationsRequest.Builder>
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
                new java.util.function.Function<ListOperationsRequest, ListOperationsResponse>() {
                    @Override
                    public ListOperationsResponse apply(ListOperationsRequest request) {
                        return client.listOperations(request);
                    }
                },
                new java.util.function.Function<
                        ListOperationsResponse,
                        java.util.List<com.oracle.bmc.dataconnectivity.model.OperationSummary>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.dataconnectivity.model.OperationSummary>
                            apply(ListOperationsResponse response) {
                        return response.getOperationSummaryCollection().getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the listReferenceArtifacts operation. This iterable
     * will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses received from the service.
     */
    public Iterable<ListReferenceArtifactsResponse> listReferenceArtifactsResponseIterator(
            final ListReferenceArtifactsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListReferenceArtifactsRequest.Builder, ListReferenceArtifactsRequest,
                ListReferenceArtifactsResponse>(
                new java.util.function.Supplier<ListReferenceArtifactsRequest.Builder>() {
                    @Override
                    public ListReferenceArtifactsRequest.Builder get() {
                        return ListReferenceArtifactsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListReferenceArtifactsResponse, String>() {
                    @Override
                    public String apply(ListReferenceArtifactsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListReferenceArtifactsRequest.Builder>,
                        ListReferenceArtifactsRequest>() {
                    @Override
                    public ListReferenceArtifactsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListReferenceArtifactsRequest.Builder>
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
                        ListReferenceArtifactsRequest, ListReferenceArtifactsResponse>() {
                    @Override
                    public ListReferenceArtifactsResponse apply(
                            ListReferenceArtifactsRequest request) {
                        return client.listReferenceArtifacts(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link com.oracle.bmc.dataconnectivity.model.ReferenceArtifactSummary} objects
     * contained in responses from the listReferenceArtifacts operation. This iterable will fetch more data from the
     * server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link com.oracle.bmc.dataconnectivity.model.ReferenceArtifactSummary} objects
     * contained in responses received from the service.
     */
    public Iterable<com.oracle.bmc.dataconnectivity.model.ReferenceArtifactSummary>
            listReferenceArtifactsRecordIterator(final ListReferenceArtifactsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListReferenceArtifactsRequest.Builder, ListReferenceArtifactsRequest,
                ListReferenceArtifactsResponse,
                com.oracle.bmc.dataconnectivity.model.ReferenceArtifactSummary>(
                new java.util.function.Supplier<ListReferenceArtifactsRequest.Builder>() {
                    @Override
                    public ListReferenceArtifactsRequest.Builder get() {
                        return ListReferenceArtifactsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListReferenceArtifactsResponse, String>() {
                    @Override
                    public String apply(ListReferenceArtifactsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListReferenceArtifactsRequest.Builder>,
                        ListReferenceArtifactsRequest>() {
                    @Override
                    public ListReferenceArtifactsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListReferenceArtifactsRequest.Builder>
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
                        ListReferenceArtifactsRequest, ListReferenceArtifactsResponse>() {
                    @Override
                    public ListReferenceArtifactsResponse apply(
                            ListReferenceArtifactsRequest request) {
                        return client.listReferenceArtifacts(request);
                    }
                },
                new java.util.function.Function<
                        ListReferenceArtifactsResponse,
                        java.util.List<
                                com.oracle.bmc.dataconnectivity.model.ReferenceArtifactSummary>>() {
                    @Override
                    public java.util.List<
                                    com.oracle.bmc.dataconnectivity.model.ReferenceArtifactSummary>
                            apply(ListReferenceArtifactsResponse response) {
                        return response.getReferenceArtifactSummaryCollection().getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the listRegistries operation. This iterable
     * will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses received from the service.
     */
    public Iterable<ListRegistriesResponse> listRegistriesResponseIterator(
            final ListRegistriesRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListRegistriesRequest.Builder, ListRegistriesRequest, ListRegistriesResponse>(
                new java.util.function.Supplier<ListRegistriesRequest.Builder>() {
                    @Override
                    public ListRegistriesRequest.Builder get() {
                        return ListRegistriesRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListRegistriesResponse, String>() {
                    @Override
                    public String apply(ListRegistriesResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListRegistriesRequest.Builder>,
                        ListRegistriesRequest>() {
                    @Override
                    public ListRegistriesRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListRegistriesRequest.Builder>
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
                new java.util.function.Function<ListRegistriesRequest, ListRegistriesResponse>() {
                    @Override
                    public ListRegistriesResponse apply(ListRegistriesRequest request) {
                        return client.listRegistries(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link com.oracle.bmc.dataconnectivity.model.RegistrySummary} objects
     * contained in responses from the listRegistries operation. This iterable will fetch more data from the
     * server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link com.oracle.bmc.dataconnectivity.model.RegistrySummary} objects
     * contained in responses received from the service.
     */
    public Iterable<com.oracle.bmc.dataconnectivity.model.RegistrySummary>
            listRegistriesRecordIterator(final ListRegistriesRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListRegistriesRequest.Builder, ListRegistriesRequest, ListRegistriesResponse,
                com.oracle.bmc.dataconnectivity.model.RegistrySummary>(
                new java.util.function.Supplier<ListRegistriesRequest.Builder>() {
                    @Override
                    public ListRegistriesRequest.Builder get() {
                        return ListRegistriesRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListRegistriesResponse, String>() {
                    @Override
                    public String apply(ListRegistriesResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListRegistriesRequest.Builder>,
                        ListRegistriesRequest>() {
                    @Override
                    public ListRegistriesRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListRegistriesRequest.Builder>
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
                new java.util.function.Function<ListRegistriesRequest, ListRegistriesResponse>() {
                    @Override
                    public ListRegistriesResponse apply(ListRegistriesRequest request) {
                        return client.listRegistries(request);
                    }
                },
                new java.util.function.Function<
                        ListRegistriesResponse,
                        java.util.List<com.oracle.bmc.dataconnectivity.model.RegistrySummary>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.dataconnectivity.model.RegistrySummary>
                            apply(ListRegistriesResponse response) {
                        return response.getRegistrySummaryCollection().getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the listSchemas operation. This iterable
     * will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses received from the service.
     */
    public Iterable<ListSchemasResponse> listSchemasResponseIterator(
            final ListSchemasRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListSchemasRequest.Builder, ListSchemasRequest, ListSchemasResponse>(
                new java.util.function.Supplier<ListSchemasRequest.Builder>() {
                    @Override
                    public ListSchemasRequest.Builder get() {
                        return ListSchemasRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListSchemasResponse, String>() {
                    @Override
                    public String apply(ListSchemasResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListSchemasRequest.Builder>,
                        ListSchemasRequest>() {
                    @Override
                    public ListSchemasRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListSchemasRequest.Builder>
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
                new java.util.function.Function<ListSchemasRequest, ListSchemasResponse>() {
                    @Override
                    public ListSchemasResponse apply(ListSchemasRequest request) {
                        return client.listSchemas(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link com.oracle.bmc.dataconnectivity.model.SchemaSummary} objects
     * contained in responses from the listSchemas operation. This iterable will fetch more data from the
     * server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link com.oracle.bmc.dataconnectivity.model.SchemaSummary} objects
     * contained in responses received from the service.
     */
    public Iterable<com.oracle.bmc.dataconnectivity.model.SchemaSummary> listSchemasRecordIterator(
            final ListSchemasRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListSchemasRequest.Builder, ListSchemasRequest, ListSchemasResponse,
                com.oracle.bmc.dataconnectivity.model.SchemaSummary>(
                new java.util.function.Supplier<ListSchemasRequest.Builder>() {
                    @Override
                    public ListSchemasRequest.Builder get() {
                        return ListSchemasRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListSchemasResponse, String>() {
                    @Override
                    public String apply(ListSchemasResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListSchemasRequest.Builder>,
                        ListSchemasRequest>() {
                    @Override
                    public ListSchemasRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListSchemasRequest.Builder>
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
                new java.util.function.Function<ListSchemasRequest, ListSchemasResponse>() {
                    @Override
                    public ListSchemasResponse apply(ListSchemasRequest request) {
                        return client.listSchemas(request);
                    }
                },
                new java.util.function.Function<
                        ListSchemasResponse,
                        java.util.List<com.oracle.bmc.dataconnectivity.model.SchemaSummary>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.dataconnectivity.model.SchemaSummary>
                            apply(ListSchemasResponse response) {
                        return response.getSchemaSummaryCollection().getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the listTypes operation. This iterable
     * will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses received from the service.
     */
    public Iterable<ListTypesResponse> listTypesResponseIterator(final ListTypesRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListTypesRequest.Builder, ListTypesRequest, ListTypesResponse>(
                new java.util.function.Supplier<ListTypesRequest.Builder>() {
                    @Override
                    public ListTypesRequest.Builder get() {
                        return ListTypesRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListTypesResponse, String>() {
                    @Override
                    public String apply(ListTypesResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListTypesRequest.Builder>,
                        ListTypesRequest>() {
                    @Override
                    public ListTypesRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListTypesRequest.Builder>
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
                new java.util.function.Function<ListTypesRequest, ListTypesResponse>() {
                    @Override
                    public ListTypesResponse apply(ListTypesRequest request) {
                        return client.listTypes(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link com.oracle.bmc.dataconnectivity.model.TypeSummary} objects
     * contained in responses from the listTypes operation. This iterable will fetch more data from the
     * server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link com.oracle.bmc.dataconnectivity.model.TypeSummary} objects
     * contained in responses received from the service.
     */
    public Iterable<com.oracle.bmc.dataconnectivity.model.TypeSummary> listTypesRecordIterator(
            final ListTypesRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListTypesRequest.Builder, ListTypesRequest, ListTypesResponse,
                com.oracle.bmc.dataconnectivity.model.TypeSummary>(
                new java.util.function.Supplier<ListTypesRequest.Builder>() {
                    @Override
                    public ListTypesRequest.Builder get() {
                        return ListTypesRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListTypesResponse, String>() {
                    @Override
                    public String apply(ListTypesResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListTypesRequest.Builder>,
                        ListTypesRequest>() {
                    @Override
                    public ListTypesRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListTypesRequest.Builder>
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
                new java.util.function.Function<ListTypesRequest, ListTypesResponse>() {
                    @Override
                    public ListTypesResponse apply(ListTypesRequest request) {
                        return client.listTypes(request);
                    }
                },
                new java.util.function.Function<
                        ListTypesResponse,
                        java.util.List<com.oracle.bmc.dataconnectivity.model.TypeSummary>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.dataconnectivity.model.TypeSummary> apply(
                            ListTypesResponse response) {
                        return response.getTypesSummaryCollection().getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the listWorkRequestErrors operation. This iterable
     * will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses received from the service.
     */
    public Iterable<ListWorkRequestErrorsResponse> listWorkRequestErrorsResponseIterator(
            final ListWorkRequestErrorsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListWorkRequestErrorsRequest.Builder, ListWorkRequestErrorsRequest,
                ListWorkRequestErrorsResponse>(
                new java.util.function.Supplier<ListWorkRequestErrorsRequest.Builder>() {
                    @Override
                    public ListWorkRequestErrorsRequest.Builder get() {
                        return ListWorkRequestErrorsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListWorkRequestErrorsResponse, String>() {
                    @Override
                    public String apply(ListWorkRequestErrorsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListWorkRequestErrorsRequest.Builder>,
                        ListWorkRequestErrorsRequest>() {
                    @Override
                    public ListWorkRequestErrorsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListWorkRequestErrorsRequest.Builder>
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
                        ListWorkRequestErrorsRequest, ListWorkRequestErrorsResponse>() {
                    @Override
                    public ListWorkRequestErrorsResponse apply(
                            ListWorkRequestErrorsRequest request) {
                        return client.listWorkRequestErrors(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link com.oracle.bmc.dataconnectivity.model.WorkRequestError} objects
     * contained in responses from the listWorkRequestErrors operation. This iterable will fetch more data from the
     * server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link com.oracle.bmc.dataconnectivity.model.WorkRequestError} objects
     * contained in responses received from the service.
     */
    public Iterable<com.oracle.bmc.dataconnectivity.model.WorkRequestError>
            listWorkRequestErrorsRecordIterator(final ListWorkRequestErrorsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListWorkRequestErrorsRequest.Builder, ListWorkRequestErrorsRequest,
                ListWorkRequestErrorsResponse,
                com.oracle.bmc.dataconnectivity.model.WorkRequestError>(
                new java.util.function.Supplier<ListWorkRequestErrorsRequest.Builder>() {
                    @Override
                    public ListWorkRequestErrorsRequest.Builder get() {
                        return ListWorkRequestErrorsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListWorkRequestErrorsResponse, String>() {
                    @Override
                    public String apply(ListWorkRequestErrorsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListWorkRequestErrorsRequest.Builder>,
                        ListWorkRequestErrorsRequest>() {
                    @Override
                    public ListWorkRequestErrorsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListWorkRequestErrorsRequest.Builder>
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
                        ListWorkRequestErrorsRequest, ListWorkRequestErrorsResponse>() {
                    @Override
                    public ListWorkRequestErrorsResponse apply(
                            ListWorkRequestErrorsRequest request) {
                        return client.listWorkRequestErrors(request);
                    }
                },
                new java.util.function.Function<
                        ListWorkRequestErrorsResponse,
                        java.util.List<com.oracle.bmc.dataconnectivity.model.WorkRequestError>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.dataconnectivity.model.WorkRequestError>
                            apply(ListWorkRequestErrorsResponse response) {
                        return response.getWorkRequestErrorCollection().getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the listWorkRequestLogs operation. This iterable
     * will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses received from the service.
     */
    public Iterable<ListWorkRequestLogsResponse> listWorkRequestLogsResponseIterator(
            final ListWorkRequestLogsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListWorkRequestLogsRequest.Builder, ListWorkRequestLogsRequest,
                ListWorkRequestLogsResponse>(
                new java.util.function.Supplier<ListWorkRequestLogsRequest.Builder>() {
                    @Override
                    public ListWorkRequestLogsRequest.Builder get() {
                        return ListWorkRequestLogsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListWorkRequestLogsResponse, String>() {
                    @Override
                    public String apply(ListWorkRequestLogsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListWorkRequestLogsRequest.Builder>,
                        ListWorkRequestLogsRequest>() {
                    @Override
                    public ListWorkRequestLogsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListWorkRequestLogsRequest.Builder>
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
                        ListWorkRequestLogsRequest, ListWorkRequestLogsResponse>() {
                    @Override
                    public ListWorkRequestLogsResponse apply(ListWorkRequestLogsRequest request) {
                        return client.listWorkRequestLogs(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link com.oracle.bmc.dataconnectivity.model.WorkRequestLog} objects
     * contained in responses from the listWorkRequestLogs operation. This iterable will fetch more data from the
     * server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link com.oracle.bmc.dataconnectivity.model.WorkRequestLog} objects
     * contained in responses received from the service.
     */
    public Iterable<com.oracle.bmc.dataconnectivity.model.WorkRequestLog>
            listWorkRequestLogsRecordIterator(final ListWorkRequestLogsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListWorkRequestLogsRequest.Builder, ListWorkRequestLogsRequest,
                ListWorkRequestLogsResponse, com.oracle.bmc.dataconnectivity.model.WorkRequestLog>(
                new java.util.function.Supplier<ListWorkRequestLogsRequest.Builder>() {
                    @Override
                    public ListWorkRequestLogsRequest.Builder get() {
                        return ListWorkRequestLogsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListWorkRequestLogsResponse, String>() {
                    @Override
                    public String apply(ListWorkRequestLogsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListWorkRequestLogsRequest.Builder>,
                        ListWorkRequestLogsRequest>() {
                    @Override
                    public ListWorkRequestLogsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListWorkRequestLogsRequest.Builder>
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
                        ListWorkRequestLogsRequest, ListWorkRequestLogsResponse>() {
                    @Override
                    public ListWorkRequestLogsResponse apply(ListWorkRequestLogsRequest request) {
                        return client.listWorkRequestLogs(request);
                    }
                },
                new java.util.function.Function<
                        ListWorkRequestLogsResponse,
                        java.util.List<com.oracle.bmc.dataconnectivity.model.WorkRequestLog>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.dataconnectivity.model.WorkRequestLog>
                            apply(ListWorkRequestLogsResponse response) {
                        return response.getWorkRequestLogCollection().getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the listWorkRequests operation. This iterable
     * will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses received from the service.
     */
    public Iterable<ListWorkRequestsResponse> listWorkRequestsResponseIterator(
            final ListWorkRequestsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListWorkRequestsRequest.Builder, ListWorkRequestsRequest, ListWorkRequestsResponse>(
                new java.util.function.Supplier<ListWorkRequestsRequest.Builder>() {
                    @Override
                    public ListWorkRequestsRequest.Builder get() {
                        return ListWorkRequestsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListWorkRequestsResponse, String>() {
                    @Override
                    public String apply(ListWorkRequestsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListWorkRequestsRequest.Builder>,
                        ListWorkRequestsRequest>() {
                    @Override
                    public ListWorkRequestsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListWorkRequestsRequest.Builder>
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
                        ListWorkRequestsRequest, ListWorkRequestsResponse>() {
                    @Override
                    public ListWorkRequestsResponse apply(ListWorkRequestsRequest request) {
                        return client.listWorkRequests(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link com.oracle.bmc.dataconnectivity.model.WorkRequestSummary} objects
     * contained in responses from the listWorkRequests operation. This iterable will fetch more data from the
     * server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link com.oracle.bmc.dataconnectivity.model.WorkRequestSummary} objects
     * contained in responses received from the service.
     */
    public Iterable<com.oracle.bmc.dataconnectivity.model.WorkRequestSummary>
            listWorkRequestsRecordIterator(final ListWorkRequestsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListWorkRequestsRequest.Builder, ListWorkRequestsRequest, ListWorkRequestsResponse,
                com.oracle.bmc.dataconnectivity.model.WorkRequestSummary>(
                new java.util.function.Supplier<ListWorkRequestsRequest.Builder>() {
                    @Override
                    public ListWorkRequestsRequest.Builder get() {
                        return ListWorkRequestsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListWorkRequestsResponse, String>() {
                    @Override
                    public String apply(ListWorkRequestsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListWorkRequestsRequest.Builder>,
                        ListWorkRequestsRequest>() {
                    @Override
                    public ListWorkRequestsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListWorkRequestsRequest.Builder>
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
                        ListWorkRequestsRequest, ListWorkRequestsResponse>() {
                    @Override
                    public ListWorkRequestsResponse apply(ListWorkRequestsRequest request) {
                        return client.listWorkRequests(request);
                    }
                },
                new java.util.function.Function<
                        ListWorkRequestsResponse,
                        java.util.List<
                                com.oracle.bmc.dataconnectivity.model.WorkRequestSummary>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.dataconnectivity.model.WorkRequestSummary>
                            apply(ListWorkRequestsResponse response) {
                        return response.getWorkRequestSummaryCollection().getItems();
                    }
                });
    }
}

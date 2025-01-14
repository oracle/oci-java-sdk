/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.containerengine;

import com.oracle.bmc.containerengine.requests.*;
import com.oracle.bmc.containerengine.responses.*;

/**
 * Collection of helper methods that can be used to provide an {@link java.lang.Iterable} interface
 * to any list operations of ContainerEngine where multiple pages of data may be fetched. Two styles
 * of iteration are supported:
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
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20180222")
public class ContainerEnginePaginators {
    private final ContainerEngine client;

    public ContainerEnginePaginators(ContainerEngine client) {
        this.client = client;
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the
     * listAddonOptions operation. This iterable will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses
     *     received from the service.
     */
    public Iterable<ListAddonOptionsResponse> listAddonOptionsResponseIterator(
            final ListAddonOptionsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListAddonOptionsRequest.Builder, ListAddonOptionsRequest, ListAddonOptionsResponse>(
                new java.util.function.Supplier<ListAddonOptionsRequest.Builder>() {
                    @Override
                    public ListAddonOptionsRequest.Builder get() {
                        return ListAddonOptionsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListAddonOptionsResponse, String>() {
                    @Override
                    public String apply(ListAddonOptionsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListAddonOptionsRequest.Builder>,
                        ListAddonOptionsRequest>() {
                    @Override
                    public ListAddonOptionsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListAddonOptionsRequest.Builder>
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
                        ListAddonOptionsRequest, ListAddonOptionsResponse>() {
                    @Override
                    public ListAddonOptionsResponse apply(ListAddonOptionsRequest request) {
                        return client.listAddonOptions(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link
     * com.oracle.bmc.containerengine.model.AddonOptionSummary} objects contained in responses from
     * the listAddonOptions operation. This iterable will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link
     *     com.oracle.bmc.containerengine.model.AddonOptionSummary} objects contained in responses
     *     received from the service.
     */
    public Iterable<com.oracle.bmc.containerengine.model.AddonOptionSummary>
            listAddonOptionsRecordIterator(final ListAddonOptionsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListAddonOptionsRequest.Builder,
                ListAddonOptionsRequest,
                ListAddonOptionsResponse,
                com.oracle.bmc.containerengine.model.AddonOptionSummary>(
                new java.util.function.Supplier<ListAddonOptionsRequest.Builder>() {
                    @Override
                    public ListAddonOptionsRequest.Builder get() {
                        return ListAddonOptionsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListAddonOptionsResponse, String>() {
                    @Override
                    public String apply(ListAddonOptionsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListAddonOptionsRequest.Builder>,
                        ListAddonOptionsRequest>() {
                    @Override
                    public ListAddonOptionsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListAddonOptionsRequest.Builder>
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
                        ListAddonOptionsRequest, ListAddonOptionsResponse>() {
                    @Override
                    public ListAddonOptionsResponse apply(ListAddonOptionsRequest request) {
                        return client.listAddonOptions(request);
                    }
                },
                new java.util.function.Function<
                        ListAddonOptionsResponse,
                        java.util.List<com.oracle.bmc.containerengine.model.AddonOptionSummary>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.containerengine.model.AddonOptionSummary>
                            apply(ListAddonOptionsResponse response) {
                        return response.getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the listAddons
     * operation. This iterable will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses
     *     received from the service.
     */
    public Iterable<ListAddonsResponse> listAddonsResponseIterator(
            final ListAddonsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListAddonsRequest.Builder, ListAddonsRequest, ListAddonsResponse>(
                new java.util.function.Supplier<ListAddonsRequest.Builder>() {
                    @Override
                    public ListAddonsRequest.Builder get() {
                        return ListAddonsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListAddonsResponse, String>() {
                    @Override
                    public String apply(ListAddonsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListAddonsRequest.Builder>,
                        ListAddonsRequest>() {
                    @Override
                    public ListAddonsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListAddonsRequest.Builder>
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
                new java.util.function.Function<ListAddonsRequest, ListAddonsResponse>() {
                    @Override
                    public ListAddonsResponse apply(ListAddonsRequest request) {
                        return client.listAddons(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link
     * com.oracle.bmc.containerengine.model.AddonSummary} objects contained in responses from the
     * listAddons operation. This iterable will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link
     *     com.oracle.bmc.containerengine.model.AddonSummary} objects contained in responses
     *     received from the service.
     */
    public Iterable<com.oracle.bmc.containerengine.model.AddonSummary> listAddonsRecordIterator(
            final ListAddonsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListAddonsRequest.Builder,
                ListAddonsRequest,
                ListAddonsResponse,
                com.oracle.bmc.containerengine.model.AddonSummary>(
                new java.util.function.Supplier<ListAddonsRequest.Builder>() {
                    @Override
                    public ListAddonsRequest.Builder get() {
                        return ListAddonsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListAddonsResponse, String>() {
                    @Override
                    public String apply(ListAddonsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListAddonsRequest.Builder>,
                        ListAddonsRequest>() {
                    @Override
                    public ListAddonsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListAddonsRequest.Builder>
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
                new java.util.function.Function<ListAddonsRequest, ListAddonsResponse>() {
                    @Override
                    public ListAddonsResponse apply(ListAddonsRequest request) {
                        return client.listAddons(request);
                    }
                },
                new java.util.function.Function<
                        ListAddonsResponse,
                        java.util.List<com.oracle.bmc.containerengine.model.AddonSummary>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.containerengine.model.AddonSummary> apply(
                            ListAddonsResponse response) {
                        return response.getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the listClusters
     * operation. This iterable will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses
     *     received from the service.
     */
    public Iterable<ListClustersResponse> listClustersResponseIterator(
            final ListClustersRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListClustersRequest.Builder, ListClustersRequest, ListClustersResponse>(
                new java.util.function.Supplier<ListClustersRequest.Builder>() {
                    @Override
                    public ListClustersRequest.Builder get() {
                        return ListClustersRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListClustersResponse, String>() {
                    @Override
                    public String apply(ListClustersResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListClustersRequest.Builder>,
                        ListClustersRequest>() {
                    @Override
                    public ListClustersRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListClustersRequest.Builder>
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
                new java.util.function.Function<ListClustersRequest, ListClustersResponse>() {
                    @Override
                    public ListClustersResponse apply(ListClustersRequest request) {
                        return client.listClusters(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link
     * com.oracle.bmc.containerengine.model.ClusterSummary} objects contained in responses from the
     * listClusters operation. This iterable will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link
     *     com.oracle.bmc.containerengine.model.ClusterSummary} objects contained in responses
     *     received from the service.
     */
    public Iterable<com.oracle.bmc.containerengine.model.ClusterSummary> listClustersRecordIterator(
            final ListClustersRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListClustersRequest.Builder,
                ListClustersRequest,
                ListClustersResponse,
                com.oracle.bmc.containerengine.model.ClusterSummary>(
                new java.util.function.Supplier<ListClustersRequest.Builder>() {
                    @Override
                    public ListClustersRequest.Builder get() {
                        return ListClustersRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListClustersResponse, String>() {
                    @Override
                    public String apply(ListClustersResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListClustersRequest.Builder>,
                        ListClustersRequest>() {
                    @Override
                    public ListClustersRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListClustersRequest.Builder>
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
                new java.util.function.Function<ListClustersRequest, ListClustersResponse>() {
                    @Override
                    public ListClustersResponse apply(ListClustersRequest request) {
                        return client.listClusters(request);
                    }
                },
                new java.util.function.Function<
                        ListClustersResponse,
                        java.util.List<com.oracle.bmc.containerengine.model.ClusterSummary>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.containerengine.model.ClusterSummary>
                            apply(ListClustersResponse response) {
                        return response.getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the listNodePools
     * operation. This iterable will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses
     *     received from the service.
     */
    public Iterable<ListNodePoolsResponse> listNodePoolsResponseIterator(
            final ListNodePoolsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListNodePoolsRequest.Builder, ListNodePoolsRequest, ListNodePoolsResponse>(
                new java.util.function.Supplier<ListNodePoolsRequest.Builder>() {
                    @Override
                    public ListNodePoolsRequest.Builder get() {
                        return ListNodePoolsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListNodePoolsResponse, String>() {
                    @Override
                    public String apply(ListNodePoolsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListNodePoolsRequest.Builder>,
                        ListNodePoolsRequest>() {
                    @Override
                    public ListNodePoolsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListNodePoolsRequest.Builder>
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
                new java.util.function.Function<ListNodePoolsRequest, ListNodePoolsResponse>() {
                    @Override
                    public ListNodePoolsResponse apply(ListNodePoolsRequest request) {
                        return client.listNodePools(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link
     * com.oracle.bmc.containerengine.model.NodePoolSummary} objects contained in responses from the
     * listNodePools operation. This iterable will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link
     *     com.oracle.bmc.containerengine.model.NodePoolSummary} objects contained in responses
     *     received from the service.
     */
    public Iterable<com.oracle.bmc.containerengine.model.NodePoolSummary>
            listNodePoolsRecordIterator(final ListNodePoolsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListNodePoolsRequest.Builder,
                ListNodePoolsRequest,
                ListNodePoolsResponse,
                com.oracle.bmc.containerengine.model.NodePoolSummary>(
                new java.util.function.Supplier<ListNodePoolsRequest.Builder>() {
                    @Override
                    public ListNodePoolsRequest.Builder get() {
                        return ListNodePoolsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListNodePoolsResponse, String>() {
                    @Override
                    public String apply(ListNodePoolsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListNodePoolsRequest.Builder>,
                        ListNodePoolsRequest>() {
                    @Override
                    public ListNodePoolsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListNodePoolsRequest.Builder>
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
                new java.util.function.Function<ListNodePoolsRequest, ListNodePoolsResponse>() {
                    @Override
                    public ListNodePoolsResponse apply(ListNodePoolsRequest request) {
                        return client.listNodePools(request);
                    }
                },
                new java.util.function.Function<
                        ListNodePoolsResponse,
                        java.util.List<com.oracle.bmc.containerengine.model.NodePoolSummary>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.containerengine.model.NodePoolSummary>
                            apply(ListNodePoolsResponse response) {
                        return response.getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the listPodShapes
     * operation. This iterable will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses
     *     received from the service.
     */
    public Iterable<ListPodShapesResponse> listPodShapesResponseIterator(
            final ListPodShapesRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListPodShapesRequest.Builder, ListPodShapesRequest, ListPodShapesResponse>(
                new java.util.function.Supplier<ListPodShapesRequest.Builder>() {
                    @Override
                    public ListPodShapesRequest.Builder get() {
                        return ListPodShapesRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListPodShapesResponse, String>() {
                    @Override
                    public String apply(ListPodShapesResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListPodShapesRequest.Builder>,
                        ListPodShapesRequest>() {
                    @Override
                    public ListPodShapesRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListPodShapesRequest.Builder>
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
                new java.util.function.Function<ListPodShapesRequest, ListPodShapesResponse>() {
                    @Override
                    public ListPodShapesResponse apply(ListPodShapesRequest request) {
                        return client.listPodShapes(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link
     * com.oracle.bmc.containerengine.model.PodShapeSummary} objects contained in responses from the
     * listPodShapes operation. This iterable will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link
     *     com.oracle.bmc.containerengine.model.PodShapeSummary} objects contained in responses
     *     received from the service.
     */
    public Iterable<com.oracle.bmc.containerengine.model.PodShapeSummary>
            listPodShapesRecordIterator(final ListPodShapesRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListPodShapesRequest.Builder,
                ListPodShapesRequest,
                ListPodShapesResponse,
                com.oracle.bmc.containerengine.model.PodShapeSummary>(
                new java.util.function.Supplier<ListPodShapesRequest.Builder>() {
                    @Override
                    public ListPodShapesRequest.Builder get() {
                        return ListPodShapesRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListPodShapesResponse, String>() {
                    @Override
                    public String apply(ListPodShapesResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListPodShapesRequest.Builder>,
                        ListPodShapesRequest>() {
                    @Override
                    public ListPodShapesRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListPodShapesRequest.Builder>
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
                new java.util.function.Function<ListPodShapesRequest, ListPodShapesResponse>() {
                    @Override
                    public ListPodShapesResponse apply(ListPodShapesRequest request) {
                        return client.listPodShapes(request);
                    }
                },
                new java.util.function.Function<
                        ListPodShapesResponse,
                        java.util.List<com.oracle.bmc.containerengine.model.PodShapeSummary>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.containerengine.model.PodShapeSummary>
                            apply(ListPodShapesResponse response) {
                        return response.getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the
     * listVirtualNodePools operation. This iterable will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses
     *     received from the service.
     */
    public Iterable<ListVirtualNodePoolsResponse> listVirtualNodePoolsResponseIterator(
            final ListVirtualNodePoolsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListVirtualNodePoolsRequest.Builder,
                ListVirtualNodePoolsRequest,
                ListVirtualNodePoolsResponse>(
                new java.util.function.Supplier<ListVirtualNodePoolsRequest.Builder>() {
                    @Override
                    public ListVirtualNodePoolsRequest.Builder get() {
                        return ListVirtualNodePoolsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListVirtualNodePoolsResponse, String>() {
                    @Override
                    public String apply(ListVirtualNodePoolsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListVirtualNodePoolsRequest.Builder>,
                        ListVirtualNodePoolsRequest>() {
                    @Override
                    public ListVirtualNodePoolsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListVirtualNodePoolsRequest.Builder>
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
                        ListVirtualNodePoolsRequest, ListVirtualNodePoolsResponse>() {
                    @Override
                    public ListVirtualNodePoolsResponse apply(ListVirtualNodePoolsRequest request) {
                        return client.listVirtualNodePools(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link
     * com.oracle.bmc.containerengine.model.VirtualNodePoolSummary} objects contained in responses
     * from the listVirtualNodePools operation. This iterable will fetch more data from the server
     * as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link
     *     com.oracle.bmc.containerengine.model.VirtualNodePoolSummary} objects contained in
     *     responses received from the service.
     */
    public Iterable<com.oracle.bmc.containerengine.model.VirtualNodePoolSummary>
            listVirtualNodePoolsRecordIterator(final ListVirtualNodePoolsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListVirtualNodePoolsRequest.Builder,
                ListVirtualNodePoolsRequest,
                ListVirtualNodePoolsResponse,
                com.oracle.bmc.containerengine.model.VirtualNodePoolSummary>(
                new java.util.function.Supplier<ListVirtualNodePoolsRequest.Builder>() {
                    @Override
                    public ListVirtualNodePoolsRequest.Builder get() {
                        return ListVirtualNodePoolsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListVirtualNodePoolsResponse, String>() {
                    @Override
                    public String apply(ListVirtualNodePoolsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListVirtualNodePoolsRequest.Builder>,
                        ListVirtualNodePoolsRequest>() {
                    @Override
                    public ListVirtualNodePoolsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListVirtualNodePoolsRequest.Builder>
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
                        ListVirtualNodePoolsRequest, ListVirtualNodePoolsResponse>() {
                    @Override
                    public ListVirtualNodePoolsResponse apply(ListVirtualNodePoolsRequest request) {
                        return client.listVirtualNodePools(request);
                    }
                },
                new java.util.function.Function<
                        ListVirtualNodePoolsResponse,
                        java.util.List<
                                com.oracle.bmc.containerengine.model.VirtualNodePoolSummary>>() {
                    @Override
                    public java.util.List<
                                    com.oracle.bmc.containerengine.model.VirtualNodePoolSummary>
                            apply(ListVirtualNodePoolsResponse response) {
                        return response.getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the
     * listVirtualNodes operation. This iterable will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses
     *     received from the service.
     */
    public Iterable<ListVirtualNodesResponse> listVirtualNodesResponseIterator(
            final ListVirtualNodesRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListVirtualNodesRequest.Builder, ListVirtualNodesRequest, ListVirtualNodesResponse>(
                new java.util.function.Supplier<ListVirtualNodesRequest.Builder>() {
                    @Override
                    public ListVirtualNodesRequest.Builder get() {
                        return ListVirtualNodesRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListVirtualNodesResponse, String>() {
                    @Override
                    public String apply(ListVirtualNodesResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListVirtualNodesRequest.Builder>,
                        ListVirtualNodesRequest>() {
                    @Override
                    public ListVirtualNodesRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListVirtualNodesRequest.Builder>
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
                        ListVirtualNodesRequest, ListVirtualNodesResponse>() {
                    @Override
                    public ListVirtualNodesResponse apply(ListVirtualNodesRequest request) {
                        return client.listVirtualNodes(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link
     * com.oracle.bmc.containerengine.model.VirtualNodeSummary} objects contained in responses from
     * the listVirtualNodes operation. This iterable will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link
     *     com.oracle.bmc.containerengine.model.VirtualNodeSummary} objects contained in responses
     *     received from the service.
     */
    public Iterable<com.oracle.bmc.containerengine.model.VirtualNodeSummary>
            listVirtualNodesRecordIterator(final ListVirtualNodesRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListVirtualNodesRequest.Builder,
                ListVirtualNodesRequest,
                ListVirtualNodesResponse,
                com.oracle.bmc.containerengine.model.VirtualNodeSummary>(
                new java.util.function.Supplier<ListVirtualNodesRequest.Builder>() {
                    @Override
                    public ListVirtualNodesRequest.Builder get() {
                        return ListVirtualNodesRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListVirtualNodesResponse, String>() {
                    @Override
                    public String apply(ListVirtualNodesResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListVirtualNodesRequest.Builder>,
                        ListVirtualNodesRequest>() {
                    @Override
                    public ListVirtualNodesRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListVirtualNodesRequest.Builder>
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
                        ListVirtualNodesRequest, ListVirtualNodesResponse>() {
                    @Override
                    public ListVirtualNodesResponse apply(ListVirtualNodesRequest request) {
                        return client.listVirtualNodes(request);
                    }
                },
                new java.util.function.Function<
                        ListVirtualNodesResponse,
                        java.util.List<com.oracle.bmc.containerengine.model.VirtualNodeSummary>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.containerengine.model.VirtualNodeSummary>
                            apply(ListVirtualNodesResponse response) {
                        return response.getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the
     * listWorkRequests operation. This iterable will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses
     *     received from the service.
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
     * Creates a new iterable which will iterate over the {@link
     * com.oracle.bmc.containerengine.model.WorkRequestSummary} objects contained in responses from
     * the listWorkRequests operation. This iterable will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link
     *     com.oracle.bmc.containerengine.model.WorkRequestSummary} objects contained in responses
     *     received from the service.
     */
    public Iterable<com.oracle.bmc.containerengine.model.WorkRequestSummary>
            listWorkRequestsRecordIterator(final ListWorkRequestsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListWorkRequestsRequest.Builder,
                ListWorkRequestsRequest,
                ListWorkRequestsResponse,
                com.oracle.bmc.containerengine.model.WorkRequestSummary>(
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
                        java.util.List<com.oracle.bmc.containerengine.model.WorkRequestSummary>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.containerengine.model.WorkRequestSummary>
                            apply(ListWorkRequestsResponse response) {
                        return response.getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the
     * listWorkloadMappings operation. This iterable will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses
     *     received from the service.
     */
    public Iterable<ListWorkloadMappingsResponse> listWorkloadMappingsResponseIterator(
            final ListWorkloadMappingsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListWorkloadMappingsRequest.Builder,
                ListWorkloadMappingsRequest,
                ListWorkloadMappingsResponse>(
                new java.util.function.Supplier<ListWorkloadMappingsRequest.Builder>() {
                    @Override
                    public ListWorkloadMappingsRequest.Builder get() {
                        return ListWorkloadMappingsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListWorkloadMappingsResponse, String>() {
                    @Override
                    public String apply(ListWorkloadMappingsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListWorkloadMappingsRequest.Builder>,
                        ListWorkloadMappingsRequest>() {
                    @Override
                    public ListWorkloadMappingsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListWorkloadMappingsRequest.Builder>
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
                        ListWorkloadMappingsRequest, ListWorkloadMappingsResponse>() {
                    @Override
                    public ListWorkloadMappingsResponse apply(ListWorkloadMappingsRequest request) {
                        return client.listWorkloadMappings(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link
     * com.oracle.bmc.containerengine.model.WorkloadMappingSummary} objects contained in responses
     * from the listWorkloadMappings operation. This iterable will fetch more data from the server
     * as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link
     *     com.oracle.bmc.containerengine.model.WorkloadMappingSummary} objects contained in
     *     responses received from the service.
     */
    public Iterable<com.oracle.bmc.containerengine.model.WorkloadMappingSummary>
            listWorkloadMappingsRecordIterator(final ListWorkloadMappingsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListWorkloadMappingsRequest.Builder,
                ListWorkloadMappingsRequest,
                ListWorkloadMappingsResponse,
                com.oracle.bmc.containerengine.model.WorkloadMappingSummary>(
                new java.util.function.Supplier<ListWorkloadMappingsRequest.Builder>() {
                    @Override
                    public ListWorkloadMappingsRequest.Builder get() {
                        return ListWorkloadMappingsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListWorkloadMappingsResponse, String>() {
                    @Override
                    public String apply(ListWorkloadMappingsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListWorkloadMappingsRequest.Builder>,
                        ListWorkloadMappingsRequest>() {
                    @Override
                    public ListWorkloadMappingsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListWorkloadMappingsRequest.Builder>
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
                        ListWorkloadMappingsRequest, ListWorkloadMappingsResponse>() {
                    @Override
                    public ListWorkloadMappingsResponse apply(ListWorkloadMappingsRequest request) {
                        return client.listWorkloadMappings(request);
                    }
                },
                new java.util.function.Function<
                        ListWorkloadMappingsResponse,
                        java.util.List<
                                com.oracle.bmc.containerengine.model.WorkloadMappingSummary>>() {
                    @Override
                    public java.util.List<
                                    com.oracle.bmc.containerengine.model.WorkloadMappingSummary>
                            apply(ListWorkloadMappingsResponse response) {
                        return response.getItems();
                    }
                });
    }
}

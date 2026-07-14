/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.generativeai;

import com.oracle.bmc.generativeai.requests.*;
import com.oracle.bmc.generativeai.responses.*;

/**
 * Collection of helper methods that can be used to provide an {@link java.lang.Iterable} interface
 * to any list operations of GenerativeAi where multiple pages of data may be fetched. Two styles of
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
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20231130")
public class GenerativeAiPaginators {
    private final GenerativeAi client;

    public GenerativeAiPaginators(GenerativeAi client) {
        this.client = client;
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the listApiKeys
     * operation. This iterable will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses
     *     received from the service.
     */
    public Iterable<ListApiKeysResponse> listApiKeysResponseIterator(
            final ListApiKeysRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListApiKeysRequest.Builder, ListApiKeysRequest, ListApiKeysResponse>(
                new java.util.function.Supplier<ListApiKeysRequest.Builder>() {
                    @Override
                    public ListApiKeysRequest.Builder get() {
                        return ListApiKeysRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListApiKeysResponse, String>() {
                    @Override
                    public String apply(ListApiKeysResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListApiKeysRequest.Builder>,
                        ListApiKeysRequest>() {
                    @Override
                    public ListApiKeysRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListApiKeysRequest.Builder>
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
                new java.util.function.Function<ListApiKeysRequest, ListApiKeysResponse>() {
                    @Override
                    public ListApiKeysResponse apply(ListApiKeysRequest request) {
                        return client.listApiKeys(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link
     * com.oracle.bmc.generativeai.model.ApiKeySummary} objects contained in responses from the
     * listApiKeys operation. This iterable will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link
     *     com.oracle.bmc.generativeai.model.ApiKeySummary} objects contained in responses received
     *     from the service.
     */
    public Iterable<com.oracle.bmc.generativeai.model.ApiKeySummary> listApiKeysRecordIterator(
            final ListApiKeysRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListApiKeysRequest.Builder,
                ListApiKeysRequest,
                ListApiKeysResponse,
                com.oracle.bmc.generativeai.model.ApiKeySummary>(
                new java.util.function.Supplier<ListApiKeysRequest.Builder>() {
                    @Override
                    public ListApiKeysRequest.Builder get() {
                        return ListApiKeysRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListApiKeysResponse, String>() {
                    @Override
                    public String apply(ListApiKeysResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListApiKeysRequest.Builder>,
                        ListApiKeysRequest>() {
                    @Override
                    public ListApiKeysRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListApiKeysRequest.Builder>
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
                new java.util.function.Function<ListApiKeysRequest, ListApiKeysResponse>() {
                    @Override
                    public ListApiKeysResponse apply(ListApiKeysRequest request) {
                        return client.listApiKeys(request);
                    }
                },
                new java.util.function.Function<
                        ListApiKeysResponse,
                        java.util.List<com.oracle.bmc.generativeai.model.ApiKeySummary>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.generativeai.model.ApiKeySummary> apply(
                            ListApiKeysResponse response) {
                        return response.getApiKeyCollection().getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the
     * listDedicatedAiClusters operation. This iterable will fetch more data from the server as
     * needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses
     *     received from the service.
     */
    public Iterable<ListDedicatedAiClustersResponse> listDedicatedAiClustersResponseIterator(
            final ListDedicatedAiClustersRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListDedicatedAiClustersRequest.Builder,
                ListDedicatedAiClustersRequest,
                ListDedicatedAiClustersResponse>(
                new java.util.function.Supplier<ListDedicatedAiClustersRequest.Builder>() {
                    @Override
                    public ListDedicatedAiClustersRequest.Builder get() {
                        return ListDedicatedAiClustersRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListDedicatedAiClustersResponse, String>() {
                    @Override
                    public String apply(ListDedicatedAiClustersResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListDedicatedAiClustersRequest.Builder>,
                        ListDedicatedAiClustersRequest>() {
                    @Override
                    public ListDedicatedAiClustersRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListDedicatedAiClustersRequest.Builder>
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
                        ListDedicatedAiClustersRequest, ListDedicatedAiClustersResponse>() {
                    @Override
                    public ListDedicatedAiClustersResponse apply(
                            ListDedicatedAiClustersRequest request) {
                        return client.listDedicatedAiClusters(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link
     * com.oracle.bmc.generativeai.model.DedicatedAiClusterSummary} objects contained in responses
     * from the listDedicatedAiClusters operation. This iterable will fetch more data from the
     * server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link
     *     com.oracle.bmc.generativeai.model.DedicatedAiClusterSummary} objects contained in
     *     responses received from the service.
     */
    public Iterable<com.oracle.bmc.generativeai.model.DedicatedAiClusterSummary>
            listDedicatedAiClustersRecordIterator(final ListDedicatedAiClustersRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListDedicatedAiClustersRequest.Builder,
                ListDedicatedAiClustersRequest,
                ListDedicatedAiClustersResponse,
                com.oracle.bmc.generativeai.model.DedicatedAiClusterSummary>(
                new java.util.function.Supplier<ListDedicatedAiClustersRequest.Builder>() {
                    @Override
                    public ListDedicatedAiClustersRequest.Builder get() {
                        return ListDedicatedAiClustersRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListDedicatedAiClustersResponse, String>() {
                    @Override
                    public String apply(ListDedicatedAiClustersResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListDedicatedAiClustersRequest.Builder>,
                        ListDedicatedAiClustersRequest>() {
                    @Override
                    public ListDedicatedAiClustersRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListDedicatedAiClustersRequest.Builder>
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
                        ListDedicatedAiClustersRequest, ListDedicatedAiClustersResponse>() {
                    @Override
                    public ListDedicatedAiClustersResponse apply(
                            ListDedicatedAiClustersRequest request) {
                        return client.listDedicatedAiClusters(request);
                    }
                },
                new java.util.function.Function<
                        ListDedicatedAiClustersResponse,
                        java.util.List<
                                com.oracle.bmc.generativeai.model.DedicatedAiClusterSummary>>() {
                    @Override
                    public java.util.List<
                                    com.oracle.bmc.generativeai.model.DedicatedAiClusterSummary>
                            apply(ListDedicatedAiClustersResponse response) {
                        return response.getDedicatedAiClusterCollection().getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the listEndpoints
     * operation. This iterable will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses
     *     received from the service.
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
     * Creates a new iterable which will iterate over the {@link
     * com.oracle.bmc.generativeai.model.EndpointSummary} objects contained in responses from the
     * listEndpoints operation. This iterable will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link
     *     com.oracle.bmc.generativeai.model.EndpointSummary} objects contained in responses
     *     received from the service.
     */
    public Iterable<com.oracle.bmc.generativeai.model.EndpointSummary> listEndpointsRecordIterator(
            final ListEndpointsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListEndpointsRequest.Builder,
                ListEndpointsRequest,
                ListEndpointsResponse,
                com.oracle.bmc.generativeai.model.EndpointSummary>(
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
                        java.util.List<com.oracle.bmc.generativeai.model.EndpointSummary>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.generativeai.model.EndpointSummary> apply(
                            ListEndpointsResponse response) {
                        return response.getEndpointCollection().getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the
     * listGenerativeAiPrivateEndpoints operation. This iterable will fetch more data from the
     * server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses
     *     received from the service.
     */
    public Iterable<ListGenerativeAiPrivateEndpointsResponse>
            listGenerativeAiPrivateEndpointsResponseIterator(
                    final ListGenerativeAiPrivateEndpointsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListGenerativeAiPrivateEndpointsRequest.Builder,
                ListGenerativeAiPrivateEndpointsRequest,
                ListGenerativeAiPrivateEndpointsResponse>(
                new java.util.function.Supplier<ListGenerativeAiPrivateEndpointsRequest.Builder>() {
                    @Override
                    public ListGenerativeAiPrivateEndpointsRequest.Builder get() {
                        return ListGenerativeAiPrivateEndpointsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<
                        ListGenerativeAiPrivateEndpointsResponse, String>() {
                    @Override
                    public String apply(ListGenerativeAiPrivateEndpointsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListGenerativeAiPrivateEndpointsRequest.Builder>,
                        ListGenerativeAiPrivateEndpointsRequest>() {
                    @Override
                    public ListGenerativeAiPrivateEndpointsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListGenerativeAiPrivateEndpointsRequest.Builder>
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
                        ListGenerativeAiPrivateEndpointsRequest,
                        ListGenerativeAiPrivateEndpointsResponse>() {
                    @Override
                    public ListGenerativeAiPrivateEndpointsResponse apply(
                            ListGenerativeAiPrivateEndpointsRequest request) {
                        return client.listGenerativeAiPrivateEndpoints(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link
     * com.oracle.bmc.generativeai.model.GenerativeAiPrivateEndpointSummary} objects contained in
     * responses from the listGenerativeAiPrivateEndpoints operation. This iterable will fetch more
     * data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link
     *     com.oracle.bmc.generativeai.model.GenerativeAiPrivateEndpointSummary} objects contained
     *     in responses received from the service.
     */
    public Iterable<com.oracle.bmc.generativeai.model.GenerativeAiPrivateEndpointSummary>
            listGenerativeAiPrivateEndpointsRecordIterator(
                    final ListGenerativeAiPrivateEndpointsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListGenerativeAiPrivateEndpointsRequest.Builder,
                ListGenerativeAiPrivateEndpointsRequest,
                ListGenerativeAiPrivateEndpointsResponse,
                com.oracle.bmc.generativeai.model.GenerativeAiPrivateEndpointSummary>(
                new java.util.function.Supplier<ListGenerativeAiPrivateEndpointsRequest.Builder>() {
                    @Override
                    public ListGenerativeAiPrivateEndpointsRequest.Builder get() {
                        return ListGenerativeAiPrivateEndpointsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<
                        ListGenerativeAiPrivateEndpointsResponse, String>() {
                    @Override
                    public String apply(ListGenerativeAiPrivateEndpointsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListGenerativeAiPrivateEndpointsRequest.Builder>,
                        ListGenerativeAiPrivateEndpointsRequest>() {
                    @Override
                    public ListGenerativeAiPrivateEndpointsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListGenerativeAiPrivateEndpointsRequest.Builder>
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
                        ListGenerativeAiPrivateEndpointsRequest,
                        ListGenerativeAiPrivateEndpointsResponse>() {
                    @Override
                    public ListGenerativeAiPrivateEndpointsResponse apply(
                            ListGenerativeAiPrivateEndpointsRequest request) {
                        return client.listGenerativeAiPrivateEndpoints(request);
                    }
                },
                new java.util.function.Function<
                        ListGenerativeAiPrivateEndpointsResponse,
                        java.util.List<
                                com.oracle.bmc.generativeai.model
                                        .GenerativeAiPrivateEndpointSummary>>() {
                    @Override
                    public java.util.List<
                                    com.oracle.bmc.generativeai.model
                                            .GenerativeAiPrivateEndpointSummary>
                            apply(ListGenerativeAiPrivateEndpointsResponse response) {
                        return response.getGenerativeAiPrivateEndpointCollection().getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the
     * listGenerativeAiProjects operation. This iterable will fetch more data from the server as
     * needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses
     *     received from the service.
     */
    public Iterable<ListGenerativeAiProjectsResponse> listGenerativeAiProjectsResponseIterator(
            final ListGenerativeAiProjectsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListGenerativeAiProjectsRequest.Builder,
                ListGenerativeAiProjectsRequest,
                ListGenerativeAiProjectsResponse>(
                new java.util.function.Supplier<ListGenerativeAiProjectsRequest.Builder>() {
                    @Override
                    public ListGenerativeAiProjectsRequest.Builder get() {
                        return ListGenerativeAiProjectsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListGenerativeAiProjectsResponse, String>() {
                    @Override
                    public String apply(ListGenerativeAiProjectsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListGenerativeAiProjectsRequest.Builder>,
                        ListGenerativeAiProjectsRequest>() {
                    @Override
                    public ListGenerativeAiProjectsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListGenerativeAiProjectsRequest.Builder>
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
                        ListGenerativeAiProjectsRequest, ListGenerativeAiProjectsResponse>() {
                    @Override
                    public ListGenerativeAiProjectsResponse apply(
                            ListGenerativeAiProjectsRequest request) {
                        return client.listGenerativeAiProjects(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link
     * com.oracle.bmc.generativeai.model.GenerativeAiProjectSummary} objects contained in responses
     * from the listGenerativeAiProjects operation. This iterable will fetch more data from the
     * server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link
     *     com.oracle.bmc.generativeai.model.GenerativeAiProjectSummary} objects contained in
     *     responses received from the service.
     */
    public Iterable<com.oracle.bmc.generativeai.model.GenerativeAiProjectSummary>
            listGenerativeAiProjectsRecordIterator(final ListGenerativeAiProjectsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListGenerativeAiProjectsRequest.Builder,
                ListGenerativeAiProjectsRequest,
                ListGenerativeAiProjectsResponse,
                com.oracle.bmc.generativeai.model.GenerativeAiProjectSummary>(
                new java.util.function.Supplier<ListGenerativeAiProjectsRequest.Builder>() {
                    @Override
                    public ListGenerativeAiProjectsRequest.Builder get() {
                        return ListGenerativeAiProjectsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListGenerativeAiProjectsResponse, String>() {
                    @Override
                    public String apply(ListGenerativeAiProjectsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListGenerativeAiProjectsRequest.Builder>,
                        ListGenerativeAiProjectsRequest>() {
                    @Override
                    public ListGenerativeAiProjectsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListGenerativeAiProjectsRequest.Builder>
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
                        ListGenerativeAiProjectsRequest, ListGenerativeAiProjectsResponse>() {
                    @Override
                    public ListGenerativeAiProjectsResponse apply(
                            ListGenerativeAiProjectsRequest request) {
                        return client.listGenerativeAiProjects(request);
                    }
                },
                new java.util.function.Function<
                        ListGenerativeAiProjectsResponse,
                        java.util.List<
                                com.oracle.bmc.generativeai.model.GenerativeAiProjectSummary>>() {
                    @Override
                    public java.util.List<
                                    com.oracle.bmc.generativeai.model.GenerativeAiProjectSummary>
                            apply(ListGenerativeAiProjectsResponse response) {
                        return response.getGenerativeAiProjectCollection().getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the
     * listHostedApplicationStorages operation. This iterable will fetch more data from the server
     * as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses
     *     received from the service.
     */
    public Iterable<ListHostedApplicationStoragesResponse>
            listHostedApplicationStoragesResponseIterator(
                    final ListHostedApplicationStoragesRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListHostedApplicationStoragesRequest.Builder,
                ListHostedApplicationStoragesRequest,
                ListHostedApplicationStoragesResponse>(
                new java.util.function.Supplier<ListHostedApplicationStoragesRequest.Builder>() {
                    @Override
                    public ListHostedApplicationStoragesRequest.Builder get() {
                        return ListHostedApplicationStoragesRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListHostedApplicationStoragesResponse, String>() {
                    @Override
                    public String apply(ListHostedApplicationStoragesResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListHostedApplicationStoragesRequest.Builder>,
                        ListHostedApplicationStoragesRequest>() {
                    @Override
                    public ListHostedApplicationStoragesRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListHostedApplicationStoragesRequest.Builder>
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
                        ListHostedApplicationStoragesRequest,
                        ListHostedApplicationStoragesResponse>() {
                    @Override
                    public ListHostedApplicationStoragesResponse apply(
                            ListHostedApplicationStoragesRequest request) {
                        return client.listHostedApplicationStorages(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link
     * com.oracle.bmc.generativeai.model.HostedApplicationStorageSummary} objects contained in
     * responses from the listHostedApplicationStorages operation. This iterable will fetch more
     * data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link
     *     com.oracle.bmc.generativeai.model.HostedApplicationStorageSummary} objects contained in
     *     responses received from the service.
     */
    public Iterable<com.oracle.bmc.generativeai.model.HostedApplicationStorageSummary>
            listHostedApplicationStoragesRecordIterator(
                    final ListHostedApplicationStoragesRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListHostedApplicationStoragesRequest.Builder,
                ListHostedApplicationStoragesRequest,
                ListHostedApplicationStoragesResponse,
                com.oracle.bmc.generativeai.model.HostedApplicationStorageSummary>(
                new java.util.function.Supplier<ListHostedApplicationStoragesRequest.Builder>() {
                    @Override
                    public ListHostedApplicationStoragesRequest.Builder get() {
                        return ListHostedApplicationStoragesRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListHostedApplicationStoragesResponse, String>() {
                    @Override
                    public String apply(ListHostedApplicationStoragesResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListHostedApplicationStoragesRequest.Builder>,
                        ListHostedApplicationStoragesRequest>() {
                    @Override
                    public ListHostedApplicationStoragesRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListHostedApplicationStoragesRequest.Builder>
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
                        ListHostedApplicationStoragesRequest,
                        ListHostedApplicationStoragesResponse>() {
                    @Override
                    public ListHostedApplicationStoragesResponse apply(
                            ListHostedApplicationStoragesRequest request) {
                        return client.listHostedApplicationStorages(request);
                    }
                },
                new java.util.function.Function<
                        ListHostedApplicationStoragesResponse,
                        java.util.List<
                                com.oracle.bmc.generativeai.model
                                        .HostedApplicationStorageSummary>>() {
                    @Override
                    public java.util.List<
                                    com.oracle.bmc.generativeai.model
                                            .HostedApplicationStorageSummary>
                            apply(ListHostedApplicationStoragesResponse response) {
                        return response.getHostedApplicationStorageCollection().getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the
     * listHostedApplications operation. This iterable will fetch more data from the server as
     * needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses
     *     received from the service.
     */
    public Iterable<ListHostedApplicationsResponse> listHostedApplicationsResponseIterator(
            final ListHostedApplicationsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListHostedApplicationsRequest.Builder,
                ListHostedApplicationsRequest,
                ListHostedApplicationsResponse>(
                new java.util.function.Supplier<ListHostedApplicationsRequest.Builder>() {
                    @Override
                    public ListHostedApplicationsRequest.Builder get() {
                        return ListHostedApplicationsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListHostedApplicationsResponse, String>() {
                    @Override
                    public String apply(ListHostedApplicationsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListHostedApplicationsRequest.Builder>,
                        ListHostedApplicationsRequest>() {
                    @Override
                    public ListHostedApplicationsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListHostedApplicationsRequest.Builder>
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
                        ListHostedApplicationsRequest, ListHostedApplicationsResponse>() {
                    @Override
                    public ListHostedApplicationsResponse apply(
                            ListHostedApplicationsRequest request) {
                        return client.listHostedApplications(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link
     * com.oracle.bmc.generativeai.model.HostedApplicationSummary} objects contained in responses
     * from the listHostedApplications operation. This iterable will fetch more data from the server
     * as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link
     *     com.oracle.bmc.generativeai.model.HostedApplicationSummary} objects contained in
     *     responses received from the service.
     */
    public Iterable<com.oracle.bmc.generativeai.model.HostedApplicationSummary>
            listHostedApplicationsRecordIterator(final ListHostedApplicationsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListHostedApplicationsRequest.Builder,
                ListHostedApplicationsRequest,
                ListHostedApplicationsResponse,
                com.oracle.bmc.generativeai.model.HostedApplicationSummary>(
                new java.util.function.Supplier<ListHostedApplicationsRequest.Builder>() {
                    @Override
                    public ListHostedApplicationsRequest.Builder get() {
                        return ListHostedApplicationsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListHostedApplicationsResponse, String>() {
                    @Override
                    public String apply(ListHostedApplicationsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListHostedApplicationsRequest.Builder>,
                        ListHostedApplicationsRequest>() {
                    @Override
                    public ListHostedApplicationsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListHostedApplicationsRequest.Builder>
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
                        ListHostedApplicationsRequest, ListHostedApplicationsResponse>() {
                    @Override
                    public ListHostedApplicationsResponse apply(
                            ListHostedApplicationsRequest request) {
                        return client.listHostedApplications(request);
                    }
                },
                new java.util.function.Function<
                        ListHostedApplicationsResponse,
                        java.util.List<
                                com.oracle.bmc.generativeai.model.HostedApplicationSummary>>() {
                    @Override
                    public java.util.List<
                                    com.oracle.bmc.generativeai.model.HostedApplicationSummary>
                            apply(ListHostedApplicationsResponse response) {
                        return response.getHostedApplicationCollection().getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the
     * listHostedApplicationsIam operation. This iterable will fetch more data from the server as
     * needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses
     *     received from the service.
     */
    public Iterable<ListHostedApplicationsIamResponse> listHostedApplicationsIamResponseIterator(
            final ListHostedApplicationsIamRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListHostedApplicationsIamRequest.Builder,
                ListHostedApplicationsIamRequest,
                ListHostedApplicationsIamResponse>(
                new java.util.function.Supplier<ListHostedApplicationsIamRequest.Builder>() {
                    @Override
                    public ListHostedApplicationsIamRequest.Builder get() {
                        return ListHostedApplicationsIamRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListHostedApplicationsIamResponse, String>() {
                    @Override
                    public String apply(ListHostedApplicationsIamResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListHostedApplicationsIamRequest.Builder>,
                        ListHostedApplicationsIamRequest>() {
                    @Override
                    public ListHostedApplicationsIamRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListHostedApplicationsIamRequest.Builder>
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
                        ListHostedApplicationsIamRequest, ListHostedApplicationsIamResponse>() {
                    @Override
                    public ListHostedApplicationsIamResponse apply(
                            ListHostedApplicationsIamRequest request) {
                        return client.listHostedApplicationsIam(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link
     * com.oracle.bmc.generativeai.model.HostedApplicationSummary} objects contained in responses
     * from the listHostedApplicationsIam operation. This iterable will fetch more data from the
     * server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link
     *     com.oracle.bmc.generativeai.model.HostedApplicationSummary} objects contained in
     *     responses received from the service.
     */
    public Iterable<com.oracle.bmc.generativeai.model.HostedApplicationSummary>
            listHostedApplicationsIamRecordIterator(
                    final ListHostedApplicationsIamRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListHostedApplicationsIamRequest.Builder,
                ListHostedApplicationsIamRequest,
                ListHostedApplicationsIamResponse,
                com.oracle.bmc.generativeai.model.HostedApplicationSummary>(
                new java.util.function.Supplier<ListHostedApplicationsIamRequest.Builder>() {
                    @Override
                    public ListHostedApplicationsIamRequest.Builder get() {
                        return ListHostedApplicationsIamRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListHostedApplicationsIamResponse, String>() {
                    @Override
                    public String apply(ListHostedApplicationsIamResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListHostedApplicationsIamRequest.Builder>,
                        ListHostedApplicationsIamRequest>() {
                    @Override
                    public ListHostedApplicationsIamRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListHostedApplicationsIamRequest.Builder>
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
                        ListHostedApplicationsIamRequest, ListHostedApplicationsIamResponse>() {
                    @Override
                    public ListHostedApplicationsIamResponse apply(
                            ListHostedApplicationsIamRequest request) {
                        return client.listHostedApplicationsIam(request);
                    }
                },
                new java.util.function.Function<
                        ListHostedApplicationsIamResponse,
                        java.util.List<
                                com.oracle.bmc.generativeai.model.HostedApplicationSummary>>() {
                    @Override
                    public java.util.List<
                                    com.oracle.bmc.generativeai.model.HostedApplicationSummary>
                            apply(ListHostedApplicationsIamResponse response) {
                        return response.getHostedApplicationCollection().getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the
     * listHostedDeployments operation. This iterable will fetch more data from the server as
     * needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses
     *     received from the service.
     */
    public Iterable<ListHostedDeploymentsResponse> listHostedDeploymentsResponseIterator(
            final ListHostedDeploymentsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListHostedDeploymentsRequest.Builder,
                ListHostedDeploymentsRequest,
                ListHostedDeploymentsResponse>(
                new java.util.function.Supplier<ListHostedDeploymentsRequest.Builder>() {
                    @Override
                    public ListHostedDeploymentsRequest.Builder get() {
                        return ListHostedDeploymentsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListHostedDeploymentsResponse, String>() {
                    @Override
                    public String apply(ListHostedDeploymentsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListHostedDeploymentsRequest.Builder>,
                        ListHostedDeploymentsRequest>() {
                    @Override
                    public ListHostedDeploymentsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListHostedDeploymentsRequest.Builder>
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
                        ListHostedDeploymentsRequest, ListHostedDeploymentsResponse>() {
                    @Override
                    public ListHostedDeploymentsResponse apply(
                            ListHostedDeploymentsRequest request) {
                        return client.listHostedDeployments(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link
     * com.oracle.bmc.generativeai.model.HostedDeploymentSummary} objects contained in responses
     * from the listHostedDeployments operation. This iterable will fetch more data from the server
     * as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link
     *     com.oracle.bmc.generativeai.model.HostedDeploymentSummary} objects contained in responses
     *     received from the service.
     */
    public Iterable<com.oracle.bmc.generativeai.model.HostedDeploymentSummary>
            listHostedDeploymentsRecordIterator(final ListHostedDeploymentsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListHostedDeploymentsRequest.Builder,
                ListHostedDeploymentsRequest,
                ListHostedDeploymentsResponse,
                com.oracle.bmc.generativeai.model.HostedDeploymentSummary>(
                new java.util.function.Supplier<ListHostedDeploymentsRequest.Builder>() {
                    @Override
                    public ListHostedDeploymentsRequest.Builder get() {
                        return ListHostedDeploymentsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListHostedDeploymentsResponse, String>() {
                    @Override
                    public String apply(ListHostedDeploymentsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListHostedDeploymentsRequest.Builder>,
                        ListHostedDeploymentsRequest>() {
                    @Override
                    public ListHostedDeploymentsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListHostedDeploymentsRequest.Builder>
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
                        ListHostedDeploymentsRequest, ListHostedDeploymentsResponse>() {
                    @Override
                    public ListHostedDeploymentsResponse apply(
                            ListHostedDeploymentsRequest request) {
                        return client.listHostedDeployments(request);
                    }
                },
                new java.util.function.Function<
                        ListHostedDeploymentsResponse,
                        java.util.List<
                                com.oracle.bmc.generativeai.model.HostedDeploymentSummary>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.generativeai.model.HostedDeploymentSummary>
                            apply(ListHostedDeploymentsResponse response) {
                        return response.getHostedDeploymentCollection().getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the
     * listImportedModels operation. This iterable will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses
     *     received from the service.
     */
    public Iterable<ListImportedModelsResponse> listImportedModelsResponseIterator(
            final ListImportedModelsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListImportedModelsRequest.Builder,
                ListImportedModelsRequest,
                ListImportedModelsResponse>(
                new java.util.function.Supplier<ListImportedModelsRequest.Builder>() {
                    @Override
                    public ListImportedModelsRequest.Builder get() {
                        return ListImportedModelsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListImportedModelsResponse, String>() {
                    @Override
                    public String apply(ListImportedModelsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListImportedModelsRequest.Builder>,
                        ListImportedModelsRequest>() {
                    @Override
                    public ListImportedModelsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListImportedModelsRequest.Builder>
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
                        ListImportedModelsRequest, ListImportedModelsResponse>() {
                    @Override
                    public ListImportedModelsResponse apply(ListImportedModelsRequest request) {
                        return client.listImportedModels(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link
     * com.oracle.bmc.generativeai.model.ImportedModelSummary} objects contained in responses from
     * the listImportedModels operation. This iterable will fetch more data from the server as
     * needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link
     *     com.oracle.bmc.generativeai.model.ImportedModelSummary} objects contained in responses
     *     received from the service.
     */
    public Iterable<com.oracle.bmc.generativeai.model.ImportedModelSummary>
            listImportedModelsRecordIterator(final ListImportedModelsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListImportedModelsRequest.Builder,
                ListImportedModelsRequest,
                ListImportedModelsResponse,
                com.oracle.bmc.generativeai.model.ImportedModelSummary>(
                new java.util.function.Supplier<ListImportedModelsRequest.Builder>() {
                    @Override
                    public ListImportedModelsRequest.Builder get() {
                        return ListImportedModelsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListImportedModelsResponse, String>() {
                    @Override
                    public String apply(ListImportedModelsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListImportedModelsRequest.Builder>,
                        ListImportedModelsRequest>() {
                    @Override
                    public ListImportedModelsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListImportedModelsRequest.Builder>
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
                        ListImportedModelsRequest, ListImportedModelsResponse>() {
                    @Override
                    public ListImportedModelsResponse apply(ListImportedModelsRequest request) {
                        return client.listImportedModels(request);
                    }
                },
                new java.util.function.Function<
                        ListImportedModelsResponse,
                        java.util.List<com.oracle.bmc.generativeai.model.ImportedModelSummary>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.generativeai.model.ImportedModelSummary>
                            apply(ListImportedModelsResponse response) {
                        return response.getImportedModelCollection().getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the listModels
     * operation. This iterable will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses
     *     received from the service.
     */
    public Iterable<ListModelsResponse> listModelsResponseIterator(
            final ListModelsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListModelsRequest.Builder, ListModelsRequest, ListModelsResponse>(
                new java.util.function.Supplier<ListModelsRequest.Builder>() {
                    @Override
                    public ListModelsRequest.Builder get() {
                        return ListModelsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListModelsResponse, String>() {
                    @Override
                    public String apply(ListModelsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListModelsRequest.Builder>,
                        ListModelsRequest>() {
                    @Override
                    public ListModelsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListModelsRequest.Builder>
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
                new java.util.function.Function<ListModelsRequest, ListModelsResponse>() {
                    @Override
                    public ListModelsResponse apply(ListModelsRequest request) {
                        return client.listModels(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link
     * com.oracle.bmc.generativeai.model.ModelSummary} objects contained in responses from the
     * listModels operation. This iterable will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link
     *     com.oracle.bmc.generativeai.model.ModelSummary} objects contained in responses received
     *     from the service.
     */
    public Iterable<com.oracle.bmc.generativeai.model.ModelSummary> listModelsRecordIterator(
            final ListModelsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListModelsRequest.Builder,
                ListModelsRequest,
                ListModelsResponse,
                com.oracle.bmc.generativeai.model.ModelSummary>(
                new java.util.function.Supplier<ListModelsRequest.Builder>() {
                    @Override
                    public ListModelsRequest.Builder get() {
                        return ListModelsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListModelsResponse, String>() {
                    @Override
                    public String apply(ListModelsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListModelsRequest.Builder>,
                        ListModelsRequest>() {
                    @Override
                    public ListModelsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListModelsRequest.Builder>
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
                new java.util.function.Function<ListModelsRequest, ListModelsResponse>() {
                    @Override
                    public ListModelsResponse apply(ListModelsRequest request) {
                        return client.listModels(request);
                    }
                },
                new java.util.function.Function<
                        ListModelsResponse,
                        java.util.List<com.oracle.bmc.generativeai.model.ModelSummary>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.generativeai.model.ModelSummary> apply(
                            ListModelsResponse response) {
                        return response.getModelCollection().getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the
     * listSemanticStores operation. This iterable will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses
     *     received from the service.
     */
    public Iterable<ListSemanticStoresResponse> listSemanticStoresResponseIterator(
            final ListSemanticStoresRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListSemanticStoresRequest.Builder,
                ListSemanticStoresRequest,
                ListSemanticStoresResponse>(
                new java.util.function.Supplier<ListSemanticStoresRequest.Builder>() {
                    @Override
                    public ListSemanticStoresRequest.Builder get() {
                        return ListSemanticStoresRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListSemanticStoresResponse, String>() {
                    @Override
                    public String apply(ListSemanticStoresResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListSemanticStoresRequest.Builder>,
                        ListSemanticStoresRequest>() {
                    @Override
                    public ListSemanticStoresRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListSemanticStoresRequest.Builder>
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
                        ListSemanticStoresRequest, ListSemanticStoresResponse>() {
                    @Override
                    public ListSemanticStoresResponse apply(ListSemanticStoresRequest request) {
                        return client.listSemanticStores(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link
     * com.oracle.bmc.generativeai.model.SemanticStoreSummary} objects contained in responses from
     * the listSemanticStores operation. This iterable will fetch more data from the server as
     * needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link
     *     com.oracle.bmc.generativeai.model.SemanticStoreSummary} objects contained in responses
     *     received from the service.
     */
    public Iterable<com.oracle.bmc.generativeai.model.SemanticStoreSummary>
            listSemanticStoresRecordIterator(final ListSemanticStoresRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListSemanticStoresRequest.Builder,
                ListSemanticStoresRequest,
                ListSemanticStoresResponse,
                com.oracle.bmc.generativeai.model.SemanticStoreSummary>(
                new java.util.function.Supplier<ListSemanticStoresRequest.Builder>() {
                    @Override
                    public ListSemanticStoresRequest.Builder get() {
                        return ListSemanticStoresRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListSemanticStoresResponse, String>() {
                    @Override
                    public String apply(ListSemanticStoresResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListSemanticStoresRequest.Builder>,
                        ListSemanticStoresRequest>() {
                    @Override
                    public ListSemanticStoresRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListSemanticStoresRequest.Builder>
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
                        ListSemanticStoresRequest, ListSemanticStoresResponse>() {
                    @Override
                    public ListSemanticStoresResponse apply(ListSemanticStoresRequest request) {
                        return client.listSemanticStores(request);
                    }
                },
                new java.util.function.Function<
                        ListSemanticStoresResponse,
                        java.util.List<com.oracle.bmc.generativeai.model.SemanticStoreSummary>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.generativeai.model.SemanticStoreSummary>
                            apply(ListSemanticStoresResponse response) {
                        return response.getSemanticStoreCollection().getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the
     * listVectorStoreConnectorFileSyncIngestionLogs operation. This iterable will fetch more data
     * from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses
     *     received from the service.
     */
    public Iterable<ListVectorStoreConnectorFileSyncIngestionLogsResponse>
            listVectorStoreConnectorFileSyncIngestionLogsResponseIterator(
                    final ListVectorStoreConnectorFileSyncIngestionLogsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListVectorStoreConnectorFileSyncIngestionLogsRequest.Builder,
                ListVectorStoreConnectorFileSyncIngestionLogsRequest,
                ListVectorStoreConnectorFileSyncIngestionLogsResponse>(
                new java.util.function.Supplier<
                        ListVectorStoreConnectorFileSyncIngestionLogsRequest.Builder>() {
                    @Override
                    public ListVectorStoreConnectorFileSyncIngestionLogsRequest.Builder get() {
                        return ListVectorStoreConnectorFileSyncIngestionLogsRequest.builder()
                                .copy(request);
                    }
                },
                new java.util.function.Function<
                        ListVectorStoreConnectorFileSyncIngestionLogsResponse, String>() {
                    @Override
                    public String apply(
                            ListVectorStoreConnectorFileSyncIngestionLogsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListVectorStoreConnectorFileSyncIngestionLogsRequest.Builder>,
                        ListVectorStoreConnectorFileSyncIngestionLogsRequest>() {
                    @Override
                    public ListVectorStoreConnectorFileSyncIngestionLogsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListVectorStoreConnectorFileSyncIngestionLogsRequest
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
                        ListVectorStoreConnectorFileSyncIngestionLogsRequest,
                        ListVectorStoreConnectorFileSyncIngestionLogsResponse>() {
                    @Override
                    public ListVectorStoreConnectorFileSyncIngestionLogsResponse apply(
                            ListVectorStoreConnectorFileSyncIngestionLogsRequest request) {
                        return client.listVectorStoreConnectorFileSyncIngestionLogs(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link
     * com.oracle.bmc.generativeai.model.FileSyncIngestionLogs} objects contained in responses from
     * the listVectorStoreConnectorFileSyncIngestionLogs operation. This iterable will fetch more
     * data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link
     *     com.oracle.bmc.generativeai.model.FileSyncIngestionLogs} objects contained in responses
     *     received from the service.
     */
    public Iterable<com.oracle.bmc.generativeai.model.FileSyncIngestionLogs>
            listVectorStoreConnectorFileSyncIngestionLogsRecordIterator(
                    final ListVectorStoreConnectorFileSyncIngestionLogsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListVectorStoreConnectorFileSyncIngestionLogsRequest.Builder,
                ListVectorStoreConnectorFileSyncIngestionLogsRequest,
                ListVectorStoreConnectorFileSyncIngestionLogsResponse,
                com.oracle.bmc.generativeai.model.FileSyncIngestionLogs>(
                new java.util.function.Supplier<
                        ListVectorStoreConnectorFileSyncIngestionLogsRequest.Builder>() {
                    @Override
                    public ListVectorStoreConnectorFileSyncIngestionLogsRequest.Builder get() {
                        return ListVectorStoreConnectorFileSyncIngestionLogsRequest.builder()
                                .copy(request);
                    }
                },
                new java.util.function.Function<
                        ListVectorStoreConnectorFileSyncIngestionLogsResponse, String>() {
                    @Override
                    public String apply(
                            ListVectorStoreConnectorFileSyncIngestionLogsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListVectorStoreConnectorFileSyncIngestionLogsRequest.Builder>,
                        ListVectorStoreConnectorFileSyncIngestionLogsRequest>() {
                    @Override
                    public ListVectorStoreConnectorFileSyncIngestionLogsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListVectorStoreConnectorFileSyncIngestionLogsRequest
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
                        ListVectorStoreConnectorFileSyncIngestionLogsRequest,
                        ListVectorStoreConnectorFileSyncIngestionLogsResponse>() {
                    @Override
                    public ListVectorStoreConnectorFileSyncIngestionLogsResponse apply(
                            ListVectorStoreConnectorFileSyncIngestionLogsRequest request) {
                        return client.listVectorStoreConnectorFileSyncIngestionLogs(request);
                    }
                },
                new java.util.function.Function<
                        ListVectorStoreConnectorFileSyncIngestionLogsResponse,
                        java.util.List<com.oracle.bmc.generativeai.model.FileSyncIngestionLogs>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.generativeai.model.FileSyncIngestionLogs>
                            apply(ListVectorStoreConnectorFileSyncIngestionLogsResponse response) {
                        return response.getFileSyncIngestionLogsCollection().getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the
     * listVectorStoreConnectorFileSyncs operation. This iterable will fetch more data from the
     * server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses
     *     received from the service.
     */
    public Iterable<ListVectorStoreConnectorFileSyncsResponse>
            listVectorStoreConnectorFileSyncsResponseIterator(
                    final ListVectorStoreConnectorFileSyncsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListVectorStoreConnectorFileSyncsRequest.Builder,
                ListVectorStoreConnectorFileSyncsRequest,
                ListVectorStoreConnectorFileSyncsResponse>(
                new java.util.function.Supplier<
                        ListVectorStoreConnectorFileSyncsRequest.Builder>() {
                    @Override
                    public ListVectorStoreConnectorFileSyncsRequest.Builder get() {
                        return ListVectorStoreConnectorFileSyncsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<
                        ListVectorStoreConnectorFileSyncsResponse, String>() {
                    @Override
                    public String apply(ListVectorStoreConnectorFileSyncsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListVectorStoreConnectorFileSyncsRequest.Builder>,
                        ListVectorStoreConnectorFileSyncsRequest>() {
                    @Override
                    public ListVectorStoreConnectorFileSyncsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListVectorStoreConnectorFileSyncsRequest.Builder>
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
                        ListVectorStoreConnectorFileSyncsRequest,
                        ListVectorStoreConnectorFileSyncsResponse>() {
                    @Override
                    public ListVectorStoreConnectorFileSyncsResponse apply(
                            ListVectorStoreConnectorFileSyncsRequest request) {
                        return client.listVectorStoreConnectorFileSyncs(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link
     * com.oracle.bmc.generativeai.model.VectorStoreConnectorFileSyncSummary} objects contained in
     * responses from the listVectorStoreConnectorFileSyncs operation. This iterable will fetch more
     * data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link
     *     com.oracle.bmc.generativeai.model.VectorStoreConnectorFileSyncSummary} objects contained
     *     in responses received from the service.
     */
    public Iterable<com.oracle.bmc.generativeai.model.VectorStoreConnectorFileSyncSummary>
            listVectorStoreConnectorFileSyncsRecordIterator(
                    final ListVectorStoreConnectorFileSyncsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListVectorStoreConnectorFileSyncsRequest.Builder,
                ListVectorStoreConnectorFileSyncsRequest,
                ListVectorStoreConnectorFileSyncsResponse,
                com.oracle.bmc.generativeai.model.VectorStoreConnectorFileSyncSummary>(
                new java.util.function.Supplier<
                        ListVectorStoreConnectorFileSyncsRequest.Builder>() {
                    @Override
                    public ListVectorStoreConnectorFileSyncsRequest.Builder get() {
                        return ListVectorStoreConnectorFileSyncsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<
                        ListVectorStoreConnectorFileSyncsResponse, String>() {
                    @Override
                    public String apply(ListVectorStoreConnectorFileSyncsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListVectorStoreConnectorFileSyncsRequest.Builder>,
                        ListVectorStoreConnectorFileSyncsRequest>() {
                    @Override
                    public ListVectorStoreConnectorFileSyncsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListVectorStoreConnectorFileSyncsRequest.Builder>
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
                        ListVectorStoreConnectorFileSyncsRequest,
                        ListVectorStoreConnectorFileSyncsResponse>() {
                    @Override
                    public ListVectorStoreConnectorFileSyncsResponse apply(
                            ListVectorStoreConnectorFileSyncsRequest request) {
                        return client.listVectorStoreConnectorFileSyncs(request);
                    }
                },
                new java.util.function.Function<
                        ListVectorStoreConnectorFileSyncsResponse,
                        java.util.List<
                                com.oracle.bmc.generativeai.model
                                        .VectorStoreConnectorFileSyncSummary>>() {
                    @Override
                    public java.util.List<
                                    com.oracle.bmc.generativeai.model
                                            .VectorStoreConnectorFileSyncSummary>
                            apply(ListVectorStoreConnectorFileSyncsResponse response) {
                        return response.getVectorStoreConnectorFileSyncCollection().getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the
     * listVectorStoreConnectorIngestionLogs operation. This iterable will fetch more data from the
     * server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses
     *     received from the service.
     */
    public Iterable<ListVectorStoreConnectorIngestionLogsResponse>
            listVectorStoreConnectorIngestionLogsResponseIterator(
                    final ListVectorStoreConnectorIngestionLogsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListVectorStoreConnectorIngestionLogsRequest.Builder,
                ListVectorStoreConnectorIngestionLogsRequest,
                ListVectorStoreConnectorIngestionLogsResponse>(
                new java.util.function.Supplier<
                        ListVectorStoreConnectorIngestionLogsRequest.Builder>() {
                    @Override
                    public ListVectorStoreConnectorIngestionLogsRequest.Builder get() {
                        return ListVectorStoreConnectorIngestionLogsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<
                        ListVectorStoreConnectorIngestionLogsResponse, String>() {
                    @Override
                    public String apply(ListVectorStoreConnectorIngestionLogsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListVectorStoreConnectorIngestionLogsRequest.Builder>,
                        ListVectorStoreConnectorIngestionLogsRequest>() {
                    @Override
                    public ListVectorStoreConnectorIngestionLogsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListVectorStoreConnectorIngestionLogsRequest.Builder>
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
                        ListVectorStoreConnectorIngestionLogsRequest,
                        ListVectorStoreConnectorIngestionLogsResponse>() {
                    @Override
                    public ListVectorStoreConnectorIngestionLogsResponse apply(
                            ListVectorStoreConnectorIngestionLogsRequest request) {
                        return client.listVectorStoreConnectorIngestionLogs(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link
     * com.oracle.bmc.generativeai.model.VectorStoreConnectorIngestionLogs} objects contained in
     * responses from the listVectorStoreConnectorIngestionLogs operation. This iterable will fetch
     * more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link
     *     com.oracle.bmc.generativeai.model.VectorStoreConnectorIngestionLogs} objects contained in
     *     responses received from the service.
     */
    public Iterable<com.oracle.bmc.generativeai.model.VectorStoreConnectorIngestionLogs>
            listVectorStoreConnectorIngestionLogsRecordIterator(
                    final ListVectorStoreConnectorIngestionLogsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListVectorStoreConnectorIngestionLogsRequest.Builder,
                ListVectorStoreConnectorIngestionLogsRequest,
                ListVectorStoreConnectorIngestionLogsResponse,
                com.oracle.bmc.generativeai.model.VectorStoreConnectorIngestionLogs>(
                new java.util.function.Supplier<
                        ListVectorStoreConnectorIngestionLogsRequest.Builder>() {
                    @Override
                    public ListVectorStoreConnectorIngestionLogsRequest.Builder get() {
                        return ListVectorStoreConnectorIngestionLogsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<
                        ListVectorStoreConnectorIngestionLogsResponse, String>() {
                    @Override
                    public String apply(ListVectorStoreConnectorIngestionLogsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListVectorStoreConnectorIngestionLogsRequest.Builder>,
                        ListVectorStoreConnectorIngestionLogsRequest>() {
                    @Override
                    public ListVectorStoreConnectorIngestionLogsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListVectorStoreConnectorIngestionLogsRequest.Builder>
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
                        ListVectorStoreConnectorIngestionLogsRequest,
                        ListVectorStoreConnectorIngestionLogsResponse>() {
                    @Override
                    public ListVectorStoreConnectorIngestionLogsResponse apply(
                            ListVectorStoreConnectorIngestionLogsRequest request) {
                        return client.listVectorStoreConnectorIngestionLogs(request);
                    }
                },
                new java.util.function.Function<
                        ListVectorStoreConnectorIngestionLogsResponse,
                        java.util.List<
                                com.oracle.bmc.generativeai.model
                                        .VectorStoreConnectorIngestionLogs>>() {
                    @Override
                    public java.util.List<
                                    com.oracle.bmc.generativeai.model
                                            .VectorStoreConnectorIngestionLogs>
                            apply(ListVectorStoreConnectorIngestionLogsResponse response) {
                        return response.getVectorStoreConnectorIngestionLogsCollection().getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the
     * listVectorStoreConnectors operation. This iterable will fetch more data from the server as
     * needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses
     *     received from the service.
     */
    public Iterable<ListVectorStoreConnectorsResponse> listVectorStoreConnectorsResponseIterator(
            final ListVectorStoreConnectorsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListVectorStoreConnectorsRequest.Builder,
                ListVectorStoreConnectorsRequest,
                ListVectorStoreConnectorsResponse>(
                new java.util.function.Supplier<ListVectorStoreConnectorsRequest.Builder>() {
                    @Override
                    public ListVectorStoreConnectorsRequest.Builder get() {
                        return ListVectorStoreConnectorsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListVectorStoreConnectorsResponse, String>() {
                    @Override
                    public String apply(ListVectorStoreConnectorsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListVectorStoreConnectorsRequest.Builder>,
                        ListVectorStoreConnectorsRequest>() {
                    @Override
                    public ListVectorStoreConnectorsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListVectorStoreConnectorsRequest.Builder>
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
                        ListVectorStoreConnectorsRequest, ListVectorStoreConnectorsResponse>() {
                    @Override
                    public ListVectorStoreConnectorsResponse apply(
                            ListVectorStoreConnectorsRequest request) {
                        return client.listVectorStoreConnectors(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link
     * com.oracle.bmc.generativeai.model.VectorStoreConnectorSummary} objects contained in responses
     * from the listVectorStoreConnectors operation. This iterable will fetch more data from the
     * server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link
     *     com.oracle.bmc.generativeai.model.VectorStoreConnectorSummary} objects contained in
     *     responses received from the service.
     */
    public Iterable<com.oracle.bmc.generativeai.model.VectorStoreConnectorSummary>
            listVectorStoreConnectorsRecordIterator(
                    final ListVectorStoreConnectorsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListVectorStoreConnectorsRequest.Builder,
                ListVectorStoreConnectorsRequest,
                ListVectorStoreConnectorsResponse,
                com.oracle.bmc.generativeai.model.VectorStoreConnectorSummary>(
                new java.util.function.Supplier<ListVectorStoreConnectorsRequest.Builder>() {
                    @Override
                    public ListVectorStoreConnectorsRequest.Builder get() {
                        return ListVectorStoreConnectorsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListVectorStoreConnectorsResponse, String>() {
                    @Override
                    public String apply(ListVectorStoreConnectorsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListVectorStoreConnectorsRequest.Builder>,
                        ListVectorStoreConnectorsRequest>() {
                    @Override
                    public ListVectorStoreConnectorsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListVectorStoreConnectorsRequest.Builder>
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
                        ListVectorStoreConnectorsRequest, ListVectorStoreConnectorsResponse>() {
                    @Override
                    public ListVectorStoreConnectorsResponse apply(
                            ListVectorStoreConnectorsRequest request) {
                        return client.listVectorStoreConnectors(request);
                    }
                },
                new java.util.function.Function<
                        ListVectorStoreConnectorsResponse,
                        java.util.List<
                                com.oracle.bmc.generativeai.model.VectorStoreConnectorSummary>>() {
                    @Override
                    public java.util.List<
                                    com.oracle.bmc.generativeai.model.VectorStoreConnectorSummary>
                            apply(ListVectorStoreConnectorsResponse response) {
                        return response.getVectorStoreConnectorCollection().getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the
     * listWorkRequestErrors operation. This iterable will fetch more data from the server as
     * needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses
     *     received from the service.
     */
    public Iterable<ListWorkRequestErrorsResponse> listWorkRequestErrorsResponseIterator(
            final ListWorkRequestErrorsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListWorkRequestErrorsRequest.Builder,
                ListWorkRequestErrorsRequest,
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
     * Creates a new iterable which will iterate over the {@link
     * com.oracle.bmc.generativeai.model.WorkRequestError} objects contained in responses from the
     * listWorkRequestErrors operation. This iterable will fetch more data from the server as
     * needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link
     *     com.oracle.bmc.generativeai.model.WorkRequestError} objects contained in responses
     *     received from the service.
     */
    public Iterable<com.oracle.bmc.generativeai.model.WorkRequestError>
            listWorkRequestErrorsRecordIterator(final ListWorkRequestErrorsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListWorkRequestErrorsRequest.Builder,
                ListWorkRequestErrorsRequest,
                ListWorkRequestErrorsResponse,
                com.oracle.bmc.generativeai.model.WorkRequestError>(
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
                        java.util.List<com.oracle.bmc.generativeai.model.WorkRequestError>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.generativeai.model.WorkRequestError> apply(
                            ListWorkRequestErrorsResponse response) {
                        return response.getWorkRequestErrorCollection().getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the
     * listWorkRequestLogs operation. This iterable will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses
     *     received from the service.
     */
    public Iterable<ListWorkRequestLogsResponse> listWorkRequestLogsResponseIterator(
            final ListWorkRequestLogsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListWorkRequestLogsRequest.Builder,
                ListWorkRequestLogsRequest,
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
     * Creates a new iterable which will iterate over the {@link
     * com.oracle.bmc.generativeai.model.WorkRequestLogEntry} objects contained in responses from
     * the listWorkRequestLogs operation. This iterable will fetch more data from the server as
     * needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link
     *     com.oracle.bmc.generativeai.model.WorkRequestLogEntry} objects contained in responses
     *     received from the service.
     */
    public Iterable<com.oracle.bmc.generativeai.model.WorkRequestLogEntry>
            listWorkRequestLogsRecordIterator(final ListWorkRequestLogsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListWorkRequestLogsRequest.Builder,
                ListWorkRequestLogsRequest,
                ListWorkRequestLogsResponse,
                com.oracle.bmc.generativeai.model.WorkRequestLogEntry>(
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
                        java.util.List<com.oracle.bmc.generativeai.model.WorkRequestLogEntry>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.generativeai.model.WorkRequestLogEntry>
                            apply(ListWorkRequestLogsResponse response) {
                        return response.getWorkRequestLogEntryCollection().getItems();
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
     * com.oracle.bmc.generativeai.model.WorkRequestSummary} objects contained in responses from the
     * listWorkRequests operation. This iterable will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link
     *     com.oracle.bmc.generativeai.model.WorkRequestSummary} objects contained in responses
     *     received from the service.
     */
    public Iterable<com.oracle.bmc.generativeai.model.WorkRequestSummary>
            listWorkRequestsRecordIterator(final ListWorkRequestsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListWorkRequestsRequest.Builder,
                ListWorkRequestsRequest,
                ListWorkRequestsResponse,
                com.oracle.bmc.generativeai.model.WorkRequestSummary>(
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
                        java.util.List<com.oracle.bmc.generativeai.model.WorkRequestSummary>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.generativeai.model.WorkRequestSummary>
                            apply(ListWorkRequestsResponse response) {
                        return response.getWorkRequestSummaryCollection().getItems();
                    }
                });
    }
}

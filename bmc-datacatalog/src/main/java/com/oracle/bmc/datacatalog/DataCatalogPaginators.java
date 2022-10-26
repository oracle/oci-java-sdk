/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.datacatalog;

import com.oracle.bmc.datacatalog.requests.*;
import com.oracle.bmc.datacatalog.responses.*;

/**
 * Collection of helper methods that can be used to provide an {@link java.lang.Iterable} interface
 * to any list operations of DataCatalog where multiple pages of data may be fetched. Two styles of
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
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20190325")
public class DataCatalogPaginators {
    private final DataCatalog client;

    public DataCatalogPaginators(DataCatalog client) {
        this.client = client;
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the
     * listAttributeTags operation. This iterable will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses
     *     received from the service.
     */
    public Iterable<ListAttributeTagsResponse> listAttributeTagsResponseIterator(
            final ListAttributeTagsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListAttributeTagsRequest.Builder,
                ListAttributeTagsRequest,
                ListAttributeTagsResponse>(
                new java.util.function.Supplier<ListAttributeTagsRequest.Builder>() {
                    @Override
                    public ListAttributeTagsRequest.Builder get() {
                        return ListAttributeTagsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListAttributeTagsResponse, String>() {
                    @Override
                    public String apply(ListAttributeTagsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListAttributeTagsRequest.Builder>,
                        ListAttributeTagsRequest>() {
                    @Override
                    public ListAttributeTagsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListAttributeTagsRequest.Builder>
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
                        ListAttributeTagsRequest, ListAttributeTagsResponse>() {
                    @Override
                    public ListAttributeTagsResponse apply(ListAttributeTagsRequest request) {
                        return client.listAttributeTags(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link
     * com.oracle.bmc.datacatalog.model.AttributeTagSummary} objects contained in responses from the
     * listAttributeTags operation. This iterable will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link
     *     com.oracle.bmc.datacatalog.model.AttributeTagSummary} objects contained in responses
     *     received from the service.
     */
    public Iterable<com.oracle.bmc.datacatalog.model.AttributeTagSummary>
            listAttributeTagsRecordIterator(final ListAttributeTagsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListAttributeTagsRequest.Builder,
                ListAttributeTagsRequest,
                ListAttributeTagsResponse,
                com.oracle.bmc.datacatalog.model.AttributeTagSummary>(
                new java.util.function.Supplier<ListAttributeTagsRequest.Builder>() {
                    @Override
                    public ListAttributeTagsRequest.Builder get() {
                        return ListAttributeTagsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListAttributeTagsResponse, String>() {
                    @Override
                    public String apply(ListAttributeTagsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListAttributeTagsRequest.Builder>,
                        ListAttributeTagsRequest>() {
                    @Override
                    public ListAttributeTagsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListAttributeTagsRequest.Builder>
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
                        ListAttributeTagsRequest, ListAttributeTagsResponse>() {
                    @Override
                    public ListAttributeTagsResponse apply(ListAttributeTagsRequest request) {
                        return client.listAttributeTags(request);
                    }
                },
                new java.util.function.Function<
                        ListAttributeTagsResponse,
                        java.util.List<com.oracle.bmc.datacatalog.model.AttributeTagSummary>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.datacatalog.model.AttributeTagSummary>
                            apply(ListAttributeTagsResponse response) {
                        return response.getAttributeTagCollection().getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the listAttributes
     * operation. This iterable will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses
     *     received from the service.
     */
    public Iterable<ListAttributesResponse> listAttributesResponseIterator(
            final ListAttributesRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListAttributesRequest.Builder, ListAttributesRequest, ListAttributesResponse>(
                new java.util.function.Supplier<ListAttributesRequest.Builder>() {
                    @Override
                    public ListAttributesRequest.Builder get() {
                        return ListAttributesRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListAttributesResponse, String>() {
                    @Override
                    public String apply(ListAttributesResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListAttributesRequest.Builder>,
                        ListAttributesRequest>() {
                    @Override
                    public ListAttributesRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListAttributesRequest.Builder>
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
                new java.util.function.Function<ListAttributesRequest, ListAttributesResponse>() {
                    @Override
                    public ListAttributesResponse apply(ListAttributesRequest request) {
                        return client.listAttributes(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link
     * com.oracle.bmc.datacatalog.model.AttributeSummary} objects contained in responses from the
     * listAttributes operation. This iterable will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link
     *     com.oracle.bmc.datacatalog.model.AttributeSummary} objects contained in responses
     *     received from the service.
     */
    public Iterable<com.oracle.bmc.datacatalog.model.AttributeSummary> listAttributesRecordIterator(
            final ListAttributesRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListAttributesRequest.Builder,
                ListAttributesRequest,
                ListAttributesResponse,
                com.oracle.bmc.datacatalog.model.AttributeSummary>(
                new java.util.function.Supplier<ListAttributesRequest.Builder>() {
                    @Override
                    public ListAttributesRequest.Builder get() {
                        return ListAttributesRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListAttributesResponse, String>() {
                    @Override
                    public String apply(ListAttributesResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListAttributesRequest.Builder>,
                        ListAttributesRequest>() {
                    @Override
                    public ListAttributesRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListAttributesRequest.Builder>
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
                new java.util.function.Function<ListAttributesRequest, ListAttributesResponse>() {
                    @Override
                    public ListAttributesResponse apply(ListAttributesRequest request) {
                        return client.listAttributes(request);
                    }
                },
                new java.util.function.Function<
                        ListAttributesResponse,
                        java.util.List<com.oracle.bmc.datacatalog.model.AttributeSummary>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.datacatalog.model.AttributeSummary> apply(
                            ListAttributesResponse response) {
                        return response.getAttributeCollection().getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the
     * listCatalogPrivateEndpoints operation. This iterable will fetch more data from the server as
     * needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses
     *     received from the service.
     */
    public Iterable<ListCatalogPrivateEndpointsResponse>
            listCatalogPrivateEndpointsResponseIterator(
                    final ListCatalogPrivateEndpointsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListCatalogPrivateEndpointsRequest.Builder,
                ListCatalogPrivateEndpointsRequest,
                ListCatalogPrivateEndpointsResponse>(
                new java.util.function.Supplier<ListCatalogPrivateEndpointsRequest.Builder>() {
                    @Override
                    public ListCatalogPrivateEndpointsRequest.Builder get() {
                        return ListCatalogPrivateEndpointsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListCatalogPrivateEndpointsResponse, String>() {
                    @Override
                    public String apply(ListCatalogPrivateEndpointsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListCatalogPrivateEndpointsRequest.Builder>,
                        ListCatalogPrivateEndpointsRequest>() {
                    @Override
                    public ListCatalogPrivateEndpointsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListCatalogPrivateEndpointsRequest.Builder>
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
                        ListCatalogPrivateEndpointsRequest, ListCatalogPrivateEndpointsResponse>() {
                    @Override
                    public ListCatalogPrivateEndpointsResponse apply(
                            ListCatalogPrivateEndpointsRequest request) {
                        return client.listCatalogPrivateEndpoints(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link
     * com.oracle.bmc.datacatalog.model.CatalogPrivateEndpointSummary} objects contained in
     * responses from the listCatalogPrivateEndpoints operation. This iterable will fetch more data
     * from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link
     *     com.oracle.bmc.datacatalog.model.CatalogPrivateEndpointSummary} objects contained in
     *     responses received from the service.
     */
    public Iterable<com.oracle.bmc.datacatalog.model.CatalogPrivateEndpointSummary>
            listCatalogPrivateEndpointsRecordIterator(
                    final ListCatalogPrivateEndpointsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListCatalogPrivateEndpointsRequest.Builder,
                ListCatalogPrivateEndpointsRequest,
                ListCatalogPrivateEndpointsResponse,
                com.oracle.bmc.datacatalog.model.CatalogPrivateEndpointSummary>(
                new java.util.function.Supplier<ListCatalogPrivateEndpointsRequest.Builder>() {
                    @Override
                    public ListCatalogPrivateEndpointsRequest.Builder get() {
                        return ListCatalogPrivateEndpointsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListCatalogPrivateEndpointsResponse, String>() {
                    @Override
                    public String apply(ListCatalogPrivateEndpointsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListCatalogPrivateEndpointsRequest.Builder>,
                        ListCatalogPrivateEndpointsRequest>() {
                    @Override
                    public ListCatalogPrivateEndpointsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListCatalogPrivateEndpointsRequest.Builder>
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
                        ListCatalogPrivateEndpointsRequest, ListCatalogPrivateEndpointsResponse>() {
                    @Override
                    public ListCatalogPrivateEndpointsResponse apply(
                            ListCatalogPrivateEndpointsRequest request) {
                        return client.listCatalogPrivateEndpoints(request);
                    }
                },
                new java.util.function.Function<
                        ListCatalogPrivateEndpointsResponse,
                        java.util.List<
                                com.oracle.bmc.datacatalog.model.CatalogPrivateEndpointSummary>>() {
                    @Override
                    public java.util.List<
                                    com.oracle.bmc.datacatalog.model.CatalogPrivateEndpointSummary>
                            apply(ListCatalogPrivateEndpointsResponse response) {
                        return response.getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the listCatalogs
     * operation. This iterable will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses
     *     received from the service.
     */
    public Iterable<ListCatalogsResponse> listCatalogsResponseIterator(
            final ListCatalogsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListCatalogsRequest.Builder, ListCatalogsRequest, ListCatalogsResponse>(
                new java.util.function.Supplier<ListCatalogsRequest.Builder>() {
                    @Override
                    public ListCatalogsRequest.Builder get() {
                        return ListCatalogsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListCatalogsResponse, String>() {
                    @Override
                    public String apply(ListCatalogsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListCatalogsRequest.Builder>,
                        ListCatalogsRequest>() {
                    @Override
                    public ListCatalogsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListCatalogsRequest.Builder>
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
                new java.util.function.Function<ListCatalogsRequest, ListCatalogsResponse>() {
                    @Override
                    public ListCatalogsResponse apply(ListCatalogsRequest request) {
                        return client.listCatalogs(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link
     * com.oracle.bmc.datacatalog.model.CatalogSummary} objects contained in responses from the
     * listCatalogs operation. This iterable will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link
     *     com.oracle.bmc.datacatalog.model.CatalogSummary} objects contained in responses received
     *     from the service.
     */
    public Iterable<com.oracle.bmc.datacatalog.model.CatalogSummary> listCatalogsRecordIterator(
            final ListCatalogsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListCatalogsRequest.Builder,
                ListCatalogsRequest,
                ListCatalogsResponse,
                com.oracle.bmc.datacatalog.model.CatalogSummary>(
                new java.util.function.Supplier<ListCatalogsRequest.Builder>() {
                    @Override
                    public ListCatalogsRequest.Builder get() {
                        return ListCatalogsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListCatalogsResponse, String>() {
                    @Override
                    public String apply(ListCatalogsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListCatalogsRequest.Builder>,
                        ListCatalogsRequest>() {
                    @Override
                    public ListCatalogsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListCatalogsRequest.Builder>
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
                new java.util.function.Function<ListCatalogsRequest, ListCatalogsResponse>() {
                    @Override
                    public ListCatalogsResponse apply(ListCatalogsRequest request) {
                        return client.listCatalogs(request);
                    }
                },
                new java.util.function.Function<
                        ListCatalogsResponse,
                        java.util.List<com.oracle.bmc.datacatalog.model.CatalogSummary>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.datacatalog.model.CatalogSummary> apply(
                            ListCatalogsResponse response) {
                        return response.getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the
     * listConnections operation. This iterable will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses
     *     received from the service.
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
     * Creates a new iterable which will iterate over the {@link
     * com.oracle.bmc.datacatalog.model.ConnectionSummary} objects contained in responses from the
     * listConnections operation. This iterable will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link
     *     com.oracle.bmc.datacatalog.model.ConnectionSummary} objects contained in responses
     *     received from the service.
     */
    public Iterable<com.oracle.bmc.datacatalog.model.ConnectionSummary>
            listConnectionsRecordIterator(final ListConnectionsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListConnectionsRequest.Builder,
                ListConnectionsRequest,
                ListConnectionsResponse,
                com.oracle.bmc.datacatalog.model.ConnectionSummary>(
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
                        java.util.List<com.oracle.bmc.datacatalog.model.ConnectionSummary>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.datacatalog.model.ConnectionSummary> apply(
                            ListConnectionsResponse response) {
                        return response.getConnectionCollection().getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the
     * listCustomProperties operation. This iterable will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses
     *     received from the service.
     */
    public Iterable<ListCustomPropertiesResponse> listCustomPropertiesResponseIterator(
            final ListCustomPropertiesRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListCustomPropertiesRequest.Builder,
                ListCustomPropertiesRequest,
                ListCustomPropertiesResponse>(
                new java.util.function.Supplier<ListCustomPropertiesRequest.Builder>() {
                    @Override
                    public ListCustomPropertiesRequest.Builder get() {
                        return ListCustomPropertiesRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListCustomPropertiesResponse, String>() {
                    @Override
                    public String apply(ListCustomPropertiesResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListCustomPropertiesRequest.Builder>,
                        ListCustomPropertiesRequest>() {
                    @Override
                    public ListCustomPropertiesRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListCustomPropertiesRequest.Builder>
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
                        ListCustomPropertiesRequest, ListCustomPropertiesResponse>() {
                    @Override
                    public ListCustomPropertiesResponse apply(ListCustomPropertiesRequest request) {
                        return client.listCustomProperties(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link
     * com.oracle.bmc.datacatalog.model.CustomPropertySummary} objects contained in responses from
     * the listCustomProperties operation. This iterable will fetch more data from the server as
     * needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link
     *     com.oracle.bmc.datacatalog.model.CustomPropertySummary} objects contained in responses
     *     received from the service.
     */
    public Iterable<com.oracle.bmc.datacatalog.model.CustomPropertySummary>
            listCustomPropertiesRecordIterator(final ListCustomPropertiesRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListCustomPropertiesRequest.Builder,
                ListCustomPropertiesRequest,
                ListCustomPropertiesResponse,
                com.oracle.bmc.datacatalog.model.CustomPropertySummary>(
                new java.util.function.Supplier<ListCustomPropertiesRequest.Builder>() {
                    @Override
                    public ListCustomPropertiesRequest.Builder get() {
                        return ListCustomPropertiesRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListCustomPropertiesResponse, String>() {
                    @Override
                    public String apply(ListCustomPropertiesResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListCustomPropertiesRequest.Builder>,
                        ListCustomPropertiesRequest>() {
                    @Override
                    public ListCustomPropertiesRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListCustomPropertiesRequest.Builder>
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
                        ListCustomPropertiesRequest, ListCustomPropertiesResponse>() {
                    @Override
                    public ListCustomPropertiesResponse apply(ListCustomPropertiesRequest request) {
                        return client.listCustomProperties(request);
                    }
                },
                new java.util.function.Function<
                        ListCustomPropertiesResponse,
                        java.util.List<com.oracle.bmc.datacatalog.model.CustomPropertySummary>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.datacatalog.model.CustomPropertySummary>
                            apply(ListCustomPropertiesResponse response) {
                        return response.getCustomPropertyCollection().getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the
     * listDataAssetTags operation. This iterable will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses
     *     received from the service.
     */
    public Iterable<ListDataAssetTagsResponse> listDataAssetTagsResponseIterator(
            final ListDataAssetTagsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListDataAssetTagsRequest.Builder,
                ListDataAssetTagsRequest,
                ListDataAssetTagsResponse>(
                new java.util.function.Supplier<ListDataAssetTagsRequest.Builder>() {
                    @Override
                    public ListDataAssetTagsRequest.Builder get() {
                        return ListDataAssetTagsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListDataAssetTagsResponse, String>() {
                    @Override
                    public String apply(ListDataAssetTagsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListDataAssetTagsRequest.Builder>,
                        ListDataAssetTagsRequest>() {
                    @Override
                    public ListDataAssetTagsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListDataAssetTagsRequest.Builder>
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
                        ListDataAssetTagsRequest, ListDataAssetTagsResponse>() {
                    @Override
                    public ListDataAssetTagsResponse apply(ListDataAssetTagsRequest request) {
                        return client.listDataAssetTags(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link
     * com.oracle.bmc.datacatalog.model.DataAssetTagSummary} objects contained in responses from the
     * listDataAssetTags operation. This iterable will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link
     *     com.oracle.bmc.datacatalog.model.DataAssetTagSummary} objects contained in responses
     *     received from the service.
     */
    public Iterable<com.oracle.bmc.datacatalog.model.DataAssetTagSummary>
            listDataAssetTagsRecordIterator(final ListDataAssetTagsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListDataAssetTagsRequest.Builder,
                ListDataAssetTagsRequest,
                ListDataAssetTagsResponse,
                com.oracle.bmc.datacatalog.model.DataAssetTagSummary>(
                new java.util.function.Supplier<ListDataAssetTagsRequest.Builder>() {
                    @Override
                    public ListDataAssetTagsRequest.Builder get() {
                        return ListDataAssetTagsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListDataAssetTagsResponse, String>() {
                    @Override
                    public String apply(ListDataAssetTagsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListDataAssetTagsRequest.Builder>,
                        ListDataAssetTagsRequest>() {
                    @Override
                    public ListDataAssetTagsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListDataAssetTagsRequest.Builder>
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
                        ListDataAssetTagsRequest, ListDataAssetTagsResponse>() {
                    @Override
                    public ListDataAssetTagsResponse apply(ListDataAssetTagsRequest request) {
                        return client.listDataAssetTags(request);
                    }
                },
                new java.util.function.Function<
                        ListDataAssetTagsResponse,
                        java.util.List<com.oracle.bmc.datacatalog.model.DataAssetTagSummary>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.datacatalog.model.DataAssetTagSummary>
                            apply(ListDataAssetTagsResponse response) {
                        return response.getDataAssetTagCollection().getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the listDataAssets
     * operation. This iterable will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses
     *     received from the service.
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
     * Creates a new iterable which will iterate over the {@link
     * com.oracle.bmc.datacatalog.model.DataAssetSummary} objects contained in responses from the
     * listDataAssets operation. This iterable will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link
     *     com.oracle.bmc.datacatalog.model.DataAssetSummary} objects contained in responses
     *     received from the service.
     */
    public Iterable<com.oracle.bmc.datacatalog.model.DataAssetSummary> listDataAssetsRecordIterator(
            final ListDataAssetsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListDataAssetsRequest.Builder,
                ListDataAssetsRequest,
                ListDataAssetsResponse,
                com.oracle.bmc.datacatalog.model.DataAssetSummary>(
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
                        java.util.List<com.oracle.bmc.datacatalog.model.DataAssetSummary>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.datacatalog.model.DataAssetSummary> apply(
                            ListDataAssetsResponse response) {
                        return response.getDataAssetCollection().getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the listEntities
     * operation. This iterable will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses
     *     received from the service.
     */
    public Iterable<ListEntitiesResponse> listEntitiesResponseIterator(
            final ListEntitiesRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListEntitiesRequest.Builder, ListEntitiesRequest, ListEntitiesResponse>(
                new java.util.function.Supplier<ListEntitiesRequest.Builder>() {
                    @Override
                    public ListEntitiesRequest.Builder get() {
                        return ListEntitiesRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListEntitiesResponse, String>() {
                    @Override
                    public String apply(ListEntitiesResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListEntitiesRequest.Builder>,
                        ListEntitiesRequest>() {
                    @Override
                    public ListEntitiesRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListEntitiesRequest.Builder>
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
                new java.util.function.Function<ListEntitiesRequest, ListEntitiesResponse>() {
                    @Override
                    public ListEntitiesResponse apply(ListEntitiesRequest request) {
                        return client.listEntities(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link
     * com.oracle.bmc.datacatalog.model.EntitySummary} objects contained in responses from the
     * listEntities operation. This iterable will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link
     *     com.oracle.bmc.datacatalog.model.EntitySummary} objects contained in responses received
     *     from the service.
     */
    public Iterable<com.oracle.bmc.datacatalog.model.EntitySummary> listEntitiesRecordIterator(
            final ListEntitiesRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListEntitiesRequest.Builder,
                ListEntitiesRequest,
                ListEntitiesResponse,
                com.oracle.bmc.datacatalog.model.EntitySummary>(
                new java.util.function.Supplier<ListEntitiesRequest.Builder>() {
                    @Override
                    public ListEntitiesRequest.Builder get() {
                        return ListEntitiesRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListEntitiesResponse, String>() {
                    @Override
                    public String apply(ListEntitiesResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListEntitiesRequest.Builder>,
                        ListEntitiesRequest>() {
                    @Override
                    public ListEntitiesRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListEntitiesRequest.Builder>
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
                new java.util.function.Function<ListEntitiesRequest, ListEntitiesResponse>() {
                    @Override
                    public ListEntitiesResponse apply(ListEntitiesRequest request) {
                        return client.listEntities(request);
                    }
                },
                new java.util.function.Function<
                        ListEntitiesResponse,
                        java.util.List<com.oracle.bmc.datacatalog.model.EntitySummary>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.datacatalog.model.EntitySummary> apply(
                            ListEntitiesResponse response) {
                        return response.getEntityCollection().getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the listEntityTags
     * operation. This iterable will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses
     *     received from the service.
     */
    public Iterable<ListEntityTagsResponse> listEntityTagsResponseIterator(
            final ListEntityTagsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListEntityTagsRequest.Builder, ListEntityTagsRequest, ListEntityTagsResponse>(
                new java.util.function.Supplier<ListEntityTagsRequest.Builder>() {
                    @Override
                    public ListEntityTagsRequest.Builder get() {
                        return ListEntityTagsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListEntityTagsResponse, String>() {
                    @Override
                    public String apply(ListEntityTagsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListEntityTagsRequest.Builder>,
                        ListEntityTagsRequest>() {
                    @Override
                    public ListEntityTagsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListEntityTagsRequest.Builder>
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
                new java.util.function.Function<ListEntityTagsRequest, ListEntityTagsResponse>() {
                    @Override
                    public ListEntityTagsResponse apply(ListEntityTagsRequest request) {
                        return client.listEntityTags(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link
     * com.oracle.bmc.datacatalog.model.EntityTagSummary} objects contained in responses from the
     * listEntityTags operation. This iterable will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link
     *     com.oracle.bmc.datacatalog.model.EntityTagSummary} objects contained in responses
     *     received from the service.
     */
    public Iterable<com.oracle.bmc.datacatalog.model.EntityTagSummary> listEntityTagsRecordIterator(
            final ListEntityTagsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListEntityTagsRequest.Builder,
                ListEntityTagsRequest,
                ListEntityTagsResponse,
                com.oracle.bmc.datacatalog.model.EntityTagSummary>(
                new java.util.function.Supplier<ListEntityTagsRequest.Builder>() {
                    @Override
                    public ListEntityTagsRequest.Builder get() {
                        return ListEntityTagsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListEntityTagsResponse, String>() {
                    @Override
                    public String apply(ListEntityTagsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListEntityTagsRequest.Builder>,
                        ListEntityTagsRequest>() {
                    @Override
                    public ListEntityTagsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListEntityTagsRequest.Builder>
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
                new java.util.function.Function<ListEntityTagsRequest, ListEntityTagsResponse>() {
                    @Override
                    public ListEntityTagsResponse apply(ListEntityTagsRequest request) {
                        return client.listEntityTags(request);
                    }
                },
                new java.util.function.Function<
                        ListEntityTagsResponse,
                        java.util.List<com.oracle.bmc.datacatalog.model.EntityTagSummary>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.datacatalog.model.EntityTagSummary> apply(
                            ListEntityTagsResponse response) {
                        return response.getEntityTagCollection().getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the listFolderTags
     * operation. This iterable will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses
     *     received from the service.
     */
    public Iterable<ListFolderTagsResponse> listFolderTagsResponseIterator(
            final ListFolderTagsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListFolderTagsRequest.Builder, ListFolderTagsRequest, ListFolderTagsResponse>(
                new java.util.function.Supplier<ListFolderTagsRequest.Builder>() {
                    @Override
                    public ListFolderTagsRequest.Builder get() {
                        return ListFolderTagsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListFolderTagsResponse, String>() {
                    @Override
                    public String apply(ListFolderTagsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListFolderTagsRequest.Builder>,
                        ListFolderTagsRequest>() {
                    @Override
                    public ListFolderTagsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListFolderTagsRequest.Builder>
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
                new java.util.function.Function<ListFolderTagsRequest, ListFolderTagsResponse>() {
                    @Override
                    public ListFolderTagsResponse apply(ListFolderTagsRequest request) {
                        return client.listFolderTags(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link
     * com.oracle.bmc.datacatalog.model.FolderTagSummary} objects contained in responses from the
     * listFolderTags operation. This iterable will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link
     *     com.oracle.bmc.datacatalog.model.FolderTagSummary} objects contained in responses
     *     received from the service.
     */
    public Iterable<com.oracle.bmc.datacatalog.model.FolderTagSummary> listFolderTagsRecordIterator(
            final ListFolderTagsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListFolderTagsRequest.Builder,
                ListFolderTagsRequest,
                ListFolderTagsResponse,
                com.oracle.bmc.datacatalog.model.FolderTagSummary>(
                new java.util.function.Supplier<ListFolderTagsRequest.Builder>() {
                    @Override
                    public ListFolderTagsRequest.Builder get() {
                        return ListFolderTagsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListFolderTagsResponse, String>() {
                    @Override
                    public String apply(ListFolderTagsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListFolderTagsRequest.Builder>,
                        ListFolderTagsRequest>() {
                    @Override
                    public ListFolderTagsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListFolderTagsRequest.Builder>
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
                new java.util.function.Function<ListFolderTagsRequest, ListFolderTagsResponse>() {
                    @Override
                    public ListFolderTagsResponse apply(ListFolderTagsRequest request) {
                        return client.listFolderTags(request);
                    }
                },
                new java.util.function.Function<
                        ListFolderTagsResponse,
                        java.util.List<com.oracle.bmc.datacatalog.model.FolderTagSummary>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.datacatalog.model.FolderTagSummary> apply(
                            ListFolderTagsResponse response) {
                        return response.getFolderTagCollection().getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the listFolders
     * operation. This iterable will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses
     *     received from the service.
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
     * Creates a new iterable which will iterate over the {@link
     * com.oracle.bmc.datacatalog.model.FolderSummary} objects contained in responses from the
     * listFolders operation. This iterable will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link
     *     com.oracle.bmc.datacatalog.model.FolderSummary} objects contained in responses received
     *     from the service.
     */
    public Iterable<com.oracle.bmc.datacatalog.model.FolderSummary> listFoldersRecordIterator(
            final ListFoldersRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListFoldersRequest.Builder,
                ListFoldersRequest,
                ListFoldersResponse,
                com.oracle.bmc.datacatalog.model.FolderSummary>(
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
                        java.util.List<com.oracle.bmc.datacatalog.model.FolderSummary>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.datacatalog.model.FolderSummary> apply(
                            ListFoldersResponse response) {
                        return response.getFolderCollection().getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the listGlossaries
     * operation. This iterable will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses
     *     received from the service.
     */
    public Iterable<ListGlossariesResponse> listGlossariesResponseIterator(
            final ListGlossariesRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListGlossariesRequest.Builder, ListGlossariesRequest, ListGlossariesResponse>(
                new java.util.function.Supplier<ListGlossariesRequest.Builder>() {
                    @Override
                    public ListGlossariesRequest.Builder get() {
                        return ListGlossariesRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListGlossariesResponse, String>() {
                    @Override
                    public String apply(ListGlossariesResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListGlossariesRequest.Builder>,
                        ListGlossariesRequest>() {
                    @Override
                    public ListGlossariesRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListGlossariesRequest.Builder>
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
                new java.util.function.Function<ListGlossariesRequest, ListGlossariesResponse>() {
                    @Override
                    public ListGlossariesResponse apply(ListGlossariesRequest request) {
                        return client.listGlossaries(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link
     * com.oracle.bmc.datacatalog.model.GlossarySummary} objects contained in responses from the
     * listGlossaries operation. This iterable will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link
     *     com.oracle.bmc.datacatalog.model.GlossarySummary} objects contained in responses received
     *     from the service.
     */
    public Iterable<com.oracle.bmc.datacatalog.model.GlossarySummary> listGlossariesRecordIterator(
            final ListGlossariesRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListGlossariesRequest.Builder,
                ListGlossariesRequest,
                ListGlossariesResponse,
                com.oracle.bmc.datacatalog.model.GlossarySummary>(
                new java.util.function.Supplier<ListGlossariesRequest.Builder>() {
                    @Override
                    public ListGlossariesRequest.Builder get() {
                        return ListGlossariesRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListGlossariesResponse, String>() {
                    @Override
                    public String apply(ListGlossariesResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListGlossariesRequest.Builder>,
                        ListGlossariesRequest>() {
                    @Override
                    public ListGlossariesRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListGlossariesRequest.Builder>
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
                new java.util.function.Function<ListGlossariesRequest, ListGlossariesResponse>() {
                    @Override
                    public ListGlossariesResponse apply(ListGlossariesRequest request) {
                        return client.listGlossaries(request);
                    }
                },
                new java.util.function.Function<
                        ListGlossariesResponse,
                        java.util.List<com.oracle.bmc.datacatalog.model.GlossarySummary>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.datacatalog.model.GlossarySummary> apply(
                            ListGlossariesResponse response) {
                        return response.getGlossaryCollection().getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the
     * listJobDefinitions operation. This iterable will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses
     *     received from the service.
     */
    public Iterable<ListJobDefinitionsResponse> listJobDefinitionsResponseIterator(
            final ListJobDefinitionsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListJobDefinitionsRequest.Builder,
                ListJobDefinitionsRequest,
                ListJobDefinitionsResponse>(
                new java.util.function.Supplier<ListJobDefinitionsRequest.Builder>() {
                    @Override
                    public ListJobDefinitionsRequest.Builder get() {
                        return ListJobDefinitionsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListJobDefinitionsResponse, String>() {
                    @Override
                    public String apply(ListJobDefinitionsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListJobDefinitionsRequest.Builder>,
                        ListJobDefinitionsRequest>() {
                    @Override
                    public ListJobDefinitionsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListJobDefinitionsRequest.Builder>
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
                        ListJobDefinitionsRequest, ListJobDefinitionsResponse>() {
                    @Override
                    public ListJobDefinitionsResponse apply(ListJobDefinitionsRequest request) {
                        return client.listJobDefinitions(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link
     * com.oracle.bmc.datacatalog.model.JobDefinitionSummary} objects contained in responses from
     * the listJobDefinitions operation. This iterable will fetch more data from the server as
     * needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link
     *     com.oracle.bmc.datacatalog.model.JobDefinitionSummary} objects contained in responses
     *     received from the service.
     */
    public Iterable<com.oracle.bmc.datacatalog.model.JobDefinitionSummary>
            listJobDefinitionsRecordIterator(final ListJobDefinitionsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListJobDefinitionsRequest.Builder,
                ListJobDefinitionsRequest,
                ListJobDefinitionsResponse,
                com.oracle.bmc.datacatalog.model.JobDefinitionSummary>(
                new java.util.function.Supplier<ListJobDefinitionsRequest.Builder>() {
                    @Override
                    public ListJobDefinitionsRequest.Builder get() {
                        return ListJobDefinitionsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListJobDefinitionsResponse, String>() {
                    @Override
                    public String apply(ListJobDefinitionsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListJobDefinitionsRequest.Builder>,
                        ListJobDefinitionsRequest>() {
                    @Override
                    public ListJobDefinitionsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListJobDefinitionsRequest.Builder>
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
                        ListJobDefinitionsRequest, ListJobDefinitionsResponse>() {
                    @Override
                    public ListJobDefinitionsResponse apply(ListJobDefinitionsRequest request) {
                        return client.listJobDefinitions(request);
                    }
                },
                new java.util.function.Function<
                        ListJobDefinitionsResponse,
                        java.util.List<com.oracle.bmc.datacatalog.model.JobDefinitionSummary>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.datacatalog.model.JobDefinitionSummary>
                            apply(ListJobDefinitionsResponse response) {
                        return response.getJobDefinitionCollection().getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the
     * listJobExecutions operation. This iterable will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses
     *     received from the service.
     */
    public Iterable<ListJobExecutionsResponse> listJobExecutionsResponseIterator(
            final ListJobExecutionsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListJobExecutionsRequest.Builder,
                ListJobExecutionsRequest,
                ListJobExecutionsResponse>(
                new java.util.function.Supplier<ListJobExecutionsRequest.Builder>() {
                    @Override
                    public ListJobExecutionsRequest.Builder get() {
                        return ListJobExecutionsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListJobExecutionsResponse, String>() {
                    @Override
                    public String apply(ListJobExecutionsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListJobExecutionsRequest.Builder>,
                        ListJobExecutionsRequest>() {
                    @Override
                    public ListJobExecutionsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListJobExecutionsRequest.Builder>
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
                        ListJobExecutionsRequest, ListJobExecutionsResponse>() {
                    @Override
                    public ListJobExecutionsResponse apply(ListJobExecutionsRequest request) {
                        return client.listJobExecutions(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link
     * com.oracle.bmc.datacatalog.model.JobExecutionSummary} objects contained in responses from the
     * listJobExecutions operation. This iterable will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link
     *     com.oracle.bmc.datacatalog.model.JobExecutionSummary} objects contained in responses
     *     received from the service.
     */
    public Iterable<com.oracle.bmc.datacatalog.model.JobExecutionSummary>
            listJobExecutionsRecordIterator(final ListJobExecutionsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListJobExecutionsRequest.Builder,
                ListJobExecutionsRequest,
                ListJobExecutionsResponse,
                com.oracle.bmc.datacatalog.model.JobExecutionSummary>(
                new java.util.function.Supplier<ListJobExecutionsRequest.Builder>() {
                    @Override
                    public ListJobExecutionsRequest.Builder get() {
                        return ListJobExecutionsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListJobExecutionsResponse, String>() {
                    @Override
                    public String apply(ListJobExecutionsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListJobExecutionsRequest.Builder>,
                        ListJobExecutionsRequest>() {
                    @Override
                    public ListJobExecutionsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListJobExecutionsRequest.Builder>
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
                        ListJobExecutionsRequest, ListJobExecutionsResponse>() {
                    @Override
                    public ListJobExecutionsResponse apply(ListJobExecutionsRequest request) {
                        return client.listJobExecutions(request);
                    }
                },
                new java.util.function.Function<
                        ListJobExecutionsResponse,
                        java.util.List<com.oracle.bmc.datacatalog.model.JobExecutionSummary>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.datacatalog.model.JobExecutionSummary>
                            apply(ListJobExecutionsResponse response) {
                        return response.getJobExecutionCollection().getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the listJobLogs
     * operation. This iterable will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses
     *     received from the service.
     */
    public Iterable<ListJobLogsResponse> listJobLogsResponseIterator(
            final ListJobLogsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListJobLogsRequest.Builder, ListJobLogsRequest, ListJobLogsResponse>(
                new java.util.function.Supplier<ListJobLogsRequest.Builder>() {
                    @Override
                    public ListJobLogsRequest.Builder get() {
                        return ListJobLogsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListJobLogsResponse, String>() {
                    @Override
                    public String apply(ListJobLogsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListJobLogsRequest.Builder>,
                        ListJobLogsRequest>() {
                    @Override
                    public ListJobLogsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListJobLogsRequest.Builder>
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
                new java.util.function.Function<ListJobLogsRequest, ListJobLogsResponse>() {
                    @Override
                    public ListJobLogsResponse apply(ListJobLogsRequest request) {
                        return client.listJobLogs(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link
     * com.oracle.bmc.datacatalog.model.JobLogSummary} objects contained in responses from the
     * listJobLogs operation. This iterable will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link
     *     com.oracle.bmc.datacatalog.model.JobLogSummary} objects contained in responses received
     *     from the service.
     */
    public Iterable<com.oracle.bmc.datacatalog.model.JobLogSummary> listJobLogsRecordIterator(
            final ListJobLogsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListJobLogsRequest.Builder,
                ListJobLogsRequest,
                ListJobLogsResponse,
                com.oracle.bmc.datacatalog.model.JobLogSummary>(
                new java.util.function.Supplier<ListJobLogsRequest.Builder>() {
                    @Override
                    public ListJobLogsRequest.Builder get() {
                        return ListJobLogsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListJobLogsResponse, String>() {
                    @Override
                    public String apply(ListJobLogsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListJobLogsRequest.Builder>,
                        ListJobLogsRequest>() {
                    @Override
                    public ListJobLogsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListJobLogsRequest.Builder>
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
                new java.util.function.Function<ListJobLogsRequest, ListJobLogsResponse>() {
                    @Override
                    public ListJobLogsResponse apply(ListJobLogsRequest request) {
                        return client.listJobLogs(request);
                    }
                },
                new java.util.function.Function<
                        ListJobLogsResponse,
                        java.util.List<com.oracle.bmc.datacatalog.model.JobLogSummary>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.datacatalog.model.JobLogSummary> apply(
                            ListJobLogsResponse response) {
                        return response.getJobLogCollection().getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the listJobMetrics
     * operation. This iterable will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses
     *     received from the service.
     */
    public Iterable<ListJobMetricsResponse> listJobMetricsResponseIterator(
            final ListJobMetricsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListJobMetricsRequest.Builder, ListJobMetricsRequest, ListJobMetricsResponse>(
                new java.util.function.Supplier<ListJobMetricsRequest.Builder>() {
                    @Override
                    public ListJobMetricsRequest.Builder get() {
                        return ListJobMetricsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListJobMetricsResponse, String>() {
                    @Override
                    public String apply(ListJobMetricsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListJobMetricsRequest.Builder>,
                        ListJobMetricsRequest>() {
                    @Override
                    public ListJobMetricsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListJobMetricsRequest.Builder>
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
                new java.util.function.Function<ListJobMetricsRequest, ListJobMetricsResponse>() {
                    @Override
                    public ListJobMetricsResponse apply(ListJobMetricsRequest request) {
                        return client.listJobMetrics(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link
     * com.oracle.bmc.datacatalog.model.JobMetricSummary} objects contained in responses from the
     * listJobMetrics operation. This iterable will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link
     *     com.oracle.bmc.datacatalog.model.JobMetricSummary} objects contained in responses
     *     received from the service.
     */
    public Iterable<com.oracle.bmc.datacatalog.model.JobMetricSummary> listJobMetricsRecordIterator(
            final ListJobMetricsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListJobMetricsRequest.Builder,
                ListJobMetricsRequest,
                ListJobMetricsResponse,
                com.oracle.bmc.datacatalog.model.JobMetricSummary>(
                new java.util.function.Supplier<ListJobMetricsRequest.Builder>() {
                    @Override
                    public ListJobMetricsRequest.Builder get() {
                        return ListJobMetricsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListJobMetricsResponse, String>() {
                    @Override
                    public String apply(ListJobMetricsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListJobMetricsRequest.Builder>,
                        ListJobMetricsRequest>() {
                    @Override
                    public ListJobMetricsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListJobMetricsRequest.Builder>
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
                new java.util.function.Function<ListJobMetricsRequest, ListJobMetricsResponse>() {
                    @Override
                    public ListJobMetricsResponse apply(ListJobMetricsRequest request) {
                        return client.listJobMetrics(request);
                    }
                },
                new java.util.function.Function<
                        ListJobMetricsResponse,
                        java.util.List<com.oracle.bmc.datacatalog.model.JobMetricSummary>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.datacatalog.model.JobMetricSummary> apply(
                            ListJobMetricsResponse response) {
                        return response.getJobMetricCollection().getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the listJobs
     * operation. This iterable will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses
     *     received from the service.
     */
    public Iterable<ListJobsResponse> listJobsResponseIterator(final ListJobsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListJobsRequest.Builder, ListJobsRequest, ListJobsResponse>(
                new java.util.function.Supplier<ListJobsRequest.Builder>() {
                    @Override
                    public ListJobsRequest.Builder get() {
                        return ListJobsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListJobsResponse, String>() {
                    @Override
                    public String apply(ListJobsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListJobsRequest.Builder>,
                        ListJobsRequest>() {
                    @Override
                    public ListJobsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListJobsRequest.Builder>
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
                new java.util.function.Function<ListJobsRequest, ListJobsResponse>() {
                    @Override
                    public ListJobsResponse apply(ListJobsRequest request) {
                        return client.listJobs(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link
     * com.oracle.bmc.datacatalog.model.JobSummary} objects contained in responses from the listJobs
     * operation. This iterable will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link
     *     com.oracle.bmc.datacatalog.model.JobSummary} objects contained in responses received from
     *     the service.
     */
    public Iterable<com.oracle.bmc.datacatalog.model.JobSummary> listJobsRecordIterator(
            final ListJobsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListJobsRequest.Builder,
                ListJobsRequest,
                ListJobsResponse,
                com.oracle.bmc.datacatalog.model.JobSummary>(
                new java.util.function.Supplier<ListJobsRequest.Builder>() {
                    @Override
                    public ListJobsRequest.Builder get() {
                        return ListJobsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListJobsResponse, String>() {
                    @Override
                    public String apply(ListJobsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListJobsRequest.Builder>,
                        ListJobsRequest>() {
                    @Override
                    public ListJobsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListJobsRequest.Builder>
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
                new java.util.function.Function<ListJobsRequest, ListJobsResponse>() {
                    @Override
                    public ListJobsResponse apply(ListJobsRequest request) {
                        return client.listJobs(request);
                    }
                },
                new java.util.function.Function<
                        ListJobsResponse,
                        java.util.List<com.oracle.bmc.datacatalog.model.JobSummary>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.datacatalog.model.JobSummary> apply(
                            ListJobsResponse response) {
                        return response.getJobCollection().getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the listMetastores
     * operation. This iterable will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses
     *     received from the service.
     */
    public Iterable<ListMetastoresResponse> listMetastoresResponseIterator(
            final ListMetastoresRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListMetastoresRequest.Builder, ListMetastoresRequest, ListMetastoresResponse>(
                new java.util.function.Supplier<ListMetastoresRequest.Builder>() {
                    @Override
                    public ListMetastoresRequest.Builder get() {
                        return ListMetastoresRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListMetastoresResponse, String>() {
                    @Override
                    public String apply(ListMetastoresResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListMetastoresRequest.Builder>,
                        ListMetastoresRequest>() {
                    @Override
                    public ListMetastoresRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListMetastoresRequest.Builder>
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
                new java.util.function.Function<ListMetastoresRequest, ListMetastoresResponse>() {
                    @Override
                    public ListMetastoresResponse apply(ListMetastoresRequest request) {
                        return client.listMetastores(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link
     * com.oracle.bmc.datacatalog.model.MetastoreSummary} objects contained in responses from the
     * listMetastores operation. This iterable will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link
     *     com.oracle.bmc.datacatalog.model.MetastoreSummary} objects contained in responses
     *     received from the service.
     */
    public Iterable<com.oracle.bmc.datacatalog.model.MetastoreSummary> listMetastoresRecordIterator(
            final ListMetastoresRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListMetastoresRequest.Builder,
                ListMetastoresRequest,
                ListMetastoresResponse,
                com.oracle.bmc.datacatalog.model.MetastoreSummary>(
                new java.util.function.Supplier<ListMetastoresRequest.Builder>() {
                    @Override
                    public ListMetastoresRequest.Builder get() {
                        return ListMetastoresRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListMetastoresResponse, String>() {
                    @Override
                    public String apply(ListMetastoresResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListMetastoresRequest.Builder>,
                        ListMetastoresRequest>() {
                    @Override
                    public ListMetastoresRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListMetastoresRequest.Builder>
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
                new java.util.function.Function<ListMetastoresRequest, ListMetastoresResponse>() {
                    @Override
                    public ListMetastoresResponse apply(ListMetastoresRequest request) {
                        return client.listMetastores(request);
                    }
                },
                new java.util.function.Function<
                        ListMetastoresResponse,
                        java.util.List<com.oracle.bmc.datacatalog.model.MetastoreSummary>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.datacatalog.model.MetastoreSummary> apply(
                            ListMetastoresResponse response) {
                        return response.getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the listNamespaces
     * operation. This iterable will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses
     *     received from the service.
     */
    public Iterable<ListNamespacesResponse> listNamespacesResponseIterator(
            final ListNamespacesRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListNamespacesRequest.Builder, ListNamespacesRequest, ListNamespacesResponse>(
                new java.util.function.Supplier<ListNamespacesRequest.Builder>() {
                    @Override
                    public ListNamespacesRequest.Builder get() {
                        return ListNamespacesRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListNamespacesResponse, String>() {
                    @Override
                    public String apply(ListNamespacesResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListNamespacesRequest.Builder>,
                        ListNamespacesRequest>() {
                    @Override
                    public ListNamespacesRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListNamespacesRequest.Builder>
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
                new java.util.function.Function<ListNamespacesRequest, ListNamespacesResponse>() {
                    @Override
                    public ListNamespacesResponse apply(ListNamespacesRequest request) {
                        return client.listNamespaces(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link
     * com.oracle.bmc.datacatalog.model.NamespaceSummary} objects contained in responses from the
     * listNamespaces operation. This iterable will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link
     *     com.oracle.bmc.datacatalog.model.NamespaceSummary} objects contained in responses
     *     received from the service.
     */
    public Iterable<com.oracle.bmc.datacatalog.model.NamespaceSummary> listNamespacesRecordIterator(
            final ListNamespacesRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListNamespacesRequest.Builder,
                ListNamespacesRequest,
                ListNamespacesResponse,
                com.oracle.bmc.datacatalog.model.NamespaceSummary>(
                new java.util.function.Supplier<ListNamespacesRequest.Builder>() {
                    @Override
                    public ListNamespacesRequest.Builder get() {
                        return ListNamespacesRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListNamespacesResponse, String>() {
                    @Override
                    public String apply(ListNamespacesResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListNamespacesRequest.Builder>,
                        ListNamespacesRequest>() {
                    @Override
                    public ListNamespacesRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListNamespacesRequest.Builder>
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
                new java.util.function.Function<ListNamespacesRequest, ListNamespacesResponse>() {
                    @Override
                    public ListNamespacesResponse apply(ListNamespacesRequest request) {
                        return client.listNamespaces(request);
                    }
                },
                new java.util.function.Function<
                        ListNamespacesResponse,
                        java.util.List<com.oracle.bmc.datacatalog.model.NamespaceSummary>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.datacatalog.model.NamespaceSummary> apply(
                            ListNamespacesResponse response) {
                        return response.getNamespaceCollection().getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the listPatterns
     * operation. This iterable will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses
     *     received from the service.
     */
    public Iterable<ListPatternsResponse> listPatternsResponseIterator(
            final ListPatternsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListPatternsRequest.Builder, ListPatternsRequest, ListPatternsResponse>(
                new java.util.function.Supplier<ListPatternsRequest.Builder>() {
                    @Override
                    public ListPatternsRequest.Builder get() {
                        return ListPatternsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListPatternsResponse, String>() {
                    @Override
                    public String apply(ListPatternsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListPatternsRequest.Builder>,
                        ListPatternsRequest>() {
                    @Override
                    public ListPatternsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListPatternsRequest.Builder>
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
                new java.util.function.Function<ListPatternsRequest, ListPatternsResponse>() {
                    @Override
                    public ListPatternsResponse apply(ListPatternsRequest request) {
                        return client.listPatterns(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link
     * com.oracle.bmc.datacatalog.model.PatternSummary} objects contained in responses from the
     * listPatterns operation. This iterable will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link
     *     com.oracle.bmc.datacatalog.model.PatternSummary} objects contained in responses received
     *     from the service.
     */
    public Iterable<com.oracle.bmc.datacatalog.model.PatternSummary> listPatternsRecordIterator(
            final ListPatternsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListPatternsRequest.Builder,
                ListPatternsRequest,
                ListPatternsResponse,
                com.oracle.bmc.datacatalog.model.PatternSummary>(
                new java.util.function.Supplier<ListPatternsRequest.Builder>() {
                    @Override
                    public ListPatternsRequest.Builder get() {
                        return ListPatternsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListPatternsResponse, String>() {
                    @Override
                    public String apply(ListPatternsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListPatternsRequest.Builder>,
                        ListPatternsRequest>() {
                    @Override
                    public ListPatternsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListPatternsRequest.Builder>
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
                new java.util.function.Function<ListPatternsRequest, ListPatternsResponse>() {
                    @Override
                    public ListPatternsResponse apply(ListPatternsRequest request) {
                        return client.listPatterns(request);
                    }
                },
                new java.util.function.Function<
                        ListPatternsResponse,
                        java.util.List<com.oracle.bmc.datacatalog.model.PatternSummary>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.datacatalog.model.PatternSummary> apply(
                            ListPatternsResponse response) {
                        return response.getPatternCollection().getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the listRules
     * operation. This iterable will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses
     *     received from the service.
     */
    public Iterable<ListRulesResponse> listRulesResponseIterator(final ListRulesRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListRulesRequest.Builder, ListRulesRequest, ListRulesResponse>(
                new java.util.function.Supplier<ListRulesRequest.Builder>() {
                    @Override
                    public ListRulesRequest.Builder get() {
                        return ListRulesRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListRulesResponse, String>() {
                    @Override
                    public String apply(ListRulesResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListRulesRequest.Builder>,
                        ListRulesRequest>() {
                    @Override
                    public ListRulesRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListRulesRequest.Builder>
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
                new java.util.function.Function<ListRulesRequest, ListRulesResponse>() {
                    @Override
                    public ListRulesResponse apply(ListRulesRequest request) {
                        return client.listRules(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link
     * com.oracle.bmc.datacatalog.model.RuleSummary} objects contained in responses from the
     * listRules operation. This iterable will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link
     *     com.oracle.bmc.datacatalog.model.RuleSummary} objects contained in responses received
     *     from the service.
     */
    public Iterable<com.oracle.bmc.datacatalog.model.RuleSummary> listRulesRecordIterator(
            final ListRulesRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListRulesRequest.Builder,
                ListRulesRequest,
                ListRulesResponse,
                com.oracle.bmc.datacatalog.model.RuleSummary>(
                new java.util.function.Supplier<ListRulesRequest.Builder>() {
                    @Override
                    public ListRulesRequest.Builder get() {
                        return ListRulesRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListRulesResponse, String>() {
                    @Override
                    public String apply(ListRulesResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListRulesRequest.Builder>,
                        ListRulesRequest>() {
                    @Override
                    public ListRulesRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListRulesRequest.Builder>
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
                new java.util.function.Function<ListRulesRequest, ListRulesResponse>() {
                    @Override
                    public ListRulesResponse apply(ListRulesRequest request) {
                        return client.listRules(request);
                    }
                },
                new java.util.function.Function<
                        ListRulesResponse,
                        java.util.List<com.oracle.bmc.datacatalog.model.RuleSummary>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.datacatalog.model.RuleSummary> apply(
                            ListRulesResponse response) {
                        return response.getRuleCollection().getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the listTags
     * operation. This iterable will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses
     *     received from the service.
     */
    public Iterable<ListTagsResponse> listTagsResponseIterator(final ListTagsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListTagsRequest.Builder, ListTagsRequest, ListTagsResponse>(
                new java.util.function.Supplier<ListTagsRequest.Builder>() {
                    @Override
                    public ListTagsRequest.Builder get() {
                        return ListTagsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListTagsResponse, String>() {
                    @Override
                    public String apply(ListTagsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListTagsRequest.Builder>,
                        ListTagsRequest>() {
                    @Override
                    public ListTagsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListTagsRequest.Builder>
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
                new java.util.function.Function<ListTagsRequest, ListTagsResponse>() {
                    @Override
                    public ListTagsResponse apply(ListTagsRequest request) {
                        return client.listTags(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link
     * com.oracle.bmc.datacatalog.model.TermSummary} objects contained in responses from the
     * listTags operation. This iterable will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link
     *     com.oracle.bmc.datacatalog.model.TermSummary} objects contained in responses received
     *     from the service.
     */
    public Iterable<com.oracle.bmc.datacatalog.model.TermSummary> listTagsRecordIterator(
            final ListTagsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListTagsRequest.Builder,
                ListTagsRequest,
                ListTagsResponse,
                com.oracle.bmc.datacatalog.model.TermSummary>(
                new java.util.function.Supplier<ListTagsRequest.Builder>() {
                    @Override
                    public ListTagsRequest.Builder get() {
                        return ListTagsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListTagsResponse, String>() {
                    @Override
                    public String apply(ListTagsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListTagsRequest.Builder>,
                        ListTagsRequest>() {
                    @Override
                    public ListTagsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListTagsRequest.Builder>
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
                new java.util.function.Function<ListTagsRequest, ListTagsResponse>() {
                    @Override
                    public ListTagsResponse apply(ListTagsRequest request) {
                        return client.listTags(request);
                    }
                },
                new java.util.function.Function<
                        ListTagsResponse,
                        java.util.List<com.oracle.bmc.datacatalog.model.TermSummary>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.datacatalog.model.TermSummary> apply(
                            ListTagsResponse response) {
                        return response.getTermCollection().getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the
     * listTermRelationships operation. This iterable will fetch more data from the server as
     * needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses
     *     received from the service.
     */
    public Iterable<ListTermRelationshipsResponse> listTermRelationshipsResponseIterator(
            final ListTermRelationshipsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListTermRelationshipsRequest.Builder,
                ListTermRelationshipsRequest,
                ListTermRelationshipsResponse>(
                new java.util.function.Supplier<ListTermRelationshipsRequest.Builder>() {
                    @Override
                    public ListTermRelationshipsRequest.Builder get() {
                        return ListTermRelationshipsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListTermRelationshipsResponse, String>() {
                    @Override
                    public String apply(ListTermRelationshipsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListTermRelationshipsRequest.Builder>,
                        ListTermRelationshipsRequest>() {
                    @Override
                    public ListTermRelationshipsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListTermRelationshipsRequest.Builder>
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
                        ListTermRelationshipsRequest, ListTermRelationshipsResponse>() {
                    @Override
                    public ListTermRelationshipsResponse apply(
                            ListTermRelationshipsRequest request) {
                        return client.listTermRelationships(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link
     * com.oracle.bmc.datacatalog.model.TermRelationshipSummary} objects contained in responses from
     * the listTermRelationships operation. This iterable will fetch more data from the server as
     * needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link
     *     com.oracle.bmc.datacatalog.model.TermRelationshipSummary} objects contained in responses
     *     received from the service.
     */
    public Iterable<com.oracle.bmc.datacatalog.model.TermRelationshipSummary>
            listTermRelationshipsRecordIterator(final ListTermRelationshipsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListTermRelationshipsRequest.Builder,
                ListTermRelationshipsRequest,
                ListTermRelationshipsResponse,
                com.oracle.bmc.datacatalog.model.TermRelationshipSummary>(
                new java.util.function.Supplier<ListTermRelationshipsRequest.Builder>() {
                    @Override
                    public ListTermRelationshipsRequest.Builder get() {
                        return ListTermRelationshipsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListTermRelationshipsResponse, String>() {
                    @Override
                    public String apply(ListTermRelationshipsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListTermRelationshipsRequest.Builder>,
                        ListTermRelationshipsRequest>() {
                    @Override
                    public ListTermRelationshipsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListTermRelationshipsRequest.Builder>
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
                        ListTermRelationshipsRequest, ListTermRelationshipsResponse>() {
                    @Override
                    public ListTermRelationshipsResponse apply(
                            ListTermRelationshipsRequest request) {
                        return client.listTermRelationships(request);
                    }
                },
                new java.util.function.Function<
                        ListTermRelationshipsResponse,
                        java.util.List<
                                com.oracle.bmc.datacatalog.model.TermRelationshipSummary>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.datacatalog.model.TermRelationshipSummary>
                            apply(ListTermRelationshipsResponse response) {
                        return response.getTermRelationshipCollection().getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the listTerms
     * operation. This iterable will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses
     *     received from the service.
     */
    public Iterable<ListTermsResponse> listTermsResponseIterator(final ListTermsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListTermsRequest.Builder, ListTermsRequest, ListTermsResponse>(
                new java.util.function.Supplier<ListTermsRequest.Builder>() {
                    @Override
                    public ListTermsRequest.Builder get() {
                        return ListTermsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListTermsResponse, String>() {
                    @Override
                    public String apply(ListTermsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListTermsRequest.Builder>,
                        ListTermsRequest>() {
                    @Override
                    public ListTermsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListTermsRequest.Builder>
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
                new java.util.function.Function<ListTermsRequest, ListTermsResponse>() {
                    @Override
                    public ListTermsResponse apply(ListTermsRequest request) {
                        return client.listTerms(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link
     * com.oracle.bmc.datacatalog.model.TermSummary} objects contained in responses from the
     * listTerms operation. This iterable will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link
     *     com.oracle.bmc.datacatalog.model.TermSummary} objects contained in responses received
     *     from the service.
     */
    public Iterable<com.oracle.bmc.datacatalog.model.TermSummary> listTermsRecordIterator(
            final ListTermsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListTermsRequest.Builder,
                ListTermsRequest,
                ListTermsResponse,
                com.oracle.bmc.datacatalog.model.TermSummary>(
                new java.util.function.Supplier<ListTermsRequest.Builder>() {
                    @Override
                    public ListTermsRequest.Builder get() {
                        return ListTermsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListTermsResponse, String>() {
                    @Override
                    public String apply(ListTermsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListTermsRequest.Builder>,
                        ListTermsRequest>() {
                    @Override
                    public ListTermsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListTermsRequest.Builder>
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
                new java.util.function.Function<ListTermsRequest, ListTermsResponse>() {
                    @Override
                    public ListTermsResponse apply(ListTermsRequest request) {
                        return client.listTerms(request);
                    }
                },
                new java.util.function.Function<
                        ListTermsResponse,
                        java.util.List<com.oracle.bmc.datacatalog.model.TermSummary>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.datacatalog.model.TermSummary> apply(
                            ListTermsResponse response) {
                        return response.getTermCollection().getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the listTypes
     * operation. This iterable will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses
     *     received from the service.
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
     * Creates a new iterable which will iterate over the {@link
     * com.oracle.bmc.datacatalog.model.TypeSummary} objects contained in responses from the
     * listTypes operation. This iterable will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link
     *     com.oracle.bmc.datacatalog.model.TypeSummary} objects contained in responses received
     *     from the service.
     */
    public Iterable<com.oracle.bmc.datacatalog.model.TypeSummary> listTypesRecordIterator(
            final ListTypesRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListTypesRequest.Builder,
                ListTypesRequest,
                ListTypesResponse,
                com.oracle.bmc.datacatalog.model.TypeSummary>(
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
                        java.util.List<com.oracle.bmc.datacatalog.model.TypeSummary>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.datacatalog.model.TypeSummary> apply(
                            ListTypesResponse response) {
                        return response.getTypeCollection().getItems();
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
     * com.oracle.bmc.datacatalog.model.WorkRequestError} objects contained in responses from the
     * listWorkRequestErrors operation. This iterable will fetch more data from the server as
     * needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link
     *     com.oracle.bmc.datacatalog.model.WorkRequestError} objects contained in responses
     *     received from the service.
     */
    public Iterable<com.oracle.bmc.datacatalog.model.WorkRequestError>
            listWorkRequestErrorsRecordIterator(final ListWorkRequestErrorsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListWorkRequestErrorsRequest.Builder,
                ListWorkRequestErrorsRequest,
                ListWorkRequestErrorsResponse,
                com.oracle.bmc.datacatalog.model.WorkRequestError>(
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
                        java.util.List<com.oracle.bmc.datacatalog.model.WorkRequestError>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.datacatalog.model.WorkRequestError> apply(
                            ListWorkRequestErrorsResponse response) {
                        return response.getItems();
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
     * com.oracle.bmc.datacatalog.model.WorkRequestLog} objects contained in responses from the
     * listWorkRequestLogs operation. This iterable will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link
     *     com.oracle.bmc.datacatalog.model.WorkRequestLog} objects contained in responses received
     *     from the service.
     */
    public Iterable<com.oracle.bmc.datacatalog.model.WorkRequestLog>
            listWorkRequestLogsRecordIterator(final ListWorkRequestLogsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListWorkRequestLogsRequest.Builder,
                ListWorkRequestLogsRequest,
                ListWorkRequestLogsResponse,
                com.oracle.bmc.datacatalog.model.WorkRequestLog>(
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
                        java.util.List<com.oracle.bmc.datacatalog.model.WorkRequestLog>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.datacatalog.model.WorkRequestLog> apply(
                            ListWorkRequestLogsResponse response) {
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
     * com.oracle.bmc.datacatalog.model.WorkRequest} objects contained in responses from the
     * listWorkRequests operation. This iterable will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link
     *     com.oracle.bmc.datacatalog.model.WorkRequest} objects contained in responses received
     *     from the service.
     */
    public Iterable<com.oracle.bmc.datacatalog.model.WorkRequest> listWorkRequestsRecordIterator(
            final ListWorkRequestsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListWorkRequestsRequest.Builder,
                ListWorkRequestsRequest,
                ListWorkRequestsResponse,
                com.oracle.bmc.datacatalog.model.WorkRequest>(
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
                        java.util.List<com.oracle.bmc.datacatalog.model.WorkRequest>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.datacatalog.model.WorkRequest> apply(
                            ListWorkRequestsResponse response) {
                        return response.getItems();
                    }
                });
    }
}

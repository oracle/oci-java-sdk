/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.usage;

import com.oracle.bmc.usage.requests.*;
import com.oracle.bmc.usage.responses.*;

/**
 * Collection of helper methods that can be used to provide an {@link java.lang.Iterable} interface
 * to any list operations of Resources where multiple pages of data may be fetched. Two styles of
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
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20190111")
public class ResourcesPaginators {
    private final Resources client;

    public ResourcesPaginators(Resources client) {
        this.client = client;
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the
     * listResourceQuota operation. This iterable will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses
     *     received from the service.
     */
    public Iterable<ListResourceQuotaResponse> listResourceQuotaResponseIterator(
            final ListResourceQuotaRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListResourceQuotaRequest.Builder,
                ListResourceQuotaRequest,
                ListResourceQuotaResponse>(
                new java.util.function.Supplier<ListResourceQuotaRequest.Builder>() {
                    @Override
                    public ListResourceQuotaRequest.Builder get() {
                        return ListResourceQuotaRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListResourceQuotaResponse, String>() {
                    @Override
                    public String apply(ListResourceQuotaResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListResourceQuotaRequest.Builder>,
                        ListResourceQuotaRequest>() {
                    @Override
                    public ListResourceQuotaRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListResourceQuotaRequest.Builder>
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
                        ListResourceQuotaRequest, ListResourceQuotaResponse>() {
                    @Override
                    public ListResourceQuotaResponse apply(ListResourceQuotaRequest request) {
                        return client.listResourceQuota(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link
     * com.oracle.bmc.usage.model.ResourceQuotumSummary} objects contained in responses from the
     * listResourceQuota operation. This iterable will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link
     *     com.oracle.bmc.usage.model.ResourceQuotumSummary} objects contained in responses received
     *     from the service.
     */
    public Iterable<com.oracle.bmc.usage.model.ResourceQuotumSummary>
            listResourceQuotaRecordIterator(final ListResourceQuotaRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListResourceQuotaRequest.Builder,
                ListResourceQuotaRequest,
                ListResourceQuotaResponse,
                com.oracle.bmc.usage.model.ResourceQuotumSummary>(
                new java.util.function.Supplier<ListResourceQuotaRequest.Builder>() {
                    @Override
                    public ListResourceQuotaRequest.Builder get() {
                        return ListResourceQuotaRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListResourceQuotaResponse, String>() {
                    @Override
                    public String apply(ListResourceQuotaResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListResourceQuotaRequest.Builder>,
                        ListResourceQuotaRequest>() {
                    @Override
                    public ListResourceQuotaRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListResourceQuotaRequest.Builder>
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
                        ListResourceQuotaRequest, ListResourceQuotaResponse>() {
                    @Override
                    public ListResourceQuotaResponse apply(ListResourceQuotaRequest request) {
                        return client.listResourceQuota(request);
                    }
                },
                new java.util.function.Function<
                        ListResourceQuotaResponse,
                        java.util.List<com.oracle.bmc.usage.model.ResourceQuotumSummary>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.usage.model.ResourceQuotumSummary> apply(
                            ListResourceQuotaResponse response) {
                        return response.getResourceQuotumCollection().getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the listResources
     * operation. This iterable will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses
     *     received from the service.
     */
    public Iterable<ListResourcesResponse> listResourcesResponseIterator(
            final ListResourcesRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListResourcesRequest.Builder, ListResourcesRequest, ListResourcesResponse>(
                new java.util.function.Supplier<ListResourcesRequest.Builder>() {
                    @Override
                    public ListResourcesRequest.Builder get() {
                        return ListResourcesRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListResourcesResponse, String>() {
                    @Override
                    public String apply(ListResourcesResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListResourcesRequest.Builder>,
                        ListResourcesRequest>() {
                    @Override
                    public ListResourcesRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListResourcesRequest.Builder>
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
                new java.util.function.Function<ListResourcesRequest, ListResourcesResponse>() {
                    @Override
                    public ListResourcesResponse apply(ListResourcesRequest request) {
                        return client.listResources(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link
     * com.oracle.bmc.usage.model.ResourceSummary} objects contained in responses from the
     * listResources operation. This iterable will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link
     *     com.oracle.bmc.usage.model.ResourceSummary} objects contained in responses received from
     *     the service.
     */
    public Iterable<com.oracle.bmc.usage.model.ResourceSummary> listResourcesRecordIterator(
            final ListResourcesRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListResourcesRequest.Builder,
                ListResourcesRequest,
                ListResourcesResponse,
                com.oracle.bmc.usage.model.ResourceSummary>(
                new java.util.function.Supplier<ListResourcesRequest.Builder>() {
                    @Override
                    public ListResourcesRequest.Builder get() {
                        return ListResourcesRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListResourcesResponse, String>() {
                    @Override
                    public String apply(ListResourcesResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListResourcesRequest.Builder>,
                        ListResourcesRequest>() {
                    @Override
                    public ListResourcesRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListResourcesRequest.Builder>
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
                new java.util.function.Function<ListResourcesRequest, ListResourcesResponse>() {
                    @Override
                    public ListResourcesResponse apply(ListResourcesRequest request) {
                        return client.listResources(request);
                    }
                },
                new java.util.function.Function<
                        ListResourcesResponse,
                        java.util.List<com.oracle.bmc.usage.model.ResourceSummary>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.usage.model.ResourceSummary> apply(
                            ListResourcesResponse response) {
                        return response.getResourcesCollection().getItems();
                    }
                });
    }
}

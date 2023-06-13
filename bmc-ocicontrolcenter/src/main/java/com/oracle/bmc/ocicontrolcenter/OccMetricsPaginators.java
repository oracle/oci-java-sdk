/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.ocicontrolcenter;

import com.oracle.bmc.ocicontrolcenter.requests.*;
import com.oracle.bmc.ocicontrolcenter.responses.*;

/**
 * Collection of helper methods that can be used to provide an {@link java.lang.Iterable} interface
 * to any list operations of OccMetrics where multiple pages of data may be fetched. Two styles of
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
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20230515")
public class OccMetricsPaginators {
    private final OccMetrics client;

    public OccMetricsPaginators(OccMetrics client) {
        this.client = client;
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the
     * listMetricProperties operation. This iterable will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses
     *     received from the service.
     */
    public Iterable<ListMetricPropertiesResponse> listMetricPropertiesResponseIterator(
            final ListMetricPropertiesRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListMetricPropertiesRequest.Builder,
                ListMetricPropertiesRequest,
                ListMetricPropertiesResponse>(
                new java.util.function.Supplier<ListMetricPropertiesRequest.Builder>() {
                    @Override
                    public ListMetricPropertiesRequest.Builder get() {
                        return ListMetricPropertiesRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListMetricPropertiesResponse, String>() {
                    @Override
                    public String apply(ListMetricPropertiesResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListMetricPropertiesRequest.Builder>,
                        ListMetricPropertiesRequest>() {
                    @Override
                    public ListMetricPropertiesRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListMetricPropertiesRequest.Builder>
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
                        ListMetricPropertiesRequest, ListMetricPropertiesResponse>() {
                    @Override
                    public ListMetricPropertiesResponse apply(ListMetricPropertiesRequest request) {
                        return client.listMetricProperties(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link
     * com.oracle.bmc.ocicontrolcenter.model.MetricPropertySummary} objects contained in responses
     * from the listMetricProperties operation. This iterable will fetch more data from the server
     * as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link
     *     com.oracle.bmc.ocicontrolcenter.model.MetricPropertySummary} objects contained in
     *     responses received from the service.
     */
    public Iterable<com.oracle.bmc.ocicontrolcenter.model.MetricPropertySummary>
            listMetricPropertiesRecordIterator(final ListMetricPropertiesRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListMetricPropertiesRequest.Builder,
                ListMetricPropertiesRequest,
                ListMetricPropertiesResponse,
                com.oracle.bmc.ocicontrolcenter.model.MetricPropertySummary>(
                new java.util.function.Supplier<ListMetricPropertiesRequest.Builder>() {
                    @Override
                    public ListMetricPropertiesRequest.Builder get() {
                        return ListMetricPropertiesRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListMetricPropertiesResponse, String>() {
                    @Override
                    public String apply(ListMetricPropertiesResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListMetricPropertiesRequest.Builder>,
                        ListMetricPropertiesRequest>() {
                    @Override
                    public ListMetricPropertiesRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListMetricPropertiesRequest.Builder>
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
                        ListMetricPropertiesRequest, ListMetricPropertiesResponse>() {
                    @Override
                    public ListMetricPropertiesResponse apply(ListMetricPropertiesRequest request) {
                        return client.listMetricProperties(request);
                    }
                },
                new java.util.function.Function<
                        ListMetricPropertiesResponse,
                        java.util.List<
                                com.oracle.bmc.ocicontrolcenter.model.MetricPropertySummary>>() {
                    @Override
                    public java.util.List<
                                    com.oracle.bmc.ocicontrolcenter.model.MetricPropertySummary>
                            apply(ListMetricPropertiesResponse response) {
                        return response.getMetricPropertyCollection().getItems();
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
     * com.oracle.bmc.ocicontrolcenter.model.NamespaceSummary} objects contained in responses from
     * the listNamespaces operation. This iterable will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link
     *     com.oracle.bmc.ocicontrolcenter.model.NamespaceSummary} objects contained in responses
     *     received from the service.
     */
    public Iterable<com.oracle.bmc.ocicontrolcenter.model.NamespaceSummary>
            listNamespacesRecordIterator(final ListNamespacesRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListNamespacesRequest.Builder,
                ListNamespacesRequest,
                ListNamespacesResponse,
                com.oracle.bmc.ocicontrolcenter.model.NamespaceSummary>(
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
                        java.util.List<com.oracle.bmc.ocicontrolcenter.model.NamespaceSummary>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.ocicontrolcenter.model.NamespaceSummary>
                            apply(ListNamespacesResponse response) {
                        return response.getNamespaceCollection().getItems();
                    }
                });
    }
}

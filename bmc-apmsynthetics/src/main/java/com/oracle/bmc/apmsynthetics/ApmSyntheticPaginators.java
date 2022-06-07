/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.apmsynthetics;

import com.oracle.bmc.apmsynthetics.requests.*;
import com.oracle.bmc.apmsynthetics.responses.*;

/**
 * Collection of helper methods that can be used to provide an {@link java.lang.Iterable} interface
 * to any list operations of ApmSynthetic where multiple pages of data may be fetched.
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
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200630")
public class ApmSyntheticPaginators {
    private final ApmSynthetic client;

    public ApmSyntheticPaginators(ApmSynthetic client) {
        this.client = client;
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the listDedicatedVantagePoints operation. This iterable
     * will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses received from the service.
     */
    public Iterable<ListDedicatedVantagePointsResponse> listDedicatedVantagePointsResponseIterator(
            final ListDedicatedVantagePointsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListDedicatedVantagePointsRequest.Builder, ListDedicatedVantagePointsRequest,
                ListDedicatedVantagePointsResponse>(
                new com.google.common.base.Supplier<ListDedicatedVantagePointsRequest.Builder>() {
                    @Override
                    public ListDedicatedVantagePointsRequest.Builder get() {
                        return ListDedicatedVantagePointsRequest.builder().copy(request);
                    }
                },
                new com.google.common.base.Function<ListDedicatedVantagePointsResponse, String>() {
                    @Override
                    public String apply(ListDedicatedVantagePointsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new com.google.common.base.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListDedicatedVantagePointsRequest.Builder>,
                        ListDedicatedVantagePointsRequest>() {
                    @Override
                    public ListDedicatedVantagePointsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListDedicatedVantagePointsRequest.Builder>
                                    input) {
                        if (input.getToken() == null) {
                            return input.getRequestBuilder().build();
                        } else {
                            return input.getRequestBuilder()
                                    .page(input.getToken().orNull())
                                    .build();
                        }
                    }
                },
                new com.google.common.base.Function<
                        ListDedicatedVantagePointsRequest, ListDedicatedVantagePointsResponse>() {
                    @Override
                    public ListDedicatedVantagePointsResponse apply(
                            ListDedicatedVantagePointsRequest request) {
                        return client.listDedicatedVantagePoints(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link com.oracle.bmc.apmsynthetics.model.DedicatedVantagePointSummary} objects
     * contained in responses from the listDedicatedVantagePoints operation. This iterable will fetch more data from the
     * server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link com.oracle.bmc.apmsynthetics.model.DedicatedVantagePointSummary} objects
     * contained in responses received from the service.
     */
    public Iterable<com.oracle.bmc.apmsynthetics.model.DedicatedVantagePointSummary>
            listDedicatedVantagePointsRecordIterator(
                    final ListDedicatedVantagePointsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListDedicatedVantagePointsRequest.Builder, ListDedicatedVantagePointsRequest,
                ListDedicatedVantagePointsResponse,
                com.oracle.bmc.apmsynthetics.model.DedicatedVantagePointSummary>(
                new com.google.common.base.Supplier<ListDedicatedVantagePointsRequest.Builder>() {
                    @Override
                    public ListDedicatedVantagePointsRequest.Builder get() {
                        return ListDedicatedVantagePointsRequest.builder().copy(request);
                    }
                },
                new com.google.common.base.Function<ListDedicatedVantagePointsResponse, String>() {
                    @Override
                    public String apply(ListDedicatedVantagePointsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new com.google.common.base.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListDedicatedVantagePointsRequest.Builder>,
                        ListDedicatedVantagePointsRequest>() {
                    @Override
                    public ListDedicatedVantagePointsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListDedicatedVantagePointsRequest.Builder>
                                    input) {
                        if (input.getToken() == null) {
                            return input.getRequestBuilder().build();
                        } else {
                            return input.getRequestBuilder()
                                    .page(input.getToken().orNull())
                                    .build();
                        }
                    }
                },
                new com.google.common.base.Function<
                        ListDedicatedVantagePointsRequest, ListDedicatedVantagePointsResponse>() {
                    @Override
                    public ListDedicatedVantagePointsResponse apply(
                            ListDedicatedVantagePointsRequest request) {
                        return client.listDedicatedVantagePoints(request);
                    }
                },
                new com.google.common.base.Function<
                        ListDedicatedVantagePointsResponse,
                        java.util.List<
                                com.oracle.bmc.apmsynthetics.model
                                        .DedicatedVantagePointSummary>>() {
                    @Override
                    public java.util.List<
                                    com.oracle.bmc.apmsynthetics.model.DedicatedVantagePointSummary>
                            apply(ListDedicatedVantagePointsResponse response) {
                        return response.getDedicatedVantagePointCollection().getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the listMonitors operation. This iterable
     * will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses received from the service.
     */
    public Iterable<ListMonitorsResponse> listMonitorsResponseIterator(
            final ListMonitorsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListMonitorsRequest.Builder, ListMonitorsRequest, ListMonitorsResponse>(
                new com.google.common.base.Supplier<ListMonitorsRequest.Builder>() {
                    @Override
                    public ListMonitorsRequest.Builder get() {
                        return ListMonitorsRequest.builder().copy(request);
                    }
                },
                new com.google.common.base.Function<ListMonitorsResponse, String>() {
                    @Override
                    public String apply(ListMonitorsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new com.google.common.base.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListMonitorsRequest.Builder>,
                        ListMonitorsRequest>() {
                    @Override
                    public ListMonitorsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListMonitorsRequest.Builder>
                                    input) {
                        if (input.getToken() == null) {
                            return input.getRequestBuilder().build();
                        } else {
                            return input.getRequestBuilder()
                                    .page(input.getToken().orNull())
                                    .build();
                        }
                    }
                },
                new com.google.common.base.Function<ListMonitorsRequest, ListMonitorsResponse>() {
                    @Override
                    public ListMonitorsResponse apply(ListMonitorsRequest request) {
                        return client.listMonitors(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link com.oracle.bmc.apmsynthetics.model.MonitorSummary} objects
     * contained in responses from the listMonitors operation. This iterable will fetch more data from the
     * server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link com.oracle.bmc.apmsynthetics.model.MonitorSummary} objects
     * contained in responses received from the service.
     */
    public Iterable<com.oracle.bmc.apmsynthetics.model.MonitorSummary> listMonitorsRecordIterator(
            final ListMonitorsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListMonitorsRequest.Builder, ListMonitorsRequest, ListMonitorsResponse,
                com.oracle.bmc.apmsynthetics.model.MonitorSummary>(
                new com.google.common.base.Supplier<ListMonitorsRequest.Builder>() {
                    @Override
                    public ListMonitorsRequest.Builder get() {
                        return ListMonitorsRequest.builder().copy(request);
                    }
                },
                new com.google.common.base.Function<ListMonitorsResponse, String>() {
                    @Override
                    public String apply(ListMonitorsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new com.google.common.base.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListMonitorsRequest.Builder>,
                        ListMonitorsRequest>() {
                    @Override
                    public ListMonitorsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListMonitorsRequest.Builder>
                                    input) {
                        if (input.getToken() == null) {
                            return input.getRequestBuilder().build();
                        } else {
                            return input.getRequestBuilder()
                                    .page(input.getToken().orNull())
                                    .build();
                        }
                    }
                },
                new com.google.common.base.Function<ListMonitorsRequest, ListMonitorsResponse>() {
                    @Override
                    public ListMonitorsResponse apply(ListMonitorsRequest request) {
                        return client.listMonitors(request);
                    }
                },
                new com.google.common.base.Function<
                        ListMonitorsResponse,
                        java.util.List<com.oracle.bmc.apmsynthetics.model.MonitorSummary>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.apmsynthetics.model.MonitorSummary> apply(
                            ListMonitorsResponse response) {
                        return response.getMonitorCollection().getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the listPublicVantagePoints operation. This iterable
     * will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses received from the service.
     */
    public Iterable<ListPublicVantagePointsResponse> listPublicVantagePointsResponseIterator(
            final ListPublicVantagePointsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListPublicVantagePointsRequest.Builder, ListPublicVantagePointsRequest,
                ListPublicVantagePointsResponse>(
                new com.google.common.base.Supplier<ListPublicVantagePointsRequest.Builder>() {
                    @Override
                    public ListPublicVantagePointsRequest.Builder get() {
                        return ListPublicVantagePointsRequest.builder().copy(request);
                    }
                },
                new com.google.common.base.Function<ListPublicVantagePointsResponse, String>() {
                    @Override
                    public String apply(ListPublicVantagePointsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new com.google.common.base.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListPublicVantagePointsRequest.Builder>,
                        ListPublicVantagePointsRequest>() {
                    @Override
                    public ListPublicVantagePointsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListPublicVantagePointsRequest.Builder>
                                    input) {
                        if (input.getToken() == null) {
                            return input.getRequestBuilder().build();
                        } else {
                            return input.getRequestBuilder()
                                    .page(input.getToken().orNull())
                                    .build();
                        }
                    }
                },
                new com.google.common.base.Function<
                        ListPublicVantagePointsRequest, ListPublicVantagePointsResponse>() {
                    @Override
                    public ListPublicVantagePointsResponse apply(
                            ListPublicVantagePointsRequest request) {
                        return client.listPublicVantagePoints(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link com.oracle.bmc.apmsynthetics.model.PublicVantagePointSummary} objects
     * contained in responses from the listPublicVantagePoints operation. This iterable will fetch more data from the
     * server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link com.oracle.bmc.apmsynthetics.model.PublicVantagePointSummary} objects
     * contained in responses received from the service.
     */
    public Iterable<com.oracle.bmc.apmsynthetics.model.PublicVantagePointSummary>
            listPublicVantagePointsRecordIterator(final ListPublicVantagePointsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListPublicVantagePointsRequest.Builder, ListPublicVantagePointsRequest,
                ListPublicVantagePointsResponse,
                com.oracle.bmc.apmsynthetics.model.PublicVantagePointSummary>(
                new com.google.common.base.Supplier<ListPublicVantagePointsRequest.Builder>() {
                    @Override
                    public ListPublicVantagePointsRequest.Builder get() {
                        return ListPublicVantagePointsRequest.builder().copy(request);
                    }
                },
                new com.google.common.base.Function<ListPublicVantagePointsResponse, String>() {
                    @Override
                    public String apply(ListPublicVantagePointsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new com.google.common.base.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListPublicVantagePointsRequest.Builder>,
                        ListPublicVantagePointsRequest>() {
                    @Override
                    public ListPublicVantagePointsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListPublicVantagePointsRequest.Builder>
                                    input) {
                        if (input.getToken() == null) {
                            return input.getRequestBuilder().build();
                        } else {
                            return input.getRequestBuilder()
                                    .page(input.getToken().orNull())
                                    .build();
                        }
                    }
                },
                new com.google.common.base.Function<
                        ListPublicVantagePointsRequest, ListPublicVantagePointsResponse>() {
                    @Override
                    public ListPublicVantagePointsResponse apply(
                            ListPublicVantagePointsRequest request) {
                        return client.listPublicVantagePoints(request);
                    }
                },
                new com.google.common.base.Function<
                        ListPublicVantagePointsResponse,
                        java.util.List<
                                com.oracle.bmc.apmsynthetics.model.PublicVantagePointSummary>>() {
                    @Override
                    public java.util.List<
                                    com.oracle.bmc.apmsynthetics.model.PublicVantagePointSummary>
                            apply(ListPublicVantagePointsResponse response) {
                        return response.getPublicVantagePointCollection().getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the listScripts operation. This iterable
     * will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses received from the service.
     */
    public Iterable<ListScriptsResponse> listScriptsResponseIterator(
            final ListScriptsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListScriptsRequest.Builder, ListScriptsRequest, ListScriptsResponse>(
                new com.google.common.base.Supplier<ListScriptsRequest.Builder>() {
                    @Override
                    public ListScriptsRequest.Builder get() {
                        return ListScriptsRequest.builder().copy(request);
                    }
                },
                new com.google.common.base.Function<ListScriptsResponse, String>() {
                    @Override
                    public String apply(ListScriptsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new com.google.common.base.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListScriptsRequest.Builder>,
                        ListScriptsRequest>() {
                    @Override
                    public ListScriptsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListScriptsRequest.Builder>
                                    input) {
                        if (input.getToken() == null) {
                            return input.getRequestBuilder().build();
                        } else {
                            return input.getRequestBuilder()
                                    .page(input.getToken().orNull())
                                    .build();
                        }
                    }
                },
                new com.google.common.base.Function<ListScriptsRequest, ListScriptsResponse>() {
                    @Override
                    public ListScriptsResponse apply(ListScriptsRequest request) {
                        return client.listScripts(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link com.oracle.bmc.apmsynthetics.model.ScriptSummary} objects
     * contained in responses from the listScripts operation. This iterable will fetch more data from the
     * server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link com.oracle.bmc.apmsynthetics.model.ScriptSummary} objects
     * contained in responses received from the service.
     */
    public Iterable<com.oracle.bmc.apmsynthetics.model.ScriptSummary> listScriptsRecordIterator(
            final ListScriptsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListScriptsRequest.Builder, ListScriptsRequest, ListScriptsResponse,
                com.oracle.bmc.apmsynthetics.model.ScriptSummary>(
                new com.google.common.base.Supplier<ListScriptsRequest.Builder>() {
                    @Override
                    public ListScriptsRequest.Builder get() {
                        return ListScriptsRequest.builder().copy(request);
                    }
                },
                new com.google.common.base.Function<ListScriptsResponse, String>() {
                    @Override
                    public String apply(ListScriptsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new com.google.common.base.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListScriptsRequest.Builder>,
                        ListScriptsRequest>() {
                    @Override
                    public ListScriptsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListScriptsRequest.Builder>
                                    input) {
                        if (input.getToken() == null) {
                            return input.getRequestBuilder().build();
                        } else {
                            return input.getRequestBuilder()
                                    .page(input.getToken().orNull())
                                    .build();
                        }
                    }
                },
                new com.google.common.base.Function<ListScriptsRequest, ListScriptsResponse>() {
                    @Override
                    public ListScriptsResponse apply(ListScriptsRequest request) {
                        return client.listScripts(request);
                    }
                },
                new com.google.common.base.Function<
                        ListScriptsResponse,
                        java.util.List<com.oracle.bmc.apmsynthetics.model.ScriptSummary>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.apmsynthetics.model.ScriptSummary> apply(
                            ListScriptsResponse response) {
                        return response.getScriptCollection().getItems();
                    }
                });
    }
}

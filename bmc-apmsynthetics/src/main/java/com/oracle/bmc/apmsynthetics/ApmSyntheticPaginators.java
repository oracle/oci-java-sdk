/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.apmsynthetics;

import com.oracle.bmc.apmsynthetics.requests.*;
import com.oracle.bmc.apmsynthetics.responses.*;

/**
 * Collection of helper methods that can be used to provide an {@link java.lang.Iterable} interface
 * to any list operations of ApmSynthetic where multiple pages of data may be fetched. Two styles of
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
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200630")
public class ApmSyntheticPaginators {
    private final ApmSynthetic client;

    public ApmSyntheticPaginators(ApmSynthetic client) {
        this.client = client;
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the
     * listDedicatedVantagePoints operation. This iterable will fetch more data from the server as
     * needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses
     *     received from the service.
     */
    public Iterable<ListDedicatedVantagePointsResponse> listDedicatedVantagePointsResponseIterator(
            final ListDedicatedVantagePointsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListDedicatedVantagePointsRequest.Builder,
                ListDedicatedVantagePointsRequest,
                ListDedicatedVantagePointsResponse>(
                new java.util.function.Supplier<ListDedicatedVantagePointsRequest.Builder>() {
                    @Override
                    public ListDedicatedVantagePointsRequest.Builder get() {
                        return ListDedicatedVantagePointsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListDedicatedVantagePointsResponse, String>() {
                    @Override
                    public String apply(ListDedicatedVantagePointsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListDedicatedVantagePointsRequest.Builder>,
                        ListDedicatedVantagePointsRequest>() {
                    @Override
                    public ListDedicatedVantagePointsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListDedicatedVantagePointsRequest.Builder>
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
                        ListDedicatedVantagePointsRequest, ListDedicatedVantagePointsResponse>() {
                    @Override
                    public ListDedicatedVantagePointsResponse apply(
                            ListDedicatedVantagePointsRequest request) {
                        return client.listDedicatedVantagePoints(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link
     * com.oracle.bmc.apmsynthetics.model.DedicatedVantagePointSummary} objects contained in
     * responses from the listDedicatedVantagePoints operation. This iterable will fetch more data
     * from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link
     *     com.oracle.bmc.apmsynthetics.model.DedicatedVantagePointSummary} objects contained in
     *     responses received from the service.
     */
    public Iterable<com.oracle.bmc.apmsynthetics.model.DedicatedVantagePointSummary>
            listDedicatedVantagePointsRecordIterator(
                    final ListDedicatedVantagePointsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListDedicatedVantagePointsRequest.Builder,
                ListDedicatedVantagePointsRequest,
                ListDedicatedVantagePointsResponse,
                com.oracle.bmc.apmsynthetics.model.DedicatedVantagePointSummary>(
                new java.util.function.Supplier<ListDedicatedVantagePointsRequest.Builder>() {
                    @Override
                    public ListDedicatedVantagePointsRequest.Builder get() {
                        return ListDedicatedVantagePointsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListDedicatedVantagePointsResponse, String>() {
                    @Override
                    public String apply(ListDedicatedVantagePointsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListDedicatedVantagePointsRequest.Builder>,
                        ListDedicatedVantagePointsRequest>() {
                    @Override
                    public ListDedicatedVantagePointsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListDedicatedVantagePointsRequest.Builder>
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
                        ListDedicatedVantagePointsRequest, ListDedicatedVantagePointsResponse>() {
                    @Override
                    public ListDedicatedVantagePointsResponse apply(
                            ListDedicatedVantagePointsRequest request) {
                        return client.listDedicatedVantagePoints(request);
                    }
                },
                new java.util.function.Function<
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
     * Creates a new iterable which will iterate over the responses received from the listMonitors
     * operation. This iterable will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses
     *     received from the service.
     */
    public Iterable<ListMonitorsResponse> listMonitorsResponseIterator(
            final ListMonitorsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListMonitorsRequest.Builder, ListMonitorsRequest, ListMonitorsResponse>(
                new java.util.function.Supplier<ListMonitorsRequest.Builder>() {
                    @Override
                    public ListMonitorsRequest.Builder get() {
                        return ListMonitorsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListMonitorsResponse, String>() {
                    @Override
                    public String apply(ListMonitorsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListMonitorsRequest.Builder>,
                        ListMonitorsRequest>() {
                    @Override
                    public ListMonitorsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListMonitorsRequest.Builder>
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
                new java.util.function.Function<ListMonitorsRequest, ListMonitorsResponse>() {
                    @Override
                    public ListMonitorsResponse apply(ListMonitorsRequest request) {
                        return client.listMonitors(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link
     * com.oracle.bmc.apmsynthetics.model.MonitorSummary} objects contained in responses from the
     * listMonitors operation. This iterable will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link
     *     com.oracle.bmc.apmsynthetics.model.MonitorSummary} objects contained in responses
     *     received from the service.
     */
    public Iterable<com.oracle.bmc.apmsynthetics.model.MonitorSummary> listMonitorsRecordIterator(
            final ListMonitorsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListMonitorsRequest.Builder,
                ListMonitorsRequest,
                ListMonitorsResponse,
                com.oracle.bmc.apmsynthetics.model.MonitorSummary>(
                new java.util.function.Supplier<ListMonitorsRequest.Builder>() {
                    @Override
                    public ListMonitorsRequest.Builder get() {
                        return ListMonitorsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListMonitorsResponse, String>() {
                    @Override
                    public String apply(ListMonitorsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListMonitorsRequest.Builder>,
                        ListMonitorsRequest>() {
                    @Override
                    public ListMonitorsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListMonitorsRequest.Builder>
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
                new java.util.function.Function<ListMonitorsRequest, ListMonitorsResponse>() {
                    @Override
                    public ListMonitorsResponse apply(ListMonitorsRequest request) {
                        return client.listMonitors(request);
                    }
                },
                new java.util.function.Function<
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
     * Creates a new iterable which will iterate over the responses received from the
     * listOnPremiseVantagePoints operation. This iterable will fetch more data from the server as
     * needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses
     *     received from the service.
     */
    public Iterable<ListOnPremiseVantagePointsResponse> listOnPremiseVantagePointsResponseIterator(
            final ListOnPremiseVantagePointsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListOnPremiseVantagePointsRequest.Builder,
                ListOnPremiseVantagePointsRequest,
                ListOnPremiseVantagePointsResponse>(
                new java.util.function.Supplier<ListOnPremiseVantagePointsRequest.Builder>() {
                    @Override
                    public ListOnPremiseVantagePointsRequest.Builder get() {
                        return ListOnPremiseVantagePointsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListOnPremiseVantagePointsResponse, String>() {
                    @Override
                    public String apply(ListOnPremiseVantagePointsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListOnPremiseVantagePointsRequest.Builder>,
                        ListOnPremiseVantagePointsRequest>() {
                    @Override
                    public ListOnPremiseVantagePointsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListOnPremiseVantagePointsRequest.Builder>
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
                        ListOnPremiseVantagePointsRequest, ListOnPremiseVantagePointsResponse>() {
                    @Override
                    public ListOnPremiseVantagePointsResponse apply(
                            ListOnPremiseVantagePointsRequest request) {
                        return client.listOnPremiseVantagePoints(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link
     * com.oracle.bmc.apmsynthetics.model.OnPremiseVantagePointSummary} objects contained in
     * responses from the listOnPremiseVantagePoints operation. This iterable will fetch more data
     * from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link
     *     com.oracle.bmc.apmsynthetics.model.OnPremiseVantagePointSummary} objects contained in
     *     responses received from the service.
     */
    public Iterable<com.oracle.bmc.apmsynthetics.model.OnPremiseVantagePointSummary>
            listOnPremiseVantagePointsRecordIterator(
                    final ListOnPremiseVantagePointsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListOnPremiseVantagePointsRequest.Builder,
                ListOnPremiseVantagePointsRequest,
                ListOnPremiseVantagePointsResponse,
                com.oracle.bmc.apmsynthetics.model.OnPremiseVantagePointSummary>(
                new java.util.function.Supplier<ListOnPremiseVantagePointsRequest.Builder>() {
                    @Override
                    public ListOnPremiseVantagePointsRequest.Builder get() {
                        return ListOnPremiseVantagePointsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListOnPremiseVantagePointsResponse, String>() {
                    @Override
                    public String apply(ListOnPremiseVantagePointsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListOnPremiseVantagePointsRequest.Builder>,
                        ListOnPremiseVantagePointsRequest>() {
                    @Override
                    public ListOnPremiseVantagePointsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListOnPremiseVantagePointsRequest.Builder>
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
                        ListOnPremiseVantagePointsRequest, ListOnPremiseVantagePointsResponse>() {
                    @Override
                    public ListOnPremiseVantagePointsResponse apply(
                            ListOnPremiseVantagePointsRequest request) {
                        return client.listOnPremiseVantagePoints(request);
                    }
                },
                new java.util.function.Function<
                        ListOnPremiseVantagePointsResponse,
                        java.util.List<
                                com.oracle.bmc.apmsynthetics.model
                                        .OnPremiseVantagePointSummary>>() {
                    @Override
                    public java.util.List<
                                    com.oracle.bmc.apmsynthetics.model.OnPremiseVantagePointSummary>
                            apply(ListOnPremiseVantagePointsResponse response) {
                        return response.getOnPremiseVantagePointCollection().getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the
     * listPublicVantagePoints operation. This iterable will fetch more data from the server as
     * needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses
     *     received from the service.
     */
    public Iterable<ListPublicVantagePointsResponse> listPublicVantagePointsResponseIterator(
            final ListPublicVantagePointsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListPublicVantagePointsRequest.Builder,
                ListPublicVantagePointsRequest,
                ListPublicVantagePointsResponse>(
                new java.util.function.Supplier<ListPublicVantagePointsRequest.Builder>() {
                    @Override
                    public ListPublicVantagePointsRequest.Builder get() {
                        return ListPublicVantagePointsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListPublicVantagePointsResponse, String>() {
                    @Override
                    public String apply(ListPublicVantagePointsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListPublicVantagePointsRequest.Builder>,
                        ListPublicVantagePointsRequest>() {
                    @Override
                    public ListPublicVantagePointsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListPublicVantagePointsRequest.Builder>
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
                        ListPublicVantagePointsRequest, ListPublicVantagePointsResponse>() {
                    @Override
                    public ListPublicVantagePointsResponse apply(
                            ListPublicVantagePointsRequest request) {
                        return client.listPublicVantagePoints(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link
     * com.oracle.bmc.apmsynthetics.model.PublicVantagePointSummary} objects contained in responses
     * from the listPublicVantagePoints operation. This iterable will fetch more data from the
     * server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link
     *     com.oracle.bmc.apmsynthetics.model.PublicVantagePointSummary} objects contained in
     *     responses received from the service.
     */
    public Iterable<com.oracle.bmc.apmsynthetics.model.PublicVantagePointSummary>
            listPublicVantagePointsRecordIterator(final ListPublicVantagePointsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListPublicVantagePointsRequest.Builder,
                ListPublicVantagePointsRequest,
                ListPublicVantagePointsResponse,
                com.oracle.bmc.apmsynthetics.model.PublicVantagePointSummary>(
                new java.util.function.Supplier<ListPublicVantagePointsRequest.Builder>() {
                    @Override
                    public ListPublicVantagePointsRequest.Builder get() {
                        return ListPublicVantagePointsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListPublicVantagePointsResponse, String>() {
                    @Override
                    public String apply(ListPublicVantagePointsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListPublicVantagePointsRequest.Builder>,
                        ListPublicVantagePointsRequest>() {
                    @Override
                    public ListPublicVantagePointsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListPublicVantagePointsRequest.Builder>
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
                        ListPublicVantagePointsRequest, ListPublicVantagePointsResponse>() {
                    @Override
                    public ListPublicVantagePointsResponse apply(
                            ListPublicVantagePointsRequest request) {
                        return client.listPublicVantagePoints(request);
                    }
                },
                new java.util.function.Function<
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
     * Creates a new iterable which will iterate over the responses received from the listScripts
     * operation. This iterable will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses
     *     received from the service.
     */
    public Iterable<ListScriptsResponse> listScriptsResponseIterator(
            final ListScriptsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListScriptsRequest.Builder, ListScriptsRequest, ListScriptsResponse>(
                new java.util.function.Supplier<ListScriptsRequest.Builder>() {
                    @Override
                    public ListScriptsRequest.Builder get() {
                        return ListScriptsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListScriptsResponse, String>() {
                    @Override
                    public String apply(ListScriptsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListScriptsRequest.Builder>,
                        ListScriptsRequest>() {
                    @Override
                    public ListScriptsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListScriptsRequest.Builder>
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
                new java.util.function.Function<ListScriptsRequest, ListScriptsResponse>() {
                    @Override
                    public ListScriptsResponse apply(ListScriptsRequest request) {
                        return client.listScripts(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link
     * com.oracle.bmc.apmsynthetics.model.ScriptSummary} objects contained in responses from the
     * listScripts operation. This iterable will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link
     *     com.oracle.bmc.apmsynthetics.model.ScriptSummary} objects contained in responses received
     *     from the service.
     */
    public Iterable<com.oracle.bmc.apmsynthetics.model.ScriptSummary> listScriptsRecordIterator(
            final ListScriptsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListScriptsRequest.Builder,
                ListScriptsRequest,
                ListScriptsResponse,
                com.oracle.bmc.apmsynthetics.model.ScriptSummary>(
                new java.util.function.Supplier<ListScriptsRequest.Builder>() {
                    @Override
                    public ListScriptsRequest.Builder get() {
                        return ListScriptsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListScriptsResponse, String>() {
                    @Override
                    public String apply(ListScriptsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListScriptsRequest.Builder>,
                        ListScriptsRequest>() {
                    @Override
                    public ListScriptsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListScriptsRequest.Builder>
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
                new java.util.function.Function<ListScriptsRequest, ListScriptsResponse>() {
                    @Override
                    public ListScriptsResponse apply(ListScriptsRequest request) {
                        return client.listScripts(request);
                    }
                },
                new java.util.function.Function<
                        ListScriptsResponse,
                        java.util.List<com.oracle.bmc.apmsynthetics.model.ScriptSummary>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.apmsynthetics.model.ScriptSummary> apply(
                            ListScriptsResponse response) {
                        return response.getScriptCollection().getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the listWorkers
     * operation. This iterable will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses
     *     received from the service.
     */
    public Iterable<ListWorkersResponse> listWorkersResponseIterator(
            final ListWorkersRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListWorkersRequest.Builder, ListWorkersRequest, ListWorkersResponse>(
                new java.util.function.Supplier<ListWorkersRequest.Builder>() {
                    @Override
                    public ListWorkersRequest.Builder get() {
                        return ListWorkersRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListWorkersResponse, String>() {
                    @Override
                    public String apply(ListWorkersResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListWorkersRequest.Builder>,
                        ListWorkersRequest>() {
                    @Override
                    public ListWorkersRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListWorkersRequest.Builder>
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
                new java.util.function.Function<ListWorkersRequest, ListWorkersResponse>() {
                    @Override
                    public ListWorkersResponse apply(ListWorkersRequest request) {
                        return client.listWorkers(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link
     * com.oracle.bmc.apmsynthetics.model.WorkerSummary} objects contained in responses from the
     * listWorkers operation. This iterable will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link
     *     com.oracle.bmc.apmsynthetics.model.WorkerSummary} objects contained in responses received
     *     from the service.
     */
    public Iterable<com.oracle.bmc.apmsynthetics.model.WorkerSummary> listWorkersRecordIterator(
            final ListWorkersRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListWorkersRequest.Builder,
                ListWorkersRequest,
                ListWorkersResponse,
                com.oracle.bmc.apmsynthetics.model.WorkerSummary>(
                new java.util.function.Supplier<ListWorkersRequest.Builder>() {
                    @Override
                    public ListWorkersRequest.Builder get() {
                        return ListWorkersRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListWorkersResponse, String>() {
                    @Override
                    public String apply(ListWorkersResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListWorkersRequest.Builder>,
                        ListWorkersRequest>() {
                    @Override
                    public ListWorkersRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListWorkersRequest.Builder>
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
                new java.util.function.Function<ListWorkersRequest, ListWorkersResponse>() {
                    @Override
                    public ListWorkersResponse apply(ListWorkersRequest request) {
                        return client.listWorkers(request);
                    }
                },
                new java.util.function.Function<
                        ListWorkersResponse,
                        java.util.List<com.oracle.bmc.apmsynthetics.model.WorkerSummary>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.apmsynthetics.model.WorkerSummary> apply(
                            ListWorkersResponse response) {
                        return response.getWorkerCollection().getItems();
                    }
                });
    }
}

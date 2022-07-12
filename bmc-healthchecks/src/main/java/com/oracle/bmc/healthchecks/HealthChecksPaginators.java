/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.healthchecks;

import com.oracle.bmc.healthchecks.requests.*;
import com.oracle.bmc.healthchecks.responses.*;

/**
 * Collection of helper methods that can be used to provide an {@link java.lang.Iterable} interface
 * to any list operations of HealthChecks where multiple pages of data may be fetched.
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
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20180501")
public class HealthChecksPaginators {
    private final HealthChecks client;

    public HealthChecksPaginators(HealthChecks client) {
        this.client = client;
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the listHealthChecksVantagePoints operation. This iterable
     * will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses received from the service.
     */
    public Iterable<ListHealthChecksVantagePointsResponse>
            listHealthChecksVantagePointsResponseIterator(
                    final ListHealthChecksVantagePointsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListHealthChecksVantagePointsRequest.Builder, ListHealthChecksVantagePointsRequest,
                ListHealthChecksVantagePointsResponse>(
                new java.util.function.Supplier<ListHealthChecksVantagePointsRequest.Builder>() {
                    @Override
                    public ListHealthChecksVantagePointsRequest.Builder get() {
                        return ListHealthChecksVantagePointsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListHealthChecksVantagePointsResponse, String>() {
                    @Override
                    public String apply(ListHealthChecksVantagePointsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListHealthChecksVantagePointsRequest.Builder>,
                        ListHealthChecksVantagePointsRequest>() {
                    @Override
                    public ListHealthChecksVantagePointsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListHealthChecksVantagePointsRequest.Builder>
                                    input) {
                        if (input.getToken() == null) {
                            return input.getRequestBuilder().build();
                        } else {
                            return input.getRequestBuilder()
                                    .page(input.getToken().orElse(null))
                                    .build();
                        }
                    }
                },
                new java.util.function.Function<
                        ListHealthChecksVantagePointsRequest,
                        ListHealthChecksVantagePointsResponse>() {
                    @Override
                    public ListHealthChecksVantagePointsResponse apply(
                            ListHealthChecksVantagePointsRequest request) {
                        return client.listHealthChecksVantagePoints(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link com.oracle.bmc.healthchecks.model.HealthChecksVantagePointSummary} objects
     * contained in responses from the listHealthChecksVantagePoints operation. This iterable will fetch more data from the
     * server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link com.oracle.bmc.healthchecks.model.HealthChecksVantagePointSummary} objects
     * contained in responses received from the service.
     */
    public Iterable<com.oracle.bmc.healthchecks.model.HealthChecksVantagePointSummary>
            listHealthChecksVantagePointsRecordIterator(
                    final ListHealthChecksVantagePointsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListHealthChecksVantagePointsRequest.Builder, ListHealthChecksVantagePointsRequest,
                ListHealthChecksVantagePointsResponse,
                com.oracle.bmc.healthchecks.model.HealthChecksVantagePointSummary>(
                new java.util.function.Supplier<ListHealthChecksVantagePointsRequest.Builder>() {
                    @Override
                    public ListHealthChecksVantagePointsRequest.Builder get() {
                        return ListHealthChecksVantagePointsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListHealthChecksVantagePointsResponse, String>() {
                    @Override
                    public String apply(ListHealthChecksVantagePointsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListHealthChecksVantagePointsRequest.Builder>,
                        ListHealthChecksVantagePointsRequest>() {
                    @Override
                    public ListHealthChecksVantagePointsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListHealthChecksVantagePointsRequest.Builder>
                                    input) {
                        if (input.getToken() == null) {
                            return input.getRequestBuilder().build();
                        } else {
                            return input.getRequestBuilder()
                                    .page(input.getToken().orElse(null))
                                    .build();
                        }
                    }
                },
                new java.util.function.Function<
                        ListHealthChecksVantagePointsRequest,
                        ListHealthChecksVantagePointsResponse>() {
                    @Override
                    public ListHealthChecksVantagePointsResponse apply(
                            ListHealthChecksVantagePointsRequest request) {
                        return client.listHealthChecksVantagePoints(request);
                    }
                },
                new java.util.function.Function<
                        ListHealthChecksVantagePointsResponse,
                        java.util.List<
                                com.oracle.bmc.healthchecks.model
                                        .HealthChecksVantagePointSummary>>() {
                    @Override
                    public java.util.List<
                                    com.oracle.bmc.healthchecks.model
                                            .HealthChecksVantagePointSummary>
                            apply(ListHealthChecksVantagePointsResponse response) {
                        return response.getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the listHttpMonitors operation. This iterable
     * will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses received from the service.
     */
    public Iterable<ListHttpMonitorsResponse> listHttpMonitorsResponseIterator(
            final ListHttpMonitorsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListHttpMonitorsRequest.Builder, ListHttpMonitorsRequest, ListHttpMonitorsResponse>(
                new java.util.function.Supplier<ListHttpMonitorsRequest.Builder>() {
                    @Override
                    public ListHttpMonitorsRequest.Builder get() {
                        return ListHttpMonitorsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListHttpMonitorsResponse, String>() {
                    @Override
                    public String apply(ListHttpMonitorsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListHttpMonitorsRequest.Builder>,
                        ListHttpMonitorsRequest>() {
                    @Override
                    public ListHttpMonitorsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListHttpMonitorsRequest.Builder>
                                    input) {
                        if (input.getToken() == null) {
                            return input.getRequestBuilder().build();
                        } else {
                            return input.getRequestBuilder()
                                    .page(input.getToken().orElse(null))
                                    .build();
                        }
                    }
                },
                new java.util.function.Function<
                        ListHttpMonitorsRequest, ListHttpMonitorsResponse>() {
                    @Override
                    public ListHttpMonitorsResponse apply(ListHttpMonitorsRequest request) {
                        return client.listHttpMonitors(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link com.oracle.bmc.healthchecks.model.HttpMonitorSummary} objects
     * contained in responses from the listHttpMonitors operation. This iterable will fetch more data from the
     * server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link com.oracle.bmc.healthchecks.model.HttpMonitorSummary} objects
     * contained in responses received from the service.
     */
    public Iterable<com.oracle.bmc.healthchecks.model.HttpMonitorSummary>
            listHttpMonitorsRecordIterator(final ListHttpMonitorsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListHttpMonitorsRequest.Builder, ListHttpMonitorsRequest, ListHttpMonitorsResponse,
                com.oracle.bmc.healthchecks.model.HttpMonitorSummary>(
                new java.util.function.Supplier<ListHttpMonitorsRequest.Builder>() {
                    @Override
                    public ListHttpMonitorsRequest.Builder get() {
                        return ListHttpMonitorsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListHttpMonitorsResponse, String>() {
                    @Override
                    public String apply(ListHttpMonitorsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListHttpMonitorsRequest.Builder>,
                        ListHttpMonitorsRequest>() {
                    @Override
                    public ListHttpMonitorsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListHttpMonitorsRequest.Builder>
                                    input) {
                        if (input.getToken() == null) {
                            return input.getRequestBuilder().build();
                        } else {
                            return input.getRequestBuilder()
                                    .page(input.getToken().orElse(null))
                                    .build();
                        }
                    }
                },
                new java.util.function.Function<
                        ListHttpMonitorsRequest, ListHttpMonitorsResponse>() {
                    @Override
                    public ListHttpMonitorsResponse apply(ListHttpMonitorsRequest request) {
                        return client.listHttpMonitors(request);
                    }
                },
                new java.util.function.Function<
                        ListHttpMonitorsResponse,
                        java.util.List<com.oracle.bmc.healthchecks.model.HttpMonitorSummary>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.healthchecks.model.HttpMonitorSummary>
                            apply(ListHttpMonitorsResponse response) {
                        return response.getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the listHttpProbeResults operation. This iterable
     * will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses received from the service.
     */
    public Iterable<ListHttpProbeResultsResponse> listHttpProbeResultsResponseIterator(
            final ListHttpProbeResultsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListHttpProbeResultsRequest.Builder, ListHttpProbeResultsRequest,
                ListHttpProbeResultsResponse>(
                new java.util.function.Supplier<ListHttpProbeResultsRequest.Builder>() {
                    @Override
                    public ListHttpProbeResultsRequest.Builder get() {
                        return ListHttpProbeResultsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListHttpProbeResultsResponse, String>() {
                    @Override
                    public String apply(ListHttpProbeResultsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListHttpProbeResultsRequest.Builder>,
                        ListHttpProbeResultsRequest>() {
                    @Override
                    public ListHttpProbeResultsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListHttpProbeResultsRequest.Builder>
                                    input) {
                        if (input.getToken() == null) {
                            return input.getRequestBuilder().build();
                        } else {
                            return input.getRequestBuilder()
                                    .page(input.getToken().orElse(null))
                                    .build();
                        }
                    }
                },
                new java.util.function.Function<
                        ListHttpProbeResultsRequest, ListHttpProbeResultsResponse>() {
                    @Override
                    public ListHttpProbeResultsResponse apply(ListHttpProbeResultsRequest request) {
                        return client.listHttpProbeResults(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link com.oracle.bmc.healthchecks.model.HttpProbeResultSummary} objects
     * contained in responses from the listHttpProbeResults operation. This iterable will fetch more data from the
     * server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link com.oracle.bmc.healthchecks.model.HttpProbeResultSummary} objects
     * contained in responses received from the service.
     */
    public Iterable<com.oracle.bmc.healthchecks.model.HttpProbeResultSummary>
            listHttpProbeResultsRecordIterator(final ListHttpProbeResultsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListHttpProbeResultsRequest.Builder, ListHttpProbeResultsRequest,
                ListHttpProbeResultsResponse,
                com.oracle.bmc.healthchecks.model.HttpProbeResultSummary>(
                new java.util.function.Supplier<ListHttpProbeResultsRequest.Builder>() {
                    @Override
                    public ListHttpProbeResultsRequest.Builder get() {
                        return ListHttpProbeResultsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListHttpProbeResultsResponse, String>() {
                    @Override
                    public String apply(ListHttpProbeResultsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListHttpProbeResultsRequest.Builder>,
                        ListHttpProbeResultsRequest>() {
                    @Override
                    public ListHttpProbeResultsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListHttpProbeResultsRequest.Builder>
                                    input) {
                        if (input.getToken() == null) {
                            return input.getRequestBuilder().build();
                        } else {
                            return input.getRequestBuilder()
                                    .page(input.getToken().orElse(null))
                                    .build();
                        }
                    }
                },
                new java.util.function.Function<
                        ListHttpProbeResultsRequest, ListHttpProbeResultsResponse>() {
                    @Override
                    public ListHttpProbeResultsResponse apply(ListHttpProbeResultsRequest request) {
                        return client.listHttpProbeResults(request);
                    }
                },
                new java.util.function.Function<
                        ListHttpProbeResultsResponse,
                        java.util.List<
                                com.oracle.bmc.healthchecks.model.HttpProbeResultSummary>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.healthchecks.model.HttpProbeResultSummary>
                            apply(ListHttpProbeResultsResponse response) {
                        return response.getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the listPingMonitors operation. This iterable
     * will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses received from the service.
     */
    public Iterable<ListPingMonitorsResponse> listPingMonitorsResponseIterator(
            final ListPingMonitorsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListPingMonitorsRequest.Builder, ListPingMonitorsRequest, ListPingMonitorsResponse>(
                new java.util.function.Supplier<ListPingMonitorsRequest.Builder>() {
                    @Override
                    public ListPingMonitorsRequest.Builder get() {
                        return ListPingMonitorsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListPingMonitorsResponse, String>() {
                    @Override
                    public String apply(ListPingMonitorsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListPingMonitorsRequest.Builder>,
                        ListPingMonitorsRequest>() {
                    @Override
                    public ListPingMonitorsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListPingMonitorsRequest.Builder>
                                    input) {
                        if (input.getToken() == null) {
                            return input.getRequestBuilder().build();
                        } else {
                            return input.getRequestBuilder()
                                    .page(input.getToken().orElse(null))
                                    .build();
                        }
                    }
                },
                new java.util.function.Function<
                        ListPingMonitorsRequest, ListPingMonitorsResponse>() {
                    @Override
                    public ListPingMonitorsResponse apply(ListPingMonitorsRequest request) {
                        return client.listPingMonitors(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link com.oracle.bmc.healthchecks.model.PingMonitorSummary} objects
     * contained in responses from the listPingMonitors operation. This iterable will fetch more data from the
     * server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link com.oracle.bmc.healthchecks.model.PingMonitorSummary} objects
     * contained in responses received from the service.
     */
    public Iterable<com.oracle.bmc.healthchecks.model.PingMonitorSummary>
            listPingMonitorsRecordIterator(final ListPingMonitorsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListPingMonitorsRequest.Builder, ListPingMonitorsRequest, ListPingMonitorsResponse,
                com.oracle.bmc.healthchecks.model.PingMonitorSummary>(
                new java.util.function.Supplier<ListPingMonitorsRequest.Builder>() {
                    @Override
                    public ListPingMonitorsRequest.Builder get() {
                        return ListPingMonitorsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListPingMonitorsResponse, String>() {
                    @Override
                    public String apply(ListPingMonitorsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListPingMonitorsRequest.Builder>,
                        ListPingMonitorsRequest>() {
                    @Override
                    public ListPingMonitorsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListPingMonitorsRequest.Builder>
                                    input) {
                        if (input.getToken() == null) {
                            return input.getRequestBuilder().build();
                        } else {
                            return input.getRequestBuilder()
                                    .page(input.getToken().orElse(null))
                                    .build();
                        }
                    }
                },
                new java.util.function.Function<
                        ListPingMonitorsRequest, ListPingMonitorsResponse>() {
                    @Override
                    public ListPingMonitorsResponse apply(ListPingMonitorsRequest request) {
                        return client.listPingMonitors(request);
                    }
                },
                new java.util.function.Function<
                        ListPingMonitorsResponse,
                        java.util.List<com.oracle.bmc.healthchecks.model.PingMonitorSummary>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.healthchecks.model.PingMonitorSummary>
                            apply(ListPingMonitorsResponse response) {
                        return response.getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the listPingProbeResults operation. This iterable
     * will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses received from the service.
     */
    public Iterable<ListPingProbeResultsResponse> listPingProbeResultsResponseIterator(
            final ListPingProbeResultsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListPingProbeResultsRequest.Builder, ListPingProbeResultsRequest,
                ListPingProbeResultsResponse>(
                new java.util.function.Supplier<ListPingProbeResultsRequest.Builder>() {
                    @Override
                    public ListPingProbeResultsRequest.Builder get() {
                        return ListPingProbeResultsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListPingProbeResultsResponse, String>() {
                    @Override
                    public String apply(ListPingProbeResultsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListPingProbeResultsRequest.Builder>,
                        ListPingProbeResultsRequest>() {
                    @Override
                    public ListPingProbeResultsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListPingProbeResultsRequest.Builder>
                                    input) {
                        if (input.getToken() == null) {
                            return input.getRequestBuilder().build();
                        } else {
                            return input.getRequestBuilder()
                                    .page(input.getToken().orElse(null))
                                    .build();
                        }
                    }
                },
                new java.util.function.Function<
                        ListPingProbeResultsRequest, ListPingProbeResultsResponse>() {
                    @Override
                    public ListPingProbeResultsResponse apply(ListPingProbeResultsRequest request) {
                        return client.listPingProbeResults(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link com.oracle.bmc.healthchecks.model.PingProbeResultSummary} objects
     * contained in responses from the listPingProbeResults operation. This iterable will fetch more data from the
     * server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link com.oracle.bmc.healthchecks.model.PingProbeResultSummary} objects
     * contained in responses received from the service.
     */
    public Iterable<com.oracle.bmc.healthchecks.model.PingProbeResultSummary>
            listPingProbeResultsRecordIterator(final ListPingProbeResultsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListPingProbeResultsRequest.Builder, ListPingProbeResultsRequest,
                ListPingProbeResultsResponse,
                com.oracle.bmc.healthchecks.model.PingProbeResultSummary>(
                new java.util.function.Supplier<ListPingProbeResultsRequest.Builder>() {
                    @Override
                    public ListPingProbeResultsRequest.Builder get() {
                        return ListPingProbeResultsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListPingProbeResultsResponse, String>() {
                    @Override
                    public String apply(ListPingProbeResultsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListPingProbeResultsRequest.Builder>,
                        ListPingProbeResultsRequest>() {
                    @Override
                    public ListPingProbeResultsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListPingProbeResultsRequest.Builder>
                                    input) {
                        if (input.getToken() == null) {
                            return input.getRequestBuilder().build();
                        } else {
                            return input.getRequestBuilder()
                                    .page(input.getToken().orElse(null))
                                    .build();
                        }
                    }
                },
                new java.util.function.Function<
                        ListPingProbeResultsRequest, ListPingProbeResultsResponse>() {
                    @Override
                    public ListPingProbeResultsResponse apply(ListPingProbeResultsRequest request) {
                        return client.listPingProbeResults(request);
                    }
                },
                new java.util.function.Function<
                        ListPingProbeResultsResponse,
                        java.util.List<
                                com.oracle.bmc.healthchecks.model.PingProbeResultSummary>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.healthchecks.model.PingProbeResultSummary>
                            apply(ListPingProbeResultsResponse response) {
                        return response.getItems();
                    }
                });
    }
}

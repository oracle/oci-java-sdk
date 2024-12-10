/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.stackmonitoring;

import com.oracle.bmc.stackmonitoring.requests.*;
import com.oracle.bmc.stackmonitoring.responses.*;

/**
 * Collection of helper methods that can be used to provide an {@link java.lang.Iterable} interface
 * to any list operations of StackMonitoring where multiple pages of data may be fetched.
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
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20210330")
public class StackMonitoringPaginators {
    private final StackMonitoring client;

    public StackMonitoringPaginators(StackMonitoring client) {
        this.client = client;
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the listBaselineableMetrics operation. This iterable
     * will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses received from the service.
     */
    public Iterable<ListBaselineableMetricsResponse> listBaselineableMetricsResponseIterator(
            final ListBaselineableMetricsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListBaselineableMetricsRequest.Builder, ListBaselineableMetricsRequest,
                ListBaselineableMetricsResponse>(
                new java.util.function.Supplier<ListBaselineableMetricsRequest.Builder>() {
                    @Override
                    public ListBaselineableMetricsRequest.Builder get() {
                        return ListBaselineableMetricsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListBaselineableMetricsResponse, String>() {
                    @Override
                    public String apply(ListBaselineableMetricsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListBaselineableMetricsRequest.Builder>,
                        ListBaselineableMetricsRequest>() {
                    @Override
                    public ListBaselineableMetricsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListBaselineableMetricsRequest.Builder>
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
                        ListBaselineableMetricsRequest, ListBaselineableMetricsResponse>() {
                    @Override
                    public ListBaselineableMetricsResponse apply(
                            ListBaselineableMetricsRequest request) {
                        return client.listBaselineableMetrics(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link com.oracle.bmc.stackmonitoring.model.BaselineableMetricSummary} objects
     * contained in responses from the listBaselineableMetrics operation. This iterable will fetch more data from the
     * server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link com.oracle.bmc.stackmonitoring.model.BaselineableMetricSummary} objects
     * contained in responses received from the service.
     */
    public Iterable<com.oracle.bmc.stackmonitoring.model.BaselineableMetricSummary>
            listBaselineableMetricsRecordIterator(final ListBaselineableMetricsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListBaselineableMetricsRequest.Builder, ListBaselineableMetricsRequest,
                ListBaselineableMetricsResponse,
                com.oracle.bmc.stackmonitoring.model.BaselineableMetricSummary>(
                new java.util.function.Supplier<ListBaselineableMetricsRequest.Builder>() {
                    @Override
                    public ListBaselineableMetricsRequest.Builder get() {
                        return ListBaselineableMetricsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListBaselineableMetricsResponse, String>() {
                    @Override
                    public String apply(ListBaselineableMetricsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListBaselineableMetricsRequest.Builder>,
                        ListBaselineableMetricsRequest>() {
                    @Override
                    public ListBaselineableMetricsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListBaselineableMetricsRequest.Builder>
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
                        ListBaselineableMetricsRequest, ListBaselineableMetricsResponse>() {
                    @Override
                    public ListBaselineableMetricsResponse apply(
                            ListBaselineableMetricsRequest request) {
                        return client.listBaselineableMetrics(request);
                    }
                },
                new java.util.function.Function<
                        ListBaselineableMetricsResponse,
                        java.util.List<
                                com.oracle.bmc.stackmonitoring.model.BaselineableMetricSummary>>() {
                    @Override
                    public java.util.List<
                                    com.oracle.bmc.stackmonitoring.model.BaselineableMetricSummary>
                            apply(ListBaselineableMetricsResponse response) {
                        return response.getBaselineableMetricSummaryCollection().getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the listConfigs operation. This iterable
     * will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses received from the service.
     */
    public Iterable<ListConfigsResponse> listConfigsResponseIterator(
            final ListConfigsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListConfigsRequest.Builder, ListConfigsRequest, ListConfigsResponse>(
                new java.util.function.Supplier<ListConfigsRequest.Builder>() {
                    @Override
                    public ListConfigsRequest.Builder get() {
                        return ListConfigsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListConfigsResponse, String>() {
                    @Override
                    public String apply(ListConfigsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListConfigsRequest.Builder>,
                        ListConfigsRequest>() {
                    @Override
                    public ListConfigsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListConfigsRequest.Builder>
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
                new java.util.function.Function<ListConfigsRequest, ListConfigsResponse>() {
                    @Override
                    public ListConfigsResponse apply(ListConfigsRequest request) {
                        return client.listConfigs(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link com.oracle.bmc.stackmonitoring.model.ConfigSummary} objects
     * contained in responses from the listConfigs operation. This iterable will fetch more data from the
     * server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link com.oracle.bmc.stackmonitoring.model.ConfigSummary} objects
     * contained in responses received from the service.
     */
    public Iterable<com.oracle.bmc.stackmonitoring.model.ConfigSummary> listConfigsRecordIterator(
            final ListConfigsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListConfigsRequest.Builder, ListConfigsRequest, ListConfigsResponse,
                com.oracle.bmc.stackmonitoring.model.ConfigSummary>(
                new java.util.function.Supplier<ListConfigsRequest.Builder>() {
                    @Override
                    public ListConfigsRequest.Builder get() {
                        return ListConfigsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListConfigsResponse, String>() {
                    @Override
                    public String apply(ListConfigsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListConfigsRequest.Builder>,
                        ListConfigsRequest>() {
                    @Override
                    public ListConfigsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListConfigsRequest.Builder>
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
                new java.util.function.Function<ListConfigsRequest, ListConfigsResponse>() {
                    @Override
                    public ListConfigsResponse apply(ListConfigsRequest request) {
                        return client.listConfigs(request);
                    }
                },
                new java.util.function.Function<
                        ListConfigsResponse,
                        java.util.List<com.oracle.bmc.stackmonitoring.model.ConfigSummary>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.stackmonitoring.model.ConfigSummary> apply(
                            ListConfigsResponse response) {
                        return response.getConfigCollection().getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the listDiscoveryJobLogs operation. This iterable
     * will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses received from the service.
     */
    public Iterable<ListDiscoveryJobLogsResponse> listDiscoveryJobLogsResponseIterator(
            final ListDiscoveryJobLogsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListDiscoveryJobLogsRequest.Builder, ListDiscoveryJobLogsRequest,
                ListDiscoveryJobLogsResponse>(
                new java.util.function.Supplier<ListDiscoveryJobLogsRequest.Builder>() {
                    @Override
                    public ListDiscoveryJobLogsRequest.Builder get() {
                        return ListDiscoveryJobLogsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListDiscoveryJobLogsResponse, String>() {
                    @Override
                    public String apply(ListDiscoveryJobLogsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListDiscoveryJobLogsRequest.Builder>,
                        ListDiscoveryJobLogsRequest>() {
                    @Override
                    public ListDiscoveryJobLogsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListDiscoveryJobLogsRequest.Builder>
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
                        ListDiscoveryJobLogsRequest, ListDiscoveryJobLogsResponse>() {
                    @Override
                    public ListDiscoveryJobLogsResponse apply(ListDiscoveryJobLogsRequest request) {
                        return client.listDiscoveryJobLogs(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link com.oracle.bmc.stackmonitoring.model.DiscoveryJobLogSummary} objects
     * contained in responses from the listDiscoveryJobLogs operation. This iterable will fetch more data from the
     * server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link com.oracle.bmc.stackmonitoring.model.DiscoveryJobLogSummary} objects
     * contained in responses received from the service.
     */
    public Iterable<com.oracle.bmc.stackmonitoring.model.DiscoveryJobLogSummary>
            listDiscoveryJobLogsRecordIterator(final ListDiscoveryJobLogsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListDiscoveryJobLogsRequest.Builder, ListDiscoveryJobLogsRequest,
                ListDiscoveryJobLogsResponse,
                com.oracle.bmc.stackmonitoring.model.DiscoveryJobLogSummary>(
                new java.util.function.Supplier<ListDiscoveryJobLogsRequest.Builder>() {
                    @Override
                    public ListDiscoveryJobLogsRequest.Builder get() {
                        return ListDiscoveryJobLogsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListDiscoveryJobLogsResponse, String>() {
                    @Override
                    public String apply(ListDiscoveryJobLogsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListDiscoveryJobLogsRequest.Builder>,
                        ListDiscoveryJobLogsRequest>() {
                    @Override
                    public ListDiscoveryJobLogsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListDiscoveryJobLogsRequest.Builder>
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
                        ListDiscoveryJobLogsRequest, ListDiscoveryJobLogsResponse>() {
                    @Override
                    public ListDiscoveryJobLogsResponse apply(ListDiscoveryJobLogsRequest request) {
                        return client.listDiscoveryJobLogs(request);
                    }
                },
                new java.util.function.Function<
                        ListDiscoveryJobLogsResponse,
                        java.util.List<
                                com.oracle.bmc.stackmonitoring.model.DiscoveryJobLogSummary>>() {
                    @Override
                    public java.util.List<
                                    com.oracle.bmc.stackmonitoring.model.DiscoveryJobLogSummary>
                            apply(ListDiscoveryJobLogsResponse response) {
                        return response.getDiscoveryJobLogCollection().getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the listDiscoveryJobs operation. This iterable
     * will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses received from the service.
     */
    public Iterable<ListDiscoveryJobsResponse> listDiscoveryJobsResponseIterator(
            final ListDiscoveryJobsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListDiscoveryJobsRequest.Builder, ListDiscoveryJobsRequest,
                ListDiscoveryJobsResponse>(
                new java.util.function.Supplier<ListDiscoveryJobsRequest.Builder>() {
                    @Override
                    public ListDiscoveryJobsRequest.Builder get() {
                        return ListDiscoveryJobsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListDiscoveryJobsResponse, String>() {
                    @Override
                    public String apply(ListDiscoveryJobsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListDiscoveryJobsRequest.Builder>,
                        ListDiscoveryJobsRequest>() {
                    @Override
                    public ListDiscoveryJobsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListDiscoveryJobsRequest.Builder>
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
                        ListDiscoveryJobsRequest, ListDiscoveryJobsResponse>() {
                    @Override
                    public ListDiscoveryJobsResponse apply(ListDiscoveryJobsRequest request) {
                        return client.listDiscoveryJobs(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link com.oracle.bmc.stackmonitoring.model.DiscoveryJobSummary} objects
     * contained in responses from the listDiscoveryJobs operation. This iterable will fetch more data from the
     * server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link com.oracle.bmc.stackmonitoring.model.DiscoveryJobSummary} objects
     * contained in responses received from the service.
     */
    public Iterable<com.oracle.bmc.stackmonitoring.model.DiscoveryJobSummary>
            listDiscoveryJobsRecordIterator(final ListDiscoveryJobsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListDiscoveryJobsRequest.Builder, ListDiscoveryJobsRequest,
                ListDiscoveryJobsResponse,
                com.oracle.bmc.stackmonitoring.model.DiscoveryJobSummary>(
                new java.util.function.Supplier<ListDiscoveryJobsRequest.Builder>() {
                    @Override
                    public ListDiscoveryJobsRequest.Builder get() {
                        return ListDiscoveryJobsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListDiscoveryJobsResponse, String>() {
                    @Override
                    public String apply(ListDiscoveryJobsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListDiscoveryJobsRequest.Builder>,
                        ListDiscoveryJobsRequest>() {
                    @Override
                    public ListDiscoveryJobsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListDiscoveryJobsRequest.Builder>
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
                        ListDiscoveryJobsRequest, ListDiscoveryJobsResponse>() {
                    @Override
                    public ListDiscoveryJobsResponse apply(ListDiscoveryJobsRequest request) {
                        return client.listDiscoveryJobs(request);
                    }
                },
                new java.util.function.Function<
                        ListDiscoveryJobsResponse,
                        java.util.List<
                                com.oracle.bmc.stackmonitoring.model.DiscoveryJobSummary>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.stackmonitoring.model.DiscoveryJobSummary>
                            apply(ListDiscoveryJobsResponse response) {
                        return response.getDiscoveryJobCollection().getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the listMaintenanceWindows operation. This iterable
     * will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses received from the service.
     */
    public Iterable<ListMaintenanceWindowsResponse> listMaintenanceWindowsResponseIterator(
            final ListMaintenanceWindowsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListMaintenanceWindowsRequest.Builder, ListMaintenanceWindowsRequest,
                ListMaintenanceWindowsResponse>(
                new java.util.function.Supplier<ListMaintenanceWindowsRequest.Builder>() {
                    @Override
                    public ListMaintenanceWindowsRequest.Builder get() {
                        return ListMaintenanceWindowsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListMaintenanceWindowsResponse, String>() {
                    @Override
                    public String apply(ListMaintenanceWindowsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListMaintenanceWindowsRequest.Builder>,
                        ListMaintenanceWindowsRequest>() {
                    @Override
                    public ListMaintenanceWindowsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListMaintenanceWindowsRequest.Builder>
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
                        ListMaintenanceWindowsRequest, ListMaintenanceWindowsResponse>() {
                    @Override
                    public ListMaintenanceWindowsResponse apply(
                            ListMaintenanceWindowsRequest request) {
                        return client.listMaintenanceWindows(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link com.oracle.bmc.stackmonitoring.model.MaintenanceWindowSummary} objects
     * contained in responses from the listMaintenanceWindows operation. This iterable will fetch more data from the
     * server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link com.oracle.bmc.stackmonitoring.model.MaintenanceWindowSummary} objects
     * contained in responses received from the service.
     */
    public Iterable<com.oracle.bmc.stackmonitoring.model.MaintenanceWindowSummary>
            listMaintenanceWindowsRecordIterator(final ListMaintenanceWindowsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListMaintenanceWindowsRequest.Builder, ListMaintenanceWindowsRequest,
                ListMaintenanceWindowsResponse,
                com.oracle.bmc.stackmonitoring.model.MaintenanceWindowSummary>(
                new java.util.function.Supplier<ListMaintenanceWindowsRequest.Builder>() {
                    @Override
                    public ListMaintenanceWindowsRequest.Builder get() {
                        return ListMaintenanceWindowsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListMaintenanceWindowsResponse, String>() {
                    @Override
                    public String apply(ListMaintenanceWindowsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListMaintenanceWindowsRequest.Builder>,
                        ListMaintenanceWindowsRequest>() {
                    @Override
                    public ListMaintenanceWindowsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListMaintenanceWindowsRequest.Builder>
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
                        ListMaintenanceWindowsRequest, ListMaintenanceWindowsResponse>() {
                    @Override
                    public ListMaintenanceWindowsResponse apply(
                            ListMaintenanceWindowsRequest request) {
                        return client.listMaintenanceWindows(request);
                    }
                },
                new java.util.function.Function<
                        ListMaintenanceWindowsResponse,
                        java.util.List<
                                com.oracle.bmc.stackmonitoring.model.MaintenanceWindowSummary>>() {
                    @Override
                    public java.util.List<
                                    com.oracle.bmc.stackmonitoring.model.MaintenanceWindowSummary>
                            apply(ListMaintenanceWindowsResponse response) {
                        return response.getMaintenanceWindowCollection().getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the listMetricExtensions operation. This iterable
     * will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses received from the service.
     */
    public Iterable<ListMetricExtensionsResponse> listMetricExtensionsResponseIterator(
            final ListMetricExtensionsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListMetricExtensionsRequest.Builder, ListMetricExtensionsRequest,
                ListMetricExtensionsResponse>(
                new java.util.function.Supplier<ListMetricExtensionsRequest.Builder>() {
                    @Override
                    public ListMetricExtensionsRequest.Builder get() {
                        return ListMetricExtensionsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListMetricExtensionsResponse, String>() {
                    @Override
                    public String apply(ListMetricExtensionsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListMetricExtensionsRequest.Builder>,
                        ListMetricExtensionsRequest>() {
                    @Override
                    public ListMetricExtensionsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListMetricExtensionsRequest.Builder>
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
                        ListMetricExtensionsRequest, ListMetricExtensionsResponse>() {
                    @Override
                    public ListMetricExtensionsResponse apply(ListMetricExtensionsRequest request) {
                        return client.listMetricExtensions(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link com.oracle.bmc.stackmonitoring.model.MetricExtensionSummary} objects
     * contained in responses from the listMetricExtensions operation. This iterable will fetch more data from the
     * server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link com.oracle.bmc.stackmonitoring.model.MetricExtensionSummary} objects
     * contained in responses received from the service.
     */
    public Iterable<com.oracle.bmc.stackmonitoring.model.MetricExtensionSummary>
            listMetricExtensionsRecordIterator(final ListMetricExtensionsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListMetricExtensionsRequest.Builder, ListMetricExtensionsRequest,
                ListMetricExtensionsResponse,
                com.oracle.bmc.stackmonitoring.model.MetricExtensionSummary>(
                new java.util.function.Supplier<ListMetricExtensionsRequest.Builder>() {
                    @Override
                    public ListMetricExtensionsRequest.Builder get() {
                        return ListMetricExtensionsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListMetricExtensionsResponse, String>() {
                    @Override
                    public String apply(ListMetricExtensionsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListMetricExtensionsRequest.Builder>,
                        ListMetricExtensionsRequest>() {
                    @Override
                    public ListMetricExtensionsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListMetricExtensionsRequest.Builder>
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
                        ListMetricExtensionsRequest, ListMetricExtensionsResponse>() {
                    @Override
                    public ListMetricExtensionsResponse apply(ListMetricExtensionsRequest request) {
                        return client.listMetricExtensions(request);
                    }
                },
                new java.util.function.Function<
                        ListMetricExtensionsResponse,
                        java.util.List<
                                com.oracle.bmc.stackmonitoring.model.MetricExtensionSummary>>() {
                    @Override
                    public java.util.List<
                                    com.oracle.bmc.stackmonitoring.model.MetricExtensionSummary>
                            apply(ListMetricExtensionsResponse response) {
                        return response.getMetricExtensionCollection().getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the listMonitoredResourceTasks operation. This iterable
     * will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses received from the service.
     */
    public Iterable<ListMonitoredResourceTasksResponse> listMonitoredResourceTasksResponseIterator(
            final ListMonitoredResourceTasksRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListMonitoredResourceTasksRequest.Builder, ListMonitoredResourceTasksRequest,
                ListMonitoredResourceTasksResponse>(
                new java.util.function.Supplier<ListMonitoredResourceTasksRequest.Builder>() {
                    @Override
                    public ListMonitoredResourceTasksRequest.Builder get() {
                        return ListMonitoredResourceTasksRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListMonitoredResourceTasksResponse, String>() {
                    @Override
                    public String apply(ListMonitoredResourceTasksResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListMonitoredResourceTasksRequest.Builder>,
                        ListMonitoredResourceTasksRequest>() {
                    @Override
                    public ListMonitoredResourceTasksRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListMonitoredResourceTasksRequest.Builder>
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
                        ListMonitoredResourceTasksRequest, ListMonitoredResourceTasksResponse>() {
                    @Override
                    public ListMonitoredResourceTasksResponse apply(
                            ListMonitoredResourceTasksRequest request) {
                        return client.listMonitoredResourceTasks(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link com.oracle.bmc.stackmonitoring.model.MonitoredResourceTaskSummary} objects
     * contained in responses from the listMonitoredResourceTasks operation. This iterable will fetch more data from the
     * server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link com.oracle.bmc.stackmonitoring.model.MonitoredResourceTaskSummary} objects
     * contained in responses received from the service.
     */
    public Iterable<com.oracle.bmc.stackmonitoring.model.MonitoredResourceTaskSummary>
            listMonitoredResourceTasksRecordIterator(
                    final ListMonitoredResourceTasksRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListMonitoredResourceTasksRequest.Builder, ListMonitoredResourceTasksRequest,
                ListMonitoredResourceTasksResponse,
                com.oracle.bmc.stackmonitoring.model.MonitoredResourceTaskSummary>(
                new java.util.function.Supplier<ListMonitoredResourceTasksRequest.Builder>() {
                    @Override
                    public ListMonitoredResourceTasksRequest.Builder get() {
                        return ListMonitoredResourceTasksRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListMonitoredResourceTasksResponse, String>() {
                    @Override
                    public String apply(ListMonitoredResourceTasksResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListMonitoredResourceTasksRequest.Builder>,
                        ListMonitoredResourceTasksRequest>() {
                    @Override
                    public ListMonitoredResourceTasksRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListMonitoredResourceTasksRequest.Builder>
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
                        ListMonitoredResourceTasksRequest, ListMonitoredResourceTasksResponse>() {
                    @Override
                    public ListMonitoredResourceTasksResponse apply(
                            ListMonitoredResourceTasksRequest request) {
                        return client.listMonitoredResourceTasks(request);
                    }
                },
                new java.util.function.Function<
                        ListMonitoredResourceTasksResponse,
                        java.util.List<
                                com.oracle.bmc.stackmonitoring.model
                                        .MonitoredResourceTaskSummary>>() {
                    @Override
                    public java.util.List<
                                    com.oracle.bmc.stackmonitoring.model
                                            .MonitoredResourceTaskSummary>
                            apply(ListMonitoredResourceTasksResponse response) {
                        return response.getMonitoredResourceTasksCollection().getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the listMonitoredResourceTypes operation. This iterable
     * will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses received from the service.
     */
    public Iterable<ListMonitoredResourceTypesResponse> listMonitoredResourceTypesResponseIterator(
            final ListMonitoredResourceTypesRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListMonitoredResourceTypesRequest.Builder, ListMonitoredResourceTypesRequest,
                ListMonitoredResourceTypesResponse>(
                new java.util.function.Supplier<ListMonitoredResourceTypesRequest.Builder>() {
                    @Override
                    public ListMonitoredResourceTypesRequest.Builder get() {
                        return ListMonitoredResourceTypesRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListMonitoredResourceTypesResponse, String>() {
                    @Override
                    public String apply(ListMonitoredResourceTypesResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListMonitoredResourceTypesRequest.Builder>,
                        ListMonitoredResourceTypesRequest>() {
                    @Override
                    public ListMonitoredResourceTypesRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListMonitoredResourceTypesRequest.Builder>
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
                        ListMonitoredResourceTypesRequest, ListMonitoredResourceTypesResponse>() {
                    @Override
                    public ListMonitoredResourceTypesResponse apply(
                            ListMonitoredResourceTypesRequest request) {
                        return client.listMonitoredResourceTypes(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link com.oracle.bmc.stackmonitoring.model.MonitoredResourceTypeSummary} objects
     * contained in responses from the listMonitoredResourceTypes operation. This iterable will fetch more data from the
     * server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link com.oracle.bmc.stackmonitoring.model.MonitoredResourceTypeSummary} objects
     * contained in responses received from the service.
     */
    public Iterable<com.oracle.bmc.stackmonitoring.model.MonitoredResourceTypeSummary>
            listMonitoredResourceTypesRecordIterator(
                    final ListMonitoredResourceTypesRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListMonitoredResourceTypesRequest.Builder, ListMonitoredResourceTypesRequest,
                ListMonitoredResourceTypesResponse,
                com.oracle.bmc.stackmonitoring.model.MonitoredResourceTypeSummary>(
                new java.util.function.Supplier<ListMonitoredResourceTypesRequest.Builder>() {
                    @Override
                    public ListMonitoredResourceTypesRequest.Builder get() {
                        return ListMonitoredResourceTypesRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListMonitoredResourceTypesResponse, String>() {
                    @Override
                    public String apply(ListMonitoredResourceTypesResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListMonitoredResourceTypesRequest.Builder>,
                        ListMonitoredResourceTypesRequest>() {
                    @Override
                    public ListMonitoredResourceTypesRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListMonitoredResourceTypesRequest.Builder>
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
                        ListMonitoredResourceTypesRequest, ListMonitoredResourceTypesResponse>() {
                    @Override
                    public ListMonitoredResourceTypesResponse apply(
                            ListMonitoredResourceTypesRequest request) {
                        return client.listMonitoredResourceTypes(request);
                    }
                },
                new java.util.function.Function<
                        ListMonitoredResourceTypesResponse,
                        java.util.List<
                                com.oracle.bmc.stackmonitoring.model
                                        .MonitoredResourceTypeSummary>>() {
                    @Override
                    public java.util.List<
                                    com.oracle.bmc.stackmonitoring.model
                                            .MonitoredResourceTypeSummary>
                            apply(ListMonitoredResourceTypesResponse response) {
                        return response.getMonitoredResourceTypesCollection().getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the listMonitoredResources operation. This iterable
     * will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses received from the service.
     */
    public Iterable<ListMonitoredResourcesResponse> listMonitoredResourcesResponseIterator(
            final ListMonitoredResourcesRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListMonitoredResourcesRequest.Builder, ListMonitoredResourcesRequest,
                ListMonitoredResourcesResponse>(
                new java.util.function.Supplier<ListMonitoredResourcesRequest.Builder>() {
                    @Override
                    public ListMonitoredResourcesRequest.Builder get() {
                        return ListMonitoredResourcesRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListMonitoredResourcesResponse, String>() {
                    @Override
                    public String apply(ListMonitoredResourcesResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListMonitoredResourcesRequest.Builder>,
                        ListMonitoredResourcesRequest>() {
                    @Override
                    public ListMonitoredResourcesRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListMonitoredResourcesRequest.Builder>
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
                        ListMonitoredResourcesRequest, ListMonitoredResourcesResponse>() {
                    @Override
                    public ListMonitoredResourcesResponse apply(
                            ListMonitoredResourcesRequest request) {
                        return client.listMonitoredResources(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link com.oracle.bmc.stackmonitoring.model.MonitoredResourceSummary} objects
     * contained in responses from the listMonitoredResources operation. This iterable will fetch more data from the
     * server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link com.oracle.bmc.stackmonitoring.model.MonitoredResourceSummary} objects
     * contained in responses received from the service.
     */
    public Iterable<com.oracle.bmc.stackmonitoring.model.MonitoredResourceSummary>
            listMonitoredResourcesRecordIterator(final ListMonitoredResourcesRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListMonitoredResourcesRequest.Builder, ListMonitoredResourcesRequest,
                ListMonitoredResourcesResponse,
                com.oracle.bmc.stackmonitoring.model.MonitoredResourceSummary>(
                new java.util.function.Supplier<ListMonitoredResourcesRequest.Builder>() {
                    @Override
                    public ListMonitoredResourcesRequest.Builder get() {
                        return ListMonitoredResourcesRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListMonitoredResourcesResponse, String>() {
                    @Override
                    public String apply(ListMonitoredResourcesResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListMonitoredResourcesRequest.Builder>,
                        ListMonitoredResourcesRequest>() {
                    @Override
                    public ListMonitoredResourcesRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListMonitoredResourcesRequest.Builder>
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
                        ListMonitoredResourcesRequest, ListMonitoredResourcesResponse>() {
                    @Override
                    public ListMonitoredResourcesResponse apply(
                            ListMonitoredResourcesRequest request) {
                        return client.listMonitoredResources(request);
                    }
                },
                new java.util.function.Function<
                        ListMonitoredResourcesResponse,
                        java.util.List<
                                com.oracle.bmc.stackmonitoring.model.MonitoredResourceSummary>>() {
                    @Override
                    public java.util.List<
                                    com.oracle.bmc.stackmonitoring.model.MonitoredResourceSummary>
                            apply(ListMonitoredResourcesResponse response) {
                        return response.getMonitoredResourceCollection().getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the listProcessSets operation. This iterable
     * will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses received from the service.
     */
    public Iterable<ListProcessSetsResponse> listProcessSetsResponseIterator(
            final ListProcessSetsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListProcessSetsRequest.Builder, ListProcessSetsRequest, ListProcessSetsResponse>(
                new java.util.function.Supplier<ListProcessSetsRequest.Builder>() {
                    @Override
                    public ListProcessSetsRequest.Builder get() {
                        return ListProcessSetsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListProcessSetsResponse, String>() {
                    @Override
                    public String apply(ListProcessSetsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListProcessSetsRequest.Builder>,
                        ListProcessSetsRequest>() {
                    @Override
                    public ListProcessSetsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListProcessSetsRequest.Builder>
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
                new java.util.function.Function<ListProcessSetsRequest, ListProcessSetsResponse>() {
                    @Override
                    public ListProcessSetsResponse apply(ListProcessSetsRequest request) {
                        return client.listProcessSets(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link com.oracle.bmc.stackmonitoring.model.ProcessSetSummary} objects
     * contained in responses from the listProcessSets operation. This iterable will fetch more data from the
     * server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link com.oracle.bmc.stackmonitoring.model.ProcessSetSummary} objects
     * contained in responses received from the service.
     */
    public Iterable<com.oracle.bmc.stackmonitoring.model.ProcessSetSummary>
            listProcessSetsRecordIterator(final ListProcessSetsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListProcessSetsRequest.Builder, ListProcessSetsRequest, ListProcessSetsResponse,
                com.oracle.bmc.stackmonitoring.model.ProcessSetSummary>(
                new java.util.function.Supplier<ListProcessSetsRequest.Builder>() {
                    @Override
                    public ListProcessSetsRequest.Builder get() {
                        return ListProcessSetsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListProcessSetsResponse, String>() {
                    @Override
                    public String apply(ListProcessSetsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListProcessSetsRequest.Builder>,
                        ListProcessSetsRequest>() {
                    @Override
                    public ListProcessSetsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListProcessSetsRequest.Builder>
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
                new java.util.function.Function<ListProcessSetsRequest, ListProcessSetsResponse>() {
                    @Override
                    public ListProcessSetsResponse apply(ListProcessSetsRequest request) {
                        return client.listProcessSets(request);
                    }
                },
                new java.util.function.Function<
                        ListProcessSetsResponse,
                        java.util.List<com.oracle.bmc.stackmonitoring.model.ProcessSetSummary>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.stackmonitoring.model.ProcessSetSummary>
                            apply(ListProcessSetsResponse response) {
                        return response.getProcessSetCollection().getItems();
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
     * Creates a new iterable which will iterate over the {@link com.oracle.bmc.stackmonitoring.model.WorkRequestError} objects
     * contained in responses from the listWorkRequestErrors operation. This iterable will fetch more data from the
     * server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link com.oracle.bmc.stackmonitoring.model.WorkRequestError} objects
     * contained in responses received from the service.
     */
    public Iterable<com.oracle.bmc.stackmonitoring.model.WorkRequestError>
            listWorkRequestErrorsRecordIterator(final ListWorkRequestErrorsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListWorkRequestErrorsRequest.Builder, ListWorkRequestErrorsRequest,
                ListWorkRequestErrorsResponse,
                com.oracle.bmc.stackmonitoring.model.WorkRequestError>(
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
                        java.util.List<com.oracle.bmc.stackmonitoring.model.WorkRequestError>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.stackmonitoring.model.WorkRequestError>
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
     * Creates a new iterable which will iterate over the {@link com.oracle.bmc.stackmonitoring.model.WorkRequestLogEntry} objects
     * contained in responses from the listWorkRequestLogs operation. This iterable will fetch more data from the
     * server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link com.oracle.bmc.stackmonitoring.model.WorkRequestLogEntry} objects
     * contained in responses received from the service.
     */
    public Iterable<com.oracle.bmc.stackmonitoring.model.WorkRequestLogEntry>
            listWorkRequestLogsRecordIterator(final ListWorkRequestLogsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListWorkRequestLogsRequest.Builder, ListWorkRequestLogsRequest,
                ListWorkRequestLogsResponse,
                com.oracle.bmc.stackmonitoring.model.WorkRequestLogEntry>(
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
                        java.util.List<
                                com.oracle.bmc.stackmonitoring.model.WorkRequestLogEntry>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.stackmonitoring.model.WorkRequestLogEntry>
                            apply(ListWorkRequestLogsResponse response) {
                        return response.getWorkRequestLogEntryCollection().getItems();
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
     * Creates a new iterable which will iterate over the {@link com.oracle.bmc.stackmonitoring.model.WorkRequestSummary} objects
     * contained in responses from the listWorkRequests operation. This iterable will fetch more data from the
     * server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link com.oracle.bmc.stackmonitoring.model.WorkRequestSummary} objects
     * contained in responses received from the service.
     */
    public Iterable<com.oracle.bmc.stackmonitoring.model.WorkRequestSummary>
            listWorkRequestsRecordIterator(final ListWorkRequestsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListWorkRequestsRequest.Builder, ListWorkRequestsRequest, ListWorkRequestsResponse,
                com.oracle.bmc.stackmonitoring.model.WorkRequestSummary>(
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
                        java.util.List<com.oracle.bmc.stackmonitoring.model.WorkRequestSummary>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.stackmonitoring.model.WorkRequestSummary>
                            apply(ListWorkRequestsResponse response) {
                        return response.getWorkRequestSummaryCollection().getItems();
                    }
                });
    }
}

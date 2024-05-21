/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.monitoring;

import com.oracle.bmc.monitoring.requests.*;
import com.oracle.bmc.monitoring.responses.*;

/**
 * Collection of helper methods that can be used to provide an {@link java.lang.Iterable} interface
 * to any list operations of Monitoring where multiple pages of data may be fetched.
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
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20180401")
public class MonitoringPaginators {
    private final Monitoring client;

    public MonitoringPaginators(Monitoring client) {
        this.client = client;
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the listAlarmSuppressions operation. This iterable
     * will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses received from the service.
     */
    public Iterable<ListAlarmSuppressionsResponse> listAlarmSuppressionsResponseIterator(
            final ListAlarmSuppressionsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListAlarmSuppressionsRequest.Builder, ListAlarmSuppressionsRequest,
                ListAlarmSuppressionsResponse>(
                new java.util.function.Supplier<ListAlarmSuppressionsRequest.Builder>() {
                    @Override
                    public ListAlarmSuppressionsRequest.Builder get() {
                        return ListAlarmSuppressionsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListAlarmSuppressionsResponse, String>() {
                    @Override
                    public String apply(ListAlarmSuppressionsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListAlarmSuppressionsRequest.Builder>,
                        ListAlarmSuppressionsRequest>() {
                    @Override
                    public ListAlarmSuppressionsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListAlarmSuppressionsRequest.Builder>
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
                        ListAlarmSuppressionsRequest, ListAlarmSuppressionsResponse>() {
                    @Override
                    public ListAlarmSuppressionsResponse apply(
                            ListAlarmSuppressionsRequest request) {
                        return client.listAlarmSuppressions(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link com.oracle.bmc.monitoring.model.AlarmSuppressionSummary} objects
     * contained in responses from the listAlarmSuppressions operation. This iterable will fetch more data from the
     * server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link com.oracle.bmc.monitoring.model.AlarmSuppressionSummary} objects
     * contained in responses received from the service.
     */
    public Iterable<com.oracle.bmc.monitoring.model.AlarmSuppressionSummary>
            listAlarmSuppressionsRecordIterator(final ListAlarmSuppressionsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListAlarmSuppressionsRequest.Builder, ListAlarmSuppressionsRequest,
                ListAlarmSuppressionsResponse,
                com.oracle.bmc.monitoring.model.AlarmSuppressionSummary>(
                new java.util.function.Supplier<ListAlarmSuppressionsRequest.Builder>() {
                    @Override
                    public ListAlarmSuppressionsRequest.Builder get() {
                        return ListAlarmSuppressionsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListAlarmSuppressionsResponse, String>() {
                    @Override
                    public String apply(ListAlarmSuppressionsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListAlarmSuppressionsRequest.Builder>,
                        ListAlarmSuppressionsRequest>() {
                    @Override
                    public ListAlarmSuppressionsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListAlarmSuppressionsRequest.Builder>
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
                        ListAlarmSuppressionsRequest, ListAlarmSuppressionsResponse>() {
                    @Override
                    public ListAlarmSuppressionsResponse apply(
                            ListAlarmSuppressionsRequest request) {
                        return client.listAlarmSuppressions(request);
                    }
                },
                new java.util.function.Function<
                        ListAlarmSuppressionsResponse,
                        java.util.List<com.oracle.bmc.monitoring.model.AlarmSuppressionSummary>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.monitoring.model.AlarmSuppressionSummary>
                            apply(ListAlarmSuppressionsResponse response) {
                        return response.getAlarmSuppressionCollection().getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the listAlarms operation. This iterable
     * will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses received from the service.
     */
    public Iterable<ListAlarmsResponse> listAlarmsResponseIterator(
            final ListAlarmsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListAlarmsRequest.Builder, ListAlarmsRequest, ListAlarmsResponse>(
                new java.util.function.Supplier<ListAlarmsRequest.Builder>() {
                    @Override
                    public ListAlarmsRequest.Builder get() {
                        return ListAlarmsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListAlarmsResponse, String>() {
                    @Override
                    public String apply(ListAlarmsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListAlarmsRequest.Builder>,
                        ListAlarmsRequest>() {
                    @Override
                    public ListAlarmsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListAlarmsRequest.Builder>
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
                new java.util.function.Function<ListAlarmsRequest, ListAlarmsResponse>() {
                    @Override
                    public ListAlarmsResponse apply(ListAlarmsRequest request) {
                        return client.listAlarms(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link com.oracle.bmc.monitoring.model.AlarmSummary} objects
     * contained in responses from the listAlarms operation. This iterable will fetch more data from the
     * server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link com.oracle.bmc.monitoring.model.AlarmSummary} objects
     * contained in responses received from the service.
     */
    public Iterable<com.oracle.bmc.monitoring.model.AlarmSummary> listAlarmsRecordIterator(
            final ListAlarmsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListAlarmsRequest.Builder, ListAlarmsRequest, ListAlarmsResponse,
                com.oracle.bmc.monitoring.model.AlarmSummary>(
                new java.util.function.Supplier<ListAlarmsRequest.Builder>() {
                    @Override
                    public ListAlarmsRequest.Builder get() {
                        return ListAlarmsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListAlarmsResponse, String>() {
                    @Override
                    public String apply(ListAlarmsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListAlarmsRequest.Builder>,
                        ListAlarmsRequest>() {
                    @Override
                    public ListAlarmsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListAlarmsRequest.Builder>
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
                new java.util.function.Function<ListAlarmsRequest, ListAlarmsResponse>() {
                    @Override
                    public ListAlarmsResponse apply(ListAlarmsRequest request) {
                        return client.listAlarms(request);
                    }
                },
                new java.util.function.Function<
                        ListAlarmsResponse,
                        java.util.List<com.oracle.bmc.monitoring.model.AlarmSummary>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.monitoring.model.AlarmSummary> apply(
                            ListAlarmsResponse response) {
                        return response.getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the listAlarmsStatus operation. This iterable
     * will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses received from the service.
     */
    public Iterable<ListAlarmsStatusResponse> listAlarmsStatusResponseIterator(
            final ListAlarmsStatusRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListAlarmsStatusRequest.Builder, ListAlarmsStatusRequest, ListAlarmsStatusResponse>(
                new java.util.function.Supplier<ListAlarmsStatusRequest.Builder>() {
                    @Override
                    public ListAlarmsStatusRequest.Builder get() {
                        return ListAlarmsStatusRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListAlarmsStatusResponse, String>() {
                    @Override
                    public String apply(ListAlarmsStatusResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListAlarmsStatusRequest.Builder>,
                        ListAlarmsStatusRequest>() {
                    @Override
                    public ListAlarmsStatusRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListAlarmsStatusRequest.Builder>
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
                        ListAlarmsStatusRequest, ListAlarmsStatusResponse>() {
                    @Override
                    public ListAlarmsStatusResponse apply(ListAlarmsStatusRequest request) {
                        return client.listAlarmsStatus(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link com.oracle.bmc.monitoring.model.AlarmStatusSummary} objects
     * contained in responses from the listAlarmsStatus operation. This iterable will fetch more data from the
     * server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link com.oracle.bmc.monitoring.model.AlarmStatusSummary} objects
     * contained in responses received from the service.
     */
    public Iterable<com.oracle.bmc.monitoring.model.AlarmStatusSummary>
            listAlarmsStatusRecordIterator(final ListAlarmsStatusRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListAlarmsStatusRequest.Builder, ListAlarmsStatusRequest, ListAlarmsStatusResponse,
                com.oracle.bmc.monitoring.model.AlarmStatusSummary>(
                new java.util.function.Supplier<ListAlarmsStatusRequest.Builder>() {
                    @Override
                    public ListAlarmsStatusRequest.Builder get() {
                        return ListAlarmsStatusRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListAlarmsStatusResponse, String>() {
                    @Override
                    public String apply(ListAlarmsStatusResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListAlarmsStatusRequest.Builder>,
                        ListAlarmsStatusRequest>() {
                    @Override
                    public ListAlarmsStatusRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListAlarmsStatusRequest.Builder>
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
                        ListAlarmsStatusRequest, ListAlarmsStatusResponse>() {
                    @Override
                    public ListAlarmsStatusResponse apply(ListAlarmsStatusRequest request) {
                        return client.listAlarmsStatus(request);
                    }
                },
                new java.util.function.Function<
                        ListAlarmsStatusResponse,
                        java.util.List<com.oracle.bmc.monitoring.model.AlarmStatusSummary>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.monitoring.model.AlarmStatusSummary> apply(
                            ListAlarmsStatusResponse response) {
                        return response.getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the listMetrics operation. This iterable
     * will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses received from the service.
     */
    public Iterable<ListMetricsResponse> listMetricsResponseIterator(
            final ListMetricsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListMetricsRequest.Builder, ListMetricsRequest, ListMetricsResponse>(
                new java.util.function.Supplier<ListMetricsRequest.Builder>() {
                    @Override
                    public ListMetricsRequest.Builder get() {
                        return ListMetricsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListMetricsResponse, String>() {
                    @Override
                    public String apply(ListMetricsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListMetricsRequest.Builder>,
                        ListMetricsRequest>() {
                    @Override
                    public ListMetricsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListMetricsRequest.Builder>
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
                new java.util.function.Function<ListMetricsRequest, ListMetricsResponse>() {
                    @Override
                    public ListMetricsResponse apply(ListMetricsRequest request) {
                        return client.listMetrics(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link com.oracle.bmc.monitoring.model.Metric} objects
     * contained in responses from the listMetrics operation. This iterable will fetch more data from the
     * server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link com.oracle.bmc.monitoring.model.Metric} objects
     * contained in responses received from the service.
     */
    public Iterable<com.oracle.bmc.monitoring.model.Metric> listMetricsRecordIterator(
            final ListMetricsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListMetricsRequest.Builder, ListMetricsRequest, ListMetricsResponse,
                com.oracle.bmc.monitoring.model.Metric>(
                new java.util.function.Supplier<ListMetricsRequest.Builder>() {
                    @Override
                    public ListMetricsRequest.Builder get() {
                        return ListMetricsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListMetricsResponse, String>() {
                    @Override
                    public String apply(ListMetricsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListMetricsRequest.Builder>,
                        ListMetricsRequest>() {
                    @Override
                    public ListMetricsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListMetricsRequest.Builder>
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
                new java.util.function.Function<ListMetricsRequest, ListMetricsResponse>() {
                    @Override
                    public ListMetricsResponse apply(ListMetricsRequest request) {
                        return client.listMetrics(request);
                    }
                },
                new java.util.function.Function<
                        ListMetricsResponse,
                        java.util.List<com.oracle.bmc.monitoring.model.Metric>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.monitoring.model.Metric> apply(
                            ListMetricsResponse response) {
                        return response.getItems();
                    }
                });
    }
}

/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.gdp;

import com.oracle.bmc.gdp.requests.*;
import com.oracle.bmc.gdp.responses.*;

/**
 * Collection of helper methods that can be used to provide an {@link java.lang.Iterable} interface
 * to any list operations of GuardedDataPipeline where multiple pages of data may be fetched.
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
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20230301")
public class GuardedDataPipelinePaginators {
    private final GuardedDataPipeline client;

    public GuardedDataPipelinePaginators(GuardedDataPipeline client) {
        this.client = client;
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the listGdpPipelines operation. This iterable
     * will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses received from the service.
     */
    public Iterable<ListGdpPipelinesResponse> listGdpPipelinesResponseIterator(
            final ListGdpPipelinesRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListGdpPipelinesRequest.Builder, ListGdpPipelinesRequest, ListGdpPipelinesResponse>(
                new java.util.function.Supplier<ListGdpPipelinesRequest.Builder>() {
                    @Override
                    public ListGdpPipelinesRequest.Builder get() {
                        return ListGdpPipelinesRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListGdpPipelinesResponse, String>() {
                    @Override
                    public String apply(ListGdpPipelinesResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListGdpPipelinesRequest.Builder>,
                        ListGdpPipelinesRequest>() {
                    @Override
                    public ListGdpPipelinesRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListGdpPipelinesRequest.Builder>
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
                        ListGdpPipelinesRequest, ListGdpPipelinesResponse>() {
                    @Override
                    public ListGdpPipelinesResponse apply(ListGdpPipelinesRequest request) {
                        return client.listGdpPipelines(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link com.oracle.bmc.gdp.model.GdpPipelineSummary} objects
     * contained in responses from the listGdpPipelines operation. This iterable will fetch more data from the
     * server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link com.oracle.bmc.gdp.model.GdpPipelineSummary} objects
     * contained in responses received from the service.
     */
    public Iterable<com.oracle.bmc.gdp.model.GdpPipelineSummary> listGdpPipelinesRecordIterator(
            final ListGdpPipelinesRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListGdpPipelinesRequest.Builder, ListGdpPipelinesRequest, ListGdpPipelinesResponse,
                com.oracle.bmc.gdp.model.GdpPipelineSummary>(
                new java.util.function.Supplier<ListGdpPipelinesRequest.Builder>() {
                    @Override
                    public ListGdpPipelinesRequest.Builder get() {
                        return ListGdpPipelinesRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListGdpPipelinesResponse, String>() {
                    @Override
                    public String apply(ListGdpPipelinesResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListGdpPipelinesRequest.Builder>,
                        ListGdpPipelinesRequest>() {
                    @Override
                    public ListGdpPipelinesRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListGdpPipelinesRequest.Builder>
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
                        ListGdpPipelinesRequest, ListGdpPipelinesResponse>() {
                    @Override
                    public ListGdpPipelinesResponse apply(ListGdpPipelinesRequest request) {
                        return client.listGdpPipelines(request);
                    }
                },
                new java.util.function.Function<
                        ListGdpPipelinesResponse,
                        java.util.List<com.oracle.bmc.gdp.model.GdpPipelineSummary>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.gdp.model.GdpPipelineSummary> apply(
                            ListGdpPipelinesResponse response) {
                        return response.getGdpPipelineCollection().getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the listGdpWorkRequestErrors operation. This iterable
     * will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses received from the service.
     */
    public Iterable<ListGdpWorkRequestErrorsResponse> listGdpWorkRequestErrorsResponseIterator(
            final ListGdpWorkRequestErrorsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListGdpWorkRequestErrorsRequest.Builder, ListGdpWorkRequestErrorsRequest,
                ListGdpWorkRequestErrorsResponse>(
                new java.util.function.Supplier<ListGdpWorkRequestErrorsRequest.Builder>() {
                    @Override
                    public ListGdpWorkRequestErrorsRequest.Builder get() {
                        return ListGdpWorkRequestErrorsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListGdpWorkRequestErrorsResponse, String>() {
                    @Override
                    public String apply(ListGdpWorkRequestErrorsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListGdpWorkRequestErrorsRequest.Builder>,
                        ListGdpWorkRequestErrorsRequest>() {
                    @Override
                    public ListGdpWorkRequestErrorsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListGdpWorkRequestErrorsRequest.Builder>
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
                        ListGdpWorkRequestErrorsRequest, ListGdpWorkRequestErrorsResponse>() {
                    @Override
                    public ListGdpWorkRequestErrorsResponse apply(
                            ListGdpWorkRequestErrorsRequest request) {
                        return client.listGdpWorkRequestErrors(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link com.oracle.bmc.gdp.model.WorkRequestError} objects
     * contained in responses from the listGdpWorkRequestErrors operation. This iterable will fetch more data from the
     * server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link com.oracle.bmc.gdp.model.WorkRequestError} objects
     * contained in responses received from the service.
     */
    public Iterable<com.oracle.bmc.gdp.model.WorkRequestError>
            listGdpWorkRequestErrorsRecordIterator(final ListGdpWorkRequestErrorsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListGdpWorkRequestErrorsRequest.Builder, ListGdpWorkRequestErrorsRequest,
                ListGdpWorkRequestErrorsResponse, com.oracle.bmc.gdp.model.WorkRequestError>(
                new java.util.function.Supplier<ListGdpWorkRequestErrorsRequest.Builder>() {
                    @Override
                    public ListGdpWorkRequestErrorsRequest.Builder get() {
                        return ListGdpWorkRequestErrorsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListGdpWorkRequestErrorsResponse, String>() {
                    @Override
                    public String apply(ListGdpWorkRequestErrorsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListGdpWorkRequestErrorsRequest.Builder>,
                        ListGdpWorkRequestErrorsRequest>() {
                    @Override
                    public ListGdpWorkRequestErrorsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListGdpWorkRequestErrorsRequest.Builder>
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
                        ListGdpWorkRequestErrorsRequest, ListGdpWorkRequestErrorsResponse>() {
                    @Override
                    public ListGdpWorkRequestErrorsResponse apply(
                            ListGdpWorkRequestErrorsRequest request) {
                        return client.listGdpWorkRequestErrors(request);
                    }
                },
                new java.util.function.Function<
                        ListGdpWorkRequestErrorsResponse,
                        java.util.List<com.oracle.bmc.gdp.model.WorkRequestError>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.gdp.model.WorkRequestError> apply(
                            ListGdpWorkRequestErrorsResponse response) {
                        return response.getWorkRequestErrorCollection().getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the listGdpWorkRequestLogs operation. This iterable
     * will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses received from the service.
     */
    public Iterable<ListGdpWorkRequestLogsResponse> listGdpWorkRequestLogsResponseIterator(
            final ListGdpWorkRequestLogsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListGdpWorkRequestLogsRequest.Builder, ListGdpWorkRequestLogsRequest,
                ListGdpWorkRequestLogsResponse>(
                new java.util.function.Supplier<ListGdpWorkRequestLogsRequest.Builder>() {
                    @Override
                    public ListGdpWorkRequestLogsRequest.Builder get() {
                        return ListGdpWorkRequestLogsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListGdpWorkRequestLogsResponse, String>() {
                    @Override
                    public String apply(ListGdpWorkRequestLogsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListGdpWorkRequestLogsRequest.Builder>,
                        ListGdpWorkRequestLogsRequest>() {
                    @Override
                    public ListGdpWorkRequestLogsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListGdpWorkRequestLogsRequest.Builder>
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
                        ListGdpWorkRequestLogsRequest, ListGdpWorkRequestLogsResponse>() {
                    @Override
                    public ListGdpWorkRequestLogsResponse apply(
                            ListGdpWorkRequestLogsRequest request) {
                        return client.listGdpWorkRequestLogs(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link com.oracle.bmc.gdp.model.WorkRequestLogEntry} objects
     * contained in responses from the listGdpWorkRequestLogs operation. This iterable will fetch more data from the
     * server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link com.oracle.bmc.gdp.model.WorkRequestLogEntry} objects
     * contained in responses received from the service.
     */
    public Iterable<com.oracle.bmc.gdp.model.WorkRequestLogEntry>
            listGdpWorkRequestLogsRecordIterator(final ListGdpWorkRequestLogsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListGdpWorkRequestLogsRequest.Builder, ListGdpWorkRequestLogsRequest,
                ListGdpWorkRequestLogsResponse, com.oracle.bmc.gdp.model.WorkRequestLogEntry>(
                new java.util.function.Supplier<ListGdpWorkRequestLogsRequest.Builder>() {
                    @Override
                    public ListGdpWorkRequestLogsRequest.Builder get() {
                        return ListGdpWorkRequestLogsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListGdpWorkRequestLogsResponse, String>() {
                    @Override
                    public String apply(ListGdpWorkRequestLogsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListGdpWorkRequestLogsRequest.Builder>,
                        ListGdpWorkRequestLogsRequest>() {
                    @Override
                    public ListGdpWorkRequestLogsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListGdpWorkRequestLogsRequest.Builder>
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
                        ListGdpWorkRequestLogsRequest, ListGdpWorkRequestLogsResponse>() {
                    @Override
                    public ListGdpWorkRequestLogsResponse apply(
                            ListGdpWorkRequestLogsRequest request) {
                        return client.listGdpWorkRequestLogs(request);
                    }
                },
                new java.util.function.Function<
                        ListGdpWorkRequestLogsResponse,
                        java.util.List<com.oracle.bmc.gdp.model.WorkRequestLogEntry>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.gdp.model.WorkRequestLogEntry> apply(
                            ListGdpWorkRequestLogsResponse response) {
                        return response.getWorkRequestLogEntryCollection().getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the listGdpWorkRequests operation. This iterable
     * will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses received from the service.
     */
    public Iterable<ListGdpWorkRequestsResponse> listGdpWorkRequestsResponseIterator(
            final ListGdpWorkRequestsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListGdpWorkRequestsRequest.Builder, ListGdpWorkRequestsRequest,
                ListGdpWorkRequestsResponse>(
                new java.util.function.Supplier<ListGdpWorkRequestsRequest.Builder>() {
                    @Override
                    public ListGdpWorkRequestsRequest.Builder get() {
                        return ListGdpWorkRequestsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListGdpWorkRequestsResponse, String>() {
                    @Override
                    public String apply(ListGdpWorkRequestsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListGdpWorkRequestsRequest.Builder>,
                        ListGdpWorkRequestsRequest>() {
                    @Override
                    public ListGdpWorkRequestsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListGdpWorkRequestsRequest.Builder>
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
                        ListGdpWorkRequestsRequest, ListGdpWorkRequestsResponse>() {
                    @Override
                    public ListGdpWorkRequestsResponse apply(ListGdpWorkRequestsRequest request) {
                        return client.listGdpWorkRequests(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link com.oracle.bmc.gdp.model.GdpWorkRequestSummary} objects
     * contained in responses from the listGdpWorkRequests operation. This iterable will fetch more data from the
     * server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link com.oracle.bmc.gdp.model.GdpWorkRequestSummary} objects
     * contained in responses received from the service.
     */
    public Iterable<com.oracle.bmc.gdp.model.GdpWorkRequestSummary>
            listGdpWorkRequestsRecordIterator(final ListGdpWorkRequestsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListGdpWorkRequestsRequest.Builder, ListGdpWorkRequestsRequest,
                ListGdpWorkRequestsResponse, com.oracle.bmc.gdp.model.GdpWorkRequestSummary>(
                new java.util.function.Supplier<ListGdpWorkRequestsRequest.Builder>() {
                    @Override
                    public ListGdpWorkRequestsRequest.Builder get() {
                        return ListGdpWorkRequestsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListGdpWorkRequestsResponse, String>() {
                    @Override
                    public String apply(ListGdpWorkRequestsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListGdpWorkRequestsRequest.Builder>,
                        ListGdpWorkRequestsRequest>() {
                    @Override
                    public ListGdpWorkRequestsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListGdpWorkRequestsRequest.Builder>
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
                        ListGdpWorkRequestsRequest, ListGdpWorkRequestsResponse>() {
                    @Override
                    public ListGdpWorkRequestsResponse apply(ListGdpWorkRequestsRequest request) {
                        return client.listGdpWorkRequests(request);
                    }
                },
                new java.util.function.Function<
                        ListGdpWorkRequestsResponse,
                        java.util.List<com.oracle.bmc.gdp.model.GdpWorkRequestSummary>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.gdp.model.GdpWorkRequestSummary> apply(
                            ListGdpWorkRequestsResponse response) {
                        return response.getGdpWorkRequestSummaryCollection().getItems();
                    }
                });
    }
}

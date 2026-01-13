/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.jmsutils;

import com.oracle.bmc.jmsutils.requests.*;
import com.oracle.bmc.jmsutils.responses.*;

/**
 * Collection of helper methods that can be used to provide an {@link java.lang.Iterable} interface
 * to any list operations of JmsUtils where multiple pages of data may be fetched. Two styles of
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
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20250521")
public class JmsUtilsPaginators {
    private final JmsUtils client;

    public JmsUtilsPaginators(JmsUtils client) {
        this.client = client;
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the
     * listJavaMigrationAnalysis operation. This iterable will fetch more data from the server as
     * needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses
     *     received from the service.
     */
    public Iterable<ListJavaMigrationAnalysisResponse> listJavaMigrationAnalysisResponseIterator(
            final ListJavaMigrationAnalysisRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListJavaMigrationAnalysisRequest.Builder,
                ListJavaMigrationAnalysisRequest,
                ListJavaMigrationAnalysisResponse>(
                new java.util.function.Supplier<ListJavaMigrationAnalysisRequest.Builder>() {
                    @Override
                    public ListJavaMigrationAnalysisRequest.Builder get() {
                        return ListJavaMigrationAnalysisRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListJavaMigrationAnalysisResponse, String>() {
                    @Override
                    public String apply(ListJavaMigrationAnalysisResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListJavaMigrationAnalysisRequest.Builder>,
                        ListJavaMigrationAnalysisRequest>() {
                    @Override
                    public ListJavaMigrationAnalysisRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListJavaMigrationAnalysisRequest.Builder>
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
                        ListJavaMigrationAnalysisRequest, ListJavaMigrationAnalysisResponse>() {
                    @Override
                    public ListJavaMigrationAnalysisResponse apply(
                            ListJavaMigrationAnalysisRequest request) {
                        return client.listJavaMigrationAnalysis(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link
     * com.oracle.bmc.jmsutils.model.JavaMigrationAnalysisSummary} objects contained in responses
     * from the listJavaMigrationAnalysis operation. This iterable will fetch more data from the
     * server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link
     *     com.oracle.bmc.jmsutils.model.JavaMigrationAnalysisSummary} objects contained in
     *     responses received from the service.
     */
    public Iterable<com.oracle.bmc.jmsutils.model.JavaMigrationAnalysisSummary>
            listJavaMigrationAnalysisRecordIterator(
                    final ListJavaMigrationAnalysisRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListJavaMigrationAnalysisRequest.Builder,
                ListJavaMigrationAnalysisRequest,
                ListJavaMigrationAnalysisResponse,
                com.oracle.bmc.jmsutils.model.JavaMigrationAnalysisSummary>(
                new java.util.function.Supplier<ListJavaMigrationAnalysisRequest.Builder>() {
                    @Override
                    public ListJavaMigrationAnalysisRequest.Builder get() {
                        return ListJavaMigrationAnalysisRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListJavaMigrationAnalysisResponse, String>() {
                    @Override
                    public String apply(ListJavaMigrationAnalysisResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListJavaMigrationAnalysisRequest.Builder>,
                        ListJavaMigrationAnalysisRequest>() {
                    @Override
                    public ListJavaMigrationAnalysisRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListJavaMigrationAnalysisRequest.Builder>
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
                        ListJavaMigrationAnalysisRequest, ListJavaMigrationAnalysisResponse>() {
                    @Override
                    public ListJavaMigrationAnalysisResponse apply(
                            ListJavaMigrationAnalysisRequest request) {
                        return client.listJavaMigrationAnalysis(request);
                    }
                },
                new java.util.function.Function<
                        ListJavaMigrationAnalysisResponse,
                        java.util.List<
                                com.oracle.bmc.jmsutils.model.JavaMigrationAnalysisSummary>>() {
                    @Override
                    public java.util.List<
                                    com.oracle.bmc.jmsutils.model.JavaMigrationAnalysisSummary>
                            apply(ListJavaMigrationAnalysisResponse response) {
                        return response.getJavaMigrationAnalysisCollection().getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the
     * listPerformanceTuningAnalysis operation. This iterable will fetch more data from the server
     * as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses
     *     received from the service.
     */
    public Iterable<ListPerformanceTuningAnalysisResponse>
            listPerformanceTuningAnalysisResponseIterator(
                    final ListPerformanceTuningAnalysisRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListPerformanceTuningAnalysisRequest.Builder,
                ListPerformanceTuningAnalysisRequest,
                ListPerformanceTuningAnalysisResponse>(
                new java.util.function.Supplier<ListPerformanceTuningAnalysisRequest.Builder>() {
                    @Override
                    public ListPerformanceTuningAnalysisRequest.Builder get() {
                        return ListPerformanceTuningAnalysisRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListPerformanceTuningAnalysisResponse, String>() {
                    @Override
                    public String apply(ListPerformanceTuningAnalysisResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListPerformanceTuningAnalysisRequest.Builder>,
                        ListPerformanceTuningAnalysisRequest>() {
                    @Override
                    public ListPerformanceTuningAnalysisRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListPerformanceTuningAnalysisRequest.Builder>
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
                        ListPerformanceTuningAnalysisRequest,
                        ListPerformanceTuningAnalysisResponse>() {
                    @Override
                    public ListPerformanceTuningAnalysisResponse apply(
                            ListPerformanceTuningAnalysisRequest request) {
                        return client.listPerformanceTuningAnalysis(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link
     * com.oracle.bmc.jmsutils.model.PerformanceTuningAnalysisSummary} objects contained in
     * responses from the listPerformanceTuningAnalysis operation. This iterable will fetch more
     * data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link
     *     com.oracle.bmc.jmsutils.model.PerformanceTuningAnalysisSummary} objects contained in
     *     responses received from the service.
     */
    public Iterable<com.oracle.bmc.jmsutils.model.PerformanceTuningAnalysisSummary>
            listPerformanceTuningAnalysisRecordIterator(
                    final ListPerformanceTuningAnalysisRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListPerformanceTuningAnalysisRequest.Builder,
                ListPerformanceTuningAnalysisRequest,
                ListPerformanceTuningAnalysisResponse,
                com.oracle.bmc.jmsutils.model.PerformanceTuningAnalysisSummary>(
                new java.util.function.Supplier<ListPerformanceTuningAnalysisRequest.Builder>() {
                    @Override
                    public ListPerformanceTuningAnalysisRequest.Builder get() {
                        return ListPerformanceTuningAnalysisRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListPerformanceTuningAnalysisResponse, String>() {
                    @Override
                    public String apply(ListPerformanceTuningAnalysisResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListPerformanceTuningAnalysisRequest.Builder>,
                        ListPerformanceTuningAnalysisRequest>() {
                    @Override
                    public ListPerformanceTuningAnalysisRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListPerformanceTuningAnalysisRequest.Builder>
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
                        ListPerformanceTuningAnalysisRequest,
                        ListPerformanceTuningAnalysisResponse>() {
                    @Override
                    public ListPerformanceTuningAnalysisResponse apply(
                            ListPerformanceTuningAnalysisRequest request) {
                        return client.listPerformanceTuningAnalysis(request);
                    }
                },
                new java.util.function.Function<
                        ListPerformanceTuningAnalysisResponse,
                        java.util.List<
                                com.oracle.bmc.jmsutils.model.PerformanceTuningAnalysisSummary>>() {
                    @Override
                    public java.util.List<
                                    com.oracle.bmc.jmsutils.model.PerformanceTuningAnalysisSummary>
                            apply(ListPerformanceTuningAnalysisResponse response) {
                        return response.getPerformanceTuningAnalysisCollection().getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the listWorkItems
     * operation. This iterable will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses
     *     received from the service.
     */
    public Iterable<ListWorkItemsResponse> listWorkItemsResponseIterator(
            final ListWorkItemsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListWorkItemsRequest.Builder, ListWorkItemsRequest, ListWorkItemsResponse>(
                new java.util.function.Supplier<ListWorkItemsRequest.Builder>() {
                    @Override
                    public ListWorkItemsRequest.Builder get() {
                        return ListWorkItemsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListWorkItemsResponse, String>() {
                    @Override
                    public String apply(ListWorkItemsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListWorkItemsRequest.Builder>,
                        ListWorkItemsRequest>() {
                    @Override
                    public ListWorkItemsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListWorkItemsRequest.Builder>
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
                new java.util.function.Function<ListWorkItemsRequest, ListWorkItemsResponse>() {
                    @Override
                    public ListWorkItemsResponse apply(ListWorkItemsRequest request) {
                        return client.listWorkItems(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link
     * com.oracle.bmc.jmsutils.model.WorkItemSummary} objects contained in responses from the
     * listWorkItems operation. This iterable will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link
     *     com.oracle.bmc.jmsutils.model.WorkItemSummary} objects contained in responses received
     *     from the service.
     */
    public Iterable<com.oracle.bmc.jmsutils.model.WorkItemSummary> listWorkItemsRecordIterator(
            final ListWorkItemsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListWorkItemsRequest.Builder,
                ListWorkItemsRequest,
                ListWorkItemsResponse,
                com.oracle.bmc.jmsutils.model.WorkItemSummary>(
                new java.util.function.Supplier<ListWorkItemsRequest.Builder>() {
                    @Override
                    public ListWorkItemsRequest.Builder get() {
                        return ListWorkItemsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListWorkItemsResponse, String>() {
                    @Override
                    public String apply(ListWorkItemsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListWorkItemsRequest.Builder>,
                        ListWorkItemsRequest>() {
                    @Override
                    public ListWorkItemsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListWorkItemsRequest.Builder>
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
                new java.util.function.Function<ListWorkItemsRequest, ListWorkItemsResponse>() {
                    @Override
                    public ListWorkItemsResponse apply(ListWorkItemsRequest request) {
                        return client.listWorkItems(request);
                    }
                },
                new java.util.function.Function<
                        ListWorkItemsResponse,
                        java.util.List<com.oracle.bmc.jmsutils.model.WorkItemSummary>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.jmsutils.model.WorkItemSummary> apply(
                            ListWorkItemsResponse response) {
                        return response.getWorkItemCollection().getItems();
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
     * com.oracle.bmc.jmsutils.model.WorkRequestError} objects contained in responses from the
     * listWorkRequestErrors operation. This iterable will fetch more data from the server as
     * needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link
     *     com.oracle.bmc.jmsutils.model.WorkRequestError} objects contained in responses received
     *     from the service.
     */
    public Iterable<com.oracle.bmc.jmsutils.model.WorkRequestError>
            listWorkRequestErrorsRecordIterator(final ListWorkRequestErrorsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListWorkRequestErrorsRequest.Builder,
                ListWorkRequestErrorsRequest,
                ListWorkRequestErrorsResponse,
                com.oracle.bmc.jmsutils.model.WorkRequestError>(
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
                        java.util.List<com.oracle.bmc.jmsutils.model.WorkRequestError>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.jmsutils.model.WorkRequestError> apply(
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
     * com.oracle.bmc.jmsutils.model.WorkRequestLogEntry} objects contained in responses from the
     * listWorkRequestLogs operation. This iterable will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link
     *     com.oracle.bmc.jmsutils.model.WorkRequestLogEntry} objects contained in responses
     *     received from the service.
     */
    public Iterable<com.oracle.bmc.jmsutils.model.WorkRequestLogEntry>
            listWorkRequestLogsRecordIterator(final ListWorkRequestLogsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListWorkRequestLogsRequest.Builder,
                ListWorkRequestLogsRequest,
                ListWorkRequestLogsResponse,
                com.oracle.bmc.jmsutils.model.WorkRequestLogEntry>(
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
                        java.util.List<com.oracle.bmc.jmsutils.model.WorkRequestLogEntry>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.jmsutils.model.WorkRequestLogEntry> apply(
                            ListWorkRequestLogsResponse response) {
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
     * com.oracle.bmc.jmsutils.model.WorkRequestSummary} objects contained in responses from the
     * listWorkRequests operation. This iterable will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link
     *     com.oracle.bmc.jmsutils.model.WorkRequestSummary} objects contained in responses received
     *     from the service.
     */
    public Iterable<com.oracle.bmc.jmsutils.model.WorkRequestSummary>
            listWorkRequestsRecordIterator(final ListWorkRequestsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListWorkRequestsRequest.Builder,
                ListWorkRequestsRequest,
                ListWorkRequestsResponse,
                com.oracle.bmc.jmsutils.model.WorkRequestSummary>(
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
                        java.util.List<com.oracle.bmc.jmsutils.model.WorkRequestSummary>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.jmsutils.model.WorkRequestSummary> apply(
                            ListWorkRequestsResponse response) {
                        return response.getWorkRequestSummaryCollection().getItems();
                    }
                });
    }
}

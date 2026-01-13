/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.managedkafka;

import com.oracle.bmc.managedkafka.requests.*;
import com.oracle.bmc.managedkafka.responses.*;

/**
 * Collection of helper methods that can be used to provide an {@link java.lang.Iterable} interface
 * to any list operations of KafkaCluster where multiple pages of data may be fetched. Two styles of
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
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20240901")
public class KafkaClusterPaginators {
    private final KafkaCluster client;

    public KafkaClusterPaginators(KafkaCluster client) {
        this.client = client;
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the
     * listKafkaClusterConfigVersions operation. This iterable will fetch more data from the server
     * as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses
     *     received from the service.
     */
    public Iterable<ListKafkaClusterConfigVersionsResponse>
            listKafkaClusterConfigVersionsResponseIterator(
                    final ListKafkaClusterConfigVersionsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListKafkaClusterConfigVersionsRequest.Builder,
                ListKafkaClusterConfigVersionsRequest,
                ListKafkaClusterConfigVersionsResponse>(
                new java.util.function.Supplier<ListKafkaClusterConfigVersionsRequest.Builder>() {
                    @Override
                    public ListKafkaClusterConfigVersionsRequest.Builder get() {
                        return ListKafkaClusterConfigVersionsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListKafkaClusterConfigVersionsResponse, String>() {
                    @Override
                    public String apply(ListKafkaClusterConfigVersionsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListKafkaClusterConfigVersionsRequest.Builder>,
                        ListKafkaClusterConfigVersionsRequest>() {
                    @Override
                    public ListKafkaClusterConfigVersionsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListKafkaClusterConfigVersionsRequest.Builder>
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
                        ListKafkaClusterConfigVersionsRequest,
                        ListKafkaClusterConfigVersionsResponse>() {
                    @Override
                    public ListKafkaClusterConfigVersionsResponse apply(
                            ListKafkaClusterConfigVersionsRequest request) {
                        return client.listKafkaClusterConfigVersions(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link
     * com.oracle.bmc.managedkafka.model.KafkaClusterConfigVersionSummary} objects contained in
     * responses from the listKafkaClusterConfigVersions operation. This iterable will fetch more
     * data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link
     *     com.oracle.bmc.managedkafka.model.KafkaClusterConfigVersionSummary} objects contained in
     *     responses received from the service.
     */
    public Iterable<com.oracle.bmc.managedkafka.model.KafkaClusterConfigVersionSummary>
            listKafkaClusterConfigVersionsRecordIterator(
                    final ListKafkaClusterConfigVersionsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListKafkaClusterConfigVersionsRequest.Builder,
                ListKafkaClusterConfigVersionsRequest,
                ListKafkaClusterConfigVersionsResponse,
                com.oracle.bmc.managedkafka.model.KafkaClusterConfigVersionSummary>(
                new java.util.function.Supplier<ListKafkaClusterConfigVersionsRequest.Builder>() {
                    @Override
                    public ListKafkaClusterConfigVersionsRequest.Builder get() {
                        return ListKafkaClusterConfigVersionsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListKafkaClusterConfigVersionsResponse, String>() {
                    @Override
                    public String apply(ListKafkaClusterConfigVersionsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListKafkaClusterConfigVersionsRequest.Builder>,
                        ListKafkaClusterConfigVersionsRequest>() {
                    @Override
                    public ListKafkaClusterConfigVersionsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListKafkaClusterConfigVersionsRequest.Builder>
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
                        ListKafkaClusterConfigVersionsRequest,
                        ListKafkaClusterConfigVersionsResponse>() {
                    @Override
                    public ListKafkaClusterConfigVersionsResponse apply(
                            ListKafkaClusterConfigVersionsRequest request) {
                        return client.listKafkaClusterConfigVersions(request);
                    }
                },
                new java.util.function.Function<
                        ListKafkaClusterConfigVersionsResponse,
                        java.util.List<
                                com.oracle.bmc.managedkafka.model
                                        .KafkaClusterConfigVersionSummary>>() {
                    @Override
                    public java.util.List<
                                    com.oracle.bmc.managedkafka.model
                                            .KafkaClusterConfigVersionSummary>
                            apply(ListKafkaClusterConfigVersionsResponse response) {
                        return response.getKafkaClusterConfigVersionCollection().getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the
     * listKafkaClusterConfigs operation. This iterable will fetch more data from the server as
     * needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses
     *     received from the service.
     */
    public Iterable<ListKafkaClusterConfigsResponse> listKafkaClusterConfigsResponseIterator(
            final ListKafkaClusterConfigsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListKafkaClusterConfigsRequest.Builder,
                ListKafkaClusterConfigsRequest,
                ListKafkaClusterConfigsResponse>(
                new java.util.function.Supplier<ListKafkaClusterConfigsRequest.Builder>() {
                    @Override
                    public ListKafkaClusterConfigsRequest.Builder get() {
                        return ListKafkaClusterConfigsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListKafkaClusterConfigsResponse, String>() {
                    @Override
                    public String apply(ListKafkaClusterConfigsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListKafkaClusterConfigsRequest.Builder>,
                        ListKafkaClusterConfigsRequest>() {
                    @Override
                    public ListKafkaClusterConfigsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListKafkaClusterConfigsRequest.Builder>
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
                        ListKafkaClusterConfigsRequest, ListKafkaClusterConfigsResponse>() {
                    @Override
                    public ListKafkaClusterConfigsResponse apply(
                            ListKafkaClusterConfigsRequest request) {
                        return client.listKafkaClusterConfigs(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link
     * com.oracle.bmc.managedkafka.model.KafkaClusterConfigSummary} objects contained in responses
     * from the listKafkaClusterConfigs operation. This iterable will fetch more data from the
     * server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link
     *     com.oracle.bmc.managedkafka.model.KafkaClusterConfigSummary} objects contained in
     *     responses received from the service.
     */
    public Iterable<com.oracle.bmc.managedkafka.model.KafkaClusterConfigSummary>
            listKafkaClusterConfigsRecordIterator(final ListKafkaClusterConfigsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListKafkaClusterConfigsRequest.Builder,
                ListKafkaClusterConfigsRequest,
                ListKafkaClusterConfigsResponse,
                com.oracle.bmc.managedkafka.model.KafkaClusterConfigSummary>(
                new java.util.function.Supplier<ListKafkaClusterConfigsRequest.Builder>() {
                    @Override
                    public ListKafkaClusterConfigsRequest.Builder get() {
                        return ListKafkaClusterConfigsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListKafkaClusterConfigsResponse, String>() {
                    @Override
                    public String apply(ListKafkaClusterConfigsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListKafkaClusterConfigsRequest.Builder>,
                        ListKafkaClusterConfigsRequest>() {
                    @Override
                    public ListKafkaClusterConfigsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListKafkaClusterConfigsRequest.Builder>
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
                        ListKafkaClusterConfigsRequest, ListKafkaClusterConfigsResponse>() {
                    @Override
                    public ListKafkaClusterConfigsResponse apply(
                            ListKafkaClusterConfigsRequest request) {
                        return client.listKafkaClusterConfigs(request);
                    }
                },
                new java.util.function.Function<
                        ListKafkaClusterConfigsResponse,
                        java.util.List<
                                com.oracle.bmc.managedkafka.model.KafkaClusterConfigSummary>>() {
                    @Override
                    public java.util.List<
                                    com.oracle.bmc.managedkafka.model.KafkaClusterConfigSummary>
                            apply(ListKafkaClusterConfigsResponse response) {
                        return response.getKafkaClusterConfigCollection().getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the
     * listKafkaClusters operation. This iterable will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses
     *     received from the service.
     */
    public Iterable<ListKafkaClustersResponse> listKafkaClustersResponseIterator(
            final ListKafkaClustersRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListKafkaClustersRequest.Builder,
                ListKafkaClustersRequest,
                ListKafkaClustersResponse>(
                new java.util.function.Supplier<ListKafkaClustersRequest.Builder>() {
                    @Override
                    public ListKafkaClustersRequest.Builder get() {
                        return ListKafkaClustersRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListKafkaClustersResponse, String>() {
                    @Override
                    public String apply(ListKafkaClustersResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListKafkaClustersRequest.Builder>,
                        ListKafkaClustersRequest>() {
                    @Override
                    public ListKafkaClustersRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListKafkaClustersRequest.Builder>
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
                        ListKafkaClustersRequest, ListKafkaClustersResponse>() {
                    @Override
                    public ListKafkaClustersResponse apply(ListKafkaClustersRequest request) {
                        return client.listKafkaClusters(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link
     * com.oracle.bmc.managedkafka.model.KafkaClusterSummary} objects contained in responses from
     * the listKafkaClusters operation. This iterable will fetch more data from the server as
     * needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link
     *     com.oracle.bmc.managedkafka.model.KafkaClusterSummary} objects contained in responses
     *     received from the service.
     */
    public Iterable<com.oracle.bmc.managedkafka.model.KafkaClusterSummary>
            listKafkaClustersRecordIterator(final ListKafkaClustersRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListKafkaClustersRequest.Builder,
                ListKafkaClustersRequest,
                ListKafkaClustersResponse,
                com.oracle.bmc.managedkafka.model.KafkaClusterSummary>(
                new java.util.function.Supplier<ListKafkaClustersRequest.Builder>() {
                    @Override
                    public ListKafkaClustersRequest.Builder get() {
                        return ListKafkaClustersRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListKafkaClustersResponse, String>() {
                    @Override
                    public String apply(ListKafkaClustersResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListKafkaClustersRequest.Builder>,
                        ListKafkaClustersRequest>() {
                    @Override
                    public ListKafkaClustersRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListKafkaClustersRequest.Builder>
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
                        ListKafkaClustersRequest, ListKafkaClustersResponse>() {
                    @Override
                    public ListKafkaClustersResponse apply(ListKafkaClustersRequest request) {
                        return client.listKafkaClusters(request);
                    }
                },
                new java.util.function.Function<
                        ListKafkaClustersResponse,
                        java.util.List<com.oracle.bmc.managedkafka.model.KafkaClusterSummary>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.managedkafka.model.KafkaClusterSummary>
                            apply(ListKafkaClustersResponse response) {
                        return response.getKafkaClusterCollection().getItems();
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
     * com.oracle.bmc.managedkafka.model.WorkRequestError} objects contained in responses from the
     * listWorkRequestErrors operation. This iterable will fetch more data from the server as
     * needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link
     *     com.oracle.bmc.managedkafka.model.WorkRequestError} objects contained in responses
     *     received from the service.
     */
    public Iterable<com.oracle.bmc.managedkafka.model.WorkRequestError>
            listWorkRequestErrorsRecordIterator(final ListWorkRequestErrorsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListWorkRequestErrorsRequest.Builder,
                ListWorkRequestErrorsRequest,
                ListWorkRequestErrorsResponse,
                com.oracle.bmc.managedkafka.model.WorkRequestError>(
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
                        java.util.List<com.oracle.bmc.managedkafka.model.WorkRequestError>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.managedkafka.model.WorkRequestError> apply(
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
     * com.oracle.bmc.managedkafka.model.WorkRequestLogEntry} objects contained in responses from
     * the listWorkRequestLogs operation. This iterable will fetch more data from the server as
     * needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link
     *     com.oracle.bmc.managedkafka.model.WorkRequestLogEntry} objects contained in responses
     *     received from the service.
     */
    public Iterable<com.oracle.bmc.managedkafka.model.WorkRequestLogEntry>
            listWorkRequestLogsRecordIterator(final ListWorkRequestLogsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListWorkRequestLogsRequest.Builder,
                ListWorkRequestLogsRequest,
                ListWorkRequestLogsResponse,
                com.oracle.bmc.managedkafka.model.WorkRequestLogEntry>(
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
                        java.util.List<com.oracle.bmc.managedkafka.model.WorkRequestLogEntry>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.managedkafka.model.WorkRequestLogEntry>
                            apply(ListWorkRequestLogsResponse response) {
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
     * com.oracle.bmc.managedkafka.model.WorkRequestSummary} objects contained in responses from the
     * listWorkRequests operation. This iterable will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link
     *     com.oracle.bmc.managedkafka.model.WorkRequestSummary} objects contained in responses
     *     received from the service.
     */
    public Iterable<com.oracle.bmc.managedkafka.model.WorkRequestSummary>
            listWorkRequestsRecordIterator(final ListWorkRequestsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListWorkRequestsRequest.Builder,
                ListWorkRequestsRequest,
                ListWorkRequestsResponse,
                com.oracle.bmc.managedkafka.model.WorkRequestSummary>(
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
                        java.util.List<com.oracle.bmc.managedkafka.model.WorkRequestSummary>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.managedkafka.model.WorkRequestSummary>
                            apply(ListWorkRequestsResponse response) {
                        return response.getWorkRequestSummaryCollection().getItems();
                    }
                });
    }
}

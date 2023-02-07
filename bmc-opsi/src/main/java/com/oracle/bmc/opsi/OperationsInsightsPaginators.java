/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.opsi;

import com.oracle.bmc.opsi.requests.*;
import com.oracle.bmc.opsi.responses.*;

/**
 * Collection of helper methods that can be used to provide an {@link java.lang.Iterable} interface
 * to any list operations of OperationsInsights where multiple pages of data may be fetched.
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
public class OperationsInsightsPaginators {
    private final OperationsInsights client;

    public OperationsInsightsPaginators(OperationsInsights client) {
        this.client = client;
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the listAwrHubs operation. This iterable
     * will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses received from the service.
     */
    public Iterable<ListAwrHubsResponse> listAwrHubsResponseIterator(
            final ListAwrHubsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListAwrHubsRequest.Builder, ListAwrHubsRequest, ListAwrHubsResponse>(
                new java.util.function.Supplier<ListAwrHubsRequest.Builder>() {
                    @Override
                    public ListAwrHubsRequest.Builder get() {
                        return ListAwrHubsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListAwrHubsResponse, String>() {
                    @Override
                    public String apply(ListAwrHubsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListAwrHubsRequest.Builder>,
                        ListAwrHubsRequest>() {
                    @Override
                    public ListAwrHubsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListAwrHubsRequest.Builder>
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
                new java.util.function.Function<ListAwrHubsRequest, ListAwrHubsResponse>() {
                    @Override
                    public ListAwrHubsResponse apply(ListAwrHubsRequest request) {
                        return client.listAwrHubs(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link com.oracle.bmc.opsi.model.AwrHubSummary} objects
     * contained in responses from the listAwrHubs operation. This iterable will fetch more data from the
     * server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link com.oracle.bmc.opsi.model.AwrHubSummary} objects
     * contained in responses received from the service.
     */
    public Iterable<com.oracle.bmc.opsi.model.AwrHubSummary> listAwrHubsRecordIterator(
            final ListAwrHubsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListAwrHubsRequest.Builder, ListAwrHubsRequest, ListAwrHubsResponse,
                com.oracle.bmc.opsi.model.AwrHubSummary>(
                new java.util.function.Supplier<ListAwrHubsRequest.Builder>() {
                    @Override
                    public ListAwrHubsRequest.Builder get() {
                        return ListAwrHubsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListAwrHubsResponse, String>() {
                    @Override
                    public String apply(ListAwrHubsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListAwrHubsRequest.Builder>,
                        ListAwrHubsRequest>() {
                    @Override
                    public ListAwrHubsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListAwrHubsRequest.Builder>
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
                new java.util.function.Function<ListAwrHubsRequest, ListAwrHubsResponse>() {
                    @Override
                    public ListAwrHubsResponse apply(ListAwrHubsRequest request) {
                        return client.listAwrHubs(request);
                    }
                },
                new java.util.function.Function<
                        ListAwrHubsResponse,
                        java.util.List<com.oracle.bmc.opsi.model.AwrHubSummary>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.opsi.model.AwrHubSummary> apply(
                            ListAwrHubsResponse response) {
                        return response.getAwrHubSummaryCollection().getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the listAwrSnapshots operation. This iterable
     * will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses received from the service.
     */
    public Iterable<ListAwrSnapshotsResponse> listAwrSnapshotsResponseIterator(
            final ListAwrSnapshotsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListAwrSnapshotsRequest.Builder, ListAwrSnapshotsRequest, ListAwrSnapshotsResponse>(
                new java.util.function.Supplier<ListAwrSnapshotsRequest.Builder>() {
                    @Override
                    public ListAwrSnapshotsRequest.Builder get() {
                        return ListAwrSnapshotsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListAwrSnapshotsResponse, String>() {
                    @Override
                    public String apply(ListAwrSnapshotsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListAwrSnapshotsRequest.Builder>,
                        ListAwrSnapshotsRequest>() {
                    @Override
                    public ListAwrSnapshotsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListAwrSnapshotsRequest.Builder>
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
                        ListAwrSnapshotsRequest, ListAwrSnapshotsResponse>() {
                    @Override
                    public ListAwrSnapshotsResponse apply(ListAwrSnapshotsRequest request) {
                        return client.listAwrSnapshots(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link com.oracle.bmc.opsi.model.AwrSnapshotSummary} objects
     * contained in responses from the listAwrSnapshots operation. This iterable will fetch more data from the
     * server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link com.oracle.bmc.opsi.model.AwrSnapshotSummary} objects
     * contained in responses received from the service.
     */
    public Iterable<com.oracle.bmc.opsi.model.AwrSnapshotSummary> listAwrSnapshotsRecordIterator(
            final ListAwrSnapshotsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListAwrSnapshotsRequest.Builder, ListAwrSnapshotsRequest, ListAwrSnapshotsResponse,
                com.oracle.bmc.opsi.model.AwrSnapshotSummary>(
                new java.util.function.Supplier<ListAwrSnapshotsRequest.Builder>() {
                    @Override
                    public ListAwrSnapshotsRequest.Builder get() {
                        return ListAwrSnapshotsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListAwrSnapshotsResponse, String>() {
                    @Override
                    public String apply(ListAwrSnapshotsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListAwrSnapshotsRequest.Builder>,
                        ListAwrSnapshotsRequest>() {
                    @Override
                    public ListAwrSnapshotsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListAwrSnapshotsRequest.Builder>
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
                        ListAwrSnapshotsRequest, ListAwrSnapshotsResponse>() {
                    @Override
                    public ListAwrSnapshotsResponse apply(ListAwrSnapshotsRequest request) {
                        return client.listAwrSnapshots(request);
                    }
                },
                new java.util.function.Function<
                        ListAwrSnapshotsResponse,
                        java.util.List<com.oracle.bmc.opsi.model.AwrSnapshotSummary>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.opsi.model.AwrSnapshotSummary> apply(
                            ListAwrSnapshotsResponse response) {
                        return response.getAwrSnapshotCollection().getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the listDatabaseConfigurations operation. This iterable
     * will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses received from the service.
     */
    public Iterable<ListDatabaseConfigurationsResponse> listDatabaseConfigurationsResponseIterator(
            final ListDatabaseConfigurationsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListDatabaseConfigurationsRequest.Builder, ListDatabaseConfigurationsRequest,
                ListDatabaseConfigurationsResponse>(
                new java.util.function.Supplier<ListDatabaseConfigurationsRequest.Builder>() {
                    @Override
                    public ListDatabaseConfigurationsRequest.Builder get() {
                        return ListDatabaseConfigurationsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListDatabaseConfigurationsResponse, String>() {
                    @Override
                    public String apply(ListDatabaseConfigurationsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListDatabaseConfigurationsRequest.Builder>,
                        ListDatabaseConfigurationsRequest>() {
                    @Override
                    public ListDatabaseConfigurationsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListDatabaseConfigurationsRequest.Builder>
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
                        ListDatabaseConfigurationsRequest, ListDatabaseConfigurationsResponse>() {
                    @Override
                    public ListDatabaseConfigurationsResponse apply(
                            ListDatabaseConfigurationsRequest request) {
                        return client.listDatabaseConfigurations(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link com.oracle.bmc.opsi.model.DatabaseConfigurationSummary} objects
     * contained in responses from the listDatabaseConfigurations operation. This iterable will fetch more data from the
     * server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link com.oracle.bmc.opsi.model.DatabaseConfigurationSummary} objects
     * contained in responses received from the service.
     */
    public Iterable<com.oracle.bmc.opsi.model.DatabaseConfigurationSummary>
            listDatabaseConfigurationsRecordIterator(
                    final ListDatabaseConfigurationsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListDatabaseConfigurationsRequest.Builder, ListDatabaseConfigurationsRequest,
                ListDatabaseConfigurationsResponse,
                com.oracle.bmc.opsi.model.DatabaseConfigurationSummary>(
                new java.util.function.Supplier<ListDatabaseConfigurationsRequest.Builder>() {
                    @Override
                    public ListDatabaseConfigurationsRequest.Builder get() {
                        return ListDatabaseConfigurationsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListDatabaseConfigurationsResponse, String>() {
                    @Override
                    public String apply(ListDatabaseConfigurationsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListDatabaseConfigurationsRequest.Builder>,
                        ListDatabaseConfigurationsRequest>() {
                    @Override
                    public ListDatabaseConfigurationsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListDatabaseConfigurationsRequest.Builder>
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
                        ListDatabaseConfigurationsRequest, ListDatabaseConfigurationsResponse>() {
                    @Override
                    public ListDatabaseConfigurationsResponse apply(
                            ListDatabaseConfigurationsRequest request) {
                        return client.listDatabaseConfigurations(request);
                    }
                },
                new java.util.function.Function<
                        ListDatabaseConfigurationsResponse,
                        java.util.List<com.oracle.bmc.opsi.model.DatabaseConfigurationSummary>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.opsi.model.DatabaseConfigurationSummary>
                            apply(ListDatabaseConfigurationsResponse response) {
                        return response.getDatabaseConfigurationCollection().getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the listDatabaseInsights operation. This iterable
     * will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses received from the service.
     */
    public Iterable<ListDatabaseInsightsResponse> listDatabaseInsightsResponseIterator(
            final ListDatabaseInsightsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListDatabaseInsightsRequest.Builder, ListDatabaseInsightsRequest,
                ListDatabaseInsightsResponse>(
                new java.util.function.Supplier<ListDatabaseInsightsRequest.Builder>() {
                    @Override
                    public ListDatabaseInsightsRequest.Builder get() {
                        return ListDatabaseInsightsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListDatabaseInsightsResponse, String>() {
                    @Override
                    public String apply(ListDatabaseInsightsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListDatabaseInsightsRequest.Builder>,
                        ListDatabaseInsightsRequest>() {
                    @Override
                    public ListDatabaseInsightsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListDatabaseInsightsRequest.Builder>
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
                        ListDatabaseInsightsRequest, ListDatabaseInsightsResponse>() {
                    @Override
                    public ListDatabaseInsightsResponse apply(ListDatabaseInsightsRequest request) {
                        return client.listDatabaseInsights(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link com.oracle.bmc.opsi.model.DatabaseInsightSummary} objects
     * contained in responses from the listDatabaseInsights operation. This iterable will fetch more data from the
     * server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link com.oracle.bmc.opsi.model.DatabaseInsightSummary} objects
     * contained in responses received from the service.
     */
    public Iterable<com.oracle.bmc.opsi.model.DatabaseInsightSummary>
            listDatabaseInsightsRecordIterator(final ListDatabaseInsightsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListDatabaseInsightsRequest.Builder, ListDatabaseInsightsRequest,
                ListDatabaseInsightsResponse, com.oracle.bmc.opsi.model.DatabaseInsightSummary>(
                new java.util.function.Supplier<ListDatabaseInsightsRequest.Builder>() {
                    @Override
                    public ListDatabaseInsightsRequest.Builder get() {
                        return ListDatabaseInsightsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListDatabaseInsightsResponse, String>() {
                    @Override
                    public String apply(ListDatabaseInsightsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListDatabaseInsightsRequest.Builder>,
                        ListDatabaseInsightsRequest>() {
                    @Override
                    public ListDatabaseInsightsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListDatabaseInsightsRequest.Builder>
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
                        ListDatabaseInsightsRequest, ListDatabaseInsightsResponse>() {
                    @Override
                    public ListDatabaseInsightsResponse apply(ListDatabaseInsightsRequest request) {
                        return client.listDatabaseInsights(request);
                    }
                },
                new java.util.function.Function<
                        ListDatabaseInsightsResponse,
                        java.util.List<com.oracle.bmc.opsi.model.DatabaseInsightSummary>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.opsi.model.DatabaseInsightSummary> apply(
                            ListDatabaseInsightsResponse response) {
                        return response.getDatabaseInsightsCollection().getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the listEnterpriseManagerBridges operation. This iterable
     * will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses received from the service.
     */
    public Iterable<ListEnterpriseManagerBridgesResponse>
            listEnterpriseManagerBridgesResponseIterator(
                    final ListEnterpriseManagerBridgesRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListEnterpriseManagerBridgesRequest.Builder, ListEnterpriseManagerBridgesRequest,
                ListEnterpriseManagerBridgesResponse>(
                new java.util.function.Supplier<ListEnterpriseManagerBridgesRequest.Builder>() {
                    @Override
                    public ListEnterpriseManagerBridgesRequest.Builder get() {
                        return ListEnterpriseManagerBridgesRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListEnterpriseManagerBridgesResponse, String>() {
                    @Override
                    public String apply(ListEnterpriseManagerBridgesResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListEnterpriseManagerBridgesRequest.Builder>,
                        ListEnterpriseManagerBridgesRequest>() {
                    @Override
                    public ListEnterpriseManagerBridgesRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListEnterpriseManagerBridgesRequest.Builder>
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
                        ListEnterpriseManagerBridgesRequest,
                        ListEnterpriseManagerBridgesResponse>() {
                    @Override
                    public ListEnterpriseManagerBridgesResponse apply(
                            ListEnterpriseManagerBridgesRequest request) {
                        return client.listEnterpriseManagerBridges(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link com.oracle.bmc.opsi.model.EnterpriseManagerBridgeSummary} objects
     * contained in responses from the listEnterpriseManagerBridges operation. This iterable will fetch more data from the
     * server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link com.oracle.bmc.opsi.model.EnterpriseManagerBridgeSummary} objects
     * contained in responses received from the service.
     */
    public Iterable<com.oracle.bmc.opsi.model.EnterpriseManagerBridgeSummary>
            listEnterpriseManagerBridgesRecordIterator(
                    final ListEnterpriseManagerBridgesRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListEnterpriseManagerBridgesRequest.Builder, ListEnterpriseManagerBridgesRequest,
                ListEnterpriseManagerBridgesResponse,
                com.oracle.bmc.opsi.model.EnterpriseManagerBridgeSummary>(
                new java.util.function.Supplier<ListEnterpriseManagerBridgesRequest.Builder>() {
                    @Override
                    public ListEnterpriseManagerBridgesRequest.Builder get() {
                        return ListEnterpriseManagerBridgesRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListEnterpriseManagerBridgesResponse, String>() {
                    @Override
                    public String apply(ListEnterpriseManagerBridgesResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListEnterpriseManagerBridgesRequest.Builder>,
                        ListEnterpriseManagerBridgesRequest>() {
                    @Override
                    public ListEnterpriseManagerBridgesRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListEnterpriseManagerBridgesRequest.Builder>
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
                        ListEnterpriseManagerBridgesRequest,
                        ListEnterpriseManagerBridgesResponse>() {
                    @Override
                    public ListEnterpriseManagerBridgesResponse apply(
                            ListEnterpriseManagerBridgesRequest request) {
                        return client.listEnterpriseManagerBridges(request);
                    }
                },
                new java.util.function.Function<
                        ListEnterpriseManagerBridgesResponse,
                        java.util.List<
                                com.oracle.bmc.opsi.model.EnterpriseManagerBridgeSummary>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.opsi.model.EnterpriseManagerBridgeSummary>
                            apply(ListEnterpriseManagerBridgesResponse response) {
                        return response.getEnterpriseManagerBridgeCollection().getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the listExadataConfigurations operation. This iterable
     * will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses received from the service.
     */
    public Iterable<ListExadataConfigurationsResponse> listExadataConfigurationsResponseIterator(
            final ListExadataConfigurationsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListExadataConfigurationsRequest.Builder, ListExadataConfigurationsRequest,
                ListExadataConfigurationsResponse>(
                new java.util.function.Supplier<ListExadataConfigurationsRequest.Builder>() {
                    @Override
                    public ListExadataConfigurationsRequest.Builder get() {
                        return ListExadataConfigurationsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListExadataConfigurationsResponse, String>() {
                    @Override
                    public String apply(ListExadataConfigurationsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListExadataConfigurationsRequest.Builder>,
                        ListExadataConfigurationsRequest>() {
                    @Override
                    public ListExadataConfigurationsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListExadataConfigurationsRequest.Builder>
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
                        ListExadataConfigurationsRequest, ListExadataConfigurationsResponse>() {
                    @Override
                    public ListExadataConfigurationsResponse apply(
                            ListExadataConfigurationsRequest request) {
                        return client.listExadataConfigurations(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link com.oracle.bmc.opsi.model.ExadataConfigurationSummary} objects
     * contained in responses from the listExadataConfigurations operation. This iterable will fetch more data from the
     * server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link com.oracle.bmc.opsi.model.ExadataConfigurationSummary} objects
     * contained in responses received from the service.
     */
    public Iterable<com.oracle.bmc.opsi.model.ExadataConfigurationSummary>
            listExadataConfigurationsRecordIterator(
                    final ListExadataConfigurationsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListExadataConfigurationsRequest.Builder, ListExadataConfigurationsRequest,
                ListExadataConfigurationsResponse,
                com.oracle.bmc.opsi.model.ExadataConfigurationSummary>(
                new java.util.function.Supplier<ListExadataConfigurationsRequest.Builder>() {
                    @Override
                    public ListExadataConfigurationsRequest.Builder get() {
                        return ListExadataConfigurationsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListExadataConfigurationsResponse, String>() {
                    @Override
                    public String apply(ListExadataConfigurationsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListExadataConfigurationsRequest.Builder>,
                        ListExadataConfigurationsRequest>() {
                    @Override
                    public ListExadataConfigurationsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListExadataConfigurationsRequest.Builder>
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
                        ListExadataConfigurationsRequest, ListExadataConfigurationsResponse>() {
                    @Override
                    public ListExadataConfigurationsResponse apply(
                            ListExadataConfigurationsRequest request) {
                        return client.listExadataConfigurations(request);
                    }
                },
                new java.util.function.Function<
                        ListExadataConfigurationsResponse,
                        java.util.List<com.oracle.bmc.opsi.model.ExadataConfigurationSummary>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.opsi.model.ExadataConfigurationSummary>
                            apply(ListExadataConfigurationsResponse response) {
                        return response.getExadataConfigurationCollection().getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the listExadataInsights operation. This iterable
     * will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses received from the service.
     */
    public Iterable<ListExadataInsightsResponse> listExadataInsightsResponseIterator(
            final ListExadataInsightsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListExadataInsightsRequest.Builder, ListExadataInsightsRequest,
                ListExadataInsightsResponse>(
                new java.util.function.Supplier<ListExadataInsightsRequest.Builder>() {
                    @Override
                    public ListExadataInsightsRequest.Builder get() {
                        return ListExadataInsightsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListExadataInsightsResponse, String>() {
                    @Override
                    public String apply(ListExadataInsightsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListExadataInsightsRequest.Builder>,
                        ListExadataInsightsRequest>() {
                    @Override
                    public ListExadataInsightsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListExadataInsightsRequest.Builder>
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
                        ListExadataInsightsRequest, ListExadataInsightsResponse>() {
                    @Override
                    public ListExadataInsightsResponse apply(ListExadataInsightsRequest request) {
                        return client.listExadataInsights(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link com.oracle.bmc.opsi.model.ExadataInsightSummary} objects
     * contained in responses from the listExadataInsights operation. This iterable will fetch more data from the
     * server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link com.oracle.bmc.opsi.model.ExadataInsightSummary} objects
     * contained in responses received from the service.
     */
    public Iterable<com.oracle.bmc.opsi.model.ExadataInsightSummary>
            listExadataInsightsRecordIterator(final ListExadataInsightsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListExadataInsightsRequest.Builder, ListExadataInsightsRequest,
                ListExadataInsightsResponse, com.oracle.bmc.opsi.model.ExadataInsightSummary>(
                new java.util.function.Supplier<ListExadataInsightsRequest.Builder>() {
                    @Override
                    public ListExadataInsightsRequest.Builder get() {
                        return ListExadataInsightsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListExadataInsightsResponse, String>() {
                    @Override
                    public String apply(ListExadataInsightsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListExadataInsightsRequest.Builder>,
                        ListExadataInsightsRequest>() {
                    @Override
                    public ListExadataInsightsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListExadataInsightsRequest.Builder>
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
                        ListExadataInsightsRequest, ListExadataInsightsResponse>() {
                    @Override
                    public ListExadataInsightsResponse apply(ListExadataInsightsRequest request) {
                        return client.listExadataInsights(request);
                    }
                },
                new java.util.function.Function<
                        ListExadataInsightsResponse,
                        java.util.List<com.oracle.bmc.opsi.model.ExadataInsightSummary>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.opsi.model.ExadataInsightSummary> apply(
                            ListExadataInsightsResponse response) {
                        return response.getExadataInsightSummaryCollection().getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the listHostConfigurations operation. This iterable
     * will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses received from the service.
     */
    public Iterable<ListHostConfigurationsResponse> listHostConfigurationsResponseIterator(
            final ListHostConfigurationsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListHostConfigurationsRequest.Builder, ListHostConfigurationsRequest,
                ListHostConfigurationsResponse>(
                new java.util.function.Supplier<ListHostConfigurationsRequest.Builder>() {
                    @Override
                    public ListHostConfigurationsRequest.Builder get() {
                        return ListHostConfigurationsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListHostConfigurationsResponse, String>() {
                    @Override
                    public String apply(ListHostConfigurationsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListHostConfigurationsRequest.Builder>,
                        ListHostConfigurationsRequest>() {
                    @Override
                    public ListHostConfigurationsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListHostConfigurationsRequest.Builder>
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
                        ListHostConfigurationsRequest, ListHostConfigurationsResponse>() {
                    @Override
                    public ListHostConfigurationsResponse apply(
                            ListHostConfigurationsRequest request) {
                        return client.listHostConfigurations(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link com.oracle.bmc.opsi.model.HostConfigurationSummary} objects
     * contained in responses from the listHostConfigurations operation. This iterable will fetch more data from the
     * server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link com.oracle.bmc.opsi.model.HostConfigurationSummary} objects
     * contained in responses received from the service.
     */
    public Iterable<com.oracle.bmc.opsi.model.HostConfigurationSummary>
            listHostConfigurationsRecordIterator(final ListHostConfigurationsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListHostConfigurationsRequest.Builder, ListHostConfigurationsRequest,
                ListHostConfigurationsResponse, com.oracle.bmc.opsi.model.HostConfigurationSummary>(
                new java.util.function.Supplier<ListHostConfigurationsRequest.Builder>() {
                    @Override
                    public ListHostConfigurationsRequest.Builder get() {
                        return ListHostConfigurationsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListHostConfigurationsResponse, String>() {
                    @Override
                    public String apply(ListHostConfigurationsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListHostConfigurationsRequest.Builder>,
                        ListHostConfigurationsRequest>() {
                    @Override
                    public ListHostConfigurationsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListHostConfigurationsRequest.Builder>
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
                        ListHostConfigurationsRequest, ListHostConfigurationsResponse>() {
                    @Override
                    public ListHostConfigurationsResponse apply(
                            ListHostConfigurationsRequest request) {
                        return client.listHostConfigurations(request);
                    }
                },
                new java.util.function.Function<
                        ListHostConfigurationsResponse,
                        java.util.List<com.oracle.bmc.opsi.model.HostConfigurationSummary>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.opsi.model.HostConfigurationSummary> apply(
                            ListHostConfigurationsResponse response) {
                        return response.getHostConfigurationCollection().getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the listHostInsights operation. This iterable
     * will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses received from the service.
     */
    public Iterable<ListHostInsightsResponse> listHostInsightsResponseIterator(
            final ListHostInsightsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListHostInsightsRequest.Builder, ListHostInsightsRequest, ListHostInsightsResponse>(
                new java.util.function.Supplier<ListHostInsightsRequest.Builder>() {
                    @Override
                    public ListHostInsightsRequest.Builder get() {
                        return ListHostInsightsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListHostInsightsResponse, String>() {
                    @Override
                    public String apply(ListHostInsightsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListHostInsightsRequest.Builder>,
                        ListHostInsightsRequest>() {
                    @Override
                    public ListHostInsightsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListHostInsightsRequest.Builder>
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
                        ListHostInsightsRequest, ListHostInsightsResponse>() {
                    @Override
                    public ListHostInsightsResponse apply(ListHostInsightsRequest request) {
                        return client.listHostInsights(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link com.oracle.bmc.opsi.model.HostInsightSummary} objects
     * contained in responses from the listHostInsights operation. This iterable will fetch more data from the
     * server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link com.oracle.bmc.opsi.model.HostInsightSummary} objects
     * contained in responses received from the service.
     */
    public Iterable<com.oracle.bmc.opsi.model.HostInsightSummary> listHostInsightsRecordIterator(
            final ListHostInsightsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListHostInsightsRequest.Builder, ListHostInsightsRequest, ListHostInsightsResponse,
                com.oracle.bmc.opsi.model.HostInsightSummary>(
                new java.util.function.Supplier<ListHostInsightsRequest.Builder>() {
                    @Override
                    public ListHostInsightsRequest.Builder get() {
                        return ListHostInsightsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListHostInsightsResponse, String>() {
                    @Override
                    public String apply(ListHostInsightsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListHostInsightsRequest.Builder>,
                        ListHostInsightsRequest>() {
                    @Override
                    public ListHostInsightsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListHostInsightsRequest.Builder>
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
                        ListHostInsightsRequest, ListHostInsightsResponse>() {
                    @Override
                    public ListHostInsightsResponse apply(ListHostInsightsRequest request) {
                        return client.listHostInsights(request);
                    }
                },
                new java.util.function.Function<
                        ListHostInsightsResponse,
                        java.util.List<com.oracle.bmc.opsi.model.HostInsightSummary>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.opsi.model.HostInsightSummary> apply(
                            ListHostInsightsResponse response) {
                        return response.getHostInsightSummaryCollection().getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the listHostedEntities operation. This iterable
     * will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses received from the service.
     */
    public Iterable<ListHostedEntitiesResponse> listHostedEntitiesResponseIterator(
            final ListHostedEntitiesRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListHostedEntitiesRequest.Builder, ListHostedEntitiesRequest,
                ListHostedEntitiesResponse>(
                new java.util.function.Supplier<ListHostedEntitiesRequest.Builder>() {
                    @Override
                    public ListHostedEntitiesRequest.Builder get() {
                        return ListHostedEntitiesRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListHostedEntitiesResponse, String>() {
                    @Override
                    public String apply(ListHostedEntitiesResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListHostedEntitiesRequest.Builder>,
                        ListHostedEntitiesRequest>() {
                    @Override
                    public ListHostedEntitiesRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListHostedEntitiesRequest.Builder>
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
                        ListHostedEntitiesRequest, ListHostedEntitiesResponse>() {
                    @Override
                    public ListHostedEntitiesResponse apply(ListHostedEntitiesRequest request) {
                        return client.listHostedEntities(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link com.oracle.bmc.opsi.model.HostedEntitySummary} objects
     * contained in responses from the listHostedEntities operation. This iterable will fetch more data from the
     * server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link com.oracle.bmc.opsi.model.HostedEntitySummary} objects
     * contained in responses received from the service.
     */
    public Iterable<com.oracle.bmc.opsi.model.HostedEntitySummary> listHostedEntitiesRecordIterator(
            final ListHostedEntitiesRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListHostedEntitiesRequest.Builder, ListHostedEntitiesRequest,
                ListHostedEntitiesResponse, com.oracle.bmc.opsi.model.HostedEntitySummary>(
                new java.util.function.Supplier<ListHostedEntitiesRequest.Builder>() {
                    @Override
                    public ListHostedEntitiesRequest.Builder get() {
                        return ListHostedEntitiesRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListHostedEntitiesResponse, String>() {
                    @Override
                    public String apply(ListHostedEntitiesResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListHostedEntitiesRequest.Builder>,
                        ListHostedEntitiesRequest>() {
                    @Override
                    public ListHostedEntitiesRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListHostedEntitiesRequest.Builder>
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
                        ListHostedEntitiesRequest, ListHostedEntitiesResponse>() {
                    @Override
                    public ListHostedEntitiesResponse apply(ListHostedEntitiesRequest request) {
                        return client.listHostedEntities(request);
                    }
                },
                new java.util.function.Function<
                        ListHostedEntitiesResponse,
                        java.util.List<com.oracle.bmc.opsi.model.HostedEntitySummary>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.opsi.model.HostedEntitySummary> apply(
                            ListHostedEntitiesResponse response) {
                        return response.getHostedEntityCollection().getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the listImportableAgentEntities operation. This iterable
     * will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses received from the service.
     */
    public Iterable<ListImportableAgentEntitiesResponse>
            listImportableAgentEntitiesResponseIterator(
                    final ListImportableAgentEntitiesRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListImportableAgentEntitiesRequest.Builder, ListImportableAgentEntitiesRequest,
                ListImportableAgentEntitiesResponse>(
                new java.util.function.Supplier<ListImportableAgentEntitiesRequest.Builder>() {
                    @Override
                    public ListImportableAgentEntitiesRequest.Builder get() {
                        return ListImportableAgentEntitiesRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListImportableAgentEntitiesResponse, String>() {
                    @Override
                    public String apply(ListImportableAgentEntitiesResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListImportableAgentEntitiesRequest.Builder>,
                        ListImportableAgentEntitiesRequest>() {
                    @Override
                    public ListImportableAgentEntitiesRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListImportableAgentEntitiesRequest.Builder>
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
                        ListImportableAgentEntitiesRequest, ListImportableAgentEntitiesResponse>() {
                    @Override
                    public ListImportableAgentEntitiesResponse apply(
                            ListImportableAgentEntitiesRequest request) {
                        return client.listImportableAgentEntities(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link com.oracle.bmc.opsi.model.ImportableAgentEntitySummary} objects
     * contained in responses from the listImportableAgentEntities operation. This iterable will fetch more data from the
     * server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link com.oracle.bmc.opsi.model.ImportableAgentEntitySummary} objects
     * contained in responses received from the service.
     */
    public Iterable<com.oracle.bmc.opsi.model.ImportableAgentEntitySummary>
            listImportableAgentEntitiesRecordIterator(
                    final ListImportableAgentEntitiesRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListImportableAgentEntitiesRequest.Builder, ListImportableAgentEntitiesRequest,
                ListImportableAgentEntitiesResponse,
                com.oracle.bmc.opsi.model.ImportableAgentEntitySummary>(
                new java.util.function.Supplier<ListImportableAgentEntitiesRequest.Builder>() {
                    @Override
                    public ListImportableAgentEntitiesRequest.Builder get() {
                        return ListImportableAgentEntitiesRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListImportableAgentEntitiesResponse, String>() {
                    @Override
                    public String apply(ListImportableAgentEntitiesResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListImportableAgentEntitiesRequest.Builder>,
                        ListImportableAgentEntitiesRequest>() {
                    @Override
                    public ListImportableAgentEntitiesRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListImportableAgentEntitiesRequest.Builder>
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
                        ListImportableAgentEntitiesRequest, ListImportableAgentEntitiesResponse>() {
                    @Override
                    public ListImportableAgentEntitiesResponse apply(
                            ListImportableAgentEntitiesRequest request) {
                        return client.listImportableAgentEntities(request);
                    }
                },
                new java.util.function.Function<
                        ListImportableAgentEntitiesResponse,
                        java.util.List<com.oracle.bmc.opsi.model.ImportableAgentEntitySummary>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.opsi.model.ImportableAgentEntitySummary>
                            apply(ListImportableAgentEntitiesResponse response) {
                        return response.getImportableAgentEntitySummaryCollection().getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the listImportableComputeEntities operation. This iterable
     * will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses received from the service.
     */
    public Iterable<ListImportableComputeEntitiesResponse>
            listImportableComputeEntitiesResponseIterator(
                    final ListImportableComputeEntitiesRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListImportableComputeEntitiesRequest.Builder, ListImportableComputeEntitiesRequest,
                ListImportableComputeEntitiesResponse>(
                new java.util.function.Supplier<ListImportableComputeEntitiesRequest.Builder>() {
                    @Override
                    public ListImportableComputeEntitiesRequest.Builder get() {
                        return ListImportableComputeEntitiesRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListImportableComputeEntitiesResponse, String>() {
                    @Override
                    public String apply(ListImportableComputeEntitiesResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListImportableComputeEntitiesRequest.Builder>,
                        ListImportableComputeEntitiesRequest>() {
                    @Override
                    public ListImportableComputeEntitiesRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListImportableComputeEntitiesRequest.Builder>
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
                        ListImportableComputeEntitiesRequest,
                        ListImportableComputeEntitiesResponse>() {
                    @Override
                    public ListImportableComputeEntitiesResponse apply(
                            ListImportableComputeEntitiesRequest request) {
                        return client.listImportableComputeEntities(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link com.oracle.bmc.opsi.model.ImportableComputeEntitySummary} objects
     * contained in responses from the listImportableComputeEntities operation. This iterable will fetch more data from the
     * server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link com.oracle.bmc.opsi.model.ImportableComputeEntitySummary} objects
     * contained in responses received from the service.
     */
    public Iterable<com.oracle.bmc.opsi.model.ImportableComputeEntitySummary>
            listImportableComputeEntitiesRecordIterator(
                    final ListImportableComputeEntitiesRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListImportableComputeEntitiesRequest.Builder, ListImportableComputeEntitiesRequest,
                ListImportableComputeEntitiesResponse,
                com.oracle.bmc.opsi.model.ImportableComputeEntitySummary>(
                new java.util.function.Supplier<ListImportableComputeEntitiesRequest.Builder>() {
                    @Override
                    public ListImportableComputeEntitiesRequest.Builder get() {
                        return ListImportableComputeEntitiesRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListImportableComputeEntitiesResponse, String>() {
                    @Override
                    public String apply(ListImportableComputeEntitiesResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListImportableComputeEntitiesRequest.Builder>,
                        ListImportableComputeEntitiesRequest>() {
                    @Override
                    public ListImportableComputeEntitiesRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListImportableComputeEntitiesRequest.Builder>
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
                        ListImportableComputeEntitiesRequest,
                        ListImportableComputeEntitiesResponse>() {
                    @Override
                    public ListImportableComputeEntitiesResponse apply(
                            ListImportableComputeEntitiesRequest request) {
                        return client.listImportableComputeEntities(request);
                    }
                },
                new java.util.function.Function<
                        ListImportableComputeEntitiesResponse,
                        java.util.List<
                                com.oracle.bmc.opsi.model.ImportableComputeEntitySummary>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.opsi.model.ImportableComputeEntitySummary>
                            apply(ListImportableComputeEntitiesResponse response) {
                        return response.getImportableComputeEntitySummaryCollection().getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the listImportableEnterpriseManagerEntities operation. This iterable
     * will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses received from the service.
     */
    public Iterable<ListImportableEnterpriseManagerEntitiesResponse>
            listImportableEnterpriseManagerEntitiesResponseIterator(
                    final ListImportableEnterpriseManagerEntitiesRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListImportableEnterpriseManagerEntitiesRequest.Builder,
                ListImportableEnterpriseManagerEntitiesRequest,
                ListImportableEnterpriseManagerEntitiesResponse>(
                new java.util.function.Supplier<
                        ListImportableEnterpriseManagerEntitiesRequest.Builder>() {
                    @Override
                    public ListImportableEnterpriseManagerEntitiesRequest.Builder get() {
                        return ListImportableEnterpriseManagerEntitiesRequest.builder()
                                .copy(request);
                    }
                },
                new java.util.function.Function<
                        ListImportableEnterpriseManagerEntitiesResponse, String>() {
                    @Override
                    public String apply(ListImportableEnterpriseManagerEntitiesResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListImportableEnterpriseManagerEntitiesRequest.Builder>,
                        ListImportableEnterpriseManagerEntitiesRequest>() {
                    @Override
                    public ListImportableEnterpriseManagerEntitiesRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListImportableEnterpriseManagerEntitiesRequest.Builder>
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
                        ListImportableEnterpriseManagerEntitiesRequest,
                        ListImportableEnterpriseManagerEntitiesResponse>() {
                    @Override
                    public ListImportableEnterpriseManagerEntitiesResponse apply(
                            ListImportableEnterpriseManagerEntitiesRequest request) {
                        return client.listImportableEnterpriseManagerEntities(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link com.oracle.bmc.opsi.model.ImportableEnterpriseManagerEntity} objects
     * contained in responses from the listImportableEnterpriseManagerEntities operation. This iterable will fetch more data from the
     * server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link com.oracle.bmc.opsi.model.ImportableEnterpriseManagerEntity} objects
     * contained in responses received from the service.
     */
    public Iterable<com.oracle.bmc.opsi.model.ImportableEnterpriseManagerEntity>
            listImportableEnterpriseManagerEntitiesRecordIterator(
                    final ListImportableEnterpriseManagerEntitiesRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListImportableEnterpriseManagerEntitiesRequest.Builder,
                ListImportableEnterpriseManagerEntitiesRequest,
                ListImportableEnterpriseManagerEntitiesResponse,
                com.oracle.bmc.opsi.model.ImportableEnterpriseManagerEntity>(
                new java.util.function.Supplier<
                        ListImportableEnterpriseManagerEntitiesRequest.Builder>() {
                    @Override
                    public ListImportableEnterpriseManagerEntitiesRequest.Builder get() {
                        return ListImportableEnterpriseManagerEntitiesRequest.builder()
                                .copy(request);
                    }
                },
                new java.util.function.Function<
                        ListImportableEnterpriseManagerEntitiesResponse, String>() {
                    @Override
                    public String apply(ListImportableEnterpriseManagerEntitiesResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListImportableEnterpriseManagerEntitiesRequest.Builder>,
                        ListImportableEnterpriseManagerEntitiesRequest>() {
                    @Override
                    public ListImportableEnterpriseManagerEntitiesRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListImportableEnterpriseManagerEntitiesRequest.Builder>
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
                        ListImportableEnterpriseManagerEntitiesRequest,
                        ListImportableEnterpriseManagerEntitiesResponse>() {
                    @Override
                    public ListImportableEnterpriseManagerEntitiesResponse apply(
                            ListImportableEnterpriseManagerEntitiesRequest request) {
                        return client.listImportableEnterpriseManagerEntities(request);
                    }
                },
                new java.util.function.Function<
                        ListImportableEnterpriseManagerEntitiesResponse,
                        java.util.List<
                                com.oracle.bmc.opsi.model.ImportableEnterpriseManagerEntity>>() {
                    @Override
                    public java.util.List<
                                    com.oracle.bmc.opsi.model.ImportableEnterpriseManagerEntity>
                            apply(ListImportableEnterpriseManagerEntitiesResponse response) {
                        return response.getImportableEnterpriseManagerEntityCollection().getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the listOperationsInsightsPrivateEndpoints operation. This iterable
     * will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses received from the service.
     */
    public Iterable<ListOperationsInsightsPrivateEndpointsResponse>
            listOperationsInsightsPrivateEndpointsResponseIterator(
                    final ListOperationsInsightsPrivateEndpointsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListOperationsInsightsPrivateEndpointsRequest.Builder,
                ListOperationsInsightsPrivateEndpointsRequest,
                ListOperationsInsightsPrivateEndpointsResponse>(
                new java.util.function.Supplier<
                        ListOperationsInsightsPrivateEndpointsRequest.Builder>() {
                    @Override
                    public ListOperationsInsightsPrivateEndpointsRequest.Builder get() {
                        return ListOperationsInsightsPrivateEndpointsRequest.builder()
                                .copy(request);
                    }
                },
                new java.util.function.Function<
                        ListOperationsInsightsPrivateEndpointsResponse, String>() {
                    @Override
                    public String apply(ListOperationsInsightsPrivateEndpointsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListOperationsInsightsPrivateEndpointsRequest.Builder>,
                        ListOperationsInsightsPrivateEndpointsRequest>() {
                    @Override
                    public ListOperationsInsightsPrivateEndpointsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListOperationsInsightsPrivateEndpointsRequest.Builder>
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
                        ListOperationsInsightsPrivateEndpointsRequest,
                        ListOperationsInsightsPrivateEndpointsResponse>() {
                    @Override
                    public ListOperationsInsightsPrivateEndpointsResponse apply(
                            ListOperationsInsightsPrivateEndpointsRequest request) {
                        return client.listOperationsInsightsPrivateEndpoints(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link com.oracle.bmc.opsi.model.OperationsInsightsPrivateEndpointSummary} objects
     * contained in responses from the listOperationsInsightsPrivateEndpoints operation. This iterable will fetch more data from the
     * server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link com.oracle.bmc.opsi.model.OperationsInsightsPrivateEndpointSummary} objects
     * contained in responses received from the service.
     */
    public Iterable<com.oracle.bmc.opsi.model.OperationsInsightsPrivateEndpointSummary>
            listOperationsInsightsPrivateEndpointsRecordIterator(
                    final ListOperationsInsightsPrivateEndpointsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListOperationsInsightsPrivateEndpointsRequest.Builder,
                ListOperationsInsightsPrivateEndpointsRequest,
                ListOperationsInsightsPrivateEndpointsResponse,
                com.oracle.bmc.opsi.model.OperationsInsightsPrivateEndpointSummary>(
                new java.util.function.Supplier<
                        ListOperationsInsightsPrivateEndpointsRequest.Builder>() {
                    @Override
                    public ListOperationsInsightsPrivateEndpointsRequest.Builder get() {
                        return ListOperationsInsightsPrivateEndpointsRequest.builder()
                                .copy(request);
                    }
                },
                new java.util.function.Function<
                        ListOperationsInsightsPrivateEndpointsResponse, String>() {
                    @Override
                    public String apply(ListOperationsInsightsPrivateEndpointsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListOperationsInsightsPrivateEndpointsRequest.Builder>,
                        ListOperationsInsightsPrivateEndpointsRequest>() {
                    @Override
                    public ListOperationsInsightsPrivateEndpointsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListOperationsInsightsPrivateEndpointsRequest.Builder>
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
                        ListOperationsInsightsPrivateEndpointsRequest,
                        ListOperationsInsightsPrivateEndpointsResponse>() {
                    @Override
                    public ListOperationsInsightsPrivateEndpointsResponse apply(
                            ListOperationsInsightsPrivateEndpointsRequest request) {
                        return client.listOperationsInsightsPrivateEndpoints(request);
                    }
                },
                new java.util.function.Function<
                        ListOperationsInsightsPrivateEndpointsResponse,
                        java.util.List<
                                com.oracle.bmc.opsi.model
                                        .OperationsInsightsPrivateEndpointSummary>>() {
                    @Override
                    public java.util.List<
                                    com.oracle.bmc.opsi.model
                                            .OperationsInsightsPrivateEndpointSummary>
                            apply(ListOperationsInsightsPrivateEndpointsResponse response) {
                        return response.getOperationsInsightsPrivateEndpointCollection().getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the listOperationsInsightsWarehouseUsers operation. This iterable
     * will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses received from the service.
     */
    public Iterable<ListOperationsInsightsWarehouseUsersResponse>
            listOperationsInsightsWarehouseUsersResponseIterator(
                    final ListOperationsInsightsWarehouseUsersRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListOperationsInsightsWarehouseUsersRequest.Builder,
                ListOperationsInsightsWarehouseUsersRequest,
                ListOperationsInsightsWarehouseUsersResponse>(
                new java.util.function.Supplier<
                        ListOperationsInsightsWarehouseUsersRequest.Builder>() {
                    @Override
                    public ListOperationsInsightsWarehouseUsersRequest.Builder get() {
                        return ListOperationsInsightsWarehouseUsersRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<
                        ListOperationsInsightsWarehouseUsersResponse, String>() {
                    @Override
                    public String apply(ListOperationsInsightsWarehouseUsersResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListOperationsInsightsWarehouseUsersRequest.Builder>,
                        ListOperationsInsightsWarehouseUsersRequest>() {
                    @Override
                    public ListOperationsInsightsWarehouseUsersRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListOperationsInsightsWarehouseUsersRequest.Builder>
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
                        ListOperationsInsightsWarehouseUsersRequest,
                        ListOperationsInsightsWarehouseUsersResponse>() {
                    @Override
                    public ListOperationsInsightsWarehouseUsersResponse apply(
                            ListOperationsInsightsWarehouseUsersRequest request) {
                        return client.listOperationsInsightsWarehouseUsers(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link com.oracle.bmc.opsi.model.OperationsInsightsWarehouseUserSummary} objects
     * contained in responses from the listOperationsInsightsWarehouseUsers operation. This iterable will fetch more data from the
     * server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link com.oracle.bmc.opsi.model.OperationsInsightsWarehouseUserSummary} objects
     * contained in responses received from the service.
     */
    public Iterable<com.oracle.bmc.opsi.model.OperationsInsightsWarehouseUserSummary>
            listOperationsInsightsWarehouseUsersRecordIterator(
                    final ListOperationsInsightsWarehouseUsersRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListOperationsInsightsWarehouseUsersRequest.Builder,
                ListOperationsInsightsWarehouseUsersRequest,
                ListOperationsInsightsWarehouseUsersResponse,
                com.oracle.bmc.opsi.model.OperationsInsightsWarehouseUserSummary>(
                new java.util.function.Supplier<
                        ListOperationsInsightsWarehouseUsersRequest.Builder>() {
                    @Override
                    public ListOperationsInsightsWarehouseUsersRequest.Builder get() {
                        return ListOperationsInsightsWarehouseUsersRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<
                        ListOperationsInsightsWarehouseUsersResponse, String>() {
                    @Override
                    public String apply(ListOperationsInsightsWarehouseUsersResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListOperationsInsightsWarehouseUsersRequest.Builder>,
                        ListOperationsInsightsWarehouseUsersRequest>() {
                    @Override
                    public ListOperationsInsightsWarehouseUsersRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListOperationsInsightsWarehouseUsersRequest.Builder>
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
                        ListOperationsInsightsWarehouseUsersRequest,
                        ListOperationsInsightsWarehouseUsersResponse>() {
                    @Override
                    public ListOperationsInsightsWarehouseUsersResponse apply(
                            ListOperationsInsightsWarehouseUsersRequest request) {
                        return client.listOperationsInsightsWarehouseUsers(request);
                    }
                },
                new java.util.function.Function<
                        ListOperationsInsightsWarehouseUsersResponse,
                        java.util.List<
                                com.oracle.bmc.opsi.model
                                        .OperationsInsightsWarehouseUserSummary>>() {
                    @Override
                    public java.util.List<
                                    com.oracle.bmc.opsi.model
                                            .OperationsInsightsWarehouseUserSummary>
                            apply(ListOperationsInsightsWarehouseUsersResponse response) {
                        return response.getOperationsInsightsWarehouseUserSummaryCollection()
                                .getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the listOperationsInsightsWarehouses operation. This iterable
     * will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses received from the service.
     */
    public Iterable<ListOperationsInsightsWarehousesResponse>
            listOperationsInsightsWarehousesResponseIterator(
                    final ListOperationsInsightsWarehousesRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListOperationsInsightsWarehousesRequest.Builder,
                ListOperationsInsightsWarehousesRequest, ListOperationsInsightsWarehousesResponse>(
                new java.util.function.Supplier<ListOperationsInsightsWarehousesRequest.Builder>() {
                    @Override
                    public ListOperationsInsightsWarehousesRequest.Builder get() {
                        return ListOperationsInsightsWarehousesRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<
                        ListOperationsInsightsWarehousesResponse, String>() {
                    @Override
                    public String apply(ListOperationsInsightsWarehousesResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListOperationsInsightsWarehousesRequest.Builder>,
                        ListOperationsInsightsWarehousesRequest>() {
                    @Override
                    public ListOperationsInsightsWarehousesRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListOperationsInsightsWarehousesRequest.Builder>
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
                        ListOperationsInsightsWarehousesRequest,
                        ListOperationsInsightsWarehousesResponse>() {
                    @Override
                    public ListOperationsInsightsWarehousesResponse apply(
                            ListOperationsInsightsWarehousesRequest request) {
                        return client.listOperationsInsightsWarehouses(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link com.oracle.bmc.opsi.model.OperationsInsightsWarehouseSummary} objects
     * contained in responses from the listOperationsInsightsWarehouses operation. This iterable will fetch more data from the
     * server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link com.oracle.bmc.opsi.model.OperationsInsightsWarehouseSummary} objects
     * contained in responses received from the service.
     */
    public Iterable<com.oracle.bmc.opsi.model.OperationsInsightsWarehouseSummary>
            listOperationsInsightsWarehousesRecordIterator(
                    final ListOperationsInsightsWarehousesRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListOperationsInsightsWarehousesRequest.Builder,
                ListOperationsInsightsWarehousesRequest, ListOperationsInsightsWarehousesResponse,
                com.oracle.bmc.opsi.model.OperationsInsightsWarehouseSummary>(
                new java.util.function.Supplier<ListOperationsInsightsWarehousesRequest.Builder>() {
                    @Override
                    public ListOperationsInsightsWarehousesRequest.Builder get() {
                        return ListOperationsInsightsWarehousesRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<
                        ListOperationsInsightsWarehousesResponse, String>() {
                    @Override
                    public String apply(ListOperationsInsightsWarehousesResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListOperationsInsightsWarehousesRequest.Builder>,
                        ListOperationsInsightsWarehousesRequest>() {
                    @Override
                    public ListOperationsInsightsWarehousesRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListOperationsInsightsWarehousesRequest.Builder>
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
                        ListOperationsInsightsWarehousesRequest,
                        ListOperationsInsightsWarehousesResponse>() {
                    @Override
                    public ListOperationsInsightsWarehousesResponse apply(
                            ListOperationsInsightsWarehousesRequest request) {
                        return client.listOperationsInsightsWarehouses(request);
                    }
                },
                new java.util.function.Function<
                        ListOperationsInsightsWarehousesResponse,
                        java.util.List<
                                com.oracle.bmc.opsi.model.OperationsInsightsWarehouseSummary>>() {
                    @Override
                    public java.util.List<
                                    com.oracle.bmc.opsi.model.OperationsInsightsWarehouseSummary>
                            apply(ListOperationsInsightsWarehousesResponse response) {
                        return response.getOperationsInsightsWarehouseSummaryCollection()
                                .getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the listOpsiConfigurations operation. This iterable
     * will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses received from the service.
     */
    public Iterable<ListOpsiConfigurationsResponse> listOpsiConfigurationsResponseIterator(
            final ListOpsiConfigurationsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListOpsiConfigurationsRequest.Builder, ListOpsiConfigurationsRequest,
                ListOpsiConfigurationsResponse>(
                new java.util.function.Supplier<ListOpsiConfigurationsRequest.Builder>() {
                    @Override
                    public ListOpsiConfigurationsRequest.Builder get() {
                        return ListOpsiConfigurationsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListOpsiConfigurationsResponse, String>() {
                    @Override
                    public String apply(ListOpsiConfigurationsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListOpsiConfigurationsRequest.Builder>,
                        ListOpsiConfigurationsRequest>() {
                    @Override
                    public ListOpsiConfigurationsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListOpsiConfigurationsRequest.Builder>
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
                        ListOpsiConfigurationsRequest, ListOpsiConfigurationsResponse>() {
                    @Override
                    public ListOpsiConfigurationsResponse apply(
                            ListOpsiConfigurationsRequest request) {
                        return client.listOpsiConfigurations(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link com.oracle.bmc.opsi.model.OpsiConfigurationSummary} objects
     * contained in responses from the listOpsiConfigurations operation. This iterable will fetch more data from the
     * server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link com.oracle.bmc.opsi.model.OpsiConfigurationSummary} objects
     * contained in responses received from the service.
     */
    public Iterable<com.oracle.bmc.opsi.model.OpsiConfigurationSummary>
            listOpsiConfigurationsRecordIterator(final ListOpsiConfigurationsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListOpsiConfigurationsRequest.Builder, ListOpsiConfigurationsRequest,
                ListOpsiConfigurationsResponse, com.oracle.bmc.opsi.model.OpsiConfigurationSummary>(
                new java.util.function.Supplier<ListOpsiConfigurationsRequest.Builder>() {
                    @Override
                    public ListOpsiConfigurationsRequest.Builder get() {
                        return ListOpsiConfigurationsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListOpsiConfigurationsResponse, String>() {
                    @Override
                    public String apply(ListOpsiConfigurationsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListOpsiConfigurationsRequest.Builder>,
                        ListOpsiConfigurationsRequest>() {
                    @Override
                    public ListOpsiConfigurationsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListOpsiConfigurationsRequest.Builder>
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
                        ListOpsiConfigurationsRequest, ListOpsiConfigurationsResponse>() {
                    @Override
                    public ListOpsiConfigurationsResponse apply(
                            ListOpsiConfigurationsRequest request) {
                        return client.listOpsiConfigurations(request);
                    }
                },
                new java.util.function.Function<
                        ListOpsiConfigurationsResponse,
                        java.util.List<com.oracle.bmc.opsi.model.OpsiConfigurationSummary>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.opsi.model.OpsiConfigurationSummary> apply(
                            ListOpsiConfigurationsResponse response) {
                        return response.getOpsiConfigurationsCollection().getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the listOpsiDataObjects operation. This iterable
     * will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses received from the service.
     */
    public Iterable<ListOpsiDataObjectsResponse> listOpsiDataObjectsResponseIterator(
            final ListOpsiDataObjectsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListOpsiDataObjectsRequest.Builder, ListOpsiDataObjectsRequest,
                ListOpsiDataObjectsResponse>(
                new java.util.function.Supplier<ListOpsiDataObjectsRequest.Builder>() {
                    @Override
                    public ListOpsiDataObjectsRequest.Builder get() {
                        return ListOpsiDataObjectsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListOpsiDataObjectsResponse, String>() {
                    @Override
                    public String apply(ListOpsiDataObjectsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListOpsiDataObjectsRequest.Builder>,
                        ListOpsiDataObjectsRequest>() {
                    @Override
                    public ListOpsiDataObjectsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListOpsiDataObjectsRequest.Builder>
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
                        ListOpsiDataObjectsRequest, ListOpsiDataObjectsResponse>() {
                    @Override
                    public ListOpsiDataObjectsResponse apply(ListOpsiDataObjectsRequest request) {
                        return client.listOpsiDataObjects(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link com.oracle.bmc.opsi.model.OpsiDataObjectSummary} objects
     * contained in responses from the listOpsiDataObjects operation. This iterable will fetch more data from the
     * server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link com.oracle.bmc.opsi.model.OpsiDataObjectSummary} objects
     * contained in responses received from the service.
     */
    public Iterable<com.oracle.bmc.opsi.model.OpsiDataObjectSummary>
            listOpsiDataObjectsRecordIterator(final ListOpsiDataObjectsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListOpsiDataObjectsRequest.Builder, ListOpsiDataObjectsRequest,
                ListOpsiDataObjectsResponse, com.oracle.bmc.opsi.model.OpsiDataObjectSummary>(
                new java.util.function.Supplier<ListOpsiDataObjectsRequest.Builder>() {
                    @Override
                    public ListOpsiDataObjectsRequest.Builder get() {
                        return ListOpsiDataObjectsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListOpsiDataObjectsResponse, String>() {
                    @Override
                    public String apply(ListOpsiDataObjectsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListOpsiDataObjectsRequest.Builder>,
                        ListOpsiDataObjectsRequest>() {
                    @Override
                    public ListOpsiDataObjectsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListOpsiDataObjectsRequest.Builder>
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
                        ListOpsiDataObjectsRequest, ListOpsiDataObjectsResponse>() {
                    @Override
                    public ListOpsiDataObjectsResponse apply(ListOpsiDataObjectsRequest request) {
                        return client.listOpsiDataObjects(request);
                    }
                },
                new java.util.function.Function<
                        ListOpsiDataObjectsResponse,
                        java.util.List<com.oracle.bmc.opsi.model.OpsiDataObjectSummary>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.opsi.model.OpsiDataObjectSummary> apply(
                            ListOpsiDataObjectsResponse response) {
                        return response.getOpsiDataObjectsCollection().getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the listSqlPlans operation. This iterable
     * will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses received from the service.
     */
    public Iterable<ListSqlPlansResponse> listSqlPlansResponseIterator(
            final ListSqlPlansRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListSqlPlansRequest.Builder, ListSqlPlansRequest, ListSqlPlansResponse>(
                new java.util.function.Supplier<ListSqlPlansRequest.Builder>() {
                    @Override
                    public ListSqlPlansRequest.Builder get() {
                        return ListSqlPlansRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListSqlPlansResponse, String>() {
                    @Override
                    public String apply(ListSqlPlansResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListSqlPlansRequest.Builder>,
                        ListSqlPlansRequest>() {
                    @Override
                    public ListSqlPlansRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListSqlPlansRequest.Builder>
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
                new java.util.function.Function<ListSqlPlansRequest, ListSqlPlansResponse>() {
                    @Override
                    public ListSqlPlansResponse apply(ListSqlPlansRequest request) {
                        return client.listSqlPlans(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link com.oracle.bmc.opsi.model.SqlPlanSummary} objects
     * contained in responses from the listSqlPlans operation. This iterable will fetch more data from the
     * server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link com.oracle.bmc.opsi.model.SqlPlanSummary} objects
     * contained in responses received from the service.
     */
    public Iterable<com.oracle.bmc.opsi.model.SqlPlanSummary> listSqlPlansRecordIterator(
            final ListSqlPlansRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListSqlPlansRequest.Builder, ListSqlPlansRequest, ListSqlPlansResponse,
                com.oracle.bmc.opsi.model.SqlPlanSummary>(
                new java.util.function.Supplier<ListSqlPlansRequest.Builder>() {
                    @Override
                    public ListSqlPlansRequest.Builder get() {
                        return ListSqlPlansRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListSqlPlansResponse, String>() {
                    @Override
                    public String apply(ListSqlPlansResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListSqlPlansRequest.Builder>,
                        ListSqlPlansRequest>() {
                    @Override
                    public ListSqlPlansRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListSqlPlansRequest.Builder>
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
                new java.util.function.Function<ListSqlPlansRequest, ListSqlPlansResponse>() {
                    @Override
                    public ListSqlPlansResponse apply(ListSqlPlansRequest request) {
                        return client.listSqlPlans(request);
                    }
                },
                new java.util.function.Function<
                        ListSqlPlansResponse,
                        java.util.List<com.oracle.bmc.opsi.model.SqlPlanSummary>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.opsi.model.SqlPlanSummary> apply(
                            ListSqlPlansResponse response) {
                        return response.getSqlPlanCollection().getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the listSqlSearches operation. This iterable
     * will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses received from the service.
     */
    public Iterable<ListSqlSearchesResponse> listSqlSearchesResponseIterator(
            final ListSqlSearchesRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListSqlSearchesRequest.Builder, ListSqlSearchesRequest, ListSqlSearchesResponse>(
                new java.util.function.Supplier<ListSqlSearchesRequest.Builder>() {
                    @Override
                    public ListSqlSearchesRequest.Builder get() {
                        return ListSqlSearchesRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListSqlSearchesResponse, String>() {
                    @Override
                    public String apply(ListSqlSearchesResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListSqlSearchesRequest.Builder>,
                        ListSqlSearchesRequest>() {
                    @Override
                    public ListSqlSearchesRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListSqlSearchesRequest.Builder>
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
                new java.util.function.Function<ListSqlSearchesRequest, ListSqlSearchesResponse>() {
                    @Override
                    public ListSqlSearchesResponse apply(ListSqlSearchesRequest request) {
                        return client.listSqlSearches(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link com.oracle.bmc.opsi.model.SqlSearchSummary} objects
     * contained in responses from the listSqlSearches operation. This iterable will fetch more data from the
     * server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link com.oracle.bmc.opsi.model.SqlSearchSummary} objects
     * contained in responses received from the service.
     */
    public Iterable<com.oracle.bmc.opsi.model.SqlSearchSummary> listSqlSearchesRecordIterator(
            final ListSqlSearchesRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListSqlSearchesRequest.Builder, ListSqlSearchesRequest, ListSqlSearchesResponse,
                com.oracle.bmc.opsi.model.SqlSearchSummary>(
                new java.util.function.Supplier<ListSqlSearchesRequest.Builder>() {
                    @Override
                    public ListSqlSearchesRequest.Builder get() {
                        return ListSqlSearchesRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListSqlSearchesResponse, String>() {
                    @Override
                    public String apply(ListSqlSearchesResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListSqlSearchesRequest.Builder>,
                        ListSqlSearchesRequest>() {
                    @Override
                    public ListSqlSearchesRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListSqlSearchesRequest.Builder>
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
                new java.util.function.Function<ListSqlSearchesRequest, ListSqlSearchesResponse>() {
                    @Override
                    public ListSqlSearchesResponse apply(ListSqlSearchesRequest request) {
                        return client.listSqlSearches(request);
                    }
                },
                new java.util.function.Function<
                        ListSqlSearchesResponse,
                        java.util.List<com.oracle.bmc.opsi.model.SqlSearchSummary>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.opsi.model.SqlSearchSummary> apply(
                            ListSqlSearchesResponse response) {
                        return response.getSqlSearchCollection().getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the listSqlTexts operation. This iterable
     * will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses received from the service.
     */
    public Iterable<ListSqlTextsResponse> listSqlTextsResponseIterator(
            final ListSqlTextsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListSqlTextsRequest.Builder, ListSqlTextsRequest, ListSqlTextsResponse>(
                new java.util.function.Supplier<ListSqlTextsRequest.Builder>() {
                    @Override
                    public ListSqlTextsRequest.Builder get() {
                        return ListSqlTextsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListSqlTextsResponse, String>() {
                    @Override
                    public String apply(ListSqlTextsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListSqlTextsRequest.Builder>,
                        ListSqlTextsRequest>() {
                    @Override
                    public ListSqlTextsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListSqlTextsRequest.Builder>
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
                new java.util.function.Function<ListSqlTextsRequest, ListSqlTextsResponse>() {
                    @Override
                    public ListSqlTextsResponse apply(ListSqlTextsRequest request) {
                        return client.listSqlTexts(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link com.oracle.bmc.opsi.model.SqlTextSummary} objects
     * contained in responses from the listSqlTexts operation. This iterable will fetch more data from the
     * server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link com.oracle.bmc.opsi.model.SqlTextSummary} objects
     * contained in responses received from the service.
     */
    public Iterable<com.oracle.bmc.opsi.model.SqlTextSummary> listSqlTextsRecordIterator(
            final ListSqlTextsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListSqlTextsRequest.Builder, ListSqlTextsRequest, ListSqlTextsResponse,
                com.oracle.bmc.opsi.model.SqlTextSummary>(
                new java.util.function.Supplier<ListSqlTextsRequest.Builder>() {
                    @Override
                    public ListSqlTextsRequest.Builder get() {
                        return ListSqlTextsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListSqlTextsResponse, String>() {
                    @Override
                    public String apply(ListSqlTextsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListSqlTextsRequest.Builder>,
                        ListSqlTextsRequest>() {
                    @Override
                    public ListSqlTextsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListSqlTextsRequest.Builder>
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
                new java.util.function.Function<ListSqlTextsRequest, ListSqlTextsResponse>() {
                    @Override
                    public ListSqlTextsResponse apply(ListSqlTextsRequest request) {
                        return client.listSqlTexts(request);
                    }
                },
                new java.util.function.Function<
                        ListSqlTextsResponse,
                        java.util.List<com.oracle.bmc.opsi.model.SqlTextSummary>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.opsi.model.SqlTextSummary> apply(
                            ListSqlTextsResponse response) {
                        return response.getSqlTextCollection().getItems();
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
     * Creates a new iterable which will iterate over the {@link com.oracle.bmc.opsi.model.WorkRequestError} objects
     * contained in responses from the listWorkRequestErrors operation. This iterable will fetch more data from the
     * server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link com.oracle.bmc.opsi.model.WorkRequestError} objects
     * contained in responses received from the service.
     */
    public Iterable<com.oracle.bmc.opsi.model.WorkRequestError> listWorkRequestErrorsRecordIterator(
            final ListWorkRequestErrorsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListWorkRequestErrorsRequest.Builder, ListWorkRequestErrorsRequest,
                ListWorkRequestErrorsResponse, com.oracle.bmc.opsi.model.WorkRequestError>(
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
                        java.util.List<com.oracle.bmc.opsi.model.WorkRequestError>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.opsi.model.WorkRequestError> apply(
                            ListWorkRequestErrorsResponse response) {
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
     * Creates a new iterable which will iterate over the {@link com.oracle.bmc.opsi.model.WorkRequestLogEntry} objects
     * contained in responses from the listWorkRequestLogs operation. This iterable will fetch more data from the
     * server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link com.oracle.bmc.opsi.model.WorkRequestLogEntry} objects
     * contained in responses received from the service.
     */
    public Iterable<com.oracle.bmc.opsi.model.WorkRequestLogEntry>
            listWorkRequestLogsRecordIterator(final ListWorkRequestLogsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListWorkRequestLogsRequest.Builder, ListWorkRequestLogsRequest,
                ListWorkRequestLogsResponse, com.oracle.bmc.opsi.model.WorkRequestLogEntry>(
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
                        java.util.List<com.oracle.bmc.opsi.model.WorkRequestLogEntry>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.opsi.model.WorkRequestLogEntry> apply(
                            ListWorkRequestLogsResponse response) {
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
     * Creates a new iterable which will iterate over the {@link com.oracle.bmc.opsi.model.WorkRequest} objects
     * contained in responses from the listWorkRequests operation. This iterable will fetch more data from the
     * server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link com.oracle.bmc.opsi.model.WorkRequest} objects
     * contained in responses received from the service.
     */
    public Iterable<com.oracle.bmc.opsi.model.WorkRequest> listWorkRequestsRecordIterator(
            final ListWorkRequestsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListWorkRequestsRequest.Builder, ListWorkRequestsRequest, ListWorkRequestsResponse,
                com.oracle.bmc.opsi.model.WorkRequest>(
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
                        java.util.List<com.oracle.bmc.opsi.model.WorkRequest>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.opsi.model.WorkRequest> apply(
                            ListWorkRequestsResponse response) {
                        return response.getWorkRequestCollection().getItems();
                    }
                });
    }
}

/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.cloudguard;

import com.oracle.bmc.cloudguard.requests.*;
import com.oracle.bmc.cloudguard.responses.*;

/**
 * Collection of helper methods that can be used to provide an {@link java.lang.Iterable} interface
 * to any list operations of CloudGuard where multiple pages of data may be fetched.
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
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200131")
public class CloudGuardPaginators {
    private final CloudGuard client;

    public CloudGuardPaginators(CloudGuard client) {
        this.client = client;
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the listAdhocQueries operation. This iterable
     * will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses received from the service.
     */
    public Iterable<ListAdhocQueriesResponse> listAdhocQueriesResponseIterator(
            final ListAdhocQueriesRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListAdhocQueriesRequest.Builder, ListAdhocQueriesRequest, ListAdhocQueriesResponse>(
                new java.util.function.Supplier<ListAdhocQueriesRequest.Builder>() {
                    @Override
                    public ListAdhocQueriesRequest.Builder get() {
                        return ListAdhocQueriesRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListAdhocQueriesResponse, String>() {
                    @Override
                    public String apply(ListAdhocQueriesResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListAdhocQueriesRequest.Builder>,
                        ListAdhocQueriesRequest>() {
                    @Override
                    public ListAdhocQueriesRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListAdhocQueriesRequest.Builder>
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
                        ListAdhocQueriesRequest, ListAdhocQueriesResponse>() {
                    @Override
                    public ListAdhocQueriesResponse apply(ListAdhocQueriesRequest request) {
                        return client.listAdhocQueries(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link com.oracle.bmc.cloudguard.model.AdhocQuerySummary} objects
     * contained in responses from the listAdhocQueries operation. This iterable will fetch more data from the
     * server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link com.oracle.bmc.cloudguard.model.AdhocQuerySummary} objects
     * contained in responses received from the service.
     */
    public Iterable<com.oracle.bmc.cloudguard.model.AdhocQuerySummary>
            listAdhocQueriesRecordIterator(final ListAdhocQueriesRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListAdhocQueriesRequest.Builder, ListAdhocQueriesRequest, ListAdhocQueriesResponse,
                com.oracle.bmc.cloudguard.model.AdhocQuerySummary>(
                new java.util.function.Supplier<ListAdhocQueriesRequest.Builder>() {
                    @Override
                    public ListAdhocQueriesRequest.Builder get() {
                        return ListAdhocQueriesRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListAdhocQueriesResponse, String>() {
                    @Override
                    public String apply(ListAdhocQueriesResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListAdhocQueriesRequest.Builder>,
                        ListAdhocQueriesRequest>() {
                    @Override
                    public ListAdhocQueriesRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListAdhocQueriesRequest.Builder>
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
                        ListAdhocQueriesRequest, ListAdhocQueriesResponse>() {
                    @Override
                    public ListAdhocQueriesResponse apply(ListAdhocQueriesRequest request) {
                        return client.listAdhocQueries(request);
                    }
                },
                new java.util.function.Function<
                        ListAdhocQueriesResponse,
                        java.util.List<com.oracle.bmc.cloudguard.model.AdhocQuerySummary>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.cloudguard.model.AdhocQuerySummary> apply(
                            ListAdhocQueriesResponse response) {
                        return response.getAdhocQueryCollection().getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the listAdhocQueryResults operation. This iterable
     * will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses received from the service.
     */
    public Iterable<ListAdhocQueryResultsResponse> listAdhocQueryResultsResponseIterator(
            final ListAdhocQueryResultsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListAdhocQueryResultsRequest.Builder, ListAdhocQueryResultsRequest,
                ListAdhocQueryResultsResponse>(
                new java.util.function.Supplier<ListAdhocQueryResultsRequest.Builder>() {
                    @Override
                    public ListAdhocQueryResultsRequest.Builder get() {
                        return ListAdhocQueryResultsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListAdhocQueryResultsResponse, String>() {
                    @Override
                    public String apply(ListAdhocQueryResultsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListAdhocQueryResultsRequest.Builder>,
                        ListAdhocQueryResultsRequest>() {
                    @Override
                    public ListAdhocQueryResultsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListAdhocQueryResultsRequest.Builder>
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
                        ListAdhocQueryResultsRequest, ListAdhocQueryResultsResponse>() {
                    @Override
                    public ListAdhocQueryResultsResponse apply(
                            ListAdhocQueryResultsRequest request) {
                        return client.listAdhocQueryResults(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link com.oracle.bmc.cloudguard.model.AdhocQueryResultSummary} objects
     * contained in responses from the listAdhocQueryResults operation. This iterable will fetch more data from the
     * server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link com.oracle.bmc.cloudguard.model.AdhocQueryResultSummary} objects
     * contained in responses received from the service.
     */
    public Iterable<com.oracle.bmc.cloudguard.model.AdhocQueryResultSummary>
            listAdhocQueryResultsRecordIterator(final ListAdhocQueryResultsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListAdhocQueryResultsRequest.Builder, ListAdhocQueryResultsRequest,
                ListAdhocQueryResultsResponse,
                com.oracle.bmc.cloudguard.model.AdhocQueryResultSummary>(
                new java.util.function.Supplier<ListAdhocQueryResultsRequest.Builder>() {
                    @Override
                    public ListAdhocQueryResultsRequest.Builder get() {
                        return ListAdhocQueryResultsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListAdhocQueryResultsResponse, String>() {
                    @Override
                    public String apply(ListAdhocQueryResultsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListAdhocQueryResultsRequest.Builder>,
                        ListAdhocQueryResultsRequest>() {
                    @Override
                    public ListAdhocQueryResultsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListAdhocQueryResultsRequest.Builder>
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
                        ListAdhocQueryResultsRequest, ListAdhocQueryResultsResponse>() {
                    @Override
                    public ListAdhocQueryResultsResponse apply(
                            ListAdhocQueryResultsRequest request) {
                        return client.listAdhocQueryResults(request);
                    }
                },
                new java.util.function.Function<
                        ListAdhocQueryResultsResponse,
                        java.util.List<com.oracle.bmc.cloudguard.model.AdhocQueryResultSummary>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.cloudguard.model.AdhocQueryResultSummary>
                            apply(ListAdhocQueryResultsResponse response) {
                        return response.getAdhocQueryResultCollection().getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the listConditionMetadataTypes operation. This iterable
     * will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses received from the service.
     */
    public Iterable<ListConditionMetadataTypesResponse> listConditionMetadataTypesResponseIterator(
            final ListConditionMetadataTypesRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListConditionMetadataTypesRequest.Builder, ListConditionMetadataTypesRequest,
                ListConditionMetadataTypesResponse>(
                new java.util.function.Supplier<ListConditionMetadataTypesRequest.Builder>() {
                    @Override
                    public ListConditionMetadataTypesRequest.Builder get() {
                        return ListConditionMetadataTypesRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListConditionMetadataTypesResponse, String>() {
                    @Override
                    public String apply(ListConditionMetadataTypesResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListConditionMetadataTypesRequest.Builder>,
                        ListConditionMetadataTypesRequest>() {
                    @Override
                    public ListConditionMetadataTypesRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListConditionMetadataTypesRequest.Builder>
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
                        ListConditionMetadataTypesRequest, ListConditionMetadataTypesResponse>() {
                    @Override
                    public ListConditionMetadataTypesResponse apply(
                            ListConditionMetadataTypesRequest request) {
                        return client.listConditionMetadataTypes(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link com.oracle.bmc.cloudguard.model.ConditionMetadataTypeSummary} objects
     * contained in responses from the listConditionMetadataTypes operation. This iterable will fetch more data from the
     * server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link com.oracle.bmc.cloudguard.model.ConditionMetadataTypeSummary} objects
     * contained in responses received from the service.
     */
    public Iterable<com.oracle.bmc.cloudguard.model.ConditionMetadataTypeSummary>
            listConditionMetadataTypesRecordIterator(
                    final ListConditionMetadataTypesRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListConditionMetadataTypesRequest.Builder, ListConditionMetadataTypesRequest,
                ListConditionMetadataTypesResponse,
                com.oracle.bmc.cloudguard.model.ConditionMetadataTypeSummary>(
                new java.util.function.Supplier<ListConditionMetadataTypesRequest.Builder>() {
                    @Override
                    public ListConditionMetadataTypesRequest.Builder get() {
                        return ListConditionMetadataTypesRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListConditionMetadataTypesResponse, String>() {
                    @Override
                    public String apply(ListConditionMetadataTypesResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListConditionMetadataTypesRequest.Builder>,
                        ListConditionMetadataTypesRequest>() {
                    @Override
                    public ListConditionMetadataTypesRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListConditionMetadataTypesRequest.Builder>
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
                        ListConditionMetadataTypesRequest, ListConditionMetadataTypesResponse>() {
                    @Override
                    public ListConditionMetadataTypesResponse apply(
                            ListConditionMetadataTypesRequest request) {
                        return client.listConditionMetadataTypes(request);
                    }
                },
                new java.util.function.Function<
                        ListConditionMetadataTypesResponse,
                        java.util.List<
                                com.oracle.bmc.cloudguard.model.ConditionMetadataTypeSummary>>() {
                    @Override
                    public java.util.List<
                                    com.oracle.bmc.cloudguard.model.ConditionMetadataTypeSummary>
                            apply(ListConditionMetadataTypesResponse response) {
                        return response.getConditionMetadataTypeCollection().getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the listDataMaskRules operation. This iterable
     * will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses received from the service.
     */
    public Iterable<ListDataMaskRulesResponse> listDataMaskRulesResponseIterator(
            final ListDataMaskRulesRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListDataMaskRulesRequest.Builder, ListDataMaskRulesRequest,
                ListDataMaskRulesResponse>(
                new java.util.function.Supplier<ListDataMaskRulesRequest.Builder>() {
                    @Override
                    public ListDataMaskRulesRequest.Builder get() {
                        return ListDataMaskRulesRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListDataMaskRulesResponse, String>() {
                    @Override
                    public String apply(ListDataMaskRulesResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListDataMaskRulesRequest.Builder>,
                        ListDataMaskRulesRequest>() {
                    @Override
                    public ListDataMaskRulesRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListDataMaskRulesRequest.Builder>
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
                        ListDataMaskRulesRequest, ListDataMaskRulesResponse>() {
                    @Override
                    public ListDataMaskRulesResponse apply(ListDataMaskRulesRequest request) {
                        return client.listDataMaskRules(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link com.oracle.bmc.cloudguard.model.DataMaskRuleSummary} objects
     * contained in responses from the listDataMaskRules operation. This iterable will fetch more data from the
     * server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link com.oracle.bmc.cloudguard.model.DataMaskRuleSummary} objects
     * contained in responses received from the service.
     */
    public Iterable<com.oracle.bmc.cloudguard.model.DataMaskRuleSummary>
            listDataMaskRulesRecordIterator(final ListDataMaskRulesRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListDataMaskRulesRequest.Builder, ListDataMaskRulesRequest,
                ListDataMaskRulesResponse, com.oracle.bmc.cloudguard.model.DataMaskRuleSummary>(
                new java.util.function.Supplier<ListDataMaskRulesRequest.Builder>() {
                    @Override
                    public ListDataMaskRulesRequest.Builder get() {
                        return ListDataMaskRulesRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListDataMaskRulesResponse, String>() {
                    @Override
                    public String apply(ListDataMaskRulesResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListDataMaskRulesRequest.Builder>,
                        ListDataMaskRulesRequest>() {
                    @Override
                    public ListDataMaskRulesRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListDataMaskRulesRequest.Builder>
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
                        ListDataMaskRulesRequest, ListDataMaskRulesResponse>() {
                    @Override
                    public ListDataMaskRulesResponse apply(ListDataMaskRulesRequest request) {
                        return client.listDataMaskRules(request);
                    }
                },
                new java.util.function.Function<
                        ListDataMaskRulesResponse,
                        java.util.List<com.oracle.bmc.cloudguard.model.DataMaskRuleSummary>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.cloudguard.model.DataMaskRuleSummary>
                            apply(ListDataMaskRulesResponse response) {
                        return response.getDataMaskRuleCollection().getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the listDataSourceEvents operation. This iterable
     * will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses received from the service.
     */
    public Iterable<ListDataSourceEventsResponse> listDataSourceEventsResponseIterator(
            final ListDataSourceEventsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListDataSourceEventsRequest.Builder, ListDataSourceEventsRequest,
                ListDataSourceEventsResponse>(
                new java.util.function.Supplier<ListDataSourceEventsRequest.Builder>() {
                    @Override
                    public ListDataSourceEventsRequest.Builder get() {
                        return ListDataSourceEventsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListDataSourceEventsResponse, String>() {
                    @Override
                    public String apply(ListDataSourceEventsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListDataSourceEventsRequest.Builder>,
                        ListDataSourceEventsRequest>() {
                    @Override
                    public ListDataSourceEventsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListDataSourceEventsRequest.Builder>
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
                        ListDataSourceEventsRequest, ListDataSourceEventsResponse>() {
                    @Override
                    public ListDataSourceEventsResponse apply(ListDataSourceEventsRequest request) {
                        return client.listDataSourceEvents(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link com.oracle.bmc.cloudguard.model.DataSourceEventSummary} objects
     * contained in responses from the listDataSourceEvents operation. This iterable will fetch more data from the
     * server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link com.oracle.bmc.cloudguard.model.DataSourceEventSummary} objects
     * contained in responses received from the service.
     */
    public Iterable<com.oracle.bmc.cloudguard.model.DataSourceEventSummary>
            listDataSourceEventsRecordIterator(final ListDataSourceEventsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListDataSourceEventsRequest.Builder, ListDataSourceEventsRequest,
                ListDataSourceEventsResponse,
                com.oracle.bmc.cloudguard.model.DataSourceEventSummary>(
                new java.util.function.Supplier<ListDataSourceEventsRequest.Builder>() {
                    @Override
                    public ListDataSourceEventsRequest.Builder get() {
                        return ListDataSourceEventsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListDataSourceEventsResponse, String>() {
                    @Override
                    public String apply(ListDataSourceEventsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListDataSourceEventsRequest.Builder>,
                        ListDataSourceEventsRequest>() {
                    @Override
                    public ListDataSourceEventsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListDataSourceEventsRequest.Builder>
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
                        ListDataSourceEventsRequest, ListDataSourceEventsResponse>() {
                    @Override
                    public ListDataSourceEventsResponse apply(ListDataSourceEventsRequest request) {
                        return client.listDataSourceEvents(request);
                    }
                },
                new java.util.function.Function<
                        ListDataSourceEventsResponse,
                        java.util.List<com.oracle.bmc.cloudguard.model.DataSourceEventSummary>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.cloudguard.model.DataSourceEventSummary>
                            apply(ListDataSourceEventsResponse response) {
                        return response.getDataSourceEventCollection().getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the listDataSources operation. This iterable
     * will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses received from the service.
     */
    public Iterable<ListDataSourcesResponse> listDataSourcesResponseIterator(
            final ListDataSourcesRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListDataSourcesRequest.Builder, ListDataSourcesRequest, ListDataSourcesResponse>(
                new java.util.function.Supplier<ListDataSourcesRequest.Builder>() {
                    @Override
                    public ListDataSourcesRequest.Builder get() {
                        return ListDataSourcesRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListDataSourcesResponse, String>() {
                    @Override
                    public String apply(ListDataSourcesResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListDataSourcesRequest.Builder>,
                        ListDataSourcesRequest>() {
                    @Override
                    public ListDataSourcesRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListDataSourcesRequest.Builder>
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
                new java.util.function.Function<ListDataSourcesRequest, ListDataSourcesResponse>() {
                    @Override
                    public ListDataSourcesResponse apply(ListDataSourcesRequest request) {
                        return client.listDataSources(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link com.oracle.bmc.cloudguard.model.DataSourceSummary} objects
     * contained in responses from the listDataSources operation. This iterable will fetch more data from the
     * server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link com.oracle.bmc.cloudguard.model.DataSourceSummary} objects
     * contained in responses received from the service.
     */
    public Iterable<com.oracle.bmc.cloudguard.model.DataSourceSummary>
            listDataSourcesRecordIterator(final ListDataSourcesRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListDataSourcesRequest.Builder, ListDataSourcesRequest, ListDataSourcesResponse,
                com.oracle.bmc.cloudguard.model.DataSourceSummary>(
                new java.util.function.Supplier<ListDataSourcesRequest.Builder>() {
                    @Override
                    public ListDataSourcesRequest.Builder get() {
                        return ListDataSourcesRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListDataSourcesResponse, String>() {
                    @Override
                    public String apply(ListDataSourcesResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListDataSourcesRequest.Builder>,
                        ListDataSourcesRequest>() {
                    @Override
                    public ListDataSourcesRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListDataSourcesRequest.Builder>
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
                new java.util.function.Function<ListDataSourcesRequest, ListDataSourcesResponse>() {
                    @Override
                    public ListDataSourcesResponse apply(ListDataSourcesRequest request) {
                        return client.listDataSources(request);
                    }
                },
                new java.util.function.Function<
                        ListDataSourcesResponse,
                        java.util.List<com.oracle.bmc.cloudguard.model.DataSourceSummary>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.cloudguard.model.DataSourceSummary> apply(
                            ListDataSourcesResponse response) {
                        return response.getDataSourceCollection().getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the listDetectorRecipeDetectorRules operation. This iterable
     * will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses received from the service.
     */
    public Iterable<ListDetectorRecipeDetectorRulesResponse>
            listDetectorRecipeDetectorRulesResponseIterator(
                    final ListDetectorRecipeDetectorRulesRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListDetectorRecipeDetectorRulesRequest.Builder,
                ListDetectorRecipeDetectorRulesRequest, ListDetectorRecipeDetectorRulesResponse>(
                new java.util.function.Supplier<ListDetectorRecipeDetectorRulesRequest.Builder>() {
                    @Override
                    public ListDetectorRecipeDetectorRulesRequest.Builder get() {
                        return ListDetectorRecipeDetectorRulesRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListDetectorRecipeDetectorRulesResponse, String>() {
                    @Override
                    public String apply(ListDetectorRecipeDetectorRulesResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListDetectorRecipeDetectorRulesRequest.Builder>,
                        ListDetectorRecipeDetectorRulesRequest>() {
                    @Override
                    public ListDetectorRecipeDetectorRulesRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListDetectorRecipeDetectorRulesRequest.Builder>
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
                        ListDetectorRecipeDetectorRulesRequest,
                        ListDetectorRecipeDetectorRulesResponse>() {
                    @Override
                    public ListDetectorRecipeDetectorRulesResponse apply(
                            ListDetectorRecipeDetectorRulesRequest request) {
                        return client.listDetectorRecipeDetectorRules(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link com.oracle.bmc.cloudguard.model.DetectorRecipeDetectorRuleSummary} objects
     * contained in responses from the listDetectorRecipeDetectorRules operation. This iterable will fetch more data from the
     * server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link com.oracle.bmc.cloudguard.model.DetectorRecipeDetectorRuleSummary} objects
     * contained in responses received from the service.
     */
    public Iterable<com.oracle.bmc.cloudguard.model.DetectorRecipeDetectorRuleSummary>
            listDetectorRecipeDetectorRulesRecordIterator(
                    final ListDetectorRecipeDetectorRulesRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListDetectorRecipeDetectorRulesRequest.Builder,
                ListDetectorRecipeDetectorRulesRequest, ListDetectorRecipeDetectorRulesResponse,
                com.oracle.bmc.cloudguard.model.DetectorRecipeDetectorRuleSummary>(
                new java.util.function.Supplier<ListDetectorRecipeDetectorRulesRequest.Builder>() {
                    @Override
                    public ListDetectorRecipeDetectorRulesRequest.Builder get() {
                        return ListDetectorRecipeDetectorRulesRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListDetectorRecipeDetectorRulesResponse, String>() {
                    @Override
                    public String apply(ListDetectorRecipeDetectorRulesResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListDetectorRecipeDetectorRulesRequest.Builder>,
                        ListDetectorRecipeDetectorRulesRequest>() {
                    @Override
                    public ListDetectorRecipeDetectorRulesRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListDetectorRecipeDetectorRulesRequest.Builder>
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
                        ListDetectorRecipeDetectorRulesRequest,
                        ListDetectorRecipeDetectorRulesResponse>() {
                    @Override
                    public ListDetectorRecipeDetectorRulesResponse apply(
                            ListDetectorRecipeDetectorRulesRequest request) {
                        return client.listDetectorRecipeDetectorRules(request);
                    }
                },
                new java.util.function.Function<
                        ListDetectorRecipeDetectorRulesResponse,
                        java.util.List<
                                com.oracle.bmc.cloudguard.model
                                        .DetectorRecipeDetectorRuleSummary>>() {
                    @Override
                    public java.util.List<
                                    com.oracle.bmc.cloudguard.model
                                            .DetectorRecipeDetectorRuleSummary>
                            apply(ListDetectorRecipeDetectorRulesResponse response) {
                        return response.getDetectorRecipeDetectorRuleCollection().getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the listDetectorRecipes operation. This iterable
     * will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses received from the service.
     */
    public Iterable<ListDetectorRecipesResponse> listDetectorRecipesResponseIterator(
            final ListDetectorRecipesRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListDetectorRecipesRequest.Builder, ListDetectorRecipesRequest,
                ListDetectorRecipesResponse>(
                new java.util.function.Supplier<ListDetectorRecipesRequest.Builder>() {
                    @Override
                    public ListDetectorRecipesRequest.Builder get() {
                        return ListDetectorRecipesRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListDetectorRecipesResponse, String>() {
                    @Override
                    public String apply(ListDetectorRecipesResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListDetectorRecipesRequest.Builder>,
                        ListDetectorRecipesRequest>() {
                    @Override
                    public ListDetectorRecipesRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListDetectorRecipesRequest.Builder>
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
                        ListDetectorRecipesRequest, ListDetectorRecipesResponse>() {
                    @Override
                    public ListDetectorRecipesResponse apply(ListDetectorRecipesRequest request) {
                        return client.listDetectorRecipes(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link com.oracle.bmc.cloudguard.model.DetectorRecipeSummary} objects
     * contained in responses from the listDetectorRecipes operation. This iterable will fetch more data from the
     * server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link com.oracle.bmc.cloudguard.model.DetectorRecipeSummary} objects
     * contained in responses received from the service.
     */
    public Iterable<com.oracle.bmc.cloudguard.model.DetectorRecipeSummary>
            listDetectorRecipesRecordIterator(final ListDetectorRecipesRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListDetectorRecipesRequest.Builder, ListDetectorRecipesRequest,
                ListDetectorRecipesResponse, com.oracle.bmc.cloudguard.model.DetectorRecipeSummary>(
                new java.util.function.Supplier<ListDetectorRecipesRequest.Builder>() {
                    @Override
                    public ListDetectorRecipesRequest.Builder get() {
                        return ListDetectorRecipesRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListDetectorRecipesResponse, String>() {
                    @Override
                    public String apply(ListDetectorRecipesResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListDetectorRecipesRequest.Builder>,
                        ListDetectorRecipesRequest>() {
                    @Override
                    public ListDetectorRecipesRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListDetectorRecipesRequest.Builder>
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
                        ListDetectorRecipesRequest, ListDetectorRecipesResponse>() {
                    @Override
                    public ListDetectorRecipesResponse apply(ListDetectorRecipesRequest request) {
                        return client.listDetectorRecipes(request);
                    }
                },
                new java.util.function.Function<
                        ListDetectorRecipesResponse,
                        java.util.List<com.oracle.bmc.cloudguard.model.DetectorRecipeSummary>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.cloudguard.model.DetectorRecipeSummary>
                            apply(ListDetectorRecipesResponse response) {
                        return response.getDetectorRecipeCollection().getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the listDetectorRules operation. This iterable
     * will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses received from the service.
     */
    public Iterable<ListDetectorRulesResponse> listDetectorRulesResponseIterator(
            final ListDetectorRulesRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListDetectorRulesRequest.Builder, ListDetectorRulesRequest,
                ListDetectorRulesResponse>(
                new java.util.function.Supplier<ListDetectorRulesRequest.Builder>() {
                    @Override
                    public ListDetectorRulesRequest.Builder get() {
                        return ListDetectorRulesRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListDetectorRulesResponse, String>() {
                    @Override
                    public String apply(ListDetectorRulesResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListDetectorRulesRequest.Builder>,
                        ListDetectorRulesRequest>() {
                    @Override
                    public ListDetectorRulesRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListDetectorRulesRequest.Builder>
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
                        ListDetectorRulesRequest, ListDetectorRulesResponse>() {
                    @Override
                    public ListDetectorRulesResponse apply(ListDetectorRulesRequest request) {
                        return client.listDetectorRules(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link com.oracle.bmc.cloudguard.model.DetectorRuleSummary} objects
     * contained in responses from the listDetectorRules operation. This iterable will fetch more data from the
     * server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link com.oracle.bmc.cloudguard.model.DetectorRuleSummary} objects
     * contained in responses received from the service.
     */
    public Iterable<com.oracle.bmc.cloudguard.model.DetectorRuleSummary>
            listDetectorRulesRecordIterator(final ListDetectorRulesRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListDetectorRulesRequest.Builder, ListDetectorRulesRequest,
                ListDetectorRulesResponse, com.oracle.bmc.cloudguard.model.DetectorRuleSummary>(
                new java.util.function.Supplier<ListDetectorRulesRequest.Builder>() {
                    @Override
                    public ListDetectorRulesRequest.Builder get() {
                        return ListDetectorRulesRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListDetectorRulesResponse, String>() {
                    @Override
                    public String apply(ListDetectorRulesResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListDetectorRulesRequest.Builder>,
                        ListDetectorRulesRequest>() {
                    @Override
                    public ListDetectorRulesRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListDetectorRulesRequest.Builder>
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
                        ListDetectorRulesRequest, ListDetectorRulesResponse>() {
                    @Override
                    public ListDetectorRulesResponse apply(ListDetectorRulesRequest request) {
                        return client.listDetectorRules(request);
                    }
                },
                new java.util.function.Function<
                        ListDetectorRulesResponse,
                        java.util.List<com.oracle.bmc.cloudguard.model.DetectorRuleSummary>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.cloudguard.model.DetectorRuleSummary>
                            apply(ListDetectorRulesResponse response) {
                        return response.getDetectorRuleCollection().getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the listDetectors operation. This iterable
     * will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses received from the service.
     */
    public Iterable<ListDetectorsResponse> listDetectorsResponseIterator(
            final ListDetectorsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListDetectorsRequest.Builder, ListDetectorsRequest, ListDetectorsResponse>(
                new java.util.function.Supplier<ListDetectorsRequest.Builder>() {
                    @Override
                    public ListDetectorsRequest.Builder get() {
                        return ListDetectorsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListDetectorsResponse, String>() {
                    @Override
                    public String apply(ListDetectorsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListDetectorsRequest.Builder>,
                        ListDetectorsRequest>() {
                    @Override
                    public ListDetectorsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListDetectorsRequest.Builder>
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
                new java.util.function.Function<ListDetectorsRequest, ListDetectorsResponse>() {
                    @Override
                    public ListDetectorsResponse apply(ListDetectorsRequest request) {
                        return client.listDetectors(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link com.oracle.bmc.cloudguard.model.DetectorSummary} objects
     * contained in responses from the listDetectors operation. This iterable will fetch more data from the
     * server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link com.oracle.bmc.cloudguard.model.DetectorSummary} objects
     * contained in responses received from the service.
     */
    public Iterable<com.oracle.bmc.cloudguard.model.DetectorSummary> listDetectorsRecordIterator(
            final ListDetectorsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListDetectorsRequest.Builder, ListDetectorsRequest, ListDetectorsResponse,
                com.oracle.bmc.cloudguard.model.DetectorSummary>(
                new java.util.function.Supplier<ListDetectorsRequest.Builder>() {
                    @Override
                    public ListDetectorsRequest.Builder get() {
                        return ListDetectorsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListDetectorsResponse, String>() {
                    @Override
                    public String apply(ListDetectorsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListDetectorsRequest.Builder>,
                        ListDetectorsRequest>() {
                    @Override
                    public ListDetectorsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListDetectorsRequest.Builder>
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
                new java.util.function.Function<ListDetectorsRequest, ListDetectorsResponse>() {
                    @Override
                    public ListDetectorsResponse apply(ListDetectorsRequest request) {
                        return client.listDetectors(request);
                    }
                },
                new java.util.function.Function<
                        ListDetectorsResponse,
                        java.util.List<com.oracle.bmc.cloudguard.model.DetectorSummary>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.cloudguard.model.DetectorSummary> apply(
                            ListDetectorsResponse response) {
                        return response.getDetectorCollection().getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the listImpactedResources operation. This iterable
     * will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses received from the service.
     */
    public Iterable<ListImpactedResourcesResponse> listImpactedResourcesResponseIterator(
            final ListImpactedResourcesRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListImpactedResourcesRequest.Builder, ListImpactedResourcesRequest,
                ListImpactedResourcesResponse>(
                new java.util.function.Supplier<ListImpactedResourcesRequest.Builder>() {
                    @Override
                    public ListImpactedResourcesRequest.Builder get() {
                        return ListImpactedResourcesRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListImpactedResourcesResponse, String>() {
                    @Override
                    public String apply(ListImpactedResourcesResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListImpactedResourcesRequest.Builder>,
                        ListImpactedResourcesRequest>() {
                    @Override
                    public ListImpactedResourcesRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListImpactedResourcesRequest.Builder>
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
                        ListImpactedResourcesRequest, ListImpactedResourcesResponse>() {
                    @Override
                    public ListImpactedResourcesResponse apply(
                            ListImpactedResourcesRequest request) {
                        return client.listImpactedResources(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link com.oracle.bmc.cloudguard.model.ImpactedResourceSummary} objects
     * contained in responses from the listImpactedResources operation. This iterable will fetch more data from the
     * server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link com.oracle.bmc.cloudguard.model.ImpactedResourceSummary} objects
     * contained in responses received from the service.
     */
    public Iterable<com.oracle.bmc.cloudguard.model.ImpactedResourceSummary>
            listImpactedResourcesRecordIterator(final ListImpactedResourcesRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListImpactedResourcesRequest.Builder, ListImpactedResourcesRequest,
                ListImpactedResourcesResponse,
                com.oracle.bmc.cloudguard.model.ImpactedResourceSummary>(
                new java.util.function.Supplier<ListImpactedResourcesRequest.Builder>() {
                    @Override
                    public ListImpactedResourcesRequest.Builder get() {
                        return ListImpactedResourcesRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListImpactedResourcesResponse, String>() {
                    @Override
                    public String apply(ListImpactedResourcesResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListImpactedResourcesRequest.Builder>,
                        ListImpactedResourcesRequest>() {
                    @Override
                    public ListImpactedResourcesRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListImpactedResourcesRequest.Builder>
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
                        ListImpactedResourcesRequest, ListImpactedResourcesResponse>() {
                    @Override
                    public ListImpactedResourcesResponse apply(
                            ListImpactedResourcesRequest request) {
                        return client.listImpactedResources(request);
                    }
                },
                new java.util.function.Function<
                        ListImpactedResourcesResponse,
                        java.util.List<com.oracle.bmc.cloudguard.model.ImpactedResourceSummary>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.cloudguard.model.ImpactedResourceSummary>
                            apply(ListImpactedResourcesResponse response) {
                        return response.getImpactedResourceCollection().getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the listManagedListTypes operation. This iterable
     * will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses received from the service.
     */
    public Iterable<ListManagedListTypesResponse> listManagedListTypesResponseIterator(
            final ListManagedListTypesRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListManagedListTypesRequest.Builder, ListManagedListTypesRequest,
                ListManagedListTypesResponse>(
                new java.util.function.Supplier<ListManagedListTypesRequest.Builder>() {
                    @Override
                    public ListManagedListTypesRequest.Builder get() {
                        return ListManagedListTypesRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListManagedListTypesResponse, String>() {
                    @Override
                    public String apply(ListManagedListTypesResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListManagedListTypesRequest.Builder>,
                        ListManagedListTypesRequest>() {
                    @Override
                    public ListManagedListTypesRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListManagedListTypesRequest.Builder>
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
                        ListManagedListTypesRequest, ListManagedListTypesResponse>() {
                    @Override
                    public ListManagedListTypesResponse apply(ListManagedListTypesRequest request) {
                        return client.listManagedListTypes(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link com.oracle.bmc.cloudguard.model.ManagedListTypeSummary} objects
     * contained in responses from the listManagedListTypes operation. This iterable will fetch more data from the
     * server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link com.oracle.bmc.cloudguard.model.ManagedListTypeSummary} objects
     * contained in responses received from the service.
     */
    public Iterable<com.oracle.bmc.cloudguard.model.ManagedListTypeSummary>
            listManagedListTypesRecordIterator(final ListManagedListTypesRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListManagedListTypesRequest.Builder, ListManagedListTypesRequest,
                ListManagedListTypesResponse,
                com.oracle.bmc.cloudguard.model.ManagedListTypeSummary>(
                new java.util.function.Supplier<ListManagedListTypesRequest.Builder>() {
                    @Override
                    public ListManagedListTypesRequest.Builder get() {
                        return ListManagedListTypesRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListManagedListTypesResponse, String>() {
                    @Override
                    public String apply(ListManagedListTypesResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListManagedListTypesRequest.Builder>,
                        ListManagedListTypesRequest>() {
                    @Override
                    public ListManagedListTypesRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListManagedListTypesRequest.Builder>
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
                        ListManagedListTypesRequest, ListManagedListTypesResponse>() {
                    @Override
                    public ListManagedListTypesResponse apply(ListManagedListTypesRequest request) {
                        return client.listManagedListTypes(request);
                    }
                },
                new java.util.function.Function<
                        ListManagedListTypesResponse,
                        java.util.List<com.oracle.bmc.cloudguard.model.ManagedListTypeSummary>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.cloudguard.model.ManagedListTypeSummary>
                            apply(ListManagedListTypesResponse response) {
                        return response.getManagedListTypeCollection().getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the listManagedLists operation. This iterable
     * will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses received from the service.
     */
    public Iterable<ListManagedListsResponse> listManagedListsResponseIterator(
            final ListManagedListsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListManagedListsRequest.Builder, ListManagedListsRequest, ListManagedListsResponse>(
                new java.util.function.Supplier<ListManagedListsRequest.Builder>() {
                    @Override
                    public ListManagedListsRequest.Builder get() {
                        return ListManagedListsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListManagedListsResponse, String>() {
                    @Override
                    public String apply(ListManagedListsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListManagedListsRequest.Builder>,
                        ListManagedListsRequest>() {
                    @Override
                    public ListManagedListsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListManagedListsRequest.Builder>
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
                        ListManagedListsRequest, ListManagedListsResponse>() {
                    @Override
                    public ListManagedListsResponse apply(ListManagedListsRequest request) {
                        return client.listManagedLists(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link com.oracle.bmc.cloudguard.model.ManagedListSummary} objects
     * contained in responses from the listManagedLists operation. This iterable will fetch more data from the
     * server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link com.oracle.bmc.cloudguard.model.ManagedListSummary} objects
     * contained in responses received from the service.
     */
    public Iterable<com.oracle.bmc.cloudguard.model.ManagedListSummary>
            listManagedListsRecordIterator(final ListManagedListsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListManagedListsRequest.Builder, ListManagedListsRequest, ListManagedListsResponse,
                com.oracle.bmc.cloudguard.model.ManagedListSummary>(
                new java.util.function.Supplier<ListManagedListsRequest.Builder>() {
                    @Override
                    public ListManagedListsRequest.Builder get() {
                        return ListManagedListsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListManagedListsResponse, String>() {
                    @Override
                    public String apply(ListManagedListsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListManagedListsRequest.Builder>,
                        ListManagedListsRequest>() {
                    @Override
                    public ListManagedListsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListManagedListsRequest.Builder>
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
                        ListManagedListsRequest, ListManagedListsResponse>() {
                    @Override
                    public ListManagedListsResponse apply(ListManagedListsRequest request) {
                        return client.listManagedLists(request);
                    }
                },
                new java.util.function.Function<
                        ListManagedListsResponse,
                        java.util.List<com.oracle.bmc.cloudguard.model.ManagedListSummary>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.cloudguard.model.ManagedListSummary> apply(
                            ListManagedListsResponse response) {
                        return response.getManagedListCollection().getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the listPolicies operation. This iterable
     * will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses received from the service.
     */
    public Iterable<ListPoliciesResponse> listPoliciesResponseIterator(
            final ListPoliciesRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListPoliciesRequest.Builder, ListPoliciesRequest, ListPoliciesResponse>(
                new java.util.function.Supplier<ListPoliciesRequest.Builder>() {
                    @Override
                    public ListPoliciesRequest.Builder get() {
                        return ListPoliciesRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListPoliciesResponse, String>() {
                    @Override
                    public String apply(ListPoliciesResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListPoliciesRequest.Builder>,
                        ListPoliciesRequest>() {
                    @Override
                    public ListPoliciesRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListPoliciesRequest.Builder>
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
                new java.util.function.Function<ListPoliciesRequest, ListPoliciesResponse>() {
                    @Override
                    public ListPoliciesResponse apply(ListPoliciesRequest request) {
                        return client.listPolicies(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link com.oracle.bmc.cloudguard.model.PolicySummary} objects
     * contained in responses from the listPolicies operation. This iterable will fetch more data from the
     * server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link com.oracle.bmc.cloudguard.model.PolicySummary} objects
     * contained in responses received from the service.
     */
    public Iterable<com.oracle.bmc.cloudguard.model.PolicySummary> listPoliciesRecordIterator(
            final ListPoliciesRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListPoliciesRequest.Builder, ListPoliciesRequest, ListPoliciesResponse,
                com.oracle.bmc.cloudguard.model.PolicySummary>(
                new java.util.function.Supplier<ListPoliciesRequest.Builder>() {
                    @Override
                    public ListPoliciesRequest.Builder get() {
                        return ListPoliciesRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListPoliciesResponse, String>() {
                    @Override
                    public String apply(ListPoliciesResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListPoliciesRequest.Builder>,
                        ListPoliciesRequest>() {
                    @Override
                    public ListPoliciesRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListPoliciesRequest.Builder>
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
                new java.util.function.Function<ListPoliciesRequest, ListPoliciesResponse>() {
                    @Override
                    public ListPoliciesResponse apply(ListPoliciesRequest request) {
                        return client.listPolicies(request);
                    }
                },
                new java.util.function.Function<
                        ListPoliciesResponse,
                        java.util.List<com.oracle.bmc.cloudguard.model.PolicySummary>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.cloudguard.model.PolicySummary> apply(
                            ListPoliciesResponse response) {
                        return response.getPolicyCollection().getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the listProblemEndpoints operation. This iterable
     * will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses received from the service.
     */
    public Iterable<ListProblemEndpointsResponse> listProblemEndpointsResponseIterator(
            final ListProblemEndpointsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListProblemEndpointsRequest.Builder, ListProblemEndpointsRequest,
                ListProblemEndpointsResponse>(
                new java.util.function.Supplier<ListProblemEndpointsRequest.Builder>() {
                    @Override
                    public ListProblemEndpointsRequest.Builder get() {
                        return ListProblemEndpointsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListProblemEndpointsResponse, String>() {
                    @Override
                    public String apply(ListProblemEndpointsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListProblemEndpointsRequest.Builder>,
                        ListProblemEndpointsRequest>() {
                    @Override
                    public ListProblemEndpointsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListProblemEndpointsRequest.Builder>
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
                        ListProblemEndpointsRequest, ListProblemEndpointsResponse>() {
                    @Override
                    public ListProblemEndpointsResponse apply(ListProblemEndpointsRequest request) {
                        return client.listProblemEndpoints(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link com.oracle.bmc.cloudguard.model.ProblemEndpointSummary} objects
     * contained in responses from the listProblemEndpoints operation. This iterable will fetch more data from the
     * server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link com.oracle.bmc.cloudguard.model.ProblemEndpointSummary} objects
     * contained in responses received from the service.
     */
    public Iterable<com.oracle.bmc.cloudguard.model.ProblemEndpointSummary>
            listProblemEndpointsRecordIterator(final ListProblemEndpointsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListProblemEndpointsRequest.Builder, ListProblemEndpointsRequest,
                ListProblemEndpointsResponse,
                com.oracle.bmc.cloudguard.model.ProblemEndpointSummary>(
                new java.util.function.Supplier<ListProblemEndpointsRequest.Builder>() {
                    @Override
                    public ListProblemEndpointsRequest.Builder get() {
                        return ListProblemEndpointsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListProblemEndpointsResponse, String>() {
                    @Override
                    public String apply(ListProblemEndpointsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListProblemEndpointsRequest.Builder>,
                        ListProblemEndpointsRequest>() {
                    @Override
                    public ListProblemEndpointsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListProblemEndpointsRequest.Builder>
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
                        ListProblemEndpointsRequest, ListProblemEndpointsResponse>() {
                    @Override
                    public ListProblemEndpointsResponse apply(ListProblemEndpointsRequest request) {
                        return client.listProblemEndpoints(request);
                    }
                },
                new java.util.function.Function<
                        ListProblemEndpointsResponse,
                        java.util.List<com.oracle.bmc.cloudguard.model.ProblemEndpointSummary>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.cloudguard.model.ProblemEndpointSummary>
                            apply(ListProblemEndpointsResponse response) {
                        return response.getProblemEndpointCollection().getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the listProblemEntities operation. This iterable
     * will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses received from the service.
     */
    public Iterable<ListProblemEntitiesResponse> listProblemEntitiesResponseIterator(
            final ListProblemEntitiesRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListProblemEntitiesRequest.Builder, ListProblemEntitiesRequest,
                ListProblemEntitiesResponse>(
                new java.util.function.Supplier<ListProblemEntitiesRequest.Builder>() {
                    @Override
                    public ListProblemEntitiesRequest.Builder get() {
                        return ListProblemEntitiesRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListProblemEntitiesResponse, String>() {
                    @Override
                    public String apply(ListProblemEntitiesResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListProblemEntitiesRequest.Builder>,
                        ListProblemEntitiesRequest>() {
                    @Override
                    public ListProblemEntitiesRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListProblemEntitiesRequest.Builder>
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
                        ListProblemEntitiesRequest, ListProblemEntitiesResponse>() {
                    @Override
                    public ListProblemEntitiesResponse apply(ListProblemEntitiesRequest request) {
                        return client.listProblemEntities(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link com.oracle.bmc.cloudguard.model.ProblemEntitySummary} objects
     * contained in responses from the listProblemEntities operation. This iterable will fetch more data from the
     * server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link com.oracle.bmc.cloudguard.model.ProblemEntitySummary} objects
     * contained in responses received from the service.
     */
    public Iterable<com.oracle.bmc.cloudguard.model.ProblemEntitySummary>
            listProblemEntitiesRecordIterator(final ListProblemEntitiesRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListProblemEntitiesRequest.Builder, ListProblemEntitiesRequest,
                ListProblemEntitiesResponse, com.oracle.bmc.cloudguard.model.ProblemEntitySummary>(
                new java.util.function.Supplier<ListProblemEntitiesRequest.Builder>() {
                    @Override
                    public ListProblemEntitiesRequest.Builder get() {
                        return ListProblemEntitiesRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListProblemEntitiesResponse, String>() {
                    @Override
                    public String apply(ListProblemEntitiesResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListProblemEntitiesRequest.Builder>,
                        ListProblemEntitiesRequest>() {
                    @Override
                    public ListProblemEntitiesRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListProblemEntitiesRequest.Builder>
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
                        ListProblemEntitiesRequest, ListProblemEntitiesResponse>() {
                    @Override
                    public ListProblemEntitiesResponse apply(ListProblemEntitiesRequest request) {
                        return client.listProblemEntities(request);
                    }
                },
                new java.util.function.Function<
                        ListProblemEntitiesResponse,
                        java.util.List<com.oracle.bmc.cloudguard.model.ProblemEntitySummary>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.cloudguard.model.ProblemEntitySummary>
                            apply(ListProblemEntitiesResponse response) {
                        return response.getProblemEntityCollection().getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the listProblemHistories operation. This iterable
     * will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses received from the service.
     */
    public Iterable<ListProblemHistoriesResponse> listProblemHistoriesResponseIterator(
            final ListProblemHistoriesRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListProblemHistoriesRequest.Builder, ListProblemHistoriesRequest,
                ListProblemHistoriesResponse>(
                new java.util.function.Supplier<ListProblemHistoriesRequest.Builder>() {
                    @Override
                    public ListProblemHistoriesRequest.Builder get() {
                        return ListProblemHistoriesRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListProblemHistoriesResponse, String>() {
                    @Override
                    public String apply(ListProblemHistoriesResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListProblemHistoriesRequest.Builder>,
                        ListProblemHistoriesRequest>() {
                    @Override
                    public ListProblemHistoriesRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListProblemHistoriesRequest.Builder>
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
                        ListProblemHistoriesRequest, ListProblemHistoriesResponse>() {
                    @Override
                    public ListProblemHistoriesResponse apply(ListProblemHistoriesRequest request) {
                        return client.listProblemHistories(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link com.oracle.bmc.cloudguard.model.ProblemHistorySummary} objects
     * contained in responses from the listProblemHistories operation. This iterable will fetch more data from the
     * server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link com.oracle.bmc.cloudguard.model.ProblemHistorySummary} objects
     * contained in responses received from the service.
     */
    public Iterable<com.oracle.bmc.cloudguard.model.ProblemHistorySummary>
            listProblemHistoriesRecordIterator(final ListProblemHistoriesRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListProblemHistoriesRequest.Builder, ListProblemHistoriesRequest,
                ListProblemHistoriesResponse,
                com.oracle.bmc.cloudguard.model.ProblemHistorySummary>(
                new java.util.function.Supplier<ListProblemHistoriesRequest.Builder>() {
                    @Override
                    public ListProblemHistoriesRequest.Builder get() {
                        return ListProblemHistoriesRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListProblemHistoriesResponse, String>() {
                    @Override
                    public String apply(ListProblemHistoriesResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListProblemHistoriesRequest.Builder>,
                        ListProblemHistoriesRequest>() {
                    @Override
                    public ListProblemHistoriesRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListProblemHistoriesRequest.Builder>
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
                        ListProblemHistoriesRequest, ListProblemHistoriesResponse>() {
                    @Override
                    public ListProblemHistoriesResponse apply(ListProblemHistoriesRequest request) {
                        return client.listProblemHistories(request);
                    }
                },
                new java.util.function.Function<
                        ListProblemHistoriesResponse,
                        java.util.List<com.oracle.bmc.cloudguard.model.ProblemHistorySummary>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.cloudguard.model.ProblemHistorySummary>
                            apply(ListProblemHistoriesResponse response) {
                        return response.getProblemHistoryCollection().getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the listProblems operation. This iterable
     * will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses received from the service.
     */
    public Iterable<ListProblemsResponse> listProblemsResponseIterator(
            final ListProblemsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListProblemsRequest.Builder, ListProblemsRequest, ListProblemsResponse>(
                new java.util.function.Supplier<ListProblemsRequest.Builder>() {
                    @Override
                    public ListProblemsRequest.Builder get() {
                        return ListProblemsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListProblemsResponse, String>() {
                    @Override
                    public String apply(ListProblemsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListProblemsRequest.Builder>,
                        ListProblemsRequest>() {
                    @Override
                    public ListProblemsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListProblemsRequest.Builder>
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
                new java.util.function.Function<ListProblemsRequest, ListProblemsResponse>() {
                    @Override
                    public ListProblemsResponse apply(ListProblemsRequest request) {
                        return client.listProblems(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link com.oracle.bmc.cloudguard.model.ProblemSummary} objects
     * contained in responses from the listProblems operation. This iterable will fetch more data from the
     * server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link com.oracle.bmc.cloudguard.model.ProblemSummary} objects
     * contained in responses received from the service.
     */
    public Iterable<com.oracle.bmc.cloudguard.model.ProblemSummary> listProblemsRecordIterator(
            final ListProblemsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListProblemsRequest.Builder, ListProblemsRequest, ListProblemsResponse,
                com.oracle.bmc.cloudguard.model.ProblemSummary>(
                new java.util.function.Supplier<ListProblemsRequest.Builder>() {
                    @Override
                    public ListProblemsRequest.Builder get() {
                        return ListProblemsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListProblemsResponse, String>() {
                    @Override
                    public String apply(ListProblemsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListProblemsRequest.Builder>,
                        ListProblemsRequest>() {
                    @Override
                    public ListProblemsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListProblemsRequest.Builder>
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
                new java.util.function.Function<ListProblemsRequest, ListProblemsResponse>() {
                    @Override
                    public ListProblemsResponse apply(ListProblemsRequest request) {
                        return client.listProblems(request);
                    }
                },
                new java.util.function.Function<
                        ListProblemsResponse,
                        java.util.List<com.oracle.bmc.cloudguard.model.ProblemSummary>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.cloudguard.model.ProblemSummary> apply(
                            ListProblemsResponse response) {
                        return response.getProblemCollection().getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the listRecommendations operation. This iterable
     * will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses received from the service.
     */
    public Iterable<ListRecommendationsResponse> listRecommendationsResponseIterator(
            final ListRecommendationsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListRecommendationsRequest.Builder, ListRecommendationsRequest,
                ListRecommendationsResponse>(
                new java.util.function.Supplier<ListRecommendationsRequest.Builder>() {
                    @Override
                    public ListRecommendationsRequest.Builder get() {
                        return ListRecommendationsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListRecommendationsResponse, String>() {
                    @Override
                    public String apply(ListRecommendationsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListRecommendationsRequest.Builder>,
                        ListRecommendationsRequest>() {
                    @Override
                    public ListRecommendationsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListRecommendationsRequest.Builder>
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
                        ListRecommendationsRequest, ListRecommendationsResponse>() {
                    @Override
                    public ListRecommendationsResponse apply(ListRecommendationsRequest request) {
                        return client.listRecommendations(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link com.oracle.bmc.cloudguard.model.RecommendationSummary} objects
     * contained in responses from the listRecommendations operation. This iterable will fetch more data from the
     * server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link com.oracle.bmc.cloudguard.model.RecommendationSummary} objects
     * contained in responses received from the service.
     */
    public Iterable<com.oracle.bmc.cloudguard.model.RecommendationSummary>
            listRecommendationsRecordIterator(final ListRecommendationsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListRecommendationsRequest.Builder, ListRecommendationsRequest,
                ListRecommendationsResponse, com.oracle.bmc.cloudguard.model.RecommendationSummary>(
                new java.util.function.Supplier<ListRecommendationsRequest.Builder>() {
                    @Override
                    public ListRecommendationsRequest.Builder get() {
                        return ListRecommendationsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListRecommendationsResponse, String>() {
                    @Override
                    public String apply(ListRecommendationsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListRecommendationsRequest.Builder>,
                        ListRecommendationsRequest>() {
                    @Override
                    public ListRecommendationsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListRecommendationsRequest.Builder>
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
                        ListRecommendationsRequest, ListRecommendationsResponse>() {
                    @Override
                    public ListRecommendationsResponse apply(ListRecommendationsRequest request) {
                        return client.listRecommendations(request);
                    }
                },
                new java.util.function.Function<
                        ListRecommendationsResponse,
                        java.util.List<com.oracle.bmc.cloudguard.model.RecommendationSummary>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.cloudguard.model.RecommendationSummary>
                            apply(ListRecommendationsResponse response) {
                        return response.getRecommendationSummaryCollection().getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the listResourcePorts operation. This iterable
     * will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses received from the service.
     */
    public Iterable<ListResourcePortsResponse> listResourcePortsResponseIterator(
            final ListResourcePortsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListResourcePortsRequest.Builder, ListResourcePortsRequest,
                ListResourcePortsResponse>(
                new java.util.function.Supplier<ListResourcePortsRequest.Builder>() {
                    @Override
                    public ListResourcePortsRequest.Builder get() {
                        return ListResourcePortsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListResourcePortsResponse, String>() {
                    @Override
                    public String apply(ListResourcePortsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListResourcePortsRequest.Builder>,
                        ListResourcePortsRequest>() {
                    @Override
                    public ListResourcePortsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListResourcePortsRequest.Builder>
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
                        ListResourcePortsRequest, ListResourcePortsResponse>() {
                    @Override
                    public ListResourcePortsResponse apply(ListResourcePortsRequest request) {
                        return client.listResourcePorts(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link com.oracle.bmc.cloudguard.model.ResourcePortSummary} objects
     * contained in responses from the listResourcePorts operation. This iterable will fetch more data from the
     * server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link com.oracle.bmc.cloudguard.model.ResourcePortSummary} objects
     * contained in responses received from the service.
     */
    public Iterable<com.oracle.bmc.cloudguard.model.ResourcePortSummary>
            listResourcePortsRecordIterator(final ListResourcePortsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListResourcePortsRequest.Builder, ListResourcePortsRequest,
                ListResourcePortsResponse, com.oracle.bmc.cloudguard.model.ResourcePortSummary>(
                new java.util.function.Supplier<ListResourcePortsRequest.Builder>() {
                    @Override
                    public ListResourcePortsRequest.Builder get() {
                        return ListResourcePortsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListResourcePortsResponse, String>() {
                    @Override
                    public String apply(ListResourcePortsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListResourcePortsRequest.Builder>,
                        ListResourcePortsRequest>() {
                    @Override
                    public ListResourcePortsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListResourcePortsRequest.Builder>
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
                        ListResourcePortsRequest, ListResourcePortsResponse>() {
                    @Override
                    public ListResourcePortsResponse apply(ListResourcePortsRequest request) {
                        return client.listResourcePorts(request);
                    }
                },
                new java.util.function.Function<
                        ListResourcePortsResponse,
                        java.util.List<com.oracle.bmc.cloudguard.model.ResourcePortSummary>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.cloudguard.model.ResourcePortSummary>
                            apply(ListResourcePortsResponse response) {
                        return response.getResourcePortCollection().getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the listResourceProfileEndpoints operation. This iterable
     * will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses received from the service.
     */
    public Iterable<ListResourceProfileEndpointsResponse>
            listResourceProfileEndpointsResponseIterator(
                    final ListResourceProfileEndpointsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListResourceProfileEndpointsRequest.Builder, ListResourceProfileEndpointsRequest,
                ListResourceProfileEndpointsResponse>(
                new java.util.function.Supplier<ListResourceProfileEndpointsRequest.Builder>() {
                    @Override
                    public ListResourceProfileEndpointsRequest.Builder get() {
                        return ListResourceProfileEndpointsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListResourceProfileEndpointsResponse, String>() {
                    @Override
                    public String apply(ListResourceProfileEndpointsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListResourceProfileEndpointsRequest.Builder>,
                        ListResourceProfileEndpointsRequest>() {
                    @Override
                    public ListResourceProfileEndpointsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListResourceProfileEndpointsRequest.Builder>
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
                        ListResourceProfileEndpointsRequest,
                        ListResourceProfileEndpointsResponse>() {
                    @Override
                    public ListResourceProfileEndpointsResponse apply(
                            ListResourceProfileEndpointsRequest request) {
                        return client.listResourceProfileEndpoints(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link com.oracle.bmc.cloudguard.model.ResourceProfileEndpointSummary} objects
     * contained in responses from the listResourceProfileEndpoints operation. This iterable will fetch more data from the
     * server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link com.oracle.bmc.cloudguard.model.ResourceProfileEndpointSummary} objects
     * contained in responses received from the service.
     */
    public Iterable<com.oracle.bmc.cloudguard.model.ResourceProfileEndpointSummary>
            listResourceProfileEndpointsRecordIterator(
                    final ListResourceProfileEndpointsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListResourceProfileEndpointsRequest.Builder, ListResourceProfileEndpointsRequest,
                ListResourceProfileEndpointsResponse,
                com.oracle.bmc.cloudguard.model.ResourceProfileEndpointSummary>(
                new java.util.function.Supplier<ListResourceProfileEndpointsRequest.Builder>() {
                    @Override
                    public ListResourceProfileEndpointsRequest.Builder get() {
                        return ListResourceProfileEndpointsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListResourceProfileEndpointsResponse, String>() {
                    @Override
                    public String apply(ListResourceProfileEndpointsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListResourceProfileEndpointsRequest.Builder>,
                        ListResourceProfileEndpointsRequest>() {
                    @Override
                    public ListResourceProfileEndpointsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListResourceProfileEndpointsRequest.Builder>
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
                        ListResourceProfileEndpointsRequest,
                        ListResourceProfileEndpointsResponse>() {
                    @Override
                    public ListResourceProfileEndpointsResponse apply(
                            ListResourceProfileEndpointsRequest request) {
                        return client.listResourceProfileEndpoints(request);
                    }
                },
                new java.util.function.Function<
                        ListResourceProfileEndpointsResponse,
                        java.util.List<
                                com.oracle.bmc.cloudguard.model.ResourceProfileEndpointSummary>>() {
                    @Override
                    public java.util.List<
                                    com.oracle.bmc.cloudguard.model.ResourceProfileEndpointSummary>
                            apply(ListResourceProfileEndpointsResponse response) {
                        return response.getResourceProfileEndpointCollection().getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the listResourceProfileImpactedResources operation. This iterable
     * will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses received from the service.
     */
    public Iterable<ListResourceProfileImpactedResourcesResponse>
            listResourceProfileImpactedResourcesResponseIterator(
                    final ListResourceProfileImpactedResourcesRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListResourceProfileImpactedResourcesRequest.Builder,
                ListResourceProfileImpactedResourcesRequest,
                ListResourceProfileImpactedResourcesResponse>(
                new java.util.function.Supplier<
                        ListResourceProfileImpactedResourcesRequest.Builder>() {
                    @Override
                    public ListResourceProfileImpactedResourcesRequest.Builder get() {
                        return ListResourceProfileImpactedResourcesRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<
                        ListResourceProfileImpactedResourcesResponse, String>() {
                    @Override
                    public String apply(ListResourceProfileImpactedResourcesResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListResourceProfileImpactedResourcesRequest.Builder>,
                        ListResourceProfileImpactedResourcesRequest>() {
                    @Override
                    public ListResourceProfileImpactedResourcesRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListResourceProfileImpactedResourcesRequest.Builder>
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
                        ListResourceProfileImpactedResourcesRequest,
                        ListResourceProfileImpactedResourcesResponse>() {
                    @Override
                    public ListResourceProfileImpactedResourcesResponse apply(
                            ListResourceProfileImpactedResourcesRequest request) {
                        return client.listResourceProfileImpactedResources(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link com.oracle.bmc.cloudguard.model.ResourceProfileImpactedResourceSummary} objects
     * contained in responses from the listResourceProfileImpactedResources operation. This iterable will fetch more data from the
     * server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link com.oracle.bmc.cloudguard.model.ResourceProfileImpactedResourceSummary} objects
     * contained in responses received from the service.
     */
    public Iterable<com.oracle.bmc.cloudguard.model.ResourceProfileImpactedResourceSummary>
            listResourceProfileImpactedResourcesRecordIterator(
                    final ListResourceProfileImpactedResourcesRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListResourceProfileImpactedResourcesRequest.Builder,
                ListResourceProfileImpactedResourcesRequest,
                ListResourceProfileImpactedResourcesResponse,
                com.oracle.bmc.cloudguard.model.ResourceProfileImpactedResourceSummary>(
                new java.util.function.Supplier<
                        ListResourceProfileImpactedResourcesRequest.Builder>() {
                    @Override
                    public ListResourceProfileImpactedResourcesRequest.Builder get() {
                        return ListResourceProfileImpactedResourcesRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<
                        ListResourceProfileImpactedResourcesResponse, String>() {
                    @Override
                    public String apply(ListResourceProfileImpactedResourcesResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListResourceProfileImpactedResourcesRequest.Builder>,
                        ListResourceProfileImpactedResourcesRequest>() {
                    @Override
                    public ListResourceProfileImpactedResourcesRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListResourceProfileImpactedResourcesRequest.Builder>
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
                        ListResourceProfileImpactedResourcesRequest,
                        ListResourceProfileImpactedResourcesResponse>() {
                    @Override
                    public ListResourceProfileImpactedResourcesResponse apply(
                            ListResourceProfileImpactedResourcesRequest request) {
                        return client.listResourceProfileImpactedResources(request);
                    }
                },
                new java.util.function.Function<
                        ListResourceProfileImpactedResourcesResponse,
                        java.util.List<
                                com.oracle.bmc.cloudguard.model
                                        .ResourceProfileImpactedResourceSummary>>() {
                    @Override
                    public java.util.List<
                                    com.oracle.bmc.cloudguard.model
                                            .ResourceProfileImpactedResourceSummary>
                            apply(ListResourceProfileImpactedResourcesResponse response) {
                        return response.getResourceProfileImpactedResourceCollection().getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the listResourceProfiles operation. This iterable
     * will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses received from the service.
     */
    public Iterable<ListResourceProfilesResponse> listResourceProfilesResponseIterator(
            final ListResourceProfilesRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListResourceProfilesRequest.Builder, ListResourceProfilesRequest,
                ListResourceProfilesResponse>(
                new java.util.function.Supplier<ListResourceProfilesRequest.Builder>() {
                    @Override
                    public ListResourceProfilesRequest.Builder get() {
                        return ListResourceProfilesRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListResourceProfilesResponse, String>() {
                    @Override
                    public String apply(ListResourceProfilesResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListResourceProfilesRequest.Builder>,
                        ListResourceProfilesRequest>() {
                    @Override
                    public ListResourceProfilesRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListResourceProfilesRequest.Builder>
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
                        ListResourceProfilesRequest, ListResourceProfilesResponse>() {
                    @Override
                    public ListResourceProfilesResponse apply(ListResourceProfilesRequest request) {
                        return client.listResourceProfiles(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link com.oracle.bmc.cloudguard.model.ResourceProfileSummary} objects
     * contained in responses from the listResourceProfiles operation. This iterable will fetch more data from the
     * server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link com.oracle.bmc.cloudguard.model.ResourceProfileSummary} objects
     * contained in responses received from the service.
     */
    public Iterable<com.oracle.bmc.cloudguard.model.ResourceProfileSummary>
            listResourceProfilesRecordIterator(final ListResourceProfilesRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListResourceProfilesRequest.Builder, ListResourceProfilesRequest,
                ListResourceProfilesResponse,
                com.oracle.bmc.cloudguard.model.ResourceProfileSummary>(
                new java.util.function.Supplier<ListResourceProfilesRequest.Builder>() {
                    @Override
                    public ListResourceProfilesRequest.Builder get() {
                        return ListResourceProfilesRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListResourceProfilesResponse, String>() {
                    @Override
                    public String apply(ListResourceProfilesResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListResourceProfilesRequest.Builder>,
                        ListResourceProfilesRequest>() {
                    @Override
                    public ListResourceProfilesRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListResourceProfilesRequest.Builder>
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
                        ListResourceProfilesRequest, ListResourceProfilesResponse>() {
                    @Override
                    public ListResourceProfilesResponse apply(ListResourceProfilesRequest request) {
                        return client.listResourceProfiles(request);
                    }
                },
                new java.util.function.Function<
                        ListResourceProfilesResponse,
                        java.util.List<com.oracle.bmc.cloudguard.model.ResourceProfileSummary>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.cloudguard.model.ResourceProfileSummary>
                            apply(ListResourceProfilesResponse response) {
                        return response.getResourceProfileCollection().getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the listResourceTypes operation. This iterable
     * will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses received from the service.
     */
    public Iterable<ListResourceTypesResponse> listResourceTypesResponseIterator(
            final ListResourceTypesRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListResourceTypesRequest.Builder, ListResourceTypesRequest,
                ListResourceTypesResponse>(
                new java.util.function.Supplier<ListResourceTypesRequest.Builder>() {
                    @Override
                    public ListResourceTypesRequest.Builder get() {
                        return ListResourceTypesRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListResourceTypesResponse, String>() {
                    @Override
                    public String apply(ListResourceTypesResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListResourceTypesRequest.Builder>,
                        ListResourceTypesRequest>() {
                    @Override
                    public ListResourceTypesRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListResourceTypesRequest.Builder>
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
                        ListResourceTypesRequest, ListResourceTypesResponse>() {
                    @Override
                    public ListResourceTypesResponse apply(ListResourceTypesRequest request) {
                        return client.listResourceTypes(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link com.oracle.bmc.cloudguard.model.ResourceTypeSummary} objects
     * contained in responses from the listResourceTypes operation. This iterable will fetch more data from the
     * server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link com.oracle.bmc.cloudguard.model.ResourceTypeSummary} objects
     * contained in responses received from the service.
     */
    public Iterable<com.oracle.bmc.cloudguard.model.ResourceTypeSummary>
            listResourceTypesRecordIterator(final ListResourceTypesRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListResourceTypesRequest.Builder, ListResourceTypesRequest,
                ListResourceTypesResponse, com.oracle.bmc.cloudguard.model.ResourceTypeSummary>(
                new java.util.function.Supplier<ListResourceTypesRequest.Builder>() {
                    @Override
                    public ListResourceTypesRequest.Builder get() {
                        return ListResourceTypesRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListResourceTypesResponse, String>() {
                    @Override
                    public String apply(ListResourceTypesResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListResourceTypesRequest.Builder>,
                        ListResourceTypesRequest>() {
                    @Override
                    public ListResourceTypesRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListResourceTypesRequest.Builder>
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
                        ListResourceTypesRequest, ListResourceTypesResponse>() {
                    @Override
                    public ListResourceTypesResponse apply(ListResourceTypesRequest request) {
                        return client.listResourceTypes(request);
                    }
                },
                new java.util.function.Function<
                        ListResourceTypesResponse,
                        java.util.List<com.oracle.bmc.cloudguard.model.ResourceTypeSummary>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.cloudguard.model.ResourceTypeSummary>
                            apply(ListResourceTypesResponse response) {
                        return response.getResourceTypeCollection().getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the listResourceVulnerabilities operation. This iterable
     * will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses received from the service.
     */
    public Iterable<ListResourceVulnerabilitiesResponse>
            listResourceVulnerabilitiesResponseIterator(
                    final ListResourceVulnerabilitiesRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListResourceVulnerabilitiesRequest.Builder, ListResourceVulnerabilitiesRequest,
                ListResourceVulnerabilitiesResponse>(
                new java.util.function.Supplier<ListResourceVulnerabilitiesRequest.Builder>() {
                    @Override
                    public ListResourceVulnerabilitiesRequest.Builder get() {
                        return ListResourceVulnerabilitiesRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListResourceVulnerabilitiesResponse, String>() {
                    @Override
                    public String apply(ListResourceVulnerabilitiesResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListResourceVulnerabilitiesRequest.Builder>,
                        ListResourceVulnerabilitiesRequest>() {
                    @Override
                    public ListResourceVulnerabilitiesRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListResourceVulnerabilitiesRequest.Builder>
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
                        ListResourceVulnerabilitiesRequest, ListResourceVulnerabilitiesResponse>() {
                    @Override
                    public ListResourceVulnerabilitiesResponse apply(
                            ListResourceVulnerabilitiesRequest request) {
                        return client.listResourceVulnerabilities(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link com.oracle.bmc.cloudguard.model.ResourceVulnerabilitySummary} objects
     * contained in responses from the listResourceVulnerabilities operation. This iterable will fetch more data from the
     * server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link com.oracle.bmc.cloudguard.model.ResourceVulnerabilitySummary} objects
     * contained in responses received from the service.
     */
    public Iterable<com.oracle.bmc.cloudguard.model.ResourceVulnerabilitySummary>
            listResourceVulnerabilitiesRecordIterator(
                    final ListResourceVulnerabilitiesRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListResourceVulnerabilitiesRequest.Builder, ListResourceVulnerabilitiesRequest,
                ListResourceVulnerabilitiesResponse,
                com.oracle.bmc.cloudguard.model.ResourceVulnerabilitySummary>(
                new java.util.function.Supplier<ListResourceVulnerabilitiesRequest.Builder>() {
                    @Override
                    public ListResourceVulnerabilitiesRequest.Builder get() {
                        return ListResourceVulnerabilitiesRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListResourceVulnerabilitiesResponse, String>() {
                    @Override
                    public String apply(ListResourceVulnerabilitiesResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListResourceVulnerabilitiesRequest.Builder>,
                        ListResourceVulnerabilitiesRequest>() {
                    @Override
                    public ListResourceVulnerabilitiesRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListResourceVulnerabilitiesRequest.Builder>
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
                        ListResourceVulnerabilitiesRequest, ListResourceVulnerabilitiesResponse>() {
                    @Override
                    public ListResourceVulnerabilitiesResponse apply(
                            ListResourceVulnerabilitiesRequest request) {
                        return client.listResourceVulnerabilities(request);
                    }
                },
                new java.util.function.Function<
                        ListResourceVulnerabilitiesResponse,
                        java.util.List<
                                com.oracle.bmc.cloudguard.model.ResourceVulnerabilitySummary>>() {
                    @Override
                    public java.util.List<
                                    com.oracle.bmc.cloudguard.model.ResourceVulnerabilitySummary>
                            apply(ListResourceVulnerabilitiesResponse response) {
                        return response.getResourceVulnerabilityCollection().getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the listResources operation. This iterable
     * will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses received from the service.
     */
    public Iterable<ListResourcesResponse> listResourcesResponseIterator(
            final ListResourcesRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListResourcesRequest.Builder, ListResourcesRequest, ListResourcesResponse>(
                new java.util.function.Supplier<ListResourcesRequest.Builder>() {
                    @Override
                    public ListResourcesRequest.Builder get() {
                        return ListResourcesRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListResourcesResponse, String>() {
                    @Override
                    public String apply(ListResourcesResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListResourcesRequest.Builder>,
                        ListResourcesRequest>() {
                    @Override
                    public ListResourcesRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListResourcesRequest.Builder>
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
                new java.util.function.Function<ListResourcesRequest, ListResourcesResponse>() {
                    @Override
                    public ListResourcesResponse apply(ListResourcesRequest request) {
                        return client.listResources(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link com.oracle.bmc.cloudguard.model.ResourceSummary} objects
     * contained in responses from the listResources operation. This iterable will fetch more data from the
     * server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link com.oracle.bmc.cloudguard.model.ResourceSummary} objects
     * contained in responses received from the service.
     */
    public Iterable<com.oracle.bmc.cloudguard.model.ResourceSummary> listResourcesRecordIterator(
            final ListResourcesRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListResourcesRequest.Builder, ListResourcesRequest, ListResourcesResponse,
                com.oracle.bmc.cloudguard.model.ResourceSummary>(
                new java.util.function.Supplier<ListResourcesRequest.Builder>() {
                    @Override
                    public ListResourcesRequest.Builder get() {
                        return ListResourcesRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListResourcesResponse, String>() {
                    @Override
                    public String apply(ListResourcesResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListResourcesRequest.Builder>,
                        ListResourcesRequest>() {
                    @Override
                    public ListResourcesRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListResourcesRequest.Builder>
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
                new java.util.function.Function<ListResourcesRequest, ListResourcesResponse>() {
                    @Override
                    public ListResourcesResponse apply(ListResourcesRequest request) {
                        return client.listResources(request);
                    }
                },
                new java.util.function.Function<
                        ListResourcesResponse,
                        java.util.List<com.oracle.bmc.cloudguard.model.ResourceSummary>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.cloudguard.model.ResourceSummary> apply(
                            ListResourcesResponse response) {
                        return response.getResourceCollection().getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the listResponderActivities operation. This iterable
     * will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses received from the service.
     */
    public Iterable<ListResponderActivitiesResponse> listResponderActivitiesResponseIterator(
            final ListResponderActivitiesRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListResponderActivitiesRequest.Builder, ListResponderActivitiesRequest,
                ListResponderActivitiesResponse>(
                new java.util.function.Supplier<ListResponderActivitiesRequest.Builder>() {
                    @Override
                    public ListResponderActivitiesRequest.Builder get() {
                        return ListResponderActivitiesRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListResponderActivitiesResponse, String>() {
                    @Override
                    public String apply(ListResponderActivitiesResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListResponderActivitiesRequest.Builder>,
                        ListResponderActivitiesRequest>() {
                    @Override
                    public ListResponderActivitiesRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListResponderActivitiesRequest.Builder>
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
                        ListResponderActivitiesRequest, ListResponderActivitiesResponse>() {
                    @Override
                    public ListResponderActivitiesResponse apply(
                            ListResponderActivitiesRequest request) {
                        return client.listResponderActivities(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link com.oracle.bmc.cloudguard.model.ResponderActivitySummary} objects
     * contained in responses from the listResponderActivities operation. This iterable will fetch more data from the
     * server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link com.oracle.bmc.cloudguard.model.ResponderActivitySummary} objects
     * contained in responses received from the service.
     */
    public Iterable<com.oracle.bmc.cloudguard.model.ResponderActivitySummary>
            listResponderActivitiesRecordIterator(final ListResponderActivitiesRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListResponderActivitiesRequest.Builder, ListResponderActivitiesRequest,
                ListResponderActivitiesResponse,
                com.oracle.bmc.cloudguard.model.ResponderActivitySummary>(
                new java.util.function.Supplier<ListResponderActivitiesRequest.Builder>() {
                    @Override
                    public ListResponderActivitiesRequest.Builder get() {
                        return ListResponderActivitiesRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListResponderActivitiesResponse, String>() {
                    @Override
                    public String apply(ListResponderActivitiesResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListResponderActivitiesRequest.Builder>,
                        ListResponderActivitiesRequest>() {
                    @Override
                    public ListResponderActivitiesRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListResponderActivitiesRequest.Builder>
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
                        ListResponderActivitiesRequest, ListResponderActivitiesResponse>() {
                    @Override
                    public ListResponderActivitiesResponse apply(
                            ListResponderActivitiesRequest request) {
                        return client.listResponderActivities(request);
                    }
                },
                new java.util.function.Function<
                        ListResponderActivitiesResponse,
                        java.util.List<
                                com.oracle.bmc.cloudguard.model.ResponderActivitySummary>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.cloudguard.model.ResponderActivitySummary>
                            apply(ListResponderActivitiesResponse response) {
                        return response.getResponderActivityCollection().getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the listResponderExecutions operation. This iterable
     * will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses received from the service.
     */
    public Iterable<ListResponderExecutionsResponse> listResponderExecutionsResponseIterator(
            final ListResponderExecutionsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListResponderExecutionsRequest.Builder, ListResponderExecutionsRequest,
                ListResponderExecutionsResponse>(
                new java.util.function.Supplier<ListResponderExecutionsRequest.Builder>() {
                    @Override
                    public ListResponderExecutionsRequest.Builder get() {
                        return ListResponderExecutionsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListResponderExecutionsResponse, String>() {
                    @Override
                    public String apply(ListResponderExecutionsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListResponderExecutionsRequest.Builder>,
                        ListResponderExecutionsRequest>() {
                    @Override
                    public ListResponderExecutionsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListResponderExecutionsRequest.Builder>
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
                        ListResponderExecutionsRequest, ListResponderExecutionsResponse>() {
                    @Override
                    public ListResponderExecutionsResponse apply(
                            ListResponderExecutionsRequest request) {
                        return client.listResponderExecutions(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link com.oracle.bmc.cloudguard.model.ResponderExecutionSummary} objects
     * contained in responses from the listResponderExecutions operation. This iterable will fetch more data from the
     * server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link com.oracle.bmc.cloudguard.model.ResponderExecutionSummary} objects
     * contained in responses received from the service.
     */
    public Iterable<com.oracle.bmc.cloudguard.model.ResponderExecutionSummary>
            listResponderExecutionsRecordIterator(final ListResponderExecutionsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListResponderExecutionsRequest.Builder, ListResponderExecutionsRequest,
                ListResponderExecutionsResponse,
                com.oracle.bmc.cloudguard.model.ResponderExecutionSummary>(
                new java.util.function.Supplier<ListResponderExecutionsRequest.Builder>() {
                    @Override
                    public ListResponderExecutionsRequest.Builder get() {
                        return ListResponderExecutionsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListResponderExecutionsResponse, String>() {
                    @Override
                    public String apply(ListResponderExecutionsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListResponderExecutionsRequest.Builder>,
                        ListResponderExecutionsRequest>() {
                    @Override
                    public ListResponderExecutionsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListResponderExecutionsRequest.Builder>
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
                        ListResponderExecutionsRequest, ListResponderExecutionsResponse>() {
                    @Override
                    public ListResponderExecutionsResponse apply(
                            ListResponderExecutionsRequest request) {
                        return client.listResponderExecutions(request);
                    }
                },
                new java.util.function.Function<
                        ListResponderExecutionsResponse,
                        java.util.List<
                                com.oracle.bmc.cloudguard.model.ResponderExecutionSummary>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.cloudguard.model.ResponderExecutionSummary>
                            apply(ListResponderExecutionsResponse response) {
                        return response.getResponderExecutionCollection().getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the listResponderRecipeResponderRules operation. This iterable
     * will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses received from the service.
     */
    public Iterable<ListResponderRecipeResponderRulesResponse>
            listResponderRecipeResponderRulesResponseIterator(
                    final ListResponderRecipeResponderRulesRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListResponderRecipeResponderRulesRequest.Builder,
                ListResponderRecipeResponderRulesRequest,
                ListResponderRecipeResponderRulesResponse>(
                new java.util.function.Supplier<
                        ListResponderRecipeResponderRulesRequest.Builder>() {
                    @Override
                    public ListResponderRecipeResponderRulesRequest.Builder get() {
                        return ListResponderRecipeResponderRulesRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<
                        ListResponderRecipeResponderRulesResponse, String>() {
                    @Override
                    public String apply(ListResponderRecipeResponderRulesResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListResponderRecipeResponderRulesRequest.Builder>,
                        ListResponderRecipeResponderRulesRequest>() {
                    @Override
                    public ListResponderRecipeResponderRulesRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListResponderRecipeResponderRulesRequest.Builder>
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
                        ListResponderRecipeResponderRulesRequest,
                        ListResponderRecipeResponderRulesResponse>() {
                    @Override
                    public ListResponderRecipeResponderRulesResponse apply(
                            ListResponderRecipeResponderRulesRequest request) {
                        return client.listResponderRecipeResponderRules(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link com.oracle.bmc.cloudguard.model.ResponderRecipeResponderRuleSummary} objects
     * contained in responses from the listResponderRecipeResponderRules operation. This iterable will fetch more data from the
     * server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link com.oracle.bmc.cloudguard.model.ResponderRecipeResponderRuleSummary} objects
     * contained in responses received from the service.
     */
    public Iterable<com.oracle.bmc.cloudguard.model.ResponderRecipeResponderRuleSummary>
            listResponderRecipeResponderRulesRecordIterator(
                    final ListResponderRecipeResponderRulesRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListResponderRecipeResponderRulesRequest.Builder,
                ListResponderRecipeResponderRulesRequest, ListResponderRecipeResponderRulesResponse,
                com.oracle.bmc.cloudguard.model.ResponderRecipeResponderRuleSummary>(
                new java.util.function.Supplier<
                        ListResponderRecipeResponderRulesRequest.Builder>() {
                    @Override
                    public ListResponderRecipeResponderRulesRequest.Builder get() {
                        return ListResponderRecipeResponderRulesRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<
                        ListResponderRecipeResponderRulesResponse, String>() {
                    @Override
                    public String apply(ListResponderRecipeResponderRulesResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListResponderRecipeResponderRulesRequest.Builder>,
                        ListResponderRecipeResponderRulesRequest>() {
                    @Override
                    public ListResponderRecipeResponderRulesRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListResponderRecipeResponderRulesRequest.Builder>
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
                        ListResponderRecipeResponderRulesRequest,
                        ListResponderRecipeResponderRulesResponse>() {
                    @Override
                    public ListResponderRecipeResponderRulesResponse apply(
                            ListResponderRecipeResponderRulesRequest request) {
                        return client.listResponderRecipeResponderRules(request);
                    }
                },
                new java.util.function.Function<
                        ListResponderRecipeResponderRulesResponse,
                        java.util.List<
                                com.oracle.bmc.cloudguard.model
                                        .ResponderRecipeResponderRuleSummary>>() {
                    @Override
                    public java.util.List<
                                    com.oracle.bmc.cloudguard.model
                                            .ResponderRecipeResponderRuleSummary>
                            apply(ListResponderRecipeResponderRulesResponse response) {
                        return response.getResponderRecipeResponderRuleCollection().getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the listResponderRecipes operation. This iterable
     * will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses received from the service.
     */
    public Iterable<ListResponderRecipesResponse> listResponderRecipesResponseIterator(
            final ListResponderRecipesRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListResponderRecipesRequest.Builder, ListResponderRecipesRequest,
                ListResponderRecipesResponse>(
                new java.util.function.Supplier<ListResponderRecipesRequest.Builder>() {
                    @Override
                    public ListResponderRecipesRequest.Builder get() {
                        return ListResponderRecipesRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListResponderRecipesResponse, String>() {
                    @Override
                    public String apply(ListResponderRecipesResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListResponderRecipesRequest.Builder>,
                        ListResponderRecipesRequest>() {
                    @Override
                    public ListResponderRecipesRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListResponderRecipesRequest.Builder>
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
                        ListResponderRecipesRequest, ListResponderRecipesResponse>() {
                    @Override
                    public ListResponderRecipesResponse apply(ListResponderRecipesRequest request) {
                        return client.listResponderRecipes(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link com.oracle.bmc.cloudguard.model.ResponderRecipeSummary} objects
     * contained in responses from the listResponderRecipes operation. This iterable will fetch more data from the
     * server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link com.oracle.bmc.cloudguard.model.ResponderRecipeSummary} objects
     * contained in responses received from the service.
     */
    public Iterable<com.oracle.bmc.cloudguard.model.ResponderRecipeSummary>
            listResponderRecipesRecordIterator(final ListResponderRecipesRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListResponderRecipesRequest.Builder, ListResponderRecipesRequest,
                ListResponderRecipesResponse,
                com.oracle.bmc.cloudguard.model.ResponderRecipeSummary>(
                new java.util.function.Supplier<ListResponderRecipesRequest.Builder>() {
                    @Override
                    public ListResponderRecipesRequest.Builder get() {
                        return ListResponderRecipesRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListResponderRecipesResponse, String>() {
                    @Override
                    public String apply(ListResponderRecipesResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListResponderRecipesRequest.Builder>,
                        ListResponderRecipesRequest>() {
                    @Override
                    public ListResponderRecipesRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListResponderRecipesRequest.Builder>
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
                        ListResponderRecipesRequest, ListResponderRecipesResponse>() {
                    @Override
                    public ListResponderRecipesResponse apply(ListResponderRecipesRequest request) {
                        return client.listResponderRecipes(request);
                    }
                },
                new java.util.function.Function<
                        ListResponderRecipesResponse,
                        java.util.List<com.oracle.bmc.cloudguard.model.ResponderRecipeSummary>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.cloudguard.model.ResponderRecipeSummary>
                            apply(ListResponderRecipesResponse response) {
                        return response.getResponderRecipeCollection().getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the listResponderRules operation. This iterable
     * will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses received from the service.
     */
    public Iterable<ListResponderRulesResponse> listResponderRulesResponseIterator(
            final ListResponderRulesRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListResponderRulesRequest.Builder, ListResponderRulesRequest,
                ListResponderRulesResponse>(
                new java.util.function.Supplier<ListResponderRulesRequest.Builder>() {
                    @Override
                    public ListResponderRulesRequest.Builder get() {
                        return ListResponderRulesRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListResponderRulesResponse, String>() {
                    @Override
                    public String apply(ListResponderRulesResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListResponderRulesRequest.Builder>,
                        ListResponderRulesRequest>() {
                    @Override
                    public ListResponderRulesRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListResponderRulesRequest.Builder>
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
                        ListResponderRulesRequest, ListResponderRulesResponse>() {
                    @Override
                    public ListResponderRulesResponse apply(ListResponderRulesRequest request) {
                        return client.listResponderRules(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link com.oracle.bmc.cloudguard.model.ResponderRuleSummary} objects
     * contained in responses from the listResponderRules operation. This iterable will fetch more data from the
     * server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link com.oracle.bmc.cloudguard.model.ResponderRuleSummary} objects
     * contained in responses received from the service.
     */
    public Iterable<com.oracle.bmc.cloudguard.model.ResponderRuleSummary>
            listResponderRulesRecordIterator(final ListResponderRulesRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListResponderRulesRequest.Builder, ListResponderRulesRequest,
                ListResponderRulesResponse, com.oracle.bmc.cloudguard.model.ResponderRuleSummary>(
                new java.util.function.Supplier<ListResponderRulesRequest.Builder>() {
                    @Override
                    public ListResponderRulesRequest.Builder get() {
                        return ListResponderRulesRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListResponderRulesResponse, String>() {
                    @Override
                    public String apply(ListResponderRulesResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListResponderRulesRequest.Builder>,
                        ListResponderRulesRequest>() {
                    @Override
                    public ListResponderRulesRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListResponderRulesRequest.Builder>
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
                        ListResponderRulesRequest, ListResponderRulesResponse>() {
                    @Override
                    public ListResponderRulesResponse apply(ListResponderRulesRequest request) {
                        return client.listResponderRules(request);
                    }
                },
                new java.util.function.Function<
                        ListResponderRulesResponse,
                        java.util.List<com.oracle.bmc.cloudguard.model.ResponderRuleSummary>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.cloudguard.model.ResponderRuleSummary>
                            apply(ListResponderRulesResponse response) {
                        return response.getResponderRuleCollection().getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the listSavedQueries operation. This iterable
     * will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses received from the service.
     */
    public Iterable<ListSavedQueriesResponse> listSavedQueriesResponseIterator(
            final ListSavedQueriesRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListSavedQueriesRequest.Builder, ListSavedQueriesRequest, ListSavedQueriesResponse>(
                new java.util.function.Supplier<ListSavedQueriesRequest.Builder>() {
                    @Override
                    public ListSavedQueriesRequest.Builder get() {
                        return ListSavedQueriesRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListSavedQueriesResponse, String>() {
                    @Override
                    public String apply(ListSavedQueriesResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListSavedQueriesRequest.Builder>,
                        ListSavedQueriesRequest>() {
                    @Override
                    public ListSavedQueriesRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListSavedQueriesRequest.Builder>
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
                        ListSavedQueriesRequest, ListSavedQueriesResponse>() {
                    @Override
                    public ListSavedQueriesResponse apply(ListSavedQueriesRequest request) {
                        return client.listSavedQueries(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link com.oracle.bmc.cloudguard.model.SavedQuerySummary} objects
     * contained in responses from the listSavedQueries operation. This iterable will fetch more data from the
     * server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link com.oracle.bmc.cloudguard.model.SavedQuerySummary} objects
     * contained in responses received from the service.
     */
    public Iterable<com.oracle.bmc.cloudguard.model.SavedQuerySummary>
            listSavedQueriesRecordIterator(final ListSavedQueriesRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListSavedQueriesRequest.Builder, ListSavedQueriesRequest, ListSavedQueriesResponse,
                com.oracle.bmc.cloudguard.model.SavedQuerySummary>(
                new java.util.function.Supplier<ListSavedQueriesRequest.Builder>() {
                    @Override
                    public ListSavedQueriesRequest.Builder get() {
                        return ListSavedQueriesRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListSavedQueriesResponse, String>() {
                    @Override
                    public String apply(ListSavedQueriesResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListSavedQueriesRequest.Builder>,
                        ListSavedQueriesRequest>() {
                    @Override
                    public ListSavedQueriesRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListSavedQueriesRequest.Builder>
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
                        ListSavedQueriesRequest, ListSavedQueriesResponse>() {
                    @Override
                    public ListSavedQueriesResponse apply(ListSavedQueriesRequest request) {
                        return client.listSavedQueries(request);
                    }
                },
                new java.util.function.Function<
                        ListSavedQueriesResponse,
                        java.util.List<com.oracle.bmc.cloudguard.model.SavedQuerySummary>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.cloudguard.model.SavedQuerySummary> apply(
                            ListSavedQueriesResponse response) {
                        return response.getSavedQueryCollection().getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the listSecurityPolicies operation. This iterable
     * will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses received from the service.
     */
    public Iterable<ListSecurityPoliciesResponse> listSecurityPoliciesResponseIterator(
            final ListSecurityPoliciesRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListSecurityPoliciesRequest.Builder, ListSecurityPoliciesRequest,
                ListSecurityPoliciesResponse>(
                new java.util.function.Supplier<ListSecurityPoliciesRequest.Builder>() {
                    @Override
                    public ListSecurityPoliciesRequest.Builder get() {
                        return ListSecurityPoliciesRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListSecurityPoliciesResponse, String>() {
                    @Override
                    public String apply(ListSecurityPoliciesResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListSecurityPoliciesRequest.Builder>,
                        ListSecurityPoliciesRequest>() {
                    @Override
                    public ListSecurityPoliciesRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListSecurityPoliciesRequest.Builder>
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
                        ListSecurityPoliciesRequest, ListSecurityPoliciesResponse>() {
                    @Override
                    public ListSecurityPoliciesResponse apply(ListSecurityPoliciesRequest request) {
                        return client.listSecurityPolicies(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link com.oracle.bmc.cloudguard.model.SecurityPolicySummary} objects
     * contained in responses from the listSecurityPolicies operation. This iterable will fetch more data from the
     * server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link com.oracle.bmc.cloudguard.model.SecurityPolicySummary} objects
     * contained in responses received from the service.
     */
    public Iterable<com.oracle.bmc.cloudguard.model.SecurityPolicySummary>
            listSecurityPoliciesRecordIterator(final ListSecurityPoliciesRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListSecurityPoliciesRequest.Builder, ListSecurityPoliciesRequest,
                ListSecurityPoliciesResponse,
                com.oracle.bmc.cloudguard.model.SecurityPolicySummary>(
                new java.util.function.Supplier<ListSecurityPoliciesRequest.Builder>() {
                    @Override
                    public ListSecurityPoliciesRequest.Builder get() {
                        return ListSecurityPoliciesRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListSecurityPoliciesResponse, String>() {
                    @Override
                    public String apply(ListSecurityPoliciesResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListSecurityPoliciesRequest.Builder>,
                        ListSecurityPoliciesRequest>() {
                    @Override
                    public ListSecurityPoliciesRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListSecurityPoliciesRequest.Builder>
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
                        ListSecurityPoliciesRequest, ListSecurityPoliciesResponse>() {
                    @Override
                    public ListSecurityPoliciesResponse apply(ListSecurityPoliciesRequest request) {
                        return client.listSecurityPolicies(request);
                    }
                },
                new java.util.function.Function<
                        ListSecurityPoliciesResponse,
                        java.util.List<com.oracle.bmc.cloudguard.model.SecurityPolicySummary>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.cloudguard.model.SecurityPolicySummary>
                            apply(ListSecurityPoliciesResponse response) {
                        return response.getSecurityPolicyCollection().getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the listSecurityRecipes operation. This iterable
     * will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses received from the service.
     */
    public Iterable<ListSecurityRecipesResponse> listSecurityRecipesResponseIterator(
            final ListSecurityRecipesRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListSecurityRecipesRequest.Builder, ListSecurityRecipesRequest,
                ListSecurityRecipesResponse>(
                new java.util.function.Supplier<ListSecurityRecipesRequest.Builder>() {
                    @Override
                    public ListSecurityRecipesRequest.Builder get() {
                        return ListSecurityRecipesRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListSecurityRecipesResponse, String>() {
                    @Override
                    public String apply(ListSecurityRecipesResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListSecurityRecipesRequest.Builder>,
                        ListSecurityRecipesRequest>() {
                    @Override
                    public ListSecurityRecipesRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListSecurityRecipesRequest.Builder>
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
                        ListSecurityRecipesRequest, ListSecurityRecipesResponse>() {
                    @Override
                    public ListSecurityRecipesResponse apply(ListSecurityRecipesRequest request) {
                        return client.listSecurityRecipes(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link com.oracle.bmc.cloudguard.model.SecurityRecipeSummary} objects
     * contained in responses from the listSecurityRecipes operation. This iterable will fetch more data from the
     * server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link com.oracle.bmc.cloudguard.model.SecurityRecipeSummary} objects
     * contained in responses received from the service.
     */
    public Iterable<com.oracle.bmc.cloudguard.model.SecurityRecipeSummary>
            listSecurityRecipesRecordIterator(final ListSecurityRecipesRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListSecurityRecipesRequest.Builder, ListSecurityRecipesRequest,
                ListSecurityRecipesResponse, com.oracle.bmc.cloudguard.model.SecurityRecipeSummary>(
                new java.util.function.Supplier<ListSecurityRecipesRequest.Builder>() {
                    @Override
                    public ListSecurityRecipesRequest.Builder get() {
                        return ListSecurityRecipesRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListSecurityRecipesResponse, String>() {
                    @Override
                    public String apply(ListSecurityRecipesResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListSecurityRecipesRequest.Builder>,
                        ListSecurityRecipesRequest>() {
                    @Override
                    public ListSecurityRecipesRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListSecurityRecipesRequest.Builder>
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
                        ListSecurityRecipesRequest, ListSecurityRecipesResponse>() {
                    @Override
                    public ListSecurityRecipesResponse apply(ListSecurityRecipesRequest request) {
                        return client.listSecurityRecipes(request);
                    }
                },
                new java.util.function.Function<
                        ListSecurityRecipesResponse,
                        java.util.List<com.oracle.bmc.cloudguard.model.SecurityRecipeSummary>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.cloudguard.model.SecurityRecipeSummary>
                            apply(ListSecurityRecipesResponse response) {
                        return response.getSecurityRecipeCollection().getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the listSecurityZones operation. This iterable
     * will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses received from the service.
     */
    public Iterable<ListSecurityZonesResponse> listSecurityZonesResponseIterator(
            final ListSecurityZonesRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListSecurityZonesRequest.Builder, ListSecurityZonesRequest,
                ListSecurityZonesResponse>(
                new java.util.function.Supplier<ListSecurityZonesRequest.Builder>() {
                    @Override
                    public ListSecurityZonesRequest.Builder get() {
                        return ListSecurityZonesRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListSecurityZonesResponse, String>() {
                    @Override
                    public String apply(ListSecurityZonesResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListSecurityZonesRequest.Builder>,
                        ListSecurityZonesRequest>() {
                    @Override
                    public ListSecurityZonesRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListSecurityZonesRequest.Builder>
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
                        ListSecurityZonesRequest, ListSecurityZonesResponse>() {
                    @Override
                    public ListSecurityZonesResponse apply(ListSecurityZonesRequest request) {
                        return client.listSecurityZones(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link com.oracle.bmc.cloudguard.model.SecurityZoneSummary} objects
     * contained in responses from the listSecurityZones operation. This iterable will fetch more data from the
     * server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link com.oracle.bmc.cloudguard.model.SecurityZoneSummary} objects
     * contained in responses received from the service.
     */
    public Iterable<com.oracle.bmc.cloudguard.model.SecurityZoneSummary>
            listSecurityZonesRecordIterator(final ListSecurityZonesRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListSecurityZonesRequest.Builder, ListSecurityZonesRequest,
                ListSecurityZonesResponse, com.oracle.bmc.cloudguard.model.SecurityZoneSummary>(
                new java.util.function.Supplier<ListSecurityZonesRequest.Builder>() {
                    @Override
                    public ListSecurityZonesRequest.Builder get() {
                        return ListSecurityZonesRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListSecurityZonesResponse, String>() {
                    @Override
                    public String apply(ListSecurityZonesResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListSecurityZonesRequest.Builder>,
                        ListSecurityZonesRequest>() {
                    @Override
                    public ListSecurityZonesRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListSecurityZonesRequest.Builder>
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
                        ListSecurityZonesRequest, ListSecurityZonesResponse>() {
                    @Override
                    public ListSecurityZonesResponse apply(ListSecurityZonesRequest request) {
                        return client.listSecurityZones(request);
                    }
                },
                new java.util.function.Function<
                        ListSecurityZonesResponse,
                        java.util.List<com.oracle.bmc.cloudguard.model.SecurityZoneSummary>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.cloudguard.model.SecurityZoneSummary>
                            apply(ListSecurityZonesResponse response) {
                        return response.getSecurityZoneCollection().getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the listSightingEndpoints operation. This iterable
     * will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses received from the service.
     */
    public Iterable<ListSightingEndpointsResponse> listSightingEndpointsResponseIterator(
            final ListSightingEndpointsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListSightingEndpointsRequest.Builder, ListSightingEndpointsRequest,
                ListSightingEndpointsResponse>(
                new java.util.function.Supplier<ListSightingEndpointsRequest.Builder>() {
                    @Override
                    public ListSightingEndpointsRequest.Builder get() {
                        return ListSightingEndpointsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListSightingEndpointsResponse, String>() {
                    @Override
                    public String apply(ListSightingEndpointsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListSightingEndpointsRequest.Builder>,
                        ListSightingEndpointsRequest>() {
                    @Override
                    public ListSightingEndpointsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListSightingEndpointsRequest.Builder>
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
                        ListSightingEndpointsRequest, ListSightingEndpointsResponse>() {
                    @Override
                    public ListSightingEndpointsResponse apply(
                            ListSightingEndpointsRequest request) {
                        return client.listSightingEndpoints(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link com.oracle.bmc.cloudguard.model.SightingEndpointSummary} objects
     * contained in responses from the listSightingEndpoints operation. This iterable will fetch more data from the
     * server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link com.oracle.bmc.cloudguard.model.SightingEndpointSummary} objects
     * contained in responses received from the service.
     */
    public Iterable<com.oracle.bmc.cloudguard.model.SightingEndpointSummary>
            listSightingEndpointsRecordIterator(final ListSightingEndpointsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListSightingEndpointsRequest.Builder, ListSightingEndpointsRequest,
                ListSightingEndpointsResponse,
                com.oracle.bmc.cloudguard.model.SightingEndpointSummary>(
                new java.util.function.Supplier<ListSightingEndpointsRequest.Builder>() {
                    @Override
                    public ListSightingEndpointsRequest.Builder get() {
                        return ListSightingEndpointsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListSightingEndpointsResponse, String>() {
                    @Override
                    public String apply(ListSightingEndpointsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListSightingEndpointsRequest.Builder>,
                        ListSightingEndpointsRequest>() {
                    @Override
                    public ListSightingEndpointsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListSightingEndpointsRequest.Builder>
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
                        ListSightingEndpointsRequest, ListSightingEndpointsResponse>() {
                    @Override
                    public ListSightingEndpointsResponse apply(
                            ListSightingEndpointsRequest request) {
                        return client.listSightingEndpoints(request);
                    }
                },
                new java.util.function.Function<
                        ListSightingEndpointsResponse,
                        java.util.List<com.oracle.bmc.cloudguard.model.SightingEndpointSummary>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.cloudguard.model.SightingEndpointSummary>
                            apply(ListSightingEndpointsResponse response) {
                        return response.getSightingEndpointCollection().getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the listSightingImpactedResources operation. This iterable
     * will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses received from the service.
     */
    public Iterable<ListSightingImpactedResourcesResponse>
            listSightingImpactedResourcesResponseIterator(
                    final ListSightingImpactedResourcesRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListSightingImpactedResourcesRequest.Builder, ListSightingImpactedResourcesRequest,
                ListSightingImpactedResourcesResponse>(
                new java.util.function.Supplier<ListSightingImpactedResourcesRequest.Builder>() {
                    @Override
                    public ListSightingImpactedResourcesRequest.Builder get() {
                        return ListSightingImpactedResourcesRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListSightingImpactedResourcesResponse, String>() {
                    @Override
                    public String apply(ListSightingImpactedResourcesResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListSightingImpactedResourcesRequest.Builder>,
                        ListSightingImpactedResourcesRequest>() {
                    @Override
                    public ListSightingImpactedResourcesRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListSightingImpactedResourcesRequest.Builder>
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
                        ListSightingImpactedResourcesRequest,
                        ListSightingImpactedResourcesResponse>() {
                    @Override
                    public ListSightingImpactedResourcesResponse apply(
                            ListSightingImpactedResourcesRequest request) {
                        return client.listSightingImpactedResources(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link com.oracle.bmc.cloudguard.model.SightingImpactedResourceSummary} objects
     * contained in responses from the listSightingImpactedResources operation. This iterable will fetch more data from the
     * server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link com.oracle.bmc.cloudguard.model.SightingImpactedResourceSummary} objects
     * contained in responses received from the service.
     */
    public Iterable<com.oracle.bmc.cloudguard.model.SightingImpactedResourceSummary>
            listSightingImpactedResourcesRecordIterator(
                    final ListSightingImpactedResourcesRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListSightingImpactedResourcesRequest.Builder, ListSightingImpactedResourcesRequest,
                ListSightingImpactedResourcesResponse,
                com.oracle.bmc.cloudguard.model.SightingImpactedResourceSummary>(
                new java.util.function.Supplier<ListSightingImpactedResourcesRequest.Builder>() {
                    @Override
                    public ListSightingImpactedResourcesRequest.Builder get() {
                        return ListSightingImpactedResourcesRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListSightingImpactedResourcesResponse, String>() {
                    @Override
                    public String apply(ListSightingImpactedResourcesResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListSightingImpactedResourcesRequest.Builder>,
                        ListSightingImpactedResourcesRequest>() {
                    @Override
                    public ListSightingImpactedResourcesRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListSightingImpactedResourcesRequest.Builder>
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
                        ListSightingImpactedResourcesRequest,
                        ListSightingImpactedResourcesResponse>() {
                    @Override
                    public ListSightingImpactedResourcesResponse apply(
                            ListSightingImpactedResourcesRequest request) {
                        return client.listSightingImpactedResources(request);
                    }
                },
                new java.util.function.Function<
                        ListSightingImpactedResourcesResponse,
                        java.util.List<
                                com.oracle.bmc.cloudguard.model
                                        .SightingImpactedResourceSummary>>() {
                    @Override
                    public java.util.List<
                                    com.oracle.bmc.cloudguard.model.SightingImpactedResourceSummary>
                            apply(ListSightingImpactedResourcesResponse response) {
                        return response.getSightingImpactedResourceCollection().getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the listSightings operation. This iterable
     * will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses received from the service.
     */
    public Iterable<ListSightingsResponse> listSightingsResponseIterator(
            final ListSightingsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListSightingsRequest.Builder, ListSightingsRequest, ListSightingsResponse>(
                new java.util.function.Supplier<ListSightingsRequest.Builder>() {
                    @Override
                    public ListSightingsRequest.Builder get() {
                        return ListSightingsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListSightingsResponse, String>() {
                    @Override
                    public String apply(ListSightingsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListSightingsRequest.Builder>,
                        ListSightingsRequest>() {
                    @Override
                    public ListSightingsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListSightingsRequest.Builder>
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
                new java.util.function.Function<ListSightingsRequest, ListSightingsResponse>() {
                    @Override
                    public ListSightingsResponse apply(ListSightingsRequest request) {
                        return client.listSightings(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link com.oracle.bmc.cloudguard.model.SightingSummary} objects
     * contained in responses from the listSightings operation. This iterable will fetch more data from the
     * server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link com.oracle.bmc.cloudguard.model.SightingSummary} objects
     * contained in responses received from the service.
     */
    public Iterable<com.oracle.bmc.cloudguard.model.SightingSummary> listSightingsRecordIterator(
            final ListSightingsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListSightingsRequest.Builder, ListSightingsRequest, ListSightingsResponse,
                com.oracle.bmc.cloudguard.model.SightingSummary>(
                new java.util.function.Supplier<ListSightingsRequest.Builder>() {
                    @Override
                    public ListSightingsRequest.Builder get() {
                        return ListSightingsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListSightingsResponse, String>() {
                    @Override
                    public String apply(ListSightingsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListSightingsRequest.Builder>,
                        ListSightingsRequest>() {
                    @Override
                    public ListSightingsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListSightingsRequest.Builder>
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
                new java.util.function.Function<ListSightingsRequest, ListSightingsResponse>() {
                    @Override
                    public ListSightingsResponse apply(ListSightingsRequest request) {
                        return client.listSightings(request);
                    }
                },
                new java.util.function.Function<
                        ListSightingsResponse,
                        java.util.List<com.oracle.bmc.cloudguard.model.SightingSummary>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.cloudguard.model.SightingSummary> apply(
                            ListSightingsResponse response) {
                        return response.getSightingCollection().getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the listTactics operation. This iterable
     * will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses received from the service.
     */
    public Iterable<ListTacticsResponse> listTacticsResponseIterator(
            final ListTacticsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListTacticsRequest.Builder, ListTacticsRequest, ListTacticsResponse>(
                new java.util.function.Supplier<ListTacticsRequest.Builder>() {
                    @Override
                    public ListTacticsRequest.Builder get() {
                        return ListTacticsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListTacticsResponse, String>() {
                    @Override
                    public String apply(ListTacticsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListTacticsRequest.Builder>,
                        ListTacticsRequest>() {
                    @Override
                    public ListTacticsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListTacticsRequest.Builder>
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
                new java.util.function.Function<ListTacticsRequest, ListTacticsResponse>() {
                    @Override
                    public ListTacticsResponse apply(ListTacticsRequest request) {
                        return client.listTactics(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link com.oracle.bmc.cloudguard.model.TacticSummary} objects
     * contained in responses from the listTactics operation. This iterable will fetch more data from the
     * server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link com.oracle.bmc.cloudguard.model.TacticSummary} objects
     * contained in responses received from the service.
     */
    public Iterable<com.oracle.bmc.cloudguard.model.TacticSummary> listTacticsRecordIterator(
            final ListTacticsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListTacticsRequest.Builder, ListTacticsRequest, ListTacticsResponse,
                com.oracle.bmc.cloudguard.model.TacticSummary>(
                new java.util.function.Supplier<ListTacticsRequest.Builder>() {
                    @Override
                    public ListTacticsRequest.Builder get() {
                        return ListTacticsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListTacticsResponse, String>() {
                    @Override
                    public String apply(ListTacticsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListTacticsRequest.Builder>,
                        ListTacticsRequest>() {
                    @Override
                    public ListTacticsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListTacticsRequest.Builder>
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
                new java.util.function.Function<ListTacticsRequest, ListTacticsResponse>() {
                    @Override
                    public ListTacticsResponse apply(ListTacticsRequest request) {
                        return client.listTactics(request);
                    }
                },
                new java.util.function.Function<
                        ListTacticsResponse,
                        java.util.List<com.oracle.bmc.cloudguard.model.TacticSummary>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.cloudguard.model.TacticSummary> apply(
                            ListTacticsResponse response) {
                        return response.getTacticCollection().getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the listTargetDetectorRecipeDetectorRules operation. This iterable
     * will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses received from the service.
     */
    public Iterable<ListTargetDetectorRecipeDetectorRulesResponse>
            listTargetDetectorRecipeDetectorRulesResponseIterator(
                    final ListTargetDetectorRecipeDetectorRulesRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListTargetDetectorRecipeDetectorRulesRequest.Builder,
                ListTargetDetectorRecipeDetectorRulesRequest,
                ListTargetDetectorRecipeDetectorRulesResponse>(
                new java.util.function.Supplier<
                        ListTargetDetectorRecipeDetectorRulesRequest.Builder>() {
                    @Override
                    public ListTargetDetectorRecipeDetectorRulesRequest.Builder get() {
                        return ListTargetDetectorRecipeDetectorRulesRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<
                        ListTargetDetectorRecipeDetectorRulesResponse, String>() {
                    @Override
                    public String apply(ListTargetDetectorRecipeDetectorRulesResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListTargetDetectorRecipeDetectorRulesRequest.Builder>,
                        ListTargetDetectorRecipeDetectorRulesRequest>() {
                    @Override
                    public ListTargetDetectorRecipeDetectorRulesRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListTargetDetectorRecipeDetectorRulesRequest.Builder>
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
                        ListTargetDetectorRecipeDetectorRulesRequest,
                        ListTargetDetectorRecipeDetectorRulesResponse>() {
                    @Override
                    public ListTargetDetectorRecipeDetectorRulesResponse apply(
                            ListTargetDetectorRecipeDetectorRulesRequest request) {
                        return client.listTargetDetectorRecipeDetectorRules(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link com.oracle.bmc.cloudguard.model.TargetDetectorRecipeDetectorRuleSummary} objects
     * contained in responses from the listTargetDetectorRecipeDetectorRules operation. This iterable will fetch more data from the
     * server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link com.oracle.bmc.cloudguard.model.TargetDetectorRecipeDetectorRuleSummary} objects
     * contained in responses received from the service.
     */
    public Iterable<com.oracle.bmc.cloudguard.model.TargetDetectorRecipeDetectorRuleSummary>
            listTargetDetectorRecipeDetectorRulesRecordIterator(
                    final ListTargetDetectorRecipeDetectorRulesRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListTargetDetectorRecipeDetectorRulesRequest.Builder,
                ListTargetDetectorRecipeDetectorRulesRequest,
                ListTargetDetectorRecipeDetectorRulesResponse,
                com.oracle.bmc.cloudguard.model.TargetDetectorRecipeDetectorRuleSummary>(
                new java.util.function.Supplier<
                        ListTargetDetectorRecipeDetectorRulesRequest.Builder>() {
                    @Override
                    public ListTargetDetectorRecipeDetectorRulesRequest.Builder get() {
                        return ListTargetDetectorRecipeDetectorRulesRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<
                        ListTargetDetectorRecipeDetectorRulesResponse, String>() {
                    @Override
                    public String apply(ListTargetDetectorRecipeDetectorRulesResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListTargetDetectorRecipeDetectorRulesRequest.Builder>,
                        ListTargetDetectorRecipeDetectorRulesRequest>() {
                    @Override
                    public ListTargetDetectorRecipeDetectorRulesRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListTargetDetectorRecipeDetectorRulesRequest.Builder>
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
                        ListTargetDetectorRecipeDetectorRulesRequest,
                        ListTargetDetectorRecipeDetectorRulesResponse>() {
                    @Override
                    public ListTargetDetectorRecipeDetectorRulesResponse apply(
                            ListTargetDetectorRecipeDetectorRulesRequest request) {
                        return client.listTargetDetectorRecipeDetectorRules(request);
                    }
                },
                new java.util.function.Function<
                        ListTargetDetectorRecipeDetectorRulesResponse,
                        java.util.List<
                                com.oracle.bmc.cloudguard.model
                                        .TargetDetectorRecipeDetectorRuleSummary>>() {
                    @Override
                    public java.util.List<
                                    com.oracle.bmc.cloudguard.model
                                            .TargetDetectorRecipeDetectorRuleSummary>
                            apply(ListTargetDetectorRecipeDetectorRulesResponse response) {
                        return response.getTargetDetectorRecipeDetectorRuleCollection().getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the listTargetDetectorRecipes operation. This iterable
     * will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses received from the service.
     */
    public Iterable<ListTargetDetectorRecipesResponse> listTargetDetectorRecipesResponseIterator(
            final ListTargetDetectorRecipesRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListTargetDetectorRecipesRequest.Builder, ListTargetDetectorRecipesRequest,
                ListTargetDetectorRecipesResponse>(
                new java.util.function.Supplier<ListTargetDetectorRecipesRequest.Builder>() {
                    @Override
                    public ListTargetDetectorRecipesRequest.Builder get() {
                        return ListTargetDetectorRecipesRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListTargetDetectorRecipesResponse, String>() {
                    @Override
                    public String apply(ListTargetDetectorRecipesResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListTargetDetectorRecipesRequest.Builder>,
                        ListTargetDetectorRecipesRequest>() {
                    @Override
                    public ListTargetDetectorRecipesRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListTargetDetectorRecipesRequest.Builder>
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
                        ListTargetDetectorRecipesRequest, ListTargetDetectorRecipesResponse>() {
                    @Override
                    public ListTargetDetectorRecipesResponse apply(
                            ListTargetDetectorRecipesRequest request) {
                        return client.listTargetDetectorRecipes(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link com.oracle.bmc.cloudguard.model.TargetDetectorRecipeSummary} objects
     * contained in responses from the listTargetDetectorRecipes operation. This iterable will fetch more data from the
     * server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link com.oracle.bmc.cloudguard.model.TargetDetectorRecipeSummary} objects
     * contained in responses received from the service.
     */
    public Iterable<com.oracle.bmc.cloudguard.model.TargetDetectorRecipeSummary>
            listTargetDetectorRecipesRecordIterator(
                    final ListTargetDetectorRecipesRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListTargetDetectorRecipesRequest.Builder, ListTargetDetectorRecipesRequest,
                ListTargetDetectorRecipesResponse,
                com.oracle.bmc.cloudguard.model.TargetDetectorRecipeSummary>(
                new java.util.function.Supplier<ListTargetDetectorRecipesRequest.Builder>() {
                    @Override
                    public ListTargetDetectorRecipesRequest.Builder get() {
                        return ListTargetDetectorRecipesRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListTargetDetectorRecipesResponse, String>() {
                    @Override
                    public String apply(ListTargetDetectorRecipesResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListTargetDetectorRecipesRequest.Builder>,
                        ListTargetDetectorRecipesRequest>() {
                    @Override
                    public ListTargetDetectorRecipesRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListTargetDetectorRecipesRequest.Builder>
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
                        ListTargetDetectorRecipesRequest, ListTargetDetectorRecipesResponse>() {
                    @Override
                    public ListTargetDetectorRecipesResponse apply(
                            ListTargetDetectorRecipesRequest request) {
                        return client.listTargetDetectorRecipes(request);
                    }
                },
                new java.util.function.Function<
                        ListTargetDetectorRecipesResponse,
                        java.util.List<
                                com.oracle.bmc.cloudguard.model.TargetDetectorRecipeSummary>>() {
                    @Override
                    public java.util.List<
                                    com.oracle.bmc.cloudguard.model.TargetDetectorRecipeSummary>
                            apply(ListTargetDetectorRecipesResponse response) {
                        return response.getTargetDetectorRecipeCollection().getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the listTargetResponderRecipeResponderRules operation. This iterable
     * will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses received from the service.
     */
    public Iterable<ListTargetResponderRecipeResponderRulesResponse>
            listTargetResponderRecipeResponderRulesResponseIterator(
                    final ListTargetResponderRecipeResponderRulesRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListTargetResponderRecipeResponderRulesRequest.Builder,
                ListTargetResponderRecipeResponderRulesRequest,
                ListTargetResponderRecipeResponderRulesResponse>(
                new java.util.function.Supplier<
                        ListTargetResponderRecipeResponderRulesRequest.Builder>() {
                    @Override
                    public ListTargetResponderRecipeResponderRulesRequest.Builder get() {
                        return ListTargetResponderRecipeResponderRulesRequest.builder()
                                .copy(request);
                    }
                },
                new java.util.function.Function<
                        ListTargetResponderRecipeResponderRulesResponse, String>() {
                    @Override
                    public String apply(ListTargetResponderRecipeResponderRulesResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListTargetResponderRecipeResponderRulesRequest.Builder>,
                        ListTargetResponderRecipeResponderRulesRequest>() {
                    @Override
                    public ListTargetResponderRecipeResponderRulesRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListTargetResponderRecipeResponderRulesRequest.Builder>
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
                        ListTargetResponderRecipeResponderRulesRequest,
                        ListTargetResponderRecipeResponderRulesResponse>() {
                    @Override
                    public ListTargetResponderRecipeResponderRulesResponse apply(
                            ListTargetResponderRecipeResponderRulesRequest request) {
                        return client.listTargetResponderRecipeResponderRules(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link com.oracle.bmc.cloudguard.model.TargetResponderRecipeResponderRuleSummary} objects
     * contained in responses from the listTargetResponderRecipeResponderRules operation. This iterable will fetch more data from the
     * server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link com.oracle.bmc.cloudguard.model.TargetResponderRecipeResponderRuleSummary} objects
     * contained in responses received from the service.
     */
    public Iterable<com.oracle.bmc.cloudguard.model.TargetResponderRecipeResponderRuleSummary>
            listTargetResponderRecipeResponderRulesRecordIterator(
                    final ListTargetResponderRecipeResponderRulesRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListTargetResponderRecipeResponderRulesRequest.Builder,
                ListTargetResponderRecipeResponderRulesRequest,
                ListTargetResponderRecipeResponderRulesResponse,
                com.oracle.bmc.cloudguard.model.TargetResponderRecipeResponderRuleSummary>(
                new java.util.function.Supplier<
                        ListTargetResponderRecipeResponderRulesRequest.Builder>() {
                    @Override
                    public ListTargetResponderRecipeResponderRulesRequest.Builder get() {
                        return ListTargetResponderRecipeResponderRulesRequest.builder()
                                .copy(request);
                    }
                },
                new java.util.function.Function<
                        ListTargetResponderRecipeResponderRulesResponse, String>() {
                    @Override
                    public String apply(ListTargetResponderRecipeResponderRulesResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListTargetResponderRecipeResponderRulesRequest.Builder>,
                        ListTargetResponderRecipeResponderRulesRequest>() {
                    @Override
                    public ListTargetResponderRecipeResponderRulesRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListTargetResponderRecipeResponderRulesRequest.Builder>
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
                        ListTargetResponderRecipeResponderRulesRequest,
                        ListTargetResponderRecipeResponderRulesResponse>() {
                    @Override
                    public ListTargetResponderRecipeResponderRulesResponse apply(
                            ListTargetResponderRecipeResponderRulesRequest request) {
                        return client.listTargetResponderRecipeResponderRules(request);
                    }
                },
                new java.util.function.Function<
                        ListTargetResponderRecipeResponderRulesResponse,
                        java.util.List<
                                com.oracle.bmc.cloudguard.model
                                        .TargetResponderRecipeResponderRuleSummary>>() {
                    @Override
                    public java.util.List<
                                    com.oracle.bmc.cloudguard.model
                                            .TargetResponderRecipeResponderRuleSummary>
                            apply(ListTargetResponderRecipeResponderRulesResponse response) {
                        return response.getTargetResponderRecipeResponderRuleCollection()
                                .getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the listTargetResponderRecipes operation. This iterable
     * will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses received from the service.
     */
    public Iterable<ListTargetResponderRecipesResponse> listTargetResponderRecipesResponseIterator(
            final ListTargetResponderRecipesRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListTargetResponderRecipesRequest.Builder, ListTargetResponderRecipesRequest,
                ListTargetResponderRecipesResponse>(
                new java.util.function.Supplier<ListTargetResponderRecipesRequest.Builder>() {
                    @Override
                    public ListTargetResponderRecipesRequest.Builder get() {
                        return ListTargetResponderRecipesRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListTargetResponderRecipesResponse, String>() {
                    @Override
                    public String apply(ListTargetResponderRecipesResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListTargetResponderRecipesRequest.Builder>,
                        ListTargetResponderRecipesRequest>() {
                    @Override
                    public ListTargetResponderRecipesRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListTargetResponderRecipesRequest.Builder>
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
                        ListTargetResponderRecipesRequest, ListTargetResponderRecipesResponse>() {
                    @Override
                    public ListTargetResponderRecipesResponse apply(
                            ListTargetResponderRecipesRequest request) {
                        return client.listTargetResponderRecipes(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link com.oracle.bmc.cloudguard.model.TargetResponderRecipeSummary} objects
     * contained in responses from the listTargetResponderRecipes operation. This iterable will fetch more data from the
     * server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link com.oracle.bmc.cloudguard.model.TargetResponderRecipeSummary} objects
     * contained in responses received from the service.
     */
    public Iterable<com.oracle.bmc.cloudguard.model.TargetResponderRecipeSummary>
            listTargetResponderRecipesRecordIterator(
                    final ListTargetResponderRecipesRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListTargetResponderRecipesRequest.Builder, ListTargetResponderRecipesRequest,
                ListTargetResponderRecipesResponse,
                com.oracle.bmc.cloudguard.model.TargetResponderRecipeSummary>(
                new java.util.function.Supplier<ListTargetResponderRecipesRequest.Builder>() {
                    @Override
                    public ListTargetResponderRecipesRequest.Builder get() {
                        return ListTargetResponderRecipesRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListTargetResponderRecipesResponse, String>() {
                    @Override
                    public String apply(ListTargetResponderRecipesResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListTargetResponderRecipesRequest.Builder>,
                        ListTargetResponderRecipesRequest>() {
                    @Override
                    public ListTargetResponderRecipesRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListTargetResponderRecipesRequest.Builder>
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
                        ListTargetResponderRecipesRequest, ListTargetResponderRecipesResponse>() {
                    @Override
                    public ListTargetResponderRecipesResponse apply(
                            ListTargetResponderRecipesRequest request) {
                        return client.listTargetResponderRecipes(request);
                    }
                },
                new java.util.function.Function<
                        ListTargetResponderRecipesResponse,
                        java.util.List<
                                com.oracle.bmc.cloudguard.model.TargetResponderRecipeSummary>>() {
                    @Override
                    public java.util.List<
                                    com.oracle.bmc.cloudguard.model.TargetResponderRecipeSummary>
                            apply(ListTargetResponderRecipesResponse response) {
                        return response.getTargetResponderRecipeCollection().getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the listTargets operation. This iterable
     * will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses received from the service.
     */
    public Iterable<ListTargetsResponse> listTargetsResponseIterator(
            final ListTargetsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListTargetsRequest.Builder, ListTargetsRequest, ListTargetsResponse>(
                new java.util.function.Supplier<ListTargetsRequest.Builder>() {
                    @Override
                    public ListTargetsRequest.Builder get() {
                        return ListTargetsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListTargetsResponse, String>() {
                    @Override
                    public String apply(ListTargetsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListTargetsRequest.Builder>,
                        ListTargetsRequest>() {
                    @Override
                    public ListTargetsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListTargetsRequest.Builder>
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
                new java.util.function.Function<ListTargetsRequest, ListTargetsResponse>() {
                    @Override
                    public ListTargetsResponse apply(ListTargetsRequest request) {
                        return client.listTargets(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link com.oracle.bmc.cloudguard.model.TargetSummary} objects
     * contained in responses from the listTargets operation. This iterable will fetch more data from the
     * server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link com.oracle.bmc.cloudguard.model.TargetSummary} objects
     * contained in responses received from the service.
     */
    public Iterable<com.oracle.bmc.cloudguard.model.TargetSummary> listTargetsRecordIterator(
            final ListTargetsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListTargetsRequest.Builder, ListTargetsRequest, ListTargetsResponse,
                com.oracle.bmc.cloudguard.model.TargetSummary>(
                new java.util.function.Supplier<ListTargetsRequest.Builder>() {
                    @Override
                    public ListTargetsRequest.Builder get() {
                        return ListTargetsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListTargetsResponse, String>() {
                    @Override
                    public String apply(ListTargetsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListTargetsRequest.Builder>,
                        ListTargetsRequest>() {
                    @Override
                    public ListTargetsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListTargetsRequest.Builder>
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
                new java.util.function.Function<ListTargetsRequest, ListTargetsResponse>() {
                    @Override
                    public ListTargetsResponse apply(ListTargetsRequest request) {
                        return client.listTargets(request);
                    }
                },
                new java.util.function.Function<
                        ListTargetsResponse,
                        java.util.List<com.oracle.bmc.cloudguard.model.TargetSummary>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.cloudguard.model.TargetSummary> apply(
                            ListTargetsResponse response) {
                        return response.getTargetCollection().getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the listTechniques operation. This iterable
     * will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses received from the service.
     */
    public Iterable<ListTechniquesResponse> listTechniquesResponseIterator(
            final ListTechniquesRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListTechniquesRequest.Builder, ListTechniquesRequest, ListTechniquesResponse>(
                new java.util.function.Supplier<ListTechniquesRequest.Builder>() {
                    @Override
                    public ListTechniquesRequest.Builder get() {
                        return ListTechniquesRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListTechniquesResponse, String>() {
                    @Override
                    public String apply(ListTechniquesResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListTechniquesRequest.Builder>,
                        ListTechniquesRequest>() {
                    @Override
                    public ListTechniquesRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListTechniquesRequest.Builder>
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
                new java.util.function.Function<ListTechniquesRequest, ListTechniquesResponse>() {
                    @Override
                    public ListTechniquesResponse apply(ListTechniquesRequest request) {
                        return client.listTechniques(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link com.oracle.bmc.cloudguard.model.TechniqueSummary} objects
     * contained in responses from the listTechniques operation. This iterable will fetch more data from the
     * server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link com.oracle.bmc.cloudguard.model.TechniqueSummary} objects
     * contained in responses received from the service.
     */
    public Iterable<com.oracle.bmc.cloudguard.model.TechniqueSummary> listTechniquesRecordIterator(
            final ListTechniquesRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListTechniquesRequest.Builder, ListTechniquesRequest, ListTechniquesResponse,
                com.oracle.bmc.cloudguard.model.TechniqueSummary>(
                new java.util.function.Supplier<ListTechniquesRequest.Builder>() {
                    @Override
                    public ListTechniquesRequest.Builder get() {
                        return ListTechniquesRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListTechniquesResponse, String>() {
                    @Override
                    public String apply(ListTechniquesResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListTechniquesRequest.Builder>,
                        ListTechniquesRequest>() {
                    @Override
                    public ListTechniquesRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListTechniquesRequest.Builder>
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
                new java.util.function.Function<ListTechniquesRequest, ListTechniquesResponse>() {
                    @Override
                    public ListTechniquesResponse apply(ListTechniquesRequest request) {
                        return client.listTechniques(request);
                    }
                },
                new java.util.function.Function<
                        ListTechniquesResponse,
                        java.util.List<com.oracle.bmc.cloudguard.model.TechniqueSummary>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.cloudguard.model.TechniqueSummary> apply(
                            ListTechniquesResponse response) {
                        return response.getTechniqueCollection().getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the listWlpAgents operation. This iterable
     * will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses received from the service.
     */
    public Iterable<ListWlpAgentsResponse> listWlpAgentsResponseIterator(
            final ListWlpAgentsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListWlpAgentsRequest.Builder, ListWlpAgentsRequest, ListWlpAgentsResponse>(
                new java.util.function.Supplier<ListWlpAgentsRequest.Builder>() {
                    @Override
                    public ListWlpAgentsRequest.Builder get() {
                        return ListWlpAgentsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListWlpAgentsResponse, String>() {
                    @Override
                    public String apply(ListWlpAgentsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListWlpAgentsRequest.Builder>,
                        ListWlpAgentsRequest>() {
                    @Override
                    public ListWlpAgentsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListWlpAgentsRequest.Builder>
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
                new java.util.function.Function<ListWlpAgentsRequest, ListWlpAgentsResponse>() {
                    @Override
                    public ListWlpAgentsResponse apply(ListWlpAgentsRequest request) {
                        return client.listWlpAgents(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link com.oracle.bmc.cloudguard.model.WlpAgentSummary} objects
     * contained in responses from the listWlpAgents operation. This iterable will fetch more data from the
     * server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link com.oracle.bmc.cloudguard.model.WlpAgentSummary} objects
     * contained in responses received from the service.
     */
    public Iterable<com.oracle.bmc.cloudguard.model.WlpAgentSummary> listWlpAgentsRecordIterator(
            final ListWlpAgentsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListWlpAgentsRequest.Builder, ListWlpAgentsRequest, ListWlpAgentsResponse,
                com.oracle.bmc.cloudguard.model.WlpAgentSummary>(
                new java.util.function.Supplier<ListWlpAgentsRequest.Builder>() {
                    @Override
                    public ListWlpAgentsRequest.Builder get() {
                        return ListWlpAgentsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListWlpAgentsResponse, String>() {
                    @Override
                    public String apply(ListWlpAgentsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListWlpAgentsRequest.Builder>,
                        ListWlpAgentsRequest>() {
                    @Override
                    public ListWlpAgentsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListWlpAgentsRequest.Builder>
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
                new java.util.function.Function<ListWlpAgentsRequest, ListWlpAgentsResponse>() {
                    @Override
                    public ListWlpAgentsResponse apply(ListWlpAgentsRequest request) {
                        return client.listWlpAgents(request);
                    }
                },
                new java.util.function.Function<
                        ListWlpAgentsResponse,
                        java.util.List<com.oracle.bmc.cloudguard.model.WlpAgentSummary>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.cloudguard.model.WlpAgentSummary> apply(
                            ListWlpAgentsResponse response) {
                        return response.getWlpAgentCollection().getItems();
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
     * Creates a new iterable which will iterate over the {@link com.oracle.bmc.cloudguard.model.WorkRequestError} objects
     * contained in responses from the listWorkRequestErrors operation. This iterable will fetch more data from the
     * server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link com.oracle.bmc.cloudguard.model.WorkRequestError} objects
     * contained in responses received from the service.
     */
    public Iterable<com.oracle.bmc.cloudguard.model.WorkRequestError>
            listWorkRequestErrorsRecordIterator(final ListWorkRequestErrorsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListWorkRequestErrorsRequest.Builder, ListWorkRequestErrorsRequest,
                ListWorkRequestErrorsResponse, com.oracle.bmc.cloudguard.model.WorkRequestError>(
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
                        java.util.List<com.oracle.bmc.cloudguard.model.WorkRequestError>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.cloudguard.model.WorkRequestError> apply(
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
     * Creates a new iterable which will iterate over the {@link com.oracle.bmc.cloudguard.model.WorkRequestLogEntry} objects
     * contained in responses from the listWorkRequestLogs operation. This iterable will fetch more data from the
     * server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link com.oracle.bmc.cloudguard.model.WorkRequestLogEntry} objects
     * contained in responses received from the service.
     */
    public Iterable<com.oracle.bmc.cloudguard.model.WorkRequestLogEntry>
            listWorkRequestLogsRecordIterator(final ListWorkRequestLogsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListWorkRequestLogsRequest.Builder, ListWorkRequestLogsRequest,
                ListWorkRequestLogsResponse, com.oracle.bmc.cloudguard.model.WorkRequestLogEntry>(
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
                        java.util.List<com.oracle.bmc.cloudguard.model.WorkRequestLogEntry>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.cloudguard.model.WorkRequestLogEntry>
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
     * Creates a new iterable which will iterate over the {@link com.oracle.bmc.cloudguard.model.WorkRequestSummary} objects
     * contained in responses from the listWorkRequests operation. This iterable will fetch more data from the
     * server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link com.oracle.bmc.cloudguard.model.WorkRequestSummary} objects
     * contained in responses received from the service.
     */
    public Iterable<com.oracle.bmc.cloudguard.model.WorkRequestSummary>
            listWorkRequestsRecordIterator(final ListWorkRequestsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListWorkRequestsRequest.Builder, ListWorkRequestsRequest, ListWorkRequestsResponse,
                com.oracle.bmc.cloudguard.model.WorkRequestSummary>(
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
                        java.util.List<com.oracle.bmc.cloudguard.model.WorkRequestSummary>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.cloudguard.model.WorkRequestSummary> apply(
                            ListWorkRequestsResponse response) {
                        return response.getWorkRequestSummaryCollection().getItems();
                    }
                });
    }
}

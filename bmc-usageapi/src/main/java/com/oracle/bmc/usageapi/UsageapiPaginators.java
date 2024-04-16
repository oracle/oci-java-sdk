/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.usageapi;

import com.oracle.bmc.usageapi.requests.*;
import com.oracle.bmc.usageapi.responses.*;

/**
 * Collection of helper methods that can be used to provide an {@link java.lang.Iterable} interface
 * to any list operations of Usageapi where multiple pages of data may be fetched. Two styles of
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
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200107")
public class UsageapiPaginators {
    private final Usageapi client;

    public UsageapiPaginators(Usageapi client) {
        this.client = client;
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the
     * listCustomTables operation. This iterable will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses
     *     received from the service.
     */
    public Iterable<ListCustomTablesResponse> listCustomTablesResponseIterator(
            final ListCustomTablesRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListCustomTablesRequest.Builder, ListCustomTablesRequest, ListCustomTablesResponse>(
                new java.util.function.Supplier<ListCustomTablesRequest.Builder>() {
                    @Override
                    public ListCustomTablesRequest.Builder get() {
                        return ListCustomTablesRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListCustomTablesResponse, String>() {
                    @Override
                    public String apply(ListCustomTablesResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListCustomTablesRequest.Builder>,
                        ListCustomTablesRequest>() {
                    @Override
                    public ListCustomTablesRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListCustomTablesRequest.Builder>
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
                        ListCustomTablesRequest, ListCustomTablesResponse>() {
                    @Override
                    public ListCustomTablesResponse apply(ListCustomTablesRequest request) {
                        return client.listCustomTables(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link
     * com.oracle.bmc.usageapi.model.CustomTableSummary} objects contained in responses from the
     * listCustomTables operation. This iterable will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link
     *     com.oracle.bmc.usageapi.model.CustomTableSummary} objects contained in responses received
     *     from the service.
     */
    public Iterable<com.oracle.bmc.usageapi.model.CustomTableSummary>
            listCustomTablesRecordIterator(final ListCustomTablesRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListCustomTablesRequest.Builder,
                ListCustomTablesRequest,
                ListCustomTablesResponse,
                com.oracle.bmc.usageapi.model.CustomTableSummary>(
                new java.util.function.Supplier<ListCustomTablesRequest.Builder>() {
                    @Override
                    public ListCustomTablesRequest.Builder get() {
                        return ListCustomTablesRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListCustomTablesResponse, String>() {
                    @Override
                    public String apply(ListCustomTablesResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListCustomTablesRequest.Builder>,
                        ListCustomTablesRequest>() {
                    @Override
                    public ListCustomTablesRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListCustomTablesRequest.Builder>
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
                        ListCustomTablesRequest, ListCustomTablesResponse>() {
                    @Override
                    public ListCustomTablesResponse apply(ListCustomTablesRequest request) {
                        return client.listCustomTables(request);
                    }
                },
                new java.util.function.Function<
                        ListCustomTablesResponse,
                        java.util.List<com.oracle.bmc.usageapi.model.CustomTableSummary>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.usageapi.model.CustomTableSummary> apply(
                            ListCustomTablesResponse response) {
                        return response.getCustomTableCollection().getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the
     * listEmailRecipientsGroups operation. This iterable will fetch more data from the server as
     * needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses
     *     received from the service.
     */
    public Iterable<ListEmailRecipientsGroupsResponse> listEmailRecipientsGroupsResponseIterator(
            final ListEmailRecipientsGroupsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListEmailRecipientsGroupsRequest.Builder,
                ListEmailRecipientsGroupsRequest,
                ListEmailRecipientsGroupsResponse>(
                new java.util.function.Supplier<ListEmailRecipientsGroupsRequest.Builder>() {
                    @Override
                    public ListEmailRecipientsGroupsRequest.Builder get() {
                        return ListEmailRecipientsGroupsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListEmailRecipientsGroupsResponse, String>() {
                    @Override
                    public String apply(ListEmailRecipientsGroupsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListEmailRecipientsGroupsRequest.Builder>,
                        ListEmailRecipientsGroupsRequest>() {
                    @Override
                    public ListEmailRecipientsGroupsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListEmailRecipientsGroupsRequest.Builder>
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
                        ListEmailRecipientsGroupsRequest, ListEmailRecipientsGroupsResponse>() {
                    @Override
                    public ListEmailRecipientsGroupsResponse apply(
                            ListEmailRecipientsGroupsRequest request) {
                        return client.listEmailRecipientsGroups(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link
     * com.oracle.bmc.usageapi.model.EmailRecipientsGroupSummary} objects contained in responses
     * from the listEmailRecipientsGroups operation. This iterable will fetch more data from the
     * server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link
     *     com.oracle.bmc.usageapi.model.EmailRecipientsGroupSummary} objects contained in responses
     *     received from the service.
     */
    public Iterable<com.oracle.bmc.usageapi.model.EmailRecipientsGroupSummary>
            listEmailRecipientsGroupsRecordIterator(
                    final ListEmailRecipientsGroupsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListEmailRecipientsGroupsRequest.Builder,
                ListEmailRecipientsGroupsRequest,
                ListEmailRecipientsGroupsResponse,
                com.oracle.bmc.usageapi.model.EmailRecipientsGroupSummary>(
                new java.util.function.Supplier<ListEmailRecipientsGroupsRequest.Builder>() {
                    @Override
                    public ListEmailRecipientsGroupsRequest.Builder get() {
                        return ListEmailRecipientsGroupsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListEmailRecipientsGroupsResponse, String>() {
                    @Override
                    public String apply(ListEmailRecipientsGroupsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListEmailRecipientsGroupsRequest.Builder>,
                        ListEmailRecipientsGroupsRequest>() {
                    @Override
                    public ListEmailRecipientsGroupsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListEmailRecipientsGroupsRequest.Builder>
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
                        ListEmailRecipientsGroupsRequest, ListEmailRecipientsGroupsResponse>() {
                    @Override
                    public ListEmailRecipientsGroupsResponse apply(
                            ListEmailRecipientsGroupsRequest request) {
                        return client.listEmailRecipientsGroups(request);
                    }
                },
                new java.util.function.Function<
                        ListEmailRecipientsGroupsResponse,
                        java.util.List<
                                com.oracle.bmc.usageapi.model.EmailRecipientsGroupSummary>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.usageapi.model.EmailRecipientsGroupSummary>
                            apply(ListEmailRecipientsGroupsResponse response) {
                        return response.getEmailRecipientsGroupCollection().getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the listQueries
     * operation. This iterable will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses
     *     received from the service.
     */
    public Iterable<ListQueriesResponse> listQueriesResponseIterator(
            final ListQueriesRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListQueriesRequest.Builder, ListQueriesRequest, ListQueriesResponse>(
                new java.util.function.Supplier<ListQueriesRequest.Builder>() {
                    @Override
                    public ListQueriesRequest.Builder get() {
                        return ListQueriesRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListQueriesResponse, String>() {
                    @Override
                    public String apply(ListQueriesResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListQueriesRequest.Builder>,
                        ListQueriesRequest>() {
                    @Override
                    public ListQueriesRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListQueriesRequest.Builder>
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
                new java.util.function.Function<ListQueriesRequest, ListQueriesResponse>() {
                    @Override
                    public ListQueriesResponse apply(ListQueriesRequest request) {
                        return client.listQueries(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link
     * com.oracle.bmc.usageapi.model.QuerySummary} objects contained in responses from the
     * listQueries operation. This iterable will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link
     *     com.oracle.bmc.usageapi.model.QuerySummary} objects contained in responses received from
     *     the service.
     */
    public Iterable<com.oracle.bmc.usageapi.model.QuerySummary> listQueriesRecordIterator(
            final ListQueriesRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListQueriesRequest.Builder,
                ListQueriesRequest,
                ListQueriesResponse,
                com.oracle.bmc.usageapi.model.QuerySummary>(
                new java.util.function.Supplier<ListQueriesRequest.Builder>() {
                    @Override
                    public ListQueriesRequest.Builder get() {
                        return ListQueriesRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListQueriesResponse, String>() {
                    @Override
                    public String apply(ListQueriesResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListQueriesRequest.Builder>,
                        ListQueriesRequest>() {
                    @Override
                    public ListQueriesRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListQueriesRequest.Builder>
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
                new java.util.function.Function<ListQueriesRequest, ListQueriesResponse>() {
                    @Override
                    public ListQueriesResponse apply(ListQueriesRequest request) {
                        return client.listQueries(request);
                    }
                },
                new java.util.function.Function<
                        ListQueriesResponse,
                        java.util.List<com.oracle.bmc.usageapi.model.QuerySummary>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.usageapi.model.QuerySummary> apply(
                            ListQueriesResponse response) {
                        return response.getQueryCollection().getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the
     * listScheduledRuns operation. This iterable will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses
     *     received from the service.
     */
    public Iterable<ListScheduledRunsResponse> listScheduledRunsResponseIterator(
            final ListScheduledRunsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListScheduledRunsRequest.Builder,
                ListScheduledRunsRequest,
                ListScheduledRunsResponse>(
                new java.util.function.Supplier<ListScheduledRunsRequest.Builder>() {
                    @Override
                    public ListScheduledRunsRequest.Builder get() {
                        return ListScheduledRunsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListScheduledRunsResponse, String>() {
                    @Override
                    public String apply(ListScheduledRunsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListScheduledRunsRequest.Builder>,
                        ListScheduledRunsRequest>() {
                    @Override
                    public ListScheduledRunsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListScheduledRunsRequest.Builder>
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
                        ListScheduledRunsRequest, ListScheduledRunsResponse>() {
                    @Override
                    public ListScheduledRunsResponse apply(ListScheduledRunsRequest request) {
                        return client.listScheduledRuns(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link
     * com.oracle.bmc.usageapi.model.ScheduledRunSummary} objects contained in responses from the
     * listScheduledRuns operation. This iterable will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link
     *     com.oracle.bmc.usageapi.model.ScheduledRunSummary} objects contained in responses
     *     received from the service.
     */
    public Iterable<com.oracle.bmc.usageapi.model.ScheduledRunSummary>
            listScheduledRunsRecordIterator(final ListScheduledRunsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListScheduledRunsRequest.Builder,
                ListScheduledRunsRequest,
                ListScheduledRunsResponse,
                com.oracle.bmc.usageapi.model.ScheduledRunSummary>(
                new java.util.function.Supplier<ListScheduledRunsRequest.Builder>() {
                    @Override
                    public ListScheduledRunsRequest.Builder get() {
                        return ListScheduledRunsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListScheduledRunsResponse, String>() {
                    @Override
                    public String apply(ListScheduledRunsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListScheduledRunsRequest.Builder>,
                        ListScheduledRunsRequest>() {
                    @Override
                    public ListScheduledRunsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListScheduledRunsRequest.Builder>
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
                        ListScheduledRunsRequest, ListScheduledRunsResponse>() {
                    @Override
                    public ListScheduledRunsResponse apply(ListScheduledRunsRequest request) {
                        return client.listScheduledRuns(request);
                    }
                },
                new java.util.function.Function<
                        ListScheduledRunsResponse,
                        java.util.List<com.oracle.bmc.usageapi.model.ScheduledRunSummary>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.usageapi.model.ScheduledRunSummary> apply(
                            ListScheduledRunsResponse response) {
                        return response.getScheduledRunCollection().getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the listSchedules
     * operation. This iterable will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses
     *     received from the service.
     */
    public Iterable<ListSchedulesResponse> listSchedulesResponseIterator(
            final ListSchedulesRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListSchedulesRequest.Builder, ListSchedulesRequest, ListSchedulesResponse>(
                new java.util.function.Supplier<ListSchedulesRequest.Builder>() {
                    @Override
                    public ListSchedulesRequest.Builder get() {
                        return ListSchedulesRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListSchedulesResponse, String>() {
                    @Override
                    public String apply(ListSchedulesResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListSchedulesRequest.Builder>,
                        ListSchedulesRequest>() {
                    @Override
                    public ListSchedulesRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListSchedulesRequest.Builder>
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
                new java.util.function.Function<ListSchedulesRequest, ListSchedulesResponse>() {
                    @Override
                    public ListSchedulesResponse apply(ListSchedulesRequest request) {
                        return client.listSchedules(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link
     * com.oracle.bmc.usageapi.model.ScheduleSummary} objects contained in responses from the
     * listSchedules operation. This iterable will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link
     *     com.oracle.bmc.usageapi.model.ScheduleSummary} objects contained in responses received
     *     from the service.
     */
    public Iterable<com.oracle.bmc.usageapi.model.ScheduleSummary> listSchedulesRecordIterator(
            final ListSchedulesRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListSchedulesRequest.Builder,
                ListSchedulesRequest,
                ListSchedulesResponse,
                com.oracle.bmc.usageapi.model.ScheduleSummary>(
                new java.util.function.Supplier<ListSchedulesRequest.Builder>() {
                    @Override
                    public ListSchedulesRequest.Builder get() {
                        return ListSchedulesRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListSchedulesResponse, String>() {
                    @Override
                    public String apply(ListSchedulesResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListSchedulesRequest.Builder>,
                        ListSchedulesRequest>() {
                    @Override
                    public ListSchedulesRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListSchedulesRequest.Builder>
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
                new java.util.function.Function<ListSchedulesRequest, ListSchedulesResponse>() {
                    @Override
                    public ListSchedulesResponse apply(ListSchedulesRequest request) {
                        return client.listSchedules(request);
                    }
                },
                new java.util.function.Function<
                        ListSchedulesResponse,
                        java.util.List<com.oracle.bmc.usageapi.model.ScheduleSummary>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.usageapi.model.ScheduleSummary> apply(
                            ListSchedulesResponse response) {
                        return response.getScheduleCollection().getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the
     * listUsageCarbonEmissionsQueries operation. This iterable will fetch more data from the server
     * as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses
     *     received from the service.
     */
    public Iterable<ListUsageCarbonEmissionsQueriesResponse>
            listUsageCarbonEmissionsQueriesResponseIterator(
                    final ListUsageCarbonEmissionsQueriesRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListUsageCarbonEmissionsQueriesRequest.Builder,
                ListUsageCarbonEmissionsQueriesRequest,
                ListUsageCarbonEmissionsQueriesResponse>(
                new java.util.function.Supplier<ListUsageCarbonEmissionsQueriesRequest.Builder>() {
                    @Override
                    public ListUsageCarbonEmissionsQueriesRequest.Builder get() {
                        return ListUsageCarbonEmissionsQueriesRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListUsageCarbonEmissionsQueriesResponse, String>() {
                    @Override
                    public String apply(ListUsageCarbonEmissionsQueriesResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListUsageCarbonEmissionsQueriesRequest.Builder>,
                        ListUsageCarbonEmissionsQueriesRequest>() {
                    @Override
                    public ListUsageCarbonEmissionsQueriesRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListUsageCarbonEmissionsQueriesRequest.Builder>
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
                        ListUsageCarbonEmissionsQueriesRequest,
                        ListUsageCarbonEmissionsQueriesResponse>() {
                    @Override
                    public ListUsageCarbonEmissionsQueriesResponse apply(
                            ListUsageCarbonEmissionsQueriesRequest request) {
                        return client.listUsageCarbonEmissionsQueries(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link
     * com.oracle.bmc.usageapi.model.UsageCarbonEmissionsQuerySummary} objects contained in
     * responses from the listUsageCarbonEmissionsQueries operation. This iterable will fetch more
     * data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link
     *     com.oracle.bmc.usageapi.model.UsageCarbonEmissionsQuerySummary} objects contained in
     *     responses received from the service.
     */
    public Iterable<com.oracle.bmc.usageapi.model.UsageCarbonEmissionsQuerySummary>
            listUsageCarbonEmissionsQueriesRecordIterator(
                    final ListUsageCarbonEmissionsQueriesRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListUsageCarbonEmissionsQueriesRequest.Builder,
                ListUsageCarbonEmissionsQueriesRequest,
                ListUsageCarbonEmissionsQueriesResponse,
                com.oracle.bmc.usageapi.model.UsageCarbonEmissionsQuerySummary>(
                new java.util.function.Supplier<ListUsageCarbonEmissionsQueriesRequest.Builder>() {
                    @Override
                    public ListUsageCarbonEmissionsQueriesRequest.Builder get() {
                        return ListUsageCarbonEmissionsQueriesRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListUsageCarbonEmissionsQueriesResponse, String>() {
                    @Override
                    public String apply(ListUsageCarbonEmissionsQueriesResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListUsageCarbonEmissionsQueriesRequest.Builder>,
                        ListUsageCarbonEmissionsQueriesRequest>() {
                    @Override
                    public ListUsageCarbonEmissionsQueriesRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListUsageCarbonEmissionsQueriesRequest.Builder>
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
                        ListUsageCarbonEmissionsQueriesRequest,
                        ListUsageCarbonEmissionsQueriesResponse>() {
                    @Override
                    public ListUsageCarbonEmissionsQueriesResponse apply(
                            ListUsageCarbonEmissionsQueriesRequest request) {
                        return client.listUsageCarbonEmissionsQueries(request);
                    }
                },
                new java.util.function.Function<
                        ListUsageCarbonEmissionsQueriesResponse,
                        java.util.List<
                                com.oracle.bmc.usageapi.model.UsageCarbonEmissionsQuerySummary>>() {
                    @Override
                    public java.util.List<
                                    com.oracle.bmc.usageapi.model.UsageCarbonEmissionsQuerySummary>
                            apply(ListUsageCarbonEmissionsQueriesResponse response) {
                        return response.getUsageCarbonEmissionsQueryCollection().getItems();
                    }
                });
    }
}

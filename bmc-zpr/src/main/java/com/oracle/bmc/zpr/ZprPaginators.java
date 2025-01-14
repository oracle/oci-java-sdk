/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.zpr;

import com.oracle.bmc.zpr.requests.*;
import com.oracle.bmc.zpr.responses.*;

/**
 * Collection of helper methods that can be used to provide an {@link java.lang.Iterable} interface
 * to any list operations of Zpr where multiple pages of data may be fetched. Two styles of
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
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20240301")
public class ZprPaginators {
    private final Zpr client;

    public ZprPaginators(Zpr client) {
        this.client = client;
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the
     * listZprConfigurationWorkRequestErrors operation. This iterable will fetch more data from the
     * server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses
     *     received from the service.
     */
    public Iterable<ListZprConfigurationWorkRequestErrorsResponse>
            listZprConfigurationWorkRequestErrorsResponseIterator(
                    final ListZprConfigurationWorkRequestErrorsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListZprConfigurationWorkRequestErrorsRequest.Builder,
                ListZprConfigurationWorkRequestErrorsRequest,
                ListZprConfigurationWorkRequestErrorsResponse>(
                new java.util.function.Supplier<
                        ListZprConfigurationWorkRequestErrorsRequest.Builder>() {
                    @Override
                    public ListZprConfigurationWorkRequestErrorsRequest.Builder get() {
                        return ListZprConfigurationWorkRequestErrorsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<
                        ListZprConfigurationWorkRequestErrorsResponse, String>() {
                    @Override
                    public String apply(ListZprConfigurationWorkRequestErrorsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListZprConfigurationWorkRequestErrorsRequest.Builder>,
                        ListZprConfigurationWorkRequestErrorsRequest>() {
                    @Override
                    public ListZprConfigurationWorkRequestErrorsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListZprConfigurationWorkRequestErrorsRequest.Builder>
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
                        ListZprConfigurationWorkRequestErrorsRequest,
                        ListZprConfigurationWorkRequestErrorsResponse>() {
                    @Override
                    public ListZprConfigurationWorkRequestErrorsResponse apply(
                            ListZprConfigurationWorkRequestErrorsRequest request) {
                        return client.listZprConfigurationWorkRequestErrors(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link
     * com.oracle.bmc.zpr.model.WorkRequestError} objects contained in responses from the
     * listZprConfigurationWorkRequestErrors operation. This iterable will fetch more data from the
     * server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link
     *     com.oracle.bmc.zpr.model.WorkRequestError} objects contained in responses received from
     *     the service.
     */
    public Iterable<com.oracle.bmc.zpr.model.WorkRequestError>
            listZprConfigurationWorkRequestErrorsRecordIterator(
                    final ListZprConfigurationWorkRequestErrorsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListZprConfigurationWorkRequestErrorsRequest.Builder,
                ListZprConfigurationWorkRequestErrorsRequest,
                ListZprConfigurationWorkRequestErrorsResponse,
                com.oracle.bmc.zpr.model.WorkRequestError>(
                new java.util.function.Supplier<
                        ListZprConfigurationWorkRequestErrorsRequest.Builder>() {
                    @Override
                    public ListZprConfigurationWorkRequestErrorsRequest.Builder get() {
                        return ListZprConfigurationWorkRequestErrorsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<
                        ListZprConfigurationWorkRequestErrorsResponse, String>() {
                    @Override
                    public String apply(ListZprConfigurationWorkRequestErrorsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListZprConfigurationWorkRequestErrorsRequest.Builder>,
                        ListZprConfigurationWorkRequestErrorsRequest>() {
                    @Override
                    public ListZprConfigurationWorkRequestErrorsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListZprConfigurationWorkRequestErrorsRequest.Builder>
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
                        ListZprConfigurationWorkRequestErrorsRequest,
                        ListZprConfigurationWorkRequestErrorsResponse>() {
                    @Override
                    public ListZprConfigurationWorkRequestErrorsResponse apply(
                            ListZprConfigurationWorkRequestErrorsRequest request) {
                        return client.listZprConfigurationWorkRequestErrors(request);
                    }
                },
                new java.util.function.Function<
                        ListZprConfigurationWorkRequestErrorsResponse,
                        java.util.List<com.oracle.bmc.zpr.model.WorkRequestError>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.zpr.model.WorkRequestError> apply(
                            ListZprConfigurationWorkRequestErrorsResponse response) {
                        return response.getWorkRequestErrorCollection().getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the
     * listZprConfigurationWorkRequestLogs operation. This iterable will fetch more data from the
     * server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses
     *     received from the service.
     */
    public Iterable<ListZprConfigurationWorkRequestLogsResponse>
            listZprConfigurationWorkRequestLogsResponseIterator(
                    final ListZprConfigurationWorkRequestLogsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListZprConfigurationWorkRequestLogsRequest.Builder,
                ListZprConfigurationWorkRequestLogsRequest,
                ListZprConfigurationWorkRequestLogsResponse>(
                new java.util.function.Supplier<
                        ListZprConfigurationWorkRequestLogsRequest.Builder>() {
                    @Override
                    public ListZprConfigurationWorkRequestLogsRequest.Builder get() {
                        return ListZprConfigurationWorkRequestLogsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<
                        ListZprConfigurationWorkRequestLogsResponse, String>() {
                    @Override
                    public String apply(ListZprConfigurationWorkRequestLogsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListZprConfigurationWorkRequestLogsRequest.Builder>,
                        ListZprConfigurationWorkRequestLogsRequest>() {
                    @Override
                    public ListZprConfigurationWorkRequestLogsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListZprConfigurationWorkRequestLogsRequest.Builder>
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
                        ListZprConfigurationWorkRequestLogsRequest,
                        ListZprConfigurationWorkRequestLogsResponse>() {
                    @Override
                    public ListZprConfigurationWorkRequestLogsResponse apply(
                            ListZprConfigurationWorkRequestLogsRequest request) {
                        return client.listZprConfigurationWorkRequestLogs(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link
     * com.oracle.bmc.zpr.model.WorkRequestLogEntry} objects contained in responses from the
     * listZprConfigurationWorkRequestLogs operation. This iterable will fetch more data from the
     * server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link
     *     com.oracle.bmc.zpr.model.WorkRequestLogEntry} objects contained in responses received
     *     from the service.
     */
    public Iterable<com.oracle.bmc.zpr.model.WorkRequestLogEntry>
            listZprConfigurationWorkRequestLogsRecordIterator(
                    final ListZprConfigurationWorkRequestLogsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListZprConfigurationWorkRequestLogsRequest.Builder,
                ListZprConfigurationWorkRequestLogsRequest,
                ListZprConfigurationWorkRequestLogsResponse,
                com.oracle.bmc.zpr.model.WorkRequestLogEntry>(
                new java.util.function.Supplier<
                        ListZprConfigurationWorkRequestLogsRequest.Builder>() {
                    @Override
                    public ListZprConfigurationWorkRequestLogsRequest.Builder get() {
                        return ListZprConfigurationWorkRequestLogsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<
                        ListZprConfigurationWorkRequestLogsResponse, String>() {
                    @Override
                    public String apply(ListZprConfigurationWorkRequestLogsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListZprConfigurationWorkRequestLogsRequest.Builder>,
                        ListZprConfigurationWorkRequestLogsRequest>() {
                    @Override
                    public ListZprConfigurationWorkRequestLogsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListZprConfigurationWorkRequestLogsRequest.Builder>
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
                        ListZprConfigurationWorkRequestLogsRequest,
                        ListZprConfigurationWorkRequestLogsResponse>() {
                    @Override
                    public ListZprConfigurationWorkRequestLogsResponse apply(
                            ListZprConfigurationWorkRequestLogsRequest request) {
                        return client.listZprConfigurationWorkRequestLogs(request);
                    }
                },
                new java.util.function.Function<
                        ListZprConfigurationWorkRequestLogsResponse,
                        java.util.List<com.oracle.bmc.zpr.model.WorkRequestLogEntry>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.zpr.model.WorkRequestLogEntry> apply(
                            ListZprConfigurationWorkRequestLogsResponse response) {
                        return response.getWorkRequestLogEntryCollection().getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the
     * listZprConfigurationWorkRequests operation. This iterable will fetch more data from the
     * server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses
     *     received from the service.
     */
    public Iterable<ListZprConfigurationWorkRequestsResponse>
            listZprConfigurationWorkRequestsResponseIterator(
                    final ListZprConfigurationWorkRequestsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListZprConfigurationWorkRequestsRequest.Builder,
                ListZprConfigurationWorkRequestsRequest,
                ListZprConfigurationWorkRequestsResponse>(
                new java.util.function.Supplier<ListZprConfigurationWorkRequestsRequest.Builder>() {
                    @Override
                    public ListZprConfigurationWorkRequestsRequest.Builder get() {
                        return ListZprConfigurationWorkRequestsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<
                        ListZprConfigurationWorkRequestsResponse, String>() {
                    @Override
                    public String apply(ListZprConfigurationWorkRequestsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListZprConfigurationWorkRequestsRequest.Builder>,
                        ListZprConfigurationWorkRequestsRequest>() {
                    @Override
                    public ListZprConfigurationWorkRequestsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListZprConfigurationWorkRequestsRequest.Builder>
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
                        ListZprConfigurationWorkRequestsRequest,
                        ListZprConfigurationWorkRequestsResponse>() {
                    @Override
                    public ListZprConfigurationWorkRequestsResponse apply(
                            ListZprConfigurationWorkRequestsRequest request) {
                        return client.listZprConfigurationWorkRequests(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link
     * com.oracle.bmc.zpr.model.WorkRequestSummary} objects contained in responses from the
     * listZprConfigurationWorkRequests operation. This iterable will fetch more data from the
     * server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link
     *     com.oracle.bmc.zpr.model.WorkRequestSummary} objects contained in responses received from
     *     the service.
     */
    public Iterable<com.oracle.bmc.zpr.model.WorkRequestSummary>
            listZprConfigurationWorkRequestsRecordIterator(
                    final ListZprConfigurationWorkRequestsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListZprConfigurationWorkRequestsRequest.Builder,
                ListZprConfigurationWorkRequestsRequest,
                ListZprConfigurationWorkRequestsResponse,
                com.oracle.bmc.zpr.model.WorkRequestSummary>(
                new java.util.function.Supplier<ListZprConfigurationWorkRequestsRequest.Builder>() {
                    @Override
                    public ListZprConfigurationWorkRequestsRequest.Builder get() {
                        return ListZprConfigurationWorkRequestsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<
                        ListZprConfigurationWorkRequestsResponse, String>() {
                    @Override
                    public String apply(ListZprConfigurationWorkRequestsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListZprConfigurationWorkRequestsRequest.Builder>,
                        ListZprConfigurationWorkRequestsRequest>() {
                    @Override
                    public ListZprConfigurationWorkRequestsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListZprConfigurationWorkRequestsRequest.Builder>
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
                        ListZprConfigurationWorkRequestsRequest,
                        ListZprConfigurationWorkRequestsResponse>() {
                    @Override
                    public ListZprConfigurationWorkRequestsResponse apply(
                            ListZprConfigurationWorkRequestsRequest request) {
                        return client.listZprConfigurationWorkRequests(request);
                    }
                },
                new java.util.function.Function<
                        ListZprConfigurationWorkRequestsResponse,
                        java.util.List<com.oracle.bmc.zpr.model.WorkRequestSummary>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.zpr.model.WorkRequestSummary> apply(
                            ListZprConfigurationWorkRequestsResponse response) {
                        return response.getWorkRequestSummaryCollection().getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the
     * listZprPolicies operation. This iterable will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses
     *     received from the service.
     */
    public Iterable<ListZprPoliciesResponse> listZprPoliciesResponseIterator(
            final ListZprPoliciesRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListZprPoliciesRequest.Builder, ListZprPoliciesRequest, ListZprPoliciesResponse>(
                new java.util.function.Supplier<ListZprPoliciesRequest.Builder>() {
                    @Override
                    public ListZprPoliciesRequest.Builder get() {
                        return ListZprPoliciesRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListZprPoliciesResponse, String>() {
                    @Override
                    public String apply(ListZprPoliciesResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListZprPoliciesRequest.Builder>,
                        ListZprPoliciesRequest>() {
                    @Override
                    public ListZprPoliciesRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListZprPoliciesRequest.Builder>
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
                new java.util.function.Function<ListZprPoliciesRequest, ListZprPoliciesResponse>() {
                    @Override
                    public ListZprPoliciesResponse apply(ListZprPoliciesRequest request) {
                        return client.listZprPolicies(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link
     * com.oracle.bmc.zpr.model.ZprPolicySummary} objects contained in responses from the
     * listZprPolicies operation. This iterable will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link
     *     com.oracle.bmc.zpr.model.ZprPolicySummary} objects contained in responses received from
     *     the service.
     */
    public Iterable<com.oracle.bmc.zpr.model.ZprPolicySummary> listZprPoliciesRecordIterator(
            final ListZprPoliciesRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListZprPoliciesRequest.Builder,
                ListZprPoliciesRequest,
                ListZprPoliciesResponse,
                com.oracle.bmc.zpr.model.ZprPolicySummary>(
                new java.util.function.Supplier<ListZprPoliciesRequest.Builder>() {
                    @Override
                    public ListZprPoliciesRequest.Builder get() {
                        return ListZprPoliciesRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListZprPoliciesResponse, String>() {
                    @Override
                    public String apply(ListZprPoliciesResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListZprPoliciesRequest.Builder>,
                        ListZprPoliciesRequest>() {
                    @Override
                    public ListZprPoliciesRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListZprPoliciesRequest.Builder>
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
                new java.util.function.Function<ListZprPoliciesRequest, ListZprPoliciesResponse>() {
                    @Override
                    public ListZprPoliciesResponse apply(ListZprPoliciesRequest request) {
                        return client.listZprPolicies(request);
                    }
                },
                new java.util.function.Function<
                        ListZprPoliciesResponse,
                        java.util.List<com.oracle.bmc.zpr.model.ZprPolicySummary>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.zpr.model.ZprPolicySummary> apply(
                            ListZprPoliciesResponse response) {
                        return response.getZprPolicyCollection().getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the
     * listZprPolicyWorkRequestErrors operation. This iterable will fetch more data from the server
     * as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses
     *     received from the service.
     */
    public Iterable<ListZprPolicyWorkRequestErrorsResponse>
            listZprPolicyWorkRequestErrorsResponseIterator(
                    final ListZprPolicyWorkRequestErrorsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListZprPolicyWorkRequestErrorsRequest.Builder,
                ListZprPolicyWorkRequestErrorsRequest,
                ListZprPolicyWorkRequestErrorsResponse>(
                new java.util.function.Supplier<ListZprPolicyWorkRequestErrorsRequest.Builder>() {
                    @Override
                    public ListZprPolicyWorkRequestErrorsRequest.Builder get() {
                        return ListZprPolicyWorkRequestErrorsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListZprPolicyWorkRequestErrorsResponse, String>() {
                    @Override
                    public String apply(ListZprPolicyWorkRequestErrorsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListZprPolicyWorkRequestErrorsRequest.Builder>,
                        ListZprPolicyWorkRequestErrorsRequest>() {
                    @Override
                    public ListZprPolicyWorkRequestErrorsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListZprPolicyWorkRequestErrorsRequest.Builder>
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
                        ListZprPolicyWorkRequestErrorsRequest,
                        ListZprPolicyWorkRequestErrorsResponse>() {
                    @Override
                    public ListZprPolicyWorkRequestErrorsResponse apply(
                            ListZprPolicyWorkRequestErrorsRequest request) {
                        return client.listZprPolicyWorkRequestErrors(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link
     * com.oracle.bmc.zpr.model.WorkRequestError} objects contained in responses from the
     * listZprPolicyWorkRequestErrors operation. This iterable will fetch more data from the server
     * as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link
     *     com.oracle.bmc.zpr.model.WorkRequestError} objects contained in responses received from
     *     the service.
     */
    public Iterable<com.oracle.bmc.zpr.model.WorkRequestError>
            listZprPolicyWorkRequestErrorsRecordIterator(
                    final ListZprPolicyWorkRequestErrorsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListZprPolicyWorkRequestErrorsRequest.Builder,
                ListZprPolicyWorkRequestErrorsRequest,
                ListZprPolicyWorkRequestErrorsResponse,
                com.oracle.bmc.zpr.model.WorkRequestError>(
                new java.util.function.Supplier<ListZprPolicyWorkRequestErrorsRequest.Builder>() {
                    @Override
                    public ListZprPolicyWorkRequestErrorsRequest.Builder get() {
                        return ListZprPolicyWorkRequestErrorsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListZprPolicyWorkRequestErrorsResponse, String>() {
                    @Override
                    public String apply(ListZprPolicyWorkRequestErrorsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListZprPolicyWorkRequestErrorsRequest.Builder>,
                        ListZprPolicyWorkRequestErrorsRequest>() {
                    @Override
                    public ListZprPolicyWorkRequestErrorsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListZprPolicyWorkRequestErrorsRequest.Builder>
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
                        ListZprPolicyWorkRequestErrorsRequest,
                        ListZprPolicyWorkRequestErrorsResponse>() {
                    @Override
                    public ListZprPolicyWorkRequestErrorsResponse apply(
                            ListZprPolicyWorkRequestErrorsRequest request) {
                        return client.listZprPolicyWorkRequestErrors(request);
                    }
                },
                new java.util.function.Function<
                        ListZprPolicyWorkRequestErrorsResponse,
                        java.util.List<com.oracle.bmc.zpr.model.WorkRequestError>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.zpr.model.WorkRequestError> apply(
                            ListZprPolicyWorkRequestErrorsResponse response) {
                        return response.getWorkRequestErrorCollection().getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the
     * listZprPolicyWorkRequestLogs operation. This iterable will fetch more data from the server as
     * needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses
     *     received from the service.
     */
    public Iterable<ListZprPolicyWorkRequestLogsResponse>
            listZprPolicyWorkRequestLogsResponseIterator(
                    final ListZprPolicyWorkRequestLogsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListZprPolicyWorkRequestLogsRequest.Builder,
                ListZprPolicyWorkRequestLogsRequest,
                ListZprPolicyWorkRequestLogsResponse>(
                new java.util.function.Supplier<ListZprPolicyWorkRequestLogsRequest.Builder>() {
                    @Override
                    public ListZprPolicyWorkRequestLogsRequest.Builder get() {
                        return ListZprPolicyWorkRequestLogsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListZprPolicyWorkRequestLogsResponse, String>() {
                    @Override
                    public String apply(ListZprPolicyWorkRequestLogsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListZprPolicyWorkRequestLogsRequest.Builder>,
                        ListZprPolicyWorkRequestLogsRequest>() {
                    @Override
                    public ListZprPolicyWorkRequestLogsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListZprPolicyWorkRequestLogsRequest.Builder>
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
                        ListZprPolicyWorkRequestLogsRequest,
                        ListZprPolicyWorkRequestLogsResponse>() {
                    @Override
                    public ListZprPolicyWorkRequestLogsResponse apply(
                            ListZprPolicyWorkRequestLogsRequest request) {
                        return client.listZprPolicyWorkRequestLogs(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link
     * com.oracle.bmc.zpr.model.WorkRequestLogEntry} objects contained in responses from the
     * listZprPolicyWorkRequestLogs operation. This iterable will fetch more data from the server as
     * needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link
     *     com.oracle.bmc.zpr.model.WorkRequestLogEntry} objects contained in responses received
     *     from the service.
     */
    public Iterable<com.oracle.bmc.zpr.model.WorkRequestLogEntry>
            listZprPolicyWorkRequestLogsRecordIterator(
                    final ListZprPolicyWorkRequestLogsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListZprPolicyWorkRequestLogsRequest.Builder,
                ListZprPolicyWorkRequestLogsRequest,
                ListZprPolicyWorkRequestLogsResponse,
                com.oracle.bmc.zpr.model.WorkRequestLogEntry>(
                new java.util.function.Supplier<ListZprPolicyWorkRequestLogsRequest.Builder>() {
                    @Override
                    public ListZprPolicyWorkRequestLogsRequest.Builder get() {
                        return ListZprPolicyWorkRequestLogsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListZprPolicyWorkRequestLogsResponse, String>() {
                    @Override
                    public String apply(ListZprPolicyWorkRequestLogsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListZprPolicyWorkRequestLogsRequest.Builder>,
                        ListZprPolicyWorkRequestLogsRequest>() {
                    @Override
                    public ListZprPolicyWorkRequestLogsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListZprPolicyWorkRequestLogsRequest.Builder>
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
                        ListZprPolicyWorkRequestLogsRequest,
                        ListZprPolicyWorkRequestLogsResponse>() {
                    @Override
                    public ListZprPolicyWorkRequestLogsResponse apply(
                            ListZprPolicyWorkRequestLogsRequest request) {
                        return client.listZprPolicyWorkRequestLogs(request);
                    }
                },
                new java.util.function.Function<
                        ListZprPolicyWorkRequestLogsResponse,
                        java.util.List<com.oracle.bmc.zpr.model.WorkRequestLogEntry>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.zpr.model.WorkRequestLogEntry> apply(
                            ListZprPolicyWorkRequestLogsResponse response) {
                        return response.getWorkRequestLogEntryCollection().getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the
     * listZprPolicyWorkRequests operation. This iterable will fetch more data from the server as
     * needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses
     *     received from the service.
     */
    public Iterable<ListZprPolicyWorkRequestsResponse> listZprPolicyWorkRequestsResponseIterator(
            final ListZprPolicyWorkRequestsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListZprPolicyWorkRequestsRequest.Builder,
                ListZprPolicyWorkRequestsRequest,
                ListZprPolicyWorkRequestsResponse>(
                new java.util.function.Supplier<ListZprPolicyWorkRequestsRequest.Builder>() {
                    @Override
                    public ListZprPolicyWorkRequestsRequest.Builder get() {
                        return ListZprPolicyWorkRequestsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListZprPolicyWorkRequestsResponse, String>() {
                    @Override
                    public String apply(ListZprPolicyWorkRequestsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListZprPolicyWorkRequestsRequest.Builder>,
                        ListZprPolicyWorkRequestsRequest>() {
                    @Override
                    public ListZprPolicyWorkRequestsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListZprPolicyWorkRequestsRequest.Builder>
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
                        ListZprPolicyWorkRequestsRequest, ListZprPolicyWorkRequestsResponse>() {
                    @Override
                    public ListZprPolicyWorkRequestsResponse apply(
                            ListZprPolicyWorkRequestsRequest request) {
                        return client.listZprPolicyWorkRequests(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link
     * com.oracle.bmc.zpr.model.WorkRequestSummary} objects contained in responses from the
     * listZprPolicyWorkRequests operation. This iterable will fetch more data from the server as
     * needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link
     *     com.oracle.bmc.zpr.model.WorkRequestSummary} objects contained in responses received from
     *     the service.
     */
    public Iterable<com.oracle.bmc.zpr.model.WorkRequestSummary>
            listZprPolicyWorkRequestsRecordIterator(
                    final ListZprPolicyWorkRequestsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListZprPolicyWorkRequestsRequest.Builder,
                ListZprPolicyWorkRequestsRequest,
                ListZprPolicyWorkRequestsResponse,
                com.oracle.bmc.zpr.model.WorkRequestSummary>(
                new java.util.function.Supplier<ListZprPolicyWorkRequestsRequest.Builder>() {
                    @Override
                    public ListZprPolicyWorkRequestsRequest.Builder get() {
                        return ListZprPolicyWorkRequestsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListZprPolicyWorkRequestsResponse, String>() {
                    @Override
                    public String apply(ListZprPolicyWorkRequestsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListZprPolicyWorkRequestsRequest.Builder>,
                        ListZprPolicyWorkRequestsRequest>() {
                    @Override
                    public ListZprPolicyWorkRequestsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListZprPolicyWorkRequestsRequest.Builder>
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
                        ListZprPolicyWorkRequestsRequest, ListZprPolicyWorkRequestsResponse>() {
                    @Override
                    public ListZprPolicyWorkRequestsResponse apply(
                            ListZprPolicyWorkRequestsRequest request) {
                        return client.listZprPolicyWorkRequests(request);
                    }
                },
                new java.util.function.Function<
                        ListZprPolicyWorkRequestsResponse,
                        java.util.List<com.oracle.bmc.zpr.model.WorkRequestSummary>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.zpr.model.WorkRequestSummary> apply(
                            ListZprPolicyWorkRequestsResponse response) {
                        return response.getWorkRequestSummaryCollection().getItems();
                    }
                });
    }
}

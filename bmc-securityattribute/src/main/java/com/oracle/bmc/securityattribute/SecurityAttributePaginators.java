/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.securityattribute;

import com.oracle.bmc.securityattribute.requests.*;
import com.oracle.bmc.securityattribute.responses.*;

/**
 * Collection of helper methods that can be used to provide an {@link java.lang.Iterable} interface
 * to any list operations of SecurityAttribute where multiple pages of data may be fetched. Two
 * styles of iteration are supported:
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
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20240815")
public class SecurityAttributePaginators {
    private final SecurityAttribute client;

    public SecurityAttributePaginators(SecurityAttribute client) {
        this.client = client;
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the
     * listSecurityAttributeNamespaces operation. This iterable will fetch more data from the server
     * as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses
     *     received from the service.
     */
    public Iterable<ListSecurityAttributeNamespacesResponse>
            listSecurityAttributeNamespacesResponseIterator(
                    final ListSecurityAttributeNamespacesRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListSecurityAttributeNamespacesRequest.Builder,
                ListSecurityAttributeNamespacesRequest,
                ListSecurityAttributeNamespacesResponse>(
                new java.util.function.Supplier<ListSecurityAttributeNamespacesRequest.Builder>() {
                    @Override
                    public ListSecurityAttributeNamespacesRequest.Builder get() {
                        return ListSecurityAttributeNamespacesRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListSecurityAttributeNamespacesResponse, String>() {
                    @Override
                    public String apply(ListSecurityAttributeNamespacesResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListSecurityAttributeNamespacesRequest.Builder>,
                        ListSecurityAttributeNamespacesRequest>() {
                    @Override
                    public ListSecurityAttributeNamespacesRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListSecurityAttributeNamespacesRequest.Builder>
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
                        ListSecurityAttributeNamespacesRequest,
                        ListSecurityAttributeNamespacesResponse>() {
                    @Override
                    public ListSecurityAttributeNamespacesResponse apply(
                            ListSecurityAttributeNamespacesRequest request) {
                        return client.listSecurityAttributeNamespaces(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link
     * com.oracle.bmc.securityattribute.model.SecurityAttributeNamespaceSummary} objects contained
     * in responses from the listSecurityAttributeNamespaces operation. This iterable will fetch
     * more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link
     *     com.oracle.bmc.securityattribute.model.SecurityAttributeNamespaceSummary} objects
     *     contained in responses received from the service.
     */
    public Iterable<com.oracle.bmc.securityattribute.model.SecurityAttributeNamespaceSummary>
            listSecurityAttributeNamespacesRecordIterator(
                    final ListSecurityAttributeNamespacesRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListSecurityAttributeNamespacesRequest.Builder,
                ListSecurityAttributeNamespacesRequest,
                ListSecurityAttributeNamespacesResponse,
                com.oracle.bmc.securityattribute.model.SecurityAttributeNamespaceSummary>(
                new java.util.function.Supplier<ListSecurityAttributeNamespacesRequest.Builder>() {
                    @Override
                    public ListSecurityAttributeNamespacesRequest.Builder get() {
                        return ListSecurityAttributeNamespacesRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListSecurityAttributeNamespacesResponse, String>() {
                    @Override
                    public String apply(ListSecurityAttributeNamespacesResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListSecurityAttributeNamespacesRequest.Builder>,
                        ListSecurityAttributeNamespacesRequest>() {
                    @Override
                    public ListSecurityAttributeNamespacesRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListSecurityAttributeNamespacesRequest.Builder>
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
                        ListSecurityAttributeNamespacesRequest,
                        ListSecurityAttributeNamespacesResponse>() {
                    @Override
                    public ListSecurityAttributeNamespacesResponse apply(
                            ListSecurityAttributeNamespacesRequest request) {
                        return client.listSecurityAttributeNamespaces(request);
                    }
                },
                new java.util.function.Function<
                        ListSecurityAttributeNamespacesResponse,
                        java.util.List<
                                com.oracle.bmc.securityattribute.model
                                        .SecurityAttributeNamespaceSummary>>() {
                    @Override
                    public java.util.List<
                                    com.oracle.bmc.securityattribute.model
                                            .SecurityAttributeNamespaceSummary>
                            apply(ListSecurityAttributeNamespacesResponse response) {
                        return response.getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the
     * listSecurityAttributeWorkRequestErrors operation. This iterable will fetch more data from the
     * server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses
     *     received from the service.
     */
    public Iterable<ListSecurityAttributeWorkRequestErrorsResponse>
            listSecurityAttributeWorkRequestErrorsResponseIterator(
                    final ListSecurityAttributeWorkRequestErrorsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListSecurityAttributeWorkRequestErrorsRequest.Builder,
                ListSecurityAttributeWorkRequestErrorsRequest,
                ListSecurityAttributeWorkRequestErrorsResponse>(
                new java.util.function.Supplier<
                        ListSecurityAttributeWorkRequestErrorsRequest.Builder>() {
                    @Override
                    public ListSecurityAttributeWorkRequestErrorsRequest.Builder get() {
                        return ListSecurityAttributeWorkRequestErrorsRequest.builder()
                                .copy(request);
                    }
                },
                new java.util.function.Function<
                        ListSecurityAttributeWorkRequestErrorsResponse, String>() {
                    @Override
                    public String apply(ListSecurityAttributeWorkRequestErrorsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListSecurityAttributeWorkRequestErrorsRequest.Builder>,
                        ListSecurityAttributeWorkRequestErrorsRequest>() {
                    @Override
                    public ListSecurityAttributeWorkRequestErrorsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListSecurityAttributeWorkRequestErrorsRequest.Builder>
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
                        ListSecurityAttributeWorkRequestErrorsRequest,
                        ListSecurityAttributeWorkRequestErrorsResponse>() {
                    @Override
                    public ListSecurityAttributeWorkRequestErrorsResponse apply(
                            ListSecurityAttributeWorkRequestErrorsRequest request) {
                        return client.listSecurityAttributeWorkRequestErrors(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link
     * com.oracle.bmc.securityattribute.model.SecurityAttributeWorkRequestErrorSummary} objects
     * contained in responses from the listSecurityAttributeWorkRequestErrors operation. This
     * iterable will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link
     *     com.oracle.bmc.securityattribute.model.SecurityAttributeWorkRequestErrorSummary} objects
     *     contained in responses received from the service.
     */
    public Iterable<com.oracle.bmc.securityattribute.model.SecurityAttributeWorkRequestErrorSummary>
            listSecurityAttributeWorkRequestErrorsRecordIterator(
                    final ListSecurityAttributeWorkRequestErrorsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListSecurityAttributeWorkRequestErrorsRequest.Builder,
                ListSecurityAttributeWorkRequestErrorsRequest,
                ListSecurityAttributeWorkRequestErrorsResponse,
                com.oracle.bmc.securityattribute.model.SecurityAttributeWorkRequestErrorSummary>(
                new java.util.function.Supplier<
                        ListSecurityAttributeWorkRequestErrorsRequest.Builder>() {
                    @Override
                    public ListSecurityAttributeWorkRequestErrorsRequest.Builder get() {
                        return ListSecurityAttributeWorkRequestErrorsRequest.builder()
                                .copy(request);
                    }
                },
                new java.util.function.Function<
                        ListSecurityAttributeWorkRequestErrorsResponse, String>() {
                    @Override
                    public String apply(ListSecurityAttributeWorkRequestErrorsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListSecurityAttributeWorkRequestErrorsRequest.Builder>,
                        ListSecurityAttributeWorkRequestErrorsRequest>() {
                    @Override
                    public ListSecurityAttributeWorkRequestErrorsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListSecurityAttributeWorkRequestErrorsRequest.Builder>
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
                        ListSecurityAttributeWorkRequestErrorsRequest,
                        ListSecurityAttributeWorkRequestErrorsResponse>() {
                    @Override
                    public ListSecurityAttributeWorkRequestErrorsResponse apply(
                            ListSecurityAttributeWorkRequestErrorsRequest request) {
                        return client.listSecurityAttributeWorkRequestErrors(request);
                    }
                },
                new java.util.function.Function<
                        ListSecurityAttributeWorkRequestErrorsResponse,
                        java.util.List<
                                com.oracle.bmc.securityattribute.model
                                        .SecurityAttributeWorkRequestErrorSummary>>() {
                    @Override
                    public java.util.List<
                                    com.oracle.bmc.securityattribute.model
                                            .SecurityAttributeWorkRequestErrorSummary>
                            apply(ListSecurityAttributeWorkRequestErrorsResponse response) {
                        return response.getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the
     * listSecurityAttributeWorkRequestLogs operation. This iterable will fetch more data from the
     * server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses
     *     received from the service.
     */
    public Iterable<ListSecurityAttributeWorkRequestLogsResponse>
            listSecurityAttributeWorkRequestLogsResponseIterator(
                    final ListSecurityAttributeWorkRequestLogsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListSecurityAttributeWorkRequestLogsRequest.Builder,
                ListSecurityAttributeWorkRequestLogsRequest,
                ListSecurityAttributeWorkRequestLogsResponse>(
                new java.util.function.Supplier<
                        ListSecurityAttributeWorkRequestLogsRequest.Builder>() {
                    @Override
                    public ListSecurityAttributeWorkRequestLogsRequest.Builder get() {
                        return ListSecurityAttributeWorkRequestLogsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<
                        ListSecurityAttributeWorkRequestLogsResponse, String>() {
                    @Override
                    public String apply(ListSecurityAttributeWorkRequestLogsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListSecurityAttributeWorkRequestLogsRequest.Builder>,
                        ListSecurityAttributeWorkRequestLogsRequest>() {
                    @Override
                    public ListSecurityAttributeWorkRequestLogsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListSecurityAttributeWorkRequestLogsRequest.Builder>
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
                        ListSecurityAttributeWorkRequestLogsRequest,
                        ListSecurityAttributeWorkRequestLogsResponse>() {
                    @Override
                    public ListSecurityAttributeWorkRequestLogsResponse apply(
                            ListSecurityAttributeWorkRequestLogsRequest request) {
                        return client.listSecurityAttributeWorkRequestLogs(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link
     * com.oracle.bmc.securityattribute.model.SecurityAttributeWorkRequestLogSummary} objects
     * contained in responses from the listSecurityAttributeWorkRequestLogs operation. This iterable
     * will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link
     *     com.oracle.bmc.securityattribute.model.SecurityAttributeWorkRequestLogSummary} objects
     *     contained in responses received from the service.
     */
    public Iterable<com.oracle.bmc.securityattribute.model.SecurityAttributeWorkRequestLogSummary>
            listSecurityAttributeWorkRequestLogsRecordIterator(
                    final ListSecurityAttributeWorkRequestLogsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListSecurityAttributeWorkRequestLogsRequest.Builder,
                ListSecurityAttributeWorkRequestLogsRequest,
                ListSecurityAttributeWorkRequestLogsResponse,
                com.oracle.bmc.securityattribute.model.SecurityAttributeWorkRequestLogSummary>(
                new java.util.function.Supplier<
                        ListSecurityAttributeWorkRequestLogsRequest.Builder>() {
                    @Override
                    public ListSecurityAttributeWorkRequestLogsRequest.Builder get() {
                        return ListSecurityAttributeWorkRequestLogsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<
                        ListSecurityAttributeWorkRequestLogsResponse, String>() {
                    @Override
                    public String apply(ListSecurityAttributeWorkRequestLogsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListSecurityAttributeWorkRequestLogsRequest.Builder>,
                        ListSecurityAttributeWorkRequestLogsRequest>() {
                    @Override
                    public ListSecurityAttributeWorkRequestLogsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListSecurityAttributeWorkRequestLogsRequest.Builder>
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
                        ListSecurityAttributeWorkRequestLogsRequest,
                        ListSecurityAttributeWorkRequestLogsResponse>() {
                    @Override
                    public ListSecurityAttributeWorkRequestLogsResponse apply(
                            ListSecurityAttributeWorkRequestLogsRequest request) {
                        return client.listSecurityAttributeWorkRequestLogs(request);
                    }
                },
                new java.util.function.Function<
                        ListSecurityAttributeWorkRequestLogsResponse,
                        java.util.List<
                                com.oracle.bmc.securityattribute.model
                                        .SecurityAttributeWorkRequestLogSummary>>() {
                    @Override
                    public java.util.List<
                                    com.oracle.bmc.securityattribute.model
                                            .SecurityAttributeWorkRequestLogSummary>
                            apply(ListSecurityAttributeWorkRequestLogsResponse response) {
                        return response.getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the
     * listSecurityAttributeWorkRequests operation. This iterable will fetch more data from the
     * server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses
     *     received from the service.
     */
    public Iterable<ListSecurityAttributeWorkRequestsResponse>
            listSecurityAttributeWorkRequestsResponseIterator(
                    final ListSecurityAttributeWorkRequestsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListSecurityAttributeWorkRequestsRequest.Builder,
                ListSecurityAttributeWorkRequestsRequest,
                ListSecurityAttributeWorkRequestsResponse>(
                new java.util.function.Supplier<
                        ListSecurityAttributeWorkRequestsRequest.Builder>() {
                    @Override
                    public ListSecurityAttributeWorkRequestsRequest.Builder get() {
                        return ListSecurityAttributeWorkRequestsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<
                        ListSecurityAttributeWorkRequestsResponse, String>() {
                    @Override
                    public String apply(ListSecurityAttributeWorkRequestsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListSecurityAttributeWorkRequestsRequest.Builder>,
                        ListSecurityAttributeWorkRequestsRequest>() {
                    @Override
                    public ListSecurityAttributeWorkRequestsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListSecurityAttributeWorkRequestsRequest.Builder>
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
                        ListSecurityAttributeWorkRequestsRequest,
                        ListSecurityAttributeWorkRequestsResponse>() {
                    @Override
                    public ListSecurityAttributeWorkRequestsResponse apply(
                            ListSecurityAttributeWorkRequestsRequest request) {
                        return client.listSecurityAttributeWorkRequests(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link
     * com.oracle.bmc.securityattribute.model.SecurityAttributeWorkRequestSummary} objects contained
     * in responses from the listSecurityAttributeWorkRequests operation. This iterable will fetch
     * more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link
     *     com.oracle.bmc.securityattribute.model.SecurityAttributeWorkRequestSummary} objects
     *     contained in responses received from the service.
     */
    public Iterable<com.oracle.bmc.securityattribute.model.SecurityAttributeWorkRequestSummary>
            listSecurityAttributeWorkRequestsRecordIterator(
                    final ListSecurityAttributeWorkRequestsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListSecurityAttributeWorkRequestsRequest.Builder,
                ListSecurityAttributeWorkRequestsRequest,
                ListSecurityAttributeWorkRequestsResponse,
                com.oracle.bmc.securityattribute.model.SecurityAttributeWorkRequestSummary>(
                new java.util.function.Supplier<
                        ListSecurityAttributeWorkRequestsRequest.Builder>() {
                    @Override
                    public ListSecurityAttributeWorkRequestsRequest.Builder get() {
                        return ListSecurityAttributeWorkRequestsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<
                        ListSecurityAttributeWorkRequestsResponse, String>() {
                    @Override
                    public String apply(ListSecurityAttributeWorkRequestsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListSecurityAttributeWorkRequestsRequest.Builder>,
                        ListSecurityAttributeWorkRequestsRequest>() {
                    @Override
                    public ListSecurityAttributeWorkRequestsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListSecurityAttributeWorkRequestsRequest.Builder>
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
                        ListSecurityAttributeWorkRequestsRequest,
                        ListSecurityAttributeWorkRequestsResponse>() {
                    @Override
                    public ListSecurityAttributeWorkRequestsResponse apply(
                            ListSecurityAttributeWorkRequestsRequest request) {
                        return client.listSecurityAttributeWorkRequests(request);
                    }
                },
                new java.util.function.Function<
                        ListSecurityAttributeWorkRequestsResponse,
                        java.util.List<
                                com.oracle.bmc.securityattribute.model
                                        .SecurityAttributeWorkRequestSummary>>() {
                    @Override
                    public java.util.List<
                                    com.oracle.bmc.securityattribute.model
                                            .SecurityAttributeWorkRequestSummary>
                            apply(ListSecurityAttributeWorkRequestsResponse response) {
                        return response.getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the
     * listSecurityAttributes operation. This iterable will fetch more data from the server as
     * needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses
     *     received from the service.
     */
    public Iterable<ListSecurityAttributesResponse> listSecurityAttributesResponseIterator(
            final ListSecurityAttributesRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListSecurityAttributesRequest.Builder,
                ListSecurityAttributesRequest,
                ListSecurityAttributesResponse>(
                new java.util.function.Supplier<ListSecurityAttributesRequest.Builder>() {
                    @Override
                    public ListSecurityAttributesRequest.Builder get() {
                        return ListSecurityAttributesRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListSecurityAttributesResponse, String>() {
                    @Override
                    public String apply(ListSecurityAttributesResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListSecurityAttributesRequest.Builder>,
                        ListSecurityAttributesRequest>() {
                    @Override
                    public ListSecurityAttributesRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListSecurityAttributesRequest.Builder>
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
                        ListSecurityAttributesRequest, ListSecurityAttributesResponse>() {
                    @Override
                    public ListSecurityAttributesResponse apply(
                            ListSecurityAttributesRequest request) {
                        return client.listSecurityAttributes(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link
     * com.oracle.bmc.securityattribute.model.SecurityAttributeSummary} objects contained in
     * responses from the listSecurityAttributes operation. This iterable will fetch more data from
     * the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link
     *     com.oracle.bmc.securityattribute.model.SecurityAttributeSummary} objects contained in
     *     responses received from the service.
     */
    public Iterable<com.oracle.bmc.securityattribute.model.SecurityAttributeSummary>
            listSecurityAttributesRecordIterator(final ListSecurityAttributesRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListSecurityAttributesRequest.Builder,
                ListSecurityAttributesRequest,
                ListSecurityAttributesResponse,
                com.oracle.bmc.securityattribute.model.SecurityAttributeSummary>(
                new java.util.function.Supplier<ListSecurityAttributesRequest.Builder>() {
                    @Override
                    public ListSecurityAttributesRequest.Builder get() {
                        return ListSecurityAttributesRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListSecurityAttributesResponse, String>() {
                    @Override
                    public String apply(ListSecurityAttributesResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListSecurityAttributesRequest.Builder>,
                        ListSecurityAttributesRequest>() {
                    @Override
                    public ListSecurityAttributesRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListSecurityAttributesRequest.Builder>
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
                        ListSecurityAttributesRequest, ListSecurityAttributesResponse>() {
                    @Override
                    public ListSecurityAttributesResponse apply(
                            ListSecurityAttributesRequest request) {
                        return client.listSecurityAttributes(request);
                    }
                },
                new java.util.function.Function<
                        ListSecurityAttributesResponse,
                        java.util.List<
                                com.oracle.bmc.securityattribute.model
                                        .SecurityAttributeSummary>>() {
                    @Override
                    public java.util.List<
                                    com.oracle.bmc.securityattribute.model.SecurityAttributeSummary>
                            apply(ListSecurityAttributesResponse response) {
                        return response.getItems();
                    }
                });
    }
}

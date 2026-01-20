/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.psa;

import com.oracle.bmc.psa.requests.*;
import com.oracle.bmc.psa.responses.*;

/**
 * Collection of helper methods that can be used to provide an {@link java.lang.Iterable} interface
 * to any list operations of PrivateServiceAccess where multiple pages of data may be fetched. Two
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
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20240301")
public class PrivateServiceAccessPaginators {
    private final PrivateServiceAccess client;

    public PrivateServiceAccessPaginators(PrivateServiceAccess client) {
        this.client = client;
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the
     * listPrivateServiceAccesses operation. This iterable will fetch more data from the server as
     * needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses
     *     received from the service.
     */
    public Iterable<ListPrivateServiceAccessesResponse> listPrivateServiceAccessesResponseIterator(
            final ListPrivateServiceAccessesRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListPrivateServiceAccessesRequest.Builder,
                ListPrivateServiceAccessesRequest,
                ListPrivateServiceAccessesResponse>(
                new java.util.function.Supplier<ListPrivateServiceAccessesRequest.Builder>() {
                    @Override
                    public ListPrivateServiceAccessesRequest.Builder get() {
                        return ListPrivateServiceAccessesRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListPrivateServiceAccessesResponse, String>() {
                    @Override
                    public String apply(ListPrivateServiceAccessesResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListPrivateServiceAccessesRequest.Builder>,
                        ListPrivateServiceAccessesRequest>() {
                    @Override
                    public ListPrivateServiceAccessesRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListPrivateServiceAccessesRequest.Builder>
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
                        ListPrivateServiceAccessesRequest, ListPrivateServiceAccessesResponse>() {
                    @Override
                    public ListPrivateServiceAccessesResponse apply(
                            ListPrivateServiceAccessesRequest request) {
                        return client.listPrivateServiceAccesses(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link
     * com.oracle.bmc.psa.model.PrivateServiceAccessSummary} objects contained in responses from the
     * listPrivateServiceAccesses operation. This iterable will fetch more data from the server as
     * needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link
     *     com.oracle.bmc.psa.model.PrivateServiceAccessSummary} objects contained in responses
     *     received from the service.
     */
    public Iterable<com.oracle.bmc.psa.model.PrivateServiceAccessSummary>
            listPrivateServiceAccessesRecordIterator(
                    final ListPrivateServiceAccessesRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListPrivateServiceAccessesRequest.Builder,
                ListPrivateServiceAccessesRequest,
                ListPrivateServiceAccessesResponse,
                com.oracle.bmc.psa.model.PrivateServiceAccessSummary>(
                new java.util.function.Supplier<ListPrivateServiceAccessesRequest.Builder>() {
                    @Override
                    public ListPrivateServiceAccessesRequest.Builder get() {
                        return ListPrivateServiceAccessesRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListPrivateServiceAccessesResponse, String>() {
                    @Override
                    public String apply(ListPrivateServiceAccessesResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListPrivateServiceAccessesRequest.Builder>,
                        ListPrivateServiceAccessesRequest>() {
                    @Override
                    public ListPrivateServiceAccessesRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListPrivateServiceAccessesRequest.Builder>
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
                        ListPrivateServiceAccessesRequest, ListPrivateServiceAccessesResponse>() {
                    @Override
                    public ListPrivateServiceAccessesResponse apply(
                            ListPrivateServiceAccessesRequest request) {
                        return client.listPrivateServiceAccesses(request);
                    }
                },
                new java.util.function.Function<
                        ListPrivateServiceAccessesResponse,
                        java.util.List<com.oracle.bmc.psa.model.PrivateServiceAccessSummary>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.psa.model.PrivateServiceAccessSummary>
                            apply(ListPrivateServiceAccessesResponse response) {
                        return response.getPrivateServiceAccessCollection().getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the
     * listPsaServices operation. This iterable will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses
     *     received from the service.
     */
    public Iterable<ListPsaServicesResponse> listPsaServicesResponseIterator(
            final ListPsaServicesRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListPsaServicesRequest.Builder, ListPsaServicesRequest, ListPsaServicesResponse>(
                new java.util.function.Supplier<ListPsaServicesRequest.Builder>() {
                    @Override
                    public ListPsaServicesRequest.Builder get() {
                        return ListPsaServicesRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListPsaServicesResponse, String>() {
                    @Override
                    public String apply(ListPsaServicesResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListPsaServicesRequest.Builder>,
                        ListPsaServicesRequest>() {
                    @Override
                    public ListPsaServicesRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListPsaServicesRequest.Builder>
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
                new java.util.function.Function<ListPsaServicesRequest, ListPsaServicesResponse>() {
                    @Override
                    public ListPsaServicesResponse apply(ListPsaServicesRequest request) {
                        return client.listPsaServices(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link
     * com.oracle.bmc.psa.model.PsaServiceSummary} objects contained in responses from the
     * listPsaServices operation. This iterable will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link
     *     com.oracle.bmc.psa.model.PsaServiceSummary} objects contained in responses received from
     *     the service.
     */
    public Iterable<com.oracle.bmc.psa.model.PsaServiceSummary> listPsaServicesRecordIterator(
            final ListPsaServicesRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListPsaServicesRequest.Builder,
                ListPsaServicesRequest,
                ListPsaServicesResponse,
                com.oracle.bmc.psa.model.PsaServiceSummary>(
                new java.util.function.Supplier<ListPsaServicesRequest.Builder>() {
                    @Override
                    public ListPsaServicesRequest.Builder get() {
                        return ListPsaServicesRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListPsaServicesResponse, String>() {
                    @Override
                    public String apply(ListPsaServicesResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListPsaServicesRequest.Builder>,
                        ListPsaServicesRequest>() {
                    @Override
                    public ListPsaServicesRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListPsaServicesRequest.Builder>
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
                new java.util.function.Function<ListPsaServicesRequest, ListPsaServicesResponse>() {
                    @Override
                    public ListPsaServicesResponse apply(ListPsaServicesRequest request) {
                        return client.listPsaServices(request);
                    }
                },
                new java.util.function.Function<
                        ListPsaServicesResponse,
                        java.util.List<com.oracle.bmc.psa.model.PsaServiceSummary>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.psa.model.PsaServiceSummary> apply(
                            ListPsaServicesResponse response) {
                        return response.getPsaServiceCollection().getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the
     * listPsaWorkRequestErrors operation. This iterable will fetch more data from the server as
     * needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses
     *     received from the service.
     */
    public Iterable<ListPsaWorkRequestErrorsResponse> listPsaWorkRequestErrorsResponseIterator(
            final ListPsaWorkRequestErrorsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListPsaWorkRequestErrorsRequest.Builder,
                ListPsaWorkRequestErrorsRequest,
                ListPsaWorkRequestErrorsResponse>(
                new java.util.function.Supplier<ListPsaWorkRequestErrorsRequest.Builder>() {
                    @Override
                    public ListPsaWorkRequestErrorsRequest.Builder get() {
                        return ListPsaWorkRequestErrorsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListPsaWorkRequestErrorsResponse, String>() {
                    @Override
                    public String apply(ListPsaWorkRequestErrorsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListPsaWorkRequestErrorsRequest.Builder>,
                        ListPsaWorkRequestErrorsRequest>() {
                    @Override
                    public ListPsaWorkRequestErrorsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListPsaWorkRequestErrorsRequest.Builder>
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
                        ListPsaWorkRequestErrorsRequest, ListPsaWorkRequestErrorsResponse>() {
                    @Override
                    public ListPsaWorkRequestErrorsResponse apply(
                            ListPsaWorkRequestErrorsRequest request) {
                        return client.listPsaWorkRequestErrors(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link
     * com.oracle.bmc.psa.model.WorkRequestError} objects contained in responses from the
     * listPsaWorkRequestErrors operation. This iterable will fetch more data from the server as
     * needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link
     *     com.oracle.bmc.psa.model.WorkRequestError} objects contained in responses received from
     *     the service.
     */
    public Iterable<com.oracle.bmc.psa.model.WorkRequestError>
            listPsaWorkRequestErrorsRecordIterator(final ListPsaWorkRequestErrorsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListPsaWorkRequestErrorsRequest.Builder,
                ListPsaWorkRequestErrorsRequest,
                ListPsaWorkRequestErrorsResponse,
                com.oracle.bmc.psa.model.WorkRequestError>(
                new java.util.function.Supplier<ListPsaWorkRequestErrorsRequest.Builder>() {
                    @Override
                    public ListPsaWorkRequestErrorsRequest.Builder get() {
                        return ListPsaWorkRequestErrorsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListPsaWorkRequestErrorsResponse, String>() {
                    @Override
                    public String apply(ListPsaWorkRequestErrorsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListPsaWorkRequestErrorsRequest.Builder>,
                        ListPsaWorkRequestErrorsRequest>() {
                    @Override
                    public ListPsaWorkRequestErrorsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListPsaWorkRequestErrorsRequest.Builder>
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
                        ListPsaWorkRequestErrorsRequest, ListPsaWorkRequestErrorsResponse>() {
                    @Override
                    public ListPsaWorkRequestErrorsResponse apply(
                            ListPsaWorkRequestErrorsRequest request) {
                        return client.listPsaWorkRequestErrors(request);
                    }
                },
                new java.util.function.Function<
                        ListPsaWorkRequestErrorsResponse,
                        java.util.List<com.oracle.bmc.psa.model.WorkRequestError>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.psa.model.WorkRequestError> apply(
                            ListPsaWorkRequestErrorsResponse response) {
                        return response.getWorkRequestErrorCollection().getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the
     * listPsaWorkRequestLogs operation. This iterable will fetch more data from the server as
     * needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses
     *     received from the service.
     */
    public Iterable<ListPsaWorkRequestLogsResponse> listPsaWorkRequestLogsResponseIterator(
            final ListPsaWorkRequestLogsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListPsaWorkRequestLogsRequest.Builder,
                ListPsaWorkRequestLogsRequest,
                ListPsaWorkRequestLogsResponse>(
                new java.util.function.Supplier<ListPsaWorkRequestLogsRequest.Builder>() {
                    @Override
                    public ListPsaWorkRequestLogsRequest.Builder get() {
                        return ListPsaWorkRequestLogsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListPsaWorkRequestLogsResponse, String>() {
                    @Override
                    public String apply(ListPsaWorkRequestLogsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListPsaWorkRequestLogsRequest.Builder>,
                        ListPsaWorkRequestLogsRequest>() {
                    @Override
                    public ListPsaWorkRequestLogsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListPsaWorkRequestLogsRequest.Builder>
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
                        ListPsaWorkRequestLogsRequest, ListPsaWorkRequestLogsResponse>() {
                    @Override
                    public ListPsaWorkRequestLogsResponse apply(
                            ListPsaWorkRequestLogsRequest request) {
                        return client.listPsaWorkRequestLogs(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link
     * com.oracle.bmc.psa.model.WorkRequestLogEntry} objects contained in responses from the
     * listPsaWorkRequestLogs operation. This iterable will fetch more data from the server as
     * needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link
     *     com.oracle.bmc.psa.model.WorkRequestLogEntry} objects contained in responses received
     *     from the service.
     */
    public Iterable<com.oracle.bmc.psa.model.WorkRequestLogEntry>
            listPsaWorkRequestLogsRecordIterator(final ListPsaWorkRequestLogsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListPsaWorkRequestLogsRequest.Builder,
                ListPsaWorkRequestLogsRequest,
                ListPsaWorkRequestLogsResponse,
                com.oracle.bmc.psa.model.WorkRequestLogEntry>(
                new java.util.function.Supplier<ListPsaWorkRequestLogsRequest.Builder>() {
                    @Override
                    public ListPsaWorkRequestLogsRequest.Builder get() {
                        return ListPsaWorkRequestLogsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListPsaWorkRequestLogsResponse, String>() {
                    @Override
                    public String apply(ListPsaWorkRequestLogsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListPsaWorkRequestLogsRequest.Builder>,
                        ListPsaWorkRequestLogsRequest>() {
                    @Override
                    public ListPsaWorkRequestLogsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListPsaWorkRequestLogsRequest.Builder>
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
                        ListPsaWorkRequestLogsRequest, ListPsaWorkRequestLogsResponse>() {
                    @Override
                    public ListPsaWorkRequestLogsResponse apply(
                            ListPsaWorkRequestLogsRequest request) {
                        return client.listPsaWorkRequestLogs(request);
                    }
                },
                new java.util.function.Function<
                        ListPsaWorkRequestLogsResponse,
                        java.util.List<com.oracle.bmc.psa.model.WorkRequestLogEntry>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.psa.model.WorkRequestLogEntry> apply(
                            ListPsaWorkRequestLogsResponse response) {
                        return response.getWorkRequestLogEntryCollection().getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the
     * listPsaWorkRequests operation. This iterable will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses
     *     received from the service.
     */
    public Iterable<ListPsaWorkRequestsResponse> listPsaWorkRequestsResponseIterator(
            final ListPsaWorkRequestsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListPsaWorkRequestsRequest.Builder,
                ListPsaWorkRequestsRequest,
                ListPsaWorkRequestsResponse>(
                new java.util.function.Supplier<ListPsaWorkRequestsRequest.Builder>() {
                    @Override
                    public ListPsaWorkRequestsRequest.Builder get() {
                        return ListPsaWorkRequestsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListPsaWorkRequestsResponse, String>() {
                    @Override
                    public String apply(ListPsaWorkRequestsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListPsaWorkRequestsRequest.Builder>,
                        ListPsaWorkRequestsRequest>() {
                    @Override
                    public ListPsaWorkRequestsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListPsaWorkRequestsRequest.Builder>
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
                        ListPsaWorkRequestsRequest, ListPsaWorkRequestsResponse>() {
                    @Override
                    public ListPsaWorkRequestsResponse apply(ListPsaWorkRequestsRequest request) {
                        return client.listPsaWorkRequests(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link
     * com.oracle.bmc.psa.model.WorkRequestSummary} objects contained in responses from the
     * listPsaWorkRequests operation. This iterable will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link
     *     com.oracle.bmc.psa.model.WorkRequestSummary} objects contained in responses received from
     *     the service.
     */
    public Iterable<com.oracle.bmc.psa.model.WorkRequestSummary> listPsaWorkRequestsRecordIterator(
            final ListPsaWorkRequestsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListPsaWorkRequestsRequest.Builder,
                ListPsaWorkRequestsRequest,
                ListPsaWorkRequestsResponse,
                com.oracle.bmc.psa.model.WorkRequestSummary>(
                new java.util.function.Supplier<ListPsaWorkRequestsRequest.Builder>() {
                    @Override
                    public ListPsaWorkRequestsRequest.Builder get() {
                        return ListPsaWorkRequestsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListPsaWorkRequestsResponse, String>() {
                    @Override
                    public String apply(ListPsaWorkRequestsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListPsaWorkRequestsRequest.Builder>,
                        ListPsaWorkRequestsRequest>() {
                    @Override
                    public ListPsaWorkRequestsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListPsaWorkRequestsRequest.Builder>
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
                        ListPsaWorkRequestsRequest, ListPsaWorkRequestsResponse>() {
                    @Override
                    public ListPsaWorkRequestsResponse apply(ListPsaWorkRequestsRequest request) {
                        return client.listPsaWorkRequests(request);
                    }
                },
                new java.util.function.Function<
                        ListPsaWorkRequestsResponse,
                        java.util.List<com.oracle.bmc.psa.model.WorkRequestSummary>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.psa.model.WorkRequestSummary> apply(
                            ListPsaWorkRequestsResponse response) {
                        return response.getWorkRequestSummaryCollection().getItems();
                    }
                });
    }
}

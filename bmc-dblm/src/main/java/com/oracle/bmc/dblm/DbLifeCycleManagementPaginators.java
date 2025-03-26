/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.dblm;

import com.oracle.bmc.dblm.requests.*;
import com.oracle.bmc.dblm.responses.*;

/**
 * Collection of helper methods that can be used to provide an {@link java.lang.Iterable} interface
 * to any list operations of DbLifeCycleManagement where multiple pages of data may be fetched.
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
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20240102")
public class DbLifeCycleManagementPaginators {
    private final DbLifeCycleManagement client;

    public DbLifeCycleManagementPaginators(DbLifeCycleManagement client) {
        this.client = client;
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the listVulnerabilities operation. This iterable
     * will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses received from the service.
     */
    public Iterable<ListVulnerabilitiesResponse> listVulnerabilitiesResponseIterator(
            final ListVulnerabilitiesRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListVulnerabilitiesRequest.Builder, ListVulnerabilitiesRequest,
                ListVulnerabilitiesResponse>(
                new java.util.function.Supplier<ListVulnerabilitiesRequest.Builder>() {
                    @Override
                    public ListVulnerabilitiesRequest.Builder get() {
                        return ListVulnerabilitiesRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListVulnerabilitiesResponse, String>() {
                    @Override
                    public String apply(ListVulnerabilitiesResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListVulnerabilitiesRequest.Builder>,
                        ListVulnerabilitiesRequest>() {
                    @Override
                    public ListVulnerabilitiesRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListVulnerabilitiesRequest.Builder>
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
                        ListVulnerabilitiesRequest, ListVulnerabilitiesResponse>() {
                    @Override
                    public ListVulnerabilitiesResponse apply(ListVulnerabilitiesRequest request) {
                        return client.listVulnerabilities(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link com.oracle.bmc.dblm.model.VulnerabilitySummary} objects
     * contained in responses from the listVulnerabilities operation. This iterable will fetch more data from the
     * server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link com.oracle.bmc.dblm.model.VulnerabilitySummary} objects
     * contained in responses received from the service.
     */
    public Iterable<com.oracle.bmc.dblm.model.VulnerabilitySummary>
            listVulnerabilitiesRecordIterator(final ListVulnerabilitiesRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListVulnerabilitiesRequest.Builder, ListVulnerabilitiesRequest,
                ListVulnerabilitiesResponse, com.oracle.bmc.dblm.model.VulnerabilitySummary>(
                new java.util.function.Supplier<ListVulnerabilitiesRequest.Builder>() {
                    @Override
                    public ListVulnerabilitiesRequest.Builder get() {
                        return ListVulnerabilitiesRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListVulnerabilitiesResponse, String>() {
                    @Override
                    public String apply(ListVulnerabilitiesResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListVulnerabilitiesRequest.Builder>,
                        ListVulnerabilitiesRequest>() {
                    @Override
                    public ListVulnerabilitiesRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListVulnerabilitiesRequest.Builder>
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
                        ListVulnerabilitiesRequest, ListVulnerabilitiesResponse>() {
                    @Override
                    public ListVulnerabilitiesResponse apply(ListVulnerabilitiesRequest request) {
                        return client.listVulnerabilities(request);
                    }
                },
                new java.util.function.Function<
                        ListVulnerabilitiesResponse,
                        java.util.List<com.oracle.bmc.dblm.model.VulnerabilitySummary>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.dblm.model.VulnerabilitySummary> apply(
                            ListVulnerabilitiesResponse response) {
                        return response.getVulnerabilityCollection().getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the listVulnerabilityResources operation. This iterable
     * will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses received from the service.
     */
    public Iterable<ListVulnerabilityResourcesResponse> listVulnerabilityResourcesResponseIterator(
            final ListVulnerabilityResourcesRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListVulnerabilityResourcesRequest.Builder, ListVulnerabilityResourcesRequest,
                ListVulnerabilityResourcesResponse>(
                new java.util.function.Supplier<ListVulnerabilityResourcesRequest.Builder>() {
                    @Override
                    public ListVulnerabilityResourcesRequest.Builder get() {
                        return ListVulnerabilityResourcesRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListVulnerabilityResourcesResponse, String>() {
                    @Override
                    public String apply(ListVulnerabilityResourcesResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListVulnerabilityResourcesRequest.Builder>,
                        ListVulnerabilityResourcesRequest>() {
                    @Override
                    public ListVulnerabilityResourcesRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListVulnerabilityResourcesRequest.Builder>
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
                        ListVulnerabilityResourcesRequest, ListVulnerabilityResourcesResponse>() {
                    @Override
                    public ListVulnerabilityResourcesResponse apply(
                            ListVulnerabilityResourcesRequest request) {
                        return client.listVulnerabilityResources(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link com.oracle.bmc.dblm.model.VulnerabilityResourceSummary} objects
     * contained in responses from the listVulnerabilityResources operation. This iterable will fetch more data from the
     * server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link com.oracle.bmc.dblm.model.VulnerabilityResourceSummary} objects
     * contained in responses received from the service.
     */
    public Iterable<com.oracle.bmc.dblm.model.VulnerabilityResourceSummary>
            listVulnerabilityResourcesRecordIterator(
                    final ListVulnerabilityResourcesRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListVulnerabilityResourcesRequest.Builder, ListVulnerabilityResourcesRequest,
                ListVulnerabilityResourcesResponse,
                com.oracle.bmc.dblm.model.VulnerabilityResourceSummary>(
                new java.util.function.Supplier<ListVulnerabilityResourcesRequest.Builder>() {
                    @Override
                    public ListVulnerabilityResourcesRequest.Builder get() {
                        return ListVulnerabilityResourcesRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListVulnerabilityResourcesResponse, String>() {
                    @Override
                    public String apply(ListVulnerabilityResourcesResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListVulnerabilityResourcesRequest.Builder>,
                        ListVulnerabilityResourcesRequest>() {
                    @Override
                    public ListVulnerabilityResourcesRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListVulnerabilityResourcesRequest.Builder>
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
                        ListVulnerabilityResourcesRequest, ListVulnerabilityResourcesResponse>() {
                    @Override
                    public ListVulnerabilityResourcesResponse apply(
                            ListVulnerabilityResourcesRequest request) {
                        return client.listVulnerabilityResources(request);
                    }
                },
                new java.util.function.Function<
                        ListVulnerabilityResourcesResponse,
                        java.util.List<com.oracle.bmc.dblm.model.VulnerabilityResourceSummary>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.dblm.model.VulnerabilityResourceSummary>
                            apply(ListVulnerabilityResourcesResponse response) {
                        return response.getVulnerabilityResourceCollection().getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the listVulnerabilityScans operation. This iterable
     * will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses received from the service.
     */
    public Iterable<ListVulnerabilityScansResponse> listVulnerabilityScansResponseIterator(
            final ListVulnerabilityScansRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListVulnerabilityScansRequest.Builder, ListVulnerabilityScansRequest,
                ListVulnerabilityScansResponse>(
                new java.util.function.Supplier<ListVulnerabilityScansRequest.Builder>() {
                    @Override
                    public ListVulnerabilityScansRequest.Builder get() {
                        return ListVulnerabilityScansRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListVulnerabilityScansResponse, String>() {
                    @Override
                    public String apply(ListVulnerabilityScansResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListVulnerabilityScansRequest.Builder>,
                        ListVulnerabilityScansRequest>() {
                    @Override
                    public ListVulnerabilityScansRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListVulnerabilityScansRequest.Builder>
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
                        ListVulnerabilityScansRequest, ListVulnerabilityScansResponse>() {
                    @Override
                    public ListVulnerabilityScansResponse apply(
                            ListVulnerabilityScansRequest request) {
                        return client.listVulnerabilityScans(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link com.oracle.bmc.dblm.model.VulnerabilityScanSummary} objects
     * contained in responses from the listVulnerabilityScans operation. This iterable will fetch more data from the
     * server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link com.oracle.bmc.dblm.model.VulnerabilityScanSummary} objects
     * contained in responses received from the service.
     */
    public Iterable<com.oracle.bmc.dblm.model.VulnerabilityScanSummary>
            listVulnerabilityScansRecordIterator(final ListVulnerabilityScansRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListVulnerabilityScansRequest.Builder, ListVulnerabilityScansRequest,
                ListVulnerabilityScansResponse, com.oracle.bmc.dblm.model.VulnerabilityScanSummary>(
                new java.util.function.Supplier<ListVulnerabilityScansRequest.Builder>() {
                    @Override
                    public ListVulnerabilityScansRequest.Builder get() {
                        return ListVulnerabilityScansRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListVulnerabilityScansResponse, String>() {
                    @Override
                    public String apply(ListVulnerabilityScansResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListVulnerabilityScansRequest.Builder>,
                        ListVulnerabilityScansRequest>() {
                    @Override
                    public ListVulnerabilityScansRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListVulnerabilityScansRequest.Builder>
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
                        ListVulnerabilityScansRequest, ListVulnerabilityScansResponse>() {
                    @Override
                    public ListVulnerabilityScansResponse apply(
                            ListVulnerabilityScansRequest request) {
                        return client.listVulnerabilityScans(request);
                    }
                },
                new java.util.function.Function<
                        ListVulnerabilityScansResponse,
                        java.util.List<com.oracle.bmc.dblm.model.VulnerabilityScanSummary>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.dblm.model.VulnerabilityScanSummary> apply(
                            ListVulnerabilityScansResponse response) {
                        return response.getVulnerabilityScanCollection().getItems();
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
     * Creates a new iterable which will iterate over the {@link com.oracle.bmc.dblm.model.WorkRequestError} objects
     * contained in responses from the listWorkRequestErrors operation. This iterable will fetch more data from the
     * server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link com.oracle.bmc.dblm.model.WorkRequestError} objects
     * contained in responses received from the service.
     */
    public Iterable<com.oracle.bmc.dblm.model.WorkRequestError> listWorkRequestErrorsRecordIterator(
            final ListWorkRequestErrorsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListWorkRequestErrorsRequest.Builder, ListWorkRequestErrorsRequest,
                ListWorkRequestErrorsResponse, com.oracle.bmc.dblm.model.WorkRequestError>(
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
                        java.util.List<com.oracle.bmc.dblm.model.WorkRequestError>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.dblm.model.WorkRequestError> apply(
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
     * Creates a new iterable which will iterate over the {@link com.oracle.bmc.dblm.model.WorkRequestLogEntry} objects
     * contained in responses from the listWorkRequestLogs operation. This iterable will fetch more data from the
     * server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link com.oracle.bmc.dblm.model.WorkRequestLogEntry} objects
     * contained in responses received from the service.
     */
    public Iterable<com.oracle.bmc.dblm.model.WorkRequestLogEntry>
            listWorkRequestLogsRecordIterator(final ListWorkRequestLogsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListWorkRequestLogsRequest.Builder, ListWorkRequestLogsRequest,
                ListWorkRequestLogsResponse, com.oracle.bmc.dblm.model.WorkRequestLogEntry>(
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
                        java.util.List<com.oracle.bmc.dblm.model.WorkRequestLogEntry>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.dblm.model.WorkRequestLogEntry> apply(
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
     * Creates a new iterable which will iterate over the {@link com.oracle.bmc.dblm.model.WorkRequestSummary} objects
     * contained in responses from the listWorkRequests operation. This iterable will fetch more data from the
     * server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link com.oracle.bmc.dblm.model.WorkRequestSummary} objects
     * contained in responses received from the service.
     */
    public Iterable<com.oracle.bmc.dblm.model.WorkRequestSummary> listWorkRequestsRecordIterator(
            final ListWorkRequestsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListWorkRequestsRequest.Builder, ListWorkRequestsRequest, ListWorkRequestsResponse,
                com.oracle.bmc.dblm.model.WorkRequestSummary>(
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
                        java.util.List<com.oracle.bmc.dblm.model.WorkRequestSummary>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.dblm.model.WorkRequestSummary> apply(
                            ListWorkRequestsResponse response) {
                        return response.getWorkRequestSummaryCollection().getItems();
                    }
                });
    }
}

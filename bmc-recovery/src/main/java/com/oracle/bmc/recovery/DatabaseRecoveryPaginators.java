/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.recovery;

import com.oracle.bmc.recovery.requests.*;
import com.oracle.bmc.recovery.responses.*;

/**
 * Collection of helper methods that can be used to provide an {@link java.lang.Iterable} interface
 * to any list operations of DatabaseRecovery where multiple pages of data may be fetched.
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
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20210216")
public class DatabaseRecoveryPaginators {
    private final DatabaseRecovery client;

    public DatabaseRecoveryPaginators(DatabaseRecovery client) {
        this.client = client;
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the listProtectedDatabases operation. This iterable
     * will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses received from the service.
     */
    public Iterable<ListProtectedDatabasesResponse> listProtectedDatabasesResponseIterator(
            final ListProtectedDatabasesRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListProtectedDatabasesRequest.Builder, ListProtectedDatabasesRequest,
                ListProtectedDatabasesResponse>(
                new java.util.function.Supplier<ListProtectedDatabasesRequest.Builder>() {
                    @Override
                    public ListProtectedDatabasesRequest.Builder get() {
                        return ListProtectedDatabasesRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListProtectedDatabasesResponse, String>() {
                    @Override
                    public String apply(ListProtectedDatabasesResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListProtectedDatabasesRequest.Builder>,
                        ListProtectedDatabasesRequest>() {
                    @Override
                    public ListProtectedDatabasesRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListProtectedDatabasesRequest.Builder>
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
                        ListProtectedDatabasesRequest, ListProtectedDatabasesResponse>() {
                    @Override
                    public ListProtectedDatabasesResponse apply(
                            ListProtectedDatabasesRequest request) {
                        return client.listProtectedDatabases(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link com.oracle.bmc.recovery.model.ProtectedDatabaseSummary} objects
     * contained in responses from the listProtectedDatabases operation. This iterable will fetch more data from the
     * server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link com.oracle.bmc.recovery.model.ProtectedDatabaseSummary} objects
     * contained in responses received from the service.
     */
    public Iterable<com.oracle.bmc.recovery.model.ProtectedDatabaseSummary>
            listProtectedDatabasesRecordIterator(final ListProtectedDatabasesRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListProtectedDatabasesRequest.Builder, ListProtectedDatabasesRequest,
                ListProtectedDatabasesResponse,
                com.oracle.bmc.recovery.model.ProtectedDatabaseSummary>(
                new java.util.function.Supplier<ListProtectedDatabasesRequest.Builder>() {
                    @Override
                    public ListProtectedDatabasesRequest.Builder get() {
                        return ListProtectedDatabasesRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListProtectedDatabasesResponse, String>() {
                    @Override
                    public String apply(ListProtectedDatabasesResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListProtectedDatabasesRequest.Builder>,
                        ListProtectedDatabasesRequest>() {
                    @Override
                    public ListProtectedDatabasesRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListProtectedDatabasesRequest.Builder>
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
                        ListProtectedDatabasesRequest, ListProtectedDatabasesResponse>() {
                    @Override
                    public ListProtectedDatabasesResponse apply(
                            ListProtectedDatabasesRequest request) {
                        return client.listProtectedDatabases(request);
                    }
                },
                new java.util.function.Function<
                        ListProtectedDatabasesResponse,
                        java.util.List<com.oracle.bmc.recovery.model.ProtectedDatabaseSummary>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.recovery.model.ProtectedDatabaseSummary>
                            apply(ListProtectedDatabasesResponse response) {
                        return response.getProtectedDatabaseCollection().getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the listProtectionPolicies operation. This iterable
     * will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses received from the service.
     */
    public Iterable<ListProtectionPoliciesResponse> listProtectionPoliciesResponseIterator(
            final ListProtectionPoliciesRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListProtectionPoliciesRequest.Builder, ListProtectionPoliciesRequest,
                ListProtectionPoliciesResponse>(
                new java.util.function.Supplier<ListProtectionPoliciesRequest.Builder>() {
                    @Override
                    public ListProtectionPoliciesRequest.Builder get() {
                        return ListProtectionPoliciesRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListProtectionPoliciesResponse, String>() {
                    @Override
                    public String apply(ListProtectionPoliciesResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListProtectionPoliciesRequest.Builder>,
                        ListProtectionPoliciesRequest>() {
                    @Override
                    public ListProtectionPoliciesRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListProtectionPoliciesRequest.Builder>
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
                        ListProtectionPoliciesRequest, ListProtectionPoliciesResponse>() {
                    @Override
                    public ListProtectionPoliciesResponse apply(
                            ListProtectionPoliciesRequest request) {
                        return client.listProtectionPolicies(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link com.oracle.bmc.recovery.model.ProtectionPolicySummary} objects
     * contained in responses from the listProtectionPolicies operation. This iterable will fetch more data from the
     * server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link com.oracle.bmc.recovery.model.ProtectionPolicySummary} objects
     * contained in responses received from the service.
     */
    public Iterable<com.oracle.bmc.recovery.model.ProtectionPolicySummary>
            listProtectionPoliciesRecordIterator(final ListProtectionPoliciesRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListProtectionPoliciesRequest.Builder, ListProtectionPoliciesRequest,
                ListProtectionPoliciesResponse,
                com.oracle.bmc.recovery.model.ProtectionPolicySummary>(
                new java.util.function.Supplier<ListProtectionPoliciesRequest.Builder>() {
                    @Override
                    public ListProtectionPoliciesRequest.Builder get() {
                        return ListProtectionPoliciesRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListProtectionPoliciesResponse, String>() {
                    @Override
                    public String apply(ListProtectionPoliciesResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListProtectionPoliciesRequest.Builder>,
                        ListProtectionPoliciesRequest>() {
                    @Override
                    public ListProtectionPoliciesRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListProtectionPoliciesRequest.Builder>
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
                        ListProtectionPoliciesRequest, ListProtectionPoliciesResponse>() {
                    @Override
                    public ListProtectionPoliciesResponse apply(
                            ListProtectionPoliciesRequest request) {
                        return client.listProtectionPolicies(request);
                    }
                },
                new java.util.function.Function<
                        ListProtectionPoliciesResponse,
                        java.util.List<com.oracle.bmc.recovery.model.ProtectionPolicySummary>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.recovery.model.ProtectionPolicySummary>
                            apply(ListProtectionPoliciesResponse response) {
                        return response.getProtectionPolicyCollection().getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the listRecoveryServiceSubnets operation. This iterable
     * will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses received from the service.
     */
    public Iterable<ListRecoveryServiceSubnetsResponse> listRecoveryServiceSubnetsResponseIterator(
            final ListRecoveryServiceSubnetsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListRecoveryServiceSubnetsRequest.Builder, ListRecoveryServiceSubnetsRequest,
                ListRecoveryServiceSubnetsResponse>(
                new java.util.function.Supplier<ListRecoveryServiceSubnetsRequest.Builder>() {
                    @Override
                    public ListRecoveryServiceSubnetsRequest.Builder get() {
                        return ListRecoveryServiceSubnetsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListRecoveryServiceSubnetsResponse, String>() {
                    @Override
                    public String apply(ListRecoveryServiceSubnetsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListRecoveryServiceSubnetsRequest.Builder>,
                        ListRecoveryServiceSubnetsRequest>() {
                    @Override
                    public ListRecoveryServiceSubnetsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListRecoveryServiceSubnetsRequest.Builder>
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
                        ListRecoveryServiceSubnetsRequest, ListRecoveryServiceSubnetsResponse>() {
                    @Override
                    public ListRecoveryServiceSubnetsResponse apply(
                            ListRecoveryServiceSubnetsRequest request) {
                        return client.listRecoveryServiceSubnets(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link com.oracle.bmc.recovery.model.RecoveryServiceSubnetSummary} objects
     * contained in responses from the listRecoveryServiceSubnets operation. This iterable will fetch more data from the
     * server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link com.oracle.bmc.recovery.model.RecoveryServiceSubnetSummary} objects
     * contained in responses received from the service.
     */
    public Iterable<com.oracle.bmc.recovery.model.RecoveryServiceSubnetSummary>
            listRecoveryServiceSubnetsRecordIterator(
                    final ListRecoveryServiceSubnetsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListRecoveryServiceSubnetsRequest.Builder, ListRecoveryServiceSubnetsRequest,
                ListRecoveryServiceSubnetsResponse,
                com.oracle.bmc.recovery.model.RecoveryServiceSubnetSummary>(
                new java.util.function.Supplier<ListRecoveryServiceSubnetsRequest.Builder>() {
                    @Override
                    public ListRecoveryServiceSubnetsRequest.Builder get() {
                        return ListRecoveryServiceSubnetsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListRecoveryServiceSubnetsResponse, String>() {
                    @Override
                    public String apply(ListRecoveryServiceSubnetsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListRecoveryServiceSubnetsRequest.Builder>,
                        ListRecoveryServiceSubnetsRequest>() {
                    @Override
                    public ListRecoveryServiceSubnetsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListRecoveryServiceSubnetsRequest.Builder>
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
                        ListRecoveryServiceSubnetsRequest, ListRecoveryServiceSubnetsResponse>() {
                    @Override
                    public ListRecoveryServiceSubnetsResponse apply(
                            ListRecoveryServiceSubnetsRequest request) {
                        return client.listRecoveryServiceSubnets(request);
                    }
                },
                new java.util.function.Function<
                        ListRecoveryServiceSubnetsResponse,
                        java.util.List<
                                com.oracle.bmc.recovery.model.RecoveryServiceSubnetSummary>>() {
                    @Override
                    public java.util.List<
                                    com.oracle.bmc.recovery.model.RecoveryServiceSubnetSummary>
                            apply(ListRecoveryServiceSubnetsResponse response) {
                        return response.getRecoveryServiceSubnetCollection().getItems();
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
     * Creates a new iterable which will iterate over the {@link com.oracle.bmc.recovery.model.WorkRequestError} objects
     * contained in responses from the listWorkRequestErrors operation. This iterable will fetch more data from the
     * server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link com.oracle.bmc.recovery.model.WorkRequestError} objects
     * contained in responses received from the service.
     */
    public Iterable<com.oracle.bmc.recovery.model.WorkRequestError>
            listWorkRequestErrorsRecordIterator(final ListWorkRequestErrorsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListWorkRequestErrorsRequest.Builder, ListWorkRequestErrorsRequest,
                ListWorkRequestErrorsResponse, com.oracle.bmc.recovery.model.WorkRequestError>(
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
                        java.util.List<com.oracle.bmc.recovery.model.WorkRequestError>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.recovery.model.WorkRequestError> apply(
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
     * Creates a new iterable which will iterate over the {@link com.oracle.bmc.recovery.model.WorkRequestLogEntry} objects
     * contained in responses from the listWorkRequestLogs operation. This iterable will fetch more data from the
     * server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link com.oracle.bmc.recovery.model.WorkRequestLogEntry} objects
     * contained in responses received from the service.
     */
    public Iterable<com.oracle.bmc.recovery.model.WorkRequestLogEntry>
            listWorkRequestLogsRecordIterator(final ListWorkRequestLogsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListWorkRequestLogsRequest.Builder, ListWorkRequestLogsRequest,
                ListWorkRequestLogsResponse, com.oracle.bmc.recovery.model.WorkRequestLogEntry>(
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
                        java.util.List<com.oracle.bmc.recovery.model.WorkRequestLogEntry>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.recovery.model.WorkRequestLogEntry> apply(
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
     * Creates a new iterable which will iterate over the {@link com.oracle.bmc.recovery.model.WorkRequestSummary} objects
     * contained in responses from the listWorkRequests operation. This iterable will fetch more data from the
     * server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link com.oracle.bmc.recovery.model.WorkRequestSummary} objects
     * contained in responses received from the service.
     */
    public Iterable<com.oracle.bmc.recovery.model.WorkRequestSummary>
            listWorkRequestsRecordIterator(final ListWorkRequestsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListWorkRequestsRequest.Builder, ListWorkRequestsRequest, ListWorkRequestsResponse,
                com.oracle.bmc.recovery.model.WorkRequestSummary>(
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
                        java.util.List<com.oracle.bmc.recovery.model.WorkRequestSummary>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.recovery.model.WorkRequestSummary> apply(
                            ListWorkRequestsResponse response) {
                        return response.getWorkRequestSummaryCollection().getItems();
                    }
                });
    }
}

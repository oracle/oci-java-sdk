/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.databasetools;

import com.oracle.bmc.databasetools.requests.*;
import com.oracle.bmc.databasetools.responses.*;

/**
 * Collection of helper methods that can be used to provide an {@link java.lang.Iterable} interface
 * to any list operations of DatabaseTools where multiple pages of data may be fetched.
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
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20201005")
@lombok.RequiredArgsConstructor
public class DatabaseToolsPaginators {
    private final DatabaseTools client;

    /**
     * Creates a new iterable which will iterate over the responses received from the listDatabaseToolsConnections operation. This iterable
     * will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses received from the service.
     */
    public Iterable<ListDatabaseToolsConnectionsResponse>
            listDatabaseToolsConnectionsResponseIterator(
                    final ListDatabaseToolsConnectionsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListDatabaseToolsConnectionsRequest.Builder, ListDatabaseToolsConnectionsRequest,
                ListDatabaseToolsConnectionsResponse>(
                new com.google.common.base.Supplier<ListDatabaseToolsConnectionsRequest.Builder>() {
                    @Override
                    public ListDatabaseToolsConnectionsRequest.Builder get() {
                        return ListDatabaseToolsConnectionsRequest.builder().copy(request);
                    }
                },
                new com.google.common.base.Function<
                        ListDatabaseToolsConnectionsResponse, String>() {
                    @Override
                    public String apply(ListDatabaseToolsConnectionsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new com.google.common.base.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListDatabaseToolsConnectionsRequest.Builder>,
                        ListDatabaseToolsConnectionsRequest>() {
                    @Override
                    public ListDatabaseToolsConnectionsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListDatabaseToolsConnectionsRequest.Builder>
                                    input) {
                        if (input.getToken() == null) {
                            return input.getRequestBuilder().build();
                        } else {
                            return input.getRequestBuilder()
                                    .page(input.getToken().orNull())
                                    .build();
                        }
                    }
                },
                new com.google.common.base.Function<
                        ListDatabaseToolsConnectionsRequest,
                        ListDatabaseToolsConnectionsResponse>() {
                    @Override
                    public ListDatabaseToolsConnectionsResponse apply(
                            ListDatabaseToolsConnectionsRequest request) {
                        return client.listDatabaseToolsConnections(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link com.oracle.bmc.databasetools.model.DatabaseToolsConnectionSummary} objects
     * contained in responses from the listDatabaseToolsConnections operation. This iterable will fetch more data from the
     * server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link com.oracle.bmc.databasetools.model.DatabaseToolsConnectionSummary} objects
     * contained in responses received from the service.
     */
    public Iterable<com.oracle.bmc.databasetools.model.DatabaseToolsConnectionSummary>
            listDatabaseToolsConnectionsRecordIterator(
                    final ListDatabaseToolsConnectionsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListDatabaseToolsConnectionsRequest.Builder, ListDatabaseToolsConnectionsRequest,
                ListDatabaseToolsConnectionsResponse,
                com.oracle.bmc.databasetools.model.DatabaseToolsConnectionSummary>(
                new com.google.common.base.Supplier<ListDatabaseToolsConnectionsRequest.Builder>() {
                    @Override
                    public ListDatabaseToolsConnectionsRequest.Builder get() {
                        return ListDatabaseToolsConnectionsRequest.builder().copy(request);
                    }
                },
                new com.google.common.base.Function<
                        ListDatabaseToolsConnectionsResponse, String>() {
                    @Override
                    public String apply(ListDatabaseToolsConnectionsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new com.google.common.base.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListDatabaseToolsConnectionsRequest.Builder>,
                        ListDatabaseToolsConnectionsRequest>() {
                    @Override
                    public ListDatabaseToolsConnectionsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListDatabaseToolsConnectionsRequest.Builder>
                                    input) {
                        if (input.getToken() == null) {
                            return input.getRequestBuilder().build();
                        } else {
                            return input.getRequestBuilder()
                                    .page(input.getToken().orNull())
                                    .build();
                        }
                    }
                },
                new com.google.common.base.Function<
                        ListDatabaseToolsConnectionsRequest,
                        ListDatabaseToolsConnectionsResponse>() {
                    @Override
                    public ListDatabaseToolsConnectionsResponse apply(
                            ListDatabaseToolsConnectionsRequest request) {
                        return client.listDatabaseToolsConnections(request);
                    }
                },
                new com.google.common.base.Function<
                        ListDatabaseToolsConnectionsResponse,
                        java.util.List<
                                com.oracle.bmc.databasetools.model
                                        .DatabaseToolsConnectionSummary>>() {
                    @Override
                    public java.util.List<
                                    com.oracle.bmc.databasetools.model
                                            .DatabaseToolsConnectionSummary>
                            apply(ListDatabaseToolsConnectionsResponse response) {
                        return response.getDatabaseToolsConnectionCollection().getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the listDatabaseToolsEndpointServices operation. This iterable
     * will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses received from the service.
     */
    public Iterable<ListDatabaseToolsEndpointServicesResponse>
            listDatabaseToolsEndpointServicesResponseIterator(
                    final ListDatabaseToolsEndpointServicesRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListDatabaseToolsEndpointServicesRequest.Builder,
                ListDatabaseToolsEndpointServicesRequest,
                ListDatabaseToolsEndpointServicesResponse>(
                new com.google.common.base.Supplier<
                        ListDatabaseToolsEndpointServicesRequest.Builder>() {
                    @Override
                    public ListDatabaseToolsEndpointServicesRequest.Builder get() {
                        return ListDatabaseToolsEndpointServicesRequest.builder().copy(request);
                    }
                },
                new com.google.common.base.Function<
                        ListDatabaseToolsEndpointServicesResponse, String>() {
                    @Override
                    public String apply(ListDatabaseToolsEndpointServicesResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new com.google.common.base.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListDatabaseToolsEndpointServicesRequest.Builder>,
                        ListDatabaseToolsEndpointServicesRequest>() {
                    @Override
                    public ListDatabaseToolsEndpointServicesRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListDatabaseToolsEndpointServicesRequest.Builder>
                                    input) {
                        if (input.getToken() == null) {
                            return input.getRequestBuilder().build();
                        } else {
                            return input.getRequestBuilder()
                                    .page(input.getToken().orNull())
                                    .build();
                        }
                    }
                },
                new com.google.common.base.Function<
                        ListDatabaseToolsEndpointServicesRequest,
                        ListDatabaseToolsEndpointServicesResponse>() {
                    @Override
                    public ListDatabaseToolsEndpointServicesResponse apply(
                            ListDatabaseToolsEndpointServicesRequest request) {
                        return client.listDatabaseToolsEndpointServices(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link com.oracle.bmc.databasetools.model.DatabaseToolsEndpointServiceSummary} objects
     * contained in responses from the listDatabaseToolsEndpointServices operation. This iterable will fetch more data from the
     * server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link com.oracle.bmc.databasetools.model.DatabaseToolsEndpointServiceSummary} objects
     * contained in responses received from the service.
     */
    public Iterable<com.oracle.bmc.databasetools.model.DatabaseToolsEndpointServiceSummary>
            listDatabaseToolsEndpointServicesRecordIterator(
                    final ListDatabaseToolsEndpointServicesRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListDatabaseToolsEndpointServicesRequest.Builder,
                ListDatabaseToolsEndpointServicesRequest, ListDatabaseToolsEndpointServicesResponse,
                com.oracle.bmc.databasetools.model.DatabaseToolsEndpointServiceSummary>(
                new com.google.common.base.Supplier<
                        ListDatabaseToolsEndpointServicesRequest.Builder>() {
                    @Override
                    public ListDatabaseToolsEndpointServicesRequest.Builder get() {
                        return ListDatabaseToolsEndpointServicesRequest.builder().copy(request);
                    }
                },
                new com.google.common.base.Function<
                        ListDatabaseToolsEndpointServicesResponse, String>() {
                    @Override
                    public String apply(ListDatabaseToolsEndpointServicesResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new com.google.common.base.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListDatabaseToolsEndpointServicesRequest.Builder>,
                        ListDatabaseToolsEndpointServicesRequest>() {
                    @Override
                    public ListDatabaseToolsEndpointServicesRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListDatabaseToolsEndpointServicesRequest.Builder>
                                    input) {
                        if (input.getToken() == null) {
                            return input.getRequestBuilder().build();
                        } else {
                            return input.getRequestBuilder()
                                    .page(input.getToken().orNull())
                                    .build();
                        }
                    }
                },
                new com.google.common.base.Function<
                        ListDatabaseToolsEndpointServicesRequest,
                        ListDatabaseToolsEndpointServicesResponse>() {
                    @Override
                    public ListDatabaseToolsEndpointServicesResponse apply(
                            ListDatabaseToolsEndpointServicesRequest request) {
                        return client.listDatabaseToolsEndpointServices(request);
                    }
                },
                new com.google.common.base.Function<
                        ListDatabaseToolsEndpointServicesResponse,
                        java.util.List<
                                com.oracle.bmc.databasetools.model
                                        .DatabaseToolsEndpointServiceSummary>>() {
                    @Override
                    public java.util.List<
                                    com.oracle.bmc.databasetools.model
                                            .DatabaseToolsEndpointServiceSummary>
                            apply(ListDatabaseToolsEndpointServicesResponse response) {
                        return response.getDatabaseToolsEndpointServiceCollection().getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the listDatabaseToolsPrivateEndpoints operation. This iterable
     * will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses received from the service.
     */
    public Iterable<ListDatabaseToolsPrivateEndpointsResponse>
            listDatabaseToolsPrivateEndpointsResponseIterator(
                    final ListDatabaseToolsPrivateEndpointsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListDatabaseToolsPrivateEndpointsRequest.Builder,
                ListDatabaseToolsPrivateEndpointsRequest,
                ListDatabaseToolsPrivateEndpointsResponse>(
                new com.google.common.base.Supplier<
                        ListDatabaseToolsPrivateEndpointsRequest.Builder>() {
                    @Override
                    public ListDatabaseToolsPrivateEndpointsRequest.Builder get() {
                        return ListDatabaseToolsPrivateEndpointsRequest.builder().copy(request);
                    }
                },
                new com.google.common.base.Function<
                        ListDatabaseToolsPrivateEndpointsResponse, String>() {
                    @Override
                    public String apply(ListDatabaseToolsPrivateEndpointsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new com.google.common.base.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListDatabaseToolsPrivateEndpointsRequest.Builder>,
                        ListDatabaseToolsPrivateEndpointsRequest>() {
                    @Override
                    public ListDatabaseToolsPrivateEndpointsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListDatabaseToolsPrivateEndpointsRequest.Builder>
                                    input) {
                        if (input.getToken() == null) {
                            return input.getRequestBuilder().build();
                        } else {
                            return input.getRequestBuilder()
                                    .page(input.getToken().orNull())
                                    .build();
                        }
                    }
                },
                new com.google.common.base.Function<
                        ListDatabaseToolsPrivateEndpointsRequest,
                        ListDatabaseToolsPrivateEndpointsResponse>() {
                    @Override
                    public ListDatabaseToolsPrivateEndpointsResponse apply(
                            ListDatabaseToolsPrivateEndpointsRequest request) {
                        return client.listDatabaseToolsPrivateEndpoints(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link com.oracle.bmc.databasetools.model.DatabaseToolsPrivateEndpointSummary} objects
     * contained in responses from the listDatabaseToolsPrivateEndpoints operation. This iterable will fetch more data from the
     * server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link com.oracle.bmc.databasetools.model.DatabaseToolsPrivateEndpointSummary} objects
     * contained in responses received from the service.
     */
    public Iterable<com.oracle.bmc.databasetools.model.DatabaseToolsPrivateEndpointSummary>
            listDatabaseToolsPrivateEndpointsRecordIterator(
                    final ListDatabaseToolsPrivateEndpointsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListDatabaseToolsPrivateEndpointsRequest.Builder,
                ListDatabaseToolsPrivateEndpointsRequest, ListDatabaseToolsPrivateEndpointsResponse,
                com.oracle.bmc.databasetools.model.DatabaseToolsPrivateEndpointSummary>(
                new com.google.common.base.Supplier<
                        ListDatabaseToolsPrivateEndpointsRequest.Builder>() {
                    @Override
                    public ListDatabaseToolsPrivateEndpointsRequest.Builder get() {
                        return ListDatabaseToolsPrivateEndpointsRequest.builder().copy(request);
                    }
                },
                new com.google.common.base.Function<
                        ListDatabaseToolsPrivateEndpointsResponse, String>() {
                    @Override
                    public String apply(ListDatabaseToolsPrivateEndpointsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new com.google.common.base.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListDatabaseToolsPrivateEndpointsRequest.Builder>,
                        ListDatabaseToolsPrivateEndpointsRequest>() {
                    @Override
                    public ListDatabaseToolsPrivateEndpointsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListDatabaseToolsPrivateEndpointsRequest.Builder>
                                    input) {
                        if (input.getToken() == null) {
                            return input.getRequestBuilder().build();
                        } else {
                            return input.getRequestBuilder()
                                    .page(input.getToken().orNull())
                                    .build();
                        }
                    }
                },
                new com.google.common.base.Function<
                        ListDatabaseToolsPrivateEndpointsRequest,
                        ListDatabaseToolsPrivateEndpointsResponse>() {
                    @Override
                    public ListDatabaseToolsPrivateEndpointsResponse apply(
                            ListDatabaseToolsPrivateEndpointsRequest request) {
                        return client.listDatabaseToolsPrivateEndpoints(request);
                    }
                },
                new com.google.common.base.Function<
                        ListDatabaseToolsPrivateEndpointsResponse,
                        java.util.List<
                                com.oracle.bmc.databasetools.model
                                        .DatabaseToolsPrivateEndpointSummary>>() {
                    @Override
                    public java.util.List<
                                    com.oracle.bmc.databasetools.model
                                            .DatabaseToolsPrivateEndpointSummary>
                            apply(ListDatabaseToolsPrivateEndpointsResponse response) {
                        return response.getDatabaseToolsPrivateEndpointCollection().getItems();
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
                new com.google.common.base.Supplier<ListWorkRequestErrorsRequest.Builder>() {
                    @Override
                    public ListWorkRequestErrorsRequest.Builder get() {
                        return ListWorkRequestErrorsRequest.builder().copy(request);
                    }
                },
                new com.google.common.base.Function<ListWorkRequestErrorsResponse, String>() {
                    @Override
                    public String apply(ListWorkRequestErrorsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new com.google.common.base.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListWorkRequestErrorsRequest.Builder>,
                        ListWorkRequestErrorsRequest>() {
                    @Override
                    public ListWorkRequestErrorsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListWorkRequestErrorsRequest.Builder>
                                    input) {
                        if (input.getToken() == null) {
                            return input.getRequestBuilder().build();
                        } else {
                            return input.getRequestBuilder()
                                    .page(input.getToken().orNull())
                                    .build();
                        }
                    }
                },
                new com.google.common.base.Function<
                        ListWorkRequestErrorsRequest, ListWorkRequestErrorsResponse>() {
                    @Override
                    public ListWorkRequestErrorsResponse apply(
                            ListWorkRequestErrorsRequest request) {
                        return client.listWorkRequestErrors(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link com.oracle.bmc.databasetools.model.WorkRequestError} objects
     * contained in responses from the listWorkRequestErrors operation. This iterable will fetch more data from the
     * server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link com.oracle.bmc.databasetools.model.WorkRequestError} objects
     * contained in responses received from the service.
     */
    public Iterable<com.oracle.bmc.databasetools.model.WorkRequestError>
            listWorkRequestErrorsRecordIterator(final ListWorkRequestErrorsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListWorkRequestErrorsRequest.Builder, ListWorkRequestErrorsRequest,
                ListWorkRequestErrorsResponse, com.oracle.bmc.databasetools.model.WorkRequestError>(
                new com.google.common.base.Supplier<ListWorkRequestErrorsRequest.Builder>() {
                    @Override
                    public ListWorkRequestErrorsRequest.Builder get() {
                        return ListWorkRequestErrorsRequest.builder().copy(request);
                    }
                },
                new com.google.common.base.Function<ListWorkRequestErrorsResponse, String>() {
                    @Override
                    public String apply(ListWorkRequestErrorsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new com.google.common.base.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListWorkRequestErrorsRequest.Builder>,
                        ListWorkRequestErrorsRequest>() {
                    @Override
                    public ListWorkRequestErrorsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListWorkRequestErrorsRequest.Builder>
                                    input) {
                        if (input.getToken() == null) {
                            return input.getRequestBuilder().build();
                        } else {
                            return input.getRequestBuilder()
                                    .page(input.getToken().orNull())
                                    .build();
                        }
                    }
                },
                new com.google.common.base.Function<
                        ListWorkRequestErrorsRequest, ListWorkRequestErrorsResponse>() {
                    @Override
                    public ListWorkRequestErrorsResponse apply(
                            ListWorkRequestErrorsRequest request) {
                        return client.listWorkRequestErrors(request);
                    }
                },
                new com.google.common.base.Function<
                        ListWorkRequestErrorsResponse,
                        java.util.List<com.oracle.bmc.databasetools.model.WorkRequestError>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.databasetools.model.WorkRequestError>
                            apply(ListWorkRequestErrorsResponse response) {
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
                new com.google.common.base.Supplier<ListWorkRequestLogsRequest.Builder>() {
                    @Override
                    public ListWorkRequestLogsRequest.Builder get() {
                        return ListWorkRequestLogsRequest.builder().copy(request);
                    }
                },
                new com.google.common.base.Function<ListWorkRequestLogsResponse, String>() {
                    @Override
                    public String apply(ListWorkRequestLogsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new com.google.common.base.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListWorkRequestLogsRequest.Builder>,
                        ListWorkRequestLogsRequest>() {
                    @Override
                    public ListWorkRequestLogsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListWorkRequestLogsRequest.Builder>
                                    input) {
                        if (input.getToken() == null) {
                            return input.getRequestBuilder().build();
                        } else {
                            return input.getRequestBuilder()
                                    .page(input.getToken().orNull())
                                    .build();
                        }
                    }
                },
                new com.google.common.base.Function<
                        ListWorkRequestLogsRequest, ListWorkRequestLogsResponse>() {
                    @Override
                    public ListWorkRequestLogsResponse apply(ListWorkRequestLogsRequest request) {
                        return client.listWorkRequestLogs(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link com.oracle.bmc.databasetools.model.WorkRequestLogEntry} objects
     * contained in responses from the listWorkRequestLogs operation. This iterable will fetch more data from the
     * server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link com.oracle.bmc.databasetools.model.WorkRequestLogEntry} objects
     * contained in responses received from the service.
     */
    public Iterable<com.oracle.bmc.databasetools.model.WorkRequestLogEntry>
            listWorkRequestLogsRecordIterator(final ListWorkRequestLogsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListWorkRequestLogsRequest.Builder, ListWorkRequestLogsRequest,
                ListWorkRequestLogsResponse,
                com.oracle.bmc.databasetools.model.WorkRequestLogEntry>(
                new com.google.common.base.Supplier<ListWorkRequestLogsRequest.Builder>() {
                    @Override
                    public ListWorkRequestLogsRequest.Builder get() {
                        return ListWorkRequestLogsRequest.builder().copy(request);
                    }
                },
                new com.google.common.base.Function<ListWorkRequestLogsResponse, String>() {
                    @Override
                    public String apply(ListWorkRequestLogsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new com.google.common.base.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListWorkRequestLogsRequest.Builder>,
                        ListWorkRequestLogsRequest>() {
                    @Override
                    public ListWorkRequestLogsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListWorkRequestLogsRequest.Builder>
                                    input) {
                        if (input.getToken() == null) {
                            return input.getRequestBuilder().build();
                        } else {
                            return input.getRequestBuilder()
                                    .page(input.getToken().orNull())
                                    .build();
                        }
                    }
                },
                new com.google.common.base.Function<
                        ListWorkRequestLogsRequest, ListWorkRequestLogsResponse>() {
                    @Override
                    public ListWorkRequestLogsResponse apply(ListWorkRequestLogsRequest request) {
                        return client.listWorkRequestLogs(request);
                    }
                },
                new com.google.common.base.Function<
                        ListWorkRequestLogsResponse,
                        java.util.List<com.oracle.bmc.databasetools.model.WorkRequestLogEntry>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.databasetools.model.WorkRequestLogEntry>
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
                new com.google.common.base.Supplier<ListWorkRequestsRequest.Builder>() {
                    @Override
                    public ListWorkRequestsRequest.Builder get() {
                        return ListWorkRequestsRequest.builder().copy(request);
                    }
                },
                new com.google.common.base.Function<ListWorkRequestsResponse, String>() {
                    @Override
                    public String apply(ListWorkRequestsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new com.google.common.base.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListWorkRequestsRequest.Builder>,
                        ListWorkRequestsRequest>() {
                    @Override
                    public ListWorkRequestsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListWorkRequestsRequest.Builder>
                                    input) {
                        if (input.getToken() == null) {
                            return input.getRequestBuilder().build();
                        } else {
                            return input.getRequestBuilder()
                                    .page(input.getToken().orNull())
                                    .build();
                        }
                    }
                },
                new com.google.common.base.Function<
                        ListWorkRequestsRequest, ListWorkRequestsResponse>() {
                    @Override
                    public ListWorkRequestsResponse apply(ListWorkRequestsRequest request) {
                        return client.listWorkRequests(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link com.oracle.bmc.databasetools.model.WorkRequestSummary} objects
     * contained in responses from the listWorkRequests operation. This iterable will fetch more data from the
     * server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link com.oracle.bmc.databasetools.model.WorkRequestSummary} objects
     * contained in responses received from the service.
     */
    public Iterable<com.oracle.bmc.databasetools.model.WorkRequestSummary>
            listWorkRequestsRecordIterator(final ListWorkRequestsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListWorkRequestsRequest.Builder, ListWorkRequestsRequest, ListWorkRequestsResponse,
                com.oracle.bmc.databasetools.model.WorkRequestSummary>(
                new com.google.common.base.Supplier<ListWorkRequestsRequest.Builder>() {
                    @Override
                    public ListWorkRequestsRequest.Builder get() {
                        return ListWorkRequestsRequest.builder().copy(request);
                    }
                },
                new com.google.common.base.Function<ListWorkRequestsResponse, String>() {
                    @Override
                    public String apply(ListWorkRequestsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new com.google.common.base.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListWorkRequestsRequest.Builder>,
                        ListWorkRequestsRequest>() {
                    @Override
                    public ListWorkRequestsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListWorkRequestsRequest.Builder>
                                    input) {
                        if (input.getToken() == null) {
                            return input.getRequestBuilder().build();
                        } else {
                            return input.getRequestBuilder()
                                    .page(input.getToken().orNull())
                                    .build();
                        }
                    }
                },
                new com.google.common.base.Function<
                        ListWorkRequestsRequest, ListWorkRequestsResponse>() {
                    @Override
                    public ListWorkRequestsResponse apply(ListWorkRequestsRequest request) {
                        return client.listWorkRequests(request);
                    }
                },
                new com.google.common.base.Function<
                        ListWorkRequestsResponse,
                        java.util.List<com.oracle.bmc.databasetools.model.WorkRequestSummary>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.databasetools.model.WorkRequestSummary>
                            apply(ListWorkRequestsResponse response) {
                        return response.getWorkRequestCollection().getItems();
                    }
                });
    }
}

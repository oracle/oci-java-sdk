/**
 * Copyright (c) 2016, 2020, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.database;

import com.oracle.bmc.database.requests.*;
import com.oracle.bmc.database.responses.*;

/**
 * Collection of helper methods that can be used to provide an {@link java.lang.Iterable} interface
 * to any list operations of Database where multiple pages of data may be fetched.
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
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
@lombok.RequiredArgsConstructor
public class DatabasePaginators {
    private final Database client;

    /**
     * Creates a new iterable which will iterate over the responses received from the listAutonomousContainerDatabases operation. This iterable
     * will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses received from the service.
     */
    public Iterable<ListAutonomousContainerDatabasesResponse>
            listAutonomousContainerDatabasesResponseIterator(
                    final ListAutonomousContainerDatabasesRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListAutonomousContainerDatabasesRequest.Builder,
                ListAutonomousContainerDatabasesRequest, ListAutonomousContainerDatabasesResponse>(
                new com.google.common.base.Supplier<
                        ListAutonomousContainerDatabasesRequest.Builder>() {
                    @Override
                    public ListAutonomousContainerDatabasesRequest.Builder get() {
                        return ListAutonomousContainerDatabasesRequest.builder().copy(request);
                    }
                },
                new com.google.common.base.Function<
                        ListAutonomousContainerDatabasesResponse, String>() {
                    @Override
                    public String apply(ListAutonomousContainerDatabasesResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new com.google.common.base.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListAutonomousContainerDatabasesRequest.Builder>,
                        ListAutonomousContainerDatabasesRequest>() {
                    @Override
                    public ListAutonomousContainerDatabasesRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListAutonomousContainerDatabasesRequest.Builder>
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
                        ListAutonomousContainerDatabasesRequest,
                        ListAutonomousContainerDatabasesResponse>() {
                    @Override
                    public ListAutonomousContainerDatabasesResponse apply(
                            ListAutonomousContainerDatabasesRequest request) {
                        return client.listAutonomousContainerDatabases(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link com.oracle.bmc.database.model.AutonomousContainerDatabaseSummary} objects
     * contained in responses from the listAutonomousContainerDatabases operation. This iterable will fetch more data from the
     * server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link com.oracle.bmc.database.model.AutonomousContainerDatabaseSummary} objects
     * contained in responses received from the service.
     */
    public Iterable<com.oracle.bmc.database.model.AutonomousContainerDatabaseSummary>
            listAutonomousContainerDatabasesRecordIterator(
                    final ListAutonomousContainerDatabasesRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListAutonomousContainerDatabasesRequest.Builder,
                ListAutonomousContainerDatabasesRequest, ListAutonomousContainerDatabasesResponse,
                com.oracle.bmc.database.model.AutonomousContainerDatabaseSummary>(
                new com.google.common.base.Supplier<
                        ListAutonomousContainerDatabasesRequest.Builder>() {
                    @Override
                    public ListAutonomousContainerDatabasesRequest.Builder get() {
                        return ListAutonomousContainerDatabasesRequest.builder().copy(request);
                    }
                },
                new com.google.common.base.Function<
                        ListAutonomousContainerDatabasesResponse, String>() {
                    @Override
                    public String apply(ListAutonomousContainerDatabasesResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new com.google.common.base.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListAutonomousContainerDatabasesRequest.Builder>,
                        ListAutonomousContainerDatabasesRequest>() {
                    @Override
                    public ListAutonomousContainerDatabasesRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListAutonomousContainerDatabasesRequest.Builder>
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
                        ListAutonomousContainerDatabasesRequest,
                        ListAutonomousContainerDatabasesResponse>() {
                    @Override
                    public ListAutonomousContainerDatabasesResponse apply(
                            ListAutonomousContainerDatabasesRequest request) {
                        return client.listAutonomousContainerDatabases(request);
                    }
                },
                new com.google.common.base.Function<
                        ListAutonomousContainerDatabasesResponse,
                        java.util.List<
                                com.oracle.bmc.database.model
                                        .AutonomousContainerDatabaseSummary>>() {
                    @Override
                    public java.util.List<
                                    com.oracle.bmc.database.model
                                            .AutonomousContainerDatabaseSummary>
                            apply(ListAutonomousContainerDatabasesResponse response) {
                        return response.getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the listAutonomousDataWarehouseBackups operation. This iterable
     * will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses received from the service.
     */
    public Iterable<ListAutonomousDataWarehouseBackupsResponse>
            listAutonomousDataWarehouseBackupsResponseIterator(
                    final ListAutonomousDataWarehouseBackupsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListAutonomousDataWarehouseBackupsRequest.Builder,
                ListAutonomousDataWarehouseBackupsRequest,
                ListAutonomousDataWarehouseBackupsResponse>(
                new com.google.common.base.Supplier<
                        ListAutonomousDataWarehouseBackupsRequest.Builder>() {
                    @Override
                    public ListAutonomousDataWarehouseBackupsRequest.Builder get() {
                        return ListAutonomousDataWarehouseBackupsRequest.builder().copy(request);
                    }
                },
                new com.google.common.base.Function<
                        ListAutonomousDataWarehouseBackupsResponse, String>() {
                    @Override
                    public String apply(ListAutonomousDataWarehouseBackupsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new com.google.common.base.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListAutonomousDataWarehouseBackupsRequest.Builder>,
                        ListAutonomousDataWarehouseBackupsRequest>() {
                    @Override
                    public ListAutonomousDataWarehouseBackupsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListAutonomousDataWarehouseBackupsRequest.Builder>
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
                        ListAutonomousDataWarehouseBackupsRequest,
                        ListAutonomousDataWarehouseBackupsResponse>() {
                    @Override
                    public ListAutonomousDataWarehouseBackupsResponse apply(
                            ListAutonomousDataWarehouseBackupsRequest request) {
                        return client.listAutonomousDataWarehouseBackups(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link com.oracle.bmc.database.model.AutonomousDataWarehouseBackupSummary} objects
     * contained in responses from the listAutonomousDataWarehouseBackups operation. This iterable will fetch more data from the
     * server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link com.oracle.bmc.database.model.AutonomousDataWarehouseBackupSummary} objects
     * contained in responses received from the service.
     */
    public Iterable<com.oracle.bmc.database.model.AutonomousDataWarehouseBackupSummary>
            listAutonomousDataWarehouseBackupsRecordIterator(
                    final ListAutonomousDataWarehouseBackupsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListAutonomousDataWarehouseBackupsRequest.Builder,
                ListAutonomousDataWarehouseBackupsRequest,
                ListAutonomousDataWarehouseBackupsResponse,
                com.oracle.bmc.database.model.AutonomousDataWarehouseBackupSummary>(
                new com.google.common.base.Supplier<
                        ListAutonomousDataWarehouseBackupsRequest.Builder>() {
                    @Override
                    public ListAutonomousDataWarehouseBackupsRequest.Builder get() {
                        return ListAutonomousDataWarehouseBackupsRequest.builder().copy(request);
                    }
                },
                new com.google.common.base.Function<
                        ListAutonomousDataWarehouseBackupsResponse, String>() {
                    @Override
                    public String apply(ListAutonomousDataWarehouseBackupsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new com.google.common.base.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListAutonomousDataWarehouseBackupsRequest.Builder>,
                        ListAutonomousDataWarehouseBackupsRequest>() {
                    @Override
                    public ListAutonomousDataWarehouseBackupsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListAutonomousDataWarehouseBackupsRequest.Builder>
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
                        ListAutonomousDataWarehouseBackupsRequest,
                        ListAutonomousDataWarehouseBackupsResponse>() {
                    @Override
                    public ListAutonomousDataWarehouseBackupsResponse apply(
                            ListAutonomousDataWarehouseBackupsRequest request) {
                        return client.listAutonomousDataWarehouseBackups(request);
                    }
                },
                new com.google.common.base.Function<
                        ListAutonomousDataWarehouseBackupsResponse,
                        java.util.List<
                                com.oracle.bmc.database.model
                                        .AutonomousDataWarehouseBackupSummary>>() {
                    @Override
                    public java.util.List<
                                    com.oracle.bmc.database.model
                                            .AutonomousDataWarehouseBackupSummary>
                            apply(ListAutonomousDataWarehouseBackupsResponse response) {
                        return response.getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the listAutonomousDataWarehouses operation. This iterable
     * will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses received from the service.
     */
    public Iterable<ListAutonomousDataWarehousesResponse>
            listAutonomousDataWarehousesResponseIterator(
                    final ListAutonomousDataWarehousesRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListAutonomousDataWarehousesRequest.Builder, ListAutonomousDataWarehousesRequest,
                ListAutonomousDataWarehousesResponse>(
                new com.google.common.base.Supplier<ListAutonomousDataWarehousesRequest.Builder>() {
                    @Override
                    public ListAutonomousDataWarehousesRequest.Builder get() {
                        return ListAutonomousDataWarehousesRequest.builder().copy(request);
                    }
                },
                new com.google.common.base.Function<
                        ListAutonomousDataWarehousesResponse, String>() {
                    @Override
                    public String apply(ListAutonomousDataWarehousesResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new com.google.common.base.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListAutonomousDataWarehousesRequest.Builder>,
                        ListAutonomousDataWarehousesRequest>() {
                    @Override
                    public ListAutonomousDataWarehousesRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListAutonomousDataWarehousesRequest.Builder>
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
                        ListAutonomousDataWarehousesRequest,
                        ListAutonomousDataWarehousesResponse>() {
                    @Override
                    public ListAutonomousDataWarehousesResponse apply(
                            ListAutonomousDataWarehousesRequest request) {
                        return client.listAutonomousDataWarehouses(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link com.oracle.bmc.database.model.AutonomousDataWarehouseSummary} objects
     * contained in responses from the listAutonomousDataWarehouses operation. This iterable will fetch more data from the
     * server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link com.oracle.bmc.database.model.AutonomousDataWarehouseSummary} objects
     * contained in responses received from the service.
     */
    public Iterable<com.oracle.bmc.database.model.AutonomousDataWarehouseSummary>
            listAutonomousDataWarehousesRecordIterator(
                    final ListAutonomousDataWarehousesRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListAutonomousDataWarehousesRequest.Builder, ListAutonomousDataWarehousesRequest,
                ListAutonomousDataWarehousesResponse,
                com.oracle.bmc.database.model.AutonomousDataWarehouseSummary>(
                new com.google.common.base.Supplier<ListAutonomousDataWarehousesRequest.Builder>() {
                    @Override
                    public ListAutonomousDataWarehousesRequest.Builder get() {
                        return ListAutonomousDataWarehousesRequest.builder().copy(request);
                    }
                },
                new com.google.common.base.Function<
                        ListAutonomousDataWarehousesResponse, String>() {
                    @Override
                    public String apply(ListAutonomousDataWarehousesResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new com.google.common.base.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListAutonomousDataWarehousesRequest.Builder>,
                        ListAutonomousDataWarehousesRequest>() {
                    @Override
                    public ListAutonomousDataWarehousesRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListAutonomousDataWarehousesRequest.Builder>
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
                        ListAutonomousDataWarehousesRequest,
                        ListAutonomousDataWarehousesResponse>() {
                    @Override
                    public ListAutonomousDataWarehousesResponse apply(
                            ListAutonomousDataWarehousesRequest request) {
                        return client.listAutonomousDataWarehouses(request);
                    }
                },
                new com.google.common.base.Function<
                        ListAutonomousDataWarehousesResponse,
                        java.util.List<
                                com.oracle.bmc.database.model.AutonomousDataWarehouseSummary>>() {
                    @Override
                    public java.util.List<
                                    com.oracle.bmc.database.model.AutonomousDataWarehouseSummary>
                            apply(ListAutonomousDataWarehousesResponse response) {
                        return response.getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the listAutonomousDatabaseBackups operation. This iterable
     * will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses received from the service.
     */
    public Iterable<ListAutonomousDatabaseBackupsResponse>
            listAutonomousDatabaseBackupsResponseIterator(
                    final ListAutonomousDatabaseBackupsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListAutonomousDatabaseBackupsRequest.Builder, ListAutonomousDatabaseBackupsRequest,
                ListAutonomousDatabaseBackupsResponse>(
                new com.google.common.base.Supplier<
                        ListAutonomousDatabaseBackupsRequest.Builder>() {
                    @Override
                    public ListAutonomousDatabaseBackupsRequest.Builder get() {
                        return ListAutonomousDatabaseBackupsRequest.builder().copy(request);
                    }
                },
                new com.google.common.base.Function<
                        ListAutonomousDatabaseBackupsResponse, String>() {
                    @Override
                    public String apply(ListAutonomousDatabaseBackupsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new com.google.common.base.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListAutonomousDatabaseBackupsRequest.Builder>,
                        ListAutonomousDatabaseBackupsRequest>() {
                    @Override
                    public ListAutonomousDatabaseBackupsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListAutonomousDatabaseBackupsRequest.Builder>
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
                        ListAutonomousDatabaseBackupsRequest,
                        ListAutonomousDatabaseBackupsResponse>() {
                    @Override
                    public ListAutonomousDatabaseBackupsResponse apply(
                            ListAutonomousDatabaseBackupsRequest request) {
                        return client.listAutonomousDatabaseBackups(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link com.oracle.bmc.database.model.AutonomousDatabaseBackupSummary} objects
     * contained in responses from the listAutonomousDatabaseBackups operation. This iterable will fetch more data from the
     * server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link com.oracle.bmc.database.model.AutonomousDatabaseBackupSummary} objects
     * contained in responses received from the service.
     */
    public Iterable<com.oracle.bmc.database.model.AutonomousDatabaseBackupSummary>
            listAutonomousDatabaseBackupsRecordIterator(
                    final ListAutonomousDatabaseBackupsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListAutonomousDatabaseBackupsRequest.Builder, ListAutonomousDatabaseBackupsRequest,
                ListAutonomousDatabaseBackupsResponse,
                com.oracle.bmc.database.model.AutonomousDatabaseBackupSummary>(
                new com.google.common.base.Supplier<
                        ListAutonomousDatabaseBackupsRequest.Builder>() {
                    @Override
                    public ListAutonomousDatabaseBackupsRequest.Builder get() {
                        return ListAutonomousDatabaseBackupsRequest.builder().copy(request);
                    }
                },
                new com.google.common.base.Function<
                        ListAutonomousDatabaseBackupsResponse, String>() {
                    @Override
                    public String apply(ListAutonomousDatabaseBackupsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new com.google.common.base.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListAutonomousDatabaseBackupsRequest.Builder>,
                        ListAutonomousDatabaseBackupsRequest>() {
                    @Override
                    public ListAutonomousDatabaseBackupsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListAutonomousDatabaseBackupsRequest.Builder>
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
                        ListAutonomousDatabaseBackupsRequest,
                        ListAutonomousDatabaseBackupsResponse>() {
                    @Override
                    public ListAutonomousDatabaseBackupsResponse apply(
                            ListAutonomousDatabaseBackupsRequest request) {
                        return client.listAutonomousDatabaseBackups(request);
                    }
                },
                new com.google.common.base.Function<
                        ListAutonomousDatabaseBackupsResponse,
                        java.util.List<
                                com.oracle.bmc.database.model.AutonomousDatabaseBackupSummary>>() {
                    @Override
                    public java.util.List<
                                    com.oracle.bmc.database.model.AutonomousDatabaseBackupSummary>
                            apply(ListAutonomousDatabaseBackupsResponse response) {
                        return response.getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the listAutonomousDatabases operation. This iterable
     * will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses received from the service.
     */
    public Iterable<ListAutonomousDatabasesResponse> listAutonomousDatabasesResponseIterator(
            final ListAutonomousDatabasesRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListAutonomousDatabasesRequest.Builder, ListAutonomousDatabasesRequest,
                ListAutonomousDatabasesResponse>(
                new com.google.common.base.Supplier<ListAutonomousDatabasesRequest.Builder>() {
                    @Override
                    public ListAutonomousDatabasesRequest.Builder get() {
                        return ListAutonomousDatabasesRequest.builder().copy(request);
                    }
                },
                new com.google.common.base.Function<ListAutonomousDatabasesResponse, String>() {
                    @Override
                    public String apply(ListAutonomousDatabasesResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new com.google.common.base.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListAutonomousDatabasesRequest.Builder>,
                        ListAutonomousDatabasesRequest>() {
                    @Override
                    public ListAutonomousDatabasesRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListAutonomousDatabasesRequest.Builder>
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
                        ListAutonomousDatabasesRequest, ListAutonomousDatabasesResponse>() {
                    @Override
                    public ListAutonomousDatabasesResponse apply(
                            ListAutonomousDatabasesRequest request) {
                        return client.listAutonomousDatabases(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link com.oracle.bmc.database.model.AutonomousDatabaseSummary} objects
     * contained in responses from the listAutonomousDatabases operation. This iterable will fetch more data from the
     * server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link com.oracle.bmc.database.model.AutonomousDatabaseSummary} objects
     * contained in responses received from the service.
     */
    public Iterable<com.oracle.bmc.database.model.AutonomousDatabaseSummary>
            listAutonomousDatabasesRecordIterator(final ListAutonomousDatabasesRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListAutonomousDatabasesRequest.Builder, ListAutonomousDatabasesRequest,
                ListAutonomousDatabasesResponse,
                com.oracle.bmc.database.model.AutonomousDatabaseSummary>(
                new com.google.common.base.Supplier<ListAutonomousDatabasesRequest.Builder>() {
                    @Override
                    public ListAutonomousDatabasesRequest.Builder get() {
                        return ListAutonomousDatabasesRequest.builder().copy(request);
                    }
                },
                new com.google.common.base.Function<ListAutonomousDatabasesResponse, String>() {
                    @Override
                    public String apply(ListAutonomousDatabasesResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new com.google.common.base.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListAutonomousDatabasesRequest.Builder>,
                        ListAutonomousDatabasesRequest>() {
                    @Override
                    public ListAutonomousDatabasesRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListAutonomousDatabasesRequest.Builder>
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
                        ListAutonomousDatabasesRequest, ListAutonomousDatabasesResponse>() {
                    @Override
                    public ListAutonomousDatabasesResponse apply(
                            ListAutonomousDatabasesRequest request) {
                        return client.listAutonomousDatabases(request);
                    }
                },
                new com.google.common.base.Function<
                        ListAutonomousDatabasesResponse,
                        java.util.List<com.oracle.bmc.database.model.AutonomousDatabaseSummary>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.database.model.AutonomousDatabaseSummary>
                            apply(ListAutonomousDatabasesResponse response) {
                        return response.getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the listAutonomousDbPreviewVersions operation. This iterable
     * will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses received from the service.
     */
    public Iterable<ListAutonomousDbPreviewVersionsResponse>
            listAutonomousDbPreviewVersionsResponseIterator(
                    final ListAutonomousDbPreviewVersionsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListAutonomousDbPreviewVersionsRequest.Builder,
                ListAutonomousDbPreviewVersionsRequest, ListAutonomousDbPreviewVersionsResponse>(
                new com.google.common.base.Supplier<
                        ListAutonomousDbPreviewVersionsRequest.Builder>() {
                    @Override
                    public ListAutonomousDbPreviewVersionsRequest.Builder get() {
                        return ListAutonomousDbPreviewVersionsRequest.builder().copy(request);
                    }
                },
                new com.google.common.base.Function<
                        ListAutonomousDbPreviewVersionsResponse, String>() {
                    @Override
                    public String apply(ListAutonomousDbPreviewVersionsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new com.google.common.base.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListAutonomousDbPreviewVersionsRequest.Builder>,
                        ListAutonomousDbPreviewVersionsRequest>() {
                    @Override
                    public ListAutonomousDbPreviewVersionsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListAutonomousDbPreviewVersionsRequest.Builder>
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
                        ListAutonomousDbPreviewVersionsRequest,
                        ListAutonomousDbPreviewVersionsResponse>() {
                    @Override
                    public ListAutonomousDbPreviewVersionsResponse apply(
                            ListAutonomousDbPreviewVersionsRequest request) {
                        return client.listAutonomousDbPreviewVersions(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link com.oracle.bmc.database.model.AutonomousDbPreviewVersionSummary} objects
     * contained in responses from the listAutonomousDbPreviewVersions operation. This iterable will fetch more data from the
     * server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link com.oracle.bmc.database.model.AutonomousDbPreviewVersionSummary} objects
     * contained in responses received from the service.
     */
    public Iterable<com.oracle.bmc.database.model.AutonomousDbPreviewVersionSummary>
            listAutonomousDbPreviewVersionsRecordIterator(
                    final ListAutonomousDbPreviewVersionsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListAutonomousDbPreviewVersionsRequest.Builder,
                ListAutonomousDbPreviewVersionsRequest, ListAutonomousDbPreviewVersionsResponse,
                com.oracle.bmc.database.model.AutonomousDbPreviewVersionSummary>(
                new com.google.common.base.Supplier<
                        ListAutonomousDbPreviewVersionsRequest.Builder>() {
                    @Override
                    public ListAutonomousDbPreviewVersionsRequest.Builder get() {
                        return ListAutonomousDbPreviewVersionsRequest.builder().copy(request);
                    }
                },
                new com.google.common.base.Function<
                        ListAutonomousDbPreviewVersionsResponse, String>() {
                    @Override
                    public String apply(ListAutonomousDbPreviewVersionsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new com.google.common.base.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListAutonomousDbPreviewVersionsRequest.Builder>,
                        ListAutonomousDbPreviewVersionsRequest>() {
                    @Override
                    public ListAutonomousDbPreviewVersionsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListAutonomousDbPreviewVersionsRequest.Builder>
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
                        ListAutonomousDbPreviewVersionsRequest,
                        ListAutonomousDbPreviewVersionsResponse>() {
                    @Override
                    public ListAutonomousDbPreviewVersionsResponse apply(
                            ListAutonomousDbPreviewVersionsRequest request) {
                        return client.listAutonomousDbPreviewVersions(request);
                    }
                },
                new com.google.common.base.Function<
                        ListAutonomousDbPreviewVersionsResponse,
                        java.util.List<
                                com.oracle.bmc.database.model
                                        .AutonomousDbPreviewVersionSummary>>() {
                    @Override
                    public java.util.List<
                                    com.oracle.bmc.database.model.AutonomousDbPreviewVersionSummary>
                            apply(ListAutonomousDbPreviewVersionsResponse response) {
                        return response.getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the listAutonomousDbVersions operation. This iterable
     * will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses received from the service.
     */
    public Iterable<ListAutonomousDbVersionsResponse> listAutonomousDbVersionsResponseIterator(
            final ListAutonomousDbVersionsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListAutonomousDbVersionsRequest.Builder, ListAutonomousDbVersionsRequest,
                ListAutonomousDbVersionsResponse>(
                new com.google.common.base.Supplier<ListAutonomousDbVersionsRequest.Builder>() {
                    @Override
                    public ListAutonomousDbVersionsRequest.Builder get() {
                        return ListAutonomousDbVersionsRequest.builder().copy(request);
                    }
                },
                new com.google.common.base.Function<ListAutonomousDbVersionsResponse, String>() {
                    @Override
                    public String apply(ListAutonomousDbVersionsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new com.google.common.base.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListAutonomousDbVersionsRequest.Builder>,
                        ListAutonomousDbVersionsRequest>() {
                    @Override
                    public ListAutonomousDbVersionsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListAutonomousDbVersionsRequest.Builder>
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
                        ListAutonomousDbVersionsRequest, ListAutonomousDbVersionsResponse>() {
                    @Override
                    public ListAutonomousDbVersionsResponse apply(
                            ListAutonomousDbVersionsRequest request) {
                        return client.listAutonomousDbVersions(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link com.oracle.bmc.database.model.AutonomousDbVersionSummary} objects
     * contained in responses from the listAutonomousDbVersions operation. This iterable will fetch more data from the
     * server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link com.oracle.bmc.database.model.AutonomousDbVersionSummary} objects
     * contained in responses received from the service.
     */
    public Iterable<com.oracle.bmc.database.model.AutonomousDbVersionSummary>
            listAutonomousDbVersionsRecordIterator(final ListAutonomousDbVersionsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListAutonomousDbVersionsRequest.Builder, ListAutonomousDbVersionsRequest,
                ListAutonomousDbVersionsResponse,
                com.oracle.bmc.database.model.AutonomousDbVersionSummary>(
                new com.google.common.base.Supplier<ListAutonomousDbVersionsRequest.Builder>() {
                    @Override
                    public ListAutonomousDbVersionsRequest.Builder get() {
                        return ListAutonomousDbVersionsRequest.builder().copy(request);
                    }
                },
                new com.google.common.base.Function<ListAutonomousDbVersionsResponse, String>() {
                    @Override
                    public String apply(ListAutonomousDbVersionsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new com.google.common.base.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListAutonomousDbVersionsRequest.Builder>,
                        ListAutonomousDbVersionsRequest>() {
                    @Override
                    public ListAutonomousDbVersionsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListAutonomousDbVersionsRequest.Builder>
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
                        ListAutonomousDbVersionsRequest, ListAutonomousDbVersionsResponse>() {
                    @Override
                    public ListAutonomousDbVersionsResponse apply(
                            ListAutonomousDbVersionsRequest request) {
                        return client.listAutonomousDbVersions(request);
                    }
                },
                new com.google.common.base.Function<
                        ListAutonomousDbVersionsResponse,
                        java.util.List<
                                com.oracle.bmc.database.model.AutonomousDbVersionSummary>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.database.model.AutonomousDbVersionSummary>
                            apply(ListAutonomousDbVersionsResponse response) {
                        return response.getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the listAutonomousExadataInfrastructureShapes operation. This iterable
     * will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses received from the service.
     */
    public Iterable<ListAutonomousExadataInfrastructureShapesResponse>
            listAutonomousExadataInfrastructureShapesResponseIterator(
                    final ListAutonomousExadataInfrastructureShapesRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListAutonomousExadataInfrastructureShapesRequest.Builder,
                ListAutonomousExadataInfrastructureShapesRequest,
                ListAutonomousExadataInfrastructureShapesResponse>(
                new com.google.common.base.Supplier<
                        ListAutonomousExadataInfrastructureShapesRequest.Builder>() {
                    @Override
                    public ListAutonomousExadataInfrastructureShapesRequest.Builder get() {
                        return ListAutonomousExadataInfrastructureShapesRequest.builder()
                                .copy(request);
                    }
                },
                new com.google.common.base.Function<
                        ListAutonomousExadataInfrastructureShapesResponse, String>() {
                    @Override
                    public String apply(
                            ListAutonomousExadataInfrastructureShapesResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new com.google.common.base.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListAutonomousExadataInfrastructureShapesRequest.Builder>,
                        ListAutonomousExadataInfrastructureShapesRequest>() {
                    @Override
                    public ListAutonomousExadataInfrastructureShapesRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListAutonomousExadataInfrastructureShapesRequest
                                                    .Builder>
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
                        ListAutonomousExadataInfrastructureShapesRequest,
                        ListAutonomousExadataInfrastructureShapesResponse>() {
                    @Override
                    public ListAutonomousExadataInfrastructureShapesResponse apply(
                            ListAutonomousExadataInfrastructureShapesRequest request) {
                        return client.listAutonomousExadataInfrastructureShapes(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link com.oracle.bmc.database.model.AutonomousExadataInfrastructureShapeSummary} objects
     * contained in responses from the listAutonomousExadataInfrastructureShapes operation. This iterable will fetch more data from the
     * server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link com.oracle.bmc.database.model.AutonomousExadataInfrastructureShapeSummary} objects
     * contained in responses received from the service.
     */
    public Iterable<com.oracle.bmc.database.model.AutonomousExadataInfrastructureShapeSummary>
            listAutonomousExadataInfrastructureShapesRecordIterator(
                    final ListAutonomousExadataInfrastructureShapesRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListAutonomousExadataInfrastructureShapesRequest.Builder,
                ListAutonomousExadataInfrastructureShapesRequest,
                ListAutonomousExadataInfrastructureShapesResponse,
                com.oracle.bmc.database.model.AutonomousExadataInfrastructureShapeSummary>(
                new com.google.common.base.Supplier<
                        ListAutonomousExadataInfrastructureShapesRequest.Builder>() {
                    @Override
                    public ListAutonomousExadataInfrastructureShapesRequest.Builder get() {
                        return ListAutonomousExadataInfrastructureShapesRequest.builder()
                                .copy(request);
                    }
                },
                new com.google.common.base.Function<
                        ListAutonomousExadataInfrastructureShapesResponse, String>() {
                    @Override
                    public String apply(
                            ListAutonomousExadataInfrastructureShapesResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new com.google.common.base.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListAutonomousExadataInfrastructureShapesRequest.Builder>,
                        ListAutonomousExadataInfrastructureShapesRequest>() {
                    @Override
                    public ListAutonomousExadataInfrastructureShapesRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListAutonomousExadataInfrastructureShapesRequest
                                                    .Builder>
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
                        ListAutonomousExadataInfrastructureShapesRequest,
                        ListAutonomousExadataInfrastructureShapesResponse>() {
                    @Override
                    public ListAutonomousExadataInfrastructureShapesResponse apply(
                            ListAutonomousExadataInfrastructureShapesRequest request) {
                        return client.listAutonomousExadataInfrastructureShapes(request);
                    }
                },
                new com.google.common.base.Function<
                        ListAutonomousExadataInfrastructureShapesResponse,
                        java.util.List<
                                com.oracle.bmc.database.model
                                        .AutonomousExadataInfrastructureShapeSummary>>() {
                    @Override
                    public java.util.List<
                                    com.oracle.bmc.database.model
                                            .AutonomousExadataInfrastructureShapeSummary>
                            apply(ListAutonomousExadataInfrastructureShapesResponse response) {
                        return response.getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the listAutonomousExadataInfrastructures operation. This iterable
     * will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses received from the service.
     */
    public Iterable<ListAutonomousExadataInfrastructuresResponse>
            listAutonomousExadataInfrastructuresResponseIterator(
                    final ListAutonomousExadataInfrastructuresRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListAutonomousExadataInfrastructuresRequest.Builder,
                ListAutonomousExadataInfrastructuresRequest,
                ListAutonomousExadataInfrastructuresResponse>(
                new com.google.common.base.Supplier<
                        ListAutonomousExadataInfrastructuresRequest.Builder>() {
                    @Override
                    public ListAutonomousExadataInfrastructuresRequest.Builder get() {
                        return ListAutonomousExadataInfrastructuresRequest.builder().copy(request);
                    }
                },
                new com.google.common.base.Function<
                        ListAutonomousExadataInfrastructuresResponse, String>() {
                    @Override
                    public String apply(ListAutonomousExadataInfrastructuresResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new com.google.common.base.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListAutonomousExadataInfrastructuresRequest.Builder>,
                        ListAutonomousExadataInfrastructuresRequest>() {
                    @Override
                    public ListAutonomousExadataInfrastructuresRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListAutonomousExadataInfrastructuresRequest.Builder>
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
                        ListAutonomousExadataInfrastructuresRequest,
                        ListAutonomousExadataInfrastructuresResponse>() {
                    @Override
                    public ListAutonomousExadataInfrastructuresResponse apply(
                            ListAutonomousExadataInfrastructuresRequest request) {
                        return client.listAutonomousExadataInfrastructures(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link com.oracle.bmc.database.model.AutonomousExadataInfrastructureSummary} objects
     * contained in responses from the listAutonomousExadataInfrastructures operation. This iterable will fetch more data from the
     * server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link com.oracle.bmc.database.model.AutonomousExadataInfrastructureSummary} objects
     * contained in responses received from the service.
     */
    public Iterable<com.oracle.bmc.database.model.AutonomousExadataInfrastructureSummary>
            listAutonomousExadataInfrastructuresRecordIterator(
                    final ListAutonomousExadataInfrastructuresRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListAutonomousExadataInfrastructuresRequest.Builder,
                ListAutonomousExadataInfrastructuresRequest,
                ListAutonomousExadataInfrastructuresResponse,
                com.oracle.bmc.database.model.AutonomousExadataInfrastructureSummary>(
                new com.google.common.base.Supplier<
                        ListAutonomousExadataInfrastructuresRequest.Builder>() {
                    @Override
                    public ListAutonomousExadataInfrastructuresRequest.Builder get() {
                        return ListAutonomousExadataInfrastructuresRequest.builder().copy(request);
                    }
                },
                new com.google.common.base.Function<
                        ListAutonomousExadataInfrastructuresResponse, String>() {
                    @Override
                    public String apply(ListAutonomousExadataInfrastructuresResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new com.google.common.base.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListAutonomousExadataInfrastructuresRequest.Builder>,
                        ListAutonomousExadataInfrastructuresRequest>() {
                    @Override
                    public ListAutonomousExadataInfrastructuresRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListAutonomousExadataInfrastructuresRequest.Builder>
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
                        ListAutonomousExadataInfrastructuresRequest,
                        ListAutonomousExadataInfrastructuresResponse>() {
                    @Override
                    public ListAutonomousExadataInfrastructuresResponse apply(
                            ListAutonomousExadataInfrastructuresRequest request) {
                        return client.listAutonomousExadataInfrastructures(request);
                    }
                },
                new com.google.common.base.Function<
                        ListAutonomousExadataInfrastructuresResponse,
                        java.util.List<
                                com.oracle.bmc.database.model
                                        .AutonomousExadataInfrastructureSummary>>() {
                    @Override
                    public java.util.List<
                                    com.oracle.bmc.database.model
                                            .AutonomousExadataInfrastructureSummary>
                            apply(ListAutonomousExadataInfrastructuresResponse response) {
                        return response.getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the listBackupDestination operation. This iterable
     * will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses received from the service.
     */
    public Iterable<ListBackupDestinationResponse> listBackupDestinationResponseIterator(
            final ListBackupDestinationRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListBackupDestinationRequest.Builder, ListBackupDestinationRequest,
                ListBackupDestinationResponse>(
                new com.google.common.base.Supplier<ListBackupDestinationRequest.Builder>() {
                    @Override
                    public ListBackupDestinationRequest.Builder get() {
                        return ListBackupDestinationRequest.builder().copy(request);
                    }
                },
                new com.google.common.base.Function<ListBackupDestinationResponse, String>() {
                    @Override
                    public String apply(ListBackupDestinationResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new com.google.common.base.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListBackupDestinationRequest.Builder>,
                        ListBackupDestinationRequest>() {
                    @Override
                    public ListBackupDestinationRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListBackupDestinationRequest.Builder>
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
                        ListBackupDestinationRequest, ListBackupDestinationResponse>() {
                    @Override
                    public ListBackupDestinationResponse apply(
                            ListBackupDestinationRequest request) {
                        return client.listBackupDestination(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link com.oracle.bmc.database.model.BackupDestinationSummary} objects
     * contained in responses from the listBackupDestination operation. This iterable will fetch more data from the
     * server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link com.oracle.bmc.database.model.BackupDestinationSummary} objects
     * contained in responses received from the service.
     */
    public Iterable<com.oracle.bmc.database.model.BackupDestinationSummary>
            listBackupDestinationRecordIterator(final ListBackupDestinationRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListBackupDestinationRequest.Builder, ListBackupDestinationRequest,
                ListBackupDestinationResponse,
                com.oracle.bmc.database.model.BackupDestinationSummary>(
                new com.google.common.base.Supplier<ListBackupDestinationRequest.Builder>() {
                    @Override
                    public ListBackupDestinationRequest.Builder get() {
                        return ListBackupDestinationRequest.builder().copy(request);
                    }
                },
                new com.google.common.base.Function<ListBackupDestinationResponse, String>() {
                    @Override
                    public String apply(ListBackupDestinationResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new com.google.common.base.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListBackupDestinationRequest.Builder>,
                        ListBackupDestinationRequest>() {
                    @Override
                    public ListBackupDestinationRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListBackupDestinationRequest.Builder>
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
                        ListBackupDestinationRequest, ListBackupDestinationResponse>() {
                    @Override
                    public ListBackupDestinationResponse apply(
                            ListBackupDestinationRequest request) {
                        return client.listBackupDestination(request);
                    }
                },
                new com.google.common.base.Function<
                        ListBackupDestinationResponse,
                        java.util.List<com.oracle.bmc.database.model.BackupDestinationSummary>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.database.model.BackupDestinationSummary>
                            apply(ListBackupDestinationResponse response) {
                        return response.getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the listBackups operation. This iterable
     * will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses received from the service.
     */
    public Iterable<ListBackupsResponse> listBackupsResponseIterator(
            final ListBackupsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListBackupsRequest.Builder, ListBackupsRequest, ListBackupsResponse>(
                new com.google.common.base.Supplier<ListBackupsRequest.Builder>() {
                    @Override
                    public ListBackupsRequest.Builder get() {
                        return ListBackupsRequest.builder().copy(request);
                    }
                },
                new com.google.common.base.Function<ListBackupsResponse, String>() {
                    @Override
                    public String apply(ListBackupsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new com.google.common.base.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListBackupsRequest.Builder>,
                        ListBackupsRequest>() {
                    @Override
                    public ListBackupsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListBackupsRequest.Builder>
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
                new com.google.common.base.Function<ListBackupsRequest, ListBackupsResponse>() {
                    @Override
                    public ListBackupsResponse apply(ListBackupsRequest request) {
                        return client.listBackups(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link com.oracle.bmc.database.model.BackupSummary} objects
     * contained in responses from the listBackups operation. This iterable will fetch more data from the
     * server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link com.oracle.bmc.database.model.BackupSummary} objects
     * contained in responses received from the service.
     */
    public Iterable<com.oracle.bmc.database.model.BackupSummary> listBackupsRecordIterator(
            final ListBackupsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListBackupsRequest.Builder, ListBackupsRequest, ListBackupsResponse,
                com.oracle.bmc.database.model.BackupSummary>(
                new com.google.common.base.Supplier<ListBackupsRequest.Builder>() {
                    @Override
                    public ListBackupsRequest.Builder get() {
                        return ListBackupsRequest.builder().copy(request);
                    }
                },
                new com.google.common.base.Function<ListBackupsResponse, String>() {
                    @Override
                    public String apply(ListBackupsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new com.google.common.base.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListBackupsRequest.Builder>,
                        ListBackupsRequest>() {
                    @Override
                    public ListBackupsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListBackupsRequest.Builder>
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
                new com.google.common.base.Function<ListBackupsRequest, ListBackupsResponse>() {
                    @Override
                    public ListBackupsResponse apply(ListBackupsRequest request) {
                        return client.listBackups(request);
                    }
                },
                new com.google.common.base.Function<
                        ListBackupsResponse,
                        java.util.List<com.oracle.bmc.database.model.BackupSummary>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.database.model.BackupSummary> apply(
                            ListBackupsResponse response) {
                        return response.getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the listDataGuardAssociations operation. This iterable
     * will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses received from the service.
     */
    public Iterable<ListDataGuardAssociationsResponse> listDataGuardAssociationsResponseIterator(
            final ListDataGuardAssociationsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListDataGuardAssociationsRequest.Builder, ListDataGuardAssociationsRequest,
                ListDataGuardAssociationsResponse>(
                new com.google.common.base.Supplier<ListDataGuardAssociationsRequest.Builder>() {
                    @Override
                    public ListDataGuardAssociationsRequest.Builder get() {
                        return ListDataGuardAssociationsRequest.builder().copy(request);
                    }
                },
                new com.google.common.base.Function<ListDataGuardAssociationsResponse, String>() {
                    @Override
                    public String apply(ListDataGuardAssociationsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new com.google.common.base.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListDataGuardAssociationsRequest.Builder>,
                        ListDataGuardAssociationsRequest>() {
                    @Override
                    public ListDataGuardAssociationsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListDataGuardAssociationsRequest.Builder>
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
                        ListDataGuardAssociationsRequest, ListDataGuardAssociationsResponse>() {
                    @Override
                    public ListDataGuardAssociationsResponse apply(
                            ListDataGuardAssociationsRequest request) {
                        return client.listDataGuardAssociations(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link com.oracle.bmc.database.model.DataGuardAssociationSummary} objects
     * contained in responses from the listDataGuardAssociations operation. This iterable will fetch more data from the
     * server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link com.oracle.bmc.database.model.DataGuardAssociationSummary} objects
     * contained in responses received from the service.
     */
    public Iterable<com.oracle.bmc.database.model.DataGuardAssociationSummary>
            listDataGuardAssociationsRecordIterator(
                    final ListDataGuardAssociationsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListDataGuardAssociationsRequest.Builder, ListDataGuardAssociationsRequest,
                ListDataGuardAssociationsResponse,
                com.oracle.bmc.database.model.DataGuardAssociationSummary>(
                new com.google.common.base.Supplier<ListDataGuardAssociationsRequest.Builder>() {
                    @Override
                    public ListDataGuardAssociationsRequest.Builder get() {
                        return ListDataGuardAssociationsRequest.builder().copy(request);
                    }
                },
                new com.google.common.base.Function<ListDataGuardAssociationsResponse, String>() {
                    @Override
                    public String apply(ListDataGuardAssociationsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new com.google.common.base.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListDataGuardAssociationsRequest.Builder>,
                        ListDataGuardAssociationsRequest>() {
                    @Override
                    public ListDataGuardAssociationsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListDataGuardAssociationsRequest.Builder>
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
                        ListDataGuardAssociationsRequest, ListDataGuardAssociationsResponse>() {
                    @Override
                    public ListDataGuardAssociationsResponse apply(
                            ListDataGuardAssociationsRequest request) {
                        return client.listDataGuardAssociations(request);
                    }
                },
                new com.google.common.base.Function<
                        ListDataGuardAssociationsResponse,
                        java.util.List<
                                com.oracle.bmc.database.model.DataGuardAssociationSummary>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.database.model.DataGuardAssociationSummary>
                            apply(ListDataGuardAssociationsResponse response) {
                        return response.getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the listDatabases operation. This iterable
     * will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses received from the service.
     */
    public Iterable<ListDatabasesResponse> listDatabasesResponseIterator(
            final ListDatabasesRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListDatabasesRequest.Builder, ListDatabasesRequest, ListDatabasesResponse>(
                new com.google.common.base.Supplier<ListDatabasesRequest.Builder>() {
                    @Override
                    public ListDatabasesRequest.Builder get() {
                        return ListDatabasesRequest.builder().copy(request);
                    }
                },
                new com.google.common.base.Function<ListDatabasesResponse, String>() {
                    @Override
                    public String apply(ListDatabasesResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new com.google.common.base.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListDatabasesRequest.Builder>,
                        ListDatabasesRequest>() {
                    @Override
                    public ListDatabasesRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListDatabasesRequest.Builder>
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
                new com.google.common.base.Function<ListDatabasesRequest, ListDatabasesResponse>() {
                    @Override
                    public ListDatabasesResponse apply(ListDatabasesRequest request) {
                        return client.listDatabases(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link com.oracle.bmc.database.model.DatabaseSummary} objects
     * contained in responses from the listDatabases operation. This iterable will fetch more data from the
     * server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link com.oracle.bmc.database.model.DatabaseSummary} objects
     * contained in responses received from the service.
     */
    public Iterable<com.oracle.bmc.database.model.DatabaseSummary> listDatabasesRecordIterator(
            final ListDatabasesRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListDatabasesRequest.Builder, ListDatabasesRequest, ListDatabasesResponse,
                com.oracle.bmc.database.model.DatabaseSummary>(
                new com.google.common.base.Supplier<ListDatabasesRequest.Builder>() {
                    @Override
                    public ListDatabasesRequest.Builder get() {
                        return ListDatabasesRequest.builder().copy(request);
                    }
                },
                new com.google.common.base.Function<ListDatabasesResponse, String>() {
                    @Override
                    public String apply(ListDatabasesResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new com.google.common.base.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListDatabasesRequest.Builder>,
                        ListDatabasesRequest>() {
                    @Override
                    public ListDatabasesRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListDatabasesRequest.Builder>
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
                new com.google.common.base.Function<ListDatabasesRequest, ListDatabasesResponse>() {
                    @Override
                    public ListDatabasesResponse apply(ListDatabasesRequest request) {
                        return client.listDatabases(request);
                    }
                },
                new com.google.common.base.Function<
                        ListDatabasesResponse,
                        java.util.List<com.oracle.bmc.database.model.DatabaseSummary>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.database.model.DatabaseSummary> apply(
                            ListDatabasesResponse response) {
                        return response.getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the listDbHomePatchHistoryEntries operation. This iterable
     * will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses received from the service.
     */
    public Iterable<ListDbHomePatchHistoryEntriesResponse>
            listDbHomePatchHistoryEntriesResponseIterator(
                    final ListDbHomePatchHistoryEntriesRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListDbHomePatchHistoryEntriesRequest.Builder, ListDbHomePatchHistoryEntriesRequest,
                ListDbHomePatchHistoryEntriesResponse>(
                new com.google.common.base.Supplier<
                        ListDbHomePatchHistoryEntriesRequest.Builder>() {
                    @Override
                    public ListDbHomePatchHistoryEntriesRequest.Builder get() {
                        return ListDbHomePatchHistoryEntriesRequest.builder().copy(request);
                    }
                },
                new com.google.common.base.Function<
                        ListDbHomePatchHistoryEntriesResponse, String>() {
                    @Override
                    public String apply(ListDbHomePatchHistoryEntriesResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new com.google.common.base.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListDbHomePatchHistoryEntriesRequest.Builder>,
                        ListDbHomePatchHistoryEntriesRequest>() {
                    @Override
                    public ListDbHomePatchHistoryEntriesRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListDbHomePatchHistoryEntriesRequest.Builder>
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
                        ListDbHomePatchHistoryEntriesRequest,
                        ListDbHomePatchHistoryEntriesResponse>() {
                    @Override
                    public ListDbHomePatchHistoryEntriesResponse apply(
                            ListDbHomePatchHistoryEntriesRequest request) {
                        return client.listDbHomePatchHistoryEntries(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link com.oracle.bmc.database.model.PatchHistoryEntrySummary} objects
     * contained in responses from the listDbHomePatchHistoryEntries operation. This iterable will fetch more data from the
     * server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link com.oracle.bmc.database.model.PatchHistoryEntrySummary} objects
     * contained in responses received from the service.
     */
    public Iterable<com.oracle.bmc.database.model.PatchHistoryEntrySummary>
            listDbHomePatchHistoryEntriesRecordIterator(
                    final ListDbHomePatchHistoryEntriesRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListDbHomePatchHistoryEntriesRequest.Builder, ListDbHomePatchHistoryEntriesRequest,
                ListDbHomePatchHistoryEntriesResponse,
                com.oracle.bmc.database.model.PatchHistoryEntrySummary>(
                new com.google.common.base.Supplier<
                        ListDbHomePatchHistoryEntriesRequest.Builder>() {
                    @Override
                    public ListDbHomePatchHistoryEntriesRequest.Builder get() {
                        return ListDbHomePatchHistoryEntriesRequest.builder().copy(request);
                    }
                },
                new com.google.common.base.Function<
                        ListDbHomePatchHistoryEntriesResponse, String>() {
                    @Override
                    public String apply(ListDbHomePatchHistoryEntriesResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new com.google.common.base.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListDbHomePatchHistoryEntriesRequest.Builder>,
                        ListDbHomePatchHistoryEntriesRequest>() {
                    @Override
                    public ListDbHomePatchHistoryEntriesRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListDbHomePatchHistoryEntriesRequest.Builder>
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
                        ListDbHomePatchHistoryEntriesRequest,
                        ListDbHomePatchHistoryEntriesResponse>() {
                    @Override
                    public ListDbHomePatchHistoryEntriesResponse apply(
                            ListDbHomePatchHistoryEntriesRequest request) {
                        return client.listDbHomePatchHistoryEntries(request);
                    }
                },
                new com.google.common.base.Function<
                        ListDbHomePatchHistoryEntriesResponse,
                        java.util.List<com.oracle.bmc.database.model.PatchHistoryEntrySummary>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.database.model.PatchHistoryEntrySummary>
                            apply(ListDbHomePatchHistoryEntriesResponse response) {
                        return response.getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the listDbHomePatches operation. This iterable
     * will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses received from the service.
     */
    public Iterable<ListDbHomePatchesResponse> listDbHomePatchesResponseIterator(
            final ListDbHomePatchesRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListDbHomePatchesRequest.Builder, ListDbHomePatchesRequest,
                ListDbHomePatchesResponse>(
                new com.google.common.base.Supplier<ListDbHomePatchesRequest.Builder>() {
                    @Override
                    public ListDbHomePatchesRequest.Builder get() {
                        return ListDbHomePatchesRequest.builder().copy(request);
                    }
                },
                new com.google.common.base.Function<ListDbHomePatchesResponse, String>() {
                    @Override
                    public String apply(ListDbHomePatchesResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new com.google.common.base.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListDbHomePatchesRequest.Builder>,
                        ListDbHomePatchesRequest>() {
                    @Override
                    public ListDbHomePatchesRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListDbHomePatchesRequest.Builder>
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
                        ListDbHomePatchesRequest, ListDbHomePatchesResponse>() {
                    @Override
                    public ListDbHomePatchesResponse apply(ListDbHomePatchesRequest request) {
                        return client.listDbHomePatches(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link com.oracle.bmc.database.model.PatchSummary} objects
     * contained in responses from the listDbHomePatches operation. This iterable will fetch more data from the
     * server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link com.oracle.bmc.database.model.PatchSummary} objects
     * contained in responses received from the service.
     */
    public Iterable<com.oracle.bmc.database.model.PatchSummary> listDbHomePatchesRecordIterator(
            final ListDbHomePatchesRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListDbHomePatchesRequest.Builder, ListDbHomePatchesRequest,
                ListDbHomePatchesResponse, com.oracle.bmc.database.model.PatchSummary>(
                new com.google.common.base.Supplier<ListDbHomePatchesRequest.Builder>() {
                    @Override
                    public ListDbHomePatchesRequest.Builder get() {
                        return ListDbHomePatchesRequest.builder().copy(request);
                    }
                },
                new com.google.common.base.Function<ListDbHomePatchesResponse, String>() {
                    @Override
                    public String apply(ListDbHomePatchesResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new com.google.common.base.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListDbHomePatchesRequest.Builder>,
                        ListDbHomePatchesRequest>() {
                    @Override
                    public ListDbHomePatchesRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListDbHomePatchesRequest.Builder>
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
                        ListDbHomePatchesRequest, ListDbHomePatchesResponse>() {
                    @Override
                    public ListDbHomePatchesResponse apply(ListDbHomePatchesRequest request) {
                        return client.listDbHomePatches(request);
                    }
                },
                new com.google.common.base.Function<
                        ListDbHomePatchesResponse,
                        java.util.List<com.oracle.bmc.database.model.PatchSummary>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.database.model.PatchSummary> apply(
                            ListDbHomePatchesResponse response) {
                        return response.getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the listDbHomes operation. This iterable
     * will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses received from the service.
     */
    public Iterable<ListDbHomesResponse> listDbHomesResponseIterator(
            final ListDbHomesRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListDbHomesRequest.Builder, ListDbHomesRequest, ListDbHomesResponse>(
                new com.google.common.base.Supplier<ListDbHomesRequest.Builder>() {
                    @Override
                    public ListDbHomesRequest.Builder get() {
                        return ListDbHomesRequest.builder().copy(request);
                    }
                },
                new com.google.common.base.Function<ListDbHomesResponse, String>() {
                    @Override
                    public String apply(ListDbHomesResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new com.google.common.base.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListDbHomesRequest.Builder>,
                        ListDbHomesRequest>() {
                    @Override
                    public ListDbHomesRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListDbHomesRequest.Builder>
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
                new com.google.common.base.Function<ListDbHomesRequest, ListDbHomesResponse>() {
                    @Override
                    public ListDbHomesResponse apply(ListDbHomesRequest request) {
                        return client.listDbHomes(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link com.oracle.bmc.database.model.DbHomeSummary} objects
     * contained in responses from the listDbHomes operation. This iterable will fetch more data from the
     * server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link com.oracle.bmc.database.model.DbHomeSummary} objects
     * contained in responses received from the service.
     */
    public Iterable<com.oracle.bmc.database.model.DbHomeSummary> listDbHomesRecordIterator(
            final ListDbHomesRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListDbHomesRequest.Builder, ListDbHomesRequest, ListDbHomesResponse,
                com.oracle.bmc.database.model.DbHomeSummary>(
                new com.google.common.base.Supplier<ListDbHomesRequest.Builder>() {
                    @Override
                    public ListDbHomesRequest.Builder get() {
                        return ListDbHomesRequest.builder().copy(request);
                    }
                },
                new com.google.common.base.Function<ListDbHomesResponse, String>() {
                    @Override
                    public String apply(ListDbHomesResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new com.google.common.base.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListDbHomesRequest.Builder>,
                        ListDbHomesRequest>() {
                    @Override
                    public ListDbHomesRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListDbHomesRequest.Builder>
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
                new com.google.common.base.Function<ListDbHomesRequest, ListDbHomesResponse>() {
                    @Override
                    public ListDbHomesResponse apply(ListDbHomesRequest request) {
                        return client.listDbHomes(request);
                    }
                },
                new com.google.common.base.Function<
                        ListDbHomesResponse,
                        java.util.List<com.oracle.bmc.database.model.DbHomeSummary>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.database.model.DbHomeSummary> apply(
                            ListDbHomesResponse response) {
                        return response.getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the listDbNodes operation. This iterable
     * will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses received from the service.
     */
    public Iterable<ListDbNodesResponse> listDbNodesResponseIterator(
            final ListDbNodesRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListDbNodesRequest.Builder, ListDbNodesRequest, ListDbNodesResponse>(
                new com.google.common.base.Supplier<ListDbNodesRequest.Builder>() {
                    @Override
                    public ListDbNodesRequest.Builder get() {
                        return ListDbNodesRequest.builder().copy(request);
                    }
                },
                new com.google.common.base.Function<ListDbNodesResponse, String>() {
                    @Override
                    public String apply(ListDbNodesResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new com.google.common.base.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListDbNodesRequest.Builder>,
                        ListDbNodesRequest>() {
                    @Override
                    public ListDbNodesRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListDbNodesRequest.Builder>
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
                new com.google.common.base.Function<ListDbNodesRequest, ListDbNodesResponse>() {
                    @Override
                    public ListDbNodesResponse apply(ListDbNodesRequest request) {
                        return client.listDbNodes(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link com.oracle.bmc.database.model.DbNodeSummary} objects
     * contained in responses from the listDbNodes operation. This iterable will fetch more data from the
     * server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link com.oracle.bmc.database.model.DbNodeSummary} objects
     * contained in responses received from the service.
     */
    public Iterable<com.oracle.bmc.database.model.DbNodeSummary> listDbNodesRecordIterator(
            final ListDbNodesRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListDbNodesRequest.Builder, ListDbNodesRequest, ListDbNodesResponse,
                com.oracle.bmc.database.model.DbNodeSummary>(
                new com.google.common.base.Supplier<ListDbNodesRequest.Builder>() {
                    @Override
                    public ListDbNodesRequest.Builder get() {
                        return ListDbNodesRequest.builder().copy(request);
                    }
                },
                new com.google.common.base.Function<ListDbNodesResponse, String>() {
                    @Override
                    public String apply(ListDbNodesResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new com.google.common.base.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListDbNodesRequest.Builder>,
                        ListDbNodesRequest>() {
                    @Override
                    public ListDbNodesRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListDbNodesRequest.Builder>
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
                new com.google.common.base.Function<ListDbNodesRequest, ListDbNodesResponse>() {
                    @Override
                    public ListDbNodesResponse apply(ListDbNodesRequest request) {
                        return client.listDbNodes(request);
                    }
                },
                new com.google.common.base.Function<
                        ListDbNodesResponse,
                        java.util.List<com.oracle.bmc.database.model.DbNodeSummary>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.database.model.DbNodeSummary> apply(
                            ListDbNodesResponse response) {
                        return response.getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the listDbSystemPatchHistoryEntries operation. This iterable
     * will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses received from the service.
     */
    public Iterable<ListDbSystemPatchHistoryEntriesResponse>
            listDbSystemPatchHistoryEntriesResponseIterator(
                    final ListDbSystemPatchHistoryEntriesRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListDbSystemPatchHistoryEntriesRequest.Builder,
                ListDbSystemPatchHistoryEntriesRequest, ListDbSystemPatchHistoryEntriesResponse>(
                new com.google.common.base.Supplier<
                        ListDbSystemPatchHistoryEntriesRequest.Builder>() {
                    @Override
                    public ListDbSystemPatchHistoryEntriesRequest.Builder get() {
                        return ListDbSystemPatchHistoryEntriesRequest.builder().copy(request);
                    }
                },
                new com.google.common.base.Function<
                        ListDbSystemPatchHistoryEntriesResponse, String>() {
                    @Override
                    public String apply(ListDbSystemPatchHistoryEntriesResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new com.google.common.base.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListDbSystemPatchHistoryEntriesRequest.Builder>,
                        ListDbSystemPatchHistoryEntriesRequest>() {
                    @Override
                    public ListDbSystemPatchHistoryEntriesRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListDbSystemPatchHistoryEntriesRequest.Builder>
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
                        ListDbSystemPatchHistoryEntriesRequest,
                        ListDbSystemPatchHistoryEntriesResponse>() {
                    @Override
                    public ListDbSystemPatchHistoryEntriesResponse apply(
                            ListDbSystemPatchHistoryEntriesRequest request) {
                        return client.listDbSystemPatchHistoryEntries(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link com.oracle.bmc.database.model.PatchHistoryEntrySummary} objects
     * contained in responses from the listDbSystemPatchHistoryEntries operation. This iterable will fetch more data from the
     * server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link com.oracle.bmc.database.model.PatchHistoryEntrySummary} objects
     * contained in responses received from the service.
     */
    public Iterable<com.oracle.bmc.database.model.PatchHistoryEntrySummary>
            listDbSystemPatchHistoryEntriesRecordIterator(
                    final ListDbSystemPatchHistoryEntriesRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListDbSystemPatchHistoryEntriesRequest.Builder,
                ListDbSystemPatchHistoryEntriesRequest, ListDbSystemPatchHistoryEntriesResponse,
                com.oracle.bmc.database.model.PatchHistoryEntrySummary>(
                new com.google.common.base.Supplier<
                        ListDbSystemPatchHistoryEntriesRequest.Builder>() {
                    @Override
                    public ListDbSystemPatchHistoryEntriesRequest.Builder get() {
                        return ListDbSystemPatchHistoryEntriesRequest.builder().copy(request);
                    }
                },
                new com.google.common.base.Function<
                        ListDbSystemPatchHistoryEntriesResponse, String>() {
                    @Override
                    public String apply(ListDbSystemPatchHistoryEntriesResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new com.google.common.base.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListDbSystemPatchHistoryEntriesRequest.Builder>,
                        ListDbSystemPatchHistoryEntriesRequest>() {
                    @Override
                    public ListDbSystemPatchHistoryEntriesRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListDbSystemPatchHistoryEntriesRequest.Builder>
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
                        ListDbSystemPatchHistoryEntriesRequest,
                        ListDbSystemPatchHistoryEntriesResponse>() {
                    @Override
                    public ListDbSystemPatchHistoryEntriesResponse apply(
                            ListDbSystemPatchHistoryEntriesRequest request) {
                        return client.listDbSystemPatchHistoryEntries(request);
                    }
                },
                new com.google.common.base.Function<
                        ListDbSystemPatchHistoryEntriesResponse,
                        java.util.List<com.oracle.bmc.database.model.PatchHistoryEntrySummary>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.database.model.PatchHistoryEntrySummary>
                            apply(ListDbSystemPatchHistoryEntriesResponse response) {
                        return response.getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the listDbSystemPatches operation. This iterable
     * will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses received from the service.
     */
    public Iterable<ListDbSystemPatchesResponse> listDbSystemPatchesResponseIterator(
            final ListDbSystemPatchesRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListDbSystemPatchesRequest.Builder, ListDbSystemPatchesRequest,
                ListDbSystemPatchesResponse>(
                new com.google.common.base.Supplier<ListDbSystemPatchesRequest.Builder>() {
                    @Override
                    public ListDbSystemPatchesRequest.Builder get() {
                        return ListDbSystemPatchesRequest.builder().copy(request);
                    }
                },
                new com.google.common.base.Function<ListDbSystemPatchesResponse, String>() {
                    @Override
                    public String apply(ListDbSystemPatchesResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new com.google.common.base.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListDbSystemPatchesRequest.Builder>,
                        ListDbSystemPatchesRequest>() {
                    @Override
                    public ListDbSystemPatchesRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListDbSystemPatchesRequest.Builder>
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
                        ListDbSystemPatchesRequest, ListDbSystemPatchesResponse>() {
                    @Override
                    public ListDbSystemPatchesResponse apply(ListDbSystemPatchesRequest request) {
                        return client.listDbSystemPatches(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link com.oracle.bmc.database.model.PatchSummary} objects
     * contained in responses from the listDbSystemPatches operation. This iterable will fetch more data from the
     * server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link com.oracle.bmc.database.model.PatchSummary} objects
     * contained in responses received from the service.
     */
    public Iterable<com.oracle.bmc.database.model.PatchSummary> listDbSystemPatchesRecordIterator(
            final ListDbSystemPatchesRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListDbSystemPatchesRequest.Builder, ListDbSystemPatchesRequest,
                ListDbSystemPatchesResponse, com.oracle.bmc.database.model.PatchSummary>(
                new com.google.common.base.Supplier<ListDbSystemPatchesRequest.Builder>() {
                    @Override
                    public ListDbSystemPatchesRequest.Builder get() {
                        return ListDbSystemPatchesRequest.builder().copy(request);
                    }
                },
                new com.google.common.base.Function<ListDbSystemPatchesResponse, String>() {
                    @Override
                    public String apply(ListDbSystemPatchesResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new com.google.common.base.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListDbSystemPatchesRequest.Builder>,
                        ListDbSystemPatchesRequest>() {
                    @Override
                    public ListDbSystemPatchesRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListDbSystemPatchesRequest.Builder>
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
                        ListDbSystemPatchesRequest, ListDbSystemPatchesResponse>() {
                    @Override
                    public ListDbSystemPatchesResponse apply(ListDbSystemPatchesRequest request) {
                        return client.listDbSystemPatches(request);
                    }
                },
                new com.google.common.base.Function<
                        ListDbSystemPatchesResponse,
                        java.util.List<com.oracle.bmc.database.model.PatchSummary>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.database.model.PatchSummary> apply(
                            ListDbSystemPatchesResponse response) {
                        return response.getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the listDbSystemShapes operation. This iterable
     * will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses received from the service.
     */
    public Iterable<ListDbSystemShapesResponse> listDbSystemShapesResponseIterator(
            final ListDbSystemShapesRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListDbSystemShapesRequest.Builder, ListDbSystemShapesRequest,
                ListDbSystemShapesResponse>(
                new com.google.common.base.Supplier<ListDbSystemShapesRequest.Builder>() {
                    @Override
                    public ListDbSystemShapesRequest.Builder get() {
                        return ListDbSystemShapesRequest.builder().copy(request);
                    }
                },
                new com.google.common.base.Function<ListDbSystemShapesResponse, String>() {
                    @Override
                    public String apply(ListDbSystemShapesResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new com.google.common.base.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListDbSystemShapesRequest.Builder>,
                        ListDbSystemShapesRequest>() {
                    @Override
                    public ListDbSystemShapesRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListDbSystemShapesRequest.Builder>
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
                        ListDbSystemShapesRequest, ListDbSystemShapesResponse>() {
                    @Override
                    public ListDbSystemShapesResponse apply(ListDbSystemShapesRequest request) {
                        return client.listDbSystemShapes(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link com.oracle.bmc.database.model.DbSystemShapeSummary} objects
     * contained in responses from the listDbSystemShapes operation. This iterable will fetch more data from the
     * server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link com.oracle.bmc.database.model.DbSystemShapeSummary} objects
     * contained in responses received from the service.
     */
    public Iterable<com.oracle.bmc.database.model.DbSystemShapeSummary>
            listDbSystemShapesRecordIterator(final ListDbSystemShapesRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListDbSystemShapesRequest.Builder, ListDbSystemShapesRequest,
                ListDbSystemShapesResponse, com.oracle.bmc.database.model.DbSystemShapeSummary>(
                new com.google.common.base.Supplier<ListDbSystemShapesRequest.Builder>() {
                    @Override
                    public ListDbSystemShapesRequest.Builder get() {
                        return ListDbSystemShapesRequest.builder().copy(request);
                    }
                },
                new com.google.common.base.Function<ListDbSystemShapesResponse, String>() {
                    @Override
                    public String apply(ListDbSystemShapesResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new com.google.common.base.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListDbSystemShapesRequest.Builder>,
                        ListDbSystemShapesRequest>() {
                    @Override
                    public ListDbSystemShapesRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListDbSystemShapesRequest.Builder>
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
                        ListDbSystemShapesRequest, ListDbSystemShapesResponse>() {
                    @Override
                    public ListDbSystemShapesResponse apply(ListDbSystemShapesRequest request) {
                        return client.listDbSystemShapes(request);
                    }
                },
                new com.google.common.base.Function<
                        ListDbSystemShapesResponse,
                        java.util.List<com.oracle.bmc.database.model.DbSystemShapeSummary>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.database.model.DbSystemShapeSummary> apply(
                            ListDbSystemShapesResponse response) {
                        return response.getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the listDbSystems operation. This iterable
     * will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses received from the service.
     */
    public Iterable<ListDbSystemsResponse> listDbSystemsResponseIterator(
            final ListDbSystemsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListDbSystemsRequest.Builder, ListDbSystemsRequest, ListDbSystemsResponse>(
                new com.google.common.base.Supplier<ListDbSystemsRequest.Builder>() {
                    @Override
                    public ListDbSystemsRequest.Builder get() {
                        return ListDbSystemsRequest.builder().copy(request);
                    }
                },
                new com.google.common.base.Function<ListDbSystemsResponse, String>() {
                    @Override
                    public String apply(ListDbSystemsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new com.google.common.base.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListDbSystemsRequest.Builder>,
                        ListDbSystemsRequest>() {
                    @Override
                    public ListDbSystemsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListDbSystemsRequest.Builder>
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
                new com.google.common.base.Function<ListDbSystemsRequest, ListDbSystemsResponse>() {
                    @Override
                    public ListDbSystemsResponse apply(ListDbSystemsRequest request) {
                        return client.listDbSystems(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link com.oracle.bmc.database.model.DbSystemSummary} objects
     * contained in responses from the listDbSystems operation. This iterable will fetch more data from the
     * server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link com.oracle.bmc.database.model.DbSystemSummary} objects
     * contained in responses received from the service.
     */
    public Iterable<com.oracle.bmc.database.model.DbSystemSummary> listDbSystemsRecordIterator(
            final ListDbSystemsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListDbSystemsRequest.Builder, ListDbSystemsRequest, ListDbSystemsResponse,
                com.oracle.bmc.database.model.DbSystemSummary>(
                new com.google.common.base.Supplier<ListDbSystemsRequest.Builder>() {
                    @Override
                    public ListDbSystemsRequest.Builder get() {
                        return ListDbSystemsRequest.builder().copy(request);
                    }
                },
                new com.google.common.base.Function<ListDbSystemsResponse, String>() {
                    @Override
                    public String apply(ListDbSystemsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new com.google.common.base.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListDbSystemsRequest.Builder>,
                        ListDbSystemsRequest>() {
                    @Override
                    public ListDbSystemsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListDbSystemsRequest.Builder>
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
                new com.google.common.base.Function<ListDbSystemsRequest, ListDbSystemsResponse>() {
                    @Override
                    public ListDbSystemsResponse apply(ListDbSystemsRequest request) {
                        return client.listDbSystems(request);
                    }
                },
                new com.google.common.base.Function<
                        ListDbSystemsResponse,
                        java.util.List<com.oracle.bmc.database.model.DbSystemSummary>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.database.model.DbSystemSummary> apply(
                            ListDbSystemsResponse response) {
                        return response.getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the listDbVersions operation. This iterable
     * will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses received from the service.
     */
    public Iterable<ListDbVersionsResponse> listDbVersionsResponseIterator(
            final ListDbVersionsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListDbVersionsRequest.Builder, ListDbVersionsRequest, ListDbVersionsResponse>(
                new com.google.common.base.Supplier<ListDbVersionsRequest.Builder>() {
                    @Override
                    public ListDbVersionsRequest.Builder get() {
                        return ListDbVersionsRequest.builder().copy(request);
                    }
                },
                new com.google.common.base.Function<ListDbVersionsResponse, String>() {
                    @Override
                    public String apply(ListDbVersionsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new com.google.common.base.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListDbVersionsRequest.Builder>,
                        ListDbVersionsRequest>() {
                    @Override
                    public ListDbVersionsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListDbVersionsRequest.Builder>
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
                        ListDbVersionsRequest, ListDbVersionsResponse>() {
                    @Override
                    public ListDbVersionsResponse apply(ListDbVersionsRequest request) {
                        return client.listDbVersions(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link com.oracle.bmc.database.model.DbVersionSummary} objects
     * contained in responses from the listDbVersions operation. This iterable will fetch more data from the
     * server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link com.oracle.bmc.database.model.DbVersionSummary} objects
     * contained in responses received from the service.
     */
    public Iterable<com.oracle.bmc.database.model.DbVersionSummary> listDbVersionsRecordIterator(
            final ListDbVersionsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListDbVersionsRequest.Builder, ListDbVersionsRequest, ListDbVersionsResponse,
                com.oracle.bmc.database.model.DbVersionSummary>(
                new com.google.common.base.Supplier<ListDbVersionsRequest.Builder>() {
                    @Override
                    public ListDbVersionsRequest.Builder get() {
                        return ListDbVersionsRequest.builder().copy(request);
                    }
                },
                new com.google.common.base.Function<ListDbVersionsResponse, String>() {
                    @Override
                    public String apply(ListDbVersionsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new com.google.common.base.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListDbVersionsRequest.Builder>,
                        ListDbVersionsRequest>() {
                    @Override
                    public ListDbVersionsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListDbVersionsRequest.Builder>
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
                        ListDbVersionsRequest, ListDbVersionsResponse>() {
                    @Override
                    public ListDbVersionsResponse apply(ListDbVersionsRequest request) {
                        return client.listDbVersions(request);
                    }
                },
                new com.google.common.base.Function<
                        ListDbVersionsResponse,
                        java.util.List<com.oracle.bmc.database.model.DbVersionSummary>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.database.model.DbVersionSummary> apply(
                            ListDbVersionsResponse response) {
                        return response.getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the listExadataInfrastructures operation. This iterable
     * will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses received from the service.
     */
    public Iterable<ListExadataInfrastructuresResponse> listExadataInfrastructuresResponseIterator(
            final ListExadataInfrastructuresRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListExadataInfrastructuresRequest.Builder, ListExadataInfrastructuresRequest,
                ListExadataInfrastructuresResponse>(
                new com.google.common.base.Supplier<ListExadataInfrastructuresRequest.Builder>() {
                    @Override
                    public ListExadataInfrastructuresRequest.Builder get() {
                        return ListExadataInfrastructuresRequest.builder().copy(request);
                    }
                },
                new com.google.common.base.Function<ListExadataInfrastructuresResponse, String>() {
                    @Override
                    public String apply(ListExadataInfrastructuresResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new com.google.common.base.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListExadataInfrastructuresRequest.Builder>,
                        ListExadataInfrastructuresRequest>() {
                    @Override
                    public ListExadataInfrastructuresRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListExadataInfrastructuresRequest.Builder>
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
                        ListExadataInfrastructuresRequest, ListExadataInfrastructuresResponse>() {
                    @Override
                    public ListExadataInfrastructuresResponse apply(
                            ListExadataInfrastructuresRequest request) {
                        return client.listExadataInfrastructures(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link com.oracle.bmc.database.model.ExadataInfrastructureSummary} objects
     * contained in responses from the listExadataInfrastructures operation. This iterable will fetch more data from the
     * server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link com.oracle.bmc.database.model.ExadataInfrastructureSummary} objects
     * contained in responses received from the service.
     */
    public Iterable<com.oracle.bmc.database.model.ExadataInfrastructureSummary>
            listExadataInfrastructuresRecordIterator(
                    final ListExadataInfrastructuresRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListExadataInfrastructuresRequest.Builder, ListExadataInfrastructuresRequest,
                ListExadataInfrastructuresResponse,
                com.oracle.bmc.database.model.ExadataInfrastructureSummary>(
                new com.google.common.base.Supplier<ListExadataInfrastructuresRequest.Builder>() {
                    @Override
                    public ListExadataInfrastructuresRequest.Builder get() {
                        return ListExadataInfrastructuresRequest.builder().copy(request);
                    }
                },
                new com.google.common.base.Function<ListExadataInfrastructuresResponse, String>() {
                    @Override
                    public String apply(ListExadataInfrastructuresResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new com.google.common.base.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListExadataInfrastructuresRequest.Builder>,
                        ListExadataInfrastructuresRequest>() {
                    @Override
                    public ListExadataInfrastructuresRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListExadataInfrastructuresRequest.Builder>
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
                        ListExadataInfrastructuresRequest, ListExadataInfrastructuresResponse>() {
                    @Override
                    public ListExadataInfrastructuresResponse apply(
                            ListExadataInfrastructuresRequest request) {
                        return client.listExadataInfrastructures(request);
                    }
                },
                new com.google.common.base.Function<
                        ListExadataInfrastructuresResponse,
                        java.util.List<
                                com.oracle.bmc.database.model.ExadataInfrastructureSummary>>() {
                    @Override
                    public java.util.List<
                                    com.oracle.bmc.database.model.ExadataInfrastructureSummary>
                            apply(ListExadataInfrastructuresResponse response) {
                        return response.getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the listGiVersions operation. This iterable
     * will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses received from the service.
     */
    public Iterable<ListGiVersionsResponse> listGiVersionsResponseIterator(
            final ListGiVersionsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListGiVersionsRequest.Builder, ListGiVersionsRequest, ListGiVersionsResponse>(
                new com.google.common.base.Supplier<ListGiVersionsRequest.Builder>() {
                    @Override
                    public ListGiVersionsRequest.Builder get() {
                        return ListGiVersionsRequest.builder().copy(request);
                    }
                },
                new com.google.common.base.Function<ListGiVersionsResponse, String>() {
                    @Override
                    public String apply(ListGiVersionsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new com.google.common.base.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListGiVersionsRequest.Builder>,
                        ListGiVersionsRequest>() {
                    @Override
                    public ListGiVersionsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListGiVersionsRequest.Builder>
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
                        ListGiVersionsRequest, ListGiVersionsResponse>() {
                    @Override
                    public ListGiVersionsResponse apply(ListGiVersionsRequest request) {
                        return client.listGiVersions(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link com.oracle.bmc.database.model.GiVersionSummary} objects
     * contained in responses from the listGiVersions operation. This iterable will fetch more data from the
     * server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link com.oracle.bmc.database.model.GiVersionSummary} objects
     * contained in responses received from the service.
     */
    public Iterable<com.oracle.bmc.database.model.GiVersionSummary> listGiVersionsRecordIterator(
            final ListGiVersionsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListGiVersionsRequest.Builder, ListGiVersionsRequest, ListGiVersionsResponse,
                com.oracle.bmc.database.model.GiVersionSummary>(
                new com.google.common.base.Supplier<ListGiVersionsRequest.Builder>() {
                    @Override
                    public ListGiVersionsRequest.Builder get() {
                        return ListGiVersionsRequest.builder().copy(request);
                    }
                },
                new com.google.common.base.Function<ListGiVersionsResponse, String>() {
                    @Override
                    public String apply(ListGiVersionsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new com.google.common.base.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListGiVersionsRequest.Builder>,
                        ListGiVersionsRequest>() {
                    @Override
                    public ListGiVersionsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListGiVersionsRequest.Builder>
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
                        ListGiVersionsRequest, ListGiVersionsResponse>() {
                    @Override
                    public ListGiVersionsResponse apply(ListGiVersionsRequest request) {
                        return client.listGiVersions(request);
                    }
                },
                new com.google.common.base.Function<
                        ListGiVersionsResponse,
                        java.util.List<com.oracle.bmc.database.model.GiVersionSummary>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.database.model.GiVersionSummary> apply(
                            ListGiVersionsResponse response) {
                        return response.getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the listMaintenanceRuns operation. This iterable
     * will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses received from the service.
     */
    public Iterable<ListMaintenanceRunsResponse> listMaintenanceRunsResponseIterator(
            final ListMaintenanceRunsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListMaintenanceRunsRequest.Builder, ListMaintenanceRunsRequest,
                ListMaintenanceRunsResponse>(
                new com.google.common.base.Supplier<ListMaintenanceRunsRequest.Builder>() {
                    @Override
                    public ListMaintenanceRunsRequest.Builder get() {
                        return ListMaintenanceRunsRequest.builder().copy(request);
                    }
                },
                new com.google.common.base.Function<ListMaintenanceRunsResponse, String>() {
                    @Override
                    public String apply(ListMaintenanceRunsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new com.google.common.base.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListMaintenanceRunsRequest.Builder>,
                        ListMaintenanceRunsRequest>() {
                    @Override
                    public ListMaintenanceRunsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListMaintenanceRunsRequest.Builder>
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
                        ListMaintenanceRunsRequest, ListMaintenanceRunsResponse>() {
                    @Override
                    public ListMaintenanceRunsResponse apply(ListMaintenanceRunsRequest request) {
                        return client.listMaintenanceRuns(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link com.oracle.bmc.database.model.MaintenanceRunSummary} objects
     * contained in responses from the listMaintenanceRuns operation. This iterable will fetch more data from the
     * server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link com.oracle.bmc.database.model.MaintenanceRunSummary} objects
     * contained in responses received from the service.
     */
    public Iterable<com.oracle.bmc.database.model.MaintenanceRunSummary>
            listMaintenanceRunsRecordIterator(final ListMaintenanceRunsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListMaintenanceRunsRequest.Builder, ListMaintenanceRunsRequest,
                ListMaintenanceRunsResponse, com.oracle.bmc.database.model.MaintenanceRunSummary>(
                new com.google.common.base.Supplier<ListMaintenanceRunsRequest.Builder>() {
                    @Override
                    public ListMaintenanceRunsRequest.Builder get() {
                        return ListMaintenanceRunsRequest.builder().copy(request);
                    }
                },
                new com.google.common.base.Function<ListMaintenanceRunsResponse, String>() {
                    @Override
                    public String apply(ListMaintenanceRunsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new com.google.common.base.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListMaintenanceRunsRequest.Builder>,
                        ListMaintenanceRunsRequest>() {
                    @Override
                    public ListMaintenanceRunsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListMaintenanceRunsRequest.Builder>
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
                        ListMaintenanceRunsRequest, ListMaintenanceRunsResponse>() {
                    @Override
                    public ListMaintenanceRunsResponse apply(ListMaintenanceRunsRequest request) {
                        return client.listMaintenanceRuns(request);
                    }
                },
                new com.google.common.base.Function<
                        ListMaintenanceRunsResponse,
                        java.util.List<com.oracle.bmc.database.model.MaintenanceRunSummary>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.database.model.MaintenanceRunSummary>
                            apply(ListMaintenanceRunsResponse response) {
                        return response.getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the listVmClusterNetworks operation. This iterable
     * will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses received from the service.
     */
    public Iterable<ListVmClusterNetworksResponse> listVmClusterNetworksResponseIterator(
            final ListVmClusterNetworksRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListVmClusterNetworksRequest.Builder, ListVmClusterNetworksRequest,
                ListVmClusterNetworksResponse>(
                new com.google.common.base.Supplier<ListVmClusterNetworksRequest.Builder>() {
                    @Override
                    public ListVmClusterNetworksRequest.Builder get() {
                        return ListVmClusterNetworksRequest.builder().copy(request);
                    }
                },
                new com.google.common.base.Function<ListVmClusterNetworksResponse, String>() {
                    @Override
                    public String apply(ListVmClusterNetworksResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new com.google.common.base.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListVmClusterNetworksRequest.Builder>,
                        ListVmClusterNetworksRequest>() {
                    @Override
                    public ListVmClusterNetworksRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListVmClusterNetworksRequest.Builder>
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
                        ListVmClusterNetworksRequest, ListVmClusterNetworksResponse>() {
                    @Override
                    public ListVmClusterNetworksResponse apply(
                            ListVmClusterNetworksRequest request) {
                        return client.listVmClusterNetworks(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link com.oracle.bmc.database.model.VmClusterNetworkSummary} objects
     * contained in responses from the listVmClusterNetworks operation. This iterable will fetch more data from the
     * server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link com.oracle.bmc.database.model.VmClusterNetworkSummary} objects
     * contained in responses received from the service.
     */
    public Iterable<com.oracle.bmc.database.model.VmClusterNetworkSummary>
            listVmClusterNetworksRecordIterator(final ListVmClusterNetworksRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListVmClusterNetworksRequest.Builder, ListVmClusterNetworksRequest,
                ListVmClusterNetworksResponse,
                com.oracle.bmc.database.model.VmClusterNetworkSummary>(
                new com.google.common.base.Supplier<ListVmClusterNetworksRequest.Builder>() {
                    @Override
                    public ListVmClusterNetworksRequest.Builder get() {
                        return ListVmClusterNetworksRequest.builder().copy(request);
                    }
                },
                new com.google.common.base.Function<ListVmClusterNetworksResponse, String>() {
                    @Override
                    public String apply(ListVmClusterNetworksResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new com.google.common.base.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListVmClusterNetworksRequest.Builder>,
                        ListVmClusterNetworksRequest>() {
                    @Override
                    public ListVmClusterNetworksRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListVmClusterNetworksRequest.Builder>
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
                        ListVmClusterNetworksRequest, ListVmClusterNetworksResponse>() {
                    @Override
                    public ListVmClusterNetworksResponse apply(
                            ListVmClusterNetworksRequest request) {
                        return client.listVmClusterNetworks(request);
                    }
                },
                new com.google.common.base.Function<
                        ListVmClusterNetworksResponse,
                        java.util.List<com.oracle.bmc.database.model.VmClusterNetworkSummary>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.database.model.VmClusterNetworkSummary>
                            apply(ListVmClusterNetworksResponse response) {
                        return response.getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the listVmClusters operation. This iterable
     * will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses received from the service.
     */
    public Iterable<ListVmClustersResponse> listVmClustersResponseIterator(
            final ListVmClustersRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListVmClustersRequest.Builder, ListVmClustersRequest, ListVmClustersResponse>(
                new com.google.common.base.Supplier<ListVmClustersRequest.Builder>() {
                    @Override
                    public ListVmClustersRequest.Builder get() {
                        return ListVmClustersRequest.builder().copy(request);
                    }
                },
                new com.google.common.base.Function<ListVmClustersResponse, String>() {
                    @Override
                    public String apply(ListVmClustersResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new com.google.common.base.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListVmClustersRequest.Builder>,
                        ListVmClustersRequest>() {
                    @Override
                    public ListVmClustersRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListVmClustersRequest.Builder>
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
                        ListVmClustersRequest, ListVmClustersResponse>() {
                    @Override
                    public ListVmClustersResponse apply(ListVmClustersRequest request) {
                        return client.listVmClusters(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link com.oracle.bmc.database.model.VmClusterSummary} objects
     * contained in responses from the listVmClusters operation. This iterable will fetch more data from the
     * server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link com.oracle.bmc.database.model.VmClusterSummary} objects
     * contained in responses received from the service.
     */
    public Iterable<com.oracle.bmc.database.model.VmClusterSummary> listVmClustersRecordIterator(
            final ListVmClustersRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListVmClustersRequest.Builder, ListVmClustersRequest, ListVmClustersResponse,
                com.oracle.bmc.database.model.VmClusterSummary>(
                new com.google.common.base.Supplier<ListVmClustersRequest.Builder>() {
                    @Override
                    public ListVmClustersRequest.Builder get() {
                        return ListVmClustersRequest.builder().copy(request);
                    }
                },
                new com.google.common.base.Function<ListVmClustersResponse, String>() {
                    @Override
                    public String apply(ListVmClustersResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new com.google.common.base.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListVmClustersRequest.Builder>,
                        ListVmClustersRequest>() {
                    @Override
                    public ListVmClustersRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListVmClustersRequest.Builder>
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
                        ListVmClustersRequest, ListVmClustersResponse>() {
                    @Override
                    public ListVmClustersResponse apply(ListVmClustersRequest request) {
                        return client.listVmClusters(request);
                    }
                },
                new com.google.common.base.Function<
                        ListVmClustersResponse,
                        java.util.List<com.oracle.bmc.database.model.VmClusterSummary>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.database.model.VmClusterSummary> apply(
                            ListVmClustersResponse response) {
                        return response.getItems();
                    }
                });
    }
}

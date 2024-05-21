/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.databasemanagement;

import com.oracle.bmc.databasemanagement.requests.*;
import com.oracle.bmc.databasemanagement.responses.*;

/**
 * Collection of helper methods that can be used to provide an {@link java.lang.Iterable} interface
 * to any list operations of ManagedMySqlDatabases where multiple pages of data may be fetched.
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
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20201101")
public class ManagedMySqlDatabasesPaginators {
    private final ManagedMySqlDatabases client;

    public ManagedMySqlDatabasesPaginators(ManagedMySqlDatabases client) {
        this.client = client;
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the listManagedMySqlDatabaseConfigurationData operation. This iterable
     * will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses received from the service.
     */
    public Iterable<ListManagedMySqlDatabaseConfigurationDataResponse>
            listManagedMySqlDatabaseConfigurationDataResponseIterator(
                    final ListManagedMySqlDatabaseConfigurationDataRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListManagedMySqlDatabaseConfigurationDataRequest.Builder,
                ListManagedMySqlDatabaseConfigurationDataRequest,
                ListManagedMySqlDatabaseConfigurationDataResponse>(
                new java.util.function.Supplier<
                        ListManagedMySqlDatabaseConfigurationDataRequest.Builder>() {
                    @Override
                    public ListManagedMySqlDatabaseConfigurationDataRequest.Builder get() {
                        return ListManagedMySqlDatabaseConfigurationDataRequest.builder()
                                .copy(request);
                    }
                },
                new java.util.function.Function<
                        ListManagedMySqlDatabaseConfigurationDataResponse, String>() {
                    @Override
                    public String apply(
                            ListManagedMySqlDatabaseConfigurationDataResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListManagedMySqlDatabaseConfigurationDataRequest.Builder>,
                        ListManagedMySqlDatabaseConfigurationDataRequest>() {
                    @Override
                    public ListManagedMySqlDatabaseConfigurationDataRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListManagedMySqlDatabaseConfigurationDataRequest
                                                    .Builder>
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
                        ListManagedMySqlDatabaseConfigurationDataRequest,
                        ListManagedMySqlDatabaseConfigurationDataResponse>() {
                    @Override
                    public ListManagedMySqlDatabaseConfigurationDataResponse apply(
                            ListManagedMySqlDatabaseConfigurationDataRequest request) {
                        return client.listManagedMySqlDatabaseConfigurationData(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link com.oracle.bmc.databasemanagement.model.MySqlConfigurationDataSummary} objects
     * contained in responses from the listManagedMySqlDatabaseConfigurationData operation. This iterable will fetch more data from the
     * server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link com.oracle.bmc.databasemanagement.model.MySqlConfigurationDataSummary} objects
     * contained in responses received from the service.
     */
    public Iterable<com.oracle.bmc.databasemanagement.model.MySqlConfigurationDataSummary>
            listManagedMySqlDatabaseConfigurationDataRecordIterator(
                    final ListManagedMySqlDatabaseConfigurationDataRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListManagedMySqlDatabaseConfigurationDataRequest.Builder,
                ListManagedMySqlDatabaseConfigurationDataRequest,
                ListManagedMySqlDatabaseConfigurationDataResponse,
                com.oracle.bmc.databasemanagement.model.MySqlConfigurationDataSummary>(
                new java.util.function.Supplier<
                        ListManagedMySqlDatabaseConfigurationDataRequest.Builder>() {
                    @Override
                    public ListManagedMySqlDatabaseConfigurationDataRequest.Builder get() {
                        return ListManagedMySqlDatabaseConfigurationDataRequest.builder()
                                .copy(request);
                    }
                },
                new java.util.function.Function<
                        ListManagedMySqlDatabaseConfigurationDataResponse, String>() {
                    @Override
                    public String apply(
                            ListManagedMySqlDatabaseConfigurationDataResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListManagedMySqlDatabaseConfigurationDataRequest.Builder>,
                        ListManagedMySqlDatabaseConfigurationDataRequest>() {
                    @Override
                    public ListManagedMySqlDatabaseConfigurationDataRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListManagedMySqlDatabaseConfigurationDataRequest
                                                    .Builder>
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
                        ListManagedMySqlDatabaseConfigurationDataRequest,
                        ListManagedMySqlDatabaseConfigurationDataResponse>() {
                    @Override
                    public ListManagedMySqlDatabaseConfigurationDataResponse apply(
                            ListManagedMySqlDatabaseConfigurationDataRequest request) {
                        return client.listManagedMySqlDatabaseConfigurationData(request);
                    }
                },
                new java.util.function.Function<
                        ListManagedMySqlDatabaseConfigurationDataResponse,
                        java.util.List<
                                com.oracle.bmc.databasemanagement.model
                                        .MySqlConfigurationDataSummary>>() {
                    @Override
                    public java.util.List<
                                    com.oracle.bmc.databasemanagement.model
                                            .MySqlConfigurationDataSummary>
                            apply(ListManagedMySqlDatabaseConfigurationDataResponse response) {
                        return response.getMySqlConfigurationDataCollection().getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the listManagedMySqlDatabaseSqlData operation. This iterable
     * will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses received from the service.
     */
    public Iterable<ListManagedMySqlDatabaseSqlDataResponse>
            listManagedMySqlDatabaseSqlDataResponseIterator(
                    final ListManagedMySqlDatabaseSqlDataRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListManagedMySqlDatabaseSqlDataRequest.Builder,
                ListManagedMySqlDatabaseSqlDataRequest, ListManagedMySqlDatabaseSqlDataResponse>(
                new java.util.function.Supplier<ListManagedMySqlDatabaseSqlDataRequest.Builder>() {
                    @Override
                    public ListManagedMySqlDatabaseSqlDataRequest.Builder get() {
                        return ListManagedMySqlDatabaseSqlDataRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListManagedMySqlDatabaseSqlDataResponse, String>() {
                    @Override
                    public String apply(ListManagedMySqlDatabaseSqlDataResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListManagedMySqlDatabaseSqlDataRequest.Builder>,
                        ListManagedMySqlDatabaseSqlDataRequest>() {
                    @Override
                    public ListManagedMySqlDatabaseSqlDataRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListManagedMySqlDatabaseSqlDataRequest.Builder>
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
                        ListManagedMySqlDatabaseSqlDataRequest,
                        ListManagedMySqlDatabaseSqlDataResponse>() {
                    @Override
                    public ListManagedMySqlDatabaseSqlDataResponse apply(
                            ListManagedMySqlDatabaseSqlDataRequest request) {
                        return client.listManagedMySqlDatabaseSqlData(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link com.oracle.bmc.databasemanagement.model.MySqlDataSummary} objects
     * contained in responses from the listManagedMySqlDatabaseSqlData operation. This iterable will fetch more data from the
     * server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link com.oracle.bmc.databasemanagement.model.MySqlDataSummary} objects
     * contained in responses received from the service.
     */
    public Iterable<com.oracle.bmc.databasemanagement.model.MySqlDataSummary>
            listManagedMySqlDatabaseSqlDataRecordIterator(
                    final ListManagedMySqlDatabaseSqlDataRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListManagedMySqlDatabaseSqlDataRequest.Builder,
                ListManagedMySqlDatabaseSqlDataRequest, ListManagedMySqlDatabaseSqlDataResponse,
                com.oracle.bmc.databasemanagement.model.MySqlDataSummary>(
                new java.util.function.Supplier<ListManagedMySqlDatabaseSqlDataRequest.Builder>() {
                    @Override
                    public ListManagedMySqlDatabaseSqlDataRequest.Builder get() {
                        return ListManagedMySqlDatabaseSqlDataRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListManagedMySqlDatabaseSqlDataResponse, String>() {
                    @Override
                    public String apply(ListManagedMySqlDatabaseSqlDataResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListManagedMySqlDatabaseSqlDataRequest.Builder>,
                        ListManagedMySqlDatabaseSqlDataRequest>() {
                    @Override
                    public ListManagedMySqlDatabaseSqlDataRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListManagedMySqlDatabaseSqlDataRequest.Builder>
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
                        ListManagedMySqlDatabaseSqlDataRequest,
                        ListManagedMySqlDatabaseSqlDataResponse>() {
                    @Override
                    public ListManagedMySqlDatabaseSqlDataResponse apply(
                            ListManagedMySqlDatabaseSqlDataRequest request) {
                        return client.listManagedMySqlDatabaseSqlData(request);
                    }
                },
                new java.util.function.Function<
                        ListManagedMySqlDatabaseSqlDataResponse,
                        java.util.List<
                                com.oracle.bmc.databasemanagement.model.MySqlDataSummary>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.databasemanagement.model.MySqlDataSummary>
                            apply(ListManagedMySqlDatabaseSqlDataResponse response) {
                        return response.getMySqlDataCollection().getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the listManagedMySqlDatabases operation. This iterable
     * will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses received from the service.
     */
    public Iterable<ListManagedMySqlDatabasesResponse> listManagedMySqlDatabasesResponseIterator(
            final ListManagedMySqlDatabasesRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListManagedMySqlDatabasesRequest.Builder, ListManagedMySqlDatabasesRequest,
                ListManagedMySqlDatabasesResponse>(
                new java.util.function.Supplier<ListManagedMySqlDatabasesRequest.Builder>() {
                    @Override
                    public ListManagedMySqlDatabasesRequest.Builder get() {
                        return ListManagedMySqlDatabasesRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListManagedMySqlDatabasesResponse, String>() {
                    @Override
                    public String apply(ListManagedMySqlDatabasesResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListManagedMySqlDatabasesRequest.Builder>,
                        ListManagedMySqlDatabasesRequest>() {
                    @Override
                    public ListManagedMySqlDatabasesRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListManagedMySqlDatabasesRequest.Builder>
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
                        ListManagedMySqlDatabasesRequest, ListManagedMySqlDatabasesResponse>() {
                    @Override
                    public ListManagedMySqlDatabasesResponse apply(
                            ListManagedMySqlDatabasesRequest request) {
                        return client.listManagedMySqlDatabases(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link com.oracle.bmc.databasemanagement.model.ManagedMySqlDatabaseSummary} objects
     * contained in responses from the listManagedMySqlDatabases operation. This iterable will fetch more data from the
     * server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link com.oracle.bmc.databasemanagement.model.ManagedMySqlDatabaseSummary} objects
     * contained in responses received from the service.
     */
    public Iterable<com.oracle.bmc.databasemanagement.model.ManagedMySqlDatabaseSummary>
            listManagedMySqlDatabasesRecordIterator(
                    final ListManagedMySqlDatabasesRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListManagedMySqlDatabasesRequest.Builder, ListManagedMySqlDatabasesRequest,
                ListManagedMySqlDatabasesResponse,
                com.oracle.bmc.databasemanagement.model.ManagedMySqlDatabaseSummary>(
                new java.util.function.Supplier<ListManagedMySqlDatabasesRequest.Builder>() {
                    @Override
                    public ListManagedMySqlDatabasesRequest.Builder get() {
                        return ListManagedMySqlDatabasesRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListManagedMySqlDatabasesResponse, String>() {
                    @Override
                    public String apply(ListManagedMySqlDatabasesResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListManagedMySqlDatabasesRequest.Builder>,
                        ListManagedMySqlDatabasesRequest>() {
                    @Override
                    public ListManagedMySqlDatabasesRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListManagedMySqlDatabasesRequest.Builder>
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
                        ListManagedMySqlDatabasesRequest, ListManagedMySqlDatabasesResponse>() {
                    @Override
                    public ListManagedMySqlDatabasesResponse apply(
                            ListManagedMySqlDatabasesRequest request) {
                        return client.listManagedMySqlDatabases(request);
                    }
                },
                new java.util.function.Function<
                        ListManagedMySqlDatabasesResponse,
                        java.util.List<
                                com.oracle.bmc.databasemanagement.model
                                        .ManagedMySqlDatabaseSummary>>() {
                    @Override
                    public java.util.List<
                                    com.oracle.bmc.databasemanagement.model
                                            .ManagedMySqlDatabaseSummary>
                            apply(ListManagedMySqlDatabasesResponse response) {
                        return response.getManagedMySqlDatabaseCollection().getItems();
                    }
                });
    }
}

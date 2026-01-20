/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.databasemanagement;

import com.oracle.bmc.databasemanagement.requests.*;
import com.oracle.bmc.databasemanagement.responses.*;

/**
 * Collection of helper methods that can be used to provide an {@link java.lang.Iterable} interface
 * to any list operations of ManagedMySqlDatabases where multiple pages of data may be fetched. Two
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
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20201101")
public class ManagedMySqlDatabasesPaginators {
    private final ManagedMySqlDatabases client;

    public ManagedMySqlDatabasesPaginators(ManagedMySqlDatabases client) {
        this.client = client;
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the
     * listHighAvailabilityMembers operation. This iterable will fetch more data from the server as
     * needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses
     *     received from the service.
     */
    public Iterable<ListHighAvailabilityMembersResponse>
            listHighAvailabilityMembersResponseIterator(
                    final ListHighAvailabilityMembersRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListHighAvailabilityMembersRequest.Builder,
                ListHighAvailabilityMembersRequest,
                ListHighAvailabilityMembersResponse>(
                new java.util.function.Supplier<ListHighAvailabilityMembersRequest.Builder>() {
                    @Override
                    public ListHighAvailabilityMembersRequest.Builder get() {
                        return ListHighAvailabilityMembersRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListHighAvailabilityMembersResponse, String>() {
                    @Override
                    public String apply(ListHighAvailabilityMembersResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListHighAvailabilityMembersRequest.Builder>,
                        ListHighAvailabilityMembersRequest>() {
                    @Override
                    public ListHighAvailabilityMembersRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListHighAvailabilityMembersRequest.Builder>
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
                        ListHighAvailabilityMembersRequest, ListHighAvailabilityMembersResponse>() {
                    @Override
                    public ListHighAvailabilityMembersResponse apply(
                            ListHighAvailabilityMembersRequest request) {
                        return client.listHighAvailabilityMembers(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link
     * com.oracle.bmc.databasemanagement.model.ManagedMySqlDatabaseHighAvailabilityMemberSummary}
     * objects contained in responses from the listHighAvailabilityMembers operation. This iterable
     * will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link
     *     com.oracle.bmc.databasemanagement.model.ManagedMySqlDatabaseHighAvailabilityMemberSummary}
     *     objects contained in responses received from the service.
     */
    public Iterable<
                    com.oracle.bmc.databasemanagement.model
                            .ManagedMySqlDatabaseHighAvailabilityMemberSummary>
            listHighAvailabilityMembersRecordIterator(
                    final ListHighAvailabilityMembersRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListHighAvailabilityMembersRequest.Builder,
                ListHighAvailabilityMembersRequest,
                ListHighAvailabilityMembersResponse,
                com.oracle.bmc.databasemanagement.model
                        .ManagedMySqlDatabaseHighAvailabilityMemberSummary>(
                new java.util.function.Supplier<ListHighAvailabilityMembersRequest.Builder>() {
                    @Override
                    public ListHighAvailabilityMembersRequest.Builder get() {
                        return ListHighAvailabilityMembersRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListHighAvailabilityMembersResponse, String>() {
                    @Override
                    public String apply(ListHighAvailabilityMembersResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListHighAvailabilityMembersRequest.Builder>,
                        ListHighAvailabilityMembersRequest>() {
                    @Override
                    public ListHighAvailabilityMembersRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListHighAvailabilityMembersRequest.Builder>
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
                        ListHighAvailabilityMembersRequest, ListHighAvailabilityMembersResponse>() {
                    @Override
                    public ListHighAvailabilityMembersResponse apply(
                            ListHighAvailabilityMembersRequest request) {
                        return client.listHighAvailabilityMembers(request);
                    }
                },
                new java.util.function.Function<
                        ListHighAvailabilityMembersResponse,
                        java.util.List<
                                com.oracle.bmc.databasemanagement.model
                                        .ManagedMySqlDatabaseHighAvailabilityMemberSummary>>() {
                    @Override
                    public java.util.List<
                                    com.oracle.bmc.databasemanagement.model
                                            .ManagedMySqlDatabaseHighAvailabilityMemberSummary>
                            apply(ListHighAvailabilityMembersResponse response) {
                        return response.getManagedMySqlDatabaseHighAvailabilityMemberCollection()
                                .getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the
     * listInboundReplications operation. This iterable will fetch more data from the server as
     * needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses
     *     received from the service.
     */
    public Iterable<ListInboundReplicationsResponse> listInboundReplicationsResponseIterator(
            final ListInboundReplicationsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListInboundReplicationsRequest.Builder,
                ListInboundReplicationsRequest,
                ListInboundReplicationsResponse>(
                new java.util.function.Supplier<ListInboundReplicationsRequest.Builder>() {
                    @Override
                    public ListInboundReplicationsRequest.Builder get() {
                        return ListInboundReplicationsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListInboundReplicationsResponse, String>() {
                    @Override
                    public String apply(ListInboundReplicationsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListInboundReplicationsRequest.Builder>,
                        ListInboundReplicationsRequest>() {
                    @Override
                    public ListInboundReplicationsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListInboundReplicationsRequest.Builder>
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
                        ListInboundReplicationsRequest, ListInboundReplicationsResponse>() {
                    @Override
                    public ListInboundReplicationsResponse apply(
                            ListInboundReplicationsRequest request) {
                        return client.listInboundReplications(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link
     * com.oracle.bmc.databasemanagement.model.ManagedMySqlDatabaseInboundReplicationSummary}
     * objects contained in responses from the listInboundReplications operation. This iterable will
     * fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link
     *     com.oracle.bmc.databasemanagement.model.ManagedMySqlDatabaseInboundReplicationSummary}
     *     objects contained in responses received from the service.
     */
    public Iterable<
                    com.oracle.bmc.databasemanagement.model
                            .ManagedMySqlDatabaseInboundReplicationSummary>
            listInboundReplicationsRecordIterator(final ListInboundReplicationsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListInboundReplicationsRequest.Builder,
                ListInboundReplicationsRequest,
                ListInboundReplicationsResponse,
                com.oracle.bmc.databasemanagement.model
                        .ManagedMySqlDatabaseInboundReplicationSummary>(
                new java.util.function.Supplier<ListInboundReplicationsRequest.Builder>() {
                    @Override
                    public ListInboundReplicationsRequest.Builder get() {
                        return ListInboundReplicationsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListInboundReplicationsResponse, String>() {
                    @Override
                    public String apply(ListInboundReplicationsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListInboundReplicationsRequest.Builder>,
                        ListInboundReplicationsRequest>() {
                    @Override
                    public ListInboundReplicationsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListInboundReplicationsRequest.Builder>
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
                        ListInboundReplicationsRequest, ListInboundReplicationsResponse>() {
                    @Override
                    public ListInboundReplicationsResponse apply(
                            ListInboundReplicationsRequest request) {
                        return client.listInboundReplications(request);
                    }
                },
                new java.util.function.Function<
                        ListInboundReplicationsResponse,
                        java.util.List<
                                com.oracle.bmc.databasemanagement.model
                                        .ManagedMySqlDatabaseInboundReplicationSummary>>() {
                    @Override
                    public java.util.List<
                                    com.oracle.bmc.databasemanagement.model
                                            .ManagedMySqlDatabaseInboundReplicationSummary>
                            apply(ListInboundReplicationsResponse response) {
                        return response.getManagedMySqlDatabaseInboundReplicationCollection()
                                .getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the
     * listManagedMySqlDatabaseConfigurationData operation. This iterable will fetch more data from
     * the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses
     *     received from the service.
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
     * Creates a new iterable which will iterate over the {@link
     * com.oracle.bmc.databasemanagement.model.MySqlConfigurationDataSummary} objects contained in
     * responses from the listManagedMySqlDatabaseConfigurationData operation. This iterable will
     * fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link
     *     com.oracle.bmc.databasemanagement.model.MySqlConfigurationDataSummary} objects contained
     *     in responses received from the service.
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
     * Creates a new iterable which will iterate over the responses received from the
     * listManagedMySqlDatabaseSqlData operation. This iterable will fetch more data from the server
     * as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses
     *     received from the service.
     */
    public Iterable<ListManagedMySqlDatabaseSqlDataResponse>
            listManagedMySqlDatabaseSqlDataResponseIterator(
                    final ListManagedMySqlDatabaseSqlDataRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListManagedMySqlDatabaseSqlDataRequest.Builder,
                ListManagedMySqlDatabaseSqlDataRequest,
                ListManagedMySqlDatabaseSqlDataResponse>(
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
     * Creates a new iterable which will iterate over the {@link
     * com.oracle.bmc.databasemanagement.model.MySqlDataSummary} objects contained in responses from
     * the listManagedMySqlDatabaseSqlData operation. This iterable will fetch more data from the
     * server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link
     *     com.oracle.bmc.databasemanagement.model.MySqlDataSummary} objects contained in responses
     *     received from the service.
     */
    public Iterable<com.oracle.bmc.databasemanagement.model.MySqlDataSummary>
            listManagedMySqlDatabaseSqlDataRecordIterator(
                    final ListManagedMySqlDatabaseSqlDataRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListManagedMySqlDatabaseSqlDataRequest.Builder,
                ListManagedMySqlDatabaseSqlDataRequest,
                ListManagedMySqlDatabaseSqlDataResponse,
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
     * Creates a new iterable which will iterate over the responses received from the
     * listManagedMySqlDatabases operation. This iterable will fetch more data from the server as
     * needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses
     *     received from the service.
     */
    public Iterable<ListManagedMySqlDatabasesResponse> listManagedMySqlDatabasesResponseIterator(
            final ListManagedMySqlDatabasesRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListManagedMySqlDatabasesRequest.Builder,
                ListManagedMySqlDatabasesRequest,
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
     * Creates a new iterable which will iterate over the {@link
     * com.oracle.bmc.databasemanagement.model.ManagedMySqlDatabaseSummary} objects contained in
     * responses from the listManagedMySqlDatabases operation. This iterable will fetch more data
     * from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link
     *     com.oracle.bmc.databasemanagement.model.ManagedMySqlDatabaseSummary} objects contained in
     *     responses received from the service.
     */
    public Iterable<com.oracle.bmc.databasemanagement.model.ManagedMySqlDatabaseSummary>
            listManagedMySqlDatabasesRecordIterator(
                    final ListManagedMySqlDatabasesRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListManagedMySqlDatabasesRequest.Builder,
                ListManagedMySqlDatabasesRequest,
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

    /**
     * Creates a new iterable which will iterate over the responses received from the
     * listMySqlDigestErrors operation. This iterable will fetch more data from the server as
     * needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses
     *     received from the service.
     */
    public Iterable<ListMySqlDigestErrorsResponse> listMySqlDigestErrorsResponseIterator(
            final ListMySqlDigestErrorsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListMySqlDigestErrorsRequest.Builder,
                ListMySqlDigestErrorsRequest,
                ListMySqlDigestErrorsResponse>(
                new java.util.function.Supplier<ListMySqlDigestErrorsRequest.Builder>() {
                    @Override
                    public ListMySqlDigestErrorsRequest.Builder get() {
                        return ListMySqlDigestErrorsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListMySqlDigestErrorsResponse, String>() {
                    @Override
                    public String apply(ListMySqlDigestErrorsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListMySqlDigestErrorsRequest.Builder>,
                        ListMySqlDigestErrorsRequest>() {
                    @Override
                    public ListMySqlDigestErrorsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListMySqlDigestErrorsRequest.Builder>
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
                        ListMySqlDigestErrorsRequest, ListMySqlDigestErrorsResponse>() {
                    @Override
                    public ListMySqlDigestErrorsResponse apply(
                            ListMySqlDigestErrorsRequest request) {
                        return client.listMySqlDigestErrors(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link
     * com.oracle.bmc.databasemanagement.model.MySqlDigestErrorSummary} objects contained in
     * responses from the listMySqlDigestErrors operation. This iterable will fetch more data from
     * the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link
     *     com.oracle.bmc.databasemanagement.model.MySqlDigestErrorSummary} objects contained in
     *     responses received from the service.
     */
    public Iterable<com.oracle.bmc.databasemanagement.model.MySqlDigestErrorSummary>
            listMySqlDigestErrorsRecordIterator(final ListMySqlDigestErrorsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListMySqlDigestErrorsRequest.Builder,
                ListMySqlDigestErrorsRequest,
                ListMySqlDigestErrorsResponse,
                com.oracle.bmc.databasemanagement.model.MySqlDigestErrorSummary>(
                new java.util.function.Supplier<ListMySqlDigestErrorsRequest.Builder>() {
                    @Override
                    public ListMySqlDigestErrorsRequest.Builder get() {
                        return ListMySqlDigestErrorsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListMySqlDigestErrorsResponse, String>() {
                    @Override
                    public String apply(ListMySqlDigestErrorsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListMySqlDigestErrorsRequest.Builder>,
                        ListMySqlDigestErrorsRequest>() {
                    @Override
                    public ListMySqlDigestErrorsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListMySqlDigestErrorsRequest.Builder>
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
                        ListMySqlDigestErrorsRequest, ListMySqlDigestErrorsResponse>() {
                    @Override
                    public ListMySqlDigestErrorsResponse apply(
                            ListMySqlDigestErrorsRequest request) {
                        return client.listMySqlDigestErrors(request);
                    }
                },
                new java.util.function.Function<
                        ListMySqlDigestErrorsResponse,
                        java.util.List<
                                com.oracle.bmc.databasemanagement.model
                                        .MySqlDigestErrorSummary>>() {
                    @Override
                    public java.util.List<
                                    com.oracle.bmc.databasemanagement.model.MySqlDigestErrorSummary>
                            apply(ListMySqlDigestErrorsResponse response) {
                        return response.getMySqlDigestErrorsCollection().getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the
     * listOutboundReplications operation. This iterable will fetch more data from the server as
     * needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses
     *     received from the service.
     */
    public Iterable<ListOutboundReplicationsResponse> listOutboundReplicationsResponseIterator(
            final ListOutboundReplicationsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListOutboundReplicationsRequest.Builder,
                ListOutboundReplicationsRequest,
                ListOutboundReplicationsResponse>(
                new java.util.function.Supplier<ListOutboundReplicationsRequest.Builder>() {
                    @Override
                    public ListOutboundReplicationsRequest.Builder get() {
                        return ListOutboundReplicationsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListOutboundReplicationsResponse, String>() {
                    @Override
                    public String apply(ListOutboundReplicationsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListOutboundReplicationsRequest.Builder>,
                        ListOutboundReplicationsRequest>() {
                    @Override
                    public ListOutboundReplicationsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListOutboundReplicationsRequest.Builder>
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
                        ListOutboundReplicationsRequest, ListOutboundReplicationsResponse>() {
                    @Override
                    public ListOutboundReplicationsResponse apply(
                            ListOutboundReplicationsRequest request) {
                        return client.listOutboundReplications(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link
     * com.oracle.bmc.databasemanagement.model.ManagedMySqlDatabaseOutboundReplicationSummary}
     * objects contained in responses from the listOutboundReplications operation. This iterable
     * will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link
     *     com.oracle.bmc.databasemanagement.model.ManagedMySqlDatabaseOutboundReplicationSummary}
     *     objects contained in responses received from the service.
     */
    public Iterable<
                    com.oracle.bmc.databasemanagement.model
                            .ManagedMySqlDatabaseOutboundReplicationSummary>
            listOutboundReplicationsRecordIterator(final ListOutboundReplicationsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListOutboundReplicationsRequest.Builder,
                ListOutboundReplicationsRequest,
                ListOutboundReplicationsResponse,
                com.oracle.bmc.databasemanagement.model
                        .ManagedMySqlDatabaseOutboundReplicationSummary>(
                new java.util.function.Supplier<ListOutboundReplicationsRequest.Builder>() {
                    @Override
                    public ListOutboundReplicationsRequest.Builder get() {
                        return ListOutboundReplicationsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListOutboundReplicationsResponse, String>() {
                    @Override
                    public String apply(ListOutboundReplicationsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListOutboundReplicationsRequest.Builder>,
                        ListOutboundReplicationsRequest>() {
                    @Override
                    public ListOutboundReplicationsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListOutboundReplicationsRequest.Builder>
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
                        ListOutboundReplicationsRequest, ListOutboundReplicationsResponse>() {
                    @Override
                    public ListOutboundReplicationsResponse apply(
                            ListOutboundReplicationsRequest request) {
                        return client.listOutboundReplications(request);
                    }
                },
                new java.util.function.Function<
                        ListOutboundReplicationsResponse,
                        java.util.List<
                                com.oracle.bmc.databasemanagement.model
                                        .ManagedMySqlDatabaseOutboundReplicationSummary>>() {
                    @Override
                    public java.util.List<
                                    com.oracle.bmc.databasemanagement.model
                                            .ManagedMySqlDatabaseOutboundReplicationSummary>
                            apply(ListOutboundReplicationsResponse response) {
                        return response.getManagedMySqlDatabaseOutboundReplicationCollection()
                                .getItems();
                    }
                });
    }
}

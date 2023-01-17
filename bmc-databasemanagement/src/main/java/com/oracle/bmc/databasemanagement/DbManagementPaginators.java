/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.databasemanagement;

import com.oracle.bmc.databasemanagement.requests.*;
import com.oracle.bmc.databasemanagement.responses.*;

/**
 * Collection of helper methods that can be used to provide an {@link java.lang.Iterable} interface
 * to any list operations of DbManagement where multiple pages of data may be fetched.
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
public class DbManagementPaginators {
    private final DbManagement client;

    public DbManagementPaginators(DbManagement client) {
        this.client = client;
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the listAsmProperties operation. This iterable
     * will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses received from the service.
     */
    public Iterable<ListAsmPropertiesResponse> listAsmPropertiesResponseIterator(
            final ListAsmPropertiesRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListAsmPropertiesRequest.Builder, ListAsmPropertiesRequest,
                ListAsmPropertiesResponse>(
                new java.util.function.Supplier<ListAsmPropertiesRequest.Builder>() {
                    @Override
                    public ListAsmPropertiesRequest.Builder get() {
                        return ListAsmPropertiesRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListAsmPropertiesResponse, String>() {
                    @Override
                    public String apply(ListAsmPropertiesResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListAsmPropertiesRequest.Builder>,
                        ListAsmPropertiesRequest>() {
                    @Override
                    public ListAsmPropertiesRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListAsmPropertiesRequest.Builder>
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
                        ListAsmPropertiesRequest, ListAsmPropertiesResponse>() {
                    @Override
                    public ListAsmPropertiesResponse apply(ListAsmPropertiesRequest request) {
                        return client.listAsmProperties(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link com.oracle.bmc.databasemanagement.model.AsmPropertySummary} objects
     * contained in responses from the listAsmProperties operation. This iterable will fetch more data from the
     * server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link com.oracle.bmc.databasemanagement.model.AsmPropertySummary} objects
     * contained in responses received from the service.
     */
    public Iterable<com.oracle.bmc.databasemanagement.model.AsmPropertySummary>
            listAsmPropertiesRecordIterator(final ListAsmPropertiesRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListAsmPropertiesRequest.Builder, ListAsmPropertiesRequest,
                ListAsmPropertiesResponse,
                com.oracle.bmc.databasemanagement.model.AsmPropertySummary>(
                new java.util.function.Supplier<ListAsmPropertiesRequest.Builder>() {
                    @Override
                    public ListAsmPropertiesRequest.Builder get() {
                        return ListAsmPropertiesRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListAsmPropertiesResponse, String>() {
                    @Override
                    public String apply(ListAsmPropertiesResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListAsmPropertiesRequest.Builder>,
                        ListAsmPropertiesRequest>() {
                    @Override
                    public ListAsmPropertiesRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListAsmPropertiesRequest.Builder>
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
                        ListAsmPropertiesRequest, ListAsmPropertiesResponse>() {
                    @Override
                    public ListAsmPropertiesResponse apply(ListAsmPropertiesRequest request) {
                        return client.listAsmProperties(request);
                    }
                },
                new java.util.function.Function<
                        ListAsmPropertiesResponse,
                        java.util.List<
                                com.oracle.bmc.databasemanagement.model.AsmPropertySummary>>() {
                    @Override
                    public java.util.List<
                                    com.oracle.bmc.databasemanagement.model.AsmPropertySummary>
                            apply(ListAsmPropertiesResponse response) {
                        return response.getAsmPropertyCollection().getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the listAssociatedDatabases operation. This iterable
     * will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses received from the service.
     */
    public Iterable<ListAssociatedDatabasesResponse> listAssociatedDatabasesResponseIterator(
            final ListAssociatedDatabasesRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListAssociatedDatabasesRequest.Builder, ListAssociatedDatabasesRequest,
                ListAssociatedDatabasesResponse>(
                new java.util.function.Supplier<ListAssociatedDatabasesRequest.Builder>() {
                    @Override
                    public ListAssociatedDatabasesRequest.Builder get() {
                        return ListAssociatedDatabasesRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListAssociatedDatabasesResponse, String>() {
                    @Override
                    public String apply(ListAssociatedDatabasesResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListAssociatedDatabasesRequest.Builder>,
                        ListAssociatedDatabasesRequest>() {
                    @Override
                    public ListAssociatedDatabasesRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListAssociatedDatabasesRequest.Builder>
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
                        ListAssociatedDatabasesRequest, ListAssociatedDatabasesResponse>() {
                    @Override
                    public ListAssociatedDatabasesResponse apply(
                            ListAssociatedDatabasesRequest request) {
                        return client.listAssociatedDatabases(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link com.oracle.bmc.databasemanagement.model.AssociatedDatabaseSummary} objects
     * contained in responses from the listAssociatedDatabases operation. This iterable will fetch more data from the
     * server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link com.oracle.bmc.databasemanagement.model.AssociatedDatabaseSummary} objects
     * contained in responses received from the service.
     */
    public Iterable<com.oracle.bmc.databasemanagement.model.AssociatedDatabaseSummary>
            listAssociatedDatabasesRecordIterator(final ListAssociatedDatabasesRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListAssociatedDatabasesRequest.Builder, ListAssociatedDatabasesRequest,
                ListAssociatedDatabasesResponse,
                com.oracle.bmc.databasemanagement.model.AssociatedDatabaseSummary>(
                new java.util.function.Supplier<ListAssociatedDatabasesRequest.Builder>() {
                    @Override
                    public ListAssociatedDatabasesRequest.Builder get() {
                        return ListAssociatedDatabasesRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListAssociatedDatabasesResponse, String>() {
                    @Override
                    public String apply(ListAssociatedDatabasesResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListAssociatedDatabasesRequest.Builder>,
                        ListAssociatedDatabasesRequest>() {
                    @Override
                    public ListAssociatedDatabasesRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListAssociatedDatabasesRequest.Builder>
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
                        ListAssociatedDatabasesRequest, ListAssociatedDatabasesResponse>() {
                    @Override
                    public ListAssociatedDatabasesResponse apply(
                            ListAssociatedDatabasesRequest request) {
                        return client.listAssociatedDatabases(request);
                    }
                },
                new java.util.function.Function<
                        ListAssociatedDatabasesResponse,
                        java.util.List<
                                com.oracle.bmc.databasemanagement.model
                                        .AssociatedDatabaseSummary>>() {
                    @Override
                    public java.util.List<
                                    com.oracle.bmc.databasemanagement.model
                                            .AssociatedDatabaseSummary>
                            apply(ListAssociatedDatabasesResponse response) {
                        return response.getAssociatedDatabaseCollection().getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the listConsumerGroupPrivileges operation. This iterable
     * will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses received from the service.
     */
    public Iterable<ListConsumerGroupPrivilegesResponse>
            listConsumerGroupPrivilegesResponseIterator(
                    final ListConsumerGroupPrivilegesRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListConsumerGroupPrivilegesRequest.Builder, ListConsumerGroupPrivilegesRequest,
                ListConsumerGroupPrivilegesResponse>(
                new java.util.function.Supplier<ListConsumerGroupPrivilegesRequest.Builder>() {
                    @Override
                    public ListConsumerGroupPrivilegesRequest.Builder get() {
                        return ListConsumerGroupPrivilegesRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListConsumerGroupPrivilegesResponse, String>() {
                    @Override
                    public String apply(ListConsumerGroupPrivilegesResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListConsumerGroupPrivilegesRequest.Builder>,
                        ListConsumerGroupPrivilegesRequest>() {
                    @Override
                    public ListConsumerGroupPrivilegesRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListConsumerGroupPrivilegesRequest.Builder>
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
                        ListConsumerGroupPrivilegesRequest, ListConsumerGroupPrivilegesResponse>() {
                    @Override
                    public ListConsumerGroupPrivilegesResponse apply(
                            ListConsumerGroupPrivilegesRequest request) {
                        return client.listConsumerGroupPrivileges(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link com.oracle.bmc.databasemanagement.model.ConsumerGroupPrivilegeSummary} objects
     * contained in responses from the listConsumerGroupPrivileges operation. This iterable will fetch more data from the
     * server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link com.oracle.bmc.databasemanagement.model.ConsumerGroupPrivilegeSummary} objects
     * contained in responses received from the service.
     */
    public Iterable<com.oracle.bmc.databasemanagement.model.ConsumerGroupPrivilegeSummary>
            listConsumerGroupPrivilegesRecordIterator(
                    final ListConsumerGroupPrivilegesRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListConsumerGroupPrivilegesRequest.Builder, ListConsumerGroupPrivilegesRequest,
                ListConsumerGroupPrivilegesResponse,
                com.oracle.bmc.databasemanagement.model.ConsumerGroupPrivilegeSummary>(
                new java.util.function.Supplier<ListConsumerGroupPrivilegesRequest.Builder>() {
                    @Override
                    public ListConsumerGroupPrivilegesRequest.Builder get() {
                        return ListConsumerGroupPrivilegesRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListConsumerGroupPrivilegesResponse, String>() {
                    @Override
                    public String apply(ListConsumerGroupPrivilegesResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListConsumerGroupPrivilegesRequest.Builder>,
                        ListConsumerGroupPrivilegesRequest>() {
                    @Override
                    public ListConsumerGroupPrivilegesRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListConsumerGroupPrivilegesRequest.Builder>
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
                        ListConsumerGroupPrivilegesRequest, ListConsumerGroupPrivilegesResponse>() {
                    @Override
                    public ListConsumerGroupPrivilegesResponse apply(
                            ListConsumerGroupPrivilegesRequest request) {
                        return client.listConsumerGroupPrivileges(request);
                    }
                },
                new java.util.function.Function<
                        ListConsumerGroupPrivilegesResponse,
                        java.util.List<
                                com.oracle.bmc.databasemanagement.model
                                        .ConsumerGroupPrivilegeSummary>>() {
                    @Override
                    public java.util.List<
                                    com.oracle.bmc.databasemanagement.model
                                            .ConsumerGroupPrivilegeSummary>
                            apply(ListConsumerGroupPrivilegesResponse response) {
                        return response.getConsumerGroupPrivilegeCollection().getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the listDataAccessContainers operation. This iterable
     * will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses received from the service.
     */
    public Iterable<ListDataAccessContainersResponse> listDataAccessContainersResponseIterator(
            final ListDataAccessContainersRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListDataAccessContainersRequest.Builder, ListDataAccessContainersRequest,
                ListDataAccessContainersResponse>(
                new java.util.function.Supplier<ListDataAccessContainersRequest.Builder>() {
                    @Override
                    public ListDataAccessContainersRequest.Builder get() {
                        return ListDataAccessContainersRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListDataAccessContainersResponse, String>() {
                    @Override
                    public String apply(ListDataAccessContainersResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListDataAccessContainersRequest.Builder>,
                        ListDataAccessContainersRequest>() {
                    @Override
                    public ListDataAccessContainersRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListDataAccessContainersRequest.Builder>
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
                        ListDataAccessContainersRequest, ListDataAccessContainersResponse>() {
                    @Override
                    public ListDataAccessContainersResponse apply(
                            ListDataAccessContainersRequest request) {
                        return client.listDataAccessContainers(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link com.oracle.bmc.databasemanagement.model.DataAccessContainerSummary} objects
     * contained in responses from the listDataAccessContainers operation. This iterable will fetch more data from the
     * server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link com.oracle.bmc.databasemanagement.model.DataAccessContainerSummary} objects
     * contained in responses received from the service.
     */
    public Iterable<com.oracle.bmc.databasemanagement.model.DataAccessContainerSummary>
            listDataAccessContainersRecordIterator(final ListDataAccessContainersRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListDataAccessContainersRequest.Builder, ListDataAccessContainersRequest,
                ListDataAccessContainersResponse,
                com.oracle.bmc.databasemanagement.model.DataAccessContainerSummary>(
                new java.util.function.Supplier<ListDataAccessContainersRequest.Builder>() {
                    @Override
                    public ListDataAccessContainersRequest.Builder get() {
                        return ListDataAccessContainersRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListDataAccessContainersResponse, String>() {
                    @Override
                    public String apply(ListDataAccessContainersResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListDataAccessContainersRequest.Builder>,
                        ListDataAccessContainersRequest>() {
                    @Override
                    public ListDataAccessContainersRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListDataAccessContainersRequest.Builder>
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
                        ListDataAccessContainersRequest, ListDataAccessContainersResponse>() {
                    @Override
                    public ListDataAccessContainersResponse apply(
                            ListDataAccessContainersRequest request) {
                        return client.listDataAccessContainers(request);
                    }
                },
                new java.util.function.Function<
                        ListDataAccessContainersResponse,
                        java.util.List<
                                com.oracle.bmc.databasemanagement.model
                                        .DataAccessContainerSummary>>() {
                    @Override
                    public java.util.List<
                                    com.oracle.bmc.databasemanagement.model
                                            .DataAccessContainerSummary>
                            apply(ListDataAccessContainersResponse response) {
                        return response.getDataAccessContainerCollection().getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the listDbManagementPrivateEndpoints operation. This iterable
     * will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses received from the service.
     */
    public Iterable<ListDbManagementPrivateEndpointsResponse>
            listDbManagementPrivateEndpointsResponseIterator(
                    final ListDbManagementPrivateEndpointsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListDbManagementPrivateEndpointsRequest.Builder,
                ListDbManagementPrivateEndpointsRequest, ListDbManagementPrivateEndpointsResponse>(
                new java.util.function.Supplier<ListDbManagementPrivateEndpointsRequest.Builder>() {
                    @Override
                    public ListDbManagementPrivateEndpointsRequest.Builder get() {
                        return ListDbManagementPrivateEndpointsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<
                        ListDbManagementPrivateEndpointsResponse, String>() {
                    @Override
                    public String apply(ListDbManagementPrivateEndpointsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListDbManagementPrivateEndpointsRequest.Builder>,
                        ListDbManagementPrivateEndpointsRequest>() {
                    @Override
                    public ListDbManagementPrivateEndpointsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListDbManagementPrivateEndpointsRequest.Builder>
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
                        ListDbManagementPrivateEndpointsRequest,
                        ListDbManagementPrivateEndpointsResponse>() {
                    @Override
                    public ListDbManagementPrivateEndpointsResponse apply(
                            ListDbManagementPrivateEndpointsRequest request) {
                        return client.listDbManagementPrivateEndpoints(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link com.oracle.bmc.databasemanagement.model.DbManagementPrivateEndpointSummary} objects
     * contained in responses from the listDbManagementPrivateEndpoints operation. This iterable will fetch more data from the
     * server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link com.oracle.bmc.databasemanagement.model.DbManagementPrivateEndpointSummary} objects
     * contained in responses received from the service.
     */
    public Iterable<com.oracle.bmc.databasemanagement.model.DbManagementPrivateEndpointSummary>
            listDbManagementPrivateEndpointsRecordIterator(
                    final ListDbManagementPrivateEndpointsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListDbManagementPrivateEndpointsRequest.Builder,
                ListDbManagementPrivateEndpointsRequest, ListDbManagementPrivateEndpointsResponse,
                com.oracle.bmc.databasemanagement.model.DbManagementPrivateEndpointSummary>(
                new java.util.function.Supplier<ListDbManagementPrivateEndpointsRequest.Builder>() {
                    @Override
                    public ListDbManagementPrivateEndpointsRequest.Builder get() {
                        return ListDbManagementPrivateEndpointsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<
                        ListDbManagementPrivateEndpointsResponse, String>() {
                    @Override
                    public String apply(ListDbManagementPrivateEndpointsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListDbManagementPrivateEndpointsRequest.Builder>,
                        ListDbManagementPrivateEndpointsRequest>() {
                    @Override
                    public ListDbManagementPrivateEndpointsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListDbManagementPrivateEndpointsRequest.Builder>
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
                        ListDbManagementPrivateEndpointsRequest,
                        ListDbManagementPrivateEndpointsResponse>() {
                    @Override
                    public ListDbManagementPrivateEndpointsResponse apply(
                            ListDbManagementPrivateEndpointsRequest request) {
                        return client.listDbManagementPrivateEndpoints(request);
                    }
                },
                new java.util.function.Function<
                        ListDbManagementPrivateEndpointsResponse,
                        java.util.List<
                                com.oracle.bmc.databasemanagement.model
                                        .DbManagementPrivateEndpointSummary>>() {
                    @Override
                    public java.util.List<
                                    com.oracle.bmc.databasemanagement.model
                                            .DbManagementPrivateEndpointSummary>
                            apply(ListDbManagementPrivateEndpointsResponse response) {
                        return response.getDbManagementPrivateEndpointCollection().getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the listJobExecutions operation. This iterable
     * will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses received from the service.
     */
    public Iterable<ListJobExecutionsResponse> listJobExecutionsResponseIterator(
            final ListJobExecutionsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListJobExecutionsRequest.Builder, ListJobExecutionsRequest,
                ListJobExecutionsResponse>(
                new java.util.function.Supplier<ListJobExecutionsRequest.Builder>() {
                    @Override
                    public ListJobExecutionsRequest.Builder get() {
                        return ListJobExecutionsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListJobExecutionsResponse, String>() {
                    @Override
                    public String apply(ListJobExecutionsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListJobExecutionsRequest.Builder>,
                        ListJobExecutionsRequest>() {
                    @Override
                    public ListJobExecutionsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListJobExecutionsRequest.Builder>
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
                        ListJobExecutionsRequest, ListJobExecutionsResponse>() {
                    @Override
                    public ListJobExecutionsResponse apply(ListJobExecutionsRequest request) {
                        return client.listJobExecutions(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link com.oracle.bmc.databasemanagement.model.JobExecutionSummary} objects
     * contained in responses from the listJobExecutions operation. This iterable will fetch more data from the
     * server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link com.oracle.bmc.databasemanagement.model.JobExecutionSummary} objects
     * contained in responses received from the service.
     */
    public Iterable<com.oracle.bmc.databasemanagement.model.JobExecutionSummary>
            listJobExecutionsRecordIterator(final ListJobExecutionsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListJobExecutionsRequest.Builder, ListJobExecutionsRequest,
                ListJobExecutionsResponse,
                com.oracle.bmc.databasemanagement.model.JobExecutionSummary>(
                new java.util.function.Supplier<ListJobExecutionsRequest.Builder>() {
                    @Override
                    public ListJobExecutionsRequest.Builder get() {
                        return ListJobExecutionsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListJobExecutionsResponse, String>() {
                    @Override
                    public String apply(ListJobExecutionsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListJobExecutionsRequest.Builder>,
                        ListJobExecutionsRequest>() {
                    @Override
                    public ListJobExecutionsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListJobExecutionsRequest.Builder>
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
                        ListJobExecutionsRequest, ListJobExecutionsResponse>() {
                    @Override
                    public ListJobExecutionsResponse apply(ListJobExecutionsRequest request) {
                        return client.listJobExecutions(request);
                    }
                },
                new java.util.function.Function<
                        ListJobExecutionsResponse,
                        java.util.List<
                                com.oracle.bmc.databasemanagement.model.JobExecutionSummary>>() {
                    @Override
                    public java.util.List<
                                    com.oracle.bmc.databasemanagement.model.JobExecutionSummary>
                            apply(ListJobExecutionsResponse response) {
                        return response.getJobExecutionCollection().getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the listJobRuns operation. This iterable
     * will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses received from the service.
     */
    public Iterable<ListJobRunsResponse> listJobRunsResponseIterator(
            final ListJobRunsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListJobRunsRequest.Builder, ListJobRunsRequest, ListJobRunsResponse>(
                new java.util.function.Supplier<ListJobRunsRequest.Builder>() {
                    @Override
                    public ListJobRunsRequest.Builder get() {
                        return ListJobRunsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListJobRunsResponse, String>() {
                    @Override
                    public String apply(ListJobRunsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListJobRunsRequest.Builder>,
                        ListJobRunsRequest>() {
                    @Override
                    public ListJobRunsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListJobRunsRequest.Builder>
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
                new java.util.function.Function<ListJobRunsRequest, ListJobRunsResponse>() {
                    @Override
                    public ListJobRunsResponse apply(ListJobRunsRequest request) {
                        return client.listJobRuns(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link com.oracle.bmc.databasemanagement.model.JobRunSummary} objects
     * contained in responses from the listJobRuns operation. This iterable will fetch more data from the
     * server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link com.oracle.bmc.databasemanagement.model.JobRunSummary} objects
     * contained in responses received from the service.
     */
    public Iterable<com.oracle.bmc.databasemanagement.model.JobRunSummary>
            listJobRunsRecordIterator(final ListJobRunsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListJobRunsRequest.Builder, ListJobRunsRequest, ListJobRunsResponse,
                com.oracle.bmc.databasemanagement.model.JobRunSummary>(
                new java.util.function.Supplier<ListJobRunsRequest.Builder>() {
                    @Override
                    public ListJobRunsRequest.Builder get() {
                        return ListJobRunsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListJobRunsResponse, String>() {
                    @Override
                    public String apply(ListJobRunsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListJobRunsRequest.Builder>,
                        ListJobRunsRequest>() {
                    @Override
                    public ListJobRunsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListJobRunsRequest.Builder>
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
                new java.util.function.Function<ListJobRunsRequest, ListJobRunsResponse>() {
                    @Override
                    public ListJobRunsResponse apply(ListJobRunsRequest request) {
                        return client.listJobRuns(request);
                    }
                },
                new java.util.function.Function<
                        ListJobRunsResponse,
                        java.util.List<com.oracle.bmc.databasemanagement.model.JobRunSummary>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.databasemanagement.model.JobRunSummary>
                            apply(ListJobRunsResponse response) {
                        return response.getJobRunCollection().getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the listJobs operation. This iterable
     * will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses received from the service.
     */
    public Iterable<ListJobsResponse> listJobsResponseIterator(final ListJobsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListJobsRequest.Builder, ListJobsRequest, ListJobsResponse>(
                new java.util.function.Supplier<ListJobsRequest.Builder>() {
                    @Override
                    public ListJobsRequest.Builder get() {
                        return ListJobsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListJobsResponse, String>() {
                    @Override
                    public String apply(ListJobsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListJobsRequest.Builder>,
                        ListJobsRequest>() {
                    @Override
                    public ListJobsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListJobsRequest.Builder>
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
                new java.util.function.Function<ListJobsRequest, ListJobsResponse>() {
                    @Override
                    public ListJobsResponse apply(ListJobsRequest request) {
                        return client.listJobs(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link com.oracle.bmc.databasemanagement.model.JobSummary} objects
     * contained in responses from the listJobs operation. This iterable will fetch more data from the
     * server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link com.oracle.bmc.databasemanagement.model.JobSummary} objects
     * contained in responses received from the service.
     */
    public Iterable<com.oracle.bmc.databasemanagement.model.JobSummary> listJobsRecordIterator(
            final ListJobsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListJobsRequest.Builder, ListJobsRequest, ListJobsResponse,
                com.oracle.bmc.databasemanagement.model.JobSummary>(
                new java.util.function.Supplier<ListJobsRequest.Builder>() {
                    @Override
                    public ListJobsRequest.Builder get() {
                        return ListJobsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListJobsResponse, String>() {
                    @Override
                    public String apply(ListJobsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListJobsRequest.Builder>,
                        ListJobsRequest>() {
                    @Override
                    public ListJobsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListJobsRequest.Builder>
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
                new java.util.function.Function<ListJobsRequest, ListJobsResponse>() {
                    @Override
                    public ListJobsResponse apply(ListJobsRequest request) {
                        return client.listJobs(request);
                    }
                },
                new java.util.function.Function<
                        ListJobsResponse,
                        java.util.List<com.oracle.bmc.databasemanagement.model.JobSummary>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.databasemanagement.model.JobSummary> apply(
                            ListJobsResponse response) {
                        return response.getJobCollection().getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the listManagedDatabaseGroups operation. This iterable
     * will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses received from the service.
     */
    public Iterable<ListManagedDatabaseGroupsResponse> listManagedDatabaseGroupsResponseIterator(
            final ListManagedDatabaseGroupsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListManagedDatabaseGroupsRequest.Builder, ListManagedDatabaseGroupsRequest,
                ListManagedDatabaseGroupsResponse>(
                new java.util.function.Supplier<ListManagedDatabaseGroupsRequest.Builder>() {
                    @Override
                    public ListManagedDatabaseGroupsRequest.Builder get() {
                        return ListManagedDatabaseGroupsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListManagedDatabaseGroupsResponse, String>() {
                    @Override
                    public String apply(ListManagedDatabaseGroupsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListManagedDatabaseGroupsRequest.Builder>,
                        ListManagedDatabaseGroupsRequest>() {
                    @Override
                    public ListManagedDatabaseGroupsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListManagedDatabaseGroupsRequest.Builder>
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
                        ListManagedDatabaseGroupsRequest, ListManagedDatabaseGroupsResponse>() {
                    @Override
                    public ListManagedDatabaseGroupsResponse apply(
                            ListManagedDatabaseGroupsRequest request) {
                        return client.listManagedDatabaseGroups(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link com.oracle.bmc.databasemanagement.model.ManagedDatabaseGroupSummary} objects
     * contained in responses from the listManagedDatabaseGroups operation. This iterable will fetch more data from the
     * server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link com.oracle.bmc.databasemanagement.model.ManagedDatabaseGroupSummary} objects
     * contained in responses received from the service.
     */
    public Iterable<com.oracle.bmc.databasemanagement.model.ManagedDatabaseGroupSummary>
            listManagedDatabaseGroupsRecordIterator(
                    final ListManagedDatabaseGroupsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListManagedDatabaseGroupsRequest.Builder, ListManagedDatabaseGroupsRequest,
                ListManagedDatabaseGroupsResponse,
                com.oracle.bmc.databasemanagement.model.ManagedDatabaseGroupSummary>(
                new java.util.function.Supplier<ListManagedDatabaseGroupsRequest.Builder>() {
                    @Override
                    public ListManagedDatabaseGroupsRequest.Builder get() {
                        return ListManagedDatabaseGroupsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListManagedDatabaseGroupsResponse, String>() {
                    @Override
                    public String apply(ListManagedDatabaseGroupsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListManagedDatabaseGroupsRequest.Builder>,
                        ListManagedDatabaseGroupsRequest>() {
                    @Override
                    public ListManagedDatabaseGroupsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListManagedDatabaseGroupsRequest.Builder>
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
                        ListManagedDatabaseGroupsRequest, ListManagedDatabaseGroupsResponse>() {
                    @Override
                    public ListManagedDatabaseGroupsResponse apply(
                            ListManagedDatabaseGroupsRequest request) {
                        return client.listManagedDatabaseGroups(request);
                    }
                },
                new java.util.function.Function<
                        ListManagedDatabaseGroupsResponse,
                        java.util.List<
                                com.oracle.bmc.databasemanagement.model
                                        .ManagedDatabaseGroupSummary>>() {
                    @Override
                    public java.util.List<
                                    com.oracle.bmc.databasemanagement.model
                                            .ManagedDatabaseGroupSummary>
                            apply(ListManagedDatabaseGroupsResponse response) {
                        return response.getManagedDatabaseGroupCollection().getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the listManagedDatabases operation. This iterable
     * will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses received from the service.
     */
    public Iterable<ListManagedDatabasesResponse> listManagedDatabasesResponseIterator(
            final ListManagedDatabasesRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListManagedDatabasesRequest.Builder, ListManagedDatabasesRequest,
                ListManagedDatabasesResponse>(
                new java.util.function.Supplier<ListManagedDatabasesRequest.Builder>() {
                    @Override
                    public ListManagedDatabasesRequest.Builder get() {
                        return ListManagedDatabasesRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListManagedDatabasesResponse, String>() {
                    @Override
                    public String apply(ListManagedDatabasesResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListManagedDatabasesRequest.Builder>,
                        ListManagedDatabasesRequest>() {
                    @Override
                    public ListManagedDatabasesRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListManagedDatabasesRequest.Builder>
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
                        ListManagedDatabasesRequest, ListManagedDatabasesResponse>() {
                    @Override
                    public ListManagedDatabasesResponse apply(ListManagedDatabasesRequest request) {
                        return client.listManagedDatabases(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link com.oracle.bmc.databasemanagement.model.ManagedDatabaseSummary} objects
     * contained in responses from the listManagedDatabases operation. This iterable will fetch more data from the
     * server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link com.oracle.bmc.databasemanagement.model.ManagedDatabaseSummary} objects
     * contained in responses received from the service.
     */
    public Iterable<com.oracle.bmc.databasemanagement.model.ManagedDatabaseSummary>
            listManagedDatabasesRecordIterator(final ListManagedDatabasesRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListManagedDatabasesRequest.Builder, ListManagedDatabasesRequest,
                ListManagedDatabasesResponse,
                com.oracle.bmc.databasemanagement.model.ManagedDatabaseSummary>(
                new java.util.function.Supplier<ListManagedDatabasesRequest.Builder>() {
                    @Override
                    public ListManagedDatabasesRequest.Builder get() {
                        return ListManagedDatabasesRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListManagedDatabasesResponse, String>() {
                    @Override
                    public String apply(ListManagedDatabasesResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListManagedDatabasesRequest.Builder>,
                        ListManagedDatabasesRequest>() {
                    @Override
                    public ListManagedDatabasesRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListManagedDatabasesRequest.Builder>
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
                        ListManagedDatabasesRequest, ListManagedDatabasesResponse>() {
                    @Override
                    public ListManagedDatabasesResponse apply(ListManagedDatabasesRequest request) {
                        return client.listManagedDatabases(request);
                    }
                },
                new java.util.function.Function<
                        ListManagedDatabasesResponse,
                        java.util.List<
                                com.oracle.bmc.databasemanagement.model.ManagedDatabaseSummary>>() {
                    @Override
                    public java.util.List<
                                    com.oracle.bmc.databasemanagement.model.ManagedDatabaseSummary>
                            apply(ListManagedDatabasesResponse response) {
                        return response.getManagedDatabaseCollection().getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the listObjectPrivileges operation. This iterable
     * will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses received from the service.
     */
    public Iterable<ListObjectPrivilegesResponse> listObjectPrivilegesResponseIterator(
            final ListObjectPrivilegesRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListObjectPrivilegesRequest.Builder, ListObjectPrivilegesRequest,
                ListObjectPrivilegesResponse>(
                new java.util.function.Supplier<ListObjectPrivilegesRequest.Builder>() {
                    @Override
                    public ListObjectPrivilegesRequest.Builder get() {
                        return ListObjectPrivilegesRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListObjectPrivilegesResponse, String>() {
                    @Override
                    public String apply(ListObjectPrivilegesResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListObjectPrivilegesRequest.Builder>,
                        ListObjectPrivilegesRequest>() {
                    @Override
                    public ListObjectPrivilegesRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListObjectPrivilegesRequest.Builder>
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
                        ListObjectPrivilegesRequest, ListObjectPrivilegesResponse>() {
                    @Override
                    public ListObjectPrivilegesResponse apply(ListObjectPrivilegesRequest request) {
                        return client.listObjectPrivileges(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link com.oracle.bmc.databasemanagement.model.ObjectPrivilegeSummary} objects
     * contained in responses from the listObjectPrivileges operation. This iterable will fetch more data from the
     * server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link com.oracle.bmc.databasemanagement.model.ObjectPrivilegeSummary} objects
     * contained in responses received from the service.
     */
    public Iterable<com.oracle.bmc.databasemanagement.model.ObjectPrivilegeSummary>
            listObjectPrivilegesRecordIterator(final ListObjectPrivilegesRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListObjectPrivilegesRequest.Builder, ListObjectPrivilegesRequest,
                ListObjectPrivilegesResponse,
                com.oracle.bmc.databasemanagement.model.ObjectPrivilegeSummary>(
                new java.util.function.Supplier<ListObjectPrivilegesRequest.Builder>() {
                    @Override
                    public ListObjectPrivilegesRequest.Builder get() {
                        return ListObjectPrivilegesRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListObjectPrivilegesResponse, String>() {
                    @Override
                    public String apply(ListObjectPrivilegesResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListObjectPrivilegesRequest.Builder>,
                        ListObjectPrivilegesRequest>() {
                    @Override
                    public ListObjectPrivilegesRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListObjectPrivilegesRequest.Builder>
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
                        ListObjectPrivilegesRequest, ListObjectPrivilegesResponse>() {
                    @Override
                    public ListObjectPrivilegesResponse apply(ListObjectPrivilegesRequest request) {
                        return client.listObjectPrivileges(request);
                    }
                },
                new java.util.function.Function<
                        ListObjectPrivilegesResponse,
                        java.util.List<
                                com.oracle.bmc.databasemanagement.model.ObjectPrivilegeSummary>>() {
                    @Override
                    public java.util.List<
                                    com.oracle.bmc.databasemanagement.model.ObjectPrivilegeSummary>
                            apply(ListObjectPrivilegesResponse response) {
                        return response.getObjectPrivilegeCollection().getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the listOptimizerStatisticsCollectionAggregations operation. This iterable
     * will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses received from the service.
     */
    public Iterable<ListOptimizerStatisticsCollectionAggregationsResponse>
            listOptimizerStatisticsCollectionAggregationsResponseIterator(
                    final ListOptimizerStatisticsCollectionAggregationsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListOptimizerStatisticsCollectionAggregationsRequest.Builder,
                ListOptimizerStatisticsCollectionAggregationsRequest,
                ListOptimizerStatisticsCollectionAggregationsResponse>(
                new java.util.function.Supplier<
                        ListOptimizerStatisticsCollectionAggregationsRequest.Builder>() {
                    @Override
                    public ListOptimizerStatisticsCollectionAggregationsRequest.Builder get() {
                        return ListOptimizerStatisticsCollectionAggregationsRequest.builder()
                                .copy(request);
                    }
                },
                new java.util.function.Function<
                        ListOptimizerStatisticsCollectionAggregationsResponse, String>() {
                    @Override
                    public String apply(
                            ListOptimizerStatisticsCollectionAggregationsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListOptimizerStatisticsCollectionAggregationsRequest.Builder>,
                        ListOptimizerStatisticsCollectionAggregationsRequest>() {
                    @Override
                    public ListOptimizerStatisticsCollectionAggregationsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListOptimizerStatisticsCollectionAggregationsRequest
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
                        ListOptimizerStatisticsCollectionAggregationsRequest,
                        ListOptimizerStatisticsCollectionAggregationsResponse>() {
                    @Override
                    public ListOptimizerStatisticsCollectionAggregationsResponse apply(
                            ListOptimizerStatisticsCollectionAggregationsRequest request) {
                        return client.listOptimizerStatisticsCollectionAggregations(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link com.oracle.bmc.databasemanagement.model.OptimizerStatisticsCollectionAggregationSummary} objects
     * contained in responses from the listOptimizerStatisticsCollectionAggregations operation. This iterable will fetch more data from the
     * server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link com.oracle.bmc.databasemanagement.model.OptimizerStatisticsCollectionAggregationSummary} objects
     * contained in responses received from the service.
     */
    public Iterable<
                    com.oracle.bmc.databasemanagement.model
                            .OptimizerStatisticsCollectionAggregationSummary>
            listOptimizerStatisticsCollectionAggregationsRecordIterator(
                    final ListOptimizerStatisticsCollectionAggregationsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListOptimizerStatisticsCollectionAggregationsRequest.Builder,
                ListOptimizerStatisticsCollectionAggregationsRequest,
                ListOptimizerStatisticsCollectionAggregationsResponse,
                com.oracle.bmc.databasemanagement.model
                        .OptimizerStatisticsCollectionAggregationSummary>(
                new java.util.function.Supplier<
                        ListOptimizerStatisticsCollectionAggregationsRequest.Builder>() {
                    @Override
                    public ListOptimizerStatisticsCollectionAggregationsRequest.Builder get() {
                        return ListOptimizerStatisticsCollectionAggregationsRequest.builder()
                                .copy(request);
                    }
                },
                new java.util.function.Function<
                        ListOptimizerStatisticsCollectionAggregationsResponse, String>() {
                    @Override
                    public String apply(
                            ListOptimizerStatisticsCollectionAggregationsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListOptimizerStatisticsCollectionAggregationsRequest.Builder>,
                        ListOptimizerStatisticsCollectionAggregationsRequest>() {
                    @Override
                    public ListOptimizerStatisticsCollectionAggregationsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListOptimizerStatisticsCollectionAggregationsRequest
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
                        ListOptimizerStatisticsCollectionAggregationsRequest,
                        ListOptimizerStatisticsCollectionAggregationsResponse>() {
                    @Override
                    public ListOptimizerStatisticsCollectionAggregationsResponse apply(
                            ListOptimizerStatisticsCollectionAggregationsRequest request) {
                        return client.listOptimizerStatisticsCollectionAggregations(request);
                    }
                },
                new java.util.function.Function<
                        ListOptimizerStatisticsCollectionAggregationsResponse,
                        java.util.List<
                                com.oracle.bmc.databasemanagement.model
                                        .OptimizerStatisticsCollectionAggregationSummary>>() {
                    @Override
                    public java.util.List<
                                    com.oracle.bmc.databasemanagement.model
                                            .OptimizerStatisticsCollectionAggregationSummary>
                            apply(ListOptimizerStatisticsCollectionAggregationsResponse response) {
                        return response.getOptimizerStatisticsCollectionAggregationsCollection()
                                .getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the listOptimizerStatisticsCollectionOperations operation. This iterable
     * will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses received from the service.
     */
    public Iterable<ListOptimizerStatisticsCollectionOperationsResponse>
            listOptimizerStatisticsCollectionOperationsResponseIterator(
                    final ListOptimizerStatisticsCollectionOperationsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListOptimizerStatisticsCollectionOperationsRequest.Builder,
                ListOptimizerStatisticsCollectionOperationsRequest,
                ListOptimizerStatisticsCollectionOperationsResponse>(
                new java.util.function.Supplier<
                        ListOptimizerStatisticsCollectionOperationsRequest.Builder>() {
                    @Override
                    public ListOptimizerStatisticsCollectionOperationsRequest.Builder get() {
                        return ListOptimizerStatisticsCollectionOperationsRequest.builder()
                                .copy(request);
                    }
                },
                new java.util.function.Function<
                        ListOptimizerStatisticsCollectionOperationsResponse, String>() {
                    @Override
                    public String apply(
                            ListOptimizerStatisticsCollectionOperationsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListOptimizerStatisticsCollectionOperationsRequest.Builder>,
                        ListOptimizerStatisticsCollectionOperationsRequest>() {
                    @Override
                    public ListOptimizerStatisticsCollectionOperationsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListOptimizerStatisticsCollectionOperationsRequest
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
                        ListOptimizerStatisticsCollectionOperationsRequest,
                        ListOptimizerStatisticsCollectionOperationsResponse>() {
                    @Override
                    public ListOptimizerStatisticsCollectionOperationsResponse apply(
                            ListOptimizerStatisticsCollectionOperationsRequest request) {
                        return client.listOptimizerStatisticsCollectionOperations(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link com.oracle.bmc.databasemanagement.model.OptimizerStatisticsCollectionOperationSummary} objects
     * contained in responses from the listOptimizerStatisticsCollectionOperations operation. This iterable will fetch more data from the
     * server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link com.oracle.bmc.databasemanagement.model.OptimizerStatisticsCollectionOperationSummary} objects
     * contained in responses received from the service.
     */
    public Iterable<
                    com.oracle.bmc.databasemanagement.model
                            .OptimizerStatisticsCollectionOperationSummary>
            listOptimizerStatisticsCollectionOperationsRecordIterator(
                    final ListOptimizerStatisticsCollectionOperationsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListOptimizerStatisticsCollectionOperationsRequest.Builder,
                ListOptimizerStatisticsCollectionOperationsRequest,
                ListOptimizerStatisticsCollectionOperationsResponse,
                com.oracle.bmc.databasemanagement.model
                        .OptimizerStatisticsCollectionOperationSummary>(
                new java.util.function.Supplier<
                        ListOptimizerStatisticsCollectionOperationsRequest.Builder>() {
                    @Override
                    public ListOptimizerStatisticsCollectionOperationsRequest.Builder get() {
                        return ListOptimizerStatisticsCollectionOperationsRequest.builder()
                                .copy(request);
                    }
                },
                new java.util.function.Function<
                        ListOptimizerStatisticsCollectionOperationsResponse, String>() {
                    @Override
                    public String apply(
                            ListOptimizerStatisticsCollectionOperationsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListOptimizerStatisticsCollectionOperationsRequest.Builder>,
                        ListOptimizerStatisticsCollectionOperationsRequest>() {
                    @Override
                    public ListOptimizerStatisticsCollectionOperationsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListOptimizerStatisticsCollectionOperationsRequest
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
                        ListOptimizerStatisticsCollectionOperationsRequest,
                        ListOptimizerStatisticsCollectionOperationsResponse>() {
                    @Override
                    public ListOptimizerStatisticsCollectionOperationsResponse apply(
                            ListOptimizerStatisticsCollectionOperationsRequest request) {
                        return client.listOptimizerStatisticsCollectionOperations(request);
                    }
                },
                new java.util.function.Function<
                        ListOptimizerStatisticsCollectionOperationsResponse,
                        java.util.List<
                                com.oracle.bmc.databasemanagement.model
                                        .OptimizerStatisticsCollectionOperationSummary>>() {
                    @Override
                    public java.util.List<
                                    com.oracle.bmc.databasemanagement.model
                                            .OptimizerStatisticsCollectionOperationSummary>
                            apply(ListOptimizerStatisticsCollectionOperationsResponse response) {
                        return response.getOptimizerStatisticsCollectionOperationsCollection()
                                .getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the listProxiedForUsers operation. This iterable
     * will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses received from the service.
     */
    public Iterable<ListProxiedForUsersResponse> listProxiedForUsersResponseIterator(
            final ListProxiedForUsersRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListProxiedForUsersRequest.Builder, ListProxiedForUsersRequest,
                ListProxiedForUsersResponse>(
                new java.util.function.Supplier<ListProxiedForUsersRequest.Builder>() {
                    @Override
                    public ListProxiedForUsersRequest.Builder get() {
                        return ListProxiedForUsersRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListProxiedForUsersResponse, String>() {
                    @Override
                    public String apply(ListProxiedForUsersResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListProxiedForUsersRequest.Builder>,
                        ListProxiedForUsersRequest>() {
                    @Override
                    public ListProxiedForUsersRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListProxiedForUsersRequest.Builder>
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
                        ListProxiedForUsersRequest, ListProxiedForUsersResponse>() {
                    @Override
                    public ListProxiedForUsersResponse apply(ListProxiedForUsersRequest request) {
                        return client.listProxiedForUsers(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link com.oracle.bmc.databasemanagement.model.ProxiedForUserSummary} objects
     * contained in responses from the listProxiedForUsers operation. This iterable will fetch more data from the
     * server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link com.oracle.bmc.databasemanagement.model.ProxiedForUserSummary} objects
     * contained in responses received from the service.
     */
    public Iterable<com.oracle.bmc.databasemanagement.model.ProxiedForUserSummary>
            listProxiedForUsersRecordIterator(final ListProxiedForUsersRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListProxiedForUsersRequest.Builder, ListProxiedForUsersRequest,
                ListProxiedForUsersResponse,
                com.oracle.bmc.databasemanagement.model.ProxiedForUserSummary>(
                new java.util.function.Supplier<ListProxiedForUsersRequest.Builder>() {
                    @Override
                    public ListProxiedForUsersRequest.Builder get() {
                        return ListProxiedForUsersRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListProxiedForUsersResponse, String>() {
                    @Override
                    public String apply(ListProxiedForUsersResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListProxiedForUsersRequest.Builder>,
                        ListProxiedForUsersRequest>() {
                    @Override
                    public ListProxiedForUsersRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListProxiedForUsersRequest.Builder>
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
                        ListProxiedForUsersRequest, ListProxiedForUsersResponse>() {
                    @Override
                    public ListProxiedForUsersResponse apply(ListProxiedForUsersRequest request) {
                        return client.listProxiedForUsers(request);
                    }
                },
                new java.util.function.Function<
                        ListProxiedForUsersResponse,
                        java.util.List<
                                com.oracle.bmc.databasemanagement.model.ProxiedForUserSummary>>() {
                    @Override
                    public java.util.List<
                                    com.oracle.bmc.databasemanagement.model.ProxiedForUserSummary>
                            apply(ListProxiedForUsersResponse response) {
                        return response.getProxiedForUserCollection().getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the listProxyUsers operation. This iterable
     * will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses received from the service.
     */
    public Iterable<ListProxyUsersResponse> listProxyUsersResponseIterator(
            final ListProxyUsersRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListProxyUsersRequest.Builder, ListProxyUsersRequest, ListProxyUsersResponse>(
                new java.util.function.Supplier<ListProxyUsersRequest.Builder>() {
                    @Override
                    public ListProxyUsersRequest.Builder get() {
                        return ListProxyUsersRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListProxyUsersResponse, String>() {
                    @Override
                    public String apply(ListProxyUsersResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListProxyUsersRequest.Builder>,
                        ListProxyUsersRequest>() {
                    @Override
                    public ListProxyUsersRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListProxyUsersRequest.Builder>
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
                new java.util.function.Function<ListProxyUsersRequest, ListProxyUsersResponse>() {
                    @Override
                    public ListProxyUsersResponse apply(ListProxyUsersRequest request) {
                        return client.listProxyUsers(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link com.oracle.bmc.databasemanagement.model.ProxyUserSummary} objects
     * contained in responses from the listProxyUsers operation. This iterable will fetch more data from the
     * server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link com.oracle.bmc.databasemanagement.model.ProxyUserSummary} objects
     * contained in responses received from the service.
     */
    public Iterable<com.oracle.bmc.databasemanagement.model.ProxyUserSummary>
            listProxyUsersRecordIterator(final ListProxyUsersRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListProxyUsersRequest.Builder, ListProxyUsersRequest, ListProxyUsersResponse,
                com.oracle.bmc.databasemanagement.model.ProxyUserSummary>(
                new java.util.function.Supplier<ListProxyUsersRequest.Builder>() {
                    @Override
                    public ListProxyUsersRequest.Builder get() {
                        return ListProxyUsersRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListProxyUsersResponse, String>() {
                    @Override
                    public String apply(ListProxyUsersResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListProxyUsersRequest.Builder>,
                        ListProxyUsersRequest>() {
                    @Override
                    public ListProxyUsersRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListProxyUsersRequest.Builder>
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
                new java.util.function.Function<ListProxyUsersRequest, ListProxyUsersResponse>() {
                    @Override
                    public ListProxyUsersResponse apply(ListProxyUsersRequest request) {
                        return client.listProxyUsers(request);
                    }
                },
                new java.util.function.Function<
                        ListProxyUsersResponse,
                        java.util.List<
                                com.oracle.bmc.databasemanagement.model.ProxyUserSummary>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.databasemanagement.model.ProxyUserSummary>
                            apply(ListProxyUsersResponse response) {
                        return response.getProxyUserCollection().getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the listRoles operation. This iterable
     * will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses received from the service.
     */
    public Iterable<ListRolesResponse> listRolesResponseIterator(final ListRolesRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListRolesRequest.Builder, ListRolesRequest, ListRolesResponse>(
                new java.util.function.Supplier<ListRolesRequest.Builder>() {
                    @Override
                    public ListRolesRequest.Builder get() {
                        return ListRolesRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListRolesResponse, String>() {
                    @Override
                    public String apply(ListRolesResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListRolesRequest.Builder>,
                        ListRolesRequest>() {
                    @Override
                    public ListRolesRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListRolesRequest.Builder>
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
                new java.util.function.Function<ListRolesRequest, ListRolesResponse>() {
                    @Override
                    public ListRolesResponse apply(ListRolesRequest request) {
                        return client.listRoles(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link com.oracle.bmc.databasemanagement.model.RoleSummary} objects
     * contained in responses from the listRoles operation. This iterable will fetch more data from the
     * server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link com.oracle.bmc.databasemanagement.model.RoleSummary} objects
     * contained in responses received from the service.
     */
    public Iterable<com.oracle.bmc.databasemanagement.model.RoleSummary> listRolesRecordIterator(
            final ListRolesRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListRolesRequest.Builder, ListRolesRequest, ListRolesResponse,
                com.oracle.bmc.databasemanagement.model.RoleSummary>(
                new java.util.function.Supplier<ListRolesRequest.Builder>() {
                    @Override
                    public ListRolesRequest.Builder get() {
                        return ListRolesRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListRolesResponse, String>() {
                    @Override
                    public String apply(ListRolesResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListRolesRequest.Builder>,
                        ListRolesRequest>() {
                    @Override
                    public ListRolesRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListRolesRequest.Builder>
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
                new java.util.function.Function<ListRolesRequest, ListRolesResponse>() {
                    @Override
                    public ListRolesResponse apply(ListRolesRequest request) {
                        return client.listRoles(request);
                    }
                },
                new java.util.function.Function<
                        ListRolesResponse,
                        java.util.List<com.oracle.bmc.databasemanagement.model.RoleSummary>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.databasemanagement.model.RoleSummary>
                            apply(ListRolesResponse response) {
                        return response.getRoleCollection().getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the listSystemPrivileges operation. This iterable
     * will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses received from the service.
     */
    public Iterable<ListSystemPrivilegesResponse> listSystemPrivilegesResponseIterator(
            final ListSystemPrivilegesRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListSystemPrivilegesRequest.Builder, ListSystemPrivilegesRequest,
                ListSystemPrivilegesResponse>(
                new java.util.function.Supplier<ListSystemPrivilegesRequest.Builder>() {
                    @Override
                    public ListSystemPrivilegesRequest.Builder get() {
                        return ListSystemPrivilegesRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListSystemPrivilegesResponse, String>() {
                    @Override
                    public String apply(ListSystemPrivilegesResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListSystemPrivilegesRequest.Builder>,
                        ListSystemPrivilegesRequest>() {
                    @Override
                    public ListSystemPrivilegesRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListSystemPrivilegesRequest.Builder>
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
                        ListSystemPrivilegesRequest, ListSystemPrivilegesResponse>() {
                    @Override
                    public ListSystemPrivilegesResponse apply(ListSystemPrivilegesRequest request) {
                        return client.listSystemPrivileges(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link com.oracle.bmc.databasemanagement.model.SystemPrivilegeSummary} objects
     * contained in responses from the listSystemPrivileges operation. This iterable will fetch more data from the
     * server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link com.oracle.bmc.databasemanagement.model.SystemPrivilegeSummary} objects
     * contained in responses received from the service.
     */
    public Iterable<com.oracle.bmc.databasemanagement.model.SystemPrivilegeSummary>
            listSystemPrivilegesRecordIterator(final ListSystemPrivilegesRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListSystemPrivilegesRequest.Builder, ListSystemPrivilegesRequest,
                ListSystemPrivilegesResponse,
                com.oracle.bmc.databasemanagement.model.SystemPrivilegeSummary>(
                new java.util.function.Supplier<ListSystemPrivilegesRequest.Builder>() {
                    @Override
                    public ListSystemPrivilegesRequest.Builder get() {
                        return ListSystemPrivilegesRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListSystemPrivilegesResponse, String>() {
                    @Override
                    public String apply(ListSystemPrivilegesResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListSystemPrivilegesRequest.Builder>,
                        ListSystemPrivilegesRequest>() {
                    @Override
                    public ListSystemPrivilegesRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListSystemPrivilegesRequest.Builder>
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
                        ListSystemPrivilegesRequest, ListSystemPrivilegesResponse>() {
                    @Override
                    public ListSystemPrivilegesResponse apply(ListSystemPrivilegesRequest request) {
                        return client.listSystemPrivileges(request);
                    }
                },
                new java.util.function.Function<
                        ListSystemPrivilegesResponse,
                        java.util.List<
                                com.oracle.bmc.databasemanagement.model.SystemPrivilegeSummary>>() {
                    @Override
                    public java.util.List<
                                    com.oracle.bmc.databasemanagement.model.SystemPrivilegeSummary>
                            apply(ListSystemPrivilegesResponse response) {
                        return response.getSystemPrivilegeCollection().getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the listTablespaces operation. This iterable
     * will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses received from the service.
     */
    public Iterable<ListTablespacesResponse> listTablespacesResponseIterator(
            final ListTablespacesRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListTablespacesRequest.Builder, ListTablespacesRequest, ListTablespacesResponse>(
                new java.util.function.Supplier<ListTablespacesRequest.Builder>() {
                    @Override
                    public ListTablespacesRequest.Builder get() {
                        return ListTablespacesRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListTablespacesResponse, String>() {
                    @Override
                    public String apply(ListTablespacesResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListTablespacesRequest.Builder>,
                        ListTablespacesRequest>() {
                    @Override
                    public ListTablespacesRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListTablespacesRequest.Builder>
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
                new java.util.function.Function<ListTablespacesRequest, ListTablespacesResponse>() {
                    @Override
                    public ListTablespacesResponse apply(ListTablespacesRequest request) {
                        return client.listTablespaces(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link com.oracle.bmc.databasemanagement.model.TablespaceSummary} objects
     * contained in responses from the listTablespaces operation. This iterable will fetch more data from the
     * server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link com.oracle.bmc.databasemanagement.model.TablespaceSummary} objects
     * contained in responses received from the service.
     */
    public Iterable<com.oracle.bmc.databasemanagement.model.TablespaceSummary>
            listTablespacesRecordIterator(final ListTablespacesRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListTablespacesRequest.Builder, ListTablespacesRequest, ListTablespacesResponse,
                com.oracle.bmc.databasemanagement.model.TablespaceSummary>(
                new java.util.function.Supplier<ListTablespacesRequest.Builder>() {
                    @Override
                    public ListTablespacesRequest.Builder get() {
                        return ListTablespacesRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListTablespacesResponse, String>() {
                    @Override
                    public String apply(ListTablespacesResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListTablespacesRequest.Builder>,
                        ListTablespacesRequest>() {
                    @Override
                    public ListTablespacesRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListTablespacesRequest.Builder>
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
                new java.util.function.Function<ListTablespacesRequest, ListTablespacesResponse>() {
                    @Override
                    public ListTablespacesResponse apply(ListTablespacesRequest request) {
                        return client.listTablespaces(request);
                    }
                },
                new java.util.function.Function<
                        ListTablespacesResponse,
                        java.util.List<
                                com.oracle.bmc.databasemanagement.model.TablespaceSummary>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.databasemanagement.model.TablespaceSummary>
                            apply(ListTablespacesResponse response) {
                        return response.getTablespaceCollection().getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the listUsers operation. This iterable
     * will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses received from the service.
     */
    public Iterable<ListUsersResponse> listUsersResponseIterator(final ListUsersRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListUsersRequest.Builder, ListUsersRequest, ListUsersResponse>(
                new java.util.function.Supplier<ListUsersRequest.Builder>() {
                    @Override
                    public ListUsersRequest.Builder get() {
                        return ListUsersRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListUsersResponse, String>() {
                    @Override
                    public String apply(ListUsersResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListUsersRequest.Builder>,
                        ListUsersRequest>() {
                    @Override
                    public ListUsersRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListUsersRequest.Builder>
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
                new java.util.function.Function<ListUsersRequest, ListUsersResponse>() {
                    @Override
                    public ListUsersResponse apply(ListUsersRequest request) {
                        return client.listUsers(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link com.oracle.bmc.databasemanagement.model.UserSummary} objects
     * contained in responses from the listUsers operation. This iterable will fetch more data from the
     * server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link com.oracle.bmc.databasemanagement.model.UserSummary} objects
     * contained in responses received from the service.
     */
    public Iterable<com.oracle.bmc.databasemanagement.model.UserSummary> listUsersRecordIterator(
            final ListUsersRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListUsersRequest.Builder, ListUsersRequest, ListUsersResponse,
                com.oracle.bmc.databasemanagement.model.UserSummary>(
                new java.util.function.Supplier<ListUsersRequest.Builder>() {
                    @Override
                    public ListUsersRequest.Builder get() {
                        return ListUsersRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListUsersResponse, String>() {
                    @Override
                    public String apply(ListUsersResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListUsersRequest.Builder>,
                        ListUsersRequest>() {
                    @Override
                    public ListUsersRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListUsersRequest.Builder>
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
                new java.util.function.Function<ListUsersRequest, ListUsersResponse>() {
                    @Override
                    public ListUsersResponse apply(ListUsersRequest request) {
                        return client.listUsers(request);
                    }
                },
                new java.util.function.Function<
                        ListUsersResponse,
                        java.util.List<com.oracle.bmc.databasemanagement.model.UserSummary>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.databasemanagement.model.UserSummary>
                            apply(ListUsersResponse response) {
                        return response.getUserCollection().getItems();
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
     * Creates a new iterable which will iterate over the {@link com.oracle.bmc.databasemanagement.model.WorkRequestError} objects
     * contained in responses from the listWorkRequestErrors operation. This iterable will fetch more data from the
     * server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link com.oracle.bmc.databasemanagement.model.WorkRequestError} objects
     * contained in responses received from the service.
     */
    public Iterable<com.oracle.bmc.databasemanagement.model.WorkRequestError>
            listWorkRequestErrorsRecordIterator(final ListWorkRequestErrorsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListWorkRequestErrorsRequest.Builder, ListWorkRequestErrorsRequest,
                ListWorkRequestErrorsResponse,
                com.oracle.bmc.databasemanagement.model.WorkRequestError>(
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
                        java.util.List<
                                com.oracle.bmc.databasemanagement.model.WorkRequestError>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.databasemanagement.model.WorkRequestError>
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
     * Creates a new iterable which will iterate over the {@link com.oracle.bmc.databasemanagement.model.WorkRequestLogEntry} objects
     * contained in responses from the listWorkRequestLogs operation. This iterable will fetch more data from the
     * server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link com.oracle.bmc.databasemanagement.model.WorkRequestLogEntry} objects
     * contained in responses received from the service.
     */
    public Iterable<com.oracle.bmc.databasemanagement.model.WorkRequestLogEntry>
            listWorkRequestLogsRecordIterator(final ListWorkRequestLogsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListWorkRequestLogsRequest.Builder, ListWorkRequestLogsRequest,
                ListWorkRequestLogsResponse,
                com.oracle.bmc.databasemanagement.model.WorkRequestLogEntry>(
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
                        java.util.List<
                                com.oracle.bmc.databasemanagement.model.WorkRequestLogEntry>>() {
                    @Override
                    public java.util.List<
                                    com.oracle.bmc.databasemanagement.model.WorkRequestLogEntry>
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
     * Creates a new iterable which will iterate over the {@link com.oracle.bmc.databasemanagement.model.WorkRequestSummary} objects
     * contained in responses from the listWorkRequests operation. This iterable will fetch more data from the
     * server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link com.oracle.bmc.databasemanagement.model.WorkRequestSummary} objects
     * contained in responses received from the service.
     */
    public Iterable<com.oracle.bmc.databasemanagement.model.WorkRequestSummary>
            listWorkRequestsRecordIterator(final ListWorkRequestsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListWorkRequestsRequest.Builder, ListWorkRequestsRequest, ListWorkRequestsResponse,
                com.oracle.bmc.databasemanagement.model.WorkRequestSummary>(
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
                        java.util.List<
                                com.oracle.bmc.databasemanagement.model.WorkRequestSummary>>() {
                    @Override
                    public java.util.List<
                                    com.oracle.bmc.databasemanagement.model.WorkRequestSummary>
                            apply(ListWorkRequestsResponse response) {
                        return response.getWorkRequestCollection().getItems();
                    }
                });
    }
}

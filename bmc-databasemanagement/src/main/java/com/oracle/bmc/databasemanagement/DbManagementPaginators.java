/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.databasemanagement;

import com.oracle.bmc.databasemanagement.requests.*;
import com.oracle.bmc.databasemanagement.responses.*;

/**
 * Collection of helper methods that can be used to provide an {@link java.lang.Iterable} interface
 * to any list operations of DbManagement where multiple pages of data may be fetched. Two styles of
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
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20201101")
public class DbManagementPaginators {
    private final DbManagement client;

    public DbManagementPaginators(DbManagement client) {
        this.client = client;
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the
     * listAsmProperties operation. This iterable will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses
     *     received from the service.
     */
    public Iterable<ListAsmPropertiesResponse> listAsmPropertiesResponseIterator(
            final ListAsmPropertiesRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListAsmPropertiesRequest.Builder,
                ListAsmPropertiesRequest,
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
     * Creates a new iterable which will iterate over the {@link
     * com.oracle.bmc.databasemanagement.model.AsmPropertySummary} objects contained in responses
     * from the listAsmProperties operation. This iterable will fetch more data from the server as
     * needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link
     *     com.oracle.bmc.databasemanagement.model.AsmPropertySummary} objects contained in
     *     responses received from the service.
     */
    public Iterable<com.oracle.bmc.databasemanagement.model.AsmPropertySummary>
            listAsmPropertiesRecordIterator(final ListAsmPropertiesRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListAsmPropertiesRequest.Builder,
                ListAsmPropertiesRequest,
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
     * Creates a new iterable which will iterate over the responses received from the
     * listAssociatedDatabases operation. This iterable will fetch more data from the server as
     * needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses
     *     received from the service.
     */
    public Iterable<ListAssociatedDatabasesResponse> listAssociatedDatabasesResponseIterator(
            final ListAssociatedDatabasesRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListAssociatedDatabasesRequest.Builder,
                ListAssociatedDatabasesRequest,
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
     * Creates a new iterable which will iterate over the {@link
     * com.oracle.bmc.databasemanagement.model.AssociatedDatabaseSummary} objects contained in
     * responses from the listAssociatedDatabases operation. This iterable will fetch more data from
     * the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link
     *     com.oracle.bmc.databasemanagement.model.AssociatedDatabaseSummary} objects contained in
     *     responses received from the service.
     */
    public Iterable<com.oracle.bmc.databasemanagement.model.AssociatedDatabaseSummary>
            listAssociatedDatabasesRecordIterator(final ListAssociatedDatabasesRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListAssociatedDatabasesRequest.Builder,
                ListAssociatedDatabasesRequest,
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
     * Creates a new iterable which will iterate over the responses received from the
     * listCloudAsmDiskGroups operation. This iterable will fetch more data from the server as
     * needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses
     *     received from the service.
     */
    public Iterable<ListCloudAsmDiskGroupsResponse> listCloudAsmDiskGroupsResponseIterator(
            final ListCloudAsmDiskGroupsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListCloudAsmDiskGroupsRequest.Builder,
                ListCloudAsmDiskGroupsRequest,
                ListCloudAsmDiskGroupsResponse>(
                new java.util.function.Supplier<ListCloudAsmDiskGroupsRequest.Builder>() {
                    @Override
                    public ListCloudAsmDiskGroupsRequest.Builder get() {
                        return ListCloudAsmDiskGroupsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListCloudAsmDiskGroupsResponse, String>() {
                    @Override
                    public String apply(ListCloudAsmDiskGroupsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListCloudAsmDiskGroupsRequest.Builder>,
                        ListCloudAsmDiskGroupsRequest>() {
                    @Override
                    public ListCloudAsmDiskGroupsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListCloudAsmDiskGroupsRequest.Builder>
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
                        ListCloudAsmDiskGroupsRequest, ListCloudAsmDiskGroupsResponse>() {
                    @Override
                    public ListCloudAsmDiskGroupsResponse apply(
                            ListCloudAsmDiskGroupsRequest request) {
                        return client.listCloudAsmDiskGroups(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link
     * com.oracle.bmc.databasemanagement.model.CloudAsmDiskGroupSummary} objects contained in
     * responses from the listCloudAsmDiskGroups operation. This iterable will fetch more data from
     * the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link
     *     com.oracle.bmc.databasemanagement.model.CloudAsmDiskGroupSummary} objects contained in
     *     responses received from the service.
     */
    public Iterable<com.oracle.bmc.databasemanagement.model.CloudAsmDiskGroupSummary>
            listCloudAsmDiskGroupsRecordIterator(final ListCloudAsmDiskGroupsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListCloudAsmDiskGroupsRequest.Builder,
                ListCloudAsmDiskGroupsRequest,
                ListCloudAsmDiskGroupsResponse,
                com.oracle.bmc.databasemanagement.model.CloudAsmDiskGroupSummary>(
                new java.util.function.Supplier<ListCloudAsmDiskGroupsRequest.Builder>() {
                    @Override
                    public ListCloudAsmDiskGroupsRequest.Builder get() {
                        return ListCloudAsmDiskGroupsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListCloudAsmDiskGroupsResponse, String>() {
                    @Override
                    public String apply(ListCloudAsmDiskGroupsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListCloudAsmDiskGroupsRequest.Builder>,
                        ListCloudAsmDiskGroupsRequest>() {
                    @Override
                    public ListCloudAsmDiskGroupsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListCloudAsmDiskGroupsRequest.Builder>
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
                        ListCloudAsmDiskGroupsRequest, ListCloudAsmDiskGroupsResponse>() {
                    @Override
                    public ListCloudAsmDiskGroupsResponse apply(
                            ListCloudAsmDiskGroupsRequest request) {
                        return client.listCloudAsmDiskGroups(request);
                    }
                },
                new java.util.function.Function<
                        ListCloudAsmDiskGroupsResponse,
                        java.util.List<
                                com.oracle.bmc.databasemanagement.model
                                        .CloudAsmDiskGroupSummary>>() {
                    @Override
                    public java.util.List<
                                    com.oracle.bmc.databasemanagement.model
                                            .CloudAsmDiskGroupSummary>
                            apply(ListCloudAsmDiskGroupsResponse response) {
                        return response.getCloudAsmDiskGroupCollection().getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the
     * listCloudAsmInstances operation. This iterable will fetch more data from the server as
     * needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses
     *     received from the service.
     */
    public Iterable<ListCloudAsmInstancesResponse> listCloudAsmInstancesResponseIterator(
            final ListCloudAsmInstancesRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListCloudAsmInstancesRequest.Builder,
                ListCloudAsmInstancesRequest,
                ListCloudAsmInstancesResponse>(
                new java.util.function.Supplier<ListCloudAsmInstancesRequest.Builder>() {
                    @Override
                    public ListCloudAsmInstancesRequest.Builder get() {
                        return ListCloudAsmInstancesRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListCloudAsmInstancesResponse, String>() {
                    @Override
                    public String apply(ListCloudAsmInstancesResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListCloudAsmInstancesRequest.Builder>,
                        ListCloudAsmInstancesRequest>() {
                    @Override
                    public ListCloudAsmInstancesRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListCloudAsmInstancesRequest.Builder>
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
                        ListCloudAsmInstancesRequest, ListCloudAsmInstancesResponse>() {
                    @Override
                    public ListCloudAsmInstancesResponse apply(
                            ListCloudAsmInstancesRequest request) {
                        return client.listCloudAsmInstances(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link
     * com.oracle.bmc.databasemanagement.model.CloudAsmInstanceSummary} objects contained in
     * responses from the listCloudAsmInstances operation. This iterable will fetch more data from
     * the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link
     *     com.oracle.bmc.databasemanagement.model.CloudAsmInstanceSummary} objects contained in
     *     responses received from the service.
     */
    public Iterable<com.oracle.bmc.databasemanagement.model.CloudAsmInstanceSummary>
            listCloudAsmInstancesRecordIterator(final ListCloudAsmInstancesRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListCloudAsmInstancesRequest.Builder,
                ListCloudAsmInstancesRequest,
                ListCloudAsmInstancesResponse,
                com.oracle.bmc.databasemanagement.model.CloudAsmInstanceSummary>(
                new java.util.function.Supplier<ListCloudAsmInstancesRequest.Builder>() {
                    @Override
                    public ListCloudAsmInstancesRequest.Builder get() {
                        return ListCloudAsmInstancesRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListCloudAsmInstancesResponse, String>() {
                    @Override
                    public String apply(ListCloudAsmInstancesResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListCloudAsmInstancesRequest.Builder>,
                        ListCloudAsmInstancesRequest>() {
                    @Override
                    public ListCloudAsmInstancesRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListCloudAsmInstancesRequest.Builder>
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
                        ListCloudAsmInstancesRequest, ListCloudAsmInstancesResponse>() {
                    @Override
                    public ListCloudAsmInstancesResponse apply(
                            ListCloudAsmInstancesRequest request) {
                        return client.listCloudAsmInstances(request);
                    }
                },
                new java.util.function.Function<
                        ListCloudAsmInstancesResponse,
                        java.util.List<
                                com.oracle.bmc.databasemanagement.model
                                        .CloudAsmInstanceSummary>>() {
                    @Override
                    public java.util.List<
                                    com.oracle.bmc.databasemanagement.model.CloudAsmInstanceSummary>
                            apply(ListCloudAsmInstancesResponse response) {
                        return response.getCloudAsmInstanceCollection().getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the
     * listCloudAsmUsers operation. This iterable will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses
     *     received from the service.
     */
    public Iterable<ListCloudAsmUsersResponse> listCloudAsmUsersResponseIterator(
            final ListCloudAsmUsersRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListCloudAsmUsersRequest.Builder,
                ListCloudAsmUsersRequest,
                ListCloudAsmUsersResponse>(
                new java.util.function.Supplier<ListCloudAsmUsersRequest.Builder>() {
                    @Override
                    public ListCloudAsmUsersRequest.Builder get() {
                        return ListCloudAsmUsersRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListCloudAsmUsersResponse, String>() {
                    @Override
                    public String apply(ListCloudAsmUsersResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListCloudAsmUsersRequest.Builder>,
                        ListCloudAsmUsersRequest>() {
                    @Override
                    public ListCloudAsmUsersRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListCloudAsmUsersRequest.Builder>
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
                        ListCloudAsmUsersRequest, ListCloudAsmUsersResponse>() {
                    @Override
                    public ListCloudAsmUsersResponse apply(ListCloudAsmUsersRequest request) {
                        return client.listCloudAsmUsers(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link
     * com.oracle.bmc.databasemanagement.model.CloudAsmUserSummary} objects contained in responses
     * from the listCloudAsmUsers operation. This iterable will fetch more data from the server as
     * needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link
     *     com.oracle.bmc.databasemanagement.model.CloudAsmUserSummary} objects contained in
     *     responses received from the service.
     */
    public Iterable<com.oracle.bmc.databasemanagement.model.CloudAsmUserSummary>
            listCloudAsmUsersRecordIterator(final ListCloudAsmUsersRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListCloudAsmUsersRequest.Builder,
                ListCloudAsmUsersRequest,
                ListCloudAsmUsersResponse,
                com.oracle.bmc.databasemanagement.model.CloudAsmUserSummary>(
                new java.util.function.Supplier<ListCloudAsmUsersRequest.Builder>() {
                    @Override
                    public ListCloudAsmUsersRequest.Builder get() {
                        return ListCloudAsmUsersRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListCloudAsmUsersResponse, String>() {
                    @Override
                    public String apply(ListCloudAsmUsersResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListCloudAsmUsersRequest.Builder>,
                        ListCloudAsmUsersRequest>() {
                    @Override
                    public ListCloudAsmUsersRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListCloudAsmUsersRequest.Builder>
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
                        ListCloudAsmUsersRequest, ListCloudAsmUsersResponse>() {
                    @Override
                    public ListCloudAsmUsersResponse apply(ListCloudAsmUsersRequest request) {
                        return client.listCloudAsmUsers(request);
                    }
                },
                new java.util.function.Function<
                        ListCloudAsmUsersResponse,
                        java.util.List<
                                com.oracle.bmc.databasemanagement.model.CloudAsmUserSummary>>() {
                    @Override
                    public java.util.List<
                                    com.oracle.bmc.databasemanagement.model.CloudAsmUserSummary>
                            apply(ListCloudAsmUsersResponse response) {
                        return response.getCloudAsmUserCollection().getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the listCloudAsms
     * operation. This iterable will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses
     *     received from the service.
     */
    public Iterable<ListCloudAsmsResponse> listCloudAsmsResponseIterator(
            final ListCloudAsmsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListCloudAsmsRequest.Builder, ListCloudAsmsRequest, ListCloudAsmsResponse>(
                new java.util.function.Supplier<ListCloudAsmsRequest.Builder>() {
                    @Override
                    public ListCloudAsmsRequest.Builder get() {
                        return ListCloudAsmsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListCloudAsmsResponse, String>() {
                    @Override
                    public String apply(ListCloudAsmsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListCloudAsmsRequest.Builder>,
                        ListCloudAsmsRequest>() {
                    @Override
                    public ListCloudAsmsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListCloudAsmsRequest.Builder>
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
                new java.util.function.Function<ListCloudAsmsRequest, ListCloudAsmsResponse>() {
                    @Override
                    public ListCloudAsmsResponse apply(ListCloudAsmsRequest request) {
                        return client.listCloudAsms(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link
     * com.oracle.bmc.databasemanagement.model.CloudAsmSummary} objects contained in responses from
     * the listCloudAsms operation. This iterable will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link
     *     com.oracle.bmc.databasemanagement.model.CloudAsmSummary} objects contained in responses
     *     received from the service.
     */
    public Iterable<com.oracle.bmc.databasemanagement.model.CloudAsmSummary>
            listCloudAsmsRecordIterator(final ListCloudAsmsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListCloudAsmsRequest.Builder,
                ListCloudAsmsRequest,
                ListCloudAsmsResponse,
                com.oracle.bmc.databasemanagement.model.CloudAsmSummary>(
                new java.util.function.Supplier<ListCloudAsmsRequest.Builder>() {
                    @Override
                    public ListCloudAsmsRequest.Builder get() {
                        return ListCloudAsmsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListCloudAsmsResponse, String>() {
                    @Override
                    public String apply(ListCloudAsmsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListCloudAsmsRequest.Builder>,
                        ListCloudAsmsRequest>() {
                    @Override
                    public ListCloudAsmsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListCloudAsmsRequest.Builder>
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
                new java.util.function.Function<ListCloudAsmsRequest, ListCloudAsmsResponse>() {
                    @Override
                    public ListCloudAsmsResponse apply(ListCloudAsmsRequest request) {
                        return client.listCloudAsms(request);
                    }
                },
                new java.util.function.Function<
                        ListCloudAsmsResponse,
                        java.util.List<com.oracle.bmc.databasemanagement.model.CloudAsmSummary>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.databasemanagement.model.CloudAsmSummary>
                            apply(ListCloudAsmsResponse response) {
                        return response.getCloudAsmCollection().getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the
     * listCloudClusterInstances operation. This iterable will fetch more data from the server as
     * needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses
     *     received from the service.
     */
    public Iterable<ListCloudClusterInstancesResponse> listCloudClusterInstancesResponseIterator(
            final ListCloudClusterInstancesRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListCloudClusterInstancesRequest.Builder,
                ListCloudClusterInstancesRequest,
                ListCloudClusterInstancesResponse>(
                new java.util.function.Supplier<ListCloudClusterInstancesRequest.Builder>() {
                    @Override
                    public ListCloudClusterInstancesRequest.Builder get() {
                        return ListCloudClusterInstancesRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListCloudClusterInstancesResponse, String>() {
                    @Override
                    public String apply(ListCloudClusterInstancesResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListCloudClusterInstancesRequest.Builder>,
                        ListCloudClusterInstancesRequest>() {
                    @Override
                    public ListCloudClusterInstancesRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListCloudClusterInstancesRequest.Builder>
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
                        ListCloudClusterInstancesRequest, ListCloudClusterInstancesResponse>() {
                    @Override
                    public ListCloudClusterInstancesResponse apply(
                            ListCloudClusterInstancesRequest request) {
                        return client.listCloudClusterInstances(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link
     * com.oracle.bmc.databasemanagement.model.CloudClusterInstanceSummary} objects contained in
     * responses from the listCloudClusterInstances operation. This iterable will fetch more data
     * from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link
     *     com.oracle.bmc.databasemanagement.model.CloudClusterInstanceSummary} objects contained in
     *     responses received from the service.
     */
    public Iterable<com.oracle.bmc.databasemanagement.model.CloudClusterInstanceSummary>
            listCloudClusterInstancesRecordIterator(
                    final ListCloudClusterInstancesRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListCloudClusterInstancesRequest.Builder,
                ListCloudClusterInstancesRequest,
                ListCloudClusterInstancesResponse,
                com.oracle.bmc.databasemanagement.model.CloudClusterInstanceSummary>(
                new java.util.function.Supplier<ListCloudClusterInstancesRequest.Builder>() {
                    @Override
                    public ListCloudClusterInstancesRequest.Builder get() {
                        return ListCloudClusterInstancesRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListCloudClusterInstancesResponse, String>() {
                    @Override
                    public String apply(ListCloudClusterInstancesResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListCloudClusterInstancesRequest.Builder>,
                        ListCloudClusterInstancesRequest>() {
                    @Override
                    public ListCloudClusterInstancesRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListCloudClusterInstancesRequest.Builder>
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
                        ListCloudClusterInstancesRequest, ListCloudClusterInstancesResponse>() {
                    @Override
                    public ListCloudClusterInstancesResponse apply(
                            ListCloudClusterInstancesRequest request) {
                        return client.listCloudClusterInstances(request);
                    }
                },
                new java.util.function.Function<
                        ListCloudClusterInstancesResponse,
                        java.util.List<
                                com.oracle.bmc.databasemanagement.model
                                        .CloudClusterInstanceSummary>>() {
                    @Override
                    public java.util.List<
                                    com.oracle.bmc.databasemanagement.model
                                            .CloudClusterInstanceSummary>
                            apply(ListCloudClusterInstancesResponse response) {
                        return response.getCloudClusterInstanceCollection().getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the
     * listCloudClusters operation. This iterable will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses
     *     received from the service.
     */
    public Iterable<ListCloudClustersResponse> listCloudClustersResponseIterator(
            final ListCloudClustersRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListCloudClustersRequest.Builder,
                ListCloudClustersRequest,
                ListCloudClustersResponse>(
                new java.util.function.Supplier<ListCloudClustersRequest.Builder>() {
                    @Override
                    public ListCloudClustersRequest.Builder get() {
                        return ListCloudClustersRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListCloudClustersResponse, String>() {
                    @Override
                    public String apply(ListCloudClustersResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListCloudClustersRequest.Builder>,
                        ListCloudClustersRequest>() {
                    @Override
                    public ListCloudClustersRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListCloudClustersRequest.Builder>
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
                        ListCloudClustersRequest, ListCloudClustersResponse>() {
                    @Override
                    public ListCloudClustersResponse apply(ListCloudClustersRequest request) {
                        return client.listCloudClusters(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link
     * com.oracle.bmc.databasemanagement.model.CloudClusterSummary} objects contained in responses
     * from the listCloudClusters operation. This iterable will fetch more data from the server as
     * needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link
     *     com.oracle.bmc.databasemanagement.model.CloudClusterSummary} objects contained in
     *     responses received from the service.
     */
    public Iterable<com.oracle.bmc.databasemanagement.model.CloudClusterSummary>
            listCloudClustersRecordIterator(final ListCloudClustersRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListCloudClustersRequest.Builder,
                ListCloudClustersRequest,
                ListCloudClustersResponse,
                com.oracle.bmc.databasemanagement.model.CloudClusterSummary>(
                new java.util.function.Supplier<ListCloudClustersRequest.Builder>() {
                    @Override
                    public ListCloudClustersRequest.Builder get() {
                        return ListCloudClustersRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListCloudClustersResponse, String>() {
                    @Override
                    public String apply(ListCloudClustersResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListCloudClustersRequest.Builder>,
                        ListCloudClustersRequest>() {
                    @Override
                    public ListCloudClustersRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListCloudClustersRequest.Builder>
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
                        ListCloudClustersRequest, ListCloudClustersResponse>() {
                    @Override
                    public ListCloudClustersResponse apply(ListCloudClustersRequest request) {
                        return client.listCloudClusters(request);
                    }
                },
                new java.util.function.Function<
                        ListCloudClustersResponse,
                        java.util.List<
                                com.oracle.bmc.databasemanagement.model.CloudClusterSummary>>() {
                    @Override
                    public java.util.List<
                                    com.oracle.bmc.databasemanagement.model.CloudClusterSummary>
                            apply(ListCloudClustersResponse response) {
                        return response.getCloudClusterCollection().getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the
     * listCloudDatabases operation. This iterable will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses
     *     received from the service.
     */
    public Iterable<ListCloudDatabasesResponse> listCloudDatabasesResponseIterator(
            final ListCloudDatabasesRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListCloudDatabasesRequest.Builder,
                ListCloudDatabasesRequest,
                ListCloudDatabasesResponse>(
                new java.util.function.Supplier<ListCloudDatabasesRequest.Builder>() {
                    @Override
                    public ListCloudDatabasesRequest.Builder get() {
                        return ListCloudDatabasesRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListCloudDatabasesResponse, String>() {
                    @Override
                    public String apply(ListCloudDatabasesResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListCloudDatabasesRequest.Builder>,
                        ListCloudDatabasesRequest>() {
                    @Override
                    public ListCloudDatabasesRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListCloudDatabasesRequest.Builder>
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
                        ListCloudDatabasesRequest, ListCloudDatabasesResponse>() {
                    @Override
                    public ListCloudDatabasesResponse apply(ListCloudDatabasesRequest request) {
                        return client.listCloudDatabases(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link
     * com.oracle.bmc.databasemanagement.model.CloudDatabaseSummary} objects contained in responses
     * from the listCloudDatabases operation. This iterable will fetch more data from the server as
     * needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link
     *     com.oracle.bmc.databasemanagement.model.CloudDatabaseSummary} objects contained in
     *     responses received from the service.
     */
    public Iterable<com.oracle.bmc.databasemanagement.model.CloudDatabaseSummary>
            listCloudDatabasesRecordIterator(final ListCloudDatabasesRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListCloudDatabasesRequest.Builder,
                ListCloudDatabasesRequest,
                ListCloudDatabasesResponse,
                com.oracle.bmc.databasemanagement.model.CloudDatabaseSummary>(
                new java.util.function.Supplier<ListCloudDatabasesRequest.Builder>() {
                    @Override
                    public ListCloudDatabasesRequest.Builder get() {
                        return ListCloudDatabasesRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListCloudDatabasesResponse, String>() {
                    @Override
                    public String apply(ListCloudDatabasesResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListCloudDatabasesRequest.Builder>,
                        ListCloudDatabasesRequest>() {
                    @Override
                    public ListCloudDatabasesRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListCloudDatabasesRequest.Builder>
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
                        ListCloudDatabasesRequest, ListCloudDatabasesResponse>() {
                    @Override
                    public ListCloudDatabasesResponse apply(ListCloudDatabasesRequest request) {
                        return client.listCloudDatabases(request);
                    }
                },
                new java.util.function.Function<
                        ListCloudDatabasesResponse,
                        java.util.List<
                                com.oracle.bmc.databasemanagement.model.CloudDatabaseSummary>>() {
                    @Override
                    public java.util.List<
                                    com.oracle.bmc.databasemanagement.model.CloudDatabaseSummary>
                            apply(ListCloudDatabasesResponse response) {
                        return response.getCloudDatabaseCollection().getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the
     * listCloudDbHomes operation. This iterable will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses
     *     received from the service.
     */
    public Iterable<ListCloudDbHomesResponse> listCloudDbHomesResponseIterator(
            final ListCloudDbHomesRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListCloudDbHomesRequest.Builder, ListCloudDbHomesRequest, ListCloudDbHomesResponse>(
                new java.util.function.Supplier<ListCloudDbHomesRequest.Builder>() {
                    @Override
                    public ListCloudDbHomesRequest.Builder get() {
                        return ListCloudDbHomesRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListCloudDbHomesResponse, String>() {
                    @Override
                    public String apply(ListCloudDbHomesResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListCloudDbHomesRequest.Builder>,
                        ListCloudDbHomesRequest>() {
                    @Override
                    public ListCloudDbHomesRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListCloudDbHomesRequest.Builder>
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
                        ListCloudDbHomesRequest, ListCloudDbHomesResponse>() {
                    @Override
                    public ListCloudDbHomesResponse apply(ListCloudDbHomesRequest request) {
                        return client.listCloudDbHomes(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link
     * com.oracle.bmc.databasemanagement.model.CloudDbHomeSummary} objects contained in responses
     * from the listCloudDbHomes operation. This iterable will fetch more data from the server as
     * needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link
     *     com.oracle.bmc.databasemanagement.model.CloudDbHomeSummary} objects contained in
     *     responses received from the service.
     */
    public Iterable<com.oracle.bmc.databasemanagement.model.CloudDbHomeSummary>
            listCloudDbHomesRecordIterator(final ListCloudDbHomesRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListCloudDbHomesRequest.Builder,
                ListCloudDbHomesRequest,
                ListCloudDbHomesResponse,
                com.oracle.bmc.databasemanagement.model.CloudDbHomeSummary>(
                new java.util.function.Supplier<ListCloudDbHomesRequest.Builder>() {
                    @Override
                    public ListCloudDbHomesRequest.Builder get() {
                        return ListCloudDbHomesRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListCloudDbHomesResponse, String>() {
                    @Override
                    public String apply(ListCloudDbHomesResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListCloudDbHomesRequest.Builder>,
                        ListCloudDbHomesRequest>() {
                    @Override
                    public ListCloudDbHomesRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListCloudDbHomesRequest.Builder>
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
                        ListCloudDbHomesRequest, ListCloudDbHomesResponse>() {
                    @Override
                    public ListCloudDbHomesResponse apply(ListCloudDbHomesRequest request) {
                        return client.listCloudDbHomes(request);
                    }
                },
                new java.util.function.Function<
                        ListCloudDbHomesResponse,
                        java.util.List<
                                com.oracle.bmc.databasemanagement.model.CloudDbHomeSummary>>() {
                    @Override
                    public java.util.List<
                                    com.oracle.bmc.databasemanagement.model.CloudDbHomeSummary>
                            apply(ListCloudDbHomesResponse response) {
                        return response.getCloudDbHomeCollection().getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the
     * listCloudDbNodes operation. This iterable will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses
     *     received from the service.
     */
    public Iterable<ListCloudDbNodesResponse> listCloudDbNodesResponseIterator(
            final ListCloudDbNodesRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListCloudDbNodesRequest.Builder, ListCloudDbNodesRequest, ListCloudDbNodesResponse>(
                new java.util.function.Supplier<ListCloudDbNodesRequest.Builder>() {
                    @Override
                    public ListCloudDbNodesRequest.Builder get() {
                        return ListCloudDbNodesRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListCloudDbNodesResponse, String>() {
                    @Override
                    public String apply(ListCloudDbNodesResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListCloudDbNodesRequest.Builder>,
                        ListCloudDbNodesRequest>() {
                    @Override
                    public ListCloudDbNodesRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListCloudDbNodesRequest.Builder>
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
                        ListCloudDbNodesRequest, ListCloudDbNodesResponse>() {
                    @Override
                    public ListCloudDbNodesResponse apply(ListCloudDbNodesRequest request) {
                        return client.listCloudDbNodes(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link
     * com.oracle.bmc.databasemanagement.model.CloudDbNodeSummary} objects contained in responses
     * from the listCloudDbNodes operation. This iterable will fetch more data from the server as
     * needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link
     *     com.oracle.bmc.databasemanagement.model.CloudDbNodeSummary} objects contained in
     *     responses received from the service.
     */
    public Iterable<com.oracle.bmc.databasemanagement.model.CloudDbNodeSummary>
            listCloudDbNodesRecordIterator(final ListCloudDbNodesRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListCloudDbNodesRequest.Builder,
                ListCloudDbNodesRequest,
                ListCloudDbNodesResponse,
                com.oracle.bmc.databasemanagement.model.CloudDbNodeSummary>(
                new java.util.function.Supplier<ListCloudDbNodesRequest.Builder>() {
                    @Override
                    public ListCloudDbNodesRequest.Builder get() {
                        return ListCloudDbNodesRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListCloudDbNodesResponse, String>() {
                    @Override
                    public String apply(ListCloudDbNodesResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListCloudDbNodesRequest.Builder>,
                        ListCloudDbNodesRequest>() {
                    @Override
                    public ListCloudDbNodesRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListCloudDbNodesRequest.Builder>
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
                        ListCloudDbNodesRequest, ListCloudDbNodesResponse>() {
                    @Override
                    public ListCloudDbNodesResponse apply(ListCloudDbNodesRequest request) {
                        return client.listCloudDbNodes(request);
                    }
                },
                new java.util.function.Function<
                        ListCloudDbNodesResponse,
                        java.util.List<
                                com.oracle.bmc.databasemanagement.model.CloudDbNodeSummary>>() {
                    @Override
                    public java.util.List<
                                    com.oracle.bmc.databasemanagement.model.CloudDbNodeSummary>
                            apply(ListCloudDbNodesResponse response) {
                        return response.getCloudDbNodeCollection().getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the
     * listCloudDbSystemConnectors operation. This iterable will fetch more data from the server as
     * needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses
     *     received from the service.
     */
    public Iterable<ListCloudDbSystemConnectorsResponse>
            listCloudDbSystemConnectorsResponseIterator(
                    final ListCloudDbSystemConnectorsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListCloudDbSystemConnectorsRequest.Builder,
                ListCloudDbSystemConnectorsRequest,
                ListCloudDbSystemConnectorsResponse>(
                new java.util.function.Supplier<ListCloudDbSystemConnectorsRequest.Builder>() {
                    @Override
                    public ListCloudDbSystemConnectorsRequest.Builder get() {
                        return ListCloudDbSystemConnectorsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListCloudDbSystemConnectorsResponse, String>() {
                    @Override
                    public String apply(ListCloudDbSystemConnectorsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListCloudDbSystemConnectorsRequest.Builder>,
                        ListCloudDbSystemConnectorsRequest>() {
                    @Override
                    public ListCloudDbSystemConnectorsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListCloudDbSystemConnectorsRequest.Builder>
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
                        ListCloudDbSystemConnectorsRequest, ListCloudDbSystemConnectorsResponse>() {
                    @Override
                    public ListCloudDbSystemConnectorsResponse apply(
                            ListCloudDbSystemConnectorsRequest request) {
                        return client.listCloudDbSystemConnectors(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link
     * com.oracle.bmc.databasemanagement.model.CloudDbSystemConnectorSummary} objects contained in
     * responses from the listCloudDbSystemConnectors operation. This iterable will fetch more data
     * from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link
     *     com.oracle.bmc.databasemanagement.model.CloudDbSystemConnectorSummary} objects contained
     *     in responses received from the service.
     */
    public Iterable<com.oracle.bmc.databasemanagement.model.CloudDbSystemConnectorSummary>
            listCloudDbSystemConnectorsRecordIterator(
                    final ListCloudDbSystemConnectorsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListCloudDbSystemConnectorsRequest.Builder,
                ListCloudDbSystemConnectorsRequest,
                ListCloudDbSystemConnectorsResponse,
                com.oracle.bmc.databasemanagement.model.CloudDbSystemConnectorSummary>(
                new java.util.function.Supplier<ListCloudDbSystemConnectorsRequest.Builder>() {
                    @Override
                    public ListCloudDbSystemConnectorsRequest.Builder get() {
                        return ListCloudDbSystemConnectorsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListCloudDbSystemConnectorsResponse, String>() {
                    @Override
                    public String apply(ListCloudDbSystemConnectorsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListCloudDbSystemConnectorsRequest.Builder>,
                        ListCloudDbSystemConnectorsRequest>() {
                    @Override
                    public ListCloudDbSystemConnectorsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListCloudDbSystemConnectorsRequest.Builder>
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
                        ListCloudDbSystemConnectorsRequest, ListCloudDbSystemConnectorsResponse>() {
                    @Override
                    public ListCloudDbSystemConnectorsResponse apply(
                            ListCloudDbSystemConnectorsRequest request) {
                        return client.listCloudDbSystemConnectors(request);
                    }
                },
                new java.util.function.Function<
                        ListCloudDbSystemConnectorsResponse,
                        java.util.List<
                                com.oracle.bmc.databasemanagement.model
                                        .CloudDbSystemConnectorSummary>>() {
                    @Override
                    public java.util.List<
                                    com.oracle.bmc.databasemanagement.model
                                            .CloudDbSystemConnectorSummary>
                            apply(ListCloudDbSystemConnectorsResponse response) {
                        return response.getCloudDbSystemConnectorCollection().getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the
     * listCloudDbSystemDiscoveries operation. This iterable will fetch more data from the server as
     * needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses
     *     received from the service.
     */
    public Iterable<ListCloudDbSystemDiscoveriesResponse>
            listCloudDbSystemDiscoveriesResponseIterator(
                    final ListCloudDbSystemDiscoveriesRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListCloudDbSystemDiscoveriesRequest.Builder,
                ListCloudDbSystemDiscoveriesRequest,
                ListCloudDbSystemDiscoveriesResponse>(
                new java.util.function.Supplier<ListCloudDbSystemDiscoveriesRequest.Builder>() {
                    @Override
                    public ListCloudDbSystemDiscoveriesRequest.Builder get() {
                        return ListCloudDbSystemDiscoveriesRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListCloudDbSystemDiscoveriesResponse, String>() {
                    @Override
                    public String apply(ListCloudDbSystemDiscoveriesResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListCloudDbSystemDiscoveriesRequest.Builder>,
                        ListCloudDbSystemDiscoveriesRequest>() {
                    @Override
                    public ListCloudDbSystemDiscoveriesRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListCloudDbSystemDiscoveriesRequest.Builder>
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
                        ListCloudDbSystemDiscoveriesRequest,
                        ListCloudDbSystemDiscoveriesResponse>() {
                    @Override
                    public ListCloudDbSystemDiscoveriesResponse apply(
                            ListCloudDbSystemDiscoveriesRequest request) {
                        return client.listCloudDbSystemDiscoveries(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link
     * com.oracle.bmc.databasemanagement.model.CloudDbSystemDiscoverySummary} objects contained in
     * responses from the listCloudDbSystemDiscoveries operation. This iterable will fetch more data
     * from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link
     *     com.oracle.bmc.databasemanagement.model.CloudDbSystemDiscoverySummary} objects contained
     *     in responses received from the service.
     */
    public Iterable<com.oracle.bmc.databasemanagement.model.CloudDbSystemDiscoverySummary>
            listCloudDbSystemDiscoveriesRecordIterator(
                    final ListCloudDbSystemDiscoveriesRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListCloudDbSystemDiscoveriesRequest.Builder,
                ListCloudDbSystemDiscoveriesRequest,
                ListCloudDbSystemDiscoveriesResponse,
                com.oracle.bmc.databasemanagement.model.CloudDbSystemDiscoverySummary>(
                new java.util.function.Supplier<ListCloudDbSystemDiscoveriesRequest.Builder>() {
                    @Override
                    public ListCloudDbSystemDiscoveriesRequest.Builder get() {
                        return ListCloudDbSystemDiscoveriesRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListCloudDbSystemDiscoveriesResponse, String>() {
                    @Override
                    public String apply(ListCloudDbSystemDiscoveriesResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListCloudDbSystemDiscoveriesRequest.Builder>,
                        ListCloudDbSystemDiscoveriesRequest>() {
                    @Override
                    public ListCloudDbSystemDiscoveriesRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListCloudDbSystemDiscoveriesRequest.Builder>
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
                        ListCloudDbSystemDiscoveriesRequest,
                        ListCloudDbSystemDiscoveriesResponse>() {
                    @Override
                    public ListCloudDbSystemDiscoveriesResponse apply(
                            ListCloudDbSystemDiscoveriesRequest request) {
                        return client.listCloudDbSystemDiscoveries(request);
                    }
                },
                new java.util.function.Function<
                        ListCloudDbSystemDiscoveriesResponse,
                        java.util.List<
                                com.oracle.bmc.databasemanagement.model
                                        .CloudDbSystemDiscoverySummary>>() {
                    @Override
                    public java.util.List<
                                    com.oracle.bmc.databasemanagement.model
                                            .CloudDbSystemDiscoverySummary>
                            apply(ListCloudDbSystemDiscoveriesResponse response) {
                        return response.getCloudDbSystemDiscoveryCollection().getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the
     * listCloudDbSystems operation. This iterable will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses
     *     received from the service.
     */
    public Iterable<ListCloudDbSystemsResponse> listCloudDbSystemsResponseIterator(
            final ListCloudDbSystemsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListCloudDbSystemsRequest.Builder,
                ListCloudDbSystemsRequest,
                ListCloudDbSystemsResponse>(
                new java.util.function.Supplier<ListCloudDbSystemsRequest.Builder>() {
                    @Override
                    public ListCloudDbSystemsRequest.Builder get() {
                        return ListCloudDbSystemsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListCloudDbSystemsResponse, String>() {
                    @Override
                    public String apply(ListCloudDbSystemsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListCloudDbSystemsRequest.Builder>,
                        ListCloudDbSystemsRequest>() {
                    @Override
                    public ListCloudDbSystemsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListCloudDbSystemsRequest.Builder>
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
                        ListCloudDbSystemsRequest, ListCloudDbSystemsResponse>() {
                    @Override
                    public ListCloudDbSystemsResponse apply(ListCloudDbSystemsRequest request) {
                        return client.listCloudDbSystems(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link
     * com.oracle.bmc.databasemanagement.model.CloudDbSystemSummary} objects contained in responses
     * from the listCloudDbSystems operation. This iterable will fetch more data from the server as
     * needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link
     *     com.oracle.bmc.databasemanagement.model.CloudDbSystemSummary} objects contained in
     *     responses received from the service.
     */
    public Iterable<com.oracle.bmc.databasemanagement.model.CloudDbSystemSummary>
            listCloudDbSystemsRecordIterator(final ListCloudDbSystemsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListCloudDbSystemsRequest.Builder,
                ListCloudDbSystemsRequest,
                ListCloudDbSystemsResponse,
                com.oracle.bmc.databasemanagement.model.CloudDbSystemSummary>(
                new java.util.function.Supplier<ListCloudDbSystemsRequest.Builder>() {
                    @Override
                    public ListCloudDbSystemsRequest.Builder get() {
                        return ListCloudDbSystemsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListCloudDbSystemsResponse, String>() {
                    @Override
                    public String apply(ListCloudDbSystemsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListCloudDbSystemsRequest.Builder>,
                        ListCloudDbSystemsRequest>() {
                    @Override
                    public ListCloudDbSystemsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListCloudDbSystemsRequest.Builder>
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
                        ListCloudDbSystemsRequest, ListCloudDbSystemsResponse>() {
                    @Override
                    public ListCloudDbSystemsResponse apply(ListCloudDbSystemsRequest request) {
                        return client.listCloudDbSystems(request);
                    }
                },
                new java.util.function.Function<
                        ListCloudDbSystemsResponse,
                        java.util.List<
                                com.oracle.bmc.databasemanagement.model.CloudDbSystemSummary>>() {
                    @Override
                    public java.util.List<
                                    com.oracle.bmc.databasemanagement.model.CloudDbSystemSummary>
                            apply(ListCloudDbSystemsResponse response) {
                        return response.getCloudDbSystemCollection().getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the
     * listCloudListenerServices operation. This iterable will fetch more data from the server as
     * needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses
     *     received from the service.
     */
    public Iterable<ListCloudListenerServicesResponse> listCloudListenerServicesResponseIterator(
            final ListCloudListenerServicesRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListCloudListenerServicesRequest.Builder,
                ListCloudListenerServicesRequest,
                ListCloudListenerServicesResponse>(
                new java.util.function.Supplier<ListCloudListenerServicesRequest.Builder>() {
                    @Override
                    public ListCloudListenerServicesRequest.Builder get() {
                        return ListCloudListenerServicesRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListCloudListenerServicesResponse, String>() {
                    @Override
                    public String apply(ListCloudListenerServicesResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListCloudListenerServicesRequest.Builder>,
                        ListCloudListenerServicesRequest>() {
                    @Override
                    public ListCloudListenerServicesRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListCloudListenerServicesRequest.Builder>
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
                        ListCloudListenerServicesRequest, ListCloudListenerServicesResponse>() {
                    @Override
                    public ListCloudListenerServicesResponse apply(
                            ListCloudListenerServicesRequest request) {
                        return client.listCloudListenerServices(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link
     * com.oracle.bmc.databasemanagement.model.CloudListenerServiceSummary} objects contained in
     * responses from the listCloudListenerServices operation. This iterable will fetch more data
     * from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link
     *     com.oracle.bmc.databasemanagement.model.CloudListenerServiceSummary} objects contained in
     *     responses received from the service.
     */
    public Iterable<com.oracle.bmc.databasemanagement.model.CloudListenerServiceSummary>
            listCloudListenerServicesRecordIterator(
                    final ListCloudListenerServicesRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListCloudListenerServicesRequest.Builder,
                ListCloudListenerServicesRequest,
                ListCloudListenerServicesResponse,
                com.oracle.bmc.databasemanagement.model.CloudListenerServiceSummary>(
                new java.util.function.Supplier<ListCloudListenerServicesRequest.Builder>() {
                    @Override
                    public ListCloudListenerServicesRequest.Builder get() {
                        return ListCloudListenerServicesRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListCloudListenerServicesResponse, String>() {
                    @Override
                    public String apply(ListCloudListenerServicesResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListCloudListenerServicesRequest.Builder>,
                        ListCloudListenerServicesRequest>() {
                    @Override
                    public ListCloudListenerServicesRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListCloudListenerServicesRequest.Builder>
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
                        ListCloudListenerServicesRequest, ListCloudListenerServicesResponse>() {
                    @Override
                    public ListCloudListenerServicesResponse apply(
                            ListCloudListenerServicesRequest request) {
                        return client.listCloudListenerServices(request);
                    }
                },
                new java.util.function.Function<
                        ListCloudListenerServicesResponse,
                        java.util.List<
                                com.oracle.bmc.databasemanagement.model
                                        .CloudListenerServiceSummary>>() {
                    @Override
                    public java.util.List<
                                    com.oracle.bmc.databasemanagement.model
                                            .CloudListenerServiceSummary>
                            apply(ListCloudListenerServicesResponse response) {
                        return response.getCloudListenerServiceCollection().getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the
     * listCloudListeners operation. This iterable will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses
     *     received from the service.
     */
    public Iterable<ListCloudListenersResponse> listCloudListenersResponseIterator(
            final ListCloudListenersRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListCloudListenersRequest.Builder,
                ListCloudListenersRequest,
                ListCloudListenersResponse>(
                new java.util.function.Supplier<ListCloudListenersRequest.Builder>() {
                    @Override
                    public ListCloudListenersRequest.Builder get() {
                        return ListCloudListenersRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListCloudListenersResponse, String>() {
                    @Override
                    public String apply(ListCloudListenersResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListCloudListenersRequest.Builder>,
                        ListCloudListenersRequest>() {
                    @Override
                    public ListCloudListenersRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListCloudListenersRequest.Builder>
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
                        ListCloudListenersRequest, ListCloudListenersResponse>() {
                    @Override
                    public ListCloudListenersResponse apply(ListCloudListenersRequest request) {
                        return client.listCloudListeners(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link
     * com.oracle.bmc.databasemanagement.model.CloudListenerSummary} objects contained in responses
     * from the listCloudListeners operation. This iterable will fetch more data from the server as
     * needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link
     *     com.oracle.bmc.databasemanagement.model.CloudListenerSummary} objects contained in
     *     responses received from the service.
     */
    public Iterable<com.oracle.bmc.databasemanagement.model.CloudListenerSummary>
            listCloudListenersRecordIterator(final ListCloudListenersRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListCloudListenersRequest.Builder,
                ListCloudListenersRequest,
                ListCloudListenersResponse,
                com.oracle.bmc.databasemanagement.model.CloudListenerSummary>(
                new java.util.function.Supplier<ListCloudListenersRequest.Builder>() {
                    @Override
                    public ListCloudListenersRequest.Builder get() {
                        return ListCloudListenersRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListCloudListenersResponse, String>() {
                    @Override
                    public String apply(ListCloudListenersResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListCloudListenersRequest.Builder>,
                        ListCloudListenersRequest>() {
                    @Override
                    public ListCloudListenersRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListCloudListenersRequest.Builder>
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
                        ListCloudListenersRequest, ListCloudListenersResponse>() {
                    @Override
                    public ListCloudListenersResponse apply(ListCloudListenersRequest request) {
                        return client.listCloudListeners(request);
                    }
                },
                new java.util.function.Function<
                        ListCloudListenersResponse,
                        java.util.List<
                                com.oracle.bmc.databasemanagement.model.CloudListenerSummary>>() {
                    @Override
                    public java.util.List<
                                    com.oracle.bmc.databasemanagement.model.CloudListenerSummary>
                            apply(ListCloudListenersResponse response) {
                        return response.getCloudListenerCollection().getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the
     * listConsumerGroupPrivileges operation. This iterable will fetch more data from the server as
     * needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses
     *     received from the service.
     */
    public Iterable<ListConsumerGroupPrivilegesResponse>
            listConsumerGroupPrivilegesResponseIterator(
                    final ListConsumerGroupPrivilegesRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListConsumerGroupPrivilegesRequest.Builder,
                ListConsumerGroupPrivilegesRequest,
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
     * Creates a new iterable which will iterate over the {@link
     * com.oracle.bmc.databasemanagement.model.ConsumerGroupPrivilegeSummary} objects contained in
     * responses from the listConsumerGroupPrivileges operation. This iterable will fetch more data
     * from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link
     *     com.oracle.bmc.databasemanagement.model.ConsumerGroupPrivilegeSummary} objects contained
     *     in responses received from the service.
     */
    public Iterable<com.oracle.bmc.databasemanagement.model.ConsumerGroupPrivilegeSummary>
            listConsumerGroupPrivilegesRecordIterator(
                    final ListConsumerGroupPrivilegesRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListConsumerGroupPrivilegesRequest.Builder,
                ListConsumerGroupPrivilegesRequest,
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
     * Creates a new iterable which will iterate over the responses received from the
     * listCursorCacheStatements operation. This iterable will fetch more data from the server as
     * needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses
     *     received from the service.
     */
    public Iterable<ListCursorCacheStatementsResponse> listCursorCacheStatementsResponseIterator(
            final ListCursorCacheStatementsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListCursorCacheStatementsRequest.Builder,
                ListCursorCacheStatementsRequest,
                ListCursorCacheStatementsResponse>(
                new java.util.function.Supplier<ListCursorCacheStatementsRequest.Builder>() {
                    @Override
                    public ListCursorCacheStatementsRequest.Builder get() {
                        return ListCursorCacheStatementsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListCursorCacheStatementsResponse, String>() {
                    @Override
                    public String apply(ListCursorCacheStatementsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListCursorCacheStatementsRequest.Builder>,
                        ListCursorCacheStatementsRequest>() {
                    @Override
                    public ListCursorCacheStatementsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListCursorCacheStatementsRequest.Builder>
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
                        ListCursorCacheStatementsRequest, ListCursorCacheStatementsResponse>() {
                    @Override
                    public ListCursorCacheStatementsResponse apply(
                            ListCursorCacheStatementsRequest request) {
                        return client.listCursorCacheStatements(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link
     * com.oracle.bmc.databasemanagement.model.CursorCacheStatementSummary} objects contained in
     * responses from the listCursorCacheStatements operation. This iterable will fetch more data
     * from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link
     *     com.oracle.bmc.databasemanagement.model.CursorCacheStatementSummary} objects contained in
     *     responses received from the service.
     */
    public Iterable<com.oracle.bmc.databasemanagement.model.CursorCacheStatementSummary>
            listCursorCacheStatementsRecordIterator(
                    final ListCursorCacheStatementsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListCursorCacheStatementsRequest.Builder,
                ListCursorCacheStatementsRequest,
                ListCursorCacheStatementsResponse,
                com.oracle.bmc.databasemanagement.model.CursorCacheStatementSummary>(
                new java.util.function.Supplier<ListCursorCacheStatementsRequest.Builder>() {
                    @Override
                    public ListCursorCacheStatementsRequest.Builder get() {
                        return ListCursorCacheStatementsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListCursorCacheStatementsResponse, String>() {
                    @Override
                    public String apply(ListCursorCacheStatementsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListCursorCacheStatementsRequest.Builder>,
                        ListCursorCacheStatementsRequest>() {
                    @Override
                    public ListCursorCacheStatementsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListCursorCacheStatementsRequest.Builder>
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
                        ListCursorCacheStatementsRequest, ListCursorCacheStatementsResponse>() {
                    @Override
                    public ListCursorCacheStatementsResponse apply(
                            ListCursorCacheStatementsRequest request) {
                        return client.listCursorCacheStatements(request);
                    }
                },
                new java.util.function.Function<
                        ListCursorCacheStatementsResponse,
                        java.util.List<
                                com.oracle.bmc.databasemanagement.model
                                        .CursorCacheStatementSummary>>() {
                    @Override
                    public java.util.List<
                                    com.oracle.bmc.databasemanagement.model
                                            .CursorCacheStatementSummary>
                            apply(ListCursorCacheStatementsResponse response) {
                        return response.getCursorCacheStatementCollection().getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the
     * listDataAccessContainers operation. This iterable will fetch more data from the server as
     * needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses
     *     received from the service.
     */
    public Iterable<ListDataAccessContainersResponse> listDataAccessContainersResponseIterator(
            final ListDataAccessContainersRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListDataAccessContainersRequest.Builder,
                ListDataAccessContainersRequest,
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
     * Creates a new iterable which will iterate over the {@link
     * com.oracle.bmc.databasemanagement.model.DataAccessContainerSummary} objects contained in
     * responses from the listDataAccessContainers operation. This iterable will fetch more data
     * from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link
     *     com.oracle.bmc.databasemanagement.model.DataAccessContainerSummary} objects contained in
     *     responses received from the service.
     */
    public Iterable<com.oracle.bmc.databasemanagement.model.DataAccessContainerSummary>
            listDataAccessContainersRecordIterator(final ListDataAccessContainersRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListDataAccessContainersRequest.Builder,
                ListDataAccessContainersRequest,
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
     * Creates a new iterable which will iterate over the responses received from the
     * listDbManagementPrivateEndpoints operation. This iterable will fetch more data from the
     * server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses
     *     received from the service.
     */
    public Iterable<ListDbManagementPrivateEndpointsResponse>
            listDbManagementPrivateEndpointsResponseIterator(
                    final ListDbManagementPrivateEndpointsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListDbManagementPrivateEndpointsRequest.Builder,
                ListDbManagementPrivateEndpointsRequest,
                ListDbManagementPrivateEndpointsResponse>(
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
     * Creates a new iterable which will iterate over the {@link
     * com.oracle.bmc.databasemanagement.model.DbManagementPrivateEndpointSummary} objects contained
     * in responses from the listDbManagementPrivateEndpoints operation. This iterable will fetch
     * more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link
     *     com.oracle.bmc.databasemanagement.model.DbManagementPrivateEndpointSummary} objects
     *     contained in responses received from the service.
     */
    public Iterable<com.oracle.bmc.databasemanagement.model.DbManagementPrivateEndpointSummary>
            listDbManagementPrivateEndpointsRecordIterator(
                    final ListDbManagementPrivateEndpointsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListDbManagementPrivateEndpointsRequest.Builder,
                ListDbManagementPrivateEndpointsRequest,
                ListDbManagementPrivateEndpointsResponse,
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
     * Creates a new iterable which will iterate over the responses received from the
     * listExternalAsmDiskGroups operation. This iterable will fetch more data from the server as
     * needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses
     *     received from the service.
     */
    public Iterable<ListExternalAsmDiskGroupsResponse> listExternalAsmDiskGroupsResponseIterator(
            final ListExternalAsmDiskGroupsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListExternalAsmDiskGroupsRequest.Builder,
                ListExternalAsmDiskGroupsRequest,
                ListExternalAsmDiskGroupsResponse>(
                new java.util.function.Supplier<ListExternalAsmDiskGroupsRequest.Builder>() {
                    @Override
                    public ListExternalAsmDiskGroupsRequest.Builder get() {
                        return ListExternalAsmDiskGroupsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListExternalAsmDiskGroupsResponse, String>() {
                    @Override
                    public String apply(ListExternalAsmDiskGroupsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListExternalAsmDiskGroupsRequest.Builder>,
                        ListExternalAsmDiskGroupsRequest>() {
                    @Override
                    public ListExternalAsmDiskGroupsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListExternalAsmDiskGroupsRequest.Builder>
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
                        ListExternalAsmDiskGroupsRequest, ListExternalAsmDiskGroupsResponse>() {
                    @Override
                    public ListExternalAsmDiskGroupsResponse apply(
                            ListExternalAsmDiskGroupsRequest request) {
                        return client.listExternalAsmDiskGroups(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link
     * com.oracle.bmc.databasemanagement.model.ExternalAsmDiskGroupSummary} objects contained in
     * responses from the listExternalAsmDiskGroups operation. This iterable will fetch more data
     * from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link
     *     com.oracle.bmc.databasemanagement.model.ExternalAsmDiskGroupSummary} objects contained in
     *     responses received from the service.
     */
    public Iterable<com.oracle.bmc.databasemanagement.model.ExternalAsmDiskGroupSummary>
            listExternalAsmDiskGroupsRecordIterator(
                    final ListExternalAsmDiskGroupsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListExternalAsmDiskGroupsRequest.Builder,
                ListExternalAsmDiskGroupsRequest,
                ListExternalAsmDiskGroupsResponse,
                com.oracle.bmc.databasemanagement.model.ExternalAsmDiskGroupSummary>(
                new java.util.function.Supplier<ListExternalAsmDiskGroupsRequest.Builder>() {
                    @Override
                    public ListExternalAsmDiskGroupsRequest.Builder get() {
                        return ListExternalAsmDiskGroupsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListExternalAsmDiskGroupsResponse, String>() {
                    @Override
                    public String apply(ListExternalAsmDiskGroupsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListExternalAsmDiskGroupsRequest.Builder>,
                        ListExternalAsmDiskGroupsRequest>() {
                    @Override
                    public ListExternalAsmDiskGroupsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListExternalAsmDiskGroupsRequest.Builder>
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
                        ListExternalAsmDiskGroupsRequest, ListExternalAsmDiskGroupsResponse>() {
                    @Override
                    public ListExternalAsmDiskGroupsResponse apply(
                            ListExternalAsmDiskGroupsRequest request) {
                        return client.listExternalAsmDiskGroups(request);
                    }
                },
                new java.util.function.Function<
                        ListExternalAsmDiskGroupsResponse,
                        java.util.List<
                                com.oracle.bmc.databasemanagement.model
                                        .ExternalAsmDiskGroupSummary>>() {
                    @Override
                    public java.util.List<
                                    com.oracle.bmc.databasemanagement.model
                                            .ExternalAsmDiskGroupSummary>
                            apply(ListExternalAsmDiskGroupsResponse response) {
                        return response.getExternalAsmDiskGroupCollection().getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the
     * listExternalAsmInstances operation. This iterable will fetch more data from the server as
     * needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses
     *     received from the service.
     */
    public Iterable<ListExternalAsmInstancesResponse> listExternalAsmInstancesResponseIterator(
            final ListExternalAsmInstancesRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListExternalAsmInstancesRequest.Builder,
                ListExternalAsmInstancesRequest,
                ListExternalAsmInstancesResponse>(
                new java.util.function.Supplier<ListExternalAsmInstancesRequest.Builder>() {
                    @Override
                    public ListExternalAsmInstancesRequest.Builder get() {
                        return ListExternalAsmInstancesRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListExternalAsmInstancesResponse, String>() {
                    @Override
                    public String apply(ListExternalAsmInstancesResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListExternalAsmInstancesRequest.Builder>,
                        ListExternalAsmInstancesRequest>() {
                    @Override
                    public ListExternalAsmInstancesRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListExternalAsmInstancesRequest.Builder>
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
                        ListExternalAsmInstancesRequest, ListExternalAsmInstancesResponse>() {
                    @Override
                    public ListExternalAsmInstancesResponse apply(
                            ListExternalAsmInstancesRequest request) {
                        return client.listExternalAsmInstances(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link
     * com.oracle.bmc.databasemanagement.model.ExternalAsmInstanceSummary} objects contained in
     * responses from the listExternalAsmInstances operation. This iterable will fetch more data
     * from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link
     *     com.oracle.bmc.databasemanagement.model.ExternalAsmInstanceSummary} objects contained in
     *     responses received from the service.
     */
    public Iterable<com.oracle.bmc.databasemanagement.model.ExternalAsmInstanceSummary>
            listExternalAsmInstancesRecordIterator(final ListExternalAsmInstancesRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListExternalAsmInstancesRequest.Builder,
                ListExternalAsmInstancesRequest,
                ListExternalAsmInstancesResponse,
                com.oracle.bmc.databasemanagement.model.ExternalAsmInstanceSummary>(
                new java.util.function.Supplier<ListExternalAsmInstancesRequest.Builder>() {
                    @Override
                    public ListExternalAsmInstancesRequest.Builder get() {
                        return ListExternalAsmInstancesRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListExternalAsmInstancesResponse, String>() {
                    @Override
                    public String apply(ListExternalAsmInstancesResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListExternalAsmInstancesRequest.Builder>,
                        ListExternalAsmInstancesRequest>() {
                    @Override
                    public ListExternalAsmInstancesRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListExternalAsmInstancesRequest.Builder>
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
                        ListExternalAsmInstancesRequest, ListExternalAsmInstancesResponse>() {
                    @Override
                    public ListExternalAsmInstancesResponse apply(
                            ListExternalAsmInstancesRequest request) {
                        return client.listExternalAsmInstances(request);
                    }
                },
                new java.util.function.Function<
                        ListExternalAsmInstancesResponse,
                        java.util.List<
                                com.oracle.bmc.databasemanagement.model
                                        .ExternalAsmInstanceSummary>>() {
                    @Override
                    public java.util.List<
                                    com.oracle.bmc.databasemanagement.model
                                            .ExternalAsmInstanceSummary>
                            apply(ListExternalAsmInstancesResponse response) {
                        return response.getExternalAsmInstanceCollection().getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the
     * listExternalAsmUsers operation. This iterable will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses
     *     received from the service.
     */
    public Iterable<ListExternalAsmUsersResponse> listExternalAsmUsersResponseIterator(
            final ListExternalAsmUsersRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListExternalAsmUsersRequest.Builder,
                ListExternalAsmUsersRequest,
                ListExternalAsmUsersResponse>(
                new java.util.function.Supplier<ListExternalAsmUsersRequest.Builder>() {
                    @Override
                    public ListExternalAsmUsersRequest.Builder get() {
                        return ListExternalAsmUsersRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListExternalAsmUsersResponse, String>() {
                    @Override
                    public String apply(ListExternalAsmUsersResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListExternalAsmUsersRequest.Builder>,
                        ListExternalAsmUsersRequest>() {
                    @Override
                    public ListExternalAsmUsersRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListExternalAsmUsersRequest.Builder>
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
                        ListExternalAsmUsersRequest, ListExternalAsmUsersResponse>() {
                    @Override
                    public ListExternalAsmUsersResponse apply(ListExternalAsmUsersRequest request) {
                        return client.listExternalAsmUsers(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link
     * com.oracle.bmc.databasemanagement.model.ExternalAsmUserSummary} objects contained in
     * responses from the listExternalAsmUsers operation. This iterable will fetch more data from
     * the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link
     *     com.oracle.bmc.databasemanagement.model.ExternalAsmUserSummary} objects contained in
     *     responses received from the service.
     */
    public Iterable<com.oracle.bmc.databasemanagement.model.ExternalAsmUserSummary>
            listExternalAsmUsersRecordIterator(final ListExternalAsmUsersRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListExternalAsmUsersRequest.Builder,
                ListExternalAsmUsersRequest,
                ListExternalAsmUsersResponse,
                com.oracle.bmc.databasemanagement.model.ExternalAsmUserSummary>(
                new java.util.function.Supplier<ListExternalAsmUsersRequest.Builder>() {
                    @Override
                    public ListExternalAsmUsersRequest.Builder get() {
                        return ListExternalAsmUsersRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListExternalAsmUsersResponse, String>() {
                    @Override
                    public String apply(ListExternalAsmUsersResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListExternalAsmUsersRequest.Builder>,
                        ListExternalAsmUsersRequest>() {
                    @Override
                    public ListExternalAsmUsersRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListExternalAsmUsersRequest.Builder>
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
                        ListExternalAsmUsersRequest, ListExternalAsmUsersResponse>() {
                    @Override
                    public ListExternalAsmUsersResponse apply(ListExternalAsmUsersRequest request) {
                        return client.listExternalAsmUsers(request);
                    }
                },
                new java.util.function.Function<
                        ListExternalAsmUsersResponse,
                        java.util.List<
                                com.oracle.bmc.databasemanagement.model.ExternalAsmUserSummary>>() {
                    @Override
                    public java.util.List<
                                    com.oracle.bmc.databasemanagement.model.ExternalAsmUserSummary>
                            apply(ListExternalAsmUsersResponse response) {
                        return response.getExternalAsmUserCollection().getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the
     * listExternalAsms operation. This iterable will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses
     *     received from the service.
     */
    public Iterable<ListExternalAsmsResponse> listExternalAsmsResponseIterator(
            final ListExternalAsmsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListExternalAsmsRequest.Builder, ListExternalAsmsRequest, ListExternalAsmsResponse>(
                new java.util.function.Supplier<ListExternalAsmsRequest.Builder>() {
                    @Override
                    public ListExternalAsmsRequest.Builder get() {
                        return ListExternalAsmsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListExternalAsmsResponse, String>() {
                    @Override
                    public String apply(ListExternalAsmsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListExternalAsmsRequest.Builder>,
                        ListExternalAsmsRequest>() {
                    @Override
                    public ListExternalAsmsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListExternalAsmsRequest.Builder>
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
                        ListExternalAsmsRequest, ListExternalAsmsResponse>() {
                    @Override
                    public ListExternalAsmsResponse apply(ListExternalAsmsRequest request) {
                        return client.listExternalAsms(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link
     * com.oracle.bmc.databasemanagement.model.ExternalAsmSummary} objects contained in responses
     * from the listExternalAsms operation. This iterable will fetch more data from the server as
     * needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link
     *     com.oracle.bmc.databasemanagement.model.ExternalAsmSummary} objects contained in
     *     responses received from the service.
     */
    public Iterable<com.oracle.bmc.databasemanagement.model.ExternalAsmSummary>
            listExternalAsmsRecordIterator(final ListExternalAsmsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListExternalAsmsRequest.Builder,
                ListExternalAsmsRequest,
                ListExternalAsmsResponse,
                com.oracle.bmc.databasemanagement.model.ExternalAsmSummary>(
                new java.util.function.Supplier<ListExternalAsmsRequest.Builder>() {
                    @Override
                    public ListExternalAsmsRequest.Builder get() {
                        return ListExternalAsmsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListExternalAsmsResponse, String>() {
                    @Override
                    public String apply(ListExternalAsmsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListExternalAsmsRequest.Builder>,
                        ListExternalAsmsRequest>() {
                    @Override
                    public ListExternalAsmsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListExternalAsmsRequest.Builder>
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
                        ListExternalAsmsRequest, ListExternalAsmsResponse>() {
                    @Override
                    public ListExternalAsmsResponse apply(ListExternalAsmsRequest request) {
                        return client.listExternalAsms(request);
                    }
                },
                new java.util.function.Function<
                        ListExternalAsmsResponse,
                        java.util.List<
                                com.oracle.bmc.databasemanagement.model.ExternalAsmSummary>>() {
                    @Override
                    public java.util.List<
                                    com.oracle.bmc.databasemanagement.model.ExternalAsmSummary>
                            apply(ListExternalAsmsResponse response) {
                        return response.getExternalAsmCollection().getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the
     * listExternalClusterInstances operation. This iterable will fetch more data from the server as
     * needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses
     *     received from the service.
     */
    public Iterable<ListExternalClusterInstancesResponse>
            listExternalClusterInstancesResponseIterator(
                    final ListExternalClusterInstancesRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListExternalClusterInstancesRequest.Builder,
                ListExternalClusterInstancesRequest,
                ListExternalClusterInstancesResponse>(
                new java.util.function.Supplier<ListExternalClusterInstancesRequest.Builder>() {
                    @Override
                    public ListExternalClusterInstancesRequest.Builder get() {
                        return ListExternalClusterInstancesRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListExternalClusterInstancesResponse, String>() {
                    @Override
                    public String apply(ListExternalClusterInstancesResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListExternalClusterInstancesRequest.Builder>,
                        ListExternalClusterInstancesRequest>() {
                    @Override
                    public ListExternalClusterInstancesRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListExternalClusterInstancesRequest.Builder>
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
                        ListExternalClusterInstancesRequest,
                        ListExternalClusterInstancesResponse>() {
                    @Override
                    public ListExternalClusterInstancesResponse apply(
                            ListExternalClusterInstancesRequest request) {
                        return client.listExternalClusterInstances(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link
     * com.oracle.bmc.databasemanagement.model.ExternalClusterInstanceSummary} objects contained in
     * responses from the listExternalClusterInstances operation. This iterable will fetch more data
     * from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link
     *     com.oracle.bmc.databasemanagement.model.ExternalClusterInstanceSummary} objects contained
     *     in responses received from the service.
     */
    public Iterable<com.oracle.bmc.databasemanagement.model.ExternalClusterInstanceSummary>
            listExternalClusterInstancesRecordIterator(
                    final ListExternalClusterInstancesRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListExternalClusterInstancesRequest.Builder,
                ListExternalClusterInstancesRequest,
                ListExternalClusterInstancesResponse,
                com.oracle.bmc.databasemanagement.model.ExternalClusterInstanceSummary>(
                new java.util.function.Supplier<ListExternalClusterInstancesRequest.Builder>() {
                    @Override
                    public ListExternalClusterInstancesRequest.Builder get() {
                        return ListExternalClusterInstancesRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListExternalClusterInstancesResponse, String>() {
                    @Override
                    public String apply(ListExternalClusterInstancesResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListExternalClusterInstancesRequest.Builder>,
                        ListExternalClusterInstancesRequest>() {
                    @Override
                    public ListExternalClusterInstancesRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListExternalClusterInstancesRequest.Builder>
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
                        ListExternalClusterInstancesRequest,
                        ListExternalClusterInstancesResponse>() {
                    @Override
                    public ListExternalClusterInstancesResponse apply(
                            ListExternalClusterInstancesRequest request) {
                        return client.listExternalClusterInstances(request);
                    }
                },
                new java.util.function.Function<
                        ListExternalClusterInstancesResponse,
                        java.util.List<
                                com.oracle.bmc.databasemanagement.model
                                        .ExternalClusterInstanceSummary>>() {
                    @Override
                    public java.util.List<
                                    com.oracle.bmc.databasemanagement.model
                                            .ExternalClusterInstanceSummary>
                            apply(ListExternalClusterInstancesResponse response) {
                        return response.getExternalClusterInstanceCollection().getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the
     * listExternalClusters operation. This iterable will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses
     *     received from the service.
     */
    public Iterable<ListExternalClustersResponse> listExternalClustersResponseIterator(
            final ListExternalClustersRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListExternalClustersRequest.Builder,
                ListExternalClustersRequest,
                ListExternalClustersResponse>(
                new java.util.function.Supplier<ListExternalClustersRequest.Builder>() {
                    @Override
                    public ListExternalClustersRequest.Builder get() {
                        return ListExternalClustersRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListExternalClustersResponse, String>() {
                    @Override
                    public String apply(ListExternalClustersResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListExternalClustersRequest.Builder>,
                        ListExternalClustersRequest>() {
                    @Override
                    public ListExternalClustersRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListExternalClustersRequest.Builder>
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
                        ListExternalClustersRequest, ListExternalClustersResponse>() {
                    @Override
                    public ListExternalClustersResponse apply(ListExternalClustersRequest request) {
                        return client.listExternalClusters(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link
     * com.oracle.bmc.databasemanagement.model.ExternalClusterSummary} objects contained in
     * responses from the listExternalClusters operation. This iterable will fetch more data from
     * the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link
     *     com.oracle.bmc.databasemanagement.model.ExternalClusterSummary} objects contained in
     *     responses received from the service.
     */
    public Iterable<com.oracle.bmc.databasemanagement.model.ExternalClusterSummary>
            listExternalClustersRecordIterator(final ListExternalClustersRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListExternalClustersRequest.Builder,
                ListExternalClustersRequest,
                ListExternalClustersResponse,
                com.oracle.bmc.databasemanagement.model.ExternalClusterSummary>(
                new java.util.function.Supplier<ListExternalClustersRequest.Builder>() {
                    @Override
                    public ListExternalClustersRequest.Builder get() {
                        return ListExternalClustersRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListExternalClustersResponse, String>() {
                    @Override
                    public String apply(ListExternalClustersResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListExternalClustersRequest.Builder>,
                        ListExternalClustersRequest>() {
                    @Override
                    public ListExternalClustersRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListExternalClustersRequest.Builder>
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
                        ListExternalClustersRequest, ListExternalClustersResponse>() {
                    @Override
                    public ListExternalClustersResponse apply(ListExternalClustersRequest request) {
                        return client.listExternalClusters(request);
                    }
                },
                new java.util.function.Function<
                        ListExternalClustersResponse,
                        java.util.List<
                                com.oracle.bmc.databasemanagement.model.ExternalClusterSummary>>() {
                    @Override
                    public java.util.List<
                                    com.oracle.bmc.databasemanagement.model.ExternalClusterSummary>
                            apply(ListExternalClustersResponse response) {
                        return response.getExternalClusterCollection().getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the
     * listExternalDatabases operation. This iterable will fetch more data from the server as
     * needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses
     *     received from the service.
     */
    public Iterable<ListExternalDatabasesResponse> listExternalDatabasesResponseIterator(
            final ListExternalDatabasesRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListExternalDatabasesRequest.Builder,
                ListExternalDatabasesRequest,
                ListExternalDatabasesResponse>(
                new java.util.function.Supplier<ListExternalDatabasesRequest.Builder>() {
                    @Override
                    public ListExternalDatabasesRequest.Builder get() {
                        return ListExternalDatabasesRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListExternalDatabasesResponse, String>() {
                    @Override
                    public String apply(ListExternalDatabasesResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListExternalDatabasesRequest.Builder>,
                        ListExternalDatabasesRequest>() {
                    @Override
                    public ListExternalDatabasesRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListExternalDatabasesRequest.Builder>
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
                        ListExternalDatabasesRequest, ListExternalDatabasesResponse>() {
                    @Override
                    public ListExternalDatabasesResponse apply(
                            ListExternalDatabasesRequest request) {
                        return client.listExternalDatabases(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link
     * com.oracle.bmc.databasemanagement.model.ExternalDatabaseSummary} objects contained in
     * responses from the listExternalDatabases operation. This iterable will fetch more data from
     * the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link
     *     com.oracle.bmc.databasemanagement.model.ExternalDatabaseSummary} objects contained in
     *     responses received from the service.
     */
    public Iterable<com.oracle.bmc.databasemanagement.model.ExternalDatabaseSummary>
            listExternalDatabasesRecordIterator(final ListExternalDatabasesRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListExternalDatabasesRequest.Builder,
                ListExternalDatabasesRequest,
                ListExternalDatabasesResponse,
                com.oracle.bmc.databasemanagement.model.ExternalDatabaseSummary>(
                new java.util.function.Supplier<ListExternalDatabasesRequest.Builder>() {
                    @Override
                    public ListExternalDatabasesRequest.Builder get() {
                        return ListExternalDatabasesRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListExternalDatabasesResponse, String>() {
                    @Override
                    public String apply(ListExternalDatabasesResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListExternalDatabasesRequest.Builder>,
                        ListExternalDatabasesRequest>() {
                    @Override
                    public ListExternalDatabasesRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListExternalDatabasesRequest.Builder>
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
                        ListExternalDatabasesRequest, ListExternalDatabasesResponse>() {
                    @Override
                    public ListExternalDatabasesResponse apply(
                            ListExternalDatabasesRequest request) {
                        return client.listExternalDatabases(request);
                    }
                },
                new java.util.function.Function<
                        ListExternalDatabasesResponse,
                        java.util.List<
                                com.oracle.bmc.databasemanagement.model
                                        .ExternalDatabaseSummary>>() {
                    @Override
                    public java.util.List<
                                    com.oracle.bmc.databasemanagement.model.ExternalDatabaseSummary>
                            apply(ListExternalDatabasesResponse response) {
                        return response.getExternalDatabaseCollection().getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the
     * listExternalDbHomes operation. This iterable will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses
     *     received from the service.
     */
    public Iterable<ListExternalDbHomesResponse> listExternalDbHomesResponseIterator(
            final ListExternalDbHomesRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListExternalDbHomesRequest.Builder,
                ListExternalDbHomesRequest,
                ListExternalDbHomesResponse>(
                new java.util.function.Supplier<ListExternalDbHomesRequest.Builder>() {
                    @Override
                    public ListExternalDbHomesRequest.Builder get() {
                        return ListExternalDbHomesRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListExternalDbHomesResponse, String>() {
                    @Override
                    public String apply(ListExternalDbHomesResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListExternalDbHomesRequest.Builder>,
                        ListExternalDbHomesRequest>() {
                    @Override
                    public ListExternalDbHomesRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListExternalDbHomesRequest.Builder>
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
                        ListExternalDbHomesRequest, ListExternalDbHomesResponse>() {
                    @Override
                    public ListExternalDbHomesResponse apply(ListExternalDbHomesRequest request) {
                        return client.listExternalDbHomes(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link
     * com.oracle.bmc.databasemanagement.model.ExternalDbHomeSummary} objects contained in responses
     * from the listExternalDbHomes operation. This iterable will fetch more data from the server as
     * needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link
     *     com.oracle.bmc.databasemanagement.model.ExternalDbHomeSummary} objects contained in
     *     responses received from the service.
     */
    public Iterable<com.oracle.bmc.databasemanagement.model.ExternalDbHomeSummary>
            listExternalDbHomesRecordIterator(final ListExternalDbHomesRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListExternalDbHomesRequest.Builder,
                ListExternalDbHomesRequest,
                ListExternalDbHomesResponse,
                com.oracle.bmc.databasemanagement.model.ExternalDbHomeSummary>(
                new java.util.function.Supplier<ListExternalDbHomesRequest.Builder>() {
                    @Override
                    public ListExternalDbHomesRequest.Builder get() {
                        return ListExternalDbHomesRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListExternalDbHomesResponse, String>() {
                    @Override
                    public String apply(ListExternalDbHomesResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListExternalDbHomesRequest.Builder>,
                        ListExternalDbHomesRequest>() {
                    @Override
                    public ListExternalDbHomesRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListExternalDbHomesRequest.Builder>
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
                        ListExternalDbHomesRequest, ListExternalDbHomesResponse>() {
                    @Override
                    public ListExternalDbHomesResponse apply(ListExternalDbHomesRequest request) {
                        return client.listExternalDbHomes(request);
                    }
                },
                new java.util.function.Function<
                        ListExternalDbHomesResponse,
                        java.util.List<
                                com.oracle.bmc.databasemanagement.model.ExternalDbHomeSummary>>() {
                    @Override
                    public java.util.List<
                                    com.oracle.bmc.databasemanagement.model.ExternalDbHomeSummary>
                            apply(ListExternalDbHomesResponse response) {
                        return response.getExternalDbHomeCollection().getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the
     * listExternalDbNodes operation. This iterable will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses
     *     received from the service.
     */
    public Iterable<ListExternalDbNodesResponse> listExternalDbNodesResponseIterator(
            final ListExternalDbNodesRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListExternalDbNodesRequest.Builder,
                ListExternalDbNodesRequest,
                ListExternalDbNodesResponse>(
                new java.util.function.Supplier<ListExternalDbNodesRequest.Builder>() {
                    @Override
                    public ListExternalDbNodesRequest.Builder get() {
                        return ListExternalDbNodesRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListExternalDbNodesResponse, String>() {
                    @Override
                    public String apply(ListExternalDbNodesResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListExternalDbNodesRequest.Builder>,
                        ListExternalDbNodesRequest>() {
                    @Override
                    public ListExternalDbNodesRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListExternalDbNodesRequest.Builder>
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
                        ListExternalDbNodesRequest, ListExternalDbNodesResponse>() {
                    @Override
                    public ListExternalDbNodesResponse apply(ListExternalDbNodesRequest request) {
                        return client.listExternalDbNodes(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link
     * com.oracle.bmc.databasemanagement.model.ExternalDbNodeSummary} objects contained in responses
     * from the listExternalDbNodes operation. This iterable will fetch more data from the server as
     * needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link
     *     com.oracle.bmc.databasemanagement.model.ExternalDbNodeSummary} objects contained in
     *     responses received from the service.
     */
    public Iterable<com.oracle.bmc.databasemanagement.model.ExternalDbNodeSummary>
            listExternalDbNodesRecordIterator(final ListExternalDbNodesRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListExternalDbNodesRequest.Builder,
                ListExternalDbNodesRequest,
                ListExternalDbNodesResponse,
                com.oracle.bmc.databasemanagement.model.ExternalDbNodeSummary>(
                new java.util.function.Supplier<ListExternalDbNodesRequest.Builder>() {
                    @Override
                    public ListExternalDbNodesRequest.Builder get() {
                        return ListExternalDbNodesRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListExternalDbNodesResponse, String>() {
                    @Override
                    public String apply(ListExternalDbNodesResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListExternalDbNodesRequest.Builder>,
                        ListExternalDbNodesRequest>() {
                    @Override
                    public ListExternalDbNodesRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListExternalDbNodesRequest.Builder>
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
                        ListExternalDbNodesRequest, ListExternalDbNodesResponse>() {
                    @Override
                    public ListExternalDbNodesResponse apply(ListExternalDbNodesRequest request) {
                        return client.listExternalDbNodes(request);
                    }
                },
                new java.util.function.Function<
                        ListExternalDbNodesResponse,
                        java.util.List<
                                com.oracle.bmc.databasemanagement.model.ExternalDbNodeSummary>>() {
                    @Override
                    public java.util.List<
                                    com.oracle.bmc.databasemanagement.model.ExternalDbNodeSummary>
                            apply(ListExternalDbNodesResponse response) {
                        return response.getExternalDbNodeCollection().getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the
     * listExternalDbSystemConnectors operation. This iterable will fetch more data from the server
     * as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses
     *     received from the service.
     */
    public Iterable<ListExternalDbSystemConnectorsResponse>
            listExternalDbSystemConnectorsResponseIterator(
                    final ListExternalDbSystemConnectorsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListExternalDbSystemConnectorsRequest.Builder,
                ListExternalDbSystemConnectorsRequest,
                ListExternalDbSystemConnectorsResponse>(
                new java.util.function.Supplier<ListExternalDbSystemConnectorsRequest.Builder>() {
                    @Override
                    public ListExternalDbSystemConnectorsRequest.Builder get() {
                        return ListExternalDbSystemConnectorsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListExternalDbSystemConnectorsResponse, String>() {
                    @Override
                    public String apply(ListExternalDbSystemConnectorsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListExternalDbSystemConnectorsRequest.Builder>,
                        ListExternalDbSystemConnectorsRequest>() {
                    @Override
                    public ListExternalDbSystemConnectorsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListExternalDbSystemConnectorsRequest.Builder>
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
                        ListExternalDbSystemConnectorsRequest,
                        ListExternalDbSystemConnectorsResponse>() {
                    @Override
                    public ListExternalDbSystemConnectorsResponse apply(
                            ListExternalDbSystemConnectorsRequest request) {
                        return client.listExternalDbSystemConnectors(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link
     * com.oracle.bmc.databasemanagement.model.ExternalDbSystemConnectorSummary} objects contained
     * in responses from the listExternalDbSystemConnectors operation. This iterable will fetch more
     * data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link
     *     com.oracle.bmc.databasemanagement.model.ExternalDbSystemConnectorSummary} objects
     *     contained in responses received from the service.
     */
    public Iterable<com.oracle.bmc.databasemanagement.model.ExternalDbSystemConnectorSummary>
            listExternalDbSystemConnectorsRecordIterator(
                    final ListExternalDbSystemConnectorsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListExternalDbSystemConnectorsRequest.Builder,
                ListExternalDbSystemConnectorsRequest,
                ListExternalDbSystemConnectorsResponse,
                com.oracle.bmc.databasemanagement.model.ExternalDbSystemConnectorSummary>(
                new java.util.function.Supplier<ListExternalDbSystemConnectorsRequest.Builder>() {
                    @Override
                    public ListExternalDbSystemConnectorsRequest.Builder get() {
                        return ListExternalDbSystemConnectorsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListExternalDbSystemConnectorsResponse, String>() {
                    @Override
                    public String apply(ListExternalDbSystemConnectorsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListExternalDbSystemConnectorsRequest.Builder>,
                        ListExternalDbSystemConnectorsRequest>() {
                    @Override
                    public ListExternalDbSystemConnectorsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListExternalDbSystemConnectorsRequest.Builder>
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
                        ListExternalDbSystemConnectorsRequest,
                        ListExternalDbSystemConnectorsResponse>() {
                    @Override
                    public ListExternalDbSystemConnectorsResponse apply(
                            ListExternalDbSystemConnectorsRequest request) {
                        return client.listExternalDbSystemConnectors(request);
                    }
                },
                new java.util.function.Function<
                        ListExternalDbSystemConnectorsResponse,
                        java.util.List<
                                com.oracle.bmc.databasemanagement.model
                                        .ExternalDbSystemConnectorSummary>>() {
                    @Override
                    public java.util.List<
                                    com.oracle.bmc.databasemanagement.model
                                            .ExternalDbSystemConnectorSummary>
                            apply(ListExternalDbSystemConnectorsResponse response) {
                        return response.getExternalDbSystemConnectorCollection().getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the
     * listExternalDbSystemDiscoveries operation. This iterable will fetch more data from the server
     * as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses
     *     received from the service.
     */
    public Iterable<ListExternalDbSystemDiscoveriesResponse>
            listExternalDbSystemDiscoveriesResponseIterator(
                    final ListExternalDbSystemDiscoveriesRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListExternalDbSystemDiscoveriesRequest.Builder,
                ListExternalDbSystemDiscoveriesRequest,
                ListExternalDbSystemDiscoveriesResponse>(
                new java.util.function.Supplier<ListExternalDbSystemDiscoveriesRequest.Builder>() {
                    @Override
                    public ListExternalDbSystemDiscoveriesRequest.Builder get() {
                        return ListExternalDbSystemDiscoveriesRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListExternalDbSystemDiscoveriesResponse, String>() {
                    @Override
                    public String apply(ListExternalDbSystemDiscoveriesResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListExternalDbSystemDiscoveriesRequest.Builder>,
                        ListExternalDbSystemDiscoveriesRequest>() {
                    @Override
                    public ListExternalDbSystemDiscoveriesRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListExternalDbSystemDiscoveriesRequest.Builder>
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
                        ListExternalDbSystemDiscoveriesRequest,
                        ListExternalDbSystemDiscoveriesResponse>() {
                    @Override
                    public ListExternalDbSystemDiscoveriesResponse apply(
                            ListExternalDbSystemDiscoveriesRequest request) {
                        return client.listExternalDbSystemDiscoveries(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link
     * com.oracle.bmc.databasemanagement.model.ExternalDbSystemDiscoverySummary} objects contained
     * in responses from the listExternalDbSystemDiscoveries operation. This iterable will fetch
     * more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link
     *     com.oracle.bmc.databasemanagement.model.ExternalDbSystemDiscoverySummary} objects
     *     contained in responses received from the service.
     */
    public Iterable<com.oracle.bmc.databasemanagement.model.ExternalDbSystemDiscoverySummary>
            listExternalDbSystemDiscoveriesRecordIterator(
                    final ListExternalDbSystemDiscoveriesRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListExternalDbSystemDiscoveriesRequest.Builder,
                ListExternalDbSystemDiscoveriesRequest,
                ListExternalDbSystemDiscoveriesResponse,
                com.oracle.bmc.databasemanagement.model.ExternalDbSystemDiscoverySummary>(
                new java.util.function.Supplier<ListExternalDbSystemDiscoveriesRequest.Builder>() {
                    @Override
                    public ListExternalDbSystemDiscoveriesRequest.Builder get() {
                        return ListExternalDbSystemDiscoveriesRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListExternalDbSystemDiscoveriesResponse, String>() {
                    @Override
                    public String apply(ListExternalDbSystemDiscoveriesResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListExternalDbSystemDiscoveriesRequest.Builder>,
                        ListExternalDbSystemDiscoveriesRequest>() {
                    @Override
                    public ListExternalDbSystemDiscoveriesRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListExternalDbSystemDiscoveriesRequest.Builder>
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
                        ListExternalDbSystemDiscoveriesRequest,
                        ListExternalDbSystemDiscoveriesResponse>() {
                    @Override
                    public ListExternalDbSystemDiscoveriesResponse apply(
                            ListExternalDbSystemDiscoveriesRequest request) {
                        return client.listExternalDbSystemDiscoveries(request);
                    }
                },
                new java.util.function.Function<
                        ListExternalDbSystemDiscoveriesResponse,
                        java.util.List<
                                com.oracle.bmc.databasemanagement.model
                                        .ExternalDbSystemDiscoverySummary>>() {
                    @Override
                    public java.util.List<
                                    com.oracle.bmc.databasemanagement.model
                                            .ExternalDbSystemDiscoverySummary>
                            apply(ListExternalDbSystemDiscoveriesResponse response) {
                        return response.getExternalDbSystemDiscoveryCollection().getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the
     * listExternalDbSystems operation. This iterable will fetch more data from the server as
     * needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses
     *     received from the service.
     */
    public Iterable<ListExternalDbSystemsResponse> listExternalDbSystemsResponseIterator(
            final ListExternalDbSystemsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListExternalDbSystemsRequest.Builder,
                ListExternalDbSystemsRequest,
                ListExternalDbSystemsResponse>(
                new java.util.function.Supplier<ListExternalDbSystemsRequest.Builder>() {
                    @Override
                    public ListExternalDbSystemsRequest.Builder get() {
                        return ListExternalDbSystemsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListExternalDbSystemsResponse, String>() {
                    @Override
                    public String apply(ListExternalDbSystemsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListExternalDbSystemsRequest.Builder>,
                        ListExternalDbSystemsRequest>() {
                    @Override
                    public ListExternalDbSystemsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListExternalDbSystemsRequest.Builder>
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
                        ListExternalDbSystemsRequest, ListExternalDbSystemsResponse>() {
                    @Override
                    public ListExternalDbSystemsResponse apply(
                            ListExternalDbSystemsRequest request) {
                        return client.listExternalDbSystems(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link
     * com.oracle.bmc.databasemanagement.model.ExternalDbSystemSummary} objects contained in
     * responses from the listExternalDbSystems operation. This iterable will fetch more data from
     * the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link
     *     com.oracle.bmc.databasemanagement.model.ExternalDbSystemSummary} objects contained in
     *     responses received from the service.
     */
    public Iterable<com.oracle.bmc.databasemanagement.model.ExternalDbSystemSummary>
            listExternalDbSystemsRecordIterator(final ListExternalDbSystemsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListExternalDbSystemsRequest.Builder,
                ListExternalDbSystemsRequest,
                ListExternalDbSystemsResponse,
                com.oracle.bmc.databasemanagement.model.ExternalDbSystemSummary>(
                new java.util.function.Supplier<ListExternalDbSystemsRequest.Builder>() {
                    @Override
                    public ListExternalDbSystemsRequest.Builder get() {
                        return ListExternalDbSystemsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListExternalDbSystemsResponse, String>() {
                    @Override
                    public String apply(ListExternalDbSystemsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListExternalDbSystemsRequest.Builder>,
                        ListExternalDbSystemsRequest>() {
                    @Override
                    public ListExternalDbSystemsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListExternalDbSystemsRequest.Builder>
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
                        ListExternalDbSystemsRequest, ListExternalDbSystemsResponse>() {
                    @Override
                    public ListExternalDbSystemsResponse apply(
                            ListExternalDbSystemsRequest request) {
                        return client.listExternalDbSystems(request);
                    }
                },
                new java.util.function.Function<
                        ListExternalDbSystemsResponse,
                        java.util.List<
                                com.oracle.bmc.databasemanagement.model
                                        .ExternalDbSystemSummary>>() {
                    @Override
                    public java.util.List<
                                    com.oracle.bmc.databasemanagement.model.ExternalDbSystemSummary>
                            apply(ListExternalDbSystemsResponse response) {
                        return response.getExternalDbSystemCollection().getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the
     * listExternalExadataInfrastructures operation. This iterable will fetch more data from the
     * server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses
     *     received from the service.
     */
    public Iterable<ListExternalExadataInfrastructuresResponse>
            listExternalExadataInfrastructuresResponseIterator(
                    final ListExternalExadataInfrastructuresRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListExternalExadataInfrastructuresRequest.Builder,
                ListExternalExadataInfrastructuresRequest,
                ListExternalExadataInfrastructuresResponse>(
                new java.util.function.Supplier<
                        ListExternalExadataInfrastructuresRequest.Builder>() {
                    @Override
                    public ListExternalExadataInfrastructuresRequest.Builder get() {
                        return ListExternalExadataInfrastructuresRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<
                        ListExternalExadataInfrastructuresResponse, String>() {
                    @Override
                    public String apply(ListExternalExadataInfrastructuresResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListExternalExadataInfrastructuresRequest.Builder>,
                        ListExternalExadataInfrastructuresRequest>() {
                    @Override
                    public ListExternalExadataInfrastructuresRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListExternalExadataInfrastructuresRequest.Builder>
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
                        ListExternalExadataInfrastructuresRequest,
                        ListExternalExadataInfrastructuresResponse>() {
                    @Override
                    public ListExternalExadataInfrastructuresResponse apply(
                            ListExternalExadataInfrastructuresRequest request) {
                        return client.listExternalExadataInfrastructures(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link
     * com.oracle.bmc.databasemanagement.model.ExternalExadataInfrastructureSummary} objects
     * contained in responses from the listExternalExadataInfrastructures operation. This iterable
     * will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link
     *     com.oracle.bmc.databasemanagement.model.ExternalExadataInfrastructureSummary} objects
     *     contained in responses received from the service.
     */
    public Iterable<com.oracle.bmc.databasemanagement.model.ExternalExadataInfrastructureSummary>
            listExternalExadataInfrastructuresRecordIterator(
                    final ListExternalExadataInfrastructuresRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListExternalExadataInfrastructuresRequest.Builder,
                ListExternalExadataInfrastructuresRequest,
                ListExternalExadataInfrastructuresResponse,
                com.oracle.bmc.databasemanagement.model.ExternalExadataInfrastructureSummary>(
                new java.util.function.Supplier<
                        ListExternalExadataInfrastructuresRequest.Builder>() {
                    @Override
                    public ListExternalExadataInfrastructuresRequest.Builder get() {
                        return ListExternalExadataInfrastructuresRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<
                        ListExternalExadataInfrastructuresResponse, String>() {
                    @Override
                    public String apply(ListExternalExadataInfrastructuresResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListExternalExadataInfrastructuresRequest.Builder>,
                        ListExternalExadataInfrastructuresRequest>() {
                    @Override
                    public ListExternalExadataInfrastructuresRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListExternalExadataInfrastructuresRequest.Builder>
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
                        ListExternalExadataInfrastructuresRequest,
                        ListExternalExadataInfrastructuresResponse>() {
                    @Override
                    public ListExternalExadataInfrastructuresResponse apply(
                            ListExternalExadataInfrastructuresRequest request) {
                        return client.listExternalExadataInfrastructures(request);
                    }
                },
                new java.util.function.Function<
                        ListExternalExadataInfrastructuresResponse,
                        java.util.List<
                                com.oracle.bmc.databasemanagement.model
                                        .ExternalExadataInfrastructureSummary>>() {
                    @Override
                    public java.util.List<
                                    com.oracle.bmc.databasemanagement.model
                                            .ExternalExadataInfrastructureSummary>
                            apply(ListExternalExadataInfrastructuresResponse response) {
                        return response.getExternalExadataInfrastructureCollection().getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the
     * listExternalExadataStorageConnectors operation. This iterable will fetch more data from the
     * server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses
     *     received from the service.
     */
    public Iterable<ListExternalExadataStorageConnectorsResponse>
            listExternalExadataStorageConnectorsResponseIterator(
                    final ListExternalExadataStorageConnectorsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListExternalExadataStorageConnectorsRequest.Builder,
                ListExternalExadataStorageConnectorsRequest,
                ListExternalExadataStorageConnectorsResponse>(
                new java.util.function.Supplier<
                        ListExternalExadataStorageConnectorsRequest.Builder>() {
                    @Override
                    public ListExternalExadataStorageConnectorsRequest.Builder get() {
                        return ListExternalExadataStorageConnectorsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<
                        ListExternalExadataStorageConnectorsResponse, String>() {
                    @Override
                    public String apply(ListExternalExadataStorageConnectorsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListExternalExadataStorageConnectorsRequest.Builder>,
                        ListExternalExadataStorageConnectorsRequest>() {
                    @Override
                    public ListExternalExadataStorageConnectorsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListExternalExadataStorageConnectorsRequest.Builder>
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
                        ListExternalExadataStorageConnectorsRequest,
                        ListExternalExadataStorageConnectorsResponse>() {
                    @Override
                    public ListExternalExadataStorageConnectorsResponse apply(
                            ListExternalExadataStorageConnectorsRequest request) {
                        return client.listExternalExadataStorageConnectors(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link
     * com.oracle.bmc.databasemanagement.model.ExternalExadataStorageConnectorSummary} objects
     * contained in responses from the listExternalExadataStorageConnectors operation. This iterable
     * will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link
     *     com.oracle.bmc.databasemanagement.model.ExternalExadataStorageConnectorSummary} objects
     *     contained in responses received from the service.
     */
    public Iterable<com.oracle.bmc.databasemanagement.model.ExternalExadataStorageConnectorSummary>
            listExternalExadataStorageConnectorsRecordIterator(
                    final ListExternalExadataStorageConnectorsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListExternalExadataStorageConnectorsRequest.Builder,
                ListExternalExadataStorageConnectorsRequest,
                ListExternalExadataStorageConnectorsResponse,
                com.oracle.bmc.databasemanagement.model.ExternalExadataStorageConnectorSummary>(
                new java.util.function.Supplier<
                        ListExternalExadataStorageConnectorsRequest.Builder>() {
                    @Override
                    public ListExternalExadataStorageConnectorsRequest.Builder get() {
                        return ListExternalExadataStorageConnectorsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<
                        ListExternalExadataStorageConnectorsResponse, String>() {
                    @Override
                    public String apply(ListExternalExadataStorageConnectorsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListExternalExadataStorageConnectorsRequest.Builder>,
                        ListExternalExadataStorageConnectorsRequest>() {
                    @Override
                    public ListExternalExadataStorageConnectorsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListExternalExadataStorageConnectorsRequest.Builder>
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
                        ListExternalExadataStorageConnectorsRequest,
                        ListExternalExadataStorageConnectorsResponse>() {
                    @Override
                    public ListExternalExadataStorageConnectorsResponse apply(
                            ListExternalExadataStorageConnectorsRequest request) {
                        return client.listExternalExadataStorageConnectors(request);
                    }
                },
                new java.util.function.Function<
                        ListExternalExadataStorageConnectorsResponse,
                        java.util.List<
                                com.oracle.bmc.databasemanagement.model
                                        .ExternalExadataStorageConnectorSummary>>() {
                    @Override
                    public java.util.List<
                                    com.oracle.bmc.databasemanagement.model
                                            .ExternalExadataStorageConnectorSummary>
                            apply(ListExternalExadataStorageConnectorsResponse response) {
                        return response.getExternalExadataStorageConnectorCollection().getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the
     * listExternalExadataStorageServers operation. This iterable will fetch more data from the
     * server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses
     *     received from the service.
     */
    public Iterable<ListExternalExadataStorageServersResponse>
            listExternalExadataStorageServersResponseIterator(
                    final ListExternalExadataStorageServersRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListExternalExadataStorageServersRequest.Builder,
                ListExternalExadataStorageServersRequest,
                ListExternalExadataStorageServersResponse>(
                new java.util.function.Supplier<
                        ListExternalExadataStorageServersRequest.Builder>() {
                    @Override
                    public ListExternalExadataStorageServersRequest.Builder get() {
                        return ListExternalExadataStorageServersRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<
                        ListExternalExadataStorageServersResponse, String>() {
                    @Override
                    public String apply(ListExternalExadataStorageServersResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListExternalExadataStorageServersRequest.Builder>,
                        ListExternalExadataStorageServersRequest>() {
                    @Override
                    public ListExternalExadataStorageServersRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListExternalExadataStorageServersRequest.Builder>
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
                        ListExternalExadataStorageServersRequest,
                        ListExternalExadataStorageServersResponse>() {
                    @Override
                    public ListExternalExadataStorageServersResponse apply(
                            ListExternalExadataStorageServersRequest request) {
                        return client.listExternalExadataStorageServers(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link
     * com.oracle.bmc.databasemanagement.model.ExternalExadataStorageServerSummary} objects
     * contained in responses from the listExternalExadataStorageServers operation. This iterable
     * will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link
     *     com.oracle.bmc.databasemanagement.model.ExternalExadataStorageServerSummary} objects
     *     contained in responses received from the service.
     */
    public Iterable<com.oracle.bmc.databasemanagement.model.ExternalExadataStorageServerSummary>
            listExternalExadataStorageServersRecordIterator(
                    final ListExternalExadataStorageServersRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListExternalExadataStorageServersRequest.Builder,
                ListExternalExadataStorageServersRequest,
                ListExternalExadataStorageServersResponse,
                com.oracle.bmc.databasemanagement.model.ExternalExadataStorageServerSummary>(
                new java.util.function.Supplier<
                        ListExternalExadataStorageServersRequest.Builder>() {
                    @Override
                    public ListExternalExadataStorageServersRequest.Builder get() {
                        return ListExternalExadataStorageServersRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<
                        ListExternalExadataStorageServersResponse, String>() {
                    @Override
                    public String apply(ListExternalExadataStorageServersResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListExternalExadataStorageServersRequest.Builder>,
                        ListExternalExadataStorageServersRequest>() {
                    @Override
                    public ListExternalExadataStorageServersRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListExternalExadataStorageServersRequest.Builder>
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
                        ListExternalExadataStorageServersRequest,
                        ListExternalExadataStorageServersResponse>() {
                    @Override
                    public ListExternalExadataStorageServersResponse apply(
                            ListExternalExadataStorageServersRequest request) {
                        return client.listExternalExadataStorageServers(request);
                    }
                },
                new java.util.function.Function<
                        ListExternalExadataStorageServersResponse,
                        java.util.List<
                                com.oracle.bmc.databasemanagement.model
                                        .ExternalExadataStorageServerSummary>>() {
                    @Override
                    public java.util.List<
                                    com.oracle.bmc.databasemanagement.model
                                            .ExternalExadataStorageServerSummary>
                            apply(ListExternalExadataStorageServersResponse response) {
                        return response.getExternalExadataStorageServerCollection().getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the
     * listExternalListenerServices operation. This iterable will fetch more data from the server as
     * needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses
     *     received from the service.
     */
    public Iterable<ListExternalListenerServicesResponse>
            listExternalListenerServicesResponseIterator(
                    final ListExternalListenerServicesRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListExternalListenerServicesRequest.Builder,
                ListExternalListenerServicesRequest,
                ListExternalListenerServicesResponse>(
                new java.util.function.Supplier<ListExternalListenerServicesRequest.Builder>() {
                    @Override
                    public ListExternalListenerServicesRequest.Builder get() {
                        return ListExternalListenerServicesRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListExternalListenerServicesResponse, String>() {
                    @Override
                    public String apply(ListExternalListenerServicesResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListExternalListenerServicesRequest.Builder>,
                        ListExternalListenerServicesRequest>() {
                    @Override
                    public ListExternalListenerServicesRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListExternalListenerServicesRequest.Builder>
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
                        ListExternalListenerServicesRequest,
                        ListExternalListenerServicesResponse>() {
                    @Override
                    public ListExternalListenerServicesResponse apply(
                            ListExternalListenerServicesRequest request) {
                        return client.listExternalListenerServices(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link
     * com.oracle.bmc.databasemanagement.model.ExternalListenerServiceSummary} objects contained in
     * responses from the listExternalListenerServices operation. This iterable will fetch more data
     * from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link
     *     com.oracle.bmc.databasemanagement.model.ExternalListenerServiceSummary} objects contained
     *     in responses received from the service.
     */
    public Iterable<com.oracle.bmc.databasemanagement.model.ExternalListenerServiceSummary>
            listExternalListenerServicesRecordIterator(
                    final ListExternalListenerServicesRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListExternalListenerServicesRequest.Builder,
                ListExternalListenerServicesRequest,
                ListExternalListenerServicesResponse,
                com.oracle.bmc.databasemanagement.model.ExternalListenerServiceSummary>(
                new java.util.function.Supplier<ListExternalListenerServicesRequest.Builder>() {
                    @Override
                    public ListExternalListenerServicesRequest.Builder get() {
                        return ListExternalListenerServicesRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListExternalListenerServicesResponse, String>() {
                    @Override
                    public String apply(ListExternalListenerServicesResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListExternalListenerServicesRequest.Builder>,
                        ListExternalListenerServicesRequest>() {
                    @Override
                    public ListExternalListenerServicesRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListExternalListenerServicesRequest.Builder>
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
                        ListExternalListenerServicesRequest,
                        ListExternalListenerServicesResponse>() {
                    @Override
                    public ListExternalListenerServicesResponse apply(
                            ListExternalListenerServicesRequest request) {
                        return client.listExternalListenerServices(request);
                    }
                },
                new java.util.function.Function<
                        ListExternalListenerServicesResponse,
                        java.util.List<
                                com.oracle.bmc.databasemanagement.model
                                        .ExternalListenerServiceSummary>>() {
                    @Override
                    public java.util.List<
                                    com.oracle.bmc.databasemanagement.model
                                            .ExternalListenerServiceSummary>
                            apply(ListExternalListenerServicesResponse response) {
                        return response.getExternalListenerServiceCollection().getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the
     * listExternalListeners operation. This iterable will fetch more data from the server as
     * needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses
     *     received from the service.
     */
    public Iterable<ListExternalListenersResponse> listExternalListenersResponseIterator(
            final ListExternalListenersRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListExternalListenersRequest.Builder,
                ListExternalListenersRequest,
                ListExternalListenersResponse>(
                new java.util.function.Supplier<ListExternalListenersRequest.Builder>() {
                    @Override
                    public ListExternalListenersRequest.Builder get() {
                        return ListExternalListenersRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListExternalListenersResponse, String>() {
                    @Override
                    public String apply(ListExternalListenersResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListExternalListenersRequest.Builder>,
                        ListExternalListenersRequest>() {
                    @Override
                    public ListExternalListenersRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListExternalListenersRequest.Builder>
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
                        ListExternalListenersRequest, ListExternalListenersResponse>() {
                    @Override
                    public ListExternalListenersResponse apply(
                            ListExternalListenersRequest request) {
                        return client.listExternalListeners(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link
     * com.oracle.bmc.databasemanagement.model.ExternalListenerSummary} objects contained in
     * responses from the listExternalListeners operation. This iterable will fetch more data from
     * the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link
     *     com.oracle.bmc.databasemanagement.model.ExternalListenerSummary} objects contained in
     *     responses received from the service.
     */
    public Iterable<com.oracle.bmc.databasemanagement.model.ExternalListenerSummary>
            listExternalListenersRecordIterator(final ListExternalListenersRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListExternalListenersRequest.Builder,
                ListExternalListenersRequest,
                ListExternalListenersResponse,
                com.oracle.bmc.databasemanagement.model.ExternalListenerSummary>(
                new java.util.function.Supplier<ListExternalListenersRequest.Builder>() {
                    @Override
                    public ListExternalListenersRequest.Builder get() {
                        return ListExternalListenersRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListExternalListenersResponse, String>() {
                    @Override
                    public String apply(ListExternalListenersResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListExternalListenersRequest.Builder>,
                        ListExternalListenersRequest>() {
                    @Override
                    public ListExternalListenersRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListExternalListenersRequest.Builder>
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
                        ListExternalListenersRequest, ListExternalListenersResponse>() {
                    @Override
                    public ListExternalListenersResponse apply(
                            ListExternalListenersRequest request) {
                        return client.listExternalListeners(request);
                    }
                },
                new java.util.function.Function<
                        ListExternalListenersResponse,
                        java.util.List<
                                com.oracle.bmc.databasemanagement.model
                                        .ExternalListenerSummary>>() {
                    @Override
                    public java.util.List<
                                    com.oracle.bmc.databasemanagement.model.ExternalListenerSummary>
                            apply(ListExternalListenersResponse response) {
                        return response.getExternalListenerCollection().getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the
     * listExternalMySqlDatabases operation. This iterable will fetch more data from the server as
     * needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses
     *     received from the service.
     */
    public Iterable<ListExternalMySqlDatabasesResponse> listExternalMySqlDatabasesResponseIterator(
            final ListExternalMySqlDatabasesRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListExternalMySqlDatabasesRequest.Builder,
                ListExternalMySqlDatabasesRequest,
                ListExternalMySqlDatabasesResponse>(
                new java.util.function.Supplier<ListExternalMySqlDatabasesRequest.Builder>() {
                    @Override
                    public ListExternalMySqlDatabasesRequest.Builder get() {
                        return ListExternalMySqlDatabasesRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListExternalMySqlDatabasesResponse, String>() {
                    @Override
                    public String apply(ListExternalMySqlDatabasesResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListExternalMySqlDatabasesRequest.Builder>,
                        ListExternalMySqlDatabasesRequest>() {
                    @Override
                    public ListExternalMySqlDatabasesRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListExternalMySqlDatabasesRequest.Builder>
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
                        ListExternalMySqlDatabasesRequest, ListExternalMySqlDatabasesResponse>() {
                    @Override
                    public ListExternalMySqlDatabasesResponse apply(
                            ListExternalMySqlDatabasesRequest request) {
                        return client.listExternalMySqlDatabases(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link
     * com.oracle.bmc.databasemanagement.model.ExternalMySqlDatabaseSummary} objects contained in
     * responses from the listExternalMySqlDatabases operation. This iterable will fetch more data
     * from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link
     *     com.oracle.bmc.databasemanagement.model.ExternalMySqlDatabaseSummary} objects contained
     *     in responses received from the service.
     */
    public Iterable<com.oracle.bmc.databasemanagement.model.ExternalMySqlDatabaseSummary>
            listExternalMySqlDatabasesRecordIterator(
                    final ListExternalMySqlDatabasesRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListExternalMySqlDatabasesRequest.Builder,
                ListExternalMySqlDatabasesRequest,
                ListExternalMySqlDatabasesResponse,
                com.oracle.bmc.databasemanagement.model.ExternalMySqlDatabaseSummary>(
                new java.util.function.Supplier<ListExternalMySqlDatabasesRequest.Builder>() {
                    @Override
                    public ListExternalMySqlDatabasesRequest.Builder get() {
                        return ListExternalMySqlDatabasesRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListExternalMySqlDatabasesResponse, String>() {
                    @Override
                    public String apply(ListExternalMySqlDatabasesResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListExternalMySqlDatabasesRequest.Builder>,
                        ListExternalMySqlDatabasesRequest>() {
                    @Override
                    public ListExternalMySqlDatabasesRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListExternalMySqlDatabasesRequest.Builder>
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
                        ListExternalMySqlDatabasesRequest, ListExternalMySqlDatabasesResponse>() {
                    @Override
                    public ListExternalMySqlDatabasesResponse apply(
                            ListExternalMySqlDatabasesRequest request) {
                        return client.listExternalMySqlDatabases(request);
                    }
                },
                new java.util.function.Function<
                        ListExternalMySqlDatabasesResponse,
                        java.util.List<
                                com.oracle.bmc.databasemanagement.model
                                        .ExternalMySqlDatabaseSummary>>() {
                    @Override
                    public java.util.List<
                                    com.oracle.bmc.databasemanagement.model
                                            .ExternalMySqlDatabaseSummary>
                            apply(ListExternalMySqlDatabasesResponse response) {
                        return response.getExternalMySqlDatabaseCollection().getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the
     * listJobExecutions operation. This iterable will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses
     *     received from the service.
     */
    public Iterable<ListJobExecutionsResponse> listJobExecutionsResponseIterator(
            final ListJobExecutionsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListJobExecutionsRequest.Builder,
                ListJobExecutionsRequest,
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
     * Creates a new iterable which will iterate over the {@link
     * com.oracle.bmc.databasemanagement.model.JobExecutionSummary} objects contained in responses
     * from the listJobExecutions operation. This iterable will fetch more data from the server as
     * needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link
     *     com.oracle.bmc.databasemanagement.model.JobExecutionSummary} objects contained in
     *     responses received from the service.
     */
    public Iterable<com.oracle.bmc.databasemanagement.model.JobExecutionSummary>
            listJobExecutionsRecordIterator(final ListJobExecutionsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListJobExecutionsRequest.Builder,
                ListJobExecutionsRequest,
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
     * Creates a new iterable which will iterate over the responses received from the listJobRuns
     * operation. This iterable will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses
     *     received from the service.
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
     * Creates a new iterable which will iterate over the {@link
     * com.oracle.bmc.databasemanagement.model.JobRunSummary} objects contained in responses from
     * the listJobRuns operation. This iterable will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link
     *     com.oracle.bmc.databasemanagement.model.JobRunSummary} objects contained in responses
     *     received from the service.
     */
    public Iterable<com.oracle.bmc.databasemanagement.model.JobRunSummary>
            listJobRunsRecordIterator(final ListJobRunsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListJobRunsRequest.Builder,
                ListJobRunsRequest,
                ListJobRunsResponse,
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
     * Creates a new iterable which will iterate over the responses received from the listJobs
     * operation. This iterable will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses
     *     received from the service.
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
     * Creates a new iterable which will iterate over the {@link
     * com.oracle.bmc.databasemanagement.model.JobSummary} objects contained in responses from the
     * listJobs operation. This iterable will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link
     *     com.oracle.bmc.databasemanagement.model.JobSummary} objects contained in responses
     *     received from the service.
     */
    public Iterable<com.oracle.bmc.databasemanagement.model.JobSummary> listJobsRecordIterator(
            final ListJobsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListJobsRequest.Builder,
                ListJobsRequest,
                ListJobsResponse,
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
     * Creates a new iterable which will iterate over the responses received from the
     * listManagedDatabaseGroups operation. This iterable will fetch more data from the server as
     * needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses
     *     received from the service.
     */
    public Iterable<ListManagedDatabaseGroupsResponse> listManagedDatabaseGroupsResponseIterator(
            final ListManagedDatabaseGroupsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListManagedDatabaseGroupsRequest.Builder,
                ListManagedDatabaseGroupsRequest,
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
     * Creates a new iterable which will iterate over the {@link
     * com.oracle.bmc.databasemanagement.model.ManagedDatabaseGroupSummary} objects contained in
     * responses from the listManagedDatabaseGroups operation. This iterable will fetch more data
     * from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link
     *     com.oracle.bmc.databasemanagement.model.ManagedDatabaseGroupSummary} objects contained in
     *     responses received from the service.
     */
    public Iterable<com.oracle.bmc.databasemanagement.model.ManagedDatabaseGroupSummary>
            listManagedDatabaseGroupsRecordIterator(
                    final ListManagedDatabaseGroupsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListManagedDatabaseGroupsRequest.Builder,
                ListManagedDatabaseGroupsRequest,
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
     * Creates a new iterable which will iterate over the responses received from the
     * listManagedDatabases operation. This iterable will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses
     *     received from the service.
     */
    public Iterable<ListManagedDatabasesResponse> listManagedDatabasesResponseIterator(
            final ListManagedDatabasesRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListManagedDatabasesRequest.Builder,
                ListManagedDatabasesRequest,
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
     * Creates a new iterable which will iterate over the {@link
     * com.oracle.bmc.databasemanagement.model.ManagedDatabaseSummary} objects contained in
     * responses from the listManagedDatabases operation. This iterable will fetch more data from
     * the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link
     *     com.oracle.bmc.databasemanagement.model.ManagedDatabaseSummary} objects contained in
     *     responses received from the service.
     */
    public Iterable<com.oracle.bmc.databasemanagement.model.ManagedDatabaseSummary>
            listManagedDatabasesRecordIterator(final ListManagedDatabasesRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListManagedDatabasesRequest.Builder,
                ListManagedDatabasesRequest,
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
     * Creates a new iterable which will iterate over the responses received from the
     * listMySqlDatabaseConnectors operation. This iterable will fetch more data from the server as
     * needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses
     *     received from the service.
     */
    public Iterable<ListMySqlDatabaseConnectorsResponse>
            listMySqlDatabaseConnectorsResponseIterator(
                    final ListMySqlDatabaseConnectorsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListMySqlDatabaseConnectorsRequest.Builder,
                ListMySqlDatabaseConnectorsRequest,
                ListMySqlDatabaseConnectorsResponse>(
                new java.util.function.Supplier<ListMySqlDatabaseConnectorsRequest.Builder>() {
                    @Override
                    public ListMySqlDatabaseConnectorsRequest.Builder get() {
                        return ListMySqlDatabaseConnectorsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListMySqlDatabaseConnectorsResponse, String>() {
                    @Override
                    public String apply(ListMySqlDatabaseConnectorsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListMySqlDatabaseConnectorsRequest.Builder>,
                        ListMySqlDatabaseConnectorsRequest>() {
                    @Override
                    public ListMySqlDatabaseConnectorsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListMySqlDatabaseConnectorsRequest.Builder>
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
                        ListMySqlDatabaseConnectorsRequest, ListMySqlDatabaseConnectorsResponse>() {
                    @Override
                    public ListMySqlDatabaseConnectorsResponse apply(
                            ListMySqlDatabaseConnectorsRequest request) {
                        return client.listMySqlDatabaseConnectors(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link
     * com.oracle.bmc.databasemanagement.model.MySqlDatabaseConnectorSummary} objects contained in
     * responses from the listMySqlDatabaseConnectors operation. This iterable will fetch more data
     * from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link
     *     com.oracle.bmc.databasemanagement.model.MySqlDatabaseConnectorSummary} objects contained
     *     in responses received from the service.
     */
    public Iterable<com.oracle.bmc.databasemanagement.model.MySqlDatabaseConnectorSummary>
            listMySqlDatabaseConnectorsRecordIterator(
                    final ListMySqlDatabaseConnectorsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListMySqlDatabaseConnectorsRequest.Builder,
                ListMySqlDatabaseConnectorsRequest,
                ListMySqlDatabaseConnectorsResponse,
                com.oracle.bmc.databasemanagement.model.MySqlDatabaseConnectorSummary>(
                new java.util.function.Supplier<ListMySqlDatabaseConnectorsRequest.Builder>() {
                    @Override
                    public ListMySqlDatabaseConnectorsRequest.Builder get() {
                        return ListMySqlDatabaseConnectorsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListMySqlDatabaseConnectorsResponse, String>() {
                    @Override
                    public String apply(ListMySqlDatabaseConnectorsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListMySqlDatabaseConnectorsRequest.Builder>,
                        ListMySqlDatabaseConnectorsRequest>() {
                    @Override
                    public ListMySqlDatabaseConnectorsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListMySqlDatabaseConnectorsRequest.Builder>
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
                        ListMySqlDatabaseConnectorsRequest, ListMySqlDatabaseConnectorsResponse>() {
                    @Override
                    public ListMySqlDatabaseConnectorsResponse apply(
                            ListMySqlDatabaseConnectorsRequest request) {
                        return client.listMySqlDatabaseConnectors(request);
                    }
                },
                new java.util.function.Function<
                        ListMySqlDatabaseConnectorsResponse,
                        java.util.List<
                                com.oracle.bmc.databasemanagement.model
                                        .MySqlDatabaseConnectorSummary>>() {
                    @Override
                    public java.util.List<
                                    com.oracle.bmc.databasemanagement.model
                                            .MySqlDatabaseConnectorSummary>
                            apply(ListMySqlDatabaseConnectorsResponse response) {
                        return response.getMySqlConnectorCollection().getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the
     * listNamedCredentials operation. This iterable will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses
     *     received from the service.
     */
    public Iterable<ListNamedCredentialsResponse> listNamedCredentialsResponseIterator(
            final ListNamedCredentialsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListNamedCredentialsRequest.Builder,
                ListNamedCredentialsRequest,
                ListNamedCredentialsResponse>(
                new java.util.function.Supplier<ListNamedCredentialsRequest.Builder>() {
                    @Override
                    public ListNamedCredentialsRequest.Builder get() {
                        return ListNamedCredentialsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListNamedCredentialsResponse, String>() {
                    @Override
                    public String apply(ListNamedCredentialsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListNamedCredentialsRequest.Builder>,
                        ListNamedCredentialsRequest>() {
                    @Override
                    public ListNamedCredentialsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListNamedCredentialsRequest.Builder>
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
                        ListNamedCredentialsRequest, ListNamedCredentialsResponse>() {
                    @Override
                    public ListNamedCredentialsResponse apply(ListNamedCredentialsRequest request) {
                        return client.listNamedCredentials(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link
     * com.oracle.bmc.databasemanagement.model.NamedCredentialSummary} objects contained in
     * responses from the listNamedCredentials operation. This iterable will fetch more data from
     * the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link
     *     com.oracle.bmc.databasemanagement.model.NamedCredentialSummary} objects contained in
     *     responses received from the service.
     */
    public Iterable<com.oracle.bmc.databasemanagement.model.NamedCredentialSummary>
            listNamedCredentialsRecordIterator(final ListNamedCredentialsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListNamedCredentialsRequest.Builder,
                ListNamedCredentialsRequest,
                ListNamedCredentialsResponse,
                com.oracle.bmc.databasemanagement.model.NamedCredentialSummary>(
                new java.util.function.Supplier<ListNamedCredentialsRequest.Builder>() {
                    @Override
                    public ListNamedCredentialsRequest.Builder get() {
                        return ListNamedCredentialsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListNamedCredentialsResponse, String>() {
                    @Override
                    public String apply(ListNamedCredentialsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListNamedCredentialsRequest.Builder>,
                        ListNamedCredentialsRequest>() {
                    @Override
                    public ListNamedCredentialsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListNamedCredentialsRequest.Builder>
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
                        ListNamedCredentialsRequest, ListNamedCredentialsResponse>() {
                    @Override
                    public ListNamedCredentialsResponse apply(ListNamedCredentialsRequest request) {
                        return client.listNamedCredentials(request);
                    }
                },
                new java.util.function.Function<
                        ListNamedCredentialsResponse,
                        java.util.List<
                                com.oracle.bmc.databasemanagement.model.NamedCredentialSummary>>() {
                    @Override
                    public java.util.List<
                                    com.oracle.bmc.databasemanagement.model.NamedCredentialSummary>
                            apply(ListNamedCredentialsResponse response) {
                        return response.getNamedCredentialCollection().getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the
     * listObjectPrivileges operation. This iterable will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses
     *     received from the service.
     */
    public Iterable<ListObjectPrivilegesResponse> listObjectPrivilegesResponseIterator(
            final ListObjectPrivilegesRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListObjectPrivilegesRequest.Builder,
                ListObjectPrivilegesRequest,
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
     * Creates a new iterable which will iterate over the {@link
     * com.oracle.bmc.databasemanagement.model.ObjectPrivilegeSummary} objects contained in
     * responses from the listObjectPrivileges operation. This iterable will fetch more data from
     * the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link
     *     com.oracle.bmc.databasemanagement.model.ObjectPrivilegeSummary} objects contained in
     *     responses received from the service.
     */
    public Iterable<com.oracle.bmc.databasemanagement.model.ObjectPrivilegeSummary>
            listObjectPrivilegesRecordIterator(final ListObjectPrivilegesRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListObjectPrivilegesRequest.Builder,
                ListObjectPrivilegesRequest,
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
     * Creates a new iterable which will iterate over the responses received from the
     * listOptimizerStatisticsCollectionAggregations operation. This iterable will fetch more data
     * from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses
     *     received from the service.
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
     * Creates a new iterable which will iterate over the {@link
     * com.oracle.bmc.databasemanagement.model.OptimizerStatisticsCollectionAggregationSummary}
     * objects contained in responses from the listOptimizerStatisticsCollectionAggregations
     * operation. This iterable will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link
     *     com.oracle.bmc.databasemanagement.model.OptimizerStatisticsCollectionAggregationSummary}
     *     objects contained in responses received from the service.
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
     * Creates a new iterable which will iterate over the responses received from the
     * listOptimizerStatisticsCollectionOperations operation. This iterable will fetch more data
     * from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses
     *     received from the service.
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
     * Creates a new iterable which will iterate over the {@link
     * com.oracle.bmc.databasemanagement.model.OptimizerStatisticsCollectionOperationSummary}
     * objects contained in responses from the listOptimizerStatisticsCollectionOperations
     * operation. This iterable will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link
     *     com.oracle.bmc.databasemanagement.model.OptimizerStatisticsCollectionOperationSummary}
     *     objects contained in responses received from the service.
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
     * Creates a new iterable which will iterate over the responses received from the
     * listProxiedForUsers operation. This iterable will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses
     *     received from the service.
     */
    public Iterable<ListProxiedForUsersResponse> listProxiedForUsersResponseIterator(
            final ListProxiedForUsersRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListProxiedForUsersRequest.Builder,
                ListProxiedForUsersRequest,
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
     * Creates a new iterable which will iterate over the {@link
     * com.oracle.bmc.databasemanagement.model.ProxiedForUserSummary} objects contained in responses
     * from the listProxiedForUsers operation. This iterable will fetch more data from the server as
     * needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link
     *     com.oracle.bmc.databasemanagement.model.ProxiedForUserSummary} objects contained in
     *     responses received from the service.
     */
    public Iterable<com.oracle.bmc.databasemanagement.model.ProxiedForUserSummary>
            listProxiedForUsersRecordIterator(final ListProxiedForUsersRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListProxiedForUsersRequest.Builder,
                ListProxiedForUsersRequest,
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
     * Creates a new iterable which will iterate over the responses received from the listProxyUsers
     * operation. This iterable will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses
     *     received from the service.
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
     * Creates a new iterable which will iterate over the {@link
     * com.oracle.bmc.databasemanagement.model.ProxyUserSummary} objects contained in responses from
     * the listProxyUsers operation. This iterable will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link
     *     com.oracle.bmc.databasemanagement.model.ProxyUserSummary} objects contained in responses
     *     received from the service.
     */
    public Iterable<com.oracle.bmc.databasemanagement.model.ProxyUserSummary>
            listProxyUsersRecordIterator(final ListProxyUsersRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListProxyUsersRequest.Builder,
                ListProxyUsersRequest,
                ListProxyUsersResponse,
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
     * Creates a new iterable which will iterate over the responses received from the listRoles
     * operation. This iterable will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses
     *     received from the service.
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
     * Creates a new iterable which will iterate over the {@link
     * com.oracle.bmc.databasemanagement.model.RoleSummary} objects contained in responses from the
     * listRoles operation. This iterable will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link
     *     com.oracle.bmc.databasemanagement.model.RoleSummary} objects contained in responses
     *     received from the service.
     */
    public Iterable<com.oracle.bmc.databasemanagement.model.RoleSummary> listRolesRecordIterator(
            final ListRolesRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListRolesRequest.Builder,
                ListRolesRequest,
                ListRolesResponse,
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
     * Creates a new iterable which will iterate over the responses received from the
     * listSqlPlanBaselineJobs operation. This iterable will fetch more data from the server as
     * needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses
     *     received from the service.
     */
    public Iterable<ListSqlPlanBaselineJobsResponse> listSqlPlanBaselineJobsResponseIterator(
            final ListSqlPlanBaselineJobsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListSqlPlanBaselineJobsRequest.Builder,
                ListSqlPlanBaselineJobsRequest,
                ListSqlPlanBaselineJobsResponse>(
                new java.util.function.Supplier<ListSqlPlanBaselineJobsRequest.Builder>() {
                    @Override
                    public ListSqlPlanBaselineJobsRequest.Builder get() {
                        return ListSqlPlanBaselineJobsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListSqlPlanBaselineJobsResponse, String>() {
                    @Override
                    public String apply(ListSqlPlanBaselineJobsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListSqlPlanBaselineJobsRequest.Builder>,
                        ListSqlPlanBaselineJobsRequest>() {
                    @Override
                    public ListSqlPlanBaselineJobsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListSqlPlanBaselineJobsRequest.Builder>
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
                        ListSqlPlanBaselineJobsRequest, ListSqlPlanBaselineJobsResponse>() {
                    @Override
                    public ListSqlPlanBaselineJobsResponse apply(
                            ListSqlPlanBaselineJobsRequest request) {
                        return client.listSqlPlanBaselineJobs(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link
     * com.oracle.bmc.databasemanagement.model.SqlPlanBaselineJobSummary} objects contained in
     * responses from the listSqlPlanBaselineJobs operation. This iterable will fetch more data from
     * the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link
     *     com.oracle.bmc.databasemanagement.model.SqlPlanBaselineJobSummary} objects contained in
     *     responses received from the service.
     */
    public Iterable<com.oracle.bmc.databasemanagement.model.SqlPlanBaselineJobSummary>
            listSqlPlanBaselineJobsRecordIterator(final ListSqlPlanBaselineJobsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListSqlPlanBaselineJobsRequest.Builder,
                ListSqlPlanBaselineJobsRequest,
                ListSqlPlanBaselineJobsResponse,
                com.oracle.bmc.databasemanagement.model.SqlPlanBaselineJobSummary>(
                new java.util.function.Supplier<ListSqlPlanBaselineJobsRequest.Builder>() {
                    @Override
                    public ListSqlPlanBaselineJobsRequest.Builder get() {
                        return ListSqlPlanBaselineJobsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListSqlPlanBaselineJobsResponse, String>() {
                    @Override
                    public String apply(ListSqlPlanBaselineJobsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListSqlPlanBaselineJobsRequest.Builder>,
                        ListSqlPlanBaselineJobsRequest>() {
                    @Override
                    public ListSqlPlanBaselineJobsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListSqlPlanBaselineJobsRequest.Builder>
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
                        ListSqlPlanBaselineJobsRequest, ListSqlPlanBaselineJobsResponse>() {
                    @Override
                    public ListSqlPlanBaselineJobsResponse apply(
                            ListSqlPlanBaselineJobsRequest request) {
                        return client.listSqlPlanBaselineJobs(request);
                    }
                },
                new java.util.function.Function<
                        ListSqlPlanBaselineJobsResponse,
                        java.util.List<
                                com.oracle.bmc.databasemanagement.model
                                        .SqlPlanBaselineJobSummary>>() {
                    @Override
                    public java.util.List<
                                    com.oracle.bmc.databasemanagement.model
                                            .SqlPlanBaselineJobSummary>
                            apply(ListSqlPlanBaselineJobsResponse response) {
                        return response.getSqlPlanBaselineJobCollection().getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the
     * listSqlPlanBaselines operation. This iterable will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses
     *     received from the service.
     */
    public Iterable<ListSqlPlanBaselinesResponse> listSqlPlanBaselinesResponseIterator(
            final ListSqlPlanBaselinesRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListSqlPlanBaselinesRequest.Builder,
                ListSqlPlanBaselinesRequest,
                ListSqlPlanBaselinesResponse>(
                new java.util.function.Supplier<ListSqlPlanBaselinesRequest.Builder>() {
                    @Override
                    public ListSqlPlanBaselinesRequest.Builder get() {
                        return ListSqlPlanBaselinesRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListSqlPlanBaselinesResponse, String>() {
                    @Override
                    public String apply(ListSqlPlanBaselinesResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListSqlPlanBaselinesRequest.Builder>,
                        ListSqlPlanBaselinesRequest>() {
                    @Override
                    public ListSqlPlanBaselinesRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListSqlPlanBaselinesRequest.Builder>
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
                        ListSqlPlanBaselinesRequest, ListSqlPlanBaselinesResponse>() {
                    @Override
                    public ListSqlPlanBaselinesResponse apply(ListSqlPlanBaselinesRequest request) {
                        return client.listSqlPlanBaselines(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link
     * com.oracle.bmc.databasemanagement.model.SqlPlanBaselineSummary} objects contained in
     * responses from the listSqlPlanBaselines operation. This iterable will fetch more data from
     * the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link
     *     com.oracle.bmc.databasemanagement.model.SqlPlanBaselineSummary} objects contained in
     *     responses received from the service.
     */
    public Iterable<com.oracle.bmc.databasemanagement.model.SqlPlanBaselineSummary>
            listSqlPlanBaselinesRecordIterator(final ListSqlPlanBaselinesRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListSqlPlanBaselinesRequest.Builder,
                ListSqlPlanBaselinesRequest,
                ListSqlPlanBaselinesResponse,
                com.oracle.bmc.databasemanagement.model.SqlPlanBaselineSummary>(
                new java.util.function.Supplier<ListSqlPlanBaselinesRequest.Builder>() {
                    @Override
                    public ListSqlPlanBaselinesRequest.Builder get() {
                        return ListSqlPlanBaselinesRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListSqlPlanBaselinesResponse, String>() {
                    @Override
                    public String apply(ListSqlPlanBaselinesResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListSqlPlanBaselinesRequest.Builder>,
                        ListSqlPlanBaselinesRequest>() {
                    @Override
                    public ListSqlPlanBaselinesRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListSqlPlanBaselinesRequest.Builder>
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
                        ListSqlPlanBaselinesRequest, ListSqlPlanBaselinesResponse>() {
                    @Override
                    public ListSqlPlanBaselinesResponse apply(ListSqlPlanBaselinesRequest request) {
                        return client.listSqlPlanBaselines(request);
                    }
                },
                new java.util.function.Function<
                        ListSqlPlanBaselinesResponse,
                        java.util.List<
                                com.oracle.bmc.databasemanagement.model.SqlPlanBaselineSummary>>() {
                    @Override
                    public java.util.List<
                                    com.oracle.bmc.databasemanagement.model.SqlPlanBaselineSummary>
                            apply(ListSqlPlanBaselinesResponse response) {
                        return response.getSqlPlanBaselineCollection().getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the
     * listSystemPrivileges operation. This iterable will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses
     *     received from the service.
     */
    public Iterable<ListSystemPrivilegesResponse> listSystemPrivilegesResponseIterator(
            final ListSystemPrivilegesRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListSystemPrivilegesRequest.Builder,
                ListSystemPrivilegesRequest,
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
     * Creates a new iterable which will iterate over the {@link
     * com.oracle.bmc.databasemanagement.model.SystemPrivilegeSummary} objects contained in
     * responses from the listSystemPrivileges operation. This iterable will fetch more data from
     * the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link
     *     com.oracle.bmc.databasemanagement.model.SystemPrivilegeSummary} objects contained in
     *     responses received from the service.
     */
    public Iterable<com.oracle.bmc.databasemanagement.model.SystemPrivilegeSummary>
            listSystemPrivilegesRecordIterator(final ListSystemPrivilegesRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListSystemPrivilegesRequest.Builder,
                ListSystemPrivilegesRequest,
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
     * Creates a new iterable which will iterate over the responses received from the
     * listTablespaces operation. This iterable will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses
     *     received from the service.
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
     * Creates a new iterable which will iterate over the {@link
     * com.oracle.bmc.databasemanagement.model.TablespaceSummary} objects contained in responses
     * from the listTablespaces operation. This iterable will fetch more data from the server as
     * needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link
     *     com.oracle.bmc.databasemanagement.model.TablespaceSummary} objects contained in responses
     *     received from the service.
     */
    public Iterable<com.oracle.bmc.databasemanagement.model.TablespaceSummary>
            listTablespacesRecordIterator(final ListTablespacesRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListTablespacesRequest.Builder,
                ListTablespacesRequest,
                ListTablespacesResponse,
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
     * Creates a new iterable which will iterate over the responses received from the listUsers
     * operation. This iterable will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses
     *     received from the service.
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
     * Creates a new iterable which will iterate over the {@link
     * com.oracle.bmc.databasemanagement.model.UserSummary} objects contained in responses from the
     * listUsers operation. This iterable will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link
     *     com.oracle.bmc.databasemanagement.model.UserSummary} objects contained in responses
     *     received from the service.
     */
    public Iterable<com.oracle.bmc.databasemanagement.model.UserSummary> listUsersRecordIterator(
            final ListUsersRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListUsersRequest.Builder,
                ListUsersRequest,
                ListUsersResponse,
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
     * Creates a new iterable which will iterate over the responses received from the
     * listWorkRequestErrors operation. This iterable will fetch more data from the server as
     * needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses
     *     received from the service.
     */
    public Iterable<ListWorkRequestErrorsResponse> listWorkRequestErrorsResponseIterator(
            final ListWorkRequestErrorsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListWorkRequestErrorsRequest.Builder,
                ListWorkRequestErrorsRequest,
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
     * Creates a new iterable which will iterate over the {@link
     * com.oracle.bmc.databasemanagement.model.WorkRequestError} objects contained in responses from
     * the listWorkRequestErrors operation. This iterable will fetch more data from the server as
     * needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link
     *     com.oracle.bmc.databasemanagement.model.WorkRequestError} objects contained in responses
     *     received from the service.
     */
    public Iterable<com.oracle.bmc.databasemanagement.model.WorkRequestError>
            listWorkRequestErrorsRecordIterator(final ListWorkRequestErrorsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListWorkRequestErrorsRequest.Builder,
                ListWorkRequestErrorsRequest,
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
     * Creates a new iterable which will iterate over the responses received from the
     * listWorkRequestLogs operation. This iterable will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses
     *     received from the service.
     */
    public Iterable<ListWorkRequestLogsResponse> listWorkRequestLogsResponseIterator(
            final ListWorkRequestLogsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListWorkRequestLogsRequest.Builder,
                ListWorkRequestLogsRequest,
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
     * Creates a new iterable which will iterate over the {@link
     * com.oracle.bmc.databasemanagement.model.WorkRequestLogEntry} objects contained in responses
     * from the listWorkRequestLogs operation. This iterable will fetch more data from the server as
     * needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link
     *     com.oracle.bmc.databasemanagement.model.WorkRequestLogEntry} objects contained in
     *     responses received from the service.
     */
    public Iterable<com.oracle.bmc.databasemanagement.model.WorkRequestLogEntry>
            listWorkRequestLogsRecordIterator(final ListWorkRequestLogsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListWorkRequestLogsRequest.Builder,
                ListWorkRequestLogsRequest,
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
     * Creates a new iterable which will iterate over the responses received from the
     * listWorkRequests operation. This iterable will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses
     *     received from the service.
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
     * Creates a new iterable which will iterate over the {@link
     * com.oracle.bmc.databasemanagement.model.WorkRequestSummary} objects contained in responses
     * from the listWorkRequests operation. This iterable will fetch more data from the server as
     * needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link
     *     com.oracle.bmc.databasemanagement.model.WorkRequestSummary} objects contained in
     *     responses received from the service.
     */
    public Iterable<com.oracle.bmc.databasemanagement.model.WorkRequestSummary>
            listWorkRequestsRecordIterator(final ListWorkRequestsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListWorkRequestsRequest.Builder,
                ListWorkRequestsRequest,
                ListWorkRequestsResponse,
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

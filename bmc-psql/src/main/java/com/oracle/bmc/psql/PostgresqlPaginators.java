/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.psql;

import com.oracle.bmc.psql.requests.*;
import com.oracle.bmc.psql.responses.*;

/**
 * Collection of helper methods that can be used to provide an {@link java.lang.Iterable} interface
 * to any list operations of Postgresql where multiple pages of data may be fetched.
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
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20220915")
public class PostgresqlPaginators {
    private final Postgresql client;

    public PostgresqlPaginators(Postgresql client) {
        this.client = client;
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
                new java.util.function.Supplier<ListBackupsRequest.Builder>() {
                    @Override
                    public ListBackupsRequest.Builder get() {
                        return ListBackupsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListBackupsResponse, String>() {
                    @Override
                    public String apply(ListBackupsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListBackupsRequest.Builder>,
                        ListBackupsRequest>() {
                    @Override
                    public ListBackupsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListBackupsRequest.Builder>
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
                new java.util.function.Function<ListBackupsRequest, ListBackupsResponse>() {
                    @Override
                    public ListBackupsResponse apply(ListBackupsRequest request) {
                        return client.listBackups(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link com.oracle.bmc.psql.model.BackupSummary} objects
     * contained in responses from the listBackups operation. This iterable will fetch more data from the
     * server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link com.oracle.bmc.psql.model.BackupSummary} objects
     * contained in responses received from the service.
     */
    public Iterable<com.oracle.bmc.psql.model.BackupSummary> listBackupsRecordIterator(
            final ListBackupsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListBackupsRequest.Builder, ListBackupsRequest, ListBackupsResponse,
                com.oracle.bmc.psql.model.BackupSummary>(
                new java.util.function.Supplier<ListBackupsRequest.Builder>() {
                    @Override
                    public ListBackupsRequest.Builder get() {
                        return ListBackupsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListBackupsResponse, String>() {
                    @Override
                    public String apply(ListBackupsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListBackupsRequest.Builder>,
                        ListBackupsRequest>() {
                    @Override
                    public ListBackupsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListBackupsRequest.Builder>
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
                new java.util.function.Function<ListBackupsRequest, ListBackupsResponse>() {
                    @Override
                    public ListBackupsResponse apply(ListBackupsRequest request) {
                        return client.listBackups(request);
                    }
                },
                new java.util.function.Function<
                        ListBackupsResponse,
                        java.util.List<com.oracle.bmc.psql.model.BackupSummary>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.psql.model.BackupSummary> apply(
                            ListBackupsResponse response) {
                        return response.getBackupCollection().getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the listConfigurations operation. This iterable
     * will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses received from the service.
     */
    public Iterable<ListConfigurationsResponse> listConfigurationsResponseIterator(
            final ListConfigurationsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListConfigurationsRequest.Builder, ListConfigurationsRequest,
                ListConfigurationsResponse>(
                new java.util.function.Supplier<ListConfigurationsRequest.Builder>() {
                    @Override
                    public ListConfigurationsRequest.Builder get() {
                        return ListConfigurationsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListConfigurationsResponse, String>() {
                    @Override
                    public String apply(ListConfigurationsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListConfigurationsRequest.Builder>,
                        ListConfigurationsRequest>() {
                    @Override
                    public ListConfigurationsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListConfigurationsRequest.Builder>
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
                        ListConfigurationsRequest, ListConfigurationsResponse>() {
                    @Override
                    public ListConfigurationsResponse apply(ListConfigurationsRequest request) {
                        return client.listConfigurations(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link com.oracle.bmc.psql.model.ConfigurationSummary} objects
     * contained in responses from the listConfigurations operation. This iterable will fetch more data from the
     * server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link com.oracle.bmc.psql.model.ConfigurationSummary} objects
     * contained in responses received from the service.
     */
    public Iterable<com.oracle.bmc.psql.model.ConfigurationSummary>
            listConfigurationsRecordIterator(final ListConfigurationsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListConfigurationsRequest.Builder, ListConfigurationsRequest,
                ListConfigurationsResponse, com.oracle.bmc.psql.model.ConfigurationSummary>(
                new java.util.function.Supplier<ListConfigurationsRequest.Builder>() {
                    @Override
                    public ListConfigurationsRequest.Builder get() {
                        return ListConfigurationsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListConfigurationsResponse, String>() {
                    @Override
                    public String apply(ListConfigurationsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListConfigurationsRequest.Builder>,
                        ListConfigurationsRequest>() {
                    @Override
                    public ListConfigurationsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListConfigurationsRequest.Builder>
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
                        ListConfigurationsRequest, ListConfigurationsResponse>() {
                    @Override
                    public ListConfigurationsResponse apply(ListConfigurationsRequest request) {
                        return client.listConfigurations(request);
                    }
                },
                new java.util.function.Function<
                        ListConfigurationsResponse,
                        java.util.List<com.oracle.bmc.psql.model.ConfigurationSummary>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.psql.model.ConfigurationSummary> apply(
                            ListConfigurationsResponse response) {
                        return response.getConfigurationCollection().getItems();
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
                new java.util.function.Supplier<ListDbSystemsRequest.Builder>() {
                    @Override
                    public ListDbSystemsRequest.Builder get() {
                        return ListDbSystemsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListDbSystemsResponse, String>() {
                    @Override
                    public String apply(ListDbSystemsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListDbSystemsRequest.Builder>,
                        ListDbSystemsRequest>() {
                    @Override
                    public ListDbSystemsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListDbSystemsRequest.Builder>
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
                new java.util.function.Function<ListDbSystemsRequest, ListDbSystemsResponse>() {
                    @Override
                    public ListDbSystemsResponse apply(ListDbSystemsRequest request) {
                        return client.listDbSystems(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link com.oracle.bmc.psql.model.DbSystemSummary} objects
     * contained in responses from the listDbSystems operation. This iterable will fetch more data from the
     * server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link com.oracle.bmc.psql.model.DbSystemSummary} objects
     * contained in responses received from the service.
     */
    public Iterable<com.oracle.bmc.psql.model.DbSystemSummary> listDbSystemsRecordIterator(
            final ListDbSystemsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListDbSystemsRequest.Builder, ListDbSystemsRequest, ListDbSystemsResponse,
                com.oracle.bmc.psql.model.DbSystemSummary>(
                new java.util.function.Supplier<ListDbSystemsRequest.Builder>() {
                    @Override
                    public ListDbSystemsRequest.Builder get() {
                        return ListDbSystemsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListDbSystemsResponse, String>() {
                    @Override
                    public String apply(ListDbSystemsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListDbSystemsRequest.Builder>,
                        ListDbSystemsRequest>() {
                    @Override
                    public ListDbSystemsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListDbSystemsRequest.Builder>
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
                new java.util.function.Function<ListDbSystemsRequest, ListDbSystemsResponse>() {
                    @Override
                    public ListDbSystemsResponse apply(ListDbSystemsRequest request) {
                        return client.listDbSystems(request);
                    }
                },
                new java.util.function.Function<
                        ListDbSystemsResponse,
                        java.util.List<com.oracle.bmc.psql.model.DbSystemSummary>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.psql.model.DbSystemSummary> apply(
                            ListDbSystemsResponse response) {
                        return response.getDbSystemCollection().getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the listDefaultConfigurations operation. This iterable
     * will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses received from the service.
     */
    public Iterable<ListDefaultConfigurationsResponse> listDefaultConfigurationsResponseIterator(
            final ListDefaultConfigurationsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListDefaultConfigurationsRequest.Builder, ListDefaultConfigurationsRequest,
                ListDefaultConfigurationsResponse>(
                new java.util.function.Supplier<ListDefaultConfigurationsRequest.Builder>() {
                    @Override
                    public ListDefaultConfigurationsRequest.Builder get() {
                        return ListDefaultConfigurationsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListDefaultConfigurationsResponse, String>() {
                    @Override
                    public String apply(ListDefaultConfigurationsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListDefaultConfigurationsRequest.Builder>,
                        ListDefaultConfigurationsRequest>() {
                    @Override
                    public ListDefaultConfigurationsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListDefaultConfigurationsRequest.Builder>
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
                        ListDefaultConfigurationsRequest, ListDefaultConfigurationsResponse>() {
                    @Override
                    public ListDefaultConfigurationsResponse apply(
                            ListDefaultConfigurationsRequest request) {
                        return client.listDefaultConfigurations(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link com.oracle.bmc.psql.model.DefaultConfigurationSummary} objects
     * contained in responses from the listDefaultConfigurations operation. This iterable will fetch more data from the
     * server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link com.oracle.bmc.psql.model.DefaultConfigurationSummary} objects
     * contained in responses received from the service.
     */
    public Iterable<com.oracle.bmc.psql.model.DefaultConfigurationSummary>
            listDefaultConfigurationsRecordIterator(
                    final ListDefaultConfigurationsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListDefaultConfigurationsRequest.Builder, ListDefaultConfigurationsRequest,
                ListDefaultConfigurationsResponse,
                com.oracle.bmc.psql.model.DefaultConfigurationSummary>(
                new java.util.function.Supplier<ListDefaultConfigurationsRequest.Builder>() {
                    @Override
                    public ListDefaultConfigurationsRequest.Builder get() {
                        return ListDefaultConfigurationsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListDefaultConfigurationsResponse, String>() {
                    @Override
                    public String apply(ListDefaultConfigurationsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListDefaultConfigurationsRequest.Builder>,
                        ListDefaultConfigurationsRequest>() {
                    @Override
                    public ListDefaultConfigurationsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListDefaultConfigurationsRequest.Builder>
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
                        ListDefaultConfigurationsRequest, ListDefaultConfigurationsResponse>() {
                    @Override
                    public ListDefaultConfigurationsResponse apply(
                            ListDefaultConfigurationsRequest request) {
                        return client.listDefaultConfigurations(request);
                    }
                },
                new java.util.function.Function<
                        ListDefaultConfigurationsResponse,
                        java.util.List<com.oracle.bmc.psql.model.DefaultConfigurationSummary>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.psql.model.DefaultConfigurationSummary>
                            apply(ListDefaultConfigurationsResponse response) {
                        return response.getDefaultConfigurationCollection().getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the listShapes operation. This iterable
     * will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses received from the service.
     */
    public Iterable<ListShapesResponse> listShapesResponseIterator(
            final ListShapesRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListShapesRequest.Builder, ListShapesRequest, ListShapesResponse>(
                new java.util.function.Supplier<ListShapesRequest.Builder>() {
                    @Override
                    public ListShapesRequest.Builder get() {
                        return ListShapesRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListShapesResponse, String>() {
                    @Override
                    public String apply(ListShapesResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListShapesRequest.Builder>,
                        ListShapesRequest>() {
                    @Override
                    public ListShapesRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListShapesRequest.Builder>
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
                new java.util.function.Function<ListShapesRequest, ListShapesResponse>() {
                    @Override
                    public ListShapesResponse apply(ListShapesRequest request) {
                        return client.listShapes(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link com.oracle.bmc.psql.model.ShapeSummary} objects
     * contained in responses from the listShapes operation. This iterable will fetch more data from the
     * server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link com.oracle.bmc.psql.model.ShapeSummary} objects
     * contained in responses received from the service.
     */
    public Iterable<com.oracle.bmc.psql.model.ShapeSummary> listShapesRecordIterator(
            final ListShapesRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListShapesRequest.Builder, ListShapesRequest, ListShapesResponse,
                com.oracle.bmc.psql.model.ShapeSummary>(
                new java.util.function.Supplier<ListShapesRequest.Builder>() {
                    @Override
                    public ListShapesRequest.Builder get() {
                        return ListShapesRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListShapesResponse, String>() {
                    @Override
                    public String apply(ListShapesResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListShapesRequest.Builder>,
                        ListShapesRequest>() {
                    @Override
                    public ListShapesRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListShapesRequest.Builder>
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
                new java.util.function.Function<ListShapesRequest, ListShapesResponse>() {
                    @Override
                    public ListShapesResponse apply(ListShapesRequest request) {
                        return client.listShapes(request);
                    }
                },
                new java.util.function.Function<
                        ListShapesResponse,
                        java.util.List<com.oracle.bmc.psql.model.ShapeSummary>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.psql.model.ShapeSummary> apply(
                            ListShapesResponse response) {
                        return response.getShapeCollection().getItems();
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
     * Creates a new iterable which will iterate over the {@link com.oracle.bmc.psql.model.WorkRequestError} objects
     * contained in responses from the listWorkRequestErrors operation. This iterable will fetch more data from the
     * server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link com.oracle.bmc.psql.model.WorkRequestError} objects
     * contained in responses received from the service.
     */
    public Iterable<com.oracle.bmc.psql.model.WorkRequestError> listWorkRequestErrorsRecordIterator(
            final ListWorkRequestErrorsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListWorkRequestErrorsRequest.Builder, ListWorkRequestErrorsRequest,
                ListWorkRequestErrorsResponse, com.oracle.bmc.psql.model.WorkRequestError>(
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
                        java.util.List<com.oracle.bmc.psql.model.WorkRequestError>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.psql.model.WorkRequestError> apply(
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
     * Creates a new iterable which will iterate over the {@link com.oracle.bmc.psql.model.WorkRequestLogEntry} objects
     * contained in responses from the listWorkRequestLogs operation. This iterable will fetch more data from the
     * server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link com.oracle.bmc.psql.model.WorkRequestLogEntry} objects
     * contained in responses received from the service.
     */
    public Iterable<com.oracle.bmc.psql.model.WorkRequestLogEntry>
            listWorkRequestLogsRecordIterator(final ListWorkRequestLogsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListWorkRequestLogsRequest.Builder, ListWorkRequestLogsRequest,
                ListWorkRequestLogsResponse, com.oracle.bmc.psql.model.WorkRequestLogEntry>(
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
                        java.util.List<com.oracle.bmc.psql.model.WorkRequestLogEntry>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.psql.model.WorkRequestLogEntry> apply(
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
     * Creates a new iterable which will iterate over the {@link com.oracle.bmc.psql.model.WorkRequestSummary} objects
     * contained in responses from the listWorkRequests operation. This iterable will fetch more data from the
     * server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link com.oracle.bmc.psql.model.WorkRequestSummary} objects
     * contained in responses received from the service.
     */
    public Iterable<com.oracle.bmc.psql.model.WorkRequestSummary> listWorkRequestsRecordIterator(
            final ListWorkRequestsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListWorkRequestsRequest.Builder, ListWorkRequestsRequest, ListWorkRequestsResponse,
                com.oracle.bmc.psql.model.WorkRequestSummary>(
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
                        java.util.List<com.oracle.bmc.psql.model.WorkRequestSummary>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.psql.model.WorkRequestSummary> apply(
                            ListWorkRequestsResponse response) {
                        return response.getWorkRequestSummaryCollection().getItems();
                    }
                });
    }
}

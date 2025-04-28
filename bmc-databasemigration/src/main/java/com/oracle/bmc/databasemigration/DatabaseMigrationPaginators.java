/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.databasemigration;

import com.oracle.bmc.databasemigration.requests.*;
import com.oracle.bmc.databasemigration.responses.*;

/**
 * Collection of helper methods that can be used to provide an {@link java.lang.Iterable} interface
 * to any list operations of DatabaseMigration where multiple pages of data may be fetched. Two
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
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20230518")
public class DatabaseMigrationPaginators {
    private final DatabaseMigration client;

    public DatabaseMigrationPaginators(DatabaseMigration client) {
        this.client = client;
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the
     * listConnections operation. This iterable will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses
     *     received from the service.
     */
    public Iterable<ListConnectionsResponse> listConnectionsResponseIterator(
            final ListConnectionsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListConnectionsRequest.Builder, ListConnectionsRequest, ListConnectionsResponse>(
                new java.util.function.Supplier<ListConnectionsRequest.Builder>() {
                    @Override
                    public ListConnectionsRequest.Builder get() {
                        return ListConnectionsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListConnectionsResponse, String>() {
                    @Override
                    public String apply(ListConnectionsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListConnectionsRequest.Builder>,
                        ListConnectionsRequest>() {
                    @Override
                    public ListConnectionsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListConnectionsRequest.Builder>
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
                new java.util.function.Function<ListConnectionsRequest, ListConnectionsResponse>() {
                    @Override
                    public ListConnectionsResponse apply(ListConnectionsRequest request) {
                        return client.listConnections(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link
     * com.oracle.bmc.databasemigration.model.ConnectionSummary} objects contained in responses from
     * the listConnections operation. This iterable will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link
     *     com.oracle.bmc.databasemigration.model.ConnectionSummary} objects contained in responses
     *     received from the service.
     */
    public Iterable<com.oracle.bmc.databasemigration.model.ConnectionSummary>
            listConnectionsRecordIterator(final ListConnectionsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListConnectionsRequest.Builder,
                ListConnectionsRequest,
                ListConnectionsResponse,
                com.oracle.bmc.databasemigration.model.ConnectionSummary>(
                new java.util.function.Supplier<ListConnectionsRequest.Builder>() {
                    @Override
                    public ListConnectionsRequest.Builder get() {
                        return ListConnectionsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListConnectionsResponse, String>() {
                    @Override
                    public String apply(ListConnectionsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListConnectionsRequest.Builder>,
                        ListConnectionsRequest>() {
                    @Override
                    public ListConnectionsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListConnectionsRequest.Builder>
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
                new java.util.function.Function<ListConnectionsRequest, ListConnectionsResponse>() {
                    @Override
                    public ListConnectionsResponse apply(ListConnectionsRequest request) {
                        return client.listConnections(request);
                    }
                },
                new java.util.function.Function<
                        ListConnectionsResponse,
                        java.util.List<
                                com.oracle.bmc.databasemigration.model.ConnectionSummary>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.databasemigration.model.ConnectionSummary>
                            apply(ListConnectionsResponse response) {
                        return response.getConnectionCollection().getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the
     * listExcludedObjects operation. This iterable will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses
     *     received from the service.
     */
    public Iterable<ListExcludedObjectsResponse> listExcludedObjectsResponseIterator(
            final ListExcludedObjectsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListExcludedObjectsRequest.Builder,
                ListExcludedObjectsRequest,
                ListExcludedObjectsResponse>(
                new java.util.function.Supplier<ListExcludedObjectsRequest.Builder>() {
                    @Override
                    public ListExcludedObjectsRequest.Builder get() {
                        return ListExcludedObjectsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListExcludedObjectsResponse, String>() {
                    @Override
                    public String apply(ListExcludedObjectsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListExcludedObjectsRequest.Builder>,
                        ListExcludedObjectsRequest>() {
                    @Override
                    public ListExcludedObjectsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListExcludedObjectsRequest.Builder>
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
                        ListExcludedObjectsRequest, ListExcludedObjectsResponse>() {
                    @Override
                    public ListExcludedObjectsResponse apply(ListExcludedObjectsRequest request) {
                        return client.listExcludedObjects(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link
     * com.oracle.bmc.databasemigration.model.ExcludedObjectSummary} objects contained in responses
     * from the listExcludedObjects operation. This iterable will fetch more data from the server as
     * needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link
     *     com.oracle.bmc.databasemigration.model.ExcludedObjectSummary} objects contained in
     *     responses received from the service.
     */
    public Iterable<com.oracle.bmc.databasemigration.model.ExcludedObjectSummary>
            listExcludedObjectsRecordIterator(final ListExcludedObjectsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListExcludedObjectsRequest.Builder,
                ListExcludedObjectsRequest,
                ListExcludedObjectsResponse,
                com.oracle.bmc.databasemigration.model.ExcludedObjectSummary>(
                new java.util.function.Supplier<ListExcludedObjectsRequest.Builder>() {
                    @Override
                    public ListExcludedObjectsRequest.Builder get() {
                        return ListExcludedObjectsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListExcludedObjectsResponse, String>() {
                    @Override
                    public String apply(ListExcludedObjectsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListExcludedObjectsRequest.Builder>,
                        ListExcludedObjectsRequest>() {
                    @Override
                    public ListExcludedObjectsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListExcludedObjectsRequest.Builder>
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
                        ListExcludedObjectsRequest, ListExcludedObjectsResponse>() {
                    @Override
                    public ListExcludedObjectsResponse apply(ListExcludedObjectsRequest request) {
                        return client.listExcludedObjects(request);
                    }
                },
                new java.util.function.Function<
                        ListExcludedObjectsResponse,
                        java.util.List<
                                com.oracle.bmc.databasemigration.model.ExcludedObjectSummary>>() {
                    @Override
                    public java.util.List<
                                    com.oracle.bmc.databasemigration.model.ExcludedObjectSummary>
                            apply(ListExcludedObjectsResponse response) {
                        return response.getExcludedObjectSummaryCollection().getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the listJobOutputs
     * operation. This iterable will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses
     *     received from the service.
     */
    public Iterable<ListJobOutputsResponse> listJobOutputsResponseIterator(
            final ListJobOutputsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListJobOutputsRequest.Builder, ListJobOutputsRequest, ListJobOutputsResponse>(
                new java.util.function.Supplier<ListJobOutputsRequest.Builder>() {
                    @Override
                    public ListJobOutputsRequest.Builder get() {
                        return ListJobOutputsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListJobOutputsResponse, String>() {
                    @Override
                    public String apply(ListJobOutputsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListJobOutputsRequest.Builder>,
                        ListJobOutputsRequest>() {
                    @Override
                    public ListJobOutputsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListJobOutputsRequest.Builder>
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
                new java.util.function.Function<ListJobOutputsRequest, ListJobOutputsResponse>() {
                    @Override
                    public ListJobOutputsResponse apply(ListJobOutputsRequest request) {
                        return client.listJobOutputs(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link
     * com.oracle.bmc.databasemigration.model.JobOutputSummary} objects contained in responses from
     * the listJobOutputs operation. This iterable will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link
     *     com.oracle.bmc.databasemigration.model.JobOutputSummary} objects contained in responses
     *     received from the service.
     */
    public Iterable<com.oracle.bmc.databasemigration.model.JobOutputSummary>
            listJobOutputsRecordIterator(final ListJobOutputsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListJobOutputsRequest.Builder,
                ListJobOutputsRequest,
                ListJobOutputsResponse,
                com.oracle.bmc.databasemigration.model.JobOutputSummary>(
                new java.util.function.Supplier<ListJobOutputsRequest.Builder>() {
                    @Override
                    public ListJobOutputsRequest.Builder get() {
                        return ListJobOutputsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListJobOutputsResponse, String>() {
                    @Override
                    public String apply(ListJobOutputsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListJobOutputsRequest.Builder>,
                        ListJobOutputsRequest>() {
                    @Override
                    public ListJobOutputsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListJobOutputsRequest.Builder>
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
                new java.util.function.Function<ListJobOutputsRequest, ListJobOutputsResponse>() {
                    @Override
                    public ListJobOutputsResponse apply(ListJobOutputsRequest request) {
                        return client.listJobOutputs(request);
                    }
                },
                new java.util.function.Function<
                        ListJobOutputsResponse,
                        java.util.List<com.oracle.bmc.databasemigration.model.JobOutputSummary>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.databasemigration.model.JobOutputSummary>
                            apply(ListJobOutputsResponse response) {
                        return response.getJobOutputSummaryCollection().getItems();
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
     * com.oracle.bmc.databasemigration.model.JobSummary} objects contained in responses from the
     * listJobs operation. This iterable will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link
     *     com.oracle.bmc.databasemigration.model.JobSummary} objects contained in responses
     *     received from the service.
     */
    public Iterable<com.oracle.bmc.databasemigration.model.JobSummary> listJobsRecordIterator(
            final ListJobsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListJobsRequest.Builder,
                ListJobsRequest,
                ListJobsResponse,
                com.oracle.bmc.databasemigration.model.JobSummary>(
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
                        java.util.List<com.oracle.bmc.databasemigration.model.JobSummary>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.databasemigration.model.JobSummary> apply(
                            ListJobsResponse response) {
                        return response.getJobCollection().getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the
     * listMigrationObjectTypes operation. This iterable will fetch more data from the server as
     * needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses
     *     received from the service.
     */
    public Iterable<ListMigrationObjectTypesResponse> listMigrationObjectTypesResponseIterator(
            final ListMigrationObjectTypesRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListMigrationObjectTypesRequest.Builder,
                ListMigrationObjectTypesRequest,
                ListMigrationObjectTypesResponse>(
                new java.util.function.Supplier<ListMigrationObjectTypesRequest.Builder>() {
                    @Override
                    public ListMigrationObjectTypesRequest.Builder get() {
                        return ListMigrationObjectTypesRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListMigrationObjectTypesResponse, String>() {
                    @Override
                    public String apply(ListMigrationObjectTypesResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListMigrationObjectTypesRequest.Builder>,
                        ListMigrationObjectTypesRequest>() {
                    @Override
                    public ListMigrationObjectTypesRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListMigrationObjectTypesRequest.Builder>
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
                        ListMigrationObjectTypesRequest, ListMigrationObjectTypesResponse>() {
                    @Override
                    public ListMigrationObjectTypesResponse apply(
                            ListMigrationObjectTypesRequest request) {
                        return client.listMigrationObjectTypes(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link
     * com.oracle.bmc.databasemigration.model.MigrationObjectTypeSummary} objects contained in
     * responses from the listMigrationObjectTypes operation. This iterable will fetch more data
     * from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link
     *     com.oracle.bmc.databasemigration.model.MigrationObjectTypeSummary} objects contained in
     *     responses received from the service.
     */
    public Iterable<com.oracle.bmc.databasemigration.model.MigrationObjectTypeSummary>
            listMigrationObjectTypesRecordIterator(final ListMigrationObjectTypesRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListMigrationObjectTypesRequest.Builder,
                ListMigrationObjectTypesRequest,
                ListMigrationObjectTypesResponse,
                com.oracle.bmc.databasemigration.model.MigrationObjectTypeSummary>(
                new java.util.function.Supplier<ListMigrationObjectTypesRequest.Builder>() {
                    @Override
                    public ListMigrationObjectTypesRequest.Builder get() {
                        return ListMigrationObjectTypesRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListMigrationObjectTypesResponse, String>() {
                    @Override
                    public String apply(ListMigrationObjectTypesResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListMigrationObjectTypesRequest.Builder>,
                        ListMigrationObjectTypesRequest>() {
                    @Override
                    public ListMigrationObjectTypesRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListMigrationObjectTypesRequest.Builder>
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
                        ListMigrationObjectTypesRequest, ListMigrationObjectTypesResponse>() {
                    @Override
                    public ListMigrationObjectTypesResponse apply(
                            ListMigrationObjectTypesRequest request) {
                        return client.listMigrationObjectTypes(request);
                    }
                },
                new java.util.function.Function<
                        ListMigrationObjectTypesResponse,
                        java.util.List<
                                com.oracle.bmc.databasemigration.model
                                        .MigrationObjectTypeSummary>>() {
                    @Override
                    public java.util.List<
                                    com.oracle.bmc.databasemigration.model
                                            .MigrationObjectTypeSummary>
                            apply(ListMigrationObjectTypesResponse response) {
                        return response.getMigrationObjectTypeSummaryCollection().getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the
     * listMigrationParameters operation. This iterable will fetch more data from the server as
     * needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses
     *     received from the service.
     */
    public Iterable<ListMigrationParametersResponse> listMigrationParametersResponseIterator(
            final ListMigrationParametersRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListMigrationParametersRequest.Builder,
                ListMigrationParametersRequest,
                ListMigrationParametersResponse>(
                new java.util.function.Supplier<ListMigrationParametersRequest.Builder>() {
                    @Override
                    public ListMigrationParametersRequest.Builder get() {
                        return ListMigrationParametersRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListMigrationParametersResponse, String>() {
                    @Override
                    public String apply(ListMigrationParametersResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListMigrationParametersRequest.Builder>,
                        ListMigrationParametersRequest>() {
                    @Override
                    public ListMigrationParametersRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListMigrationParametersRequest.Builder>
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
                        ListMigrationParametersRequest, ListMigrationParametersResponse>() {
                    @Override
                    public ListMigrationParametersResponse apply(
                            ListMigrationParametersRequest request) {
                        return client.listMigrationParameters(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link
     * com.oracle.bmc.databasemigration.model.MigrationParameterSummary} objects contained in
     * responses from the listMigrationParameters operation. This iterable will fetch more data from
     * the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link
     *     com.oracle.bmc.databasemigration.model.MigrationParameterSummary} objects contained in
     *     responses received from the service.
     */
    public Iterable<com.oracle.bmc.databasemigration.model.MigrationParameterSummary>
            listMigrationParametersRecordIterator(final ListMigrationParametersRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListMigrationParametersRequest.Builder,
                ListMigrationParametersRequest,
                ListMigrationParametersResponse,
                com.oracle.bmc.databasemigration.model.MigrationParameterSummary>(
                new java.util.function.Supplier<ListMigrationParametersRequest.Builder>() {
                    @Override
                    public ListMigrationParametersRequest.Builder get() {
                        return ListMigrationParametersRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListMigrationParametersResponse, String>() {
                    @Override
                    public String apply(ListMigrationParametersResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListMigrationParametersRequest.Builder>,
                        ListMigrationParametersRequest>() {
                    @Override
                    public ListMigrationParametersRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListMigrationParametersRequest.Builder>
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
                        ListMigrationParametersRequest, ListMigrationParametersResponse>() {
                    @Override
                    public ListMigrationParametersResponse apply(
                            ListMigrationParametersRequest request) {
                        return client.listMigrationParameters(request);
                    }
                },
                new java.util.function.Function<
                        ListMigrationParametersResponse,
                        java.util.List<
                                com.oracle.bmc.databasemigration.model
                                        .MigrationParameterSummary>>() {
                    @Override
                    public java.util.List<
                                    com.oracle.bmc.databasemigration.model
                                            .MigrationParameterSummary>
                            apply(ListMigrationParametersResponse response) {
                        return response.getMigrationParameterSummaryCollection().getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the listMigrations
     * operation. This iterable will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses
     *     received from the service.
     */
    public Iterable<ListMigrationsResponse> listMigrationsResponseIterator(
            final ListMigrationsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListMigrationsRequest.Builder, ListMigrationsRequest, ListMigrationsResponse>(
                new java.util.function.Supplier<ListMigrationsRequest.Builder>() {
                    @Override
                    public ListMigrationsRequest.Builder get() {
                        return ListMigrationsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListMigrationsResponse, String>() {
                    @Override
                    public String apply(ListMigrationsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListMigrationsRequest.Builder>,
                        ListMigrationsRequest>() {
                    @Override
                    public ListMigrationsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListMigrationsRequest.Builder>
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
                new java.util.function.Function<ListMigrationsRequest, ListMigrationsResponse>() {
                    @Override
                    public ListMigrationsResponse apply(ListMigrationsRequest request) {
                        return client.listMigrations(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link
     * com.oracle.bmc.databasemigration.model.MigrationSummary} objects contained in responses from
     * the listMigrations operation. This iterable will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link
     *     com.oracle.bmc.databasemigration.model.MigrationSummary} objects contained in responses
     *     received from the service.
     */
    public Iterable<com.oracle.bmc.databasemigration.model.MigrationSummary>
            listMigrationsRecordIterator(final ListMigrationsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListMigrationsRequest.Builder,
                ListMigrationsRequest,
                ListMigrationsResponse,
                com.oracle.bmc.databasemigration.model.MigrationSummary>(
                new java.util.function.Supplier<ListMigrationsRequest.Builder>() {
                    @Override
                    public ListMigrationsRequest.Builder get() {
                        return ListMigrationsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListMigrationsResponse, String>() {
                    @Override
                    public String apply(ListMigrationsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListMigrationsRequest.Builder>,
                        ListMigrationsRequest>() {
                    @Override
                    public ListMigrationsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListMigrationsRequest.Builder>
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
                new java.util.function.Function<ListMigrationsRequest, ListMigrationsResponse>() {
                    @Override
                    public ListMigrationsResponse apply(ListMigrationsRequest request) {
                        return client.listMigrations(request);
                    }
                },
                new java.util.function.Function<
                        ListMigrationsResponse,
                        java.util.List<com.oracle.bmc.databasemigration.model.MigrationSummary>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.databasemigration.model.MigrationSummary>
                            apply(ListMigrationsResponse response) {
                        return response.getMigrationCollection().getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the
     * listParameterFileVersions operation. This iterable will fetch more data from the server as
     * needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses
     *     received from the service.
     */
    public Iterable<ListParameterFileVersionsResponse> listParameterFileVersionsResponseIterator(
            final ListParameterFileVersionsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListParameterFileVersionsRequest.Builder,
                ListParameterFileVersionsRequest,
                ListParameterFileVersionsResponse>(
                new java.util.function.Supplier<ListParameterFileVersionsRequest.Builder>() {
                    @Override
                    public ListParameterFileVersionsRequest.Builder get() {
                        return ListParameterFileVersionsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListParameterFileVersionsResponse, String>() {
                    @Override
                    public String apply(ListParameterFileVersionsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListParameterFileVersionsRequest.Builder>,
                        ListParameterFileVersionsRequest>() {
                    @Override
                    public ListParameterFileVersionsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListParameterFileVersionsRequest.Builder>
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
                        ListParameterFileVersionsRequest, ListParameterFileVersionsResponse>() {
                    @Override
                    public ListParameterFileVersionsResponse apply(
                            ListParameterFileVersionsRequest request) {
                        return client.listParameterFileVersions(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link
     * com.oracle.bmc.databasemigration.model.ParameterFileVersionSummary} objects contained in
     * responses from the listParameterFileVersions operation. This iterable will fetch more data
     * from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link
     *     com.oracle.bmc.databasemigration.model.ParameterFileVersionSummary} objects contained in
     *     responses received from the service.
     */
    public Iterable<com.oracle.bmc.databasemigration.model.ParameterFileVersionSummary>
            listParameterFileVersionsRecordIterator(
                    final ListParameterFileVersionsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListParameterFileVersionsRequest.Builder,
                ListParameterFileVersionsRequest,
                ListParameterFileVersionsResponse,
                com.oracle.bmc.databasemigration.model.ParameterFileVersionSummary>(
                new java.util.function.Supplier<ListParameterFileVersionsRequest.Builder>() {
                    @Override
                    public ListParameterFileVersionsRequest.Builder get() {
                        return ListParameterFileVersionsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListParameterFileVersionsResponse, String>() {
                    @Override
                    public String apply(ListParameterFileVersionsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListParameterFileVersionsRequest.Builder>,
                        ListParameterFileVersionsRequest>() {
                    @Override
                    public ListParameterFileVersionsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListParameterFileVersionsRequest.Builder>
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
                        ListParameterFileVersionsRequest, ListParameterFileVersionsResponse>() {
                    @Override
                    public ListParameterFileVersionsResponse apply(
                            ListParameterFileVersionsRequest request) {
                        return client.listParameterFileVersions(request);
                    }
                },
                new java.util.function.Function<
                        ListParameterFileVersionsResponse,
                        java.util.List<
                                com.oracle.bmc.databasemigration.model
                                        .ParameterFileVersionSummary>>() {
                    @Override
                    public java.util.List<
                                    com.oracle.bmc.databasemigration.model
                                            .ParameterFileVersionSummary>
                            apply(ListParameterFileVersionsResponse response) {
                        return response.getParameterFileVersionCollection().getItems();
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
     * com.oracle.bmc.databasemigration.model.WorkRequestError} objects contained in responses from
     * the listWorkRequestErrors operation. This iterable will fetch more data from the server as
     * needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link
     *     com.oracle.bmc.databasemigration.model.WorkRequestError} objects contained in responses
     *     received from the service.
     */
    public Iterable<com.oracle.bmc.databasemigration.model.WorkRequestError>
            listWorkRequestErrorsRecordIterator(final ListWorkRequestErrorsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListWorkRequestErrorsRequest.Builder,
                ListWorkRequestErrorsRequest,
                ListWorkRequestErrorsResponse,
                com.oracle.bmc.databasemigration.model.WorkRequestError>(
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
                        java.util.List<com.oracle.bmc.databasemigration.model.WorkRequestError>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.databasemigration.model.WorkRequestError>
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
     * com.oracle.bmc.databasemigration.model.WorkRequestLogEntry} objects contained in responses
     * from the listWorkRequestLogs operation. This iterable will fetch more data from the server as
     * needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link
     *     com.oracle.bmc.databasemigration.model.WorkRequestLogEntry} objects contained in
     *     responses received from the service.
     */
    public Iterable<com.oracle.bmc.databasemigration.model.WorkRequestLogEntry>
            listWorkRequestLogsRecordIterator(final ListWorkRequestLogsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListWorkRequestLogsRequest.Builder,
                ListWorkRequestLogsRequest,
                ListWorkRequestLogsResponse,
                com.oracle.bmc.databasemigration.model.WorkRequestLogEntry>(
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
                                com.oracle.bmc.databasemigration.model.WorkRequestLogEntry>>() {
                    @Override
                    public java.util.List<
                                    com.oracle.bmc.databasemigration.model.WorkRequestLogEntry>
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
     * com.oracle.bmc.databasemigration.model.WorkRequestSummary} objects contained in responses
     * from the listWorkRequests operation. This iterable will fetch more data from the server as
     * needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link
     *     com.oracle.bmc.databasemigration.model.WorkRequestSummary} objects contained in responses
     *     received from the service.
     */
    public Iterable<com.oracle.bmc.databasemigration.model.WorkRequestSummary>
            listWorkRequestsRecordIterator(final ListWorkRequestsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListWorkRequestsRequest.Builder,
                ListWorkRequestsRequest,
                ListWorkRequestsResponse,
                com.oracle.bmc.databasemigration.model.WorkRequestSummary>(
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
                                com.oracle.bmc.databasemigration.model.WorkRequestSummary>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.databasemigration.model.WorkRequestSummary>
                            apply(ListWorkRequestsResponse response) {
                        return response.getWorkRequestCollection().getItems();
                    }
                });
    }
}

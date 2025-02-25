/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.cloudmigrations;

import com.oracle.bmc.cloudmigrations.requests.*;
import com.oracle.bmc.cloudmigrations.responses.*;

/**
 * Collection of helper methods that can be used to provide an {@link java.lang.Iterable} interface
 * to any list operations of Migration where multiple pages of data may be fetched.
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
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20220919")
public class MigrationPaginators {
    private final Migration client;

    public MigrationPaginators(Migration client) {
        this.client = client;
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the listAvailableShapes operation. This iterable
     * will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses received from the service.
     */
    public Iterable<ListAvailableShapesResponse> listAvailableShapesResponseIterator(
            final ListAvailableShapesRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListAvailableShapesRequest.Builder, ListAvailableShapesRequest,
                ListAvailableShapesResponse>(
                new java.util.function.Supplier<ListAvailableShapesRequest.Builder>() {
                    @Override
                    public ListAvailableShapesRequest.Builder get() {
                        return ListAvailableShapesRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListAvailableShapesResponse, String>() {
                    @Override
                    public String apply(ListAvailableShapesResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListAvailableShapesRequest.Builder>,
                        ListAvailableShapesRequest>() {
                    @Override
                    public ListAvailableShapesRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListAvailableShapesRequest.Builder>
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
                        ListAvailableShapesRequest, ListAvailableShapesResponse>() {
                    @Override
                    public ListAvailableShapesResponse apply(ListAvailableShapesRequest request) {
                        return client.listAvailableShapes(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link com.oracle.bmc.cloudmigrations.model.AvailableShapeSummary} objects
     * contained in responses from the listAvailableShapes operation. This iterable will fetch more data from the
     * server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link com.oracle.bmc.cloudmigrations.model.AvailableShapeSummary} objects
     * contained in responses received from the service.
     */
    public Iterable<com.oracle.bmc.cloudmigrations.model.AvailableShapeSummary>
            listAvailableShapesRecordIterator(final ListAvailableShapesRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListAvailableShapesRequest.Builder, ListAvailableShapesRequest,
                ListAvailableShapesResponse,
                com.oracle.bmc.cloudmigrations.model.AvailableShapeSummary>(
                new java.util.function.Supplier<ListAvailableShapesRequest.Builder>() {
                    @Override
                    public ListAvailableShapesRequest.Builder get() {
                        return ListAvailableShapesRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListAvailableShapesResponse, String>() {
                    @Override
                    public String apply(ListAvailableShapesResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListAvailableShapesRequest.Builder>,
                        ListAvailableShapesRequest>() {
                    @Override
                    public ListAvailableShapesRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListAvailableShapesRequest.Builder>
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
                        ListAvailableShapesRequest, ListAvailableShapesResponse>() {
                    @Override
                    public ListAvailableShapesResponse apply(ListAvailableShapesRequest request) {
                        return client.listAvailableShapes(request);
                    }
                },
                new java.util.function.Function<
                        ListAvailableShapesResponse,
                        java.util.List<
                                com.oracle.bmc.cloudmigrations.model.AvailableShapeSummary>>() {
                    @Override
                    public java.util.List<
                                    com.oracle.bmc.cloudmigrations.model.AvailableShapeSummary>
                            apply(ListAvailableShapesResponse response) {
                        return response.getAvailableShapesCollection().getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the listMigrationAssets operation. This iterable
     * will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses received from the service.
     */
    public Iterable<ListMigrationAssetsResponse> listMigrationAssetsResponseIterator(
            final ListMigrationAssetsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListMigrationAssetsRequest.Builder, ListMigrationAssetsRequest,
                ListMigrationAssetsResponse>(
                new java.util.function.Supplier<ListMigrationAssetsRequest.Builder>() {
                    @Override
                    public ListMigrationAssetsRequest.Builder get() {
                        return ListMigrationAssetsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListMigrationAssetsResponse, String>() {
                    @Override
                    public String apply(ListMigrationAssetsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListMigrationAssetsRequest.Builder>,
                        ListMigrationAssetsRequest>() {
                    @Override
                    public ListMigrationAssetsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListMigrationAssetsRequest.Builder>
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
                        ListMigrationAssetsRequest, ListMigrationAssetsResponse>() {
                    @Override
                    public ListMigrationAssetsResponse apply(ListMigrationAssetsRequest request) {
                        return client.listMigrationAssets(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link com.oracle.bmc.cloudmigrations.model.MigrationAssetSummary} objects
     * contained in responses from the listMigrationAssets operation. This iterable will fetch more data from the
     * server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link com.oracle.bmc.cloudmigrations.model.MigrationAssetSummary} objects
     * contained in responses received from the service.
     */
    public Iterable<com.oracle.bmc.cloudmigrations.model.MigrationAssetSummary>
            listMigrationAssetsRecordIterator(final ListMigrationAssetsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListMigrationAssetsRequest.Builder, ListMigrationAssetsRequest,
                ListMigrationAssetsResponse,
                com.oracle.bmc.cloudmigrations.model.MigrationAssetSummary>(
                new java.util.function.Supplier<ListMigrationAssetsRequest.Builder>() {
                    @Override
                    public ListMigrationAssetsRequest.Builder get() {
                        return ListMigrationAssetsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListMigrationAssetsResponse, String>() {
                    @Override
                    public String apply(ListMigrationAssetsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListMigrationAssetsRequest.Builder>,
                        ListMigrationAssetsRequest>() {
                    @Override
                    public ListMigrationAssetsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListMigrationAssetsRequest.Builder>
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
                        ListMigrationAssetsRequest, ListMigrationAssetsResponse>() {
                    @Override
                    public ListMigrationAssetsResponse apply(ListMigrationAssetsRequest request) {
                        return client.listMigrationAssets(request);
                    }
                },
                new java.util.function.Function<
                        ListMigrationAssetsResponse,
                        java.util.List<
                                com.oracle.bmc.cloudmigrations.model.MigrationAssetSummary>>() {
                    @Override
                    public java.util.List<
                                    com.oracle.bmc.cloudmigrations.model.MigrationAssetSummary>
                            apply(ListMigrationAssetsResponse response) {
                        return response.getMigrationAssetCollection().getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the listMigrationPlans operation. This iterable
     * will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses received from the service.
     */
    public Iterable<ListMigrationPlansResponse> listMigrationPlansResponseIterator(
            final ListMigrationPlansRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListMigrationPlansRequest.Builder, ListMigrationPlansRequest,
                ListMigrationPlansResponse>(
                new java.util.function.Supplier<ListMigrationPlansRequest.Builder>() {
                    @Override
                    public ListMigrationPlansRequest.Builder get() {
                        return ListMigrationPlansRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListMigrationPlansResponse, String>() {
                    @Override
                    public String apply(ListMigrationPlansResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListMigrationPlansRequest.Builder>,
                        ListMigrationPlansRequest>() {
                    @Override
                    public ListMigrationPlansRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListMigrationPlansRequest.Builder>
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
                        ListMigrationPlansRequest, ListMigrationPlansResponse>() {
                    @Override
                    public ListMigrationPlansResponse apply(ListMigrationPlansRequest request) {
                        return client.listMigrationPlans(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link com.oracle.bmc.cloudmigrations.model.MigrationPlanSummary} objects
     * contained in responses from the listMigrationPlans operation. This iterable will fetch more data from the
     * server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link com.oracle.bmc.cloudmigrations.model.MigrationPlanSummary} objects
     * contained in responses received from the service.
     */
    public Iterable<com.oracle.bmc.cloudmigrations.model.MigrationPlanSummary>
            listMigrationPlansRecordIterator(final ListMigrationPlansRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListMigrationPlansRequest.Builder, ListMigrationPlansRequest,
                ListMigrationPlansResponse,
                com.oracle.bmc.cloudmigrations.model.MigrationPlanSummary>(
                new java.util.function.Supplier<ListMigrationPlansRequest.Builder>() {
                    @Override
                    public ListMigrationPlansRequest.Builder get() {
                        return ListMigrationPlansRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListMigrationPlansResponse, String>() {
                    @Override
                    public String apply(ListMigrationPlansResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListMigrationPlansRequest.Builder>,
                        ListMigrationPlansRequest>() {
                    @Override
                    public ListMigrationPlansRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListMigrationPlansRequest.Builder>
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
                        ListMigrationPlansRequest, ListMigrationPlansResponse>() {
                    @Override
                    public ListMigrationPlansResponse apply(ListMigrationPlansRequest request) {
                        return client.listMigrationPlans(request);
                    }
                },
                new java.util.function.Function<
                        ListMigrationPlansResponse,
                        java.util.List<
                                com.oracle.bmc.cloudmigrations.model.MigrationPlanSummary>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.cloudmigrations.model.MigrationPlanSummary>
                            apply(ListMigrationPlansResponse response) {
                        return response.getMigrationPlanCollection().getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the listMigrations operation. This iterable
     * will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses received from the service.
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
     * Creates a new iterable which will iterate over the {@link com.oracle.bmc.cloudmigrations.model.MigrationSummary} objects
     * contained in responses from the listMigrations operation. This iterable will fetch more data from the
     * server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link com.oracle.bmc.cloudmigrations.model.MigrationSummary} objects
     * contained in responses received from the service.
     */
    public Iterable<com.oracle.bmc.cloudmigrations.model.MigrationSummary>
            listMigrationsRecordIterator(final ListMigrationsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListMigrationsRequest.Builder, ListMigrationsRequest, ListMigrationsResponse,
                com.oracle.bmc.cloudmigrations.model.MigrationSummary>(
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
                        java.util.List<com.oracle.bmc.cloudmigrations.model.MigrationSummary>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.cloudmigrations.model.MigrationSummary>
                            apply(ListMigrationsResponse response) {
                        return response.getMigrationCollection().getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the listReplicationSchedules operation. This iterable
     * will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses received from the service.
     */
    public Iterable<ListReplicationSchedulesResponse> listReplicationSchedulesResponseIterator(
            final ListReplicationSchedulesRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListReplicationSchedulesRequest.Builder, ListReplicationSchedulesRequest,
                ListReplicationSchedulesResponse>(
                new java.util.function.Supplier<ListReplicationSchedulesRequest.Builder>() {
                    @Override
                    public ListReplicationSchedulesRequest.Builder get() {
                        return ListReplicationSchedulesRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListReplicationSchedulesResponse, String>() {
                    @Override
                    public String apply(ListReplicationSchedulesResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListReplicationSchedulesRequest.Builder>,
                        ListReplicationSchedulesRequest>() {
                    @Override
                    public ListReplicationSchedulesRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListReplicationSchedulesRequest.Builder>
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
                        ListReplicationSchedulesRequest, ListReplicationSchedulesResponse>() {
                    @Override
                    public ListReplicationSchedulesResponse apply(
                            ListReplicationSchedulesRequest request) {
                        return client.listReplicationSchedules(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link com.oracle.bmc.cloudmigrations.model.ReplicationScheduleSummary} objects
     * contained in responses from the listReplicationSchedules operation. This iterable will fetch more data from the
     * server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link com.oracle.bmc.cloudmigrations.model.ReplicationScheduleSummary} objects
     * contained in responses received from the service.
     */
    public Iterable<com.oracle.bmc.cloudmigrations.model.ReplicationScheduleSummary>
            listReplicationSchedulesRecordIterator(final ListReplicationSchedulesRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListReplicationSchedulesRequest.Builder, ListReplicationSchedulesRequest,
                ListReplicationSchedulesResponse,
                com.oracle.bmc.cloudmigrations.model.ReplicationScheduleSummary>(
                new java.util.function.Supplier<ListReplicationSchedulesRequest.Builder>() {
                    @Override
                    public ListReplicationSchedulesRequest.Builder get() {
                        return ListReplicationSchedulesRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListReplicationSchedulesResponse, String>() {
                    @Override
                    public String apply(ListReplicationSchedulesResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListReplicationSchedulesRequest.Builder>,
                        ListReplicationSchedulesRequest>() {
                    @Override
                    public ListReplicationSchedulesRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListReplicationSchedulesRequest.Builder>
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
                        ListReplicationSchedulesRequest, ListReplicationSchedulesResponse>() {
                    @Override
                    public ListReplicationSchedulesResponse apply(
                            ListReplicationSchedulesRequest request) {
                        return client.listReplicationSchedules(request);
                    }
                },
                new java.util.function.Function<
                        ListReplicationSchedulesResponse,
                        java.util.List<
                                com.oracle.bmc.cloudmigrations.model
                                        .ReplicationScheduleSummary>>() {
                    @Override
                    public java.util.List<
                                    com.oracle.bmc.cloudmigrations.model.ReplicationScheduleSummary>
                            apply(ListReplicationSchedulesResponse response) {
                        return response.getReplicationScheduleCollection().getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the listTargetAssets operation. This iterable
     * will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses received from the service.
     */
    public Iterable<ListTargetAssetsResponse> listTargetAssetsResponseIterator(
            final ListTargetAssetsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListTargetAssetsRequest.Builder, ListTargetAssetsRequest, ListTargetAssetsResponse>(
                new java.util.function.Supplier<ListTargetAssetsRequest.Builder>() {
                    @Override
                    public ListTargetAssetsRequest.Builder get() {
                        return ListTargetAssetsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListTargetAssetsResponse, String>() {
                    @Override
                    public String apply(ListTargetAssetsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListTargetAssetsRequest.Builder>,
                        ListTargetAssetsRequest>() {
                    @Override
                    public ListTargetAssetsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListTargetAssetsRequest.Builder>
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
                        ListTargetAssetsRequest, ListTargetAssetsResponse>() {
                    @Override
                    public ListTargetAssetsResponse apply(ListTargetAssetsRequest request) {
                        return client.listTargetAssets(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link com.oracle.bmc.cloudmigrations.model.TargetAssetSummary} objects
     * contained in responses from the listTargetAssets operation. This iterable will fetch more data from the
     * server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link com.oracle.bmc.cloudmigrations.model.TargetAssetSummary} objects
     * contained in responses received from the service.
     */
    public Iterable<com.oracle.bmc.cloudmigrations.model.TargetAssetSummary>
            listTargetAssetsRecordIterator(final ListTargetAssetsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListTargetAssetsRequest.Builder, ListTargetAssetsRequest, ListTargetAssetsResponse,
                com.oracle.bmc.cloudmigrations.model.TargetAssetSummary>(
                new java.util.function.Supplier<ListTargetAssetsRequest.Builder>() {
                    @Override
                    public ListTargetAssetsRequest.Builder get() {
                        return ListTargetAssetsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListTargetAssetsResponse, String>() {
                    @Override
                    public String apply(ListTargetAssetsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListTargetAssetsRequest.Builder>,
                        ListTargetAssetsRequest>() {
                    @Override
                    public ListTargetAssetsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListTargetAssetsRequest.Builder>
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
                        ListTargetAssetsRequest, ListTargetAssetsResponse>() {
                    @Override
                    public ListTargetAssetsResponse apply(ListTargetAssetsRequest request) {
                        return client.listTargetAssets(request);
                    }
                },
                new java.util.function.Function<
                        ListTargetAssetsResponse,
                        java.util.List<com.oracle.bmc.cloudmigrations.model.TargetAssetSummary>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.cloudmigrations.model.TargetAssetSummary>
                            apply(ListTargetAssetsResponse response) {
                        return response.getTargetAssetCollection().getItems();
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
     * Creates a new iterable which will iterate over the {@link com.oracle.bmc.cloudmigrations.model.WorkRequestError} objects
     * contained in responses from the listWorkRequestErrors operation. This iterable will fetch more data from the
     * server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link com.oracle.bmc.cloudmigrations.model.WorkRequestError} objects
     * contained in responses received from the service.
     */
    public Iterable<com.oracle.bmc.cloudmigrations.model.WorkRequestError>
            listWorkRequestErrorsRecordIterator(final ListWorkRequestErrorsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListWorkRequestErrorsRequest.Builder, ListWorkRequestErrorsRequest,
                ListWorkRequestErrorsResponse,
                com.oracle.bmc.cloudmigrations.model.WorkRequestError>(
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
                        java.util.List<com.oracle.bmc.cloudmigrations.model.WorkRequestError>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.cloudmigrations.model.WorkRequestError>
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
     * Creates a new iterable which will iterate over the {@link com.oracle.bmc.cloudmigrations.model.WorkRequestLogEntry} objects
     * contained in responses from the listWorkRequestLogs operation. This iterable will fetch more data from the
     * server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link com.oracle.bmc.cloudmigrations.model.WorkRequestLogEntry} objects
     * contained in responses received from the service.
     */
    public Iterable<com.oracle.bmc.cloudmigrations.model.WorkRequestLogEntry>
            listWorkRequestLogsRecordIterator(final ListWorkRequestLogsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListWorkRequestLogsRequest.Builder, ListWorkRequestLogsRequest,
                ListWorkRequestLogsResponse,
                com.oracle.bmc.cloudmigrations.model.WorkRequestLogEntry>(
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
                                com.oracle.bmc.cloudmigrations.model.WorkRequestLogEntry>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.cloudmigrations.model.WorkRequestLogEntry>
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
     * Creates a new iterable which will iterate over the {@link com.oracle.bmc.cloudmigrations.model.WorkRequestSummary} objects
     * contained in responses from the listWorkRequests operation. This iterable will fetch more data from the
     * server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link com.oracle.bmc.cloudmigrations.model.WorkRequestSummary} objects
     * contained in responses received from the service.
     */
    public Iterable<com.oracle.bmc.cloudmigrations.model.WorkRequestSummary>
            listWorkRequestsRecordIterator(final ListWorkRequestsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListWorkRequestsRequest.Builder, ListWorkRequestsRequest, ListWorkRequestsResponse,
                com.oracle.bmc.cloudmigrations.model.WorkRequestSummary>(
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
                        java.util.List<com.oracle.bmc.cloudmigrations.model.WorkRequestSummary>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.cloudmigrations.model.WorkRequestSummary>
                            apply(ListWorkRequestsResponse response) {
                        return response.getWorkRequestSummaryCollection().getItems();
                    }
                });
    }
}

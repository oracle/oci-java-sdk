/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.fleetappsmanagement;

import com.oracle.bmc.fleetappsmanagement.requests.*;
import com.oracle.bmc.fleetappsmanagement.responses.*;

/**
 * Collection of helper methods that can be used to provide an {@link java.lang.Iterable} interface
 * to any list operations of FleetAppsManagementOperations where multiple pages of data may be
 * fetched. Two styles of iteration are supported:
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
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20230831")
public class FleetAppsManagementOperationsPaginators {
    private final FleetAppsManagementOperations client;

    public FleetAppsManagementOperationsPaginators(FleetAppsManagementOperations client) {
        this.client = client;
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the
     * listComplianceRecords operation. This iterable will fetch more data from the server as
     * needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses
     *     received from the service.
     */
    public Iterable<ListComplianceRecordsResponse> listComplianceRecordsResponseIterator(
            final ListComplianceRecordsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListComplianceRecordsRequest.Builder,
                ListComplianceRecordsRequest,
                ListComplianceRecordsResponse>(
                new java.util.function.Supplier<ListComplianceRecordsRequest.Builder>() {
                    @Override
                    public ListComplianceRecordsRequest.Builder get() {
                        return ListComplianceRecordsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListComplianceRecordsResponse, String>() {
                    @Override
                    public String apply(ListComplianceRecordsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListComplianceRecordsRequest.Builder>,
                        ListComplianceRecordsRequest>() {
                    @Override
                    public ListComplianceRecordsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListComplianceRecordsRequest.Builder>
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
                        ListComplianceRecordsRequest, ListComplianceRecordsResponse>() {
                    @Override
                    public ListComplianceRecordsResponse apply(
                            ListComplianceRecordsRequest request) {
                        return client.listComplianceRecords(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link
     * com.oracle.bmc.fleetappsmanagement.model.ComplianceRecordSummary} objects contained in
     * responses from the listComplianceRecords operation. This iterable will fetch more data from
     * the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link
     *     com.oracle.bmc.fleetappsmanagement.model.ComplianceRecordSummary} objects contained in
     *     responses received from the service.
     */
    public Iterable<com.oracle.bmc.fleetappsmanagement.model.ComplianceRecordSummary>
            listComplianceRecordsRecordIterator(final ListComplianceRecordsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListComplianceRecordsRequest.Builder,
                ListComplianceRecordsRequest,
                ListComplianceRecordsResponse,
                com.oracle.bmc.fleetappsmanagement.model.ComplianceRecordSummary>(
                new java.util.function.Supplier<ListComplianceRecordsRequest.Builder>() {
                    @Override
                    public ListComplianceRecordsRequest.Builder get() {
                        return ListComplianceRecordsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListComplianceRecordsResponse, String>() {
                    @Override
                    public String apply(ListComplianceRecordsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListComplianceRecordsRequest.Builder>,
                        ListComplianceRecordsRequest>() {
                    @Override
                    public ListComplianceRecordsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListComplianceRecordsRequest.Builder>
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
                        ListComplianceRecordsRequest, ListComplianceRecordsResponse>() {
                    @Override
                    public ListComplianceRecordsResponse apply(
                            ListComplianceRecordsRequest request) {
                        return client.listComplianceRecords(request);
                    }
                },
                new java.util.function.Function<
                        ListComplianceRecordsResponse,
                        java.util.List<
                                com.oracle.bmc.fleetappsmanagement.model
                                        .ComplianceRecordSummary>>() {
                    @Override
                    public java.util.List<
                                    com.oracle.bmc.fleetappsmanagement.model
                                            .ComplianceRecordSummary>
                            apply(ListComplianceRecordsResponse response) {
                        return response.getComplianceRecordCollection().getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the listExecutions
     * operation. This iterable will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses
     *     received from the service.
     */
    public Iterable<ListExecutionsResponse> listExecutionsResponseIterator(
            final ListExecutionsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListExecutionsRequest.Builder, ListExecutionsRequest, ListExecutionsResponse>(
                new java.util.function.Supplier<ListExecutionsRequest.Builder>() {
                    @Override
                    public ListExecutionsRequest.Builder get() {
                        return ListExecutionsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListExecutionsResponse, String>() {
                    @Override
                    public String apply(ListExecutionsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListExecutionsRequest.Builder>,
                        ListExecutionsRequest>() {
                    @Override
                    public ListExecutionsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListExecutionsRequest.Builder>
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
                new java.util.function.Function<ListExecutionsRequest, ListExecutionsResponse>() {
                    @Override
                    public ListExecutionsResponse apply(ListExecutionsRequest request) {
                        return client.listExecutions(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link
     * com.oracle.bmc.fleetappsmanagement.model.ExecutionSummary} objects contained in responses
     * from the listExecutions operation. This iterable will fetch more data from the server as
     * needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link
     *     com.oracle.bmc.fleetappsmanagement.model.ExecutionSummary} objects contained in responses
     *     received from the service.
     */
    public Iterable<com.oracle.bmc.fleetappsmanagement.model.ExecutionSummary>
            listExecutionsRecordIterator(final ListExecutionsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListExecutionsRequest.Builder,
                ListExecutionsRequest,
                ListExecutionsResponse,
                com.oracle.bmc.fleetappsmanagement.model.ExecutionSummary>(
                new java.util.function.Supplier<ListExecutionsRequest.Builder>() {
                    @Override
                    public ListExecutionsRequest.Builder get() {
                        return ListExecutionsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListExecutionsResponse, String>() {
                    @Override
                    public String apply(ListExecutionsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListExecutionsRequest.Builder>,
                        ListExecutionsRequest>() {
                    @Override
                    public ListExecutionsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListExecutionsRequest.Builder>
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
                new java.util.function.Function<ListExecutionsRequest, ListExecutionsResponse>() {
                    @Override
                    public ListExecutionsResponse apply(ListExecutionsRequest request) {
                        return client.listExecutions(request);
                    }
                },
                new java.util.function.Function<
                        ListExecutionsResponse,
                        java.util.List<
                                com.oracle.bmc.fleetappsmanagement.model.ExecutionSummary>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.fleetappsmanagement.model.ExecutionSummary>
                            apply(ListExecutionsResponse response) {
                        return response.getExecutionCollection().getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the listPatches
     * operation. This iterable will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses
     *     received from the service.
     */
    public Iterable<ListPatchesResponse> listPatchesResponseIterator(
            final ListPatchesRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListPatchesRequest.Builder, ListPatchesRequest, ListPatchesResponse>(
                new java.util.function.Supplier<ListPatchesRequest.Builder>() {
                    @Override
                    public ListPatchesRequest.Builder get() {
                        return ListPatchesRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListPatchesResponse, String>() {
                    @Override
                    public String apply(ListPatchesResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListPatchesRequest.Builder>,
                        ListPatchesRequest>() {
                    @Override
                    public ListPatchesRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListPatchesRequest.Builder>
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
                new java.util.function.Function<ListPatchesRequest, ListPatchesResponse>() {
                    @Override
                    public ListPatchesResponse apply(ListPatchesRequest request) {
                        return client.listPatches(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link
     * com.oracle.bmc.fleetappsmanagement.model.PatchSummary} objects contained in responses from
     * the listPatches operation. This iterable will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link
     *     com.oracle.bmc.fleetappsmanagement.model.PatchSummary} objects contained in responses
     *     received from the service.
     */
    public Iterable<com.oracle.bmc.fleetappsmanagement.model.PatchSummary>
            listPatchesRecordIterator(final ListPatchesRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListPatchesRequest.Builder,
                ListPatchesRequest,
                ListPatchesResponse,
                com.oracle.bmc.fleetappsmanagement.model.PatchSummary>(
                new java.util.function.Supplier<ListPatchesRequest.Builder>() {
                    @Override
                    public ListPatchesRequest.Builder get() {
                        return ListPatchesRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListPatchesResponse, String>() {
                    @Override
                    public String apply(ListPatchesResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListPatchesRequest.Builder>,
                        ListPatchesRequest>() {
                    @Override
                    public ListPatchesRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListPatchesRequest.Builder>
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
                new java.util.function.Function<ListPatchesRequest, ListPatchesResponse>() {
                    @Override
                    public ListPatchesResponse apply(ListPatchesRequest request) {
                        return client.listPatches(request);
                    }
                },
                new java.util.function.Function<
                        ListPatchesResponse,
                        java.util.List<com.oracle.bmc.fleetappsmanagement.model.PatchSummary>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.fleetappsmanagement.model.PatchSummary>
                            apply(ListPatchesResponse response) {
                        return response.getPatchCollection().getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the listResources
     * operation. This iterable will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses
     *     received from the service.
     */
    public Iterable<ListResourcesResponse> listResourcesResponseIterator(
            final ListResourcesRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListResourcesRequest.Builder, ListResourcesRequest, ListResourcesResponse>(
                new java.util.function.Supplier<ListResourcesRequest.Builder>() {
                    @Override
                    public ListResourcesRequest.Builder get() {
                        return ListResourcesRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListResourcesResponse, String>() {
                    @Override
                    public String apply(ListResourcesResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListResourcesRequest.Builder>,
                        ListResourcesRequest>() {
                    @Override
                    public ListResourcesRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListResourcesRequest.Builder>
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
                new java.util.function.Function<ListResourcesRequest, ListResourcesResponse>() {
                    @Override
                    public ListResourcesResponse apply(ListResourcesRequest request) {
                        return client.listResources(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link
     * com.oracle.bmc.fleetappsmanagement.model.ResourceSummary} objects contained in responses from
     * the listResources operation. This iterable will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link
     *     com.oracle.bmc.fleetappsmanagement.model.ResourceSummary} objects contained in responses
     *     received from the service.
     */
    public Iterable<com.oracle.bmc.fleetappsmanagement.model.ResourceSummary>
            listResourcesRecordIterator(final ListResourcesRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListResourcesRequest.Builder,
                ListResourcesRequest,
                ListResourcesResponse,
                com.oracle.bmc.fleetappsmanagement.model.ResourceSummary>(
                new java.util.function.Supplier<ListResourcesRequest.Builder>() {
                    @Override
                    public ListResourcesRequest.Builder get() {
                        return ListResourcesRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListResourcesResponse, String>() {
                    @Override
                    public String apply(ListResourcesResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListResourcesRequest.Builder>,
                        ListResourcesRequest>() {
                    @Override
                    public ListResourcesRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListResourcesRequest.Builder>
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
                new java.util.function.Function<ListResourcesRequest, ListResourcesResponse>() {
                    @Override
                    public ListResourcesResponse apply(ListResourcesRequest request) {
                        return client.listResources(request);
                    }
                },
                new java.util.function.Function<
                        ListResourcesResponse,
                        java.util.List<
                                com.oracle.bmc.fleetappsmanagement.model.ResourceSummary>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.fleetappsmanagement.model.ResourceSummary>
                            apply(ListResourcesResponse response) {
                        return response.getResourceCollection().getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the
     * listScheduledFleets operation. This iterable will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses
     *     received from the service.
     */
    public Iterable<ListScheduledFleetsResponse> listScheduledFleetsResponseIterator(
            final ListScheduledFleetsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListScheduledFleetsRequest.Builder,
                ListScheduledFleetsRequest,
                ListScheduledFleetsResponse>(
                new java.util.function.Supplier<ListScheduledFleetsRequest.Builder>() {
                    @Override
                    public ListScheduledFleetsRequest.Builder get() {
                        return ListScheduledFleetsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListScheduledFleetsResponse, String>() {
                    @Override
                    public String apply(ListScheduledFleetsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListScheduledFleetsRequest.Builder>,
                        ListScheduledFleetsRequest>() {
                    @Override
                    public ListScheduledFleetsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListScheduledFleetsRequest.Builder>
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
                        ListScheduledFleetsRequest, ListScheduledFleetsResponse>() {
                    @Override
                    public ListScheduledFleetsResponse apply(ListScheduledFleetsRequest request) {
                        return client.listScheduledFleets(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link
     * com.oracle.bmc.fleetappsmanagement.model.ScheduledFleetSummary} objects contained in
     * responses from the listScheduledFleets operation. This iterable will fetch more data from the
     * server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link
     *     com.oracle.bmc.fleetappsmanagement.model.ScheduledFleetSummary} objects contained in
     *     responses received from the service.
     */
    public Iterable<com.oracle.bmc.fleetappsmanagement.model.ScheduledFleetSummary>
            listScheduledFleetsRecordIterator(final ListScheduledFleetsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListScheduledFleetsRequest.Builder,
                ListScheduledFleetsRequest,
                ListScheduledFleetsResponse,
                com.oracle.bmc.fleetappsmanagement.model.ScheduledFleetSummary>(
                new java.util.function.Supplier<ListScheduledFleetsRequest.Builder>() {
                    @Override
                    public ListScheduledFleetsRequest.Builder get() {
                        return ListScheduledFleetsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListScheduledFleetsResponse, String>() {
                    @Override
                    public String apply(ListScheduledFleetsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListScheduledFleetsRequest.Builder>,
                        ListScheduledFleetsRequest>() {
                    @Override
                    public ListScheduledFleetsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListScheduledFleetsRequest.Builder>
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
                        ListScheduledFleetsRequest, ListScheduledFleetsResponse>() {
                    @Override
                    public ListScheduledFleetsResponse apply(ListScheduledFleetsRequest request) {
                        return client.listScheduledFleets(request);
                    }
                },
                new java.util.function.Function<
                        ListScheduledFleetsResponse,
                        java.util.List<
                                com.oracle.bmc.fleetappsmanagement.model.ScheduledFleetSummary>>() {
                    @Override
                    public java.util.List<
                                    com.oracle.bmc.fleetappsmanagement.model.ScheduledFleetSummary>
                            apply(ListScheduledFleetsResponse response) {
                        return response.getScheduledFleetCollection().getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the
     * listSchedulerDefinitions operation. This iterable will fetch more data from the server as
     * needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses
     *     received from the service.
     */
    public Iterable<ListSchedulerDefinitionsResponse> listSchedulerDefinitionsResponseIterator(
            final ListSchedulerDefinitionsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListSchedulerDefinitionsRequest.Builder,
                ListSchedulerDefinitionsRequest,
                ListSchedulerDefinitionsResponse>(
                new java.util.function.Supplier<ListSchedulerDefinitionsRequest.Builder>() {
                    @Override
                    public ListSchedulerDefinitionsRequest.Builder get() {
                        return ListSchedulerDefinitionsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListSchedulerDefinitionsResponse, String>() {
                    @Override
                    public String apply(ListSchedulerDefinitionsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListSchedulerDefinitionsRequest.Builder>,
                        ListSchedulerDefinitionsRequest>() {
                    @Override
                    public ListSchedulerDefinitionsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListSchedulerDefinitionsRequest.Builder>
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
                        ListSchedulerDefinitionsRequest, ListSchedulerDefinitionsResponse>() {
                    @Override
                    public ListSchedulerDefinitionsResponse apply(
                            ListSchedulerDefinitionsRequest request) {
                        return client.listSchedulerDefinitions(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link
     * com.oracle.bmc.fleetappsmanagement.model.SchedulerDefinitionSummary} objects contained in
     * responses from the listSchedulerDefinitions operation. This iterable will fetch more data
     * from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link
     *     com.oracle.bmc.fleetappsmanagement.model.SchedulerDefinitionSummary} objects contained in
     *     responses received from the service.
     */
    public Iterable<com.oracle.bmc.fleetappsmanagement.model.SchedulerDefinitionSummary>
            listSchedulerDefinitionsRecordIterator(final ListSchedulerDefinitionsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListSchedulerDefinitionsRequest.Builder,
                ListSchedulerDefinitionsRequest,
                ListSchedulerDefinitionsResponse,
                com.oracle.bmc.fleetappsmanagement.model.SchedulerDefinitionSummary>(
                new java.util.function.Supplier<ListSchedulerDefinitionsRequest.Builder>() {
                    @Override
                    public ListSchedulerDefinitionsRequest.Builder get() {
                        return ListSchedulerDefinitionsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListSchedulerDefinitionsResponse, String>() {
                    @Override
                    public String apply(ListSchedulerDefinitionsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListSchedulerDefinitionsRequest.Builder>,
                        ListSchedulerDefinitionsRequest>() {
                    @Override
                    public ListSchedulerDefinitionsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListSchedulerDefinitionsRequest.Builder>
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
                        ListSchedulerDefinitionsRequest, ListSchedulerDefinitionsResponse>() {
                    @Override
                    public ListSchedulerDefinitionsResponse apply(
                            ListSchedulerDefinitionsRequest request) {
                        return client.listSchedulerDefinitions(request);
                    }
                },
                new java.util.function.Function<
                        ListSchedulerDefinitionsResponse,
                        java.util.List<
                                com.oracle.bmc.fleetappsmanagement.model
                                        .SchedulerDefinitionSummary>>() {
                    @Override
                    public java.util.List<
                                    com.oracle.bmc.fleetappsmanagement.model
                                            .SchedulerDefinitionSummary>
                            apply(ListSchedulerDefinitionsResponse response) {
                        return response.getSchedulerDefinitionCollection().getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the
     * listSchedulerJobs operation. This iterable will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses
     *     received from the service.
     */
    public Iterable<ListSchedulerJobsResponse> listSchedulerJobsResponseIterator(
            final ListSchedulerJobsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListSchedulerJobsRequest.Builder,
                ListSchedulerJobsRequest,
                ListSchedulerJobsResponse>(
                new java.util.function.Supplier<ListSchedulerJobsRequest.Builder>() {
                    @Override
                    public ListSchedulerJobsRequest.Builder get() {
                        return ListSchedulerJobsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListSchedulerJobsResponse, String>() {
                    @Override
                    public String apply(ListSchedulerJobsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListSchedulerJobsRequest.Builder>,
                        ListSchedulerJobsRequest>() {
                    @Override
                    public ListSchedulerJobsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListSchedulerJobsRequest.Builder>
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
                        ListSchedulerJobsRequest, ListSchedulerJobsResponse>() {
                    @Override
                    public ListSchedulerJobsResponse apply(ListSchedulerJobsRequest request) {
                        return client.listSchedulerJobs(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link
     * com.oracle.bmc.fleetappsmanagement.model.SchedulerJobSummary} objects contained in responses
     * from the listSchedulerJobs operation. This iterable will fetch more data from the server as
     * needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link
     *     com.oracle.bmc.fleetappsmanagement.model.SchedulerJobSummary} objects contained in
     *     responses received from the service.
     */
    public Iterable<com.oracle.bmc.fleetappsmanagement.model.SchedulerJobSummary>
            listSchedulerJobsRecordIterator(final ListSchedulerJobsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListSchedulerJobsRequest.Builder,
                ListSchedulerJobsRequest,
                ListSchedulerJobsResponse,
                com.oracle.bmc.fleetappsmanagement.model.SchedulerJobSummary>(
                new java.util.function.Supplier<ListSchedulerJobsRequest.Builder>() {
                    @Override
                    public ListSchedulerJobsRequest.Builder get() {
                        return ListSchedulerJobsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListSchedulerJobsResponse, String>() {
                    @Override
                    public String apply(ListSchedulerJobsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListSchedulerJobsRequest.Builder>,
                        ListSchedulerJobsRequest>() {
                    @Override
                    public ListSchedulerJobsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListSchedulerJobsRequest.Builder>
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
                        ListSchedulerJobsRequest, ListSchedulerJobsResponse>() {
                    @Override
                    public ListSchedulerJobsResponse apply(ListSchedulerJobsRequest request) {
                        return client.listSchedulerJobs(request);
                    }
                },
                new java.util.function.Function<
                        ListSchedulerJobsResponse,
                        java.util.List<
                                com.oracle.bmc.fleetappsmanagement.model.SchedulerJobSummary>>() {
                    @Override
                    public java.util.List<
                                    com.oracle.bmc.fleetappsmanagement.model.SchedulerJobSummary>
                            apply(ListSchedulerJobsResponse response) {
                        return response.getSchedulerJobCollection().getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the listSteps
     * operation. This iterable will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses
     *     received from the service.
     */
    public Iterable<ListStepsResponse> listStepsResponseIterator(final ListStepsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListStepsRequest.Builder, ListStepsRequest, ListStepsResponse>(
                new java.util.function.Supplier<ListStepsRequest.Builder>() {
                    @Override
                    public ListStepsRequest.Builder get() {
                        return ListStepsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListStepsResponse, String>() {
                    @Override
                    public String apply(ListStepsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListStepsRequest.Builder>,
                        ListStepsRequest>() {
                    @Override
                    public ListStepsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListStepsRequest.Builder>
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
                new java.util.function.Function<ListStepsRequest, ListStepsResponse>() {
                    @Override
                    public ListStepsResponse apply(ListStepsRequest request) {
                        return client.listSteps(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link
     * com.oracle.bmc.fleetappsmanagement.model.StepSummary} objects contained in responses from the
     * listSteps operation. This iterable will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link
     *     com.oracle.bmc.fleetappsmanagement.model.StepSummary} objects contained in responses
     *     received from the service.
     */
    public Iterable<com.oracle.bmc.fleetappsmanagement.model.StepSummary> listStepsRecordIterator(
            final ListStepsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListStepsRequest.Builder,
                ListStepsRequest,
                ListStepsResponse,
                com.oracle.bmc.fleetappsmanagement.model.StepSummary>(
                new java.util.function.Supplier<ListStepsRequest.Builder>() {
                    @Override
                    public ListStepsRequest.Builder get() {
                        return ListStepsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListStepsResponse, String>() {
                    @Override
                    public String apply(ListStepsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListStepsRequest.Builder>,
                        ListStepsRequest>() {
                    @Override
                    public ListStepsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListStepsRequest.Builder>
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
                new java.util.function.Function<ListStepsRequest, ListStepsResponse>() {
                    @Override
                    public ListStepsResponse apply(ListStepsRequest request) {
                        return client.listSteps(request);
                    }
                },
                new java.util.function.Function<
                        ListStepsResponse,
                        java.util.List<com.oracle.bmc.fleetappsmanagement.model.StepSummary>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.fleetappsmanagement.model.StepSummary>
                            apply(ListStepsResponse response) {
                        return response.getStepCollection().getItems();
                    }
                });
    }
}

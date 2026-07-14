/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.datacc;

import com.oracle.bmc.datacc.requests.*;
import com.oracle.bmc.datacc.responses.*;

/**
 * Collection of helper methods that can be used to provide an {@link java.lang.Iterable} interface
 * to any list operations of Baseinfra where multiple pages of data may be fetched. Two styles of
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
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20251101")
public class BaseinfraPaginators {
    private final Baseinfra client;

    public BaseinfraPaginators(Baseinfra client) {
        this.client = client;
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the
     * listInfrastructures operation. This iterable will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses
     *     received from the service.
     */
    public Iterable<ListInfrastructuresResponse> listInfrastructuresResponseIterator(
            final ListInfrastructuresRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListInfrastructuresRequest.Builder,
                ListInfrastructuresRequest,
                ListInfrastructuresResponse>(
                new java.util.function.Supplier<ListInfrastructuresRequest.Builder>() {
                    @Override
                    public ListInfrastructuresRequest.Builder get() {
                        return ListInfrastructuresRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListInfrastructuresResponse, String>() {
                    @Override
                    public String apply(ListInfrastructuresResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListInfrastructuresRequest.Builder>,
                        ListInfrastructuresRequest>() {
                    @Override
                    public ListInfrastructuresRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListInfrastructuresRequest.Builder>
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
                        ListInfrastructuresRequest, ListInfrastructuresResponse>() {
                    @Override
                    public ListInfrastructuresResponse apply(ListInfrastructuresRequest request) {
                        return client.listInfrastructures(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link
     * com.oracle.bmc.datacc.model.InfrastructureSummary} objects contained in responses from the
     * listInfrastructures operation. This iterable will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link
     *     com.oracle.bmc.datacc.model.InfrastructureSummary} objects contained in responses
     *     received from the service.
     */
    public Iterable<com.oracle.bmc.datacc.model.InfrastructureSummary>
            listInfrastructuresRecordIterator(final ListInfrastructuresRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListInfrastructuresRequest.Builder,
                ListInfrastructuresRequest,
                ListInfrastructuresResponse,
                com.oracle.bmc.datacc.model.InfrastructureSummary>(
                new java.util.function.Supplier<ListInfrastructuresRequest.Builder>() {
                    @Override
                    public ListInfrastructuresRequest.Builder get() {
                        return ListInfrastructuresRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListInfrastructuresResponse, String>() {
                    @Override
                    public String apply(ListInfrastructuresResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListInfrastructuresRequest.Builder>,
                        ListInfrastructuresRequest>() {
                    @Override
                    public ListInfrastructuresRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListInfrastructuresRequest.Builder>
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
                        ListInfrastructuresRequest, ListInfrastructuresResponse>() {
                    @Override
                    public ListInfrastructuresResponse apply(ListInfrastructuresRequest request) {
                        return client.listInfrastructures(request);
                    }
                },
                new java.util.function.Function<
                        ListInfrastructuresResponse,
                        java.util.List<com.oracle.bmc.datacc.model.InfrastructureSummary>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.datacc.model.InfrastructureSummary> apply(
                            ListInfrastructuresResponse response) {
                        return response.getInfrastructureCollection().getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the
     * listMaintenanceExecutions operation. This iterable will fetch more data from the server as
     * needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses
     *     received from the service.
     */
    public Iterable<ListMaintenanceExecutionsResponse> listMaintenanceExecutionsResponseIterator(
            final ListMaintenanceExecutionsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListMaintenanceExecutionsRequest.Builder,
                ListMaintenanceExecutionsRequest,
                ListMaintenanceExecutionsResponse>(
                new java.util.function.Supplier<ListMaintenanceExecutionsRequest.Builder>() {
                    @Override
                    public ListMaintenanceExecutionsRequest.Builder get() {
                        return ListMaintenanceExecutionsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListMaintenanceExecutionsResponse, String>() {
                    @Override
                    public String apply(ListMaintenanceExecutionsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListMaintenanceExecutionsRequest.Builder>,
                        ListMaintenanceExecutionsRequest>() {
                    @Override
                    public ListMaintenanceExecutionsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListMaintenanceExecutionsRequest.Builder>
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
                        ListMaintenanceExecutionsRequest, ListMaintenanceExecutionsResponse>() {
                    @Override
                    public ListMaintenanceExecutionsResponse apply(
                            ListMaintenanceExecutionsRequest request) {
                        return client.listMaintenanceExecutions(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link
     * com.oracle.bmc.datacc.model.MaintenanceExecutionSummary} objects contained in responses from
     * the listMaintenanceExecutions operation. This iterable will fetch more data from the server
     * as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link
     *     com.oracle.bmc.datacc.model.MaintenanceExecutionSummary} objects contained in responses
     *     received from the service.
     */
    public Iterable<com.oracle.bmc.datacc.model.MaintenanceExecutionSummary>
            listMaintenanceExecutionsRecordIterator(
                    final ListMaintenanceExecutionsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListMaintenanceExecutionsRequest.Builder,
                ListMaintenanceExecutionsRequest,
                ListMaintenanceExecutionsResponse,
                com.oracle.bmc.datacc.model.MaintenanceExecutionSummary>(
                new java.util.function.Supplier<ListMaintenanceExecutionsRequest.Builder>() {
                    @Override
                    public ListMaintenanceExecutionsRequest.Builder get() {
                        return ListMaintenanceExecutionsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListMaintenanceExecutionsResponse, String>() {
                    @Override
                    public String apply(ListMaintenanceExecutionsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListMaintenanceExecutionsRequest.Builder>,
                        ListMaintenanceExecutionsRequest>() {
                    @Override
                    public ListMaintenanceExecutionsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListMaintenanceExecutionsRequest.Builder>
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
                        ListMaintenanceExecutionsRequest, ListMaintenanceExecutionsResponse>() {
                    @Override
                    public ListMaintenanceExecutionsResponse apply(
                            ListMaintenanceExecutionsRequest request) {
                        return client.listMaintenanceExecutions(request);
                    }
                },
                new java.util.function.Function<
                        ListMaintenanceExecutionsResponse,
                        java.util.List<com.oracle.bmc.datacc.model.MaintenanceExecutionSummary>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.datacc.model.MaintenanceExecutionSummary>
                            apply(ListMaintenanceExecutionsResponse response) {
                        return response.getMaintenanceExecutionCollection().getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the
     * listMaintenanceRuns operation. This iterable will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses
     *     received from the service.
     */
    public Iterable<ListMaintenanceRunsResponse> listMaintenanceRunsResponseIterator(
            final ListMaintenanceRunsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListMaintenanceRunsRequest.Builder,
                ListMaintenanceRunsRequest,
                ListMaintenanceRunsResponse>(
                new java.util.function.Supplier<ListMaintenanceRunsRequest.Builder>() {
                    @Override
                    public ListMaintenanceRunsRequest.Builder get() {
                        return ListMaintenanceRunsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListMaintenanceRunsResponse, String>() {
                    @Override
                    public String apply(ListMaintenanceRunsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListMaintenanceRunsRequest.Builder>,
                        ListMaintenanceRunsRequest>() {
                    @Override
                    public ListMaintenanceRunsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListMaintenanceRunsRequest.Builder>
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
                        ListMaintenanceRunsRequest, ListMaintenanceRunsResponse>() {
                    @Override
                    public ListMaintenanceRunsResponse apply(ListMaintenanceRunsRequest request) {
                        return client.listMaintenanceRuns(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link
     * com.oracle.bmc.datacc.model.MaintenanceRunSummary} objects contained in responses from the
     * listMaintenanceRuns operation. This iterable will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link
     *     com.oracle.bmc.datacc.model.MaintenanceRunSummary} objects contained in responses
     *     received from the service.
     */
    public Iterable<com.oracle.bmc.datacc.model.MaintenanceRunSummary>
            listMaintenanceRunsRecordIterator(final ListMaintenanceRunsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListMaintenanceRunsRequest.Builder,
                ListMaintenanceRunsRequest,
                ListMaintenanceRunsResponse,
                com.oracle.bmc.datacc.model.MaintenanceRunSummary>(
                new java.util.function.Supplier<ListMaintenanceRunsRequest.Builder>() {
                    @Override
                    public ListMaintenanceRunsRequest.Builder get() {
                        return ListMaintenanceRunsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListMaintenanceRunsResponse, String>() {
                    @Override
                    public String apply(ListMaintenanceRunsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListMaintenanceRunsRequest.Builder>,
                        ListMaintenanceRunsRequest>() {
                    @Override
                    public ListMaintenanceRunsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListMaintenanceRunsRequest.Builder>
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
                        ListMaintenanceRunsRequest, ListMaintenanceRunsResponse>() {
                    @Override
                    public ListMaintenanceRunsResponse apply(ListMaintenanceRunsRequest request) {
                        return client.listMaintenanceRuns(request);
                    }
                },
                new java.util.function.Function<
                        ListMaintenanceRunsResponse,
                        java.util.List<com.oracle.bmc.datacc.model.MaintenanceRunSummary>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.datacc.model.MaintenanceRunSummary> apply(
                            ListMaintenanceRunsResponse response) {
                        return response.getMaintenanceRunCollection().getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the
     * listVmClusterNetworks operation. This iterable will fetch more data from the server as
     * needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses
     *     received from the service.
     */
    public Iterable<ListVmClusterNetworksResponse> listVmClusterNetworksResponseIterator(
            final ListVmClusterNetworksRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListVmClusterNetworksRequest.Builder,
                ListVmClusterNetworksRequest,
                ListVmClusterNetworksResponse>(
                new java.util.function.Supplier<ListVmClusterNetworksRequest.Builder>() {
                    @Override
                    public ListVmClusterNetworksRequest.Builder get() {
                        return ListVmClusterNetworksRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListVmClusterNetworksResponse, String>() {
                    @Override
                    public String apply(ListVmClusterNetworksResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListVmClusterNetworksRequest.Builder>,
                        ListVmClusterNetworksRequest>() {
                    @Override
                    public ListVmClusterNetworksRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListVmClusterNetworksRequest.Builder>
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
                        ListVmClusterNetworksRequest, ListVmClusterNetworksResponse>() {
                    @Override
                    public ListVmClusterNetworksResponse apply(
                            ListVmClusterNetworksRequest request) {
                        return client.listVmClusterNetworks(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link
     * com.oracle.bmc.datacc.model.VmClusterNetworkSummary} objects contained in responses from the
     * listVmClusterNetworks operation. This iterable will fetch more data from the server as
     * needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link
     *     com.oracle.bmc.datacc.model.VmClusterNetworkSummary} objects contained in responses
     *     received from the service.
     */
    public Iterable<com.oracle.bmc.datacc.model.VmClusterNetworkSummary>
            listVmClusterNetworksRecordIterator(final ListVmClusterNetworksRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListVmClusterNetworksRequest.Builder,
                ListVmClusterNetworksRequest,
                ListVmClusterNetworksResponse,
                com.oracle.bmc.datacc.model.VmClusterNetworkSummary>(
                new java.util.function.Supplier<ListVmClusterNetworksRequest.Builder>() {
                    @Override
                    public ListVmClusterNetworksRequest.Builder get() {
                        return ListVmClusterNetworksRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListVmClusterNetworksResponse, String>() {
                    @Override
                    public String apply(ListVmClusterNetworksResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListVmClusterNetworksRequest.Builder>,
                        ListVmClusterNetworksRequest>() {
                    @Override
                    public ListVmClusterNetworksRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListVmClusterNetworksRequest.Builder>
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
                        ListVmClusterNetworksRequest, ListVmClusterNetworksResponse>() {
                    @Override
                    public ListVmClusterNetworksResponse apply(
                            ListVmClusterNetworksRequest request) {
                        return client.listVmClusterNetworks(request);
                    }
                },
                new java.util.function.Function<
                        ListVmClusterNetworksResponse,
                        java.util.List<com.oracle.bmc.datacc.model.VmClusterNetworkSummary>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.datacc.model.VmClusterNetworkSummary>
                            apply(ListVmClusterNetworksResponse response) {
                        return response.getVmClusterNetworkCollection().getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the
     * listVmInstances operation. This iterable will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses
     *     received from the service.
     */
    public Iterable<ListVmInstancesResponse> listVmInstancesResponseIterator(
            final ListVmInstancesRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListVmInstancesRequest.Builder, ListVmInstancesRequest, ListVmInstancesResponse>(
                new java.util.function.Supplier<ListVmInstancesRequest.Builder>() {
                    @Override
                    public ListVmInstancesRequest.Builder get() {
                        return ListVmInstancesRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListVmInstancesResponse, String>() {
                    @Override
                    public String apply(ListVmInstancesResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListVmInstancesRequest.Builder>,
                        ListVmInstancesRequest>() {
                    @Override
                    public ListVmInstancesRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListVmInstancesRequest.Builder>
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
                new java.util.function.Function<ListVmInstancesRequest, ListVmInstancesResponse>() {
                    @Override
                    public ListVmInstancesResponse apply(ListVmInstancesRequest request) {
                        return client.listVmInstances(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link
     * com.oracle.bmc.datacc.model.VmInstanceSummary} objects contained in responses from the
     * listVmInstances operation. This iterable will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link
     *     com.oracle.bmc.datacc.model.VmInstanceSummary} objects contained in responses received
     *     from the service.
     */
    public Iterable<com.oracle.bmc.datacc.model.VmInstanceSummary> listVmInstancesRecordIterator(
            final ListVmInstancesRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListVmInstancesRequest.Builder,
                ListVmInstancesRequest,
                ListVmInstancesResponse,
                com.oracle.bmc.datacc.model.VmInstanceSummary>(
                new java.util.function.Supplier<ListVmInstancesRequest.Builder>() {
                    @Override
                    public ListVmInstancesRequest.Builder get() {
                        return ListVmInstancesRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListVmInstancesResponse, String>() {
                    @Override
                    public String apply(ListVmInstancesResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListVmInstancesRequest.Builder>,
                        ListVmInstancesRequest>() {
                    @Override
                    public ListVmInstancesRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListVmInstancesRequest.Builder>
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
                new java.util.function.Function<ListVmInstancesRequest, ListVmInstancesResponse>() {
                    @Override
                    public ListVmInstancesResponse apply(ListVmInstancesRequest request) {
                        return client.listVmInstances(request);
                    }
                },
                new java.util.function.Function<
                        ListVmInstancesResponse,
                        java.util.List<com.oracle.bmc.datacc.model.VmInstanceSummary>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.datacc.model.VmInstanceSummary> apply(
                            ListVmInstancesResponse response) {
                        return response.getVmInstanceCollection().getItems();
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
     * com.oracle.bmc.datacc.model.WorkRequestError} objects contained in responses from the
     * listWorkRequestErrors operation. This iterable will fetch more data from the server as
     * needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link
     *     com.oracle.bmc.datacc.model.WorkRequestError} objects contained in responses received
     *     from the service.
     */
    public Iterable<com.oracle.bmc.datacc.model.WorkRequestError>
            listWorkRequestErrorsRecordIterator(final ListWorkRequestErrorsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListWorkRequestErrorsRequest.Builder,
                ListWorkRequestErrorsRequest,
                ListWorkRequestErrorsResponse,
                com.oracle.bmc.datacc.model.WorkRequestError>(
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
                        java.util.List<com.oracle.bmc.datacc.model.WorkRequestError>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.datacc.model.WorkRequestError> apply(
                            ListWorkRequestErrorsResponse response) {
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
     * com.oracle.bmc.datacc.model.WorkRequestLogEntry} objects contained in responses from the
     * listWorkRequestLogs operation. This iterable will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link
     *     com.oracle.bmc.datacc.model.WorkRequestLogEntry} objects contained in responses received
     *     from the service.
     */
    public Iterable<com.oracle.bmc.datacc.model.WorkRequestLogEntry>
            listWorkRequestLogsRecordIterator(final ListWorkRequestLogsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListWorkRequestLogsRequest.Builder,
                ListWorkRequestLogsRequest,
                ListWorkRequestLogsResponse,
                com.oracle.bmc.datacc.model.WorkRequestLogEntry>(
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
                        java.util.List<com.oracle.bmc.datacc.model.WorkRequestLogEntry>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.datacc.model.WorkRequestLogEntry> apply(
                            ListWorkRequestLogsResponse response) {
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
     * com.oracle.bmc.datacc.model.WorkRequest} objects contained in responses from the
     * listWorkRequests operation. This iterable will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link
     *     com.oracle.bmc.datacc.model.WorkRequest} objects contained in responses received from the
     *     service.
     */
    public Iterable<com.oracle.bmc.datacc.model.WorkRequest> listWorkRequestsRecordIterator(
            final ListWorkRequestsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListWorkRequestsRequest.Builder,
                ListWorkRequestsRequest,
                ListWorkRequestsResponse,
                com.oracle.bmc.datacc.model.WorkRequest>(
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
                        java.util.List<com.oracle.bmc.datacc.model.WorkRequest>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.datacc.model.WorkRequest> apply(
                            ListWorkRequestsResponse response) {
                        return response.getWorkRequestCollection().getItems();
                    }
                });
    }
}

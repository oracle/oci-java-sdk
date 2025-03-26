/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.containerinstances;

import com.oracle.bmc.containerinstances.requests.*;
import com.oracle.bmc.containerinstances.responses.*;

/**
 * Collection of helper methods that can be used to provide an {@link java.lang.Iterable} interface
 * to any list operations of ContainerInstance where multiple pages of data may be fetched.
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
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20210415")
public class ContainerInstancePaginators {
    private final ContainerInstance client;

    public ContainerInstancePaginators(ContainerInstance client) {
        this.client = client;
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the listContainerInstanceShapes operation. This iterable
     * will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses received from the service.
     */
    public Iterable<ListContainerInstanceShapesResponse>
            listContainerInstanceShapesResponseIterator(
                    final ListContainerInstanceShapesRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListContainerInstanceShapesRequest.Builder, ListContainerInstanceShapesRequest,
                ListContainerInstanceShapesResponse>(
                new java.util.function.Supplier<ListContainerInstanceShapesRequest.Builder>() {
                    @Override
                    public ListContainerInstanceShapesRequest.Builder get() {
                        return ListContainerInstanceShapesRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListContainerInstanceShapesResponse, String>() {
                    @Override
                    public String apply(ListContainerInstanceShapesResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListContainerInstanceShapesRequest.Builder>,
                        ListContainerInstanceShapesRequest>() {
                    @Override
                    public ListContainerInstanceShapesRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListContainerInstanceShapesRequest.Builder>
                                    input) {
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
                        ListContainerInstanceShapesRequest, ListContainerInstanceShapesResponse>() {
                    @Override
                    public ListContainerInstanceShapesResponse apply(
                            ListContainerInstanceShapesRequest request) {
                        return client.listContainerInstanceShapes(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link com.oracle.bmc.containerinstances.model.ContainerInstanceShapeSummary} objects
     * contained in responses from the listContainerInstanceShapes operation. This iterable will fetch more data from the
     * server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link com.oracle.bmc.containerinstances.model.ContainerInstanceShapeSummary} objects
     * contained in responses received from the service.
     */
    public Iterable<com.oracle.bmc.containerinstances.model.ContainerInstanceShapeSummary>
            listContainerInstanceShapesRecordIterator(
                    final ListContainerInstanceShapesRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListContainerInstanceShapesRequest.Builder, ListContainerInstanceShapesRequest,
                ListContainerInstanceShapesResponse,
                com.oracle.bmc.containerinstances.model.ContainerInstanceShapeSummary>(
                new java.util.function.Supplier<ListContainerInstanceShapesRequest.Builder>() {
                    @Override
                    public ListContainerInstanceShapesRequest.Builder get() {
                        return ListContainerInstanceShapesRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListContainerInstanceShapesResponse, String>() {
                    @Override
                    public String apply(ListContainerInstanceShapesResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListContainerInstanceShapesRequest.Builder>,
                        ListContainerInstanceShapesRequest>() {
                    @Override
                    public ListContainerInstanceShapesRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListContainerInstanceShapesRequest.Builder>
                                    input) {
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
                        ListContainerInstanceShapesRequest, ListContainerInstanceShapesResponse>() {
                    @Override
                    public ListContainerInstanceShapesResponse apply(
                            ListContainerInstanceShapesRequest request) {
                        return client.listContainerInstanceShapes(request);
                    }
                },
                new java.util.function.Function<
                        ListContainerInstanceShapesResponse,
                        java.util.List<
                                com.oracle.bmc.containerinstances.model
                                        .ContainerInstanceShapeSummary>>() {
                    @Override
                    public java.util.List<
                                    com.oracle.bmc.containerinstances.model
                                            .ContainerInstanceShapeSummary>
                            apply(ListContainerInstanceShapesResponse response) {
                        return response.getContainerInstanceShapeCollection().getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the listContainerInstances operation. This iterable
     * will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses received from the service.
     */
    public Iterable<ListContainerInstancesResponse> listContainerInstancesResponseIterator(
            final ListContainerInstancesRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListContainerInstancesRequest.Builder, ListContainerInstancesRequest,
                ListContainerInstancesResponse>(
                new java.util.function.Supplier<ListContainerInstancesRequest.Builder>() {
                    @Override
                    public ListContainerInstancesRequest.Builder get() {
                        return ListContainerInstancesRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListContainerInstancesResponse, String>() {
                    @Override
                    public String apply(ListContainerInstancesResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListContainerInstancesRequest.Builder>,
                        ListContainerInstancesRequest>() {
                    @Override
                    public ListContainerInstancesRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListContainerInstancesRequest.Builder>
                                    input) {
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
                        ListContainerInstancesRequest, ListContainerInstancesResponse>() {
                    @Override
                    public ListContainerInstancesResponse apply(
                            ListContainerInstancesRequest request) {
                        return client.listContainerInstances(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link com.oracle.bmc.containerinstances.model.ContainerInstanceSummary} objects
     * contained in responses from the listContainerInstances operation. This iterable will fetch more data from the
     * server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link com.oracle.bmc.containerinstances.model.ContainerInstanceSummary} objects
     * contained in responses received from the service.
     */
    public Iterable<com.oracle.bmc.containerinstances.model.ContainerInstanceSummary>
            listContainerInstancesRecordIterator(final ListContainerInstancesRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListContainerInstancesRequest.Builder, ListContainerInstancesRequest,
                ListContainerInstancesResponse,
                com.oracle.bmc.containerinstances.model.ContainerInstanceSummary>(
                new java.util.function.Supplier<ListContainerInstancesRequest.Builder>() {
                    @Override
                    public ListContainerInstancesRequest.Builder get() {
                        return ListContainerInstancesRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListContainerInstancesResponse, String>() {
                    @Override
                    public String apply(ListContainerInstancesResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListContainerInstancesRequest.Builder>,
                        ListContainerInstancesRequest>() {
                    @Override
                    public ListContainerInstancesRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListContainerInstancesRequest.Builder>
                                    input) {
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
                        ListContainerInstancesRequest, ListContainerInstancesResponse>() {
                    @Override
                    public ListContainerInstancesResponse apply(
                            ListContainerInstancesRequest request) {
                        return client.listContainerInstances(request);
                    }
                },
                new java.util.function.Function<
                        ListContainerInstancesResponse,
                        java.util.List<
                                com.oracle.bmc.containerinstances.model
                                        .ContainerInstanceSummary>>() {
                    @Override
                    public java.util.List<
                                    com.oracle.bmc.containerinstances.model
                                            .ContainerInstanceSummary>
                            apply(ListContainerInstancesResponse response) {
                        return response.getContainerInstanceCollection().getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the listContainers operation. This iterable
     * will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses received from the service.
     */
    public Iterable<ListContainersResponse> listContainersResponseIterator(
            final ListContainersRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListContainersRequest.Builder, ListContainersRequest, ListContainersResponse>(
                new java.util.function.Supplier<ListContainersRequest.Builder>() {
                    @Override
                    public ListContainersRequest.Builder get() {
                        return ListContainersRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListContainersResponse, String>() {
                    @Override
                    public String apply(ListContainersResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListContainersRequest.Builder>,
                        ListContainersRequest>() {
                    @Override
                    public ListContainersRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListContainersRequest.Builder>
                                    input) {
                        if (input.getNextPageToken() == null) {
                            return input.getRequestBuilder().build();
                        } else {
                            return input.getRequestBuilder()
                                    .page(input.getNextPageToken().orElse(null))
                                    .build();
                        }
                    }
                },
                new java.util.function.Function<ListContainersRequest, ListContainersResponse>() {
                    @Override
                    public ListContainersResponse apply(ListContainersRequest request) {
                        return client.listContainers(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link com.oracle.bmc.containerinstances.model.ContainerSummary} objects
     * contained in responses from the listContainers operation. This iterable will fetch more data from the
     * server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link com.oracle.bmc.containerinstances.model.ContainerSummary} objects
     * contained in responses received from the service.
     */
    public Iterable<com.oracle.bmc.containerinstances.model.ContainerSummary>
            listContainersRecordIterator(final ListContainersRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListContainersRequest.Builder, ListContainersRequest, ListContainersResponse,
                com.oracle.bmc.containerinstances.model.ContainerSummary>(
                new java.util.function.Supplier<ListContainersRequest.Builder>() {
                    @Override
                    public ListContainersRequest.Builder get() {
                        return ListContainersRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListContainersResponse, String>() {
                    @Override
                    public String apply(ListContainersResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListContainersRequest.Builder>,
                        ListContainersRequest>() {
                    @Override
                    public ListContainersRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListContainersRequest.Builder>
                                    input) {
                        if (input.getNextPageToken() == null) {
                            return input.getRequestBuilder().build();
                        } else {
                            return input.getRequestBuilder()
                                    .page(input.getNextPageToken().orElse(null))
                                    .build();
                        }
                    }
                },
                new java.util.function.Function<ListContainersRequest, ListContainersResponse>() {
                    @Override
                    public ListContainersResponse apply(ListContainersRequest request) {
                        return client.listContainers(request);
                    }
                },
                new java.util.function.Function<
                        ListContainersResponse,
                        java.util.List<
                                com.oracle.bmc.containerinstances.model.ContainerSummary>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.containerinstances.model.ContainerSummary>
                            apply(ListContainersResponse response) {
                        return response.getContainerCollection().getItems();
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
     * Creates a new iterable which will iterate over the {@link com.oracle.bmc.containerinstances.model.WorkRequestError} objects
     * contained in responses from the listWorkRequestErrors operation. This iterable will fetch more data from the
     * server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link com.oracle.bmc.containerinstances.model.WorkRequestError} objects
     * contained in responses received from the service.
     */
    public Iterable<com.oracle.bmc.containerinstances.model.WorkRequestError>
            listWorkRequestErrorsRecordIterator(final ListWorkRequestErrorsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListWorkRequestErrorsRequest.Builder, ListWorkRequestErrorsRequest,
                ListWorkRequestErrorsResponse,
                com.oracle.bmc.containerinstances.model.WorkRequestError>(
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
                                com.oracle.bmc.containerinstances.model.WorkRequestError>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.containerinstances.model.WorkRequestError>
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
     * Creates a new iterable which will iterate over the {@link com.oracle.bmc.containerinstances.model.WorkRequestLogEntry} objects
     * contained in responses from the listWorkRequestLogs operation. This iterable will fetch more data from the
     * server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link com.oracle.bmc.containerinstances.model.WorkRequestLogEntry} objects
     * contained in responses received from the service.
     */
    public Iterable<com.oracle.bmc.containerinstances.model.WorkRequestLogEntry>
            listWorkRequestLogsRecordIterator(final ListWorkRequestLogsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListWorkRequestLogsRequest.Builder, ListWorkRequestLogsRequest,
                ListWorkRequestLogsResponse,
                com.oracle.bmc.containerinstances.model.WorkRequestLogEntry>(
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
                                com.oracle.bmc.containerinstances.model.WorkRequestLogEntry>>() {
                    @Override
                    public java.util.List<
                                    com.oracle.bmc.containerinstances.model.WorkRequestLogEntry>
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
     * Creates a new iterable which will iterate over the {@link com.oracle.bmc.containerinstances.model.WorkRequestSummary} objects
     * contained in responses from the listWorkRequests operation. This iterable will fetch more data from the
     * server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link com.oracle.bmc.containerinstances.model.WorkRequestSummary} objects
     * contained in responses received from the service.
     */
    public Iterable<com.oracle.bmc.containerinstances.model.WorkRequestSummary>
            listWorkRequestsRecordIterator(final ListWorkRequestsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListWorkRequestsRequest.Builder, ListWorkRequestsRequest, ListWorkRequestsResponse,
                com.oracle.bmc.containerinstances.model.WorkRequestSummary>(
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
                                com.oracle.bmc.containerinstances.model.WorkRequestSummary>>() {
                    @Override
                    public java.util.List<
                                    com.oracle.bmc.containerinstances.model.WorkRequestSummary>
                            apply(ListWorkRequestsResponse response) {
                        return response.getWorkRequestSummaryCollection().getItems();
                    }
                });
    }
}

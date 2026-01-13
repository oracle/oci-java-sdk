/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.batch;

import com.oracle.bmc.batch.requests.*;
import com.oracle.bmc.batch.responses.*;

/**
 * Collection of helper methods that can be used to provide an {@link java.lang.Iterable} interface
 * to any list operations of BatchComputing where multiple pages of data may be fetched. Two styles
 * of iteration are supported:
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
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20251031")
public class BatchComputingPaginators {
    private final BatchComputing client;

    public BatchComputingPaginators(BatchComputing client) {
        this.client = client;
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the
     * listBatchContextShapes operation. This iterable will fetch more data from the server as
     * needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses
     *     received from the service.
     */
    public Iterable<ListBatchContextShapesResponse> listBatchContextShapesResponseIterator(
            final ListBatchContextShapesRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListBatchContextShapesRequest.Builder,
                ListBatchContextShapesRequest,
                ListBatchContextShapesResponse>(
                new java.util.function.Supplier<ListBatchContextShapesRequest.Builder>() {
                    @Override
                    public ListBatchContextShapesRequest.Builder get() {
                        return ListBatchContextShapesRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListBatchContextShapesResponse, String>() {
                    @Override
                    public String apply(ListBatchContextShapesResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListBatchContextShapesRequest.Builder>,
                        ListBatchContextShapesRequest>() {
                    @Override
                    public ListBatchContextShapesRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListBatchContextShapesRequest.Builder>
                                    input) {
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
                        ListBatchContextShapesRequest, ListBatchContextShapesResponse>() {
                    @Override
                    public ListBatchContextShapesResponse apply(
                            ListBatchContextShapesRequest request) {
                        return client.listBatchContextShapes(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link
     * com.oracle.bmc.batch.model.BatchContextShapeSummary} objects contained in responses from the
     * listBatchContextShapes operation. This iterable will fetch more data from the server as
     * needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link
     *     com.oracle.bmc.batch.model.BatchContextShapeSummary} objects contained in responses
     *     received from the service.
     */
    public Iterable<com.oracle.bmc.batch.model.BatchContextShapeSummary>
            listBatchContextShapesRecordIterator(final ListBatchContextShapesRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListBatchContextShapesRequest.Builder,
                ListBatchContextShapesRequest,
                ListBatchContextShapesResponse,
                com.oracle.bmc.batch.model.BatchContextShapeSummary>(
                new java.util.function.Supplier<ListBatchContextShapesRequest.Builder>() {
                    @Override
                    public ListBatchContextShapesRequest.Builder get() {
                        return ListBatchContextShapesRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListBatchContextShapesResponse, String>() {
                    @Override
                    public String apply(ListBatchContextShapesResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListBatchContextShapesRequest.Builder>,
                        ListBatchContextShapesRequest>() {
                    @Override
                    public ListBatchContextShapesRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListBatchContextShapesRequest.Builder>
                                    input) {
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
                        ListBatchContextShapesRequest, ListBatchContextShapesResponse>() {
                    @Override
                    public ListBatchContextShapesResponse apply(
                            ListBatchContextShapesRequest request) {
                        return client.listBatchContextShapes(request);
                    }
                },
                new java.util.function.Function<
                        ListBatchContextShapesResponse,
                        java.util.List<com.oracle.bmc.batch.model.BatchContextShapeSummary>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.batch.model.BatchContextShapeSummary>
                            apply(ListBatchContextShapesResponse response) {
                        return response.getBatchContextShapeCollection().getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the
     * listBatchContexts operation. This iterable will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses
     *     received from the service.
     */
    public Iterable<ListBatchContextsResponse> listBatchContextsResponseIterator(
            final ListBatchContextsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListBatchContextsRequest.Builder,
                ListBatchContextsRequest,
                ListBatchContextsResponse>(
                new java.util.function.Supplier<ListBatchContextsRequest.Builder>() {
                    @Override
                    public ListBatchContextsRequest.Builder get() {
                        return ListBatchContextsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListBatchContextsResponse, String>() {
                    @Override
                    public String apply(ListBatchContextsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListBatchContextsRequest.Builder>,
                        ListBatchContextsRequest>() {
                    @Override
                    public ListBatchContextsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListBatchContextsRequest.Builder>
                                    input) {
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
                        ListBatchContextsRequest, ListBatchContextsResponse>() {
                    @Override
                    public ListBatchContextsResponse apply(ListBatchContextsRequest request) {
                        return client.listBatchContexts(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link
     * com.oracle.bmc.batch.model.BatchContextSummary} objects contained in responses from the
     * listBatchContexts operation. This iterable will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link
     *     com.oracle.bmc.batch.model.BatchContextSummary} objects contained in responses received
     *     from the service.
     */
    public Iterable<com.oracle.bmc.batch.model.BatchContextSummary> listBatchContextsRecordIterator(
            final ListBatchContextsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListBatchContextsRequest.Builder,
                ListBatchContextsRequest,
                ListBatchContextsResponse,
                com.oracle.bmc.batch.model.BatchContextSummary>(
                new java.util.function.Supplier<ListBatchContextsRequest.Builder>() {
                    @Override
                    public ListBatchContextsRequest.Builder get() {
                        return ListBatchContextsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListBatchContextsResponse, String>() {
                    @Override
                    public String apply(ListBatchContextsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListBatchContextsRequest.Builder>,
                        ListBatchContextsRequest>() {
                    @Override
                    public ListBatchContextsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListBatchContextsRequest.Builder>
                                    input) {
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
                        ListBatchContextsRequest, ListBatchContextsResponse>() {
                    @Override
                    public ListBatchContextsResponse apply(ListBatchContextsRequest request) {
                        return client.listBatchContexts(request);
                    }
                },
                new java.util.function.Function<
                        ListBatchContextsResponse,
                        java.util.List<com.oracle.bmc.batch.model.BatchContextSummary>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.batch.model.BatchContextSummary> apply(
                            ListBatchContextsResponse response) {
                        return response.getBatchContextCollection().getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the
     * listBatchJobPools operation. This iterable will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses
     *     received from the service.
     */
    public Iterable<ListBatchJobPoolsResponse> listBatchJobPoolsResponseIterator(
            final ListBatchJobPoolsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListBatchJobPoolsRequest.Builder,
                ListBatchJobPoolsRequest,
                ListBatchJobPoolsResponse>(
                new java.util.function.Supplier<ListBatchJobPoolsRequest.Builder>() {
                    @Override
                    public ListBatchJobPoolsRequest.Builder get() {
                        return ListBatchJobPoolsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListBatchJobPoolsResponse, String>() {
                    @Override
                    public String apply(ListBatchJobPoolsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListBatchJobPoolsRequest.Builder>,
                        ListBatchJobPoolsRequest>() {
                    @Override
                    public ListBatchJobPoolsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListBatchJobPoolsRequest.Builder>
                                    input) {
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
                        ListBatchJobPoolsRequest, ListBatchJobPoolsResponse>() {
                    @Override
                    public ListBatchJobPoolsResponse apply(ListBatchJobPoolsRequest request) {
                        return client.listBatchJobPools(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link
     * com.oracle.bmc.batch.model.BatchJobPoolSummary} objects contained in responses from the
     * listBatchJobPools operation. This iterable will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link
     *     com.oracle.bmc.batch.model.BatchJobPoolSummary} objects contained in responses received
     *     from the service.
     */
    public Iterable<com.oracle.bmc.batch.model.BatchJobPoolSummary> listBatchJobPoolsRecordIterator(
            final ListBatchJobPoolsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListBatchJobPoolsRequest.Builder,
                ListBatchJobPoolsRequest,
                ListBatchJobPoolsResponse,
                com.oracle.bmc.batch.model.BatchJobPoolSummary>(
                new java.util.function.Supplier<ListBatchJobPoolsRequest.Builder>() {
                    @Override
                    public ListBatchJobPoolsRequest.Builder get() {
                        return ListBatchJobPoolsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListBatchJobPoolsResponse, String>() {
                    @Override
                    public String apply(ListBatchJobPoolsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListBatchJobPoolsRequest.Builder>,
                        ListBatchJobPoolsRequest>() {
                    @Override
                    public ListBatchJobPoolsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListBatchJobPoolsRequest.Builder>
                                    input) {
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
                        ListBatchJobPoolsRequest, ListBatchJobPoolsResponse>() {
                    @Override
                    public ListBatchJobPoolsResponse apply(ListBatchJobPoolsRequest request) {
                        return client.listBatchJobPools(request);
                    }
                },
                new java.util.function.Function<
                        ListBatchJobPoolsResponse,
                        java.util.List<com.oracle.bmc.batch.model.BatchJobPoolSummary>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.batch.model.BatchJobPoolSummary> apply(
                            ListBatchJobPoolsResponse response) {
                        return response.getBatchJobPoolCollection().getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the
     * listBatchJobTasks operation. This iterable will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses
     *     received from the service.
     */
    public Iterable<ListBatchJobTasksResponse> listBatchJobTasksResponseIterator(
            final ListBatchJobTasksRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListBatchJobTasksRequest.Builder,
                ListBatchJobTasksRequest,
                ListBatchJobTasksResponse>(
                new java.util.function.Supplier<ListBatchJobTasksRequest.Builder>() {
                    @Override
                    public ListBatchJobTasksRequest.Builder get() {
                        return ListBatchJobTasksRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListBatchJobTasksResponse, String>() {
                    @Override
                    public String apply(ListBatchJobTasksResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListBatchJobTasksRequest.Builder>,
                        ListBatchJobTasksRequest>() {
                    @Override
                    public ListBatchJobTasksRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListBatchJobTasksRequest.Builder>
                                    input) {
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
                        ListBatchJobTasksRequest, ListBatchJobTasksResponse>() {
                    @Override
                    public ListBatchJobTasksResponse apply(ListBatchJobTasksRequest request) {
                        return client.listBatchJobTasks(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link
     * com.oracle.bmc.batch.model.BatchTaskSummary} objects contained in responses from the
     * listBatchJobTasks operation. This iterable will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link
     *     com.oracle.bmc.batch.model.BatchTaskSummary} objects contained in responses received from
     *     the service.
     */
    public Iterable<com.oracle.bmc.batch.model.BatchTaskSummary> listBatchJobTasksRecordIterator(
            final ListBatchJobTasksRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListBatchJobTasksRequest.Builder,
                ListBatchJobTasksRequest,
                ListBatchJobTasksResponse,
                com.oracle.bmc.batch.model.BatchTaskSummary>(
                new java.util.function.Supplier<ListBatchJobTasksRequest.Builder>() {
                    @Override
                    public ListBatchJobTasksRequest.Builder get() {
                        return ListBatchJobTasksRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListBatchJobTasksResponse, String>() {
                    @Override
                    public String apply(ListBatchJobTasksResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListBatchJobTasksRequest.Builder>,
                        ListBatchJobTasksRequest>() {
                    @Override
                    public ListBatchJobTasksRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListBatchJobTasksRequest.Builder>
                                    input) {
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
                        ListBatchJobTasksRequest, ListBatchJobTasksResponse>() {
                    @Override
                    public ListBatchJobTasksResponse apply(ListBatchJobTasksRequest request) {
                        return client.listBatchJobTasks(request);
                    }
                },
                new java.util.function.Function<
                        ListBatchJobTasksResponse,
                        java.util.List<com.oracle.bmc.batch.model.BatchTaskSummary>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.batch.model.BatchTaskSummary> apply(
                            ListBatchJobTasksResponse response) {
                        return response.getBatchTaskCollection().getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the listBatchJobs
     * operation. This iterable will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses
     *     received from the service.
     */
    public Iterable<ListBatchJobsResponse> listBatchJobsResponseIterator(
            final ListBatchJobsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListBatchJobsRequest.Builder, ListBatchJobsRequest, ListBatchJobsResponse>(
                new java.util.function.Supplier<ListBatchJobsRequest.Builder>() {
                    @Override
                    public ListBatchJobsRequest.Builder get() {
                        return ListBatchJobsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListBatchJobsResponse, String>() {
                    @Override
                    public String apply(ListBatchJobsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListBatchJobsRequest.Builder>,
                        ListBatchJobsRequest>() {
                    @Override
                    public ListBatchJobsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListBatchJobsRequest.Builder>
                                    input) {
                        if (input.getNextPageToken() == null) {
                            return input.getRequestBuilder().build();
                        } else {
                            return input.getRequestBuilder()
                                    .page(input.getNextPageToken().orElse(null))
                                    .build();
                        }
                    }
                },
                new java.util.function.Function<ListBatchJobsRequest, ListBatchJobsResponse>() {
                    @Override
                    public ListBatchJobsResponse apply(ListBatchJobsRequest request) {
                        return client.listBatchJobs(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link
     * com.oracle.bmc.batch.model.BatchJobSummary} objects contained in responses from the
     * listBatchJobs operation. This iterable will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link
     *     com.oracle.bmc.batch.model.BatchJobSummary} objects contained in responses received from
     *     the service.
     */
    public Iterable<com.oracle.bmc.batch.model.BatchJobSummary> listBatchJobsRecordIterator(
            final ListBatchJobsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListBatchJobsRequest.Builder,
                ListBatchJobsRequest,
                ListBatchJobsResponse,
                com.oracle.bmc.batch.model.BatchJobSummary>(
                new java.util.function.Supplier<ListBatchJobsRequest.Builder>() {
                    @Override
                    public ListBatchJobsRequest.Builder get() {
                        return ListBatchJobsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListBatchJobsResponse, String>() {
                    @Override
                    public String apply(ListBatchJobsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListBatchJobsRequest.Builder>,
                        ListBatchJobsRequest>() {
                    @Override
                    public ListBatchJobsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListBatchJobsRequest.Builder>
                                    input) {
                        if (input.getNextPageToken() == null) {
                            return input.getRequestBuilder().build();
                        } else {
                            return input.getRequestBuilder()
                                    .page(input.getNextPageToken().orElse(null))
                                    .build();
                        }
                    }
                },
                new java.util.function.Function<ListBatchJobsRequest, ListBatchJobsResponse>() {
                    @Override
                    public ListBatchJobsResponse apply(ListBatchJobsRequest request) {
                        return client.listBatchJobs(request);
                    }
                },
                new java.util.function.Function<
                        ListBatchJobsResponse,
                        java.util.List<com.oracle.bmc.batch.model.BatchJobSummary>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.batch.model.BatchJobSummary> apply(
                            ListBatchJobsResponse response) {
                        return response.getBatchJobCollection().getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the
     * listBatchTaskEnvironments operation. This iterable will fetch more data from the server as
     * needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses
     *     received from the service.
     */
    public Iterable<ListBatchTaskEnvironmentsResponse> listBatchTaskEnvironmentsResponseIterator(
            final ListBatchTaskEnvironmentsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListBatchTaskEnvironmentsRequest.Builder,
                ListBatchTaskEnvironmentsRequest,
                ListBatchTaskEnvironmentsResponse>(
                new java.util.function.Supplier<ListBatchTaskEnvironmentsRequest.Builder>() {
                    @Override
                    public ListBatchTaskEnvironmentsRequest.Builder get() {
                        return ListBatchTaskEnvironmentsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListBatchTaskEnvironmentsResponse, String>() {
                    @Override
                    public String apply(ListBatchTaskEnvironmentsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListBatchTaskEnvironmentsRequest.Builder>,
                        ListBatchTaskEnvironmentsRequest>() {
                    @Override
                    public ListBatchTaskEnvironmentsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListBatchTaskEnvironmentsRequest.Builder>
                                    input) {
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
                        ListBatchTaskEnvironmentsRequest, ListBatchTaskEnvironmentsResponse>() {
                    @Override
                    public ListBatchTaskEnvironmentsResponse apply(
                            ListBatchTaskEnvironmentsRequest request) {
                        return client.listBatchTaskEnvironments(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link
     * com.oracle.bmc.batch.model.BatchTaskEnvironmentSummary} objects contained in responses from
     * the listBatchTaskEnvironments operation. This iterable will fetch more data from the server
     * as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link
     *     com.oracle.bmc.batch.model.BatchTaskEnvironmentSummary} objects contained in responses
     *     received from the service.
     */
    public Iterable<com.oracle.bmc.batch.model.BatchTaskEnvironmentSummary>
            listBatchTaskEnvironmentsRecordIterator(
                    final ListBatchTaskEnvironmentsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListBatchTaskEnvironmentsRequest.Builder,
                ListBatchTaskEnvironmentsRequest,
                ListBatchTaskEnvironmentsResponse,
                com.oracle.bmc.batch.model.BatchTaskEnvironmentSummary>(
                new java.util.function.Supplier<ListBatchTaskEnvironmentsRequest.Builder>() {
                    @Override
                    public ListBatchTaskEnvironmentsRequest.Builder get() {
                        return ListBatchTaskEnvironmentsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListBatchTaskEnvironmentsResponse, String>() {
                    @Override
                    public String apply(ListBatchTaskEnvironmentsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListBatchTaskEnvironmentsRequest.Builder>,
                        ListBatchTaskEnvironmentsRequest>() {
                    @Override
                    public ListBatchTaskEnvironmentsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListBatchTaskEnvironmentsRequest.Builder>
                                    input) {
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
                        ListBatchTaskEnvironmentsRequest, ListBatchTaskEnvironmentsResponse>() {
                    @Override
                    public ListBatchTaskEnvironmentsResponse apply(
                            ListBatchTaskEnvironmentsRequest request) {
                        return client.listBatchTaskEnvironments(request);
                    }
                },
                new java.util.function.Function<
                        ListBatchTaskEnvironmentsResponse,
                        java.util.List<com.oracle.bmc.batch.model.BatchTaskEnvironmentSummary>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.batch.model.BatchTaskEnvironmentSummary>
                            apply(ListBatchTaskEnvironmentsResponse response) {
                        return response.getBatchTaskEnvironmentCollection().getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the
     * listBatchTaskProfiles operation. This iterable will fetch more data from the server as
     * needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses
     *     received from the service.
     */
    public Iterable<ListBatchTaskProfilesResponse> listBatchTaskProfilesResponseIterator(
            final ListBatchTaskProfilesRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListBatchTaskProfilesRequest.Builder,
                ListBatchTaskProfilesRequest,
                ListBatchTaskProfilesResponse>(
                new java.util.function.Supplier<ListBatchTaskProfilesRequest.Builder>() {
                    @Override
                    public ListBatchTaskProfilesRequest.Builder get() {
                        return ListBatchTaskProfilesRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListBatchTaskProfilesResponse, String>() {
                    @Override
                    public String apply(ListBatchTaskProfilesResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListBatchTaskProfilesRequest.Builder>,
                        ListBatchTaskProfilesRequest>() {
                    @Override
                    public ListBatchTaskProfilesRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListBatchTaskProfilesRequest.Builder>
                                    input) {
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
                        ListBatchTaskProfilesRequest, ListBatchTaskProfilesResponse>() {
                    @Override
                    public ListBatchTaskProfilesResponse apply(
                            ListBatchTaskProfilesRequest request) {
                        return client.listBatchTaskProfiles(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link
     * com.oracle.bmc.batch.model.BatchTaskProfileSummary} objects contained in responses from the
     * listBatchTaskProfiles operation. This iterable will fetch more data from the server as
     * needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link
     *     com.oracle.bmc.batch.model.BatchTaskProfileSummary} objects contained in responses
     *     received from the service.
     */
    public Iterable<com.oracle.bmc.batch.model.BatchTaskProfileSummary>
            listBatchTaskProfilesRecordIterator(final ListBatchTaskProfilesRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListBatchTaskProfilesRequest.Builder,
                ListBatchTaskProfilesRequest,
                ListBatchTaskProfilesResponse,
                com.oracle.bmc.batch.model.BatchTaskProfileSummary>(
                new java.util.function.Supplier<ListBatchTaskProfilesRequest.Builder>() {
                    @Override
                    public ListBatchTaskProfilesRequest.Builder get() {
                        return ListBatchTaskProfilesRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListBatchTaskProfilesResponse, String>() {
                    @Override
                    public String apply(ListBatchTaskProfilesResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListBatchTaskProfilesRequest.Builder>,
                        ListBatchTaskProfilesRequest>() {
                    @Override
                    public ListBatchTaskProfilesRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListBatchTaskProfilesRequest.Builder>
                                    input) {
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
                        ListBatchTaskProfilesRequest, ListBatchTaskProfilesResponse>() {
                    @Override
                    public ListBatchTaskProfilesResponse apply(
                            ListBatchTaskProfilesRequest request) {
                        return client.listBatchTaskProfiles(request);
                    }
                },
                new java.util.function.Function<
                        ListBatchTaskProfilesResponse,
                        java.util.List<com.oracle.bmc.batch.model.BatchTaskProfileSummary>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.batch.model.BatchTaskProfileSummary> apply(
                            ListBatchTaskProfilesResponse response) {
                        return response.getBatchTaskProfileCollection().getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the listBatchTasks
     * operation. This iterable will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses
     *     received from the service.
     */
    public Iterable<ListBatchTasksResponse> listBatchTasksResponseIterator(
            final ListBatchTasksRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListBatchTasksRequest.Builder, ListBatchTasksRequest, ListBatchTasksResponse>(
                new java.util.function.Supplier<ListBatchTasksRequest.Builder>() {
                    @Override
                    public ListBatchTasksRequest.Builder get() {
                        return ListBatchTasksRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListBatchTasksResponse, String>() {
                    @Override
                    public String apply(ListBatchTasksResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListBatchTasksRequest.Builder>,
                        ListBatchTasksRequest>() {
                    @Override
                    public ListBatchTasksRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListBatchTasksRequest.Builder>
                                    input) {
                        if (input.getNextPageToken() == null) {
                            return input.getRequestBuilder().build();
                        } else {
                            return input.getRequestBuilder()
                                    .page(input.getNextPageToken().orElse(null))
                                    .build();
                        }
                    }
                },
                new java.util.function.Function<ListBatchTasksRequest, ListBatchTasksResponse>() {
                    @Override
                    public ListBatchTasksResponse apply(ListBatchTasksRequest request) {
                        return client.listBatchTasks(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link
     * com.oracle.bmc.batch.model.BatchTaskSummary} objects contained in responses from the
     * listBatchTasks operation. This iterable will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link
     *     com.oracle.bmc.batch.model.BatchTaskSummary} objects contained in responses received from
     *     the service.
     */
    public Iterable<com.oracle.bmc.batch.model.BatchTaskSummary> listBatchTasksRecordIterator(
            final ListBatchTasksRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListBatchTasksRequest.Builder,
                ListBatchTasksRequest,
                ListBatchTasksResponse,
                com.oracle.bmc.batch.model.BatchTaskSummary>(
                new java.util.function.Supplier<ListBatchTasksRequest.Builder>() {
                    @Override
                    public ListBatchTasksRequest.Builder get() {
                        return ListBatchTasksRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListBatchTasksResponse, String>() {
                    @Override
                    public String apply(ListBatchTasksResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListBatchTasksRequest.Builder>,
                        ListBatchTasksRequest>() {
                    @Override
                    public ListBatchTasksRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListBatchTasksRequest.Builder>
                                    input) {
                        if (input.getNextPageToken() == null) {
                            return input.getRequestBuilder().build();
                        } else {
                            return input.getRequestBuilder()
                                    .page(input.getNextPageToken().orElse(null))
                                    .build();
                        }
                    }
                },
                new java.util.function.Function<ListBatchTasksRequest, ListBatchTasksResponse>() {
                    @Override
                    public ListBatchTasksResponse apply(ListBatchTasksRequest request) {
                        return client.listBatchTasks(request);
                    }
                },
                new java.util.function.Function<
                        ListBatchTasksResponse,
                        java.util.List<com.oracle.bmc.batch.model.BatchTaskSummary>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.batch.model.BatchTaskSummary> apply(
                            ListBatchTasksResponse response) {
                        return response.getBatchTaskCollection().getItems();
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
     * com.oracle.bmc.batch.model.WorkRequestError} objects contained in responses from the
     * listWorkRequestErrors operation. This iterable will fetch more data from the server as
     * needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link
     *     com.oracle.bmc.batch.model.WorkRequestError} objects contained in responses received from
     *     the service.
     */
    public Iterable<com.oracle.bmc.batch.model.WorkRequestError>
            listWorkRequestErrorsRecordIterator(final ListWorkRequestErrorsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListWorkRequestErrorsRequest.Builder,
                ListWorkRequestErrorsRequest,
                ListWorkRequestErrorsResponse,
                com.oracle.bmc.batch.model.WorkRequestError>(
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
                        java.util.List<com.oracle.bmc.batch.model.WorkRequestError>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.batch.model.WorkRequestError> apply(
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
     * com.oracle.bmc.batch.model.WorkRequestLogEntry} objects contained in responses from the
     * listWorkRequestLogs operation. This iterable will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link
     *     com.oracle.bmc.batch.model.WorkRequestLogEntry} objects contained in responses received
     *     from the service.
     */
    public Iterable<com.oracle.bmc.batch.model.WorkRequestLogEntry>
            listWorkRequestLogsRecordIterator(final ListWorkRequestLogsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListWorkRequestLogsRequest.Builder,
                ListWorkRequestLogsRequest,
                ListWorkRequestLogsResponse,
                com.oracle.bmc.batch.model.WorkRequestLogEntry>(
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
                        java.util.List<com.oracle.bmc.batch.model.WorkRequestLogEntry>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.batch.model.WorkRequestLogEntry> apply(
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
     * com.oracle.bmc.batch.model.WorkRequestSummary} objects contained in responses from the
     * listWorkRequests operation. This iterable will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link
     *     com.oracle.bmc.batch.model.WorkRequestSummary} objects contained in responses received
     *     from the service.
     */
    public Iterable<com.oracle.bmc.batch.model.WorkRequestSummary> listWorkRequestsRecordIterator(
            final ListWorkRequestsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListWorkRequestsRequest.Builder,
                ListWorkRequestsRequest,
                ListWorkRequestsResponse,
                com.oracle.bmc.batch.model.WorkRequestSummary>(
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
                        java.util.List<com.oracle.bmc.batch.model.WorkRequestSummary>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.batch.model.WorkRequestSummary> apply(
                            ListWorkRequestsResponse response) {
                        return response.getWorkRequestSummaryCollection().getItems();
                    }
                });
    }
}

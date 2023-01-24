/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.datascience;

import com.oracle.bmc.datascience.requests.*;
import com.oracle.bmc.datascience.responses.*;

/**
 * Collection of helper methods that can be used to provide an {@link java.lang.Iterable} interface
 * to any list operations of DataScience where multiple pages of data may be fetched. Two styles of
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
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20190101")
public class DataSciencePaginators {
    private final DataScience client;

    public DataSciencePaginators(DataScience client) {
        this.client = client;
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the
     * listFastLaunchJobConfigs operation. This iterable will fetch more data from the server as
     * needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses
     *     received from the service.
     */
    public Iterable<ListFastLaunchJobConfigsResponse> listFastLaunchJobConfigsResponseIterator(
            final ListFastLaunchJobConfigsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListFastLaunchJobConfigsRequest.Builder,
                ListFastLaunchJobConfigsRequest,
                ListFastLaunchJobConfigsResponse>(
                new java.util.function.Supplier<ListFastLaunchJobConfigsRequest.Builder>() {
                    @Override
                    public ListFastLaunchJobConfigsRequest.Builder get() {
                        return ListFastLaunchJobConfigsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListFastLaunchJobConfigsResponse, String>() {
                    @Override
                    public String apply(ListFastLaunchJobConfigsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListFastLaunchJobConfigsRequest.Builder>,
                        ListFastLaunchJobConfigsRequest>() {
                    @Override
                    public ListFastLaunchJobConfigsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListFastLaunchJobConfigsRequest.Builder>
                                    input) {
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
                        ListFastLaunchJobConfigsRequest, ListFastLaunchJobConfigsResponse>() {
                    @Override
                    public ListFastLaunchJobConfigsResponse apply(
                            ListFastLaunchJobConfigsRequest request) {
                        return client.listFastLaunchJobConfigs(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link
     * com.oracle.bmc.datascience.model.FastLaunchJobConfigSummary} objects contained in responses
     * from the listFastLaunchJobConfigs operation. This iterable will fetch more data from the
     * server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link
     *     com.oracle.bmc.datascience.model.FastLaunchJobConfigSummary} objects contained in
     *     responses received from the service.
     */
    public Iterable<com.oracle.bmc.datascience.model.FastLaunchJobConfigSummary>
            listFastLaunchJobConfigsRecordIterator(final ListFastLaunchJobConfigsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListFastLaunchJobConfigsRequest.Builder,
                ListFastLaunchJobConfigsRequest,
                ListFastLaunchJobConfigsResponse,
                com.oracle.bmc.datascience.model.FastLaunchJobConfigSummary>(
                new java.util.function.Supplier<ListFastLaunchJobConfigsRequest.Builder>() {
                    @Override
                    public ListFastLaunchJobConfigsRequest.Builder get() {
                        return ListFastLaunchJobConfigsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListFastLaunchJobConfigsResponse, String>() {
                    @Override
                    public String apply(ListFastLaunchJobConfigsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListFastLaunchJobConfigsRequest.Builder>,
                        ListFastLaunchJobConfigsRequest>() {
                    @Override
                    public ListFastLaunchJobConfigsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListFastLaunchJobConfigsRequest.Builder>
                                    input) {
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
                        ListFastLaunchJobConfigsRequest, ListFastLaunchJobConfigsResponse>() {
                    @Override
                    public ListFastLaunchJobConfigsResponse apply(
                            ListFastLaunchJobConfigsRequest request) {
                        return client.listFastLaunchJobConfigs(request);
                    }
                },
                new java.util.function.Function<
                        ListFastLaunchJobConfigsResponse,
                        java.util.List<
                                com.oracle.bmc.datascience.model.FastLaunchJobConfigSummary>>() {
                    @Override
                    public java.util.List<
                                    com.oracle.bmc.datascience.model.FastLaunchJobConfigSummary>
                            apply(ListFastLaunchJobConfigsResponse response) {
                        return response.getItems();
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
     * com.oracle.bmc.datascience.model.JobRunSummary} objects contained in responses from the
     * listJobRuns operation. This iterable will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link
     *     com.oracle.bmc.datascience.model.JobRunSummary} objects contained in responses received
     *     from the service.
     */
    public Iterable<com.oracle.bmc.datascience.model.JobRunSummary> listJobRunsRecordIterator(
            final ListJobRunsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListJobRunsRequest.Builder,
                ListJobRunsRequest,
                ListJobRunsResponse,
                com.oracle.bmc.datascience.model.JobRunSummary>(
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
                        java.util.List<com.oracle.bmc.datascience.model.JobRunSummary>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.datascience.model.JobRunSummary> apply(
                            ListJobRunsResponse response) {
                        return response.getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the listJobShapes
     * operation. This iterable will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses
     *     received from the service.
     */
    public Iterable<ListJobShapesResponse> listJobShapesResponseIterator(
            final ListJobShapesRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListJobShapesRequest.Builder, ListJobShapesRequest, ListJobShapesResponse>(
                new java.util.function.Supplier<ListJobShapesRequest.Builder>() {
                    @Override
                    public ListJobShapesRequest.Builder get() {
                        return ListJobShapesRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListJobShapesResponse, String>() {
                    @Override
                    public String apply(ListJobShapesResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListJobShapesRequest.Builder>,
                        ListJobShapesRequest>() {
                    @Override
                    public ListJobShapesRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListJobShapesRequest.Builder>
                                    input) {
                        if (input.getNextPageToken() == null) {
                            return input.getRequestBuilder().build();
                        } else {
                            return input.getRequestBuilder()
                                    .page(input.getNextPageToken().orElse(null))
                                    .build();
                        }
                    }
                },
                new java.util.function.Function<ListJobShapesRequest, ListJobShapesResponse>() {
                    @Override
                    public ListJobShapesResponse apply(ListJobShapesRequest request) {
                        return client.listJobShapes(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link
     * com.oracle.bmc.datascience.model.JobShapeSummary} objects contained in responses from the
     * listJobShapes operation. This iterable will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link
     *     com.oracle.bmc.datascience.model.JobShapeSummary} objects contained in responses received
     *     from the service.
     */
    public Iterable<com.oracle.bmc.datascience.model.JobShapeSummary> listJobShapesRecordIterator(
            final ListJobShapesRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListJobShapesRequest.Builder,
                ListJobShapesRequest,
                ListJobShapesResponse,
                com.oracle.bmc.datascience.model.JobShapeSummary>(
                new java.util.function.Supplier<ListJobShapesRequest.Builder>() {
                    @Override
                    public ListJobShapesRequest.Builder get() {
                        return ListJobShapesRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListJobShapesResponse, String>() {
                    @Override
                    public String apply(ListJobShapesResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListJobShapesRequest.Builder>,
                        ListJobShapesRequest>() {
                    @Override
                    public ListJobShapesRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListJobShapesRequest.Builder>
                                    input) {
                        if (input.getNextPageToken() == null) {
                            return input.getRequestBuilder().build();
                        } else {
                            return input.getRequestBuilder()
                                    .page(input.getNextPageToken().orElse(null))
                                    .build();
                        }
                    }
                },
                new java.util.function.Function<ListJobShapesRequest, ListJobShapesResponse>() {
                    @Override
                    public ListJobShapesResponse apply(ListJobShapesRequest request) {
                        return client.listJobShapes(request);
                    }
                },
                new java.util.function.Function<
                        ListJobShapesResponse,
                        java.util.List<com.oracle.bmc.datascience.model.JobShapeSummary>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.datascience.model.JobShapeSummary> apply(
                            ListJobShapesResponse response) {
                        return response.getItems();
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
     * com.oracle.bmc.datascience.model.JobSummary} objects contained in responses from the listJobs
     * operation. This iterable will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link
     *     com.oracle.bmc.datascience.model.JobSummary} objects contained in responses received from
     *     the service.
     */
    public Iterable<com.oracle.bmc.datascience.model.JobSummary> listJobsRecordIterator(
            final ListJobsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListJobsRequest.Builder,
                ListJobsRequest,
                ListJobsResponse,
                com.oracle.bmc.datascience.model.JobSummary>(
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
                        java.util.List<com.oracle.bmc.datascience.model.JobSummary>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.datascience.model.JobSummary> apply(
                            ListJobsResponse response) {
                        return response.getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the
     * listModelDeploymentShapes operation. This iterable will fetch more data from the server as
     * needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses
     *     received from the service.
     */
    public Iterable<ListModelDeploymentShapesResponse> listModelDeploymentShapesResponseIterator(
            final ListModelDeploymentShapesRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListModelDeploymentShapesRequest.Builder,
                ListModelDeploymentShapesRequest,
                ListModelDeploymentShapesResponse>(
                new java.util.function.Supplier<ListModelDeploymentShapesRequest.Builder>() {
                    @Override
                    public ListModelDeploymentShapesRequest.Builder get() {
                        return ListModelDeploymentShapesRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListModelDeploymentShapesResponse, String>() {
                    @Override
                    public String apply(ListModelDeploymentShapesResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListModelDeploymentShapesRequest.Builder>,
                        ListModelDeploymentShapesRequest>() {
                    @Override
                    public ListModelDeploymentShapesRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListModelDeploymentShapesRequest.Builder>
                                    input) {
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
                        ListModelDeploymentShapesRequest, ListModelDeploymentShapesResponse>() {
                    @Override
                    public ListModelDeploymentShapesResponse apply(
                            ListModelDeploymentShapesRequest request) {
                        return client.listModelDeploymentShapes(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link
     * com.oracle.bmc.datascience.model.ModelDeploymentShapeSummary} objects contained in responses
     * from the listModelDeploymentShapes operation. This iterable will fetch more data from the
     * server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link
     *     com.oracle.bmc.datascience.model.ModelDeploymentShapeSummary} objects contained in
     *     responses received from the service.
     */
    public Iterable<com.oracle.bmc.datascience.model.ModelDeploymentShapeSummary>
            listModelDeploymentShapesRecordIterator(
                    final ListModelDeploymentShapesRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListModelDeploymentShapesRequest.Builder,
                ListModelDeploymentShapesRequest,
                ListModelDeploymentShapesResponse,
                com.oracle.bmc.datascience.model.ModelDeploymentShapeSummary>(
                new java.util.function.Supplier<ListModelDeploymentShapesRequest.Builder>() {
                    @Override
                    public ListModelDeploymentShapesRequest.Builder get() {
                        return ListModelDeploymentShapesRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListModelDeploymentShapesResponse, String>() {
                    @Override
                    public String apply(ListModelDeploymentShapesResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListModelDeploymentShapesRequest.Builder>,
                        ListModelDeploymentShapesRequest>() {
                    @Override
                    public ListModelDeploymentShapesRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListModelDeploymentShapesRequest.Builder>
                                    input) {
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
                        ListModelDeploymentShapesRequest, ListModelDeploymentShapesResponse>() {
                    @Override
                    public ListModelDeploymentShapesResponse apply(
                            ListModelDeploymentShapesRequest request) {
                        return client.listModelDeploymentShapes(request);
                    }
                },
                new java.util.function.Function<
                        ListModelDeploymentShapesResponse,
                        java.util.List<
                                com.oracle.bmc.datascience.model.ModelDeploymentShapeSummary>>() {
                    @Override
                    public java.util.List<
                                    com.oracle.bmc.datascience.model.ModelDeploymentShapeSummary>
                            apply(ListModelDeploymentShapesResponse response) {
                        return response.getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the
     * listModelDeployments operation. This iterable will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses
     *     received from the service.
     */
    public Iterable<ListModelDeploymentsResponse> listModelDeploymentsResponseIterator(
            final ListModelDeploymentsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListModelDeploymentsRequest.Builder,
                ListModelDeploymentsRequest,
                ListModelDeploymentsResponse>(
                new java.util.function.Supplier<ListModelDeploymentsRequest.Builder>() {
                    @Override
                    public ListModelDeploymentsRequest.Builder get() {
                        return ListModelDeploymentsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListModelDeploymentsResponse, String>() {
                    @Override
                    public String apply(ListModelDeploymentsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListModelDeploymentsRequest.Builder>,
                        ListModelDeploymentsRequest>() {
                    @Override
                    public ListModelDeploymentsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListModelDeploymentsRequest.Builder>
                                    input) {
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
                        ListModelDeploymentsRequest, ListModelDeploymentsResponse>() {
                    @Override
                    public ListModelDeploymentsResponse apply(ListModelDeploymentsRequest request) {
                        return client.listModelDeployments(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link
     * com.oracle.bmc.datascience.model.ModelDeploymentSummary} objects contained in responses from
     * the listModelDeployments operation. This iterable will fetch more data from the server as
     * needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link
     *     com.oracle.bmc.datascience.model.ModelDeploymentSummary} objects contained in responses
     *     received from the service.
     */
    public Iterable<com.oracle.bmc.datascience.model.ModelDeploymentSummary>
            listModelDeploymentsRecordIterator(final ListModelDeploymentsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListModelDeploymentsRequest.Builder,
                ListModelDeploymentsRequest,
                ListModelDeploymentsResponse,
                com.oracle.bmc.datascience.model.ModelDeploymentSummary>(
                new java.util.function.Supplier<ListModelDeploymentsRequest.Builder>() {
                    @Override
                    public ListModelDeploymentsRequest.Builder get() {
                        return ListModelDeploymentsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListModelDeploymentsResponse, String>() {
                    @Override
                    public String apply(ListModelDeploymentsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListModelDeploymentsRequest.Builder>,
                        ListModelDeploymentsRequest>() {
                    @Override
                    public ListModelDeploymentsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListModelDeploymentsRequest.Builder>
                                    input) {
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
                        ListModelDeploymentsRequest, ListModelDeploymentsResponse>() {
                    @Override
                    public ListModelDeploymentsResponse apply(ListModelDeploymentsRequest request) {
                        return client.listModelDeployments(request);
                    }
                },
                new java.util.function.Function<
                        ListModelDeploymentsResponse,
                        java.util.List<com.oracle.bmc.datascience.model.ModelDeploymentSummary>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.datascience.model.ModelDeploymentSummary>
                            apply(ListModelDeploymentsResponse response) {
                        return response.getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the
     * listModelVersionSets operation. This iterable will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses
     *     received from the service.
     */
    public Iterable<ListModelVersionSetsResponse> listModelVersionSetsResponseIterator(
            final ListModelVersionSetsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListModelVersionSetsRequest.Builder,
                ListModelVersionSetsRequest,
                ListModelVersionSetsResponse>(
                new java.util.function.Supplier<ListModelVersionSetsRequest.Builder>() {
                    @Override
                    public ListModelVersionSetsRequest.Builder get() {
                        return ListModelVersionSetsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListModelVersionSetsResponse, String>() {
                    @Override
                    public String apply(ListModelVersionSetsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListModelVersionSetsRequest.Builder>,
                        ListModelVersionSetsRequest>() {
                    @Override
                    public ListModelVersionSetsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListModelVersionSetsRequest.Builder>
                                    input) {
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
                        ListModelVersionSetsRequest, ListModelVersionSetsResponse>() {
                    @Override
                    public ListModelVersionSetsResponse apply(ListModelVersionSetsRequest request) {
                        return client.listModelVersionSets(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link
     * com.oracle.bmc.datascience.model.ModelVersionSetSummary} objects contained in responses from
     * the listModelVersionSets operation. This iterable will fetch more data from the server as
     * needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link
     *     com.oracle.bmc.datascience.model.ModelVersionSetSummary} objects contained in responses
     *     received from the service.
     */
    public Iterable<com.oracle.bmc.datascience.model.ModelVersionSetSummary>
            listModelVersionSetsRecordIterator(final ListModelVersionSetsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListModelVersionSetsRequest.Builder,
                ListModelVersionSetsRequest,
                ListModelVersionSetsResponse,
                com.oracle.bmc.datascience.model.ModelVersionSetSummary>(
                new java.util.function.Supplier<ListModelVersionSetsRequest.Builder>() {
                    @Override
                    public ListModelVersionSetsRequest.Builder get() {
                        return ListModelVersionSetsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListModelVersionSetsResponse, String>() {
                    @Override
                    public String apply(ListModelVersionSetsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListModelVersionSetsRequest.Builder>,
                        ListModelVersionSetsRequest>() {
                    @Override
                    public ListModelVersionSetsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListModelVersionSetsRequest.Builder>
                                    input) {
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
                        ListModelVersionSetsRequest, ListModelVersionSetsResponse>() {
                    @Override
                    public ListModelVersionSetsResponse apply(ListModelVersionSetsRequest request) {
                        return client.listModelVersionSets(request);
                    }
                },
                new java.util.function.Function<
                        ListModelVersionSetsResponse,
                        java.util.List<com.oracle.bmc.datascience.model.ModelVersionSetSummary>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.datascience.model.ModelVersionSetSummary>
                            apply(ListModelVersionSetsResponse response) {
                        return response.getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the listModels
     * operation. This iterable will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses
     *     received from the service.
     */
    public Iterable<ListModelsResponse> listModelsResponseIterator(
            final ListModelsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListModelsRequest.Builder, ListModelsRequest, ListModelsResponse>(
                new java.util.function.Supplier<ListModelsRequest.Builder>() {
                    @Override
                    public ListModelsRequest.Builder get() {
                        return ListModelsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListModelsResponse, String>() {
                    @Override
                    public String apply(ListModelsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListModelsRequest.Builder>,
                        ListModelsRequest>() {
                    @Override
                    public ListModelsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListModelsRequest.Builder>
                                    input) {
                        if (input.getNextPageToken() == null) {
                            return input.getRequestBuilder().build();
                        } else {
                            return input.getRequestBuilder()
                                    .page(input.getNextPageToken().orElse(null))
                                    .build();
                        }
                    }
                },
                new java.util.function.Function<ListModelsRequest, ListModelsResponse>() {
                    @Override
                    public ListModelsResponse apply(ListModelsRequest request) {
                        return client.listModels(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link
     * com.oracle.bmc.datascience.model.ModelSummary} objects contained in responses from the
     * listModels operation. This iterable will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link
     *     com.oracle.bmc.datascience.model.ModelSummary} objects contained in responses received
     *     from the service.
     */
    public Iterable<com.oracle.bmc.datascience.model.ModelSummary> listModelsRecordIterator(
            final ListModelsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListModelsRequest.Builder,
                ListModelsRequest,
                ListModelsResponse,
                com.oracle.bmc.datascience.model.ModelSummary>(
                new java.util.function.Supplier<ListModelsRequest.Builder>() {
                    @Override
                    public ListModelsRequest.Builder get() {
                        return ListModelsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListModelsResponse, String>() {
                    @Override
                    public String apply(ListModelsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListModelsRequest.Builder>,
                        ListModelsRequest>() {
                    @Override
                    public ListModelsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListModelsRequest.Builder>
                                    input) {
                        if (input.getNextPageToken() == null) {
                            return input.getRequestBuilder().build();
                        } else {
                            return input.getRequestBuilder()
                                    .page(input.getNextPageToken().orElse(null))
                                    .build();
                        }
                    }
                },
                new java.util.function.Function<ListModelsRequest, ListModelsResponse>() {
                    @Override
                    public ListModelsResponse apply(ListModelsRequest request) {
                        return client.listModels(request);
                    }
                },
                new java.util.function.Function<
                        ListModelsResponse,
                        java.util.List<com.oracle.bmc.datascience.model.ModelSummary>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.datascience.model.ModelSummary> apply(
                            ListModelsResponse response) {
                        return response.getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the
     * listNotebookSessionShapes operation. This iterable will fetch more data from the server as
     * needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses
     *     received from the service.
     */
    public Iterable<ListNotebookSessionShapesResponse> listNotebookSessionShapesResponseIterator(
            final ListNotebookSessionShapesRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListNotebookSessionShapesRequest.Builder,
                ListNotebookSessionShapesRequest,
                ListNotebookSessionShapesResponse>(
                new java.util.function.Supplier<ListNotebookSessionShapesRequest.Builder>() {
                    @Override
                    public ListNotebookSessionShapesRequest.Builder get() {
                        return ListNotebookSessionShapesRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListNotebookSessionShapesResponse, String>() {
                    @Override
                    public String apply(ListNotebookSessionShapesResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListNotebookSessionShapesRequest.Builder>,
                        ListNotebookSessionShapesRequest>() {
                    @Override
                    public ListNotebookSessionShapesRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListNotebookSessionShapesRequest.Builder>
                                    input) {
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
                        ListNotebookSessionShapesRequest, ListNotebookSessionShapesResponse>() {
                    @Override
                    public ListNotebookSessionShapesResponse apply(
                            ListNotebookSessionShapesRequest request) {
                        return client.listNotebookSessionShapes(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link
     * com.oracle.bmc.datascience.model.NotebookSessionShapeSummary} objects contained in responses
     * from the listNotebookSessionShapes operation. This iterable will fetch more data from the
     * server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link
     *     com.oracle.bmc.datascience.model.NotebookSessionShapeSummary} objects contained in
     *     responses received from the service.
     */
    public Iterable<com.oracle.bmc.datascience.model.NotebookSessionShapeSummary>
            listNotebookSessionShapesRecordIterator(
                    final ListNotebookSessionShapesRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListNotebookSessionShapesRequest.Builder,
                ListNotebookSessionShapesRequest,
                ListNotebookSessionShapesResponse,
                com.oracle.bmc.datascience.model.NotebookSessionShapeSummary>(
                new java.util.function.Supplier<ListNotebookSessionShapesRequest.Builder>() {
                    @Override
                    public ListNotebookSessionShapesRequest.Builder get() {
                        return ListNotebookSessionShapesRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListNotebookSessionShapesResponse, String>() {
                    @Override
                    public String apply(ListNotebookSessionShapesResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListNotebookSessionShapesRequest.Builder>,
                        ListNotebookSessionShapesRequest>() {
                    @Override
                    public ListNotebookSessionShapesRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListNotebookSessionShapesRequest.Builder>
                                    input) {
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
                        ListNotebookSessionShapesRequest, ListNotebookSessionShapesResponse>() {
                    @Override
                    public ListNotebookSessionShapesResponse apply(
                            ListNotebookSessionShapesRequest request) {
                        return client.listNotebookSessionShapes(request);
                    }
                },
                new java.util.function.Function<
                        ListNotebookSessionShapesResponse,
                        java.util.List<
                                com.oracle.bmc.datascience.model.NotebookSessionShapeSummary>>() {
                    @Override
                    public java.util.List<
                                    com.oracle.bmc.datascience.model.NotebookSessionShapeSummary>
                            apply(ListNotebookSessionShapesResponse response) {
                        return response.getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the
     * listNotebookSessions operation. This iterable will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses
     *     received from the service.
     */
    public Iterable<ListNotebookSessionsResponse> listNotebookSessionsResponseIterator(
            final ListNotebookSessionsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListNotebookSessionsRequest.Builder,
                ListNotebookSessionsRequest,
                ListNotebookSessionsResponse>(
                new java.util.function.Supplier<ListNotebookSessionsRequest.Builder>() {
                    @Override
                    public ListNotebookSessionsRequest.Builder get() {
                        return ListNotebookSessionsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListNotebookSessionsResponse, String>() {
                    @Override
                    public String apply(ListNotebookSessionsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListNotebookSessionsRequest.Builder>,
                        ListNotebookSessionsRequest>() {
                    @Override
                    public ListNotebookSessionsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListNotebookSessionsRequest.Builder>
                                    input) {
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
                        ListNotebookSessionsRequest, ListNotebookSessionsResponse>() {
                    @Override
                    public ListNotebookSessionsResponse apply(ListNotebookSessionsRequest request) {
                        return client.listNotebookSessions(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link
     * com.oracle.bmc.datascience.model.NotebookSessionSummary} objects contained in responses from
     * the listNotebookSessions operation. This iterable will fetch more data from the server as
     * needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link
     *     com.oracle.bmc.datascience.model.NotebookSessionSummary} objects contained in responses
     *     received from the service.
     */
    public Iterable<com.oracle.bmc.datascience.model.NotebookSessionSummary>
            listNotebookSessionsRecordIterator(final ListNotebookSessionsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListNotebookSessionsRequest.Builder,
                ListNotebookSessionsRequest,
                ListNotebookSessionsResponse,
                com.oracle.bmc.datascience.model.NotebookSessionSummary>(
                new java.util.function.Supplier<ListNotebookSessionsRequest.Builder>() {
                    @Override
                    public ListNotebookSessionsRequest.Builder get() {
                        return ListNotebookSessionsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListNotebookSessionsResponse, String>() {
                    @Override
                    public String apply(ListNotebookSessionsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListNotebookSessionsRequest.Builder>,
                        ListNotebookSessionsRequest>() {
                    @Override
                    public ListNotebookSessionsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListNotebookSessionsRequest.Builder>
                                    input) {
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
                        ListNotebookSessionsRequest, ListNotebookSessionsResponse>() {
                    @Override
                    public ListNotebookSessionsResponse apply(ListNotebookSessionsRequest request) {
                        return client.listNotebookSessions(request);
                    }
                },
                new java.util.function.Function<
                        ListNotebookSessionsResponse,
                        java.util.List<com.oracle.bmc.datascience.model.NotebookSessionSummary>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.datascience.model.NotebookSessionSummary>
                            apply(ListNotebookSessionsResponse response) {
                        return response.getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the
     * listPipelineRuns operation. This iterable will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses
     *     received from the service.
     */
    public Iterable<ListPipelineRunsResponse> listPipelineRunsResponseIterator(
            final ListPipelineRunsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListPipelineRunsRequest.Builder, ListPipelineRunsRequest, ListPipelineRunsResponse>(
                new java.util.function.Supplier<ListPipelineRunsRequest.Builder>() {
                    @Override
                    public ListPipelineRunsRequest.Builder get() {
                        return ListPipelineRunsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListPipelineRunsResponse, String>() {
                    @Override
                    public String apply(ListPipelineRunsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListPipelineRunsRequest.Builder>,
                        ListPipelineRunsRequest>() {
                    @Override
                    public ListPipelineRunsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListPipelineRunsRequest.Builder>
                                    input) {
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
                        ListPipelineRunsRequest, ListPipelineRunsResponse>() {
                    @Override
                    public ListPipelineRunsResponse apply(ListPipelineRunsRequest request) {
                        return client.listPipelineRuns(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link
     * com.oracle.bmc.datascience.model.PipelineRunSummary} objects contained in responses from the
     * listPipelineRuns operation. This iterable will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link
     *     com.oracle.bmc.datascience.model.PipelineRunSummary} objects contained in responses
     *     received from the service.
     */
    public Iterable<com.oracle.bmc.datascience.model.PipelineRunSummary>
            listPipelineRunsRecordIterator(final ListPipelineRunsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListPipelineRunsRequest.Builder,
                ListPipelineRunsRequest,
                ListPipelineRunsResponse,
                com.oracle.bmc.datascience.model.PipelineRunSummary>(
                new java.util.function.Supplier<ListPipelineRunsRequest.Builder>() {
                    @Override
                    public ListPipelineRunsRequest.Builder get() {
                        return ListPipelineRunsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListPipelineRunsResponse, String>() {
                    @Override
                    public String apply(ListPipelineRunsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListPipelineRunsRequest.Builder>,
                        ListPipelineRunsRequest>() {
                    @Override
                    public ListPipelineRunsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListPipelineRunsRequest.Builder>
                                    input) {
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
                        ListPipelineRunsRequest, ListPipelineRunsResponse>() {
                    @Override
                    public ListPipelineRunsResponse apply(ListPipelineRunsRequest request) {
                        return client.listPipelineRuns(request);
                    }
                },
                new java.util.function.Function<
                        ListPipelineRunsResponse,
                        java.util.List<com.oracle.bmc.datascience.model.PipelineRunSummary>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.datascience.model.PipelineRunSummary>
                            apply(ListPipelineRunsResponse response) {
                        return response.getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the listPipelines
     * operation. This iterable will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses
     *     received from the service.
     */
    public Iterable<ListPipelinesResponse> listPipelinesResponseIterator(
            final ListPipelinesRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListPipelinesRequest.Builder, ListPipelinesRequest, ListPipelinesResponse>(
                new java.util.function.Supplier<ListPipelinesRequest.Builder>() {
                    @Override
                    public ListPipelinesRequest.Builder get() {
                        return ListPipelinesRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListPipelinesResponse, String>() {
                    @Override
                    public String apply(ListPipelinesResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListPipelinesRequest.Builder>,
                        ListPipelinesRequest>() {
                    @Override
                    public ListPipelinesRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListPipelinesRequest.Builder>
                                    input) {
                        if (input.getNextPageToken() == null) {
                            return input.getRequestBuilder().build();
                        } else {
                            return input.getRequestBuilder()
                                    .page(input.getNextPageToken().orElse(null))
                                    .build();
                        }
                    }
                },
                new java.util.function.Function<ListPipelinesRequest, ListPipelinesResponse>() {
                    @Override
                    public ListPipelinesResponse apply(ListPipelinesRequest request) {
                        return client.listPipelines(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link
     * com.oracle.bmc.datascience.model.PipelineSummary} objects contained in responses from the
     * listPipelines operation. This iterable will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link
     *     com.oracle.bmc.datascience.model.PipelineSummary} objects contained in responses received
     *     from the service.
     */
    public Iterable<com.oracle.bmc.datascience.model.PipelineSummary> listPipelinesRecordIterator(
            final ListPipelinesRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListPipelinesRequest.Builder,
                ListPipelinesRequest,
                ListPipelinesResponse,
                com.oracle.bmc.datascience.model.PipelineSummary>(
                new java.util.function.Supplier<ListPipelinesRequest.Builder>() {
                    @Override
                    public ListPipelinesRequest.Builder get() {
                        return ListPipelinesRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListPipelinesResponse, String>() {
                    @Override
                    public String apply(ListPipelinesResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListPipelinesRequest.Builder>,
                        ListPipelinesRequest>() {
                    @Override
                    public ListPipelinesRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListPipelinesRequest.Builder>
                                    input) {
                        if (input.getNextPageToken() == null) {
                            return input.getRequestBuilder().build();
                        } else {
                            return input.getRequestBuilder()
                                    .page(input.getNextPageToken().orElse(null))
                                    .build();
                        }
                    }
                },
                new java.util.function.Function<ListPipelinesRequest, ListPipelinesResponse>() {
                    @Override
                    public ListPipelinesResponse apply(ListPipelinesRequest request) {
                        return client.listPipelines(request);
                    }
                },
                new java.util.function.Function<
                        ListPipelinesResponse,
                        java.util.List<com.oracle.bmc.datascience.model.PipelineSummary>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.datascience.model.PipelineSummary> apply(
                            ListPipelinesResponse response) {
                        return response.getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the listProjects
     * operation. This iterable will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses
     *     received from the service.
     */
    public Iterable<ListProjectsResponse> listProjectsResponseIterator(
            final ListProjectsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListProjectsRequest.Builder, ListProjectsRequest, ListProjectsResponse>(
                new java.util.function.Supplier<ListProjectsRequest.Builder>() {
                    @Override
                    public ListProjectsRequest.Builder get() {
                        return ListProjectsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListProjectsResponse, String>() {
                    @Override
                    public String apply(ListProjectsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListProjectsRequest.Builder>,
                        ListProjectsRequest>() {
                    @Override
                    public ListProjectsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListProjectsRequest.Builder>
                                    input) {
                        if (input.getNextPageToken() == null) {
                            return input.getRequestBuilder().build();
                        } else {
                            return input.getRequestBuilder()
                                    .page(input.getNextPageToken().orElse(null))
                                    .build();
                        }
                    }
                },
                new java.util.function.Function<ListProjectsRequest, ListProjectsResponse>() {
                    @Override
                    public ListProjectsResponse apply(ListProjectsRequest request) {
                        return client.listProjects(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link
     * com.oracle.bmc.datascience.model.ProjectSummary} objects contained in responses from the
     * listProjects operation. This iterable will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link
     *     com.oracle.bmc.datascience.model.ProjectSummary} objects contained in responses received
     *     from the service.
     */
    public Iterable<com.oracle.bmc.datascience.model.ProjectSummary> listProjectsRecordIterator(
            final ListProjectsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListProjectsRequest.Builder,
                ListProjectsRequest,
                ListProjectsResponse,
                com.oracle.bmc.datascience.model.ProjectSummary>(
                new java.util.function.Supplier<ListProjectsRequest.Builder>() {
                    @Override
                    public ListProjectsRequest.Builder get() {
                        return ListProjectsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListProjectsResponse, String>() {
                    @Override
                    public String apply(ListProjectsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListProjectsRequest.Builder>,
                        ListProjectsRequest>() {
                    @Override
                    public ListProjectsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListProjectsRequest.Builder>
                                    input) {
                        if (input.getNextPageToken() == null) {
                            return input.getRequestBuilder().build();
                        } else {
                            return input.getRequestBuilder()
                                    .page(input.getNextPageToken().orElse(null))
                                    .build();
                        }
                    }
                },
                new java.util.function.Function<ListProjectsRequest, ListProjectsResponse>() {
                    @Override
                    public ListProjectsResponse apply(ListProjectsRequest request) {
                        return client.listProjects(request);
                    }
                },
                new java.util.function.Function<
                        ListProjectsResponse,
                        java.util.List<com.oracle.bmc.datascience.model.ProjectSummary>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.datascience.model.ProjectSummary> apply(
                            ListProjectsResponse response) {
                        return response.getItems();
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
     * com.oracle.bmc.datascience.model.WorkRequestSummary} objects contained in responses from the
     * listWorkRequests operation. This iterable will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link
     *     com.oracle.bmc.datascience.model.WorkRequestSummary} objects contained in responses
     *     received from the service.
     */
    public Iterable<com.oracle.bmc.datascience.model.WorkRequestSummary>
            listWorkRequestsRecordIterator(final ListWorkRequestsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListWorkRequestsRequest.Builder,
                ListWorkRequestsRequest,
                ListWorkRequestsResponse,
                com.oracle.bmc.datascience.model.WorkRequestSummary>(
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
                        java.util.List<com.oracle.bmc.datascience.model.WorkRequestSummary>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.datascience.model.WorkRequestSummary>
                            apply(ListWorkRequestsResponse response) {
                        return response.getItems();
                    }
                });
    }
}

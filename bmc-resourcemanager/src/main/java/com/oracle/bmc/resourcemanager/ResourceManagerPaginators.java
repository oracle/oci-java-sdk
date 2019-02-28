/**
 * Copyright (c) 2016, 2019, Oracle and/or its affiliates. All rights reserved.
 */
package com.oracle.bmc.resourcemanager;

import com.oracle.bmc.resourcemanager.requests.*;
import com.oracle.bmc.resourcemanager.responses.*;

/**
 * Collection of helper methods that can be used to provide an {@link java.lang.Iterable} interface
 * to any list operations of ResourceManager where multiple pages of data may be fetched.
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
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20180917")
@lombok.RequiredArgsConstructor
public class ResourceManagerPaginators {
    private final ResourceManager client;

    /**
     * Creates a new iterable which will iterate over the responses received from the getJobLogs operation. This iterable
     * will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses received from the service.
     */
    public Iterable<GetJobLogsResponse> getJobLogsResponseIterator(
            final GetJobLogsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                GetJobLogsRequest.Builder, GetJobLogsRequest, GetJobLogsResponse>(
                new com.google.common.base.Supplier<GetJobLogsRequest.Builder>() {
                    @Override
                    public GetJobLogsRequest.Builder get() {
                        return GetJobLogsRequest.builder().copy(request);
                    }
                },
                new com.google.common.base.Function<GetJobLogsResponse, String>() {
                    @Override
                    public String apply(GetJobLogsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new com.google.common.base.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                GetJobLogsRequest.Builder>,
                        GetJobLogsRequest>() {
                    @Override
                    public GetJobLogsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            GetJobLogsRequest.Builder>
                                    input) {
                        if (input.getToken() == null) {
                            return input.getRequestBuilder().build();
                        } else {
                            return input.getRequestBuilder()
                                    .page(input.getToken().orNull())
                                    .build();
                        }
                    }
                },
                new com.google.common.base.Function<GetJobLogsRequest, GetJobLogsResponse>() {
                    @Override
                    public GetJobLogsResponse apply(GetJobLogsRequest request) {
                        return client.getJobLogs(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link com.oracle.bmc.resourcemanager.model.LogEntry} objects
     * contained in responses from the getJobLogs operation. This iterable will fetch more data from the
     * server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link com.oracle.bmc.resourcemanager.model.LogEntry} objects
     * contained in responses received from the service.
     */
    public Iterable<com.oracle.bmc.resourcemanager.model.LogEntry> getJobLogsRecordIterator(
            final GetJobLogsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                GetJobLogsRequest.Builder, GetJobLogsRequest, GetJobLogsResponse,
                com.oracle.bmc.resourcemanager.model.LogEntry>(
                new com.google.common.base.Supplier<GetJobLogsRequest.Builder>() {
                    @Override
                    public GetJobLogsRequest.Builder get() {
                        return GetJobLogsRequest.builder().copy(request);
                    }
                },
                new com.google.common.base.Function<GetJobLogsResponse, String>() {
                    @Override
                    public String apply(GetJobLogsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new com.google.common.base.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                GetJobLogsRequest.Builder>,
                        GetJobLogsRequest>() {
                    @Override
                    public GetJobLogsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            GetJobLogsRequest.Builder>
                                    input) {
                        if (input.getToken() == null) {
                            return input.getRequestBuilder().build();
                        } else {
                            return input.getRequestBuilder()
                                    .page(input.getToken().orNull())
                                    .build();
                        }
                    }
                },
                new com.google.common.base.Function<GetJobLogsRequest, GetJobLogsResponse>() {
                    @Override
                    public GetJobLogsResponse apply(GetJobLogsRequest request) {
                        return client.getJobLogs(request);
                    }
                },
                new com.google.common.base.Function<
                        GetJobLogsResponse,
                        java.util.List<com.oracle.bmc.resourcemanager.model.LogEntry>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.resourcemanager.model.LogEntry> apply(
                            GetJobLogsResponse response) {
                        return response.getItems();
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
                new com.google.common.base.Supplier<ListJobsRequest.Builder>() {
                    @Override
                    public ListJobsRequest.Builder get() {
                        return ListJobsRequest.builder().copy(request);
                    }
                },
                new com.google.common.base.Function<ListJobsResponse, String>() {
                    @Override
                    public String apply(ListJobsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new com.google.common.base.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListJobsRequest.Builder>,
                        ListJobsRequest>() {
                    @Override
                    public ListJobsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListJobsRequest.Builder>
                                    input) {
                        if (input.getToken() == null) {
                            return input.getRequestBuilder().build();
                        } else {
                            return input.getRequestBuilder()
                                    .page(input.getToken().orNull())
                                    .build();
                        }
                    }
                },
                new com.google.common.base.Function<ListJobsRequest, ListJobsResponse>() {
                    @Override
                    public ListJobsResponse apply(ListJobsRequest request) {
                        return client.listJobs(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link com.oracle.bmc.resourcemanager.model.JobSummary} objects
     * contained in responses from the listJobs operation. This iterable will fetch more data from the
     * server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link com.oracle.bmc.resourcemanager.model.JobSummary} objects
     * contained in responses received from the service.
     */
    public Iterable<com.oracle.bmc.resourcemanager.model.JobSummary> listJobsRecordIterator(
            final ListJobsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListJobsRequest.Builder, ListJobsRequest, ListJobsResponse,
                com.oracle.bmc.resourcemanager.model.JobSummary>(
                new com.google.common.base.Supplier<ListJobsRequest.Builder>() {
                    @Override
                    public ListJobsRequest.Builder get() {
                        return ListJobsRequest.builder().copy(request);
                    }
                },
                new com.google.common.base.Function<ListJobsResponse, String>() {
                    @Override
                    public String apply(ListJobsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new com.google.common.base.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListJobsRequest.Builder>,
                        ListJobsRequest>() {
                    @Override
                    public ListJobsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListJobsRequest.Builder>
                                    input) {
                        if (input.getToken() == null) {
                            return input.getRequestBuilder().build();
                        } else {
                            return input.getRequestBuilder()
                                    .page(input.getToken().orNull())
                                    .build();
                        }
                    }
                },
                new com.google.common.base.Function<ListJobsRequest, ListJobsResponse>() {
                    @Override
                    public ListJobsResponse apply(ListJobsRequest request) {
                        return client.listJobs(request);
                    }
                },
                new com.google.common.base.Function<
                        ListJobsResponse,
                        java.util.List<com.oracle.bmc.resourcemanager.model.JobSummary>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.resourcemanager.model.JobSummary> apply(
                            ListJobsResponse response) {
                        return response.getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the listStacks operation. This iterable
     * will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses received from the service.
     */
    public Iterable<ListStacksResponse> listStacksResponseIterator(
            final ListStacksRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListStacksRequest.Builder, ListStacksRequest, ListStacksResponse>(
                new com.google.common.base.Supplier<ListStacksRequest.Builder>() {
                    @Override
                    public ListStacksRequest.Builder get() {
                        return ListStacksRequest.builder().copy(request);
                    }
                },
                new com.google.common.base.Function<ListStacksResponse, String>() {
                    @Override
                    public String apply(ListStacksResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new com.google.common.base.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListStacksRequest.Builder>,
                        ListStacksRequest>() {
                    @Override
                    public ListStacksRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListStacksRequest.Builder>
                                    input) {
                        if (input.getToken() == null) {
                            return input.getRequestBuilder().build();
                        } else {
                            return input.getRequestBuilder()
                                    .page(input.getToken().orNull())
                                    .build();
                        }
                    }
                },
                new com.google.common.base.Function<ListStacksRequest, ListStacksResponse>() {
                    @Override
                    public ListStacksResponse apply(ListStacksRequest request) {
                        return client.listStacks(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link com.oracle.bmc.resourcemanager.model.StackSummary} objects
     * contained in responses from the listStacks operation. This iterable will fetch more data from the
     * server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link com.oracle.bmc.resourcemanager.model.StackSummary} objects
     * contained in responses received from the service.
     */
    public Iterable<com.oracle.bmc.resourcemanager.model.StackSummary> listStacksRecordIterator(
            final ListStacksRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListStacksRequest.Builder, ListStacksRequest, ListStacksResponse,
                com.oracle.bmc.resourcemanager.model.StackSummary>(
                new com.google.common.base.Supplier<ListStacksRequest.Builder>() {
                    @Override
                    public ListStacksRequest.Builder get() {
                        return ListStacksRequest.builder().copy(request);
                    }
                },
                new com.google.common.base.Function<ListStacksResponse, String>() {
                    @Override
                    public String apply(ListStacksResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new com.google.common.base.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListStacksRequest.Builder>,
                        ListStacksRequest>() {
                    @Override
                    public ListStacksRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListStacksRequest.Builder>
                                    input) {
                        if (input.getToken() == null) {
                            return input.getRequestBuilder().build();
                        } else {
                            return input.getRequestBuilder()
                                    .page(input.getToken().orNull())
                                    .build();
                        }
                    }
                },
                new com.google.common.base.Function<ListStacksRequest, ListStacksResponse>() {
                    @Override
                    public ListStacksResponse apply(ListStacksRequest request) {
                        return client.listStacks(request);
                    }
                },
                new com.google.common.base.Function<
                        ListStacksResponse,
                        java.util.List<com.oracle.bmc.resourcemanager.model.StackSummary>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.resourcemanager.model.StackSummary> apply(
                            ListStacksResponse response) {
                        return response.getItems();
                    }
                });
    }
}

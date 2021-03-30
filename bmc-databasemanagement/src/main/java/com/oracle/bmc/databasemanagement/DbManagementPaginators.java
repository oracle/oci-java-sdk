/**
 * Copyright (c) 2016, 2021, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.databasemanagement;

import com.oracle.bmc.databasemanagement.requests.*;
import com.oracle.bmc.databasemanagement.responses.*;

/**
 * Collection of helper methods that can be used to provide an {@link java.lang.Iterable} interface
 * to any list operations of DbManagement where multiple pages of data may be fetched.
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
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20201101")
@lombok.RequiredArgsConstructor
public class DbManagementPaginators {
    private final DbManagement client;

    /**
     * Creates a new iterable which will iterate over the responses received from the listJobExecutions operation. This iterable
     * will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses received from the service.
     */
    public Iterable<ListJobExecutionsResponse> listJobExecutionsResponseIterator(
            final ListJobExecutionsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListJobExecutionsRequest.Builder, ListJobExecutionsRequest,
                ListJobExecutionsResponse>(
                new com.google.common.base.Supplier<ListJobExecutionsRequest.Builder>() {
                    @Override
                    public ListJobExecutionsRequest.Builder get() {
                        return ListJobExecutionsRequest.builder().copy(request);
                    }
                },
                new com.google.common.base.Function<ListJobExecutionsResponse, String>() {
                    @Override
                    public String apply(ListJobExecutionsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new com.google.common.base.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListJobExecutionsRequest.Builder>,
                        ListJobExecutionsRequest>() {
                    @Override
                    public ListJobExecutionsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListJobExecutionsRequest.Builder>
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
                new com.google.common.base.Function<
                        ListJobExecutionsRequest, ListJobExecutionsResponse>() {
                    @Override
                    public ListJobExecutionsResponse apply(ListJobExecutionsRequest request) {
                        return client.listJobExecutions(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link com.oracle.bmc.databasemanagement.model.JobExecutionSummary} objects
     * contained in responses from the listJobExecutions operation. This iterable will fetch more data from the
     * server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link com.oracle.bmc.databasemanagement.model.JobExecutionSummary} objects
     * contained in responses received from the service.
     */
    public Iterable<com.oracle.bmc.databasemanagement.model.JobExecutionSummary>
            listJobExecutionsRecordIterator(final ListJobExecutionsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListJobExecutionsRequest.Builder, ListJobExecutionsRequest,
                ListJobExecutionsResponse,
                com.oracle.bmc.databasemanagement.model.JobExecutionSummary>(
                new com.google.common.base.Supplier<ListJobExecutionsRequest.Builder>() {
                    @Override
                    public ListJobExecutionsRequest.Builder get() {
                        return ListJobExecutionsRequest.builder().copy(request);
                    }
                },
                new com.google.common.base.Function<ListJobExecutionsResponse, String>() {
                    @Override
                    public String apply(ListJobExecutionsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new com.google.common.base.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListJobExecutionsRequest.Builder>,
                        ListJobExecutionsRequest>() {
                    @Override
                    public ListJobExecutionsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListJobExecutionsRequest.Builder>
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
                new com.google.common.base.Function<
                        ListJobExecutionsRequest, ListJobExecutionsResponse>() {
                    @Override
                    public ListJobExecutionsResponse apply(ListJobExecutionsRequest request) {
                        return client.listJobExecutions(request);
                    }
                },
                new com.google.common.base.Function<
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
     * Creates a new iterable which will iterate over the responses received from the listJobRuns operation. This iterable
     * will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses received from the service.
     */
    public Iterable<ListJobRunsResponse> listJobRunsResponseIterator(
            final ListJobRunsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListJobRunsRequest.Builder, ListJobRunsRequest, ListJobRunsResponse>(
                new com.google.common.base.Supplier<ListJobRunsRequest.Builder>() {
                    @Override
                    public ListJobRunsRequest.Builder get() {
                        return ListJobRunsRequest.builder().copy(request);
                    }
                },
                new com.google.common.base.Function<ListJobRunsResponse, String>() {
                    @Override
                    public String apply(ListJobRunsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new com.google.common.base.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListJobRunsRequest.Builder>,
                        ListJobRunsRequest>() {
                    @Override
                    public ListJobRunsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListJobRunsRequest.Builder>
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
                new com.google.common.base.Function<ListJobRunsRequest, ListJobRunsResponse>() {
                    @Override
                    public ListJobRunsResponse apply(ListJobRunsRequest request) {
                        return client.listJobRuns(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link com.oracle.bmc.databasemanagement.model.JobRunSummary} objects
     * contained in responses from the listJobRuns operation. This iterable will fetch more data from the
     * server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link com.oracle.bmc.databasemanagement.model.JobRunSummary} objects
     * contained in responses received from the service.
     */
    public Iterable<com.oracle.bmc.databasemanagement.model.JobRunSummary>
            listJobRunsRecordIterator(final ListJobRunsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListJobRunsRequest.Builder, ListJobRunsRequest, ListJobRunsResponse,
                com.oracle.bmc.databasemanagement.model.JobRunSummary>(
                new com.google.common.base.Supplier<ListJobRunsRequest.Builder>() {
                    @Override
                    public ListJobRunsRequest.Builder get() {
                        return ListJobRunsRequest.builder().copy(request);
                    }
                },
                new com.google.common.base.Function<ListJobRunsResponse, String>() {
                    @Override
                    public String apply(ListJobRunsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new com.google.common.base.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListJobRunsRequest.Builder>,
                        ListJobRunsRequest>() {
                    @Override
                    public ListJobRunsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListJobRunsRequest.Builder>
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
                new com.google.common.base.Function<ListJobRunsRequest, ListJobRunsResponse>() {
                    @Override
                    public ListJobRunsResponse apply(ListJobRunsRequest request) {
                        return client.listJobRuns(request);
                    }
                },
                new com.google.common.base.Function<
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
     * Creates a new iterable which will iterate over the {@link com.oracle.bmc.databasemanagement.model.JobSummary} objects
     * contained in responses from the listJobs operation. This iterable will fetch more data from the
     * server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link com.oracle.bmc.databasemanagement.model.JobSummary} objects
     * contained in responses received from the service.
     */
    public Iterable<com.oracle.bmc.databasemanagement.model.JobSummary> listJobsRecordIterator(
            final ListJobsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListJobsRequest.Builder, ListJobsRequest, ListJobsResponse,
                com.oracle.bmc.databasemanagement.model.JobSummary>(
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
                        java.util.List<com.oracle.bmc.databasemanagement.model.JobSummary>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.databasemanagement.model.JobSummary> apply(
                            ListJobsResponse response) {
                        return response.getJobCollection().getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the listManagedDatabaseGroups operation. This iterable
     * will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses received from the service.
     */
    public Iterable<ListManagedDatabaseGroupsResponse> listManagedDatabaseGroupsResponseIterator(
            final ListManagedDatabaseGroupsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListManagedDatabaseGroupsRequest.Builder, ListManagedDatabaseGroupsRequest,
                ListManagedDatabaseGroupsResponse>(
                new com.google.common.base.Supplier<ListManagedDatabaseGroupsRequest.Builder>() {
                    @Override
                    public ListManagedDatabaseGroupsRequest.Builder get() {
                        return ListManagedDatabaseGroupsRequest.builder().copy(request);
                    }
                },
                new com.google.common.base.Function<ListManagedDatabaseGroupsResponse, String>() {
                    @Override
                    public String apply(ListManagedDatabaseGroupsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new com.google.common.base.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListManagedDatabaseGroupsRequest.Builder>,
                        ListManagedDatabaseGroupsRequest>() {
                    @Override
                    public ListManagedDatabaseGroupsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListManagedDatabaseGroupsRequest.Builder>
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
                new com.google.common.base.Function<
                        ListManagedDatabaseGroupsRequest, ListManagedDatabaseGroupsResponse>() {
                    @Override
                    public ListManagedDatabaseGroupsResponse apply(
                            ListManagedDatabaseGroupsRequest request) {
                        return client.listManagedDatabaseGroups(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link com.oracle.bmc.databasemanagement.model.ManagedDatabaseGroupSummary} objects
     * contained in responses from the listManagedDatabaseGroups operation. This iterable will fetch more data from the
     * server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link com.oracle.bmc.databasemanagement.model.ManagedDatabaseGroupSummary} objects
     * contained in responses received from the service.
     */
    public Iterable<com.oracle.bmc.databasemanagement.model.ManagedDatabaseGroupSummary>
            listManagedDatabaseGroupsRecordIterator(
                    final ListManagedDatabaseGroupsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListManagedDatabaseGroupsRequest.Builder, ListManagedDatabaseGroupsRequest,
                ListManagedDatabaseGroupsResponse,
                com.oracle.bmc.databasemanagement.model.ManagedDatabaseGroupSummary>(
                new com.google.common.base.Supplier<ListManagedDatabaseGroupsRequest.Builder>() {
                    @Override
                    public ListManagedDatabaseGroupsRequest.Builder get() {
                        return ListManagedDatabaseGroupsRequest.builder().copy(request);
                    }
                },
                new com.google.common.base.Function<ListManagedDatabaseGroupsResponse, String>() {
                    @Override
                    public String apply(ListManagedDatabaseGroupsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new com.google.common.base.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListManagedDatabaseGroupsRequest.Builder>,
                        ListManagedDatabaseGroupsRequest>() {
                    @Override
                    public ListManagedDatabaseGroupsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListManagedDatabaseGroupsRequest.Builder>
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
                new com.google.common.base.Function<
                        ListManagedDatabaseGroupsRequest, ListManagedDatabaseGroupsResponse>() {
                    @Override
                    public ListManagedDatabaseGroupsResponse apply(
                            ListManagedDatabaseGroupsRequest request) {
                        return client.listManagedDatabaseGroups(request);
                    }
                },
                new com.google.common.base.Function<
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
     * Creates a new iterable which will iterate over the responses received from the listManagedDatabases operation. This iterable
     * will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses received from the service.
     */
    public Iterable<ListManagedDatabasesResponse> listManagedDatabasesResponseIterator(
            final ListManagedDatabasesRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListManagedDatabasesRequest.Builder, ListManagedDatabasesRequest,
                ListManagedDatabasesResponse>(
                new com.google.common.base.Supplier<ListManagedDatabasesRequest.Builder>() {
                    @Override
                    public ListManagedDatabasesRequest.Builder get() {
                        return ListManagedDatabasesRequest.builder().copy(request);
                    }
                },
                new com.google.common.base.Function<ListManagedDatabasesResponse, String>() {
                    @Override
                    public String apply(ListManagedDatabasesResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new com.google.common.base.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListManagedDatabasesRequest.Builder>,
                        ListManagedDatabasesRequest>() {
                    @Override
                    public ListManagedDatabasesRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListManagedDatabasesRequest.Builder>
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
                new com.google.common.base.Function<
                        ListManagedDatabasesRequest, ListManagedDatabasesResponse>() {
                    @Override
                    public ListManagedDatabasesResponse apply(ListManagedDatabasesRequest request) {
                        return client.listManagedDatabases(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link com.oracle.bmc.databasemanagement.model.ManagedDatabaseSummary} objects
     * contained in responses from the listManagedDatabases operation. This iterable will fetch more data from the
     * server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link com.oracle.bmc.databasemanagement.model.ManagedDatabaseSummary} objects
     * contained in responses received from the service.
     */
    public Iterable<com.oracle.bmc.databasemanagement.model.ManagedDatabaseSummary>
            listManagedDatabasesRecordIterator(final ListManagedDatabasesRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListManagedDatabasesRequest.Builder, ListManagedDatabasesRequest,
                ListManagedDatabasesResponse,
                com.oracle.bmc.databasemanagement.model.ManagedDatabaseSummary>(
                new com.google.common.base.Supplier<ListManagedDatabasesRequest.Builder>() {
                    @Override
                    public ListManagedDatabasesRequest.Builder get() {
                        return ListManagedDatabasesRequest.builder().copy(request);
                    }
                },
                new com.google.common.base.Function<ListManagedDatabasesResponse, String>() {
                    @Override
                    public String apply(ListManagedDatabasesResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new com.google.common.base.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListManagedDatabasesRequest.Builder>,
                        ListManagedDatabasesRequest>() {
                    @Override
                    public ListManagedDatabasesRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListManagedDatabasesRequest.Builder>
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
                new com.google.common.base.Function<
                        ListManagedDatabasesRequest, ListManagedDatabasesResponse>() {
                    @Override
                    public ListManagedDatabasesResponse apply(ListManagedDatabasesRequest request) {
                        return client.listManagedDatabases(request);
                    }
                },
                new com.google.common.base.Function<
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
     * Creates a new iterable which will iterate over the responses received from the listTablespaces operation. This iterable
     * will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses received from the service.
     */
    public Iterable<ListTablespacesResponse> listTablespacesResponseIterator(
            final ListTablespacesRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListTablespacesRequest.Builder, ListTablespacesRequest, ListTablespacesResponse>(
                new com.google.common.base.Supplier<ListTablespacesRequest.Builder>() {
                    @Override
                    public ListTablespacesRequest.Builder get() {
                        return ListTablespacesRequest.builder().copy(request);
                    }
                },
                new com.google.common.base.Function<ListTablespacesResponse, String>() {
                    @Override
                    public String apply(ListTablespacesResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new com.google.common.base.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListTablespacesRequest.Builder>,
                        ListTablespacesRequest>() {
                    @Override
                    public ListTablespacesRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListTablespacesRequest.Builder>
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
                new com.google.common.base.Function<
                        ListTablespacesRequest, ListTablespacesResponse>() {
                    @Override
                    public ListTablespacesResponse apply(ListTablespacesRequest request) {
                        return client.listTablespaces(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link com.oracle.bmc.databasemanagement.model.TablespaceSummary} objects
     * contained in responses from the listTablespaces operation. This iterable will fetch more data from the
     * server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link com.oracle.bmc.databasemanagement.model.TablespaceSummary} objects
     * contained in responses received from the service.
     */
    public Iterable<com.oracle.bmc.databasemanagement.model.TablespaceSummary>
            listTablespacesRecordIterator(final ListTablespacesRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListTablespacesRequest.Builder, ListTablespacesRequest, ListTablespacesResponse,
                com.oracle.bmc.databasemanagement.model.TablespaceSummary>(
                new com.google.common.base.Supplier<ListTablespacesRequest.Builder>() {
                    @Override
                    public ListTablespacesRequest.Builder get() {
                        return ListTablespacesRequest.builder().copy(request);
                    }
                },
                new com.google.common.base.Function<ListTablespacesResponse, String>() {
                    @Override
                    public String apply(ListTablespacesResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new com.google.common.base.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListTablespacesRequest.Builder>,
                        ListTablespacesRequest>() {
                    @Override
                    public ListTablespacesRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListTablespacesRequest.Builder>
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
                new com.google.common.base.Function<
                        ListTablespacesRequest, ListTablespacesResponse>() {
                    @Override
                    public ListTablespacesResponse apply(ListTablespacesRequest request) {
                        return client.listTablespaces(request);
                    }
                },
                new com.google.common.base.Function<
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
}

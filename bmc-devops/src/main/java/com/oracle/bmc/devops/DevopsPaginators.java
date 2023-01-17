/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.devops;

import com.oracle.bmc.devops.requests.*;
import com.oracle.bmc.devops.responses.*;

/**
 * Collection of helper methods that can be used to provide an {@link java.lang.Iterable} interface
 * to any list operations of Devops where multiple pages of data may be fetched.
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
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20210630")
public class DevopsPaginators {
    private final Devops client;

    public DevopsPaginators(Devops client) {
        this.client = client;
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the listAuthors operation. This iterable
     * will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses received from the service.
     */
    public Iterable<ListAuthorsResponse> listAuthorsResponseIterator(
            final ListAuthorsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListAuthorsRequest.Builder, ListAuthorsRequest, ListAuthorsResponse>(
                new java.util.function.Supplier<ListAuthorsRequest.Builder>() {
                    @Override
                    public ListAuthorsRequest.Builder get() {
                        return ListAuthorsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListAuthorsResponse, String>() {
                    @Override
                    public String apply(ListAuthorsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListAuthorsRequest.Builder>,
                        ListAuthorsRequest>() {
                    @Override
                    public ListAuthorsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListAuthorsRequest.Builder>
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
                new java.util.function.Function<ListAuthorsRequest, ListAuthorsResponse>() {
                    @Override
                    public ListAuthorsResponse apply(ListAuthorsRequest request) {
                        return client.listAuthors(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link com.oracle.bmc.devops.model.RepositoryAuthorSummary} objects
     * contained in responses from the listAuthors operation. This iterable will fetch more data from the
     * server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link com.oracle.bmc.devops.model.RepositoryAuthorSummary} objects
     * contained in responses received from the service.
     */
    public Iterable<com.oracle.bmc.devops.model.RepositoryAuthorSummary> listAuthorsRecordIterator(
            final ListAuthorsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListAuthorsRequest.Builder, ListAuthorsRequest, ListAuthorsResponse,
                com.oracle.bmc.devops.model.RepositoryAuthorSummary>(
                new java.util.function.Supplier<ListAuthorsRequest.Builder>() {
                    @Override
                    public ListAuthorsRequest.Builder get() {
                        return ListAuthorsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListAuthorsResponse, String>() {
                    @Override
                    public String apply(ListAuthorsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListAuthorsRequest.Builder>,
                        ListAuthorsRequest>() {
                    @Override
                    public ListAuthorsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListAuthorsRequest.Builder>
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
                new java.util.function.Function<ListAuthorsRequest, ListAuthorsResponse>() {
                    @Override
                    public ListAuthorsResponse apply(ListAuthorsRequest request) {
                        return client.listAuthors(request);
                    }
                },
                new java.util.function.Function<
                        ListAuthorsResponse,
                        java.util.List<com.oracle.bmc.devops.model.RepositoryAuthorSummary>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.devops.model.RepositoryAuthorSummary>
                            apply(ListAuthorsResponse response) {
                        return response.getRepositoryAuthorCollection().getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the listBuildPipelineStages operation. This iterable
     * will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses received from the service.
     */
    public Iterable<ListBuildPipelineStagesResponse> listBuildPipelineStagesResponseIterator(
            final ListBuildPipelineStagesRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListBuildPipelineStagesRequest.Builder, ListBuildPipelineStagesRequest,
                ListBuildPipelineStagesResponse>(
                new java.util.function.Supplier<ListBuildPipelineStagesRequest.Builder>() {
                    @Override
                    public ListBuildPipelineStagesRequest.Builder get() {
                        return ListBuildPipelineStagesRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListBuildPipelineStagesResponse, String>() {
                    @Override
                    public String apply(ListBuildPipelineStagesResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListBuildPipelineStagesRequest.Builder>,
                        ListBuildPipelineStagesRequest>() {
                    @Override
                    public ListBuildPipelineStagesRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListBuildPipelineStagesRequest.Builder>
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
                        ListBuildPipelineStagesRequest, ListBuildPipelineStagesResponse>() {
                    @Override
                    public ListBuildPipelineStagesResponse apply(
                            ListBuildPipelineStagesRequest request) {
                        return client.listBuildPipelineStages(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link com.oracle.bmc.devops.model.BuildPipelineStageSummary} objects
     * contained in responses from the listBuildPipelineStages operation. This iterable will fetch more data from the
     * server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link com.oracle.bmc.devops.model.BuildPipelineStageSummary} objects
     * contained in responses received from the service.
     */
    public Iterable<com.oracle.bmc.devops.model.BuildPipelineStageSummary>
            listBuildPipelineStagesRecordIterator(final ListBuildPipelineStagesRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListBuildPipelineStagesRequest.Builder, ListBuildPipelineStagesRequest,
                ListBuildPipelineStagesResponse,
                com.oracle.bmc.devops.model.BuildPipelineStageSummary>(
                new java.util.function.Supplier<ListBuildPipelineStagesRequest.Builder>() {
                    @Override
                    public ListBuildPipelineStagesRequest.Builder get() {
                        return ListBuildPipelineStagesRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListBuildPipelineStagesResponse, String>() {
                    @Override
                    public String apply(ListBuildPipelineStagesResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListBuildPipelineStagesRequest.Builder>,
                        ListBuildPipelineStagesRequest>() {
                    @Override
                    public ListBuildPipelineStagesRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListBuildPipelineStagesRequest.Builder>
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
                        ListBuildPipelineStagesRequest, ListBuildPipelineStagesResponse>() {
                    @Override
                    public ListBuildPipelineStagesResponse apply(
                            ListBuildPipelineStagesRequest request) {
                        return client.listBuildPipelineStages(request);
                    }
                },
                new java.util.function.Function<
                        ListBuildPipelineStagesResponse,
                        java.util.List<com.oracle.bmc.devops.model.BuildPipelineStageSummary>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.devops.model.BuildPipelineStageSummary>
                            apply(ListBuildPipelineStagesResponse response) {
                        return response.getBuildPipelineStageCollection().getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the listBuildPipelines operation. This iterable
     * will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses received from the service.
     */
    public Iterable<ListBuildPipelinesResponse> listBuildPipelinesResponseIterator(
            final ListBuildPipelinesRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListBuildPipelinesRequest.Builder, ListBuildPipelinesRequest,
                ListBuildPipelinesResponse>(
                new java.util.function.Supplier<ListBuildPipelinesRequest.Builder>() {
                    @Override
                    public ListBuildPipelinesRequest.Builder get() {
                        return ListBuildPipelinesRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListBuildPipelinesResponse, String>() {
                    @Override
                    public String apply(ListBuildPipelinesResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListBuildPipelinesRequest.Builder>,
                        ListBuildPipelinesRequest>() {
                    @Override
                    public ListBuildPipelinesRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListBuildPipelinesRequest.Builder>
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
                        ListBuildPipelinesRequest, ListBuildPipelinesResponse>() {
                    @Override
                    public ListBuildPipelinesResponse apply(ListBuildPipelinesRequest request) {
                        return client.listBuildPipelines(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link com.oracle.bmc.devops.model.BuildPipelineSummary} objects
     * contained in responses from the listBuildPipelines operation. This iterable will fetch more data from the
     * server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link com.oracle.bmc.devops.model.BuildPipelineSummary} objects
     * contained in responses received from the service.
     */
    public Iterable<com.oracle.bmc.devops.model.BuildPipelineSummary>
            listBuildPipelinesRecordIterator(final ListBuildPipelinesRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListBuildPipelinesRequest.Builder, ListBuildPipelinesRequest,
                ListBuildPipelinesResponse, com.oracle.bmc.devops.model.BuildPipelineSummary>(
                new java.util.function.Supplier<ListBuildPipelinesRequest.Builder>() {
                    @Override
                    public ListBuildPipelinesRequest.Builder get() {
                        return ListBuildPipelinesRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListBuildPipelinesResponse, String>() {
                    @Override
                    public String apply(ListBuildPipelinesResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListBuildPipelinesRequest.Builder>,
                        ListBuildPipelinesRequest>() {
                    @Override
                    public ListBuildPipelinesRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListBuildPipelinesRequest.Builder>
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
                        ListBuildPipelinesRequest, ListBuildPipelinesResponse>() {
                    @Override
                    public ListBuildPipelinesResponse apply(ListBuildPipelinesRequest request) {
                        return client.listBuildPipelines(request);
                    }
                },
                new java.util.function.Function<
                        ListBuildPipelinesResponse,
                        java.util.List<com.oracle.bmc.devops.model.BuildPipelineSummary>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.devops.model.BuildPipelineSummary> apply(
                            ListBuildPipelinesResponse response) {
                        return response.getBuildPipelineCollection().getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the listBuildRuns operation. This iterable
     * will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses received from the service.
     */
    public Iterable<ListBuildRunsResponse> listBuildRunsResponseIterator(
            final ListBuildRunsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListBuildRunsRequest.Builder, ListBuildRunsRequest, ListBuildRunsResponse>(
                new java.util.function.Supplier<ListBuildRunsRequest.Builder>() {
                    @Override
                    public ListBuildRunsRequest.Builder get() {
                        return ListBuildRunsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListBuildRunsResponse, String>() {
                    @Override
                    public String apply(ListBuildRunsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListBuildRunsRequest.Builder>,
                        ListBuildRunsRequest>() {
                    @Override
                    public ListBuildRunsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListBuildRunsRequest.Builder>
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
                new java.util.function.Function<ListBuildRunsRequest, ListBuildRunsResponse>() {
                    @Override
                    public ListBuildRunsResponse apply(ListBuildRunsRequest request) {
                        return client.listBuildRuns(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link com.oracle.bmc.devops.model.BuildRunSummary} objects
     * contained in responses from the listBuildRuns operation. This iterable will fetch more data from the
     * server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link com.oracle.bmc.devops.model.BuildRunSummary} objects
     * contained in responses received from the service.
     */
    public Iterable<com.oracle.bmc.devops.model.BuildRunSummary> listBuildRunsRecordIterator(
            final ListBuildRunsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListBuildRunsRequest.Builder, ListBuildRunsRequest, ListBuildRunsResponse,
                com.oracle.bmc.devops.model.BuildRunSummary>(
                new java.util.function.Supplier<ListBuildRunsRequest.Builder>() {
                    @Override
                    public ListBuildRunsRequest.Builder get() {
                        return ListBuildRunsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListBuildRunsResponse, String>() {
                    @Override
                    public String apply(ListBuildRunsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListBuildRunsRequest.Builder>,
                        ListBuildRunsRequest>() {
                    @Override
                    public ListBuildRunsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListBuildRunsRequest.Builder>
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
                new java.util.function.Function<ListBuildRunsRequest, ListBuildRunsResponse>() {
                    @Override
                    public ListBuildRunsResponse apply(ListBuildRunsRequest request) {
                        return client.listBuildRuns(request);
                    }
                },
                new java.util.function.Function<
                        ListBuildRunsResponse,
                        java.util.List<com.oracle.bmc.devops.model.BuildRunSummary>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.devops.model.BuildRunSummary> apply(
                            ListBuildRunsResponse response) {
                        return response.getBuildRunSummaryCollection().getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the listCommitDiffs operation. This iterable
     * will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses received from the service.
     */
    public Iterable<ListCommitDiffsResponse> listCommitDiffsResponseIterator(
            final ListCommitDiffsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListCommitDiffsRequest.Builder, ListCommitDiffsRequest, ListCommitDiffsResponse>(
                new java.util.function.Supplier<ListCommitDiffsRequest.Builder>() {
                    @Override
                    public ListCommitDiffsRequest.Builder get() {
                        return ListCommitDiffsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListCommitDiffsResponse, String>() {
                    @Override
                    public String apply(ListCommitDiffsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListCommitDiffsRequest.Builder>,
                        ListCommitDiffsRequest>() {
                    @Override
                    public ListCommitDiffsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListCommitDiffsRequest.Builder>
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
                new java.util.function.Function<ListCommitDiffsRequest, ListCommitDiffsResponse>() {
                    @Override
                    public ListCommitDiffsResponse apply(ListCommitDiffsRequest request) {
                        return client.listCommitDiffs(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link com.oracle.bmc.devops.model.DiffSummary} objects
     * contained in responses from the listCommitDiffs operation. This iterable will fetch more data from the
     * server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link com.oracle.bmc.devops.model.DiffSummary} objects
     * contained in responses received from the service.
     */
    public Iterable<com.oracle.bmc.devops.model.DiffSummary> listCommitDiffsRecordIterator(
            final ListCommitDiffsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListCommitDiffsRequest.Builder, ListCommitDiffsRequest, ListCommitDiffsResponse,
                com.oracle.bmc.devops.model.DiffSummary>(
                new java.util.function.Supplier<ListCommitDiffsRequest.Builder>() {
                    @Override
                    public ListCommitDiffsRequest.Builder get() {
                        return ListCommitDiffsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListCommitDiffsResponse, String>() {
                    @Override
                    public String apply(ListCommitDiffsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListCommitDiffsRequest.Builder>,
                        ListCommitDiffsRequest>() {
                    @Override
                    public ListCommitDiffsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListCommitDiffsRequest.Builder>
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
                new java.util.function.Function<ListCommitDiffsRequest, ListCommitDiffsResponse>() {
                    @Override
                    public ListCommitDiffsResponse apply(ListCommitDiffsRequest request) {
                        return client.listCommitDiffs(request);
                    }
                },
                new java.util.function.Function<
                        ListCommitDiffsResponse,
                        java.util.List<com.oracle.bmc.devops.model.DiffSummary>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.devops.model.DiffSummary> apply(
                            ListCommitDiffsResponse response) {
                        return response.getDiffCollection().getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the listCommits operation. This iterable
     * will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses received from the service.
     */
    public Iterable<ListCommitsResponse> listCommitsResponseIterator(
            final ListCommitsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListCommitsRequest.Builder, ListCommitsRequest, ListCommitsResponse>(
                new java.util.function.Supplier<ListCommitsRequest.Builder>() {
                    @Override
                    public ListCommitsRequest.Builder get() {
                        return ListCommitsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListCommitsResponse, String>() {
                    @Override
                    public String apply(ListCommitsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListCommitsRequest.Builder>,
                        ListCommitsRequest>() {
                    @Override
                    public ListCommitsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListCommitsRequest.Builder>
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
                new java.util.function.Function<ListCommitsRequest, ListCommitsResponse>() {
                    @Override
                    public ListCommitsResponse apply(ListCommitsRequest request) {
                        return client.listCommits(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link com.oracle.bmc.devops.model.RepositoryCommitSummary} objects
     * contained in responses from the listCommits operation. This iterable will fetch more data from the
     * server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link com.oracle.bmc.devops.model.RepositoryCommitSummary} objects
     * contained in responses received from the service.
     */
    public Iterable<com.oracle.bmc.devops.model.RepositoryCommitSummary> listCommitsRecordIterator(
            final ListCommitsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListCommitsRequest.Builder, ListCommitsRequest, ListCommitsResponse,
                com.oracle.bmc.devops.model.RepositoryCommitSummary>(
                new java.util.function.Supplier<ListCommitsRequest.Builder>() {
                    @Override
                    public ListCommitsRequest.Builder get() {
                        return ListCommitsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListCommitsResponse, String>() {
                    @Override
                    public String apply(ListCommitsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListCommitsRequest.Builder>,
                        ListCommitsRequest>() {
                    @Override
                    public ListCommitsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListCommitsRequest.Builder>
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
                new java.util.function.Function<ListCommitsRequest, ListCommitsResponse>() {
                    @Override
                    public ListCommitsResponse apply(ListCommitsRequest request) {
                        return client.listCommits(request);
                    }
                },
                new java.util.function.Function<
                        ListCommitsResponse,
                        java.util.List<com.oracle.bmc.devops.model.RepositoryCommitSummary>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.devops.model.RepositoryCommitSummary>
                            apply(ListCommitsResponse response) {
                        return response.getRepositoryCommitCollection().getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the listConnections operation. This iterable
     * will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses received from the service.
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
     * Creates a new iterable which will iterate over the {@link com.oracle.bmc.devops.model.ConnectionSummary} objects
     * contained in responses from the listConnections operation. This iterable will fetch more data from the
     * server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link com.oracle.bmc.devops.model.ConnectionSummary} objects
     * contained in responses received from the service.
     */
    public Iterable<com.oracle.bmc.devops.model.ConnectionSummary> listConnectionsRecordIterator(
            final ListConnectionsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListConnectionsRequest.Builder, ListConnectionsRequest, ListConnectionsResponse,
                com.oracle.bmc.devops.model.ConnectionSummary>(
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
                        java.util.List<com.oracle.bmc.devops.model.ConnectionSummary>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.devops.model.ConnectionSummary> apply(
                            ListConnectionsResponse response) {
                        return response.getConnectionCollection().getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the listDeployArtifacts operation. This iterable
     * will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses received from the service.
     */
    public Iterable<ListDeployArtifactsResponse> listDeployArtifactsResponseIterator(
            final ListDeployArtifactsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListDeployArtifactsRequest.Builder, ListDeployArtifactsRequest,
                ListDeployArtifactsResponse>(
                new java.util.function.Supplier<ListDeployArtifactsRequest.Builder>() {
                    @Override
                    public ListDeployArtifactsRequest.Builder get() {
                        return ListDeployArtifactsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListDeployArtifactsResponse, String>() {
                    @Override
                    public String apply(ListDeployArtifactsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListDeployArtifactsRequest.Builder>,
                        ListDeployArtifactsRequest>() {
                    @Override
                    public ListDeployArtifactsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListDeployArtifactsRequest.Builder>
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
                        ListDeployArtifactsRequest, ListDeployArtifactsResponse>() {
                    @Override
                    public ListDeployArtifactsResponse apply(ListDeployArtifactsRequest request) {
                        return client.listDeployArtifacts(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link com.oracle.bmc.devops.model.DeployArtifactSummary} objects
     * contained in responses from the listDeployArtifacts operation. This iterable will fetch more data from the
     * server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link com.oracle.bmc.devops.model.DeployArtifactSummary} objects
     * contained in responses received from the service.
     */
    public Iterable<com.oracle.bmc.devops.model.DeployArtifactSummary>
            listDeployArtifactsRecordIterator(final ListDeployArtifactsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListDeployArtifactsRequest.Builder, ListDeployArtifactsRequest,
                ListDeployArtifactsResponse, com.oracle.bmc.devops.model.DeployArtifactSummary>(
                new java.util.function.Supplier<ListDeployArtifactsRequest.Builder>() {
                    @Override
                    public ListDeployArtifactsRequest.Builder get() {
                        return ListDeployArtifactsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListDeployArtifactsResponse, String>() {
                    @Override
                    public String apply(ListDeployArtifactsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListDeployArtifactsRequest.Builder>,
                        ListDeployArtifactsRequest>() {
                    @Override
                    public ListDeployArtifactsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListDeployArtifactsRequest.Builder>
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
                        ListDeployArtifactsRequest, ListDeployArtifactsResponse>() {
                    @Override
                    public ListDeployArtifactsResponse apply(ListDeployArtifactsRequest request) {
                        return client.listDeployArtifacts(request);
                    }
                },
                new java.util.function.Function<
                        ListDeployArtifactsResponse,
                        java.util.List<com.oracle.bmc.devops.model.DeployArtifactSummary>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.devops.model.DeployArtifactSummary> apply(
                            ListDeployArtifactsResponse response) {
                        return response.getDeployArtifactCollection().getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the listDeployEnvironments operation. This iterable
     * will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses received from the service.
     */
    public Iterable<ListDeployEnvironmentsResponse> listDeployEnvironmentsResponseIterator(
            final ListDeployEnvironmentsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListDeployEnvironmentsRequest.Builder, ListDeployEnvironmentsRequest,
                ListDeployEnvironmentsResponse>(
                new java.util.function.Supplier<ListDeployEnvironmentsRequest.Builder>() {
                    @Override
                    public ListDeployEnvironmentsRequest.Builder get() {
                        return ListDeployEnvironmentsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListDeployEnvironmentsResponse, String>() {
                    @Override
                    public String apply(ListDeployEnvironmentsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListDeployEnvironmentsRequest.Builder>,
                        ListDeployEnvironmentsRequest>() {
                    @Override
                    public ListDeployEnvironmentsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListDeployEnvironmentsRequest.Builder>
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
                        ListDeployEnvironmentsRequest, ListDeployEnvironmentsResponse>() {
                    @Override
                    public ListDeployEnvironmentsResponse apply(
                            ListDeployEnvironmentsRequest request) {
                        return client.listDeployEnvironments(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link com.oracle.bmc.devops.model.DeployEnvironmentSummary} objects
     * contained in responses from the listDeployEnvironments operation. This iterable will fetch more data from the
     * server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link com.oracle.bmc.devops.model.DeployEnvironmentSummary} objects
     * contained in responses received from the service.
     */
    public Iterable<com.oracle.bmc.devops.model.DeployEnvironmentSummary>
            listDeployEnvironmentsRecordIterator(final ListDeployEnvironmentsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListDeployEnvironmentsRequest.Builder, ListDeployEnvironmentsRequest,
                ListDeployEnvironmentsResponse,
                com.oracle.bmc.devops.model.DeployEnvironmentSummary>(
                new java.util.function.Supplier<ListDeployEnvironmentsRequest.Builder>() {
                    @Override
                    public ListDeployEnvironmentsRequest.Builder get() {
                        return ListDeployEnvironmentsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListDeployEnvironmentsResponse, String>() {
                    @Override
                    public String apply(ListDeployEnvironmentsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListDeployEnvironmentsRequest.Builder>,
                        ListDeployEnvironmentsRequest>() {
                    @Override
                    public ListDeployEnvironmentsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListDeployEnvironmentsRequest.Builder>
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
                        ListDeployEnvironmentsRequest, ListDeployEnvironmentsResponse>() {
                    @Override
                    public ListDeployEnvironmentsResponse apply(
                            ListDeployEnvironmentsRequest request) {
                        return client.listDeployEnvironments(request);
                    }
                },
                new java.util.function.Function<
                        ListDeployEnvironmentsResponse,
                        java.util.List<com.oracle.bmc.devops.model.DeployEnvironmentSummary>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.devops.model.DeployEnvironmentSummary>
                            apply(ListDeployEnvironmentsResponse response) {
                        return response.getDeployEnvironmentCollection().getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the listDeployPipelines operation. This iterable
     * will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses received from the service.
     */
    public Iterable<ListDeployPipelinesResponse> listDeployPipelinesResponseIterator(
            final ListDeployPipelinesRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListDeployPipelinesRequest.Builder, ListDeployPipelinesRequest,
                ListDeployPipelinesResponse>(
                new java.util.function.Supplier<ListDeployPipelinesRequest.Builder>() {
                    @Override
                    public ListDeployPipelinesRequest.Builder get() {
                        return ListDeployPipelinesRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListDeployPipelinesResponse, String>() {
                    @Override
                    public String apply(ListDeployPipelinesResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListDeployPipelinesRequest.Builder>,
                        ListDeployPipelinesRequest>() {
                    @Override
                    public ListDeployPipelinesRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListDeployPipelinesRequest.Builder>
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
                        ListDeployPipelinesRequest, ListDeployPipelinesResponse>() {
                    @Override
                    public ListDeployPipelinesResponse apply(ListDeployPipelinesRequest request) {
                        return client.listDeployPipelines(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link com.oracle.bmc.devops.model.DeployPipelineSummary} objects
     * contained in responses from the listDeployPipelines operation. This iterable will fetch more data from the
     * server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link com.oracle.bmc.devops.model.DeployPipelineSummary} objects
     * contained in responses received from the service.
     */
    public Iterable<com.oracle.bmc.devops.model.DeployPipelineSummary>
            listDeployPipelinesRecordIterator(final ListDeployPipelinesRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListDeployPipelinesRequest.Builder, ListDeployPipelinesRequest,
                ListDeployPipelinesResponse, com.oracle.bmc.devops.model.DeployPipelineSummary>(
                new java.util.function.Supplier<ListDeployPipelinesRequest.Builder>() {
                    @Override
                    public ListDeployPipelinesRequest.Builder get() {
                        return ListDeployPipelinesRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListDeployPipelinesResponse, String>() {
                    @Override
                    public String apply(ListDeployPipelinesResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListDeployPipelinesRequest.Builder>,
                        ListDeployPipelinesRequest>() {
                    @Override
                    public ListDeployPipelinesRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListDeployPipelinesRequest.Builder>
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
                        ListDeployPipelinesRequest, ListDeployPipelinesResponse>() {
                    @Override
                    public ListDeployPipelinesResponse apply(ListDeployPipelinesRequest request) {
                        return client.listDeployPipelines(request);
                    }
                },
                new java.util.function.Function<
                        ListDeployPipelinesResponse,
                        java.util.List<com.oracle.bmc.devops.model.DeployPipelineSummary>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.devops.model.DeployPipelineSummary> apply(
                            ListDeployPipelinesResponse response) {
                        return response.getDeployPipelineCollection().getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the listDeployStages operation. This iterable
     * will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses received from the service.
     */
    public Iterable<ListDeployStagesResponse> listDeployStagesResponseIterator(
            final ListDeployStagesRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListDeployStagesRequest.Builder, ListDeployStagesRequest, ListDeployStagesResponse>(
                new java.util.function.Supplier<ListDeployStagesRequest.Builder>() {
                    @Override
                    public ListDeployStagesRequest.Builder get() {
                        return ListDeployStagesRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListDeployStagesResponse, String>() {
                    @Override
                    public String apply(ListDeployStagesResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListDeployStagesRequest.Builder>,
                        ListDeployStagesRequest>() {
                    @Override
                    public ListDeployStagesRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListDeployStagesRequest.Builder>
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
                        ListDeployStagesRequest, ListDeployStagesResponse>() {
                    @Override
                    public ListDeployStagesResponse apply(ListDeployStagesRequest request) {
                        return client.listDeployStages(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link com.oracle.bmc.devops.model.DeployStageSummary} objects
     * contained in responses from the listDeployStages operation. This iterable will fetch more data from the
     * server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link com.oracle.bmc.devops.model.DeployStageSummary} objects
     * contained in responses received from the service.
     */
    public Iterable<com.oracle.bmc.devops.model.DeployStageSummary> listDeployStagesRecordIterator(
            final ListDeployStagesRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListDeployStagesRequest.Builder, ListDeployStagesRequest, ListDeployStagesResponse,
                com.oracle.bmc.devops.model.DeployStageSummary>(
                new java.util.function.Supplier<ListDeployStagesRequest.Builder>() {
                    @Override
                    public ListDeployStagesRequest.Builder get() {
                        return ListDeployStagesRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListDeployStagesResponse, String>() {
                    @Override
                    public String apply(ListDeployStagesResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListDeployStagesRequest.Builder>,
                        ListDeployStagesRequest>() {
                    @Override
                    public ListDeployStagesRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListDeployStagesRequest.Builder>
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
                        ListDeployStagesRequest, ListDeployStagesResponse>() {
                    @Override
                    public ListDeployStagesResponse apply(ListDeployStagesRequest request) {
                        return client.listDeployStages(request);
                    }
                },
                new java.util.function.Function<
                        ListDeployStagesResponse,
                        java.util.List<com.oracle.bmc.devops.model.DeployStageSummary>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.devops.model.DeployStageSummary> apply(
                            ListDeployStagesResponse response) {
                        return response.getDeployStageCollection().getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the listDeployments operation. This iterable
     * will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses received from the service.
     */
    public Iterable<ListDeploymentsResponse> listDeploymentsResponseIterator(
            final ListDeploymentsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListDeploymentsRequest.Builder, ListDeploymentsRequest, ListDeploymentsResponse>(
                new java.util.function.Supplier<ListDeploymentsRequest.Builder>() {
                    @Override
                    public ListDeploymentsRequest.Builder get() {
                        return ListDeploymentsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListDeploymentsResponse, String>() {
                    @Override
                    public String apply(ListDeploymentsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListDeploymentsRequest.Builder>,
                        ListDeploymentsRequest>() {
                    @Override
                    public ListDeploymentsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListDeploymentsRequest.Builder>
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
                new java.util.function.Function<ListDeploymentsRequest, ListDeploymentsResponse>() {
                    @Override
                    public ListDeploymentsResponse apply(ListDeploymentsRequest request) {
                        return client.listDeployments(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link com.oracle.bmc.devops.model.DeploymentSummary} objects
     * contained in responses from the listDeployments operation. This iterable will fetch more data from the
     * server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link com.oracle.bmc.devops.model.DeploymentSummary} objects
     * contained in responses received from the service.
     */
    public Iterable<com.oracle.bmc.devops.model.DeploymentSummary> listDeploymentsRecordIterator(
            final ListDeploymentsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListDeploymentsRequest.Builder, ListDeploymentsRequest, ListDeploymentsResponse,
                com.oracle.bmc.devops.model.DeploymentSummary>(
                new java.util.function.Supplier<ListDeploymentsRequest.Builder>() {
                    @Override
                    public ListDeploymentsRequest.Builder get() {
                        return ListDeploymentsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListDeploymentsResponse, String>() {
                    @Override
                    public String apply(ListDeploymentsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListDeploymentsRequest.Builder>,
                        ListDeploymentsRequest>() {
                    @Override
                    public ListDeploymentsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListDeploymentsRequest.Builder>
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
                new java.util.function.Function<ListDeploymentsRequest, ListDeploymentsResponse>() {
                    @Override
                    public ListDeploymentsResponse apply(ListDeploymentsRequest request) {
                        return client.listDeployments(request);
                    }
                },
                new java.util.function.Function<
                        ListDeploymentsResponse,
                        java.util.List<com.oracle.bmc.devops.model.DeploymentSummary>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.devops.model.DeploymentSummary> apply(
                            ListDeploymentsResponse response) {
                        return response.getDeploymentCollection().getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the listMirrorRecords operation. This iterable
     * will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses received from the service.
     */
    public Iterable<ListMirrorRecordsResponse> listMirrorRecordsResponseIterator(
            final ListMirrorRecordsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListMirrorRecordsRequest.Builder, ListMirrorRecordsRequest,
                ListMirrorRecordsResponse>(
                new java.util.function.Supplier<ListMirrorRecordsRequest.Builder>() {
                    @Override
                    public ListMirrorRecordsRequest.Builder get() {
                        return ListMirrorRecordsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListMirrorRecordsResponse, String>() {
                    @Override
                    public String apply(ListMirrorRecordsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListMirrorRecordsRequest.Builder>,
                        ListMirrorRecordsRequest>() {
                    @Override
                    public ListMirrorRecordsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListMirrorRecordsRequest.Builder>
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
                        ListMirrorRecordsRequest, ListMirrorRecordsResponse>() {
                    @Override
                    public ListMirrorRecordsResponse apply(ListMirrorRecordsRequest request) {
                        return client.listMirrorRecords(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link com.oracle.bmc.devops.model.RepositoryMirrorRecordSummary} objects
     * contained in responses from the listMirrorRecords operation. This iterable will fetch more data from the
     * server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link com.oracle.bmc.devops.model.RepositoryMirrorRecordSummary} objects
     * contained in responses received from the service.
     */
    public Iterable<com.oracle.bmc.devops.model.RepositoryMirrorRecordSummary>
            listMirrorRecordsRecordIterator(final ListMirrorRecordsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListMirrorRecordsRequest.Builder, ListMirrorRecordsRequest,
                ListMirrorRecordsResponse,
                com.oracle.bmc.devops.model.RepositoryMirrorRecordSummary>(
                new java.util.function.Supplier<ListMirrorRecordsRequest.Builder>() {
                    @Override
                    public ListMirrorRecordsRequest.Builder get() {
                        return ListMirrorRecordsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListMirrorRecordsResponse, String>() {
                    @Override
                    public String apply(ListMirrorRecordsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListMirrorRecordsRequest.Builder>,
                        ListMirrorRecordsRequest>() {
                    @Override
                    public ListMirrorRecordsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListMirrorRecordsRequest.Builder>
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
                        ListMirrorRecordsRequest, ListMirrorRecordsResponse>() {
                    @Override
                    public ListMirrorRecordsResponse apply(ListMirrorRecordsRequest request) {
                        return client.listMirrorRecords(request);
                    }
                },
                new java.util.function.Function<
                        ListMirrorRecordsResponse,
                        java.util.List<
                                com.oracle.bmc.devops.model.RepositoryMirrorRecordSummary>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.devops.model.RepositoryMirrorRecordSummary>
                            apply(ListMirrorRecordsResponse response) {
                        return response.getRepositoryMirrorRecordCollection().getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the listPaths operation. This iterable
     * will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses received from the service.
     */
    public Iterable<ListPathsResponse> listPathsResponseIterator(final ListPathsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListPathsRequest.Builder, ListPathsRequest, ListPathsResponse>(
                new java.util.function.Supplier<ListPathsRequest.Builder>() {
                    @Override
                    public ListPathsRequest.Builder get() {
                        return ListPathsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListPathsResponse, String>() {
                    @Override
                    public String apply(ListPathsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListPathsRequest.Builder>,
                        ListPathsRequest>() {
                    @Override
                    public ListPathsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListPathsRequest.Builder>
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
                new java.util.function.Function<ListPathsRequest, ListPathsResponse>() {
                    @Override
                    public ListPathsResponse apply(ListPathsRequest request) {
                        return client.listPaths(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link com.oracle.bmc.devops.model.RepositoryPathSummary} objects
     * contained in responses from the listPaths operation. This iterable will fetch more data from the
     * server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link com.oracle.bmc.devops.model.RepositoryPathSummary} objects
     * contained in responses received from the service.
     */
    public Iterable<com.oracle.bmc.devops.model.RepositoryPathSummary> listPathsRecordIterator(
            final ListPathsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListPathsRequest.Builder, ListPathsRequest, ListPathsResponse,
                com.oracle.bmc.devops.model.RepositoryPathSummary>(
                new java.util.function.Supplier<ListPathsRequest.Builder>() {
                    @Override
                    public ListPathsRequest.Builder get() {
                        return ListPathsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListPathsResponse, String>() {
                    @Override
                    public String apply(ListPathsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListPathsRequest.Builder>,
                        ListPathsRequest>() {
                    @Override
                    public ListPathsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListPathsRequest.Builder>
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
                new java.util.function.Function<ListPathsRequest, ListPathsResponse>() {
                    @Override
                    public ListPathsResponse apply(ListPathsRequest request) {
                        return client.listPaths(request);
                    }
                },
                new java.util.function.Function<
                        ListPathsResponse,
                        java.util.List<com.oracle.bmc.devops.model.RepositoryPathSummary>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.devops.model.RepositoryPathSummary> apply(
                            ListPathsResponse response) {
                        return response.getRepositoryPathCollection().getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the listProjects operation. This iterable
     * will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses received from the service.
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
     * Creates a new iterable which will iterate over the {@link com.oracle.bmc.devops.model.ProjectSummary} objects
     * contained in responses from the listProjects operation. This iterable will fetch more data from the
     * server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link com.oracle.bmc.devops.model.ProjectSummary} objects
     * contained in responses received from the service.
     */
    public Iterable<com.oracle.bmc.devops.model.ProjectSummary> listProjectsRecordIterator(
            final ListProjectsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListProjectsRequest.Builder, ListProjectsRequest, ListProjectsResponse,
                com.oracle.bmc.devops.model.ProjectSummary>(
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
                        java.util.List<com.oracle.bmc.devops.model.ProjectSummary>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.devops.model.ProjectSummary> apply(
                            ListProjectsResponse response) {
                        return response.getProjectCollection().getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the listRefs operation. This iterable
     * will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses received from the service.
     */
    public Iterable<ListRefsResponse> listRefsResponseIterator(final ListRefsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListRefsRequest.Builder, ListRefsRequest, ListRefsResponse>(
                new java.util.function.Supplier<ListRefsRequest.Builder>() {
                    @Override
                    public ListRefsRequest.Builder get() {
                        return ListRefsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListRefsResponse, String>() {
                    @Override
                    public String apply(ListRefsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListRefsRequest.Builder>,
                        ListRefsRequest>() {
                    @Override
                    public ListRefsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListRefsRequest.Builder>
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
                new java.util.function.Function<ListRefsRequest, ListRefsResponse>() {
                    @Override
                    public ListRefsResponse apply(ListRefsRequest request) {
                        return client.listRefs(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link com.oracle.bmc.devops.model.RepositoryRefSummary} objects
     * contained in responses from the listRefs operation. This iterable will fetch more data from the
     * server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link com.oracle.bmc.devops.model.RepositoryRefSummary} objects
     * contained in responses received from the service.
     */
    public Iterable<com.oracle.bmc.devops.model.RepositoryRefSummary> listRefsRecordIterator(
            final ListRefsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListRefsRequest.Builder, ListRefsRequest, ListRefsResponse,
                com.oracle.bmc.devops.model.RepositoryRefSummary>(
                new java.util.function.Supplier<ListRefsRequest.Builder>() {
                    @Override
                    public ListRefsRequest.Builder get() {
                        return ListRefsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListRefsResponse, String>() {
                    @Override
                    public String apply(ListRefsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListRefsRequest.Builder>,
                        ListRefsRequest>() {
                    @Override
                    public ListRefsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListRefsRequest.Builder>
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
                new java.util.function.Function<ListRefsRequest, ListRefsResponse>() {
                    @Override
                    public ListRefsResponse apply(ListRefsRequest request) {
                        return client.listRefs(request);
                    }
                },
                new java.util.function.Function<
                        ListRefsResponse,
                        java.util.List<com.oracle.bmc.devops.model.RepositoryRefSummary>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.devops.model.RepositoryRefSummary> apply(
                            ListRefsResponse response) {
                        return response.getRepositoryRefCollection().getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the listRepositories operation. This iterable
     * will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses received from the service.
     */
    public Iterable<ListRepositoriesResponse> listRepositoriesResponseIterator(
            final ListRepositoriesRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListRepositoriesRequest.Builder, ListRepositoriesRequest, ListRepositoriesResponse>(
                new java.util.function.Supplier<ListRepositoriesRequest.Builder>() {
                    @Override
                    public ListRepositoriesRequest.Builder get() {
                        return ListRepositoriesRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListRepositoriesResponse, String>() {
                    @Override
                    public String apply(ListRepositoriesResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListRepositoriesRequest.Builder>,
                        ListRepositoriesRequest>() {
                    @Override
                    public ListRepositoriesRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListRepositoriesRequest.Builder>
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
                        ListRepositoriesRequest, ListRepositoriesResponse>() {
                    @Override
                    public ListRepositoriesResponse apply(ListRepositoriesRequest request) {
                        return client.listRepositories(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link com.oracle.bmc.devops.model.RepositorySummary} objects
     * contained in responses from the listRepositories operation. This iterable will fetch more data from the
     * server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link com.oracle.bmc.devops.model.RepositorySummary} objects
     * contained in responses received from the service.
     */
    public Iterable<com.oracle.bmc.devops.model.RepositorySummary> listRepositoriesRecordIterator(
            final ListRepositoriesRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListRepositoriesRequest.Builder, ListRepositoriesRequest, ListRepositoriesResponse,
                com.oracle.bmc.devops.model.RepositorySummary>(
                new java.util.function.Supplier<ListRepositoriesRequest.Builder>() {
                    @Override
                    public ListRepositoriesRequest.Builder get() {
                        return ListRepositoriesRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListRepositoriesResponse, String>() {
                    @Override
                    public String apply(ListRepositoriesResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListRepositoriesRequest.Builder>,
                        ListRepositoriesRequest>() {
                    @Override
                    public ListRepositoriesRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListRepositoriesRequest.Builder>
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
                        ListRepositoriesRequest, ListRepositoriesResponse>() {
                    @Override
                    public ListRepositoriesResponse apply(ListRepositoriesRequest request) {
                        return client.listRepositories(request);
                    }
                },
                new java.util.function.Function<
                        ListRepositoriesResponse,
                        java.util.List<com.oracle.bmc.devops.model.RepositorySummary>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.devops.model.RepositorySummary> apply(
                            ListRepositoriesResponse response) {
                        return response.getRepositoryCollection().getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the listTriggers operation. This iterable
     * will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses received from the service.
     */
    public Iterable<ListTriggersResponse> listTriggersResponseIterator(
            final ListTriggersRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListTriggersRequest.Builder, ListTriggersRequest, ListTriggersResponse>(
                new java.util.function.Supplier<ListTriggersRequest.Builder>() {
                    @Override
                    public ListTriggersRequest.Builder get() {
                        return ListTriggersRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListTriggersResponse, String>() {
                    @Override
                    public String apply(ListTriggersResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListTriggersRequest.Builder>,
                        ListTriggersRequest>() {
                    @Override
                    public ListTriggersRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListTriggersRequest.Builder>
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
                new java.util.function.Function<ListTriggersRequest, ListTriggersResponse>() {
                    @Override
                    public ListTriggersResponse apply(ListTriggersRequest request) {
                        return client.listTriggers(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link com.oracle.bmc.devops.model.TriggerSummary} objects
     * contained in responses from the listTriggers operation. This iterable will fetch more data from the
     * server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link com.oracle.bmc.devops.model.TriggerSummary} objects
     * contained in responses received from the service.
     */
    public Iterable<com.oracle.bmc.devops.model.TriggerSummary> listTriggersRecordIterator(
            final ListTriggersRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListTriggersRequest.Builder, ListTriggersRequest, ListTriggersResponse,
                com.oracle.bmc.devops.model.TriggerSummary>(
                new java.util.function.Supplier<ListTriggersRequest.Builder>() {
                    @Override
                    public ListTriggersRequest.Builder get() {
                        return ListTriggersRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListTriggersResponse, String>() {
                    @Override
                    public String apply(ListTriggersResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListTriggersRequest.Builder>,
                        ListTriggersRequest>() {
                    @Override
                    public ListTriggersRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListTriggersRequest.Builder>
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
                new java.util.function.Function<ListTriggersRequest, ListTriggersResponse>() {
                    @Override
                    public ListTriggersResponse apply(ListTriggersRequest request) {
                        return client.listTriggers(request);
                    }
                },
                new java.util.function.Function<
                        ListTriggersResponse,
                        java.util.List<com.oracle.bmc.devops.model.TriggerSummary>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.devops.model.TriggerSummary> apply(
                            ListTriggersResponse response) {
                        return response.getTriggerCollection().getItems();
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
     * Creates a new iterable which will iterate over the {@link com.oracle.bmc.devops.model.WorkRequestError} objects
     * contained in responses from the listWorkRequestErrors operation. This iterable will fetch more data from the
     * server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link com.oracle.bmc.devops.model.WorkRequestError} objects
     * contained in responses received from the service.
     */
    public Iterable<com.oracle.bmc.devops.model.WorkRequestError>
            listWorkRequestErrorsRecordIterator(final ListWorkRequestErrorsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListWorkRequestErrorsRequest.Builder, ListWorkRequestErrorsRequest,
                ListWorkRequestErrorsResponse, com.oracle.bmc.devops.model.WorkRequestError>(
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
                        java.util.List<com.oracle.bmc.devops.model.WorkRequestError>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.devops.model.WorkRequestError> apply(
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
     * Creates a new iterable which will iterate over the {@link com.oracle.bmc.devops.model.WorkRequestLogEntry} objects
     * contained in responses from the listWorkRequestLogs operation. This iterable will fetch more data from the
     * server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link com.oracle.bmc.devops.model.WorkRequestLogEntry} objects
     * contained in responses received from the service.
     */
    public Iterable<com.oracle.bmc.devops.model.WorkRequestLogEntry>
            listWorkRequestLogsRecordIterator(final ListWorkRequestLogsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListWorkRequestLogsRequest.Builder, ListWorkRequestLogsRequest,
                ListWorkRequestLogsResponse, com.oracle.bmc.devops.model.WorkRequestLogEntry>(
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
                        java.util.List<com.oracle.bmc.devops.model.WorkRequestLogEntry>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.devops.model.WorkRequestLogEntry> apply(
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
     * Creates a new iterable which will iterate over the {@link com.oracle.bmc.devops.model.WorkRequestSummary} objects
     * contained in responses from the listWorkRequests operation. This iterable will fetch more data from the
     * server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link com.oracle.bmc.devops.model.WorkRequestSummary} objects
     * contained in responses received from the service.
     */
    public Iterable<com.oracle.bmc.devops.model.WorkRequestSummary> listWorkRequestsRecordIterator(
            final ListWorkRequestsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListWorkRequestsRequest.Builder, ListWorkRequestsRequest, ListWorkRequestsResponse,
                com.oracle.bmc.devops.model.WorkRequestSummary>(
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
                        java.util.List<com.oracle.bmc.devops.model.WorkRequestSummary>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.devops.model.WorkRequestSummary> apply(
                            ListWorkRequestsResponse response) {
                        return response.getWorkRequestCollection().getItems();
                    }
                });
    }
}

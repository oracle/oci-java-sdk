/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.generativeaiagent;

import com.oracle.bmc.generativeaiagent.requests.*;
import com.oracle.bmc.generativeaiagent.responses.*;

/**
 * Collection of helper methods that can be used to provide an {@link java.lang.Iterable} interface
 * to any list operations of GenerativeAiAgent where multiple pages of data may be fetched. Two
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
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20240531")
public class GenerativeAiAgentPaginators {
    private final GenerativeAiAgent client;

    public GenerativeAiAgentPaginators(GenerativeAiAgent client) {
        this.client = client;
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the
     * listAgentEndpoints operation. This iterable will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses
     *     received from the service.
     */
    public Iterable<ListAgentEndpointsResponse> listAgentEndpointsResponseIterator(
            final ListAgentEndpointsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListAgentEndpointsRequest.Builder,
                ListAgentEndpointsRequest,
                ListAgentEndpointsResponse>(
                new java.util.function.Supplier<ListAgentEndpointsRequest.Builder>() {
                    @Override
                    public ListAgentEndpointsRequest.Builder get() {
                        return ListAgentEndpointsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListAgentEndpointsResponse, String>() {
                    @Override
                    public String apply(ListAgentEndpointsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListAgentEndpointsRequest.Builder>,
                        ListAgentEndpointsRequest>() {
                    @Override
                    public ListAgentEndpointsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListAgentEndpointsRequest.Builder>
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
                        ListAgentEndpointsRequest, ListAgentEndpointsResponse>() {
                    @Override
                    public ListAgentEndpointsResponse apply(ListAgentEndpointsRequest request) {
                        return client.listAgentEndpoints(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link
     * com.oracle.bmc.generativeaiagent.model.AgentEndpointSummary} objects contained in responses
     * from the listAgentEndpoints operation. This iterable will fetch more data from the server as
     * needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link
     *     com.oracle.bmc.generativeaiagent.model.AgentEndpointSummary} objects contained in
     *     responses received from the service.
     */
    public Iterable<com.oracle.bmc.generativeaiagent.model.AgentEndpointSummary>
            listAgentEndpointsRecordIterator(final ListAgentEndpointsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListAgentEndpointsRequest.Builder,
                ListAgentEndpointsRequest,
                ListAgentEndpointsResponse,
                com.oracle.bmc.generativeaiagent.model.AgentEndpointSummary>(
                new java.util.function.Supplier<ListAgentEndpointsRequest.Builder>() {
                    @Override
                    public ListAgentEndpointsRequest.Builder get() {
                        return ListAgentEndpointsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListAgentEndpointsResponse, String>() {
                    @Override
                    public String apply(ListAgentEndpointsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListAgentEndpointsRequest.Builder>,
                        ListAgentEndpointsRequest>() {
                    @Override
                    public ListAgentEndpointsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListAgentEndpointsRequest.Builder>
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
                        ListAgentEndpointsRequest, ListAgentEndpointsResponse>() {
                    @Override
                    public ListAgentEndpointsResponse apply(ListAgentEndpointsRequest request) {
                        return client.listAgentEndpoints(request);
                    }
                },
                new java.util.function.Function<
                        ListAgentEndpointsResponse,
                        java.util.List<
                                com.oracle.bmc.generativeaiagent.model.AgentEndpointSummary>>() {
                    @Override
                    public java.util.List<
                                    com.oracle.bmc.generativeaiagent.model.AgentEndpointSummary>
                            apply(ListAgentEndpointsResponse response) {
                        return response.getAgentEndpointCollection().getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the listAgents
     * operation. This iterable will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses
     *     received from the service.
     */
    public Iterable<ListAgentsResponse> listAgentsResponseIterator(
            final ListAgentsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListAgentsRequest.Builder, ListAgentsRequest, ListAgentsResponse>(
                new java.util.function.Supplier<ListAgentsRequest.Builder>() {
                    @Override
                    public ListAgentsRequest.Builder get() {
                        return ListAgentsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListAgentsResponse, String>() {
                    @Override
                    public String apply(ListAgentsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListAgentsRequest.Builder>,
                        ListAgentsRequest>() {
                    @Override
                    public ListAgentsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListAgentsRequest.Builder>
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
                new java.util.function.Function<ListAgentsRequest, ListAgentsResponse>() {
                    @Override
                    public ListAgentsResponse apply(ListAgentsRequest request) {
                        return client.listAgents(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link
     * com.oracle.bmc.generativeaiagent.model.AgentSummary} objects contained in responses from the
     * listAgents operation. This iterable will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link
     *     com.oracle.bmc.generativeaiagent.model.AgentSummary} objects contained in responses
     *     received from the service.
     */
    public Iterable<com.oracle.bmc.generativeaiagent.model.AgentSummary> listAgentsRecordIterator(
            final ListAgentsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListAgentsRequest.Builder,
                ListAgentsRequest,
                ListAgentsResponse,
                com.oracle.bmc.generativeaiagent.model.AgentSummary>(
                new java.util.function.Supplier<ListAgentsRequest.Builder>() {
                    @Override
                    public ListAgentsRequest.Builder get() {
                        return ListAgentsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListAgentsResponse, String>() {
                    @Override
                    public String apply(ListAgentsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListAgentsRequest.Builder>,
                        ListAgentsRequest>() {
                    @Override
                    public ListAgentsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListAgentsRequest.Builder>
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
                new java.util.function.Function<ListAgentsRequest, ListAgentsResponse>() {
                    @Override
                    public ListAgentsResponse apply(ListAgentsRequest request) {
                        return client.listAgents(request);
                    }
                },
                new java.util.function.Function<
                        ListAgentsResponse,
                        java.util.List<com.oracle.bmc.generativeaiagent.model.AgentSummary>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.generativeaiagent.model.AgentSummary>
                            apply(ListAgentsResponse response) {
                        return response.getAgentCollection().getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the
     * listDataIngestionJobs operation. This iterable will fetch more data from the server as
     * needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses
     *     received from the service.
     */
    public Iterable<ListDataIngestionJobsResponse> listDataIngestionJobsResponseIterator(
            final ListDataIngestionJobsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListDataIngestionJobsRequest.Builder,
                ListDataIngestionJobsRequest,
                ListDataIngestionJobsResponse>(
                new java.util.function.Supplier<ListDataIngestionJobsRequest.Builder>() {
                    @Override
                    public ListDataIngestionJobsRequest.Builder get() {
                        return ListDataIngestionJobsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListDataIngestionJobsResponse, String>() {
                    @Override
                    public String apply(ListDataIngestionJobsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListDataIngestionJobsRequest.Builder>,
                        ListDataIngestionJobsRequest>() {
                    @Override
                    public ListDataIngestionJobsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListDataIngestionJobsRequest.Builder>
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
                        ListDataIngestionJobsRequest, ListDataIngestionJobsResponse>() {
                    @Override
                    public ListDataIngestionJobsResponse apply(
                            ListDataIngestionJobsRequest request) {
                        return client.listDataIngestionJobs(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link
     * com.oracle.bmc.generativeaiagent.model.DataIngestionJobSummary} objects contained in
     * responses from the listDataIngestionJobs operation. This iterable will fetch more data from
     * the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link
     *     com.oracle.bmc.generativeaiagent.model.DataIngestionJobSummary} objects contained in
     *     responses received from the service.
     */
    public Iterable<com.oracle.bmc.generativeaiagent.model.DataIngestionJobSummary>
            listDataIngestionJobsRecordIterator(final ListDataIngestionJobsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListDataIngestionJobsRequest.Builder,
                ListDataIngestionJobsRequest,
                ListDataIngestionJobsResponse,
                com.oracle.bmc.generativeaiagent.model.DataIngestionJobSummary>(
                new java.util.function.Supplier<ListDataIngestionJobsRequest.Builder>() {
                    @Override
                    public ListDataIngestionJobsRequest.Builder get() {
                        return ListDataIngestionJobsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListDataIngestionJobsResponse, String>() {
                    @Override
                    public String apply(ListDataIngestionJobsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListDataIngestionJobsRequest.Builder>,
                        ListDataIngestionJobsRequest>() {
                    @Override
                    public ListDataIngestionJobsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListDataIngestionJobsRequest.Builder>
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
                        ListDataIngestionJobsRequest, ListDataIngestionJobsResponse>() {
                    @Override
                    public ListDataIngestionJobsResponse apply(
                            ListDataIngestionJobsRequest request) {
                        return client.listDataIngestionJobs(request);
                    }
                },
                new java.util.function.Function<
                        ListDataIngestionJobsResponse,
                        java.util.List<
                                com.oracle.bmc.generativeaiagent.model.DataIngestionJobSummary>>() {
                    @Override
                    public java.util.List<
                                    com.oracle.bmc.generativeaiagent.model.DataIngestionJobSummary>
                            apply(ListDataIngestionJobsResponse response) {
                        return response.getDataIngestionJobCollection().getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the
     * listDataSources operation. This iterable will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses
     *     received from the service.
     */
    public Iterable<ListDataSourcesResponse> listDataSourcesResponseIterator(
            final ListDataSourcesRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListDataSourcesRequest.Builder, ListDataSourcesRequest, ListDataSourcesResponse>(
                new java.util.function.Supplier<ListDataSourcesRequest.Builder>() {
                    @Override
                    public ListDataSourcesRequest.Builder get() {
                        return ListDataSourcesRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListDataSourcesResponse, String>() {
                    @Override
                    public String apply(ListDataSourcesResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListDataSourcesRequest.Builder>,
                        ListDataSourcesRequest>() {
                    @Override
                    public ListDataSourcesRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListDataSourcesRequest.Builder>
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
                new java.util.function.Function<ListDataSourcesRequest, ListDataSourcesResponse>() {
                    @Override
                    public ListDataSourcesResponse apply(ListDataSourcesRequest request) {
                        return client.listDataSources(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link
     * com.oracle.bmc.generativeaiagent.model.DataSourceSummary} objects contained in responses from
     * the listDataSources operation. This iterable will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link
     *     com.oracle.bmc.generativeaiagent.model.DataSourceSummary} objects contained in responses
     *     received from the service.
     */
    public Iterable<com.oracle.bmc.generativeaiagent.model.DataSourceSummary>
            listDataSourcesRecordIterator(final ListDataSourcesRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListDataSourcesRequest.Builder,
                ListDataSourcesRequest,
                ListDataSourcesResponse,
                com.oracle.bmc.generativeaiagent.model.DataSourceSummary>(
                new java.util.function.Supplier<ListDataSourcesRequest.Builder>() {
                    @Override
                    public ListDataSourcesRequest.Builder get() {
                        return ListDataSourcesRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListDataSourcesResponse, String>() {
                    @Override
                    public String apply(ListDataSourcesResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListDataSourcesRequest.Builder>,
                        ListDataSourcesRequest>() {
                    @Override
                    public ListDataSourcesRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListDataSourcesRequest.Builder>
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
                new java.util.function.Function<ListDataSourcesRequest, ListDataSourcesResponse>() {
                    @Override
                    public ListDataSourcesResponse apply(ListDataSourcesRequest request) {
                        return client.listDataSources(request);
                    }
                },
                new java.util.function.Function<
                        ListDataSourcesResponse,
                        java.util.List<
                                com.oracle.bmc.generativeaiagent.model.DataSourceSummary>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.generativeaiagent.model.DataSourceSummary>
                            apply(ListDataSourcesResponse response) {
                        return response.getDataSourceCollection().getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the
     * listKnowledgeBases operation. This iterable will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses
     *     received from the service.
     */
    public Iterable<ListKnowledgeBasesResponse> listKnowledgeBasesResponseIterator(
            final ListKnowledgeBasesRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListKnowledgeBasesRequest.Builder,
                ListKnowledgeBasesRequest,
                ListKnowledgeBasesResponse>(
                new java.util.function.Supplier<ListKnowledgeBasesRequest.Builder>() {
                    @Override
                    public ListKnowledgeBasesRequest.Builder get() {
                        return ListKnowledgeBasesRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListKnowledgeBasesResponse, String>() {
                    @Override
                    public String apply(ListKnowledgeBasesResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListKnowledgeBasesRequest.Builder>,
                        ListKnowledgeBasesRequest>() {
                    @Override
                    public ListKnowledgeBasesRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListKnowledgeBasesRequest.Builder>
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
                        ListKnowledgeBasesRequest, ListKnowledgeBasesResponse>() {
                    @Override
                    public ListKnowledgeBasesResponse apply(ListKnowledgeBasesRequest request) {
                        return client.listKnowledgeBases(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link
     * com.oracle.bmc.generativeaiagent.model.KnowledgeBaseSummary} objects contained in responses
     * from the listKnowledgeBases operation. This iterable will fetch more data from the server as
     * needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link
     *     com.oracle.bmc.generativeaiagent.model.KnowledgeBaseSummary} objects contained in
     *     responses received from the service.
     */
    public Iterable<com.oracle.bmc.generativeaiagent.model.KnowledgeBaseSummary>
            listKnowledgeBasesRecordIterator(final ListKnowledgeBasesRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListKnowledgeBasesRequest.Builder,
                ListKnowledgeBasesRequest,
                ListKnowledgeBasesResponse,
                com.oracle.bmc.generativeaiagent.model.KnowledgeBaseSummary>(
                new java.util.function.Supplier<ListKnowledgeBasesRequest.Builder>() {
                    @Override
                    public ListKnowledgeBasesRequest.Builder get() {
                        return ListKnowledgeBasesRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListKnowledgeBasesResponse, String>() {
                    @Override
                    public String apply(ListKnowledgeBasesResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListKnowledgeBasesRequest.Builder>,
                        ListKnowledgeBasesRequest>() {
                    @Override
                    public ListKnowledgeBasesRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListKnowledgeBasesRequest.Builder>
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
                        ListKnowledgeBasesRequest, ListKnowledgeBasesResponse>() {
                    @Override
                    public ListKnowledgeBasesResponse apply(ListKnowledgeBasesRequest request) {
                        return client.listKnowledgeBases(request);
                    }
                },
                new java.util.function.Function<
                        ListKnowledgeBasesResponse,
                        java.util.List<
                                com.oracle.bmc.generativeaiagent.model.KnowledgeBaseSummary>>() {
                    @Override
                    public java.util.List<
                                    com.oracle.bmc.generativeaiagent.model.KnowledgeBaseSummary>
                            apply(ListKnowledgeBasesResponse response) {
                        return response.getKnowledgeBaseCollection().getItems();
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
     * com.oracle.bmc.generativeaiagent.model.WorkRequestError} objects contained in responses from
     * the listWorkRequestErrors operation. This iterable will fetch more data from the server as
     * needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link
     *     com.oracle.bmc.generativeaiagent.model.WorkRequestError} objects contained in responses
     *     received from the service.
     */
    public Iterable<com.oracle.bmc.generativeaiagent.model.WorkRequestError>
            listWorkRequestErrorsRecordIterator(final ListWorkRequestErrorsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListWorkRequestErrorsRequest.Builder,
                ListWorkRequestErrorsRequest,
                ListWorkRequestErrorsResponse,
                com.oracle.bmc.generativeaiagent.model.WorkRequestError>(
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
                        java.util.List<com.oracle.bmc.generativeaiagent.model.WorkRequestError>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.generativeaiagent.model.WorkRequestError>
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
     * com.oracle.bmc.generativeaiagent.model.WorkRequestLogEntry} objects contained in responses
     * from the listWorkRequestLogs operation. This iterable will fetch more data from the server as
     * needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link
     *     com.oracle.bmc.generativeaiagent.model.WorkRequestLogEntry} objects contained in
     *     responses received from the service.
     */
    public Iterable<com.oracle.bmc.generativeaiagent.model.WorkRequestLogEntry>
            listWorkRequestLogsRecordIterator(final ListWorkRequestLogsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListWorkRequestLogsRequest.Builder,
                ListWorkRequestLogsRequest,
                ListWorkRequestLogsResponse,
                com.oracle.bmc.generativeaiagent.model.WorkRequestLogEntry>(
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
                                com.oracle.bmc.generativeaiagent.model.WorkRequestLogEntry>>() {
                    @Override
                    public java.util.List<
                                    com.oracle.bmc.generativeaiagent.model.WorkRequestLogEntry>
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
     * com.oracle.bmc.generativeaiagent.model.WorkRequestSummary} objects contained in responses
     * from the listWorkRequests operation. This iterable will fetch more data from the server as
     * needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link
     *     com.oracle.bmc.generativeaiagent.model.WorkRequestSummary} objects contained in responses
     *     received from the service.
     */
    public Iterable<com.oracle.bmc.generativeaiagent.model.WorkRequestSummary>
            listWorkRequestsRecordIterator(final ListWorkRequestsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListWorkRequestsRequest.Builder,
                ListWorkRequestsRequest,
                ListWorkRequestsResponse,
                com.oracle.bmc.generativeaiagent.model.WorkRequestSummary>(
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
                                com.oracle.bmc.generativeaiagent.model.WorkRequestSummary>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.generativeaiagent.model.WorkRequestSummary>
                            apply(ListWorkRequestsResponse response) {
                        return response.getWorkRequestSummaryCollection().getItems();
                    }
                });
    }
}

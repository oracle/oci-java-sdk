/**
 * Copyright (c) 2016, 2021, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.datascience;

import com.oracle.bmc.datascience.requests.*;
import com.oracle.bmc.datascience.responses.*;

/**
 * Collection of helper methods that can be used to provide an {@link java.lang.Iterable} interface
 * to any list operations of DataScience where multiple pages of data may be fetched.
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
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20190101")
@lombok.RequiredArgsConstructor
public class DataSciencePaginators {
    private final DataScience client;

    /**
     * Creates a new iterable which will iterate over the responses received from the listModelDeploymentShapes operation. This iterable
     * will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses received from the service.
     */
    public Iterable<ListModelDeploymentShapesResponse> listModelDeploymentShapesResponseIterator(
            final ListModelDeploymentShapesRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListModelDeploymentShapesRequest.Builder, ListModelDeploymentShapesRequest,
                ListModelDeploymentShapesResponse>(
                new com.google.common.base.Supplier<ListModelDeploymentShapesRequest.Builder>() {
                    @Override
                    public ListModelDeploymentShapesRequest.Builder get() {
                        return ListModelDeploymentShapesRequest.builder().copy(request);
                    }
                },
                new com.google.common.base.Function<ListModelDeploymentShapesResponse, String>() {
                    @Override
                    public String apply(ListModelDeploymentShapesResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new com.google.common.base.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListModelDeploymentShapesRequest.Builder>,
                        ListModelDeploymentShapesRequest>() {
                    @Override
                    public ListModelDeploymentShapesRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListModelDeploymentShapesRequest.Builder>
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
                        ListModelDeploymentShapesRequest, ListModelDeploymentShapesResponse>() {
                    @Override
                    public ListModelDeploymentShapesResponse apply(
                            ListModelDeploymentShapesRequest request) {
                        return client.listModelDeploymentShapes(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link com.oracle.bmc.datascience.model.ModelDeploymentShapeSummary} objects
     * contained in responses from the listModelDeploymentShapes operation. This iterable will fetch more data from the
     * server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link com.oracle.bmc.datascience.model.ModelDeploymentShapeSummary} objects
     * contained in responses received from the service.
     */
    public Iterable<com.oracle.bmc.datascience.model.ModelDeploymentShapeSummary>
            listModelDeploymentShapesRecordIterator(
                    final ListModelDeploymentShapesRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListModelDeploymentShapesRequest.Builder, ListModelDeploymentShapesRequest,
                ListModelDeploymentShapesResponse,
                com.oracle.bmc.datascience.model.ModelDeploymentShapeSummary>(
                new com.google.common.base.Supplier<ListModelDeploymentShapesRequest.Builder>() {
                    @Override
                    public ListModelDeploymentShapesRequest.Builder get() {
                        return ListModelDeploymentShapesRequest.builder().copy(request);
                    }
                },
                new com.google.common.base.Function<ListModelDeploymentShapesResponse, String>() {
                    @Override
                    public String apply(ListModelDeploymentShapesResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new com.google.common.base.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListModelDeploymentShapesRequest.Builder>,
                        ListModelDeploymentShapesRequest>() {
                    @Override
                    public ListModelDeploymentShapesRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListModelDeploymentShapesRequest.Builder>
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
                        ListModelDeploymentShapesRequest, ListModelDeploymentShapesResponse>() {
                    @Override
                    public ListModelDeploymentShapesResponse apply(
                            ListModelDeploymentShapesRequest request) {
                        return client.listModelDeploymentShapes(request);
                    }
                },
                new com.google.common.base.Function<
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
     * Creates a new iterable which will iterate over the responses received from the listModelDeployments operation. This iterable
     * will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses received from the service.
     */
    public Iterable<ListModelDeploymentsResponse> listModelDeploymentsResponseIterator(
            final ListModelDeploymentsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListModelDeploymentsRequest.Builder, ListModelDeploymentsRequest,
                ListModelDeploymentsResponse>(
                new com.google.common.base.Supplier<ListModelDeploymentsRequest.Builder>() {
                    @Override
                    public ListModelDeploymentsRequest.Builder get() {
                        return ListModelDeploymentsRequest.builder().copy(request);
                    }
                },
                new com.google.common.base.Function<ListModelDeploymentsResponse, String>() {
                    @Override
                    public String apply(ListModelDeploymentsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new com.google.common.base.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListModelDeploymentsRequest.Builder>,
                        ListModelDeploymentsRequest>() {
                    @Override
                    public ListModelDeploymentsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListModelDeploymentsRequest.Builder>
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
                        ListModelDeploymentsRequest, ListModelDeploymentsResponse>() {
                    @Override
                    public ListModelDeploymentsResponse apply(ListModelDeploymentsRequest request) {
                        return client.listModelDeployments(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link com.oracle.bmc.datascience.model.ModelDeploymentSummary} objects
     * contained in responses from the listModelDeployments operation. This iterable will fetch more data from the
     * server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link com.oracle.bmc.datascience.model.ModelDeploymentSummary} objects
     * contained in responses received from the service.
     */
    public Iterable<com.oracle.bmc.datascience.model.ModelDeploymentSummary>
            listModelDeploymentsRecordIterator(final ListModelDeploymentsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListModelDeploymentsRequest.Builder, ListModelDeploymentsRequest,
                ListModelDeploymentsResponse,
                com.oracle.bmc.datascience.model.ModelDeploymentSummary>(
                new com.google.common.base.Supplier<ListModelDeploymentsRequest.Builder>() {
                    @Override
                    public ListModelDeploymentsRequest.Builder get() {
                        return ListModelDeploymentsRequest.builder().copy(request);
                    }
                },
                new com.google.common.base.Function<ListModelDeploymentsResponse, String>() {
                    @Override
                    public String apply(ListModelDeploymentsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new com.google.common.base.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListModelDeploymentsRequest.Builder>,
                        ListModelDeploymentsRequest>() {
                    @Override
                    public ListModelDeploymentsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListModelDeploymentsRequest.Builder>
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
                        ListModelDeploymentsRequest, ListModelDeploymentsResponse>() {
                    @Override
                    public ListModelDeploymentsResponse apply(ListModelDeploymentsRequest request) {
                        return client.listModelDeployments(request);
                    }
                },
                new com.google.common.base.Function<
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
     * Creates a new iterable which will iterate over the responses received from the listModels operation. This iterable
     * will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses received from the service.
     */
    public Iterable<ListModelsResponse> listModelsResponseIterator(
            final ListModelsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListModelsRequest.Builder, ListModelsRequest, ListModelsResponse>(
                new com.google.common.base.Supplier<ListModelsRequest.Builder>() {
                    @Override
                    public ListModelsRequest.Builder get() {
                        return ListModelsRequest.builder().copy(request);
                    }
                },
                new com.google.common.base.Function<ListModelsResponse, String>() {
                    @Override
                    public String apply(ListModelsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new com.google.common.base.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListModelsRequest.Builder>,
                        ListModelsRequest>() {
                    @Override
                    public ListModelsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListModelsRequest.Builder>
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
                new com.google.common.base.Function<ListModelsRequest, ListModelsResponse>() {
                    @Override
                    public ListModelsResponse apply(ListModelsRequest request) {
                        return client.listModels(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link com.oracle.bmc.datascience.model.ModelSummary} objects
     * contained in responses from the listModels operation. This iterable will fetch more data from the
     * server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link com.oracle.bmc.datascience.model.ModelSummary} objects
     * contained in responses received from the service.
     */
    public Iterable<com.oracle.bmc.datascience.model.ModelSummary> listModelsRecordIterator(
            final ListModelsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListModelsRequest.Builder, ListModelsRequest, ListModelsResponse,
                com.oracle.bmc.datascience.model.ModelSummary>(
                new com.google.common.base.Supplier<ListModelsRequest.Builder>() {
                    @Override
                    public ListModelsRequest.Builder get() {
                        return ListModelsRequest.builder().copy(request);
                    }
                },
                new com.google.common.base.Function<ListModelsResponse, String>() {
                    @Override
                    public String apply(ListModelsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new com.google.common.base.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListModelsRequest.Builder>,
                        ListModelsRequest>() {
                    @Override
                    public ListModelsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListModelsRequest.Builder>
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
                new com.google.common.base.Function<ListModelsRequest, ListModelsResponse>() {
                    @Override
                    public ListModelsResponse apply(ListModelsRequest request) {
                        return client.listModels(request);
                    }
                },
                new com.google.common.base.Function<
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
     * Creates a new iterable which will iterate over the responses received from the listNotebookSessionShapes operation. This iterable
     * will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses received from the service.
     */
    public Iterable<ListNotebookSessionShapesResponse> listNotebookSessionShapesResponseIterator(
            final ListNotebookSessionShapesRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListNotebookSessionShapesRequest.Builder, ListNotebookSessionShapesRequest,
                ListNotebookSessionShapesResponse>(
                new com.google.common.base.Supplier<ListNotebookSessionShapesRequest.Builder>() {
                    @Override
                    public ListNotebookSessionShapesRequest.Builder get() {
                        return ListNotebookSessionShapesRequest.builder().copy(request);
                    }
                },
                new com.google.common.base.Function<ListNotebookSessionShapesResponse, String>() {
                    @Override
                    public String apply(ListNotebookSessionShapesResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new com.google.common.base.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListNotebookSessionShapesRequest.Builder>,
                        ListNotebookSessionShapesRequest>() {
                    @Override
                    public ListNotebookSessionShapesRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListNotebookSessionShapesRequest.Builder>
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
                        ListNotebookSessionShapesRequest, ListNotebookSessionShapesResponse>() {
                    @Override
                    public ListNotebookSessionShapesResponse apply(
                            ListNotebookSessionShapesRequest request) {
                        return client.listNotebookSessionShapes(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link com.oracle.bmc.datascience.model.NotebookSessionShapeSummary} objects
     * contained in responses from the listNotebookSessionShapes operation. This iterable will fetch more data from the
     * server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link com.oracle.bmc.datascience.model.NotebookSessionShapeSummary} objects
     * contained in responses received from the service.
     */
    public Iterable<com.oracle.bmc.datascience.model.NotebookSessionShapeSummary>
            listNotebookSessionShapesRecordIterator(
                    final ListNotebookSessionShapesRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListNotebookSessionShapesRequest.Builder, ListNotebookSessionShapesRequest,
                ListNotebookSessionShapesResponse,
                com.oracle.bmc.datascience.model.NotebookSessionShapeSummary>(
                new com.google.common.base.Supplier<ListNotebookSessionShapesRequest.Builder>() {
                    @Override
                    public ListNotebookSessionShapesRequest.Builder get() {
                        return ListNotebookSessionShapesRequest.builder().copy(request);
                    }
                },
                new com.google.common.base.Function<ListNotebookSessionShapesResponse, String>() {
                    @Override
                    public String apply(ListNotebookSessionShapesResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new com.google.common.base.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListNotebookSessionShapesRequest.Builder>,
                        ListNotebookSessionShapesRequest>() {
                    @Override
                    public ListNotebookSessionShapesRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListNotebookSessionShapesRequest.Builder>
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
                        ListNotebookSessionShapesRequest, ListNotebookSessionShapesResponse>() {
                    @Override
                    public ListNotebookSessionShapesResponse apply(
                            ListNotebookSessionShapesRequest request) {
                        return client.listNotebookSessionShapes(request);
                    }
                },
                new com.google.common.base.Function<
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
     * Creates a new iterable which will iterate over the responses received from the listNotebookSessions operation. This iterable
     * will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses received from the service.
     */
    public Iterable<ListNotebookSessionsResponse> listNotebookSessionsResponseIterator(
            final ListNotebookSessionsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListNotebookSessionsRequest.Builder, ListNotebookSessionsRequest,
                ListNotebookSessionsResponse>(
                new com.google.common.base.Supplier<ListNotebookSessionsRequest.Builder>() {
                    @Override
                    public ListNotebookSessionsRequest.Builder get() {
                        return ListNotebookSessionsRequest.builder().copy(request);
                    }
                },
                new com.google.common.base.Function<ListNotebookSessionsResponse, String>() {
                    @Override
                    public String apply(ListNotebookSessionsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new com.google.common.base.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListNotebookSessionsRequest.Builder>,
                        ListNotebookSessionsRequest>() {
                    @Override
                    public ListNotebookSessionsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListNotebookSessionsRequest.Builder>
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
                        ListNotebookSessionsRequest, ListNotebookSessionsResponse>() {
                    @Override
                    public ListNotebookSessionsResponse apply(ListNotebookSessionsRequest request) {
                        return client.listNotebookSessions(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link com.oracle.bmc.datascience.model.NotebookSessionSummary} objects
     * contained in responses from the listNotebookSessions operation. This iterable will fetch more data from the
     * server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link com.oracle.bmc.datascience.model.NotebookSessionSummary} objects
     * contained in responses received from the service.
     */
    public Iterable<com.oracle.bmc.datascience.model.NotebookSessionSummary>
            listNotebookSessionsRecordIterator(final ListNotebookSessionsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListNotebookSessionsRequest.Builder, ListNotebookSessionsRequest,
                ListNotebookSessionsResponse,
                com.oracle.bmc.datascience.model.NotebookSessionSummary>(
                new com.google.common.base.Supplier<ListNotebookSessionsRequest.Builder>() {
                    @Override
                    public ListNotebookSessionsRequest.Builder get() {
                        return ListNotebookSessionsRequest.builder().copy(request);
                    }
                },
                new com.google.common.base.Function<ListNotebookSessionsResponse, String>() {
                    @Override
                    public String apply(ListNotebookSessionsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new com.google.common.base.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListNotebookSessionsRequest.Builder>,
                        ListNotebookSessionsRequest>() {
                    @Override
                    public ListNotebookSessionsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListNotebookSessionsRequest.Builder>
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
                        ListNotebookSessionsRequest, ListNotebookSessionsResponse>() {
                    @Override
                    public ListNotebookSessionsResponse apply(ListNotebookSessionsRequest request) {
                        return client.listNotebookSessions(request);
                    }
                },
                new com.google.common.base.Function<
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
                new com.google.common.base.Supplier<ListProjectsRequest.Builder>() {
                    @Override
                    public ListProjectsRequest.Builder get() {
                        return ListProjectsRequest.builder().copy(request);
                    }
                },
                new com.google.common.base.Function<ListProjectsResponse, String>() {
                    @Override
                    public String apply(ListProjectsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new com.google.common.base.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListProjectsRequest.Builder>,
                        ListProjectsRequest>() {
                    @Override
                    public ListProjectsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListProjectsRequest.Builder>
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
                new com.google.common.base.Function<ListProjectsRequest, ListProjectsResponse>() {
                    @Override
                    public ListProjectsResponse apply(ListProjectsRequest request) {
                        return client.listProjects(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link com.oracle.bmc.datascience.model.ProjectSummary} objects
     * contained in responses from the listProjects operation. This iterable will fetch more data from the
     * server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link com.oracle.bmc.datascience.model.ProjectSummary} objects
     * contained in responses received from the service.
     */
    public Iterable<com.oracle.bmc.datascience.model.ProjectSummary> listProjectsRecordIterator(
            final ListProjectsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListProjectsRequest.Builder, ListProjectsRequest, ListProjectsResponse,
                com.oracle.bmc.datascience.model.ProjectSummary>(
                new com.google.common.base.Supplier<ListProjectsRequest.Builder>() {
                    @Override
                    public ListProjectsRequest.Builder get() {
                        return ListProjectsRequest.builder().copy(request);
                    }
                },
                new com.google.common.base.Function<ListProjectsResponse, String>() {
                    @Override
                    public String apply(ListProjectsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new com.google.common.base.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListProjectsRequest.Builder>,
                        ListProjectsRequest>() {
                    @Override
                    public ListProjectsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListProjectsRequest.Builder>
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
                new com.google.common.base.Function<ListProjectsRequest, ListProjectsResponse>() {
                    @Override
                    public ListProjectsResponse apply(ListProjectsRequest request) {
                        return client.listProjects(request);
                    }
                },
                new com.google.common.base.Function<
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
                new com.google.common.base.Supplier<ListWorkRequestsRequest.Builder>() {
                    @Override
                    public ListWorkRequestsRequest.Builder get() {
                        return ListWorkRequestsRequest.builder().copy(request);
                    }
                },
                new com.google.common.base.Function<ListWorkRequestsResponse, String>() {
                    @Override
                    public String apply(ListWorkRequestsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new com.google.common.base.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListWorkRequestsRequest.Builder>,
                        ListWorkRequestsRequest>() {
                    @Override
                    public ListWorkRequestsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListWorkRequestsRequest.Builder>
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
                        ListWorkRequestsRequest, ListWorkRequestsResponse>() {
                    @Override
                    public ListWorkRequestsResponse apply(ListWorkRequestsRequest request) {
                        return client.listWorkRequests(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link com.oracle.bmc.datascience.model.WorkRequestSummary} objects
     * contained in responses from the listWorkRequests operation. This iterable will fetch more data from the
     * server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link com.oracle.bmc.datascience.model.WorkRequestSummary} objects
     * contained in responses received from the service.
     */
    public Iterable<com.oracle.bmc.datascience.model.WorkRequestSummary>
            listWorkRequestsRecordIterator(final ListWorkRequestsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListWorkRequestsRequest.Builder, ListWorkRequestsRequest, ListWorkRequestsResponse,
                com.oracle.bmc.datascience.model.WorkRequestSummary>(
                new com.google.common.base.Supplier<ListWorkRequestsRequest.Builder>() {
                    @Override
                    public ListWorkRequestsRequest.Builder get() {
                        return ListWorkRequestsRequest.builder().copy(request);
                    }
                },
                new com.google.common.base.Function<ListWorkRequestsResponse, String>() {
                    @Override
                    public String apply(ListWorkRequestsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new com.google.common.base.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListWorkRequestsRequest.Builder>,
                        ListWorkRequestsRequest>() {
                    @Override
                    public ListWorkRequestsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListWorkRequestsRequest.Builder>
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
                        ListWorkRequestsRequest, ListWorkRequestsResponse>() {
                    @Override
                    public ListWorkRequestsResponse apply(ListWorkRequestsRequest request) {
                        return client.listWorkRequests(request);
                    }
                },
                new com.google.common.base.Function<
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

/**
 * Copyright (c) 2016, 2021, Oracle and/or its affiliates.  All rights reserved.
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
@lombok.RequiredArgsConstructor
public class DevopsPaginators {
    private final Devops client;

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
                new com.google.common.base.Supplier<ListDeployArtifactsRequest.Builder>() {
                    @Override
                    public ListDeployArtifactsRequest.Builder get() {
                        return ListDeployArtifactsRequest.builder().copy(request);
                    }
                },
                new com.google.common.base.Function<ListDeployArtifactsResponse, String>() {
                    @Override
                    public String apply(ListDeployArtifactsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new com.google.common.base.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListDeployArtifactsRequest.Builder>,
                        ListDeployArtifactsRequest>() {
                    @Override
                    public ListDeployArtifactsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListDeployArtifactsRequest.Builder>
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
                new com.google.common.base.Supplier<ListDeployArtifactsRequest.Builder>() {
                    @Override
                    public ListDeployArtifactsRequest.Builder get() {
                        return ListDeployArtifactsRequest.builder().copy(request);
                    }
                },
                new com.google.common.base.Function<ListDeployArtifactsResponse, String>() {
                    @Override
                    public String apply(ListDeployArtifactsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new com.google.common.base.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListDeployArtifactsRequest.Builder>,
                        ListDeployArtifactsRequest>() {
                    @Override
                    public ListDeployArtifactsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListDeployArtifactsRequest.Builder>
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
                        ListDeployArtifactsRequest, ListDeployArtifactsResponse>() {
                    @Override
                    public ListDeployArtifactsResponse apply(ListDeployArtifactsRequest request) {
                        return client.listDeployArtifacts(request);
                    }
                },
                new com.google.common.base.Function<
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
                new com.google.common.base.Supplier<ListDeployEnvironmentsRequest.Builder>() {
                    @Override
                    public ListDeployEnvironmentsRequest.Builder get() {
                        return ListDeployEnvironmentsRequest.builder().copy(request);
                    }
                },
                new com.google.common.base.Function<ListDeployEnvironmentsResponse, String>() {
                    @Override
                    public String apply(ListDeployEnvironmentsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new com.google.common.base.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListDeployEnvironmentsRequest.Builder>,
                        ListDeployEnvironmentsRequest>() {
                    @Override
                    public ListDeployEnvironmentsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListDeployEnvironmentsRequest.Builder>
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
                new com.google.common.base.Supplier<ListDeployEnvironmentsRequest.Builder>() {
                    @Override
                    public ListDeployEnvironmentsRequest.Builder get() {
                        return ListDeployEnvironmentsRequest.builder().copy(request);
                    }
                },
                new com.google.common.base.Function<ListDeployEnvironmentsResponse, String>() {
                    @Override
                    public String apply(ListDeployEnvironmentsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new com.google.common.base.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListDeployEnvironmentsRequest.Builder>,
                        ListDeployEnvironmentsRequest>() {
                    @Override
                    public ListDeployEnvironmentsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListDeployEnvironmentsRequest.Builder>
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
                        ListDeployEnvironmentsRequest, ListDeployEnvironmentsResponse>() {
                    @Override
                    public ListDeployEnvironmentsResponse apply(
                            ListDeployEnvironmentsRequest request) {
                        return client.listDeployEnvironments(request);
                    }
                },
                new com.google.common.base.Function<
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
                new com.google.common.base.Supplier<ListDeployPipelinesRequest.Builder>() {
                    @Override
                    public ListDeployPipelinesRequest.Builder get() {
                        return ListDeployPipelinesRequest.builder().copy(request);
                    }
                },
                new com.google.common.base.Function<ListDeployPipelinesResponse, String>() {
                    @Override
                    public String apply(ListDeployPipelinesResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new com.google.common.base.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListDeployPipelinesRequest.Builder>,
                        ListDeployPipelinesRequest>() {
                    @Override
                    public ListDeployPipelinesRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListDeployPipelinesRequest.Builder>
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
                new com.google.common.base.Supplier<ListDeployPipelinesRequest.Builder>() {
                    @Override
                    public ListDeployPipelinesRequest.Builder get() {
                        return ListDeployPipelinesRequest.builder().copy(request);
                    }
                },
                new com.google.common.base.Function<ListDeployPipelinesResponse, String>() {
                    @Override
                    public String apply(ListDeployPipelinesResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new com.google.common.base.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListDeployPipelinesRequest.Builder>,
                        ListDeployPipelinesRequest>() {
                    @Override
                    public ListDeployPipelinesRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListDeployPipelinesRequest.Builder>
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
                        ListDeployPipelinesRequest, ListDeployPipelinesResponse>() {
                    @Override
                    public ListDeployPipelinesResponse apply(ListDeployPipelinesRequest request) {
                        return client.listDeployPipelines(request);
                    }
                },
                new com.google.common.base.Function<
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
                new com.google.common.base.Supplier<ListDeployStagesRequest.Builder>() {
                    @Override
                    public ListDeployStagesRequest.Builder get() {
                        return ListDeployStagesRequest.builder().copy(request);
                    }
                },
                new com.google.common.base.Function<ListDeployStagesResponse, String>() {
                    @Override
                    public String apply(ListDeployStagesResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new com.google.common.base.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListDeployStagesRequest.Builder>,
                        ListDeployStagesRequest>() {
                    @Override
                    public ListDeployStagesRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListDeployStagesRequest.Builder>
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
                new com.google.common.base.Supplier<ListDeployStagesRequest.Builder>() {
                    @Override
                    public ListDeployStagesRequest.Builder get() {
                        return ListDeployStagesRequest.builder().copy(request);
                    }
                },
                new com.google.common.base.Function<ListDeployStagesResponse, String>() {
                    @Override
                    public String apply(ListDeployStagesResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new com.google.common.base.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListDeployStagesRequest.Builder>,
                        ListDeployStagesRequest>() {
                    @Override
                    public ListDeployStagesRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListDeployStagesRequest.Builder>
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
                        ListDeployStagesRequest, ListDeployStagesResponse>() {
                    @Override
                    public ListDeployStagesResponse apply(ListDeployStagesRequest request) {
                        return client.listDeployStages(request);
                    }
                },
                new com.google.common.base.Function<
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
                new com.google.common.base.Supplier<ListDeploymentsRequest.Builder>() {
                    @Override
                    public ListDeploymentsRequest.Builder get() {
                        return ListDeploymentsRequest.builder().copy(request);
                    }
                },
                new com.google.common.base.Function<ListDeploymentsResponse, String>() {
                    @Override
                    public String apply(ListDeploymentsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new com.google.common.base.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListDeploymentsRequest.Builder>,
                        ListDeploymentsRequest>() {
                    @Override
                    public ListDeploymentsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListDeploymentsRequest.Builder>
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
                        ListDeploymentsRequest, ListDeploymentsResponse>() {
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
                new com.google.common.base.Supplier<ListDeploymentsRequest.Builder>() {
                    @Override
                    public ListDeploymentsRequest.Builder get() {
                        return ListDeploymentsRequest.builder().copy(request);
                    }
                },
                new com.google.common.base.Function<ListDeploymentsResponse, String>() {
                    @Override
                    public String apply(ListDeploymentsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new com.google.common.base.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListDeploymentsRequest.Builder>,
                        ListDeploymentsRequest>() {
                    @Override
                    public ListDeploymentsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListDeploymentsRequest.Builder>
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
                        ListDeploymentsRequest, ListDeploymentsResponse>() {
                    @Override
                    public ListDeploymentsResponse apply(ListDeploymentsRequest request) {
                        return client.listDeployments(request);
                    }
                },
                new com.google.common.base.Function<
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
                        java.util.List<com.oracle.bmc.devops.model.ProjectSummary>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.devops.model.ProjectSummary> apply(
                            ListProjectsResponse response) {
                        return response.getProjectCollection().getItems();
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
                new com.google.common.base.Supplier<ListWorkRequestErrorsRequest.Builder>() {
                    @Override
                    public ListWorkRequestErrorsRequest.Builder get() {
                        return ListWorkRequestErrorsRequest.builder().copy(request);
                    }
                },
                new com.google.common.base.Function<ListWorkRequestErrorsResponse, String>() {
                    @Override
                    public String apply(ListWorkRequestErrorsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new com.google.common.base.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListWorkRequestErrorsRequest.Builder>,
                        ListWorkRequestErrorsRequest>() {
                    @Override
                    public ListWorkRequestErrorsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListWorkRequestErrorsRequest.Builder>
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
                new com.google.common.base.Supplier<ListWorkRequestErrorsRequest.Builder>() {
                    @Override
                    public ListWorkRequestErrorsRequest.Builder get() {
                        return ListWorkRequestErrorsRequest.builder().copy(request);
                    }
                },
                new com.google.common.base.Function<ListWorkRequestErrorsResponse, String>() {
                    @Override
                    public String apply(ListWorkRequestErrorsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new com.google.common.base.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListWorkRequestErrorsRequest.Builder>,
                        ListWorkRequestErrorsRequest>() {
                    @Override
                    public ListWorkRequestErrorsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListWorkRequestErrorsRequest.Builder>
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
                        ListWorkRequestErrorsRequest, ListWorkRequestErrorsResponse>() {
                    @Override
                    public ListWorkRequestErrorsResponse apply(
                            ListWorkRequestErrorsRequest request) {
                        return client.listWorkRequestErrors(request);
                    }
                },
                new com.google.common.base.Function<
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
                new com.google.common.base.Supplier<ListWorkRequestLogsRequest.Builder>() {
                    @Override
                    public ListWorkRequestLogsRequest.Builder get() {
                        return ListWorkRequestLogsRequest.builder().copy(request);
                    }
                },
                new com.google.common.base.Function<ListWorkRequestLogsResponse, String>() {
                    @Override
                    public String apply(ListWorkRequestLogsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new com.google.common.base.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListWorkRequestLogsRequest.Builder>,
                        ListWorkRequestLogsRequest>() {
                    @Override
                    public ListWorkRequestLogsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListWorkRequestLogsRequest.Builder>
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
                new com.google.common.base.Supplier<ListWorkRequestLogsRequest.Builder>() {
                    @Override
                    public ListWorkRequestLogsRequest.Builder get() {
                        return ListWorkRequestLogsRequest.builder().copy(request);
                    }
                },
                new com.google.common.base.Function<ListWorkRequestLogsResponse, String>() {
                    @Override
                    public String apply(ListWorkRequestLogsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new com.google.common.base.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListWorkRequestLogsRequest.Builder>,
                        ListWorkRequestLogsRequest>() {
                    @Override
                    public ListWorkRequestLogsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListWorkRequestLogsRequest.Builder>
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
                        ListWorkRequestLogsRequest, ListWorkRequestLogsResponse>() {
                    @Override
                    public ListWorkRequestLogsResponse apply(ListWorkRequestLogsRequest request) {
                        return client.listWorkRequestLogs(request);
                    }
                },
                new com.google.common.base.Function<
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
                        java.util.List<com.oracle.bmc.devops.model.WorkRequestSummary>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.devops.model.WorkRequestSummary> apply(
                            ListWorkRequestsResponse response) {
                        return response.getWorkRequestCollection().getItems();
                    }
                });
    }
}

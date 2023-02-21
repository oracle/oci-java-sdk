/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.aianomalydetection;

import com.oracle.bmc.aianomalydetection.requests.*;
import com.oracle.bmc.aianomalydetection.responses.*;

/**
 * Collection of helper methods that can be used to provide an {@link java.lang.Iterable} interface
 * to any list operations of AnomalyDetection where multiple pages of data may be fetched. Two
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
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20210101")
public class AnomalyDetectionPaginators {
    private final AnomalyDetection client;

    public AnomalyDetectionPaginators(AnomalyDetection client) {
        this.client = client;
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the
     * listAiPrivateEndpoints operation. This iterable will fetch more data from the server as
     * needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses
     *     received from the service.
     */
    public Iterable<ListAiPrivateEndpointsResponse> listAiPrivateEndpointsResponseIterator(
            final ListAiPrivateEndpointsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListAiPrivateEndpointsRequest.Builder,
                ListAiPrivateEndpointsRequest,
                ListAiPrivateEndpointsResponse>(
                new java.util.function.Supplier<ListAiPrivateEndpointsRequest.Builder>() {
                    @Override
                    public ListAiPrivateEndpointsRequest.Builder get() {
                        return ListAiPrivateEndpointsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListAiPrivateEndpointsResponse, String>() {
                    @Override
                    public String apply(ListAiPrivateEndpointsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListAiPrivateEndpointsRequest.Builder>,
                        ListAiPrivateEndpointsRequest>() {
                    @Override
                    public ListAiPrivateEndpointsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListAiPrivateEndpointsRequest.Builder>
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
                        ListAiPrivateEndpointsRequest, ListAiPrivateEndpointsResponse>() {
                    @Override
                    public ListAiPrivateEndpointsResponse apply(
                            ListAiPrivateEndpointsRequest request) {
                        return client.listAiPrivateEndpoints(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link
     * com.oracle.bmc.aianomalydetection.model.AiPrivateEndpointSummary} objects contained in
     * responses from the listAiPrivateEndpoints operation. This iterable will fetch more data from
     * the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link
     *     com.oracle.bmc.aianomalydetection.model.AiPrivateEndpointSummary} objects contained in
     *     responses received from the service.
     */
    public Iterable<com.oracle.bmc.aianomalydetection.model.AiPrivateEndpointSummary>
            listAiPrivateEndpointsRecordIterator(final ListAiPrivateEndpointsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListAiPrivateEndpointsRequest.Builder,
                ListAiPrivateEndpointsRequest,
                ListAiPrivateEndpointsResponse,
                com.oracle.bmc.aianomalydetection.model.AiPrivateEndpointSummary>(
                new java.util.function.Supplier<ListAiPrivateEndpointsRequest.Builder>() {
                    @Override
                    public ListAiPrivateEndpointsRequest.Builder get() {
                        return ListAiPrivateEndpointsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListAiPrivateEndpointsResponse, String>() {
                    @Override
                    public String apply(ListAiPrivateEndpointsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListAiPrivateEndpointsRequest.Builder>,
                        ListAiPrivateEndpointsRequest>() {
                    @Override
                    public ListAiPrivateEndpointsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListAiPrivateEndpointsRequest.Builder>
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
                        ListAiPrivateEndpointsRequest, ListAiPrivateEndpointsResponse>() {
                    @Override
                    public ListAiPrivateEndpointsResponse apply(
                            ListAiPrivateEndpointsRequest request) {
                        return client.listAiPrivateEndpoints(request);
                    }
                },
                new java.util.function.Function<
                        ListAiPrivateEndpointsResponse,
                        java.util.List<
                                com.oracle.bmc.aianomalydetection.model
                                        .AiPrivateEndpointSummary>>() {
                    @Override
                    public java.util.List<
                                    com.oracle.bmc.aianomalydetection.model
                                            .AiPrivateEndpointSummary>
                            apply(ListAiPrivateEndpointsResponse response) {
                        return response.getAiPrivateEndpointCollection().getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the listDataAssets
     * operation. This iterable will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses
     *     received from the service.
     */
    public Iterable<ListDataAssetsResponse> listDataAssetsResponseIterator(
            final ListDataAssetsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListDataAssetsRequest.Builder, ListDataAssetsRequest, ListDataAssetsResponse>(
                new java.util.function.Supplier<ListDataAssetsRequest.Builder>() {
                    @Override
                    public ListDataAssetsRequest.Builder get() {
                        return ListDataAssetsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListDataAssetsResponse, String>() {
                    @Override
                    public String apply(ListDataAssetsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListDataAssetsRequest.Builder>,
                        ListDataAssetsRequest>() {
                    @Override
                    public ListDataAssetsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListDataAssetsRequest.Builder>
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
                new java.util.function.Function<ListDataAssetsRequest, ListDataAssetsResponse>() {
                    @Override
                    public ListDataAssetsResponse apply(ListDataAssetsRequest request) {
                        return client.listDataAssets(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link
     * com.oracle.bmc.aianomalydetection.model.DataAssetSummary} objects contained in responses from
     * the listDataAssets operation. This iterable will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link
     *     com.oracle.bmc.aianomalydetection.model.DataAssetSummary} objects contained in responses
     *     received from the service.
     */
    public Iterable<com.oracle.bmc.aianomalydetection.model.DataAssetSummary>
            listDataAssetsRecordIterator(final ListDataAssetsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListDataAssetsRequest.Builder,
                ListDataAssetsRequest,
                ListDataAssetsResponse,
                com.oracle.bmc.aianomalydetection.model.DataAssetSummary>(
                new java.util.function.Supplier<ListDataAssetsRequest.Builder>() {
                    @Override
                    public ListDataAssetsRequest.Builder get() {
                        return ListDataAssetsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListDataAssetsResponse, String>() {
                    @Override
                    public String apply(ListDataAssetsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListDataAssetsRequest.Builder>,
                        ListDataAssetsRequest>() {
                    @Override
                    public ListDataAssetsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListDataAssetsRequest.Builder>
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
                new java.util.function.Function<ListDataAssetsRequest, ListDataAssetsResponse>() {
                    @Override
                    public ListDataAssetsResponse apply(ListDataAssetsRequest request) {
                        return client.listDataAssets(request);
                    }
                },
                new java.util.function.Function<
                        ListDataAssetsResponse,
                        java.util.List<
                                com.oracle.bmc.aianomalydetection.model.DataAssetSummary>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.aianomalydetection.model.DataAssetSummary>
                            apply(ListDataAssetsResponse response) {
                        return response.getDataAssetCollection().getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the
     * listDetectAnomalyJobs operation. This iterable will fetch more data from the server as
     * needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses
     *     received from the service.
     */
    public Iterable<ListDetectAnomalyJobsResponse> listDetectAnomalyJobsResponseIterator(
            final ListDetectAnomalyJobsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListDetectAnomalyJobsRequest.Builder,
                ListDetectAnomalyJobsRequest,
                ListDetectAnomalyJobsResponse>(
                new java.util.function.Supplier<ListDetectAnomalyJobsRequest.Builder>() {
                    @Override
                    public ListDetectAnomalyJobsRequest.Builder get() {
                        return ListDetectAnomalyJobsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListDetectAnomalyJobsResponse, String>() {
                    @Override
                    public String apply(ListDetectAnomalyJobsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListDetectAnomalyJobsRequest.Builder>,
                        ListDetectAnomalyJobsRequest>() {
                    @Override
                    public ListDetectAnomalyJobsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListDetectAnomalyJobsRequest.Builder>
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
                        ListDetectAnomalyJobsRequest, ListDetectAnomalyJobsResponse>() {
                    @Override
                    public ListDetectAnomalyJobsResponse apply(
                            ListDetectAnomalyJobsRequest request) {
                        return client.listDetectAnomalyJobs(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link
     * com.oracle.bmc.aianomalydetection.model.DetectAnomalyJobSummary} objects contained in
     * responses from the listDetectAnomalyJobs operation. This iterable will fetch more data from
     * the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link
     *     com.oracle.bmc.aianomalydetection.model.DetectAnomalyJobSummary} objects contained in
     *     responses received from the service.
     */
    public Iterable<com.oracle.bmc.aianomalydetection.model.DetectAnomalyJobSummary>
            listDetectAnomalyJobsRecordIterator(final ListDetectAnomalyJobsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListDetectAnomalyJobsRequest.Builder,
                ListDetectAnomalyJobsRequest,
                ListDetectAnomalyJobsResponse,
                com.oracle.bmc.aianomalydetection.model.DetectAnomalyJobSummary>(
                new java.util.function.Supplier<ListDetectAnomalyJobsRequest.Builder>() {
                    @Override
                    public ListDetectAnomalyJobsRequest.Builder get() {
                        return ListDetectAnomalyJobsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListDetectAnomalyJobsResponse, String>() {
                    @Override
                    public String apply(ListDetectAnomalyJobsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListDetectAnomalyJobsRequest.Builder>,
                        ListDetectAnomalyJobsRequest>() {
                    @Override
                    public ListDetectAnomalyJobsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListDetectAnomalyJobsRequest.Builder>
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
                        ListDetectAnomalyJobsRequest, ListDetectAnomalyJobsResponse>() {
                    @Override
                    public ListDetectAnomalyJobsResponse apply(
                            ListDetectAnomalyJobsRequest request) {
                        return client.listDetectAnomalyJobs(request);
                    }
                },
                new java.util.function.Function<
                        ListDetectAnomalyJobsResponse,
                        java.util.List<
                                com.oracle.bmc.aianomalydetection.model
                                        .DetectAnomalyJobSummary>>() {
                    @Override
                    public java.util.List<
                                    com.oracle.bmc.aianomalydetection.model.DetectAnomalyJobSummary>
                            apply(ListDetectAnomalyJobsResponse response) {
                        return response.getDetectAnomalyJobCollection().getItems();
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
     * com.oracle.bmc.aianomalydetection.model.ModelSummary} objects contained in responses from the
     * listModels operation. This iterable will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link
     *     com.oracle.bmc.aianomalydetection.model.ModelSummary} objects contained in responses
     *     received from the service.
     */
    public Iterable<com.oracle.bmc.aianomalydetection.model.ModelSummary> listModelsRecordIterator(
            final ListModelsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListModelsRequest.Builder,
                ListModelsRequest,
                ListModelsResponse,
                com.oracle.bmc.aianomalydetection.model.ModelSummary>(
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
                        java.util.List<com.oracle.bmc.aianomalydetection.model.ModelSummary>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.aianomalydetection.model.ModelSummary>
                            apply(ListModelsResponse response) {
                        return response.getModelCollection().getItems();
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
     * com.oracle.bmc.aianomalydetection.model.ProjectSummary} objects contained in responses from
     * the listProjects operation. This iterable will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link
     *     com.oracle.bmc.aianomalydetection.model.ProjectSummary} objects contained in responses
     *     received from the service.
     */
    public Iterable<com.oracle.bmc.aianomalydetection.model.ProjectSummary>
            listProjectsRecordIterator(final ListProjectsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListProjectsRequest.Builder,
                ListProjectsRequest,
                ListProjectsResponse,
                com.oracle.bmc.aianomalydetection.model.ProjectSummary>(
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
                        java.util.List<com.oracle.bmc.aianomalydetection.model.ProjectSummary>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.aianomalydetection.model.ProjectSummary>
                            apply(ListProjectsResponse response) {
                        return response.getProjectCollection().getItems();
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
     * com.oracle.bmc.aianomalydetection.model.WorkRequestError} objects contained in responses from
     * the listWorkRequestErrors operation. This iterable will fetch more data from the server as
     * needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link
     *     com.oracle.bmc.aianomalydetection.model.WorkRequestError} objects contained in responses
     *     received from the service.
     */
    public Iterable<com.oracle.bmc.aianomalydetection.model.WorkRequestError>
            listWorkRequestErrorsRecordIterator(final ListWorkRequestErrorsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListWorkRequestErrorsRequest.Builder,
                ListWorkRequestErrorsRequest,
                ListWorkRequestErrorsResponse,
                com.oracle.bmc.aianomalydetection.model.WorkRequestError>(
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
                                com.oracle.bmc.aianomalydetection.model.WorkRequestError>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.aianomalydetection.model.WorkRequestError>
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
     * com.oracle.bmc.aianomalydetection.model.WorkRequestLogEntry} objects contained in responses
     * from the listWorkRequestLogs operation. This iterable will fetch more data from the server as
     * needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link
     *     com.oracle.bmc.aianomalydetection.model.WorkRequestLogEntry} objects contained in
     *     responses received from the service.
     */
    public Iterable<com.oracle.bmc.aianomalydetection.model.WorkRequestLogEntry>
            listWorkRequestLogsRecordIterator(final ListWorkRequestLogsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListWorkRequestLogsRequest.Builder,
                ListWorkRequestLogsRequest,
                ListWorkRequestLogsResponse,
                com.oracle.bmc.aianomalydetection.model.WorkRequestLogEntry>(
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
                                com.oracle.bmc.aianomalydetection.model.WorkRequestLogEntry>>() {
                    @Override
                    public java.util.List<
                                    com.oracle.bmc.aianomalydetection.model.WorkRequestLogEntry>
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
     * com.oracle.bmc.aianomalydetection.model.WorkRequestSummary} objects contained in responses
     * from the listWorkRequests operation. This iterable will fetch more data from the server as
     * needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link
     *     com.oracle.bmc.aianomalydetection.model.WorkRequestSummary} objects contained in
     *     responses received from the service.
     */
    public Iterable<com.oracle.bmc.aianomalydetection.model.WorkRequestSummary>
            listWorkRequestsRecordIterator(final ListWorkRequestsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListWorkRequestsRequest.Builder,
                ListWorkRequestsRequest,
                ListWorkRequestsResponse,
                com.oracle.bmc.aianomalydetection.model.WorkRequestSummary>(
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
                                com.oracle.bmc.aianomalydetection.model.WorkRequestSummary>>() {
                    @Override
                    public java.util.List<
                                    com.oracle.bmc.aianomalydetection.model.WorkRequestSummary>
                            apply(ListWorkRequestsResponse response) {
                        return response.getWorkRequestSummaryCollection().getItems();
                    }
                });
    }
}

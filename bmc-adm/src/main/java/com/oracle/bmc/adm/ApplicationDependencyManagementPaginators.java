/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.adm;

import com.oracle.bmc.adm.requests.*;
import com.oracle.bmc.adm.responses.*;

/**
 * Collection of helper methods that can be used to provide an {@link java.lang.Iterable} interface
 * to any list operations of ApplicationDependencyManagement where multiple pages of data may be fetched.
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
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20220421")
public class ApplicationDependencyManagementPaginators {
    private final ApplicationDependencyManagement client;

    public ApplicationDependencyManagementPaginators(ApplicationDependencyManagement client) {
        this.client = client;
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the listApplicationDependencyRecommendations operation. This iterable
     * will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses received from the service.
     */
    public Iterable<ListApplicationDependencyRecommendationsResponse>
            listApplicationDependencyRecommendationsResponseIterator(
                    final ListApplicationDependencyRecommendationsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListApplicationDependencyRecommendationsRequest.Builder,
                ListApplicationDependencyRecommendationsRequest,
                ListApplicationDependencyRecommendationsResponse>(
                new java.util.function.Supplier<
                        ListApplicationDependencyRecommendationsRequest.Builder>() {
                    @Override
                    public ListApplicationDependencyRecommendationsRequest.Builder get() {
                        return ListApplicationDependencyRecommendationsRequest.builder()
                                .copy(request);
                    }
                },
                new java.util.function.Function<
                        ListApplicationDependencyRecommendationsResponse, String>() {
                    @Override
                    public String apply(ListApplicationDependencyRecommendationsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListApplicationDependencyRecommendationsRequest.Builder>,
                        ListApplicationDependencyRecommendationsRequest>() {
                    @Override
                    public ListApplicationDependencyRecommendationsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListApplicationDependencyRecommendationsRequest.Builder>
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
                        ListApplicationDependencyRecommendationsRequest,
                        ListApplicationDependencyRecommendationsResponse>() {
                    @Override
                    public ListApplicationDependencyRecommendationsResponse apply(
                            ListApplicationDependencyRecommendationsRequest request) {
                        return client.listApplicationDependencyRecommendations(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link com.oracle.bmc.adm.model.ApplicationDependencyRecommendationSummary} objects
     * contained in responses from the listApplicationDependencyRecommendations operation. This iterable will fetch more data from the
     * server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link com.oracle.bmc.adm.model.ApplicationDependencyRecommendationSummary} objects
     * contained in responses received from the service.
     */
    public Iterable<com.oracle.bmc.adm.model.ApplicationDependencyRecommendationSummary>
            listApplicationDependencyRecommendationsRecordIterator(
                    final ListApplicationDependencyRecommendationsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListApplicationDependencyRecommendationsRequest.Builder,
                ListApplicationDependencyRecommendationsRequest,
                ListApplicationDependencyRecommendationsResponse,
                com.oracle.bmc.adm.model.ApplicationDependencyRecommendationSummary>(
                new java.util.function.Supplier<
                        ListApplicationDependencyRecommendationsRequest.Builder>() {
                    @Override
                    public ListApplicationDependencyRecommendationsRequest.Builder get() {
                        return ListApplicationDependencyRecommendationsRequest.builder()
                                .copy(request);
                    }
                },
                new java.util.function.Function<
                        ListApplicationDependencyRecommendationsResponse, String>() {
                    @Override
                    public String apply(ListApplicationDependencyRecommendationsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListApplicationDependencyRecommendationsRequest.Builder>,
                        ListApplicationDependencyRecommendationsRequest>() {
                    @Override
                    public ListApplicationDependencyRecommendationsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListApplicationDependencyRecommendationsRequest.Builder>
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
                        ListApplicationDependencyRecommendationsRequest,
                        ListApplicationDependencyRecommendationsResponse>() {
                    @Override
                    public ListApplicationDependencyRecommendationsResponse apply(
                            ListApplicationDependencyRecommendationsRequest request) {
                        return client.listApplicationDependencyRecommendations(request);
                    }
                },
                new java.util.function.Function<
                        ListApplicationDependencyRecommendationsResponse,
                        java.util.List<
                                com.oracle.bmc.adm.model
                                        .ApplicationDependencyRecommendationSummary>>() {
                    @Override
                    public java.util.List<
                                    com.oracle.bmc.adm.model
                                            .ApplicationDependencyRecommendationSummary>
                            apply(ListApplicationDependencyRecommendationsResponse response) {
                        return response.getApplicationDependencyRecommendationCollection()
                                .getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the listApplicationDependencyVulnerabilities operation. This iterable
     * will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses received from the service.
     */
    public Iterable<ListApplicationDependencyVulnerabilitiesResponse>
            listApplicationDependencyVulnerabilitiesResponseIterator(
                    final ListApplicationDependencyVulnerabilitiesRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListApplicationDependencyVulnerabilitiesRequest.Builder,
                ListApplicationDependencyVulnerabilitiesRequest,
                ListApplicationDependencyVulnerabilitiesResponse>(
                new java.util.function.Supplier<
                        ListApplicationDependencyVulnerabilitiesRequest.Builder>() {
                    @Override
                    public ListApplicationDependencyVulnerabilitiesRequest.Builder get() {
                        return ListApplicationDependencyVulnerabilitiesRequest.builder()
                                .copy(request);
                    }
                },
                new java.util.function.Function<
                        ListApplicationDependencyVulnerabilitiesResponse, String>() {
                    @Override
                    public String apply(ListApplicationDependencyVulnerabilitiesResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListApplicationDependencyVulnerabilitiesRequest.Builder>,
                        ListApplicationDependencyVulnerabilitiesRequest>() {
                    @Override
                    public ListApplicationDependencyVulnerabilitiesRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListApplicationDependencyVulnerabilitiesRequest.Builder>
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
                        ListApplicationDependencyVulnerabilitiesRequest,
                        ListApplicationDependencyVulnerabilitiesResponse>() {
                    @Override
                    public ListApplicationDependencyVulnerabilitiesResponse apply(
                            ListApplicationDependencyVulnerabilitiesRequest request) {
                        return client.listApplicationDependencyVulnerabilities(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link com.oracle.bmc.adm.model.ApplicationDependencyVulnerabilitySummary} objects
     * contained in responses from the listApplicationDependencyVulnerabilities operation. This iterable will fetch more data from the
     * server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link com.oracle.bmc.adm.model.ApplicationDependencyVulnerabilitySummary} objects
     * contained in responses received from the service.
     */
    public Iterable<com.oracle.bmc.adm.model.ApplicationDependencyVulnerabilitySummary>
            listApplicationDependencyVulnerabilitiesRecordIterator(
                    final ListApplicationDependencyVulnerabilitiesRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListApplicationDependencyVulnerabilitiesRequest.Builder,
                ListApplicationDependencyVulnerabilitiesRequest,
                ListApplicationDependencyVulnerabilitiesResponse,
                com.oracle.bmc.adm.model.ApplicationDependencyVulnerabilitySummary>(
                new java.util.function.Supplier<
                        ListApplicationDependencyVulnerabilitiesRequest.Builder>() {
                    @Override
                    public ListApplicationDependencyVulnerabilitiesRequest.Builder get() {
                        return ListApplicationDependencyVulnerabilitiesRequest.builder()
                                .copy(request);
                    }
                },
                new java.util.function.Function<
                        ListApplicationDependencyVulnerabilitiesResponse, String>() {
                    @Override
                    public String apply(ListApplicationDependencyVulnerabilitiesResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListApplicationDependencyVulnerabilitiesRequest.Builder>,
                        ListApplicationDependencyVulnerabilitiesRequest>() {
                    @Override
                    public ListApplicationDependencyVulnerabilitiesRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListApplicationDependencyVulnerabilitiesRequest.Builder>
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
                        ListApplicationDependencyVulnerabilitiesRequest,
                        ListApplicationDependencyVulnerabilitiesResponse>() {
                    @Override
                    public ListApplicationDependencyVulnerabilitiesResponse apply(
                            ListApplicationDependencyVulnerabilitiesRequest request) {
                        return client.listApplicationDependencyVulnerabilities(request);
                    }
                },
                new java.util.function.Function<
                        ListApplicationDependencyVulnerabilitiesResponse,
                        java.util.List<
                                com.oracle.bmc.adm.model
                                        .ApplicationDependencyVulnerabilitySummary>>() {
                    @Override
                    public java.util.List<
                                    com.oracle.bmc.adm.model
                                            .ApplicationDependencyVulnerabilitySummary>
                            apply(ListApplicationDependencyVulnerabilitiesResponse response) {
                        return response.getApplicationDependencyVulnerabilityCollection()
                                .getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the listKnowledgeBases operation. This iterable
     * will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses received from the service.
     */
    public Iterable<ListKnowledgeBasesResponse> listKnowledgeBasesResponseIterator(
            final ListKnowledgeBasesRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListKnowledgeBasesRequest.Builder, ListKnowledgeBasesRequest,
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
     * Creates a new iterable which will iterate over the {@link com.oracle.bmc.adm.model.KnowledgeBaseSummary} objects
     * contained in responses from the listKnowledgeBases operation. This iterable will fetch more data from the
     * server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link com.oracle.bmc.adm.model.KnowledgeBaseSummary} objects
     * contained in responses received from the service.
     */
    public Iterable<com.oracle.bmc.adm.model.KnowledgeBaseSummary> listKnowledgeBasesRecordIterator(
            final ListKnowledgeBasesRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListKnowledgeBasesRequest.Builder, ListKnowledgeBasesRequest,
                ListKnowledgeBasesResponse, com.oracle.bmc.adm.model.KnowledgeBaseSummary>(
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
                        java.util.List<com.oracle.bmc.adm.model.KnowledgeBaseSummary>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.adm.model.KnowledgeBaseSummary> apply(
                            ListKnowledgeBasesResponse response) {
                        return response.getKnowledgeBaseCollection().getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the listRemediationRecipes operation. This iterable
     * will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses received from the service.
     */
    public Iterable<ListRemediationRecipesResponse> listRemediationRecipesResponseIterator(
            final ListRemediationRecipesRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListRemediationRecipesRequest.Builder, ListRemediationRecipesRequest,
                ListRemediationRecipesResponse>(
                new java.util.function.Supplier<ListRemediationRecipesRequest.Builder>() {
                    @Override
                    public ListRemediationRecipesRequest.Builder get() {
                        return ListRemediationRecipesRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListRemediationRecipesResponse, String>() {
                    @Override
                    public String apply(ListRemediationRecipesResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListRemediationRecipesRequest.Builder>,
                        ListRemediationRecipesRequest>() {
                    @Override
                    public ListRemediationRecipesRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListRemediationRecipesRequest.Builder>
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
                        ListRemediationRecipesRequest, ListRemediationRecipesResponse>() {
                    @Override
                    public ListRemediationRecipesResponse apply(
                            ListRemediationRecipesRequest request) {
                        return client.listRemediationRecipes(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link com.oracle.bmc.adm.model.RemediationRecipeSummary} objects
     * contained in responses from the listRemediationRecipes operation. This iterable will fetch more data from the
     * server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link com.oracle.bmc.adm.model.RemediationRecipeSummary} objects
     * contained in responses received from the service.
     */
    public Iterable<com.oracle.bmc.adm.model.RemediationRecipeSummary>
            listRemediationRecipesRecordIterator(final ListRemediationRecipesRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListRemediationRecipesRequest.Builder, ListRemediationRecipesRequest,
                ListRemediationRecipesResponse, com.oracle.bmc.adm.model.RemediationRecipeSummary>(
                new java.util.function.Supplier<ListRemediationRecipesRequest.Builder>() {
                    @Override
                    public ListRemediationRecipesRequest.Builder get() {
                        return ListRemediationRecipesRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListRemediationRecipesResponse, String>() {
                    @Override
                    public String apply(ListRemediationRecipesResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListRemediationRecipesRequest.Builder>,
                        ListRemediationRecipesRequest>() {
                    @Override
                    public ListRemediationRecipesRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListRemediationRecipesRequest.Builder>
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
                        ListRemediationRecipesRequest, ListRemediationRecipesResponse>() {
                    @Override
                    public ListRemediationRecipesResponse apply(
                            ListRemediationRecipesRequest request) {
                        return client.listRemediationRecipes(request);
                    }
                },
                new java.util.function.Function<
                        ListRemediationRecipesResponse,
                        java.util.List<com.oracle.bmc.adm.model.RemediationRecipeSummary>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.adm.model.RemediationRecipeSummary> apply(
                            ListRemediationRecipesResponse response) {
                        return response.getRemediationRecipeCollection().getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the listRemediationRuns operation. This iterable
     * will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses received from the service.
     */
    public Iterable<ListRemediationRunsResponse> listRemediationRunsResponseIterator(
            final ListRemediationRunsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListRemediationRunsRequest.Builder, ListRemediationRunsRequest,
                ListRemediationRunsResponse>(
                new java.util.function.Supplier<ListRemediationRunsRequest.Builder>() {
                    @Override
                    public ListRemediationRunsRequest.Builder get() {
                        return ListRemediationRunsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListRemediationRunsResponse, String>() {
                    @Override
                    public String apply(ListRemediationRunsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListRemediationRunsRequest.Builder>,
                        ListRemediationRunsRequest>() {
                    @Override
                    public ListRemediationRunsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListRemediationRunsRequest.Builder>
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
                        ListRemediationRunsRequest, ListRemediationRunsResponse>() {
                    @Override
                    public ListRemediationRunsResponse apply(ListRemediationRunsRequest request) {
                        return client.listRemediationRuns(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link com.oracle.bmc.adm.model.RemediationRunSummary} objects
     * contained in responses from the listRemediationRuns operation. This iterable will fetch more data from the
     * server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link com.oracle.bmc.adm.model.RemediationRunSummary} objects
     * contained in responses received from the service.
     */
    public Iterable<com.oracle.bmc.adm.model.RemediationRunSummary>
            listRemediationRunsRecordIterator(final ListRemediationRunsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListRemediationRunsRequest.Builder, ListRemediationRunsRequest,
                ListRemediationRunsResponse, com.oracle.bmc.adm.model.RemediationRunSummary>(
                new java.util.function.Supplier<ListRemediationRunsRequest.Builder>() {
                    @Override
                    public ListRemediationRunsRequest.Builder get() {
                        return ListRemediationRunsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListRemediationRunsResponse, String>() {
                    @Override
                    public String apply(ListRemediationRunsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListRemediationRunsRequest.Builder>,
                        ListRemediationRunsRequest>() {
                    @Override
                    public ListRemediationRunsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListRemediationRunsRequest.Builder>
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
                        ListRemediationRunsRequest, ListRemediationRunsResponse>() {
                    @Override
                    public ListRemediationRunsResponse apply(ListRemediationRunsRequest request) {
                        return client.listRemediationRuns(request);
                    }
                },
                new java.util.function.Function<
                        ListRemediationRunsResponse,
                        java.util.List<com.oracle.bmc.adm.model.RemediationRunSummary>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.adm.model.RemediationRunSummary> apply(
                            ListRemediationRunsResponse response) {
                        return response.getRemediationRunCollection().getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the listStages operation. This iterable
     * will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses received from the service.
     */
    public Iterable<ListStagesResponse> listStagesResponseIterator(
            final ListStagesRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListStagesRequest.Builder, ListStagesRequest, ListStagesResponse>(
                new java.util.function.Supplier<ListStagesRequest.Builder>() {
                    @Override
                    public ListStagesRequest.Builder get() {
                        return ListStagesRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListStagesResponse, String>() {
                    @Override
                    public String apply(ListStagesResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListStagesRequest.Builder>,
                        ListStagesRequest>() {
                    @Override
                    public ListStagesRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListStagesRequest.Builder>
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
                new java.util.function.Function<ListStagesRequest, ListStagesResponse>() {
                    @Override
                    public ListStagesResponse apply(ListStagesRequest request) {
                        return client.listStages(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link com.oracle.bmc.adm.model.RemediationRunStageSummary} objects
     * contained in responses from the listStages operation. This iterable will fetch more data from the
     * server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link com.oracle.bmc.adm.model.RemediationRunStageSummary} objects
     * contained in responses received from the service.
     */
    public Iterable<com.oracle.bmc.adm.model.RemediationRunStageSummary> listStagesRecordIterator(
            final ListStagesRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListStagesRequest.Builder, ListStagesRequest, ListStagesResponse,
                com.oracle.bmc.adm.model.RemediationRunStageSummary>(
                new java.util.function.Supplier<ListStagesRequest.Builder>() {
                    @Override
                    public ListStagesRequest.Builder get() {
                        return ListStagesRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListStagesResponse, String>() {
                    @Override
                    public String apply(ListStagesResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListStagesRequest.Builder>,
                        ListStagesRequest>() {
                    @Override
                    public ListStagesRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListStagesRequest.Builder>
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
                new java.util.function.Function<ListStagesRequest, ListStagesResponse>() {
                    @Override
                    public ListStagesResponse apply(ListStagesRequest request) {
                        return client.listStages(request);
                    }
                },
                new java.util.function.Function<
                        ListStagesResponse,
                        java.util.List<com.oracle.bmc.adm.model.RemediationRunStageSummary>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.adm.model.RemediationRunStageSummary>
                            apply(ListStagesResponse response) {
                        return response.getRemediationRunStageCollection().getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the listVulnerabilityAudits operation. This iterable
     * will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses received from the service.
     */
    public Iterable<ListVulnerabilityAuditsResponse> listVulnerabilityAuditsResponseIterator(
            final ListVulnerabilityAuditsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListVulnerabilityAuditsRequest.Builder, ListVulnerabilityAuditsRequest,
                ListVulnerabilityAuditsResponse>(
                new java.util.function.Supplier<ListVulnerabilityAuditsRequest.Builder>() {
                    @Override
                    public ListVulnerabilityAuditsRequest.Builder get() {
                        return ListVulnerabilityAuditsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListVulnerabilityAuditsResponse, String>() {
                    @Override
                    public String apply(ListVulnerabilityAuditsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListVulnerabilityAuditsRequest.Builder>,
                        ListVulnerabilityAuditsRequest>() {
                    @Override
                    public ListVulnerabilityAuditsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListVulnerabilityAuditsRequest.Builder>
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
                        ListVulnerabilityAuditsRequest, ListVulnerabilityAuditsResponse>() {
                    @Override
                    public ListVulnerabilityAuditsResponse apply(
                            ListVulnerabilityAuditsRequest request) {
                        return client.listVulnerabilityAudits(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link com.oracle.bmc.adm.model.VulnerabilityAuditSummary} objects
     * contained in responses from the listVulnerabilityAudits operation. This iterable will fetch more data from the
     * server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link com.oracle.bmc.adm.model.VulnerabilityAuditSummary} objects
     * contained in responses received from the service.
     */
    public Iterable<com.oracle.bmc.adm.model.VulnerabilityAuditSummary>
            listVulnerabilityAuditsRecordIterator(final ListVulnerabilityAuditsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListVulnerabilityAuditsRequest.Builder, ListVulnerabilityAuditsRequest,
                ListVulnerabilityAuditsResponse,
                com.oracle.bmc.adm.model.VulnerabilityAuditSummary>(
                new java.util.function.Supplier<ListVulnerabilityAuditsRequest.Builder>() {
                    @Override
                    public ListVulnerabilityAuditsRequest.Builder get() {
                        return ListVulnerabilityAuditsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListVulnerabilityAuditsResponse, String>() {
                    @Override
                    public String apply(ListVulnerabilityAuditsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListVulnerabilityAuditsRequest.Builder>,
                        ListVulnerabilityAuditsRequest>() {
                    @Override
                    public ListVulnerabilityAuditsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListVulnerabilityAuditsRequest.Builder>
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
                        ListVulnerabilityAuditsRequest, ListVulnerabilityAuditsResponse>() {
                    @Override
                    public ListVulnerabilityAuditsResponse apply(
                            ListVulnerabilityAuditsRequest request) {
                        return client.listVulnerabilityAudits(request);
                    }
                },
                new java.util.function.Function<
                        ListVulnerabilityAuditsResponse,
                        java.util.List<com.oracle.bmc.adm.model.VulnerabilityAuditSummary>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.adm.model.VulnerabilityAuditSummary> apply(
                            ListVulnerabilityAuditsResponse response) {
                        return response.getVulnerabilityAuditCollection().getItems();
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
     * Creates a new iterable which will iterate over the {@link com.oracle.bmc.adm.model.WorkRequestError} objects
     * contained in responses from the listWorkRequestErrors operation. This iterable will fetch more data from the
     * server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link com.oracle.bmc.adm.model.WorkRequestError} objects
     * contained in responses received from the service.
     */
    public Iterable<com.oracle.bmc.adm.model.WorkRequestError> listWorkRequestErrorsRecordIterator(
            final ListWorkRequestErrorsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListWorkRequestErrorsRequest.Builder, ListWorkRequestErrorsRequest,
                ListWorkRequestErrorsResponse, com.oracle.bmc.adm.model.WorkRequestError>(
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
                        java.util.List<com.oracle.bmc.adm.model.WorkRequestError>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.adm.model.WorkRequestError> apply(
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
     * Creates a new iterable which will iterate over the {@link com.oracle.bmc.adm.model.WorkRequestLogEntry} objects
     * contained in responses from the listWorkRequestLogs operation. This iterable will fetch more data from the
     * server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link com.oracle.bmc.adm.model.WorkRequestLogEntry} objects
     * contained in responses received from the service.
     */
    public Iterable<com.oracle.bmc.adm.model.WorkRequestLogEntry> listWorkRequestLogsRecordIterator(
            final ListWorkRequestLogsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListWorkRequestLogsRequest.Builder, ListWorkRequestLogsRequest,
                ListWorkRequestLogsResponse, com.oracle.bmc.adm.model.WorkRequestLogEntry>(
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
                        java.util.List<com.oracle.bmc.adm.model.WorkRequestLogEntry>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.adm.model.WorkRequestLogEntry> apply(
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
     * Creates a new iterable which will iterate over the {@link com.oracle.bmc.adm.model.WorkRequestSummary} objects
     * contained in responses from the listWorkRequests operation. This iterable will fetch more data from the
     * server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link com.oracle.bmc.adm.model.WorkRequestSummary} objects
     * contained in responses received from the service.
     */
    public Iterable<com.oracle.bmc.adm.model.WorkRequestSummary> listWorkRequestsRecordIterator(
            final ListWorkRequestsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListWorkRequestsRequest.Builder, ListWorkRequestsRequest, ListWorkRequestsResponse,
                com.oracle.bmc.adm.model.WorkRequestSummary>(
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
                        java.util.List<com.oracle.bmc.adm.model.WorkRequestSummary>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.adm.model.WorkRequestSummary> apply(
                            ListWorkRequestsResponse response) {
                        return response.getWorkRequestSummaryCollection().getItems();
                    }
                });
    }
}

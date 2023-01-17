/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.optimizer;

import com.oracle.bmc.optimizer.requests.*;
import com.oracle.bmc.optimizer.responses.*;

/**
 * Collection of helper methods that can be used to provide an {@link java.lang.Iterable} interface
 * to any list operations of Optimizer where multiple pages of data may be fetched. Two styles of
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
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200606")
public class OptimizerPaginators {
    private final Optimizer client;

    public OptimizerPaginators(Optimizer client) {
        this.client = client;
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the listCategories
     * operation. This iterable will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses
     *     received from the service.
     */
    public Iterable<ListCategoriesResponse> listCategoriesResponseIterator(
            final ListCategoriesRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListCategoriesRequest.Builder, ListCategoriesRequest, ListCategoriesResponse>(
                new java.util.function.Supplier<ListCategoriesRequest.Builder>() {
                    @Override
                    public ListCategoriesRequest.Builder get() {
                        return ListCategoriesRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListCategoriesResponse, String>() {
                    @Override
                    public String apply(ListCategoriesResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListCategoriesRequest.Builder>,
                        ListCategoriesRequest>() {
                    @Override
                    public ListCategoriesRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListCategoriesRequest.Builder>
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
                new java.util.function.Function<ListCategoriesRequest, ListCategoriesResponse>() {
                    @Override
                    public ListCategoriesResponse apply(ListCategoriesRequest request) {
                        return client.listCategories(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link
     * com.oracle.bmc.optimizer.model.CategorySummary} objects contained in responses from the
     * listCategories operation. This iterable will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link
     *     com.oracle.bmc.optimizer.model.CategorySummary} objects contained in responses received
     *     from the service.
     */
    public Iterable<com.oracle.bmc.optimizer.model.CategorySummary> listCategoriesRecordIterator(
            final ListCategoriesRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListCategoriesRequest.Builder,
                ListCategoriesRequest,
                ListCategoriesResponse,
                com.oracle.bmc.optimizer.model.CategorySummary>(
                new java.util.function.Supplier<ListCategoriesRequest.Builder>() {
                    @Override
                    public ListCategoriesRequest.Builder get() {
                        return ListCategoriesRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListCategoriesResponse, String>() {
                    @Override
                    public String apply(ListCategoriesResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListCategoriesRequest.Builder>,
                        ListCategoriesRequest>() {
                    @Override
                    public ListCategoriesRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListCategoriesRequest.Builder>
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
                new java.util.function.Function<ListCategoriesRequest, ListCategoriesResponse>() {
                    @Override
                    public ListCategoriesResponse apply(ListCategoriesRequest request) {
                        return client.listCategories(request);
                    }
                },
                new java.util.function.Function<
                        ListCategoriesResponse,
                        java.util.List<com.oracle.bmc.optimizer.model.CategorySummary>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.optimizer.model.CategorySummary> apply(
                            ListCategoriesResponse response) {
                        return response.getCategoryCollection().getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the
     * listEnrollmentStatuses operation. This iterable will fetch more data from the server as
     * needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses
     *     received from the service.
     */
    public Iterable<ListEnrollmentStatusesResponse> listEnrollmentStatusesResponseIterator(
            final ListEnrollmentStatusesRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListEnrollmentStatusesRequest.Builder,
                ListEnrollmentStatusesRequest,
                ListEnrollmentStatusesResponse>(
                new java.util.function.Supplier<ListEnrollmentStatusesRequest.Builder>() {
                    @Override
                    public ListEnrollmentStatusesRequest.Builder get() {
                        return ListEnrollmentStatusesRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListEnrollmentStatusesResponse, String>() {
                    @Override
                    public String apply(ListEnrollmentStatusesResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListEnrollmentStatusesRequest.Builder>,
                        ListEnrollmentStatusesRequest>() {
                    @Override
                    public ListEnrollmentStatusesRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListEnrollmentStatusesRequest.Builder>
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
                        ListEnrollmentStatusesRequest, ListEnrollmentStatusesResponse>() {
                    @Override
                    public ListEnrollmentStatusesResponse apply(
                            ListEnrollmentStatusesRequest request) {
                        return client.listEnrollmentStatuses(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link
     * com.oracle.bmc.optimizer.model.EnrollmentStatusSummary} objects contained in responses from
     * the listEnrollmentStatuses operation. This iterable will fetch more data from the server as
     * needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link
     *     com.oracle.bmc.optimizer.model.EnrollmentStatusSummary} objects contained in responses
     *     received from the service.
     */
    public Iterable<com.oracle.bmc.optimizer.model.EnrollmentStatusSummary>
            listEnrollmentStatusesRecordIterator(final ListEnrollmentStatusesRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListEnrollmentStatusesRequest.Builder,
                ListEnrollmentStatusesRequest,
                ListEnrollmentStatusesResponse,
                com.oracle.bmc.optimizer.model.EnrollmentStatusSummary>(
                new java.util.function.Supplier<ListEnrollmentStatusesRequest.Builder>() {
                    @Override
                    public ListEnrollmentStatusesRequest.Builder get() {
                        return ListEnrollmentStatusesRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListEnrollmentStatusesResponse, String>() {
                    @Override
                    public String apply(ListEnrollmentStatusesResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListEnrollmentStatusesRequest.Builder>,
                        ListEnrollmentStatusesRequest>() {
                    @Override
                    public ListEnrollmentStatusesRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListEnrollmentStatusesRequest.Builder>
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
                        ListEnrollmentStatusesRequest, ListEnrollmentStatusesResponse>() {
                    @Override
                    public ListEnrollmentStatusesResponse apply(
                            ListEnrollmentStatusesRequest request) {
                        return client.listEnrollmentStatuses(request);
                    }
                },
                new java.util.function.Function<
                        ListEnrollmentStatusesResponse,
                        java.util.List<com.oracle.bmc.optimizer.model.EnrollmentStatusSummary>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.optimizer.model.EnrollmentStatusSummary>
                            apply(ListEnrollmentStatusesResponse response) {
                        return response.getEnrollmentStatusCollection().getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the listHistories
     * operation. This iterable will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses
     *     received from the service.
     */
    public Iterable<ListHistoriesResponse> listHistoriesResponseIterator(
            final ListHistoriesRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListHistoriesRequest.Builder, ListHistoriesRequest, ListHistoriesResponse>(
                new java.util.function.Supplier<ListHistoriesRequest.Builder>() {
                    @Override
                    public ListHistoriesRequest.Builder get() {
                        return ListHistoriesRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListHistoriesResponse, String>() {
                    @Override
                    public String apply(ListHistoriesResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListHistoriesRequest.Builder>,
                        ListHistoriesRequest>() {
                    @Override
                    public ListHistoriesRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListHistoriesRequest.Builder>
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
                new java.util.function.Function<ListHistoriesRequest, ListHistoriesResponse>() {
                    @Override
                    public ListHistoriesResponse apply(ListHistoriesRequest request) {
                        return client.listHistories(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link
     * com.oracle.bmc.optimizer.model.HistorySummary} objects contained in responses from the
     * listHistories operation. This iterable will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link
     *     com.oracle.bmc.optimizer.model.HistorySummary} objects contained in responses received
     *     from the service.
     */
    public Iterable<com.oracle.bmc.optimizer.model.HistorySummary> listHistoriesRecordIterator(
            final ListHistoriesRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListHistoriesRequest.Builder,
                ListHistoriesRequest,
                ListHistoriesResponse,
                com.oracle.bmc.optimizer.model.HistorySummary>(
                new java.util.function.Supplier<ListHistoriesRequest.Builder>() {
                    @Override
                    public ListHistoriesRequest.Builder get() {
                        return ListHistoriesRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListHistoriesResponse, String>() {
                    @Override
                    public String apply(ListHistoriesResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListHistoriesRequest.Builder>,
                        ListHistoriesRequest>() {
                    @Override
                    public ListHistoriesRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListHistoriesRequest.Builder>
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
                new java.util.function.Function<ListHistoriesRequest, ListHistoriesResponse>() {
                    @Override
                    public ListHistoriesResponse apply(ListHistoriesRequest request) {
                        return client.listHistories(request);
                    }
                },
                new java.util.function.Function<
                        ListHistoriesResponse,
                        java.util.List<com.oracle.bmc.optimizer.model.HistorySummary>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.optimizer.model.HistorySummary> apply(
                            ListHistoriesResponse response) {
                        return response.getHistoryCollection().getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the
     * listProfileLevels operation. This iterable will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses
     *     received from the service.
     */
    public Iterable<ListProfileLevelsResponse> listProfileLevelsResponseIterator(
            final ListProfileLevelsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListProfileLevelsRequest.Builder,
                ListProfileLevelsRequest,
                ListProfileLevelsResponse>(
                new java.util.function.Supplier<ListProfileLevelsRequest.Builder>() {
                    @Override
                    public ListProfileLevelsRequest.Builder get() {
                        return ListProfileLevelsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListProfileLevelsResponse, String>() {
                    @Override
                    public String apply(ListProfileLevelsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListProfileLevelsRequest.Builder>,
                        ListProfileLevelsRequest>() {
                    @Override
                    public ListProfileLevelsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListProfileLevelsRequest.Builder>
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
                        ListProfileLevelsRequest, ListProfileLevelsResponse>() {
                    @Override
                    public ListProfileLevelsResponse apply(ListProfileLevelsRequest request) {
                        return client.listProfileLevels(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link
     * com.oracle.bmc.optimizer.model.ProfileLevelSummary} objects contained in responses from the
     * listProfileLevels operation. This iterable will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link
     *     com.oracle.bmc.optimizer.model.ProfileLevelSummary} objects contained in responses
     *     received from the service.
     */
    public Iterable<com.oracle.bmc.optimizer.model.ProfileLevelSummary>
            listProfileLevelsRecordIterator(final ListProfileLevelsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListProfileLevelsRequest.Builder,
                ListProfileLevelsRequest,
                ListProfileLevelsResponse,
                com.oracle.bmc.optimizer.model.ProfileLevelSummary>(
                new java.util.function.Supplier<ListProfileLevelsRequest.Builder>() {
                    @Override
                    public ListProfileLevelsRequest.Builder get() {
                        return ListProfileLevelsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListProfileLevelsResponse, String>() {
                    @Override
                    public String apply(ListProfileLevelsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListProfileLevelsRequest.Builder>,
                        ListProfileLevelsRequest>() {
                    @Override
                    public ListProfileLevelsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListProfileLevelsRequest.Builder>
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
                        ListProfileLevelsRequest, ListProfileLevelsResponse>() {
                    @Override
                    public ListProfileLevelsResponse apply(ListProfileLevelsRequest request) {
                        return client.listProfileLevels(request);
                    }
                },
                new java.util.function.Function<
                        ListProfileLevelsResponse,
                        java.util.List<com.oracle.bmc.optimizer.model.ProfileLevelSummary>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.optimizer.model.ProfileLevelSummary> apply(
                            ListProfileLevelsResponse response) {
                        return response.getProfileLevelCollection().getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the listProfiles
     * operation. This iterable will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses
     *     received from the service.
     */
    public Iterable<ListProfilesResponse> listProfilesResponseIterator(
            final ListProfilesRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListProfilesRequest.Builder, ListProfilesRequest, ListProfilesResponse>(
                new java.util.function.Supplier<ListProfilesRequest.Builder>() {
                    @Override
                    public ListProfilesRequest.Builder get() {
                        return ListProfilesRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListProfilesResponse, String>() {
                    @Override
                    public String apply(ListProfilesResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListProfilesRequest.Builder>,
                        ListProfilesRequest>() {
                    @Override
                    public ListProfilesRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListProfilesRequest.Builder>
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
                new java.util.function.Function<ListProfilesRequest, ListProfilesResponse>() {
                    @Override
                    public ListProfilesResponse apply(ListProfilesRequest request) {
                        return client.listProfiles(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link
     * com.oracle.bmc.optimizer.model.ProfileSummary} objects contained in responses from the
     * listProfiles operation. This iterable will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link
     *     com.oracle.bmc.optimizer.model.ProfileSummary} objects contained in responses received
     *     from the service.
     */
    public Iterable<com.oracle.bmc.optimizer.model.ProfileSummary> listProfilesRecordIterator(
            final ListProfilesRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListProfilesRequest.Builder,
                ListProfilesRequest,
                ListProfilesResponse,
                com.oracle.bmc.optimizer.model.ProfileSummary>(
                new java.util.function.Supplier<ListProfilesRequest.Builder>() {
                    @Override
                    public ListProfilesRequest.Builder get() {
                        return ListProfilesRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListProfilesResponse, String>() {
                    @Override
                    public String apply(ListProfilesResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListProfilesRequest.Builder>,
                        ListProfilesRequest>() {
                    @Override
                    public ListProfilesRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListProfilesRequest.Builder>
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
                new java.util.function.Function<ListProfilesRequest, ListProfilesResponse>() {
                    @Override
                    public ListProfilesResponse apply(ListProfilesRequest request) {
                        return client.listProfiles(request);
                    }
                },
                new java.util.function.Function<
                        ListProfilesResponse,
                        java.util.List<com.oracle.bmc.optimizer.model.ProfileSummary>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.optimizer.model.ProfileSummary> apply(
                            ListProfilesResponse response) {
                        return response.getProfileCollection().getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the
     * listRecommendationStrategies operation. This iterable will fetch more data from the server as
     * needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses
     *     received from the service.
     */
    public Iterable<ListRecommendationStrategiesResponse>
            listRecommendationStrategiesResponseIterator(
                    final ListRecommendationStrategiesRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListRecommendationStrategiesRequest.Builder,
                ListRecommendationStrategiesRequest,
                ListRecommendationStrategiesResponse>(
                new java.util.function.Supplier<ListRecommendationStrategiesRequest.Builder>() {
                    @Override
                    public ListRecommendationStrategiesRequest.Builder get() {
                        return ListRecommendationStrategiesRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListRecommendationStrategiesResponse, String>() {
                    @Override
                    public String apply(ListRecommendationStrategiesResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListRecommendationStrategiesRequest.Builder>,
                        ListRecommendationStrategiesRequest>() {
                    @Override
                    public ListRecommendationStrategiesRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListRecommendationStrategiesRequest.Builder>
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
                        ListRecommendationStrategiesRequest,
                        ListRecommendationStrategiesResponse>() {
                    @Override
                    public ListRecommendationStrategiesResponse apply(
                            ListRecommendationStrategiesRequest request) {
                        return client.listRecommendationStrategies(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link
     * com.oracle.bmc.optimizer.model.RecommendationStrategySummary} objects contained in responses
     * from the listRecommendationStrategies operation. This iterable will fetch more data from the
     * server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link
     *     com.oracle.bmc.optimizer.model.RecommendationStrategySummary} objects contained in
     *     responses received from the service.
     */
    public Iterable<com.oracle.bmc.optimizer.model.RecommendationStrategySummary>
            listRecommendationStrategiesRecordIterator(
                    final ListRecommendationStrategiesRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListRecommendationStrategiesRequest.Builder,
                ListRecommendationStrategiesRequest,
                ListRecommendationStrategiesResponse,
                com.oracle.bmc.optimizer.model.RecommendationStrategySummary>(
                new java.util.function.Supplier<ListRecommendationStrategiesRequest.Builder>() {
                    @Override
                    public ListRecommendationStrategiesRequest.Builder get() {
                        return ListRecommendationStrategiesRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListRecommendationStrategiesResponse, String>() {
                    @Override
                    public String apply(ListRecommendationStrategiesResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListRecommendationStrategiesRequest.Builder>,
                        ListRecommendationStrategiesRequest>() {
                    @Override
                    public ListRecommendationStrategiesRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListRecommendationStrategiesRequest.Builder>
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
                        ListRecommendationStrategiesRequest,
                        ListRecommendationStrategiesResponse>() {
                    @Override
                    public ListRecommendationStrategiesResponse apply(
                            ListRecommendationStrategiesRequest request) {
                        return client.listRecommendationStrategies(request);
                    }
                },
                new java.util.function.Function<
                        ListRecommendationStrategiesResponse,
                        java.util.List<
                                com.oracle.bmc.optimizer.model.RecommendationStrategySummary>>() {
                    @Override
                    public java.util.List<
                                    com.oracle.bmc.optimizer.model.RecommendationStrategySummary>
                            apply(ListRecommendationStrategiesResponse response) {
                        return response.getRecommendationStrategyCollection().getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the
     * listRecommendations operation. This iterable will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses
     *     received from the service.
     */
    public Iterable<ListRecommendationsResponse> listRecommendationsResponseIterator(
            final ListRecommendationsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListRecommendationsRequest.Builder,
                ListRecommendationsRequest,
                ListRecommendationsResponse>(
                new java.util.function.Supplier<ListRecommendationsRequest.Builder>() {
                    @Override
                    public ListRecommendationsRequest.Builder get() {
                        return ListRecommendationsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListRecommendationsResponse, String>() {
                    @Override
                    public String apply(ListRecommendationsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListRecommendationsRequest.Builder>,
                        ListRecommendationsRequest>() {
                    @Override
                    public ListRecommendationsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListRecommendationsRequest.Builder>
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
                        ListRecommendationsRequest, ListRecommendationsResponse>() {
                    @Override
                    public ListRecommendationsResponse apply(ListRecommendationsRequest request) {
                        return client.listRecommendations(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link
     * com.oracle.bmc.optimizer.model.RecommendationSummary} objects contained in responses from the
     * listRecommendations operation. This iterable will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link
     *     com.oracle.bmc.optimizer.model.RecommendationSummary} objects contained in responses
     *     received from the service.
     */
    public Iterable<com.oracle.bmc.optimizer.model.RecommendationSummary>
            listRecommendationsRecordIterator(final ListRecommendationsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListRecommendationsRequest.Builder,
                ListRecommendationsRequest,
                ListRecommendationsResponse,
                com.oracle.bmc.optimizer.model.RecommendationSummary>(
                new java.util.function.Supplier<ListRecommendationsRequest.Builder>() {
                    @Override
                    public ListRecommendationsRequest.Builder get() {
                        return ListRecommendationsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListRecommendationsResponse, String>() {
                    @Override
                    public String apply(ListRecommendationsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListRecommendationsRequest.Builder>,
                        ListRecommendationsRequest>() {
                    @Override
                    public ListRecommendationsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListRecommendationsRequest.Builder>
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
                        ListRecommendationsRequest, ListRecommendationsResponse>() {
                    @Override
                    public ListRecommendationsResponse apply(ListRecommendationsRequest request) {
                        return client.listRecommendations(request);
                    }
                },
                new java.util.function.Function<
                        ListRecommendationsResponse,
                        java.util.List<com.oracle.bmc.optimizer.model.RecommendationSummary>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.optimizer.model.RecommendationSummary>
                            apply(ListRecommendationsResponse response) {
                        return response.getRecommendationCollection().getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the
     * listResourceActionQueryableFields operation. This iterable will fetch more data from the
     * server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses
     *     received from the service.
     */
    public Iterable<ListResourceActionQueryableFieldsResponse>
            listResourceActionQueryableFieldsResponseIterator(
                    final ListResourceActionQueryableFieldsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListResourceActionQueryableFieldsRequest.Builder,
                ListResourceActionQueryableFieldsRequest,
                ListResourceActionQueryableFieldsResponse>(
                new java.util.function.Supplier<
                        ListResourceActionQueryableFieldsRequest.Builder>() {
                    @Override
                    public ListResourceActionQueryableFieldsRequest.Builder get() {
                        return ListResourceActionQueryableFieldsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<
                        ListResourceActionQueryableFieldsResponse, String>() {
                    @Override
                    public String apply(ListResourceActionQueryableFieldsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListResourceActionQueryableFieldsRequest.Builder>,
                        ListResourceActionQueryableFieldsRequest>() {
                    @Override
                    public ListResourceActionQueryableFieldsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListResourceActionQueryableFieldsRequest.Builder>
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
                        ListResourceActionQueryableFieldsRequest,
                        ListResourceActionQueryableFieldsResponse>() {
                    @Override
                    public ListResourceActionQueryableFieldsResponse apply(
                            ListResourceActionQueryableFieldsRequest request) {
                        return client.listResourceActionQueryableFields(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link
     * com.oracle.bmc.optimizer.model.QueryableFieldSummary} objects contained in responses from the
     * listResourceActionQueryableFields operation. This iterable will fetch more data from the
     * server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link
     *     com.oracle.bmc.optimizer.model.QueryableFieldSummary} objects contained in responses
     *     received from the service.
     */
    public Iterable<com.oracle.bmc.optimizer.model.QueryableFieldSummary>
            listResourceActionQueryableFieldsRecordIterator(
                    final ListResourceActionQueryableFieldsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListResourceActionQueryableFieldsRequest.Builder,
                ListResourceActionQueryableFieldsRequest,
                ListResourceActionQueryableFieldsResponse,
                com.oracle.bmc.optimizer.model.QueryableFieldSummary>(
                new java.util.function.Supplier<
                        ListResourceActionQueryableFieldsRequest.Builder>() {
                    @Override
                    public ListResourceActionQueryableFieldsRequest.Builder get() {
                        return ListResourceActionQueryableFieldsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<
                        ListResourceActionQueryableFieldsResponse, String>() {
                    @Override
                    public String apply(ListResourceActionQueryableFieldsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListResourceActionQueryableFieldsRequest.Builder>,
                        ListResourceActionQueryableFieldsRequest>() {
                    @Override
                    public ListResourceActionQueryableFieldsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListResourceActionQueryableFieldsRequest.Builder>
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
                        ListResourceActionQueryableFieldsRequest,
                        ListResourceActionQueryableFieldsResponse>() {
                    @Override
                    public ListResourceActionQueryableFieldsResponse apply(
                            ListResourceActionQueryableFieldsRequest request) {
                        return client.listResourceActionQueryableFields(request);
                    }
                },
                new java.util.function.Function<
                        ListResourceActionQueryableFieldsResponse,
                        java.util.List<com.oracle.bmc.optimizer.model.QueryableFieldSummary>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.optimizer.model.QueryableFieldSummary>
                            apply(ListResourceActionQueryableFieldsResponse response) {
                        return response.getQueryableFieldCollection().getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the
     * listResourceActions operation. This iterable will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses
     *     received from the service.
     */
    public Iterable<ListResourceActionsResponse> listResourceActionsResponseIterator(
            final ListResourceActionsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListResourceActionsRequest.Builder,
                ListResourceActionsRequest,
                ListResourceActionsResponse>(
                new java.util.function.Supplier<ListResourceActionsRequest.Builder>() {
                    @Override
                    public ListResourceActionsRequest.Builder get() {
                        return ListResourceActionsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListResourceActionsResponse, String>() {
                    @Override
                    public String apply(ListResourceActionsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListResourceActionsRequest.Builder>,
                        ListResourceActionsRequest>() {
                    @Override
                    public ListResourceActionsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListResourceActionsRequest.Builder>
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
                        ListResourceActionsRequest, ListResourceActionsResponse>() {
                    @Override
                    public ListResourceActionsResponse apply(ListResourceActionsRequest request) {
                        return client.listResourceActions(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link
     * com.oracle.bmc.optimizer.model.ResourceActionSummary} objects contained in responses from the
     * listResourceActions operation. This iterable will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link
     *     com.oracle.bmc.optimizer.model.ResourceActionSummary} objects contained in responses
     *     received from the service.
     */
    public Iterable<com.oracle.bmc.optimizer.model.ResourceActionSummary>
            listResourceActionsRecordIterator(final ListResourceActionsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListResourceActionsRequest.Builder,
                ListResourceActionsRequest,
                ListResourceActionsResponse,
                com.oracle.bmc.optimizer.model.ResourceActionSummary>(
                new java.util.function.Supplier<ListResourceActionsRequest.Builder>() {
                    @Override
                    public ListResourceActionsRequest.Builder get() {
                        return ListResourceActionsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListResourceActionsResponse, String>() {
                    @Override
                    public String apply(ListResourceActionsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListResourceActionsRequest.Builder>,
                        ListResourceActionsRequest>() {
                    @Override
                    public ListResourceActionsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListResourceActionsRequest.Builder>
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
                        ListResourceActionsRequest, ListResourceActionsResponse>() {
                    @Override
                    public ListResourceActionsResponse apply(ListResourceActionsRequest request) {
                        return client.listResourceActions(request);
                    }
                },
                new java.util.function.Function<
                        ListResourceActionsResponse,
                        java.util.List<com.oracle.bmc.optimizer.model.ResourceActionSummary>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.optimizer.model.ResourceActionSummary>
                            apply(ListResourceActionsResponse response) {
                        return response.getResourceActionCollection().getItems();
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
     * com.oracle.bmc.optimizer.model.WorkRequestError} objects contained in responses from the
     * listWorkRequestErrors operation. This iterable will fetch more data from the server as
     * needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link
     *     com.oracle.bmc.optimizer.model.WorkRequestError} objects contained in responses received
     *     from the service.
     */
    public Iterable<com.oracle.bmc.optimizer.model.WorkRequestError>
            listWorkRequestErrorsRecordIterator(final ListWorkRequestErrorsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListWorkRequestErrorsRequest.Builder,
                ListWorkRequestErrorsRequest,
                ListWorkRequestErrorsResponse,
                com.oracle.bmc.optimizer.model.WorkRequestError>(
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
                        java.util.List<com.oracle.bmc.optimizer.model.WorkRequestError>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.optimizer.model.WorkRequestError> apply(
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
     * com.oracle.bmc.optimizer.model.WorkRequestLogEntry} objects contained in responses from the
     * listWorkRequestLogs operation. This iterable will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link
     *     com.oracle.bmc.optimizer.model.WorkRequestLogEntry} objects contained in responses
     *     received from the service.
     */
    public Iterable<com.oracle.bmc.optimizer.model.WorkRequestLogEntry>
            listWorkRequestLogsRecordIterator(final ListWorkRequestLogsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListWorkRequestLogsRequest.Builder,
                ListWorkRequestLogsRequest,
                ListWorkRequestLogsResponse,
                com.oracle.bmc.optimizer.model.WorkRequestLogEntry>(
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
                        java.util.List<com.oracle.bmc.optimizer.model.WorkRequestLogEntry>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.optimizer.model.WorkRequestLogEntry> apply(
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
     * com.oracle.bmc.optimizer.model.WorkRequest} objects contained in responses from the
     * listWorkRequests operation. This iterable will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link
     *     com.oracle.bmc.optimizer.model.WorkRequest} objects contained in responses received from
     *     the service.
     */
    public Iterable<com.oracle.bmc.optimizer.model.WorkRequest> listWorkRequestsRecordIterator(
            final ListWorkRequestsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListWorkRequestsRequest.Builder,
                ListWorkRequestsRequest,
                ListWorkRequestsResponse,
                com.oracle.bmc.optimizer.model.WorkRequest>(
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
                        java.util.List<com.oracle.bmc.optimizer.model.WorkRequest>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.optimizer.model.WorkRequest> apply(
                            ListWorkRequestsResponse response) {
                        return response.getWorkRequestCollection().getItems();
                    }
                });
    }
}

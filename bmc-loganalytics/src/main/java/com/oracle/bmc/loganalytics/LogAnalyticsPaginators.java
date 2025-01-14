/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.loganalytics;

import com.oracle.bmc.loganalytics.requests.*;
import com.oracle.bmc.loganalytics.responses.*;

/**
 * Collection of helper methods that can be used to provide an {@link java.lang.Iterable} interface
 * to any list operations of LogAnalytics where multiple pages of data may be fetched. Two styles of
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
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200601")
public class LogAnalyticsPaginators {
    private final LogAnalytics client;

    public LogAnalyticsPaginators(LogAnalytics client) {
        this.client = client;
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the
     * listAssociableEntities operation. This iterable will fetch more data from the server as
     * needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses
     *     received from the service.
     */
    public Iterable<ListAssociableEntitiesResponse> listAssociableEntitiesResponseIterator(
            final ListAssociableEntitiesRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListAssociableEntitiesRequest.Builder,
                ListAssociableEntitiesRequest,
                ListAssociableEntitiesResponse>(
                new java.util.function.Supplier<ListAssociableEntitiesRequest.Builder>() {
                    @Override
                    public ListAssociableEntitiesRequest.Builder get() {
                        return ListAssociableEntitiesRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListAssociableEntitiesResponse, String>() {
                    @Override
                    public String apply(ListAssociableEntitiesResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListAssociableEntitiesRequest.Builder>,
                        ListAssociableEntitiesRequest>() {
                    @Override
                    public ListAssociableEntitiesRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListAssociableEntitiesRequest.Builder>
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
                        ListAssociableEntitiesRequest, ListAssociableEntitiesResponse>() {
                    @Override
                    public ListAssociableEntitiesResponse apply(
                            ListAssociableEntitiesRequest request) {
                        return client.listAssociableEntities(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link
     * com.oracle.bmc.loganalytics.model.AssociableEntity} objects contained in responses from the
     * listAssociableEntities operation. This iterable will fetch more data from the server as
     * needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link
     *     com.oracle.bmc.loganalytics.model.AssociableEntity} objects contained in responses
     *     received from the service.
     */
    public Iterable<com.oracle.bmc.loganalytics.model.AssociableEntity>
            listAssociableEntitiesRecordIterator(final ListAssociableEntitiesRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListAssociableEntitiesRequest.Builder,
                ListAssociableEntitiesRequest,
                ListAssociableEntitiesResponse,
                com.oracle.bmc.loganalytics.model.AssociableEntity>(
                new java.util.function.Supplier<ListAssociableEntitiesRequest.Builder>() {
                    @Override
                    public ListAssociableEntitiesRequest.Builder get() {
                        return ListAssociableEntitiesRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListAssociableEntitiesResponse, String>() {
                    @Override
                    public String apply(ListAssociableEntitiesResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListAssociableEntitiesRequest.Builder>,
                        ListAssociableEntitiesRequest>() {
                    @Override
                    public ListAssociableEntitiesRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListAssociableEntitiesRequest.Builder>
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
                        ListAssociableEntitiesRequest, ListAssociableEntitiesResponse>() {
                    @Override
                    public ListAssociableEntitiesResponse apply(
                            ListAssociableEntitiesRequest request) {
                        return client.listAssociableEntities(request);
                    }
                },
                new java.util.function.Function<
                        ListAssociableEntitiesResponse,
                        java.util.List<com.oracle.bmc.loganalytics.model.AssociableEntity>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.loganalytics.model.AssociableEntity> apply(
                            ListAssociableEntitiesResponse response) {
                        return response.getAssociableEntityCollection().getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the
     * listAssociatedEntities operation. This iterable will fetch more data from the server as
     * needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses
     *     received from the service.
     */
    public Iterable<ListAssociatedEntitiesResponse> listAssociatedEntitiesResponseIterator(
            final ListAssociatedEntitiesRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListAssociatedEntitiesRequest.Builder,
                ListAssociatedEntitiesRequest,
                ListAssociatedEntitiesResponse>(
                new java.util.function.Supplier<ListAssociatedEntitiesRequest.Builder>() {
                    @Override
                    public ListAssociatedEntitiesRequest.Builder get() {
                        return ListAssociatedEntitiesRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListAssociatedEntitiesResponse, String>() {
                    @Override
                    public String apply(ListAssociatedEntitiesResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListAssociatedEntitiesRequest.Builder>,
                        ListAssociatedEntitiesRequest>() {
                    @Override
                    public ListAssociatedEntitiesRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListAssociatedEntitiesRequest.Builder>
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
                        ListAssociatedEntitiesRequest, ListAssociatedEntitiesResponse>() {
                    @Override
                    public ListAssociatedEntitiesResponse apply(
                            ListAssociatedEntitiesRequest request) {
                        return client.listAssociatedEntities(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link
     * com.oracle.bmc.loganalytics.model.LogAnalyticsAssociatedEntity} objects contained in
     * responses from the listAssociatedEntities operation. This iterable will fetch more data from
     * the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link
     *     com.oracle.bmc.loganalytics.model.LogAnalyticsAssociatedEntity} objects contained in
     *     responses received from the service.
     */
    public Iterable<com.oracle.bmc.loganalytics.model.LogAnalyticsAssociatedEntity>
            listAssociatedEntitiesRecordIterator(final ListAssociatedEntitiesRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListAssociatedEntitiesRequest.Builder,
                ListAssociatedEntitiesRequest,
                ListAssociatedEntitiesResponse,
                com.oracle.bmc.loganalytics.model.LogAnalyticsAssociatedEntity>(
                new java.util.function.Supplier<ListAssociatedEntitiesRequest.Builder>() {
                    @Override
                    public ListAssociatedEntitiesRequest.Builder get() {
                        return ListAssociatedEntitiesRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListAssociatedEntitiesResponse, String>() {
                    @Override
                    public String apply(ListAssociatedEntitiesResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListAssociatedEntitiesRequest.Builder>,
                        ListAssociatedEntitiesRequest>() {
                    @Override
                    public ListAssociatedEntitiesRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListAssociatedEntitiesRequest.Builder>
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
                        ListAssociatedEntitiesRequest, ListAssociatedEntitiesResponse>() {
                    @Override
                    public ListAssociatedEntitiesResponse apply(
                            ListAssociatedEntitiesRequest request) {
                        return client.listAssociatedEntities(request);
                    }
                },
                new java.util.function.Function<
                        ListAssociatedEntitiesResponse,
                        java.util.List<
                                com.oracle.bmc.loganalytics.model.LogAnalyticsAssociatedEntity>>() {
                    @Override
                    public java.util.List<
                                    com.oracle.bmc.loganalytics.model.LogAnalyticsAssociatedEntity>
                            apply(ListAssociatedEntitiesResponse response) {
                        return response.getLogAnalyticsAssociatedEntityCollection().getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the
     * listAutoAssociations operation. This iterable will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses
     *     received from the service.
     */
    public Iterable<ListAutoAssociationsResponse> listAutoAssociationsResponseIterator(
            final ListAutoAssociationsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListAutoAssociationsRequest.Builder,
                ListAutoAssociationsRequest,
                ListAutoAssociationsResponse>(
                new java.util.function.Supplier<ListAutoAssociationsRequest.Builder>() {
                    @Override
                    public ListAutoAssociationsRequest.Builder get() {
                        return ListAutoAssociationsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListAutoAssociationsResponse, String>() {
                    @Override
                    public String apply(ListAutoAssociationsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListAutoAssociationsRequest.Builder>,
                        ListAutoAssociationsRequest>() {
                    @Override
                    public ListAutoAssociationsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListAutoAssociationsRequest.Builder>
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
                        ListAutoAssociationsRequest, ListAutoAssociationsResponse>() {
                    @Override
                    public ListAutoAssociationsResponse apply(ListAutoAssociationsRequest request) {
                        return client.listAutoAssociations(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link
     * com.oracle.bmc.loganalytics.model.AutoAssociationState} objects contained in responses from
     * the listAutoAssociations operation. This iterable will fetch more data from the server as
     * needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link
     *     com.oracle.bmc.loganalytics.model.AutoAssociationState} objects contained in responses
     *     received from the service.
     */
    public Iterable<com.oracle.bmc.loganalytics.model.AutoAssociationState>
            listAutoAssociationsRecordIterator(final ListAutoAssociationsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListAutoAssociationsRequest.Builder,
                ListAutoAssociationsRequest,
                ListAutoAssociationsResponse,
                com.oracle.bmc.loganalytics.model.AutoAssociationState>(
                new java.util.function.Supplier<ListAutoAssociationsRequest.Builder>() {
                    @Override
                    public ListAutoAssociationsRequest.Builder get() {
                        return ListAutoAssociationsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListAutoAssociationsResponse, String>() {
                    @Override
                    public String apply(ListAutoAssociationsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListAutoAssociationsRequest.Builder>,
                        ListAutoAssociationsRequest>() {
                    @Override
                    public ListAutoAssociationsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListAutoAssociationsRequest.Builder>
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
                        ListAutoAssociationsRequest, ListAutoAssociationsResponse>() {
                    @Override
                    public ListAutoAssociationsResponse apply(ListAutoAssociationsRequest request) {
                        return client.listAutoAssociations(request);
                    }
                },
                new java.util.function.Function<
                        ListAutoAssociationsResponse,
                        java.util.List<com.oracle.bmc.loganalytics.model.AutoAssociationState>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.loganalytics.model.AutoAssociationState>
                            apply(ListAutoAssociationsResponse response) {
                        return response.getAutoAssociationCollection().getItems();
                    }
                });
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
     * com.oracle.bmc.loganalytics.model.LogAnalyticsCategory} objects contained in responses from
     * the listCategories operation. This iterable will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link
     *     com.oracle.bmc.loganalytics.model.LogAnalyticsCategory} objects contained in responses
     *     received from the service.
     */
    public Iterable<com.oracle.bmc.loganalytics.model.LogAnalyticsCategory>
            listCategoriesRecordIterator(final ListCategoriesRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListCategoriesRequest.Builder,
                ListCategoriesRequest,
                ListCategoriesResponse,
                com.oracle.bmc.loganalytics.model.LogAnalyticsCategory>(
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
                        java.util.List<com.oracle.bmc.loganalytics.model.LogAnalyticsCategory>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.loganalytics.model.LogAnalyticsCategory>
                            apply(ListCategoriesResponse response) {
                        return response.getLogAnalyticsCategoryCollection().getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the
     * listConfigWorkRequests operation. This iterable will fetch more data from the server as
     * needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses
     *     received from the service.
     */
    public Iterable<ListConfigWorkRequestsResponse> listConfigWorkRequestsResponseIterator(
            final ListConfigWorkRequestsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListConfigWorkRequestsRequest.Builder,
                ListConfigWorkRequestsRequest,
                ListConfigWorkRequestsResponse>(
                new java.util.function.Supplier<ListConfigWorkRequestsRequest.Builder>() {
                    @Override
                    public ListConfigWorkRequestsRequest.Builder get() {
                        return ListConfigWorkRequestsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListConfigWorkRequestsResponse, String>() {
                    @Override
                    public String apply(ListConfigWorkRequestsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListConfigWorkRequestsRequest.Builder>,
                        ListConfigWorkRequestsRequest>() {
                    @Override
                    public ListConfigWorkRequestsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListConfigWorkRequestsRequest.Builder>
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
                        ListConfigWorkRequestsRequest, ListConfigWorkRequestsResponse>() {
                    @Override
                    public ListConfigWorkRequestsResponse apply(
                            ListConfigWorkRequestsRequest request) {
                        return client.listConfigWorkRequests(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link
     * com.oracle.bmc.loganalytics.model.LogAnalyticsConfigWorkRequestSummary} objects contained in
     * responses from the listConfigWorkRequests operation. This iterable will fetch more data from
     * the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link
     *     com.oracle.bmc.loganalytics.model.LogAnalyticsConfigWorkRequestSummary} objects contained
     *     in responses received from the service.
     */
    public Iterable<com.oracle.bmc.loganalytics.model.LogAnalyticsConfigWorkRequestSummary>
            listConfigWorkRequestsRecordIterator(final ListConfigWorkRequestsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListConfigWorkRequestsRequest.Builder,
                ListConfigWorkRequestsRequest,
                ListConfigWorkRequestsResponse,
                com.oracle.bmc.loganalytics.model.LogAnalyticsConfigWorkRequestSummary>(
                new java.util.function.Supplier<ListConfigWorkRequestsRequest.Builder>() {
                    @Override
                    public ListConfigWorkRequestsRequest.Builder get() {
                        return ListConfigWorkRequestsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListConfigWorkRequestsResponse, String>() {
                    @Override
                    public String apply(ListConfigWorkRequestsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListConfigWorkRequestsRequest.Builder>,
                        ListConfigWorkRequestsRequest>() {
                    @Override
                    public ListConfigWorkRequestsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListConfigWorkRequestsRequest.Builder>
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
                        ListConfigWorkRequestsRequest, ListConfigWorkRequestsResponse>() {
                    @Override
                    public ListConfigWorkRequestsResponse apply(
                            ListConfigWorkRequestsRequest request) {
                        return client.listConfigWorkRequests(request);
                    }
                },
                new java.util.function.Function<
                        ListConfigWorkRequestsResponse,
                        java.util.List<
                                com.oracle.bmc.loganalytics.model
                                        .LogAnalyticsConfigWorkRequestSummary>>() {
                    @Override
                    public java.util.List<
                                    com.oracle.bmc.loganalytics.model
                                            .LogAnalyticsConfigWorkRequestSummary>
                            apply(ListConfigWorkRequestsResponse response) {
                        return response.getLogAnalyticsConfigWorkRequestCollection().getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the
     * listEffectiveProperties operation. This iterable will fetch more data from the server as
     * needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses
     *     received from the service.
     */
    public Iterable<ListEffectivePropertiesResponse> listEffectivePropertiesResponseIterator(
            final ListEffectivePropertiesRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListEffectivePropertiesRequest.Builder,
                ListEffectivePropertiesRequest,
                ListEffectivePropertiesResponse>(
                new java.util.function.Supplier<ListEffectivePropertiesRequest.Builder>() {
                    @Override
                    public ListEffectivePropertiesRequest.Builder get() {
                        return ListEffectivePropertiesRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListEffectivePropertiesResponse, String>() {
                    @Override
                    public String apply(ListEffectivePropertiesResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListEffectivePropertiesRequest.Builder>,
                        ListEffectivePropertiesRequest>() {
                    @Override
                    public ListEffectivePropertiesRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListEffectivePropertiesRequest.Builder>
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
                        ListEffectivePropertiesRequest, ListEffectivePropertiesResponse>() {
                    @Override
                    public ListEffectivePropertiesResponse apply(
                            ListEffectivePropertiesRequest request) {
                        return client.listEffectiveProperties(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link
     * com.oracle.bmc.loganalytics.model.EffectivePropertySummary} objects contained in responses
     * from the listEffectiveProperties operation. This iterable will fetch more data from the
     * server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link
     *     com.oracle.bmc.loganalytics.model.EffectivePropertySummary} objects contained in
     *     responses received from the service.
     */
    public Iterable<com.oracle.bmc.loganalytics.model.EffectivePropertySummary>
            listEffectivePropertiesRecordIterator(final ListEffectivePropertiesRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListEffectivePropertiesRequest.Builder,
                ListEffectivePropertiesRequest,
                ListEffectivePropertiesResponse,
                com.oracle.bmc.loganalytics.model.EffectivePropertySummary>(
                new java.util.function.Supplier<ListEffectivePropertiesRequest.Builder>() {
                    @Override
                    public ListEffectivePropertiesRequest.Builder get() {
                        return ListEffectivePropertiesRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListEffectivePropertiesResponse, String>() {
                    @Override
                    public String apply(ListEffectivePropertiesResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListEffectivePropertiesRequest.Builder>,
                        ListEffectivePropertiesRequest>() {
                    @Override
                    public ListEffectivePropertiesRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListEffectivePropertiesRequest.Builder>
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
                        ListEffectivePropertiesRequest, ListEffectivePropertiesResponse>() {
                    @Override
                    public ListEffectivePropertiesResponse apply(
                            ListEffectivePropertiesRequest request) {
                        return client.listEffectiveProperties(request);
                    }
                },
                new java.util.function.Function<
                        ListEffectivePropertiesResponse,
                        java.util.List<
                                com.oracle.bmc.loganalytics.model.EffectivePropertySummary>>() {
                    @Override
                    public java.util.List<
                                    com.oracle.bmc.loganalytics.model.EffectivePropertySummary>
                            apply(ListEffectivePropertiesResponse response) {
                        return response.getEffectivePropertyCollection().getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the
     * listEntityAssociations operation. This iterable will fetch more data from the server as
     * needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses
     *     received from the service.
     */
    public Iterable<ListEntityAssociationsResponse> listEntityAssociationsResponseIterator(
            final ListEntityAssociationsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListEntityAssociationsRequest.Builder,
                ListEntityAssociationsRequest,
                ListEntityAssociationsResponse>(
                new java.util.function.Supplier<ListEntityAssociationsRequest.Builder>() {
                    @Override
                    public ListEntityAssociationsRequest.Builder get() {
                        return ListEntityAssociationsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListEntityAssociationsResponse, String>() {
                    @Override
                    public String apply(ListEntityAssociationsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListEntityAssociationsRequest.Builder>,
                        ListEntityAssociationsRequest>() {
                    @Override
                    public ListEntityAssociationsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListEntityAssociationsRequest.Builder>
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
                        ListEntityAssociationsRequest, ListEntityAssociationsResponse>() {
                    @Override
                    public ListEntityAssociationsResponse apply(
                            ListEntityAssociationsRequest request) {
                        return client.listEntityAssociations(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link
     * com.oracle.bmc.loganalytics.model.LogAnalyticsEntitySummary} objects contained in responses
     * from the listEntityAssociations operation. This iterable will fetch more data from the server
     * as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link
     *     com.oracle.bmc.loganalytics.model.LogAnalyticsEntitySummary} objects contained in
     *     responses received from the service.
     */
    public Iterable<com.oracle.bmc.loganalytics.model.LogAnalyticsEntitySummary>
            listEntityAssociationsRecordIterator(final ListEntityAssociationsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListEntityAssociationsRequest.Builder,
                ListEntityAssociationsRequest,
                ListEntityAssociationsResponse,
                com.oracle.bmc.loganalytics.model.LogAnalyticsEntitySummary>(
                new java.util.function.Supplier<ListEntityAssociationsRequest.Builder>() {
                    @Override
                    public ListEntityAssociationsRequest.Builder get() {
                        return ListEntityAssociationsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListEntityAssociationsResponse, String>() {
                    @Override
                    public String apply(ListEntityAssociationsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListEntityAssociationsRequest.Builder>,
                        ListEntityAssociationsRequest>() {
                    @Override
                    public ListEntityAssociationsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListEntityAssociationsRequest.Builder>
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
                        ListEntityAssociationsRequest, ListEntityAssociationsResponse>() {
                    @Override
                    public ListEntityAssociationsResponse apply(
                            ListEntityAssociationsRequest request) {
                        return client.listEntityAssociations(request);
                    }
                },
                new java.util.function.Function<
                        ListEntityAssociationsResponse,
                        java.util.List<
                                com.oracle.bmc.loganalytics.model.LogAnalyticsEntitySummary>>() {
                    @Override
                    public java.util.List<
                                    com.oracle.bmc.loganalytics.model.LogAnalyticsEntitySummary>
                            apply(ListEntityAssociationsResponse response) {
                        return response.getLogAnalyticsEntityCollection().getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the
     * listEntitySourceAssociations operation. This iterable will fetch more data from the server as
     * needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses
     *     received from the service.
     */
    public Iterable<ListEntitySourceAssociationsResponse>
            listEntitySourceAssociationsResponseIterator(
                    final ListEntitySourceAssociationsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListEntitySourceAssociationsRequest.Builder,
                ListEntitySourceAssociationsRequest,
                ListEntitySourceAssociationsResponse>(
                new java.util.function.Supplier<ListEntitySourceAssociationsRequest.Builder>() {
                    @Override
                    public ListEntitySourceAssociationsRequest.Builder get() {
                        return ListEntitySourceAssociationsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListEntitySourceAssociationsResponse, String>() {
                    @Override
                    public String apply(ListEntitySourceAssociationsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListEntitySourceAssociationsRequest.Builder>,
                        ListEntitySourceAssociationsRequest>() {
                    @Override
                    public ListEntitySourceAssociationsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListEntitySourceAssociationsRequest.Builder>
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
                        ListEntitySourceAssociationsRequest,
                        ListEntitySourceAssociationsResponse>() {
                    @Override
                    public ListEntitySourceAssociationsResponse apply(
                            ListEntitySourceAssociationsRequest request) {
                        return client.listEntitySourceAssociations(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link
     * com.oracle.bmc.loganalytics.model.LogAnalyticsAssociation} objects contained in responses
     * from the listEntitySourceAssociations operation. This iterable will fetch more data from the
     * server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link
     *     com.oracle.bmc.loganalytics.model.LogAnalyticsAssociation} objects contained in responses
     *     received from the service.
     */
    public Iterable<com.oracle.bmc.loganalytics.model.LogAnalyticsAssociation>
            listEntitySourceAssociationsRecordIterator(
                    final ListEntitySourceAssociationsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListEntitySourceAssociationsRequest.Builder,
                ListEntitySourceAssociationsRequest,
                ListEntitySourceAssociationsResponse,
                com.oracle.bmc.loganalytics.model.LogAnalyticsAssociation>(
                new java.util.function.Supplier<ListEntitySourceAssociationsRequest.Builder>() {
                    @Override
                    public ListEntitySourceAssociationsRequest.Builder get() {
                        return ListEntitySourceAssociationsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListEntitySourceAssociationsResponse, String>() {
                    @Override
                    public String apply(ListEntitySourceAssociationsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListEntitySourceAssociationsRequest.Builder>,
                        ListEntitySourceAssociationsRequest>() {
                    @Override
                    public ListEntitySourceAssociationsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListEntitySourceAssociationsRequest.Builder>
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
                        ListEntitySourceAssociationsRequest,
                        ListEntitySourceAssociationsResponse>() {
                    @Override
                    public ListEntitySourceAssociationsResponse apply(
                            ListEntitySourceAssociationsRequest request) {
                        return client.listEntitySourceAssociations(request);
                    }
                },
                new java.util.function.Function<
                        ListEntitySourceAssociationsResponse,
                        java.util.List<
                                com.oracle.bmc.loganalytics.model.LogAnalyticsAssociation>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.loganalytics.model.LogAnalyticsAssociation>
                            apply(ListEntitySourceAssociationsResponse response) {
                        return response.getLogAnalyticsAssociationCollection().getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the listFields
     * operation. This iterable will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses
     *     received from the service.
     */
    public Iterable<ListFieldsResponse> listFieldsResponseIterator(
            final ListFieldsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListFieldsRequest.Builder, ListFieldsRequest, ListFieldsResponse>(
                new java.util.function.Supplier<ListFieldsRequest.Builder>() {
                    @Override
                    public ListFieldsRequest.Builder get() {
                        return ListFieldsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListFieldsResponse, String>() {
                    @Override
                    public String apply(ListFieldsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListFieldsRequest.Builder>,
                        ListFieldsRequest>() {
                    @Override
                    public ListFieldsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListFieldsRequest.Builder>
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
                new java.util.function.Function<ListFieldsRequest, ListFieldsResponse>() {
                    @Override
                    public ListFieldsResponse apply(ListFieldsRequest request) {
                        return client.listFields(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link
     * com.oracle.bmc.loganalytics.model.LogAnalyticsFieldSummary} objects contained in responses
     * from the listFields operation. This iterable will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link
     *     com.oracle.bmc.loganalytics.model.LogAnalyticsFieldSummary} objects contained in
     *     responses received from the service.
     */
    public Iterable<com.oracle.bmc.loganalytics.model.LogAnalyticsFieldSummary>
            listFieldsRecordIterator(final ListFieldsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListFieldsRequest.Builder,
                ListFieldsRequest,
                ListFieldsResponse,
                com.oracle.bmc.loganalytics.model.LogAnalyticsFieldSummary>(
                new java.util.function.Supplier<ListFieldsRequest.Builder>() {
                    @Override
                    public ListFieldsRequest.Builder get() {
                        return ListFieldsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListFieldsResponse, String>() {
                    @Override
                    public String apply(ListFieldsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListFieldsRequest.Builder>,
                        ListFieldsRequest>() {
                    @Override
                    public ListFieldsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListFieldsRequest.Builder>
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
                new java.util.function.Function<ListFieldsRequest, ListFieldsResponse>() {
                    @Override
                    public ListFieldsResponse apply(ListFieldsRequest request) {
                        return client.listFields(request);
                    }
                },
                new java.util.function.Function<
                        ListFieldsResponse,
                        java.util.List<
                                com.oracle.bmc.loganalytics.model.LogAnalyticsFieldSummary>>() {
                    @Override
                    public java.util.List<
                                    com.oracle.bmc.loganalytics.model.LogAnalyticsFieldSummary>
                            apply(ListFieldsResponse response) {
                        return response.getLogAnalyticsFieldCollection().getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the
     * listIngestTimeRules operation. This iterable will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses
     *     received from the service.
     */
    public Iterable<ListIngestTimeRulesResponse> listIngestTimeRulesResponseIterator(
            final ListIngestTimeRulesRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListIngestTimeRulesRequest.Builder,
                ListIngestTimeRulesRequest,
                ListIngestTimeRulesResponse>(
                new java.util.function.Supplier<ListIngestTimeRulesRequest.Builder>() {
                    @Override
                    public ListIngestTimeRulesRequest.Builder get() {
                        return ListIngestTimeRulesRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListIngestTimeRulesResponse, String>() {
                    @Override
                    public String apply(ListIngestTimeRulesResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListIngestTimeRulesRequest.Builder>,
                        ListIngestTimeRulesRequest>() {
                    @Override
                    public ListIngestTimeRulesRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListIngestTimeRulesRequest.Builder>
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
                        ListIngestTimeRulesRequest, ListIngestTimeRulesResponse>() {
                    @Override
                    public ListIngestTimeRulesResponse apply(ListIngestTimeRulesRequest request) {
                        return client.listIngestTimeRules(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link
     * com.oracle.bmc.loganalytics.model.IngestTimeRuleSummary} objects contained in responses from
     * the listIngestTimeRules operation. This iterable will fetch more data from the server as
     * needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link
     *     com.oracle.bmc.loganalytics.model.IngestTimeRuleSummary} objects contained in responses
     *     received from the service.
     */
    public Iterable<com.oracle.bmc.loganalytics.model.IngestTimeRuleSummary>
            listIngestTimeRulesRecordIterator(final ListIngestTimeRulesRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListIngestTimeRulesRequest.Builder,
                ListIngestTimeRulesRequest,
                ListIngestTimeRulesResponse,
                com.oracle.bmc.loganalytics.model.IngestTimeRuleSummary>(
                new java.util.function.Supplier<ListIngestTimeRulesRequest.Builder>() {
                    @Override
                    public ListIngestTimeRulesRequest.Builder get() {
                        return ListIngestTimeRulesRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListIngestTimeRulesResponse, String>() {
                    @Override
                    public String apply(ListIngestTimeRulesResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListIngestTimeRulesRequest.Builder>,
                        ListIngestTimeRulesRequest>() {
                    @Override
                    public ListIngestTimeRulesRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListIngestTimeRulesRequest.Builder>
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
                        ListIngestTimeRulesRequest, ListIngestTimeRulesResponse>() {
                    @Override
                    public ListIngestTimeRulesResponse apply(ListIngestTimeRulesRequest request) {
                        return client.listIngestTimeRules(request);
                    }
                },
                new java.util.function.Function<
                        ListIngestTimeRulesResponse,
                        java.util.List<com.oracle.bmc.loganalytics.model.IngestTimeRuleSummary>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.loganalytics.model.IngestTimeRuleSummary>
                            apply(ListIngestTimeRulesResponse response) {
                        return response.getIngestTimeRuleSummaryCollection().getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the
     * listLabelPriorities operation. This iterable will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses
     *     received from the service.
     */
    public Iterable<ListLabelPrioritiesResponse> listLabelPrioritiesResponseIterator(
            final ListLabelPrioritiesRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListLabelPrioritiesRequest.Builder,
                ListLabelPrioritiesRequest,
                ListLabelPrioritiesResponse>(
                new java.util.function.Supplier<ListLabelPrioritiesRequest.Builder>() {
                    @Override
                    public ListLabelPrioritiesRequest.Builder get() {
                        return ListLabelPrioritiesRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListLabelPrioritiesResponse, String>() {
                    @Override
                    public String apply(ListLabelPrioritiesResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListLabelPrioritiesRequest.Builder>,
                        ListLabelPrioritiesRequest>() {
                    @Override
                    public ListLabelPrioritiesRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListLabelPrioritiesRequest.Builder>
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
                        ListLabelPrioritiesRequest, ListLabelPrioritiesResponse>() {
                    @Override
                    public ListLabelPrioritiesResponse apply(ListLabelPrioritiesRequest request) {
                        return client.listLabelPriorities(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link
     * com.oracle.bmc.loganalytics.model.LabelPriority} objects contained in responses from the
     * listLabelPriorities operation. This iterable will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link
     *     com.oracle.bmc.loganalytics.model.LabelPriority} objects contained in responses received
     *     from the service.
     */
    public Iterable<com.oracle.bmc.loganalytics.model.LabelPriority>
            listLabelPrioritiesRecordIterator(final ListLabelPrioritiesRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListLabelPrioritiesRequest.Builder,
                ListLabelPrioritiesRequest,
                ListLabelPrioritiesResponse,
                com.oracle.bmc.loganalytics.model.LabelPriority>(
                new java.util.function.Supplier<ListLabelPrioritiesRequest.Builder>() {
                    @Override
                    public ListLabelPrioritiesRequest.Builder get() {
                        return ListLabelPrioritiesRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListLabelPrioritiesResponse, String>() {
                    @Override
                    public String apply(ListLabelPrioritiesResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListLabelPrioritiesRequest.Builder>,
                        ListLabelPrioritiesRequest>() {
                    @Override
                    public ListLabelPrioritiesRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListLabelPrioritiesRequest.Builder>
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
                        ListLabelPrioritiesRequest, ListLabelPrioritiesResponse>() {
                    @Override
                    public ListLabelPrioritiesResponse apply(ListLabelPrioritiesRequest request) {
                        return client.listLabelPriorities(request);
                    }
                },
                new java.util.function.Function<
                        ListLabelPrioritiesResponse,
                        java.util.List<com.oracle.bmc.loganalytics.model.LabelPriority>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.loganalytics.model.LabelPriority> apply(
                            ListLabelPrioritiesResponse response) {
                        return response.getLabelPriorityCollection().getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the
     * listLabelSourceDetails operation. This iterable will fetch more data from the server as
     * needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses
     *     received from the service.
     */
    public Iterable<ListLabelSourceDetailsResponse> listLabelSourceDetailsResponseIterator(
            final ListLabelSourceDetailsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListLabelSourceDetailsRequest.Builder,
                ListLabelSourceDetailsRequest,
                ListLabelSourceDetailsResponse>(
                new java.util.function.Supplier<ListLabelSourceDetailsRequest.Builder>() {
                    @Override
                    public ListLabelSourceDetailsRequest.Builder get() {
                        return ListLabelSourceDetailsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListLabelSourceDetailsResponse, String>() {
                    @Override
                    public String apply(ListLabelSourceDetailsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListLabelSourceDetailsRequest.Builder>,
                        ListLabelSourceDetailsRequest>() {
                    @Override
                    public ListLabelSourceDetailsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListLabelSourceDetailsRequest.Builder>
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
                        ListLabelSourceDetailsRequest, ListLabelSourceDetailsResponse>() {
                    @Override
                    public ListLabelSourceDetailsResponse apply(
                            ListLabelSourceDetailsRequest request) {
                        return client.listLabelSourceDetails(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link
     * com.oracle.bmc.loganalytics.model.LabelSourceSummary} objects contained in responses from the
     * listLabelSourceDetails operation. This iterable will fetch more data from the server as
     * needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link
     *     com.oracle.bmc.loganalytics.model.LabelSourceSummary} objects contained in responses
     *     received from the service.
     */
    public Iterable<com.oracle.bmc.loganalytics.model.LabelSourceSummary>
            listLabelSourceDetailsRecordIterator(final ListLabelSourceDetailsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListLabelSourceDetailsRequest.Builder,
                ListLabelSourceDetailsRequest,
                ListLabelSourceDetailsResponse,
                com.oracle.bmc.loganalytics.model.LabelSourceSummary>(
                new java.util.function.Supplier<ListLabelSourceDetailsRequest.Builder>() {
                    @Override
                    public ListLabelSourceDetailsRequest.Builder get() {
                        return ListLabelSourceDetailsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListLabelSourceDetailsResponse, String>() {
                    @Override
                    public String apply(ListLabelSourceDetailsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListLabelSourceDetailsRequest.Builder>,
                        ListLabelSourceDetailsRequest>() {
                    @Override
                    public ListLabelSourceDetailsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListLabelSourceDetailsRequest.Builder>
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
                        ListLabelSourceDetailsRequest, ListLabelSourceDetailsResponse>() {
                    @Override
                    public ListLabelSourceDetailsResponse apply(
                            ListLabelSourceDetailsRequest request) {
                        return client.listLabelSourceDetails(request);
                    }
                },
                new java.util.function.Function<
                        ListLabelSourceDetailsResponse,
                        java.util.List<com.oracle.bmc.loganalytics.model.LabelSourceSummary>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.loganalytics.model.LabelSourceSummary>
                            apply(ListLabelSourceDetailsResponse response) {
                        return response.getLabelSourceCollection().getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the listLabels
     * operation. This iterable will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses
     *     received from the service.
     */
    public Iterable<ListLabelsResponse> listLabelsResponseIterator(
            final ListLabelsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListLabelsRequest.Builder, ListLabelsRequest, ListLabelsResponse>(
                new java.util.function.Supplier<ListLabelsRequest.Builder>() {
                    @Override
                    public ListLabelsRequest.Builder get() {
                        return ListLabelsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListLabelsResponse, String>() {
                    @Override
                    public String apply(ListLabelsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListLabelsRequest.Builder>,
                        ListLabelsRequest>() {
                    @Override
                    public ListLabelsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListLabelsRequest.Builder>
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
                new java.util.function.Function<ListLabelsRequest, ListLabelsResponse>() {
                    @Override
                    public ListLabelsResponse apply(ListLabelsRequest request) {
                        return client.listLabels(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link
     * com.oracle.bmc.loganalytics.model.LogAnalyticsLabelSummary} objects contained in responses
     * from the listLabels operation. This iterable will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link
     *     com.oracle.bmc.loganalytics.model.LogAnalyticsLabelSummary} objects contained in
     *     responses received from the service.
     */
    public Iterable<com.oracle.bmc.loganalytics.model.LogAnalyticsLabelSummary>
            listLabelsRecordIterator(final ListLabelsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListLabelsRequest.Builder,
                ListLabelsRequest,
                ListLabelsResponse,
                com.oracle.bmc.loganalytics.model.LogAnalyticsLabelSummary>(
                new java.util.function.Supplier<ListLabelsRequest.Builder>() {
                    @Override
                    public ListLabelsRequest.Builder get() {
                        return ListLabelsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListLabelsResponse, String>() {
                    @Override
                    public String apply(ListLabelsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListLabelsRequest.Builder>,
                        ListLabelsRequest>() {
                    @Override
                    public ListLabelsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListLabelsRequest.Builder>
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
                new java.util.function.Function<ListLabelsRequest, ListLabelsResponse>() {
                    @Override
                    public ListLabelsResponse apply(ListLabelsRequest request) {
                        return client.listLabels(request);
                    }
                },
                new java.util.function.Function<
                        ListLabelsResponse,
                        java.util.List<
                                com.oracle.bmc.loganalytics.model.LogAnalyticsLabelSummary>>() {
                    @Override
                    public java.util.List<
                                    com.oracle.bmc.loganalytics.model.LogAnalyticsLabelSummary>
                            apply(ListLabelsResponse response) {
                        return response.getLogAnalyticsLabelCollection().getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the
     * listLogAnalyticsEmBridges operation. This iterable will fetch more data from the server as
     * needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses
     *     received from the service.
     */
    public Iterable<ListLogAnalyticsEmBridgesResponse> listLogAnalyticsEmBridgesResponseIterator(
            final ListLogAnalyticsEmBridgesRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListLogAnalyticsEmBridgesRequest.Builder,
                ListLogAnalyticsEmBridgesRequest,
                ListLogAnalyticsEmBridgesResponse>(
                new java.util.function.Supplier<ListLogAnalyticsEmBridgesRequest.Builder>() {
                    @Override
                    public ListLogAnalyticsEmBridgesRequest.Builder get() {
                        return ListLogAnalyticsEmBridgesRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListLogAnalyticsEmBridgesResponse, String>() {
                    @Override
                    public String apply(ListLogAnalyticsEmBridgesResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListLogAnalyticsEmBridgesRequest.Builder>,
                        ListLogAnalyticsEmBridgesRequest>() {
                    @Override
                    public ListLogAnalyticsEmBridgesRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListLogAnalyticsEmBridgesRequest.Builder>
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
                        ListLogAnalyticsEmBridgesRequest, ListLogAnalyticsEmBridgesResponse>() {
                    @Override
                    public ListLogAnalyticsEmBridgesResponse apply(
                            ListLogAnalyticsEmBridgesRequest request) {
                        return client.listLogAnalyticsEmBridges(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link
     * com.oracle.bmc.loganalytics.model.LogAnalyticsEmBridgeSummary} objects contained in responses
     * from the listLogAnalyticsEmBridges operation. This iterable will fetch more data from the
     * server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link
     *     com.oracle.bmc.loganalytics.model.LogAnalyticsEmBridgeSummary} objects contained in
     *     responses received from the service.
     */
    public Iterable<com.oracle.bmc.loganalytics.model.LogAnalyticsEmBridgeSummary>
            listLogAnalyticsEmBridgesRecordIterator(
                    final ListLogAnalyticsEmBridgesRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListLogAnalyticsEmBridgesRequest.Builder,
                ListLogAnalyticsEmBridgesRequest,
                ListLogAnalyticsEmBridgesResponse,
                com.oracle.bmc.loganalytics.model.LogAnalyticsEmBridgeSummary>(
                new java.util.function.Supplier<ListLogAnalyticsEmBridgesRequest.Builder>() {
                    @Override
                    public ListLogAnalyticsEmBridgesRequest.Builder get() {
                        return ListLogAnalyticsEmBridgesRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListLogAnalyticsEmBridgesResponse, String>() {
                    @Override
                    public String apply(ListLogAnalyticsEmBridgesResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListLogAnalyticsEmBridgesRequest.Builder>,
                        ListLogAnalyticsEmBridgesRequest>() {
                    @Override
                    public ListLogAnalyticsEmBridgesRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListLogAnalyticsEmBridgesRequest.Builder>
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
                        ListLogAnalyticsEmBridgesRequest, ListLogAnalyticsEmBridgesResponse>() {
                    @Override
                    public ListLogAnalyticsEmBridgesResponse apply(
                            ListLogAnalyticsEmBridgesRequest request) {
                        return client.listLogAnalyticsEmBridges(request);
                    }
                },
                new java.util.function.Function<
                        ListLogAnalyticsEmBridgesResponse,
                        java.util.List<
                                com.oracle.bmc.loganalytics.model.LogAnalyticsEmBridgeSummary>>() {
                    @Override
                    public java.util.List<
                                    com.oracle.bmc.loganalytics.model.LogAnalyticsEmBridgeSummary>
                            apply(ListLogAnalyticsEmBridgesResponse response) {
                        return response.getLogAnalyticsEmBridgeCollection().getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the
     * listLogAnalyticsEntities operation. This iterable will fetch more data from the server as
     * needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses
     *     received from the service.
     */
    public Iterable<ListLogAnalyticsEntitiesResponse> listLogAnalyticsEntitiesResponseIterator(
            final ListLogAnalyticsEntitiesRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListLogAnalyticsEntitiesRequest.Builder,
                ListLogAnalyticsEntitiesRequest,
                ListLogAnalyticsEntitiesResponse>(
                new java.util.function.Supplier<ListLogAnalyticsEntitiesRequest.Builder>() {
                    @Override
                    public ListLogAnalyticsEntitiesRequest.Builder get() {
                        return ListLogAnalyticsEntitiesRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListLogAnalyticsEntitiesResponse, String>() {
                    @Override
                    public String apply(ListLogAnalyticsEntitiesResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListLogAnalyticsEntitiesRequest.Builder>,
                        ListLogAnalyticsEntitiesRequest>() {
                    @Override
                    public ListLogAnalyticsEntitiesRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListLogAnalyticsEntitiesRequest.Builder>
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
                        ListLogAnalyticsEntitiesRequest, ListLogAnalyticsEntitiesResponse>() {
                    @Override
                    public ListLogAnalyticsEntitiesResponse apply(
                            ListLogAnalyticsEntitiesRequest request) {
                        return client.listLogAnalyticsEntities(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link
     * com.oracle.bmc.loganalytics.model.LogAnalyticsEntitySummary} objects contained in responses
     * from the listLogAnalyticsEntities operation. This iterable will fetch more data from the
     * server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link
     *     com.oracle.bmc.loganalytics.model.LogAnalyticsEntitySummary} objects contained in
     *     responses received from the service.
     */
    public Iterable<com.oracle.bmc.loganalytics.model.LogAnalyticsEntitySummary>
            listLogAnalyticsEntitiesRecordIterator(final ListLogAnalyticsEntitiesRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListLogAnalyticsEntitiesRequest.Builder,
                ListLogAnalyticsEntitiesRequest,
                ListLogAnalyticsEntitiesResponse,
                com.oracle.bmc.loganalytics.model.LogAnalyticsEntitySummary>(
                new java.util.function.Supplier<ListLogAnalyticsEntitiesRequest.Builder>() {
                    @Override
                    public ListLogAnalyticsEntitiesRequest.Builder get() {
                        return ListLogAnalyticsEntitiesRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListLogAnalyticsEntitiesResponse, String>() {
                    @Override
                    public String apply(ListLogAnalyticsEntitiesResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListLogAnalyticsEntitiesRequest.Builder>,
                        ListLogAnalyticsEntitiesRequest>() {
                    @Override
                    public ListLogAnalyticsEntitiesRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListLogAnalyticsEntitiesRequest.Builder>
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
                        ListLogAnalyticsEntitiesRequest, ListLogAnalyticsEntitiesResponse>() {
                    @Override
                    public ListLogAnalyticsEntitiesResponse apply(
                            ListLogAnalyticsEntitiesRequest request) {
                        return client.listLogAnalyticsEntities(request);
                    }
                },
                new java.util.function.Function<
                        ListLogAnalyticsEntitiesResponse,
                        java.util.List<
                                com.oracle.bmc.loganalytics.model.LogAnalyticsEntitySummary>>() {
                    @Override
                    public java.util.List<
                                    com.oracle.bmc.loganalytics.model.LogAnalyticsEntitySummary>
                            apply(ListLogAnalyticsEntitiesResponse response) {
                        return response.getLogAnalyticsEntityCollection().getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the
     * listLogAnalyticsEntityTopology operation. This iterable will fetch more data from the server
     * as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses
     *     received from the service.
     */
    public Iterable<ListLogAnalyticsEntityTopologyResponse>
            listLogAnalyticsEntityTopologyResponseIterator(
                    final ListLogAnalyticsEntityTopologyRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListLogAnalyticsEntityTopologyRequest.Builder,
                ListLogAnalyticsEntityTopologyRequest,
                ListLogAnalyticsEntityTopologyResponse>(
                new java.util.function.Supplier<ListLogAnalyticsEntityTopologyRequest.Builder>() {
                    @Override
                    public ListLogAnalyticsEntityTopologyRequest.Builder get() {
                        return ListLogAnalyticsEntityTopologyRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListLogAnalyticsEntityTopologyResponse, String>() {
                    @Override
                    public String apply(ListLogAnalyticsEntityTopologyResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListLogAnalyticsEntityTopologyRequest.Builder>,
                        ListLogAnalyticsEntityTopologyRequest>() {
                    @Override
                    public ListLogAnalyticsEntityTopologyRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListLogAnalyticsEntityTopologyRequest.Builder>
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
                        ListLogAnalyticsEntityTopologyRequest,
                        ListLogAnalyticsEntityTopologyResponse>() {
                    @Override
                    public ListLogAnalyticsEntityTopologyResponse apply(
                            ListLogAnalyticsEntityTopologyRequest request) {
                        return client.listLogAnalyticsEntityTopology(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link
     * com.oracle.bmc.loganalytics.model.LogAnalyticsEntityTopologySummary} objects contained in
     * responses from the listLogAnalyticsEntityTopology operation. This iterable will fetch more
     * data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link
     *     com.oracle.bmc.loganalytics.model.LogAnalyticsEntityTopologySummary} objects contained in
     *     responses received from the service.
     */
    public Iterable<com.oracle.bmc.loganalytics.model.LogAnalyticsEntityTopologySummary>
            listLogAnalyticsEntityTopologyRecordIterator(
                    final ListLogAnalyticsEntityTopologyRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListLogAnalyticsEntityTopologyRequest.Builder,
                ListLogAnalyticsEntityTopologyRequest,
                ListLogAnalyticsEntityTopologyResponse,
                com.oracle.bmc.loganalytics.model.LogAnalyticsEntityTopologySummary>(
                new java.util.function.Supplier<ListLogAnalyticsEntityTopologyRequest.Builder>() {
                    @Override
                    public ListLogAnalyticsEntityTopologyRequest.Builder get() {
                        return ListLogAnalyticsEntityTopologyRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListLogAnalyticsEntityTopologyResponse, String>() {
                    @Override
                    public String apply(ListLogAnalyticsEntityTopologyResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListLogAnalyticsEntityTopologyRequest.Builder>,
                        ListLogAnalyticsEntityTopologyRequest>() {
                    @Override
                    public ListLogAnalyticsEntityTopologyRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListLogAnalyticsEntityTopologyRequest.Builder>
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
                        ListLogAnalyticsEntityTopologyRequest,
                        ListLogAnalyticsEntityTopologyResponse>() {
                    @Override
                    public ListLogAnalyticsEntityTopologyResponse apply(
                            ListLogAnalyticsEntityTopologyRequest request) {
                        return client.listLogAnalyticsEntityTopology(request);
                    }
                },
                new java.util.function.Function<
                        ListLogAnalyticsEntityTopologyResponse,
                        java.util.List<
                                com.oracle.bmc.loganalytics.model
                                        .LogAnalyticsEntityTopologySummary>>() {
                    @Override
                    public java.util.List<
                                    com.oracle.bmc.loganalytics.model
                                            .LogAnalyticsEntityTopologySummary>
                            apply(ListLogAnalyticsEntityTopologyResponse response) {
                        return response.getLogAnalyticsEntityTopologyCollection().getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the
     * listLogAnalyticsEntityTypes operation. This iterable will fetch more data from the server as
     * needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses
     *     received from the service.
     */
    public Iterable<ListLogAnalyticsEntityTypesResponse>
            listLogAnalyticsEntityTypesResponseIterator(
                    final ListLogAnalyticsEntityTypesRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListLogAnalyticsEntityTypesRequest.Builder,
                ListLogAnalyticsEntityTypesRequest,
                ListLogAnalyticsEntityTypesResponse>(
                new java.util.function.Supplier<ListLogAnalyticsEntityTypesRequest.Builder>() {
                    @Override
                    public ListLogAnalyticsEntityTypesRequest.Builder get() {
                        return ListLogAnalyticsEntityTypesRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListLogAnalyticsEntityTypesResponse, String>() {
                    @Override
                    public String apply(ListLogAnalyticsEntityTypesResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListLogAnalyticsEntityTypesRequest.Builder>,
                        ListLogAnalyticsEntityTypesRequest>() {
                    @Override
                    public ListLogAnalyticsEntityTypesRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListLogAnalyticsEntityTypesRequest.Builder>
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
                        ListLogAnalyticsEntityTypesRequest, ListLogAnalyticsEntityTypesResponse>() {
                    @Override
                    public ListLogAnalyticsEntityTypesResponse apply(
                            ListLogAnalyticsEntityTypesRequest request) {
                        return client.listLogAnalyticsEntityTypes(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link
     * com.oracle.bmc.loganalytics.model.LogAnalyticsEntityTypeSummary} objects contained in
     * responses from the listLogAnalyticsEntityTypes operation. This iterable will fetch more data
     * from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link
     *     com.oracle.bmc.loganalytics.model.LogAnalyticsEntityTypeSummary} objects contained in
     *     responses received from the service.
     */
    public Iterable<com.oracle.bmc.loganalytics.model.LogAnalyticsEntityTypeSummary>
            listLogAnalyticsEntityTypesRecordIterator(
                    final ListLogAnalyticsEntityTypesRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListLogAnalyticsEntityTypesRequest.Builder,
                ListLogAnalyticsEntityTypesRequest,
                ListLogAnalyticsEntityTypesResponse,
                com.oracle.bmc.loganalytics.model.LogAnalyticsEntityTypeSummary>(
                new java.util.function.Supplier<ListLogAnalyticsEntityTypesRequest.Builder>() {
                    @Override
                    public ListLogAnalyticsEntityTypesRequest.Builder get() {
                        return ListLogAnalyticsEntityTypesRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListLogAnalyticsEntityTypesResponse, String>() {
                    @Override
                    public String apply(ListLogAnalyticsEntityTypesResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListLogAnalyticsEntityTypesRequest.Builder>,
                        ListLogAnalyticsEntityTypesRequest>() {
                    @Override
                    public ListLogAnalyticsEntityTypesRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListLogAnalyticsEntityTypesRequest.Builder>
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
                        ListLogAnalyticsEntityTypesRequest, ListLogAnalyticsEntityTypesResponse>() {
                    @Override
                    public ListLogAnalyticsEntityTypesResponse apply(
                            ListLogAnalyticsEntityTypesRequest request) {
                        return client.listLogAnalyticsEntityTypes(request);
                    }
                },
                new java.util.function.Function<
                        ListLogAnalyticsEntityTypesResponse,
                        java.util.List<
                                com.oracle.bmc.loganalytics.model
                                        .LogAnalyticsEntityTypeSummary>>() {
                    @Override
                    public java.util.List<
                                    com.oracle.bmc.loganalytics.model.LogAnalyticsEntityTypeSummary>
                            apply(ListLogAnalyticsEntityTypesResponse response) {
                        return response.getLogAnalyticsEntityTypeCollection().getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the
     * listLogAnalyticsLogGroups operation. This iterable will fetch more data from the server as
     * needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses
     *     received from the service.
     */
    public Iterable<ListLogAnalyticsLogGroupsResponse> listLogAnalyticsLogGroupsResponseIterator(
            final ListLogAnalyticsLogGroupsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListLogAnalyticsLogGroupsRequest.Builder,
                ListLogAnalyticsLogGroupsRequest,
                ListLogAnalyticsLogGroupsResponse>(
                new java.util.function.Supplier<ListLogAnalyticsLogGroupsRequest.Builder>() {
                    @Override
                    public ListLogAnalyticsLogGroupsRequest.Builder get() {
                        return ListLogAnalyticsLogGroupsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListLogAnalyticsLogGroupsResponse, String>() {
                    @Override
                    public String apply(ListLogAnalyticsLogGroupsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListLogAnalyticsLogGroupsRequest.Builder>,
                        ListLogAnalyticsLogGroupsRequest>() {
                    @Override
                    public ListLogAnalyticsLogGroupsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListLogAnalyticsLogGroupsRequest.Builder>
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
                        ListLogAnalyticsLogGroupsRequest, ListLogAnalyticsLogGroupsResponse>() {
                    @Override
                    public ListLogAnalyticsLogGroupsResponse apply(
                            ListLogAnalyticsLogGroupsRequest request) {
                        return client.listLogAnalyticsLogGroups(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link
     * com.oracle.bmc.loganalytics.model.LogAnalyticsLogGroupSummary} objects contained in responses
     * from the listLogAnalyticsLogGroups operation. This iterable will fetch more data from the
     * server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link
     *     com.oracle.bmc.loganalytics.model.LogAnalyticsLogGroupSummary} objects contained in
     *     responses received from the service.
     */
    public Iterable<com.oracle.bmc.loganalytics.model.LogAnalyticsLogGroupSummary>
            listLogAnalyticsLogGroupsRecordIterator(
                    final ListLogAnalyticsLogGroupsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListLogAnalyticsLogGroupsRequest.Builder,
                ListLogAnalyticsLogGroupsRequest,
                ListLogAnalyticsLogGroupsResponse,
                com.oracle.bmc.loganalytics.model.LogAnalyticsLogGroupSummary>(
                new java.util.function.Supplier<ListLogAnalyticsLogGroupsRequest.Builder>() {
                    @Override
                    public ListLogAnalyticsLogGroupsRequest.Builder get() {
                        return ListLogAnalyticsLogGroupsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListLogAnalyticsLogGroupsResponse, String>() {
                    @Override
                    public String apply(ListLogAnalyticsLogGroupsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListLogAnalyticsLogGroupsRequest.Builder>,
                        ListLogAnalyticsLogGroupsRequest>() {
                    @Override
                    public ListLogAnalyticsLogGroupsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListLogAnalyticsLogGroupsRequest.Builder>
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
                        ListLogAnalyticsLogGroupsRequest, ListLogAnalyticsLogGroupsResponse>() {
                    @Override
                    public ListLogAnalyticsLogGroupsResponse apply(
                            ListLogAnalyticsLogGroupsRequest request) {
                        return client.listLogAnalyticsLogGroups(request);
                    }
                },
                new java.util.function.Function<
                        ListLogAnalyticsLogGroupsResponse,
                        java.util.List<
                                com.oracle.bmc.loganalytics.model.LogAnalyticsLogGroupSummary>>() {
                    @Override
                    public java.util.List<
                                    com.oracle.bmc.loganalytics.model.LogAnalyticsLogGroupSummary>
                            apply(ListLogAnalyticsLogGroupsResponse response) {
                        return response.getLogAnalyticsLogGroupSummaryCollection().getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the
     * listLogAnalyticsObjectCollectionRules operation. This iterable will fetch more data from the
     * server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses
     *     received from the service.
     */
    public Iterable<ListLogAnalyticsObjectCollectionRulesResponse>
            listLogAnalyticsObjectCollectionRulesResponseIterator(
                    final ListLogAnalyticsObjectCollectionRulesRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListLogAnalyticsObjectCollectionRulesRequest.Builder,
                ListLogAnalyticsObjectCollectionRulesRequest,
                ListLogAnalyticsObjectCollectionRulesResponse>(
                new java.util.function.Supplier<
                        ListLogAnalyticsObjectCollectionRulesRequest.Builder>() {
                    @Override
                    public ListLogAnalyticsObjectCollectionRulesRequest.Builder get() {
                        return ListLogAnalyticsObjectCollectionRulesRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<
                        ListLogAnalyticsObjectCollectionRulesResponse, String>() {
                    @Override
                    public String apply(ListLogAnalyticsObjectCollectionRulesResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListLogAnalyticsObjectCollectionRulesRequest.Builder>,
                        ListLogAnalyticsObjectCollectionRulesRequest>() {
                    @Override
                    public ListLogAnalyticsObjectCollectionRulesRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListLogAnalyticsObjectCollectionRulesRequest.Builder>
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
                        ListLogAnalyticsObjectCollectionRulesRequest,
                        ListLogAnalyticsObjectCollectionRulesResponse>() {
                    @Override
                    public ListLogAnalyticsObjectCollectionRulesResponse apply(
                            ListLogAnalyticsObjectCollectionRulesRequest request) {
                        return client.listLogAnalyticsObjectCollectionRules(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link
     * com.oracle.bmc.loganalytics.model.LogAnalyticsObjectCollectionRuleSummary} objects contained
     * in responses from the listLogAnalyticsObjectCollectionRules operation. This iterable will
     * fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link
     *     com.oracle.bmc.loganalytics.model.LogAnalyticsObjectCollectionRuleSummary} objects
     *     contained in responses received from the service.
     */
    public Iterable<com.oracle.bmc.loganalytics.model.LogAnalyticsObjectCollectionRuleSummary>
            listLogAnalyticsObjectCollectionRulesRecordIterator(
                    final ListLogAnalyticsObjectCollectionRulesRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListLogAnalyticsObjectCollectionRulesRequest.Builder,
                ListLogAnalyticsObjectCollectionRulesRequest,
                ListLogAnalyticsObjectCollectionRulesResponse,
                com.oracle.bmc.loganalytics.model.LogAnalyticsObjectCollectionRuleSummary>(
                new java.util.function.Supplier<
                        ListLogAnalyticsObjectCollectionRulesRequest.Builder>() {
                    @Override
                    public ListLogAnalyticsObjectCollectionRulesRequest.Builder get() {
                        return ListLogAnalyticsObjectCollectionRulesRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<
                        ListLogAnalyticsObjectCollectionRulesResponse, String>() {
                    @Override
                    public String apply(ListLogAnalyticsObjectCollectionRulesResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListLogAnalyticsObjectCollectionRulesRequest.Builder>,
                        ListLogAnalyticsObjectCollectionRulesRequest>() {
                    @Override
                    public ListLogAnalyticsObjectCollectionRulesRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListLogAnalyticsObjectCollectionRulesRequest.Builder>
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
                        ListLogAnalyticsObjectCollectionRulesRequest,
                        ListLogAnalyticsObjectCollectionRulesResponse>() {
                    @Override
                    public ListLogAnalyticsObjectCollectionRulesResponse apply(
                            ListLogAnalyticsObjectCollectionRulesRequest request) {
                        return client.listLogAnalyticsObjectCollectionRules(request);
                    }
                },
                new java.util.function.Function<
                        ListLogAnalyticsObjectCollectionRulesResponse,
                        java.util.List<
                                com.oracle.bmc.loganalytics.model
                                        .LogAnalyticsObjectCollectionRuleSummary>>() {
                    @Override
                    public java.util.List<
                                    com.oracle.bmc.loganalytics.model
                                            .LogAnalyticsObjectCollectionRuleSummary>
                            apply(ListLogAnalyticsObjectCollectionRulesResponse response) {
                        return response.getLogAnalyticsObjectCollectionRuleCollection().getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the listLookups
     * operation. This iterable will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses
     *     received from the service.
     */
    public Iterable<ListLookupsResponse> listLookupsResponseIterator(
            final ListLookupsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListLookupsRequest.Builder, ListLookupsRequest, ListLookupsResponse>(
                new java.util.function.Supplier<ListLookupsRequest.Builder>() {
                    @Override
                    public ListLookupsRequest.Builder get() {
                        return ListLookupsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListLookupsResponse, String>() {
                    @Override
                    public String apply(ListLookupsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListLookupsRequest.Builder>,
                        ListLookupsRequest>() {
                    @Override
                    public ListLookupsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListLookupsRequest.Builder>
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
                new java.util.function.Function<ListLookupsRequest, ListLookupsResponse>() {
                    @Override
                    public ListLookupsResponse apply(ListLookupsRequest request) {
                        return client.listLookups(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link
     * com.oracle.bmc.loganalytics.model.LogAnalyticsLookup} objects contained in responses from the
     * listLookups operation. This iterable will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link
     *     com.oracle.bmc.loganalytics.model.LogAnalyticsLookup} objects contained in responses
     *     received from the service.
     */
    public Iterable<com.oracle.bmc.loganalytics.model.LogAnalyticsLookup> listLookupsRecordIterator(
            final ListLookupsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListLookupsRequest.Builder,
                ListLookupsRequest,
                ListLookupsResponse,
                com.oracle.bmc.loganalytics.model.LogAnalyticsLookup>(
                new java.util.function.Supplier<ListLookupsRequest.Builder>() {
                    @Override
                    public ListLookupsRequest.Builder get() {
                        return ListLookupsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListLookupsResponse, String>() {
                    @Override
                    public String apply(ListLookupsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListLookupsRequest.Builder>,
                        ListLookupsRequest>() {
                    @Override
                    public ListLookupsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListLookupsRequest.Builder>
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
                new java.util.function.Function<ListLookupsRequest, ListLookupsResponse>() {
                    @Override
                    public ListLookupsResponse apply(ListLookupsRequest request) {
                        return client.listLookups(request);
                    }
                },
                new java.util.function.Function<
                        ListLookupsResponse,
                        java.util.List<com.oracle.bmc.loganalytics.model.LogAnalyticsLookup>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.loganalytics.model.LogAnalyticsLookup>
                            apply(ListLookupsResponse response) {
                        return response.getLogAnalyticsLookupCollection().getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the
     * listMetaSourceTypes operation. This iterable will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses
     *     received from the service.
     */
    public Iterable<ListMetaSourceTypesResponse> listMetaSourceTypesResponseIterator(
            final ListMetaSourceTypesRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListMetaSourceTypesRequest.Builder,
                ListMetaSourceTypesRequest,
                ListMetaSourceTypesResponse>(
                new java.util.function.Supplier<ListMetaSourceTypesRequest.Builder>() {
                    @Override
                    public ListMetaSourceTypesRequest.Builder get() {
                        return ListMetaSourceTypesRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListMetaSourceTypesResponse, String>() {
                    @Override
                    public String apply(ListMetaSourceTypesResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListMetaSourceTypesRequest.Builder>,
                        ListMetaSourceTypesRequest>() {
                    @Override
                    public ListMetaSourceTypesRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListMetaSourceTypesRequest.Builder>
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
                        ListMetaSourceTypesRequest, ListMetaSourceTypesResponse>() {
                    @Override
                    public ListMetaSourceTypesResponse apply(ListMetaSourceTypesRequest request) {
                        return client.listMetaSourceTypes(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link
     * com.oracle.bmc.loganalytics.model.LogAnalyticsMetaSourceType} objects contained in responses
     * from the listMetaSourceTypes operation. This iterable will fetch more data from the server as
     * needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link
     *     com.oracle.bmc.loganalytics.model.LogAnalyticsMetaSourceType} objects contained in
     *     responses received from the service.
     */
    public Iterable<com.oracle.bmc.loganalytics.model.LogAnalyticsMetaSourceType>
            listMetaSourceTypesRecordIterator(final ListMetaSourceTypesRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListMetaSourceTypesRequest.Builder,
                ListMetaSourceTypesRequest,
                ListMetaSourceTypesResponse,
                com.oracle.bmc.loganalytics.model.LogAnalyticsMetaSourceType>(
                new java.util.function.Supplier<ListMetaSourceTypesRequest.Builder>() {
                    @Override
                    public ListMetaSourceTypesRequest.Builder get() {
                        return ListMetaSourceTypesRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListMetaSourceTypesResponse, String>() {
                    @Override
                    public String apply(ListMetaSourceTypesResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListMetaSourceTypesRequest.Builder>,
                        ListMetaSourceTypesRequest>() {
                    @Override
                    public ListMetaSourceTypesRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListMetaSourceTypesRequest.Builder>
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
                        ListMetaSourceTypesRequest, ListMetaSourceTypesResponse>() {
                    @Override
                    public ListMetaSourceTypesResponse apply(ListMetaSourceTypesRequest request) {
                        return client.listMetaSourceTypes(request);
                    }
                },
                new java.util.function.Function<
                        ListMetaSourceTypesResponse,
                        java.util.List<
                                com.oracle.bmc.loganalytics.model.LogAnalyticsMetaSourceType>>() {
                    @Override
                    public java.util.List<
                                    com.oracle.bmc.loganalytics.model.LogAnalyticsMetaSourceType>
                            apply(ListMetaSourceTypesResponse response) {
                        return response.getLogAnalyticsMetaSourceTypeCollection().getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the
     * listOverlappingRecalls operation. This iterable will fetch more data from the server as
     * needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses
     *     received from the service.
     */
    public Iterable<ListOverlappingRecallsResponse> listOverlappingRecallsResponseIterator(
            final ListOverlappingRecallsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListOverlappingRecallsRequest.Builder,
                ListOverlappingRecallsRequest,
                ListOverlappingRecallsResponse>(
                new java.util.function.Supplier<ListOverlappingRecallsRequest.Builder>() {
                    @Override
                    public ListOverlappingRecallsRequest.Builder get() {
                        return ListOverlappingRecallsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListOverlappingRecallsResponse, String>() {
                    @Override
                    public String apply(ListOverlappingRecallsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListOverlappingRecallsRequest.Builder>,
                        ListOverlappingRecallsRequest>() {
                    @Override
                    public ListOverlappingRecallsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListOverlappingRecallsRequest.Builder>
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
                        ListOverlappingRecallsRequest, ListOverlappingRecallsResponse>() {
                    @Override
                    public ListOverlappingRecallsResponse apply(
                            ListOverlappingRecallsRequest request) {
                        return client.listOverlappingRecalls(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link
     * com.oracle.bmc.loganalytics.model.OverlappingRecallSummary} objects contained in responses
     * from the listOverlappingRecalls operation. This iterable will fetch more data from the server
     * as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link
     *     com.oracle.bmc.loganalytics.model.OverlappingRecallSummary} objects contained in
     *     responses received from the service.
     */
    public Iterable<com.oracle.bmc.loganalytics.model.OverlappingRecallSummary>
            listOverlappingRecallsRecordIterator(final ListOverlappingRecallsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListOverlappingRecallsRequest.Builder,
                ListOverlappingRecallsRequest,
                ListOverlappingRecallsResponse,
                com.oracle.bmc.loganalytics.model.OverlappingRecallSummary>(
                new java.util.function.Supplier<ListOverlappingRecallsRequest.Builder>() {
                    @Override
                    public ListOverlappingRecallsRequest.Builder get() {
                        return ListOverlappingRecallsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListOverlappingRecallsResponse, String>() {
                    @Override
                    public String apply(ListOverlappingRecallsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListOverlappingRecallsRequest.Builder>,
                        ListOverlappingRecallsRequest>() {
                    @Override
                    public ListOverlappingRecallsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListOverlappingRecallsRequest.Builder>
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
                        ListOverlappingRecallsRequest, ListOverlappingRecallsResponse>() {
                    @Override
                    public ListOverlappingRecallsResponse apply(
                            ListOverlappingRecallsRequest request) {
                        return client.listOverlappingRecalls(request);
                    }
                },
                new java.util.function.Function<
                        ListOverlappingRecallsResponse,
                        java.util.List<
                                com.oracle.bmc.loganalytics.model.OverlappingRecallSummary>>() {
                    @Override
                    public java.util.List<
                                    com.oracle.bmc.loganalytics.model.OverlappingRecallSummary>
                            apply(ListOverlappingRecallsResponse response) {
                        return response.getOverlappingRecallCollection().getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the
     * listParserFunctions operation. This iterable will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses
     *     received from the service.
     */
    public Iterable<ListParserFunctionsResponse> listParserFunctionsResponseIterator(
            final ListParserFunctionsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListParserFunctionsRequest.Builder,
                ListParserFunctionsRequest,
                ListParserFunctionsResponse>(
                new java.util.function.Supplier<ListParserFunctionsRequest.Builder>() {
                    @Override
                    public ListParserFunctionsRequest.Builder get() {
                        return ListParserFunctionsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListParserFunctionsResponse, String>() {
                    @Override
                    public String apply(ListParserFunctionsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListParserFunctionsRequest.Builder>,
                        ListParserFunctionsRequest>() {
                    @Override
                    public ListParserFunctionsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListParserFunctionsRequest.Builder>
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
                        ListParserFunctionsRequest, ListParserFunctionsResponse>() {
                    @Override
                    public ListParserFunctionsResponse apply(ListParserFunctionsRequest request) {
                        return client.listParserFunctions(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link
     * com.oracle.bmc.loganalytics.model.LogAnalyticsParserFunction} objects contained in responses
     * from the listParserFunctions operation. This iterable will fetch more data from the server as
     * needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link
     *     com.oracle.bmc.loganalytics.model.LogAnalyticsParserFunction} objects contained in
     *     responses received from the service.
     */
    public Iterable<com.oracle.bmc.loganalytics.model.LogAnalyticsParserFunction>
            listParserFunctionsRecordIterator(final ListParserFunctionsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListParserFunctionsRequest.Builder,
                ListParserFunctionsRequest,
                ListParserFunctionsResponse,
                com.oracle.bmc.loganalytics.model.LogAnalyticsParserFunction>(
                new java.util.function.Supplier<ListParserFunctionsRequest.Builder>() {
                    @Override
                    public ListParserFunctionsRequest.Builder get() {
                        return ListParserFunctionsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListParserFunctionsResponse, String>() {
                    @Override
                    public String apply(ListParserFunctionsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListParserFunctionsRequest.Builder>,
                        ListParserFunctionsRequest>() {
                    @Override
                    public ListParserFunctionsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListParserFunctionsRequest.Builder>
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
                        ListParserFunctionsRequest, ListParserFunctionsResponse>() {
                    @Override
                    public ListParserFunctionsResponse apply(ListParserFunctionsRequest request) {
                        return client.listParserFunctions(request);
                    }
                },
                new java.util.function.Function<
                        ListParserFunctionsResponse,
                        java.util.List<
                                com.oracle.bmc.loganalytics.model.LogAnalyticsParserFunction>>() {
                    @Override
                    public java.util.List<
                                    com.oracle.bmc.loganalytics.model.LogAnalyticsParserFunction>
                            apply(ListParserFunctionsResponse response) {
                        return response.getLogAnalyticsParserFunctionCollection().getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the
     * listParserMetaPlugins operation. This iterable will fetch more data from the server as
     * needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses
     *     received from the service.
     */
    public Iterable<ListParserMetaPluginsResponse> listParserMetaPluginsResponseIterator(
            final ListParserMetaPluginsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListParserMetaPluginsRequest.Builder,
                ListParserMetaPluginsRequest,
                ListParserMetaPluginsResponse>(
                new java.util.function.Supplier<ListParserMetaPluginsRequest.Builder>() {
                    @Override
                    public ListParserMetaPluginsRequest.Builder get() {
                        return ListParserMetaPluginsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListParserMetaPluginsResponse, String>() {
                    @Override
                    public String apply(ListParserMetaPluginsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListParserMetaPluginsRequest.Builder>,
                        ListParserMetaPluginsRequest>() {
                    @Override
                    public ListParserMetaPluginsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListParserMetaPluginsRequest.Builder>
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
                        ListParserMetaPluginsRequest, ListParserMetaPluginsResponse>() {
                    @Override
                    public ListParserMetaPluginsResponse apply(
                            ListParserMetaPluginsRequest request) {
                        return client.listParserMetaPlugins(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link
     * com.oracle.bmc.loganalytics.model.LogAnalyticsParserMetaPlugin} objects contained in
     * responses from the listParserMetaPlugins operation. This iterable will fetch more data from
     * the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link
     *     com.oracle.bmc.loganalytics.model.LogAnalyticsParserMetaPlugin} objects contained in
     *     responses received from the service.
     */
    public Iterable<com.oracle.bmc.loganalytics.model.LogAnalyticsParserMetaPlugin>
            listParserMetaPluginsRecordIterator(final ListParserMetaPluginsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListParserMetaPluginsRequest.Builder,
                ListParserMetaPluginsRequest,
                ListParserMetaPluginsResponse,
                com.oracle.bmc.loganalytics.model.LogAnalyticsParserMetaPlugin>(
                new java.util.function.Supplier<ListParserMetaPluginsRequest.Builder>() {
                    @Override
                    public ListParserMetaPluginsRequest.Builder get() {
                        return ListParserMetaPluginsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListParserMetaPluginsResponse, String>() {
                    @Override
                    public String apply(ListParserMetaPluginsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListParserMetaPluginsRequest.Builder>,
                        ListParserMetaPluginsRequest>() {
                    @Override
                    public ListParserMetaPluginsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListParserMetaPluginsRequest.Builder>
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
                        ListParserMetaPluginsRequest, ListParserMetaPluginsResponse>() {
                    @Override
                    public ListParserMetaPluginsResponse apply(
                            ListParserMetaPluginsRequest request) {
                        return client.listParserMetaPlugins(request);
                    }
                },
                new java.util.function.Function<
                        ListParserMetaPluginsResponse,
                        java.util.List<
                                com.oracle.bmc.loganalytics.model.LogAnalyticsParserMetaPlugin>>() {
                    @Override
                    public java.util.List<
                                    com.oracle.bmc.loganalytics.model.LogAnalyticsParserMetaPlugin>
                            apply(ListParserMetaPluginsResponse response) {
                        return response.getLogAnalyticsParserMetaPluginCollection().getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the listParsers
     * operation. This iterable will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses
     *     received from the service.
     */
    public Iterable<ListParsersResponse> listParsersResponseIterator(
            final ListParsersRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListParsersRequest.Builder, ListParsersRequest, ListParsersResponse>(
                new java.util.function.Supplier<ListParsersRequest.Builder>() {
                    @Override
                    public ListParsersRequest.Builder get() {
                        return ListParsersRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListParsersResponse, String>() {
                    @Override
                    public String apply(ListParsersResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListParsersRequest.Builder>,
                        ListParsersRequest>() {
                    @Override
                    public ListParsersRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListParsersRequest.Builder>
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
                new java.util.function.Function<ListParsersRequest, ListParsersResponse>() {
                    @Override
                    public ListParsersResponse apply(ListParsersRequest request) {
                        return client.listParsers(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link
     * com.oracle.bmc.loganalytics.model.LogAnalyticsParserSummary} objects contained in responses
     * from the listParsers operation. This iterable will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link
     *     com.oracle.bmc.loganalytics.model.LogAnalyticsParserSummary} objects contained in
     *     responses received from the service.
     */
    public Iterable<com.oracle.bmc.loganalytics.model.LogAnalyticsParserSummary>
            listParsersRecordIterator(final ListParsersRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListParsersRequest.Builder,
                ListParsersRequest,
                ListParsersResponse,
                com.oracle.bmc.loganalytics.model.LogAnalyticsParserSummary>(
                new java.util.function.Supplier<ListParsersRequest.Builder>() {
                    @Override
                    public ListParsersRequest.Builder get() {
                        return ListParsersRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListParsersResponse, String>() {
                    @Override
                    public String apply(ListParsersResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListParsersRequest.Builder>,
                        ListParsersRequest>() {
                    @Override
                    public ListParsersRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListParsersRequest.Builder>
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
                new java.util.function.Function<ListParsersRequest, ListParsersResponse>() {
                    @Override
                    public ListParsersResponse apply(ListParsersRequest request) {
                        return client.listParsers(request);
                    }
                },
                new java.util.function.Function<
                        ListParsersResponse,
                        java.util.List<
                                com.oracle.bmc.loganalytics.model.LogAnalyticsParserSummary>>() {
                    @Override
                    public java.util.List<
                                    com.oracle.bmc.loganalytics.model.LogAnalyticsParserSummary>
                            apply(ListParsersResponse response) {
                        return response.getLogAnalyticsParserCollection().getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the
     * listPropertiesMetadata operation. This iterable will fetch more data from the server as
     * needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses
     *     received from the service.
     */
    public Iterable<ListPropertiesMetadataResponse> listPropertiesMetadataResponseIterator(
            final ListPropertiesMetadataRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListPropertiesMetadataRequest.Builder,
                ListPropertiesMetadataRequest,
                ListPropertiesMetadataResponse>(
                new java.util.function.Supplier<ListPropertiesMetadataRequest.Builder>() {
                    @Override
                    public ListPropertiesMetadataRequest.Builder get() {
                        return ListPropertiesMetadataRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListPropertiesMetadataResponse, String>() {
                    @Override
                    public String apply(ListPropertiesMetadataResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListPropertiesMetadataRequest.Builder>,
                        ListPropertiesMetadataRequest>() {
                    @Override
                    public ListPropertiesMetadataRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListPropertiesMetadataRequest.Builder>
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
                        ListPropertiesMetadataRequest, ListPropertiesMetadataResponse>() {
                    @Override
                    public ListPropertiesMetadataResponse apply(
                            ListPropertiesMetadataRequest request) {
                        return client.listPropertiesMetadata(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link
     * com.oracle.bmc.loganalytics.model.PropertyMetadataSummary} objects contained in responses
     * from the listPropertiesMetadata operation. This iterable will fetch more data from the server
     * as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link
     *     com.oracle.bmc.loganalytics.model.PropertyMetadataSummary} objects contained in responses
     *     received from the service.
     */
    public Iterable<com.oracle.bmc.loganalytics.model.PropertyMetadataSummary>
            listPropertiesMetadataRecordIterator(final ListPropertiesMetadataRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListPropertiesMetadataRequest.Builder,
                ListPropertiesMetadataRequest,
                ListPropertiesMetadataResponse,
                com.oracle.bmc.loganalytics.model.PropertyMetadataSummary>(
                new java.util.function.Supplier<ListPropertiesMetadataRequest.Builder>() {
                    @Override
                    public ListPropertiesMetadataRequest.Builder get() {
                        return ListPropertiesMetadataRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListPropertiesMetadataResponse, String>() {
                    @Override
                    public String apply(ListPropertiesMetadataResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListPropertiesMetadataRequest.Builder>,
                        ListPropertiesMetadataRequest>() {
                    @Override
                    public ListPropertiesMetadataRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListPropertiesMetadataRequest.Builder>
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
                        ListPropertiesMetadataRequest, ListPropertiesMetadataResponse>() {
                    @Override
                    public ListPropertiesMetadataResponse apply(
                            ListPropertiesMetadataRequest request) {
                        return client.listPropertiesMetadata(request);
                    }
                },
                new java.util.function.Function<
                        ListPropertiesMetadataResponse,
                        java.util.List<
                                com.oracle.bmc.loganalytics.model.PropertyMetadataSummary>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.loganalytics.model.PropertyMetadataSummary>
                            apply(ListPropertiesMetadataResponse response) {
                        return response.getPropertyMetadataSummaryCollection().getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the
     * listQueryWorkRequests operation. This iterable will fetch more data from the server as
     * needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses
     *     received from the service.
     */
    public Iterable<ListQueryWorkRequestsResponse> listQueryWorkRequestsResponseIterator(
            final ListQueryWorkRequestsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListQueryWorkRequestsRequest.Builder,
                ListQueryWorkRequestsRequest,
                ListQueryWorkRequestsResponse>(
                new java.util.function.Supplier<ListQueryWorkRequestsRequest.Builder>() {
                    @Override
                    public ListQueryWorkRequestsRequest.Builder get() {
                        return ListQueryWorkRequestsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListQueryWorkRequestsResponse, String>() {
                    @Override
                    public String apply(ListQueryWorkRequestsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListQueryWorkRequestsRequest.Builder>,
                        ListQueryWorkRequestsRequest>() {
                    @Override
                    public ListQueryWorkRequestsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListQueryWorkRequestsRequest.Builder>
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
                        ListQueryWorkRequestsRequest, ListQueryWorkRequestsResponse>() {
                    @Override
                    public ListQueryWorkRequestsResponse apply(
                            ListQueryWorkRequestsRequest request) {
                        return client.listQueryWorkRequests(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link
     * com.oracle.bmc.loganalytics.model.QueryWorkRequestSummary} objects contained in responses
     * from the listQueryWorkRequests operation. This iterable will fetch more data from the server
     * as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link
     *     com.oracle.bmc.loganalytics.model.QueryWorkRequestSummary} objects contained in responses
     *     received from the service.
     */
    public Iterable<com.oracle.bmc.loganalytics.model.QueryWorkRequestSummary>
            listQueryWorkRequestsRecordIterator(final ListQueryWorkRequestsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListQueryWorkRequestsRequest.Builder,
                ListQueryWorkRequestsRequest,
                ListQueryWorkRequestsResponse,
                com.oracle.bmc.loganalytics.model.QueryWorkRequestSummary>(
                new java.util.function.Supplier<ListQueryWorkRequestsRequest.Builder>() {
                    @Override
                    public ListQueryWorkRequestsRequest.Builder get() {
                        return ListQueryWorkRequestsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListQueryWorkRequestsResponse, String>() {
                    @Override
                    public String apply(ListQueryWorkRequestsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListQueryWorkRequestsRequest.Builder>,
                        ListQueryWorkRequestsRequest>() {
                    @Override
                    public ListQueryWorkRequestsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListQueryWorkRequestsRequest.Builder>
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
                        ListQueryWorkRequestsRequest, ListQueryWorkRequestsResponse>() {
                    @Override
                    public ListQueryWorkRequestsResponse apply(
                            ListQueryWorkRequestsRequest request) {
                        return client.listQueryWorkRequests(request);
                    }
                },
                new java.util.function.Function<
                        ListQueryWorkRequestsResponse,
                        java.util.List<
                                com.oracle.bmc.loganalytics.model.QueryWorkRequestSummary>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.loganalytics.model.QueryWorkRequestSummary>
                            apply(ListQueryWorkRequestsResponse response) {
                        return response.getQueryWorkRequestCollection().getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the
     * listRecalledData operation. This iterable will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses
     *     received from the service.
     */
    public Iterable<ListRecalledDataResponse> listRecalledDataResponseIterator(
            final ListRecalledDataRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListRecalledDataRequest.Builder, ListRecalledDataRequest, ListRecalledDataResponse>(
                new java.util.function.Supplier<ListRecalledDataRequest.Builder>() {
                    @Override
                    public ListRecalledDataRequest.Builder get() {
                        return ListRecalledDataRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListRecalledDataResponse, String>() {
                    @Override
                    public String apply(ListRecalledDataResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListRecalledDataRequest.Builder>,
                        ListRecalledDataRequest>() {
                    @Override
                    public ListRecalledDataRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListRecalledDataRequest.Builder>
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
                        ListRecalledDataRequest, ListRecalledDataResponse>() {
                    @Override
                    public ListRecalledDataResponse apply(ListRecalledDataRequest request) {
                        return client.listRecalledData(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link
     * com.oracle.bmc.loganalytics.model.RecalledData} objects contained in responses from the
     * listRecalledData operation. This iterable will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link
     *     com.oracle.bmc.loganalytics.model.RecalledData} objects contained in responses received
     *     from the service.
     */
    public Iterable<com.oracle.bmc.loganalytics.model.RecalledData> listRecalledDataRecordIterator(
            final ListRecalledDataRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListRecalledDataRequest.Builder,
                ListRecalledDataRequest,
                ListRecalledDataResponse,
                com.oracle.bmc.loganalytics.model.RecalledData>(
                new java.util.function.Supplier<ListRecalledDataRequest.Builder>() {
                    @Override
                    public ListRecalledDataRequest.Builder get() {
                        return ListRecalledDataRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListRecalledDataResponse, String>() {
                    @Override
                    public String apply(ListRecalledDataResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListRecalledDataRequest.Builder>,
                        ListRecalledDataRequest>() {
                    @Override
                    public ListRecalledDataRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListRecalledDataRequest.Builder>
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
                        ListRecalledDataRequest, ListRecalledDataResponse>() {
                    @Override
                    public ListRecalledDataResponse apply(ListRecalledDataRequest request) {
                        return client.listRecalledData(request);
                    }
                },
                new java.util.function.Function<
                        ListRecalledDataResponse,
                        java.util.List<com.oracle.bmc.loganalytics.model.RecalledData>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.loganalytics.model.RecalledData> apply(
                            ListRecalledDataResponse response) {
                        return response.getRecalledDataCollection().getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the
     * listResourceCategories operation. This iterable will fetch more data from the server as
     * needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses
     *     received from the service.
     */
    public Iterable<ListResourceCategoriesResponse> listResourceCategoriesResponseIterator(
            final ListResourceCategoriesRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListResourceCategoriesRequest.Builder,
                ListResourceCategoriesRequest,
                ListResourceCategoriesResponse>(
                new java.util.function.Supplier<ListResourceCategoriesRequest.Builder>() {
                    @Override
                    public ListResourceCategoriesRequest.Builder get() {
                        return ListResourceCategoriesRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListResourceCategoriesResponse, String>() {
                    @Override
                    public String apply(ListResourceCategoriesResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListResourceCategoriesRequest.Builder>,
                        ListResourceCategoriesRequest>() {
                    @Override
                    public ListResourceCategoriesRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListResourceCategoriesRequest.Builder>
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
                        ListResourceCategoriesRequest, ListResourceCategoriesResponse>() {
                    @Override
                    public ListResourceCategoriesResponse apply(
                            ListResourceCategoriesRequest request) {
                        return client.listResourceCategories(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link
     * com.oracle.bmc.loganalytics.model.LogAnalyticsResourceCategory} objects contained in
     * responses from the listResourceCategories operation. This iterable will fetch more data from
     * the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link
     *     com.oracle.bmc.loganalytics.model.LogAnalyticsResourceCategory} objects contained in
     *     responses received from the service.
     */
    public Iterable<com.oracle.bmc.loganalytics.model.LogAnalyticsResourceCategory>
            listResourceCategoriesRecordIterator(final ListResourceCategoriesRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListResourceCategoriesRequest.Builder,
                ListResourceCategoriesRequest,
                ListResourceCategoriesResponse,
                com.oracle.bmc.loganalytics.model.LogAnalyticsResourceCategory>(
                new java.util.function.Supplier<ListResourceCategoriesRequest.Builder>() {
                    @Override
                    public ListResourceCategoriesRequest.Builder get() {
                        return ListResourceCategoriesRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListResourceCategoriesResponse, String>() {
                    @Override
                    public String apply(ListResourceCategoriesResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListResourceCategoriesRequest.Builder>,
                        ListResourceCategoriesRequest>() {
                    @Override
                    public ListResourceCategoriesRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListResourceCategoriesRequest.Builder>
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
                        ListResourceCategoriesRequest, ListResourceCategoriesResponse>() {
                    @Override
                    public ListResourceCategoriesResponse apply(
                            ListResourceCategoriesRequest request) {
                        return client.listResourceCategories(request);
                    }
                },
                new java.util.function.Function<
                        ListResourceCategoriesResponse,
                        java.util.List<
                                com.oracle.bmc.loganalytics.model.LogAnalyticsResourceCategory>>() {
                    @Override
                    public java.util.List<
                                    com.oracle.bmc.loganalytics.model.LogAnalyticsResourceCategory>
                            apply(ListResourceCategoriesResponse response) {
                        return response.getLogAnalyticsResourceCategoryCollection().getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the listRules
     * operation. This iterable will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses
     *     received from the service.
     */
    public Iterable<ListRulesResponse> listRulesResponseIterator(final ListRulesRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListRulesRequest.Builder, ListRulesRequest, ListRulesResponse>(
                new java.util.function.Supplier<ListRulesRequest.Builder>() {
                    @Override
                    public ListRulesRequest.Builder get() {
                        return ListRulesRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListRulesResponse, String>() {
                    @Override
                    public String apply(ListRulesResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListRulesRequest.Builder>,
                        ListRulesRequest>() {
                    @Override
                    public ListRulesRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListRulesRequest.Builder>
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
                new java.util.function.Function<ListRulesRequest, ListRulesResponse>() {
                    @Override
                    public ListRulesResponse apply(ListRulesRequest request) {
                        return client.listRules(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link
     * com.oracle.bmc.loganalytics.model.RuleSummary} objects contained in responses from the
     * listRules operation. This iterable will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link
     *     com.oracle.bmc.loganalytics.model.RuleSummary} objects contained in responses received
     *     from the service.
     */
    public Iterable<com.oracle.bmc.loganalytics.model.RuleSummary> listRulesRecordIterator(
            final ListRulesRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListRulesRequest.Builder,
                ListRulesRequest,
                ListRulesResponse,
                com.oracle.bmc.loganalytics.model.RuleSummary>(
                new java.util.function.Supplier<ListRulesRequest.Builder>() {
                    @Override
                    public ListRulesRequest.Builder get() {
                        return ListRulesRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListRulesResponse, String>() {
                    @Override
                    public String apply(ListRulesResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListRulesRequest.Builder>,
                        ListRulesRequest>() {
                    @Override
                    public ListRulesRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListRulesRequest.Builder>
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
                new java.util.function.Function<ListRulesRequest, ListRulesResponse>() {
                    @Override
                    public ListRulesResponse apply(ListRulesRequest request) {
                        return client.listRules(request);
                    }
                },
                new java.util.function.Function<
                        ListRulesResponse,
                        java.util.List<com.oracle.bmc.loganalytics.model.RuleSummary>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.loganalytics.model.RuleSummary> apply(
                            ListRulesResponse response) {
                        return response.getRuleSummaryCollection().getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the
     * listScheduledTasks operation. This iterable will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses
     *     received from the service.
     */
    public Iterable<ListScheduledTasksResponse> listScheduledTasksResponseIterator(
            final ListScheduledTasksRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListScheduledTasksRequest.Builder,
                ListScheduledTasksRequest,
                ListScheduledTasksResponse>(
                new java.util.function.Supplier<ListScheduledTasksRequest.Builder>() {
                    @Override
                    public ListScheduledTasksRequest.Builder get() {
                        return ListScheduledTasksRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListScheduledTasksResponse, String>() {
                    @Override
                    public String apply(ListScheduledTasksResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListScheduledTasksRequest.Builder>,
                        ListScheduledTasksRequest>() {
                    @Override
                    public ListScheduledTasksRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListScheduledTasksRequest.Builder>
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
                        ListScheduledTasksRequest, ListScheduledTasksResponse>() {
                    @Override
                    public ListScheduledTasksResponse apply(ListScheduledTasksRequest request) {
                        return client.listScheduledTasks(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link
     * com.oracle.bmc.loganalytics.model.ScheduledTaskSummary} objects contained in responses from
     * the listScheduledTasks operation. This iterable will fetch more data from the server as
     * needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link
     *     com.oracle.bmc.loganalytics.model.ScheduledTaskSummary} objects contained in responses
     *     received from the service.
     */
    public Iterable<com.oracle.bmc.loganalytics.model.ScheduledTaskSummary>
            listScheduledTasksRecordIterator(final ListScheduledTasksRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListScheduledTasksRequest.Builder,
                ListScheduledTasksRequest,
                ListScheduledTasksResponse,
                com.oracle.bmc.loganalytics.model.ScheduledTaskSummary>(
                new java.util.function.Supplier<ListScheduledTasksRequest.Builder>() {
                    @Override
                    public ListScheduledTasksRequest.Builder get() {
                        return ListScheduledTasksRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListScheduledTasksResponse, String>() {
                    @Override
                    public String apply(ListScheduledTasksResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListScheduledTasksRequest.Builder>,
                        ListScheduledTasksRequest>() {
                    @Override
                    public ListScheduledTasksRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListScheduledTasksRequest.Builder>
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
                        ListScheduledTasksRequest, ListScheduledTasksResponse>() {
                    @Override
                    public ListScheduledTasksResponse apply(ListScheduledTasksRequest request) {
                        return client.listScheduledTasks(request);
                    }
                },
                new java.util.function.Function<
                        ListScheduledTasksResponse,
                        java.util.List<com.oracle.bmc.loganalytics.model.ScheduledTaskSummary>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.loganalytics.model.ScheduledTaskSummary>
                            apply(ListScheduledTasksResponse response) {
                        return response.getScheduledTaskCollection().getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the
     * listSourceAssociations operation. This iterable will fetch more data from the server as
     * needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses
     *     received from the service.
     */
    public Iterable<ListSourceAssociationsResponse> listSourceAssociationsResponseIterator(
            final ListSourceAssociationsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListSourceAssociationsRequest.Builder,
                ListSourceAssociationsRequest,
                ListSourceAssociationsResponse>(
                new java.util.function.Supplier<ListSourceAssociationsRequest.Builder>() {
                    @Override
                    public ListSourceAssociationsRequest.Builder get() {
                        return ListSourceAssociationsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListSourceAssociationsResponse, String>() {
                    @Override
                    public String apply(ListSourceAssociationsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListSourceAssociationsRequest.Builder>,
                        ListSourceAssociationsRequest>() {
                    @Override
                    public ListSourceAssociationsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListSourceAssociationsRequest.Builder>
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
                        ListSourceAssociationsRequest, ListSourceAssociationsResponse>() {
                    @Override
                    public ListSourceAssociationsResponse apply(
                            ListSourceAssociationsRequest request) {
                        return client.listSourceAssociations(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link
     * com.oracle.bmc.loganalytics.model.LogAnalyticsAssociation} objects contained in responses
     * from the listSourceAssociations operation. This iterable will fetch more data from the server
     * as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link
     *     com.oracle.bmc.loganalytics.model.LogAnalyticsAssociation} objects contained in responses
     *     received from the service.
     */
    public Iterable<com.oracle.bmc.loganalytics.model.LogAnalyticsAssociation>
            listSourceAssociationsRecordIterator(final ListSourceAssociationsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListSourceAssociationsRequest.Builder,
                ListSourceAssociationsRequest,
                ListSourceAssociationsResponse,
                com.oracle.bmc.loganalytics.model.LogAnalyticsAssociation>(
                new java.util.function.Supplier<ListSourceAssociationsRequest.Builder>() {
                    @Override
                    public ListSourceAssociationsRequest.Builder get() {
                        return ListSourceAssociationsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListSourceAssociationsResponse, String>() {
                    @Override
                    public String apply(ListSourceAssociationsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListSourceAssociationsRequest.Builder>,
                        ListSourceAssociationsRequest>() {
                    @Override
                    public ListSourceAssociationsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListSourceAssociationsRequest.Builder>
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
                        ListSourceAssociationsRequest, ListSourceAssociationsResponse>() {
                    @Override
                    public ListSourceAssociationsResponse apply(
                            ListSourceAssociationsRequest request) {
                        return client.listSourceAssociations(request);
                    }
                },
                new java.util.function.Function<
                        ListSourceAssociationsResponse,
                        java.util.List<
                                com.oracle.bmc.loganalytics.model.LogAnalyticsAssociation>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.loganalytics.model.LogAnalyticsAssociation>
                            apply(ListSourceAssociationsResponse response) {
                        return response.getLogAnalyticsAssociationCollection().getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the
     * listSourceEventTypes operation. This iterable will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses
     *     received from the service.
     */
    public Iterable<ListSourceEventTypesResponse> listSourceEventTypesResponseIterator(
            final ListSourceEventTypesRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListSourceEventTypesRequest.Builder,
                ListSourceEventTypesRequest,
                ListSourceEventTypesResponse>(
                new java.util.function.Supplier<ListSourceEventTypesRequest.Builder>() {
                    @Override
                    public ListSourceEventTypesRequest.Builder get() {
                        return ListSourceEventTypesRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListSourceEventTypesResponse, String>() {
                    @Override
                    public String apply(ListSourceEventTypesResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListSourceEventTypesRequest.Builder>,
                        ListSourceEventTypesRequest>() {
                    @Override
                    public ListSourceEventTypesRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListSourceEventTypesRequest.Builder>
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
                        ListSourceEventTypesRequest, ListSourceEventTypesResponse>() {
                    @Override
                    public ListSourceEventTypesResponse apply(ListSourceEventTypesRequest request) {
                        return client.listSourceEventTypes(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link
     * com.oracle.bmc.loganalytics.model.EventType} objects contained in responses from the
     * listSourceEventTypes operation. This iterable will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link
     *     com.oracle.bmc.loganalytics.model.EventType} objects contained in responses received from
     *     the service.
     */
    public Iterable<com.oracle.bmc.loganalytics.model.EventType> listSourceEventTypesRecordIterator(
            final ListSourceEventTypesRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListSourceEventTypesRequest.Builder,
                ListSourceEventTypesRequest,
                ListSourceEventTypesResponse,
                com.oracle.bmc.loganalytics.model.EventType>(
                new java.util.function.Supplier<ListSourceEventTypesRequest.Builder>() {
                    @Override
                    public ListSourceEventTypesRequest.Builder get() {
                        return ListSourceEventTypesRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListSourceEventTypesResponse, String>() {
                    @Override
                    public String apply(ListSourceEventTypesResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListSourceEventTypesRequest.Builder>,
                        ListSourceEventTypesRequest>() {
                    @Override
                    public ListSourceEventTypesRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListSourceEventTypesRequest.Builder>
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
                        ListSourceEventTypesRequest, ListSourceEventTypesResponse>() {
                    @Override
                    public ListSourceEventTypesResponse apply(ListSourceEventTypesRequest request) {
                        return client.listSourceEventTypes(request);
                    }
                },
                new java.util.function.Function<
                        ListSourceEventTypesResponse,
                        java.util.List<com.oracle.bmc.loganalytics.model.EventType>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.loganalytics.model.EventType> apply(
                            ListSourceEventTypesResponse response) {
                        return response.getEventTypeCollection().getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the
     * listSourceExtendedFieldDefinitions operation. This iterable will fetch more data from the
     * server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses
     *     received from the service.
     */
    public Iterable<ListSourceExtendedFieldDefinitionsResponse>
            listSourceExtendedFieldDefinitionsResponseIterator(
                    final ListSourceExtendedFieldDefinitionsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListSourceExtendedFieldDefinitionsRequest.Builder,
                ListSourceExtendedFieldDefinitionsRequest,
                ListSourceExtendedFieldDefinitionsResponse>(
                new java.util.function.Supplier<
                        ListSourceExtendedFieldDefinitionsRequest.Builder>() {
                    @Override
                    public ListSourceExtendedFieldDefinitionsRequest.Builder get() {
                        return ListSourceExtendedFieldDefinitionsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<
                        ListSourceExtendedFieldDefinitionsResponse, String>() {
                    @Override
                    public String apply(ListSourceExtendedFieldDefinitionsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListSourceExtendedFieldDefinitionsRequest.Builder>,
                        ListSourceExtendedFieldDefinitionsRequest>() {
                    @Override
                    public ListSourceExtendedFieldDefinitionsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListSourceExtendedFieldDefinitionsRequest.Builder>
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
                        ListSourceExtendedFieldDefinitionsRequest,
                        ListSourceExtendedFieldDefinitionsResponse>() {
                    @Override
                    public ListSourceExtendedFieldDefinitionsResponse apply(
                            ListSourceExtendedFieldDefinitionsRequest request) {
                        return client.listSourceExtendedFieldDefinitions(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link
     * com.oracle.bmc.loganalytics.model.LogAnalyticsSourceExtendedFieldDefinition} objects
     * contained in responses from the listSourceExtendedFieldDefinitions operation. This iterable
     * will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link
     *     com.oracle.bmc.loganalytics.model.LogAnalyticsSourceExtendedFieldDefinition} objects
     *     contained in responses received from the service.
     */
    public Iterable<com.oracle.bmc.loganalytics.model.LogAnalyticsSourceExtendedFieldDefinition>
            listSourceExtendedFieldDefinitionsRecordIterator(
                    final ListSourceExtendedFieldDefinitionsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListSourceExtendedFieldDefinitionsRequest.Builder,
                ListSourceExtendedFieldDefinitionsRequest,
                ListSourceExtendedFieldDefinitionsResponse,
                com.oracle.bmc.loganalytics.model.LogAnalyticsSourceExtendedFieldDefinition>(
                new java.util.function.Supplier<
                        ListSourceExtendedFieldDefinitionsRequest.Builder>() {
                    @Override
                    public ListSourceExtendedFieldDefinitionsRequest.Builder get() {
                        return ListSourceExtendedFieldDefinitionsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<
                        ListSourceExtendedFieldDefinitionsResponse, String>() {
                    @Override
                    public String apply(ListSourceExtendedFieldDefinitionsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListSourceExtendedFieldDefinitionsRequest.Builder>,
                        ListSourceExtendedFieldDefinitionsRequest>() {
                    @Override
                    public ListSourceExtendedFieldDefinitionsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListSourceExtendedFieldDefinitionsRequest.Builder>
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
                        ListSourceExtendedFieldDefinitionsRequest,
                        ListSourceExtendedFieldDefinitionsResponse>() {
                    @Override
                    public ListSourceExtendedFieldDefinitionsResponse apply(
                            ListSourceExtendedFieldDefinitionsRequest request) {
                        return client.listSourceExtendedFieldDefinitions(request);
                    }
                },
                new java.util.function.Function<
                        ListSourceExtendedFieldDefinitionsResponse,
                        java.util.List<
                                com.oracle.bmc.loganalytics.model
                                        .LogAnalyticsSourceExtendedFieldDefinition>>() {
                    @Override
                    public java.util.List<
                                    com.oracle.bmc.loganalytics.model
                                            .LogAnalyticsSourceExtendedFieldDefinition>
                            apply(ListSourceExtendedFieldDefinitionsResponse response) {
                        return response.getLogAnalyticsSourceExtendedFieldDefinitionCollection()
                                .getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the
     * listSourceLabelOperators operation. This iterable will fetch more data from the server as
     * needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses
     *     received from the service.
     */
    public Iterable<ListSourceLabelOperatorsResponse> listSourceLabelOperatorsResponseIterator(
            final ListSourceLabelOperatorsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListSourceLabelOperatorsRequest.Builder,
                ListSourceLabelOperatorsRequest,
                ListSourceLabelOperatorsResponse>(
                new java.util.function.Supplier<ListSourceLabelOperatorsRequest.Builder>() {
                    @Override
                    public ListSourceLabelOperatorsRequest.Builder get() {
                        return ListSourceLabelOperatorsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListSourceLabelOperatorsResponse, String>() {
                    @Override
                    public String apply(ListSourceLabelOperatorsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListSourceLabelOperatorsRequest.Builder>,
                        ListSourceLabelOperatorsRequest>() {
                    @Override
                    public ListSourceLabelOperatorsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListSourceLabelOperatorsRequest.Builder>
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
                        ListSourceLabelOperatorsRequest, ListSourceLabelOperatorsResponse>() {
                    @Override
                    public ListSourceLabelOperatorsResponse apply(
                            ListSourceLabelOperatorsRequest request) {
                        return client.listSourceLabelOperators(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link
     * com.oracle.bmc.loganalytics.model.LogAnalyticsLabelOperator} objects contained in responses
     * from the listSourceLabelOperators operation. This iterable will fetch more data from the
     * server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link
     *     com.oracle.bmc.loganalytics.model.LogAnalyticsLabelOperator} objects contained in
     *     responses received from the service.
     */
    public Iterable<com.oracle.bmc.loganalytics.model.LogAnalyticsLabelOperator>
            listSourceLabelOperatorsRecordIterator(final ListSourceLabelOperatorsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListSourceLabelOperatorsRequest.Builder,
                ListSourceLabelOperatorsRequest,
                ListSourceLabelOperatorsResponse,
                com.oracle.bmc.loganalytics.model.LogAnalyticsLabelOperator>(
                new java.util.function.Supplier<ListSourceLabelOperatorsRequest.Builder>() {
                    @Override
                    public ListSourceLabelOperatorsRequest.Builder get() {
                        return ListSourceLabelOperatorsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListSourceLabelOperatorsResponse, String>() {
                    @Override
                    public String apply(ListSourceLabelOperatorsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListSourceLabelOperatorsRequest.Builder>,
                        ListSourceLabelOperatorsRequest>() {
                    @Override
                    public ListSourceLabelOperatorsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListSourceLabelOperatorsRequest.Builder>
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
                        ListSourceLabelOperatorsRequest, ListSourceLabelOperatorsResponse>() {
                    @Override
                    public ListSourceLabelOperatorsResponse apply(
                            ListSourceLabelOperatorsRequest request) {
                        return client.listSourceLabelOperators(request);
                    }
                },
                new java.util.function.Function<
                        ListSourceLabelOperatorsResponse,
                        java.util.List<
                                com.oracle.bmc.loganalytics.model.LogAnalyticsLabelOperator>>() {
                    @Override
                    public java.util.List<
                                    com.oracle.bmc.loganalytics.model.LogAnalyticsLabelOperator>
                            apply(ListSourceLabelOperatorsResponse response) {
                        return response.getLogAnalyticsLabelOperatorCollection().getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the
     * listSourceMetaFunctions operation. This iterable will fetch more data from the server as
     * needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses
     *     received from the service.
     */
    public Iterable<ListSourceMetaFunctionsResponse> listSourceMetaFunctionsResponseIterator(
            final ListSourceMetaFunctionsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListSourceMetaFunctionsRequest.Builder,
                ListSourceMetaFunctionsRequest,
                ListSourceMetaFunctionsResponse>(
                new java.util.function.Supplier<ListSourceMetaFunctionsRequest.Builder>() {
                    @Override
                    public ListSourceMetaFunctionsRequest.Builder get() {
                        return ListSourceMetaFunctionsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListSourceMetaFunctionsResponse, String>() {
                    @Override
                    public String apply(ListSourceMetaFunctionsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListSourceMetaFunctionsRequest.Builder>,
                        ListSourceMetaFunctionsRequest>() {
                    @Override
                    public ListSourceMetaFunctionsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListSourceMetaFunctionsRequest.Builder>
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
                        ListSourceMetaFunctionsRequest, ListSourceMetaFunctionsResponse>() {
                    @Override
                    public ListSourceMetaFunctionsResponse apply(
                            ListSourceMetaFunctionsRequest request) {
                        return client.listSourceMetaFunctions(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link
     * com.oracle.bmc.loganalytics.model.LogAnalyticsMetaFunction} objects contained in responses
     * from the listSourceMetaFunctions operation. This iterable will fetch more data from the
     * server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link
     *     com.oracle.bmc.loganalytics.model.LogAnalyticsMetaFunction} objects contained in
     *     responses received from the service.
     */
    public Iterable<com.oracle.bmc.loganalytics.model.LogAnalyticsMetaFunction>
            listSourceMetaFunctionsRecordIterator(final ListSourceMetaFunctionsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListSourceMetaFunctionsRequest.Builder,
                ListSourceMetaFunctionsRequest,
                ListSourceMetaFunctionsResponse,
                com.oracle.bmc.loganalytics.model.LogAnalyticsMetaFunction>(
                new java.util.function.Supplier<ListSourceMetaFunctionsRequest.Builder>() {
                    @Override
                    public ListSourceMetaFunctionsRequest.Builder get() {
                        return ListSourceMetaFunctionsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListSourceMetaFunctionsResponse, String>() {
                    @Override
                    public String apply(ListSourceMetaFunctionsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListSourceMetaFunctionsRequest.Builder>,
                        ListSourceMetaFunctionsRequest>() {
                    @Override
                    public ListSourceMetaFunctionsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListSourceMetaFunctionsRequest.Builder>
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
                        ListSourceMetaFunctionsRequest, ListSourceMetaFunctionsResponse>() {
                    @Override
                    public ListSourceMetaFunctionsResponse apply(
                            ListSourceMetaFunctionsRequest request) {
                        return client.listSourceMetaFunctions(request);
                    }
                },
                new java.util.function.Function<
                        ListSourceMetaFunctionsResponse,
                        java.util.List<
                                com.oracle.bmc.loganalytics.model.LogAnalyticsMetaFunction>>() {
                    @Override
                    public java.util.List<
                                    com.oracle.bmc.loganalytics.model.LogAnalyticsMetaFunction>
                            apply(ListSourceMetaFunctionsResponse response) {
                        return response.getLogAnalyticsMetaFunctionCollection().getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the
     * listSourcePatterns operation. This iterable will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses
     *     received from the service.
     */
    public Iterable<ListSourcePatternsResponse> listSourcePatternsResponseIterator(
            final ListSourcePatternsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListSourcePatternsRequest.Builder,
                ListSourcePatternsRequest,
                ListSourcePatternsResponse>(
                new java.util.function.Supplier<ListSourcePatternsRequest.Builder>() {
                    @Override
                    public ListSourcePatternsRequest.Builder get() {
                        return ListSourcePatternsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListSourcePatternsResponse, String>() {
                    @Override
                    public String apply(ListSourcePatternsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListSourcePatternsRequest.Builder>,
                        ListSourcePatternsRequest>() {
                    @Override
                    public ListSourcePatternsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListSourcePatternsRequest.Builder>
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
                        ListSourcePatternsRequest, ListSourcePatternsResponse>() {
                    @Override
                    public ListSourcePatternsResponse apply(ListSourcePatternsRequest request) {
                        return client.listSourcePatterns(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link
     * com.oracle.bmc.loganalytics.model.LogAnalyticsSourcePattern} objects contained in responses
     * from the listSourcePatterns operation. This iterable will fetch more data from the server as
     * needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link
     *     com.oracle.bmc.loganalytics.model.LogAnalyticsSourcePattern} objects contained in
     *     responses received from the service.
     */
    public Iterable<com.oracle.bmc.loganalytics.model.LogAnalyticsSourcePattern>
            listSourcePatternsRecordIterator(final ListSourcePatternsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListSourcePatternsRequest.Builder,
                ListSourcePatternsRequest,
                ListSourcePatternsResponse,
                com.oracle.bmc.loganalytics.model.LogAnalyticsSourcePattern>(
                new java.util.function.Supplier<ListSourcePatternsRequest.Builder>() {
                    @Override
                    public ListSourcePatternsRequest.Builder get() {
                        return ListSourcePatternsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListSourcePatternsResponse, String>() {
                    @Override
                    public String apply(ListSourcePatternsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListSourcePatternsRequest.Builder>,
                        ListSourcePatternsRequest>() {
                    @Override
                    public ListSourcePatternsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListSourcePatternsRequest.Builder>
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
                        ListSourcePatternsRequest, ListSourcePatternsResponse>() {
                    @Override
                    public ListSourcePatternsResponse apply(ListSourcePatternsRequest request) {
                        return client.listSourcePatterns(request);
                    }
                },
                new java.util.function.Function<
                        ListSourcePatternsResponse,
                        java.util.List<
                                com.oracle.bmc.loganalytics.model.LogAnalyticsSourcePattern>>() {
                    @Override
                    public java.util.List<
                                    com.oracle.bmc.loganalytics.model.LogAnalyticsSourcePattern>
                            apply(ListSourcePatternsResponse response) {
                        return response.getLogAnalyticsSourcePatternCollection().getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the listSources
     * operation. This iterable will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses
     *     received from the service.
     */
    public Iterable<ListSourcesResponse> listSourcesResponseIterator(
            final ListSourcesRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListSourcesRequest.Builder, ListSourcesRequest, ListSourcesResponse>(
                new java.util.function.Supplier<ListSourcesRequest.Builder>() {
                    @Override
                    public ListSourcesRequest.Builder get() {
                        return ListSourcesRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListSourcesResponse, String>() {
                    @Override
                    public String apply(ListSourcesResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListSourcesRequest.Builder>,
                        ListSourcesRequest>() {
                    @Override
                    public ListSourcesRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListSourcesRequest.Builder>
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
                new java.util.function.Function<ListSourcesRequest, ListSourcesResponse>() {
                    @Override
                    public ListSourcesResponse apply(ListSourcesRequest request) {
                        return client.listSources(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link
     * com.oracle.bmc.loganalytics.model.LogAnalyticsSourceSummary} objects contained in responses
     * from the listSources operation. This iterable will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link
     *     com.oracle.bmc.loganalytics.model.LogAnalyticsSourceSummary} objects contained in
     *     responses received from the service.
     */
    public Iterable<com.oracle.bmc.loganalytics.model.LogAnalyticsSourceSummary>
            listSourcesRecordIterator(final ListSourcesRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListSourcesRequest.Builder,
                ListSourcesRequest,
                ListSourcesResponse,
                com.oracle.bmc.loganalytics.model.LogAnalyticsSourceSummary>(
                new java.util.function.Supplier<ListSourcesRequest.Builder>() {
                    @Override
                    public ListSourcesRequest.Builder get() {
                        return ListSourcesRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListSourcesResponse, String>() {
                    @Override
                    public String apply(ListSourcesResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListSourcesRequest.Builder>,
                        ListSourcesRequest>() {
                    @Override
                    public ListSourcesRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListSourcesRequest.Builder>
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
                new java.util.function.Function<ListSourcesRequest, ListSourcesResponse>() {
                    @Override
                    public ListSourcesResponse apply(ListSourcesRequest request) {
                        return client.listSources(request);
                    }
                },
                new java.util.function.Function<
                        ListSourcesResponse,
                        java.util.List<
                                com.oracle.bmc.loganalytics.model.LogAnalyticsSourceSummary>>() {
                    @Override
                    public java.util.List<
                                    com.oracle.bmc.loganalytics.model.LogAnalyticsSourceSummary>
                            apply(ListSourcesResponse response) {
                        return response.getLogAnalyticsSourceCollection().getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the
     * listStorageWorkRequestErrors operation. This iterable will fetch more data from the server as
     * needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses
     *     received from the service.
     */
    public Iterable<ListStorageWorkRequestErrorsResponse>
            listStorageWorkRequestErrorsResponseIterator(
                    final ListStorageWorkRequestErrorsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListStorageWorkRequestErrorsRequest.Builder,
                ListStorageWorkRequestErrorsRequest,
                ListStorageWorkRequestErrorsResponse>(
                new java.util.function.Supplier<ListStorageWorkRequestErrorsRequest.Builder>() {
                    @Override
                    public ListStorageWorkRequestErrorsRequest.Builder get() {
                        return ListStorageWorkRequestErrorsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListStorageWorkRequestErrorsResponse, String>() {
                    @Override
                    public String apply(ListStorageWorkRequestErrorsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListStorageWorkRequestErrorsRequest.Builder>,
                        ListStorageWorkRequestErrorsRequest>() {
                    @Override
                    public ListStorageWorkRequestErrorsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListStorageWorkRequestErrorsRequest.Builder>
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
                        ListStorageWorkRequestErrorsRequest,
                        ListStorageWorkRequestErrorsResponse>() {
                    @Override
                    public ListStorageWorkRequestErrorsResponse apply(
                            ListStorageWorkRequestErrorsRequest request) {
                        return client.listStorageWorkRequestErrors(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link
     * com.oracle.bmc.loganalytics.model.WorkRequestError} objects contained in responses from the
     * listStorageWorkRequestErrors operation. This iterable will fetch more data from the server as
     * needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link
     *     com.oracle.bmc.loganalytics.model.WorkRequestError} objects contained in responses
     *     received from the service.
     */
    public Iterable<com.oracle.bmc.loganalytics.model.WorkRequestError>
            listStorageWorkRequestErrorsRecordIterator(
                    final ListStorageWorkRequestErrorsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListStorageWorkRequestErrorsRequest.Builder,
                ListStorageWorkRequestErrorsRequest,
                ListStorageWorkRequestErrorsResponse,
                com.oracle.bmc.loganalytics.model.WorkRequestError>(
                new java.util.function.Supplier<ListStorageWorkRequestErrorsRequest.Builder>() {
                    @Override
                    public ListStorageWorkRequestErrorsRequest.Builder get() {
                        return ListStorageWorkRequestErrorsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListStorageWorkRequestErrorsResponse, String>() {
                    @Override
                    public String apply(ListStorageWorkRequestErrorsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListStorageWorkRequestErrorsRequest.Builder>,
                        ListStorageWorkRequestErrorsRequest>() {
                    @Override
                    public ListStorageWorkRequestErrorsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListStorageWorkRequestErrorsRequest.Builder>
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
                        ListStorageWorkRequestErrorsRequest,
                        ListStorageWorkRequestErrorsResponse>() {
                    @Override
                    public ListStorageWorkRequestErrorsResponse apply(
                            ListStorageWorkRequestErrorsRequest request) {
                        return client.listStorageWorkRequestErrors(request);
                    }
                },
                new java.util.function.Function<
                        ListStorageWorkRequestErrorsResponse,
                        java.util.List<com.oracle.bmc.loganalytics.model.WorkRequestError>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.loganalytics.model.WorkRequestError> apply(
                            ListStorageWorkRequestErrorsResponse response) {
                        return response.getWorkRequestErrorCollection().getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the
     * listStorageWorkRequests operation. This iterable will fetch more data from the server as
     * needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses
     *     received from the service.
     */
    public Iterable<ListStorageWorkRequestsResponse> listStorageWorkRequestsResponseIterator(
            final ListStorageWorkRequestsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListStorageWorkRequestsRequest.Builder,
                ListStorageWorkRequestsRequest,
                ListStorageWorkRequestsResponse>(
                new java.util.function.Supplier<ListStorageWorkRequestsRequest.Builder>() {
                    @Override
                    public ListStorageWorkRequestsRequest.Builder get() {
                        return ListStorageWorkRequestsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListStorageWorkRequestsResponse, String>() {
                    @Override
                    public String apply(ListStorageWorkRequestsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListStorageWorkRequestsRequest.Builder>,
                        ListStorageWorkRequestsRequest>() {
                    @Override
                    public ListStorageWorkRequestsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListStorageWorkRequestsRequest.Builder>
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
                        ListStorageWorkRequestsRequest, ListStorageWorkRequestsResponse>() {
                    @Override
                    public ListStorageWorkRequestsResponse apply(
                            ListStorageWorkRequestsRequest request) {
                        return client.listStorageWorkRequests(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link
     * com.oracle.bmc.loganalytics.model.StorageWorkRequestSummary} objects contained in responses
     * from the listStorageWorkRequests operation. This iterable will fetch more data from the
     * server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link
     *     com.oracle.bmc.loganalytics.model.StorageWorkRequestSummary} objects contained in
     *     responses received from the service.
     */
    public Iterable<com.oracle.bmc.loganalytics.model.StorageWorkRequestSummary>
            listStorageWorkRequestsRecordIterator(final ListStorageWorkRequestsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListStorageWorkRequestsRequest.Builder,
                ListStorageWorkRequestsRequest,
                ListStorageWorkRequestsResponse,
                com.oracle.bmc.loganalytics.model.StorageWorkRequestSummary>(
                new java.util.function.Supplier<ListStorageWorkRequestsRequest.Builder>() {
                    @Override
                    public ListStorageWorkRequestsRequest.Builder get() {
                        return ListStorageWorkRequestsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListStorageWorkRequestsResponse, String>() {
                    @Override
                    public String apply(ListStorageWorkRequestsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListStorageWorkRequestsRequest.Builder>,
                        ListStorageWorkRequestsRequest>() {
                    @Override
                    public ListStorageWorkRequestsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListStorageWorkRequestsRequest.Builder>
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
                        ListStorageWorkRequestsRequest, ListStorageWorkRequestsResponse>() {
                    @Override
                    public ListStorageWorkRequestsResponse apply(
                            ListStorageWorkRequestsRequest request) {
                        return client.listStorageWorkRequests(request);
                    }
                },
                new java.util.function.Function<
                        ListStorageWorkRequestsResponse,
                        java.util.List<
                                com.oracle.bmc.loganalytics.model.StorageWorkRequestSummary>>() {
                    @Override
                    public java.util.List<
                                    com.oracle.bmc.loganalytics.model.StorageWorkRequestSummary>
                            apply(ListStorageWorkRequestsResponse response) {
                        return response.getStorageWorkRequestCollection().getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the
     * listUploadFiles operation. This iterable will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses
     *     received from the service.
     */
    public Iterable<ListUploadFilesResponse> listUploadFilesResponseIterator(
            final ListUploadFilesRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListUploadFilesRequest.Builder, ListUploadFilesRequest, ListUploadFilesResponse>(
                new java.util.function.Supplier<ListUploadFilesRequest.Builder>() {
                    @Override
                    public ListUploadFilesRequest.Builder get() {
                        return ListUploadFilesRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListUploadFilesResponse, String>() {
                    @Override
                    public String apply(ListUploadFilesResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListUploadFilesRequest.Builder>,
                        ListUploadFilesRequest>() {
                    @Override
                    public ListUploadFilesRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListUploadFilesRequest.Builder>
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
                new java.util.function.Function<ListUploadFilesRequest, ListUploadFilesResponse>() {
                    @Override
                    public ListUploadFilesResponse apply(ListUploadFilesRequest request) {
                        return client.listUploadFiles(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link
     * com.oracle.bmc.loganalytics.model.UploadFileSummary} objects contained in responses from the
     * listUploadFiles operation. This iterable will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link
     *     com.oracle.bmc.loganalytics.model.UploadFileSummary} objects contained in responses
     *     received from the service.
     */
    public Iterable<com.oracle.bmc.loganalytics.model.UploadFileSummary>
            listUploadFilesRecordIterator(final ListUploadFilesRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListUploadFilesRequest.Builder,
                ListUploadFilesRequest,
                ListUploadFilesResponse,
                com.oracle.bmc.loganalytics.model.UploadFileSummary>(
                new java.util.function.Supplier<ListUploadFilesRequest.Builder>() {
                    @Override
                    public ListUploadFilesRequest.Builder get() {
                        return ListUploadFilesRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListUploadFilesResponse, String>() {
                    @Override
                    public String apply(ListUploadFilesResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListUploadFilesRequest.Builder>,
                        ListUploadFilesRequest>() {
                    @Override
                    public ListUploadFilesRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListUploadFilesRequest.Builder>
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
                new java.util.function.Function<ListUploadFilesRequest, ListUploadFilesResponse>() {
                    @Override
                    public ListUploadFilesResponse apply(ListUploadFilesRequest request) {
                        return client.listUploadFiles(request);
                    }
                },
                new java.util.function.Function<
                        ListUploadFilesResponse,
                        java.util.List<com.oracle.bmc.loganalytics.model.UploadFileSummary>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.loganalytics.model.UploadFileSummary>
                            apply(ListUploadFilesResponse response) {
                        return response.getUploadFileCollection().getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the
     * listUploadWarnings operation. This iterable will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses
     *     received from the service.
     */
    public Iterable<ListUploadWarningsResponse> listUploadWarningsResponseIterator(
            final ListUploadWarningsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListUploadWarningsRequest.Builder,
                ListUploadWarningsRequest,
                ListUploadWarningsResponse>(
                new java.util.function.Supplier<ListUploadWarningsRequest.Builder>() {
                    @Override
                    public ListUploadWarningsRequest.Builder get() {
                        return ListUploadWarningsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListUploadWarningsResponse, String>() {
                    @Override
                    public String apply(ListUploadWarningsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListUploadWarningsRequest.Builder>,
                        ListUploadWarningsRequest>() {
                    @Override
                    public ListUploadWarningsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListUploadWarningsRequest.Builder>
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
                        ListUploadWarningsRequest, ListUploadWarningsResponse>() {
                    @Override
                    public ListUploadWarningsResponse apply(ListUploadWarningsRequest request) {
                        return client.listUploadWarnings(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link
     * com.oracle.bmc.loganalytics.model.UploadWarningSummary} objects contained in responses from
     * the listUploadWarnings operation. This iterable will fetch more data from the server as
     * needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link
     *     com.oracle.bmc.loganalytics.model.UploadWarningSummary} objects contained in responses
     *     received from the service.
     */
    public Iterable<com.oracle.bmc.loganalytics.model.UploadWarningSummary>
            listUploadWarningsRecordIterator(final ListUploadWarningsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListUploadWarningsRequest.Builder,
                ListUploadWarningsRequest,
                ListUploadWarningsResponse,
                com.oracle.bmc.loganalytics.model.UploadWarningSummary>(
                new java.util.function.Supplier<ListUploadWarningsRequest.Builder>() {
                    @Override
                    public ListUploadWarningsRequest.Builder get() {
                        return ListUploadWarningsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListUploadWarningsResponse, String>() {
                    @Override
                    public String apply(ListUploadWarningsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListUploadWarningsRequest.Builder>,
                        ListUploadWarningsRequest>() {
                    @Override
                    public ListUploadWarningsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListUploadWarningsRequest.Builder>
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
                        ListUploadWarningsRequest, ListUploadWarningsResponse>() {
                    @Override
                    public ListUploadWarningsResponse apply(ListUploadWarningsRequest request) {
                        return client.listUploadWarnings(request);
                    }
                },
                new java.util.function.Function<
                        ListUploadWarningsResponse,
                        java.util.List<com.oracle.bmc.loganalytics.model.UploadWarningSummary>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.loganalytics.model.UploadWarningSummary>
                            apply(ListUploadWarningsResponse response) {
                        return response.getUploadWarningCollection().getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the listUploads
     * operation. This iterable will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses
     *     received from the service.
     */
    public Iterable<ListUploadsResponse> listUploadsResponseIterator(
            final ListUploadsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListUploadsRequest.Builder, ListUploadsRequest, ListUploadsResponse>(
                new java.util.function.Supplier<ListUploadsRequest.Builder>() {
                    @Override
                    public ListUploadsRequest.Builder get() {
                        return ListUploadsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListUploadsResponse, String>() {
                    @Override
                    public String apply(ListUploadsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListUploadsRequest.Builder>,
                        ListUploadsRequest>() {
                    @Override
                    public ListUploadsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListUploadsRequest.Builder>
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
                new java.util.function.Function<ListUploadsRequest, ListUploadsResponse>() {
                    @Override
                    public ListUploadsResponse apply(ListUploadsRequest request) {
                        return client.listUploads(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link
     * com.oracle.bmc.loganalytics.model.UploadSummary} objects contained in responses from the
     * listUploads operation. This iterable will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link
     *     com.oracle.bmc.loganalytics.model.UploadSummary} objects contained in responses received
     *     from the service.
     */
    public Iterable<com.oracle.bmc.loganalytics.model.UploadSummary> listUploadsRecordIterator(
            final ListUploadsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListUploadsRequest.Builder,
                ListUploadsRequest,
                ListUploadsResponse,
                com.oracle.bmc.loganalytics.model.UploadSummary>(
                new java.util.function.Supplier<ListUploadsRequest.Builder>() {
                    @Override
                    public ListUploadsRequest.Builder get() {
                        return ListUploadsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListUploadsResponse, String>() {
                    @Override
                    public String apply(ListUploadsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListUploadsRequest.Builder>,
                        ListUploadsRequest>() {
                    @Override
                    public ListUploadsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListUploadsRequest.Builder>
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
                new java.util.function.Function<ListUploadsRequest, ListUploadsResponse>() {
                    @Override
                    public ListUploadsResponse apply(ListUploadsRequest request) {
                        return client.listUploads(request);
                    }
                },
                new java.util.function.Function<
                        ListUploadsResponse,
                        java.util.List<com.oracle.bmc.loganalytics.model.UploadSummary>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.loganalytics.model.UploadSummary> apply(
                            ListUploadsResponse response) {
                        return response.getUploadCollection().getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the listWarnings
     * operation. This iterable will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses
     *     received from the service.
     */
    public Iterable<ListWarningsResponse> listWarningsResponseIterator(
            final ListWarningsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListWarningsRequest.Builder, ListWarningsRequest, ListWarningsResponse>(
                new java.util.function.Supplier<ListWarningsRequest.Builder>() {
                    @Override
                    public ListWarningsRequest.Builder get() {
                        return ListWarningsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListWarningsResponse, String>() {
                    @Override
                    public String apply(ListWarningsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListWarningsRequest.Builder>,
                        ListWarningsRequest>() {
                    @Override
                    public ListWarningsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListWarningsRequest.Builder>
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
                new java.util.function.Function<ListWarningsRequest, ListWarningsResponse>() {
                    @Override
                    public ListWarningsResponse apply(ListWarningsRequest request) {
                        return client.listWarnings(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link
     * com.oracle.bmc.loganalytics.model.LogAnalyticsWarning} objects contained in responses from
     * the listWarnings operation. This iterable will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link
     *     com.oracle.bmc.loganalytics.model.LogAnalyticsWarning} objects contained in responses
     *     received from the service.
     */
    public Iterable<com.oracle.bmc.loganalytics.model.LogAnalyticsWarning>
            listWarningsRecordIterator(final ListWarningsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListWarningsRequest.Builder,
                ListWarningsRequest,
                ListWarningsResponse,
                com.oracle.bmc.loganalytics.model.LogAnalyticsWarning>(
                new java.util.function.Supplier<ListWarningsRequest.Builder>() {
                    @Override
                    public ListWarningsRequest.Builder get() {
                        return ListWarningsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListWarningsResponse, String>() {
                    @Override
                    public String apply(ListWarningsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListWarningsRequest.Builder>,
                        ListWarningsRequest>() {
                    @Override
                    public ListWarningsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListWarningsRequest.Builder>
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
                new java.util.function.Function<ListWarningsRequest, ListWarningsResponse>() {
                    @Override
                    public ListWarningsResponse apply(ListWarningsRequest request) {
                        return client.listWarnings(request);
                    }
                },
                new java.util.function.Function<
                        ListWarningsResponse,
                        java.util.List<com.oracle.bmc.loganalytics.model.LogAnalyticsWarning>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.loganalytics.model.LogAnalyticsWarning>
                            apply(ListWarningsResponse response) {
                        return response.getLogAnalyticsWarningCollection().getItems();
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
     * com.oracle.bmc.loganalytics.model.WorkRequestError} objects contained in responses from the
     * listWorkRequestErrors operation. This iterable will fetch more data from the server as
     * needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link
     *     com.oracle.bmc.loganalytics.model.WorkRequestError} objects contained in responses
     *     received from the service.
     */
    public Iterable<com.oracle.bmc.loganalytics.model.WorkRequestError>
            listWorkRequestErrorsRecordIterator(final ListWorkRequestErrorsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListWorkRequestErrorsRequest.Builder,
                ListWorkRequestErrorsRequest,
                ListWorkRequestErrorsResponse,
                com.oracle.bmc.loganalytics.model.WorkRequestError>(
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
                        java.util.List<com.oracle.bmc.loganalytics.model.WorkRequestError>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.loganalytics.model.WorkRequestError> apply(
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
     * com.oracle.bmc.loganalytics.model.WorkRequestLog} objects contained in responses from the
     * listWorkRequestLogs operation. This iterable will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link
     *     com.oracle.bmc.loganalytics.model.WorkRequestLog} objects contained in responses received
     *     from the service.
     */
    public Iterable<com.oracle.bmc.loganalytics.model.WorkRequestLog>
            listWorkRequestLogsRecordIterator(final ListWorkRequestLogsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListWorkRequestLogsRequest.Builder,
                ListWorkRequestLogsRequest,
                ListWorkRequestLogsResponse,
                com.oracle.bmc.loganalytics.model.WorkRequestLog>(
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
                        java.util.List<com.oracle.bmc.loganalytics.model.WorkRequestLog>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.loganalytics.model.WorkRequestLog> apply(
                            ListWorkRequestLogsResponse response) {
                        return response.getWorkRequestLogCollection().getItems();
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
     * com.oracle.bmc.loganalytics.model.WorkRequestSummary} objects contained in responses from the
     * listWorkRequests operation. This iterable will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link
     *     com.oracle.bmc.loganalytics.model.WorkRequestSummary} objects contained in responses
     *     received from the service.
     */
    public Iterable<com.oracle.bmc.loganalytics.model.WorkRequestSummary>
            listWorkRequestsRecordIterator(final ListWorkRequestsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListWorkRequestsRequest.Builder,
                ListWorkRequestsRequest,
                ListWorkRequestsResponse,
                com.oracle.bmc.loganalytics.model.WorkRequestSummary>(
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
                        java.util.List<com.oracle.bmc.loganalytics.model.WorkRequestSummary>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.loganalytics.model.WorkRequestSummary>
                            apply(ListWorkRequestsResponse response) {
                        return response.getWorkRequestCollection().getItems();
                    }
                });
    }
}

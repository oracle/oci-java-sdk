/**
 * Copyright (c) 2016, 2021, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.loganalytics;

import com.oracle.bmc.loganalytics.requests.*;
import com.oracle.bmc.loganalytics.responses.*;

/**
 * Collection of helper methods that can be used to provide an {@link java.lang.Iterable} interface
 * to any list operations of LogAnalytics where multiple pages of data may be fetched.
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
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200601")
@lombok.RequiredArgsConstructor
public class LogAnalyticsPaginators {
    private final LogAnalytics client;

    /**
     * Creates a new iterable which will iterate over the responses received from the listAssociatedEntities operation. This iterable
     * will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses received from the service.
     */
    public Iterable<ListAssociatedEntitiesResponse> listAssociatedEntitiesResponseIterator(
            final ListAssociatedEntitiesRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListAssociatedEntitiesRequest.Builder, ListAssociatedEntitiesRequest,
                ListAssociatedEntitiesResponse>(
                new com.google.common.base.Supplier<ListAssociatedEntitiesRequest.Builder>() {
                    @Override
                    public ListAssociatedEntitiesRequest.Builder get() {
                        return ListAssociatedEntitiesRequest.builder().copy(request);
                    }
                },
                new com.google.common.base.Function<ListAssociatedEntitiesResponse, String>() {
                    @Override
                    public String apply(ListAssociatedEntitiesResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new com.google.common.base.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListAssociatedEntitiesRequest.Builder>,
                        ListAssociatedEntitiesRequest>() {
                    @Override
                    public ListAssociatedEntitiesRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListAssociatedEntitiesRequest.Builder>
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
                        ListAssociatedEntitiesRequest, ListAssociatedEntitiesResponse>() {
                    @Override
                    public ListAssociatedEntitiesResponse apply(
                            ListAssociatedEntitiesRequest request) {
                        return client.listAssociatedEntities(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link com.oracle.bmc.loganalytics.model.LogAnalyticsAssociatedEntity} objects
     * contained in responses from the listAssociatedEntities operation. This iterable will fetch more data from the
     * server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link com.oracle.bmc.loganalytics.model.LogAnalyticsAssociatedEntity} objects
     * contained in responses received from the service.
     */
    public Iterable<com.oracle.bmc.loganalytics.model.LogAnalyticsAssociatedEntity>
            listAssociatedEntitiesRecordIterator(final ListAssociatedEntitiesRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListAssociatedEntitiesRequest.Builder, ListAssociatedEntitiesRequest,
                ListAssociatedEntitiesResponse,
                com.oracle.bmc.loganalytics.model.LogAnalyticsAssociatedEntity>(
                new com.google.common.base.Supplier<ListAssociatedEntitiesRequest.Builder>() {
                    @Override
                    public ListAssociatedEntitiesRequest.Builder get() {
                        return ListAssociatedEntitiesRequest.builder().copy(request);
                    }
                },
                new com.google.common.base.Function<ListAssociatedEntitiesResponse, String>() {
                    @Override
                    public String apply(ListAssociatedEntitiesResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new com.google.common.base.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListAssociatedEntitiesRequest.Builder>,
                        ListAssociatedEntitiesRequest>() {
                    @Override
                    public ListAssociatedEntitiesRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListAssociatedEntitiesRequest.Builder>
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
                        ListAssociatedEntitiesRequest, ListAssociatedEntitiesResponse>() {
                    @Override
                    public ListAssociatedEntitiesResponse apply(
                            ListAssociatedEntitiesRequest request) {
                        return client.listAssociatedEntities(request);
                    }
                },
                new com.google.common.base.Function<
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
     * Creates a new iterable which will iterate over the responses received from the listConfigWorkRequests operation. This iterable
     * will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses received from the service.
     */
    public Iterable<ListConfigWorkRequestsResponse> listConfigWorkRequestsResponseIterator(
            final ListConfigWorkRequestsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListConfigWorkRequestsRequest.Builder, ListConfigWorkRequestsRequest,
                ListConfigWorkRequestsResponse>(
                new com.google.common.base.Supplier<ListConfigWorkRequestsRequest.Builder>() {
                    @Override
                    public ListConfigWorkRequestsRequest.Builder get() {
                        return ListConfigWorkRequestsRequest.builder().copy(request);
                    }
                },
                new com.google.common.base.Function<ListConfigWorkRequestsResponse, String>() {
                    @Override
                    public String apply(ListConfigWorkRequestsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new com.google.common.base.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListConfigWorkRequestsRequest.Builder>,
                        ListConfigWorkRequestsRequest>() {
                    @Override
                    public ListConfigWorkRequestsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListConfigWorkRequestsRequest.Builder>
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
                        ListConfigWorkRequestsRequest, ListConfigWorkRequestsResponse>() {
                    @Override
                    public ListConfigWorkRequestsResponse apply(
                            ListConfigWorkRequestsRequest request) {
                        return client.listConfigWorkRequests(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link com.oracle.bmc.loganalytics.model.LogAnalyticsConfigWorkRequestSummary} objects
     * contained in responses from the listConfigWorkRequests operation. This iterable will fetch more data from the
     * server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link com.oracle.bmc.loganalytics.model.LogAnalyticsConfigWorkRequestSummary} objects
     * contained in responses received from the service.
     */
    public Iterable<com.oracle.bmc.loganalytics.model.LogAnalyticsConfigWorkRequestSummary>
            listConfigWorkRequestsRecordIterator(final ListConfigWorkRequestsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListConfigWorkRequestsRequest.Builder, ListConfigWorkRequestsRequest,
                ListConfigWorkRequestsResponse,
                com.oracle.bmc.loganalytics.model.LogAnalyticsConfigWorkRequestSummary>(
                new com.google.common.base.Supplier<ListConfigWorkRequestsRequest.Builder>() {
                    @Override
                    public ListConfigWorkRequestsRequest.Builder get() {
                        return ListConfigWorkRequestsRequest.builder().copy(request);
                    }
                },
                new com.google.common.base.Function<ListConfigWorkRequestsResponse, String>() {
                    @Override
                    public String apply(ListConfigWorkRequestsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new com.google.common.base.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListConfigWorkRequestsRequest.Builder>,
                        ListConfigWorkRequestsRequest>() {
                    @Override
                    public ListConfigWorkRequestsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListConfigWorkRequestsRequest.Builder>
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
                        ListConfigWorkRequestsRequest, ListConfigWorkRequestsResponse>() {
                    @Override
                    public ListConfigWorkRequestsResponse apply(
                            ListConfigWorkRequestsRequest request) {
                        return client.listConfigWorkRequests(request);
                    }
                },
                new com.google.common.base.Function<
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
     * Creates a new iterable which will iterate over the responses received from the listEntityAssociations operation. This iterable
     * will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses received from the service.
     */
    public Iterable<ListEntityAssociationsResponse> listEntityAssociationsResponseIterator(
            final ListEntityAssociationsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListEntityAssociationsRequest.Builder, ListEntityAssociationsRequest,
                ListEntityAssociationsResponse>(
                new com.google.common.base.Supplier<ListEntityAssociationsRequest.Builder>() {
                    @Override
                    public ListEntityAssociationsRequest.Builder get() {
                        return ListEntityAssociationsRequest.builder().copy(request);
                    }
                },
                new com.google.common.base.Function<ListEntityAssociationsResponse, String>() {
                    @Override
                    public String apply(ListEntityAssociationsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new com.google.common.base.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListEntityAssociationsRequest.Builder>,
                        ListEntityAssociationsRequest>() {
                    @Override
                    public ListEntityAssociationsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListEntityAssociationsRequest.Builder>
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
                        ListEntityAssociationsRequest, ListEntityAssociationsResponse>() {
                    @Override
                    public ListEntityAssociationsResponse apply(
                            ListEntityAssociationsRequest request) {
                        return client.listEntityAssociations(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link com.oracle.bmc.loganalytics.model.LogAnalyticsEntitySummary} objects
     * contained in responses from the listEntityAssociations operation. This iterable will fetch more data from the
     * server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link com.oracle.bmc.loganalytics.model.LogAnalyticsEntitySummary} objects
     * contained in responses received from the service.
     */
    public Iterable<com.oracle.bmc.loganalytics.model.LogAnalyticsEntitySummary>
            listEntityAssociationsRecordIterator(final ListEntityAssociationsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListEntityAssociationsRequest.Builder, ListEntityAssociationsRequest,
                ListEntityAssociationsResponse,
                com.oracle.bmc.loganalytics.model.LogAnalyticsEntitySummary>(
                new com.google.common.base.Supplier<ListEntityAssociationsRequest.Builder>() {
                    @Override
                    public ListEntityAssociationsRequest.Builder get() {
                        return ListEntityAssociationsRequest.builder().copy(request);
                    }
                },
                new com.google.common.base.Function<ListEntityAssociationsResponse, String>() {
                    @Override
                    public String apply(ListEntityAssociationsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new com.google.common.base.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListEntityAssociationsRequest.Builder>,
                        ListEntityAssociationsRequest>() {
                    @Override
                    public ListEntityAssociationsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListEntityAssociationsRequest.Builder>
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
                        ListEntityAssociationsRequest, ListEntityAssociationsResponse>() {
                    @Override
                    public ListEntityAssociationsResponse apply(
                            ListEntityAssociationsRequest request) {
                        return client.listEntityAssociations(request);
                    }
                },
                new com.google.common.base.Function<
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
     * Creates a new iterable which will iterate over the responses received from the listEntitySourceAssociations operation. This iterable
     * will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses received from the service.
     */
    public Iterable<ListEntitySourceAssociationsResponse>
            listEntitySourceAssociationsResponseIterator(
                    final ListEntitySourceAssociationsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListEntitySourceAssociationsRequest.Builder, ListEntitySourceAssociationsRequest,
                ListEntitySourceAssociationsResponse>(
                new com.google.common.base.Supplier<ListEntitySourceAssociationsRequest.Builder>() {
                    @Override
                    public ListEntitySourceAssociationsRequest.Builder get() {
                        return ListEntitySourceAssociationsRequest.builder().copy(request);
                    }
                },
                new com.google.common.base.Function<
                        ListEntitySourceAssociationsResponse, String>() {
                    @Override
                    public String apply(ListEntitySourceAssociationsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new com.google.common.base.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListEntitySourceAssociationsRequest.Builder>,
                        ListEntitySourceAssociationsRequest>() {
                    @Override
                    public ListEntitySourceAssociationsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListEntitySourceAssociationsRequest.Builder>
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
     * Creates a new iterable which will iterate over the {@link com.oracle.bmc.loganalytics.model.LogAnalyticsAssociation} objects
     * contained in responses from the listEntitySourceAssociations operation. This iterable will fetch more data from the
     * server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link com.oracle.bmc.loganalytics.model.LogAnalyticsAssociation} objects
     * contained in responses received from the service.
     */
    public Iterable<com.oracle.bmc.loganalytics.model.LogAnalyticsAssociation>
            listEntitySourceAssociationsRecordIterator(
                    final ListEntitySourceAssociationsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListEntitySourceAssociationsRequest.Builder, ListEntitySourceAssociationsRequest,
                ListEntitySourceAssociationsResponse,
                com.oracle.bmc.loganalytics.model.LogAnalyticsAssociation>(
                new com.google.common.base.Supplier<ListEntitySourceAssociationsRequest.Builder>() {
                    @Override
                    public ListEntitySourceAssociationsRequest.Builder get() {
                        return ListEntitySourceAssociationsRequest.builder().copy(request);
                    }
                },
                new com.google.common.base.Function<
                        ListEntitySourceAssociationsResponse, String>() {
                    @Override
                    public String apply(ListEntitySourceAssociationsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new com.google.common.base.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListEntitySourceAssociationsRequest.Builder>,
                        ListEntitySourceAssociationsRequest>() {
                    @Override
                    public ListEntitySourceAssociationsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListEntitySourceAssociationsRequest.Builder>
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
                        ListEntitySourceAssociationsRequest,
                        ListEntitySourceAssociationsResponse>() {
                    @Override
                    public ListEntitySourceAssociationsResponse apply(
                            ListEntitySourceAssociationsRequest request) {
                        return client.listEntitySourceAssociations(request);
                    }
                },
                new com.google.common.base.Function<
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
     * Creates a new iterable which will iterate over the responses received from the listFields operation. This iterable
     * will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses received from the service.
     */
    public Iterable<ListFieldsResponse> listFieldsResponseIterator(
            final ListFieldsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListFieldsRequest.Builder, ListFieldsRequest, ListFieldsResponse>(
                new com.google.common.base.Supplier<ListFieldsRequest.Builder>() {
                    @Override
                    public ListFieldsRequest.Builder get() {
                        return ListFieldsRequest.builder().copy(request);
                    }
                },
                new com.google.common.base.Function<ListFieldsResponse, String>() {
                    @Override
                    public String apply(ListFieldsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new com.google.common.base.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListFieldsRequest.Builder>,
                        ListFieldsRequest>() {
                    @Override
                    public ListFieldsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListFieldsRequest.Builder>
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
                new com.google.common.base.Function<ListFieldsRequest, ListFieldsResponse>() {
                    @Override
                    public ListFieldsResponse apply(ListFieldsRequest request) {
                        return client.listFields(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link com.oracle.bmc.loganalytics.model.LogAnalyticsFieldSummary} objects
     * contained in responses from the listFields operation. This iterable will fetch more data from the
     * server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link com.oracle.bmc.loganalytics.model.LogAnalyticsFieldSummary} objects
     * contained in responses received from the service.
     */
    public Iterable<com.oracle.bmc.loganalytics.model.LogAnalyticsFieldSummary>
            listFieldsRecordIterator(final ListFieldsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListFieldsRequest.Builder, ListFieldsRequest, ListFieldsResponse,
                com.oracle.bmc.loganalytics.model.LogAnalyticsFieldSummary>(
                new com.google.common.base.Supplier<ListFieldsRequest.Builder>() {
                    @Override
                    public ListFieldsRequest.Builder get() {
                        return ListFieldsRequest.builder().copy(request);
                    }
                },
                new com.google.common.base.Function<ListFieldsResponse, String>() {
                    @Override
                    public String apply(ListFieldsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new com.google.common.base.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListFieldsRequest.Builder>,
                        ListFieldsRequest>() {
                    @Override
                    public ListFieldsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListFieldsRequest.Builder>
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
                new com.google.common.base.Function<ListFieldsRequest, ListFieldsResponse>() {
                    @Override
                    public ListFieldsResponse apply(ListFieldsRequest request) {
                        return client.listFields(request);
                    }
                },
                new com.google.common.base.Function<
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
     * Creates a new iterable which will iterate over the responses received from the listLabelPriorities operation. This iterable
     * will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses received from the service.
     */
    public Iterable<ListLabelPrioritiesResponse> listLabelPrioritiesResponseIterator(
            final ListLabelPrioritiesRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListLabelPrioritiesRequest.Builder, ListLabelPrioritiesRequest,
                ListLabelPrioritiesResponse>(
                new com.google.common.base.Supplier<ListLabelPrioritiesRequest.Builder>() {
                    @Override
                    public ListLabelPrioritiesRequest.Builder get() {
                        return ListLabelPrioritiesRequest.builder().copy(request);
                    }
                },
                new com.google.common.base.Function<ListLabelPrioritiesResponse, String>() {
                    @Override
                    public String apply(ListLabelPrioritiesResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new com.google.common.base.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListLabelPrioritiesRequest.Builder>,
                        ListLabelPrioritiesRequest>() {
                    @Override
                    public ListLabelPrioritiesRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListLabelPrioritiesRequest.Builder>
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
                        ListLabelPrioritiesRequest, ListLabelPrioritiesResponse>() {
                    @Override
                    public ListLabelPrioritiesResponse apply(ListLabelPrioritiesRequest request) {
                        return client.listLabelPriorities(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link com.oracle.bmc.loganalytics.model.LabelPriority} objects
     * contained in responses from the listLabelPriorities operation. This iterable will fetch more data from the
     * server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link com.oracle.bmc.loganalytics.model.LabelPriority} objects
     * contained in responses received from the service.
     */
    public Iterable<com.oracle.bmc.loganalytics.model.LabelPriority>
            listLabelPrioritiesRecordIterator(final ListLabelPrioritiesRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListLabelPrioritiesRequest.Builder, ListLabelPrioritiesRequest,
                ListLabelPrioritiesResponse, com.oracle.bmc.loganalytics.model.LabelPriority>(
                new com.google.common.base.Supplier<ListLabelPrioritiesRequest.Builder>() {
                    @Override
                    public ListLabelPrioritiesRequest.Builder get() {
                        return ListLabelPrioritiesRequest.builder().copy(request);
                    }
                },
                new com.google.common.base.Function<ListLabelPrioritiesResponse, String>() {
                    @Override
                    public String apply(ListLabelPrioritiesResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new com.google.common.base.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListLabelPrioritiesRequest.Builder>,
                        ListLabelPrioritiesRequest>() {
                    @Override
                    public ListLabelPrioritiesRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListLabelPrioritiesRequest.Builder>
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
                        ListLabelPrioritiesRequest, ListLabelPrioritiesResponse>() {
                    @Override
                    public ListLabelPrioritiesResponse apply(ListLabelPrioritiesRequest request) {
                        return client.listLabelPriorities(request);
                    }
                },
                new com.google.common.base.Function<
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
     * Creates a new iterable which will iterate over the responses received from the listLabelSourceDetails operation. This iterable
     * will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses received from the service.
     */
    public Iterable<ListLabelSourceDetailsResponse> listLabelSourceDetailsResponseIterator(
            final ListLabelSourceDetailsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListLabelSourceDetailsRequest.Builder, ListLabelSourceDetailsRequest,
                ListLabelSourceDetailsResponse>(
                new com.google.common.base.Supplier<ListLabelSourceDetailsRequest.Builder>() {
                    @Override
                    public ListLabelSourceDetailsRequest.Builder get() {
                        return ListLabelSourceDetailsRequest.builder().copy(request);
                    }
                },
                new com.google.common.base.Function<ListLabelSourceDetailsResponse, String>() {
                    @Override
                    public String apply(ListLabelSourceDetailsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new com.google.common.base.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListLabelSourceDetailsRequest.Builder>,
                        ListLabelSourceDetailsRequest>() {
                    @Override
                    public ListLabelSourceDetailsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListLabelSourceDetailsRequest.Builder>
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
                        ListLabelSourceDetailsRequest, ListLabelSourceDetailsResponse>() {
                    @Override
                    public ListLabelSourceDetailsResponse apply(
                            ListLabelSourceDetailsRequest request) {
                        return client.listLabelSourceDetails(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link com.oracle.bmc.loganalytics.model.LabelSourceSummary} objects
     * contained in responses from the listLabelSourceDetails operation. This iterable will fetch more data from the
     * server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link com.oracle.bmc.loganalytics.model.LabelSourceSummary} objects
     * contained in responses received from the service.
     */
    public Iterable<com.oracle.bmc.loganalytics.model.LabelSourceSummary>
            listLabelSourceDetailsRecordIterator(final ListLabelSourceDetailsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListLabelSourceDetailsRequest.Builder, ListLabelSourceDetailsRequest,
                ListLabelSourceDetailsResponse,
                com.oracle.bmc.loganalytics.model.LabelSourceSummary>(
                new com.google.common.base.Supplier<ListLabelSourceDetailsRequest.Builder>() {
                    @Override
                    public ListLabelSourceDetailsRequest.Builder get() {
                        return ListLabelSourceDetailsRequest.builder().copy(request);
                    }
                },
                new com.google.common.base.Function<ListLabelSourceDetailsResponse, String>() {
                    @Override
                    public String apply(ListLabelSourceDetailsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new com.google.common.base.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListLabelSourceDetailsRequest.Builder>,
                        ListLabelSourceDetailsRequest>() {
                    @Override
                    public ListLabelSourceDetailsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListLabelSourceDetailsRequest.Builder>
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
                        ListLabelSourceDetailsRequest, ListLabelSourceDetailsResponse>() {
                    @Override
                    public ListLabelSourceDetailsResponse apply(
                            ListLabelSourceDetailsRequest request) {
                        return client.listLabelSourceDetails(request);
                    }
                },
                new com.google.common.base.Function<
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
     * Creates a new iterable which will iterate over the responses received from the listLabels operation. This iterable
     * will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses received from the service.
     */
    public Iterable<ListLabelsResponse> listLabelsResponseIterator(
            final ListLabelsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListLabelsRequest.Builder, ListLabelsRequest, ListLabelsResponse>(
                new com.google.common.base.Supplier<ListLabelsRequest.Builder>() {
                    @Override
                    public ListLabelsRequest.Builder get() {
                        return ListLabelsRequest.builder().copy(request);
                    }
                },
                new com.google.common.base.Function<ListLabelsResponse, String>() {
                    @Override
                    public String apply(ListLabelsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new com.google.common.base.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListLabelsRequest.Builder>,
                        ListLabelsRequest>() {
                    @Override
                    public ListLabelsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListLabelsRequest.Builder>
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
                new com.google.common.base.Function<ListLabelsRequest, ListLabelsResponse>() {
                    @Override
                    public ListLabelsResponse apply(ListLabelsRequest request) {
                        return client.listLabels(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link com.oracle.bmc.loganalytics.model.LogAnalyticsLabelSummary} objects
     * contained in responses from the listLabels operation. This iterable will fetch more data from the
     * server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link com.oracle.bmc.loganalytics.model.LogAnalyticsLabelSummary} objects
     * contained in responses received from the service.
     */
    public Iterable<com.oracle.bmc.loganalytics.model.LogAnalyticsLabelSummary>
            listLabelsRecordIterator(final ListLabelsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListLabelsRequest.Builder, ListLabelsRequest, ListLabelsResponse,
                com.oracle.bmc.loganalytics.model.LogAnalyticsLabelSummary>(
                new com.google.common.base.Supplier<ListLabelsRequest.Builder>() {
                    @Override
                    public ListLabelsRequest.Builder get() {
                        return ListLabelsRequest.builder().copy(request);
                    }
                },
                new com.google.common.base.Function<ListLabelsResponse, String>() {
                    @Override
                    public String apply(ListLabelsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new com.google.common.base.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListLabelsRequest.Builder>,
                        ListLabelsRequest>() {
                    @Override
                    public ListLabelsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListLabelsRequest.Builder>
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
                new com.google.common.base.Function<ListLabelsRequest, ListLabelsResponse>() {
                    @Override
                    public ListLabelsResponse apply(ListLabelsRequest request) {
                        return client.listLabels(request);
                    }
                },
                new com.google.common.base.Function<
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
     * Creates a new iterable which will iterate over the responses received from the listLogAnalyticsEntities operation. This iterable
     * will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses received from the service.
     */
    public Iterable<ListLogAnalyticsEntitiesResponse> listLogAnalyticsEntitiesResponseIterator(
            final ListLogAnalyticsEntitiesRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListLogAnalyticsEntitiesRequest.Builder, ListLogAnalyticsEntitiesRequest,
                ListLogAnalyticsEntitiesResponse>(
                new com.google.common.base.Supplier<ListLogAnalyticsEntitiesRequest.Builder>() {
                    @Override
                    public ListLogAnalyticsEntitiesRequest.Builder get() {
                        return ListLogAnalyticsEntitiesRequest.builder().copy(request);
                    }
                },
                new com.google.common.base.Function<ListLogAnalyticsEntitiesResponse, String>() {
                    @Override
                    public String apply(ListLogAnalyticsEntitiesResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new com.google.common.base.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListLogAnalyticsEntitiesRequest.Builder>,
                        ListLogAnalyticsEntitiesRequest>() {
                    @Override
                    public ListLogAnalyticsEntitiesRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListLogAnalyticsEntitiesRequest.Builder>
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
                        ListLogAnalyticsEntitiesRequest, ListLogAnalyticsEntitiesResponse>() {
                    @Override
                    public ListLogAnalyticsEntitiesResponse apply(
                            ListLogAnalyticsEntitiesRequest request) {
                        return client.listLogAnalyticsEntities(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link com.oracle.bmc.loganalytics.model.LogAnalyticsEntitySummary} objects
     * contained in responses from the listLogAnalyticsEntities operation. This iterable will fetch more data from the
     * server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link com.oracle.bmc.loganalytics.model.LogAnalyticsEntitySummary} objects
     * contained in responses received from the service.
     */
    public Iterable<com.oracle.bmc.loganalytics.model.LogAnalyticsEntitySummary>
            listLogAnalyticsEntitiesRecordIterator(final ListLogAnalyticsEntitiesRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListLogAnalyticsEntitiesRequest.Builder, ListLogAnalyticsEntitiesRequest,
                ListLogAnalyticsEntitiesResponse,
                com.oracle.bmc.loganalytics.model.LogAnalyticsEntitySummary>(
                new com.google.common.base.Supplier<ListLogAnalyticsEntitiesRequest.Builder>() {
                    @Override
                    public ListLogAnalyticsEntitiesRequest.Builder get() {
                        return ListLogAnalyticsEntitiesRequest.builder().copy(request);
                    }
                },
                new com.google.common.base.Function<ListLogAnalyticsEntitiesResponse, String>() {
                    @Override
                    public String apply(ListLogAnalyticsEntitiesResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new com.google.common.base.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListLogAnalyticsEntitiesRequest.Builder>,
                        ListLogAnalyticsEntitiesRequest>() {
                    @Override
                    public ListLogAnalyticsEntitiesRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListLogAnalyticsEntitiesRequest.Builder>
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
                        ListLogAnalyticsEntitiesRequest, ListLogAnalyticsEntitiesResponse>() {
                    @Override
                    public ListLogAnalyticsEntitiesResponse apply(
                            ListLogAnalyticsEntitiesRequest request) {
                        return client.listLogAnalyticsEntities(request);
                    }
                },
                new com.google.common.base.Function<
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
     * Creates a new iterable which will iterate over the responses received from the listLogAnalyticsEntityTypes operation. This iterable
     * will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses received from the service.
     */
    public Iterable<ListLogAnalyticsEntityTypesResponse>
            listLogAnalyticsEntityTypesResponseIterator(
                    final ListLogAnalyticsEntityTypesRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListLogAnalyticsEntityTypesRequest.Builder, ListLogAnalyticsEntityTypesRequest,
                ListLogAnalyticsEntityTypesResponse>(
                new com.google.common.base.Supplier<ListLogAnalyticsEntityTypesRequest.Builder>() {
                    @Override
                    public ListLogAnalyticsEntityTypesRequest.Builder get() {
                        return ListLogAnalyticsEntityTypesRequest.builder().copy(request);
                    }
                },
                new com.google.common.base.Function<ListLogAnalyticsEntityTypesResponse, String>() {
                    @Override
                    public String apply(ListLogAnalyticsEntityTypesResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new com.google.common.base.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListLogAnalyticsEntityTypesRequest.Builder>,
                        ListLogAnalyticsEntityTypesRequest>() {
                    @Override
                    public ListLogAnalyticsEntityTypesRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListLogAnalyticsEntityTypesRequest.Builder>
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
                        ListLogAnalyticsEntityTypesRequest, ListLogAnalyticsEntityTypesResponse>() {
                    @Override
                    public ListLogAnalyticsEntityTypesResponse apply(
                            ListLogAnalyticsEntityTypesRequest request) {
                        return client.listLogAnalyticsEntityTypes(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link com.oracle.bmc.loganalytics.model.LogAnalyticsEntityTypeSummary} objects
     * contained in responses from the listLogAnalyticsEntityTypes operation. This iterable will fetch more data from the
     * server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link com.oracle.bmc.loganalytics.model.LogAnalyticsEntityTypeSummary} objects
     * contained in responses received from the service.
     */
    public Iterable<com.oracle.bmc.loganalytics.model.LogAnalyticsEntityTypeSummary>
            listLogAnalyticsEntityTypesRecordIterator(
                    final ListLogAnalyticsEntityTypesRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListLogAnalyticsEntityTypesRequest.Builder, ListLogAnalyticsEntityTypesRequest,
                ListLogAnalyticsEntityTypesResponse,
                com.oracle.bmc.loganalytics.model.LogAnalyticsEntityTypeSummary>(
                new com.google.common.base.Supplier<ListLogAnalyticsEntityTypesRequest.Builder>() {
                    @Override
                    public ListLogAnalyticsEntityTypesRequest.Builder get() {
                        return ListLogAnalyticsEntityTypesRequest.builder().copy(request);
                    }
                },
                new com.google.common.base.Function<ListLogAnalyticsEntityTypesResponse, String>() {
                    @Override
                    public String apply(ListLogAnalyticsEntityTypesResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new com.google.common.base.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListLogAnalyticsEntityTypesRequest.Builder>,
                        ListLogAnalyticsEntityTypesRequest>() {
                    @Override
                    public ListLogAnalyticsEntityTypesRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListLogAnalyticsEntityTypesRequest.Builder>
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
                        ListLogAnalyticsEntityTypesRequest, ListLogAnalyticsEntityTypesResponse>() {
                    @Override
                    public ListLogAnalyticsEntityTypesResponse apply(
                            ListLogAnalyticsEntityTypesRequest request) {
                        return client.listLogAnalyticsEntityTypes(request);
                    }
                },
                new com.google.common.base.Function<
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
     * Creates a new iterable which will iterate over the responses received from the listLogAnalyticsLogGroups operation. This iterable
     * will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses received from the service.
     */
    public Iterable<ListLogAnalyticsLogGroupsResponse> listLogAnalyticsLogGroupsResponseIterator(
            final ListLogAnalyticsLogGroupsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListLogAnalyticsLogGroupsRequest.Builder, ListLogAnalyticsLogGroupsRequest,
                ListLogAnalyticsLogGroupsResponse>(
                new com.google.common.base.Supplier<ListLogAnalyticsLogGroupsRequest.Builder>() {
                    @Override
                    public ListLogAnalyticsLogGroupsRequest.Builder get() {
                        return ListLogAnalyticsLogGroupsRequest.builder().copy(request);
                    }
                },
                new com.google.common.base.Function<ListLogAnalyticsLogGroupsResponse, String>() {
                    @Override
                    public String apply(ListLogAnalyticsLogGroupsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new com.google.common.base.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListLogAnalyticsLogGroupsRequest.Builder>,
                        ListLogAnalyticsLogGroupsRequest>() {
                    @Override
                    public ListLogAnalyticsLogGroupsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListLogAnalyticsLogGroupsRequest.Builder>
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
                        ListLogAnalyticsLogGroupsRequest, ListLogAnalyticsLogGroupsResponse>() {
                    @Override
                    public ListLogAnalyticsLogGroupsResponse apply(
                            ListLogAnalyticsLogGroupsRequest request) {
                        return client.listLogAnalyticsLogGroups(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link com.oracle.bmc.loganalytics.model.LogAnalyticsLogGroupSummary} objects
     * contained in responses from the listLogAnalyticsLogGroups operation. This iterable will fetch more data from the
     * server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link com.oracle.bmc.loganalytics.model.LogAnalyticsLogGroupSummary} objects
     * contained in responses received from the service.
     */
    public Iterable<com.oracle.bmc.loganalytics.model.LogAnalyticsLogGroupSummary>
            listLogAnalyticsLogGroupsRecordIterator(
                    final ListLogAnalyticsLogGroupsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListLogAnalyticsLogGroupsRequest.Builder, ListLogAnalyticsLogGroupsRequest,
                ListLogAnalyticsLogGroupsResponse,
                com.oracle.bmc.loganalytics.model.LogAnalyticsLogGroupSummary>(
                new com.google.common.base.Supplier<ListLogAnalyticsLogGroupsRequest.Builder>() {
                    @Override
                    public ListLogAnalyticsLogGroupsRequest.Builder get() {
                        return ListLogAnalyticsLogGroupsRequest.builder().copy(request);
                    }
                },
                new com.google.common.base.Function<ListLogAnalyticsLogGroupsResponse, String>() {
                    @Override
                    public String apply(ListLogAnalyticsLogGroupsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new com.google.common.base.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListLogAnalyticsLogGroupsRequest.Builder>,
                        ListLogAnalyticsLogGroupsRequest>() {
                    @Override
                    public ListLogAnalyticsLogGroupsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListLogAnalyticsLogGroupsRequest.Builder>
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
                        ListLogAnalyticsLogGroupsRequest, ListLogAnalyticsLogGroupsResponse>() {
                    @Override
                    public ListLogAnalyticsLogGroupsResponse apply(
                            ListLogAnalyticsLogGroupsRequest request) {
                        return client.listLogAnalyticsLogGroups(request);
                    }
                },
                new com.google.common.base.Function<
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
     * Creates a new iterable which will iterate over the responses received from the listLogAnalyticsObjectCollectionRules operation. This iterable
     * will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses received from the service.
     */
    public Iterable<ListLogAnalyticsObjectCollectionRulesResponse>
            listLogAnalyticsObjectCollectionRulesResponseIterator(
                    final ListLogAnalyticsObjectCollectionRulesRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListLogAnalyticsObjectCollectionRulesRequest.Builder,
                ListLogAnalyticsObjectCollectionRulesRequest,
                ListLogAnalyticsObjectCollectionRulesResponse>(
                new com.google.common.base.Supplier<
                        ListLogAnalyticsObjectCollectionRulesRequest.Builder>() {
                    @Override
                    public ListLogAnalyticsObjectCollectionRulesRequest.Builder get() {
                        return ListLogAnalyticsObjectCollectionRulesRequest.builder().copy(request);
                    }
                },
                new com.google.common.base.Function<
                        ListLogAnalyticsObjectCollectionRulesResponse, String>() {
                    @Override
                    public String apply(ListLogAnalyticsObjectCollectionRulesResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new com.google.common.base.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListLogAnalyticsObjectCollectionRulesRequest.Builder>,
                        ListLogAnalyticsObjectCollectionRulesRequest>() {
                    @Override
                    public ListLogAnalyticsObjectCollectionRulesRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListLogAnalyticsObjectCollectionRulesRequest.Builder>
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
     * Creates a new iterable which will iterate over the {@link com.oracle.bmc.loganalytics.model.LogAnalyticsObjectCollectionRuleSummary} objects
     * contained in responses from the listLogAnalyticsObjectCollectionRules operation. This iterable will fetch more data from the
     * server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link com.oracle.bmc.loganalytics.model.LogAnalyticsObjectCollectionRuleSummary} objects
     * contained in responses received from the service.
     */
    public Iterable<com.oracle.bmc.loganalytics.model.LogAnalyticsObjectCollectionRuleSummary>
            listLogAnalyticsObjectCollectionRulesRecordIterator(
                    final ListLogAnalyticsObjectCollectionRulesRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListLogAnalyticsObjectCollectionRulesRequest.Builder,
                ListLogAnalyticsObjectCollectionRulesRequest,
                ListLogAnalyticsObjectCollectionRulesResponse,
                com.oracle.bmc.loganalytics.model.LogAnalyticsObjectCollectionRuleSummary>(
                new com.google.common.base.Supplier<
                        ListLogAnalyticsObjectCollectionRulesRequest.Builder>() {
                    @Override
                    public ListLogAnalyticsObjectCollectionRulesRequest.Builder get() {
                        return ListLogAnalyticsObjectCollectionRulesRequest.builder().copy(request);
                    }
                },
                new com.google.common.base.Function<
                        ListLogAnalyticsObjectCollectionRulesResponse, String>() {
                    @Override
                    public String apply(ListLogAnalyticsObjectCollectionRulesResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new com.google.common.base.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListLogAnalyticsObjectCollectionRulesRequest.Builder>,
                        ListLogAnalyticsObjectCollectionRulesRequest>() {
                    @Override
                    public ListLogAnalyticsObjectCollectionRulesRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListLogAnalyticsObjectCollectionRulesRequest.Builder>
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
                        ListLogAnalyticsObjectCollectionRulesRequest,
                        ListLogAnalyticsObjectCollectionRulesResponse>() {
                    @Override
                    public ListLogAnalyticsObjectCollectionRulesResponse apply(
                            ListLogAnalyticsObjectCollectionRulesRequest request) {
                        return client.listLogAnalyticsObjectCollectionRules(request);
                    }
                },
                new com.google.common.base.Function<
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
     * Creates a new iterable which will iterate over the responses received from the listMetaSourceTypes operation. This iterable
     * will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses received from the service.
     */
    public Iterable<ListMetaSourceTypesResponse> listMetaSourceTypesResponseIterator(
            final ListMetaSourceTypesRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListMetaSourceTypesRequest.Builder, ListMetaSourceTypesRequest,
                ListMetaSourceTypesResponse>(
                new com.google.common.base.Supplier<ListMetaSourceTypesRequest.Builder>() {
                    @Override
                    public ListMetaSourceTypesRequest.Builder get() {
                        return ListMetaSourceTypesRequest.builder().copy(request);
                    }
                },
                new com.google.common.base.Function<ListMetaSourceTypesResponse, String>() {
                    @Override
                    public String apply(ListMetaSourceTypesResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new com.google.common.base.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListMetaSourceTypesRequest.Builder>,
                        ListMetaSourceTypesRequest>() {
                    @Override
                    public ListMetaSourceTypesRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListMetaSourceTypesRequest.Builder>
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
                        ListMetaSourceTypesRequest, ListMetaSourceTypesResponse>() {
                    @Override
                    public ListMetaSourceTypesResponse apply(ListMetaSourceTypesRequest request) {
                        return client.listMetaSourceTypes(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link com.oracle.bmc.loganalytics.model.LogAnalyticsMetaSourceType} objects
     * contained in responses from the listMetaSourceTypes operation. This iterable will fetch more data from the
     * server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link com.oracle.bmc.loganalytics.model.LogAnalyticsMetaSourceType} objects
     * contained in responses received from the service.
     */
    public Iterable<com.oracle.bmc.loganalytics.model.LogAnalyticsMetaSourceType>
            listMetaSourceTypesRecordIterator(final ListMetaSourceTypesRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListMetaSourceTypesRequest.Builder, ListMetaSourceTypesRequest,
                ListMetaSourceTypesResponse,
                com.oracle.bmc.loganalytics.model.LogAnalyticsMetaSourceType>(
                new com.google.common.base.Supplier<ListMetaSourceTypesRequest.Builder>() {
                    @Override
                    public ListMetaSourceTypesRequest.Builder get() {
                        return ListMetaSourceTypesRequest.builder().copy(request);
                    }
                },
                new com.google.common.base.Function<ListMetaSourceTypesResponse, String>() {
                    @Override
                    public String apply(ListMetaSourceTypesResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new com.google.common.base.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListMetaSourceTypesRequest.Builder>,
                        ListMetaSourceTypesRequest>() {
                    @Override
                    public ListMetaSourceTypesRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListMetaSourceTypesRequest.Builder>
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
                        ListMetaSourceTypesRequest, ListMetaSourceTypesResponse>() {
                    @Override
                    public ListMetaSourceTypesResponse apply(ListMetaSourceTypesRequest request) {
                        return client.listMetaSourceTypes(request);
                    }
                },
                new com.google.common.base.Function<
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
     * Creates a new iterable which will iterate over the responses received from the listParserFunctions operation. This iterable
     * will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses received from the service.
     */
    public Iterable<ListParserFunctionsResponse> listParserFunctionsResponseIterator(
            final ListParserFunctionsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListParserFunctionsRequest.Builder, ListParserFunctionsRequest,
                ListParserFunctionsResponse>(
                new com.google.common.base.Supplier<ListParserFunctionsRequest.Builder>() {
                    @Override
                    public ListParserFunctionsRequest.Builder get() {
                        return ListParserFunctionsRequest.builder().copy(request);
                    }
                },
                new com.google.common.base.Function<ListParserFunctionsResponse, String>() {
                    @Override
                    public String apply(ListParserFunctionsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new com.google.common.base.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListParserFunctionsRequest.Builder>,
                        ListParserFunctionsRequest>() {
                    @Override
                    public ListParserFunctionsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListParserFunctionsRequest.Builder>
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
                        ListParserFunctionsRequest, ListParserFunctionsResponse>() {
                    @Override
                    public ListParserFunctionsResponse apply(ListParserFunctionsRequest request) {
                        return client.listParserFunctions(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link com.oracle.bmc.loganalytics.model.LogAnalyticsParserFunction} objects
     * contained in responses from the listParserFunctions operation. This iterable will fetch more data from the
     * server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link com.oracle.bmc.loganalytics.model.LogAnalyticsParserFunction} objects
     * contained in responses received from the service.
     */
    public Iterable<com.oracle.bmc.loganalytics.model.LogAnalyticsParserFunction>
            listParserFunctionsRecordIterator(final ListParserFunctionsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListParserFunctionsRequest.Builder, ListParserFunctionsRequest,
                ListParserFunctionsResponse,
                com.oracle.bmc.loganalytics.model.LogAnalyticsParserFunction>(
                new com.google.common.base.Supplier<ListParserFunctionsRequest.Builder>() {
                    @Override
                    public ListParserFunctionsRequest.Builder get() {
                        return ListParserFunctionsRequest.builder().copy(request);
                    }
                },
                new com.google.common.base.Function<ListParserFunctionsResponse, String>() {
                    @Override
                    public String apply(ListParserFunctionsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new com.google.common.base.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListParserFunctionsRequest.Builder>,
                        ListParserFunctionsRequest>() {
                    @Override
                    public ListParserFunctionsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListParserFunctionsRequest.Builder>
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
                        ListParserFunctionsRequest, ListParserFunctionsResponse>() {
                    @Override
                    public ListParserFunctionsResponse apply(ListParserFunctionsRequest request) {
                        return client.listParserFunctions(request);
                    }
                },
                new com.google.common.base.Function<
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
     * Creates a new iterable which will iterate over the responses received from the listParserMetaPlugins operation. This iterable
     * will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses received from the service.
     */
    public Iterable<ListParserMetaPluginsResponse> listParserMetaPluginsResponseIterator(
            final ListParserMetaPluginsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListParserMetaPluginsRequest.Builder, ListParserMetaPluginsRequest,
                ListParserMetaPluginsResponse>(
                new com.google.common.base.Supplier<ListParserMetaPluginsRequest.Builder>() {
                    @Override
                    public ListParserMetaPluginsRequest.Builder get() {
                        return ListParserMetaPluginsRequest.builder().copy(request);
                    }
                },
                new com.google.common.base.Function<ListParserMetaPluginsResponse, String>() {
                    @Override
                    public String apply(ListParserMetaPluginsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new com.google.common.base.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListParserMetaPluginsRequest.Builder>,
                        ListParserMetaPluginsRequest>() {
                    @Override
                    public ListParserMetaPluginsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListParserMetaPluginsRequest.Builder>
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
                        ListParserMetaPluginsRequest, ListParserMetaPluginsResponse>() {
                    @Override
                    public ListParserMetaPluginsResponse apply(
                            ListParserMetaPluginsRequest request) {
                        return client.listParserMetaPlugins(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link com.oracle.bmc.loganalytics.model.LogAnalyticsParserMetaPlugin} objects
     * contained in responses from the listParserMetaPlugins operation. This iterable will fetch more data from the
     * server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link com.oracle.bmc.loganalytics.model.LogAnalyticsParserMetaPlugin} objects
     * contained in responses received from the service.
     */
    public Iterable<com.oracle.bmc.loganalytics.model.LogAnalyticsParserMetaPlugin>
            listParserMetaPluginsRecordIterator(final ListParserMetaPluginsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListParserMetaPluginsRequest.Builder, ListParserMetaPluginsRequest,
                ListParserMetaPluginsResponse,
                com.oracle.bmc.loganalytics.model.LogAnalyticsParserMetaPlugin>(
                new com.google.common.base.Supplier<ListParserMetaPluginsRequest.Builder>() {
                    @Override
                    public ListParserMetaPluginsRequest.Builder get() {
                        return ListParserMetaPluginsRequest.builder().copy(request);
                    }
                },
                new com.google.common.base.Function<ListParserMetaPluginsResponse, String>() {
                    @Override
                    public String apply(ListParserMetaPluginsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new com.google.common.base.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListParserMetaPluginsRequest.Builder>,
                        ListParserMetaPluginsRequest>() {
                    @Override
                    public ListParserMetaPluginsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListParserMetaPluginsRequest.Builder>
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
                        ListParserMetaPluginsRequest, ListParserMetaPluginsResponse>() {
                    @Override
                    public ListParserMetaPluginsResponse apply(
                            ListParserMetaPluginsRequest request) {
                        return client.listParserMetaPlugins(request);
                    }
                },
                new com.google.common.base.Function<
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
     * Creates a new iterable which will iterate over the responses received from the listParsers operation. This iterable
     * will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses received from the service.
     */
    public Iterable<ListParsersResponse> listParsersResponseIterator(
            final ListParsersRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListParsersRequest.Builder, ListParsersRequest, ListParsersResponse>(
                new com.google.common.base.Supplier<ListParsersRequest.Builder>() {
                    @Override
                    public ListParsersRequest.Builder get() {
                        return ListParsersRequest.builder().copy(request);
                    }
                },
                new com.google.common.base.Function<ListParsersResponse, String>() {
                    @Override
                    public String apply(ListParsersResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new com.google.common.base.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListParsersRequest.Builder>,
                        ListParsersRequest>() {
                    @Override
                    public ListParsersRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListParsersRequest.Builder>
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
                new com.google.common.base.Function<ListParsersRequest, ListParsersResponse>() {
                    @Override
                    public ListParsersResponse apply(ListParsersRequest request) {
                        return client.listParsers(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link com.oracle.bmc.loganalytics.model.LogAnalyticsParserSummary} objects
     * contained in responses from the listParsers operation. This iterable will fetch more data from the
     * server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link com.oracle.bmc.loganalytics.model.LogAnalyticsParserSummary} objects
     * contained in responses received from the service.
     */
    public Iterable<com.oracle.bmc.loganalytics.model.LogAnalyticsParserSummary>
            listParsersRecordIterator(final ListParsersRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListParsersRequest.Builder, ListParsersRequest, ListParsersResponse,
                com.oracle.bmc.loganalytics.model.LogAnalyticsParserSummary>(
                new com.google.common.base.Supplier<ListParsersRequest.Builder>() {
                    @Override
                    public ListParsersRequest.Builder get() {
                        return ListParsersRequest.builder().copy(request);
                    }
                },
                new com.google.common.base.Function<ListParsersResponse, String>() {
                    @Override
                    public String apply(ListParsersResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new com.google.common.base.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListParsersRequest.Builder>,
                        ListParsersRequest>() {
                    @Override
                    public ListParsersRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListParsersRequest.Builder>
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
                new com.google.common.base.Function<ListParsersRequest, ListParsersResponse>() {
                    @Override
                    public ListParsersResponse apply(ListParsersRequest request) {
                        return client.listParsers(request);
                    }
                },
                new com.google.common.base.Function<
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
     * Creates a new iterable which will iterate over the responses received from the listQueryWorkRequests operation. This iterable
     * will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses received from the service.
     */
    public Iterable<ListQueryWorkRequestsResponse> listQueryWorkRequestsResponseIterator(
            final ListQueryWorkRequestsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListQueryWorkRequestsRequest.Builder, ListQueryWorkRequestsRequest,
                ListQueryWorkRequestsResponse>(
                new com.google.common.base.Supplier<ListQueryWorkRequestsRequest.Builder>() {
                    @Override
                    public ListQueryWorkRequestsRequest.Builder get() {
                        return ListQueryWorkRequestsRequest.builder().copy(request);
                    }
                },
                new com.google.common.base.Function<ListQueryWorkRequestsResponse, String>() {
                    @Override
                    public String apply(ListQueryWorkRequestsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new com.google.common.base.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListQueryWorkRequestsRequest.Builder>,
                        ListQueryWorkRequestsRequest>() {
                    @Override
                    public ListQueryWorkRequestsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListQueryWorkRequestsRequest.Builder>
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
                        ListQueryWorkRequestsRequest, ListQueryWorkRequestsResponse>() {
                    @Override
                    public ListQueryWorkRequestsResponse apply(
                            ListQueryWorkRequestsRequest request) {
                        return client.listQueryWorkRequests(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link com.oracle.bmc.loganalytics.model.QueryWorkRequestSummary} objects
     * contained in responses from the listQueryWorkRequests operation. This iterable will fetch more data from the
     * server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link com.oracle.bmc.loganalytics.model.QueryWorkRequestSummary} objects
     * contained in responses received from the service.
     */
    public Iterable<com.oracle.bmc.loganalytics.model.QueryWorkRequestSummary>
            listQueryWorkRequestsRecordIterator(final ListQueryWorkRequestsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListQueryWorkRequestsRequest.Builder, ListQueryWorkRequestsRequest,
                ListQueryWorkRequestsResponse,
                com.oracle.bmc.loganalytics.model.QueryWorkRequestSummary>(
                new com.google.common.base.Supplier<ListQueryWorkRequestsRequest.Builder>() {
                    @Override
                    public ListQueryWorkRequestsRequest.Builder get() {
                        return ListQueryWorkRequestsRequest.builder().copy(request);
                    }
                },
                new com.google.common.base.Function<ListQueryWorkRequestsResponse, String>() {
                    @Override
                    public String apply(ListQueryWorkRequestsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new com.google.common.base.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListQueryWorkRequestsRequest.Builder>,
                        ListQueryWorkRequestsRequest>() {
                    @Override
                    public ListQueryWorkRequestsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListQueryWorkRequestsRequest.Builder>
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
                        ListQueryWorkRequestsRequest, ListQueryWorkRequestsResponse>() {
                    @Override
                    public ListQueryWorkRequestsResponse apply(
                            ListQueryWorkRequestsRequest request) {
                        return client.listQueryWorkRequests(request);
                    }
                },
                new com.google.common.base.Function<
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
     * Creates a new iterable which will iterate over the responses received from the listScheduledTasks operation. This iterable
     * will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses received from the service.
     */
    public Iterable<ListScheduledTasksResponse> listScheduledTasksResponseIterator(
            final ListScheduledTasksRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListScheduledTasksRequest.Builder, ListScheduledTasksRequest,
                ListScheduledTasksResponse>(
                new com.google.common.base.Supplier<ListScheduledTasksRequest.Builder>() {
                    @Override
                    public ListScheduledTasksRequest.Builder get() {
                        return ListScheduledTasksRequest.builder().copy(request);
                    }
                },
                new com.google.common.base.Function<ListScheduledTasksResponse, String>() {
                    @Override
                    public String apply(ListScheduledTasksResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new com.google.common.base.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListScheduledTasksRequest.Builder>,
                        ListScheduledTasksRequest>() {
                    @Override
                    public ListScheduledTasksRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListScheduledTasksRequest.Builder>
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
                        ListScheduledTasksRequest, ListScheduledTasksResponse>() {
                    @Override
                    public ListScheduledTasksResponse apply(ListScheduledTasksRequest request) {
                        return client.listScheduledTasks(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link com.oracle.bmc.loganalytics.model.ScheduledTaskSummary} objects
     * contained in responses from the listScheduledTasks operation. This iterable will fetch more data from the
     * server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link com.oracle.bmc.loganalytics.model.ScheduledTaskSummary} objects
     * contained in responses received from the service.
     */
    public Iterable<com.oracle.bmc.loganalytics.model.ScheduledTaskSummary>
            listScheduledTasksRecordIterator(final ListScheduledTasksRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListScheduledTasksRequest.Builder, ListScheduledTasksRequest,
                ListScheduledTasksResponse, com.oracle.bmc.loganalytics.model.ScheduledTaskSummary>(
                new com.google.common.base.Supplier<ListScheduledTasksRequest.Builder>() {
                    @Override
                    public ListScheduledTasksRequest.Builder get() {
                        return ListScheduledTasksRequest.builder().copy(request);
                    }
                },
                new com.google.common.base.Function<ListScheduledTasksResponse, String>() {
                    @Override
                    public String apply(ListScheduledTasksResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new com.google.common.base.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListScheduledTasksRequest.Builder>,
                        ListScheduledTasksRequest>() {
                    @Override
                    public ListScheduledTasksRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListScheduledTasksRequest.Builder>
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
                        ListScheduledTasksRequest, ListScheduledTasksResponse>() {
                    @Override
                    public ListScheduledTasksResponse apply(ListScheduledTasksRequest request) {
                        return client.listScheduledTasks(request);
                    }
                },
                new com.google.common.base.Function<
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
     * Creates a new iterable which will iterate over the responses received from the listSourceAssociations operation. This iterable
     * will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses received from the service.
     */
    public Iterable<ListSourceAssociationsResponse> listSourceAssociationsResponseIterator(
            final ListSourceAssociationsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListSourceAssociationsRequest.Builder, ListSourceAssociationsRequest,
                ListSourceAssociationsResponse>(
                new com.google.common.base.Supplier<ListSourceAssociationsRequest.Builder>() {
                    @Override
                    public ListSourceAssociationsRequest.Builder get() {
                        return ListSourceAssociationsRequest.builder().copy(request);
                    }
                },
                new com.google.common.base.Function<ListSourceAssociationsResponse, String>() {
                    @Override
                    public String apply(ListSourceAssociationsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new com.google.common.base.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListSourceAssociationsRequest.Builder>,
                        ListSourceAssociationsRequest>() {
                    @Override
                    public ListSourceAssociationsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListSourceAssociationsRequest.Builder>
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
                        ListSourceAssociationsRequest, ListSourceAssociationsResponse>() {
                    @Override
                    public ListSourceAssociationsResponse apply(
                            ListSourceAssociationsRequest request) {
                        return client.listSourceAssociations(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link com.oracle.bmc.loganalytics.model.LogAnalyticsAssociation} objects
     * contained in responses from the listSourceAssociations operation. This iterable will fetch more data from the
     * server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link com.oracle.bmc.loganalytics.model.LogAnalyticsAssociation} objects
     * contained in responses received from the service.
     */
    public Iterable<com.oracle.bmc.loganalytics.model.LogAnalyticsAssociation>
            listSourceAssociationsRecordIterator(final ListSourceAssociationsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListSourceAssociationsRequest.Builder, ListSourceAssociationsRequest,
                ListSourceAssociationsResponse,
                com.oracle.bmc.loganalytics.model.LogAnalyticsAssociation>(
                new com.google.common.base.Supplier<ListSourceAssociationsRequest.Builder>() {
                    @Override
                    public ListSourceAssociationsRequest.Builder get() {
                        return ListSourceAssociationsRequest.builder().copy(request);
                    }
                },
                new com.google.common.base.Function<ListSourceAssociationsResponse, String>() {
                    @Override
                    public String apply(ListSourceAssociationsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new com.google.common.base.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListSourceAssociationsRequest.Builder>,
                        ListSourceAssociationsRequest>() {
                    @Override
                    public ListSourceAssociationsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListSourceAssociationsRequest.Builder>
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
                        ListSourceAssociationsRequest, ListSourceAssociationsResponse>() {
                    @Override
                    public ListSourceAssociationsResponse apply(
                            ListSourceAssociationsRequest request) {
                        return client.listSourceAssociations(request);
                    }
                },
                new com.google.common.base.Function<
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
     * Creates a new iterable which will iterate over the responses received from the listSourceExtendedFieldDefinitions operation. This iterable
     * will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses received from the service.
     */
    public Iterable<ListSourceExtendedFieldDefinitionsResponse>
            listSourceExtendedFieldDefinitionsResponseIterator(
                    final ListSourceExtendedFieldDefinitionsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListSourceExtendedFieldDefinitionsRequest.Builder,
                ListSourceExtendedFieldDefinitionsRequest,
                ListSourceExtendedFieldDefinitionsResponse>(
                new com.google.common.base.Supplier<
                        ListSourceExtendedFieldDefinitionsRequest.Builder>() {
                    @Override
                    public ListSourceExtendedFieldDefinitionsRequest.Builder get() {
                        return ListSourceExtendedFieldDefinitionsRequest.builder().copy(request);
                    }
                },
                new com.google.common.base.Function<
                        ListSourceExtendedFieldDefinitionsResponse, String>() {
                    @Override
                    public String apply(ListSourceExtendedFieldDefinitionsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new com.google.common.base.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListSourceExtendedFieldDefinitionsRequest.Builder>,
                        ListSourceExtendedFieldDefinitionsRequest>() {
                    @Override
                    public ListSourceExtendedFieldDefinitionsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListSourceExtendedFieldDefinitionsRequest.Builder>
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
     * Creates a new iterable which will iterate over the {@link com.oracle.bmc.loganalytics.model.LogAnalyticsSourceExtendedFieldDefinition} objects
     * contained in responses from the listSourceExtendedFieldDefinitions operation. This iterable will fetch more data from the
     * server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link com.oracle.bmc.loganalytics.model.LogAnalyticsSourceExtendedFieldDefinition} objects
     * contained in responses received from the service.
     */
    public Iterable<com.oracle.bmc.loganalytics.model.LogAnalyticsSourceExtendedFieldDefinition>
            listSourceExtendedFieldDefinitionsRecordIterator(
                    final ListSourceExtendedFieldDefinitionsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListSourceExtendedFieldDefinitionsRequest.Builder,
                ListSourceExtendedFieldDefinitionsRequest,
                ListSourceExtendedFieldDefinitionsResponse,
                com.oracle.bmc.loganalytics.model.LogAnalyticsSourceExtendedFieldDefinition>(
                new com.google.common.base.Supplier<
                        ListSourceExtendedFieldDefinitionsRequest.Builder>() {
                    @Override
                    public ListSourceExtendedFieldDefinitionsRequest.Builder get() {
                        return ListSourceExtendedFieldDefinitionsRequest.builder().copy(request);
                    }
                },
                new com.google.common.base.Function<
                        ListSourceExtendedFieldDefinitionsResponse, String>() {
                    @Override
                    public String apply(ListSourceExtendedFieldDefinitionsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new com.google.common.base.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListSourceExtendedFieldDefinitionsRequest.Builder>,
                        ListSourceExtendedFieldDefinitionsRequest>() {
                    @Override
                    public ListSourceExtendedFieldDefinitionsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListSourceExtendedFieldDefinitionsRequest.Builder>
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
                        ListSourceExtendedFieldDefinitionsRequest,
                        ListSourceExtendedFieldDefinitionsResponse>() {
                    @Override
                    public ListSourceExtendedFieldDefinitionsResponse apply(
                            ListSourceExtendedFieldDefinitionsRequest request) {
                        return client.listSourceExtendedFieldDefinitions(request);
                    }
                },
                new com.google.common.base.Function<
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
     * Creates a new iterable which will iterate over the responses received from the listSourceLabelOperators operation. This iterable
     * will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses received from the service.
     */
    public Iterable<ListSourceLabelOperatorsResponse> listSourceLabelOperatorsResponseIterator(
            final ListSourceLabelOperatorsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListSourceLabelOperatorsRequest.Builder, ListSourceLabelOperatorsRequest,
                ListSourceLabelOperatorsResponse>(
                new com.google.common.base.Supplier<ListSourceLabelOperatorsRequest.Builder>() {
                    @Override
                    public ListSourceLabelOperatorsRequest.Builder get() {
                        return ListSourceLabelOperatorsRequest.builder().copy(request);
                    }
                },
                new com.google.common.base.Function<ListSourceLabelOperatorsResponse, String>() {
                    @Override
                    public String apply(ListSourceLabelOperatorsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new com.google.common.base.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListSourceLabelOperatorsRequest.Builder>,
                        ListSourceLabelOperatorsRequest>() {
                    @Override
                    public ListSourceLabelOperatorsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListSourceLabelOperatorsRequest.Builder>
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
                        ListSourceLabelOperatorsRequest, ListSourceLabelOperatorsResponse>() {
                    @Override
                    public ListSourceLabelOperatorsResponse apply(
                            ListSourceLabelOperatorsRequest request) {
                        return client.listSourceLabelOperators(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link com.oracle.bmc.loganalytics.model.LogAnalyticsLabelOperator} objects
     * contained in responses from the listSourceLabelOperators operation. This iterable will fetch more data from the
     * server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link com.oracle.bmc.loganalytics.model.LogAnalyticsLabelOperator} objects
     * contained in responses received from the service.
     */
    public Iterable<com.oracle.bmc.loganalytics.model.LogAnalyticsLabelOperator>
            listSourceLabelOperatorsRecordIterator(final ListSourceLabelOperatorsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListSourceLabelOperatorsRequest.Builder, ListSourceLabelOperatorsRequest,
                ListSourceLabelOperatorsResponse,
                com.oracle.bmc.loganalytics.model.LogAnalyticsLabelOperator>(
                new com.google.common.base.Supplier<ListSourceLabelOperatorsRequest.Builder>() {
                    @Override
                    public ListSourceLabelOperatorsRequest.Builder get() {
                        return ListSourceLabelOperatorsRequest.builder().copy(request);
                    }
                },
                new com.google.common.base.Function<ListSourceLabelOperatorsResponse, String>() {
                    @Override
                    public String apply(ListSourceLabelOperatorsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new com.google.common.base.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListSourceLabelOperatorsRequest.Builder>,
                        ListSourceLabelOperatorsRequest>() {
                    @Override
                    public ListSourceLabelOperatorsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListSourceLabelOperatorsRequest.Builder>
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
                        ListSourceLabelOperatorsRequest, ListSourceLabelOperatorsResponse>() {
                    @Override
                    public ListSourceLabelOperatorsResponse apply(
                            ListSourceLabelOperatorsRequest request) {
                        return client.listSourceLabelOperators(request);
                    }
                },
                new com.google.common.base.Function<
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
     * Creates a new iterable which will iterate over the responses received from the listSourceMetaFunctions operation. This iterable
     * will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses received from the service.
     */
    public Iterable<ListSourceMetaFunctionsResponse> listSourceMetaFunctionsResponseIterator(
            final ListSourceMetaFunctionsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListSourceMetaFunctionsRequest.Builder, ListSourceMetaFunctionsRequest,
                ListSourceMetaFunctionsResponse>(
                new com.google.common.base.Supplier<ListSourceMetaFunctionsRequest.Builder>() {
                    @Override
                    public ListSourceMetaFunctionsRequest.Builder get() {
                        return ListSourceMetaFunctionsRequest.builder().copy(request);
                    }
                },
                new com.google.common.base.Function<ListSourceMetaFunctionsResponse, String>() {
                    @Override
                    public String apply(ListSourceMetaFunctionsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new com.google.common.base.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListSourceMetaFunctionsRequest.Builder>,
                        ListSourceMetaFunctionsRequest>() {
                    @Override
                    public ListSourceMetaFunctionsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListSourceMetaFunctionsRequest.Builder>
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
                        ListSourceMetaFunctionsRequest, ListSourceMetaFunctionsResponse>() {
                    @Override
                    public ListSourceMetaFunctionsResponse apply(
                            ListSourceMetaFunctionsRequest request) {
                        return client.listSourceMetaFunctions(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link com.oracle.bmc.loganalytics.model.LogAnalyticsMetaFunction} objects
     * contained in responses from the listSourceMetaFunctions operation. This iterable will fetch more data from the
     * server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link com.oracle.bmc.loganalytics.model.LogAnalyticsMetaFunction} objects
     * contained in responses received from the service.
     */
    public Iterable<com.oracle.bmc.loganalytics.model.LogAnalyticsMetaFunction>
            listSourceMetaFunctionsRecordIterator(final ListSourceMetaFunctionsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListSourceMetaFunctionsRequest.Builder, ListSourceMetaFunctionsRequest,
                ListSourceMetaFunctionsResponse,
                com.oracle.bmc.loganalytics.model.LogAnalyticsMetaFunction>(
                new com.google.common.base.Supplier<ListSourceMetaFunctionsRequest.Builder>() {
                    @Override
                    public ListSourceMetaFunctionsRequest.Builder get() {
                        return ListSourceMetaFunctionsRequest.builder().copy(request);
                    }
                },
                new com.google.common.base.Function<ListSourceMetaFunctionsResponse, String>() {
                    @Override
                    public String apply(ListSourceMetaFunctionsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new com.google.common.base.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListSourceMetaFunctionsRequest.Builder>,
                        ListSourceMetaFunctionsRequest>() {
                    @Override
                    public ListSourceMetaFunctionsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListSourceMetaFunctionsRequest.Builder>
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
                        ListSourceMetaFunctionsRequest, ListSourceMetaFunctionsResponse>() {
                    @Override
                    public ListSourceMetaFunctionsResponse apply(
                            ListSourceMetaFunctionsRequest request) {
                        return client.listSourceMetaFunctions(request);
                    }
                },
                new com.google.common.base.Function<
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
     * Creates a new iterable which will iterate over the responses received from the listSourcePatterns operation. This iterable
     * will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses received from the service.
     */
    public Iterable<ListSourcePatternsResponse> listSourcePatternsResponseIterator(
            final ListSourcePatternsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListSourcePatternsRequest.Builder, ListSourcePatternsRequest,
                ListSourcePatternsResponse>(
                new com.google.common.base.Supplier<ListSourcePatternsRequest.Builder>() {
                    @Override
                    public ListSourcePatternsRequest.Builder get() {
                        return ListSourcePatternsRequest.builder().copy(request);
                    }
                },
                new com.google.common.base.Function<ListSourcePatternsResponse, String>() {
                    @Override
                    public String apply(ListSourcePatternsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new com.google.common.base.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListSourcePatternsRequest.Builder>,
                        ListSourcePatternsRequest>() {
                    @Override
                    public ListSourcePatternsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListSourcePatternsRequest.Builder>
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
                        ListSourcePatternsRequest, ListSourcePatternsResponse>() {
                    @Override
                    public ListSourcePatternsResponse apply(ListSourcePatternsRequest request) {
                        return client.listSourcePatterns(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link com.oracle.bmc.loganalytics.model.LogAnalyticsSourcePattern} objects
     * contained in responses from the listSourcePatterns operation. This iterable will fetch more data from the
     * server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link com.oracle.bmc.loganalytics.model.LogAnalyticsSourcePattern} objects
     * contained in responses received from the service.
     */
    public Iterable<com.oracle.bmc.loganalytics.model.LogAnalyticsSourcePattern>
            listSourcePatternsRecordIterator(final ListSourcePatternsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListSourcePatternsRequest.Builder, ListSourcePatternsRequest,
                ListSourcePatternsResponse,
                com.oracle.bmc.loganalytics.model.LogAnalyticsSourcePattern>(
                new com.google.common.base.Supplier<ListSourcePatternsRequest.Builder>() {
                    @Override
                    public ListSourcePatternsRequest.Builder get() {
                        return ListSourcePatternsRequest.builder().copy(request);
                    }
                },
                new com.google.common.base.Function<ListSourcePatternsResponse, String>() {
                    @Override
                    public String apply(ListSourcePatternsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new com.google.common.base.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListSourcePatternsRequest.Builder>,
                        ListSourcePatternsRequest>() {
                    @Override
                    public ListSourcePatternsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListSourcePatternsRequest.Builder>
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
                        ListSourcePatternsRequest, ListSourcePatternsResponse>() {
                    @Override
                    public ListSourcePatternsResponse apply(ListSourcePatternsRequest request) {
                        return client.listSourcePatterns(request);
                    }
                },
                new com.google.common.base.Function<
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
     * Creates a new iterable which will iterate over the responses received from the listSources operation. This iterable
     * will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses received from the service.
     */
    public Iterable<ListSourcesResponse> listSourcesResponseIterator(
            final ListSourcesRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListSourcesRequest.Builder, ListSourcesRequest, ListSourcesResponse>(
                new com.google.common.base.Supplier<ListSourcesRequest.Builder>() {
                    @Override
                    public ListSourcesRequest.Builder get() {
                        return ListSourcesRequest.builder().copy(request);
                    }
                },
                new com.google.common.base.Function<ListSourcesResponse, String>() {
                    @Override
                    public String apply(ListSourcesResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new com.google.common.base.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListSourcesRequest.Builder>,
                        ListSourcesRequest>() {
                    @Override
                    public ListSourcesRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListSourcesRequest.Builder>
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
                new com.google.common.base.Function<ListSourcesRequest, ListSourcesResponse>() {
                    @Override
                    public ListSourcesResponse apply(ListSourcesRequest request) {
                        return client.listSources(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link com.oracle.bmc.loganalytics.model.LogAnalyticsSourceSummary} objects
     * contained in responses from the listSources operation. This iterable will fetch more data from the
     * server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link com.oracle.bmc.loganalytics.model.LogAnalyticsSourceSummary} objects
     * contained in responses received from the service.
     */
    public Iterable<com.oracle.bmc.loganalytics.model.LogAnalyticsSourceSummary>
            listSourcesRecordIterator(final ListSourcesRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListSourcesRequest.Builder, ListSourcesRequest, ListSourcesResponse,
                com.oracle.bmc.loganalytics.model.LogAnalyticsSourceSummary>(
                new com.google.common.base.Supplier<ListSourcesRequest.Builder>() {
                    @Override
                    public ListSourcesRequest.Builder get() {
                        return ListSourcesRequest.builder().copy(request);
                    }
                },
                new com.google.common.base.Function<ListSourcesResponse, String>() {
                    @Override
                    public String apply(ListSourcesResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new com.google.common.base.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListSourcesRequest.Builder>,
                        ListSourcesRequest>() {
                    @Override
                    public ListSourcesRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListSourcesRequest.Builder>
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
                new com.google.common.base.Function<ListSourcesRequest, ListSourcesResponse>() {
                    @Override
                    public ListSourcesResponse apply(ListSourcesRequest request) {
                        return client.listSources(request);
                    }
                },
                new com.google.common.base.Function<
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
     * Creates a new iterable which will iterate over the responses received from the listStorageWorkRequestErrors operation. This iterable
     * will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses received from the service.
     */
    public Iterable<ListStorageWorkRequestErrorsResponse>
            listStorageWorkRequestErrorsResponseIterator(
                    final ListStorageWorkRequestErrorsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListStorageWorkRequestErrorsRequest.Builder, ListStorageWorkRequestErrorsRequest,
                ListStorageWorkRequestErrorsResponse>(
                new com.google.common.base.Supplier<ListStorageWorkRequestErrorsRequest.Builder>() {
                    @Override
                    public ListStorageWorkRequestErrorsRequest.Builder get() {
                        return ListStorageWorkRequestErrorsRequest.builder().copy(request);
                    }
                },
                new com.google.common.base.Function<
                        ListStorageWorkRequestErrorsResponse, String>() {
                    @Override
                    public String apply(ListStorageWorkRequestErrorsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new com.google.common.base.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListStorageWorkRequestErrorsRequest.Builder>,
                        ListStorageWorkRequestErrorsRequest>() {
                    @Override
                    public ListStorageWorkRequestErrorsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListStorageWorkRequestErrorsRequest.Builder>
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
     * Creates a new iterable which will iterate over the {@link com.oracle.bmc.loganalytics.model.WorkRequestError} objects
     * contained in responses from the listStorageWorkRequestErrors operation. This iterable will fetch more data from the
     * server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link com.oracle.bmc.loganalytics.model.WorkRequestError} objects
     * contained in responses received from the service.
     */
    public Iterable<com.oracle.bmc.loganalytics.model.WorkRequestError>
            listStorageWorkRequestErrorsRecordIterator(
                    final ListStorageWorkRequestErrorsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListStorageWorkRequestErrorsRequest.Builder, ListStorageWorkRequestErrorsRequest,
                ListStorageWorkRequestErrorsResponse,
                com.oracle.bmc.loganalytics.model.WorkRequestError>(
                new com.google.common.base.Supplier<ListStorageWorkRequestErrorsRequest.Builder>() {
                    @Override
                    public ListStorageWorkRequestErrorsRequest.Builder get() {
                        return ListStorageWorkRequestErrorsRequest.builder().copy(request);
                    }
                },
                new com.google.common.base.Function<
                        ListStorageWorkRequestErrorsResponse, String>() {
                    @Override
                    public String apply(ListStorageWorkRequestErrorsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new com.google.common.base.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListStorageWorkRequestErrorsRequest.Builder>,
                        ListStorageWorkRequestErrorsRequest>() {
                    @Override
                    public ListStorageWorkRequestErrorsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListStorageWorkRequestErrorsRequest.Builder>
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
                        ListStorageWorkRequestErrorsRequest,
                        ListStorageWorkRequestErrorsResponse>() {
                    @Override
                    public ListStorageWorkRequestErrorsResponse apply(
                            ListStorageWorkRequestErrorsRequest request) {
                        return client.listStorageWorkRequestErrors(request);
                    }
                },
                new com.google.common.base.Function<
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
     * Creates a new iterable which will iterate over the responses received from the listStorageWorkRequests operation. This iterable
     * will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses received from the service.
     */
    public Iterable<ListStorageWorkRequestsResponse> listStorageWorkRequestsResponseIterator(
            final ListStorageWorkRequestsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListStorageWorkRequestsRequest.Builder, ListStorageWorkRequestsRequest,
                ListStorageWorkRequestsResponse>(
                new com.google.common.base.Supplier<ListStorageWorkRequestsRequest.Builder>() {
                    @Override
                    public ListStorageWorkRequestsRequest.Builder get() {
                        return ListStorageWorkRequestsRequest.builder().copy(request);
                    }
                },
                new com.google.common.base.Function<ListStorageWorkRequestsResponse, String>() {
                    @Override
                    public String apply(ListStorageWorkRequestsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new com.google.common.base.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListStorageWorkRequestsRequest.Builder>,
                        ListStorageWorkRequestsRequest>() {
                    @Override
                    public ListStorageWorkRequestsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListStorageWorkRequestsRequest.Builder>
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
                        ListStorageWorkRequestsRequest, ListStorageWorkRequestsResponse>() {
                    @Override
                    public ListStorageWorkRequestsResponse apply(
                            ListStorageWorkRequestsRequest request) {
                        return client.listStorageWorkRequests(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link com.oracle.bmc.loganalytics.model.StorageWorkRequestSummary} objects
     * contained in responses from the listStorageWorkRequests operation. This iterable will fetch more data from the
     * server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link com.oracle.bmc.loganalytics.model.StorageWorkRequestSummary} objects
     * contained in responses received from the service.
     */
    public Iterable<com.oracle.bmc.loganalytics.model.StorageWorkRequestSummary>
            listStorageWorkRequestsRecordIterator(final ListStorageWorkRequestsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListStorageWorkRequestsRequest.Builder, ListStorageWorkRequestsRequest,
                ListStorageWorkRequestsResponse,
                com.oracle.bmc.loganalytics.model.StorageWorkRequestSummary>(
                new com.google.common.base.Supplier<ListStorageWorkRequestsRequest.Builder>() {
                    @Override
                    public ListStorageWorkRequestsRequest.Builder get() {
                        return ListStorageWorkRequestsRequest.builder().copy(request);
                    }
                },
                new com.google.common.base.Function<ListStorageWorkRequestsResponse, String>() {
                    @Override
                    public String apply(ListStorageWorkRequestsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new com.google.common.base.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListStorageWorkRequestsRequest.Builder>,
                        ListStorageWorkRequestsRequest>() {
                    @Override
                    public ListStorageWorkRequestsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListStorageWorkRequestsRequest.Builder>
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
                        ListStorageWorkRequestsRequest, ListStorageWorkRequestsResponse>() {
                    @Override
                    public ListStorageWorkRequestsResponse apply(
                            ListStorageWorkRequestsRequest request) {
                        return client.listStorageWorkRequests(request);
                    }
                },
                new com.google.common.base.Function<
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
     * Creates a new iterable which will iterate over the responses received from the listUploadFiles operation. This iterable
     * will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses received from the service.
     */
    public Iterable<ListUploadFilesResponse> listUploadFilesResponseIterator(
            final ListUploadFilesRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListUploadFilesRequest.Builder, ListUploadFilesRequest, ListUploadFilesResponse>(
                new com.google.common.base.Supplier<ListUploadFilesRequest.Builder>() {
                    @Override
                    public ListUploadFilesRequest.Builder get() {
                        return ListUploadFilesRequest.builder().copy(request);
                    }
                },
                new com.google.common.base.Function<ListUploadFilesResponse, String>() {
                    @Override
                    public String apply(ListUploadFilesResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new com.google.common.base.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListUploadFilesRequest.Builder>,
                        ListUploadFilesRequest>() {
                    @Override
                    public ListUploadFilesRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListUploadFilesRequest.Builder>
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
                        ListUploadFilesRequest, ListUploadFilesResponse>() {
                    @Override
                    public ListUploadFilesResponse apply(ListUploadFilesRequest request) {
                        return client.listUploadFiles(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link com.oracle.bmc.loganalytics.model.UploadFileSummary} objects
     * contained in responses from the listUploadFiles operation. This iterable will fetch more data from the
     * server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link com.oracle.bmc.loganalytics.model.UploadFileSummary} objects
     * contained in responses received from the service.
     */
    public Iterable<com.oracle.bmc.loganalytics.model.UploadFileSummary>
            listUploadFilesRecordIterator(final ListUploadFilesRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListUploadFilesRequest.Builder, ListUploadFilesRequest, ListUploadFilesResponse,
                com.oracle.bmc.loganalytics.model.UploadFileSummary>(
                new com.google.common.base.Supplier<ListUploadFilesRequest.Builder>() {
                    @Override
                    public ListUploadFilesRequest.Builder get() {
                        return ListUploadFilesRequest.builder().copy(request);
                    }
                },
                new com.google.common.base.Function<ListUploadFilesResponse, String>() {
                    @Override
                    public String apply(ListUploadFilesResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new com.google.common.base.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListUploadFilesRequest.Builder>,
                        ListUploadFilesRequest>() {
                    @Override
                    public ListUploadFilesRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListUploadFilesRequest.Builder>
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
                        ListUploadFilesRequest, ListUploadFilesResponse>() {
                    @Override
                    public ListUploadFilesResponse apply(ListUploadFilesRequest request) {
                        return client.listUploadFiles(request);
                    }
                },
                new com.google.common.base.Function<
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
     * Creates a new iterable which will iterate over the responses received from the listUploadWarnings operation. This iterable
     * will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses received from the service.
     */
    public Iterable<ListUploadWarningsResponse> listUploadWarningsResponseIterator(
            final ListUploadWarningsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListUploadWarningsRequest.Builder, ListUploadWarningsRequest,
                ListUploadWarningsResponse>(
                new com.google.common.base.Supplier<ListUploadWarningsRequest.Builder>() {
                    @Override
                    public ListUploadWarningsRequest.Builder get() {
                        return ListUploadWarningsRequest.builder().copy(request);
                    }
                },
                new com.google.common.base.Function<ListUploadWarningsResponse, String>() {
                    @Override
                    public String apply(ListUploadWarningsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new com.google.common.base.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListUploadWarningsRequest.Builder>,
                        ListUploadWarningsRequest>() {
                    @Override
                    public ListUploadWarningsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListUploadWarningsRequest.Builder>
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
                        ListUploadWarningsRequest, ListUploadWarningsResponse>() {
                    @Override
                    public ListUploadWarningsResponse apply(ListUploadWarningsRequest request) {
                        return client.listUploadWarnings(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link com.oracle.bmc.loganalytics.model.UploadWarningSummary} objects
     * contained in responses from the listUploadWarnings operation. This iterable will fetch more data from the
     * server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link com.oracle.bmc.loganalytics.model.UploadWarningSummary} objects
     * contained in responses received from the service.
     */
    public Iterable<com.oracle.bmc.loganalytics.model.UploadWarningSummary>
            listUploadWarningsRecordIterator(final ListUploadWarningsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListUploadWarningsRequest.Builder, ListUploadWarningsRequest,
                ListUploadWarningsResponse, com.oracle.bmc.loganalytics.model.UploadWarningSummary>(
                new com.google.common.base.Supplier<ListUploadWarningsRequest.Builder>() {
                    @Override
                    public ListUploadWarningsRequest.Builder get() {
                        return ListUploadWarningsRequest.builder().copy(request);
                    }
                },
                new com.google.common.base.Function<ListUploadWarningsResponse, String>() {
                    @Override
                    public String apply(ListUploadWarningsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new com.google.common.base.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListUploadWarningsRequest.Builder>,
                        ListUploadWarningsRequest>() {
                    @Override
                    public ListUploadWarningsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListUploadWarningsRequest.Builder>
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
                        ListUploadWarningsRequest, ListUploadWarningsResponse>() {
                    @Override
                    public ListUploadWarningsResponse apply(ListUploadWarningsRequest request) {
                        return client.listUploadWarnings(request);
                    }
                },
                new com.google.common.base.Function<
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
     * Creates a new iterable which will iterate over the responses received from the listUploads operation. This iterable
     * will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses received from the service.
     */
    public Iterable<ListUploadsResponse> listUploadsResponseIterator(
            final ListUploadsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListUploadsRequest.Builder, ListUploadsRequest, ListUploadsResponse>(
                new com.google.common.base.Supplier<ListUploadsRequest.Builder>() {
                    @Override
                    public ListUploadsRequest.Builder get() {
                        return ListUploadsRequest.builder().copy(request);
                    }
                },
                new com.google.common.base.Function<ListUploadsResponse, String>() {
                    @Override
                    public String apply(ListUploadsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new com.google.common.base.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListUploadsRequest.Builder>,
                        ListUploadsRequest>() {
                    @Override
                    public ListUploadsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListUploadsRequest.Builder>
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
                new com.google.common.base.Function<ListUploadsRequest, ListUploadsResponse>() {
                    @Override
                    public ListUploadsResponse apply(ListUploadsRequest request) {
                        return client.listUploads(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link com.oracle.bmc.loganalytics.model.UploadSummary} objects
     * contained in responses from the listUploads operation. This iterable will fetch more data from the
     * server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link com.oracle.bmc.loganalytics.model.UploadSummary} objects
     * contained in responses received from the service.
     */
    public Iterable<com.oracle.bmc.loganalytics.model.UploadSummary> listUploadsRecordIterator(
            final ListUploadsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListUploadsRequest.Builder, ListUploadsRequest, ListUploadsResponse,
                com.oracle.bmc.loganalytics.model.UploadSummary>(
                new com.google.common.base.Supplier<ListUploadsRequest.Builder>() {
                    @Override
                    public ListUploadsRequest.Builder get() {
                        return ListUploadsRequest.builder().copy(request);
                    }
                },
                new com.google.common.base.Function<ListUploadsResponse, String>() {
                    @Override
                    public String apply(ListUploadsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new com.google.common.base.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListUploadsRequest.Builder>,
                        ListUploadsRequest>() {
                    @Override
                    public ListUploadsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListUploadsRequest.Builder>
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
                new com.google.common.base.Function<ListUploadsRequest, ListUploadsResponse>() {
                    @Override
                    public ListUploadsResponse apply(ListUploadsRequest request) {
                        return client.listUploads(request);
                    }
                },
                new com.google.common.base.Function<
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
     * Creates a new iterable which will iterate over the {@link com.oracle.bmc.loganalytics.model.WorkRequestError} objects
     * contained in responses from the listWorkRequestErrors operation. This iterable will fetch more data from the
     * server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link com.oracle.bmc.loganalytics.model.WorkRequestError} objects
     * contained in responses received from the service.
     */
    public Iterable<com.oracle.bmc.loganalytics.model.WorkRequestError>
            listWorkRequestErrorsRecordIterator(final ListWorkRequestErrorsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListWorkRequestErrorsRequest.Builder, ListWorkRequestErrorsRequest,
                ListWorkRequestErrorsResponse, com.oracle.bmc.loganalytics.model.WorkRequestError>(
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
                        java.util.List<com.oracle.bmc.loganalytics.model.WorkRequestError>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.loganalytics.model.WorkRequestError> apply(
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
     * Creates a new iterable which will iterate over the {@link com.oracle.bmc.loganalytics.model.WorkRequestLog} objects
     * contained in responses from the listWorkRequestLogs operation. This iterable will fetch more data from the
     * server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link com.oracle.bmc.loganalytics.model.WorkRequestLog} objects
     * contained in responses received from the service.
     */
    public Iterable<com.oracle.bmc.loganalytics.model.WorkRequestLog>
            listWorkRequestLogsRecordIterator(final ListWorkRequestLogsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListWorkRequestLogsRequest.Builder, ListWorkRequestLogsRequest,
                ListWorkRequestLogsResponse, com.oracle.bmc.loganalytics.model.WorkRequestLog>(
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
                        java.util.List<com.oracle.bmc.loganalytics.model.WorkRequestLog>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.loganalytics.model.WorkRequestLog> apply(
                            ListWorkRequestLogsResponse response) {
                        return response.getWorkRequestLogCollection().getItems();
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
     * Creates a new iterable which will iterate over the {@link com.oracle.bmc.loganalytics.model.WorkRequestSummary} objects
     * contained in responses from the listWorkRequests operation. This iterable will fetch more data from the
     * server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link com.oracle.bmc.loganalytics.model.WorkRequestSummary} objects
     * contained in responses received from the service.
     */
    public Iterable<com.oracle.bmc.loganalytics.model.WorkRequestSummary>
            listWorkRequestsRecordIterator(final ListWorkRequestsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListWorkRequestsRequest.Builder, ListWorkRequestsRequest, ListWorkRequestsResponse,
                com.oracle.bmc.loganalytics.model.WorkRequestSummary>(
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
                        java.util.List<com.oracle.bmc.loganalytics.model.WorkRequestSummary>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.loganalytics.model.WorkRequestSummary>
                            apply(ListWorkRequestsResponse response) {
                        return response.getWorkRequestCollection().getItems();
                    }
                });
    }
}

/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.marketplacepublisher;

import com.oracle.bmc.marketplacepublisher.requests.*;
import com.oracle.bmc.marketplacepublisher.responses.*;

/**
 * Collection of helper methods that can be used to provide an {@link java.lang.Iterable} interface
 * to any list operations of MarketplacePublisher where multiple pages of data may be fetched. Two
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
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20241201")
public class MarketplacePublisherPaginators {
    private final MarketplacePublisher client;

    public MarketplacePublisherPaginators(MarketplacePublisher client) {
        this.client = client;
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the listArtifacts
     * operation. This iterable will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses
     *     received from the service.
     */
    public Iterable<ListArtifactsResponse> listArtifactsResponseIterator(
            final ListArtifactsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListArtifactsRequest.Builder, ListArtifactsRequest, ListArtifactsResponse>(
                new java.util.function.Supplier<ListArtifactsRequest.Builder>() {
                    @Override
                    public ListArtifactsRequest.Builder get() {
                        return ListArtifactsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListArtifactsResponse, String>() {
                    @Override
                    public String apply(ListArtifactsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListArtifactsRequest.Builder>,
                        ListArtifactsRequest>() {
                    @Override
                    public ListArtifactsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListArtifactsRequest.Builder>
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
                new java.util.function.Function<ListArtifactsRequest, ListArtifactsResponse>() {
                    @Override
                    public ListArtifactsResponse apply(ListArtifactsRequest request) {
                        return client.listArtifacts(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link
     * com.oracle.bmc.marketplacepublisher.model.ArtifactSummary} objects contained in responses
     * from the listArtifacts operation. This iterable will fetch more data from the server as
     * needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link
     *     com.oracle.bmc.marketplacepublisher.model.ArtifactSummary} objects contained in responses
     *     received from the service.
     */
    public Iterable<com.oracle.bmc.marketplacepublisher.model.ArtifactSummary>
            listArtifactsRecordIterator(final ListArtifactsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListArtifactsRequest.Builder,
                ListArtifactsRequest,
                ListArtifactsResponse,
                com.oracle.bmc.marketplacepublisher.model.ArtifactSummary>(
                new java.util.function.Supplier<ListArtifactsRequest.Builder>() {
                    @Override
                    public ListArtifactsRequest.Builder get() {
                        return ListArtifactsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListArtifactsResponse, String>() {
                    @Override
                    public String apply(ListArtifactsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListArtifactsRequest.Builder>,
                        ListArtifactsRequest>() {
                    @Override
                    public ListArtifactsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListArtifactsRequest.Builder>
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
                new java.util.function.Function<ListArtifactsRequest, ListArtifactsResponse>() {
                    @Override
                    public ListArtifactsResponse apply(ListArtifactsRequest request) {
                        return client.listArtifacts(request);
                    }
                },
                new java.util.function.Function<
                        ListArtifactsResponse,
                        java.util.List<
                                com.oracle.bmc.marketplacepublisher.model.ArtifactSummary>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.marketplacepublisher.model.ArtifactSummary>
                            apply(ListArtifactsResponse response) {
                        return response.getArtifactCollection().getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the
     * listAvailableServices operation. This iterable will fetch more data from the server as
     * needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses
     *     received from the service.
     */
    public Iterable<ListAvailableServicesResponse> listAvailableServicesResponseIterator(
            final ListAvailableServicesRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListAvailableServicesRequest.Builder,
                ListAvailableServicesRequest,
                ListAvailableServicesResponse>(
                new java.util.function.Supplier<ListAvailableServicesRequest.Builder>() {
                    @Override
                    public ListAvailableServicesRequest.Builder get() {
                        return ListAvailableServicesRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListAvailableServicesResponse, String>() {
                    @Override
                    public String apply(ListAvailableServicesResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListAvailableServicesRequest.Builder>,
                        ListAvailableServicesRequest>() {
                    @Override
                    public ListAvailableServicesRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListAvailableServicesRequest.Builder>
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
                        ListAvailableServicesRequest, ListAvailableServicesResponse>() {
                    @Override
                    public ListAvailableServicesResponse apply(
                            ListAvailableServicesRequest request) {
                        return client.listAvailableServices(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link
     * com.oracle.bmc.marketplacepublisher.model.AvailableServiceSummary} objects contained in
     * responses from the listAvailableServices operation. This iterable will fetch more data from
     * the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link
     *     com.oracle.bmc.marketplacepublisher.model.AvailableServiceSummary} objects contained in
     *     responses received from the service.
     */
    public Iterable<com.oracle.bmc.marketplacepublisher.model.AvailableServiceSummary>
            listAvailableServicesRecordIterator(final ListAvailableServicesRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListAvailableServicesRequest.Builder,
                ListAvailableServicesRequest,
                ListAvailableServicesResponse,
                com.oracle.bmc.marketplacepublisher.model.AvailableServiceSummary>(
                new java.util.function.Supplier<ListAvailableServicesRequest.Builder>() {
                    @Override
                    public ListAvailableServicesRequest.Builder get() {
                        return ListAvailableServicesRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListAvailableServicesResponse, String>() {
                    @Override
                    public String apply(ListAvailableServicesResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListAvailableServicesRequest.Builder>,
                        ListAvailableServicesRequest>() {
                    @Override
                    public ListAvailableServicesRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListAvailableServicesRequest.Builder>
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
                        ListAvailableServicesRequest, ListAvailableServicesResponse>() {
                    @Override
                    public ListAvailableServicesResponse apply(
                            ListAvailableServicesRequest request) {
                        return client.listAvailableServices(request);
                    }
                },
                new java.util.function.Function<
                        ListAvailableServicesResponse,
                        java.util.List<
                                com.oracle.bmc.marketplacepublisher.model
                                        .AvailableServiceSummary>>() {
                    @Override
                    public java.util.List<
                                    com.oracle.bmc.marketplacepublisher.model
                                            .AvailableServiceSummary>
                            apply(ListAvailableServicesResponse response) {
                        return response.getAvailableServiceCollection().getItems();
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
     * com.oracle.bmc.marketplacepublisher.model.CategorySummary} objects contained in responses
     * from the listCategories operation. This iterable will fetch more data from the server as
     * needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link
     *     com.oracle.bmc.marketplacepublisher.model.CategorySummary} objects contained in responses
     *     received from the service.
     */
    public Iterable<com.oracle.bmc.marketplacepublisher.model.CategorySummary>
            listCategoriesRecordIterator(final ListCategoriesRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListCategoriesRequest.Builder,
                ListCategoriesRequest,
                ListCategoriesResponse,
                com.oracle.bmc.marketplacepublisher.model.CategorySummary>(
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
                        java.util.List<
                                com.oracle.bmc.marketplacepublisher.model.CategorySummary>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.marketplacepublisher.model.CategorySummary>
                            apply(ListCategoriesResponse response) {
                        return response.getCategoryCollection().getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the
     * listCustomerInstanceReportRecords operation. This iterable will fetch more data from the
     * server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses
     *     received from the service.
     */
    public Iterable<ListCustomerInstanceReportRecordsResponse>
            listCustomerInstanceReportRecordsResponseIterator(
                    final ListCustomerInstanceReportRecordsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListCustomerInstanceReportRecordsRequest.Builder,
                ListCustomerInstanceReportRecordsRequest,
                ListCustomerInstanceReportRecordsResponse>(
                new java.util.function.Supplier<
                        ListCustomerInstanceReportRecordsRequest.Builder>() {
                    @Override
                    public ListCustomerInstanceReportRecordsRequest.Builder get() {
                        return ListCustomerInstanceReportRecordsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<
                        ListCustomerInstanceReportRecordsResponse, String>() {
                    @Override
                    public String apply(ListCustomerInstanceReportRecordsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListCustomerInstanceReportRecordsRequest.Builder>,
                        ListCustomerInstanceReportRecordsRequest>() {
                    @Override
                    public ListCustomerInstanceReportRecordsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListCustomerInstanceReportRecordsRequest.Builder>
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
                        ListCustomerInstanceReportRecordsRequest,
                        ListCustomerInstanceReportRecordsResponse>() {
                    @Override
                    public ListCustomerInstanceReportRecordsResponse apply(
                            ListCustomerInstanceReportRecordsRequest request) {
                        return client.listCustomerInstanceReportRecords(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link
     * com.oracle.bmc.marketplacepublisher.model.CustomerInstanceReportRecord} objects contained in
     * responses from the listCustomerInstanceReportRecords operation. This iterable will fetch more
     * data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link
     *     com.oracle.bmc.marketplacepublisher.model.CustomerInstanceReportRecord} objects contained
     *     in responses received from the service.
     */
    public Iterable<com.oracle.bmc.marketplacepublisher.model.CustomerInstanceReportRecord>
            listCustomerInstanceReportRecordsRecordIterator(
                    final ListCustomerInstanceReportRecordsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListCustomerInstanceReportRecordsRequest.Builder,
                ListCustomerInstanceReportRecordsRequest,
                ListCustomerInstanceReportRecordsResponse,
                com.oracle.bmc.marketplacepublisher.model.CustomerInstanceReportRecord>(
                new java.util.function.Supplier<
                        ListCustomerInstanceReportRecordsRequest.Builder>() {
                    @Override
                    public ListCustomerInstanceReportRecordsRequest.Builder get() {
                        return ListCustomerInstanceReportRecordsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<
                        ListCustomerInstanceReportRecordsResponse, String>() {
                    @Override
                    public String apply(ListCustomerInstanceReportRecordsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListCustomerInstanceReportRecordsRequest.Builder>,
                        ListCustomerInstanceReportRecordsRequest>() {
                    @Override
                    public ListCustomerInstanceReportRecordsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListCustomerInstanceReportRecordsRequest.Builder>
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
                        ListCustomerInstanceReportRecordsRequest,
                        ListCustomerInstanceReportRecordsResponse>() {
                    @Override
                    public ListCustomerInstanceReportRecordsResponse apply(
                            ListCustomerInstanceReportRecordsRequest request) {
                        return client.listCustomerInstanceReportRecords(request);
                    }
                },
                new java.util.function.Function<
                        ListCustomerInstanceReportRecordsResponse,
                        java.util.List<
                                com.oracle.bmc.marketplacepublisher.model
                                        .CustomerInstanceReportRecord>>() {
                    @Override
                    public java.util.List<
                                    com.oracle.bmc.marketplacepublisher.model
                                            .CustomerInstanceReportRecord>
                            apply(ListCustomerInstanceReportRecordsResponse response) {
                        return response.getCustomerInstanceReportRecordCollection().getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the
     * listDisbursementReportRecords operation. This iterable will fetch more data from the server
     * as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses
     *     received from the service.
     */
    public Iterable<ListDisbursementReportRecordsResponse>
            listDisbursementReportRecordsResponseIterator(
                    final ListDisbursementReportRecordsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListDisbursementReportRecordsRequest.Builder,
                ListDisbursementReportRecordsRequest,
                ListDisbursementReportRecordsResponse>(
                new java.util.function.Supplier<ListDisbursementReportRecordsRequest.Builder>() {
                    @Override
                    public ListDisbursementReportRecordsRequest.Builder get() {
                        return ListDisbursementReportRecordsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListDisbursementReportRecordsResponse, String>() {
                    @Override
                    public String apply(ListDisbursementReportRecordsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListDisbursementReportRecordsRequest.Builder>,
                        ListDisbursementReportRecordsRequest>() {
                    @Override
                    public ListDisbursementReportRecordsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListDisbursementReportRecordsRequest.Builder>
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
                        ListDisbursementReportRecordsRequest,
                        ListDisbursementReportRecordsResponse>() {
                    @Override
                    public ListDisbursementReportRecordsResponse apply(
                            ListDisbursementReportRecordsRequest request) {
                        return client.listDisbursementReportRecords(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link
     * com.oracle.bmc.marketplacepublisher.model.DisbursementReportRecord} objects contained in
     * responses from the listDisbursementReportRecords operation. This iterable will fetch more
     * data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link
     *     com.oracle.bmc.marketplacepublisher.model.DisbursementReportRecord} objects contained in
     *     responses received from the service.
     */
    public Iterable<com.oracle.bmc.marketplacepublisher.model.DisbursementReportRecord>
            listDisbursementReportRecordsRecordIterator(
                    final ListDisbursementReportRecordsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListDisbursementReportRecordsRequest.Builder,
                ListDisbursementReportRecordsRequest,
                ListDisbursementReportRecordsResponse,
                com.oracle.bmc.marketplacepublisher.model.DisbursementReportRecord>(
                new java.util.function.Supplier<ListDisbursementReportRecordsRequest.Builder>() {
                    @Override
                    public ListDisbursementReportRecordsRequest.Builder get() {
                        return ListDisbursementReportRecordsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListDisbursementReportRecordsResponse, String>() {
                    @Override
                    public String apply(ListDisbursementReportRecordsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListDisbursementReportRecordsRequest.Builder>,
                        ListDisbursementReportRecordsRequest>() {
                    @Override
                    public ListDisbursementReportRecordsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListDisbursementReportRecordsRequest.Builder>
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
                        ListDisbursementReportRecordsRequest,
                        ListDisbursementReportRecordsResponse>() {
                    @Override
                    public ListDisbursementReportRecordsResponse apply(
                            ListDisbursementReportRecordsRequest request) {
                        return client.listDisbursementReportRecords(request);
                    }
                },
                new java.util.function.Function<
                        ListDisbursementReportRecordsResponse,
                        java.util.List<
                                com.oracle.bmc.marketplacepublisher.model
                                        .DisbursementReportRecord>>() {
                    @Override
                    public java.util.List<
                                    com.oracle.bmc.marketplacepublisher.model
                                            .DisbursementReportRecord>
                            apply(ListDisbursementReportRecordsResponse response) {
                        return response.getDisbursementReportRecordCollection().getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the listLeads
     * operation. This iterable will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses
     *     received from the service.
     */
    public Iterable<ListLeadsResponse> listLeadsResponseIterator(final ListLeadsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListLeadsRequest.Builder, ListLeadsRequest, ListLeadsResponse>(
                new java.util.function.Supplier<ListLeadsRequest.Builder>() {
                    @Override
                    public ListLeadsRequest.Builder get() {
                        return ListLeadsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListLeadsResponse, String>() {
                    @Override
                    public String apply(ListLeadsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListLeadsRequest.Builder>,
                        ListLeadsRequest>() {
                    @Override
                    public ListLeadsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListLeadsRequest.Builder>
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
                new java.util.function.Function<ListLeadsRequest, ListLeadsResponse>() {
                    @Override
                    public ListLeadsResponse apply(ListLeadsRequest request) {
                        return client.listLeads(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link
     * com.oracle.bmc.marketplacepublisher.model.LeadSummary} objects contained in responses from
     * the listLeads operation. This iterable will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link
     *     com.oracle.bmc.marketplacepublisher.model.LeadSummary} objects contained in responses
     *     received from the service.
     */
    public Iterable<com.oracle.bmc.marketplacepublisher.model.LeadSummary> listLeadsRecordIterator(
            final ListLeadsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListLeadsRequest.Builder,
                ListLeadsRequest,
                ListLeadsResponse,
                com.oracle.bmc.marketplacepublisher.model.LeadSummary>(
                new java.util.function.Supplier<ListLeadsRequest.Builder>() {
                    @Override
                    public ListLeadsRequest.Builder get() {
                        return ListLeadsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListLeadsResponse, String>() {
                    @Override
                    public String apply(ListLeadsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListLeadsRequest.Builder>,
                        ListLeadsRequest>() {
                    @Override
                    public ListLeadsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListLeadsRequest.Builder>
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
                new java.util.function.Function<ListLeadsRequest, ListLeadsResponse>() {
                    @Override
                    public ListLeadsResponse apply(ListLeadsRequest request) {
                        return client.listLeads(request);
                    }
                },
                new java.util.function.Function<
                        ListLeadsResponse,
                        java.util.List<com.oracle.bmc.marketplacepublisher.model.LeadSummary>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.marketplacepublisher.model.LeadSummary>
                            apply(ListLeadsResponse response) {
                        return response.getLeadCollection().getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the
     * listListingRevisionAttachments operation. This iterable will fetch more data from the server
     * as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses
     *     received from the service.
     */
    public Iterable<ListListingRevisionAttachmentsResponse>
            listListingRevisionAttachmentsResponseIterator(
                    final ListListingRevisionAttachmentsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListListingRevisionAttachmentsRequest.Builder,
                ListListingRevisionAttachmentsRequest,
                ListListingRevisionAttachmentsResponse>(
                new java.util.function.Supplier<ListListingRevisionAttachmentsRequest.Builder>() {
                    @Override
                    public ListListingRevisionAttachmentsRequest.Builder get() {
                        return ListListingRevisionAttachmentsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListListingRevisionAttachmentsResponse, String>() {
                    @Override
                    public String apply(ListListingRevisionAttachmentsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListListingRevisionAttachmentsRequest.Builder>,
                        ListListingRevisionAttachmentsRequest>() {
                    @Override
                    public ListListingRevisionAttachmentsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListListingRevisionAttachmentsRequest.Builder>
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
                        ListListingRevisionAttachmentsRequest,
                        ListListingRevisionAttachmentsResponse>() {
                    @Override
                    public ListListingRevisionAttachmentsResponse apply(
                            ListListingRevisionAttachmentsRequest request) {
                        return client.listListingRevisionAttachments(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link
     * com.oracle.bmc.marketplacepublisher.model.ListingRevisionAttachmentSummary} objects contained
     * in responses from the listListingRevisionAttachments operation. This iterable will fetch more
     * data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link
     *     com.oracle.bmc.marketplacepublisher.model.ListingRevisionAttachmentSummary} objects
     *     contained in responses received from the service.
     */
    public Iterable<com.oracle.bmc.marketplacepublisher.model.ListingRevisionAttachmentSummary>
            listListingRevisionAttachmentsRecordIterator(
                    final ListListingRevisionAttachmentsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListListingRevisionAttachmentsRequest.Builder,
                ListListingRevisionAttachmentsRequest,
                ListListingRevisionAttachmentsResponse,
                com.oracle.bmc.marketplacepublisher.model.ListingRevisionAttachmentSummary>(
                new java.util.function.Supplier<ListListingRevisionAttachmentsRequest.Builder>() {
                    @Override
                    public ListListingRevisionAttachmentsRequest.Builder get() {
                        return ListListingRevisionAttachmentsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListListingRevisionAttachmentsResponse, String>() {
                    @Override
                    public String apply(ListListingRevisionAttachmentsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListListingRevisionAttachmentsRequest.Builder>,
                        ListListingRevisionAttachmentsRequest>() {
                    @Override
                    public ListListingRevisionAttachmentsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListListingRevisionAttachmentsRequest.Builder>
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
                        ListListingRevisionAttachmentsRequest,
                        ListListingRevisionAttachmentsResponse>() {
                    @Override
                    public ListListingRevisionAttachmentsResponse apply(
                            ListListingRevisionAttachmentsRequest request) {
                        return client.listListingRevisionAttachments(request);
                    }
                },
                new java.util.function.Function<
                        ListListingRevisionAttachmentsResponse,
                        java.util.List<
                                com.oracle.bmc.marketplacepublisher.model
                                        .ListingRevisionAttachmentSummary>>() {
                    @Override
                    public java.util.List<
                                    com.oracle.bmc.marketplacepublisher.model
                                            .ListingRevisionAttachmentSummary>
                            apply(ListListingRevisionAttachmentsResponse response) {
                        return response.getListingRevisionAttachmentCollection().getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the
     * listListingRevisionNotes operation. This iterable will fetch more data from the server as
     * needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses
     *     received from the service.
     */
    public Iterable<ListListingRevisionNotesResponse> listListingRevisionNotesResponseIterator(
            final ListListingRevisionNotesRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListListingRevisionNotesRequest.Builder,
                ListListingRevisionNotesRequest,
                ListListingRevisionNotesResponse>(
                new java.util.function.Supplier<ListListingRevisionNotesRequest.Builder>() {
                    @Override
                    public ListListingRevisionNotesRequest.Builder get() {
                        return ListListingRevisionNotesRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListListingRevisionNotesResponse, String>() {
                    @Override
                    public String apply(ListListingRevisionNotesResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListListingRevisionNotesRequest.Builder>,
                        ListListingRevisionNotesRequest>() {
                    @Override
                    public ListListingRevisionNotesRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListListingRevisionNotesRequest.Builder>
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
                        ListListingRevisionNotesRequest, ListListingRevisionNotesResponse>() {
                    @Override
                    public ListListingRevisionNotesResponse apply(
                            ListListingRevisionNotesRequest request) {
                        return client.listListingRevisionNotes(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link
     * com.oracle.bmc.marketplacepublisher.model.ListingRevisionNoteSummary} objects contained in
     * responses from the listListingRevisionNotes operation. This iterable will fetch more data
     * from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link
     *     com.oracle.bmc.marketplacepublisher.model.ListingRevisionNoteSummary} objects contained
     *     in responses received from the service.
     */
    public Iterable<com.oracle.bmc.marketplacepublisher.model.ListingRevisionNoteSummary>
            listListingRevisionNotesRecordIterator(final ListListingRevisionNotesRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListListingRevisionNotesRequest.Builder,
                ListListingRevisionNotesRequest,
                ListListingRevisionNotesResponse,
                com.oracle.bmc.marketplacepublisher.model.ListingRevisionNoteSummary>(
                new java.util.function.Supplier<ListListingRevisionNotesRequest.Builder>() {
                    @Override
                    public ListListingRevisionNotesRequest.Builder get() {
                        return ListListingRevisionNotesRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListListingRevisionNotesResponse, String>() {
                    @Override
                    public String apply(ListListingRevisionNotesResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListListingRevisionNotesRequest.Builder>,
                        ListListingRevisionNotesRequest>() {
                    @Override
                    public ListListingRevisionNotesRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListListingRevisionNotesRequest.Builder>
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
                        ListListingRevisionNotesRequest, ListListingRevisionNotesResponse>() {
                    @Override
                    public ListListingRevisionNotesResponse apply(
                            ListListingRevisionNotesRequest request) {
                        return client.listListingRevisionNotes(request);
                    }
                },
                new java.util.function.Function<
                        ListListingRevisionNotesResponse,
                        java.util.List<
                                com.oracle.bmc.marketplacepublisher.model
                                        .ListingRevisionNoteSummary>>() {
                    @Override
                    public java.util.List<
                                    com.oracle.bmc.marketplacepublisher.model
                                            .ListingRevisionNoteSummary>
                            apply(ListListingRevisionNotesResponse response) {
                        return response.getListingRevisionNoteCollection().getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the
     * listListingRevisionPackages operation. This iterable will fetch more data from the server as
     * needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses
     *     received from the service.
     */
    public Iterable<ListListingRevisionPackagesResponse>
            listListingRevisionPackagesResponseIterator(
                    final ListListingRevisionPackagesRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListListingRevisionPackagesRequest.Builder,
                ListListingRevisionPackagesRequest,
                ListListingRevisionPackagesResponse>(
                new java.util.function.Supplier<ListListingRevisionPackagesRequest.Builder>() {
                    @Override
                    public ListListingRevisionPackagesRequest.Builder get() {
                        return ListListingRevisionPackagesRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListListingRevisionPackagesResponse, String>() {
                    @Override
                    public String apply(ListListingRevisionPackagesResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListListingRevisionPackagesRequest.Builder>,
                        ListListingRevisionPackagesRequest>() {
                    @Override
                    public ListListingRevisionPackagesRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListListingRevisionPackagesRequest.Builder>
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
                        ListListingRevisionPackagesRequest, ListListingRevisionPackagesResponse>() {
                    @Override
                    public ListListingRevisionPackagesResponse apply(
                            ListListingRevisionPackagesRequest request) {
                        return client.listListingRevisionPackages(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link
     * com.oracle.bmc.marketplacepublisher.model.ListingRevisionPackageSummary} objects contained in
     * responses from the listListingRevisionPackages operation. This iterable will fetch more data
     * from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link
     *     com.oracle.bmc.marketplacepublisher.model.ListingRevisionPackageSummary} objects
     *     contained in responses received from the service.
     */
    public Iterable<com.oracle.bmc.marketplacepublisher.model.ListingRevisionPackageSummary>
            listListingRevisionPackagesRecordIterator(
                    final ListListingRevisionPackagesRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListListingRevisionPackagesRequest.Builder,
                ListListingRevisionPackagesRequest,
                ListListingRevisionPackagesResponse,
                com.oracle.bmc.marketplacepublisher.model.ListingRevisionPackageSummary>(
                new java.util.function.Supplier<ListListingRevisionPackagesRequest.Builder>() {
                    @Override
                    public ListListingRevisionPackagesRequest.Builder get() {
                        return ListListingRevisionPackagesRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListListingRevisionPackagesResponse, String>() {
                    @Override
                    public String apply(ListListingRevisionPackagesResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListListingRevisionPackagesRequest.Builder>,
                        ListListingRevisionPackagesRequest>() {
                    @Override
                    public ListListingRevisionPackagesRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListListingRevisionPackagesRequest.Builder>
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
                        ListListingRevisionPackagesRequest, ListListingRevisionPackagesResponse>() {
                    @Override
                    public ListListingRevisionPackagesResponse apply(
                            ListListingRevisionPackagesRequest request) {
                        return client.listListingRevisionPackages(request);
                    }
                },
                new java.util.function.Function<
                        ListListingRevisionPackagesResponse,
                        java.util.List<
                                com.oracle.bmc.marketplacepublisher.model
                                        .ListingRevisionPackageSummary>>() {
                    @Override
                    public java.util.List<
                                    com.oracle.bmc.marketplacepublisher.model
                                            .ListingRevisionPackageSummary>
                            apply(ListListingRevisionPackagesResponse response) {
                        return response.getListingRevisionPackageCollection().getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the
     * listListingRevisions operation. This iterable will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses
     *     received from the service.
     */
    public Iterable<ListListingRevisionsResponse> listListingRevisionsResponseIterator(
            final ListListingRevisionsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListListingRevisionsRequest.Builder,
                ListListingRevisionsRequest,
                ListListingRevisionsResponse>(
                new java.util.function.Supplier<ListListingRevisionsRequest.Builder>() {
                    @Override
                    public ListListingRevisionsRequest.Builder get() {
                        return ListListingRevisionsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListListingRevisionsResponse, String>() {
                    @Override
                    public String apply(ListListingRevisionsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListListingRevisionsRequest.Builder>,
                        ListListingRevisionsRequest>() {
                    @Override
                    public ListListingRevisionsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListListingRevisionsRequest.Builder>
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
                        ListListingRevisionsRequest, ListListingRevisionsResponse>() {
                    @Override
                    public ListListingRevisionsResponse apply(ListListingRevisionsRequest request) {
                        return client.listListingRevisions(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link
     * com.oracle.bmc.marketplacepublisher.model.ListingRevisionSummary} objects contained in
     * responses from the listListingRevisions operation. This iterable will fetch more data from
     * the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link
     *     com.oracle.bmc.marketplacepublisher.model.ListingRevisionSummary} objects contained in
     *     responses received from the service.
     */
    public Iterable<com.oracle.bmc.marketplacepublisher.model.ListingRevisionSummary>
            listListingRevisionsRecordIterator(final ListListingRevisionsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListListingRevisionsRequest.Builder,
                ListListingRevisionsRequest,
                ListListingRevisionsResponse,
                com.oracle.bmc.marketplacepublisher.model.ListingRevisionSummary>(
                new java.util.function.Supplier<ListListingRevisionsRequest.Builder>() {
                    @Override
                    public ListListingRevisionsRequest.Builder get() {
                        return ListListingRevisionsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListListingRevisionsResponse, String>() {
                    @Override
                    public String apply(ListListingRevisionsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListListingRevisionsRequest.Builder>,
                        ListListingRevisionsRequest>() {
                    @Override
                    public ListListingRevisionsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListListingRevisionsRequest.Builder>
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
                        ListListingRevisionsRequest, ListListingRevisionsResponse>() {
                    @Override
                    public ListListingRevisionsResponse apply(ListListingRevisionsRequest request) {
                        return client.listListingRevisions(request);
                    }
                },
                new java.util.function.Function<
                        ListListingRevisionsResponse,
                        java.util.List<
                                com.oracle.bmc.marketplacepublisher.model
                                        .ListingRevisionSummary>>() {
                    @Override
                    public java.util.List<
                                    com.oracle.bmc.marketplacepublisher.model
                                            .ListingRevisionSummary>
                            apply(ListListingRevisionsResponse response) {
                        return response.getListingRevisionCollection().getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the listListings
     * operation. This iterable will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses
     *     received from the service.
     */
    public Iterable<ListListingsResponse> listListingsResponseIterator(
            final ListListingsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListListingsRequest.Builder, ListListingsRequest, ListListingsResponse>(
                new java.util.function.Supplier<ListListingsRequest.Builder>() {
                    @Override
                    public ListListingsRequest.Builder get() {
                        return ListListingsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListListingsResponse, String>() {
                    @Override
                    public String apply(ListListingsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListListingsRequest.Builder>,
                        ListListingsRequest>() {
                    @Override
                    public ListListingsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListListingsRequest.Builder>
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
                new java.util.function.Function<ListListingsRequest, ListListingsResponse>() {
                    @Override
                    public ListListingsResponse apply(ListListingsRequest request) {
                        return client.listListings(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link
     * com.oracle.bmc.marketplacepublisher.model.ListingSummary} objects contained in responses from
     * the listListings operation. This iterable will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link
     *     com.oracle.bmc.marketplacepublisher.model.ListingSummary} objects contained in responses
     *     received from the service.
     */
    public Iterable<com.oracle.bmc.marketplacepublisher.model.ListingSummary>
            listListingsRecordIterator(final ListListingsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListListingsRequest.Builder,
                ListListingsRequest,
                ListListingsResponse,
                com.oracle.bmc.marketplacepublisher.model.ListingSummary>(
                new java.util.function.Supplier<ListListingsRequest.Builder>() {
                    @Override
                    public ListListingsRequest.Builder get() {
                        return ListListingsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListListingsResponse, String>() {
                    @Override
                    public String apply(ListListingsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListListingsRequest.Builder>,
                        ListListingsRequest>() {
                    @Override
                    public ListListingsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListListingsRequest.Builder>
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
                new java.util.function.Function<ListListingsRequest, ListListingsResponse>() {
                    @Override
                    public ListListingsResponse apply(ListListingsRequest request) {
                        return client.listListings(request);
                    }
                },
                new java.util.function.Function<
                        ListListingsResponse,
                        java.util.List<
                                com.oracle.bmc.marketplacepublisher.model.ListingSummary>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.marketplacepublisher.model.ListingSummary>
                            apply(ListListingsResponse response) {
                        return response.getListingCollection().getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the listMarkets
     * operation. This iterable will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses
     *     received from the service.
     */
    public Iterable<ListMarketsResponse> listMarketsResponseIterator(
            final ListMarketsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListMarketsRequest.Builder, ListMarketsRequest, ListMarketsResponse>(
                new java.util.function.Supplier<ListMarketsRequest.Builder>() {
                    @Override
                    public ListMarketsRequest.Builder get() {
                        return ListMarketsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListMarketsResponse, String>() {
                    @Override
                    public String apply(ListMarketsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListMarketsRequest.Builder>,
                        ListMarketsRequest>() {
                    @Override
                    public ListMarketsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListMarketsRequest.Builder>
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
                new java.util.function.Function<ListMarketsRequest, ListMarketsResponse>() {
                    @Override
                    public ListMarketsResponse apply(ListMarketsRequest request) {
                        return client.listMarkets(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link
     * com.oracle.bmc.marketplacepublisher.model.MarketSummary} objects contained in responses from
     * the listMarkets operation. This iterable will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link
     *     com.oracle.bmc.marketplacepublisher.model.MarketSummary} objects contained in responses
     *     received from the service.
     */
    public Iterable<com.oracle.bmc.marketplacepublisher.model.MarketSummary>
            listMarketsRecordIterator(final ListMarketsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListMarketsRequest.Builder,
                ListMarketsRequest,
                ListMarketsResponse,
                com.oracle.bmc.marketplacepublisher.model.MarketSummary>(
                new java.util.function.Supplier<ListMarketsRequest.Builder>() {
                    @Override
                    public ListMarketsRequest.Builder get() {
                        return ListMarketsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListMarketsResponse, String>() {
                    @Override
                    public String apply(ListMarketsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListMarketsRequest.Builder>,
                        ListMarketsRequest>() {
                    @Override
                    public ListMarketsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListMarketsRequest.Builder>
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
                new java.util.function.Function<ListMarketsRequest, ListMarketsResponse>() {
                    @Override
                    public ListMarketsResponse apply(ListMarketsRequest request) {
                        return client.listMarkets(request);
                    }
                },
                new java.util.function.Function<
                        ListMarketsResponse,
                        java.util.List<com.oracle.bmc.marketplacepublisher.model.MarketSummary>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.marketplacepublisher.model.MarketSummary>
                            apply(ListMarketsResponse response) {
                        return response.getMarketCollection().getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the listProducts
     * operation. This iterable will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses
     *     received from the service.
     */
    public Iterable<ListProductsResponse> listProductsResponseIterator(
            final ListProductsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListProductsRequest.Builder, ListProductsRequest, ListProductsResponse>(
                new java.util.function.Supplier<ListProductsRequest.Builder>() {
                    @Override
                    public ListProductsRequest.Builder get() {
                        return ListProductsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListProductsResponse, String>() {
                    @Override
                    public String apply(ListProductsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListProductsRequest.Builder>,
                        ListProductsRequest>() {
                    @Override
                    public ListProductsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListProductsRequest.Builder>
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
                new java.util.function.Function<ListProductsRequest, ListProductsResponse>() {
                    @Override
                    public ListProductsResponse apply(ListProductsRequest request) {
                        return client.listProducts(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link
     * com.oracle.bmc.marketplacepublisher.model.ProductSummary} objects contained in responses from
     * the listProducts operation. This iterable will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link
     *     com.oracle.bmc.marketplacepublisher.model.ProductSummary} objects contained in responses
     *     received from the service.
     */
    public Iterable<com.oracle.bmc.marketplacepublisher.model.ProductSummary>
            listProductsRecordIterator(final ListProductsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListProductsRequest.Builder,
                ListProductsRequest,
                ListProductsResponse,
                com.oracle.bmc.marketplacepublisher.model.ProductSummary>(
                new java.util.function.Supplier<ListProductsRequest.Builder>() {
                    @Override
                    public ListProductsRequest.Builder get() {
                        return ListProductsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListProductsResponse, String>() {
                    @Override
                    public String apply(ListProductsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListProductsRequest.Builder>,
                        ListProductsRequest>() {
                    @Override
                    public ListProductsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListProductsRequest.Builder>
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
                new java.util.function.Function<ListProductsRequest, ListProductsResponse>() {
                    @Override
                    public ListProductsResponse apply(ListProductsRequest request) {
                        return client.listProducts(request);
                    }
                },
                new java.util.function.Function<
                        ListProductsResponse,
                        java.util.List<
                                com.oracle.bmc.marketplacepublisher.model.ProductSummary>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.marketplacepublisher.model.ProductSummary>
                            apply(ListProductsResponse response) {
                        return response.getProductCollection().getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the listPublishers
     * operation. This iterable will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses
     *     received from the service.
     */
    public Iterable<ListPublishersResponse> listPublishersResponseIterator(
            final ListPublishersRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListPublishersRequest.Builder, ListPublishersRequest, ListPublishersResponse>(
                new java.util.function.Supplier<ListPublishersRequest.Builder>() {
                    @Override
                    public ListPublishersRequest.Builder get() {
                        return ListPublishersRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListPublishersResponse, String>() {
                    @Override
                    public String apply(ListPublishersResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListPublishersRequest.Builder>,
                        ListPublishersRequest>() {
                    @Override
                    public ListPublishersRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListPublishersRequest.Builder>
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
                new java.util.function.Function<ListPublishersRequest, ListPublishersResponse>() {
                    @Override
                    public ListPublishersResponse apply(ListPublishersRequest request) {
                        return client.listPublishers(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link
     * com.oracle.bmc.marketplacepublisher.model.PublisherSummary} objects contained in responses
     * from the listPublishers operation. This iterable will fetch more data from the server as
     * needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link
     *     com.oracle.bmc.marketplacepublisher.model.PublisherSummary} objects contained in
     *     responses received from the service.
     */
    public Iterable<com.oracle.bmc.marketplacepublisher.model.PublisherSummary>
            listPublishersRecordIterator(final ListPublishersRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListPublishersRequest.Builder,
                ListPublishersRequest,
                ListPublishersResponse,
                com.oracle.bmc.marketplacepublisher.model.PublisherSummary>(
                new java.util.function.Supplier<ListPublishersRequest.Builder>() {
                    @Override
                    public ListPublishersRequest.Builder get() {
                        return ListPublishersRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListPublishersResponse, String>() {
                    @Override
                    public String apply(ListPublishersResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListPublishersRequest.Builder>,
                        ListPublishersRequest>() {
                    @Override
                    public ListPublishersRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListPublishersRequest.Builder>
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
                new java.util.function.Function<ListPublishersRequest, ListPublishersResponse>() {
                    @Override
                    public ListPublishersResponse apply(ListPublishersRequest request) {
                        return client.listPublishers(request);
                    }
                },
                new java.util.function.Function<
                        ListPublishersResponse,
                        java.util.List<
                                com.oracle.bmc.marketplacepublisher.model.PublisherSummary>>() {
                    @Override
                    public java.util.List<
                                    com.oracle.bmc.marketplacepublisher.model.PublisherSummary>
                            apply(ListPublishersResponse response) {
                        return response.getPublisherCollection().getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the
     * listSupportDocs operation. This iterable will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses
     *     received from the service.
     */
    public Iterable<ListSupportDocsResponse> listSupportDocsResponseIterator(
            final ListSupportDocsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListSupportDocsRequest.Builder, ListSupportDocsRequest, ListSupportDocsResponse>(
                new java.util.function.Supplier<ListSupportDocsRequest.Builder>() {
                    @Override
                    public ListSupportDocsRequest.Builder get() {
                        return ListSupportDocsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListSupportDocsResponse, String>() {
                    @Override
                    public String apply(ListSupportDocsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListSupportDocsRequest.Builder>,
                        ListSupportDocsRequest>() {
                    @Override
                    public ListSupportDocsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListSupportDocsRequest.Builder>
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
                new java.util.function.Function<ListSupportDocsRequest, ListSupportDocsResponse>() {
                    @Override
                    public ListSupportDocsResponse apply(ListSupportDocsRequest request) {
                        return client.listSupportDocs(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link
     * com.oracle.bmc.marketplacepublisher.model.SupportDocSummary} objects contained in responses
     * from the listSupportDocs operation. This iterable will fetch more data from the server as
     * needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link
     *     com.oracle.bmc.marketplacepublisher.model.SupportDocSummary} objects contained in
     *     responses received from the service.
     */
    public Iterable<com.oracle.bmc.marketplacepublisher.model.SupportDocSummary>
            listSupportDocsRecordIterator(final ListSupportDocsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListSupportDocsRequest.Builder,
                ListSupportDocsRequest,
                ListSupportDocsResponse,
                com.oracle.bmc.marketplacepublisher.model.SupportDocSummary>(
                new java.util.function.Supplier<ListSupportDocsRequest.Builder>() {
                    @Override
                    public ListSupportDocsRequest.Builder get() {
                        return ListSupportDocsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListSupportDocsResponse, String>() {
                    @Override
                    public String apply(ListSupportDocsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListSupportDocsRequest.Builder>,
                        ListSupportDocsRequest>() {
                    @Override
                    public ListSupportDocsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListSupportDocsRequest.Builder>
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
                new java.util.function.Function<ListSupportDocsRequest, ListSupportDocsResponse>() {
                    @Override
                    public ListSupportDocsResponse apply(ListSupportDocsRequest request) {
                        return client.listSupportDocs(request);
                    }
                },
                new java.util.function.Function<
                        ListSupportDocsResponse,
                        java.util.List<
                                com.oracle.bmc.marketplacepublisher.model.SupportDocSummary>>() {
                    @Override
                    public java.util.List<
                                    com.oracle.bmc.marketplacepublisher.model.SupportDocSummary>
                            apply(ListSupportDocsResponse response) {
                        return response.getSupportDocCollection().getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the
     * listSupportedCurrencies operation. This iterable will fetch more data from the server as
     * needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses
     *     received from the service.
     */
    public Iterable<ListSupportedCurrenciesResponse> listSupportedCurrenciesResponseIterator(
            final ListSupportedCurrenciesRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListSupportedCurrenciesRequest.Builder,
                ListSupportedCurrenciesRequest,
                ListSupportedCurrenciesResponse>(
                new java.util.function.Supplier<ListSupportedCurrenciesRequest.Builder>() {
                    @Override
                    public ListSupportedCurrenciesRequest.Builder get() {
                        return ListSupportedCurrenciesRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListSupportedCurrenciesResponse, String>() {
                    @Override
                    public String apply(ListSupportedCurrenciesResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListSupportedCurrenciesRequest.Builder>,
                        ListSupportedCurrenciesRequest>() {
                    @Override
                    public ListSupportedCurrenciesRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListSupportedCurrenciesRequest.Builder>
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
                        ListSupportedCurrenciesRequest, ListSupportedCurrenciesResponse>() {
                    @Override
                    public ListSupportedCurrenciesResponse apply(
                            ListSupportedCurrenciesRequest request) {
                        return client.listSupportedCurrencies(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link
     * com.oracle.bmc.marketplacepublisher.model.SupportedCurrencySummary} objects contained in
     * responses from the listSupportedCurrencies operation. This iterable will fetch more data from
     * the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link
     *     com.oracle.bmc.marketplacepublisher.model.SupportedCurrencySummary} objects contained in
     *     responses received from the service.
     */
    public Iterable<com.oracle.bmc.marketplacepublisher.model.SupportedCurrencySummary>
            listSupportedCurrenciesRecordIterator(final ListSupportedCurrenciesRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListSupportedCurrenciesRequest.Builder,
                ListSupportedCurrenciesRequest,
                ListSupportedCurrenciesResponse,
                com.oracle.bmc.marketplacepublisher.model.SupportedCurrencySummary>(
                new java.util.function.Supplier<ListSupportedCurrenciesRequest.Builder>() {
                    @Override
                    public ListSupportedCurrenciesRequest.Builder get() {
                        return ListSupportedCurrenciesRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListSupportedCurrenciesResponse, String>() {
                    @Override
                    public String apply(ListSupportedCurrenciesResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListSupportedCurrenciesRequest.Builder>,
                        ListSupportedCurrenciesRequest>() {
                    @Override
                    public ListSupportedCurrenciesRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListSupportedCurrenciesRequest.Builder>
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
                        ListSupportedCurrenciesRequest, ListSupportedCurrenciesResponse>() {
                    @Override
                    public ListSupportedCurrenciesResponse apply(
                            ListSupportedCurrenciesRequest request) {
                        return client.listSupportedCurrencies(request);
                    }
                },
                new java.util.function.Function<
                        ListSupportedCurrenciesResponse,
                        java.util.List<
                                com.oracle.bmc.marketplacepublisher.model
                                        .SupportedCurrencySummary>>() {
                    @Override
                    public java.util.List<
                                    com.oracle.bmc.marketplacepublisher.model
                                            .SupportedCurrencySummary>
                            apply(ListSupportedCurrenciesResponse response) {
                        return response.getSupportedCurrencyCollection().getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the
     * listSupportedShapes operation. This iterable will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses
     *     received from the service.
     */
    public Iterable<ListSupportedShapesResponse> listSupportedShapesResponseIterator(
            final ListSupportedShapesRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListSupportedShapesRequest.Builder,
                ListSupportedShapesRequest,
                ListSupportedShapesResponse>(
                new java.util.function.Supplier<ListSupportedShapesRequest.Builder>() {
                    @Override
                    public ListSupportedShapesRequest.Builder get() {
                        return ListSupportedShapesRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListSupportedShapesResponse, String>() {
                    @Override
                    public String apply(ListSupportedShapesResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListSupportedShapesRequest.Builder>,
                        ListSupportedShapesRequest>() {
                    @Override
                    public ListSupportedShapesRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListSupportedShapesRequest.Builder>
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
                        ListSupportedShapesRequest, ListSupportedShapesResponse>() {
                    @Override
                    public ListSupportedShapesResponse apply(ListSupportedShapesRequest request) {
                        return client.listSupportedShapes(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link
     * com.oracle.bmc.marketplacepublisher.model.SupportedShapeSummary} objects contained in
     * responses from the listSupportedShapes operation. This iterable will fetch more data from the
     * server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link
     *     com.oracle.bmc.marketplacepublisher.model.SupportedShapeSummary} objects contained in
     *     responses received from the service.
     */
    public Iterable<com.oracle.bmc.marketplacepublisher.model.SupportedShapeSummary>
            listSupportedShapesRecordIterator(final ListSupportedShapesRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListSupportedShapesRequest.Builder,
                ListSupportedShapesRequest,
                ListSupportedShapesResponse,
                com.oracle.bmc.marketplacepublisher.model.SupportedShapeSummary>(
                new java.util.function.Supplier<ListSupportedShapesRequest.Builder>() {
                    @Override
                    public ListSupportedShapesRequest.Builder get() {
                        return ListSupportedShapesRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListSupportedShapesResponse, String>() {
                    @Override
                    public String apply(ListSupportedShapesResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListSupportedShapesRequest.Builder>,
                        ListSupportedShapesRequest>() {
                    @Override
                    public ListSupportedShapesRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListSupportedShapesRequest.Builder>
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
                        ListSupportedShapesRequest, ListSupportedShapesResponse>() {
                    @Override
                    public ListSupportedShapesResponse apply(ListSupportedShapesRequest request) {
                        return client.listSupportedShapes(request);
                    }
                },
                new java.util.function.Function<
                        ListSupportedShapesResponse,
                        java.util.List<
                                com.oracle.bmc.marketplacepublisher.model
                                        .SupportedShapeSummary>>() {
                    @Override
                    public java.util.List<
                                    com.oracle.bmc.marketplacepublisher.model.SupportedShapeSummary>
                            apply(ListSupportedShapesResponse response) {
                        return response.getSupportedShapeCollection().getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the
     * listTermVersions operation. This iterable will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses
     *     received from the service.
     */
    public Iterable<ListTermVersionsResponse> listTermVersionsResponseIterator(
            final ListTermVersionsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListTermVersionsRequest.Builder, ListTermVersionsRequest, ListTermVersionsResponse>(
                new java.util.function.Supplier<ListTermVersionsRequest.Builder>() {
                    @Override
                    public ListTermVersionsRequest.Builder get() {
                        return ListTermVersionsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListTermVersionsResponse, String>() {
                    @Override
                    public String apply(ListTermVersionsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListTermVersionsRequest.Builder>,
                        ListTermVersionsRequest>() {
                    @Override
                    public ListTermVersionsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListTermVersionsRequest.Builder>
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
                        ListTermVersionsRequest, ListTermVersionsResponse>() {
                    @Override
                    public ListTermVersionsResponse apply(ListTermVersionsRequest request) {
                        return client.listTermVersions(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link
     * com.oracle.bmc.marketplacepublisher.model.TermVersionSummary} objects contained in responses
     * from the listTermVersions operation. This iterable will fetch more data from the server as
     * needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link
     *     com.oracle.bmc.marketplacepublisher.model.TermVersionSummary} objects contained in
     *     responses received from the service.
     */
    public Iterable<com.oracle.bmc.marketplacepublisher.model.TermVersionSummary>
            listTermVersionsRecordIterator(final ListTermVersionsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListTermVersionsRequest.Builder,
                ListTermVersionsRequest,
                ListTermVersionsResponse,
                com.oracle.bmc.marketplacepublisher.model.TermVersionSummary>(
                new java.util.function.Supplier<ListTermVersionsRequest.Builder>() {
                    @Override
                    public ListTermVersionsRequest.Builder get() {
                        return ListTermVersionsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListTermVersionsResponse, String>() {
                    @Override
                    public String apply(ListTermVersionsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListTermVersionsRequest.Builder>,
                        ListTermVersionsRequest>() {
                    @Override
                    public ListTermVersionsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListTermVersionsRequest.Builder>
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
                        ListTermVersionsRequest, ListTermVersionsResponse>() {
                    @Override
                    public ListTermVersionsResponse apply(ListTermVersionsRequest request) {
                        return client.listTermVersions(request);
                    }
                },
                new java.util.function.Function<
                        ListTermVersionsResponse,
                        java.util.List<
                                com.oracle.bmc.marketplacepublisher.model.TermVersionSummary>>() {
                    @Override
                    public java.util.List<
                                    com.oracle.bmc.marketplacepublisher.model.TermVersionSummary>
                            apply(ListTermVersionsResponse response) {
                        return response.getTermVersionCollection().getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the listTerms
     * operation. This iterable will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses
     *     received from the service.
     */
    public Iterable<ListTermsResponse> listTermsResponseIterator(final ListTermsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListTermsRequest.Builder, ListTermsRequest, ListTermsResponse>(
                new java.util.function.Supplier<ListTermsRequest.Builder>() {
                    @Override
                    public ListTermsRequest.Builder get() {
                        return ListTermsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListTermsResponse, String>() {
                    @Override
                    public String apply(ListTermsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListTermsRequest.Builder>,
                        ListTermsRequest>() {
                    @Override
                    public ListTermsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListTermsRequest.Builder>
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
                new java.util.function.Function<ListTermsRequest, ListTermsResponse>() {
                    @Override
                    public ListTermsResponse apply(ListTermsRequest request) {
                        return client.listTerms(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link
     * com.oracle.bmc.marketplacepublisher.model.TermSummary} objects contained in responses from
     * the listTerms operation. This iterable will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link
     *     com.oracle.bmc.marketplacepublisher.model.TermSummary} objects contained in responses
     *     received from the service.
     */
    public Iterable<com.oracle.bmc.marketplacepublisher.model.TermSummary> listTermsRecordIterator(
            final ListTermsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListTermsRequest.Builder,
                ListTermsRequest,
                ListTermsResponse,
                com.oracle.bmc.marketplacepublisher.model.TermSummary>(
                new java.util.function.Supplier<ListTermsRequest.Builder>() {
                    @Override
                    public ListTermsRequest.Builder get() {
                        return ListTermsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListTermsResponse, String>() {
                    @Override
                    public String apply(ListTermsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListTermsRequest.Builder>,
                        ListTermsRequest>() {
                    @Override
                    public ListTermsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListTermsRequest.Builder>
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
                new java.util.function.Function<ListTermsRequest, ListTermsResponse>() {
                    @Override
                    public ListTermsResponse apply(ListTermsRequest request) {
                        return client.listTerms(request);
                    }
                },
                new java.util.function.Function<
                        ListTermsResponse,
                        java.util.List<com.oracle.bmc.marketplacepublisher.model.TermSummary>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.marketplacepublisher.model.TermSummary>
                            apply(ListTermsResponse response) {
                        return response.getTermCollection().getItems();
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
     * com.oracle.bmc.marketplacepublisher.model.WorkRequestError} objects contained in responses
     * from the listWorkRequestErrors operation. This iterable will fetch more data from the server
     * as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link
     *     com.oracle.bmc.marketplacepublisher.model.WorkRequestError} objects contained in
     *     responses received from the service.
     */
    public Iterable<com.oracle.bmc.marketplacepublisher.model.WorkRequestError>
            listWorkRequestErrorsRecordIterator(final ListWorkRequestErrorsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListWorkRequestErrorsRequest.Builder,
                ListWorkRequestErrorsRequest,
                ListWorkRequestErrorsResponse,
                com.oracle.bmc.marketplacepublisher.model.WorkRequestError>(
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
                                com.oracle.bmc.marketplacepublisher.model.WorkRequestError>>() {
                    @Override
                    public java.util.List<
                                    com.oracle.bmc.marketplacepublisher.model.WorkRequestError>
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
     * com.oracle.bmc.marketplacepublisher.model.WorkRequestLogEntry} objects contained in responses
     * from the listWorkRequestLogs operation. This iterable will fetch more data from the server as
     * needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link
     *     com.oracle.bmc.marketplacepublisher.model.WorkRequestLogEntry} objects contained in
     *     responses received from the service.
     */
    public Iterable<com.oracle.bmc.marketplacepublisher.model.WorkRequestLogEntry>
            listWorkRequestLogsRecordIterator(final ListWorkRequestLogsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListWorkRequestLogsRequest.Builder,
                ListWorkRequestLogsRequest,
                ListWorkRequestLogsResponse,
                com.oracle.bmc.marketplacepublisher.model.WorkRequestLogEntry>(
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
                                com.oracle.bmc.marketplacepublisher.model.WorkRequestLogEntry>>() {
                    @Override
                    public java.util.List<
                                    com.oracle.bmc.marketplacepublisher.model.WorkRequestLogEntry>
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
     * com.oracle.bmc.marketplacepublisher.model.WorkRequestSummary} objects contained in responses
     * from the listWorkRequests operation. This iterable will fetch more data from the server as
     * needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link
     *     com.oracle.bmc.marketplacepublisher.model.WorkRequestSummary} objects contained in
     *     responses received from the service.
     */
    public Iterable<com.oracle.bmc.marketplacepublisher.model.WorkRequestSummary>
            listWorkRequestsRecordIterator(final ListWorkRequestsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListWorkRequestsRequest.Builder,
                ListWorkRequestsRequest,
                ListWorkRequestsResponse,
                com.oracle.bmc.marketplacepublisher.model.WorkRequestSummary>(
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
                                com.oracle.bmc.marketplacepublisher.model.WorkRequestSummary>>() {
                    @Override
                    public java.util.List<
                                    com.oracle.bmc.marketplacepublisher.model.WorkRequestSummary>
                            apply(ListWorkRequestsResponse response) {
                        return response.getWorkRequestSummaryCollection().getItems();
                    }
                });
    }
}

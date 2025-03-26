/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.core;

import com.oracle.bmc.core.requests.*;
import com.oracle.bmc.core.responses.*;

/**
 * Collection of helper methods that can be used to provide an {@link java.lang.Iterable} interface
 * to any list operations of Compute where multiple pages of data may be fetched.
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
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
public class ComputePaginators {
    private final Compute client;

    public ComputePaginators(Compute client) {
        this.client = client;
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the listAppCatalogListingResourceVersions operation. This iterable
     * will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses received from the service.
     */
    public Iterable<ListAppCatalogListingResourceVersionsResponse>
            listAppCatalogListingResourceVersionsResponseIterator(
                    final ListAppCatalogListingResourceVersionsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListAppCatalogListingResourceVersionsRequest.Builder,
                ListAppCatalogListingResourceVersionsRequest,
                ListAppCatalogListingResourceVersionsResponse>(
                new java.util.function.Supplier<
                        ListAppCatalogListingResourceVersionsRequest.Builder>() {
                    @Override
                    public ListAppCatalogListingResourceVersionsRequest.Builder get() {
                        return ListAppCatalogListingResourceVersionsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<
                        ListAppCatalogListingResourceVersionsResponse, String>() {
                    @Override
                    public String apply(ListAppCatalogListingResourceVersionsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListAppCatalogListingResourceVersionsRequest.Builder>,
                        ListAppCatalogListingResourceVersionsRequest>() {
                    @Override
                    public ListAppCatalogListingResourceVersionsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListAppCatalogListingResourceVersionsRequest.Builder>
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
                        ListAppCatalogListingResourceVersionsRequest,
                        ListAppCatalogListingResourceVersionsResponse>() {
                    @Override
                    public ListAppCatalogListingResourceVersionsResponse apply(
                            ListAppCatalogListingResourceVersionsRequest request) {
                        return client.listAppCatalogListingResourceVersions(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link com.oracle.bmc.core.model.AppCatalogListingResourceVersionSummary} objects
     * contained in responses from the listAppCatalogListingResourceVersions operation. This iterable will fetch more data from the
     * server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link com.oracle.bmc.core.model.AppCatalogListingResourceVersionSummary} objects
     * contained in responses received from the service.
     */
    public Iterable<com.oracle.bmc.core.model.AppCatalogListingResourceVersionSummary>
            listAppCatalogListingResourceVersionsRecordIterator(
                    final ListAppCatalogListingResourceVersionsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListAppCatalogListingResourceVersionsRequest.Builder,
                ListAppCatalogListingResourceVersionsRequest,
                ListAppCatalogListingResourceVersionsResponse,
                com.oracle.bmc.core.model.AppCatalogListingResourceVersionSummary>(
                new java.util.function.Supplier<
                        ListAppCatalogListingResourceVersionsRequest.Builder>() {
                    @Override
                    public ListAppCatalogListingResourceVersionsRequest.Builder get() {
                        return ListAppCatalogListingResourceVersionsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<
                        ListAppCatalogListingResourceVersionsResponse, String>() {
                    @Override
                    public String apply(ListAppCatalogListingResourceVersionsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListAppCatalogListingResourceVersionsRequest.Builder>,
                        ListAppCatalogListingResourceVersionsRequest>() {
                    @Override
                    public ListAppCatalogListingResourceVersionsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListAppCatalogListingResourceVersionsRequest.Builder>
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
                        ListAppCatalogListingResourceVersionsRequest,
                        ListAppCatalogListingResourceVersionsResponse>() {
                    @Override
                    public ListAppCatalogListingResourceVersionsResponse apply(
                            ListAppCatalogListingResourceVersionsRequest request) {
                        return client.listAppCatalogListingResourceVersions(request);
                    }
                },
                new java.util.function.Function<
                        ListAppCatalogListingResourceVersionsResponse,
                        java.util.List<
                                com.oracle.bmc.core.model
                                        .AppCatalogListingResourceVersionSummary>>() {
                    @Override
                    public java.util.List<
                                    com.oracle.bmc.core.model
                                            .AppCatalogListingResourceVersionSummary>
                            apply(ListAppCatalogListingResourceVersionsResponse response) {
                        return response.getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the listAppCatalogListings operation. This iterable
     * will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses received from the service.
     */
    public Iterable<ListAppCatalogListingsResponse> listAppCatalogListingsResponseIterator(
            final ListAppCatalogListingsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListAppCatalogListingsRequest.Builder, ListAppCatalogListingsRequest,
                ListAppCatalogListingsResponse>(
                new java.util.function.Supplier<ListAppCatalogListingsRequest.Builder>() {
                    @Override
                    public ListAppCatalogListingsRequest.Builder get() {
                        return ListAppCatalogListingsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListAppCatalogListingsResponse, String>() {
                    @Override
                    public String apply(ListAppCatalogListingsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListAppCatalogListingsRequest.Builder>,
                        ListAppCatalogListingsRequest>() {
                    @Override
                    public ListAppCatalogListingsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListAppCatalogListingsRequest.Builder>
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
                        ListAppCatalogListingsRequest, ListAppCatalogListingsResponse>() {
                    @Override
                    public ListAppCatalogListingsResponse apply(
                            ListAppCatalogListingsRequest request) {
                        return client.listAppCatalogListings(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link com.oracle.bmc.core.model.AppCatalogListingSummary} objects
     * contained in responses from the listAppCatalogListings operation. This iterable will fetch more data from the
     * server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link com.oracle.bmc.core.model.AppCatalogListingSummary} objects
     * contained in responses received from the service.
     */
    public Iterable<com.oracle.bmc.core.model.AppCatalogListingSummary>
            listAppCatalogListingsRecordIterator(final ListAppCatalogListingsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListAppCatalogListingsRequest.Builder, ListAppCatalogListingsRequest,
                ListAppCatalogListingsResponse, com.oracle.bmc.core.model.AppCatalogListingSummary>(
                new java.util.function.Supplier<ListAppCatalogListingsRequest.Builder>() {
                    @Override
                    public ListAppCatalogListingsRequest.Builder get() {
                        return ListAppCatalogListingsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListAppCatalogListingsResponse, String>() {
                    @Override
                    public String apply(ListAppCatalogListingsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListAppCatalogListingsRequest.Builder>,
                        ListAppCatalogListingsRequest>() {
                    @Override
                    public ListAppCatalogListingsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListAppCatalogListingsRequest.Builder>
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
                        ListAppCatalogListingsRequest, ListAppCatalogListingsResponse>() {
                    @Override
                    public ListAppCatalogListingsResponse apply(
                            ListAppCatalogListingsRequest request) {
                        return client.listAppCatalogListings(request);
                    }
                },
                new java.util.function.Function<
                        ListAppCatalogListingsResponse,
                        java.util.List<com.oracle.bmc.core.model.AppCatalogListingSummary>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.core.model.AppCatalogListingSummary> apply(
                            ListAppCatalogListingsResponse response) {
                        return response.getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the listAppCatalogSubscriptions operation. This iterable
     * will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses received from the service.
     */
    public Iterable<ListAppCatalogSubscriptionsResponse>
            listAppCatalogSubscriptionsResponseIterator(
                    final ListAppCatalogSubscriptionsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListAppCatalogSubscriptionsRequest.Builder, ListAppCatalogSubscriptionsRequest,
                ListAppCatalogSubscriptionsResponse>(
                new java.util.function.Supplier<ListAppCatalogSubscriptionsRequest.Builder>() {
                    @Override
                    public ListAppCatalogSubscriptionsRequest.Builder get() {
                        return ListAppCatalogSubscriptionsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListAppCatalogSubscriptionsResponse, String>() {
                    @Override
                    public String apply(ListAppCatalogSubscriptionsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListAppCatalogSubscriptionsRequest.Builder>,
                        ListAppCatalogSubscriptionsRequest>() {
                    @Override
                    public ListAppCatalogSubscriptionsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListAppCatalogSubscriptionsRequest.Builder>
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
                        ListAppCatalogSubscriptionsRequest, ListAppCatalogSubscriptionsResponse>() {
                    @Override
                    public ListAppCatalogSubscriptionsResponse apply(
                            ListAppCatalogSubscriptionsRequest request) {
                        return client.listAppCatalogSubscriptions(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link com.oracle.bmc.core.model.AppCatalogSubscriptionSummary} objects
     * contained in responses from the listAppCatalogSubscriptions operation. This iterable will fetch more data from the
     * server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link com.oracle.bmc.core.model.AppCatalogSubscriptionSummary} objects
     * contained in responses received from the service.
     */
    public Iterable<com.oracle.bmc.core.model.AppCatalogSubscriptionSummary>
            listAppCatalogSubscriptionsRecordIterator(
                    final ListAppCatalogSubscriptionsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListAppCatalogSubscriptionsRequest.Builder, ListAppCatalogSubscriptionsRequest,
                ListAppCatalogSubscriptionsResponse,
                com.oracle.bmc.core.model.AppCatalogSubscriptionSummary>(
                new java.util.function.Supplier<ListAppCatalogSubscriptionsRequest.Builder>() {
                    @Override
                    public ListAppCatalogSubscriptionsRequest.Builder get() {
                        return ListAppCatalogSubscriptionsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListAppCatalogSubscriptionsResponse, String>() {
                    @Override
                    public String apply(ListAppCatalogSubscriptionsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListAppCatalogSubscriptionsRequest.Builder>,
                        ListAppCatalogSubscriptionsRequest>() {
                    @Override
                    public ListAppCatalogSubscriptionsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListAppCatalogSubscriptionsRequest.Builder>
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
                        ListAppCatalogSubscriptionsRequest, ListAppCatalogSubscriptionsResponse>() {
                    @Override
                    public ListAppCatalogSubscriptionsResponse apply(
                            ListAppCatalogSubscriptionsRequest request) {
                        return client.listAppCatalogSubscriptions(request);
                    }
                },
                new java.util.function.Function<
                        ListAppCatalogSubscriptionsResponse,
                        java.util.List<com.oracle.bmc.core.model.AppCatalogSubscriptionSummary>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.core.model.AppCatalogSubscriptionSummary>
                            apply(ListAppCatalogSubscriptionsResponse response) {
                        return response.getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the listBootVolumeAttachments operation. This iterable
     * will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses received from the service.
     */
    public Iterable<ListBootVolumeAttachmentsResponse> listBootVolumeAttachmentsResponseIterator(
            final ListBootVolumeAttachmentsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListBootVolumeAttachmentsRequest.Builder, ListBootVolumeAttachmentsRequest,
                ListBootVolumeAttachmentsResponse>(
                new java.util.function.Supplier<ListBootVolumeAttachmentsRequest.Builder>() {
                    @Override
                    public ListBootVolumeAttachmentsRequest.Builder get() {
                        return ListBootVolumeAttachmentsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListBootVolumeAttachmentsResponse, String>() {
                    @Override
                    public String apply(ListBootVolumeAttachmentsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListBootVolumeAttachmentsRequest.Builder>,
                        ListBootVolumeAttachmentsRequest>() {
                    @Override
                    public ListBootVolumeAttachmentsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListBootVolumeAttachmentsRequest.Builder>
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
                        ListBootVolumeAttachmentsRequest, ListBootVolumeAttachmentsResponse>() {
                    @Override
                    public ListBootVolumeAttachmentsResponse apply(
                            ListBootVolumeAttachmentsRequest request) {
                        return client.listBootVolumeAttachments(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link com.oracle.bmc.core.model.BootVolumeAttachment} objects
     * contained in responses from the listBootVolumeAttachments operation. This iterable will fetch more data from the
     * server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link com.oracle.bmc.core.model.BootVolumeAttachment} objects
     * contained in responses received from the service.
     */
    public Iterable<com.oracle.bmc.core.model.BootVolumeAttachment>
            listBootVolumeAttachmentsRecordIterator(
                    final ListBootVolumeAttachmentsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListBootVolumeAttachmentsRequest.Builder, ListBootVolumeAttachmentsRequest,
                ListBootVolumeAttachmentsResponse, com.oracle.bmc.core.model.BootVolumeAttachment>(
                new java.util.function.Supplier<ListBootVolumeAttachmentsRequest.Builder>() {
                    @Override
                    public ListBootVolumeAttachmentsRequest.Builder get() {
                        return ListBootVolumeAttachmentsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListBootVolumeAttachmentsResponse, String>() {
                    @Override
                    public String apply(ListBootVolumeAttachmentsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListBootVolumeAttachmentsRequest.Builder>,
                        ListBootVolumeAttachmentsRequest>() {
                    @Override
                    public ListBootVolumeAttachmentsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListBootVolumeAttachmentsRequest.Builder>
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
                        ListBootVolumeAttachmentsRequest, ListBootVolumeAttachmentsResponse>() {
                    @Override
                    public ListBootVolumeAttachmentsResponse apply(
                            ListBootVolumeAttachmentsRequest request) {
                        return client.listBootVolumeAttachments(request);
                    }
                },
                new java.util.function.Function<
                        ListBootVolumeAttachmentsResponse,
                        java.util.List<com.oracle.bmc.core.model.BootVolumeAttachment>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.core.model.BootVolumeAttachment> apply(
                            ListBootVolumeAttachmentsResponse response) {
                        return response.getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the listComputeCapacityReservationInstanceShapes operation. This iterable
     * will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses received from the service.
     */
    public Iterable<ListComputeCapacityReservationInstanceShapesResponse>
            listComputeCapacityReservationInstanceShapesResponseIterator(
                    final ListComputeCapacityReservationInstanceShapesRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListComputeCapacityReservationInstanceShapesRequest.Builder,
                ListComputeCapacityReservationInstanceShapesRequest,
                ListComputeCapacityReservationInstanceShapesResponse>(
                new java.util.function.Supplier<
                        ListComputeCapacityReservationInstanceShapesRequest.Builder>() {
                    @Override
                    public ListComputeCapacityReservationInstanceShapesRequest.Builder get() {
                        return ListComputeCapacityReservationInstanceShapesRequest.builder()
                                .copy(request);
                    }
                },
                new java.util.function.Function<
                        ListComputeCapacityReservationInstanceShapesResponse, String>() {
                    @Override
                    public String apply(
                            ListComputeCapacityReservationInstanceShapesResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListComputeCapacityReservationInstanceShapesRequest.Builder>,
                        ListComputeCapacityReservationInstanceShapesRequest>() {
                    @Override
                    public ListComputeCapacityReservationInstanceShapesRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListComputeCapacityReservationInstanceShapesRequest
                                                    .Builder>
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
                        ListComputeCapacityReservationInstanceShapesRequest,
                        ListComputeCapacityReservationInstanceShapesResponse>() {
                    @Override
                    public ListComputeCapacityReservationInstanceShapesResponse apply(
                            ListComputeCapacityReservationInstanceShapesRequest request) {
                        return client.listComputeCapacityReservationInstanceShapes(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link com.oracle.bmc.core.model.ComputeCapacityReservationInstanceShapeSummary} objects
     * contained in responses from the listComputeCapacityReservationInstanceShapes operation. This iterable will fetch more data from the
     * server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link com.oracle.bmc.core.model.ComputeCapacityReservationInstanceShapeSummary} objects
     * contained in responses received from the service.
     */
    public Iterable<com.oracle.bmc.core.model.ComputeCapacityReservationInstanceShapeSummary>
            listComputeCapacityReservationInstanceShapesRecordIterator(
                    final ListComputeCapacityReservationInstanceShapesRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListComputeCapacityReservationInstanceShapesRequest.Builder,
                ListComputeCapacityReservationInstanceShapesRequest,
                ListComputeCapacityReservationInstanceShapesResponse,
                com.oracle.bmc.core.model.ComputeCapacityReservationInstanceShapeSummary>(
                new java.util.function.Supplier<
                        ListComputeCapacityReservationInstanceShapesRequest.Builder>() {
                    @Override
                    public ListComputeCapacityReservationInstanceShapesRequest.Builder get() {
                        return ListComputeCapacityReservationInstanceShapesRequest.builder()
                                .copy(request);
                    }
                },
                new java.util.function.Function<
                        ListComputeCapacityReservationInstanceShapesResponse, String>() {
                    @Override
                    public String apply(
                            ListComputeCapacityReservationInstanceShapesResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListComputeCapacityReservationInstanceShapesRequest.Builder>,
                        ListComputeCapacityReservationInstanceShapesRequest>() {
                    @Override
                    public ListComputeCapacityReservationInstanceShapesRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListComputeCapacityReservationInstanceShapesRequest
                                                    .Builder>
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
                        ListComputeCapacityReservationInstanceShapesRequest,
                        ListComputeCapacityReservationInstanceShapesResponse>() {
                    @Override
                    public ListComputeCapacityReservationInstanceShapesResponse apply(
                            ListComputeCapacityReservationInstanceShapesRequest request) {
                        return client.listComputeCapacityReservationInstanceShapes(request);
                    }
                },
                new java.util.function.Function<
                        ListComputeCapacityReservationInstanceShapesResponse,
                        java.util.List<
                                com.oracle.bmc.core.model
                                        .ComputeCapacityReservationInstanceShapeSummary>>() {
                    @Override
                    public java.util.List<
                                    com.oracle.bmc.core.model
                                            .ComputeCapacityReservationInstanceShapeSummary>
                            apply(ListComputeCapacityReservationInstanceShapesResponse response) {
                        return response.getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the listComputeCapacityReservationInstances operation. This iterable
     * will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses received from the service.
     */
    public Iterable<ListComputeCapacityReservationInstancesResponse>
            listComputeCapacityReservationInstancesResponseIterator(
                    final ListComputeCapacityReservationInstancesRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListComputeCapacityReservationInstancesRequest.Builder,
                ListComputeCapacityReservationInstancesRequest,
                ListComputeCapacityReservationInstancesResponse>(
                new java.util.function.Supplier<
                        ListComputeCapacityReservationInstancesRequest.Builder>() {
                    @Override
                    public ListComputeCapacityReservationInstancesRequest.Builder get() {
                        return ListComputeCapacityReservationInstancesRequest.builder()
                                .copy(request);
                    }
                },
                new java.util.function.Function<
                        ListComputeCapacityReservationInstancesResponse, String>() {
                    @Override
                    public String apply(ListComputeCapacityReservationInstancesResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListComputeCapacityReservationInstancesRequest.Builder>,
                        ListComputeCapacityReservationInstancesRequest>() {
                    @Override
                    public ListComputeCapacityReservationInstancesRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListComputeCapacityReservationInstancesRequest.Builder>
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
                        ListComputeCapacityReservationInstancesRequest,
                        ListComputeCapacityReservationInstancesResponse>() {
                    @Override
                    public ListComputeCapacityReservationInstancesResponse apply(
                            ListComputeCapacityReservationInstancesRequest request) {
                        return client.listComputeCapacityReservationInstances(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link com.oracle.bmc.core.model.CapacityReservationInstanceSummary} objects
     * contained in responses from the listComputeCapacityReservationInstances operation. This iterable will fetch more data from the
     * server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link com.oracle.bmc.core.model.CapacityReservationInstanceSummary} objects
     * contained in responses received from the service.
     */
    public Iterable<com.oracle.bmc.core.model.CapacityReservationInstanceSummary>
            listComputeCapacityReservationInstancesRecordIterator(
                    final ListComputeCapacityReservationInstancesRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListComputeCapacityReservationInstancesRequest.Builder,
                ListComputeCapacityReservationInstancesRequest,
                ListComputeCapacityReservationInstancesResponse,
                com.oracle.bmc.core.model.CapacityReservationInstanceSummary>(
                new java.util.function.Supplier<
                        ListComputeCapacityReservationInstancesRequest.Builder>() {
                    @Override
                    public ListComputeCapacityReservationInstancesRequest.Builder get() {
                        return ListComputeCapacityReservationInstancesRequest.builder()
                                .copy(request);
                    }
                },
                new java.util.function.Function<
                        ListComputeCapacityReservationInstancesResponse, String>() {
                    @Override
                    public String apply(ListComputeCapacityReservationInstancesResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListComputeCapacityReservationInstancesRequest.Builder>,
                        ListComputeCapacityReservationInstancesRequest>() {
                    @Override
                    public ListComputeCapacityReservationInstancesRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListComputeCapacityReservationInstancesRequest.Builder>
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
                        ListComputeCapacityReservationInstancesRequest,
                        ListComputeCapacityReservationInstancesResponse>() {
                    @Override
                    public ListComputeCapacityReservationInstancesResponse apply(
                            ListComputeCapacityReservationInstancesRequest request) {
                        return client.listComputeCapacityReservationInstances(request);
                    }
                },
                new java.util.function.Function<
                        ListComputeCapacityReservationInstancesResponse,
                        java.util.List<
                                com.oracle.bmc.core.model.CapacityReservationInstanceSummary>>() {
                    @Override
                    public java.util.List<
                                    com.oracle.bmc.core.model.CapacityReservationInstanceSummary>
                            apply(ListComputeCapacityReservationInstancesResponse response) {
                        return response.getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the listComputeCapacityReservations operation. This iterable
     * will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses received from the service.
     */
    public Iterable<ListComputeCapacityReservationsResponse>
            listComputeCapacityReservationsResponseIterator(
                    final ListComputeCapacityReservationsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListComputeCapacityReservationsRequest.Builder,
                ListComputeCapacityReservationsRequest, ListComputeCapacityReservationsResponse>(
                new java.util.function.Supplier<ListComputeCapacityReservationsRequest.Builder>() {
                    @Override
                    public ListComputeCapacityReservationsRequest.Builder get() {
                        return ListComputeCapacityReservationsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListComputeCapacityReservationsResponse, String>() {
                    @Override
                    public String apply(ListComputeCapacityReservationsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListComputeCapacityReservationsRequest.Builder>,
                        ListComputeCapacityReservationsRequest>() {
                    @Override
                    public ListComputeCapacityReservationsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListComputeCapacityReservationsRequest.Builder>
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
                        ListComputeCapacityReservationsRequest,
                        ListComputeCapacityReservationsResponse>() {
                    @Override
                    public ListComputeCapacityReservationsResponse apply(
                            ListComputeCapacityReservationsRequest request) {
                        return client.listComputeCapacityReservations(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link com.oracle.bmc.core.model.ComputeCapacityReservationSummary} objects
     * contained in responses from the listComputeCapacityReservations operation. This iterable will fetch more data from the
     * server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link com.oracle.bmc.core.model.ComputeCapacityReservationSummary} objects
     * contained in responses received from the service.
     */
    public Iterable<com.oracle.bmc.core.model.ComputeCapacityReservationSummary>
            listComputeCapacityReservationsRecordIterator(
                    final ListComputeCapacityReservationsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListComputeCapacityReservationsRequest.Builder,
                ListComputeCapacityReservationsRequest, ListComputeCapacityReservationsResponse,
                com.oracle.bmc.core.model.ComputeCapacityReservationSummary>(
                new java.util.function.Supplier<ListComputeCapacityReservationsRequest.Builder>() {
                    @Override
                    public ListComputeCapacityReservationsRequest.Builder get() {
                        return ListComputeCapacityReservationsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListComputeCapacityReservationsResponse, String>() {
                    @Override
                    public String apply(ListComputeCapacityReservationsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListComputeCapacityReservationsRequest.Builder>,
                        ListComputeCapacityReservationsRequest>() {
                    @Override
                    public ListComputeCapacityReservationsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListComputeCapacityReservationsRequest.Builder>
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
                        ListComputeCapacityReservationsRequest,
                        ListComputeCapacityReservationsResponse>() {
                    @Override
                    public ListComputeCapacityReservationsResponse apply(
                            ListComputeCapacityReservationsRequest request) {
                        return client.listComputeCapacityReservations(request);
                    }
                },
                new java.util.function.Function<
                        ListComputeCapacityReservationsResponse,
                        java.util.List<
                                com.oracle.bmc.core.model.ComputeCapacityReservationSummary>>() {
                    @Override
                    public java.util.List<
                                    com.oracle.bmc.core.model.ComputeCapacityReservationSummary>
                            apply(ListComputeCapacityReservationsResponse response) {
                        return response.getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the listComputeCapacityTopologies operation. This iterable
     * will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses received from the service.
     */
    public Iterable<ListComputeCapacityTopologiesResponse>
            listComputeCapacityTopologiesResponseIterator(
                    final ListComputeCapacityTopologiesRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListComputeCapacityTopologiesRequest.Builder, ListComputeCapacityTopologiesRequest,
                ListComputeCapacityTopologiesResponse>(
                new java.util.function.Supplier<ListComputeCapacityTopologiesRequest.Builder>() {
                    @Override
                    public ListComputeCapacityTopologiesRequest.Builder get() {
                        return ListComputeCapacityTopologiesRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListComputeCapacityTopologiesResponse, String>() {
                    @Override
                    public String apply(ListComputeCapacityTopologiesResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListComputeCapacityTopologiesRequest.Builder>,
                        ListComputeCapacityTopologiesRequest>() {
                    @Override
                    public ListComputeCapacityTopologiesRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListComputeCapacityTopologiesRequest.Builder>
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
                        ListComputeCapacityTopologiesRequest,
                        ListComputeCapacityTopologiesResponse>() {
                    @Override
                    public ListComputeCapacityTopologiesResponse apply(
                            ListComputeCapacityTopologiesRequest request) {
                        return client.listComputeCapacityTopologies(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link com.oracle.bmc.core.model.ComputeCapacityTopologySummary} objects
     * contained in responses from the listComputeCapacityTopologies operation. This iterable will fetch more data from the
     * server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link com.oracle.bmc.core.model.ComputeCapacityTopologySummary} objects
     * contained in responses received from the service.
     */
    public Iterable<com.oracle.bmc.core.model.ComputeCapacityTopologySummary>
            listComputeCapacityTopologiesRecordIterator(
                    final ListComputeCapacityTopologiesRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListComputeCapacityTopologiesRequest.Builder, ListComputeCapacityTopologiesRequest,
                ListComputeCapacityTopologiesResponse,
                com.oracle.bmc.core.model.ComputeCapacityTopologySummary>(
                new java.util.function.Supplier<ListComputeCapacityTopologiesRequest.Builder>() {
                    @Override
                    public ListComputeCapacityTopologiesRequest.Builder get() {
                        return ListComputeCapacityTopologiesRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListComputeCapacityTopologiesResponse, String>() {
                    @Override
                    public String apply(ListComputeCapacityTopologiesResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListComputeCapacityTopologiesRequest.Builder>,
                        ListComputeCapacityTopologiesRequest>() {
                    @Override
                    public ListComputeCapacityTopologiesRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListComputeCapacityTopologiesRequest.Builder>
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
                        ListComputeCapacityTopologiesRequest,
                        ListComputeCapacityTopologiesResponse>() {
                    @Override
                    public ListComputeCapacityTopologiesResponse apply(
                            ListComputeCapacityTopologiesRequest request) {
                        return client.listComputeCapacityTopologies(request);
                    }
                },
                new java.util.function.Function<
                        ListComputeCapacityTopologiesResponse,
                        java.util.List<
                                com.oracle.bmc.core.model.ComputeCapacityTopologySummary>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.core.model.ComputeCapacityTopologySummary>
                            apply(ListComputeCapacityTopologiesResponse response) {
                        return response.getComputeCapacityTopologyCollection().getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the listComputeCapacityTopologyComputeBareMetalHosts operation. This iterable
     * will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses received from the service.
     */
    public Iterable<ListComputeCapacityTopologyComputeBareMetalHostsResponse>
            listComputeCapacityTopologyComputeBareMetalHostsResponseIterator(
                    final ListComputeCapacityTopologyComputeBareMetalHostsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListComputeCapacityTopologyComputeBareMetalHostsRequest.Builder,
                ListComputeCapacityTopologyComputeBareMetalHostsRequest,
                ListComputeCapacityTopologyComputeBareMetalHostsResponse>(
                new java.util.function.Supplier<
                        ListComputeCapacityTopologyComputeBareMetalHostsRequest.Builder>() {
                    @Override
                    public ListComputeCapacityTopologyComputeBareMetalHostsRequest.Builder get() {
                        return ListComputeCapacityTopologyComputeBareMetalHostsRequest.builder()
                                .copy(request);
                    }
                },
                new java.util.function.Function<
                        ListComputeCapacityTopologyComputeBareMetalHostsResponse, String>() {
                    @Override
                    public String apply(
                            ListComputeCapacityTopologyComputeBareMetalHostsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListComputeCapacityTopologyComputeBareMetalHostsRequest.Builder>,
                        ListComputeCapacityTopologyComputeBareMetalHostsRequest>() {
                    @Override
                    public ListComputeCapacityTopologyComputeBareMetalHostsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListComputeCapacityTopologyComputeBareMetalHostsRequest
                                                    .Builder>
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
                        ListComputeCapacityTopologyComputeBareMetalHostsRequest,
                        ListComputeCapacityTopologyComputeBareMetalHostsResponse>() {
                    @Override
                    public ListComputeCapacityTopologyComputeBareMetalHostsResponse apply(
                            ListComputeCapacityTopologyComputeBareMetalHostsRequest request) {
                        return client.listComputeCapacityTopologyComputeBareMetalHosts(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link com.oracle.bmc.core.model.ComputeBareMetalHostSummary} objects
     * contained in responses from the listComputeCapacityTopologyComputeBareMetalHosts operation. This iterable will fetch more data from the
     * server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link com.oracle.bmc.core.model.ComputeBareMetalHostSummary} objects
     * contained in responses received from the service.
     */
    public Iterable<com.oracle.bmc.core.model.ComputeBareMetalHostSummary>
            listComputeCapacityTopologyComputeBareMetalHostsRecordIterator(
                    final ListComputeCapacityTopologyComputeBareMetalHostsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListComputeCapacityTopologyComputeBareMetalHostsRequest.Builder,
                ListComputeCapacityTopologyComputeBareMetalHostsRequest,
                ListComputeCapacityTopologyComputeBareMetalHostsResponse,
                com.oracle.bmc.core.model.ComputeBareMetalHostSummary>(
                new java.util.function.Supplier<
                        ListComputeCapacityTopologyComputeBareMetalHostsRequest.Builder>() {
                    @Override
                    public ListComputeCapacityTopologyComputeBareMetalHostsRequest.Builder get() {
                        return ListComputeCapacityTopologyComputeBareMetalHostsRequest.builder()
                                .copy(request);
                    }
                },
                new java.util.function.Function<
                        ListComputeCapacityTopologyComputeBareMetalHostsResponse, String>() {
                    @Override
                    public String apply(
                            ListComputeCapacityTopologyComputeBareMetalHostsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListComputeCapacityTopologyComputeBareMetalHostsRequest.Builder>,
                        ListComputeCapacityTopologyComputeBareMetalHostsRequest>() {
                    @Override
                    public ListComputeCapacityTopologyComputeBareMetalHostsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListComputeCapacityTopologyComputeBareMetalHostsRequest
                                                    .Builder>
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
                        ListComputeCapacityTopologyComputeBareMetalHostsRequest,
                        ListComputeCapacityTopologyComputeBareMetalHostsResponse>() {
                    @Override
                    public ListComputeCapacityTopologyComputeBareMetalHostsResponse apply(
                            ListComputeCapacityTopologyComputeBareMetalHostsRequest request) {
                        return client.listComputeCapacityTopologyComputeBareMetalHosts(request);
                    }
                },
                new java.util.function.Function<
                        ListComputeCapacityTopologyComputeBareMetalHostsResponse,
                        java.util.List<com.oracle.bmc.core.model.ComputeBareMetalHostSummary>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.core.model.ComputeBareMetalHostSummary>
                            apply(
                                    ListComputeCapacityTopologyComputeBareMetalHostsResponse
                                            response) {
                        return response.getComputeBareMetalHostCollection().getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the listComputeCapacityTopologyComputeHpcIslands operation. This iterable
     * will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses received from the service.
     */
    public Iterable<ListComputeCapacityTopologyComputeHpcIslandsResponse>
            listComputeCapacityTopologyComputeHpcIslandsResponseIterator(
                    final ListComputeCapacityTopologyComputeHpcIslandsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListComputeCapacityTopologyComputeHpcIslandsRequest.Builder,
                ListComputeCapacityTopologyComputeHpcIslandsRequest,
                ListComputeCapacityTopologyComputeHpcIslandsResponse>(
                new java.util.function.Supplier<
                        ListComputeCapacityTopologyComputeHpcIslandsRequest.Builder>() {
                    @Override
                    public ListComputeCapacityTopologyComputeHpcIslandsRequest.Builder get() {
                        return ListComputeCapacityTopologyComputeHpcIslandsRequest.builder()
                                .copy(request);
                    }
                },
                new java.util.function.Function<
                        ListComputeCapacityTopologyComputeHpcIslandsResponse, String>() {
                    @Override
                    public String apply(
                            ListComputeCapacityTopologyComputeHpcIslandsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListComputeCapacityTopologyComputeHpcIslandsRequest.Builder>,
                        ListComputeCapacityTopologyComputeHpcIslandsRequest>() {
                    @Override
                    public ListComputeCapacityTopologyComputeHpcIslandsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListComputeCapacityTopologyComputeHpcIslandsRequest
                                                    .Builder>
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
                        ListComputeCapacityTopologyComputeHpcIslandsRequest,
                        ListComputeCapacityTopologyComputeHpcIslandsResponse>() {
                    @Override
                    public ListComputeCapacityTopologyComputeHpcIslandsResponse apply(
                            ListComputeCapacityTopologyComputeHpcIslandsRequest request) {
                        return client.listComputeCapacityTopologyComputeHpcIslands(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link com.oracle.bmc.core.model.ComputeHpcIslandSummary} objects
     * contained in responses from the listComputeCapacityTopologyComputeHpcIslands operation. This iterable will fetch more data from the
     * server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link com.oracle.bmc.core.model.ComputeHpcIslandSummary} objects
     * contained in responses received from the service.
     */
    public Iterable<com.oracle.bmc.core.model.ComputeHpcIslandSummary>
            listComputeCapacityTopologyComputeHpcIslandsRecordIterator(
                    final ListComputeCapacityTopologyComputeHpcIslandsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListComputeCapacityTopologyComputeHpcIslandsRequest.Builder,
                ListComputeCapacityTopologyComputeHpcIslandsRequest,
                ListComputeCapacityTopologyComputeHpcIslandsResponse,
                com.oracle.bmc.core.model.ComputeHpcIslandSummary>(
                new java.util.function.Supplier<
                        ListComputeCapacityTopologyComputeHpcIslandsRequest.Builder>() {
                    @Override
                    public ListComputeCapacityTopologyComputeHpcIslandsRequest.Builder get() {
                        return ListComputeCapacityTopologyComputeHpcIslandsRequest.builder()
                                .copy(request);
                    }
                },
                new java.util.function.Function<
                        ListComputeCapacityTopologyComputeHpcIslandsResponse, String>() {
                    @Override
                    public String apply(
                            ListComputeCapacityTopologyComputeHpcIslandsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListComputeCapacityTopologyComputeHpcIslandsRequest.Builder>,
                        ListComputeCapacityTopologyComputeHpcIslandsRequest>() {
                    @Override
                    public ListComputeCapacityTopologyComputeHpcIslandsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListComputeCapacityTopologyComputeHpcIslandsRequest
                                                    .Builder>
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
                        ListComputeCapacityTopologyComputeHpcIslandsRequest,
                        ListComputeCapacityTopologyComputeHpcIslandsResponse>() {
                    @Override
                    public ListComputeCapacityTopologyComputeHpcIslandsResponse apply(
                            ListComputeCapacityTopologyComputeHpcIslandsRequest request) {
                        return client.listComputeCapacityTopologyComputeHpcIslands(request);
                    }
                },
                new java.util.function.Function<
                        ListComputeCapacityTopologyComputeHpcIslandsResponse,
                        java.util.List<com.oracle.bmc.core.model.ComputeHpcIslandSummary>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.core.model.ComputeHpcIslandSummary> apply(
                            ListComputeCapacityTopologyComputeHpcIslandsResponse response) {
                        return response.getComputeHpcIslandCollection().getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the listComputeCapacityTopologyComputeNetworkBlocks operation. This iterable
     * will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses received from the service.
     */
    public Iterable<ListComputeCapacityTopologyComputeNetworkBlocksResponse>
            listComputeCapacityTopologyComputeNetworkBlocksResponseIterator(
                    final ListComputeCapacityTopologyComputeNetworkBlocksRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListComputeCapacityTopologyComputeNetworkBlocksRequest.Builder,
                ListComputeCapacityTopologyComputeNetworkBlocksRequest,
                ListComputeCapacityTopologyComputeNetworkBlocksResponse>(
                new java.util.function.Supplier<
                        ListComputeCapacityTopologyComputeNetworkBlocksRequest.Builder>() {
                    @Override
                    public ListComputeCapacityTopologyComputeNetworkBlocksRequest.Builder get() {
                        return ListComputeCapacityTopologyComputeNetworkBlocksRequest.builder()
                                .copy(request);
                    }
                },
                new java.util.function.Function<
                        ListComputeCapacityTopologyComputeNetworkBlocksResponse, String>() {
                    @Override
                    public String apply(
                            ListComputeCapacityTopologyComputeNetworkBlocksResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListComputeCapacityTopologyComputeNetworkBlocksRequest.Builder>,
                        ListComputeCapacityTopologyComputeNetworkBlocksRequest>() {
                    @Override
                    public ListComputeCapacityTopologyComputeNetworkBlocksRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListComputeCapacityTopologyComputeNetworkBlocksRequest
                                                    .Builder>
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
                        ListComputeCapacityTopologyComputeNetworkBlocksRequest,
                        ListComputeCapacityTopologyComputeNetworkBlocksResponse>() {
                    @Override
                    public ListComputeCapacityTopologyComputeNetworkBlocksResponse apply(
                            ListComputeCapacityTopologyComputeNetworkBlocksRequest request) {
                        return client.listComputeCapacityTopologyComputeNetworkBlocks(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link com.oracle.bmc.core.model.ComputeNetworkBlockSummary} objects
     * contained in responses from the listComputeCapacityTopologyComputeNetworkBlocks operation. This iterable will fetch more data from the
     * server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link com.oracle.bmc.core.model.ComputeNetworkBlockSummary} objects
     * contained in responses received from the service.
     */
    public Iterable<com.oracle.bmc.core.model.ComputeNetworkBlockSummary>
            listComputeCapacityTopologyComputeNetworkBlocksRecordIterator(
                    final ListComputeCapacityTopologyComputeNetworkBlocksRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListComputeCapacityTopologyComputeNetworkBlocksRequest.Builder,
                ListComputeCapacityTopologyComputeNetworkBlocksRequest,
                ListComputeCapacityTopologyComputeNetworkBlocksResponse,
                com.oracle.bmc.core.model.ComputeNetworkBlockSummary>(
                new java.util.function.Supplier<
                        ListComputeCapacityTopologyComputeNetworkBlocksRequest.Builder>() {
                    @Override
                    public ListComputeCapacityTopologyComputeNetworkBlocksRequest.Builder get() {
                        return ListComputeCapacityTopologyComputeNetworkBlocksRequest.builder()
                                .copy(request);
                    }
                },
                new java.util.function.Function<
                        ListComputeCapacityTopologyComputeNetworkBlocksResponse, String>() {
                    @Override
                    public String apply(
                            ListComputeCapacityTopologyComputeNetworkBlocksResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListComputeCapacityTopologyComputeNetworkBlocksRequest.Builder>,
                        ListComputeCapacityTopologyComputeNetworkBlocksRequest>() {
                    @Override
                    public ListComputeCapacityTopologyComputeNetworkBlocksRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListComputeCapacityTopologyComputeNetworkBlocksRequest
                                                    .Builder>
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
                        ListComputeCapacityTopologyComputeNetworkBlocksRequest,
                        ListComputeCapacityTopologyComputeNetworkBlocksResponse>() {
                    @Override
                    public ListComputeCapacityTopologyComputeNetworkBlocksResponse apply(
                            ListComputeCapacityTopologyComputeNetworkBlocksRequest request) {
                        return client.listComputeCapacityTopologyComputeNetworkBlocks(request);
                    }
                },
                new java.util.function.Function<
                        ListComputeCapacityTopologyComputeNetworkBlocksResponse,
                        java.util.List<com.oracle.bmc.core.model.ComputeNetworkBlockSummary>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.core.model.ComputeNetworkBlockSummary>
                            apply(
                                    ListComputeCapacityTopologyComputeNetworkBlocksResponse
                                            response) {
                        return response.getComputeNetworkBlockCollection().getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the listComputeClusters operation. This iterable
     * will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses received from the service.
     */
    public Iterable<ListComputeClustersResponse> listComputeClustersResponseIterator(
            final ListComputeClustersRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListComputeClustersRequest.Builder, ListComputeClustersRequest,
                ListComputeClustersResponse>(
                new java.util.function.Supplier<ListComputeClustersRequest.Builder>() {
                    @Override
                    public ListComputeClustersRequest.Builder get() {
                        return ListComputeClustersRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListComputeClustersResponse, String>() {
                    @Override
                    public String apply(ListComputeClustersResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListComputeClustersRequest.Builder>,
                        ListComputeClustersRequest>() {
                    @Override
                    public ListComputeClustersRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListComputeClustersRequest.Builder>
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
                        ListComputeClustersRequest, ListComputeClustersResponse>() {
                    @Override
                    public ListComputeClustersResponse apply(ListComputeClustersRequest request) {
                        return client.listComputeClusters(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link com.oracle.bmc.core.model.ComputeClusterSummary} objects
     * contained in responses from the listComputeClusters operation. This iterable will fetch more data from the
     * server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link com.oracle.bmc.core.model.ComputeClusterSummary} objects
     * contained in responses received from the service.
     */
    public Iterable<com.oracle.bmc.core.model.ComputeClusterSummary>
            listComputeClustersRecordIterator(final ListComputeClustersRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListComputeClustersRequest.Builder, ListComputeClustersRequest,
                ListComputeClustersResponse, com.oracle.bmc.core.model.ComputeClusterSummary>(
                new java.util.function.Supplier<ListComputeClustersRequest.Builder>() {
                    @Override
                    public ListComputeClustersRequest.Builder get() {
                        return ListComputeClustersRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListComputeClustersResponse, String>() {
                    @Override
                    public String apply(ListComputeClustersResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListComputeClustersRequest.Builder>,
                        ListComputeClustersRequest>() {
                    @Override
                    public ListComputeClustersRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListComputeClustersRequest.Builder>
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
                        ListComputeClustersRequest, ListComputeClustersResponse>() {
                    @Override
                    public ListComputeClustersResponse apply(ListComputeClustersRequest request) {
                        return client.listComputeClusters(request);
                    }
                },
                new java.util.function.Function<
                        ListComputeClustersResponse,
                        java.util.List<com.oracle.bmc.core.model.ComputeClusterSummary>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.core.model.ComputeClusterSummary> apply(
                            ListComputeClustersResponse response) {
                        return response.getComputeClusterCollection().getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the listComputeGlobalImageCapabilitySchemaVersions operation. This iterable
     * will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses received from the service.
     */
    public Iterable<ListComputeGlobalImageCapabilitySchemaVersionsResponse>
            listComputeGlobalImageCapabilitySchemaVersionsResponseIterator(
                    final ListComputeGlobalImageCapabilitySchemaVersionsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListComputeGlobalImageCapabilitySchemaVersionsRequest.Builder,
                ListComputeGlobalImageCapabilitySchemaVersionsRequest,
                ListComputeGlobalImageCapabilitySchemaVersionsResponse>(
                new java.util.function.Supplier<
                        ListComputeGlobalImageCapabilitySchemaVersionsRequest.Builder>() {
                    @Override
                    public ListComputeGlobalImageCapabilitySchemaVersionsRequest.Builder get() {
                        return ListComputeGlobalImageCapabilitySchemaVersionsRequest.builder()
                                .copy(request);
                    }
                },
                new java.util.function.Function<
                        ListComputeGlobalImageCapabilitySchemaVersionsResponse, String>() {
                    @Override
                    public String apply(
                            ListComputeGlobalImageCapabilitySchemaVersionsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListComputeGlobalImageCapabilitySchemaVersionsRequest.Builder>,
                        ListComputeGlobalImageCapabilitySchemaVersionsRequest>() {
                    @Override
                    public ListComputeGlobalImageCapabilitySchemaVersionsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListComputeGlobalImageCapabilitySchemaVersionsRequest
                                                    .Builder>
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
                        ListComputeGlobalImageCapabilitySchemaVersionsRequest,
                        ListComputeGlobalImageCapabilitySchemaVersionsResponse>() {
                    @Override
                    public ListComputeGlobalImageCapabilitySchemaVersionsResponse apply(
                            ListComputeGlobalImageCapabilitySchemaVersionsRequest request) {
                        return client.listComputeGlobalImageCapabilitySchemaVersions(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link com.oracle.bmc.core.model.ComputeGlobalImageCapabilitySchemaVersionSummary} objects
     * contained in responses from the listComputeGlobalImageCapabilitySchemaVersions operation. This iterable will fetch more data from the
     * server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link com.oracle.bmc.core.model.ComputeGlobalImageCapabilitySchemaVersionSummary} objects
     * contained in responses received from the service.
     */
    public Iterable<com.oracle.bmc.core.model.ComputeGlobalImageCapabilitySchemaVersionSummary>
            listComputeGlobalImageCapabilitySchemaVersionsRecordIterator(
                    final ListComputeGlobalImageCapabilitySchemaVersionsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListComputeGlobalImageCapabilitySchemaVersionsRequest.Builder,
                ListComputeGlobalImageCapabilitySchemaVersionsRequest,
                ListComputeGlobalImageCapabilitySchemaVersionsResponse,
                com.oracle.bmc.core.model.ComputeGlobalImageCapabilitySchemaVersionSummary>(
                new java.util.function.Supplier<
                        ListComputeGlobalImageCapabilitySchemaVersionsRequest.Builder>() {
                    @Override
                    public ListComputeGlobalImageCapabilitySchemaVersionsRequest.Builder get() {
                        return ListComputeGlobalImageCapabilitySchemaVersionsRequest.builder()
                                .copy(request);
                    }
                },
                new java.util.function.Function<
                        ListComputeGlobalImageCapabilitySchemaVersionsResponse, String>() {
                    @Override
                    public String apply(
                            ListComputeGlobalImageCapabilitySchemaVersionsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListComputeGlobalImageCapabilitySchemaVersionsRequest.Builder>,
                        ListComputeGlobalImageCapabilitySchemaVersionsRequest>() {
                    @Override
                    public ListComputeGlobalImageCapabilitySchemaVersionsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListComputeGlobalImageCapabilitySchemaVersionsRequest
                                                    .Builder>
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
                        ListComputeGlobalImageCapabilitySchemaVersionsRequest,
                        ListComputeGlobalImageCapabilitySchemaVersionsResponse>() {
                    @Override
                    public ListComputeGlobalImageCapabilitySchemaVersionsResponse apply(
                            ListComputeGlobalImageCapabilitySchemaVersionsRequest request) {
                        return client.listComputeGlobalImageCapabilitySchemaVersions(request);
                    }
                },
                new java.util.function.Function<
                        ListComputeGlobalImageCapabilitySchemaVersionsResponse,
                        java.util.List<
                                com.oracle.bmc.core.model
                                        .ComputeGlobalImageCapabilitySchemaVersionSummary>>() {
                    @Override
                    public java.util.List<
                                    com.oracle.bmc.core.model
                                            .ComputeGlobalImageCapabilitySchemaVersionSummary>
                            apply(ListComputeGlobalImageCapabilitySchemaVersionsResponse response) {
                        return response.getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the listComputeGlobalImageCapabilitySchemas operation. This iterable
     * will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses received from the service.
     */
    public Iterable<ListComputeGlobalImageCapabilitySchemasResponse>
            listComputeGlobalImageCapabilitySchemasResponseIterator(
                    final ListComputeGlobalImageCapabilitySchemasRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListComputeGlobalImageCapabilitySchemasRequest.Builder,
                ListComputeGlobalImageCapabilitySchemasRequest,
                ListComputeGlobalImageCapabilitySchemasResponse>(
                new java.util.function.Supplier<
                        ListComputeGlobalImageCapabilitySchemasRequest.Builder>() {
                    @Override
                    public ListComputeGlobalImageCapabilitySchemasRequest.Builder get() {
                        return ListComputeGlobalImageCapabilitySchemasRequest.builder()
                                .copy(request);
                    }
                },
                new java.util.function.Function<
                        ListComputeGlobalImageCapabilitySchemasResponse, String>() {
                    @Override
                    public String apply(ListComputeGlobalImageCapabilitySchemasResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListComputeGlobalImageCapabilitySchemasRequest.Builder>,
                        ListComputeGlobalImageCapabilitySchemasRequest>() {
                    @Override
                    public ListComputeGlobalImageCapabilitySchemasRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListComputeGlobalImageCapabilitySchemasRequest.Builder>
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
                        ListComputeGlobalImageCapabilitySchemasRequest,
                        ListComputeGlobalImageCapabilitySchemasResponse>() {
                    @Override
                    public ListComputeGlobalImageCapabilitySchemasResponse apply(
                            ListComputeGlobalImageCapabilitySchemasRequest request) {
                        return client.listComputeGlobalImageCapabilitySchemas(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link com.oracle.bmc.core.model.ComputeGlobalImageCapabilitySchemaSummary} objects
     * contained in responses from the listComputeGlobalImageCapabilitySchemas operation. This iterable will fetch more data from the
     * server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link com.oracle.bmc.core.model.ComputeGlobalImageCapabilitySchemaSummary} objects
     * contained in responses received from the service.
     */
    public Iterable<com.oracle.bmc.core.model.ComputeGlobalImageCapabilitySchemaSummary>
            listComputeGlobalImageCapabilitySchemasRecordIterator(
                    final ListComputeGlobalImageCapabilitySchemasRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListComputeGlobalImageCapabilitySchemasRequest.Builder,
                ListComputeGlobalImageCapabilitySchemasRequest,
                ListComputeGlobalImageCapabilitySchemasResponse,
                com.oracle.bmc.core.model.ComputeGlobalImageCapabilitySchemaSummary>(
                new java.util.function.Supplier<
                        ListComputeGlobalImageCapabilitySchemasRequest.Builder>() {
                    @Override
                    public ListComputeGlobalImageCapabilitySchemasRequest.Builder get() {
                        return ListComputeGlobalImageCapabilitySchemasRequest.builder()
                                .copy(request);
                    }
                },
                new java.util.function.Function<
                        ListComputeGlobalImageCapabilitySchemasResponse, String>() {
                    @Override
                    public String apply(ListComputeGlobalImageCapabilitySchemasResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListComputeGlobalImageCapabilitySchemasRequest.Builder>,
                        ListComputeGlobalImageCapabilitySchemasRequest>() {
                    @Override
                    public ListComputeGlobalImageCapabilitySchemasRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListComputeGlobalImageCapabilitySchemasRequest.Builder>
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
                        ListComputeGlobalImageCapabilitySchemasRequest,
                        ListComputeGlobalImageCapabilitySchemasResponse>() {
                    @Override
                    public ListComputeGlobalImageCapabilitySchemasResponse apply(
                            ListComputeGlobalImageCapabilitySchemasRequest request) {
                        return client.listComputeGlobalImageCapabilitySchemas(request);
                    }
                },
                new java.util.function.Function<
                        ListComputeGlobalImageCapabilitySchemasResponse,
                        java.util.List<
                                com.oracle.bmc.core.model
                                        .ComputeGlobalImageCapabilitySchemaSummary>>() {
                    @Override
                    public java.util.List<
                                    com.oracle.bmc.core.model
                                            .ComputeGlobalImageCapabilitySchemaSummary>
                            apply(ListComputeGlobalImageCapabilitySchemasResponse response) {
                        return response.getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the listComputeGpuMemoryClusterInstances operation. This iterable
     * will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses received from the service.
     */
    public Iterable<ListComputeGpuMemoryClusterInstancesResponse>
            listComputeGpuMemoryClusterInstancesResponseIterator(
                    final ListComputeGpuMemoryClusterInstancesRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListComputeGpuMemoryClusterInstancesRequest.Builder,
                ListComputeGpuMemoryClusterInstancesRequest,
                ListComputeGpuMemoryClusterInstancesResponse>(
                new java.util.function.Supplier<
                        ListComputeGpuMemoryClusterInstancesRequest.Builder>() {
                    @Override
                    public ListComputeGpuMemoryClusterInstancesRequest.Builder get() {
                        return ListComputeGpuMemoryClusterInstancesRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<
                        ListComputeGpuMemoryClusterInstancesResponse, String>() {
                    @Override
                    public String apply(ListComputeGpuMemoryClusterInstancesResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListComputeGpuMemoryClusterInstancesRequest.Builder>,
                        ListComputeGpuMemoryClusterInstancesRequest>() {
                    @Override
                    public ListComputeGpuMemoryClusterInstancesRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListComputeGpuMemoryClusterInstancesRequest.Builder>
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
                        ListComputeGpuMemoryClusterInstancesRequest,
                        ListComputeGpuMemoryClusterInstancesResponse>() {
                    @Override
                    public ListComputeGpuMemoryClusterInstancesResponse apply(
                            ListComputeGpuMemoryClusterInstancesRequest request) {
                        return client.listComputeGpuMemoryClusterInstances(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link com.oracle.bmc.core.model.ComputeGpuMemoryClusterInstanceSummary} objects
     * contained in responses from the listComputeGpuMemoryClusterInstances operation. This iterable will fetch more data from the
     * server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link com.oracle.bmc.core.model.ComputeGpuMemoryClusterInstanceSummary} objects
     * contained in responses received from the service.
     */
    public Iterable<com.oracle.bmc.core.model.ComputeGpuMemoryClusterInstanceSummary>
            listComputeGpuMemoryClusterInstancesRecordIterator(
                    final ListComputeGpuMemoryClusterInstancesRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListComputeGpuMemoryClusterInstancesRequest.Builder,
                ListComputeGpuMemoryClusterInstancesRequest,
                ListComputeGpuMemoryClusterInstancesResponse,
                com.oracle.bmc.core.model.ComputeGpuMemoryClusterInstanceSummary>(
                new java.util.function.Supplier<
                        ListComputeGpuMemoryClusterInstancesRequest.Builder>() {
                    @Override
                    public ListComputeGpuMemoryClusterInstancesRequest.Builder get() {
                        return ListComputeGpuMemoryClusterInstancesRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<
                        ListComputeGpuMemoryClusterInstancesResponse, String>() {
                    @Override
                    public String apply(ListComputeGpuMemoryClusterInstancesResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListComputeGpuMemoryClusterInstancesRequest.Builder>,
                        ListComputeGpuMemoryClusterInstancesRequest>() {
                    @Override
                    public ListComputeGpuMemoryClusterInstancesRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListComputeGpuMemoryClusterInstancesRequest.Builder>
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
                        ListComputeGpuMemoryClusterInstancesRequest,
                        ListComputeGpuMemoryClusterInstancesResponse>() {
                    @Override
                    public ListComputeGpuMemoryClusterInstancesResponse apply(
                            ListComputeGpuMemoryClusterInstancesRequest request) {
                        return client.listComputeGpuMemoryClusterInstances(request);
                    }
                },
                new java.util.function.Function<
                        ListComputeGpuMemoryClusterInstancesResponse,
                        java.util.List<
                                com.oracle.bmc.core.model
                                        .ComputeGpuMemoryClusterInstanceSummary>>() {
                    @Override
                    public java.util.List<
                                    com.oracle.bmc.core.model
                                            .ComputeGpuMemoryClusterInstanceSummary>
                            apply(ListComputeGpuMemoryClusterInstancesResponse response) {
                        return response.getComputeGpuMemoryClusterInstanceCollection().getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the listComputeGpuMemoryClusters operation. This iterable
     * will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses received from the service.
     */
    public Iterable<ListComputeGpuMemoryClustersResponse>
            listComputeGpuMemoryClustersResponseIterator(
                    final ListComputeGpuMemoryClustersRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListComputeGpuMemoryClustersRequest.Builder, ListComputeGpuMemoryClustersRequest,
                ListComputeGpuMemoryClustersResponse>(
                new java.util.function.Supplier<ListComputeGpuMemoryClustersRequest.Builder>() {
                    @Override
                    public ListComputeGpuMemoryClustersRequest.Builder get() {
                        return ListComputeGpuMemoryClustersRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListComputeGpuMemoryClustersResponse, String>() {
                    @Override
                    public String apply(ListComputeGpuMemoryClustersResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListComputeGpuMemoryClustersRequest.Builder>,
                        ListComputeGpuMemoryClustersRequest>() {
                    @Override
                    public ListComputeGpuMemoryClustersRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListComputeGpuMemoryClustersRequest.Builder>
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
                        ListComputeGpuMemoryClustersRequest,
                        ListComputeGpuMemoryClustersResponse>() {
                    @Override
                    public ListComputeGpuMemoryClustersResponse apply(
                            ListComputeGpuMemoryClustersRequest request) {
                        return client.listComputeGpuMemoryClusters(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link com.oracle.bmc.core.model.ComputeGpuMemoryClusterSummary} objects
     * contained in responses from the listComputeGpuMemoryClusters operation. This iterable will fetch more data from the
     * server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link com.oracle.bmc.core.model.ComputeGpuMemoryClusterSummary} objects
     * contained in responses received from the service.
     */
    public Iterable<com.oracle.bmc.core.model.ComputeGpuMemoryClusterSummary>
            listComputeGpuMemoryClustersRecordIterator(
                    final ListComputeGpuMemoryClustersRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListComputeGpuMemoryClustersRequest.Builder, ListComputeGpuMemoryClustersRequest,
                ListComputeGpuMemoryClustersResponse,
                com.oracle.bmc.core.model.ComputeGpuMemoryClusterSummary>(
                new java.util.function.Supplier<ListComputeGpuMemoryClustersRequest.Builder>() {
                    @Override
                    public ListComputeGpuMemoryClustersRequest.Builder get() {
                        return ListComputeGpuMemoryClustersRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListComputeGpuMemoryClustersResponse, String>() {
                    @Override
                    public String apply(ListComputeGpuMemoryClustersResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListComputeGpuMemoryClustersRequest.Builder>,
                        ListComputeGpuMemoryClustersRequest>() {
                    @Override
                    public ListComputeGpuMemoryClustersRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListComputeGpuMemoryClustersRequest.Builder>
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
                        ListComputeGpuMemoryClustersRequest,
                        ListComputeGpuMemoryClustersResponse>() {
                    @Override
                    public ListComputeGpuMemoryClustersResponse apply(
                            ListComputeGpuMemoryClustersRequest request) {
                        return client.listComputeGpuMemoryClusters(request);
                    }
                },
                new java.util.function.Function<
                        ListComputeGpuMemoryClustersResponse,
                        java.util.List<
                                com.oracle.bmc.core.model.ComputeGpuMemoryClusterSummary>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.core.model.ComputeGpuMemoryClusterSummary>
                            apply(ListComputeGpuMemoryClustersResponse response) {
                        return response.getComputeGpuMemoryClusterCollection().getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the listComputeGpuMemoryFabrics operation. This iterable
     * will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses received from the service.
     */
    public Iterable<ListComputeGpuMemoryFabricsResponse>
            listComputeGpuMemoryFabricsResponseIterator(
                    final ListComputeGpuMemoryFabricsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListComputeGpuMemoryFabricsRequest.Builder, ListComputeGpuMemoryFabricsRequest,
                ListComputeGpuMemoryFabricsResponse>(
                new java.util.function.Supplier<ListComputeGpuMemoryFabricsRequest.Builder>() {
                    @Override
                    public ListComputeGpuMemoryFabricsRequest.Builder get() {
                        return ListComputeGpuMemoryFabricsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListComputeGpuMemoryFabricsResponse, String>() {
                    @Override
                    public String apply(ListComputeGpuMemoryFabricsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListComputeGpuMemoryFabricsRequest.Builder>,
                        ListComputeGpuMemoryFabricsRequest>() {
                    @Override
                    public ListComputeGpuMemoryFabricsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListComputeGpuMemoryFabricsRequest.Builder>
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
                        ListComputeGpuMemoryFabricsRequest, ListComputeGpuMemoryFabricsResponse>() {
                    @Override
                    public ListComputeGpuMemoryFabricsResponse apply(
                            ListComputeGpuMemoryFabricsRequest request) {
                        return client.listComputeGpuMemoryFabrics(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link com.oracle.bmc.core.model.ComputeGpuMemoryFabricSummary} objects
     * contained in responses from the listComputeGpuMemoryFabrics operation. This iterable will fetch more data from the
     * server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link com.oracle.bmc.core.model.ComputeGpuMemoryFabricSummary} objects
     * contained in responses received from the service.
     */
    public Iterable<com.oracle.bmc.core.model.ComputeGpuMemoryFabricSummary>
            listComputeGpuMemoryFabricsRecordIterator(
                    final ListComputeGpuMemoryFabricsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListComputeGpuMemoryFabricsRequest.Builder, ListComputeGpuMemoryFabricsRequest,
                ListComputeGpuMemoryFabricsResponse,
                com.oracle.bmc.core.model.ComputeGpuMemoryFabricSummary>(
                new java.util.function.Supplier<ListComputeGpuMemoryFabricsRequest.Builder>() {
                    @Override
                    public ListComputeGpuMemoryFabricsRequest.Builder get() {
                        return ListComputeGpuMemoryFabricsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListComputeGpuMemoryFabricsResponse, String>() {
                    @Override
                    public String apply(ListComputeGpuMemoryFabricsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListComputeGpuMemoryFabricsRequest.Builder>,
                        ListComputeGpuMemoryFabricsRequest>() {
                    @Override
                    public ListComputeGpuMemoryFabricsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListComputeGpuMemoryFabricsRequest.Builder>
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
                        ListComputeGpuMemoryFabricsRequest, ListComputeGpuMemoryFabricsResponse>() {
                    @Override
                    public ListComputeGpuMemoryFabricsResponse apply(
                            ListComputeGpuMemoryFabricsRequest request) {
                        return client.listComputeGpuMemoryFabrics(request);
                    }
                },
                new java.util.function.Function<
                        ListComputeGpuMemoryFabricsResponse,
                        java.util.List<com.oracle.bmc.core.model.ComputeGpuMemoryFabricSummary>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.core.model.ComputeGpuMemoryFabricSummary>
                            apply(ListComputeGpuMemoryFabricsResponse response) {
                        return response.getComputeGpuMemoryFabricCollection().getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the listComputeHosts operation. This iterable
     * will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses received from the service.
     */
    public Iterable<ListComputeHostsResponse> listComputeHostsResponseIterator(
            final ListComputeHostsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListComputeHostsRequest.Builder, ListComputeHostsRequest, ListComputeHostsResponse>(
                new java.util.function.Supplier<ListComputeHostsRequest.Builder>() {
                    @Override
                    public ListComputeHostsRequest.Builder get() {
                        return ListComputeHostsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListComputeHostsResponse, String>() {
                    @Override
                    public String apply(ListComputeHostsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListComputeHostsRequest.Builder>,
                        ListComputeHostsRequest>() {
                    @Override
                    public ListComputeHostsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListComputeHostsRequest.Builder>
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
                        ListComputeHostsRequest, ListComputeHostsResponse>() {
                    @Override
                    public ListComputeHostsResponse apply(ListComputeHostsRequest request) {
                        return client.listComputeHosts(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link com.oracle.bmc.core.model.ComputeHostSummary} objects
     * contained in responses from the listComputeHosts operation. This iterable will fetch more data from the
     * server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link com.oracle.bmc.core.model.ComputeHostSummary} objects
     * contained in responses received from the service.
     */
    public Iterable<com.oracle.bmc.core.model.ComputeHostSummary> listComputeHostsRecordIterator(
            final ListComputeHostsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListComputeHostsRequest.Builder, ListComputeHostsRequest, ListComputeHostsResponse,
                com.oracle.bmc.core.model.ComputeHostSummary>(
                new java.util.function.Supplier<ListComputeHostsRequest.Builder>() {
                    @Override
                    public ListComputeHostsRequest.Builder get() {
                        return ListComputeHostsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListComputeHostsResponse, String>() {
                    @Override
                    public String apply(ListComputeHostsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListComputeHostsRequest.Builder>,
                        ListComputeHostsRequest>() {
                    @Override
                    public ListComputeHostsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListComputeHostsRequest.Builder>
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
                        ListComputeHostsRequest, ListComputeHostsResponse>() {
                    @Override
                    public ListComputeHostsResponse apply(ListComputeHostsRequest request) {
                        return client.listComputeHosts(request);
                    }
                },
                new java.util.function.Function<
                        ListComputeHostsResponse,
                        java.util.List<com.oracle.bmc.core.model.ComputeHostSummary>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.core.model.ComputeHostSummary> apply(
                            ListComputeHostsResponse response) {
                        return response.getComputeHostCollection().getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the listComputeImageCapabilitySchemas operation. This iterable
     * will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses received from the service.
     */
    public Iterable<ListComputeImageCapabilitySchemasResponse>
            listComputeImageCapabilitySchemasResponseIterator(
                    final ListComputeImageCapabilitySchemasRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListComputeImageCapabilitySchemasRequest.Builder,
                ListComputeImageCapabilitySchemasRequest,
                ListComputeImageCapabilitySchemasResponse>(
                new java.util.function.Supplier<
                        ListComputeImageCapabilitySchemasRequest.Builder>() {
                    @Override
                    public ListComputeImageCapabilitySchemasRequest.Builder get() {
                        return ListComputeImageCapabilitySchemasRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<
                        ListComputeImageCapabilitySchemasResponse, String>() {
                    @Override
                    public String apply(ListComputeImageCapabilitySchemasResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListComputeImageCapabilitySchemasRequest.Builder>,
                        ListComputeImageCapabilitySchemasRequest>() {
                    @Override
                    public ListComputeImageCapabilitySchemasRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListComputeImageCapabilitySchemasRequest.Builder>
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
                        ListComputeImageCapabilitySchemasRequest,
                        ListComputeImageCapabilitySchemasResponse>() {
                    @Override
                    public ListComputeImageCapabilitySchemasResponse apply(
                            ListComputeImageCapabilitySchemasRequest request) {
                        return client.listComputeImageCapabilitySchemas(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link com.oracle.bmc.core.model.ComputeImageCapabilitySchemaSummary} objects
     * contained in responses from the listComputeImageCapabilitySchemas operation. This iterable will fetch more data from the
     * server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link com.oracle.bmc.core.model.ComputeImageCapabilitySchemaSummary} objects
     * contained in responses received from the service.
     */
    public Iterable<com.oracle.bmc.core.model.ComputeImageCapabilitySchemaSummary>
            listComputeImageCapabilitySchemasRecordIterator(
                    final ListComputeImageCapabilitySchemasRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListComputeImageCapabilitySchemasRequest.Builder,
                ListComputeImageCapabilitySchemasRequest, ListComputeImageCapabilitySchemasResponse,
                com.oracle.bmc.core.model.ComputeImageCapabilitySchemaSummary>(
                new java.util.function.Supplier<
                        ListComputeImageCapabilitySchemasRequest.Builder>() {
                    @Override
                    public ListComputeImageCapabilitySchemasRequest.Builder get() {
                        return ListComputeImageCapabilitySchemasRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<
                        ListComputeImageCapabilitySchemasResponse, String>() {
                    @Override
                    public String apply(ListComputeImageCapabilitySchemasResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListComputeImageCapabilitySchemasRequest.Builder>,
                        ListComputeImageCapabilitySchemasRequest>() {
                    @Override
                    public ListComputeImageCapabilitySchemasRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListComputeImageCapabilitySchemasRequest.Builder>
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
                        ListComputeImageCapabilitySchemasRequest,
                        ListComputeImageCapabilitySchemasResponse>() {
                    @Override
                    public ListComputeImageCapabilitySchemasResponse apply(
                            ListComputeImageCapabilitySchemasRequest request) {
                        return client.listComputeImageCapabilitySchemas(request);
                    }
                },
                new java.util.function.Function<
                        ListComputeImageCapabilitySchemasResponse,
                        java.util.List<
                                com.oracle.bmc.core.model.ComputeImageCapabilitySchemaSummary>>() {
                    @Override
                    public java.util.List<
                                    com.oracle.bmc.core.model.ComputeImageCapabilitySchemaSummary>
                            apply(ListComputeImageCapabilitySchemasResponse response) {
                        return response.getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the listConsoleHistories operation. This iterable
     * will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses received from the service.
     */
    public Iterable<ListConsoleHistoriesResponse> listConsoleHistoriesResponseIterator(
            final ListConsoleHistoriesRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListConsoleHistoriesRequest.Builder, ListConsoleHistoriesRequest,
                ListConsoleHistoriesResponse>(
                new java.util.function.Supplier<ListConsoleHistoriesRequest.Builder>() {
                    @Override
                    public ListConsoleHistoriesRequest.Builder get() {
                        return ListConsoleHistoriesRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListConsoleHistoriesResponse, String>() {
                    @Override
                    public String apply(ListConsoleHistoriesResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListConsoleHistoriesRequest.Builder>,
                        ListConsoleHistoriesRequest>() {
                    @Override
                    public ListConsoleHistoriesRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListConsoleHistoriesRequest.Builder>
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
                        ListConsoleHistoriesRequest, ListConsoleHistoriesResponse>() {
                    @Override
                    public ListConsoleHistoriesResponse apply(ListConsoleHistoriesRequest request) {
                        return client.listConsoleHistories(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link com.oracle.bmc.core.model.ConsoleHistory} objects
     * contained in responses from the listConsoleHistories operation. This iterable will fetch more data from the
     * server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link com.oracle.bmc.core.model.ConsoleHistory} objects
     * contained in responses received from the service.
     */
    public Iterable<com.oracle.bmc.core.model.ConsoleHistory> listConsoleHistoriesRecordIterator(
            final ListConsoleHistoriesRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListConsoleHistoriesRequest.Builder, ListConsoleHistoriesRequest,
                ListConsoleHistoriesResponse, com.oracle.bmc.core.model.ConsoleHistory>(
                new java.util.function.Supplier<ListConsoleHistoriesRequest.Builder>() {
                    @Override
                    public ListConsoleHistoriesRequest.Builder get() {
                        return ListConsoleHistoriesRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListConsoleHistoriesResponse, String>() {
                    @Override
                    public String apply(ListConsoleHistoriesResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListConsoleHistoriesRequest.Builder>,
                        ListConsoleHistoriesRequest>() {
                    @Override
                    public ListConsoleHistoriesRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListConsoleHistoriesRequest.Builder>
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
                        ListConsoleHistoriesRequest, ListConsoleHistoriesResponse>() {
                    @Override
                    public ListConsoleHistoriesResponse apply(ListConsoleHistoriesRequest request) {
                        return client.listConsoleHistories(request);
                    }
                },
                new java.util.function.Function<
                        ListConsoleHistoriesResponse,
                        java.util.List<com.oracle.bmc.core.model.ConsoleHistory>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.core.model.ConsoleHistory> apply(
                            ListConsoleHistoriesResponse response) {
                        return response.getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the listDedicatedVmHostInstanceShapes operation. This iterable
     * will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses received from the service.
     */
    public Iterable<ListDedicatedVmHostInstanceShapesResponse>
            listDedicatedVmHostInstanceShapesResponseIterator(
                    final ListDedicatedVmHostInstanceShapesRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListDedicatedVmHostInstanceShapesRequest.Builder,
                ListDedicatedVmHostInstanceShapesRequest,
                ListDedicatedVmHostInstanceShapesResponse>(
                new java.util.function.Supplier<
                        ListDedicatedVmHostInstanceShapesRequest.Builder>() {
                    @Override
                    public ListDedicatedVmHostInstanceShapesRequest.Builder get() {
                        return ListDedicatedVmHostInstanceShapesRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<
                        ListDedicatedVmHostInstanceShapesResponse, String>() {
                    @Override
                    public String apply(ListDedicatedVmHostInstanceShapesResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListDedicatedVmHostInstanceShapesRequest.Builder>,
                        ListDedicatedVmHostInstanceShapesRequest>() {
                    @Override
                    public ListDedicatedVmHostInstanceShapesRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListDedicatedVmHostInstanceShapesRequest.Builder>
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
                        ListDedicatedVmHostInstanceShapesRequest,
                        ListDedicatedVmHostInstanceShapesResponse>() {
                    @Override
                    public ListDedicatedVmHostInstanceShapesResponse apply(
                            ListDedicatedVmHostInstanceShapesRequest request) {
                        return client.listDedicatedVmHostInstanceShapes(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link com.oracle.bmc.core.model.DedicatedVmHostInstanceShapeSummary} objects
     * contained in responses from the listDedicatedVmHostInstanceShapes operation. This iterable will fetch more data from the
     * server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link com.oracle.bmc.core.model.DedicatedVmHostInstanceShapeSummary} objects
     * contained in responses received from the service.
     */
    public Iterable<com.oracle.bmc.core.model.DedicatedVmHostInstanceShapeSummary>
            listDedicatedVmHostInstanceShapesRecordIterator(
                    final ListDedicatedVmHostInstanceShapesRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListDedicatedVmHostInstanceShapesRequest.Builder,
                ListDedicatedVmHostInstanceShapesRequest, ListDedicatedVmHostInstanceShapesResponse,
                com.oracle.bmc.core.model.DedicatedVmHostInstanceShapeSummary>(
                new java.util.function.Supplier<
                        ListDedicatedVmHostInstanceShapesRequest.Builder>() {
                    @Override
                    public ListDedicatedVmHostInstanceShapesRequest.Builder get() {
                        return ListDedicatedVmHostInstanceShapesRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<
                        ListDedicatedVmHostInstanceShapesResponse, String>() {
                    @Override
                    public String apply(ListDedicatedVmHostInstanceShapesResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListDedicatedVmHostInstanceShapesRequest.Builder>,
                        ListDedicatedVmHostInstanceShapesRequest>() {
                    @Override
                    public ListDedicatedVmHostInstanceShapesRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListDedicatedVmHostInstanceShapesRequest.Builder>
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
                        ListDedicatedVmHostInstanceShapesRequest,
                        ListDedicatedVmHostInstanceShapesResponse>() {
                    @Override
                    public ListDedicatedVmHostInstanceShapesResponse apply(
                            ListDedicatedVmHostInstanceShapesRequest request) {
                        return client.listDedicatedVmHostInstanceShapes(request);
                    }
                },
                new java.util.function.Function<
                        ListDedicatedVmHostInstanceShapesResponse,
                        java.util.List<
                                com.oracle.bmc.core.model.DedicatedVmHostInstanceShapeSummary>>() {
                    @Override
                    public java.util.List<
                                    com.oracle.bmc.core.model.DedicatedVmHostInstanceShapeSummary>
                            apply(ListDedicatedVmHostInstanceShapesResponse response) {
                        return response.getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the listDedicatedVmHostInstances operation. This iterable
     * will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses received from the service.
     */
    public Iterable<ListDedicatedVmHostInstancesResponse>
            listDedicatedVmHostInstancesResponseIterator(
                    final ListDedicatedVmHostInstancesRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListDedicatedVmHostInstancesRequest.Builder, ListDedicatedVmHostInstancesRequest,
                ListDedicatedVmHostInstancesResponse>(
                new java.util.function.Supplier<ListDedicatedVmHostInstancesRequest.Builder>() {
                    @Override
                    public ListDedicatedVmHostInstancesRequest.Builder get() {
                        return ListDedicatedVmHostInstancesRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListDedicatedVmHostInstancesResponse, String>() {
                    @Override
                    public String apply(ListDedicatedVmHostInstancesResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListDedicatedVmHostInstancesRequest.Builder>,
                        ListDedicatedVmHostInstancesRequest>() {
                    @Override
                    public ListDedicatedVmHostInstancesRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListDedicatedVmHostInstancesRequest.Builder>
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
                        ListDedicatedVmHostInstancesRequest,
                        ListDedicatedVmHostInstancesResponse>() {
                    @Override
                    public ListDedicatedVmHostInstancesResponse apply(
                            ListDedicatedVmHostInstancesRequest request) {
                        return client.listDedicatedVmHostInstances(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link com.oracle.bmc.core.model.DedicatedVmHostInstanceSummary} objects
     * contained in responses from the listDedicatedVmHostInstances operation. This iterable will fetch more data from the
     * server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link com.oracle.bmc.core.model.DedicatedVmHostInstanceSummary} objects
     * contained in responses received from the service.
     */
    public Iterable<com.oracle.bmc.core.model.DedicatedVmHostInstanceSummary>
            listDedicatedVmHostInstancesRecordIterator(
                    final ListDedicatedVmHostInstancesRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListDedicatedVmHostInstancesRequest.Builder, ListDedicatedVmHostInstancesRequest,
                ListDedicatedVmHostInstancesResponse,
                com.oracle.bmc.core.model.DedicatedVmHostInstanceSummary>(
                new java.util.function.Supplier<ListDedicatedVmHostInstancesRequest.Builder>() {
                    @Override
                    public ListDedicatedVmHostInstancesRequest.Builder get() {
                        return ListDedicatedVmHostInstancesRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListDedicatedVmHostInstancesResponse, String>() {
                    @Override
                    public String apply(ListDedicatedVmHostInstancesResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListDedicatedVmHostInstancesRequest.Builder>,
                        ListDedicatedVmHostInstancesRequest>() {
                    @Override
                    public ListDedicatedVmHostInstancesRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListDedicatedVmHostInstancesRequest.Builder>
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
                        ListDedicatedVmHostInstancesRequest,
                        ListDedicatedVmHostInstancesResponse>() {
                    @Override
                    public ListDedicatedVmHostInstancesResponse apply(
                            ListDedicatedVmHostInstancesRequest request) {
                        return client.listDedicatedVmHostInstances(request);
                    }
                },
                new java.util.function.Function<
                        ListDedicatedVmHostInstancesResponse,
                        java.util.List<
                                com.oracle.bmc.core.model.DedicatedVmHostInstanceSummary>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.core.model.DedicatedVmHostInstanceSummary>
                            apply(ListDedicatedVmHostInstancesResponse response) {
                        return response.getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the listDedicatedVmHostShapes operation. This iterable
     * will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses received from the service.
     */
    public Iterable<ListDedicatedVmHostShapesResponse> listDedicatedVmHostShapesResponseIterator(
            final ListDedicatedVmHostShapesRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListDedicatedVmHostShapesRequest.Builder, ListDedicatedVmHostShapesRequest,
                ListDedicatedVmHostShapesResponse>(
                new java.util.function.Supplier<ListDedicatedVmHostShapesRequest.Builder>() {
                    @Override
                    public ListDedicatedVmHostShapesRequest.Builder get() {
                        return ListDedicatedVmHostShapesRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListDedicatedVmHostShapesResponse, String>() {
                    @Override
                    public String apply(ListDedicatedVmHostShapesResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListDedicatedVmHostShapesRequest.Builder>,
                        ListDedicatedVmHostShapesRequest>() {
                    @Override
                    public ListDedicatedVmHostShapesRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListDedicatedVmHostShapesRequest.Builder>
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
                        ListDedicatedVmHostShapesRequest, ListDedicatedVmHostShapesResponse>() {
                    @Override
                    public ListDedicatedVmHostShapesResponse apply(
                            ListDedicatedVmHostShapesRequest request) {
                        return client.listDedicatedVmHostShapes(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link com.oracle.bmc.core.model.DedicatedVmHostShapeSummary} objects
     * contained in responses from the listDedicatedVmHostShapes operation. This iterable will fetch more data from the
     * server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link com.oracle.bmc.core.model.DedicatedVmHostShapeSummary} objects
     * contained in responses received from the service.
     */
    public Iterable<com.oracle.bmc.core.model.DedicatedVmHostShapeSummary>
            listDedicatedVmHostShapesRecordIterator(
                    final ListDedicatedVmHostShapesRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListDedicatedVmHostShapesRequest.Builder, ListDedicatedVmHostShapesRequest,
                ListDedicatedVmHostShapesResponse,
                com.oracle.bmc.core.model.DedicatedVmHostShapeSummary>(
                new java.util.function.Supplier<ListDedicatedVmHostShapesRequest.Builder>() {
                    @Override
                    public ListDedicatedVmHostShapesRequest.Builder get() {
                        return ListDedicatedVmHostShapesRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListDedicatedVmHostShapesResponse, String>() {
                    @Override
                    public String apply(ListDedicatedVmHostShapesResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListDedicatedVmHostShapesRequest.Builder>,
                        ListDedicatedVmHostShapesRequest>() {
                    @Override
                    public ListDedicatedVmHostShapesRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListDedicatedVmHostShapesRequest.Builder>
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
                        ListDedicatedVmHostShapesRequest, ListDedicatedVmHostShapesResponse>() {
                    @Override
                    public ListDedicatedVmHostShapesResponse apply(
                            ListDedicatedVmHostShapesRequest request) {
                        return client.listDedicatedVmHostShapes(request);
                    }
                },
                new java.util.function.Function<
                        ListDedicatedVmHostShapesResponse,
                        java.util.List<com.oracle.bmc.core.model.DedicatedVmHostShapeSummary>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.core.model.DedicatedVmHostShapeSummary>
                            apply(ListDedicatedVmHostShapesResponse response) {
                        return response.getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the listDedicatedVmHosts operation. This iterable
     * will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses received from the service.
     */
    public Iterable<ListDedicatedVmHostsResponse> listDedicatedVmHostsResponseIterator(
            final ListDedicatedVmHostsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListDedicatedVmHostsRequest.Builder, ListDedicatedVmHostsRequest,
                ListDedicatedVmHostsResponse>(
                new java.util.function.Supplier<ListDedicatedVmHostsRequest.Builder>() {
                    @Override
                    public ListDedicatedVmHostsRequest.Builder get() {
                        return ListDedicatedVmHostsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListDedicatedVmHostsResponse, String>() {
                    @Override
                    public String apply(ListDedicatedVmHostsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListDedicatedVmHostsRequest.Builder>,
                        ListDedicatedVmHostsRequest>() {
                    @Override
                    public ListDedicatedVmHostsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListDedicatedVmHostsRequest.Builder>
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
                        ListDedicatedVmHostsRequest, ListDedicatedVmHostsResponse>() {
                    @Override
                    public ListDedicatedVmHostsResponse apply(ListDedicatedVmHostsRequest request) {
                        return client.listDedicatedVmHosts(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link com.oracle.bmc.core.model.DedicatedVmHostSummary} objects
     * contained in responses from the listDedicatedVmHosts operation. This iterable will fetch more data from the
     * server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link com.oracle.bmc.core.model.DedicatedVmHostSummary} objects
     * contained in responses received from the service.
     */
    public Iterable<com.oracle.bmc.core.model.DedicatedVmHostSummary>
            listDedicatedVmHostsRecordIterator(final ListDedicatedVmHostsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListDedicatedVmHostsRequest.Builder, ListDedicatedVmHostsRequest,
                ListDedicatedVmHostsResponse, com.oracle.bmc.core.model.DedicatedVmHostSummary>(
                new java.util.function.Supplier<ListDedicatedVmHostsRequest.Builder>() {
                    @Override
                    public ListDedicatedVmHostsRequest.Builder get() {
                        return ListDedicatedVmHostsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListDedicatedVmHostsResponse, String>() {
                    @Override
                    public String apply(ListDedicatedVmHostsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListDedicatedVmHostsRequest.Builder>,
                        ListDedicatedVmHostsRequest>() {
                    @Override
                    public ListDedicatedVmHostsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListDedicatedVmHostsRequest.Builder>
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
                        ListDedicatedVmHostsRequest, ListDedicatedVmHostsResponse>() {
                    @Override
                    public ListDedicatedVmHostsResponse apply(ListDedicatedVmHostsRequest request) {
                        return client.listDedicatedVmHosts(request);
                    }
                },
                new java.util.function.Function<
                        ListDedicatedVmHostsResponse,
                        java.util.List<com.oracle.bmc.core.model.DedicatedVmHostSummary>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.core.model.DedicatedVmHostSummary> apply(
                            ListDedicatedVmHostsResponse response) {
                        return response.getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the listImageShapeCompatibilityEntries operation. This iterable
     * will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses received from the service.
     */
    public Iterable<ListImageShapeCompatibilityEntriesResponse>
            listImageShapeCompatibilityEntriesResponseIterator(
                    final ListImageShapeCompatibilityEntriesRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListImageShapeCompatibilityEntriesRequest.Builder,
                ListImageShapeCompatibilityEntriesRequest,
                ListImageShapeCompatibilityEntriesResponse>(
                new java.util.function.Supplier<
                        ListImageShapeCompatibilityEntriesRequest.Builder>() {
                    @Override
                    public ListImageShapeCompatibilityEntriesRequest.Builder get() {
                        return ListImageShapeCompatibilityEntriesRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<
                        ListImageShapeCompatibilityEntriesResponse, String>() {
                    @Override
                    public String apply(ListImageShapeCompatibilityEntriesResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListImageShapeCompatibilityEntriesRequest.Builder>,
                        ListImageShapeCompatibilityEntriesRequest>() {
                    @Override
                    public ListImageShapeCompatibilityEntriesRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListImageShapeCompatibilityEntriesRequest.Builder>
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
                        ListImageShapeCompatibilityEntriesRequest,
                        ListImageShapeCompatibilityEntriesResponse>() {
                    @Override
                    public ListImageShapeCompatibilityEntriesResponse apply(
                            ListImageShapeCompatibilityEntriesRequest request) {
                        return client.listImageShapeCompatibilityEntries(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link com.oracle.bmc.core.model.ImageShapeCompatibilitySummary} objects
     * contained in responses from the listImageShapeCompatibilityEntries operation. This iterable will fetch more data from the
     * server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link com.oracle.bmc.core.model.ImageShapeCompatibilitySummary} objects
     * contained in responses received from the service.
     */
    public Iterable<com.oracle.bmc.core.model.ImageShapeCompatibilitySummary>
            listImageShapeCompatibilityEntriesRecordIterator(
                    final ListImageShapeCompatibilityEntriesRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListImageShapeCompatibilityEntriesRequest.Builder,
                ListImageShapeCompatibilityEntriesRequest,
                ListImageShapeCompatibilityEntriesResponse,
                com.oracle.bmc.core.model.ImageShapeCompatibilitySummary>(
                new java.util.function.Supplier<
                        ListImageShapeCompatibilityEntriesRequest.Builder>() {
                    @Override
                    public ListImageShapeCompatibilityEntriesRequest.Builder get() {
                        return ListImageShapeCompatibilityEntriesRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<
                        ListImageShapeCompatibilityEntriesResponse, String>() {
                    @Override
                    public String apply(ListImageShapeCompatibilityEntriesResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListImageShapeCompatibilityEntriesRequest.Builder>,
                        ListImageShapeCompatibilityEntriesRequest>() {
                    @Override
                    public ListImageShapeCompatibilityEntriesRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListImageShapeCompatibilityEntriesRequest.Builder>
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
                        ListImageShapeCompatibilityEntriesRequest,
                        ListImageShapeCompatibilityEntriesResponse>() {
                    @Override
                    public ListImageShapeCompatibilityEntriesResponse apply(
                            ListImageShapeCompatibilityEntriesRequest request) {
                        return client.listImageShapeCompatibilityEntries(request);
                    }
                },
                new java.util.function.Function<
                        ListImageShapeCompatibilityEntriesResponse,
                        java.util.List<
                                com.oracle.bmc.core.model.ImageShapeCompatibilitySummary>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.core.model.ImageShapeCompatibilitySummary>
                            apply(ListImageShapeCompatibilityEntriesResponse response) {
                        return response.getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the listImages operation. This iterable
     * will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses received from the service.
     */
    public Iterable<ListImagesResponse> listImagesResponseIterator(
            final ListImagesRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListImagesRequest.Builder, ListImagesRequest, ListImagesResponse>(
                new java.util.function.Supplier<ListImagesRequest.Builder>() {
                    @Override
                    public ListImagesRequest.Builder get() {
                        return ListImagesRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListImagesResponse, String>() {
                    @Override
                    public String apply(ListImagesResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListImagesRequest.Builder>,
                        ListImagesRequest>() {
                    @Override
                    public ListImagesRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListImagesRequest.Builder>
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
                new java.util.function.Function<ListImagesRequest, ListImagesResponse>() {
                    @Override
                    public ListImagesResponse apply(ListImagesRequest request) {
                        return client.listImages(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link com.oracle.bmc.core.model.Image} objects
     * contained in responses from the listImages operation. This iterable will fetch more data from the
     * server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link com.oracle.bmc.core.model.Image} objects
     * contained in responses received from the service.
     */
    public Iterable<com.oracle.bmc.core.model.Image> listImagesRecordIterator(
            final ListImagesRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListImagesRequest.Builder, ListImagesRequest, ListImagesResponse,
                com.oracle.bmc.core.model.Image>(
                new java.util.function.Supplier<ListImagesRequest.Builder>() {
                    @Override
                    public ListImagesRequest.Builder get() {
                        return ListImagesRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListImagesResponse, String>() {
                    @Override
                    public String apply(ListImagesResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListImagesRequest.Builder>,
                        ListImagesRequest>() {
                    @Override
                    public ListImagesRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListImagesRequest.Builder>
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
                new java.util.function.Function<ListImagesRequest, ListImagesResponse>() {
                    @Override
                    public ListImagesResponse apply(ListImagesRequest request) {
                        return client.listImages(request);
                    }
                },
                new java.util.function.Function<
                        ListImagesResponse, java.util.List<com.oracle.bmc.core.model.Image>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.core.model.Image> apply(
                            ListImagesResponse response) {
                        return response.getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the listInstanceConsoleConnections operation. This iterable
     * will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses received from the service.
     */
    public Iterable<ListInstanceConsoleConnectionsResponse>
            listInstanceConsoleConnectionsResponseIterator(
                    final ListInstanceConsoleConnectionsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListInstanceConsoleConnectionsRequest.Builder,
                ListInstanceConsoleConnectionsRequest, ListInstanceConsoleConnectionsResponse>(
                new java.util.function.Supplier<ListInstanceConsoleConnectionsRequest.Builder>() {
                    @Override
                    public ListInstanceConsoleConnectionsRequest.Builder get() {
                        return ListInstanceConsoleConnectionsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListInstanceConsoleConnectionsResponse, String>() {
                    @Override
                    public String apply(ListInstanceConsoleConnectionsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListInstanceConsoleConnectionsRequest.Builder>,
                        ListInstanceConsoleConnectionsRequest>() {
                    @Override
                    public ListInstanceConsoleConnectionsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListInstanceConsoleConnectionsRequest.Builder>
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
                        ListInstanceConsoleConnectionsRequest,
                        ListInstanceConsoleConnectionsResponse>() {
                    @Override
                    public ListInstanceConsoleConnectionsResponse apply(
                            ListInstanceConsoleConnectionsRequest request) {
                        return client.listInstanceConsoleConnections(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link com.oracle.bmc.core.model.InstanceConsoleConnection} objects
     * contained in responses from the listInstanceConsoleConnections operation. This iterable will fetch more data from the
     * server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link com.oracle.bmc.core.model.InstanceConsoleConnection} objects
     * contained in responses received from the service.
     */
    public Iterable<com.oracle.bmc.core.model.InstanceConsoleConnection>
            listInstanceConsoleConnectionsRecordIterator(
                    final ListInstanceConsoleConnectionsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListInstanceConsoleConnectionsRequest.Builder,
                ListInstanceConsoleConnectionsRequest, ListInstanceConsoleConnectionsResponse,
                com.oracle.bmc.core.model.InstanceConsoleConnection>(
                new java.util.function.Supplier<ListInstanceConsoleConnectionsRequest.Builder>() {
                    @Override
                    public ListInstanceConsoleConnectionsRequest.Builder get() {
                        return ListInstanceConsoleConnectionsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListInstanceConsoleConnectionsResponse, String>() {
                    @Override
                    public String apply(ListInstanceConsoleConnectionsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListInstanceConsoleConnectionsRequest.Builder>,
                        ListInstanceConsoleConnectionsRequest>() {
                    @Override
                    public ListInstanceConsoleConnectionsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListInstanceConsoleConnectionsRequest.Builder>
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
                        ListInstanceConsoleConnectionsRequest,
                        ListInstanceConsoleConnectionsResponse>() {
                    @Override
                    public ListInstanceConsoleConnectionsResponse apply(
                            ListInstanceConsoleConnectionsRequest request) {
                        return client.listInstanceConsoleConnections(request);
                    }
                },
                new java.util.function.Function<
                        ListInstanceConsoleConnectionsResponse,
                        java.util.List<com.oracle.bmc.core.model.InstanceConsoleConnection>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.core.model.InstanceConsoleConnection>
                            apply(ListInstanceConsoleConnectionsResponse response) {
                        return response.getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the listInstanceDevices operation. This iterable
     * will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses received from the service.
     */
    public Iterable<ListInstanceDevicesResponse> listInstanceDevicesResponseIterator(
            final ListInstanceDevicesRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListInstanceDevicesRequest.Builder, ListInstanceDevicesRequest,
                ListInstanceDevicesResponse>(
                new java.util.function.Supplier<ListInstanceDevicesRequest.Builder>() {
                    @Override
                    public ListInstanceDevicesRequest.Builder get() {
                        return ListInstanceDevicesRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListInstanceDevicesResponse, String>() {
                    @Override
                    public String apply(ListInstanceDevicesResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListInstanceDevicesRequest.Builder>,
                        ListInstanceDevicesRequest>() {
                    @Override
                    public ListInstanceDevicesRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListInstanceDevicesRequest.Builder>
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
                        ListInstanceDevicesRequest, ListInstanceDevicesResponse>() {
                    @Override
                    public ListInstanceDevicesResponse apply(ListInstanceDevicesRequest request) {
                        return client.listInstanceDevices(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link com.oracle.bmc.core.model.Device} objects
     * contained in responses from the listInstanceDevices operation. This iterable will fetch more data from the
     * server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link com.oracle.bmc.core.model.Device} objects
     * contained in responses received from the service.
     */
    public Iterable<com.oracle.bmc.core.model.Device> listInstanceDevicesRecordIterator(
            final ListInstanceDevicesRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListInstanceDevicesRequest.Builder, ListInstanceDevicesRequest,
                ListInstanceDevicesResponse, com.oracle.bmc.core.model.Device>(
                new java.util.function.Supplier<ListInstanceDevicesRequest.Builder>() {
                    @Override
                    public ListInstanceDevicesRequest.Builder get() {
                        return ListInstanceDevicesRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListInstanceDevicesResponse, String>() {
                    @Override
                    public String apply(ListInstanceDevicesResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListInstanceDevicesRequest.Builder>,
                        ListInstanceDevicesRequest>() {
                    @Override
                    public ListInstanceDevicesRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListInstanceDevicesRequest.Builder>
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
                        ListInstanceDevicesRequest, ListInstanceDevicesResponse>() {
                    @Override
                    public ListInstanceDevicesResponse apply(ListInstanceDevicesRequest request) {
                        return client.listInstanceDevices(request);
                    }
                },
                new java.util.function.Function<
                        ListInstanceDevicesResponse,
                        java.util.List<com.oracle.bmc.core.model.Device>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.core.model.Device> apply(
                            ListInstanceDevicesResponse response) {
                        return response.getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the listInstanceMaintenanceEvents operation. This iterable
     * will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses received from the service.
     */
    public Iterable<ListInstanceMaintenanceEventsResponse>
            listInstanceMaintenanceEventsResponseIterator(
                    final ListInstanceMaintenanceEventsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListInstanceMaintenanceEventsRequest.Builder, ListInstanceMaintenanceEventsRequest,
                ListInstanceMaintenanceEventsResponse>(
                new java.util.function.Supplier<ListInstanceMaintenanceEventsRequest.Builder>() {
                    @Override
                    public ListInstanceMaintenanceEventsRequest.Builder get() {
                        return ListInstanceMaintenanceEventsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListInstanceMaintenanceEventsResponse, String>() {
                    @Override
                    public String apply(ListInstanceMaintenanceEventsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListInstanceMaintenanceEventsRequest.Builder>,
                        ListInstanceMaintenanceEventsRequest>() {
                    @Override
                    public ListInstanceMaintenanceEventsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListInstanceMaintenanceEventsRequest.Builder>
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
                        ListInstanceMaintenanceEventsRequest,
                        ListInstanceMaintenanceEventsResponse>() {
                    @Override
                    public ListInstanceMaintenanceEventsResponse apply(
                            ListInstanceMaintenanceEventsRequest request) {
                        return client.listInstanceMaintenanceEvents(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link com.oracle.bmc.core.model.InstanceMaintenanceEventSummary} objects
     * contained in responses from the listInstanceMaintenanceEvents operation. This iterable will fetch more data from the
     * server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link com.oracle.bmc.core.model.InstanceMaintenanceEventSummary} objects
     * contained in responses received from the service.
     */
    public Iterable<com.oracle.bmc.core.model.InstanceMaintenanceEventSummary>
            listInstanceMaintenanceEventsRecordIterator(
                    final ListInstanceMaintenanceEventsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListInstanceMaintenanceEventsRequest.Builder, ListInstanceMaintenanceEventsRequest,
                ListInstanceMaintenanceEventsResponse,
                com.oracle.bmc.core.model.InstanceMaintenanceEventSummary>(
                new java.util.function.Supplier<ListInstanceMaintenanceEventsRequest.Builder>() {
                    @Override
                    public ListInstanceMaintenanceEventsRequest.Builder get() {
                        return ListInstanceMaintenanceEventsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListInstanceMaintenanceEventsResponse, String>() {
                    @Override
                    public String apply(ListInstanceMaintenanceEventsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListInstanceMaintenanceEventsRequest.Builder>,
                        ListInstanceMaintenanceEventsRequest>() {
                    @Override
                    public ListInstanceMaintenanceEventsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListInstanceMaintenanceEventsRequest.Builder>
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
                        ListInstanceMaintenanceEventsRequest,
                        ListInstanceMaintenanceEventsResponse>() {
                    @Override
                    public ListInstanceMaintenanceEventsResponse apply(
                            ListInstanceMaintenanceEventsRequest request) {
                        return client.listInstanceMaintenanceEvents(request);
                    }
                },
                new java.util.function.Function<
                        ListInstanceMaintenanceEventsResponse,
                        java.util.List<
                                com.oracle.bmc.core.model.InstanceMaintenanceEventSummary>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.core.model.InstanceMaintenanceEventSummary>
                            apply(ListInstanceMaintenanceEventsResponse response) {
                        return response.getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the listInstances operation. This iterable
     * will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses received from the service.
     */
    public Iterable<ListInstancesResponse> listInstancesResponseIterator(
            final ListInstancesRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListInstancesRequest.Builder, ListInstancesRequest, ListInstancesResponse>(
                new java.util.function.Supplier<ListInstancesRequest.Builder>() {
                    @Override
                    public ListInstancesRequest.Builder get() {
                        return ListInstancesRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListInstancesResponse, String>() {
                    @Override
                    public String apply(ListInstancesResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListInstancesRequest.Builder>,
                        ListInstancesRequest>() {
                    @Override
                    public ListInstancesRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListInstancesRequest.Builder>
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
                new java.util.function.Function<ListInstancesRequest, ListInstancesResponse>() {
                    @Override
                    public ListInstancesResponse apply(ListInstancesRequest request) {
                        return client.listInstances(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link com.oracle.bmc.core.model.Instance} objects
     * contained in responses from the listInstances operation. This iterable will fetch more data from the
     * server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link com.oracle.bmc.core.model.Instance} objects
     * contained in responses received from the service.
     */
    public Iterable<com.oracle.bmc.core.model.Instance> listInstancesRecordIterator(
            final ListInstancesRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListInstancesRequest.Builder, ListInstancesRequest, ListInstancesResponse,
                com.oracle.bmc.core.model.Instance>(
                new java.util.function.Supplier<ListInstancesRequest.Builder>() {
                    @Override
                    public ListInstancesRequest.Builder get() {
                        return ListInstancesRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListInstancesResponse, String>() {
                    @Override
                    public String apply(ListInstancesResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListInstancesRequest.Builder>,
                        ListInstancesRequest>() {
                    @Override
                    public ListInstancesRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListInstancesRequest.Builder>
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
                new java.util.function.Function<ListInstancesRequest, ListInstancesResponse>() {
                    @Override
                    public ListInstancesResponse apply(ListInstancesRequest request) {
                        return client.listInstances(request);
                    }
                },
                new java.util.function.Function<
                        ListInstancesResponse,
                        java.util.List<com.oracle.bmc.core.model.Instance>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.core.model.Instance> apply(
                            ListInstancesResponse response) {
                        return response.getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the listShapes operation. This iterable
     * will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses received from the service.
     */
    public Iterable<ListShapesResponse> listShapesResponseIterator(
            final ListShapesRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListShapesRequest.Builder, ListShapesRequest, ListShapesResponse>(
                new java.util.function.Supplier<ListShapesRequest.Builder>() {
                    @Override
                    public ListShapesRequest.Builder get() {
                        return ListShapesRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListShapesResponse, String>() {
                    @Override
                    public String apply(ListShapesResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListShapesRequest.Builder>,
                        ListShapesRequest>() {
                    @Override
                    public ListShapesRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListShapesRequest.Builder>
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
                new java.util.function.Function<ListShapesRequest, ListShapesResponse>() {
                    @Override
                    public ListShapesResponse apply(ListShapesRequest request) {
                        return client.listShapes(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link com.oracle.bmc.core.model.Shape} objects
     * contained in responses from the listShapes operation. This iterable will fetch more data from the
     * server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link com.oracle.bmc.core.model.Shape} objects
     * contained in responses received from the service.
     */
    public Iterable<com.oracle.bmc.core.model.Shape> listShapesRecordIterator(
            final ListShapesRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListShapesRequest.Builder, ListShapesRequest, ListShapesResponse,
                com.oracle.bmc.core.model.Shape>(
                new java.util.function.Supplier<ListShapesRequest.Builder>() {
                    @Override
                    public ListShapesRequest.Builder get() {
                        return ListShapesRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListShapesResponse, String>() {
                    @Override
                    public String apply(ListShapesResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListShapesRequest.Builder>,
                        ListShapesRequest>() {
                    @Override
                    public ListShapesRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListShapesRequest.Builder>
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
                new java.util.function.Function<ListShapesRequest, ListShapesResponse>() {
                    @Override
                    public ListShapesResponse apply(ListShapesRequest request) {
                        return client.listShapes(request);
                    }
                },
                new java.util.function.Function<
                        ListShapesResponse, java.util.List<com.oracle.bmc.core.model.Shape>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.core.model.Shape> apply(
                            ListShapesResponse response) {
                        return response.getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the listVnicAttachments operation. This iterable
     * will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses received from the service.
     */
    public Iterable<ListVnicAttachmentsResponse> listVnicAttachmentsResponseIterator(
            final ListVnicAttachmentsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListVnicAttachmentsRequest.Builder, ListVnicAttachmentsRequest,
                ListVnicAttachmentsResponse>(
                new java.util.function.Supplier<ListVnicAttachmentsRequest.Builder>() {
                    @Override
                    public ListVnicAttachmentsRequest.Builder get() {
                        return ListVnicAttachmentsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListVnicAttachmentsResponse, String>() {
                    @Override
                    public String apply(ListVnicAttachmentsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListVnicAttachmentsRequest.Builder>,
                        ListVnicAttachmentsRequest>() {
                    @Override
                    public ListVnicAttachmentsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListVnicAttachmentsRequest.Builder>
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
                        ListVnicAttachmentsRequest, ListVnicAttachmentsResponse>() {
                    @Override
                    public ListVnicAttachmentsResponse apply(ListVnicAttachmentsRequest request) {
                        return client.listVnicAttachments(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link com.oracle.bmc.core.model.VnicAttachment} objects
     * contained in responses from the listVnicAttachments operation. This iterable will fetch more data from the
     * server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link com.oracle.bmc.core.model.VnicAttachment} objects
     * contained in responses received from the service.
     */
    public Iterable<com.oracle.bmc.core.model.VnicAttachment> listVnicAttachmentsRecordIterator(
            final ListVnicAttachmentsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListVnicAttachmentsRequest.Builder, ListVnicAttachmentsRequest,
                ListVnicAttachmentsResponse, com.oracle.bmc.core.model.VnicAttachment>(
                new java.util.function.Supplier<ListVnicAttachmentsRequest.Builder>() {
                    @Override
                    public ListVnicAttachmentsRequest.Builder get() {
                        return ListVnicAttachmentsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListVnicAttachmentsResponse, String>() {
                    @Override
                    public String apply(ListVnicAttachmentsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListVnicAttachmentsRequest.Builder>,
                        ListVnicAttachmentsRequest>() {
                    @Override
                    public ListVnicAttachmentsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListVnicAttachmentsRequest.Builder>
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
                        ListVnicAttachmentsRequest, ListVnicAttachmentsResponse>() {
                    @Override
                    public ListVnicAttachmentsResponse apply(ListVnicAttachmentsRequest request) {
                        return client.listVnicAttachments(request);
                    }
                },
                new java.util.function.Function<
                        ListVnicAttachmentsResponse,
                        java.util.List<com.oracle.bmc.core.model.VnicAttachment>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.core.model.VnicAttachment> apply(
                            ListVnicAttachmentsResponse response) {
                        return response.getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the listVolumeAttachments operation. This iterable
     * will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses received from the service.
     */
    public Iterable<ListVolumeAttachmentsResponse> listVolumeAttachmentsResponseIterator(
            final ListVolumeAttachmentsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListVolumeAttachmentsRequest.Builder, ListVolumeAttachmentsRequest,
                ListVolumeAttachmentsResponse>(
                new java.util.function.Supplier<ListVolumeAttachmentsRequest.Builder>() {
                    @Override
                    public ListVolumeAttachmentsRequest.Builder get() {
                        return ListVolumeAttachmentsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListVolumeAttachmentsResponse, String>() {
                    @Override
                    public String apply(ListVolumeAttachmentsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListVolumeAttachmentsRequest.Builder>,
                        ListVolumeAttachmentsRequest>() {
                    @Override
                    public ListVolumeAttachmentsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListVolumeAttachmentsRequest.Builder>
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
                        ListVolumeAttachmentsRequest, ListVolumeAttachmentsResponse>() {
                    @Override
                    public ListVolumeAttachmentsResponse apply(
                            ListVolumeAttachmentsRequest request) {
                        return client.listVolumeAttachments(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link com.oracle.bmc.core.model.VolumeAttachment} objects
     * contained in responses from the listVolumeAttachments operation. This iterable will fetch more data from the
     * server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link com.oracle.bmc.core.model.VolumeAttachment} objects
     * contained in responses received from the service.
     */
    public Iterable<com.oracle.bmc.core.model.VolumeAttachment> listVolumeAttachmentsRecordIterator(
            final ListVolumeAttachmentsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListVolumeAttachmentsRequest.Builder, ListVolumeAttachmentsRequest,
                ListVolumeAttachmentsResponse, com.oracle.bmc.core.model.VolumeAttachment>(
                new java.util.function.Supplier<ListVolumeAttachmentsRequest.Builder>() {
                    @Override
                    public ListVolumeAttachmentsRequest.Builder get() {
                        return ListVolumeAttachmentsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListVolumeAttachmentsResponse, String>() {
                    @Override
                    public String apply(ListVolumeAttachmentsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListVolumeAttachmentsRequest.Builder>,
                        ListVolumeAttachmentsRequest>() {
                    @Override
                    public ListVolumeAttachmentsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListVolumeAttachmentsRequest.Builder>
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
                        ListVolumeAttachmentsRequest, ListVolumeAttachmentsResponse>() {
                    @Override
                    public ListVolumeAttachmentsResponse apply(
                            ListVolumeAttachmentsRequest request) {
                        return client.listVolumeAttachments(request);
                    }
                },
                new java.util.function.Function<
                        ListVolumeAttachmentsResponse,
                        java.util.List<com.oracle.bmc.core.model.VolumeAttachment>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.core.model.VolumeAttachment> apply(
                            ListVolumeAttachmentsResponse response) {
                        return response.getItems();
                    }
                });
    }
}

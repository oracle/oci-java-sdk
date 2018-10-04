/**
 * Copyright (c) 2016, 2018, Oracle and/or its affiliates. All rights reserved.
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
@lombok.RequiredArgsConstructor
public class ComputePaginators {
    private final Compute client;

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
                new com.google.common.base.Supplier<
                        ListAppCatalogListingResourceVersionsRequest.Builder>() {
                    @Override
                    public ListAppCatalogListingResourceVersionsRequest.Builder get() {
                        return ListAppCatalogListingResourceVersionsRequest.builder().copy(request);
                    }
                },
                new com.google.common.base.Function<
                        ListAppCatalogListingResourceVersionsResponse, String>() {
                    @Override
                    public String apply(ListAppCatalogListingResourceVersionsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new com.google.common.base.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListAppCatalogListingResourceVersionsRequest.Builder>,
                        ListAppCatalogListingResourceVersionsRequest>() {
                    @Override
                    public ListAppCatalogListingResourceVersionsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListAppCatalogListingResourceVersionsRequest.Builder>
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
                new com.google.common.base.Supplier<
                        ListAppCatalogListingResourceVersionsRequest.Builder>() {
                    @Override
                    public ListAppCatalogListingResourceVersionsRequest.Builder get() {
                        return ListAppCatalogListingResourceVersionsRequest.builder().copy(request);
                    }
                },
                new com.google.common.base.Function<
                        ListAppCatalogListingResourceVersionsResponse, String>() {
                    @Override
                    public String apply(ListAppCatalogListingResourceVersionsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new com.google.common.base.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListAppCatalogListingResourceVersionsRequest.Builder>,
                        ListAppCatalogListingResourceVersionsRequest>() {
                    @Override
                    public ListAppCatalogListingResourceVersionsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListAppCatalogListingResourceVersionsRequest.Builder>
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
                        ListAppCatalogListingResourceVersionsRequest,
                        ListAppCatalogListingResourceVersionsResponse>() {
                    @Override
                    public ListAppCatalogListingResourceVersionsResponse apply(
                            ListAppCatalogListingResourceVersionsRequest request) {
                        return client.listAppCatalogListingResourceVersions(request);
                    }
                },
                new com.google.common.base.Function<
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
                new com.google.common.base.Supplier<ListAppCatalogListingsRequest.Builder>() {
                    @Override
                    public ListAppCatalogListingsRequest.Builder get() {
                        return ListAppCatalogListingsRequest.builder().copy(request);
                    }
                },
                new com.google.common.base.Function<ListAppCatalogListingsResponse, String>() {
                    @Override
                    public String apply(ListAppCatalogListingsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new com.google.common.base.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListAppCatalogListingsRequest.Builder>,
                        ListAppCatalogListingsRequest>() {
                    @Override
                    public ListAppCatalogListingsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListAppCatalogListingsRequest.Builder>
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
                new com.google.common.base.Supplier<ListAppCatalogListingsRequest.Builder>() {
                    @Override
                    public ListAppCatalogListingsRequest.Builder get() {
                        return ListAppCatalogListingsRequest.builder().copy(request);
                    }
                },
                new com.google.common.base.Function<ListAppCatalogListingsResponse, String>() {
                    @Override
                    public String apply(ListAppCatalogListingsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new com.google.common.base.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListAppCatalogListingsRequest.Builder>,
                        ListAppCatalogListingsRequest>() {
                    @Override
                    public ListAppCatalogListingsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListAppCatalogListingsRequest.Builder>
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
                        ListAppCatalogListingsRequest, ListAppCatalogListingsResponse>() {
                    @Override
                    public ListAppCatalogListingsResponse apply(
                            ListAppCatalogListingsRequest request) {
                        return client.listAppCatalogListings(request);
                    }
                },
                new com.google.common.base.Function<
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
                new com.google.common.base.Supplier<ListAppCatalogSubscriptionsRequest.Builder>() {
                    @Override
                    public ListAppCatalogSubscriptionsRequest.Builder get() {
                        return ListAppCatalogSubscriptionsRequest.builder().copy(request);
                    }
                },
                new com.google.common.base.Function<ListAppCatalogSubscriptionsResponse, String>() {
                    @Override
                    public String apply(ListAppCatalogSubscriptionsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new com.google.common.base.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListAppCatalogSubscriptionsRequest.Builder>,
                        ListAppCatalogSubscriptionsRequest>() {
                    @Override
                    public ListAppCatalogSubscriptionsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListAppCatalogSubscriptionsRequest.Builder>
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
                new com.google.common.base.Supplier<ListAppCatalogSubscriptionsRequest.Builder>() {
                    @Override
                    public ListAppCatalogSubscriptionsRequest.Builder get() {
                        return ListAppCatalogSubscriptionsRequest.builder().copy(request);
                    }
                },
                new com.google.common.base.Function<ListAppCatalogSubscriptionsResponse, String>() {
                    @Override
                    public String apply(ListAppCatalogSubscriptionsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new com.google.common.base.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListAppCatalogSubscriptionsRequest.Builder>,
                        ListAppCatalogSubscriptionsRequest>() {
                    @Override
                    public ListAppCatalogSubscriptionsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListAppCatalogSubscriptionsRequest.Builder>
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
                        ListAppCatalogSubscriptionsRequest, ListAppCatalogSubscriptionsResponse>() {
                    @Override
                    public ListAppCatalogSubscriptionsResponse apply(
                            ListAppCatalogSubscriptionsRequest request) {
                        return client.listAppCatalogSubscriptions(request);
                    }
                },
                new com.google.common.base.Function<
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
                new com.google.common.base.Supplier<ListBootVolumeAttachmentsRequest.Builder>() {
                    @Override
                    public ListBootVolumeAttachmentsRequest.Builder get() {
                        return ListBootVolumeAttachmentsRequest.builder().copy(request);
                    }
                },
                new com.google.common.base.Function<ListBootVolumeAttachmentsResponse, String>() {
                    @Override
                    public String apply(ListBootVolumeAttachmentsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new com.google.common.base.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListBootVolumeAttachmentsRequest.Builder>,
                        ListBootVolumeAttachmentsRequest>() {
                    @Override
                    public ListBootVolumeAttachmentsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListBootVolumeAttachmentsRequest.Builder>
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
                new com.google.common.base.Supplier<ListBootVolumeAttachmentsRequest.Builder>() {
                    @Override
                    public ListBootVolumeAttachmentsRequest.Builder get() {
                        return ListBootVolumeAttachmentsRequest.builder().copy(request);
                    }
                },
                new com.google.common.base.Function<ListBootVolumeAttachmentsResponse, String>() {
                    @Override
                    public String apply(ListBootVolumeAttachmentsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new com.google.common.base.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListBootVolumeAttachmentsRequest.Builder>,
                        ListBootVolumeAttachmentsRequest>() {
                    @Override
                    public ListBootVolumeAttachmentsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListBootVolumeAttachmentsRequest.Builder>
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
                        ListBootVolumeAttachmentsRequest, ListBootVolumeAttachmentsResponse>() {
                    @Override
                    public ListBootVolumeAttachmentsResponse apply(
                            ListBootVolumeAttachmentsRequest request) {
                        return client.listBootVolumeAttachments(request);
                    }
                },
                new com.google.common.base.Function<
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
                new com.google.common.base.Supplier<ListConsoleHistoriesRequest.Builder>() {
                    @Override
                    public ListConsoleHistoriesRequest.Builder get() {
                        return ListConsoleHistoriesRequest.builder().copy(request);
                    }
                },
                new com.google.common.base.Function<ListConsoleHistoriesResponse, String>() {
                    @Override
                    public String apply(ListConsoleHistoriesResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new com.google.common.base.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListConsoleHistoriesRequest.Builder>,
                        ListConsoleHistoriesRequest>() {
                    @Override
                    public ListConsoleHistoriesRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListConsoleHistoriesRequest.Builder>
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
                new com.google.common.base.Supplier<ListConsoleHistoriesRequest.Builder>() {
                    @Override
                    public ListConsoleHistoriesRequest.Builder get() {
                        return ListConsoleHistoriesRequest.builder().copy(request);
                    }
                },
                new com.google.common.base.Function<ListConsoleHistoriesResponse, String>() {
                    @Override
                    public String apply(ListConsoleHistoriesResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new com.google.common.base.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListConsoleHistoriesRequest.Builder>,
                        ListConsoleHistoriesRequest>() {
                    @Override
                    public ListConsoleHistoriesRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListConsoleHistoriesRequest.Builder>
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
                        ListConsoleHistoriesRequest, ListConsoleHistoriesResponse>() {
                    @Override
                    public ListConsoleHistoriesResponse apply(ListConsoleHistoriesRequest request) {
                        return client.listConsoleHistories(request);
                    }
                },
                new com.google.common.base.Function<
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
                new com.google.common.base.Supplier<ListImagesRequest.Builder>() {
                    @Override
                    public ListImagesRequest.Builder get() {
                        return ListImagesRequest.builder().copy(request);
                    }
                },
                new com.google.common.base.Function<ListImagesResponse, String>() {
                    @Override
                    public String apply(ListImagesResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new com.google.common.base.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListImagesRequest.Builder>,
                        ListImagesRequest>() {
                    @Override
                    public ListImagesRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListImagesRequest.Builder>
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
                new com.google.common.base.Function<ListImagesRequest, ListImagesResponse>() {
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
                new com.google.common.base.Supplier<ListImagesRequest.Builder>() {
                    @Override
                    public ListImagesRequest.Builder get() {
                        return ListImagesRequest.builder().copy(request);
                    }
                },
                new com.google.common.base.Function<ListImagesResponse, String>() {
                    @Override
                    public String apply(ListImagesResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new com.google.common.base.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListImagesRequest.Builder>,
                        ListImagesRequest>() {
                    @Override
                    public ListImagesRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListImagesRequest.Builder>
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
                new com.google.common.base.Function<ListImagesRequest, ListImagesResponse>() {
                    @Override
                    public ListImagesResponse apply(ListImagesRequest request) {
                        return client.listImages(request);
                    }
                },
                new com.google.common.base.Function<
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
                new com.google.common.base.Supplier<
                        ListInstanceConsoleConnectionsRequest.Builder>() {
                    @Override
                    public ListInstanceConsoleConnectionsRequest.Builder get() {
                        return ListInstanceConsoleConnectionsRequest.builder().copy(request);
                    }
                },
                new com.google.common.base.Function<
                        ListInstanceConsoleConnectionsResponse, String>() {
                    @Override
                    public String apply(ListInstanceConsoleConnectionsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new com.google.common.base.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListInstanceConsoleConnectionsRequest.Builder>,
                        ListInstanceConsoleConnectionsRequest>() {
                    @Override
                    public ListInstanceConsoleConnectionsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListInstanceConsoleConnectionsRequest.Builder>
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
                new com.google.common.base.Supplier<
                        ListInstanceConsoleConnectionsRequest.Builder>() {
                    @Override
                    public ListInstanceConsoleConnectionsRequest.Builder get() {
                        return ListInstanceConsoleConnectionsRequest.builder().copy(request);
                    }
                },
                new com.google.common.base.Function<
                        ListInstanceConsoleConnectionsResponse, String>() {
                    @Override
                    public String apply(ListInstanceConsoleConnectionsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new com.google.common.base.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListInstanceConsoleConnectionsRequest.Builder>,
                        ListInstanceConsoleConnectionsRequest>() {
                    @Override
                    public ListInstanceConsoleConnectionsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListInstanceConsoleConnectionsRequest.Builder>
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
                        ListInstanceConsoleConnectionsRequest,
                        ListInstanceConsoleConnectionsResponse>() {
                    @Override
                    public ListInstanceConsoleConnectionsResponse apply(
                            ListInstanceConsoleConnectionsRequest request) {
                        return client.listInstanceConsoleConnections(request);
                    }
                },
                new com.google.common.base.Function<
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
                new com.google.common.base.Supplier<ListInstancesRequest.Builder>() {
                    @Override
                    public ListInstancesRequest.Builder get() {
                        return ListInstancesRequest.builder().copy(request);
                    }
                },
                new com.google.common.base.Function<ListInstancesResponse, String>() {
                    @Override
                    public String apply(ListInstancesResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new com.google.common.base.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListInstancesRequest.Builder>,
                        ListInstancesRequest>() {
                    @Override
                    public ListInstancesRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListInstancesRequest.Builder>
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
                new com.google.common.base.Function<ListInstancesRequest, ListInstancesResponse>() {
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
                new com.google.common.base.Supplier<ListInstancesRequest.Builder>() {
                    @Override
                    public ListInstancesRequest.Builder get() {
                        return ListInstancesRequest.builder().copy(request);
                    }
                },
                new com.google.common.base.Function<ListInstancesResponse, String>() {
                    @Override
                    public String apply(ListInstancesResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new com.google.common.base.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListInstancesRequest.Builder>,
                        ListInstancesRequest>() {
                    @Override
                    public ListInstancesRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListInstancesRequest.Builder>
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
                new com.google.common.base.Function<ListInstancesRequest, ListInstancesResponse>() {
                    @Override
                    public ListInstancesResponse apply(ListInstancesRequest request) {
                        return client.listInstances(request);
                    }
                },
                new com.google.common.base.Function<
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
                new com.google.common.base.Supplier<ListShapesRequest.Builder>() {
                    @Override
                    public ListShapesRequest.Builder get() {
                        return ListShapesRequest.builder().copy(request);
                    }
                },
                new com.google.common.base.Function<ListShapesResponse, String>() {
                    @Override
                    public String apply(ListShapesResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new com.google.common.base.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListShapesRequest.Builder>,
                        ListShapesRequest>() {
                    @Override
                    public ListShapesRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListShapesRequest.Builder>
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
                new com.google.common.base.Function<ListShapesRequest, ListShapesResponse>() {
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
                new com.google.common.base.Supplier<ListShapesRequest.Builder>() {
                    @Override
                    public ListShapesRequest.Builder get() {
                        return ListShapesRequest.builder().copy(request);
                    }
                },
                new com.google.common.base.Function<ListShapesResponse, String>() {
                    @Override
                    public String apply(ListShapesResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new com.google.common.base.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListShapesRequest.Builder>,
                        ListShapesRequest>() {
                    @Override
                    public ListShapesRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListShapesRequest.Builder>
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
                new com.google.common.base.Function<ListShapesRequest, ListShapesResponse>() {
                    @Override
                    public ListShapesResponse apply(ListShapesRequest request) {
                        return client.listShapes(request);
                    }
                },
                new com.google.common.base.Function<
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
                new com.google.common.base.Supplier<ListVnicAttachmentsRequest.Builder>() {
                    @Override
                    public ListVnicAttachmentsRequest.Builder get() {
                        return ListVnicAttachmentsRequest.builder().copy(request);
                    }
                },
                new com.google.common.base.Function<ListVnicAttachmentsResponse, String>() {
                    @Override
                    public String apply(ListVnicAttachmentsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new com.google.common.base.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListVnicAttachmentsRequest.Builder>,
                        ListVnicAttachmentsRequest>() {
                    @Override
                    public ListVnicAttachmentsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListVnicAttachmentsRequest.Builder>
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
                new com.google.common.base.Supplier<ListVnicAttachmentsRequest.Builder>() {
                    @Override
                    public ListVnicAttachmentsRequest.Builder get() {
                        return ListVnicAttachmentsRequest.builder().copy(request);
                    }
                },
                new com.google.common.base.Function<ListVnicAttachmentsResponse, String>() {
                    @Override
                    public String apply(ListVnicAttachmentsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new com.google.common.base.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListVnicAttachmentsRequest.Builder>,
                        ListVnicAttachmentsRequest>() {
                    @Override
                    public ListVnicAttachmentsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListVnicAttachmentsRequest.Builder>
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
                        ListVnicAttachmentsRequest, ListVnicAttachmentsResponse>() {
                    @Override
                    public ListVnicAttachmentsResponse apply(ListVnicAttachmentsRequest request) {
                        return client.listVnicAttachments(request);
                    }
                },
                new com.google.common.base.Function<
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
                new com.google.common.base.Supplier<ListVolumeAttachmentsRequest.Builder>() {
                    @Override
                    public ListVolumeAttachmentsRequest.Builder get() {
                        return ListVolumeAttachmentsRequest.builder().copy(request);
                    }
                },
                new com.google.common.base.Function<ListVolumeAttachmentsResponse, String>() {
                    @Override
                    public String apply(ListVolumeAttachmentsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new com.google.common.base.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListVolumeAttachmentsRequest.Builder>,
                        ListVolumeAttachmentsRequest>() {
                    @Override
                    public ListVolumeAttachmentsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListVolumeAttachmentsRequest.Builder>
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
                new com.google.common.base.Supplier<ListVolumeAttachmentsRequest.Builder>() {
                    @Override
                    public ListVolumeAttachmentsRequest.Builder get() {
                        return ListVolumeAttachmentsRequest.builder().copy(request);
                    }
                },
                new com.google.common.base.Function<ListVolumeAttachmentsResponse, String>() {
                    @Override
                    public String apply(ListVolumeAttachmentsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new com.google.common.base.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListVolumeAttachmentsRequest.Builder>,
                        ListVolumeAttachmentsRequest>() {
                    @Override
                    public ListVolumeAttachmentsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListVolumeAttachmentsRequest.Builder>
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
                        ListVolumeAttachmentsRequest, ListVolumeAttachmentsResponse>() {
                    @Override
                    public ListVolumeAttachmentsResponse apply(
                            ListVolumeAttachmentsRequest request) {
                        return client.listVolumeAttachments(request);
                    }
                },
                new com.google.common.base.Function<
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
